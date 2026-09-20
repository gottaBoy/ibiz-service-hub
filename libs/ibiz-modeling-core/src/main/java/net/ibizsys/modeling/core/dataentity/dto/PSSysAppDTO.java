package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysAppDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSSysAppDTO() {
        super("pssysappid", "pssysappname");
    }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSSysAppId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSSysAppId() { resetRelatedId(); }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSSysAppName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSSysAppName() { resetRelatedName(); }
}