package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application workflow version DTO.
 */
public class PSAppWFVerDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPWFID = "PSAPPWFID";
    protected static final String DTOFIELD_PSAPPWFID = "psappwfid";
    public static final String FIELD_PSAPPWFNAME = "PSAPPWFNAME";
    protected static final String DTOFIELD_PSAPPWFNAME = "psappwfname";
    public static final String FIELD_PSAPPWFVERID = "PSAPPWFVERID";
    protected static final String DTOFIELD_PSAPPWFVERID = "psappwfverid";
    public static final String FIELD_PSAPPWFVERNAME = "PSAPPWFVERNAME";
    protected static final String DTOFIELD_PSAPPWFVERNAME = "psappwfvername";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_PSWORKFLOWID = "PSWORKFLOWID";
    protected static final String DTOFIELD_PSWORKFLOWID = "psworkflowid";
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
    @JsonIgnore public PSAppWFVerDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppWFVerDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppWFVerDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("psappwfid")
    public void setPSAppWFId(String value) { _set(DTOFIELD_PSAPPWFID, value); }
    @JsonIgnore public String getPSAppWFId() { return (String) _get(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public boolean isPSAppWFIdDirty() { return _contains(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public void resetPSAppWFId() { _reset(DTOFIELD_PSAPPWFID); }
    @JsonIgnore public PSAppWFVerDTO psappwfid(String value) { setPSAppWFId(value); return this; }

    @JsonProperty("psappwfname")
    public void setPSAppWFName(String value) { _set(DTOFIELD_PSAPPWFNAME, value); }
    @JsonIgnore public String getPSAppWFName() { return (String) _get(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public boolean isPSAppWFNameDirty() { return _contains(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public void resetPSAppWFName() { _reset(DTOFIELD_PSAPPWFNAME); }
    @JsonIgnore public PSAppWFVerDTO psappwfname(String value) { setPSAppWFName(value); return this; }

    @JsonProperty("psappwfverid")
    public void setPSAppWFVerId(String value) { _set(DTOFIELD_PSAPPWFVERID, value); }
    @JsonIgnore public String getPSAppWFVerId() { return (String) _get(DTOFIELD_PSAPPWFVERID); }
    @JsonIgnore public boolean isPSAppWFVerIdDirty() { return _contains(DTOFIELD_PSAPPWFVERID); }
    @JsonIgnore public void resetPSAppWFVerId() { _reset(DTOFIELD_PSAPPWFVERID); }
    @JsonIgnore public PSAppWFVerDTO psappwfverid(String value) { setPSAppWFVerId(value); return this; }
    @JsonIgnore public String getName() { return getPSAppWFVerName(); }
    @JsonIgnore public void setName(String value) { setPSAppWFVerName(value); }
    @JsonIgnore public PSAppWFVerDTO name(String value) { setPSAppWFVerName(value); return this; }

    @JsonProperty("psappwfvername")
    public void setPSAppWFVerName(String value) { _set(DTOFIELD_PSAPPWFVERNAME, value); }
    @JsonIgnore public String getPSAppWFVerName() { return (String) _get(DTOFIELD_PSAPPWFVERNAME); }
    @JsonIgnore public boolean isPSAppWFVerNameDirty() { return _contains(DTOFIELD_PSAPPWFVERNAME); }
    @JsonIgnore public void resetPSAppWFVerName() { _reset(DTOFIELD_PSAPPWFVERNAME); }
    @JsonIgnore public PSAppWFVerDTO psappwfvername(String value) { setPSAppWFVerName(value); return this; }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { _set(DTOFIELD_PSSYSAPPID, value); }
    @JsonIgnore public String getPSSysAppId() { return (String) _get(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return _contains(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { _reset(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppWFVerDTO pssysappid(String value) { setPSSysAppId(value); return this; }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { _set(DTOFIELD_PSSYSAPPNAME, value); }
    @JsonIgnore public String getPSSysAppName() { return (String) _get(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return _contains(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { _reset(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppWFVerDTO pssysappname(String value) { setPSSysAppName(value); return this; }

    @JsonProperty("pswfversionid")
    public void setPSWFVersionId(String value) { _set(DTOFIELD_PSWFVERSIONID, value); }
    @JsonIgnore public String getPSWFVersionId() { return (String) _get(DTOFIELD_PSWFVERSIONID); }
    @JsonIgnore public boolean isPSWFVersionIdDirty() { return _contains(DTOFIELD_PSWFVERSIONID); }
    @JsonIgnore public void resetPSWFVersionId() { _reset(DTOFIELD_PSWFVERSIONID); }
    @JsonIgnore public PSAppWFVerDTO pswfversionid(String value) { setPSWFVersionId(value); return this; }

    @JsonProperty("pswfversionname")
    public void setPSWFVersionName(String value) { _set(DTOFIELD_PSWFVERSIONNAME, value); }
    @JsonIgnore public String getPSWFVersionName() { return (String) _get(DTOFIELD_PSWFVERSIONNAME); }
    @JsonIgnore public boolean isPSWFVersionNameDirty() { return _contains(DTOFIELD_PSWFVERSIONNAME); }
    @JsonIgnore public void resetPSWFVersionName() { _reset(DTOFIELD_PSWFVERSIONNAME); }
    @JsonIgnore public PSAppWFVerDTO pswfversionname(String value) { setPSWFVersionName(value); return this; }

    @JsonProperty("psworkflowid")
    public void setPSWorkflowId(String value) { _set(DTOFIELD_PSWORKFLOWID, value); }
    @JsonIgnore public String getPSWorkflowId() { return (String) _get(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public boolean isPSWorkflowIdDirty() { return _contains(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public void resetPSWorkflowId() { _reset(DTOFIELD_PSWORKFLOWID); }
    @JsonIgnore public PSAppWFVerDTO psworkflowid(String value) { setPSWorkflowId(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppWFVerDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppWFVerDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSAppWFVerDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSAppWFVerDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppWFVerDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppWFVerDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppWFVerDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppWFVerDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSAppWFVerDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSAppWFVerDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSAppWFVerId(); }
    @JsonIgnore public void setId(String value) { setPSAppWFVerId(value); }
    @JsonIgnore public PSAppWFVerDTO id(String value) { setPSAppWFVerId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}