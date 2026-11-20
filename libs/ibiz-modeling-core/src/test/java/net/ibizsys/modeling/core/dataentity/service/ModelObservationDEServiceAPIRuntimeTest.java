package net.ibizsys.modeling.core.dataentity.service;

import static net.ibizsys.modeling.core.dataentity.service.ModelObservationOverviewReaderTest.proxy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.action.PSDELogicActionImpl;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl;
import net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.JsonUtils;

class ModelObservationDEServiceAPIRuntimeTest {
    private final IUserContext previous = UserContext.getCurrent();

    @AfterEach
    void restoreContext() {
        UserContext.setCurrent(previous);
    }

    @Test
    void nativeCandidateMethodReturnsOnlyRealCountsAndIgnoresAllCallerSelectionAndCounters() throws Throwable {
        Fixture fixture = new Fixture();
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("psdevslnsysid", "foreign-root");
        body.put("pssystemid", "foreign-system");
        body.put("sysappcnt", 99999);
        Map<String, Object> before = new LinkedHashMap<>(body);
        ModelObservationOverviewDTO result = (ModelObservationOverviewDTO) fixture.runtime.call(
                fixture.relationship, fixture.data.root, fixture.method, body, null);
        assertEquals(11, result.getSysAppCnt());
        assertEquals(before, body);
        assertEquals(Collections.emptyMap(), fixture.runtime.parsedBody);
        assertEquals(11, fixture.data.events.size());
        assertEquals(PSDEServiceAPIMethodImpl.class, fixture.method.getClass());
        assertEquals(PSDELogicActionImpl.class, fixture.method.getPSDEAction().getClass());
    }

    @Test
    void oldVoidMetadataAndMethodPolicyChangesFailBeforeNativeParsingOrAuthorization() throws Throwable {
        for (String variant : Arrays.asList("VOID", "API_VOID", "GET", "UPDATE", "BATCH", "DTOS", "OUTPUT")) {
            Fixture fixture = new Fixture();
            if ("VOID".equals(variant)) fixture.action.with("getPSDEActionReturn").put("type", "VOID");
            if ("API_VOID".equals(variant)) fixture.methodNode.with("getPSDEServiceAPIMethodReturn").put("type", "VOID");
            if ("GET".equals(variant)) fixture.methodNode.put("requestMethod", "GET");
            if ("UPDATE".equals(variant)) fixture.methodNode.put("dataAccessAction", "UPDATE");
            if ("BATCH".equals(variant)) fixture.action.put("batchAction", true);
            if ("DTOS".equals(variant)) fixture.action.with("getPSDEActionInput").put("type", "DTOS");
            if ("OUTPUT".equals(variant)) fixture.action.with("getPSDEActionInput").put("output", true);
            assertThrows(ErrorException.class, () -> fixture.call(Collections.emptyMap()), variant);
            assertEquals(0, fixture.runtime.parseCalls, variant);
            assertTrue(fixture.data.events.isEmpty(), variant);
        }
    }

    @Test
    void absentWrongOrConflictingParentRootAndNonSingleInputsAreRejected() throws Throwable {
        for (int variant = 0; variant < 6; variant++) {
            Fixture fixture = new Fixture();
            final int current = variant;
            assertThrows(ErrorException.class, () -> {
                if (current == 0) fixture.runtime.call(null, fixture.data.root,
                        fixture.method, Collections.emptyMap(), null);
                else if (current == 1) fixture.runtime.call(fixture.relationship, "root-b",
                        fixture.method, Collections.emptyMap(), null);
                else if (current == 2) fixture.call(Collections.emptyList());
                else if (current == 3) fixture.call(null);
                else if (current == 4) fixture.runtime.call(fixture.relationship, fixture.data.root,
                        fixture.method, Collections.emptyMap(), "record");
                else {
                    fixture.data.app.reset("PSDEVSLNSYS");
                    fixture.call(Collections.emptyMap());
                }
            });
            assertTrue(fixture.data.events.isEmpty(), "variant " + variant);
            assertEquals(0, fixture.runtime.parseCalls, "variant " + variant);
        }
    }

