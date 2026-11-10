package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SystemAccessManagerRequestCacheTest {
    private static class Manager extends SystemAccessManagerBase {
        IPSDevSysUser fresh;
        int lookups;

        @Override
        public IPSDevUserBase getPSDevUserBase(String type, String id) {
            assertEquals("SYS", type);
            assertEquals("library-a", id);
            lookups++;
            return fresh;
        }

        IPSDevSysUser current(boolean tryMode) throws Throwable {
            return onGetCurrentPSDevSysUser(tryMode);
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
        PSDevSysUser value = new PSDevSysUser();
        value.setPSDevSlnSysId("library-a");
        value.setAccMode(mode);
        if (expired) {
            value.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
        }
        return value;
    }

    private String cacheKey() {
        return String.format("CACHE_%s_%s", "library-a", IPSDevSysUser.class);
    }

    @Test
    void activeHolderIsReturnedWithoutLookup() throws Throwable {
        Manager manager = new Manager();
        PSDevSysUser value = user(3, false);
        PSDevSysUserHolder.push(value);
        assertSame(value, manager.current(false));
        assertEquals(0, manager.lookups);
    }

    @Test
    void explicitActiveNestedHolderKeepsItsScopedRoot() throws Throwable {
        Manager manager = new Manager();
        PSDevSysUser value = user(3, false);
        value.setPSDevSlnSysId("nested-library");
        PSDevSysUserHolder.push(value);
        assertSame(value, manager.current(false));
        assertEquals(0, manager.lookups);
    }

    @Test
    void expiredHolderIsDeniedInOptionalAndRequiredModes() throws Throwable {
        Manager manager = new Manager();
        PSDevSysUserHolder.push(user(3, true));
        assertNull(manager.current(true));
        assertThrows(Exception.class, () -> manager.current(false));
        assertEquals(0, manager.lookups);
    }

    @Test
    void nonpositiveHolderCannotGrantAccess() throws Throwable {
        for (int mode : new int[] {0, -1}) {
            Manager manager = new Manager();
            PSDevSysUserHolder.push(user(mode, false));
            try {
                assertNull(manager.current(true));
                assertThrows(Exception.class, () -> manager.current(false));
                assertEquals(0, manager.lookups);
            } finally {
                PSDevSysUserHolder.poll();
            }
        }
    }

    @Test
    void activeActionCacheIsReturnedWithoutLookup() throws Throwable {
        Manager manager = new Manager();
        PSDevSysUser value = user(1, false);
        ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), value);
        assertSame(value, manager.current(false));
        assertEquals(0, manager.lookups);
    }

    @Test
    void expiredActionCacheIsDeniedInOptionalAndRequiredModes() throws Throwable {
        Manager manager = new Manager();
        ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), user(3, true));
        assertNull(manager.current(true));
        assertThrows(Exception.class, () -> manager.current(false));
        assertEquals(0, manager.lookups);
    }

    @Test
    void nonpositiveActionCacheCannotGrantAccess() throws Throwable {
        for (int mode : new int[] {0, -1}) {
            Manager manager = new Manager();
            ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), user(mode, false));
            assertNull(manager.current(true));
            assertThrows(Exception.class, () -> manager.current(false));
            assertEquals(0, manager.lookups);
        }
    }

    @Test
    void freshAuthorizationIsRecheckedAfterExpiryChanges() throws Throwable {
        Manager manager = new Manager();
        PSDevSysUser value = user(3, false);
        manager.fresh = value;
        assertSame(value, manager.current(false));
        assertEquals(1, manager.lookups);
        value.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
        assertNull(manager.current(true));
        assertThrows(Exception.class, () -> manager.current(false));
        assertEquals(1, manager.lookups);
    }

    @Test
    void invalidFreshAuthorizationCannotPopulateActionCache() throws Throwable {
        for (PSDevSysUser value : new PSDevSysUser[] {user(3, true), user(0, false), user(-1, false)}) {
            Manager manager = new Manager();
            manager.fresh = value;
            assertNull(manager.current(true));
            assertNull(ActionSessionManager.getCurrentSession().getActionParam(cacheKey()));
            assertThrows(Exception.class, () -> manager.current(false));
            assertNull(ActionSessionManager.getCurrentSession().getActionParam(cacheKey()));
        }
    }

    @Test
    void actionCacheCannotSubstituteAnAuthorizationForAnotherRoot() throws Throwable {
        for (String root : new String[] {null, "", "library-b"}) {
            Manager manager = new Manager();
            PSDevSysUser value = user(3, false);
            value.setPSDevSlnSysId(root);
            value.setAdminMode(true);
            ActionSessionManager.getCurrentSession().setActionParam(cacheKey(), value);
            assertNull(manager.current(true));
            assertThrows(Exception.class, () -> manager.current(false));
            assertEquals(0, manager.lookups);
        }
    }

    @Test
    void freshAuthorizationMustMatchTheRequestedRootBeforeCaching() throws Throwable {
        for (String root : new String[] {null, "", "library-b"}) {
            Manager manager = new Manager();
            PSDevSysUser value = user(3, false);
            value.setPSDevSlnSysId(root);
            value.setAdminMode(true);
            manager.fresh = value;
            assertNull(manager.current(true));
            assertNull(ActionSessionManager.getCurrentSession().getActionParam(cacheKey()));
            assertThrows(Exception.class, () -> manager.current(false));
            assertNull(ActionSessionManager.getCurrentSession().getActionParam(cacheKey()));
        }
    }

    @Test
    void malformedRequestRootsAreRejectedWithoutLookup() throws Throwable {
        for (Object root : new Object[] {null, "", " ", 123, " library-a",
                "library-a ", "library\n-a", "library\u0000a"}) {
            Manager manager = new Manager();
            ActionSessionManager.getAppContext().set("PSDEVSLNSYS", root);
            assertNull(manager.current(true));
            assertThrows(Exception.class, () -> manager.current(false));
            assertEquals(0, manager.lookups);
        }
    }
}
