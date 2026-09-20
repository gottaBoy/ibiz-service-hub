package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEViewCtrlDTO
extends PSModelDTOBase {
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_BOTTOMPOS = "BOTTOMPOS";
    protected static final String DTOFIELD_BOTTOMPOS = "bottompos";
    public static final String FIELD_BTNACTIONTYPE = "BTNACTIONTYPE";
    protected static final String DTOFIELD_BTNACTIONTYPE = "btnactiontype";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLPARAM = "CTRLPARAM";
    protected static final String DTOFIELD_CTRLPARAM = "ctrlparam";
    public static final String FIELD_CTRLPARAM10 = "CTRLPARAM10";
    protected static final String DTOFIELD_CTRLPARAM10 = "ctrlparam10";
    public static final String FIELD_CTRLPARAM11 = "CTRLPARAM11";
    protected static final String DTOFIELD_CTRLPARAM11 = "ctrlparam11";
    public static final String FIELD_CTRLPARAM12 = "CTRLPARAM12";
    protected static final String DTOFIELD_CTRLPARAM12 = "ctrlparam12";
    public static final String FIELD_CTRLPARAM2 = "CTRLPARAM2";
    protected static final String DTOFIELD_CTRLPARAM2 = "ctrlparam2";
    public static final String FIELD_CTRLPARAM3 = "CTRLPARAM3";
    protected static final String DTOFIELD_CTRLPARAM3 = "ctrlparam3";
    public static final String FIELD_CTRLPARAM4 = "CTRLPARAM4";
    protected static final String DTOFIELD_CTRLPARAM4 = "ctrlparam4";
    public static final String FIELD_CTRLPARAM5 = "CTRLPARAM5";
    protected static final String DTOFIELD_CTRLPARAM5 = "ctrlparam5";
    public static final String FIELD_CTRLPARAM6 = "CTRLPARAM6";
    protected static final String DTOFIELD_CTRLPARAM6 = "ctrlparam6";
    public static final String FIELD_CTRLPARAM7 = "CTRLPARAM7";
    protected static final String DTOFIELD_CTRLPARAM7 = "ctrlparam7";
    public static final String FIELD_CTRLPARAM8 = "CTRLPARAM8";
    protected static final String DTOFIELD_CTRLPARAM8 = "ctrlparam8";
    public static final String FIELD_CTRLPARAM9 = "CTRLPARAM9";
    protected static final String DTOFIELD_CTRLPARAM9 = "ctrlparam9";
    public static final String FIELD_CTRLPARAMS = "CTRLPARAMS";
    protected static final String DTOFIELD_CTRLPARAMS = "ctrlparams";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DYNCMODE = "DYNCMODE";
    protected static final String DTOFIELD_DYNCMODE = "dyncmode";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_INSERTPOS = "INSERTPOS";
    protected static final String DTOFIELD_INSERTPOS = "insertpos";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_LOCALMODE = "LOCALMODE";
    protected static final String DTOFIELD_LOCALMODE = "localmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MULTISELECT = "MULTISELECT";
    protected static final String DTOFIELD_MULTISELECT = "multiselect";
    public static final String FIELD_NO2PSDEUAGROUPID = "NO2PSDEUAGROUPID";
    protected static final String DTOFIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";
    public static final String FIELD_NO2PSDEUAGROUPNAME = "NO2PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";
    public static final String FIELD_NO3PSDEUAGROUPID = "NO3PSDEUAGROUPID";
    protected static final String DTOFIELD_NO3PSDEUAGROUPID = "no3psdeuagroupid";
    public static final String FIELD_NO3PSDEUAGROUPNAME = "NO3PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO3PSDEUAGROUPNAME = "no3psdeuagroupname";
    public static final String FIELD_NO4PSDEUAGROUPID = "NO4PSDEUAGROUPID";
    protected static final String DTOFIELD_NO4PSDEUAGROUPID = "no4psdeuagroupid";
    public static final String FIELD_NO4PSDEUAGROUPNAME = "NO4PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO4PSDEUAGROUPNAME = "no4psdeuagroupname";
    public static final String FIELD_NO5PSDEUAGROUPID = "NO5PSDEUAGROUPID";
    protected static final String DTOFIELD_NO5PSDEUAGROUPID = "no5psdeuagroupid";
    public static final String FIELD_NO5PSDEUAGROUPNAME = "NO5PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO5PSDEUAGROUPNAME = "no5psdeuagroupname";
    public static final String FIELD_NO6PSDEUAGROUPID = "NO6PSDEUAGROUPID";
    protected static final String DTOFIELD_NO6PSDEUAGROUPID = "no6psdeuagroupid";
    public static final String FIELD_NO6PSDEUAGROUPNAME = "NO6PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO6PSDEUAGROUPNAME = "no6psdeuagroupname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
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
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDECHARTID = "PSDECHARTID";
    protected static final String DTOFIELD_PSDECHARTID = "psdechartid";
    public static final String FIELD_PSDECHARTNAME = "PSDECHARTNAME";
    protected static final String DTOFIELD_PSDECHARTNAME = "psdechartname";
    public static final String FIELD_PSDEDATAEXPID = "PSDEDATAEXPID";
    protected static final String DTOFIELD_PSDEDATAEXPID = "psdedataexpid";
    public static final String FIELD_PSDEDATAEXPNAME = "PSDEDATAEXPNAME";
    protected static final String DTOFIELD_PSDEDATAEXPNAME = "psdedataexpname";
    public static final String FIELD_PSDEDATAIMPID = "PSDEDATAIMPID";
    protected static final String DTOFIELD_PSDEDATAIMPID = "psdedataimpid";
    public static final String FIELD_PSDEDATAIMPNAME = "PSDEDATAIMPNAME";
    protected static final String DTOFIELD_PSDEDATAIMPNAME = "psdedataimpname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEDATAVIEWID = "PSDEDATAVIEWID";
    protected static final String DTOFIELD_PSDEDATAVIEWID = "psdedataviewid";
    public static final String FIELD_PSDEDATAVIEWNAME = "PSDEDATAVIEWNAME";
    protected static final String DTOFIELD_PSDEDATAVIEWNAME = "psdedataviewname";
    public static final String FIELD_PSDEDRID = "PSDEDRID";
    protected static final String DTOFIELD_PSDEDRID = "psdedrid";
    public static final String FIELD_PSDEDRNAME = "PSDEDRNAME";
    protected static final String DTOFIELD_PSDEDRNAME = "psdedrname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELISTID = "PSDELISTID";
    protected static final String DTOFIELD_PSDELISTID = "psdelistid";
    public static final String FIELD_PSDELISTNAME = "PSDELISTNAME";
    protected static final String DTOFIELD_PSDELISTNAME = "psdelistname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDEREPORTID = "PSDEREPORTID";
    protected static final String DTOFIELD_PSDEREPORTID = "psdereportid";
    public static final String FIELD_PSDEREPORTNAME = "PSDEREPORTNAME";
    protected static final String DTOFIELD_PSDEREPORTNAME = "psdereportname";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSDEVIEWCTRLID = "PSDEVIEWCTRLID";
    protected static final String DTOFIELD_PSDEVIEWCTRLID = "psdeviewctrlid";
    public static final String FIELD_PSDEVIEWCTRLNAME = "PSDEVIEWCTRLNAME";
    protected static final String DTOFIELD_PSDEVIEWCTRLNAME = "psdeviewctrlname";
    public static final String FIELD_PSDEVIEWCTRLTYPE = "PSDEVIEWCTRLTYPE";
    protected static final String DTOFIELD_PSDEVIEWCTRLTYPE = "psdeviewctrltype";
    public static final String FIELD_PSDEVIEWID = "PSDEVIEWID";
    protected static final String DTOFIELD_PSDEVIEWID = "psdeviewid";
    public static final String FIELD_PSDEVIEWNAME = "PSDEVIEWNAME";
    protected static final String DTOFIELD_PSDEVIEWNAME = "psdeviewname";
    public static final String FIELD_PSDEWIZARDID = "PSDEWIZARDID";
    protected static final String DTOFIELD_PSDEWIZARDID = "psdewizardid";
    public static final String FIELD_PSDEWIZARDNAME = "PSDEWIZARDNAME";
    protected static final String DTOFIELD_PSDEWIZARDNAME = "psdewizardname";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARNAME = "PSSYSCALENDARNAME";
    protected static final String DTOFIELD_PSSYSCALENDARNAME = "pssyscalendarname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDASHBOARDID = "PSSYSDASHBOARDID";
    protected static final String DTOFIELD_PSSYSDASHBOARDID = "pssysdashboardid";
    public static final String FIELD_PSSYSDASHBOARDNAME = "PSSYSDASHBOARDNAME";
    protected static final String DTOFIELD_PSSYSDASHBOARDNAME = "pssysdashboardname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMAPVIEWID = "PSSYSMAPVIEWID";
    protected static final String DTOFIELD_PSSYSMAPVIEWID = "pssysmapviewid";
    public static final String FIELD_PSSYSMAPVIEWNAME = "PSSYSMAPVIEWNAME";
    protected static final String DTOFIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSSEARCHBARID = "PSSYSSEARCHBARID";
    protected static final String DTOFIELD_PSSYSSEARCHBARID = "pssyssearchbarid";
    public static final String FIELD_PSSYSSEARCHBARNAME = "PSSYSSEARCHBARNAME";
    protected static final String DTOFIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_READONLYMODE = "READONLYMODE";
    protected static final String DTOFIELD_READONLYMODE = "readonlymode";
    public static final String FIELD_REFCTRL2NAME = "REFCTRL2NAME";
    protected static final String DTOFIELD_REFCTRL2NAME = "refctrl2name";
    public static final String FIELD_REFCTRL2USAGE = "REFCTRL2USAGE";
    protected static final String DTOFIELD_REFCTRL2USAGE = "refctrl2usage";
    public static final String FIELD_REFCTRL2USAGETEXT = "REFCTRL2USAGETEXT";
    protected static final String DTOFIELD_REFCTRL2USAGETEXT = "refctrl2usagetext";
    public static final String FIELD_REFCTRLNAME = "REFCTRLNAME";
    protected static final String DTOFIELD_REFCTRLNAME = "refctrlname";
    public static final String FIELD_REFCTRLUSAGE = "REFCTRLUSAGE";
    protected static final String DTOFIELD_REFCTRLUSAGE = "refctrlusage";
    public static final String FIELD_REFCTRLUSAGETEXT = "REFCTRLUSAGETEXT";
    protected static final String DTOFIELD_REFCTRLUSAGETEXT = "refctrlusagetext";
    public static final String FIELD_RIGHTPOS = "RIGHTPOS";
    protected static final String DTOFIELD_RIGHTPOS = "rightpos";
    public static final String FIELD_SUBPSACHANDLERID = "SUBPSACHANDLERID";
    protected static final String DTOFIELD_SUBPSACHANDLERID = "subpsachandlerid";
    public static final String FIELD_SUBPSACHANDLERNAME = "SUBPSACHANDLERNAME";
    protected static final String DTOFIELD_SUBPSACHANDLERNAME = "subpsachandlername";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
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
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

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
    public PSDEViewCtrlDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEViewCtrlDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    @JsonProperty(value="bottompos")
    public void setBottomPos(Integer bottomPos) {
        this._set(DTOFIELD_BOTTOMPOS, bottomPos);
    }

    @JsonIgnore
    public Integer getBottomPos() {
        Object objValue = this._get(DTOFIELD_BOTTOMPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBottomPosDirty() {
        return this._contains(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public void resetBottomPos() {
        this._reset(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO bottompos(Integer bottomPos) {
        this.setBottomPos(bottomPos);
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
    public PSDEViewCtrlDTO btnactiontype(String btnActionType) {
        this.setBtnActionType(btnActionType);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO btnactiontype(PSModelEnums.FormButtonActionType btnActionType) {
        if (btnActionType == null) {
            this.setBtnActionType(null);
        } else {
            this.setBtnActionType(btnActionType.value);
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
    public PSDEViewCtrlDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
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
    public PSDEViewCtrlDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEViewCtrlDTO cappslanresname(String capPSLanResName) {
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
    public PSDEViewCtrlDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEViewCtrlDTO createdate(Timestamp createDate) {
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
    public PSDEViewCtrlDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlparam")
    public void setCtrlParam(String ctrlParam) {
        this._set(DTOFIELD_CTRLPARAM, ctrlParam);
    }

    @JsonIgnore
    public String getCtrlParam() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParamDirty() {
        return this._contains(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public void resetCtrlParam() {
        this._reset(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam(String ctrlParam) {
        this.setCtrlParam(ctrlParam);
        return this;
    }

    @JsonProperty(value="ctrlparam10")
    public void setCtrlParam10(Double ctrlParam10) {
        this._set(DTOFIELD_CTRLPARAM10, ctrlParam10);
    }

    @JsonIgnore
    public Double getCtrlParam10() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam10Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public void resetCtrlParam10() {
        this._reset(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam10(Double ctrlParam10) {
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    @JsonProperty(value="ctrlparam11")
    public void setCtrlParam11(Integer ctrlParam11) {
        this._set(DTOFIELD_CTRLPARAM11, ctrlParam11);
    }

    @JsonIgnore
    public Integer getCtrlParam11() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam11Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public void resetCtrlParam11() {
        this._reset(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam11(Integer ctrlParam11) {
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    @JsonProperty(value="ctrlparam12")
    public void setCtrlParam12(Integer ctrlParam12) {
        this._set(DTOFIELD_CTRLPARAM12, ctrlParam12);
    }

    @JsonIgnore
    public Integer getCtrlParam12() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam12Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public void resetCtrlParam12() {
        this._reset(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam12(Integer ctrlParam12) {
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    @JsonProperty(value="ctrlparam2")
    public void setCtrlParam2(String ctrlParam2) {
        this._set(DTOFIELD_CTRLPARAM2, ctrlParam2);
    }

    @JsonIgnore
    public String getCtrlParam2() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam2Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public void resetCtrlParam2() {
        this._reset(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam2(String ctrlParam2) {
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    @JsonProperty(value="ctrlparam3")
    public void setCtrlParam3(String ctrlParam3) {
        this._set(DTOFIELD_CTRLPARAM3, ctrlParam3);
    }

    @JsonIgnore
    public String getCtrlParam3() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam3Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public void resetCtrlParam3() {
        this._reset(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam3(String ctrlParam3) {
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    @JsonProperty(value="ctrlparam4")
    public void setCtrlParam4(String ctrlParam4) {
        this._set(DTOFIELD_CTRLPARAM4, ctrlParam4);
    }

    @JsonIgnore
    public String getCtrlParam4() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam4Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public void resetCtrlParam4() {
        this._reset(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam4(String ctrlParam4) {
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    @JsonProperty(value="ctrlparam5")
    public void setCtrlParam5(Integer ctrlParam5) {
        this._set(DTOFIELD_CTRLPARAM5, ctrlParam5);
    }

    @JsonIgnore
    public Integer getCtrlParam5() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam5Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public void resetCtrlParam5() {
        this._reset(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam5(Integer ctrlParam5) {
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam5(Boolean ctrlParam5) {
        if (ctrlParam5 == null) {
            this.setCtrlParam5(null);
        } else {
            this.setCtrlParam5(ctrlParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam6")
    public void setCtrlParam6(Integer ctrlParam6) {
        this._set(DTOFIELD_CTRLPARAM6, ctrlParam6);
    }

    @JsonIgnore
    public Integer getCtrlParam6() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam6Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public void resetCtrlParam6() {
        this._reset(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam6(Integer ctrlParam6) {
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam6(Boolean ctrlParam6) {
        if (ctrlParam6 == null) {
            this.setCtrlParam6(null);
        } else {
            this.setCtrlParam6(ctrlParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam7")
    public void setCtrlParam7(Integer ctrlParam7) {
        this._set(DTOFIELD_CTRLPARAM7, ctrlParam7);
    }

    @JsonIgnore
    public Integer getCtrlParam7() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam7Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public void resetCtrlParam7() {
        this._reset(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam7(Integer ctrlParam7) {
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    @JsonProperty(value="ctrlparam8")
    public void setCtrlParam8(Integer ctrlParam8) {
        this._set(DTOFIELD_CTRLPARAM8, ctrlParam8);
    }

    @JsonIgnore
    public Integer getCtrlParam8() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam8Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public void resetCtrlParam8() {
        this._reset(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam8(Integer ctrlParam8) {
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    @JsonProperty(value="ctrlparam9")
    public void setCtrlParam9(Double ctrlParam9) {
        this._set(DTOFIELD_CTRLPARAM9, ctrlParam9);
    }

    @JsonIgnore
    public Double getCtrlParam9() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam9Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public void resetCtrlParam9() {
        this._reset(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam9(Double ctrlParam9) {
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    @JsonProperty(value="ctrlparams")
    public void setCtrlParams(String ctrlParams) {
        this._set(DTOFIELD_CTRLPARAMS, ctrlParams);
    }

    @JsonIgnore
    public String getCtrlParams() {
        Object objValue = this._get(DTOFIELD_CTRLPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParamsDirty() {
        return this._contains(DTOFIELD_CTRLPARAMS);
    }

    @JsonIgnore
    public void resetCtrlParams() {
        this._reset(DTOFIELD_CTRLPARAMS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparams(String ctrlParams) {
        this.setCtrlParams(ctrlParams);
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
    public PSDEViewCtrlDTO customcond(String customCond) {
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
    public PSDEViewCtrlDTO customtype(String customType) {
        this.setCustomType(customType);
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
    public PSDEViewCtrlDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dyncmode")
    public void setDyncMode(Integer dyncMode) {
        this._set(DTOFIELD_DYNCMODE, dyncMode);
    }

    @JsonIgnore
    public Integer getDyncMode() {
        Object objValue = this._get(DTOFIELD_DYNCMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDyncModeDirty() {
        return this._contains(DTOFIELD_DYNCMODE);
    }

    @JsonIgnore
    public void resetDyncMode() {
        this._reset(DTOFIELD_DYNCMODE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO dyncmode(Integer dyncMode) {
        this.setDyncMode(dyncMode);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO dyncmode(PSModelEnums.ControlPriority dyncMode) {
        if (dyncMode == null) {
            this.setDyncMode(null);
        } else {
            this.setDyncMode(dyncMode.value);
        }
        return this;
    }

    @JsonProperty(value="enabledynasys")
    public void setEnableDynaSys(Integer enableDynaSys) {
        this._set(DTOFIELD_ENABLEDYNASYS, enableDynaSys);
    }

    @JsonIgnore
    public Integer getEnableDynaSys() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNASYS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaSysDirty() {
        return this._contains(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public void resetEnableDynaSys() {
        this._reset(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO enabledynasys(Integer enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO enabledynasys(PSModelEnums.ControlDynaSysMode enableDynaSys) {
        if (enableDynaSys == null) {
            this.setEnableDynaSys(null);
        } else {
            this.setEnableDynaSys(enableDynaSys.value);
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
    public PSDEViewCtrlDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
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
    public PSDEViewCtrlDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
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
    public PSDEViewCtrlDTO height(Double height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="insertpos")
    public void setInsertPos(Integer insertPos) {
        this._set(DTOFIELD_INSERTPOS, insertPos);
    }

    @JsonIgnore
    public Integer getInsertPos() {
        Object objValue = this._get(DTOFIELD_INSERTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInsertPosDirty() {
        return this._contains(DTOFIELD_INSERTPOS);
    }

    @JsonIgnore
    public void resetInsertPos() {
        this._reset(DTOFIELD_INSERTPOS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO insertpos(Integer insertPos) {
        this.setInsertPos(insertPos);
        return this;
    }

    @JsonProperty(value="leftpos")
    public void setLeftPos(Integer leftPos) {
        this._set(DTOFIELD_LEFTPOS, leftPos);
    }

    @JsonIgnore
    public Integer getLeftPos() {
        Object objValue = this._get(DTOFIELD_LEFTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLeftPosDirty() {
        return this._contains(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public void resetLeftPos() {
        this._reset(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO leftpos(Integer leftPos) {
        this.setLeftPos(leftPos);
        return this;
    }

    @JsonProperty(value="localmode")
    public void setLocalMode(Integer localMode) {
        this._set(DTOFIELD_LOCALMODE, localMode);
    }

    @JsonIgnore
    public Integer getLocalMode() {
        Object objValue = this._get(DTOFIELD_LOCALMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLocalModeDirty() {
        return this._contains(DTOFIELD_LOCALMODE);
    }

    @JsonIgnore
    public void resetLocalMode() {
        this._reset(DTOFIELD_LOCALMODE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO localmode(Integer localMode) {
        this.setLocalMode(localMode);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO localmode(Boolean localMode) {
        if (localMode == null) {
            this.setLocalMode(null);
        } else {
            this.setLocalMode(localMode != false ? 1 : 0);
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
    public PSDEViewCtrlDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEViewCtrlDTO multiselect(Integer multiSelect) {
        this.setMultiSelect(multiSelect);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO multiselect(Boolean multiSelect) {
        if (multiSelect == null) {
            this.setMultiSelect(null);
        } else {
            this.setMultiSelect(multiSelect != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupid")
    public void setNO2PSDEUAGroupId(String nO2PSDEUAGroupId) {
        this._set(DTOFIELD_NO2PSDEUAGROUPID, nO2PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNO2PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO2PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNO2PSDEUAGroupId() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupid(String nO2PSDEUAGroupId) {
        this.setNO2PSDEUAGroupId(nO2PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNO2PSDEUAGroupId(null);
            this.setNO2PSDEUAGroupName(null);
        } else {
            this.setNO2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupname")
    public void setNO2PSDEUAGroupName(String nO2PSDEUAGroupName) {
        this._set(DTOFIELD_NO2PSDEUAGROUPNAME, nO2PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNO2PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO2PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNO2PSDEUAGroupName() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupname(String nO2PSDEUAGroupName) {
        this.setNO2PSDEUAGroupName(nO2PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no3psdeuagroupid")
    public void setNO3PSDEUAGroupId(String nO3PSDEUAGroupId) {
        this._set(DTOFIELD_NO3PSDEUAGROUPID, nO3PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNO3PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO3PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO3PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO3PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNO3PSDEUAGroupId() {
        this._reset(DTOFIELD_NO3PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupid(String nO3PSDEUAGroupId) {
        this.setNO3PSDEUAGroupId(nO3PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNO3PSDEUAGroupId(null);
            this.setNO3PSDEUAGroupName(null);
        } else {
            this.setNO3PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO3PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no3psdeuagroupname")
    public void setNO3PSDEUAGroupName(String nO3PSDEUAGroupName) {
        this._set(DTOFIELD_NO3PSDEUAGROUPNAME, nO3PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNO3PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO3PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO3PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO3PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNO3PSDEUAGroupName() {
        this._reset(DTOFIELD_NO3PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupname(String nO3PSDEUAGroupName) {
        this.setNO3PSDEUAGroupName(nO3PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no4psdeuagroupid")
    public void setNO4PSDEUAGroupId(String nO4PSDEUAGroupId) {
        this._set(DTOFIELD_NO4PSDEUAGROUPID, nO4PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNO4PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO4PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO4PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO4PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNO4PSDEUAGroupId() {
        this._reset(DTOFIELD_NO4PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupid(String nO4PSDEUAGroupId) {
        this.setNO4PSDEUAGroupId(nO4PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNO4PSDEUAGroupId(null);
            this.setNO4PSDEUAGroupName(null);
        } else {
            this.setNO4PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO4PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no4psdeuagroupname")
    public void setNO4PSDEUAGroupName(String nO4PSDEUAGroupName) {
        this._set(DTOFIELD_NO4PSDEUAGROUPNAME, nO4PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNO4PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO4PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO4PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO4PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNO4PSDEUAGroupName() {
        this._reset(DTOFIELD_NO4PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupname(String nO4PSDEUAGroupName) {
        this.setNO4PSDEUAGroupName(nO4PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no5psdeuagroupid")
    public void setNO5PSDEUAGroupId(String nO5PSDEUAGroupId) {
        this._set(DTOFIELD_NO5PSDEUAGROUPID, nO5PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNO5PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO5PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO5PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO5PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNO5PSDEUAGroupId() {
        this._reset(DTOFIELD_NO5PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupid(String nO5PSDEUAGroupId) {
        this.setNO5PSDEUAGroupId(nO5PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNO5PSDEUAGroupId(null);
            this.setNO5PSDEUAGroupName(null);
        } else {
            this.setNO5PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO5PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no5psdeuagroupname")
    public void setNO5PSDEUAGroupName(String nO5PSDEUAGroupName) {
        this._set(DTOFIELD_NO5PSDEUAGROUPNAME, nO5PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNO5PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO5PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO5PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO5PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNO5PSDEUAGroupName() {
        this._reset(DTOFIELD_NO5PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupname(String nO5PSDEUAGroupName) {
        this.setNO5PSDEUAGroupName(nO5PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="no6psdeuagroupid")
    public void setNO6PSDEUAGroupId(String nO6PSDEUAGroupId) {
        this._set(DTOFIELD_NO6PSDEUAGROUPID, nO6PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNO6PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO6PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO6PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO6PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNO6PSDEUAGroupId() {
        this._reset(DTOFIELD_NO6PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupid(String nO6PSDEUAGroupId) {
        this.setNO6PSDEUAGroupId(nO6PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNO6PSDEUAGroupId(null);
            this.setNO6PSDEUAGroupName(null);
        } else {
            this.setNO6PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO6PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no6psdeuagroupname")
    public void setNO6PSDEUAGroupName(String nO6PSDEUAGroupName) {
        this._set(DTOFIELD_NO6PSDEUAGROUPNAME, nO6PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNO6PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO6PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNO6PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO6PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNO6PSDEUAGroupName() {
        this._reset(DTOFIELD_NO6PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupname(String nO6PSDEUAGroupName) {
        this.setNO6PSDEUAGroupName(nO6PSDEUAGroupName);
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
    public PSDEViewCtrlDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEViewCtrlDTO predefinedtype(String predefinedType) {
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
    public PSDEViewCtrlDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDEViewCtrlDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSDEViewCtrlDTO psachandlername(String pSACHandlerName) {
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
    public PSDEViewCtrlDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDEViewCtrlDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSDEViewCtrlDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
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
    public PSDEViewCtrlDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdechartid")
    public void setPSDEChartId(String pSDEChartId) {
        this._set(DTOFIELD_PSDECHARTID, pSDEChartId);
    }

    @JsonIgnore
    public String getPSDEChartId() {
        Object objValue = this._get(DTOFIELD_PSDECHARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartIdDirty() {
        return this._contains(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public void resetPSDEChartId() {
        this._reset(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdechartid(String pSDEChartId) {
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdechartid(PSDEChartDTO pSDEChart) {
        if (pSDEChart == null) {
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
        } else {
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
        }
        return this;
    }

    @JsonProperty(value="psdechartname")
    public void setPSDEChartName(String pSDEChartName) {
        this._set(DTOFIELD_PSDECHARTNAME, pSDEChartName);
    }

    @JsonIgnore
    public String getPSDEChartName() {
        Object objValue = this._get(DTOFIELD_PSDECHARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartNameDirty() {
        return this._contains(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public void resetPSDEChartName() {
        this._reset(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdechartname(String pSDEChartName) {
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    @JsonProperty(value="psdedataexpid")
    public void setPSDEDataExpId(String pSDEDataExpId) {
        this._set(DTOFIELD_PSDEDATAEXPID, pSDEDataExpId);
    }

    @JsonIgnore
    public String getPSDEDataExpId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAEXPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataExpIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAEXPID);
    }

    @JsonIgnore
    public void resetPSDEDataExpId() {
        this._reset(DTOFIELD_PSDEDATAEXPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpid(String pSDEDataExpId) {
        this.setPSDEDataExpId(pSDEDataExpId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpid(PSDEDataExpDTO pSDEDataExp) {
        if (pSDEDataExp == null) {
            this.setPSDEDataExpId(null);
            this.setPSDEDataExpName(null);
        } else {
            this.setPSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setPSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    @JsonProperty(value="psdedataexpname")
    public void setPSDEDataExpName(String pSDEDataExpName) {
        this._set(DTOFIELD_PSDEDATAEXPNAME, pSDEDataExpName);
    }

    @JsonIgnore
    public String getPSDEDataExpName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAEXPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataExpNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAEXPNAME);
    }

    @JsonIgnore
    public void resetPSDEDataExpName() {
        this._reset(DTOFIELD_PSDEDATAEXPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpname(String pSDEDataExpName) {
        this.setPSDEDataExpName(pSDEDataExpName);
        return this;
    }

    @JsonProperty(value="psdedataimpid")
    public void setPSDEDataImpId(String pSDEDataImpId) {
        this._set(DTOFIELD_PSDEDATAIMPID, pSDEDataImpId);
    }

    @JsonIgnore
    public String getPSDEDataImpId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public void resetPSDEDataImpId() {
        this._reset(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpid(String pSDEDataImpId) {
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp) {
        if (pSDEDataImp == null) {
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
        } else {
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    @JsonProperty(value="psdedataimpname")
    public void setPSDEDataImpName(String pSDEDataImpName) {
        this._set(DTOFIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }

    @JsonIgnore
    public String getPSDEDataImpName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public void resetPSDEDataImpName() {
        this._reset(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpname(String pSDEDataImpName) {
        this.setPSDEDataImpName(pSDEDataImpName);
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
    public PSDEViewCtrlDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEViewCtrlDTO psdedatasetname(String pSDEDataSetName) {
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
    public PSDEViewCtrlDTO psdedataviewid(String pSDEDataViewId) {
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedataviewid(PSDEDataViewDTO pSDEDataView) {
        if (pSDEDataView == null) {
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        } else {
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
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
    public PSDEViewCtrlDTO psdedataviewname(String pSDEDataViewName) {
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    @JsonProperty(value="psdedrid")
    public void setPSDEDRId(String pSDEDRId) {
        this._set(DTOFIELD_PSDEDRID, pSDEDRId);
    }

    @JsonIgnore
    public String getPSDEDRId() {
        Object objValue = this._get(DTOFIELD_PSDEDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRIdDirty() {
        return this._contains(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public void resetPSDEDRId() {
        this._reset(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedrid(String pSDEDRId) {
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedrid(PSDEDataRelationDTO pSDEDataRelation) {
        if (pSDEDataRelation == null) {
            this.setPSDEDRId(null);
            this.setPSDEDRName(null);
        } else {
            this.setPSDEDRId(pSDEDataRelation.getPSDEDataRelationId());
            this.setPSDEDRName(pSDEDataRelation.getPSDEDataRelationName());
        }
        return this;
    }

    @JsonProperty(value="psdedrname")
    public void setPSDEDRName(String pSDEDRName) {
        this._set(DTOFIELD_PSDEDRNAME, pSDEDRName);
    }

    @JsonIgnore
    public String getPSDEDRName() {
        Object objValue = this._get(DTOFIELD_PSDEDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRNameDirty() {
        return this._contains(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public void resetPSDEDRName() {
        this._reset(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdedrname(String pSDEDRName) {
        this.setPSDEDRName(pSDEDRName);
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
    public PSDEViewCtrlDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeformid(PSDEFormDTO pSDEForm) {
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
    public PSDEViewCtrlDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSDEViewCtrlDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdegridid(PSDEGridDTO pSDEGrid) {
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
    public PSDEViewCtrlDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
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
    public PSDEViewCtrlDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEViewCtrlDTO psdelistid(String pSDEListId) {
        this.setPSDEListId(pSDEListId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdelistid(PSDEListDTO pSDEList) {
        if (pSDEList == null) {
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        } else {
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
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
    public PSDEViewCtrlDTO psdelistname(String pSDEListName) {
        this.setPSDEListName(pSDEListName);
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
    public PSDEViewCtrlDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="psdereportid")
    public void setPSDEReportId(String pSDEReportId) {
        this._set(DTOFIELD_PSDEREPORTID, pSDEReportId);
    }

    @JsonIgnore
    public String getPSDEReportId() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportIdDirty() {
        return this._contains(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public void resetPSDEReportId() {
        this._reset(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdereportid(String pSDEReportId) {
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdereportid(PSDEReportDTO pSDEReport) {
        if (pSDEReport == null) {
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        } else {
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    @JsonProperty(value="psdereportname")
    public void setPSDEReportName(String pSDEReportName) {
        this._set(DTOFIELD_PSDEREPORTNAME, pSDEReportName);
    }

    @JsonIgnore
    public String getPSDEReportName() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportNameDirty() {
        return this._contains(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public void resetPSDEReportName() {
        this._reset(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdereportname(String pSDEReportName) {
        this.setPSDEReportName(pSDEReportName);
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
    public PSDEViewCtrlDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDEViewCtrlDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonProperty(value="psdetreeviewid")
    public void setPSDETreeViewId(String pSDETreeViewId) {
        this._set(DTOFIELD_PSDETREEVIEWID, pSDETreeViewId);
    }

    @JsonIgnore
    public String getPSDETreeViewId() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewIdDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public void resetPSDETreeViewId() {
        this._reset(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
        if (pSDETreeView == null) {
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        } else {
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    @JsonProperty(value="psdetreeviewname")
    public void setPSDETreeViewName(String pSDETreeViewName) {
        this._set(DTOFIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }

    @JsonIgnore
    public String getPSDETreeViewName() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewNameDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDETreeViewName() {
        this._reset(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
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
    public PSDEViewCtrlDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEViewCtrlDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
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
    public PSDEViewCtrlDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEViewCtrlDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="psdeviewctrlid")
    public void setPSDEViewCtrlId(String pSDEViewCtrlId) {
        this._set(DTOFIELD_PSDEVIEWCTRLID, pSDEViewCtrlId);
    }

    @JsonIgnore
    public String getPSDEViewCtrlId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWCTRLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewCtrlIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWCTRLID);
    }

    @JsonIgnore
    public void resetPSDEViewCtrlId() {
        this._reset(DTOFIELD_PSDEVIEWCTRLID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrlid(String pSDEViewCtrlId) {
        this.setPSDEViewCtrlId(pSDEViewCtrlId);
        return this;
    }

    @JsonProperty(value="psdeviewctrlname")
    public void setPSDEViewCtrlName(String pSDEViewCtrlName) {
        this._set(DTOFIELD_PSDEVIEWCTRLNAME, pSDEViewCtrlName);
    }

    @JsonIgnore
    public String getPSDEViewCtrlName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWCTRLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewCtrlNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWCTRLNAME);
    }

    @JsonIgnore
    public void resetPSDEViewCtrlName() {
        this._reset(DTOFIELD_PSDEVIEWCTRLNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrlname(String pSDEViewCtrlName) {
        this.setPSDEViewCtrlName(pSDEViewCtrlName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEViewCtrlName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEViewCtrlName(strName);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO name(String strName) {
        this.setPSDEViewCtrlName(strName);
        return this;
    }

    @JsonProperty(value="psdeviewctrltype")
    public void setPSDEViewCtrlType(String pSDEViewCtrlType) {
        this._set(DTOFIELD_PSDEVIEWCTRLTYPE, pSDEViewCtrlType);
    }

    @JsonIgnore
    public String getPSDEViewCtrlType() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWCTRLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewCtrlTypeDirty() {
        return this._contains(DTOFIELD_PSDEVIEWCTRLTYPE);
    }

    @JsonIgnore
    public void resetPSDEViewCtrlType() {
        this._reset(DTOFIELD_PSDEVIEWCTRLTYPE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrltype(String pSDEViewCtrlType) {
        this.setPSDEViewCtrlType(pSDEViewCtrlType);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrltype(PSModelEnums.CtrlType pSDEViewCtrlType) {
        if (pSDEViewCtrlType == null) {
            this.setPSDEViewCtrlType(null);
        } else {
            this.setPSDEViewCtrlType(pSDEViewCtrlType.value);
        }
        return this;
    }

    @JsonProperty(value="psdeviewid")
    public void setPSDEViewId(String pSDEViewId) {
        this._set(DTOFIELD_PSDEVIEWID, pSDEViewId);
    }

    @JsonIgnore
    public String getPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWID);
    }

    @JsonIgnore
    public void resetPSDEViewId() {
        this._reset(DTOFIELD_PSDEVIEWID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewid(String pSDEViewId) {
        this.setPSDEViewId(pSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewId(null);
            this.setPSDEViewName(null);
        } else {
            this.setPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewname")
    public void setPSDEViewName(String pSDEViewName) {
        this._set(DTOFIELD_PSDEVIEWNAME, pSDEViewName);
    }

    @JsonIgnore
    public String getPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDEViewName() {
        this._reset(DTOFIELD_PSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewname(String pSDEViewName) {
        this.setPSDEViewName(pSDEViewName);
        return this;
    }

    @JsonProperty(value="psdewizardid")
    public void setPSDEWizardId(String pSDEWizardId) {
        this._set(DTOFIELD_PSDEWIZARDID, pSDEWizardId);
    }

    @JsonIgnore
    public String getPSDEWizardId() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardIdDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDID);
    }

    @JsonIgnore
    public void resetPSDEWizardId() {
        this._reset(DTOFIELD_PSDEWIZARDID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdewizardid(String pSDEWizardId) {
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdewizardid(PSDEWizardDTO pSDEWizard) {
        if (pSDEWizard == null) {
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        } else {
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    @JsonProperty(value="psdewizardname")
    public void setPSDEWizardName(String pSDEWizardName) {
        this._set(DTOFIELD_PSDEWIZARDNAME, pSDEWizardName);
    }

    @JsonIgnore
    public String getPSDEWizardName() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardNameDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDNAME);
    }

    @JsonIgnore
    public void resetPSDEWizardName() {
        this._reset(DTOFIELD_PSDEWIZARDNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO psdewizardname(String pSDEWizardName) {
        this.setPSDEWizardName(pSDEWizardName);
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
    public PSDEViewCtrlDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pspfid(PSPFDTO pSPF) {
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
    public PSDEViewCtrlDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
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
    public PSDEViewCtrlDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar) {
        if (pSSysCalendar == null) {
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        } else {
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
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
    public PSDEViewCtrlDTO pssyscalendarname(String pSSysCalendarName) {
        this.setPSSysCalendarName(pSSysCalendarName);
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
    public PSDEViewCtrlDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
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
    public PSDEViewCtrlDTO pssyscountername(String pSSysCounterName) {
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
    public PSDEViewCtrlDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEViewCtrlDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysdashboardid")
    public void setPSSysDashboardId(String pSSysDashboardId) {
        this._set(DTOFIELD_PSSYSDASHBOARDID, pSSysDashboardId);
    }

    @JsonIgnore
    public String getPSSysDashboardId() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardIdDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public void resetPSSysDashboardId() {
        this._reset(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysdashboardid(String pSSysDashboardId) {
        this.setPSSysDashboardId(pSSysDashboardId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysdashboardid(PSSysDashboardDTO pSSysDashboard) {
        if (pSSysDashboard == null) {
            this.setPSSysDashboardId(null);
            this.setPSSysDashboardName(null);
        } else {
            this.setPSSysDashboardId(pSSysDashboard.getPSSysDashboardId());
            this.setPSSysDashboardName(pSSysDashboard.getPSSysDashboardName());
        }
        return this;
    }

    @JsonProperty(value="pssysdashboardname")
    public void setPSSysDashboardName(String pSSysDashboardName) {
        this._set(DTOFIELD_PSSYSDASHBOARDNAME, pSSysDashboardName);
    }

    @JsonIgnore
    public String getPSSysDashboardName() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardNameDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public void resetPSSysDashboardName() {
        this._reset(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysdashboardname(String pSSysDashboardName) {
        this.setPSSysDashboardName(pSSysDashboardName);
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
    public PSDEViewCtrlDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEViewCtrlDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDEViewCtrlDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEViewCtrlDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDEViewCtrlDTO pssysmapviewid(String pSSysMapViewId) {
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysmapviewid(PSSysMapViewDTO pSSysMapView) {
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
    public PSDEViewCtrlDTO pssysmapviewname(String pSSysMapViewName) {
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSDEViewCtrlDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEViewCtrlDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssyssearchbarid")
    public void setPSSysSearchBarId(String pSSysSearchBarId) {
        this._set(DTOFIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }

    @JsonIgnore
    public String getPSSysSearchBarId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public void resetPSSysSearchBarId() {
        this._reset(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyssearchbarid(String pSSysSearchBarId) {
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyssearchbarid(PSSysSearchBarDTO pSSysSearchBar) {
        if (pSSysSearchBar == null) {
            this.setPSSysSearchBarId(null);
            this.setPSSysSearchBarName(null);
        } else {
            this.setPSSysSearchBarId(pSSysSearchBar.getPSSysSearchBarId());
            this.setPSSysSearchBarName(pSSysSearchBar.getPSSysSearchBarName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchbarname")
    public void setPSSysSearchBarName(String pSSysSearchBarName) {
        this._set(DTOFIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }

    @JsonIgnore
    public String getPSSysSearchBarName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchBarName() {
        this._reset(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssyssearchbarname(String pSSysSearchBarName) {
        this.setPSSysSearchBarName(pSSysSearchBarName);
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
    public PSDEViewCtrlDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSDEViewCtrlDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="readonlymode")
    public void setReadOnlyMode(Integer readOnlyMode) {
        this._set(DTOFIELD_READONLYMODE, readOnlyMode);
    }

    @JsonIgnore
    public Integer getReadOnlyMode() {
        Object objValue = this._get(DTOFIELD_READONLYMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReadOnlyModeDirty() {
        return this._contains(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public void resetReadOnlyMode() {
        this._reset(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO readonlymode(Integer readOnlyMode) {
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO readonlymode(Boolean readOnlyMode) {
        if (readOnlyMode == null) {
            this.setReadOnlyMode(null);
        } else {
            this.setReadOnlyMode(readOnlyMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="refctrl2name")
    public void setRefCtrl2Name(String refCtrl2Name) {
        this._set(DTOFIELD_REFCTRL2NAME, refCtrl2Name);
    }

    @JsonIgnore
    public String getRefCtrl2Name() {
        Object objValue = this._get(DTOFIELD_REFCTRL2NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2NameDirty() {
        return this._contains(DTOFIELD_REFCTRL2NAME);
    }

    @JsonIgnore
    public void resetRefCtrl2Name() {
        this._reset(DTOFIELD_REFCTRL2NAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2name(String refCtrl2Name) {
        this.setRefCtrl2Name(refCtrl2Name);
        return this;
    }

    @JsonProperty(value="refctrl2usage")
    public void setRefCtrl2Usage(String refCtrl2Usage) {
        this._set(DTOFIELD_REFCTRL2USAGE, refCtrl2Usage);
    }

    @JsonIgnore
    public String getRefCtrl2Usage() {
        Object objValue = this._get(DTOFIELD_REFCTRL2USAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2UsageDirty() {
        return this._contains(DTOFIELD_REFCTRL2USAGE);
    }

    @JsonIgnore
    public void resetRefCtrl2Usage() {
        this._reset(DTOFIELD_REFCTRL2USAGE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2usage(String refCtrl2Usage) {
        this.setRefCtrl2Usage(refCtrl2Usage);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2usage(PSModelEnums.ViewCtrlRefUsageAll refCtrl2Usage) {
        if (refCtrl2Usage == null) {
            this.setRefCtrl2Usage(null);
        } else {
            this.setRefCtrl2Usage(refCtrl2Usage.value);
        }
        return this;
    }

    @JsonProperty(value="refctrl2usagetext")
    public void setRefCtrl2UsageText(String refCtrl2UsageText) {
        this._set(DTOFIELD_REFCTRL2USAGETEXT, refCtrl2UsageText);
    }

    @JsonIgnore
    public String getRefCtrl2UsageText() {
        Object objValue = this._get(DTOFIELD_REFCTRL2USAGETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2UsageTextDirty() {
        return this._contains(DTOFIELD_REFCTRL2USAGETEXT);
    }

    @JsonIgnore
    public void resetRefCtrl2UsageText() {
        this._reset(DTOFIELD_REFCTRL2USAGETEXT);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2usagetext(String refCtrl2UsageText) {
        this.setRefCtrl2UsageText(refCtrl2UsageText);
        return this;
    }

    @JsonProperty(value="refctrlname")
    public void setRefCtrlName(String refCtrlName) {
        this._set(DTOFIELD_REFCTRLNAME, refCtrlName);
    }

    @JsonIgnore
    public String getRefCtrlName() {
        Object objValue = this._get(DTOFIELD_REFCTRLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlNameDirty() {
        return this._contains(DTOFIELD_REFCTRLNAME);
    }

    @JsonIgnore
    public void resetRefCtrlName() {
        this._reset(DTOFIELD_REFCTRLNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrlname(String refCtrlName) {
        this.setRefCtrlName(refCtrlName);
        return this;
    }

    @JsonProperty(value="refctrlusage")
    public void setRefCtrlUsage(String refCtrlUsage) {
        this._set(DTOFIELD_REFCTRLUSAGE, refCtrlUsage);
    }

    @JsonIgnore
    public String getRefCtrlUsage() {
        Object objValue = this._get(DTOFIELD_REFCTRLUSAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlUsageDirty() {
        return this._contains(DTOFIELD_REFCTRLUSAGE);
    }

    @JsonIgnore
    public void resetRefCtrlUsage() {
        this._reset(DTOFIELD_REFCTRLUSAGE);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrlusage(String refCtrlUsage) {
        this.setRefCtrlUsage(refCtrlUsage);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrlusage(PSModelEnums.ViewCtrlRefUsageAll refCtrlUsage) {
        if (refCtrlUsage == null) {
            this.setRefCtrlUsage(null);
        } else {
            this.setRefCtrlUsage(refCtrlUsage.value);
        }
        return this;
    }

    @JsonProperty(value="refctrlusagetext")
    public void setRefCtrlUsageText(String refCtrlUsageText) {
        this._set(DTOFIELD_REFCTRLUSAGETEXT, refCtrlUsageText);
    }

    @JsonIgnore
    public String getRefCtrlUsageText() {
        Object objValue = this._get(DTOFIELD_REFCTRLUSAGETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlUsageTextDirty() {
        return this._contains(DTOFIELD_REFCTRLUSAGETEXT);
    }

    @JsonIgnore
    public void resetRefCtrlUsageText() {
        this._reset(DTOFIELD_REFCTRLUSAGETEXT);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO refctrlusagetext(String refCtrlUsageText) {
        this.setRefCtrlUsageText(refCtrlUsageText);
        return this;
    }

    @JsonProperty(value="rightpos")
    public void setRightPos(Integer rightPos) {
        this._set(DTOFIELD_RIGHTPOS, rightPos);
    }

    @JsonIgnore
    public Integer getRightPos() {
        Object objValue = this._get(DTOFIELD_RIGHTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRightPosDirty() {
        return this._contains(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public void resetRightPos() {
        this._reset(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO rightpos(Integer rightPos) {
        this.setRightPos(rightPos);
        return this;
    }

    @JsonProperty(value="subpsachandlerid")
    public void setSubPSACHandlerId(String subPSACHandlerId) {
        this._set(DTOFIELD_SUBPSACHANDLERID, subPSACHandlerId);
    }

    @JsonIgnore
    public String getSubPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_SUBPSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_SUBPSACHANDLERID);
    }

    @JsonIgnore
    public void resetSubPSACHandlerId() {
        this._reset(DTOFIELD_SUBPSACHANDLERID);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlerid(String subPSACHandlerId) {
        this.setSubPSACHandlerId(subPSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setSubPSACHandlerId(null);
            this.setSubPSACHandlerName(null);
        } else {
            this.setSubPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setSubPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="subpsachandlername")
    public void setSubPSACHandlerName(String subPSACHandlerName) {
        this._set(DTOFIELD_SUBPSACHANDLERNAME, subPSACHandlerName);
    }

    @JsonIgnore
    public String getSubPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_SUBPSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_SUBPSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetSubPSACHandlerName() {
        this._reset(DTOFIELD_SUBPSACHANDLERNAME);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlername(String subPSACHandlerName) {
        this.setSubPSACHandlerName(subPSACHandlerName);
        return this;
    }

    @JsonProperty(value="toppos")
    public void setTopPos(Integer topPos) {
        this._set(DTOFIELD_TOPPOS, topPos);
    }

    @JsonIgnore
    public Integer getTopPos() {
        Object objValue = this._get(DTOFIELD_TOPPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTopPosDirty() {
        return this._contains(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public void resetTopPos() {
        this._reset(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
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
    public PSDEViewCtrlDTO updatedate(Timestamp updateDate) {
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
    public PSDEViewCtrlDTO updateman(String updateMan) {
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
    public PSDEViewCtrlDTO usertag(String userTag) {
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
    public PSDEViewCtrlDTO usertag2(String userTag2) {
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
    public PSDEViewCtrlDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEViewCtrlDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
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
    public PSDEViewCtrlDTO width(Double width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEViewCtrlId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEViewCtrlId(strValue);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO id(String strValue) {
        this.setPSDEViewCtrlId(strValue);
        return this;
    }
}
