package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEGridColDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGFIELD = "AGGFIELD";
    protected static final String DTOFIELD_AGGFIELD = "aggfield";
    public static final String FIELD_AGGMODE = "AGGMODE";
    protected static final String DTOFIELD_AGGMODE = "aggmode";
    public static final String FIELD_AGGVALUEFORMAT = "AGGVALUEFORMAT";
    protected static final String DTOFIELD_AGGVALUEFORMAT = "aggvalueformat";
    public static final String FIELD_ALIGN = "ALIGN";
    protected static final String DTOFIELD_ALIGN = "align";
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CELLPSSYSCSSID = "CELLPSSYSCSSID";
    protected static final String DTOFIELD_CELLPSSYSCSSID = "cellpssyscssid";
    public static final String FIELD_CELLPSSYSCSSNAME = "CELLPSSYSCSSNAME";
    protected static final String DTOFIELD_CELLPSSYSCSSNAME = "cellpssyscssname";
    public static final String FIELD_CLCONVERTMODE = "CLCONVERTMODE";
    protected static final String DTOFIELD_CLCONVERTMODE = "clconvertmode";
    public static final String FIELD_CODELISTCONFIGMODE = "CODELISTCONFIGMODE";
    protected static final String DTOFIELD_CODELISTCONFIGMODE = "codelistconfigmode";
    public static final String FIELD_COLENABLELINK = "COLENABLELINK";
    protected static final String DTOFIELD_COLENABLELINK = "colenablelink";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDV = "CREATEDV";
    protected static final String DTOFIELD_CREATEDV = "createdv";
    public static final String FIELD_CREATEDVT = "CREATEDVT";
    protected static final String DTOFIELD_CREATEDVT = "createdvt";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATAITEMS = "DATAITEMS";
    protected static final String DTOFIELD_DATAITEMS = "dataitems";
    public static final String FIELD_EDITORPARAMS = "EDITORPARAMS";
    protected static final String DTOFIELD_EDITORPARAMS = "editorparams";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_ENABLECOND = "ENABLECOND";
    protected static final String DTOFIELD_ENABLECOND = "enablecond";
    public static final String FIELD_ENABLEINPUTTIP = "ENABLEINPUTTIP";
    protected static final String DTOFIELD_ENABLEINPUTTIP = "enableinputtip";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_ENABLEROWEDIT = "ENABLEROWEDIT";
    protected static final String DTOFIELD_ENABLEROWEDIT = "enablerowedit";
    public static final String FIELD_GCRPSSYSPFPLUGINID = "GCRPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";
    public static final String FIELD_GCRPSSYSPFPLUGINNAME = "GCRPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";
    public static final String FIELD_GRIDCOLSTYLE = "GRIDCOLSTYLE";
    protected static final String DTOFIELD_GRIDCOLSTYLE = "gridcolstyle";
    public static final String FIELD_GRIDCOLTYPE = "GRIDCOLTYPE";
    protected static final String DTOFIELD_GRIDCOLTYPE = "gridcoltype";
    public static final String FIELD_GROUPITEM = "GROUPITEM";
    protected static final String DTOFIELD_GROUPITEM = "groupitem";
    public static final String FIELD_HEADERPSSYSCSSID = "HEADERPSSYSCSSID";
    protected static final String DTOFIELD_HEADERPSSYSCSSID = "headerpssyscssid";
    public static final String FIELD_HEADERPSSYSCSSNAME = "HEADERPSSYSCSSNAME";
    protected static final String DTOFIELD_HEADERPSSYSCSSNAME = "headerpssyscssname";
    public static final String FIELD_HIDDENDATAITEM = "HIDDENDATAITEM";
    protected static final String DTOFIELD_HIDDENDATAITEM = "hiddendataitem";
    public static final String FIELD_HIDEDEFAULT = "HIDEDEFAULT";
    protected static final String DTOFIELD_HIDEDEFAULT = "hidedefault";
    public static final String FIELD_IGNOREINPUT = "IGNOREINPUT";
    protected static final String DTOFIELD_IGNOREINPUT = "ignoreinput";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEEDCODELISTCONFIG = "NEEDCODELISTCONFIG";
    protected static final String DTOFIELD_NEEDCODELISTCONFIG = "needcodelistconfig";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
    public static final String FIELD_NOSORT = "NOSORT";
    protected static final String DTOFIELD_NOSORT = "nosort";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PICKUPPSDEVIEWID = "PICKUPPSDEVIEWID";
    protected static final String DTOFIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";
    public static final String FIELD_PICKUPPSDEVIEWNAME = "PICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PPSDEGRIDCOLID = "PPSDEGRIDCOLID";
    protected static final String DTOFIELD_PPSDEGRIDCOLID = "ppsdegridcolid";
    public static final String FIELD_PPSDEGRIDCOLNAME = "PPSDEGRIDCOLNAME";
    protected static final String DTOFIELD_PPSDEGRIDCOLNAME = "ppsdegridcolname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
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
    public static final String FIELD_PSDEFUIMODEID = "PSDEFUIMODEID";
    protected static final String DTOFIELD_PSDEFUIMODEID = "psdefuimodeid";
    public static final String FIELD_PSDEFUIMODENAME = "PSDEFUIMODENAME";
    protected static final String DTOFIELD_PSDEFUIMODENAME = "psdefuimodename";
    public static final String FIELD_PSDEGEIUPDATEID = "PSDEGEIUPDATEID";
    protected static final String DTOFIELD_PSDEGEIUPDATEID = "psdegeiupdateid";
    public static final String FIELD_PSDEGEIUPDATENAME = "PSDEGEIUPDATENAME";
    protected static final String DTOFIELD_PSDEGEIUPDATENAME = "psdegeiupdatename";
    public static final String FIELD_PSDEGRIDCOLID = "PSDEGRIDCOLID";
    protected static final String DTOFIELD_PSDEGRIDCOLID = "psdegridcolid";
    public static final String FIELD_PSDEGRIDCOLNAME = "PSDEGRIDCOLNAME";
    protected static final String DTOFIELD_PSDEGRIDCOLNAME = "psdegridcolname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSDICTCATID = "PSSYSDICTCATID";
    protected static final String DTOFIELD_PSSYSDICTCATID = "pssysdictcatid";
    public static final String FIELD_PSSYSDICTCATNAME = "PSSYSDICTCATNAME";
    protected static final String DTOFIELD_PSSYSDICTCATNAME = "pssysdictcatname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_REFPSDEACMODEID = "REFPSDEACMODEID";
    protected static final String DTOFIELD_REFPSDEACMODEID = "refpsdeacmodeid";
    public static final String FIELD_REFPSDEACMODENAME = "REFPSDEACMODENAME";
    protected static final String DTOFIELD_REFPSDEACMODENAME = "refpsdeacmodename";
    public static final String FIELD_REFPSDEDATASETID = "REFPSDEDATASETID";
    protected static final String DTOFIELD_REFPSDEDATASETID = "refpsdedatasetid";
    public static final String FIELD_REFPSDEDATASETNAME = "REFPSDEDATASETNAME";
    protected static final String DTOFIELD_REFPSDEDATASETNAME = "refpsdedatasetname";
    public static final String FIELD_REFPSDEID = "REFPSDEID";
    protected static final String DTOFIELD_REFPSDEID = "refpsdeid";
    public static final String FIELD_REFPSDENAME = "REFPSDENAME";
    protected static final String DTOFIELD_REFPSDENAME = "refpsdename";
    public static final String FIELD_REFPSDERID = "REFPSDERID";
    protected static final String DTOFIELD_REFPSDERID = "refpsderid";
    public static final String FIELD_REFPSDERNAME = "REFPSDERNAME";
    protected static final String DTOFIELD_REFPSDERNAME = "refpsdername";
    public static final String FIELD_RENDERMODE = "RENDERMODE";
    protected static final String DTOFIELD_RENDERMODE = "rendermode";
    public static final String FIELD_RENDERMODETEXT = "RENDERMODETEXT";
    protected static final String DTOFIELD_RENDERMODETEXT = "rendermodetext";
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_TREEITEM = "TREEITEM";
    protected static final String DTOFIELD_TREEITEM = "treeitem";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEDV = "UPDATEDV";
    protected static final String DTOFIELD_UPDATEDV = "updatedv";
    public static final String FIELD_UPDATEDVT = "UPDATEDVT";
    protected static final String DTOFIELD_UPDATEDVT = "updatedvt";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUEITEMNAME = "VALUEITEMNAME";
    protected static final String DTOFIELD_VALUEITEMNAME = "valueitemname";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_WIDTHUNIT = "WIDTHUNIT";
    protected static final String DTOFIELD_WIDTHUNIT = "widthunit";
    public static final String DTOFIELD_PSDEGRIDCOLS = "psdegridcols";

    @JsonProperty(value="aggfield")
    public void setAggField(String aggField) {
        this._set(DTOFIELD_AGGFIELD, aggField);
    }

    @JsonIgnore
    public String getAggField() {
        Object objValue = this._get(DTOFIELD_AGGFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggFieldDirty() {
        return this._contains(DTOFIELD_AGGFIELD);
    }

    @JsonIgnore
    public void resetAggField() {
        this._reset(DTOFIELD_AGGFIELD);
    }

    @JsonIgnore
    public PSDEGridColDTO aggfield(String aggField) {
        this.setAggField(aggField);
        return this;
    }

    @JsonProperty(value="aggmode")
    public void setAggMode(String aggMode) {
        this._set(DTOFIELD_AGGMODE, aggMode);
    }

    @JsonIgnore
    public String getAggMode() {
        Object objValue = this._get(DTOFIELD_AGGMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggModeDirty() {
        return this._contains(DTOFIELD_AGGMODE);
    }

    @JsonIgnore
    public void resetAggMode() {
        this._reset(DTOFIELD_AGGMODE);
    }

    @JsonIgnore
    public PSDEGridColDTO aggmode(String aggMode) {
        this.setAggMode(aggMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO aggmode(PSModelEnums.GridColAggMode aggMode) {
        if (aggMode == null) {
            this.setAggMode(null);
        } else {
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    @JsonProperty(value="aggvalueformat")
    public void setAggValueFormat(String aggValueFormat) {
        this._set(DTOFIELD_AGGVALUEFORMAT, aggValueFormat);
    }

    @JsonIgnore
    public String getAggValueFormat() {
        Object objValue = this._get(DTOFIELD_AGGVALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggValueFormatDirty() {
        return this._contains(DTOFIELD_AGGVALUEFORMAT);
    }

    @JsonIgnore
    public void resetAggValueFormat() {
        this._reset(DTOFIELD_AGGVALUEFORMAT);
    }

    @JsonIgnore
    public PSDEGridColDTO aggvalueformat(String aggValueFormat) {
        this.setAggValueFormat(aggValueFormat);
        return this;
    }

    @JsonProperty(value="align")
    public void setAlign(String align) {
        this._set(DTOFIELD_ALIGN, align);
    }

    @JsonIgnore
    public String getAlign() {
        Object objValue = this._get(DTOFIELD_ALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAlignDirty() {
        return this._contains(DTOFIELD_ALIGN);
    }

    @JsonIgnore
    public void resetAlign() {
        this._reset(DTOFIELD_ALIGN);
    }

    @JsonIgnore
    public PSDEGridColDTO align(String align) {
        this.setAlign(align);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO align(PSModelEnums.GridColAlign align) {
        if (align == null) {
            this.setAlign(null);
        } else {
            this.setAlign(align.value);
        }
        return this;
    }

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowEmptyDirty() {
        return this._contains(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public void resetAllowEmpty() {
        this._reset(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public PSDEGridColDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
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
    public PSDEGridColDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEGridColDTO cappslanresname(String capPSLanResName) {
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
    public PSDEGridColDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="cellpssyscssid")
    public void setCellPSSysCssId(String cellPSSysCssId) {
        this._set(DTOFIELD_CELLPSSYSCSSID, cellPSSysCssId);
    }

    @JsonIgnore
    public String getCellPSSysCssId() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssIdDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public void resetCellPSSysCssId() {
        this._reset(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEGridColDTO cellpssyscssid(String cellPSSysCssId) {
        this.setCellPSSysCssId(cellPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO cellpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setCellPSSysCssId(null);
            this.setCellPSSysCssName(null);
        } else {
            this.setCellPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCellPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="cellpssyscssname")
    public void setCellPSSysCssName(String cellPSSysCssName) {
        this._set(DTOFIELD_CELLPSSYSCSSNAME, cellPSSysCssName);
    }

    @JsonIgnore
    public String getCellPSSysCssName() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssNameDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetCellPSSysCssName() {
        this._reset(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO cellpssyscssname(String cellPSSysCssName) {
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    @JsonProperty(value="clconvertmode")
    public void setCLConvertMode(String cLConvertMode) {
        this._set(DTOFIELD_CLCONVERTMODE, cLConvertMode);
    }

    @JsonIgnore
    public String getCLConvertMode() {
        Object objValue = this._get(DTOFIELD_CLCONVERTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLConvertModeDirty() {
        return this._contains(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public void resetCLConvertMode() {
        this._reset(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public PSDEGridColDTO clconvertmode(String cLConvertMode) {
        this.setCLConvertMode(cLConvertMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO clconvertmode(PSModelEnums.CodeListConvertMode cLConvertMode) {
        if (cLConvertMode == null) {
            this.setCLConvertMode(null);
        } else {
            this.setCLConvertMode(cLConvertMode.value);
        }
        return this;
    }

    @JsonProperty(value="codelistconfigmode")
    public void setCodeListConfigMode(Integer codeListConfigMode) {
        this._set(DTOFIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }

    @JsonIgnore
    public Integer getCodeListConfigMode() {
        Object objValue = this._get(DTOFIELD_CODELISTCONFIGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCodeListConfigModeDirty() {
        return this._contains(DTOFIELD_CODELISTCONFIGMODE);
    }

    @JsonIgnore
    public void resetCodeListConfigMode() {
        this._reset(DTOFIELD_CODELISTCONFIGMODE);
    }

    @JsonIgnore
    public PSDEGridColDTO codelistconfigmode(Integer codeListConfigMode) {
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO codelistconfigmode(PSModelEnums.OutputCodeListMode codeListConfigMode) {
        if (codeListConfigMode == null) {
            this.setCodeListConfigMode(null);
        } else {
            this.setCodeListConfigMode(codeListConfigMode.value);
        }
        return this;
    }

    @JsonProperty(value="colenablelink")
    public void setColEnableLink(Integer colEnableLink) {
        this._set(DTOFIELD_COLENABLELINK, colEnableLink);
    }

    @JsonIgnore
    public Integer getColEnableLink() {
        Object objValue = this._get(DTOFIELD_COLENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColEnableLinkDirty() {
        return this._contains(DTOFIELD_COLENABLELINK);
    }

    @JsonIgnore
    public void resetColEnableLink() {
        this._reset(DTOFIELD_COLENABLELINK);
    }

    @JsonIgnore
    public PSDEGridColDTO colenablelink(Integer colEnableLink) {
        this.setColEnableLink(colEnableLink);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO colenablelink(PSModelEnums.DEGridColLinkMode colEnableLink) {
        if (colEnableLink == null) {
            this.setColEnableLink(null);
        } else {
            this.setColEnableLink(colEnableLink.value);
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
    public PSDEGridColDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createdv")
    public void setCreateDV(String createDV) {
        this._set(DTOFIELD_CREATEDV, createDV);
    }

    @JsonIgnore
    public String getCreateDV() {
        Object objValue = this._get(DTOFIELD_CREATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVDirty() {
        return this._contains(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public void resetCreateDV() {
        this._reset(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public PSDEGridColDTO createdv(String createDV) {
        this.setCreateDV(createDV);
        return this;
    }

    @JsonProperty(value="createdvt")
    public void setCreateDVT(String createDVT) {
        this._set(DTOFIELD_CREATEDVT, createDVT);
    }

    @JsonIgnore
    public String getCreateDVT() {
        Object objValue = this._get(DTOFIELD_CREATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVTDirty() {
        return this._contains(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public void resetCreateDVT() {
        this._reset(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public PSDEGridColDTO createdvt(String createDVT) {
        this.setCreateDVT(createDVT);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO createdvt(PSModelEnums.CreateDefaultValueType createDVT) {
        if (createDVT == null) {
            this.setCreateDVT(null);
        } else {
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEGridColDTO createman(String createMan) {
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
    public PSDEGridColDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDEGridColDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dataitems")
    public void setDataItems(String dataItems) {
        this._set(DTOFIELD_DATAITEMS, dataItems);
    }

    @JsonIgnore
    public String getDataItems() {
        Object objValue = this._get(DTOFIELD_DATAITEMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataItemsDirty() {
        return this._contains(DTOFIELD_DATAITEMS);
    }

    @JsonIgnore
    public void resetDataItems() {
        this._reset(DTOFIELD_DATAITEMS);
    }

    @JsonIgnore
    public PSDEGridColDTO dataitems(String dataItems) {
        this.setDataItems(dataItems);
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
    public PSDEGridColDTO editorparams(String editorParams) {
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
    public PSDEGridColDTO editortype(String editorType) {
        this.setEditorType(editorType);
        return this;
    }

    @JsonProperty(value="enablecond")
    public void setEnableCond(Integer enableCond) {
        this._set(DTOFIELD_ENABLECOND, enableCond);
    }

    @JsonIgnore
    public Integer getEnableCond() {
        Object objValue = this._get(DTOFIELD_ENABLECOND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCondDirty() {
        return this._contains(DTOFIELD_ENABLECOND);
    }

    @JsonIgnore
    public void resetEnableCond() {
        this._reset(DTOFIELD_ENABLECOND);
    }

    @JsonIgnore
    public PSDEGridColDTO enablecond(Integer enableCond) {
        this.setEnableCond(enableCond);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO enablecond(PSModelEnums.EditItemEnableCond enableCond) {
        if (enableCond == null) {
            this.setEnableCond(null);
        } else {
            this.setEnableCond(enableCond.value);
        }
        return this;
    }

    @JsonProperty(value="enableinputtip")
    public void setEnableInputTip(Integer enableInputTip) {
        this._set(DTOFIELD_ENABLEINPUTTIP, enableInputTip);
    }

    @JsonIgnore
    public Integer getEnableInputTip() {
        Object objValue = this._get(DTOFIELD_ENABLEINPUTTIP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableInputTipDirty() {
        return this._contains(DTOFIELD_ENABLEINPUTTIP);
    }

    @JsonIgnore
    public void resetEnableInputTip() {
        this._reset(DTOFIELD_ENABLEINPUTTIP);
    }

    @JsonIgnore
    public PSDEGridColDTO enableinputtip(Integer enableInputTip) {
        this.setEnableInputTip(enableInputTip);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO enableinputtip(Boolean enableInputTip) {
        if (enableInputTip == null) {
            this.setEnableInputTip(null);
        } else {
            this.setEnableInputTip(enableInputTip != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableitempriv")
    public void setEnableItemPriv(Integer enableItemPriv) {
        this._set(DTOFIELD_ENABLEITEMPRIV, enableItemPriv);
    }

    @JsonIgnore
    public Integer getEnableItemPriv() {
        Object objValue = this._get(DTOFIELD_ENABLEITEMPRIV);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableItemPrivDirty() {
        return this._contains(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public void resetEnableItemPriv() {
        this._reset(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public PSDEGridColDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDEGridColDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO enablelink(PSModelEnums.DEGridColLinkMode enableLink) {
        if (enableLink == null) {
            this.setEnableLink(null);
        } else {
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    @JsonProperty(value="enablerowedit")
    public void setEnableRowEdit(Integer enableRowEdit) {
        this._set(DTOFIELD_ENABLEROWEDIT, enableRowEdit);
    }

    @JsonIgnore
    public Integer getEnableRowEdit() {
        Object objValue = this._get(DTOFIELD_ENABLEROWEDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableRowEditDirty() {
        return this._contains(DTOFIELD_ENABLEROWEDIT);
    }

    @JsonIgnore
    public void resetEnableRowEdit() {
        this._reset(DTOFIELD_ENABLEROWEDIT);
    }

    @JsonIgnore
    public PSDEGridColDTO enablerowedit(Integer enableRowEdit) {
        this.setEnableRowEdit(enableRowEdit);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO enablerowedit(Boolean enableRowEdit) {
        if (enableRowEdit == null) {
            this.setEnableRowEdit(null);
        } else {
            this.setEnableRowEdit(enableRowEdit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginid")
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginId() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEGridColDTO gcrpssyspfpluginid(String gCRPSSysPFPluginId) {
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO gcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        } else {
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginname")
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginName() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO gcrpssyspfpluginname(String gCRPSSysPFPluginName) {
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="gridcolstyle")
    public void setGridColStyle(String gridColStyle) {
        this._set(DTOFIELD_GRIDCOLSTYLE, gridColStyle);
    }

    @JsonIgnore
    public String getGridColStyle() {
        Object objValue = this._get(DTOFIELD_GRIDCOLSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColStyleDirty() {
        return this._contains(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public void resetGridColStyle() {
        this._reset(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public PSDEGridColDTO gridcolstyle(String gridColStyle) {
        this.setGridColStyle(gridColStyle);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO gridcolstyle(PSModelEnums.GridColStype gridColStyle) {
        if (gridColStyle == null) {
            this.setGridColStyle(null);
        } else {
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    @JsonProperty(value="gridcoltype")
    public void setGridColType(String gridColType) {
        this._set(DTOFIELD_GRIDCOLTYPE, gridColType);
    }

    @JsonIgnore
    public String getGridColType() {
        Object objValue = this._get(DTOFIELD_GRIDCOLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColTypeDirty() {
        return this._contains(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public void resetGridColType() {
        this._reset(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public PSDEGridColDTO gridcoltype(String gridColType) {
        this.setGridColType(gridColType);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO gridcoltype(PSModelEnums.GridColType gridColType) {
        if (gridColType == null) {
            this.setGridColType(null);
        } else {
            this.setGridColType(gridColType.value);
        }
        return this;
    }

    @JsonProperty(value="groupitem")
    public void setGroupItem(String groupItem) {
        this._set(DTOFIELD_GROUPITEM, groupItem);
    }

    @JsonIgnore
    public String getGroupItem() {
        Object objValue = this._get(DTOFIELD_GROUPITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupItemDirty() {
        return this._contains(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public void resetGroupItem() {
        this._reset(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public PSDEGridColDTO groupitem(String groupItem) {
        this.setGroupItem(groupItem);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO groupitem(PSModelEnums.GridColGroupMode groupItem) {
        if (groupItem == null) {
            this.setGroupItem(null);
        } else {
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    @JsonProperty(value="headerpssyscssid")
    public void setHeaderPSSysCssId(String headerPSSysCssId) {
        this._set(DTOFIELD_HEADERPSSYSCSSID, headerPSSysCssId);
    }

    @JsonIgnore
    public String getHeaderPSSysCssId() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysCssIdDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSCSSID);
    }

    @JsonIgnore
    public void resetHeaderPSSysCssId() {
        this._reset(DTOFIELD_HEADERPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEGridColDTO headerpssyscssid(String headerPSSysCssId) {
        this.setHeaderPSSysCssId(headerPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO headerpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setHeaderPSSysCssId(null);
            this.setHeaderPSSysCssName(null);
        } else {
            this.setHeaderPSSysCssId(pSSysCss.getPSSysCssId());
            this.setHeaderPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="headerpssyscssname")
    public void setHeaderPSSysCssName(String headerPSSysCssName) {
        this._set(DTOFIELD_HEADERPSSYSCSSNAME, headerPSSysCssName);
    }

    @JsonIgnore
    public String getHeaderPSSysCssName() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysCssNameDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetHeaderPSSysCssName() {
        this._reset(DTOFIELD_HEADERPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO headerpssyscssname(String headerPSSysCssName) {
        this.setHeaderPSSysCssName(headerPSSysCssName);
        return this;
    }

    @JsonProperty(value="hiddendataitem")
    public void setHiddenDataItem(Integer hiddenDataItem) {
        this._set(DTOFIELD_HIDDENDATAITEM, hiddenDataItem);
    }

    @JsonIgnore
    public Integer getHiddenDataItem() {
        Object objValue = this._get(DTOFIELD_HIDDENDATAITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHiddenDataItemDirty() {
        return this._contains(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public void resetHiddenDataItem() {
        this._reset(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public PSDEGridColDTO hiddendataitem(Integer hiddenDataItem) {
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO hiddendataitem(Boolean hiddenDataItem) {
        if (hiddenDataItem == null) {
            this.setHiddenDataItem(null);
        } else {
            this.setHiddenDataItem(hiddenDataItem != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="hidedefault")
    public void setHideDefault(Integer hideDefault) {
        this._set(DTOFIELD_HIDEDEFAULT, hideDefault);
    }

    @JsonIgnore
    public Integer getHideDefault() {
        Object objValue = this._get(DTOFIELD_HIDEDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHideDefaultDirty() {
        return this._contains(DTOFIELD_HIDEDEFAULT);
    }

    @JsonIgnore
    public void resetHideDefault() {
        this._reset(DTOFIELD_HIDEDEFAULT);
    }

    @JsonIgnore
    public PSDEGridColDTO hidedefault(Integer hideDefault) {
        this.setHideDefault(hideDefault);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO hidedefault(PSModelEnums.DEGridColHideMode hideDefault) {
        if (hideDefault == null) {
            this.setHideDefault(null);
        } else {
            this.setHideDefault(hideDefault.value);
        }
        return this;
    }

    @JsonProperty(value="ignoreinput")
    public void setIgnoreInput(Integer ignoreInput) {
        this._set(DTOFIELD_IGNOREINPUT, ignoreInput);
    }

    @JsonIgnore
    public Integer getIgnoreInput() {
        Object objValue = this._get(DTOFIELD_IGNOREINPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreInputDirty() {
        return this._contains(DTOFIELD_IGNOREINPUT);
    }

    @JsonIgnore
    public void resetIgnoreInput() {
        this._reset(DTOFIELD_IGNOREINPUT);
    }

    @JsonIgnore
    public PSDEGridColDTO ignoreinput(Integer ignoreInput) {
        this.setIgnoreInput(ignoreInput);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO ignoreinput(PSModelEnums.EditItemEnableCond ignoreInput) {
        if (ignoreInput == null) {
            this.setIgnoreInput(null);
        } else {
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewid")
    public void setLinkPSDEViewId(String linkPSDEViewId) {
        this._set(DTOFIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }

    @JsonIgnore
    public String getLinkPSDEViewId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public void resetLinkPSDEViewId() {
        this._reset(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEGridColDTO linkpsdeviewid(String linkPSDEViewId) {
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        } else {
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewname")
    public void setLinkPSDEViewName(String linkPSDEViewName) {
        this._set(DTOFIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }

    @JsonIgnore
    public String getLinkPSDEViewName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEViewName() {
        this._reset(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO linkpsdeviewname(String linkPSDEViewName) {
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSDEGridColDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="needcodelistconfig")
    public void setNeedCodeListConfig(Integer needCodeListConfig) {
        this._set(DTOFIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }

    @JsonIgnore
    public Integer getNeedCodeListConfig() {
        Object objValue = this._get(DTOFIELD_NEEDCODELISTCONFIG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNeedCodeListConfigDirty() {
        return this._contains(DTOFIELD_NEEDCODELISTCONFIG);
    }

    @JsonIgnore
    public void resetNeedCodeListConfig() {
        this._reset(DTOFIELD_NEEDCODELISTCONFIG);
    }

    @JsonIgnore
    public PSDEGridColDTO needcodelistconfig(Integer needCodeListConfig) {
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO needcodelistconfig(Boolean needCodeListConfig) {
        if (needCodeListConfig == null) {
            this.setNeedCodeListConfig(null);
        } else {
            this.setNeedCodeListConfig(needCodeListConfig != false ? 1 : 0);
        }
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
    public PSDEGridColDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO noprivdm(PSModelEnums.NoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    @JsonProperty(value="nosort")
    public void setNoSort(Integer noSort) {
        this._set(DTOFIELD_NOSORT, noSort);
    }

    @JsonIgnore
    public Integer getNoSort() {
        Object objValue = this._get(DTOFIELD_NOSORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoSortDirty() {
        return this._contains(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public void resetNoSort() {
        this._reset(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public PSDEGridColDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO nosort(Boolean noSort) {
        if (noSort == null) {
            this.setNoSort(null);
        } else {
            this.setNoSort(noSort != false ? 1 : 0);
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
    public PSDEGridColDTO ordervalue(Integer orderValue) {
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
    public PSDEGridColDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEGridColDTO phpslanresname(String pHPSLanResName) {
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    @JsonProperty(value="pickuppsdeviewid")
    public void setPickupPSDEViewId(String pickupPSDEViewId) {
        this._set(DTOFIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }

    @JsonIgnore
    public String getPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetPickupPSDEViewId() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEGridColDTO pickuppsdeviewid(String pickupPSDEViewId) {
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        } else {
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="pickuppsdeviewname")
    public void setPickupPSDEViewName(String pickupPSDEViewName) {
        this._set(DTOFIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }

    @JsonIgnore
    public String getPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetPickupPSDEViewName() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO pickuppsdeviewname(String pickupPSDEViewName) {
        this.setPickupPSDEViewName(pickupPSDEViewName);
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
    public PSDEGridColDTO placeholder(String placeHolder) {
        this.setPlaceHolder(placeHolder);
        return this;
    }

    @JsonProperty(value="ppsdegridcolid")
    public void setPPSDEGridColId(String pPSDEGridColId) {
        this._set(DTOFIELD_PPSDEGRIDCOLID, pPSDEGridColId);
    }

    @JsonIgnore
    public String getPPSDEGridColId() {
        Object objValue = this._get(DTOFIELD_PPSDEGRIDCOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEGridColIdDirty() {
        return this._contains(DTOFIELD_PPSDEGRIDCOLID);
    }

    @JsonIgnore
    public void resetPPSDEGridColId() {
        this._reset(DTOFIELD_PPSDEGRIDCOLID);
    }

    @JsonIgnore
    public PSDEGridColDTO ppsdegridcolid(String pPSDEGridColId) {
        this.setPPSDEGridColId(pPSDEGridColId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO ppsdegridcolid(PSDEGridColDTO pSDEGridCol) {
        if (pSDEGridCol == null) {
            this.setPPSDEGridColId(null);
            this.setPPSDEGridColName(null);
        } else {
            this.setPPSDEGridColId(pSDEGridCol.getPSDEGridColId());
            this.setPPSDEGridColName(pSDEGridCol.getPSDEGridColName());
        }
        return this;
    }

    @JsonProperty(value="ppsdegridcolname")
    public void setPPSDEGridColName(String pPSDEGridColName) {
        this._set(DTOFIELD_PPSDEGRIDCOLNAME, pPSDEGridColName);
    }

    @JsonIgnore
    public String getPPSDEGridColName() {
        Object objValue = this._get(DTOFIELD_PPSDEGRIDCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEGridColNameDirty() {
        return this._contains(DTOFIELD_PPSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public void resetPPSDEGridColName() {
        this._reset(DTOFIELD_PPSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO ppsdegridcolname(String pPSDEGridColName) {
        this.setPPSDEGridColName(pPSDEGridColName);
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
    public PSDEGridColDTO predefinedtype(String predefinedType) {
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
    public PSDEGridColDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDEGridColDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEGridColDTO pscodelistname(String pSCodeListName) {
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
    public PSDEGridColDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEGridColDTO psdefname(String pSDEFName) {
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
    public PSDEGridColDTO psdefsfitemid(String pSDEFSFItemId) {
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdefsfitemid(PSDEFSFItemDTO pSDEFSFItem) {
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
    public PSDEGridColDTO psdefsfitemname(String pSDEFSFItemName) {
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    @JsonProperty(value="psdefuimodeid")
    public void setPSDEFUIModeId(String pSDEFUIModeId) {
        this._set(DTOFIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }

    @JsonIgnore
    public String getPSDEFUIModeId() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public void resetPSDEFUIModeId() {
        this._reset(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public PSDEGridColDTO psdefuimodeid(String pSDEFUIModeId) {
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdefuimodeid(PSDEFUIModeDTO pSDEFUIMode) {
        if (pSDEFUIMode == null) {
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        } else {
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    @JsonProperty(value="psdefuimodename")
    public void setPSDEFUIModeName(String pSDEFUIModeName) {
        this._set(DTOFIELD_PSDEFUIMODENAME, pSDEFUIModeName);
    }

    @JsonIgnore
    public String getPSDEFUIModeName() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public void resetPSDEFUIModeName() {
        this._reset(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public PSDEGridColDTO psdefuimodename(String pSDEFUIModeName) {
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    @JsonProperty(value="psdegeiupdateid")
    public void setPSDEGEIUpdateId(String pSDEGEIUpdateId) {
        this._set(DTOFIELD_PSDEGEIUPDATEID, pSDEGEIUpdateId);
    }

    @JsonIgnore
    public String getPSDEGEIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDEGEIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDEGEIUpdateId() {
        this._reset(DTOFIELD_PSDEGEIUPDATEID);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegeiupdateid(String pSDEGEIUpdateId) {
        this.setPSDEGEIUpdateId(pSDEGEIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdegeiupdateid(PSDEGEIUpdateDTO pSDEGEIUpdate) {
        if (pSDEGEIUpdate == null) {
            this.setPSDEGEIUpdateId(null);
            this.setPSDEGEIUpdateName(null);
        } else {
            this.setPSDEGEIUpdateId(pSDEGEIUpdate.getPSDEGEIUpdateId());
            this.setPSDEGEIUpdateName(pSDEGEIUpdate.getPSDEGEIUpdateName());
        }
        return this;
    }

    @JsonProperty(value="psdegeiupdatename")
    public void setPSDEGEIUpdateName(String pSDEGEIUpdateName) {
        this._set(DTOFIELD_PSDEGEIUPDATENAME, pSDEGEIUpdateName);
    }

    @JsonIgnore
    public String getPSDEGEIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDEGEIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDEGEIUpdateName() {
        this._reset(DTOFIELD_PSDEGEIUPDATENAME);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegeiupdatename(String pSDEGEIUpdateName) {
        this.setPSDEGEIUpdateName(pSDEGEIUpdateName);
        return this;
    }

    @JsonProperty(value="psdegridcolid")
    public void setPSDEGridColId(String pSDEGridColId) {
        this._set(DTOFIELD_PSDEGRIDCOLID, pSDEGridColId);
    }

    @JsonIgnore
    public String getPSDEGridColId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public void resetPSDEGridColId() {
        this._reset(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegridcolid(String pSDEGridColId) {
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    @JsonProperty(value="psdegridcolname")
    public void setPSDEGridColName(String pSDEGridColName) {
        this._set(DTOFIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }

    @JsonIgnore
    public String getPSDEGridColName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public void resetPSDEGridColName() {
        this._reset(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegridcolname(String pSDEGridColName) {
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEGridColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEGridColName(strName);
    }

    @JsonIgnore
    public PSDEGridColDTO name(String strName) {
        this.setPSDEGridColName(strName);
        return this;
    }

    @JsonProperty(value="psdegridid")
    public void setPSDEGridId(String pSDEGridId) {
        this._set(DTOFIELD_PSDEGRIDID, pSDEGridId);
    }

    @JsonIgnore
    public String getPSDEGridId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public void resetPSDEGridId() {
        this._reset(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdegridid(PSDEGridDTO pSDEGrid) {
        if (pSDEGrid == null) {
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        } else {
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    @JsonProperty(value="psdegridname")
    public void setPSDEGridName(String pSDEGridName) {
        this._set(DTOFIELD_PSDEGRIDNAME, pSDEGridName);
    }

    @JsonIgnore
    public String getPSDEGridName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public void resetPSDEGridName() {
        this._reset(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
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
    public PSDEGridColDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEGridColDTO psdeuagroupname(String pSDEUAGroupName) {
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
    public PSDEGridColDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSDEGridColDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pssysdictcatid")
    public void setPSSysDictCatId(String pSSysDictCatId) {
        this._set(DTOFIELD_PSSYSDICTCATID, pSSysDictCatId);
    }

    @JsonIgnore
    public String getPSSysDictCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSDICTCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDictCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSDICTCATID);
    }

    @JsonIgnore
    public void resetPSSysDictCatId() {
        this._reset(DTOFIELD_PSSYSDICTCATID);
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdictcatid(String pSSysDictCatId) {
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdictcatid(PSSysDictCatDTO pSSysDictCat) {
        if (pSSysDictCat == null) {
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        } else {
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    @JsonProperty(value="pssysdictcatname")
    public void setPSSysDictCatName(String pSSysDictCatName) {
        this._set(DTOFIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }

    @JsonIgnore
    public String getPSSysDictCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSDICTCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDictCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSDICTCATNAME);
    }

    @JsonIgnore
    public void resetPSSysDictCatName() {
        this._reset(DTOFIELD_PSSYSDICTCATNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdictcatname(String pSSysDictCatName) {
        this.setPSSysDictCatName(pSSysDictCatName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDEGridColDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
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
    public PSDEGridColDTO pssyseditorstylename(String pSSysEditorStyleName) {
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
    public PSDEGridColDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEGridColDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDEGridColDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
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
    public PSDEGridColDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    @JsonProperty(value="refpsdeacmodeid")
    public void setRefPSDEACModeId(String refPSDEACModeId) {
        this._set(DTOFIELD_REFPSDEACMODEID, refPSDEACModeId);
    }

    @JsonIgnore
    public String getRefPSDEACModeId() {
        Object objValue = this._get(DTOFIELD_REFPSDEACMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty() {
        return this._contains(DTOFIELD_REFPSDEACMODEID);
    }

    @JsonIgnore
    public void resetRefPSDEACModeId() {
        this._reset(DTOFIELD_REFPSDEACMODEID);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
        if (pSDEACMode == null) {
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        } else {
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    @JsonProperty(value="refpsdeacmodename")
    public void setRefPSDEACModeName(String refPSDEACModeName) {
        this._set(DTOFIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }

    @JsonIgnore
    public String getRefPSDEACModeName() {
        Object objValue = this._get(DTOFIELD_REFPSDEACMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty() {
        return this._contains(DTOFIELD_REFPSDEACMODENAME);
    }

    @JsonIgnore
    public void resetRefPSDEACModeName() {
        this._reset(DTOFIELD_REFPSDEACMODENAME);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdeacmodename(String refPSDEACModeName) {
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    @JsonProperty(value="refpsdedatasetid")
    public void setRefPSDEDataSetId(String refPSDEDataSetId) {
        this._set(DTOFIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }

    @JsonIgnore
    public String getRefPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetId() {
        this._reset(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        } else {
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="refpsdedatasetname")
    public void setRefPSDEDataSetName(String refPSDEDataSetName) {
        this._set(DTOFIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }

    @JsonIgnore
    public String getRefPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetName() {
        this._reset(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdedatasetname(String refPSDEDataSetName) {
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="refpsdeid")
    public void setRefPSDEId(String refPSDEId) {
        this._set(DTOFIELD_REFPSDEID, refPSDEId);
    }

    @JsonIgnore
    public String getRefPSDEId() {
        Object objValue = this._get(DTOFIELD_REFPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEIdDirty() {
        return this._contains(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public void resetRefPSDEId() {
        this._reset(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        } else {
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="refpsdename")
    public void setRefPSDEName(String refPSDEName) {
        this._set(DTOFIELD_REFPSDENAME, refPSDEName);
    }

    @JsonIgnore
    public String getRefPSDEName() {
        Object objValue = this._get(DTOFIELD_REFPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDENameDirty() {
        return this._contains(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public void resetRefPSDEName() {
        this._reset(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    @JsonProperty(value="refpsderid")
    public void setRefPSDERId(String refPSDERId) {
        this._set(DTOFIELD_REFPSDERID, refPSDERId);
    }

    @JsonIgnore
    public String getRefPSDERId() {
        Object objValue = this._get(DTOFIELD_REFPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDERIdDirty() {
        return this._contains(DTOFIELD_REFPSDERID);
    }

    @JsonIgnore
    public void resetRefPSDERId() {
        this._reset(DTOFIELD_REFPSDERID);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsderid(String refPSDERId) {
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO refpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        } else {
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="refpsdername")
    public void setRefPSDERName(String refPSDERName) {
        this._set(DTOFIELD_REFPSDERNAME, refPSDERName);
    }

    @JsonIgnore
    public String getRefPSDERName() {
        Object objValue = this._get(DTOFIELD_REFPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDERNameDirty() {
        return this._contains(DTOFIELD_REFPSDERNAME);
    }

    @JsonIgnore
    public void resetRefPSDERName() {
        this._reset(DTOFIELD_REFPSDERNAME);
    }

    @JsonIgnore
    public PSDEGridColDTO refpsdername(String refPSDERName) {
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    @JsonProperty(value="rendermode")
    public void setRenderMode(String renderMode) {
        this._set(DTOFIELD_RENDERMODE, renderMode);
    }

    @JsonIgnore
    public String getRenderMode() {
        Object objValue = this._get(DTOFIELD_RENDERMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeDirty() {
        return this._contains(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public void resetRenderMode() {
        this._reset(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public PSDEGridColDTO rendermode(String renderMode) {
        this.setRenderMode(renderMode);
        return this;
    }

    @JsonProperty(value="rendermodetext")
    public void setRenderModeText(String renderModeText) {
        this._set(DTOFIELD_RENDERMODETEXT, renderModeText);
    }

    @JsonIgnore
    public String getRenderModeText() {
        Object objValue = this._get(DTOFIELD_RENDERMODETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeTextDirty() {
        return this._contains(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public void resetRenderModeText() {
        this._reset(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public PSDEGridColDTO rendermodetext(String renderModeText) {
        this.setRenderModeText(renderModeText);
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
    public PSDEGridColDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
        return this;
    }

    @JsonProperty(value="treeitem")
    public void setTreeItem(Integer treeItem) {
        this._set(DTOFIELD_TREEITEM, treeItem);
    }

    @JsonIgnore
    public Integer getTreeItem() {
        Object objValue = this._get(DTOFIELD_TREEITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTreeItemDirty() {
        return this._contains(DTOFIELD_TREEITEM);
    }

    @JsonIgnore
    public void resetTreeItem() {
        this._reset(DTOFIELD_TREEITEM);
    }

    @JsonIgnore
    public PSDEGridColDTO treeitem(Integer treeItem) {
        this.setTreeItem(treeItem);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO treeitem(PSModelEnums.GridTreeColMode treeItem) {
        if (treeItem == null) {
            this.setTreeItem(null);
        } else {
            this.setTreeItem(treeItem.value);
        }
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
    public PSDEGridColDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @JsonProperty(value="updatedv")
    public void setUpdateDV(String updateDV) {
        this._set(DTOFIELD_UPDATEDV, updateDV);
    }

    @JsonIgnore
    public String getUpdateDV() {
        Object objValue = this._get(DTOFIELD_UPDATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVDirty() {
        return this._contains(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public void resetUpdateDV() {
        this._reset(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public PSDEGridColDTO updatedv(String updateDV) {
        this.setUpdateDV(updateDV);
        return this;
    }

    @JsonProperty(value="updatedvt")
    public void setUpdateDVT(String updateDVT) {
        this._set(DTOFIELD_UPDATEDVT, updateDVT);
    }

    @JsonIgnore
    public String getUpdateDVT() {
        Object objValue = this._get(DTOFIELD_UPDATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVTDirty() {
        return this._contains(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public void resetUpdateDVT() {
        this._reset(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public PSDEGridColDTO updatedvt(String updateDVT) {
        this.setUpdateDVT(updateDVT);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO updatedvt(PSModelEnums.UpdateDefaultValueType updateDVT) {
        if (updateDVT == null) {
            this.setUpdateDVT(null);
        } else {
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEGridColDTO updateman(String updateMan) {
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
    public PSDEGridColDTO userparams(String userParams) {
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
    public PSDEGridColDTO usertag(String userTag) {
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
    public PSDEGridColDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="valueformat")
    public void setValueFormat(String valueFormat) {
        this._set(DTOFIELD_VALUEFORMAT, valueFormat);
    }

    @JsonIgnore
    public String getValueFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFormatDirty() {
        return this._contains(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public void resetValueFormat() {
        this._reset(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public PSDEGridColDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
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
    public PSDEGridColDTO valueitemname(String valueItemName) {
        this.setValueItemName(valueItemName);
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
    public PSDEGridColDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonProperty(value="widthunit")
    public void setWidthUnit(String widthUnit) {
        this._set(DTOFIELD_WIDTHUNIT, widthUnit);
    }

    @JsonIgnore
    public String getWidthUnit() {
        Object objValue = this._get(DTOFIELD_WIDTHUNIT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWidthUnitDirty() {
        return this._contains(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public void resetWidthUnit() {
        this._reset(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public PSDEGridColDTO widthunit(String widthUnit) {
        this.setWidthUnit(widthUnit);
        return this;
    }

    @JsonIgnore
    public PSDEGridColDTO widthunit(PSModelEnums.GridColWidthUnitType widthUnit) {
        if (widthUnit == null) {
            this.setWidthUnit(null);
        } else {
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEGridColId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEGridColId(strValue);
    }

    @JsonIgnore
    public PSDEGridColDTO id(String strValue) {
        this.setPSDEGridColId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEGridColDTO> getPSDEGridCols() {
        Object list = this._get(DTOFIELD_PSDEGRIDCOLS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdegridcols")
    public void setPSDEGridCols(List<PSDEGridColDTO> psdegridcols) {
        this._set(DTOFIELD_PSDEGRIDCOLS, psdegridcols);
    }

    @JsonIgnore
    public List<PSDEGridColDTO> getPSDEGridColsIf() {
        Object list = this._get(DTOFIELD_PSDEGRIDCOLS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEGRIDCOLS, list);
        }
        return (List) list;
    }
}
