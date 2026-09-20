package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSDEViewBaseDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_CODENAME = "codename";
    private static final String DTOFIELD_DEVIEWTAG3 = "deviewtag3";
    private static final String DTOFIELD_DEVIEWTAG4 = "deviewtag4";
    private static final String DTOFIELD_TITLE = "title";
    private static final String DTOFIELD_PDVTPARAM = "pdvtparam";
    private static final String DTOFIELD_PREDEFINEDVIEWTYPE = "predefinedviewtype";
    private static final String FIELD_PREDEFINEDVIEWTYPE = "PREDEFINEVIEWTYPE";
    private static final String DTOFIELD_PSDEID = "psdeid";
    private static final String DTOFIELD_PSDENAME = "psdename";
    private static final String DTOFIELD_PSDEVIEWBASETYPE = "psdeviewbasetype";
    private static final String DTOFIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";
    private static final String DTOFIELD_PSWFDEID = "pswfdeid";
    private static final String DTOFIELD_PSWFID = "pswfid";

    public PSDEViewBaseDTO() {
        super("psdeviewbaseid", "psdeviewbasename");
    }

    @JsonProperty("psdeviewbaseid")
    public void setPSDEViewBaseId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSDEViewBaseId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSDEViewBaseIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSDEViewBaseId() { resetRelatedId(); }

    @JsonProperty("psdeviewbasename")
    public void setPSDEViewBaseName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSDEViewBaseName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSDEViewBaseNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSDEViewBaseName() { resetRelatedName(); }

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }

    @JsonProperty("title")
    public void setTitle(String value) { _set(DTOFIELD_TITLE, value); }
    @JsonIgnore public String getTitle() { return (String) _get(DTOFIELD_TITLE); }
    @JsonIgnore public boolean isTitleDirty() { return _contains(DTOFIELD_TITLE); }
    @JsonIgnore public void resetTitle() { _reset(DTOFIELD_TITLE); }

    @JsonProperty("pdvtparam")
    public void setPDVTParam(String value) { _set(DTOFIELD_PDVTPARAM, value); }
    @JsonIgnore public String getPDVTParam() { return (String) _get(DTOFIELD_PDVTPARAM); }
    @JsonIgnore public boolean isPDVTParamDirty() { return _contains(DTOFIELD_PDVTPARAM); }
    @JsonIgnore public void resetPDVTParam() { _reset(DTOFIELD_PDVTPARAM); }

    @JsonProperty("predefinedviewtype")
    public void setPredefinedViewType(String value) {
        _set(DTOFIELD_PREDEFINEDVIEWTYPE, value);
        _set(FIELD_PREDEFINEDVIEWTYPE, value);
    }
    @JsonIgnore public String getPredefinedViewType() {
        Object value = _get(DTOFIELD_PREDEFINEDVIEWTYPE);
        return value != null ? (String) value : (String) _get(FIELD_PREDEFINEDVIEWTYPE);
    }
    @JsonIgnore public boolean isPredefinedViewTypeDirty() {
        return _contains(DTOFIELD_PREDEFINEDVIEWTYPE) || _contains(FIELD_PREDEFINEDVIEWTYPE);
    }
    @JsonIgnore public void resetPredefinedViewType() {
        _reset(DTOFIELD_PREDEFINEDVIEWTYPE);
        _reset(FIELD_PREDEFINEDVIEWTYPE);
    }

    @JsonProperty("deviewtag3")
    public void setDEViewTag3(String value) { _set(DTOFIELD_DEVIEWTAG3, value); }
    @JsonIgnore public String getDEViewTag3() { return (String) _get(DTOFIELD_DEVIEWTAG3); }
    @JsonIgnore public boolean isDEViewTag3Dirty() { return _contains(DTOFIELD_DEVIEWTAG3); }
    @JsonIgnore public void resetDEViewTag3() { _reset(DTOFIELD_DEVIEWTAG3); }

    @JsonProperty("deviewtag4")
    public void setDEViewTag4(String value) { _set(DTOFIELD_DEVIEWTAG4, value); }
    @JsonIgnore public String getDEViewTag4() { return (String) _get(DTOFIELD_DEVIEWTAG4); }
    @JsonIgnore public boolean isDEViewTag4Dirty() { return _contains(DTOFIELD_DEVIEWTAG4); }
    @JsonIgnore public void resetDEViewTag4() { _reset(DTOFIELD_DEVIEWTAG4); }

    @JsonProperty("psdeid")
    public void setPSDEId(String value) { _set(DTOFIELD_PSDEID, value); }
    @JsonIgnore public String getPSDEId() { return (String) _get(DTOFIELD_PSDEID); }
    @JsonIgnore public boolean isPSDEIdDirty() { return _contains(DTOFIELD_PSDEID); }
    @JsonIgnore public void resetPSDEId() { _reset(DTOFIELD_PSDEID); }

    @JsonProperty("psdename")
    public void setPSDEName(String value) { _set(DTOFIELD_PSDENAME, value); }
    @JsonIgnore public String getPSDEName() { return (String) _get(DTOFIELD_PSDENAME); }
    @JsonIgnore public boolean isPSDENameDirty() { return _contains(DTOFIELD_PSDENAME); }
    @JsonIgnore public void resetPSDEName() { _reset(DTOFIELD_PSDENAME); }

    @JsonProperty("psdeviewbasetype")
    public void setPSDEViewBaseType(String value) { _set(DTOFIELD_PSDEVIEWBASETYPE, value); }
    @JsonIgnore public String getPSDEViewBaseType() { return (String) _get(DTOFIELD_PSDEVIEWBASETYPE); }
    @JsonIgnore public boolean isPSDEViewBaseTypeDirty() { return _contains(DTOFIELD_PSDEVIEWBASETYPE); }
    @JsonIgnore public void resetPSDEViewBaseType() { _reset(DTOFIELD_PSDEVIEWBASETYPE); }

    @JsonProperty("psdynadeviewtemplid")
    public void setPSDynaDEViewTemplId(String value) { _set(DTOFIELD_PSDYNADEVIEWTEMPLID, value); }
    @JsonIgnore public String getPSDynaDEViewTemplId() { return (String) _get(DTOFIELD_PSDYNADEVIEWTEMPLID); }
    @JsonIgnore public boolean isPSDynaDEViewTemplIdDirty() { return _contains(DTOFIELD_PSDYNADEVIEWTEMPLID); }
    @JsonIgnore public void resetPSDynaDEViewTemplId() { _reset(DTOFIELD_PSDYNADEVIEWTEMPLID); }

    @JsonProperty("pswfdeid")
    public void setPSWFDEId(String value) { _set(DTOFIELD_PSWFDEID, value); }
    @JsonIgnore public String getPSWFDEId() { return (String) _get(DTOFIELD_PSWFDEID); }
    @JsonIgnore public boolean isPSWFDEIdDirty() { return _contains(DTOFIELD_PSWFDEID); }
    @JsonIgnore public void resetPSWFDEId() { _reset(DTOFIELD_PSWFDEID); }

    @JsonProperty("pswfid")
    public void setPSWFId(String value) { _set(DTOFIELD_PSWFID, value); }
    @JsonIgnore public String getPSWFId() { return (String) _get(DTOFIELD_PSWFID); }
    @JsonIgnore public boolean isPSWFIdDirty() { return _contains(DTOFIELD_PSWFID); }
    @JsonIgnore public void resetPSWFId() { _reset(DTOFIELD_PSWFID); }
}