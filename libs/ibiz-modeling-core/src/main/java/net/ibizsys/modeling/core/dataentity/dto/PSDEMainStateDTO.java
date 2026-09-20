package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEMainStateDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWMODE = "ALLOWMODE";
    protected static final String DTOFIELD_ALLOWMODE = "allowmode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEACTIONDENYMSG = "DEACTIONDENYMSG";
    protected static final String DTOFIELD_DEACTIONDENYMSG = "deactiondenymsg";
    public static final String FIELD_DEACTIONDMPSLANRESID = "DEACTIONDMPSLANRESID";
    protected static final String DTOFIELD_DEACTIONDMPSLANRESID = "deactiondmpslanresid";
    public static final String FIELD_DEACTIONDMPSLANRESNAME = "DEACTIONDMPSLANRESNAME";
    protected static final String DTOFIELD_DEACTIONDMPSLANRESNAME = "deactiondmpslanresname";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_DEOPPRIVDENYMSG = "DEOPPRIVDENYMSG";
    protected static final String DTOFIELD_DEOPPRIVDENYMSG = "deopprivdenymsg";
    public static final String FIELD_DEOPPRIVDMPSLANRESID = "DEOPPRIVDMPSLANRESID";
    protected static final String DTOFIELD_DEOPPRIVDMPSLANRESID = "deopprivdmpslanresid";
    public static final String FIELD_DEOPPRIVDMPSLANRESNAME = "DEOPPRIVDMPSLANRESNAME";
    protected static final String DTOFIELD_DEOPPRIVDMPSLANRESNAME = "deopprivdmpslanresname";
    public static final String FIELD_EDITVIEWTYPE = "EDITVIEWTYPE";
    protected static final String DTOFIELD_EDITVIEWTYPE = "editviewtype";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_ENTERPSDEACTIONID = "ENTERPSDEACTIONID";
    protected static final String DTOFIELD_ENTERPSDEACTIONID = "enterpsdeactionid";
    public static final String FIELD_ENTERPSDEACTIONNAME = "ENTERPSDEACTIONNAME";
    protected static final String DTOFIELD_ENTERPSDEACTIONNAME = "enterpsdeactionname";
    public static final String FIELD_FIELDALLOWMODE = "FIELDALLOWMODE";
    protected static final String DTOFIELD_FIELDALLOWMODE = "fieldallowmode";
    public static final String FIELD_FORMCODENAME = "FORMCODENAME";
    protected static final String DTOFIELD_FORMCODENAME = "formcodename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBEDITVIEWTYPE = "MOBEDITVIEWTYPE";
    protected static final String DTOFIELD_MOBEDITVIEWTYPE = "mobeditviewtype";
    public static final String FIELD_MOBFORMCODENAME = "MOBFORMCODENAME";
    protected static final String DTOFIELD_MOBFORMCODENAME = "mobformcodename";
    public static final String FIELD_MOBPSDEFORMID = "MOBPSDEFORMID";
    protected static final String DTOFIELD_MOBPSDEFORMID = "mobpsdeformid";
    public static final String FIELD_MOBPSDEFORMNAME = "MOBPSDEFORMNAME";
    protected static final String DTOFIELD_MOBPSDEFORMNAME = "mobpsdeformname";
    public static final String FIELD_MOBQUICKFORMCODENAME = "MOBQUICKFORMCODENAME";
    protected static final String DTOFIELD_MOBQUICKFORMCODENAME = "mobquickformcodename";
    public static final String FIELD_MOBQUICKPSDEFORMID = "MOBQUICKPSDEFORMID";
    protected static final String DTOFIELD_MOBQUICKPSDEFORMID = "mobquickpsdeformid";
    public static final String FIELD_MOBQUICKPSDEFORMNAME = "MOBQUICKPSDEFORMNAME";
    protected static final String DTOFIELD_MOBQUICKPSDEFORMNAME = "mobquickpsdeformname";
    public static final String FIELD_MOBUTILFORMCODENAME = "MOBUTILFORMCODENAME";
    protected static final String DTOFIELD_MOBUTILFORMCODENAME = "mobutilformcodename";
    public static final String FIELD_MOBUTILPSDEFORMID = "MOBUTILPSDEFORMID";
    protected static final String DTOFIELD_MOBUTILPSDEFORMID = "mobutilpsdeformid";
    public static final String FIELD_MOBUTILPSDEFORMNAME = "MOBUTILPSDEFORMNAME";
    protected static final String DTOFIELD_MOBUTILPSDEFORMNAME = "mobutilpsdeformname";
    public static final String FIELD_MSTAG = "MSTAG";
    protected static final String DTOFIELD_MSTAG = "mstag";
    public static final String FIELD_MSVALUE = "MSVALUE";
    protected static final String DTOFIELD_MSVALUE = "msvalue";
    public static final String FIELD_MSVALUE2 = "MSVALUE2";
    protected static final String DTOFIELD_MSVALUE2 = "msvalue2";
    public static final String FIELD_MSVALUE3 = "MSVALUE3";
    protected static final String DTOFIELD_MSVALUE3 = "msvalue3";
    public static final String FIELD_OPPRIVALLOWMODE = "OPPRIVALLOWMODE";
    protected static final String DTOFIELD_OPPRIVALLOWMODE = "opprivallowmode";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAINSTATEID = "PSDEMAINSTATEID";
    protected static final String DTOFIELD_PSDEMAINSTATEID = "psdemainstateid";
    public static final String FIELD_PSDEMAINSTATENAME = "PSDEMAINSTATENAME";
    protected static final String DTOFIELD_PSDEMAINSTATENAME = "psdemainstatename";
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
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_QUICKFORMCODENAME = "QUICKFORMCODENAME";
    protected static final String DTOFIELD_QUICKFORMCODENAME = "quickformcodename";
    public static final String FIELD_QUICKPSDEFORMID = "QUICKPSDEFORMID";
    protected static final String DTOFIELD_QUICKPSDEFORMID = "quickpsdeformid";
    public static final String FIELD_QUICKPSDEFORMNAME = "QUICKPSDEFORMNAME";
    protected static final String DTOFIELD_QUICKPSDEFORMNAME = "quickpsdeformname";
    public static final String FIELD_TEXTPSLANRESID = "TEXTPSLANRESID";
    protected static final String DTOFIELD_TEXTPSLANRESID = "textpslanresid";
    public static final String FIELD_TEXTPSLANRESNAME = "TEXTPSLANRESNAME";
    protected static final String DTOFIELD_TEXTPSLANRESNAME = "textpslanresname";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
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
    public static final String FIELD_UTILFORMCODENAME = "UTILFORMCODENAME";
    protected static final String DTOFIELD_UTILFORMCODENAME = "utilformcodename";
    public static final String FIELD_UTILPSDEFORMID = "UTILPSDEFORMID";
    protected static final String DTOFIELD_UTILPSDEFORMID = "utilpsdeformid";
    public static final String FIELD_UTILPSDEFORMNAME = "UTILPSDEFORMNAME";
    protected static final String DTOFIELD_UTILPSDEFORMNAME = "utilpsdeformname";
    public static final String FIELD_VIEWACTIONS = "VIEWACTIONS";
    protected static final String DTOFIELD_VIEWACTIONS = "viewactions";
    public static final String FIELD_WFSTATEMODE = "WFSTATEMODE";
    protected static final String DTOFIELD_WFSTATEMODE = "wfstatemode";
    public static final String DTOFIELD_PSDEMSFIELDS = "psdemsfields";
    public static final String DTOFIELD_PSDEMSOPPRIVS = "psdemsopprivs";
    public static final String DTOFIELD_PSDEMSACTIONS = "psdemsactions";
    public static final String DTOFIELD_PSDEMAINSTATERSS = "psdemainstaters";

    @JsonProperty(value="allowmode")
    public void setAllowMode(String allowMode) {
        this._set(DTOFIELD_ALLOWMODE, allowMode);
    }

    @JsonIgnore
    public String getAllowMode() {
        Object objValue = this._get(DTOFIELD_ALLOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAllowModeDirty() {
        return this._contains(DTOFIELD_ALLOWMODE);
    }

    @JsonIgnore
    public void resetAllowMode() {
        this._reset(DTOFIELD_ALLOWMODE);
    }

    @JsonIgnore
    public PSDEMainStateDTO allowmode(String allowMode) {
        this.setAllowMode(allowMode);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO allowmode(PSModelEnums.DEMSActionMode allowMode) {
        if (allowMode == null) {
            this.setAllowMode(null);
        } else {
            this.setAllowMode(allowMode.value);
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
    public PSDEMainStateDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEMainStateDTO color(String color) {
        this.setColor(color);
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
    public PSDEMainStateDTO createdate(Timestamp createDate) {
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
    public PSDEMainStateDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="deactiondenymsg")
    public void setDEActionDenyMsg(String dEActionDenyMsg) {
        this._set(DTOFIELD_DEACTIONDENYMSG, dEActionDenyMsg);
    }

    @JsonIgnore
    public String getDEActionDenyMsg() {
        Object objValue = this._get(DTOFIELD_DEACTIONDENYMSG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEActionDenyMsgDirty() {
        return this._contains(DTOFIELD_DEACTIONDENYMSG);
    }

    @JsonIgnore
    public void resetDEActionDenyMsg() {
        this._reset(DTOFIELD_DEACTIONDENYMSG);
    }

    @JsonIgnore
    public PSDEMainStateDTO deactiondenymsg(String dEActionDenyMsg) {
        this.setDEActionDenyMsg(dEActionDenyMsg);
        return this;
    }

    @JsonProperty(value="deactiondmpslanresid")
    public void setDEActionDMPSLanResId(String dEActionDMPSLanResId) {
        this._set(DTOFIELD_DEACTIONDMPSLANRESID, dEActionDMPSLanResId);
    }

    @JsonIgnore
    public String getDEActionDMPSLanResId() {
        Object objValue = this._get(DTOFIELD_DEACTIONDMPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEActionDMPSLanResIdDirty() {
        return this._contains(DTOFIELD_DEACTIONDMPSLANRESID);
    }

    @JsonIgnore
    public void resetDEActionDMPSLanResId() {
        this._reset(DTOFIELD_DEACTIONDMPSLANRESID);
    }

    @JsonIgnore
    public PSDEMainStateDTO deactiondmpslanresid(String dEActionDMPSLanResId) {
        this.setDEActionDMPSLanResId(dEActionDMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO deactiondmpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setDEActionDMPSLanResId(null);
            this.setDEActionDMPSLanResName(null);
        } else {
            this.setDEActionDMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDEActionDMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="deactiondmpslanresname")
    public void setDEActionDMPSLanResName(String dEActionDMPSLanResName) {
        this._set(DTOFIELD_DEACTIONDMPSLANRESNAME, dEActionDMPSLanResName);
    }

    @JsonIgnore
    public String getDEActionDMPSLanResName() {
        Object objValue = this._get(DTOFIELD_DEACTIONDMPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEActionDMPSLanResNameDirty() {
        return this._contains(DTOFIELD_DEACTIONDMPSLANRESNAME);
    }

    @JsonIgnore
    public void resetDEActionDMPSLanResName() {
        this._reset(DTOFIELD_DEACTIONDMPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO deactiondmpslanresname(String dEActionDMPSLanResName) {
        this.setDEActionDMPSLanResName(dEActionDMPSLanResName);
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEMainStateDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO defaultmode(PSModelEnums.DEMainStateType defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode.value);
        }
        return this;
    }

    @JsonProperty(value="deopprivdenymsg")
    public void setDEOPPrivDenyMsg(String dEOPPrivDenyMsg) {
        this._set(DTOFIELD_DEOPPRIVDENYMSG, dEOPPrivDenyMsg);
    }

    @JsonIgnore
    public String getDEOPPrivDenyMsg() {
        Object objValue = this._get(DTOFIELD_DEOPPRIVDENYMSG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEOPPrivDenyMsgDirty() {
        return this._contains(DTOFIELD_DEOPPRIVDENYMSG);
    }

    @JsonIgnore
    public void resetDEOPPrivDenyMsg() {
        this._reset(DTOFIELD_DEOPPRIVDENYMSG);
    }

    @JsonIgnore
    public PSDEMainStateDTO deopprivdenymsg(String dEOPPrivDenyMsg) {
        this.setDEOPPrivDenyMsg(dEOPPrivDenyMsg);
        return this;
    }

    @JsonProperty(value="deopprivdmpslanresid")
    public void setDEOPPrivDMPSLanResId(String dEOPPrivDMPSLanResId) {
        this._set(DTOFIELD_DEOPPRIVDMPSLANRESID, dEOPPrivDMPSLanResId);
    }

    @JsonIgnore
    public String getDEOPPrivDMPSLanResId() {
        Object objValue = this._get(DTOFIELD_DEOPPRIVDMPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEOPPrivDMPSLanResIdDirty() {
        return this._contains(DTOFIELD_DEOPPRIVDMPSLANRESID);
    }

    @JsonIgnore
    public void resetDEOPPrivDMPSLanResId() {
        this._reset(DTOFIELD_DEOPPRIVDMPSLANRESID);
    }

    @JsonIgnore
    public PSDEMainStateDTO deopprivdmpslanresid(String dEOPPrivDMPSLanResId) {
        this.setDEOPPrivDMPSLanResId(dEOPPrivDMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO deopprivdmpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setDEOPPrivDMPSLanResId(null);
            this.setDEOPPrivDMPSLanResName(null);
        } else {
            this.setDEOPPrivDMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDEOPPrivDMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="deopprivdmpslanresname")
    public void setDEOPPrivDMPSLanResName(String dEOPPrivDMPSLanResName) {
        this._set(DTOFIELD_DEOPPRIVDMPSLANRESNAME, dEOPPrivDMPSLanResName);
    }

    @JsonIgnore
    public String getDEOPPrivDMPSLanResName() {
        Object objValue = this._get(DTOFIELD_DEOPPRIVDMPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEOPPrivDMPSLanResNameDirty() {
        return this._contains(DTOFIELD_DEOPPRIVDMPSLANRESNAME);
    }

    @JsonIgnore
    public void resetDEOPPrivDMPSLanResName() {
        this._reset(DTOFIELD_DEOPPRIVDMPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO deopprivdmpslanresname(String dEOPPrivDMPSLanResName) {
        this.setDEOPPrivDMPSLanResName(dEOPPrivDMPSLanResName);
        return this;
    }

    @JsonProperty(value="editviewtype")
    public void setEditViewType(String editViewType) {
        this._set(DTOFIELD_EDITVIEWTYPE, editViewType);
    }

    @JsonIgnore
    public String getEditViewType() {
        Object objValue = this._get(DTOFIELD_EDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditViewTypeDirty() {
        return this._contains(DTOFIELD_EDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetEditViewType() {
        this._reset(DTOFIELD_EDITVIEWTYPE);
    }

    @JsonIgnore
    public PSDEMainStateDTO editviewtype(String editViewType) {
        this.setEditViewType(editViewType);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO editviewtype(PSModelEnums.DEEditViewType editViewType) {
        if (editViewType == null) {
            this.setEditViewType(null);
        } else {
            this.setEditViewType(editViewType.value);
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
    public PSDEMainStateDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enterpsdeactionid")
    public void setEnterPSDEActionId(String enterPSDEActionId) {
        this._set(DTOFIELD_ENTERPSDEACTIONID, enterPSDEActionId);
    }

    @JsonIgnore
    public String getEnterPSDEActionId() {
        Object objValue = this._get(DTOFIELD_ENTERPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnterPSDEActionIdDirty() {
        return this._contains(DTOFIELD_ENTERPSDEACTIONID);
    }

    @JsonIgnore
    public void resetEnterPSDEActionId() {
        this._reset(DTOFIELD_ENTERPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEMainStateDTO enterpsdeactionid(String enterPSDEActionId) {
        this.setEnterPSDEActionId(enterPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO enterpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setEnterPSDEActionId(null);
            this.setEnterPSDEActionName(null);
        } else {
            this.setEnterPSDEActionId(pSDEAction.getPSDEActionId());
            this.setEnterPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="enterpsdeactionname")
    public void setEnterPSDEActionName(String enterPSDEActionName) {
        this._set(DTOFIELD_ENTERPSDEACTIONNAME, enterPSDEActionName);
    }

    @JsonIgnore
    public String getEnterPSDEActionName() {
        Object objValue = this._get(DTOFIELD_ENTERPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnterPSDEActionNameDirty() {
        return this._contains(DTOFIELD_ENTERPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetEnterPSDEActionName() {
        this._reset(DTOFIELD_ENTERPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO enterpsdeactionname(String enterPSDEActionName) {
        this.setEnterPSDEActionName(enterPSDEActionName);
        return this;
    }

    @JsonProperty(value="fieldallowmode")
    public void setFieldAllowMode(String fieldAllowMode) {
        this._set(DTOFIELD_FIELDALLOWMODE, fieldAllowMode);
    }

    @JsonIgnore
    public String getFieldAllowMode() {
        Object objValue = this._get(DTOFIELD_FIELDALLOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldAllowModeDirty() {
        return this._contains(DTOFIELD_FIELDALLOWMODE);
    }

    @JsonIgnore
    public void resetFieldAllowMode() {
        this._reset(DTOFIELD_FIELDALLOWMODE);
    }

    @JsonIgnore
    public PSDEMainStateDTO fieldallowmode(String fieldAllowMode) {
        this.setFieldAllowMode(fieldAllowMode);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO fieldallowmode(PSModelEnums.DEMSActionMode fieldAllowMode) {
        if (fieldAllowMode == null) {
            this.setFieldAllowMode(null);
        } else {
            this.setFieldAllowMode(fieldAllowMode.value);
        }
        return this;
    }

    @JsonProperty(value="formcodename")
    public void setFormCodeName(String formCodeName) {
        this._set(DTOFIELD_FORMCODENAME, formCodeName);
    }

    @JsonIgnore
    public String getFormCodeName() {
        Object objValue = this._get(DTOFIELD_FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCodeNameDirty() {
        return this._contains(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public void resetFormCodeName() {
        this._reset(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO formcodename(String formCodeName) {
        this.setFormCodeName(formCodeName);
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
    public PSDEMainStateDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobeditviewtype")
    public void setMobEditViewType(String mobEditViewType) {
        this._set(DTOFIELD_MOBEDITVIEWTYPE, mobEditViewType);
    }

    @JsonIgnore
    public String getMobEditViewType() {
        Object objValue = this._get(DTOFIELD_MOBEDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobEditViewTypeDirty() {
        return this._contains(DTOFIELD_MOBEDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetMobEditViewType() {
        this._reset(DTOFIELD_MOBEDITVIEWTYPE);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobeditviewtype(String mobEditViewType) {
        this.setMobEditViewType(mobEditViewType);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO mobeditviewtype(PSModelEnums.DEMobEditViewType mobEditViewType) {
        if (mobEditViewType == null) {
            this.setMobEditViewType(null);
        } else {
            this.setMobEditViewType(mobEditViewType.value);
        }
        return this;
    }

    @JsonProperty(value="mobformcodename")
    public void setMobFormCodeName(String mobFormCodeName) {
        this._set(DTOFIELD_MOBFORMCODENAME, mobFormCodeName);
    }

    @JsonIgnore
    public String getMobFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobFormCodeName() {
        this._reset(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobformcodename(String mobFormCodeName) {
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    @JsonProperty(value="mobpsdeformid")
    public void setMobPSDEFormId(String mobPSDEFormId) {
        this._set(DTOFIELD_MOBPSDEFORMID, mobPSDEFormId);
    }

    @JsonIgnore
    public String getMobPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobPSDEFormId() {
        this._reset(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobpsdeformid(String mobPSDEFormId) {
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO mobpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobFormCodeName(null);
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        } else {
            this.setMobFormCodeName(pSDEForm.getCodeName());
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeformname")
    public void setMobPSDEFormName(String mobPSDEFormName) {
        this._set(DTOFIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }

    @JsonIgnore
    public String getMobPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobPSDEFormName() {
        this._reset(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobpsdeformname(String mobPSDEFormName) {
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    @JsonProperty(value="mobquickformcodename")
    public void setMobQuickFormCodeName(String mobQuickFormCodeName) {
        this._set(DTOFIELD_MOBQUICKFORMCODENAME, mobQuickFormCodeName);
    }

    @JsonIgnore
    public String getMobQuickFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBQUICKFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobQuickFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBQUICKFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobQuickFormCodeName() {
        this._reset(DTOFIELD_MOBQUICKFORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobquickformcodename(String mobQuickFormCodeName) {
        this.setMobQuickFormCodeName(mobQuickFormCodeName);
        return this;
    }

    @JsonProperty(value="mobquickpsdeformid")
    public void setMobQuickPSDEFormId(String mobQuickPSDEFormId) {
        this._set(DTOFIELD_MOBQUICKPSDEFORMID, mobQuickPSDEFormId);
    }

    @JsonIgnore
    public String getMobQuickPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBQUICKPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobQuickPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBQUICKPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobQuickPSDEFormId() {
        this._reset(DTOFIELD_MOBQUICKPSDEFORMID);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobquickpsdeformid(String mobQuickPSDEFormId) {
        this.setMobQuickPSDEFormId(mobQuickPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO mobquickpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobQuickFormCodeName(null);
            this.setMobQuickPSDEFormId(null);
            this.setMobQuickPSDEFormName(null);
        } else {
            this.setMobQuickFormCodeName(pSDEForm.getCodeName());
            this.setMobQuickPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobQuickPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobquickpsdeformname")
    public void setMobQuickPSDEFormName(String mobQuickPSDEFormName) {
        this._set(DTOFIELD_MOBQUICKPSDEFORMNAME, mobQuickPSDEFormName);
    }

    @JsonIgnore
    public String getMobQuickPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBQUICKPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobQuickPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBQUICKPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobQuickPSDEFormName() {
        this._reset(DTOFIELD_MOBQUICKPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobquickpsdeformname(String mobQuickPSDEFormName) {
        this.setMobQuickPSDEFormName(mobQuickPSDEFormName);
        return this;
    }

    @JsonProperty(value="mobutilformcodename")
    public void setMobUtilFormCodeName(String mobUtilFormCodeName) {
        this._set(DTOFIELD_MOBUTILFORMCODENAME, mobUtilFormCodeName);
    }

    @JsonIgnore
    public String getMobUtilFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBUTILFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBUTILFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobUtilFormCodeName() {
        this._reset(DTOFIELD_MOBUTILFORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobutilformcodename(String mobUtilFormCodeName) {
        this.setMobUtilFormCodeName(mobUtilFormCodeName);
        return this;
    }

    @JsonProperty(value="mobutilpsdeformid")
    public void setMobUtilPSDEFormId(String mobUtilPSDEFormId) {
        this._set(DTOFIELD_MOBUTILPSDEFORMID, mobUtilPSDEFormId);
    }

    @JsonIgnore
    public String getMobUtilPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBUTILPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBUTILPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobUtilPSDEFormId() {
        this._reset(DTOFIELD_MOBUTILPSDEFORMID);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobutilpsdeformid(String mobUtilPSDEFormId) {
        this.setMobUtilPSDEFormId(mobUtilPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO mobutilpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobUtilFormCodeName(null);
            this.setMobUtilPSDEFormId(null);
            this.setMobUtilPSDEFormName(null);
        } else {
            this.setMobUtilFormCodeName(pSDEForm.getCodeName());
            this.setMobUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobutilpsdeformname")
    public void setMobUtilPSDEFormName(String mobUtilPSDEFormName) {
        this._set(DTOFIELD_MOBUTILPSDEFORMNAME, mobUtilPSDEFormName);
    }

    @JsonIgnore
    public String getMobUtilPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBUTILPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobUtilPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBUTILPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobUtilPSDEFormName() {
        this._reset(DTOFIELD_MOBUTILPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO mobutilpsdeformname(String mobUtilPSDEFormName) {
        this.setMobUtilPSDEFormName(mobUtilPSDEFormName);
        return this;
    }

    @JsonProperty(value="mstag")
    public void setMSTag(String mSTag) {
        this._set(DTOFIELD_MSTAG, mSTag);
    }

    @JsonIgnore
    public String getMSTag() {
        Object objValue = this._get(DTOFIELD_MSTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSTagDirty() {
        return this._contains(DTOFIELD_MSTAG);
    }

    @JsonIgnore
    public void resetMSTag() {
        this._reset(DTOFIELD_MSTAG);
    }

    @JsonIgnore
    public PSDEMainStateDTO mstag(String mSTag) {
        this.setMSTag(mSTag);
        return this;
    }

    @JsonProperty(value="msvalue")
    public void setMSValue(String mSValue) {
        this._set(DTOFIELD_MSVALUE, mSValue);
    }

    @JsonIgnore
    public String getMSValue() {
        Object objValue = this._get(DTOFIELD_MSVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSValueDirty() {
        return this._contains(DTOFIELD_MSVALUE);
    }

    @JsonIgnore
    public void resetMSValue() {
        this._reset(DTOFIELD_MSVALUE);
    }

    @JsonIgnore
    public PSDEMainStateDTO msvalue(String mSValue) {
        this.setMSValue(mSValue);
        return this;
    }

    @JsonProperty(value="msvalue2")
    public void setMSValue2(String mSValue2) {
        this._set(DTOFIELD_MSVALUE2, mSValue2);
    }

    @JsonIgnore
    public String getMSValue2() {
        Object objValue = this._get(DTOFIELD_MSVALUE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSValue2Dirty() {
        return this._contains(DTOFIELD_MSVALUE2);
    }

    @JsonIgnore
    public void resetMSValue2() {
        this._reset(DTOFIELD_MSVALUE2);
    }

    @JsonIgnore
    public PSDEMainStateDTO msvalue2(String mSValue2) {
        this.setMSValue2(mSValue2);
        return this;
    }

    @JsonProperty(value="msvalue3")
    public void setMSValue3(String mSValue3) {
        this._set(DTOFIELD_MSVALUE3, mSValue3);
    }

    @JsonIgnore
    public String getMSValue3() {
        Object objValue = this._get(DTOFIELD_MSVALUE3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSValue3Dirty() {
        return this._contains(DTOFIELD_MSVALUE3);
    }

    @JsonIgnore
    public void resetMSValue3() {
        this._reset(DTOFIELD_MSVALUE3);
    }

    @JsonIgnore
    public PSDEMainStateDTO msvalue3(String mSValue3) {
        this.setMSValue3(mSValue3);
        return this;
    }

    @JsonProperty(value="opprivallowmode")
    public void setOPPrivAllowMode(String oPPrivAllowMode) {
        this._set(DTOFIELD_OPPRIVALLOWMODE, oPPrivAllowMode);
    }

    @JsonIgnore
    public String getOPPrivAllowMode() {
        Object objValue = this._get(DTOFIELD_OPPRIVALLOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOPPrivAllowModeDirty() {
        return this._contains(DTOFIELD_OPPRIVALLOWMODE);
    }

    @JsonIgnore
    public void resetOPPrivAllowMode() {
        this._reset(DTOFIELD_OPPRIVALLOWMODE);
    }

    @JsonIgnore
    public PSDEMainStateDTO opprivallowmode(String oPPrivAllowMode) {
        this.setOPPrivAllowMode(oPPrivAllowMode);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO opprivallowmode(PSModelEnums.DEMSActionMode oPPrivAllowMode) {
        if (oPPrivAllowMode == null) {
            this.setOPPrivAllowMode(null);
        } else {
            this.setOPPrivAllowMode(oPPrivAllowMode.value);
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
    public PSDEMainStateDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdedqid")
    public void setPSDEDQId(String pSDEDQId) {
        this._set(DTOFIELD_PSDEDQID, pSDEDQId);
    }

    @JsonIgnore
    public String getPSDEDQId() {
        Object objValue = this._get(DTOFIELD_PSDEDQID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQIdDirty() {
        return this._contains(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public void resetPSDEDQId() {
        this._reset(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public PSDEMainStateDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedqname")
    public void setPSDEDQName(String pSDEDQName) {
        this._set(DTOFIELD_PSDEDQNAME, pSDEDQName);
    }

    @JsonIgnore
    public String getPSDEDQName() {
        Object objValue = this._get(DTOFIELD_PSDEDQNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQNameDirty() {
        return this._contains(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public void resetPSDEDQName() {
        this._reset(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
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
    public PSDEMainStateDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setFormCodeName(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setFormCodeName(pSDEForm.getCodeName());
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
    public PSDEMainStateDTO psdeformname(String pSDEFormName) {
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
    public PSDEMainStateDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstateid")
    public void setPSDEMainStateId(String pSDEMainStateId) {
        this._set(DTOFIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }

    @JsonIgnore
    public String getPSDEMainStateId() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateIdDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public void resetPSDEMainStateId() {
        this._reset(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public PSDEMainStateDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonProperty(value="psdemainstatename")
    public void setPSDEMainStateName(String pSDEMainStateName) {
        this._set(DTOFIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }

    @JsonIgnore
    public String getPSDEMainStateName() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateNameDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public void resetPSDEMainStateName() {
        this._reset(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO psdemainstatename(String pSDEMainStateName) {
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEMainStateName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEMainStateName(strName);
    }

    @JsonIgnore
    public PSDEMainStateDTO name(String strName) {
        this.setPSDEMainStateName(strName);
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
    public PSDEMainStateDTO psdename(String pSDEName) {
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
    public PSDEMainStateDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEMainStateDTO pssyscssname(String pSSysCssName) {
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
    public PSDEMainStateDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEMainStateDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEMainStateDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEMainStateDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="quickformcodename")
    public void setQuickFormCodeName(String quickFormCodeName) {
        this._set(DTOFIELD_QUICKFORMCODENAME, quickFormCodeName);
    }

    @JsonIgnore
    public String getQuickFormCodeName() {
        Object objValue = this._get(DTOFIELD_QUICKFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickFormCodeNameDirty() {
        return this._contains(DTOFIELD_QUICKFORMCODENAME);
    }

    @JsonIgnore
    public void resetQuickFormCodeName() {
        this._reset(DTOFIELD_QUICKFORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO quickformcodename(String quickFormCodeName) {
        this.setQuickFormCodeName(quickFormCodeName);
        return this;
    }

    @JsonProperty(value="quickpsdeformid")
    public void setQuickPSDEFormId(String quickPSDEFormId) {
        this._set(DTOFIELD_QUICKPSDEFORMID, quickPSDEFormId);
    }

    @JsonIgnore
    public String getQuickPSDEFormId() {
        Object objValue = this._get(DTOFIELD_QUICKPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEFormIdDirty() {
        return this._contains(DTOFIELD_QUICKPSDEFORMID);
    }

    @JsonIgnore
    public void resetQuickPSDEFormId() {
        this._reset(DTOFIELD_QUICKPSDEFORMID);
    }

    @JsonIgnore
    public PSDEMainStateDTO quickpsdeformid(String quickPSDEFormId) {
        this.setQuickPSDEFormId(quickPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO quickpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setQuickFormCodeName(null);
            this.setQuickPSDEFormId(null);
            this.setQuickPSDEFormName(null);
        } else {
            this.setQuickFormCodeName(pSDEForm.getCodeName());
            this.setQuickPSDEFormId(pSDEForm.getPSDEFormId());
            this.setQuickPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="quickpsdeformname")
    public void setQuickPSDEFormName(String quickPSDEFormName) {
        this._set(DTOFIELD_QUICKPSDEFORMNAME, quickPSDEFormName);
    }

    @JsonIgnore
    public String getQuickPSDEFormName() {
        Object objValue = this._get(DTOFIELD_QUICKPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQuickPSDEFormNameDirty() {
        return this._contains(DTOFIELD_QUICKPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetQuickPSDEFormName() {
        this._reset(DTOFIELD_QUICKPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO quickpsdeformname(String quickPSDEFormName) {
        this.setQuickPSDEFormName(quickPSDEFormName);
        return this;
    }

    @JsonProperty(value="textpslanresid")
    public void setTextPSLanResId(String textPSLanResId) {
        this._set(DTOFIELD_TEXTPSLANRESID, textPSLanResId);
    }

    @JsonIgnore
    public String getTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_TEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_TEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetTextPSLanResId() {
        this._reset(DTOFIELD_TEXTPSLANRESID);
    }

    @JsonIgnore
    public PSDEMainStateDTO textpslanresid(String textPSLanResId) {
        this.setTextPSLanResId(textPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO textpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTextPSLanResId(null);
            this.setTextPSLanResName(null);
        } else {
            this.setTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="textpslanresname")
    public void setTextPSLanResName(String textPSLanResName) {
        this._set(DTOFIELD_TEXTPSLANRESNAME, textPSLanResName);
    }

    @JsonIgnore
    public String getTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_TEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_TEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTextPSLanResName() {
        this._reset(DTOFIELD_TEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO textpslanresname(String textPSLanResName) {
        this.setTextPSLanResName(textPSLanResName);
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
    public PSDEMainStateDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEMainStateDTO tippslanresname(String tipPSLanResName) {
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
    public PSDEMainStateDTO tooltipinfo(String tooltipInfo) {
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
    public PSDEMainStateDTO updatedate(Timestamp updateDate) {
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
    public PSDEMainStateDTO updateman(String updateMan) {
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
    public PSDEMainStateDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEMainStateDTO usertag(String userTag) {
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
    public PSDEMainStateDTO usertag2(String userTag2) {
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
    public PSDEMainStateDTO usertag3(String userTag3) {
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
    public PSDEMainStateDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="utilformcodename")
    public void setUtilFormCodeName(String utilFormCodeName) {
        this._set(DTOFIELD_UTILFORMCODENAME, utilFormCodeName);
    }

    @JsonIgnore
    public String getUtilFormCodeName() {
        Object objValue = this._get(DTOFIELD_UTILFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilFormCodeNameDirty() {
        return this._contains(DTOFIELD_UTILFORMCODENAME);
    }

    @JsonIgnore
    public void resetUtilFormCodeName() {
        this._reset(DTOFIELD_UTILFORMCODENAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO utilformcodename(String utilFormCodeName) {
        this.setUtilFormCodeName(utilFormCodeName);
        return this;
    }

    @JsonProperty(value="utilpsdeformid")
    public void setUtilPSDEFormId(String utilPSDEFormId) {
        this._set(DTOFIELD_UTILPSDEFORMID, utilPSDEFormId);
    }

    @JsonIgnore
    public String getUtilPSDEFormId() {
        Object objValue = this._get(DTOFIELD_UTILPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEFormIdDirty() {
        return this._contains(DTOFIELD_UTILPSDEFORMID);
    }

    @JsonIgnore
    public void resetUtilPSDEFormId() {
        this._reset(DTOFIELD_UTILPSDEFORMID);
    }

    @JsonIgnore
    public PSDEMainStateDTO utilpsdeformid(String utilPSDEFormId) {
        this.setUtilPSDEFormId(utilPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO utilpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setUtilFormCodeName(null);
            this.setUtilPSDEFormId(null);
            this.setUtilPSDEFormName(null);
        } else {
            this.setUtilFormCodeName(pSDEForm.getCodeName());
            this.setUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="utilpsdeformname")
    public void setUtilPSDEFormName(String utilPSDEFormName) {
        this._set(DTOFIELD_UTILPSDEFORMNAME, utilPSDEFormName);
    }

    @JsonIgnore
    public String getUtilPSDEFormName() {
        Object objValue = this._get(DTOFIELD_UTILPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEFormNameDirty() {
        return this._contains(DTOFIELD_UTILPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetUtilPSDEFormName() {
        this._reset(DTOFIELD_UTILPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEMainStateDTO utilpsdeformname(String utilPSDEFormName) {
        this.setUtilPSDEFormName(utilPSDEFormName);
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
    public PSDEMainStateDTO viewactions(Integer viewActions) {
        this.setViewActions(viewActions);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO viewactions(PSModelEnums.DEViewAction[] viewActions) {
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

    @JsonProperty(value="wfstatemode")
    public void setWFStateMode(Integer wFStateMode) {
        this._set(DTOFIELD_WFSTATEMODE, wFStateMode);
    }

    @JsonIgnore
    public Integer getWFStateMode() {
        Object objValue = this._get(DTOFIELD_WFSTATEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWFStateModeDirty() {
        return this._contains(DTOFIELD_WFSTATEMODE);
    }

    @JsonIgnore
    public void resetWFStateMode() {
        this._reset(DTOFIELD_WFSTATEMODE);
    }

    @JsonIgnore
    public PSDEMainStateDTO wfstatemode(Integer wFStateMode) {
        this.setWFStateMode(wFStateMode);
        return this;
    }

    @JsonIgnore
    public PSDEMainStateDTO wfstatemode(PSModelEnums.DEMSWFStateMode wFStateMode) {
        if (wFStateMode == null) {
            this.setWFStateMode(null);
        } else {
            this.setWFStateMode(wFStateMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEMainStateId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEMainStateId(strValue);
    }

    @JsonIgnore
    public PSDEMainStateDTO id(String strValue) {
        this.setPSDEMainStateId(strValue);
        return this;
    }

    @JsonIgnore
    public List<Object> getPSDEMSFields() {
        Object list = this._get(DTOFIELD_PSDEMSFIELDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemsfields")
    public void setPSDEMSFields(List<Object> psdemsfields) {
        this._set(DTOFIELD_PSDEMSFIELDS, psdemsfields);
    }

    @JsonIgnore
    public List<Object> getPSDEMSFieldsIf() {
        Object list = this._get(DTOFIELD_PSDEMSFIELDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMSFIELDS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<Object> getPSDEMSOPPrivs() {
        Object list = this._get(DTOFIELD_PSDEMSOPPRIVS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemsopprivs")
    public void setPSDEMSOPPrivs(List<Object> psdemsopprivs) {
        this._set(DTOFIELD_PSDEMSOPPRIVS, psdemsopprivs);
    }

    @JsonIgnore
    public List<Object> getPSDEMSOPPrivsIf() {
        Object list = this._get(DTOFIELD_PSDEMSOPPRIVS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMSOPPRIVS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<Object> getPSDEMSActions() {
        Object list = this._get(DTOFIELD_PSDEMSACTIONS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemsactions")
    public void setPSDEMSActions(List<Object> psdemsactions) {
        this._set(DTOFIELD_PSDEMSACTIONS, psdemsactions);
    }

    @JsonIgnore
    public List<Object> getPSDEMSActionsIf() {
        Object list = this._get(DTOFIELD_PSDEMSACTIONS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMSACTIONS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEMainStateRSDTO> getPSDEMainStateRSs() {
        Object list = this._get(DTOFIELD_PSDEMAINSTATERSS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemainstaters")
    public void setPSDEMainStateRSs(List<PSDEMainStateRSDTO> psdemainstaters) {
        this._set(DTOFIELD_PSDEMAINSTATERSS, psdemainstaters);
    }

    @JsonIgnore
    public List<PSDEMainStateRSDTO> getPSDEMainStateRSsIf() {
        Object list = this._get(DTOFIELD_PSDEMAINSTATERSS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMAINSTATERSS, list);
        }
        return (List) list;
    }
}
