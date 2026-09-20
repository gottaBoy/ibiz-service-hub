package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSAppModuleDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSAppModuleDTO() {
        super("psappmoduleid", "psappmodulename");
    }

    @JsonProperty("psappmoduleid")
    public void setPSAppModuleId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSAppModuleId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSAppModuleIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSAppModuleId() { resetRelatedId(); }

    @JsonProperty("psappmodulename")
    public void setPSAppModuleName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSAppModuleName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSAppModuleNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSAppModuleName() { resetRelatedName(); }
}