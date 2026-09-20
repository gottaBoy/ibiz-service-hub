package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * View type category DTO.
 */
public class PSViewTypeCatDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CATCODE = "CATCODE";
    protected static final String DTOFIELD_CATCODE = "catcode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSVIEWTYPECATID = "PPSVIEWTYPECATID";
    protected static final String DTOFIELD_PPSVIEWTYPECATID = "ppsviewtypecatid";
    public static final String FIELD_PPSVIEWTYPECATNAME = "PPSVIEWTYPECATNAME";
    protected static final String DTOFIELD_PPSVIEWTYPECATNAME = "ppsviewtypecatname";
    public static final String FIELD_PSVIEWTYPECATID = "PSVIEWTYPECATID";
    protected static final String DTOFIELD_PSVIEWTYPECATID = "psviewtypecatid";
    public static final String FIELD_PSVIEWTYPECATNAME = "PSVIEWTYPECATNAME";
    protected static final String DTOFIELD_PSVIEWTYPECATNAME = "psviewtypecatname";
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

    @JsonProperty("catcode")
    public void setCatCode(String value) { _set(DTOFIELD_CATCODE, value); }
    @JsonIgnore public String getCatCode() { return (String) _get(DTOFIELD_CATCODE); }
    @JsonIgnore public boolean isCatCodeDirty() { return _contains(DTOFIELD_CATCODE); }
    @JsonIgnore public void resetCatCode() { _reset(DTOFIELD_CATCODE); }
    @JsonIgnore public PSViewTypeCatDTO catcode(String value) { setCatCode(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSViewTypeCatDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSViewTypeCatDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("iconpath")
    public void setIconPath(String value) { _set(DTOFIELD_ICONPATH, value); }
    @JsonIgnore public String getIconPath() { return (String) _get(DTOFIELD_ICONPATH); }
    @JsonIgnore public boolean isIconPathDirty() { return _contains(DTOFIELD_ICONPATH); }
    @JsonIgnore public void resetIconPath() { _reset(DTOFIELD_ICONPATH); }
    @JsonIgnore public PSViewTypeCatDTO iconpath(String value) { setIconPath(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSViewTypeCatDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) { _set(DTOFIELD_ORDERVALUE, value); }
    @JsonIgnore public Integer getOrderValue() { return (Integer) _get(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public boolean isOrderValueDirty() { return _contains(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public void resetOrderValue() { _reset(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public PSViewTypeCatDTO ordervalue(Integer value) { setOrderValue(value); return this; }

    @JsonProperty("ppsviewtypecatid")
    public void setPPSViewTypeCatId(String value) { _set(DTOFIELD_PPSVIEWTYPECATID, value); }
    @JsonIgnore public String getPPSViewTypeCatId() { return (String) _get(DTOFIELD_PPSVIEWTYPECATID); }
    @JsonIgnore public boolean isPPSViewTypeCatIdDirty() { return _contains(DTOFIELD_PPSVIEWTYPECATID); }
    @JsonIgnore public void resetPPSViewTypeCatId() { _reset(DTOFIELD_PPSVIEWTYPECATID); }
    @JsonIgnore public PSViewTypeCatDTO ppsviewtypecatid(String value) { setPPSViewTypeCatId(value); return this; }

    @JsonProperty("ppsviewtypecatname")
    public void setPPSViewTypeCatName(String value) { _set(DTOFIELD_PPSVIEWTYPECATNAME, value); }
    @JsonIgnore public String getPPSViewTypeCatName() { return (String) _get(DTOFIELD_PPSVIEWTYPECATNAME); }
    @JsonIgnore public boolean isPPSViewTypeCatNameDirty() { return _contains(DTOFIELD_PPSVIEWTYPECATNAME); }
    @JsonIgnore public void resetPPSViewTypeCatName() { _reset(DTOFIELD_PPSVIEWTYPECATNAME); }
    @JsonIgnore public PSViewTypeCatDTO ppsviewtypecatname(String value) { setPPSViewTypeCatName(value); return this; }

    @JsonProperty("psviewtypecatid")
    public void setPSViewTypeCatId(String value) { _set(DTOFIELD_PSVIEWTYPECATID, value); }
    @JsonIgnore public String getPSViewTypeCatId() { return (String) _get(DTOFIELD_PSVIEWTYPECATID); }
    @JsonIgnore public boolean isPSViewTypeCatIdDirty() { return _contains(DTOFIELD_PSVIEWTYPECATID); }
    @JsonIgnore public void resetPSViewTypeCatId() { _reset(DTOFIELD_PSVIEWTYPECATID); }
    @JsonIgnore public PSViewTypeCatDTO psviewtypecatid(String value) { setPSViewTypeCatId(value); return this; }

    @JsonProperty("psviewtypecatname")
    public void setPSViewTypeCatName(String value) { _set(DTOFIELD_PSVIEWTYPECATNAME, value); }
    @JsonIgnore public String getPSViewTypeCatName() { return (String) _get(DTOFIELD_PSVIEWTYPECATNAME); }
    @JsonIgnore public boolean isPSViewTypeCatNameDirty() { return _contains(DTOFIELD_PSVIEWTYPECATNAME); }
    @JsonIgnore public void resetPSViewTypeCatName() { _reset(DTOFIELD_PSVIEWTYPECATNAME); }
    @JsonIgnore public PSViewTypeCatDTO psviewtypecatname(String value) { setPSViewTypeCatName(value); return this; }
    @JsonIgnore public String getName() { return getPSViewTypeCatName(); }
    @JsonIgnore public void setName(String value) { setPSViewTypeCatName(value); }
    @JsonIgnore public PSViewTypeCatDTO name(String value) { setPSViewTypeCatName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSViewTypeCatDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSViewTypeCatDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSViewTypeCatDTO usercat(String value) { setUserCat(value); return this; }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSViewTypeCatDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSViewTypeCatDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSViewTypeCatDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSViewTypeCatDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSViewTypeCatDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSViewTypeCatDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSViewTypeCatId(); }
    @JsonIgnore public void setId(String value) { setPSViewTypeCatId(value); }
    @JsonIgnore public PSViewTypeCatDTO id(String value) { setPSViewTypeCatId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}