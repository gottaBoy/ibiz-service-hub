/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DataViewLayoutItemType
 *  net.ibizsys.model.PSModelEnums$DataViewStyle
 *  net.ibizsys.model.PSModelEnums$GroupTitleBarCloseMode
 *  net.ibizsys.model.PSModelEnums$MDCtrlEditMode
 *  net.ibizsys.model.PSModelEnums$MDCtrlGroupLayout
 *  net.ibizsys.model.PSModelEnums$MDCtrlGroupMode
 *  net.ibizsys.model.PSModelEnums$NavViewPos
 *  net.ibizsys.model.PSModelEnums$NavViewShowMode
 *  net.ibizsys.model.PSModelEnums$PagingMode
 *  net.ibizsys.model.PSModelEnums$PagingSize
 *  net.ibizsys.model.PSModelEnums$SortDir
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlMsgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGroupDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataViewDTO
extends PSModelDTOBase {
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
    public static final String FIELD_CARDHEIGHT = "CARDHEIGHT";
    protected static final String DTOFIELD_CARDHEIGHT = "cardheight";
    public static final String FIELD_CARDWIDTH = "CARDWIDTH";
    protected static final String DTOFIELD_CARDWIDTH = "cardwidth";
    public static final String FIELD_CARD_COL_LG = "CARD_COL_LG";
    protected static final String DTOFIELD_CARD_COL_LG = "card_col_lg";
    public static final String FIELD_CARD_COL_MD = "CARD_COL_MD";
    protected static final String DTOFIELD_CARD_COL_MD = "card_col_md";
    public static final String FIELD_CARD_COL_SM = "CARD_COL_SM";
    protected static final String DTOFIELD_CARD_COL_SM = "card_col_sm";
    public static final String FIELD_CARD_COL_XS = "CARD_COL_XS";
    protected static final String DTOFIELD_CARD_COL_XS = "card_col_xs";
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
    public static final String FIELD_DATAVIEWSN = "DATAVIEWSN";
    protected static final String DTOFIELD_DATAVIEWSN = "dataviewsn";
    public static final String FIELD_DATAVIEWSTYLE = "DATAVIEWSTYLE";
    protected static final String DTOFIELD_DATAVIEWSTYLE = "dataviewstyle";
    public static final String FIELD_DVTAG = "DVTAG";
    protected static final String DTOFIELD_DVTAG = "dvtag";
    public static final String FIELD_DVTAG2 = "DVTAG2";
    protected static final String DTOFIELD_DVTAG2 = "dvtag2";
    public static final String FIELD_DVTAG3 = "DVTAG3";
    protected static final String DTOFIELD_DVTAG3 = "dvtag3";
    public static final String FIELD_DVTAG4 = "DVTAG4";
    protected static final String DTOFIELD_DVTAG4 = "dvtag4";
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
    public static final String FIELD_GROUPHEIGHT = "GROUPHEIGHT";
    protected static final String DTOFIELD_GROUPHEIGHT = "groupheight";
    public static final String FIELD_GROUPLAYOUT = "GROUPLAYOUT";
    protected static final String DTOFIELD_GROUPLAYOUT = "grouplayout";
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
    public static final String FIELD_GROUPQUICKPSDETBID = "GROUPQUICKPSDETBID";
    protected static final String DTOFIELD_GROUPQUICKPSDETBID = "groupquickpsdetbid";
    public static final String FIELD_GROUPQUICKPSDETBNAME = "GROUPQUICKPSDETBNAME";
    protected static final String DTOFIELD_GROUPQUICKPSDETBNAME = "groupquickpsdetbname";
    public static final String FIELD_GROUPSTYLE = "GROUPSTYLE";
    protected static final String DTOFIELD_GROUPSTYLE = "groupstyle";
    public static final String FIELD_GROUPWIDTH = "GROUPWIDTH";
    protected static final String DTOFIELD_GROUPWIDTH = "groupwidth";
    public static final String FIELD_GROUP_COL_LG = "GROUP_COL_LG";
    protected static final String DTOFIELD_GROUP_COL_LG = "group_col_lg";
    public static final String FIELD_GROUP_COL_MD = "GROUP_COL_MD";
    protected static final String DTOFIELD_GROUP_COL_MD = "group_col_md";
    public static final String FIELD_GROUP_COL_SM = "GROUP_COL_SM";
    protected static final String DTOFIELD_GROUP_COL_SM = "group_col_sm";
    public static final String FIELD_GROUP_COL_XS = "GROUP_COL_XS";
    protected static final String DTOFIELD_GROUP_COL_XS = "group_col_xs";
    public static final String FIELD_ITEMPSSYSCSSID = "ITEMPSSYSCSSID";
    protected static final String DTOFIELD_ITEMPSSYSCSSID = "itempssyscssid";
    public static final String FIELD_ITEMPSSYSCSSNAME = "ITEMPSSYSCSSNAME";
    protected static final String DTOFIELD_ITEMPSSYSCSSNAME = "itempssyscssname";
    public static final String FIELD_ITEMPSSYSPFPLUGINID = "ITEMPSSYSPFPLUGINID";
    protected static final String DTOFIELD_ITEMPSSYSPFPLUGINID = "itempssyspfpluginid";
    public static final String FIELD_ITEMPSSYSPFPLUGINNAME = "ITEMPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_ITEMPSSYSPFPLUGINNAME = "itempssyspfpluginname";
    public static final String FIELD_KANBANFLAG = "KANBANFLAG";
    protected static final String DTOFIELD_KANBANFLAG = "kanbanflag";
    public static final String FIELD_LAYOUTITEMTYPE = "LAYOUTITEMTYPE";
    protected static final String DTOFIELD_LAYOUTITEMTYPE = "layoutitemtype";
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
    public static final String FIELD_PSDEDATAVIEWID = "PSDEDATAVIEWID";
    protected static final String DTOFIELD_PSDEDATAVIEWID = "psdedataviewid";
    public static final String FIELD_PSDEDATAVIEWNAME = "PSDEDATAVIEWNAME";
    protected static final String DTOFIELD_PSDEDATAVIEWNAME = "psdedataviewname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
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
    public static final String DTOFIELD_PSDELISTITEM = "psdelistitems";
    public static final String DTOFIELD_PSDEDATAVIEWLOGICS = "psdedataviewlogics";

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
    public PSDEDataViewDTO appenddeitems(Integer appendDEItems) {
        this.setAppendDEItems(appendDEItems);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO appenddeitems(Boolean appendDEItems) {
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
    public PSDEDataViewDTO asyncpsdedsid(String asyncPSDEDSId) {
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO asyncpsdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEDataViewDTO asyncpsdedsname(String asyncPSDEDSName) {
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
    public PSDEDataViewDTO batpsdetoolbarid(String batPSDEToolbarId) {
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO batpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDEDataViewDTO batpsdetoolbarname(String batPSDEToolbarName) {
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
    public PSDEDataViewDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="cardheight")
    public void setCardHeight(Integer cardHeight) {
        this._set(DTOFIELD_CARDHEIGHT, cardHeight);
    }

    @JsonIgnore
    public Integer getCardHeight() {
        Object objValue = this._get(DTOFIELD_CARDHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCardHeightDirty() {
        return this._contains(DTOFIELD_CARDHEIGHT);
    }

    @JsonIgnore
    public void resetCardHeight() {
        this._reset(DTOFIELD_CARDHEIGHT);
    }

    @JsonIgnore
    public PSDEDataViewDTO cardheight(Integer cardHeight) {
        this.setCardHeight(cardHeight);
        return this;
    }

    @JsonProperty(value="cardwidth")
    public void setCardWidth(Integer cardWidth) {
        this._set(DTOFIELD_CARDWIDTH, cardWidth);
    }

    @JsonIgnore
    public Integer getCardWidth() {
        Object objValue = this._get(DTOFIELD_CARDWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCardWidthDirty() {
        return this._contains(DTOFIELD_CARDWIDTH);
    }

    @JsonIgnore
    public void resetCardWidth() {
        this._reset(DTOFIELD_CARDWIDTH);
    }

    @JsonIgnore
    public PSDEDataViewDTO cardwidth(Integer cardWidth) {
        this.setCardWidth(cardWidth);
        return this;
    }

    @JsonProperty(value="card_col_lg")
    public void setCard_Col_LG(Integer card_Col_LG) {
        this._set(DTOFIELD_CARD_COL_LG, card_Col_LG);
    }

    @JsonIgnore
    public Integer getCard_Col_LG() {
        Object objValue = this._get(DTOFIELD_CARD_COL_LG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCard_Col_LGDirty() {
        return this._contains(DTOFIELD_CARD_COL_LG);
    }

    @JsonIgnore
    public void resetCard_Col_LG() {
        this._reset(DTOFIELD_CARD_COL_LG);
    }

    @JsonIgnore
    public PSDEDataViewDTO card_col_lg(Integer card_Col_LG) {
        this.setCard_Col_LG(card_Col_LG);
        return this;
    }

    @JsonProperty(value="card_col_md")
    public void setCard_Col_MD(Integer card_Col_MD) {
        this._set(DTOFIELD_CARD_COL_MD, card_Col_MD);
    }

    @JsonIgnore
    public Integer getCard_Col_MD() {
        Object objValue = this._get(DTOFIELD_CARD_COL_MD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCard_Col_MDDirty() {
        return this._contains(DTOFIELD_CARD_COL_MD);
    }

    @JsonIgnore
    public void resetCard_Col_MD() {
        this._reset(DTOFIELD_CARD_COL_MD);
    }

    @JsonIgnore
    public PSDEDataViewDTO card_col_md(Integer card_Col_MD) {
        this.setCard_Col_MD(card_Col_MD);
        return this;
    }

    @JsonProperty(value="card_col_sm")
    public void setCard_Col_SM(Integer card_Col_SM) {
        this._set(DTOFIELD_CARD_COL_SM, card_Col_SM);
    }

    @JsonIgnore
    public Integer getCard_Col_SM() {
        Object objValue = this._get(DTOFIELD_CARD_COL_SM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCard_Col_SMDirty() {
        return this._contains(DTOFIELD_CARD_COL_SM);
    }

    @JsonIgnore
    public void resetCard_Col_SM() {
        this._reset(DTOFIELD_CARD_COL_SM);
    }

    @JsonIgnore
    public PSDEDataViewDTO card_col_sm(Integer card_Col_SM) {
        this.setCard_Col_SM(card_Col_SM);
        return this;
    }

    @JsonProperty(value="card_col_xs")
    public void setCard_Col_XS(Integer card_Col_XS) {
        this._set(DTOFIELD_CARD_COL_XS, card_Col_XS);
    }

    @JsonIgnore
    public Integer getCard_Col_XS() {
        Object objValue = this._get(DTOFIELD_CARD_COL_XS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCard_Col_XSDirty() {
        return this._contains(DTOFIELD_CARD_COL_XS);
    }

    @JsonIgnore
    public void resetCard_Col_XS() {
        this._reset(DTOFIELD_CARD_COL_XS);
    }

    @JsonIgnore
    public PSDEDataViewDTO card_col_xs(Integer card_Col_XS) {
        this.setCard_Col_XS(card_Col_XS);
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
    public PSDEDataViewDTO codename(String codeName) {
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
    public PSDEDataViewDTO copypsdeactionid(String copyPSDEActionId) {
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO copypsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO copypsdeactionname(String copyPSDEActionName) {
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
    public PSDEDataViewDTO createdate(Timestamp createDate) {
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
    public PSDEDataViewDTO createman(String createMan) {
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
    public PSDEDataViewDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO createpsdeactionname(String createPSDEActionName) {
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
    public PSDEDataViewDTO customcond(String customCond) {
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
    public PSDEDataViewDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="dataviewsn")
    public void setDataViewSN(String dataViewSN) {
        this._set(DTOFIELD_DATAVIEWSN, dataViewSN);
    }

    @JsonIgnore
    public String getDataViewSN() {
        Object objValue = this._get(DTOFIELD_DATAVIEWSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataViewSNDirty() {
        return this._contains(DTOFIELD_DATAVIEWSN);
    }

    @JsonIgnore
    public void resetDataViewSN() {
        this._reset(DTOFIELD_DATAVIEWSN);
    }

    @JsonIgnore
    public PSDEDataViewDTO dataviewsn(String dataViewSN) {
        this.setDataViewSN(dataViewSN);
        return this;
    }

    @JsonProperty(value="dataviewstyle")
    public void setDataViewStyle(String dataViewStyle) {
        this._set(DTOFIELD_DATAVIEWSTYLE, dataViewStyle);
    }

    @JsonIgnore
    public String getDataViewStyle() {
        Object objValue = this._get(DTOFIELD_DATAVIEWSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataViewStyleDirty() {
        return this._contains(DTOFIELD_DATAVIEWSTYLE);
    }

    @JsonIgnore
    public void resetDataViewStyle() {
        this._reset(DTOFIELD_DATAVIEWSTYLE);
    }

    @JsonIgnore
    public PSDEDataViewDTO dataviewstyle(String dataViewStyle) {
        this.setDataViewStyle(dataViewStyle);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO dataviewstyle(PSModelEnums.DataViewStyle dataViewStyle) {
        if (dataViewStyle == null) {
            this.setDataViewStyle(null);
        } else {
            this.setDataViewStyle(dataViewStyle.value);
        }
        return this;
    }

    @JsonProperty(value="dvtag")
    public void setDVTag(String dVTag) {
        this._set(DTOFIELD_DVTAG, dVTag);
    }

    @JsonIgnore
    public String getDVTag() {
        Object objValue = this._get(DTOFIELD_DVTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDVTagDirty() {
        return this._contains(DTOFIELD_DVTAG);
    }

    @JsonIgnore
    public void resetDVTag() {
        this._reset(DTOFIELD_DVTAG);
    }

    @JsonIgnore
    public PSDEDataViewDTO dvtag(String dVTag) {
        this.setDVTag(dVTag);
        return this;
    }

    @JsonProperty(value="dvtag2")
    public void setDVTag2(String dVTag2) {
        this._set(DTOFIELD_DVTAG2, dVTag2);
    }

    @JsonIgnore
    public String getDVTag2() {
        Object objValue = this._get(DTOFIELD_DVTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDVTag2Dirty() {
        return this._contains(DTOFIELD_DVTAG2);
    }

    @JsonIgnore
    public void resetDVTag2() {
        this._reset(DTOFIELD_DVTAG2);
    }

    @JsonIgnore
    public PSDEDataViewDTO dvtag2(String dVTag2) {
        this.setDVTag2(dVTag2);
        return this;
    }

    @JsonProperty(value="dvtag3")
    public void setDVTag3(String dVTag3) {
        this._set(DTOFIELD_DVTAG3, dVTag3);
    }

    @JsonIgnore
    public String getDVTag3() {
        Object objValue = this._get(DTOFIELD_DVTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDVTag3Dirty() {
        return this._contains(DTOFIELD_DVTAG3);
    }

    @JsonIgnore
    public void resetDVTag3() {
        this._reset(DTOFIELD_DVTAG3);
    }

    @JsonIgnore
    public PSDEDataViewDTO dvtag3(String dVTag3) {
        this.setDVTag3(dVTag3);
        return this;
    }

    @JsonProperty(value="dvtag4")
    public void setDVTag4(String dVTag4) {
        this._set(DTOFIELD_DVTAG4, dVTag4);
    }

    @JsonIgnore
    public String getDVTag4() {
        Object objValue = this._get(DTOFIELD_DVTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDVTag4Dirty() {
        return this._contains(DTOFIELD_DVTAG4);
    }

    @JsonIgnore
    public void resetDVTag4() {
        this._reset(DTOFIELD_DVTAG4);
    }

    @JsonIgnore
    public PSDEDataViewDTO dvtag4(String dVTag4) {
        this.setDVTag4(dVTag4);
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
    public PSDEDataViewDTO emptytext(String emptyText) {
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
    public PSDEDataViewDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEDataViewDTO emptytextpslanresname(String emptyTextPSLanResName) {
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
    public PSDEDataViewDTO enableedit(Integer enableEdit) {
        this.setEnableEdit(enableEdit);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO enableedit(PSModelEnums.MDCtrlEditMode[] enableEdit) {
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
    public PSDEDataViewDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO enableitempriv(Boolean enableItemPriv) {
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
    public PSDEDataViewDTO enablepagingbar(Integer enablePagingBar) {
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO enablepagingbar(PSModelEnums.PagingMode enablePagingBar) {
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
    public PSDEDataViewDTO getdraftpsdeactionid(String getDraftPSDEActionId) {
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO getdraftpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO getdraftpsdeactionname(String getDraftPSDEActionName) {
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
    public PSDEDataViewDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO getpsdeactionname(String getPSDEActionName) {
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
    public PSDEDataViewDTO groupbarclosemode(Integer groupBarCloseMode) {
        this.setGroupBarCloseMode(groupBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO groupbarclosemode(PSModelEnums.GroupTitleBarCloseMode groupBarCloseMode) {
        if (groupBarCloseMode == null) {
            this.setGroupBarCloseMode(null);
        } else {
            this.setGroupBarCloseMode(groupBarCloseMode.value);
        }
        return this;
    }

    @JsonProperty(value="groupheight")
    public void setGroupHeight(Integer groupHeight) {
        this._set(DTOFIELD_GROUPHEIGHT, groupHeight);
    }

    @JsonIgnore
    public Integer getGroupHeight() {
        Object objValue = this._get(DTOFIELD_GROUPHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupHeightDirty() {
        return this._contains(DTOFIELD_GROUPHEIGHT);
    }

    @JsonIgnore
    public void resetGroupHeight() {
        this._reset(DTOFIELD_GROUPHEIGHT);
    }

    @JsonIgnore
    public PSDEDataViewDTO groupheight(Integer groupHeight) {
        this.setGroupHeight(groupHeight);
        return this;
    }

    @JsonProperty(value="grouplayout")
    public void setGroupLayout(String groupLayout) {
        this._set(DTOFIELD_GROUPLAYOUT, groupLayout);
    }

    @JsonIgnore
    public String getGroupLayout() {
        Object objValue = this._get(DTOFIELD_GROUPLAYOUT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupLayoutDirty() {
        return this._contains(DTOFIELD_GROUPLAYOUT);
    }

    @JsonIgnore
    public void resetGroupLayout() {
        this._reset(DTOFIELD_GROUPLAYOUT);
    }

    @JsonIgnore
    public PSDEDataViewDTO grouplayout(String groupLayout) {
        this.setGroupLayout(groupLayout);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouplayout(PSModelEnums.MDCtrlGroupLayout groupLayout) {
        if (groupLayout == null) {
            this.setGroupLayout(null);
        } else {
            this.setGroupLayout(groupLayout.value);
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
    public PSDEDataViewDTO groupmode(String groupMode) {
        this.setGroupMode(groupMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO groupmode(PSModelEnums.MDCtrlGroupMode groupMode) {
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
    public PSDEDataViewDTO groupmovepsdeactionid(String groupMovePSDEActionId) {
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO groupmovepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO groupmovepsdeactionname(String groupMovePSDEActionName) {
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
    public PSDEDataViewDTO grouppscodelistid(String groupPSCodeListId) {
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEDataViewDTO grouppscodelistname(String groupPSCodeListName) {
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
    public PSDEDataViewDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEDataViewDTO grouppsdefname(String groupPSDEFName) {
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
    public PSDEDataViewDTO grouppsdeid(String groupPSDEId) {
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDataViewDTO grouppsdename(String groupPSDEName) {
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
    public PSDEDataViewDTO grouppsdeuagroupid(String groupPSDEUAGroupId) {
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEDataViewDTO grouppsdeuagroupname(String groupPSDEUAGroupName) {
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
    public PSDEDataViewDTO grouppssyscssid(String groupPSSysCssId) {
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEDataViewDTO grouppssyscssname(String groupPSSysCssName) {
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
    public PSDEDataViewDTO grouppssyspfpluginid(String groupPSSysPFPluginId) {
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO grouppssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEDataViewDTO grouppssyspfpluginname(String groupPSSysPFPluginName) {
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="groupquickpsdetbid")
    public void setGroupQuickPSDETBId(String groupQuickPSDETBId) {
        this._set(DTOFIELD_GROUPQUICKPSDETBID, groupQuickPSDETBId);
    }

    @JsonIgnore
    public String getGroupQuickPSDETBId() {
        Object objValue = this._get(DTOFIELD_GROUPQUICKPSDETBID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupQuickPSDETBIdDirty() {
        return this._contains(DTOFIELD_GROUPQUICKPSDETBID);
    }

    @JsonIgnore
    public void resetGroupQuickPSDETBId() {
        this._reset(DTOFIELD_GROUPQUICKPSDETBID);
    }

    @JsonIgnore
    public PSDEDataViewDTO groupquickpsdetbid(String groupQuickPSDETBId) {
        this.setGroupQuickPSDETBId(groupQuickPSDETBId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO groupquickpsdetbid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setGroupQuickPSDETBId(null);
            this.setGroupQuickPSDETBName(null);
        } else {
            this.setGroupQuickPSDETBId(pSDEToolbar.getPSDEToolbarId());
            this.setGroupQuickPSDETBName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="groupquickpsdetbname")
    public void setGroupQuickPSDETBName(String groupQuickPSDETBName) {
        this._set(DTOFIELD_GROUPQUICKPSDETBNAME, groupQuickPSDETBName);
    }

    @JsonIgnore
    public String getGroupQuickPSDETBName() {
        Object objValue = this._get(DTOFIELD_GROUPQUICKPSDETBNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupQuickPSDETBNameDirty() {
        return this._contains(DTOFIELD_GROUPQUICKPSDETBNAME);
    }

    @JsonIgnore
    public void resetGroupQuickPSDETBName() {
        this._reset(DTOFIELD_GROUPQUICKPSDETBNAME);
    }

    @JsonIgnore
    public PSDEDataViewDTO groupquickpsdetbname(String groupQuickPSDETBName) {
        this.setGroupQuickPSDETBName(groupQuickPSDETBName);
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
    public PSDEDataViewDTO groupstyle(String groupStyle) {
        this.setGroupStyle(groupStyle);
        return this;
    }

    @JsonProperty(value="groupwidth")
    public void setGroupWidth(Integer groupWidth) {
        this._set(DTOFIELD_GROUPWIDTH, groupWidth);
    }

    @JsonIgnore
    public Integer getGroupWidth() {
        Object objValue = this._get(DTOFIELD_GROUPWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupWidthDirty() {
        return this._contains(DTOFIELD_GROUPWIDTH);
    }

    @JsonIgnore
    public void resetGroupWidth() {
        this._reset(DTOFIELD_GROUPWIDTH);
    }

    @JsonIgnore
    public PSDEDataViewDTO groupwidth(Integer groupWidth) {
        this.setGroupWidth(groupWidth);
        return this;
    }

    @JsonProperty(value="group_col_lg")
    public void setGroup_Col_LG(Integer group_Col_LG) {
        this._set(DTOFIELD_GROUP_COL_LG, group_Col_LG);
    }

    @JsonIgnore
    public Integer getGroup_Col_LG() {
        Object objValue = this._get(DTOFIELD_GROUP_COL_LG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroup_Col_LGDirty() {
        return this._contains(DTOFIELD_GROUP_COL_LG);
    }

    @JsonIgnore
    public void resetGroup_Col_LG() {
        this._reset(DTOFIELD_GROUP_COL_LG);
    }

    @JsonIgnore
    public PSDEDataViewDTO group_col_lg(Integer group_Col_LG) {
        this.setGroup_Col_LG(group_Col_LG);
        return this;
    }

    @JsonProperty(value="group_col_md")
    public void setGroup_Col_MD(Integer group_Col_MD) {
        this._set(DTOFIELD_GROUP_COL_MD, group_Col_MD);
    }

    @JsonIgnore
    public Integer getGroup_Col_MD() {
        Object objValue = this._get(DTOFIELD_GROUP_COL_MD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroup_Col_MDDirty() {
        return this._contains(DTOFIELD_GROUP_COL_MD);
    }

    @JsonIgnore
    public void resetGroup_Col_MD() {
        this._reset(DTOFIELD_GROUP_COL_MD);
    }

    @JsonIgnore
    public PSDEDataViewDTO group_col_md(Integer group_Col_MD) {
        this.setGroup_Col_MD(group_Col_MD);
        return this;
    }

    @JsonProperty(value="group_col_sm")
    public void setGroup_Col_SM(Integer group_Col_SM) {
        this._set(DTOFIELD_GROUP_COL_SM, group_Col_SM);
    }

    @JsonIgnore
    public Integer getGroup_Col_SM() {
        Object objValue = this._get(DTOFIELD_GROUP_COL_SM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroup_Col_SMDirty() {
        return this._contains(DTOFIELD_GROUP_COL_SM);
    }

    @JsonIgnore
    public void resetGroup_Col_SM() {
        this._reset(DTOFIELD_GROUP_COL_SM);
    }

    @JsonIgnore
    public PSDEDataViewDTO group_col_sm(Integer group_Col_SM) {
        this.setGroup_Col_SM(group_Col_SM);
        return this;
    }

    @JsonProperty(value="group_col_xs")
    public void setGroup_Col_XS(Integer group_Col_XS) {
        this._set(DTOFIELD_GROUP_COL_XS, group_Col_XS);
    }

    @JsonIgnore
    public Integer getGroup_Col_XS() {
        Object objValue = this._get(DTOFIELD_GROUP_COL_XS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroup_Col_XSDirty() {
        return this._contains(DTOFIELD_GROUP_COL_XS);
    }

    @JsonIgnore
    public void resetGroup_Col_XS() {
        this._reset(DTOFIELD_GROUP_COL_XS);
    }

    @JsonIgnore
    public PSDEDataViewDTO group_col_xs(Integer group_Col_XS) {
        this.setGroup_Col_XS(group_Col_XS);
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
    public PSDEDataViewDTO itempssyscssid(String itemPSSysCssId) {
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO itempssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEDataViewDTO itempssyscssname(String itemPSSysCssName) {
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
    public PSDEDataViewDTO itempssyspfpluginid(String itemPSSysPFPluginId) {
        this.setItemPSSysPFPluginId(itemPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO itempssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEDataViewDTO itempssyspfpluginname(String itemPSSysPFPluginName) {
        this.setItemPSSysPFPluginName(itemPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="kanbanflag")
    public void setKanbanFlag(Integer kanbanFlag) {
        this._set(DTOFIELD_KANBANFLAG, kanbanFlag);
    }

    @JsonIgnore
    public Integer getKanbanFlag() {
        Object objValue = this._get(DTOFIELD_KANBANFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isKanbanFlagDirty() {
        return this._contains(DTOFIELD_KANBANFLAG);
    }

    @JsonIgnore
    public void resetKanbanFlag() {
        this._reset(DTOFIELD_KANBANFLAG);
    }

    @JsonIgnore
    public PSDEDataViewDTO kanbanflag(Integer kanbanFlag) {
        this.setKanbanFlag(kanbanFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO kanbanflag(Boolean kanbanFlag) {
        if (kanbanFlag == null) {
            this.setKanbanFlag(null);
        } else {
            this.setKanbanFlag(kanbanFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="layoutitemtype")
    public void setLayoutItemType(String layoutItemType) {
        this._set(DTOFIELD_LAYOUTITEMTYPE, layoutItemType);
    }

    @JsonIgnore
    public String getLayoutItemType() {
        Object objValue = this._get(DTOFIELD_LAYOUTITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutItemTypeDirty() {
        return this._contains(DTOFIELD_LAYOUTITEMTYPE);
    }

    @JsonIgnore
    public void resetLayoutItemType() {
        this._reset(DTOFIELD_LAYOUTITEMTYPE);
    }

    @JsonIgnore
    public PSDEDataViewDTO layoutitemtype(String layoutItemType) {
        this.setLayoutItemType(layoutItemType);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO layoutitemtype(PSModelEnums.DataViewLayoutItemType layoutItemType) {
        if (layoutItemType == null) {
            this.setLayoutItemType(null);
        } else {
            this.setLayoutItemType(layoutItemType.value);
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
    public PSDEDataViewDTO memo(String memo) {
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
    public PSDEDataViewDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
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
    public PSDEDataViewDTO minorsortpsdefid(String minorSortPSDEFId) {
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO minorsortpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEDataViewDTO minorsortpsdefname(String minorSortPSDEFName) {
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
    public PSDEDataViewDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO movepsdeactionname(String movePSDEActionName) {
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
    public PSDEDataViewDTO multiselect(Integer multiSelect) {
        this.setMultiSelect(multiSelect);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO multiselect(Boolean multiSelect) {
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
    public PSDEDataViewDTO navpsderid(String navPSDERId) {
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO navpsderid(PSDERDTO pSDER) {
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
    public PSDEDataViewDTO navpsdername(String navPSDERName) {
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
    public PSDEDataViewDTO navpsdeviewbaseid(String navPSDEViewBaseId) {
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO navpsdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEDataViewDTO navpsdeviewbasename(String navPSDEViewBaseName) {
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
    public PSDEDataViewDTO navviewfilter(String navViewFilter) {
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
    public PSDEDataViewDTO navviewheight(Double navViewHeight) {
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
    public PSDEDataViewDTO navviewmaxheight(Double navViewMaxHeight) {
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
    public PSDEDataViewDTO navviewmaxwidth(Double navViewMaxWidth) {
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
    public PSDEDataViewDTO navviewminheight(Double navViewMinHeight) {
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
    public PSDEDataViewDTO navviewminwidth(Double navViewMinWidth) {
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
    public PSDEDataViewDTO navviewparam(String navViewParam) {
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
    public PSDEDataViewDTO navviewpos(String navViewPos) {
        this.setNavViewPos(navViewPos);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO navviewpos(PSModelEnums.NavViewPos navViewPos) {
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
    public PSDEDataViewDTO navviewshowmode(Integer navViewShowMode) {
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO navviewshowmode(PSModelEnums.NavViewShowMode navViewShowMode) {
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
    public PSDEDataViewDTO navviewwidth(Double navViewWidth) {
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
    public PSDEDataViewDTO no2psdeuagroupid(String no2PSDEUAGroupId) {
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEDataViewDTO no2psdeuagroupname(String no2PSDEUAGroupName) {
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
    public PSDEDataViewDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO nosort(Boolean noSort) {
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
    public PSDEDataViewDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEDataViewDTO ordervaluepsdefname(String orderValuePSDEFName) {
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
    public PSDEDataViewDTO pagingsize(Integer pagingSize) {
        this.setPagingSize(pagingSize);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO pagingsize(PSModelEnums.PagingSize pagingSize) {
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
    public PSDEDataViewDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSDEDataViewDTO psachandlername(String pSACHandlerName) {
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
    public PSDEDataViewDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDEDataViewDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSDEDataViewDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
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
    public PSDEDataViewDTO psctrlmsgname(String pSCtrlMsgName) {
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
    public PSDEDataViewDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEDataViewDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonProperty(value="psdedataviewid")
    public void setPSDEDataViewId(String pSDEDataViewId) {
        this._set(DTOFIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }

    @JsonIgnore
    public String getPSDEDataViewId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public void resetPSDEDataViewId() {
        this._reset(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public PSDEDataViewDTO psdedataviewid(String pSDEDataViewId) {
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    @JsonProperty(value="psdedataviewname")
    public void setPSDEDataViewName(String pSDEDataViewName) {
        this._set(DTOFIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }

    @JsonIgnore
    public String getPSDEDataViewName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDEDataViewName() {
        this._reset(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public PSDEDataViewDTO psdedataviewname(String pSDEDataViewName) {
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataViewName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataViewName(strName);
    }

    @JsonIgnore
    public PSDEDataViewDTO name(String strName) {
        this.setPSDEDataViewName(strName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSDEDataViewDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEDataViewDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSDEDataViewDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDataViewDTO psdename(String pSDEName) {
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
    public PSDEDataViewDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEDataViewDTO psdeuagroupname(String pSDEUAGroupName) {
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
    public PSDEDataViewDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEDataViewDTO pssyscssname(String pSSysCssName) {
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
    public PSDEDataViewDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEDataViewDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEDataViewDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSDEDataViewDTO pssysviewpanelname(String pSSysViewPanelName) {
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
    public PSDEDataViewDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSDEDataViewDTO psviewmsggroupname(String pSViewMsgGroupName) {
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
    public PSDEDataViewDTO quickpsdetoolbarid(String quickPSDEToolbarId) {
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO quickpsdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDEDataViewDTO quickpsdetoolbarname(String quickPSDEToolbarName) {
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
    public PSDEDataViewDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
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
    public PSDEDataViewDTO swimlanepscodelistid(String swimlanePSCodeListId) {
        this.setSwimlanePSCodeListId(swimlanePSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO swimlanepscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEDataViewDTO swimlanepscodelistname(String swimlanePSCodeListName) {
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
    public PSDEDataViewDTO updatedate(Timestamp updateDate) {
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
    public PSDEDataViewDTO updateman(String updateMan) {
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
    public PSDEDataViewDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO updatepsdeactionname(String updatePSDEActionName) {
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
    public PSDEDataViewDTO user2psdeactionid(String user2PSDEActionId) {
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO user2psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO user2psdeactionname(String user2PSDEActionName) {
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
    public PSDEDataViewDTO userpsdeactionid(String userPSDEActionId) {
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataViewDTO userpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDataViewDTO userpsdeactionname(String userPSDEActionName) {
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataViewId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataViewId(strValue);
    }

    @JsonIgnore
    public PSDEDataViewDTO id(String strValue) {
        this.setPSDEDataViewId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEListItemDTO> getPSDEListItem() {
        Object list = this._get(DTOFIELD_PSDELISTITEM);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelistitems")
    public void setPSDEListItem(List<PSDEListItemDTO> psdelistitems) {
        this._set(DTOFIELD_PSDELISTITEM, psdelistitems);
    }

    @JsonIgnore
    public List<PSDEListItemDTO> getPSDEListItemIf() {
        Object list = this._get(DTOFIELD_PSDELISTITEM);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELISTITEM, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEDataViewLogicDTO> getPSDEDataViewLogics() {
        Object list = this._get(DTOFIELD_PSDEDATAVIEWLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedataviewlogics")
    public void setPSDEDataViewLogics(List<PSDEDataViewLogicDTO> psdedataviewlogics) {
        this._set(DTOFIELD_PSDEDATAVIEWLOGICS, psdedataviewlogics);
    }

    @JsonIgnore
    public List<PSDEDataViewLogicDTO> getPSDEDataViewLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEDATAVIEWLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDATAVIEWLOGICS, list);
        }
        return (List) list;
    }
}
