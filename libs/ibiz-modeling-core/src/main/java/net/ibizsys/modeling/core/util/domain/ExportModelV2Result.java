package net.ibizsys.modeling.core.util.domain;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class ExportModelV2Result extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_MODEL = "model";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        if (dtoData instanceof Map<?, ?>) {
            ObjectNode model = JsonUtils.toObjectNode(dtoData);
            Map<String, ObjectNode> wrapped = new LinkedHashMap<>();
            wrapped.put(DTOFIELD_MODEL, model);
            dtoData = wrapped;
        }
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("key");
    }

    @JsonProperty("model")
    public void setModel(ObjectNode value) {
        _set(DTOFIELD_MODEL, value);
    }

    @JsonIgnore
    public ObjectNode getModel() {
        return (ObjectNode) _get(DTOFIELD_MODEL);
    }

    @JsonIgnore
    public boolean isModelDirty() {
        return _contains(DTOFIELD_MODEL);
    }

    @JsonIgnore
    public void resetModel() {
        _reset(DTOFIELD_MODEL);
    }
}