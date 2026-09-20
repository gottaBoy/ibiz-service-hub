package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnMSDepAPIDTO extends PSModelDTOBase {
    public static final String FIELD_APIMODE = "APIMODE";
    protected static final String DTOFIELD_APIMODE = "apimode";
    public static final String FIELD_APITAG = "APITAG";
    protected static final String DTOFIELD_APITAG = "apitag";
    public static final String FIELD_APITAG2 = "APITAG2";
    protected static final String DTOFIELD_APITAG2 = "apitag2";
    public static final String FIELD_AUTHCHECKTOKENURI = "AUTHCHECKTOKENURI";
    protected static final String DTOFIELD_AUTHCHECKTOKENURI = "authchecktokenuri";
    public static final String FIELD_AUTHCLIENTID = "AUTHCLIENTID";
    protected static final String DTOFIELD_AUTHCLIENTID = "authclientid";
    public static final String FIELD_AUTHCLIENTSECRET = "AUTHCLIENTSECRET";
    protected static final String DTOFIELD_AUTHCLIENTSECRET = "authclientsecret";
    public static final String FIELD_AUTHMODE = "AUTHMODE";
    protected static final String DTOFIELD_AUTHMODE = "authmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEPLOYSTATE = "DEPLOYSTATE";
    protected static final String DTOFIELD_DEPLOYSTATE = "deploystate";
    public static final String FIELD_DEPLOYTAG = "DEPLOYTAG";
    protected static final String DTOFIELD_DEPLOYTAG = "deploytag";
    public static final String FIELD_DEPLOYTAG2 = "DEPLOYTAG2";
    protected static final String DTOFIELD_DEPLOYTAG2 = "deploytag2";
    public static final String FIELD_DEPLOYTAG3 = "DEPLOYTAG3";
    protected static final String DTOFIELD_DEPLOYTAG3 = "deploytag3";
    public static final String FIELD_DEPLOYTAG4 = "DEPLOYTAG4";
    protected static final String DTOFIELD_DEPLOYTAG4 = "deploytag4";
    public static final String FIELD_HTTPADDRESS = "HTTPADDRESS";
    protected static final String DTOFIELD_HTTPADDRESS = "httpaddress";
    public static final String FIELD_HTTPPORT = "HTTPPORT";
    protected static final String DTOFIELD_HTTPPORT = "httpport";
    public static final String FIELD_HTTPSPORT = "HTTPSPORT";
    protected static final String DTOFIELD_HTTPSPORT = "httpsport";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NODEIPADDR = "NODEIPADDR";
    protected static final String DTOFIELD_NODEIPADDR = "nodeipaddr";
    public static final String FIELD_NODEPORT = "NODEPORT";
    protected static final String DTOFIELD_NODEPORT = "nodeport";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNODEID = "PSDCMSPLATFORMNODEID";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";
    public static final String FIELD_PSDCMSPLATFORMNODENAME = "PSDCMSPLATFORMNODENAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";
    public static final String FIELD_PSDCREGISTRYITEMID = "PSDCREGISTRYITEMID";
    protected static final String DTOFIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";
    public static final String FIELD_PSDCREGISTRYITEMNAME = "PSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";
    public static final String FIELD_PSDEVCENTERDBINSTID = "PSDEVCENTERDBINSTID";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";
    public static final String FIELD_PSDEVCENTERDBINSTNAME = "PSDEVCENTERDBINSTNAME";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNMSDEPAPIID = "PSDEVSLNMSDEPAPIID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPIID = "psdevslnmsdepapiid";
    public static final String FIELD_PSDEVSLNMSDEPAPINAME = "PSDEVSLNMSDEPAPINAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPINAME = "psdevslnmsdepapiname";
    public static final String FIELD_PSDEVSLNMSDEPLOYID = "PSDEVSLNMSDEPLOYID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";
    public static final String FIELD_PSDEVSLNMSDEPLOYNAME = "PSDEVSLNMSDEPLOYNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
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
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSDevSlnMSDepAPIDTO apimode(Integer aPIMode) {
        this.setAPIMode(aPIMode);
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
    public PSDevSlnMSDepAPIDTO apitag(String aPITag) {
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
    public PSDevSlnMSDepAPIDTO apitag2(String aPITag2) {
        this.setAPITag2(aPITag2);
        return this;
    }

    @JsonProperty(value="authchecktokenuri")
    public void setAuthCheckTokenUri(String authCheckTokenUri) {
        this._set(DTOFIELD_AUTHCHECKTOKENURI, authCheckTokenUri);
    }

    @JsonIgnore
    public String getAuthCheckTokenUri() {
        Object objValue = this._get(DTOFIELD_AUTHCHECKTOKENURI);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthCheckTokenUriDirty() {
        return this._contains(DTOFIELD_AUTHCHECKTOKENURI);
    }

    @JsonIgnore
    public void resetAuthCheckTokenUri() {
        this._reset(DTOFIELD_AUTHCHECKTOKENURI);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authchecktokenuri(String authCheckTokenUri) {
        this.setAuthCheckTokenUri(authCheckTokenUri);
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
    public PSDevSlnMSDepAPIDTO authclientid(String authClientId) {
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
    public PSDevSlnMSDepAPIDTO authclientsecret(String authClientSecret) {
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
    public PSDevSlnMSDepAPIDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO authmode(PSModelEnums.APIAuthMode authMode) {
        this.setAuthMode(authMode == null ? null : authMode.value);
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
    public PSDevSlnMSDepAPIDTO createdate(Timestamp createDate) {
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
    public PSDevSlnMSDepAPIDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="deploystate")
    public void setDeployState(Integer deployState) {
        this._set(DTOFIELD_DEPLOYSTATE, deployState);
    }

    @JsonIgnore
    public Integer getDeployState() {
        Object objValue = this._get(DTOFIELD_DEPLOYSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDeployStateDirty() {
        return this._contains(DTOFIELD_DEPLOYSTATE);
    }

    @JsonIgnore
    public void resetDeployState() {
        this._reset(DTOFIELD_DEPLOYSTATE);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploystate(Integer deployState) {
        this.setDeployState(deployState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploystate(PSModelEnums.MSDeployItemState deployState) {
        this.setDeployState(deployState == null ? null : deployState.value);
        return this;
    }

    @JsonProperty(value="deploytag")
    public void setDeployTag(String deployTag) {
        this._set(DTOFIELD_DEPLOYTAG, deployTag);
    }

    @JsonIgnore
    public String getDeployTag() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTagDirty() {
        return this._contains(DTOFIELD_DEPLOYTAG);
    }

    @JsonIgnore
    public void resetDeployTag() {
        this._reset(DTOFIELD_DEPLOYTAG);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploytag(String deployTag) {
        this.setDeployTag(deployTag);
        return this;
    }

    @JsonProperty(value="deploytag2")
    public void setDeployTag2(String deployTag2) {
        this._set(DTOFIELD_DEPLOYTAG2, deployTag2);
    }

    @JsonIgnore
    public String getDeployTag2() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTag2Dirty() {
        return this._contains(DTOFIELD_DEPLOYTAG2);
    }

    @JsonIgnore
    public void resetDeployTag2() {
        this._reset(DTOFIELD_DEPLOYTAG2);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploytag2(String deployTag2) {
        this.setDeployTag2(deployTag2);
        return this;
    }

    @JsonProperty(value="deploytag3")
    public void setDeployTag3(String deployTag3) {
        this._set(DTOFIELD_DEPLOYTAG3, deployTag3);
    }

    @JsonIgnore
    public String getDeployTag3() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTag3Dirty() {
        return this._contains(DTOFIELD_DEPLOYTAG3);
    }

    @JsonIgnore
    public void resetDeployTag3() {
        this._reset(DTOFIELD_DEPLOYTAG3);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploytag3(String deployTag3) {
        this.setDeployTag3(deployTag3);
        return this;
    }

    @JsonProperty(value="deploytag4")
    public void setDeployTag4(String deployTag4) {
        this._set(DTOFIELD_DEPLOYTAG4, deployTag4);
    }

    @JsonIgnore
    public String getDeployTag4() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTag4Dirty() {
        return this._contains(DTOFIELD_DEPLOYTAG4);
    }

    @JsonIgnore
    public void resetDeployTag4() {
        this._reset(DTOFIELD_DEPLOYTAG4);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO deploytag4(String deployTag4) {
        this.setDeployTag4(deployTag4);
        return this;
    }

    @JsonProperty(value="httpaddress")
    public void setHttpAddress(String httpAddress) {
        this._set(DTOFIELD_HTTPADDRESS, httpAddress);
    }

    @JsonIgnore
    public String getHttpAddress() {
        Object objValue = this._get(DTOFIELD_HTTPADDRESS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHttpAddressDirty() {
        return this._contains(DTOFIELD_HTTPADDRESS);
    }

    @JsonIgnore
    public void resetHttpAddress() {
        this._reset(DTOFIELD_HTTPADDRESS);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO httpaddress(String httpAddress) {
        this.setHttpAddress(httpAddress);
        return this;
    }

    @JsonProperty(value="httpport")
    public void setHttpPort(Integer httpPort) {
        this._set(DTOFIELD_HTTPPORT, httpPort);
    }

    @JsonIgnore
    public Integer getHttpPort() {
        Object objValue = this._get(DTOFIELD_HTTPPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHttpPortDirty() {
        return this._contains(DTOFIELD_HTTPPORT);
    }

    @JsonIgnore
    public void resetHttpPort() {
        this._reset(DTOFIELD_HTTPPORT);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO httpport(Integer httpPort) {
        this.setHttpPort(httpPort);
        return this;
    }

    @JsonProperty(value="httpsport")
    public void setHttpsPort(Integer httpsPort) {
        this._set(DTOFIELD_HTTPSPORT, httpsPort);
    }

    @JsonIgnore
    public Integer getHttpsPort() {
        Object objValue = this._get(DTOFIELD_HTTPSPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHttpsPortDirty() {
        return this._contains(DTOFIELD_HTTPSPORT);
    }

    @JsonIgnore
    public void resetHttpsPort() {
        this._reset(DTOFIELD_HTTPSPORT);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO httpsport(Integer httpsPort) {
        this.setHttpsPort(httpsPort);
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
    public PSDevSlnMSDepAPIDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nodeipaddr")
    public void setNodeIPAddr(String nodeIPAddr) {
        this._set(DTOFIELD_NODEIPADDR, nodeIPAddr);
    }

    @JsonIgnore
    public String getNodeIPAddr() {
        Object objValue = this._get(DTOFIELD_NODEIPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeIPAddrDirty() {
        return this._contains(DTOFIELD_NODEIPADDR);
    }

    @JsonIgnore
    public void resetNodeIPAddr() {
        this._reset(DTOFIELD_NODEIPADDR);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO nodeipaddr(String nodeIPAddr) {
        this.setNodeIPAddr(nodeIPAddr);
        return this;
    }

    @JsonProperty(value="nodeport")
    public void setNodePort(Integer nodePort) {
        this._set(DTOFIELD_NODEPORT, nodePort);
    }

    @JsonIgnore
    public Integer getNodePort() {
        Object objValue = this._get(DTOFIELD_NODEPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNodePortDirty() {
        return this._contains(DTOFIELD_NODEPORT);
    }

    @JsonIgnore
    public void resetNodePort() {
        this._reset(DTOFIELD_NODEPORT);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO nodeport(Integer nodePort) {
        this.setNodePort(nodePort);
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
    public PSDevSlnMSDepAPIDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdcmsplatformid")
    public void setPSDCMSPlatformId(String pSDCMSPlatformId) {
        this._set(DTOFIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodeid")
    public void setPSDCMSPlatformNodeId(String pSDCMSPlatformNodeId) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODEID, pSDCMSPlatformNodeId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId) {
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcmsplatformnodeid(PSDCMSPlatformNodeDTO pSDCMSPlatformNode) {
        if (pSDCMSPlatformNode == null) {
            this.setNodeIPAddr(null);
            this.setNodePort(null);
            this.setPSDCMSPlatformNodeId(null);
            this.setPSDCMSPlatformNodeName(null);
            this.setPSDCRegistryItemId(null);
            this.setPSDCRegistryItemName(null);
        } else {
            this.setNodeIPAddr(pSDCMSPlatformNode.getIpAddr());
            this.setNodePort(pSDCMSPlatformNode.getPort());
            this.setPSDCMSPlatformNodeId(pSDCMSPlatformNode.getPSDCMSPlatformNodeId());
            this.setPSDCMSPlatformNodeName(pSDCMSPlatformNode.getPSDCMSPlatformNodeName());
            this.setPSDCRegistryItemId(pSDCMSPlatformNode.getPSDCRegistryItemId());
            this.setPSDCRegistryItemName(pSDCMSPlatformNode.getPSDCRegistryItemName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodename")
    public void setPSDCMSPlatformNodeName(String pSDCMSPlatformNodeName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODENAME, pSDCMSPlatformNodeName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName) {
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
        return this;
    }

    @JsonProperty(value="psdcregistryitemid")
    public void setPSDCRegistryItemId(String pSDCRegistryItemId) {
        this._set(DTOFIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }

    @JsonIgnore
    public String getPSDCRegistryItemId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemId() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcregistryitemid(String pSDCRegistryItemId) {
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    @JsonProperty(value="psdcregistryitemname")
    public void setPSDCRegistryItemName(String pSDCRegistryItemName) {
        this._set(DTOFIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }

    @JsonIgnore
    public String getPSDCRegistryItemName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemName() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdcregistryitemname(String pSDCRegistryItemName) {
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstid")
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstId() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevcenterdbinstid(String pSDevCenterDBInstId) {
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevcenterdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPSDevCenterDBInstId(null);
            this.setPSDevCenterDBInstName(null);
        } else {
            this.setPSDevCenterDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPSDevCenterDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstname")
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstName() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevcenterdbinstname(String pSDevCenterDBInstName) {
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
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
    public PSDevSlnMSDepAPIDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiid")
    public void setPSDevSlnMSDepAPIId(String pSDevSlnMSDepAPIId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPIID, pSDevSlnMSDepAPIId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPIIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdepapiid(String pSDevSlnMSDepAPIId) {
        this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPIId);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiname")
    public void setPSDevSlnMSDepAPIName(String pSDevSlnMSDepAPIName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPINAME, pSDevSlnMSDepAPIName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPINameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdepapiname(String pSDevSlnMSDepAPIName) {
        this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPIName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployid")
    public void setPSDevSlnMSDeployId(String pSDevSlnMSDeployId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYID, pSDevSlnMSDeployId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdeployid(String pSDevSlnMSDeployId) {
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdeployid(PSDevSlnMSDeployDTO pSDevSlnMSDeploy) {
        if (pSDevSlnMSDeploy == null) {
            this.setPSDCMSPlatformId(null);
            this.setPSDevSlnMSDeployId(null);
            this.setPSDevSlnMSDeployName(null);
        } else {
            this.setPSDCMSPlatformId(pSDevSlnMSDeploy.getPSDCMSPlatformId());
            this.setPSDevSlnMSDeployId(pSDevSlnMSDeploy.getPSDevSlnMSDeployId());
            this.setPSDevSlnMSDeployName(pSDevSlnMSDeploy.getPSDevSlnMSDeployName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployname")
    public void setPSDevSlnMSDeployName(String pSDevSlnMSDeployName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYNAME, pSDevSlnMSDeployName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnmsdeployname(String pSDevSlnMSDeployName) {
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelineid")
    public void setPSDevSlnPipelineId(String pSDevSlnPipelineId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINEID, pSDevSlnPipelineId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
        if (pSDevSlnPipeline == null) {
            this.setPSDevSlnPipelineId(null);
            this.setPSDevSlnPipelineName(null);
        } else {
            this.setPSDevSlnPipelineId(pSDevSlnPipeline.getPSDevSlnPipelineId());
            this.setPSDevSlnPipelineName(pSDevSlnPipeline.getPSDevSlnPipelineName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinename")
    public void setPSDevSlnPipelineName(String pSDevSlnPipelineName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINENAME, pSDevSlnPipelineName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
        this.setPSDevSlnPipelineName(pSDevSlnPipelineName);
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
    public PSDevSlnMSDepAPIDTO psdevslnsysapiid(String pSDevSlnSysAPIId) {
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnsysapiid(PSDevSlnSysAPIDTO pSDevSlnSysAPI) {
        if (pSDevSlnSysAPI == null) {
            this.setAPIMode(null);
            this.setAPITag(null);
            this.setAPITag2(null);
            this.setPSDevSlnSysAPIId(null);
            this.setPSDevSlnSysAPIName(null);
            this.setPSSysServiceAPIId(null);
        } else {
            this.setAPIMode(pSDevSlnSysAPI.getAPIMode());
            this.setAPITag(pSDevSlnSysAPI.getAPITag());
            this.setAPITag2(pSDevSlnSysAPI.getAPITag2());
            this.setPSDevSlnSysAPIId(pSDevSlnSysAPI.getPSDevSlnSysAPIId());
            this.setPSDevSlnSysAPIName(pSDevSlnSysAPI.getPSDevSlnSysAPIName());
            this.setPSSysServiceAPIId(pSDevSlnSysAPI.getPSSysServiceAPIId());
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
    public PSDevSlnMSDepAPIDTO psdevslnsysapiname(String pSDevSlnSysAPIName) {
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
    public PSDevSlnMSDepAPIDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
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
    public PSDevSlnMSDepAPIDTO psdevslnsysname(String pSDevSlnSysName) {
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
    public PSDevSlnMSDepAPIDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
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
    public PSDevSlnMSDepAPIDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnMSDepAPIDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDevSlnMSDepAPIDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnMSDepAPIName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnMSDepAPIName(strName);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO name(String strName) {
        this.setPSDevSlnMSDepAPIName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnMSDepAPIId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnMSDepAPIId(strValue);
    }

    @JsonIgnore
    public PSDevSlnMSDepAPIDTO id(String strValue) {
        this.setPSDevSlnMSDepAPIId(strValue);
        return this;
    }

}
