package net.ibizsys.modeling.core.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.PSDataEntityImpl;
import net.ibizsys.model.dataentity.action.PSDELogicActionImpl;
import net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl;
import net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl;
import net.ibizsys.model.res.PSSysSFPluginImpl;
import net.ibizsys.modeling.core.dataentity.service.ModelDEServiceAPIRuntime;
import net.ibizsys.modeling.core.dataentity.service.ModelObservationDEServiceAPIRuntime;
import net.ibizsys.runtime.util.JsonUtils;

class ModelSysServiceAPIRuntimeBaseBindingTest {
    @Test
    void defaultEntityRuntimeRetainsTheExistingModelingPath() {
        TestRuntime runtime = new TestRuntime();

        assertEquals(ModelDEServiceAPIRuntime.class,
                runtime.createDefaultDEServiceAPIRuntime().getClass());
    }

    @Test
    void consistentOverviewDtoMetadataSelectsOnlyTheCandidate() {
        Fixture fixture = new Fixture();

        assertTrue(fixture.select() instanceof ModelObservationDEServiceAPIRuntime);
    }

    @Test
    void oldVoidOrInconsistentMetadataNeverGloballyActivatesTheCandidate() {
        for (String variant : Arrays.asList("VOID", "API_VOID", "GET", "WRITE", "ENTITY",
                "API", "MISSING_METHOD", "DUPLICATE_METHOD", "MISSING_ACTION", "OUTPUT")) {
            Fixture fixture = new Fixture();
            if ("VOID".equals(variant)) fixture.actionNode.with("getPSDEActionReturn").put("type", "VOID");
            if ("API_VOID".equals(variant)) fixture.methodNode.with("getPSDEServiceAPIMethodReturn").put("type", "VOID");
            if ("GET".equals(variant)) fixture.methodNode.put("requestMethod", "GET");
            if ("WRITE".equals(variant)) fixture.actionNode.put("dataAccessAction", "UPDATE");
            if ("ENTITY".equals(variant)) fixture.entityNode.put("name", "PSModule");
            if ("API".equals(variant)) fixture.apiNode.put("name", "OtherAPI");
            if ("MISSING_METHOD".equals(variant)) fixture.api.setPSDEServiceAPIMethods(Collections.emptyList());
            if ("DUPLICATE_METHOD".equals(variant)) fixture.api.setPSDEServiceAPIMethods(
                    Arrays.asList(fixture.method, fixture.method));
            if ("MISSING_ACTION".equals(variant)) fixture.method.setPSDEAction(null);
            if ("OUTPUT".equals(variant)) fixture.actionNode.with("getPSDEActionInput").put("output", true);

            assertEquals(ModelDEServiceAPIRuntime.class, fixture.select().getClass(), variant);
        }
    }

    @Test
    void anExplicitRuntimePluginKeepsPrecedenceOverAutomaticSelection() {
        Fixture fixture = new Fixture();
        PSSysSFPluginImpl plugin = new PSSysSFPluginImpl();
        plugin.init(new PSModelServiceImpl(), null, JsonUtils.createObjectNode());
        fixture.api.setPSSysSFPlugin(plugin);
        fixture.runtime.pluginRuntime = new ModelDEServiceAPIRuntime();

        assertSame(fixture.runtime.pluginRuntime, fixture.select());
        fixture.runtime.pluginRuntime = null;
        assertEquals(ModelDEServiceAPIRuntime.class, fixture.select().getClass());
    }

    private static final class Fixture {
        final TestRuntime runtime = new TestRuntime();
        final ObjectNode apiNode = JsonUtils.createObjectNode();
        final ObjectNode entityNode = JsonUtils.createObjectNode();
        final ObjectNode methodNode = JsonUtils.createObjectNode();
        final ObjectNode actionNode = JsonUtils.createObjectNode();
        final PSDEServiceAPIImpl api = new PSDEServiceAPIImpl();
        final PSDEServiceAPIMethodImpl method = new PSDEServiceAPIMethodImpl();

        Fixture() {
            PSModelServiceImpl models = new PSModelServiceImpl();
            apiNode.put("name", "ModelObservation");
            api.init(models, null, apiNode);
            entityNode.put("name", "ModelObservation");
            PSDataEntityImpl entity = new PSDataEntityImpl();
            entity.init(models, null, entityNode);
            api.setPSDataEntity(entity);
            actionNode.put("codeName", "SysOverviewCnt");
            actionNode.put("actionType", "DELOGIC");
            actionNode.put("dataAccessAction", "READ");
            actionNode.putObject("getPSDEActionInput").put("type", "DTO");
            actionNode.putObject("getPSDEActionReturn").put("type", "DTO");
            PSDELogicActionImpl action = new PSDELogicActionImpl();
            action.init(models, null, actionNode);
            methodNode.put("codeName", "SysOverviewCnt");
            methodNode.put("methodType", "DEACTION");
            methodNode.put("requestMethod", "POST");
            methodNode.put("dataAccessAction", "READ");
            methodNode.putObject("getPSDEServiceAPIMethodReturn").put("type", "DTO");
            method.init(models, null, methodNode);
            method.setPSDEAction(action);
            api.setPSDEServiceAPIMethods(Collections.singletonList(method));
        }

        IDEServiceAPIRuntime select() {
            return runtime.createDEServiceAPIRuntime(api);
        }
    }

    private static final class TestRuntime extends ModelSysServiceAPIRuntimeBase {
        IDEServiceAPIRuntime pluginRuntime;

        @Override
        public IServiceSystemRuntime getSystemRuntime() {
            return (IServiceSystemRuntime) Proxy.newProxyInstance(
                    IServiceSystemRuntime.class.getClassLoader(),
                    new Class<?>[] { IServiceSystemRuntime.class }, (proxy, method, args) -> {
                        if ("getRuntimeObject".equals(method.getName())) {
                            return pluginRuntime;
                        }
                        throw new AssertionError(method.getName());
                    });
        }
    }
}
