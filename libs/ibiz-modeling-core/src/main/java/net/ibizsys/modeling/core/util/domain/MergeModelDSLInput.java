package net.ibizsys.modeling.core.util.domain;

import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;

public class MergeModelDSLInput extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_DSL = "dsl";
    public static final String DTOFIELD_CHANGEDMODEL = "changedmodel";
    public static final String DTOFIELD_FROM = "from";

    @JsonProperty("dsl")
    public void setDSL(Map<String, String> value) {
        _set(DTOFIELD_DSL, value);
    }

    @JsonIgnore
    @SuppressWarnings("unchecked")
    public Map<String, String> getDSL() {
        return (Map<String, String>) _get(DTOFIELD_DSL);
    }

    @JsonIgnore
    public boolean isDSLDirty() {
        return _contains(DTOFIELD_DSL);
    }

    @JsonIgnore
    public void resetDSL() {
        _reset(DTOFIELD_DSL);
    }

    @JsonProperty("changedmodel")
    public void setChangedModel(String value) {
        _set(DTOFIELD_CHANGEDMODEL, value);
    }

    @JsonIgnore
    public Boolean getChangedModel() {
        return booleanValue(DTOFIELD_CHANGEDMODEL);
    }

    @JsonIgnore
    public boolean isChangedModelDirty() {
        return _contains(DTOFIELD_CHANGEDMODEL);
    }

    @JsonIgnore
    public void resetChangedModel() {
        _reset(DTOFIELD_CHANGEDMODEL);
    }

    @JsonProperty("from")
    public void setFrom(String value) {
        _set(DTOFIELD_FROM, value);
    }

    @JsonIgnore
    public Timestamp getFrom() {
        return DataTypeUtils.asDateTime(_get(DTOFIELD_FROM), null);
    }

    @JsonIgnore
    public boolean isFromDirty() {
        return _contains(DTOFIELD_FROM);
    }

    @JsonIgnore
    public void resetFrom() {
        _reset(DTOFIELD_FROM);
    }
}