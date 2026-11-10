package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnUserService;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageImpl;

class SystemAccessManagerGrantTest {
    private static class Manager extends SystemAccessManagerBase {
        PSDevSlnUserDTO grant(boolean tryMode) throws Exception {
            PSDevSlnSysDTO system = new PSDevSlnSysDTO();
            system.setPSDevSlnId("scheme-a");
            system.setPSDevSlnSysId("library-a");
            return getPSDevSlnUserDTO(system, "editor-a", tryMode);
        }
    }

    private Manager manager(List<PSDevSlnUserDTO> grants) throws Exception {
        Manager manager = new Manager();
        PSDevSlnDTO scheme = new PSDevSlnDTO();
        scheme.setPSDevSlnId("scheme-a");
        scheme.setAdminPSDevUserId("different-owner");
        Object schemeService = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IPSDevSlnService.class}, (proxy, method, args) -> {
                    if ("get".equals(method.getName())) {
                        assertEquals("scheme-a", args[0]);
                        return scheme;
                    }
                    throw new AssertionError("Unexpected scheme service call: " + method.getName());
                });
        Object memberService = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IPSDevSlnUserService.class}, (proxy, method, args) -> {
                    if ("fetchDefault".equals(method.getName())) {
                        return new PageImpl<>(grants);
                    }
                    throw new AssertionError("Unexpected member service call: " + method.getName());
                });
        inject(manager, "iPSDevSlnService", schemeService);
        inject(manager, "iPSDevSlnUserService", memberService);
        return manager;
    }

    private void inject(Manager manager, String name, Object value) throws Exception {
        Field field = SystemAccessManagerBase.class.getDeclaredField(name);
        field.setAccessible(true);
        field.set(manager, value);
    }

    private PSDevSlnUserDTO grant(Integer target, String root, String user, Integer mode, Long expiry) {
        PSDevSlnUserDTO grant = new PSDevSlnUserDTO();
        grant.setAllSysFlag(target);
        grant.setPSDevSlnSysId(root);
        grant.setPSDevUserObjId(user);
        grant.setAccMode(mode);
        if (expiry != null) grant.setExpiredTime(new Timestamp(expiry));
        return grant;
    }

    @Test
    void expiredSpecificAndGlobalMembershipsCannotGrantSystemAccess() throws Exception {
        long expired = System.currentTimeMillis() - 60000;
        Manager manager = manager(Arrays.asList(
                grant(0, "library-a", "editor-a", 3, expired),
                grant(1, null, "editor-a", 3, expired)));
        assertNull(manager.grant(true));
    }

    @Test
    void expiredSpecificMembershipDoesNotHideAnActiveGlobalGrant() throws Exception {
        PSDevSlnUserDTO active = grant(1, null, "editor-a", 1, null);
        assertSame(active, manager(Arrays.asList(
                grant(0, "library-a", "editor-a", 3, System.currentTimeMillis() - 60000),
                active)).grant(true));
    }

    @Test
    void specificMembershipTakesPriorityOverGlobalRegardlessOfPageOrder() throws Exception {
        PSDevSlnUserDTO specific = grant(0, "library-a", "editor-a", 1, null);
        PSDevSlnUserDTO global = grant(1, null, "editor-a", 3, null);
        for (List<PSDevSlnUserDTO> order : Arrays.asList(
                Arrays.asList(global, specific), Arrays.asList(specific, global))) {
            assertSame(specific, manager(order).grant(true));
        }
    }

    @Test
    void missingScopeOrAccessModeAndNegativeBitmasksAreNotGrants() throws Exception {
        assertNull(manager(Arrays.asList(
                grant(null, "library-a", "editor-a", 3, null),
                grant(0, "library-a", "editor-a", null, null),
                grant(0, "library-a", "editor-a", -1, null),
                grant(1, null, "editor-a", -2, null))).grant(true));
    }

    @Test
    void unrelatedUsersSystemsAndTargetTypesCannotGrantAccess() throws Exception {
        assertNull(manager(Arrays.asList(
                grant(0, "library-b", "editor-a", 3, null),
                grant(0, "library-a", "other-editor", 3, null),
                grant(1, null, "other-editor", 3, null),
                grant(2, "library-a", "editor-a", 3, null))).grant(true));
    }

    @Test
    void explicitZeroAccessPreservesSpecificDenyAndFutureExpiryIsAccepted() throws Exception {
        PSDevSlnUserDTO denied = grant(0, "library-a", "editor-a", 0,
                System.currentTimeMillis() + 60000);
        assertSame(denied, manager(Arrays.asList(
                grant(1, null, "editor-a", 3, null), denied)).grant(true));
    }

    @Test
    void requiredLookupWithoutAnActiveMembershipThrows() throws Exception {
        assertThrows(Exception.class, () -> manager(Arrays.asList(
                grant(0, "library-a", "editor-a", 3,
                        System.currentTimeMillis() - 60000))).grant(false));
    }
}
