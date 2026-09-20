package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppPVPartDTO
extends PSModelDTOBase {
    public static final String FIELD_AMPSSYSPFPLUGINID = "AMPSSYSPFPLUGINID";
    protected static final String DTOFIELD_AMPSSYSPFPLUGINID = "ampssyspfpluginid";
    public static final String FIELD_AMPSSYSPFPLUGINNAME = "AMPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_AMPSSYSPFPLUGINNAME = "ampssyspfpluginname";
    public static final String FIELD_BL_POS = "BL_POS";
    protected static final String DTOFIELD_BL_POS = "bl_pos";
    public static final String FIELD_COLID = "COLID";
    protected static final String DTOFIELD_COLID = "colid";
    public static final String FIELD_COLSPAN = "COLSPAN";
    protected static final String DTOFIELD_COLSPAN = "colspan";
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
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_ENABLEANCHOR = "ENABLEANCHOR";
    protected static final String DTOFIELD_ENABLEANCHOR = "enableanchor";
    public static final String FIELD_ENABLECUSTOMMENU = "ENABLECUSTOMMENU";
    protected static final String DTOFIELD_ENABLECUSTOMMENU = "enablecustommenu";
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
    public static final String FIELD_HTMLCONTENT = "HTMLCONTENT";
    protected static final String DTOFIELD_HTMLCONTENT = "htmlcontent";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MENUPSAPPUTILVIEWID = "MENUPSAPPUTILVIEWID";
    protected static final String DTOFIELD_MENUPSAPPUTILVIEWID = "menupsapputilviewid";
    public static final String FIELD_MENUPSAPPUTILVIEWNAME = "MENUPSAPPUTILVIEWNAME";
    protected static final String DTOFIELD_MENUPSAPPUTILVIEWNAME = "menupsapputilviewname";
    public static final String FIELD_MOBAMSTYLE = "MOBAMTYLE";
    protected static final String DTOFIELD_MOBAMSTYLE = "mobamstyle";
    public static final String FIELD_NEWROWMODE = "NEWROWMODE";
    protected static final String DTOFIELD_NEWROWMODE = "newrowmode";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARTPARAMS = "PARTPARAMS";
    protected static final String DTOFIELD_PARTPARAMS = "partparams";
    public static final String FIELD_PARTSTYLE = "PARTSTYLE";
    protected static final String DTOFIELD_PARTSTYLE = "partstyle";
    public static final String FIELD_PORTLETTYPE = "PORTLETTYPE";
    protected static final String DTOFIELD_PORTLETTYPE = "portlettype";
    public static final String FIELD_PPSAPPPVPARTID = "PPSAPPPVPARTID";
    protected static final String DTOFIELD_PPSAPPPVPARTID = "ppsapppvpartid";
    public static final String FIELD_PPSAPPPVPARTNAME = "PPSAPPPVPARTNAME";
    protected static final String DTOFIELD_PPSAPPPVPARTNAME = "ppsapppvpartname";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSAPPPORTALVIEWID = "PSAPPPORTALVIEWID";
    protected static final String DTOFIELD_PSAPPPORTALVIEWID = "psappportalviewid";
    public static final String FIELD_PSAPPPORTALVIEWNAME = "PSAPPPORTALVIEWNAME";
    protected static final String DTOFIELD_PSAPPPORTALVIEWNAME = "psappportalviewname";
    public static final String FIELD_PSAPPPVPARTID = "PSAPPPVPARTID";
    protected static final String DTOFIELD_PSAPPPVPARTID = "psapppvpartid";
    public static final String FIELD_PSAPPPVPARTNAME = "PSAPPPVPARTNAME";
    protected static final String DTOFIELD_PSAPPPVPARTNAME = "psapppvpartname";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
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
    public static final String FIELD_PSSYSPORTLETID = "PSSYSPORTLETID";
    protected static final String DTOFIELD_PSSYSPORTLETID = "pssysportletid";
    public static final String FIELD_PSSYSPORTLETNAME = "PSSYSPORTLETNAME";
    protected static final String DTOFIELD_PSSYSPORTLETNAME = "pssysportletname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PVPARTTYPE = "PVPARTTYPE";
    protected static final String DTOFIELD_PVPARTTYPE = "pvparttype";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_RAWCSSSTYLE = "RAWCSSSTYLE";
    protected static final String DTOFIELD_RAWCSSSTYLE = "rawcssstyle";
    public static final String FIELD_SHOWTITLEBAR = "SHOWTITLEBAR";
    protected static final String DTOFIELD_SHOWTITLEBAR = "showtitlebar";
    public static final String FIELD_SWAPMODE = "SWAPMODE";
    protected static final String DTOFIELD_SWAPMODE = "swapmode";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TITLE = "TITLE";
    protected static final String DTOFIELD_TITLE = "title";
    public static final String FIELD_TITLEBARCLOSEMODE = "TITLEBARCLOSEMODE";
    protected static final String DTOFIELD_TITLEBARCLOSEMODE = "titlebarclosemode";
    public static final String FIELD_TITLEPSLANRESID = "TITLEPSLANRESID";
    protected static final String DTOFIELD_TITLEPSLANRESID = "titlepslanresid";
    public static final String FIELD_TITLEPSLANRESNAME = "TITLEPSLANRESNAME";
    protected static final String DTOFIELD_TITLEPSLANRESNAME = "titlepslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VALIGNSELF = "VALIGNSELF";
    protected static final String DTOFIELD_VALIGNSELF = "valignself";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String DTOFIELD_PSAPPPVPARTS = "psapppvparts";

    @JsonProperty(value="ampssyspfpluginid")
    public void setAMPSSysPFPluginId(String aMPSSysPFPluginId) {
        this._set(DTOFIELD_AMPSSYSPFPLUGINID, aMPSSysPFPluginId);
    }

    @JsonIgnore
    public String getAMPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_AMPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAMPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_AMPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetAMPSSysPFPluginId() {
        this._reset(DTOFIELD_AMPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSAppPVPartDTO ampssyspfpluginid(String aMPSSysPFPluginId) {
        this.setAMPSSysPFPluginId(aMPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO ampssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setAMPSSysPFPluginId(null);
            this.setAMPSSysPFPluginName(null);
        } else {
            this.setAMPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setAMPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="ampssyspfpluginname")
    public void setAMPSSysPFPluginName(String aMPSSysPFPluginName) {
        this._set(DTOFIELD_AMPSSYSPFPLUGINNAME, aMPSSysPFPluginName);
    }

    @JsonIgnore
    public String getAMPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_AMPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAMPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_AMPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetAMPSSysPFPluginName() {
        this._reset(DTOFIELD_AMPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO ampssyspfpluginname(String aMPSSysPFPluginName) {
        this.setAMPSSysPFPluginName(aMPSSysPFPluginName);
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
    public PSAppPVPartDTO bl_pos(String bL_Pos) {
        this.setBL_Pos(bL_Pos);
        return this;
    }

    @JsonProperty(value="colid")
    public void setColId(Integer colId) {
        this._set(DTOFIELD_COLID, colId);
    }

    @JsonIgnore
    public Integer getColId() {
        Object objValue = this._get(DTOFIELD_COLID);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColIdDirty() {
        return this._contains(DTOFIELD_COLID);
    }

    @JsonIgnore
    public void resetColId() {
        this._reset(DTOFIELD_COLID);
    }

    @JsonIgnore
    public PSAppPVPartDTO colid(Integer colId) {
        this.setColId(colId);
        return this;
    }

    @JsonProperty(value="colspan")
    public void setColSpan(Integer colSpan) {
        this._set(DTOFIELD_COLSPAN, colSpan);
    }

    @JsonIgnore
    public Integer getColSpan() {
        Object objValue = this._get(DTOFIELD_COLSPAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColSpanDirty() {
        return this._contains(DTOFIELD_COLSPAN);
    }

    @JsonIgnore
    public void resetColSpan() {
        this._reset(DTOFIELD_COLSPAN);
    }

    @JsonIgnore
    public PSAppPVPartDTO colspan(Integer colSpan) {
        this.setColSpan(colSpan);
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
    public PSAppPVPartDTO col_lg(Integer col_LG) {
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
    public PSAppPVPartDTO col_lg_os(Integer col_LG_OS) {
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
    public PSAppPVPartDTO col_md(Integer col_MD) {
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
    public PSAppPVPartDTO col_md_os(Integer col_MD_OS) {
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
    public PSAppPVPartDTO col_sm(Integer col_SM) {
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
    public PSAppPVPartDTO col_sm_os(Integer col_SM_OS) {
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
    public PSAppPVPartDTO col_xs(Integer col_XS) {
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
    public PSAppPVPartDTO col_xs_os(Integer col_XS_OS) {
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
    public PSAppPVPartDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO contenttype(PSModelEnums.RawItemContentType contentType) {
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
    public PSAppPVPartDTO createdate(Timestamp createDate) {
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
    public PSAppPVPartDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSAppPVPartDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="enableanchor")
    public void setEnableAnchor(Integer enableAnchor) {
        this._set(DTOFIELD_ENABLEANCHOR, enableAnchor);
    }

    @JsonIgnore
    public Integer getEnableAnchor() {
        Object objValue = this._get(DTOFIELD_ENABLEANCHOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAnchorDirty() {
        return this._contains(DTOFIELD_ENABLEANCHOR);
    }

    @JsonIgnore
    public void resetEnableAnchor() {
        this._reset(DTOFIELD_ENABLEANCHOR);
    }

    @JsonIgnore
    public PSAppPVPartDTO enableanchor(Integer enableAnchor) {
        this.setEnableAnchor(enableAnchor);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO enableanchor(Boolean enableAnchor) {
        if (enableAnchor == null) {
            this.setEnableAnchor(null);
        } else {
            this.setEnableAnchor(enableAnchor != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablecustommenu")
    public void setEnableCustomMenu(Integer enableCustomMenu) {
        this._set(DTOFIELD_ENABLECUSTOMMENU, enableCustomMenu);
    }

    @JsonIgnore
    public Integer getEnableCustomMenu() {
        Object objValue = this._get(DTOFIELD_ENABLECUSTOMMENU);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCustomMenuDirty() {
        return this._contains(DTOFIELD_ENABLECUSTOMMENU);
    }

    @JsonIgnore
    public void resetEnableCustomMenu() {
        this._reset(DTOFIELD_ENABLECUSTOMMENU);
    }

    @JsonIgnore
    public PSAppPVPartDTO enablecustommenu(Integer enableCustomMenu) {
        this.setEnableCustomMenu(enableCustomMenu);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO enablecustommenu(Boolean enableCustomMenu) {
        if (enableCustomMenu == null) {
            this.setEnableCustomMenu(null);
        } else {
            this.setEnableCustomMenu(enableCustomMenu != false ? 1 : 0);
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
    public PSAppPVPartDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
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
    public PSAppPVPartDTO flexbasis(Integer flexBasis) {
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
    public PSAppPVPartDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
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
    public PSAppPVPartDTO flexgrow(Integer flexGrow) {
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
    public PSAppPVPartDTO flexshrink(Integer flexShrink) {
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
    public PSAppPVPartDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
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
    public PSAppPVPartDTO halignself(String hAlignSelf) {
        this.setHAlignSelf(hAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO halignself(PSModelEnums.TextAlign hAlignSelf) {
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
    public PSAppPVPartDTO height(Integer height) {
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
    public PSAppPVPartDTO htmlcontent(String htmlContent) {
        this.setHtmlContent(htmlContent);
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
    public PSAppPVPartDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
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
    public PSAppPVPartDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="menupsapputilviewid")
    public void setMenuPSAppUtilViewId(String menuPSAppUtilViewId) {
        this._set(DTOFIELD_MENUPSAPPUTILVIEWID, menuPSAppUtilViewId);
    }

    @JsonIgnore
    public String getMenuPSAppUtilViewId() {
        Object objValue = this._get(DTOFIELD_MENUPSAPPUTILVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMenuPSAppUtilViewIdDirty() {
        return this._contains(DTOFIELD_MENUPSAPPUTILVIEWID);
    }

    @JsonIgnore
    public void resetMenuPSAppUtilViewId() {
        this._reset(DTOFIELD_MENUPSAPPUTILVIEWID);
    }

    @JsonIgnore
    public PSAppPVPartDTO menupsapputilviewid(String menuPSAppUtilViewId) {
        this.setMenuPSAppUtilViewId(menuPSAppUtilViewId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO menupsapputilviewid(PSAppUtilViewDTO pSAppUtilView) {
        if (pSAppUtilView == null) {
            this.setMenuPSAppUtilViewId(null);
            this.setMenuPSAppUtilViewName(null);
        } else {
            this.setMenuPSAppUtilViewId(pSAppUtilView.getPSAppUtilViewId());
            this.setMenuPSAppUtilViewName(pSAppUtilView.getPSAppUtilViewName());
        }
        return this;
    }

    @JsonProperty(value="menupsapputilviewname")
    public void setMenuPSAppUtilViewName(String menuPSAppUtilViewName) {
        this._set(DTOFIELD_MENUPSAPPUTILVIEWNAME, menuPSAppUtilViewName);
    }

    @JsonIgnore
    public String getMenuPSAppUtilViewName() {
        Object objValue = this._get(DTOFIELD_MENUPSAPPUTILVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMenuPSAppUtilViewNameDirty() {
        return this._contains(DTOFIELD_MENUPSAPPUTILVIEWNAME);
    }

    @JsonIgnore
    public void resetMenuPSAppUtilViewName() {
        this._reset(DTOFIELD_MENUPSAPPUTILVIEWNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO menupsapputilviewname(String menuPSAppUtilViewName) {
        this.setMenuPSAppUtilViewName(menuPSAppUtilViewName);
        return this;
    }

    @JsonProperty(value="mobamstyle")
    public void setMOBAMStyle(String mOBAMStyle) {
        this._set(DTOFIELD_MOBAMSTYLE, mOBAMStyle);
        this._set(FIELD_MOBAMSTYLE, mOBAMStyle);
    }

    @JsonIgnore
    public String getMOBAMStyle() {
        Object objValue = this._get(DTOFIELD_MOBAMSTYLE);
        if (objValue == null && (objValue = this._get(FIELD_MOBAMSTYLE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMOBAMStyleDirty() {
        if (this._contains(DTOFIELD_MOBAMSTYLE)) {
            return true;
        }
        return this._contains(FIELD_MOBAMSTYLE);
    }

    @JsonIgnore
    public void resetMOBAMStyle() {
        this._reset(DTOFIELD_MOBAMSTYLE);
        this._reset(FIELD_MOBAMSTYLE);
    }

    @JsonIgnore
    public PSAppPVPartDTO mobamstyle(String mOBAMStyle) {
        this.setMOBAMStyle(mOBAMStyle);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO mobamstyle(PSModelEnums.MobMDCtrlType mOBAMStyle) {
        if (mOBAMStyle == null) {
            this.setMOBAMStyle(null);
        } else {
            this.setMOBAMStyle(mOBAMStyle.value);
        }
        return this;
    }

    @JsonProperty(value="newrowmode")
    public void setNewRowMode(Integer newRowMode) {
        this._set(DTOFIELD_NEWROWMODE, newRowMode);
    }

    @JsonIgnore
    public Integer getNewRowMode() {
        Object objValue = this._get(DTOFIELD_NEWROWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNewRowModeDirty() {
        return this._contains(DTOFIELD_NEWROWMODE);
    }

    @JsonIgnore
    public void resetNewRowMode() {
        this._reset(DTOFIELD_NEWROWMODE);
    }

    @JsonIgnore
    public PSAppPVPartDTO newrowmode(Integer newRowMode) {
        this.setNewRowMode(newRowMode);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO newrowmode(Boolean newRowMode) {
        if (newRowMode == null) {
            this.setNewRowMode(null);
        } else {
            this.setNewRowMode(newRowMode != false ? 1 : 0);
        }
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
    public PSAppPVPartDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="partparams")
    public void setPartParams(String partParams) {
        this._set(DTOFIELD_PARTPARAMS, partParams);
    }

    @JsonIgnore
    public String getPartParams() {
        Object objValue = this._get(DTOFIELD_PARTPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPartParamsDirty() {
        return this._contains(DTOFIELD_PARTPARAMS);
    }

    @JsonIgnore
    public void resetPartParams() {
        this._reset(DTOFIELD_PARTPARAMS);
    }

    @JsonIgnore
    public PSAppPVPartDTO partparams(String partParams) {
        this.setPartParams(partParams);
        return this;
    }

    @JsonProperty(value="partstyle")
    public void setPartStyle(String partStyle) {
        this._set(DTOFIELD_PARTSTYLE, partStyle);
    }

    @JsonIgnore
    public String getPartStyle() {
        Object objValue = this._get(DTOFIELD_PARTSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPartStyleDirty() {
        return this._contains(DTOFIELD_PARTSTYLE);
    }

    @JsonIgnore
    public void resetPartStyle() {
        this._reset(DTOFIELD_PARTSTYLE);
    }

    @JsonIgnore
    public PSAppPVPartDTO partstyle(String partStyle) {
        this.setPartStyle(partStyle);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO partstyle(PSModelEnums.CtrlDetailStyle partStyle) {
        if (partStyle == null) {
            this.setPartStyle(null);
        } else {
            this.setPartStyle(partStyle.value);
        }
        return this;
    }

    @JsonProperty(value="portlettype")
    public void setPortletType(String portletType) {
        this._set(DTOFIELD_PORTLETTYPE, portletType);
    }

    @JsonIgnore
    public String getPortletType() {
        Object objValue = this._get(DTOFIELD_PORTLETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletTypeDirty() {
        return this._contains(DTOFIELD_PORTLETTYPE);
    }

    @JsonIgnore
    public void resetPortletType() {
        this._reset(DTOFIELD_PORTLETTYPE);
    }

    @JsonIgnore
    public PSAppPVPartDTO portlettype(String portletType) {
        this.setPortletType(portletType);
        return this;
    }

    @JsonProperty(value="ppsapppvpartid")
    public void setPPSAppPVPartId(String pPSAppPVPartId) {
        this._set(DTOFIELD_PPSAPPPVPARTID, pPSAppPVPartId);
    }

    @JsonIgnore
    public String getPPSAppPVPartId() {
        Object objValue = this._get(DTOFIELD_PPSAPPPVPARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppPVPartIdDirty() {
        return this._contains(DTOFIELD_PPSAPPPVPARTID);
    }

    @JsonIgnore
    public void resetPPSAppPVPartId() {
        this._reset(DTOFIELD_PPSAPPPVPARTID);
    }

    @JsonIgnore
    public PSAppPVPartDTO ppsapppvpartid(String pPSAppPVPartId) {
        this.setPPSAppPVPartId(pPSAppPVPartId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO ppsapppvpartid(PSAppPVPartDTO pSAppPVPart) {
        if (pSAppPVPart == null) {
            this.setPPSAppPVPartId(null);
            this.setPPSAppPVPartName(null);
        } else {
            this.setPPSAppPVPartId(pSAppPVPart.getPSAppPVPartId());
            this.setPPSAppPVPartName(pSAppPVPart.getPSAppPVPartName());
        }
        return this;
    }

    @JsonProperty(value="ppsapppvpartname")
    public void setPPSAppPVPartName(String pPSAppPVPartName) {
        this._set(DTOFIELD_PPSAPPPVPARTNAME, pPSAppPVPartName);
    }

    @JsonIgnore
    public String getPPSAppPVPartName() {
        Object objValue = this._get(DTOFIELD_PPSAPPPVPARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSAppPVPartNameDirty() {
        return this._contains(DTOFIELD_PPSAPPPVPARTNAME);
    }

    @JsonIgnore
    public void resetPPSAppPVPartName() {
        this._reset(DTOFIELD_PPSAPPPVPARTNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO ppsapppvpartname(String pPSAppPVPartName) {
        this.setPPSAppPVPartName(pPSAppPVPartName);
        return this;
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
    public PSAppPVPartDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
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
    public PSAppPVPartDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    @JsonProperty(value="psappportalviewid")
    public void setPSAppPortalViewId(String pSAppPortalViewId) {
        this._set(DTOFIELD_PSAPPPORTALVIEWID, pSAppPortalViewId);
    }

    @JsonIgnore
    public String getPSAppPortalViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPPORTALVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppPortalViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPPORTALVIEWID);
    }

    @JsonIgnore
    public void resetPSAppPortalViewId() {
        this._reset(DTOFIELD_PSAPPPORTALVIEWID);
    }

    @JsonIgnore
    public PSAppPVPartDTO psappportalviewid(String pSAppPortalViewId) {
        this.setPSAppPortalViewId(pSAppPortalViewId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO psappportalviewid(PSAppPortalViewDTO pSAppPortalView) {
        if (pSAppPortalView == null) {
            this.setPSAppPortalViewId(null);
            this.setPSAppPortalViewName(null);
        } else {
            this.setPSAppPortalViewId(pSAppPortalView.getPSAppPortalViewId());
            this.setPSAppPortalViewName(pSAppPortalView.getPSAppPortalViewName());
        }
        return this;
    }

    @JsonProperty(value="psappportalviewname")
    public void setPSAppPortalViewName(String pSAppPortalViewName) {
        this._set(DTOFIELD_PSAPPPORTALVIEWNAME, pSAppPortalViewName);
    }

    @JsonIgnore
    public String getPSAppPortalViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPPORTALVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppPortalViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPPORTALVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppPortalViewName() {
        this._reset(DTOFIELD_PSAPPPORTALVIEWNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO psappportalviewname(String pSAppPortalViewName) {
        this.setPSAppPortalViewName(pSAppPortalViewName);
        return this;
    }

    @JsonProperty(value="psapppvpartid")
    public void setPSAppPVPartId(String pSAppPVPartId) {
        this._set(DTOFIELD_PSAPPPVPARTID, pSAppPVPartId);
    }

    @JsonIgnore
    public String getPSAppPVPartId() {
        Object objValue = this._get(DTOFIELD_PSAPPPVPARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppPVPartIdDirty() {
        return this._contains(DTOFIELD_PSAPPPVPARTID);
    }

    @JsonIgnore
    public void resetPSAppPVPartId() {
        this._reset(DTOFIELD_PSAPPPVPARTID);
    }

    @JsonIgnore
    public PSAppPVPartDTO psapppvpartid(String pSAppPVPartId) {
        this.setPSAppPVPartId(pSAppPVPartId);
        return this;
    }

    @JsonProperty(value="psapppvpartname")
    public void setPSAppPVPartName(String pSAppPVPartName) {
        this._set(DTOFIELD_PSAPPPVPARTNAME, pSAppPVPartName);
    }

    @JsonIgnore
    public String getPSAppPVPartName() {
        Object objValue = this._get(DTOFIELD_PSAPPPVPARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppPVPartNameDirty() {
        return this._contains(DTOFIELD_PSAPPPVPARTNAME);
    }

    @JsonIgnore
    public void resetPSAppPVPartName() {
        this._reset(DTOFIELD_PSAPPPVPARTNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO psapppvpartname(String pSAppPVPartName) {
        this.setPSAppPVPartName(pSAppPVPartName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppPVPartName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppPVPartName(strName);
    }

    @JsonIgnore
    public PSAppPVPartDTO name(String strName) {
        this.setPSAppPVPartName(strName);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSAppPVPartDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
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
    public PSAppPVPartDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSAppPVPartDTO pssyscssname(String pSSysCssName) {
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
    public PSAppPVPartDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSAppPVPartDTO pssysimagename(String pSSysImageName) {
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
    public PSAppPVPartDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSAppPVPartDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysportletid")
    public void setPSSysPortletId(String pSSysPortletId) {
        this._set(DTOFIELD_PSSYSPORTLETID, pSSysPortletId);
    }

    @JsonIgnore
    public String getPSSysPortletId() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletIdDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETID);
    }

    @JsonIgnore
    public void resetPSSysPortletId() {
        this._reset(DTOFIELD_PSSYSPORTLETID);
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysportletid(String pSSysPortletId) {
        this.setPSSysPortletId(pSSysPortletId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysportletid(PSSysPortletDTO pSSysPortlet) {
        if (pSSysPortlet == null) {
            this.setPortletType(null);
            this.setPSSysPortletId(null);
            this.setPSSysPortletName(null);
        } else {
            this.setPortletType(pSSysPortlet.getPortletType());
            this.setPSSysPortletId(pSSysPortlet.getPSSysPortletId());
            this.setPSSysPortletName(pSSysPortlet.getPSSysPortletName());
        }
        return this;
    }

    @JsonProperty(value="pssysportletname")
    public void setPSSysPortletName(String pSSysPortletName) {
        this._set(DTOFIELD_PSSYSPORTLETNAME, pSSysPortletName);
    }

    @JsonIgnore
    public String getPSSysPortletName() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletNameDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETNAME);
    }

    @JsonIgnore
    public void resetPSSysPortletName() {
        this._reset(DTOFIELD_PSSYSPORTLETNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysportletname(String pSSysPortletName) {
        this.setPSSysPortletName(pSSysPortletName);
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
    public PSAppPVPartDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
    public PSAppPVPartDTO pssysresourcename(String pSSysResourceName) {
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
    public PSAppPVPartDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
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
    public PSAppPVPartDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    @JsonProperty(value="pvparttype")
    public void setPVPartType(String pVPartType) {
        this._set(DTOFIELD_PVPARTTYPE, pVPartType);
    }

    @JsonIgnore
    public String getPVPartType() {
        Object objValue = this._get(DTOFIELD_PVPARTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPVPartTypeDirty() {
        return this._contains(DTOFIELD_PVPARTTYPE);
    }

    @JsonIgnore
    public void resetPVPartType() {
        this._reset(DTOFIELD_PVPARTTYPE);
    }

    @JsonIgnore
    public PSAppPVPartDTO pvparttype(String pVPartType) {
        this.setPVPartType(pVPartType);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO pvparttype(PSModelEnums.AppDashboardPartType pVPartType) {
        if (pVPartType == null) {
            this.setPVPartType(null);
        } else {
            this.setPVPartType(pVPartType.value);
        }
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
    public PSAppPVPartDTO rawcontent(String rawContent) {
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
    public PSAppPVPartDTO rawcssstyle(String rawCssStyle) {
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    @JsonProperty(value="showtitlebar")
    public void setShowTitleBar(Integer showTitleBar) {
        this._set(DTOFIELD_SHOWTITLEBAR, showTitleBar);
    }

    @JsonIgnore
    public Integer getShowTitleBar() {
        Object objValue = this._get(DTOFIELD_SHOWTITLEBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowTitleBarDirty() {
        return this._contains(DTOFIELD_SHOWTITLEBAR);
    }

    @JsonIgnore
    public void resetShowTitleBar() {
        this._reset(DTOFIELD_SHOWTITLEBAR);
    }

    @JsonIgnore
    public PSAppPVPartDTO showtitlebar(Integer showTitleBar) {
        this.setShowTitleBar(showTitleBar);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO showtitlebar(Boolean showTitleBar) {
        if (showTitleBar == null) {
            this.setShowTitleBar(null);
        } else {
            this.setShowTitleBar(showTitleBar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="swapmode")
    public void setSwapMode(String swapMode) {
        this._set(DTOFIELD_SWAPMODE, swapMode);
    }

    @JsonIgnore
    public String getSwapMode() {
        Object objValue = this._get(DTOFIELD_SWAPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSwapModeDirty() {
        return this._contains(DTOFIELD_SWAPMODE);
    }

    @JsonIgnore
    public void resetSwapMode() {
        this._reset(DTOFIELD_SWAPMODE);
    }

    @JsonIgnore
    public PSAppPVPartDTO swapmode(String swapMode) {
        this.setSwapMode(swapMode);
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
    public PSAppPVPartDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO templatemode(Boolean templateMode) {
        if (templateMode == null) {
            this.setTemplateMode(null);
        } else {
            this.setTemplateMode(templateMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="title")
    public void setTitle(String title) {
        this._set(DTOFIELD_TITLE, title);
    }

    @JsonIgnore
    public String getTitle() {
        Object objValue = this._get(DTOFIELD_TITLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleDirty() {
        return this._contains(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public void resetTitle() {
        this._reset(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public PSAppPVPartDTO title(String title) {
        this.setTitle(title);
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
    public PSAppPVPartDTO titlebarclosemode(Integer titleBarCloseMode) {
        this.setTitleBarCloseMode(titleBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO titlebarclosemode(PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode) {
        if (titleBarCloseMode == null) {
            this.setTitleBarCloseMode(null);
        } else {
            this.setTitleBarCloseMode(titleBarCloseMode.value);
        }
        return this;
    }

    @JsonProperty(value="titlepslanresid")
    public void setTitlePSLanResId(String titlePSLanResId) {
        this._set(DTOFIELD_TITLEPSLANRESID, titlePSLanResId);
    }

    @JsonIgnore
    public String getTitlePSLanResId() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResIdDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public void resetTitlePSLanResId() {
        this._reset(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public PSAppPVPartDTO titlepslanresid(String titlePSLanResId) {
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO titlepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        } else {
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="titlepslanresname")
    public void setTitlePSLanResName(String titlePSLanResName) {
        this._set(DTOFIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }

    @JsonIgnore
    public String getTitlePSLanResName() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResNameDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTitlePSLanResName() {
        this._reset(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public PSAppPVPartDTO titlepslanresname(String titlePSLanResName) {
        this.setTitlePSLanResName(titlePSLanResName);
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
    public PSAppPVPartDTO tooltipinfo(String tooltipInfo) {
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
    public PSAppPVPartDTO updatedate(Timestamp updateDate) {
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
    public PSAppPVPartDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSAppPVPartDTO usertag(String userTag) {
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
    public PSAppPVPartDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
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
    public PSAppPVPartDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
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
    public PSAppPVPartDTO valignself(String vAlignSelf) {
        this.setVAlignSelf(vAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSAppPVPartDTO valignself(PSModelEnums.TextVAlign vAlignSelf) {
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
    public PSAppPVPartDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppPVPartId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppPVPartId(strValue);
    }

    @JsonIgnore
    public PSAppPVPartDTO id(String strValue) {
        this.setPSAppPVPartId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSAppPVPartDTO> getPSAppPVParts() {
        Object list = this._get(DTOFIELD_PSAPPPVPARTS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psapppvparts")
    public void setPSAppPVParts(List<PSAppPVPartDTO> psapppvparts) {
        this._set(DTOFIELD_PSAPPPVPARTS, psapppvparts);
    }

    @JsonIgnore
    public List<PSAppPVPartDTO> getPSAppPVPartsIf() {
        Object list = this._get(DTOFIELD_PSAPPPVPARTS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSAPPPVPARTS, list);
        }
        return (List) list;
    }
}
