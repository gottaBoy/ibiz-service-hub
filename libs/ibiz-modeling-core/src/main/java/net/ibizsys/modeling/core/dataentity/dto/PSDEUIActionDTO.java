package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEUIActionDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONLEVEL = "ACTIONLEVEL";
    protected static final String DTOFIELD_ACTIONLEVEL = "actionlevel";
    public static final String FIELD_ACTIONTARGET = "ACTIONTARGET";
    protected static final String DTOFIELD_ACTIONTARGET = "actiontarget";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_BUTTONSTYLE = "BUTTONSTYLE";
    protected static final String DTOFIELD_BUTTONSTYLE = "buttonstyle";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CLOSEEDITVIEW = "CLOSEEDITVIEW";
    protected static final String DTOFIELD_CLOSEEDITVIEW = "closeeditview";
    public static final String FIELD_CMPSLANRESID = "CMPSLANRESID";
    protected static final String DTOFIELD_CMPSLANRESID = "cmpslanresid";
    public static final String FIELD_CMPSLANRESNAME = "CMPSLANRESNAME";
    protected static final String DTOFIELD_CMPSLANRESNAME = "cmpslanresname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONFIRMINFO = "CONFIRMINFO";
    protected static final String DTOFIELD_CONFIRMINFO = "confirminfo";
    public static final String FIELD_COUNTERID = "COUNTERID";
    protected static final String DTOFIELD_COUNTERID = "counterid";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DATAITEM = "DATAITEM";
    protected static final String DTOFIELD_DATAITEM = "dataitem";
    public static final String FIELD_ENABLERTMODEL = "ENABLERTMODEL";
    protected static final String DTOFIELD_ENABLERTMODEL = "enablertmodel";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FRONTPROTYPE = "FRONTPROTYPE";
    protected static final String DTOFIELD_FRONTPROTYPE = "frontprotype";
    public static final String FIELD_GLOBALFLAG = "GLOBALFLAG";
    protected static final String DTOFIELD_GLOBALFLAG = "globalflag";
    public static final String FIELD_HTMLPAGEURL = "HTMLPAGEURL";
    protected static final String DTOFIELD_HTMLPAGEURL = "htmlpageurl";
    public static final String FIELD_ITEMOBJ = "ITEMOBJ";
    protected static final String DTOFIELD_ITEMOBJ = "itemobj";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBPSDEVIEWID = "MOBPSDEVIEWID";
    protected static final String DTOFIELD_MOBPSDEVIEWID = "mobpsdeviewid";
    public static final String FIELD_MOBPSDEVIEWNAME = "MOBPSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";
    public static final String FIELD_NEXTPSDEUIACTIONID = "NEXTPSDEUIACTIONID";
    protected static final String DTOFIELD_NEXTPSDEUIACTIONID = "nextpsdeuiactionid";
    public static final String FIELD_NEXTPSDEUIACTIONNAME = "NEXTPSDEUIACTIONNAME";
    protected static final String DTOFIELD_NEXTPSDEUIACTIONNAME = "nextpsdeuiactionname";
    public static final String FIELD_NO2PSDEDATAEXPID = "NO2PSDEDATAEXPID";
    protected static final String DTOFIELD_NO2PSDEDATAEXPID = "no2psdedataexpid";
    public static final String FIELD_NO2PSDEDATAEXPNAME = "NO2PSDEDATAEXPNAME";
    protected static final String DTOFIELD_NO2PSDEDATAEXPNAME = "no2psdedataexpname";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
    public static final String FIELD_PARAMITEM = "PARAMITEM";
    protected static final String DTOFIELD_PARAMITEM = "paramitem";
    public static final String FIELD_PDTVIEWFLAG = "PDTVIEWFLAG";
    protected static final String DTOFIELD_PDTVIEWFLAG = "pdtviewflag";
    public static final String FIELD_PSDEACMODEID = "PSDEACMODEID";
    protected static final String DTOFIELD_PSDEACMODEID = "psdeacmodeid";
    public static final String FIELD_PSDEACMODENAME = "PSDEACMODENAME";
    protected static final String DTOFIELD_PSDEACMODENAME = "psdeacmodename";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEDATAEXPID = "PSDEDATAEXPID";
    protected static final String DTOFIELD_PSDEDATAEXPID = "psdedataexpid";
    public static final String FIELD_PSDEDATAIMPID = "PSDEDATAIMPID";
    protected static final String DTOFIELD_PSDEDATAIMPID = "psdedataimpid";
    public static final String FIELD_PSDEDATAIMPNAME = "PSDEDATAIMPNAME";
    protected static final String DTOFIELD_PSDEDATAIMPNAME = "psdedataimpname";
    public static final String FIELD_PSDEFGROUPID = "PSDEFGROUPID";
    protected static final String DTOFIELD_PSDEFGROUPID = "psdefgroupid";
    public static final String FIELD_PSDEFGROUPNAME = "PSDEFGROUPNAME";
    protected static final String DTOFIELD_PSDEFGROUPNAME = "psdefgroupname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDEPRINTID = "PSDEPRINTID";
    protected static final String DTOFIELD_PSDEPRINTID = "psdeprintid";
    public static final String FIELD_PSDEPRINTNAME = "PSDEPRINTNAME";
    protected static final String DTOFIELD_PSDEPRINTNAME = "psdeprintname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSDEVIEWLOGICID = "PSDEVIEWLOGICID";
    protected static final String DTOFIELD_PSDEVIEWLOGICID = "psdeviewlogicid";
    public static final String FIELD_PSDEVIEWLOGICNAME = "PSDEVIEWLOGICNAME";
    protected static final String DTOFIELD_PSDEVIEWLOGICNAME = "psdeviewlogicname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSPDTVIEWID = "PSSYSPDTVIEWID";
    protected static final String DTOFIELD_PSSYSPDTVIEWID = "pssyspdtviewid";
    public static final String FIELD_PSSYSPDTVIEWNAME = "PSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUIACTIONID = "PSSYSUIACTIONID";
    protected static final String DTOFIELD_PSSYSUIACTIONID = "pssysuiactionid";
    public static final String FIELD_PSSYSUIACTIONNAME = "PSSYSUIACTIONNAME";
    protected static final String DTOFIELD_PSSYSUIACTIONNAME = "pssysuiactionname";
    public static final String FIELD_PSSYSVIEWLOGICID = "PSSYSVIEWLOGICID";
    protected static final String DTOFIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";
    public static final String FIELD_PSSYSVIEWLOGICNAME = "PSSYSVIEWLOGICNAME";
    protected static final String DTOFIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFNAME = "PSWFNAME";
    protected static final String DTOFIELD_PSWFNAME = "pswfname";
    public static final String FIELD_PSWFLINKID = "PSWFPLINKID";
    protected static final String DTOFIELD_PSWFLINKID = "pswflinkid";
    public static final String FIELD_PSWFLINKNAME = "PSWFPLINKNAME";
    protected static final String DTOFIELD_PSWFLINKNAME = "pswflinkname";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_RELOADDATA = "RELOADDATA";
    protected static final String DTOFIELD_RELOADDATA = "reloaddata";
    public static final String FIELD_REPPSSYSUIACTIONID = "REPPSSYSUIACTIONID";
    protected static final String DTOFIELD_REPPSSYSUIACTIONID = "reppssysuiactionid";
    public static final String FIELD_REPPSSYSUIACTIONNAME = "REPPSSYSUIACTIONNAME";
    protected static final String DTOFIELD_REPPSSYSUIACTIONNAME = "reppssysuiactionname";
    public static final String FIELD_SMPSLANRESID = "SMPSLANRESID";
    protected static final String DTOFIELD_SMPSLANRESID = "smpslanresid";
    public static final String FIELD_SMPSLANRESNAME = "SMPSLANRESNAME";
    protected static final String DTOFIELD_SMPSLANRESNAME = "smpslanresname";
    public static final String FIELD_SUCCESSINFO = "SUCCESSINFO";
    protected static final String DTOFIELD_SUCCESSINFO = "successinfo";
    public static final String FIELD_SYSITEMOBJ = "SYSITEMOBJ";
    protected static final String DTOFIELD_SYSITEMOBJ = "sysitemobj";
    public static final String FIELD_TEMPLMODE = "TEMPLMODE";
    protected static final String DTOFIELD_TEMPLMODE = "templmode";
    public static final String FIELD_TEXTITEM = "TEXTITEM";
    protected static final String DTOFIELD_TEXTITEM = "textitem";
    public static final String FIELD_TIMEOUT = "TIMEOUT";
    protected static final String DTOFIELD_TIMEOUT = "timeout";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_UATAG = "UATAG";
    protected static final String DTOFIELD_UATAG = "uatag";
    public static final String FIELD_UATAG2 = "UATAG2";
    protected static final String DTOFIELD_UATAG2 = "uatag2";
    public static final String FIELD_UATAG3 = "UATAG3";
    protected static final String DTOFIELD_UATAG3 = "uatag3";
    public static final String FIELD_UATAG4 = "UATAG4";
    protected static final String DTOFIELD_UATAG4 = "uatag4";
    public static final String FIELD_UIACTIONCODE = "UIACTIONCODE";
    protected static final String DTOFIELD_UIACTIONCODE = "uiactioncode";
    public static final String FIELD_UIACTIONPARAM = "UIACTIONPARAM";
    protected static final String DTOFIELD_UIACTIONPARAM = "uiactionparam";
    public static final String FIELD_UIACTIONPARAM10 = "UIACTIONPARAM10";
    protected static final String DTOFIELD_UIACTIONPARAM10 = "uiactionparam10";
    public static final String FIELD_UIACTIONPARAM11 = "UIACTIONPARAM11";
    protected static final String DTOFIELD_UIACTIONPARAM11 = "uiactionparam11";
    public static final String FIELD_UIACTIONPARAM12 = "UIACTIONPARAM12";
    protected static final String DTOFIELD_UIACTIONPARAM12 = "uiactionparam12";
    public static final String FIELD_UIACTIONPARAM2 = "UIACTIONPARAM2";
    protected static final String DTOFIELD_UIACTIONPARAM2 = "uiactionparam2";
    public static final String FIELD_UIACTIONPARAM3 = "UIACTIONPARAM3";
    protected static final String DTOFIELD_UIACTIONPARAM3 = "uiactionparam3";
    public static final String FIELD_UIACTIONPARAM4 = "UIACTIONPARAM4";
    protected static final String DTOFIELD_UIACTIONPARAM4 = "uiactionparam4";
    public static final String FIELD_UIACTIONPARAM5 = "UIACTIONPARAM5";
    protected static final String DTOFIELD_UIACTIONPARAM5 = "uiactionparam5";
    public static final String FIELD_UIACTIONPARAM6 = "UIACTIONPARAM6";
    protected static final String DTOFIELD_UIACTIONPARAM6 = "uiactionparam6";
    public static final String FIELD_UIACTIONPARAM7 = "UIACTIONPARAM7";
    protected static final String DTOFIELD_UIACTIONPARAM7 = "uiactionparam7";
    public static final String FIELD_UIACTIONPARAM8 = "UIACTIONPARAM8";
    protected static final String DTOFIELD_UIACTIONPARAM8 = "uiactionparam8";
    public static final String FIELD_UIACTIONPARAM9 = "UIACTIONPARAM9";
    protected static final String DTOFIELD_UIACTIONPARAM9 = "uiactionparam9";
    public static final String FIELD_UIACTIONPARAMS = "UIACTIONPARAMS";
    protected static final String DTOFIELD_UIACTIONPARAMS = "uiactionparams";
    public static final String FIELD_UIACTIONTYPE = "UIACTIONTYPE";
    protected static final String DTOFIELD_UIACTIONTYPE = "uiactiontype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERCONFIRM = "USERCONFIRM";
    protected static final String DTOFIELD_USERCONFIRM = "userconfirm";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VIEWACTIONS = "VIEWACTIONS";
    protected static final String DTOFIELD_VIEWACTIONS = "viewactions";
    public static final String FIELD_VIEWLOGICTYPE = "VIEWLOGICTYPE";
    protected static final String DTOFIELD_VIEWLOGICTYPE = "viewlogictype";
    public static final String FIELD_VLEXECMODE = "VLEXECMODE";
    protected static final String DTOFIELD_VLEXECMODE = "vlexecmode";

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
    public PSDEUIActionDTO actionlevel(Integer actionLevel) {
        this.setActionLevel(actionLevel);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO actionlevel(PSModelEnums.UIActionLevel actionLevel) {
        if (actionLevel == null) {
            this.setActionLevel(null);
        } else {
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    @JsonProperty(value="actiontarget")
    public void setActionTarget(String actionTarget) {
        this._set(DTOFIELD_ACTIONTARGET, actionTarget);
    }

    @JsonIgnore
    public String getActionTarget() {
        Object objValue = this._get(DTOFIELD_ACTIONTARGET);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTargetDirty() {
        return this._contains(DTOFIELD_ACTIONTARGET);
    }

    @JsonIgnore
    public void resetActionTarget() {
        this._reset(DTOFIELD_ACTIONTARGET);
    }

    @JsonIgnore
    public PSDEUIActionDTO actiontarget(String actionTarget) {
        this.setActionTarget(actionTarget);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO actiontarget(PSModelEnums.UIActionTarget actionTarget) {
        if (actionTarget == null) {
            this.setActionTarget(null);
        } else {
            this.setActionTarget(actionTarget.value);
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
    public PSDEUIActionDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="buttonstyle")
    public void setButtonStyle(String buttonStyle) {
        this._set(DTOFIELD_BUTTONSTYLE, buttonStyle);
    }

    @JsonIgnore
    public String getButtonStyle() {
        Object objValue = this._get(DTOFIELD_BUTTONSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isButtonStyleDirty() {
        return this._contains(DTOFIELD_BUTTONSTYLE);
    }

    @JsonIgnore
    public void resetButtonStyle() {
        this._reset(DTOFIELD_BUTTONSTYLE);
    }

    @JsonIgnore
    public PSDEUIActionDTO buttonstyle(String buttonStyle) {
        this.setButtonStyle(buttonStyle);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO buttonstyle(PSModelEnums.ButtonStyle buttonStyle) {
        if (buttonStyle == null) {
            this.setButtonStyle(null);
        } else {
            this.setButtonStyle(buttonStyle.value);
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
    public PSDEUIActionDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEUIActionDTO cappslanresname(String capPSLanResName) {
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
    public PSDEUIActionDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="closeeditview")
    public void setCloseEditView(Integer closeEditView) {
        this._set(DTOFIELD_CLOSEEDITVIEW, closeEditView);
    }

    @JsonIgnore
    public Integer getCloseEditView() {
        Object objValue = this._get(DTOFIELD_CLOSEEDITVIEW);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCloseEditViewDirty() {
        return this._contains(DTOFIELD_CLOSEEDITVIEW);
    }

    @JsonIgnore
    public void resetCloseEditView() {
        this._reset(DTOFIELD_CLOSEEDITVIEW);
    }

    @JsonIgnore
    public PSDEUIActionDTO closeeditview(Integer closeEditView) {
        this.setCloseEditView(closeEditView);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO closeeditview(PSModelEnums.UIActionCloseViewMode closeEditView) {
        if (closeEditView == null) {
            this.setCloseEditView(null);
        } else {
            this.setCloseEditView(closeEditView.value);
        }
        return this;
    }

    @JsonProperty(value="cmpslanresid")
    public void setCMPSLanResId(String cMPSLanResId) {
        this._set(DTOFIELD_CMPSLANRESID, cMPSLanResId);
    }

    @JsonIgnore
    public String getCMPSLanResId() {
        Object objValue = this._get(DTOFIELD_CMPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCMPSLanResIdDirty() {
        return this._contains(DTOFIELD_CMPSLANRESID);
    }

    @JsonIgnore
    public void resetCMPSLanResId() {
        this._reset(DTOFIELD_CMPSLANRESID);
    }

    @JsonIgnore
    public PSDEUIActionDTO cmpslanresid(String cMPSLanResId) {
        this.setCMPSLanResId(cMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO cmpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCMPSLanResId(null);
            this.setCMPSLanResName(null);
        } else {
            this.setCMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cmpslanresname")
    public void setCMPSLanResName(String cMPSLanResName) {
        this._set(DTOFIELD_CMPSLANRESNAME, cMPSLanResName);
    }

    @JsonIgnore
    public String getCMPSLanResName() {
        Object objValue = this._get(DTOFIELD_CMPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCMPSLanResNameDirty() {
        return this._contains(DTOFIELD_CMPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCMPSLanResName() {
        this._reset(DTOFIELD_CMPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO cmpslanresname(String cMPSLanResName) {
        this.setCMPSLanResName(cMPSLanResName);
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
    public PSDEUIActionDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="confirminfo")
    public void setConfirmInfo(String confirmInfo) {
        this._set(DTOFIELD_CONFIRMINFO, confirmInfo);
    }

    @JsonIgnore
    public String getConfirmInfo() {
        Object objValue = this._get(DTOFIELD_CONFIRMINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConfirmInfoDirty() {
        return this._contains(DTOFIELD_CONFIRMINFO);
    }

    @JsonIgnore
    public void resetConfirmInfo() {
        this._reset(DTOFIELD_CONFIRMINFO);
    }

    @JsonIgnore
    public PSDEUIActionDTO confirminfo(String confirmInfo) {
        this.setConfirmInfo(confirmInfo);
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
    public PSDEUIActionDTO counterid(String counterId) {
        this.setCounterId(counterId);
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
    public PSDEUIActionDTO createdate(Timestamp createDate) {
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
    public PSDEUIActionDTO createman(String createMan) {
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
    public PSDEUIActionDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="dataitem")
    public void setDataItem(String dataItem) {
        this._set(DTOFIELD_DATAITEM, dataItem);
    }

    @JsonIgnore
    public String getDataItem() {
        Object objValue = this._get(DTOFIELD_DATAITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataItemDirty() {
        return this._contains(DTOFIELD_DATAITEM);
    }

    @JsonIgnore
    public void resetDataItem() {
        this._reset(DTOFIELD_DATAITEM);
    }

    @JsonIgnore
    public PSDEUIActionDTO dataitem(String dataItem) {
        this.setDataItem(dataItem);
        return this;
    }

    @JsonProperty(value="enablertmodel")
    public void setEnableRTModel(Integer enableRTModel) {
        this._set(DTOFIELD_ENABLERTMODEL, enableRTModel);
    }

    @JsonIgnore
    public Integer getEnableRTModel() {
        Object objValue = this._get(DTOFIELD_ENABLERTMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableRTModelDirty() {
        return this._contains(DTOFIELD_ENABLERTMODEL);
    }

    @JsonIgnore
    public void resetEnableRTModel() {
        this._reset(DTOFIELD_ENABLERTMODEL);
    }

    @JsonIgnore
    public PSDEUIActionDTO enablertmodel(Integer enableRTModel) {
        this.setEnableRTModel(enableRTModel);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO enablertmodel(Boolean enableRTModel) {
        if (enableRTModel == null) {
            this.setEnableRTModel(null);
        } else {
            this.setEnableRTModel(enableRTModel != false ? 1 : 0);
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
    public PSDEUIActionDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEUIActionDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="frontprotype")
    public void setFrontProType(String frontProType) {
        this._set(DTOFIELD_FRONTPROTYPE, frontProType);
    }

    @JsonIgnore
    public String getFrontProType() {
        Object objValue = this._get(DTOFIELD_FRONTPROTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFrontProTypeDirty() {
        return this._contains(DTOFIELD_FRONTPROTYPE);
    }

    @JsonIgnore
    public void resetFrontProType() {
        this._reset(DTOFIELD_FRONTPROTYPE);
    }

    @JsonIgnore
    public PSDEUIActionDTO frontprotype(String frontProType) {
        this.setFrontProType(frontProType);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO frontprotype(PSModelEnums.UIActionFrontType frontProType) {
        if (frontProType == null) {
            this.setFrontProType(null);
        } else {
            this.setFrontProType(frontProType.value);
        }
        return this;
    }

    @JsonProperty(value="globalflag")
    public void setGlobalFlag(Integer globalFlag) {
        this._set(DTOFIELD_GLOBALFLAG, globalFlag);
    }

    @JsonIgnore
    public Integer getGlobalFlag() {
        Object objValue = this._get(DTOFIELD_GLOBALFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGlobalFlagDirty() {
        return this._contains(DTOFIELD_GLOBALFLAG);
    }

    @JsonIgnore
    public void resetGlobalFlag() {
        this._reset(DTOFIELD_GLOBALFLAG);
    }

    @JsonIgnore
    public PSDEUIActionDTO globalflag(Integer globalFlag) {
        this.setGlobalFlag(globalFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO globalflag(Boolean globalFlag) {
        if (globalFlag == null) {
            this.setGlobalFlag(null);
        } else {
            this.setGlobalFlag(globalFlag != false ? 1 : 0);
        }
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
    public PSDEUIActionDTO htmlpageurl(String htmlPageUrl) {
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    @JsonProperty(value="itemobj")
    public void setItemObj(String itemObj) {
        this._set(DTOFIELD_ITEMOBJ, itemObj);
    }

    @JsonIgnore
    public String getItemObj() {
        Object objValue = this._get(DTOFIELD_ITEMOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemObjDirty() {
        return this._contains(DTOFIELD_ITEMOBJ);
    }

    @JsonIgnore
    public void resetItemObj() {
        this._reset(DTOFIELD_ITEMOBJ);
    }

    @JsonIgnore
    public PSDEUIActionDTO itemobj(String itemObj) {
        this.setItemObj(itemObj);
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
    public PSDEUIActionDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobpsdeviewid")
    public void setMobPSDEViewId(String mobPSDEViewId) {
        this._set(DTOFIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }

    @JsonIgnore
    public String getMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobPSDEViewId() {
        this._reset(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewid(String mobPSDEViewId) {
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
        } else {
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeviewname")
    public void setMobPSDEViewName(String mobPSDEViewName) {
        this._set(DTOFIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }

    @JsonIgnore
    public String getMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobPSDEViewName() {
        this._reset(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewname(String mobPSDEViewName) {
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    @JsonProperty(value="nextpsdeuiactionid")
    public void setNextPSDEUIActionId(String nextPSDEUIActionId) {
        this._set(DTOFIELD_NEXTPSDEUIACTIONID, nextPSDEUIActionId);
    }

    @JsonIgnore
    public String getNextPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_NEXTPSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetNextPSDEUIActionId() {
        this._reset(DTOFIELD_NEXTPSDEUIACTIONID);
    }

    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionid(String nextPSDEUIActionId) {
        this.setNextPSDEUIActionId(nextPSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setNextPSDEUIActionId(null);
            this.setNextPSDEUIActionName(null);
        } else {
            this.setNextPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setNextPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="nextpsdeuiactionname")
    public void setNextPSDEUIActionName(String nextPSDEUIActionName) {
        this._set(DTOFIELD_NEXTPSDEUIACTIONNAME, nextPSDEUIActionName);
    }

    @JsonIgnore
    public String getNextPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_NEXTPSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetNextPSDEUIActionName() {
        this._reset(DTOFIELD_NEXTPSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionname(String nextPSDEUIActionName) {
        this.setNextPSDEUIActionName(nextPSDEUIActionName);
        return this;
    }

    @JsonProperty(value="no2psdedataexpid")
    public void setNo2PSDEDataExpId(String no2PSDEDataExpId) {
        this._set(DTOFIELD_NO2PSDEDATAEXPID, no2PSDEDataExpId);
    }

    @JsonIgnore
    public String getNo2PSDEDataExpId() {
        Object objValue = this._get(DTOFIELD_NO2PSDEDATAEXPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEDataExpIdDirty() {
        return this._contains(DTOFIELD_NO2PSDEDATAEXPID);
    }

    @JsonIgnore
    public void resetNo2PSDEDataExpId() {
        this._reset(DTOFIELD_NO2PSDEDATAEXPID);
    }

    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpid(String no2PSDEDataExpId) {
        this.setNo2PSDEDataExpId(no2PSDEDataExpId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpid(PSDEDataExpDTO pSDEDataExp) {
        if (pSDEDataExp == null) {
            this.setNo2PSDEDataExpId(null);
            this.setNo2PSDEDataExpName(null);
        } else {
            this.setNo2PSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setNo2PSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    @JsonProperty(value="no2psdedataexpname")
    public void setNo2PSDEDataExpName(String no2PSDEDataExpName) {
        this._set(DTOFIELD_NO2PSDEDATAEXPNAME, no2PSDEDataExpName);
    }

    @JsonIgnore
    public String getNo2PSDEDataExpName() {
        Object objValue = this._get(DTOFIELD_NO2PSDEDATAEXPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEDataExpNameDirty() {
        return this._contains(DTOFIELD_NO2PSDEDATAEXPNAME);
    }

    @JsonIgnore
    public void resetNo2PSDEDataExpName() {
        this._reset(DTOFIELD_NO2PSDEDATAEXPNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpname(String no2PSDEDataExpName) {
        this.setNo2PSDEDataExpName(no2PSDEDataExpName);
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
    public PSDEUIActionDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO noprivdm(PSModelEnums.BtnNoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    @JsonProperty(value="paramitem")
    public void setParamItem(String paramItem) {
        this._set(DTOFIELD_PARAMITEM, paramItem);
    }

    @JsonIgnore
    public String getParamItem() {
        Object objValue = this._get(DTOFIELD_PARAMITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamItemDirty() {
        return this._contains(DTOFIELD_PARAMITEM);
    }

    @JsonIgnore
    public void resetParamItem() {
        this._reset(DTOFIELD_PARAMITEM);
    }

    @JsonIgnore
    public PSDEUIActionDTO paramitem(String paramItem) {
        this.setParamItem(paramItem);
        return this;
    }

    @JsonProperty(value="pdtviewflag")
    public void setPDTViewFlag(Integer pDTViewFlag) {
        this._set(DTOFIELD_PDTVIEWFLAG, pDTViewFlag);
    }

    @JsonIgnore
    public Integer getPDTViewFlag() {
        Object objValue = this._get(DTOFIELD_PDTVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPDTViewFlagDirty() {
        return this._contains(DTOFIELD_PDTVIEWFLAG);
    }

    @JsonIgnore
    public void resetPDTViewFlag() {
        this._reset(DTOFIELD_PDTVIEWFLAG);
    }

    @JsonIgnore
    public PSDEUIActionDTO pdtviewflag(Integer pDTViewFlag) {
        this.setPDTViewFlag(pDTViewFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pdtviewflag(Boolean pDTViewFlag) {
        if (pDTViewFlag == null) {
            this.setPDTViewFlag(null);
        } else {
            this.setPDTViewFlag(pDTViewFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="psdeacmodeid")
    public void setPSDEACModeId(String pSDEACModeId) {
        this._set(DTOFIELD_PSDEACMODEID, pSDEACModeId);
    }

    @JsonIgnore
    public String getPSDEACModeId() {
        Object objValue = this._get(DTOFIELD_PSDEACMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeIdDirty() {
        return this._contains(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public void resetPSDEACModeId() {
        this._reset(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeacmodeid(String pSDEACModeId) {
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeacmodeid(PSDEACModeDTO pSDEACMode) {
        if (pSDEACMode == null) {
            this.setPSDEACModeId(null);
            this.setPSDEACModeName(null);
        } else {
            this.setPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    @JsonProperty(value="psdeacmodename")
    public void setPSDEACModeName(String pSDEACModeName) {
        this._set(DTOFIELD_PSDEACMODENAME, pSDEACModeName);
    }

    @JsonIgnore
    public String getPSDEACModeName() {
        Object objValue = this._get(DTOFIELD_PSDEACMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeNameDirty() {
        return this._contains(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public void resetPSDEACModeName() {
        this._reset(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeacmodename(String pSDEACModeName) {
        this.setPSDEACModeName(pSDEACModeName);
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
    public PSDEUIActionDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEUIActionDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
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
    public PSDEUIActionDTO psdedataexpid(String pSDEDataExpId) {
        this.setPSDEDataExpId(pSDEDataExpId);
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
    public PSDEUIActionDTO psdedataimpid(String pSDEDataImpId) {
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp) {
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
    public PSDEUIActionDTO psdedataimpname(String pSDEDataImpName) {
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    @JsonProperty(value="psdefgroupid")
    public void setPSDEFGroupId(String pSDEFGroupId) {
        this._set(DTOFIELD_PSDEFGROUPID, pSDEFGroupId);
    }

    @JsonIgnore
    public String getPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public void resetPSDEFGroupId() {
        this._reset(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdefgroupid(String pSDEFGroupId) {
        this.setPSDEFGroupId(pSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
        } else {
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdefgroupname")
    public void setPSDEFGroupName(String pSDEFGroupName) {
        this._set(DTOFIELD_PSDEFGROUPNAME, pSDEFGroupName);
    }

    @JsonIgnore
    public String getPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEFGroupName() {
        this._reset(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdefgroupname(String pSDEFGroupName) {
        this.setPSDEFGroupName(pSDEFGroupName);
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
    public PSDEUIActionDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeformid(PSDEFormDTO pSDEForm) {
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
    public PSDEUIActionDTO psdeformname(String pSDEFormName) {
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
    public PSDEUIActionDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEUIActionDTO psdename(String pSDEName) {
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
    public PSDEUIActionDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
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
    public PSDEUIActionDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="psdeprintid")
    public void setPSDEPrintId(String pSDEPrintId) {
        this._set(DTOFIELD_PSDEPRINTID, pSDEPrintId);
    }

    @JsonIgnore
    public String getPSDEPrintId() {
        Object objValue = this._get(DTOFIELD_PSDEPRINTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPrintIdDirty() {
        return this._contains(DTOFIELD_PSDEPRINTID);
    }

    @JsonIgnore
    public void resetPSDEPrintId() {
        this._reset(DTOFIELD_PSDEPRINTID);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeprintid(String pSDEPrintId) {
        this.setPSDEPrintId(pSDEPrintId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeprintid(PSDEPrintDTO pSDEPrint) {
        if (pSDEPrint == null) {
            this.setPSDEPrintId(null);
            this.setPSDEPrintName(null);
        } else {
            this.setPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    @JsonProperty(value="psdeprintname")
    public void setPSDEPrintName(String pSDEPrintName) {
        this._set(DTOFIELD_PSDEPRINTNAME, pSDEPrintName);
    }

    @JsonIgnore
    public String getPSDEPrintName() {
        Object objValue = this._get(DTOFIELD_PSDEPRINTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPrintNameDirty() {
        return this._contains(DTOFIELD_PSDEPRINTNAME);
    }

    @JsonIgnore
    public void resetPSDEPrintName() {
        this._reset(DTOFIELD_PSDEPRINTNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeprintname(String pSDEPrintName) {
        this.setPSDEPrintName(pSDEPrintName);
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
    public PSDEUIActionDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
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
    public PSDEUIActionDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEUIActionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEUIActionName(strName);
    }

    @JsonIgnore
    public PSDEUIActionDTO name(String strName) {
        this.setPSDEUIActionName(strName);
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
    public PSDEUIActionDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEUIActionDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="psdeviewlogicid")
    public void setPSDEViewLogicId(String pSDEViewLogicId) {
        this._set(DTOFIELD_PSDEVIEWLOGICID, pSDEViewLogicId);
    }

    @JsonIgnore
    public String getPSDEViewLogicId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewLogicIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWLOGICID);
    }

    @JsonIgnore
    public void resetPSDEViewLogicId() {
        this._reset(DTOFIELD_PSDEVIEWLOGICID);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicid(String pSDEViewLogicId) {
        this.setPSDEViewLogicId(pSDEViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDEViewLogicId(null);
            this.setPSDEViewLogicName(null);
        } else {
            this.setPSDEViewLogicId(pSDELogic.getPSDELogicId());
            this.setPSDEViewLogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewlogicname")
    public void setPSDEViewLogicName(String pSDEViewLogicName) {
        this._set(DTOFIELD_PSDEVIEWLOGICNAME, pSDEViewLogicName);
    }

    @JsonIgnore
    public String getPSDEViewLogicName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewLogicNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEViewLogicName() {
        this._reset(DTOFIELD_PSDEVIEWLOGICNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicname(String pSDEViewLogicName) {
        this.setPSDEViewLogicName(pSDEViewLogicName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSDEUIActionDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSDEUIActionDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
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
    public PSDEUIActionDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
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
    public PSDEUIActionDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEUIActionDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEUIActionDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEUIActionDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssyspdtviewid")
    public void setPSSysPDTViewId(String pSSysPDTViewId) {
        this._set(DTOFIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }

    @JsonIgnore
    public String getPSSysPDTViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public void resetPSSysPDTViewId() {
        this._reset(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewid(String pSSysPDTViewId) {
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
        if (pSSysPDTView == null) {
            this.setPSSysPDTViewId(null);
            this.setPSSysPDTViewName(null);
        } else {
            this.setPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    @JsonProperty(value="pssyspdtviewname")
    public void setPSSysPDTViewName(String pSSysPDTViewName) {
        this._set(DTOFIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }

    @JsonIgnore
    public String getPSSysPDTViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysPDTViewName() {
        this._reset(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewname(String pSSysPDTViewName) {
        this.setPSSysPDTViewName(pSSysPDTViewName);
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
    public PSDEUIActionDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEUIActionDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEUIActionDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEUIActionDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysuiactionid")
    public void setPSSysUIActionId(String pSSysUIActionId) {
        this._set(DTOFIELD_PSSYSUIACTIONID, pSSysUIActionId);
    }

    @JsonIgnore
    public String getPSSysUIActionId() {
        Object objValue = this._get(DTOFIELD_PSSYSUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUIActionIdDirty() {
        return this._contains(DTOFIELD_PSSYSUIACTIONID);
    }

    @JsonIgnore
    public void resetPSSysUIActionId() {
        this._reset(DTOFIELD_PSSYSUIACTIONID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysuiactionid(String pSSysUIActionId) {
        this.setPSSysUIActionId(pSSysUIActionId);
        return this;
    }

    @JsonProperty(value="pssysuiactionname")
    public void setPSSysUIActionName(String pSSysUIActionName) {
        this._set(DTOFIELD_PSSYSUIACTIONNAME, pSSysUIActionName);
    }

    @JsonIgnore
    public String getPSSysUIActionName() {
        Object objValue = this._get(DTOFIELD_PSSYSUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUIActionNameDirty() {
        return this._contains(DTOFIELD_PSSYSUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSSysUIActionName() {
        this._reset(DTOFIELD_PSSYSUIACTIONNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysuiactionname(String pSSysUIActionName) {
        this.setPSSysUIActionName(pSSysUIActionName);
        return this;
    }

    @JsonProperty(value="pssysviewlogicid")
    public void setPSSysViewLogicId(String pSSysViewLogicId) {
        this._set(DTOFIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }

    @JsonIgnore
    public String getPSSysViewLogicId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICID);
    }

    @JsonIgnore
    public void resetPSSysViewLogicId() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicid(String pSSysViewLogicId) {
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic) {
        if (pSSysViewLogic == null) {
            this.setPSSysViewLogicId(null);
            this.setPSSysViewLogicName(null);
        } else {
            this.setPSSysViewLogicId(pSSysViewLogic.getPSSysViewLogicId());
            this.setPSSysViewLogicName(pSSysViewLogic.getPSSysViewLogicName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewlogicname")
    public void setPSSysViewLogicName(String pSSysViewLogicName) {
        this._set(DTOFIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }

    @JsonIgnore
    public String getPSSysViewLogicName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICNAME);
    }

    @JsonIgnore
    public void resetPSSysViewLogicName() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicname(String pSSysViewLogicName) {
        this.setPSSysViewLogicName(pSSysViewLogicName);
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
    public PSDEUIActionDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
            this.setPSWFName(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="pswfname")
    public void setPSWFName(String pSWFName) {
        this._set(DTOFIELD_PSWFNAME, pSWFName);
    }

    @JsonIgnore
    public String getPSWFName() {
        Object objValue = this._get(DTOFIELD_PSWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFNameDirty() {
        return this._contains(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public void resetPSWFName() {
        this._reset(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfname(String pSWFName) {
        this.setPSWFName(pSWFName);
        return this;
    }

    @JsonProperty(value="pswflinkid")
    public void setPSWFLinkId(String pSWFLinkId) {
        this._set(DTOFIELD_PSWFLINKID, pSWFLinkId);
        this._set(FIELD_PSWFLINKID, pSWFLinkId);
    }

    @JsonIgnore
    public String getPSWFLinkId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKID);
        if (objValue == null && (objValue = this._get(FIELD_PSWFLINKID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkIdDirty() {
        if (this._contains(DTOFIELD_PSWFLINKID)) {
            return true;
        }
        return this._contains(FIELD_PSWFLINKID);
    }

    @JsonIgnore
    public void resetPSWFLinkId() {
        this._reset(DTOFIELD_PSWFLINKID);
        this._reset(FIELD_PSWFLINKID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswflinkid(String pSWFLinkId) {
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pswflinkid(PSWFLinkDTO pSWFLink) {
        if (pSWFLink == null) {
            this.setPSWFLinkId(null);
        } else {
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
        }
        return this;
    }

    @JsonProperty(value="pswflinkname")
    public void setPSWFLinkName(String pSWFLinkName) {
        this._set(DTOFIELD_PSWFLINKNAME, pSWFLinkName);
        this._set(FIELD_PSWFLINKNAME, pSWFLinkName);
    }

    @JsonIgnore
    public String getPSWFLinkName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSWFLINKNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkNameDirty() {
        if (this._contains(DTOFIELD_PSWFLINKNAME)) {
            return true;
        }
        return this._contains(FIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public void resetPSWFLinkName() {
        this._reset(DTOFIELD_PSWFLINKNAME);
        this._reset(FIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswflinkname(String pSWFLinkName) {
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfprocessid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setPSWFProcessId(null);
        } else {
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        } else {
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    @JsonProperty(value="pswfversionname")
    public void setPSWFVersionName(String pSWFVersionName) {
        this._set(DTOFIELD_PSWFVERSIONNAME, pSWFVersionName);
    }

    @JsonIgnore
    public String getPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetPSWFVersionName() {
        this._reset(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="reloaddata")
    public void setReloadData(Integer reloadData) {
        this._set(DTOFIELD_RELOADDATA, reloadData);
    }

    @JsonIgnore
    public Integer getReloadData() {
        Object objValue = this._get(DTOFIELD_RELOADDATA);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReloadDataDirty() {
        return this._contains(DTOFIELD_RELOADDATA);
    }

    @JsonIgnore
    public void resetReloadData() {
        this._reset(DTOFIELD_RELOADDATA);
    }

    @JsonIgnore
    public PSDEUIActionDTO reloaddata(Integer reloadData) {
        this.setReloadData(reloadData);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO reloaddata(PSModelEnums.UIActionReloadDataMode reloadData) {
        if (reloadData == null) {
            this.setReloadData(null);
        } else {
            this.setReloadData(reloadData.value);
        }
        return this;
    }

    @JsonProperty(value="reppssysuiactionid")
    public void setRepPSSysUIActionId(String repPSSysUIActionId) {
        this._set(DTOFIELD_REPPSSYSUIACTIONID, repPSSysUIActionId);
    }

    @JsonIgnore
    public String getRepPSSysUIActionId() {
        Object objValue = this._get(DTOFIELD_REPPSSYSUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRepPSSysUIActionIdDirty() {
        return this._contains(DTOFIELD_REPPSSYSUIACTIONID);
    }

    @JsonIgnore
    public void resetRepPSSysUIActionId() {
        this._reset(DTOFIELD_REPPSSYSUIACTIONID);
    }

    @JsonIgnore
    public PSDEUIActionDTO reppssysuiactionid(String repPSSysUIActionId) {
        this.setRepPSSysUIActionId(repPSSysUIActionId);
        return this;
    }

    @JsonProperty(value="reppssysuiactionname")
    public void setRepPSSysUIActionName(String repPSSysUIActionName) {
        this._set(DTOFIELD_REPPSSYSUIACTIONNAME, repPSSysUIActionName);
    }

    @JsonIgnore
    public String getRepPSSysUIActionName() {
        Object objValue = this._get(DTOFIELD_REPPSSYSUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRepPSSysUIActionNameDirty() {
        return this._contains(DTOFIELD_REPPSSYSUIACTIONNAME);
    }

    @JsonIgnore
    public void resetRepPSSysUIActionName() {
        this._reset(DTOFIELD_REPPSSYSUIACTIONNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO reppssysuiactionname(String repPSSysUIActionName) {
        this.setRepPSSysUIActionName(repPSSysUIActionName);
        return this;
    }

    @JsonProperty(value="smpslanresid")
    public void setSMPSLanResId(String sMPSLanResId) {
        this._set(DTOFIELD_SMPSLANRESID, sMPSLanResId);
    }

    @JsonIgnore
    public String getSMPSLanResId() {
        Object objValue = this._get(DTOFIELD_SMPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMPSLanResIdDirty() {
        return this._contains(DTOFIELD_SMPSLANRESID);
    }

    @JsonIgnore
    public void resetSMPSLanResId() {
        this._reset(DTOFIELD_SMPSLANRESID);
    }

    @JsonIgnore
    public PSDEUIActionDTO smpslanresid(String sMPSLanResId) {
        this.setSMPSLanResId(sMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO smpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setSMPSLanResId(null);
            this.setSMPSLanResName(null);
        } else {
            this.setSMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="smpslanresname")
    public void setSMPSLanResName(String sMPSLanResName) {
        this._set(DTOFIELD_SMPSLANRESNAME, sMPSLanResName);
    }

    @JsonIgnore
    public String getSMPSLanResName() {
        Object objValue = this._get(DTOFIELD_SMPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMPSLanResNameDirty() {
        return this._contains(DTOFIELD_SMPSLANRESNAME);
    }

    @JsonIgnore
    public void resetSMPSLanResName() {
        this._reset(DTOFIELD_SMPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEUIActionDTO smpslanresname(String sMPSLanResName) {
        this.setSMPSLanResName(sMPSLanResName);
        return this;
    }

    @JsonProperty(value="successinfo")
    public void setSuccessInfo(String successInfo) {
        this._set(DTOFIELD_SUCCESSINFO, successInfo);
    }

    @JsonIgnore
    public String getSuccessInfo() {
        Object objValue = this._get(DTOFIELD_SUCCESSINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSuccessInfoDirty() {
        return this._contains(DTOFIELD_SUCCESSINFO);
    }

    @JsonIgnore
    public void resetSuccessInfo() {
        this._reset(DTOFIELD_SUCCESSINFO);
    }

    @JsonIgnore
    public PSDEUIActionDTO successinfo(String successInfo) {
        this.setSuccessInfo(successInfo);
        return this;
    }

    @JsonProperty(value="sysitemobj")
    public void setSysItemObj(String sysItemObj) {
        this._set(DTOFIELD_SYSITEMOBJ, sysItemObj);
    }

    @JsonIgnore
    public String getSysItemObj() {
        Object objValue = this._get(DTOFIELD_SYSITEMOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysItemObjDirty() {
        return this._contains(DTOFIELD_SYSITEMOBJ);
    }

    @JsonIgnore
    public void resetSysItemObj() {
        this._reset(DTOFIELD_SYSITEMOBJ);
    }

    @JsonIgnore
    public PSDEUIActionDTO sysitemobj(String sysItemObj) {
        this.setSysItemObj(sysItemObj);
        return this;
    }

    @JsonProperty(value="templmode")
    public void setTemplMode(Integer templMode) {
        this._set(DTOFIELD_TEMPLMODE, templMode);
    }

    @JsonIgnore
    public Integer getTemplMode() {
        Object objValue = this._get(DTOFIELD_TEMPLMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplModeDirty() {
        return this._contains(DTOFIELD_TEMPLMODE);
    }

    @JsonIgnore
    public void resetTemplMode() {
        this._reset(DTOFIELD_TEMPLMODE);
    }

    @JsonIgnore
    public PSDEUIActionDTO templmode(Integer templMode) {
        this.setTemplMode(templMode);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO templmode(Boolean templMode) {
        if (templMode == null) {
            this.setTemplMode(null);
        } else {
            this.setTemplMode(templMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="textitem")
    public void setTextItem(String textItem) {
        this._set(DTOFIELD_TEXTITEM, textItem);
    }

    @JsonIgnore
    public String getTextItem() {
        Object objValue = this._get(DTOFIELD_TEXTITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextItemDirty() {
        return this._contains(DTOFIELD_TEXTITEM);
    }

    @JsonIgnore
    public void resetTextItem() {
        this._reset(DTOFIELD_TEXTITEM);
    }

    @JsonIgnore
    public PSDEUIActionDTO textitem(String textItem) {
        this.setTextItem(textItem);
        return this;
    }

    @JsonProperty(value="timeout")
    public void setTimeout(Integer timeout) {
        this._set(DTOFIELD_TIMEOUT, timeout);
    }

    @JsonIgnore
    public Integer getTimeout() {
        Object objValue = this._get(DTOFIELD_TIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutDirty() {
        return this._contains(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public void resetTimeout() {
        this._reset(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public PSDEUIActionDTO timeout(Integer timeout) {
        this.setTimeout(timeout);
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
    public PSDEUIActionDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEUIActionDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
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
    public PSDEUIActionDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    @JsonProperty(value="uatag")
    public void setUATag(String uATag) {
        this._set(DTOFIELD_UATAG, uATag);
    }

    @JsonIgnore
    public String getUATag() {
        Object objValue = this._get(DTOFIELD_UATAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUATagDirty() {
        return this._contains(DTOFIELD_UATAG);
    }

    @JsonIgnore
    public void resetUATag() {
        this._reset(DTOFIELD_UATAG);
    }

    @JsonIgnore
    public PSDEUIActionDTO uatag(String uATag) {
        this.setUATag(uATag);
        return this;
    }

    @JsonProperty(value="uatag2")
    public void setUATag2(String uATag2) {
        this._set(DTOFIELD_UATAG2, uATag2);
    }

    @JsonIgnore
    public String getUATag2() {
        Object objValue = this._get(DTOFIELD_UATAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUATag2Dirty() {
        return this._contains(DTOFIELD_UATAG2);
    }

    @JsonIgnore
    public void resetUATag2() {
        this._reset(DTOFIELD_UATAG2);
    }

    @JsonIgnore
    public PSDEUIActionDTO uatag2(String uATag2) {
        this.setUATag2(uATag2);
        return this;
    }

    @JsonProperty(value="uatag3")
    public void setUATag3(String uATag3) {
        this._set(DTOFIELD_UATAG3, uATag3);
    }

    @JsonIgnore
    public String getUATag3() {
        Object objValue = this._get(DTOFIELD_UATAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUATag3Dirty() {
        return this._contains(DTOFIELD_UATAG3);
    }

    @JsonIgnore
    public void resetUATag3() {
        this._reset(DTOFIELD_UATAG3);
    }

    @JsonIgnore
    public PSDEUIActionDTO uatag3(String uATag3) {
        this.setUATag3(uATag3);
        return this;
    }

    @JsonProperty(value="uatag4")
    public void setUATag4(String uATag4) {
        this._set(DTOFIELD_UATAG4, uATag4);
    }

    @JsonIgnore
    public String getUATag4() {
        Object objValue = this._get(DTOFIELD_UATAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUATag4Dirty() {
        return this._contains(DTOFIELD_UATAG4);
    }

    @JsonIgnore
    public void resetUATag4() {
        this._reset(DTOFIELD_UATAG4);
    }

    @JsonIgnore
    public PSDEUIActionDTO uatag4(String uATag4) {
        this.setUATag4(uATag4);
        return this;
    }

    @JsonProperty(value="uiactioncode")
    public void setUIActionCode(String uIActionCode) {
        this._set(DTOFIELD_UIACTIONCODE, uIActionCode);
    }

    @JsonIgnore
    public String getUIActionCode() {
        Object objValue = this._get(DTOFIELD_UIACTIONCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionCodeDirty() {
        return this._contains(DTOFIELD_UIACTIONCODE);
    }

    @JsonIgnore
    public void resetUIActionCode() {
        this._reset(DTOFIELD_UIACTIONCODE);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactioncode(String uIActionCode) {
        this.setUIActionCode(uIActionCode);
        return this;
    }

    @JsonProperty(value="uiactionparam")
    public void setUIActionParam(String uIActionParam) {
        this._set(DTOFIELD_UIACTIONPARAM, uIActionParam);
    }

    @JsonIgnore
    public String getUIActionParam() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParamDirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM);
    }

    @JsonIgnore
    public void resetUIActionParam() {
        this._reset(DTOFIELD_UIACTIONPARAM);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam(String uIActionParam) {
        this.setUIActionParam(uIActionParam);
        return this;
    }

    @JsonProperty(value="uiactionparam10")
    public void setUIActionParam10(Double uIActionParam10) {
        this._set(DTOFIELD_UIACTIONPARAM10, uIActionParam10);
    }

    @JsonIgnore
    public Double getUIActionParam10() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam10Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM10);
    }

    @JsonIgnore
    public void resetUIActionParam10() {
        this._reset(DTOFIELD_UIACTIONPARAM10);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam10(Double uIActionParam10) {
        this.setUIActionParam10(uIActionParam10);
        return this;
    }

    @JsonProperty(value="uiactionparam11")
    public void setUIActionParam11(Integer uIActionParam11) {
        this._set(DTOFIELD_UIACTIONPARAM11, uIActionParam11);
    }

    @JsonIgnore
    public Integer getUIActionParam11() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam11Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM11);
    }

    @JsonIgnore
    public void resetUIActionParam11() {
        this._reset(DTOFIELD_UIACTIONPARAM11);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam11(Integer uIActionParam11) {
        this.setUIActionParam11(uIActionParam11);
        return this;
    }

    @JsonProperty(value="uiactionparam12")
    public void setUIActionParam12(Integer uIActionParam12) {
        this._set(DTOFIELD_UIACTIONPARAM12, uIActionParam12);
    }

    @JsonIgnore
    public Integer getUIActionParam12() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam12Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM12);
    }

    @JsonIgnore
    public void resetUIActionParam12() {
        this._reset(DTOFIELD_UIACTIONPARAM12);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam12(Integer uIActionParam12) {
        this.setUIActionParam12(uIActionParam12);
        return this;
    }

    @JsonProperty(value="uiactionparam2")
    public void setUIActionParam2(String uIActionParam2) {
        this._set(DTOFIELD_UIACTIONPARAM2, uIActionParam2);
    }

    @JsonIgnore
    public String getUIActionParam2() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam2Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM2);
    }

    @JsonIgnore
    public void resetUIActionParam2() {
        this._reset(DTOFIELD_UIACTIONPARAM2);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam2(String uIActionParam2) {
        this.setUIActionParam2(uIActionParam2);
        return this;
    }

    @JsonProperty(value="uiactionparam3")
    public void setUIActionParam3(String uIActionParam3) {
        this._set(DTOFIELD_UIACTIONPARAM3, uIActionParam3);
    }

    @JsonIgnore
    public String getUIActionParam3() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam3Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM3);
    }

    @JsonIgnore
    public void resetUIActionParam3() {
        this._reset(DTOFIELD_UIACTIONPARAM3);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam3(String uIActionParam3) {
        this.setUIActionParam3(uIActionParam3);
        return this;
    }

    @JsonProperty(value="uiactionparam4")
    public void setUIActionParam4(String uIActionParam4) {
        this._set(DTOFIELD_UIACTIONPARAM4, uIActionParam4);
    }

    @JsonIgnore
    public String getUIActionParam4() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam4Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM4);
    }

    @JsonIgnore
    public void resetUIActionParam4() {
        this._reset(DTOFIELD_UIACTIONPARAM4);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam4(String uIActionParam4) {
        this.setUIActionParam4(uIActionParam4);
        return this;
    }

    @JsonProperty(value="uiactionparam5")
    public void setUIActionParam5(Integer uIActionParam5) {
        this._set(DTOFIELD_UIACTIONPARAM5, uIActionParam5);
    }

    @JsonIgnore
    public Integer getUIActionParam5() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam5Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM5);
    }

    @JsonIgnore
    public void resetUIActionParam5() {
        this._reset(DTOFIELD_UIACTIONPARAM5);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam5(Integer uIActionParam5) {
        this.setUIActionParam5(uIActionParam5);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam5(Boolean uIActionParam5) {
        if (uIActionParam5 == null) {
            this.setUIActionParam5(null);
        } else {
            this.setUIActionParam5(uIActionParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="uiactionparam6")
    public void setUIActionParam6(Integer uIActionParam6) {
        this._set(DTOFIELD_UIACTIONPARAM6, uIActionParam6);
    }

    @JsonIgnore
    public Integer getUIActionParam6() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam6Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM6);
    }

    @JsonIgnore
    public void resetUIActionParam6() {
        this._reset(DTOFIELD_UIACTIONPARAM6);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam6(Integer uIActionParam6) {
        this.setUIActionParam6(uIActionParam6);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam6(Boolean uIActionParam6) {
        if (uIActionParam6 == null) {
            this.setUIActionParam6(null);
        } else {
            this.setUIActionParam6(uIActionParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="uiactionparam7")
    public void setUIActionParam7(Integer uIActionParam7) {
        this._set(DTOFIELD_UIACTIONPARAM7, uIActionParam7);
    }

    @JsonIgnore
    public Integer getUIActionParam7() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam7Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM7);
    }

    @JsonIgnore
    public void resetUIActionParam7() {
        this._reset(DTOFIELD_UIACTIONPARAM7);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam7(Integer uIActionParam7) {
        this.setUIActionParam7(uIActionParam7);
        return this;
    }

    @JsonProperty(value="uiactionparam8")
    public void setUIActionParam8(Integer uIActionParam8) {
        this._set(DTOFIELD_UIACTIONPARAM8, uIActionParam8);
    }

    @JsonIgnore
    public Integer getUIActionParam8() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam8Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM8);
    }

    @JsonIgnore
    public void resetUIActionParam8() {
        this._reset(DTOFIELD_UIACTIONPARAM8);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam8(Integer uIActionParam8) {
        this.setUIActionParam8(uIActionParam8);
        return this;
    }

    @JsonProperty(value="uiactionparam9")
    public void setUIActionParam9(Double uIActionParam9) {
        this._set(DTOFIELD_UIACTIONPARAM9, uIActionParam9);
    }

    @JsonIgnore
    public Double getUIActionParam9() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParam9Dirty() {
        return this._contains(DTOFIELD_UIACTIONPARAM9);
    }

    @JsonIgnore
    public void resetUIActionParam9() {
        this._reset(DTOFIELD_UIACTIONPARAM9);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparam9(Double uIActionParam9) {
        this.setUIActionParam9(uIActionParam9);
        return this;
    }

    @JsonProperty(value="uiactionparams")
    public void setUIActionParams(String uIActionParams) {
        this._set(DTOFIELD_UIACTIONPARAMS, uIActionParams);
    }

    @JsonIgnore
    public String getUIActionParams() {
        Object objValue = this._get(DTOFIELD_UIACTIONPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionParamsDirty() {
        return this._contains(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public void resetUIActionParams() {
        this._reset(DTOFIELD_UIACTIONPARAMS);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactionparams(String uIActionParams) {
        this.setUIActionParams(uIActionParams);
        return this;
    }

    @JsonProperty(value="uiactiontype")
    public void setUIActionType(String uIActionType) {
        this._set(DTOFIELD_UIACTIONTYPE, uIActionType);
    }

    @JsonIgnore
    public String getUIActionType() {
        Object objValue = this._get(DTOFIELD_UIACTIONTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIActionTypeDirty() {
        return this._contains(DTOFIELD_UIACTIONTYPE);
    }

    @JsonIgnore
    public void resetUIActionType() {
        this._reset(DTOFIELD_UIACTIONTYPE);
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactiontype(String uIActionType) {
        this.setUIActionType(uIActionType);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO uiactiontype(PSModelEnums.UIActionType uIActionType) {
        if (uIActionType == null) {
            this.setUIActionType(null);
        } else {
            this.setUIActionType(uIActionType.value);
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
    public PSDEUIActionDTO updatedate(Timestamp updateDate) {
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
    public PSDEUIActionDTO updateman(String updateMan) {
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
    public PSDEUIActionDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userconfirm")
    public void setUserConfirm(Integer userConfirm) {
        this._set(DTOFIELD_USERCONFIRM, userConfirm);
    }

    @JsonIgnore
    public Integer getUserConfirm() {
        Object objValue = this._get(DTOFIELD_USERCONFIRM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserConfirmDirty() {
        return this._contains(DTOFIELD_USERCONFIRM);
    }

    @JsonIgnore
    public void resetUserConfirm() {
        this._reset(DTOFIELD_USERCONFIRM);
    }

    @JsonIgnore
    public PSDEUIActionDTO userconfirm(Integer userConfirm) {
        this.setUserConfirm(userConfirm);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO userconfirm(Boolean userConfirm) {
        if (userConfirm == null) {
            this.setUserConfirm(null);
        } else {
            this.setUserConfirm(userConfirm != false ? 1 : 0);
        }
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
    public PSDEUIActionDTO userparams(String userParams) {
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
    public PSDEUIActionDTO usertag(String userTag) {
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
    public PSDEUIActionDTO usertag2(String userTag2) {
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
    public PSDEUIActionDTO usertag3(String userTag3) {
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
    public PSDEUIActionDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
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
    public PSDEUIActionDTO viewactions(Integer viewActions) {
        this.setViewActions(viewActions);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO viewactions(PSModelEnums.DEViewAction[] viewActions) {
        if (viewActions == null || viewActions.length == 0) {
            this.setViewActions(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEViewAction _item : viewActions) {
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    @JsonProperty(value="viewlogictype")
    public void setViewLogicType(String viewLogicType) {
        this._set(DTOFIELD_VIEWLOGICTYPE, viewLogicType);
    }

    @JsonIgnore
    public String getViewLogicType() {
        Object objValue = this._get(DTOFIELD_VIEWLOGICTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewLogicTypeDirty() {
        return this._contains(DTOFIELD_VIEWLOGICTYPE);
    }

    @JsonIgnore
    public void resetViewLogicType() {
        this._reset(DTOFIELD_VIEWLOGICTYPE);
    }

    @JsonIgnore
    public PSDEUIActionDTO viewlogictype(String viewLogicType) {
        this.setViewLogicType(viewLogicType);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO viewlogictype(PSModelEnums.UIActionTargetUILogic viewLogicType) {
        if (viewLogicType == null) {
            this.setViewLogicType(null);
        } else {
            this.setViewLogicType(viewLogicType.value);
        }
        return this;
    }

    @JsonProperty(value="vlexecmode")
    public void setVLExecMode(String vLExecMode) {
        this._set(DTOFIELD_VLEXECMODE, vLExecMode);
    }

    @JsonIgnore
    public String getVLExecMode() {
        Object objValue = this._get(DTOFIELD_VLEXECMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVLExecModeDirty() {
        return this._contains(DTOFIELD_VLEXECMODE);
    }

    @JsonIgnore
    public void resetVLExecMode() {
        this._reset(DTOFIELD_VLEXECMODE);
    }

    @JsonIgnore
    public PSDEUIActionDTO vlexecmode(String vLExecMode) {
        this.setVLExecMode(vLExecMode);
        return this;
    }

    @JsonIgnore
    public PSDEUIActionDTO vlexecmode(PSModelEnums.UIActionVLExecMode vLExecMode) {
        if (vLExecMode == null) {
            this.setVLExecMode(null);
        } else {
            this.setVLExecMode(vLExecMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEUIActionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEUIActionId(strValue);
    }

    @JsonIgnore
    public PSDEUIActionDTO id(String strValue) {
        this.setPSDEUIActionId(strValue);
        return this;
    }
}
