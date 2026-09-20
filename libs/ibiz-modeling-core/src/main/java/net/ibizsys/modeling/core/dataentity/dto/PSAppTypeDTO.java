package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application type DTO.
 */
public class PSAppTypeDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBILEMODE = "MOBILEMODE";
    protected static final String DTOFIELD_MOBILEMODE = "mobilemode";
    public static final String FIELD_PSAPPTYPEID = "PSAPPTYPEID";
    protected static final String DTOFIELD_PSAPPTYPEID = "psapptypeid";
    public static final String FIELD_PSAPPTYPENAME = "PSAPPTYPENAME";
    protected static final String DTOFIELD_PSAPPTYPENAME = "psapptypename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSAppTypeDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppTypeDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("iconpath")
    public void setIconPath(String value) { _set(DTOFIELD_ICONPATH, value); }
    @JsonIgnore public String getIconPath() { return (String) _get(DTOFIELD_ICONPATH); }
    @JsonIgnore public boolean isIconPathDirty() { return _contains(DTOFIELD_ICONPATH); }
    @JsonIgnore public void resetIconPath() { _reset(DTOFIELD_ICONPATH); }
    @JsonIgnore public PSAppTypeDTO iconpath(String value) { setIconPath(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppTypeDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("mobilemode")
    public void setMobileMode(Integer value) { _set(DTOFIELD_MOBILEMODE, value); }
    @JsonIgnore public Integer getMobileMode() { return (Integer) _get(DTOFIELD_MOBILEMODE); }
    @JsonIgnore public boolean isMobileModeDirty() { return _contains(DTOFIELD_MOBILEMODE); }
    @JsonIgnore public void resetMobileMode() { _reset(DTOFIELD_MOBILEMODE); }
    @JsonIgnore public PSAppTypeDTO mobilemode(Integer value) { setMobileMode(value); return this; }
    @JsonIgnore public PSAppTypeDTO mobilemode(Boolean value) { setMobileMode(flagValue(value)); return this; }

    @JsonProperty("psapptypeid")
    public void setPSAppTypeId(String value) { _set(DTOFIELD_PSAPPTYPEID, value); }
    @JsonIgnore public String getPSAppTypeId() { return (String) _get(DTOFIELD_PSAPPTYPEID); }
    @JsonIgnore public boolean isPSAppTypeIdDirty() { return _contains(DTOFIELD_PSAPPTYPEID); }
    @JsonIgnore public void resetPSAppTypeId() { _reset(DTOFIELD_PSAPPTYPEID); }
    @JsonIgnore public PSAppTypeDTO psapptypeid(String value) { setPSAppTypeId(value); return this; }

    @JsonProperty("psapptypename")
    public void setPSAppTypeName(String value) { _set(DTOFIELD_PSAPPTYPENAME, value); }
    @JsonIgnore public String getPSAppTypeName() { return (String) _get(DTOFIELD_PSAPPTYPENAME); }
    @JsonIgnore public boolean isPSAppTypeNameDirty() { return _contains(DTOFIELD_PSAPPTYPENAME); }
    @JsonIgnore public void resetPSAppTypeName() { _reset(DTOFIELD_PSAPPTYPENAME); }
    @JsonIgnore public PSAppTypeDTO psapptypename(String value) { setPSAppTypeName(value); return this; }
    @JsonIgnore public String getName() { return getPSAppTypeName(); }
    @JsonIgnore public void setName(String value) { setPSAppTypeName(value); }
    @JsonIgnore public PSAppTypeDTO name(String value) { setPSAppTypeName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppTypeDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppTypeDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonIgnore public String getId() { return getPSAppTypeId(); }
    @JsonIgnore public void setId(String value) { setPSAppTypeId(value); }
    @JsonIgnore public PSAppTypeDTO id(String value) { setPSAppTypeId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}