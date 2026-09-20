package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarItemRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCalendarItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ASYNCPSDEDSID = "ASYNCPSDEDSID";
    protected static final String DTOFIELD_ASYNCPSDEDSID = "asyncpsdedsid";
    public static final String FIELD_ASYNCPSDEDSNAME = "ASYNCPSDEDSNAME";
    protected static final String DTOFIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";
    public static final String FIELD_BEGINPSDEFID = "BEGINPSDEFID";
    protected static final String DTOFIELD_BEGINPSDEFID = "beginpsdefid";
    public static final String FIELD_BEGINPSDEFNAME = "BEGINPSDEFNAME";
    protected static final String DTOFIELD_BEGINPSDEFNAME = "beginpsdefname";
    public static final String FIELD_BKCOLOR = "BKCOLOR";
    protected static final String DTOFIELD_BKCOLOR = "bkcolor";
    public static final String FIELD_BKCOLORPSDEFID = "BKCOLORPSDEFID";
    protected static final String DTOFIELD_BKCOLORPSDEFID = "bkcolorpsdefid";
    public static final String FIELD_BKCOLORPSDEFNAME = "BKCOLORPSDEFNAME";
    protected static final String DTOFIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";
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
    public static final String FIELD_CREATEPSDEACTIONID = "CREATEPSDEACTIONID";
    protected static final String DTOFIELD_CREATEPSDEACTIONID = "createpsdeactionid";
    public static final String FIELD_CREATEPSDEACTIONNAME = "CREATEPSDEACTIONNAME";
    protected static final String DTOFIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";
    public static final String FIELD_CREATEPSDEOPPRIVID = "CREATEPSDEOPPRIVID";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";
    public static final String FIELD_CREATEPSDEOPPRIVNAME = "CREATEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVNAME = "createpsdeopprivname";
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
    public static final String FIELD_EDITMODE = "EDITMODE";
    protected static final String DTOFIELD_EDITMODE = "editmode";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_ENDPSDEFID = "ENDPSDEFID";
    protected static final String DTOFIELD_ENDPSDEFID = "endpsdefid";
    public static final String FIELD_ENDPSDEFNAME = "ENDPSDEFNAME";
    protected static final String DTOFIELD_ENDPSDEFNAME = "endpsdefname";
    public static final String FIELD_FINISHPSDEFID = "FINISHPSDEFID";
    protected static final String DTOFIELD_FINISHPSDEFID = "finishpsdefid";
    public static final String FIELD_FINISHPSDEFNAME = "FINISHPSDEFNAME";
    protected static final String DTOFIELD_FINISHPSDEFNAME = "finishpsdefname";
    public static final String FIELD_GANTTPSSYSPFPLUGINID = "GANTTPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GANTTPSSYSPFPLUGINID = "ganttpssyspfpluginid";
    public static final String FIELD_GANTTPSSYSPFPLUGINNAME = "GANTTPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GANTTPSSYSPFPLUGINNAME = "ganttpssyspfpluginname";
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
    public static final String FIELD_LEVELPSDEFID = "LEVELPSDEFID";
    protected static final String DTOFIELD_LEVELPSDEFID = "levelpsdefid";
    public static final String FIELD_LEVELPSDEFNAME = "LEVELPSDEFNAME";
    protected static final String DTOFIELD_LEVELPSDEFNAME = "levelpsdefname";
    public static final String FIELD_LINKPSDEFID = "LINKPSDEFID";
    protected static final String DTOFIELD_LINKPSDEFID = "linkpsdefid";
    public static final String FIELD_LINKPSDEFNAME = "LINKPSDEFNAME";
    protected static final String DTOFIELD_LINKPSDEFNAME = "linkpsdefname";
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
    public static final String FIELD_PKEYPSDEFID = "PKEYPSDEFID";
    protected static final String DTOFIELD_PKEYPSDEFID = "pkeypsdefid";
    public static final String FIELD_PKEYPSDEFNAME = "PKEYPSDEFNAME";
    protected static final String DTOFIELD_PKEYPSDEFNAME = "pkeypsdefname";
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
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARITEMID = "PSSYSCALENDARITEMID";
    protected static final String DTOFIELD_PSSYSCALENDARITEMID = "pssyscalendaritemid";
    public static final String FIELD_PSSYSCALENDARITEMNAME = "PSSYSCALENDARITEMNAME";
    protected static final String DTOFIELD_PSSYSCALENDARITEMNAME = "pssyscalendaritemname";
    public static final String FIELD_PSSYSCALENDARNAME = "PSSYSCALENDARNAME";
    protected static final String DTOFIELD_PSSYSCALENDARNAME = "pssyscalendarname";
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
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_REMOVEPSDEOPPRIVID = "REMOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";
    public static final String FIELD_REMOVEPSDEOPPRIVNAME = "REMOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";
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
    public static final String FIELD_TIPSPSDEFID = "TIPSPSDEFID";
    protected static final String DTOFIELD_TIPSPSDEFID = "tipspsdefid";
    public static final String FIELD_TIPSPSDEFNAME = "TIPSPSDEFNAME";
    protected static final String DTOFIELD_TIPSPSDEFNAME = "tipspsdefname";
    public static final String FIELD_TOTALPSDEFID = "TOTALPSDEFID";
    protected static final String DTOFIELD_TOTALPSDEFID = "totalpsdefid";
    public static final String FIELD_TOTALPSDEFNAME = "TOTALPSDEFNAME";
    protected static final String DTOFIELD_TOTALPSDEFNAME = "totalpsdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATEPSDEACTIONID = "UPDATEPSDEACTIONID";
    protected static final String DTOFIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";
    public static final String FIELD_UPDATEPSDEACTIONNAME = "UPDATEPSDEACTIONNAME";
    protected static final String DTOFIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";
    public static final String FIELD_UPDATEPSDEOPPRIVID = "UPDATEPSDEOPPRIVID";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";
    public static final String FIELD_UPDATEPSDEOPPRIVNAME = "UPDATEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";
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
    public static final String FIELD_VIEWACTIONS = "VIEWACTIONS";
    protected static final String DTOFIELD_VIEWACTIONS = "viewactions";
    public static final String DTOFIELD_PSSYSCALENDARITEMRVS = "pssyscalendaritemrvs";

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
    public PSSysCalendarItemDTO asyncpsdedsid(String asyncPSDEDSId) {
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO asyncpsdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysCalendarItemDTO asyncpsdedsname(String asyncPSDEDSName) {
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    @JsonProperty(value="beginpsdefid")
    public void setBeginPSDEFId(String beginPSDEFId) {
        this._set(DTOFIELD_BEGINPSDEFID, beginPSDEFId);
    }

    @JsonIgnore
    public String getBeginPSDEFId() {
        Object objValue = this._get(DTOFIELD_BEGINPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginPSDEFIdDirty() {
        return this._contains(DTOFIELD_BEGINPSDEFID);
    }

    @JsonIgnore
    public void resetBeginPSDEFId() {
        this._reset(DTOFIELD_BEGINPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefid(String beginPSDEFId) {
        this.setBeginPSDEFId(beginPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBeginPSDEFId(null);
            this.setBeginPSDEFName(null);
        } else {
            this.setBeginPSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="beginpsdefname")
    public void setBeginPSDEFName(String beginPSDEFName) {
        this._set(DTOFIELD_BEGINPSDEFNAME, beginPSDEFName);
    }

    @JsonIgnore
    public String getBeginPSDEFName() {
        Object objValue = this._get(DTOFIELD_BEGINPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginPSDEFNameDirty() {
        return this._contains(DTOFIELD_BEGINPSDEFNAME);
    }

    @JsonIgnore
    public void resetBeginPSDEFName() {
        this._reset(DTOFIELD_BEGINPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO beginpsdefname(String beginPSDEFName) {
        this.setBeginPSDEFName(beginPSDEFName);
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
    public PSSysCalendarItemDTO bkcolor(String bKColor) {
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
    public PSSysCalendarItemDTO bkcolorpsdefid(String bKColorPSDEFId) {
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO bkcolorpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO bkcolorpsdefname(String bKColorPSDEFName) {
        this.setBKColorPSDEFName(bKColorPSDEFName);
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
    public PSSysCalendarItemDTO clspsdefid(String clsPSDEFId) {
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO clspsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO clspsdefname(String clsPSDEFName) {
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
    public PSSysCalendarItemDTO color(String color) {
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
    public PSSysCalendarItemDTO colorpsdefid(String colorPSDEFId) {
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO colorpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO colorpsdefname(String colorPSDEFName) {
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
    public PSSysCalendarItemDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO contentpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO contentpsdefname(String contentPSDEFName) {
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
    public PSSysCalendarItemDTO createdate(Timestamp createDate) {
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
    public PSSysCalendarItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createpsdeactionid")
    public void setCreatePSDEActionId(String createPSDEActionId) {
        this._set(DTOFIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }

    @JsonIgnore
    public String getCreatePSDEActionId() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty() {
        return this._contains(DTOFIELD_CREATEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetCreatePSDEActionId() {
        this._reset(DTOFIELD_CREATEPSDEACTIONID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        } else {
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="createpsdeactionname")
    public void setCreatePSDEActionName(String createPSDEActionName) {
        this._set(DTOFIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }

    @JsonIgnore
    public String getCreatePSDEActionName() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty() {
        return this._contains(DTOFIELD_CREATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetCreatePSDEActionName() {
        this._reset(DTOFIELD_CREATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeactionname(String createPSDEActionName) {
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    @JsonProperty(value="createpsdeopprivid")
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivId() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivid(String createPSDEOPPrivId) {
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivName(null);
        } else {
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="createpsdeopprivname")
    public void setCreatePSDEOPPrivName(String createPSDEOPPrivName) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVNAME, createPSDEOPPrivName);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivName() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO createpsdeopprivname(String createPSDEOPPrivName) {
        this.setCreatePSDEOPPrivName(createPSDEOPPrivName);
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
    public PSSysCalendarItemDTO customcond(String customCond) {
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
    public PSSysCalendarItemDTO customtype(String customType) {
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
    public PSSysCalendarItemDTO data2psdefid(String data2PSDEFId) {
        this.setData2PSDEFId(data2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO data2psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO data2psdefname(String data2PSDEFName) {
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
    public PSSysCalendarItemDTO datapsdefid(String dataPSDEFId) {
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO datapsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO datapsdefname(String dataPSDEFName) {
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
    public PSSysCalendarItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="editmode")
    public void setEditMode(Integer editMode) {
        this._set(DTOFIELD_EDITMODE, editMode);
    }

    @JsonIgnore
    public Integer getEditMode() {
        Object objValue = this._get(DTOFIELD_EDITMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEditModeDirty() {
        return this._contains(DTOFIELD_EDITMODE);
    }

    @JsonIgnore
    public void resetEditMode() {
        this._reset(DTOFIELD_EDITMODE);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO editmode(Integer editMode) {
        this.setEditMode(editMode);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO editmode(Boolean editMode) {
        if (editMode == null) {
            this.setEditMode(null);
        } else {
            this.setEditMode(editMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableviewactions")
    public void setEnableViewActions(Integer enableViewActions) {
        this._set(DTOFIELD_ENABLEVIEWACTIONS, enableViewActions);
    }

    @JsonIgnore
    public Integer getEnableViewActions() {
        Object objValue = this._get(DTOFIELD_ENABLEVIEWACTIONS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableViewActionsDirty() {
        return this._contains(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public void resetEnableViewActions() {
        this._reset(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="endpsdefid")
    public void setEndPSDEFId(String endPSDEFId) {
        this._set(DTOFIELD_ENDPSDEFID, endPSDEFId);
    }

    @JsonIgnore
    public String getEndPSDEFId() {
        Object objValue = this._get(DTOFIELD_ENDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndPSDEFIdDirty() {
        return this._contains(DTOFIELD_ENDPSDEFID);
    }

    @JsonIgnore
    public void resetEndPSDEFId() {
        this._reset(DTOFIELD_ENDPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefid(String endPSDEFId) {
        this.setEndPSDEFId(endPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setEndPSDEFId(null);
            this.setEndPSDEFName(null);
        } else {
            this.setEndPSDEFId(pSDEField.getPSDEFieldId());
            this.setEndPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="endpsdefname")
    public void setEndPSDEFName(String endPSDEFName) {
        this._set(DTOFIELD_ENDPSDEFNAME, endPSDEFName);
    }

    @JsonIgnore
    public String getEndPSDEFName() {
        Object objValue = this._get(DTOFIELD_ENDPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndPSDEFNameDirty() {
        return this._contains(DTOFIELD_ENDPSDEFNAME);
    }

    @JsonIgnore
    public void resetEndPSDEFName() {
        this._reset(DTOFIELD_ENDPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO endpsdefname(String endPSDEFName) {
        this.setEndPSDEFName(endPSDEFName);
        return this;
    }

    @JsonProperty(value="finishpsdefid")
    public void setFinishPSDEFId(String finishPSDEFId) {
        this._set(DTOFIELD_FINISHPSDEFID, finishPSDEFId);
    }

    @JsonIgnore
    public String getFinishPSDEFId() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEFIdDirty() {
        return this._contains(DTOFIELD_FINISHPSDEFID);
    }

    @JsonIgnore
    public void resetFinishPSDEFId() {
        this._reset(DTOFIELD_FINISHPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefid(String finishPSDEFId) {
        this.setFinishPSDEFId(finishPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setFinishPSDEFId(null);
            this.setFinishPSDEFName(null);
        } else {
            this.setFinishPSDEFId(pSDEField.getPSDEFieldId());
            this.setFinishPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="finishpsdefname")
    public void setFinishPSDEFName(String finishPSDEFName) {
        this._set(DTOFIELD_FINISHPSDEFNAME, finishPSDEFName);
    }

    @JsonIgnore
    public String getFinishPSDEFName() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEFNameDirty() {
        return this._contains(DTOFIELD_FINISHPSDEFNAME);
    }

    @JsonIgnore
    public void resetFinishPSDEFName() {
        this._reset(DTOFIELD_FINISHPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO finishpsdefname(String finishPSDEFName) {
        this.setFinishPSDEFName(finishPSDEFName);
        return this;
    }

    @JsonProperty(value="ganttpssyspfpluginid")
    public void setGanttPSSysPFPluginId(String ganttPSSysPFPluginId) {
        this._set(DTOFIELD_GANTTPSSYSPFPLUGINID, ganttPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGanttPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GANTTPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGanttPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GANTTPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGanttPSSysPFPluginId() {
        this._reset(DTOFIELD_GANTTPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginid(String ganttPSSysPFPluginId) {
        this.setGanttPSSysPFPluginId(ganttPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGanttPSSysPFPluginId(null);
            this.setGanttPSSysPFPluginName(null);
        } else {
            this.setGanttPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGanttPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="ganttpssyspfpluginname")
    public void setGanttPSSysPFPluginName(String ganttPSSysPFPluginName) {
        this._set(DTOFIELD_GANTTPSSYSPFPLUGINNAME, ganttPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGanttPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGanttPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGanttPSSysPFPluginName() {
        this._reset(DTOFIELD_GANTTPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO ganttpssyspfpluginname(String ganttPSSysPFPluginName) {
        this.setGanttPSSysPFPluginName(ganttPSSysPFPluginName);
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
    public PSSysCalendarItemDTO iconpsdefid(String iconPSDEFId) {
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO iconpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO iconpsdefname(String iconPSDEFName) {
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
    public PSSysCalendarItemDTO itemstyle(String itemStyle) {
        this.setItemStyle(itemStyle);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO itemstyle(PSModelEnums.CtrlDetailStyle itemStyle) {
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
    public PSSysCalendarItemDTO itemstyletext(String itemStyleText) {
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
    public PSSysCalendarItemDTO itemtype(String itemType) {
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
    public PSSysCalendarItemDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO keypsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO keypsdefname(String keyPSDEFName) {
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    @JsonProperty(value="levelpsdefid")
    public void setLevelPSDEFId(String levelPSDEFId) {
        this._set(DTOFIELD_LEVELPSDEFID, levelPSDEFId);
    }

    @JsonIgnore
    public String getLevelPSDEFId() {
        Object objValue = this._get(DTOFIELD_LEVELPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLevelPSDEFIdDirty() {
        return this._contains(DTOFIELD_LEVELPSDEFID);
    }

    @JsonIgnore
    public void resetLevelPSDEFId() {
        this._reset(DTOFIELD_LEVELPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefid(String levelPSDEFId) {
        this.setLevelPSDEFId(levelPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLevelPSDEFId(null);
            this.setLevelPSDEFName(null);
        } else {
            this.setLevelPSDEFId(pSDEField.getPSDEFieldId());
            this.setLevelPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="levelpsdefname")
    public void setLevelPSDEFName(String levelPSDEFName) {
        this._set(DTOFIELD_LEVELPSDEFNAME, levelPSDEFName);
    }

    @JsonIgnore
    public String getLevelPSDEFName() {
        Object objValue = this._get(DTOFIELD_LEVELPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLevelPSDEFNameDirty() {
        return this._contains(DTOFIELD_LEVELPSDEFNAME);
    }

    @JsonIgnore
    public void resetLevelPSDEFName() {
        this._reset(DTOFIELD_LEVELPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO levelpsdefname(String levelPSDEFName) {
        this.setLevelPSDEFName(levelPSDEFName);
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
    public PSSysCalendarItemDTO linkpsdefid(String linkPSDEFId) {
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO linkpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO linkpsdefname(String linkPSDEFName) {
        this.setLinkPSDEFName(linkPSDEFName);
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
    public PSSysCalendarItemDTO maxsize(Integer maxSize) {
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
    public PSSysCalendarItemDTO memo(String memo) {
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
    public PSSysCalendarItemDTO modelobj(String modelObj) {
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
    public PSSysCalendarItemDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSSysCalendarItemDTO movepsdeactionname(String movePSDEActionName) {
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
    public PSSysCalendarItemDTO movepsdeopprivid(String movePSDEOPPrivId) {
        this.setMovePSDEOPPrivId(movePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO movepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
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
    public PSSysCalendarItemDTO movepsdeopprivname(String movePSDEOPPrivName) {
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
    public PSSysCalendarItemDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSSysCalendarItemDTO namepslanresname(String namePSLanResName) {
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
    public PSSysCalendarItemDTO navviewfilter(String navViewFilter) {
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
    public PSSysCalendarItemDTO navviewparam(String navViewParam) {
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
    public PSSysCalendarItemDTO ordervalue(Integer orderValue) {
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
    public PSSysCalendarItemDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO ordervaluepsdefname(String orderValuePSDEFName) {
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    @JsonProperty(value="pkeypsdefid")
    public void setPKeyPSDEFId(String pKeyPSDEFId) {
        this._set(DTOFIELD_PKEYPSDEFID, pKeyPSDEFId);
    }

    @JsonIgnore
    public String getPKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_PKEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_PKEYPSDEFID);
    }

    @JsonIgnore
    public void resetPKeyPSDEFId() {
        this._reset(DTOFIELD_PKEYPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefid(String pKeyPSDEFId) {
        this.setPKeyPSDEFId(pKeyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPKeyPSDEFId(null);
            this.setPKeyPSDEFName(null);
        } else {
            this.setPKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setPKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="pkeypsdefname")
    public void setPKeyPSDEFName(String pKeyPSDEFName) {
        this._set(DTOFIELD_PKEYPSDEFNAME, pKeyPSDEFName);
    }

    @JsonIgnore
    public String getPKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_PKEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_PKEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetPKeyPSDEFName() {
        this._reset(DTOFIELD_PKEYPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pkeypsdefname(String pKeyPSDEFName) {
        this.setPKeyPSDEFName(pKeyPSDEFName);
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
    public PSSysCalendarItemDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysCalendarItemDTO psdedsname(String pSDEDSName) {
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
    public PSSysCalendarItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysCalendarItemDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSSysCalendarItemDTO psdelogicname(String pSDELogicName) {
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
    public PSSysCalendarItemDTO psdename(String pSDEName) {
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
    public PSSysCalendarItemDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psderid(PSDERDTO pSDER) {
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
    public PSSysCalendarItemDTO psdername(String pSDERName) {
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
    public PSSysCalendarItemDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSSysCalendarItemDTO psdetoolbarname(String pSDEToolbarName) {
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
    public PSSysCalendarItemDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSSysCalendarItemDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="pssyscalendarid")
    public void setPSSysCalendarId(String pSSysCalendarId) {
        this._set(DTOFIELD_PSSYSCALENDARID, pSSysCalendarId);
    }

    @JsonIgnore
    public String getPSSysCalendarId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public void resetPSSysCalendarId() {
        this._reset(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar) {
        if (pSSysCalendar == null) {
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        } else {
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    @JsonProperty(value="pssyscalendaritemid")
    public void setPSSysCalendarItemId(String pSSysCalendarItemId) {
        this._set(DTOFIELD_PSSYSCALENDARITEMID, pSSysCalendarItemId);
    }

    @JsonIgnore
    public String getPSSysCalendarItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMID);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemId() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendaritemid(String pSSysCalendarItemId) {
        this.setPSSysCalendarItemId(pSSysCalendarItemId);
        return this;
    }

    @JsonProperty(value="pssyscalendaritemname")
    public void setPSSysCalendarItemName(String pSSysCalendarItemName) {
        this._set(DTOFIELD_PSSYSCALENDARITEMNAME, pSSysCalendarItemName);
    }

    @JsonIgnore
    public String getPSSysCalendarItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemName() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendaritemname(String pSSysCalendarItemName) {
        this.setPSSysCalendarItemName(pSSysCalendarItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCalendarItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCalendarItemName(strName);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO name(String strName) {
        this.setPSSysCalendarItemName(strName);
        return this;
    }

    @JsonProperty(value="pssyscalendarname")
    public void setPSSysCalendarName(String pSSysCalendarName) {
        this._set(DTOFIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }

    @JsonIgnore
    public String getPSSysCalendarName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarName() {
        this._reset(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscalendarname(String pSSysCalendarName) {
        this.setPSSysCalendarName(pSSysCalendarName);
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
    public PSSysCalendarItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysCalendarItemDTO pssyscssname(String pSSysCssName) {
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
    public PSSysCalendarItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSSysCalendarItemDTO pssysimagename(String pSSysImageName) {
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
    public PSSysCalendarItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysCalendarItemDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSSysCalendarItemDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSSysCalendarItemDTO removepsdeactionname(String removePSDEActionName) {
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
    public PSSysCalendarItemDTO removepsdeopprivid(String removePSDEOPPrivId) {
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO removepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
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
    public PSSysCalendarItemDTO removepsdeopprivname(String removePSDEOPPrivName) {
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
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
    public PSSysCalendarItemDTO tag2psdefid(String tag2PSDEFId) {
        this.setTag2PSDEFId(tag2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO tag2psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO tag2psdefname(String tag2PSDEFName) {
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
    public PSSysCalendarItemDTO tagpsdefid(String tagPSDEFId) {
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO tagpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO tagpsdefname(String tagPSDEFName) {
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
    public PSSysCalendarItemDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO textpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
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
    public PSSysCalendarItemDTO tipspsdefid(String tipsPSDEFId) {
        this.setTipsPSDEFId(tipsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO tipspsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysCalendarItemDTO tipspsdefname(String tipsPSDEFName) {
        this.setTipsPSDEFName(tipsPSDEFName);
        return this;
    }

    @JsonProperty(value="totalpsdefid")
    public void setTotalPSDEFId(String totalPSDEFId) {
        this._set(DTOFIELD_TOTALPSDEFID, totalPSDEFId);
    }

    @JsonIgnore
    public String getTotalPSDEFId() {
        Object objValue = this._get(DTOFIELD_TOTALPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTotalPSDEFIdDirty() {
        return this._contains(DTOFIELD_TOTALPSDEFID);
    }

    @JsonIgnore
    public void resetTotalPSDEFId() {
        this._reset(DTOFIELD_TOTALPSDEFID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefid(String totalPSDEFId) {
        this.setTotalPSDEFId(totalPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTotalPSDEFId(null);
            this.setTotalPSDEFName(null);
        } else {
            this.setTotalPSDEFId(pSDEField.getPSDEFieldId());
            this.setTotalPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="totalpsdefname")
    public void setTotalPSDEFName(String totalPSDEFName) {
        this._set(DTOFIELD_TOTALPSDEFNAME, totalPSDEFName);
    }

    @JsonIgnore
    public String getTotalPSDEFName() {
        Object objValue = this._get(DTOFIELD_TOTALPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTotalPSDEFNameDirty() {
        return this._contains(DTOFIELD_TOTALPSDEFNAME);
    }

    @JsonIgnore
    public void resetTotalPSDEFName() {
        this._reset(DTOFIELD_TOTALPSDEFNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO totalpsdefname(String totalPSDEFName) {
        this.setTotalPSDEFName(totalPSDEFName);
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
    public PSSysCalendarItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysCalendarItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="updatepsdeactionid")
    public void setUpdatePSDEActionId(String updatePSDEActionId) {
        this._set(DTOFIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }

    @JsonIgnore
    public String getUpdatePSDEActionId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionId() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        } else {
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeactionname")
    public void setUpdatePSDEActionName(String updatePSDEActionName) {
        this._set(DTOFIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }

    @JsonIgnore
    public String getUpdatePSDEActionName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionName() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeactionname(String updatePSDEActionName) {
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    @JsonProperty(value="updatepsdeopprivid")
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivId() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivid(String updatePSDEOPPrivId) {
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        } else {
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeopprivname")
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivName() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO updatepsdeopprivname(String updatePSDEOPPrivName) {
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
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
    public PSSysCalendarItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysCalendarItemDTO usertag(String userTag) {
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
    public PSSysCalendarItemDTO usertag2(String userTag2) {
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
    public PSSysCalendarItemDTO usertag3(String userTag3) {
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
    public PSSysCalendarItemDTO usertag4(String userTag4) {
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
    public PSSysCalendarItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewactions")
    public void setViewActions(Integer viewActions) {
        this._set(DTOFIELD_VIEWACTIONS, viewActions);
    }

    @JsonIgnore
    public Integer getViewActions() {
        Object objValue = this._get(DTOFIELD_VIEWACTIONS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewActionsDirty() {
        return this._contains(DTOFIELD_VIEWACTIONS);
    }

    @JsonIgnore
    public void resetViewActions() {
        this._reset(DTOFIELD_VIEWACTIONS);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO viewactions(Integer viewActions) {
        this.setViewActions(viewActions);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemDTO viewactions(PSModelEnums.CtrlUIAction[] viewActions) {
        if (viewActions == null || viewActions.length == 0) {
            this.setViewActions(null);
        } else {
            int _value = 0;
            for (PSModelEnums.CtrlUIAction _item : viewActions) {
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCalendarItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCalendarItemId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarItemDTO id(String strValue) {
        this.setPSSysCalendarItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysCalendarItemRVDTO> getPSSysCalendarItemRVs() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARITEMRVS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyscalendaritemrvs")
    public void setPSSysCalendarItemRVs(List<PSSysCalendarItemRVDTO> pssyscalendaritemrvs) {
        this._set(DTOFIELD_PSSYSCALENDARITEMRVS, pssyscalendaritemrvs);
    }

    @JsonIgnore
    public List<PSSysCalendarItemRVDTO> getPSSysCalendarItemRVsIf() {
        Object list = this._get(DTOFIELD_PSSYSCALENDARITEMRVS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSCALENDARITEMRVS, list);
        }
        return (List)list;
    }
}
