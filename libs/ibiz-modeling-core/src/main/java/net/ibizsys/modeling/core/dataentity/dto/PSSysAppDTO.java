package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysAppDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_APPPKGNAME = "apppkgname";
    private static final String DTOFIELD_PSAPPTYPEID = "psapptypeid";
    private static final String DTOFIELD_PSPFID = "pspfid";
    private static final String DTOFIELD_PSPFNAME = "pspfname";
    private static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    private static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    private static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    private static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

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

    @JsonProperty("apppkgname")
    public void setAppPKGName(String value) { _set(DTOFIELD_APPPKGNAME, value); }
    @JsonIgnore public String getAppPKGName() { return (String) _get(DTOFIELD_APPPKGNAME); }
    @JsonIgnore public boolean isAppPKGNameDirty() { return _contains(DTOFIELD_APPPKGNAME); }
    @JsonIgnore public void resetAppPKGName() { _reset(DTOFIELD_APPPKGNAME); }

    @JsonProperty("psapptypeid")
    public void setPSAppTypeId(String value) { _set(DTOFIELD_PSAPPTYPEID, value); }
    @JsonIgnore public String getPSAppTypeId() { return (String) _get(DTOFIELD_PSAPPTYPEID); }
    @JsonIgnore public boolean isPSAppTypeIdDirty() { return _contains(DTOFIELD_PSAPPTYPEID); }
    @JsonIgnore public void resetPSAppTypeId() { _reset(DTOFIELD_PSAPPTYPEID); }

    @JsonProperty("pspfid")
    public void setPSPFId(String value) { _set(DTOFIELD_PSPFID, value); }
    @JsonIgnore public String getPSPFId() { return (String) _get(DTOFIELD_PSPFID); }
    @JsonIgnore public boolean isPSPFIdDirty() { return _contains(DTOFIELD_PSPFID); }
    @JsonIgnore public void resetPSPFId() { _reset(DTOFIELD_PSPFID); }

    @JsonProperty("pspfname")
    public void setPSPFName(String value) { _set(DTOFIELD_PSPFNAME, value); }
    @JsonIgnore public String getPSPFName() { return (String) _get(DTOFIELD_PSPFNAME); }
    @JsonIgnore public boolean isPSPFNameDirty() { return _contains(DTOFIELD_PSPFNAME); }
    @JsonIgnore public void resetPSPFName() { _reset(DTOFIELD_PSPFNAME); }

    @JsonProperty("pspfstyleid")
    public void setPSPFStyleId(String value) { _set(DTOFIELD_PSPFSTYLEID, value); }
    @JsonIgnore public String getPSPFStyleId() { return (String) _get(DTOFIELD_PSPFSTYLEID); }
    @JsonIgnore public boolean isPSPFStyleIdDirty() { return _contains(DTOFIELD_PSPFSTYLEID); }
    @JsonIgnore public void resetPSPFStyleId() { _reset(DTOFIELD_PSPFSTYLEID); }

    @JsonProperty("pspfstylename")
    public void setPSPFStyleName(String value) { _set(DTOFIELD_PSPFSTYLENAME, value); }
    @JsonIgnore public String getPSPFStyleName() { return (String) _get(DTOFIELD_PSPFSTYLENAME); }
    @JsonIgnore public boolean isPSPFStyleNameDirty() { return _contains(DTOFIELD_PSPFSTYLENAME); }
    @JsonIgnore public void resetPSPFStyleName() { _reset(DTOFIELD_PSPFSTYLENAME); }

    @JsonProperty("pssysserviceapiid")
    public void setPSSysServiceAPIId(String value) { _set(DTOFIELD_PSSYSSERVICEAPIID, value); }
    @JsonIgnore public String getPSSysServiceAPIId() { return (String) _get(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public boolean isPSSysServiceAPIIdDirty() { return _contains(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public void resetPSSysServiceAPIId() { _reset(DTOFIELD_PSSYSSERVICEAPIID); }

    @JsonProperty("pssysserviceapiname")
    public void setPSSysServiceAPIName(String value) { _set(DTOFIELD_PSSYSSERVICEAPINAME, value); }
    @JsonIgnore public String getPSSysServiceAPIName() { return (String) _get(DTOFIELD_PSSYSSERVICEAPINAME); }
    @JsonIgnore public boolean isPSSysServiceAPINameDirty() { return _contains(DTOFIELD_PSSYSSERVICEAPINAME); }
    @JsonIgnore public void resetPSSysServiceAPIName() { _reset(DTOFIELD_PSSYSSERVICEAPINAME); }
}
