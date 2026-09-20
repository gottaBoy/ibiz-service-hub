package net.ibizsys.modeling.core.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;

public class CompileModelDSLInput extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_DSL = "dsl";
    public static final String DTOFIELD_MODELSCOPE = "srfmodelv2scope";
    public static final String DTOFIELD_BUILD = "build";
    public static final String DTOFIELD_OPTION = "option";
    public static final String OPTION_UPDATE = "update";

    private transient String modelType;

    public CompileModelDSLInput() {
    }

    public CompileModelDSLInput(String modelType, String key) {
        this.modelType = modelType;
        _set(key, key);
    }

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        normalizeKey(runtime, dtoData);
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("srfkey");
    }

    @JsonIgnore
    public String getModelType() {
        String runtimeType = runtimeModelType();
        return runtimeType != null ? runtimeType : modelType;
    }

    @JsonProperty("dsl")
    public void setDSL(String value) {
        _set(DTOFIELD_DSL, value);
    }

    @JsonIgnore
    public String getDSL() {
        return DataTypeUtils.asString(_get(DTOFIELD_DSL), null);
    }

    @JsonIgnore
    public boolean isDSLDirty() {
        return _contains(DTOFIELD_DSL);
    }

    @JsonIgnore
    public void resetDSL() {
        _reset(DTOFIELD_DSL);
    }

    @JsonProperty("srfmodelv2scope")
    public void setModelScope(String value) {
        _set(DTOFIELD_MODELSCOPE, value);
    }

    @JsonIgnore
    public String getModelScope() {
        return DataTypeUtils.asString(_get(DTOFIELD_MODELSCOPE), null);
    }

    @JsonIgnore
    public boolean isModelScopeDirty() {
        return _contains(DTOFIELD_MODELSCOPE);
    }

    @JsonIgnore
    public void resetModelScope() {
        _reset(DTOFIELD_MODELSCOPE);
    }

    @JsonProperty("build")
    public void setBuild(String value) {
        _set(DTOFIELD_BUILD, value);
    }

    @JsonIgnore
    public Boolean getBuild() {
        return booleanValue(DTOFIELD_BUILD);
    }

    @JsonIgnore
    public boolean isBuildDirty() {
        return _contains(DTOFIELD_BUILD);
    }

    @JsonIgnore
    public void resetBuild() {
        _reset(DTOFIELD_BUILD);
    }

    @JsonIgnore
    public void setOption(Map<?, ?> value) {
        _set(DTOFIELD_OPTION, value);
    }

    @JsonIgnore
    @SuppressWarnings("unchecked")
    public Map<String, Object> getOption() {
        return (Map<String, Object>) _get(DTOFIELD_OPTION);
    }

    @JsonIgnore
    public boolean isOptionDirty() {
        return _contains(DTOFIELD_OPTION);
    }

    @JsonIgnore
    public void resetOption() {
        _reset(DTOFIELD_OPTION);
    }
}