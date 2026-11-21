package net.ibizsys.modeling.core.dataentity.service;

import static net.ibizsys.modeling.core.dataentity.service.ModelObservationOverviewReaderTest.proxy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.service.DEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.action.PSDEActionInputImpl;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * Native parser/DTO boundary coverage, not a booted service or HTTP test.
 * An explicit r05.owned.model property selects the verified owned overlay.
 * Without it, a small disk-loaded fixture keeps ordinary unit runs portable.
 */
class ModelObservationNativeBoundaryTest {
    private static final String ENTITY = "PSMODULES/AppStudio/PSDATAENTITIES/ModelObservation.json";
    private static final String ACTION =
            "PSMODULES/AppStudio/PSDATAENTITIES/ModelObservation/PSDEACTIONS/SysOverviewCnt.json";
    private static final String API = "PSSYSSERVICEAPIS/ModelAPI.json";
    private static final String[] COUNTERS = {
            "sysappcnt", "sysdecnt", "serviceapicnt", "pfplugincnt", "sfplugincnt" };
    private final IUserContext previous = UserContext.getCurrent();

    @TempDir
    Path temporary;

    @AfterEach
    void restoreContext() {
        UserContext.setCurrent(previous);
    }

    @Test
    void nativeParserLoadsDtoCopiesInputRemovesReadOnlyFieldsAndInjectsRelationshipRoot() throws Throwable {
        Fixture fixture = fixture();
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("psdevslnsysid", "foreign-root");
        body.put("createman", "forged-author");
        Map<String, Object> before = new LinkedHashMap<>(body);

        Object[] arguments = fixture.runtime.parse(fixture.method, fixture.relationship,
                fixture.data.root, body);
        assertEquals(1, arguments.length);
        assertEquals(EntityDTO.class, arguments[0].getClass());
        IEntityDTO parsed = (IEntityDTO) arguments[0];
        assertEquals(fixture.data.root, parsed.get("psdevslnsysid"));
        assertFalse(parsed.contains("createman"));
        assertSame(fixture.inputModel, parsed.getDEMethodDTORuntime().getPSDEMethodDTO());
        assertEquals(before, body);
        assertEquals(1, fixture.factory.calls);
        assertEquals(DEMethodDTORuntime.class, parsed.getDEMethodDTORuntime().getClass());
        assertTrue(fixture.data.events.isEmpty());
    }

    @Test
    void candidateUsesNativeEmptyDtoParsingAndSerializesExactlyFiveLongCounts() throws Throwable {
        Fixture fixture = fixture();
        fixture.data.totals[0] = (long) Integer.MAX_VALUE + 123;
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("psdevslnsysid", "foreign-root");
        body.put("pssystemid", "foreign-system");
        body.put("sysappcnt", 99999);
        Map<String, Object> before = new LinkedHashMap<>(body);

        Object result = fixture.call(body);
        assertEquals(1, fixture.factory.calls);
        assertEquals(Collections.emptyMap(), fixture.factory.body);
        assertEquals(fixture.data.root, fixture.factory.dto.get("psdevslnsysid"));
        assertEquals(fixture.data.systemId, fixture.factory.dto.get("pssystemid"));
        assertFalse(fixture.factory.dto.contains("sysappcnt"));
        assertEquals(before, body);
        assertEquals(11, fixture.data.events.size());

        ObjectNode serialized = JsonUtils.toObjectNode(result);
        assertEquals(5, serialized.size());
        for (int i = 0; i < COUNTERS.length; i++) {
            assertTrue(serialized.get(COUNTERS[i]).isIntegralNumber());
            assertEquals(fixture.data.totals[i], serialized.get(COUNTERS[i]).asLong());
        }
        IPSDEMethodDTO returned = fixture.method.getPSDEServiceAPIMethodReturn()
                .getPSDEMethodDTOMust();
        assertEquals("ModelObservationOverviewDTO", returned.getName());
        assertEquals(5, returned.getPSDEMethodDTOFields().size());
        for (int i = 0; i < COUNTERS.length; i++) {
            assertEquals(COUNTERS[i], returned.getPSDEMethodDTOFields().get(i).getLowerCaseName());
            assertEquals(1, returned.getPSDEMethodDTOFields().get(i).getStdDataType());
        }
    }

