package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFSFItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEditorStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysResourceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchBarDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSearchBarItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ADDSEPARATOR = "ADDSEPARATOR";
    protected static final String DTOFIELD_ADDSEPARATOR = "addseparator";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLDYNACLASS = "CTRLDYNACLASS";
    protected static final String DTOFIELD_CTRLDYNACLASS = "ctrldynaclass";
    public static final String FIELD_CTRLHEIGHT = "CTRLHEIGHT";
    protected static final String DTOFIELD_CTRLHEIGHT = "ctrlheight";
    public static final String FIELD_CTRLPSSYSCSSID = "CTRLPSSYSCSSID";
    protected static final String DTOFIELD_CTRLPSSYSCSSID = "ctrlpssyscssid";
    public static final String FIELD_CTRLPSSYSCSSNAME = "CTRLPSSYSCSSNAME";
    protected static final String DTOFIELD_CTRLPSSYSCSSNAME = "ctrlpssyscssname";
    public static final String FIELD_CTRLRAWCSSSTYLE = "CTRLRAWCSSSTYLE";
    protected static final String DTOFIELD_CTRLRAWCSSSTYLE = "ctrlrawcssstyle";
    public static final String FIELD_CTRLWIDTH = "CTRLWIDTH";
    protected static final String DTOFIELD_CTRLWIDTH = "ctrlwidth";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_EDITORPARAMS = "EDITORPARAMS";
    protected static final String DTOFIELD_EDITORPARAMS = "editorparams";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_FILTERPSDEDSID = "FILTERPSDEDSID";
    protected static final String DTOFIELD_FILTERPSDEDSID = "filterpsdedsid";
    public static final String FIELD_FILTERPSDEDSNAME = "FILTERPSDEDSNAME";
    protected static final String DTOFIELD_FILTERPSDEDSNAME = "filterpsdedsname";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_HTMLCONTENT = "HTMLCONTENT";
    protected static final String DTOFIELD_HTMLCONTENT = "htmlcontent";
    public static final String FIELD_ITEMSUBTYPE = "ITEMSUBTYPE";
    protected static final String DTOFIELD_ITEMSUBTYPE = "itemsubtype";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_ITEMTYPE = "ITEMTYPE";
    protected static final String DTOFIELD_ITEMTYPE = "itemtype";
    public static final String FIELD_LABELDYNACLASS = "LABELDYNACLASS";
    protected static final String DTOFIELD_LABELDYNACLASS = "labeldynaclass";
    public static final String FIELD_LABELPOS = "LABELPOS";
    protected static final String DTOFIELD_LABELPOS = "labelpos";
    public static final String FIELD_LABELPSSYSCSSID = "LABELPSSYSCSSID";
    protected static final String DTOFIELD_LABELPSSYSCSSID = "labelpssyscssid";
    public static final String FIELD_LABELPSSYSCSSNAME = "LABELPSSYSCSSNAME";
    protected static final String DTOFIELD_LABELPSSYSCSSNAME = "labelpssyscssname";
    public static final String FIELD_LABELRAWCSSSTYLE = "LABELRAWCSSSTYLE";
    protected static final String DTOFIELD_LABELRAWCSSSTYLE = "labelrawcssstyle";
    public static final String FIELD_LABELWIDTH = "LABELWIDTH";
    protected static final String DTOFIELD_LABELWIDTH = "labelwidth";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFSFITEMID = "PSDEFSFITEMID";
    protected static final String DTOFIELD_PSDEFSFITEMID = "psdefsfitemid";
    public static final String FIELD_PSDEFSFITEMNAME = "PSDEFSFITEMNAME";
    protected static final String DTOFIELD_PSDEFSFITEMNAME = "psdefsfitemname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSEARCHBARID = "PSSYSSEARCHBARID";
    protected static final String DTOFIELD_PSSYSSEARCHBARID = "pssyssearchbarid";
    public static final String FIELD_PSSYSSEARCHBARITEMID = "PSSYSSEARCHBARITEMID";
    protected static final String DTOFIELD_PSSYSSEARCHBARITEMID = "pssyssearchbaritemid";
    public static final String FIELD_PSSYSSEARCHBARITEMNAME = "PSSYSSEARCHBARITEMNAME";
    protected static final String DTOFIELD_PSSYSSEARCHBARITEMNAME = "pssyssearchbaritemname";
    public static final String FIELD_PSSYSSEARCHBARNAME = "PSSYSSEARCHBARNAME";
    protected static final String DTOFIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_RAWCSSSTYLE = "RAWCSSSTYLE";
    protected static final String DTOFIELD_RAWCSSSTYLE = "rawcssstyle";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_SHOWCAPTION = "SHOWCAPTION";
    protected static final String DTOFIELD_SHOWCAPTION = "showcaption";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VALUEITEMNAME = "VALUEITEMNAME";
    protected static final String DTOFIELD_VALUEITEMNAME = "valueitemname";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

    @JsonProperty(value="addseparator")
    public void setAddSeparator(Integer addSeparator) {
        this._set(DTOFIELD_ADDSEPARATOR, addSeparator);
    }

    @JsonIgnore
    public Integer getAddSeparator() {
        Object objValue = this._get(DTOFIELD_ADDSEPARATOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAddSeparatorDirty() {
        return this._contains(DTOFIELD_ADDSEPARATOR);
    }

    @JsonIgnore
    public void resetAddSeparator() {
        this._reset(DTOFIELD_ADDSEPARATOR);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO addseparator(Integer addSeparator) {
        this.setAddSeparator(addSeparator);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO addseparator(Boolean addSeparator) {
        if (addSeparator == null) {
            this.setAddSeparator(null);
        } else {
            this.setAddSeparator(addSeparator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="cappslanresid")
    public void setCapPSLanResId(String capPSLanResId) {
        this._set(DTOFIELD_CAPPSLANRESID, capPSLanResId);
    }

    @JsonIgnore
    public String getCapPSLanResId() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResIdDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public void resetCapPSLanResId() {
        this._reset(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        } else {
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cappslanresname")
    public void setCapPSLanResName(String capPSLanResName) {
        this._set(DTOFIELD_CAPPSLANRESNAME, capPSLanResName);
    }

    @JsonIgnore
    public String getCapPSLanResName() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResNameDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCapPSLanResName() {
        this._reset(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    @JsonProperty(value="caption")
    public void setCaption(String caption) {
        this._set(DTOFIELD_CAPTION, caption);
    }

    @JsonIgnore
    public String getCaption() {
        Object objValue = this._get(DTOFIELD_CAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionDirty() {
        return this._contains(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public void resetCaption() {
        this._reset(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="contenttype")
    public void setContentType(String contentType) {
        this._set(DTOFIELD_CONTENTTYPE, contentType);
    }

    @JsonIgnore
    public String getContentType() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypeDirty() {
        return this._contains(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public void resetContentType() {
        this._reset(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO contenttype(PSModelEnums.RawItemContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
        }
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
    public PSSysSearchBarItemDTO createdate(Timestamp createDate) {
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
    public PSSysSearchBarItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrldynaclass")
    public void setCtrlDynaClass(String ctrlDynaClass) {
        this._set(DTOFIELD_CTRLDYNACLASS, ctrlDynaClass);
    }

    @JsonIgnore
    public String getCtrlDynaClass() {
        Object objValue = this._get(DTOFIELD_CTRLDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlDynaClassDirty() {
        return this._contains(DTOFIELD_CTRLDYNACLASS);
    }

    @JsonIgnore
    public void resetCtrlDynaClass() {
        this._reset(DTOFIELD_CTRLDYNACLASS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrldynaclass(String ctrlDynaClass) {
        this.setCtrlDynaClass(ctrlDynaClass);
        return this;
    }

    @JsonProperty(value="ctrlheight")
    public void setCtrlHeight(Integer ctrlHeight) {
        this._set(DTOFIELD_CTRLHEIGHT, ctrlHeight);
    }

    @JsonIgnore
    public Integer getCtrlHeight() {
        Object objValue = this._get(DTOFIELD_CTRLHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlHeightDirty() {
        return this._contains(DTOFIELD_CTRLHEIGHT);
    }

    @JsonIgnore
    public void resetCtrlHeight() {
        this._reset(DTOFIELD_CTRLHEIGHT);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlheight(Integer ctrlHeight) {
        this.setCtrlHeight(ctrlHeight);
        return this;
    }

    @JsonProperty(value="ctrlpssyscssid")
    public void setCtrlPSSysCssId(String ctrlPSSysCssId) {
        this._set(DTOFIELD_CTRLPSSYSCSSID, ctrlPSSysCssId);
    }

    @JsonIgnore
    public String getCtrlPSSysCssId() {
        Object objValue = this._get(DTOFIELD_CTRLPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPSSysCssIdDirty() {
        return this._contains(DTOFIELD_CTRLPSSYSCSSID);
    }

    @JsonIgnore
    public void resetCtrlPSSysCssId() {
        this._reset(DTOFIELD_CTRLPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlpssyscssid(String ctrlPSSysCssId) {
        this.setCtrlPSSysCssId(ctrlPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setCtrlPSSysCssId(null);
            this.setCtrlPSSysCssName(null);
        } else {
            this.setCtrlPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCtrlPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="ctrlpssyscssname")
    public void setCtrlPSSysCssName(String ctrlPSSysCssName) {
        this._set(DTOFIELD_CTRLPSSYSCSSNAME, ctrlPSSysCssName);
    }

    @JsonIgnore
    public String getCtrlPSSysCssName() {
        Object objValue = this._get(DTOFIELD_CTRLPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPSSysCssNameDirty() {
        return this._contains(DTOFIELD_CTRLPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetCtrlPSSysCssName() {
        this._reset(DTOFIELD_CTRLPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlpssyscssname(String ctrlPSSysCssName) {
        this.setCtrlPSSysCssName(ctrlPSSysCssName);
        return this;
    }

    @JsonProperty(value="ctrlrawcssstyle")
    public void setCtrlRawCssStyle(String ctrlRawCssStyle) {
        this._set(DTOFIELD_CTRLRAWCSSSTYLE, ctrlRawCssStyle);
    }

    @JsonIgnore
    public String getCtrlRawCssStyle() {
        Object objValue = this._get(DTOFIELD_CTRLRAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlRawCssStyleDirty() {
        return this._contains(DTOFIELD_CTRLRAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetCtrlRawCssStyle() {
        this._reset(DTOFIELD_CTRLRAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlrawcssstyle(String ctrlRawCssStyle) {
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
        return this;
    }

    @JsonProperty(value="ctrlwidth")
    public void setCtrlWidth(Integer ctrlWidth) {
        this._set(DTOFIELD_CTRLWIDTH, ctrlWidth);
    }

    @JsonIgnore
    public Integer getCtrlWidth() {
        Object objValue = this._get(DTOFIELD_CTRLWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlWidthDirty() {
        return this._contains(DTOFIELD_CTRLWIDTH);
    }

    @JsonIgnore
    public void resetCtrlWidth() {
        this._reset(DTOFIELD_CTRLWIDTH);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ctrlwidth(Integer ctrlWidth) {
        this.setCtrlWidth(ctrlWidth);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dynaclass")
    public void setDynaClass(String dynaClass) {
        this._set(DTOFIELD_DYNACLASS, dynaClass);
    }

    @JsonIgnore
    public String getDynaClass() {
        Object objValue = this._get(DTOFIELD_DYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaClassDirty() {
        return this._contains(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public void resetDynaClass() {
        this._reset(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="editorparams")
    public void setEditorParams(String editorParams) {
        this._set(DTOFIELD_EDITORPARAMS, editorParams);
    }

    @JsonIgnore
    public String getEditorParams() {
        Object objValue = this._get(DTOFIELD_EDITORPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorParamsDirty() {
        return this._contains(DTOFIELD_EDITORPARAMS);
    }

    @JsonIgnore
    public void resetEditorParams() {
        this._reset(DTOFIELD_EDITORPARAMS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO editorparams(String editorParams) {
        this.setEditorParams(editorParams);
        return this;
    }

    @JsonProperty(value="editortype")
    public void setEditorType(String editorType) {
        this._set(DTOFIELD_EDITORTYPE, editorType);
    }

    @JsonIgnore
    public String getEditorType() {
        Object objValue = this._get(DTOFIELD_EDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorTypeDirty() {
        return this._contains(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public void resetEditorType() {
        this._reset(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO editortype(String editorType) {
        this.setEditorType(editorType);
        return this;
    }

    @JsonProperty(value="filterpsdedsid")
    public void setFilterPSDEDSId(String filterPSDEDSId) {
        this._set(DTOFIELD_FILTERPSDEDSID, filterPSDEDSId);
    }

    @JsonIgnore
    public String getFilterPSDEDSId() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public void resetFilterPSDEDSId() {
        this._reset(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO filterpsdedsid(String filterPSDEDSId) {
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO filterpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        } else {
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="filterpsdedsname")
    public void setFilterPSDEDSName(String filterPSDEDSName) {
        this._set(DTOFIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }

    @JsonIgnore
    public String getFilterPSDEDSName() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public void resetFilterPSDEDSName() {
        this._reset(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO filterpsdedsname(String filterPSDEDSName) {
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(Integer height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public Integer getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHeightDirty() {
        return this._contains(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public void resetHeight() {
        this._reset(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="htmlcontent")
    public void setHtmlContent(String htmlContent) {
        this._set(DTOFIELD_HTMLCONTENT, htmlContent);
    }

    @JsonIgnore
    public String getHtmlContent() {
        Object objValue = this._get(DTOFIELD_HTMLCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlContentDirty() {
        return this._contains(DTOFIELD_HTMLCONTENT);
    }

    @JsonIgnore
    public void resetHtmlContent() {
        this._reset(DTOFIELD_HTMLCONTENT);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO htmlcontent(String htmlContent) {
        this.setHtmlContent(htmlContent);
        return this;
    }

    @JsonProperty(value="itemsubtype")
    public void setItemSubType(String itemSubType) {
        this._set(DTOFIELD_ITEMSUBTYPE, itemSubType);
    }

    @JsonIgnore
    public String getItemSubType() {
        Object objValue = this._get(DTOFIELD_ITEMSUBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemSubTypeDirty() {
        return this._contains(DTOFIELD_ITEMSUBTYPE);
    }

    @JsonIgnore
    public void resetItemSubType() {
        this._reset(DTOFIELD_ITEMSUBTYPE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemsubtype(String itemSubType) {
        this.setItemSubType(itemSubType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemsubtype(PSModelEnums.SearchBarItemSubType itemSubType) {
        if (itemSubType == null) {
            this.setItemSubType(null);
        } else {
            this.setItemSubType(itemSubType.value);
        }
        return this;
    }

    @JsonProperty(value="itemtag")
    public void setItemTag(String itemTag) {
        this._set(DTOFIELD_ITEMTAG, itemTag);
    }

    @JsonIgnore
    public String getItemTag() {
        Object objValue = this._get(DTOFIELD_ITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTagDirty() {
        return this._contains(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public void resetItemTag() {
        this._reset(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemtag(String itemTag) {
        this.setItemTag(itemTag);
        return this;
    }

    @JsonProperty(value="itemtag2")
    public void setItemTag2(String itemTag2) {
        this._set(DTOFIELD_ITEMTAG2, itemTag2);
    }

    @JsonIgnore
    public String getItemTag2() {
        Object objValue = this._get(DTOFIELD_ITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag2Dirty() {
        return this._contains(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public void resetItemTag2() {
        this._reset(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
        return this;
    }

    @JsonProperty(value="itemtype")
    public void setItemType(String itemType) {
        this._set(DTOFIELD_ITEMTYPE, itemType);
    }

    @JsonIgnore
    public String getItemType() {
        Object objValue = this._get(DTOFIELD_ITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTypeDirty() {
        return this._contains(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public void resetItemType() {
        this._reset(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemtype(String itemType) {
        this.setItemType(itemType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO itemtype(PSModelEnums.SearchBarItemType itemType) {
        if (itemType == null) {
            this.setItemType(null);
        } else {
            this.setItemType(itemType.value);
        }
        return this;
    }

    @JsonProperty(value="labeldynaclass")
    public void setLabelDynaClass(String labelDynaClass) {
        this._set(DTOFIELD_LABELDYNACLASS, labelDynaClass);
    }

    @JsonIgnore
    public String getLabelDynaClass() {
        Object objValue = this._get(DTOFIELD_LABELDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelDynaClassDirty() {
        return this._contains(DTOFIELD_LABELDYNACLASS);
    }

    @JsonIgnore
    public void resetLabelDynaClass() {
        this._reset(DTOFIELD_LABELDYNACLASS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labeldynaclass(String labelDynaClass) {
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    @JsonProperty(value="labelpos")
    public void setLabelPos(String labelPos) {
        this._set(DTOFIELD_LABELPOS, labelPos);
    }

    @JsonIgnore
    public String getLabelPos() {
        Object objValue = this._get(DTOFIELD_LABELPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPosDirty() {
        return this._contains(DTOFIELD_LABELPOS);
    }

    @JsonIgnore
    public void resetLabelPos() {
        this._reset(DTOFIELD_LABELPOS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelpos(String labelPos) {
        this.setLabelPos(labelPos);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelpos(PSModelEnums.LabelPos labelPos) {
        if (labelPos == null) {
            this.setLabelPos(null);
        } else {
            this.setLabelPos(labelPos.value);
        }
        return this;
    }

    @JsonProperty(value="labelpssyscssid")
    public void setLabelPSSysCssId(String labelPSSysCssId) {
        this._set(DTOFIELD_LABELPSSYSCSSID, labelPSSysCssId);
    }

    @JsonIgnore
    public String getLabelPSSysCssId() {
        Object objValue = this._get(DTOFIELD_LABELPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPSSysCssIdDirty() {
        return this._contains(DTOFIELD_LABELPSSYSCSSID);
    }

    @JsonIgnore
    public void resetLabelPSSysCssId() {
        this._reset(DTOFIELD_LABELPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelpssyscssid(String labelPSSysCssId) {
        this.setLabelPSSysCssId(labelPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setLabelPSSysCssId(null);
            this.setLabelPSSysCssName(null);
        } else {
            this.setLabelPSSysCssId(pSSysCss.getPSSysCssId());
            this.setLabelPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="labelpssyscssname")
    public void setLabelPSSysCssName(String labelPSSysCssName) {
        this._set(DTOFIELD_LABELPSSYSCSSNAME, labelPSSysCssName);
    }

    @JsonIgnore
    public String getLabelPSSysCssName() {
        Object objValue = this._get(DTOFIELD_LABELPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPSSysCssNameDirty() {
        return this._contains(DTOFIELD_LABELPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetLabelPSSysCssName() {
        this._reset(DTOFIELD_LABELPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelpssyscssname(String labelPSSysCssName) {
        this.setLabelPSSysCssName(labelPSSysCssName);
        return this;
    }

    @JsonProperty(value="labelrawcssstyle")
    public void setLabelRawCssStyle(String labelRawCssStyle) {
        this._set(DTOFIELD_LABELRAWCSSSTYLE, labelRawCssStyle);
    }

    @JsonIgnore
    public String getLabelRawCssStyle() {
        Object objValue = this._get(DTOFIELD_LABELRAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelRawCssStyleDirty() {
        return this._contains(DTOFIELD_LABELRAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetLabelRawCssStyle() {
        this._reset(DTOFIELD_LABELRAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelrawcssstyle(String labelRawCssStyle) {
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    @JsonProperty(value="labelwidth")
    public void setLabelWidth(Integer labelWidth) {
        this._set(DTOFIELD_LABELWIDTH, labelWidth);
    }

    @JsonIgnore
    public Integer getLabelWidth() {
        Object objValue = this._get(DTOFIELD_LABELWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLabelWidthDirty() {
        return this._contains(DTOFIELD_LABELWIDTH);
    }

    @JsonIgnore
    public void resetLabelWidth() {
        this._reset(DTOFIELD_LABELWIDTH);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO labelwidth(Integer labelWidth) {
        this.setLabelWidth(labelWidth);
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
    public PSSysSearchBarItemDTO memo(String memo) {
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
    public PSSysSearchBarItemDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="phpslanresid")
    public void setPHPSLanResId(String pHPSLanResId) {
        this._set(DTOFIELD_PHPSLANRESID, pHPSLanResId);
    }

    @JsonIgnore
    public String getPHPSLanResId() {
        Object objValue = this._get(DTOFIELD_PHPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPHPSLanResIdDirty() {
        return this._contains(DTOFIELD_PHPSLANRESID);
    }

    @JsonIgnore
    public void resetPHPSLanResId() {
        this._reset(DTOFIELD_PHPSLANRESID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        } else {
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="phpslanresname")
    public void setPHPSLanResName(String pHPSLanResName) {
        this._set(DTOFIELD_PHPSLANRESNAME, pHPSLanResName);
    }

    @JsonIgnore
    public String getPHPSLanResName() {
        Object objValue = this._get(DTOFIELD_PHPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPHPSLanResNameDirty() {
        return this._contains(DTOFIELD_PHPSLANRESNAME);
    }

    @JsonIgnore
    public void resetPHPSLanResName() {
        this._reset(DTOFIELD_PHPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO phpslanresname(String pHPSLanResName) {
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    @JsonProperty(value="placeholder")
    public void setPlaceHolder(String placeHolder) {
        this._set(DTOFIELD_PLACEHOLDER, placeHolder);
    }

    @JsonIgnore
    public String getPlaceHolder() {
        Object objValue = this._get(DTOFIELD_PLACEHOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlaceHolderDirty() {
        return this._contains(DTOFIELD_PLACEHOLDER);
    }

    @JsonIgnore
    public void resetPlaceHolder() {
        this._reset(DTOFIELD_PLACEHOLDER);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO placeholder(String placeHolder) {
        this.setPlaceHolder(placeHolder);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdefsfitemid")
    public void setPSDEFSFItemId(String pSDEFSFItemId) {
        this._set(DTOFIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }

    @JsonIgnore
    public String getPSDEFSFItemId() {
        Object objValue = this._get(DTOFIELD_PSDEFSFITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty() {
        return this._contains(DTOFIELD_PSDEFSFITEMID);
    }

    @JsonIgnore
    public void resetPSDEFSFItemId() {
        this._reset(DTOFIELD_PSDEFSFITEMID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefsfitemid(String pSDEFSFItemId) {
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefsfitemid(PSDEFSFItemDTO pSDEFSFItem) {
        if (pSDEFSFItem == null) {
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        } else {
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    @JsonProperty(value="psdefsfitemname")
    public void setPSDEFSFItemName(String pSDEFSFItemName) {
        this._set(DTOFIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }

    @JsonIgnore
    public String getPSDEFSFItemName() {
        Object objValue = this._get(DTOFIELD_PSDEFSFITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty() {
        return this._contains(DTOFIELD_PSDEFSFITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEFSFItemName() {
        this._reset(DTOFIELD_PSDEFSFITEMNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO psdefsfitemname(String pSDEFSFItemName) {
        this.setPSDEFSFItemName(pSDEFSFItemName);
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
    public PSSysSearchBarItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSSysSearchBarItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysSearchBarItemDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssyseditorstyleid")
    public void setPSSysEditorStyleId(String pSSysEditorStyleId) {
        this._set(DTOFIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }

    @JsonIgnore
    public String getPSSysEditorStyleId() {
        Object objValue = this._get(DTOFIELD_PSSYSEDITORSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty() {
        return this._contains(DTOFIELD_PSSYSEDITORSTYLEID);
    }

    @JsonIgnore
    public void resetPSSysEditorStyleId() {
        this._reset(DTOFIELD_PSSYSEDITORSTYLEID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
        if (pSSysEditorStyle == null) {
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        } else {
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    @JsonProperty(value="pssyseditorstylename")
    public void setPSSysEditorStyleName(String pSSysEditorStyleName) {
        this._set(DTOFIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }

    @JsonIgnore
    public String getPSSysEditorStyleName() {
        Object objValue = this._get(DTOFIELD_PSSYSEDITORSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty() {
        return this._contains(DTOFIELD_PSSYSEDITORSTYLENAME);
    }

    @JsonIgnore
    public void resetPSSysEditorStyleName() {
        this._reset(DTOFIELD_PSSYSEDITORSTYLENAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyseditorstylename(String pSSysEditorStyleName) {
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageIdDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetPSSysImageId() {
        this._reset(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        } else {
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="pssysimagename")
    public void setPSSysImageName(String pSSysImageName) {
        this._set(DTOFIELD_PSSYSIMAGENAME, pSSysImageName);
    }

    @JsonIgnore
    public String getPSSysImageName() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageNameDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetPSSysImageName() {
        this._reset(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSSysSearchBarItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysSearchBarItemDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssearchbarid")
    public void setPSSysSearchBarId(String pSSysSearchBarId) {
        this._set(DTOFIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }

    @JsonIgnore
    public String getPSSysSearchBarId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public void resetPSSysSearchBarId() {
        this._reset(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyssearchbarid(String pSSysSearchBarId) {
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyssearchbarid(PSSysSearchBarDTO pSSysSearchBar) {
        if (pSSysSearchBar == null) {
            this.setMobFlag(null);
            this.setPSDEId(null);
            this.setPSSysSearchBarId(null);
            this.setPSSysSearchBarName(null);
        } else {
            this.setMobFlag(pSSysSearchBar.getMobFlag());
            this.setPSDEId(pSSysSearchBar.getPSDEId());
            this.setPSSysSearchBarId(pSSysSearchBar.getPSSysSearchBarId());
            this.setPSSysSearchBarName(pSSysSearchBar.getPSSysSearchBarName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchbaritemid")
    public void setPSSysSearchBarItemId(String pSSysSearchBarItemId) {
        this._set(DTOFIELD_PSSYSSEARCHBARITEMID, pSSysSearchBarItemId);
    }

    @JsonIgnore
    public String getPSSysSearchBarItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARITEMID);
    }

    @JsonIgnore
    public void resetPSSysSearchBarItemId() {
        this._reset(DTOFIELD_PSSYSSEARCHBARITEMID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyssearchbaritemid(String pSSysSearchBarItemId) {
        this.setPSSysSearchBarItemId(pSSysSearchBarItemId);
        return this;
    }

    @JsonProperty(value="pssyssearchbaritemname")
    public void setPSSysSearchBarItemName(String pSSysSearchBarItemName) {
        this._set(DTOFIELD_PSSYSSEARCHBARITEMNAME, pSSysSearchBarItemName);
    }

    @JsonIgnore
    public String getPSSysSearchBarItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchBarItemName() {
        this._reset(DTOFIELD_PSSYSSEARCHBARITEMNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyssearchbaritemname(String pSSysSearchBarItemName) {
        this.setPSSysSearchBarItemName(pSSysSearchBarItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSearchBarItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSearchBarItemName(strName);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO name(String strName) {
        this.setPSSysSearchBarItemName(strName);
        return this;
    }

    @JsonProperty(value="pssyssearchbarname")
    public void setPSSysSearchBarName(String pSSysSearchBarName) {
        this._set(DTOFIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }

    @JsonIgnore
    public String getPSSysSearchBarName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchBarName() {
        this._reset(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO pssyssearchbarname(String pSSysSearchBarName) {
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    @JsonProperty(value="rawcontent")
    public void setRawContent(String rawContent) {
        this._set(DTOFIELD_RAWCONTENT, rawContent);
    }

    @JsonIgnore
    public String getRawContent() {
        Object objValue = this._get(DTOFIELD_RAWCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawContentDirty() {
        return this._contains(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public void resetRawContent() {
        this._reset(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO rawcontent(String rawContent) {
        this.setRawContent(rawContent);
        return this;
    }

    @JsonProperty(value="rawcssstyle")
    public void setRawCssStyle(String rawCssStyle) {
        this._set(DTOFIELD_RAWCSSSTYLE, rawCssStyle);
    }

    @JsonIgnore
    public String getRawCssStyle() {
        Object objValue = this._get(DTOFIELD_RAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawCssStyleDirty() {
        return this._contains(DTOFIELD_RAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetRawCssStyle() {
        this._reset(DTOFIELD_RAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO rawcssstyle(String rawCssStyle) {
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    @JsonProperty(value="rawservicemethod")
    public void setRawServiceMethod(String rawServiceMethod) {
        this._set(DTOFIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }

    @JsonIgnore
    public String getRawServiceMethod() {
        Object objValue = this._get(DTOFIELD_RAWSERVICEMETHOD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawServiceMethodDirty() {
        return this._contains(DTOFIELD_RAWSERVICEMETHOD);
    }

    @JsonIgnore
    public void resetRawServiceMethod() {
        this._reset(DTOFIELD_RAWSERVICEMETHOD);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
        if (rawServiceMethod == null) {
            this.setRawServiceMethod(null);
        } else {
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    @JsonProperty(value="rawserviceurl")
    public void setRawServiceUrl(String rawServiceUrl) {
        this._set(DTOFIELD_RAWSERVICEURL, rawServiceUrl);
    }

    @JsonIgnore
    public String getRawServiceUrl() {
        Object objValue = this._get(DTOFIELD_RAWSERVICEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawServiceUrlDirty() {
        return this._contains(DTOFIELD_RAWSERVICEURL);
    }

    @JsonIgnore
    public void resetRawServiceUrl() {
        this._reset(DTOFIELD_RAWSERVICEURL);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    @JsonProperty(value="resetitemname")
    public void setResetItemName(String resetItemName) {
        this._set(DTOFIELD_RESETITEMNAME, resetItemName);
    }

    @JsonIgnore
    public String getResetItemName() {
        Object objValue = this._get(DTOFIELD_RESETITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResetItemNameDirty() {
        return this._contains(DTOFIELD_RESETITEMNAME);
    }

    @JsonIgnore
    public void resetResetItemName() {
        this._reset(DTOFIELD_RESETITEMNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
        return this;
    }

    @JsonProperty(value="showcaption")
    public void setShowCaption(Integer showCaption) {
        this._set(DTOFIELD_SHOWCAPTION, showCaption);
    }

    @JsonIgnore
    public Integer getShowCaption() {
        Object objValue = this._get(DTOFIELD_SHOWCAPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowCaptionDirty() {
        return this._contains(DTOFIELD_SHOWCAPTION);
    }

    @JsonIgnore
    public void resetShowCaption() {
        this._reset(DTOFIELD_SHOWCAPTION);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO showcaption(Integer showCaption) {
        this.setShowCaption(showCaption);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO showcaption(Boolean showCaption) {
        if (showCaption == null) {
            this.setShowCaption(null);
        } else {
            this.setShowCaption(showCaption != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="templatemode")
    public void setTemplateMode(Integer templateMode) {
        this._set(DTOFIELD_TEMPLATEMODE, templateMode);
    }

    @JsonIgnore
    public Integer getTemplateMode() {
        Object objValue = this._get(DTOFIELD_TEMPLATEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplateModeDirty() {
        return this._contains(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public void resetTemplateMode() {
        this._reset(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO templatemode(Boolean templateMode) {
        if (templateMode == null) {
            this.setTemplateMode(null);
        } else {
            this.setTemplateMode(templateMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tippslanresid")
    public void setTipPSLanResId(String tipPSLanResId) {
        this._set(DTOFIELD_TIPPSLANRESID, tipPSLanResId);
    }

    @JsonIgnore
    public String getTipPSLanResId() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResIdDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public void resetTipPSLanResId() {
        this._reset(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        } else {
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="tippslanresname")
    public void setTipPSLanResName(String tipPSLanResName) {
        this._set(DTOFIELD_TIPPSLANRESNAME, tipPSLanResName);
    }

    @JsonIgnore
    public String getTipPSLanResName() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResNameDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTipPSLanResName() {
        this._reset(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="tooltipinfo")
    public void setTooltipInfo(String tooltipInfo) {
        this._set(DTOFIELD_TOOLTIPINFO, tooltipInfo);
    }

    @JsonIgnore
    public String getTooltipInfo() {
        Object objValue = this._get(DTOFIELD_TOOLTIPINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTooltipInfoDirty() {
        return this._contains(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public void resetTooltipInfo() {
        this._reset(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
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
    public PSSysSearchBarItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysSearchBarItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return this._contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        this._reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usertag(String userTag) {
        this.setUserTag(userTag);
        return this;
    }

    @JsonProperty(value="usertag2")
    public void setUserTag2(String userTag2) {
        this._set(DTOFIELD_USERTAG2, userTag2);
    }

    @JsonIgnore
    public String getUserTag2() {
        Object objValue = this._get(DTOFIELD_USERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return this._contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        this._reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="usertag3")
    public void setUserTag3(String userTag3) {
        this._set(DTOFIELD_USERTAG3, userTag3);
    }

    @JsonIgnore
    public String getUserTag3() {
        Object objValue = this._get(DTOFIELD_USERTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return this._contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        this._reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usertag3(String userTag3) {
        this.setUserTag3(userTag3);
        return this;
    }

    @JsonProperty(value="usertag4")
    public void setUserTag4(String userTag4) {
        this._set(DTOFIELD_USERTAG4, userTag4);
    }

    @JsonIgnore
    public String getUserTag4() {
        Object objValue = this._get(DTOFIELD_USERTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return this._contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        this._reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isValidFlagDirty() {
        return this._contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetValidFlag() {
        this._reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valueitemname")
    public void setValueItemName(String valueItemName) {
        this._set(DTOFIELD_VALUEITEMNAME, valueItemName);
    }

    @JsonIgnore
    public String getValueItemName() {
        Object objValue = this._get(DTOFIELD_VALUEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueItemNameDirty() {
        return this._contains(DTOFIELD_VALUEITEMNAME);
    }

    @JsonIgnore
    public void resetValueItemName() {
        this._reset(DTOFIELD_VALUEITEMNAME);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO valueitemname(String valueItemName) {
        this.setValueItemName(valueItemName);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(BigDecimal width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public BigDecimal getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isWidthDirty() {
        return this._contains(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public void resetWidth() {
        this._reset(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO width(BigDecimal width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSearchBarItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSearchBarItemId(strValue);
    }

    @JsonIgnore
    public PSSysSearchBarItemDTO id(String strValue) {
        this.setPSSysSearchBarItemId(strValue);
        return this;
    }
}
