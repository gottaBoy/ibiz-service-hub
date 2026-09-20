package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application predefined view DTO.
 */
public class PSAppPDTViewDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPPDTVIEWID = "PSAPPPDTVIEWID";
    protected static final String DTOFIELD_PSAPPPDTVIEWID = "psapppdtviewid";
    public static final String FIELD_PSAPPPDTVIEWNAME = "PSAPPPDTVIEWNAME";
    protected static final String DTOFIELD_PSAPPPDTVIEWNAME = "psapppdtviewname";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSPDTVIEWID = "PSSYSPDTVIEWID";
    protected static final String DTOFIELD_PSSYSPDTVIEWID = "pssyspdtviewid";
    public static final String FIELD_PSSYSPDTVIEWNAME = "PSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSAppPDTViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppPDTViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppPDTViewDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("psapppdtviewid")
    public void setPSAppPDTViewId(String value) { _set(DTOFIELD_PSAPPPDTVIEWID, value); }
    @JsonIgnore public String getPSAppPDTViewId() { return (String) _get(DTOFIELD_PSAPPPDTVIEWID); }
    @JsonIgnore public boolean isPSAppPDTViewIdDirty() { return _contains(DTOFIELD_PSAPPPDTVIEWID); }
    @JsonIgnore public void resetPSAppPDTViewId() { _reset(DTOFIELD_PSAPPPDTVIEWID); }
    @JsonIgnore public PSAppPDTViewDTO psapppdtviewid(String value) { setPSAppPDTViewId(value); return this; }

    @JsonProperty("psapppdtviewname")
    public void setPSAppPDTViewName(String value) { _set(DTOFIELD_PSAPPPDTVIEWNAME, value); }
    @JsonIgnore public String getPSAppPDTViewName() { return (String) _get(DTOFIELD_PSAPPPDTVIEWNAME); }
    @JsonIgnore public boolean isPSAppPDTViewNameDirty() { return _contains(DTOFIELD_PSAPPPDTVIEWNAME); }
    @JsonIgnore public void resetPSAppPDTViewName() { _reset(DTOFIELD_PSAPPPDTVIEWNAME); }
    @JsonIgnore public PSAppPDTViewDTO psapppdtviewname(String value) { setPSAppPDTViewName(value); return this; }
    @JsonIgnore public String getName() { return getPSAppPDTViewName(); }
    @JsonIgnore public void setName(String value) { setPSAppPDTViewName(value); }
    @JsonIgnore public PSAppPDTViewDTO name(String value) { setPSAppPDTViewName(value); return this; }

    @JsonProperty("psappviewid")
    public void setPSAppViewId(String value) { _set(DTOFIELD_PSAPPVIEWID, value); }
    @JsonIgnore public String getPSAppViewId() { return (String) _get(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public boolean isPSAppViewIdDirty() { return _contains(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public void resetPSAppViewId() { _reset(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public PSAppPDTViewDTO psappviewid(String value) { setPSAppViewId(value); return this; }

    @JsonProperty("psappviewname")
    public void setPSAppViewName(String value) { _set(DTOFIELD_PSAPPVIEWNAME, value); }
    @JsonIgnore public String getPSAppViewName() { return (String) _get(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public boolean isPSAppViewNameDirty() { return _contains(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public void resetPSAppViewName() { _reset(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public PSAppPDTViewDTO psappviewname(String value) { setPSAppViewName(value); return this; }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { _set(DTOFIELD_PSSYSAPPID, value); }
    @JsonIgnore public String getPSSysAppId() { return (String) _get(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return _contains(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { _reset(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppPDTViewDTO pssysappid(String value) { setPSSysAppId(value); return this; }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { _set(DTOFIELD_PSSYSAPPNAME, value); }
    @JsonIgnore public String getPSSysAppName() { return (String) _get(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return _contains(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { _reset(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppPDTViewDTO pssysappname(String value) { setPSSysAppName(value); return this; }

    @JsonProperty("pssyspdtviewid")
    public void setPSSysPDTViewId(String value) { _set(DTOFIELD_PSSYSPDTVIEWID, value); }
    @JsonIgnore public String getPSSysPDTViewId() { return (String) _get(DTOFIELD_PSSYSPDTVIEWID); }
    @JsonIgnore public boolean isPSSysPDTViewIdDirty() { return _contains(DTOFIELD_PSSYSPDTVIEWID); }
    @JsonIgnore public void resetPSSysPDTViewId() { _reset(DTOFIELD_PSSYSPDTVIEWID); }
    @JsonIgnore public PSAppPDTViewDTO pssyspdtviewid(String value) { setPSSysPDTViewId(value); return this; }

    @JsonProperty("pssyspdtviewname")
    public void setPSSysPDTViewName(String value) { _set(DTOFIELD_PSSYSPDTVIEWNAME, value); }
    @JsonIgnore public String getPSSysPDTViewName() { return (String) _get(DTOFIELD_PSSYSPDTVIEWNAME); }
    @JsonIgnore public boolean isPSSysPDTViewNameDirty() { return _contains(DTOFIELD_PSSYSPDTVIEWNAME); }
    @JsonIgnore public void resetPSSysPDTViewName() { _reset(DTOFIELD_PSSYSPDTVIEWNAME); }
    @JsonIgnore public PSAppPDTViewDTO pssyspdtviewname(String value) { setPSSysPDTViewName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppPDTViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppPDTViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSAppPDTViewDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSAppPDTViewDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppPDTViewDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppPDTViewDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppPDTViewDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppPDTViewDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSAppPDTViewDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSAppPDTViewDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSAppPDTViewId(); }
    @JsonIgnore public void setId(String value) { setPSAppPDTViewId(value); }
    @JsonIgnore public PSAppPDTViewDTO id(String value) { setPSAppPDTViewId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}