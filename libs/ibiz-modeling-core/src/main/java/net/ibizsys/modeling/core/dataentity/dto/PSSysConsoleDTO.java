package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysConsoleDTO
extends PSModelDTOBase {
    public static final String FIELD_CONSOLETAG = "CONSOLETAG";
    protected static final String DTOFIELD_CONSOLETAG = "consoletag";
    public static final String FIELD_CONSOLETAG2 = "CONSOLETAG2";
    protected static final String DTOFIELD_CONSOLETAG2 = "consoletag2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FIXDATAKEY = "FIXDATAKEY";
    protected static final String DTOFIELD_FIXDATAKEY = "fixdatakey";
    public static final String FIELD_FIXDEACTION = "FIXDEACTION";
    protected static final String DTOFIELD_FIXDEACTION = "fixdeaction";
    public static final String FIELD_FIXDENAME = "FIXDENAME";
    protected static final String DTOFIELD_FIXDENAME = "fixdename";
    public static final String FIELD_FIXSTATE = "FIXSTATE";
    protected static final String DTOFIELD_FIXSTATE = "fixstate";
    public static final String FIELD_LINKINFO = "LINKINFO";
    protected static final String DTOFIELD_LINKINFO = "linkinfo";
    public static final String FIELD_LOGINFO = "LOGINFO";
    protected static final String DTOFIELD_LOGINFO = "loginfo";
    public static final String FIELD_LOGLEVEL = "LOGLEVEL";
    protected static final String DTOFIELD_LOGLEVEL = "loglevel";
    public static final String FIELD_LOGLEVEL2 = "LOGLEVEL2";
    protected static final String DTOFIELD_LOGLEVEL2 = "loglevel2";
    public static final String FIELD_LOGTIME = "LOGTIME";
    protected static final String DTOFIELD_LOGTIME = "logtime";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCONSOLEID = "PSSYSCONSOLEID";
    protected static final String DTOFIELD_PSSYSCONSOLEID = "pssysconsoleid";
    public static final String FIELD_PSSYSCONSOLENAME = "PSSYSCONSOLENAME";
    protected static final String DTOFIELD_PSSYSCONSOLENAME = "pssysconsolename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="consoletag")
    public void setConsoleTag(String consoleTag) {
        this._set(DTOFIELD_CONSOLETAG, consoleTag);
    }

    @JsonIgnore
    public String getConsoleTag() {
        Object objValue = this._get(DTOFIELD_CONSOLETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConsoleTagDirty() {
        return this._contains(DTOFIELD_CONSOLETAG);
    }

    @JsonIgnore
    public void resetConsoleTag() {
        this._reset(DTOFIELD_CONSOLETAG);
    }

    @JsonIgnore
    public PSSysConsoleDTO consoletag(String consoleTag) {
        this.setConsoleTag(consoleTag);
        return this;
    }

    @JsonProperty(value="consoletag2")
    public void setConsoleTag2(String consoleTag2) {
        this._set(DTOFIELD_CONSOLETAG2, consoleTag2);
    }

    @JsonIgnore
    public String getConsoleTag2() {
        Object objValue = this._get(DTOFIELD_CONSOLETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConsoleTag2Dirty() {
        return this._contains(DTOFIELD_CONSOLETAG2);
    }

    @JsonIgnore
    public void resetConsoleTag2() {
        this._reset(DTOFIELD_CONSOLETAG2);
    }

    @JsonIgnore
    public PSSysConsoleDTO consoletag2(String consoleTag2) {
        this.setConsoleTag2(consoleTag2);
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
    public PSSysConsoleDTO createdate(Timestamp createDate) {
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
    public PSSysConsoleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="fixdatakey")
    public void setFixDataKey(String fixDataKey) {
        this._set(DTOFIELD_FIXDATAKEY, fixDataKey);
    }

    @JsonIgnore
    public String getFixDataKey() {
        Object objValue = this._get(DTOFIELD_FIXDATAKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFixDataKeyDirty() {
        return this._contains(DTOFIELD_FIXDATAKEY);
    }

    @JsonIgnore
    public void resetFixDataKey() {
        this._reset(DTOFIELD_FIXDATAKEY);
    }

    @JsonIgnore
    public PSSysConsoleDTO fixdatakey(String fixDataKey) {
        this.setFixDataKey(fixDataKey);
        return this;
    }

    @JsonProperty(value="fixdeaction")
    public void setFixDEAction(String fixDEAction) {
        this._set(DTOFIELD_FIXDEACTION, fixDEAction);
    }

    @JsonIgnore
    public String getFixDEAction() {
        Object objValue = this._get(DTOFIELD_FIXDEACTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFixDEActionDirty() {
        return this._contains(DTOFIELD_FIXDEACTION);
    }

    @JsonIgnore
    public void resetFixDEAction() {
        this._reset(DTOFIELD_FIXDEACTION);
    }

    @JsonIgnore
    public PSSysConsoleDTO fixdeaction(String fixDEAction) {
        this.setFixDEAction(fixDEAction);
        return this;
    }

    @JsonProperty(value="fixdename")
    public void setFixDEName(String fixDEName) {
        this._set(DTOFIELD_FIXDENAME, fixDEName);
    }

    @JsonIgnore
    public String getFixDEName() {
        Object objValue = this._get(DTOFIELD_FIXDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFixDENameDirty() {
        return this._contains(DTOFIELD_FIXDENAME);
    }

    @JsonIgnore
    public void resetFixDEName() {
        this._reset(DTOFIELD_FIXDENAME);
    }

    @JsonIgnore
    public PSSysConsoleDTO fixdename(String fixDEName) {
        this.setFixDEName(fixDEName);
        return this;
    }

    @JsonProperty(value="fixstate")
    public void setFixState(Integer fixState) {
        this._set(DTOFIELD_FIXSTATE, fixState);
    }

    @JsonIgnore
    public Integer getFixState() {
        Object objValue = this._get(DTOFIELD_FIXSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFixStateDirty() {
        return this._contains(DTOFIELD_FIXSTATE);
    }

    @JsonIgnore
    public void resetFixState() {
        this._reset(DTOFIELD_FIXSTATE);
    }

    @JsonIgnore
    public PSSysConsoleDTO fixstate(Integer fixState) {
        this.setFixState(fixState);
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
    public PSSysConsoleDTO linkinfo(String linkInfo) {
        this.setLinkInfo(linkInfo);
        return this;
    }

    @JsonProperty(value="loginfo")
    public void setLogInfo(String logInfo) {
        this._set(DTOFIELD_LOGINFO, logInfo);
    }

    @JsonIgnore
    public String getLogInfo() {
        Object objValue = this._get(DTOFIELD_LOGINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogInfoDirty() {
        return this._contains(DTOFIELD_LOGINFO);
    }

    @JsonIgnore
    public void resetLogInfo() {
        this._reset(DTOFIELD_LOGINFO);
    }

    @JsonIgnore
    public PSSysConsoleDTO loginfo(String logInfo) {
        this.setLogInfo(logInfo);
        return this;
    }

    @JsonProperty(value="loglevel")
    public void setLogLevel(String logLevel) {
        this._set(DTOFIELD_LOGLEVEL, logLevel);
    }

    @JsonIgnore
    public String getLogLevel() {
        Object objValue = this._get(DTOFIELD_LOGLEVEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogLevelDirty() {
        return this._contains(DTOFIELD_LOGLEVEL);
    }

    @JsonIgnore
    public void resetLogLevel() {
        this._reset(DTOFIELD_LOGLEVEL);
    }

    @JsonIgnore
    public PSSysConsoleDTO loglevel(String logLevel) {
        this.setLogLevel(logLevel);
        return this;
    }

    @JsonProperty(value="loglevel2")
    public void setLogLevel2(Integer logLevel2) {
        this._set(DTOFIELD_LOGLEVEL2, logLevel2);
    }

    @JsonIgnore
    public Integer getLogLevel2() {
        Object objValue = this._get(DTOFIELD_LOGLEVEL2);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLogLevel2Dirty() {
        return this._contains(DTOFIELD_LOGLEVEL2);
    }

    @JsonIgnore
    public void resetLogLevel2() {
        this._reset(DTOFIELD_LOGLEVEL2);
    }

    @JsonIgnore
    public PSSysConsoleDTO loglevel2(Integer logLevel2) {
        this.setLogLevel2(logLevel2);
        return this;
    }

    @JsonProperty(value="logtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLogTime(Timestamp logTime) {
        this._set(DTOFIELD_LOGTIME, logTime);
    }

    @JsonIgnore
    public Timestamp getLogTime() {
        Object objValue = this._get(DTOFIELD_LOGTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLogTimeDirty() {
        return this._contains(DTOFIELD_LOGTIME);
    }

    @JsonIgnore
    public void resetLogTime() {
        this._reset(DTOFIELD_LOGTIME);
    }

    @JsonIgnore
    public PSSysConsoleDTO logtime(Timestamp logTime) {
        this.setLogTime(logTime);
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
    public PSSysConsoleDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysConsoleDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSysConsoleDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSSysConsoleDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysconsoleid")
    public void setPSSysConsoleId(String pSSysConsoleId) {
        this._set(DTOFIELD_PSSYSCONSOLEID, pSSysConsoleId);
    }

    @JsonIgnore
    public String getPSSysConsoleId() {
        Object objValue = this._get(DTOFIELD_PSSYSCONSOLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysConsoleIdDirty() {
        return this._contains(DTOFIELD_PSSYSCONSOLEID);
    }

    @JsonIgnore
    public void resetPSSysConsoleId() {
        this._reset(DTOFIELD_PSSYSCONSOLEID);
    }

    @JsonIgnore
    public PSSysConsoleDTO pssysconsoleid(String pSSysConsoleId) {
        this.setPSSysConsoleId(pSSysConsoleId);
        return this;
    }

    @JsonProperty(value="pssysconsolename")
    public void setPSSysConsoleName(String pSSysConsoleName) {
        this._set(DTOFIELD_PSSYSCONSOLENAME, pSSysConsoleName);
    }

    @JsonIgnore
    public String getPSSysConsoleName() {
        Object objValue = this._get(DTOFIELD_PSSYSCONSOLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysConsoleNameDirty() {
        return this._contains(DTOFIELD_PSSYSCONSOLENAME);
    }

    @JsonIgnore
    public void resetPSSysConsoleName() {
        this._reset(DTOFIELD_PSSYSCONSOLENAME);
    }

    @JsonIgnore
    public PSSysConsoleDTO pssysconsolename(String pSSysConsoleName) {
        this.setPSSysConsoleName(pSSysConsoleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysConsoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysConsoleName(strName);
    }

    @JsonIgnore
    public PSSysConsoleDTO name(String strName) {
        this.setPSSysConsoleName(strName);
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
    public PSSysConsoleDTO updatedate(Timestamp updateDate) {
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
    public PSSysConsoleDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysConsoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysConsoleId(strValue);
    }

    @JsonIgnore
    public PSSysConsoleDTO id(String strValue) {
        this.setPSSysConsoleId(strValue);
        return this;
    }
}
