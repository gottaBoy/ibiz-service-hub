package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.SystemRuntime;
import net.ibizsys.central.sysutil.SysCacheUtilRuntimeBase;
import net.ibizsys.modeling.core.security.PSDevUserCacheCodec.Entry;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;
import org.junit.jupiter.api.Test;

class PSDevUserCacheCodecTest {
    private final SystemRuntime runtime = new SystemRuntime();

    private PSDevSysUser system() {
        PSDevSysUser user = new PSDevSysUser();
        common(user);
        user.setPSDevSlnId("scheme-a");
        user.setPSDevSlnSysId("library-a");
        user.setPSDevSlnSysName("Library A");
        user.setPSDevSlnSysCodeName("library_a");
        user.setPSDevSlnSysLogicName("Library logic");
        user.setPSSystemId("model-a");
        user.setPSSystemName("Model A");
        user.setPSSysModelInstId("instance-a");
        user.setCurSysModelInstVer(7);
        user.setActiveSysModelInstVer(6);
        user.setDevSysState(10);
        user.setAccMode(3);
        user.setAdminMode(true);
        return user;
    }

    private void common(PSDevUserBase user) {
        user.setPSDevCenterId("center-a");
        user.setPSDevCenterName("Center A");
        user.setPSDevUserId("user-a");
        user.setPSDevUserName("User A");
        user.setTaskServerUrl("https://task.invalid//");
        Timestamp expiry = new Timestamp(System.currentTimeMillis() + 120000);
        expiry.setNanos(123456789);
        user.setExpiredTime(expiry);
        user.setUserTag("tag-1");
        user.setUserTag2("tag-2");
        user.setUserTag3(Map.of("tag", 3));
        user.setUserTag4(List.of("tag", 4));
        user.setStudioVer("S0600");
        user.setStudioTag("studio-1");
        user.setStudioTag2("studio-2");
        user.setRetInfo("ready");
        user.setLoginName("login-a");
        user.setStudioConsoleId("console-a");
    }

    private void assertCommon(IPSDevUserBase expected, IPSDevUserBase actual) {
        assertEquals(expected.getTargetType(), actual.getTargetType());
        assertEquals(expected.getPSDevCenterId(), actual.getPSDevCenterId());
        assertEquals(expected.getPSDevCenterName(), actual.getPSDevCenterName());
        assertEquals(expected.getPSDevUserId(), actual.getPSDevUserId());
        assertEquals(expected.getPSDevUserName(), actual.getPSDevUserName());
        assertEquals(expected.getTaskServerUrl(), actual.getTaskServerUrl());
        assertEquals(expected.getExpiredTime(), actual.getExpiredTime());
        assertEquals(expected.getUserTag(), actual.getUserTag());
        assertEquals(expected.getUserTag2(), actual.getUserTag2());
        assertEquals(expected.getUserTag3(), actual.getUserTag3());
        assertEquals(expected.getUserTag4(), actual.getUserTag4());
        assertEquals(expected.getStudioVer(), actual.getStudioVer());
        assertEquals(expected.getStudioTag(), actual.getStudioTag());
        assertEquals(expected.getStudioTag2(), actual.getStudioTag2());
        assertEquals(expected.getRetInfo(), actual.getRetInfo());
        assertEquals(expected.getLoginName(), actual.getLoginName());
        assertEquals(expected.getStudioConsoleId(), actual.getStudioConsoleId());
    }

