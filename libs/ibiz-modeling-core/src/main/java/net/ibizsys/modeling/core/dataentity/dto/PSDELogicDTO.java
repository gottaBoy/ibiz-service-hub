package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELogicDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEBUGMODE = "DEBUGMODE";
    protected static final String DTOFIELD_DEBUGMODE = "debugmode";
    public static final String FIELD_DEFAULTMSLOGIC = "DEFAULTMSLOGIC";
    protected static final String DTOFIELD_DEFAULTMSLOGIC = "defaultmslogic";
    public static final String FIELD_DEFLOGICMODE = "DEFLOGICMODE";
    protected static final String DTOFIELD_DEFLOGICMODE = "deflogicmode";
    public static final String FIELD_EVENTMODEL = "EVENTMODEL";
    protected static final String DTOFIELD_EVENTMODEL = "eventmodel";
    public static final String FIELD_EVENTS = "EVENTS";
    protected static final String DTOFIELD_EVENTS = "events";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FINISHFLAG = "FINISHFLAG";
    protected static final String DTOFIELD_FINISHFLAG = "finishflag";
    public static final String FIELD_IGNOREEXCEPTION = "IGNOREEXCEPTION";
    protected static final String DTOFIELD_IGNOREEXCEPTION = "ignoreexception";
    public static final String FIELD_LOGICHOLDER = "LOGICHOLDER";
    protected static final String DTOFIELD_LOGICHOLDER = "logicholder";
    public static final String FIELD_LOGICSN = "LOGICSN";
    protected static final String DTOFIELD_LOGICSN = "logicsn";
    public static final String FIELD_LOGICSUBTYPE = "LOGICSUBTYPE";
    protected static final String DTOFIELD_LOGICSUBTYPE = "logicsubtype";
    public static final String FIELD_LOGICTAG = "LOGICTAG";
    protected static final String DTOFIELD_LOGICTAG = "logictag";
    public static final String FIELD_LOGICTAG2 = "LOGICTAG2";
    protected static final String DTOFIELD_LOGICTAG2 = "logictag2";
    public static final String FIELD_LOGICTAG3 = "LOGICTAG3";
    protected static final String DTOFIELD_LOGICTAG3 = "logictag3";
    public static final String FIELD_LOGICTAG4 = "LOGICTAG4";
    protected static final String DTOFIELD_LOGICTAG4 = "logictag4";
    public static final String FIELD_LOGICTYPE = "LOGICTYPE";
    protected static final String DTOFIELD_LOGICTYPE = "logictype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_SCRIPTENGINE = "SCRIPTENGINE";
    protected static final String DTOFIELD_SCRIPTENGINE = "scriptengine";
    public static final String FIELD_TEMPLFLAG = "TEMPLFLAG";
    protected static final String DTOFIELD_TEMPLFLAG = "templflag";
    public static final String FIELD_THREADRUNMODE = "THREADRUNMODE";
    protected static final String DTOFIELD_THREADRUNMODE = "threadrunmode";
    public static final String FIELD_TIMERPOLICY = "TIMERPOLICY";
    protected static final String DTOFIELD_TIMERPOLICY = "timerpolicy";
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
    public static final String DTOFIELD_PSDELOGICLINKS = "psdelogiclinks";
    public static final String DTOFIELD_PSDELOGICNODES = "psdelogicnodes";
    public static final String DTOFIELD_PSDELOGICPARAMS = "psdelogicparams";

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
    public PSDELogicDTO codename(String codeName) {
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
    public PSDELogicDTO createdate(Timestamp createDate) {
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
    public PSDELogicDTO createman(String createMan) {
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
    public PSDELogicDTO customcode(String customCode) {
        this.setCustomCode(customCode);
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
    public PSDELogicDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO custommode(PSModelEnums.ScriptMode customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="debugmode")
    public void setDebugMode(Integer debugMode) {
        this._set(DTOFIELD_DEBUGMODE, debugMode);
    }

    @JsonIgnore
    public Integer getDebugMode() {
        Object objValue = this._get(DTOFIELD_DEBUGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDebugModeDirty() {
        return this._contains(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public void resetDebugMode() {
        this._reset(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public PSDELogicDTO debugmode(Integer debugMode) {
        this.setDebugMode(debugMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO debugmode(PSModelEnums.DELogicDebugMode debugMode) {
        if (debugMode == null) {
            this.setDebugMode(null);
        } else {
            this.setDebugMode(debugMode.value);
        }
        return this;
    }

    @JsonProperty(value="defaultmslogic")
    public void setDefaultMSLogic(Integer defaultMSLogic) {
        this._set(DTOFIELD_DEFAULTMSLOGIC, defaultMSLogic);
    }

    @JsonIgnore
    public Integer getDefaultMSLogic() {
        Object objValue = this._get(DTOFIELD_DEFAULTMSLOGIC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultMSLogicDirty() {
        return this._contains(DTOFIELD_DEFAULTMSLOGIC);
    }

    @JsonIgnore
    public void resetDefaultMSLogic() {
        this._reset(DTOFIELD_DEFAULTMSLOGIC);
    }

    @JsonIgnore
    public PSDELogicDTO defaultmslogic(Integer defaultMSLogic) {
        this.setDefaultMSLogic(defaultMSLogic);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO defaultmslogic(Boolean defaultMSLogic) {
        if (defaultMSLogic == null) {
            this.setDefaultMSLogic(null);
        } else {
            this.setDefaultMSLogic(defaultMSLogic != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="deflogicmode")
    public void setDEFLogicMode(String dEFLogicMode) {
        this._set(DTOFIELD_DEFLOGICMODE, dEFLogicMode);
    }

    @JsonIgnore
    public String getDEFLogicMode() {
        Object objValue = this._get(DTOFIELD_DEFLOGICMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFLogicModeDirty() {
        return this._contains(DTOFIELD_DEFLOGICMODE);
    }

    @JsonIgnore
    public void resetDEFLogicMode() {
        this._reset(DTOFIELD_DEFLOGICMODE);
    }

    @JsonIgnore
    public PSDELogicDTO deflogicmode(String dEFLogicMode) {
        this.setDEFLogicMode(dEFLogicMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO deflogicmode(PSModelEnums.DEFLogicMode dEFLogicMode) {
        if (dEFLogicMode == null) {
            this.setDEFLogicMode(null);
        } else {
            this.setDEFLogicMode(dEFLogicMode.value);
        }
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
    public PSDELogicDTO eventmodel(String eventModel) {
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
    public PSDELogicDTO events(String events) {
        this.setEvents(events);
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDELogicDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="finishflag")
    public void setFinishFlag(Integer finishFlag) {
        this._set(DTOFIELD_FINISHFLAG, finishFlag);
    }

    @JsonIgnore
    public Integer getFinishFlag() {
        Object objValue = this._get(DTOFIELD_FINISHFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFinishFlagDirty() {
        return this._contains(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public void resetFinishFlag() {
        this._reset(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public PSDELogicDTO finishflag(Integer finishFlag) {
        this.setFinishFlag(finishFlag);
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
    public PSDELogicDTO ignoreexception(Integer ignoreException) {
        this.setIgnoreException(ignoreException);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO ignoreexception(Boolean ignoreException) {
        if (ignoreException == null) {
            this.setIgnoreException(null);
        } else {
            this.setIgnoreException(ignoreException != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="logicholder")
    public void setLogicHolder(Integer logicHolder) {
        this._set(DTOFIELD_LOGICHOLDER, logicHolder);
    }

    @JsonIgnore
    public Integer getLogicHolder() {
        Object objValue = this._get(DTOFIELD_LOGICHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLogicHolderDirty() {
        return this._contains(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public void resetLogicHolder() {
        this._reset(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public PSDELogicDTO logicholder(Integer logicHolder) {
        this.setLogicHolder(logicHolder);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO logicholder(PSModelEnums.DELogicHolder logicHolder) {
        if (logicHolder == null) {
            this.setLogicHolder(null);
        } else {
            this.setLogicHolder(logicHolder.value);
        }
        return this;
    }

    @JsonProperty(value="logicsn")
    public void setLogicSN(String logicSN) {
        this._set(DTOFIELD_LOGICSN, logicSN);
    }

    @JsonIgnore
    public String getLogicSN() {
        Object objValue = this._get(DTOFIELD_LOGICSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicSNDirty() {
        return this._contains(DTOFIELD_LOGICSN);
    }

    @JsonIgnore
    public void resetLogicSN() {
        this._reset(DTOFIELD_LOGICSN);
    }

    @JsonIgnore
    public PSDELogicDTO logicsn(String logicSN) {
        this.setLogicSN(logicSN);
        return this;
    }

    @JsonProperty(value="logicsubtype")
    public void setLogicSubType(String logicSubType) {
        this._set(DTOFIELD_LOGICSUBTYPE, logicSubType);
    }

    @JsonIgnore
    public String getLogicSubType() {
        Object objValue = this._get(DTOFIELD_LOGICSUBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicSubTypeDirty() {
        return this._contains(DTOFIELD_LOGICSUBTYPE);
    }

    @JsonIgnore
    public void resetLogicSubType() {
        this._reset(DTOFIELD_LOGICSUBTYPE);
    }

    @JsonIgnore
    public PSDELogicDTO logicsubtype(String logicSubType) {
        this.setLogicSubType(logicSubType);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO logicsubtype(PSModelEnums.LogicSubType logicSubType) {
        if (logicSubType == null) {
            this.setLogicSubType(null);
        } else {
            this.setLogicSubType(logicSubType.value);
        }
        return this;
    }

    @JsonProperty(value="logictag")
    public void setLogicTag(String logicTag) {
        this._set(DTOFIELD_LOGICTAG, logicTag);
    }

    @JsonIgnore
    public String getLogicTag() {
        Object objValue = this._get(DTOFIELD_LOGICTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTagDirty() {
        return this._contains(DTOFIELD_LOGICTAG);
    }

    @JsonIgnore
    public void resetLogicTag() {
        this._reset(DTOFIELD_LOGICTAG);
    }

    @JsonIgnore
    public PSDELogicDTO logictag(String logicTag) {
        this.setLogicTag(logicTag);
        return this;
    }

    @JsonProperty(value="logictag2")
    public void setLogicTag2(String logicTag2) {
        this._set(DTOFIELD_LOGICTAG2, logicTag2);
    }

    @JsonIgnore
    public String getLogicTag2() {
        Object objValue = this._get(DTOFIELD_LOGICTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTag2Dirty() {
        return this._contains(DTOFIELD_LOGICTAG2);
    }

    @JsonIgnore
    public void resetLogicTag2() {
        this._reset(DTOFIELD_LOGICTAG2);
    }

    @JsonIgnore
    public PSDELogicDTO logictag2(String logicTag2) {
        this.setLogicTag2(logicTag2);
        return this;
    }

    @JsonProperty(value="logictag3")
    public void setLogicTag3(String logicTag3) {
        this._set(DTOFIELD_LOGICTAG3, logicTag3);
    }

    @JsonIgnore
    public String getLogicTag3() {
        Object objValue = this._get(DTOFIELD_LOGICTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTag3Dirty() {
        return this._contains(DTOFIELD_LOGICTAG3);
    }

    @JsonIgnore
    public void resetLogicTag3() {
        this._reset(DTOFIELD_LOGICTAG3);
    }

    @JsonIgnore
    public PSDELogicDTO logictag3(String logicTag3) {
        this.setLogicTag3(logicTag3);
        return this;
    }

    @JsonProperty(value="logictag4")
    public void setLogicTag4(String logicTag4) {
        this._set(DTOFIELD_LOGICTAG4, logicTag4);
    }

    @JsonIgnore
    public String getLogicTag4() {
        Object objValue = this._get(DTOFIELD_LOGICTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTag4Dirty() {
        return this._contains(DTOFIELD_LOGICTAG4);
    }

    @JsonIgnore
    public void resetLogicTag4() {
        this._reset(DTOFIELD_LOGICTAG4);
    }

    @JsonIgnore
    public PSDELogicDTO logictag4(String logicTag4) {
        this.setLogicTag4(logicTag4);
        return this;
    }

    @JsonProperty(value="logictype")
    public void setLogicType(String logicType) {
        this._set(DTOFIELD_LOGICTYPE, logicType);
    }

    @JsonIgnore
    public String getLogicType() {
        Object objValue = this._get(DTOFIELD_LOGICTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTypeDirty() {
        return this._contains(DTOFIELD_LOGICTYPE);
    }

    @JsonIgnore
    public void resetLogicType() {
        this._reset(DTOFIELD_LOGICTYPE);
    }

    @JsonIgnore
    public PSDELogicDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO logictype(PSModelEnums.LogicType logicType) {
        if (logicType == null) {
            this.setLogicType(null);
        } else {
            this.setLogicType(logicType.value);
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
    public PSDELogicDTO memo(String memo) {
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
    public PSDELogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSDELogicDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSDELogicDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSDELogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSDELogicDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSDELogicDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELogicName(strName);
    }

    @JsonIgnore
    public PSDELogicDTO name(String strName) {
        this.setPSDELogicName(strName);
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
    public PSDELogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSDELogicDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSDELogicDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDELogicDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDELogicDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSDELogicDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSDELogicDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDELogicDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDELogicDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="scriptengine")
    public void setScriptEngine(String scriptEngine) {
        this._set(DTOFIELD_SCRIPTENGINE, scriptEngine);
    }

    @JsonIgnore
    public String getScriptEngine() {
        Object objValue = this._get(DTOFIELD_SCRIPTENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isScriptEngineDirty() {
        return this._contains(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public void resetScriptEngine() {
        this._reset(DTOFIELD_SCRIPTENGINE);
    }

    @JsonIgnore
    public PSDELogicDTO scriptengine(String scriptEngine) {
        this.setScriptEngine(scriptEngine);
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
    public PSDELogicDTO templflag(Integer templFlag) {
        this.setTemplFlag(templFlag);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO templflag(Boolean templFlag) {
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
    public PSDELogicDTO threadrunmode(Integer threadRunMode) {
        this.setThreadRunMode(threadRunMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO threadrunmode(PSModelEnums.DELogicThreadRunMode threadRunMode) {
        if (threadRunMode == null) {
            this.setThreadRunMode(null);
        } else {
            this.setThreadRunMode(threadRunMode.value);
        }
        return this;
    }

    @JsonProperty(value="timerpolicy")
    public void setTimerPolicy(String timerPolicy) {
        this._set(DTOFIELD_TIMERPOLICY, timerPolicy);
    }

    @JsonIgnore
    public String getTimerPolicy() {
        Object objValue = this._get(DTOFIELD_TIMERPOLICY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimerPolicyDirty() {
        return this._contains(DTOFIELD_TIMERPOLICY);
    }

    @JsonIgnore
    public void resetTimerPolicy() {
        this._reset(DTOFIELD_TIMERPOLICY);
    }

    @JsonIgnore
    public PSDELogicDTO timerpolicy(String timerPolicy) {
        this.setTimerPolicy(timerPolicy);
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
    public PSDELogicDTO updatedate(Timestamp updateDate) {
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
    public PSDELogicDTO updateman(String updateMan) {
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
    public PSDELogicDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELogicDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDELogicDTO usertag(String userTag) {
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
    public PSDELogicDTO usertag2(String userTag2) {
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
    public PSDELogicDTO usertag3(String userTag3) {
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
    public PSDELogicDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELogicId(strValue);
    }

    @JsonIgnore
    public PSDELogicDTO id(String strValue) {
        this.setPSDELogicId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDELogicLinkDTO> getPSDELogicLinks() {
        Object list = this._get(DTOFIELD_PSDELOGICLINKS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelogiclinks")
    public void setPSDELogicLinks(List<PSDELogicLinkDTO> psdelogiclinks) {
        this._set(DTOFIELD_PSDELOGICLINKS, psdelogiclinks);
    }

    @JsonIgnore
    public List<PSDELogicLinkDTO> getPSDELogicLinksIf() {
        Object list = this._get(DTOFIELD_PSDELOGICLINKS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELOGICLINKS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDELogicNodeDTO> getPSDELogicNodes() {
        Object list = this._get(DTOFIELD_PSDELOGICNODES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelogicnodes")
    public void setPSDELogicNodes(List<PSDELogicNodeDTO> psdelogicnodes) {
        this._set(DTOFIELD_PSDELOGICNODES, psdelogicnodes);
    }

    @JsonIgnore
    public List<PSDELogicNodeDTO> getPSDELogicNodesIf() {
        Object list = this._get(DTOFIELD_PSDELOGICNODES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELOGICNODES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDELogicParamDTO> getPSDELogicParams() {
        Object list = this._get(DTOFIELD_PSDELOGICPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelogicparams")
    public void setPSDELogicParams(List<PSDELogicParamDTO> psdelogicparams) {
        this._set(DTOFIELD_PSDELOGICPARAMS, psdelogicparams);
    }

    @JsonIgnore
    public List<PSDELogicParamDTO> getPSDELogicParamsIf() {
        Object list = this._get(DTOFIELD_PSDELOGICPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELOGICPARAMS, list);
        }
        return (List) list;
    }
}
