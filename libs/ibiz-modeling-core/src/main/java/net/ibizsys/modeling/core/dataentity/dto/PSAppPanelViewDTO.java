package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;

/**
 * Application panel view DTO.
 */
public class PSAppPanelViewDTO extends PSAppViewDTO {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_NAVBARPSSYSCSSID = "NAVBARPSSYSCSSID";
    protected static final String DTOFIELD_NAVBARPSSYSCSSID = "navbarpssyscssid";
    public static final String FIELD_NAVBARPSSYSCSSNAME = "NAVBARPSSYSCSSNAME";
    protected static final String DTOFIELD_NAVBARPSSYSCSSNAME = "navbarpssyscssname";
    public static final String FIELD_PANELSTYLE = "PANELSTYLE";
    protected static final String DTOFIELD_PANELSTYLE = "panelstyle";
    public static final String FIELD_PANELWIDTH = "PANELWIDTH";
    protected static final String DTOFIELD_PANELWIDTH = "panelwidth";
    public static final String FIELD_PSAPPPANELVIEWID = "PSAPPPANELVIEWID";
    protected static final String DTOFIELD_PSAPPPANELVIEWID = "psapppanelviewid";
    public static final String FIELD_PSAPPPANELVIEWNAME = "PSAPPPANELVIEWNAME";
    protected static final String DTOFIELD_PSAPPPANELVIEWNAME = "psapppanelviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    public PSAppPanelViewDTO() { setPSAppViewType("APPPANELVIEW"); }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @Override @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public PSAppPanelViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @Override @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public PSAppPanelViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("layoutmode")
    public void setLayoutMode(String value) { _set(DTOFIELD_LAYOUTMODE, value); }
    @JsonIgnore public String getLayoutMode() { return (String) _get(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public boolean isLayoutModeDirty() { return _contains(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public void resetLayoutMode() { _reset(DTOFIELD_LAYOUTMODE); }
    @JsonIgnore public PSAppPanelViewDTO layoutmode(String value) { setLayoutMode(value); return this; }
    @JsonIgnore public PSAppPanelViewDTO layoutmode(PSModelEnums.LayoutMode value) {
        setLayoutMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("navbarpssyscssid")
    public void setNavBarPSSysCssId(String value) { _set(DTOFIELD_NAVBARPSSYSCSSID, value); }
    @JsonIgnore public String getNavBarPSSysCssId() { return (String) _get(DTOFIELD_NAVBARPSSYSCSSID); }
    @JsonIgnore public boolean isNavBarPSSysCssIdDirty() { return _contains(DTOFIELD_NAVBARPSSYSCSSID); }
    @JsonIgnore public void resetNavBarPSSysCssId() { _reset(DTOFIELD_NAVBARPSSYSCSSID); }
    @JsonIgnore public PSAppPanelViewDTO navbarpssyscssid(String value) { setNavBarPSSysCssId(value); return this; }
    @JsonProperty("navbarpssyscssname")
    public void setNavBarPSSysCssName(String value) { _set(DTOFIELD_NAVBARPSSYSCSSNAME, value); }
    @JsonIgnore public String getNavBarPSSysCssName() { return (String) _get(DTOFIELD_NAVBARPSSYSCSSNAME); }
    @JsonIgnore public boolean isNavBarPSSysCssNameDirty() { return _contains(DTOFIELD_NAVBARPSSYSCSSNAME); }
    @JsonIgnore public void resetNavBarPSSysCssName() { _reset(DTOFIELD_NAVBARPSSYSCSSNAME); }
    @JsonIgnore public PSAppPanelViewDTO navbarpssyscssname(String value) { setNavBarPSSysCssName(value); return this; }

    @JsonProperty("panelstyle")
    public void setPanelStyle(String value) { _set(DTOFIELD_PANELSTYLE, value); }
    @JsonIgnore public String getPanelStyle() { return (String) _get(DTOFIELD_PANELSTYLE); }
    @JsonIgnore public boolean isPanelStyleDirty() { return _contains(DTOFIELD_PANELSTYLE); }
    @JsonIgnore public void resetPanelStyle() { _reset(DTOFIELD_PANELSTYLE); }
    @JsonIgnore public PSAppPanelViewDTO panelstyle(String value) { setPanelStyle(value); return this; }

    @JsonProperty("panelwidth")
    public void setPanelWidth(Integer value) { _set(DTOFIELD_PANELWIDTH, value); }
    @JsonIgnore public Integer getPanelWidth() { return (Integer) _get(DTOFIELD_PANELWIDTH); }
    @JsonIgnore public boolean isPanelWidthDirty() { return _contains(DTOFIELD_PANELWIDTH); }
    @JsonIgnore public void resetPanelWidth() { _reset(DTOFIELD_PANELWIDTH); }
    @JsonIgnore public PSAppPanelViewDTO panelwidth(Integer value) { setPanelWidth(value); return this; }

    @JsonProperty("psapppanelviewid")
    public void setPSAppPanelViewId(String value) {
        _set(DTOFIELD_PSAPPPANELVIEWID, value);
        _set(DTOFIELD_PSAPPVIEWID, value);
    }
    @JsonIgnore public String getPSAppPanelViewId() { return (String) _get(DTOFIELD_PSAPPPANELVIEWID); }
    @JsonIgnore public boolean isPSAppPanelViewIdDirty() { return _contains(DTOFIELD_PSAPPPANELVIEWID); }
    @JsonIgnore public void resetPSAppPanelViewId() {
        _reset(DTOFIELD_PSAPPPANELVIEWID);
        _reset(DTOFIELD_PSAPPVIEWID);
    }
    @JsonIgnore public PSAppPanelViewDTO psapppanelviewid(String value) { setPSAppPanelViewId(value); return this; }

    @JsonProperty("psapppanelviewname")
    public void setPSAppPanelViewName(String value) {
        _set(DTOFIELD_PSAPPPANELVIEWNAME, value);
        _set(DTOFIELD_PSAPPVIEWNAME, value);
    }
    @JsonIgnore public String getPSAppPanelViewName() { return (String) _get(DTOFIELD_PSAPPPANELVIEWNAME); }
    @JsonIgnore public boolean isPSAppPanelViewNameDirty() { return _contains(DTOFIELD_PSAPPPANELVIEWNAME); }
    @JsonIgnore public void resetPSAppPanelViewName() {
        _reset(DTOFIELD_PSAPPPANELVIEWNAME);
        _reset(DTOFIELD_PSAPPVIEWNAME);
    }
    @JsonIgnore public PSAppPanelViewDTO psapppanelviewname(String value) { setPSAppPanelViewName(value); return this; }

    @Override @JsonIgnore public String getName() { return getPSAppPanelViewName(); }
    @Override @JsonIgnore public void setName(String value) { setPSAppPanelViewName(value); }
    @Override @JsonIgnore public PSAppPanelViewDTO name(String value) { setPSAppPanelViewName(value); return this; }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @Override @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public PSAppPanelViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @Override @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public PSAppPanelViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @Override @JsonIgnore public String getId() { return getPSAppPanelViewId(); }
    @Override @JsonIgnore public void setId(String value) { setPSAppPanelViewId(value); }
    @Override @JsonIgnore public PSAppPanelViewDTO id(String value) { setPSAppPanelViewId(value); return this; }
}