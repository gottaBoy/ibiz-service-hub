package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppMenuItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONLEVEL = "ACTIONLEVEL";
    protected static final String DTOFIELD_ACTIONLEVEL = "actionlevel";
    public static final String FIELD_AMITEMTYPE = "AMITEMTYPE";
    protected static final String DTOFIELD_AMITEMTYPE = "amitemtype";
    public static final String FIELD_BL_POS = "BL_POS";
    protected static final String DTOFIELD_BL_POS = "bl_pos";
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
    public static final String FIELD_COL_LG = "COL_LG";
    protected static final String DTOFIELD_COL_LG = "col_lg";
    public static final String FIELD_COL_LG_OS = "COL_LG_OS";
    protected static final String DTOFIELD_COL_LG_OS = "col_lg_os";
    public static final String FIELD_COL_MD = "COL_MD";
    protected static final String DTOFIELD_COL_MD = "col_md";
    public static final String FIELD_COL_MD_OS = "COL_MD_OS";
    protected static final String DTOFIELD_COL_MD_OS = "col_md_os";
    public static final String FIELD_COL_SM = "COL_SM";
    protected static final String DTOFIELD_COL_SM = "col_sm";
    public static final String FIELD_COL_SM_OS = "COL_SM_OS";
    protected static final String DTOFIELD_COL_SM_OS = "col_sm_os";
    public static final String FIELD_COL_XS = "COL_XS";
    protected static final String DTOFIELD_COL_XS = "col_xs";
    public static final String FIELD_COL_XS_OS = "COL_XS_OS";
    protected static final String DTOFIELD_COL_XS_OS = "col_xs_os";
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
    public static final String FIELD_DISABLECLOSE = "DISABLECLOSE";
    protected static final String DTOFIELD_DISABLECLOSE = "disableclose";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_ENABLEMODE = "ENABLEMODE";
    protected static final String DTOFIELD_ENABLEMODE = "enablemode";
    public static final String FIELD_EXPAND = "EXPAND";
    protected static final String DTOFIELD_EXPAND = "expand";
    public static final String FIELD_FILLEROBJ = "FILLEROBJ";
    protected static final String DTOFIELD_FILLEROBJ = "fillerobj";
    public static final String FIELD_FLEXALIGN = "FLEXALIGN";
    protected static final String DTOFIELD_FLEXALIGN = "flexalign";
    public static final String FIELD_FLEXBASIS = "FLEXBASIS";
    protected static final String DTOFIELD_FLEXBASIS = "flexbasis";
    public static final String FIELD_FLEXDIR = "FLEXDIR";
    protected static final String DTOFIELD_FLEXDIR = "flexdir";
    public static final String FIELD_FLEXGROW = "FLEXGROW";
    protected static final String DTOFIELD_FLEXGROW = "flexgrow";
    public static final String FIELD_FLEXSHRINK = "FLEXSHRINK";
    protected static final String DTOFIELD_FLEXSHRINK = "flexshrink";
    public static final String FIELD_FLEXVALIGN = "FLEXVALIGN";
    protected static final String DTOFIELD_FLEXVALIGN = "flexvalign";
    public static final String FIELD_HALIGNSELF = "HALIGNSELF";
    protected static final String DTOFIELD_HALIGNSELF = "halignself";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_HIDDENITEM = "HIDDENITEM";
    protected static final String DTOFIELD_HIDDENITEM = "hiddenitem";
    public static final String FIELD_HIDESIDEBAR = "HIDESIDEBAR";
    protected static final String DTOFIELD_HIDESIDEBAR = "hidesidebar";
    public static final String FIELD_HTMLCONTENT = "HTMLCONTENT";
    protected static final String DTOFIELD_HTMLCONTENT = "htmlcontent";
    public static final String FIELD_HTMLPAGEURL = "HTMLPAGEURL";
    protected static final String DTOFIELD_HTMLPAGEURL = "htmlpageurl";
    public static final String FIELD_INFORMTAG = "INFORMTAG";
    protected static final String DTOFIELD_INFORMTAG = "informtag";
    public static final String FIELD_INFORMTAG2 = "INFORMTAG2";
    protected static final String DTOFIELD_INFORMTAG2 = "informtag2";
    public static final String FIELD_ITEMSTYLE = "ITEMSTYLE";
    protected static final String DTOFIELD_ITEMSTYLE = "itemstyle";
    public static final String FIELD_ITEMSTYLETEXT = "ITEMSTYLETEXT";
    protected static final String DTOFIELD_ITEMSTYLETEXT = "itemstyletext";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MENUITEMSTATE = "MENUITEMSTATE";
    protected static final String DTOFIELD_MENUITEMSTATE = "menuitemstate";
    public static final String FIELD_OPENDEFAULT = "OPENDEFAULT";
    protected static final String DTOFIELD_OPENDEFAULT = "opendefault";
    public static final String FIELD_OPENPSAPPVIEWID = "OPENPSAPPVIEWID";
    protected static final String DTOFIELD_OPENPSAPPVIEWID = "openpsappviewid";
    public static final String FIELD_OPENPSAPPVIEWNAME = "OPENPSAPPVIEWNAME";
    protected static final String DTOFIELD_OPENPSAPPVIEWNAME = "openpsappviewname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSAPPMENUITEMID = "PPSAPPMENUITEMID";
    protected static final String DTOFIELD_PPSAPPMENUITEMID = "ppsappmenuitemid";
    public static final String FIELD_PPSAPPMENUITEMNAME = "PPSAPPMENUITEMNAME";
    protected static final String DTOFIELD_PPSAPPMENUITEMNAME = "ppsappmenuitemname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPEPARAM = "PREDEFINEDTYPEPARAM";
    protected static final String DTOFIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PSAPPFUNCID = "PSAPPFUNCID";
    protected static final String DTOFIELD_PSAPPFUNCID = "psappfuncid";
    public static final String FIELD_PSAPPFUNCNAME = "PSAPPFUNCNAME";
    protected static final String DTOFIELD_PSAPPFUNCNAME = "psappfuncname";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUITEMID = "PSAPPMENUITEMID";
    protected static final String DTOFIELD_PSAPPMENUITEMID = "psappmenuitemid";
    public static final String FIELD_PSAPPMENUITEMNAME = "PSAPPMENUITEMNAME";
    protected static final String DTOFIELD_PSAPPMENUITEMNAME = "psappmenuitemname";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
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
    public static final String FIELD_REFPSAPPMENUID = "REFPSAPPMENUID";
    protected static final String DTOFIELD_REFPSAPPMENUID = "refpsappmenuid";
    public static final String FIELD_REFPSAPPMENUNAME = "REFPSAPPMENUNAME";
    protected static final String DTOFIELD_REFPSAPPMENUNAME = "refpsappmenuname";
    public static final String FIELD_SPANFLAG = "SPANFLAG";
    protected static final String DTOFIELD_SPANFLAG = "spanflag";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TITLEBARCLOSEMODE = "TITLEBARCLOSEMODE";
    protected static final String DTOFIELD_TITLEBARCLOSEMODE = "titlebarclosemode";
    public static final String FIELD_TOGGLEMODE = "TOGGLEMODE";
    protected static final String DTOFIELD_TOGGLEMODE = "togglemode";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
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
    public static final String FIELD_VALIGNSELF = "VALIGNSELF";
    protected static final String DTOFIELD_VALIGNSELF = "valignself";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String DTOFIELD_PSAPPMENUITEMS = "psappmenuitems";

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
    public PSAppMenuItemDTO actionlevel(Integer actionLevel) {
        this.setActionLevel(actionLevel);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO actionlevel(PSModelEnums.UIActionLevel actionLevel) {
        if (actionLevel == null) {
            this.setActionLevel(null);
        } else {
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    @JsonProperty(value="amitemtype")
    public void setAMItemType(String aMItemType) {
        this._set(DTOFIELD_AMITEMTYPE, aMItemType);
    }

    @JsonIgnore
    public String getAMItemType() {
        Object objValue = this._get(DTOFIELD_AMITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAMItemTypeDirty() {
        return this._contains(DTOFIELD_AMITEMTYPE);
    }

    @JsonIgnore
    public void resetAMItemType() {
        this._reset(DTOFIELD_AMITEMTYPE);
    }

    @JsonIgnore
    public PSAppMenuItemDTO amitemtype(String aMItemType) {
        this.setAMItemType(aMItemType);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO amitemtype(PSModelEnums.AppMenuItemType aMItemType) {
        if (aMItemType == null) {
            this.setAMItemType(null);
        } else {
            this.setAMItemType(aMItemType.value);
        }
        return this;
    }

    @JsonProperty(value="bl_pos")
    public void setBL_Pos(String bL_Pos) {
        this._set(DTOFIELD_BL_POS, bL_Pos);
    }

    @JsonIgnore
    public String getBL_Pos() {
        Object objValue = this._get(DTOFIELD_BL_POS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBL_PosDirty() {
        return this._contains(DTOFIELD_BL_POS);
    }

    @JsonIgnore
    public void resetBL_Pos() {
        this._reset(DTOFIELD_BL_POS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO bl_pos(String bL_Pos) {
        this.setBL_Pos(bL_Pos);
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
    public PSAppMenuItemDTO borderstyle(String borderStyle) {
        this.setBorderStyle(borderStyle);
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
    public PSAppMenuItemDTO btnactiontype(String btnActionType) {
        this.setBtnActionType(btnActionType);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO btnactiontype(PSModelEnums.AppMenuButtonActionType btnActionType) {
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
    public PSAppMenuItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSAppMenuItemDTO cappslanresname(String capPSLanResName) {
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
    public PSAppMenuItemDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="col_lg")
    public void setCol_LG(Integer col_LG) {
        this._set(DTOFIELD_COL_LG, col_LG);
    }

    @JsonIgnore
    public Integer getCol_LG() {
        Object objValue = this._get(DTOFIELD_COL_LG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_LGDirty() {
        return this._contains(DTOFIELD_COL_LG);
    }

    @JsonIgnore
    public void resetCol_LG() {
        this._reset(DTOFIELD_COL_LG);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_lg(Integer col_LG) {
        this.setCol_LG(col_LG);
        return this;
    }

    @JsonProperty(value="col_lg_os")
    public void setCol_LG_OS(Integer col_LG_OS) {
        this._set(DTOFIELD_COL_LG_OS, col_LG_OS);
    }

    @JsonIgnore
    public Integer getCol_LG_OS() {
        Object objValue = this._get(DTOFIELD_COL_LG_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_LG_OSDirty() {
        return this._contains(DTOFIELD_COL_LG_OS);
    }

    @JsonIgnore
    public void resetCol_LG_OS() {
        this._reset(DTOFIELD_COL_LG_OS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_lg_os(Integer col_LG_OS) {
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    @JsonProperty(value="col_md")
    public void setCol_MD(Integer col_MD) {
        this._set(DTOFIELD_COL_MD, col_MD);
    }

    @JsonIgnore
    public Integer getCol_MD() {
        Object objValue = this._get(DTOFIELD_COL_MD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_MDDirty() {
        return this._contains(DTOFIELD_COL_MD);
    }

    @JsonIgnore
    public void resetCol_MD() {
        this._reset(DTOFIELD_COL_MD);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_md(Integer col_MD) {
        this.setCol_MD(col_MD);
        return this;
    }

    @JsonProperty(value="col_md_os")
    public void setCol_MD_OS(Integer col_MD_OS) {
        this._set(DTOFIELD_COL_MD_OS, col_MD_OS);
    }

    @JsonIgnore
    public Integer getCol_MD_OS() {
        Object objValue = this._get(DTOFIELD_COL_MD_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_MD_OSDirty() {
        return this._contains(DTOFIELD_COL_MD_OS);
    }

    @JsonIgnore
    public void resetCol_MD_OS() {
        this._reset(DTOFIELD_COL_MD_OS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_md_os(Integer col_MD_OS) {
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    @JsonProperty(value="col_sm")
    public void setCol_SM(Integer col_SM) {
        this._set(DTOFIELD_COL_SM, col_SM);
    }

    @JsonIgnore
    public Integer getCol_SM() {
        Object objValue = this._get(DTOFIELD_COL_SM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_SMDirty() {
        return this._contains(DTOFIELD_COL_SM);
    }

    @JsonIgnore
    public void resetCol_SM() {
        this._reset(DTOFIELD_COL_SM);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_sm(Integer col_SM) {
        this.setCol_SM(col_SM);
        return this;
    }

    @JsonProperty(value="col_sm_os")
    public void setCol_SM_OS(Integer col_SM_OS) {
        this._set(DTOFIELD_COL_SM_OS, col_SM_OS);
    }

    @JsonIgnore
    public Integer getCol_SM_OS() {
        Object objValue = this._get(DTOFIELD_COL_SM_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_SM_OSDirty() {
        return this._contains(DTOFIELD_COL_SM_OS);
    }

    @JsonIgnore
    public void resetCol_SM_OS() {
        this._reset(DTOFIELD_COL_SM_OS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_sm_os(Integer col_SM_OS) {
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    @JsonProperty(value="col_xs")
    public void setCol_XS(Integer col_XS) {
        this._set(DTOFIELD_COL_XS, col_XS);
    }

    @JsonIgnore
    public Integer getCol_XS() {
        Object objValue = this._get(DTOFIELD_COL_XS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_XSDirty() {
        return this._contains(DTOFIELD_COL_XS);
    }

    @JsonIgnore
    public void resetCol_XS() {
        this._reset(DTOFIELD_COL_XS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_xs(Integer col_XS) {
        this.setCol_XS(col_XS);
        return this;
    }

    @JsonProperty(value="col_xs_os")
    public void setCol_XS_OS(Integer col_XS_OS) {
        this._set(DTOFIELD_COL_XS_OS, col_XS_OS);
    }

    @JsonIgnore
    public Integer getCol_XS_OS() {
        Object objValue = this._get(DTOFIELD_COL_XS_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_XS_OSDirty() {
        return this._contains(DTOFIELD_COL_XS_OS);
    }

    @JsonIgnore
    public void resetCol_XS_OS() {
        this._reset(DTOFIELD_COL_XS_OS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO col_xs_os(Integer col_XS_OS) {
        this.setCol_XS_OS(col_XS_OS);
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
    public PSAppMenuItemDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO contenttype(PSModelEnums.RawItemContentType contentType) {
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
    public PSAppMenuItemDTO counterid(String counterId) {
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
    public PSAppMenuItemDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
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
    public PSAppMenuItemDTO createdate(Timestamp createDate) {
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
    public PSAppMenuItemDTO createman(String createMan) {
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
    public PSAppMenuItemDTO customcode(String customCode) {
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
    public PSAppMenuItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="disableclose")
    public void setDisableClose(Integer disableClose) {
        this._set(DTOFIELD_DISABLECLOSE, disableClose);
    }

    @JsonIgnore
    public Integer getDisableClose() {
        Object objValue = this._get(DTOFIELD_DISABLECLOSE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDisableCloseDirty() {
        return this._contains(DTOFIELD_DISABLECLOSE);
    }

    @JsonIgnore
    public void resetDisableClose() {
        this._reset(DTOFIELD_DISABLECLOSE);
    }

    @JsonIgnore
    public PSAppMenuItemDTO disableclose(Integer disableClose) {
        this.setDisableClose(disableClose);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO disableclose(Boolean disableClose) {
        if (disableClose == null) {
            this.setDisableClose(null);
        } else {
            this.setDisableClose(disableClose != false ? 1 : 0);
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
    public PSAppMenuItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="enablemode")
    public void setEnableMode(Integer enableMode) {
        this._set(DTOFIELD_ENABLEMODE, enableMode);
    }

    @JsonIgnore
    public Integer getEnableMode() {
        Object objValue = this._get(DTOFIELD_ENABLEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableModeDirty() {
        return this._contains(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public void resetEnableMode() {
        this._reset(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public PSAppMenuItemDTO enablemode(Integer enableMode) {
        this.setEnableMode(enableMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO enablemode(Boolean enableMode) {
        if (enableMode == null) {
            this.setEnableMode(null);
        } else {
            this.setEnableMode(enableMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="expand")
    public void setExpand(Integer expand) {
        this._set(DTOFIELD_EXPAND, expand);
    }

    @JsonIgnore
    public Integer getExpand() {
        Object objValue = this._get(DTOFIELD_EXPAND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExpandDirty() {
        return this._contains(DTOFIELD_EXPAND);
    }

    @JsonIgnore
    public void resetExpand() {
        this._reset(DTOFIELD_EXPAND);
    }

    @JsonIgnore
    public PSAppMenuItemDTO expand(Integer expand) {
        this.setExpand(expand);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO expand(Boolean expand) {
        if (expand == null) {
            this.setExpand(null);
        } else {
            this.setExpand(expand != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="fillerobj")
    public void setFillerObj(String fillerObj) {
        this._set(DTOFIELD_FILLEROBJ, fillerObj);
    }

    @JsonIgnore
    public String getFillerObj() {
        Object objValue = this._get(DTOFIELD_FILLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFillerObjDirty() {
        return this._contains(DTOFIELD_FILLEROBJ);
    }

    @JsonIgnore
    public void resetFillerObj() {
        this._reset(DTOFIELD_FILLEROBJ);
    }

    @JsonIgnore
    public PSAppMenuItemDTO fillerobj(String fillerObj) {
        this.setFillerObj(fillerObj);
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
    public PSAppMenuItemDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
        if (flexAlign == null) {
            this.setFlexAlign(null);
        } else {
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    @JsonProperty(value="flexbasis")
    public void setFlexBasis(Integer flexBasis) {
        this._set(DTOFIELD_FLEXBASIS, flexBasis);
    }

    @JsonIgnore
    public Integer getFlexBasis() {
        Object objValue = this._get(DTOFIELD_FLEXBASIS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexBasisDirty() {
        return this._contains(DTOFIELD_FLEXBASIS);
    }

    @JsonIgnore
    public void resetFlexBasis() {
        this._reset(DTOFIELD_FLEXBASIS);
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexbasis(Integer flexBasis) {
        this.setFlexBasis(flexBasis);
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
    public PSAppMenuItemDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
        if (flexDir == null) {
            this.setFlexDir(null);
        } else {
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    @JsonProperty(value="flexgrow")
    public void setFlexGrow(Integer flexGrow) {
        this._set(DTOFIELD_FLEXGROW, flexGrow);
    }

    @JsonIgnore
    public Integer getFlexGrow() {
        Object objValue = this._get(DTOFIELD_FLEXGROW);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexGrowDirty() {
        return this._contains(DTOFIELD_FLEXGROW);
    }

    @JsonIgnore
    public void resetFlexGrow() {
        this._reset(DTOFIELD_FLEXGROW);
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexgrow(Integer flexGrow) {
        this.setFlexGrow(flexGrow);
        return this;
    }

    @JsonProperty(value="flexshrink")
    public void setFlexShrink(Integer flexShrink) {
        this._set(DTOFIELD_FLEXSHRINK, flexShrink);
    }

    @JsonIgnore
    public Integer getFlexShrink() {
        Object objValue = this._get(DTOFIELD_FLEXSHRINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexShrinkDirty() {
        return this._contains(DTOFIELD_FLEXSHRINK);
    }

    @JsonIgnore
    public void resetFlexShrink() {
        this._reset(DTOFIELD_FLEXSHRINK);
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexshrink(Integer flexShrink) {
        this.setFlexShrink(flexShrink);
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
    public PSAppMenuItemDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
        if (flexVAlign == null) {
            this.setFlexVAlign(null);
        } else {
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    @JsonProperty(value="halignself")
    public void setHAlignSelf(String hAlignSelf) {
        this._set(DTOFIELD_HALIGNSELF, hAlignSelf);
    }

    @JsonIgnore
    public String getHAlignSelf() {
        Object objValue = this._get(DTOFIELD_HALIGNSELF);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHAlignSelfDirty() {
        return this._contains(DTOFIELD_HALIGNSELF);
    }

    @JsonIgnore
    public void resetHAlignSelf() {
        this._reset(DTOFIELD_HALIGNSELF);
    }

    @JsonIgnore
    public PSAppMenuItemDTO halignself(String hAlignSelf) {
        this.setHAlignSelf(hAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO halignself(PSModelEnums.TextAlign hAlignSelf) {
        if (hAlignSelf == null) {
            this.setHAlignSelf(null);
        } else {
            this.setHAlignSelf(hAlignSelf.value);
        }
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
    public PSAppMenuItemDTO height(Integer height) {
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
    public PSAppMenuItemDTO hiddenitem(Integer hiddenItem) {
        this.setHiddenItem(hiddenItem);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO hiddenitem(Boolean hiddenItem) {
        if (hiddenItem == null) {
            this.setHiddenItem(null);
        } else {
            this.setHiddenItem(hiddenItem != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="hidesidebar")
    public void setHIdeSideBar(Integer hIdeSideBar) {
        this._set(DTOFIELD_HIDESIDEBAR, hIdeSideBar);
    }

    @JsonIgnore
    public Integer getHIdeSideBar() {
        Object objValue = this._get(DTOFIELD_HIDESIDEBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHIdeSideBarDirty() {
        return this._contains(DTOFIELD_HIDESIDEBAR);
    }

    @JsonIgnore
    public void resetHIdeSideBar() {
        this._reset(DTOFIELD_HIDESIDEBAR);
    }

    @JsonIgnore
    public PSAppMenuItemDTO hidesidebar(Integer hIdeSideBar) {
        this.setHIdeSideBar(hIdeSideBar);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO hidesidebar(Boolean hIdeSideBar) {
        if (hIdeSideBar == null) {
            this.setHIdeSideBar(null);
        } else {
            this.setHIdeSideBar(hIdeSideBar != false ? 1 : 0);
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
    public PSAppMenuItemDTO htmlcontent(String htmlContent) {
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
    public PSAppMenuItemDTO htmlpageurl(String htmlPageUrl) {
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    @JsonProperty(value="informtag")
    public void setInformTag(String informTag) {
        this._set(DTOFIELD_INFORMTAG, informTag);
    }

    @JsonIgnore
    public String getInformTag() {
        Object objValue = this._get(DTOFIELD_INFORMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInformTagDirty() {
        return this._contains(DTOFIELD_INFORMTAG);
    }

    @JsonIgnore
    public void resetInformTag() {
        this._reset(DTOFIELD_INFORMTAG);
    }

    @JsonIgnore
    public PSAppMenuItemDTO informtag(String informTag) {
        this.setInformTag(informTag);
        return this;
    }

    @JsonProperty(value="informtag2")
    public void setInformTag2(String informTag2) {
        this._set(DTOFIELD_INFORMTAG2, informTag2);
    }

    @JsonIgnore
    public String getInformTag2() {
        Object objValue = this._get(DTOFIELD_INFORMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInformTag2Dirty() {
        return this._contains(DTOFIELD_INFORMTAG2);
    }

    @JsonIgnore
    public void resetInformTag2() {
        this._reset(DTOFIELD_INFORMTAG2);
    }

    @JsonIgnore
    public PSAppMenuItemDTO informtag2(String informTag2) {
        this.setInformTag2(informTag2);
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
    public PSAppMenuItemDTO itemstyle(String itemStyle) {
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
    public PSAppMenuItemDTO itemstyletext(String itemStyleText) {
        this.setItemStyleText(itemStyleText);
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
    public PSAppMenuItemDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
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
    public PSAppMenuItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="menuitemstate")
    public void setMenuItemState(Integer menuItemState) {
        this._set(DTOFIELD_MENUITEMSTATE, menuItemState);
    }

    @JsonIgnore
    public Integer getMenuItemState() {
        Object objValue = this._get(DTOFIELD_MENUITEMSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMenuItemStateDirty() {
        return this._contains(DTOFIELD_MENUITEMSTATE);
    }

    @JsonIgnore
    public void resetMenuItemState() {
        this._reset(DTOFIELD_MENUITEMSTATE);
    }

    @JsonIgnore
    public PSAppMenuItemDTO menuitemstate(Integer menuItemState) {
        this.setMenuItemState(menuItemState);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO menuitemstate(PSModelEnums.MenuItemState[] menuItemState) {
        if (menuItemState == null || menuItemState.length == 0) {
            this.setMenuItemState(null);
        } else {
            int _value = 0;
            for (PSModelEnums.MenuItemState _item : menuItemState) {
                _value |= _item.value;
            }
            this.setMenuItemState(_value);
        }
        return this;
    }

    @JsonProperty(value="opendefault")
    public void setOpenDefault(Integer openDefault) {
        this._set(DTOFIELD_OPENDEFAULT, openDefault);
    }

    @JsonIgnore
    public Integer getOpenDefault() {
        Object objValue = this._get(DTOFIELD_OPENDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOpenDefaultDirty() {
        return this._contains(DTOFIELD_OPENDEFAULT);
    }

    @JsonIgnore
    public void resetOpenDefault() {
        this._reset(DTOFIELD_OPENDEFAULT);
    }

    @JsonIgnore
    public PSAppMenuItemDTO opendefault(Integer openDefault) {
        this.setOpenDefault(openDefault);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO opendefault(Boolean openDefault) {
        if (openDefault == null) {
            this.setOpenDefault(null);
        } else {
            this.setOpenDefault(openDefault != false ? 1 : 0);
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
    public PSAppMenuItemDTO openpsappviewid(String openPSAppViewId) {
        this.setOpenPSAppViewId(openPSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO openpsappviewid(PSAppViewDTO pSAppView) {
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
    public PSAppMenuItemDTO openpsappviewname(String openPSAppViewName) {
        this.setOpenPSAppViewName(openPSAppViewName);
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
    public PSAppMenuItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsappmenuitemid")
    public void setPPSAppMenuItemId(String pPSAppMenuItemId) {
        this._set(DTOFIELD_PPSAPPMENUITEMID, pPSAppMenuItemId);
    }

    @JsonIgnore
    public String getPPSAppMenuItemId() {
        Object objValue = this._get(DTOFIELD_PPSAPPMENUITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppMenuItemIdDirty() {
        return this._contains(DTOFIELD_PPSAPPMENUITEMID);
    }

    @JsonIgnore
    public void resetPPSAppMenuItemId() {
        this._reset(DTOFIELD_PPSAPPMENUITEMID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO ppsappmenuitemid(String pPSAppMenuItemId) {
        this.setPPSAppMenuItemId(pPSAppMenuItemId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO ppsappmenuitemid(PSAppMenuItemDTO pSAppMenuItem) {
        if (pSAppMenuItem == null) {
            this.setPPSAppMenuItemId(null);
            this.setPPSAppMenuItemName(null);
        } else {
            this.setPPSAppMenuItemId(pSAppMenuItem.getPSAppMenuItemId());
            this.setPPSAppMenuItemName(pSAppMenuItem.getPSAppMenuItemName());
        }
        return this;
    }

    @JsonProperty(value="ppsappmenuitemname")
    public void setPPSAppMenuItemName(String pPSAppMenuItemName) {
        this._set(DTOFIELD_PPSAPPMENUITEMNAME, pPSAppMenuItemName);
    }

    @JsonIgnore
    public String getPPSAppMenuItemName() {
        Object objValue = this._get(DTOFIELD_PPSAPPMENUITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppMenuItemNameDirty() {
        return this._contains(DTOFIELD_PPSAPPMENUITEMNAME);
    }

    @JsonIgnore
    public void resetPPSAppMenuItemName() {
        this._reset(DTOFIELD_PPSAPPMENUITEMNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO ppsappmenuitemname(String pPSAppMenuItemName) {
        this.setPPSAppMenuItemName(pPSAppMenuItemName);
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
    public PSAppMenuItemDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonProperty(value="predefinedtypeparam")
    public void setPredefinedTypeParam(String predefinedTypeParam) {
        this._set(DTOFIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }

    @JsonIgnore
    public String getPredefinedTypeParam() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeParamDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public void resetPredefinedTypeParam() {
        this._reset(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public PSAppMenuItemDTO predefinedtypeparam(String predefinedTypeParam) {
        this.setPredefinedTypeParam(predefinedTypeParam);
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
    public PSAppMenuItemDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    @JsonProperty(value="psappfuncid")
    public void setPSAppFuncId(String pSAppFuncId) {
        this._set(DTOFIELD_PSAPPFUNCID, pSAppFuncId);
    }

    @JsonIgnore
    public String getPSAppFuncId() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncIdDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public void resetPSAppFuncId() {
        this._reset(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappfuncid(String pSAppFuncId) {
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappfuncid(PSAppFuncDTO pSAppFunc) {
        if (pSAppFunc == null) {
            this.setPSAppFuncId(null);
            this.setPSAppFuncName(null);
        } else {
            this.setPSAppFuncId(pSAppFunc.getPSAppFuncId());
            this.setPSAppFuncName(pSAppFunc.getPSAppFuncName());
        }
        return this;
    }

    @JsonProperty(value="psappfuncname")
    public void setPSAppFuncName(String pSAppFuncName) {
        this._set(DTOFIELD_PSAPPFUNCNAME, pSAppFuncName);
    }

    @JsonIgnore
    public String getPSAppFuncName() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncNameDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSAppFuncName() {
        this._reset(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappfuncname(String pSAppFuncName) {
        this.setPSAppFuncName(pSAppFuncName);
        return this;
    }

    @JsonProperty(value="psappdataentityid")
    public void setPSAppDataEntityId(String pSAppDataEntityId) {
        this._set(DTOFIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        this._set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
    }

    @JsonIgnore
    public String getPSAppDataEntityId() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYID);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYID)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public void resetPSAppDataEntityId() {
        this._reset(DTOFIELD_PSAPPDATAENTITYID);
        this._reset(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappdataentityid(String pSAppDataEntityId) {
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappdataentityid(PSAppDataEntityDTO pSAppDataEntity) {
        if (pSAppDataEntity == null) {
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
            this.setPSDEId(null);
        } else {
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
            this.setPSDEId(pSAppDataEntity.getPSDEId());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId() {
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEId(String pSAppLocalDEId) {
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty() {
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId() {
        this.resetPSAppDataEntityId();
    }

    @JsonProperty(value="psappdataentityname")
    public void setPSAppDataEntityName(String pSAppDataEntityName) {
        this._set(DTOFIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        this._set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
    }

    @JsonIgnore
    public String getPSAppDataEntityName() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYNAME)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public void resetPSAppDataEntityName() {
        this._reset(DTOFIELD_PSAPPDATAENTITYNAME);
        this._reset(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappdataentityname(String pSAppDataEntityName) {
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName() {
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEName(String pSAppLocalDEName) {
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty() {
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName() {
        this.resetPSAppDataEntityName();
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
            this.setPSSysAppId(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
            this.setPSSysAppId(pSAppMenu.getPSSysAppId());
        }
        return this;
    }

    @JsonProperty(value="psappmenuitemid")
    public void setPSAppMenuItemId(String pSAppMenuItemId) {
        this._set(DTOFIELD_PSAPPMENUITEMID, pSAppMenuItemId);
    }

    @JsonIgnore
    public String getPSAppMenuItemId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuItemIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUITEMID);
    }

    @JsonIgnore
    public void resetPSAppMenuItemId() {
        this._reset(DTOFIELD_PSAPPMENUITEMID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappmenuitemid(String pSAppMenuItemId) {
        this.setPSAppMenuItemId(pSAppMenuItemId);
        return this;
    }

    @JsonProperty(value="psappmenuitemname")
    public void setPSAppMenuItemName(String pSAppMenuItemName) {
        this._set(DTOFIELD_PSAPPMENUITEMNAME, pSAppMenuItemName);
    }

    @JsonIgnore
    public String getPSAppMenuItemName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuItemNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUITEMNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuItemName() {
        this._reset(DTOFIELD_PSAPPMENUITEMNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappmenuitemname(String pSAppMenuItemName) {
        this.setPSAppMenuItemName(pSAppMenuItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppMenuItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppMenuItemName(strName);
    }

    @JsonIgnore
    public PSAppMenuItemDTO name(String strName) {
        this.setPSAppMenuItemName(strName);
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
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
    public PSAppMenuItemDTO psdeid(String pSDEId) {
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
    public PSAppMenuItemDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSAppMenuItemDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSAppMenuItemDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
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
    public PSAppMenuItemDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
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
    public PSAppMenuItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSAppMenuItemDTO pssyscssname(String pSSysCssName) {
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
    public PSAppMenuItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSAppMenuItemDTO pssysimagename(String pSSysImageName) {
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
    public PSAppMenuItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSAppMenuItemDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSAppMenuItemDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
    public PSAppMenuItemDTO pssysresourcename(String pSSysResourceName) {
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
    public PSAppMenuItemDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
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
    public PSAppMenuItemDTO pssysuniresname(String pSSysUniResName) {
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
    public PSAppMenuItemDTO rawcontent(String rawContent) {
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
    public PSAppMenuItemDTO rawcssstyle(String rawCssStyle) {
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    @JsonProperty(value="refpsappmenuid")
    public void setRefPSAppMenuId(String refPSAppMenuId) {
        this._set(DTOFIELD_REFPSAPPMENUID, refPSAppMenuId);
    }

    @JsonIgnore
    public String getRefPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_REFPSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_REFPSAPPMENUID);
    }

    @JsonIgnore
    public void resetRefPSAppMenuId() {
        this._reset(DTOFIELD_REFPSAPPMENUID);
    }

    @JsonIgnore
    public PSAppMenuItemDTO refpsappmenuid(String refPSAppMenuId) {
        this.setRefPSAppMenuId(refPSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO refpsappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setRefPSAppMenuId(null);
            this.setRefPSAppMenuName(null);
        } else {
            this.setRefPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setRefPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    @JsonProperty(value="refpsappmenuname")
    public void setRefPSAppMenuName(String refPSAppMenuName) {
        this._set(DTOFIELD_REFPSAPPMENUNAME, refPSAppMenuName);
    }

    @JsonIgnore
    public String getRefPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_REFPSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_REFPSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetRefPSAppMenuName() {
        this._reset(DTOFIELD_REFPSAPPMENUNAME);
    }

    @JsonIgnore
    public PSAppMenuItemDTO refpsappmenuname(String refPSAppMenuName) {
        this.setRefPSAppMenuName(refPSAppMenuName);
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
    public PSAppMenuItemDTO spanflag(Integer spanFlag) {
        this.setSpanFlag(spanFlag);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO spanflag(Boolean spanFlag) {
        if (spanFlag == null) {
            this.setSpanFlag(null);
        } else {
            this.setSpanFlag(spanFlag != false ? 1 : 0);
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
    public PSAppMenuItemDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO templatemode(Boolean templateMode) {
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
    public PSAppMenuItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSAppMenuItemDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="titlebarclosemode")
    public void setTitleBarCloseMode(Integer titleBarCloseMode) {
        this._set(DTOFIELD_TITLEBARCLOSEMODE, titleBarCloseMode);
    }

    @JsonIgnore
    public Integer getTitleBarCloseMode() {
        Object objValue = this._get(DTOFIELD_TITLEBARCLOSEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTitleBarCloseModeDirty() {
        return this._contains(DTOFIELD_TITLEBARCLOSEMODE);
    }

    @JsonIgnore
    public void resetTitleBarCloseMode() {
        this._reset(DTOFIELD_TITLEBARCLOSEMODE);
    }

    @JsonIgnore
    public PSAppMenuItemDTO titlebarclosemode(Integer titleBarCloseMode) {
        this.setTitleBarCloseMode(titleBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO titlebarclosemode(PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode) {
        if (titleBarCloseMode == null) {
            this.setTitleBarCloseMode(null);
        } else {
            this.setTitleBarCloseMode(titleBarCloseMode.value);
        }
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
    public PSAppMenuItemDTO togglemode(String toggleMode) {
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
    public PSAppMenuItemDTO tooltipinfo(String tooltipInfo) {
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
    public PSAppMenuItemDTO updatedate(Timestamp updateDate) {
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
    public PSAppMenuItemDTO updateman(String updateMan) {
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
    public PSAppMenuItemDTO userparams(String userParams) {
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
    public PSAppMenuItemDTO usertag(String userTag) {
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
    public PSAppMenuItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="valignself")
    public void setVAlignSelf(String vAlignSelf) {
        this._set(DTOFIELD_VALIGNSELF, vAlignSelf);
    }

    @JsonIgnore
    public String getVAlignSelf() {
        Object objValue = this._get(DTOFIELD_VALIGNSELF);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVAlignSelfDirty() {
        return this._contains(DTOFIELD_VALIGNSELF);
    }

    @JsonIgnore
    public void resetVAlignSelf() {
        this._reset(DTOFIELD_VALIGNSELF);
    }

    @JsonIgnore
    public PSAppMenuItemDTO valignself(String vAlignSelf) {
        this.setVAlignSelf(vAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSAppMenuItemDTO valignself(PSModelEnums.TextVAlign vAlignSelf) {
        if (vAlignSelf == null) {
            this.setVAlignSelf(null);
        } else {
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Integer width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Integer getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSAppMenuItemDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppMenuItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppMenuItemId(strValue);
    }

    @JsonIgnore
    public PSAppMenuItemDTO id(String strValue) {
        this.setPSAppMenuItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSAppMenuItemDTO> getPSAppMenuItems() {
        Object list = this._get(DTOFIELD_PSAPPMENUITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psappmenuitems")
    public void setPSAppMenuItems(List<PSAppMenuItemDTO> psappmenuitems) {
        this._set(DTOFIELD_PSAPPMENUITEMS, psappmenuitems);
    }

    @JsonIgnore
    public List<PSAppMenuItemDTO> getPSAppMenuItemsIf() {
        Object list = this._get(DTOFIELD_PSAPPMENUITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSAPPMENUITEMS, list);
        }
        return (List) list;
    }
}
