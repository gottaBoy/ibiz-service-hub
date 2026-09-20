package net.ibizsys.modeling.core.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;

public class CopyModelInput extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_OPTION = "option";
    public static final String OPTION_IGNORE_MODELTYPES = "ignore_modeltypes";

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