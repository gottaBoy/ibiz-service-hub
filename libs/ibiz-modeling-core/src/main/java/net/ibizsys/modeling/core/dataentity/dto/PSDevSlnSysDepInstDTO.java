package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysDepInstDTO extends PSModelDTOBase {
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
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEPINSTSTATE = "DEPINSTSTATE";
    protected static final String DTOFIELD_DEPINSTSTATE = "depinststate";
    public static final String FIELD_ENDBACKUPTIME = "ENDBACKUPTIME";
    protected static final String DTOFIELD_ENDBACKUPTIME = "endbackuptime";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_INSTPSDEVCENTERSVNID = "INSTPSDEVCENTERSVNID";
    protected static final String DTOFIELD_INSTPSDEVCENTERSVNID = "instpsdevcentersvnid";
    public static final String FIELD_INSTPSDEVCENTERSVNNAME = "INSTPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_INSTPSDEVCENTERSVNNAME = "instpsdevcentersvnname";
    public static final String FIELD_INSTTAG = "INSTTAG";
    protected static final String DTOFIELD_INSTTAG = "insttag";
    public static final String FIELD_INSTTAG2 = "INSTTAG2";
    protected static final String DTOFIELD_INSTTAG2 = "insttag2";
    public static final String FIELD_INSTTAG3 = "INSTTAG3";
    protected static final String DTOFIELD_INSTTAG3 = "insttag3";
    public static final String FIELD_INSTTAG4 = "INSTTAG4";
    protected static final String DTOFIELD_INSTTAG4 = "insttag4";
    public static final String FIELD_INSTVER = "INSTVER";
    protected static final String DTOFIELD_INSTVER = "instver";
    public static final String FIELD_LASTCHECKINTIME = "LASTCHECKINTIME";
    protected static final String DTOFIELD_LASTCHECKINTIME = "lastcheckintime";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELPSDEVCENTERSVNID = "MODELPSDEVCENTERSVNID";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNID = "modelpsdevcentersvnid";
    public static final String FIELD_MODELPSDEVCENTERSVNNAME = "MODELPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNNAME = "modelpsdevcentersvnname";
    public static final String FIELD_MODELVER = "MODELVER";
    protected static final String DTOFIELD_MODELVER = "modelver";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSDEPINSTID = "PSDEVSLNSYSDEPINSTID";
    protected static final String DTOFIELD_PSDEVSLNSYSDEPINSTID = "psdevslnsysdepinstid";
    public static final String FIELD_PSDEVSLNSYSDEPINSTNAME = "PSDEVSLNSYSDEPINSTNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSDEPINSTNAME = "psdevslnsysdepinstname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSSYSMODELINSTID = "PSSYSMODELINSTID";
    protected static final String DTOFIELD_PSSYSMODELINSTID = "pssysmodelinstid";
    public static final String FIELD_PSSYSMODELINSTNAME = "PSSYSMODELINSTNAME";
    protected static final String DTOFIELD_PSSYSMODELINSTNAME = "pssysmodelinstname";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_PSTASKSERVERNAME = "PSTASKSERVERNAME";
    protected static final String DTOFIELD_PSTASKSERVERNAME = "pstaskservername";
    public static final String FIELD_SINGLEINSTMODE = "SINGLEINSTMODE";
    protected static final String DTOFIELD_SINGLEINSTMODE = "singleinstmode";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSDevSlnSysDepInstDTO backupfilepath(String backupFilePath) {
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
    public PSDevSlnSysDepInstDTO backupsize(Integer backupSize) {
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
    public PSDevSlnSysDepInstDTO backupstate(Integer backupState) {
        this.setBackupState(backupState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO backupstate(PSModelEnums.DBInstBKState backupState) {
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
    public PSDevSlnSysDepInstDTO backuptime(Timestamp backupTime) {
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
    public PSDevSlnSysDepInstDTO beginbackuptime(Timestamp beginBackupTime) {
        this.setBeginBackupTime(beginBackupTime);
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
    public PSDevSlnSysDepInstDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysDepInstDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="depinststate")
    public void setDepInstState(Integer depInstState) {
        this._set(DTOFIELD_DEPINSTSTATE, depInstState);
    }

    @JsonIgnore
    public Integer getDepInstState() {
        Object objValue = this._get(DTOFIELD_DEPINSTSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDepInstStateDirty() {
        return this._contains(DTOFIELD_DEPINSTSTATE);
    }

    @JsonIgnore
    public void resetDepInstState() {
        this._reset(DTOFIELD_DEPINSTSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO depinststate(Integer depInstState) {
        this.setDepInstState(depInstState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO depinststate(PSModelEnums.DevSysState depInstState) {
        this.setDepInstState(depInstState == null ? null : depInstState.value);
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
    public PSDevSlnSysDepInstDTO endbackuptime(Timestamp endBackupTime) {
        this.setEndBackupTime(endBackupTime);
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
    public PSDevSlnSysDepInstDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="instpsdevcentersvnid")
    public void setInstPSDevCenterSVNId(String instPSDevCenterSVNId) {
        this._set(DTOFIELD_INSTPSDEVCENTERSVNID, instPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getInstPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_INSTPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_INSTPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetInstPSDevCenterSVNId() {
        this._reset(DTOFIELD_INSTPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO instpsdevcentersvnid(String instPSDevCenterSVNId) {
        this.setInstPSDevCenterSVNId(instPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO instpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setInstPSDevCenterSVNId(null);
            this.setInstPSDevCenterSVNName(null);
        } else {
            this.setInstPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setInstPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="instpsdevcentersvnname")
    public void setInstPSDevCenterSVNName(String instPSDevCenterSVNName) {
        this._set(DTOFIELD_INSTPSDEVCENTERSVNNAME, instPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getInstPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_INSTPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_INSTPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetInstPSDevCenterSVNName() {
        this._reset(DTOFIELD_INSTPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO instpsdevcentersvnname(String instPSDevCenterSVNName) {
        this.setInstPSDevCenterSVNName(instPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="insttag")
    public void setInstTag(String instTag) {
        this._set(DTOFIELD_INSTTAG, instTag);
    }

    @JsonIgnore
    public String getInstTag() {
        Object objValue = this._get(DTOFIELD_INSTTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTagDirty() {
        return this._contains(DTOFIELD_INSTTAG);
    }

    @JsonIgnore
    public void resetInstTag() {
        this._reset(DTOFIELD_INSTTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO insttag(String instTag) {
        this.setInstTag(instTag);
        return this;
    }

    @JsonProperty(value="insttag2")
    public void setInstTag2(String instTag2) {
        this._set(DTOFIELD_INSTTAG2, instTag2);
    }

    @JsonIgnore
    public String getInstTag2() {
        Object objValue = this._get(DTOFIELD_INSTTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag2Dirty() {
        return this._contains(DTOFIELD_INSTTAG2);
    }

    @JsonIgnore
    public void resetInstTag2() {
        this._reset(DTOFIELD_INSTTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO insttag2(String instTag2) {
        this.setInstTag2(instTag2);
        return this;
    }

    @JsonProperty(value="insttag3")
    public void setInstTag3(String instTag3) {
        this._set(DTOFIELD_INSTTAG3, instTag3);
    }

    @JsonIgnore
    public String getInstTag3() {
        Object objValue = this._get(DTOFIELD_INSTTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag3Dirty() {
        return this._contains(DTOFIELD_INSTTAG3);
    }

    @JsonIgnore
    public void resetInstTag3() {
        this._reset(DTOFIELD_INSTTAG3);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO insttag3(String instTag3) {
        this.setInstTag3(instTag3);
        return this;
    }

    @JsonProperty(value="insttag4")
    public void setInstTag4(String instTag4) {
        this._set(DTOFIELD_INSTTAG4, instTag4);
    }

    @JsonIgnore
    public String getInstTag4() {
        Object objValue = this._get(DTOFIELD_INSTTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag4Dirty() {
        return this._contains(DTOFIELD_INSTTAG4);
    }

    @JsonIgnore
    public void resetInstTag4() {
        this._reset(DTOFIELD_INSTTAG4);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO insttag4(String instTag4) {
        this.setInstTag4(instTag4);
        return this;
    }

    @JsonProperty(value="instver")
    public void setInstVer(Integer instVer) {
        this._set(DTOFIELD_INSTVER, instVer);
    }

    @JsonIgnore
    public Integer getInstVer() {
        Object objValue = this._get(DTOFIELD_INSTVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInstVerDirty() {
        return this._contains(DTOFIELD_INSTVER);
    }

    @JsonIgnore
    public void resetInstVer() {
        this._reset(DTOFIELD_INSTVER);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO instver(Integer instVer) {
        this.setInstVer(instVer);
        return this;
    }

    @JsonProperty(value="lastcheckintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastCheckinTime(Timestamp lastCheckinTime) {
        this._set(DTOFIELD_LASTCHECKINTIME, lastCheckinTime);
    }

    @JsonIgnore
    public Timestamp getLastCheckinTime() {
        Object objValue = this._get(DTOFIELD_LASTCHECKINTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastCheckinTimeDirty() {
        return this._contains(DTOFIELD_LASTCHECKINTIME);
    }

    @JsonIgnore
    public void resetLastCheckinTime() {
        this._reset(DTOFIELD_LASTCHECKINTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO lastcheckintime(Timestamp lastCheckinTime) {
        this.setLastCheckinTime(lastCheckinTime);
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
    public PSDevSlnSysDepInstDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnid")
    public void setModelPSDevCenterSVNId(String modelPSDevCenterSVNId) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNID, modelPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNId() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO modelpsdevcentersvnid(String modelPSDevCenterSVNId) {
        this.setModelPSDevCenterSVNId(modelPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO modelpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setModelPSDevCenterSVNId(null);
            this.setModelPSDevCenterSVNName(null);
        } else {
            this.setModelPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setModelPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnname")
    public void setModelPSDevCenterSVNName(String modelPSDevCenterSVNName) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNNAME, modelPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNName() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO modelpsdevcentersvnname(String modelPSDevCenterSVNName) {
        this.setModelPSDevCenterSVNName(modelPSDevCenterSVNName);
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
    public PSDevSlnSysDepInstDTO modelver(Integer modelVer) {
        this.setModelVer(modelVer);
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
    public PSDevSlnSysDepInstDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDevSlnSysDepInstDTO psdevcentername(String pSDevCenterName) {
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
    public PSDevSlnSysDepInstDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnsysdepinstid")
    public void setPSDevSlnSysDepInstId(String pSDevSlnSysDepInstId) {
        this._set(DTOFIELD_PSDEVSLNSYSDEPINSTID, pSDevSlnSysDepInstId);
    }

    @JsonIgnore
    public String getPSDevSlnSysDepInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDEPINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDepInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDEPINSTID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDepInstId() {
        this._reset(DTOFIELD_PSDEVSLNSYSDEPINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO psdevslnsysdepinstid(String pSDevSlnSysDepInstId) {
        this.setPSDevSlnSysDepInstId(pSDevSlnSysDepInstId);
        return this;
    }

    @JsonProperty(value="psdevslnsysdepinstname")
    public void setPSDevSlnSysDepInstName(String pSDevSlnSysDepInstName) {
        this._set(DTOFIELD_PSDEVSLNSYSDEPINSTNAME, pSDevSlnSysDepInstName);
    }

    @JsonIgnore
    public String getPSDevSlnSysDepInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDepInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDepInstName() {
        this._reset(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO psdevslnsysdepinstname(String pSDevSlnSysDepInstName) {
        this.setPSDevSlnSysDepInstName(pSDevSlnSysDepInstName);
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
    public PSDevSlnSysDepInstDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDevSlnSysDepInstDTO psdevslnsysname(String pSDevSlnSysName) {
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
    public PSDevSlnSysDepInstDTO pssysmodelinstid(String pSSysModelInstId) {
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO pssysmodelinstid(PSSysModelInstDTO pSSysModelInst) {
        if (pSSysModelInst == null) {
            this.setPSSysModelInstId(null);
            this.setPSSysModelInstName(null);
        } else {
            this.setPSSysModelInstId(pSSysModelInst.getPSSysModelInstId());
            this.setPSSysModelInstName(pSSysModelInst.getPSSysModelInstName());
        }
        return this;
    }

    @JsonProperty(value="pssysmodelinstname")
    public void setPSSysModelInstName(String pSSysModelInstName) {
        this._set(DTOFIELD_PSSYSMODELINSTNAME, pSSysModelInstName);
    }

    @JsonIgnore
    public String getPSSysModelInstName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public void resetPSSysModelInstName() {
        this._reset(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO pssysmodelinstname(String pSSysModelInstName) {
        this.setPSSysModelInstName(pSSysModelInstName);
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
    public PSDevSlnSysDepInstDTO pstaskserverid(String pSTaskServerId) {
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
    public PSDevSlnSysDepInstDTO pstaskservername(String pSTaskServerName) {
        this.setPSTaskServerName(pSTaskServerName);
        return this;
    }

    @JsonProperty(value="singleinstmode")
    public void setSingleInstMode(Integer singleInstMode) {
        this._set(DTOFIELD_SINGLEINSTMODE, singleInstMode);
    }

    @JsonIgnore
    public Integer getSingleInstMode() {
        Object objValue = this._get(DTOFIELD_SINGLEINSTMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSingleInstModeDirty() {
        return this._contains(DTOFIELD_SINGLEINSTMODE);
    }

    @JsonIgnore
    public void resetSingleInstMode() {
        this._reset(DTOFIELD_SINGLEINSTMODE);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO singleinstmode(Integer singleInstMode) {
        this.setSingleInstMode(singleInstMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO singleinstmode(Boolean singleInstMode) {
        this.setSingleInstMode(singleInstMode == null ? null : (singleInstMode ? 1 : 0));
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
    public PSDevSlnSysDepInstDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysDepInstDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysDepInstName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysDepInstName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO name(String strName) {
        this.setPSDevSlnSysDepInstName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysDepInstId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysDepInstId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysDepInstDTO id(String strValue) {
        this.setPSDevSlnSysDepInstId(strValue);
        return this;
    }

}
