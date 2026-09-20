package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCMSPlatformDTO extends PSModelDTOBase {
    public static final String FIELD_ADMINPASSWD = "ADMINPASSWD";
    protected static final String DTOFIELD_ADMINPASSWD = "adminpasswd";
    public static final String FIELD_ADMINUSERNAME = "ADMINUSERNAME";
    protected static final String DTOFIELD_ADMINUSERNAME = "adminusername";
    public static final String FIELD_CFGSERVICEURL = "CFGSERVICEURL";
    protected static final String DTOFIELD_CFGSERVICEURL = "cfgserviceurl";
    public static final String FIELD_CLUSTERNAMESPACE = "CLUSTERNAMESPACE";
    protected static final String DTOFIELD_CLUSTERNAMESPACE = "clusternamespace";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSTYPE = "MSTYPE";
    protected static final String DTOFIELD_MSTYPE = "mstype";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
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
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNAME = "PSDCMSPLATFORMNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSMSPLATFORMID = "PSMSPLATFORMID";
    protected static final String DTOFIELD_PSMSPLATFORMID = "psmsplatformid";
    public static final String FIELD_PSMSPLATFORMNAME = "PSMSPLATFORMNAME";
    protected static final String DTOFIELD_PSMSPLATFORMNAME = "psmsplatformname";
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
    public static final String FIELD_SERVICEURL = "SERVICEURL";
    protected static final String DTOFIELD_SERVICEURL = "serviceurl";
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
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public PSDCMSPlatformDTO adminpasswd(String adminPasswd) {
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
    public PSDCMSPlatformDTO adminusername(String adminUserName) {
        this.setAdminUserName(adminUserName);
        return this;
    }

    @JsonProperty(value="cfgserviceurl")
    public void setCfgServiceUrl(String cfgServiceUrl) {
        this._set(DTOFIELD_CFGSERVICEURL, cfgServiceUrl);
    }

    @JsonIgnore
    public String getCfgServiceUrl() {
        Object objValue = this._get(DTOFIELD_CFGSERVICEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgServiceUrlDirty() {
        return this._contains(DTOFIELD_CFGSERVICEURL);
    }

    @JsonIgnore
    public void resetCfgServiceUrl() {
        this._reset(DTOFIELD_CFGSERVICEURL);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO cfgserviceurl(String cfgServiceUrl) {
        this.setCfgServiceUrl(cfgServiceUrl);
        return this;
    }

    @JsonProperty(value="clusternamespace")
    public void setClusterNamespace(String clusterNamespace) {
        this._set(DTOFIELD_CLUSTERNAMESPACE, clusterNamespace);
    }

    @JsonIgnore
    public String getClusterNamespace() {
        Object objValue = this._get(DTOFIELD_CLUSTERNAMESPACE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClusterNamespaceDirty() {
        return this._contains(DTOFIELD_CLUSTERNAMESPACE);
    }

    @JsonIgnore
    public void resetClusterNamespace() {
        this._reset(DTOFIELD_CLUSTERNAMESPACE);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO clusternamespace(String clusterNamespace) {
        this.setClusterNamespace(clusterNamespace);
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
    public PSDCMSPlatformDTO createdate(Timestamp createDate) {
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
    public PSDCMSPlatformDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDCMSPlatformDTO expriedtime(Timestamp expriedTime) {
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
    public PSDCMSPlatformDTO ipaddr(String ipAddr) {
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
    public PSDCMSPlatformDTO ipaddr2(String ipAddr2) {
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
    public PSDCMSPlatformDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mstype")
    public void setMSType(String mSType) {
        this._set(DTOFIELD_MSTYPE, mSType);
    }

    @JsonIgnore
    public String getMSType() {
        Object objValue = this._get(DTOFIELD_MSTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSTypeDirty() {
        return this._contains(DTOFIELD_MSTYPE);
    }

    @JsonIgnore
    public void resetMSType() {
        this._reset(DTOFIELD_MSTYPE);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO mstype(String mSType) {
        this.setMSType(mSType);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO mstype(PSModelEnums.MSPlatformType mSType) {
        this.setMSType(mSType == null ? null : mSType.value);
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
    public PSDCMSPlatformDTO passwd(String passwd) {
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
    public PSDCMSPlatformDTO port(Integer port) {
        this.setPort(port);
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
    public PSDCMSPlatformDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdcclusterid(PSDCClusterDTO pSDCCluster) {
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
    public PSDCMSPlatformDTO psdcclustername(String pSDCClusterName) {
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
    public PSDCMSPlatformDTO psdccontainerspecid(String pSDCContainerSpecId) {
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
    public PSDCMSPlatformDTO psdccontainerspecname(String pSDCContainerSpecName) {
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
    public PSDCMSPlatformDTO psdcdeploycenterid(String pSDCDeployCenterId) {
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdcdeploycenterid(PSDCDeployCenterDTO pSDCDeployCenter) {
        if (pSDCDeployCenter == null) {
            this.setPSDCDeployCenterId(null);
            this.setPSDCDeployCenterName(null);
        } else {
            this.setPSDCDeployCenterId(pSDCDeployCenter.getPSDCDeployCenterId());
            this.setPSDCDeployCenterName(pSDCDeployCenter.getPSDCDeployCenterName());
        }
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
    public PSDCMSPlatformDTO psdcdeploycentername(String pSDCDeployCenterName) {
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
    public PSDCMSPlatformDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdcfileid(PSDCFileDTO pSDCFile) {
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
    public PSDCMSPlatformDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
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
    public PSDCMSPlatformDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonProperty(value="psdcmsplatformname")
    public void setPSDCMSPlatformName(String pSDCMSPlatformName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdcmsplatformname(String pSDCMSPlatformName) {
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
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
    public PSDCMSPlatformDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCMSPlatformDTO psdevcentername(String pSDevCenterName) {
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
    public PSDCMSPlatformDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDCMSPlatformDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psmsplatformid")
    public void setPSMSPlatformId(String pSMSPlatformId) {
        this._set(DTOFIELD_PSMSPLATFORMID, pSMSPlatformId);
    }

    @JsonIgnore
    public String getPSMSPlatformId() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformIdDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMID);
    }

    @JsonIgnore
    public void resetPSMSPlatformId() {
        this._reset(DTOFIELD_PSMSPLATFORMID);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psmsplatformid(String pSMSPlatformId) {
        this.setPSMSPlatformId(pSMSPlatformId);
        return this;
    }

    @JsonProperty(value="psmsplatformname")
    public void setPSMSPlatformName(String pSMSPlatformName) {
        this._set(DTOFIELD_PSMSPLATFORMNAME, pSMSPlatformName);
    }

    @JsonIgnore
    public String getPSMSPlatformName() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformNameDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMNAME);
    }

    @JsonIgnore
    public void resetPSMSPlatformName() {
        this._reset(DTOFIELD_PSMSPLATFORMNAME);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO psmsplatformname(String pSMSPlatformName) {
        this.setPSMSPlatformName(pSMSPlatformName);
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
    public PSDCMSPlatformDTO refcount(Integer refCount) {
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
    public PSDCMSPlatformDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO respos(PSModelEnums.DCResPos resPos) {
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
    public PSDCMSPlatformDTO resreadytime(Timestamp resReadyTime) {
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
    public PSDCMSPlatformDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO resstate(PSModelEnums.DCResState resState) {
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
    public PSDCMSPlatformDTO resver(Integer resVer) {
        this.setResVer(resVer);
        return this;
    }

    @JsonProperty(value="serviceurl")
    public void setServiceUrl(String serviceUrl) {
        this._set(DTOFIELD_SERVICEURL, serviceUrl);
    }

    @JsonIgnore
    public String getServiceUrl() {
        Object objValue = this._get(DTOFIELD_SERVICEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceUrlDirty() {
        return this._contains(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public void resetServiceUrl() {
        this._reset(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO serviceurl(String serviceUrl) {
        this.setServiceUrl(serviceUrl);
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
    public PSDCMSPlatformDTO sshipaddr(String sSHIPAddr) {
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
    public PSDCMSPlatformDTO sshport(Integer sSHPort) {
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
    public PSDCMSPlatformDTO updatedate(Timestamp updateDate) {
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
    public PSDCMSPlatformDTO updateman(String updateMan) {
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
    public PSDCMSPlatformDTO uploadfilemode(String uploadFileMode) {
        this.setUploadFileMode(uploadFileMode);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO uploadfilemode(PSModelEnums.FileUploadMode uploadFileMode) {
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
    public PSDCMSPlatformDTO uploadpath(String uploadPath) {
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
    public PSDCMSPlatformDTO username(String userName) {
        this.setUserName(userName);
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
    public PSDCMSPlatformDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDCMSPlatformDTO usertag(String userTag) {
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
    public PSDCMSPlatformDTO usertag2(String userTag2) {
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
    public PSDCMSPlatformDTO usertag3(String userTag3) {
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
    public PSDCMSPlatformDTO usertag4(String userTag4) {
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
    public PSDCMSPlatformDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformDTO validflag(Boolean validFlag) {
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
    public PSDCMSPlatformDTO webconsolepath(String webConsolePath) {
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
    public PSDCMSPlatformDTO workshoppath(String workshopPath) {
        this.setWorkshopPath(workshopPath);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCMSPlatformName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCMSPlatformName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO name(String strName) {
        this.setPSDCMSPlatformName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCMSPlatformId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCMSPlatformId(strValue);
    }

    @JsonIgnore
    public PSDCMSPlatformDTO id(String strValue) {
        this.setPSDCMSPlatformId(strValue);
        return this;
    }

}
