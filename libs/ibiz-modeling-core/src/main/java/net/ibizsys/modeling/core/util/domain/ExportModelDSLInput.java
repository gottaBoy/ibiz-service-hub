package net.ibizsys.modeling.core.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.runtime.util.DataTypeUtils;

public class ExportModelDSLInput extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String DTOFIELD_DATA = "data";
    public static final String DTOFIELD_MEMBERS = "members";
    public static final String DTOFIELD_OPTION = "option";
    public static final String DTOFIELD_REQUIRES = "requires";
    public static final String OPTION_DSL_ID = "dsl_id";
    public static final String OPTION_PARAM_MODELTYPES = "param_modeltypes";
    public static final String OPTION_IGNORE_MODELTYPES = "ignore_modeltypes";
    public static final String OPTION_UPDATE = "update";
    public static final String KEYS = "srfkeys";
    public static final String PLACEHOLDER_KEYS = "___srfkeys___";

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        normalizeKey(runtime, dtoData);
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        String key = runtimeKey("srfkey");
        return PLACEHOLDER_KEYS.equals(key) ? DataTypeUtils.asString(_get(KEYS), null) : key;
    }

    @JsonIgnore
    public String getModelType() {
        return runtimeModelType();
    }

    @JsonIgnore
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

    @JsonProperty("members")
    public void setMembers(String value) {
        _set(DTOFIELD_MEMBERS, value);
    }

    @JsonIgnore
    public String getMembers() {
        return DataTypeUtils.asString(_get(DTOFIELD_MEMBERS), null);
    }

    @JsonIgnore
    public boolean isMembersDirty() {
        return _contains(DTOFIELD_MEMBERS);
    }

    @JsonIgnore
    public void resetMembers() {
        _reset(DTOFIELD_MEMBERS);
    }

    @JsonProperty("requires")
    public void setRequires(String value) {
        _set(DTOFIELD_REQUIRES, value);
    }

    @JsonIgnore
    public String getRequires() {
        return DataTypeUtils.asString(_get(DTOFIELD_REQUIRES), null);
    }

    @JsonIgnore
    public boolean isRequiresDirty() {
        return _contains(DTOFIELD_REQUIRES);
    }

    @JsonIgnore
    public void resetRequires() {
        _reset(DTOFIELD_REQUIRES);
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