package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import net.ibizsys.central.SystemRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ErrorException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

class SystemAccessManagerCacheTest {
    private Authentication previousAuthentication;
    private IUserContext previousUserContext;

    private static class Manager extends SystemAccessManagerBase {
        IPSDevUser currentUser;
        IPSDevUserBase cached;
        IPSDevUserBase written;
        PSDevSlnUserDTO membership;
        int membershipReads;
        final SystemRuntime serializer = new SystemRuntime();

        Manager() {
            setSysCacheUtilRuntime((ISysCacheUtilRuntime) Proxy.newProxyInstance(
                    getClass().getClassLoader(), new Class<?>[] {ISysCacheUtilRuntime.class},
                    (proxy, method, args) -> {
                        if ("get".equals(method.getName())) {
                            assertEquals(PSDevUserCacheCodec.Entry.class, args[2]);
                            return cached == null ? null : serializer.deserialize(
                                    serializer.serialize(PSDevUserCacheCodec.encode(cached)),
                                    PSDevUserCacheCodec.Entry.class);
                        }
                        if ("set".equals(method.getName())) {
                            PSDevUserCacheCodec.Entry entry = serializer.deserialize(
                                    serializer.serialize(args[2]), PSDevUserCacheCodec.Entry.class);
                            written = PSDevUserCacheCodec.decode(entry, entry.targetType, "library-a");
                            return null;
                        }
                        throw new AssertionError("Unexpected cache call: " + method.getName());
                    }));
        }

        @Override
        public IPSDevUser getCurrentPSDevUser() {
            return currentUser;
        }

        @Override
        public boolean testSysUserRole(IEmployeeContext context, String role) {
            return false;
        }

        @Override
        protected PSDevSlnUserDTO getPSDevSlnUserDTO(
                PSDevSlnSysDTO system, String userId, boolean tryMode) {
            assertEquals("editor-a", userId);
            membershipReads++;
            return membership;
        }

        @Override
        protected PSDevSlnUserDTO getPSDevSlnUserDTO(
                PSDevSlnDTO scheme, String userId, boolean tryMode) {
            assertEquals("editor-a", userId);
            membershipReads++;
            return membership;
        }

        IPSDevUserBase lookup(String type) throws Throwable {
            return onGetPSDevUserBase(type, "library-a");
        }
    }

