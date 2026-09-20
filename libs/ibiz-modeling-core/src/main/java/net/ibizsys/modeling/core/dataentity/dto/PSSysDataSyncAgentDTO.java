package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDataSyncAgentDTO
extends PSModelDTOBase {
    public static final String FIELD_AGENTPARAMS = "AGENTPARAMS";
    protected static final String DTOFIELD_AGENTPARAMS = "agentparams";
    public static final String FIELD_AGENTTAG = "AGENTTAG";
    protected static final String DTOFIELD_AGENTTAG = "agenttag";
    public static final String FIELD_AGENTTAG2 = "AGENTTAG2";
    protected static final String DTOFIELD_AGENTTAG2 = "agenttag2";
    public static final String FIELD_AGENTTYPE = "AGENTTYPE";
    protected static final String DTOFIELD_AGENTTYPE = "agenttype";
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
    public static final String FIELD_GROUPID = "GROUPID";
    protected static final String DTOFIELD_GROUPID = "groupid";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSDATASYNCAGENTID = "PSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_PSSYSDATASYNCAGENTID = "pssysdatasyncagentid";
    public static final String FIELD_PSSYSDATASYNCAGENTNAME = "PSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_PSSYSDATASYNCAGENTNAME = "pssysdatasyncagentname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_RAWDATAMODE = "RAWDATAMODE";
    protected static final String DTOFIELD_RAWDATAMODE = "rawdatamode";
    public static final String FIELD_SERVICEPARAM = "SERVICEPARAM";
    protected static final String DTOFIELD_SERVICEPARAM = "serviceparam";
    public static final String FIELD_SERVICEPARAM2 = "SERVICEPARAM2";
    protected static final String DTOFIELD_SERVICEPARAM2 = "serviceparam2";
    public static final String FIELD_SERVICEPATH = "SERVICEPATH";
    protected static final String DTOFIELD_SERVICEPATH = "servicepath";
    public static final String FIELD_SYNCDIR = "SYNCDIR";
    protected static final String DTOFIELD_SYNCDIR = "syncdir";
    public static final String FIELD_TOPIC = "TOPIC";
    protected static final String DTOFIELD_TOPIC = "topic";
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

    @JsonProperty(value="agentparams")
    public void setAgentParams(String agentParams) {
        this._set(DTOFIELD_AGENTPARAMS, agentParams);
    }

    @JsonIgnore
    public String getAgentParams() {
        Object objValue = this._get(DTOFIELD_AGENTPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentParamsDirty() {
        return this._contains(DTOFIELD_AGENTPARAMS);
    }

    @JsonIgnore
    public void resetAgentParams() {
        this._reset(DTOFIELD_AGENTPARAMS);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO agentparams(String agentParams) {
        this.setAgentParams(agentParams);
        return this;
    }

    @JsonProperty(value="agenttag")
    public void setAgentTag(String agentTag) {
        this._set(DTOFIELD_AGENTTAG, agentTag);
    }

    @JsonIgnore
    public String getAgentTag() {
        Object objValue = this._get(DTOFIELD_AGENTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentTagDirty() {
        return this._contains(DTOFIELD_AGENTTAG);
    }

    @JsonIgnore
    public void resetAgentTag() {
        this._reset(DTOFIELD_AGENTTAG);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO agenttag(String agentTag) {
        this.setAgentTag(agentTag);
        return this;
    }

    @JsonProperty(value="agenttag2")
    public void setAgentTag2(String agentTag2) {
        this._set(DTOFIELD_AGENTTAG2, agentTag2);
    }

    @JsonIgnore
    public String getAgentTag2() {
        Object objValue = this._get(DTOFIELD_AGENTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentTag2Dirty() {
        return this._contains(DTOFIELD_AGENTTAG2);
    }

    @JsonIgnore
    public void resetAgentTag2() {
        this._reset(DTOFIELD_AGENTTAG2);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO agenttag2(String agentTag2) {
        this.setAgentTag2(agentTag2);
        return this;
    }

    @JsonProperty(value="agenttype")
    public void setAgentType(String agentType) {
        this._set(DTOFIELD_AGENTTYPE, agentType);
    }

    @JsonIgnore
    public String getAgentType() {
        Object objValue = this._get(DTOFIELD_AGENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentTypeDirty() {
        return this._contains(DTOFIELD_AGENTTYPE);
    }

    @JsonIgnore
    public void resetAgentType() {
        this._reset(DTOFIELD_AGENTTYPE);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO agenttype(String agentType) {
        this.setAgentType(agentType);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO agenttype(PSModelEnums.DataSyncAgentType agentType) {
        if (agentType == null) {
            this.setAgentType(null);
        } else {
            this.setAgentType(agentType.value);
        }
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
    public PSSysDataSyncAgentDTO authclientid(String authClientId) {
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
    public PSSysDataSyncAgentDTO authclientsecret(String authClientSecret) {
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
    public PSSysDataSyncAgentDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO authmode(PSModelEnums.APIAuthMode authMode) {
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
    public PSSysDataSyncAgentDTO authparam(String authParam) {
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
    public PSSysDataSyncAgentDTO authparam2(String authParam2) {
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
    public PSSysDataSyncAgentDTO codename(String codeName) {
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
    public PSSysDataSyncAgentDTO createdate(Timestamp createDate) {
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
    public PSSysDataSyncAgentDTO createman(String createMan) {
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
    public PSSysDataSyncAgentDTO customcode(String customCode) {
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
    public PSSysDataSyncAgentDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="groupid")
    public void setGroupId(String groupId) {
        this._set(DTOFIELD_GROUPID, groupId);
    }

    @JsonIgnore
    public String getGroupId() {
        Object objValue = this._get(DTOFIELD_GROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupIdDirty() {
        return this._contains(DTOFIELD_GROUPID);
    }

    @JsonIgnore
    public void resetGroupId() {
        this._reset(DTOFIELD_GROUPID);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO groupid(String groupId) {
        this.setGroupId(groupId);
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
    public PSSysDataSyncAgentDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysDataSyncAgentDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysDataSyncAgentDTO psmodulename(String pSModuleName) {
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
    public PSSysDataSyncAgentDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
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
    public PSSysDataSyncAgentDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysdatasyncagentid")
    public void setPSSysDataSyncAgentId(String pSSysDataSyncAgentId) {
        this._set(DTOFIELD_PSSYSDATASYNCAGENTID, pSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_PSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO pssysdatasyncagentid(String pSSysDataSyncAgentId) {
        this.setPSSysDataSyncAgentId(pSSysDataSyncAgentId);
        return this;
    }

    @JsonProperty(value="pssysdatasyncagentname")
    public void setPSSysDataSyncAgentName(String pSSysDataSyncAgentName) {
        this._set(DTOFIELD_PSSYSDATASYNCAGENTNAME, pSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_PSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO pssysdatasyncagentname(String pSSysDataSyncAgentName) {
        this.setPSSysDataSyncAgentName(pSSysDataSyncAgentName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDataSyncAgentName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDataSyncAgentName(strName);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO name(String strName) {
        this.setPSSysDataSyncAgentName(strName);
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
    public PSSysDataSyncAgentDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysDataSyncAgentDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysDataSyncAgentDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysDataSyncAgentDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="rawdatamode")
    public void setRawDataMode(Integer rawDataMode) {
        this._set(DTOFIELD_RAWDATAMODE, rawDataMode);
    }

    @JsonIgnore
    public Integer getRawDataMode() {
        Object objValue = this._get(DTOFIELD_RAWDATAMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRawDataModeDirty() {
        return this._contains(DTOFIELD_RAWDATAMODE);
    }

    @JsonIgnore
    public void resetRawDataMode() {
        this._reset(DTOFIELD_RAWDATAMODE);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO rawdatamode(Integer rawDataMode) {
        this.setRawDataMode(rawDataMode);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO rawdatamode(Boolean rawDataMode) {
        if (rawDataMode == null) {
            this.setRawDataMode(null);
        } else {
            this.setRawDataMode(rawDataMode != false ? 1 : 0);
        }
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
    public PSSysDataSyncAgentDTO serviceparam(String serviceParam) {
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
    public PSSysDataSyncAgentDTO serviceparam2(String serviceParam2) {
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
    public PSSysDataSyncAgentDTO servicepath(String servicePath) {
        this.setServicePath(servicePath);
        return this;
    }

    @JsonProperty(value="syncdir")
    public void setSyncDir(String syncDir) {
        this._set(DTOFIELD_SYNCDIR, syncDir);
    }

    @JsonIgnore
    public String getSyncDir() {
        Object objValue = this._get(DTOFIELD_SYNCDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSyncDirDirty() {
        return this._contains(DTOFIELD_SYNCDIR);
    }

    @JsonIgnore
    public void resetSyncDir() {
        this._reset(DTOFIELD_SYNCDIR);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO syncdir(String syncDir) {
        this.setSyncDir(syncDir);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO syncdir(PSModelEnums.DataSyncAgentDir syncDir) {
        if (syncDir == null) {
            this.setSyncDir(null);
        } else {
            this.setSyncDir(syncDir.value);
        }
        return this;
    }

    @JsonProperty(value="topic")
    public void setTopic(String topic) {
        this._set(DTOFIELD_TOPIC, topic);
    }

    @JsonIgnore
    public String getTopic() {
        Object objValue = this._get(DTOFIELD_TOPIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTopicDirty() {
        return this._contains(DTOFIELD_TOPIC);
    }

    @JsonIgnore
    public void resetTopic() {
        this._reset(DTOFIELD_TOPIC);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO topic(String topic) {
        this.setTopic(topic);
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
    public PSSysDataSyncAgentDTO updatedate(Timestamp updateDate) {
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
    public PSSysDataSyncAgentDTO updateman(String updateMan) {
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
    public PSSysDataSyncAgentDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysDataSyncAgentDTO usertag(String userTag) {
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
    public PSSysDataSyncAgentDTO usertag2(String userTag2) {
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
    public PSSysDataSyncAgentDTO usertag3(String userTag3) {
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
    public PSSysDataSyncAgentDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDataSyncAgentId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDataSyncAgentId(strValue);
    }

    @JsonIgnore
    public PSSysDataSyncAgentDTO id(String strValue) {
        this.setPSSysDataSyncAgentId(strValue);
        return this;
    }
}
