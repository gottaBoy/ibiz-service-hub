package net.ibizsys.modeling.core.util.domain;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.util.ObjectUtils;

public class ImportModelV2Input extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_MODEL = "model";
    public static final String DTOFIELD_MODELV2SCOPE = "srfmodelv2scope";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        if (dtoData instanceof Map<?, ?>) {
            @SuppressWarnings("unchecked")
            Map<Object, Object> map = (Map<Object, Object>) dtoData;
            Object model = map.remove("srfmodel");
            if (model == null) {
                model = map.get(DTOFIELD_MODEL);
            }
            if (model != null) {
                map.put(DTOFIELD_MODEL, JsonUtils.toObjectNode(model));
            }

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

            if (runtime != null && runtime.getDataEntityRuntime() instanceof IDataEntityRuntime) {
                List<IPSDER1NBase> relations =
                        ((IDataEntityRuntime) runtime.getDataEntityRuntime()).getModelScopePSDER1Ns();
                Object scope = map.get(DTOFIELD_MODELV2SCOPE);
                if (!ObjectUtils.isEmpty(relations) && scope != null) {
                    String parentName = DataTypeUtils.asString(scope).split("[#]", 2)[0];
                    for (IPSDER1NBase relation : relations) {
                        if (relation.getMajorPSDataEntityMust().getName().equals(parentName)
                                && map.get(relation.getPickupPSDEFieldMust().getLowerCaseName()) == null) {
                            map.put(relation.getPickupPSDEFieldMust().getLowerCaseName(),
                                    String.format("<%s>", relation.getMajorPSDataEntityMust().getName()));
                            break;
                        }
                    }
                }
            }
            normalizeKey(runtime, map);
            map.remove("srfparentdata");
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
}