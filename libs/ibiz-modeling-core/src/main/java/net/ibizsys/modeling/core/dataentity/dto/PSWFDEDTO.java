package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFDEDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONMOBPSDEVIEWID = "ACTIONMOBPSDEVIEWID";
    protected static final String DTOFIELD_ACTIONMOBPSDEVIEWID = "actionmobpsdeviewid";
    public static final String FIELD_ACTIONMOBPSDEVIEWNAME = "ACTIONMOBPSDEVIEWNAME";
    protected static final String DTOFIELD_ACTIONMOBPSDEVIEWNAME = "actionmobpsdeviewname";
    public static final String FIELD_ACTIONPSDEVIEWID = "ACTIONPSDEVIEWID";
    protected static final String DTOFIELD_ACTIONPSDEVIEWID = "actionpsdeviewid";
    public static final String FIELD_ACTIONPSDEVIEWNAME = "ACTIONPSDEVIEWNAME";
    protected static final String DTOFIELD_ACTIONPSDEVIEWNAME = "actionpsdeviewname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_EDITABLEWFSTEP = "EDITABLEWFSTEP";
    protected static final String DTOFIELD_EDITABLEWFSTEP = "editablewfstep";
    public static final String FIELD_EDITVIEWURI = "EDITVIEWURI";
    protected static final String DTOFIELD_EDITVIEWURI = "editviewuri";
    public static final String FIELD_EXTCNTSTATES = "EXTCNTSTATES";
    protected static final String DTOFIELD_EXTCNTSTATES = "extcntstates";
    public static final String FIELD_FINISHPSDEACTIONID = "FINISHPSDEACTIONID";
    protected static final String DTOFIELD_FINISHPSDEACTIONID = "finishpsdeactionid";
    public static final String FIELD_FINISHPSDEACTIONNAME = "FINISHPSDEACTIONNAME";
    protected static final String DTOFIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";
    public static final String FIELD_INITPSDEACTIONID = "INITPSDEACTIONID";
    protected static final String DTOFIELD_INITPSDEACTIONID = "initpsdeactionid";
    public static final String FIELD_INITPSDEACTIONNAME = "INITPSDEACTIONNAME";
    protected static final String DTOFIELD_INITPSDEACTIONNAME = "initpsdeactionname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBEDITVIEWURI = "MOBEDITVIEWURI";
    protected static final String DTOFIELD_MOBEDITVIEWURI = "mobeditviewuri";
    public static final String FIELD_MOBPROXYDATA2PSDEVIEWID = "MOBPROXYDATA2PSDEVIEWID";
    protected static final String DTOFIELD_MOBPROXYDATA2PSDEVIEWID = "mobproxydata2psdeviewid";
    public static final String FIELD_MOBPROXYDATA2PSDEVIEWNAME = "MOBPROXYDATA2PSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPROXYDATA2PSDEVIEWNAME = "mobproxydata2psdeviewname";
    public static final String FIELD_MOBPROXYDATAPSDEVIEWID = "MOBPROXYDATAPSDEVIEWID";
    protected static final String DTOFIELD_MOBPROXYDATAPSDEVIEWID = "mobproxydatapsdeviewid";
    public static final String FIELD_MOBPROXYDATAPSDEVIEWNAME = "MOBPROXYDATAPSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPROXYDATAPSDEVIEWNAME = "mobproxydatapsdeviewname";
    public static final String FIELD_MYWFDATA = "MYWFDATA";
    protected static final String DTOFIELD_MYWFDATA = "mywfdata";
    public static final String FIELD_MYWFDATAPSLANRESID = "MYWFDATAPSLANRESID";
    protected static final String DTOFIELD_MYWFDATAPSLANRESID = "mywfdatapslanresid";
    public static final String FIELD_MYWFDATAPSLANRESNAME = "MYWFDATAPSLANRESNAME";
    protected static final String DTOFIELD_MYWFDATAPSLANRESNAME = "mywfdatapslanresname";
    public static final String FIELD_MYWFWORK = "MYWFWORK";
    protected static final String DTOFIELD_MYWFWORK = "mywfwork";
    public static final String FIELD_MYWFWORKPSLANRESID = "MYWFWORKPSLANRESID";
    protected static final String DTOFIELD_MYWFWORKPSLANRESID = "mywfworkpslanresid";
    public static final String FIELD_MYWFWORKPSLANRESNAME = "MYWFWORKPSLANRESNAME";
    protected static final String DTOFIELD_MYWFWORKPSLANRESNAME = "mywfworkpslanresname";
    public static final String FIELD_PROXYDATA2PSDEVIEWID = "PROXYDATA2PSDEVIEWID";
    protected static final String DTOFIELD_PROXYDATA2PSDEVIEWID = "proxydata2psdeviewid";
    public static final String FIELD_PROXYDATA2PSDEVIEWNAME = "PROXYDATA2PSDEVIEWNAME";
    protected static final String DTOFIELD_PROXYDATA2PSDEVIEWNAME = "proxydata2psdeviewname";
    public static final String FIELD_PROXYDATAPSDEFID = "PROXYDATAPSDEFID";
    protected static final String DTOFIELD_PROXYDATAPSDEFID = "proxydatapsdefid";
    public static final String FIELD_PROXYDATAPSDEFNAME = "PROXYDATAPSDEFNAME";
    protected static final String DTOFIELD_PROXYDATAPSDEFNAME = "proxydatapsdefname";
    public static final String FIELD_PROXYDATAPSDEVIEWID = "PROXYDATAPSDEVIEWID";
    protected static final String DTOFIELD_PROXYDATAPSDEVIEWID = "proxydatapsdeviewid";
    public static final String FIELD_PROXYDATAPSDEVIEWNAME = "PROXYDATAPSDEVIEWNAME";
    protected static final String DTOFIELD_PROXYDATAPSDEVIEWNAME = "proxydatapsdeviewname";
    public static final String FIELD_PROXYMODULEPSDEFID = "PROXYMODULEPSDEFID";
    protected static final String DTOFIELD_PROXYMODULEPSDEFID = "proxymodulepsdefid";
    public static final String FIELD_PROXYMODULEPSDEFNAME = "PROXYMODULEPSDEFNAME";
    protected static final String DTOFIELD_PROXYMODULEPSDEFNAME = "proxymodulepsdefname";
    public static final String FIELD_PROXYWFPSDEFID = "PROXYWFPSDEFID";
    protected static final String DTOFIELD_PROXYWFPSDEFID = "proxywfpsdefid";
    public static final String FIELD_PROXYWFPSDEFNAME = "PROXYWFPSDEFNAME";
    protected static final String DTOFIELD_PROXYWFPSDEFNAME = "proxywfpsdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSWFCATID = "PSSYSWFCATID";
    protected static final String DTOFIELD_PSSYSWFCATID = "pssyswfcatid";
    public static final String FIELD_PSSYSWFCATNAME = "PSSYSWFCATNAME";
    protected static final String DTOFIELD_PSSYSWFCATNAME = "pssyswfcatname";
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
    public static final String FIELD_PSWFDENAME = "PSWFDENAME";
    protected static final String DTOFIELD_PSWFDENAME = "pswfdename";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFNAME = "PSWFNAME";
    protected static final String DTOFIELD_PSWFNAME = "pswfname";
    public static final String FIELD_PWFINSTPSDEFID = "PWFINSTPSDEFID";
    protected static final String DTOFIELD_PWFINSTPSDEFID = "pwfinstpsdefid";
    public static final String FIELD_PWFINSTPSDEFNAME = "PWFINSTPSDEFNAME";
    protected static final String DTOFIELD_PWFINSTPSDEFNAME = "pwfinstpsdefname";
    public static final String FIELD_STARTMOBPSDEVIEWID = "STARTMOBPSDEVIEWID";
    protected static final String DTOFIELD_STARTMOBPSDEVIEWID = "startmobpsdeviewid";
    public static final String FIELD_STARTMOBPSDEVIEWNAME = "STARTMOBPSDEVIEWNAME";
    protected static final String DTOFIELD_STARTMOBPSDEVIEWNAME = "startmobpsdeviewname";
    public static final String FIELD_STARTPSDEVIEWID = "STARTPSDEVIEWID";
    protected static final String DTOFIELD_STARTPSDEVIEWID = "startpsdeviewid";
    public static final String FIELD_STARTPSDEVIEWNAME = "STARTPSDEVIEWNAME";
    protected static final String DTOFIELD_STARTPSDEVIEWNAME = "startpsdeviewname";
    public static final String FIELD_STATEPSDEFID = "STATEPSDEFID";
    protected static final String DTOFIELD_STATEPSDEFID = "statepsdefid";
    public static final String FIELD_STATEPSDEFNAME = "STATEPSDEFNAME";
    protected static final String DTOFIELD_STATEPSDEFNAME = "statepsdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERSTART = "USERSTART";
    protected static final String DTOFIELD_USERSTART = "userstart";
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
    public static final String FIELD_WFACTORPSDEFID = "WFACTORPSDEFID";
    protected static final String DTOFIELD_WFACTORPSDEFID = "wfactorpsdefid";
    public static final String FIELD_WFACTORPSDEFNAME = "WFACTORPSDEFNAME";
    protected static final String DTOFIELD_WFACTORPSDEFNAME = "wfactorpsdefname";
    public static final String FIELD_WFCATCODE = "WFCATCODE";
    protected static final String DTOFIELD_WFCATCODE = "wfcatcode";
    public static final String FIELD_WFCODENAME = "WFCODENAME";
    protected static final String DTOFIELD_WFCODENAME = "wfcodename";
    public static final String FIELD_WFIDPSDEFID = "WFIDPSDEFID";
    protected static final String DTOFIELD_WFIDPSDEFID = "wfidpsdefid";
    public static final String FIELD_WFIDPSDEFNAME = "WFIDPSDEFNAME";
    protected static final String DTOFIELD_WFIDPSDEFNAME = "wfidpsdefname";
    public static final String FIELD_WFINSTPSDEFID = "WFINSTPSDEFID";
    protected static final String DTOFIELD_WFINSTPSDEFID = "wfinstpsdefid";
    public static final String FIELD_WFINSTPSDEFNAME = "WFINSTPSDEFNAME";
    protected static final String DTOFIELD_WFINSTPSDEFNAME = "wfinstpsdefname";
    public static final String FIELD_WFMODE = "WFMODE";
    protected static final String DTOFIELD_WFMODE = "wfmode";
    public static final String FIELD_WFPROXYMODE = "WFPROXYMODE";
    protected static final String DTOFIELD_WFPROXYMODE = "wfproxymode";
    public static final String FIELD_WFRETPSDEFID = "WFRETPSDEFID";
    protected static final String DTOFIELD_WFRETPSDEFID = "wfretpsdefid";
    public static final String FIELD_WFRETPSDEFNAME = "WFRETPSDEFNAME";
    protected static final String DTOFIELD_WFRETPSDEFNAME = "wfretpsdefname";
    public static final String FIELD_WFSTATEPSDEFID = "WFSTATEPSDEFID";
    protected static final String DTOFIELD_WFSTATEPSDEFID = "wfstatepsdefid";
    public static final String FIELD_WFSTATEPSDEFNAME = "WFSTATEPSDEFNAME";
    protected static final String DTOFIELD_WFSTATEPSDEFNAME = "wfstatepsdefname";
    public static final String FIELD_WFSTEPPSDEFID = "WFSTEPPSDEFID";
    protected static final String DTOFIELD_WFSTEPPSDEFID = "wfsteppsdefid";
    public static final String FIELD_WFSTEPPSDEFNAME = "WFSTEPPSDEFNAME";
    protected static final String DTOFIELD_WFSTEPPSDEFNAME = "wfsteppsdefname";
    public static final String FIELD_WFVERPSDEFID = "WFVERPSDEFID";
    protected static final String DTOFIELD_WFVERPSDEFID = "wfverpsdefid";
    public static final String FIELD_WFVERPSDEFNAME = "WFVERPSDEFNAME";
    protected static final String DTOFIELD_WFVERPSDEFNAME = "wfverpsdefname";

    @JsonProperty(value="actionmobpsdeviewid")
    public void setActionMobPSDEViewId(String actionMobPSDEViewId) {
        this._set(DTOFIELD_ACTIONMOBPSDEVIEWID, actionMobPSDEViewId);
    }

    @JsonIgnore
    public String getActionMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_ACTIONMOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_ACTIONMOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetActionMobPSDEViewId() {
        this._reset(DTOFIELD_ACTIONMOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewid(String actionMobPSDEViewId) {
        this.setActionMobPSDEViewId(actionMobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setActionMobPSDEViewId(null);
            this.setActionMobPSDEViewName(null);
        } else {
            this.setActionMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setActionMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="actionmobpsdeviewname")
    public void setActionMobPSDEViewName(String actionMobPSDEViewName) {
        this._set(DTOFIELD_ACTIONMOBPSDEVIEWNAME, actionMobPSDEViewName);
    }

    @JsonIgnore
    public String getActionMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_ACTIONMOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_ACTIONMOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetActionMobPSDEViewName() {
        this._reset(DTOFIELD_ACTIONMOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewname(String actionMobPSDEViewName) {
        this.setActionMobPSDEViewName(actionMobPSDEViewName);
        return this;
    }

    @JsonProperty(value="actionpsdeviewid")
    public void setActionPSDEViewId(String actionPSDEViewId) {
        this._set(DTOFIELD_ACTIONPSDEVIEWID, actionPSDEViewId);
    }

    @JsonIgnore
    public String getActionPSDEViewId() {
        Object objValue = this._get(DTOFIELD_ACTIONPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionPSDEViewIdDirty() {
        return this._contains(DTOFIELD_ACTIONPSDEVIEWID);
    }

    @JsonIgnore
    public void resetActionPSDEViewId() {
        this._reset(DTOFIELD_ACTIONPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO actionpsdeviewid(String actionPSDEViewId) {
        this.setActionPSDEViewId(actionPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO actionpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setActionPSDEViewId(null);
            this.setActionPSDEViewName(null);
        } else {
            this.setActionPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setActionPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="actionpsdeviewname")
    public void setActionPSDEViewName(String actionPSDEViewName) {
        this._set(DTOFIELD_ACTIONPSDEVIEWNAME, actionPSDEViewName);
    }

    @JsonIgnore
    public String getActionPSDEViewName() {
        Object objValue = this._get(DTOFIELD_ACTIONPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionPSDEViewNameDirty() {
        return this._contains(DTOFIELD_ACTIONPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetActionPSDEViewName() {
        this._reset(DTOFIELD_ACTIONPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO actionpsdeviewname(String actionPSDEViewName) {
        this.setActionPSDEViewName(actionPSDEViewName);
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
    public PSWFDEDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSWFDEDTO createdate(Timestamp createDate) {
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
    public PSWFDEDTO createman(String createMan) {
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
    public PSWFDEDTO customcode(String customCode) {
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
    public PSWFDEDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
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
    public PSWFDEDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="editablewfstep")
    public void setEditableWFStep(String editableWFStep) {
        this._set(DTOFIELD_EDITABLEWFSTEP, editableWFStep);
    }

    @JsonIgnore
    public String getEditableWFStep() {
        Object objValue = this._get(DTOFIELD_EDITABLEWFSTEP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditableWFStepDirty() {
        return this._contains(DTOFIELD_EDITABLEWFSTEP);
    }

    @JsonIgnore
    public void resetEditableWFStep() {
        this._reset(DTOFIELD_EDITABLEWFSTEP);
    }

    @JsonIgnore
    public PSWFDEDTO editablewfstep(String editableWFStep) {
        this.setEditableWFStep(editableWFStep);
        return this;
    }

    @JsonProperty(value="editviewuri")
    public void setEditViewUri(String editViewUri) {
        this._set(DTOFIELD_EDITVIEWURI, editViewUri);
    }

    @JsonIgnore
    public String getEditViewUri() {
        Object objValue = this._get(DTOFIELD_EDITVIEWURI);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditViewUriDirty() {
        return this._contains(DTOFIELD_EDITVIEWURI);
    }

    @JsonIgnore
    public void resetEditViewUri() {
        this._reset(DTOFIELD_EDITVIEWURI);
    }

    @JsonIgnore
    public PSWFDEDTO editviewuri(String editViewUri) {
        this.setEditViewUri(editViewUri);
        return this;
    }

    @JsonProperty(value="extcntstates")
    public void setExtCntStates(String extCntStates) {
        this._set(DTOFIELD_EXTCNTSTATES, extCntStates);
    }

    @JsonIgnore
    public String getExtCntStates() {
        Object objValue = this._get(DTOFIELD_EXTCNTSTATES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtCntStatesDirty() {
        return this._contains(DTOFIELD_EXTCNTSTATES);
    }

    @JsonIgnore
    public void resetExtCntStates() {
        this._reset(DTOFIELD_EXTCNTSTATES);
    }

    @JsonIgnore
    public PSWFDEDTO extcntstates(String extCntStates) {
        this.setExtCntStates(extCntStates);
        return this;
    }

    @JsonProperty(value="finishpsdeactionid")
    public void setFinishPSDEActionId(String finishPSDEActionId) {
        this._set(DTOFIELD_FINISHPSDEACTIONID, finishPSDEActionId);
    }

    @JsonIgnore
    public String getFinishPSDEActionId() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEActionIdDirty() {
        return this._contains(DTOFIELD_FINISHPSDEACTIONID);
    }

    @JsonIgnore
    public void resetFinishPSDEActionId() {
        this._reset(DTOFIELD_FINISHPSDEACTIONID);
    }

    @JsonIgnore
    public PSWFDEDTO finishpsdeactionid(String finishPSDEActionId) {
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO finishpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setFinishPSDEActionId(null);
            this.setFinishPSDEActionName(null);
        } else {
            this.setFinishPSDEActionId(pSDEAction.getPSDEActionId());
            this.setFinishPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="finishpsdeactionname")
    public void setFinishPSDEActionName(String finishPSDEActionName) {
        this._set(DTOFIELD_FINISHPSDEACTIONNAME, finishPSDEActionName);
    }

    @JsonIgnore
    public String getFinishPSDEActionName() {
        Object objValue = this._get(DTOFIELD_FINISHPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSDEActionNameDirty() {
        return this._contains(DTOFIELD_FINISHPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetFinishPSDEActionName() {
        this._reset(DTOFIELD_FINISHPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSWFDEDTO finishpsdeactionname(String finishPSDEActionName) {
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    @JsonProperty(value="initpsdeactionid")
    public void setInitPSDEActionId(String initPSDEActionId) {
        this._set(DTOFIELD_INITPSDEACTIONID, initPSDEActionId);
    }

    @JsonIgnore
    public String getInitPSDEActionId() {
        Object objValue = this._get(DTOFIELD_INITPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInitPSDEActionIdDirty() {
        return this._contains(DTOFIELD_INITPSDEACTIONID);
    }

    @JsonIgnore
    public void resetInitPSDEActionId() {
        this._reset(DTOFIELD_INITPSDEACTIONID);
    }

    @JsonIgnore
    public PSWFDEDTO initpsdeactionid(String initPSDEActionId) {
        this.setInitPSDEActionId(initPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO initpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setInitPSDEActionId(null);
            this.setInitPSDEActionName(null);
        } else {
            this.setInitPSDEActionId(pSDEAction.getPSDEActionId());
            this.setInitPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="initpsdeactionname")
    public void setInitPSDEActionName(String initPSDEActionName) {
        this._set(DTOFIELD_INITPSDEACTIONNAME, initPSDEActionName);
    }

    @JsonIgnore
    public String getInitPSDEActionName() {
        Object objValue = this._get(DTOFIELD_INITPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInitPSDEActionNameDirty() {
        return this._contains(DTOFIELD_INITPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetInitPSDEActionName() {
        this._reset(DTOFIELD_INITPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSWFDEDTO initpsdeactionname(String initPSDEActionName) {
        this.setInitPSDEActionName(initPSDEActionName);
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
    public PSWFDEDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobeditviewuri")
    public void setMobEditViewUri(String mobEditViewUri) {
        this._set(DTOFIELD_MOBEDITVIEWURI, mobEditViewUri);
    }

    @JsonIgnore
    public String getMobEditViewUri() {
        Object objValue = this._get(DTOFIELD_MOBEDITVIEWURI);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobEditViewUriDirty() {
        return this._contains(DTOFIELD_MOBEDITVIEWURI);
    }

    @JsonIgnore
    public void resetMobEditViewUri() {
        this._reset(DTOFIELD_MOBEDITVIEWURI);
    }

    @JsonIgnore
    public PSWFDEDTO mobeditviewuri(String mobEditViewUri) {
        this.setMobEditViewUri(mobEditViewUri);
        return this;
    }

    @JsonProperty(value="mobproxydata2psdeviewid")
    public void setMobProxyData2PSDEViewId(String mobProxyData2PSDEViewId) {
        this._set(DTOFIELD_MOBPROXYDATA2PSDEVIEWID, mobProxyData2PSDEViewId);
    }

    @JsonIgnore
    public String getMobProxyData2PSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPROXYDATA2PSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobProxyData2PSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPROXYDATA2PSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobProxyData2PSDEViewId() {
        this._reset(DTOFIELD_MOBPROXYDATA2PSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewid(String mobProxyData2PSDEViewId) {
        this.setMobProxyData2PSDEViewId(mobProxyData2PSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobProxyData2PSDEViewId(null);
            this.setMobProxyData2PSDEViewName(null);
        } else {
            this.setMobProxyData2PSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobProxyData2PSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="mobproxydata2psdeviewname")
    public void setMobProxyData2PSDEViewName(String mobProxyData2PSDEViewName) {
        this._set(DTOFIELD_MOBPROXYDATA2PSDEVIEWNAME, mobProxyData2PSDEViewName);
    }

    @JsonIgnore
    public String getMobProxyData2PSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPROXYDATA2PSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobProxyData2PSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPROXYDATA2PSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobProxyData2PSDEViewName() {
        this._reset(DTOFIELD_MOBPROXYDATA2PSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewname(String mobProxyData2PSDEViewName) {
        this.setMobProxyData2PSDEViewName(mobProxyData2PSDEViewName);
        return this;
    }

    @JsonProperty(value="mobproxydatapsdeviewid")
    public void setMobProxyDataPSDEViewId(String mobProxyDataPSDEViewId) {
        this._set(DTOFIELD_MOBPROXYDATAPSDEVIEWID, mobProxyDataPSDEViewId);
    }

    @JsonIgnore
    public String getMobProxyDataPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPROXYDATAPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobProxyDataPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPROXYDATAPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobProxyDataPSDEViewId() {
        this._reset(DTOFIELD_MOBPROXYDATAPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewid(String mobProxyDataPSDEViewId) {
        this.setMobProxyDataPSDEViewId(mobProxyDataPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobProxyDataPSDEViewId(null);
            this.setMobProxyDataPSDEViewName(null);
        } else {
            this.setMobProxyDataPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobProxyDataPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="mobproxydatapsdeviewname")
    public void setMobProxyDataPSDEViewName(String mobProxyDataPSDEViewName) {
        this._set(DTOFIELD_MOBPROXYDATAPSDEVIEWNAME, mobProxyDataPSDEViewName);
    }

    @JsonIgnore
    public String getMobProxyDataPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPROXYDATAPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobProxyDataPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPROXYDATAPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobProxyDataPSDEViewName() {
        this._reset(DTOFIELD_MOBPROXYDATAPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewname(String mobProxyDataPSDEViewName) {
        this.setMobProxyDataPSDEViewName(mobProxyDataPSDEViewName);
        return this;
    }

    @JsonProperty(value="mywfdata")
    public void setMyWFData(String myWFData) {
        this._set(DTOFIELD_MYWFDATA, myWFData);
    }

    @JsonIgnore
    public String getMyWFData() {
        Object objValue = this._get(DTOFIELD_MYWFDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFDataDirty() {
        return this._contains(DTOFIELD_MYWFDATA);
    }

    @JsonIgnore
    public void resetMyWFData() {
        this._reset(DTOFIELD_MYWFDATA);
    }

    @JsonIgnore
    public PSWFDEDTO mywfdata(String myWFData) {
        this.setMyWFData(myWFData);
        return this;
    }

    @JsonProperty(value="mywfdatapslanresid")
    public void setMyWFDataPSLanResId(String myWFDataPSLanResId) {
        this._set(DTOFIELD_MYWFDATAPSLANRESID, myWFDataPSLanResId);
    }

    @JsonIgnore
    public String getMyWFDataPSLanResId() {
        Object objValue = this._get(DTOFIELD_MYWFDATAPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFDataPSLanResIdDirty() {
        return this._contains(DTOFIELD_MYWFDATAPSLANRESID);
    }

    @JsonIgnore
    public void resetMyWFDataPSLanResId() {
        this._reset(DTOFIELD_MYWFDATAPSLANRESID);
    }

    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresid(String myWFDataPSLanResId) {
        this.setMyWFDataPSLanResId(myWFDataPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setMyWFDataPSLanResId(null);
            this.setMyWFDataPSLanResName(null);
        } else {
            this.setMyWFDataPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMyWFDataPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="mywfdatapslanresname")
    public void setMyWFDataPSLanResName(String myWFDataPSLanResName) {
        this._set(DTOFIELD_MYWFDATAPSLANRESNAME, myWFDataPSLanResName);
    }

    @JsonIgnore
    public String getMyWFDataPSLanResName() {
        Object objValue = this._get(DTOFIELD_MYWFDATAPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFDataPSLanResNameDirty() {
        return this._contains(DTOFIELD_MYWFDATAPSLANRESNAME);
    }

    @JsonIgnore
    public void resetMyWFDataPSLanResName() {
        this._reset(DTOFIELD_MYWFDATAPSLANRESNAME);
    }

    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresname(String myWFDataPSLanResName) {
        this.setMyWFDataPSLanResName(myWFDataPSLanResName);
        return this;
    }

    @JsonProperty(value="mywfwork")
    public void setMyWFWork(String myWFWork) {
        this._set(DTOFIELD_MYWFWORK, myWFWork);
    }

    @JsonIgnore
    public String getMyWFWork() {
        Object objValue = this._get(DTOFIELD_MYWFWORK);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFWorkDirty() {
        return this._contains(DTOFIELD_MYWFWORK);
    }

    @JsonIgnore
    public void resetMyWFWork() {
        this._reset(DTOFIELD_MYWFWORK);
    }

    @JsonIgnore
    public PSWFDEDTO mywfwork(String myWFWork) {
        this.setMyWFWork(myWFWork);
        return this;
    }

    @JsonProperty(value="mywfworkpslanresid")
    public void setMyWFWorkPSLanResId(String myWFWorkPSLanResId) {
        this._set(DTOFIELD_MYWFWORKPSLANRESID, myWFWorkPSLanResId);
    }

    @JsonIgnore
    public String getMyWFWorkPSLanResId() {
        Object objValue = this._get(DTOFIELD_MYWFWORKPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFWorkPSLanResIdDirty() {
        return this._contains(DTOFIELD_MYWFWORKPSLANRESID);
    }

    @JsonIgnore
    public void resetMyWFWorkPSLanResId() {
        this._reset(DTOFIELD_MYWFWORKPSLANRESID);
    }

    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresid(String myWFWorkPSLanResId) {
        this.setMyWFWorkPSLanResId(myWFWorkPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setMyWFWorkPSLanResId(null);
            this.setMyWFWorkPSLanResName(null);
        } else {
            this.setMyWFWorkPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMyWFWorkPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="mywfworkpslanresname")
    public void setMyWFWorkPSLanResName(String myWFWorkPSLanResName) {
        this._set(DTOFIELD_MYWFWORKPSLANRESNAME, myWFWorkPSLanResName);
    }

    @JsonIgnore
    public String getMyWFWorkPSLanResName() {
        Object objValue = this._get(DTOFIELD_MYWFWORKPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMyWFWorkPSLanResNameDirty() {
        return this._contains(DTOFIELD_MYWFWORKPSLANRESNAME);
    }

    @JsonIgnore
    public void resetMyWFWorkPSLanResName() {
        this._reset(DTOFIELD_MYWFWORKPSLANRESNAME);
    }

    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresname(String myWFWorkPSLanResName) {
        this.setMyWFWorkPSLanResName(myWFWorkPSLanResName);
        return this;
    }

    @JsonProperty(value="proxydata2psdeviewid")
    public void setProxyData2PSDEViewId(String proxyData2PSDEViewId) {
        this._set(DTOFIELD_PROXYDATA2PSDEVIEWID, proxyData2PSDEViewId);
    }

    @JsonIgnore
    public String getProxyData2PSDEViewId() {
        Object objValue = this._get(DTOFIELD_PROXYDATA2PSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyData2PSDEViewIdDirty() {
        return this._contains(DTOFIELD_PROXYDATA2PSDEVIEWID);
    }

    @JsonIgnore
    public void resetProxyData2PSDEViewId() {
        this._reset(DTOFIELD_PROXYDATA2PSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewid(String proxyData2PSDEViewId) {
        this.setProxyData2PSDEViewId(proxyData2PSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setProxyData2PSDEViewId(null);
            this.setProxyData2PSDEViewName(null);
        } else {
            this.setProxyData2PSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setProxyData2PSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="proxydata2psdeviewname")
    public void setProxyData2PSDEViewName(String proxyData2PSDEViewName) {
        this._set(DTOFIELD_PROXYDATA2PSDEVIEWNAME, proxyData2PSDEViewName);
    }

    @JsonIgnore
    public String getProxyData2PSDEViewName() {
        Object objValue = this._get(DTOFIELD_PROXYDATA2PSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyData2PSDEViewNameDirty() {
        return this._contains(DTOFIELD_PROXYDATA2PSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetProxyData2PSDEViewName() {
        this._reset(DTOFIELD_PROXYDATA2PSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewname(String proxyData2PSDEViewName) {
        this.setProxyData2PSDEViewName(proxyData2PSDEViewName);
        return this;
    }

    @JsonProperty(value="proxydatapsdefid")
    public void setProxyDataPSDEFId(String proxyDataPSDEFId) {
        this._set(DTOFIELD_PROXYDATAPSDEFID, proxyDataPSDEFId);
    }

    @JsonIgnore
    public String getProxyDataPSDEFId() {
        Object objValue = this._get(DTOFIELD_PROXYDATAPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyDataPSDEFIdDirty() {
        return this._contains(DTOFIELD_PROXYDATAPSDEFID);
    }

    @JsonIgnore
    public void resetProxyDataPSDEFId() {
        this._reset(DTOFIELD_PROXYDATAPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdefid(String proxyDataPSDEFId) {
        this.setProxyDataPSDEFId(proxyDataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setProxyDataPSDEFId(null);
            this.setProxyDataPSDEFName(null);
        } else {
            this.setProxyDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="proxydatapsdefname")
    public void setProxyDataPSDEFName(String proxyDataPSDEFName) {
        this._set(DTOFIELD_PROXYDATAPSDEFNAME, proxyDataPSDEFName);
    }

    @JsonIgnore
    public String getProxyDataPSDEFName() {
        Object objValue = this._get(DTOFIELD_PROXYDATAPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyDataPSDEFNameDirty() {
        return this._contains(DTOFIELD_PROXYDATAPSDEFNAME);
    }

    @JsonIgnore
    public void resetProxyDataPSDEFName() {
        this._reset(DTOFIELD_PROXYDATAPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdefname(String proxyDataPSDEFName) {
        this.setProxyDataPSDEFName(proxyDataPSDEFName);
        return this;
    }

    @JsonProperty(value="proxydatapsdeviewid")
    public void setProxyDataPSDEViewId(String proxyDataPSDEViewId) {
        this._set(DTOFIELD_PROXYDATAPSDEVIEWID, proxyDataPSDEViewId);
    }

    @JsonIgnore
    public String getProxyDataPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PROXYDATAPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyDataPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PROXYDATAPSDEVIEWID);
    }

    @JsonIgnore
    public void resetProxyDataPSDEViewId() {
        this._reset(DTOFIELD_PROXYDATAPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewid(String proxyDataPSDEViewId) {
        this.setProxyDataPSDEViewId(proxyDataPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setProxyDataPSDEViewId(null);
            this.setProxyDataPSDEViewName(null);
        } else {
            this.setProxyDataPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setProxyDataPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="proxydatapsdeviewname")
    public void setProxyDataPSDEViewName(String proxyDataPSDEViewName) {
        this._set(DTOFIELD_PROXYDATAPSDEVIEWNAME, proxyDataPSDEViewName);
    }

    @JsonIgnore
    public String getProxyDataPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PROXYDATAPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyDataPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PROXYDATAPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetProxyDataPSDEViewName() {
        this._reset(DTOFIELD_PROXYDATAPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewname(String proxyDataPSDEViewName) {
        this.setProxyDataPSDEViewName(proxyDataPSDEViewName);
        return this;
    }

    @JsonProperty(value="proxymodulepsdefid")
    public void setProxyModulePSDEFId(String proxyModulePSDEFId) {
        this._set(DTOFIELD_PROXYMODULEPSDEFID, proxyModulePSDEFId);
    }

    @JsonIgnore
    public String getProxyModulePSDEFId() {
        Object objValue = this._get(DTOFIELD_PROXYMODULEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyModulePSDEFIdDirty() {
        return this._contains(DTOFIELD_PROXYMODULEPSDEFID);
    }

    @JsonIgnore
    public void resetProxyModulePSDEFId() {
        this._reset(DTOFIELD_PROXYMODULEPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefid(String proxyModulePSDEFId) {
        this.setProxyModulePSDEFId(proxyModulePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setProxyModulePSDEFId(null);
            this.setProxyModulePSDEFName(null);
        } else {
            this.setProxyModulePSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyModulePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="proxymodulepsdefname")
    public void setProxyModulePSDEFName(String proxyModulePSDEFName) {
        this._set(DTOFIELD_PROXYMODULEPSDEFNAME, proxyModulePSDEFName);
    }

    @JsonIgnore
    public String getProxyModulePSDEFName() {
        Object objValue = this._get(DTOFIELD_PROXYMODULEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyModulePSDEFNameDirty() {
        return this._contains(DTOFIELD_PROXYMODULEPSDEFNAME);
    }

    @JsonIgnore
    public void resetProxyModulePSDEFName() {
        this._reset(DTOFIELD_PROXYMODULEPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefname(String proxyModulePSDEFName) {
        this.setProxyModulePSDEFName(proxyModulePSDEFName);
        return this;
    }

    @JsonProperty(value="proxywfpsdefid")
    public void setProxyWFPSDEFId(String proxyWFPSDEFId) {
        this._set(DTOFIELD_PROXYWFPSDEFID, proxyWFPSDEFId);
    }

    @JsonIgnore
    public String getProxyWFPSDEFId() {
        Object objValue = this._get(DTOFIELD_PROXYWFPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyWFPSDEFIdDirty() {
        return this._contains(DTOFIELD_PROXYWFPSDEFID);
    }

    @JsonIgnore
    public void resetProxyWFPSDEFId() {
        this._reset(DTOFIELD_PROXYWFPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO proxywfpsdefid(String proxyWFPSDEFId) {
        this.setProxyWFPSDEFId(proxyWFPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO proxywfpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setProxyWFPSDEFId(null);
            this.setProxyWFPSDEFName(null);
        } else {
            this.setProxyWFPSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyWFPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="proxywfpsdefname")
    public void setProxyWFPSDEFName(String proxyWFPSDEFName) {
        this._set(DTOFIELD_PROXYWFPSDEFNAME, proxyWFPSDEFName);
    }

    @JsonIgnore
    public String getProxyWFPSDEFName() {
        Object objValue = this._get(DTOFIELD_PROXYWFPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProxyWFPSDEFNameDirty() {
        return this._contains(DTOFIELD_PROXYWFPSDEFNAME);
    }

    @JsonIgnore
    public void resetProxyWFPSDEFName() {
        this._reset(DTOFIELD_PROXYWFPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO proxywfpsdefname(String proxyWFPSDEFName) {
        this.setProxyWFPSDEFName(proxyWFPSDEFName);
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
    public PSWFDEDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSWFDEDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSWFDEDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSWFDEDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssyswfcatid")
    public void setPSSysWFCatId(String pSSysWFCatId) {
        this._set(DTOFIELD_PSSYSWFCATID, pSSysWFCatId);
    }

    @JsonIgnore
    public String getPSSysWFCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSWFCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSWFCATID);
    }

    @JsonIgnore
    public void resetPSSysWFCatId() {
        this._reset(DTOFIELD_PSSYSWFCATID);
    }

    @JsonIgnore
    public PSWFDEDTO pssyswfcatid(String pSSysWFCatId) {
        this.setPSSysWFCatId(pSSysWFCatId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO pssyswfcatid(PSSysWFCatDTO pSSysWFCat) {
        if (pSSysWFCat == null) {
            this.setPSSysWFCatId(null);
            this.setPSSysWFCatName(null);
            this.setWFCatCode(null);
        } else {
            this.setPSSysWFCatId(pSSysWFCat.getPSSysWFCatId());
            this.setPSSysWFCatName(pSSysWFCat.getPSSysWFCatName());
            this.setWFCatCode(pSSysWFCat.getCatCode());
        }
        return this;
    }

    @JsonProperty(value="pssyswfcatname")
    public void setPSSysWFCatName(String pSSysWFCatName) {
        this._set(DTOFIELD_PSSYSWFCATNAME, pSSysWFCatName);
    }

    @JsonIgnore
    public String getPSSysWFCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSWFCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSWFCATNAME);
    }

    @JsonIgnore
    public void resetPSSysWFCatName() {
        this._reset(DTOFIELD_PSSYSWFCATNAME);
    }

    @JsonIgnore
    public PSWFDEDTO pssyswfcatname(String pSSysWFCatName) {
        this.setPSSysWFCatName(pSSysWFCatName);
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
    public PSWFDEDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
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
    public PSWFDEDTO pswfdename(String pSWFDEName) {
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFDEName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFDEName(strName);
    }

    @JsonIgnore
    public PSWFDEDTO name(String strName) {
        this.setPSWFDEName(strName);
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
    public PSWFDEDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
            this.setPSWFName(null);
            this.setWFCodeName(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
            this.setWFCodeName(pSWorkflow.getCodeName());
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
    public PSWFDEDTO pswfname(String pSWFName) {
        this.setPSWFName(pSWFName);
        return this;
    }

    @JsonProperty(value="pwfinstpsdefid")
    public void setPWFInstPSDEFId(String pWFInstPSDEFId) {
        this._set(DTOFIELD_PWFINSTPSDEFID, pWFInstPSDEFId);
    }

    @JsonIgnore
    public String getPWFInstPSDEFId() {
        Object objValue = this._get(DTOFIELD_PWFINSTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPWFInstPSDEFIdDirty() {
        return this._contains(DTOFIELD_PWFINSTPSDEFID);
    }

    @JsonIgnore
    public void resetPWFInstPSDEFId() {
        this._reset(DTOFIELD_PWFINSTPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefid(String pWFInstPSDEFId) {
        this.setPWFInstPSDEFId(pWFInstPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPWFInstPSDEFId(null);
            this.setPWFInstPSDEFName(null);
        } else {
            this.setPWFInstPSDEFId(pSDEField.getPSDEFieldId());
            this.setPWFInstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="pwfinstpsdefname")
    public void setPWFInstPSDEFName(String pWFInstPSDEFName) {
        this._set(DTOFIELD_PWFINSTPSDEFNAME, pWFInstPSDEFName);
    }

    @JsonIgnore
    public String getPWFInstPSDEFName() {
        Object objValue = this._get(DTOFIELD_PWFINSTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPWFInstPSDEFNameDirty() {
        return this._contains(DTOFIELD_PWFINSTPSDEFNAME);
    }

    @JsonIgnore
    public void resetPWFInstPSDEFName() {
        this._reset(DTOFIELD_PWFINSTPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefname(String pWFInstPSDEFName) {
        this.setPWFInstPSDEFName(pWFInstPSDEFName);
        return this;
    }

    @JsonProperty(value="startmobpsdeviewid")
    public void setStartMobPSDEViewId(String startMobPSDEViewId) {
        this._set(DTOFIELD_STARTMOBPSDEVIEWID, startMobPSDEViewId);
    }

    @JsonIgnore
    public String getStartMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_STARTMOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_STARTMOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetStartMobPSDEViewId() {
        this._reset(DTOFIELD_STARTMOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewid(String startMobPSDEViewId) {
        this.setStartMobPSDEViewId(startMobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setStartMobPSDEViewId(null);
            this.setStartMobPSDEViewName(null);
        } else {
            this.setStartMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setStartMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="startmobpsdeviewname")
    public void setStartMobPSDEViewName(String startMobPSDEViewName) {
        this._set(DTOFIELD_STARTMOBPSDEVIEWNAME, startMobPSDEViewName);
    }

    @JsonIgnore
    public String getStartMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_STARTMOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_STARTMOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetStartMobPSDEViewName() {
        this._reset(DTOFIELD_STARTMOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewname(String startMobPSDEViewName) {
        this.setStartMobPSDEViewName(startMobPSDEViewName);
        return this;
    }

    @JsonProperty(value="startpsdeviewid")
    public void setStartPSDEViewId(String startPSDEViewId) {
        this._set(DTOFIELD_STARTPSDEVIEWID, startPSDEViewId);
    }

    @JsonIgnore
    public String getStartPSDEViewId() {
        Object objValue = this._get(DTOFIELD_STARTPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartPSDEViewIdDirty() {
        return this._contains(DTOFIELD_STARTPSDEVIEWID);
    }

    @JsonIgnore
    public void resetStartPSDEViewId() {
        this._reset(DTOFIELD_STARTPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFDEDTO startpsdeviewid(String startPSDEViewId) {
        this.setStartPSDEViewId(startPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO startpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setStartPSDEViewId(null);
            this.setStartPSDEViewName(null);
        } else {
            this.setStartPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setStartPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="startpsdeviewname")
    public void setStartPSDEViewName(String startPSDEViewName) {
        this._set(DTOFIELD_STARTPSDEVIEWNAME, startPSDEViewName);
    }

    @JsonIgnore
    public String getStartPSDEViewName() {
        Object objValue = this._get(DTOFIELD_STARTPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartPSDEViewNameDirty() {
        return this._contains(DTOFIELD_STARTPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetStartPSDEViewName() {
        this._reset(DTOFIELD_STARTPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFDEDTO startpsdeviewname(String startPSDEViewName) {
        this.setStartPSDEViewName(startPSDEViewName);
        return this;
    }

    @JsonProperty(value="statepsdefid")
    public void setStatePSDEFId(String statePSDEFId) {
        this._set(DTOFIELD_STATEPSDEFID, statePSDEFId);
    }

    @JsonIgnore
    public String getStatePSDEFId() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFIdDirty() {
        return this._contains(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public void resetStatePSDEFId() {
        this._reset(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO statepsdefid(String statePSDEFId) {
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO statepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        } else {
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="statepsdefname")
    public void setStatePSDEFName(String statePSDEFName) {
        this._set(DTOFIELD_STATEPSDEFNAME, statePSDEFName);
    }

    @JsonIgnore
    public String getStatePSDEFName() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFNameDirty() {
        return this._contains(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public void resetStatePSDEFName() {
        this._reset(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO statepsdefname(String statePSDEFName) {
        this.setStatePSDEFName(statePSDEFName);
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
    public PSWFDEDTO updatedate(Timestamp updateDate) {
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
    public PSWFDEDTO updateman(String updateMan) {
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
    public PSWFDEDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userstart")
    public void setUserStart(Integer userStart) {
        this._set(DTOFIELD_USERSTART, userStart);
    }

    @JsonIgnore
    public Integer getUserStart() {
        Object objValue = this._get(DTOFIELD_USERSTART);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserStartDirty() {
        return this._contains(DTOFIELD_USERSTART);
    }

    @JsonIgnore
    public void resetUserStart() {
        this._reset(DTOFIELD_USERSTART);
    }

    @JsonIgnore
    public PSWFDEDTO userstart(Integer userStart) {
        this.setUserStart(userStart);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO userstart(Boolean userStart) {
        if (userStart == null) {
            this.setUserStart(null);
        } else {
            this.setUserStart(userStart != false ? 1 : 0);
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
    public PSWFDEDTO usertag(String userTag) {
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
    public PSWFDEDTO usertag2(String userTag2) {
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
    public PSWFDEDTO usertag3(String userTag3) {
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
    public PSWFDEDTO usertag4(String userTag4) {
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
    public PSWFDEDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wfactorpsdefid")
    public void setWFActorPSDEFId(String wFActorPSDEFId) {
        this._set(DTOFIELD_WFACTORPSDEFID, wFActorPSDEFId);
    }

    @JsonIgnore
    public String getWFActorPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFACTORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFActorPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFACTORPSDEFID);
    }

    @JsonIgnore
    public void resetWFActorPSDEFId() {
        this._reset(DTOFIELD_WFACTORPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfactorpsdefid(String wFActorPSDEFId) {
        this.setWFActorPSDEFId(wFActorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfactorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFActorPSDEFId(null);
            this.setWFActorPSDEFName(null);
        } else {
            this.setWFActorPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFActorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfactorpsdefname")
    public void setWFActorPSDEFName(String wFActorPSDEFName) {
        this._set(DTOFIELD_WFACTORPSDEFNAME, wFActorPSDEFName);
    }

    @JsonIgnore
    public String getWFActorPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFACTORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFActorPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFACTORPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFActorPSDEFName() {
        this._reset(DTOFIELD_WFACTORPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfactorpsdefname(String wFActorPSDEFName) {
        this.setWFActorPSDEFName(wFActorPSDEFName);
        return this;
    }

    @JsonProperty(value="wfcatcode")
    public void setWFCatCode(String wFCatCode) {
        this._set(DTOFIELD_WFCATCODE, wFCatCode);
    }

    @JsonIgnore
    public String getWFCatCode() {
        Object objValue = this._get(DTOFIELD_WFCATCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFCatCodeDirty() {
        return this._contains(DTOFIELD_WFCATCODE);
    }

    @JsonIgnore
    public void resetWFCatCode() {
        this._reset(DTOFIELD_WFCATCODE);
    }

    @JsonIgnore
    public PSWFDEDTO wfcatcode(String wFCatCode) {
        this.setWFCatCode(wFCatCode);
        return this;
    }

    @JsonProperty(value="wfcodename")
    public void setWFCodeName(String wFCodeName) {
        this._set(DTOFIELD_WFCODENAME, wFCodeName);
    }

    @JsonIgnore
    public String getWFCodeName() {
        Object objValue = this._get(DTOFIELD_WFCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFCodeNameDirty() {
        return this._contains(DTOFIELD_WFCODENAME);
    }

    @JsonIgnore
    public void resetWFCodeName() {
        this._reset(DTOFIELD_WFCODENAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfcodename(String wFCodeName) {
        this.setWFCodeName(wFCodeName);
        return this;
    }

    @JsonProperty(value="wfidpsdefid")
    public void setWFIdPSDEFId(String wFIdPSDEFId) {
        this._set(DTOFIELD_WFIDPSDEFID, wFIdPSDEFId);
    }

    @JsonIgnore
    public String getWFIdPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFIDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFIdPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFIDPSDEFID);
    }

    @JsonIgnore
    public void resetWFIdPSDEFId() {
        this._reset(DTOFIELD_WFIDPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfidpsdefid(String wFIdPSDEFId) {
        this.setWFIdPSDEFId(wFIdPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfidpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFIdPSDEFId(null);
            this.setWFIdPSDEFName(null);
        } else {
            this.setWFIdPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFIdPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfidpsdefname")
    public void setWFIdPSDEFName(String wFIdPSDEFName) {
        this._set(DTOFIELD_WFIDPSDEFNAME, wFIdPSDEFName);
    }

    @JsonIgnore
    public String getWFIdPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFIDPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFIdPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFIDPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFIdPSDEFName() {
        this._reset(DTOFIELD_WFIDPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfidpsdefname(String wFIdPSDEFName) {
        this.setWFIdPSDEFName(wFIdPSDEFName);
        return this;
    }

    @JsonProperty(value="wfinstpsdefid")
    public void setWFInstPSDEFId(String wFInstPSDEFId) {
        this._set(DTOFIELD_WFINSTPSDEFID, wFInstPSDEFId);
    }

    @JsonIgnore
    public String getWFInstPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFINSTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFInstPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFINSTPSDEFID);
    }

    @JsonIgnore
    public void resetWFInstPSDEFId() {
        this._reset(DTOFIELD_WFINSTPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfinstpsdefid(String wFInstPSDEFId) {
        this.setWFInstPSDEFId(wFInstPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfinstpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFInstPSDEFId(null);
            this.setWFInstPSDEFName(null);
        } else {
            this.setWFInstPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFInstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfinstpsdefname")
    public void setWFInstPSDEFName(String wFInstPSDEFName) {
        this._set(DTOFIELD_WFINSTPSDEFNAME, wFInstPSDEFName);
    }

    @JsonIgnore
    public String getWFInstPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFINSTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFInstPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFINSTPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFInstPSDEFName() {
        this._reset(DTOFIELD_WFINSTPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfinstpsdefname(String wFInstPSDEFName) {
        this.setWFInstPSDEFName(wFInstPSDEFName);
        return this;
    }

    @JsonProperty(value="wfmode")
    public void setWFMode(String wFMode) {
        this._set(DTOFIELD_WFMODE, wFMode);
    }

    @JsonIgnore
    public String getWFMode() {
        Object objValue = this._get(DTOFIELD_WFMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFModeDirty() {
        return this._contains(DTOFIELD_WFMODE);
    }

    @JsonIgnore
    public void resetWFMode() {
        this._reset(DTOFIELD_WFMODE);
    }

    @JsonIgnore
    public PSWFDEDTO wfmode(String wFMode) {
        this.setWFMode(wFMode);
        return this;
    }

    @JsonProperty(value="wfproxymode")
    public void setWFProxyMode(Integer wFProxyMode) {
        this._set(DTOFIELD_WFPROXYMODE, wFProxyMode);
    }

    @JsonIgnore
    public Integer getWFProxyMode() {
        Object objValue = this._get(DTOFIELD_WFPROXYMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWFProxyModeDirty() {
        return this._contains(DTOFIELD_WFPROXYMODE);
    }

    @JsonIgnore
    public void resetWFProxyMode() {
        this._reset(DTOFIELD_WFPROXYMODE);
    }

    @JsonIgnore
    public PSWFDEDTO wfproxymode(Integer wFProxyMode) {
        this.setWFProxyMode(wFProxyMode);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfproxymode(PSModelEnums.WFProxyMode wFProxyMode) {
        if (wFProxyMode == null) {
            this.setWFProxyMode(null);
        } else {
            this.setWFProxyMode(wFProxyMode.value);
        }
        return this;
    }

    @JsonProperty(value="wfretpsdefid")
    public void setWFRetPSDEFId(String wFRetPSDEFId) {
        this._set(DTOFIELD_WFRETPSDEFID, wFRetPSDEFId);
    }

    @JsonIgnore
    public String getWFRetPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFRETPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFRetPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFRETPSDEFID);
    }

    @JsonIgnore
    public void resetWFRetPSDEFId() {
        this._reset(DTOFIELD_WFRETPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfretpsdefid(String wFRetPSDEFId) {
        this.setWFRetPSDEFId(wFRetPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfretpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFRetPSDEFId(null);
            this.setWFRetPSDEFName(null);
        } else {
            this.setWFRetPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFRetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfretpsdefname")
    public void setWFRetPSDEFName(String wFRetPSDEFName) {
        this._set(DTOFIELD_WFRETPSDEFNAME, wFRetPSDEFName);
    }

    @JsonIgnore
    public String getWFRetPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFRETPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFRetPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFRETPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFRetPSDEFName() {
        this._reset(DTOFIELD_WFRETPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfretpsdefname(String wFRetPSDEFName) {
        this.setWFRetPSDEFName(wFRetPSDEFName);
        return this;
    }

    @JsonProperty(value="wfstatepsdefid")
    public void setWFStatePSDEFId(String wFStatePSDEFId) {
        this._set(DTOFIELD_WFSTATEPSDEFID, wFStatePSDEFId);
    }

    @JsonIgnore
    public String getWFStatePSDEFId() {
        Object objValue = this._get(DTOFIELD_WFSTATEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStatePSDEFIdDirty() {
        return this._contains(DTOFIELD_WFSTATEPSDEFID);
    }

    @JsonIgnore
    public void resetWFStatePSDEFId() {
        this._reset(DTOFIELD_WFSTATEPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfstatepsdefid(String wFStatePSDEFId) {
        this.setWFStatePSDEFId(wFStatePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfstatepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFStatePSDEFId(null);
            this.setWFStatePSDEFName(null);
        } else {
            this.setWFStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setWFStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfstatepsdefname")
    public void setWFStatePSDEFName(String wFStatePSDEFName) {
        this._set(DTOFIELD_WFSTATEPSDEFNAME, wFStatePSDEFName);
    }

    @JsonIgnore
    public String getWFStatePSDEFName() {
        Object objValue = this._get(DTOFIELD_WFSTATEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStatePSDEFNameDirty() {
        return this._contains(DTOFIELD_WFSTATEPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFStatePSDEFName() {
        this._reset(DTOFIELD_WFSTATEPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfstatepsdefname(String wFStatePSDEFName) {
        this.setWFStatePSDEFName(wFStatePSDEFName);
        return this;
    }

    @JsonProperty(value="wfsteppsdefid")
    public void setWFStepPSDEFId(String wFStepPSDEFId) {
        this._set(DTOFIELD_WFSTEPPSDEFID, wFStepPSDEFId);
    }

    @JsonIgnore
    public String getWFStepPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFSTEPPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFSTEPPSDEFID);
    }

    @JsonIgnore
    public void resetWFStepPSDEFId() {
        this._reset(DTOFIELD_WFSTEPPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfsteppsdefid(String wFStepPSDEFId) {
        this.setWFStepPSDEFId(wFStepPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfsteppsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFStepPSDEFId(null);
            this.setWFStepPSDEFName(null);
        } else {
            this.setWFStepPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFStepPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfsteppsdefname")
    public void setWFStepPSDEFName(String wFStepPSDEFName) {
        this._set(DTOFIELD_WFSTEPPSDEFNAME, wFStepPSDEFName);
    }

    @JsonIgnore
    public String getWFStepPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFSTEPPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFSTEPPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFStepPSDEFName() {
        this._reset(DTOFIELD_WFSTEPPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfsteppsdefname(String wFStepPSDEFName) {
        this.setWFStepPSDEFName(wFStepPSDEFName);
        return this;
    }

    @JsonProperty(value="wfverpsdefid")
    public void setWFVerPSDEFId(String wFVerPSDEFId) {
        this._set(DTOFIELD_WFVERPSDEFID, wFVerPSDEFId);
    }

    @JsonIgnore
    public String getWFVerPSDEFId() {
        Object objValue = this._get(DTOFIELD_WFVERPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFVerPSDEFIdDirty() {
        return this._contains(DTOFIELD_WFVERPSDEFID);
    }

    @JsonIgnore
    public void resetWFVerPSDEFId() {
        this._reset(DTOFIELD_WFVERPSDEFID);
    }

    @JsonIgnore
    public PSWFDEDTO wfverpsdefid(String wFVerPSDEFId) {
        this.setWFVerPSDEFId(wFVerPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFDEDTO wfverpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWFVerPSDEFId(null);
            this.setWFVerPSDEFName(null);
        } else {
            this.setWFVerPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFVerPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wfverpsdefname")
    public void setWFVerPSDEFName(String wFVerPSDEFName) {
        this._set(DTOFIELD_WFVERPSDEFNAME, wFVerPSDEFName);
    }

    @JsonIgnore
    public String getWFVerPSDEFName() {
        Object objValue = this._get(DTOFIELD_WFVERPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFVerPSDEFNameDirty() {
        return this._contains(DTOFIELD_WFVERPSDEFNAME);
    }

    @JsonIgnore
    public void resetWFVerPSDEFName() {
        this._reset(DTOFIELD_WFVERPSDEFNAME);
    }

    @JsonIgnore
    public PSWFDEDTO wfverpsdefname(String wFVerPSDEFName) {
        this.setWFVerPSDEFName(wFVerPSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFDEId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFDEId(strValue);
    }

    @JsonIgnore
    public PSWFDEDTO id(String strValue) {
        this.setPSWFDEId(strValue);
        return this;
    }
}
