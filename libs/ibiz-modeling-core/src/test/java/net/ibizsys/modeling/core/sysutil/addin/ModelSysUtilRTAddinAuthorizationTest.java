package net.ibizsys.modeling.core.sysutil.addin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.SystemRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.modeling.core.security.IPSDevSysUser;
import net.ibizsys.modeling.core.security.IPSDevUserBase;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.security.PSDevSysUser;
import net.ibizsys.modeling.core.security.SystemAccessManagerBase;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelSysUtilRTAddinAuthorizationTest {
    private final Host host = new Host();
    private final Manager manager = new Manager();
    private final Addin addin = new Addin();

    private class Host extends SystemRuntime {
        @Override
        public ISystemAccessManager getSystemAccessManager() {
            return manager;
        }
    }

    private class Manager extends SystemAccessManagerBase {
        IPSDevSysUser fresh;
        int lookups;
        final List<Boolean> tryModes = new ArrayList<>();

        @Override
        public ISystemRuntime getSystemRuntime() {
            return host;
        }

        @Override
        public IPSDevSysUser getCurrentPSDevSysUser(boolean tryMode) {
            tryModes.add(tryMode);
            return super.getCurrentPSDevSysUser(tryMode);
        }

        @Override
        public IPSDevUserBase getPSDevUserBase(String type, String id) {
            assertEquals("SYS", type);
            assertEquals("library-a", id);
            lookups++;
            return fresh;
        }
    }

    private class Addin extends ModelSysUtilRTAddinBase {
        @Override
        protected ISysUtilRuntime getSysUtilRuntime() {
            throw new UnsupportedOperationException("Authorization tests do not invoke sysutil operations");
        }

        @Override
        public ISystemRuntime getSystemRuntime() {
            return host;
        }
    }

    @BeforeEach
    void openSession() {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        ActionSession session = ActionSessionManager.openSession();
        session.setAppContext(AppContext.newInstance(null));
        session.getAppContext().set("PSDEVSLNSYS", "library-a");
    }

    @AfterEach
    void closeSession() {
        PSDevSysUserHolder.clear();
        ActionSessionManager.closeSession(false);
    }

    private PSDevSysUser user(int mode, boolean expired) {
        PSDevSysUser user = new PSDevSysUser();
        user.setPSDevSlnSysId("library-a");
        user.setPSSystemId("model-a");
        user.setAccMode(mode);
        if (expired) {
            user.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
        }
        return user;
    }

    private String cacheKey() {
        return String.format("CACHE_%s_%s", "library-a", IPSDevSysUser.class);
    }

    @Test
    void activeHolderAndRootAreResolvedThroughTheCentralManager() throws Exception {
        PSDevSysUser user = user(3, false);
        PSDevSysUserHolder.push(user);
        assertSame(user, addin.getCurrentPSDevSysUser());
        assertSame(user, addin.getCurrentPSDevSysUser(true));
        assertEquals("library-a", addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(false, true, false), manager.tryModes);
        assertEquals(0, manager.lookups);
    }

    @Test
    void expiredHolderCannotBypassOptionalRequiredOrRootResolution() throws Exception {
        PSDevSysUserHolder.push(user(3, true));
        assertNull(addin.getCurrentPSDevSysUser(true));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSysUser());
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(true, false, false), manager.tryModes);
        assertEquals(0, manager.lookups);
    }

    @Test
    void nonpositiveHolderCannotSupplyAnAuthorizedRoot() throws Exception {
        for (int mode : new int[] {0, -1}) {
            PSDevSysUserHolder.push(user(mode, false));
            try {
                assertNull(addin.getCurrentPSDevSysUser(true));
                assertThrows(Exception.class, () -> addin.getCurrentPSDevSysUser(false));
                assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
            } finally {
                PSDevSysUserHolder.poll();
            }
        }
        assertEquals(6, manager.tryModes.size());
        assertEquals(0, manager.lookups);
    }

    @Test
    void activeSessionCacheDelegatesWithoutAnIndependentAddinCache() throws Exception {
        PSDevSysUser user = user(1, false);
        ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), user);
        assertSame(user, addin.getCurrentPSDevSysUser(true));
        assertEquals("library-a", addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(true, false), manager.tryModes);
        assertEquals(0, manager.lookups);
    }

    @Test
    void expiredSessionCacheCannotBypassCentralValidation() throws Exception {
        ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), user(3, true));
        assertNull(addin.getCurrentPSDevSysUser(true));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSysUser(false));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(true, false, false), manager.tryModes);
        assertEquals(0, manager.lookups);
    }

    @Test
    void nonpositiveSessionCacheCannotSupplyAnAuthorizedRoot() throws Exception {
        for (int mode : new int[] {0, -1}) {
            ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), user(mode, false));
            assertNull(addin.getCurrentPSDevSysUser(true));
            assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        }
        assertEquals(4, manager.tryModes.size());
        assertEquals(0, manager.lookups);
    }

    @Test
    void freshUserAndRootAreRecheckedAfterDeadlineChanges() throws Exception {
        PSDevSysUser user = user(3, false);
        manager.fresh = user;
        assertSame(user, addin.getCurrentPSDevSysUser());
        assertEquals("library-a", addin.getCurrentPSDevSlnSysId());
        assertEquals(1, manager.lookups);
        user.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
        assertNull(addin.getCurrentPSDevSysUser(true));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSysUser());
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(1, manager.lookups);
    }

    @Test
    void rawContextRootDoesNotBypassMissingAuthorization() throws Exception {
        assertNull(addin.getCurrentPSDevSysUser(true));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(true, false), manager.tryModes);
        assertEquals(2, manager.lookups);
        assertNull(ActionSessionManager.getCurrentSession().getActionParam(cacheKey()));
    }

    @Test
    void missingContextRootPreservesCentralTryModeBehavior() throws Exception {
        ActionSessionManager.getCurrentSession().setAppContext(AppContext.newInstance(null));
        assertNull(addin.getCurrentPSDevSysUser(true));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSysUser(false));
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(true, false, false), manager.tryModes);
        assertEquals(0, manager.lookups);
    }

    @Test
    void activeHolderStillNeedsANonemptyRoot() {
        PSDevSysUser user = user(3, false);
        user.setPSDevSlnSysId("");
        PSDevSysUserHolder.push(user);
        assertThrows(Exception.class, () -> addin.getCurrentPSDevSlnSysId());
        assertEquals(List.of(false), manager.tryModes);
    }
}
