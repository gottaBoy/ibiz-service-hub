package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCBKTaskDTO extends PSModelDTOBase {
    public static final String FIELD_BEGINTIME = "BEGINTIME";
    protected static final String DTOFIELD_BEGINTIME = "begintime";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_FULLRESULTINFO = "FULLRESULTINFO";
    protected static final String DTOFIELD_FULLRESULTINFO = "fullresultinfo";
    public static final String FIELD_LASTCALCTIME = "LASTCALCTIME";
    protected static final String DTOFIELD_LASTCALCTIME = "lastcalctime";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PLANPSDCROBOTID = "PLANPSDCROBOTID";
    protected static final String DTOFIELD_PLANPSDCROBOTID = "planpsdcrobotid";
    public static final String FIELD_PLANPSDCROBOTNAME = "PLANPSDCROBOTNAME";
    protected static final String DTOFIELD_PLANPSDCROBOTNAME = "planpsdcrobotname";
    public static final String FIELD_PSDCBKTASKID = "PSDCBKTASKID";
    protected static final String DTOFIELD_PSDCBKTASKID = "psdcbktaskid";
    public static final String FIELD_PSDCBKTASKNAME = "PSDCBKTASKNAME";
    protected static final String DTOFIELD_PSDCBKTASKNAME = "psdcbktaskname";
    public static final String FIELD_PSDCROBOTID = "PSDCROBOTID";
    protected static final String DTOFIELD_PSDCROBOTID = "psdcrobotid";
    public static final String FIELD_PSDCROBOTNAME = "PSDCROBOTNAME";
    protected static final String DTOFIELD_PSDCROBOTNAME = "psdcrobotname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_PSTASKSERVERNAME = "PSTASKSERVERNAME";
    protected static final String DTOFIELD_PSTASKSERVERNAME = "pstaskservername";
    public static final String FIELD_QUEUEINFO = "QUEUEINFO";
    protected static final String DTOFIELD_QUEUEINFO = "queueinfo";
    public static final String FIELD_REMAININGTIME = "REMAININGTIME";
    protected static final String DTOFIELD_REMAININGTIME = "remainingtime";
    public static final String FIELD_REMOTEADDR = "REMOTEADDR";
    protected static final String DTOFIELD_REMOTEADDR = "remoteaddr";
    public static final String FIELD_RESULTINFO = "RESULTINFO";
    protected static final String DTOFIELD_RESULTINFO = "resultinfo";
    public static final String FIELD_STEPINFO = "STEPINFO";
    protected static final String DTOFIELD_STEPINFO = "stepinfo";
    public static final String FIELD_TASKPARAM = "TASKPARAM";
    protected static final String DTOFIELD_TASKPARAM = "taskparam";
    public static final String FIELD_TASKPARAM2 = "TASKPARAM2";
    protected static final String DTOFIELD_TASKPARAM2 = "taskparam2";
    public static final String FIELD_TASKPARAM3 = "TASKPARAM3";
    protected static final String DTOFIELD_TASKPARAM3 = "taskparam3";
    public static final String FIELD_TASKPARAM4 = "TASKPARAM4";
    protected static final String DTOFIELD_TASKPARAM4 = "taskparam4";
    public static final String FIELD_TASKPARAMS = "TASKPARAMS";
    protected static final String DTOFIELD_TASKPARAMS = "taskparams";
    public static final String FIELD_TASKSTATE = "TASKSTATE";
    protected static final String DTOFIELD_TASKSTATE = "taskstate";
    public static final String FIELD_TASKTYPE = "TASKTYPE";
    protected static final String DTOFIELD_TASKTYPE = "tasktype";
    public static final String FIELD_TOTALTIME = "TOTALTIME";
    protected static final String DTOFIELD_TOTALTIME = "totaltime";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USEROBOTFLAG = "USEROBOTFLAG";
    protected static final String DTOFIELD_USEROBOTFLAG = "userobotflag";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";

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
    public PSDCBKTaskDTO begintime(Timestamp beginTime) {
        this.setBeginTime(beginTime);
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
    public PSDCBKTaskDTO createdate(Timestamp createDate) {
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
    public PSDCBKTaskDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDCBKTaskDTO endtime(Timestamp endTime) {
        this.setEndTime(endTime);
        return this;
    }

    @JsonProperty(value="fullresultinfo")
    public void setFullResultInfo(String fullResultInfo) {
        this._set(DTOFIELD_FULLRESULTINFO, fullResultInfo);
    }

    @JsonIgnore
    public String getFullResultInfo() {
        Object objValue = this._get(DTOFIELD_FULLRESULTINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFullResultInfoDirty() {
        return this._contains(DTOFIELD_FULLRESULTINFO);
    }

    @JsonIgnore
    public void resetFullResultInfo() {
        this._reset(DTOFIELD_FULLRESULTINFO);
    }

    @JsonIgnore
    public PSDCBKTaskDTO fullresultinfo(String fullResultInfo) {
        this.setFullResultInfo(fullResultInfo);
        return this;
    }

    @JsonProperty(value="lastcalctime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastCalcTime(Timestamp lastCalcTime) {
        this._set(DTOFIELD_LASTCALCTIME, lastCalcTime);
    }

    @JsonIgnore
    public Timestamp getLastCalcTime() {
        Object objValue = this._get(DTOFIELD_LASTCALCTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastCalcTimeDirty() {
        return this._contains(DTOFIELD_LASTCALCTIME);
    }

    @JsonIgnore
    public void resetLastCalcTime() {
        this._reset(DTOFIELD_LASTCALCTIME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO lastcalctime(Timestamp lastCalcTime) {
        this.setLastCalcTime(lastCalcTime);
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
    public PSDCBKTaskDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDCBKTaskDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="planpsdcrobotid")
    public void setPlanPSDCRobotId(String planPSDCRobotId) {
        this._set(DTOFIELD_PLANPSDCROBOTID, planPSDCRobotId);
    }

    @JsonIgnore
    public String getPlanPSDCRobotId() {
        Object objValue = this._get(DTOFIELD_PLANPSDCROBOTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlanPSDCRobotIdDirty() {
        return this._contains(DTOFIELD_PLANPSDCROBOTID);
    }

    @JsonIgnore
    public void resetPlanPSDCRobotId() {
        this._reset(DTOFIELD_PLANPSDCROBOTID);
    }

    @JsonIgnore
    public PSDCBKTaskDTO planpsdcrobotid(String planPSDCRobotId) {
        this.setPlanPSDCRobotId(planPSDCRobotId);
        return this;
    }

    @JsonProperty(value="planpsdcrobotname")
    public void setPlanPSDCRobotName(String planPSDCRobotName) {
        this._set(DTOFIELD_PLANPSDCROBOTNAME, planPSDCRobotName);
    }

    @JsonIgnore
    public String getPlanPSDCRobotName() {
        Object objValue = this._get(DTOFIELD_PLANPSDCROBOTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlanPSDCRobotNameDirty() {
        return this._contains(DTOFIELD_PLANPSDCROBOTNAME);
    }

    @JsonIgnore
    public void resetPlanPSDCRobotName() {
        this._reset(DTOFIELD_PLANPSDCROBOTNAME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO planpsdcrobotname(String planPSDCRobotName) {
        this.setPlanPSDCRobotName(planPSDCRobotName);
        return this;
    }

    @JsonProperty(value="psdcbktaskid")
    public void setPSDCBKTaskId(String pSDCBKTaskId) {
        this._set(DTOFIELD_PSDCBKTASKID, pSDCBKTaskId);
    }

    @JsonIgnore
    public String getPSDCBKTaskId() {
        Object objValue = this._get(DTOFIELD_PSDCBKTASKID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCBKTaskIdDirty() {
        return this._contains(DTOFIELD_PSDCBKTASKID);
    }

    @JsonIgnore
    public void resetPSDCBKTaskId() {
        this._reset(DTOFIELD_PSDCBKTASKID);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdcbktaskid(String pSDCBKTaskId) {
        this.setPSDCBKTaskId(pSDCBKTaskId);
        return this;
    }

    @JsonProperty(value="psdcbktaskname")
    public void setPSDCBKTaskName(String pSDCBKTaskName) {
        this._set(DTOFIELD_PSDCBKTASKNAME, pSDCBKTaskName);
    }

    @JsonIgnore
    public String getPSDCBKTaskName() {
        Object objValue = this._get(DTOFIELD_PSDCBKTASKNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCBKTaskNameDirty() {
        return this._contains(DTOFIELD_PSDCBKTASKNAME);
    }

    @JsonIgnore
    public void resetPSDCBKTaskName() {
        this._reset(DTOFIELD_PSDCBKTASKNAME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdcbktaskname(String pSDCBKTaskName) {
        this.setPSDCBKTaskName(pSDCBKTaskName);
        return this;
    }

    @JsonProperty(value="psdcrobotid")
    public void setPSDCRobotId(String pSDCRobotId) {
        this._set(DTOFIELD_PSDCROBOTID, pSDCRobotId);
    }

    @JsonIgnore
    public String getPSDCRobotId() {
        Object objValue = this._get(DTOFIELD_PSDCROBOTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRobotIdDirty() {
        return this._contains(DTOFIELD_PSDCROBOTID);
    }

    @JsonIgnore
    public void resetPSDCRobotId() {
        this._reset(DTOFIELD_PSDCROBOTID);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdcrobotid(String pSDCRobotId) {
        this.setPSDCRobotId(pSDCRobotId);
        return this;
    }

    @JsonProperty(value="psdcrobotname")
    public void setPSDCRobotName(String pSDCRobotName) {
        this._set(DTOFIELD_PSDCROBOTNAME, pSDCRobotName);
    }

    @JsonIgnore
    public String getPSDCRobotName() {
        Object objValue = this._get(DTOFIELD_PSDCROBOTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRobotNameDirty() {
        return this._contains(DTOFIELD_PSDCROBOTNAME);
    }

    @JsonIgnore
    public void resetPSDCRobotName() {
        this._reset(DTOFIELD_PSDCROBOTNAME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdcrobotname(String pSDCRobotName) {
        this.setPSDCRobotName(pSDCRobotName);
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
    public PSDCBKTaskDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCBKTaskDTO psdevcentername(String pSDevCenterName) {
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
    public PSDCBKTaskDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDCBKTaskDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
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
    public PSDCBKTaskDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDCBKTaskDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdsconsoleid")
    public void setPSDSConsoleId(String pSDSConsoleId) {
        this._set(DTOFIELD_PSDSCONSOLEID, pSDSConsoleId);
    }

    @JsonIgnore
    public String getPSDSConsoleId() {
        Object objValue = this._get(DTOFIELD_PSDSCONSOLEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDSConsoleIdDirty() {
        return this._contains(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public void resetPSDSConsoleId() {
        this._reset(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdsconsoleid(String pSDSConsoleId) {
        this.setPSDSConsoleId(pSDSConsoleId);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSDCBKTaskDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
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
    public PSDCBKTaskDTO pstaskserverid(String pSTaskServerId) {
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
    public PSDCBKTaskDTO pstaskservername(String pSTaskServerName) {
        this.setPSTaskServerName(pSTaskServerName);
        return this;
    }

    @JsonProperty(value="queueinfo")
    public void setQueueInfo(String queueInfo) {
        this._set(DTOFIELD_QUEUEINFO, queueInfo);
    }

    @JsonIgnore
    public String getQueueInfo() {
        Object objValue = this._get(DTOFIELD_QUEUEINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueueInfoDirty() {
        return this._contains(DTOFIELD_QUEUEINFO);
    }

    @JsonIgnore
    public void resetQueueInfo() {
        this._reset(DTOFIELD_QUEUEINFO);
    }

    @JsonIgnore
    public PSDCBKTaskDTO queueinfo(String queueInfo) {
        this.setQueueInfo(queueInfo);
        return this;
    }

    @JsonProperty(value="remainingtime")
    public void setRemainingTime(Integer remainingTime) {
        this._set(DTOFIELD_REMAININGTIME, remainingTime);
    }

    @JsonIgnore
    public Integer getRemainingTime() {
        Object objValue = this._get(DTOFIELD_REMAININGTIME);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRemainingTimeDirty() {
        return this._contains(DTOFIELD_REMAININGTIME);
    }

    @JsonIgnore
    public void resetRemainingTime() {
        this._reset(DTOFIELD_REMAININGTIME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO remainingtime(Integer remainingTime) {
        this.setRemainingTime(remainingTime);
        return this;
    }

    @JsonProperty(value="remoteaddr")
    public void setRemoteAddr(String remoteAddr) {
        this._set(DTOFIELD_REMOTEADDR, remoteAddr);
    }

    @JsonIgnore
    public String getRemoteAddr() {
        Object objValue = this._get(DTOFIELD_REMOTEADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemoteAddrDirty() {
        return this._contains(DTOFIELD_REMOTEADDR);
    }

    @JsonIgnore
    public void resetRemoteAddr() {
        this._reset(DTOFIELD_REMOTEADDR);
    }

    @JsonIgnore
    public PSDCBKTaskDTO remoteaddr(String remoteAddr) {
        this.setRemoteAddr(remoteAddr);
        return this;
    }

    @JsonProperty(value="resultinfo")
    public void setResultInfo(String resultInfo) {
        this._set(DTOFIELD_RESULTINFO, resultInfo);
    }

    @JsonIgnore
    public String getResultInfo() {
        Object objValue = this._get(DTOFIELD_RESULTINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResultInfoDirty() {
        return this._contains(DTOFIELD_RESULTINFO);
    }

    @JsonIgnore
    public void resetResultInfo() {
        this._reset(DTOFIELD_RESULTINFO);
    }

    @JsonIgnore
    public PSDCBKTaskDTO resultinfo(String resultInfo) {
        this.setResultInfo(resultInfo);
        return this;
    }

    @JsonProperty(value="stepinfo")
    public void setStepInfo(String stepInfo) {
        this._set(DTOFIELD_STEPINFO, stepInfo);
    }

    @JsonIgnore
    public String getStepInfo() {
        Object objValue = this._get(DTOFIELD_STEPINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepInfoDirty() {
        return this._contains(DTOFIELD_STEPINFO);
    }

    @JsonIgnore
    public void resetStepInfo() {
        this._reset(DTOFIELD_STEPINFO);
    }

    @JsonIgnore
    public PSDCBKTaskDTO stepinfo(String stepInfo) {
        this.setStepInfo(stepInfo);
        return this;
    }

    @JsonProperty(value="taskparam")
    public void setTaskParam(String taskParam) {
        this._set(DTOFIELD_TASKPARAM, taskParam);
    }

    @JsonIgnore
    public String getTaskParam() {
        Object objValue = this._get(DTOFIELD_TASKPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskParamDirty() {
        return this._contains(DTOFIELD_TASKPARAM);
    }

    @JsonIgnore
    public void resetTaskParam() {
        this._reset(DTOFIELD_TASKPARAM);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskparam(String taskParam) {
        this.setTaskParam(taskParam);
        return this;
    }

    @JsonProperty(value="taskparam2")
    public void setTaskParam2(String taskParam2) {
        this._set(DTOFIELD_TASKPARAM2, taskParam2);
    }

    @JsonIgnore
    public String getTaskParam2() {
        Object objValue = this._get(DTOFIELD_TASKPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskParam2Dirty() {
        return this._contains(DTOFIELD_TASKPARAM2);
    }

    @JsonIgnore
    public void resetTaskParam2() {
        this._reset(DTOFIELD_TASKPARAM2);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskparam2(String taskParam2) {
        this.setTaskParam2(taskParam2);
        return this;
    }

    @JsonProperty(value="taskparam3")
    public void setTaskParam3(String taskParam3) {
        this._set(DTOFIELD_TASKPARAM3, taskParam3);
    }

    @JsonIgnore
    public String getTaskParam3() {
        Object objValue = this._get(DTOFIELD_TASKPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskParam3Dirty() {
        return this._contains(DTOFIELD_TASKPARAM3);
    }

    @JsonIgnore
    public void resetTaskParam3() {
        this._reset(DTOFIELD_TASKPARAM3);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskparam3(String taskParam3) {
        this.setTaskParam3(taskParam3);
        return this;
    }

    @JsonProperty(value="taskparam4")
    public void setTaskParam4(String taskParam4) {
        this._set(DTOFIELD_TASKPARAM4, taskParam4);
    }

    @JsonIgnore
    public String getTaskParam4() {
        Object objValue = this._get(DTOFIELD_TASKPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskParam4Dirty() {
        return this._contains(DTOFIELD_TASKPARAM4);
    }

    @JsonIgnore
    public void resetTaskParam4() {
        this._reset(DTOFIELD_TASKPARAM4);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskparam4(String taskParam4) {
        this.setTaskParam4(taskParam4);
        return this;
    }

    @JsonProperty(value="taskparams")
    public void setTaskParams(String taskParams) {
        this._set(DTOFIELD_TASKPARAMS, taskParams);
    }

    @JsonIgnore
    public String getTaskParams() {
        Object objValue = this._get(DTOFIELD_TASKPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskParamsDirty() {
        return this._contains(DTOFIELD_TASKPARAMS);
    }

    @JsonIgnore
    public void resetTaskParams() {
        this._reset(DTOFIELD_TASKPARAMS);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskparams(String taskParams) {
        this.setTaskParams(taskParams);
        return this;
    }

    @JsonProperty(value="taskstate")
    public void setTaskState(Integer taskState) {
        this._set(DTOFIELD_TASKSTATE, taskState);
    }

    @JsonIgnore
    public Integer getTaskState() {
        Object objValue = this._get(DTOFIELD_TASKSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTaskStateDirty() {
        return this._contains(DTOFIELD_TASKSTATE);
    }

    @JsonIgnore
    public void resetTaskState() {
        this._reset(DTOFIELD_TASKSTATE);
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskstate(Integer taskState) {
        this.setTaskState(taskState);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO taskstate(PSModelEnums.SysDevBKTaskState taskState) {
        this.setTaskState(taskState == null ? null : taskState.value);
        return this;
    }

    @JsonProperty(value="tasktype")
    public void setTaskType(String taskType) {
        this._set(DTOFIELD_TASKTYPE, taskType);
    }

    @JsonIgnore
    public String getTaskType() {
        Object objValue = this._get(DTOFIELD_TASKTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskTypeDirty() {
        return this._contains(DTOFIELD_TASKTYPE);
    }

    @JsonIgnore
    public void resetTaskType() {
        this._reset(DTOFIELD_TASKTYPE);
    }

    @JsonIgnore
    public PSDCBKTaskDTO tasktype(String taskType) {
        this.setTaskType(taskType);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO tasktype(PSModelEnums.DCBKTaskType taskType) {
        this.setTaskType(taskType == null ? null : taskType.value);
        return this;
    }

    @JsonProperty(value="totaltime")
    public void setTotalTime(Integer totalTime) {
        this._set(DTOFIELD_TOTALTIME, totalTime);
    }

    @JsonIgnore
    public Integer getTotalTime() {
        Object objValue = this._get(DTOFIELD_TOTALTIME);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTotalTimeDirty() {
        return this._contains(DTOFIELD_TOTALTIME);
    }

    @JsonIgnore
    public void resetTotalTime() {
        this._reset(DTOFIELD_TOTALTIME);
    }

    @JsonIgnore
    public PSDCBKTaskDTO totaltime(Integer totalTime) {
        this.setTotalTime(totalTime);
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
    public PSDCBKTaskDTO updatedate(Timestamp updateDate) {
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
    public PSDCBKTaskDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userobotflag")
    public void setUseRobotFlag(Integer useRobotFlag) {
        this._set(DTOFIELD_USEROBOTFLAG, useRobotFlag);
    }

    @JsonIgnore
    public Integer getUseRobotFlag() {
        Object objValue = this._get(DTOFIELD_USEROBOTFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUseRobotFlagDirty() {
        return this._contains(DTOFIELD_USEROBOTFLAG);
    }

    @JsonIgnore
    public void resetUseRobotFlag() {
        this._reset(DTOFIELD_USEROBOTFLAG);
    }

    @JsonIgnore
    public PSDCBKTaskDTO userobotflag(Integer useRobotFlag) {
        this.setUseRobotFlag(useRobotFlag);
        return this;
    }

    @JsonIgnore
    public PSDCBKTaskDTO userobotflag(Boolean useRobotFlag) {
        this.setUseRobotFlag(useRobotFlag == null ? null : (useRobotFlag ? 1 : 0));
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
    public PSDCBKTaskDTO usertag(String userTag) {
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
    public PSDCBKTaskDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCBKTaskName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCBKTaskName(strName);
    }

    @JsonIgnore
    public PSDCBKTaskDTO name(String strName) {
        this.setPSDCBKTaskName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCBKTaskId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCBKTaskId(strValue);
    }

    @JsonIgnore
    public PSDCBKTaskDTO id(String strValue) {
        this.setPSDCBKTaskId(strValue);
        return this;
    }

}
