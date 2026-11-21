package net.ibizsys.modeling.core.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.app.dataentity.IPSAppDEMethod;
import net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO;
import net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.modeling.core.dataentity.service.ModelDEServiceAPIRuntime;
import net.ibizsys.modeling.core.dataentity.service.ModelObservationDEServiceAPIRuntime;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * Disk-loaded metadata and actual factory selection only, not service startup.
 * r05.owned.model selects the four-file owned overlay's model directory.
 */
class ModelOverviewOwnedModelBindingTest {
    private static final String ENTITY = "PSMODULES/AppStudio/PSDATAENTITIES/ModelObservation.json";
    private static final String ACTION =
            "PSMODULES/AppStudio/PSDATAENTITIES/ModelObservation/PSDEACTIONS/SysOverviewCnt.json";
    private static final String APP = "PSSYSAPPS/ModelDesign/PSAPPDATAENTITIES/ModelObservation.json";
    private static final String API = "PSSYSSERVICEAPIS/ModelAPI.json";
    private static final String DTO = "ModelObservationOverviewDTO";
    private static final List<String> COUNTERS = Arrays.asList(
            "sysappcnt", "sysdecnt", "serviceapicnt", "pfplugincnt", "sfplugincnt");

    @TempDir
    Path temporary;

    @Test
    void diskLoadedOwnedMetadataSelectsCandidateAndResolvesBothApiAndActionReturns() throws Exception {
        Path root = modelRoot();
        Loaded loaded = load(root);
        Factory factory = new Factory();

        assertEquals(ModelObservationDEServiceAPIRuntime.class, factory.select(loaded.api).getClass());
        assertEquals(1, factory.runtimeLookups);
        assertNull(factory.requestedPlugin);
        assertBackendMethod(loaded.overview);
        IPSDEMethodDTO actionDTO = loaded.overview.getPSDEActionMust()
                .getPSDEActionReturn().getPSDEMethodDTOMust();
        assertBackendDTO(actionDTO);
        assertSame(actionDTO, loaded.overview.getPSDEServiceAPIMethodReturn().getPSDEMethodDTOMust());
        assertEquals("ModelObservationDTO", loaded.overview.getPSDEActionMust()
                .getPSDEActionInput().getPSDEMethodDTOMust().getName());

        IPSDEServiceAPIMethod nested = loaded.relation.getPSDEServiceAPIMethods().stream()
                .filter(ModelOverviewOwnedModelBindingTest::overview).findFirst().orElseThrow(AssertionError::new);
        assertBackendMethod(nested);
        assertSame(actionDTO, nested.getPSDEServiceAPIMethodReturn().getPSDEMethodDTOMust());
        assertEquals("PSDEVSLNSYSID", loaded.relation.getParentIdPSDEFieldMust().getName());

        Loaded reparsed = load(root);
        assertNotSame(loaded.api, reparsed.api, "A new disk model service must not reuse injected models");
        assertEquals(ModelObservationDEServiceAPIRuntime.class, factory.select(reparsed.api).getClass());
    }

