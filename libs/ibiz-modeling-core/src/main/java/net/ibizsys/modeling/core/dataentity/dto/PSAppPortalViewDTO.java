package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;

/**
 * Application portal view DTO.
 */
public class PSAppPortalViewDTO extends PSAppViewDTO {
    private static final long serialVersionUID = 1L;

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
    public static final String FIELD_DEFAULTPAGE = "DEFAULTPAGE";
    protected static final String DTOFIELD_DEFAULTPAGE = "defaultpage";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZE";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_FLEXALIGN = "FLEXALIGN";
    protected static final String DTOFIELD_FLEXALIGN = "flexalign";
    public static final String FIELD_FLEXDIR = "FLEXDIR";
    protected static final String DTOFIELD_FLEXDIR = "flexdir";
    public static final String FIELD_FLEXVALIGN = "FLEXVALIGN";
    protected static final String DTOFIELD_FLEXVALIGN = "flexvalign";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_NAVBARHEIGHT = "NAVBARHEIGHT";
    protected static final String DTOFIELD_NAVBARHEIGHT = "navbarheight";
    public static final String FIELD_NAVBARPOS = "NAVBARPOS";
    protected static final String DTOFIELD_NAVBARPOS = "navbarpos";
    public static final String FIELD_NAVBARSTYLE = "NAVBARSTYLE";
    protected static final String DTOFIELD_NAVBARSTYLE = "navbarstyle";
    public static final String FIELD_NAVBARWIDTH = "NAVBARWIDTH";
    protected static final String DTOFIELD_NAVBARWIDTH = "navbarwidth";
    public static final String FIELD_PSAPPPORTALVIEWID = "PSAPPPORTALVIEWID";
    protected static final String DTOFIELD_PSAPPPORTALVIEWID = "psappportalviewid";
    public static final String FIELD_PSAPPPORTALVIEWNAME = "PSAPPPORTALVIEWNAME";
    protected static final String DTOFIELD_PSAPPPORTALVIEWNAME = "psappportalviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSAPPPVPARTS = "psapppvparts";

    public PSAppPortalViewDTO() { setPSAppViewType("APPPORTALVIEW"); }