    @Test
    void eachPermissionDenialAfterNativeParsingStillPreventsAllCountFetches() throws Throwable {
        for (String denied : Arrays.asList("MODELOBSERVATION", "PSSYSAPP", "PSDATAENTITY",
                "PSSYSSERVICEAPI", "PSSYSPFPLUGIN", "PSSYSSFPLUGIN")) {
            Fixture fixture = fixture();
            fixture.data.denied = denied;
            assertThrows(ErrorException.class, () -> fixture.call(Collections.emptyMap()), denied);
            assertEquals(1, fixture.factory.calls, denied);
            assertTrue(fixture.data.events.stream().noneMatch(event -> event.startsWith("FETCH:")), denied);
        }
    }

    @Test
    void conflictingRootAndBatchBodyFailBeforeNativeFactoryOrAuthorization() throws Throwable {
        Fixture root = fixture();
        root.data.app.set("PSDEVSLNSYS", "foreign-root");
        assertThrows(ErrorException.class, () -> root.call(Collections.emptyMap()));
        assertEquals(0, root.factory.calls);
        assertTrue(root.data.events.isEmpty());

        Fixture batch = fixture();
        assertThrows(ErrorException.class, () -> batch.call(Collections.singletonList(Collections.emptyMap())));
        assertEquals(0, batch.factory.calls);
        assertTrue(batch.data.events.isEmpty());
    }

    @Test
    void nativeMissingDtoResolutionFailsWithoutCountOrLegacyFallback() throws Throwable {
        Fixture fixture = fixture();
        PSDEActionInputImpl input = (PSDEActionInputImpl) fixture.method.getPSDEAction().getPSDEActionInput();
        input.getObjectNode().remove("getPSDEMethodDTO");
        input.setPSDEMethodDTO(null);
        assertThrows(RuntimeException.class, () -> fixture.call(Collections.emptyMap()));
        assertEquals(0, fixture.factory.calls);
        assertTrue(fixture.data.events.isEmpty());
    }

