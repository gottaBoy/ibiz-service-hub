package net.ibizsys.central.cloud.saas.core.cloudutil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.SystemGateway;
import net.ibizsys.central.cloud.core.ServiceHubBase;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.error.UnauthorizedException;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;

@Isolated
class CloudSaaSUserConfigTest {

    private static final String FOLDER = "customtheme";
    private static final String TAG = "isolated_test_tag";
    private MemoryRuntime runtime;
    private ISystemGateway originalGateway;

    @BeforeEach
    void setUp() {
        originalGateway = SystemGateway.getInstance(true);
        clearThreadContext();
        runtime = new MemoryRuntime();
        session("session-a", "tenant-a", "system-a", "user-a");
    }

    @AfterEach
    void clearContext() {
        try {
            clearThreadContext();
        } finally {
            ContextlessServiceHub.setGateway(originalGateway);
        }
    }

    private void clearThreadContext() {
        EmployeeContext.setCurrentDisabled(false);
        SecurityContextHolder.clearContext();
        UserContext.setCurrent(null);
    }

    @Test
    void missingThenSaveIsVisibleInTheSameSession() {
        assertNull(read());
        runtime.saveConfig(FOLDER, TAG, "saved");
        assertEquals("saved", read());
    }

    @Test
    void updatedConfigurationIsVisibleWithoutRelogin() {
        runtime.saveConfig(FOLDER, TAG, "first");
        assertEquals("first", read());
        runtime.saveConfig(FOLDER, TAG, "second");
        assertEquals("second", read());
    }

    @Test
    void resetRemovesThePreviouslyReadValueInTheSameSession() {
        runtime.saveConfig(FOLDER, TAG, "saved");
        assertEquals("saved", read());
        runtime.removeConfig(FOLDER, TAG);
        assertNull(read());
        assertNull(read());
    }

    @Test
    void saveIsVisibleToAnotherAlreadyAuthenticatedSession() {
        runtime.saveConfig(FOLDER, TAG, "first");
        session("session-b", "tenant-a", "system-a", "user-a");
        assertEquals("first", read());
        session("session-a", "tenant-a", "system-a", "user-a");
        runtime.saveConfig(FOLDER, TAG, "second");
        session("session-b", "tenant-a", "system-a", "user-a");
        assertEquals("second", read());
    }

    @Test
    void resetIsVisibleToAnotherAlreadyAuthenticatedSession() {
        runtime.saveConfig(FOLDER, TAG, "saved");
        session("session-b", "tenant-a", "system-a", "user-a");
        assertEquals("saved", read());
        session("session-a", "tenant-a", "system-a", "user-a");
        runtime.removeConfig(FOLDER, TAG);
        session("session-b", "tenant-a", "system-a", "user-a");
        assertNull(read());
    }

    @Test
    void globalFallbackDoesNotLeakIntoPrivateReads() {
        runtime.saveConfig(FOLDER, TAG, "global", true);
        session("session-b", "tenant-a", "system-a", "user-b");
        assertEquals("global", runtime.getConfig(FOLDER, TAG, true, true).getCfg());
        assertNull(read());
        runtime.saveConfig(FOLDER, TAG, "private");
        assertEquals("private", runtime.getConfig(FOLDER, TAG, true, true).getCfg());
        runtime.removeConfig(FOLDER, TAG);
        assertNull(read());
        assertEquals("global", runtime.getConfig(FOLDER, TAG, true, true).getCfg());
    }

    @Test
    void systemUserFolderAndTagRemainIsolated() {
        runtime.saveConfig(FOLDER, TAG, "original");
        for (String[] identity : new String[][] {
                { "system-b", "user-a" },
                { "system-a", "user-b" } }) {
            session("same-token", "tenant-a", identity[0], identity[1]);
            assertNull(read());
            runtime.saveConfig(FOLDER, TAG, "other");
            runtime.removeConfig(FOLDER, TAG);
        }
        session("session-a", "tenant-a", "system-a", "user-a");
        assertNull(runtime.getConfig("other-folder", TAG, true).getCfg());
        assertNull(runtime.getConfig(FOLDER, "other-tag", true).getCfg());
        assertEquals("original", read());
    }

    @Test
    void failedMutationsDoNotHideThePersistedConfiguration() {
        runtime.saveConfig(FOLDER, TAG, "original");
        assertEquals("original", read());
        runtime.failMutation = true;
        assertThrows(IllegalStateException.class, () -> runtime.saveConfig(FOLDER, TAG, "changed"));
        assertThrows(IllegalStateException.class, () -> runtime.removeConfig(FOLDER, TAG));
        assertEquals("original", read());
    }

