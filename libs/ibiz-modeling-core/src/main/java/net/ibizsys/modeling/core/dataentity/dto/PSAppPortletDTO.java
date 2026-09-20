package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application portlet DTO.
 */
public class PSAppPortletDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSAPPPORTLETID = "PSAPPPORTLETID";
    protected static final String DTOFIELD_PSAPPPORTLETID = "psappportletid";
    public static final String FIELD_PSAPPPORTLETNAME = "PSAPPPORTLETNAME";
    protected static final String DTOFIELD_PSAPPPORTLETNAME = "psappportletname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSPORTLETID = "PSSYSPORTLETID";
    protected static final String DTOFIELD_PSSYSPORTLETID = "pssysportletid";
    public static final String FIELD_PSSYSPORTLETNAME = "PSSYSPORTLETNAME";
    protected static final String DTOFIELD_PSSYSPORTLETNAME = "pssysportletname";
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

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSAppPortletDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSAppPortletDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppPortletDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppPortletDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("psappdataentityid")
    public void setPSAppDataEntityId(String value) {
        _set(DTOFIELD_PSAPPDATAENTITYID, value);
        _set(FIELD_PSAPPDATAENTITYID, value);
    }
    @JsonIgnore public String getPSAppDataEntityId() {
        Object value = _get(DTOFIELD_PSAPPDATAENTITYID);
        return (String) (value == null ? _get(FIELD_PSAPPDATAENTITYID) : value);
    }
    @JsonIgnore public boolean isPSAppDataEntityIdDirty() {
        return _contains(DTOFIELD_PSAPPDATAENTITYID) || _contains(FIELD_PSAPPDATAENTITYID);
    }
    @JsonIgnore public void resetPSAppDataEntityId() {
        _reset(DTOFIELD_PSAPPDATAENTITYID);
        _reset(FIELD_PSAPPDATAENTITYID);
    }
    @JsonIgnore public PSAppPortletDTO psappdataentityid(String value) { setPSAppDataEntityId(value); return this; }

    @JsonIgnore @Deprecated public String getPSAppLocalDEId() { return getPSAppDataEntityId(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEId(String value) { setPSAppDataEntityId(value); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDEIdDirty() { return isPSAppDataEntityIdDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEId() { resetPSAppDataEntityId(); }

    @JsonProperty("psappdataentityname")
    public void setPSAppDataEntityName(String value) {
        _set(DTOFIELD_PSAPPDATAENTITYNAME, value);
        _set(FIELD_PSAPPDATAENTITYNAME, value);
    }
    @JsonIgnore public String getPSAppDataEntityName() {
        Object value = _get(DTOFIELD_PSAPPDATAENTITYNAME);
        return (String) (value == null ? _get(FIELD_PSAPPDATAENTITYNAME) : value);
    }
    @JsonIgnore public boolean isPSAppDataEntityNameDirty() {
        return _contains(DTOFIELD_PSAPPDATAENTITYNAME) || _contains(FIELD_PSAPPDATAENTITYNAME);
    }
    @JsonIgnore public void resetPSAppDataEntityName() {
        _reset(DTOFIELD_PSAPPDATAENTITYNAME);
        _reset(FIELD_PSAPPDATAENTITYNAME);
    }
    @JsonIgnore public PSAppPortletDTO psappdataentityname(String value) { setPSAppDataEntityName(value); return this; }

    @JsonIgnore @Deprecated public String getPSAppLocalDEName() { return getPSAppDataEntityName(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEName(String value) { setPSAppDataEntityName(value); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDENameDirty() { return isPSAppDataEntityNameDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEName() { resetPSAppDataEntityName(); }

    @JsonProperty("psappportletid")
    public void setPSAppPortletId(String value) { _set(DTOFIELD_PSAPPPORTLETID, value); }
    @JsonIgnore public String getPSAppPortletId() { return (String) _get(DTOFIELD_PSAPPPORTLETID); }
    @JsonIgnore public boolean isPSAppPortletIdDirty() { return _contains(DTOFIELD_PSAPPPORTLETID); }
    @JsonIgnore public void resetPSAppPortletId() { _reset(DTOFIELD_PSAPPPORTLETID); }
    @JsonIgnore public PSAppPortletDTO psappportletid(String value) { setPSAppPortletId(value); return this; }

    @JsonProperty("psappportletname")
    public void setPSAppPortletName(String value) { _set(DTOFIELD_PSAPPPORTLETNAME, value); }
    @JsonIgnore public String getPSAppPortletName() { return (String) _get(DTOFIELD_PSAPPPORTLETNAME); }
    @JsonIgnore public boolean isPSAppPortletNameDirty() { return _contains(DTOFIELD_PSAPPPORTLETNAME); }
    @JsonIgnore public void resetPSAppPortletName() { _reset(DTOFIELD_PSAPPPORTLETNAME); }
    @JsonIgnore public PSAppPortletDTO psappportletname(String value) { setPSAppPortletName(value); return this; }
    @JsonIgnore public String getName() { return getPSAppPortletName(); }
    @JsonIgnore public void setName(String value) { setPSAppPortletName(value); }
    @JsonIgnore public PSAppPortletDTO name(String value) { setPSAppPortletName(value); return this; }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { _set(DTOFIELD_PSSYSAPPID, value); }
    @JsonIgnore public String getPSSysAppId() { return (String) _get(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return _contains(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { _reset(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppPortletDTO pssysappid(String value) { setPSSysAppId(value); return this; }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { _set(DTOFIELD_PSSYSAPPNAME, value); }
    @JsonIgnore public String getPSSysAppName() { return (String) _get(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return _contains(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { _reset(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppPortletDTO pssysappname(String value) { setPSSysAppName(value); return this; }

    @JsonProperty("pssysportletid")
    public void setPSSysPortletId(String value) { _set(DTOFIELD_PSSYSPORTLETID, value); }
    @JsonIgnore public String getPSSysPortletId() { return (String) _get(DTOFIELD_PSSYSPORTLETID); }
    @JsonIgnore public boolean isPSSysPortletIdDirty() { return _contains(DTOFIELD_PSSYSPORTLETID); }
    @JsonIgnore public void resetPSSysPortletId() { _reset(DTOFIELD_PSSYSPORTLETID); }
    @JsonIgnore public PSAppPortletDTO pssysportletid(String value) { setPSSysPortletId(value); return this; }

    @JsonProperty("pssysportletname")
    public void setPSSysPortletName(String value) { _set(DTOFIELD_PSSYSPORTLETNAME, value); }
    @JsonIgnore public String getPSSysPortletName() { return (String) _get(DTOFIELD_PSSYSPORTLETNAME); }
    @JsonIgnore public boolean isPSSysPortletNameDirty() { return _contains(DTOFIELD_PSSYSPORTLETNAME); }
    @JsonIgnore public void resetPSSysPortletName() { _reset(DTOFIELD_PSSYSPORTLETNAME); }
    @JsonIgnore public PSAppPortletDTO pssysportletname(String value) { setPSSysPortletName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppPortletDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppPortletDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSAppPortletDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSAppPortletDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppPortletDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppPortletDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppPortletDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppPortletDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSAppPortletDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSAppPortletDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSAppPortletId(); }
    @JsonIgnore public void setId(String value) { setPSAppPortletId(value); }
    @JsonIgnore public PSAppPortletDTO id(String value) { setPSAppPortletId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}