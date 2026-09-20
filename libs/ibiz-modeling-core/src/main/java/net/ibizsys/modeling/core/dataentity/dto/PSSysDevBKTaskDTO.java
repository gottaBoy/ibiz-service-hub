package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDevBKTaskDTO
extends PSModelDTOBase {
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
    public static final String FIELD_LINKINFO = "LINKINFO";
    protected static final String DTOFIELD_LINKINFO = "linkinfo";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELLEVEL = "MODELLEVEL";
    protected static final String DTOFIELD_MODELLEVEL = "modellevel";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PLANPSDCROBOTID = "PLANPSDCROBOTID";
    protected static final String DTOFIELD_PLANPSDCROBOTID = "planpsdcrobotid";
    public static final String FIELD_PLANPSDCROBOTNAME = "PLANPSDCROBOTNAME";
    protected static final String DTOFIELD_PLANPSDCROBOTNAME = "planpsdcrobotname";
    public static final String FIELD_PPSSYSDEVBKTASKID = "PPSSYSDEVBKTASKID";
    protected static final String DTOFIELD_PPSSYSDEVBKTASKID = "ppssysdevbktaskid";
    public static final String FIELD_PPSSYSDEVBKTASKNAME = "PPSSYSDEVBKTASKNAME";
    protected static final String DTOFIELD_PPSSYSDEVBKTASKNAME = "ppssysdevbktaskname";
    public static final String FIELD_PSDCROBOTID = "PSDCROBOTID";
    protected static final String DTOFIELD_PSDCROBOTID = "psdcrobotid";
    public static final String FIELD_PSDCROBOTNAME = "PSDCROBOTNAME";
    protected static final String DTOFIELD_PSDCROBOTNAME = "psdcrobotname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSSYSDEVBKTASKID = "PSSYSDEVBKTASKID";
    protected static final String DTOFIELD_PSSYSDEVBKTASKID = "pssysdevbktaskid";
    public static final String FIELD_PSSYSDEVBKTASKNAME = "PSSYSDEVBKTASKNAME";
    protected static final String DTOFIELD_PSSYSDEVBKTASKNAME = "pssysdevbktaskname";
    public static final String FIELD_PSSYSMODELINSTID = "PSSYSMODELINSTID";
    protected static final String DTOFIELD_PSSYSMODELINSTID = "pssysmodelinstid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_PSTASKSERVERNAME = "PSTASKSERVERNAME";
    protected static final String DTOFIELD_PSTASKSERVERNAME = "pstaskservername";
    public static final String FIELD_QUEUEINFO = "QUEUEINFO";
    protected static final String DTOFIELD_QUEUEINFO = "queueinfo";
    public static final String FIELD_REMOTEADDR = "REMOTEADDR";
    protected static final String DTOFIELD_REMOTEADDR = "remoteaddr";
    public static final String FIELD_RESULTINFO = "RESULTINFO";
    protected static final String DTOFIELD_RESULTINFO = "resultinfo";
    public static final String FIELD_TASKPARAM = "TASKPARAM";
    protected static final String DTOFIELD_TASKPARAM = "taskparam";
    public static final String FIELD_TASKPARAM2 = "TASKPARAM2";
    protected static final String DTOFIELD_TASKPARAM2 = "taskparam2";
    public static final String FIELD_TASKPARAM3 = "TASKPARAM3";
    protected static final String DTOFIELD_TASKPARAM3 = "taskparam3";
    public static final String FIELD_TASKPARAM4 = "TASKPARAM4";
    protected static final String DTOFIELD_TASKPARAM4 = "taskparam4";
    public static final String FIELD_TASKSTATE = "TASKSTATE";
    protected static final String DTOFIELD_TASKSTATE = "taskstate";
    public static final String FIELD_TASKTYPE = "TASKTYPE";
    protected static final String DTOFIELD_TASKTYPE = "tasktype";
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO begintime(Timestamp beginTime) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO createdate(Timestamp createDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO createman(String createMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO endtime(Timestamp endTime) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO fullresultinfo(String fullResultInfo) {
        this.setFullResultInfo(fullResultInfo);
        return this;
    }

    @JsonProperty(value="linkinfo")
    public void setLinkInfo(String linkInfo) {
        this._set(DTOFIELD_LINKINFO, linkInfo);
    }

    @JsonIgnore
    public String getLinkInfo() {
        Object objValue = this._get(DTOFIELD_LINKINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkInfoDirty() {
        return this._contains(DTOFIELD_LINKINFO);
    }

    @JsonIgnore
    public void resetLinkInfo() {
        this._reset(DTOFIELD_LINKINFO);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO linkinfo(String linkInfo) {
        this.setLinkInfo(linkInfo);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modellevel")
    public void setModelLevel(Integer modelLevel) {
        this._set(DTOFIELD_MODELLEVEL, modelLevel);
    }

    @JsonIgnore
    public Integer getModelLevel() {
        Object objValue = this._get(DTOFIELD_MODELLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelLevelDirty() {
        return this._contains(DTOFIELD_MODELLEVEL);
    }

    @JsonIgnore
    public void resetModelLevel() {
        this._reset(DTOFIELD_MODELLEVEL);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO modellevel(Integer modelLevel) {
        this.setModelLevel(modelLevel);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO ordervalue(Integer orderValue) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO planpsdcrobotid(String planPSDCRobotId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO planpsdcrobotname(String planPSDCRobotName) {
        this.setPlanPSDCRobotName(planPSDCRobotName);
        return this;
    }

    @JsonProperty(value="ppssysdevbktaskid")
    public void setPPSSysDevBKTaskId(String pPSSysDevBKTaskId) {
        this._set(DTOFIELD_PPSSYSDEVBKTASKID, pPSSysDevBKTaskId);
    }

    @JsonIgnore
    public String getPPSSysDevBKTaskId() {
        Object objValue = this._get(DTOFIELD_PPSSYSDEVBKTASKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysDevBKTaskIdDirty() {
        return this._contains(DTOFIELD_PPSSYSDEVBKTASKID);
    }

    @JsonIgnore
    public void resetPPSSysDevBKTaskId() {
        this._reset(DTOFIELD_PPSSYSDEVBKTASKID);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskid(String pPSSysDevBKTaskId) {
        this.setPPSSysDevBKTaskId(pPSSysDevBKTaskId);
        return this;
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskid(PSSysDevBKTaskDTO pSSysDevBKTask) {
        if (pSSysDevBKTask == null) {
            this.setPPSSysDevBKTaskId(null);
            this.setPPSSysDevBKTaskName(null);
        } else {
            this.setPPSSysDevBKTaskId(pSSysDevBKTask.getPSSysDevBKTaskId());
            this.setPPSSysDevBKTaskName(pSSysDevBKTask.getPSSysDevBKTaskName());
        }
        return this;
    }

    @JsonProperty(value="ppssysdevbktaskname")
    public void setPPSSysDevBKTaskName(String pPSSysDevBKTaskName) {
        this._set(DTOFIELD_PPSSYSDEVBKTASKNAME, pPSSysDevBKTaskName);
    }

    @JsonIgnore
    public String getPPSSysDevBKTaskName() {
        Object objValue = this._get(DTOFIELD_PPSSYSDEVBKTASKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysDevBKTaskNameDirty() {
        return this._contains(DTOFIELD_PPSSYSDEVBKTASKNAME);
    }

    @JsonIgnore
    public void resetPPSSysDevBKTaskName() {
        this._reset(DTOFIELD_PPSSYSDEVBKTASKNAME);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskname(String pPSSysDevBKTaskName) {
        this.setPPSSysDevBKTaskName(pPSSysDevBKTaskName);
        return this;
    }

    @JsonProperty(value="psdcrobotid")
    public void setPSDCRobotId(String pSDCRobotId) {
        this._set(DTOFIELD_PSDCROBOTID, pSDCRobotId);
    }

    @JsonIgnore
    public String getPSDCRobotId() {
        Object objValue = this._get(DTOFIELD_PSDCROBOTID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdcrobotid(String pSDCRobotId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdcrobotname(String pSDCRobotName) {
        this.setPSDCRobotName(pSDCRobotName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonProperty(value="psdsconsoleid")
    public void setPSDSConsoleId(String pSDSConsoleId) {
        this._set(DTOFIELD_PSDSCONSOLEID, pSDSConsoleId);
    }

    @JsonIgnore
    public String getPSDSConsoleId() {
        Object objValue = this._get(DTOFIELD_PSDSCONSOLEID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdsconsoleid(String pSDSConsoleId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="pssysdevbktaskid")
    public void setPSSysDevBKTaskId(String pSSysDevBKTaskId) {
        this._set(DTOFIELD_PSSYSDEVBKTASKID, pSSysDevBKTaskId);
    }

    @JsonIgnore
    public String getPSSysDevBKTaskId() {
        Object objValue = this._get(DTOFIELD_PSSYSDEVBKTASKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDevBKTaskIdDirty() {
        return this._contains(DTOFIELD_PSSYSDEVBKTASKID);
    }

    @JsonIgnore
    public void resetPSSysDevBKTaskId() {
        this._reset(DTOFIELD_PSSYSDEVBKTASKID);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO pssysdevbktaskid(String pSSysDevBKTaskId) {
        this.setPSSysDevBKTaskId(pSSysDevBKTaskId);
        return this;
    }

    @JsonProperty(value="pssysdevbktaskname")
    public void setPSSysDevBKTaskName(String pSSysDevBKTaskName) {
        this._set(DTOFIELD_PSSYSDEVBKTASKNAME, pSSysDevBKTaskName);
    }

    @JsonIgnore
    public String getPSSysDevBKTaskName() {
        Object objValue = this._get(DTOFIELD_PSSYSDEVBKTASKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDevBKTaskNameDirty() {
        return this._contains(DTOFIELD_PSSYSDEVBKTASKNAME);
    }

    @JsonIgnore
    public void resetPSSysDevBKTaskName() {
        this._reset(DTOFIELD_PSSYSDEVBKTASKNAME);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO pssysdevbktaskname(String pSSysDevBKTaskName) {
        this.setPSSysDevBKTaskName(pSSysDevBKTaskName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDevBKTaskName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDevBKTaskName(strName);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO name(String strName) {
        this.setPSSysDevBKTaskName(strName);
        return this;
    }

    @JsonProperty(value="pssysmodelinstid")
    public void setPSSysModelInstId(String pSSysModelInstId) {
        this._set(DTOFIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }

    @JsonIgnore
    public String getPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO pssysmodelinstid(String pSSysModelInstId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO pstaskserverid(String pSTaskServerId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO pstaskservername(String pSTaskServerName) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO queueinfo(String queueInfo) {
        this.setQueueInfo(queueInfo);
        return this;
    }

    @JsonProperty(value="remoteaddr")
    public void setRemoteAddr(String remoteAddr) {
        this._set(DTOFIELD_REMOTEADDR, remoteAddr);
    }

    @JsonIgnore
    public String getRemoteAddr() {
        Object objValue = this._get(DTOFIELD_REMOTEADDR);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO remoteaddr(String remoteAddr) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO resultinfo(String resultInfo) {
        this.setResultInfo(resultInfo);
        return this;
    }

    @JsonProperty(value="taskparam")
    public void setTaskParam(String taskParam) {
        this._set(DTOFIELD_TASKPARAM, taskParam);
    }

    @JsonIgnore
    public String getTaskParam() {
        Object objValue = this._get(DTOFIELD_TASKPARAM);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO taskparam(String taskParam) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO taskparam2(String taskParam2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO taskparam3(String taskParam3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO taskparam4(String taskParam4) {
        this.setTaskParam4(taskParam4);
        return this;
    }

    @JsonProperty(value="taskstate")
    public void setTaskState(Integer taskState) {
        this._set(DTOFIELD_TASKSTATE, taskState);
    }

    @JsonIgnore
    public Integer getTaskState() {
        Object objValue = this._get(DTOFIELD_TASKSTATE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO taskstate(Integer taskState) {
        this.setTaskState(taskState);
        return this;
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO taskstate(PSModelEnums.SysDevBKTaskState taskState) {
        if (taskState == null) {
            this.setTaskState(null);
        } else {
            this.setTaskState(taskState.value);
        }
        return this;
    }

    @JsonProperty(value="tasktype")
    public void setTaskType(String taskType) {
        this._set(DTOFIELD_TASKTYPE, taskType);
    }

    @JsonIgnore
    public String getTaskType() {
        Object objValue = this._get(DTOFIELD_TASKTYPE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO tasktype(String taskType) {
        this.setTaskType(taskType);
        return this;
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO tasktype(PSModelEnums.SysDevBKTaskType taskType) {
        if (taskType == null) {
            this.setTaskType(null);
        } else {
            this.setTaskType(taskType.value);
        }
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO updateman(String updateMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO userobotflag(Integer useRobotFlag) {
        this.setUseRobotFlag(useRobotFlag);
        return this;
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO userobotflag(Boolean useRobotFlag) {
        if (useRobotFlag == null) {
            this.setUseRobotFlag(null);
        } else {
            this.setUseRobotFlag(useRobotFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO usertag(String userTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDevBKTaskDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDevBKTaskId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDevBKTaskId(strValue);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO id(String strValue) {
        this.setPSSysDevBKTaskId(strValue);
        return this;
    }
}
