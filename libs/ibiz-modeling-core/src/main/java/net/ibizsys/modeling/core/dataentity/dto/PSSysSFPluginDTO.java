package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysSFPluginDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSSysSFPluginDTO() {
        super("pssyssfpluginid", "pssyssfpluginname");
    }

    @JsonProperty("pssyssfpluginid")
    public void setPSSysSFPluginId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSSysSFPluginId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSSysSFPluginIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSSysSFPluginId() { resetRelatedId(); }

    @JsonProperty("pssyssfpluginname")
    public void setPSSysSFPluginName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSSysSFPluginName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSSysSFPluginNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSSysSFPluginName() { resetRelatedName(); }
}