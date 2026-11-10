package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.SystemRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.SysCacheUtilRuntimeBase;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevUserDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnUserService;
import net.ibizsys.modeling.core.security.PSDevUserCacheCodec.Entry;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

class SystemAccessManagerJsonCacheTest {
    private Authentication previousAuthentication;
    private IUserContext previousUserContext;
    private AuthenticationUser authentication;

    private static final class Read {
        final String category;
        final String key;

        Read(String category, String key) {
            this.category = category;
            this.key = key;
        }
    }

    private static final class Write {
        final String key;
        final int ttl;

        Write(String key, int ttl) {
            this.key = key;
            this.ttl = ttl;
        }
    }

    // Only string I/O is substituted; typed cache calls use production JSON serialization.
    private static final class JsonCache extends SysCacheUtilRuntimeBase {
        final SystemRuntime runtime;
        final Map<String, Map<String, String>> storage = new HashMap<>();
        final List<Read> reads = new ArrayList<>();
        final List<Write> writes = new ArrayList<>();

        JsonCache(SystemRuntime runtime) {
            this.runtime = runtime;
        }

        @Override
        public ISystemRuntime getSystemRuntime() {
            return runtime;
        }

        @Override
        public String getName() {
            return "authorization-json-cache";
        }

        @Override
        protected String onGet(String category, String key) {
            reads.add(new Read(category, key));
            return peek(category, key);
        }

        @Override
        protected void onSet(String category, String key, String json, int ttl) {
            seedJson(category, key, json);
            writes.add(new Write(key, ttl));
        }

        void seedJson(String category, String key, String json) {
            storage.computeIfAbsent(category, unused -> new HashMap<>()).put(key, json);
        }

        String peek(String category, String key) {
            return storage.getOrDefault(category, Map.of()).get(key);
        }

        void clearObservations() {
            reads.clear();
            writes.clear();
        }
    }

    private static final class Manager extends SystemAccessManagerBase {
        private final SystemRuntime runtime;
        boolean wxmpRole;
        AppData baseAppData;

        Manager(SystemRuntime runtime, JsonCache cache) {
            this.runtime = runtime;
            setSysCacheUtilRuntime(cache);
        }

        @Override
        public ISystemRuntime getSystemRuntime() {
            return runtime;
        }

        @Override
        public boolean testSysUserRole(IEmployeeContext context, String role) {
            assertEquals(USERROLE_WXMP_USERS, role);
            return wxmpRole;
        }

        @Override
        protected AppData onGetAppData(AppData appData, String systemTag, String orgId) {
            assertNull(appData);
            assertEquals("application-a", systemTag);
            assertEquals("organization-a", orgId);
            return baseAppData;
        }

        String centerKey() {
            return getPSDevUserKey();
        }

        String targetKey(String type) {
            return getPSDevUserKey(type, root(type));
        }

        IPSDevUser freshCenter() throws Throwable {
            return getPSDevUser(new AppData());
        }
    }

    private final class Fixture {
        final SystemRuntime runtime = new SystemRuntime() {
            @Override
            public IDataEntityRuntime getDataEntityRuntime(String name, boolean tryMode) {
                assertEquals("PSDEVUSER", name);
                return centerRuntime;
            }
        };
        final JsonCache cache = new JsonCache(runtime);
        final Manager manager = new Manager(runtime, cache);
        final PSDevSlnSysDTO system = new PSDevSlnSysDTO();
        final PSDevSlnDTO scheme = new PSDevSlnDTO();
        final List<PSDevSlnUserDTO> grants = new ArrayList<>();
        final IDataEntityRuntime centerRuntime;
        PSDevUserDTO centerRow;
        int systemReads;
        int schemeReads;
        int membershipReads;
        int centerReads;

        Fixture() throws Exception {
            system.setPSDevSlnSysId("library-a");
            system.setPSDevSlnId("scheme-a");
            system.setPSDevCenterId("center-a");
            system.setPSSystemId("model-a");
            system.setPSDevSlnSysName("Library A");
            system.setCodeName("library_a");
            system.setLogicName("Library logic");
            system.setPSSysModelInstId("instance-a");
            system.setModelInstVer(7);
            system.set("activemodelinstver", 6);
            system.setExpriedTime(deadline(240000));
            scheme.setPSDevSlnId("scheme-a");
            scheme.setPSDevCenterId("center-a");
            scheme.setAdminPSDevUserId("another-owner");
            grants.add(grant("editor-a", 1, deadline(120000)));
            centerRuntime = proxy(IDataEntityRuntime.class, (object, method, args) -> {
                if ("createSearchContext".equals(method.getName())) return new SearchContextDTO();
                if ("selectOne".equals(method.getName())) {
                    centerReads++;
                    return centerRow;
                }
                throw new AssertionError("Unexpected center runtime call: " + method.getName());
            });
            IDataEntityRuntime membershipRuntime = proxy(
                    IDataEntityRuntime.class, (object, method, args) -> {
                        if ("createEntity".equals(method.getName())) return new PSDevSlnUserDTO();
                        throw new AssertionError("Unexpected membership runtime call: " + method.getName());
                    });
            inject(manager, "iPSDevSlnSysService", proxy(
                    IPSDevSlnSysService.class, (object, method, args) -> {
                        if ("get".equals(method.getName())) {
                            assertEquals("library-a", args[0]);
                            systemReads++;
                            return system;
                        }
                        throw new AssertionError("Unexpected system service call: " + method.getName());
                    }));
            inject(manager, "iPSDevSlnService", proxy(
                    IPSDevSlnService.class, (object, method, args) -> {
                        if ("get".equals(method.getName())) {
                            assertEquals("scheme-a", args[0]);
                            schemeReads++;
                            return scheme;
                        }
                        throw new AssertionError("Unexpected scheme service call: " + method.getName());
                    }));
            inject(manager, "iPSDevSlnUserService", proxy(
                    IPSDevSlnUserService.class, (object, method, args) -> {
                        if ("fetchDefault".equals(method.getName())) {
                            membershipReads++;
                            return new PageImpl<>(grants);
                        }
                        if ("getDataEntityRuntime".equals(method.getName())) return membershipRuntime;
                        throw new AssertionError("Unexpected membership service call: " + method.getName());
                    }));
        }

