package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevCenterDBInstDTO extends PSModelDTOBase {
    public static final String FIELD_ALLOCSIZE = "ALLOCSIZE";
    protected static final String DTOFIELD_ALLOCSIZE = "allocsize";
    public static final String FIELD_CONNSTR = "CONNSTR";
    protected static final String DTOFIELD_CONNSTR = "connstr";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBINSTALLPATH = "DBINSTALLPATH";
    protected static final String DTOFIELD_DBINSTALLPATH = "dbinstallpath";
    public static final String FIELD_DBNAME = "DBNAME";
    protected static final String DTOFIELD_DBNAME = "dbname";
    public static final String FIELD_DBPORT = "DBPORT";
    protected static final String DTOFIELD_DBPORT = "dbport";
    public static final String FIELD_DBTYPE = "DBTYPE";
    protected static final String DTOFIELD_DBTYPE = "dbtype";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_HOSTADDRESS = "HOSTADDRESS";
    protected static final String DTOFIELD_HOSTADDRESS = "hostaddress";
    public static final String FIELD_HOSTPASSWD = "HOSTPASSWD";
    protected static final String DTOFIELD_HOSTPASSWD = "hostpasswd";
    public static final String FIELD_HOSTPORT = "HOSTPORT";
    protected static final String DTOFIELD_HOSTPORT = "hostport";
    public static final String FIELD_HOSTSSHPORT = "HOSTSSHPORT";
    protected static final String DTOFIELD_HOSTSSHPORT = "hostsshport";
    public static final String FIELD_HOSTUSERNAME = "HOSTUSERNAME";
    protected static final String DTOFIELD_HOSTUSERNAME = "hostusername";
    public static final String FIELD_LOCKOBJID = "LOCKOBJID";
    protected static final String DTOFIELD_LOCKOBJID = "lockobjid";
    public static final String FIELD_LOCKOBJTYPE = "LOCKOBJTYPE";
    protected static final String DTOFIELD_LOCKOBJTYPE = "lockobjtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PSDBDEVINSTID = "PSDBDEVINSTID";
    protected static final String DTOFIELD_PSDBDEVINSTID = "psdbdevinstid";
    public static final String FIELD_PSDBDEVINSTNAME = "PSDBDEVINSTNAME";
    protected static final String DTOFIELD_PSDBDEVINSTNAME = "psdbdevinstname";
    public static final String FIELD_PSDCCLUSTERID = "PSDCCLUSTERID";
    protected static final String DTOFIELD_PSDCCLUSTERID = "psdcclusterid";
    public static final String FIELD_PSDCCLUSTERNAME = "PSDCCLUSTERNAME";
    protected static final String DTOFIELD_PSDCCLUSTERNAME = "psdcclustername";
    public static final String FIELD_PSDCCONTAINERSPECID = "PSDCCONTAINERSPECID";
    protected static final String DTOFIELD_PSDCCONTAINERSPECID = "psdccontainerspecid";
    public static final String FIELD_PSDCCONTAINERSPECNAME = "PSDCCONTAINERSPECNAME";
    protected static final String DTOFIELD_PSDCCONTAINERSPECNAME = "psdccontainerspecname";
    public static final String FIELD_PSDCFILEID = "PSDCFILEID";
    protected static final String DTOFIELD_PSDCFILEID = "psdcfileid";
    public static final String FIELD_PSDCFILENAME = "PSDCFILENAME";
    protected static final String DTOFIELD_PSDCFILENAME = "psdcfilename";
    public static final String FIELD_PSDEVCENTERASID = "PSDEVCENTERASID";
    protected static final String DTOFIELD_PSDEVCENTERASID = "psdevcenterasid";
    public static final String FIELD_PSDEVCENTERASNAME = "PSDEVCENTERASNAME";
    protected static final String DTOFIELD_PSDEVCENTERASNAME = "psdevcenterasname";
    public static final String FIELD_PSDEVCENTERDBINSTID = "PSDEVCENTERDBINSTID";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";
    public static final String FIELD_PSDEVCENTERDBINSTNAME = "PSDEVCENTERDBINSTNAME";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";
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
    public static final String FIELD_REFINFO = "REFINFO";
    protected static final String DTOFIELD_REFINFO = "refinfo";
    public static final String FIELD_RESPOS = "RESPOS";
    protected static final String DTOFIELD_RESPOS = "respos";
    public static final String FIELD_RESREADYTIME = "RESREADYTIME";
    protected static final String DTOFIELD_RESREADYTIME = "resreadytime";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_RESVER = "RESVER";
    protected static final String DTOFIELD_RESVER = "resver";
    public static final String FIELD_SYSMEMO = "SYSMEMO";
    protected static final String DTOFIELD_SYSMEMO = "sysmemo";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPLOADFILEMODE = "UPLOADFILEMODE";
    protected static final String DTOFIELD_UPLOADFILEMODE = "uploadfilemode";
    public static final String FIELD_UPLOADPATH = "UPLOADPATH";
    protected static final String DTOFIELD_UPLOADPATH = "uploadpath";
    public static final String FIELD_USAGEMODE = "USAGEMODE";
    protected static final String DTOFIELD_USAGEMODE = "usagemode";
    public static final String FIELD_USEDSIZE = "USEDSIZE";
    protected static final String DTOFIELD_USEDSIZE = "usedsize";
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

    @JsonProperty(value="allocsize")
    public void setAllocSize(Integer allocSize) {
        this._set(DTOFIELD_ALLOCSIZE, allocSize);
    }

    @JsonIgnore
    public Integer getAllocSize() {
        Object objValue = this._get(DTOFIELD_ALLOCSIZE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllocSizeDirty() {
        return this._contains(DTOFIELD_ALLOCSIZE);
    }

    @JsonIgnore
    public void resetAllocSize() {
        this._reset(DTOFIELD_ALLOCSIZE);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO allocsize(Integer allocSize) {
        this.setAllocSize(allocSize);
        return this;
    }

    @JsonProperty(value="connstr")
    public void setConnStr(String connStr) {
        this._set(DTOFIELD_CONNSTR, connStr);
    }

    @JsonIgnore
    public String getConnStr() {
        Object objValue = this._get(DTOFIELD_CONNSTR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConnStrDirty() {
        return this._contains(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public void resetConnStr() {
        this._reset(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO connstr(String connStr) {
        this.setConnStr(connStr);
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
    public PSDevCenterDBInstDTO createdate(Timestamp createDate) {
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
    public PSDevCenterDBInstDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbinstallpath")
    public void setDBInstallPath(String dBInstallPath) {
        this._set(DTOFIELD_DBINSTALLPATH, dBInstallPath);
    }

    @JsonIgnore
    public String getDBInstallPath() {
        Object objValue = this._get(DTOFIELD_DBINSTALLPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBInstallPathDirty() {
        return this._contains(DTOFIELD_DBINSTALLPATH);
    }

    @JsonIgnore
    public void resetDBInstallPath() {
        this._reset(DTOFIELD_DBINSTALLPATH);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO dbinstallpath(String dBInstallPath) {
        this.setDBInstallPath(dBInstallPath);
        return this;
    }

    @JsonProperty(value="dbname")
    public void setDBName(String dBName) {
        this._set(DTOFIELD_DBNAME, dBName);
    }

    @JsonIgnore
    public String getDBName() {
        Object objValue = this._get(DTOFIELD_DBNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBNameDirty() {
        return this._contains(DTOFIELD_DBNAME);
    }

    @JsonIgnore
    public void resetDBName() {
        this._reset(DTOFIELD_DBNAME);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO dbname(String dBName) {
        this.setDBName(dBName);
        return this;
    }

    @JsonProperty(value="dbport")
    public void setDBPort(Integer dBPort) {
        this._set(DTOFIELD_DBPORT, dBPort);
    }

    @JsonIgnore
    public Integer getDBPort() {
        Object objValue = this._get(DTOFIELD_DBPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDBPortDirty() {
        return this._contains(DTOFIELD_DBPORT);
    }

    @JsonIgnore
    public void resetDBPort() {
        this._reset(DTOFIELD_DBPORT);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO dbport(Integer dBPort) {
        this.setDBPort(dBPort);
        return this;
    }

    @JsonProperty(value="dbtype")
    public void setDBType(String dBType) {
        this._set(DTOFIELD_DBTYPE, dBType);
    }

    @JsonIgnore
    public String getDBType() {
        Object objValue = this._get(DTOFIELD_DBTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypeDirty() {
        return this._contains(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public void resetDBType() {
        this._reset(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO dbtype(String dBType) {
        this.setDBType(dBType);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO dbtype(PSModelEnums.DBType dBType) {
        this.setDBType(dBType == null ? null : dBType.value);
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
    public PSDevCenterDBInstDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="hostaddress")
    public void setHostAddress(String hostAddress) {
        this._set(DTOFIELD_HOSTADDRESS, hostAddress);
    }

    @JsonIgnore
    public String getHostAddress() {
        Object objValue = this._get(DTOFIELD_HOSTADDRESS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHostAddressDirty() {
        return this._contains(DTOFIELD_HOSTADDRESS);
    }

    @JsonIgnore
    public void resetHostAddress() {
        this._reset(DTOFIELD_HOSTADDRESS);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO hostaddress(String hostAddress) {
        this.setHostAddress(hostAddress);
        return this;
    }

    @JsonProperty(value="hostpasswd")
    public void setHostPassWd(String hostPassWd) {
        this._set(DTOFIELD_HOSTPASSWD, hostPassWd);
    }

    @JsonIgnore
    public String getHostPassWd() {
        Object objValue = this._get(DTOFIELD_HOSTPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHostPassWdDirty() {
        return this._contains(DTOFIELD_HOSTPASSWD);
    }

    @JsonIgnore
    public void resetHostPassWd() {
        this._reset(DTOFIELD_HOSTPASSWD);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO hostpasswd(String hostPassWd) {
        this.setHostPassWd(hostPassWd);
        return this;
    }

    @JsonProperty(value="hostport")
    public void setHostPort(Integer hostPort) {
        this._set(DTOFIELD_HOSTPORT, hostPort);
    }

    @JsonIgnore
    public Integer getHostPort() {
        Object objValue = this._get(DTOFIELD_HOSTPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHostPortDirty() {
        return this._contains(DTOFIELD_HOSTPORT);
    }

    @JsonIgnore
    public void resetHostPort() {
        this._reset(DTOFIELD_HOSTPORT);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO hostport(Integer hostPort) {
        this.setHostPort(hostPort);
        return this;
    }

    @JsonProperty(value="hostsshport")
    public void setHostSSHPort(Integer hostSSHPort) {
        this._set(DTOFIELD_HOSTSSHPORT, hostSSHPort);
    }

    @JsonIgnore
    public Integer getHostSSHPort() {
        Object objValue = this._get(DTOFIELD_HOSTSSHPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHostSSHPortDirty() {
        return this._contains(DTOFIELD_HOSTSSHPORT);
    }

    @JsonIgnore
    public void resetHostSSHPort() {
        this._reset(DTOFIELD_HOSTSSHPORT);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO hostsshport(Integer hostSSHPort) {
        this.setHostSSHPort(hostSSHPort);
        return this;
    }

    @JsonProperty(value="hostusername")
    public void setHostUserName(String hostUserName) {
        this._set(DTOFIELD_HOSTUSERNAME, hostUserName);
    }

    @JsonIgnore
    public String getHostUserName() {
        Object objValue = this._get(DTOFIELD_HOSTUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHostUserNameDirty() {
        return this._contains(DTOFIELD_HOSTUSERNAME);
    }

    @JsonIgnore
    public void resetHostUserName() {
        this._reset(DTOFIELD_HOSTUSERNAME);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO hostusername(String hostUserName) {
        this.setHostUserName(hostUserName);
        return this;
    }

    @JsonProperty(value="lockobjid")
    public void setLockObjId(String lockObjId) {
        this._set(DTOFIELD_LOCKOBJID, lockObjId);
    }

    @JsonIgnore
    public String getLockObjId() {
        Object objValue = this._get(DTOFIELD_LOCKOBJID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLockObjIdDirty() {
        return this._contains(DTOFIELD_LOCKOBJID);
    }

    @JsonIgnore
    public void resetLockObjId() {
        this._reset(DTOFIELD_LOCKOBJID);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO lockobjid(String lockObjId) {
        this.setLockObjId(lockObjId);
        return this;
    }

    @JsonProperty(value="lockobjtype")
    public void setLockObjType(String lockObjType) {
        this._set(DTOFIELD_LOCKOBJTYPE, lockObjType);
    }

    @JsonIgnore
    public String getLockObjType() {
        Object objValue = this._get(DTOFIELD_LOCKOBJTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLockObjTypeDirty() {
        return this._contains(DTOFIELD_LOCKOBJTYPE);
    }

    @JsonIgnore
    public void resetLockObjType() {
        this._reset(DTOFIELD_LOCKOBJTYPE);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO lockobjtype(String lockObjType) {
        this.setLockObjType(lockObjType);
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
    public PSDevCenterDBInstDTO memo(String memo) {
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
    public PSDevCenterDBInstDTO passwd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    @JsonProperty(value="psdbdevinstid")
    public void setPSDBDevInstId(String pSDBDevInstId) {
        this._set(DTOFIELD_PSDBDEVINSTID, pSDBDevInstId);
    }

    @JsonIgnore
    public String getPSDBDevInstId() {
        Object objValue = this._get(DTOFIELD_PSDBDEVINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBDevInstIdDirty() {
        return this._contains(DTOFIELD_PSDBDEVINSTID);
    }

    @JsonIgnore
    public void resetPSDBDevInstId() {
        this._reset(DTOFIELD_PSDBDEVINSTID);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdbdevinstid(String pSDBDevInstId) {
        this.setPSDBDevInstId(pSDBDevInstId);
        return this;
    }

    @JsonProperty(value="psdbdevinstname")
    public void setPSDBDevInstName(String pSDBDevInstName) {
        this._set(DTOFIELD_PSDBDEVINSTNAME, pSDBDevInstName);
    }

    @JsonIgnore
    public String getPSDBDevInstName() {
        Object objValue = this._get(DTOFIELD_PSDBDEVINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBDevInstNameDirty() {
        return this._contains(DTOFIELD_PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public void resetPSDBDevInstName() {
        this._reset(DTOFIELD_PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdbdevinstname(String pSDBDevInstName) {
        this.setPSDBDevInstName(pSDBDevInstName);
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
    public PSDevCenterDBInstDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdcclusterid(PSDCClusterDTO pSDCCluster) {
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
    public PSDevCenterDBInstDTO psdcclustername(String pSDCClusterName) {
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
    public PSDevCenterDBInstDTO psdccontainerspecid(String pSDCContainerSpecId) {
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
    public PSDevCenterDBInstDTO psdccontainerspecname(String pSDCContainerSpecName) {
        this.setPSDCContainerSpecName(pSDCContainerSpecName);
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
    public PSDevCenterDBInstDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdcfileid(PSDCFileDTO pSDCFile) {
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
    public PSDevCenterDBInstDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
        return this;
    }

    @JsonProperty(value="psdevcenterasid")
    public void setPSDevCenterASId(String pSDevCenterASId) {
        this._set(DTOFIELD_PSDEVCENTERASID, pSDevCenterASId);
    }

    @JsonIgnore
    public String getPSDevCenterASId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASID);
    }

    @JsonIgnore
    public void resetPSDevCenterASId() {
        this._reset(DTOFIELD_PSDEVCENTERASID);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdevcenterasid(String pSDevCenterASId) {
        this.setPSDevCenterASId(pSDevCenterASId);
        return this;
    }

    @JsonProperty(value="psdevcenterasname")
    public void setPSDevCenterASName(String pSDevCenterASName) {
        this._set(DTOFIELD_PSDEVCENTERASNAME, pSDevCenterASName);
    }

    @JsonIgnore
    public String getPSDevCenterASName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterASName() {
        this._reset(DTOFIELD_PSDEVCENTERASNAME);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdevcenterasname(String pSDevCenterASName) {
        this.setPSDevCenterASName(pSDevCenterASName);
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
    public PSDevCenterDBInstDTO psdevcenterdbinstid(String pSDevCenterDBInstId) {
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
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
    public PSDevCenterDBInstDTO psdevcenterdbinstname(String pSDevCenterDBInstName) {
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
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
    public PSDevCenterDBInstDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDevCenterDBInstDTO psdevcentername(String pSDevCenterName) {
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
    public PSDevCenterDBInstDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDevCenterDBInstDTO psdevslnname(String pSDevSlnName) {
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
    public PSDevCenterDBInstDTO refcount(Integer refCount) {
        this.setRefCount(refCount);
        return this;
    }

    @JsonProperty(value="refinfo")
    public void setRefInfo(String refInfo) {
        this._set(DTOFIELD_REFINFO, refInfo);
    }

    @JsonIgnore
    public String getRefInfo() {
        Object objValue = this._get(DTOFIELD_REFINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefInfoDirty() {
        return this._contains(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public void resetRefInfo() {
        this._reset(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO refinfo(String refInfo) {
        this.setRefInfo(refInfo);
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
    public PSDevCenterDBInstDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO respos(PSModelEnums.DCResPos resPos) {
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
    public PSDevCenterDBInstDTO resreadytime(Timestamp resReadyTime) {
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
    public PSDevCenterDBInstDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO resstate(PSModelEnums.DCResState resState) {
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
    public PSDevCenterDBInstDTO resver(Integer resVer) {
        this.setResVer(resVer);
        return this;
    }

    @JsonProperty(value="sysmemo")
    public void setSysMemo(String sysMemo) {
        this._set(DTOFIELD_SYSMEMO, sysMemo);
    }

    @JsonIgnore
    public String getSysMemo() {
        Object objValue = this._get(DTOFIELD_SYSMEMO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysMemoDirty() {
        return this._contains(DTOFIELD_SYSMEMO);
    }

    @JsonIgnore
    public void resetSysMemo() {
        this._reset(DTOFIELD_SYSMEMO);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO sysmemo(String sysMemo) {
        this.setSysMemo(sysMemo);
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
    public PSDevCenterDBInstDTO updatedate(Timestamp updateDate) {
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
    public PSDevCenterDBInstDTO updateman(String updateMan) {
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
    public PSDevCenterDBInstDTO uploadfilemode(String uploadFileMode) {
        this.setUploadFileMode(uploadFileMode);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO uploadfilemode(PSModelEnums.FileUploadMode uploadFileMode) {
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
    public PSDevCenterDBInstDTO uploadpath(String uploadPath) {
        this.setUploadPath(uploadPath);
        return this;
    }

    @JsonProperty(value="usagemode")
    public void setUsageMode(String usageMode) {
        this._set(DTOFIELD_USAGEMODE, usageMode);
    }

    @JsonIgnore
    public String getUsageMode() {
        Object objValue = this._get(DTOFIELD_USAGEMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUsageModeDirty() {
        return this._contains(DTOFIELD_USAGEMODE);
    }

    @JsonIgnore
    public void resetUsageMode() {
        this._reset(DTOFIELD_USAGEMODE);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO usagemode(String usageMode) {
        this.setUsageMode(usageMode);
        return this;
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO usagemode(PSModelEnums.ResUsageMode usageMode) {
        this.setUsageMode(usageMode == null ? null : usageMode.value);
        return this;
    }

    @JsonProperty(value="usedsize")
    public void setUsedSize(Integer usedSize) {
        this._set(DTOFIELD_USEDSIZE, usedSize);
    }

    @JsonIgnore
    public Integer getUsedSize() {
        Object objValue = this._get(DTOFIELD_USEDSIZE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUsedSizeDirty() {
        return this._contains(DTOFIELD_USEDSIZE);
    }

    @JsonIgnore
    public void resetUsedSize() {
        this._reset(DTOFIELD_USEDSIZE);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO usedsize(Integer usedSize) {
        this.setUsedSize(usedSize);
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
    public PSDevCenterDBInstDTO username(String userName) {
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
    public PSDevCenterDBInstDTO userparams(String userParams) {
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
    public PSDevCenterDBInstDTO usertag(String userTag) {
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
    public PSDevCenterDBInstDTO usertag2(String userTag2) {
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
    public PSDevCenterDBInstDTO usertag3(String userTag3) {
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
    public PSDevCenterDBInstDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevCenterDBInstName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevCenterDBInstName(strName);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO name(String strName) {
        this.setPSDevCenterDBInstName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevCenterDBInstId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevCenterDBInstId(strValue);
    }

    @JsonIgnore
    public PSDevCenterDBInstDTO id(String strValue) {
        this.setPSDevCenterDBInstId(strValue);
        return this;
    }

}
