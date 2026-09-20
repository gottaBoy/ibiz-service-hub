package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysReqItemDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSSysReqItemDTO() {
        super("pssysreqitemid", "pssysreqitemname");
    }

    @JsonProperty("pssysreqitemid")
    public void setPSSysReqItemId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSSysReqItemId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSSysReqItemIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSSysReqItemId() { resetRelatedId(); }

    @JsonProperty("pssysreqitemname")
    public void setPSSysReqItemName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSSysReqItemName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSSysReqItemNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSSysReqItemName() { resetRelatedName(); }
}