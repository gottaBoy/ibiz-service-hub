package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dynamic application data entity view DTO.
 */
public class PSAppDynaDEViewDTO extends PSAppViewDTO {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSAPPDYNADEVIEWID = "PSAPPDYNADEVIEWID";
    protected static final String DTOFIELD_PSAPPDYNADEVIEWID = "psappdynadeviewid";
    public static final String FIELD_PSAPPDYNADEVIEWNAME = "PSAPPDYNADEVIEWNAME";
    protected static final String DTOFIELD_PSAPPDYNADEVIEWNAME = "psappdynadeviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    public PSAppDynaDEViewDTO() {
        setPSAppViewType("APPDYNADEVIEW");
    }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @Override @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @Override @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("psappdynadeviewid")
    public void setPSAppDynaDEViewId(String value) {
        _set(DTOFIELD_PSAPPDYNADEVIEWID, value);
        _set(DTOFIELD_PSAPPVIEWID, value);
    }
    @JsonIgnore public String getPSAppDynaDEViewId() { return (String) _get(DTOFIELD_PSAPPDYNADEVIEWID); }
    @JsonIgnore public boolean isPSAppDynaDEViewIdDirty() { return _contains(DTOFIELD_PSAPPDYNADEVIEWID); }
    @JsonIgnore public void resetPSAppDynaDEViewId() {
        _reset(DTOFIELD_PSAPPDYNADEVIEWID);
        _reset(DTOFIELD_PSAPPVIEWID);
    }
    @JsonIgnore public PSAppDynaDEViewDTO psappdynadeviewid(String value) { setPSAppDynaDEViewId(value); return this; }

    @JsonProperty("psappdynadeviewname")
    public void setPSAppDynaDEViewName(String value) {
        _set(DTOFIELD_PSAPPDYNADEVIEWNAME, value);
        _set(DTOFIELD_PSAPPVIEWNAME, value);
    }
    @JsonIgnore public String getPSAppDynaDEViewName() { return (String) _get(DTOFIELD_PSAPPDYNADEVIEWNAME); }
    @JsonIgnore public boolean isPSAppDynaDEViewNameDirty() { return _contains(DTOFIELD_PSAPPDYNADEVIEWNAME); }
    @JsonIgnore public void resetPSAppDynaDEViewName() {
        _reset(DTOFIELD_PSAPPDYNADEVIEWNAME);
        _reset(DTOFIELD_PSAPPVIEWNAME);
    }
    @JsonIgnore public PSAppDynaDEViewDTO psappdynadeviewname(String value) { setPSAppDynaDEViewName(value); return this; }

    @Override @JsonIgnore public String getName() { return getPSAppDynaDEViewName(); }
    @Override @JsonIgnore public void setName(String value) { setPSAppDynaDEViewName(value); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO name(String value) { setPSAppDynaDEViewName(value); return this; }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @Override @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @Override @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @Override @JsonIgnore public String getId() { return getPSAppDynaDEViewId(); }
    @Override @JsonIgnore public void setId(String value) { setPSAppDynaDEViewId(value); }
    @Override @JsonIgnore public PSAppDynaDEViewDTO id(String value) { setPSAppDynaDEViewId(value); return this; }
}