        void seedCenter(boolean admin) {
            cache.set(category(), manager.centerKey(), (Object) PSDevUserCacheCodec.encode(center(admin)), 600);
            cache.clearObservations();
        }

        void seedTarget(String type, PSDevSlnUser user) {
            cache.set(category(), manager.targetKey(type), (Object) PSDevUserCacheCodec.encode(user), 600);
            cache.clearObservations();
        }

        List<Integer> sourceReads() {
            return List.of(systemReads, schemeReads, membershipReads, centerReads);
        }

        @SuppressWarnings("unchecked")
        Map<String, Object> fields(String type) {
            IPSDevUserBase user = "CENTER".equals(type) ? center(true) : cached(type, 3, true, deadline(120000));
            return runtime.deserialize(runtime.serialize(PSDevUserCacheCodec.encode(user)), Map.class);
        }
    }

    private static <T> T proxy(Class<T> type, java.lang.reflect.InvocationHandler handler) {
        return type.cast(Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[] {type}, handler));
    }

    private static void inject(Manager manager, String name, Object value) throws Exception {
        Field field = SystemAccessManagerBase.class.getDeclaredField(name);
        field.setAccessible(true);
        field.set(manager, value);
    }

    @BeforeEach
    void installIdentity() {
        previousAuthentication = SecurityContextHolder.getContext().getAuthentication();
        previousUserContext = UserContext.getCurrent();
        authentication = new AuthenticationUser();
        authentication.setUsername("account-a");
        authentication.setUserid("account-a");
        authentication.setLoginname("account-a");
        authentication.setToken("json-cache-test-token");
        authentication.setExpirein(600);
        IEmployeeContext employee = proxy(IEmployeeContext.class, (object, method, args) -> {
            if ("getUserid".equals(method.getName())) return "account-a";
            if ("getUsername".equals(method.getName())) return "Account A";
            if ("getTenant".equals(method.getName())) return "center-a";
            if ("getMqtttopic".equals(method.getName())) return "employee-a-topic";
            if ("getAppContext".equals(method.getName())) return null;
            throw new AssertionError("Unexpected employee context call: " + method.getName());
        });
        AuthenticationUser.setCurrent(authentication, employee);
    }

    @AfterEach
    void restoreIdentity() {
        SecurityContextHolder.getContext().setAuthentication(previousAuthentication);
        UserContext.setCurrent(previousUserContext);
    }

    private String category() {
        return CloudCacheTagUtils.getAuthenticationUserCat(authentication.getUsername(), authentication.getToken());
    }

    private static String root(String type) {
        return "SYS".equals(type) ? "library-a" : "scheme-a";
    }

    private static String legacyKey(String type) {
        String key = "ex-psdevuser-ibizcentral";
        return "CENTER".equals(type) ? key : key + "-" + type + "-" + root(type);
    }

    private static Timestamp deadline(long offset) {
        Timestamp value = new Timestamp(System.currentTimeMillis() + offset);
        value.setNanos(123456789);
        return value;
    }

    private static PSDevUser center(boolean admin) {
        PSDevUser user = new PSDevUser();
        user.setPSDevCenterId("center-a");
        user.setPSDevCenterName("Center A");
        user.setPSDevUserId("editor-a");
        user.setPSDevUserName("Editor A");
        user.setLoginName("account-a");
        user.setAccMode(11);
        user.setAdminMode(admin);
        user.setDefaultMode(true);
        user.setPSDCInstId("dc-instance-a");
        user.setPSDCType("PRIVATE");
        user.setPSDCLevel(2);
        user.setExpiredTime(deadline(180000));
        return user;
    }

    private static PSDevSlnUserDTO grant(String userId, int mode, Timestamp expiry) {
        PSDevSlnUserDTO grant = new PSDevSlnUserDTO();
        grant.setPSDevSlnId("scheme-a");
        grant.setPSDevSlnSysId("library-a");
        grant.setPSDevUserObjId(userId);
        grant.setAllSysFlag(PSModelEnums.DevSlnUserTarget.ALL.value);
        grant.setAccMode(mode);
        grant.setExpiredTime(expiry);
        return grant;
    }

    private static PSDevSlnUser cached(String type, int mode, boolean admin, Timestamp expiry) {
        PSDevSlnUser user = "SYS".equals(type) ? new PSDevSysUser() : new PSDevSlnUser();
        user.setPSDevSlnId("scheme-a");
        user.setPSDevCenterId("center-a");
        user.setPSDevUserId("editor-a");
        user.setPSDevUserName("Editor A");
        user.setAccMode(mode);
        user.setAdminMode(admin);
        user.setExpiredTime(expiry);
        if (user instanceof PSDevSysUser) {
            PSDevSysUser system = (PSDevSysUser) user;
            system.setPSDevSlnSysId("library-a");
            system.setPSSystemId("model-a");
            system.setPSSysModelInstId("instance-a");
            system.setCurSysModelInstVer(7);
            system.setActiveSysModelInstVer(6);
        }
        return user;
    }

    private void assertGrant(IPSDevSlnUser expected, IPSDevSlnUser actual) {
        assertEquals(expected.getTargetType(), actual.getTargetType());
        assertEquals(expected.getPSDevCenterId(), actual.getPSDevCenterId());
        assertEquals(expected.getPSDevUserId(), actual.getPSDevUserId());
        assertEquals(expected.getPSDevUserName(), actual.getPSDevUserName());
        assertEquals(expected.getPSDevSlnId(), actual.getPSDevSlnId());
        assertEquals(expected.getAccMode(), actual.getAccMode());
        assertEquals(expected.isAdminMode(), actual.isAdminMode());
        assertEquals(expected.getExpiredTime(), actual.getExpiredTime());
        if (expected instanceof IPSDevSysUser) {
            IPSDevSysUser before = (IPSDevSysUser) expected;
            IPSDevSysUser after = (IPSDevSysUser) actual;
            assertEquals(before.getPSDevSlnSysId(), after.getPSDevSlnSysId());
            assertEquals(before.getPSDevSlnSysName(), after.getPSDevSlnSysName());
            assertEquals(before.getPSDevSlnSysCodeName(), after.getPSDevSlnSysCodeName());
            assertEquals(before.getPSDevSlnSysLogicName(), after.getPSDevSlnSysLogicName());
            assertEquals(before.getPSSystemId(), after.getPSSystemId());
            assertEquals(before.getPSSystemName(), after.getPSSystemName());
            assertEquals(before.getPSSysModelInstId(), after.getPSSysModelInstId());
            assertEquals(before.getCurSysModelInstVer(), after.getCurSysModelInstVer());
            assertEquals(before.getActiveSysModelInstVer(), after.getActiveSysModelInstVer());
            assertEquals(before.getDevSysState(), after.getDevSysState());
        }
    }

    private void assertRepeatedJsonHits(Fixture fixture, String type, IPSDevSlnUser fresh) {
        String key = fixture.manager.targetKey(type);
        String json = fixture.cache.peek(category(), key);
        List<Integer> sourceReads = fixture.sourceReads();
        int writes = fixture.cache.writes.size();
        fixture.grants.clear();
        fixture.system.setPSSystemId("changed-model");
        for (int hit = 0; hit < 2; hit++) {
            IPSDevSlnUser cached = (IPSDevSlnUser) fixture.manager.getPSDevUserBase(type, root(type));
            assertGrant(fresh, cached);
            assertNotSame(fresh, cached);
            if (fresh.getExpiredTime() != null) {
                assertNotSame(fresh.getExpiredTime(), cached.getExpiredTime());
            }
        }
        List<Integer> expectedReads = new ArrayList<>(sourceReads);
        if (fresh.isAdminMode()) {
            int targetIndex = "SYS".equals(type) ? 0 : 1;
            expectedReads.set(targetIndex, expectedReads.get(targetIndex) + 2);
        }
        assertEquals(expectedReads, fixture.sourceReads());
        assertEquals(writes, fixture.cache.writes.size());
        assertEquals(json, fixture.cache.peek(category(), key));
        Entry stored = fixture.runtime.deserialize(json, Entry.class);
        assertEquals(PSDevUserCacheCodec.SCHEMA_VERSION, stored.schemaVersion);
        assertEquals(fresh.getAccMode(), stored.accMode);
        assertEquals(fresh.isAdminMode(), stored.adminMode);
    }

    private void assertTargetFailure(Fixture fixture, String type, String json) {
        fixture.seedCenter(true);
        String key = fixture.manager.targetKey(type);
        String legacy = legacyKey(type);
        fixture.cache.seedJson(category(), legacy,
                (String) fixture.runtime.serialize(PSDevUserCacheCodec.encode(cached(type, 3, true, null))));
        fixture.cache.seedJson(category(), key, json);
        fixture.cache.clearObservations();
        assertThrows(SystemRuntimeException.class, () -> fixture.manager.getPSDevUserBase(type, root(type)));
        assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
        assertTrue(fixture.cache.writes.isEmpty());
        assertEquals(json, fixture.cache.peek(category(), key));
        assertEquals(1, fixture.cache.reads.size());
        assertEquals(key, fixture.cache.reads.get(0).key);
        assertFalse(fixture.cache.reads.stream().anyMatch(read -> legacy.equals(read.key)));
    }

    private void assertCenterFailure(
            Fixture fixture, String json, Class<? extends RuntimeException> exception) {
        String key = fixture.manager.centerKey();
        fixture.cache.seedJson(category(), legacyKey("CENTER"), (String) fixture.runtime.serialize(center(true)));
        fixture.cache.seedJson(category(), key, json);
        fixture.cache.clearObservations();
        assertThrows(exception, () -> fixture.manager.getCurrentPSDevUser());
        assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
        assertTrue(fixture.cache.writes.isEmpty());
        assertEquals(json, fixture.cache.peek(category(), key));
        assertEquals(1, fixture.cache.reads.size());
        assertEquals(key, fixture.cache.reads.get(0).key);
    }

    @Test
    void managerVersionsAllAuthorizationKeysWithoutChangingTheirScope() throws Exception {
        Fixture fixture = new Fixture();
        assertEquals(legacyKey("CENTER") + ":auth-json-v1", fixture.manager.centerKey());
        for (String type : List.of("SYS", "SLN")) {
            assertEquals(legacyKey(type) + ":auth-json-v1", fixture.manager.targetKey(type));
        }
    }

    @Test
    void freshSystemGrantSurvivesConsecutiveProductionJsonCacheHits() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(false);
        IPSDevSysUser fresh = (IPSDevSysUser) fixture.manager.getPSDevUserBase("SYS", "library-a");
        assertEquals(1, fresh.getAccMode());
        assertFalse(fresh.isAdminMode());
        assertEquals(fixture.grants.get(0).getExpiredTime(), fresh.getExpiredTime());
        assertEquals("library-a", fresh.getPSDevSlnSysId());
        assertEquals("scheme-a", fresh.getPSDevSlnId());
        assertEquals("center-a", fresh.getPSDevCenterId());
        assertEquals("editor-a", fresh.getPSDevUserId());
        assertEquals("model-a", fresh.getPSSystemId());
        assertEquals("instance-a", fresh.getPSSysModelInstId());
        assertEquals(1, fixture.membershipReads);
        assertRepeatedJsonHits(fixture, "SYS", fresh);
    }

    @Test
    void earlierLibraryExpiryRemainsTheDeadlineOnSystemCacheHits() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(false);
        fixture.system.setExpriedTime(deadline(60000));
        IPSDevSysUser fresh = (IPSDevSysUser) fixture.manager.getPSDevUserBase("SYS", "library-a");
        assertEquals(fixture.system.getExpriedTime(), fresh.getExpiredTime());
        assertRepeatedJsonHits(fixture, "SYS", fresh);
    }

    @Test
    void freshSchemeGrantSurvivesConsecutiveProductionJsonCacheHits() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(false);
        fixture.grants.get(0).setAccMode(19);
        IPSDevSlnUser fresh = (IPSDevSlnUser) fixture.manager.getPSDevUserBase("SLN", "scheme-a");
        assertEquals(19, fresh.getAccMode());
        assertFalse(fresh.isAdminMode());
        assertEquals(fixture.grants.get(0).getExpiredTime(), fresh.getExpiredTime());
        assertEquals("scheme-a", fresh.getPSDevSlnId());
        assertEquals("center-a", fresh.getPSDevCenterId());
        assertEquals("editor-a", fresh.getPSDevUserId());
        assertRepeatedJsonHits(fixture, "SLN", fresh);
    }

    @Test
    void versionedCenterAdministratorRemainsAdministratorOnSystemCacheHits() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        fixture.grants.get(0).setExpiredTime(deadline(-60000));
        IPSDevSysUser fresh = (IPSDevSysUser) fixture.manager.getPSDevUserBase("SYS", "library-a");
        assertEquals(3, fresh.getAccMode());
        assertTrue(fresh.isAdminMode());
        assertEquals(fixture.system.getExpriedTime(), fresh.getExpiredTime());
        assertEquals("editor-a", fresh.getPSDevUserId());
        assertRepeatedJsonHits(fixture, "SYS", fresh);
    }

    @Test
    void versionedCenterAdministratorRemainsAdministratorOnSchemeCacheHits() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        fixture.grants.get(0).setExpiredTime(deadline(-60000));
        IPSDevSlnUser fresh = (IPSDevSlnUser) fixture.manager.getPSDevUserBase("SLN", "scheme-a");
        assertEquals(3, fresh.getAccMode());
        assertTrue(fresh.isAdminMode());
        assertNull(fresh.getExpiredTime());
        assertRepeatedJsonHits(fixture, "SLN", fresh);
    }

    @Test
    void freshSystemCannotPromoteAnAdministratorFromAnotherCenterWithoutMembership() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        fixture.system.setPSDevCenterId("center-b");
        fixture.scheme.setPSDevCenterId("center-b");
        fixture.grants.clear();
        assertNull(fixture.manager.getPSDevUserBase("SYS", "library-a"));
        Entry denied = fixture.runtime.deserialize(
                fixture.cache.peek(category(), fixture.manager.targetKey("SYS")), Entry.class);
        assertFalse(denied.adminMode);
        assertEquals(0, denied.accMode);
        assertEquals("center-b", denied.psDevCenterId);
    }

    @Test
    void freshSchemeCannotPromoteAnAdministratorFromAnotherCenterWithoutMembership() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        fixture.scheme.setPSDevCenterId("center-b");
        fixture.grants.clear();
        assertNull(fixture.manager.getPSDevUserBase("SLN", "scheme-a"));
        Entry denied = fixture.runtime.deserialize(
                fixture.cache.peek(category(), fixture.manager.targetKey("SLN")), Entry.class);
        assertFalse(denied.adminMode);
        assertEquals(0, denied.accMode);
        assertEquals("center-b", denied.psDevCenterId);
    }

    @Test
    void foreignCenterAdministratorRetainsOnlyRealMembershipAndItsDeadline() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(true);
            fixture.system.setPSDevCenterId("center-b");
            fixture.scheme.setPSDevCenterId("center-b");
            IPSDevSlnUser fresh = (IPSDevSlnUser) fixture.manager.getPSDevUserBase(type, root(type));
            assertEquals(1, fresh.getAccMode());
            assertFalse(fresh.isAdminMode());
            assertEquals("center-b", fresh.getPSDevCenterId());
            assertEquals(fixture.grants.get(0).getExpiredTime(), fresh.getExpiredTime());
            assertRepeatedJsonHits(fixture, type, fresh);
        }
    }

    @Test
    void missingTargetCenterCannotPromoteFreshAdministrator() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(true);
            fixture.system.setPSDevCenterId(null);
            fixture.scheme.setPSDevCenterId(null);
            fixture.grants.clear();
            assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
        }
    }

    @Test
    void sameCenterAdministratorStillWorksWithoutMembership() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(true);
            fixture.grants.clear();
            IPSDevSlnUser fresh = (IPSDevSlnUser) fixture.manager.getPSDevUserBase(type, root(type));
            assertTrue(fresh.isAdminMode());
            assertEquals(3, fresh.getAccMode());
            assertEquals("center-a", fresh.getPSDevCenterId());
        }
    }

    @Test
    void cachedAdministratorMustMatchActualTargetCenterNotOnlyItsDeclaration() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String declaredCenter : new String[] {"center-a", "center-b", null}) {
                Fixture fixture = new Fixture();
                fixture.seedCenter(true);
                fixture.system.setPSDevCenterId("center-b");
                fixture.scheme.setPSDevCenterId("center-b");
                fixture.grants.clear();
                PSDevSlnUser user = cached(type, 3, true, null);
                user.setPSDevCenterId(declaredCenter);
                fixture.seedTarget(type, user);
                String original = fixture.cache.peek(category(), fixture.manager.targetKey(type));
                assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
                assertEquals(0, fixture.membershipReads);
                assertTrue(fixture.cache.writes.isEmpty());
                assertEquals(original, fixture.cache.peek(category(), fixture.manager.targetKey(type)));
            }
        }
    }

    @Test
    void cachedAdministratorWithMissingActualCenterIsDenied() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(true);
            fixture.seedTarget(type, cached(type, 3, true, null));
            fixture.system.setPSDevCenterId(null);
            fixture.scheme.setPSDevCenterId(null);
            assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
            assertTrue(fixture.cache.writes.isEmpty());
        }
    }

    @Test
    void cachedAdministratorCannotForgeCenterOrUserIdentity() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String mismatch : List.of("center", "missing-center", "user", "missing-user")) {
                Fixture fixture = new Fixture();
                fixture.seedCenter(true);
                PSDevSlnUser user = cached(type, 3, true, null);
                if ("center".equals(mismatch)) user.setPSDevCenterId("center-b");
                if ("missing-center".equals(mismatch)) user.setPSDevCenterId(null);
                if ("user".equals(mismatch)) user.setPSDevUserId("another-editor");
                if ("missing-user".equals(mismatch)) user.setPSDevUserId(null);
                fixture.seedTarget(type, user);
                assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
                assertEquals(0, fixture.membershipReads);
                assertTrue(fixture.cache.writes.isEmpty());
            }
        }
    }

    @Test
    void cachedAdministratorRequiresAnActiveCurrentCenterAdministrator() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String state : List.of("absent", "demoted", "expired")) {
                Fixture fixture = new Fixture();
                if (!"absent".equals(state)) {
                    PSDevUser user = center(!"demoted".equals(state));
                    if ("expired".equals(state)) user.setExpiredTime(deadline(-60000));
                    fixture.cache.set(category(), fixture.manager.centerKey(),
                            (Object) PSDevUserCacheCodec.encode(user), 600);
                }
                fixture.seedTarget(type, cached(type, 3, true, null));
                assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
                assertEquals(0, fixture.membershipReads);
                assertTrue(fixture.cache.writes.isEmpty());
            }
        }
    }

    @Test
    void cachedAdministratorCannotTrustAServiceRowForAnotherRoot() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String wrongRoot : new String[] {"other-root", null}) {
                Fixture fixture = new Fixture();
                fixture.seedCenter(true);
                fixture.seedTarget(type, cached(type, 3, true, null));
                fixture.system.setPSDevSlnSysId(wrongRoot);
                fixture.scheme.setPSDevSlnId(wrongRoot);
                assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
                assertEquals(0, fixture.membershipReads);
                assertTrue(fixture.cache.writes.isEmpty());
            }
        }
    }

    private void assertBaseAppDataWithoutSystem(Fixture fixture) {
        AppData base = new AppData();
        base.set("version", "base-version");
        base.set("enablepermissionvalid", true);
        base.getContextIf().set("srfsystemid", "application-a");
        base.getExtMqttTopicIf().set("base-topic", "ordinary-topic");
        fixture.manager.baseAppData = base;
        AppData actual = fixture.manager.getAppData("application-a", "organization-a");
        assertSame(base, actual);
        assertEquals("base-version", actual.get("version"));
        assertEquals(true, actual.get("enablepermissionvalid"));
        assertEquals("application-a", actual.getContextIf().get("srfsystemid"));
        assertEquals("ordinary-topic", actual.getExtMqttTopicIf().get("base-topic"));
        assertEquals(net.ibizsys.modeling.core.Version.getVersionString(), actual.get("studiover"));
        for (String field : List.of("srfpssysname", "srfpssyslogicname", "srfpssysinstver",
                "srfpsactiveinstver", "psdevsln", "srfmodelingver")) {
            assertFalse(actual.getContextIf().contains(field));
        }
        assertFalse(actual.getExtMqttTopicIf().contains("psdevslnsystopic"));
        assertFalse(actual.getExtMqttTopicIf().contains("studiotopic"));
        assertFalse(actual.contains("devsysstate"));
        assertFalse(actual.contains("devsysstatemsg"));
    }

    @Test
    void noRootAppDataPreservesBaseContractAndDoesNotReadSystemServices() throws Exception {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        ActionSessionManager.openSession().setAppContext(AppContext.newInstance(null));
        try {
            Fixture fixture = new Fixture();
            fixture.seedCenter(true);
            assertNull(fixture.manager.getCurrentPSDevSysUser(true));
            assertThrows(SystemRuntimeException.class, () -> fixture.manager.getCurrentPSDevSysUser(false));
            assertBaseAppDataWithoutSystem(fixture);
            assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
            assertTrue(fixture.cache.writes.isEmpty());
            assertTrue(fixture.cache.reads.stream()
                    .allMatch(read -> fixture.manager.centerKey().equals(read.key)));
        } finally {
            ActionSessionManager.closeSession(false);
        }
    }

    @Test
    void noSessionAppDataAlsoPreservesBaseContractWithoutSystemServices() throws Exception {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        assertNull(fixture.manager.getCurrentPSDevSysUser(true));
        assertThrows(SystemRuntimeException.class, () -> fixture.manager.getCurrentPSDevSysUser(false));
        assertBaseAppDataWithoutSystem(fixture);
        assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
        assertTrue(fixture.cache.writes.isEmpty());
    }

    @Test
    void deniedOptionalSystemDoesNotAddSystemMetadataToAppData() throws Exception {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        ActionSessionManager.openSession().setAppContext(AppContext.newInstance(null));
        try {
            ActionSessionManager.getAppContext().set("PSDEVSLNSYS", "library-a");
            Fixture fixture = new Fixture();
            fixture.seedCenter(false);
            fixture.grants.clear();
            assertBaseAppDataWithoutSystem(fixture);
            assertEquals(List.of(1, 1, 1, 0), fixture.sourceReads());
            assertNull(fixture.manager.getCurrentPSDevSysUser(true));
            assertThrows(SystemRuntimeException.class, () -> fixture.manager.getCurrentPSDevSysUser(false));
            assertEquals(List.of(1, 1, 1, 0), fixture.sourceReads());
        } finally {
            ActionSessionManager.closeSession(false);
        }
    }

    @Test
    void authorizedSystemAppDataStillIncludesSystemContextTopicsAndState() throws Exception {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        ActionSessionManager.openSession().setAppContext(AppContext.newInstance(null));
        try {
            ActionSessionManager.getAppContext().set("PSDEVSLNSYS", "library-a");
            Fixture fixture = new Fixture();
            fixture.seedCenter(false);
            fixture.system.setDevSysState(10);
            fixture.manager.baseAppData = new AppData();
            AppData actual = fixture.manager.getAppData("application-a", "organization-a");
            assertSame(fixture.manager.baseAppData, actual);
            assertEquals("Library A", actual.getContextIf().get("srfpssysname"));
            assertEquals("Library logic", actual.getContextIf().get("srfpssyslogicname"));
            assertEquals(7, actual.getContextIf().get("srfpssysinstver"));
            assertEquals(6, actual.getContextIf().get("srfpsactiveinstver"));
            assertEquals("scheme-a", actual.getContextIf().get("psdevsln"));
            assertEquals("library-a", actual.getExtMqttTopicIf().get("psdevslnsystopic"));
            assertEquals("employee-a-topic_psdevslnsys_library-a",
                    actual.getExtMqttTopicIf().get("studiotopic"));
            assertEquals(10, actual.get("devsysstate"));
            assertEquals(SystemAccessManagerBase.SYSSTATEMSG_UNINIT, actual.get("devsysstatemsg"));
            assertEquals(net.ibizsys.modeling.core.Version.getVersionString(), actual.get("studiover"));
            assertEquals(List.of(2, 1, 1, 0), fixture.sourceReads());
        } finally {
            ActionSessionManager.closeSession(false);
        }
    }

    @Test
    void versionedCenterSeedIsReadThroughProductionJsonWithItsGrantAndIdentity() throws Exception {
        Fixture fixture = new Fixture();
        PSDevUser expected = center(true);
        fixture.cache.set(category(), fixture.manager.centerKey(), (Object) PSDevUserCacheCodec.encode(expected), 600);
        fixture.cache.clearObservations();
        IPSDevUser actual = fixture.manager.getCurrentPSDevUser();
        assertNotSame(expected, actual);
        assertEquals(expected.getAccMode(), actual.getAccMode());
        assertEquals(expected.isAdminMode(), actual.isAdminMode());
        assertEquals(expected.getExpiredTime(), actual.getExpiredTime());
        assertEquals(expected.getPSDevUserId(), actual.getPSDevUserId());
        assertEquals(expected.getPSDevCenterId(), actual.getPSDevCenterId());
        assertEquals(expected.getPSDCInstId(), actual.getPSDCInstId());
        assertEquals(expected.getPSDCType(), actual.getPSDCType());
        assertEquals(expected.getPSDCLevel(), actual.getPSDCLevel());
        assertEquals(expected.isDefaultMode(), actual.isDefaultMode());
        assertEquals(1, fixture.cache.reads.size());
        assertEquals(category(), fixture.cache.reads.get(0).category);
        assertEquals(fixture.manager.centerKey(), fixture.cache.reads.get(0).key);
    }

    @Test
    void freshCenterEntityWriterUsesVersionedJsonAndAuthenticationTtl() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.centerRow = new PSDevUserDTO();
        fixture.centerRow.setPSDevCenterId("center-a");
        fixture.centerRow.setPSDevUserId("editor-a");
        fixture.centerRow.setPSDevUserName("Editor A");
        fixture.centerRow.set("adminmode", 1);
        IPSDevUser fresh = fixture.manager.freshCenter();
        IPSDevUser cached = fixture.manager.getCurrentPSDevUser();
        assertTrue(fresh.isAdminMode());
        assertTrue(cached.isAdminMode());
        assertEquals(fresh.getAccMode(), cached.getAccMode());
        assertEquals("editor-a", cached.getPSDevUserId());
        assertEquals("account-a", cached.getLoginName());
        assertEquals("center-a", cached.getPSDevCenterId());
        assertEquals(1, fixture.centerReads);
        assertEquals(1, fixture.cache.writes.size());
        assertEquals(fixture.manager.centerKey(), fixture.cache.writes.get(0).key);
        assertEquals(authentication.getExpirein(), fixture.cache.writes.get(0).ttl);
        assertNull(fixture.cache.peek(category(), legacyKey("CENTER")));
    }

    @Test
    void freshCenterRoleFallbackWriterAlsoUsesVersionedJsonAndAuthenticationTtl() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.manager.wxmpRole = true;
        IPSDevUser fresh = fixture.manager.freshCenter();
        IPSDevUser cached = fixture.manager.getCurrentPSDevUser();
        assertFalse(cached.isAdminMode());
        assertEquals(fresh.getAccMode(), cached.getAccMode());
        assertEquals("account-a", cached.getPSDevUserId());
        assertEquals("center-a", cached.getPSDevCenterId());
        assertEquals(1, fixture.cache.writes.size());
        assertEquals(fixture.manager.centerKey(), fixture.cache.writes.get(0).key);
        assertEquals(authentication.getExpirein(), fixture.cache.writes.get(0).ttl);
        assertNull(fixture.cache.peek(category(), legacyKey("CENTER")));
    }

    @Test
    void legacyCenterEntryIsNeverReadOrPromotedWhenTheVersionedKeyIsMissing() throws Exception {
        Fixture fixture = new Fixture();
        String oldJson = (String) fixture.runtime.serialize(center(true));
        fixture.cache.seedJson(category(), legacyKey("CENTER"), oldJson);
        assertNull(fixture.manager.getCurrentPSDevUser());
        assertEquals(1, fixture.cache.reads.size());
        assertEquals(fixture.manager.centerKey(), fixture.cache.reads.get(0).key);
        assertTrue(fixture.cache.writes.isEmpty());
        assertEquals(oldJson, fixture.cache.peek(category(), legacyKey("CENTER")));
    }

    @Test
    void legacyTargetGrantsCannotReplaceFreshAuthorizationOrUpgradeIt() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(false);
            String oldJson = (String) fixture.runtime.serialize(
                    PSDevUserCacheCodec.encode(cached(type, 3, true, null)));
            fixture.cache.seedJson(category(), legacyKey(type), oldJson);
            IPSDevSlnUser fresh = (IPSDevSlnUser) fixture.manager.getPSDevUserBase(type, root(type));
            assertEquals(1, fresh.getAccMode());
            assertFalse(fresh.isAdminMode());
            assertEquals(1, fixture.membershipReads);
            assertFalse(fixture.cache.reads.stream().anyMatch(read -> legacyKey(type).equals(read.key)));
            assertEquals(oldJson, fixture.cache.peek(category(), legacyKey(type)));
            assertRepeatedJsonHits(fixture, type, fresh);
        }
    }

    @Test
    void nonpositiveJsonCachedGrantsAreDeniedWithoutReauthorizing() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (int mode : new int[] {0, -1}) {
                Fixture fixture = new Fixture();
                fixture.seedTarget(type, cached(type, mode, true, null));
                assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
                assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
                assertTrue(fixture.cache.writes.isEmpty());
            }
        }
    }

    @Test
    void expiredJsonCachedGrantsAreDeniedWithoutReauthorizing() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedTarget(type, cached(type, 3, true, deadline(-60000)));
            assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
            assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
            assertTrue(fixture.cache.writes.isEmpty());
        }
        Fixture fixture = new Fixture();
        PSDevUser expired = center(true);
        expired.setExpiredTime(deadline(-60000));
        fixture.cache.set(category(), fixture.manager.centerKey(), (Object) PSDevUserCacheCodec.encode(expired), 600);
        fixture.cache.clearObservations();
        assertNull(fixture.manager.getCurrentPSDevUser());
        assertEquals(List.of(0, 0, 0, 0), fixture.sourceReads());
        assertTrue(fixture.cache.writes.isEmpty());
    }

    @Test
    void missingVersionedGrantAndMissingMembershipCannotFallBackToLegacyAllow() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            fixture.seedCenter(false);
            fixture.grants.clear();
            fixture.cache.seedJson(category(), legacyKey(type),
                    (String) fixture.runtime.serialize(PSDevUserCacheCodec.encode(cached(type, 3, true, null))));
            assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
            List<Integer> sourceReads = fixture.sourceReads();
            assertNull(fixture.manager.getPSDevUserBase(type, root(type)));
            assertEquals(sourceReads, fixture.sourceReads());
            assertEquals(1, fixture.membershipReads);
            assertFalse(fixture.cache.reads.stream().anyMatch(read -> legacyKey(type).equals(read.key)));
            Entry denied = fixture.runtime.deserialize(fixture.cache.peek(category(), fixture.manager.targetKey(type)), Entry.class);
            assertEquals(0, denied.accMode);
            assertFalse(denied.adminMode);
        }
    }

    @Test
    void malformedJsonFailsBeforeFreshGrantOrLegacyFallback() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            assertTargetFailure(new Fixture(), type, "{not-json");
        }
        assertCenterFailure(new Fixture(), "{not-json", SystemRuntimeException.class);
    }

    @Test
    void omittedRequiredFieldsFailBeforeFreshGrantOrLegacyFallback() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String name : List.of("schemaVersion", "targetType", "accMode",
                    "adminMode", "expiredTimeMillis", "expiredTimeNanos")) {
                Fixture fixture = new Fixture();
                Map<String, Object> fields = fixture.fields(type);
                fields.remove(name);
                assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
            }
        }
        Fixture fixture = new Fixture();
        Map<String, Object> fields = fixture.fields("CENTER");
        fields.remove("adminMode");
        assertCenterFailure(fixture, (String) fixture.runtime.serialize(fields), SystemRuntimeException.class);
    }

    @Test
    void explicitNullGrantFieldsCannotSilentlyBecomeDefaults() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String name : List.of("schemaVersion", "targetType", "accMode", "adminMode")) {
                Fixture fixture = new Fixture();
                Map<String, Object> fields = fixture.fields(type);
                fields.put(name, null);
                assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
            }
        }
    }

    @Test
    void cachedCrossRootAndAbsentRootAreRejectedBeforeAnyServiceAccess() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String wrongRoot : new String[] {"other-root", null}) {
                Fixture fixture = new Fixture();
                Map<String, Object> fields = fixture.fields(type);
                fields.put("SYS".equals(type) ? "psDevSlnSysId" : "psDevSlnId", wrongRoot);
                assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
            }
        }
        Fixture fixture = new Fixture();
        Map<String, Object> fields = fixture.fields("CENTER");
        fields.put("psDevCenterId", "center-b");
        assertCenterFailure(fixture, (String) fixture.runtime.serialize(fields), IllegalArgumentException.class);
    }

    @Test
    void cachedTargetTypeCannotBeReinterpretedByTheRequestedKey() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            Map<String, Object> fields = fixture.fields(type);
            fields.put("targetType", "SYS".equals(type) ? "SLN" : "SYS");
            assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
        }
        Fixture fixture = new Fixture();
        Map<String, Object> fields = fixture.fields("CENTER");
        fields.put("targetType", "SYS");
        assertCenterFailure(fixture, (String) fixture.runtime.serialize(fields), IllegalArgumentException.class);
    }

    @Test
    void unknownCacheSchemaIsNotDowngradedToLegacyOrReauthorized() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            Map<String, Object> fields = fixture.fields(type);
            fields.put("schemaVersion", 2);
            assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
        }
    }

    @Test
    void partialOrInconsistentExpiryCannotBecomeAnUnboundedCachedGrant() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            for (String name : List.of("expiredTimeMillis", "expiredTimeNanos")) {
                Fixture fixture = new Fixture();
                Map<String, Object> fields = fixture.fields(type);
                fields.put(name, null);
                assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
            }
            Fixture fixture = new Fixture();
            Map<String, Object> fields = fixture.fields(type);
            fields.put("expiredTimeNanos", 999000000);
            assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(fields));
        }
    }

    @Test
    void legacyPublicUserJsonAtAVersionedKeyIsRejected() throws Exception {
        for (String type : List.of("SYS", "SLN")) {
            Fixture fixture = new Fixture();
            assertTargetFailure(fixture, type, (String) fixture.runtime.serialize(cached(type, 3, true, null)));
        }
        Fixture fixture = new Fixture();
        assertCenterFailure(fixture, (String) fixture.runtime.serialize(center(true)), SystemRuntimeException.class);
    }

    @Test
    void realJsonCacheHitsDoNotExposeGrantFieldsInPublicUserSerialization() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        for (String type : List.of("SYS", "SLN")) {
            IPSDevUserBase fresh = fixture.manager.getPSDevUserBase(type, root(type));
            IPSDevUserBase cached = fixture.manager.getPSDevUserBase(type, root(type));
            for (IPSDevUserBase user : List.of(fresh, cached, fixture.manager.getCurrentPSDevUser())) {
                Map<?, ?> publicJson = fixture.runtime.deserialize(fixture.runtime.serialize(user), Map.class);
                assertFalse(publicJson.containsKey("accMode"));
                assertFalse(publicJson.containsKey("adminMode"));
                assertFalse(publicJson.containsKey("expiredTime"));
            }
        }
    }

    @Test
    void cachedCenterAndSystemAuthorizationCannotCrossAuthenticationTokenCategories() throws Exception {
        Fixture fixture = new Fixture();
        fixture.seedCenter(true);
        fixture.seedTarget("SYS", cached("SYS", 3, true, null));
        String oldCategory = category();
        fixture.grants.clear();
        fixture.grants.add(grant("account-a", 1, deadline(120000)));
        authentication.setToken("different-json-cache-token");
        assertNull(fixture.manager.getCurrentPSDevUser());
        IPSDevSysUser fresh = (IPSDevSysUser) fixture.manager.getPSDevUserBase("SYS", "library-a");
        assertEquals(1, fresh.getAccMode());
        assertFalse(fresh.isAdminMode());
        assertEquals("account-a", fresh.getPSDevUserId());
        assertEquals(1, fixture.membershipReads);
        assertTrue(fixture.cache.reads.stream().allMatch(read -> category().equals(read.category)));
        assertFalse(oldCategory.equals(category()));
        assertTrue(fixture.cache.storage.containsKey(oldCategory));
    }
}
