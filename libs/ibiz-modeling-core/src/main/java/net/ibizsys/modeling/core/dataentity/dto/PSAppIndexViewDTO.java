package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;

/**
 * Application index view DTO.
 */
public class PSAppIndexViewDTO extends PSAppViewDTO {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_APPICONPATH = "APPICONPATH";
    protected static final String DTOFIELD_APPICONPATH = "appiconpath";
    public static final String FIELD_APPICONPATH2 = "APPICONPATH2";
    protected static final String DTOFIELD_APPICONPATH2 = "appiconpath2";
    public static final String FIELD_APPSWITCHMODE = "APPSWITCHMODE";
    protected static final String DTOFIELD_APPSWITCHMODE = "appswitchmode";
    public static final String FIELD_BLANKMODE = "BLANKMODE";
    protected static final String DTOFIELD_BLANKMODE = "blankmode";
    public static final String FIELD_BOTTOMSIDEPSAPPMENUID = "BOTTOMSIDEPSAPPMENUID";
    protected static final String DTOFIELD_BOTTOMSIDEPSAPPMENUID = "bottomsidepsappmenuid";
    public static final String FIELD_BOTTOMSIDEPSAPPMENUNAME = "BOTTOMSIDEPSAPPMENUNAME";
    protected static final String DTOFIELD_BOTTOMSIDEPSAPPMENUNAME = "bottomsidepsappmenuname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTPAGE = "DEFAULTPAGE";
    protected static final String DTOFIELD_DEFAULTPAGE = "defaultpage";
    public static final String FIELD_DEFPSAPPVIEWID = "DEFPSAPPVIEWID";
    protected static final String DTOFIELD_DEFPSAPPVIEWID = "defpsappviewid";
    public static final String FIELD_DEFPSAPPVIEWNAME = "DEFPSAPPVIEWNAME";
    protected static final String DTOFIELD_DEFPSAPPVIEWNAME = "defpsappviewname";
    public static final String FIELD_ENABLECOUNTER = "ENABLECOUNTER";
    protected static final String DTOFIELD_ENABLECOUNTER = "enablecounter";
    public static final String FIELD_LEFTSIDEPSAPPMENUID = "LEFTSIDEPSAPPMENUID";
    protected static final String DTOFIELD_LEFTSIDEPSAPPMENUID = "leftsidepsappmenuid";
    public static final String FIELD_LEFTSIDEPSAPPMENUNAME = "LEFTSIDEPSAPPMENUNAME";
    protected static final String DTOFIELD_LEFTSIDEPSAPPMENUNAME = "leftsidepsappmenuname";
    public static final String FIELD_MAINMENUSIDE = "MAINMENUSIDE";
    protected static final String DTOFIELD_MAINMENUSIDE = "mainmenuside";
    public static final String FIELD_PSAPPINDEXVIEWID = "PSAPPINDEXVIEWID";
    protected static final String DTOFIELD_PSAPPINDEXVIEWID = "psappindexviewid";
    public static final String FIELD_PSAPPINDEXVIEWNAME = "PSAPPINDEXVIEWNAME";
    protected static final String DTOFIELD_PSAPPINDEXVIEWNAME = "psappindexviewname";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_RIGHTSIDEPSAPPMENUID = "RIGHTSIDEPSAPPMENUID";
    protected static final String DTOFIELD_RIGHTSIDEPSAPPMENUID = "rightsidepsappmenuid";
    public static final String FIELD_RIGHTSIDEPSAPPMENUNAME = "RIGHTSIDEPSAPPMENUNAME";
    protected static final String DTOFIELD_RIGHTSIDEPSAPPMENUNAME = "rightsidepsappmenuname";
    public static final String FIELD_TOPSIDEPSAPPMENUID = "TOPSIDEPSAPPMENUID";
    protected static final String DTOFIELD_TOPSIDEPSAPPMENUID = "topsidepsappmenuid";
    public static final String FIELD_TOPSIDEPSAPPMENUNAME = "TOPSIDEPSAPPMENUNAME";
    protected static final String DTOFIELD_TOPSIDEPSAPPMENUNAME = "topsidepsappmenuname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    public PSAppIndexViewDTO() { setPSAppViewType("APPINDEXVIEW"); }

    @JsonProperty("appiconpath")
    public void setAppIconPath(String value) { _set(DTOFIELD_APPICONPATH, value); }
    @JsonIgnore public String getAppIconPath() { return (String) _get(DTOFIELD_APPICONPATH); }
    @JsonIgnore public boolean isAppIconPathDirty() { return _contains(DTOFIELD_APPICONPATH); }
    @JsonIgnore public void resetAppIconPath() { _reset(DTOFIELD_APPICONPATH); }
    @JsonIgnore public PSAppIndexViewDTO appiconpath(String value) { setAppIconPath(value); return this; }

