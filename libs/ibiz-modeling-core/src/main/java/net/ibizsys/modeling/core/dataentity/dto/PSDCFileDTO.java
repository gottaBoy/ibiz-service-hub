package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCFileDTO extends PSModelDTOBase {
    public static final String FIELD_ADMINPASSWD = "ADMINPASSWD";
    protected static final String DTOFIELD_ADMINPASSWD = "adminpasswd";
    public static final String FIELD_ADMINUSERNAME = "ADMINUSERNAME";
    protected static final String DTOFIELD_ADMINUSERNAME = "adminusername";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_FILEPATH = "FILEPATH";
    protected static final String DTOFIELD_FILEPATH = "filepath";
    public static final String FIELD_FSTYPE = "FSTYPE";
    protected static final String DTOFIELD_FSTYPE = "fstype";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSDCFILEID = "PSDCFILEID";
    protected static final String DTOFIELD_PSDCFILEID = "psdcfileid";
    public static final String FIELD_PSDCFILENAME = "PSDCFILENAME";
    protected static final String DTOFIELD_PSDCFILENAME = "psdcfilename";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSDCFileDTO adminpasswd(String adminPasswd) {
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
    public PSDCFileDTO adminusername(String adminUserName) {
        this.setAdminUserName(adminUserName);
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
    public PSDCFileDTO createdate(Timestamp createDate) {
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
    public PSDCFileDTO createman(String createMan) {
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
    public PSDCFileDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="filepath")
    public void setFilePath(String filePath) {
        this._set(DTOFIELD_FILEPATH, filePath);
    }

    @JsonIgnore
    public String getFilePath() {
        Object objValue = this._get(DTOFIELD_FILEPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilePathDirty() {
        return this._contains(DTOFIELD_FILEPATH);
    }

    @JsonIgnore
    public void resetFilePath() {
        this._reset(DTOFIELD_FILEPATH);
    }

    @JsonIgnore
    public PSDCFileDTO filepath(String filePath) {
        this.setFilePath(filePath);
        return this;
    }

    @JsonProperty(value="fstype")
    public void setFSType(String fSType) {
        this._set(DTOFIELD_FSTYPE, fSType);
    }

    @JsonIgnore
    public String getFSType() {
        Object objValue = this._get(DTOFIELD_FSTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFSTypeDirty() {
        return this._contains(DTOFIELD_FSTYPE);
    }

    @JsonIgnore
    public void resetFSType() {
        this._reset(DTOFIELD_FSTYPE);
    }

    @JsonIgnore
    public PSDCFileDTO fstype(String fSType) {
        this.setFSType(fSType);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO fstype(PSModelEnums.FileSystemType fSType) {
        this.setFSType(fSType == null ? null : fSType.value);
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
    public PSDCFileDTO ipaddr(String ipAddr) {
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
    public PSDCFileDTO ipaddr2(String ipAddr2) {
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
    public PSDCFileDTO memo(String memo) {
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
    public PSDCFileDTO passwd(String passwd) {
        this.setPasswd(passwd);
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
    public PSDCFileDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO pscredentialid(PSCredentialDTO pSCredential) {
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
    public PSDCFileDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
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
    public PSDCFileDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
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
    public PSDCFileDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
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
    public PSDCFileDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCFileDTO psdevcentername(String pSDevCenterName) {
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
    public PSDCFileDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDCFileDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
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
    public PSDCFileDTO refcount(Integer refCount) {
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
    public PSDCFileDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO respos(PSModelEnums.DCResPos resPos) {
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
    public PSDCFileDTO resreadytime(Timestamp resReadyTime) {
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
    public PSDCFileDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO resstate(PSModelEnums.DCResState resState) {
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
    public PSDCFileDTO resver(Integer resVer) {
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
    public PSDCFileDTO sshipaddr(String sSHIPAddr) {
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
    public PSDCFileDTO sshport(Integer sSHPort) {
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
    public PSDCFileDTO updatedate(Timestamp updateDate) {
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
    public PSDCFileDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSDCFileDTO username(String userName) {
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
    public PSDCFileDTO usertag(String userTag) {
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
    public PSDCFileDTO usertag2(String userTag2) {
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
    public PSDCFileDTO usertag3(String userTag3) {
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
    public PSDCFileDTO usertag4(String userTag4) {
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
    public PSDCFileDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCFileDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCFileName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCFileName(strName);
    }

    @JsonIgnore
    public PSDCFileDTO name(String strName) {
        this.setPSDCFileName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCFileId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCFileId(strValue);
    }

    @JsonIgnore
    public PSDCFileDTO id(String strValue) {
        this.setPSDCFileId(strValue);
        return this;
    }

}
