package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application data entity view DTO.
 */
public class PSAppDEViewDTO extends PSAppViewDTO {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSAPPDEVIEWID = "PSAPPDEVIEWID";
    protected static final String DTOFIELD_PSAPPDEVIEWID = "psappdeviewid";
    public static final String FIELD_PSAPPDEVIEWNAME = "PSAPPDEVIEWNAME";
    protected static final String DTOFIELD_PSAPPDEVIEWNAME = "psappdeviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    public PSAppDEViewDTO() {
        setPSAppViewType("APPDEVIEW");
    }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @Override @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public PSAppDEViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @Override @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public PSAppDEViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("psappdeviewid")
    public void setPSAppDEViewId(String value) {
        _set(DTOFIELD_PSAPPDEVIEWID, value);
        _set(DTOFIELD_PSAPPVIEWID, value);
    }
    @JsonIgnore public String getPSAppDEViewId() { return (String) _get(DTOFIELD_PSAPPDEVIEWID); }
    @JsonIgnore public boolean isPSAppDEViewIdDirty() { return _contains(DTOFIELD_PSAPPDEVIEWID); }
    @JsonIgnore public void resetPSAppDEViewId() {
        _reset(DTOFIELD_PSAPPDEVIEWID);
        _reset(DTOFIELD_PSAPPVIEWID);
    }
    @JsonIgnore public PSAppDEViewDTO psappdeviewid(String value) { setPSAppDEViewId(value); return this; }

    @JsonProperty("psappdeviewname")
    public void setPSAppDEViewName(String value) {
        _set(DTOFIELD_PSAPPDEVIEWNAME, value);
        _set(DTOFIELD_PSAPPVIEWNAME, value);
    }
    @JsonIgnore public String getPSAppDEViewName() { return (String) _get(DTOFIELD_PSAPPDEVIEWNAME); }
    @JsonIgnore public boolean isPSAppDEViewNameDirty() { return _contains(DTOFIELD_PSAPPDEVIEWNAME); }
    @JsonIgnore public void resetPSAppDEViewName() {
        _reset(DTOFIELD_PSAPPDEVIEWNAME);
        _reset(DTOFIELD_PSAPPVIEWNAME);
    }
    @JsonIgnore public PSAppDEViewDTO psappdeviewname(String value) { setPSAppDEViewName(value); return this; }

    @Override @JsonIgnore public String getName() { return getPSAppDEViewName(); }
    @Override @JsonIgnore public void setName(String value) { setPSAppDEViewName(value); }
    @Override @JsonIgnore public PSAppDEViewDTO name(String value) { setPSAppDEViewName(value); return this; }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @Override @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public PSAppDEViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @Override @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public PSAppDEViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @Override @JsonIgnore public String getId() { return getPSAppDEViewId(); }
    @Override @JsonIgnore public void setId(String value) { setPSAppDEViewId(value); }
    @Override @JsonIgnore public PSAppDEViewDTO id(String value) { setPSAppDEViewId(value); return this; }
}