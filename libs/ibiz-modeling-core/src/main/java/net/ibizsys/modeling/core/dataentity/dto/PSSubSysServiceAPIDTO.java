package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSubSysServiceAPIDTO extends PSModelDTOBase {
    public static final String FIELD_APISOURCE = "APISOURCE";
    protected static final String DTOFIELD_APISOURCE = "apisource";
    public static final String FIELD_APITAG = "APITAG";
    protected static final String DTOFIELD_APITAG = "apitag";
    public static final String FIELD_APITAG2 = "APITAG2";
    protected static final String DTOFIELD_APITAG2 = "apitag2";
    public static final String FIELD_APITYPE = "APITYPE";
    protected static final String DTOFIELD_APITYPE = "apitype";
    public static final String FIELD_AUTHACCESSTOKENURI = "AUTHACCESSTOKENURI";
    protected static final String DTOFIELD_AUTHACCESSTOKENURI = "authaccesstokenuri";
    public static final String FIELD_AUTHCLIENTID = "AUTHCLIENTID";
    protected static final String DTOFIELD_AUTHCLIENTID = "authclientid";
    public static final String FIELD_AUTHCLIENTSECRET = "AUTHCLIENTSECRET";
    protected static final String DTOFIELD_AUTHCLIENTSECRET = "authclientsecret";
    public static final String FIELD_AUTHCODE = "AUTHCODE";
    protected static final String DTOFIELD_AUTHCODE = "authcode";
    public static final String FIELD_AUTHMODE = "AUTHMODE";
    protected static final String DTOFIELD_AUTHMODE = "authmode";
    public static final String FIELD_AUTHPARAM = "AUTHPARAM";
    protected static final String DTOFIELD_AUTHPARAM = "authparam";
    public static final String FIELD_AUTHPARAM2 = "AUTHPARAM2";
    protected static final String DTOFIELD_AUTHPARAM2 = "authparam2";
    public static final String FIELD_AUTHPARAM3 = "AUTHPARAM3";
    protected static final String DTOFIELD_AUTHPARAM3 = "authparam3";
    public static final String FIELD_AUTHPARAM4 = "AUTHPARAM4";
    protected static final String DTOFIELD_AUTHPARAM4 = "authparam4";
    public static final String FIELD_AUTHTIMEOUT = "AUTHTIMEOUT";
    protected static final String DTOFIELD_AUTHTIMEOUT = "authtimeout";
    public static final String FIELD_BASECLSPARAMS = "BASECLSPARAMS";
    protected static final String DTOFIELD_BASECLSPARAMS = "baseclsparams";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAMEMODE = "CODENAMEMODE";
    protected static final String DTOFIELD_CODENAMEMODE = "codenamemode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFCREATEREQMETHOD = "DEFCREATEREQMETHOD";
    protected static final String DTOFIELD_DEFCREATEREQMETHOD = "defcreatereqmethod";
    public static final String FIELD_DEFDEACTIONREQMETHOD = "DEFDEACTIONREQMETHOD";
    protected static final String DTOFIELD_DEFDEACTIONREQMETHOD = "defdeactionreqmethod";
    public static final String FIELD_DEFDEDATASETREQMETHOD = "DEFDEDATASETREQMETHOD";
    protected static final String DTOFIELD_DEFDEDATASETREQMETHOD = "defdedatasetreqmethod";
    public static final String FIELD_DEFDELETEREQMETHOD = "DEFDELETEREQMETHOD";
    protected static final String DTOFIELD_DEFDELETEREQMETHOD = "defdeletereqmethod";
    public static final String FIELD_DEFGETDRAFTREQMETHOD = "DEFGETDRAFTREQMETHOD";
    protected static final String DTOFIELD_DEFGETDRAFTREQMETHOD = "defgetdraftreqmethod";
    public static final String FIELD_DEFGETREQMETHOD = "DEFGETREQMETHOD";
    protected static final String DTOFIELD_DEFGETREQMETHOD = "defgetreqmethod";
    public static final String FIELD_DEFNEEDRESOURCEKEY = "DEFNEEDRESOURCEKEY";
    protected static final String DTOFIELD_DEFNEEDRESOURCEKEY = "defneedresourcekey";
    public static final String FIELD_DEFSELECTREQMETHOD = "DEFSELECTREQMETHOD";
    protected static final String DTOFIELD_DEFSELECTREQMETHOD = "defselectreqmethod";
    public static final String FIELD_DEFUPDATEREQMETHOD = "DEFUPDATEREQMETHOD";
    protected static final String DTOFIELD_DEFUPDATEREQMETHOD = "defupdatereqmethod";
    public static final String FIELD_DEPSSYSSFPLUGINID = "DEPSSYSSFPLUGINID";
    protected static final String DTOFIELD_DEPSSYSSFPLUGINID = "depssyssfpluginid";
    public static final String FIELD_DEPSSYSSFPLUGINNAME = "DEPSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_DEPSSYSSFPLUGINNAME = "depssyssfpluginname";
    public static final String FIELD_ENABLEAPIMODELEX = "ENABLEAPIMODELEX";
    protected static final String DTOFIELD_ENABLEAPIMODELEX = "enableapimodelex";
    public static final String FIELD_FROMDEMODELFLAG = "FROMDEMODELFLAG";
    protected static final String DTOFIELD_FROMDEMODELFLAG = "fromdemodelflag";
    public static final String FIELD_HEADERPARAMS = "HEADERPARAMS";
    protected static final String DTOFIELD_HEADERPARAMS = "headerparams";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_METHODCODE = "METHODCODE";
    protected static final String DTOFIELD_METHODCODE = "methodcode";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSDEVSLNSYSAPIID = "PSDEVSLNSYSAPIID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";
    public static final String FIELD_PSDEVSLNSYSAPINAME = "PSDEVSLNSYSAPINAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSEAISCHEMEID = "PSSYSEAISCHEMEID";
    protected static final String DTOFIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";
    public static final String FIELD_PSSYSEAISCHEMENAME = "PSSYSEAISCHEMENAME";
    protected static final String DTOFIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSAHANDLERID = "PSSYSSAHANDLERID";
    protected static final String DTOFIELD_PSSYSSAHANDLERID = "pssyssahandlerid";
    public static final String FIELD_PSSYSSAHANDLERNAME = "PSSYSSAHANDLERNAME";
    protected static final String DTOFIELD_PSSYSSAHANDLERNAME = "pssyssahandlername";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_RESETDEFACTIONCODENAME = "RESETDEFACTIONCODENAME";
    protected static final String DTOFIELD_RESETDEFACTIONCODENAME = "resetdefactioncodename";
    public static final String FIELD_SCRIPTENGINE = "SCRIPTENGINE";
    protected static final String DTOFIELD_SCRIPTENGINE = "scriptengine";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_SERVICEDTOFLAG = "SERVICEDTOFLAG";
    protected static final String DTOFIELD_SERVICEDTOFLAG = "servicedtoflag";
    public static final String FIELD_SERVICEPARAM = "SERVICEPARAM";
    protected static final String DTOFIELD_SERVICEPARAM = "serviceparam";
    public static final String FIELD_SERVICEPARAM2 = "SERVICEPARAM2";
    protected static final String DTOFIELD_SERVICEPARAM2 = "serviceparam2";
    public static final String FIELD_SERVICEPARAM3 = "SERVICEPARAM3";
    protected static final String DTOFIELD_SERVICEPARAM3 = "serviceparam3";
    public static final String FIELD_SERVICEPARAM4 = "SERVICEPARAM4";
    protected static final String DTOFIELD_SERVICEPARAM4 = "serviceparam4";
    public static final String FIELD_SERVICEPARAMS = "SERVICEPARAMS";
    protected static final String DTOFIELD_SERVICEPARAMS = "serviceparams";
    public static final String FIELD_SERVICEPATH = "SERVICEPATH";
    protected static final String DTOFIELD_SERVICEPATH = "servicepath";
    public static final String FIELD_SERVICETYPE = "SERVICETYPE";
    protected static final String DTOFIELD_SERVICETYPE = "servicetype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VER = "VER";
    protected static final String DTOFIELD_VER = "ver";

    @JsonProperty(value="apisource")
    public void setAPISource(String aPISource) {
        this._set(DTOFIELD_APISOURCE, aPISource);
    }

    @JsonIgnore
    public String getAPISource() {
        Object objValue = this._get(DTOFIELD_APISOURCE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPISourceDirty() {
        return this._contains(DTOFIELD_APISOURCE);
    }

    @JsonIgnore
    public void resetAPISource() {
        this._reset(DTOFIELD_APISOURCE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apisource(String aPISource) {
        this.setAPISource(aPISource);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apisource(PSModelEnums.SubSysAPISource aPISource) {
        this.setAPISource(aPISource == null ? null : aPISource.value);
        return this;
    }

    @JsonProperty(value="apitag")
    public void setAPITag(String aPITag) {
        this._set(DTOFIELD_APITAG, aPITag);
    }

    @JsonIgnore
    public String getAPITag() {
        Object objValue = this._get(DTOFIELD_APITAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPITagDirty() {
        return this._contains(DTOFIELD_APITAG);
    }

    @JsonIgnore
    public void resetAPITag() {
        this._reset(DTOFIELD_APITAG);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apitag(String aPITag) {
        this.setAPITag(aPITag);
        return this;
    }

    @JsonProperty(value="apitag2")
    public void setAPITag2(String aPITag2) {
        this._set(DTOFIELD_APITAG2, aPITag2);
    }

    @JsonIgnore
    public String getAPITag2() {
        Object objValue = this._get(DTOFIELD_APITAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPITag2Dirty() {
        return this._contains(DTOFIELD_APITAG2);
    }

    @JsonIgnore
    public void resetAPITag2() {
        this._reset(DTOFIELD_APITAG2);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apitag2(String aPITag2) {
        this.setAPITag2(aPITag2);
        return this;
    }

    @JsonProperty(value="apitype")
    public void setAPIType(String aPIType) {
        this._set(DTOFIELD_APITYPE, aPIType);
    }

    @JsonIgnore
    public String getAPIType() {
        Object objValue = this._get(DTOFIELD_APITYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPITypeDirty() {
        return this._contains(DTOFIELD_APITYPE);
    }

    @JsonIgnore
    public void resetAPIType() {
        this._reset(DTOFIELD_APITYPE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apitype(String aPIType) {
        this.setAPIType(aPIType);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO apitype(PSModelEnums.SubSysAPIType aPIType) {
        this.setAPIType(aPIType == null ? null : aPIType.value);
        return this;
    }

    @JsonProperty(value="authaccesstokenuri")
    public void setAuthAccessTokenUri(String authAccessTokenUri) {
        this._set(DTOFIELD_AUTHACCESSTOKENURI, authAccessTokenUri);
    }

    @JsonIgnore
    public String getAuthAccessTokenUri() {
        Object objValue = this._get(DTOFIELD_AUTHACCESSTOKENURI);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthAccessTokenUriDirty() {
        return this._contains(DTOFIELD_AUTHACCESSTOKENURI);
    }

    @JsonIgnore
    public void resetAuthAccessTokenUri() {
        this._reset(DTOFIELD_AUTHACCESSTOKENURI);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authaccesstokenuri(String authAccessTokenUri) {
        this.setAuthAccessTokenUri(authAccessTokenUri);
        return this;
    }

    @JsonProperty(value="authclientid")
    public void setAuthClientId(String authClientId) {
        this._set(DTOFIELD_AUTHCLIENTID, authClientId);
    }

    @JsonIgnore
    public String getAuthClientId() {
        Object objValue = this._get(DTOFIELD_AUTHCLIENTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthClientIdDirty() {
        return this._contains(DTOFIELD_AUTHCLIENTID);
    }

    @JsonIgnore
    public void resetAuthClientId() {
        this._reset(DTOFIELD_AUTHCLIENTID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authclientid(String authClientId) {
        this.setAuthClientId(authClientId);
        return this;
    }

    @JsonProperty(value="authclientsecret")
    public void setAuthClientSecret(String authClientSecret) {
        this._set(DTOFIELD_AUTHCLIENTSECRET, authClientSecret);
    }

    @JsonIgnore
    public String getAuthClientSecret() {
        Object objValue = this._get(DTOFIELD_AUTHCLIENTSECRET);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthClientSecretDirty() {
        return this._contains(DTOFIELD_AUTHCLIENTSECRET);
    }

    @JsonIgnore
    public void resetAuthClientSecret() {
        this._reset(DTOFIELD_AUTHCLIENTSECRET);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authclientsecret(String authClientSecret) {
        this.setAuthClientSecret(authClientSecret);
        return this;
    }

    @JsonProperty(value="authcode")
    public void setAuthCode(String authCode) {
        this._set(DTOFIELD_AUTHCODE, authCode);
    }

    @JsonIgnore
    public String getAuthCode() {
        Object objValue = this._get(DTOFIELD_AUTHCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthCodeDirty() {
        return this._contains(DTOFIELD_AUTHCODE);
    }

    @JsonIgnore
    public void resetAuthCode() {
        this._reset(DTOFIELD_AUTHCODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authcode(String authCode) {
        this.setAuthCode(authCode);
        return this;
    }

    @JsonProperty(value="authmode")
    public void setAuthMode(String authMode) {
        this._set(DTOFIELD_AUTHMODE, authMode);
    }

    @JsonIgnore
    public String getAuthMode() {
        Object objValue = this._get(DTOFIELD_AUTHMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthModeDirty() {
        return this._contains(DTOFIELD_AUTHMODE);
    }

    @JsonIgnore
    public void resetAuthMode() {
        this._reset(DTOFIELD_AUTHMODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authmode(PSModelEnums.APIAuthMode authMode) {
        this.setAuthMode(authMode == null ? null : authMode.value);
        return this;
    }

    @JsonProperty(value="authparam")
    public void setAuthParam(String authParam) {
        this._set(DTOFIELD_AUTHPARAM, authParam);
    }

    @JsonIgnore
    public String getAuthParam() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParamDirty() {
        return this._contains(DTOFIELD_AUTHPARAM);
    }

    @JsonIgnore
    public void resetAuthParam() {
        this._reset(DTOFIELD_AUTHPARAM);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authparam(String authParam) {
        this.setAuthParam(authParam);
        return this;
    }

    @JsonProperty(value="authparam2")
    public void setAuthParam2(String authParam2) {
        this._set(DTOFIELD_AUTHPARAM2, authParam2);
    }

    @JsonIgnore
    public String getAuthParam2() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParam2Dirty() {
        return this._contains(DTOFIELD_AUTHPARAM2);
    }

    @JsonIgnore
    public void resetAuthParam2() {
        this._reset(DTOFIELD_AUTHPARAM2);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authparam2(String authParam2) {
        this.setAuthParam2(authParam2);
        return this;
    }

    @JsonProperty(value="authparam3")
    public void setAuthParam3(String authParam3) {
        this._set(DTOFIELD_AUTHPARAM3, authParam3);
    }

    @JsonIgnore
    public String getAuthParam3() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParam3Dirty() {
        return this._contains(DTOFIELD_AUTHPARAM3);
    }

    @JsonIgnore
    public void resetAuthParam3() {
        this._reset(DTOFIELD_AUTHPARAM3);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authparam3(String authParam3) {
        this.setAuthParam3(authParam3);
        return this;
    }

    @JsonProperty(value="authparam4")
    public void setAuthParam4(String authParam4) {
        this._set(DTOFIELD_AUTHPARAM4, authParam4);
    }

    @JsonIgnore
    public String getAuthParam4() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParam4Dirty() {
        return this._contains(DTOFIELD_AUTHPARAM4);
    }

    @JsonIgnore
    public void resetAuthParam4() {
        this._reset(DTOFIELD_AUTHPARAM4);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authparam4(String authParam4) {
        this.setAuthParam4(authParam4);
        return this;
    }

    @JsonProperty(value="authtimeout")
    public void setAuthTimeout(Integer authTimeout) {
        this._set(DTOFIELD_AUTHTIMEOUT, authTimeout);
    }

    @JsonIgnore
    public Integer getAuthTimeout() {
        Object objValue = this._get(DTOFIELD_AUTHTIMEOUT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAuthTimeoutDirty() {
        return this._contains(DTOFIELD_AUTHTIMEOUT);
    }

    @JsonIgnore
    public void resetAuthTimeout() {
        this._reset(DTOFIELD_AUTHTIMEOUT);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO authtimeout(Integer authTimeout) {
        this.setAuthTimeout(authTimeout);
        return this;
    }

    @JsonProperty(value="baseclsparams")
    public void setBaseClsParams(String baseClsParams) {
        this._set(DTOFIELD_BASECLSPARAMS, baseClsParams);
    }

    @JsonIgnore
    public String getBaseClsParams() {
        Object objValue = this._get(DTOFIELD_BASECLSPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBaseClsParamsDirty() {
        return this._contains(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public void resetBaseClsParams() {
        this._reset(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO baseclsparams(String baseClsParams) {
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codenamemode")
    public void setCodeNameMode(String codeNameMode) {
        this._set(DTOFIELD_CODENAMEMODE, codeNameMode);
    }

    @JsonIgnore
    public String getCodeNameMode() {
        Object objValue = this._get(DTOFIELD_CODENAMEMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameModeDirty() {
        return this._contains(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public void resetCodeNameMode() {
        this._reset(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO codenamemode(String codeNameMode) {
        this.setCodeNameMode(codeNameMode);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO codenamemode(PSModelEnums.CodeNameMode codeNameMode) {
        this.setCodeNameMode(codeNameMode == null ? null : codeNameMode.value);
        return this;
    }

    @JsonProperty(value="createdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCreateDate(Timestamp createDate) {
        this._set(DTOFIELD_CREATEDATE, createDate);
    }

    @JsonIgnore
    public Timestamp getCreateDate() {
        Object objValue = this._get(DTOFIELD_CREATEDATE);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isCreateDateDirty() {
        return this._contains(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public void resetCreateDate() {
        this._reset(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createman")
    public void setCreateMan(String createMan) {
        this._set(DTOFIELD_CREATEMAN, createMan);
    }

    @JsonIgnore
    public String getCreateMan() {
        Object objValue = this._get(DTOFIELD_CREATEMAN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateManDirty() {
        return this._contains(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public void resetCreateMan() {
        this._reset(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        this.setCustomMode(customMode == null ? null : customMode.value);
        return this;
    }

    @JsonProperty(value="defcreatereqmethod")
    public void setDefCreateReqMethod(String defCreateReqMethod) {
        this._set(DTOFIELD_DEFCREATEREQMETHOD, defCreateReqMethod);
    }

    @JsonIgnore
    public String getDefCreateReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFCREATEREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefCreateReqMethodDirty() {
        return this._contains(DTOFIELD_DEFCREATEREQMETHOD);
    }

    @JsonIgnore
    public void resetDefCreateReqMethod() {
        this._reset(DTOFIELD_DEFCREATEREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defcreatereqmethod(String defCreateReqMethod) {
        this.setDefCreateReqMethod(defCreateReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defcreatereqmethod(PSModelEnums.RequestMethod defCreateReqMethod) {
        this.setDefCreateReqMethod(defCreateReqMethod == null ? null : defCreateReqMethod.value);
        return this;
    }

    @JsonProperty(value="defdeactionreqmethod")
    public void setDefDEActionReqMethod(String defDEActionReqMethod) {
        this._set(DTOFIELD_DEFDEACTIONREQMETHOD, defDEActionReqMethod);
    }

    @JsonIgnore
    public String getDefDEActionReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFDEACTIONREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefDEActionReqMethodDirty() {
        return this._contains(DTOFIELD_DEFDEACTIONREQMETHOD);
    }

    @JsonIgnore
    public void resetDefDEActionReqMethod() {
        this._reset(DTOFIELD_DEFDEACTIONREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdeactionreqmethod(String defDEActionReqMethod) {
        this.setDefDEActionReqMethod(defDEActionReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdeactionreqmethod(PSModelEnums.RequestMethod defDEActionReqMethod) {
        this.setDefDEActionReqMethod(defDEActionReqMethod == null ? null : defDEActionReqMethod.value);
        return this;
    }

    @JsonProperty(value="defdedatasetreqmethod")
    public void setDefDEDataSetReqMethod(String defDEDataSetReqMethod) {
        this._set(DTOFIELD_DEFDEDATASETREQMETHOD, defDEDataSetReqMethod);
    }

    @JsonIgnore
    public String getDefDEDataSetReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFDEDATASETREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefDEDataSetReqMethodDirty() {
        return this._contains(DTOFIELD_DEFDEDATASETREQMETHOD);
    }

    @JsonIgnore
    public void resetDefDEDataSetReqMethod() {
        this._reset(DTOFIELD_DEFDEDATASETREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdedatasetreqmethod(String defDEDataSetReqMethod) {
        this.setDefDEDataSetReqMethod(defDEDataSetReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdedatasetreqmethod(PSModelEnums.RequestMethod defDEDataSetReqMethod) {
        this.setDefDEDataSetReqMethod(defDEDataSetReqMethod == null ? null : defDEDataSetReqMethod.value);
        return this;
    }

    @JsonProperty(value="defdeletereqmethod")
    public void setDefDeleteReqMethod(String defDeleteReqMethod) {
        this._set(DTOFIELD_DEFDELETEREQMETHOD, defDeleteReqMethod);
    }

    @JsonIgnore
    public String getDefDeleteReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFDELETEREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefDeleteReqMethodDirty() {
        return this._contains(DTOFIELD_DEFDELETEREQMETHOD);
    }

    @JsonIgnore
    public void resetDefDeleteReqMethod() {
        this._reset(DTOFIELD_DEFDELETEREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdeletereqmethod(String defDeleteReqMethod) {
        this.setDefDeleteReqMethod(defDeleteReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defdeletereqmethod(PSModelEnums.RequestMethod defDeleteReqMethod) {
        this.setDefDeleteReqMethod(defDeleteReqMethod == null ? null : defDeleteReqMethod.value);
        return this;
    }

    @JsonProperty(value="defgetdraftreqmethod")
    public void setDefGetDraftReqMethod(String defGetDraftReqMethod) {
        this._set(DTOFIELD_DEFGETDRAFTREQMETHOD, defGetDraftReqMethod);
    }

    @JsonIgnore
    public String getDefGetDraftReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFGETDRAFTREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefGetDraftReqMethodDirty() {
        return this._contains(DTOFIELD_DEFGETDRAFTREQMETHOD);
    }

    @JsonIgnore
    public void resetDefGetDraftReqMethod() {
        this._reset(DTOFIELD_DEFGETDRAFTREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defgetdraftreqmethod(String defGetDraftReqMethod) {
        this.setDefGetDraftReqMethod(defGetDraftReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defgetdraftreqmethod(PSModelEnums.RequestMethod defGetDraftReqMethod) {
        this.setDefGetDraftReqMethod(defGetDraftReqMethod == null ? null : defGetDraftReqMethod.value);
        return this;
    }

    @JsonProperty(value="defgetreqmethod")
    public void setDefGetReqMethod(String defGetReqMethod) {
        this._set(DTOFIELD_DEFGETREQMETHOD, defGetReqMethod);
    }

    @JsonIgnore
    public String getDefGetReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFGETREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefGetReqMethodDirty() {
        return this._contains(DTOFIELD_DEFGETREQMETHOD);
    }

    @JsonIgnore
    public void resetDefGetReqMethod() {
        this._reset(DTOFIELD_DEFGETREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defgetreqmethod(String defGetReqMethod) {
        this.setDefGetReqMethod(defGetReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defgetreqmethod(PSModelEnums.RequestMethod defGetReqMethod) {
        this.setDefGetReqMethod(defGetReqMethod == null ? null : defGetReqMethod.value);
        return this;
    }

    @JsonProperty(value="defneedresourcekey")
    public void setDefNeedResourceKey(Integer defNeedResourceKey) {
        this._set(DTOFIELD_DEFNEEDRESOURCEKEY, defNeedResourceKey);
    }

    @JsonIgnore
    public Integer getDefNeedResourceKey() {
        Object objValue = this._get(DTOFIELD_DEFNEEDRESOURCEKEY);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefNeedResourceKeyDirty() {
        return this._contains(DTOFIELD_DEFNEEDRESOURCEKEY);
    }

    @JsonIgnore
    public void resetDefNeedResourceKey() {
        this._reset(DTOFIELD_DEFNEEDRESOURCEKEY);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defneedresourcekey(Integer defNeedResourceKey) {
        this.setDefNeedResourceKey(defNeedResourceKey);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defneedresourcekey(Boolean defNeedResourceKey) {
        this.setDefNeedResourceKey(defNeedResourceKey == null ? null : (defNeedResourceKey ? 1 : 0));
        return this;
    }

    @JsonProperty(value="defselectreqmethod")
    public void setDefSelectReqMethod(String defSelectReqMethod) {
        this._set(DTOFIELD_DEFSELECTREQMETHOD, defSelectReqMethod);
    }

    @JsonIgnore
    public String getDefSelectReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFSELECTREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefSelectReqMethodDirty() {
        return this._contains(DTOFIELD_DEFSELECTREQMETHOD);
    }

    @JsonIgnore
    public void resetDefSelectReqMethod() {
        this._reset(DTOFIELD_DEFSELECTREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defselectreqmethod(String defSelectReqMethod) {
        this.setDefSelectReqMethod(defSelectReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defselectreqmethod(PSModelEnums.RequestMethod defSelectReqMethod) {
        this.setDefSelectReqMethod(defSelectReqMethod == null ? null : defSelectReqMethod.value);
        return this;
    }

    @JsonProperty(value="defupdatereqmethod")
    public void setDefUpdateReqMethod(String defUpdateReqMethod) {
        this._set(DTOFIELD_DEFUPDATEREQMETHOD, defUpdateReqMethod);
    }

    @JsonIgnore
    public String getDefUpdateReqMethod() {
        Object objValue = this._get(DTOFIELD_DEFUPDATEREQMETHOD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefUpdateReqMethodDirty() {
        return this._contains(DTOFIELD_DEFUPDATEREQMETHOD);
    }

    @JsonIgnore
    public void resetDefUpdateReqMethod() {
        this._reset(DTOFIELD_DEFUPDATEREQMETHOD);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defupdatereqmethod(String defUpdateReqMethod) {
        this.setDefUpdateReqMethod(defUpdateReqMethod);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO defupdatereqmethod(PSModelEnums.RequestMethod defUpdateReqMethod) {
        this.setDefUpdateReqMethod(defUpdateReqMethod == null ? null : defUpdateReqMethod.value);
        return this;
    }

    @JsonProperty(value="depssyssfpluginid")
    public void setDEPSSysSFPluginId(String dEPSSysSFPluginId) {
        this._set(DTOFIELD_DEPSSYSSFPLUGINID, dEPSSysSFPluginId);
    }

    @JsonIgnore
    public String getDEPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_DEPSSYSSFPLUGINID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_DEPSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetDEPSSysSFPluginId() {
        this._reset(DTOFIELD_DEPSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO depssyssfpluginid(String dEPSSysSFPluginId) {
        this.setDEPSSysSFPluginId(dEPSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO depssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setDEPSSysSFPluginId(null);
            this.setDEPSSysSFPluginName(null);
        } else {
            this.setDEPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setDEPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="depssyssfpluginname")
    public void setDEPSSysSFPluginName(String dEPSSysSFPluginName) {
        this._set(DTOFIELD_DEPSSYSSFPLUGINNAME, dEPSSysSFPluginName);
    }

    @JsonIgnore
    public String getDEPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_DEPSSYSSFPLUGINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_DEPSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetDEPSSysSFPluginName() {
        this._reset(DTOFIELD_DEPSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO depssyssfpluginname(String dEPSSysSFPluginName) {
        this.setDEPSSysSFPluginName(dEPSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="enableapimodelex")
    public void setEnableAPIModelEx(Integer enableAPIModelEx) {
        this._set(DTOFIELD_ENABLEAPIMODELEX, enableAPIModelEx);
    }

    @JsonIgnore
    public Integer getEnableAPIModelEx() {
        Object objValue = this._get(DTOFIELD_ENABLEAPIMODELEX);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAPIModelExDirty() {
        return this._contains(DTOFIELD_ENABLEAPIMODELEX);
    }

    @JsonIgnore
    public void resetEnableAPIModelEx() {
        this._reset(DTOFIELD_ENABLEAPIMODELEX);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO enableapimodelex(Integer enableAPIModelEx) {
        this.setEnableAPIModelEx(enableAPIModelEx);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO enableapimodelex(Boolean enableAPIModelEx) {
        this.setEnableAPIModelEx(enableAPIModelEx == null ? null : (enableAPIModelEx ? 1 : 0));
        return this;
    }

    @JsonProperty(value="fromdemodelflag")
    public void setFromDEModelFlag(Integer fromDEModelFlag) {
        this._set(DTOFIELD_FROMDEMODELFLAG, fromDEModelFlag);
    }

    @JsonIgnore
    public Integer getFromDEModelFlag() {
        Object objValue = this._get(DTOFIELD_FROMDEMODELFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFromDEModelFlagDirty() {
        return this._contains(DTOFIELD_FROMDEMODELFLAG);
    }

    @JsonIgnore
    public void resetFromDEModelFlag() {
        this._reset(DTOFIELD_FROMDEMODELFLAG);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO fromdemodelflag(Integer fromDEModelFlag) {
        this.setFromDEModelFlag(fromDEModelFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO fromdemodelflag(Boolean fromDEModelFlag) {
        this.setFromDEModelFlag(fromDEModelFlag == null ? null : (fromDEModelFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="headerparams")
    public void setHeaderParams(String headerParams) {
        this._set(DTOFIELD_HEADERPARAMS, headerParams);
    }

    @JsonIgnore
    public String getHeaderParams() {
        Object objValue = this._get(DTOFIELD_HEADERPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderParamsDirty() {
        return this._contains(DTOFIELD_HEADERPARAMS);
    }

    @JsonIgnore
    public void resetHeaderParams() {
        this._reset(DTOFIELD_HEADERPARAMS);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO headerparams(String headerParams) {
        this.setHeaderParams(headerParams);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMemoDirty() {
        return this._contains(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public void resetMemo() {
        this._reset(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="methodcode")
    public void setMethodCode(String methodCode) {
        this._set(DTOFIELD_METHODCODE, methodCode);
    }

    @JsonIgnore
    public String getMethodCode() {
        Object objValue = this._get(DTOFIELD_METHODCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMethodCodeDirty() {
        return this._contains(DTOFIELD_METHODCODE);
    }

    @JsonIgnore
    public void resetMethodCode() {
        this._reset(DTOFIELD_METHODCODE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO methodcode(String methodCode) {
        this.setMethodCode(methodCode);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO predefinedtype(PSModelEnums.PredefinedServiceAPIClient predefinedType) {
        this.setPredefinedType(predefinedType == null ? null : predefinedType.value);
        return this;
    }

    @JsonProperty(value="psdevslnsysapiid")
    public void setPSDevSlnSysAPIId(String pSDevSlnSysAPIId) {
        this._set(DTOFIELD_PSDEVSLNSYSAPIID, pSDevSlnSysAPIId);
    }

    @JsonIgnore
    public String getPSDevSlnSysAPIId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAPIIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAPIId() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psdevslnsysapiid(String pSDevSlnSysAPIId) {
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psdevslnsysapiid(PSDevSlnSysAPIDTO pSDevSlnSysAPI) {
        if (pSDevSlnSysAPI == null) {
            this.setPSDevSlnSysAPIId(null);
            this.setPSDevSlnSysAPIName(null);
        } else {
            this.setPSDevSlnSysAPIId(pSDevSlnSysAPI.getPSDevSlnSysAPIId());
            this.setPSDevSlnSysAPIName(pSDevSlnSysAPI.getPSDevSlnSysAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysapiname")
    public void setPSDevSlnSysAPIName(String pSDevSlnSysAPIName) {
        this._set(DTOFIELD_PSDEVSLNSYSAPINAME, pSDevSlnSysAPIName);
    }

    @JsonIgnore
    public String getPSDevSlnSysAPIName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAPINameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAPIName() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psdevslnsysapiname(String pSDevSlnSysAPIName) {
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIName() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyseaischemeid")
    public void setPSSysEAISchemeId(String pSSysEAISchemeId) {
        this._set(DTOFIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }

    @JsonIgnore
    public String getPSSysEAISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeId() {
        this._reset(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme) {
        if (pSSysEAIScheme == null) {
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        } else {
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaischemename")
    public void setPSSysEAISchemeName(String pSSysEAISchemeName) {
        this._set(DTOFIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }

    @JsonIgnore
    public String getPSSysEAISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeName() {
        this._reset(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyseaischemename(String pSSysEAISchemeName) {
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssahandlerid")
    public void setPSSysSAHandlerId(String pSSysSAHandlerId) {
        this._set(DTOFIELD_PSSYSSAHANDLERID, pSSysSAHandlerId);
    }

    @JsonIgnore
    public String getPSSysSAHandlerId() {
        Object objValue = this._get(DTOFIELD_PSSYSSAHANDLERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSAHandlerIdDirty() {
        return this._contains(DTOFIELD_PSSYSSAHANDLERID);
    }

    @JsonIgnore
    public void resetPSSysSAHandlerId() {
        this._reset(DTOFIELD_PSSYSSAHANDLERID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssahandlerid(String pSSysSAHandlerId) {
        this.setPSSysSAHandlerId(pSSysSAHandlerId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssahandlerid(PSSysSAHandlerDTO pSSysSAHandler) {
        if (pSSysSAHandler == null) {
            this.setPSSysSAHandlerId(null);
            this.setPSSysSAHandlerName(null);
        } else {
            this.setPSSysSAHandlerId(pSSysSAHandler.getPSSysSAHandlerId());
            this.setPSSysSAHandlerName(pSSysSAHandler.getPSSysSAHandlerName());
        }
        return this;
    }

    @JsonProperty(value="pssyssahandlername")
    public void setPSSysSAHandlerName(String pSSysSAHandlerName) {
        this._set(DTOFIELD_PSSYSSAHANDLERNAME, pSSysSAHandlerName);
    }

    @JsonIgnore
    public String getPSSysSAHandlerName() {
        Object objValue = this._get(DTOFIELD_PSSYSSAHANDLERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSAHandlerNameDirty() {
        return this._contains(DTOFIELD_PSSYSSAHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSSysSAHandlerName() {
        this._reset(DTOFIELD_PSSYSSAHANDLERNAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssahandlername(String pSSysSAHandlerName) {
        this.setPSSysSAHandlerName(pSSysSAHandlerName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
        if (pSSysServiceAPI == null) {
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        } else {
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssysserviceapiname")
    public void setPSSysServiceAPIName(String pSSysServiceAPIName) {
        this._set(DTOFIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIName() {
        this._reset(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssysserviceapiname(String pSSysServiceAPIName) {
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="resetdefactioncodename")
    public void setResetDefActionCodeName(Integer resetDefActionCodeName) {
        this._set(DTOFIELD_RESETDEFACTIONCODENAME, resetDefActionCodeName);
    }

    @JsonIgnore
    public Integer getResetDefActionCodeName() {
        Object objValue = this._get(DTOFIELD_RESETDEFACTIONCODENAME);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResetDefActionCodeNameDirty() {
        return this._contains(DTOFIELD_RESETDEFACTIONCODENAME);
    }

    @JsonIgnore
    public void resetResetDefActionCodeName() {
        this._reset(DTOFIELD_RESETDEFACTIONCODENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO resetdefactioncodename(Integer resetDefActionCodeName) {
        this.setResetDefActionCodeName(resetDefActionCodeName);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO resetdefactioncodename(Boolean resetDefActionCodeName) {
        this.setResetDefActionCodeName(resetDefActionCodeName == null ? null : (resetDefActionCodeName ? 1 : 0));
        return this;
    }

    @JsonProperty(value="scriptengine")
    public void setScriptEngine(String scriptEngine) {
        this._set(DTOFIELD_SCRIPTENGINE, scriptEngine);
    }

    @JsonIgnore
    public String getScriptEngine() {
        Object objValue = this._get(DTOFIELD_SCRIPTENGINE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isScriptEngineDirty() {
        return this._contains(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public void resetScriptEngine() {
        this._reset(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO scriptengine(String scriptEngine) {
        this.setScriptEngine(scriptEngine);
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public void resetServiceCodeName() {
        this._reset(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    @JsonProperty(value="servicedtoflag")
    public void setServiceDTOFlag(Integer serviceDTOFlag) {
        this._set(DTOFIELD_SERVICEDTOFLAG, serviceDTOFlag);
    }

    @JsonIgnore
    public Integer getServiceDTOFlag() {
        Object objValue = this._get(DTOFIELD_SERVICEDTOFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isServiceDTOFlagDirty() {
        return this._contains(DTOFIELD_SERVICEDTOFLAG);
    }

    @JsonIgnore
    public void resetServiceDTOFlag() {
        this._reset(DTOFIELD_SERVICEDTOFLAG);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicedtoflag(Integer serviceDTOFlag) {
        this.setServiceDTOFlag(serviceDTOFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicedtoflag(Boolean serviceDTOFlag) {
        this.setServiceDTOFlag(serviceDTOFlag == null ? null : (serviceDTOFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="serviceparam")
    public void setServiceParam(String serviceParam) {
        this._set(DTOFIELD_SERVICEPARAM, serviceParam);
    }

    @JsonIgnore
    public String getServiceParam() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParamDirty() {
        return this._contains(DTOFIELD_SERVICEPARAM);
    }

    @JsonIgnore
    public void resetServiceParam() {
        this._reset(DTOFIELD_SERVICEPARAM);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO serviceparam(String serviceParam) {
        this.setServiceParam(serviceParam);
        return this;
    }

    @JsonProperty(value="serviceparam2")
    public void setServiceParam2(String serviceParam2) {
        this._set(DTOFIELD_SERVICEPARAM2, serviceParam2);
    }

    @JsonIgnore
    public String getServiceParam2() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParam2Dirty() {
        return this._contains(DTOFIELD_SERVICEPARAM2);
    }

    @JsonIgnore
    public void resetServiceParam2() {
        this._reset(DTOFIELD_SERVICEPARAM2);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO serviceparam2(String serviceParam2) {
        this.setServiceParam2(serviceParam2);
        return this;
    }

    @JsonProperty(value="serviceparam3")
    public void setServiceParam3(String serviceParam3) {
        this._set(DTOFIELD_SERVICEPARAM3, serviceParam3);
    }

    @JsonIgnore
    public String getServiceParam3() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParam3Dirty() {
        return this._contains(DTOFIELD_SERVICEPARAM3);
    }

    @JsonIgnore
    public void resetServiceParam3() {
        this._reset(DTOFIELD_SERVICEPARAM3);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO serviceparam3(String serviceParam3) {
        this.setServiceParam3(serviceParam3);
        return this;
    }

    @JsonProperty(value="serviceparam4")
    public void setServiceParam4(String serviceParam4) {
        this._set(DTOFIELD_SERVICEPARAM4, serviceParam4);
    }

    @JsonIgnore
    public String getServiceParam4() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParam4Dirty() {
        return this._contains(DTOFIELD_SERVICEPARAM4);
    }

    @JsonIgnore
    public void resetServiceParam4() {
        this._reset(DTOFIELD_SERVICEPARAM4);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO serviceparam4(String serviceParam4) {
        this.setServiceParam4(serviceParam4);
        return this;
    }

    @JsonProperty(value="serviceparams")
    public void setServiceParams(String serviceParams) {
        this._set(DTOFIELD_SERVICEPARAMS, serviceParams);
    }

    @JsonIgnore
    public String getServiceParams() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParamsDirty() {
        return this._contains(DTOFIELD_SERVICEPARAMS);
    }

    @JsonIgnore
    public void resetServiceParams() {
        this._reset(DTOFIELD_SERVICEPARAMS);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO serviceparams(String serviceParams) {
        this.setServiceParams(serviceParams);
        return this;
    }

    @JsonProperty(value="servicepath")
    public void setServicePath(String servicePath) {
        this._set(DTOFIELD_SERVICEPATH, servicePath);
    }

    @JsonIgnore
    public String getServicePath() {
        Object objValue = this._get(DTOFIELD_SERVICEPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServicePathDirty() {
        return this._contains(DTOFIELD_SERVICEPATH);
    }

    @JsonIgnore
    public void resetServicePath() {
        this._reset(DTOFIELD_SERVICEPATH);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicepath(String servicePath) {
        this.setServicePath(servicePath);
        return this;
    }

    @JsonProperty(value="servicetype")
    public void setServiceType(String serviceType) {
        this._set(DTOFIELD_SERVICETYPE, serviceType);
    }

    @JsonIgnore
    public String getServiceType() {
        Object objValue = this._get(DTOFIELD_SERVICETYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceTypeDirty() {
        return this._contains(DTOFIELD_SERVICETYPE);
    }

    @JsonIgnore
    public void resetServiceType() {
        this._reset(DTOFIELD_SERVICETYPE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicetype(String serviceType) {
        this.setServiceType(serviceType);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO servicetype(PSModelEnums.ServiceType serviceType) {
        this.setServiceType(serviceType == null ? null : serviceType.value);
        return this;
    }

    @JsonProperty(value="updatedate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setUpdateDate(Timestamp updateDate) {
        this._set(DTOFIELD_UPDATEDATE, updateDate);
    }

    @JsonIgnore
    public Timestamp getUpdateDate() {
        Object objValue = this._get(DTOFIELD_UPDATEDATE);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDateDirty() {
        return this._contains(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public void resetUpdateDate() {
        this._reset(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @JsonProperty(value="updateman")
    public void setUpdateMan(String updateMan) {
        this._set(DTOFIELD_UPDATEMAN, updateMan);
    }

    @JsonIgnore
    public String getUpdateMan() {
        Object objValue = this._get(DTOFIELD_UPDATEMAN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateManDirty() {
        return this._contains(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public void resetUpdateMan() {
        this._reset(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return this._contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        this._reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usertag(String userTag) {
        this.setUserTag(userTag);
        return this;
    }

    @JsonProperty(value="usertag2")
    public void setUserTag2(String userTag2) {
        this._set(DTOFIELD_USERTAG2, userTag2);
    }

    @JsonIgnore
    public String getUserTag2() {
        Object objValue = this._get(DTOFIELD_USERTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return this._contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        this._reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="usertag3")
    public void setUserTag3(String userTag3) {
        this._set(DTOFIELD_USERTAG3, userTag3);
    }

    @JsonIgnore
    public String getUserTag3() {
        Object objValue = this._get(DTOFIELD_USERTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return this._contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        this._reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usertag3(String userTag3) {
        this.setUserTag3(userTag3);
        return this;
    }

    @JsonProperty(value="usertag4")
    public void setUserTag4(String userTag4) {
        this._set(DTOFIELD_USERTAG4, userTag4);
    }

    @JsonIgnore
    public String getUserTag4() {
        Object objValue = this._get(DTOFIELD_USERTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return this._contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        this._reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isValidFlagDirty() {
        return this._contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetValidFlag() {
        this._reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="ver")
    public void setVer(Integer ver) {
        this._set(DTOFIELD_VER, ver);
    }

    @JsonIgnore
    public Integer getVer() {
        Object objValue = this._get(DTOFIELD_VER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isVerDirty() {
        return this._contains(DTOFIELD_VER);
    }

    @JsonIgnore
    public void resetVer() {
        this._reset(DTOFIELD_VER);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO ver(Integer ver) {
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSubSysServiceAPIName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSubSysServiceAPIName(strName);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO name(String strName) {
        this.setPSSubSysServiceAPIName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSubSysServiceAPIId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSubSysServiceAPIId(strValue);
    }

    @JsonIgnore
    public PSSubSysServiceAPIDTO id(String strValue) {
        this.setPSSubSysServiceAPIId(strValue);
        return this;
    }

}
