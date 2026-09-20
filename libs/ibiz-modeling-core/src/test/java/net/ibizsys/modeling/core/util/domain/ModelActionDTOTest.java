package net.ibizsys.modeling.core.util.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.util.JsonUtils;

class ModelActionDTOTest {

    @Test
    void compileModelDSLInputSupportsConstructorAndFields() {
        CompileModelDSLInput dto = new CompileModelDSLInput("PSDEModel", "key-1");
        assertEquals("PSDEModel", dto.getModelType());
    }

    @Test
    void compileModelDSLInputJsonAnnotations() throws Exception {
        Method m;
        m = CompileModelDSLInput.class.getMethod("setDSL", String.class);
        assertEquals("dsl", m.getAnnotation(JsonProperty.class).value());
        m = CompileModelDSLInput.class.getMethod("setModelScope", String.class);
        assertEquals("srfmodelv2scope", m.getAnnotation(JsonProperty.class).value());
        m = CompileModelDSLInput.class.getMethod("setBuild", String.class);
        assertEquals("build", m.getAnnotation(JsonProperty.class).value());
        // setOption has @JsonIgnore, not @JsonProperty; skip annotation check
    }

    @Test
    void compileModelDSLInputDirtyAndReset() {
        CompileModelDSLInput dto = new CompileModelDSLInput();
        dto.setDSL("content");
        assertTrue(dto.isDSLDirty());
        assertEquals("content", dto.getDSL());
        dto.resetDSL();
        assertFalse(dto.isDSLDirty());
        assertNull(dto.getDSL());
        dto.setModelScope("SCOPE#1");
        assertTrue(dto.isModelScopeDirty());
        assertEquals("SCOPE#1", dto.getModelScope());
        dto.resetModelScope();
        assertFalse(dto.isModelScopeDirty());
        dto.setBuild("true");
        assertTrue(dto.isBuildDirty());
        assertTrue(dto.getBuild());
        dto.resetBuild();
        assertFalse(dto.isBuildDirty());
        assertNull(dto.getBuild());
        Map<String, Object> opt = new HashMap<>();
        opt.put("update", true);
        dto.setOption(opt);
        assertTrue(dto.isOptionDirty());
        assertEquals(opt, dto.getOption());
        dto.resetOption();
        assertFalse(dto.isOptionDirty());
        assertNull(dto.getOption());
    }

    @Test
    void compileModelDSLInputBuildBooleanConversion() {
        CompileModelDSLInput dto = new CompileModelDSLInput();
        dto.setBuild("1"); assertTrue(dto.getBuild());
        dto.setBuild("0"); assertFalse(dto.getBuild());
        dto.setBuild("true"); assertTrue(dto.getBuild());
        dto.setBuild("false"); assertFalse(dto.getBuild());
    }

    @Test
    void compileModelDSLInputConstants() {
        assertEquals("dsl", CompileModelDSLInput.DTOFIELD_DSL);
        assertEquals("srfmodelv2scope", CompileModelDSLInput.DTOFIELD_MODELSCOPE);
        assertEquals("build", CompileModelDSLInput.DTOFIELD_BUILD);
        assertEquals("option", CompileModelDSLInput.DTOFIELD_OPTION);
        assertEquals("update", CompileModelDSLInput.OPTION_UPDATE);
    }

    @Test
    void compileModelDSLInputKeyWithoutRuntime() {
        CompileModelDSLInput dto = new CompileModelDSLInput();
        assertNull(dto.getKey());
        assertNull(dto.getModelType());
    }

