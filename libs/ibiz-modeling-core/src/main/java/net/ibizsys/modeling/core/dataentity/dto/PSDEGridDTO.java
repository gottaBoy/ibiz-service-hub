package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEGridDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGMODE = "AGGMODE";
    protected static final String DTOFIELD_AGGMODE = "aggmode";
    public static final String FIELD_AGGPSDEACTIONID = "AGGPSDEACTIONID";
    protected static final String DTOFIELD_AGGPSDEACTIONID = "aggpsdeactionid";
    public static final String FIELD_AGGPSDEACTIONNAME = "AGGPSDEACTIONNAME";
    protected static final String DTOFIELD_AGGPSDEACTIONNAME = "aggpsdeactionname";
    public static final String FIELD_AGGPSDEDSID = "AGGPSDEDSID";
    protected static final String DTOFIELD_AGGPSDEDSID = "aggpsdedsid";
    public static final String FIELD_AGGPSDEDSNAME = "AGGPSDEDSNAME";
    protected static final String DTOFIELD_AGGPSDEDSNAME = "aggpsdedsname";
    public static final String FIELD_AGGPSDEID = "AGGPSDEID";
    protected static final String DTOFIELD_AGGPSDEID = "aggpsdeid";
    public static final String FIELD_AGGPSDENAME = "AGGPSDENAME";
    protected static final String DTOFIELD_AGGPSDENAME = "aggpsdename";
    public static final String FIELD_AGGPSSYSVIEWPANELID = "AGGPSSYSVIEWPANELID";
    protected static final String DTOFIELD_AGGPSSYSVIEWPANELID = "aggpssysviewpanelid";
    public static final String FIELD_AGGPSSYSVIEWPANELNAME = "AGGPSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_AGGPSSYSVIEWPANELNAME = "aggpssysviewpanelname";
    public static final String FIELD_ASYNCPSDEDSID = "ASYNCPSDEDSID";
    protected static final String DTOFIELD_ASYNCPSDEDSID = "asyncpsdedsid";
    public static final String FIELD_ASYNCPSDEDSNAME = "ASYNCPSDEDSNAME";
    protected static final String DTOFIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";
    public static final String FIELD_BATPSDETOOLBARID = "BATPSDETOOLBARID";
    protected static final String DTOFIELD_BATPSDETOOLBARID = "batpsdetoolbarid";
    public static final String FIELD_BATPSDETOOLBARNAME = "BATPSDETOOLBARNAME";
    protected static final String DTOFIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";
    public static final String FIELD_BUFFERRENDERERMODE = "BUFFERRENDERERMODE";
    protected static final String DTOFIELD_BUFFERRENDERERMODE = "bufferrenderermode";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLENABLEFILTER = "COLENABLEFILTER";
    protected static final String DTOFIELD_COLENABLEFILTER = "colenablefilter";
    public static final String FIELD_COLENABLELINK = "COLENABLELINK";
    protected static final String DTOFIELD_COLENABLELINK = "colenablelink";
    public static final String FIELD_COPYPSDEACTIONID = "COPYPSDEACTIONID";
    protected static final String DTOFIELD_COPYPSDEACTIONID = "copypsdeactionid";
    public static final String FIELD_COPYPSDEACTIONNAME = "COPYPSDEACTIONNAME";
    protected static final String DTOFIELD_COPYPSDEACTIONNAME = "copypsdeactionname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATEPSDEACTIONID = "CREATEPSDEACTIONID";
    protected static final String DTOFIELD_CREATEPSDEACTIONID = "createpsdeactionid";
    public static final String FIELD_CREATEPSDEACTIONNAME = "CREATEPSDEACTIONNAME";
    protected static final String DTOFIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZED";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_ENABLEEDIT = "ENABLEEDIT";
    protected static final String DTOFIELD_ENABLEEDIT = "enableedit";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLEPAGINGBAR = "ENABLEPAGINGBAR";
    protected static final String DTOFIELD_ENABLEPAGINGBAR = "enablepagingbar";
    public static final String FIELD_FORCEFIT = "FORCEFIT";
    protected static final String DTOFIELD_FORCEFIT = "forcefit";
    public static final String FIELD_FROZENCOL = "FROZENCOL";
    protected static final String DTOFIELD_FROZENCOL = "frozencol";
    public static final String FIELD_FROZENLASTCOL = "FROZENLASTCOL";
    protected static final String DTOFIELD_FROZENLASTCOL = "frozenlastcol";
    public static final String FIELD_GETDRAFTPSDEACTIONID = "GETDRAFTPSDEACTIONID";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";
    public static final String FIELD_GETDRAFTPSDEACTIONNAME = "GETDRAFTPSDEACTIONNAME";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";
    public static final String FIELD_GETPSDEACTIONID = "GETPSDEACTIONID";
    protected static final String DTOFIELD_GETPSDEACTIONID = "getpsdeactionid";
    public static final String FIELD_GETPSDEACTIONNAME = "GETPSDEACTIONNAME";
    protected static final String DTOFIELD_GETPSDEACTIONNAME = "getpsdeactionname";
    public static final String FIELD_GRIDSN = "GRIDSN";
    protected static final String DTOFIELD_GRIDSN = "gridsn";
    public static final String FIELD_GRIDSTYLE = "GRIDSTYLE";
    protected static final String DTOFIELD_GRIDSTYLE = "gridstyle";
    public static final String FIELD_GROUPMODE = "GROUPMODE";
    protected static final String DTOFIELD_GROUPMODE = "groupmode";
    public static final String FIELD_GROUPPSCODELISTID = "GROUPPSCODELISTID";
    protected static final String DTOFIELD_GROUPPSCODELISTID = "grouppscodelistid";
    public static final String FIELD_GROUPPSCODELISTNAME = "GROUPPSCODELISTNAME";
    protected static final String DTOFIELD_GROUPPSCODELISTNAME = "grouppscodelistname";
    public static final String FIELD_GROUPPSDEFID = "GROUPPSDEFID";
    protected static final String DTOFIELD_GROUPPSDEFID = "grouppsdefid";
    public static final String FIELD_GROUPPSDEFNAME = "GROUPPSDEFNAME";
    protected static final String DTOFIELD_GROUPPSDEFNAME = "grouppsdefname";
    public static final String FIELD_GROUPPSDEUAGROUPID = "GROUPPSDEUAGROUPID";
    protected static final String DTOFIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";
    public static final String FIELD_GROUPPSDEUAGROUPNAME = "GROUPPSDEUAGROUPNAME";
    protected static final String DTOFIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";
    public static final String FIELD_GROUPPSSYSCSSID = "GROUPPSSYSCSSID";
    protected static final String DTOFIELD_GROUPPSSYSCSSID = "grouppssyscssid";
    public static final String FIELD_GROUPPSSYSCSSNAME = "GROUPPSSYSCSSNAME";
    protected static final String DTOFIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";
    public static final String FIELD_GROUPPSSYSPFPLUGINID = "GROUPPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";
    public static final String FIELD_GROUPPSSYSPFPLUGINNAME = "GROUPPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";
    public static final String FIELD_GROUPSTYLE = "GROUPSTYLE";
    protected static final String DTOFIELD_GROUPSTYLE = "groupstyle";
    public static final String FIELD_IGNOREDSITEM = "IGNOREDSITEM";
    protected static final String DTOFIELD_IGNOREDSITEM = "ignoredsitem";
    public static final String FIELD_ITEMPSSYSCSSID = "ITEMPSSYSCSSID";
    protected static final String DTOFIELD_ITEMPSSYSCSSID = "itempssyscssid";
    public static final String FIELD_ITEMPSSYSCSSNAME = "ITEMPSSYSCSSNAME";
    protected static final String DTOFIELD_ITEMPSSYSCSSNAME = "itempssyscssname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORSORTDIR = "MINORSORTDIR";
    protected static final String DTOFIELD_MINORSORTDIR = "minorsortdir";
    public static final String FIELD_MINORSORTPSDEFID = "MINORSORTPSDEFID";
    protected static final String DTOFIELD_MINORSORTPSDEFID = "minorsortpsdefid";
    public static final String FIELD_MINORSORTPSDEFNAME = "MINORSORTPSDEFNAME";
    protected static final String DTOFIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";
    public static final String FIELD_MOVEPSDEACTIONID = "MOVEPSDEACTIONID";
    protected static final String DTOFIELD_MOVEPSDEACTIONID = "movepsdeactionid";
    public static final String FIELD_MOVEPSDEACTIONNAME = "MOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";
    public static final String FIELD_MULTISELECT = "MULTISELECT";
    protected static final String DTOFIELD_MULTISELECT = "multiselect";
    public static final String FIELD_NAVPSDERID = "NAVPSDERID";
    protected static final String DTOFIELD_NAVPSDERID = "navpsderid";
    public static final String FIELD_NAVPSDERNAME = "NAVPSDERNAME";
    protected static final String DTOFIELD_NAVPSDERNAME = "navpsdername";
    public static final String FIELD_NAVPSDEVIEWBASEID = "NAVPSDEVIEWBASEID";
    protected static final String DTOFIELD_NAVPSDEVIEWBASEID = "navpsdeviewbaseid";
    public static final String FIELD_NAVPSDEVIEWBASENAME = "NAVPSDEVIEWBASENAME";
    protected static final String DTOFIELD_NAVPSDEVIEWBASENAME = "navpsdeviewbasename";
    public static final String FIELD_NAVVIEWFILTER = "NAVVIEWFILTER";
    protected static final String DTOFIELD_NAVVIEWFILTER = "navviewfilter";
    public static final String FIELD_NAVVIEWHEIGHT = "NAVVIEWHEIGHT";
    protected static final String DTOFIELD_NAVVIEWHEIGHT = "navviewheight";
    public static final String FIELD_NAVVIEWMAXHEIGHT = "NAVVIEWMAXHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMAXHEIGHT = "navviewmaxheight";
    public static final String FIELD_NAVVIEWMAXWIDTH = "NAVVIEWMAXWIDTH";
    protected static final String DTOFIELD_NAVVIEWMAXWIDTH = "navviewmaxwidth";
    public static final String FIELD_NAVVIEWMINHEIGHT = "NAVVIEWMINHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMINHEIGHT = "navviewminheight";
    public static final String FIELD_NAVVIEWMINWIDTH = "NAVVIEWMINWIDTH";
    protected static final String DTOFIELD_NAVVIEWMINWIDTH = "navviewminwidth";
    public static final String FIELD_NAVVIEWPARAM = "NAVVIEWPARAM";
    protected static final String DTOFIELD_NAVVIEWPARAM = "navviewparam";
    public static final String FIELD_NAVVIEWPOS = "NAVVIEWPOS";
    protected static final String DTOFIELD_NAVVIEWPOS = "navviewpos";
    public static final String FIELD_NAVVIEWSHOWMODE = "NAVVIEWSHOWMODE";
    protected static final String DTOFIELD_NAVVIEWSHOWMODE = "navviewshowmode";
    public static final String FIELD_NAVVIEWWIDTH = "NAVVIEWWIDTH";
    protected static final String DTOFIELD_NAVVIEWWIDTH = "navviewwidth";
    public static final String FIELD_NOSORT = "NOSORT";
    protected static final String DTOFIELD_NOSORT = "nosort";
    public static final String FIELD_ORDERVALUEPSDEFID = "ORDERVALUEPSDEFID";
    protected static final String DTOFIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";
    public static final String FIELD_ORDERVALUEPSDEFNAME = "ORDERVALUEPSDEFNAME";
    protected static final String DTOFIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";
    public static final String FIELD_PAGINGSIZE = "PAGINGSIZE";
    protected static final String DTOFIELD_PAGINGSIZE = "pagingsize";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSCTRLMSGID = "PSCTRLMSGID";
    protected static final String DTOFIELD_PSCTRLMSGID = "psctrlmsgid";
    public static final String FIELD_PSCTRLMSGNAME = "PSCTRLMSGNAME";
    protected static final String DTOFIELD_PSCTRLMSGNAME = "psctrlmsgname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEFINPUTTIPSETID = "PSDEFINPUTTIPSETID";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";
    public static final String FIELD_PSDEFINPUTTIPSETNAME = "PSDEFINPUTTIPSETNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_QUICKPSDETOOLBARID = "QUICKPSDETOOLBARID";
    protected static final String DTOFIELD_QUICKPSDETOOLBARID = "quickpsdetoolbarid";
    public static final String FIELD_QUICKPSDETOOLBARNAME = "QUICKPSDETOOLBARNAME";
    protected static final String DTOFIELD_QUICKPSDETOOLBARNAME = "quickpsdetoolbarname";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_SHOWHEADER = "SHOWHEADER";
    protected static final String DTOFIELD_SHOWHEADER = "showheader";
    public static final String FIELD_SORTMODE = "SORTMODE";
    protected static final String DTOFIELD_SORTMODE = "sortmode";
    public static final String FIELD_TREEPPSDEFID = "TREEPPSDEFID";
    protected static final String DTOFIELD_TREEPPSDEFID = "treeppsdefid";
    public static final String FIELD_TREEPPSDEFNAME = "TREEPPSDEFNAME";
    protected static final String DTOFIELD_TREEPPSDEFNAME = "treeppsdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATEPSDEACTIONID = "UPDATEPSDEACTIONID";
    protected static final String DTOFIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";
    public static final String FIELD_UPDATEPSDEACTIONNAME = "UPDATEPSDEACTIONNAME";
    protected static final String DTOFIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";
    public static final String FIELD_USER2PSDEACTIONID = "USER2PSDEACTIONID";
    protected static final String DTOFIELD_USER2PSDEACTIONID = "user2psdeactionid";
    public static final String FIELD_USER2PSDEACTIONNAME = "USER2PSDEACTIONNAME";
    protected static final String DTOFIELD_USER2PSDEACTIONNAME = "user2psdeactionname";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERPSDEACTIONID = "USERPSDEACTIONID";
    protected static final String DTOFIELD_USERPSDEACTIONID = "userpsdeactionid";
    public static final String FIELD_USERPSDEACTIONNAME = "USERPSDEACTIONNAME";
    protected static final String DTOFIELD_USERPSDEACTIONNAME = "userpsdeactionname";
    public static final String DTOFIELD_PSDEGRIDCOLS = "psdegridcols";
    public static final String DTOFIELD_PSDEGEIUPDATES = "psdegeiupdates";
    public static final String DTOFIELD_PSDEGEIVRS = "psdegeivrs";
    public static final String DTOFIELD_PSDEGRIDLOGICS = "psdegridlogics";

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
    public PSDEGridDTO aggmode(String aggMode) {
        this.setAggMode(aggMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO aggmode(PSModelEnums.GridAggMode aggMode) {
        if (aggMode == null) {
            this.setAggMode(null);
        } else {
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    @JsonProperty(value="aggpsdeactionid")
    public void setAggPSDEActionId(String aggPSDEActionId) {
        this._set(DTOFIELD_AGGPSDEACTIONID, aggPSDEActionId);
    }

    @JsonIgnore
    public String getAggPSDEActionId() {
        Object objValue = this._get(DTOFIELD_AGGPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDEActionIdDirty() {
        return this._contains(DTOFIELD_AGGPSDEACTIONID);
    }

    @JsonIgnore
    public void resetAggPSDEActionId() {
        this._reset(DTOFIELD_AGGPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdeactionid(String aggPSDEActionId) {
        this.setAggPSDEActionId(aggPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setAggPSDEActionId(null);
            this.setAggPSDEActionName(null);
        } else {
            this.setAggPSDEActionId(pSDEAction.getPSDEActionId());
            this.setAggPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="aggpsdeactionname")
    public void setAggPSDEActionName(String aggPSDEActionName) {
        this._set(DTOFIELD_AGGPSDEACTIONNAME, aggPSDEActionName);
    }

    @JsonIgnore
    public String getAggPSDEActionName() {
        Object objValue = this._get(DTOFIELD_AGGPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDEActionNameDirty() {
        return this._contains(DTOFIELD_AGGPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetAggPSDEActionName() {
        this._reset(DTOFIELD_AGGPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdeactionname(String aggPSDEActionName) {
        this.setAggPSDEActionName(aggPSDEActionName);
        return this;
    }

    @JsonProperty(value="aggpsdedsid")
    public void setAggPSDEDSId(String aggPSDEDSId) {
        this._set(DTOFIELD_AGGPSDEDSID, aggPSDEDSId);
    }

    @JsonIgnore
    public String getAggPSDEDSId() {
        Object objValue = this._get(DTOFIELD_AGGPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDEDSIdDirty() {
        return this._contains(DTOFIELD_AGGPSDEDSID);
    }

    @JsonIgnore
    public void resetAggPSDEDSId() {
        this._reset(DTOFIELD_AGGPSDEDSID);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdedsid(String aggPSDEDSId) {
        this.setAggPSDEDSId(aggPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setAggPSDEDSId(null);
            this.setAggPSDEDSName(null);
        } else {
            this.setAggPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAggPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="aggpsdedsname")
    public void setAggPSDEDSName(String aggPSDEDSName) {
        this._set(DTOFIELD_AGGPSDEDSNAME, aggPSDEDSName);
    }

    @JsonIgnore
    public String getAggPSDEDSName() {
        Object objValue = this._get(DTOFIELD_AGGPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDEDSNameDirty() {
        return this._contains(DTOFIELD_AGGPSDEDSNAME);
    }

    @JsonIgnore
    public void resetAggPSDEDSName() {
        this._reset(DTOFIELD_AGGPSDEDSNAME);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdedsname(String aggPSDEDSName) {
        this.setAggPSDEDSName(aggPSDEDSName);
        return this;
    }

    @JsonProperty(value="aggpsdeid")
    public void setAggPSDEId(String aggPSDEId) {
        this._set(DTOFIELD_AGGPSDEID, aggPSDEId);
    }

    @JsonIgnore
    public String getAggPSDEId() {
        Object objValue = this._get(DTOFIELD_AGGPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDEIdDirty() {
        return this._contains(DTOFIELD_AGGPSDEID);
    }

    @JsonIgnore
    public void resetAggPSDEId() {
        this._reset(DTOFIELD_AGGPSDEID);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdeid(String aggPSDEId) {
        this.setAggPSDEId(aggPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setAggPSDEId(null);
            this.setAggPSDEName(null);
        } else {
            this.setAggPSDEId(pSDataEntity.getPSDataEntityId());
            this.setAggPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="aggpsdename")
    public void setAggPSDEName(String aggPSDEName) {
        this._set(DTOFIELD_AGGPSDENAME, aggPSDEName);
    }

    @JsonIgnore
    public String getAggPSDEName() {
        Object objValue = this._get(DTOFIELD_AGGPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSDENameDirty() {
        return this._contains(DTOFIELD_AGGPSDENAME);
    }

    @JsonIgnore
    public void resetAggPSDEName() {
        this._reset(DTOFIELD_AGGPSDENAME);
    }

    @JsonIgnore
    public PSDEGridDTO aggpsdename(String aggPSDEName) {
        this.setAggPSDEName(aggPSDEName);
        return this;
    }

    @JsonProperty(value="aggpssysviewpanelid")
    public void setAggPSSysViewPanelId(String aggPSSysViewPanelId) {
        this._set(DTOFIELD_AGGPSSYSVIEWPANELID, aggPSSysViewPanelId);
    }

    @JsonIgnore
    public String getAggPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_AGGPSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_AGGPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetAggPSSysViewPanelId() {
        this._reset(DTOFIELD_AGGPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSDEGridDTO aggpssysviewpanelid(String aggPSSysViewPanelId) {
        this.setAggPSSysViewPanelId(aggPSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO aggpssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setAggPSSysViewPanelId(null);
            this.setAggPSSysViewPanelName(null);
        } else {
            this.setAggPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setAggPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="aggpssysviewpanelname")
    public void setAggPSSysViewPanelName(String aggPSSysViewPanelName) {
        this._set(DTOFIELD_AGGPSSYSVIEWPANELNAME, aggPSSysViewPanelName);
    }

    @JsonIgnore
    public String getAggPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_AGGPSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_AGGPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetAggPSSysViewPanelName() {
        this._reset(DTOFIELD_AGGPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSDEGridDTO aggpssysviewpanelname(String aggPSSysViewPanelName) {
        this.setAggPSSysViewPanelName(aggPSSysViewPanelName);
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
    public PSDEGridDTO asyncpsdedsid(String asyncPSDEDSId) {
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO asyncpsdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEGridDTO asyncpsdedsname(String asyncPSDEDSName) {
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    @JsonProperty(value="batpsdetoolbarid")
    public void setBatPSDEToolbarId(String batPSDEToolbarId) {
        this._set(DTOFIELD_BATPSDETOOLBARID, batPSDEToolbarId);
    }

    @JsonIgnore
    public String getBatPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_BATPSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBatPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_BATPSDETOOLBARID);
    }

    @JsonIgnore
    public void resetBatPSDEToolbarId() {
        this._reset(DTOFIELD_BATPSDETOOLBARID);
    }

    @JsonIgnore
    public PSDEGridDTO batpsdetoolbarid(String batPSDEToolbarId) {
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setBatPSDEToolbarId(null);
            this.setBatPSDEToolbarName(null);
        } else {
            this.setBatPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setBatPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="batpsdetoolbarname")
    public void setBatPSDEToolbarName(String batPSDEToolbarName) {
        this._set(DTOFIELD_BATPSDETOOLBARNAME, batPSDEToolbarName);
    }

    @JsonIgnore
    public String getBatPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_BATPSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBatPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_BATPSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetBatPSDEToolbarName() {
        this._reset(DTOFIELD_BATPSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSDEGridDTO batpsdetoolbarname(String batPSDEToolbarName) {
        this.setBatPSDEToolbarName(batPSDEToolbarName);
        return this;
    }

    @JsonProperty(value="bufferrenderermode")
    public void setBufferRendererMode(Integer bufferRendererMode) {
        this._set(DTOFIELD_BUFFERRENDERERMODE, bufferRendererMode);
    }

    @JsonIgnore
    public Integer getBufferRendererMode() {
        Object objValue = this._get(DTOFIELD_BUFFERRENDERERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBufferRendererModeDirty() {
        return this._contains(DTOFIELD_BUFFERRENDERERMODE);
    }

    @JsonIgnore
    public void resetBufferRendererMode() {
        this._reset(DTOFIELD_BUFFERRENDERERMODE);
    }

    @JsonIgnore
    public PSDEGridDTO bufferrenderermode(Integer bufferRendererMode) {
        this.setBufferRendererMode(bufferRendererMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO bufferrenderermode(Boolean bufferRendererMode) {
        if (bufferRendererMode == null) {
            this.setBufferRendererMode(null);
        } else {
            this.setBufferRendererMode(bufferRendererMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="busyindicator")
    public void setBusyIndicator(Integer busyIndicator) {
        this._set(DTOFIELD_BUSYINDICATOR, busyIndicator);
    }

    @JsonIgnore
    public Integer getBusyIndicator() {
        Object objValue = this._get(DTOFIELD_BUSYINDICATOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBusyIndicatorDirty() {
        return this._contains(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public void resetBusyIndicator() {
        this._reset(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public PSDEGridDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDEGridDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="colenablefilter")
    public void setColEnableFilter(Integer colEnableFilter) {
        this._set(DTOFIELD_COLENABLEFILTER, colEnableFilter);
    }

    @JsonIgnore
    public Integer getColEnableFilter() {
        Object objValue = this._get(DTOFIELD_COLENABLEFILTER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColEnableFilterDirty() {
        return this._contains(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public void resetColEnableFilter() {
        this._reset(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public PSDEGridDTO colenablefilter(Integer colEnableFilter) {
        this.setColEnableFilter(colEnableFilter);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO colenablefilter(PSModelEnums.DEGridColLinkMode colEnableFilter) {
        if (colEnableFilter == null) {
            this.setColEnableFilter(null);
        } else {
            this.setColEnableFilter(colEnableFilter.value);
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
    public PSDEGridDTO colenablelink(Integer colEnableLink) {
        this.setColEnableLink(colEnableLink);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO colenablelink(PSModelEnums.DEGridColLinkMode colEnableLink) {
        if (colEnableLink == null) {
            this.setColEnableLink(null);
        } else {
            this.setColEnableLink(colEnableLink.value);
        }
        return this;
    }

    @JsonProperty(value="copypsdeactionid")
    public void setCopyPSDEActionId(String copyPSDEActionId) {
        this._set(DTOFIELD_COPYPSDEACTIONID, copyPSDEActionId);
    }

    @JsonIgnore
    public String getCopyPSDEActionId() {
        Object objValue = this._get(DTOFIELD_COPYPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCopyPSDEActionIdDirty() {
        return this._contains(DTOFIELD_COPYPSDEACTIONID);
    }

    @JsonIgnore
    public void resetCopyPSDEActionId() {
        this._reset(DTOFIELD_COPYPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO copypsdeactionid(String copyPSDEActionId) {
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO copypsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setCopyPSDEActionId(null);
            this.setCopyPSDEActionName(null);
        } else {
            this.setCopyPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCopyPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="copypsdeactionname")
    public void setCopyPSDEActionName(String copyPSDEActionName) {
        this._set(DTOFIELD_COPYPSDEACTIONNAME, copyPSDEActionName);
    }

    @JsonIgnore
    public String getCopyPSDEActionName() {
        Object objValue = this._get(DTOFIELD_COPYPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCopyPSDEActionNameDirty() {
        return this._contains(DTOFIELD_COPYPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetCopyPSDEActionName() {
        this._reset(DTOFIELD_COPYPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO copypsdeactionname(String copyPSDEActionName) {
        this.setCopyPSDEActionName(copyPSDEActionName);
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
    public PSDEGridDTO createdate(Timestamp createDate) {
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
    public PSDEGridDTO createman(String createMan) {
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
    public PSDEGridDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEGridDTO createpsdeactionname(String createPSDEActionName) {
        this.setCreatePSDEActionName(createPSDEActionName);
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
    public PSDEGridDTO customcond(String customCond) {
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
    public PSDEGridDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSDEGridDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSDEGridDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEGridDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="enablecustomized")
    public void setEnableCustomized(Integer enableCustomized) {
        this._set(DTOFIELD_ENABLECUSTOMIZED, enableCustomized);
    }

    @JsonIgnore
    public Integer getEnableCustomized() {
        Object objValue = this._get(DTOFIELD_ENABLECUSTOMIZED);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCustomizedDirty() {
        return this._contains(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public void resetEnableCustomized() {
        this._reset(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public PSDEGridDTO enablecustomized(Integer enableCustomized) {
        this.setEnableCustomized(enableCustomized);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO enablecustomized(Boolean enableCustomized) {
        if (enableCustomized == null) {
            this.setEnableCustomized(null);
        } else {
            this.setEnableCustomized(enableCustomized != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableedit")
    public void setEnableEdit(Integer enableEdit) {
        this._set(DTOFIELD_ENABLEEDIT, enableEdit);
    }

    @JsonIgnore
    public Integer getEnableEdit() {
        Object objValue = this._get(DTOFIELD_ENABLEEDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableEditDirty() {
        return this._contains(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public void resetEnableEdit() {
        this._reset(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public PSDEGridDTO enableedit(Integer enableEdit) {
        this.setEnableEdit(enableEdit);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO enableedit(PSModelEnums.GridEditMode[] enableEdit) {
        if (enableEdit == null || enableEdit.length == 0) {
            this.setEnableEdit(null);
        } else {
            int _value = 0;
            for (PSModelEnums.GridEditMode _item : enableEdit) {
                _value |= _item.value;
            }
            this.setEnableEdit(_value);
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
    public PSDEGridDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablepagingbar")
    public void setEnablePagingBar(Integer enablePagingBar) {
        this._set(DTOFIELD_ENABLEPAGINGBAR, enablePagingBar);
    }

    @JsonIgnore
    public Integer getEnablePagingBar() {
        Object objValue = this._get(DTOFIELD_ENABLEPAGINGBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePagingBarDirty() {
        return this._contains(DTOFIELD_ENABLEPAGINGBAR);
    }

    @JsonIgnore
    public void resetEnablePagingBar() {
        this._reset(DTOFIELD_ENABLEPAGINGBAR);
    }

    @JsonIgnore
    public PSDEGridDTO enablepagingbar(Integer enablePagingBar) {
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO enablepagingbar(PSModelEnums.PagingMode enablePagingBar) {
        if (enablePagingBar == null) {
            this.setEnablePagingBar(null);
        } else {
            this.setEnablePagingBar(enablePagingBar.value);
        }
        return this;
    }

    @JsonProperty(value="forcefit")
    public void setForceFit(Integer forceFit) {
        this._set(DTOFIELD_FORCEFIT, forceFit);
    }

    @JsonIgnore
    public Integer getForceFit() {
        Object objValue = this._get(DTOFIELD_FORCEFIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isForceFitDirty() {
        return this._contains(DTOFIELD_FORCEFIT);
    }

    @JsonIgnore
    public void resetForceFit() {
        this._reset(DTOFIELD_FORCEFIT);
    }

    @JsonIgnore
    public PSDEGridDTO forcefit(Integer forceFit) {
        this.setForceFit(forceFit);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO forcefit(Boolean forceFit) {
        if (forceFit == null) {
            this.setForceFit(null);
        } else {
            this.setForceFit(forceFit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="frozencol")
    public void setFrozenCol(Integer frozenCol) {
        this._set(DTOFIELD_FROZENCOL, frozenCol);
    }

    @JsonIgnore
    public Integer getFrozenCol() {
        Object objValue = this._get(DTOFIELD_FROZENCOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFrozenColDirty() {
        return this._contains(DTOFIELD_FROZENCOL);
    }

    @JsonIgnore
    public void resetFrozenCol() {
        this._reset(DTOFIELD_FROZENCOL);
    }

    @JsonIgnore
    public PSDEGridDTO frozencol(Integer frozenCol) {
        this.setFrozenCol(frozenCol);
        return this;
    }

    @JsonProperty(value="frozenlastcol")
    public void setFrozenLastCol(Integer frozenLastCol) {
        this._set(DTOFIELD_FROZENLASTCOL, frozenLastCol);
    }

    @JsonIgnore
    public Integer getFrozenLastCol() {
        Object objValue = this._get(DTOFIELD_FROZENLASTCOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFrozenLastColDirty() {
        return this._contains(DTOFIELD_FROZENLASTCOL);
    }

    @JsonIgnore
    public void resetFrozenLastCol() {
        this._reset(DTOFIELD_FROZENLASTCOL);
    }

    @JsonIgnore
    public PSDEGridDTO frozenlastcol(Integer frozenLastCol) {
        this.setFrozenLastCol(frozenLastCol);
        return this;
    }

    @JsonProperty(value="getdraftpsdeactionid")
    public void setGetDraftPSDEActionId(String getDraftPSDEActionId) {
        this._set(DTOFIELD_GETDRAFTPSDEACTIONID, getDraftPSDEActionId);
    }

    @JsonIgnore
    public String getGetDraftPSDEActionId() {
        Object objValue = this._get(DTOFIELD_GETDRAFTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetDraftPSDEActionIdDirty() {
        return this._contains(DTOFIELD_GETDRAFTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGetDraftPSDEActionId() {
        this._reset(DTOFIELD_GETDRAFTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO getdraftpsdeactionid(String getDraftPSDEActionId) {
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO getdraftpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGetDraftPSDEActionId(null);
            this.setGetDraftPSDEActionName(null);
        } else {
            this.setGetDraftPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDraftPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="getdraftpsdeactionname")
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName) {
        this._set(DTOFIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }

    @JsonIgnore
    public String getGetDraftPSDEActionName() {
        Object objValue = this._get(DTOFIELD_GETDRAFTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetDraftPSDEActionNameDirty() {
        return this._contains(DTOFIELD_GETDRAFTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGetDraftPSDEActionName() {
        this._reset(DTOFIELD_GETDRAFTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO getdraftpsdeactionname(String getDraftPSDEActionName) {
        this.setGetDraftPSDEActionName(getDraftPSDEActionName);
        return this;
    }

    @JsonProperty(value="getpsdeactionid")
    public void setGetPSDEActionId(String getPSDEActionId) {
        this._set(DTOFIELD_GETPSDEACTIONID, getPSDEActionId);
    }

    @JsonIgnore
    public String getGetPSDEActionId() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionIdDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGetPSDEActionId() {
        this._reset(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        } else {
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="getpsdeactionname")
    public void setGetPSDEActionName(String getPSDEActionName) {
        this._set(DTOFIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }

    @JsonIgnore
    public String getGetPSDEActionName() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionNameDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGetPSDEActionName() {
        this._reset(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO getpsdeactionname(String getPSDEActionName) {
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    @JsonProperty(value="gridsn")
    public void setGridSN(String gridSN) {
        this._set(DTOFIELD_GRIDSN, gridSN);
    }

    @JsonIgnore
    public String getGridSN() {
        Object objValue = this._get(DTOFIELD_GRIDSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridSNDirty() {
        return this._contains(DTOFIELD_GRIDSN);
    }

    @JsonIgnore
    public void resetGridSN() {
        this._reset(DTOFIELD_GRIDSN);
    }

    @JsonIgnore
    public PSDEGridDTO gridsn(String gridSN) {
        this.setGridSN(gridSN);
        return this;
    }

    @JsonProperty(value="gridstyle")
    public void setGridStyle(String gridStyle) {
        this._set(DTOFIELD_GRIDSTYLE, gridStyle);
    }

    @JsonIgnore
    public String getGridStyle() {
        Object objValue = this._get(DTOFIELD_GRIDSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridStyleDirty() {
        return this._contains(DTOFIELD_GRIDSTYLE);
    }

    @JsonIgnore
    public void resetGridStyle() {
        this._reset(DTOFIELD_GRIDSTYLE);
    }

    @JsonIgnore
    public PSDEGridDTO gridstyle(String gridStyle) {
        this.setGridStyle(gridStyle);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO gridstyle(PSModelEnums.GridStyle gridStyle) {
        if (gridStyle == null) {
            this.setGridStyle(null);
        } else {
            this.setGridStyle(gridStyle.value);
        }
        return this;
    }

    @JsonProperty(value="groupmode")
    public void setGroupMode(String groupMode) {
        this._set(DTOFIELD_GROUPMODE, groupMode);
    }

    @JsonIgnore
    public String getGroupMode() {
        Object objValue = this._get(DTOFIELD_GROUPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupModeDirty() {
        return this._contains(DTOFIELD_GROUPMODE);
    }

    @JsonIgnore
    public void resetGroupMode() {
        this._reset(DTOFIELD_GROUPMODE);
    }

    @JsonIgnore
    public PSDEGridDTO groupmode(String groupMode) {
        this.setGroupMode(groupMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO groupmode(PSModelEnums.MDCtrlGroupMode groupMode) {
        if (groupMode == null) {
            this.setGroupMode(null);
        } else {
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    @JsonProperty(value="grouppscodelistid")
    public void setGroupPSCodeListId(String groupPSCodeListId) {
        this._set(DTOFIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }

    @JsonIgnore
    public String getGroupPSCodeListId() {
        Object objValue = this._get(DTOFIELD_GROUPPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty() {
        return this._contains(DTOFIELD_GROUPPSCODELISTID);
    }

    @JsonIgnore
    public void resetGroupPSCodeListId() {
        this._reset(DTOFIELD_GROUPPSCODELISTID);
    }

    @JsonIgnore
    public PSDEGridDTO grouppscodelistid(String groupPSCodeListId) {
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO grouppscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        } else {
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="grouppscodelistname")
    public void setGroupPSCodeListName(String groupPSCodeListName) {
        this._set(DTOFIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }

    @JsonIgnore
    public String getGroupPSCodeListName() {
        Object objValue = this._get(DTOFIELD_GROUPPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty() {
        return this._contains(DTOFIELD_GROUPPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetGroupPSCodeListName() {
        this._reset(DTOFIELD_GROUPPSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEGridDTO grouppscodelistname(String groupPSCodeListName) {
        this.setGroupPSCodeListName(groupPSCodeListName);
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
    public PSDEGridDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO grouppsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEGridDTO grouppsdefname(String groupPSDEFName) {
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
    public PSDEGridDTO grouppsdeuagroupid(String groupPSDEUAGroupId) {
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO grouppsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEGridDTO grouppsdeuagroupname(String groupPSDEUAGroupName) {
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="grouppssyscssid")
    public void setGroupPSSysCssId(String groupPSSysCssId) {
        this._set(DTOFIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }

    @JsonIgnore
    public String getGroupPSSysCssId() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysCssIdDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSCSSID);
    }

    @JsonIgnore
    public void resetGroupPSSysCssId() {
        this._reset(DTOFIELD_GROUPPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyscssid(String groupPSSysCssId) {
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setGroupPSSysCssId(null);
            this.setGroupPSSysCssName(null);
        } else {
            this.setGroupPSSysCssId(pSSysCss.getPSSysCssId());
            this.setGroupPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="grouppssyscssname")
    public void setGroupPSSysCssName(String groupPSSysCssName) {
        this._set(DTOFIELD_GROUPPSSYSCSSNAME, groupPSSysCssName);
    }

    @JsonIgnore
    public String getGroupPSSysCssName() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysCssNameDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetGroupPSSysCssName() {
        this._reset(DTOFIELD_GROUPPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyscssname(String groupPSSysCssName) {
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    @JsonProperty(value="grouppssyspfpluginid")
    public void setGroupPSSysPFPluginId(String groupPSSysPFPluginId) {
        this._set(DTOFIELD_GROUPPSSYSPFPLUGINID, groupPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGroupPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGroupPSSysPFPluginId() {
        this._reset(DTOFIELD_GROUPPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyspfpluginid(String groupPSSysPFPluginId) {
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGroupPSSysPFPluginId(null);
            this.setGroupPSSysPFPluginName(null);
        } else {
            this.setGroupPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGroupPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="grouppssyspfpluginname")
    public void setGroupPSSysPFPluginName(String groupPSSysPFPluginName) {
        this._set(DTOFIELD_GROUPPSSYSPFPLUGINNAME, groupPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGroupPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGroupPSSysPFPluginName() {
        this._reset(DTOFIELD_GROUPPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEGridDTO grouppssyspfpluginname(String groupPSSysPFPluginName) {
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="groupstyle")
    public void setGroupStyle(String groupStyle) {
        this._set(DTOFIELD_GROUPSTYLE, groupStyle);
    }

    @JsonIgnore
    public String getGroupStyle() {
        Object objValue = this._get(DTOFIELD_GROUPSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupStyleDirty() {
        return this._contains(DTOFIELD_GROUPSTYLE);
    }

    @JsonIgnore
    public void resetGroupStyle() {
        this._reset(DTOFIELD_GROUPSTYLE);
    }

    @JsonIgnore
    public PSDEGridDTO groupstyle(String groupStyle) {
        this.setGroupStyle(groupStyle);
        return this;
    }

    @JsonProperty(value="ignoredsitem")
    public void setIgnoreDSItem(Integer ignoreDSItem) {
        this._set(DTOFIELD_IGNOREDSITEM, ignoreDSItem);
    }

    @JsonIgnore
    public Integer getIgnoreDSItem() {
        Object objValue = this._get(DTOFIELD_IGNOREDSITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreDSItemDirty() {
        return this._contains(DTOFIELD_IGNOREDSITEM);
    }

    @JsonIgnore
    public void resetIgnoreDSItem() {
        this._reset(DTOFIELD_IGNOREDSITEM);
    }

    @JsonIgnore
    public PSDEGridDTO ignoredsitem(Integer ignoreDSItem) {
        this.setIgnoreDSItem(ignoreDSItem);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO ignoredsitem(PSModelEnums.GridDefDataItem[] ignoreDSItem) {
        if (ignoreDSItem == null || ignoreDSItem.length == 0) {
            this.setIgnoreDSItem(null);
        } else {
            int _value = 0;
            for (PSModelEnums.GridDefDataItem _item : ignoreDSItem) {
                _value |= _item.value;
            }
            this.setIgnoreDSItem(_value);
        }
        return this;
    }

    @JsonProperty(value="itempssyscssid")
    public void setItemPSSysCssId(String itemPSSysCssId) {
        this._set(DTOFIELD_ITEMPSSYSCSSID, itemPSSysCssId);
    }

    @JsonIgnore
    public String getItemPSSysCssId() {
        Object objValue = this._get(DTOFIELD_ITEMPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSSysCssIdDirty() {
        return this._contains(DTOFIELD_ITEMPSSYSCSSID);
    }

    @JsonIgnore
    public void resetItemPSSysCssId() {
        this._reset(DTOFIELD_ITEMPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEGridDTO itempssyscssid(String itemPSSysCssId) {
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO itempssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setItemPSSysCssId(null);
            this.setItemPSSysCssName(null);
        } else {
            this.setItemPSSysCssId(pSSysCss.getPSSysCssId());
            this.setItemPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="itempssyscssname")
    public void setItemPSSysCssName(String itemPSSysCssName) {
        this._set(DTOFIELD_ITEMPSSYSCSSNAME, itemPSSysCssName);
    }

    @JsonIgnore
    public String getItemPSSysCssName() {
        Object objValue = this._get(DTOFIELD_ITEMPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSSysCssNameDirty() {
        return this._contains(DTOFIELD_ITEMPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetItemPSSysCssName() {
        this._reset(DTOFIELD_ITEMPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEGridDTO itempssyscssname(String itemPSSysCssName) {
        this.setItemPSSysCssName(itemPSSysCssName);
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
    public PSDEGridDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorsortdir")
    public void setMinorSortDir(String minorSortDir) {
        this._set(DTOFIELD_MINORSORTDIR, minorSortDir);
    }

    @JsonIgnore
    public String getMinorSortDir() {
        Object objValue = this._get(DTOFIELD_MINORSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortDirDirty() {
        return this._contains(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public void resetMinorSortDir() {
        this._reset(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public PSDEGridDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
        if (minorSortDir == null) {
            this.setMinorSortDir(null);
        } else {
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefid")
    public void setMinorSortPSDEFId(String minorSortPSDEFId) {
        this._set(DTOFIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }

    @JsonIgnore
    public String getMinorSortPSDEFId() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFId() {
        this._reset(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public PSDEGridDTO minorsortpsdefid(String minorSortPSDEFId) {
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO minorsortpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        } else {
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefname")
    public void setMinorSortPSDEFName(String minorSortPSDEFName) {
        this._set(DTOFIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }

    @JsonIgnore
    public String getMinorSortPSDEFName() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFName() {
        this._reset(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public PSDEGridDTO minorsortpsdefname(String minorSortPSDEFName) {
        this.setMinorSortPSDEFName(minorSortPSDEFName);
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
    public PSDEGridDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEGridDTO movepsdeactionname(String movePSDEActionName) {
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    @JsonProperty(value="multiselect")
    public void setMultiSelect(Integer multiSelect) {
        this._set(DTOFIELD_MULTISELECT, multiSelect);
    }

    @JsonIgnore
    public Integer getMultiSelect() {
        Object objValue = this._get(DTOFIELD_MULTISELECT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMultiSelectDirty() {
        return this._contains(DTOFIELD_MULTISELECT);
    }

    @JsonIgnore
    public void resetMultiSelect() {
        this._reset(DTOFIELD_MULTISELECT);
    }

    @JsonIgnore
    public PSDEGridDTO multiselect(Integer multiSelect) {
        this.setMultiSelect(multiSelect);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO multiselect(Boolean multiSelect) {
        if (multiSelect == null) {
            this.setMultiSelect(null);
        } else {
            this.setMultiSelect(multiSelect != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="navpsderid")
    public void setNavPSDERId(String navPSDERId) {
        this._set(DTOFIELD_NAVPSDERID, navPSDERId);
    }

    @JsonIgnore
    public String getNavPSDERId() {
        Object objValue = this._get(DTOFIELD_NAVPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavPSDERIdDirty() {
        return this._contains(DTOFIELD_NAVPSDERID);
    }

    @JsonIgnore
    public void resetNavPSDERId() {
        this._reset(DTOFIELD_NAVPSDERID);
    }

    @JsonIgnore
    public PSDEGridDTO navpsderid(String navPSDERId) {
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO navpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setNavPSDERId(null);
            this.setNavPSDERName(null);
        } else {
            this.setNavPSDERId(pSDER.getPSDERId());
            this.setNavPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="navpsdername")
    public void setNavPSDERName(String navPSDERName) {
        this._set(DTOFIELD_NAVPSDERNAME, navPSDERName);
    }

    @JsonIgnore
    public String getNavPSDERName() {
        Object objValue = this._get(DTOFIELD_NAVPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavPSDERNameDirty() {
        return this._contains(DTOFIELD_NAVPSDERNAME);
    }

    @JsonIgnore
    public void resetNavPSDERName() {
        this._reset(DTOFIELD_NAVPSDERNAME);
    }

    @JsonIgnore
    public PSDEGridDTO navpsdername(String navPSDERName) {
        this.setNavPSDERName(navPSDERName);
        return this;
    }

    @JsonProperty(value="navpsdeviewbaseid")
    public void setNavPSDEViewBaseId(String navPSDEViewBaseId) {
        this._set(DTOFIELD_NAVPSDEVIEWBASEID, navPSDEViewBaseId);
    }

    @JsonIgnore
    public String getNavPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_NAVPSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_NAVPSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetNavPSDEViewBaseId() {
        this._reset(DTOFIELD_NAVPSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSDEGridDTO navpsdeviewbaseid(String navPSDEViewBaseId) {
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO navpsdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setNavPSDEViewBaseId(null);
            this.setNavPSDEViewBaseName(null);
        } else {
            this.setNavPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setNavPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="navpsdeviewbasename")
    public void setNavPSDEViewBaseName(String navPSDEViewBaseName) {
        this._set(DTOFIELD_NAVPSDEVIEWBASENAME, navPSDEViewBaseName);
    }

    @JsonIgnore
    public String getNavPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_NAVPSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_NAVPSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetNavPSDEViewBaseName() {
        this._reset(DTOFIELD_NAVPSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSDEGridDTO navpsdeviewbasename(String navPSDEViewBaseName) {
        this.setNavPSDEViewBaseName(navPSDEViewBaseName);
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
    public PSDEGridDTO navviewfilter(String navViewFilter) {
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    @JsonProperty(value="navviewheight")
    public void setNavViewHeight(Double navViewHeight) {
        this._set(DTOFIELD_NAVVIEWHEIGHT, navViewHeight);
    }

    @JsonIgnore
    public Double getNavViewHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewHeight() {
        this._reset(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public PSDEGridDTO navviewheight(Double navViewHeight) {
        this.setNavViewHeight(navViewHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxheight")
    public void setNavViewMaxHeight(Double navViewMaxHeight) {
        this._set(DTOFIELD_NAVVIEWMAXHEIGHT, navViewMaxHeight);
    }

    @JsonIgnore
    public Double getNavViewMaxHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMaxHeight() {
        this._reset(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public PSDEGridDTO navviewmaxheight(Double navViewMaxHeight) {
        this.setNavViewMaxHeight(navViewMaxHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxwidth")
    public void setNavViewMaxWidth(Double navViewMaxWidth) {
        this._set(DTOFIELD_NAVVIEWMAXWIDTH, navViewMaxWidth);
    }

    @JsonIgnore
    public Double getNavViewMaxWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMaxWidth() {
        this._reset(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public PSDEGridDTO navviewmaxwidth(Double navViewMaxWidth) {
        this.setNavViewMaxWidth(navViewMaxWidth);
        return this;
    }

    @JsonProperty(value="navviewminheight")
    public void setNavViewMinHeight(Double navViewMinHeight) {
        this._set(DTOFIELD_NAVVIEWMINHEIGHT, navViewMinHeight);
    }

    @JsonIgnore
    public Double getNavViewMinHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMinHeight() {
        this._reset(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public PSDEGridDTO navviewminheight(Double navViewMinHeight) {
        this.setNavViewMinHeight(navViewMinHeight);
        return this;
    }

    @JsonProperty(value="navviewminwidth")
    public void setNavViewMinWidth(Double navViewMinWidth) {
        this._set(DTOFIELD_NAVVIEWMINWIDTH, navViewMinWidth);
    }

    @JsonIgnore
    public Double getNavViewMinWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMinWidth() {
        this._reset(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public PSDEGridDTO navviewminwidth(Double navViewMinWidth) {
        this.setNavViewMinWidth(navViewMinWidth);
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
    public PSDEGridDTO navviewparam(String navViewParam) {
        this.setNavViewParam(navViewParam);
        return this;
    }

    @JsonProperty(value="navviewpos")
    public void setNavViewPos(String navViewPos) {
        this._set(DTOFIELD_NAVVIEWPOS, navViewPos);
    }

    @JsonIgnore
    public String getNavViewPos() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewPosDirty() {
        return this._contains(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public void resetNavViewPos() {
        this._reset(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public PSDEGridDTO navviewpos(String navViewPos) {
        this.setNavViewPos(navViewPos);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO navviewpos(PSModelEnums.NavViewPos navViewPos) {
        if (navViewPos == null) {
            this.setNavViewPos(null);
        } else {
            this.setNavViewPos(navViewPos.value);
        }
        return this;
    }

    @JsonProperty(value="navviewshowmode")
    public void setNavViewShowMode(Integer navViewShowMode) {
        this._set(DTOFIELD_NAVVIEWSHOWMODE, navViewShowMode);
    }

    @JsonIgnore
    public Integer getNavViewShowMode() {
        Object objValue = this._get(DTOFIELD_NAVVIEWSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavViewShowModeDirty() {
        return this._contains(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public void resetNavViewShowMode() {
        this._reset(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public PSDEGridDTO navviewshowmode(Integer navViewShowMode) {
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO navviewshowmode(PSModelEnums.NavViewShowMode navViewShowMode) {
        if (navViewShowMode == null) {
            this.setNavViewShowMode(null);
        } else {
            this.setNavViewShowMode(navViewShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="navviewwidth")
    public void setNavViewWidth(Double navViewWidth) {
        this._set(DTOFIELD_NAVVIEWWIDTH, navViewWidth);
    }

    @JsonIgnore
    public Double getNavViewWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public void resetNavViewWidth() {
        this._reset(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public PSDEGridDTO navviewwidth(Double navViewWidth) {
        this.setNavViewWidth(navViewWidth);
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
    public PSDEGridDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO nosort(Boolean noSort) {
        if (noSort == null) {
            this.setNoSort(null);
        } else {
            this.setNoSort(noSort != false ? 1 : 0);
        }
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
    public PSDEGridDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEGridDTO ordervaluepsdefname(String orderValuePSDEFName) {
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    @JsonProperty(value="pagingsize")
    public void setPagingSize(Integer pagingSize) {
        this._set(DTOFIELD_PAGINGSIZE, pagingSize);
    }

    @JsonIgnore
    public Integer getPagingSize() {
        Object objValue = this._get(DTOFIELD_PAGINGSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPagingSizeDirty() {
        return this._contains(DTOFIELD_PAGINGSIZE);
    }

    @JsonIgnore
    public void resetPagingSize() {
        this._reset(DTOFIELD_PAGINGSIZE);
    }

    @JsonIgnore
    public PSDEGridDTO pagingsize(Integer pagingSize) {
        this.setPagingSize(pagingSize);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO pagingsize(PSModelEnums.PagingSize pagingSize) {
        if (pagingSize == null) {
            this.setPagingSize(null);
        } else {
            this.setPagingSize(pagingSize.value);
        }
        return this;
    }

    @JsonProperty(value="psachandlerid")
    public void setPSACHandlerId(String pSACHandlerId) {
        this._set(DTOFIELD_PSACHANDLERID, pSACHandlerId);
    }

    @JsonIgnore
    public String getPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSACHandlerId() {
        this._reset(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public PSDEGridDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        } else {
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="psachandlername")
    public void setPSACHandlerName(String pSACHandlerName) {
        this._set(DTOFIELD_PSACHANDLERNAME, pSACHandlerName);
    }

    @JsonIgnore
    public String getPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSACHandlerName() {
        this._reset(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonProperty(value="psctrllogicgroupid")
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupId() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupId() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public PSDEGridDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
        if (pSCtrlLogicGroup == null) {
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        } else {
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    @JsonProperty(value="psctrllogicgroupname")
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupName() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupName() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    @JsonProperty(value="psctrlmsgid")
    public void setPSCtrlMsgId(String pSCtrlMsgId) {
        this._set(DTOFIELD_PSCTRLMSGID, pSCtrlMsgId);
    }

    @JsonIgnore
    public String getPSCtrlMsgId() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public void resetPSCtrlMsgId() {
        this._reset(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public PSDEGridDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
        if (pSCtrlMsg == null) {
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        } else {
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    @JsonProperty(value="psctrlmsgname")
    public void setPSCtrlMsgName(String pSCtrlMsgName) {
        this._set(DTOFIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }

    @JsonIgnore
    public String getPSCtrlMsgName() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public void resetPSCtrlMsgName() {
        this._reset(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    @JsonProperty(value="psdedatasetid")
    public void setPSDEDataSetId(String pSDEDataSetId) {
        this._set(DTOFIELD_PSDEDATASETID, pSDEDataSetId);
    }

    @JsonIgnore
    public String getPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public void resetPSDEDataSetId() {
        this._reset(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public PSDEGridDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        } else {
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasetname")
    public void setPSDEDataSetName(String pSDEDataSetName) {
        this._set(DTOFIELD_PSDEDATASETNAME, pSDEDataSetName);
    }

    @JsonIgnore
    public String getPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSetName() {
        this._reset(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonProperty(value="psdefinputtipsetid")
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetId() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetId() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public PSDEGridDTO psdefinputtipsetid(String pSDEFInputTipSetId) {
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psdefinputtipsetid(PSDEFInputTipSetDTO pSDEFInputTipSet) {
        if (pSDEFInputTipSet == null) {
            this.setPSDEFInputTipSetId(null);
            this.setPSDEFInputTipSetName(null);
        } else {
            this.setPSDEFInputTipSetId(pSDEFInputTipSet.getPSDEFInputTipSetId());
            this.setPSDEFInputTipSetName(pSDEFInputTipSet.getPSDEFInputTipSetName());
        }
        return this;
    }

    @JsonProperty(value="psdefinputtipsetname")
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetName() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetName() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psdefinputtipsetname(String pSDEFInputTipSetName) {
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
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
    public PSDEGridDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
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
    public PSDEGridDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEGridName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEGridName(strName);
    }

    @JsonIgnore
    public PSDEGridDTO name(String strName) {
        this.setPSDEGridName(strName);
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
    public PSDEGridDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSDEGridDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEGridDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEGridDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDEGridDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEGridDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDEGridDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEGridDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSDEGridDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSDEGridDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSDEGridDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSDEGridDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="quickpsdetoolbarid")
    public void setQuickPSDEToolbarId(String quickPSDEToolbarId) {
        this._set(DTOFIELD_QUICKPSDETOOLBARID, quickPSDEToolbarId);
    }

    @JsonIgnore
    public String getQuickPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_QUICKPSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_QUICKPSDETOOLBARID);
    }

    @JsonIgnore
    public void resetQuickPSDEToolbarId() {
        this._reset(DTOFIELD_QUICKPSDETOOLBARID);
    }

    @JsonIgnore
    public PSDEGridDTO quickpsdetoolbarid(String quickPSDEToolbarId) {
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setQuickPSDEToolbarId(null);
            this.setQuickPSDEToolbarName(null);
        } else {
            this.setQuickPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setQuickPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="quickpsdetoolbarname")
    public void setQuickPSDEToolbarName(String quickPSDEToolbarName) {
        this._set(DTOFIELD_QUICKPSDETOOLBARNAME, quickPSDEToolbarName);
    }

    @JsonIgnore
    public String getQuickPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_QUICKPSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_QUICKPSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetQuickPSDEToolbarName() {
        this._reset(DTOFIELD_QUICKPSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSDEGridDTO quickpsdetoolbarname(String quickPSDEToolbarName) {
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
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
    public PSDEGridDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEGridDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    @JsonProperty(value="showheader")
    public void setShowHeader(Integer showHeader) {
        this._set(DTOFIELD_SHOWHEADER, showHeader);
    }

    @JsonIgnore
    public Integer getShowHeader() {
        Object objValue = this._get(DTOFIELD_SHOWHEADER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowHeaderDirty() {
        return this._contains(DTOFIELD_SHOWHEADER);
    }

    @JsonIgnore
    public void resetShowHeader() {
        this._reset(DTOFIELD_SHOWHEADER);
    }

    @JsonIgnore
    public PSDEGridDTO showheader(Integer showHeader) {
        this.setShowHeader(showHeader);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO showheader(Boolean showHeader) {
        if (showHeader == null) {
            this.setShowHeader(null);
        } else {
            this.setShowHeader(showHeader != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="sortmode")
    public void setSortMode(String sortMode) {
        this._set(DTOFIELD_SORTMODE, sortMode);
    }

    @JsonIgnore
    public String getSortMode() {
        Object objValue = this._get(DTOFIELD_SORTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSortModeDirty() {
        return this._contains(DTOFIELD_SORTMODE);
    }

    @JsonIgnore
    public void resetSortMode() {
        this._reset(DTOFIELD_SORTMODE);
    }

    @JsonIgnore
    public PSDEGridDTO sortmode(String sortMode) {
        this.setSortMode(sortMode);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO sortmode(PSModelEnums.SortMode sortMode) {
        if (sortMode == null) {
            this.setSortMode(null);
        } else {
            this.setSortMode(sortMode.value);
        }
        return this;
    }

    @JsonProperty(value="treeppsdefid")
    public void setTreePPSDEFId(String treePPSDEFId) {
        this._set(DTOFIELD_TREEPPSDEFID, treePPSDEFId);
    }

    @JsonIgnore
    public String getTreePPSDEFId() {
        Object objValue = this._get(DTOFIELD_TREEPPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTreePPSDEFIdDirty() {
        return this._contains(DTOFIELD_TREEPPSDEFID);
    }

    @JsonIgnore
    public void resetTreePPSDEFId() {
        this._reset(DTOFIELD_TREEPPSDEFID);
    }

    @JsonIgnore
    public PSDEGridDTO treeppsdefid(String treePPSDEFId) {
        this.setTreePPSDEFId(treePPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO treeppsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTreePPSDEFId(null);
            this.setTreePPSDEFName(null);
        } else {
            this.setTreePPSDEFId(pSDEField.getPSDEFieldId());
            this.setTreePPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="treeppsdefname")
    public void setTreePPSDEFName(String treePPSDEFName) {
        this._set(DTOFIELD_TREEPPSDEFNAME, treePPSDEFName);
    }

    @JsonIgnore
    public String getTreePPSDEFName() {
        Object objValue = this._get(DTOFIELD_TREEPPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTreePPSDEFNameDirty() {
        return this._contains(DTOFIELD_TREEPPSDEFNAME);
    }

    @JsonIgnore
    public void resetTreePPSDEFName() {
        this._reset(DTOFIELD_TREEPPSDEFNAME);
    }

    @JsonIgnore
    public PSDEGridDTO treeppsdefname(String treePPSDEFName) {
        this.setTreePPSDEFName(treePPSDEFName);
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
    public PSDEGridDTO updatedate(Timestamp updateDate) {
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
    public PSDEGridDTO updateman(String updateMan) {
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
    public PSDEGridDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEGridDTO updatepsdeactionname(String updatePSDEActionName) {
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    @JsonProperty(value="user2psdeactionid")
    public void setUser2PSDEActionId(String user2PSDEActionId) {
        this._set(DTOFIELD_USER2PSDEACTIONID, user2PSDEActionId);
    }

    @JsonIgnore
    public String getUser2PSDEActionId() {
        Object objValue = this._get(DTOFIELD_USER2PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEActionIdDirty() {
        return this._contains(DTOFIELD_USER2PSDEACTIONID);
    }

    @JsonIgnore
    public void resetUser2PSDEActionId() {
        this._reset(DTOFIELD_USER2PSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO user2psdeactionid(String user2PSDEActionId) {
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO user2psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUser2PSDEActionId(null);
            this.setUser2PSDEActionName(null);
        } else {
            this.setUser2PSDEActionId(pSDEAction.getPSDEActionId());
            this.setUser2PSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="user2psdeactionname")
    public void setUser2PSDEActionName(String user2PSDEActionName) {
        this._set(DTOFIELD_USER2PSDEACTIONNAME, user2PSDEActionName);
    }

    @JsonIgnore
    public String getUser2PSDEActionName() {
        Object objValue = this._get(DTOFIELD_USER2PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEActionNameDirty() {
        return this._contains(DTOFIELD_USER2PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUser2PSDEActionName() {
        this._reset(DTOFIELD_USER2PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO user2psdeactionname(String user2PSDEActionName) {
        this.setUser2PSDEActionName(user2PSDEActionName);
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
    public PSDEGridDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="userpsdeactionid")
    public void setUserPSDEActionId(String userPSDEActionId) {
        this._set(DTOFIELD_USERPSDEACTIONID, userPSDEActionId);
    }

    @JsonIgnore
    public String getUserPSDEActionId() {
        Object objValue = this._get(DTOFIELD_USERPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEActionIdDirty() {
        return this._contains(DTOFIELD_USERPSDEACTIONID);
    }

    @JsonIgnore
    public void resetUserPSDEActionId() {
        this._reset(DTOFIELD_USERPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEGridDTO userpsdeactionid(String userPSDEActionId) {
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEGridDTO userpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUserPSDEActionId(null);
            this.setUserPSDEActionName(null);
        } else {
            this.setUserPSDEActionId(pSDEAction.getPSDEActionId());
            this.setUserPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="userpsdeactionname")
    public void setUserPSDEActionName(String userPSDEActionName) {
        this._set(DTOFIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }

    @JsonIgnore
    public String getUserPSDEActionName() {
        Object objValue = this._get(DTOFIELD_USERPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEActionNameDirty() {
        return this._contains(DTOFIELD_USERPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUserPSDEActionName() {
        this._reset(DTOFIELD_USERPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEGridDTO userpsdeactionname(String userPSDEActionName) {
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEGridId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEGridId(strValue);
    }

    @JsonIgnore
    public PSDEGridDTO id(String strValue) {
        this.setPSDEGridId(strValue);
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

    @JsonIgnore
    public List<Object> getPSDEGEIUpdates() {
        Object list = this._get(DTOFIELD_PSDEGEIUPDATES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdegeiupdates")
    public void setPSDEGEIUpdates(List<Object> psdegeiupdates) {
        this._set(DTOFIELD_PSDEGEIUPDATES, psdegeiupdates);
    }

    @JsonIgnore
    public List<Object> getPSDEGEIUpdatesIf() {
        Object list = this._get(DTOFIELD_PSDEGEIUPDATES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEGEIUPDATES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<Object> getPSDEGEIVRs() {
        Object list = this._get(DTOFIELD_PSDEGEIVRS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdegeivrs")
    public void setPSDEGEIVRs(List<Object> psdegeivrs) {
        this._set(DTOFIELD_PSDEGEIVRS, psdegeivrs);
    }

    @JsonIgnore
    public List<Object> getPSDEGEIVRsIf() {
        Object list = this._get(DTOFIELD_PSDEGEIVRS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEGEIVRS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEGridLogicDTO> getPSDEGridLogics() {
        Object list = this._get(DTOFIELD_PSDEGRIDLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdegridlogics")
    public void setPSDEGridLogics(List<PSDEGridLogicDTO> psdegridlogics) {
        this._set(DTOFIELD_PSDEGRIDLOGICS, psdegridlogics);
    }

    @JsonIgnore
    public List<PSDEGridLogicDTO> getPSDEGridLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEGRIDLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEGRIDLOGICS, list);
        }
        return (List) list;
    }
}
