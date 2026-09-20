package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCDeployCenterDTO extends PSModelDTOBase {
    public static final String FIELD_ADMINPASSWD = "ADMINPASSWD";
    protected static final String DTOFIELD_ADMINPASSWD = "adminpasswd";
    public static final String FIELD_ADMINUSERNAME = "ADMINUSERNAME";
    protected static final String DTOFIELD_ADMINUSERNAME = "adminusername";
    public static final String FIELD_APITOKEN = "APITOKEN";
    protected static final String DTOFIELD_APITOKEN = "apitoken";
    public static final String FIELD_APIURL = "APIURL";
    protected static final String DTOFIELD_APIURL = "apiurl";
    public static final String FIELD_CFGBRANCH = "CFGBRANCH";
    protected static final String DTOFIELD_CFGBRANCH = "cfgbranch";
    public static final String FIELD_CFGPSCREDENTIALID = "CFGPSCREDENTIALID";
    protected static final String DTOFIELD_CFGPSCREDENTIALID = "cfgpscredentialid";
    public static final String FIELD_CFGPSCREDENTIALNAME = "CFGPSCREDENTIALNAME";
    protected static final String DTOFIELD_CFGPSCREDENTIALNAME = "cfgpscredentialname";
    public static final String FIELD_CFGPSDEVCENTERSVNID = "CFGPSDEVCENTERSVNID";
    protected static final String DTOFIELD_CFGPSDEVCENTERSVNID = "cfgpsdevcentersvnid";
    public static final String FIELD_CFGPSDEVCENTERSVNNAME = "CFGPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_CFGPSDEVCENTERSVNNAME = "cfgpsdevcentersvnname";
    public static final String FIELD_CFGURL = "CFGURL";
    protected static final String DTOFIELD_CFGURL = "cfgurl";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DCTYPE = "DCTYPE";
    protected static final String DTOFIELD_DCTYPE = "dctype";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSCREDENTIALS = "PSCREDENTIALS";
    protected static final String DTOFIELD_PSCREDENTIALS = "pscredentials";
    public static final String FIELD_PSDCCLUSTERID = "PSDCCLUSTERID";
    protected static final String DTOFIELD_PSDCCLUSTERID = "psdcclusterid";
    public static final String FIELD_PSDCCLUSTERNAME = "PSDCCLUSTERNAME";
    protected static final String DTOFIELD_PSDCCLUSTERNAME = "psdcclustername";
    public static final String FIELD_PSDCCONTAINERSPECID = "PSDCCONTAINERSPECID";
    protected static final String DTOFIELD_PSDCCONTAINERSPECID = "psdccontainerspecid";
    public static final String FIELD_PSDCCONTAINERSPECNAME = "PSDCCONTAINERSPECNAME";
    protected static final String DTOFIELD_PSDCCONTAINERSPECNAME = "psdccontainerspecname";
    public static final String FIELD_PSDCDEPLOYCENTERID = "PSDCDEPLOYCENTERID";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERID = "psdcdeploycenterid";
    public static final String FIELD_PSDCDEPLOYCENTERNAME = "PSDCDEPLOYCENTERNAME";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERNAME = "psdcdeploycentername";
    public static final String FIELD_PSDCFILEID = "PSDCFILEID";
    protected static final String DTOFIELD_PSDCFILEID = "psdcfileid";
    public static final String FIELD_PSDCFILENAME = "PSDCFILENAME";
    protected static final String DTOFIELD_PSDCFILENAME = "psdcfilename";
    public static final String FIELD_PSDCREGISTRYREPOID = "PSDCREGISTRYREPOID";
    protected static final String DTOFIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";
    public static final String FIELD_PSDCREGISTRYREPONAME = "PSDCREGISTRYREPONAME";
    protected static final String DTOFIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";
    public static final String FIELD_PSDEPLOYCENTERID = "PSDEPLOYCENTERID";
    protected static final String DTOFIELD_PSDEPLOYCENTERID = "psdeploycenterid";
    public static final String FIELD_PSDEPLOYCENTERNAME = "PSDEPLOYCENTERNAME";
    protected static final String DTOFIELD_PSDEPLOYCENTERNAME = "psdeploycentername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSGITUSERS = "PSGITUSERS";
    protected static final String DTOFIELD_PSGITUSERS = "psgitusers";
    public static final String FIELD_REFCOUNT = "REFCOUNT";
    protected static final String DTOFIELD_REFCOUNT = "refcount";
    public static final String FIELD_RESPOS = "RESPOS";
    protected static final String DTOFIELD_RESPOS = "respos";
    public static final String FIELD_RESREADYTIME = "RESREADYTIME";
    protected static final String DTOFIELD_RESREADYTIME = "resreadytime";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_RESVER = "RESVER";
    protected static final String DTOFIELD_RESVER = "resver";
    public static final String FIELD_SSHIPADDR = "SSHIPADDR";
    protected static final String DTOFIELD_SSHIPADDR = "sshipaddr";
    public static final String FIELD_SSHPORT = "SSHPORT";
    protected static final String DTOFIELD_SSHPORT = "sshport";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPLOADFILEMODE = "UPLOADFILEMODE";
    protected static final String DTOFIELD_UPLOADFILEMODE = "uploadfilemode";
    public static final String FIELD_UPLOADPATH = "UPLOADPATH";
    protected static final String DTOFIELD_UPLOADPATH = "uploadpath";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_WEBCONSOLEPATH = "WEBCONSOLEPATH";
    protected static final String DTOFIELD_WEBCONSOLEPATH = "webconsolepath";
    public static final String FIELD_WORKSHOPPATH = "WORKSHOPPATH";
    protected static final String DTOFIELD_WORKSHOPPATH = "workshoppath";

    @JsonProperty(value="adminpasswd")
    public void setAdminPasswd(String adminPasswd) {
        this._set(DTOFIELD_ADMINPASSWD, adminPasswd);
    }

    @JsonIgnore
    public String getAdminPasswd() {
        Object objValue = this._get(DTOFIELD_ADMINPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAdminPasswdDirty() {
        return this._contains(DTOFIELD_ADMINPASSWD);
    }

    @JsonIgnore
    public void resetAdminPasswd() {
        this._reset(DTOFIELD_ADMINPASSWD);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO adminpasswd(String adminPasswd) {
        this.setAdminPasswd(adminPasswd);
        return this;
    }

    @JsonProperty(value="adminusername")
    public void setAdminUserName(String adminUserName) {
        this._set(DTOFIELD_ADMINUSERNAME, adminUserName);
    }

    @JsonIgnore
    public String getAdminUserName() {
        Object objValue = this._get(DTOFIELD_ADMINUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAdminUserNameDirty() {
        return this._contains(DTOFIELD_ADMINUSERNAME);
    }

    @JsonIgnore
    public void resetAdminUserName() {
        this._reset(DTOFIELD_ADMINUSERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO adminusername(String adminUserName) {
        this.setAdminUserName(adminUserName);
        return this;
    }

    @JsonProperty(value="apitoken")
    public void setAPIToken(String aPIToken) {
        this._set(DTOFIELD_APITOKEN, aPIToken);
    }

    @JsonIgnore
    public String getAPIToken() {
        Object objValue = this._get(DTOFIELD_APITOKEN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPITokenDirty() {
        return this._contains(DTOFIELD_APITOKEN);
    }

    @JsonIgnore
    public void resetAPIToken() {
        this._reset(DTOFIELD_APITOKEN);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO apitoken(String aPIToken) {
        this.setAPIToken(aPIToken);
        return this;
    }

    @JsonProperty(value="apiurl")
    public void setAPIUrl(String aPIUrl) {
        this._set(DTOFIELD_APIURL, aPIUrl);
    }

    @JsonIgnore
    public String getAPIUrl() {
        Object objValue = this._get(DTOFIELD_APIURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAPIUrlDirty() {
        return this._contains(DTOFIELD_APIURL);
    }

    @JsonIgnore
    public void resetAPIUrl() {
        this._reset(DTOFIELD_APIURL);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO apiurl(String aPIUrl) {
        this.setAPIUrl(aPIUrl);
        return this;
    }

    @JsonProperty(value="cfgbranch")
    public void setCfgBranch(String cfgBranch) {
        this._set(DTOFIELD_CFGBRANCH, cfgBranch);
    }

    @JsonIgnore
    public String getCfgBranch() {
        Object objValue = this._get(DTOFIELD_CFGBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgBranchDirty() {
        return this._contains(DTOFIELD_CFGBRANCH);
    }

    @JsonIgnore
    public void resetCfgBranch() {
        this._reset(DTOFIELD_CFGBRANCH);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgbranch(String cfgBranch) {
        this.setCfgBranch(cfgBranch);
        return this;
    }

    @JsonProperty(value="cfgpscredentialid")
    public void setCfgPSCredentialId(String cfgPSCredentialId) {
        this._set(DTOFIELD_CFGPSCREDENTIALID, cfgPSCredentialId);
    }

    @JsonIgnore
    public String getCfgPSCredentialId() {
        Object objValue = this._get(DTOFIELD_CFGPSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSCredentialIdDirty() {
        return this._contains(DTOFIELD_CFGPSCREDENTIALID);
    }

    @JsonIgnore
    public void resetCfgPSCredentialId() {
        this._reset(DTOFIELD_CFGPSCREDENTIALID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpscredentialid(String cfgPSCredentialId) {
        this.setCfgPSCredentialId(cfgPSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpscredentialid(PSCredentialDTO pSCredential) {
        if (pSCredential == null) {
            this.setCfgPSCredentialId(null);
            this.setCfgPSCredentialName(null);
        } else {
            this.setCfgPSCredentialId(pSCredential.getPSCredentialId());
            this.setCfgPSCredentialName(pSCredential.getPSCredentialName());
        }
        return this;
    }

    @JsonProperty(value="cfgpscredentialname")
    public void setCfgPSCredentialName(String cfgPSCredentialName) {
        this._set(DTOFIELD_CFGPSCREDENTIALNAME, cfgPSCredentialName);
    }

    @JsonIgnore
    public String getCfgPSCredentialName() {
        Object objValue = this._get(DTOFIELD_CFGPSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSCredentialNameDirty() {
        return this._contains(DTOFIELD_CFGPSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetCfgPSCredentialName() {
        this._reset(DTOFIELD_CFGPSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpscredentialname(String cfgPSCredentialName) {
        this.setCfgPSCredentialName(cfgPSCredentialName);
        return this;
    }

    @JsonProperty(value="cfgpsdevcentersvnid")
    public void setCfgPSDevCenterSVNId(String cfgPSDevCenterSVNId) {
        this._set(DTOFIELD_CFGPSDEVCENTERSVNID, cfgPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getCfgPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_CFGPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_CFGPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetCfgPSDevCenterSVNId() {
        this._reset(DTOFIELD_CFGPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpsdevcentersvnid(String cfgPSDevCenterSVNId) {
        this.setCfgPSDevCenterSVNId(cfgPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setCfgPSDevCenterSVNId(null);
            this.setCfgPSDevCenterSVNName(null);
        } else {
            this.setCfgPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setCfgPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="cfgpsdevcentersvnname")
    public void setCfgPSDevCenterSVNName(String cfgPSDevCenterSVNName) {
        this._set(DTOFIELD_CFGPSDEVCENTERSVNNAME, cfgPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getCfgPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_CFGPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_CFGPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetCfgPSDevCenterSVNName() {
        this._reset(DTOFIELD_CFGPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgpsdevcentersvnname(String cfgPSDevCenterSVNName) {
        this.setCfgPSDevCenterSVNName(cfgPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="cfgurl")
    public void setCfgUrl(String cfgUrl) {
        this._set(DTOFIELD_CFGURL, cfgUrl);
    }

    @JsonIgnore
    public String getCfgUrl() {
        Object objValue = this._get(DTOFIELD_CFGURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgUrlDirty() {
        return this._contains(DTOFIELD_CFGURL);
    }

    @JsonIgnore
    public void resetCfgUrl() {
        this._reset(DTOFIELD_CFGURL);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO cfgurl(String cfgUrl) {
        this.setCfgUrl(cfgUrl);
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
    public PSDCDeployCenterDTO createdate(Timestamp createDate) {
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
    public PSDCDeployCenterDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dctype")
    public void setDCType(String dCType) {
        this._set(DTOFIELD_DCTYPE, dCType);
    }

    @JsonIgnore
    public String getDCType() {
        Object objValue = this._get(DTOFIELD_DCTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCTypeDirty() {
        return this._contains(DTOFIELD_DCTYPE);
    }

    @JsonIgnore
    public void resetDCType() {
        this._reset(DTOFIELD_DCTYPE);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO dctype(String dCType) {
        this.setDCType(dCType);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO dctype(PSModelEnums.DeployCenterType dCType) {
        this.setDCType(dCType == null ? null : dCType.value);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) return null;
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
    public PSDCDeployCenterDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO defaultflag(Boolean defaultFlag) {
        this.setDefaultFlag(defaultFlag == null ? null : (defaultFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="expriedtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpriedTime(Timestamp expriedTime) {
        this._set(DTOFIELD_EXPRIEDTIME, expriedTime);
    }

    @JsonIgnore
    public Timestamp getExpriedTime() {
        Object objValue = this._get(DTOFIELD_EXPRIEDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpriedTimeDirty() {
        return this._contains(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public void resetExpriedTime() {
        this._reset(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="ipaddr")
    public void setIpAddr(String ipAddr) {
        this._set(DTOFIELD_IPADDR, ipAddr);
    }

    @JsonIgnore
    public String getIpAddr() {
        Object objValue = this._get(DTOFIELD_IPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddrDirty() {
        return this._contains(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public void resetIpAddr() {
        this._reset(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO ipaddr(String ipAddr) {
        this.setIpAddr(ipAddr);
        return this;
    }

    @JsonProperty(value="ipaddr2")
    public void setIpAddr2(String ipAddr2) {
        this._set(DTOFIELD_IPADDR2, ipAddr2);
    }

    @JsonIgnore
    public String getIpAddr2() {
        Object objValue = this._get(DTOFIELD_IPADDR2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddr2Dirty() {
        return this._contains(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public void resetIpAddr2() {
        this._reset(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO ipaddr2(String ipAddr2) {
        this.setIpAddr2(ipAddr2);
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
    public PSDCDeployCenterDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="passwd")
    public void setPasswd(String passwd) {
        this._set(DTOFIELD_PASSWD, passwd);
    }

    @JsonIgnore
    public String getPasswd() {
        Object objValue = this._get(DTOFIELD_PASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswdDirty() {
        return this._contains(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public void resetPasswd() {
        this._reset(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO passwd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    @JsonProperty(value="port")
    public void setPort(Integer port) {
        this._set(DTOFIELD_PORT, port);
    }

    @JsonIgnore
    public Integer getPort() {
        Object objValue = this._get(DTOFIELD_PORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPortDirty() {
        return this._contains(DTOFIELD_PORT);
    }

    @JsonIgnore
    public void resetPort() {
        this._reset(DTOFIELD_PORT);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO port(Integer port) {
        this.setPort(port);
        return this;
    }

    @JsonProperty(value="pscredentialid")
    public void setPSCredentialId(String pSCredentialId) {
        this._set(DTOFIELD_PSCREDENTIALID, pSCredentialId);
    }

    @JsonIgnore
    public String getPSCredentialId() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialIdDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public void resetPSCredentialId() {
        this._reset(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO pscredentialid(PSCredentialDTO pSCredential) {
        if (pSCredential == null) {
            this.setPSCredentialId(null);
            this.setPSCredentialName(null);
        } else {
            this.setPSCredentialId(pSCredential.getPSCredentialId());
            this.setPSCredentialName(pSCredential.getPSCredentialName());
        }
        return this;
    }

    @JsonProperty(value="pscredentialname")
    public void setPSCredentialName(String pSCredentialName) {
        this._set(DTOFIELD_PSCREDENTIALNAME, pSCredentialName);
    }

    @JsonIgnore
    public String getPSCredentialName() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialNameDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetPSCredentialName() {
        this._reset(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
        return this;
    }

    @JsonProperty(value="pscredentials")
    public void setPSCredentials(String pSCredentials) {
        this._set(DTOFIELD_PSCREDENTIALS, pSCredentials);
    }

    @JsonIgnore
    public String getPSCredentials() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialsDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALS);
    }

    @JsonIgnore
    public void resetPSCredentials() {
        this._reset(DTOFIELD_PSCREDENTIALS);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO pscredentials(String pSCredentials) {
        this.setPSCredentials(pSCredentials);
        return this;
    }

    @JsonProperty(value="psdcclusterid")
    public void setPSDCClusterId(String pSDCClusterId) {
        this._set(DTOFIELD_PSDCCLUSTERID, pSDCClusterId);
    }

    @JsonIgnore
    public String getPSDCClusterId() {
        Object objValue = this._get(DTOFIELD_PSDCCLUSTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCClusterIdDirty() {
        return this._contains(DTOFIELD_PSDCCLUSTERID);
    }

    @JsonIgnore
    public void resetPSDCClusterId() {
        this._reset(DTOFIELD_PSDCCLUSTERID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcclusterid(PSDCClusterDTO pSDCCluster) {
        if (pSDCCluster == null) {
            this.setPSDCClusterId(null);
            this.setPSDCClusterName(null);
        } else {
            this.setPSDCClusterId(pSDCCluster.getPSDCClusterId());
            this.setPSDCClusterName(pSDCCluster.getPSDCClusterName());
        }
        return this;
    }

    @JsonProperty(value="psdcclustername")
    public void setPSDCClusterName(String pSDCClusterName) {
        this._set(DTOFIELD_PSDCCLUSTERNAME, pSDCClusterName);
    }

    @JsonIgnore
    public String getPSDCClusterName() {
        Object objValue = this._get(DTOFIELD_PSDCCLUSTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCClusterNameDirty() {
        return this._contains(DTOFIELD_PSDCCLUSTERNAME);
    }

    @JsonIgnore
    public void resetPSDCClusterName() {
        this._reset(DTOFIELD_PSDCCLUSTERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcclustername(String pSDCClusterName) {
        this.setPSDCClusterName(pSDCClusterName);
        return this;
    }

    @JsonProperty(value="psdccontainerspecid")
    public void setPSDCContainerSpecId(String pSDCContainerSpecId) {
        this._set(DTOFIELD_PSDCCONTAINERSPECID, pSDCContainerSpecId);
    }

    @JsonIgnore
    public String getPSDCContainerSpecId() {
        Object objValue = this._get(DTOFIELD_PSDCCONTAINERSPECID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCContainerSpecIdDirty() {
        return this._contains(DTOFIELD_PSDCCONTAINERSPECID);
    }

    @JsonIgnore
    public void resetPSDCContainerSpecId() {
        this._reset(DTOFIELD_PSDCCONTAINERSPECID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdccontainerspecid(String pSDCContainerSpecId) {
        this.setPSDCContainerSpecId(pSDCContainerSpecId);
        return this;
    }

    @JsonProperty(value="psdccontainerspecname")
    public void setPSDCContainerSpecName(String pSDCContainerSpecName) {
        this._set(DTOFIELD_PSDCCONTAINERSPECNAME, pSDCContainerSpecName);
    }

    @JsonIgnore
    public String getPSDCContainerSpecName() {
        Object objValue = this._get(DTOFIELD_PSDCCONTAINERSPECNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCContainerSpecNameDirty() {
        return this._contains(DTOFIELD_PSDCCONTAINERSPECNAME);
    }

    @JsonIgnore
    public void resetPSDCContainerSpecName() {
        this._reset(DTOFIELD_PSDCCONTAINERSPECNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdccontainerspecname(String pSDCContainerSpecName) {
        this.setPSDCContainerSpecName(pSDCContainerSpecName);
        return this;
    }

    @JsonProperty(value="psdcdeploycenterid")
    public void setPSDCDeployCenterId(String pSDCDeployCenterId) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERID, pSDCDeployCenterId);
    }

    @JsonIgnore
    public String getPSDCDeployCenterId() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterIdDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterId() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcdeploycenterid(String pSDCDeployCenterId) {
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    @JsonProperty(value="psdcdeploycentername")
    public void setPSDCDeployCenterName(String pSDCDeployCenterName) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERNAME, pSDCDeployCenterName);
    }

    @JsonIgnore
    public String getPSDCDeployCenterName() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterNameDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterName() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcdeploycentername(String pSDCDeployCenterName) {
        this.setPSDCDeployCenterName(pSDCDeployCenterName);
        return this;
    }

    @JsonProperty(value="psdcfileid")
    public void setPSDCFileId(String pSDCFileId) {
        this._set(DTOFIELD_PSDCFILEID, pSDCFileId);
    }

    @JsonIgnore
    public String getPSDCFileId() {
        Object objValue = this._get(DTOFIELD_PSDCFILEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileIdDirty() {
        return this._contains(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public void resetPSDCFileId() {
        this._reset(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcfileid(PSDCFileDTO pSDCFile) {
        if (pSDCFile == null) {
            this.setPSDCFileId(null);
            this.setPSDCFileName(null);
        } else {
            this.setPSDCFileId(pSDCFile.getPSDCFileId());
            this.setPSDCFileName(pSDCFile.getPSDCFileName());
        }
        return this;
    }

    @JsonProperty(value="psdcfilename")
    public void setPSDCFileName(String pSDCFileName) {
        this._set(DTOFIELD_PSDCFILENAME, pSDCFileName);
    }

    @JsonIgnore
    public String getPSDCFileName() {
        Object objValue = this._get(DTOFIELD_PSDCFILENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileNameDirty() {
        return this._contains(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public void resetPSDCFileName() {
        this._reset(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
        return this;
    }

    @JsonProperty(value="psdcregistryrepoid")
    public void setPSDCRegistryRepoId(String pSDCRegistryRepoId) {
        this._set(DTOFIELD_PSDCREGISTRYREPOID, pSDCRegistryRepoId);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoId() {
        this._reset(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcregistryrepoid(String pSDCRegistryRepoId) {
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcregistryrepoid(PSDCRegistryRepoDTO pSDCRegistryRepo) {
        if (pSDCRegistryRepo == null) {
            this.setPSDCRegistryRepoId(null);
            this.setPSDCRegistryRepoName(null);
        } else {
            this.setPSDCRegistryRepoId(pSDCRegistryRepo.getPSDCRegistryRepoId());
            this.setPSDCRegistryRepoName(pSDCRegistryRepo.getPSDCRegistryRepoName());
        }
        return this;
    }

    @JsonProperty(value="psdcregistryreponame")
    public void setPSDCRegistryRepoName(String pSDCRegistryRepoName) {
        this._set(DTOFIELD_PSDCREGISTRYREPONAME, pSDCRegistryRepoName);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoName() {
        this._reset(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdcregistryreponame(String pSDCRegistryRepoName) {
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
        return this;
    }

    @JsonProperty(value="psdeploycenterid")
    public void setPSDeployCenterId(String pSDeployCenterId) {
        this._set(DTOFIELD_PSDEPLOYCENTERID, pSDeployCenterId);
    }

    @JsonIgnore
    public String getPSDeployCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEPLOYCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDeployCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEPLOYCENTERID);
    }

    @JsonIgnore
    public void resetPSDeployCenterId() {
        this._reset(DTOFIELD_PSDEPLOYCENTERID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdeploycenterid(String pSDeployCenterId) {
        this.setPSDeployCenterId(pSDeployCenterId);
        return this;
    }

    @JsonProperty(value="psdeploycentername")
    public void setPSDeployCenterName(String pSDeployCenterName) {
        this._set(DTOFIELD_PSDEPLOYCENTERNAME, pSDeployCenterName);
    }

    @JsonIgnore
    public String getPSDeployCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEPLOYCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDeployCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDeployCenterName() {
        this._reset(DTOFIELD_PSDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdeploycentername(String pSDeployCenterName) {
        this.setPSDeployCenterName(pSDeployCenterName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
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
    public PSDCDeployCenterDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
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
    public PSDCDeployCenterDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psgitusers")
    public void setPSGitUsers(String pSGitUsers) {
        this._set(DTOFIELD_PSGITUSERS, pSGitUsers);
    }

    @JsonIgnore
    public String getPSGitUsers() {
        Object objValue = this._get(DTOFIELD_PSGITUSERS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSGitUsersDirty() {
        return this._contains(DTOFIELD_PSGITUSERS);
    }

    @JsonIgnore
    public void resetPSGitUsers() {
        this._reset(DTOFIELD_PSGITUSERS);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO psgitusers(String pSGitUsers) {
        this.setPSGitUsers(pSGitUsers);
        return this;
    }

    @JsonProperty(value="refcount")
    public void setRefCount(Integer refCount) {
        this._set(DTOFIELD_REFCOUNT, refCount);
    }

    @JsonIgnore
    public Integer getRefCount() {
        Object objValue = this._get(DTOFIELD_REFCOUNT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefCountDirty() {
        return this._contains(DTOFIELD_REFCOUNT);
    }

    @JsonIgnore
    public void resetRefCount() {
        this._reset(DTOFIELD_REFCOUNT);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO refcount(Integer refCount) {
        this.setRefCount(refCount);
        return this;
    }

    @JsonProperty(value="respos")
    public void setResPos(Integer resPos) {
        this._set(DTOFIELD_RESPOS, resPos);
    }

    @JsonIgnore
    public Integer getResPos() {
        Object objValue = this._get(DTOFIELD_RESPOS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResPosDirty() {
        return this._contains(DTOFIELD_RESPOS);
    }

    @JsonIgnore
    public void resetResPos() {
        this._reset(DTOFIELD_RESPOS);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO respos(PSModelEnums.DCResPos resPos) {
        this.setResPos(resPos == null ? null : resPos.value);
        return this;
    }

    @JsonProperty(value="resreadytime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setResReadyTime(Timestamp resReadyTime) {
        this._set(DTOFIELD_RESREADYTIME, resReadyTime);
    }

    @JsonIgnore
    public Timestamp getResReadyTime() {
        Object objValue = this._get(DTOFIELD_RESREADYTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isResReadyTimeDirty() {
        return this._contains(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public void resetResReadyTime() {
        this._reset(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO resreadytime(Timestamp resReadyTime) {
        this.setResReadyTime(resReadyTime);
        return this;
    }

    @JsonProperty(value="resstate")
    public void setResState(Integer resState) {
        this._set(DTOFIELD_RESSTATE, resState);
    }

    @JsonIgnore
    public Integer getResState() {
        Object objValue = this._get(DTOFIELD_RESSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResStateDirty() {
        return this._contains(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public void resetResState() {
        this._reset(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
        return this;
    }

    @JsonProperty(value="resver")
    public void setResVer(Integer resVer) {
        this._set(DTOFIELD_RESVER, resVer);
    }

    @JsonIgnore
    public Integer getResVer() {
        Object objValue = this._get(DTOFIELD_RESVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResVerDirty() {
        return this._contains(DTOFIELD_RESVER);
    }

    @JsonIgnore
    public void resetResVer() {
        this._reset(DTOFIELD_RESVER);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO resver(Integer resVer) {
        this.setResVer(resVer);
        return this;
    }

    @JsonProperty(value="sshipaddr")
    public void setSSHIPAddr(String sSHIPAddr) {
        this._set(DTOFIELD_SSHIPADDR, sSHIPAddr);
    }

    @JsonIgnore
    public String getSSHIPAddr() {
        Object objValue = this._get(DTOFIELD_SSHIPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSSHIPAddrDirty() {
        return this._contains(DTOFIELD_SSHIPADDR);
    }

    @JsonIgnore
    public void resetSSHIPAddr() {
        this._reset(DTOFIELD_SSHIPADDR);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO sshipaddr(String sSHIPAddr) {
        this.setSSHIPAddr(sSHIPAddr);
        return this;
    }

    @JsonProperty(value="sshport")
    public void setSSHPort(Integer sSHPort) {
        this._set(DTOFIELD_SSHPORT, sSHPort);
    }

    @JsonIgnore
    public Integer getSSHPort() {
        Object objValue = this._get(DTOFIELD_SSHPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSSHPortDirty() {
        return this._contains(DTOFIELD_SSHPORT);
    }

    @JsonIgnore
    public void resetSSHPort() {
        this._reset(DTOFIELD_SSHPORT);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO sshport(Integer sSHPort) {
        this.setSSHPort(sSHPort);
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
    public PSDCDeployCenterDTO updatedate(Timestamp updateDate) {
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
    public PSDCDeployCenterDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="uploadfilemode")
    public void setUploadFileMode(String uploadFileMode) {
        this._set(DTOFIELD_UPLOADFILEMODE, uploadFileMode);
    }

    @JsonIgnore
    public String getUploadFileMode() {
        Object objValue = this._get(DTOFIELD_UPLOADFILEMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUploadFileModeDirty() {
        return this._contains(DTOFIELD_UPLOADFILEMODE);
    }

    @JsonIgnore
    public void resetUploadFileMode() {
        this._reset(DTOFIELD_UPLOADFILEMODE);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO uploadfilemode(String uploadFileMode) {
        this.setUploadFileMode(uploadFileMode);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO uploadfilemode(PSModelEnums.FileUploadMode uploadFileMode) {
        this.setUploadFileMode(uploadFileMode == null ? null : uploadFileMode.value);
        return this;
    }

    @JsonProperty(value="uploadpath")
    public void setUploadPath(String uploadPath) {
        this._set(DTOFIELD_UPLOADPATH, uploadPath);
    }

    @JsonIgnore
    public String getUploadPath() {
        Object objValue = this._get(DTOFIELD_UPLOADPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUploadPathDirty() {
        return this._contains(DTOFIELD_UPLOADPATH);
    }

    @JsonIgnore
    public void resetUploadPath() {
        this._reset(DTOFIELD_UPLOADPATH);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO uploadpath(String uploadPath) {
        this.setUploadPath(uploadPath);
        return this;
    }

    @JsonProperty(value="username")
    public void setUserName(String userName) {
        this._set(DTOFIELD_USERNAME, userName);
    }

    @JsonIgnore
    public String getUserName() {
        Object objValue = this._get(DTOFIELD_USERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserNameDirty() {
        return this._contains(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public void resetUserName() {
        this._reset(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO username(String userName) {
        this.setUserName(userName);
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
    public PSDCDeployCenterDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCDeployCenterDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="webconsolepath")
    public void setWebConsolePath(String webConsolePath) {
        this._set(DTOFIELD_WEBCONSOLEPATH, webConsolePath);
    }

    @JsonIgnore
    public String getWebConsolePath() {
        Object objValue = this._get(DTOFIELD_WEBCONSOLEPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWebConsolePathDirty() {
        return this._contains(DTOFIELD_WEBCONSOLEPATH);
    }

    @JsonIgnore
    public void resetWebConsolePath() {
        this._reset(DTOFIELD_WEBCONSOLEPATH);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO webconsolepath(String webConsolePath) {
        this.setWebConsolePath(webConsolePath);
        return this;
    }

    @JsonProperty(value="workshoppath")
    public void setWorkshopPath(String workshopPath) {
        this._set(DTOFIELD_WORKSHOPPATH, workshopPath);
    }

    @JsonIgnore
    public String getWorkshopPath() {
        Object objValue = this._get(DTOFIELD_WORKSHOPPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkshopPathDirty() {
        return this._contains(DTOFIELD_WORKSHOPPATH);
    }

    @JsonIgnore
    public void resetWorkshopPath() {
        this._reset(DTOFIELD_WORKSHOPPATH);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO workshoppath(String workshopPath) {
        this.setWorkshopPath(workshopPath);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCDeployCenterName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCDeployCenterName(strName);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO name(String strName) {
        this.setPSDCDeployCenterName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCDeployCenterId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCDeployCenterId(strValue);
    }

    @JsonIgnore
    public PSDCDeployCenterDTO id(String strValue) {
        this.setPSDCDeployCenterId(strValue);
        return this;
    }

}
