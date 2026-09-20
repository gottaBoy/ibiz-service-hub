package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysWFCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXAccountDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXEntAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWorkflowDTO
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
    public static final String FIELD_EDITABLEWFSTEP = "EDITABLEWFSTEP";
    protected static final String DTOFIELD_EDITABLEWFSTEP = "editablewfstep";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENABLEDYNAVIEW = "ENABLEDYNAVIEW";
    protected static final String DTOFIELD_ENABLEDYNAVIEW = "enabledynaview";
    public static final String FIELD_ENABLEMOB = "ENABLEMOB";
    protected static final String DTOFIELD_ENABLEMOB = "enablemob";
    public static final String FIELD_EXTCNTSTATES = "EXTCNTSTATES";
    protected static final String DTOFIELD_EXTCNTSTATES = "extcntstates";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBWFEDITVIEWTYPE = "MOBWFEDITVIEWTYPE";
    protected static final String DTOFIELD_MOBWFEDITVIEWTYPE = "mobwfeditviewtype";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_NAMEPSLANRESID = "NAMEPSLANRESID";
    protected static final String DTOFIELD_NAMEPSLANRESID = "namepslanresid";
    public static final String FIELD_NAMEPSLANRESNAME = "NAMEPSLANRESNAME";
    protected static final String DTOFIELD_NAMEPSLANRESNAME = "namepslanresname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSWFCATID = "PSSYSWFCATID";
    protected static final String DTOFIELD_PSSYSWFCATID = "pssyswfcatid";
    public static final String FIELD_PSSYSWFCATNAME = "PSSYSWFCATNAME";
    protected static final String DTOFIELD_PSSYSWFCATNAME = "pssyswfcatname";
    public static final String FIELD_PSWORKFLOWID = "PSWORKFLOWID";
    protected static final String DTOFIELD_PSWORKFLOWID = "psworkflowid";
    public static final String FIELD_PSWORKFLOWNAME = "PSWORKFLOWNAME";
    protected static final String DTOFIELD_PSWORKFLOWNAME = "psworkflowname";
    public static final String FIELD_PSWXACCOUNTID = "PSWXACCOUNTID";
    protected static final String DTOFIELD_PSWXACCOUNTID = "pswxaccountid";
    public static final String FIELD_PSWXACCOUNTNAME = "PSWXACCOUNTNAME";
    protected static final String DTOFIELD_PSWXACCOUNTNAME = "pswxaccountname";
    public static final String FIELD_PSWXENTAPPID = "PSWXENTAPPID";
    protected static final String DTOFIELD_PSWXENTAPPID = "pswxentappid";
    public static final String FIELD_PSWXENTAPPNAME = "PSWXENTAPPNAME";
    protected static final String DTOFIELD_PSWXENTAPPNAME = "pswxentappname";
    public static final String FIELD_REMINDPSSYSMSGTEMPLID = "REMINDPSSYSMSGTEMPLID";
    protected static final String DTOFIELD_REMINDPSSYSMSGTEMPLID = "remindpssysmsgtemplid";
    public static final String FIELD_REMINDPSSYSMSGTEMPLNAME = "REMINDPSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_REMINDPSSYSMSGTEMPLNAME = "remindpssysmsgtemplname";
    public static final String FIELD_REMOTEENGINEFLAG = "REMOTEENGINEFLAG";
    protected static final String DTOFIELD_REMOTEENGINEFLAG = "remoteengineflag";
    public static final String FIELD_STARTMOBPSDEVIEWID = "STARTMOBPSDEVIEWID";
    protected static final String DTOFIELD_STARTMOBPSDEVIEWID = "startmobpsdeviewid";
    public static final String FIELD_STARTMOBPSDEVIEWNAME = "STARTMOBPSDEVIEWNAME";
    protected static final String DTOFIELD_STARTMOBPSDEVIEWNAME = "startmobpsdeviewname";
    public static final String FIELD_STARTPSDEVIEWID = "STARTPSDEVIEWID";
    protected static final String DTOFIELD_STARTPSDEVIEWID = "startpsdeviewid";
    public static final String FIELD_STARTPSDEVIEWNAME = "STARTPSDEVIEWNAME";
    protected static final String DTOFIELD_STARTPSDEVIEWNAME = "startpsdeviewname";
    public static final String FIELD_STATECODELISTID = "STATECODELISTID";
    protected static final String DTOFIELD_STATECODELISTID = "statecodelistid";
    public static final String FIELD_STATECODELISTNAME = "STATECODELISTNAME";
    protected static final String DTOFIELD_STATECODELISTNAME = "statecodelistname";
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
    public static final String FIELD_WFCANCELVALUE = "WFCANCELVALUE";
    protected static final String DTOFIELD_WFCANCELVALUE = "wfcancelvalue";
    public static final String FIELD_WFCANCELVALUETEXT = "WFCANCELVALUETEXT";
    protected static final String DTOFIELD_WFCANCELVALUETEXT = "wfcancelvaluetext";
    public static final String FIELD_WFEDITVIEWTYPE = "WFEDITVIEWTYPE";
    protected static final String DTOFIELD_WFEDITVIEWTYPE = "wfeditviewtype";
    public static final String FIELD_WFENGINETYPE = "WFENGINETYPE";
    protected static final String DTOFIELD_WFENGINETYPE = "wfenginetype";
    public static final String FIELD_WFERRORVALUE = "WFERRORVALUE";
    protected static final String DTOFIELD_WFERRORVALUE = "wferrorvalue";
    public static final String FIELD_WFERRORVALUETEXT = "WFERRORVALUETEXT";
    protected static final String DTOFIELD_WFERRORVALUETEXT = "wferrorvaluetext";
    public static final String FIELD_WFFINISHVALUE = "WFFINISHEVALUE";
    protected static final String DTOFIELD_WFFINISHVALUE = "wffinishvalue";
    public static final String FIELD_WFFINISHVALUETEXT = "WFFINISHEVALUETEXT";
    protected static final String DTOFIELD_WFFINISHVALUETEXT = "wffinishvaluetext";
    public static final String FIELD_WFPROXYMODE = "WFPROXYMODE";
    protected static final String DTOFIELD_WFPROXYMODE = "wfproxymode";
    public static final String FIELD_WFSN = "WFSN";
    protected static final String DTOFIELD_WFSN = "wfsn";
    public static final String FIELD_WFSTATEVALUE = "WFSTATEVALUE";
    protected static final String DTOFIELD_WFSTATEVALUE = "wfstatevalue";
    public static final String FIELD_WFSTEPCODELISTID = "WFSTEPCODELISTID";
    protected static final String DTOFIELD_WFSTEPCODELISTID = "wfstepcodelistid";
    public static final String FIELD_WFSTEPCODELISTNAME = "WFSTEPCODELISTNAME";
    protected static final String DTOFIELD_WFSTEPCODELISTNAME = "wfstepcodelistname";
    public static final String FIELD_WFTAG = "WFTAG";
    protected static final String DTOFIELD_WFTAG = "wftag";
    public static final String FIELD_WFTAG2 = "WFTAG2";
    protected static final String DTOFIELD_WFTAG2 = "wftag2";
    public static final String FIELD_WFTAG3 = "WFTAG3";
    protected static final String DTOFIELD_WFTAG3 = "wftag3";
    public static final String FIELD_WFTAG4 = "WFTAG4";
    protected static final String DTOFIELD_WFTAG4 = "wftag4";
    public static final String FIELD_WFTYPE = "WFTYPE";
    protected static final String DTOFIELD_WFTYPE = "wftype";

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
    public PSWorkflowDTO actionmobpsdeviewid(String actionMobPSDEViewId) {
        this.setActionMobPSDEViewId(actionMobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO actionmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSWorkflowDTO actionmobpsdeviewname(String actionMobPSDEViewName) {
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
    public PSWorkflowDTO actionpsdeviewid(String actionPSDEViewId) {
        this.setActionPSDEViewId(actionPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO actionpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSWorkflowDTO actionpsdeviewname(String actionPSDEViewName) {
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
    public PSWorkflowDTO codename(String codeName) {
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
    public PSWorkflowDTO createdate(Timestamp createDate) {
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
    public PSWorkflowDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSWorkflowDTO editablewfstep(String editableWFStep) {
        this.setEditableWFStep(editableWFStep);
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
    public PSWorkflowDTO enabledynasys(Integer enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO enabledynasys(PSModelEnums.DynaSysMode enableDynaSys) {
        if (enableDynaSys == null) {
            this.setEnableDynaSys(null);
        } else {
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    @JsonProperty(value="enabledynaview")
    public void setEnableDynaView(Integer enableDynaView) {
        this._set(DTOFIELD_ENABLEDYNAVIEW, enableDynaView);
    }

    @JsonIgnore
    public Integer getEnableDynaView() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNAVIEW);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaViewDirty() {
        return this._contains(DTOFIELD_ENABLEDYNAVIEW);
    }

    @JsonIgnore
    public void resetEnableDynaView() {
        this._reset(DTOFIELD_ENABLEDYNAVIEW);
    }

    @JsonIgnore
    public PSWorkflowDTO enabledynaview(Integer enableDynaView) {
        this.setEnableDynaView(enableDynaView);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO enabledynaview(Boolean enableDynaView) {
        if (enableDynaView == null) {
            this.setEnableDynaView(null);
        } else {
            this.setEnableDynaView(enableDynaView != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablemob")
    public void setEnableMob(Integer enableMob) {
        this._set(DTOFIELD_ENABLEMOB, enableMob);
    }

    @JsonIgnore
    public Integer getEnableMob() {
        Object objValue = this._get(DTOFIELD_ENABLEMOB);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMobDirty() {
        return this._contains(DTOFIELD_ENABLEMOB);
    }

    @JsonIgnore
    public void resetEnableMob() {
        this._reset(DTOFIELD_ENABLEMOB);
    }

    @JsonIgnore
    public PSWorkflowDTO enablemob(Integer enableMob) {
        this.setEnableMob(enableMob);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO enablemob(Boolean enableMob) {
        if (enableMob == null) {
            this.setEnableMob(null);
        } else {
            this.setEnableMob(enableMob != false ? 1 : 0);
        }
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
    public PSWorkflowDTO extcntstates(String extCntStates) {
        this.setExtCntStates(extCntStates);
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
    public PSWorkflowDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobwfeditviewtype")
    public void setMobWFEditViewType(String mobWFEditViewType) {
        this._set(DTOFIELD_MOBWFEDITVIEWTYPE, mobWFEditViewType);
    }

    @JsonIgnore
    public String getMobWFEditViewType() {
        Object objValue = this._get(DTOFIELD_MOBWFEDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobWFEditViewTypeDirty() {
        return this._contains(DTOFIELD_MOBWFEDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetMobWFEditViewType() {
        this._reset(DTOFIELD_MOBWFEDITVIEWTYPE);
    }

    @JsonIgnore
    public PSWorkflowDTO mobwfeditviewtype(String mobWFEditViewType) {
        this.setMobWFEditViewType(mobWFEditViewType);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO mobwfeditviewtype(PSModelEnums.DEMobWFEditViewType mobWFEditViewType) {
        if (mobWFEditViewType == null) {
            this.setMobWFEditViewType(null);
        } else {
            this.setMobWFEditViewType(mobWFEditViewType.value);
        }
        return this;
    }

    @JsonProperty(value="modcolor")
    public void setModColor(String modColor) {
        this._set(DTOFIELD_MODCOLOR, modColor);
    }

    @JsonIgnore
    public String getModColor() {
        Object objValue = this._get(DTOFIELD_MODCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModColorDirty() {
        return this._contains(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public void resetModColor() {
        this._reset(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public PSWorkflowDTO modcolor(String modColor) {
        this.setModColor(modColor);
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
    public PSWorkflowDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSWorkflowDTO namepslanresname(String namePSLanResName) {
        this.setNamePSLanResName(namePSLanResName);
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
    public PSWorkflowDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setModColor(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setModColor(pSModule.getColor());
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
    public PSWorkflowDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSWorkflowDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSWorkflowDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSWorkflowDTO pssyswfcatid(String pSSysWFCatId) {
        this.setPSSysWFCatId(pSSysWFCatId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO pssyswfcatid(PSSysWFCatDTO pSSysWFCat) {
        if (pSSysWFCat == null) {
            this.setPSSysWFCatId(null);
            this.setPSSysWFCatName(null);
        } else {
            this.setPSSysWFCatId(pSSysWFCat.getPSSysWFCatId());
            this.setPSSysWFCatName(pSSysWFCat.getPSSysWFCatName());
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
    public PSWorkflowDTO pssyswfcatname(String pSSysWFCatName) {
        this.setPSSysWFCatName(pSSysWFCatName);
        return this;
    }

    @JsonProperty(value="psworkflowid")
    public void setPSWorkflowId(String pSWorkflowId) {
        this._set(DTOFIELD_PSWORKFLOWID, pSWorkflowId);
    }

    @JsonIgnore
    public String getPSWorkflowId() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowIdDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public void resetPSWorkflowId() {
        this._reset(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public PSWorkflowDTO psworkflowid(String pSWorkflowId) {
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    @JsonProperty(value="psworkflowname")
    public void setPSWorkflowName(String pSWorkflowName) {
        this._set(DTOFIELD_PSWORKFLOWNAME, pSWorkflowName);
    }

    @JsonIgnore
    public String getPSWorkflowName() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowNameDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public void resetPSWorkflowName() {
        this._reset(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO psworkflowname(String pSWorkflowName) {
        this.setPSWorkflowName(pSWorkflowName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWorkflowName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWorkflowName(strName);
    }

    @JsonIgnore
    public PSWorkflowDTO name(String strName) {
        this.setPSWorkflowName(strName);
        return this;
    }

    @JsonProperty(value="pswxaccountid")
    public void setPSWXAccountId(String pSWXAccountId) {
        this._set(DTOFIELD_PSWXACCOUNTID, pSWXAccountId);
    }

    @JsonIgnore
    public String getPSWXAccountId() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountIdDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public void resetPSWXAccountId() {
        this._reset(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public PSWorkflowDTO pswxaccountid(String pSWXAccountId) {
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO pswxaccountid(PSWXAccountDTO pSWXAccount) {
        if (pSWXAccount == null) {
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        } else {
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    @JsonProperty(value="pswxaccountname")
    public void setPSWXAccountName(String pSWXAccountName) {
        this._set(DTOFIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }

    @JsonIgnore
    public String getPSWXAccountName() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountNameDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public void resetPSWXAccountName() {
        this._reset(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO pswxaccountname(String pSWXAccountName) {
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    @JsonProperty(value="pswxentappid")
    public void setPSWXEntAppId(String pSWXEntAppId) {
        this._set(DTOFIELD_PSWXENTAPPID, pSWXEntAppId);
    }

    @JsonIgnore
    public String getPSWXEntAppId() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppIdDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public void resetPSWXEntAppId() {
        this._reset(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public PSWorkflowDTO pswxentappid(String pSWXEntAppId) {
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO pswxentappid(PSWXEntAppDTO pSWXEntApp) {
        if (pSWXEntApp == null) {
            this.setPSWXEntAppId(null);
            this.setPSWXEntAppName(null);
        } else {
            this.setPSWXEntAppId(pSWXEntApp.getPSWXEntAppId());
            this.setPSWXEntAppName(pSWXEntApp.getPSWXEntAppName());
        }
        return this;
    }

    @JsonProperty(value="pswxentappname")
    public void setPSWXEntAppName(String pSWXEntAppName) {
        this._set(DTOFIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }

    @JsonIgnore
    public String getPSWXEntAppName() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppNameDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public void resetPSWXEntAppName() {
        this._reset(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO pswxentappname(String pSWXEntAppName) {
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    @JsonProperty(value="remindpssysmsgtemplid")
    public void setRemindPSSysMsgTemplId(String remindPSSysMsgTemplId) {
        this._set(DTOFIELD_REMINDPSSYSMSGTEMPLID, remindPSSysMsgTemplId);
    }

    @JsonIgnore
    public String getRemindPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_REMINDPSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemindPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_REMINDPSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetRemindPSSysMsgTemplId() {
        this._reset(DTOFIELD_REMINDPSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplid(String remindPSSysMsgTemplId) {
        this.setRemindPSSysMsgTemplId(remindPSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setRemindPSSysMsgTemplId(null);
            this.setRemindPSSysMsgTemplName(null);
        } else {
            this.setRemindPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setRemindPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="remindpssysmsgtemplname")
    public void setRemindPSSysMsgTemplName(String remindPSSysMsgTemplName) {
        this._set(DTOFIELD_REMINDPSSYSMSGTEMPLNAME, remindPSSysMsgTemplName);
    }

    @JsonIgnore
    public String getRemindPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_REMINDPSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemindPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_REMINDPSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetRemindPSSysMsgTemplName() {
        this._reset(DTOFIELD_REMINDPSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplname(String remindPSSysMsgTemplName) {
        this.setRemindPSSysMsgTemplName(remindPSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="remoteengineflag")
    public void setRemoteEngineFlag(Integer remoteEngineFlag) {
        this._set(DTOFIELD_REMOTEENGINEFLAG, remoteEngineFlag);
    }

    @JsonIgnore
    public Integer getRemoteEngineFlag() {
        Object objValue = this._get(DTOFIELD_REMOTEENGINEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRemoteEngineFlagDirty() {
        return this._contains(DTOFIELD_REMOTEENGINEFLAG);
    }

    @JsonIgnore
    public void resetRemoteEngineFlag() {
        this._reset(DTOFIELD_REMOTEENGINEFLAG);
    }

    @JsonIgnore
    public PSWorkflowDTO remoteengineflag(Integer remoteEngineFlag) {
        this.setRemoteEngineFlag(remoteEngineFlag);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO remoteengineflag(Boolean remoteEngineFlag) {
        if (remoteEngineFlag == null) {
            this.setRemoteEngineFlag(null);
        } else {
            this.setRemoteEngineFlag(remoteEngineFlag != false ? 1 : 0);
        }
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
    public PSWorkflowDTO startmobpsdeviewid(String startMobPSDEViewId) {
        this.setStartMobPSDEViewId(startMobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO startmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSWorkflowDTO startmobpsdeviewname(String startMobPSDEViewName) {
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
    public PSWorkflowDTO startpsdeviewid(String startPSDEViewId) {
        this.setStartPSDEViewId(startPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO startpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSWorkflowDTO startpsdeviewname(String startPSDEViewName) {
        this.setStartPSDEViewName(startPSDEViewName);
        return this;
    }

    @JsonProperty(value="statecodelistid")
    public void setStateCodeListId(String stateCodeListId) {
        this._set(DTOFIELD_STATECODELISTID, stateCodeListId);
    }

    @JsonIgnore
    public String getStateCodeListId() {
        Object objValue = this._get(DTOFIELD_STATECODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStateCodeListIdDirty() {
        return this._contains(DTOFIELD_STATECODELISTID);
    }

    @JsonIgnore
    public void resetStateCodeListId() {
        this._reset(DTOFIELD_STATECODELISTID);
    }

    @JsonIgnore
    public PSWorkflowDTO statecodelistid(String stateCodeListId) {
        this.setStateCodeListId(stateCodeListId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO statecodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setStateCodeListId(null);
            this.setStateCodeListName(null);
        } else {
            this.setStateCodeListId(pSCodeList.getPSCodeListId());
            this.setStateCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="statecodelistname")
    public void setStateCodeListName(String stateCodeListName) {
        this._set(DTOFIELD_STATECODELISTNAME, stateCodeListName);
    }

    @JsonIgnore
    public String getStateCodeListName() {
        Object objValue = this._get(DTOFIELD_STATECODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStateCodeListNameDirty() {
        return this._contains(DTOFIELD_STATECODELISTNAME);
    }

    @JsonIgnore
    public void resetStateCodeListName() {
        this._reset(DTOFIELD_STATECODELISTNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO statecodelistname(String stateCodeListName) {
        this.setStateCodeListName(stateCodeListName);
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
    public PSWorkflowDTO updatedate(Timestamp updateDate) {
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
    public PSWorkflowDTO updateman(String updateMan) {
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
    public PSWorkflowDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWorkflowDTO usertag(String userTag) {
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
    public PSWorkflowDTO usertag2(String userTag2) {
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
    public PSWorkflowDTO usertag3(String userTag3) {
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
    public PSWorkflowDTO usertag4(String userTag4) {
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
    public PSWorkflowDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wfcancelvalue")
    public void setWFCancelValue(String wFCancelValue) {
        this._set(DTOFIELD_WFCANCELVALUE, wFCancelValue);
    }

    @JsonIgnore
    public String getWFCancelValue() {
        Object objValue = this._get(DTOFIELD_WFCANCELVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFCancelValueDirty() {
        return this._contains(DTOFIELD_WFCANCELVALUE);
    }

    @JsonIgnore
    public void resetWFCancelValue() {
        this._reset(DTOFIELD_WFCANCELVALUE);
    }

    @JsonIgnore
    public PSWorkflowDTO wfcancelvalue(String wFCancelValue) {
        this.setWFCancelValue(wFCancelValue);
        return this;
    }

    @JsonProperty(value="wfcancelvaluetext")
    public void setWFCancelValueText(String wFCancelValueText) {
        this._set(DTOFIELD_WFCANCELVALUETEXT, wFCancelValueText);
    }

    @JsonIgnore
    public String getWFCancelValueText() {
        Object objValue = this._get(DTOFIELD_WFCANCELVALUETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFCancelValueTextDirty() {
        return this._contains(DTOFIELD_WFCANCELVALUETEXT);
    }

    @JsonIgnore
    public void resetWFCancelValueText() {
        this._reset(DTOFIELD_WFCANCELVALUETEXT);
    }

    @JsonIgnore
    public PSWorkflowDTO wfcancelvaluetext(String wFCancelValueText) {
        this.setWFCancelValueText(wFCancelValueText);
        return this;
    }

    @JsonProperty(value="wfeditviewtype")
    public void setWFEditViewType(String wFEditViewType) {
        this._set(DTOFIELD_WFEDITVIEWTYPE, wFEditViewType);
    }

    @JsonIgnore
    public String getWFEditViewType() {
        Object objValue = this._get(DTOFIELD_WFEDITVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEditViewTypeDirty() {
        return this._contains(DTOFIELD_WFEDITVIEWTYPE);
    }

    @JsonIgnore
    public void resetWFEditViewType() {
        this._reset(DTOFIELD_WFEDITVIEWTYPE);
    }

    @JsonIgnore
    public PSWorkflowDTO wfeditviewtype(String wFEditViewType) {
        this.setWFEditViewType(wFEditViewType);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO wfeditviewtype(PSModelEnums.DEWFEditViewType wFEditViewType) {
        if (wFEditViewType == null) {
            this.setWFEditViewType(null);
        } else {
            this.setWFEditViewType(wFEditViewType.value);
        }
        return this;
    }

    @JsonProperty(value="wfenginetype")
    public void setWFEngineType(String wFEngineType) {
        this._set(DTOFIELD_WFENGINETYPE, wFEngineType);
    }

    @JsonIgnore
    public String getWFEngineType() {
        Object objValue = this._get(DTOFIELD_WFENGINETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEngineTypeDirty() {
        return this._contains(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public void resetWFEngineType() {
        this._reset(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public PSWorkflowDTO wfenginetype(String wFEngineType) {
        this.setWFEngineType(wFEngineType);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO wfenginetype(PSModelEnums.WFEngineType wFEngineType) {
        if (wFEngineType == null) {
            this.setWFEngineType(null);
        } else {
            this.setWFEngineType(wFEngineType.value);
        }
        return this;
    }

    @JsonProperty(value="wferrorvalue")
    public void setWFErrorValue(String wFErrorValue) {
        this._set(DTOFIELD_WFERRORVALUE, wFErrorValue);
    }

    @JsonIgnore
    public String getWFErrorValue() {
        Object objValue = this._get(DTOFIELD_WFERRORVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFErrorValueDirty() {
        return this._contains(DTOFIELD_WFERRORVALUE);
    }

    @JsonIgnore
    public void resetWFErrorValue() {
        this._reset(DTOFIELD_WFERRORVALUE);
    }

    @JsonIgnore
    public PSWorkflowDTO wferrorvalue(String wFErrorValue) {
        this.setWFErrorValue(wFErrorValue);
        return this;
    }

    @JsonProperty(value="wferrorvaluetext")
    public void setWFErrorValueText(String wFErrorValueText) {
        this._set(DTOFIELD_WFERRORVALUETEXT, wFErrorValueText);
    }

    @JsonIgnore
    public String getWFErrorValueText() {
        Object objValue = this._get(DTOFIELD_WFERRORVALUETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFErrorValueTextDirty() {
        return this._contains(DTOFIELD_WFERRORVALUETEXT);
    }

    @JsonIgnore
    public void resetWFErrorValueText() {
        this._reset(DTOFIELD_WFERRORVALUETEXT);
    }

    @JsonIgnore
    public PSWorkflowDTO wferrorvaluetext(String wFErrorValueText) {
        this.setWFErrorValueText(wFErrorValueText);
        return this;
    }

    @JsonProperty(value="wffinishvalue")
    public void setWFFinishValue(String wFFinishValue) {
        this._set(DTOFIELD_WFFINISHVALUE, wFFinishValue);
        this._set(FIELD_WFFINISHVALUE, wFFinishValue);
    }

    @JsonIgnore
    public String getWFFinishValue() {
        Object objValue = this._get(DTOFIELD_WFFINISHVALUE);
        if (objValue == null && (objValue = this._get(FIELD_WFFINISHVALUE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFFinishValueDirty() {
        if (this._contains(DTOFIELD_WFFINISHVALUE)) {
            return true;
        }
        return this._contains(FIELD_WFFINISHVALUE);
    }

    @JsonIgnore
    public void resetWFFinishValue() {
        this._reset(DTOFIELD_WFFINISHVALUE);
        this._reset(FIELD_WFFINISHVALUE);
    }

    @JsonIgnore
    public PSWorkflowDTO wffinishvalue(String wFFinishValue) {
        this.setWFFinishValue(wFFinishValue);
        return this;
    }

    @JsonProperty(value="wffinishvaluetext")
    public void setWFFinishValueText(String wFFinishValueText) {
        this._set(DTOFIELD_WFFINISHVALUETEXT, wFFinishValueText);
        this._set(FIELD_WFFINISHVALUETEXT, wFFinishValueText);
    }

    @JsonIgnore
    public String getWFFinishValueText() {
        Object objValue = this._get(DTOFIELD_WFFINISHVALUETEXT);
        if (objValue == null && (objValue = this._get(FIELD_WFFINISHVALUETEXT)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFFinishValueTextDirty() {
        if (this._contains(DTOFIELD_WFFINISHVALUETEXT)) {
            return true;
        }
        return this._contains(FIELD_WFFINISHVALUETEXT);
    }

    @JsonIgnore
    public void resetWFFinishValueText() {
        this._reset(DTOFIELD_WFFINISHVALUETEXT);
        this._reset(FIELD_WFFINISHVALUETEXT);
    }

    @JsonIgnore
    public PSWorkflowDTO wffinishvaluetext(String wFFinishValueText) {
        this.setWFFinishValueText(wFFinishValueText);
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
    public PSWorkflowDTO wfproxymode(Integer wFProxyMode) {
        this.setWFProxyMode(wFProxyMode);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO wfproxymode(PSModelEnums.WFProxyMode wFProxyMode) {
        if (wFProxyMode == null) {
            this.setWFProxyMode(null);
        } else {
            this.setWFProxyMode(wFProxyMode.value);
        }
        return this;
    }

    @JsonProperty(value="wfsn")
    public void setWFSN(String wFSN) {
        this._set(DTOFIELD_WFSN, wFSN);
    }

    @JsonIgnore
    public String getWFSN() {
        Object objValue = this._get(DTOFIELD_WFSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFSNDirty() {
        return this._contains(DTOFIELD_WFSN);
    }

    @JsonIgnore
    public void resetWFSN() {
        this._reset(DTOFIELD_WFSN);
    }

    @JsonIgnore
    public PSWorkflowDTO wfsn(String wFSN) {
        this.setWFSN(wFSN);
        return this;
    }

    @JsonProperty(value="wfstatevalue")
    public void setWFStateValue(String wFStateValue) {
        this._set(DTOFIELD_WFSTATEVALUE, wFStateValue);
    }

    @JsonIgnore
    public String getWFStateValue() {
        Object objValue = this._get(DTOFIELD_WFSTATEVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStateValueDirty() {
        return this._contains(DTOFIELD_WFSTATEVALUE);
    }

    @JsonIgnore
    public void resetWFStateValue() {
        this._reset(DTOFIELD_WFSTATEVALUE);
    }

    @JsonIgnore
    public PSWorkflowDTO wfstatevalue(String wFStateValue) {
        this.setWFStateValue(wFStateValue);
        return this;
    }

    @JsonProperty(value="wfstepcodelistid")
    public void setWFStepCodeListId(String wFStepCodeListId) {
        this._set(DTOFIELD_WFSTEPCODELISTID, wFStepCodeListId);
    }

    @JsonIgnore
    public String getWFStepCodeListId() {
        Object objValue = this._get(DTOFIELD_WFSTEPCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepCodeListIdDirty() {
        return this._contains(DTOFIELD_WFSTEPCODELISTID);
    }

    @JsonIgnore
    public void resetWFStepCodeListId() {
        this._reset(DTOFIELD_WFSTEPCODELISTID);
    }

    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistid(String wFStepCodeListId) {
        this.setWFStepCodeListId(wFStepCodeListId);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setWFStepCodeListId(null);
            this.setWFStepCodeListName(null);
        } else {
            this.setWFStepCodeListId(pSCodeList.getPSCodeListId());
            this.setWFStepCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="wfstepcodelistname")
    public void setWFStepCodeListName(String wFStepCodeListName) {
        this._set(DTOFIELD_WFSTEPCODELISTNAME, wFStepCodeListName);
    }

    @JsonIgnore
    public String getWFStepCodeListName() {
        Object objValue = this._get(DTOFIELD_WFSTEPCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepCodeListNameDirty() {
        return this._contains(DTOFIELD_WFSTEPCODELISTNAME);
    }

    @JsonIgnore
    public void resetWFStepCodeListName() {
        this._reset(DTOFIELD_WFSTEPCODELISTNAME);
    }

    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistname(String wFStepCodeListName) {
        this.setWFStepCodeListName(wFStepCodeListName);
        return this;
    }

    @JsonProperty(value="wftag")
    public void setWFTag(String wFTag) {
        this._set(DTOFIELD_WFTAG, wFTag);
    }

    @JsonIgnore
    public String getWFTag() {
        Object objValue = this._get(DTOFIELD_WFTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFTagDirty() {
        return this._contains(DTOFIELD_WFTAG);
    }

    @JsonIgnore
    public void resetWFTag() {
        this._reset(DTOFIELD_WFTAG);
    }

    @JsonIgnore
    public PSWorkflowDTO wftag(String wFTag) {
        this.setWFTag(wFTag);
        return this;
    }

    @JsonProperty(value="wftag2")
    public void setWFTag2(String wFTag2) {
        this._set(DTOFIELD_WFTAG2, wFTag2);
    }

    @JsonIgnore
    public String getWFTag2() {
        Object objValue = this._get(DTOFIELD_WFTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFTag2Dirty() {
        return this._contains(DTOFIELD_WFTAG2);
    }

    @JsonIgnore
    public void resetWFTag2() {
        this._reset(DTOFIELD_WFTAG2);
    }

    @JsonIgnore
    public PSWorkflowDTO wftag2(String wFTag2) {
        this.setWFTag2(wFTag2);
        return this;
    }

    @JsonProperty(value="wftag3")
    public void setWFTag3(String wFTag3) {
        this._set(DTOFIELD_WFTAG3, wFTag3);
    }

    @JsonIgnore
    public String getWFTag3() {
        Object objValue = this._get(DTOFIELD_WFTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFTag3Dirty() {
        return this._contains(DTOFIELD_WFTAG3);
    }

    @JsonIgnore
    public void resetWFTag3() {
        this._reset(DTOFIELD_WFTAG3);
    }

    @JsonIgnore
    public PSWorkflowDTO wftag3(String wFTag3) {
        this.setWFTag3(wFTag3);
        return this;
    }

    @JsonProperty(value="wftag4")
    public void setWFTag4(String wFTag4) {
        this._set(DTOFIELD_WFTAG4, wFTag4);
    }

    @JsonIgnore
    public String getWFTag4() {
        Object objValue = this._get(DTOFIELD_WFTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFTag4Dirty() {
        return this._contains(DTOFIELD_WFTAG4);
    }

    @JsonIgnore
    public void resetWFTag4() {
        this._reset(DTOFIELD_WFTAG4);
    }

    @JsonIgnore
    public PSWorkflowDTO wftag4(String wFTag4) {
        this.setWFTag4(wFTag4);
        return this;
    }

    @JsonProperty(value="wftype")
    public void setWFType(String wFType) {
        this._set(DTOFIELD_WFTYPE, wFType);
    }

    @JsonIgnore
    public String getWFType() {
        Object objValue = this._get(DTOFIELD_WFTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFTypeDirty() {
        return this._contains(DTOFIELD_WFTYPE);
    }

    @JsonIgnore
    public void resetWFType() {
        this._reset(DTOFIELD_WFTYPE);
    }

    @JsonIgnore
    public PSWorkflowDTO wftype(String wFType) {
        this.setWFType(wFType);
        return this;
    }

    @JsonIgnore
    public PSWorkflowDTO wftype(PSModelEnums.WFType wFType) {
        if (wFType == null) {
            this.setWFType(null);
        } else {
            this.setWFType(wFType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWorkflowId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWorkflowId(strValue);
    }

    @JsonIgnore
    public PSWorkflowDTO id(String strValue) {
        this.setPSWorkflowId(strValue);
        return this;
    }
}
