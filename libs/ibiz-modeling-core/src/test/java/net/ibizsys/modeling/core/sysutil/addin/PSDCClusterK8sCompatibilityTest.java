package net.ibizsys.modeling.core.sysutil.addin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.addin.IPSDCClusterAgent;
import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.dataentity.dto.PSDCBKTaskDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryItemDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSDCBKTaskService;
import net.ibizsys.modeling.core.dataentity.service.IPSDCRegistryItemService;

class PSDCClusterK8sCompatibilityTest {

    @Test
    void providerRoutesObjectToTypedFactory() {
        class Provider extends PSDCClusterProviderBase {
            PSDCClusterDTO received;

            @Override
            public IPSDCClusterAgent createPSDCClusterAgent(PSDCClusterDTO cluster) {
                received = cluster;
                return null;
            }
        }
        Provider provider = new Provider();
        PSDCClusterDTO cluster = new PSDCClusterDTO();
        provider.createPSDCClusterAgent((Object) cluster);
        assertSame(cluster, provider.received);
        assertThrows(IllegalArgumentException.class,
                () -> provider.createPSDCClusterAgent((Object) "wrong type"));
    }

    @Test
    void objectHooksRouteToK8sTypedOverrides() throws Throwable {
        class Agent extends PSDCClusterAgentBase {
            PSDCMSPlatformNodeDTO received;

            @Override
            protected Object onAddService(IPSDCMSPlatformAgent platform,
                    PSDCMSPlatformNodeDTO node, Map<String, Object> params) {
                received = node;
                return "added";
            }

            @Override
            protected Object onGenerateConfig(IPSDCMSPlatformAgent platform,
                    PSDCMSPlatformNodeDTO node, String path, Map<String, Object> params) {
                received = node;
                return path;
            }

            @Override
            protected Object onRefreshServicesState(IPSDCMSPlatformAgent platform,
                    List<PSDCMSPlatformNodeDTO> nodes, Map<String, Object> params) {
                received = nodes.get(0);
                return nodes.size();
            }
        }
        Agent agent = new Agent();
        PSDCMSPlatformNodeDTO node = new PSDCMSPlatformNodeDTO();
        assertEquals("added", agent.onAddService(null, (Object) node, Map.of()));
        assertSame(node, agent.received);
        assertEquals("/config", agent.onGenerateConfig(null, (Object) node, "/config", Map.of()));
        assertEquals(1, agent.onRefreshServicesState(null, List.of(node), Map.of()));
        assertThrows(IllegalArgumentException.class,
                () -> agent.onAddService(null, (Object) "wrong type", Map.of()));
    }

    @Test
    void taskUpdatesPersistAndRegistryItemIsLoaded() throws Throwable {
        class Agent extends PSDCClusterAgentBase {
            @Override
            protected String getPSDevCenterId() {
                return "center";
            }
        }
        Agent agent = new Agent();
        List<PSDCBKTaskDTO> updates = new ArrayList<>();
        IPSDCBKTaskService tasks = (IPSDCBKTaskService) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] { IPSDCBKTaskService.class },
                (proxy, method, args) -> {
                    switch (method.getName()) {
                        case "createEntityDTO":
                            return new PSDCBKTaskDTO();
                        case "create":
                            ((PSDCBKTaskDTO) args[0]).setPSDCBKTaskId("task-1");
                            return null;
                        case "update":
                            updates.add((PSDCBKTaskDTO) args[0]);
                            return null;
                        default:
                            throw new AssertionError(method.getName());
                    }
                });
        inject("iPSDCBKTaskService", agent, tasks);

        assertEquals("task-1", agent.beginPSDCBKTask("deploy", "solution", "system"));
        agent.updateCurrentPSDCBKTask(30000, "image missing");
        agent.finishCurrentPSDCBKTask(null);
        assertEquals(2, updates.size());
        assertEquals("[WARN] image missing", updates.get(0).getResultInfo());
        assertEquals(PSModelEnums.SysDevBKTaskState.EXECUTING.value,
                updates.get(0).getTaskState());
        assertEquals(PSModelEnums.SysDevBKTaskState.FINISHED.value,
                updates.get(1).getTaskState());

        PSDCRegistryItemDTO item = new PSDCRegistryItemDTO();
        item.setConnStr("registry/service");
        IPSDCRegistryItemService registry = (IPSDCRegistryItemService) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[] { IPSDCRegistryItemService.class },
                (proxy, method, args) -> {
                    assertEquals("get", method.getName());
                    assertEquals("image-1", args[0]);
                    return item;
                });
        inject("iPSDCRegistryItemService", agent, registry);
        assertSame(item, agent.getPSDCRegistryItem("image-1"));
    }

    private static void inject(String fieldName, Object target, Object service)
            throws ReflectiveOperationException {
        Field field = CentralSysUtilRTAddinBase.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, service);
    }
}
