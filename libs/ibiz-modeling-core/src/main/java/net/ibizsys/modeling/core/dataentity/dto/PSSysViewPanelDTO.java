package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPanelEngineDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGroupDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysViewPanelDTO
extends PSModelDTOBase {
    public static final String FIELD_BODYONLYFLAG = "BODYONLYFLAG";
    protected static final String DTOFIELD_BODYONLYFLAG = "bodyonlyflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATANAME = "DATANAME";
    protected static final String DTOFIELD_DATANAME = "dataname";
    public static final String FIELD_ENABLEPAGEFOOTER = "ENABLEPAGEFOOTER";
    protected static final String DTOFIELD_ENABLEPAGEFOOTER = "enablepagefooter";
    public static final String FIELD_ENABLEPAGEHEADER = "ENABLEPAGEHEADER";
    protected static final String DTOFIELD_ENABLEPAGEHEADER = "enablepageheader";
    public static final String FIELD_GETDATAMODE = "GETDATAMODE";
    protected static final String DTOFIELD_GETDATAMODE = "getdatamode";
    public static final String FIELD_GETDATATIMER = "GETDATATIMER";
    protected static final String DTOFIELD_GETDATATIMER = "getdatatimer";
    public static final String FIELD_GETPSDEACTIONID = "GETPSDEACTIONID";
    protected static final String DTOFIELD_GETPSDEACTIONID = "getpsdeactionid";
    public static final String FIELD_GETPSDEACTIONNAME = "GETPSDEACTIONNAME";
    protected static final String DTOFIELD_GETPSDEACTIONNAME = "getpsdeactionname";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_NAVBARHEIGHT = "NAVBARHEIGHT";
    protected static final String DTOFIELD_NAVBARHEIGHT = "navbarheight";
    public static final String FIELD_NAVBARPOS = "NAVBARPOS";
    protected static final String DTOFIELD_NAVBARPOS = "navbarpos";
    public static final String FIELD_NAVBARPSSYSCSSID = "NAVBARPSSYSCSSID";
    protected static final String DTOFIELD_NAVBARPSSYSCSSID = "navbarpssyscssid";
    public static final String FIELD_NAVBARPSSYSCSSNAME = "NAVBARPSSYSCSSNAME";
    protected static final String DTOFIELD_NAVBARPSSYSCSSNAME = "navbarpssyscssname";
    public static final String FIELD_NAVBARSTYLE = "NAVBARSTYLE";
    protected static final String DTOFIELD_NAVBARSTYLE = "navbarstyle";
    public static final String FIELD_NAVBARWIDTH = "NAVBARWIDTH";
    protected static final String DTOFIELD_NAVBARWIDTH = "navbarwidth";
    public static final String FIELD_PAGEFORMAT = "PAGEFORMAT";
    protected static final String DTOFIELD_PAGEFORMAT = "pageformat";
    public static final String FIELD_PAGEHEIGHT = "PAGEHEIGHT";
    protected static final String DTOFIELD_PAGEHEIGHT = "pageheight";
    public static final String FIELD_PAGEMARGINBOTTOM = "PAGEMARGINBOTTOM";
    protected static final String DTOFIELD_PAGEMARGINBOTTOM = "pagemarginbottom";
    public static final String FIELD_PAGEMARGINLEFT = "PAGEMARGINLEFT";
    protected static final String DTOFIELD_PAGEMARGINLEFT = "pagemarginleft";
    public static final String FIELD_PAGEMARGINRIGHT = "PAGEMARGINRIGHT";
    protected static final String DTOFIELD_PAGEMARGINRIGHT = "pagemarginright";
    public static final String FIELD_PAGEMARGINTOP = "PAGEMARGINTOP";
    protected static final String DTOFIELD_PAGEMARGINTOP = "pagemargintop";
    public static final String FIELD_PAGEWIDTH = "PAGEWIDTH";
    protected static final String DTOFIELD_PAGEWIDTH = "pagewidth";
    public static final String FIELD_PANELHEIGHT = "PANELHEIGHT";
    protected static final String DTOFIELD_PANELHEIGHT = "panelheight";
    public static final String FIELD_PANELNAVBAR = "PANELNAVBAR";
    protected static final String DTOFIELD_PANELNAVBAR = "panelnavbar";
    public static final String FIELD_PANELSTYLE = "PANELSTYLE";
    protected static final String DTOFIELD_PANELSTYLE = "panelstyle";
    public static final String FIELD_PANELWIDTH = "PANELWIDTH";
    protected static final String DTOFIELD_PANELWIDTH = "panelwidth";
    public static final String FIELD_PPI = "PPI";
    protected static final String DTOFIELD_PPI = "ppi";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
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
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_PUBLICFLAG = "PUBLICFLAG";
    protected static final String DTOFIELD_PUBLICFLAG = "publicflag";
    public static final String FIELD_SHOWFOOTERFIRSTPAGE = "SHOWFOOTERFIRSTPAGE";
    protected static final String DTOFIELD_SHOWFOOTERFIRSTPAGE = "showfooterfirstpage";
    public static final String FIELD_SHOWHEADERFIRSTPAGE = "SHOWHEADERFIRSTPAGE";
    protected static final String DTOFIELD_SHOWHEADERFIRSTPAGE = "showheaderfirstpage";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VIEWLAYOUTFLAG = "VIEWLAYOUTFLAG";
    protected static final String DTOFIELD_VIEWLAYOUTFLAG = "viewlayoutflag";
    public static final String DTOFIELD_PSSYSVIEWPANELLOGICS = "pssysviewpanellogics";
    public static final String DTOFIELD_PSSYSVIEWPANELMODELS = "pssysviewpanelmodels";
    public static final String DTOFIELD_PSPANELENGINES = "pspanelengines";
    public static final String DTOFIELD_PSSYSVIEWPANELITEMS = "pssysviewpanelitems";

    @JsonProperty(value="bodyonlyflag")
    public void setBodyOnlyFlag(Integer bodyOnlyFlag) {
        this._set(DTOFIELD_BODYONLYFLAG, bodyOnlyFlag);
    }

    @JsonIgnore
    public Integer getBodyOnlyFlag() {
        Object objValue = this._get(DTOFIELD_BODYONLYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBodyOnlyFlagDirty() {
        return this._contains(DTOFIELD_BODYONLYFLAG);
    }

    @JsonIgnore
    public void resetBodyOnlyFlag() {
        this._reset(DTOFIELD_BODYONLYFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelDTO bodyonlyflag(Integer bodyOnlyFlag) {
        this.setBodyOnlyFlag(bodyOnlyFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO bodyonlyflag(Boolean bodyOnlyFlag) {
        if (bodyOnlyFlag == null) {
            this.setBodyOnlyFlag(null);
        } else {
            this.setBodyOnlyFlag(bodyOnlyFlag != false ? 1 : 0);
        }
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
    public PSSysViewPanelDTO codename(String codeName) {
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
    public PSSysViewPanelDTO createdate(Timestamp createDate) {
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
    public PSSysViewPanelDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dataname")
    public void setDataName(String dataName) {
        this._set(DTOFIELD_DATANAME, dataName);
    }

    @JsonIgnore
    public String getDataName() {
        Object objValue = this._get(DTOFIELD_DATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataNameDirty() {
        return this._contains(DTOFIELD_DATANAME);
    }

    @JsonIgnore
    public void resetDataName() {
        this._reset(DTOFIELD_DATANAME);
    }

    @JsonIgnore
    public PSSysViewPanelDTO dataname(String dataName) {
        this.setDataName(dataName);
        return this;
    }

    @JsonProperty(value="enablepagefooter")
    public void setEnablePageFooter(Integer enablePageFooter) {
        this._set(DTOFIELD_ENABLEPAGEFOOTER, enablePageFooter);
    }

    @JsonIgnore
    public Integer getEnablePageFooter() {
        Object objValue = this._get(DTOFIELD_ENABLEPAGEFOOTER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePageFooterDirty() {
        return this._contains(DTOFIELD_ENABLEPAGEFOOTER);
    }

    @JsonIgnore
    public void resetEnablePageFooter() {
        this._reset(DTOFIELD_ENABLEPAGEFOOTER);
    }

    @JsonIgnore
    public PSSysViewPanelDTO enablepagefooter(Integer enablePageFooter) {
        this.setEnablePageFooter(enablePageFooter);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO enablepagefooter(Boolean enablePageFooter) {
        if (enablePageFooter == null) {
            this.setEnablePageFooter(null);
        } else {
            this.setEnablePageFooter(enablePageFooter != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablepageheader")
    public void setEnablePageHeader(Integer enablePageHeader) {
        this._set(DTOFIELD_ENABLEPAGEHEADER, enablePageHeader);
    }

    @JsonIgnore
    public Integer getEnablePageHeader() {
        Object objValue = this._get(DTOFIELD_ENABLEPAGEHEADER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePageHeaderDirty() {
        return this._contains(DTOFIELD_ENABLEPAGEHEADER);
    }

    @JsonIgnore
    public void resetEnablePageHeader() {
        this._reset(DTOFIELD_ENABLEPAGEHEADER);
    }

    @JsonIgnore
    public PSSysViewPanelDTO enablepageheader(Integer enablePageHeader) {
        this.setEnablePageHeader(enablePageHeader);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO enablepageheader(Boolean enablePageHeader) {
        if (enablePageHeader == null) {
            this.setEnablePageHeader(null);
        } else {
            this.setEnablePageHeader(enablePageHeader != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="getdatamode")
    public void setGetDataMode(Integer getDataMode) {
        this._set(DTOFIELD_GETDATAMODE, getDataMode);
    }

    @JsonIgnore
    public Integer getGetDataMode() {
        Object objValue = this._get(DTOFIELD_GETDATAMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGetDataModeDirty() {
        return this._contains(DTOFIELD_GETDATAMODE);
    }

    @JsonIgnore
    public void resetGetDataMode() {
        this._reset(DTOFIELD_GETDATAMODE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO getdatamode(Integer getDataMode) {
        this.setGetDataMode(getDataMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO getdatamode(PSModelEnums.PanelGetDataMode getDataMode) {
        if (getDataMode == null) {
            this.setGetDataMode(null);
        } else {
            this.setGetDataMode(getDataMode.value);
        }
        return this;
    }

    @JsonProperty(value="getdatatimer")
    public void setGetDataTimer(Integer getDataTimer) {
        this._set(DTOFIELD_GETDATATIMER, getDataTimer);
    }

    @JsonIgnore
    public Integer getGetDataTimer() {
        Object objValue = this._get(DTOFIELD_GETDATATIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGetDataTimerDirty() {
        return this._contains(DTOFIELD_GETDATATIMER);
    }

    @JsonIgnore
    public void resetGetDataTimer() {
        this._reset(DTOFIELD_GETDATATIMER);
    }

    @JsonIgnore
    public PSSysViewPanelDTO getdatatimer(Integer getDataTimer) {
        this.setGetDataTimer(getDataTimer);
        return this;
    }

    @JsonProperty(value="getpsdeactionid")
    public void setGetPSDEActionId(String getPSDEActionId) {
        this._set(DTOFIELD_GETPSDEACTIONID, getPSDEActionId);
    }

    @JsonIgnore
    public String getGetPSDEActionId() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionIdDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGetPSDEActionId() {
        this._reset(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        } else {
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="getpsdeactionname")
    public void setGetPSDEActionName(String getPSDEActionName) {
        this._set(DTOFIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }

    @JsonIgnore
    public String getGetPSDEActionName() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionNameDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGetPSDEActionName() {
        this._reset(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionname(String getPSDEActionName) {
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    @JsonProperty(value="layoutmode")
    public void setLayoutMode(String layoutMode) {
        this._set(DTOFIELD_LAYOUTMODE, layoutMode);
    }

    @JsonIgnore
    public String getLayoutMode() {
        Object objValue = this._get(DTOFIELD_LAYOUTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutModeDirty() {
        return this._contains(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public void resetLayoutMode() {
        this._reset(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
        if (layoutMode == null) {
            this.setLayoutMode(null);
        } else {
            this.setLayoutMode(layoutMode.value);
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
    public PSSysViewPanelDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobflag")
    public void setMobFlag(Integer mobFlag) {
        this._set(DTOFIELD_MOBFLAG, mobFlag);
    }

    @JsonIgnore
    public Integer getMobFlag() {
        Object objValue = this._get(DTOFIELD_MOBFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMobFlagDirty() {
        return this._contains(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public void resetMobFlag() {
        this._reset(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO mobflag(Boolean mobFlag) {
        if (mobFlag == null) {
            this.setMobFlag(null);
        } else {
            this.setMobFlag(mobFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="navbarheight")
    public void setNavBarHeight(Integer navBarHeight) {
        this._set(DTOFIELD_NAVBARHEIGHT, navBarHeight);
    }

    @JsonIgnore
    public Integer getNavBarHeight() {
        Object objValue = this._get(DTOFIELD_NAVBARHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavBarHeightDirty() {
        return this._contains(DTOFIELD_NAVBARHEIGHT);
    }

    @JsonIgnore
    public void resetNavBarHeight() {
        this._reset(DTOFIELD_NAVBARHEIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarheight(Integer navBarHeight) {
        this.setNavBarHeight(navBarHeight);
        return this;
    }

    @JsonProperty(value="navbarpos")
    public void setNavBarPos(String navBarPos) {
        this._set(DTOFIELD_NAVBARPOS, navBarPos);
    }

    @JsonIgnore
    public String getNavBarPos() {
        Object objValue = this._get(DTOFIELD_NAVBARPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPosDirty() {
        return this._contains(DTOFIELD_NAVBARPOS);
    }

    @JsonIgnore
    public void resetNavBarPos() {
        this._reset(DTOFIELD_NAVBARPOS);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarpos(String navBarPos) {
        this.setNavBarPos(navBarPos);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarpos(PSModelEnums.NavBarPos navBarPos) {
        if (navBarPos == null) {
            this.setNavBarPos(null);
        } else {
            this.setNavBarPos(navBarPos.value);
        }
        return this;
    }

    @JsonProperty(value="navbarpssyscssid")
    public void setNavBarPSSysCssId(String navBarPSSysCssId) {
        this._set(DTOFIELD_NAVBARPSSYSCSSID, navBarPSSysCssId);
    }

    @JsonIgnore
    public String getNavBarPSSysCssId() {
        Object objValue = this._get(DTOFIELD_NAVBARPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPSSysCssIdDirty() {
        return this._contains(DTOFIELD_NAVBARPSSYSCSSID);
    }

    @JsonIgnore
    public void resetNavBarPSSysCssId() {
        this._reset(DTOFIELD_NAVBARPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarpssyscssid(String navBarPSSysCssId) {
        this.setNavBarPSSysCssId(navBarPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setNavBarPSSysCssId(null);
            this.setNavBarPSSysCssName(null);
        } else {
            this.setNavBarPSSysCssId(pSSysCss.getPSSysCssId());
            this.setNavBarPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="navbarpssyscssname")
    public void setNavBarPSSysCssName(String navBarPSSysCssName) {
        this._set(DTOFIELD_NAVBARPSSYSCSSNAME, navBarPSSysCssName);
    }

    @JsonIgnore
    public String getNavBarPSSysCssName() {
        Object objValue = this._get(DTOFIELD_NAVBARPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPSSysCssNameDirty() {
        return this._contains(DTOFIELD_NAVBARPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetNavBarPSSysCssName() {
        this._reset(DTOFIELD_NAVBARPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarpssyscssname(String navBarPSSysCssName) {
        this.setNavBarPSSysCssName(navBarPSSysCssName);
        return this;
    }

    @JsonProperty(value="navbarstyle")
    public void setNavBarStyle(String navBarStyle) {
        this._set(DTOFIELD_NAVBARSTYLE, navBarStyle);
    }

    @JsonIgnore
    public String getNavBarStyle() {
        Object objValue = this._get(DTOFIELD_NAVBARSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarStyleDirty() {
        return this._contains(DTOFIELD_NAVBARSTYLE);
    }

    @JsonIgnore
    public void resetNavBarStyle() {
        this._reset(DTOFIELD_NAVBARSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarstyle(String navBarStyle) {
        this.setNavBarStyle(navBarStyle);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarstyle(PSModelEnums.CtrlDetailStyle navBarStyle) {
        if (navBarStyle == null) {
            this.setNavBarStyle(null);
        } else {
            this.setNavBarStyle(navBarStyle.value);
        }
        return this;
    }

    @JsonProperty(value="navbarwidth")
    public void setNavBarWidth(Integer navBarWidth) {
        this._set(DTOFIELD_NAVBARWIDTH, navBarWidth);
    }

    @JsonIgnore
    public Integer getNavBarWidth() {
        Object objValue = this._get(DTOFIELD_NAVBARWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavBarWidthDirty() {
        return this._contains(DTOFIELD_NAVBARWIDTH);
    }

    @JsonIgnore
    public void resetNavBarWidth() {
        this._reset(DTOFIELD_NAVBARWIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelDTO navbarwidth(Integer navBarWidth) {
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    @JsonProperty(value="pageformat")
    public void setPageFormat(String pageFormat) {
        this._set(DTOFIELD_PAGEFORMAT, pageFormat);
    }

    @JsonIgnore
    public String getPageFormat() {
        Object objValue = this._get(DTOFIELD_PAGEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPageFormatDirty() {
        return this._contains(DTOFIELD_PAGEFORMAT);
    }

    @JsonIgnore
    public void resetPageFormat() {
        this._reset(DTOFIELD_PAGEFORMAT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pageformat(String pageFormat) {
        this.setPageFormat(pageFormat);
        return this;
    }

    @JsonProperty(value="pageheight")
    public void setPageHeight(BigDecimal pageHeight) {
        this._set(DTOFIELD_PAGEHEIGHT, pageHeight);
    }

    @JsonIgnore
    public BigDecimal getPageHeight() {
        Object objValue = this._get(DTOFIELD_PAGEHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageHeightDirty() {
        return this._contains(DTOFIELD_PAGEHEIGHT);
    }

    @JsonIgnore
    public void resetPageHeight() {
        this._reset(DTOFIELD_PAGEHEIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pageheight(BigDecimal pageHeight) {
        this.setPageHeight(pageHeight);
        return this;
    }

    @JsonProperty(value="pagemarginbottom")
    public void setPageMarginBottom(BigDecimal pageMarginBottom) {
        this._set(DTOFIELD_PAGEMARGINBOTTOM, pageMarginBottom);
    }

    @JsonIgnore
    public BigDecimal getPageMarginBottom() {
        Object objValue = this._get(DTOFIELD_PAGEMARGINBOTTOM);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageMarginBottomDirty() {
        return this._contains(DTOFIELD_PAGEMARGINBOTTOM);
    }

    @JsonIgnore
    public void resetPageMarginBottom() {
        this._reset(DTOFIELD_PAGEMARGINBOTTOM);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pagemarginbottom(BigDecimal pageMarginBottom) {
        this.setPageMarginBottom(pageMarginBottom);
        return this;
    }

    @JsonProperty(value="pagemarginleft")
    public void setPageMarginLeft(BigDecimal pageMarginLeft) {
        this._set(DTOFIELD_PAGEMARGINLEFT, pageMarginLeft);
    }

    @JsonIgnore
    public BigDecimal getPageMarginLeft() {
        Object objValue = this._get(DTOFIELD_PAGEMARGINLEFT);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageMarginLeftDirty() {
        return this._contains(DTOFIELD_PAGEMARGINLEFT);
    }

    @JsonIgnore
    public void resetPageMarginLeft() {
        this._reset(DTOFIELD_PAGEMARGINLEFT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pagemarginleft(BigDecimal pageMarginLeft) {
        this.setPageMarginLeft(pageMarginLeft);
        return this;
    }

    @JsonProperty(value="pagemarginright")
    public void setPageMarginRight(BigDecimal pageMarginRight) {
        this._set(DTOFIELD_PAGEMARGINRIGHT, pageMarginRight);
    }

    @JsonIgnore
    public BigDecimal getPageMarginRight() {
        Object objValue = this._get(DTOFIELD_PAGEMARGINRIGHT);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageMarginRightDirty() {
        return this._contains(DTOFIELD_PAGEMARGINRIGHT);
    }

    @JsonIgnore
    public void resetPageMarginRight() {
        this._reset(DTOFIELD_PAGEMARGINRIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pagemarginright(BigDecimal pageMarginRight) {
        this.setPageMarginRight(pageMarginRight);
        return this;
    }

    @JsonProperty(value="pagemargintop")
    public void setPageMarginTop(BigDecimal pageMarginTop) {
        this._set(DTOFIELD_PAGEMARGINTOP, pageMarginTop);
    }

    @JsonIgnore
    public BigDecimal getPageMarginTop() {
        Object objValue = this._get(DTOFIELD_PAGEMARGINTOP);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageMarginTopDirty() {
        return this._contains(DTOFIELD_PAGEMARGINTOP);
    }

    @JsonIgnore
    public void resetPageMarginTop() {
        this._reset(DTOFIELD_PAGEMARGINTOP);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pagemargintop(BigDecimal pageMarginTop) {
        this.setPageMarginTop(pageMarginTop);
        return this;
    }

    @JsonProperty(value="pagewidth")
    public void setPageWidth(BigDecimal pageWidth) {
        this._set(DTOFIELD_PAGEWIDTH, pageWidth);
    }

    @JsonIgnore
    public BigDecimal getPageWidth() {
        Object objValue = this._get(DTOFIELD_PAGEWIDTH);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPageWidthDirty() {
        return this._contains(DTOFIELD_PAGEWIDTH);
    }

    @JsonIgnore
    public void resetPageWidth() {
        this._reset(DTOFIELD_PAGEWIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pagewidth(BigDecimal pageWidth) {
        this.setPageWidth(pageWidth);
        return this;
    }

    @JsonProperty(value="panelheight")
    public void setPanelHeight(Integer panelHeight) {
        this._set(DTOFIELD_PANELHEIGHT, panelHeight);
    }

    @JsonIgnore
    public Integer getPanelHeight() {
        Object objValue = this._get(DTOFIELD_PANELHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPanelHeightDirty() {
        return this._contains(DTOFIELD_PANELHEIGHT);
    }

    @JsonIgnore
    public void resetPanelHeight() {
        this._reset(DTOFIELD_PANELHEIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelDTO panelheight(Integer panelHeight) {
        this.setPanelHeight(panelHeight);
        return this;
    }

    @JsonProperty(value="panelnavbar")
    public void setPanelNavBar(Integer panelNavBar) {
        this._set(DTOFIELD_PANELNAVBAR, panelNavBar);
    }

    @JsonIgnore
    public Integer getPanelNavBar() {
        Object objValue = this._get(DTOFIELD_PANELNAVBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPanelNavBarDirty() {
        return this._contains(DTOFIELD_PANELNAVBAR);
    }

    @JsonIgnore
    public void resetPanelNavBar() {
        this._reset(DTOFIELD_PANELNAVBAR);
    }

    @JsonIgnore
    public PSSysViewPanelDTO panelnavbar(Integer panelNavBar) {
        this.setPanelNavBar(panelNavBar);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO panelnavbar(Boolean panelNavBar) {
        if (panelNavBar == null) {
            this.setPanelNavBar(null);
        } else {
            this.setPanelNavBar(panelNavBar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="panelstyle")
    public void setPanelStyle(String panelStyle) {
        this._set(DTOFIELD_PANELSTYLE, panelStyle);
    }

    @JsonIgnore
    public String getPanelStyle() {
        Object objValue = this._get(DTOFIELD_PANELSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPanelStyleDirty() {
        return this._contains(DTOFIELD_PANELSTYLE);
    }

    @JsonIgnore
    public void resetPanelStyle() {
        this._reset(DTOFIELD_PANELSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO panelstyle(String panelStyle) {
        this.setPanelStyle(panelStyle);
        return this;
    }

    @JsonProperty(value="panelwidth")
    public void setPanelWidth(Integer panelWidth) {
        this._set(DTOFIELD_PANELWIDTH, panelWidth);
    }

    @JsonIgnore
    public Integer getPanelWidth() {
        Object objValue = this._get(DTOFIELD_PANELWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPanelWidthDirty() {
        return this._contains(DTOFIELD_PANELWIDTH);
    }

    @JsonIgnore
    public void resetPanelWidth() {
        this._reset(DTOFIELD_PANELWIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelDTO panelwidth(Integer panelWidth) {
        this.setPanelWidth(panelWidth);
        return this;
    }

    @JsonProperty(value="ppi")
    public void setPPI(BigDecimal pPI) {
        this._set(DTOFIELD_PPI, pPI);
    }

    @JsonIgnore
    public BigDecimal getPPI() {
        Object objValue = this._get(DTOFIELD_PPI);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isPPIDirty() {
        return this._contains(DTOFIELD_PPI);
    }

    @JsonIgnore
    public void resetPPI() {
        this._reset(DTOFIELD_PPI);
    }

    @JsonIgnore
    public PSSysViewPanelDTO ppi(BigDecimal pPI) {
        this.setPPI(pPI);
        return this;
    }

    @JsonProperty(value="psachandlerid")
    public void setPSACHandlerId(String pSACHandlerId) {
        this._set(DTOFIELD_PSACHANDLERID, pSACHandlerId);
    }

    @JsonIgnore
    public String getPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSACHandlerId() {
        this._reset(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public PSSysViewPanelDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO psachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        } else {
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="psachandlername")
    public void setPSACHandlerName(String pSACHandlerName) {
        this._set(DTOFIELD_PSACHANDLERNAME, pSACHandlerName);
    }

    @JsonIgnore
    public String getPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSACHandlerName() {
        this._reset(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public PSSysViewPanelDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
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
    public PSSysViewPanelDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSSysViewPanelDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
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
    public PSSysViewPanelDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysViewPanelDTO psdename(String pSDEName) {
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
    public PSSysViewPanelDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysViewPanelDTO psmodulename(String pSModuleName) {
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
    public PSSysViewPanelDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
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
    public PSSysViewPanelDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysViewPanelDTO pssyscssname(String pSSysCssName) {
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
    public PSSysViewPanelDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysViewPanelDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysViewPanelName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysViewPanelName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelDTO name(String strName) {
        this.setPSSysViewPanelName(strName);
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
    public PSSysViewPanelDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSSysViewPanelDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="publicflag")
    public void setPublicFlag(Integer publicFlag) {
        this._set(DTOFIELD_PUBLICFLAG, publicFlag);
    }

    @JsonIgnore
    public Integer getPublicFlag() {
        Object objValue = this._get(DTOFIELD_PUBLICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPublicFlagDirty() {
        return this._contains(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public void resetPublicFlag() {
        this._reset(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelDTO publicflag(Integer publicFlag) {
        this.setPublicFlag(publicFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO publicflag(Boolean publicFlag) {
        if (publicFlag == null) {
            this.setPublicFlag(null);
        } else {
            this.setPublicFlag(publicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="showfooterfirstpage")
    public void setShowFooterFirstPage(Integer showFooterFirstPage) {
        this._set(DTOFIELD_SHOWFOOTERFIRSTPAGE, showFooterFirstPage);
    }

    @JsonIgnore
    public Integer getShowFooterFirstPage() {
        Object objValue = this._get(DTOFIELD_SHOWFOOTERFIRSTPAGE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowFooterFirstPageDirty() {
        return this._contains(DTOFIELD_SHOWFOOTERFIRSTPAGE);
    }

    @JsonIgnore
    public void resetShowFooterFirstPage() {
        this._reset(DTOFIELD_SHOWFOOTERFIRSTPAGE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO showfooterfirstpage(Integer showFooterFirstPage) {
        this.setShowFooterFirstPage(showFooterFirstPage);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO showfooterfirstpage(Boolean showFooterFirstPage) {
        if (showFooterFirstPage == null) {
            this.setShowFooterFirstPage(null);
        } else {
            this.setShowFooterFirstPage(showFooterFirstPage != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="showheaderfirstpage")
    public void setShowHeaderFirstPage(Integer showHeaderFirstPage) {
        this._set(DTOFIELD_SHOWHEADERFIRSTPAGE, showHeaderFirstPage);
    }

    @JsonIgnore
    public Integer getShowHeaderFirstPage() {
        Object objValue = this._get(DTOFIELD_SHOWHEADERFIRSTPAGE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowHeaderFirstPageDirty() {
        return this._contains(DTOFIELD_SHOWHEADERFIRSTPAGE);
    }

    @JsonIgnore
    public void resetShowHeaderFirstPage() {
        this._reset(DTOFIELD_SHOWHEADERFIRSTPAGE);
    }

    @JsonIgnore
    public PSSysViewPanelDTO showheaderfirstpage(Integer showHeaderFirstPage) {
        this.setShowHeaderFirstPage(showHeaderFirstPage);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO showheaderfirstpage(Boolean showHeaderFirstPage) {
        if (showHeaderFirstPage == null) {
            this.setShowHeaderFirstPage(null);
        } else {
            this.setShowHeaderFirstPage(showHeaderFirstPage != false ? 1 : 0);
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
    public PSSysViewPanelDTO updatedate(Timestamp updateDate) {
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
    public PSSysViewPanelDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="viewlayoutflag")
    public void setViewLayoutFlag(Integer viewLayoutFlag) {
        this._set(DTOFIELD_VIEWLAYOUTFLAG, viewLayoutFlag);
    }

    @JsonIgnore
    public Integer getViewLayoutFlag() {
        Object objValue = this._get(DTOFIELD_VIEWLAYOUTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewLayoutFlagDirty() {
        return this._contains(DTOFIELD_VIEWLAYOUTFLAG);
    }

    @JsonIgnore
    public void resetViewLayoutFlag() {
        this._reset(DTOFIELD_VIEWLAYOUTFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelDTO viewlayoutflag(Integer viewLayoutFlag) {
        this.setViewLayoutFlag(viewLayoutFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelDTO viewlayoutflag(PSModelEnums.PanelMode viewLayoutFlag) {
        if (viewLayoutFlag == null) {
            this.setViewLayoutFlag(null);
        } else {
            this.setViewLayoutFlag(viewLayoutFlag.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysViewPanelId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysViewPanelId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelDTO id(String strValue) {
        this.setPSSysViewPanelId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysViewPanelLogicDTO> getPSSysViewPanelLogics() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysviewpanellogics")
    public void setPSSysViewPanelLogics(List<PSSysViewPanelLogicDTO> pssysviewpanellogics) {
        this._set(DTOFIELD_PSSYSVIEWPANELLOGICS, pssysviewpanellogics);
    }

    @JsonIgnore
    public List<PSSysViewPanelLogicDTO> getPSSysViewPanelLogicsIf() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSVIEWPANELLOGICS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysViewPanelModelDTO> getPSSysViewPanelModels() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELMODELS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysviewpanelmodels")
    public void setPSSysViewPanelModels(List<PSSysViewPanelModelDTO> pssysviewpanelmodels) {
        this._set(DTOFIELD_PSSYSVIEWPANELMODELS, pssysviewpanelmodels);
    }

    @JsonIgnore
    public List<PSSysViewPanelModelDTO> getPSSysViewPanelModelsIf() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELMODELS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSVIEWPANELMODELS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSPanelEngineDTO> getPSPanelEngines() {
        Object list = this._get(DTOFIELD_PSPANELENGINES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pspanelengines")
    public void setPSPanelEngines(List<PSPanelEngineDTO> pspanelengines) {
        this._set(DTOFIELD_PSPANELENGINES, pspanelengines);
    }

    @JsonIgnore
    public List<PSPanelEngineDTO> getPSPanelEnginesIf() {
        Object list = this._get(DTOFIELD_PSPANELENGINES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSPANELENGINES, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysViewPanelItemDTO> getPSSysViewPanelItems() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysviewpanelitems")
    public void setPSSysViewPanelItems(List<PSSysViewPanelItemDTO> pssysviewpanelitems) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMS, pssysviewpanelitems);
    }

    @JsonIgnore
    public List<PSSysViewPanelItemDTO> getPSSysViewPanelItemsIf() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSVIEWPANELITEMS, list);
        }
        return (List)list;
    }
}
