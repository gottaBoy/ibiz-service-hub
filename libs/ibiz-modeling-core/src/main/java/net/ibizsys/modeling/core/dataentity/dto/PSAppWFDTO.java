package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application workflow DTO.
 */
public class PSAppWFDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPMODULEID = "PSAPPMODULEID";
    protected static final String DTOFIELD_PSAPPMODULEID = "psappmoduleid";
    public static final String FIELD_PSAPPMODULENAME = "PSAPPMODULENAME";
    protected static final String DTOFIELD_PSAPPMODULENAME = "psappmodulename";
    public static final String FIELD_PSAPPWFID = "PSAPPWFID";
    protected static final String DTOFIELD_PSAPPWFID = "psappwfid";
    public static final String FIELD_PSAPPWFNAME = "PSAPPWFNAME";
    protected static final String DTOFIELD_PSAPPWFNAME = "psappwfname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSWORKFLOWID = "PSWORKFLOWID";
    protected static final String DTOFIELD_PSWORKFLOWID = "psworkflowid";
    public static final String FIELD_PSWORKFLOWNAME = "PSWORKFLOWNAME";
    protected static final String DTOFIELD_PSWORKFLOWNAME = "psworkflowname";
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
    @JsonIgnore public PSAppWFDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppWFDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppWFDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("psappmoduleid")
    public void setPSAppModuleId(String value) { _set(DTOFIELD_PSAPPMODULEID, value); }
    @JsonIgnore public String getPSAppModuleId() { return (String) _get(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public boolean isPSAppModuleIdDirty() { return _contains(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public void resetPSAppModuleId() { _reset(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public PSAppWFDTO psappmoduleid(String value) { setPSAppModuleId(value); return this; }

    @JsonProperty("psappmodulename")
    public void setPSAppModuleName(String value) { _set(DTOFIELD_PSAPPMODULENAME, value); }
    @JsonIgnore public String getPSAppModuleName() { return (String) _get(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public boolean isPSAppModuleNameDirty() { return _contains(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public void resetPSAppModuleName() { _reset(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public PSAppWFDTO psappmodulename(String value) { setPSAppModuleName(value); return this; }

    @JsonProperty("psappwfid")
    public void setPSAppWFId(String value) { _set(DTOFIELD_PSAPPWFID, value); }
    @JsonIgnore public String getPSAppWFId() { return (String) _get(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public boolean isPSAppWFIdDirty() { return _contains(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public void resetPSAppWFId() { _reset(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public PSAppWFDTO psappwfid(String value) { setPSAppWFId(value); return this; }

    @JsonProperty("psappwfname")
    public void setPSAppWFName(String value) { _set(DTOFIELD_PSAPPWFNAME, value); }
    @JsonIgnore public String getPSAppWFName() { return (String) _get(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public boolean isPSAppWFNameDirty() { return _contains(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public void resetPSAppWFName() { _reset(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public PSAppWFDTO psappwfname(String value) { setPSAppWFName(value); return this; }
    @JsonIgnore public String getName() { return getPSAppWFName(); }
    @JsonIgnore public void setName(String value) { setPSAppWFName(value); }
    @JsonIgnore public PSAppWFDTO name(String value) { setPSAppWFName(value); return this; }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { _set(DTOFIELD_PSSYSAPPID, value); }
    @JsonIgnore public String getPSSysAppId() { return (String) _get(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return _contains(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { _reset(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppWFDTO pssysappid(String value) { setPSSysAppId(value); return this; }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { _set(DTOFIELD_PSSYSAPPNAME, value); }
    @JsonIgnore public String getPSSysAppName() { return (String) _get(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return _contains(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { _reset(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppWFDTO pssysappname(String value) { setPSSysAppName(value); return this; }

    @JsonProperty("psworkflowid")
    public void setPSWorkflowId(String value) { _set(DTOFIELD_PSWORKFLOWID, value); }
    @JsonIgnore public String getPSWorkflowId() { return (String) _get(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public boolean isPSWorkflowIdDirty() { return _contains(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public void resetPSWorkflowId() { _reset(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public PSAppWFDTO psworkflowid(String value) { setPSWorkflowId(value); return this; }

    @JsonProperty("psworkflowname")
    public void setPSWorkflowName(String value) { _set(DTOFIELD_PSWORKFLOWNAME, value); }
    @JsonIgnore public String getPSWorkflowName() { return (String) _get(DTOFIELD_PSWORKFLOWNAME); }
    @JsonIgnore public boolean isPSWorkflowNameDirty() { return _contains(DTOFIELD_PSWORKFLOWNAME); }
    @JsonIgnore public void resetPSWorkflowName() { _reset(DTOFIELD_PSWORKFLOWNAME); }
    @JsonIgnore public PSAppWFDTO psworkflowname(String value) { setPSWorkflowName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppWFDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppWFDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSAppWFDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSAppWFDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppWFDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppWFDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppWFDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppWFDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSAppWFDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSAppWFDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSAppWFId(); }
    @JsonIgnore public void setId(String value) { setPSAppWFId(value); }
    @JsonIgnore public PSAppWFDTO id(String value) { setPSAppWFId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}