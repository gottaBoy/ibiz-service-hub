package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysServiceAPIDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDSchemeDTO
extends PSModelDTOBase {
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
    public static final String FIELD_BDTYPE = "BDTYPE";
    protected static final String DTOFIELD_BDTYPE = "bdtype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_ENABLESERVICEAPI = "ENABLESERVICEAPI";
    protected static final String DTOFIELD_ENABLESERVICEAPI = "enableserviceapi";
    public static final String FIELD_ENABLESUBSYSSERVICEAPI = "ENABLESUBSYSSERVICEAPI";
    protected static final String DTOFIELD_ENABLESUBSYSSERVICEAPI = "enablesubsysserviceapi";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELVER = "MODELVER";
    protected static final String DTOFIELD_MODELVER = "modelver";
    public static final String FIELD_OBJNAMECASE = "OBJNAMECASE";
    protected static final String DTOFIELD_OBJNAMECASE = "objnamecase";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDSCHEMENAME = "PSSYSBDSCHEMENAME";
    protected static final String DTOFIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSMODELGROUPID = "PSSYSMODELGROUPID";
    protected static final String DTOFIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";
    public static final String FIELD_PSSYSMODELGROUPNAME = "PSSYSMODELGROUPNAME";
    protected static final String DTOFIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_ROWKEYSEPARATOR = "ROWKEYSEPARATOR";
    protected static final String DTOFIELD_ROWKEYSEPARATOR = "rowkeyseparator";
    public static final String FIELD_SCHEMEPARAMS = "SCHEMEPARAMS";
    protected static final String DTOFIELD_SCHEMEPARAMS = "schemeparams";
    public static final String FIELD_SCHEMETAG = "SCHEMETAG";
    protected static final String DTOFIELD_SCHEMETAG = "schemetag";
    public static final String FIELD_SCHEMETAG2 = "SCHEMETAG2";
    protected static final String DTOFIELD_SCHEMETAG2 = "schemetag2";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_SERVICEPARAM = "SERVICEPARAM";
    protected static final String DTOFIELD_SERVICEPARAM = "serviceparam";
    public static final String FIELD_SERVICEPARAM2 = "SERVICEPARAM2";
    protected static final String DTOFIELD_SERVICEPARAM2 = "serviceparam2";
    public static final String FIELD_SERVICEPATH = "SERVICEPATH";
    protected static final String DTOFIELD_SERVICEPATH = "servicepath";
    public static final String FIELD_SUBSYSSERVICECODENAME = "SUBSYSSERVICECODENAME";
    protected static final String DTOFIELD_SUBSYSSERVICECODENAME = "subsysservicecodename";
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
    public PSSysBDSchemeDTO authclientid(String authClientId) {
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
    public PSSysBDSchemeDTO authclientsecret(String authClientSecret) {
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
    public PSSysBDSchemeDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO authmode(PSModelEnums.APIAuthMode authMode) {
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
    public PSSysBDSchemeDTO authparam(String authParam) {
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
    public PSSysBDSchemeDTO authparam2(String authParam2) {
        this.setAuthParam2(authParam2);
        return this;
    }

    @JsonProperty(value="bdtype")
    public void setBDType(String bDType) {
        this._set(DTOFIELD_BDTYPE, bDType);
    }

    @JsonIgnore
    public String getBDType() {
        Object objValue = this._get(DTOFIELD_BDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBDTypeDirty() {
        return this._contains(DTOFIELD_BDTYPE);
    }

    @JsonIgnore
    public void resetBDType() {
        this._reset(DTOFIELD_BDTYPE);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO bdtype(String bDType) {
        this.setBDType(bDType);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO bdtype(PSModelEnums.BDType bDType) {
        if (bDType == null) {
            this.setBDType(null);
        } else {
            this.setBDType(bDType.value);
        }
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
    public PSSysBDSchemeDTO codename(String codeName) {
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
    public PSSysBDSchemeDTO createdate(Timestamp createDate) {
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
    public PSSysBDSchemeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableserviceapi")
    public void setEnableServiceAPI(Integer enableServiceAPI) {
        this._set(DTOFIELD_ENABLESERVICEAPI, enableServiceAPI);
    }

    @JsonIgnore
    public Integer getEnableServiceAPI() {
        Object objValue = this._get(DTOFIELD_ENABLESERVICEAPI);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableServiceAPIDirty() {
        return this._contains(DTOFIELD_ENABLESERVICEAPI);
    }

    @JsonIgnore
    public void resetEnableServiceAPI() {
        this._reset(DTOFIELD_ENABLESERVICEAPI);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO enableserviceapi(Integer enableServiceAPI) {
        this.setEnableServiceAPI(enableServiceAPI);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO enableserviceapi(Boolean enableServiceAPI) {
        if (enableServiceAPI == null) {
            this.setEnableServiceAPI(null);
        } else {
            this.setEnableServiceAPI(enableServiceAPI != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesubsysserviceapi")
    public void setEnableSubSysServiceAPI(Integer enableSubSysServiceAPI) {
        this._set(DTOFIELD_ENABLESUBSYSSERVICEAPI, enableSubSysServiceAPI);
    }

    @JsonIgnore
    public Integer getEnableSubSysServiceAPI() {
        Object objValue = this._get(DTOFIELD_ENABLESUBSYSSERVICEAPI);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSubSysServiceAPIDirty() {
        return this._contains(DTOFIELD_ENABLESUBSYSSERVICEAPI);
    }

    @JsonIgnore
    public void resetEnableSubSysServiceAPI() {
        this._reset(DTOFIELD_ENABLESUBSYSSERVICEAPI);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO enablesubsysserviceapi(Integer enableSubSysServiceAPI) {
        this.setEnableSubSysServiceAPI(enableSubSysServiceAPI);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO enablesubsysserviceapi(Boolean enableSubSysServiceAPI) {
        if (enableSubSysServiceAPI == null) {
            this.setEnableSubSysServiceAPI(null);
        } else {
            this.setEnableSubSysServiceAPI(enableSubSysServiceAPI != false ? 1 : 0);
        }
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
    public PSSysBDSchemeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelver")
    public void setModelVer(Integer modelVer) {
        this._set(DTOFIELD_MODELVER, modelVer);
    }

    @JsonIgnore
    public Integer getModelVer() {
        Object objValue = this._get(DTOFIELD_MODELVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelVerDirty() {
        return this._contains(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public void resetModelVer() {
        this._reset(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO modelver(Integer modelVer) {
        this.setModelVer(modelVer);
        return this;
    }

    @JsonProperty(value="objnamecase")
    public void setObjNameCase(String objNameCase) {
        this._set(DTOFIELD_OBJNAMECASE, objNameCase);
    }

    @JsonIgnore
    public String getObjNameCase() {
        Object objValue = this._get(DTOFIELD_OBJNAMECASE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjNameCaseDirty() {
        return this._contains(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public void resetObjNameCase() {
        this._reset(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO objnamecase(String objNameCase) {
        this.setObjNameCase(objNameCase);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO objnamecase(PSModelEnums.StringCaseMode objNameCase) {
        if (objNameCase == null) {
            this.setObjNameCase(null);
        } else {
            this.setObjNameCase(objNameCase.value);
        }
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
    public PSSysBDSchemeDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysBDSchemeDTO psmodulename(String pSModuleName) {
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
    public PSSysBDSchemeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
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
    public PSSysBDSchemeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysbdschemeid")
    public void setPSSysBDSchemeId(String pSSysBDSchemeId) {
        this._set(DTOFIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }

    @JsonIgnore
    public String getPSSysBDSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeId() {
        this._reset(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonProperty(value="pssysbdschemename")
    public void setPSSysBDSchemeName(String pSSysBDSchemeName) {
        this._set(DTOFIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }

    @JsonIgnore
    public String getPSSysBDSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeName() {
        this._reset(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssysbdschemename(String pSSysBDSchemeName) {
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDSchemeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDSchemeName(strName);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO name(String strName) {
        this.setPSSysBDSchemeName(strName);
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
    public PSSysBDSchemeDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysBDSchemeDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSSysBDSchemeDTO pssysmodelgroupid(String pSSysModelGroupId) {
        this.setPSSysModelGroupId(pSSysModelGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssysmodelgroupid(PSSysModelGroupDTO pSSysModelGroup) {
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
    public PSSysBDSchemeDTO pssysmodelgroupname(String pSSysModelGroupName) {
        this.setPSSysModelGroupName(pSSysModelGroupName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysBDSchemeDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysBDSchemeDTO pssysserviceapiname(String pSSysServiceAPIName) {
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
    public PSSysBDSchemeDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysBDSchemeDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="rowkeyseparator")
    public void setRowKeySeparator(String rowKeySeparator) {
        this._set(DTOFIELD_ROWKEYSEPARATOR, rowKeySeparator);
    }

    @JsonIgnore
    public String getRowKeySeparator() {
        Object objValue = this._get(DTOFIELD_ROWKEYSEPARATOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRowKeySeparatorDirty() {
        return this._contains(DTOFIELD_ROWKEYSEPARATOR);
    }

    @JsonIgnore
    public void resetRowKeySeparator() {
        this._reset(DTOFIELD_ROWKEYSEPARATOR);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO rowkeyseparator(String rowKeySeparator) {
        this.setRowKeySeparator(rowKeySeparator);
        return this;
    }

    @JsonProperty(value="schemeparams")
    public void setSchemeParams(String schemeParams) {
        this._set(DTOFIELD_SCHEMEPARAMS, schemeParams);
    }

    @JsonIgnore
    public String getSchemeParams() {
        Object objValue = this._get(DTOFIELD_SCHEMEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSchemeParamsDirty() {
        return this._contains(DTOFIELD_SCHEMEPARAMS);
    }

    @JsonIgnore
    public void resetSchemeParams() {
        this._reset(DTOFIELD_SCHEMEPARAMS);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO schemeparams(String schemeParams) {
        this.setSchemeParams(schemeParams);
        return this;
    }

    @JsonProperty(value="schemetag")
    public void setSchemeTag(String schemeTag) {
        this._set(DTOFIELD_SCHEMETAG, schemeTag);
    }

    @JsonIgnore
    public String getSchemeTag() {
        Object objValue = this._get(DTOFIELD_SCHEMETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSchemeTagDirty() {
        return this._contains(DTOFIELD_SCHEMETAG);
    }

    @JsonIgnore
    public void resetSchemeTag() {
        this._reset(DTOFIELD_SCHEMETAG);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO schemetag(String schemeTag) {
        this.setSchemeTag(schemeTag);
        return this;
    }

    @JsonProperty(value="schemetag2")
    public void setSchemeTag2(String schemeTag2) {
        this._set(DTOFIELD_SCHEMETAG2, schemeTag2);
    }

    @JsonIgnore
    public String getSchemeTag2() {
        Object objValue = this._get(DTOFIELD_SCHEMETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSchemeTag2Dirty() {
        return this._contains(DTOFIELD_SCHEMETAG2);
    }

    @JsonIgnore
    public void resetSchemeTag2() {
        this._reset(DTOFIELD_SCHEMETAG2);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO schemetag2(String schemeTag2) {
        this.setSchemeTag2(schemeTag2);
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) {
            return null;
        }
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
    public PSSysBDSchemeDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
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
    public PSSysBDSchemeDTO serviceparam(String serviceParam) {
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
    public PSSysBDSchemeDTO serviceparam2(String serviceParam2) {
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
    public PSSysBDSchemeDTO servicepath(String servicePath) {
        this.setServicePath(servicePath);
        return this;
    }

    @JsonProperty(value="subsysservicecodename")
    public void setSubSysServiceCodeName(String subSysServiceCodeName) {
        this._set(DTOFIELD_SUBSYSSERVICECODENAME, subSysServiceCodeName);
    }

    @JsonIgnore
    public String getSubSysServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SUBSYSSERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubSysServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SUBSYSSERVICECODENAME);
    }

    @JsonIgnore
    public void resetSubSysServiceCodeName() {
        this._reset(DTOFIELD_SUBSYSSERVICECODENAME);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO subsysservicecodename(String subSysServiceCodeName) {
        this.setSubSysServiceCodeName(subSysServiceCodeName);
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
    public PSSysBDSchemeDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDSchemeDTO updateman(String updateMan) {
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
    public PSSysBDSchemeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDSchemeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDSchemeDTO usertag(String userTag) {
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
    public PSSysBDSchemeDTO usertag2(String userTag2) {
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
    public PSSysBDSchemeDTO usertag3(String userTag3) {
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
    public PSSysBDSchemeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDSchemeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDSchemeId(strValue);
    }

    @JsonIgnore
    public PSSysBDSchemeDTO id(String strValue) {
        this.setPSSysBDSchemeId(strValue);
        return this;
    }
}
