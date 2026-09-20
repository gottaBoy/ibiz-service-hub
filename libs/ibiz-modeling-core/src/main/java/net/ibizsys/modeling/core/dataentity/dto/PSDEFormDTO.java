package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFormDTO
extends PSModelDTOBase {
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
    public static final String FIELD_DATATYPE = "DATATYPE";
    protected static final String DTOFIELD_DATATYPE = "datatype";
    public static final String FIELD_DETAILSTYLE = "DETAILSTYLE";
    protected static final String DTOFIELD_DETAILSTYLE = "detailstyle";
    public static final String FIELD_ENABLEADVSEARCH = "ENABLEADVSEARCH";
    protected static final String DTOFIELD_ENABLEADVSEARCH = "enableadvsearch";
    public static final String FIELD_ENABLEAUTOSAVE = "ENABLEAUTOSAVE";
    protected static final String DTOFIELD_ENABLEAUTOSAVE = "enableautosave";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZED";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_ENABLEFILTERSAVE = "ENABLEFILTERSAVE";
    protected static final String DTOFIELD_ENABLEFILTERSAVE = "enablefiltersave";
    public static final String FIELD_ENABLEITEMFILTER = "ENABLEITEMFILTER";
    protected static final String DTOFIELD_ENABLEITEMFILTER = "enableitemfilter";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_FORMITEMSTYLE = "FORMITEMSTYLE";
    protected static final String DTOFIELD_FORMITEMSTYLE = "formitemstyle";
    public static final String FIELD_FORMNAVBAR = "FORMNAVBAR";
    protected static final String DTOFIELD_FORMNAVBAR = "formnavbar";
    public static final String FIELD_FORMSN = "FORMSN";
    protected static final String DTOFIELD_FORMSN = "formsn";
    public static final String FIELD_FORMSTYLE = "FORMSTYLE";
    protected static final String DTOFIELD_FORMSTYLE = "formstyle";
    public static final String FIELD_FORMTAG = "FORMTAG";
    protected static final String DTOFIELD_FORMTAG = "formtag";
    public static final String FIELD_FORMTAG2 = "FORMTAG2";
    protected static final String DTOFIELD_FORMTAG2 = "formtag2";
    public static final String FIELD_FORMTAG3 = "FORMTAG3";
    protected static final String DTOFIELD_FORMTAG3 = "formtag3";
    public static final String FIELD_FORMTAG4 = "FORMTAG4";
    protected static final String DTOFIELD_FORMTAG4 = "formtag4";
    public static final String FIELD_FORMTYPE = "FORMTYPE";
    protected static final String DTOFIELD_FORMTYPE = "formtype";
    public static final String FIELD_FORMWIDTH = "FORMWIDTH";
    protected static final String DTOFIELD_FORMWIDTH = "formwidth";
    public static final String FIELD_FUNCMODE = "FUNCMODE";
    protected static final String DTOFIELD_FUNCMODE = "funcmode";
    public static final String FIELD_GETDRAFTPSDEACTIONID = "GETDRAFTPSDEACTIONID";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";
    public static final String FIELD_GETDRAFTPSDEACTIONNAME = "GETDRAFTPSDEACTIONNAME";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";
    public static final String FIELD_GETPSDEACTIONID = "GETPSDEACTIONID";
    protected static final String DTOFIELD_GETPSDEACTIONID = "getpsdeactionid";
    public static final String FIELD_GETPSDEACTIONNAME = "GETPSDEACTIONNAME";
    protected static final String DTOFIELD_GETPSDEACTIONNAME = "getpsdeactionname";
    public static final String FIELD_INFOFORMFLAG = "INFOFORMFLAG";
    protected static final String DTOFIELD_INFOFORMFLAG = "infoformflag";
    public static final String FIELD_LABELWIDTH = "LABELWIDTH";
    protected static final String DTOFIELD_LABELWIDTH = "labelwidth";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_NAVBARHEIGHT = "NAVBARHEIGHT";
    protected static final String DTOFIELD_NAVBARHEIGHT = "navbarheight";
    public static final String FIELD_NAVBARPOS = "NAVBARPOS";
    protected static final String DTOFIELD_NAVBARPOS = "navbarpos";
    public static final String FIELD_NAVBARPSSYSCSSID = "NAVBARPSSYSCSSID";
    protected static final String DTOFIELD_NAVBARPSSYSCSSID = "navbarpssyscssid";
    public static final String FIELD_NAVBARPSSYSCSSNAME = "NAVBARPSSYSCSSNAME";
    protected static final String DTOFIELD_NAVBARPSSYSCSSNAME = "navbarpssyscssname";
    public static final String FIELD_NAVBARSTYLE = "NAVBARSTYLE";
    protected static final String DTOFIELD_NAVBARSTYLE = "navbarstyle";
    public static final String FIELD_NAVBARWIDTH = "NAVBARWIDTH";
    protected static final String DTOFIELD_NAVBARWIDTH = "navbarwidth";
    public static final String FIELD_PDVTPARAM = "PDVTPARAM";
    protected static final String DTOFIELD_PDVTPARAM = "pdvtparam";
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
    public static final String FIELD_PSDEFINPUTTIPSETID = "PSDEFINPUTTIPSETID";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";
    public static final String FIELD_PSDEFINPUTTIPSETNAME = "PSDEFINPUTTIPSETNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDYNAINSTNAME = "PSDYNAINSTNAME";
    protected static final String DTOFIELD_PSDYNAINSTNAME = "psdynainstname";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
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
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
    public static final String FIELD_PSWFDENAME = "PSWFDENAME";
    protected static final String DTOFIELD_PSWFDENAME = "pswfdename";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_SEARCHBTNPOS = "SEARCHBTNPOS";
    protected static final String DTOFIELD_SEARCHBTNPOS = "searchbtnpos";
    public static final String FIELD_SEARCHBTNSTYLE = "SEARCHBTNSTYLE";
    protected static final String DTOFIELD_SEARCHBTNSTYLE = "searchbtnstyle";
    public static final String FIELD_SHOWTABHEADER = "SHOWTABHEADER";
    protected static final String DTOFIELD_SHOWTABHEADER = "showtabheader";
    public static final String FIELD_TABHEADERPOS = "TABHEADERPOS";
    protected static final String DTOFIELD_TABHEADERPOS = "tabheaderpos";
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
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String DTOFIELD_PSDEFORMDETAILS = "psdeformdetails";
    public static final String DTOFIELD_PSDEFORMRVES = "psdeformrves";
    public static final String DTOFIELD_PSDEFIUPDATES = "psdefiupdates";
    public static final String DTOFIELD_PSDEFIVRS = "psdefivrs";
    public static final String DTOFIELD_PSDEFORMLOGICS = "psdeformlogics";

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
    public PSDEFormDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO busyindicator(Boolean busyIndicator) {
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
    public PSDEFormDTO codename(String codeName) {
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
    public PSDEFormDTO copypsdeactionid(String copyPSDEActionId) {
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO copypsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO copypsdeactionname(String copyPSDEActionName) {
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
    public PSDEFormDTO createdate(Timestamp createDate) {
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
    public PSDEFormDTO createman(String createMan) {
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
    public PSDEFormDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO createpsdeactionname(String createPSDEActionName) {
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    @JsonProperty(value="datatype")
    public void setDataType(String dataType) {
        this._set(DTOFIELD_DATATYPE, dataType);
    }

    @JsonIgnore
    public String getDataType() {
        Object objValue = this._get(DTOFIELD_DATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypeDirty() {
        return this._contains(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public void resetDataType() {
        this._reset(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public PSDEFormDTO datatype(String dataType) {
        this.setDataType(dataType);
        return this;
    }

    @JsonProperty(value="detailstyle")
    public void setDetailStyle(String detailStyle) {
        this._set(DTOFIELD_DETAILSTYLE, detailStyle);
    }

    @JsonIgnore
    public String getDetailStyle() {
        Object objValue = this._get(DTOFIELD_DETAILSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailStyleDirty() {
        return this._contains(DTOFIELD_DETAILSTYLE);
    }

    @JsonIgnore
    public void resetDetailStyle() {
        this._reset(DTOFIELD_DETAILSTYLE);
    }

    @JsonIgnore
    public PSDEFormDTO detailstyle(String detailStyle) {
        this.setDetailStyle(detailStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO detailstyle(PSModelEnums.CtrlDetailStyle detailStyle) {
        if (detailStyle == null) {
            this.setDetailStyle(null);
        } else {
            this.setDetailStyle(detailStyle.value);
        }
        return this;
    }

    @JsonProperty(value="enableadvsearch")
    public void setEnableAdvSearch(Integer enableAdvSearch) {
        this._set(DTOFIELD_ENABLEADVSEARCH, enableAdvSearch);
    }

    @JsonIgnore
    public Integer getEnableAdvSearch() {
        Object objValue = this._get(DTOFIELD_ENABLEADVSEARCH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAdvSearchDirty() {
        return this._contains(DTOFIELD_ENABLEADVSEARCH);
    }

    @JsonIgnore
    public void resetEnableAdvSearch() {
        this._reset(DTOFIELD_ENABLEADVSEARCH);
    }

    @JsonIgnore
    public PSDEFormDTO enableadvsearch(Integer enableAdvSearch) {
        this.setEnableAdvSearch(enableAdvSearch);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enableadvsearch(Boolean enableAdvSearch) {
        if (enableAdvSearch == null) {
            this.setEnableAdvSearch(null);
        } else {
            this.setEnableAdvSearch(enableAdvSearch != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableautosave")
    public void setEnableAutoSave(Integer enableAutoSave) {
        this._set(DTOFIELD_ENABLEAUTOSAVE, enableAutoSave);
    }

    @JsonIgnore
    public Integer getEnableAutoSave() {
        Object objValue = this._get(DTOFIELD_ENABLEAUTOSAVE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAutoSaveDirty() {
        return this._contains(DTOFIELD_ENABLEAUTOSAVE);
    }

    @JsonIgnore
    public void resetEnableAutoSave() {
        this._reset(DTOFIELD_ENABLEAUTOSAVE);
    }

    @JsonIgnore
    public PSDEFormDTO enableautosave(Integer enableAutoSave) {
        this.setEnableAutoSave(enableAutoSave);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enableautosave(PSModelEnums.FormAutoSaveMode enableAutoSave) {
        if (enableAutoSave == null) {
            this.setEnableAutoSave(null);
        } else {
            this.setEnableAutoSave(enableAutoSave.value);
        }
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
    public PSDEFormDTO enablecustomized(Integer enableCustomized) {
        this.setEnableCustomized(enableCustomized);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enablecustomized(Boolean enableCustomized) {
        if (enableCustomized == null) {
            this.setEnableCustomized(null);
        } else {
            this.setEnableCustomized(enableCustomized != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablefiltersave")
    public void setEnableFilterSave(Integer enableFilterSave) {
        this._set(DTOFIELD_ENABLEFILTERSAVE, enableFilterSave);
    }

    @JsonIgnore
    public Integer getEnableFilterSave() {
        Object objValue = this._get(DTOFIELD_ENABLEFILTERSAVE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableFilterSaveDirty() {
        return this._contains(DTOFIELD_ENABLEFILTERSAVE);
    }

    @JsonIgnore
    public void resetEnableFilterSave() {
        this._reset(DTOFIELD_ENABLEFILTERSAVE);
    }

    @JsonIgnore
    public PSDEFormDTO enablefiltersave(Integer enableFilterSave) {
        this.setEnableFilterSave(enableFilterSave);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enablefiltersave(Boolean enableFilterSave) {
        if (enableFilterSave == null) {
            this.setEnableFilterSave(null);
        } else {
            this.setEnableFilterSave(enableFilterSave != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableitemfilter")
    public void setEnableItemFilter(Integer enableItemFilter) {
        this._set(DTOFIELD_ENABLEITEMFILTER, enableItemFilter);
    }

    @JsonIgnore
    public Integer getEnableItemFilter() {
        Object objValue = this._get(DTOFIELD_ENABLEITEMFILTER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableItemFilterDirty() {
        return this._contains(DTOFIELD_ENABLEITEMFILTER);
    }

    @JsonIgnore
    public void resetEnableItemFilter() {
        this._reset(DTOFIELD_ENABLEITEMFILTER);
    }

    @JsonIgnore
    public PSDEFormDTO enableitemfilter(Integer enableItemFilter) {
        this.setEnableItemFilter(enableItemFilter);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enableitemfilter(Boolean enableItemFilter) {
        if (enableItemFilter == null) {
            this.setEnableItemFilter(null);
        } else {
            this.setEnableItemFilter(enableItemFilter != false ? 1 : 0);
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
    public PSDEFormDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formitemstyle")
    public void setFormItemStyle(String formItemStyle) {
        this._set(DTOFIELD_FORMITEMSTYLE, formItemStyle);
    }

    @JsonIgnore
    public String getFormItemStyle() {
        Object objValue = this._get(DTOFIELD_FORMITEMSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormItemStyleDirty() {
        return this._contains(DTOFIELD_FORMITEMSTYLE);
    }

    @JsonIgnore
    public void resetFormItemStyle() {
        this._reset(DTOFIELD_FORMITEMSTYLE);
    }

    @JsonIgnore
    public PSDEFormDTO formitemstyle(String formItemStyle) {
        this.setFormItemStyle(formItemStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO formitemstyle(PSModelEnums.CtrlDetailStyle formItemStyle) {
        if (formItemStyle == null) {
            this.setFormItemStyle(null);
        } else {
            this.setFormItemStyle(formItemStyle.value);
        }
        return this;
    }

    @JsonProperty(value="formnavbar")
    public void setFormNavBar(Integer formNavBar) {
        this._set(DTOFIELD_FORMNAVBAR, formNavBar);
    }

    @JsonIgnore
    public Integer getFormNavBar() {
        Object objValue = this._get(DTOFIELD_FORMNAVBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFormNavBarDirty() {
        return this._contains(DTOFIELD_FORMNAVBAR);
    }

    @JsonIgnore
    public void resetFormNavBar() {
        this._reset(DTOFIELD_FORMNAVBAR);
    }

    @JsonIgnore
    public PSDEFormDTO formnavbar(Integer formNavBar) {
        this.setFormNavBar(formNavBar);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO formnavbar(Boolean formNavBar) {
        if (formNavBar == null) {
            this.setFormNavBar(null);
        } else {
            this.setFormNavBar(formNavBar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formsn")
    public void setFormSN(String formSN) {
        this._set(DTOFIELD_FORMSN, formSN);
    }

    @JsonIgnore
    public String getFormSN() {
        Object objValue = this._get(DTOFIELD_FORMSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormSNDirty() {
        return this._contains(DTOFIELD_FORMSN);
    }

    @JsonIgnore
    public void resetFormSN() {
        this._reset(DTOFIELD_FORMSN);
    }

    @JsonIgnore
    public PSDEFormDTO formsn(String formSN) {
        this.setFormSN(formSN);
        return this;
    }

    @JsonProperty(value="formstyle")
    public void setFormStyle(String formStyle) {
        this._set(DTOFIELD_FORMSTYLE, formStyle);
    }

    @JsonIgnore
    public String getFormStyle() {
        Object objValue = this._get(DTOFIELD_FORMSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormStyleDirty() {
        return this._contains(DTOFIELD_FORMSTYLE);
    }

    @JsonIgnore
    public void resetFormStyle() {
        this._reset(DTOFIELD_FORMSTYLE);
    }

    @JsonIgnore
    public PSDEFormDTO formstyle(String formStyle) {
        this.setFormStyle(formStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO formstyle(PSModelEnums.FormStyle formStyle) {
        if (formStyle == null) {
            this.setFormStyle(null);
        } else {
            this.setFormStyle(formStyle.value);
        }
        return this;
    }

    @JsonProperty(value="formtag")
    public void setFormTag(String formTag) {
        this._set(DTOFIELD_FORMTAG, formTag);
    }

    @JsonIgnore
    public String getFormTag() {
        Object objValue = this._get(DTOFIELD_FORMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTagDirty() {
        return this._contains(DTOFIELD_FORMTAG);
    }

    @JsonIgnore
    public void resetFormTag() {
        this._reset(DTOFIELD_FORMTAG);
    }

    @JsonIgnore
    public PSDEFormDTO formtag(String formTag) {
        this.setFormTag(formTag);
        return this;
    }

    @JsonProperty(value="formtag2")
    public void setFormTag2(String formTag2) {
        this._set(DTOFIELD_FORMTAG2, formTag2);
    }

    @JsonIgnore
    public String getFormTag2() {
        Object objValue = this._get(DTOFIELD_FORMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTag2Dirty() {
        return this._contains(DTOFIELD_FORMTAG2);
    }

    @JsonIgnore
    public void resetFormTag2() {
        this._reset(DTOFIELD_FORMTAG2);
    }

    @JsonIgnore
    public PSDEFormDTO formtag2(String formTag2) {
        this.setFormTag2(formTag2);
        return this;
    }

    @JsonProperty(value="formtag3")
    public void setFormTag3(String formTag3) {
        this._set(DTOFIELD_FORMTAG3, formTag3);
    }

    @JsonIgnore
    public String getFormTag3() {
        Object objValue = this._get(DTOFIELD_FORMTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTag3Dirty() {
        return this._contains(DTOFIELD_FORMTAG3);
    }

    @JsonIgnore
    public void resetFormTag3() {
        this._reset(DTOFIELD_FORMTAG3);
    }

    @JsonIgnore
    public PSDEFormDTO formtag3(String formTag3) {
        this.setFormTag3(formTag3);
        return this;
    }

    @JsonProperty(value="formtag4")
    public void setFormTag4(String formTag4) {
        this._set(DTOFIELD_FORMTAG4, formTag4);
    }

    @JsonIgnore
    public String getFormTag4() {
        Object objValue = this._get(DTOFIELD_FORMTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTag4Dirty() {
        return this._contains(DTOFIELD_FORMTAG4);
    }

    @JsonIgnore
    public void resetFormTag4() {
        this._reset(DTOFIELD_FORMTAG4);
    }

    @JsonIgnore
    public PSDEFormDTO formtag4(String formTag4) {
        this.setFormTag4(formTag4);
        return this;
    }

    @JsonProperty(value="formtype")
    public void setFormType(String formType) {
        this._set(DTOFIELD_FORMTYPE, formType);
    }

    @JsonIgnore
    public String getFormType() {
        Object objValue = this._get(DTOFIELD_FORMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTypeDirty() {
        return this._contains(DTOFIELD_FORMTYPE);
    }

    @JsonIgnore
    public void resetFormType() {
        this._reset(DTOFIELD_FORMTYPE);
    }

    @JsonIgnore
    public PSDEFormDTO formtype(String formType) {
        this.setFormType(formType);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO formtype(PSModelEnums.FormType formType) {
        if (formType == null) {
            this.setFormType(null);
        } else {
            this.setFormType(formType.value);
        }
        return this;
    }

    @JsonProperty(value="formwidth")
    public void setFormWidth(Integer formWidth) {
        this._set(DTOFIELD_FORMWIDTH, formWidth);
    }

    @JsonIgnore
    public Integer getFormWidth() {
        Object objValue = this._get(DTOFIELD_FORMWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFormWidthDirty() {
        return this._contains(DTOFIELD_FORMWIDTH);
    }

    @JsonIgnore
    public void resetFormWidth() {
        this._reset(DTOFIELD_FORMWIDTH);
    }

    @JsonIgnore
    public PSDEFormDTO formwidth(Integer formWidth) {
        this.setFormWidth(formWidth);
        return this;
    }

    @JsonProperty(value="funcmode")
    public void setFuncMode(String funcMode) {
        this._set(DTOFIELD_FUNCMODE, funcMode);
    }

    @JsonIgnore
    public String getFuncMode() {
        Object objValue = this._get(DTOFIELD_FUNCMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncModeDirty() {
        return this._contains(DTOFIELD_FUNCMODE);
    }

    @JsonIgnore
    public void resetFuncMode() {
        this._reset(DTOFIELD_FUNCMODE);
    }

    @JsonIgnore
    public PSDEFormDTO funcmode(String funcMode) {
        this.setFuncMode(funcMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO funcmode(PSModelEnums.FormFuncMode funcMode) {
        if (funcMode == null) {
            this.setFuncMode(null);
        } else {
            this.setFuncMode(funcMode.value);
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
    public PSDEFormDTO getdraftpsdeactionid(String getDraftPSDEActionId) {
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO getdraftpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO getdraftpsdeactionname(String getDraftPSDEActionName) {
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
    public PSDEFormDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO getpsdeactionname(String getPSDEActionName) {
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    @JsonProperty(value="infoformflag")
    public void setInfoFormFlag(Integer infoFormFlag) {
        this._set(DTOFIELD_INFOFORMFLAG, infoFormFlag);
    }

    @JsonIgnore
    public Integer getInfoFormFlag() {
        Object objValue = this._get(DTOFIELD_INFOFORMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInfoFormFlagDirty() {
        return this._contains(DTOFIELD_INFOFORMFLAG);
    }

    @JsonIgnore
    public void resetInfoFormFlag() {
        this._reset(DTOFIELD_INFOFORMFLAG);
    }

    @JsonIgnore
    public PSDEFormDTO infoformflag(Integer infoFormFlag) {
        this.setInfoFormFlag(infoFormFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO infoformflag(PSModelEnums.InfoFormMode infoFormFlag) {
        if (infoFormFlag == null) {
            this.setInfoFormFlag(null);
        } else {
            this.setInfoFormFlag(infoFormFlag.value);
        }
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
    public PSDEFormDTO labelwidth(Integer labelWidth) {
        this.setLabelWidth(labelWidth);
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
    public PSDEFormDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
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
    public PSDEFormDTO memo(String memo) {
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
    public PSDEFormDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO mobflag(Boolean mobFlag) {
        if (mobFlag == null) {
            this.setMobFlag(null);
        } else {
            this.setMobFlag(mobFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="navbarheight")
    public void setNavBarHeight(Integer navBarHeight) {
        this._set(DTOFIELD_NAVBARHEIGHT, navBarHeight);
    }

    @JsonIgnore
    public Integer getNavBarHeight() {
        Object objValue = this._get(DTOFIELD_NAVBARHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavBarHeightDirty() {
        return this._contains(DTOFIELD_NAVBARHEIGHT);
    }

    @JsonIgnore
    public void resetNavBarHeight() {
        this._reset(DTOFIELD_NAVBARHEIGHT);
    }

    @JsonIgnore
    public PSDEFormDTO navbarheight(Integer navBarHeight) {
        this.setNavBarHeight(navBarHeight);
        return this;
    }

    @JsonProperty(value="navbarpos")
    public void setNavBarPos(String navBarPos) {
        this._set(DTOFIELD_NAVBARPOS, navBarPos);
    }

    @JsonIgnore
    public String getNavBarPos() {
        Object objValue = this._get(DTOFIELD_NAVBARPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPosDirty() {
        return this._contains(DTOFIELD_NAVBARPOS);
    }

    @JsonIgnore
    public void resetNavBarPos() {
        this._reset(DTOFIELD_NAVBARPOS);
    }

    @JsonIgnore
    public PSDEFormDTO navbarpos(String navBarPos) {
        this.setNavBarPos(navBarPos);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO navbarpos(PSModelEnums.NavBarPos navBarPos) {
        if (navBarPos == null) {
            this.setNavBarPos(null);
        } else {
            this.setNavBarPos(navBarPos.value);
        }
        return this;
    }

    @JsonProperty(value="navbarpssyscssid")
    public void setNavBarPSSysCssId(String navBarPSSysCssId) {
        this._set(DTOFIELD_NAVBARPSSYSCSSID, navBarPSSysCssId);
    }

    @JsonIgnore
    public String getNavBarPSSysCssId() {
        Object objValue = this._get(DTOFIELD_NAVBARPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPSSysCssIdDirty() {
        return this._contains(DTOFIELD_NAVBARPSSYSCSSID);
    }

    @JsonIgnore
    public void resetNavBarPSSysCssId() {
        this._reset(DTOFIELD_NAVBARPSSYSCSSID);
    }

    @JsonIgnore
    public PSDEFormDTO navbarpssyscssid(String navBarPSSysCssId) {
        this.setNavBarPSSysCssId(navBarPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO navbarpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setNavBarPSSysCssId(null);
            this.setNavBarPSSysCssName(null);
        } else {
            this.setNavBarPSSysCssId(pSSysCss.getPSSysCssId());
            this.setNavBarPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="navbarpssyscssname")
    public void setNavBarPSSysCssName(String navBarPSSysCssName) {
        this._set(DTOFIELD_NAVBARPSSYSCSSNAME, navBarPSSysCssName);
    }

    @JsonIgnore
    public String getNavBarPSSysCssName() {
        Object objValue = this._get(DTOFIELD_NAVBARPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarPSSysCssNameDirty() {
        return this._contains(DTOFIELD_NAVBARPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetNavBarPSSysCssName() {
        this._reset(DTOFIELD_NAVBARPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDEFormDTO navbarpssyscssname(String navBarPSSysCssName) {
        this.setNavBarPSSysCssName(navBarPSSysCssName);
        return this;
    }

    @JsonProperty(value="navbarstyle")
    public void setNavBarStyle(String navBarStyle) {
        this._set(DTOFIELD_NAVBARSTYLE, navBarStyle);
    }

    @JsonIgnore
    public String getNavBarStyle() {
        Object objValue = this._get(DTOFIELD_NAVBARSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavBarStyleDirty() {
        return this._contains(DTOFIELD_NAVBARSTYLE);
    }

    @JsonIgnore
    public void resetNavBarStyle() {
        this._reset(DTOFIELD_NAVBARSTYLE);
    }

    @JsonIgnore
    public PSDEFormDTO navbarstyle(String navBarStyle) {
        this.setNavBarStyle(navBarStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO navbarstyle(PSModelEnums.CtrlDetailStyle navBarStyle) {
        if (navBarStyle == null) {
            this.setNavBarStyle(null);
        } else {
            this.setNavBarStyle(navBarStyle.value);
        }
        return this;
    }

    @JsonProperty(value="navbarwidth")
    public void setNavBarWidth(Integer navBarWidth) {
        this._set(DTOFIELD_NAVBARWIDTH, navBarWidth);
    }

    @JsonIgnore
    public Integer getNavBarWidth() {
        Object objValue = this._get(DTOFIELD_NAVBARWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavBarWidthDirty() {
        return this._contains(DTOFIELD_NAVBARWIDTH);
    }

    @JsonIgnore
    public void resetNavBarWidth() {
        this._reset(DTOFIELD_NAVBARWIDTH);
    }

    @JsonIgnore
    public PSDEFormDTO navbarwidth(Integer navBarWidth) {
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    @JsonProperty(value="pdvtparam")
    public void setPDVTParam(String pDVTParam) {
        this._set(DTOFIELD_PDVTPARAM, pDVTParam);
    }

    @JsonIgnore
    public String getPDVTParam() {
        Object objValue = this._get(DTOFIELD_PDVTPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPDVTParamDirty() {
        return this._contains(DTOFIELD_PDVTPARAM);
    }

    @JsonIgnore
    public void resetPDVTParam() {
        this._reset(DTOFIELD_PDVTPARAM);
    }

    @JsonIgnore
    public PSDEFormDTO pdvtparam(String pDVTParam) {
        this.setPDVTParam(pDVTParam);
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
    public PSDEFormDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSDEFormDTO psachandlername(String pSACHandlerName) {
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
    public PSDEFormDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDEFormDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSDEFormDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
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
    public PSDEFormDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSDEFormDTO psdefinputtipsetid(String pSDEFInputTipSetId) {
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psdefinputtipsetid(PSDEFInputTipSetDTO pSDEFInputTipSet) {
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
    public PSDEFormDTO psdefinputtipsetname(String pSDEFInputTipSetName) {
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
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
    public PSDEFormDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
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
    public PSDEFormDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFormName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFormName(strName);
    }

    @JsonIgnore
    public PSDEFormDTO name(String strName) {
        this.setPSDEFormName(strName);
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
    public PSDEFormDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFormDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdynainstname")
    public void setPSDynaInstName(String pSDynaInstName) {
        this._set(DTOFIELD_PSDYNAINSTNAME, pSDynaInstName);
    }

    @JsonIgnore
    public String getPSDynaInstName() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstNameDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPSDynaInstName() {
        this._reset(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSDEFormDTO psdynainstname(String pSDynaInstName) {
        this.setPSDynaInstName(pSDynaInstName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSDEFormDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSDEFormDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pssyscounterid")
    public void setPSSysCounterId(String pSSysCounterId) {
        this._set(DTOFIELD_PSSYSCOUNTERID, pSSysCounterId);
    }

    @JsonIgnore
    public String getPSSysCounterId() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterIdDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public void resetPSSysCounterId() {
        this._reset(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public PSDEFormDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
        if (pSSysCounter == null) {
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        } else {
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    @JsonProperty(value="pssyscountername")
    public void setPSSysCounterName(String pSSysCounterName) {
        this._set(DTOFIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }

    @JsonIgnore
    public String getPSSysCounterName() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterNameDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public void resetPSSysCounterName() {
        this._reset(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public PSDEFormDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
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
    public PSDEFormDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEFormDTO pssyscssname(String pSSysCssName) {
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
    public PSDEFormDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEFormDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEFormDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEFormDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEFormDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEFormDTO pssysreqitemname(String pSSysReqItemName) {
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
    public PSDEFormDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSDEFormDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="pswfdeid")
    public void setPSWFDEId(String pSWFDEId) {
        this._set(DTOFIELD_PSWFDEID, pSWFDEId);
    }

    @JsonIgnore
    public String getPSWFDEId() {
        Object objValue = this._get(DTOFIELD_PSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDEIdDirty() {
        return this._contains(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public void resetPSWFDEId() {
        this._reset(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public PSDEFormDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO pswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
            this.setPSWFId(null);
        } else {
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
            this.setPSWFId(pSWFDE.getPSWFId());
        }
        return this;
    }

    @JsonProperty(value="pswfdename")
    public void setPSWFDEName(String pSWFDEName) {
        this._set(DTOFIELD_PSWFDENAME, pSWFDEName);
    }

    @JsonIgnore
    public String getPSWFDEName() {
        Object objValue = this._get(DTOFIELD_PSWFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDENameDirty() {
        return this._contains(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public void resetPSWFDEName() {
        this._reset(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public PSDEFormDTO pswfdename(String pSWFDEName) {
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFId(String pSWFId) {
        this._set(DTOFIELD_PSWFID, pSWFId);
    }

    @JsonIgnore
    public String getPSWFId() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIdDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFId() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSDEFormDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
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
    public PSDEFormDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    @JsonProperty(value="searchbtnpos")
    public void setSearchBtnPos(String searchBtnPos) {
        this._set(DTOFIELD_SEARCHBTNPOS, searchBtnPos);
    }

    @JsonIgnore
    public String getSearchBtnPos() {
        Object objValue = this._get(DTOFIELD_SEARCHBTNPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchBtnPosDirty() {
        return this._contains(DTOFIELD_SEARCHBTNPOS);
    }

    @JsonIgnore
    public void resetSearchBtnPos() {
        this._reset(DTOFIELD_SEARCHBTNPOS);
    }

    @JsonIgnore
    public PSDEFormDTO searchbtnpos(String searchBtnPos) {
        this.setSearchBtnPos(searchBtnPos);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO searchbtnpos(PSModelEnums.SearchFormButtonPos searchBtnPos) {
        if (searchBtnPos == null) {
            this.setSearchBtnPos(null);
        } else {
            this.setSearchBtnPos(searchBtnPos.value);
        }
        return this;
    }

    @JsonProperty(value="searchbtnstyle")
    public void setSearchBtnStyle(String searchBtnStyle) {
        this._set(DTOFIELD_SEARCHBTNSTYLE, searchBtnStyle);
    }

    @JsonIgnore
    public String getSearchBtnStyle() {
        Object objValue = this._get(DTOFIELD_SEARCHBTNSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchBtnStyleDirty() {
        return this._contains(DTOFIELD_SEARCHBTNSTYLE);
    }

    @JsonIgnore
    public void resetSearchBtnStyle() {
        this._reset(DTOFIELD_SEARCHBTNSTYLE);
    }

    @JsonIgnore
    public PSDEFormDTO searchbtnstyle(String searchBtnStyle) {
        this.setSearchBtnStyle(searchBtnStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO searchbtnstyle(PSModelEnums.SearchFormButtonStyle searchBtnStyle) {
        if (searchBtnStyle == null) {
            this.setSearchBtnStyle(null);
        } else {
            this.setSearchBtnStyle(searchBtnStyle.value);
        }
        return this;
    }

    @JsonProperty(value="showtabheader")
    public void setShowTabHeader(Integer showTabHeader) {
        this._set(DTOFIELD_SHOWTABHEADER, showTabHeader);
    }

    @JsonIgnore
    public Integer getShowTabHeader() {
        Object objValue = this._get(DTOFIELD_SHOWTABHEADER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowTabHeaderDirty() {
        return this._contains(DTOFIELD_SHOWTABHEADER);
    }

    @JsonIgnore
    public void resetShowTabHeader() {
        this._reset(DTOFIELD_SHOWTABHEADER);
    }

    @JsonIgnore
    public PSDEFormDTO showtabheader(Integer showTabHeader) {
        this.setShowTabHeader(showTabHeader);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO showtabheader(Boolean showTabHeader) {
        if (showTabHeader == null) {
            this.setShowTabHeader(null);
        } else {
            this.setShowTabHeader(showTabHeader != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tabheaderpos")
    public void setTabHeaderPos(String tabHeaderPos) {
        this._set(DTOFIELD_TABHEADERPOS, tabHeaderPos);
    }

    @JsonIgnore
    public String getTabHeaderPos() {
        Object objValue = this._get(DTOFIELD_TABHEADERPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabHeaderPosDirty() {
        return this._contains(DTOFIELD_TABHEADERPOS);
    }

    @JsonIgnore
    public void resetTabHeaderPos() {
        this._reset(DTOFIELD_TABHEADERPOS);
    }

    @JsonIgnore
    public PSDEFormDTO tabheaderpos(String tabHeaderPos) {
        this.setTabHeaderPos(tabHeaderPos);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO tabheaderpos(PSModelEnums.TabHeaderPos tabHeaderPos) {
        if (tabHeaderPos == null) {
            this.setTabHeaderPos(null);
        } else {
            this.setTabHeaderPos(tabHeaderPos.value);
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
    public PSDEFormDTO updatedate(Timestamp updateDate) {
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
    public PSDEFormDTO updateman(String updateMan) {
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
    public PSDEFormDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO updatepsdeactionname(String updatePSDEActionName) {
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
    public PSDEFormDTO user2psdeactionid(String user2PSDEActionId) {
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO user2psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO user2psdeactionname(String user2PSDEActionName) {
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
    public PSDEFormDTO userparams(String userParams) {
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
    public PSDEFormDTO userpsdeactionid(String userPSDEActionId) {
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDTO userpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEFormDTO userpsdeactionname(String userPSDEActionName) {
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
    public PSDEFormDTO usertag(String userTag) {
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
    public PSDEFormDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFormId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFormId(strValue);
    }

    @JsonIgnore
    public PSDEFormDTO id(String strValue) {
        this.setPSDEFormId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEFormDetailDTO> getPSDEFormDetails() {
        Object list = this._get(DTOFIELD_PSDEFORMDETAILS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeformdetails")
    public void setPSDEFormDetails(List<PSDEFormDetailDTO> psdeformdetails) {
        this._set(DTOFIELD_PSDEFORMDETAILS, psdeformdetails);
    }

    @JsonIgnore
    public List<PSDEFormDetailDTO> getPSDEFormDetailsIf() {
        Object list = this._get(DTOFIELD_PSDEFORMDETAILS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFORMDETAILS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEFormRFDTO> getPSDEFormRves() {
        Object list = this._get(DTOFIELD_PSDEFORMRVES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeformrves")
    public void setPSDEFormRves(List<PSDEFormRFDTO> psdeformrves) {
        this._set(DTOFIELD_PSDEFORMRVES, psdeformrves);
    }

    @JsonIgnore
    public List<PSDEFormRFDTO> getPSDEFormRvesIf() {
        Object list = this._get(DTOFIELD_PSDEFORMRVES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFORMRVES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEFIUpdateDTO> getPSDEFIUpdates() {
        Object list = this._get(DTOFIELD_PSDEFIUPDATES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefiupdates")
    public void setPSDEFIUpdates(List<PSDEFIUpdateDTO> psdefiupdates) {
        this._set(DTOFIELD_PSDEFIUPDATES, psdefiupdates);
    }

    @JsonIgnore
    public List<PSDEFIUpdateDTO> getPSDEFIUpdatesIf() {
        Object list = this._get(DTOFIELD_PSDEFIUPDATES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFIUPDATES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEFIVRDTO> getPSDEFIVRs() {
        Object list = this._get(DTOFIELD_PSDEFIVRS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefivrs")
    public void setPSDEFIVRs(List<PSDEFIVRDTO> psdefivrs) {
        this._set(DTOFIELD_PSDEFIVRS, psdefivrs);
    }

    @JsonIgnore
    public List<PSDEFIVRDTO> getPSDEFIVRsIf() {
        Object list = this._get(DTOFIELD_PSDEFIVRS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFIVRS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEFormLogicDTO> getPSDEFormLogics() {
        Object list = this._get(DTOFIELD_PSDEFORMLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeformlogics")
    public void setPSDEFormLogics(List<PSDEFormLogicDTO> psdeformlogics) {
        this._set(DTOFIELD_PSDEFORMLOGICS, psdeformlogics);
    }

    @JsonIgnore
    public List<PSDEFormLogicDTO> getPSDEFormLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEFORMLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFORMLOGICS, list);
        }
        return (List) list;
    }
}