    @Test
    void diskMetadataPolicyChangesPreserveTheExistingRuntimeAfterFreshParsing() throws Exception {
        for (String variant : Arrays.asList("VOID", "API_VOID", "GET", "API_WRITE", "ACTION_WRITE",
                "ENTITY", "API", "MISSING_METHOD", "DUPLICATE_METHOD", "MISSING_ACTION",
                "OUTPUT", "BATCH", "INPUT_DTOS", "ACTION_RETURN_DTOS", "API_RETURN_DTOS",
                "METHOD_TYPE", "ACTION_CODE", "MISSING_INPUT", "MISSING_ACTION_RETURN", "MISSING_API_RETURN")) {
            Path root = modelRoot();
            ObjectNode api = read(root, API);
            ObjectNode service = observationService(api);
            ObjectNode method = overviewMethod(service);
            ObjectNode action = read(root, ACTION);
            ObjectNode entity = read(root, ENTITY);
            if ("VOID".equals(variant)) action.with("getPSDEActionReturn").put("type", "VOID");
            if ("API_VOID".equals(variant)) method.with("getPSDEServiceAPIMethodReturn").put("type", "VOID");
            if ("GET".equals(variant)) method.put("requestMethod", "GET");
            if ("API_WRITE".equals(variant)) method.put("dataAccessAction", "UPDATE");
            if ("ACTION_WRITE".equals(variant)) action.put("dataAccessAction", "UPDATE");
            if ("ENTITY".equals(variant)) entity.put("name", "PSMODULE");
            if ("API".equals(variant)) service.put("name", "OtherAPI");
            if ("MISSING_METHOD".equals(variant)) {
                ((ArrayNode) service.get("getPSDEServiceAPIMethods")).removeAll();
            }
            if ("DUPLICATE_METHOD".equals(variant)) {
                ((ArrayNode) service.get("getPSDEServiceAPIMethods")).add(method.deepCopy());
            }
            if ("MISSING_ACTION".equals(variant)) method.remove("getPSDEAction");
            if ("OUTPUT".equals(variant)) action.with("getPSDEActionInput").put("output", true);
            if ("BATCH".equals(variant)) action.put("batchAction", true);
            if ("INPUT_DTOS".equals(variant)) action.with("getPSDEActionInput").put("type", "DTOS");
            if ("ACTION_RETURN_DTOS".equals(variant)) action.with("getPSDEActionReturn").put("type", "DTOS");
            if ("API_RETURN_DTOS".equals(variant)) method.with("getPSDEServiceAPIMethodReturn").put("type", "DTOS");
            if ("METHOD_TYPE".equals(variant)) method.put("methodType", "FETCH");
            if ("ACTION_CODE".equals(variant)) action.put("codeName", "OtherAction");
            if ("MISSING_INPUT".equals(variant)) action.remove("getPSDEActionInput");
            if ("MISSING_ACTION_RETURN".equals(variant)) action.remove("getPSDEActionReturn");
            if ("MISSING_API_RETURN".equals(variant)) method.remove("getPSDEServiceAPIMethodReturn");
            ArrayNode actions = (ArrayNode) entity.get("getAllPSDEActions");
            for (int index = 0; index < actions.size(); index++) {
                if ("SysOverviewCnt".equals(actions.get(index).path("codeName").asText())) {
                    actions.set(index, action.deepCopy());
                    break;
                }
            }
            write(root, API, api);
            write(root, ACTION, action);
            write(root, ENTITY, entity);

            Loaded loaded = load(root);
            assertEquals(ModelDEServiceAPIRuntime.class, new Factory().select(loaded.api).getClass(), variant);
        }
    }

    @Test
    void diskDeclaredRuntimePluginRetainsPrecedenceEvenWhenNoPluginInstanceIsAvailable() throws Exception {
        Path root = modelRoot();
        ObjectNode api = read(root, API);
        observationService(api).putObject("getPSSysSFPlugin")
                .put("name", "ExplicitOverviewRuntime").put("codeName", "ExplicitOverviewRuntime");
        write(root, API, api);
        Loaded loaded = load(root);
        IPSSysSFPlugin plugin = loaded.api.getPSSysSFPlugin();
        assertNotNull(plugin, "The declaration must resolve through the real model parser");
        Factory factory = new Factory();
        factory.pluginRuntime = new ExplicitRuntime();

        assertSame(factory.pluginRuntime, factory.select(loaded.api));
        assertSame(plugin, factory.requestedPlugin);
        assertEquals(1, factory.runtimeLookups);

        Factory unavailable = new Factory();
        assertEquals(ModelDEServiceAPIRuntime.class, unavailable.select(load(root).api).getClass());
        assertNotNull(unavailable.requestedPlugin);
    }

