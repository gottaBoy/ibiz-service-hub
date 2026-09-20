package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDataSyncAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysResourceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUtilDTO
extends PSModelDTOBase {
    public static final String FIELD_AUTHACCESSTOKENURI = "AUTHACCESSTOKENURI";
    protected static final String DTOFIELD_AUTHACCESSTOKENURI = "authaccesstokenuri";
    public static final String FIELD_AUTHCLIENTID = "AUTHCLIENTID";
    protected static final String DTOFIELD_AUTHCLIENTID = "authclientid";
    public static final String FIELD_AUTHCLIENTSECRET = "AUTHCLIENTSECRET";
    protected static final String DTOFIELD_AUTHCLIENTSECRET = "authclientsecret";
    public static final String FIELD_AUTHMODE = "AUTHMODE";
    protected static final String DTOFIELD_AUTHMODE = "authmode";
    public static final String FIELD_AUTHPARAM = "AUTHPARAM";
    protected static final String DTOFIELD_AUTHPARAM = "authparam";
    public static final String FIELD_AUTHPARAM2 = "AUTHPARAM2";
    protected static final String DTOFIELD_AUTHPARAM2 = "authparam2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_INPSSYSDATASYNCAGENTID = "INPSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_INPSSYSDATASYNCAGENTID = "inpssysdatasyncagentid";
    public static final String FIELD_INPSSYSDATASYNCAGENTNAME = "INPSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_INPSSYSDATASYNCAGENTNAME = "inpssysdatasyncagentname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_OUTPSSYSDATASYNCAGENTID = "OUTPSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_OUTPSSYSDATASYNCAGENTID = "outpssysdatasyncagentid";
    public static final String FIELD_OUTPSSYSDATASYNCAGENTNAME = "OUTPSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_OUTPSSYSDATASYNCAGENTNAME = "outpssysdatasyncagentname";
    public static final String FIELD_OUTPSSYSRESOURCEID = "OUTPSSYSRESOURCEID";
    protected static final String DTOFIELD_OUTPSSYSRESOURCEID = "outpssysresourceid";
    public static final String FIELD_OUTPSSYSRESOURCENAME = "OUTPSSYSRESOURCENAME";
    protected static final String DTOFIELD_OUTPSSYSRESOURCENAME = "outpssysresourcename";
    public static final String FIELD_PSDEGROUPID = "PSDEGROUPID";
    protected static final String DTOFIELD_PSDEGROUPID = "psdegroupid";
    public static final String FIELD_PSDEGROUPNAME = "PSDEGROUPNAME";
    protected static final String DTOFIELD_PSDEGROUPNAME = "psdegroupname";
    public static final String FIELD_PSDERGROUPID = "PSDERGROUPID";
    protected static final String DTOFIELD_PSDERGROUPID = "psdergroupid";
    public static final String FIELD_PSDERGROUPNAME = "PSDERGROUPNAME";
    protected static final String DTOFIELD_PSDERGROUPNAME = "psdergroupname";
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
    public static final String FIELD_PSSYSMODELGROUPID = "PSSYSMODELGROUPID";
    protected static final String DTOFIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";
    public static final String FIELD_PSSYSMODELGROUPNAME = "PSSYSMODELGROUPNAME";
    protected static final String DTOFIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUTILID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILID = "pssysutilid";
    public static final String FIELD_PSSYSUTILNAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILNAME = "pssysutilname";
    public static final String FIELD_SERVICEPARAM = "SERVICEPARAM";
    protected static final String DTOFIELD_SERVICEPARAM = "serviceparam";
    public static final String FIELD_SERVICEPARAM2 = "SERVICEPARAM2";
    protected static final String DTOFIELD_SERVICEPARAM2 = "serviceparam2";
    public static final String FIELD_SERVICEPATH = "SERVICEPATH";
    protected static final String DTOFIELD_SERVICEPATH = "servicepath";
    public static final String FIELD_UNIQUETAG = "UNIQUETAG";
    protected static final String DTOFIELD_UNIQUETAG = "uniquetag";
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
    public static final String FIELD_UTILOBJ = "UTILOBJ";
    protected static final String DTOFIELD_UTILOBJ = "utilobj";
    public static final String FIELD_UTILPARAM = "UTILPARAM";
    protected static final String DTOFIELD_UTILPARAM = "utilparam";
    public static final String FIELD_UTILPARAM10 = "UTILPARAM10";
    protected static final String DTOFIELD_UTILPARAM10 = "utilparam10";
    public static final String FIELD_UTILPARAM11 = "UTILPARAM11";
    protected static final String DTOFIELD_UTILPARAM11 = "utilparam11";
    public static final String FIELD_UTILPARAM12 = "UTILPARAM12";
    protected static final String DTOFIELD_UTILPARAM12 = "utilparam12";
    public static final String FIELD_UTILPARAM2 = "UTILPARAM2";
    protected static final String DTOFIELD_UTILPARAM2 = "utilparam2";
    public static final String FIELD_UTILPARAM3 = "UTILPARAM3";
    protected static final String DTOFIELD_UTILPARAM3 = "utilparam3";
    public static final String FIELD_UTILPARAM4 = "UTILPARAM4";
    protected static final String DTOFIELD_UTILPARAM4 = "utilparam4";
    public static final String FIELD_UTILPARAM5 = "UTILPARAM5";
    protected static final String DTOFIELD_UTILPARAM5 = "utilparam5";
    public static final String FIELD_UTILPARAM6 = "UTILPARAM6";
    protected static final String DTOFIELD_UTILPARAM6 = "utilparam6";
    public static final String FIELD_UTILPARAM7 = "UTILPARAM7";
    protected static final String DTOFIELD_UTILPARAM7 = "utilparam7";
    public static final String FIELD_UTILPARAM8 = "UTILPARAM8";
    protected static final String DTOFIELD_UTILPARAM8 = "utilparam8";
    public static final String FIELD_UTILPARAM9 = "UTILPARAM9";
    protected static final String DTOFIELD_UTILPARAM9 = "utilparam9";
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_UTILPSDE10ID = "UTILPSDE10ID";
    protected static final String DTOFIELD_UTILPSDE10ID = "utilpsde10id";
    public static final String FIELD_UTILPSDE10NAME = "UTILPSDE10NAME";
    protected static final String DTOFIELD_UTILPSDE10NAME = "utilpsde10name";
    public static final String FIELD_UTILPSDE11ID = "UTILPSDE11ID";
    protected static final String DTOFIELD_UTILPSDE11ID = "utilpsde11id";
    public static final String FIELD_UTILPSDE11NAME = "UTILPSDE11NAME";
    protected static final String DTOFIELD_UTILPSDE11NAME = "utilpsde11name";
    public static final String FIELD_UTILPSDE12ID = "UTILPSDE12ID";
    protected static final String DTOFIELD_UTILPSDE12ID = "utilpsde12id";
    public static final String FIELD_UTILPSDE12NAME = "UTILPSDE12NAME";
    protected static final String DTOFIELD_UTILPSDE12NAME = "utilpsde12name";
    public static final String FIELD_UTILPSDE13ID = "UTILPSDE13ID";
    protected static final String DTOFIELD_UTILPSDE13ID = "utilpsde13id";
    public static final String FIELD_UTILPSDE13NAME = "UTILPSDE13NAME";
    protected static final String DTOFIELD_UTILPSDE13NAME = "utilpsde13name";
    public static final String FIELD_UTILPSDE14ID = "UTILPSDE14ID";
    protected static final String DTOFIELD_UTILPSDE14ID = "utilpsde14id";
    public static final String FIELD_UTILPSDE14NAME = "UTILPSDE14NAME";
    protected static final String DTOFIELD_UTILPSDE14NAME = "utilpsde14name";
    public static final String FIELD_UTILPSDE15ID = "UTILPSDE15ID";
    protected static final String DTOFIELD_UTILPSDE15ID = "utilpsde15id";
    public static final String FIELD_UTILPSDE15NAME = "UTILPSDE15NAME";
    protected static final String DTOFIELD_UTILPSDE15NAME = "utilpsde15name";
    public static final String FIELD_UTILPSDE16ID = "UTILPSDE16ID";
    protected static final String DTOFIELD_UTILPSDE16ID = "utilpsde16id";
    public static final String FIELD_UTILPSDE16NAME = "UTILPSDE16NAME";
    protected static final String DTOFIELD_UTILPSDE16NAME = "utilpsde16name";
    public static final String FIELD_UTILPSDE17ID = "UTILPSDE17ID";
    protected static final String DTOFIELD_UTILPSDE17ID = "utilpsde17id";
    public static final String FIELD_UTILPSDE17NAME = "UTILPSDE17NAME";
    protected static final String DTOFIELD_UTILPSDE17NAME = "utilpsde17name";
    public static final String FIELD_UTILPSDE18ID = "UTILPSDE18ID";
    protected static final String DTOFIELD_UTILPSDE18ID = "utilpsde18id";
    public static final String FIELD_UTILPSDE18NAME = "UTILPSDE18NAME";
    protected static final String DTOFIELD_UTILPSDE18NAME = "utilpsde18name";
    public static final String FIELD_UTILPSDE19ID = "UTILPSDE19ID";
    protected static final String DTOFIELD_UTILPSDE19ID = "utilpsde19id";
    public static final String FIELD_UTILPSDE19NAME = "UTILPSDE19NAME";
    protected static final String DTOFIELD_UTILPSDE19NAME = "utilpsde19name";
    public static final String FIELD_UTILPSDE20ID = "UTILPSDE20ID";
    protected static final String DTOFIELD_UTILPSDE20ID = "utilpsde20id";
    public static final String FIELD_UTILPSDE20NAME = "UTILPSDE20NAME";
    protected static final String DTOFIELD_UTILPSDE20NAME = "utilpsde20name";
    public static final String FIELD_UTILPSDE2ID = "UTILPSDE2ID";
    protected static final String DTOFIELD_UTILPSDE2ID = "utilpsde2id";
    public static final String FIELD_UTILPSDE2NAME = "UTILPSDE2NAME";
    protected static final String DTOFIELD_UTILPSDE2NAME = "utilpsde2name";
    public static final String FIELD_UTILPSDE3ID = "UTILPSDE3ID";
    protected static final String DTOFIELD_UTILPSDE3ID = "utilpsde3id";
    public static final String FIELD_UTILPSDE3NAME = "UTILPSDE3NAME";
    protected static final String DTOFIELD_UTILPSDE3NAME = "utilpsde3name";
    public static final String FIELD_UTILPSDE4ID = "UTILPSDE4ID";
    protected static final String DTOFIELD_UTILPSDE4ID = "utilpsde4id";
    public static final String FIELD_UTILPSDE4NAME = "UTILPSDE4NAME";
    protected static final String DTOFIELD_UTILPSDE4NAME = "utilpsde4name";
    public static final String FIELD_UTILPSDE5ID = "UTILPSDE5ID";
    protected static final String DTOFIELD_UTILPSDE5ID = "utilpsde5id";
    public static final String FIELD_UTILPSDE5NAME = "UTILPSDE5NAME";
    protected static final String DTOFIELD_UTILPSDE5NAME = "utilpsde5name";
    public static final String FIELD_UTILPSDE6ID = "UTILPSDE6ID";
    protected static final String DTOFIELD_UTILPSDE6ID = "utilpsde6id";
    public static final String FIELD_UTILPSDE6NAME = "UTILPSDE6NAME";
    protected static final String DTOFIELD_UTILPSDE6NAME = "utilpsde6name";
    public static final String FIELD_UTILPSDE7ID = "UTILPSDE7ID";
    protected static final String DTOFIELD_UTILPSDE7ID = "utilpsde7id";
    public static final String FIELD_UTILPSDE7NAME = "UTILPSDE7NAME";
    protected static final String DTOFIELD_UTILPSDE7NAME = "utilpsde7name";
    public static final String FIELD_UTILPSDE8ID = "UTILPSDE8ID";
    protected static final String DTOFIELD_UTILPSDE8ID = "utilpsde8id";
    public static final String FIELD_UTILPSDE8NAME = "UTILPSDE8NAME";
    protected static final String DTOFIELD_UTILPSDE8NAME = "utilpsde8name";
    public static final String FIELD_UTILPSDE9ID = "UTILPSDE9ID";
    protected static final String DTOFIELD_UTILPSDE9ID = "utilpsde9id";
    public static final String FIELD_UTILPSDE9NAME = "UTILPSDE9NAME";
    protected static final String DTOFIELD_UTILPSDE9NAME = "utilpsde9name";
    public static final String FIELD_UTILPSDEID = "UTILPSDEID";
    protected static final String DTOFIELD_UTILPSDEID = "utilpsdeid";
    public static final String FIELD_UTILPSDENAME = "UTILPSDENAME";
    protected static final String DTOFIELD_UTILPSDENAME = "utilpsdename";
    public static final String FIELD_UTILTAG = "UTILTAG";
    protected static final String DTOFIELD_UTILTAG = "utiltag";
    public static final String FIELD_UTILTAG2 = "UTILTAG2";
    protected static final String DTOFIELD_UTILTAG2 = "utiltag2";
    public static final String FIELD_UTILTYPE = "UTILTYPE";
    protected static final String DTOFIELD_UTILTYPE = "utiltype";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="authaccesstokenuri")
    public void setAuthAccessTokenUri(String authAccessTokenUri) {
        this._set(DTOFIELD_AUTHACCESSTOKENURI, authAccessTokenUri);
    }

    @JsonIgnore
    public String getAuthAccessTokenUri() {
        Object objValue = this._get(DTOFIELD_AUTHACCESSTOKENURI);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authaccesstokenuri(String authAccessTokenUri) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authclientid(String authClientId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authclientsecret(String authClientSecret) {
        this.setAuthClientSecret(authClientSecret);
        return this;
    }

    @JsonProperty(value="authmode")
    public void setAuthMode(String authMode) {
        this._set(DTOFIELD_AUTHMODE, authMode);
    }

    @JsonIgnore
    public String getAuthMode() {
        Object objValue = this._get(DTOFIELD_AUTHMODE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO authmode(PSModelEnums.APIAuthMode authMode) {
        if (authMode == null) {
            this.setAuthMode(null);
        } else {
            this.setAuthMode(authMode.value);
        }
        return this;
    }

    @JsonProperty(value="authparam")
    public void setAuthParam(String authParam) {
        this._set(DTOFIELD_AUTHPARAM, authParam);
    }

    @JsonIgnore
    public String getAuthParam() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authparam(String authParam) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO authparam2(String authParam2) {
        this.setAuthParam2(authParam2);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO codename(String codeName) {
        this.setCodeName(codeName);
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO createdate(Timestamp createDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO createman(String createMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO customcode(String customCode) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="inpssysdatasyncagentid")
    public void setInPSSysDataSyncAgentId(String inPSSysDataSyncAgentId) {
        this._set(DTOFIELD_INPSSYSDATASYNCAGENTID, inPSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getInPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_INPSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_INPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetInPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_INPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSSysUtilDTO inpssysdatasyncagentid(String inPSSysDataSyncAgentId) {
        this.setInPSSysDataSyncAgentId(inPSSysDataSyncAgentId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO inpssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent) {
        if (pSSysDataSyncAgent == null) {
            this.setInPSSysDataSyncAgentId(null);
            this.setInPSSysDataSyncAgentName(null);
        } else {
            this.setInPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setInPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    @JsonProperty(value="inpssysdatasyncagentname")
    public void setInPSSysDataSyncAgentName(String inPSSysDataSyncAgentName) {
        this._set(DTOFIELD_INPSSYSDATASYNCAGENTNAME, inPSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getInPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetInPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO inpssysdatasyncagentname(String inPSSysDataSyncAgentName) {
        this.setInPSSysDataSyncAgentName(inPSSysDataSyncAgentName);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="outpssysdatasyncagentid")
    public void setOutPSSysDataSyncAgentId(String outPSSysDataSyncAgentId) {
        this._set(DTOFIELD_OUTPSSYSDATASYNCAGENTID, outPSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getOutPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetOutPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysdatasyncagentid(String outPSSysDataSyncAgentId) {
        this.setOutPSSysDataSyncAgentId(outPSSysDataSyncAgentId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent) {
        if (pSSysDataSyncAgent == null) {
            this.setOutPSSysDataSyncAgentId(null);
            this.setOutPSSysDataSyncAgentName(null);
        } else {
            this.setOutPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setOutPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    @JsonProperty(value="outpssysdatasyncagentname")
    public void setOutPSSysDataSyncAgentName(String outPSSysDataSyncAgentName) {
        this._set(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME, outPSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getOutPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetOutPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysdatasyncagentname(String outPSSysDataSyncAgentName) {
        this.setOutPSSysDataSyncAgentName(outPSSysDataSyncAgentName);
        return this;
    }

    @JsonProperty(value="outpssysresourceid")
    public void setOutPSSysResourceId(String outPSSysResourceId) {
        this._set(DTOFIELD_OUTPSSYSRESOURCEID, outPSSysResourceId);
    }

    @JsonIgnore
    public String getOutPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_OUTPSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetOutPSSysResourceId() {
        this._reset(DTOFIELD_OUTPSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysresourceid(String outPSSysResourceId) {
        this.setOutPSSysResourceId(outPSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setOutPSSysResourceId(null);
            this.setOutPSSysResourceName(null);
        } else {
            this.setOutPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setOutPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="outpssysresourcename")
    public void setOutPSSysResourceName(String outPSSysResourceName) {
        this._set(DTOFIELD_OUTPSSYSRESOURCENAME, outPSSysResourceName);
    }

    @JsonIgnore
    public String getOutPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_OUTPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetOutPSSysResourceName() {
        this._reset(DTOFIELD_OUTPSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSSysUtilDTO outpssysresourcename(String outPSSysResourceName) {
        this.setOutPSSysResourceName(outPSSysResourceName);
        return this;
    }

    @JsonProperty(value="psdegroupid")
    public void setPSDEGroupId(String pSDEGroupId) {
        this._set(DTOFIELD_PSDEGROUPID, pSDEGroupId);
    }

    @JsonIgnore
    public String getPSDEGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEGROUPID);
    }

    @JsonIgnore
    public void resetPSDEGroupId() {
        this._reset(DTOFIELD_PSDEGROUPID);
    }

    @JsonIgnore
    public PSSysUtilDTO psdegroupid(String pSDEGroupId) {
        this.setPSDEGroupId(pSDEGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO psdegroupid(PSDEGroupDTO pSDEGroup) {
        if (pSDEGroup == null) {
            this.setPSDEGroupId(null);
            this.setPSDEGroupName(null);
        } else {
            this.setPSDEGroupId(pSDEGroup.getPSDEGroupId());
            this.setPSDEGroupName(pSDEGroup.getPSDEGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdegroupname")
    public void setPSDEGroupName(String pSDEGroupName) {
        this._set(DTOFIELD_PSDEGROUPNAME, pSDEGroupName);
    }

    @JsonIgnore
    public String getPSDEGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEGroupName() {
        this._reset(DTOFIELD_PSDEGROUPNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO psdegroupname(String pSDEGroupName) {
        this.setPSDEGroupName(pSDEGroupName);
        return this;
    }

    @JsonProperty(value="psdergroupid")
    public void setPSDERGroupId(String pSDERGroupId) {
        this._set(DTOFIELD_PSDERGROUPID, pSDERGroupId);
    }

    @JsonIgnore
    public String getPSDERGroupId() {
        Object objValue = this._get(DTOFIELD_PSDERGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERGroupIdDirty() {
        return this._contains(DTOFIELD_PSDERGROUPID);
    }

    @JsonIgnore
    public void resetPSDERGroupId() {
        this._reset(DTOFIELD_PSDERGROUPID);
    }

    @JsonIgnore
    public PSSysUtilDTO psdergroupid(String pSDERGroupId) {
        this.setPSDERGroupId(pSDERGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO psdergroupid(PSDERGroupDTO pSDERGroup) {
        if (pSDERGroup == null) {
            this.setPSDERGroupId(null);
            this.setPSDERGroupName(null);
        } else {
            this.setPSDERGroupId(pSDERGroup.getPSDERGroupId());
            this.setPSDERGroupName(pSDERGroup.getPSDERGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdergroupname")
    public void setPSDERGroupName(String pSDERGroupName) {
        this._set(DTOFIELD_PSDERGROUPNAME, pSDERGroupName);
    }

    @JsonIgnore
    public String getPSDERGroupName() {
        Object objValue = this._get(DTOFIELD_PSDERGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERGroupNameDirty() {
        return this._contains(DTOFIELD_PSDERGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDERGroupName() {
        this._reset(DTOFIELD_PSDERGROUPNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO psdergroupname(String pSDERGroupName) {
        this.setPSDERGroupName(pSDERGroupName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO psmoduleid(PSModuleDTO pSModule) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO psmodulename(String pSModuleName) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
        if (pSSubSysServiceAPI == null) {
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        } else {
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysmodelgroupid")
    public void setPSSysModelGroupId(String pSSysModelGroupId) {
        this._set(DTOFIELD_PSSYSMODELGROUPID, pSSysModelGroupId);
    }

    @JsonIgnore
    public String getPSSysModelGroupId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelGroupIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELGROUPID);
    }

    @JsonIgnore
    public void resetPSSysModelGroupId() {
        this._reset(DTOFIELD_PSSYSMODELGROUPID);
    }

    @JsonIgnore
    public PSSysUtilDTO pssysmodelgroupid(String pSSysModelGroupId) {
        this.setPSSysModelGroupId(pSSysModelGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO pssysmodelgroupid(PSSysModelGroupDTO pSSysModelGroup) {
        if (pSSysModelGroup == null) {
            this.setPSSysModelGroupId(null);
            this.setPSSysModelGroupName(null);
        } else {
            this.setPSSysModelGroupId(pSSysModelGroup.getPSSysModelGroupId());
            this.setPSSysModelGroupName(pSSysModelGroup.getPSSysModelGroupName());
        }
        return this;
    }

    @JsonProperty(value="pssysmodelgroupname")
    public void setPSSysModelGroupName(String pSSysModelGroupName) {
        this._set(DTOFIELD_PSSYSMODELGROUPNAME, pSSysModelGroupName);
    }

    @JsonIgnore
    public String getPSSysModelGroupName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelGroupNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELGROUPNAME);
    }

    @JsonIgnore
    public void resetPSSysModelGroupName() {
        this._reset(DTOFIELD_PSSYSMODELGROUPNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO pssysmodelgroupname(String pSSysModelGroupName) {
        this.setPSSysModelGroupName(pSSysModelGroupName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysutilid")
    public void setPSSysUtilId(String pSSysUtilId) {
        this._set(DTOFIELD_PSSYSUTILID, pSSysUtilId);
        this._set(FIELD_PSSYSUTILID, pSSysUtilId);
    }

    @JsonIgnore
    public String getPSSysUtilId() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUTILID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilIdDirty() {
        if (this._contains(DTOFIELD_PSSYSUTILID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUTILID);
    }

    @JsonIgnore
    public void resetPSSysUtilId() {
        this._reset(DTOFIELD_PSSYSUTILID);
        this._reset(FIELD_PSSYSUTILID);
    }

    @JsonIgnore
    public PSSysUtilDTO pssysutilid(String pSSysUtilId) {
        this.setPSSysUtilId(pSSysUtilId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUtilDEId() {
        return this.getPSSysUtilId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUtilDEId(String pSSysUtilDEId) {
        this.setPSSysUtilId(pSSysUtilDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUtilDEIdDirty() {
        return this.isPSSysUtilIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUtilDEId() {
        this.resetPSSysUtilId();
    }

    @JsonProperty(value="pssysutilname")
    public void setPSSysUtilName(String pSSysUtilName) {
        this._set(DTOFIELD_PSSYSUTILNAME, pSSysUtilName);
        this._set(FIELD_PSSYSUTILNAME, pSSysUtilName);
    }

    @JsonIgnore
    public String getPSSysUtilName() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUTILNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilNameDirty() {
        if (this._contains(DTOFIELD_PSSYSUTILNAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUTILNAME);
    }

    @JsonIgnore
    public void resetPSSysUtilName() {
        this._reset(DTOFIELD_PSSYSUTILNAME);
        this._reset(FIELD_PSSYSUTILNAME);
    }

    @JsonIgnore
    public PSSysUtilDTO pssysutilname(String pSSysUtilName) {
        this.setPSSysUtilName(pSSysUtilName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUtilDEName() {
        return this.getPSSysUtilName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUtilDEName(String pSSysUtilDEName) {
        this.setPSSysUtilName(pSSysUtilDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUtilDENameDirty() {
        return this.isPSSysUtilNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUtilDEName() {
        this.resetPSSysUtilName();
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUtilName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUtilName(strName);
    }

    @JsonIgnore
    public PSSysUtilDTO name(String strName) {
        this.setPSSysUtilName(strName);
        return this;
    }

    @JsonProperty(value="serviceparam")
    public void setServiceParam(String serviceParam) {
        this._set(DTOFIELD_SERVICEPARAM, serviceParam);
    }

    @JsonIgnore
    public String getServiceParam() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAM);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO serviceparam(String serviceParam) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO serviceparam2(String serviceParam2) {
        this.setServiceParam2(serviceParam2);
        return this;
    }

    @JsonProperty(value="servicepath")
    public void setServicePath(String servicePath) {
        this._set(DTOFIELD_SERVICEPATH, servicePath);
    }

    @JsonIgnore
    public String getServicePath() {
        Object objValue = this._get(DTOFIELD_SERVICEPATH);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO servicepath(String servicePath) {
        this.setServicePath(servicePath);
        return this;
    }

    @JsonProperty(value="uniquetag")
    public void setUniqueTag(String uniqueTag) {
        this._set(DTOFIELD_UNIQUETAG, uniqueTag);
    }

    @JsonIgnore
    public String getUniqueTag() {
        Object objValue = this._get(DTOFIELD_UNIQUETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagDirty() {
        return this._contains(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public void resetUniqueTag() {
        this._reset(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public PSSysUtilDTO uniquetag(String uniqueTag) {
        this.setUniqueTag(uniqueTag);
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO updateman(String updateMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO usertag(String userTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO usertag2(String userTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO usertag3(String userTag3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="utilobj")
    public void setUtilObj(String utilObj) {
        this._set(DTOFIELD_UTILOBJ, utilObj);
    }

    @JsonIgnore
    public String getUtilObj() {
        Object objValue = this._get(DTOFIELD_UTILOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilObjDirty() {
        return this._contains(DTOFIELD_UTILOBJ);
    }

    @JsonIgnore
    public void resetUtilObj() {
        this._reset(DTOFIELD_UTILOBJ);
    }

    @JsonIgnore
    public PSSysUtilDTO utilobj(String utilObj) {
        this.setUtilObj(utilObj);
        return this;
    }

    @JsonProperty(value="utilparam")
    public void setUtilParam(String utilParam) {
        this._set(DTOFIELD_UTILPARAM, utilParam);
    }

    @JsonIgnore
    public String getUtilParam() {
        Object objValue = this._get(DTOFIELD_UTILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParamDirty() {
        return this._contains(DTOFIELD_UTILPARAM);
    }

    @JsonIgnore
    public void resetUtilParam() {
        this._reset(DTOFIELD_UTILPARAM);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam(String utilParam) {
        this.setUtilParam(utilParam);
        return this;
    }

    @JsonProperty(value="utilparam10")
    public void setUtilParam10(Integer utilParam10) {
        this._set(DTOFIELD_UTILPARAM10, utilParam10);
    }

    @JsonIgnore
    public Integer getUtilParam10() {
        Object objValue = this._get(DTOFIELD_UTILPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam10Dirty() {
        return this._contains(DTOFIELD_UTILPARAM10);
    }

    @JsonIgnore
    public void resetUtilParam10() {
        this._reset(DTOFIELD_UTILPARAM10);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam10(Integer utilParam10) {
        this.setUtilParam10(utilParam10);
        return this;
    }

    @JsonProperty(value="utilparam11")
    public void setUtilParam11(String utilParam11) {
        this._set(DTOFIELD_UTILPARAM11, utilParam11);
    }

    @JsonIgnore
    public String getUtilParam11() {
        Object objValue = this._get(DTOFIELD_UTILPARAM11);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam11Dirty() {
        return this._contains(DTOFIELD_UTILPARAM11);
    }

    @JsonIgnore
    public void resetUtilParam11() {
        this._reset(DTOFIELD_UTILPARAM11);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam11(String utilParam11) {
        this.setUtilParam11(utilParam11);
        return this;
    }

    @JsonProperty(value="utilparam12")
    public void setUtilParam12(String utilParam12) {
        this._set(DTOFIELD_UTILPARAM12, utilParam12);
    }

    @JsonIgnore
    public String getUtilParam12() {
        Object objValue = this._get(DTOFIELD_UTILPARAM12);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam12Dirty() {
        return this._contains(DTOFIELD_UTILPARAM12);
    }

    @JsonIgnore
    public void resetUtilParam12() {
        this._reset(DTOFIELD_UTILPARAM12);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam12(String utilParam12) {
        this.setUtilParam12(utilParam12);
        return this;
    }

    @JsonProperty(value="utilparam2")
    public void setUtilParam2(String utilParam2) {
        this._set(DTOFIELD_UTILPARAM2, utilParam2);
    }

    @JsonIgnore
    public String getUtilParam2() {
        Object objValue = this._get(DTOFIELD_UTILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam2Dirty() {
        return this._contains(DTOFIELD_UTILPARAM2);
    }

    @JsonIgnore
    public void resetUtilParam2() {
        this._reset(DTOFIELD_UTILPARAM2);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam2(String utilParam2) {
        this.setUtilParam2(utilParam2);
        return this;
    }

    @JsonProperty(value="utilparam3")
    public void setUtilParam3(String utilParam3) {
        this._set(DTOFIELD_UTILPARAM3, utilParam3);
    }

    @JsonIgnore
    public String getUtilParam3() {
        Object objValue = this._get(DTOFIELD_UTILPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam3Dirty() {
        return this._contains(DTOFIELD_UTILPARAM3);
    }

    @JsonIgnore
    public void resetUtilParam3() {
        this._reset(DTOFIELD_UTILPARAM3);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam3(String utilParam3) {
        this.setUtilParam3(utilParam3);
        return this;
    }

    @JsonProperty(value="utilparam4")
    public void setUtilParam4(String utilParam4) {
        this._set(DTOFIELD_UTILPARAM4, utilParam4);
    }

    @JsonIgnore
    public String getUtilParam4() {
        Object objValue = this._get(DTOFIELD_UTILPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam4Dirty() {
        return this._contains(DTOFIELD_UTILPARAM4);
    }

    @JsonIgnore
    public void resetUtilParam4() {
        this._reset(DTOFIELD_UTILPARAM4);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam4(String utilParam4) {
        this.setUtilParam4(utilParam4);
        return this;
    }

    @JsonProperty(value="utilparam5")
    public void setUtilParam5(Integer utilParam5) {
        this._set(DTOFIELD_UTILPARAM5, utilParam5);
    }

    @JsonIgnore
    public Integer getUtilParam5() {
        Object objValue = this._get(DTOFIELD_UTILPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam5Dirty() {
        return this._contains(DTOFIELD_UTILPARAM5);
    }

    @JsonIgnore
    public void resetUtilParam5() {
        this._reset(DTOFIELD_UTILPARAM5);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam5(Integer utilParam5) {
        this.setUtilParam5(utilParam5);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam5(Boolean utilParam5) {
        if (utilParam5 == null) {
            this.setUtilParam5(null);
        } else {
            this.setUtilParam5(utilParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="utilparam6")
    public void setUtilParam6(Integer utilParam6) {
        this._set(DTOFIELD_UTILPARAM6, utilParam6);
    }

    @JsonIgnore
    public Integer getUtilParam6() {
        Object objValue = this._get(DTOFIELD_UTILPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam6Dirty() {
        return this._contains(DTOFIELD_UTILPARAM6);
    }

    @JsonIgnore
    public void resetUtilParam6() {
        this._reset(DTOFIELD_UTILPARAM6);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam6(Integer utilParam6) {
        this.setUtilParam6(utilParam6);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam6(Boolean utilParam6) {
        if (utilParam6 == null) {
            this.setUtilParam6(null);
        } else {
            this.setUtilParam6(utilParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="utilparam7")
    public void setUtilParam7(Integer utilParam7) {
        this._set(DTOFIELD_UTILPARAM7, utilParam7);
    }

    @JsonIgnore
    public Integer getUtilParam7() {
        Object objValue = this._get(DTOFIELD_UTILPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam7Dirty() {
        return this._contains(DTOFIELD_UTILPARAM7);
    }

    @JsonIgnore
    public void resetUtilParam7() {
        this._reset(DTOFIELD_UTILPARAM7);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam7(Integer utilParam7) {
        this.setUtilParam7(utilParam7);
        return this;
    }

    @JsonProperty(value="utilparam8")
    public void setUtilParam8(Integer utilParam8) {
        this._set(DTOFIELD_UTILPARAM8, utilParam8);
    }

    @JsonIgnore
    public Integer getUtilParam8() {
        Object objValue = this._get(DTOFIELD_UTILPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam8Dirty() {
        return this._contains(DTOFIELD_UTILPARAM8);
    }

    @JsonIgnore
    public void resetUtilParam8() {
        this._reset(DTOFIELD_UTILPARAM8);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam8(Integer utilParam8) {
        this.setUtilParam8(utilParam8);
        return this;
    }

    @JsonProperty(value="utilparam9")
    public void setUtilParam9(Integer utilParam9) {
        this._set(DTOFIELD_UTILPARAM9, utilParam9);
    }

    @JsonIgnore
    public Integer getUtilParam9() {
        Object objValue = this._get(DTOFIELD_UTILPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam9Dirty() {
        return this._contains(DTOFIELD_UTILPARAM9);
    }

    @JsonIgnore
    public void resetUtilParam9() {
        this._reset(DTOFIELD_UTILPARAM9);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparam9(Integer utilParam9) {
        this.setUtilParam9(utilParam9);
        return this;
    }

    @JsonProperty(value="utilparams")
    public void setUtilParams(String utilParams) {
        this._set(DTOFIELD_UTILPARAMS, utilParams);
    }

    @JsonIgnore
    public String getUtilParams() {
        Object objValue = this._get(DTOFIELD_UTILPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParamsDirty() {
        return this._contains(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public void resetUtilParams() {
        this._reset(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public PSSysUtilDTO utilparams(String utilParams) {
        this.setUtilParams(utilParams);
        return this;
    }

    @JsonProperty(value="utilpsde10id")
    public void setUtilPSDE10Id(String utilPSDE10Id) {
        this._set(DTOFIELD_UTILPSDE10ID, utilPSDE10Id);
    }

    @JsonIgnore
    public String getUtilPSDE10Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE10ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE10IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE10ID);
    }

    @JsonIgnore
    public void resetUtilPSDE10Id() {
        this._reset(DTOFIELD_UTILPSDE10ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde10id(String utilPSDE10Id) {
        this.setUtilPSDE10Id(utilPSDE10Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde10id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE10Id(null);
            this.setUtilPSDE10Name(null);
        } else {
            this.setUtilPSDE10Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE10Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde10name")
    public void setUtilPSDE10Name(String utilPSDE10Name) {
        this._set(DTOFIELD_UTILPSDE10NAME, utilPSDE10Name);
    }

    @JsonIgnore
    public String getUtilPSDE10Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE10NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE10NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE10NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE10Name() {
        this._reset(DTOFIELD_UTILPSDE10NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde10name(String utilPSDE10Name) {
        this.setUtilPSDE10Name(utilPSDE10Name);
        return this;
    }

    @JsonProperty(value="utilpsde11id")
    public void setUtilPSDE11Id(String utilPSDE11Id) {
        this._set(DTOFIELD_UTILPSDE11ID, utilPSDE11Id);
    }

    @JsonIgnore
    public String getUtilPSDE11Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE11ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE11IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE11ID);
    }

    @JsonIgnore
    public void resetUtilPSDE11Id() {
        this._reset(DTOFIELD_UTILPSDE11ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde11id(String utilPSDE11Id) {
        this.setUtilPSDE11Id(utilPSDE11Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde11id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE11Id(null);
            this.setUtilPSDE11Name(null);
        } else {
            this.setUtilPSDE11Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE11Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde11name")
    public void setUtilPSDE11Name(String utilPSDE11Name) {
        this._set(DTOFIELD_UTILPSDE11NAME, utilPSDE11Name);
    }

    @JsonIgnore
    public String getUtilPSDE11Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE11NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE11NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE11NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE11Name() {
        this._reset(DTOFIELD_UTILPSDE11NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde11name(String utilPSDE11Name) {
        this.setUtilPSDE11Name(utilPSDE11Name);
        return this;
    }

    @JsonProperty(value="utilpsde12id")
    public void setUtilPSDE12Id(String utilPSDE12Id) {
        this._set(DTOFIELD_UTILPSDE12ID, utilPSDE12Id);
    }

    @JsonIgnore
    public String getUtilPSDE12Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE12ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE12IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE12ID);
    }

    @JsonIgnore
    public void resetUtilPSDE12Id() {
        this._reset(DTOFIELD_UTILPSDE12ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde12id(String utilPSDE12Id) {
        this.setUtilPSDE12Id(utilPSDE12Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde12id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE12Id(null);
            this.setUtilPSDE12Name(null);
        } else {
            this.setUtilPSDE12Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE12Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde12name")
    public void setUtilPSDE12Name(String utilPSDE12Name) {
        this._set(DTOFIELD_UTILPSDE12NAME, utilPSDE12Name);
    }

    @JsonIgnore
    public String getUtilPSDE12Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE12NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE12NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE12NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE12Name() {
        this._reset(DTOFIELD_UTILPSDE12NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde12name(String utilPSDE12Name) {
        this.setUtilPSDE12Name(utilPSDE12Name);
        return this;
    }

    @JsonProperty(value="utilpsde13id")
    public void setUtilPSDE13Id(String utilPSDE13Id) {
        this._set(DTOFIELD_UTILPSDE13ID, utilPSDE13Id);
    }

    @JsonIgnore
    public String getUtilPSDE13Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE13ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE13IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE13ID);
    }

    @JsonIgnore
    public void resetUtilPSDE13Id() {
        this._reset(DTOFIELD_UTILPSDE13ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde13id(String utilPSDE13Id) {
        this.setUtilPSDE13Id(utilPSDE13Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde13id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE13Id(null);
            this.setUtilPSDE13Name(null);
        } else {
            this.setUtilPSDE13Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE13Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde13name")
    public void setUtilPSDE13Name(String utilPSDE13Name) {
        this._set(DTOFIELD_UTILPSDE13NAME, utilPSDE13Name);
    }

    @JsonIgnore
    public String getUtilPSDE13Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE13NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE13NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE13NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE13Name() {
        this._reset(DTOFIELD_UTILPSDE13NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde13name(String utilPSDE13Name) {
        this.setUtilPSDE13Name(utilPSDE13Name);
        return this;
    }

    @JsonProperty(value="utilpsde14id")
    public void setUtilPSDE14Id(String utilPSDE14Id) {
        this._set(DTOFIELD_UTILPSDE14ID, utilPSDE14Id);
    }

    @JsonIgnore
    public String getUtilPSDE14Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE14ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE14IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE14ID);
    }

    @JsonIgnore
    public void resetUtilPSDE14Id() {
        this._reset(DTOFIELD_UTILPSDE14ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde14id(String utilPSDE14Id) {
        this.setUtilPSDE14Id(utilPSDE14Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde14id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE14Id(null);
            this.setUtilPSDE14Name(null);
        } else {
            this.setUtilPSDE14Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE14Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde14name")
    public void setUtilPSDE14Name(String utilPSDE14Name) {
        this._set(DTOFIELD_UTILPSDE14NAME, utilPSDE14Name);
    }

    @JsonIgnore
    public String getUtilPSDE14Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE14NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE14NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE14NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE14Name() {
        this._reset(DTOFIELD_UTILPSDE14NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde14name(String utilPSDE14Name) {
        this.setUtilPSDE14Name(utilPSDE14Name);
        return this;
    }

    @JsonProperty(value="utilpsde15id")
    public void setUtilPSDE15Id(String utilPSDE15Id) {
        this._set(DTOFIELD_UTILPSDE15ID, utilPSDE15Id);
    }

    @JsonIgnore
    public String getUtilPSDE15Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE15ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE15IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE15ID);
    }

    @JsonIgnore
    public void resetUtilPSDE15Id() {
        this._reset(DTOFIELD_UTILPSDE15ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde15id(String utilPSDE15Id) {
        this.setUtilPSDE15Id(utilPSDE15Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde15id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE15Id(null);
            this.setUtilPSDE15Name(null);
        } else {
            this.setUtilPSDE15Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE15Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde15name")
    public void setUtilPSDE15Name(String utilPSDE15Name) {
        this._set(DTOFIELD_UTILPSDE15NAME, utilPSDE15Name);
    }

    @JsonIgnore
    public String getUtilPSDE15Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE15NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE15NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE15NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE15Name() {
        this._reset(DTOFIELD_UTILPSDE15NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde15name(String utilPSDE15Name) {
        this.setUtilPSDE15Name(utilPSDE15Name);
        return this;
    }

    @JsonProperty(value="utilpsde16id")
    public void setUtilPSDE16Id(String utilPSDE16Id) {
        this._set(DTOFIELD_UTILPSDE16ID, utilPSDE16Id);
    }

    @JsonIgnore
    public String getUtilPSDE16Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE16ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE16IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE16ID);
    }

    @JsonIgnore
    public void resetUtilPSDE16Id() {
        this._reset(DTOFIELD_UTILPSDE16ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde16id(String utilPSDE16Id) {
        this.setUtilPSDE16Id(utilPSDE16Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde16id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE16Id(null);
            this.setUtilPSDE16Name(null);
        } else {
            this.setUtilPSDE16Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE16Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde16name")
    public void setUtilPSDE16Name(String utilPSDE16Name) {
        this._set(DTOFIELD_UTILPSDE16NAME, utilPSDE16Name);
    }

    @JsonIgnore
    public String getUtilPSDE16Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE16NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE16NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE16NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE16Name() {
        this._reset(DTOFIELD_UTILPSDE16NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde16name(String utilPSDE16Name) {
        this.setUtilPSDE16Name(utilPSDE16Name);
        return this;
    }

    @JsonProperty(value="utilpsde17id")
    public void setUtilPSDE17Id(String utilPSDE17Id) {
        this._set(DTOFIELD_UTILPSDE17ID, utilPSDE17Id);
    }

    @JsonIgnore
    public String getUtilPSDE17Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE17ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE17IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE17ID);
    }

    @JsonIgnore
    public void resetUtilPSDE17Id() {
        this._reset(DTOFIELD_UTILPSDE17ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde17id(String utilPSDE17Id) {
        this.setUtilPSDE17Id(utilPSDE17Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde17id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE17Id(null);
            this.setUtilPSDE17Name(null);
        } else {
            this.setUtilPSDE17Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE17Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde17name")
    public void setUtilPSDE17Name(String utilPSDE17Name) {
        this._set(DTOFIELD_UTILPSDE17NAME, utilPSDE17Name);
    }

    @JsonIgnore
    public String getUtilPSDE17Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE17NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE17NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE17NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE17Name() {
        this._reset(DTOFIELD_UTILPSDE17NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde17name(String utilPSDE17Name) {
        this.setUtilPSDE17Name(utilPSDE17Name);
        return this;
    }

    @JsonProperty(value="utilpsde18id")
    public void setUtilPSDE18Id(String utilPSDE18Id) {
        this._set(DTOFIELD_UTILPSDE18ID, utilPSDE18Id);
    }

    @JsonIgnore
    public String getUtilPSDE18Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE18ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE18IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE18ID);
    }

    @JsonIgnore
    public void resetUtilPSDE18Id() {
        this._reset(DTOFIELD_UTILPSDE18ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde18id(String utilPSDE18Id) {
        this.setUtilPSDE18Id(utilPSDE18Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde18id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE18Id(null);
            this.setUtilPSDE18Name(null);
        } else {
            this.setUtilPSDE18Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE18Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde18name")
    public void setUtilPSDE18Name(String utilPSDE18Name) {
        this._set(DTOFIELD_UTILPSDE18NAME, utilPSDE18Name);
    }

    @JsonIgnore
    public String getUtilPSDE18Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE18NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE18NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE18NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE18Name() {
        this._reset(DTOFIELD_UTILPSDE18NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde18name(String utilPSDE18Name) {
        this.setUtilPSDE18Name(utilPSDE18Name);
        return this;
    }

    @JsonProperty(value="utilpsde19id")
    public void setUtilPSDE19Id(String utilPSDE19Id) {
        this._set(DTOFIELD_UTILPSDE19ID, utilPSDE19Id);
    }

    @JsonIgnore
    public String getUtilPSDE19Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE19ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE19IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE19ID);
    }

    @JsonIgnore
    public void resetUtilPSDE19Id() {
        this._reset(DTOFIELD_UTILPSDE19ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde19id(String utilPSDE19Id) {
        this.setUtilPSDE19Id(utilPSDE19Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde19id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE19Id(null);
            this.setUtilPSDE19Name(null);
        } else {
            this.setUtilPSDE19Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE19Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde19name")
    public void setUtilPSDE19Name(String utilPSDE19Name) {
        this._set(DTOFIELD_UTILPSDE19NAME, utilPSDE19Name);
    }

    @JsonIgnore
    public String getUtilPSDE19Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE19NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE19NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE19NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE19Name() {
        this._reset(DTOFIELD_UTILPSDE19NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde19name(String utilPSDE19Name) {
        this.setUtilPSDE19Name(utilPSDE19Name);
        return this;
    }

    @JsonProperty(value="utilpsde20id")
    public void setUtilPSDE20Id(String utilPSDE20Id) {
        this._set(DTOFIELD_UTILPSDE20ID, utilPSDE20Id);
    }

    @JsonIgnore
    public String getUtilPSDE20Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE20ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE20IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE20ID);
    }

    @JsonIgnore
    public void resetUtilPSDE20Id() {
        this._reset(DTOFIELD_UTILPSDE20ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde20id(String utilPSDE20Id) {
        this.setUtilPSDE20Id(utilPSDE20Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde20id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE20Id(null);
            this.setUtilPSDE20Name(null);
        } else {
            this.setUtilPSDE20Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE20Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde20name")
    public void setUtilPSDE20Name(String utilPSDE20Name) {
        this._set(DTOFIELD_UTILPSDE20NAME, utilPSDE20Name);
    }

    @JsonIgnore
    public String getUtilPSDE20Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE20NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE20NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE20NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE20Name() {
        this._reset(DTOFIELD_UTILPSDE20NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde20name(String utilPSDE20Name) {
        this.setUtilPSDE20Name(utilPSDE20Name);
        return this;
    }

    @JsonProperty(value="utilpsde2id")
    public void setUtilPSDE2Id(String utilPSDE2Id) {
        this._set(DTOFIELD_UTILPSDE2ID, utilPSDE2Id);
    }

    @JsonIgnore
    public String getUtilPSDE2Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE2ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE2IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE2ID);
    }

    @JsonIgnore
    public void resetUtilPSDE2Id() {
        this._reset(DTOFIELD_UTILPSDE2ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde2id(String utilPSDE2Id) {
        this.setUtilPSDE2Id(utilPSDE2Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde2id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE2Id(null);
            this.setUtilPSDE2Name(null);
        } else {
            this.setUtilPSDE2Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE2Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde2name")
    public void setUtilPSDE2Name(String utilPSDE2Name) {
        this._set(DTOFIELD_UTILPSDE2NAME, utilPSDE2Name);
    }

    @JsonIgnore
    public String getUtilPSDE2Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE2NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE2NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE2NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE2Name() {
        this._reset(DTOFIELD_UTILPSDE2NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde2name(String utilPSDE2Name) {
        this.setUtilPSDE2Name(utilPSDE2Name);
        return this;
    }

    @JsonProperty(value="utilpsde3id")
    public void setUtilPSDE3Id(String utilPSDE3Id) {
        this._set(DTOFIELD_UTILPSDE3ID, utilPSDE3Id);
    }

    @JsonIgnore
    public String getUtilPSDE3Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE3ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE3IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE3ID);
    }

    @JsonIgnore
    public void resetUtilPSDE3Id() {
        this._reset(DTOFIELD_UTILPSDE3ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde3id(String utilPSDE3Id) {
        this.setUtilPSDE3Id(utilPSDE3Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde3id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE3Id(null);
            this.setUtilPSDE3Name(null);
        } else {
            this.setUtilPSDE3Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE3Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde3name")
    public void setUtilPSDE3Name(String utilPSDE3Name) {
        this._set(DTOFIELD_UTILPSDE3NAME, utilPSDE3Name);
    }

    @JsonIgnore
    public String getUtilPSDE3Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE3NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE3NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE3NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE3Name() {
        this._reset(DTOFIELD_UTILPSDE3NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde3name(String utilPSDE3Name) {
        this.setUtilPSDE3Name(utilPSDE3Name);
        return this;
    }

    @JsonProperty(value="utilpsde4id")
    public void setUtilPSDE4Id(String utilPSDE4Id) {
        this._set(DTOFIELD_UTILPSDE4ID, utilPSDE4Id);
    }

    @JsonIgnore
    public String getUtilPSDE4Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE4ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE4IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE4ID);
    }

    @JsonIgnore
    public void resetUtilPSDE4Id() {
        this._reset(DTOFIELD_UTILPSDE4ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde4id(String utilPSDE4Id) {
        this.setUtilPSDE4Id(utilPSDE4Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde4id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE4Id(null);
            this.setUtilPSDE4Name(null);
        } else {
            this.setUtilPSDE4Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE4Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde4name")
    public void setUtilPSDE4Name(String utilPSDE4Name) {
        this._set(DTOFIELD_UTILPSDE4NAME, utilPSDE4Name);
    }

    @JsonIgnore
    public String getUtilPSDE4Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE4NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE4NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE4NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE4Name() {
        this._reset(DTOFIELD_UTILPSDE4NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde4name(String utilPSDE4Name) {
        this.setUtilPSDE4Name(utilPSDE4Name);
        return this;
    }

    @JsonProperty(value="utilpsde5id")
    public void setUtilPSDE5Id(String utilPSDE5Id) {
        this._set(DTOFIELD_UTILPSDE5ID, utilPSDE5Id);
    }

    @JsonIgnore
    public String getUtilPSDE5Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE5ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE5IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE5ID);
    }

    @JsonIgnore
    public void resetUtilPSDE5Id() {
        this._reset(DTOFIELD_UTILPSDE5ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde5id(String utilPSDE5Id) {
        this.setUtilPSDE5Id(utilPSDE5Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde5id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE5Id(null);
            this.setUtilPSDE5Name(null);
        } else {
            this.setUtilPSDE5Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE5Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde5name")
    public void setUtilPSDE5Name(String utilPSDE5Name) {
        this._set(DTOFIELD_UTILPSDE5NAME, utilPSDE5Name);
    }

    @JsonIgnore
    public String getUtilPSDE5Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE5NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE5NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE5NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE5Name() {
        this._reset(DTOFIELD_UTILPSDE5NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde5name(String utilPSDE5Name) {
        this.setUtilPSDE5Name(utilPSDE5Name);
        return this;
    }

    @JsonProperty(value="utilpsde6id")
    public void setUtilPSDE6Id(String utilPSDE6Id) {
        this._set(DTOFIELD_UTILPSDE6ID, utilPSDE6Id);
    }

    @JsonIgnore
    public String getUtilPSDE6Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE6ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE6IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE6ID);
    }

    @JsonIgnore
    public void resetUtilPSDE6Id() {
        this._reset(DTOFIELD_UTILPSDE6ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde6id(String utilPSDE6Id) {
        this.setUtilPSDE6Id(utilPSDE6Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde6id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE6Id(null);
            this.setUtilPSDE6Name(null);
        } else {
            this.setUtilPSDE6Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE6Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde6name")
    public void setUtilPSDE6Name(String utilPSDE6Name) {
        this._set(DTOFIELD_UTILPSDE6NAME, utilPSDE6Name);
    }

    @JsonIgnore
    public String getUtilPSDE6Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE6NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE6NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE6NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE6Name() {
        this._reset(DTOFIELD_UTILPSDE6NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde6name(String utilPSDE6Name) {
        this.setUtilPSDE6Name(utilPSDE6Name);
        return this;
    }

    @JsonProperty(value="utilpsde7id")
    public void setUtilPSDE7Id(String utilPSDE7Id) {
        this._set(DTOFIELD_UTILPSDE7ID, utilPSDE7Id);
    }

    @JsonIgnore
    public String getUtilPSDE7Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE7ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE7IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE7ID);
    }

    @JsonIgnore
    public void resetUtilPSDE7Id() {
        this._reset(DTOFIELD_UTILPSDE7ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde7id(String utilPSDE7Id) {
        this.setUtilPSDE7Id(utilPSDE7Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde7id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE7Id(null);
            this.setUtilPSDE7Name(null);
        } else {
            this.setUtilPSDE7Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE7Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde7name")
    public void setUtilPSDE7Name(String utilPSDE7Name) {
        this._set(DTOFIELD_UTILPSDE7NAME, utilPSDE7Name);
    }

    @JsonIgnore
    public String getUtilPSDE7Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE7NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE7NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE7NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE7Name() {
        this._reset(DTOFIELD_UTILPSDE7NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde7name(String utilPSDE7Name) {
        this.setUtilPSDE7Name(utilPSDE7Name);
        return this;
    }

    @JsonProperty(value="utilpsde8id")
    public void setUtilPSDE8Id(String utilPSDE8Id) {
        this._set(DTOFIELD_UTILPSDE8ID, utilPSDE8Id);
    }

    @JsonIgnore
    public String getUtilPSDE8Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE8ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE8IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE8ID);
    }

    @JsonIgnore
    public void resetUtilPSDE8Id() {
        this._reset(DTOFIELD_UTILPSDE8ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde8id(String utilPSDE8Id) {
        this.setUtilPSDE8Id(utilPSDE8Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde8id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE8Id(null);
            this.setUtilPSDE8Name(null);
        } else {
            this.setUtilPSDE8Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE8Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde8name")
    public void setUtilPSDE8Name(String utilPSDE8Name) {
        this._set(DTOFIELD_UTILPSDE8NAME, utilPSDE8Name);
    }

    @JsonIgnore
    public String getUtilPSDE8Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE8NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE8NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE8NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE8Name() {
        this._reset(DTOFIELD_UTILPSDE8NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde8name(String utilPSDE8Name) {
        this.setUtilPSDE8Name(utilPSDE8Name);
        return this;
    }

    @JsonProperty(value="utilpsde9id")
    public void setUtilPSDE9Id(String utilPSDE9Id) {
        this._set(DTOFIELD_UTILPSDE9ID, utilPSDE9Id);
    }

    @JsonIgnore
    public String getUtilPSDE9Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE9ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE9IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE9ID);
    }

    @JsonIgnore
    public void resetUtilPSDE9Id() {
        this._reset(DTOFIELD_UTILPSDE9ID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde9id(String utilPSDE9Id) {
        this.setUtilPSDE9Id(utilPSDE9Id);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde9id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE9Id(null);
            this.setUtilPSDE9Name(null);
        } else {
            this.setUtilPSDE9Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE9Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde9name")
    public void setUtilPSDE9Name(String utilPSDE9Name) {
        this._set(DTOFIELD_UTILPSDE9NAME, utilPSDE9Name);
    }

    @JsonIgnore
    public String getUtilPSDE9Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE9NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE9NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE9NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE9Name() {
        this._reset(DTOFIELD_UTILPSDE9NAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsde9name(String utilPSDE9Name) {
        this.setUtilPSDE9Name(utilPSDE9Name);
        return this;
    }

    @JsonProperty(value="utilpsdeid")
    public void setUtilPSDEId(String utilPSDEId) {
        this._set(DTOFIELD_UTILPSDEID, utilPSDEId);
    }

    @JsonIgnore
    public String getUtilPSDEId() {
        Object objValue = this._get(DTOFIELD_UTILPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEIdDirty() {
        return this._contains(DTOFIELD_UTILPSDEID);
    }

    @JsonIgnore
    public void resetUtilPSDEId() {
        this._reset(DTOFIELD_UTILPSDEID);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsdeid(String utilPSDEId) {
        this.setUtilPSDEId(utilPSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDEId(null);
            this.setUtilPSDEName(null);
        } else {
            this.setUtilPSDEId(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsdename")
    public void setUtilPSDEName(String utilPSDEName) {
        this._set(DTOFIELD_UTILPSDENAME, utilPSDEName);
    }

    @JsonIgnore
    public String getUtilPSDEName() {
        Object objValue = this._get(DTOFIELD_UTILPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDENameDirty() {
        return this._contains(DTOFIELD_UTILPSDENAME);
    }

    @JsonIgnore
    public void resetUtilPSDEName() {
        this._reset(DTOFIELD_UTILPSDENAME);
    }

    @JsonIgnore
    public PSSysUtilDTO utilpsdename(String utilPSDEName) {
        this.setUtilPSDEName(utilPSDEName);
        return this;
    }

    @JsonProperty(value="utiltag")
    public void setUtilTag(String utilTag) {
        this._set(DTOFIELD_UTILTAG, utilTag);
    }

    @JsonIgnore
    public String getUtilTag() {
        Object objValue = this._get(DTOFIELD_UTILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTagDirty() {
        return this._contains(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public void resetUtilTag() {
        this._reset(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public PSSysUtilDTO utiltag(String utilTag) {
        this.setUtilTag(utilTag);
        return this;
    }

    @JsonProperty(value="utiltag2")
    public void setUtilTag2(String utilTag2) {
        this._set(DTOFIELD_UTILTAG2, utilTag2);
    }

    @JsonIgnore
    public String getUtilTag2() {
        Object objValue = this._get(DTOFIELD_UTILTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTag2Dirty() {
        return this._contains(DTOFIELD_UTILTAG2);
    }

    @JsonIgnore
    public void resetUtilTag2() {
        this._reset(DTOFIELD_UTILTAG2);
    }

    @JsonIgnore
    public PSSysUtilDTO utiltag2(String utilTag2) {
        this.setUtilTag2(utilTag2);
        return this;
    }

    @JsonProperty(value="utiltype")
    public void setUtilType(String utilType) {
        this._set(DTOFIELD_UTILTYPE, utilType);
    }

    @JsonIgnore
    public String getUtilType() {
        Object objValue = this._get(DTOFIELD_UTILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTypeDirty() {
        return this._contains(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public void resetUtilType() {
        this._reset(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public PSSysUtilDTO utiltype(String utilType) {
        this.setUtilType(utilType);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO utiltype(PSModelEnums.SysUtilType utilType) {
        if (utilType == null) {
            this.setUtilType(null);
        } else {
            this.setUtilType(utilType.value);
        }
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSysUtilDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUtilDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUtilId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUtilId(strValue);
    }

    @JsonIgnore
    public PSSysUtilDTO id(String strValue) {
        this.setPSSysUtilId(strValue);
        return this;
    }
}
