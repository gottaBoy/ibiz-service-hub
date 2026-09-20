package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlMsgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGroupDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCalendarDTO
extends PSModelDTOBase {
    public static final String FIELD_BATPSDETOOLBARID = "BATPSDETOOLBARID";
    protected static final String DTOFIELD_BATPSDETOOLBARID = "batpsdetoolbarid";
    public static final String FIELD_BATPSDETOOLBARNAME = "BATPSDETOOLBARNAME";
    protected static final String DTOFIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CALENDARSTYLE = "CALENDARSTYLE";
    protected static final String DTOFIELD_CALENDARSTYLE = "calendarstyle";
    public static final String FIELD_CALENDARTAG = "CALENDARTAG";
    protected static final String DTOFIELD_CALENDARTAG = "calendartag";
    public static final String FIELD_CALENDARTAG2 = "CALENDARTAG2";
    protected static final String DTOFIELD_CALENDARTAG2 = "calendartag2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_ENABLEEDIT = "ENABLEEDIT";
    protected static final String DTOFIELD_ENABLEEDIT = "enableedit";
    public static final String FIELD_GANTTFLAG = "GANTTFLAG";
    protected static final String DTOFIELD_GANTTFLAG = "ganttflag";
    public static final String FIELD_GANTTPSSYSPFPLUGINID = "GANTTPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GANTTPSSYSPFPLUGINID = "ganttpssyspfpluginid";
    public static final String FIELD_GANTTPSSYSPFPLUGINNAME = "GANTTPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GANTTPSSYSPFPLUGINNAME = "ganttpssyspfpluginname";
    public static final String FIELD_GANTTSTYLE = "GANTTSTYLE";
    protected static final String DTOFIELD_GANTTSTYLE = "ganttstyle";
    public static final String FIELD_GROUPHEIGHT = "GROUPHEIGHT";
    protected static final String DTOFIELD_GROUPHEIGHT = "groupheight";
    public static final String FIELD_GROUPLAYOUT = "GROUPLAYOUT";
    protected static final String DTOFIELD_GROUPLAYOUT = "grouplayout";
    public static final String FIELD_GROUPMODE = "GROUPMODE";
    protected static final String DTOFIELD_GROUPMODE = "groupmode";
    public static final String FIELD_GROUPPSCODELISTID = "GROUPPSCODELISTID";
    protected static final String DTOFIELD_GROUPPSCODELISTID = "grouppscodelistid";
    public static final String FIELD_GROUPPSCODELISTNAME = "GROUPPSCODELISTNAME";
    protected static final String DTOFIELD_GROUPPSCODELISTNAME = "grouppscodelistname";
    public static final String FIELD_GROUPPSDEFID = "GROUPPSDEFID";
    protected static final String DTOFIELD_GROUPPSDEFID = "grouppsdefid";
    public static final String FIELD_GROUPPSDEFNAME = "GROUPPSDEFNAME";
    protected static final String DTOFIELD_GROUPPSDEFNAME = "grouppsdefname";
    public static final String FIELD_GROUPPSSYSCSSID = "GROUPPSSYSCSSID";
    protected static final String DTOFIELD_GROUPPSSYSCSSID = "grouppssyscssid";
    public static final String FIELD_GROUPPSSYSCSSNAME = "GROUPPSSYSCSSNAME";
    protected static final String DTOFIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";
    public static final String FIELD_GROUPPSSYSPFPLUGINID = "GROUPPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";
    public static final String FIELD_GROUPPSSYSPFPLUGINNAME = "GROUPPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";
    public static final String FIELD_GROUPSTYLE = "GROUPSTYLE";
    protected static final String DTOFIELD_GROUPSTYLE = "groupstyle";
    public static final String FIELD_GROUPWIDTH = "GROUPWIDTH";
    protected static final String DTOFIELD_GROUPWIDTH = "groupwidth";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NAVVIEWHEIGHT = "NAVVIEWHEIGHT";
    protected static final String DTOFIELD_NAVVIEWHEIGHT = "navviewheight";
    public static final String FIELD_NAVVIEWMAXHEIGHT = "NAVVIEWMAXHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMAXHEIGHT = "navviewmaxheight";
    public static final String FIELD_NAVVIEWMAXWIDTH = "NAVVIEWMAXWIDTH";
    protected static final String DTOFIELD_NAVVIEWMAXWIDTH = "navviewmaxwidth";
    public static final String FIELD_NAVVIEWMINHEIGHT = "NAVVIEWMINHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMINHEIGHT = "navviewminheight";
    public static final String FIELD_NAVVIEWMINWIDTH = "NAVVIEWMINWIDTH";
    protected static final String DTOFIELD_NAVVIEWMINWIDTH = "navviewminwidth";
    public static final String FIELD_NAVVIEWPOS = "NAVVIEWPOS";
    protected static final String DTOFIELD_NAVVIEWPOS = "navviewpos";
    public static final String FIELD_NAVVIEWSHOWMODE = "NAVVIEWSHOWMODE";
    protected static final String DTOFIELD_NAVVIEWSHOWMODE = "navviewshowmode";
    public static final String FIELD_NAVVIEWWIDTH = "NAVVIEWWIDTH";
    protected static final String DTOFIELD_NAVVIEWWIDTH = "navviewwidth";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSCTRLMSGID = "PSCTRLMSGID";
    protected static final String DTOFIELD_PSCTRLMSGID = "psctrlmsgid";
    public static final String FIELD_PSCTRLMSGNAME = "PSCTRLMSGNAME";
    protected static final String DTOFIELD_PSCTRLMSGNAME = "psctrlmsgname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARNAME = "PSSYSCALENDARNAME";
    protected static final String DTOFIELD_PSSYSCALENDARNAME = "pssyscalendarname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_QUICKPSDETOOLBARID = "QUICKPSDETOOLBARID";
    protected static final String DTOFIELD_QUICKPSDETOOLBARID = "quickpsdetoolbarid";
    public static final String FIELD_QUICKPSDETOOLBARNAME = "QUICKPSDETOOLBARNAME";
    protected static final String DTOFIELD_QUICKPSDETOOLBARNAME = "quickpsdetoolbarname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSSYSCALENDARITEMS = "pssyscalendaritems";
    public static final String DTOFIELD_PSSYSCALENDARLOGICS = "pssyscalendarlogics";

    @JsonProperty(value="batpsdetoolbarid")
    public void setBatPSDEToolbarId(String batPSDEToolbarId) {
        this._set(DTOFIELD_BATPSDETOOLBARID, batPSDEToolbarId);
    }

    @JsonIgnore
    public String getBatPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_BATPSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBatPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_BATPSDETOOLBARID);
    }

    @JsonIgnore
    public void resetBatPSDEToolbarId() {
        this._reset(DTOFIELD_BATPSDETOOLBARID);
    }

    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarid(String batPSDEToolbarId) {
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setBatPSDEToolbarId(null);
            this.setBatPSDEToolbarName(null);
        } else {
            this.setBatPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setBatPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="batpsdetoolbarname")
    public void setBatPSDEToolbarName(String batPSDEToolbarName) {
        this._set(DTOFIELD_BATPSDETOOLBARNAME, batPSDEToolbarName);
    }

    @JsonIgnore
    public String getBatPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_BATPSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBatPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_BATPSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetBatPSDEToolbarName() {
        this._reset(DTOFIELD_BATPSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO batpsdetoolbarname(String batPSDEToolbarName) {
        this.setBatPSDEToolbarName(batPSDEToolbarName);
        return this;
    }

    @JsonProperty(value="busyindicator")
    public void setBusyIndicator(Integer busyIndicator) {
        this._set(DTOFIELD_BUSYINDICATOR, busyIndicator);
    }

    @JsonIgnore
    public Integer getBusyIndicator() {
        Object objValue = this._get(DTOFIELD_BUSYINDICATOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBusyIndicatorDirty() {
        return this._contains(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public void resetBusyIndicator() {
        this._reset(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public PSSysCalendarDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="calendarstyle")
    public void setCalendarStyle(String calendarStyle) {
        this._set(DTOFIELD_CALENDARSTYLE, calendarStyle);
    }

    @JsonIgnore
    public String getCalendarStyle() {
        Object objValue = this._get(DTOFIELD_CALENDARSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCalendarStyleDirty() {
        return this._contains(DTOFIELD_CALENDARSTYLE);
    }

    @JsonIgnore
    public void resetCalendarStyle() {
        this._reset(DTOFIELD_CALENDARSTYLE);
    }

    @JsonIgnore
    public PSSysCalendarDTO calendarstyle(String calendarStyle) {
        this.setCalendarStyle(calendarStyle);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO calendarstyle(PSModelEnums.CalendarStyle calendarStyle) {
        if (calendarStyle == null) {
            this.setCalendarStyle(null);
        } else {
            this.setCalendarStyle(calendarStyle.value);
        }
        return this;
    }

    @JsonProperty(value="calendartag")
    public void setCalendarTag(String calendarTag) {
        this._set(DTOFIELD_CALENDARTAG, calendarTag);
    }

    @JsonIgnore
    public String getCalendarTag() {
        Object objValue = this._get(DTOFIELD_CALENDARTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCalendarTagDirty() {
        return this._contains(DTOFIELD_CALENDARTAG);
    }

    @JsonIgnore
    public void resetCalendarTag() {
        this._reset(DTOFIELD_CALENDARTAG);
    }

    @JsonIgnore
    public PSSysCalendarDTO calendartag(String calendarTag) {
        this.setCalendarTag(calendarTag);
        return this;
    }

    @JsonProperty(value="calendartag2")
    public void setCalendarTag2(String calendarTag2) {
        this._set(DTOFIELD_CALENDARTAG2, calendarTag2);
    }

    @JsonIgnore
    public String getCalendarTag2() {
        Object objValue = this._get(DTOFIELD_CALENDARTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCalendarTag2Dirty() {
        return this._contains(DTOFIELD_CALENDARTAG2);
    }

    @JsonIgnore
    public void resetCalendarTag2() {
        this._reset(DTOFIELD_CALENDARTAG2);
    }

    @JsonIgnore
    public PSSysCalendarDTO calendartag2(String calendarTag2) {
        this.setCalendarTag2(calendarTag2);
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
    public PSSysCalendarDTO codename(String codeName) {
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
    public PSSysCalendarDTO createdate(Timestamp createDate) {
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
    public PSSysCalendarDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSSysCalendarDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="enableedit")
    public void setEnableEdit(Integer enableEdit) {
        this._set(DTOFIELD_ENABLEEDIT, enableEdit);
    }

    @JsonIgnore
    public Integer getEnableEdit() {
        Object objValue = this._get(DTOFIELD_ENABLEEDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableEditDirty() {
        return this._contains(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public void resetEnableEdit() {
        this._reset(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public PSSysCalendarDTO enableedit(Integer enableEdit) {
        this.setEnableEdit(enableEdit);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO enableedit(Boolean enableEdit) {
        if (enableEdit == null) {
            this.setEnableEdit(null);
        } else {
            this.setEnableEdit(enableEdit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ganttflag")
    public void setGanttFlag(Integer ganttFlag) {
        this._set(DTOFIELD_GANTTFLAG, ganttFlag);
    }

    @JsonIgnore
    public Integer getGanttFlag() {
        Object objValue = this._get(DTOFIELD_GANTTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGanttFlagDirty() {
        return this._contains(DTOFIELD_GANTTFLAG);
    }

    @JsonIgnore
    public void resetGanttFlag() {
        this._reset(DTOFIELD_GANTTFLAG);
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttflag(Integer ganttFlag) {
        this.setGanttFlag(ganttFlag);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttflag(Boolean ganttFlag) {
        if (ganttFlag == null) {
            this.setGanttFlag(null);
        } else {
            this.setGanttFlag(ganttFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ganttpssyspfpluginid")
    public void setGanttPSSysPFPluginId(String ganttPSSysPFPluginId) {
        this._set(DTOFIELD_GANTTPSSYSPFPLUGINID, ganttPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGanttPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GANTTPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGanttPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GANTTPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGanttPSSysPFPluginId() {
        this._reset(DTOFIELD_GANTTPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginid(String ganttPSSysPFPluginId) {
        this.setGanttPSSysPFPluginId(ganttPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGanttPSSysPFPluginId(null);
            this.setGanttPSSysPFPluginName(null);
        } else {
            this.setGanttPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGanttPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="ganttpssyspfpluginname")
    public void setGanttPSSysPFPluginName(String ganttPSSysPFPluginName) {
        this._set(DTOFIELD_GANTTPSSYSPFPLUGINNAME, ganttPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGanttPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGanttPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGanttPSSysPFPluginName() {
        this._reset(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttpssyspfpluginname(String ganttPSSysPFPluginName) {
        this.setGanttPSSysPFPluginName(ganttPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="ganttstyle")
    public void setGanttStyle(String ganttStyle) {
        this._set(DTOFIELD_GANTTSTYLE, ganttStyle);
    }

    @JsonIgnore
    public String getGanttStyle() {
        Object objValue = this._get(DTOFIELD_GANTTSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGanttStyleDirty() {
        return this._contains(DTOFIELD_GANTTSTYLE);
    }

    @JsonIgnore
    public void resetGanttStyle() {
        this._reset(DTOFIELD_GANTTSTYLE);
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttstyle(String ganttStyle) {
        this.setGanttStyle(ganttStyle);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO ganttstyle(PSModelEnums.GanttStyle ganttStyle) {
        if (ganttStyle == null) {
            this.setGanttStyle(null);
        } else {
            this.setGanttStyle(ganttStyle.value);
        }
        return this;
    }

    @JsonProperty(value="groupheight")
    public void setGroupHeight(Integer groupHeight) {
        this._set(DTOFIELD_GROUPHEIGHT, groupHeight);
    }

    @JsonIgnore
    public Integer getGroupHeight() {
        Object objValue = this._get(DTOFIELD_GROUPHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupHeightDirty() {
        return this._contains(DTOFIELD_GROUPHEIGHT);
    }

    @JsonIgnore
    public void resetGroupHeight() {
        this._reset(DTOFIELD_GROUPHEIGHT);
    }

    @JsonIgnore
    public PSSysCalendarDTO groupheight(Integer groupHeight) {
        this.setGroupHeight(groupHeight);
        return this;
    }

    @JsonProperty(value="grouplayout")
    public void setGroupLayout(String groupLayout) {
        this._set(DTOFIELD_GROUPLAYOUT, groupLayout);
    }

    @JsonIgnore
    public String getGroupLayout() {
        Object objValue = this._get(DTOFIELD_GROUPLAYOUT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupLayoutDirty() {
        return this._contains(DTOFIELD_GROUPLAYOUT);
    }

    @JsonIgnore
    public void resetGroupLayout() {
        this._reset(DTOFIELD_GROUPLAYOUT);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouplayout(String groupLayout) {
        this.setGroupLayout(groupLayout);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO grouplayout(PSModelEnums.MDCtrlGroupLayout groupLayout) {
        if (groupLayout == null) {
            this.setGroupLayout(null);
        } else {
            this.setGroupLayout(groupLayout.value);
        }
        return this;
    }

    @JsonProperty(value="groupmode")
    public void setGroupMode(String groupMode) {
        this._set(DTOFIELD_GROUPMODE, groupMode);
    }

    @JsonIgnore
    public String getGroupMode() {
        Object objValue = this._get(DTOFIELD_GROUPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupModeDirty() {
        return this._contains(DTOFIELD_GROUPMODE);
    }

    @JsonIgnore
    public void resetGroupMode() {
        this._reset(DTOFIELD_GROUPMODE);
    }

    @JsonIgnore
    public PSSysCalendarDTO groupmode(String groupMode) {
        this.setGroupMode(groupMode);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO groupmode(PSModelEnums.MDCtrlGroupMode groupMode) {
        if (groupMode == null) {
            this.setGroupMode(null);
        } else {
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    @JsonProperty(value="grouppscodelistid")
    public void setGroupPSCodeListId(String groupPSCodeListId) {
        this._set(DTOFIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }

    @JsonIgnore
    public String getGroupPSCodeListId() {
        Object objValue = this._get(DTOFIELD_GROUPPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty() {
        return this._contains(DTOFIELD_GROUPPSCODELISTID);
    }

    @JsonIgnore
    public void resetGroupPSCodeListId() {
        this._reset(DTOFIELD_GROUPPSCODELISTID);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistid(String groupPSCodeListId) {
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        } else {
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="grouppscodelistname")
    public void setGroupPSCodeListName(String groupPSCodeListName) {
        this._set(DTOFIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }

    @JsonIgnore
    public String getGroupPSCodeListName() {
        Object objValue = this._get(DTOFIELD_GROUPPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty() {
        return this._contains(DTOFIELD_GROUPPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetGroupPSCodeListName() {
        this._reset(DTOFIELD_GROUPPSCODELISTNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppscodelistname(String groupPSCodeListName) {
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    @JsonProperty(value="grouppsdefid")
    public void setGroupPSDEFId(String groupPSDEFId) {
        this._set(DTOFIELD_GROUPPSDEFID, groupPSDEFId);
    }

    @JsonIgnore
    public String getGroupPSDEFId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public void resetGroupPSDEFId() {
        this._reset(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        } else {
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdefname")
    public void setGroupPSDEFName(String groupPSDEFName) {
        this._set(DTOFIELD_GROUPPSDEFNAME, groupPSDEFName);
    }

    @JsonIgnore
    public String getGroupPSDEFName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFNameDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public void resetGroupPSDEFName() {
        this._reset(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppsdefname(String groupPSDEFName) {
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    @JsonProperty(value="grouppssyscssid")
    public void setGroupPSSysCssId(String groupPSSysCssId) {
        this._set(DTOFIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }

    @JsonIgnore
    public String getGroupPSSysCssId() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysCssIdDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSCSSID);
    }

    @JsonIgnore
    public void resetGroupPSSysCssId() {
        this._reset(DTOFIELD_GROUPPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssid(String groupPSSysCssId) {
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setGroupPSSysCssId(null);
            this.setGroupPSSysCssName(null);
        } else {
            this.setGroupPSSysCssId(pSSysCss.getPSSysCssId());
            this.setGroupPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="grouppssyscssname")
    public void setGroupPSSysCssName(String groupPSSysCssName) {
        this._set(DTOFIELD_GROUPPSSYSCSSNAME, groupPSSysCssName);
    }

    @JsonIgnore
    public String getGroupPSSysCssName() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysCssNameDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetGroupPSSysCssName() {
        this._reset(DTOFIELD_GROUPPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyscssname(String groupPSSysCssName) {
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    @JsonProperty(value="grouppssyspfpluginid")
    public void setGroupPSSysPFPluginId(String groupPSSysPFPluginId) {
        this._set(DTOFIELD_GROUPPSSYSPFPLUGINID, groupPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGroupPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGroupPSSysPFPluginId() {
        this._reset(DTOFIELD_GROUPPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginid(String groupPSSysPFPluginId) {
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGroupPSSysPFPluginId(null);
            this.setGroupPSSysPFPluginName(null);
        } else {
            this.setGroupPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGroupPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="grouppssyspfpluginname")
    public void setGroupPSSysPFPluginName(String groupPSSysPFPluginName) {
        this._set(DTOFIELD_GROUPPSSYSPFPLUGINNAME, groupPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGroupPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGroupPSSysPFPluginName() {
        this._reset(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO grouppssyspfpluginname(String groupPSSysPFPluginName) {
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="groupstyle")
    public void setGroupStyle(String groupStyle) {
        this._set(DTOFIELD_GROUPSTYLE, groupStyle);
    }

    @JsonIgnore
    public String getGroupStyle() {
        Object objValue = this._get(DTOFIELD_GROUPSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupStyleDirty() {
        return this._contains(DTOFIELD_GROUPSTYLE);
    }

    @JsonIgnore
    public void resetGroupStyle() {
        this._reset(DTOFIELD_GROUPSTYLE);
    }

    @JsonIgnore
    public PSSysCalendarDTO groupstyle(String groupStyle) {
        this.setGroupStyle(groupStyle);
        return this;
    }

    @JsonProperty(value="groupwidth")
    public void setGroupWidth(Integer groupWidth) {
        this._set(DTOFIELD_GROUPWIDTH, groupWidth);
    }

    @JsonIgnore
    public Integer getGroupWidth() {
        Object objValue = this._get(DTOFIELD_GROUPWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupWidthDirty() {
        return this._contains(DTOFIELD_GROUPWIDTH);
    }

    @JsonIgnore
    public void resetGroupWidth() {
        this._reset(DTOFIELD_GROUPWIDTH);
    }

    @JsonIgnore
    public PSSysCalendarDTO groupwidth(Integer groupWidth) {
        this.setGroupWidth(groupWidth);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSSysCalendarDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="navviewheight")
    public void setNavViewHeight(Double navViewHeight) {
        this._set(DTOFIELD_NAVVIEWHEIGHT, navViewHeight);
    }

    @JsonIgnore
    public Double getNavViewHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewHeight() {
        this._reset(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewheight(Double navViewHeight) {
        this.setNavViewHeight(navViewHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxheight")
    public void setNavViewMaxHeight(Double navViewMaxHeight) {
        this._set(DTOFIELD_NAVVIEWMAXHEIGHT, navViewMaxHeight);
    }

    @JsonIgnore
    public Double getNavViewMaxHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMaxHeight() {
        this._reset(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewmaxheight(Double navViewMaxHeight) {
        this.setNavViewMaxHeight(navViewMaxHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxwidth")
    public void setNavViewMaxWidth(Double navViewMaxWidth) {
        this._set(DTOFIELD_NAVVIEWMAXWIDTH, navViewMaxWidth);
    }

    @JsonIgnore
    public Double getNavViewMaxWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMaxWidth() {
        this._reset(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewmaxwidth(Double navViewMaxWidth) {
        this.setNavViewMaxWidth(navViewMaxWidth);
        return this;
    }

    @JsonProperty(value="navviewminheight")
    public void setNavViewMinHeight(Double navViewMinHeight) {
        this._set(DTOFIELD_NAVVIEWMINHEIGHT, navViewMinHeight);
    }

    @JsonIgnore
    public Double getNavViewMinHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMinHeight() {
        this._reset(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewminheight(Double navViewMinHeight) {
        this.setNavViewMinHeight(navViewMinHeight);
        return this;
    }

    @JsonProperty(value="navviewminwidth")
    public void setNavViewMinWidth(Double navViewMinWidth) {
        this._set(DTOFIELD_NAVVIEWMINWIDTH, navViewMinWidth);
    }

    @JsonIgnore
    public Double getNavViewMinWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMinWidth() {
        this._reset(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewminwidth(Double navViewMinWidth) {
        this.setNavViewMinWidth(navViewMinWidth);
        return this;
    }

    @JsonProperty(value="navviewpos")
    public void setNavViewPos(String navViewPos) {
        this._set(DTOFIELD_NAVVIEWPOS, navViewPos);
    }

    @JsonIgnore
    public String getNavViewPos() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewPosDirty() {
        return this._contains(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public void resetNavViewPos() {
        this._reset(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewpos(String navViewPos) {
        this.setNavViewPos(navViewPos);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewpos(PSModelEnums.NavViewPos navViewPos) {
        if (navViewPos == null) {
            this.setNavViewPos(null);
        } else {
            this.setNavViewPos(navViewPos.value);
        }
        return this;
    }

    @JsonProperty(value="navviewshowmode")
    public void setNavViewShowMode(Integer navViewShowMode) {
        this._set(DTOFIELD_NAVVIEWSHOWMODE, navViewShowMode);
    }

    @JsonIgnore
    public Integer getNavViewShowMode() {
        Object objValue = this._get(DTOFIELD_NAVVIEWSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavViewShowModeDirty() {
        return this._contains(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public void resetNavViewShowMode() {
        this._reset(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewshowmode(Integer navViewShowMode) {
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewshowmode(PSModelEnums.NavViewShowMode navViewShowMode) {
        if (navViewShowMode == null) {
            this.setNavViewShowMode(null);
        } else {
            this.setNavViewShowMode(navViewShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="navviewwidth")
    public void setNavViewWidth(Double navViewWidth) {
        this._set(DTOFIELD_NAVVIEWWIDTH, navViewWidth);
    }

    @JsonIgnore
    public Double getNavViewWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public void resetNavViewWidth() {
        this._reset(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public PSSysCalendarDTO navviewwidth(Double navViewWidth) {
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    @JsonProperty(value="psctrllogicgroupid")
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupId() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupId() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
        if (pSCtrlLogicGroup == null) {
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        } else {
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    @JsonProperty(value="psctrllogicgroupname")
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupName() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupName() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    @JsonProperty(value="psctrlmsgid")
    public void setPSCtrlMsgId(String pSCtrlMsgId) {
        this._set(DTOFIELD_PSCTRLMSGID, pSCtrlMsgId);
    }

    @JsonIgnore
    public String getPSCtrlMsgId() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public void resetPSCtrlMsgId() {
        this._reset(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
        if (pSCtrlMsg == null) {
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        } else {
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    @JsonProperty(value="psctrlmsgname")
    public void setPSCtrlMsgName(String pSCtrlMsgName) {
        this._set(DTOFIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }

    @JsonIgnore
    public String getPSCtrlMsgName() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public void resetPSCtrlMsgName() {
        this._reset(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSSysCalendarDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysCalendarDTO psdename(String pSDEName) {
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
    public PSSysCalendarDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysCalendarDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysCalendarDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssyscalendarid")
    public void setPSSysCalendarId(String pSSysCalendarId) {
        this._set(DTOFIELD_PSSYSCALENDARID, pSSysCalendarId);
    }

    @JsonIgnore
    public String getPSSysCalendarId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public void resetPSSysCalendarId() {
        this._reset(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonProperty(value="pssyscalendarname")
    public void setPSSysCalendarName(String pSSysCalendarName) {
        this._set(DTOFIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }

    @JsonIgnore
    public String getPSSysCalendarName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarName() {
        this._reset(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyscalendarname(String pSSysCalendarName) {
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCalendarName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCalendarName(strName);
    }

    @JsonIgnore
    public PSSysCalendarDTO name(String strName) {
        this.setPSSysCalendarName(strName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSSysCalendarDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="quickpsdetoolbarid")
    public void setQuickPSDEToolbarId(String quickPSDEToolbarId) {
        this._set(DTOFIELD_QUICKPSDETOOLBARID, quickPSDEToolbarId);
    }

    @JsonIgnore
    public String getQuickPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_QUICKPSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_QUICKPSDETOOLBARID);
    }

    @JsonIgnore
    public void resetQuickPSDEToolbarId() {
        this._reset(DTOFIELD_QUICKPSDETOOLBARID);
    }

    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarid(String quickPSDEToolbarId) {
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setQuickPSDEToolbarId(null);
            this.setQuickPSDEToolbarName(null);
        } else {
            this.setQuickPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setQuickPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="quickpsdetoolbarname")
    public void setQuickPSDEToolbarName(String quickPSDEToolbarName) {
        this._set(DTOFIELD_QUICKPSDETOOLBARNAME, quickPSDEToolbarName);
    }

    @JsonIgnore
    public String getQuickPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_QUICKPSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_QUICKPSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetQuickPSDEToolbarName() {
        this._reset(DTOFIELD_QUICKPSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSSysCalendarDTO quickpsdetoolbarname(String quickPSDEToolbarName) {
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
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
    public PSSysCalendarDTO updatedate(Timestamp updateDate) {
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
    public PSSysCalendarDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCalendarId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCalendarId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarDTO id(String strValue) {
        this.setPSSysCalendarId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysCalendarItemDTO> getPSSysCalendarItems() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyscalendaritems")
    public void setPSSysCalendarItems(List<PSSysCalendarItemDTO> pssyscalendaritems) {
        this._set(DTOFIELD_PSSYSCALENDARITEMS, pssyscalendaritems);
    }

    @JsonIgnore
    public List<PSSysCalendarItemDTO> getPSSysCalendarItemsIf() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSCALENDARITEMS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysCalendarLogicDTO> getPSSysCalendarLogics() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyscalendarlogics")
    public void setPSSysCalendarLogics(List<PSSysCalendarLogicDTO> pssyscalendarlogics) {
        this._set(DTOFIELD_PSSYSCALENDARLOGICS, pssyscalendarlogics);
    }

    @JsonIgnore
    public List<PSSysCalendarLogicDTO> getPSSysCalendarLogicsIf() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSCALENDARLOGICS, list);
        }
        return (List)list;
    }
}