    private Fixture fixture() throws Exception {
        String external = System.getProperty("r05.owned.model");
        Path root;
        if (external == null) {
            root = Files.createTempDirectory(temporary, "native-model-");
            writeMinimalModel(root);
        } else {
            assertFalse(external.trim().isEmpty(), "Explicit owned model path cannot be empty");
            root = Paths.get(external);
            assertTrue(Files.isRegularFile(root.resolve(ENTITY)), "Owned candidate entity is missing");
            assertTrue(Files.isRegularFile(root.resolve(ACTION)), "Owned candidate action is missing");
            assertTrue(Files.isRegularFile(root.resolve(API)), "Owned candidate API is missing");
        }
        PSModelServiceImpl models = new PSModelServiceImpl();
        models.setPSModelFolderPath(root.toString(), false);
        IPSSysServiceAPI api = models.getPSModelObject(IPSSysServiceAPI.class, API);
        IPSDEServiceAPI observation = api.getPSDEServiceAPIs().stream()
                .filter(item -> "ModelObservation".equalsIgnoreCase(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        IPSDEServiceAPIRS relation = api.getPSDEServiceAPIRSs().stream()
                .filter(item -> "ModelObservations".equals(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        IPSDEServiceAPIMethod method = observation.getPSDEServiceAPIMethods().stream()
                .filter(item -> "SysOverviewCnt".equals(item.getCodeName()))
                .findFirst().orElseThrow(AssertionError::new);
        assertTrue(ModelObservationDEServiceAPIRuntime.supportsOverviewMethod(method));
        return new Fixture(method, relation);
    }

    private static final class Fixture {
        final ModelObservationOverviewReaderTest.Fixture data = new ModelObservationOverviewReaderTest.Fixture();
        final IPSDEServiceAPIMethod method;
        final IPSDEMethodDTO inputModel;
        final NativeDTOFactory factory = new NativeDTOFactory();
        final Runtime runtime;
        final IDEServiceAPIRSRuntime relationship;

        Fixture(IPSDEServiceAPIMethod method, IPSDEServiceAPIRS relation) {
            this.method = method;
            inputModel = method.getPSDEAction().getPSDEActionInput().getPSDEMethodDTOMust();
            runtime = new Runtime(data, factory);
            IDEServiceAPIRuntime major = proxy(IDEServiceAPIRuntime.class, (p, operation, args) -> {
                if ("getDataEntityRuntime".equals(operation.getName())) return data.parent;
                throw new AssertionError(operation.getName());
            });
            relationship = proxy(IDEServiceAPIRSRuntime.class, (p, operation, args) -> {
                if ("getMajorDEServiceAPIRuntime".equals(operation.getName())) return major;
                if ("getMinorDEServiceAPIRuntime".equals(operation.getName())) return runtime;
                if ("getPSDEServiceAPIRS".equals(operation.getName())) return relation;
                throw new AssertionError(operation.getName());
            });
        }

        Object call(Object body) throws Throwable {
            return runtime.call(relationship, data.root, method, body);
        }
    }

    // Only lifecycle preparation is bypassed. Both native DTO allocation/init
    // and the inherited Service API parser execute their maintained code.
    private static final class NativeDTOFactory extends DataEntityRuntime {
        int calls;
        Object body;
        IEntityDTO dto;
        ISystemRuntime system;

        @Override
        public ISystemRuntime getSystemRuntime() {
            return system;
        }

        @Override
        public IDEMethodDTO getDEMethodDTO(IPSDEMethodDTO model, Object input) throws Exception {
            calls++;
            body = input;
            dto = (IEntityDTO) super.onGetDEMethodDTO(model, input, true);
            return dto;
        }

        @Override
        protected boolean isEnableRuntimeServiceMode() {
            return true;
        }

        @Override
        public IDEMethodDTORuntime getDEMethodDTORuntime(IPSDEMethodDTO model, boolean tryMode) {
            DEMethodDTORuntime runtime = new DEMethodDTORuntime();
            IDataEntityRuntimeContext context = proxy(IDataEntityRuntimeContext.class, (p, method, args) -> {
                if ("getDataEntityRuntime".equals(method.getName())) return this;
                throw new AssertionError(method.getName());
            });
            try {
                runtime.init(context, model);
                return runtime;
            } catch (Exception error) {
                throw new IllegalStateException(error);
            }
        }
    }

    private static final class Runtime extends ModelObservationDEServiceAPIRuntime {
        private final ModelObservationOverviewReaderTest.Fixture data;
        private final IDataEntityRuntime observation;
        private final ISystemRuntime system = proxy(ISystemRuntime.class, (p, method, args) -> {
            if ("convertValue".equals(method.getName())) {
                return DataTypeUtils.parse((Integer) args[0], (String) args[1]);
            }
            throw new AssertionError(method.getName());
        });
        private final ISysServiceAPIRuntime api = proxy(ISysServiceAPIRuntime.class, (p, method, args) -> {
            if ("getAPILevel".equals(method.getName())) return SysServiceAPILevels.CORE;
            throw new AssertionError(method.getName());
        });

        Runtime(ModelObservationOverviewReaderTest.Fixture data, NativeDTOFactory factory) {
            this.data = data;
            factory.system = system;
            observation = proxy(IDataEntityRuntime.class, (p, method, args) -> {
                if ("isEnableVersionControl".equals(method.getName())
                        || "isEnableVersionStorage".equals(method.getName())) return false;
                if ("getDEMethodDTO".equals(method.getName())) {
                    return factory.getDEMethodDTO((IPSDEMethodDTO) args[0], args[1]);
                }
                try {
                    return method.invoke(data.observation, args);
                } catch (InvocationTargetException error) {
                    throw error.getCause();
                }
            });
        }

        Object call(IDEServiceAPIRSRuntime relation, String root,
                IPSDEServiceAPIMethod method, Object body) throws Throwable {
            return onExecuteAction("fixture-scope", relation, root, method, body, null, null);
        }

        Object[] parse(IPSDEServiceAPIMethod method, IDEServiceAPIRSRuntime relation,
                String root, Object body) throws Throwable {
            return getActionArgs(method, relation, root, body, null);
        }

        @Override
        public IDataEntityRuntime getDataEntityRuntime() {
            return observation;
        }

        @Override
        protected ISystemAccessManager getSystemAccessManager() {
            return data.access;
        }

        @Override
        public ISystemRuntime getSystemRuntime() {
            return system;
        }

        @Override
        public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
            return api;
        }
    }

    private static void writeMinimalModel(Path root) throws Exception {
        ObjectNode action = JsonUtils.createObjectNode();
        action.put("name", "SysOverviewCnt").put("codeName", "SysOverviewCnt")
                .put("actionType", "DELOGIC").put("dataAccessAction", "READ")
                .put("dynaModelFilePath", ACTION);
        action.putObject("getPSDEActionInput").put("type", "DTO")
                .putObject("getPSDEMethodDTO").put("modelref", true).put("id", "ModelObservationDTO");
        action.putObject("getPSDEActionReturn").put("type", "DTO")
                .putObject("getPSDEMethodDTO").put("modelref", true).put("id", "ModelObservationOverviewDTO");
        ObjectNode entity = JsonUtils.createObjectNode();
        entity.put("name", "MODELOBSERVATION").put("codeName", "ModelObservation")
                .put("dynaModelFilePath", ENTITY);
        entity.putArray("getAllPSDEActions").add(action);
        for (String field : Arrays.asList("PSDEVSLNSYSID", "CREATEMAN")) {
            entity.withArray("getAllPSDEFields").addObject().put("name", field).put("stdDataType", 25);
        }
        ObjectNode input = entity.putArray("getAllPSDEMethodDTOs").addObject()
                .put("name", "ModelObservationDTO").put("type", "DEFAULT");
        for (String field : Arrays.asList("PSDevSlnSysId", "CreateMan")) {
            ObjectNode node = input.withArray("getPSDEMethodDTOFields").addObject()
                    .put("name", field).put("type", "SIMPLE").put("stdDataType", 25);
            node.putObject("getPSDEField").put("name", field.toUpperCase());
            if ("CreateMan".equals(field)) node.put("readOnly", true);
        }
        ObjectNode output = entity.withArray("getAllPSDEMethodDTOs").addObject()
                .put("name", "ModelObservationOverviewDTO").put("type", "DEFAULT");
        for (String counter : COUNTERS) {
            output.withArray("getPSDEMethodDTOFields").addObject()
                    .put("name", counter).put("type", "SIMPLE").put("stdDataType", 1);
        }
        ObjectNode api = JsonUtils.createObjectNode();
        api.put("name", "ModelAPI").put("codeName", "ModelAPI");
        ObjectNode service = api.putArray("getPSDEServiceAPIs").addObject()
                .put("name", "ModelObservation").put("codeName", "ModelObservation");
        service.putObject("getPSDataEntity").put("modelref", true).put("path", ENTITY);
        ObjectNode method = service.putArray("getPSDEServiceAPIMethods").addObject()
                .put("name", "SysOverviewCnt").put("codeName", "SysOverviewCnt")
                .put("methodType", "DEACTION").put("requestMethod", "POST").put("dataAccessAction", "READ");
        method.putObject("getPSDEAction").put("modelref", true).put("path", ACTION);
        method.putObject("getPSDEServiceAPIMethodReturn").put("type", "DTO")
                .putObject("getPSDEMethodDTO").put("modelref", true).put("id", "ModelObservationOverviewDTO");
        ObjectNode relation = api.putArray("getPSDEServiceAPIRSs").addObject()
                .put("name", "System-Observation").put("codeName", "ModelObservations");
        relation.putObject("getMinorPSDEServiceAPI").put("modelref", true).put("id", "ModelObservation");
        relation.putObject("getParentIdPSDEField").put("name", "PSDEVSLNSYSID");
        writeModel(root, ENTITY, entity);
        writeModel(root, ACTION, action);
        writeModel(root, API, api);
    }

    private static void writeModel(Path root, String path, ObjectNode node) throws Exception {
        Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        JsonUtils.MAPPER.writeValue(file.toFile(), node);
    }
}
