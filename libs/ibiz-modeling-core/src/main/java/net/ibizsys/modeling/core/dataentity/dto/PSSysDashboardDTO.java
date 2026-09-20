package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBPartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDashboardLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGroupDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDashboardDTO
extends PSModelDTOBase {
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLMODEL = "COLMODEL";
    protected static final String DTOFIELD_COLMODEL = "colmodel";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DASHBOARDNAVBAR = "DASHBOARDNAVBAR";
    protected static final String DTOFIELD_DASHBOARDNAVBAR = "dashboardnavbar";
    public static final String FIELD_DASHBOARDSTYLE = "DASHBOARDSTYLE";
    protected static final String DTOFIELD_DASHBOARDSTYLE = "dashboardstyle";
    public static final String FIELD_DASHBOARDTAG = "DASHBOARDTAG";
    protected static final String DTOFIELD_DASHBOARDTAG = "dashboardtag";
    public static final String FIELD_DASHBOARDTAG2 = "DASHBOARDTAG2";
    protected static final String DTOFIELD_DASHBOARDTAG2 = "dashboardtag2";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZED";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_FLEXALIGN = "FLEXALIGN";
    protected static final String DTOFIELD_FLEXALIGN = "flexalign";
    public static final String FIELD_FLEXDIR = "FLEXDIR";
    protected static final String DTOFIELD_FLEXDIR = "flexdir";
    public static final String FIELD_FLEXVALIGN = "FLEXVALIGN";
    protected static final String DTOFIELD_FLEXVALIGN = "flexvalign";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
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
    public static final String FIELD_PSSYSDASHBOARDID = "PSSYSDASHBOARDID";
    protected static final String DTOFIELD_PSSYSDASHBOARDID = "pssysdashboardid";
    public static final String FIELD_PSSYSDASHBOARDNAME = "PSSYSDASHBOARDNAME";
    protected static final String DTOFIELD_PSSYSDASHBOARDNAME = "pssysdashboardname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSSYSDASHBOARDLOGICS = "pssysdashboardlogics";
    public static final String DTOFIELD_PSSYSDBPARTS = "pssysdbparts";

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
    public PSSysDashboardDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
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
    public PSSysDashboardDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="colmodel")
    public void setColModel(String colModel) {
        this._set(DTOFIELD_COLMODEL, colModel);
    }

    @JsonIgnore
    public String getColModel() {
        Object objValue = this._get(DTOFIELD_COLMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColModelDirty() {
        return this._contains(DTOFIELD_COLMODEL);
    }

    @JsonIgnore
    public void resetColModel() {
        this._reset(DTOFIELD_COLMODEL);
    }

    @JsonIgnore
    public PSSysDashboardDTO colmodel(String colModel) {
        this.setColModel(colModel);
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
    public PSSysDashboardDTO createdate(Timestamp createDate) {
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
    public PSSysDashboardDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dashboardnavbar")
    public void setDashboardNavBar(Integer dashboardNavBar) {
        this._set(DTOFIELD_DASHBOARDNAVBAR, dashboardNavBar);
    }

    @JsonIgnore
    public Integer getDashboardNavBar() {
        Object objValue = this._get(DTOFIELD_DASHBOARDNAVBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDashboardNavBarDirty() {
        return this._contains(DTOFIELD_DASHBOARDNAVBAR);
    }

    @JsonIgnore
    public void resetDashboardNavBar() {
        this._reset(DTOFIELD_DASHBOARDNAVBAR);
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardnavbar(Integer dashboardNavBar) {
        this.setDashboardNavBar(dashboardNavBar);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardnavbar(Boolean dashboardNavBar) {
        if (dashboardNavBar == null) {
            this.setDashboardNavBar(null);
        } else {
            this.setDashboardNavBar(dashboardNavBar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dashboardstyle")
    public void setDashboardStyle(String dashboardStyle) {
        this._set(DTOFIELD_DASHBOARDSTYLE, dashboardStyle);
    }

    @JsonIgnore
    public String getDashboardStyle() {
        Object objValue = this._get(DTOFIELD_DASHBOARDSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDashboardStyleDirty() {
        return this._contains(DTOFIELD_DASHBOARDSTYLE);
    }

    @JsonIgnore
    public void resetDashboardStyle() {
        this._reset(DTOFIELD_DASHBOARDSTYLE);
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardstyle(String dashboardStyle) {
        this.setDashboardStyle(dashboardStyle);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardstyle(PSModelEnums.DashboardStyle dashboardStyle) {
        if (dashboardStyle == null) {
            this.setDashboardStyle(null);
        } else {
            this.setDashboardStyle(dashboardStyle.value);
        }
        return this;
    }

    @JsonProperty(value="dashboardtag")
    public void setDashboardTag(String dashboardTag) {
        this._set(DTOFIELD_DASHBOARDTAG, dashboardTag);
    }

    @JsonIgnore
    public String getDashboardTag() {
        Object objValue = this._get(DTOFIELD_DASHBOARDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDashboardTagDirty() {
        return this._contains(DTOFIELD_DASHBOARDTAG);
    }

    @JsonIgnore
    public void resetDashboardTag() {
        this._reset(DTOFIELD_DASHBOARDTAG);
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardtag(String dashboardTag) {
        this.setDashboardTag(dashboardTag);
        return this;
    }

    @JsonProperty(value="dashboardtag2")
    public void setDashboardTag2(String dashboardTag2) {
        this._set(DTOFIELD_DASHBOARDTAG2, dashboardTag2);
    }

    @JsonIgnore
    public String getDashboardTag2() {
        Object objValue = this._get(DTOFIELD_DASHBOARDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDashboardTag2Dirty() {
        return this._contains(DTOFIELD_DASHBOARDTAG2);
    }

    @JsonIgnore
    public void resetDashboardTag2() {
        this._reset(DTOFIELD_DASHBOARDTAG2);
    }

    @JsonIgnore
    public PSSysDashboardDTO dashboardtag2(String dashboardTag2) {
        this.setDashboardTag2(dashboardTag2);
        return this;
    }

    @JsonProperty(value="enablecustomized")
    public void setEnableCustomized(Integer enableCustomized) {
        this._set(DTOFIELD_ENABLECUSTOMIZED, enableCustomized);
    }

    @JsonIgnore
    public Integer getEnableCustomized() {
        Object objValue = this._get(DTOFIELD_ENABLECUSTOMIZED);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCustomizedDirty() {
        return this._contains(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public void resetEnableCustomized() {
        this._reset(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public PSSysDashboardDTO enablecustomized(Integer enableCustomized) {
        this.setEnableCustomized(enableCustomized);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO enablecustomized(PSModelEnums.CtrlCustomizeMode enableCustomized) {
        if (enableCustomized == null) {
            this.setEnableCustomized(null);
        } else {
            this.setEnableCustomized(enableCustomized.value);
        }
        return this;
    }

    @JsonProperty(value="flexalign")
    public void setFlexAlign(String flexAlign) {
        this._set(DTOFIELD_FLEXALIGN, flexAlign);
    }

    @JsonIgnore
    public String getFlexAlign() {
        Object objValue = this._get(DTOFIELD_FLEXALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexAlignDirty() {
        return this._contains(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public void resetFlexAlign() {
        this._reset(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public PSSysDashboardDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
        if (flexAlign == null) {
            this.setFlexAlign(null);
        } else {
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    @JsonProperty(value="flexdir")
    public void setFlexDir(String flexDir) {
        this._set(DTOFIELD_FLEXDIR, flexDir);
    }

    @JsonIgnore
    public String getFlexDir() {
        Object objValue = this._get(DTOFIELD_FLEXDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexDirDirty() {
        return this._contains(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public void resetFlexDir() {
        this._reset(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public PSSysDashboardDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
        if (flexDir == null) {
            this.setFlexDir(null);
        } else {
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    @JsonProperty(value="flexvalign")
    public void setFlexVAlign(String flexVAlign) {
        this._set(DTOFIELD_FLEXVALIGN, flexVAlign);
    }

    @JsonIgnore
    public String getFlexVAlign() {
        Object objValue = this._get(DTOFIELD_FLEXVALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexVAlignDirty() {
        return this._contains(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public void resetFlexVAlign() {
        this._reset(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public PSSysDashboardDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
        if (flexVAlign == null) {
            this.setFlexVAlign(null);
        } else {
            this.setFlexVAlign(flexVAlign.value);
        }
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
    public PSSysDashboardDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
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
    public PSSysDashboardDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysDashboardDTO navbarheight(Integer navBarHeight) {
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
    public PSSysDashboardDTO navbarpos(String navBarPos) {
        this.setNavBarPos(navBarPos);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO navbarpos(PSModelEnums.NavBarPos navBarPos) {
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
    public PSSysDashboardDTO navbarpssyscssid(String navBarPSSysCssId) {
        this.setNavBarPSSysCssId(navBarPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO navbarpssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysDashboardDTO navbarpssyscssname(String navBarPSSysCssName) {
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
    public PSSysDashboardDTO navbarstyle(String navBarStyle) {
        this.setNavBarStyle(navBarStyle);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO navbarstyle(PSModelEnums.CtrlDetailStyle navBarStyle) {
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
    public PSSysDashboardDTO navbarwidth(Integer navBarWidth) {
        this.setNavBarWidth(navBarWidth);
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
    public PSSysDashboardDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSSysDashboardDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSSysDashboardDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysDashboardDTO psdename(String pSDEName) {
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
    public PSSysDashboardDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysDashboardDTO psmodulename(String pSModuleName) {
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
    public PSSysDashboardDTO pssysappname(String pSSysAppName) {
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
    public PSSysDashboardDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysDashboardDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysdashboardid")
    public void setPSSysDashboardId(String pSSysDashboardId) {
        this._set(DTOFIELD_PSSYSDASHBOARDID, pSSysDashboardId);
    }

    @JsonIgnore
    public String getPSSysDashboardId() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardIdDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public void resetPSSysDashboardId() {
        this._reset(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public PSSysDashboardDTO pssysdashboardid(String pSSysDashboardId) {
        this.setPSSysDashboardId(pSSysDashboardId);
        return this;
    }

    @JsonProperty(value="pssysdashboardname")
    public void setPSSysDashboardName(String pSSysDashboardName) {
        this._set(DTOFIELD_PSSYSDASHBOARDNAME, pSSysDashboardName);
    }

    @JsonIgnore
    public String getPSSysDashboardName() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardNameDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public void resetPSSysDashboardName() {
        this._reset(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public PSSysDashboardDTO pssysdashboardname(String pSSysDashboardName) {
        this.setPSSysDashboardName(pSSysDashboardName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDashboardName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDashboardName(strName);
    }

    @JsonIgnore
    public PSSysDashboardDTO name(String strName) {
        this.setPSSysDashboardName(strName);
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
    public PSSysDashboardDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysDashboardDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSSysDashboardDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysDashboardDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSSysDashboardDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
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
    public PSSysDashboardDTO updatedate(Timestamp updateDate) {
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
    public PSSysDashboardDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDashboardId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDashboardId(strValue);
    }

    @JsonIgnore
    public PSSysDashboardDTO id(String strValue) {
        this.setPSSysDashboardId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysDashboardLogicDTO> getPSSysDashboardLogics() {
        Object list = this._get(DTOFIELD_PSSYSDASHBOARDLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysdashboardlogics")
    public void setPSSysDashboardLogics(List<PSSysDashboardLogicDTO> pssysdashboardlogics) {
        this._set(DTOFIELD_PSSYSDASHBOARDLOGICS, pssysdashboardlogics);
    }

    @JsonIgnore
    public List<PSSysDashboardLogicDTO> getPSSysDashboardLogicsIf() {
        Object list = this._get(DTOFIELD_PSSYSDASHBOARDLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSDASHBOARDLOGICS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysDBPartDTO> getPSSysDBParts() {
        Object list = this._get(DTOFIELD_PSSYSDBPARTS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysdbparts")
    public void setPSSysDBParts(List<PSSysDBPartDTO> pssysdbparts) {
        this._set(DTOFIELD_PSSYSDBPARTS, pssysdbparts);
    }

    @JsonIgnore
    public List<PSSysDBPartDTO> getPSSysDBPartsIf() {
        Object list = this._get(DTOFIELD_PSSYSDBPARTS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSDBPARTS, list);
        }
        return (List)list;
    }
}
