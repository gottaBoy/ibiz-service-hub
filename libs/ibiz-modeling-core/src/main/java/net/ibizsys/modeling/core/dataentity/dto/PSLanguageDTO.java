package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Modeling language DTO.
 */
public class PSLanguageDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSLANGUAGEID = "PSLANGUAGEID";
    protected static final String DTOFIELD_PSLANGUAGEID = "pslanguageid";
    public static final String FIELD_PSLANGUAGENAME = "PSLANGUAGENAME";
    protected static final String DTOFIELD_PSLANGUAGENAME = "pslanguagename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSLanguageDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSLanguageDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSLanguageDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("pslanguageid")
    public void setPSLanguageId(String value) { _set(DTOFIELD_PSLANGUAGEID, value); }
    @JsonIgnore public String getPSLanguageId() { return (String) _get(DTOFIELD_PSLANGUAGEID); }
    @JsonIgnore public boolean isPSLanguageIdDirty() { return _contains(DTOFIELD_PSLANGUAGEID); }
    @JsonIgnore public void resetPSLanguageId() { _reset(DTOFIELD_PSLANGUAGEID); }
    @JsonIgnore public PSLanguageDTO pslanguageid(String value) { setPSLanguageId(value); return this; }

    @JsonProperty("pslanguagename")
    public void setPSLanguageName(String value) { _set(DTOFIELD_PSLANGUAGENAME, value); }
    @JsonIgnore public String getPSLanguageName() { return (String) _get(DTOFIELD_PSLANGUAGENAME); }
    @JsonIgnore public boolean isPSLanguageNameDirty() { return _contains(DTOFIELD_PSLANGUAGENAME); }
    @JsonIgnore public void resetPSLanguageName() { _reset(DTOFIELD_PSLANGUAGENAME); }
    @JsonIgnore public PSLanguageDTO pslanguagename(String value) { setPSLanguageName(value); return this; }
    @JsonIgnore public String getName() { return getPSLanguageName(); }
    @JsonIgnore public void setName(String value) { setPSLanguageName(value); }
    @JsonIgnore public PSLanguageDTO name(String value) { setPSLanguageName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSLanguageDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSLanguageDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSLanguageDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSLanguageDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSLanguageId(); }
    @JsonIgnore public void setId(String value) { setPSLanguageId(value); }
    @JsonIgnore public PSLanguageDTO id(String value) { setPSLanguageId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}