package net.ibizsys.modeling.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;

public class CopyModelResult extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_MODEL = "model";
    public static final String DTOFIELD_REQUIRES = "requires";
    public static final String DTOFIELD_MODELTYPE = "modeltype";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("srfkey");
    }

    @JsonProperty("modeltype")
    public void setModelType(String value) {
        _set(DTOFIELD_MODELTYPE, value);
    }

    @JsonIgnore
    public String getModelType() {
        return (String) _get(DTOFIELD_MODELTYPE);
    }

    @JsonIgnore
    public boolean isModelTypeDirty() {
        return _contains(DTOFIELD_MODELTYPE);
    }

    @JsonIgnore
    public void resetModelType() {
        _reset(DTOFIELD_MODELTYPE);
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

    @JsonProperty("requires")
    public void setRequires(ObjectNode value) {
        _set(DTOFIELD_REQUIRES, value);
    }

    @JsonIgnore
    public ObjectNode getRequires() {
        return (ObjectNode) _get(DTOFIELD_REQUIRES);
    }

    @JsonIgnore
    public boolean isRequiresDirty() {
        return _contains(DTOFIELD_REQUIRES);
    }

    @JsonIgnore
    public void resetRequires() {
        _reset(DTOFIELD_REQUIRES);
    }
}