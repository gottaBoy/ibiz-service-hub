package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnUserService;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageImpl;

class SystemAccessManagerSchemeGrantTest {
    private static class Manager extends SystemAccessManagerBase {
        PSDevSlnUserDTO scheme(String owner) throws Exception {
            PSDevSlnDTO scheme = new PSDevSlnDTO();
            scheme.setPSDevSlnId("scheme-a");
            scheme.setAdminPSDevUserId(owner);
            return getPSDevSlnUserDTO(scheme, "editor-a", true);
        }

        Integer mode(int target, String id) throws Exception {
            return getPSDevUserAccMode("scheme-a", target, id, null, "editor-a");
        }
    }

    private Manager manager(PSDevSlnUserDTO... grants) throws Exception {
        Manager manager = new Manager();
        List<PSDevSlnUserDTO> rows = Arrays.asList(grants);
        Object entityRuntime = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IDataEntityRuntime.class}, (proxy, method, args) -> {
                    if ("createEntity".equals(method.getName())) return new PSDevSlnUserDTO();
                    throw new AssertionError("Unexpected runtime call: " + method.getName());
                });
        Object service = Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class<?>[] {IPSDevSlnUserService.class}, (proxy, method, args) -> {
                    if ("fetchDefault".equals(method.getName())) return new PageImpl<>(rows);
                    if ("getDataEntityRuntime".equals(method.getName())) return entityRuntime;
                    throw new AssertionError("Unexpected service call: " + method.getName());
                });
        Field field = SystemAccessManagerBase.class.getDeclaredField("iPSDevSlnUserService");
        field.setAccessible(true);
        field.set(manager, service);
        return manager;
    }

    private PSDevSlnUserDTO grant(Integer target, Integer mode, Timestamp expiry) {
        PSDevSlnUserDTO value = new PSDevSlnUserDTO();
        value.setPSDevSlnId("scheme-a");
        value.setPSDevUserObjId("editor-a");
        value.setAllSysFlag(target);
        value.setPSDevSlnSysId("library-a");
        value.setPSDevSlnTemplId("template-a");
        value.setPSDevSlnSysDynaInstId("dynamic-a");
        value.setAccMode(mode);
        value.setExpiredTime(expiry);
        return value;
    }

    private Timestamp deadline(long offset) {
        return new Timestamp(System.currentTimeMillis() + offset);
    }

    @Test
    void negativeAndZeroSpecificMembershipsCannotBecomeSchemeRead() throws Exception {
        for (int mode : new int[] {-1, 0}) {
            assertNull(manager(grant(0, mode, null)).mode(1, null));
            assertEquals(0, manager(grant(0, mode, null)).scheme("other-owner").getAccMode());
        }
    }

    @Test
    void malformedAndUnknownMembershipsDoNotGrantSchemeRead() throws Exception {
        assertNull(manager(grant(99, 3, null), grant(null, 3, null),
                grant(0, null, null), grant(1, -1, null)).mode(1, null));
    }

    @Test
    void expiredMembershipsCannotGrantEitherScope() throws Exception {
        Manager manager = manager(grant(0, 3, deadline(-60000)),
                grant(1, 3, deadline(-60000)));
        assertNull(manager.mode(1, null));
        assertNull(manager.mode(0, "library-a"));
    }

    @Test
    void positiveKnownSpecificMembershipsGrantReadWithTheirDeadline() throws Exception {
        Timestamp expiry = deadline(60000);
        for (int target : new int[] {
                PSModelEnums.DevSlnUserTarget.SYS.value,
                PSModelEnums.DevSlnUserTarget.TEMPL.value,
                PSModelEnums.DevSlnUserTarget.DYNAINST.value}) {
            PSDevSlnUserDTO result = manager(grant(target, 3, expiry)).scheme("other-owner");
            assertEquals(1, result.getAccMode());
            assertEquals(expiry, result.getExpiredTime());
        }
    }

    @Test
    void globalGrantPreservesItsModeAndDeadlineRegardlessOfSpecificOrder() throws Exception {
        Timestamp expiry = deadline(60000);
        PSDevSlnUserDTO global = grant(1, 3, expiry);
        PSDevSlnUserDTO specific = grant(0, 3, null);
        for (Manager manager : new Manager[] {manager(global, specific), manager(specific, global)}) {
            PSDevSlnUserDTO result = manager.scheme("other-owner");
            assertEquals(3, result.getAccMode());
            assertEquals(expiry, result.getExpiredTime());
        }
    }

    @Test
    void derivedReadExpiresWhenTheLastSupportingSpecificGrantExpires() throws Exception {
        Timestamp earlier = deadline(60000);
        Timestamp later = deadline(120000);
        PSDevSlnUserDTO first = grant(0, 3, earlier);
        PSDevSlnUserDTO second = grant(2, 1, later);
        for (Manager manager : new Manager[] {manager(first, second), manager(second, first)}) {
            assertEquals(later, manager.scheme("other-owner").getExpiredTime());
        }
    }

    @Test
    void anUnboundedSpecificGrantKeepsDerivedReadUnbounded() throws Exception {
        PSDevSlnUserDTO finite = grant(0, 3, deadline(60000));
        PSDevSlnUserDTO unbounded = grant(2, 1, null);
        for (Manager manager : new Manager[] {
                manager(finite, unbounded), manager(unbounded, finite)}) {
            PSDevSlnUserDTO result = manager.scheme("other-owner");
            assertEquals(1, result.getAccMode());
            assertNull(result.getExpiredTime());
        }
    }

    @Test
    void explicitGlobalDenyAndSpecificSystemDenyKeepTheirPrecedence() throws Exception {
        PSDevSlnUserDTO denied = grant(1, 0, null);
        PSDevSlnUserDTO allowed = grant(0, 3, null);
        for (Manager manager : new Manager[] {manager(denied, allowed), manager(allowed, denied)}) {
            assertEquals(0, manager.mode(1, null));
        }
        PSDevSlnUserDTO systemDeny = grant(0, 0, null);
        PSDevSlnUserDTO global = grant(1, 3, null);
        for (Manager manager : new Manager[] {
                manager(systemDeny, global), manager(global, systemDeny)}) {
            assertEquals(0, manager.mode(0, "library-a"));
        }
    }

    @Test
    void schemeOwnerRetainsIndependentOwnerPermission() throws Exception {
        PSDevSlnUserDTO result = manager(grant(0, -1, deadline(-60000))).scheme("editor-a");
        assertEquals(IPSDevUserBase.ACCMODE_OWNER, result.getAccMode());
        assertNull(result.getExpiredTime());
    }
}
