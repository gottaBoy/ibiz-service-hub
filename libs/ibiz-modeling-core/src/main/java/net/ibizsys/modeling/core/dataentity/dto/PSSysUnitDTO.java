package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * System unit DTO.
 */
public class PSSysUnitDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NAMEPSLANGUAGERESID = "NAMEPSLANGUAGERESID";
    protected static final String DTOFIELD_NAMEPSLANGUAGERESID = "namepslanguageresid";
    public static final String FIELD_NAMEPSLANGUAGERESNAME = "NAMEPSLANGUAGERESNAME";
    protected static final String DTOFIELD_NAMEPSLANGUAGERESNAME = "namepslanguageresname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSUNITID = "PSSYSUNITID";
    protected static final String DTOFIELD_PSSYSUNITID = "pssysunitid";
    public static final String FIELD_PSSYSUNITNAME = "PSSYSUNITNAME";
    protected static final String DTOFIELD_PSSYSUNITNAME = "pssysunitname";
    public static final String FIELD_PSUNITID = "PSUNITID";
    protected static final String DTOFIELD_PSUNITID = "psunitid";
    public static final String FIELD_PSUNITNAME = "PSUNITNAME";
    protected static final String DTOFIELD_PSUNITNAME = "psunitname";
    public static final String FIELD_UNITTAG = "UNITTAG";
    protected static final String DTOFIELD_UNITTAG = "unittag";
    public static final String FIELD_UNITTAG2 = "UNITTAG2";
    protected static final String DTOFIELD_UNITTAG2 = "unittag2";
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

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSSysUnitDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSSysUnitDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSSysUnitDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSSysUnitDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("namepslanguageresid")
    public void setNamePSLanguageResId(String value) { _set(DTOFIELD_NAMEPSLANGUAGERESID, value); }
    @JsonIgnore public String getNamePSLanguageResId() { return (String) _get(DTOFIELD_NAMEPSLANGUAGERESID); }
    @JsonIgnore public boolean isNamePSLanguageResIdDirty() { return _contains(DTOFIELD_NAMEPSLANGUAGERESID); }
    @JsonIgnore public void resetNamePSLanguageResId() { _reset(DTOFIELD_NAMEPSLANGUAGERESID); }
    @JsonIgnore public PSSysUnitDTO namepslanguageresid(String value) { setNamePSLanguageResId(value); return this; }

    @JsonProperty("namepslanguageresname")
    public void setNamePSLanguageResName(String value) { _set(DTOFIELD_NAMEPSLANGUAGERESNAME, value); }
    @JsonIgnore public String getNamePSLanguageResName() { return (String) _get(DTOFIELD_NAMEPSLANGUAGERESNAME); }
    @JsonIgnore public boolean isNamePSLanguageResNameDirty() { return _contains(DTOFIELD_NAMEPSLANGUAGERESNAME); }
    @JsonIgnore public void resetNamePSLanguageResName() { _reset(DTOFIELD_NAMEPSLANGUAGERESNAME); }
    @JsonIgnore public PSSysUnitDTO namepslanguageresname(String value) { setNamePSLanguageResName(value); return this; }

    @JsonProperty("psmoduleid")
    public void setPSModuleId(String value) { _set(DTOFIELD_PSMODULEID, value); }
    @JsonIgnore public String getPSModuleId() { return (String) _get(DTOFIELD_PSMODULEID); }
    @JsonIgnore public boolean isPSModuleIdDirty() { return _contains(DTOFIELD_PSMODULEID); }
    @JsonIgnore public void resetPSModuleId() { _reset(DTOFIELD_PSMODULEID); }
    @JsonIgnore public PSSysUnitDTO psmoduleid(String value) { setPSModuleId(value); return this; }

    @JsonProperty("psmodulename")
    public void setPSModuleName(String value) { _set(DTOFIELD_PSMODULENAME, value); }
    @JsonIgnore public String getPSModuleName() { return (String) _get(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public boolean isPSModuleNameDirty() { return _contains(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public void resetPSModuleName() { _reset(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public PSSysUnitDTO psmodulename(String value) { setPSModuleName(value); return this; }

    @JsonProperty("pssysunitid")
    public void setPSSysUnitId(String value) { _set(DTOFIELD_PSSYSUNITID, value); }
    @JsonIgnore public String getPSSysUnitId() { return (String) _get(DTOFIELD_PSSYSUNITID); }
    @JsonIgnore public boolean isPSSysUnitIdDirty() { return _contains(DTOFIELD_PSSYSUNITID); }
    @JsonIgnore public void resetPSSysUnitId() { _reset(DTOFIELD_PSSYSUNITID); }
    @JsonIgnore public PSSysUnitDTO pssysunitid(String value) { setPSSysUnitId(value); return this; }

    @JsonProperty("pssysunitname")
    public void setPSSysUnitName(String value) { _set(DTOFIELD_PSSYSUNITNAME, value); }
    @JsonIgnore public String getPSSysUnitName() { return (String) _get(DTOFIELD_PSSYSUNITNAME); }
    @JsonIgnore public boolean isPSSysUnitNameDirty() { return _contains(DTOFIELD_PSSYSUNITNAME); }
    @JsonIgnore public void resetPSSysUnitName() { _reset(DTOFIELD_PSSYSUNITNAME); }
    @JsonIgnore public PSSysUnitDTO pssysunitname(String value) { setPSSysUnitName(value); return this; }
    @JsonIgnore public String getName() { return getPSSysUnitName(); }
    @JsonIgnore public void setName(String value) { setPSSysUnitName(value); }
    @JsonIgnore public PSSysUnitDTO name(String value) { setPSSysUnitName(value); return this; }

    @JsonProperty("psunitid")
    public void setPSUnitId(String value) { _set(DTOFIELD_PSUNITID, value); }
    @JsonIgnore public String getPSUnitId() { return (String) _get(DTOFIELD_PSUNITID); }
    @JsonIgnore public boolean isPSUnitIdDirty() { return _contains(DTOFIELD_PSUNITID); }
    @JsonIgnore public void resetPSUnitId() { _reset(DTOFIELD_PSUNITID); }
    @JsonIgnore public PSSysUnitDTO psunitid(String value) { setPSUnitId(value); return this; }

    @JsonProperty("psunitname")
    public void setPSUnitName(String value) { _set(DTOFIELD_PSUNITNAME, value); }
    @JsonIgnore public String getPSUnitName() { return (String) _get(DTOFIELD_PSUNITNAME); }
    @JsonIgnore public boolean isPSUnitNameDirty() { return _contains(DTOFIELD_PSUNITNAME); }
    @JsonIgnore public void resetPSUnitName() { _reset(DTOFIELD_PSUNITNAME); }
    @JsonIgnore public PSSysUnitDTO psunitname(String value) { setPSUnitName(value); return this; }

    @JsonProperty("unittag")
    public void setUnitTag(String value) { _set(DTOFIELD_UNITTAG, value); }
    @JsonIgnore public String getUnitTag() { return (String) _get(DTOFIELD_UNITTAG); }
    @JsonIgnore public boolean isUnitTagDirty() { return _contains(DTOFIELD_UNITTAG); }
    @JsonIgnore public void resetUnitTag() { _reset(DTOFIELD_UNITTAG); }
    @JsonIgnore public PSSysUnitDTO unittag(String value) { setUnitTag(value); return this; }

    @JsonProperty("unittag2")
    public void setUnitTag2(String value) { _set(DTOFIELD_UNITTAG2, value); }
    @JsonIgnore public String getUnitTag2() { return (String) _get(DTOFIELD_UNITTAG2); }
    @JsonIgnore public boolean isUnitTag2Dirty() { return _contains(DTOFIELD_UNITTAG2); }
    @JsonIgnore public void resetUnitTag2() { _reset(DTOFIELD_UNITTAG2); }
    @JsonIgnore public PSSysUnitDTO unittag2(String value) { setUnitTag2(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSSysUnitDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSSysUnitDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSSysUnitDTO usercat(String value) { setUserCat(value); return this; }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSSysUnitDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSSysUnitDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSSysUnitDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSSysUnitDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonIgnore public String getId() { return getPSSysUnitId(); }
    @JsonIgnore public void setId(String value) { setPSSysUnitId(value); }
    @JsonIgnore public PSSysUnitDTO id(String value) { setPSSysUnitId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}