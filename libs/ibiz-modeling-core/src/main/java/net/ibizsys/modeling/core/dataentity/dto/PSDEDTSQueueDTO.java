package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDTSQueueDTO
extends PSModelDTOBase {
    public static final String FIELD_CANCELLEDSTATE = "CANCELLEDSTATE";
    protected static final String DTOFIELD_CANCELLEDSTATE = "cancelledstate";
    public static final String FIELD_CANCELLEDSTATETEXT = "CANCELLEDSTATETEXT";
    protected static final String DTOFIELD_CANCELLEDSTATETEXT = "cancelledstatetext";
    public static final String FIELD_CANCELPSDEACTIONID = "CANCELPSDEACTIONID";
    protected static final String DTOFIELD_CANCELPSDEACTIONID = "cancelpsdeactionid";
    public static final String FIELD_CANCELPSDEACTIONNAME = "CANCELPSDEACTIONNAME";
    protected static final String DTOFIELD_CANCELPSDEACTIONNAME = "cancelpsdeactionname";
    public static final String FIELD_CANCELTIMEOUT = "CANCELTIMEOUT";
    protected static final String DTOFIELD_CANCELTIMEOUT = "canceltimeout";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDSTATE = "CREATEDSTATE";
    protected static final String DTOFIELD_CREATEDSTATE = "createdstate";
    public static final String FIELD_CREATEDSTATETEXT = "CREATEDSTATETEXT";
    protected static final String DTOFIELD_CREATEDSTATETEXT = "createdstatetext";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_ERRORPSDEFID = "ERRORPSDEFID";
    protected static final String DTOFIELD_ERRORPSDEFID = "errorpsdefid";
    public static final String FIELD_ERRORPSDEFNAME = "ERRORPSDEFNAME";
    protected static final String DTOFIELD_ERRORPSDEFNAME = "errorpsdefname";
    public static final String FIELD_FAILEDSTATE = "FAILEDSTATE";
    protected static final String DTOFIELD_FAILEDSTATE = "failedstate";
    public static final String FIELD_FAILEDSTATETEXT = "FAILEDSTATETEXT";
    protected static final String DTOFIELD_FAILEDSTATETEXT = "failedstatetext";
    public static final String FIELD_FINISHEDSTATE = "FINISHEDSTATE";
    protected static final String DTOFIELD_FINISHEDSTATE = "finishedstate";
    public static final String FIELD_FINISHEDSTATETEXT = "FINISHEDSTATETEXT";
    protected static final String DTOFIELD_FINISHEDSTATETEXT = "finishedstatetext";
    public static final String FIELD_FINISHPSDEACTIONID = "FINISHPSDEACTIONID";
    protected static final String DTOFIELD_FINISHPSDEACTIONID = "finishpsdeactionid";
    public static final String FIELD_FINISHPSDEACTIONNAME = "FINISHPSDEACTIONNAME";
    protected static final String DTOFIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";
    public static final String FIELD_HISTORYPSDEID = "HISTORYPSDEID";
    protected static final String DTOFIELD_HISTORYPSDEID = "historypsdeid";
    public static final String FIELD_HISTORYPSDENAME = "HISTORYPSDENAME";
    protected static final String DTOFIELD_HISTORYPSDENAME = "historypsdename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PROCESSINGSTATE = "PROCESSINGSTATE";
    protected static final String DTOFIELD_PROCESSINGSTATE = "processingstate";
    public static final String FIELD_PROCESSINGSTATETEXT = "PROCESSINGSTATETEXT";
    protected static final String DTOFIELD_PROCESSINGSTATETEXT = "processingstatetext";
    public static final String FIELD_PSDEDTSQUEUEID = "PSDEDTSQUEUEID";
    protected static final String DTOFIELD_PSDEDTSQUEUEID = "psdedtsqueueid";
    public static final String FIELD_PSDEDTSQUEUENAME = "PSDEDTSQUEUENAME";
    protected static final String DTOFIELD_PSDEDTSQUEUENAME = "psdedtsqueuename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PUSHPSDEACTIONID = "PUSHPSDEACTIONID";
    protected static final String DTOFIELD_PUSHPSDEACTIONID = "pushpsdeactionid";
    public static final String FIELD_PUSHPSDEACTIONNAME = "PUSHPSDEACTIONNAME";
    protected static final String DTOFIELD_PUSHPSDEACTIONNAME = "pushpsdeactionname";
    public static final String FIELD_QUEUEPARAMS = "QUEUEPARAMS";
    protected static final String DTOFIELD_QUEUEPARAMS = "queueparams";
    public static final String FIELD_REFRESHPSDEACTIONID = "REFRESHPSDEACTIONID";
    protected static final String DTOFIELD_REFRESHPSDEACTIONID = "refreshpsdeactionid";
    public static final String FIELD_REFRESHPSDEACTIONNAME = "REFRESHPSDEACTIONNAME";
    protected static final String DTOFIELD_REFRESHPSDEACTIONNAME = "refreshpsdeactionname";
    public static final String FIELD_REFRESHTIMER = "REFRESHTIMER";
    protected static final String DTOFIELD_REFRESHTIMER = "refreshtimer";
    public static final String FIELD_STATEPSDEFID = "STATEPSDEFID";
    protected static final String DTOFIELD_STATEPSDEFID = "statepsdefid";
    public static final String FIELD_STATEPSDEFNAME = "STATEPSDEFNAME";
    protected static final String DTOFIELD_STATEPSDEFNAME = "statepsdefname";
    public static final String FIELD_TIMEPSDEFID = "TIMEPSDEFID";
    protected static final String DTOFIELD_TIMEPSDEFID = "timepsdefid";
    public static final String FIELD_TIMEPSDEFNAME = "TIMEPSDEFNAME";
    protected static final String DTOFIELD_TIMEPSDEFNAME = "timepsdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
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

    @JsonProperty(value="cancelledstate")
    public void setCancelledState(String cancelledState) {
        this._set(DTOFIELD_CANCELLEDSTATE, cancelledState);
    }

    @JsonIgnore
    public String getCancelledState() {
        Object objValue = this._get(DTOFIELD_CANCELLEDSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCancelledStateDirty() {
        return this._contains(DTOFIELD_CANCELLEDSTATE);
    }

    @JsonIgnore
    public void resetCancelledState() {
        this._reset(DTOFIELD_CANCELLEDSTATE);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO cancelledstate(String cancelledState) {
        this.setCancelledState(cancelledState);
        return this;
    }

    @JsonProperty(value="cancelledstatetext")
    public void setCancelledStateText(String cancelledStateText) {
        this._set(DTOFIELD_CANCELLEDSTATETEXT, cancelledStateText);
    }

    @JsonIgnore
    public String getCancelledStateText() {
        Object objValue = this._get(DTOFIELD_CANCELLEDSTATETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCancelledStateTextDirty() {
        return this._contains(DTOFIELD_CANCELLEDSTATETEXT);
    }

    @JsonIgnore
    public void resetCancelledStateText() {
        this._reset(DTOFIELD_CANCELLEDSTATETEXT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO cancelledstatetext(String cancelledStateText) {
        this.setCancelledStateText(cancelledStateText);
        return this;
    }

    @JsonProperty(value="cancelpsdeactionid")
    public void setCancelPSDEActionId(String cancelPSDEActionId) {
        this._set(DTOFIELD_CANCELPSDEACTIONID, cancelPSDEActionId);
    }

    @JsonIgnore
    public String getCancelPSDEActionId() {
        Object objValue = this._get(DTOFIELD_CANCELPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCancelPSDEActionIdDirty() {
        return this._contains(DTOFIELD_CANCELPSDEACTIONID);
    }

    @JsonIgnore
    public void resetCancelPSDEActionId() {
        this._reset(DTOFIELD_CANCELPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionid(String cancelPSDEActionId) {
        this.setCancelPSDEActionId(cancelPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setCancelPSDEActionId(null);
            this.setCancelPSDEActionName(null);
        } else {
            this.setCancelPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCancelPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="cancelpsdeactionname")
    public void setCancelPSDEActionName(String cancelPSDEActionName) {
        this._set(DTOFIELD_CANCELPSDEACTIONNAME, cancelPSDEActionName);
    }

    @JsonIgnore
    public String getCancelPSDEActionName() {
        Object objValue = this._get(DTOFIELD_CANCELPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCancelPSDEActionNameDirty() {
        return this._contains(DTOFIELD_CANCELPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetCancelPSDEActionName() {
        this._reset(DTOFIELD_CANCELPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionname(String cancelPSDEActionName) {
        this.setCancelPSDEActionName(cancelPSDEActionName);
        return this;
    }

    @JsonProperty(value="canceltimeout")
    public void setCancelTimeout(Integer cancelTimeout) {
        this._set(DTOFIELD_CANCELTIMEOUT, cancelTimeout);
    }

    @JsonIgnore
    public Integer getCancelTimeout() {
        Object objValue = this._get(DTOFIELD_CANCELTIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCancelTimeoutDirty() {
        return this._contains(DTOFIELD_CANCELTIMEOUT);
    }

    @JsonIgnore
    public void resetCancelTimeout() {
        this._reset(DTOFIELD_CANCELTIMEOUT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO canceltimeout(Integer cancelTimeout) {
        this.setCancelTimeout(cancelTimeout);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEDTSQueueDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createdstate")
    public void setCreatedState(String createdState) {
        this._set(DTOFIELD_CREATEDSTATE, createdState);
    }

    @JsonIgnore
    public String getCreatedState() {
        Object objValue = this._get(DTOFIELD_CREATEDSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatedStateDirty() {
        return this._contains(DTOFIELD_CREATEDSTATE);
    }

    @JsonIgnore
    public void resetCreatedState() {
        this._reset(DTOFIELD_CREATEDSTATE);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO createdstate(String createdState) {
        this.setCreatedState(createdState);
        return this;
    }

    @JsonProperty(value="createdstatetext")
    public void setCreatedStateText(String createdStateText) {
        this._set(DTOFIELD_CREATEDSTATETEXT, createdStateText);
    }

    @JsonIgnore
    public String getCreatedStateText() {
        Object objValue = this._get(DTOFIELD_CREATEDSTATETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatedStateTextDirty() {
        return this._contains(DTOFIELD_CREATEDSTATETEXT);
    }

    @JsonIgnore
    public void resetCreatedStateText() {
        this._reset(DTOFIELD_CREATEDSTATETEXT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO createdstatetext(String createdStateText) {
        this.setCreatedStateText(createdStateText);
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
    public PSDEDTSQueueDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
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
    public PSDEDTSQueueDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="errorpsdefid")
    public void setErrorPSDEFId(String errorPSDEFId) {
        this._set(DTOFIELD_ERRORPSDEFID, errorPSDEFId);
    }

    @JsonIgnore
    public String getErrorPSDEFId() {
        Object objValue = this._get(DTOFIELD_ERRORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrorPSDEFIdDirty() {
        return this._contains(DTOFIELD_ERRORPSDEFID);
    }

    @JsonIgnore
    public void resetErrorPSDEFId() {
        this._reset(DTOFIELD_ERRORPSDEFID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefid(String errorPSDEFId) {
        this.setErrorPSDEFId(errorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setErrorPSDEFId(null);
            this.setErrorPSDEFName(null);
        } else {
            this.setErrorPSDEFId(pSDEField.getPSDEFieldId());
            this.setErrorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="errorpsdefname")
    public void setErrorPSDEFName(String errorPSDEFName) {
        this._set(DTOFIELD_ERRORPSDEFNAME, errorPSDEFName);
    }

    @JsonIgnore
    public String getErrorPSDEFName() {
        Object objValue = this._get(DTOFIELD_ERRORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrorPSDEFNameDirty() {
        return this._contains(DTOFIELD_ERRORPSDEFNAME);
    }

    @JsonIgnore
    public void resetErrorPSDEFName() {
        this._reset(DTOFIELD_ERRORPSDEFNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefname(String errorPSDEFName) {
        this.setErrorPSDEFName(errorPSDEFName);
        return this;
    }

    @JsonProperty(value="failedstate")
    public void setFailedState(String failedState) {
        this._set(DTOFIELD_FAILEDSTATE, failedState);
    }

    @JsonIgnore
    public String getFailedState() {
        Object objValue = this._get(DTOFIELD_FAILEDSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFailedStateDirty() {
        return this._contains(DTOFIELD_FAILEDSTATE);
    }

    @JsonIgnore
    public void resetFailedState() {
        this._reset(DTOFIELD_FAILEDSTATE);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO failedstate(String failedState) {
        this.setFailedState(failedState);
        return this;
    }

    @JsonProperty(value="failedstatetext")
    public void setFailedStateText(String failedStateText) {
        this._set(DTOFIELD_FAILEDSTATETEXT, failedStateText);
    }

    @JsonIgnore
    public String getFailedStateText() {
        Object objValue = this._get(DTOFIELD_FAILEDSTATETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFailedStateTextDirty() {
        return this._contains(DTOFIELD_FAILEDSTATETEXT);
    }

    @JsonIgnore
    public void resetFailedStateText() {
        this._reset(DTOFIELD_FAILEDSTATETEXT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO failedstatetext(String failedStateText) {
        this.setFailedStateText(failedStateText);
        return this;
    }

    @JsonProperty(value="finishedstate")
    public void setFinishedState(String finishedState) {
        this._set(DTOFIELD_FINISHEDSTATE, finishedState);
    }

    @JsonIgnore
    public String getFinishedState() {
        Object objValue = this._get(DTOFIELD_FINISHEDSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishedStateDirty() {
        return this._contains(DTOFIELD_FINISHEDSTATE);
    }

    @JsonIgnore
    public void resetFinishedState() {
        this._reset(DTOFIELD_FINISHEDSTATE);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO finishedstate(String finishedState) {
        this.setFinishedState(finishedState);
        return this;
    }

    @JsonProperty(value="finishedstatetext")
    public void setFinishedStateText(String finishedStateText) {
        this._set(DTOFIELD_FINISHEDSTATETEXT, finishedStateText);
    }

    @JsonIgnore
    public String getFinishedStateText() {
        Object objValue = this._get(DTOFIELD_FINISHEDSTATETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishedStateTextDirty() {
        return this._contains(DTOFIELD_FINISHEDSTATETEXT);
    }

    @JsonIgnore
    public void resetFinishedStateText() {
        this._reset(DTOFIELD_FINISHEDSTATETEXT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO finishedstatetext(String finishedStateText) {
        this.setFinishedStateText(finishedStateText);
        return this;
    }

    @JsonProperty(value="finishpsdeactionid")
    public void setFinishPSDEActionId(String finishPSDEActionId) {
        this._set(DTOFIELD_FINISHPSDEACTIONID, finishPSDEActionId);
    }

    @JsonIgnore
    public String getFinishPSDEActionId() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEActionIdDirty() {
        return this._contains(DTOFIELD_FINISHPSDEACTIONID);
    }

    @JsonIgnore
    public void resetFinishPSDEActionId() {
        this._reset(DTOFIELD_FINISHPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionid(String finishPSDEActionId) {
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setFinishPSDEActionId(null);
            this.setFinishPSDEActionName(null);
        } else {
            this.setFinishPSDEActionId(pSDEAction.getPSDEActionId());
            this.setFinishPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="finishpsdeactionname")
    public void setFinishPSDEActionName(String finishPSDEActionName) {
        this._set(DTOFIELD_FINISHPSDEACTIONNAME, finishPSDEActionName);
    }

    @JsonIgnore
    public String getFinishPSDEActionName() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEActionNameDirty() {
        return this._contains(DTOFIELD_FINISHPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetFinishPSDEActionName() {
        this._reset(DTOFIELD_FINISHPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionname(String finishPSDEActionName) {
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    @JsonProperty(value="historypsdeid")
    public void setHistoryPSDEId(String historyPSDEId) {
        this._set(DTOFIELD_HISTORYPSDEID, historyPSDEId);
    }

    @JsonIgnore
    public String getHistoryPSDEId() {
        Object objValue = this._get(DTOFIELD_HISTORYPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHistoryPSDEIdDirty() {
        return this._contains(DTOFIELD_HISTORYPSDEID);
    }

    @JsonIgnore
    public void resetHistoryPSDEId() {
        this._reset(DTOFIELD_HISTORYPSDEID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO historypsdeid(String historyPSDEId) {
        this.setHistoryPSDEId(historyPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO historypsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setHistoryPSDEId(null);
            this.setHistoryPSDEName(null);
        } else {
            this.setHistoryPSDEId(pSDataEntity.getPSDataEntityId());
            this.setHistoryPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="historypsdename")
    public void setHistoryPSDEName(String historyPSDEName) {
        this._set(DTOFIELD_HISTORYPSDENAME, historyPSDEName);
    }

    @JsonIgnore
    public String getHistoryPSDEName() {
        Object objValue = this._get(DTOFIELD_HISTORYPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHistoryPSDENameDirty() {
        return this._contains(DTOFIELD_HISTORYPSDENAME);
    }

    @JsonIgnore
    public void resetHistoryPSDEName() {
        this._reset(DTOFIELD_HISTORYPSDENAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO historypsdename(String historyPSDEName) {
        this.setHistoryPSDEName(historyPSDEName);
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
    public PSDEDTSQueueDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="processingstate")
    public void setProcessingState(String processingState) {
        this._set(DTOFIELD_PROCESSINGSTATE, processingState);
    }

    @JsonIgnore
    public String getProcessingState() {
        Object objValue = this._get(DTOFIELD_PROCESSINGSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProcessingStateDirty() {
        return this._contains(DTOFIELD_PROCESSINGSTATE);
    }

    @JsonIgnore
    public void resetProcessingState() {
        this._reset(DTOFIELD_PROCESSINGSTATE);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO processingstate(String processingState) {
        this.setProcessingState(processingState);
        return this;
    }

    @JsonProperty(value="processingstatetext")
    public void setProcessingStateText(String processingStateText) {
        this._set(DTOFIELD_PROCESSINGSTATETEXT, processingStateText);
    }

    @JsonIgnore
    public String getProcessingStateText() {
        Object objValue = this._get(DTOFIELD_PROCESSINGSTATETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProcessingStateTextDirty() {
        return this._contains(DTOFIELD_PROCESSINGSTATETEXT);
    }

    @JsonIgnore
    public void resetProcessingStateText() {
        this._reset(DTOFIELD_PROCESSINGSTATETEXT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO processingstatetext(String processingStateText) {
        this.setProcessingStateText(processingStateText);
        return this;
    }

    @JsonProperty(value="psdedtsqueueid")
    public void setPSDEDTSQueueId(String pSDEDTSQueueId) {
        this._set(DTOFIELD_PSDEDTSQUEUEID, pSDEDTSQueueId);
    }

    @JsonIgnore
    public String getPSDEDTSQueueId() {
        Object objValue = this._get(DTOFIELD_PSDEDTSQUEUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDTSQueueIdDirty() {
        return this._contains(DTOFIELD_PSDEDTSQUEUEID);
    }

    @JsonIgnore
    public void resetPSDEDTSQueueId() {
        this._reset(DTOFIELD_PSDEDTSQUEUEID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO psdedtsqueueid(String pSDEDTSQueueId) {
        this.setPSDEDTSQueueId(pSDEDTSQueueId);
        return this;
    }

    @JsonProperty(value="psdedtsqueuename")
    public void setPSDEDTSQueueName(String pSDEDTSQueueName) {
        this._set(DTOFIELD_PSDEDTSQUEUENAME, pSDEDTSQueueName);
    }

    @JsonIgnore
    public String getPSDEDTSQueueName() {
        Object objValue = this._get(DTOFIELD_PSDEDTSQUEUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDTSQueueNameDirty() {
        return this._contains(DTOFIELD_PSDEDTSQUEUENAME);
    }

    @JsonIgnore
    public void resetPSDEDTSQueueName() {
        this._reset(DTOFIELD_PSDEDTSQUEUENAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO psdedtsqueuename(String pSDEDTSQueueName) {
        this.setPSDEDTSQueueName(pSDEDTSQueueName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDTSQueueName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDTSQueueName(strName);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO name(String strName) {
        this.setPSDEDTSQueueName(strName);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEIdDirty() {
        return this._contains(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public void resetPSDEId() {
        this._reset(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pushpsdeactionid")
    public void setPushPSDEActionId(String pushPSDEActionId) {
        this._set(DTOFIELD_PUSHPSDEACTIONID, pushPSDEActionId);
    }

    @JsonIgnore
    public String getPushPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PUSHPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPushPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PUSHPSDEACTIONID);
    }

    @JsonIgnore
    public void resetPushPSDEActionId() {
        this._reset(DTOFIELD_PUSHPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionid(String pushPSDEActionId) {
        this.setPushPSDEActionId(pushPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPushPSDEActionId(null);
            this.setPushPSDEActionName(null);
        } else {
            this.setPushPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPushPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="pushpsdeactionname")
    public void setPushPSDEActionName(String pushPSDEActionName) {
        this._set(DTOFIELD_PUSHPSDEACTIONNAME, pushPSDEActionName);
    }

    @JsonIgnore
    public String getPushPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PUSHPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPushPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PUSHPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPushPSDEActionName() {
        this._reset(DTOFIELD_PUSHPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionname(String pushPSDEActionName) {
        this.setPushPSDEActionName(pushPSDEActionName);
        return this;
    }

    @JsonProperty(value="queueparams")
    public void setQueueParams(String queueParams) {
        this._set(DTOFIELD_QUEUEPARAMS, queueParams);
    }

    @JsonIgnore
    public String getQueueParams() {
        Object objValue = this._get(DTOFIELD_QUEUEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueueParamsDirty() {
        return this._contains(DTOFIELD_QUEUEPARAMS);
    }

    @JsonIgnore
    public void resetQueueParams() {
        this._reset(DTOFIELD_QUEUEPARAMS);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO queueparams(String queueParams) {
        this.setQueueParams(queueParams);
        return this;
    }

    @JsonProperty(value="refreshpsdeactionid")
    public void setRefreshPSDEActionId(String refreshPSDEActionId) {
        this._set(DTOFIELD_REFRESHPSDEACTIONID, refreshPSDEActionId);
    }

    @JsonIgnore
    public String getRefreshPSDEActionId() {
        Object objValue = this._get(DTOFIELD_REFRESHPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefreshPSDEActionIdDirty() {
        return this._contains(DTOFIELD_REFRESHPSDEACTIONID);
    }

    @JsonIgnore
    public void resetRefreshPSDEActionId() {
        this._reset(DTOFIELD_REFRESHPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionid(String refreshPSDEActionId) {
        this.setRefreshPSDEActionId(refreshPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setRefreshPSDEActionId(null);
            this.setRefreshPSDEActionName(null);
        } else {
            this.setRefreshPSDEActionId(pSDEAction.getPSDEActionId());
            this.setRefreshPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="refreshpsdeactionname")
    public void setRefreshPSDEActionName(String refreshPSDEActionName) {
        this._set(DTOFIELD_REFRESHPSDEACTIONNAME, refreshPSDEActionName);
    }

    @JsonIgnore
    public String getRefreshPSDEActionName() {
        Object objValue = this._get(DTOFIELD_REFRESHPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefreshPSDEActionNameDirty() {
        return this._contains(DTOFIELD_REFRESHPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetRefreshPSDEActionName() {
        this._reset(DTOFIELD_REFRESHPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionname(String refreshPSDEActionName) {
        this.setRefreshPSDEActionName(refreshPSDEActionName);
        return this;
    }

    @JsonProperty(value="refreshtimer")
    public void setRefreshTimer(Integer refreshTimer) {
        this._set(DTOFIELD_REFRESHTIMER, refreshTimer);
    }

    @JsonIgnore
    public Integer getRefreshTimer() {
        Object objValue = this._get(DTOFIELD_REFRESHTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefreshTimerDirty() {
        return this._contains(DTOFIELD_REFRESHTIMER);
    }

    @JsonIgnore
    public void resetRefreshTimer() {
        this._reset(DTOFIELD_REFRESHTIMER);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO refreshtimer(Integer refreshTimer) {
        this.setRefreshTimer(refreshTimer);
        return this;
    }

    @JsonProperty(value="statepsdefid")
    public void setStatePSDEFId(String statePSDEFId) {
        this._set(DTOFIELD_STATEPSDEFID, statePSDEFId);
    }

    @JsonIgnore
    public String getStatePSDEFId() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFIdDirty() {
        return this._contains(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public void resetStatePSDEFId() {
        this._reset(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO statepsdefid(String statePSDEFId) {
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO statepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        } else {
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="statepsdefname")
    public void setStatePSDEFName(String statePSDEFName) {
        this._set(DTOFIELD_STATEPSDEFNAME, statePSDEFName);
    }

    @JsonIgnore
    public String getStatePSDEFName() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFNameDirty() {
        return this._contains(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public void resetStatePSDEFName() {
        this._reset(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO statepsdefname(String statePSDEFName) {
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    @JsonProperty(value="timepsdefid")
    public void setTimePSDEFId(String timePSDEFId) {
        this._set(DTOFIELD_TIMEPSDEFID, timePSDEFId);
    }

    @JsonIgnore
    public String getTimePSDEFId() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFIdDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public void resetTimePSDEFId() {
        this._reset(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefid(String timePSDEFId) {
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        } else {
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="timepsdefname")
    public void setTimePSDEFName(String timePSDEFName) {
        this._set(DTOFIELD_TIMEPSDEFNAME, timePSDEFName);
    }

    @JsonIgnore
    public String getTimePSDEFName() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFNameDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTimePSDEFName() {
        this._reset(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefname(String timePSDEFName) {
        this.setTimePSDEFName(timePSDEFName);
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
    public PSDEDTSQueueDTO updatedate(Timestamp updateDate) {
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
    public PSDEDTSQueueDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
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
    public PSDEDTSQueueDTO usertag(String userTag) {
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
    public PSDEDTSQueueDTO usertag2(String userTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSDEDTSQueueDTO usertag3(String userTag3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSDEDTSQueueDTO usertag4(String userTag4) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSDEDTSQueueDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDTSQueueDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDTSQueueId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDTSQueueId(strValue);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO id(String strValue) {
        this.setPSDEDTSQueueId(strValue);
        return this;
    }
}