    @Test
    void unrelatedMethodDelegatesToExistingApiPathWithOriginalArguments() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.methodNode.put("codeName", "OtherAction");
        fixture.runtime.delegated = true;
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("native", "input");
        assertEquals("native-parser-delegated", assertThrows(IllegalStateException.class,
                () -> fixture.call(body)).getMessage());
        assertSame(body, fixture.runtime.parsedBody);
        assertEquals(1, fixture.runtime.parseCalls);
        assertTrue(fixture.data.events.isEmpty());
    }

    private static final class Fixture {
        final ModelObservationOverviewReaderTest.Fixture data = new ModelObservationOverviewReaderTest.Fixture();
        final ObjectNode action = JsonUtils.createObjectNode();
        final ObjectNode methodNode = JsonUtils.createObjectNode();
        final PSDEServiceAPIMethodImpl method = new PSDEServiceAPIMethodImpl();
        final Runtime runtime = new Runtime(data);
        final IDEServiceAPIRSRuntime relationship;

        Fixture() {
            action.put("name", "SysOverviewCnt");
            action.put("codeName", "SysOverviewCnt");
            action.put("actionType", "DELOGIC");
            action.put("dataAccessAction", "READ");
            action.putObject("getPSDEActionInput").put("type", "DTO");
            action.putObject("getPSDEActionReturn").put("type", "DTO");
            PSDELogicActionImpl nativeAction = new PSDELogicActionImpl();
            nativeAction.init(new PSModelServiceImpl(), null, action);
            methodNode.put("name", "SysOverviewCnt");
            methodNode.put("codeName", "SysOverviewCnt");
            methodNode.put("methodType", "DEACTION");
            methodNode.put("requestMethod", "POST");
            methodNode.put("dataAccessAction", "READ");
            methodNode.putObject("getPSDEServiceAPIMethodReturn").put("type", "DTO");
            method.init(new PSModelServiceImpl(), null, methodNode);
            method.setPSDEAction(nativeAction);
            PSDEFieldImpl parentField = new PSDEFieldImpl();
            ObjectNode fieldNode = JsonUtils.createObjectNode();
            fieldNode.put("name", "PSDEVSLNSYSID");
            parentField.init(new PSModelServiceImpl(), null, fieldNode);
            PSDEServiceAPIRSImpl relation = new PSDEServiceAPIRSImpl();
            relation.init(new PSModelServiceImpl(), null, JsonUtils.createObjectNode());
            relation.setParentIdPSDEField(parentField);
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
            return runtime.call(relationship, data.root, method, body, null);
        }
    }

    private static final class Runtime extends ModelObservationDEServiceAPIRuntime {
        private final ModelObservationOverviewReaderTest.Fixture data;
        Object parsedBody;
        int parseCalls;
        boolean delegated;

        Runtime(ModelObservationOverviewReaderTest.Fixture data) {
            this.data = data;
        }

        Object call(IDEServiceAPIRSRuntime relationship, String root,
                IPSDEServiceAPIMethod method, Object body, String key) throws Throwable {
            return onExecuteAction("fixture-scope", relationship, root, method, body, key, null);
        }

        @Override
        public IDataEntityRuntime getDataEntityRuntime() {
            return data.observation;
        }

        @Override
        protected ISystemAccessManager getSystemAccessManager() {
            return data.access;
        }

        @Override
        protected Object[] getActionArgs(IPSDEServiceAPIMethod method, IDEServiceAPIRSRuntime relationship,
                String root, Object body, String key) {
            parseCalls++;
            parsedBody = body;
            if (delegated) throw new IllegalStateException("native-parser-delegated");
            return new Object[] { data.input };
        }
    }
}
