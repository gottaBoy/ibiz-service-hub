package net.ibizsys.modeling.core.sysutil.addin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.modeling.core.addin.IPSDCDeployCenterAgent;
import net.ibizsys.modeling.core.addin.IPSDCDeployCenterProvider;
import net.ibizsys.modeling.core.dataentity.dto.PSDCDeployCenterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineDTO;

class PSDCDeployCenterCompatibilityTest {

    @Test
    void objectOperationsDispatchToTypedHooks() {
        TestAgent agent = new TestAgent();
        PSDCMSPlatformNodeDTO node = new PSDCMSPlatformNodeDTO();
        PSDevSlnPipelineDTO pipeline = new PSDevSlnPipelineDTO();
        PSDCMSPlatformDTO platform = new PSDCMSPlatformDTO();
        Map<String, Object> params = Map.of("key", "value");

        assertEquals("add", agent.addPSDCMSPlatformNode(node));
        assertEquals("restart", agent.restartPSDCMSPlatformNode(node, params));
        assertEquals("publish", agent.publishPSDevSlnPipeline(pipeline, params));
        assertEquals("build", agent.buildPSDevSlnPipeline(pipeline, params));
        assertSame(params, agent.getPSDevSlnPipelineConfig(pipeline, params));
        assertEquals("platform", agent.publishPSDCMSPlatform(platform, params));
        assertSame(node, agent.lastNode);
        assertSame(pipeline, agent.lastPipeline);
        assertSame(platform, agent.lastPlatform);
        assertSame(params, agent.lastParams);
    }

    @Test
    void legacyObjectHookRemainsOverridable() {
        Object legacyPipeline = new Object();
        TestAgent agent = new TestAgent() {
            @Override
            protected Object onBuildPSDevSlnPipeline(Object pipeline,
                    Map<String, Object> params) {
                return pipeline;
            }
        };

        assertSame(legacyPipeline, agent.buildPSDevSlnPipeline(legacyPipeline, Map.of()));
        assertThrows(Exception.class,
                () -> new TestAgent().onBuildPSDevSlnPipeline(legacyPipeline, Map.of()));
    }

    @Test
    void providerObjectEntryPointDispatchesToTypedFactory() {
        PSDCDeployCenterDTO center = new PSDCDeployCenterDTO();
        TestAgent agent = new TestAgent();
        IPSDCDeployCenterProvider provider = new PSDCDeployCenterProviderBase() {
            @Override
            public IPSDCDeployCenterAgent createPSDCDeployCenterAgent(
                    PSDCDeployCenterDTO deployCenter) {
                assertSame(center, deployCenter);
                return agent;
            }
        };

        assertSame(agent, provider.createPSDCDeployCenterAgent(center));
        assertThrows(IllegalArgumentException.class,
                () -> provider.createPSDCDeployCenterAgent(new Object()));
    }

    private static class TestAgent extends PSDCDeployCenterAgentBase {
        private PSDCMSPlatformNodeDTO lastNode;
        private PSDevSlnPipelineDTO lastPipeline;
        private PSDCMSPlatformDTO lastPlatform;
        private Map<String, Object> lastParams;

        @Override
        protected Object onAddPSDCMSPlatformNode(PSDCMSPlatformNodeDTO node) {
            lastNode = node;
            return "add";
        }

        @Override
        protected Object onRestartPSDCMSPlatformNode(PSDCMSPlatformNodeDTO node,
                Map<String, Object> params) {
            lastNode = node;
            lastParams = params;
            return "restart";
        }

        @Override
        protected Object onPublishPSDevSlnPipeline(PSDevSlnPipelineDTO pipeline,
                Map<String, Object> params) {
            lastPipeline = pipeline;
            lastParams = params;
            return "publish";
        }

        @Override
        protected Object onBuildPSDevSlnPipeline(PSDevSlnPipelineDTO pipeline,
                Map<String, Object> params) {
            lastPipeline = pipeline;
            lastParams = params;
            return "build";
        }

        @Override
        public Map<String, Object> onGetPSDevSlnPipelineConfig(PSDevSlnPipelineDTO pipeline,
                Map<String, Object> params) {
            lastPipeline = pipeline;
            lastParams = params;
            return params;
        }

        @Override
        protected Object onPublishPSDCMSPlatform(PSDCMSPlatformDTO platform,
                Map<String, Object> params) {
            lastPlatform = platform;
            lastParams = params;
            return "platform";
        }
    }
}
