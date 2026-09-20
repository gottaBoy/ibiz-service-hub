package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysBakDTO extends PSModelDTOBase {
    public static final String FIELD_ACCESSTOKEN = "ACCESSTOKEN";
    protected static final String DTOFIELD_ACCESSTOKEN = "accesstoken";
    public static final String FIELD_BACKUPFILEPATH = "BACKUPFILEPATH";
    protected static final String DTOFIELD_BACKUPFILEPATH = "backupfilepath";
    public static final String FIELD_BACKUPSIZE = "BACKUPSIZE";
    protected static final String DTOFIELD_BACKUPSIZE = "backupsize";
    public static final String FIELD_BACKUPSTATE = "BACKUPSTATE";
    protected static final String DTOFIELD_BACKUPSTATE = "backupstate";
    public static final String FIELD_BACKUPTIME = "BACKUPTIME";
    protected static final String DTOFIELD_BACKUPTIME = "backuptime";
    public static final String FIELD_BEGINBACKUPTIME = "BEGINBACKUPTIME";
    protected static final String DTOFIELD_BEGINBACKUPTIME = "beginbackuptime";
    public static final String FIELD_BACKUPMODE = "BKMODE";
    protected static final String DTOFIELD_BACKUPMODE = "backupmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_ENDBACKUPTIME = "ENDBACKUPTIME";
    protected static final String DTOFIELD_ENDBACKUPTIME = "endbackuptime";
    public static final String FIELD_LINKCODE = "LINKCODE";
    protected static final String DTOFIELD_LINKCODE = "linkcode";
    public static final String FIELD_LINKFLAG = "LINKFLAG";
    protected static final String DTOFIELD_LINKFLAG = "linkflag";
    public static final String FIELD_LINKREPMSG = "LINKREPMSG";
    protected static final String DTOFIELD_LINKREPMSG = "linkrepmsg";
    public static final String FIELD_LINKREQMSG = "LINKREQMSG";
    protected static final String DTOFIELD_LINKREQMSG = "linkreqmsg";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELVER = "MODELVER";
    protected static final String DTOFIELD_MODELVER = "modelver";
    public static final String FIELD_OFFLINEFLAG = "OFFLINEFLAG";
    protected static final String DTOFIELD_OFFLINEFLAG = "offlineflag";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSBAKID = "PSDEVSLNSYSBAKID";
    protected static final String DTOFIELD_PSDEVSLNSYSBAKID = "psdevslnsysbakid";
    public static final String FIELD_PSDEVSLNSYSBAKNAME = "PSDEVSLNSYSBAKNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSBAKNAME = "psdevslnsysbakname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSSYSMODELINSTID = "PSSYSMODELINSTID";
    protected static final String DTOFIELD_PSSYSMODELINSTID = "pssysmodelinstid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_PSTASKSERVERNAME = "PSTASKSERVERNAME";
    protected static final String DTOFIELD_PSTASKSERVERNAME = "pstaskservername";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="accesstoken")
    public void setAccessToken(String accessToken) {
        this._set(DTOFIELD_ACCESSTOKEN, accessToken);
    }

    @JsonIgnore
    public String getAccessToken() {
        Object objValue = this._get(DTOFIELD_ACCESSTOKEN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAccessTokenDirty() {
        return this._contains(DTOFIELD_ACCESSTOKEN);
    }

    @JsonIgnore
    public void resetAccessToken() {
        this._reset(DTOFIELD_ACCESSTOKEN);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO accesstoken(String accessToken) {
        this.setAccessToken(accessToken);
        return this;
    }

    @JsonProperty(value="backupfilepath")
    public void setBackupFilePath(String backupFilePath) {
        this._set(DTOFIELD_BACKUPFILEPATH, backupFilePath);
    }

    @JsonIgnore
    public String getBackupFilePath() {
        Object objValue = this._get(DTOFIELD_BACKUPFILEPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBackupFilePathDirty() {
        return this._contains(DTOFIELD_BACKUPFILEPATH);
    }

    @JsonIgnore
    public void resetBackupFilePath() {
        this._reset(DTOFIELD_BACKUPFILEPATH);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupfilepath(String backupFilePath) {
        this.setBackupFilePath(backupFilePath);
        return this;
    }

    @JsonProperty(value="backupsize")
    public void setBackupSize(Integer backupSize) {
        this._set(DTOFIELD_BACKUPSIZE, backupSize);
    }

    @JsonIgnore
    public Integer getBackupSize() {
        Object objValue = this._get(DTOFIELD_BACKUPSIZE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBackupSizeDirty() {
        return this._contains(DTOFIELD_BACKUPSIZE);
    }

    @JsonIgnore
    public void resetBackupSize() {
        this._reset(DTOFIELD_BACKUPSIZE);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupsize(Integer backupSize) {
        this.setBackupSize(backupSize);
        return this;
    }

    @JsonProperty(value="backupstate")
    public void setBackupState(Integer backupState) {
        this._set(DTOFIELD_BACKUPSTATE, backupState);
    }

    @JsonIgnore
    public Integer getBackupState() {
        Object objValue = this._get(DTOFIELD_BACKUPSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBackupStateDirty() {
        return this._contains(DTOFIELD_BACKUPSTATE);
    }

    @JsonIgnore
    public void resetBackupState() {
        this._reset(DTOFIELD_BACKUPSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupstate(Integer backupState) {
        this.setBackupState(backupState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupstate(PSModelEnums.DevSlnSysBKState backupState) {
        this.setBackupState(backupState == null ? null : backupState.value);
        return this;
    }

    @JsonProperty(value="backuptime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBackupTime(Timestamp backupTime) {
        this._set(DTOFIELD_BACKUPTIME, backupTime);
    }

    @JsonIgnore
    public Timestamp getBackupTime() {
        Object objValue = this._get(DTOFIELD_BACKUPTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBackupTimeDirty() {
        return this._contains(DTOFIELD_BACKUPTIME);
    }

    @JsonIgnore
    public void resetBackupTime() {
        this._reset(DTOFIELD_BACKUPTIME);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backuptime(Timestamp backupTime) {
        this.setBackupTime(backupTime);
        return this;
    }

    @JsonProperty(value="beginbackuptime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBeginBackupTime(Timestamp beginBackupTime) {
        this._set(DTOFIELD_BEGINBACKUPTIME, beginBackupTime);
    }

    @JsonIgnore
    public Timestamp getBeginBackupTime() {
        Object objValue = this._get(DTOFIELD_BEGINBACKUPTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBeginBackupTimeDirty() {
        return this._contains(DTOFIELD_BEGINBACKUPTIME);
    }

    @JsonIgnore
    public void resetBeginBackupTime() {
        this._reset(DTOFIELD_BEGINBACKUPTIME);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO beginbackuptime(Timestamp beginBackupTime) {
        this.setBeginBackupTime(beginBackupTime);
        return this;
    }

    @JsonProperty(value="backupmode")
    public void setBackupMode(String backupMode) {
        this._set(DTOFIELD_BACKUPMODE, backupMode);
        this._set(FIELD_BACKUPMODE, backupMode);
    }

    @JsonIgnore
    public String getBackupMode() {
        Object objValue = this._get(DTOFIELD_BACKUPMODE);
        if (objValue == null) objValue = this._get(FIELD_BACKUPMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBackupModeDirty() {
        return this._contains(DTOFIELD_BACKUPMODE) || this._contains(FIELD_BACKUPMODE);
    }

    @JsonIgnore
    public void resetBackupMode() {
        this._reset(DTOFIELD_BACKUPMODE);
        this._reset(FIELD_BACKUPMODE);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupmode(String backupMode) {
        this.setBackupMode(backupMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO backupmode(PSModelEnums.DevSlnSysBKMode backupMode) {
        this.setBackupMode(backupMode == null ? null : backupMode.value);
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
    public PSDevSlnSysBakDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysBakDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO enablelink(Boolean enableLink) {
        this.setEnableLink(enableLink == null ? null : (enableLink ? 1 : 0));
        return this;
    }

    @JsonProperty(value="endbackuptime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndBackupTime(Timestamp endBackupTime) {
        this._set(DTOFIELD_ENDBACKUPTIME, endBackupTime);
    }

    @JsonIgnore
    public Timestamp getEndBackupTime() {
        Object objValue = this._get(DTOFIELD_ENDBACKUPTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndBackupTimeDirty() {
        return this._contains(DTOFIELD_ENDBACKUPTIME);
    }

    @JsonIgnore
    public void resetEndBackupTime() {
        this._reset(DTOFIELD_ENDBACKUPTIME);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO endbackuptime(Timestamp endBackupTime) {
        this.setEndBackupTime(endBackupTime);
        return this;
    }

    @JsonProperty(value="linkcode")
    public void setLinkCode(String linkCode) {
        this._set(DTOFIELD_LINKCODE, linkCode);
    }

    @JsonIgnore
    public String getLinkCode() {
        Object objValue = this._get(DTOFIELD_LINKCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkCodeDirty() {
        return this._contains(DTOFIELD_LINKCODE);
    }

    @JsonIgnore
    public void resetLinkCode() {
        this._reset(DTOFIELD_LINKCODE);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO linkcode(String linkCode) {
        this.setLinkCode(linkCode);
        return this;
    }

    @JsonProperty(value="linkflag")
    public void setLinkFlag(Integer linkFlag) {
        this._set(DTOFIELD_LINKFLAG, linkFlag);
    }

    @JsonIgnore
    public Integer getLinkFlag() {
        Object objValue = this._get(DTOFIELD_LINKFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLinkFlagDirty() {
        return this._contains(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public void resetLinkFlag() {
        this._reset(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO linkflag(Integer linkFlag) {
        this.setLinkFlag(linkFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO linkflag(Boolean linkFlag) {
        this.setLinkFlag(linkFlag == null ? null : (linkFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="linkrepmsg")
    public void setLinkRepMsg(String linkRepMsg) {
        this._set(DTOFIELD_LINKREPMSG, linkRepMsg);
    }

    @JsonIgnore
    public String getLinkRepMsg() {
        Object objValue = this._get(DTOFIELD_LINKREPMSG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkRepMsgDirty() {
        return this._contains(DTOFIELD_LINKREPMSG);
    }

    @JsonIgnore
    public void resetLinkRepMsg() {
        this._reset(DTOFIELD_LINKREPMSG);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO linkrepmsg(String linkRepMsg) {
        this.setLinkRepMsg(linkRepMsg);
        return this;
    }

    @JsonProperty(value="linkreqmsg")
    public void setLinkReqMsg(String linkReqMsg) {
        this._set(DTOFIELD_LINKREQMSG, linkReqMsg);
    }

    @JsonIgnore
    public String getLinkReqMsg() {
        Object objValue = this._get(DTOFIELD_LINKREQMSG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkReqMsgDirty() {
        return this._contains(DTOFIELD_LINKREQMSG);
    }

    @JsonIgnore
    public void resetLinkReqMsg() {
        this._reset(DTOFIELD_LINKREQMSG);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO linkreqmsg(String linkReqMsg) {
        this.setLinkReqMsg(linkReqMsg);
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
    public PSDevSlnSysBakDTO memo(String memo) {
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
        if (objValue == null) return null;
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
    public PSDevSlnSysBakDTO modelver(Integer modelVer) {
        this.setModelVer(modelVer);
        return this;
    }

    @JsonProperty(value="offlineflag")
    public void setOfflineFlag(Integer offlineFlag) {
        this._set(DTOFIELD_OFFLINEFLAG, offlineFlag);
    }

    @JsonIgnore
    public Integer getOfflineFlag() {
        Object objValue = this._get(DTOFIELD_OFFLINEFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOfflineFlagDirty() {
        return this._contains(DTOFIELD_OFFLINEFLAG);
    }

    @JsonIgnore
    public void resetOfflineFlag() {
        this._reset(DTOFIELD_OFFLINEFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO offlineflag(Integer offlineFlag) {
        this.setOfflineFlag(offlineFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO offlineflag(Boolean offlineFlag) {
        this.setOfflineFlag(offlineFlag == null ? null : (offlineFlag ? 1 : 0));
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
    public PSDevSlnSysBakDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDevSlnSysBakDTO psdevcentername(String pSDevCenterName) {
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
    public PSDevSlnSysBakDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnsysbakid")
    public void setPSDevSlnSysBakId(String pSDevSlnSysBakId) {
        this._set(DTOFIELD_PSDEVSLNSYSBAKID, pSDevSlnSysBakId);
    }

    @JsonIgnore
    public String getPSDevSlnSysBakId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSBAKID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysBakIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSBAKID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysBakId() {
        this._reset(DTOFIELD_PSDEVSLNSYSBAKID);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysbakid(String pSDevSlnSysBakId) {
        this.setPSDevSlnSysBakId(pSDevSlnSysBakId);
        return this;
    }

    @JsonProperty(value="psdevslnsysbakname")
    public void setPSDevSlnSysBakName(String pSDevSlnSysBakName) {
        this._set(DTOFIELD_PSDEVSLNSYSBAKNAME, pSDevSlnSysBakName);
    }

    @JsonIgnore
    public String getPSDevSlnSysBakName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSBAKNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysBakNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSBAKNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysBakName() {
        this._reset(DTOFIELD_PSDEVSLNSYSBAKNAME);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysbakname(String pSDevSlnSysBakName) {
        this.setPSDevSlnSysBakName(pSDevSlnSysBakName);
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
    public PSDevSlnSysBakDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
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
    public PSDevSlnSysBakDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="pssysmodelinstid")
    public void setPSSysModelInstId(String pSSysModelInstId) {
        this._set(DTOFIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }

    @JsonIgnore
    public String getPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public void resetPSSysModelInstId() {
        this._reset(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO pssysmodelinstid(String pSSysModelInstId) {
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    @JsonProperty(value="pstaskserverid")
    public void setPSTaskServerId(String pSTaskServerId) {
        this._set(DTOFIELD_PSTASKSERVERID, pSTaskServerId);
    }

    @JsonIgnore
    public String getPSTaskServerId() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTaskServerIdDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public void resetPSTaskServerId() {
        this._reset(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO pstaskserverid(String pSTaskServerId) {
        this.setPSTaskServerId(pSTaskServerId);
        return this;
    }

    @JsonProperty(value="pstaskservername")
    public void setPSTaskServerName(String pSTaskServerName) {
        this._set(DTOFIELD_PSTASKSERVERNAME, pSTaskServerName);
    }

    @JsonIgnore
    public String getPSTaskServerName() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTaskServerNameDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERNAME);
    }

    @JsonIgnore
    public void resetPSTaskServerName() {
        this._reset(DTOFIELD_PSTASKSERVERNAME);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO pstaskservername(String pSTaskServerName) {
        this.setPSTaskServerName(pSTaskServerName);
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
    public PSDevSlnSysBakDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysBakDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysBakName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysBakName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO name(String strName) {
        this.setPSDevSlnSysBakName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysBakId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysBakId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysBakDTO id(String strValue) {
        this.setPSDevSlnSysBakId(strValue);
        return this;
    }

}
