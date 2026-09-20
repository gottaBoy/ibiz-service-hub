package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEListDTO
extends PSModelDTOBase {
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_APPENDDEITEMS = "APPENDDEITEMS";
    protected static final String DTOFIELD_APPENDDEITEMS = "appenddeitems";
    public static final String FIELD_ASYNCPSDEDSID = "ASYNCPSDEDSID";
    protected static final String DTOFIELD_ASYNCPSDEDSID = "asyncpsdedsid";
    public static final String FIELD_ASYNCPSDEDSNAME = "ASYNCPSDEDSNAME";
    protected static final String DTOFIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";
    public static final String FIELD_BATPSDETOOLBARID = "BATPSDETOOLBARID";
    protected static final String DTOFIELD_BATPSDETOOLBARID = "batpsdetoolbarid";
    public static final String FIELD_BATPSDETOOLBARNAME = "BATPSDETOOLBARNAME";
    protected static final String DTOFIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
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
    public static final String FIELD_ENABLEEDIT = "ENABLEEDIT";
    protected static final String DTOFIELD_ENABLEEDIT = "enableedit";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLEPAGINGBAR = "ENABLEPAGINGBAR";
    protected static final String DTOFIELD_ENABLEPAGINGBAR = "enablepagingbar";
    public static final String FIELD_GETDRAFTPSDEACTIONID = "GETDRAFTPSDEACTIONID";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";
    public static final String FIELD_GETDRAFTPSDEACTIONNAME = "GETDRAFTPSDEACTIONNAME";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";
    public static final String FIELD_GETPSDEACTIONID = "GETPSDEACTIONID";
    protected static final String DTOFIELD_GETPSDEACTIONID = "getpsdeactionid";
    public static final String FIELD_GETPSDEACTIONNAME = "GETPSDEACTIONNAME";
    protected static final String DTOFIELD_GETPSDEACTIONNAME = "getpsdeactionname";
    public static final String FIELD_GROUPBARCLOSEMODE = "GROUPBARCLOSEMODE";
    protected static final String DTOFIELD_GROUPBARCLOSEMODE = "groupbarclosemode";
    public static final String FIELD_GROUPMODE = "GROUPMODE";
    protected static final String DTOFIELD_GROUPMODE = "groupmode";
    public static final String FIELD_GROUPMOVEPSDEACTIONID = "GROUPMOVEPSDEACTIONID";
    protected static final String DTOFIELD_GROUPMOVEPSDEACTIONID = "groupmovepsdeactionid";
    public static final String FIELD_GROUPMOVEPSDEACTIONNAME = "GROUPMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_GROUPMOVEPSDEACTIONNAME = "groupmovepsdeactionname";
    public static final String FIELD_GROUPPSCODELISTID = "GROUPPSCODELISTID";
    protected static final String DTOFIELD_GROUPPSCODELISTID = "grouppscodelistid";
    public static final String FIELD_GROUPPSCODELISTNAME = "GROUPPSCODELISTNAME";
    protected static final String DTOFIELD_GROUPPSCODELISTNAME = "grouppscodelistname";
    public static final String FIELD_GROUPPSDEFID = "GROUPPSDEFID";
    protected static final String DTOFIELD_GROUPPSDEFID = "grouppsdefid";
    public static final String FIELD_GROUPPSDEFNAME = "GROUPPSDEFNAME";
    protected static final String DTOFIELD_GROUPPSDEFNAME = "grouppsdefname";
    public static final String FIELD_GROUPPSDEID = "GROUPPSDEID";
    protected static final String DTOFIELD_GROUPPSDEID = "grouppsdeid";
    public static final String FIELD_GROUPPSDENAME = "GROUPPSDENAME";
    protected static final String DTOFIELD_GROUPPSDENAME = "grouppsdename";
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
    public static final String FIELD_ITEMPSSYSCSSID = "ITEMPSSYSCSSID";
    protected static final String DTOFIELD_ITEMPSSYSCSSID = "itempssyscssid";
    public static final String FIELD_ITEMPSSYSCSSNAME = "ITEMPSSYSCSSNAME";
    protected static final String DTOFIELD_ITEMPSSYSCSSNAME = "itempssyscssname";
    public static final String FIELD_ITEMPSSYSPFPLUGINID = "ITEMPSSYSPFPLUGINID";
    protected static final String DTOFIELD_ITEMPSSYSPFPLUGINID = "itempssyspfpluginid";
    public static final String FIELD_ITEMPSSYSPFPLUGINNAME = "ITEMPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_ITEMPSSYSPFPLUGINNAME = "itempssyspfpluginname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_LVTAG = "LVTAG";
    protected static final String DTOFIELD_LVTAG = "lvtag";
    public static final String FIELD_LVTAG2 = "LVTAG2";
    protected static final String DTOFIELD_LVTAG2 = "lvtag2";
    public static final String FIELD_LVTAG3 = "LVTAG3";
    protected static final String DTOFIELD_LVTAG3 = "lvtag3";
    public static final String FIELD_LVTAG4 = "LVTAG4";
    protected static final String DTOFIELD_LVTAG4 = "lvtag4";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORSORTDIR = "MINORSORTDIR";
    protected static final String DTOFIELD_MINORSORTDIR = "minorsortdir";
    public static final String FIELD_MINORSORTPSDEFID = "MINORSORTPSDEFID";
    protected static final String DTOFIELD_MINORSORTPSDEFID = "minorsortpsdefid";
    public static final String FIELD_MINORSORTPSDEFNAME = "MINORSORTPSDEFNAME";
    protected static final String DTOFIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";
    public static final String FIELD_MOBLISTSTYLE = "MOBLISTSTYLE";
    protected static final String DTOFIELD_MOBLISTSTYLE = "mobliststyle";
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
    public static final String FIELD_NO2PSDEUAGROUPID = "NO2PSDEUAGROUPID";
    protected static final String DTOFIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";
    public static final String FIELD_NO2PSDEUAGROUPNAME = "NO2PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";
    public static final String FIELD_NOSORT = "NOSORT";
    protected static final String DTOFIELD_NOSORT = "nosort";
    public static final String FIELD_ORDERVALUEPSDEFID = "ORDERVALUEPSDEFID";
    protected static final String DTOFIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";
    public static final String FIELD_ORDERVALUEPSDEFNAME = "ORDERVALUEPSDEFNAME";
    protected static final String DTOFIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";
    public static final String FIELD_PAGESIZE = "PAGESIZE";
    protected static final String DTOFIELD_PAGESIZE = "pagesize";
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
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELISTID = "PSDELISTID";
    protected static final String DTOFIELD_PSDELISTID = "psdelistid";
    public static final String FIELD_PSDELISTNAME = "PSDELISTNAME";
    protected static final String DTOFIELD_PSDELISTNAME = "psdelistname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
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
    public static final String FIELD_SWIMLANEPSCODELISTID = "SWIMLANEPSCODELISTID";
    protected static final String DTOFIELD_SWIMLANEPSCODELISTID = "swimlanepscodelistid";
    public static final String FIELD_SWIMLANEPSCODELISTNAME = "SWIMLANEPSCODELISTNAME";
    protected static final String DTOFIELD_SWIMLANEPSCODELISTNAME = "swimlanepscodelistname";
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
    public static final String FIELD_USERPSDEACTIONID = "USERPSDEACTIONID";
    protected static final String DTOFIELD_USERPSDEACTIONID = "userpsdeactionid";
    public static final String FIELD_USERPSDEACTIONNAME = "USERPSDEACTIONNAME";
    protected static final String DTOFIELD_USERPSDEACTIONNAME = "userpsdeactionname";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String DTOFIELD_PSDELISTITEMS = "psdelistitems";
    public static final String DTOFIELD_PSDELISTLOGICS = "psdelistlogics";

    @JsonProperty(value="adpsdelogicid")
    public void setADPSDELogicId(String aDPSDELogicId) {
        this._set(DTOFIELD_ADPSDELOGICID, aDPSDELogicId);
    }

    @JsonIgnore
    public String getADPSDELogicId() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicIdDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public void resetADPSDELogicId() {
        this._reset(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public PSDEListDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        } else {
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicname")
    public void setADPSDELogicName(String aDPSDELogicName) {
        this._set(DTOFIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }

    @JsonIgnore
    public String getADPSDELogicName() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicNameDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetADPSDELogicName() {
        this._reset(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEListDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    @JsonProperty(value="appenddeitems")
    public void setAppendDEItems(Integer appendDEItems) {
        this._set(DTOFIELD_APPENDDEITEMS, appendDEItems);
    }

    @JsonIgnore
    public Integer getAppendDEItems() {
        Object objValue = this._get(DTOFIELD_APPENDDEITEMS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAppendDEItemsDirty() {
        return this._contains(DTOFIELD_APPENDDEITEMS);
    }

    @JsonIgnore
    public void resetAppendDEItems() {
        this._reset(DTOFIELD_APPENDDEITEMS);
    }

    @JsonIgnore
    public PSDEListDTO appenddeitems(Integer appendDEItems) {
        this.setAppendDEItems(appendDEItems);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO appenddeitems(Boolean appendDEItems) {
        if (appendDEItems == null) {
            this.setAppendDEItems(null);
        } else {
            this.setAppendDEItems(appendDEItems != false ? 1 : 0);
        }
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
    public PSDEListDTO asyncpsdedsid(String asyncPSDEDSId) {
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO asyncpsdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEListDTO asyncpsdedsname(String asyncPSDEDSName) {
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
    public PSDEListDTO batpsdetoolbarid(String batPSDEToolbarId) {
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDEListDTO batpsdetoolbarname(String batPSDEToolbarName) {
        this.setBatPSDEToolbarName(batPSDEToolbarName);
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
    public PSDEListDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO busyindicator(Boolean busyIndicator) {
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
    public PSDEListDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEListDTO copypsdeactionid(String copyPSDEActionId) {
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO copypsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO copypsdeactionname(String copyPSDEActionName) {
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
    public PSDEListDTO createdate(Timestamp createDate) {
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
    public PSDEListDTO createman(String createMan) {
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
    public PSDEListDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO createpsdeactionname(String createPSDEActionName) {
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
    public PSDEListDTO customcond(String customCond) {
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
    public PSDEListDTO customtype(String customType) {
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
    public PSDEListDTO emptytext(String emptyText) {
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
    public PSDEListDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEListDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
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
    public PSDEListDTO enableedit(Integer enableEdit) {
        this.setEnableEdit(enableEdit);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO enableedit(PSModelEnums.MDCtrlEditMode[] enableEdit) {
        if (enableEdit == null || enableEdit.length == 0) {
            this.setEnableEdit(null);
        } else {
            int _value = 0;
            for (PSModelEnums.MDCtrlEditMode _item : enableEdit) {
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
    public PSDEListDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO enableitempriv(Boolean enableItemPriv) {
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
    public PSDEListDTO enablepagingbar(Integer enablePagingBar) {
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO enablepagingbar(PSModelEnums.PagingMode enablePagingBar) {
        if (enablePagingBar == null) {
            this.setEnablePagingBar(null);
        } else {
            this.setEnablePagingBar(enablePagingBar.value);
        }
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
    public PSDEListDTO getdraftpsdeactionid(String getDraftPSDEActionId) {
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO getdraftpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO getdraftpsdeactionname(String getDraftPSDEActionName) {
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
    public PSDEListDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO getpsdeactionname(String getPSDEActionName) {
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    @JsonProperty(value="groupbarclosemode")
    public void setGroupBarCloseMode(Integer groupBarCloseMode) {
        this._set(DTOFIELD_GROUPBARCLOSEMODE, groupBarCloseMode);
    }

    @JsonIgnore
    public Integer getGroupBarCloseMode() {
        Object objValue = this._get(DTOFIELD_GROUPBARCLOSEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupBarCloseModeDirty() {
        return this._contains(DTOFIELD_GROUPBARCLOSEMODE);
    }

    @JsonIgnore
    public void resetGroupBarCloseMode() {
        this._reset(DTOFIELD_GROUPBARCLOSEMODE);
    }

    @JsonIgnore
    public PSDEListDTO groupbarclosemode(Integer groupBarCloseMode) {
        this.setGroupBarCloseMode(groupBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO groupbarclosemode(PSModelEnums.GroupTitleBarCloseMode groupBarCloseMode) {
        if (groupBarCloseMode == null) {
            this.setGroupBarCloseMode(null);
        } else {
            this.setGroupBarCloseMode(groupBarCloseMode.value);
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
    public PSDEListDTO groupmode(String groupMode) {
        this.setGroupMode(groupMode);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO groupmode(PSModelEnums.MDCtrlGroupMode groupMode) {
        if (groupMode == null) {
            this.setGroupMode(null);
        } else {
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    @JsonProperty(value="groupmovepsdeactionid")
    public void setGroupMovePSDEActionId(String groupMovePSDEActionId) {
        this._set(DTOFIELD_GROUPMOVEPSDEACTIONID, groupMovePSDEActionId);
    }

    @JsonIgnore
    public String getGroupMovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_GROUPMOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupMovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_GROUPMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGroupMovePSDEActionId() {
        this._reset(DTOFIELD_GROUPMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEListDTO groupmovepsdeactionid(String groupMovePSDEActionId) {
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO groupmovepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGroupMovePSDEActionId(null);
            this.setGroupMovePSDEActionName(null);
        } else {
            this.setGroupMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setGroupMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="groupmovepsdeactionname")
    public void setGroupMovePSDEActionName(String groupMovePSDEActionName) {
        this._set(DTOFIELD_GROUPMOVEPSDEACTIONNAME, groupMovePSDEActionName);
    }

    @JsonIgnore
    public String getGroupMovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupMovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGroupMovePSDEActionName() {
        this._reset(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEListDTO groupmovepsdeactionname(String groupMovePSDEActionName) {
        this.setGroupMovePSDEActionName(groupMovePSDEActionName);
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
    public PSDEListDTO grouppscodelistid(String groupPSCodeListId) {
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEListDTO grouppscodelistname(String groupPSCodeListName) {
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
    public PSDEListDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEListDTO grouppsdefname(String groupPSDEFName) {
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    @JsonProperty(value="grouppsdeid")
    public void setGroupPSDEId(String groupPSDEId) {
        this._set(DTOFIELD_GROUPPSDEID, groupPSDEId);
    }

    @JsonIgnore
    public String getGroupPSDEId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEID);
    }

    @JsonIgnore
    public void resetGroupPSDEId() {
        this._reset(DTOFIELD_GROUPPSDEID);
    }

    @JsonIgnore
    public PSDEListDTO grouppsdeid(String groupPSDEId) {
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setGroupPSDEId(null);
            this.setGroupPSDEName(null);
        } else {
            this.setGroupPSDEId(pSDataEntity.getPSDataEntityId());
            this.setGroupPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdename")
    public void setGroupPSDEName(String groupPSDEName) {
        this._set(DTOFIELD_GROUPPSDENAME, groupPSDEName);
    }

    @JsonIgnore
    public String getGroupPSDEName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDENameDirty() {
        return this._contains(DTOFIELD_GROUPPSDENAME);
    }

    @JsonIgnore
    public void resetGroupPSDEName() {
        this._reset(DTOFIELD_GROUPPSDENAME);
    }

    @JsonIgnore
    public PSDEListDTO grouppsdename(String groupPSDEName) {
        this.setGroupPSDEName(groupPSDEName);
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
    public PSDEListDTO grouppsdeuagroupid(String groupPSDEUAGroupId) {
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEListDTO grouppsdeuagroupname(String groupPSDEUAGroupName) {
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
    public PSDEListDTO grouppssyscssid(String groupPSSysCssId) {
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEListDTO grouppssyscssname(String groupPSSysCssName) {
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
    public PSDEListDTO grouppssyspfpluginid(String groupPSSysPFPluginId) {
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEListDTO grouppssyspfpluginname(String groupPSSysPFPluginName) {
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
    public PSDEListDTO groupstyle(String groupStyle) {
        this.setGroupStyle(groupStyle);
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
    public PSDEListDTO itempssyscssid(String itemPSSysCssId) {
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO itempssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEListDTO itempssyscssname(String itemPSSysCssName) {
        this.setItemPSSysCssName(itemPSSysCssName);
        return this;
    }

    @JsonProperty(value="itempssyspfpluginid")
    public void setItemPSSysPFPluginId(String itemPSSysPFPluginId) {
        this._set(DTOFIELD_ITEMPSSYSPFPLUGINID, itemPSSysPFPluginId);
    }

    @JsonIgnore
    public String getItemPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_ITEMPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_ITEMPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetItemPSSysPFPluginId() {
        this._reset(DTOFIELD_ITEMPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEListDTO itempssyspfpluginid(String itemPSSysPFPluginId) {
        this.setItemPSSysPFPluginId(itemPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO itempssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setItemPSSysPFPluginId(null);
            this.setItemPSSysPFPluginName(null);
        } else {
            this.setItemPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setItemPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="itempssyspfpluginname")
    public void setItemPSSysPFPluginName(String itemPSSysPFPluginName) {
        this._set(DTOFIELD_ITEMPSSYSPFPLUGINNAME, itemPSSysPFPluginName);
    }

    @JsonIgnore
    public String getItemPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_ITEMPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_ITEMPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetItemPSSysPFPluginName() {
        this._reset(DTOFIELD_ITEMPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEListDTO itempssyspfpluginname(String itemPSSysPFPluginName) {
        this.setItemPSSysPFPluginName(itemPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSDEListDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="lvtag")
    public void setLVTag(String lVTag) {
        this._set(DTOFIELD_LVTAG, lVTag);
    }

    @JsonIgnore
    public String getLVTag() {
        Object objValue = this._get(DTOFIELD_LVTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLVTagDirty() {
        return this._contains(DTOFIELD_LVTAG);
    }

    @JsonIgnore
    public void resetLVTag() {
        this._reset(DTOFIELD_LVTAG);
    }

    @JsonIgnore
    public PSDEListDTO lvtag(String lVTag) {
        this.setLVTag(lVTag);
        return this;
    }

    @JsonProperty(value="lvtag2")
    public void setLVTag2(String lVTag2) {
        this._set(DTOFIELD_LVTAG2, lVTag2);
    }

    @JsonIgnore
    public String getLVTag2() {
        Object objValue = this._get(DTOFIELD_LVTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLVTag2Dirty() {
        return this._contains(DTOFIELD_LVTAG2);
    }

    @JsonIgnore
    public void resetLVTag2() {
        this._reset(DTOFIELD_LVTAG2);
    }

    @JsonIgnore
    public PSDEListDTO lvtag2(String lVTag2) {
        this.setLVTag2(lVTag2);
        return this;
    }

    @JsonProperty(value="lvtag3")
    public void setLVTag3(String lVTag3) {
        this._set(DTOFIELD_LVTAG3, lVTag3);
    }

    @JsonIgnore
    public String getLVTag3() {
        Object objValue = this._get(DTOFIELD_LVTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLVTag3Dirty() {
        return this._contains(DTOFIELD_LVTAG3);
    }

    @JsonIgnore
    public void resetLVTag3() {
        this._reset(DTOFIELD_LVTAG3);
    }

    @JsonIgnore
    public PSDEListDTO lvtag3(String lVTag3) {
        this.setLVTag3(lVTag3);
        return this;
    }

    @JsonProperty(value="lvtag4")
    public void setLVTag4(String lVTag4) {
        this._set(DTOFIELD_LVTAG4, lVTag4);
    }

    @JsonIgnore
    public String getLVTag4() {
        Object objValue = this._get(DTOFIELD_LVTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLVTag4Dirty() {
        return this._contains(DTOFIELD_LVTAG4);
    }

    @JsonIgnore
    public void resetLVTag4() {
        this._reset(DTOFIELD_LVTAG4);
    }

    @JsonIgnore
    public PSDEListDTO lvtag4(String lVTag4) {
        this.setLVTag4(lVTag4);
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
    public PSDEListDTO memo(String memo) {
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
    public PSDEListDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
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
    public PSDEListDTO minorsortpsdefid(String minorSortPSDEFId) {
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO minorsortpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEListDTO minorsortpsdefname(String minorSortPSDEFName) {
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    @JsonProperty(value="mobliststyle")
    public void setMobListStyle(String mobListStyle) {
        this._set(DTOFIELD_MOBLISTSTYLE, mobListStyle);
    }

    @JsonIgnore
    public String getMobListStyle() {
        Object objValue = this._get(DTOFIELD_MOBLISTSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobListStyleDirty() {
        return this._contains(DTOFIELD_MOBLISTSTYLE);
    }

    @JsonIgnore
    public void resetMobListStyle() {
        this._reset(DTOFIELD_MOBLISTSTYLE);
    }

    @JsonIgnore
    public PSDEListDTO mobliststyle(String mobListStyle) {
        this.setMobListStyle(mobListStyle);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO mobliststyle(PSModelEnums.MobMDCtrlType mobListStyle) {
        if (mobListStyle == null) {
            this.setMobListStyle(null);
        } else {
            this.setMobListStyle(mobListStyle.value);
        }
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
    public PSDEListDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO movepsdeactionname(String movePSDEActionName) {
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
    public PSDEListDTO multiselect(Integer multiSelect) {
        this.setMultiSelect(multiSelect);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO multiselect(Boolean multiSelect) {
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
    public PSDEListDTO navpsderid(String navPSDERId) {
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO navpsderid(PSDERDTO pSDER) {
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
    public PSDEListDTO navpsdername(String navPSDERName) {
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
    public PSDEListDTO navpsdeviewbaseid(String navPSDEViewBaseId) {
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO navpsdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEListDTO navpsdeviewbasename(String navPSDEViewBaseName) {
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
    public PSDEListDTO navviewfilter(String navViewFilter) {
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
    public PSDEListDTO navviewheight(Double navViewHeight) {
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
    public PSDEListDTO navviewmaxheight(Double navViewMaxHeight) {
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
    public PSDEListDTO navviewmaxwidth(Double navViewMaxWidth) {
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
    public PSDEListDTO navviewminheight(Double navViewMinHeight) {
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
    public PSDEListDTO navviewminwidth(Double navViewMinWidth) {
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
    public PSDEListDTO navviewparam(String navViewParam) {
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
    public PSDEListDTO navviewpos(String navViewPos) {
        this.setNavViewPos(navViewPos);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO navviewpos(PSModelEnums.NavViewPos navViewPos) {
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
    public PSDEListDTO navviewshowmode(Integer navViewShowMode) {
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO navviewshowmode(PSModelEnums.NavViewShowMode navViewShowMode) {
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
    public PSDEListDTO navviewwidth(Double navViewWidth) {
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    @JsonProperty(value="no2psdeuagroupid")
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId) {
        this._set(DTOFIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupId() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEListDTO no2psdeuagroupid(String no2PSDEUAGroupId) {
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        } else {
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupname")
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName) {
        this._set(DTOFIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupName() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEListDTO no2psdeuagroupname(String no2PSDEUAGroupName) {
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
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
    public PSDEListDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO nosort(Boolean noSort) {
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
    public PSDEListDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEListDTO ordervaluepsdefname(String orderValuePSDEFName) {
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    @JsonProperty(value="pagesize")
    public void setPageSize(Integer pageSize) {
        this._set(DTOFIELD_PAGESIZE, pageSize);
    }

    @JsonIgnore
    public Integer getPageSize() {
        Object objValue = this._get(DTOFIELD_PAGESIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPageSizeDirty() {
        return this._contains(DTOFIELD_PAGESIZE);
    }

    @JsonIgnore
    public void resetPageSize() {
        this._reset(DTOFIELD_PAGESIZE);
    }

    @JsonIgnore
    public PSDEListDTO pagesize(Integer pageSize) {
        this.setPageSize(pageSize);
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
    public PSDEListDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSDEListDTO psachandlername(String pSACHandlerName) {
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
    public PSDEListDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDEListDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSDEListDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
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
    public PSDEListDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSDEListDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEListDTO psdedsname(String pSDEDSName) {
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
    public PSDEListDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelistid")
    public void setPSDEListId(String pSDEListId) {
        this._set(DTOFIELD_PSDELISTID, pSDEListId);
    }

    @JsonIgnore
    public String getPSDEListId() {
        Object objValue = this._get(DTOFIELD_PSDELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListIdDirty() {
        return this._contains(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public void resetPSDEListId() {
        this._reset(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public PSDEListDTO psdelistid(String pSDEListId) {
        this.setPSDEListId(pSDEListId);
        return this;
    }

    @JsonProperty(value="psdelistname")
    public void setPSDEListName(String pSDEListName) {
        this._set(DTOFIELD_PSDELISTNAME, pSDEListName);
    }

    @JsonIgnore
    public String getPSDEListName() {
        Object objValue = this._get(DTOFIELD_PSDELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListNameDirty() {
        return this._contains(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public void resetPSDEListName() {
        this._reset(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public PSDEListDTO psdelistname(String pSDEListName) {
        this.setPSDEListName(pSDEListName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEListName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEListName(strName);
    }

    @JsonIgnore
    public PSDEListDTO name(String strName) {
        this.setPSDEListName(strName);
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
    public PSDEListDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEListDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEListDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
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
    public PSDEListDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEListDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDEListDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEListDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEListDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEListDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDEListDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSDEListDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSDEListDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSDEListDTO psviewmsggroupname(String pSViewMsgGroupName) {
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
    public PSDEListDTO quickpsdetoolbarid(String quickPSDEToolbarId) {
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDEListDTO quickpsdetoolbarname(String quickPSDEToolbarName) {
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
    public PSDEListDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO removepsdeactionname(String removePSDEActionName) {
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
    public PSDEListDTO showheader(Integer showHeader) {
        this.setShowHeader(showHeader);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO showheader(Boolean showHeader) {
        if (showHeader == null) {
            this.setShowHeader(null);
        } else {
            this.setShowHeader(showHeader != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="swimlanepscodelistid")
    public void setSwimlanePSCodeListId(String swimlanePSCodeListId) {
        this._set(DTOFIELD_SWIMLANEPSCODELISTID, swimlanePSCodeListId);
    }

    @JsonIgnore
    public String getSwimlanePSCodeListId() {
        Object objValue = this._get(DTOFIELD_SWIMLANEPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSwimlanePSCodeListIdDirty() {
        return this._contains(DTOFIELD_SWIMLANEPSCODELISTID);
    }

    @JsonIgnore
    public void resetSwimlanePSCodeListId() {
        this._reset(DTOFIELD_SWIMLANEPSCODELISTID);
    }

    @JsonIgnore
    public PSDEListDTO swimlanepscodelistid(String swimlanePSCodeListId) {
        this.setSwimlanePSCodeListId(swimlanePSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO swimlanepscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setSwimlanePSCodeListId(null);
            this.setSwimlanePSCodeListName(null);
        } else {
            this.setSwimlanePSCodeListId(pSCodeList.getPSCodeListId());
            this.setSwimlanePSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="swimlanepscodelistname")
    public void setSwimlanePSCodeListName(String swimlanePSCodeListName) {
        this._set(DTOFIELD_SWIMLANEPSCODELISTNAME, swimlanePSCodeListName);
    }

    @JsonIgnore
    public String getSwimlanePSCodeListName() {
        Object objValue = this._get(DTOFIELD_SWIMLANEPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSwimlanePSCodeListNameDirty() {
        return this._contains(DTOFIELD_SWIMLANEPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetSwimlanePSCodeListName() {
        this._reset(DTOFIELD_SWIMLANEPSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEListDTO swimlanepscodelistname(String swimlanePSCodeListName) {
        this.setSwimlanePSCodeListName(swimlanePSCodeListName);
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
    public PSDEListDTO updatedate(Timestamp updateDate) {
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
    public PSDEListDTO updateman(String updateMan) {
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
    public PSDEListDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO updatepsdeactionname(String updatePSDEActionName) {
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
    public PSDEListDTO user2psdeactionid(String user2PSDEActionId) {
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO user2psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO user2psdeactionname(String user2PSDEActionName) {
        this.setUser2PSDEActionName(user2PSDEActionName);
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
    public PSDEListDTO userpsdeactionid(String userPSDEActionId) {
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEListDTO userpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEListDTO userpsdeactionname(String userPSDEActionName) {
        this.setUserPSDEActionName(userPSDEActionName);
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
    public PSDEListDTO usertag(String userTag) {
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
    public PSDEListDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEListId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEListId(strValue);
    }

    @JsonIgnore
    public PSDEListDTO id(String strValue) {
        this.setPSDEListId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEListItemDTO> getPSDEListItems() {
        Object list = this._get(DTOFIELD_PSDELISTITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelistitems")
    public void setPSDEListItems(List<PSDEListItemDTO> psdelistitems) {
        this._set(DTOFIELD_PSDELISTITEMS, psdelistitems);
    }

    @JsonIgnore
    public List<PSDEListItemDTO> getPSDEListItemsIf() {
        Object list = this._get(DTOFIELD_PSDELISTITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELISTITEMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEListLogicDTO> getPSDEListLogics() {
        Object list = this._get(DTOFIELD_PSDELISTLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelistlogics")
    public void setPSDEListLogics(List<PSDEListLogicDTO> psdelistlogics) {
        this._set(DTOFIELD_PSDELISTLOGICS, psdelistlogics);
    }

    @JsonIgnore
    public List<PSDEListLogicDTO> getPSDEListLogicsIf() {
        Object list = this._get(DTOFIELD_PSDELISTLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELISTLOGICS, list);
        }
        return (List) list;
    }
}