    @Test
    void diskLoadedAppActionAndMethodResolveTheirActualFiveFieldReturnDtos() throws Exception {
        Loaded loaded = load(modelRoot());
        IPSAppDataEntity app = loaded.models.getPSModelObject(IPSAppDataEntity.class, APP);
        IPSAppDEMethod action = app.getAllPSAppDEActions().stream()
                .filter(item -> "SysOverviewCnt".equals(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        IPSAppDEMethod method = app.getAllPSAppDEMethods().stream()
                .filter(item -> "SysOverviewCnt".equals(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);

        IPSAppDEMethodDTO actionDTO = assertAppMethod(action);
        IPSAppDEMethodDTO methodDTO = assertAppMethod(method);
        assertSame(actionDTO, methodDTO);
        assertEquals("DYNAMODEL", actionDTO.getSourceType());
        assertEquals("DEFAULT", actionDTO.getType());
        assertEquals(COUNTERS.size(), actionDTO.getPSAppDEMethodDTOFields().size());
        for (int index = 0; index < COUNTERS.size(); index++) {
            IPSAppDEMethodDTOField field = actionDTO.getPSAppDEMethodDTOFields().get(index);
            assertEquals(COUNTERS.get(index), field.getName());
            assertEquals(COUNTERS.get(index), field.getCodeName());
            assertEquals("SIMPLE", field.getType());
            assertEquals(1, field.getStdDataType());
            assertFalse(field.isAllowEmpty());
        }
    }

    private static IPSAppDEMethodDTO assertAppMethod(IPSAppDEMethod method) {
        assertEquals("DEACTION", method.getMethodType());
        assertEquals("POST", method.getRequestMethod());
        assertEquals("/sysoverviewcnt", method.getRequestPath());
        assertEquals("DTO", method.getPSAppDEMethodReturn().getType());
        IPSAppDEMethodDTO returned = method.getPSAppDEMethodReturn().getPSAppDEMethodDTOMust();
        assertEquals(DTO, returned.getName());
        assertEquals("ModelObservationDTO", method.getPSAppDEMethodInput().getPSAppDEMethodDTOMust().getName());
        return returned;
    }

    private static void assertBackendMethod(IPSDEServiceAPIMethod method) {
        assertTrue(ModelObservationDEServiceAPIRuntime.supportsOverviewMethod(method));
        assertEquals("DTO", method.getPSDEServiceAPIMethodReturn().getType());
        assertBackendDTO(method.getPSDEServiceAPIMethodReturn().getPSDEMethodDTOMust());
    }

    private static void assertBackendDTO(IPSDEMethodDTO dto) {
        assertEquals(DTO, dto.getName());
        assertEquals(COUNTERS.size(), dto.getPSDEMethodDTOFields().size());
        for (int index = 0; index < COUNTERS.size(); index++) {
            IPSDEMethodDTOField field = dto.getPSDEMethodDTOFields().get(index);
            assertEquals(COUNTERS.get(index), field.getLowerCaseName());
            assertEquals("SIMPLE", field.getType());
            assertEquals(1, field.getStdDataType());
            assertTrue(field.isReadOnly());
            assertFalse(field.isAllowEmpty());
        }
    }

    private Path modelRoot() throws IOException {
        Path target = Files.createTempDirectory(temporary, "owned-model-");
        String external = System.getProperty("r05.owned.model");
        if (external == null) {
            writePortableModel(target);
        } else {
            assertFalse(external.trim().isEmpty(), "Explicit owned model path cannot be empty");
            Path source = Paths.get(external);
            for (String file : Arrays.asList(ENTITY, ACTION, APP, API)) {
                Path input = source.resolve(file);
                assertTrue(Files.isRegularFile(input), "Owned overlay file is missing: " + file);
                Path output = target.resolve(file);
                Files.createDirectories(output.getParent());
                Files.copy(input, output);
            }
        }
        return target;
    }

    private static Loaded load(Path root) {
        PSModelServiceImpl models = new PSModelServiceImpl();
        models.setPSModelFolderPath(root.toString(), false);
        IPSSysServiceAPI api = models.getPSModelObject(IPSSysServiceAPI.class, API);
        IPSDEServiceAPI observation = api.getPSDEServiceAPIs().stream()
                .filter(item -> "ModelObservation".equalsIgnoreCase(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        IPSDEServiceAPIRS relation = api.getPSDEServiceAPIRSs().stream()
                .filter(item -> "ModelObservations".equals(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        IPSDEServiceAPIMethod method = observation.getPSDEServiceAPIMethods() == null
                ? null : observation.getPSDEServiceAPIMethods().stream()
                    .filter(ModelOverviewOwnedModelBindingTest::overview).findFirst().orElse(null);
        return new Loaded(models, observation, relation, method);
    }

    private static boolean overview(IPSDEServiceAPIMethod method) {
        return "SysOverviewCnt".equals(method.getCodeName());
    }

    private static ObjectNode observationService(ObjectNode api) {
        for (JsonNode service : api.withArray("getPSDEServiceAPIs")) {
            if ("ModelObservation".equals(service.path("codeName").asText())) return (ObjectNode) service;
        }
        throw new AssertionError("Missing observation API");
    }

    private static ObjectNode overviewMethod(ObjectNode api) {
        for (JsonNode method : api.withArray("getPSDEServiceAPIMethods")) {
            if ("SysOverviewCnt".equals(method.path("codeName").asText())) return (ObjectNode) method;
        }
        throw new AssertionError("Missing overview method");
    }

    private static ObjectNode read(Path root, String file) throws IOException {
        return (ObjectNode) JsonUtils.MAPPER.readTree(root.resolve(file).toFile());
    }

    private static void write(Path root, String file, ObjectNode model) throws IOException {
        Path path = root.resolve(file);
        Files.createDirectories(path.getParent());
        JsonUtils.MAPPER.writeValue(path.toFile(), model);
    }

    private static void writePortableModel(Path root) throws IOException {
        ObjectNode action = JsonUtils.createObjectNode();
        action.put("name", "SysOverviewCnt").put("codeName", "SysOverviewCnt")
                .put("actionType", "DELOGIC").put("dataAccessAction", "READ")
                .put("dynaModelFilePath", ACTION);
        dtoReference(action.putObject("getPSDEActionInput"), "getPSDEMethodDTO", "ModelObservationDTO");
        dtoReference(action.putObject("getPSDEActionReturn"), "getPSDEMethodDTO", DTO);
        ObjectNode entity = JsonUtils.createObjectNode();
        entity.put("name", "MODELOBSERVATION").put("codeName", "ModelObservation")
                .put("dynaModelFilePath", ENTITY);
        entity.putArray("getAllPSDEActions").add(action);
        entity.putArray("getAllPSDEFields").addObject().put("name", "PSDEVSLNSYSID").put("stdDataType", 25);
        entity.putArray("getAllPSDEMethodDTOs").addObject()
                .put("name", "ModelObservationDTO").put("type", "DEFAULT");
        entity.withArray("getAllPSDEMethodDTOs").add(counterDTO(false));
        ObjectNode api = JsonUtils.createObjectNode();
        api.put("name", "ModelAPI").put("codeName", "ModelAPI");
        ObjectNode service = api.putArray("getPSDEServiceAPIs").addObject()
                .put("name", "ModelObservation").put("codeName", "ModelObservation");
        service.putObject("getPSDataEntity").put("modelref", true).put("path", ENTITY);
        service.putArray("getPSDEServiceAPIMethods").add(backendMethod());
        ObjectNode relation = api.putArray("getPSDEServiceAPIRSs").addObject()
                .put("name", "System-Observation").put("codeName", "ModelObservations");
        relation.putObject("getMinorPSDEServiceAPI").put("modelref", true).put("id", "ModelObservation");
        relation.putObject("getParentIdPSDEField").put("name", "PSDEVSLNSYSID");
        relation.putArray("getPSDEServiceAPIMethods").add(backendMethod());
        ObjectNode app = JsonUtils.createObjectNode();
        app.put("name", "ModelObservation").put("codeName", "ModelObservation").put("getPSDEName", "MODELOBSERVATION");
        app.putArray("getAllPSAppDEMethodDTOs").addObject()
                .put("name", "ModelObservationDTO").put("codeName", "ModelObservationDTO").put("type", "DEFAULT");
        app.withArray("getAllPSAppDEMethodDTOs").add(counterDTO(true));
        app.putArray("getAllPSAppDEActions").add(appMethod());
        app.putArray("getAllPSAppDEMethods").add(appMethod());
        write(root, ENTITY, entity);
        write(root, ACTION, action);
        write(root, API, api);
        write(root, APP, app);
    }

    private static ObjectNode backendMethod() {
        ObjectNode method = JsonUtils.createObjectNode();
        method.put("name", "SysOverviewCnt").put("codeName", "SysOverviewCnt")
                .put("methodType", "DEACTION").put("requestMethod", "POST").put("dataAccessAction", "READ");
        method.putObject("getPSDEAction").put("modelref", true).put("path", ACTION);
        dtoReference(method.putObject("getPSDEServiceAPIMethodReturn"), "getPSDEMethodDTO", DTO);
        return method;
    }

    private static ObjectNode appMethod() {
        ObjectNode method = JsonUtils.createObjectNode();
        method.put("name", "SysOverviewCnt").put("codeName", "SysOverviewCnt")
                .put("methodType", "DEACTION").put("requestMethod", "POST").put("requestPath", "/sysoverviewcnt");
        dtoReference(method.putObject("getPSAppDEMethodInput"), "getPSAppDEMethodDTO", "ModelObservationDTO");
        dtoReference(method.putObject("getPSAppDEMethodReturn"), "getPSAppDEMethodDTO", DTO);
        return method;
    }

    private static void dtoReference(ObjectNode owner, String key, String name) {
        owner.put("type", "DTO").putObject(key).put("modelref", true).put("id", name);
    }

    private static ObjectNode counterDTO(boolean app) {
        ObjectNode dto = JsonUtils.createObjectNode();
        dto.put("name", DTO).put("type", "DEFAULT").put("sourceType", "DYNAMODEL");
        if (app) dto.put("codeName", DTO);
        ArrayNode fields = dto.putArray(app ? "getPSAppDEMethodDTOFields" : "getPSDEMethodDTOFields");
        for (String counter : COUNTERS) {
            ObjectNode field = fields.addObject().put("name", counter).put("type", "SIMPLE")
                    .put("stdDataType", 1).put("readOnly", true).put("allowEmpty", false);
            if (app) field.put("codeName", counter);
        }
        return dto;
    }

    private static final class Loaded {
        final PSModelServiceImpl models;
        final IPSDEServiceAPI api;
        final IPSDEServiceAPIRS relation;
        final IPSDEServiceAPIMethod overview;

        Loaded(PSModelServiceImpl models, IPSDEServiceAPI api, IPSDEServiceAPIRS relation,
                IPSDEServiceAPIMethod overview) {
            this.models = models;
            this.api = api;
            this.relation = relation;
            this.overview = overview;
        }
    }

    private static final class ExplicitRuntime extends ModelDEServiceAPIRuntime {
    }

    private static final class Factory extends ModelSysServiceAPIRuntimeBase {
        int runtimeLookups;
        Object requestedPlugin;
        IDEServiceAPIRuntime pluginRuntime;

        IDEServiceAPIRuntime select(IPSDEServiceAPI api) {
            return createDEServiceAPIRuntime(api);
        }

        @Override
        public IServiceSystemRuntime getSystemRuntime() {
            return (IServiceSystemRuntime) Proxy.newProxyInstance(
                    IServiceSystemRuntime.class.getClassLoader(),
                    new Class<?>[] { IServiceSystemRuntime.class }, (proxy, method, args) -> {
                        if ("getRuntimeObject".equals(method.getName())) {
                            runtimeLookups++;
                            requestedPlugin = args[0];
                            assertEquals(IDEServiceAPIRuntime.class, args[1]);
                            assertEquals(Boolean.TRUE, args[2]);
                            return pluginRuntime;
                        }
                        throw new AssertionError(method.getName());
                    });
        }
    }
}
