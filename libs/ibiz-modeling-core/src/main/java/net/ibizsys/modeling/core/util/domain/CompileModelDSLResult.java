package net.ibizsys.modeling.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompileModelDSLResult extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_DATA = "data";

    @JsonProperty("data")
    public void setData(Object value) {
        _set(DTOFIELD_DATA, value);
    }

    @JsonIgnore
    public Object getData() {
        return _get(DTOFIELD_DATA);
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return _contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        _reset(DTOFIELD_DATA);
    }
}