package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Common application view DTO.
 *
 * <p>The original model exposes both JSON setters and fluent lower-case
 * methods. Keeping both here preserves the model import contract while the
 * implementation remains independent of centralstudio DTOs.</p>
 */
public class PSAppViewDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_ACCUSERMODE = "ACCUSERMODE";
    protected static final String DTOFIELD_ACCUSERMODE = "accusermode";
    public static final String FIELD_APPVIEWSN = "APPVIEWSN";
    protected static final String DTOFIELD_APPVIEWSN = "appviewsn";
    public static final String FIELD_APPVIEWSTATE = "APPVIEWSTATE";
    protected static final String DTOFIELD_APPVIEWSTATE = "appviewstate";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DYNCMODE = "DYNCMODE";
    protected static final String DTOFIELD_DYNCMODE = "dyncmode";
    public static final String FIELD_ENABLEVIEWSTYLE = "ENABLEVIEWSTYLE";
    protected static final String DTOFIELD_ENABLEVIEWSTYLE = "enableviewstyle";
    public static final String FIELD_LAYOUTPANELMODE = "LAYOUTPANELMODE";
    protected static final String DTOFIELD_LAYOUTPANELMODE = "layoutpanelmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSAPPMODULEID = "PSAPPMODULEID";
    protected static final String DTOFIELD_PSAPPMODULEID = "psappmoduleid";
    public static final String FIELD_PSAPPMODULENAME = "PSAPPMODULENAME";
    protected static final String DTOFIELD_PSAPPMODULENAME = "psappmodulename";
    public static final String FIELD_PSAPPTITLEBARID = "PSAPPTITLEBARID";
    protected static final String DTOFIELD_PSAPPTITLEBARID = "psapptitlebarid";
    public static final String FIELD_PSAPPTITLEBARNAME = "PSAPPTITLEBARNAME";
    protected static final String DTOFIELD_PSAPPTITLEBARNAME = "psapptitlebarname";
    public static final String FIELD_PSAPPUTILVIEWTYPE = "PSAPPUTILVIEWTYPE";
    protected static final String DTOFIELD_PSAPPUTILVIEWTYPE = "psapputilviewtype";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSAPPVIEWTYPE = "PSAPPVIEWTYPE";
    protected static final String DTOFIELD_PSAPPVIEWTYPE = "psappviewtype";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSDEVIEWTYPE = "PSDEVIEWTYPE";
    protected static final String DTOFIELD_PSDEVIEWTYPE = "psdeviewtype";
    public static final String FIELD_PSDYNADEVIEWTEMPLID = "PSDYNADEVIEWTEMPLID";
    protected static final String DTOFIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";
    public static final String FIELD_PSDYNADEVIEWTEMPLNAME = "PSDYNADEVIEWTEMPLNAME";
    protected static final String DTOFIELD_PSDYNADEVIEWTEMPLNAME = "psdynadeviewtemplname";
    public static final String FIELD_PSDYNADEVIEWTYPE = "PSDYNADEVIEWTYPE";
    protected static final String DTOFIELD_PSDYNADEVIEWTYPE = "psdynadeviewtype";
    public static final String FIELD_PSHELPMODULEID = "PSHELPMODULEID";
    protected static final String DTOFIELD_PSHELPMODULEID = "pshelpmoduleid";
    public static final String FIELD_PSHELPMODULENAME = "PSHELPMODULENAME";
    protected static final String DTOFIELD_PSHELPMODULENAME = "pshelpmodulename";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSSUBVIEWTYPEID = "PSSUBVIEWTYPEID";
    protected static final String DTOFIELD_PSSUBVIEWTYPEID = "pssubviewtypeid";
    public static final String FIELD_PSSUBVIEWTYPENAME = "PSSUBVIEWTYPENAME";
    protected static final String DTOFIELD_PSSUBVIEWTYPENAME = "pssubviewtypename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_SUBCAPPSLANRESID = "SUBCAPPSLANRESID";
    protected static final String DTOFIELD_SUBCAPPSLANRESID = "subcappslanresid";
    public static final String FIELD_SUBCAPPSLANRESNAME = "SUBCAPPSLANRESNAME";
    protected static final String DTOFIELD_SUBCAPPSLANRESNAME = "subcappslanresname";
    public static final String FIELD_SUBCAPTION = "SUBCAPTION";
    protected static final String DTOFIELD_SUBCAPTION = "subcaption";
    public static final String FIELD_SYNCCODENAME = "SYNCCODENAME";
    protected static final String DTOFIELD_SYNCCODENAME = "synccodename";
    public static final String FIELD_TITLE = "TITLE";
    protected static final String DTOFIELD_TITLE = "title";
    public static final String FIELD_TITLEPSLANRESID = "TITLEPSLANRESID";
    protected static final String DTOFIELD_TITLEPSLANRESID = "titlepslanresid";
    public static final String FIELD_TITLEPSLANRESNAME = "TITLEPSLANRESNAME";
    protected static final String DTOFIELD_TITLEPSLANRESNAME = "titlepslanresname";
    public static final String FIELD_UISTYLE = "UISTYLE";
    protected static final String DTOFIELD_UISTYLE = "uistyle";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERREFFLAG = "USERREFFLAG";
    protected static final String DTOFIELD_USERREFFLAG = "userrefflag";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    protected final void setValue(String field, Object value) { _set(field, value); }
    protected final Object getValue(String field) { return _get(field); }
    protected final boolean dirty(String field) { return _contains(field); }
    protected final void resetValue(String field) { _reset(field); }
    protected final String stringValue(String field) { return (String) _get(field); }
    protected final Integer integerValue(String field) { return (Integer) _get(field); }
    protected final Timestamp timestampValue(String field) { return (Timestamp) _get(field); }
    protected final Integer boolValue(Boolean value) { return value == null ? null : value ? 1 : 0; }

    @JsonProperty("accusermode") public void setAccUserMode(String v) { setValue(DTOFIELD_ACCUSERMODE, v); }
    @JsonIgnore public String getAccUserMode() { return stringValue(DTOFIELD_ACCUSERMODE); }
    @JsonIgnore public boolean isAccUserModeDirty() { return dirty(DTOFIELD_ACCUSERMODE); }
    @JsonIgnore public void resetAccUserMode() { resetValue(DTOFIELD_ACCUSERMODE); }
    @JsonIgnore public PSAppViewDTO accusermode(String v) { setAccUserMode(v); return this; }
    @JsonIgnore public PSAppViewDTO accusermode(PSModelEnums.AccessUserMode v) { return accusermode(v == null ? null : v.value); }

    @JsonProperty("appviewsn") public void setAppViewSN(String v) { setValue(DTOFIELD_APPVIEWSN, v); }
    @JsonIgnore public String getAppViewSN() { return stringValue(DTOFIELD_APPVIEWSN); }
    @JsonIgnore public boolean isAppViewSNDirty() { return dirty(DTOFIELD_APPVIEWSN); }
    @JsonIgnore public void resetAppViewSN() { resetValue(DTOFIELD_APPVIEWSN); }
    @JsonIgnore public PSAppViewDTO appviewsn(String v) { setAppViewSN(v); return this; }

    @JsonProperty("appviewstate") public void setAppViewState(Integer v) { setValue(DTOFIELD_APPVIEWSTATE, v); }
    @JsonIgnore public Integer getAppViewState() { return integerValue(DTOFIELD_APPVIEWSTATE); }
    @JsonIgnore public boolean isAppViewStateDirty() { return dirty(DTOFIELD_APPVIEWSTATE); }
    @JsonIgnore public void resetAppViewState() { resetValue(DTOFIELD_APPVIEWSTATE); }
    @JsonIgnore public PSAppViewDTO appviewstate(Integer v) { setAppViewState(v); return this; }

    @JsonProperty("cappslanresid") public void setCapPSLanResId(String v) { setValue(DTOFIELD_CAPPSLANRESID, v); }
    @JsonIgnore public String getCapPSLanResId() { return stringValue(DTOFIELD_CAPPSLANRESID); }
    @JsonIgnore public boolean isCapPSLanResIdDirty() { return dirty(DTOFIELD_CAPPSLANRESID); }
    @JsonIgnore public void resetCapPSLanResId() { resetValue(DTOFIELD_CAPPSLANRESID); }
    @JsonIgnore public PSAppViewDTO cappslanresid(String v) { setCapPSLanResId(v); return this; }
    @JsonIgnore public PSAppViewDTO cappslanresid(PSLanguageResDTO v) { return cappslanresid(v == null ? null : v.getPSLanguageResId()); }
    @JsonProperty("cappslanresname") public void setCapPSLanResName(String v) { setValue(DTOFIELD_CAPPSLANRESNAME, v); }
    @JsonIgnore public String getCapPSLanResName() { return stringValue(DTOFIELD_CAPPSLANRESNAME); }
    @JsonIgnore public boolean isCapPSLanResNameDirty() { return dirty(DTOFIELD_CAPPSLANRESNAME); }
    @JsonIgnore public void resetCapPSLanResName() { resetValue(DTOFIELD_CAPPSLANRESNAME); }
    @JsonIgnore public PSAppViewDTO cappslanresname(String v) { setCapPSLanResName(v); return this; }

    @JsonProperty("caption") public void setCaption(String v) { setValue(DTOFIELD_CAPTION, v); }
    @JsonIgnore public String getCaption() { return stringValue(DTOFIELD_CAPTION); }
    @JsonIgnore public boolean isCaptionDirty() { return dirty(DTOFIELD_CAPTION); }
    @JsonIgnore public void resetCaption() { resetValue(DTOFIELD_CAPTION); }
    @JsonIgnore public PSAppViewDTO caption(String v) { setCaption(v); return this; }
    @JsonProperty("color") public void setColor(String v) { setValue(DTOFIELD_COLOR, v); }
    @JsonIgnore public String getColor() { return stringValue(DTOFIELD_COLOR); }
    @JsonIgnore public boolean isColorDirty() { return dirty(DTOFIELD_COLOR); }
    @JsonIgnore public void resetColor() { resetValue(DTOFIELD_COLOR); }
    @JsonIgnore public PSAppViewDTO color(String v) { setColor(v); return this; }

    @JsonProperty("createdate") @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp v) { setValue(DTOFIELD_CREATEDATE, v); }
    @JsonIgnore public Timestamp getCreateDate() { return timestampValue(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return dirty(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { resetValue(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSAppViewDTO createdate(Timestamp v) { setCreateDate(v); return this; }
    @JsonProperty("createman") public void setCreateMan(String v) { setValue(DTOFIELD_CREATEMAN, v); }
    @JsonIgnore public String getCreateMan() { return stringValue(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return dirty(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { resetValue(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppViewDTO createman(String v) { setCreateMan(v); return this; }

    @JsonProperty("dyncmode") public void setDyncMode(Integer v) { setValue(DTOFIELD_DYNCMODE, v); }
    @JsonIgnore public Integer getDyncMode() { return integerValue(DTOFIELD_DYNCMODE); }
    @JsonIgnore public boolean isDyncModeDirty() { return dirty(DTOFIELD_DYNCMODE); }
    @JsonIgnore public void resetDyncMode() { resetValue(DTOFIELD_DYNCMODE); }
    @JsonIgnore public PSAppViewDTO dyncmode(Integer v) { setDyncMode(v); return this; }
    @JsonIgnore public PSAppViewDTO dyncmode(PSModelEnums.AppViewPriority v) { return dyncmode(v == null ? null : v.value); }

    @JsonProperty("enableviewstyle") public void setEnableViewStyle(Integer v) { setValue(DTOFIELD_ENABLEVIEWSTYLE, v); }
    @JsonIgnore public Integer getEnableViewStyle() { return integerValue(DTOFIELD_ENABLEVIEWSTYLE); }
    @JsonIgnore public boolean isEnableViewStyleDirty() { return dirty(DTOFIELD_ENABLEVIEWSTYLE); }
    @JsonIgnore public void resetEnableViewStyle() { resetValue(DTOFIELD_ENABLEVIEWSTYLE); }
    @JsonIgnore public PSAppViewDTO enableviewstyle(Integer v) { setEnableViewStyle(v); return this; }
    @JsonIgnore public PSAppViewDTO enableviewstyle(Boolean v) { return enableviewstyle(boolValue(v)); }
    @JsonProperty("layoutpanelmode") public void setLayoutPanelMode(Integer v) { setValue(DTOFIELD_LAYOUTPANELMODE, v); }
    @JsonIgnore public Integer getLayoutPanelMode() { return integerValue(DTOFIELD_LAYOUTPANELMODE); }
    @JsonIgnore public boolean isLayoutPanelModeDirty() { return dirty(DTOFIELD_LAYOUTPANELMODE); }
    @JsonIgnore public void resetLayoutPanelMode() { resetValue(DTOFIELD_LAYOUTPANELMODE); }
    @JsonIgnore public PSAppViewDTO layoutpanelmode(Integer v) { setLayoutPanelMode(v); return this; }
    @JsonIgnore public PSAppViewDTO layoutpanelmode(PSModelEnums.LayoutPanelMode v) { return layoutpanelmode(v == null ? null : v.value); }

    @JsonProperty("memo") public void setMemo(String v) { setValue(DTOFIELD_MEMO, v); }
    @JsonIgnore public String getMemo() { return stringValue(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return dirty(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { resetValue(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppViewDTO memo(String v) { setMemo(v); return this; }
    @JsonProperty("modcolor") public void setModColor(String v) { setValue(DTOFIELD_MODCOLOR, v); }
    @JsonIgnore public String getModColor() { return stringValue(DTOFIELD_MODCOLOR); }
    @JsonIgnore public boolean isModColorDirty() { return dirty(DTOFIELD_MODCOLOR); }
    @JsonIgnore public void resetModColor() { resetValue(DTOFIELD_MODCOLOR); }
    @JsonIgnore public PSAppViewDTO modcolor(String v) { setModColor(v); return this; }

    private PSAppViewDTO related(String idField, String nameField, String id, String name) {
        setValue(idField, id);
        setValue(nameField, name);
        return this;
    }
    private String relatedId(String field, String legacyField) {
        Object value = getValue(field);
        return value == null && legacyField != null ? (String) getValue(legacyField) : (String) value;
    }
    private boolean relatedDirty(String field, String legacyField) { return dirty(field) || legacyField != null && dirty(legacyField); }
    private void resetRelated(String field, String legacyField) { resetValue(field); if (legacyField != null) resetValue(legacyField); }

    @JsonProperty("psachandlerid") public void setPSACHandlerId(String v) { setValue(DTOFIELD_PSACHANDLERID, v); }
    @JsonIgnore public String getPSACHandlerId() { return stringValue(DTOFIELD_PSACHANDLERID); }
    @JsonIgnore public boolean isPSACHandlerIdDirty() { return dirty(DTOFIELD_PSACHANDLERID); }
    @JsonIgnore public void resetPSACHandlerId() { resetValue(DTOFIELD_PSACHANDLERID); }
    @JsonIgnore public PSAppViewDTO psachandlerid(String v) { setPSACHandlerId(v); return this; }
    @JsonProperty("psachandlername") public void setPSACHandlerName(String v) { setValue(DTOFIELD_PSACHANDLERNAME, v); }
    @JsonIgnore public String getPSACHandlerName() { return stringValue(DTOFIELD_PSACHANDLERNAME); }
    @JsonIgnore public boolean isPSACHandlerNameDirty() { return dirty(DTOFIELD_PSACHANDLERNAME); }
    @JsonIgnore public void resetPSACHandlerName() { resetValue(DTOFIELD_PSACHANDLERNAME); }
    @JsonIgnore public PSAppViewDTO psachandlername(String v) { setPSACHandlerName(v); return this; }

    @JsonProperty("psappdataentityid") public void setPSAppDataEntityId(String v) { setValue(DTOFIELD_PSAPPDATAENTITYID, v); setValue(FIELD_PSAPPDATAENTITYID, v); }
    @JsonIgnore public String getPSAppDataEntityId() { return relatedId(DTOFIELD_PSAPPDATAENTITYID, FIELD_PSAPPDATAENTITYID); }
    @JsonIgnore public boolean isPSAppDataEntityIdDirty() { return relatedDirty(DTOFIELD_PSAPPDATAENTITYID, FIELD_PSAPPDATAENTITYID); }
    @JsonIgnore public void resetPSAppDataEntityId() { resetRelated(DTOFIELD_PSAPPDATAENTITYID, FIELD_PSAPPDATAENTITYID); }
    @JsonIgnore public PSAppViewDTO psappdataentityid(String v) { setPSAppDataEntityId(v); return this; }
    @JsonIgnore public PSAppViewDTO psappdataentityid(PSAppDataEntityDTO v) { return related(DTOFIELD_PSAPPDATAENTITYID, DTOFIELD_PSAPPDATAENTITYNAME, v == null ? null : v.getPSAppDataEntityId(), v == null ? null : v.getPSAppDataEntityName()); }
    @JsonIgnore @Deprecated public String getPSAppLocalDEId() { return getPSAppDataEntityId(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEId(String v) { setPSAppDataEntityId(v); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDEIdDirty() { return isPSAppDataEntityIdDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEId() { resetPSAppDataEntityId(); }
    @JsonProperty("psappdataentityname") public void setPSAppDataEntityName(String v) { setValue(DTOFIELD_PSAPPDATAENTITYNAME, v); setValue(FIELD_PSAPPDATAENTITYNAME, v); }
    @JsonIgnore public String getPSAppDataEntityName() { return relatedId(DTOFIELD_PSAPPDATAENTITYNAME, FIELD_PSAPPDATAENTITYNAME); }
    @JsonIgnore public boolean isPSAppDataEntityNameDirty() { return relatedDirty(DTOFIELD_PSAPPDATAENTITYNAME, FIELD_PSAPPDATAENTITYNAME); }
    @JsonIgnore public void resetPSAppDataEntityName() { resetRelated(DTOFIELD_PSAPPDATAENTITYNAME, FIELD_PSAPPDATAENTITYNAME); }
    @JsonIgnore public PSAppViewDTO psappdataentityname(String v) { setPSAppDataEntityName(v); return this; }
    @JsonIgnore @Deprecated public String getPSAppLocalDEName() { return getPSAppDataEntityName(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEName(String v) { setPSAppDataEntityName(v); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDENameDirty() { return isPSAppDataEntityNameDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEName() { resetPSAppDataEntityName(); }

    @JsonProperty("psappmoduleid") public void setPSAppModuleId(String v) { setValue(DTOFIELD_PSAPPMODULEID, v); }
    @JsonIgnore public String getPSAppModuleId() { return stringValue(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public boolean isPSAppModuleIdDirty() { return dirty(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public void resetPSAppModuleId() { resetValue(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public PSAppViewDTO psappmoduleid(String v) { setPSAppModuleId(v); return this; }
    @JsonIgnore public PSAppViewDTO psappmoduleid(PSAppModuleDTO v) { return related(DTOFIELD_PSAPPMODULEID, DTOFIELD_PSAPPMODULENAME, v == null ? null : v.getPSAppModuleId(), v == null ? null : v.getPSAppModuleName()); }
    @JsonProperty("psappmodulename") public void setPSAppModuleName(String v) { setValue(DTOFIELD_PSAPPMODULENAME, v); }
    @JsonIgnore public String getPSAppModuleName() { return stringValue(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public boolean isPSAppModuleNameDirty() { return dirty(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public void resetPSAppModuleName() { resetValue(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public PSAppViewDTO psappmodulename(String v) { setPSAppModuleName(v); return this; }

    @JsonProperty("psapptitlebarid") public void setPSAppTitleBarId(String v) { setValue(DTOFIELD_PSAPPTITLEBARID, v); }
    @JsonIgnore public String getPSAppTitleBarId() { return stringValue(DTOFIELD_PSAPPTITLEBARID); }
    @JsonIgnore public boolean isPSAppTitleBarIdDirty() { return dirty(DTOFIELD_PSAPPTITLEBARID); }
    @JsonIgnore public void resetPSAppTitleBarId() { resetValue(DTOFIELD_PSAPPTITLEBARID); }
    @JsonIgnore public PSAppViewDTO psapptitlebarid(String v) { setPSAppTitleBarId(v); return this; }
    @JsonProperty("psapptitlebarname") public void setPSAppTitleBarName(String v) { setValue(DTOFIELD_PSAPPTITLEBARNAME, v); }
    @JsonIgnore public String getPSAppTitleBarName() { return stringValue(DTOFIELD_PSAPPTITLEBARNAME); }
    @JsonIgnore public boolean isPSAppTitleBarNameDirty() { return dirty(DTOFIELD_PSAPPTITLEBARNAME); }
    @JsonIgnore public void resetPSAppTitleBarName() { resetValue(DTOFIELD_PSAPPTITLEBARNAME); }
    @JsonIgnore public PSAppViewDTO psapptitlebarname(String v) { setPSAppTitleBarName(v); return this; }
    @JsonProperty("psapputilviewtype") public void setPSAppUtilViewType(String v) { setValue(DTOFIELD_PSAPPUTILVIEWTYPE, v); }
    @JsonIgnore public String getPSAppUtilViewType() { return stringValue(DTOFIELD_PSAPPUTILVIEWTYPE); }
    @JsonIgnore public boolean isPSAppUtilViewTypeDirty() { return dirty(DTOFIELD_PSAPPUTILVIEWTYPE); }
    @JsonIgnore public void resetPSAppUtilViewType() { resetValue(DTOFIELD_PSAPPUTILVIEWTYPE); }
    @JsonIgnore public PSAppViewDTO psapputilviewtype(String v) { setPSAppUtilViewType(v); return this; }
    @JsonIgnore public PSAppViewDTO psapputilviewtype(PSModelEnums.AppUtilViewType v) { return psapputilviewtype(v == null ? null : v.value); }

    @JsonProperty("psappviewid") public void setPSAppViewId(String v) { setValue(DTOFIELD_PSAPPVIEWID, v); }
    @JsonIgnore public String getPSAppViewId() { return stringValue(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public boolean isPSAppViewIdDirty() { return dirty(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public void resetPSAppViewId() { resetValue(DTOFIELD_PSAPPVIEWID); }
    @JsonIgnore public PSAppViewDTO psappviewid(String v) { setPSAppViewId(v); return this; }
    @JsonProperty("psappviewname") public void setPSAppViewName(String v) { setValue(DTOFIELD_PSAPPVIEWNAME, v); }
    @JsonIgnore public String getPSAppViewName() { return stringValue(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public boolean isPSAppViewNameDirty() { return dirty(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public void resetPSAppViewName() { resetValue(DTOFIELD_PSAPPVIEWNAME); }
    @JsonIgnore public String getName() { return getPSAppViewName(); }
    @JsonIgnore public void setName(String v) { setPSAppViewName(v); }
    @JsonIgnore public PSAppViewDTO name(String v) { setPSAppViewName(v); return this; }
    @JsonProperty("psappviewtype") public void setPSAppViewType(String v) { setValue(DTOFIELD_PSAPPVIEWTYPE, v); }
    @JsonIgnore public String getPSAppViewType() { return stringValue(DTOFIELD_PSAPPVIEWTYPE); }
    @JsonIgnore public boolean isPSAppViewTypeDirty() { return dirty(DTOFIELD_PSAPPVIEWTYPE); }
    @JsonIgnore public void resetPSAppViewType() { resetValue(DTOFIELD_PSAPPVIEWTYPE); }
    @JsonIgnore public PSAppViewDTO psappviewtype(String v) { setPSAppViewType(v); return this; }
    @JsonIgnore public PSAppViewDTO psappviewtype(PSModelEnums.AppViewType v) { return psappviewtype(v == null ? null : v.value); }

    @JsonProperty("psctrllogicgroupid") public void setPSCtrlLogicGroupId(String v) { setValue(DTOFIELD_PSCTRLLOGICGROUPID, v); }
    @JsonIgnore public String getPSCtrlLogicGroupId() { return stringValue(DTOFIELD_PSCTRLLOGICGROUPID); }
    @JsonIgnore public boolean isPSCtrlLogicGroupIdDirty() { return dirty(DTOFIELD_PSCTRLLOGICGROUPID); }
    @JsonIgnore public void resetPSCtrlLogicGroupId() { resetValue(DTOFIELD_PSCTRLLOGICGROUPID); }
    @JsonIgnore public PSAppViewDTO psctrllogicgroupid(String v) { setPSCtrlLogicGroupId(v); return this; }
    @JsonProperty("psctrllogicgroupname") public void setPSCtrlLogicGroupName(String v) { setValue(DTOFIELD_PSCTRLLOGICGROUPNAME, v); }
    @JsonIgnore public String getPSCtrlLogicGroupName() { return stringValue(DTOFIELD_PSCTRLLOGICGROUPNAME); }
    @JsonIgnore public boolean isPSCtrlLogicGroupNameDirty() { return dirty(DTOFIELD_PSCTRLLOGICGROUPNAME); }
    @JsonIgnore public void resetPSCtrlLogicGroupName() { resetValue(DTOFIELD_PSCTRLLOGICGROUPNAME); }
    @JsonIgnore public PSAppViewDTO psctrllogicgroupname(String v) { setPSCtrlLogicGroupName(v); return this; }

    @JsonProperty("psdeviewbaseid") public void setPSDEViewBaseId(String v) { setValue(DTOFIELD_PSDEVIEWBASEID, v); }
    @JsonIgnore public String getPSDEViewBaseId() { return stringValue(DTOFIELD_PSDEVIEWBASEID); }
    @JsonIgnore public boolean isPSDEViewBaseIdDirty() { return dirty(DTOFIELD_PSDEVIEWBASEID); }
    @JsonIgnore public void resetPSDEViewBaseId() { resetValue(DTOFIELD_PSDEVIEWBASEID); }
    @JsonIgnore public PSAppViewDTO psdeviewbaseid(String v) { setPSDEViewBaseId(v); return this; }
    @JsonIgnore public PSAppViewDTO psdeviewbaseid(PSDEViewBaseDTO v) { return related(DTOFIELD_PSDEVIEWBASEID, DTOFIELD_PSDEVIEWBASENAME, v == null ? null : v.getPSDEViewBaseId(), v == null ? null : v.getPSDEViewBaseName()); }
    @JsonProperty("psdeviewbasename") public void setPSDEViewBaseName(String v) { setValue(DTOFIELD_PSDEVIEWBASENAME, v); }
    @JsonIgnore public String getPSDEViewBaseName() { return stringValue(DTOFIELD_PSDEVIEWBASENAME); }
    @JsonIgnore public boolean isPSDEViewBaseNameDirty() { return dirty(DTOFIELD_PSDEVIEWBASENAME); }
    @JsonIgnore public void resetPSDEViewBaseName() { resetValue(DTOFIELD_PSDEVIEWBASENAME); }
    @JsonIgnore public PSAppViewDTO psdeviewbasename(String v) { setPSDEViewBaseName(v); return this; }
    @JsonProperty("psdeviewtype") public void setPSDEViewType(String v) { setValue(DTOFIELD_PSDEVIEWTYPE, v); }
    @JsonIgnore public String getPSDEViewType() { return stringValue(DTOFIELD_PSDEVIEWTYPE); }
    @JsonIgnore public boolean isPSDEViewTypeDirty() { return dirty(DTOFIELD_PSDEVIEWTYPE); }
    @JsonIgnore public void resetPSDEViewType() { resetValue(DTOFIELD_PSDEVIEWTYPE); }
    @JsonIgnore public PSAppViewDTO psdeviewtype(String v) { setPSDEViewType(v); return this; }
    @JsonProperty("psdynadeviewtemplid") public void setPSDynaDEViewTemplId(String v) { setValue(DTOFIELD_PSDYNADEVIEWTEMPLID, v); }
    @JsonIgnore public String getPSDynaDEViewTemplId() { return stringValue(DTOFIELD_PSDYNADEVIEWTEMPLID); }
    @JsonIgnore public boolean isPSDynaDEViewTemplIdDirty() { return dirty(DTOFIELD_PSDYNADEVIEWTEMPLID); }
    @JsonIgnore public void resetPSDynaDEViewTemplId() { resetValue(DTOFIELD_PSDYNADEVIEWTEMPLID); }
    @JsonIgnore public PSAppViewDTO psdynadeviewtemplid(String v) { setPSDynaDEViewTemplId(v); return this; }
    @JsonProperty("psdynadeviewtemplname") public void setPSDynaDEViewTemplName(String v) { setValue(DTOFIELD_PSDYNADEVIEWTEMPLNAME, v); }
    @JsonIgnore public String getPSDynaDEViewTemplName() { return stringValue(DTOFIELD_PSDYNADEVIEWTEMPLNAME); }
    @JsonIgnore public boolean isPSDynaDEViewTemplNameDirty() { return dirty(DTOFIELD_PSDYNADEVIEWTEMPLNAME); }
    @JsonIgnore public void resetPSDynaDEViewTemplName() { resetValue(DTOFIELD_PSDYNADEVIEWTEMPLNAME); }
    @JsonIgnore public PSAppViewDTO psdynadeviewtemplname(String v) { setPSDynaDEViewTemplName(v); return this; }
    @JsonProperty("psdynadeviewtype") public void setPSDynaDEViewType(String v) { setValue(DTOFIELD_PSDYNADEVIEWTYPE, v); }
    @JsonIgnore public String getPSDynaDEViewType() { return stringValue(DTOFIELD_PSDYNADEVIEWTYPE); }
    @JsonIgnore public boolean isPSDynaDEViewTypeDirty() { return dirty(DTOFIELD_PSDYNADEVIEWTYPE); }
    @JsonIgnore public void resetPSDynaDEViewType() { resetValue(DTOFIELD_PSDYNADEVIEWTYPE); }
    @JsonIgnore public PSAppViewDTO psdynadeviewtype(String v) { setPSDynaDEViewType(v); return this; }

    @JsonProperty("pshelpmoduleid") public void setPSHelpModuleId(String v) { setValue(DTOFIELD_PSHELPMODULEID, v); }
    @JsonIgnore public String getPSHelpModuleId() { return stringValue(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public boolean isPSHelpModuleIdDirty() { return dirty(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public void resetPSHelpModuleId() { resetValue(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public PSAppViewDTO pshelpmoduleid(String v) { setPSHelpModuleId(v); return this; }
    @JsonProperty("pshelpmodulename") public void setPSHelpModuleName(String v) { setValue(DTOFIELD_PSHELPMODULENAME, v); }
    @JsonIgnore public String getPSHelpModuleName() { return stringValue(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public boolean isPSHelpModuleNameDirty() { return dirty(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public void resetPSHelpModuleName() { resetValue(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public PSAppViewDTO pshelpmodulename(String v) { setPSHelpModuleName(v); return this; }
    @JsonProperty("pspfid") public void setPSPFId(String v) { setValue(DTOFIELD_PSPFID, v); }
    @JsonIgnore public String getPSPFId() { return stringValue(DTOFIELD_PSPFID); }
    @JsonIgnore public boolean isPSPFIdDirty() { return dirty(DTOFIELD_PSPFID); }
    @JsonIgnore public void resetPSPFId() { resetValue(DTOFIELD_PSPFID); }
    @JsonIgnore public PSAppViewDTO pspfid(String v) { setPSPFId(v); return this; }

    @JsonProperty("pssubviewtypeid") public void setPSSubViewTypeId(String v) { setValue(DTOFIELD_PSSUBVIEWTYPEID, v); }
    @JsonIgnore public String getPSSubViewTypeId() { return stringValue(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public boolean isPSSubViewTypeIdDirty() { return dirty(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public void resetPSSubViewTypeId() { resetValue(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public PSAppViewDTO pssubviewtypeid(String v) { setPSSubViewTypeId(v); return this; }
    @JsonIgnore public PSAppViewDTO pssubviewtypeid(PSSubViewTypeDTO v) { return related(DTOFIELD_PSSUBVIEWTYPEID, DTOFIELD_PSSUBVIEWTYPENAME, v == null ? null : v.getPSSubViewTypeId(), v == null ? null : v.getPSSubViewTypeName()); }
    @JsonProperty("pssubviewtypename") public void setPSSubViewTypeName(String v) { setValue(DTOFIELD_PSSUBVIEWTYPENAME, v); }
    @JsonIgnore public String getPSSubViewTypeName() { return stringValue(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public boolean isPSSubViewTypeNameDirty() { return dirty(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public void resetPSSubViewTypeName() { resetValue(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public PSAppViewDTO pssubviewtypename(String v) { setPSSubViewTypeName(v); return this; }

    @JsonProperty("pssysappid") public void setPSSysAppId(String v) { setValue(DTOFIELD_PSSYSAPPID, v); }
    @JsonIgnore public String getPSSysAppId() { return stringValue(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return dirty(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { resetValue(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppViewDTO pssysappid(String v) { setPSSysAppId(v); return this; }
    @JsonIgnore public PSAppViewDTO pssysappid(PSSysAppDTO v) { return related(DTOFIELD_PSSYSAPPID, DTOFIELD_PSSYSAPPNAME, v == null ? null : v.getPSSysAppId(), v == null ? null : v.getPSSysAppName()); }
    @JsonProperty("pssysappname") public void setPSSysAppName(String v) { setValue(DTOFIELD_PSSYSAPPNAME, v); }
    @JsonIgnore public String getPSSysAppName() { return stringValue(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return dirty(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { resetValue(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppViewDTO pssysappname(String v) { setPSSysAppName(v); return this; }

    @JsonProperty("pssyscssid") public void setPSSysCssId(String v) { setValue(DTOFIELD_PSSYSCSSID, v); }
    @JsonIgnore public String getPSSysCssId() { return stringValue(DTOFIELD_PSSYSCSSID); }
    @JsonIgnore public boolean isPSSysCssIdDirty() { return dirty(DTOFIELD_PSSYSCSSID); }
    @JsonIgnore public void resetPSSysCssId() { resetValue(DTOFIELD_PSSYSCSSID); }
    @JsonIgnore public PSAppViewDTO pssyscssid(String v) { setPSSysCssId(v); return this; }
    @JsonProperty("pssyscssname") public void setPSSysCssName(String v) { setValue(DTOFIELD_PSSYSCSSNAME, v); }
    @JsonIgnore public String getPSSysCssName() { return stringValue(DTOFIELD_PSSYSCSSNAME); }
    @JsonIgnore public boolean isPSSysCssNameDirty() { return dirty(DTOFIELD_PSSYSCSSNAME); }
    @JsonIgnore public void resetPSSysCssName() { resetValue(DTOFIELD_PSSYSCSSNAME); }
    @JsonIgnore public PSAppViewDTO pssyscssname(String v) { setPSSysCssName(v); return this; }
    @JsonProperty("pssysdynamodelid") public void setPSSysDynaModelId(String v) { setValue(DTOFIELD_PSSYSDYNAMODELID, v); }
    @JsonIgnore public String getPSSysDynaModelId() { return stringValue(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public boolean isPSSysDynaModelIdDirty() { return dirty(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public void resetPSSysDynaModelId() { resetValue(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public PSAppViewDTO pssysdynamodelid(String v) { setPSSysDynaModelId(v); return this; }
    @JsonIgnore public PSAppViewDTO pssysdynamodelid(PSSysDynaModelDTO v) { return related(DTOFIELD_PSSYSDYNAMODELID, DTOFIELD_PSSYSDYNAMODELNAME, v == null ? null : v.getPSSysDynaModelId(), v == null ? null : v.getPSSysDynaModelName()); }
    @JsonProperty("pssysdynamodelname") public void setPSSysDynaModelName(String v) { setValue(DTOFIELD_PSSYSDYNAMODELNAME, v); }
    @JsonIgnore public String getPSSysDynaModelName() { return stringValue(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public boolean isPSSysDynaModelNameDirty() { return dirty(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public void resetPSSysDynaModelName() { resetValue(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public PSAppViewDTO pssysdynamodelname(String v) { setPSSysDynaModelName(v); return this; }
    @JsonProperty("pssysimageid") public void setPSSysImageId(String v) { setValue(DTOFIELD_PSSYSIMAGEID, v); }
    @JsonIgnore public String getPSSysImageId() { return stringValue(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public boolean isPSSysImageIdDirty() { return dirty(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public void resetPSSysImageId() { resetValue(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public PSAppViewDTO pssysimageid(String v) { setPSSysImageId(v); return this; }
    @JsonProperty("pssysimagename") public void setPSSysImageName(String v) { setValue(DTOFIELD_PSSYSIMAGENAME, v); }
    @JsonIgnore public String getPSSysImageName() { return stringValue(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public boolean isPSSysImageNameDirty() { return dirty(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public void resetPSSysImageName() { resetValue(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public PSAppViewDTO pssysimagename(String v) { setPSSysImageName(v); return this; }

    @JsonProperty("pssysreqitemid") public void setPSSysReqItemId(String v) { setValue(DTOFIELD_PSSYSREQITEMID, v); }
    @JsonIgnore public String getPSSysReqItemId() { return stringValue(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public boolean isPSSysReqItemIdDirty() { return dirty(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public void resetPSSysReqItemId() { resetValue(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public PSAppViewDTO pssysreqitemid(String v) { setPSSysReqItemId(v); return this; }
    @JsonIgnore public PSAppViewDTO pssysreqitemid(PSSysReqItemDTO v) { return related(DTOFIELD_PSSYSREQITEMID, DTOFIELD_PSSYSREQITEMNAME, v == null ? null : v.getPSSysReqItemId(), v == null ? null : v.getPSSysReqItemName()); }
    @JsonProperty("pssysreqitemname") public void setPSSysReqItemName(String v) { setValue(DTOFIELD_PSSYSREQITEMNAME, v); }
    @JsonIgnore public String getPSSysReqItemName() { return stringValue(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public boolean isPSSysReqItemNameDirty() { return dirty(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public void resetPSSysReqItemName() { resetValue(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public PSAppViewDTO pssysreqitemname(String v) { setPSSysReqItemName(v); return this; }
    @JsonProperty("pssysuniresid") public void setPSSysUniResId(String v) { setValue(DTOFIELD_PSSYSUNIRESID, v); }
    @JsonIgnore public String getPSSysUniResId() { return stringValue(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public boolean isPSSysUniResIdDirty() { return dirty(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public void resetPSSysUniResId() { resetValue(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public PSAppViewDTO pssysuniresid(String v) { setPSSysUniResId(v); return this; }
    @JsonIgnore public PSAppViewDTO pssysuniresid(PSSysUniResDTO v) { return related(DTOFIELD_PSSYSUNIRESID, DTOFIELD_PSSYSUNIRESNAME, v == null ? null : v.getPSSysUniResId(), v == null ? null : v.getPSSysUniResName()); }
    @JsonProperty("pssysuniresname") public void setPSSysUniResName(String v) { setValue(DTOFIELD_PSSYSUNIRESNAME, v); }
    @JsonIgnore public String getPSSysUniResName() { return stringValue(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public boolean isPSSysUniResNameDirty() { return dirty(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public void resetPSSysUniResName() { resetValue(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public PSAppViewDTO pssysuniresname(String v) { setPSSysUniResName(v); return this; }

    @JsonProperty("pssysviewpanelid") public void setPSSysViewPanelId(String v) { setValue(DTOFIELD_PSSYSVIEWPANELID, v); }
    @JsonIgnore public String getPSSysViewPanelId() { return stringValue(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public boolean isPSSysViewPanelIdDirty() { return dirty(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public void resetPSSysViewPanelId() { resetValue(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public PSAppViewDTO pssysviewpanelid(String v) { setPSSysViewPanelId(v); return this; }
    @JsonProperty("pssysviewpanelname") public void setPSSysViewPanelName(String v) { setValue(DTOFIELD_PSSYSVIEWPANELNAME, v); }
    @JsonIgnore public String getPSSysViewPanelName() { return stringValue(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public boolean isPSSysViewPanelNameDirty() { return dirty(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public void resetPSSysViewPanelName() { resetValue(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public PSAppViewDTO pssysviewpanelname(String v) { setPSSysViewPanelName(v); return this; }
    @JsonProperty("psviewmsggroupid") public void setPSViewMsgGroupId(String v) { setValue(DTOFIELD_PSVIEWMSGGROUPID, v); }
    @JsonIgnore public String getPSViewMsgGroupId() { return stringValue(DTOFIELD_PSVIEWMSGGROUPID); }
    @JsonIgnore public boolean isPSViewMsgGroupIdDirty() { return dirty(DTOFIELD_PSVIEWMSGGROUPID); }
    @JsonIgnore public void resetPSViewMsgGroupId() { resetValue(DTOFIELD_PSVIEWMSGGROUPID); }
    @JsonIgnore public PSAppViewDTO psviewmsggroupid(String v) { setPSViewMsgGroupId(v); return this; }
    @JsonProperty("psviewmsggroupname") public void setPSViewMsgGroupName(String v) { setValue(DTOFIELD_PSVIEWMSGGROUPNAME, v); }
    @JsonIgnore public String getPSViewMsgGroupName() { return stringValue(DTOFIELD_PSVIEWMSGGROUPNAME); }
    @JsonIgnore public boolean isPSViewMsgGroupNameDirty() { return dirty(DTOFIELD_PSVIEWMSGGROUPNAME); }
    @JsonIgnore public void resetPSViewMsgGroupName() { resetValue(DTOFIELD_PSVIEWMSGGROUPNAME); }
    @JsonIgnore public PSAppViewDTO psviewmsggroupname(String v) { setPSViewMsgGroupName(v); return this; }

    @JsonProperty("subcappslanresid") public void setSubCapPSLanResId(String v) { setValue(DTOFIELD_SUBCAPPSLANRESID, v); }
    @JsonIgnore public String getSubCapPSLanResId() { return stringValue(DTOFIELD_SUBCAPPSLANRESID); }
    @JsonIgnore public boolean isSubCapPSLanResIdDirty() { return dirty(DTOFIELD_SUBCAPPSLANRESID); }
    @JsonIgnore public void resetSubCapPSLanResId() { resetValue(DTOFIELD_SUBCAPPSLANRESID); }
    @JsonIgnore public PSAppViewDTO subcappslanresid(String v) { setSubCapPSLanResId(v); return this; }
    @JsonIgnore public PSAppViewDTO subcappslanresid(PSLanguageResDTO v) { return subcappslanresid(v == null ? null : v.getPSLanguageResId()); }
    @JsonProperty("subcappslanresname") public void setSubCapPSLanResName(String v) { setValue(DTOFIELD_SUBCAPPSLANRESNAME, v); }
    @JsonIgnore public String getSubCapPSLanResName() { return stringValue(DTOFIELD_SUBCAPPSLANRESNAME); }
    @JsonIgnore public boolean isSubCapPSLanResNameDirty() { return dirty(DTOFIELD_SUBCAPPSLANRESNAME); }
    @JsonIgnore public void resetSubCapPSLanResName() { resetValue(DTOFIELD_SUBCAPPSLANRESNAME); }
    @JsonIgnore public PSAppViewDTO subcappslanresname(String v) { setSubCapPSLanResName(v); return this; }
    @JsonProperty("subcaption") public void setSubCaption(String v) { setValue(DTOFIELD_SUBCAPTION, v); }
    @JsonIgnore public String getSubCaption() { return stringValue(DTOFIELD_SUBCAPTION); }
    @JsonIgnore public boolean isSubCaptionDirty() { return dirty(DTOFIELD_SUBCAPTION); }
    @JsonIgnore public void resetSubCaption() { resetValue(DTOFIELD_SUBCAPTION); }
    @JsonIgnore public PSAppViewDTO subcaption(String v) { setSubCaption(v); return this; }

    @JsonProperty("synccodename") public void setSyncCodeName(Integer v) { setValue(DTOFIELD_SYNCCODENAME, v); }
    @JsonIgnore public Integer getSyncCodeName() { return integerValue(DTOFIELD_SYNCCODENAME); }
    @JsonIgnore public boolean isSyncCodeNameDirty() { return dirty(DTOFIELD_SYNCCODENAME); }
    @JsonIgnore public void resetSyncCodeName() { resetValue(DTOFIELD_SYNCCODENAME); }
    @JsonIgnore public PSAppViewDTO synccodename(Integer v) { setSyncCodeName(v); return this; }
    @JsonIgnore public PSAppViewDTO synccodename(Boolean v) { return synccodename(boolValue(v)); }
    @JsonProperty("title") public void setTitle(String v) { setValue(DTOFIELD_TITLE, v); }
    @JsonIgnore public String getTitle() { return stringValue(DTOFIELD_TITLE); }
    @JsonIgnore public boolean isTitleDirty() { return dirty(DTOFIELD_TITLE); }
    @JsonIgnore public void resetTitle() { resetValue(DTOFIELD_TITLE); }
    @JsonIgnore public PSAppViewDTO title(String v) { setTitle(v); return this; }
    @JsonProperty("titlepslanresid") public void setTitlePSLanResId(String v) { setValue(DTOFIELD_TITLEPSLANRESID, v); }
    @JsonIgnore public String getTitlePSLanResId() { return stringValue(DTOFIELD_TITLEPSLANRESID); }
    @JsonIgnore public boolean isTitlePSLanResIdDirty() { return dirty(DTOFIELD_TITLEPSLANRESID); }
    @JsonIgnore public void resetTitlePSLanResId() { resetValue(DTOFIELD_TITLEPSLANRESID); }
    @JsonIgnore public PSAppViewDTO titlepslanresid(String v) { setTitlePSLanResId(v); return this; }
    @JsonIgnore public PSAppViewDTO titlepslanresid(PSLanguageResDTO v) { return titlepslanresid(v == null ? null : v.getPSLanguageResId()); }
    @JsonProperty("titlepslanresname") public void setTitlePSLanResName(String v) { setValue(DTOFIELD_TITLEPSLANRESNAME, v); }
    @JsonIgnore public String getTitlePSLanResName() { return stringValue(DTOFIELD_TITLEPSLANRESNAME); }
    @JsonIgnore public boolean isTitlePSLanResNameDirty() { return dirty(DTOFIELD_TITLEPSLANRESNAME); }
    @JsonIgnore public void resetTitlePSLanResName() { resetValue(DTOFIELD_TITLEPSLANRESNAME); }
    @JsonIgnore public PSAppViewDTO titlepslanresname(String v) { setTitlePSLanResName(v); return this; }
    @JsonProperty("uistyle") public void setUIStyle(String v) { setValue(DTOFIELD_UISTYLE, v); }
    @JsonIgnore public String getUIStyle() { return stringValue(DTOFIELD_UISTYLE); }
    @JsonIgnore public boolean isUIStyleDirty() { return dirty(DTOFIELD_UISTYLE); }
    @JsonIgnore public void resetUIStyle() { resetValue(DTOFIELD_UISTYLE); }
    @JsonIgnore public PSAppViewDTO uistyle(String v) { setUIStyle(v); return this; }
    @JsonIgnore public PSAppViewDTO uistyle(PSModelEnums.AppUIStyle v) { return uistyle(v == null ? null : v.value); }

    @JsonProperty("updatedate") @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp v) { setValue(DTOFIELD_UPDATEDATE, v); }
    @JsonIgnore public Timestamp getUpdateDate() { return timestampValue(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return dirty(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { resetValue(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppViewDTO updatedate(Timestamp v) { setUpdateDate(v); return this; }
    @JsonProperty("updateman") public void setUpdateMan(String v) { setValue(DTOFIELD_UPDATEMAN, v); }
    @JsonIgnore public String getUpdateMan() { return stringValue(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return dirty(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { resetValue(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppViewDTO updateman(String v) { setUpdateMan(v); return this; }
    @JsonProperty("userparams") public void setUserParams(String v) { setValue(DTOFIELD_USERPARAMS, v); }
    @JsonIgnore public String getUserParams() { return stringValue(DTOFIELD_USERPARAMS); }
    @JsonIgnore public boolean isUserParamsDirty() { return dirty(DTOFIELD_USERPARAMS); }
    @JsonIgnore public void resetUserParams() { resetValue(DTOFIELD_USERPARAMS); }
    @JsonIgnore public PSAppViewDTO userparams(String v) { setUserParams(v); return this; }
    @JsonProperty("userrefflag") public void setUserRefFlag(Integer v) { setValue(DTOFIELD_USERREFFLAG, v); }
    @JsonIgnore public Integer getUserRefFlag() { return integerValue(DTOFIELD_USERREFFLAG); }
    @JsonIgnore public boolean isUserRefFlagDirty() { return dirty(DTOFIELD_USERREFFLAG); }
    @JsonIgnore public void resetUserRefFlag() { resetValue(DTOFIELD_USERREFFLAG); }
    @JsonIgnore public PSAppViewDTO userrefflag(Integer v) { setUserRefFlag(v); return this; }
    @JsonIgnore public PSAppViewDTO userrefflag(Boolean v) { return userrefflag(boolValue(v)); }
    @JsonProperty("usertag") public void setUserTag(String v) { setValue(DTOFIELD_USERTAG, v); }
    @JsonIgnore public String getUserTag() { return stringValue(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return dirty(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { resetValue(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppViewDTO usertag(String v) { setUserTag(v); return this; }
    @JsonProperty("usertag2") public void setUserTag2(String v) { setValue(DTOFIELD_USERTAG2, v); }
    @JsonIgnore public String getUserTag2() { return stringValue(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return dirty(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { resetValue(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppViewDTO usertag2(String v) { setUserTag2(v); return this; }
    @JsonProperty("usertag3") public void setUserTag3(String v) { setValue(DTOFIELD_USERTAG3, v); }
    @JsonIgnore public String getUserTag3() { return stringValue(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return dirty(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { resetValue(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppViewDTO usertag3(String v) { setUserTag3(v); return this; }
    @JsonProperty("usertag4") public void setUserTag4(String v) { setValue(DTOFIELD_USERTAG4, v); }
    @JsonIgnore public String getUserTag4() { return stringValue(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return dirty(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { resetValue(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppViewDTO usertag4(String v) { setUserTag4(v); return this; }

    @JsonIgnore public String getId() { return getPSAppViewId(); }
    @JsonIgnore public void setId(String v) { setPSAppViewId(v); }
    @JsonIgnore public PSAppViewDTO id(String v) { setPSAppViewId(v); return this; }
}