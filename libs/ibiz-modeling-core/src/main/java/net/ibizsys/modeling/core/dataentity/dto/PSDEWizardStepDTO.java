package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEWizardStepDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_ENABLELOGIC = "ENABLELOGIC";
    protected static final String DTOFIELD_ENABLELOGIC = "enablelogic";
    public static final String FIELD_INITPSDEACTIONID = "INITPSDEACTIONID";
    protected static final String DTOFIELD_INITPSDEACTIONID = "initpsdeactionid";
    public static final String FIELD_INITPSDEACTIONNAME = "INITPSDEACTIONNAME";
    protected static final String DTOFIELD_INITPSDEACTIONNAME = "initpsdeactionname";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEXTPSDEACTIONID = "NEXTPSDEACTIONID";
    protected static final String DTOFIELD_NEXTPSDEACTIONID = "nextpsdeactionid";
    public static final String FIELD_NEXTPSDEACTIONNAME = "NEXTPSDEACTIONNAME";
    protected static final String DTOFIELD_NEXTPSDEACTIONNAME = "nextpsdeactionname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEWIZARDID = "PSDEWIZARDID";
    protected static final String DTOFIELD_PSDEWIZARDID = "psdewizardid";
    public static final String FIELD_PSDEWIZARDNAME = "PSDEWIZARDNAME";
    protected static final String DTOFIELD_PSDEWIZARDNAME = "psdewizardname";
    public static final String FIELD_PSDEWIZARDSTEPID = "PSDEWIZARDSTEPID";
    protected static final String DTOFIELD_PSDEWIZARDSTEPID = "psdewizardstepid";
    public static final String FIELD_PSDEWIZARDSTEPNAME = "PSDEWIZARDSTEPNAME";
    protected static final String DTOFIELD_PSDEWIZARDSTEPNAME = "psdewizardstepname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_STEPACTION = "STEPACTION";
    protected static final String DTOFIELD_STEPACTION = "stepaction";
    public static final String FIELD_STEPTAG = "STEPTAG";
    protected static final String DTOFIELD_STEPTAG = "steptag";
    public static final String FIELD_SUBTITLE = "SUBTITLE";
    protected static final String DTOFIELD_SUBTITLE = "subtitle";
    public static final String FIELD_SUBTITLEPSLANRESID = "SUBTITLEPSLANRESID";
    protected static final String DTOFIELD_SUBTITLEPSLANRESID = "subtitlepslanresid";
    public static final String FIELD_SUBTITLEPSLANRESNAME = "SUBTITLEPSLANRESNAME";
    protected static final String DTOFIELD_SUBTITLEPSLANRESNAME = "subtitlepslanresname";
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
    public static final String FIELD_VISIBLELOGIC = "VISIBLELOGIC";
    protected static final String DTOFIELD_VISIBLELOGIC = "visiblelogic";

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
    public PSDEWizardStepDTO createdate(Timestamp createDate) {
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
    public PSDEWizardStepDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDEWizardStepDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO enablelink(Boolean enableLink) {
        if (enableLink == null) {
            this.setEnableLink(null);
        } else {
            this.setEnableLink(enableLink != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablelogic")
    public void setEnableLogic(String enableLogic) {
        this._set(DTOFIELD_ENABLELOGIC, enableLogic);
    }

    @JsonIgnore
    public String getEnableLogic() {
        Object objValue = this._get(DTOFIELD_ENABLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnableLogicDirty() {
        return this._contains(DTOFIELD_ENABLELOGIC);
    }

    @JsonIgnore
    public void resetEnableLogic() {
        this._reset(DTOFIELD_ENABLELOGIC);
    }

    @JsonIgnore
    public PSDEWizardStepDTO enablelogic(String enableLogic) {
        this.setEnableLogic(enableLogic);
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
    public PSDEWizardStepDTO initpsdeactionid(String initPSDEActionId) {
        this.setInitPSDEActionId(initPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO initpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEWizardStepDTO initpsdeactionname(String initPSDEActionName) {
        this.setInitPSDEActionName(initPSDEActionName);
        return this;
    }

    @JsonProperty(value="lnpslanresid")
    public void setLNPSLanResId(String lNPSLanResId) {
        this._set(DTOFIELD_LNPSLANRESID, lNPSLanResId);
    }

    @JsonIgnore
    public String getLNPSLanResId() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResIdDirty() {
        return this._contains(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public void resetLNPSLanResId() {
        this._reset(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public PSDEWizardStepDTO lnpslanresid(String lNPSLanResId) {
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO lnpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        } else {
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="lnpslanresname")
    public void setLNPSLanResName(String lNPSLanResName) {
        this._set(DTOFIELD_LNPSLANRESNAME, lNPSLanResName);
    }

    @JsonIgnore
    public String getLNPSLanResName() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResNameDirty() {
        return this._contains(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public void resetLNPSLanResName() {
        this._reset(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEWizardStepDTO lnpslanresname(String lNPSLanResName) {
        this.setLNPSLanResName(lNPSLanResName);
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
    public PSDEWizardStepDTO logicname(String logicName) {
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
    public PSDEWizardStepDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nextpsdeactionid")
    public void setNextPSDEActionId(String nextPSDEActionId) {
        this._set(DTOFIELD_NEXTPSDEACTIONID, nextPSDEActionId);
    }

    @JsonIgnore
    public String getNextPSDEActionId() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEActionIdDirty() {
        return this._contains(DTOFIELD_NEXTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetNextPSDEActionId() {
        this._reset(DTOFIELD_NEXTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEWizardStepDTO nextpsdeactionid(String nextPSDEActionId) {
        this.setNextPSDEActionId(nextPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO nextpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setNextPSDEActionId(null);
            this.setNextPSDEActionName(null);
        } else {
            this.setNextPSDEActionId(pSDEAction.getPSDEActionId());
            this.setNextPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="nextpsdeactionname")
    public void setNextPSDEActionName(String nextPSDEActionName) {
        this._set(DTOFIELD_NEXTPSDEACTIONNAME, nextPSDEActionName);
    }

    @JsonIgnore
    public String getNextPSDEActionName() {
        Object objValue = this._get(DTOFIELD_NEXTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextPSDEActionNameDirty() {
        return this._contains(DTOFIELD_NEXTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetNextPSDEActionName() {
        this._reset(DTOFIELD_NEXTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEWizardStepDTO nextpsdeactionname(String nextPSDEActionName) {
        this.setNextPSDEActionName(nextPSDEActionName);
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
    public PSDEWizardStepDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEWizardStepDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO psdeformid(PSDEFormDTO pSDEForm) {
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
    public PSDEWizardStepDTO psdeformname(String pSDEFormName) {
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
    public PSDEWizardStepDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEWizardStepDTO psdewizardid(String pSDEWizardId) {
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO psdewizardid(PSDEWizardDTO pSDEWizard) {
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
    public PSDEWizardStepDTO psdewizardname(String pSDEWizardName) {
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
    public PSDEWizardStepDTO psdewizardstepid(String pSDEWizardStepId) {
        this.setPSDEWizardStepId(pSDEWizardStepId);
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
    public PSDEWizardStepDTO psdewizardstepname(String pSDEWizardStepName) {
        this.setPSDEWizardStepName(pSDEWizardStepName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEWizardStepName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEWizardStepName(strName);
    }

    @JsonIgnore
    public PSDEWizardStepDTO name(String strName) {
        this.setPSDEWizardStepName(strName);
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
    public PSDEWizardStepDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEWizardStepDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDEWizardStepDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEWizardStepDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="stepaction")
    public void setStepAction(String stepAction) {
        this._set(DTOFIELD_STEPACTION, stepAction);
    }

    @JsonIgnore
    public String getStepAction() {
        Object objValue = this._get(DTOFIELD_STEPACTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepActionDirty() {
        return this._contains(DTOFIELD_STEPACTION);
    }

    @JsonIgnore
    public void resetStepAction() {
        this._reset(DTOFIELD_STEPACTION);
    }

    @JsonIgnore
    public PSDEWizardStepDTO stepaction(String stepAction) {
        this.setStepAction(stepAction);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO stepaction(PSModelEnums.WizardStepAction[] stepAction) {
        if (stepAction == null || stepAction.length == 0) {
            this.setStepAction(null);
        } else {
            String _value = "";
            for (PSModelEnums.WizardStepAction _item : stepAction) {
                if (_value.length() > 0) {
                    _value = _value + ";";
                }
                _value = _value + _item.value;
            }
            this.setStepAction(_value);
        }
        return this;
    }

    @JsonProperty(value="steptag")
    public void setStepTag(String stepTag) {
        this._set(DTOFIELD_STEPTAG, stepTag);
    }

    @JsonIgnore
    public String getStepTag() {
        Object objValue = this._get(DTOFIELD_STEPTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepTagDirty() {
        return this._contains(DTOFIELD_STEPTAG);
    }

    @JsonIgnore
    public void resetStepTag() {
        this._reset(DTOFIELD_STEPTAG);
    }

    @JsonIgnore
    public PSDEWizardStepDTO steptag(String stepTag) {
        this.setStepTag(stepTag);
        return this;
    }

    @JsonProperty(value="subtitle")
    public void setSubTitle(String subTitle) {
        this._set(DTOFIELD_SUBTITLE, subTitle);
    }

    @JsonIgnore
    public String getSubTitle() {
        Object objValue = this._get(DTOFIELD_SUBTITLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubTitleDirty() {
        return this._contains(DTOFIELD_SUBTITLE);
    }

    @JsonIgnore
    public void resetSubTitle() {
        this._reset(DTOFIELD_SUBTITLE);
    }

    @JsonIgnore
    public PSDEWizardStepDTO subtitle(String subTitle) {
        this.setSubTitle(subTitle);
        return this;
    }

    @JsonProperty(value="subtitlepslanresid")
    public void setSubTitlePSLanResId(String subTitlePSLanResId) {
        this._set(DTOFIELD_SUBTITLEPSLANRESID, subTitlePSLanResId);
    }

    @JsonIgnore
    public String getSubTitlePSLanResId() {
        Object objValue = this._get(DTOFIELD_SUBTITLEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubTitlePSLanResIdDirty() {
        return this._contains(DTOFIELD_SUBTITLEPSLANRESID);
    }

    @JsonIgnore
    public void resetSubTitlePSLanResId() {
        this._reset(DTOFIELD_SUBTITLEPSLANRESID);
    }

    @JsonIgnore
    public PSDEWizardStepDTO subtitlepslanresid(String subTitlePSLanResId) {
        this.setSubTitlePSLanResId(subTitlePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO subtitlepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setSubTitlePSLanResId(null);
            this.setSubTitlePSLanResName(null);
        } else {
            this.setSubTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="subtitlepslanresname")
    public void setSubTitlePSLanResName(String subTitlePSLanResName) {
        this._set(DTOFIELD_SUBTITLEPSLANRESNAME, subTitlePSLanResName);
    }

    @JsonIgnore
    public String getSubTitlePSLanResName() {
        Object objValue = this._get(DTOFIELD_SUBTITLEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubTitlePSLanResNameDirty() {
        return this._contains(DTOFIELD_SUBTITLEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetSubTitlePSLanResName() {
        this._reset(DTOFIELD_SUBTITLEPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEWizardStepDTO subtitlepslanresname(String subTitlePSLanResName) {
        this.setSubTitlePSLanResName(subTitlePSLanResName);
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
    public PSDEWizardStepDTO updatedate(Timestamp updateDate) {
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
    public PSDEWizardStepDTO updateman(String updateMan) {
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
    public PSDEWizardStepDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEWizardStepDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEWizardStepDTO usertag(String userTag) {
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
    public PSDEWizardStepDTO usertag2(String userTag2) {
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
    public PSDEWizardStepDTO usertag3(String userTag3) {
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
    public PSDEWizardStepDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="visiblelogic")
    public void setVisibleLogic(String visibleLogic) {
        this._set(DTOFIELD_VISIBLELOGIC, visibleLogic);
    }

    @JsonIgnore
    public String getVisibleLogic() {
        Object objValue = this._get(DTOFIELD_VISIBLELOGIC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVisibleLogicDirty() {
        return this._contains(DTOFIELD_VISIBLELOGIC);
    }

    @JsonIgnore
    public void resetVisibleLogic() {
        this._reset(DTOFIELD_VISIBLELOGIC);
    }

    @JsonIgnore
    public PSDEWizardStepDTO visiblelogic(String visibleLogic) {
        this.setVisibleLogic(visibleLogic);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEWizardStepId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEWizardStepId(strValue);
    }

    @JsonIgnore
    public PSDEWizardStepDTO id(String strValue) {
        this.setPSDEWizardStepId(strValue);
        return this;
    }
}
