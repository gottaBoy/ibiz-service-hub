package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysMapItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ALTPSDEFID = "ALTPSDEFID";
    protected static final String DTOFIELD_ALTPSDEFID = "altpsdefid";
    public static final String FIELD_ALTPSDEFNAME = "ALTPSDEFNAME";
    protected static final String DTOFIELD_ALTPSDEFNAME = "altpsdefname";
    public static final String FIELD_ASYNCPSDEDSID = "ASYNCPSDEDSID";
    protected static final String DTOFIELD_ASYNCPSDEDSID = "asyncpsdedsid";
    public static final String FIELD_ASYNCPSDEDSNAME = "ASYNCPSDEDSNAME";
    protected static final String DTOFIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";
    public static final String FIELD_BKCOLOR = "BKCOLOR";
    protected static final String DTOFIELD_BKCOLOR = "bkcolor";
    public static final String FIELD_BKCOLORPSDEFID = "BKCOLORPSDEFID";
    protected static final String DTOFIELD_BKCOLORPSDEFID = "bkcolorpsdefid";
    public static final String FIELD_BKCOLORPSDEFNAME = "BKCOLORPSDEFNAME";
    protected static final String DTOFIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";
    public static final String FIELD_BORDERCOLOR = "BORDERCOLOR";
    protected static final String DTOFIELD_BORDERCOLOR = "bordercolor";
    public static final String FIELD_BORDERWIDTH = "BORDERWIDTH";
    protected static final String DTOFIELD_BORDERWIDTH = "borderwidth";
    public static final String FIELD_CLSPSDEFID = "CLSPSDEFID";
    protected static final String DTOFIELD_CLSPSDEFID = "clspsdefid";
    public static final String FIELD_CLSPSDEFNAME = "CLSPSDEFNAME";
    protected static final String DTOFIELD_CLSPSDEFNAME = "clspsdefname";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_COLORPSDEFID = "COLORPSDEFID";
    protected static final String DTOFIELD_COLORPSDEFID = "colorpsdefid";
    public static final String FIELD_COLORPSDEFNAME = "COLORPSDEFNAME";
    protected static final String DTOFIELD_COLORPSDEFNAME = "colorpsdefname";
    public static final String FIELD_CONTENTPSDEFID = "CONTENTPSDEFID";
    protected static final String DTOFIELD_CONTENTPSDEFID = "contentpsdefid";
    public static final String FIELD_CONTENTPSDEFNAME = "CONTENTPSDEFNAME";
    protected static final String DTOFIELD_CONTENTPSDEFNAME = "contentpsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_DATA2PSDEFID = "DATA2PSDEFID";
    protected static final String DTOFIELD_DATA2PSDEFID = "data2psdefid";
    public static final String FIELD_DATA2PSDEFNAME = "DATA2PSDEFNAME";
    protected static final String DTOFIELD_DATA2PSDEFNAME = "data2psdefname";
    public static final String FIELD_DATAPSDEFID = "DATAPSDEFID";
    protected static final String DTOFIELD_DATAPSDEFID = "datapsdefid";
    public static final String FIELD_DATAPSDEFNAME = "DATAPSDEFNAME";
    protected static final String DTOFIELD_DATAPSDEFNAME = "datapsdefname";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_GROUPPSDEFID = "GROUPPSDEFID";
    protected static final String DTOFIELD_GROUPPSDEFID = "grouppsdefid";
    public static final String FIELD_GROUPPSDEFNAME = "GROUPPSDEFNAME";
    protected static final String DTOFIELD_GROUPPSDEFNAME = "grouppsdefname";
    public static final String FIELD_GROUPPSDEUAGROUPID = "GROUPPSDEUAGROUPID";
    protected static final String DTOFIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";
    public static final String FIELD_GROUPPSDEUAGROUPNAME = "GROUPPSDEUAGROUPNAME";
    protected static final String DTOFIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";
    public static final String FIELD_ICONPSDEFID = "ICONPSDEFID";
    protected static final String DTOFIELD_ICONPSDEFID = "iconpsdefid";
    public static final String FIELD_ICONPSDEFNAME = "ICONPSDEFNAME";
    protected static final String DTOFIELD_ICONPSDEFNAME = "iconpsdefname";
    public static final String FIELD_ITEMSTYLE = "ITEMSTYLE";
    protected static final String DTOFIELD_ITEMSTYLE = "itemstyle";
    public static final String FIELD_ITEMSTYLETEXT = "ITEMSTYLETEXT";
    protected static final String DTOFIELD_ITEMSTYLETEXT = "itemstyletext";
    public static final String FIELD_ITEMTYPE = "ITEMTYPE";
    protected static final String DTOFIELD_ITEMTYPE = "itemtype";
    public static final String FIELD_KEYPSDEFID = "KEYPSDEFID";
    protected static final String DTOFIELD_KEYPSDEFID = "keypsdefid";
    public static final String FIELD_KEYPSDEFNAME = "KEYPSDEFNAME";
    protected static final String DTOFIELD_KEYPSDEFNAME = "keypsdefname";
    public static final String FIELD_LATPSDEFID = "LATPSDEFID";
    protected static final String DTOFIELD_LATPSDEFID = "latpsdefid";
    public static final String FIELD_LATPSDEFNAME = "LATPSDEFNAME";
    protected static final String DTOFIELD_LATPSDEFNAME = "latpsdefname";
    public static final String FIELD_LINKPSDEFID = "LINKPSDEFID";
    protected static final String DTOFIELD_LINKPSDEFID = "linkpsdefid";
    public static final String FIELD_LINKPSDEFNAME = "LINKPSDEFNAME";
    protected static final String DTOFIELD_LINKPSDEFNAME = "linkpsdefname";
    public static final String FIELD_LONGPSDEFID = "LONGPSDEFID";
    protected static final String DTOFIELD_LONGPSDEFID = "longpsdefid";
    public static final String FIELD_LONGPSDEFNAME = "LONGPSDEFNAME";
    protected static final String DTOFIELD_LONGPSDEFNAME = "longpsdefname";
    public static final String FIELD_MAXSIZE = "MAXSIZE";
    protected static final String DTOFIELD_MAXSIZE = "maxsize";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELOBJ = "MODELOBJ";
    protected static final String DTOFIELD_MODELOBJ = "modelobj";
    public static final String FIELD_MOVEPSDEACTIONID = "MOVEPSDEACTIONID";
    protected static final String DTOFIELD_MOVEPSDEACTIONID = "movepsdeactionid";
    public static final String FIELD_MOVEPSDEACTIONNAME = "MOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";
    public static final String FIELD_MOVEPSDEOPPRIVID = "MOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_MOVEPSDEOPPRIVID = "movepsdeopprivid";
    public static final String FIELD_MOVEPSDEOPPRIVNAME = "MOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_MOVEPSDEOPPRIVNAME = "movepsdeopprivname";
    public static final String FIELD_NAMEPSLANRESID = "NAMEPSLANRESID";
    protected static final String DTOFIELD_NAMEPSLANRESID = "namepslanresid";
    public static final String FIELD_NAMEPSLANRESNAME = "NAMEPSLANRESNAME";
    protected static final String DTOFIELD_NAMEPSLANRESNAME = "namepslanresname";
    public static final String FIELD_NAVVIEWFILTER = "NAVVIEWFILTER";
    protected static final String DTOFIELD_NAVVIEWFILTER = "navviewfilter";
    public static final String FIELD_NAVVIEWPARAM = "NAVVIEWPARAM";
    protected static final String DTOFIELD_NAVVIEWPARAM = "navviewparam";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_ORDERVALUEPSDEFID = "ORDERVALUEPSDEFID";
    protected static final String DTOFIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";
    public static final String FIELD_ORDERVALUEPSDEFNAME = "ORDERVALUEPSDEFNAME";
    protected static final String DTOFIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMAPITEMID = "PSSYSMAPITEMID";
    protected static final String DTOFIELD_PSSYSMAPITEMID = "pssysmapitemid";
    public static final String FIELD_PSSYSMAPITEMNAME = "PSSYSMAPITEMNAME";
    protected static final String DTOFIELD_PSSYSMAPITEMNAME = "pssysmapitemname";
    public static final String FIELD_PSSYSMAPVIEWID = "PSSYSMAPVIEWID";
    protected static final String DTOFIELD_PSSYSMAPVIEWID = "pssysmapviewid";
    public static final String FIELD_PSSYSMAPVIEWNAME = "PSSYSMAPVIEWNAME";
    protected static final String DTOFIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_RADIUS = "RADIUS";
    protected static final String DTOFIELD_RADIUS = "radius";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_REMOVEPSDEOPPRIVID = "REMOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";
    public static final String FIELD_REMOVEPSDEOPPRIVNAME = "REMOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";
    public static final String FIELD_SHAPECLSPSDEFID = "SHAPECLSPSDEFID";
    protected static final String DTOFIELD_SHAPECLSPSDEFID = "shapeclspsdefid";
    public static final String FIELD_SHAPECLSPSDEFNAME = "SHAPECLSPSDEFNAME";
    protected static final String DTOFIELD_SHAPECLSPSDEFNAME = "shapeclspsdefname";
    public static final String FIELD_SHAPEDYNACLASS = "SHAPEDYNACLASS";
    protected static final String DTOFIELD_SHAPEDYNACLASS = "shapedynaclass";
    public static final String FIELD_SHAPEPSSYSCSSID = "SHAPEPSSYSCSSID";
    protected static final String DTOFIELD_SHAPEPSSYSCSSID = "shapepssyscssid";
    public static final String FIELD_SHAPEPSSYSCSSNAME = "SHAPEPSSYSCSSNAME";
    protected static final String DTOFIELD_SHAPEPSSYSCSSNAME = "shapepssyscssname";
    public static final String FIELD_TAG2PSDEFID = "TAG2PSDEFID";
    protected static final String DTOFIELD_TAG2PSDEFID = "tag2psdefid";
    public static final String FIELD_TAG2PSDEFNAME = "TAG2PSDEFNAME";
    protected static final String DTOFIELD_TAG2PSDEFNAME = "tag2psdefname";
    public static final String FIELD_TAGPSDEFID = "TAGPSDEFID";
    protected static final String DTOFIELD_TAGPSDEFID = "tagpsdefid";
    public static final String FIELD_TAGPSDEFNAME = "TAGPSDEFNAME";
    protected static final String DTOFIELD_TAGPSDEFNAME = "tagpsdefname";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
    public static final String FIELD_TIMEPSDEFID = "TIMEPSDEFID";
    protected static final String DTOFIELD_TIMEPSDEFID = "timepsdefid";
    public static final String FIELD_TIMEPSDEFNAME = "TIMEPSDEFNAME";
    protected static final String DTOFIELD_TIMEPSDEFNAME = "timepsdefname";
    public static final String FIELD_TIPSPSDEFID = "TIPSPSDEFID";
    protected static final String DTOFIELD_TIPSPSDEFID = "tipspsdefid";
    public static final String FIELD_TIPSPSDEFNAME = "TIPSPSDEFNAME";
    protected static final String DTOFIELD_TIPSPSDEFNAME = "tipspsdefname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="altpsdefid")
    public void setAltPSDEFId(String altPSDEFId) {
        this._set(DTOFIELD_ALTPSDEFID, altPSDEFId);
    }

    @JsonIgnore
    public String getAltPSDEFId() {
        Object objValue = this._get(DTOFIELD_ALTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAltPSDEFIdDirty() {
        return this._contains(DTOFIELD_ALTPSDEFID);
    }

    @JsonIgnore
    public void resetAltPSDEFId() {
        this._reset(DTOFIELD_ALTPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO altpsdefid(String altPSDEFId) {
        this.setAltPSDEFId(altPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO altpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setAltPSDEFId(null);
            this.setAltPSDEFName(null);
        } else {
            this.setAltPSDEFId(pSDEField.getPSDEFieldId());
            this.setAltPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="altpsdefname")
    public void setAltPSDEFName(String altPSDEFName) {
        this._set(DTOFIELD_ALTPSDEFNAME, altPSDEFName);
    }

    @JsonIgnore
    public String getAltPSDEFName() {
        Object objValue = this._get(DTOFIELD_ALTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAltPSDEFNameDirty() {
        return this._contains(DTOFIELD_ALTPSDEFNAME);
    }

    @JsonIgnore
    public void resetAltPSDEFName() {
        this._reset(DTOFIELD_ALTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO altpsdefname(String altPSDEFName) {
        this.setAltPSDEFName(altPSDEFName);
        return this;
    }

    @JsonProperty(value="asyncpsdedsid")
    public void setAsyncPSDEDSId(String asyncPSDEDSId) {
        this._set(DTOFIELD_ASYNCPSDEDSID, asyncPSDEDSId);
    }

    @JsonIgnore
    public String getAsyncPSDEDSId() {
        Object objValue = this._get(DTOFIELD_ASYNCPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAsyncPSDEDSIdDirty() {
        return this._contains(DTOFIELD_ASYNCPSDEDSID);
    }

    @JsonIgnore
    public void resetAsyncPSDEDSId() {
        this._reset(DTOFIELD_ASYNCPSDEDSID);
    }

    @JsonIgnore
    public PSSysMapItemDTO asyncpsdedsid(String asyncPSDEDSId) {
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO asyncpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setAsyncPSDEDSId(null);
            this.setAsyncPSDEDSName(null);
        } else {
            this.setAsyncPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAsyncPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="asyncpsdedsname")
    public void setAsyncPSDEDSName(String asyncPSDEDSName) {
        this._set(DTOFIELD_ASYNCPSDEDSNAME, asyncPSDEDSName);
    }

    @JsonIgnore
    public String getAsyncPSDEDSName() {
        Object objValue = this._get(DTOFIELD_ASYNCPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAsyncPSDEDSNameDirty() {
        return this._contains(DTOFIELD_ASYNCPSDEDSNAME);
    }

    @JsonIgnore
    public void resetAsyncPSDEDSName() {
        this._reset(DTOFIELD_ASYNCPSDEDSNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO asyncpsdedsname(String asyncPSDEDSName) {
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    @JsonProperty(value="bkcolor")
    public void setBKColor(String bKColor) {
        this._set(DTOFIELD_BKCOLOR, bKColor);
    }

    @JsonIgnore
    public String getBKColor() {
        Object objValue = this._get(DTOFIELD_BKCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorDirty() {
        return this._contains(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public void resetBKColor() {
        this._reset(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public PSSysMapItemDTO bkcolor(String bKColor) {
        this.setBKColor(bKColor);
        return this;
    }

    @JsonProperty(value="bkcolorpsdefid")
    public void setBKColorPSDEFId(String bKColorPSDEFId) {
        this._set(DTOFIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }

    @JsonIgnore
    public String getBKColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public void resetBKColorPSDEFId() {
        this._reset(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO bkcolorpsdefid(String bKColorPSDEFId) {
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO bkcolorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBKColorPSDEFId(null);
            this.setBKColorPSDEFName(null);
        } else {
            this.setBKColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setBKColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="bkcolorpsdefname")
    public void setBKColorPSDEFName(String bKColorPSDEFName) {
        this._set(DTOFIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }

    @JsonIgnore
    public String getBKColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetBKColorPSDEFName() {
        this._reset(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO bkcolorpsdefname(String bKColorPSDEFName) {
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    @JsonProperty(value="bordercolor")
    public void setBorderColor(String borderColor) {
        this._set(DTOFIELD_BORDERCOLOR, borderColor);
    }

    @JsonIgnore
    public String getBorderColor() {
        Object objValue = this._get(DTOFIELD_BORDERCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderColorDirty() {
        return this._contains(DTOFIELD_BORDERCOLOR);
    }

    @JsonIgnore
    public void resetBorderColor() {
        this._reset(DTOFIELD_BORDERCOLOR);
    }

    @JsonIgnore
    public PSSysMapItemDTO bordercolor(String borderColor) {
        this.setBorderColor(borderColor);
        return this;
    }

    @JsonProperty(value="borderwidth")
    public void setBorderWidth(Integer borderWidth) {
        this._set(DTOFIELD_BORDERWIDTH, borderWidth);
    }

    @JsonIgnore
    public Integer getBorderWidth() {
        Object objValue = this._get(DTOFIELD_BORDERWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBorderWidthDirty() {
        return this._contains(DTOFIELD_BORDERWIDTH);
    }

    @JsonIgnore
    public void resetBorderWidth() {
        this._reset(DTOFIELD_BORDERWIDTH);
    }

    @JsonIgnore
    public PSSysMapItemDTO borderwidth(Integer borderWidth) {
        this.setBorderWidth(borderWidth);
        return this;
    }

    @JsonProperty(value="clspsdefid")
    public void setClsPSDEFId(String clsPSDEFId) {
        this._set(DTOFIELD_CLSPSDEFID, clsPSDEFId);
    }

    @JsonIgnore
    public String getClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public void resetClsPSDEFId() {
        this._reset(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO clspsdefid(String clsPSDEFId) {
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO clspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        } else {
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="clspsdefname")
    public void setClsPSDEFName(String clsPSDEFName) {
        this._set(DTOFIELD_CLSPSDEFNAME, clsPSDEFName);
    }

    @JsonIgnore
    public String getClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetClsPSDEFName() {
        this._reset(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO clspsdefname(String clsPSDEFName) {
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSSysMapItemDTO color(String color) {
        this.setColor(color);
        return this;
    }

    @JsonProperty(value="colorpsdefid")
    public void setColorPSDEFId(String colorPSDEFId) {
        this._set(DTOFIELD_COLORPSDEFID, colorPSDEFId);
    }

    @JsonIgnore
    public String getColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public void resetColorPSDEFId() {
        this._reset(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO colorpsdefid(String colorPSDEFId) {
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO colorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setColorPSDEFId(null);
            this.setColorPSDEFName(null);
        } else {
            this.setColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="colorpsdefname")
    public void setColorPSDEFName(String colorPSDEFName) {
        this._set(DTOFIELD_COLORPSDEFNAME, colorPSDEFName);
    }

    @JsonIgnore
    public String getColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetColorPSDEFName() {
        this._reset(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO colorpsdefname(String colorPSDEFName) {
        this.setColorPSDEFName(colorPSDEFName);
        return this;
    }

    @JsonProperty(value="contentpsdefid")
    public void setContentPSDEFId(String contentPSDEFId) {
        this._set(DTOFIELD_CONTENTPSDEFID, contentPSDEFId);
    }

    @JsonIgnore
    public String getContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetContentPSDEFId() {
        this._reset(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO contentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        } else {
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="contentpsdefname")
    public void setContentPSDEFName(String contentPSDEFName) {
        this._set(DTOFIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }

    @JsonIgnore
    public String getContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetContentPSDEFName() {
        this._reset(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO contentpsdefname(String contentPSDEFName) {
        this.setContentPSDEFName(contentPSDEFName);
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
    public PSSysMapItemDTO createdate(Timestamp createDate) {
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
    public PSSysMapItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSSysMapItemDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSSysMapItemDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="data2psdefid")
    public void setData2PSDEFId(String data2PSDEFId) {
        this._set(DTOFIELD_DATA2PSDEFID, data2PSDEFId);
    }

    @JsonIgnore
    public String getData2PSDEFId() {
        Object objValue = this._get(DTOFIELD_DATA2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isData2PSDEFIdDirty() {
        return this._contains(DTOFIELD_DATA2PSDEFID);
    }

    @JsonIgnore
    public void resetData2PSDEFId() {
        this._reset(DTOFIELD_DATA2PSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO data2psdefid(String data2PSDEFId) {
        this.setData2PSDEFId(data2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO data2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setData2PSDEFId(null);
            this.setData2PSDEFName(null);
        } else {
            this.setData2PSDEFId(pSDEField.getPSDEFieldId());
            this.setData2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="data2psdefname")
    public void setData2PSDEFName(String data2PSDEFName) {
        this._set(DTOFIELD_DATA2PSDEFNAME, data2PSDEFName);
    }

    @JsonIgnore
    public String getData2PSDEFName() {
        Object objValue = this._get(DTOFIELD_DATA2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isData2PSDEFNameDirty() {
        return this._contains(DTOFIELD_DATA2PSDEFNAME);
    }

    @JsonIgnore
    public void resetData2PSDEFName() {
        this._reset(DTOFIELD_DATA2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO data2psdefname(String data2PSDEFName) {
        this.setData2PSDEFName(data2PSDEFName);
        return this;
    }

    @JsonProperty(value="datapsdefid")
    public void setDataPSDEFId(String dataPSDEFId) {
        this._set(DTOFIELD_DATAPSDEFID, dataPSDEFId);
    }

    @JsonIgnore
    public String getDataPSDEFId() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFIdDirty() {
        return this._contains(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public void resetDataPSDEFId() {
        this._reset(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO datapsdefid(String dataPSDEFId) {
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO datapsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        } else {
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="datapsdefname")
    public void setDataPSDEFName(String dataPSDEFName) {
        this._set(DTOFIELD_DATAPSDEFNAME, dataPSDEFName);
    }

    @JsonIgnore
    public String getDataPSDEFName() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFNameDirty() {
        return this._contains(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public void resetDataPSDEFName() {
        this._reset(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO datapsdefname(String dataPSDEFName) {
        this.setDataPSDEFName(dataPSDEFName);
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
    public PSSysMapItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="grouppsdefid")
    public void setGroupPSDEFId(String groupPSDEFId) {
        this._set(DTOFIELD_GROUPPSDEFID, groupPSDEFId);
    }

    @JsonIgnore
    public String getGroupPSDEFId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public void resetGroupPSDEFId() {
        this._reset(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        } else {
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdefname")
    public void setGroupPSDEFName(String groupPSDEFName) {
        this._set(DTOFIELD_GROUPPSDEFNAME, groupPSDEFName);
    }

    @JsonIgnore
    public String getGroupPSDEFName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFNameDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public void resetGroupPSDEFName() {
        this._reset(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdefname(String groupPSDEFName) {
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    @JsonProperty(value="grouppsdeuagroupid")
    public void setGroupPSDEUAGroupId(String groupPSDEUAGroupId) {
        this._set(DTOFIELD_GROUPPSDEUAGROUPID, groupPSDEUAGroupId);
    }

    @JsonIgnore
    public String getGroupPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetGroupPSDEUAGroupId() {
        this._reset(DTOFIELD_GROUPPSDEUAGROUPID);
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdeuagroupid(String groupPSDEUAGroupId) {
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setGroupPSDEUAGroupId(null);
            this.setGroupPSDEUAGroupName(null);
        } else {
            this.setGroupPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setGroupPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdeuagroupname")
    public void setGroupPSDEUAGroupName(String groupPSDEUAGroupName) {
        this._set(DTOFIELD_GROUPPSDEUAGROUPNAME, groupPSDEUAGroupName);
    }

    @JsonIgnore
    public String getGroupPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_GROUPPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetGroupPSDEUAGroupName() {
        this._reset(DTOFIELD_GROUPPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO grouppsdeuagroupname(String groupPSDEUAGroupName) {
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="iconpsdefid")
    public void setIconPSDEFId(String iconPSDEFId) {
        this._set(DTOFIELD_ICONPSDEFID, iconPSDEFId);
    }

    @JsonIgnore
    public String getIconPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public void resetIconPSDEFId() {
        this._reset(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO iconpsdefid(String iconPSDEFId) {
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO iconpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        } else {
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconpsdefname")
    public void setIconPSDEFName(String iconPSDEFName) {
        this._set(DTOFIELD_ICONPSDEFNAME, iconPSDEFName);
    }

    @JsonIgnore
    public String getIconPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconPSDEFName() {
        this._reset(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO iconpsdefname(String iconPSDEFName) {
        this.setIconPSDEFName(iconPSDEFName);
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
    public PSSysMapItemDTO itemstyle(String itemStyle) {
        this.setItemStyle(itemStyle);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO itemstyle(PSModelEnums.MapItemStyle itemStyle) {
        if (itemStyle == null) {
            this.setItemStyle(null);
        } else {
            this.setItemStyle(itemStyle.value);
        }
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
    public PSSysMapItemDTO itemstyletext(String itemStyleText) {
        this.setItemStyleText(itemStyleText);
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
    public PSSysMapItemDTO itemtype(String itemType) {
        this.setItemType(itemType);
        return this;
    }

    @JsonProperty(value="keypsdefid")
    public void setKeyPSDEFId(String keyPSDEFId) {
        this._set(DTOFIELD_KEYPSDEFID, keyPSDEFId);
    }

    @JsonIgnore
    public String getKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public void resetKeyPSDEFId() {
        this._reset(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO keypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        } else {
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="keypsdefname")
    public void setKeyPSDEFName(String keyPSDEFName) {
        this._set(DTOFIELD_KEYPSDEFNAME, keyPSDEFName);
    }

    @JsonIgnore
    public String getKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetKeyPSDEFName() {
        this._reset(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO keypsdefname(String keyPSDEFName) {
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    @JsonProperty(value="latpsdefid")
    public void setLatPSDEFId(String latPSDEFId) {
        this._set(DTOFIELD_LATPSDEFID, latPSDEFId);
    }

    @JsonIgnore
    public String getLatPSDEFId() {
        Object objValue = this._get(DTOFIELD_LATPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLatPSDEFIdDirty() {
        return this._contains(DTOFIELD_LATPSDEFID);
    }

    @JsonIgnore
    public void resetLatPSDEFId() {
        this._reset(DTOFIELD_LATPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO latpsdefid(String latPSDEFId) {
        this.setLatPSDEFId(latPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO latpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLatPSDEFId(null);
            this.setLatPSDEFName(null);
        } else {
            this.setLatPSDEFId(pSDEField.getPSDEFieldId());
            this.setLatPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="latpsdefname")
    public void setLatPSDEFName(String latPSDEFName) {
        this._set(DTOFIELD_LATPSDEFNAME, latPSDEFName);
    }

    @JsonIgnore
    public String getLatPSDEFName() {
        Object objValue = this._get(DTOFIELD_LATPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLatPSDEFNameDirty() {
        return this._contains(DTOFIELD_LATPSDEFNAME);
    }

    @JsonIgnore
    public void resetLatPSDEFName() {
        this._reset(DTOFIELD_LATPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO latpsdefname(String latPSDEFName) {
        this.setLatPSDEFName(latPSDEFName);
        return this;
    }

    @JsonProperty(value="linkpsdefid")
    public void setLinkPSDEFId(String linkPSDEFId) {
        this._set(DTOFIELD_LINKPSDEFID, linkPSDEFId);
    }

    @JsonIgnore
    public String getLinkPSDEFId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEFIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEFID);
    }

    @JsonIgnore
    public void resetLinkPSDEFId() {
        this._reset(DTOFIELD_LINKPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO linkpsdefid(String linkPSDEFId) {
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO linkpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLinkPSDEFId(null);
            this.setLinkPSDEFName(null);
        } else {
            this.setLinkPSDEFId(pSDEField.getPSDEFieldId());
            this.setLinkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdefname")
    public void setLinkPSDEFName(String linkPSDEFName) {
        this._set(DTOFIELD_LINKPSDEFNAME, linkPSDEFName);
    }

    @JsonIgnore
    public String getLinkPSDEFName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEFNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEFNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEFName() {
        this._reset(DTOFIELD_LINKPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO linkpsdefname(String linkPSDEFName) {
        this.setLinkPSDEFName(linkPSDEFName);
        return this;
    }

    @JsonProperty(value="longpsdefid")
    public void setLongPSDEFId(String longPSDEFId) {
        this._set(DTOFIELD_LONGPSDEFID, longPSDEFId);
    }

    @JsonIgnore
    public String getLongPSDEFId() {
        Object objValue = this._get(DTOFIELD_LONGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLongPSDEFIdDirty() {
        return this._contains(DTOFIELD_LONGPSDEFID);
    }

    @JsonIgnore
    public void resetLongPSDEFId() {
        this._reset(DTOFIELD_LONGPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO longpsdefid(String longPSDEFId) {
        this.setLongPSDEFId(longPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO longpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLongPSDEFId(null);
            this.setLongPSDEFName(null);
        } else {
            this.setLongPSDEFId(pSDEField.getPSDEFieldId());
            this.setLongPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="longpsdefname")
    public void setLongPSDEFName(String longPSDEFName) {
        this._set(DTOFIELD_LONGPSDEFNAME, longPSDEFName);
    }

    @JsonIgnore
    public String getLongPSDEFName() {
        Object objValue = this._get(DTOFIELD_LONGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLongPSDEFNameDirty() {
        return this._contains(DTOFIELD_LONGPSDEFNAME);
    }

    @JsonIgnore
    public void resetLongPSDEFName() {
        this._reset(DTOFIELD_LONGPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO longpsdefname(String longPSDEFName) {
        this.setLongPSDEFName(longPSDEFName);
        return this;
    }

    @JsonProperty(value="maxsize")
    public void setMaxSize(Integer maxSize) {
        this._set(DTOFIELD_MAXSIZE, maxSize);
    }

    @JsonIgnore
    public Integer getMaxSize() {
        Object objValue = this._get(DTOFIELD_MAXSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxSizeDirty() {
        return this._contains(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public void resetMaxSize() {
        this._reset(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public PSSysMapItemDTO maxsize(Integer maxSize) {
        this.setMaxSize(maxSize);
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
    public PSSysMapItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelobj")
    public void setModelObj(String modelObj) {
        this._set(DTOFIELD_MODELOBJ, modelObj);
    }

    @JsonIgnore
    public String getModelObj() {
        Object objValue = this._get(DTOFIELD_MODELOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelObjDirty() {
        return this._contains(DTOFIELD_MODELOBJ);
    }

    @JsonIgnore
    public void resetModelObj() {
        this._reset(DTOFIELD_MODELOBJ);
    }

    @JsonIgnore
    public PSSysMapItemDTO modelobj(String modelObj) {
        this.setModelObj(modelObj);
        return this;
    }

    @JsonProperty(value="movepsdeactionid")
    public void setMovePSDEActionId(String movePSDEActionId) {
        this._set(DTOFIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }

    @JsonIgnore
    public String getMovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetMovePSDEActionId() {
        this._reset(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        } else {
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="movepsdeactionname")
    public void setMovePSDEActionName(String movePSDEActionName) {
        this._set(DTOFIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }

    @JsonIgnore
    public String getMovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetMovePSDEActionName() {
        this._reset(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeactionname(String movePSDEActionName) {
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    @JsonProperty(value="movepsdeopprivid")
    public void setMovePSDEOPPrivId(String movePSDEOPPrivId) {
        this._set(DTOFIELD_MOVEPSDEOPPRIVID, movePSDEOPPrivId);
    }

    @JsonIgnore
    public String getMovePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_MOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetMovePSDEOPPrivId() {
        this._reset(DTOFIELD_MOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeopprivid(String movePSDEOPPrivId) {
        this.setMovePSDEOPPrivId(movePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setMovePSDEOPPrivId(null);
            this.setMovePSDEOPPrivName(null);
        } else {
            this.setMovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setMovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="movepsdeopprivname")
    public void setMovePSDEOPPrivName(String movePSDEOPPrivName) {
        this._set(DTOFIELD_MOVEPSDEOPPRIVNAME, movePSDEOPPrivName);
    }

    @JsonIgnore
    public String getMovePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_MOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetMovePSDEOPPrivName() {
        this._reset(DTOFIELD_MOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO movepsdeopprivname(String movePSDEOPPrivName) {
        this.setMovePSDEOPPrivName(movePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="namepslanresid")
    public void setNamePSLanResId(String namePSLanResId) {
        this._set(DTOFIELD_NAMEPSLANRESID, namePSLanResId);
    }

    @JsonIgnore
    public String getNamePSLanResId() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResIdDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public void resetNamePSLanResId() {
        this._reset(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public PSSysMapItemDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        } else {
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="namepslanresname")
    public void setNamePSLanResName(String namePSLanResName) {
        this._set(DTOFIELD_NAMEPSLANRESNAME, namePSLanResName);
    }

    @JsonIgnore
    public String getNamePSLanResName() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResNameDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetNamePSLanResName() {
        this._reset(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO namepslanresname(String namePSLanResName) {
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    @JsonProperty(value="navviewfilter")
    public void setNavViewFilter(String navViewFilter) {
        this._set(DTOFIELD_NAVVIEWFILTER, navViewFilter);
    }

    @JsonIgnore
    public String getNavViewFilter() {
        Object objValue = this._get(DTOFIELD_NAVVIEWFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewFilterDirty() {
        return this._contains(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public void resetNavViewFilter() {
        this._reset(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public PSSysMapItemDTO navviewfilter(String navViewFilter) {
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    @JsonProperty(value="navviewparam")
    public void setNavViewParam(String navViewParam) {
        this._set(DTOFIELD_NAVVIEWPARAM, navViewParam);
    }

    @JsonIgnore
    public String getNavViewParam() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewParamDirty() {
        return this._contains(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public void resetNavViewParam() {
        this._reset(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public PSSysMapItemDTO navviewparam(String navViewParam) {
        this.setNavViewParam(navViewParam);
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
    public PSSysMapItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ordervaluepsdefid")
    public void setOrderValuePSDEFId(String orderValuePSDEFId) {
        this._set(DTOFIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }

    @JsonIgnore
    public String getOrderValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_ORDERVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_ORDERVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetOrderValuePSDEFId() {
        this._reset(DTOFIELD_ORDERVALUEPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        } else {
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="ordervaluepsdefname")
    public void setOrderValuePSDEFName(String orderValuePSDEFName) {
        this._set(DTOFIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }

    @JsonIgnore
    public String getOrderValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_ORDERVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_ORDERVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetOrderValuePSDEFName() {
        this._reset(DTOFIELD_ORDERVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO ordervaluepsdefname(String orderValuePSDEFName) {
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSSysMapItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSSysMapItemDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSSysMapItemDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSSysMapItemDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
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
    public PSSysMapItemDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        } else {
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
    public PSSysMapItemDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
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
    public PSSysMapItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysMapItemDTO pssyscssname(String pSSysCssName) {
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
    public PSSysMapItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSSysMapItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssysmapitemid")
    public void setPSSysMapItemId(String pSSysMapItemId) {
        this._set(DTOFIELD_PSSYSMAPITEMID, pSSysMapItemId);
    }

    @JsonIgnore
    public String getPSSysMapItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSMAPITEMID);
    }

    @JsonIgnore
    public void resetPSSysMapItemId() {
        this._reset(DTOFIELD_PSSYSMAPITEMID);
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysmapitemid(String pSSysMapItemId) {
        this.setPSSysMapItemId(pSSysMapItemId);
        return this;
    }

    @JsonProperty(value="pssysmapitemname")
    public void setPSSysMapItemName(String pSSysMapItemName) {
        this._set(DTOFIELD_PSSYSMAPITEMNAME, pSSysMapItemName);
    }

    @JsonIgnore
    public String getPSSysMapItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSMAPITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysMapItemName() {
        this._reset(DTOFIELD_PSSYSMAPITEMNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysmapitemname(String pSSysMapItemName) {
        this.setPSSysMapItemName(pSSysMapItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysMapItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysMapItemName(strName);
    }

    @JsonIgnore
    public PSSysMapItemDTO name(String strName) {
        this.setPSSysMapItemName(strName);
        return this;
    }

    @JsonProperty(value="pssysmapviewid")
    public void setPSSysMapViewId(String pSSysMapViewId) {
        this._set(DTOFIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }

    @JsonIgnore
    public String getPSSysMapViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public void resetPSSysMapViewId() {
        this._reset(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysmapviewid(String pSSysMapViewId) {
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysmapviewid(PSSysMapViewDTO pSSysMapView) {
        if (pSSysMapView == null) {
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        } else {
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    @JsonProperty(value="pssysmapviewname")
    public void setPSSysMapViewName(String pSSysMapViewName) {
        this._set(DTOFIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }

    @JsonIgnore
    public String getPSSysMapViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysMapViewName() {
        this._reset(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO pssysmapviewname(String pSSysMapViewName) {
        this.setPSSysMapViewName(pSSysMapViewName);
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
    public PSSysMapItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysMapItemDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="radius")
    public void setRadius(Integer radius) {
        this._set(DTOFIELD_RADIUS, radius);
    }

    @JsonIgnore
    public Integer getRadius() {
        Object objValue = this._get(DTOFIELD_RADIUS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRadiusDirty() {
        return this._contains(DTOFIELD_RADIUS);
    }

    @JsonIgnore
    public void resetRadius() {
        this._reset(DTOFIELD_RADIUS);
    }

    @JsonIgnore
    public PSSysMapItemDTO radius(Integer radius) {
        this.setRadius(radius);
        return this;
    }

    @JsonProperty(value="removepsdeactionid")
    public void setRemovePSDEActionId(String removePSDEActionId) {
        this._set(DTOFIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }

    @JsonIgnore
    public String getRemovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetRemovePSDEActionId() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        } else {
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeactionname")
    public void setRemovePSDEActionName(String removePSDEActionName) {
        this._set(DTOFIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }

    @JsonIgnore
    public String getRemovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEActionName() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    @JsonProperty(value="removepsdeopprivid")
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivId() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeopprivid(String removePSDEOPPrivId) {
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        } else {
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeopprivname")
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivName() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO removepsdeopprivname(String removePSDEOPPrivName) {
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="shapeclspsdefid")
    public void setShapeClsPSDEFId(String shapeClsPSDEFId) {
        this._set(DTOFIELD_SHAPECLSPSDEFID, shapeClsPSDEFId);
    }

    @JsonIgnore
    public String getShapeClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_SHAPECLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_SHAPECLSPSDEFID);
    }

    @JsonIgnore
    public void resetShapeClsPSDEFId() {
        this._reset(DTOFIELD_SHAPECLSPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO shapeclspsdefid(String shapeClsPSDEFId) {
        this.setShapeClsPSDEFId(shapeClsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO shapeclspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setShapeClsPSDEFId(null);
            this.setShapeClsPSDEFName(null);
        } else {
            this.setShapeClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setShapeClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="shapeclspsdefname")
    public void setShapeClsPSDEFName(String shapeClsPSDEFName) {
        this._set(DTOFIELD_SHAPECLSPSDEFNAME, shapeClsPSDEFName);
    }

    @JsonIgnore
    public String getShapeClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_SHAPECLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_SHAPECLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetShapeClsPSDEFName() {
        this._reset(DTOFIELD_SHAPECLSPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO shapeclspsdefname(String shapeClsPSDEFName) {
        this.setShapeClsPSDEFName(shapeClsPSDEFName);
        return this;
    }

    @JsonProperty(value="shapedynaclass")
    public void setShapeDynaClass(String shapeDynaClass) {
        this._set(DTOFIELD_SHAPEDYNACLASS, shapeDynaClass);
    }

    @JsonIgnore
    public String getShapeDynaClass() {
        Object objValue = this._get(DTOFIELD_SHAPEDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeDynaClassDirty() {
        return this._contains(DTOFIELD_SHAPEDYNACLASS);
    }

    @JsonIgnore
    public void resetShapeDynaClass() {
        this._reset(DTOFIELD_SHAPEDYNACLASS);
    }

    @JsonIgnore
    public PSSysMapItemDTO shapedynaclass(String shapeDynaClass) {
        this.setShapeDynaClass(shapeDynaClass);
        return this;
    }

    @JsonProperty(value="shapepssyscssid")
    public void setShapePSSysCssId(String shapePSSysCssId) {
        this._set(DTOFIELD_SHAPEPSSYSCSSID, shapePSSysCssId);
    }

    @JsonIgnore
    public String getShapePSSysCssId() {
        Object objValue = this._get(DTOFIELD_SHAPEPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapePSSysCssIdDirty() {
        return this._contains(DTOFIELD_SHAPEPSSYSCSSID);
    }

    @JsonIgnore
    public void resetShapePSSysCssId() {
        this._reset(DTOFIELD_SHAPEPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysMapItemDTO shapepssyscssid(String shapePSSysCssId) {
        this.setShapePSSysCssId(shapePSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO shapepssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setShapePSSysCssId(null);
            this.setShapePSSysCssName(null);
        } else {
            this.setShapePSSysCssId(pSSysCss.getPSSysCssId());
            this.setShapePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="shapepssyscssname")
    public void setShapePSSysCssName(String shapePSSysCssName) {
        this._set(DTOFIELD_SHAPEPSSYSCSSNAME, shapePSSysCssName);
    }

    @JsonIgnore
    public String getShapePSSysCssName() {
        Object objValue = this._get(DTOFIELD_SHAPEPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapePSSysCssNameDirty() {
        return this._contains(DTOFIELD_SHAPEPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetShapePSSysCssName() {
        this._reset(DTOFIELD_SHAPEPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO shapepssyscssname(String shapePSSysCssName) {
        this.setShapePSSysCssName(shapePSSysCssName);
        return this;
    }

    @JsonProperty(value="tag2psdefid")
    public void setTag2PSDEFId(String tag2PSDEFId) {
        this._set(DTOFIELD_TAG2PSDEFID, tag2PSDEFId);
    }

    @JsonIgnore
    public String getTag2PSDEFId() {
        Object objValue = this._get(DTOFIELD_TAG2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTag2PSDEFIdDirty() {
        return this._contains(DTOFIELD_TAG2PSDEFID);
    }

    @JsonIgnore
    public void resetTag2PSDEFId() {
        this._reset(DTOFIELD_TAG2PSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO tag2psdefid(String tag2PSDEFId) {
        this.setTag2PSDEFId(tag2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO tag2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTag2PSDEFId(null);
            this.setTag2PSDEFName(null);
        } else {
            this.setTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tag2psdefname")
    public void setTag2PSDEFName(String tag2PSDEFName) {
        this._set(DTOFIELD_TAG2PSDEFNAME, tag2PSDEFName);
    }

    @JsonIgnore
    public String getTag2PSDEFName() {
        Object objValue = this._get(DTOFIELD_TAG2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTag2PSDEFNameDirty() {
        return this._contains(DTOFIELD_TAG2PSDEFNAME);
    }

    @JsonIgnore
    public void resetTag2PSDEFName() {
        this._reset(DTOFIELD_TAG2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO tag2psdefname(String tag2PSDEFName) {
        this.setTag2PSDEFName(tag2PSDEFName);
        return this;
    }

    @JsonProperty(value="tagpsdefid")
    public void setTagPSDEFId(String tagPSDEFId) {
        this._set(DTOFIELD_TAGPSDEFID, tagPSDEFId);
    }

    @JsonIgnore
    public String getTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_TAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_TAGPSDEFID);
    }

    @JsonIgnore
    public void resetTagPSDEFId() {
        this._reset(DTOFIELD_TAGPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO tagpsdefid(String tagPSDEFId) {
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO tagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTagPSDEFId(null);
            this.setTagPSDEFName(null);
        } else {
            this.setTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tagpsdefname")
    public void setTagPSDEFName(String tagPSDEFName) {
        this._set(DTOFIELD_TAGPSDEFNAME, tagPSDEFName);
    }

    @JsonIgnore
    public String getTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_TAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_TAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetTagPSDEFName() {
        this._reset(DTOFIELD_TAGPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO tagpsdefname(String tagPSDEFName) {
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    @JsonProperty(value="timepsdefid")
    public void setTimePSDEFId(String timePSDEFId) {
        this._set(DTOFIELD_TIMEPSDEFID, timePSDEFId);
    }

    @JsonIgnore
    public String getTimePSDEFId() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFIdDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public void resetTimePSDEFId() {
        this._reset(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO timepsdefid(String timePSDEFId) {
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO timepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        } else {
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="timepsdefname")
    public void setTimePSDEFName(String timePSDEFName) {
        this._set(DTOFIELD_TIMEPSDEFNAME, timePSDEFName);
    }

    @JsonIgnore
    public String getTimePSDEFName() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFNameDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTimePSDEFName() {
        this._reset(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO timepsdefname(String timePSDEFName) {
        this.setTimePSDEFName(timePSDEFName);
        return this;
    }

    @JsonProperty(value="tipspsdefid")
    public void setTipsPSDEFId(String tipsPSDEFId) {
        this._set(DTOFIELD_TIPSPSDEFID, tipsPSDEFId);
    }

    @JsonIgnore
    public String getTipsPSDEFId() {
        Object objValue = this._get(DTOFIELD_TIPSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipsPSDEFIdDirty() {
        return this._contains(DTOFIELD_TIPSPSDEFID);
    }

    @JsonIgnore
    public void resetTipsPSDEFId() {
        this._reset(DTOFIELD_TIPSPSDEFID);
    }

    @JsonIgnore
    public PSSysMapItemDTO tipspsdefid(String tipsPSDEFId) {
        this.setTipsPSDEFId(tipsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO tipspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTipsPSDEFId(null);
            this.setTipsPSDEFName(null);
        } else {
            this.setTipsPSDEFId(pSDEField.getPSDEFieldId());
            this.setTipsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tipspsdefname")
    public void setTipsPSDEFName(String tipsPSDEFName) {
        this._set(DTOFIELD_TIPSPSDEFNAME, tipsPSDEFName);
    }

    @JsonIgnore
    public String getTipsPSDEFName() {
        Object objValue = this._get(DTOFIELD_TIPSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipsPSDEFNameDirty() {
        return this._contains(DTOFIELD_TIPSPSDEFNAME);
    }

    @JsonIgnore
    public void resetTipsPSDEFName() {
        this._reset(DTOFIELD_TIPSPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMapItemDTO tipspsdefname(String tipsPSDEFName) {
        this.setTipsPSDEFName(tipsPSDEFName);
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
    public PSSysMapItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysMapItemDTO updateman(String updateMan) {
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
    public PSSysMapItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
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
    public PSSysMapItemDTO usertag(String userTag) {
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
    public PSSysMapItemDTO usertag2(String userTag2) {
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
    public PSSysMapItemDTO usertag3(String userTag3) {
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
    public PSSysMapItemDTO usertag4(String userTag4) {
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
    public PSSysMapItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysMapItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysMapItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysMapItemId(strValue);
    }

    @JsonIgnore
    public PSSysMapItemDTO id(String strValue) {
        this.setPSSysMapItemId(strValue);
        return this;
    }
}
