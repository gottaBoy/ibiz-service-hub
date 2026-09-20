package net.ibizsys.modeling.core.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class PasteModelInput extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_MODEL = "model";
    public static final String DTOFIELD_REQUIRES = "requires";
    public static final String DTOFIELD_MODELTYPE = "modeltype";
    public static final String DTOFIELD_MODELV2SCOPE = "srfmodelv2scope";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        if (dtoData instanceof Map<?, ?>) {
            @SuppressWarnings("unchecked")
            Map<Object, Object> map = (Map<Object, Object>) dtoData;
            Object parentData = map.get("srfparentdata");
            if (map.get(DTOFIELD_MODELV2SCOPE) == null && parentData instanceof Map<?, ?>) {
                Map<?, ?> parent = (Map<?, ?>) parentData;
                Object parentName = parent.get("srfparentdename");
                Object parentKey = parent.get("srfparentkey");
                if (parentName != null && parentKey != null) {
                    map.put(DTOFIELD_MODELV2SCOPE,
                            String.format("%s#%s", parentName.toString().toUpperCase(), parentKey));
                }
            }
            if (map.get(DTOFIELD_MODEL) instanceof Map<?, ?>) {
                map.put(DTOFIELD_MODEL, JsonUtils.toObjectNode(map.get(DTOFIELD_MODEL)));
            }
            if (map.get(DTOFIELD_REQUIRES) instanceof Map<?, ?>) {
                map.put(DTOFIELD_REQUIRES, JsonUtils.toObjectNode(map.get(DTOFIELD_REQUIRES)));
            }
            normalizeKey(runtime, map);
            map.remove("srfparentdata");
        }
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("srfkey");
    }

    @JsonProperty("srfmodelv2scope")
    public void setModelScope(String value) {
        _set(DTOFIELD_MODELV2SCOPE, value);
    }

    @JsonIgnore
    public String getModelScope() {
        return (String) _get(DTOFIELD_MODELV2SCOPE);
    }

    @JsonIgnore
    public boolean isModelScopeDirty() {
        return _contains(DTOFIELD_MODELV2SCOPE);
    }

    @JsonIgnore
    public void resetModelScope() {
        _reset(DTOFIELD_MODELV2SCOPE);
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