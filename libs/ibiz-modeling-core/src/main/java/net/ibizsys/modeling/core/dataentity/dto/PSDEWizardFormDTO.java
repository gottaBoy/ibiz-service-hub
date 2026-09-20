package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEWizardFormDTO
extends PSModelDTOBase {
    public static final String FIELD_CMPSLANRESID = "CMPSLANRESID";
    protected static final String DTOFIELD_CMPSLANRESID = "cmpslanresid";
    public static final String FIELD_CMPSLANRESID2 = "CMPSLANRESID2";
    protected static final String DTOFIELD_CMPSLANRESID2 = "cmpslanresid2";
    public static final String FIELD_CMPSLANRESNAME = "CMPSLANRESNAME";
    protected static final String DTOFIELD_CMPSLANRESNAME = "cmpslanresname";
    public static final String FIELD_CMPSLANRESNAME2 = "CMPSLANRESNAME2";
    protected static final String DTOFIELD_CMPSLANRESNAME2 = "cmpslanresname2";
    public static final String FIELD_CONFIRMINFO = "CONFIRMINFO";
    protected static final String DTOFIELD_CONFIRMINFO = "confirminfo";
    public static final String FIELD_CONFIRMINFO2 = "CONFIRMINFO2";
    protected static final String DTOFIELD_CONFIRMINFO2 = "confirminfo2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FINISHENABLELOGIC = "FINISHENABLELOGIC";
    protected static final String DTOFIELD_FINISHENABLELOGIC = "finishenablelogic";
    public static final String FIELD_FIRSTFORM = "FIRSTFORM";
    protected static final String DTOFIELD_FIRSTFORM = "firstform";
    public static final String FIELD_FORMTAG = "FORMTAG";
    protected static final String DTOFIELD_FORMTAG = "formtag";
    public static final String FIELD_LOADPSDEACTIONID = "LOADPSDEACTIONID";
    protected static final String DTOFIELD_LOADPSDEACTIONID = "loadpsdeactionid";
    public static final String FIELD_LOADPSDEACTIONNAME = "LOADPSDEACTIONNAME";
    protected static final String DTOFIELD_LOADPSDEACTIONNAME = "loadpsdeactionname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBPSDEFORMID = "MOBPSDEFORMID";
    protected static final String DTOFIELD_MOBPSDEFORMID = "mobpsdeformid";
    public static final String FIELD_MOBPSDEFORMNAME = "MOBPSDEFORMNAME";
    protected static final String DTOFIELD_MOBPSDEFORMNAME = "mobpsdeformname";
    public static final String FIELD_NEXTENABLELOGIC = "NEXTENABLELOGIC";
    protected static final String DTOFIELD_NEXTENABLELOGIC = "nextenablelogic";
    public static final String FIELD_PREVENABLELOGIC = "PREVENABLELOGIC";
    protected static final String DTOFIELD_PREVENABLELOGIC = "prevenablelogic";
    public static final String FIELD_PREVPSDEACTIONID = "PREVPSDEACTIONID";
    protected static final String DTOFIELD_PREVPSDEACTIONID = "prevpsdeactionid";
    public static final String FIELD_PREVPSDEACTIONNAME = "PREVPSDEACTIONNAME";
    protected static final String DTOFIELD_PREVPSDEACTIONNAME = "prevpsdeactionname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEWIZARDFORMID = "PSDEWIZARDFORMID";
    protected static final String DTOFIELD_PSDEWIZARDFORMID = "psdewizardformid";
    public static final String FIELD_PSDEWIZARDFORMNAME = "PSDEWIZARDFORMNAME";
    protected static final String DTOFIELD_PSDEWIZARDFORMNAME = "psdewizardformname";
    public static final String FIELD_PSDEWIZARDID = "PSDEWIZARDID";
    protected static final String DTOFIELD_PSDEWIZARDID = "psdewizardid";
    public static final String FIELD_PSDEWIZARDNAME = "PSDEWIZARDNAME";
    protected static final String DTOFIELD_PSDEWIZARDNAME = "psdewizardname";
    public static final String FIELD_PSDEWIZARDSTEPID = "PSDEWIZARDSTEPID";
    protected static final String DTOFIELD_PSDEWIZARDSTEPID = "psdewizardstepid";
    public static final String FIELD_PSDEWIZARDSTEPNAME = "PSDEWIZARDSTEPNAME";
    protected static final String DTOFIELD_PSDEWIZARDSTEPNAME = "psdewizardstepname";
    public static final String FIELD_SAVEPSDEACTIONID = "SAVEPSDEACTIONID";
    protected static final String DTOFIELD_SAVEPSDEACTIONID = "savepsdeactionid";
    public static final String FIELD_SAVEPSDEACTIONNAME = "SAVEPSDEACTIONNAME";
    protected static final String DTOFIELD_SAVEPSDEACTIONNAME = "savepsdeactionname";
    public static final String FIELD_STEPACTIONS = "STEPACTIONS";
    protected static final String DTOFIELD_STEPACTIONS = "stepactions";
    public static final String FIELD_STEPORDERVALUE = "STEPORDERVALUE";
    protected static final String DTOFIELD_STEPORDERVALUE = "stepordervalue";
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
    public PSDEWizardFormDTO cmpslanresid(String cMPSLanResId) {
        this.setCMPSLanResId(cMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCMPSLanResId(null);
            this.setCMPSLanResName(null);
        } else {
            this.setCMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cmpslanresid2")
    public void setCMPSLanResId2(String cMPSLanResId2) {
        this._set(DTOFIELD_CMPSLANRESID2, cMPSLanResId2);
    }

    @JsonIgnore
    public String getCMPSLanResId2() {
        Object objValue = this._get(DTOFIELD_CMPSLANRESID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCMPSLanResId2Dirty() {
        return this._contains(DTOFIELD_CMPSLANRESID2);
    }

    @JsonIgnore
    public void resetCMPSLanResId2() {
        this._reset(DTOFIELD_CMPSLANRESID2);
    }

    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresid2(String cMPSLanResId2) {
        this.setCMPSLanResId2(cMPSLanResId2);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresid2(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCMPSLanResId2(null);
            this.setCMPSLanResName2(null);
        } else {
            this.setCMPSLanResId2(pSLanguageRes.getPSLanguageResId());
            this.setCMPSLanResName2(pSLanguageRes.getPSLanguageResName());
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
    public PSDEWizardFormDTO cmpslanresname(String cMPSLanResName) {
        this.setCMPSLanResName(cMPSLanResName);
        return this;
    }

    @JsonProperty(value="cmpslanresname2")
    public void setCMPSLanResName2(String cMPSLanResName2) {
        this._set(DTOFIELD_CMPSLANRESNAME2, cMPSLanResName2);
    }

    @JsonIgnore
    public String getCMPSLanResName2() {
        Object objValue = this._get(DTOFIELD_CMPSLANRESNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCMPSLanResName2Dirty() {
        return this._contains(DTOFIELD_CMPSLANRESNAME2);
    }

    @JsonIgnore
    public void resetCMPSLanResName2() {
        this._reset(DTOFIELD_CMPSLANRESNAME2);
    }

    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresname2(String cMPSLanResName2) {
        this.setCMPSLanResName2(cMPSLanResName2);
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
    public PSDEWizardFormDTO confirminfo(String confirmInfo) {
        this.setConfirmInfo(confirmInfo);
        return this;
    }

    @JsonProperty(value="confirminfo2")
    public void setConfirmInfo2(String confirmInfo2) {
        this._set(DTOFIELD_CONFIRMINFO2, confirmInfo2);
    }

    @JsonIgnore
    public String getConfirmInfo2() {
        Object objValue = this._get(DTOFIELD_CONFIRMINFO2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConfirmInfo2Dirty() {
        return this._contains(DTOFIELD_CONFIRMINFO2);
    }

    @JsonIgnore
    public void resetConfirmInfo2() {
        this._reset(DTOFIELD_CONFIRMINFO2);
    }

    @JsonIgnore
    public PSDEWizardFormDTO confirminfo2(String confirmInfo2) {
        this.setConfirmInfo2(confirmInfo2);
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
    public PSDEWizardFormDTO createdate(Timestamp createDate) {
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
    public PSDEWizardFormDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="finishenablelogic")
    public void setFinishEnableLogic(String finishEnableLogic) {
        this._set(DTOFIELD_FINISHENABLELOGIC, finishEnableLogic);
    }

    @JsonIgnore
    public String getFinishEnableLogic() {
        Object objValue = this._get(DTOFIELD_FINISHENABLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishEnableLogicDirty() {
        return this._contains(DTOFIELD_FINISHENABLELOGIC);
    }

    @JsonIgnore
    public void resetFinishEnableLogic() {
        this._reset(DTOFIELD_FINISHENABLELOGIC);
    }

    @JsonIgnore
    public PSDEWizardFormDTO finishenablelogic(String finishEnableLogic) {
        this.setFinishEnableLogic(finishEnableLogic);
        return this;
    }

    @JsonProperty(value="firstform")
    public void setFirstForm(Integer firstForm) {
        this._set(DTOFIELD_FIRSTFORM, firstForm);
    }

    @JsonIgnore
    public Integer getFirstForm() {
        Object objValue = this._get(DTOFIELD_FIRSTFORM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFirstFormDirty() {
        return this._contains(DTOFIELD_FIRSTFORM);
    }

    @JsonIgnore
    public void resetFirstForm() {
        this._reset(DTOFIELD_FIRSTFORM);
    }

    @JsonIgnore
    public PSDEWizardFormDTO firstform(Integer firstForm) {
        this.setFirstForm(firstForm);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO firstform(Boolean firstForm) {
        if (firstForm == null) {
            this.setFirstForm(null);
        } else {
            this.setFirstForm(firstForm != false ? 1 : 0);
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
    public PSDEWizardFormDTO formtag(String formTag) {
        this.setFormTag(formTag);
        return this;
    }

    @JsonProperty(value="loadpsdeactionid")
    public void setLoadPSDEActionId(String loadPSDEActionId) {
        this._set(DTOFIELD_LOADPSDEACTIONID, loadPSDEActionId);
    }

    @JsonIgnore
    public String getLoadPSDEActionId() {
        Object objValue = this._get(DTOFIELD_LOADPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLoadPSDEActionIdDirty() {
        return this._contains(DTOFIELD_LOADPSDEACTIONID);
    }

    @JsonIgnore
    public void resetLoadPSDEActionId() {
        this._reset(DTOFIELD_LOADPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionid(String loadPSDEActionId) {
        this.setLoadPSDEActionId(loadPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setLoadPSDEActionId(null);
            this.setLoadPSDEActionName(null);
        } else {
            this.setLoadPSDEActionId(pSDEAction.getPSDEActionId());
            this.setLoadPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="loadpsdeactionname")
    public void setLoadPSDEActionName(String loadPSDEActionName) {
        this._set(DTOFIELD_LOADPSDEACTIONNAME, loadPSDEActionName);
    }

    @JsonIgnore
    public String getLoadPSDEActionName() {
        Object objValue = this._get(DTOFIELD_LOADPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLoadPSDEActionNameDirty() {
        return this._contains(DTOFIELD_LOADPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetLoadPSDEActionName() {
        this._reset(DTOFIELD_LOADPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionname(String loadPSDEActionName) {
        this.setLoadPSDEActionName(loadPSDEActionName);
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
    public PSDEWizardFormDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSDEWizardFormDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEWizardFormDTO mobpsdeformid(String mobPSDEFormId) {
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO mobpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        } else {
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
    public PSDEWizardFormDTO mobpsdeformname(String mobPSDEFormName) {
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    @JsonProperty(value="nextenablelogic")
    public void setNextEnableLogic(String nextEnableLogic) {
        this._set(DTOFIELD_NEXTENABLELOGIC, nextEnableLogic);
    }

    @JsonIgnore
    public String getNextEnableLogic() {
        Object objValue = this._get(DTOFIELD_NEXTENABLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextEnableLogicDirty() {
        return this._contains(DTOFIELD_NEXTENABLELOGIC);
    }

    @JsonIgnore
    public void resetNextEnableLogic() {
        this._reset(DTOFIELD_NEXTENABLELOGIC);
    }

    @JsonIgnore
    public PSDEWizardFormDTO nextenablelogic(String nextEnableLogic) {
        this.setNextEnableLogic(nextEnableLogic);
        return this;
    }

    @JsonProperty(value="prevenablelogic")
    public void setPrevEnableLogic(String prevEnableLogic) {
        this._set(DTOFIELD_PREVENABLELOGIC, prevEnableLogic);
    }

    @JsonIgnore
    public String getPrevEnableLogic() {
        Object objValue = this._get(DTOFIELD_PREVENABLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevEnableLogicDirty() {
        return this._contains(DTOFIELD_PREVENABLELOGIC);
    }

    @JsonIgnore
    public void resetPrevEnableLogic() {
        this._reset(DTOFIELD_PREVENABLELOGIC);
    }

    @JsonIgnore
    public PSDEWizardFormDTO prevenablelogic(String prevEnableLogic) {
        this.setPrevEnableLogic(prevEnableLogic);
        return this;
    }

    @JsonProperty(value="prevpsdeactionid")
    public void setPrevPSDEActionId(String prevPSDEActionId) {
        this._set(DTOFIELD_PREVPSDEACTIONID, prevPSDEActionId);
    }

    @JsonIgnore
    public String getPrevPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PREVPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PREVPSDEACTIONID);
    }

    @JsonIgnore
    public void resetPrevPSDEActionId() {
        this._reset(DTOFIELD_PREVPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionid(String prevPSDEActionId) {
        this.setPrevPSDEActionId(prevPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPrevPSDEActionId(null);
            this.setPrevPSDEActionName(null);
        } else {
            this.setPrevPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPrevPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="prevpsdeactionname")
    public void setPrevPSDEActionName(String prevPSDEActionName) {
        this._set(DTOFIELD_PREVPSDEACTIONNAME, prevPSDEActionName);
    }

    @JsonIgnore
    public String getPrevPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PREVPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PREVPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPrevPSDEActionName() {
        this._reset(DTOFIELD_PREVPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionname(String prevPSDEActionName) {
        this.setPrevPSDEActionName(prevPSDEActionName);
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
    public PSDEWizardFormDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdeformid(PSDEFormDTO pSDEForm) {
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
    public PSDEWizardFormDTO psdeformname(String pSDEFormName) {
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
    public PSDEWizardFormDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdewizardformid")
    public void setPSDEWizardFormId(String pSDEWizardFormId) {
        this._set(DTOFIELD_PSDEWIZARDFORMID, pSDEWizardFormId);
    }

    @JsonIgnore
    public String getPSDEWizardFormId() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardFormIdDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDFORMID);
    }

    @JsonIgnore
    public void resetPSDEWizardFormId() {
        this._reset(DTOFIELD_PSDEWIZARDFORMID);
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardformid(String pSDEWizardFormId) {
        this.setPSDEWizardFormId(pSDEWizardFormId);
        return this;
    }

    @JsonProperty(value="psdewizardformname")
    public void setPSDEWizardFormName(String pSDEWizardFormName) {
        this._set(DTOFIELD_PSDEWIZARDFORMNAME, pSDEWizardFormName);
    }

    @JsonIgnore
    public String getPSDEWizardFormName() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardFormNameDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEWizardFormName() {
        this._reset(DTOFIELD_PSDEWIZARDFORMNAME);
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardformname(String pSDEWizardFormName) {
        this.setPSDEWizardFormName(pSDEWizardFormName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEWizardFormName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEWizardFormName(strName);
    }

    @JsonIgnore
    public PSDEWizardFormDTO name(String strName) {
        this.setPSDEWizardFormName(strName);
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
    public PSDEWizardFormDTO psdewizardid(String pSDEWizardId) {
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardid(PSDEWizardDTO pSDEWizard) {
        if (pSDEWizard == null) {
            this.setPSDEId(null);
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        } else {
            this.setPSDEId(pSDEWizard.getPSDEId());
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
    public PSDEWizardFormDTO psdewizardname(String pSDEWizardName) {
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    @JsonProperty(value="psdewizardstepid")
    public void setPSDEWizardStepId(String pSDEWizardStepId) {
        this._set(DTOFIELD_PSDEWIZARDSTEPID, pSDEWizardStepId);
    }

    @JsonIgnore
    public String getPSDEWizardStepId() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDSTEPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardStepIdDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDSTEPID);
    }

    @JsonIgnore
    public void resetPSDEWizardStepId() {
        this._reset(DTOFIELD_PSDEWIZARDSTEPID);
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepid(String pSDEWizardStepId) {
        this.setPSDEWizardStepId(pSDEWizardStepId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepid(PSDEWizardStepDTO pSDEWizardStep) {
        if (pSDEWizardStep == null) {
            this.setPSDEWizardStepId(null);
            this.setPSDEWizardStepName(null);
            this.setStepOrderValue(null);
        } else {
            this.setPSDEWizardStepId(pSDEWizardStep.getPSDEWizardStepId());
            this.setPSDEWizardStepName(pSDEWizardStep.getPSDEWizardStepName());
            this.setStepOrderValue(pSDEWizardStep.getOrderValue());
        }
        return this;
    }

    @JsonProperty(value="psdewizardstepname")
    public void setPSDEWizardStepName(String pSDEWizardStepName) {
        this._set(DTOFIELD_PSDEWIZARDSTEPNAME, pSDEWizardStepName);
    }

    @JsonIgnore
    public String getPSDEWizardStepName() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDSTEPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardStepNameDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDSTEPNAME);
    }

    @JsonIgnore
    public void resetPSDEWizardStepName() {
        this._reset(DTOFIELD_PSDEWIZARDSTEPNAME);
    }

    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepname(String pSDEWizardStepName) {
        this.setPSDEWizardStepName(pSDEWizardStepName);
        return this;
    }

    @JsonProperty(value="savepsdeactionid")
    public void setSavePSDEActionId(String savePSDEActionId) {
        this._set(DTOFIELD_SAVEPSDEACTIONID, savePSDEActionId);
    }

    @JsonIgnore
    public String getSavePSDEActionId() {
        Object objValue = this._get(DTOFIELD_SAVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSavePSDEActionIdDirty() {
        return this._contains(DTOFIELD_SAVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetSavePSDEActionId() {
        this._reset(DTOFIELD_SAVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionid(String savePSDEActionId) {
        this.setSavePSDEActionId(savePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setSavePSDEActionId(null);
            this.setSavePSDEActionName(null);
        } else {
            this.setSavePSDEActionId(pSDEAction.getPSDEActionId());
            this.setSavePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="savepsdeactionname")
    public void setSavePSDEActionName(String savePSDEActionName) {
        this._set(DTOFIELD_SAVEPSDEACTIONNAME, savePSDEActionName);
    }

    @JsonIgnore
    public String getSavePSDEActionName() {
        Object objValue = this._get(DTOFIELD_SAVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSavePSDEActionNameDirty() {
        return this._contains(DTOFIELD_SAVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetSavePSDEActionName() {
        this._reset(DTOFIELD_SAVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionname(String savePSDEActionName) {
        this.setSavePSDEActionName(savePSDEActionName);
        return this;
    }

    @JsonProperty(value="stepactions")
    public void setStepActions(String stepActions) {
        this._set(DTOFIELD_STEPACTIONS, stepActions);
    }

    @JsonIgnore
    public String getStepActions() {
        Object objValue = this._get(DTOFIELD_STEPACTIONS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepActionsDirty() {
        return this._contains(DTOFIELD_STEPACTIONS);
    }

    @JsonIgnore
    public void resetStepActions() {
        this._reset(DTOFIELD_STEPACTIONS);
    }

    @JsonIgnore
    public PSDEWizardFormDTO stepactions(String stepActions) {
        this.setStepActions(stepActions);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO stepactions(PSModelEnums.WizardStepAction[] stepActions) {
        if (stepActions == null || stepActions.length == 0) {
            this.setStepActions(null);
        } else {
            String _value = "";
            for (PSModelEnums.WizardStepAction _item : stepActions) {
                if (_value.length() > 0) {
                    _value = _value + ";";
                }
                _value = _value + _item.value;
            }
            this.setStepActions(_value);
        }
        return this;
    }

    @JsonProperty(value="stepordervalue")
    public void setStepOrderValue(Integer stepOrderValue) {
        this._set(DTOFIELD_STEPORDERVALUE, stepOrderValue);
    }

    @JsonIgnore
    public Integer getStepOrderValue() {
        Object objValue = this._get(DTOFIELD_STEPORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStepOrderValueDirty() {
        return this._contains(DTOFIELD_STEPORDERVALUE);
    }

    @JsonIgnore
    public void resetStepOrderValue() {
        this._reset(DTOFIELD_STEPORDERVALUE);
    }

    @JsonIgnore
    public PSDEWizardFormDTO stepordervalue(Integer stepOrderValue) {
        this.setStepOrderValue(stepOrderValue);
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
    public PSDEWizardFormDTO updatedate(Timestamp updateDate) {
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
    public PSDEWizardFormDTO updateman(String updateMan) {
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
    public PSDEWizardFormDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEWizardFormDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEWizardFormDTO usertag(String userTag) {
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
    public PSDEWizardFormDTO usertag2(String userTag2) {
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
    public PSDEWizardFormDTO usertag3(String userTag3) {
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
    public PSDEWizardFormDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEWizardFormId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEWizardFormId(strValue);
    }

    @JsonIgnore
    public PSDEWizardFormDTO id(String strValue) {
        this.setPSDEWizardFormId(strValue);
        return this;
    }
}