    @JsonProperty("colmodel")
    public void setColModel(String value) { _set(DTOFIELD_COLMODEL, value); }
    @JsonIgnore public String getColModel() { return (String) _get(DTOFIELD_COLMODEL); }
    @JsonIgnore public boolean isColModelDirty() { return _contains(DTOFIELD_COLMODEL); }
    @JsonIgnore public void resetColModel() { _reset(DTOFIELD_COLMODEL); }
    @JsonIgnore public PSAppPortalViewDTO colmodel(String value) { setColModel(value); return this; }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @Override @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public PSAppPortalViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @Override @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public PSAppPortalViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("dashboardnavbar")
    public void setDashboardNavBar(Integer value) { _set(DTOFIELD_DASHBOARDNAVBAR, value); }
    @JsonIgnore public Integer getDashboardNavBar() { return (Integer) _get(DTOFIELD_DASHBOARDNAVBAR); }
    @JsonIgnore public boolean isDashboardNavBarDirty() { return _contains(DTOFIELD_DASHBOARDNAVBAR); }
    @JsonIgnore public void resetDashboardNavBar() { _reset(DTOFIELD_DASHBOARDNAVBAR); }
    @JsonIgnore public PSAppPortalViewDTO dashboardnavbar(Integer value) { setDashboardNavBar(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO dashboardnavbar(Boolean value) { setDashboardNavBar(flagValue(value)); return this; }

    @JsonProperty("dashboardstyle")
    public void setDashboardStyle(String value) { _set(DTOFIELD_DASHBOARDSTYLE, value); }
    @JsonIgnore public String getDashboardStyle() { return (String) _get(DTOFIELD_DASHBOARDSTYLE); }
    @JsonIgnore public boolean isDashboardStyleDirty() { return _contains(DTOFIELD_DASHBOARDSTYLE); }
    @JsonIgnore public void resetDashboardStyle() { _reset(DTOFIELD_DASHBOARDSTYLE); }
    @JsonIgnore public PSAppPortalViewDTO dashboardstyle(String value) { setDashboardStyle(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO dashboardstyle(PSModelEnums.DashboardStyle value) {
        setDashboardStyle(value == null ? null : value.value); return this;
    }

    @JsonProperty("dashboardtag")
    public void setDashboardTag(String value) { _set(DTOFIELD_DASHBOARDTAG, value); }
    @JsonIgnore public String getDashboardTag() { return (String) _get(DTOFIELD_DASHBOARDTAG); }
    @JsonIgnore public boolean isDashboardTagDirty() { return _contains(DTOFIELD_DASHBOARDTAG); }
    @JsonIgnore public void resetDashboardTag() { _reset(DTOFIELD_DASHBOARDTAG); }
    @JsonIgnore public PSAppPortalViewDTO dashboardtag(String value) { setDashboardTag(value); return this; }

    @JsonProperty("dashboardtag2")
    public void setDashboardTag2(String value) { _set(DTOFIELD_DASHBOARDTAG2, value); }
    @JsonIgnore public String getDashboardTag2() { return (String) _get(DTOFIELD_DASHBOARDTAG2); }
    @JsonIgnore public boolean isDashboardTag2Dirty() { return _contains(DTOFIELD_DASHBOARDTAG2); }
    @JsonIgnore public void resetDashboardTag2() { _reset(DTOFIELD_DASHBOARDTAG2); }
    @JsonIgnore public PSAppPortalViewDTO dashboardtag2(String value) { setDashboardTag2(value); return this; }

    @JsonProperty("defaultpage")
    public void setDefaultPage(Integer value) { _set(DTOFIELD_DEFAULTPAGE, value); }
    @JsonIgnore public Integer getDefaultPage() { return (Integer) _get(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public boolean isDefaultPageDirty() { return _contains(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public void resetDefaultPage() { _reset(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public PSAppPortalViewDTO defaultpage(Integer value) { setDefaultPage(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO defaultpage(Boolean value) { setDefaultPage(flagValue(value)); return this; }

    @JsonProperty("enablecustomized")
    public void setEnableCustomized(Integer value) {
        _set(DTOFIELD_ENABLECUSTOMIZED, value);
        _set(FIELD_ENABLECUSTOMIZED, value);
    }
    @JsonIgnore public Integer getEnableCustomized() {
        Object value = _get(DTOFIELD_ENABLECUSTOMIZED);
        return (Integer) (value == null ? _get(FIELD_ENABLECUSTOMIZED) : value);
    }
    @JsonIgnore public boolean isEnableCustomizedDirty() {
        return _contains(DTOFIELD_ENABLECUSTOMIZED) || _contains(FIELD_ENABLECUSTOMIZED);
    }
    @JsonIgnore public void resetEnableCustomized() {
        _reset(DTOFIELD_ENABLECUSTOMIZED);
        _reset(FIELD_ENABLECUSTOMIZED);
    }
    @JsonIgnore public PSAppPortalViewDTO enablecustomized(Integer value) { setEnableCustomized(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO enablecustomized(PSModelEnums.CtrlCustomizeMode value) {
        setEnableCustomized(value == null ? null : value.value); return this;
    }
    @JsonIgnore @Deprecated public Integer getEnableCustomize() { return getEnableCustomized(); }
    @JsonIgnore @Deprecated public void setEnableCustomize(Integer value) { setEnableCustomized(value); }
    @JsonIgnore @Deprecated public boolean isEnableCustomizeDirty() { return isEnableCustomizedDirty(); }
    @JsonIgnore @Deprecated public void resetEnableCustomize() { resetEnableCustomized(); }

    @JsonProperty("flexalign")
    public void setFlexAlign(String value) { _set(DTOFIELD_FLEXALIGN, value); }
    @JsonIgnore public String getFlexAlign() { return (String) _get(DTOFIELD_FLEXALIGN); }
    @JsonIgnore public boolean isFlexAlignDirty() { return _contains(DTOFIELD_FLEXALIGN); }
    @JsonIgnore public void resetFlexAlign() { _reset(DTOFIELD_FLEXALIGN); }
    @JsonIgnore public PSAppPortalViewDTO flexalign(String value) { setFlexAlign(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO flexalign(PSModelEnums.FlexAlign value) {
        setFlexAlign(value == null ? null : value.value); return this;
    }

    @JsonProperty("flexdir")
    public void setFlexDir(String value) { _set(DTOFIELD_FLEXDIR, value); }
    @JsonIgnore public String getFlexDir() { return (String) _get(DTOFIELD_FLEXDIR); }
    @JsonIgnore public boolean isFlexDirDirty() { return _contains(DTOFIELD_FLEXDIR); }
    @JsonIgnore public void resetFlexDir() { _reset(DTOFIELD_FLEXDIR); }
    @JsonIgnore public PSAppPortalViewDTO flexdir(String value) { setFlexDir(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO flexdir(PSModelEnums.FlexLayoutDir value) {
        setFlexDir(value == null ? null : value.value); return this;
    }

    @JsonProperty("flexvalign")
    public void setFlexVAlign(String value) { _set(DTOFIELD_FLEXVALIGN, value); }
    @JsonIgnore public String getFlexVAlign() { return (String) _get(DTOFIELD_FLEXVALIGN); }
    @JsonIgnore public boolean isFlexVAlignDirty() { return _contains(DTOFIELD_FLEXVALIGN); }
    @JsonIgnore public void resetFlexVAlign() { _reset(DTOFIELD_FLEXVALIGN); }
    @JsonIgnore public PSAppPortalViewDTO flexvalign(String value) { setFlexVAlign(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO flexvalign(PSModelEnums.FlexVAlign value) {
        setFlexVAlign(value == null ? null : value.value); return this;
    }

    @JsonProperty("layoutmode")
    public void setLayoutMode(String value) { _set(DTOFIELD_LAYOUTMODE, value); }
    @JsonIgnore public String getLayoutMode() { return (String) _get(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public boolean isLayoutModeDirty() { return _contains(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public void resetLayoutMode() { _reset(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public PSAppPortalViewDTO layoutmode(String value) { setLayoutMode(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO layoutmode(PSModelEnums.LayoutMode value) {
        setLayoutMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("navbarheight")
    public void setNavBarHeight(Integer value) { _set(DTOFIELD_NAVBARHEIGHT, value); }
    @JsonIgnore public Integer getNavBarHeight() { return (Integer) _get(DTOFIELD_NAVBARHEIGHT); }
    @JsonIgnore public boolean isNavBarHeightDirty() { return _contains(DTOFIELD_NAVBARHEIGHT); }
    @JsonIgnore public void resetNavBarHeight() { _reset(DTOFIELD_NAVBARHEIGHT); }
    @JsonIgnore public PSAppPortalViewDTO navbarheight(Integer value) { setNavBarHeight(value); return this; }

    @JsonProperty("navbarpos")
    public void setNavBarPos(String value) { _set(DTOFIELD_NAVBARPOS, value); }
    @JsonIgnore public String getNavBarPos() { return (String) _get(DTOFIELD_NAVBARPOS); }
    @JsonIgnore public boolean isNavBarPosDirty() { return _contains(DTOFIELD_NAVBARPOS); }
    @JsonIgnore public void resetNavBarPos() { _reset(DTOFIELD_NAVBARPOS); }
    @JsonIgnore public PSAppPortalViewDTO navbarpos(String value) { setNavBarPos(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO navbarpos(PSModelEnums.NavBarPos value) {
        setNavBarPos(value == null ? null : value.value); return this;
    }

    @JsonProperty("navbarstyle")
    public void setNavBarStyle(String value) { _set(DTOFIELD_NAVBARSTYLE, value); }
    @JsonIgnore public String getNavBarStyle() { return (String) _get(DTOFIELD_NAVBARSTYLE); }
    @JsonIgnore public boolean isNavBarStyleDirty() { return _contains(DTOFIELD_NAVBARSTYLE); }
    @JsonIgnore public void resetNavBarStyle() { _reset(DTOFIELD_NAVBARSTYLE); }
    @JsonIgnore public PSAppPortalViewDTO navbarstyle(String value) { setNavBarStyle(value); return this; }
    @JsonIgnore public PSAppPortalViewDTO navbarstyle(PSModelEnums.CtrlDetailStyle value) {
        setNavBarStyle(value == null ? null : value.value); return this;
    }

    @JsonProperty("navbarwidth")
    public void setNavBarWidth(Integer value) { _set(DTOFIELD_NAVBARWIDTH, value); }
    @JsonIgnore public Integer getNavBarWidth() { return (Integer) _get(DTOFIELD_NAVBARWIDTH); }
    @JsonIgnore public boolean isNavBarWidthDirty() { return _contains(DTOFIELD_NAVBARWIDTH); }
    @JsonIgnore public void resetNavBarWidth() { _reset(DTOFIELD_NAVBARWIDTH); }
    @JsonIgnore public PSAppPortalViewDTO navbarwidth(Integer value) { setNavBarWidth(value); return this; }

    @JsonProperty("psappportalviewid")
    public void setPSAppPortalViewId(String value) {
        _set(DTOFIELD_PSAPPPORTALVIEWID, value);
        _set(DTOFIELD_PSAPPVIEWID, value);
    }
    @JsonIgnore public String getPSAppPortalViewId() { return (String) _get(DTOFIELD_PSAPPPORTALVIEWID); }
    @JsonIgnore public boolean isPSAppPortalViewIdDirty() { return _contains(DTOFIELD_PSAPPPORTALVIEWID); }
    @JsonIgnore public void resetPSAppPortalViewId() {
        _reset(DTOFIELD_PSAPPPORTALVIEWID);
        _reset(DTOFIELD_PSAPPVIEWID);
    }
    @JsonIgnore public PSAppPortalViewDTO psappportalviewid(String value) { setPSAppPortalViewId(value); return this; }
    @JsonProperty("psappportalviewname")
    public void setPSAppPortalViewName(String value) {
        _set(DTOFIELD_PSAPPPORTALVIEWNAME, value);
        _set(DTOFIELD_PSAPPVIEWNAME, value);
    }
    @JsonIgnore public String getPSAppPortalViewName() { return (String) _get(DTOFIELD_PSAPPPORTALVIEWNAME); }
    @JsonIgnore public boolean isPSAppPortalViewNameDirty() { return _contains(DTOFIELD_PSAPPPORTALVIEWNAME); }
    @JsonIgnore public void resetPSAppPortalViewName() {
        _reset(DTOFIELD_PSAPPPORTALVIEWNAME);
        _reset(DTOFIELD_PSAPPVIEWNAME);
    }
    @JsonIgnore public PSAppPortalViewDTO psappportalviewname(String value) { setPSAppPortalViewName(value); return this; }
    @Override @JsonIgnore public String getName() { return getPSAppPortalViewName(); }
    @Override @JsonIgnore public void setName(String value) { setPSAppPortalViewName(value); }
    @Override @JsonIgnore public PSAppPortalViewDTO name(String value) { setPSAppPortalViewName(value); return this; }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @Override @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public PSAppPortalViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @Override @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public PSAppPortalViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @Override @JsonIgnore public String getId() { return getPSAppPortalViewId(); }
    @Override @JsonIgnore public void setId(String value) { setPSAppPortalViewId(value); }
    @Override @JsonIgnore public PSAppPortalViewDTO id(String value) { setPSAppPortalViewId(value); return this; }

    /**
     * Portal parts are kept as raw lists because their centralstudio DTO is
     * intentionally outside this independent modeling-core package.
     */
    @JsonIgnore public List getPSAppPVParts() {
        Object value = _get(DTOFIELD_PSAPPPVPARTS);
        return value instanceof List ? (List) value : null;
    }
    @JsonProperty("psapppvparts")
    public void setPSAppPVParts(List value) { _set(DTOFIELD_PSAPPPVPARTS, value); }
    @JsonIgnore public List getPSAppPVPartsIf() {
        Object value = _get(DTOFIELD_PSAPPPVPARTS);
        if (!(value instanceof List)) {
            value = new ArrayList();
            _set(DTOFIELD_PSAPPPVPARTS, value);
        }
        return (List) value;
    }

    private static Integer flagValue(Boolean value) { return value == null ? null : (value ? 1 : 0); }
}