    @Test
    void readsForwardTryAndShareModesToPersistenceEveryTime() {
        assertNull(runtime.getConfig(FOLDER, TAG, true, false).getCfg());
        assertThrows(IllegalStateException.class, () -> runtime.getConfig(FOLDER, TAG, false, false));
        assertNull(runtime.getConfig(FOLDER, TAG, true, true).getCfg());
        assertEquals(Arrays.asList("true:false", "false:false", "true:true"), runtime.readModes);
    }

    @Test
    void mutableUserConfigsNeverReadOrPopulateSessionCache() {
        runtime.saveConfig(FOLDER, TAG, "saved");
        assertEquals("saved", read());
        assertEquals("saved", read());
        runtime.removeConfig(FOLDER, TAG);
        assertNull(read());
        assertEquals(0, runtime.cacheCalls);
    }

    @Test
    void missingAuthenticationIsRejectedBeforePersistence() {
        SecurityContextHolder.clearContext();
        assertNotNull(EmployeeContext.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.getConfig(FOLDER, TAG, true));
        assertNoPersistenceCalls();
    }

    @Test
    void missingAuthenticationSaveIsRejectedBeforePersistence() {
        SecurityContextHolder.clearContext();
        assertNotNull(EmployeeContext.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "saved"));
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "shared", true));
        assertNoPersistenceCalls();
    }

    @Test
    void missingAuthenticationRemoveIsRejectedBeforePersistence() {
        SecurityContextHolder.clearContext();
        assertNotNull(EmployeeContext.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.removeConfig(FOLDER, TAG));
        assertNoPersistenceCalls();
    }

    @Test
    void missingAllEmployeeContextFallbacksGetIsRejectedBeforePersistence() {
        clearEmployeeContextFallbacks();
        assertThrows(UnauthorizedException.class, () -> runtime.getConfig(FOLDER, TAG, true));
        assertNoPersistenceCalls();
    }

    @Test
    void missingAllEmployeeContextFallbacksSaveIsRejectedBeforePersistence() {
        clearEmployeeContextFallbacks();
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "saved"));
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "shared", true));
        assertNoPersistenceCalls();
    }

    @Test
    void missingAllEmployeeContextFallbacksRemoveIsRejectedBeforePersistence() {
        clearEmployeeContextFallbacks();
        assertThrows(UnauthorizedException.class, () -> runtime.removeConfig(FOLDER, TAG));
        assertNoPersistenceCalls();
    }

    @Test
    void disabledEmployeeContextGetIsRejectedBeforePersistence() {
        EmployeeContext.setCurrentDisabled(true);
        assertNotNull(AuthenticationUser.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.getConfig(FOLDER, TAG, true));
        assertNoPersistenceCalls();
    }

    @Test
    void disabledEmployeeContextSaveIsRejectedBeforePersistence() {
        EmployeeContext.setCurrentDisabled(true);
        assertNotNull(AuthenticationUser.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "saved"));
        assertThrows(UnauthorizedException.class, () -> runtime.saveConfig(FOLDER, TAG, "shared", true));
        assertNoPersistenceCalls();
    }

    @Test
    void disabledEmployeeContextRemoveIsRejectedBeforePersistence() {
        EmployeeContext.setCurrentDisabled(true);
        assertNotNull(AuthenticationUser.getCurrent());
        assertThrows(UnauthorizedException.class, () -> runtime.removeConfig(FOLDER, TAG));
        assertNoPersistenceCalls();
    }

    @Test
    void authenticatedDetailsFallbackSupportsConfigRoundTrip() {
        IEmployeeContext context = EmployeeContext.getCurrentMust();
        useEmployeeContextFallback(null, context, null);
        assertConfigRoundTrip();
    }

    @Test
    void authenticatedCredentialsFallbackSupportsConfigRoundTrip() {
        IEmployeeContext context = EmployeeContext.getCurrentMust();
        useEmployeeContextFallback(context, null, null);
        assertConfigRoundTrip();
    }

    @Test
    void authenticatedPrincipalFallbackSupportsConfigRoundTrip() {
        IEmployeeContext context = EmployeeContext.getCurrentMust();
        useEmployeeContextFallback(null, null, context);
        assertConfigRoundTrip();
    }

    @Test
    void apiUserSupportsDelegatedEmployeeConfigRoundTrip() {
        AuthenticationUser authentication = (AuthenticationUser) AuthenticationUser.getCurrentMust();
        authentication.setApiuser(1);
        authentication.setUserid("delegating-api-user");
        assertConfigRoundTrip();
    }

    @Test
    void superuserSupportsDelegatedEmployeeConfigRoundTrip() {
        AuthenticationUser authentication = (AuthenticationUser) AuthenticationUser.getCurrentMust();
        authentication.setSuperuser(1);
        authentication.setUserid("delegating-superuser");
        assertConfigRoundTrip();
    }

    private void clearEmployeeContextFallbacks() {
        // A deterministic no-recovery hub lets getCurrent exhaust every fallback.
        ContextlessServiceHub.setGateway(new ContextlessServiceHub());
        useEmployeeContextFallback(null, null, null);
        assertNotNull(AuthenticationUser.getCurrent());
        assertFalse(EmployeeContext.isCurrentDisabled());
        assertNull(EmployeeContext.getCurrent());
    }

    private void useEmployeeContextFallback(IEmployeeContext credentials,
            IEmployeeContext details, IEmployeeContext principalContext) {
        AuthenticationUser authentication = (AuthenticationUser) AuthenticationUser.getCurrentMust();
        authentication.setEmployeeContext(principalContext);
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                authentication, credentials, authentication.getAuthorities());
        token.setDetails(details);
        SecurityContextHolder.getContext().setAuthentication(token);
        UserContext.setCurrent(null);
    }

    private void assertNoPersistenceCalls() {
        assertEquals(0, runtime.readModes.size());
        assertEquals(0, runtime.saveCalls);
        assertEquals(0, runtime.removeCalls);
        assertEquals(0, runtime.cacheCalls);
        assertTrue(runtime.values.isEmpty());
    }

    private void assertConfigRoundTrip() {
        runtime.saveConfig(FOLDER, TAG, "saved");
        assertEquals("saved", read());
        runtime.removeConfig(FOLDER, TAG);
        assertNull(read());
        assertEquals(2, runtime.readModes.size());
        assertEquals(1, runtime.saveCalls);
        assertEquals(1, runtime.removeCalls);
        assertEquals(0, runtime.cacheCalls);
    }

    private String read() {
        return runtime.getConfig(FOLDER, TAG, true).getCfg();
    }

    private void session(String token, String tenant, String system, String user) {
        Employee employee = new Employee();
        employee.setUserId(user);
        employee.setUAAUserId("uaa-" + user);
        employee.setSrfdcid(tenant);
        EmployeeContext context = new EmployeeContext(employee, null, system);
        AuthenticationUser authentication = new AuthenticationUser();
        authentication.setUserid("uaa-" + user);
        authentication.setToken(token);
        AuthenticationUser.setCurrent(authentication, context);
    }

    private static class ContextlessServiceHub extends ServiceHubBase {
        static void setGateway(ISystemGateway gateway) {
            setInstance(gateway);
        }

        @Override
        public boolean redoFilter() {
            return false;
        }
    }

    private static class MemoryRuntime extends CloudSaaSUtilRuntimeBase {
        final Map<String, String> values = new HashMap<>();
        final Map<List<Object>, Object> cached = new HashMap<>();
        final List<String> readModes = new java.util.ArrayList<>();
        boolean failMutation;
        int cacheCalls;
        int saveCalls;
        int removeCalls;

        final ISysCacheUtilRuntime cache = (ISysCacheUtilRuntime) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] { ISysCacheUtilRuntime.class },
                (proxy, method, args) -> {
                    cacheCalls++;
                    List<Object> key = Arrays.asList(args[0], args[1]);
                    if (method.getName().equals("get")) return cached.get(key);
                    if (method.getName().equals("set")) {
                        cached.put(key, args[2]);
                        return null;
                    }
                    throw new AssertionError("Unexpected cache operation: " + method.getName());
                });

        @Override
        protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
            return cache;
        }

        @Override
        protected <T> T executeAction(String name, IAction action, Object[] args, Class<T> type) {
            try {
                return type.cast(action.execute(args));
            } catch (RuntimeException ex) {
                throw ex;
            } catch (Throwable ex) {
                throw new AssertionError(ex);
            }
        }

        private String key(String folder, String tag, boolean global) {
            IEmployeeContext context = EmployeeContext.getCurrentMust();
            return KeyValueUtils.genUniqueId(context.getSystemid(), folder, tag,
                    global ? "__GLOBAL__" : context.getUserid());
        }

        @Override
        protected Config onGetConfig(String folder, String tag, boolean tryMode, boolean tryGlobal) {
            readModes.add(tryMode + ":" + tryGlobal);
            String value = values.get(key(folder, tag, false));
            if (value == null && tryGlobal) value = values.get(key(folder, tag, true));
            if (value == null && !tryMode) throw new IllegalStateException("Missing config");
            return new Config().setCfg(value);
        }

        @Override
        protected Config onSaveConfig(String folder, String tag, Object value, boolean global) {
            saveCalls++;
            if (failMutation) throw new IllegalStateException("Save failed");
            values.put(key(folder, tag, false), (String) value);
            if (global) values.put(key(folder, tag, true), (String) value);
            return new Config().setCfg((String) value);
        }

        @Override
        protected void onRemoveConfig(String folder, String tag) {
            removeCalls++;
            if (failMutation) throw new IllegalStateException("Remove failed");
            values.remove(key(folder, tag, false));
        }
    }
}