    @BeforeEach
    void installIdentity() {
        previousAuthentication = SecurityContextHolder.getContext().getAuthentication();
        previousUserContext = UserContext.getCurrent();
        AuthenticationUser user = new AuthenticationUser();
        user.setUsername("editor-a");
        user.setUserid("editor-a");
        user.setToken("cache-test-token");
        IEmployeeContext employee = (IEmployeeContext) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] {IEmployeeContext.class},
                (proxy, method, args) -> {
                    if ("getUserid".equals(method.getName())) return "editor-a";
                    if ("getUsername".equals(method.getName())) return "Editor A";
                    throw new AssertionError("Unexpected employee call: " + method.getName());
                });
        AuthenticationUser.setCurrent(user, employee);
    }

    @AfterEach
    void restoreIdentity() {
        SecurityContextHolder.getContext().setAuthentication(previousAuthentication);
        UserContext.setCurrent(previousUserContext);
    }

    private Timestamp future(long offset) {
        return new Timestamp(System.currentTimeMillis() + offset);
    }

    private PSDevSlnUser cached(String type, int mode, Timestamp expiry) {
        PSDevSlnUser value = "SYS".equals(type) ? new PSDevSysUser() : new PSDevSlnUser();
        value.setPSDevSlnId("library-a");
        if (value instanceof PSDevSysUser) {
            ((PSDevSysUser)value).setPSDevSlnSysId("library-a");
        }
        value.setAccMode(mode);
        value.setExpiredTime(expiry);
        return value;
    }

    private Manager manager(Timestamp systemExpiry, Timestamp membershipExpiry) throws Exception {
        Manager manager = new Manager();
        PSDevSlnSysDTO system = new PSDevSlnSysDTO();
        system.setPSDevSlnId("scheme-a");
        system.setPSDevSlnSysId("library-a");
        system.setPSDevCenterId("center-a");
        system.setPSSystemId("model-a");
        system.setExpriedTime(systemExpiry);
        manager.membership = new PSDevSlnUserDTO();
        manager.membership.setAccMode(3);
        manager.membership.setExpiredTime(membershipExpiry);
        Object service = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IPSDevSlnSysService.class}, (proxy, method, args) -> {
                    if ("get".equals(method.getName())) {
                        assertEquals("library-a", args[0]);
                        return system;
                    }
                    throw new AssertionError("Unexpected system call: " + method.getName());
                });
        Field field = SystemAccessManagerBase.class.getDeclaredField("iPSDevSlnSysService");
        field.setAccessible(true);
        field.set(manager, service);
        return manager;
    }

    private Manager schemeManager(Timestamp expiry) throws Exception {
        Manager manager = new Manager();
        PSDevSlnDTO scheme = new PSDevSlnDTO();
        scheme.setPSDevSlnId("library-a");
        scheme.setPSDevCenterId("center-a");
        manager.membership = new PSDevSlnUserDTO();
        manager.membership.setAccMode(3);
        manager.membership.setExpiredTime(expiry);
        Object service = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IPSDevSlnService.class}, (proxy, method, args) -> {
                    if ("get".equals(method.getName())) return scheme;
                    throw new AssertionError("Unexpected scheme call: " + method.getName());
                });
        Field field = SystemAccessManagerBase.class.getDeclaredField("iPSDevSlnService");
        field.setAccessible(true);
        field.set(manager, service);
        return manager;
    }

    @Test
    void freshSchemeAuthorizationRetainsMembershipExpiry() throws Throwable {
        Timestamp expiry = future(60000);
        Manager manager = schemeManager(expiry);
        assertEquals(expiry, manager.lookup("SLN").getExpiredTime());
    }

    @Test
    void expiredFreshSchemeAuthorizationCannotPopulateTheCache() throws Exception {
        Manager manager = schemeManager(future(-60000));
        assertThrows(ErrorException.class, () -> manager.lookup("SLN"));
        assertNull(manager.written);
    }

    @Test
    void centerAdminDoesNotInheritSchemeMembershipExpiry() throws Throwable {
        Manager manager = schemeManager(future(-60000));
        PSDevUser admin = new PSDevUser();
        admin.setPSDevUserId("editor-a");
        admin.setPSDevCenterId("center-a");
        admin.setAdminMode(true);
        manager.currentUser = admin;
        assertNull(manager.lookup("SLN").getExpiredTime());
    }

    @Test
    void activeCachedSchemeAndSystemAreReturnedWithoutGrantLookup() throws Throwable {
        for (String type : new String[] {"SLN", "SYS"}) {
            Manager manager = new Manager();
            manager.cached = cached(type, 1, future(60000));
            IPSDevSlnUser actual = (IPSDevSlnUser)manager.lookup(type);
            assertNotSame(manager.cached, actual);
            assertEquals(1, actual.getAccMode());
            assertEquals(manager.cached.getExpiredTime(), actual.getExpiredTime());
            assertEquals(0, manager.membershipReads);
            assertNull(manager.written);
        }
    }

    @Test
    void expiredCachedSchemeAndSystemAreDeniedWithoutReauthorizing() throws Throwable {
        for (String type : new String[] {"SLN", "SYS"}) {
            Manager manager = new Manager();
            manager.cached = cached(type, 3, future(-60000));
            assertNull(manager.lookup(type));
            assertEquals(0, manager.membershipReads);
            assertNull(manager.written);
        }
    }

    @Test
    void zeroCachedAccessIsDeniedForBothScopes() throws Throwable {
        for (String type : new String[] {"SLN", "SYS"}) {
            Manager manager = new Manager();
            manager.cached = cached(type, 0, null);
            assertNull(manager.lookup(type));
        }
    }

    @Test
    void negativeCachedAccessIsDeniedForBothScopes() throws Throwable {
        for (String type : new String[] {"SLN", "SYS"}) {
            Manager manager = new Manager();
            manager.cached = cached(type, -1, null);
            assertNull(manager.lookup(type));
        }
    }

    @Test
    void negativeFreshSystemMembershipCannotGrantAccess() throws Throwable {
        Manager manager = manager(null, null);
        manager.membership.setAccMode(-1);
        assertNull(manager.lookup("SYS"));
        manager.cached = manager.written;
        assertNull(manager.lookup("SYS"));
        assertEquals(1, manager.membershipReads);
    }

    @Test
    void systemGrantIsCappedToEarlierMembershipExpiry() throws Throwable {
        Timestamp earlier = future(60000);
        Manager manager = manager(future(120000), earlier);
        PSDevSysUser result = (PSDevSysUser) manager.lookup("SYS");
        assertEquals(earlier, result.getExpiredTime());
        assertEquals("library-a", result.getPSDevSlnSysId());
        assertEquals("model-a", result.getPSSystemId());
        assertFalse(result.isAdminMode());
        assertNotSame(result, manager.written);
        assertEquals(result.getExpiredTime(), manager.written.getExpiredTime());
        assertEquals(result.getAccMode(), ((IPSDevSysUser)manager.written).getAccMode());
        assertEquals(result.getPSDevSlnSysId(), ((IPSDevSysUser)manager.written).getPSDevSlnSysId());
        assertEquals(1, manager.membershipReads);
    }

    @Test
    void systemExpiryIsRetainedWhenEarlierThanMembership() throws Throwable {
        Timestamp earlier = future(60000);
        Manager manager = manager(earlier, future(120000));
        assertEquals(earlier, manager.lookup("SYS").getExpiredTime());
    }

    @Test
    void membershipExpiryIsRetainedWithoutSystemExpiry() throws Throwable {
        Timestamp expiry = future(60000);
        Manager manager = manager(null, expiry);
        assertEquals(expiry, manager.lookup("SYS").getExpiredTime());
    }

    @Test
    void unboundedMembershipDoesNotEraseSystemExpiry() throws Throwable {
        Timestamp expiry = future(60000);
        Manager manager = manager(expiry, null);
        assertEquals(expiry, manager.lookup("SYS").getExpiredTime());
    }

    @Test
    void expiredSystemCannotPopulateAuthorizationCache() throws Exception {
        Manager manager = manager(future(-60000), null);
        assertThrows(ErrorException.class, () -> manager.lookup("SYS"));
        assertNull(manager.written);
    }

    @Test
    void expiredMembershipCannotPopulateAuthorizationCache() throws Exception {
        Manager manager = manager(null, future(-60000));
        assertThrows(ErrorException.class, () -> manager.lookup("SYS"));
        assertNull(manager.written);
    }

    @Test
    void cachedAuthorizationIsRecheckedAfterItsExpiryChanges() throws Throwable {
        Manager manager = manager(null, future(60000));
        PSDevSysUser result = (PSDevSysUser) manager.lookup("SYS");
        manager.cached = result;
        result.setExpiredTime(future(-60000));
        assertNull(manager.lookup("SYS"));
        assertEquals(1, manager.membershipReads);
    }

    @Test
    void centerAdminDoesNotInheritMembershipExpiryButStillRespectsSystemExpiry() throws Throwable {
        Timestamp expiry = future(60000);
        Manager manager = manager(expiry, future(-60000));
        PSDevUser admin = new PSDevUser();
        admin.setPSDevUserId("editor-a");
        admin.setPSDevCenterId("center-a");
        admin.setAdminMode(true);
        manager.currentUser = admin;
        PSDevSysUser result = (PSDevSysUser) manager.lookup("SYS");
        assertEquals(expiry, result.getExpiredTime());
        assertEquals(3, result.getAccMode());
        manager.cached = result;
        result.setExpiredTime(future(-60000));
        assertNull(manager.lookup("SYS"));
    }
}