    @JsonProperty("appiconpath2")
    public void setAppIconPath2(String value) { _set(DTOFIELD_APPICONPATH2, value); }
    @JsonIgnore public String getAppIconPath2() { return (String) _get(DTOFIELD_APPICONPATH2); }
    @JsonIgnore public boolean isAppIconPath2Dirty() { return _contains(DTOFIELD_APPICONPATH2); }
    @JsonIgnore public void resetAppIconPath2() { _reset(DTOFIELD_APPICONPATH2); }
    @JsonIgnore public PSAppIndexViewDTO appiconpath2(String value) { setAppIconPath2(value); return this; }

    @JsonProperty("appswitchmode")
    public void setAppSwitchMode(Integer value) { _set(DTOFIELD_APPSWITCHMODE, value); }
    @JsonIgnore public Integer getAppSwitchMode() { return (Integer) _get(DTOFIELD_APPSWITCHMODE); }
    @JsonIgnore public boolean isAppSwitchModeDirty() { return _contains(DTOFIELD_APPSWITCHMODE); }
    @JsonIgnore public void resetAppSwitchMode() { _reset(DTOFIELD_APPSWITCHMODE); }
    @JsonIgnore public PSAppIndexViewDTO appswitchmode(Integer value) { setAppSwitchMode(value); return this; }
    @JsonIgnore public PSAppIndexViewDTO appswitchmode(PSModelEnums.AppSwitchMode value) {
        setAppSwitchMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("blankmode")
    public void setBlankMode(Integer value) { _set(DTOFIELD_BLANKMODE, value); }
    @JsonIgnore public Integer getBlankMode() { return (Integer) _get(DTOFIELD_BLANKMODE); }
    @JsonIgnore public boolean isBlankModeDirty() { return _contains(DTOFIELD_BLANKMODE); }
    @JsonIgnore public void resetBlankMode() { _reset(DTOFIELD_BLANKMODE); }
    @JsonIgnore public PSAppIndexViewDTO blankmode(Integer value) { setBlankMode(value); return this; }
    @JsonIgnore public PSAppIndexViewDTO blankmode(Boolean value) { setBlankMode(flagValue(value)); return this; }

    @JsonProperty("bottomsidepsappmenuid")
    public void setBottomSidePSAppMenuId(String value) { _set(DTOFIELD_BOTTOMSIDEPSAPPMENUID, value); }
    @JsonIgnore public String getBottomSidePSAppMenuId() { return (String) _get(DTOFIELD_BOTTOMSIDEPSAPPMENUID); }
    @JsonIgnore public boolean isBottomSidePSAppMenuIdDirty() { return _contains(DTOFIELD_BOTTOMSIDEPSAPPMENUID); }
    @JsonIgnore public void resetBottomSidePSAppMenuId() { _reset(DTOFIELD_BOTTOMSIDEPSAPPMENUID); }
    @JsonIgnore public PSAppIndexViewDTO bottomsidepsappmenuid(String value) { setBottomSidePSAppMenuId(value); return this; }
    @JsonProperty("bottomsidepsappmenuname")
    public void setBottomSidePSAppMenuName(String value) { _set(DTOFIELD_BOTTOMSIDEPSAPPMENUNAME, value); }
    @JsonIgnore public String getBottomSidePSAppMenuName() { return (String) _get(DTOFIELD_BOTTOMSIDEPSAPPMENUNAME); }
    @JsonIgnore public boolean isBottomSidePSAppMenuNameDirty() { return _contains(DTOFIELD_BOTTOMSIDEPSAPPMENUNAME); }
    @JsonIgnore public void resetBottomSidePSAppMenuName() { _reset(DTOFIELD_BOTTOMSIDEPSAPPMENUNAME); }
    @JsonIgnore public PSAppIndexViewDTO bottomsidepsappmenuname(String value) { setBottomSidePSAppMenuName(value); return this; }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @Override @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @Override @JsonIgnore public PSAppIndexViewDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @Override @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @Override @JsonIgnore public PSAppIndexViewDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("defaultpage")
    public void setDefaultPage(Integer value) { _set(DTOFIELD_DEFAULTPAGE, value); }
    @JsonIgnore public Integer getDefaultPage() { return (Integer) _get(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public boolean isDefaultPageDirty() { return _contains(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public void resetDefaultPage() { _reset(DTOFIELD_DEFAULTPAGE); }
    @JsonIgnore public PSAppIndexViewDTO defaultpage(Integer value) { setDefaultPage(value); return this; }
    @JsonIgnore public PSAppIndexViewDTO defaultpage(Boolean value) { setDefaultPage(flagValue(value)); return this; }

    @JsonProperty("defpsappviewid")
    public void setDefPSAppViewId(String value) { _set(DTOFIELD_DEFPSAPPVIEWID, value); }
    @JsonIgnore public String getDefPSAppViewId() { return (String) _get(DTOFIELD_DEFPSAPPVIEWID); }
    @JsonIgnore public boolean isDefPSAppViewIdDirty() { return _contains(DTOFIELD_DEFPSAPPVIEWID); }
    @JsonIgnore public void resetDefPSAppViewId() { _reset(DTOFIELD_DEFPSAPPVIEWID); }
    @JsonIgnore public PSAppIndexViewDTO defpsappviewid(String value) { setDefPSAppViewId(value); return this; }
    @JsonProperty("defpsappviewname")
    public void setDefPSAppViewName(String value) { _set(DTOFIELD_DEFPSAPPVIEWNAME, value); }
    @JsonIgnore public String getDefPSAppViewName() { return (String) _get(DTOFIELD_DEFPSAPPVIEWNAME); }
    @JsonIgnore public boolean isDefPSAppViewNameDirty() { return _contains(DTOFIELD_DEFPSAPPVIEWNAME); }
    @JsonIgnore public void resetDefPSAppViewName() { _reset(DTOFIELD_DEFPSAPPVIEWNAME); }
    @JsonIgnore public PSAppIndexViewDTO defpsappviewname(String value) { setDefPSAppViewName(value); return this; }

    @JsonProperty("enablecounter")
    public void setEnableCounter(Integer value) { _set(DTOFIELD_ENABLECOUNTER, value); }
    @JsonIgnore public Integer getEnableCounter() { return (Integer) _get(DTOFIELD_ENABLECOUNTER); }
    @JsonIgnore public boolean isEnableCounterDirty() { return _contains(DTOFIELD_ENABLECOUNTER); }
    @JsonIgnore public void resetEnableCounter() { _reset(DTOFIELD_ENABLECOUNTER); }
    @JsonIgnore public PSAppIndexViewDTO enablecounter(Integer value) { setEnableCounter(value); return this; }
    @JsonIgnore public PSAppIndexViewDTO enablecounter(Boolean value) { setEnableCounter(flagValue(value)); return this; }

    @JsonProperty("leftsidepsappmenuid")
    public void setLeftSidePSAppMenuId(String value) { _set(DTOFIELD_LEFTSIDEPSAPPMENUID, value); }
    @JsonIgnore public String getLeftSidePSAppMenuId() { return (String) _get(DTOFIELD_LEFTSIDEPSAPPMENUID); }
    @JsonIgnore public boolean isLeftSidePSAppMenuIdDirty() { return _contains(DTOFIELD_LEFTSIDEPSAPPMENUID); }
    @JsonIgnore public void resetLeftSidePSAppMenuId() { _reset(DTOFIELD_LEFTSIDEPSAPPMENUID); }
    @JsonIgnore public PSAppIndexViewDTO leftsidepsappmenuid(String value) { setLeftSidePSAppMenuId(value); return this; }
    @JsonProperty("leftsidepsappmenuname")
    public void setLeftSidePSAppMenuName(String value) { _set(DTOFIELD_LEFTSIDEPSAPPMENUNAME, value); }
    @JsonIgnore public String getLeftSidePSAppMenuName() { return (String) _get(DTOFIELD_LEFTSIDEPSAPPMENUNAME); }
    @JsonIgnore public boolean isLeftSidePSAppMenuNameDirty() { return _contains(DTOFIELD_LEFTSIDEPSAPPMENUNAME); }
    @JsonIgnore public void resetLeftSidePSAppMenuName() { _reset(DTOFIELD_LEFTSIDEPSAPPMENUNAME); }
    @JsonIgnore public PSAppIndexViewDTO leftsidepsappmenuname(String value) { setLeftSidePSAppMenuName(value); return this; }

    @JsonProperty("mainmenuside")
    public void setMainMenuSide(String value) { _set(DTOFIELD_MAINMENUSIDE, value); }
    @JsonIgnore public String getMainMenuSide() { return (String) _get(DTOFIELD_MAINMENUSIDE); }
    @JsonIgnore public boolean isMainMenuSideDirty() { return _contains(DTOFIELD_MAINMENUSIDE); }
    @JsonIgnore public void resetMainMenuSide() { _reset(DTOFIELD_MAINMENUSIDE); }
    @JsonIgnore public PSAppIndexViewDTO mainmenuside(String value) { setMainMenuSide(value); return this; }
    @JsonIgnore public PSAppIndexViewDTO mainmenuside(PSModelEnums.AppIndexViewMenuAlign value) {
        setMainMenuSide(value == null ? null : value.value); return this;
    }

    @JsonProperty("psappindexviewid")
    public void setPSAppIndexViewId(String value) {
        _set(DTOFIELD_PSAPPINDEXVIEWID, value);
        _set(DTOFIELD_PSAPPVIEWID, value);
    }
    @JsonIgnore public String getPSAppIndexViewId() { return (String) _get(DTOFIELD_PSAPPINDEXVIEWID); }
    @JsonIgnore public boolean isPSAppIndexViewIdDirty() { return _contains(DTOFIELD_PSAPPINDEXVIEWID); }
    @JsonIgnore public void resetPSAppIndexViewId() {
        _reset(DTOFIELD_PSAPPINDEXVIEWID);
        _reset(DTOFIELD_PSAPPVIEWID);
    }
    @JsonIgnore public PSAppIndexViewDTO psappindexviewid(String value) { setPSAppIndexViewId(value); return this; }
    @JsonProperty("psappindexviewname")
    public void setPSAppIndexViewName(String value) {
        _set(DTOFIELD_PSAPPINDEXVIEWNAME, value);
        _set(DTOFIELD_PSAPPVIEWNAME, value);
    }
    @JsonIgnore public String getPSAppIndexViewName() { return (String) _get(DTOFIELD_PSAPPINDEXVIEWNAME); }
    @JsonIgnore public boolean isPSAppIndexViewNameDirty() { return _contains(DTOFIELD_PSAPPINDEXVIEWNAME); }
    @JsonIgnore public void resetPSAppIndexViewName() {
        _reset(DTOFIELD_PSAPPINDEXVIEWNAME);
        _reset(DTOFIELD_PSAPPVIEWNAME);
    }
    @JsonIgnore public PSAppIndexViewDTO psappindexviewname(String value) { setPSAppIndexViewName(value); return this; }
    @Override @JsonIgnore public String getName() { return getPSAppIndexViewName(); }
    @Override @JsonIgnore public void setName(String value) { setPSAppIndexViewName(value); }
    @Override @JsonIgnore public PSAppIndexViewDTO name(String value) { setPSAppIndexViewName(value); return this; }

    @JsonProperty("psappmenuid")
    public void setPSAppMenuId(String value) { _set(DTOFIELD_PSAPPMENUID, value); }
    @JsonIgnore public String getPSAppMenuId() { return (String) _get(DTOFIELD_PSAPPMENUID); }
    @JsonIgnore public boolean isPSAppMenuIdDirty() { return _contains(DTOFIELD_PSAPPMENUID); }
    @JsonIgnore public void resetPSAppMenuId() { _reset(DTOFIELD_PSAPPMENUID); }
    @JsonIgnore public PSAppIndexViewDTO psappmenuid(String value) { setPSAppMenuId(value); return this; }
    @JsonProperty("psappmenuname")
    public void setPSAppMenuName(String value) { _set(DTOFIELD_PSAPPMENUNAME, value); }
    @JsonIgnore public String getPSAppMenuName() { return (String) _get(DTOFIELD_PSAPPMENUNAME); }
    @JsonIgnore public boolean isPSAppMenuNameDirty() { return _contains(DTOFIELD_PSAPPMENUNAME); }
    @JsonIgnore public void resetPSAppMenuName() { _reset(DTOFIELD_PSAPPMENUNAME); }
    @JsonIgnore public PSAppIndexViewDTO psappmenuname(String value) { setPSAppMenuName(value); return this; }

    @JsonProperty("pssyscounterid")
    public void setPSSysCounterId(String value) { _set(DTOFIELD_PSSYSCOUNTERID, value); }
    @JsonIgnore public String getPSSysCounterId() { return (String) _get(DTOFIELD_PSSYSCOUNTERID); }
    @JsonIgnore public boolean isPSSysCounterIdDirty() { return _contains(DTOFIELD_PSSYSCOUNTERID); }
    @JsonIgnore public void resetPSSysCounterId() { _reset(DTOFIELD_PSSYSCOUNTERID); }
    @JsonIgnore public PSAppIndexViewDTO pssyscounterid(String value) { setPSSysCounterId(value); return this; }
    @JsonProperty("pssyscountername")
    public void setPSSysCounterName(String value) { _set(DTOFIELD_PSSYSCOUNTERNAME, value); }
    @JsonIgnore public String getPSSysCounterName() { return (String) _get(DTOFIELD_PSSYSCOUNTERNAME); }
    @JsonIgnore public boolean isPSSysCounterNameDirty() { return _contains(DTOFIELD_PSSYSCOUNTERNAME); }
    @JsonIgnore public void resetPSSysCounterName() { _reset(DTOFIELD_PSSYSCOUNTERNAME); }
    @JsonIgnore public PSAppIndexViewDTO pssyscountername(String value) { setPSSysCounterName(value); return this; }

    @JsonProperty("rightsidepsappmenuid")
    public void setRightSidePSAppMenuId(String value) { _set(DTOFIELD_RIGHTSIDEPSAPPMENUID, value); }
    @JsonIgnore public String getRightSidePSAppMenuId() { return (String) _get(DTOFIELD_RIGHTSIDEPSAPPMENUID); }
    @JsonIgnore public boolean isRightSidePSAppMenuIdDirty() { return _contains(DTOFIELD_RIGHTSIDEPSAPPMENUID); }
    @JsonIgnore public void resetRightSidePSAppMenuId() { _reset(DTOFIELD_RIGHTSIDEPSAPPMENUID); }
    @JsonIgnore public PSAppIndexViewDTO rightsidepsappmenuid(String value) { setRightSidePSAppMenuId(value); return this; }
    @JsonProperty("rightsidepsappmenuname")
    public void setRightSidePSAppMenuName(String value) { _set(DTOFIELD_RIGHTSIDEPSAPPMENUNAME, value); }
    @JsonIgnore public String getRightSidePSAppMenuName() { return (String) _get(DTOFIELD_RIGHTSIDEPSAPPMENUNAME); }
    @JsonIgnore public boolean isRightSidePSAppMenuNameDirty() { return _contains(DTOFIELD_RIGHTSIDEPSAPPMENUNAME); }
    @JsonIgnore public void resetRightSidePSAppMenuName() { _reset(DTOFIELD_RIGHTSIDEPSAPPMENUNAME); }
    @JsonIgnore public PSAppIndexViewDTO rightsidepsappmenuname(String value) { setRightSidePSAppMenuName(value); return this; }

    @JsonProperty("topsidepsappmenuid")
    public void setTopSidePSAppMenuId(String value) { _set(DTOFIELD_TOPSIDEPSAPPMENUID, value); }
    @JsonIgnore public String getTopSidePSAppMenuId() { return (String) _get(DTOFIELD_TOPSIDEPSAPPMENUID); }
    @JsonIgnore public boolean isTopSidePSAppMenuIdDirty() { return _contains(DTOFIELD_TOPSIDEPSAPPMENUID); }
    @JsonIgnore public void resetTopSidePSAppMenuId() { _reset(DTOFIELD_TOPSIDEPSAPPMENUID); }
    @JsonIgnore public PSAppIndexViewDTO topsidepsappmenuid(String value) { setTopSidePSAppMenuId(value); return this; }
    @JsonProperty("topsidepsappmenuname")
    public void setTopSidePSAppMenuName(String value) { _set(DTOFIELD_TOPSIDEPSAPPMENUNAME, value); }
    @JsonIgnore public String getTopSidePSAppMenuName() { return (String) _get(DTOFIELD_TOPSIDEPSAPPMENUNAME); }
    @JsonIgnore public boolean isTopSidePSAppMenuNameDirty() { return _contains(DTOFIELD_TOPSIDEPSAPPMENUNAME); }
    @JsonIgnore public void resetTopSidePSAppMenuName() { _reset(DTOFIELD_TOPSIDEPSAPPMENUNAME); }
    @JsonIgnore public PSAppIndexViewDTO topsidepsappmenuname(String value) { setTopSidePSAppMenuName(value); return this; }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @Override @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @Override @JsonIgnore public PSAppIndexViewDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @Override @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @Override @JsonIgnore public PSAppIndexViewDTO updateman(String value) { setUpdateMan(value); return this; }

    @Override @JsonIgnore public String getId() { return getPSAppIndexViewId(); }
    @Override @JsonIgnore public void setId(String value) { setPSAppIndexViewId(value); }
    @Override @JsonIgnore public PSAppIndexViewDTO id(String value) { setPSAppIndexViewId(value); return this; }

    private static Integer flagValue(Boolean value) { return value == null ? null : (value ? 1 : 0); }
}