    private IPSDevUserBase roundtrip(IPSDevUserBase user, String root) {
        Entry entry = runtime.deserialize(
                runtime.serialize(PSDevUserCacheCodec.encode(user)), Entry.class);
        return PSDevUserCacheCodec.decode(entry, user.getTargetType(), root);
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> fields(IPSDevUserBase user) {
        return runtime.deserialize(
                runtime.serialize(PSDevUserCacheCodec.encode(user)), Map.class);
    }

    private Entry entry(Map<String, Object> fields) {
        return runtime.deserialize(runtime.serialize(fields), Entry.class);
    }

    @Test
    void legacyProductionJsonLosesGrantFieldsDespitePreservingRoutingIdentity() {
        PSDevSysUser expected = system();
        PSDevSysUser actual = runtime.deserialize(runtime.serialize(expected), PSDevSysUser.class);
        assertEquals(expected.getPSDevSlnSysId(), actual.getPSDevSlnSysId());
        assertEquals(expected.getPSSystemId(), actual.getPSSystemId());
        assertEquals(expected.getPSSysModelInstId(), actual.getPSSysModelInstId());
        assertEquals(0, actual.getAccMode());
        assertFalse(actual.isAdminMode());
        assertNull(actual.getExpiredTime());
    }

    @Test
    void productionJsonRoundtripPreservesSystemGrantAndAllMetadata() {
        PSDevSysUser expected = system();
        PSDevSysUser actual = (PSDevSysUser) roundtrip(expected, "library-a");
        assertCommon(expected, actual);
        assertNotSame(expected, actual);
        assertEquals(expected.getAccMode(), actual.getAccMode());
        assertEquals(expected.isAdminMode(), actual.isAdminMode());
        assertEquals(expected.getPSDevSlnId(), actual.getPSDevSlnId());
        assertEquals(expected.getPSDevSlnSysId(), actual.getPSDevSlnSysId());
        assertEquals(expected.getPSDevSlnSysName(), actual.getPSDevSlnSysName());
        assertEquals(expected.getPSDevSlnSysCodeName(), actual.getPSDevSlnSysCodeName());
        assertEquals(expected.getPSDevSlnSysLogicName(), actual.getPSDevSlnSysLogicName());
        assertEquals(expected.getPSSystemId(), actual.getPSSystemId());
        assertEquals(expected.getPSSystemName(), actual.getPSSystemName());
        assertEquals(expected.getPSSysModelInstId(), actual.getPSSysModelInstId());
        assertEquals(expected.getCurSysModelInstVer(), actual.getCurSysModelInstVer());
        assertEquals(expected.getActiveSysModelInstVer(), actual.getActiveSysModelInstVer());
        assertEquals(expected.getDevSysState(), actual.getDevSysState());
    }

    @Test
    void productionJsonRoundtripPreservesSchemeGrantAndDeadline() {
        PSDevSlnUser expected = new PSDevSlnUser();
        common(expected);
        expected.setPSDevSlnId("scheme-a");
        expected.setAccMode(19);
        expected.setAdminMode(true);
        PSDevSlnUser actual = (PSDevSlnUser) roundtrip(expected, "scheme-a");
        assertEquals(PSDevSlnUser.class, actual.getClass());
        assertCommon(expected, actual);
        assertEquals("scheme-a", actual.getPSDevSlnId());
        assertEquals(19, actual.getAccMode());
        assertTrue(actual.isAdminMode());
    }

    @Test
    void productionJsonRoundtripPreservesCenterIdentityAndAdministratorState() {
        PSDevUser expected = new PSDevUser();
        common(expected);
        expected.setAccMode(11);
        expected.setAdminMode(true);
        expected.setDefaultMode(true);
        expected.setPSDCInstId("dc-instance-a");
        expected.setPSDCType("PRIVATE");
        expected.setPSDCLevel(2);
        PSDevUser actual = (PSDevUser) roundtrip(expected, "center-a");
        assertCommon(expected, actual);
        assertEquals(11, actual.getAccMode());
        assertTrue(actual.isAdminMode());
        assertTrue(actual.isDefaultMode());
        assertEquals(expected.getPSDCInstId(), actual.getPSDCInstId());
        assertEquals(expected.getPSDCType(), actual.getPSDCType());
        assertEquals(expected.getPSDCLevel(), actual.getPSDCLevel());
        assertTrue(PSDevUserCacheCodec.decode(
                PSDevUserCacheCodec.encode(expected), "CENTER", null) instanceof PSDevUser);
    }

    @Test
    void codecDoesNotUpgradeOrNormalizeDeniedOrLegacyBitmaskModes() {
        for (int mode : new int[] {-1, 0, 1, 2, 3, 5, 11, 19}) {
            PSDevSysUser expected = system();
            expected.setAccMode(mode);
            expected.setAdminMode(false);
            PSDevSysUser actual = (PSDevSysUser) roundtrip(expected, "library-a");
            assertEquals(mode, actual.getAccMode());
            assertFalse(actual.isAdminMode());
        }
    }

    @Test
    void explicitUnboundedExpiryIsPreservedWithoutMutableTimestampAliasing() {
        PSDevSysUser expected = system();
        expected.setExpiredTime(null);
        assertNull(roundtrip(expected, "library-a").getExpiredTime());
        expected = system();
        IPSDevUserBase actual = roundtrip(expected, "library-a");
        assertEquals(expected.getExpiredTime(), actual.getExpiredTime());
        assertNotSame(expected.getExpiredTime(), actual.getExpiredTime());
        expected.getExpiredTime().setTime(0);
        assertFalse(actual.isExpired());
    }

    @Test
    void expiredGrantRemainsExpiredAfterProductionJsonRoundtrip() {
        PSDevSysUser expected = system();
        expected.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
        IPSDevUserBase actual = roundtrip(expected, "library-a");
        assertCommon(expected, actual);
        assertTrue(actual.isExpired());
    }

    @Test
    void wrongExpectedTypeAndCrossLibraryRootAreRejected() {
        Entry entry = PSDevUserCacheCodec.encode(system());
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry, "SLN", "scheme-a"));
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry, "SYS", "library-b"));
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry, "SYS", null));
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry, "SYS", ""));
        assertEquals("library-a", ((IPSDevSysUser) PSDevUserCacheCodec.decode(
                entry, "sys", "LIBRARY-A")).getPSDevSlnSysId());
    }

    @Test
    void unknownTypesAndConflictingUserTypesAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(null, "TEMPL", "template-a"));
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(null, null, "library-a"));
        PSDevSysUser conflicting = new PSDevSysUser() {
            @Override
            public String getTargetType() {
                return "SLN";
            }
        };
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.encode(conflicting));
        assertThrows(NullPointerException.class, () -> PSDevUserCacheCodec.encode(null));
    }

    @Test
    void missingGrantAndExpiryFieldsAreRejectedRatherThanDefaulted() {
        for (String name : List.of("schemaVersion", "targetType", "accMode",
                "adminMode", "expiredTimeMillis", "expiredTimeNanos")) {
            Map<String, Object> fields = fields(system());
            fields.remove(name);
            assertThrows(SystemRuntimeException.class, () -> entry(fields), name);
        }
    }

    @Test
    void explicitNullRequiredGrantFieldsAreRejected() {
        for (String name : List.of("schemaVersion", "targetType", "accMode", "adminMode")) {
            Map<String, Object> fields = fields(system());
            fields.put(name, null);
            assertThrows(IllegalArgumentException.class,
                    () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"), name);
        }
    }

    @Test
    void unknownSchemaAndAbsentSystemRootAreRejected() {
        Map<String, Object> fields = fields(system());
        fields.put("schemaVersion", 2);
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"));
        fields.put("schemaVersion", 1);
        fields.put("psDevSlnSysId", null);
        assertThrows(IllegalArgumentException.class,
                () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"));
    }

    @Test
    void partialAndInconsistentExpiryCannotBecomeAnUnboundedGrant() {
        for (int nanos : new int[] {-1, 1_000_000_000, 999000000}) {
            Map<String, Object> fields = fields(system());
            fields.put("expiredTimeNanos", nanos);
            assertThrows(IllegalArgumentException.class,
                    () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"));
        }
        for (String name : List.of("expiredTimeMillis", "expiredTimeNanos")) {
            Map<String, Object> fields = fields(system());
            fields.put(name, null);
            assertThrows(IllegalArgumentException.class,
                    () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"));
        }
    }

    @Test
    void unknownJsonFieldsAndLegacyJsonAreRejected() {
        Map<String, Object> fields = fields(system());
        fields.put("authorizationOverride", true);
        assertThrows(SystemRuntimeException.class, () -> entry(fields));
        assertThrows(SystemRuntimeException.class,
                () -> runtime.deserialize(runtime.serialize(system()), Entry.class));
    }

    @Test
    void absentVariantMetadataCannotSilentlyAcquireDefaultValues() {
        for (String name : List.of("curSysModelInstVer", "activeSysModelInstVer", "devSysState")) {
            Map<String, Object> fields = fields(system());
            fields.remove(name);
            assertThrows(IllegalArgumentException.class,
                    () -> PSDevUserCacheCodec.decode(entry(fields), "SYS", "library-a"));
        }
        PSDevUser center = new PSDevUser();
        common(center);
        for (String name : List.of("defaultMode", "psdcLevel")) {
            Map<String, Object> fields = fields(center);
            fields.remove(name);
            assertThrows(IllegalArgumentException.class,
                    () -> PSDevUserCacheCodec.decode(entry(fields), "CENTER", "center-a"));
        }
    }

    @Test
    void codecDoesNotChangeTheProductionMapperOrPublicUserJsonBoundary() {
        Object mapper = JsonUtils.MAPPER;
        PSDevSysUser user = system();
        Object before = runtime.serialize(user);
        roundtrip(user, "library-a");
        assertSame(mapper, JsonUtils.MAPPER);
        assertEquals(before, runtime.serialize(user));
        Map<?, ?> publicJson = runtime.deserialize(before, Map.class);
        assertFalse(publicJson.containsKey("accMode"));
        assertFalse(publicJson.containsKey("adminMode"));
        assertFalse(publicJson.containsKey("expiredTime"));
    }

    @Test
    void versionedKeysIgnoreOldCacheAndConsecutiveHitsUseRealJsonCachePipeline() {
        class Cache extends SysCacheUtilRuntimeBase {
            final Map<String, Map<String, String>> storage = new HashMap<>();
            int seconds;

            @Override
            public ISystemRuntime getSystemRuntime() {
                return runtime;
            }

            @Override
            protected void onSet(String category, String key, String json, int ttl) {
                storage.computeIfAbsent(category, unused -> new HashMap<>()).put(key, json);
                seconds = ttl;
            }

            @Override
            protected String onGet(String category, String key) {
                return storage.getOrDefault(category, Map.of()).get(key);
            }
        }
        Cache cache = new Cache();
        String legacyKey = "ex-psdevuser-ibizcentral-SYS-library-a";
        String key = PSDevUserCacheCodec.cacheKey(legacyKey);
        PSDevSysUser expected = system();
        cache.set("user-token", legacyKey, (Object) expected, 120);
        String oldJson = cache.get("user-token", legacyKey);
        assertNull(cache.get("user-token", key, Entry.class));
        assertNull(PSDevUserCacheCodec.decode(null, "SYS", "library-a"));
        cache.set("user-token", key, (Object) PSDevUserCacheCodec.encode(expected), 120);
        assertEquals(120, cache.seconds);
        IPSDevSysUser first = (IPSDevSysUser) PSDevUserCacheCodec.decode(
                cache.get("user-token", key, Entry.class), "SYS", "library-a");
        IPSDevSysUser second = (IPSDevSysUser) PSDevUserCacheCodec.decode(
                cache.get("user-token", key, Entry.class), "SYS", "library-a");
        assertCommon(expected, first);
        assertCommon(expected, second);
        assertEquals(3, second.getAccMode());
        assertTrue(second.isAdminMode());
        assertNotSame(first, second);
        assertEquals(oldJson, cache.get("user-token", legacyKey));
    }

    @Test
    void versionedKeysKeepScopeAndRejectMissingKeys() {
        assertEquals("center-key:auth-json-v1", PSDevUserCacheCodec.cacheKey("center-key"));
        assertFalse(PSDevUserCacheCodec.cacheKey("SYS-a").equals(
                PSDevUserCacheCodec.cacheKey("SLN-a")));
        assertThrows(IllegalArgumentException.class, () -> PSDevUserCacheCodec.cacheKey(null));
        assertThrows(IllegalArgumentException.class, () -> PSDevUserCacheCodec.cacheKey(""));
    }
}
