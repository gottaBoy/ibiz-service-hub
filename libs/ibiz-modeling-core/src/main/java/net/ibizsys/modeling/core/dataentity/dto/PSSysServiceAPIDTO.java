package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSSysServiceAPIDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_CODENAME = "codename";
    private static final String DTOFIELD_APIMODE = "apimode";
    private static final String DTOFIELD_APITYPE = "apitype";
    private static final String DTOFIELD_VER = "ver";

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

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }

    @JsonProperty("apimode")
    public void setAPIMode(Integer value) { _set(DTOFIELD_APIMODE, value); }
    @JsonIgnore public Integer getAPIMode() { return (Integer) _get(DTOFIELD_APIMODE); }
    @JsonIgnore public boolean isAPIModeDirty() { return _contains(DTOFIELD_APIMODE); }
    @JsonIgnore public void resetAPIMode() { _reset(DTOFIELD_APIMODE); }

    @JsonProperty("apitype")
    public void setAPIType(String value) { _set(DTOFIELD_APITYPE, value); }
    @JsonIgnore public String getAPIType() { return (String) _get(DTOFIELD_APITYPE); }
    @JsonIgnore public boolean isAPITypeDirty() { return _contains(DTOFIELD_APITYPE); }
    @JsonIgnore public void resetAPIType() { _reset(DTOFIELD_APITYPE); }

    @JsonProperty("ver")
    public void setVer(Integer value) { _set(DTOFIELD_VER, value); }
    @JsonIgnore public Integer getVer() { return (Integer) _get(DTOFIELD_VER); }
    @JsonIgnore public boolean isVerDirty() { return _contains(DTOFIELD_VER); }
    @JsonIgnore public void resetVer() { _reset(DTOFIELD_VER); }
}
