package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysServiceAPIDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSSysServiceAPIDTO() {
        super("pssysserviceapiid", "pssysserviceapiname");
    }

    @JsonProperty("pssysserviceapiid")
    public void setPSSysServiceAPIId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSSysServiceAPIId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSSysServiceAPIIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSSysServiceAPIId() { resetRelatedId(); }

    @JsonProperty("pssysserviceapiname")
    public void setPSSysServiceAPIName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSSysServiceAPIName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSSysServiceAPINameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSSysServiceAPIName() { resetRelatedName(); }
}