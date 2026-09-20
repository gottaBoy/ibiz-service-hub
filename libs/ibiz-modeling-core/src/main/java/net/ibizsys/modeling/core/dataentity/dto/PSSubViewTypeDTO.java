package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Sub view type DTO.
 */
public class PSSubViewTypeDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXTENDCTRL = "EXTENDCTRL";
    protected static final String DTOFIELD_EXTENDCTRL = "extendctrl";
    public static final String FIELD_EXTENDSTYLEONLY = "EXTENDSTYLEONLY";
    protected static final String DTOFIELD_EXTENDSTYLEONLY = "extendstyleonly";
    public static final String FIELD_EXTENDVIEW = "EXTENDVIEW";
    protected static final String DTOFIELD_EXTENDVIEW = "extendview";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PREVIEWHTML = "PREVIEWHTML";
    protected static final String DTOFIELD_PREVIEWHTML = "previewhtml";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBVIEWTYPEID = "PSSUBVIEWTYPEID";
    protected static final String DTOFIELD_PSSUBVIEWTYPEID = "pssubviewtypeid";
    public static final String FIELD_PSSUBVIEWTYPENAME = "PSSUBVIEWTYPENAME";
    protected static final String DTOFIELD_PSSUBVIEWTYPENAME = "pssubviewtypename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSVIEWTYPEID = "PSVIEWTYPEID";
    protected static final String DTOFIELD_PSVIEWTYPEID = "psviewtypeid";
    public static final String FIELD_PSVIEWTYPENAME = "PSVIEWTYPENAME";
    protected static final String DTOFIELD_PSVIEWTYPENAME = "psviewtypename";
    public static final String FIELD_REPDEFAULT = "REPDEFAULT";
    protected static final String DTOFIELD_REPDEFAULT = "repdefault";
    public static final String FIELD_STUDIOICON = "STUDIOICON";
    protected static final String DTOFIELD_STUDIOICON = "studioicon";
    public static final String FIELD_TYPECODE = "TYPECODE";
    protected static final String DTOFIELD_TYPECODE = "typecode";
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
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_VIEWMODEL = "VIEWMODEL";
    protected static final String DTOFIELD_VIEWMODEL = "viewmodel";
    public static final String FIELD_VIEWPARAMS = "VIEWPARAMS";
    protected static final String DTOFIELD_VIEWPARAMS = "viewparams";

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSSubViewTypeDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSSubViewTypeDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSSubViewTypeDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("extendctrl")
    public void setExtendCtrl(Integer value) { _set(DTOFIELD_EXTENDCTRL, value); }
    @JsonIgnore public Integer getExtendCtrl() { return (Integer) _get(DTOFIELD_EXTENDCTRL); }
    @JsonIgnore public boolean isExtendCtrlDirty() { return _contains(DTOFIELD_EXTENDCTRL); }
    @JsonIgnore public void resetExtendCtrl() { _reset(DTOFIELD_EXTENDCTRL); }
    @JsonIgnore public PSSubViewTypeDTO extendctrl(Integer value) { setExtendCtrl(value); return this; }
    @JsonIgnore public PSSubViewTypeDTO extendctrl(Boolean value) { setExtendCtrl(flagValue(value)); return this; }

    @JsonProperty("extendstyleonly")
    public void setExtendStyleOnly(Integer value) { _set(DTOFIELD_EXTENDSTYLEONLY, value); }
    @JsonIgnore public Integer getExtendStyleOnly() { return (Integer) _get(DTOFIELD_EXTENDSTYLEONLY); }
    @JsonIgnore public boolean isExtendStyleOnlyDirty() { return _contains(DTOFIELD_EXTENDSTYLEONLY); }
    @JsonIgnore public void resetExtendStyleOnly() { _reset(DTOFIELD_EXTENDSTYLEONLY); }
    @JsonIgnore public PSSubViewTypeDTO extendstyleonly(Integer value) { setExtendStyleOnly(value); return this; }
    @JsonIgnore public PSSubViewTypeDTO extendstyleonly(Boolean value) { setExtendStyleOnly(flagValue(value)); return this; }

    @JsonProperty("extendview")
    public void setExtendView(Integer value) { _set(DTOFIELD_EXTENDVIEW, value); }
    @JsonIgnore public Integer getExtendView() { return (Integer) _get(DTOFIELD_EXTENDVIEW); }
    @JsonIgnore public boolean isExtendViewDirty() { return _contains(DTOFIELD_EXTENDVIEW); }
    @JsonIgnore public void resetExtendView() { _reset(DTOFIELD_EXTENDVIEW); }
    @JsonIgnore public PSSubViewTypeDTO extendview(Integer value) { setExtendView(value); return this; }
    @JsonIgnore public PSSubViewTypeDTO extendview(Boolean value) { setExtendView(flagValue(value)); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSSubViewTypeDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("previewhtml")
    public void setPreviewHtml(String value) { _set(DTOFIELD_PREVIEWHTML, value); }
    @JsonIgnore public String getPreviewHtml() { return (String) _get(DTOFIELD_PREVIEWHTML); }
    @JsonIgnore public boolean isPreviewHtmlDirty() { return _contains(DTOFIELD_PREVIEWHTML); }
    @JsonIgnore public void resetPreviewHtml() { _reset(DTOFIELD_PREVIEWHTML); }
    @JsonIgnore public PSSubViewTypeDTO previewhtml(String value) { setPreviewHtml(value); return this; }

    @JsonProperty("psmoduleid")
    public void setPSModuleId(String value) { _set(DTOFIELD_PSMODULEID, value); }
    @JsonIgnore public String getPSModuleId() { return (String) _get(DTOFIELD_PSMODULEID); }
    @JsonIgnore public boolean isPSModuleIdDirty() { return _contains(DTOFIELD_PSMODULEID); }
    @JsonIgnore public void resetPSModuleId() { _reset(DTOFIELD_PSMODULEID); }
    @JsonIgnore public PSSubViewTypeDTO psmoduleid(String value) { setPSModuleId(value); return this; }

    @JsonProperty("psmodulename")
    public void setPSModuleName(String value) { _set(DTOFIELD_PSMODULENAME, value); }
    @JsonIgnore public String getPSModuleName() { return (String) _get(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public boolean isPSModuleNameDirty() { return _contains(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public void resetPSModuleName() { _reset(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public PSSubViewTypeDTO psmodulename(String value) { setPSModuleName(value); return this; }

    @JsonProperty("pssubviewtypeid")
    public void setPSSubViewTypeId(String value) { _set(DTOFIELD_PSSUBVIEWTYPEID, value); }
    @JsonIgnore public String getPSSubViewTypeId() { return (String) _get(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public boolean isPSSubViewTypeIdDirty() { return _contains(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public void resetPSSubViewTypeId() { _reset(DTOFIELD_PSSUBVIEWTYPEID); }
    @JsonIgnore public PSSubViewTypeDTO pssubviewtypeid(String value) { setPSSubViewTypeId(value); return this; }

    @JsonProperty("pssubviewtypename")
    public void setPSSubViewTypeName(String value) { _set(DTOFIELD_PSSUBVIEWTYPENAME, value); }
    @JsonIgnore public String getPSSubViewTypeName() { return (String) _get(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public boolean isPSSubViewTypeNameDirty() { return _contains(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public void resetPSSubViewTypeName() { _reset(DTOFIELD_PSSUBVIEWTYPENAME); }
    @JsonIgnore public PSSubViewTypeDTO pssubviewtypename(String value) { setPSSubViewTypeName(value); return this; }
    @JsonIgnore public String getName() { return getPSSubViewTypeName(); }
    @JsonIgnore public void setName(String value) { setPSSubViewTypeName(value); }
    @JsonIgnore public PSSubViewTypeDTO name(String value) { setPSSubViewTypeName(value); return this; }

    @JsonProperty("pssyspfpluginid")
    public void setPSSysPFPluginId(String value) { _set(DTOFIELD_PSSYSPFPLUGINID, value); }
    @JsonIgnore public String getPSSysPFPluginId() { return (String) _get(DTOFIELD_PSSYSPFPLUGINID); }
    @JsonIgnore public boolean isPSSysPFPluginIdDirty() { return _contains(DTOFIELD_PSSYSPFPLUGINID); }
    @JsonIgnore public void resetPSSysPFPluginId() { _reset(DTOFIELD_PSSYSPFPLUGINID); }
    @JsonIgnore public PSSubViewTypeDTO pssyspfpluginid(String value) { setPSSysPFPluginId(value); return this; }

    @JsonProperty("pssyspfpluginname")
    public void setPSSysPFPluginName(String value) { _set(DTOFIELD_PSSYSPFPLUGINNAME, value); }
    @JsonIgnore public String getPSSysPFPluginName() { return (String) _get(DTOFIELD_PSSYSPFPLUGINNAME); }
    @JsonIgnore public boolean isPSSysPFPluginNameDirty() { return _contains(DTOFIELD_PSSYSPFPLUGINNAME); }
    @JsonIgnore public void resetPSSysPFPluginName() { _reset(DTOFIELD_PSSYSPFPLUGINNAME); }
    @JsonIgnore public PSSubViewTypeDTO pssyspfpluginname(String value) { setPSSysPFPluginName(value); return this; }

    @JsonProperty("pssysviewpanelid")
    public void setPSSysViewPanelId(String value) { _set(DTOFIELD_PSSYSVIEWPANELID, value); }
    @JsonIgnore public String getPSSysViewPanelId() { return (String) _get(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public boolean isPSSysViewPanelIdDirty() { return _contains(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public void resetPSSysViewPanelId() { _reset(DTOFIELD_PSSYSVIEWPANELID); }
    @JsonIgnore public PSSubViewTypeDTO pssysviewpanelid(String value) { setPSSysViewPanelId(value); return this; }

    @JsonProperty("pssysviewpanelname")
    public void setPSSysViewPanelName(String value) { _set(DTOFIELD_PSSYSVIEWPANELNAME, value); }
    @JsonIgnore public String getPSSysViewPanelName() { return (String) _get(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public boolean isPSSysViewPanelNameDirty() { return _contains(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public void resetPSSysViewPanelName() { _reset(DTOFIELD_PSSYSVIEWPANELNAME); }
    @JsonIgnore public PSSubViewTypeDTO pssysviewpanelname(String value) { setPSSysViewPanelName(value); return this; }

    @JsonProperty("psviewtypeid")
    public void setPSViewTypeId(String value) { _set(DTOFIELD_PSVIEWTYPEID, value); }
    @JsonIgnore public String getPSViewTypeId() { return (String) _get(DTOFIELD_PSVIEWTYPEID); }
    @JsonIgnore public boolean isPSViewTypeIdDirty() { return _contains(DTOFIELD_PSVIEWTYPEID); }
    @JsonIgnore public void resetPSViewTypeId() { _reset(DTOFIELD_PSVIEWTYPEID); }
    @JsonIgnore public PSSubViewTypeDTO psviewtypeid(String value) { setPSViewTypeId(value); return this; }

    @JsonProperty("psviewtypename")
    public void setPSViewTypeName(String value) { _set(DTOFIELD_PSVIEWTYPENAME, value); }
    @JsonIgnore public String getPSViewTypeName() { return (String) _get(DTOFIELD_PSVIEWTYPENAME); }
    @JsonIgnore public boolean isPSViewTypeNameDirty() { return _contains(DTOFIELD_PSVIEWTYPENAME); }
    @JsonIgnore public void resetPSViewTypeName() { _reset(DTOFIELD_PSVIEWTYPENAME); }
    @JsonIgnore public PSSubViewTypeDTO psviewtypename(String value) { setPSViewTypeName(value); return this; }

    @JsonProperty("repdefault")
    public void setRepDefault(Integer value) { _set(DTOFIELD_REPDEFAULT, value); }
    @JsonIgnore public Integer getRepDefault() { return (Integer) _get(DTOFIELD_REPDEFAULT); }
    @JsonIgnore public boolean isRepDefaultDirty() { return _contains(DTOFIELD_REPDEFAULT); }
    @JsonIgnore public void resetRepDefault() { _reset(DTOFIELD_REPDEFAULT); }
    @JsonIgnore public PSSubViewTypeDTO repdefault(Integer value) { setRepDefault(value); return this; }
    @JsonIgnore public PSSubViewTypeDTO repdefault(Boolean value) { setRepDefault(flagValue(value)); return this; }

    @JsonProperty("studioicon")
    public void setStudioIcon(String value) { _set(DTOFIELD_STUDIOICON, value); }
    @JsonIgnore public String getStudioIcon() { return (String) _get(DTOFIELD_STUDIOICON); }
    @JsonIgnore public boolean isStudioIconDirty() { return _contains(DTOFIELD_STUDIOICON); }
    @JsonIgnore public void resetStudioIcon() { _reset(DTOFIELD_STUDIOICON); }
    @JsonIgnore public PSSubViewTypeDTO studioicon(String value) { setStudioIcon(value); return this; }

    @JsonProperty("typecode")
    public void setTypeCode(String value) { _set(DTOFIELD_TYPECODE, value); }
    @JsonIgnore public String getTypeCode() { return (String) _get(DTOFIELD_TYPECODE); }
    @JsonIgnore public boolean isTypeCodeDirty() { return _contains(DTOFIELD_TYPECODE); }
    @JsonIgnore public void resetTypeCode() { _reset(DTOFIELD_TYPECODE); }
    @JsonIgnore public PSSubViewTypeDTO typecode(String value) { setTypeCode(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSSubViewTypeDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSSubViewTypeDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSSubViewTypeDTO usercat(String value) { setUserCat(value); return this; }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSSubViewTypeDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSSubViewTypeDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSSubViewTypeDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSSubViewTypeDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("utilparams")
    public void setUtilParams(String value) { _set(DTOFIELD_UTILPARAMS, value); }
    @JsonIgnore public String getUtilParams() { return (String) _get(DTOFIELD_UTILPARAMS); }
    @JsonIgnore public boolean isUtilParamsDirty() { return _contains(DTOFIELD_UTILPARAMS); }
    @JsonIgnore public void resetUtilParams() { _reset(DTOFIELD_UTILPARAMS); }
    @JsonIgnore public PSSubViewTypeDTO utilparams(String value) { setUtilParams(value); return this; }

    @JsonProperty("viewmodel")
    public void setViewModel(String value) { _set(DTOFIELD_VIEWMODEL, value); }
    @JsonIgnore public String getViewModel() { return (String) _get(DTOFIELD_VIEWMODEL); }
    @JsonIgnore public boolean isViewModelDirty() { return _contains(DTOFIELD_VIEWMODEL); }
    @JsonIgnore public void resetViewModel() { _reset(DTOFIELD_VIEWMODEL); }
    @JsonIgnore public PSSubViewTypeDTO viewmodel(String value) { setViewModel(value); return this; }

    @JsonProperty("viewparams")
    public void setViewParams(String value) { _set(DTOFIELD_VIEWPARAMS, value); }
    @JsonIgnore public String getViewParams() { return (String) _get(DTOFIELD_VIEWPARAMS); }
    @JsonIgnore public boolean isViewParamsDirty() { return _contains(DTOFIELD_VIEWPARAMS); }
    @JsonIgnore public void resetViewParams() { _reset(DTOFIELD_VIEWPARAMS); }
    @JsonIgnore public PSSubViewTypeDTO viewparams(String value) { setViewParams(value); return this; }

    @JsonIgnore public String getId() { return getPSSubViewTypeId(); }
    @JsonIgnore public void setId(String value) { setPSSubViewTypeId(value); }
    @JsonIgnore public PSSubViewTypeDTO id(String value) { setPSSubViewTypeId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}