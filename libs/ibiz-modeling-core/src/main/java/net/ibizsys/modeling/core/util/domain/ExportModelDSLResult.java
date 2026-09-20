package net.ibizsys.modeling.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;

public class ExportModelDSLResult extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_DSL = "dsl";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("key");
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
    public boolean isModelDirty() {
        return _contains(DTOFIELD_DSL);
    }

    @JsonIgnore
    public void resetModel() {
        _reset(DTOFIELD_DSL);
    }
}