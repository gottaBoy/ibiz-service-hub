package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysAPIDTO extends PSModelDTOBase {
    public static final String FIELD_APILEVEL = "APILEVEL";
    protected static final String DTOFIELD_APILEVEL = "apilevel";
    public static final String FIELD_APIMDURL = "APIMDURL";
    protected static final String DTOFIELD_APIMDURL = "apimdurl";
    public static final String FIELD_APIMODE = "APIMODE";
    protected static final String DTOFIELD_APIMODE = "apimode";
    public static final String FIELD_APITAG = "APITAG";
    protected static final String DTOFIELD_APITAG = "apitag";
    public static final String FIELD_APITAG2 = "APITAG2";
    protected static final String DTOFIELD_APITAG2 = "apitag2";
    public static final String FIELD_APITYPE = "APITYPE";
    protected static final String DTOFIELD_APITYPE = "apitype";
    public static final String FIELD_CFGMODEL = "CFGMODEL";
    protected static final String DTOFIELD_CFGMODEL = "cfgmodel";
    public static final String FIELD_CLIENT2PSDEVSLNSYSID = "CLIENT2PSDEVSLNSYSID";
    protected static final String DTOFIELD_CLIENT2PSDEVSLNSYSID = "client2psdevslnsysid";
    public static final String FIELD_CLIENT2PSDEVSLNSYSNAME = "CLIENT2PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_CLIENT2PSDEVSLNSYSNAME = "client2psdevslnsysname";
    public static final String FIELD_CLIENTPSDEVSLNSYSID = "CLIENTPSDEVSLNSYSID";
    protected static final String DTOFIELD_CLIENTPSDEVSLNSYSID = "clientpsdevslnsysid";
    public static final String FIELD_CLIENTPSDEVSLNSYSNAME = "CLIENTPSDEVSLNSYSNAME";
    protected static final String DTOFIELD_CLIENTPSDEVSLNSYSNAME = "clientpsdevslnsysname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEVSYSSTATE = "DEVSYSSTATE";
    protected static final String DTOFIELD_DEVSYSSTATE = "devsysstate";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSAPIID = "PSDEVSLNSYSAPIID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";
    public static final String FIELD_PSDEVSLNSYSAPINAME = "PSDEVSLNSYSAPINAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VER = "VER";
    protected static final String DTOFIELD_VER = "ver";

    @JsonProperty(value="apilevel")
    public void setAPILevel(Integer aPILevel) {
        this._set(DTOFIELD_APILEVEL, aPILevel);
    }

    @JsonIgnore
    public Integer getAPILevel() {
        Object objValue = this._get(DTOFIELD_APILEVEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAPILevelDirty() {
        return this._contains(DTOFIELD_APILEVEL);
    }

    @JsonIgnore
    public void resetAPILevel() {
        this._reset(DTOFIELD_APILEVEL);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apilevel(Integer aPILevel) {
        this.setAPILevel(aPILevel);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apilevel(PSModelEnums.ServiceAPILevel aPILevel) {
        this.setAPILevel(aPILevel == null ? null : aPILevel.value);
        return this;
    }

    @JsonProperty(value="apimdurl")
    public void setAPIMDUrl(String aPIMDUrl) {
        this._set(DTOFIELD_APIMDURL, aPIMDUrl);
    }

    @JsonIgnore
    public String getAPIMDUrl() {
        Object objValue = this._get(DTOFIELD_APIMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPIMDUrlDirty() {
        return this._contains(DTOFIELD_APIMDURL);
    }

    @JsonIgnore
    public void resetAPIMDUrl() {
        this._reset(DTOFIELD_APIMDURL);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apimdurl(String aPIMDUrl) {
        this.setAPIMDUrl(aPIMDUrl);
        return this;
    }

    @JsonProperty(value="apimode")
    public void setAPIMode(Integer aPIMode) {
        this._set(DTOFIELD_APIMODE, aPIMode);
    }

    @JsonIgnore
    public Integer getAPIMode() {
        Object objValue = this._get(DTOFIELD_APIMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAPIModeDirty() {
        return this._contains(DTOFIELD_APIMODE);
    }

    @JsonIgnore
    public void resetAPIMode() {
        this._reset(DTOFIELD_APIMODE);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apimode(Integer aPIMode) {
        this.setAPIMode(aPIMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apimode(PSModelEnums.ServiceAPIMode aPIMode) {
        this.setAPIMode(aPIMode == null ? null : aPIMode.value);
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
    public PSDevSlnSysAPIDTO apitag(String aPITag) {
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
    public PSDevSlnSysAPIDTO apitag2(String aPITag2) {
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
    public PSDevSlnSysAPIDTO apitype(String aPIType) {
        this.setAPIType(aPIType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO apitype(PSModelEnums.ServiceAPIType aPIType) {
        this.setAPIType(aPIType == null ? null : aPIType.value);
        return this;
    }

    @JsonProperty(value="cfgmodel")
    public void setCfgModel(String cfgModel) {
        this._set(DTOFIELD_CFGMODEL, cfgModel);
    }

    @JsonIgnore
    public String getCfgModel() {
        Object objValue = this._get(DTOFIELD_CFGMODEL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgModelDirty() {
        return this._contains(DTOFIELD_CFGMODEL);
    }

    @JsonIgnore
    public void resetCfgModel() {
        this._reset(DTOFIELD_CFGMODEL);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO cfgmodel(String cfgModel) {
        this.setCfgModel(cfgModel);
        return this;
    }

    @JsonProperty(value="client2psdevslnsysid")
    public void setClient2PSDevSlnSysId(String client2PSDevSlnSysId) {
        this._set(DTOFIELD_CLIENT2PSDEVSLNSYSID, client2PSDevSlnSysId);
    }

    @JsonIgnore
    public String getClient2PSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_CLIENT2PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClient2PSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_CLIENT2PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetClient2PSDevSlnSysId() {
        this._reset(DTOFIELD_CLIENT2PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO client2psdevslnsysid(String client2PSDevSlnSysId) {
        this.setClient2PSDevSlnSysId(client2PSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO client2psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setClient2PSDevSlnSysId(null);
            this.setClient2PSDevSlnSysName(null);
        } else {
            this.setClient2PSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setClient2PSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="client2psdevslnsysname")
    public void setClient2PSDevSlnSysName(String client2PSDevSlnSysName) {
        this._set(DTOFIELD_CLIENT2PSDEVSLNSYSNAME, client2PSDevSlnSysName);
    }

    @JsonIgnore
    public String getClient2PSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_CLIENT2PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClient2PSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_CLIENT2PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetClient2PSDevSlnSysName() {
        this._reset(DTOFIELD_CLIENT2PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO client2psdevslnsysname(String client2PSDevSlnSysName) {
        this.setClient2PSDevSlnSysName(client2PSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="clientpsdevslnsysid")
    public void setClientPSDevSlnSysId(String clientPSDevSlnSysId) {
        this._set(DTOFIELD_CLIENTPSDEVSLNSYSID, clientPSDevSlnSysId);
    }

    @JsonIgnore
    public String getClientPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_CLIENTPSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClientPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_CLIENTPSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetClientPSDevSlnSysId() {
        this._reset(DTOFIELD_CLIENTPSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO clientpsdevslnsysid(String clientPSDevSlnSysId) {
        this.setClientPSDevSlnSysId(clientPSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO clientpsdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setClientPSDevSlnSysId(null);
            this.setClientPSDevSlnSysName(null);
        } else {
            this.setClientPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setClientPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="clientpsdevslnsysname")
    public void setClientPSDevSlnSysName(String clientPSDevSlnSysName) {
        this._set(DTOFIELD_CLIENTPSDEVSLNSYSNAME, clientPSDevSlnSysName);
    }

    @JsonIgnore
    public String getClientPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_CLIENTPSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClientPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_CLIENTPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetClientPSDevSlnSysName() {
        this._reset(DTOFIELD_CLIENTPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO clientpsdevslnsysname(String clientPSDevSlnSysName) {
        this.setClientPSDevSlnSysName(clientPSDevSlnSysName);
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
    public PSDevSlnSysAPIDTO codename(String codeName) {
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
    public PSDevSlnSysAPIDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysAPIDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="devsysstate")
    public void setDevSysState(Integer devSysState) {
        this._set(DTOFIELD_DEVSYSSTATE, devSysState);
    }

    @JsonIgnore
    public Integer getDevSysState() {
        Object objValue = this._get(DTOFIELD_DEVSYSSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDevSysStateDirty() {
        return this._contains(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public void resetDevSysState() {
        this._reset(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO devsysstate(Integer devSysState) {
        this.setDevSysState(devSysState);
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
    public PSDevSlnSysAPIDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnSysAPIDTO psdevslnsysapiid(String pSDevSlnSysAPIId) {
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
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
    public PSDevSlnSysAPIDTO psdevslnsysapiname(String pSDevSlnSysAPIName) {
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setDevSysState(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setDevSysState(pSDevSlnSys.getDevSysState());
            this.setPSDevSlnId(pSDevSlnSys.getPSDevSlnId());
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDevSlnSysAPIDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
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
    public PSDevSlnSysAPIDTO pssysserviceapiname(String pSSysServiceAPIName) {
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
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
    public PSDevSlnSysAPIDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
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
    public PSDevSlnSysAPIDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysAPIDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSDevSlnSysAPIDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO validflag(Boolean validFlag) {
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
    public PSDevSlnSysAPIDTO ver(Integer ver) {
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysAPIName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysAPIName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO name(String strName) {
        this.setPSDevSlnSysAPIName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysAPIId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysAPIId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysAPIDTO id(String strValue) {
        this.setPSDevSlnSysAPIId(strValue);
        return this;
    }

}
