package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * System model change log DTO.
 */
public class PSSysModelLogDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSSYSMODELLOGID = "PSSYSMODELLOGID";
    protected static final String DTOFIELD_PSSYSMODELLOGID = "pssysmodellogid";
    public static final String FIELD_PSSYSMODELLOGNAME = "PSSYSMODELLOGNAME";
    protected static final String DTOFIELD_PSSYSMODELLOGNAME = "pssysmodellogname";
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
    @JsonIgnore public PSSysModelLogDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSSysModelLogDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("psdynainstid")
    public void setPSDynaInstId(String value) { _set(DTOFIELD_PSDYNAINSTID, value); }
    @JsonIgnore public String getPSDynaInstId() { return (String) _get(DTOFIELD_PSDYNAINSTID); }
    @JsonIgnore public boolean isPSDynaInstIdDirty() { return _contains(DTOFIELD_PSDYNAINSTID); }
    @JsonIgnore public void resetPSDynaInstId() { _reset(DTOFIELD_PSDYNAINSTID); }
    @JsonIgnore public PSSysModelLogDTO psdynainstid(String value) { setPSDynaInstId(value); return this; }

    @JsonProperty("pssysmodellogid")
    public void setPSSysModelLogId(String value) { _set(DTOFIELD_PSSYSMODELLOGID, value); }
    @JsonIgnore public String getPSSysModelLogId() { return (String) _get(DTOFIELD_PSSYSMODELLOGID); }
    @JsonIgnore public boolean isPSSysModelLogIdDirty() { return _contains(DTOFIELD_PSSYSMODELLOGID); }
    @JsonIgnore public void resetPSSysModelLogId() { _reset(DTOFIELD_PSSYSMODELLOGID); }
    @JsonIgnore public PSSysModelLogDTO pssysmodellogid(String value) { setPSSysModelLogId(value); return this; }

    @JsonProperty("pssysmodellogname")
    public void setPSSysModelLogName(String value) { _set(DTOFIELD_PSSYSMODELLOGNAME, value); }
    @JsonIgnore public String getPSSysModelLogName() { return (String) _get(DTOFIELD_PSSYSMODELLOGNAME); }
    @JsonIgnore public boolean isPSSysModelLogNameDirty() { return _contains(DTOFIELD_PSSYSMODELLOGNAME); }
    @JsonIgnore public void resetPSSysModelLogName() { _reset(DTOFIELD_PSSYSMODELLOGNAME); }
    @JsonIgnore public PSSysModelLogDTO pssysmodellogname(String value) { setPSSysModelLogName(value); return this; }

    @JsonIgnore public String getName() { return getPSSysModelLogName(); }
    @JsonIgnore public void setName(String value) { setPSSysModelLogName(value); }
    @JsonIgnore public PSSysModelLogDTO name(String value) { setPSSysModelLogName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSSysModelLogDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSSysModelLogDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonIgnore public String getId() { return getPSSysModelLogId(); }
    @JsonIgnore public void setId(String value) { setPSSysModelLogId(value); }
    @JsonIgnore public PSSysModelLogDTO id(String value) { setPSSysModelLogId(value); return this; }
}