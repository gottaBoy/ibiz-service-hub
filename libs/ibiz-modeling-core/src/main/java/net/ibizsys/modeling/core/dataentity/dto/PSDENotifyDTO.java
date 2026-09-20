package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDENotifyDTO
extends PSModelDTOBase {
    public static final String FIELD_ATTACHMENTTYPE = "ATTACHMENTTYPE";
    protected static final String DTOFIELD_ATTACHMENTTYPE = "attachmenttype";
    public static final String FIELD_BEGINPSDEFID = "BEGINPSDEFID";
    protected static final String DTOFIELD_BEGINPSDEFID = "beginpsdefid";
    public static final String FIELD_BEGINPSDEFNAME = "BEGINPSDEFNAME";
    protected static final String DTOFIELD_BEGINPSDEFNAME = "beginpsdefname";
    public static final String FIELD_CHECKTIMER = "CHECKTIMER";
    protected static final String DTOFIELD_CHECKTIMER = "checktimer";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_ENDPSDEFID = "ENDPSDEFID";
    protected static final String DTOFIELD_ENDPSDEFID = "endpsdefid";
    public static final String FIELD_ENDPSDEFNAME = "ENDPSDEFNAME";
    protected static final String DTOFIELD_ENDPSDEFNAME = "endpsdefname";
    public static final String FIELD_EVENTMODEL = "EVENTMODEL";
    protected static final String DTOFIELD_EVENTMODEL = "eventmodel";
    public static final String FIELD_EVENTS = "EVENTS";
    protected static final String DTOFIELD_EVENTS = "events";
    public static final String FIELD_FILTERMODEL = "FILTERMODEL";
    protected static final String DTOFIELD_FILTERMODEL = "filtermodel";
    public static final String FIELD_IGNOREEXCEPTION = "IGNOREEXCEPTION";
    protected static final String DTOFIELD_IGNOREEXCEPTION = "ignoreexception";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSGTYPE = "MSGTYPE";
    protected static final String DTOFIELD_MSGTYPE = "msgtype";
    public static final String FIELD_NOTIFYEND = "NOTIFYEND";
    protected static final String DTOFIELD_NOTIFYEND = "notifyend";
    public static final String FIELD_NOTIFYSTART = "NOTIFYSTART";
    protected static final String DTOFIELD_NOTIFYSTART = "notifystart";
    public static final String FIELD_NOTIFYSUBTYPE = "NOTIFYSUBTYPE";
    protected static final String DTOFIELD_NOTIFYSUBTYPE = "notifysubtype";
    public static final String FIELD_NOTIFYTAG = "NOTIFYTAG";
    protected static final String DTOFIELD_NOTIFYTAG = "notifytag";
    public static final String FIELD_NOTIFYTAG2 = "NOTIFYTAG2";
    protected static final String DTOFIELD_NOTIFYTAG2 = "notifytag2";
    public static final String FIELD_PROPERTYMAP = "PROPERTYMAP";
    protected static final String DTOFIELD_PROPERTYMAP = "propertymap";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDENOTIFYID = "PSDENOTIFYID";
    protected static final String DTOFIELD_PSDENOTIFYID = "psdenotifyid";
    public static final String FIELD_PSDENOTIFYNAME = "PSDENOTIFYNAME";
    protected static final String DTOFIELD_PSDENOTIFYNAME = "psdenotifyname";
    public static final String FIELD_PSDEPRINTID = "PSDEPRINTID";
    protected static final String DTOFIELD_PSDEPRINTID = "psdeprintid";
    public static final String FIELD_PSDEPRINTNAME = "PSDEPRINTNAME";
    protected static final String DTOFIELD_PSDEPRINTNAME = "psdeprintname";
    public static final String FIELD_PSDEREPORTID = "PSDEREPORTID";
    protected static final String DTOFIELD_PSDEREPORTID = "psdereportid";
    public static final String FIELD_PSDEREPORTNAME = "PSDEREPORTNAME";
    protected static final String DTOFIELD_PSDEREPORTNAME = "psdereportname";
    public static final String FIELD_PSSYSMSGQUEUEID = "PSSYSMSGQUEUEID";
    protected static final String DTOFIELD_PSSYSMSGQUEUEID = "pssysmsgqueueid";
    public static final String FIELD_PSSYSMSGQUEUENAME = "PSSYSMSGQUEUENAME";
    protected static final String DTOFIELD_PSSYSMSGQUEUENAME = "pssysmsgqueuename";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_TASKMODE = "TASKMODE";
    protected static final String DTOFIELD_TASKMODE = "taskmode";
    public static final String FIELD_TEMPLFLAG = "TEMPLFLAG";
    protected static final String DTOFIELD_TEMPLFLAG = "templflag";
    public static final String FIELD_THREADRUNMODE = "THREADRUNMODE";
    protected static final String DTOFIELD_THREADRUNMODE = "threadrunmode";
    public static final String FIELD_TIMERMODE = "TIMERMODE";
    protected static final String DTOFIELD_TIMERMODE = "timermode";
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
    public static final String DTOFIELD_PSDENOTIFYTARGETS = "psdenotifytargets";

    @JsonProperty(value="attachmenttype")
    public void setAttachmentType(String attachmentType) {
        this._set(DTOFIELD_ATTACHMENTTYPE, attachmentType);
    }

    @JsonIgnore
    public String getAttachmentType() {
        Object objValue = this._get(DTOFIELD_ATTACHMENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttachmentTypeDirty() {
        return this._contains(DTOFIELD_ATTACHMENTTYPE);
    }

    @JsonIgnore
    public void resetAttachmentType() {
        this._reset(DTOFIELD_ATTACHMENTTYPE);
    }

    @JsonIgnore
    public PSDENotifyDTO attachmenttype(String attachmentType) {
        this.setAttachmentType(attachmentType);
        return this;
    }

    @JsonProperty(value="beginpsdefid")
    public void setBeginPSDEFId(String beginPSDEFId) {
        this._set(DTOFIELD_BEGINPSDEFID, beginPSDEFId);
    }

    @JsonIgnore
    public String getBeginPSDEFId() {
        Object objValue = this._get(DTOFIELD_BEGINPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginPSDEFIdDirty() {
        return this._contains(DTOFIELD_BEGINPSDEFID);
    }

    @JsonIgnore
    public void resetBeginPSDEFId() {
        this._reset(DTOFIELD_BEGINPSDEFID);
    }

    @JsonIgnore
    public PSDENotifyDTO beginpsdefid(String beginPSDEFId) {
        this.setBeginPSDEFId(beginPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO beginpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBeginPSDEFId(null);
            this.setBeginPSDEFName(null);
        } else {
            this.setBeginPSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="beginpsdefname")
    public void setBeginPSDEFName(String beginPSDEFName) {
        this._set(DTOFIELD_BEGINPSDEFNAME, beginPSDEFName);
    }

    @JsonIgnore
    public String getBeginPSDEFName() {
        Object objValue = this._get(DTOFIELD_BEGINPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginPSDEFNameDirty() {
        return this._contains(DTOFIELD_BEGINPSDEFNAME);
    }

    @JsonIgnore
    public void resetBeginPSDEFName() {
        this._reset(DTOFIELD_BEGINPSDEFNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO beginpsdefname(String beginPSDEFName) {
        this.setBeginPSDEFName(beginPSDEFName);
        return this;
    }

    @JsonProperty(value="checktimer")
    public void setCheckTimer(Integer checkTimer) {
        this._set(DTOFIELD_CHECKTIMER, checkTimer);
    }

    @JsonIgnore
    public Integer getCheckTimer() {
        Object objValue = this._get(DTOFIELD_CHECKTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckTimerDirty() {
        return this._contains(DTOFIELD_CHECKTIMER);
    }

    @JsonIgnore
    public void resetCheckTimer() {
        this._reset(DTOFIELD_CHECKTIMER);
    }

    @JsonIgnore
    public PSDENotifyDTO checktimer(Integer checkTimer) {
        this.setCheckTimer(checkTimer);
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
    public PSDENotifyDTO codename(String codeName) {
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
    public PSDENotifyDTO createdate(Timestamp createDate) {
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
    public PSDENotifyDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDENotifyDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSDENotifyDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDENotifyDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSDENotifyDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="endpsdefid")
    public void setEndPSDEFId(String endPSDEFId) {
        this._set(DTOFIELD_ENDPSDEFID, endPSDEFId);
    }

    @JsonIgnore
    public String getEndPSDEFId() {
        Object objValue = this._get(DTOFIELD_ENDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndPSDEFIdDirty() {
        return this._contains(DTOFIELD_ENDPSDEFID);
    }

    @JsonIgnore
    public void resetEndPSDEFId() {
        this._reset(DTOFIELD_ENDPSDEFID);
    }

    @JsonIgnore
    public PSDENotifyDTO endpsdefid(String endPSDEFId) {
        this.setEndPSDEFId(endPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO endpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setEndPSDEFId(null);
            this.setEndPSDEFName(null);
        } else {
            this.setEndPSDEFId(pSDEField.getPSDEFieldId());
            this.setEndPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="endpsdefname")
    public void setEndPSDEFName(String endPSDEFName) {
        this._set(DTOFIELD_ENDPSDEFNAME, endPSDEFName);
    }

    @JsonIgnore
    public String getEndPSDEFName() {
        Object objValue = this._get(DTOFIELD_ENDPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndPSDEFNameDirty() {
        return this._contains(DTOFIELD_ENDPSDEFNAME);
    }

    @JsonIgnore
    public void resetEndPSDEFName() {
        this._reset(DTOFIELD_ENDPSDEFNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO endpsdefname(String endPSDEFName) {
        this.setEndPSDEFName(endPSDEFName);
        return this;
    }

    @JsonProperty(value="eventmodel")
    public void setEventModel(String eventModel) {
        this._set(DTOFIELD_EVENTMODEL, eventModel);
    }

    @JsonIgnore
    public String getEventModel() {
        Object objValue = this._get(DTOFIELD_EVENTMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventModelDirty() {
        return this._contains(DTOFIELD_EVENTMODEL);
    }

    @JsonIgnore
    public void resetEventModel() {
        this._reset(DTOFIELD_EVENTMODEL);
    }

    @JsonIgnore
    public PSDENotifyDTO eventmodel(String eventModel) {
        this.setEventModel(eventModel);
        return this;
    }

    @JsonProperty(value="events")
    public void setEvents(String events) {
        this._set(DTOFIELD_EVENTS, events);
    }

    @JsonIgnore
    public String getEvents() {
        Object objValue = this._get(DTOFIELD_EVENTS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventsDirty() {
        return this._contains(DTOFIELD_EVENTS);
    }

    @JsonIgnore
    public void resetEvents() {
        this._reset(DTOFIELD_EVENTS);
    }

    @JsonIgnore
    public PSDENotifyDTO events(String events) {
        this.setEvents(events);
        return this;
    }

    @JsonProperty(value="filtermodel")
    public void setFilterModel(String filterModel) {
        this._set(DTOFIELD_FILTERMODEL, filterModel);
    }

    @JsonIgnore
    public String getFilterModel() {
        Object objValue = this._get(DTOFIELD_FILTERMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterModelDirty() {
        return this._contains(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public void resetFilterModel() {
        this._reset(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public PSDENotifyDTO filtermodel(String filterModel) {
        this.setFilterModel(filterModel);
        return this;
    }

    @JsonProperty(value="ignoreexception")
    public void setIgnoreException(Integer ignoreException) {
        this._set(DTOFIELD_IGNOREEXCEPTION, ignoreException);
    }

    @JsonIgnore
    public Integer getIgnoreException() {
        Object objValue = this._get(DTOFIELD_IGNOREEXCEPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreExceptionDirty() {
        return this._contains(DTOFIELD_IGNOREEXCEPTION);
    }

    @JsonIgnore
    public void resetIgnoreException() {
        this._reset(DTOFIELD_IGNOREEXCEPTION);
    }

    @JsonIgnore
    public PSDENotifyDTO ignoreexception(Integer ignoreException) {
        this.setIgnoreException(ignoreException);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO ignoreexception(Boolean ignoreException) {
        if (ignoreException == null) {
            this.setIgnoreException(null);
        } else {
            this.setIgnoreException(ignoreException != false ? 1 : 0);
        }
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
    public PSDENotifyDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="msgtype")
    public void setMsgType(Integer msgType) {
        this._set(DTOFIELD_MSGTYPE, msgType);
    }

    @JsonIgnore
    public Integer getMsgType() {
        Object objValue = this._get(DTOFIELD_MSGTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMsgTypeDirty() {
        return this._contains(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public void resetMsgType() {
        this._reset(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public PSDENotifyDTO msgtype(Integer msgType) {
        this.setMsgType(msgType);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO msgtype(PSModelEnums.InfomMsgType[] msgType) {
        if (msgType == null || msgType.length == 0) {
            this.setMsgType(null);
        } else {
            int _value = 0;
            for (PSModelEnums.InfomMsgType _item : msgType) {
                _value |= _item.value;
            }
            this.setMsgType(_value);
        }
        return this;
    }

    @JsonProperty(value="notifyend")
    public void setNotifyEnd(Integer notifyEnd) {
        this._set(DTOFIELD_NOTIFYEND, notifyEnd);
    }

    @JsonIgnore
    public Integer getNotifyEnd() {
        Object objValue = this._get(DTOFIELD_NOTIFYEND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNotifyEndDirty() {
        return this._contains(DTOFIELD_NOTIFYEND);
    }

    @JsonIgnore
    public void resetNotifyEnd() {
        this._reset(DTOFIELD_NOTIFYEND);
    }

    @JsonIgnore
    public PSDENotifyDTO notifyend(Integer notifyEnd) {
        this.setNotifyEnd(notifyEnd);
        return this;
    }

    @JsonProperty(value="notifystart")
    public void setNotifyStart(Integer notifyStart) {
        this._set(DTOFIELD_NOTIFYSTART, notifyStart);
    }

    @JsonIgnore
    public Integer getNotifyStart() {
        Object objValue = this._get(DTOFIELD_NOTIFYSTART);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNotifyStartDirty() {
        return this._contains(DTOFIELD_NOTIFYSTART);
    }

    @JsonIgnore
    public void resetNotifyStart() {
        this._reset(DTOFIELD_NOTIFYSTART);
    }

    @JsonIgnore
    public PSDENotifyDTO notifystart(Integer notifyStart) {
        this.setNotifyStart(notifyStart);
        return this;
    }

    @JsonProperty(value="notifysubtype")
    public void setNotifySubType(String notifySubType) {
        this._set(DTOFIELD_NOTIFYSUBTYPE, notifySubType);
    }

    @JsonIgnore
    public String getNotifySubType() {
        Object objValue = this._get(DTOFIELD_NOTIFYSUBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNotifySubTypeDirty() {
        return this._contains(DTOFIELD_NOTIFYSUBTYPE);
    }

    @JsonIgnore
    public void resetNotifySubType() {
        this._reset(DTOFIELD_NOTIFYSUBTYPE);
    }

    @JsonIgnore
    public PSDENotifyDTO notifysubtype(String notifySubType) {
        this.setNotifySubType(notifySubType);
        return this;
    }

    @JsonProperty(value="notifytag")
    public void setNotifyTag(String notifyTag) {
        this._set(DTOFIELD_NOTIFYTAG, notifyTag);
    }

    @JsonIgnore
    public String getNotifyTag() {
        Object objValue = this._get(DTOFIELD_NOTIFYTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNotifyTagDirty() {
        return this._contains(DTOFIELD_NOTIFYTAG);
    }

    @JsonIgnore
    public void resetNotifyTag() {
        this._reset(DTOFIELD_NOTIFYTAG);
    }

    @JsonIgnore
    public PSDENotifyDTO notifytag(String notifyTag) {
        this.setNotifyTag(notifyTag);
        return this;
    }

    @JsonProperty(value="notifytag2")
    public void setNotifyTag2(String notifyTag2) {
        this._set(DTOFIELD_NOTIFYTAG2, notifyTag2);
    }

    @JsonIgnore
    public String getNotifyTag2() {
        Object objValue = this._get(DTOFIELD_NOTIFYTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNotifyTag2Dirty() {
        return this._contains(DTOFIELD_NOTIFYTAG2);
    }

    @JsonIgnore
    public void resetNotifyTag2() {
        this._reset(DTOFIELD_NOTIFYTAG2);
    }

    @JsonIgnore
    public PSDENotifyDTO notifytag2(String notifyTag2) {
        this.setNotifyTag2(notifyTag2);
        return this;
    }

    @JsonProperty(value="propertymap")
    public void setPropertyMap(String propertyMap) {
        this._set(DTOFIELD_PROPERTYMAP, propertyMap);
    }

    @JsonIgnore
    public String getPropertyMap() {
        Object objValue = this._get(DTOFIELD_PROPERTYMAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPropertyMapDirty() {
        return this._contains(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public void resetPropertyMap() {
        this._reset(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public PSDENotifyDTO propertymap(String propertyMap) {
        this.setPropertyMap(propertyMap);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSDENotifyDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSDENotifyDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDENotifyDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdenotifyid")
    public void setPSDENotifyId(String pSDENotifyId) {
        this._set(DTOFIELD_PSDENOTIFYID, pSDENotifyId);
    }

    @JsonIgnore
    public String getPSDENotifyId() {
        Object objValue = this._get(DTOFIELD_PSDENOTIFYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENotifyIdDirty() {
        return this._contains(DTOFIELD_PSDENOTIFYID);
    }

    @JsonIgnore
    public void resetPSDENotifyId() {
        this._reset(DTOFIELD_PSDENOTIFYID);
    }

    @JsonIgnore
    public PSDENotifyDTO psdenotifyid(String pSDENotifyId) {
        this.setPSDENotifyId(pSDENotifyId);
        return this;
    }

    @JsonProperty(value="psdenotifyname")
    public void setPSDENotifyName(String pSDENotifyName) {
        this._set(DTOFIELD_PSDENOTIFYNAME, pSDENotifyName);
    }

    @JsonIgnore
    public String getPSDENotifyName() {
        Object objValue = this._get(DTOFIELD_PSDENOTIFYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENotifyNameDirty() {
        return this._contains(DTOFIELD_PSDENOTIFYNAME);
    }

    @JsonIgnore
    public void resetPSDENotifyName() {
        this._reset(DTOFIELD_PSDENOTIFYNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO psdenotifyname(String pSDENotifyName) {
        this.setPSDENotifyName(pSDENotifyName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDENotifyName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDENotifyName(strName);
    }

    @JsonIgnore
    public PSDENotifyDTO name(String strName) {
        this.setPSDENotifyName(strName);
        return this;
    }

    @JsonProperty(value="psdeprintid")
    public void setPSDEPrintId(String pSDEPrintId) {
        this._set(DTOFIELD_PSDEPRINTID, pSDEPrintId);
    }

    @JsonIgnore
    public String getPSDEPrintId() {
        Object objValue = this._get(DTOFIELD_PSDEPRINTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPrintIdDirty() {
        return this._contains(DTOFIELD_PSDEPRINTID);
    }

    @JsonIgnore
    public void resetPSDEPrintId() {
        this._reset(DTOFIELD_PSDEPRINTID);
    }

    @JsonIgnore
    public PSDENotifyDTO psdeprintid(String pSDEPrintId) {
        this.setPSDEPrintId(pSDEPrintId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO psdeprintid(PSDEPrintDTO pSDEPrint) {
        if (pSDEPrint == null) {
            this.setPSDEPrintId(null);
            this.setPSDEPrintName(null);
        } else {
            this.setPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    @JsonProperty(value="psdeprintname")
    public void setPSDEPrintName(String pSDEPrintName) {
        this._set(DTOFIELD_PSDEPRINTNAME, pSDEPrintName);
    }

    @JsonIgnore
    public String getPSDEPrintName() {
        Object objValue = this._get(DTOFIELD_PSDEPRINTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPrintNameDirty() {
        return this._contains(DTOFIELD_PSDEPRINTNAME);
    }

    @JsonIgnore
    public void resetPSDEPrintName() {
        this._reset(DTOFIELD_PSDEPRINTNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO psdeprintname(String pSDEPrintName) {
        this.setPSDEPrintName(pSDEPrintName);
        return this;
    }

    @JsonProperty(value="psdereportid")
    public void setPSDEReportId(String pSDEReportId) {
        this._set(DTOFIELD_PSDEREPORTID, pSDEReportId);
    }

    @JsonIgnore
    public String getPSDEReportId() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportIdDirty() {
        return this._contains(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public void resetPSDEReportId() {
        this._reset(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public PSDENotifyDTO psdereportid(String pSDEReportId) {
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO psdereportid(PSDEReportDTO pSDEReport) {
        if (pSDEReport == null) {
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        } else {
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    @JsonProperty(value="psdereportname")
    public void setPSDEReportName(String pSDEReportName) {
        this._set(DTOFIELD_PSDEREPORTNAME, pSDEReportName);
    }

    @JsonIgnore
    public String getPSDEReportName() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportNameDirty() {
        return this._contains(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public void resetPSDEReportName() {
        this._reset(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO psdereportname(String pSDEReportName) {
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    @JsonProperty(value="pssysmsgqueueid")
    public void setPSSysMsgQueueId(String pSSysMsgQueueId) {
        this._set(DTOFIELD_PSSYSMSGQUEUEID, pSSysMsgQueueId);
    }

    @JsonIgnore
    public String getPSSysMsgQueueId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGQUEUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgQueueIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGQUEUEID);
    }

    @JsonIgnore
    public void resetPSSysMsgQueueId() {
        this._reset(DTOFIELD_PSSYSMSGQUEUEID);
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueueid(String pSSysMsgQueueId) {
        this.setPSSysMsgQueueId(pSSysMsgQueueId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueueid(PSSysMsgQueueDTO pSSysMsgQueue) {
        if (pSSysMsgQueue == null) {
            this.setPSSysMsgQueueId(null);
            this.setPSSysMsgQueueName(null);
        } else {
            this.setPSSysMsgQueueId(pSSysMsgQueue.getPSSysMsgQueueId());
            this.setPSSysMsgQueueName(pSSysMsgQueue.getPSSysMsgQueueName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgqueuename")
    public void setPSSysMsgQueueName(String pSSysMsgQueueName) {
        this._set(DTOFIELD_PSSYSMSGQUEUENAME, pSSysMsgQueueName);
    }

    @JsonIgnore
    public String getPSSysMsgQueueName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGQUEUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgQueueNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGQUEUENAME);
    }

    @JsonIgnore
    public void resetPSSysMsgQueueName() {
        this._reset(DTOFIELD_PSSYSMSGQUEUENAME);
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgqueuename(String pSSysMsgQueueName) {
        this.setPSSysMsgQueueName(pSSysMsgQueueName);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSDENotifyDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSDENotifyDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDENotifyDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="taskmode")
    public void setTaskMode(Integer taskMode) {
        this._set(DTOFIELD_TASKMODE, taskMode);
    }

    @JsonIgnore
    public Integer getTaskMode() {
        Object objValue = this._get(DTOFIELD_TASKMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTaskModeDirty() {
        return this._contains(DTOFIELD_TASKMODE);
    }

    @JsonIgnore
    public void resetTaskMode() {
        this._reset(DTOFIELD_TASKMODE);
    }

    @JsonIgnore
    public PSDENotifyDTO taskmode(Integer taskMode) {
        this.setTaskMode(taskMode);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO taskmode(PSModelEnums.DENotifyTaskMode taskMode) {
        if (taskMode == null) {
            this.setTaskMode(null);
        } else {
            this.setTaskMode(taskMode.value);
        }
        return this;
    }

    @JsonProperty(value="templflag")
    public void setTemplFlag(Integer templFlag) {
        this._set(DTOFIELD_TEMPLFLAG, templFlag);
    }

    @JsonIgnore
    public Integer getTemplFlag() {
        Object objValue = this._get(DTOFIELD_TEMPLFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplFlagDirty() {
        return this._contains(DTOFIELD_TEMPLFLAG);
    }

    @JsonIgnore
    public void resetTemplFlag() {
        this._reset(DTOFIELD_TEMPLFLAG);
    }

    @JsonIgnore
    public PSDENotifyDTO templflag(Integer templFlag) {
        this.setTemplFlag(templFlag);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO templflag(Boolean templFlag) {
        if (templFlag == null) {
            this.setTemplFlag(null);
        } else {
            this.setTemplFlag(templFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="threadrunmode")
    public void setThreadRunMode(Integer threadRunMode) {
        this._set(DTOFIELD_THREADRUNMODE, threadRunMode);
    }

    @JsonIgnore
    public Integer getThreadRunMode() {
        Object objValue = this._get(DTOFIELD_THREADRUNMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThreadRunModeDirty() {
        return this._contains(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public void resetThreadRunMode() {
        this._reset(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public PSDENotifyDTO threadrunmode(Integer threadRunMode) {
        this.setThreadRunMode(threadRunMode);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO threadrunmode(PSModelEnums.DELogicThreadRunMode threadRunMode) {
        if (threadRunMode == null) {
            this.setThreadRunMode(null);
        } else {
            this.setThreadRunMode(threadRunMode.value);
        }
        return this;
    }

    @JsonProperty(value="timermode")
    public void setTimerMode(Integer timerMode) {
        this._set(DTOFIELD_TIMERMODE, timerMode);
    }

    @JsonIgnore
    public Integer getTimerMode() {
        Object objValue = this._get(DTOFIELD_TIMERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimerModeDirty() {
        return this._contains(DTOFIELD_TIMERMODE);
    }

    @JsonIgnore
    public void resetTimerMode() {
        this._reset(DTOFIELD_TIMERMODE);
    }

    @JsonIgnore
    public PSDENotifyDTO timermode(Integer timerMode) {
        this.setTimerMode(timerMode);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO timermode(Boolean timerMode) {
        if (timerMode == null) {
            this.setTimerMode(null);
        } else {
            this.setTimerMode(timerMode != false ? 1 : 0);
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
    public PSDENotifyDTO updatedate(Timestamp updateDate) {
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
    public PSDENotifyDTO updateman(String updateMan) {
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
    public PSDENotifyDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDENotifyDTO usertag(String userTag) {
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
    public PSDENotifyDTO usertag2(String userTag2) {
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
    public PSDENotifyDTO usertag3(String userTag3) {
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
    public PSDENotifyDTO usertag4(String userTag4) {
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
    public PSDENotifyDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDENotifyDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDENotifyId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDENotifyId(strValue);
    }

    @JsonIgnore
    public PSDENotifyDTO id(String strValue) {
        this.setPSDENotifyId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDENotifyTargetDTO> getPSDENotifyTargets() {
        Object list = this._get(DTOFIELD_PSDENOTIFYTARGETS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdenotifytargets")
    public void setPSDENotifyTargets(List<PSDENotifyTargetDTO> psdenotifytargets) {
        this._set(DTOFIELD_PSDENOTIFYTARGETS, psdenotifytargets);
    }

    @JsonIgnore
    public List<PSDENotifyTargetDTO> getPSDENotifyTargetsIf() {
        Object list = this._get(DTOFIELD_PSDENOTIFYTARGETS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDENOTIFYTARGETS, list);
        }
        return (List) list;
    }
}
