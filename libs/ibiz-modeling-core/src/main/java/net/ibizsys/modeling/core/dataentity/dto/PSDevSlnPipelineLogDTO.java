package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnPipelineLogDTO extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAMS = "ACTIONPARAMS";
    protected static final String DTOFIELD_ACTIONPARAMS = "actionparams";
    public static final String FIELD_ACTIONRESULT = "ACTIONRESULT";
    protected static final String DTOFIELD_ACTIONRESULT = "actionresult";
    public static final String FIELD_ACTIONSTATE = "ACTIONSTATE";
    protected static final String DTOFIELD_ACTIONSTATE = "actionstate";
    public static final String FIELD_BEGINTIME = "BEGINTIME";
    protected static final String DTOFIELD_BEGINTIME = "begintime";
    public static final String FIELD_BUILDNUMBER = "BUILDNUMBER";
    protected static final String DTOFIELD_BUILDNUMBER = "buildnumber";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DURATION = "DURATION";
    protected static final String DTOFIELD_DURATION = "duration";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_PPSDEVSLNPIPELINELOGID = "PPSDEVSLNPIPELINELOGID";
    protected static final String DTOFIELD_PPSDEVSLNPIPELINELOGID = "ppsdevslnpipelinelogid";
    public static final String FIELD_PPSDEVSLNPIPELINELOGNAME = "PPSDEVSLNPIPELINELOGNAME";
    protected static final String DTOFIELD_PPSDEVSLNPIPELINELOGNAME = "ppsdevslnpipelinelogname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINELOGID = "PSDEVSLNPIPELINELOGID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINELOGID = "psdevslnpipelinelogid";
    public static final String FIELD_PSDEVSLNPIPELINELOGNAME = "PSDEVSLNPIPELINELOGNAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINELOGNAME = "psdevslnpipelinelogname";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
    public static final String FIELD_PSDEVSLNPIPELINEREFID = "PSDEVSLNPIPELINEREFID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEREFID = "psdevslnpipelinerefid";
    public static final String FIELD_PSDEVSLNPIPELINEREFNAME = "PSDEVSLNPIPELINEREFNAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEREFNAME = "psdevslnpipelinerefname";
    public static final String FIELD_PSDEVSLNPIPELINESTAGEID = "PSDEVSLNPIPELINESTAGEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGEID = "psdevslnpipelinestageid";
    public static final String FIELD_PSDEVSLNPIPELINESTAGENAME = "PSDEVSLNPIPELINESTAGENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGENAME = "psdevslnpipelinestagename";
    public static final String FIELD_PSDEVSLNPIPELINESTEPID = "PSDEVSLNPIPELINESTEPID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTEPID = "psdevslnpipelinestepid";
    public static final String FIELD_PSDEVSLNPIPELINESTEPNAME = "PSDEVSLNPIPELINESTEPNAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTEPNAME = "psdevslnpipelinestepname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_QUEUEURL = "QUEUEURL";
    protected static final String DTOFIELD_QUEUEURL = "queueurl";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="actionparams")
    public void setActionParams(String actionParams) {
        this._set(DTOFIELD_ACTIONPARAMS, actionParams);
    }

    @JsonIgnore
    public String getActionParams() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamsDirty() {
        return this._contains(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public void resetActionParams() {
        this._reset(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO actionparams(String actionParams) {
        this.setActionParams(actionParams);
        return this;
    }

    @JsonProperty(value="actionresult")
    public void setActionResult(String actionResult) {
        this._set(DTOFIELD_ACTIONRESULT, actionResult);
    }

    @JsonIgnore
    public String getActionResult() {
        Object objValue = this._get(DTOFIELD_ACTIONRESULT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionResultDirty() {
        return this._contains(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public void resetActionResult() {
        this._reset(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO actionresult(String actionResult) {
        this.setActionResult(actionResult);
        return this;
    }

    @JsonProperty(value="actionstate")
    public void setActionState(Integer actionState) {
        this._set(DTOFIELD_ACTIONSTATE, actionState);
    }

    @JsonIgnore
    public Integer getActionState() {
        Object objValue = this._get(DTOFIELD_ACTIONSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionStateDirty() {
        return this._contains(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public void resetActionState() {
        this._reset(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO actionstate(Integer actionState) {
        this.setActionState(actionState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO actionstate(PSModelEnums.SysDevBKTaskState actionState) {
        this.setActionState(actionState == null ? null : actionState.value);
        return this;
    }

    @JsonProperty(value="begintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBeginTime(Timestamp beginTime) {
        this._set(DTOFIELD_BEGINTIME, beginTime);
    }

    @JsonIgnore
    public Timestamp getBeginTime() {
        Object objValue = this._get(DTOFIELD_BEGINTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBeginTimeDirty() {
        return this._contains(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public void resetBeginTime() {
        this._reset(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO begintime(Timestamp beginTime) {
        this.setBeginTime(beginTime);
        return this;
    }

    @JsonProperty(value="buildnumber")
    public void setBuildNumber(Integer buildNumber) {
        this._set(DTOFIELD_BUILDNUMBER, buildNumber);
    }

    @JsonIgnore
    public Integer getBuildNumber() {
        Object objValue = this._get(DTOFIELD_BUILDNUMBER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBuildNumberDirty() {
        return this._contains(DTOFIELD_BUILDNUMBER);
    }

    @JsonIgnore
    public void resetBuildNumber() {
        this._reset(DTOFIELD_BUILDNUMBER);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO buildnumber(Integer buildNumber) {
        this.setBuildNumber(buildNumber);
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
    public PSDevSlnPipelineLogDTO createdate(Timestamp createDate) {
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
    public PSDevSlnPipelineLogDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="duration")
    public void setDuration(Integer duration) {
        this._set(DTOFIELD_DURATION, duration);
    }

    @JsonIgnore
    public Integer getDuration() {
        Object objValue = this._get(DTOFIELD_DURATION);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDurationDirty() {
        return this._contains(DTOFIELD_DURATION);
    }

    @JsonIgnore
    public void resetDuration() {
        this._reset(DTOFIELD_DURATION);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO duration(Integer duration) {
        this.setDuration(duration);
        return this;
    }

    @JsonProperty(value="endtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndTime(Timestamp endTime) {
        this._set(DTOFIELD_ENDTIME, endTime);
    }

    @JsonIgnore
    public Timestamp getEndTime() {
        Object objValue = this._get(DTOFIELD_ENDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndTimeDirty() {
        return this._contains(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public void resetEndTime() {
        this._reset(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO endtime(Timestamp endTime) {
        this.setEndTime(endTime);
        return this;
    }

    @JsonProperty(value="ppsdevslnpipelinelogid")
    public void setPPSDevSlnPipelineLogId(String pPSDevSlnPipelineLogId) {
        this._set(DTOFIELD_PPSDEVSLNPIPELINELOGID, pPSDevSlnPipelineLogId);
    }

    @JsonIgnore
    public String getPPSDevSlnPipelineLogId() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNPIPELINELOGID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnPipelineLogIdDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNPIPELINELOGID);
    }

    @JsonIgnore
    public void resetPPSDevSlnPipelineLogId() {
        this._reset(DTOFIELD_PPSDEVSLNPIPELINELOGID);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO ppsdevslnpipelinelogid(String pPSDevSlnPipelineLogId) {
        this.setPPSDevSlnPipelineLogId(pPSDevSlnPipelineLogId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO ppsdevslnpipelinelogid(PSDevSlnPipelineLogDTO pSDevSlnPipelineLog) {
        if (pSDevSlnPipelineLog == null) {
            this.setPPSDevSlnPipelineLogId(null);
            this.setPPSDevSlnPipelineLogName(null);
        } else {
            this.setPPSDevSlnPipelineLogId(pSDevSlnPipelineLog.getPSDevSlnPipelineLogId());
            this.setPPSDevSlnPipelineLogName(pSDevSlnPipelineLog.getPSDevSlnPipelineLogName());
        }
        return this;
    }

    @JsonProperty(value="ppsdevslnpipelinelogname")
    public void setPPSDevSlnPipelineLogName(String pPSDevSlnPipelineLogName) {
        this._set(DTOFIELD_PPSDEVSLNPIPELINELOGNAME, pPSDevSlnPipelineLogName);
    }

    @JsonIgnore
    public String getPPSDevSlnPipelineLogName() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNPIPELINELOGNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnPipelineLogNameDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNPIPELINELOGNAME);
    }

    @JsonIgnore
    public void resetPPSDevSlnPipelineLogName() {
        this._reset(DTOFIELD_PPSDEVSLNPIPELINELOGNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO ppsdevslnpipelinelogname(String pPSDevSlnPipelineLogName) {
        this.setPPSDevSlnPipelineLogName(pPSDevSlnPipelineLogName);
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
    public PSDevSlnPipelineLogDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
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
    public PSDevSlnPipelineLogDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevCenterId(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevCenterId(pSDevSln.getPSDevCenterId());
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
    public PSDevSlnPipelineLogDTO psdevslnname(String pSDevSlnName) {
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
    public PSDevSlnPipelineLogDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
        if (pSDevSlnPipeline == null) {
            this.setPSDevSlnPipelineId(null);
            this.setPSDevSlnPipelineName(null);
        } else {
            this.setPSDevSlnPipelineId(pSDevSlnPipeline.getPSDevSlnPipelineId());
            this.setPSDevSlnPipelineName(pSDevSlnPipeline.getPSDevSlnPipelineName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinelogid")
    public void setPSDevSlnPipelineLogId(String pSDevSlnPipelineLogId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINELOGID, pSDevSlnPipelineLogId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineLogId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINELOGID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineLogIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINELOGID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineLogId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINELOGID);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinelogid(String pSDevSlnPipelineLogId) {
        this.setPSDevSlnPipelineLogId(pSDevSlnPipelineLogId);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinelogname")
    public void setPSDevSlnPipelineLogName(String pSDevSlnPipelineLogName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINELOGNAME, pSDevSlnPipelineLogName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineLogName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINELOGNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineLogNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINELOGNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineLogName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINELOGNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinelogname(String pSDevSlnPipelineLogName) {
        this.setPSDevSlnPipelineLogName(pSDevSlnPipelineLogName);
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
    public PSDevSlnPipelineLogDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
        this.setPSDevSlnPipelineName(pSDevSlnPipelineName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinerefid")
    public void setPSDevSlnPipelineRefId(String pSDevSlnPipelineRefId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINEREFID, pSDevSlnPipelineRefId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineRefId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINEREFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineRefIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINEREFID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineRefId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINEREFID);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinerefid(String pSDevSlnPipelineRefId) {
        this.setPSDevSlnPipelineRefId(pSDevSlnPipelineRefId);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinerefname")
    public void setPSDevSlnPipelineRefName(String pSDevSlnPipelineRefName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINEREFNAME, pSDevSlnPipelineRefName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineRefName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINEREFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineRefNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINEREFNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineRefName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINEREFNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinerefname(String pSDevSlnPipelineRefName) {
        this.setPSDevSlnPipelineRefName(pSDevSlnPipelineRefName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestageid")
    public void setPSDevSlnPipelineStageId(String pSDevSlnPipelineStageId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTAGEID, pSDevSlnPipelineStageId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStageId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStageIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStageId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestageid(String pSDevSlnPipelineStageId) {
        this.setPSDevSlnPipelineStageId(pSDevSlnPipelineStageId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestageid(PSDevSlnPipelineStageDTO pSDevSlnPipelineStage) {
        if (pSDevSlnPipelineStage == null) {
            this.setPSDevSlnPipelineStageId(null);
            this.setPSDevSlnPipelineStageName(null);
        } else {
            this.setPSDevSlnPipelineStageId(pSDevSlnPipelineStage.getPSDevSlnPipelineStageId());
            this.setPSDevSlnPipelineStageName(pSDevSlnPipelineStage.getPSDevSlnPipelineStageName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestagename")
    public void setPSDevSlnPipelineStageName(String pSDevSlnPipelineStageName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTAGENAME, pSDevSlnPipelineStageName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStageName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStageNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStageName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestagename(String pSDevSlnPipelineStageName) {
        this.setPSDevSlnPipelineStageName(pSDevSlnPipelineStageName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestepid")
    public void setPSDevSlnPipelineStepId(String pSDevSlnPipelineStepId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTEPID, pSDevSlnPipelineStepId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStepId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTEPID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStepIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTEPID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStepId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTEPID);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestepid(String pSDevSlnPipelineStepId) {
        this.setPSDevSlnPipelineStepId(pSDevSlnPipelineStepId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestepid(PSDevSlnPipelineStepDTO pSDevSlnPipelineStep) {
        if (pSDevSlnPipelineStep == null) {
            this.setPSDevSlnPipelineStepId(null);
            this.setPSDevSlnPipelineStepName(null);
        } else {
            this.setPSDevSlnPipelineStepId(pSDevSlnPipelineStep.getPSDevSlnPipelineStepId());
            this.setPSDevSlnPipelineStepName(pSDevSlnPipelineStep.getPSDevSlnPipelineStepName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestepname")
    public void setPSDevSlnPipelineStepName(String pSDevSlnPipelineStepName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTEPNAME, pSDevSlnPipelineStepName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStepName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStepNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStepName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnpipelinestepname(String pSDevSlnPipelineStepName) {
        this.setPSDevSlnPipelineStepName(pSDevSlnPipelineStepName);
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
    public PSDevSlnPipelineLogDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDevSlnPipelineLogDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="queueurl")
    public void setQueueUrl(String queueUrl) {
        this._set(DTOFIELD_QUEUEURL, queueUrl);
    }

    @JsonIgnore
    public String getQueueUrl() {
        Object objValue = this._get(DTOFIELD_QUEUEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueueUrlDirty() {
        return this._contains(DTOFIELD_QUEUEURL);
    }

    @JsonIgnore
    public void resetQueueUrl() {
        this._reset(DTOFIELD_QUEUEURL);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO queueurl(String queueUrl) {
        this.setQueueUrl(queueUrl);
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
    public PSDevSlnPipelineLogDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnPipelineLogDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnPipelineLogName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnPipelineLogName(strName);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO name(String strName) {
        this.setPSDevSlnPipelineLogName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnPipelineLogId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnPipelineLogId(strValue);
    }

    @JsonIgnore
    public PSDevSlnPipelineLogDTO id(String strValue) {
        this.setPSDevSlnPipelineLogId(strValue);
        return this;
    }

}
