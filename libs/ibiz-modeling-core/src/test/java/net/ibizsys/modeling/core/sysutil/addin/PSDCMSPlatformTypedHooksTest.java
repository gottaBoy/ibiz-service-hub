package net.ibizsys.modeling.core.sysutil.addin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.modeling.core.addin.IPSDCMSPlatformAgent;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDeployDTO;

class PSDCMSPlatformTypedHooksTest {

    @Test
    void providerDispatchesObjectToTypedFactory() {
        PSDCMSPlatformDTO platform = new PSDCMSPlatformDTO();
        class Provider extends PSDCMSPlatformProviderBase {
            private PSDCMSPlatformDTO received;

            @Override
            public IPSDCMSPlatformAgent createPSDCMSPlatformAgent(PSDCMSPlatformDTO value) {
                received = value;
                return null;
            }
        }
        Provider provider = new Provider();
        assertNull(provider.createPSDCMSPlatformAgent((Object) platform));
        assertSame(platform, provider.received);
    }

    @Test
    void objectHooksDispatchToTypedPluginMethods() {
        class Agent extends PSDCMSPlatformAgentBase {
            @Override
            public String getServiceName(PSDCMSPlatformNodeDTO node) {
                return "service";
            }

            @Override
            public String getAlias(PSDCMSPlatformNodeDTO node) {
                return "alias";
            }

            @Override
            public List<String> getEnvironments(PSDCMSPlatformNodeDTO node,
                    PSDCRegistryItemDTO registry) {
                return List.of("ENV=value");
            }

            @Override
            public List<String> getHostAliases(PSDCMSPlatformNodeDTO node,
                    PSDCRegistryItemDTO registry) {
                return List.of("host");
            }

            @Override
            protected void onPublishConfig(PSDevSlnMSDeployDTO deployment,
                    Map<String, Object> params) {
                params.put("received", deployment);
            }

            void publish(PSDevSlnMSDeployDTO deployment, Map<String, Object> params)
                    throws Throwable {
                onPublishConfig((Object) deployment, params);
            }
        }
        Agent agent = new Agent();
        PSDCMSPlatformNodeDTO node = new PSDCMSPlatformNodeDTO();
        PSDCRegistryItemDTO registry = new PSDCRegistryItemDTO();
        assertEquals("service", agent.getServiceName((Object) node));
        assertEquals("alias", agent.getAlias((Object) node));
        assertEquals(List.of("ENV=value"), agent.getEnvironments((Object) node, registry));
        assertEquals(List.of("host"), agent.getHostAliases((Object) node, registry));

        PSDevSlnMSDeployDTO deployment = new PSDevSlnMSDeployDTO();
        Map<String, Object> params = new java.util.HashMap<>();
        try {
            agent.publish(deployment, params);
        } catch (Throwable error) {
            throw new AssertionError(error);
        }
        assertSame(deployment, params.get("received"));
    }
}
