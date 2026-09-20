package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Data entity join type DTO.
 */
public class PSDEJoinTypeDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_MAINFLAG = "MAINFLAG";
    protected static final String DTOFIELD_MAINFLAG = "mainflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEJOINTYPEID = "PSDEJOINTYPEID";
    protected static final String DTOFIELD_PSDEJOINTYPEID = "psdejointypeid";
    public static final String FIELD_PSDEJOINTYPENAME = "PSDEJOINTYPENAME";
    protected static final String DTOFIELD_PSDEJOINTYPENAME = "psdejointypename";
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
    @JsonIgnore public PSDEJoinTypeDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSDEJoinTypeDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("iconpath")
    public void setIconPath(String value) { _set(DTOFIELD_ICONPATH, value); }
    @JsonIgnore public String getIconPath() { return (String) _get(DTOFIELD_ICONPATH); }
    @JsonIgnore public boolean isIconPathDirty() { return _contains(DTOFIELD_ICONPATH); }
    @JsonIgnore public void resetIconPath() { _reset(DTOFIELD_ICONPATH); }
    @JsonIgnore public PSDEJoinTypeDTO iconpath(String value) { setIconPath(value); return this; }

    @JsonProperty("mainflag")
    public void setMainFlag(Integer value) { _set(DTOFIELD_MAINFLAG, value); }
    @JsonIgnore public Integer getMainFlag() { return (Integer) _get(DTOFIELD_MAINFLAG); }
    @JsonIgnore public boolean isMainFlagDirty() { return _contains(DTOFIELD_MAINFLAG); }
    @JsonIgnore public void resetMainFlag() { _reset(DTOFIELD_MAINFLAG); }
    @JsonIgnore public PSDEJoinTypeDTO mainflag(Integer value) { setMainFlag(value); return this; }
    @JsonIgnore public PSDEJoinTypeDTO mainflag(Boolean value) { setMainFlag(flagValue(value)); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSDEJoinTypeDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) { _set(DTOFIELD_ORDERVALUE, value); }
    @JsonIgnore public Integer getOrderValue() { return (Integer) _get(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public boolean isOrderValueDirty() { return _contains(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public void resetOrderValue() { _reset(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public PSDEJoinTypeDTO ordervalue(Integer value) { setOrderValue(value); return this; }

    @JsonProperty("psdejointypeid")
    public void setPSDEJoinTypeId(String value) { _set(DTOFIELD_PSDEJOINTYPEID, value); }
    @JsonIgnore public String getPSDEJoinTypeId() { return (String) _get(DTOFIELD_PSDEJOINTYPEID); }
    @JsonIgnore public boolean isPSDEJoinTypeIdDirty() { return _contains(DTOFIELD_PSDEJOINTYPEID); }
    @JsonIgnore public void resetPSDEJoinTypeId() { _reset(DTOFIELD_PSDEJOINTYPEID); }
    @JsonIgnore public PSDEJoinTypeDTO psdejointypeid(String value) { setPSDEJoinTypeId(value); return this; }

    @JsonProperty("psdejointypename")
    public void setPSDEJoinTypeName(String value) { _set(DTOFIELD_PSDEJOINTYPENAME, value); }
    @JsonIgnore public String getPSDEJoinTypeName() { return (String) _get(DTOFIELD_PSDEJOINTYPENAME); }
    @JsonIgnore public boolean isPSDEJoinTypeNameDirty() { return _contains(DTOFIELD_PSDEJOINTYPENAME); }
    @JsonIgnore public void resetPSDEJoinTypeName() { _reset(DTOFIELD_PSDEJOINTYPENAME); }
    @JsonIgnore public PSDEJoinTypeDTO psdejointypename(String value) { setPSDEJoinTypeName(value); return this; }
    @JsonIgnore public String getName() { return getPSDEJoinTypeName(); }
    @JsonIgnore public void setName(String value) { setPSDEJoinTypeName(value); }
    @JsonIgnore public PSDEJoinTypeDTO name(String value) { setPSDEJoinTypeName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSDEJoinTypeDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSDEJoinTypeDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSDEJoinTypeDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSDEJoinTypeDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSDEJoinTypeId(); }
    @JsonIgnore public void setId(String value) { setPSDEJoinTypeId(value); }
    @JsonIgnore public PSDEJoinTypeDTO id(String value) { setPSDEJoinTypeId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}