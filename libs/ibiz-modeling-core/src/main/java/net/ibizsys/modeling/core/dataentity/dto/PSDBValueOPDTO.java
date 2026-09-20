package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Database value operator DTO.
 */
public class PSDBValueOPDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBFLAG = "DBFLAG";
    protected static final String DTOFIELD_DBFLAG = "dbflag";
    public static final String FIELD_DLFLAG = "DLFLAG";
    protected static final String DTOFIELD_DLFLAG = "dlflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_SIMPLENAME = "SIMPLENAME";
    protected static final String DTOFIELD_SIMPLENAME = "simplename";
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
    @JsonIgnore public PSDBValueOPDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSDBValueOPDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("dbflag")
    public void setDBFlag(Integer value) { _set(DTOFIELD_DBFLAG, value); }
    @JsonIgnore public Integer getDBFlag() { return (Integer) _get(DTOFIELD_DBFLAG); }
    @JsonIgnore public boolean isDBFlagDirty() { return _contains(DTOFIELD_DBFLAG); }
    @JsonIgnore public void resetDBFlag() { _reset(DTOFIELD_DBFLAG); }
    @JsonIgnore public PSDBValueOPDTO dbflag(Integer value) { setDBFlag(value); return this; }
    @JsonIgnore public PSDBValueOPDTO dbflag(Boolean value) { setDBFlag(flagValue(value)); return this; }

    @JsonProperty("dlflag")
    public void setDLFlag(Integer value) { _set(DTOFIELD_DLFLAG, value); }
    @JsonIgnore public Integer getDLFlag() { return (Integer) _get(DTOFIELD_DLFLAG); }
    @JsonIgnore public boolean isDLFlagDirty() { return _contains(DTOFIELD_DLFLAG); }
    @JsonIgnore public void resetDLFlag() { _reset(DTOFIELD_DLFLAG); }
    @JsonIgnore public PSDBValueOPDTO dlflag(Integer value) { setDLFlag(value); return this; }
    @JsonIgnore public PSDBValueOPDTO dlflag(Boolean value) { setDLFlag(flagValue(value)); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSDBValueOPDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) { _set(DTOFIELD_ORDERVALUE, value); }
    @JsonIgnore public Integer getOrderValue() { return (Integer) _get(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public boolean isOrderValueDirty() { return _contains(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public void resetOrderValue() { _reset(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public PSDBValueOPDTO ordervalue(Integer value) { setOrderValue(value); return this; }

    @JsonProperty("psdbvalueopid")
    public void setPSDBValueOPId(String value) { _set(DTOFIELD_PSDBVALUEOPID, value); }
    @JsonIgnore public String getPSDBValueOPId() { return (String) _get(DTOFIELD_PSDBVALUEOPID); }
    @JsonIgnore public boolean isPSDBValueOPIdDirty() { return _contains(DTOFIELD_PSDBVALUEOPID); }
    @JsonIgnore public void resetPSDBValueOPId() { _reset(DTOFIELD_PSDBVALUEOPID); }
    @JsonIgnore public PSDBValueOPDTO psdbvalueopid(String value) { setPSDBValueOPId(value); return this; }

    @JsonProperty("psdbvalueopname")
    public void setPSDBValueOPName(String value) { _set(DTOFIELD_PSDBVALUEOPNAME, value); }
    @JsonIgnore public String getPSDBValueOPName() { return (String) _get(DTOFIELD_PSDBVALUEOPNAME); }
    @JsonIgnore public boolean isPSDBValueOPNameDirty() { return _contains(DTOFIELD_PSDBVALUEOPNAME); }
    @JsonIgnore public void resetPSDBValueOPName() { _reset(DTOFIELD_PSDBVALUEOPNAME); }
    @JsonIgnore public PSDBValueOPDTO psdbvalueopname(String value) { setPSDBValueOPName(value); return this; }
    @JsonIgnore public String getName() { return getPSDBValueOPName(); }
    @JsonIgnore public void setName(String value) { setPSDBValueOPName(value); }
    @JsonIgnore public PSDBValueOPDTO name(String value) { setPSDBValueOPName(value); return this; }

    @JsonProperty("simplename")
    public void setSimpleName(String value) { _set(DTOFIELD_SIMPLENAME, value); }
    @JsonIgnore public String getSimpleName() { return (String) _get(DTOFIELD_SIMPLENAME); }
    @JsonIgnore public boolean isSimpleNameDirty() { return _contains(DTOFIELD_SIMPLENAME); }
    @JsonIgnore public void resetSimpleName() { _reset(DTOFIELD_SIMPLENAME); }
    @JsonIgnore public PSDBValueOPDTO simplename(String value) { setSimpleName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSDBValueOPDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSDBValueOPDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSDBValueOPDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSDBValueOPDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSDBValueOPId(); }
    @JsonIgnore public void setId(String value) { setPSDBValueOPId(value); }
    @JsonIgnore public PSDBValueOPDTO id(String value) { setPSDBValueOPId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}