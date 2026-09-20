package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Editor type DTO.
 */
public class PSEditorTypeDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_AJAXHANDLER = "AJAXHANDLER";
    protected static final String DTOFIELD_AJAXHANDLER = "ajaxhandler";
    public static final String FIELD_CONVERTCITEXT = "CONVERTCITEXT";
    protected static final String DTOFIELD_CONVERTCITEXT = "convertcitext";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLOBJ = "CTRLOBJ";
    protected static final String DTOFIELD_CTRLOBJ = "ctrlobj";
    public static final String FIELD_DOTNETFORMAT = "DOTNETFORMAT";
    protected static final String DTOFIELD_DOTNETFORMAT = "dotnetformat";
    public static final String FIELD_EDITABLE = "EDITABLE";
    protected static final String DTOFIELD_EDITABLE = "editable";
    public static final String FIELD_EDITORCODE = "EDITORCODE";
    protected static final String DTOFIELD_EDITORCODE = "editorcode";
    public static final String FIELD_EDITORPARAM = "EDITORPARAM";
    protected static final String DTOFIELD_EDITORPARAM = "editorparam";
    public static final String FIELD_FIEDITOR = "FIEDITOR";
    protected static final String DTOFIELD_FIEDITOR = "fieditor";
    public static final String FIELD_GCEDITOR = "GCEDITOR";
    protected static final String DTOFIELD_GCEDITOR = "gceditor";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_JAVAFORMAT = "JAVAFORMAT";
    protected static final String DTOFIELD_JAVAFORMAT = "javaformat";
    public static final String FIELD_LINKVIEWSHOWMODE = "LINKVIEWSHOWMODE";
    protected static final String DTOFIELD_LINKVIEWSHOWMODE = "linkviewshowmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFIEDITOR = "MOBFIEDITOR";
    protected static final String DTOFIELD_MOBFIEDITOR = "mobfieditor";
    public static final String FIELD_NEEDCODELISTCONFIG = "NEEDCODELISTCONFIG";
    protected static final String DTOFIELD_NEEDCODELISTCONFIG = "needcodelistconfig";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSEDITORTYPEID = "PSEDITORTYPEID";
    protected static final String DTOFIELD_PSEDITORTYPEID = "pseditortypeid";
    public static final String FIELD_PSEDITORTYPENAME = "PSEDITORTYPENAME";
    protected static final String DTOFIELD_PSEDITORTYPENAME = "pseditortypename";
    public static final String FIELD_REFVIEWSHOWMODE = "REFVIEWSHOWMODE";
    protected static final String DTOFIELD_REFVIEWSHOWMODE = "refviewshowmode";
    public static final String FIELD_SBEDITOR = "SBEDITOR";
    protected static final String DTOFIELD_SBEDITOR = "sbeditor";
    public static final String FIELD_STANDARDEDITOR = "STANDARDEDITOR";
    protected static final String DTOFIELD_STANDARDEDITOR = "standardeditor";
    public static final String FIELD_STANDARDTYPE = "STANDARDTYPE";
    protected static final String DTOFIELD_STANDARDTYPE = "standardtype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VALUEPROCESSOR = "VALUEPROCESSOR";
    protected static final String DTOFIELD_VALUEPROCESSOR = "valueprocessor";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

    @JsonProperty("ajaxhandler")
    public void setAjaxHandler(String value) { _set(DTOFIELD_AJAXHANDLER, value); }
    @JsonIgnore public String getAjaxHandler() { return (String) _get(DTOFIELD_AJAXHANDLER); }
    @JsonIgnore public boolean isAjaxHandlerDirty() { return _contains(DTOFIELD_AJAXHANDLER); }
    @JsonIgnore public void resetAjaxHandler() { _reset(DTOFIELD_AJAXHANDLER); }
    @JsonIgnore public PSEditorTypeDTO ajaxhandler(String value) { setAjaxHandler(value); return this; }

    @JsonProperty("convertcitext")
    public void setConvertCIText(Integer value) { _set(DTOFIELD_CONVERTCITEXT, value); }
    @JsonIgnore public Integer getConvertCIText() { return (Integer) _get(DTOFIELD_CONVERTCITEXT); }
    @JsonIgnore public boolean isConvertCITextDirty() { return _contains(DTOFIELD_CONVERTCITEXT); }
    @JsonIgnore public void resetConvertCIText() { _reset(DTOFIELD_CONVERTCITEXT); }
    @JsonIgnore public PSEditorTypeDTO convertcitext(Integer value) { setConvertCIText(value); return this; }
    @JsonIgnore public PSEditorTypeDTO convertcitext(Boolean value) { setConvertCIText(flagValue(value)); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSEditorTypeDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSEditorTypeDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("ctrlobj")
    public void setCtrlObj(String value) { _set(DTOFIELD_CTRLOBJ, value); }
    @JsonIgnore public String getCtrlObj() { return (String) _get(DTOFIELD_CTRLOBJ); }
    @JsonIgnore public boolean isCtrlObjDirty() { return _contains(DTOFIELD_CTRLOBJ); }
    @JsonIgnore public void resetCtrlObj() { _reset(DTOFIELD_CTRLOBJ); }
    @JsonIgnore public PSEditorTypeDTO ctrlobj(String value) { setCtrlObj(value); return this; }

    @JsonProperty("dotnetformat")
    public void setDotNETFormat(String value) { _set(DTOFIELD_DOTNETFORMAT, value); }
    @JsonIgnore public String getDotNETFormat() { return (String) _get(DTOFIELD_DOTNETFORMAT); }
    @JsonIgnore public boolean isDotNETFormatDirty() { return _contains(DTOFIELD_DOTNETFORMAT); }
    @JsonIgnore public void resetDotNETFormat() { _reset(DTOFIELD_DOTNETFORMAT); }
    @JsonIgnore public PSEditorTypeDTO dotnetformat(String value) { setDotNETFormat(value); return this; }

    @JsonProperty("editable")
    public void setEditable(Integer value) { _set(DTOFIELD_EDITABLE, value); }
    @JsonIgnore public Integer getEditable() { return (Integer) _get(DTOFIELD_EDITABLE); }
    @JsonIgnore public boolean isEditableDirty() { return _contains(DTOFIELD_EDITABLE); }
    @JsonIgnore public void resetEditable() { _reset(DTOFIELD_EDITABLE); }
    @JsonIgnore public PSEditorTypeDTO editable(Integer value) { setEditable(value); return this; }
    @JsonIgnore public PSEditorTypeDTO editable(Boolean value) { setEditable(flagValue(value)); return this; }

    @JsonProperty("editorcode")
    public void setEditorCode(String value) { _set(DTOFIELD_EDITORCODE, value); }
    @JsonIgnore public String getEditorCode() { return (String) _get(DTOFIELD_EDITORCODE); }
    @JsonIgnore public boolean isEditorCodeDirty() { return _contains(DTOFIELD_EDITORCODE); }
    @JsonIgnore public void resetEditorCode() { _reset(DTOFIELD_EDITORCODE); }
    @JsonIgnore public PSEditorTypeDTO editorcode(String value) { setEditorCode(value); return this; }

    @JsonProperty("editorparam")
    public void setEditorParam(String value) { _set(DTOFIELD_EDITORPARAM, value); }
    @JsonIgnore public String getEditorParam() { return (String) _get(DTOFIELD_EDITORPARAM); }
    @JsonIgnore public boolean isEditorParamDirty() { return _contains(DTOFIELD_EDITORPARAM); }
    @JsonIgnore public void resetEditorParam() { _reset(DTOFIELD_EDITORPARAM); }
    @JsonIgnore public PSEditorTypeDTO editorparam(String value) { setEditorParam(value); return this; }

    @JsonProperty("fieditor")
    public void setFIEditor(Integer value) { _set(DTOFIELD_FIEDITOR, value); }
    @JsonIgnore public Integer getFIEditor() { return (Integer) _get(DTOFIELD_FIEDITOR); }
    @JsonIgnore public boolean isFIEditorDirty() { return _contains(DTOFIELD_FIEDITOR); }
    @JsonIgnore public void resetFIEditor() { _reset(DTOFIELD_FIEDITOR); }
    @JsonIgnore public PSEditorTypeDTO fieditor(Integer value) { setFIEditor(value); return this; }
    @JsonIgnore public PSEditorTypeDTO fieditor(Boolean value) { setFIEditor(flagValue(value)); return this; }

    @JsonProperty("gceditor")
    public void setGCEditor(Integer value) { _set(DTOFIELD_GCEDITOR, value); }
    @JsonIgnore public Integer getGCEditor() { return (Integer) _get(DTOFIELD_GCEDITOR); }
    @JsonIgnore public boolean isGCEditorDirty() { return _contains(DTOFIELD_GCEDITOR); }
    @JsonIgnore public void resetGCEditor() { _reset(DTOFIELD_GCEDITOR); }
    @JsonIgnore public PSEditorTypeDTO gceditor(Integer value) { setGCEditor(value); return this; }
    @JsonIgnore public PSEditorTypeDTO gceditor(Boolean value) { setGCEditor(flagValue(value)); return this; }

    @JsonProperty("height")
    public void setHeight(Integer value) { _set(DTOFIELD_HEIGHT, value); }
    @JsonIgnore public Integer getHeight() { return (Integer) _get(DTOFIELD_HEIGHT); }
    @JsonIgnore public boolean isHeightDirty() { return _contains(DTOFIELD_HEIGHT); }
    @JsonIgnore public void resetHeight() { _reset(DTOFIELD_HEIGHT); }
    @JsonIgnore public PSEditorTypeDTO height(Integer value) { setHeight(value); return this; }

    @JsonProperty("iconpath")
    public void setIconPath(String value) { _set(DTOFIELD_ICONPATH, value); }
    @JsonIgnore public String getIconPath() { return (String) _get(DTOFIELD_ICONPATH); }
    @JsonIgnore public boolean isIconPathDirty() { return _contains(DTOFIELD_ICONPATH); }
    @JsonIgnore public void resetIconPath() { _reset(DTOFIELD_ICONPATH); }
    @JsonIgnore public PSEditorTypeDTO iconpath(String value) { setIconPath(value); return this; }

    @JsonProperty("javaformat")
    public void setJavaFormat(String value) { _set(DTOFIELD_JAVAFORMAT, value); }
    @JsonIgnore public String getJavaFormat() { return (String) _get(DTOFIELD_JAVAFORMAT); }
    @JsonIgnore public boolean isJavaFormatDirty() { return _contains(DTOFIELD_JAVAFORMAT); }
    @JsonIgnore public void resetJavaFormat() { _reset(DTOFIELD_JAVAFORMAT); }
    @JsonIgnore public PSEditorTypeDTO javaformat(String value) { setJavaFormat(value); return this; }

    @JsonProperty("linkviewshowmode")
    public void setLinkViewShowMode(String value) { _set(DTOFIELD_LINKVIEWSHOWMODE, value); }
    @JsonIgnore public String getLinkViewShowMode() { return (String) _get(DTOFIELD_LINKVIEWSHOWMODE); }
    @JsonIgnore public boolean isLinkViewShowModeDirty() { return _contains(DTOFIELD_LINKVIEWSHOWMODE); }
    @JsonIgnore public void resetLinkViewShowMode() { _reset(DTOFIELD_LINKVIEWSHOWMODE); }
    @JsonIgnore public PSEditorTypeDTO linkviewshowmode(String value) { setLinkViewShowMode(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSEditorTypeDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("mobfieditor")
    public void setMobFIEditor(Integer value) { _set(DTOFIELD_MOBFIEDITOR, value); }
    @JsonIgnore public Integer getMobFIEditor() { return (Integer) _get(DTOFIELD_MOBFIEDITOR); }
    @JsonIgnore public boolean isMobFIEditorDirty() { return _contains(DTOFIELD_MOBFIEDITOR); }
    @JsonIgnore public void resetMobFIEditor() { _reset(DTOFIELD_MOBFIEDITOR); }
    @JsonIgnore public PSEditorTypeDTO mobfieditor(Integer value) { setMobFIEditor(value); return this; }
    @JsonIgnore public PSEditorTypeDTO mobfieditor(Boolean value) { setMobFIEditor(flagValue(value)); return this; }

    @JsonProperty("needcodelistconfig")
    public void setNeedCodeListConfig(Integer value) { _set(DTOFIELD_NEEDCODELISTCONFIG, value); }
    @JsonIgnore public Integer getNeedCodeListConfig() { return (Integer) _get(DTOFIELD_NEEDCODELISTCONFIG); }
    @JsonIgnore public boolean isNeedCodeListConfigDirty() { return _contains(DTOFIELD_NEEDCODELISTCONFIG); }
    @JsonIgnore public void resetNeedCodeListConfig() { _reset(DTOFIELD_NEEDCODELISTCONFIG); }
    @JsonIgnore public PSEditorTypeDTO needcodelistconfig(Integer value) { setNeedCodeListConfig(value); return this; }
    @JsonIgnore public PSEditorTypeDTO needcodelistconfig(Boolean value) { setNeedCodeListConfig(flagValue(value)); return this; }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) { _set(DTOFIELD_ORDERVALUE, value); }
    @JsonIgnore public Integer getOrderValue() { return (Integer) _get(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public boolean isOrderValueDirty() { return _contains(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public void resetOrderValue() { _reset(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public PSEditorTypeDTO ordervalue(Integer value) { setOrderValue(value); return this; }

    @JsonProperty("pseditortypeid")
    public void setPSEditorTypeId(String value) { _set(DTOFIELD_PSEDITORTYPEID, value); }
    @JsonIgnore public String getPSEditorTypeId() { return (String) _get(DTOFIELD_PSEDITORTYPEID); }
    @JsonIgnore public boolean isPSEditorTypeIdDirty() { return _contains(DTOFIELD_PSEDITORTYPEID); }
    @JsonIgnore public void resetPSEditorTypeId() { _reset(DTOFIELD_PSEDITORTYPEID); }
    @JsonIgnore public PSEditorTypeDTO pseditortypeid(String value) { setPSEditorTypeId(value); return this; }

    @JsonProperty("pseditortypename")
    public void setPSEditorTypeName(String value) { _set(DTOFIELD_PSEDITORTYPENAME, value); }
    @JsonIgnore public String getPSEditorTypeName() { return (String) _get(DTOFIELD_PSEDITORTYPENAME); }
    @JsonIgnore public boolean isPSEditorTypeNameDirty() { return _contains(DTOFIELD_PSEDITORTYPENAME); }
    @JsonIgnore public void resetPSEditorTypeName() { _reset(DTOFIELD_PSEDITORTYPENAME); }
    @JsonIgnore public PSEditorTypeDTO pseditortypename(String value) { setPSEditorTypeName(value); return this; }
    @JsonIgnore public String getName() { return getPSEditorTypeName(); }
    @JsonIgnore public void setName(String value) { setPSEditorTypeName(value); }
    @JsonIgnore public PSEditorTypeDTO name(String value) { setPSEditorTypeName(value); return this; }

    @JsonProperty("refviewshowmode")
    public void setRefViewShowMode(String value) { _set(DTOFIELD_REFVIEWSHOWMODE, value); }
    @JsonIgnore public String getRefViewShowMode() { return (String) _get(DTOFIELD_REFVIEWSHOWMODE); }
    @JsonIgnore public boolean isRefViewShowModeDirty() { return _contains(DTOFIELD_REFVIEWSHOWMODE); }
    @JsonIgnore public void resetRefViewShowMode() { _reset(DTOFIELD_REFVIEWSHOWMODE); }
    @JsonIgnore public PSEditorTypeDTO refviewshowmode(String value) { setRefViewShowMode(value); return this; }

    @JsonProperty("sbeditor")
    public void setSBEditor(Integer value) { _set(DTOFIELD_SBEDITOR, value); }
    @JsonIgnore public Integer getSBEditor() { return (Integer) _get(DTOFIELD_SBEDITOR); }
    @JsonIgnore public boolean isSBEditorDirty() { return _contains(DTOFIELD_SBEDITOR); }
    @JsonIgnore public void resetSBEditor() { _reset(DTOFIELD_SBEDITOR); }
    @JsonIgnore public PSEditorTypeDTO sbeditor(Integer value) { setSBEditor(value); return this; }
    @JsonIgnore public PSEditorTypeDTO sbeditor(Boolean value) { setSBEditor(flagValue(value)); return this; }

    @JsonProperty("standardeditor")
    public void setStandardEditor(String value) { _set(DTOFIELD_STANDARDEDITOR, value); }
    @JsonIgnore public String getStandardEditor() { return (String) _get(DTOFIELD_STANDARDEDITOR); }
    @JsonIgnore public boolean isStandardEditorDirty() { return _contains(DTOFIELD_STANDARDEDITOR); }
    @JsonIgnore public void resetStandardEditor() { _reset(DTOFIELD_STANDARDEDITOR); }
    @JsonIgnore public PSEditorTypeDTO standardeditor(String value) { setStandardEditor(value); return this; }

    @JsonProperty("standardtype")
    public void setStandardType(Integer value) { _set(DTOFIELD_STANDARDTYPE, value); }
    @JsonIgnore public Integer getStandardType() { return (Integer) _get(DTOFIELD_STANDARDTYPE); }
    @JsonIgnore public boolean isStandardTypeDirty() { return _contains(DTOFIELD_STANDARDTYPE); }
    @JsonIgnore public void resetStandardType() { _reset(DTOFIELD_STANDARDTYPE); }
    @JsonIgnore public PSEditorTypeDTO standardtype(Integer value) { setStandardType(value); return this; }
    @JsonIgnore public PSEditorTypeDTO standardtype(Boolean value) { setStandardType(flagValue(value)); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSEditorTypeDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSEditorTypeDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSEditorTypeDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSEditorTypeDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonProperty("valueprocessor")
    public void setValueProcessor(String value) { _set(DTOFIELD_VALUEPROCESSOR, value); }
    @JsonIgnore public String getValueProcessor() { return (String) _get(DTOFIELD_VALUEPROCESSOR); }
    @JsonIgnore public boolean isValueProcessorDirty() { return _contains(DTOFIELD_VALUEPROCESSOR); }
    @JsonIgnore public void resetValueProcessor() { _reset(DTOFIELD_VALUEPROCESSOR); }
    @JsonIgnore public PSEditorTypeDTO valueprocessor(String value) { setValueProcessor(value); return this; }

    @JsonProperty("width")
    public void setWidth(Integer value) { _set(DTOFIELD_WIDTH, value); }
    @JsonIgnore public Integer getWidth() { return (Integer) _get(DTOFIELD_WIDTH); }
    @JsonIgnore public boolean isWidthDirty() { return _contains(DTOFIELD_WIDTH); }
    @JsonIgnore public void resetWidth() { _reset(DTOFIELD_WIDTH); }
    @JsonIgnore public PSEditorTypeDTO width(Integer value) { setWidth(value); return this; }

    @JsonIgnore public String getId() { return getPSEditorTypeId(); }
    @JsonIgnore public void setId(String value) { setPSEditorTypeId(value); }
    @JsonIgnore public PSEditorTypeDTO id(String value) { setPSEditorTypeId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}