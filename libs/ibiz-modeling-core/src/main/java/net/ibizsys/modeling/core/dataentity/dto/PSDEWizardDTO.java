package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEWizardDTO
extends PSModelDTOBase {
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLEMSLOGIC = "ENABLEMSLOGIC";
    protected static final String DTOFIELD_ENABLEMSLOGIC = "enablemslogic";
    public static final String FIELD_FINISHCAPTION = "FINISHCAPTION";
    protected static final String DTOFIELD_FINISHCAPTION = "finishcaption";
    public static final String FIELD_FINISHPSDEACTIONID = "FINISHPSDEACTIONID";
    protected static final String DTOFIELD_FINISHPSDEACTIONID = "finishpsdeactionid";
    public static final String FIELD_FINISHPSDEACTIONNAME = "FINISHPSDEACTIONNAME";
    protected static final String DTOFIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";
    public static final String FIELD_FINISHPSLANRESID = "FINISHPSLANRESID";
    protected static final String DTOFIELD_FINISHPSLANRESID = "finishpslanresid";
    public static final String FIELD_FINISHPSLANRESNAME = "FINISHPSLANRESNAME";
    protected static final String DTOFIELD_FINISHPSLANRESNAME = "finishpslanresname";
    public static final String FIELD_INITPSDEACTIONID = "INITPSDEACTIONID";
    protected static final String DTOFIELD_INITPSDEACTIONID = "initpsdeactionid";
    public static final String FIELD_INITPSDEACTIONNAME = "INITPSDEACTIONNAME";
    protected static final String DTOFIELD_INITPSDEACTIONNAME = "initpsdeactionname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEXTCAPTION = "NEXTCAPTION";
    protected static final String DTOFIELD_NEXTCAPTION = "nextcaption";
    public static final String FIELD_NEXTPSLANRESID = "NEXTPSLANRESID";
    protected static final String DTOFIELD_NEXTPSLANRESID = "nextpslanresid";
    public static final String FIELD_NEXTPSLANRESNAME = "NEXTPSLANRESNAME";
    protected static final String DTOFIELD_NEXTPSLANRESNAME = "nextpslanresname";
    public static final String FIELD_PREVCAPTION = "PREVCAPTION";
    protected static final String DTOFIELD_PREVCAPTION = "prevcaption";
    public static final String FIELD_PREVPSLANRESID = "PREVPSLANRESID";
    protected static final String DTOFIELD_PREVPSLANRESID = "prevpslanresid";
    public static final String FIELD_PREVPSLANRESNAME = "PREVPSLANRESNAME";
    protected static final String DTOFIELD_PREVPSLANRESNAME = "prevpslanresname";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSCTRLMSGID = "PSCTRLMSGID";
    protected static final String DTOFIELD_PSCTRLMSGID = "psctrlmsgid";
    public static final String FIELD_PSCTRLMSGNAME = "PSCTRLMSGNAME";
    protected static final String DTOFIELD_PSCTRLMSGNAME = "psctrlmsgname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMSLOGICID = "PSDEMSLOGICID";
    protected static final String DTOFIELD_PSDEMSLOGICID = "psdemslogicid";
    public static final String FIELD_PSDEMSLOGICNAME = "PSDEMSLOGICNAME";
    protected static final String DTOFIELD_PSDEMSLOGICNAME = "psdemslogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEWIZARDID = "PSDEWIZARDID";
    protected static final String DTOFIELD_PSDEWIZARDID = "psdewizardid";
    public static final String FIELD_PSDEWIZARDNAME = "PSDEWIZARDNAME";
    protected static final String DTOFIELD_PSDEWIZARDNAME = "psdewizardname";
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
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_STATEPSDEFID = "STATEPSDEFID";
    protected static final String DTOFIELD_STATEPSDEFID = "statepsdefid";
    public static final String FIELD_STATEPSDEFNAME = "STATEPSDEFNAME";
    protected static final String DTOFIELD_STATEPSDEFNAME = "statepsdefname";
    public static final String FIELD_STATEWIZARDFLAG = "STATEWIZARDFLAG";
    protected static final String DTOFIELD_STATEWIZARDFLAG = "statewizardflag";
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
    public static final String FIELD_WIZARDSTYLE = "WIZARDSTYLE";
    protected static final String DTOFIELD_WIZARDSTYLE = "wizardstyle";
    public static final String DTOFIELD_PSDEWIZARDSTEPS = "psdewizardsteps";
    public static final String DTOFIELD_PSDEWIZARDFORMS = "psdewizardforms";
    public static final String DTOFIELD_PSDEWIZARDLOGICS = "psdewizardlogics";

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
    public PSDEWizardDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO busyindicator(Boolean busyIndicator) {
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
    public PSDEWizardDTO codename(String codeName) {
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
    public PSDEWizardDTO createdate(Timestamp createDate) {
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
    public PSDEWizardDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enablemslogic")
    public void setEnableMSLogic(Integer enableMSLogic) {
        this._set(DTOFIELD_ENABLEMSLOGIC, enableMSLogic);
    }

    @JsonIgnore
    public Integer getEnableMSLogic() {
        Object objValue = this._get(DTOFIELD_ENABLEMSLOGIC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMSLogicDirty() {
        return this._contains(DTOFIELD_ENABLEMSLOGIC);
    }

    @JsonIgnore
    public void resetEnableMSLogic() {
        this._reset(DTOFIELD_ENABLEMSLOGIC);
    }

    @JsonIgnore
    public PSDEWizardDTO enablemslogic(Integer enableMSLogic) {
        this.setEnableMSLogic(enableMSLogic);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO enablemslogic(Boolean enableMSLogic) {
        if (enableMSLogic == null) {
            this.setEnableMSLogic(null);
        } else {
            this.setEnableMSLogic(enableMSLogic != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="finishcaption")
    public void setFinishCaption(String finishCaption) {
        this._set(DTOFIELD_FINISHCAPTION, finishCaption);
    }

    @JsonIgnore
    public String getFinishCaption() {
        Object objValue = this._get(DTOFIELD_FINISHCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishCaptionDirty() {
        return this._contains(DTOFIELD_FINISHCAPTION);
    }

    @JsonIgnore
    public void resetFinishCaption() {
        this._reset(DTOFIELD_FINISHCAPTION);
    }

    @JsonIgnore
    public PSDEWizardDTO finishcaption(String finishCaption) {
        this.setFinishCaption(finishCaption);
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
    public PSDEWizardDTO finishpsdeactionid(String finishPSDEActionId) {
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO finishpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEWizardDTO finishpsdeactionname(String finishPSDEActionName) {
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    @JsonProperty(value="finishpslanresid")
    public void setFinishPSLanResId(String finishPSLanResId) {
        this._set(DTOFIELD_FINISHPSLANRESID, finishPSLanResId);
    }

    @JsonIgnore
    public String getFinishPSLanResId() {
        Object objValue = this._get(DTOFIELD_FINISHPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSLanResIdDirty() {
        return this._contains(DTOFIELD_FINISHPSLANRESID);
    }

    @JsonIgnore
    public void resetFinishPSLanResId() {
        this._reset(DTOFIELD_FINISHPSLANRESID);
    }

    @JsonIgnore
    public PSDEWizardDTO finishpslanresid(String finishPSLanResId) {
        this.setFinishPSLanResId(finishPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO finishpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setFinishPSLanResId(null);
            this.setFinishPSLanResName(null);
        } else {
            this.setFinishPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setFinishPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="finishpslanresname")
    public void setFinishPSLanResName(String finishPSLanResName) {
        this._set(DTOFIELD_FINISHPSLANRESNAME, finishPSLanResName);
    }

    @JsonIgnore
    public String getFinishPSLanResName() {
        Object objValue = this._get(DTOFIELD_FINISHPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFinishPSLanResNameDirty() {
        return this._contains(DTOFIELD_FINISHPSLANRESNAME);
    }

    @JsonIgnore
    public void resetFinishPSLanResName() {
        this._reset(DTOFIELD_FINISHPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEWizardDTO finishpslanresname(String finishPSLanResName) {
        this.setFinishPSLanResName(finishPSLanResName);
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
    public PSDEWizardDTO initpsdeactionid(String initPSDEActionId) {
        this.setInitPSDEActionId(initPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO initpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEWizardDTO initpsdeactionname(String initPSDEActionName) {
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
    public PSDEWizardDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nextcaption")
    public void setNextCaption(String nextCaption) {
        this._set(DTOFIELD_NEXTCAPTION, nextCaption);
    }

    @JsonIgnore
    public String getNextCaption() {
        Object objValue = this._get(DTOFIELD_NEXTCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextCaptionDirty() {
        return this._contains(DTOFIELD_NEXTCAPTION);
    }

    @JsonIgnore
    public void resetNextCaption() {
        this._reset(DTOFIELD_NEXTCAPTION);
    }

    @JsonIgnore
    public PSDEWizardDTO nextcaption(String nextCaption) {
        this.setNextCaption(nextCaption);
        return this;
    }

    @JsonProperty(value="nextpslanresid")
    public void setNextPSLanResId(String nextPSLanResId) {
        this._set(DTOFIELD_NEXTPSLANRESID, nextPSLanResId);
    }

    @JsonIgnore
    public String getNextPSLanResId() {
        Object objValue = this._get(DTOFIELD_NEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSLanResIdDirty() {
        return this._contains(DTOFIELD_NEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetNextPSLanResId() {
        this._reset(DTOFIELD_NEXTPSLANRESID);
    }

    @JsonIgnore
    public PSDEWizardDTO nextpslanresid(String nextPSLanResId) {
        this.setNextPSLanResId(nextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO nextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setNextPSLanResId(null);
            this.setNextPSLanResName(null);
        } else {
            this.setNextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="nextpslanresname")
    public void setNextPSLanResName(String nextPSLanResName) {
        this._set(DTOFIELD_NEXTPSLANRESNAME, nextPSLanResName);
    }

    @JsonIgnore
    public String getNextPSLanResName() {
        Object objValue = this._get(DTOFIELD_NEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSLanResNameDirty() {
        return this._contains(DTOFIELD_NEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetNextPSLanResName() {
        this._reset(DTOFIELD_NEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEWizardDTO nextpslanresname(String nextPSLanResName) {
        this.setNextPSLanResName(nextPSLanResName);
        return this;
    }

    @JsonProperty(value="prevcaption")
    public void setPrevCaption(String prevCaption) {
        this._set(DTOFIELD_PREVCAPTION, prevCaption);
    }

    @JsonIgnore
    public String getPrevCaption() {
        Object objValue = this._get(DTOFIELD_PREVCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevCaptionDirty() {
        return this._contains(DTOFIELD_PREVCAPTION);
    }

    @JsonIgnore
    public void resetPrevCaption() {
        this._reset(DTOFIELD_PREVCAPTION);
    }

    @JsonIgnore
    public PSDEWizardDTO prevcaption(String prevCaption) {
        this.setPrevCaption(prevCaption);
        return this;
    }

    @JsonProperty(value="prevpslanresid")
    public void setPrevPSLanResId(String prevPSLanResId) {
        this._set(DTOFIELD_PREVPSLANRESID, prevPSLanResId);
    }

    @JsonIgnore
    public String getPrevPSLanResId() {
        Object objValue = this._get(DTOFIELD_PREVPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSLanResIdDirty() {
        return this._contains(DTOFIELD_PREVPSLANRESID);
    }

    @JsonIgnore
    public void resetPrevPSLanResId() {
        this._reset(DTOFIELD_PREVPSLANRESID);
    }

    @JsonIgnore
    public PSDEWizardDTO prevpslanresid(String prevPSLanResId) {
        this.setPrevPSLanResId(prevPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO prevpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setPrevPSLanResId(null);
            this.setPrevPSLanResName(null);
        } else {
            this.setPrevPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPrevPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="prevpslanresname")
    public void setPrevPSLanResName(String prevPSLanResName) {
        this._set(DTOFIELD_PREVPSLANRESNAME, prevPSLanResName);
    }

    @JsonIgnore
    public String getPrevPSLanResName() {
        Object objValue = this._get(DTOFIELD_PREVPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrevPSLanResNameDirty() {
        return this._contains(DTOFIELD_PREVPSLANRESNAME);
    }

    @JsonIgnore
    public void resetPrevPSLanResName() {
        this._reset(DTOFIELD_PREVPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEWizardDTO prevpslanresname(String prevPSLanResName) {
        this.setPrevPSLanResName(prevPSLanResName);
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
    public PSDEWizardDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDEWizardDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
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
    public PSDEWizardDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
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
    public PSDEWizardDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSDEWizardDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemslogicid")
    public void setPSDEMSLogicId(String pSDEMSLogicId) {
        this._set(DTOFIELD_PSDEMSLOGICID, pSDEMSLogicId);
    }

    @JsonIgnore
    public String getPSDEMSLogicId() {
        Object objValue = this._get(DTOFIELD_PSDEMSLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMSLogicIdDirty() {
        return this._contains(DTOFIELD_PSDEMSLOGICID);
    }

    @JsonIgnore
    public void resetPSDEMSLogicId() {
        this._reset(DTOFIELD_PSDEMSLOGICID);
    }

    @JsonIgnore
    public PSDEWizardDTO psdemslogicid(String pSDEMSLogicId) {
        this.setPSDEMSLogicId(pSDEMSLogicId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO psdemslogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDEMSLogicId(null);
            this.setPSDEMSLogicName(null);
        } else {
            this.setPSDEMSLogicId(pSDELogic.getPSDELogicId());
            this.setPSDEMSLogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdemslogicname")
    public void setPSDEMSLogicName(String pSDEMSLogicName) {
        this._set(DTOFIELD_PSDEMSLOGICNAME, pSDEMSLogicName);
    }

    @JsonIgnore
    public String getPSDEMSLogicName() {
        Object objValue = this._get(DTOFIELD_PSDEMSLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMSLogicNameDirty() {
        return this._contains(DTOFIELD_PSDEMSLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEMSLogicName() {
        this._reset(DTOFIELD_PSDEMSLOGICNAME);
    }

    @JsonIgnore
    public PSDEWizardDTO psdemslogicname(String pSDEMSLogicName) {
        this.setPSDEMSLogicName(pSDEMSLogicName);
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
    public PSDEWizardDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEWizardDTO psdewizardid(String pSDEWizardId) {
        this.setPSDEWizardId(pSDEWizardId);
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
    public PSDEWizardDTO psdewizardname(String pSDEWizardName) {
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEWizardName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEWizardName(strName);
    }

    @JsonIgnore
    public PSDEWizardDTO name(String strName) {
        this.setPSDEWizardName(strName);
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
    public PSDEWizardDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEWizardDTO pssyscssname(String pSSysCssName) {
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
    public PSDEWizardDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEWizardDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEWizardDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEWizardDTO pssysreqitemname(String pSSysReqItemName) {
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
    public PSDEWizardDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
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
    public PSDEWizardDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
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
    public PSDEWizardDTO statepsdefid(String statePSDEFId) {
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO statepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEWizardDTO statepsdefname(String statePSDEFName) {
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    @JsonProperty(value="statewizardflag")
    public void setStateWizardFlag(Integer stateWizardFlag) {
        this._set(DTOFIELD_STATEWIZARDFLAG, stateWizardFlag);
    }

    @JsonIgnore
    public Integer getStateWizardFlag() {
        Object objValue = this._get(DTOFIELD_STATEWIZARDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStateWizardFlagDirty() {
        return this._contains(DTOFIELD_STATEWIZARDFLAG);
    }

    @JsonIgnore
    public void resetStateWizardFlag() {
        this._reset(DTOFIELD_STATEWIZARDFLAG);
    }

    @JsonIgnore
    public PSDEWizardDTO statewizardflag(Integer stateWizardFlag) {
        this.setStateWizardFlag(stateWizardFlag);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO statewizardflag(Boolean stateWizardFlag) {
        if (stateWizardFlag == null) {
            this.setStateWizardFlag(null);
        } else {
            this.setStateWizardFlag(stateWizardFlag != false ? 1 : 0);
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
    public PSDEWizardDTO updatedate(Timestamp updateDate) {
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
    public PSDEWizardDTO updateman(String updateMan) {
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
    public PSDEWizardDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEWizardDTO usertag(String userTag) {
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
    public PSDEWizardDTO usertag2(String userTag2) {
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
    public PSDEWizardDTO usertag3(String userTag3) {
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
    public PSDEWizardDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="wizardstyle")
    public void setWizardStyle(String wizardStyle) {
        this._set(DTOFIELD_WIZARDSTYLE, wizardStyle);
    }

    @JsonIgnore
    public String getWizardStyle() {
        Object objValue = this._get(DTOFIELD_WIZARDSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWizardStyleDirty() {
        return this._contains(DTOFIELD_WIZARDSTYLE);
    }

    @JsonIgnore
    public void resetWizardStyle() {
        this._reset(DTOFIELD_WIZARDSTYLE);
    }

    @JsonIgnore
    public PSDEWizardDTO wizardstyle(String wizardStyle) {
        this.setWizardStyle(wizardStyle);
        return this;
    }

    @JsonIgnore
    public PSDEWizardDTO wizardstyle(PSModelEnums.WizardStyle wizardStyle) {
        if (wizardStyle == null) {
            this.setWizardStyle(null);
        } else {
            this.setWizardStyle(wizardStyle.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEWizardId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEWizardId(strValue);
    }

    @JsonIgnore
    public PSDEWizardDTO id(String strValue) {
        this.setPSDEWizardId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEWizardStepDTO> getPSDEWizardSteps() {
        Object list = this._get(DTOFIELD_PSDEWIZARDSTEPS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdewizardsteps")
    public void setPSDEWizardSteps(List<PSDEWizardStepDTO> psdewizardsteps) {
        this._set(DTOFIELD_PSDEWIZARDSTEPS, psdewizardsteps);
    }

    @JsonIgnore
    public List<PSDEWizardStepDTO> getPSDEWizardStepsIf() {
        Object list = this._get(DTOFIELD_PSDEWIZARDSTEPS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEWIZARDSTEPS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEWizardFormDTO> getPSDEWizardForms() {
        Object list = this._get(DTOFIELD_PSDEWIZARDFORMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdewizardforms")
    public void setPSDEWizardForms(List<PSDEWizardFormDTO> psdewizardforms) {
        this._set(DTOFIELD_PSDEWIZARDFORMS, psdewizardforms);
    }

    @JsonIgnore
    public List<PSDEWizardFormDTO> getPSDEWizardFormsIf() {
        Object list = this._get(DTOFIELD_PSDEWIZARDFORMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEWIZARDFORMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEWizardLogicDTO> getPSDEWizardLogics() {
        Object list = this._get(DTOFIELD_PSDEWIZARDLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdewizardlogics")
    public void setPSDEWizardLogics(List<PSDEWizardLogicDTO> psdewizardlogics) {
        this._set(DTOFIELD_PSDEWIZARDLOGICS, psdewizardlogics);
    }

    @JsonIgnore
    public List<PSDEWizardLogicDTO> getPSDEWizardLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEWIZARDLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEWIZARDLOGICS, list);
        }
        return (List) list;
    }
}
