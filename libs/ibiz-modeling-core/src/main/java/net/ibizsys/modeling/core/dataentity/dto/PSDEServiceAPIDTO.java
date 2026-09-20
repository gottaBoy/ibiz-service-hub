package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSDEServiceAPIDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_PSDEID = "psdeid";
    private static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    public PSDEServiceAPIDTO() {
        super("psdeserviceapiid", "psdeserviceapiname");
    }

    @JsonProperty("psdeserviceapiid")
    public void setPSDEServiceAPIId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSDEServiceAPIId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSDEServiceAPIIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSDEServiceAPIId() { resetRelatedId(); }

    @JsonProperty("psdeserviceapiname")
    public void setPSDEServiceAPIName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSDEServiceAPIName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSDEServiceAPINameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSDEServiceAPIName() { resetRelatedName(); }

    @JsonProperty("psdeid")
    public void setPSDEId(String value) { _set(DTOFIELD_PSDEID, value); }
    @JsonIgnore public String getPSDEId() { return (String) _get(DTOFIELD_PSDEID); }
    @JsonIgnore public boolean isPSDEIdDirty() { return _contains(DTOFIELD_PSDEID); }
    @JsonIgnore public void resetPSDEId() { _reset(DTOFIELD_PSDEID); }

    @JsonProperty("pssysserviceapiid")
    public void setPSSysServiceAPIId(String value) { _set(DTOFIELD_PSSYSSERVICEAPIID, value); }
    @JsonIgnore public String getPSSysServiceAPIId() { return (String) _get(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public boolean isPSSysServiceAPIIdDirty() { return _contains(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public void resetPSSysServiceAPIId() { _reset(DTOFIELD_PSSYSSERVICEAPIID); }
}