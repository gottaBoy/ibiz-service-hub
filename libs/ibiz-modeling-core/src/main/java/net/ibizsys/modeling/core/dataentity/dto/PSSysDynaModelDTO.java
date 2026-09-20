package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysDynaModelDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_DYNAMODELUSAGE = "dynamodelusage";

    public PSSysDynaModelDTO() {
        super("pssysdynamodelid", "pssysdynamodelname");
    }

    @JsonProperty("pssysdynamodelid")
    public void setPSSysDynaModelId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSSysDynaModelId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSSysDynaModelIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSSysDynaModelId() { resetRelatedId(); }

    @JsonProperty("pssysdynamodelname")
    public void setPSSysDynaModelName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSSysDynaModelName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSSysDynaModelNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSSysDynaModelName() { resetRelatedName(); }

    @JsonProperty("dynamodelusage")
    public void setDynaModelUsage(String value) { _set(DTOFIELD_DYNAMODELUSAGE, value); }
    @JsonIgnore public String getDynaModelUsage() { return (String) _get(DTOFIELD_DYNAMODELUSAGE); }
    @JsonIgnore public boolean isDynaModelUsageDirty() { return _contains(DTOFIELD_DYNAMODELUSAGE); }
    @JsonIgnore public void resetDynaModelUsage() { _reset(DTOFIELD_DYNAMODELUSAGE); }
}