    @Test
    void compileModelDSLResultJsonAnnotation() throws Exception {
        Method m = CompileModelDSLResult.class.getMethod("setData", Object.class);
        assertEquals("data", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void compileModelDSLResultDirtyAndReset() {
        CompileModelDSLResult dto = new CompileModelDSLResult();
        Object data = new HashMap<String, Object>();
        dto.setData(data);
        assertTrue(dto.isDataDirty());
        assertSame(data, dto.getData());
        dto.resetData();
        assertFalse(dto.isDataDirty());
        assertNull(dto.getData());
    }

    @Test
    void copyModelInputJsonAnnotation() throws Exception {
        // setOption has @JsonIgnore, not @JsonProperty; skip annotation check
    }

    @Test
    void copyModelInputDirtyAndReset() {
        CopyModelInput dto = new CopyModelInput();
        Map<String, Object> opt = new HashMap<>();
        opt.put("ignore_modeltypes", "PSDEModel");
        dto.setOption(opt);
        assertTrue(dto.isOptionDirty());
        assertEquals(opt, dto.getOption());
        dto.resetOption();
        assertFalse(dto.isOptionDirty());
        assertNull(dto.getOption());
    }

    @Test
    void copyModelInputConstants() {
        assertEquals("option", CopyModelInput.DTOFIELD_OPTION);
        assertEquals("ignore_modeltypes", CopyModelInput.OPTION_IGNORE_MODELTYPES);
    }

    @Test
    void copyModelInputKeyWithoutRuntime() {
        CopyModelInput dto = new CopyModelInput();
        assertNull(dto.getKey());
    }

    @Test
    void copyModelResultJsonAnnotations() throws Exception {
        Method m;
        m = CopyModelResult.class.getMethod("setModelType", String.class);
        assertEquals("modeltype", m.getAnnotation(JsonProperty.class).value());
        m = CopyModelResult.class.getMethod("setModel", ObjectNode.class);
        assertEquals("model", m.getAnnotation(JsonProperty.class).value());
        m = CopyModelResult.class.getMethod("setRequires", ObjectNode.class);
        assertEquals("requires", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void copyModelResultDirtyAndReset() {
        CopyModelResult dto = new CopyModelResult();
        dto.setModelType("PSDEModel");
        assertTrue(dto.isModelTypeDirty());
        assertEquals("PSDEModel", dto.getModelType());
        dto.resetModelType();
        assertFalse(dto.isModelTypeDirty());
        assertNull(dto.getModelType());
        ObjectNode model = JsonUtils.toObjectNode("{\"a\":1}");
        dto.setModel(model);
        assertTrue(dto.isModelDirty());
        assertSame(model, dto.getModel());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getModel());
        ObjectNode req = JsonUtils.toObjectNode("{\"b\":2}");
        dto.setRequires(req);
        assertTrue(dto.isRequiresDirty());
        assertSame(req, dto.getRequires());
        dto.resetRequires();
        assertFalse(dto.isRequiresDirty());
        assertNull(dto.getRequires());
    }

    @Test
    void copyModelResultConstants() {
        assertEquals("model", CopyModelResult.DTOFIELD_MODEL);
        assertEquals("requires", CopyModelResult.DTOFIELD_REQUIRES);
        assertEquals("modeltype", CopyModelResult.DTOFIELD_MODELTYPE);
    }

    @Test
    void copyModelResultKeyWithoutRuntime() {
        CopyModelResult dto = new CopyModelResult();
        assertNull(dto.getKey());
    }

    @Test
    void exportModelDSLInputJsonAnnotations() throws Exception {
        Method m;
        m = ExportModelDSLInput.class.getMethod("setMembers", String.class);
        assertEquals("members", m.getAnnotation(JsonProperty.class).value());
        m = ExportModelDSLInput.class.getMethod("setRequires", String.class);
        assertEquals("requires", m.getAnnotation(JsonProperty.class).value());
        // setOption has @JsonIgnore, not @JsonProperty; skip annotation check
    }

    @Test
    void exportModelDSLInputDirtyAndReset() {
        ExportModelDSLInput dto = new ExportModelDSLInput();
        dto.setMembers("m1,m2");
        assertTrue(dto.isMembersDirty());
        assertEquals("m1,m2", dto.getMembers());
        dto.resetMembers();
        assertFalse(dto.isMembersDirty());
        assertNull(dto.getMembers());
        dto.setRequires("PSDEModel");
        assertTrue(dto.isRequiresDirty());
        assertEquals("PSDEModel", dto.getRequires());
        dto.resetRequires();
        assertFalse(dto.isRequiresDirty());
        assertNull(dto.getRequires());
        Map<String, Object> opt = new HashMap<>();
        opt.put("dsl_id", "1");
        dto.setOption(opt);
        assertTrue(dto.isOptionDirty());
        assertEquals(opt, dto.getOption());
        dto.resetOption();
        assertFalse(dto.isOptionDirty());
        assertNull(dto.getOption());
    }

    @Test
    void exportModelDSLInputConstants() {
        assertEquals("data", ExportModelDSLInput.DTOFIELD_DATA);
        assertEquals("members", ExportModelDSLInput.DTOFIELD_MEMBERS);
        assertEquals("option", ExportModelDSLInput.DTOFIELD_OPTION);
        assertEquals("requires", ExportModelDSLInput.DTOFIELD_REQUIRES);
        assertEquals("dsl_id", ExportModelDSLInput.OPTION_DSL_ID);
        assertEquals("param_modeltypes", ExportModelDSLInput.OPTION_PARAM_MODELTYPES);
        assertEquals("ignore_modeltypes", ExportModelDSLInput.OPTION_IGNORE_MODELTYPES);
        assertEquals("update", ExportModelDSLInput.OPTION_UPDATE);
        assertEquals("srfkeys", ExportModelDSLInput.KEYS);
        assertEquals("___srfkeys___", ExportModelDSLInput.PLACEHOLDER_KEYS);
    }

    @Test
    void exportModelDSLInputDataField() {
        ExportModelDSLInput dto = new ExportModelDSLInput();
        Object data = "raw-data";
        dto.setData(data);
        assertTrue(dto.isDataDirty());
        assertSame(data, dto.getData());
        dto.resetData();
        assertFalse(dto.isDataDirty());
        assertNull(dto.getData());
    }

    @Test
    void exportModelDSLInputKeyWithoutRuntime() {
        ExportModelDSLInput dto = new ExportModelDSLInput();
        assertNull(dto.getKey());
        assertNull(dto.getModelType());
    }

    @Test
    void exportModelDSLResultJsonAnnotation() throws Exception {
        Method m = ExportModelDSLResult.class.getMethod("setDSL", String.class);
        assertEquals("dsl", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void exportModelDSLResultDirtyAndReset() {
        ExportModelDSLResult dto = new ExportModelDSLResult();
        dto.setDSL("dsl-content");
        assertTrue(dto.isModelDirty());
        assertEquals("dsl-content", dto.getDSL());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getDSL());
    }

    @Test
    void exportModelDSLResultKeyWithoutRuntime() {
        ExportModelDSLResult dto = new ExportModelDSLResult();
        assertNull(dto.getKey());
    }

    @Test
    void exportModelV2InputKeyWithoutRuntime() {
        ExportModelV2Input dto = new ExportModelV2Input();
        assertNull(dto.getKey());
    }

    @Test
    void exportModelV2ResultJsonAnnotation() throws Exception {
        Method m = ExportModelV2Result.class.getMethod("setModel", ObjectNode.class);
        assertEquals("model", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void exportModelV2ResultDirtyAndReset() {
        ExportModelV2Result dto = new ExportModelV2Result();
        ObjectNode model = JsonUtils.toObjectNode("{\"foo\":\"bar\"}");
        dto.setModel(model);
        assertTrue(dto.isModelDirty());
        assertSame(model, dto.getModel());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getModel());
    }

    @Test
    void exportModelV2ResultKeyWithoutRuntime() {
        ExportModelV2Result dto = new ExportModelV2Result();
        assertNull(dto.getKey());
    }

    @Test
    void importModelV2InputJsonAnnotations() throws Exception {
        Method m;
        m = ImportModelV2Input.class.getMethod("setModel", ObjectNode.class);
        assertEquals("model", m.getAnnotation(JsonProperty.class).value());
        m = ImportModelV2Input.class.getMethod("setModelScope", String.class);
        assertEquals("srfmodelv2scope", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void importModelV2InputDirtyAndReset() {
        ImportModelV2Input dto = new ImportModelV2Input();
        ObjectNode model = JsonUtils.toObjectNode("{\"x\":1}");
        dto.setModel(model);
        assertTrue(dto.isModelDirty());
        assertSame(model, dto.getModel());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getModel());
        dto.setModelScope("SCOPE_V2#1");
        assertTrue(dto.isModelScopeDirty());
        assertEquals("SCOPE_V2#1", dto.getModelScope());
        dto.resetModelScope();
        assertFalse(dto.isModelScopeDirty());
        assertNull(dto.getModelScope());
    }

    @Test
    void importModelV2InputConstants() {
        assertEquals("model", ImportModelV2Input.DTOFIELD_MODEL);
        assertEquals("srfmodelv2scope", ImportModelV2Input.DTOFIELD_MODELV2SCOPE);
    }

    @Test
    void importModelV2InputKeyWithoutRuntime() {
        ImportModelV2Input dto = new ImportModelV2Input();
        assertNull(dto.getKey());
    }

    @Test
    void mergeModelDSLInputJsonAnnotations() throws Exception {
        Method m;
        m = MergeModelDSLInput.class.getMethod("setDSL", Map.class);
        assertEquals("dsl", m.getAnnotation(JsonProperty.class).value());
        m = MergeModelDSLInput.class.getMethod("setChangedModel", String.class);
        assertEquals("changedmodel", m.getAnnotation(JsonProperty.class).value());
        m = MergeModelDSLInput.class.getMethod("setFrom", String.class);
        assertEquals("from", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void mergeModelDSLInputDirtyAndReset() {
        MergeModelDSLInput dto = new MergeModelDSLInput();
        Map<String, String> dslMap = new LinkedHashMap<>();
        dslMap.put("PSDEModel", "dsl content");
        dto.setDSL(dslMap);
        assertTrue(dto.isDSLDirty());
        assertEquals(dslMap, dto.getDSL());
        dto.resetDSL();
        assertFalse(dto.isDSLDirty());
        assertNull(dto.getDSL());
        dto.setChangedModel("true");
        assertTrue(dto.isChangedModelDirty());
        assertTrue(dto.getChangedModel());
        dto.resetChangedModel();
        assertFalse(dto.isChangedModelDirty());
        assertNull(dto.getChangedModel());
        Timestamp ts = Timestamp.valueOf("2026-09-06 12:00:00");
        dto.setFrom(ts.toString());
        assertTrue(dto.isFromDirty());
        assertEquals(ts, dto.getFrom());
        dto.resetFrom();
        assertFalse(dto.isFromDirty());
        assertNull(dto.getFrom());
    }

    @Test
    void mergeModelDSLInputBooleanConversion() {
        MergeModelDSLInput dto = new MergeModelDSLInput();
        dto.setChangedModel("true"); assertTrue(dto.getChangedModel());
        dto.setChangedModel("false"); assertFalse(dto.getChangedModel());
        dto.setChangedModel("1"); assertTrue(dto.getChangedModel());
        dto.setChangedModel("0"); assertFalse(dto.getChangedModel());
    }

    @Test
    void mergeModelDSLInputTimestampConversion() {
        MergeModelDSLInput dto = new MergeModelDSLInput();
        dto.setFrom("2026-09-06 12:34:56");
        assertNotNull(dto.getFrom());
        assertEquals(Timestamp.valueOf("2026-09-06 12:34:56"), dto.getFrom());
        dto.setFrom("1725600000000");
        assertNotNull(dto.getFrom());
    }

    @Test
    void mergeModelDSLInputConstants() {
        assertEquals("dsl", MergeModelDSLInput.DTOFIELD_DSL);
        assertEquals("changedmodel", MergeModelDSLInput.DTOFIELD_CHANGEDMODEL);
        assertEquals("from", MergeModelDSLInput.DTOFIELD_FROM);
    }

    @Test
    void mergeModelDSLResultJsonAnnotation() throws Exception {
        Method m = MergeModelDSLResult.class.getMethod("setDSL", String.class);
        assertEquals("dsl", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void mergeModelDSLResultDirtyAndReset() {
        MergeModelDSLResult dto = new MergeModelDSLResult();
        dto.setDSL("merged-dsl");
        assertTrue(dto.isModelDirty());
        assertEquals("merged-dsl", dto.getDSL());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getDSL());
    }

    @Test
    void mergeModelDSLResultKeyWithoutRuntime() {
        MergeModelDSLResult dto = new MergeModelDSLResult();
        assertNull(dto.getKey());
    }

    @Test
    void pasteModelInputJsonAnnotations() throws Exception {
        Method m;
        m = PasteModelInput.class.getMethod("setModelScope", String.class);
        assertEquals("srfmodelv2scope", m.getAnnotation(JsonProperty.class).value());
        m = PasteModelInput.class.getMethod("setModelType", String.class);
        assertEquals("modeltype", m.getAnnotation(JsonProperty.class).value());
        m = PasteModelInput.class.getMethod("setModel", ObjectNode.class);
        assertEquals("model", m.getAnnotation(JsonProperty.class).value());
        m = PasteModelInput.class.getMethod("setRequires", ObjectNode.class);
        assertEquals("requires", m.getAnnotation(JsonProperty.class).value());
    }

    @Test
    void pasteModelInputDirtyAndReset() {
        PasteModelInput dto = new PasteModelInput();
        dto.setModelScope("SCOPE#1");
        assertTrue(dto.isModelScopeDirty());
        assertEquals("SCOPE#1", dto.getModelScope());
        dto.resetModelScope();
        assertFalse(dto.isModelScopeDirty());
        assertNull(dto.getModelScope());
        dto.setModelType("PSDEModel");
        assertTrue(dto.isModelTypeDirty());
        assertEquals("PSDEModel", dto.getModelType());
        dto.resetModelType();
        assertFalse(dto.isModelTypeDirty());
        assertNull(dto.getModelType());
        ObjectNode model = JsonUtils.toObjectNode("{\"a\":1}");
        dto.setModel(model);
        assertTrue(dto.isModelDirty());
        assertSame(model, dto.getModel());
        dto.resetModel();
        assertFalse(dto.isModelDirty());
        assertNull(dto.getModel());
        ObjectNode req = JsonUtils.toObjectNode("{\"b\":2}");
        dto.setRequires(req);
        assertTrue(dto.isRequiresDirty());
        assertSame(req, dto.getRequires());
        dto.resetRequires();
        assertFalse(dto.isRequiresDirty());
        assertNull(dto.getRequires());
    }

    @Test
    void pasteModelInputConstants() {
        assertEquals("model", PasteModelInput.DTOFIELD_MODEL);
        assertEquals("requires", PasteModelInput.DTOFIELD_REQUIRES);
        assertEquals("modeltype", PasteModelInput.DTOFIELD_MODELTYPE);
        assertEquals("srfmodelv2scope", PasteModelInput.DTOFIELD_MODELV2SCOPE);
    }

    @Test
    void pasteModelInputKeyWithoutRuntime() {
        PasteModelInput dto = new PasteModelInput();
        assertNull(dto.getKey());
    }

    @Test
    void compileModelDSLResultConstants() {
        assertEquals("data", CompileModelDSLResult.DTOFIELD_DATA);
    }

    @Test
    void exportModelDSLResultConstants() {
        assertEquals("dsl", ExportModelDSLResult.DTOFIELD_DSL);
    }

    @Test
    void mergeModelDSLResultConstants() {
        assertEquals("dsl", MergeModelDSLResult.DTOFIELD_DSL);
    }
}