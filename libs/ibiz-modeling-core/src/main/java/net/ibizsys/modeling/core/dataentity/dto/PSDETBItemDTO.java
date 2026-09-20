package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETBItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONLEVEL = "ACTIONLEVEL";
    protected static final String DTOFIELD_ACTIONLEVEL = "actionlevel";
    public static final String FIELD_BORDERSTYLE = "BORDERSTYLE";
    protected static final String DTOFIELD_BORDERSTYLE = "borderstyle";
    public static final String FIELD_BTNACTIONTYPE = "BTNACTIONTYPE";
    protected static final String DTOFIELD_BTNACTIONTYPE = "btnactiontype";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_COUNTERID = "COUNTERID";
    protected static final String DTOFIELD_COUNTERID = "counterid";
    public static final String FIELD_COUNTERMODE = "COUNTERMODE";
    protected static final String DTOFIELD_COUNTERMODE = "countermode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DEUACAP = "DEUACAP";
    protected static final String DTOFIELD_DEUACAP = "deuacap";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_GROUPEXTRACTMODE = "GROUPEXTRACTMODE";
    protected static final String DTOFIELD_GROUPEXTRACTMODE = "groupextractmode";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_HIDDENITEM = "HIDDENITEM";
    protected static final String DTOFIELD_HIDDENITEM = "hiddenitem";
    public static final String FIELD_HTMLCONTENT = "HTMLCONTENT";
    protected static final String DTOFIELD_HTMLCONTENT = "htmlcontent";
    public static final String FIELD_HTMLPAGEURL = "HTMLPAGEURL";
    protected static final String DTOFIELD_HTMLPAGEURL = "htmlpageurl";
    public static final String FIELD_ITEMSTYLE = "ITEMSTYLE";
    protected static final String DTOFIELD_ITEMSTYLE = "itemstyle";
    public static final String FIELD_ITEMSTYLETEXT = "ITEMSTYLETEXT";
    protected static final String DTOFIELD_ITEMSTYLETEXT = "itemstyletext";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
    public static final String FIELD_OPENPSAPPVIEWID = "OPENPSAPPVIEWID";
    protected static final String DTOFIELD_OPENPSAPPVIEWID = "openpsappviewid";
    public static final String FIELD_OPENPSAPPVIEWNAME = "OPENPSAPPVIEWNAME";
    protected static final String DTOFIELD_OPENPSAPPVIEWNAME = "openpsappviewname";
    public static final String FIELD_OPENPSDEVIEWID = "OPENPSDEVIEWID";
    protected static final String DTOFIELD_OPENPSDEVIEWID = "openpsdeviewid";
    public static final String FIELD_OPENPSDEVIEWNAME = "OPENPSDEVIEWNAME";
    protected static final String DTOFIELD_OPENPSDEVIEWNAME = "openpsdeviewname";
    public static final String FIELD_OPENPSSYSPDTVIEWID = "OPENPSSYSPDTVIEWID";
    protected static final String DTOFIELD_OPENPSSYSPDTVIEWID = "openpssyspdtviewid";
    public static final String FIELD_OPENPSSYSPDTVIEWNAME = "OPENPSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_OPENPSSYSPDTVIEWNAME = "openpssyspdtviewname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSDETBITEMID = "PPSDETBITEMID";
    protected static final String DTOFIELD_PPSDETBITEMID = "ppsdetbitemid";
    public static final String FIELD_PPSDETBITEMNAME = "PPSDETBITEMNAME";
    protected static final String DTOFIELD_PPSDETBITEMNAME = "ppsdetbitemname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDETBITEMID = "PSDETBITEMID";
    protected static final String DTOFIELD_PSDETBITEMID = "psdetbitemid";
    public static final String FIELD_PSDETBITEMNAME = "PSDETBITEMNAME";
    protected static final String DTOFIELD_PSDETBITEMNAME = "psdetbitemname";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
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
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_RAWCSSSTYLE = "RAWCSSSTYLE";
    protected static final String DTOFIELD_RAWCSSSTYLE = "rawcssstyle";
    public static final String FIELD_SHOWMODE = "SHOWMODE";
    protected static final String DTOFIELD_SHOWMODE = "showmode";
    public static final String FIELD_SPANFLAG = "SPANFLAG";
    protected static final String DTOFIELD_SPANFLAG = "spanflag";
    public static final String FIELD_TBITEMTYPE = "TBITEMTYPE";
    protected static final String DTOFIELD_TBITEMTYPE = "tbitemtype";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOGGLEMODE = "TOGGLEMODE";
    protected static final String DTOFIELD_TOGGLEMODE = "togglemode";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_UIACTIONPARAMS = "UIACTIONPARAMS";
    protected static final String DTOFIELD_UIACTIONPARAMS = "uiactionparams";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String DTOFIELD_PSDETBITEMS = "psdetbitems";

    @JsonProperty(value="actionlevel")
    public void setActionLevel(Integer actionLevel) {
        this._set(DTOFIELD_ACTIONLEVEL, actionLevel);
    }

    @JsonIgnore
    public Integer getActionLevel() {
        Object objValue = this._get(DTOFIELD_ACTIONLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionLevelDirty() {
        return this._contains(DTOFIELD_ACTIONLEVEL);
    }

    @JsonIgnore
    public void resetActionLevel() {
        this._reset(DTOFIELD_ACTIONLEVEL);
    }

    @JsonIgnore
    public PSDETBItemDTO actionlevel(Integer actionLevel) {
        this.setActionLevel(actionLevel);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO actionlevel(PSModelEnums.UIActionLevel actionLevel) {
        if (actionLevel == null) {
            this.setActionLevel(null);
        } else {
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    @JsonProperty(value="borderstyle")
    public void setBorderStyle(String borderStyle) {
        this._set(DTOFIELD_BORDERSTYLE, borderStyle);
    }

    @JsonIgnore
    public String getBorderStyle() {
        Object objValue = this._get(DTOFIELD_BORDERSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderStyleDirty() {
        return this._contains(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public void resetBorderStyle() {
        this._reset(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public PSDETBItemDTO borderstyle(String borderStyle) {
        this.setBorderStyle(borderStyle);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO borderstyle(PSModelEnums.BorderStyle borderStyle) {
        if (borderStyle == null) {
            this.setBorderStyle(null);
        } else {
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    @JsonProperty(value="btnactiontype")
    public void setBtnActionType(String btnActionType) {
        this._set(DTOFIELD_BTNACTIONTYPE, btnActionType);
    }

    @JsonIgnore
    public String getBtnActionType() {
        Object objValue = this._get(DTOFIELD_BTNACTIONTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBtnActionTypeDirty() {
        return this._contains(DTOFIELD_BTNACTIONTYPE);
    }

    @JsonIgnore
    public void resetBtnActionType() {
        this._reset(DTOFIELD_BTNACTIONTYPE);
    }

    @JsonIgnore
    public PSDETBItemDTO btnactiontype(String btnActionType) {
        this.setBtnActionType(btnActionType);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO btnactiontype(PSModelEnums.ToolbarButtonActionType btnActionType) {
        if (btnActionType == null) {
            this.setBtnActionType(null);
        } else {
            this.setBtnActionType(btnActionType.value);
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
    public PSDETBItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDETBItemDTO cappslanresname(String capPSLanResName) {
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
    public PSDETBItemDTO caption(String caption) {
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
    public PSDETBItemDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO contenttype(PSModelEnums.RawItemContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
        }
        return this;
    }

    @JsonProperty(value="counterid")
    public void setCounterId(String counterId) {
        this._set(DTOFIELD_COUNTERID, counterId);
    }

    @JsonIgnore
    public String getCounterId() {
        Object objValue = this._get(DTOFIELD_COUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCounterIdDirty() {
        return this._contains(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public void resetCounterId() {
        this._reset(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public PSDETBItemDTO counterid(String counterId) {
        this.setCounterId(counterId);
        return this;
    }

    @JsonProperty(value="countermode")
    public void setCounterMode(Integer counterMode) {
        this._set(DTOFIELD_COUNTERMODE, counterMode);
    }

    @JsonIgnore
    public Integer getCounterMode() {
        Object objValue = this._get(DTOFIELD_COUNTERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCounterModeDirty() {
        return this._contains(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public void resetCounterMode() {
        this._reset(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public PSDETBItemDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
        if (counterMode == null) {
            this.setCounterMode(null);
        } else {
            this.setCounterMode(counterMode.value);
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
    public PSDETBItemDTO createdate(Timestamp createDate) {
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
    public PSDETBItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDETBItemDTO customcode(String customCode) {
        this.setCustomCode(customCode);
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
    public PSDETBItemDTO data(String data) {
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
    public PSDETBItemDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="deuacap")
    public void setDEUACap(String dEUACap) {
        this._set(DTOFIELD_DEUACAP, dEUACap);
    }

    @JsonIgnore
    public String getDEUACap() {
        Object objValue = this._get(DTOFIELD_DEUACAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEUACapDirty() {
        return this._contains(DTOFIELD_DEUACAP);
    }

    @JsonIgnore
    public void resetDEUACap() {
        this._reset(DTOFIELD_DEUACAP);
    }

    @JsonIgnore
    public PSDETBItemDTO deuacap(String dEUACap) {
        this.setDEUACap(dEUACap);
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
    public PSDETBItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="groupextractmode")
    public void setGroupExtractMode(String groupExtractMode) {
        this._set(DTOFIELD_GROUPEXTRACTMODE, groupExtractMode);
    }

    @JsonIgnore
    public String getGroupExtractMode() {
        Object objValue = this._get(DTOFIELD_GROUPEXTRACTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupExtractModeDirty() {
        return this._contains(DTOFIELD_GROUPEXTRACTMODE);
    }

    @JsonIgnore
    public void resetGroupExtractMode() {
        this._reset(DTOFIELD_GROUPEXTRACTMODE);
    }

    @JsonIgnore
    public PSDETBItemDTO groupextractmode(String groupExtractMode) {
        this.setGroupExtractMode(groupExtractMode);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO groupextractmode(PSModelEnums.UGExtractMode groupExtractMode) {
        if (groupExtractMode == null) {
            this.setGroupExtractMode(null);
        } else {
            this.setGroupExtractMode(groupExtractMode.value);
        }
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(Double height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public Double getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
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
    public PSDETBItemDTO height(Double height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="hiddenitem")
    public void setHiddenItem(Integer hiddenItem) {
        this._set(DTOFIELD_HIDDENITEM, hiddenItem);
    }

    @JsonIgnore
    public Integer getHiddenItem() {
        Object objValue = this._get(DTOFIELD_HIDDENITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHiddenItemDirty() {
        return this._contains(DTOFIELD_HIDDENITEM);
    }

    @JsonIgnore
    public void resetHiddenItem() {
        this._reset(DTOFIELD_HIDDENITEM);
    }

    @JsonIgnore
    public PSDETBItemDTO hiddenitem(Integer hiddenItem) {
        this.setHiddenItem(hiddenItem);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO hiddenitem(Boolean hiddenItem) {
        if (hiddenItem == null) {
            this.setHiddenItem(null);
        } else {
            this.setHiddenItem(hiddenItem != false ? 1 : 0);
        }
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
    public PSDETBItemDTO htmlcontent(String htmlContent) {
        this.setHtmlContent(htmlContent);
        return this;
    }

    @JsonProperty(value="htmlpageurl")
    public void setHtmlPageUrl(String htmlPageUrl) {
        this._set(DTOFIELD_HTMLPAGEURL, htmlPageUrl);
    }

    @JsonIgnore
    public String getHtmlPageUrl() {
        Object objValue = this._get(DTOFIELD_HTMLPAGEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlPageUrlDirty() {
        return this._contains(DTOFIELD_HTMLPAGEURL);
    }

    @JsonIgnore
    public void resetHtmlPageUrl() {
        this._reset(DTOFIELD_HTMLPAGEURL);
    }

    @JsonIgnore
    public PSDETBItemDTO htmlpageurl(String htmlPageUrl) {
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    @JsonProperty(value="itemstyle")
    public void setItemStyle(String itemStyle) {
        this._set(DTOFIELD_ITEMSTYLE, itemStyle);
    }

    @JsonIgnore
    public String getItemStyle() {
        Object objValue = this._get(DTOFIELD_ITEMSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemStyleDirty() {
        return this._contains(DTOFIELD_ITEMSTYLE);
    }

    @JsonIgnore
    public void resetItemStyle() {
        this._reset(DTOFIELD_ITEMSTYLE);
    }

    @JsonIgnore
    public PSDETBItemDTO itemstyle(String itemStyle) {
        this.setItemStyle(itemStyle);
        return this;
    }

    @JsonProperty(value="itemstyletext")
    public void setItemStyleText(String itemStyleText) {
        this._set(DTOFIELD_ITEMSTYLETEXT, itemStyleText);
    }

    @JsonIgnore
    public String getItemStyleText() {
        Object objValue = this._get(DTOFIELD_ITEMSTYLETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemStyleTextDirty() {
        return this._contains(DTOFIELD_ITEMSTYLETEXT);
    }

    @JsonIgnore
    public void resetItemStyleText() {
        this._reset(DTOFIELD_ITEMSTYLETEXT);
    }

    @JsonIgnore
    public PSDETBItemDTO itemstyletext(String itemStyleText) {
        this.setItemStyleText(itemStyleText);
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
    public PSDETBItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="noprivdm")
    public void setNoPrivDM(Integer noPrivDM) {
        this._set(DTOFIELD_NOPRIVDM, noPrivDM);
    }

    @JsonIgnore
    public Integer getNoPrivDM() {
        Object objValue = this._get(DTOFIELD_NOPRIVDM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoPrivDMDirty() {
        return this._contains(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public void resetNoPrivDM() {
        this._reset(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public PSDETBItemDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO noprivdm(PSModelEnums.BtnNoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    @JsonProperty(value="openpsappviewid")
    public void setOpenPSAppViewId(String openPSAppViewId) {
        this._set(DTOFIELD_OPENPSAPPVIEWID, openPSAppViewId);
    }

    @JsonIgnore
    public String getOpenPSAppViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSAppViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSAPPVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSAppViewId() {
        this._reset(DTOFIELD_OPENPSAPPVIEWID);
    }

    @JsonIgnore
    public PSDETBItemDTO openpsappviewid(String openPSAppViewId) {
        this.setOpenPSAppViewId(openPSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO openpsappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setOpenPSAppViewId(null);
            this.setOpenPSAppViewName(null);
        } else {
            this.setOpenPSAppViewId(pSAppView.getPSAppViewId());
            this.setOpenPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="openpsappviewname")
    public void setOpenPSAppViewName(String openPSAppViewName) {
        this._set(DTOFIELD_OPENPSAPPVIEWNAME, openPSAppViewName);
    }

    @JsonIgnore
    public String getOpenPSAppViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSAppViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSAppViewName() {
        this._reset(DTOFIELD_OPENPSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO openpsappviewname(String openPSAppViewName) {
        this.setOpenPSAppViewName(openPSAppViewName);
        return this;
    }

    @JsonProperty(value="openpsdeviewid")
    public void setOpenPSDEViewId(String openPSDEViewId) {
        this._set(DTOFIELD_OPENPSDEVIEWID, openPSDEViewId);
    }

    @JsonIgnore
    public String getOpenPSDEViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSDEViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSDEVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSDEViewId() {
        this._reset(DTOFIELD_OPENPSDEVIEWID);
    }

    @JsonIgnore
    public PSDETBItemDTO openpsdeviewid(String openPSDEViewId) {
        this.setOpenPSDEViewId(openPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO openpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setOpenPSDEViewId(null);
            this.setOpenPSDEViewName(null);
        } else {
            this.setOpenPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setOpenPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="openpsdeviewname")
    public void setOpenPSDEViewName(String openPSDEViewName) {
        this._set(DTOFIELD_OPENPSDEVIEWNAME, openPSDEViewName);
    }

    @JsonIgnore
    public String getOpenPSDEViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSDEViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSDEViewName() {
        this._reset(DTOFIELD_OPENPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO openpsdeviewname(String openPSDEViewName) {
        this.setOpenPSDEViewName(openPSDEViewName);
        return this;
    }

    @JsonProperty(value="openpssyspdtviewid")
    public void setOpenPSSysPDTViewId(String openPSSysPDTViewId) {
        this._set(DTOFIELD_OPENPSSYSPDTVIEWID, openPSSysPDTViewId);
    }

    @JsonIgnore
    public String getOpenPSSysPDTViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSSYSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSSysPDTViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSSYSPDTVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSSysPDTViewId() {
        this._reset(DTOFIELD_OPENPSSYSPDTVIEWID);
    }

    @JsonIgnore
    public PSDETBItemDTO openpssyspdtviewid(String openPSSysPDTViewId) {
        this.setOpenPSSysPDTViewId(openPSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO openpssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
        if (pSSysPDTView == null) {
            this.setOpenPSSysPDTViewId(null);
            this.setOpenPSSysPDTViewName(null);
        } else {
            this.setOpenPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setOpenPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    @JsonProperty(value="openpssyspdtviewname")
    public void setOpenPSSysPDTViewName(String openPSSysPDTViewName) {
        this._set(DTOFIELD_OPENPSSYSPDTVIEWNAME, openPSSysPDTViewName);
    }

    @JsonIgnore
    public String getOpenPSSysPDTViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSSYSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSSysPDTViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSSysPDTViewName() {
        this._reset(DTOFIELD_OPENPSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO openpssyspdtviewname(String openPSSysPDTViewName) {
        this.setOpenPSSysPDTViewName(openPSSysPDTViewName);
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
    public PSDETBItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsdetbitemid")
    public void setPPSDETBItemId(String pPSDETBItemId) {
        this._set(DTOFIELD_PPSDETBITEMID, pPSDETBItemId);
    }

    @JsonIgnore
    public String getPPSDETBItemId() {
        Object objValue = this._get(DTOFIELD_PPSDETBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDETBItemIdDirty() {
        return this._contains(DTOFIELD_PPSDETBITEMID);
    }

    @JsonIgnore
    public void resetPPSDETBItemId() {
        this._reset(DTOFIELD_PPSDETBITEMID);
    }

    @JsonIgnore
    public PSDETBItemDTO ppsdetbitemid(String pPSDETBItemId) {
        this.setPPSDETBItemId(pPSDETBItemId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO ppsdetbitemid(PSDETBItemDTO pSDETBItem) {
        if (pSDETBItem == null) {
            this.setPPSDETBItemId(null);
            this.setPPSDETBItemName(null);
        } else {
            this.setPPSDETBItemId(pSDETBItem.getPSDETBItemId());
            this.setPPSDETBItemName(pSDETBItem.getPSDETBItemName());
        }
        return this;
    }

    @JsonProperty(value="ppsdetbitemname")
    public void setPPSDETBItemName(String pPSDETBItemName) {
        this._set(DTOFIELD_PPSDETBITEMNAME, pPSDETBItemName);
    }

    @JsonIgnore
    public String getPPSDETBItemName() {
        Object objValue = this._get(DTOFIELD_PPSDETBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDETBItemNameDirty() {
        return this._contains(DTOFIELD_PPSDETBITEMNAME);
    }

    @JsonIgnore
    public void resetPPSDETBItemName() {
        this._reset(DTOFIELD_PPSDETBITEMNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO ppsdetbitemname(String pPSDETBItemName) {
        this.setPPSDETBItemName(pPSDETBItemName);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSDETBItemDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonProperty(value="predefinedtypetext")
    public void setPredefinedTypeText(String predefinedTypeText) {
        this._set(DTOFIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }

    @JsonIgnore
    public String getPredefinedTypeText() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeTextDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public void resetPredefinedTypeText() {
        this._reset(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public PSDETBItemDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDETBItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSDETBItemDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdetbitemid")
    public void setPSDETBItemId(String pSDETBItemId) {
        this._set(DTOFIELD_PSDETBITEMID, pSDETBItemId);
    }

    @JsonIgnore
    public String getPSDETBItemId() {
        Object objValue = this._get(DTOFIELD_PSDETBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETBItemIdDirty() {
        return this._contains(DTOFIELD_PSDETBITEMID);
    }

    @JsonIgnore
    public void resetPSDETBItemId() {
        this._reset(DTOFIELD_PSDETBITEMID);
    }

    @JsonIgnore
    public PSDETBItemDTO psdetbitemid(String pSDETBItemId) {
        this.setPSDETBItemId(pSDETBItemId);
        return this;
    }

    @JsonProperty(value="psdetbitemname")
    public void setPSDETBItemName(String pSDETBItemName) {
        this._set(DTOFIELD_PSDETBITEMNAME, pSDETBItemName);
    }

    @JsonIgnore
    public String getPSDETBItemName() {
        Object objValue = this._get(DTOFIELD_PSDETBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETBItemNameDirty() {
        return this._contains(DTOFIELD_PSDETBITEMNAME);
    }

    @JsonIgnore
    public void resetPSDETBItemName() {
        this._reset(DTOFIELD_PSDETBITEMNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO psdetbitemname(String pSDETBItemName) {
        this.setPSDETBItemName(pSDETBItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETBItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETBItemName(strName);
    }

    @JsonIgnore
    public PSDETBItemDTO name(String strName) {
        this.setPSDETBItemName(strName);
        return this;
    }

    @JsonProperty(value="psdetoolbarid")
    public void setPSDEToolbarId(String pSDEToolbarId) {
        this._set(DTOFIELD_PSDETOOLBARID, pSDEToolbarId);
    }

    @JsonIgnore
    public String getPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public void resetPSDEToolbarId() {
        this._reset(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public PSDETBItemDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setPSDEId(null);
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        } else {
            this.setPSDEId(pSDEToolbar.getPSDEId());
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="psdetoolbarname")
    public void setPSDEToolbarName(String pSDEToolbarName) {
        this._set(DTOFIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }

    @JsonIgnore
    public String getPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarName() {
        this._reset(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setDEUACap(null);
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
            this.setDEUACap(pSDEUIAction.getCaption());
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSDETBItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDETBItemDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDETBItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDETBItemDTO pssysimagename(String pSSysImageName) {
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
    public PSDETBItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDETBItemDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDETBItemDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
    public PSDETBItemDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSDETBItemDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSDETBItemDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
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
    public PSDETBItemDTO rawcontent(String rawContent) {
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
    public PSDETBItemDTO rawcssstyle(String rawCssStyle) {
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    @JsonProperty(value="showmode")
    public void setShowMode(String showMode) {
        this._set(DTOFIELD_SHOWMODE, showMode);
    }

    @JsonIgnore
    public String getShowMode() {
        Object objValue = this._get(DTOFIELD_SHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShowModeDirty() {
        return this._contains(DTOFIELD_SHOWMODE);
    }

    @JsonIgnore
    public void resetShowMode() {
        this._reset(DTOFIELD_SHOWMODE);
    }

    @JsonIgnore
    public PSDETBItemDTO showmode(String showMode) {
        this.setShowMode(showMode);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO showmode(PSModelEnums.TBItemShowMode showMode) {
        if (showMode == null) {
            this.setShowMode(null);
        } else {
            this.setShowMode(showMode.value);
        }
        return this;
    }

    @JsonProperty(value="spanflag")
    public void setSpanFlag(Integer spanFlag) {
        this._set(DTOFIELD_SPANFLAG, spanFlag);
    }

    @JsonIgnore
    public Integer getSpanFlag() {
        Object objValue = this._get(DTOFIELD_SPANFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSpanFlagDirty() {
        return this._contains(DTOFIELD_SPANFLAG);
    }

    @JsonIgnore
    public void resetSpanFlag() {
        this._reset(DTOFIELD_SPANFLAG);
    }

    @JsonIgnore
    public PSDETBItemDTO spanflag(Integer spanFlag) {
        this.setSpanFlag(spanFlag);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO spanflag(Boolean spanFlag) {
        if (spanFlag == null) {
            this.setSpanFlag(null);
        } else {
            this.setSpanFlag(spanFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tbitemtype")
    public void setTBItemType(String tBItemType) {
        this._set(DTOFIELD_TBITEMTYPE, tBItemType);
    }

    @JsonIgnore
    public String getTBItemType() {
        Object objValue = this._get(DTOFIELD_TBITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTBItemTypeDirty() {
        return this._contains(DTOFIELD_TBITEMTYPE);
    }

    @JsonIgnore
    public void resetTBItemType() {
        this._reset(DTOFIELD_TBITEMTYPE);
    }

    @JsonIgnore
    public PSDETBItemDTO tbitemtype(String tBItemType) {
        this.setTBItemType(tBItemType);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO tbitemtype(PSModelEnums.TBItemType tBItemType) {
        if (tBItemType == null) {
            this.setTBItemType(null);
        } else {
            this.setTBItemType(tBItemType.value);
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
    public PSDETBItemDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO templatemode(Boolean templateMode) {
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
    public PSDETBItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETBItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDETBItemDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="togglemode")
    public void setToggleMode(String toggleMode) {
        this._set(DTOFIELD_TOGGLEMODE, toggleMode);
    }

    @JsonIgnore
    public String getToggleMode() {
        Object objValue = this._get(DTOFIELD_TOGGLEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToggleModeDirty() {
        return this._contains(DTOFIELD_TOGGLEMODE);
    }

    @JsonIgnore
    public void resetToggleMode() {
        this._reset(DTOFIELD_TOGGLEMODE);
    }

    @JsonIgnore
    public PSDETBItemDTO togglemode(String toggleMode) {
        this.setToggleMode(toggleMode);
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
    public PSDETBItemDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    @JsonProperty(value="uiactionparams")
    public void setUIActionParams(String uIActionParams) {
        this._set(DTOFIELD_UIACTIONPARAMS, uIActionParams);
    }

    @JsonIgnore
    public String getUIActionParams() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParamsDirty() {
        return this._contains(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public void resetUIActionParams() {
        this._reset(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public PSDETBItemDTO uiactionparams(String uIActionParams) {
        this.setUIActionParams(uIActionParams);
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
    public PSDETBItemDTO updatedate(Timestamp updateDate) {
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
    public PSDETBItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSDETBItemDTO userparams(String userParams) {
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
    public PSDETBItemDTO usertag(String userTag) {
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
    public PSDETBItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Double width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Double getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
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
    public PSDETBItemDTO width(Double width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETBItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETBItemId(strValue);
    }

    @JsonIgnore
    public PSDETBItemDTO id(String strValue) {
        this.setPSDETBItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDETBItemDTO> getPSDETBItems() {
        Object list = this._get(DTOFIELD_PSDETBITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetbitems")
    public void setPSDETBItems(List<PSDETBItemDTO> psdetbitems) {
        this._set(DTOFIELD_PSDETBITEMS, psdetbitems);
    }

    @JsonIgnore
    public List<PSDETBItemDTO> getPSDETBItemsIf() {
        Object list = this._get(DTOFIELD_PSDETBITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETBITEMS, list);
        }
        return (List) list;
    }
}
