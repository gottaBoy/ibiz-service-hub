package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCClusterDTO extends PSModelDTOBase {
    public static final String FIELD_CLUSTERCFG = "CLUSTERCFG";
    protected static final String DTOFIELD_CLUSTERCFG = "clustercfg";
    public static final String FIELD_CLUSTERPARAMS = "CLUSTERPARAMS";
    protected static final String DTOFIELD_CLUSTERPARAMS = "clusterparams";
    public static final String FIELD_CLUSTERTYPE = "CLUSTERTYPE";
    protected static final String DTOFIELD_CLUSTERTYPE = "clustertype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREDENTIALSYNCMODE = "CREDENTIALSYNCMODE";
    protected static final String DTOFIELD_CREDENTIALSYNCMODE = "credentialsyncmode";
    public static final String FIELD_DOMAINNAME = "DOMAINNAME";
    protected static final String DTOFIELD_DOMAINNAME = "domainname";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSDCCLUSTERID = "PSDCCLUSTERID";
    protected static final String DTOFIELD_PSDCCLUSTERID = "psdcclusterid";
    public static final String FIELD_PSDCCLUSTERNAME = "PSDCCLUSTERNAME";
    protected static final String DTOFIELD_PSDCCLUSTERNAME = "psdcclustername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_RESPOS = "RESPOS";
    protected static final String DTOFIELD_RESPOS = "respos";
    public static final String FIELD_RESREADYTIME = "RESREADYTIME";
    protected static final String DTOFIELD_RESREADYTIME = "resreadytime";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_RESVER = "RESVER";
    protected static final String DTOFIELD_RESVER = "resver";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_URL = "URL";
    protected static final String DTOFIELD_URL = "url";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="clustercfg")
    public void setClusterCfg(String clusterCfg) {
        this._set(DTOFIELD_CLUSTERCFG, clusterCfg);
    }

    @JsonIgnore
    public String getClusterCfg() {
        Object objValue = this._get(DTOFIELD_CLUSTERCFG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClusterCfgDirty() {
        return this._contains(DTOFIELD_CLUSTERCFG);
    }

    @JsonIgnore
    public void resetClusterCfg() {
        this._reset(DTOFIELD_CLUSTERCFG);
    }

    @JsonIgnore
    public PSDCClusterDTO clustercfg(String clusterCfg) {
        this.setClusterCfg(clusterCfg);
        return this;
    }

    @JsonProperty(value="clusterparams")
    public void setClusterParams(String clusterParams) {
        this._set(DTOFIELD_CLUSTERPARAMS, clusterParams);
    }

    @JsonIgnore
    public String getClusterParams() {
        Object objValue = this._get(DTOFIELD_CLUSTERPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClusterParamsDirty() {
        return this._contains(DTOFIELD_CLUSTERPARAMS);
    }

    @JsonIgnore
    public void resetClusterParams() {
        this._reset(DTOFIELD_CLUSTERPARAMS);
    }

    @JsonIgnore
    public PSDCClusterDTO clusterparams(String clusterParams) {
        this.setClusterParams(clusterParams);
        return this;
    }

    @JsonProperty(value="clustertype")
    public void setClusterType(String clusterType) {
        this._set(DTOFIELD_CLUSTERTYPE, clusterType);
    }

    @JsonIgnore
    public String getClusterType() {
        Object objValue = this._get(DTOFIELD_CLUSTERTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClusterTypeDirty() {
        return this._contains(DTOFIELD_CLUSTERTYPE);
    }

    @JsonIgnore
    public void resetClusterType() {
        this._reset(DTOFIELD_CLUSTERTYPE);
    }

    @JsonIgnore
    public PSDCClusterDTO clustertype(String clusterType) {
        this.setClusterType(clusterType);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO clustertype(PSModelEnums.ClusterType clusterType) {
        this.setClusterType(clusterType == null ? null : clusterType.value);
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
    public PSDCClusterDTO createdate(Timestamp createDate) {
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
    public PSDCClusterDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="credentialsyncmode")
    public void setCredentialSyncMode(Integer credentialSyncMode) {
        this._set(DTOFIELD_CREDENTIALSYNCMODE, credentialSyncMode);
    }

    @JsonIgnore
    public Integer getCredentialSyncMode() {
        Object objValue = this._get(DTOFIELD_CREDENTIALSYNCMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCredentialSyncModeDirty() {
        return this._contains(DTOFIELD_CREDENTIALSYNCMODE);
    }

    @JsonIgnore
    public void resetCredentialSyncMode() {
        this._reset(DTOFIELD_CREDENTIALSYNCMODE);
    }

    @JsonIgnore
    public PSDCClusterDTO credentialsyncmode(Integer credentialSyncMode) {
        this.setCredentialSyncMode(credentialSyncMode);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO credentialsyncmode(PSModelEnums.CredentialSyncMode credentialSyncMode) {
        this.setCredentialSyncMode(credentialSyncMode == null ? null : credentialSyncMode.value);
        return this;
    }

    @JsonProperty(value="domainname")
    public void setDomainName(String domainName) {
        this._set(DTOFIELD_DOMAINNAME, domainName);
    }

    @JsonIgnore
    public String getDomainName() {
        Object objValue = this._get(DTOFIELD_DOMAINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDomainNameDirty() {
        return this._contains(DTOFIELD_DOMAINNAME);
    }

    @JsonIgnore
    public void resetDomainName() {
        this._reset(DTOFIELD_DOMAINNAME);
    }

    @JsonIgnore
    public PSDCClusterDTO domainname(String domainName) {
        this.setDomainName(domainName);
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
    public PSDCClusterDTO expriedtime(Timestamp expriedTime) {
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
    public PSDCClusterDTO ipaddr(String ipAddr) {
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
    public PSDCClusterDTO ipaddr2(String ipAddr2) {
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
    public PSDCClusterDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="param")
    public void setParam(String param) {
        this._set(DTOFIELD_PARAM, param);
    }

    @JsonIgnore
    public String getParam() {
        Object objValue = this._get(DTOFIELD_PARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDirty() {
        return this._contains(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public void resetParam() {
        this._reset(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public PSDCClusterDTO param(String param) {
        this.setParam(param);
        return this;
    }

    @JsonProperty(value="param2")
    public void setParam2(String param2) {
        this._set(DTOFIELD_PARAM2, param2);
    }

    @JsonIgnore
    public String getParam2() {
        Object objValue = this._get(DTOFIELD_PARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam2Dirty() {
        return this._contains(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public void resetParam2() {
        this._reset(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public PSDCClusterDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(String param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public String getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSDCClusterDTO param3(String param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(String param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public String getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSDCClusterDTO param4(String param4) {
        this.setParam4(param4);
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
    public PSDCClusterDTO port(Integer port) {
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
    public PSDCClusterDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO pscredentialid(PSCredentialDTO pSCredential) {
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
    public PSDCClusterDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
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
    public PSDCClusterDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
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
    public PSDCClusterDTO psdcclustername(String pSDCClusterName) {
        this.setPSDCClusterName(pSDCClusterName);
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
    public PSDCClusterDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCClusterDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
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
    public PSDCClusterDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO respos(PSModelEnums.DCResPos resPos) {
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
    public PSDCClusterDTO resreadytime(Timestamp resReadyTime) {
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
    public PSDCClusterDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCClusterDTO resstate(PSModelEnums.DCResState resState) {
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
    public PSDCClusterDTO resver(Integer resVer) {
        this.setResVer(resVer);
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
    public PSDCClusterDTO updatedate(Timestamp updateDate) {
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
    public PSDCClusterDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="url")
    public void setUrl(String url) {
        this._set(DTOFIELD_URL, url);
    }

    @JsonIgnore
    public String getUrl() {
        Object objValue = this._get(DTOFIELD_URL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUrlDirty() {
        return this._contains(DTOFIELD_URL);
    }

    @JsonIgnore
    public void resetUrl() {
        this._reset(DTOFIELD_URL);
    }

    @JsonIgnore
    public PSDCClusterDTO url(String url) {
        this.setUrl(url);
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
    public PSDCClusterDTO username(String userName) {
        this.setUserName(userName);
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
    public PSDCClusterDTO usertag(String userTag) {
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
    public PSDCClusterDTO usertag2(String userTag2) {
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
    public PSDCClusterDTO usertag3(String userTag3) {
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
    public PSDCClusterDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCClusterName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCClusterName(strName);
    }

    @JsonIgnore
    public PSDCClusterDTO name(String strName) {
        this.setPSDCClusterName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCClusterId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCClusterId(strValue);
    }

    @JsonIgnore
    public PSDCClusterDTO id(String strValue) {
        this.setPSDCClusterId(strValue);
        return this;
    }

}
