package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSDERDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_DERTYPE = "dertype";
    private static final String DTOFIELD_DERSUBTYPE = "dersubtype";
    private static final String DTOFIELD_MAJORPSDEID = "majorpsdeid";
    private static final String DTOFIELD_MASTERRS = "masterrs";
    private static final String DTOFIELD_MINORPSDEID = "minorpsdeid";
    private static final String DTOFIELD_VALIDFLAG = "validflag";

    public PSDERDTO() {
        super("psderid", "psdername");
    }

    @JsonProperty("psderid")
    public void setPSDERId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSDERId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSDERIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSDERId() { resetRelatedId(); }

    @JsonProperty("psdername")
    public void setPSDERName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSDERName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSDERNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSDERName() { resetRelatedName(); }

    @JsonProperty("dertype")
    public void setDERType(String value) { _set(DTOFIELD_DERTYPE, value); }
    @JsonIgnore public String getDERType() { return (String) _get(DTOFIELD_DERTYPE); }
    @JsonIgnore public boolean isDERTypeDirty() { return _contains(DTOFIELD_DERTYPE); }
    @JsonIgnore public void resetDERType() { _reset(DTOFIELD_DERTYPE); }

    @JsonProperty("dersubtype")
    public void setDERSubType(String value) { _set(DTOFIELD_DERSUBTYPE, value); }
    @JsonIgnore public String getDERSubType() { return (String) _get(DTOFIELD_DERSUBTYPE); }
    @JsonIgnore public boolean isDERSubTypeDirty() { return _contains(DTOFIELD_DERSUBTYPE); }
    @JsonIgnore public void resetDERSubType() { _reset(DTOFIELD_DERSUBTYPE); }

    @JsonProperty("majorpsdeid")
    public void setMajorPSDEId(String value) { _set(DTOFIELD_MAJORPSDEID, value); }
    @JsonIgnore public String getMajorPSDEId() { return (String) _get(DTOFIELD_MAJORPSDEID); }
    @JsonIgnore public boolean isMajorPSDEIdDirty() { return _contains(DTOFIELD_MAJORPSDEID); }
    @JsonIgnore public void resetMajorPSDEId() { _reset(DTOFIELD_MAJORPSDEID); }

    @JsonProperty("masterrs")
    public void setMasterRS(Integer value) { _set(DTOFIELD_MASTERRS, value); }
    @JsonIgnore public Integer getMasterRS() { return (Integer) _get(DTOFIELD_MASTERRS); }
    @JsonIgnore public boolean isMasterRSDirty() { return _contains(DTOFIELD_MASTERRS); }
    @JsonIgnore public void resetMasterRS() { _reset(DTOFIELD_MASTERRS); }

    @JsonProperty("minorpsdeid")
    public void setMinorPSDEId(String value) { _set(DTOFIELD_MINORPSDEID, value); }
    @JsonIgnore public String getMinorPSDEId() { return (String) _get(DTOFIELD_MINORPSDEID); }
    @JsonIgnore public boolean isMinorPSDEIdDirty() { return _contains(DTOFIELD_MINORPSDEID); }
    @JsonIgnore public void resetMinorPSDEId() { _reset(DTOFIELD_MINORPSDEID); }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
}