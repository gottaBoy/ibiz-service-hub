package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnPipelineStepDTO extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAMS = "ACTIONPARAMS";
    protected static final String DTOFIELD_ACTIONPARAMS = "actionparams";
    public static final String FIELD_ACTIONTYPE = "ACTIONTYPE";
    protected static final String DTOFIELD_ACTIONTYPE = "actiontype";
    public static final String FIELD_AGENTPSDCREGISTRYITEMID = "AGENTPSDCREGISTRYITEMID";
    protected static final String DTOFIELD_AGENTPSDCREGISTRYITEMID = "agentpsdcregistryitemid";
    public static final String FIELD_AGENTPSDCREGISTRYITEMNAME = "AGENTPSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_AGENTPSDCREGISTRYITEMNAME = "agentpsdcregistryitemname";
    public static final String FIELD_CHECKINMODE = "CHECKINMODE";
    protected static final String DTOFIELD_CHECKINMODE = "checkinmode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONDMODEL = "CONDMODEL";
    protected static final String DTOFIELD_CONDMODEL = "condmodel";
    public static final String FIELD_CONDMODELFLAG = "CONDMODELFLAG";
    protected static final String DTOFIELD_CONDMODELFLAG = "condmodelflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCHECKOUT = "CUSTOMCHECKOUT";
    protected static final String DTOFIELD_CUSTOMCHECKOUT = "customcheckout";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELPSDEVCENTERSVNID = "MODELPSDEVCENTERSVNID";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNID = "modelpsdevcentersvnid";
    public static final String FIELD_MODELPSDEVCENTERSVNNAME = "MODELPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNNAME = "modelpsdevcentersvnname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDCBDINSTID = "PSDCBDINSTID";
    protected static final String DTOFIELD_PSDCBDINSTID = "psdcbdinstid";
    public static final String FIELD_PSDCBDINSTNAME = "PSDCBDINSTNAME";
    protected static final String DTOFIELD_PSDCBDINSTNAME = "psdcbdinstname";
    public static final String FIELD_PSDCCODESNIPPETID = "PSDCCODESNIPPETID";
    protected static final String DTOFIELD_PSDCCODESNIPPETID = "psdccodesnippetid";
    public static final String FIELD_PSDCCODESNIPPETNAME = "PSDCCODESNIPPETNAME";
    protected static final String DTOFIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";
    public static final String FIELD_PSDCFILEID = "PSDCFILEID";
    protected static final String DTOFIELD_PSDCFILEID = "psdcfileid";
    public static final String FIELD_PSDCFILENAME = "PSDCFILENAME";
    protected static final String DTOFIELD_PSDCFILENAME = "psdcfilename";
    public static final String FIELD_PSDCMSPLATFORMFUNCID = "PSDCMSPLATFORMFUNCID";
    protected static final String DTOFIELD_PSDCMSPLATFORMFUNCID = "psdcmsplatformfuncid";
    public static final String FIELD_PSDCMSPLATFORMFUNCNAME = "PSDCMSPLATFORMFUNCNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMFUNCNAME = "psdcmsplatformfuncname";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNAME = "PSDCMSPLATFORMNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";
    public static final String FIELD_PSDCMSPLATFORMNODEID = "PSDCMSPLATFORMNODEID";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";
    public static final String FIELD_PSDCMSPLATFORMNODENAME = "PSDCMSPLATFORMNODENAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";
    public static final String FIELD_PSDCREGISTRYITEMID = "PSDCREGISTRYITEMID";
    protected static final String DTOFIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";
    public static final String FIELD_PSDCREGISTRYITEMNAME = "PSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";
    public static final String FIELD_PSDCREGISTRYREPOID = "PSDCREGISTRYREPOID";
    protected static final String DTOFIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";
    public static final String FIELD_PSDCREGISTRYREPONAME = "PSDCREGISTRYREPONAME";
    protected static final String DTOFIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";
    public static final String FIELD_PSDEVCENTERDBINSTID = "PSDEVCENTERDBINSTID";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";
    public static final String FIELD_PSDEVCENTERDBINSTNAME = "PSDEVCENTERDBINSTNAME";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNMSDEPAPIID = "PSDEVSLNMSDEPAPIID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPIID = "psdevslnmsdepapiid";
    public static final String FIELD_PSDEVSLNMSDEPAPINAME = "PSDEVSLNMSDEPAPINAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPINAME = "psdevslnmsdepapiname";
    public static final String FIELD_PSDEVSLNMSDEPAPPID = "PSDEVSLNMSDEPAPPID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPPID = "psdevslnmsdepappid";
    public static final String FIELD_PSDEVSLNMSDEPAPPNAME = "PSDEVSLNMSDEPAPPNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPPNAME = "psdevslnmsdepappname";
    public static final String FIELD_PSDEVSLNMSDEPFUNCID = "PSDEVSLNMSDEPFUNCID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCID = "psdevslnmsdepfuncid";
    public static final String FIELD_PSDEVSLNMSDEPFUNCNAME = "PSDEVSLNMSDEPFUNCNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCNAME = "psdevslnmsdepfuncname";
    public static final String FIELD_PSDEVSLNMSDEPLOYID = "PSDEVSLNMSDEPLOYID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";
    public static final String FIELD_PSDEVSLNMSDEPLOYNAME = "PSDEVSLNMSDEPLOYNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
    public static final String FIELD_PSDEVSLNPIPELINESTAGEID = "PSDEVSLNPIPELINESTAGEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGEID = "psdevslnpipelinestageid";
    public static final String FIELD_PSDEVSLNPIPELINESTAGENAME = "PSDEVSLNPIPELINESTAGENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGENAME = "psdevslnpipelinestagename";
    public static final String FIELD_PSDEVSLNPIPELINESTEPID = "PSDEVSLNPIPELINESTEPID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTEPID = "psdevslnpipelinestepid";
    public static final String FIELD_PSDEVSLNPIPELINESTEPNAME = "PSDEVSLNPIPELINESTEPNAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTEPNAME = "psdevslnpipelinestepname";
    public static final String FIELD_PSDEVSLNSYSAPIID = "PSDEVSLNSYSAPIID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";
    public static final String FIELD_PSDEVSLNSYSAPINAME = "PSDEVSLNSYSAPINAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";
    public static final String FIELD_PSDEVSLNSYSAPPID = "PSDEVSLNSYSAPPID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPID = "psdevslnsysappid";
    public static final String FIELD_PSDEVSLNSYSAPPNAME = "PSDEVSLNSYSAPPNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPNAME = "psdevslnsysappname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSSRVID = "PSDEVSLNSYSSRVID";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";
    public static final String FIELD_PSDEVSLNSYSSRVNAME = "PSDEVSLNSYSSRVNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";
    public static final String FIELD_PSDEVSLNSYSVERID = "PSDEVSLNSYSVERID";
    protected static final String DTOFIELD_PSDEVSLNSYSVERID = "psdevslnsysverid";
    public static final String FIELD_PSDEVSLNSYSVERNAME = "PSDEVSLNSYSVERNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSVERNAME = "psdevslnsysvername";
    public static final String FIELD_PSDEVSLNTEMPLID = "PSDEVSLNTEMPLID";
    protected static final String DTOFIELD_PSDEVSLNTEMPLID = "psdevslntemplid";
    public static final String FIELD_PSDEVSLNTEMPLNAME = "PSDEVSLNTEMPLNAME";
    protected static final String DTOFIELD_PSDEVSLNTEMPLNAME = "psdevslntemplname";
    public static final String FIELD_REFPSDEVSLNPIPELINEID = "REFPSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_REFPSDEVSLNPIPELINEID = "refpsdevslnpipelineid";
    public static final String FIELD_REFPSDEVSLNPIPELINENAME = "REFPSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_REFPSDEVSLNPIPELINENAME = "refpsdevslnpipelinename";
    public static final String FIELD_RUNCMD = "RUNCMD";
    protected static final String DTOFIELD_RUNCMD = "runcmd";
    public static final String FIELD_STEPTAG = "STEPTAG";
    protected static final String DTOFIELD_STEPTAG = "steptag";
    public static final String FIELD_STEPTAG2 = "STEPTAG2";
    protected static final String DTOFIELD_STEPTAG2 = "steptag2";
    public static final String FIELD_STEPTAG3 = "STEPTAG3";
    protected static final String DTOFIELD_STEPTAG3 = "steptag3";
    public static final String FIELD_STEPTAG4 = "STEPTAG4";
    protected static final String DTOFIELD_STEPTAG4 = "steptag4";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TEMPLPSDEVCENTERSVNID = "TEMPLPSDEVCENTERSVNID";
    protected static final String DTOFIELD_TEMPLPSDEVCENTERSVNID = "templpsdevcentersvnid";
    public static final String FIELD_TEMPLPSDEVCENTERSVNNAME = "TEMPLPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_TEMPLPSDEVCENTERSVNNAME = "templpsdevcentersvnname";
    public static final String FIELD_TOOLPSDCREGISTRYITEMID = "TOOLPSDCREGISTRYITEMID";
    protected static final String DTOFIELD_TOOLPSDCREGISTRYITEMID = "toolpsdcregistryitemid";
    public static final String FIELD_TOOLPSDCREGISTRYITEMNAME = "TOOLPSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_TOOLPSDCREGISTRYITEMNAME = "toolpsdcregistryitemname";
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
    public static final String FIELD_WORKFOLDER = "WORKFOLDER";
    protected static final String DTOFIELD_WORKFOLDER = "workfolder";

    @JsonProperty(value="actionparams")
    public void setActionParams(String actionParams) {
        this._set(DTOFIELD_ACTIONPARAMS, actionParams);
    }

    @JsonIgnore
    public String getActionParams() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamsDirty() {
        return this._contains(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public void resetActionParams() {
        this._reset(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO actionparams(String actionParams) {
        this.setActionParams(actionParams);
        return this;
    }

    @JsonProperty(value="actiontype")
    public void setActionType(String actionType) {
        this._set(DTOFIELD_ACTIONTYPE, actionType);
    }

    @JsonIgnore
    public String getActionType() {
        Object objValue = this._get(DTOFIELD_ACTIONTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTypeDirty() {
        return this._contains(DTOFIELD_ACTIONTYPE);
    }

    @JsonIgnore
    public void resetActionType() {
        this._reset(DTOFIELD_ACTIONTYPE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO actiontype(String actionType) {
        this.setActionType(actionType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO actiontype(PSModelEnums.PipelineStepType actionType) {
        this.setActionType(actionType == null ? null : actionType.value);
        return this;
    }

    @JsonProperty(value="agentpsdcregistryitemid")
    public void setAgentPSDCRegistryItemId(String agentPSDCRegistryItemId) {
        this._set(DTOFIELD_AGENTPSDCREGISTRYITEMID, agentPSDCRegistryItemId);
    }

    @JsonIgnore
    public String getAgentPSDCRegistryItemId() {
        Object objValue = this._get(DTOFIELD_AGENTPSDCREGISTRYITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentPSDCRegistryItemIdDirty() {
        return this._contains(DTOFIELD_AGENTPSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public void resetAgentPSDCRegistryItemId() {
        this._reset(DTOFIELD_AGENTPSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO agentpsdcregistryitemid(String agentPSDCRegistryItemId) {
        this.setAgentPSDCRegistryItemId(agentPSDCRegistryItemId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO agentpsdcregistryitemid(PSDCRegistryItemDTO pSDCRegistryItem) {
        if (pSDCRegistryItem == null) {
            this.setAgentPSDCRegistryItemId(null);
            this.setAgentPSDCRegistryItemName(null);
        } else {
            this.setAgentPSDCRegistryItemId(pSDCRegistryItem.getPSDCRegistryItemId());
            this.setAgentPSDCRegistryItemName(pSDCRegistryItem.getPSDCRegistryItemName());
        }
        return this;
    }

    @JsonProperty(value="agentpsdcregistryitemname")
    public void setAgentPSDCRegistryItemName(String agentPSDCRegistryItemName) {
        this._set(DTOFIELD_AGENTPSDCREGISTRYITEMNAME, agentPSDCRegistryItemName);
    }

    @JsonIgnore
    public String getAgentPSDCRegistryItemName() {
        Object objValue = this._get(DTOFIELD_AGENTPSDCREGISTRYITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentPSDCRegistryItemNameDirty() {
        return this._contains(DTOFIELD_AGENTPSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public void resetAgentPSDCRegistryItemName() {
        this._reset(DTOFIELD_AGENTPSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO agentpsdcregistryitemname(String agentPSDCRegistryItemName) {
        this.setAgentPSDCRegistryItemName(agentPSDCRegistryItemName);
        return this;
    }

    @JsonProperty(value="checkinmode")
    public void setCheckinMode(Integer checkinMode) {
        this._set(DTOFIELD_CHECKINMODE, checkinMode);
    }

    @JsonIgnore
    public Integer getCheckinMode() {
        Object objValue = this._get(DTOFIELD_CHECKINMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckinModeDirty() {
        return this._contains(DTOFIELD_CHECKINMODE);
    }

    @JsonIgnore
    public void resetCheckinMode() {
        this._reset(DTOFIELD_CHECKINMODE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO checkinmode(Integer checkinMode) {
        this.setCheckinMode(checkinMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO checkinmode(Boolean checkinMode) {
        this.setCheckinMode(checkinMode == null ? null : (checkinMode ? 1 : 0));
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="condmodel")
    public void setCondModel(String condModel) {
        this._set(DTOFIELD_CONDMODEL, condModel);
    }

    @JsonIgnore
    public String getCondModel() {
        Object objValue = this._get(DTOFIELD_CONDMODEL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondModelDirty() {
        return this._contains(DTOFIELD_CONDMODEL);
    }

    @JsonIgnore
    public void resetCondModel() {
        this._reset(DTOFIELD_CONDMODEL);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO condmodel(String condModel) {
        this.setCondModel(condModel);
        return this;
    }

    @JsonProperty(value="condmodelflag")
    public void setCondModelFlag(Integer condModelFlag) {
        this._set(DTOFIELD_CONDMODELFLAG, condModelFlag);
    }

    @JsonIgnore
    public Integer getCondModelFlag() {
        Object objValue = this._get(DTOFIELD_CONDMODELFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCondModelFlagDirty() {
        return this._contains(DTOFIELD_CONDMODELFLAG);
    }

    @JsonIgnore
    public void resetCondModelFlag() {
        this._reset(DTOFIELD_CONDMODELFLAG);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO condmodelflag(Integer condModelFlag) {
        this.setCondModelFlag(condModelFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO condmodelflag(Boolean condModelFlag) {
        this.setCondModelFlag(condModelFlag == null ? null : (condModelFlag ? 1 : 0));
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcheckout")
    public void setCustomCheckout(Integer customCheckout) {
        this._set(DTOFIELD_CUSTOMCHECKOUT, customCheckout);
    }

    @JsonIgnore
    public Integer getCustomCheckout() {
        Object objValue = this._get(DTOFIELD_CUSTOMCHECKOUT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomCheckoutDirty() {
        return this._contains(DTOFIELD_CUSTOMCHECKOUT);
    }

    @JsonIgnore
    public void resetCustomCheckout() {
        this._reset(DTOFIELD_CUSTOMCHECKOUT);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO customcheckout(Integer customCheckout) {
        this.setCustomCheckout(customCheckout);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO customcheckout(Boolean customCheckout) {
        this.setCustomCheckout(customCheckout == null ? null : (customCheckout ? 1 : 0));
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnid")
    public void setModelPSDevCenterSVNId(String modelPSDevCenterSVNId) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNID, modelPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNId() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO modelpsdevcentersvnid(String modelPSDevCenterSVNId) {
        this.setModelPSDevCenterSVNId(modelPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO modelpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setModelPSDevCenterSVNId(null);
            this.setModelPSDevCenterSVNName(null);
        } else {
            this.setModelPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setModelPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnname")
    public void setModelPSDevCenterSVNName(String modelPSDevCenterSVNName) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNNAME, modelPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNName() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO modelpsdevcentersvnname(String modelPSDevCenterSVNName) {
        this.setModelPSDevCenterSVNName(modelPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdcbdinstid")
    public void setPSDCBDInstId(String pSDCBDInstId) {
        this._set(DTOFIELD_PSDCBDINSTID, pSDCBDInstId);
    }

    @JsonIgnore
    public String getPSDCBDInstId() {
        Object objValue = this._get(DTOFIELD_PSDCBDINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCBDInstIdDirty() {
        return this._contains(DTOFIELD_PSDCBDINSTID);
    }

    @JsonIgnore
    public void resetPSDCBDInstId() {
        this._reset(DTOFIELD_PSDCBDINSTID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcbdinstid(String pSDCBDInstId) {
        this.setPSDCBDInstId(pSDCBDInstId);
        return this;
    }

    @JsonProperty(value="psdcbdinstname")
    public void setPSDCBDInstName(String pSDCBDInstName) {
        this._set(DTOFIELD_PSDCBDINSTNAME, pSDCBDInstName);
    }

    @JsonIgnore
    public String getPSDCBDInstName() {
        Object objValue = this._get(DTOFIELD_PSDCBDINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCBDInstNameDirty() {
        return this._contains(DTOFIELD_PSDCBDINSTNAME);
    }

    @JsonIgnore
    public void resetPSDCBDInstName() {
        this._reset(DTOFIELD_PSDCBDINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcbdinstname(String pSDCBDInstName) {
        this.setPSDCBDInstName(pSDCBDInstName);
        return this;
    }

    @JsonProperty(value="psdccodesnippetid")
    public void setPSDCCodeSnippetId(String pSDCCodeSnippetId) {
        this._set(DTOFIELD_PSDCCODESNIPPETID, pSDCCodeSnippetId);
    }

    @JsonIgnore
    public String getPSDCCodeSnippetId() {
        Object objValue = this._get(DTOFIELD_PSDCCODESNIPPETID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCCodeSnippetIdDirty() {
        return this._contains(DTOFIELD_PSDCCODESNIPPETID);
    }

    @JsonIgnore
    public void resetPSDCCodeSnippetId() {
        this._reset(DTOFIELD_PSDCCODESNIPPETID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdccodesnippetid(PSDCCodeSnippetDTO pSDCCodeSnippet) {
        if (pSDCCodeSnippet == null) {
            this.setPSDCCodeSnippetId(null);
            this.setPSDCCodeSnippetName(null);
        } else {
            this.setPSDCCodeSnippetId(pSDCCodeSnippet.getPSDCCodeSnippetId());
            this.setPSDCCodeSnippetName(pSDCCodeSnippet.getPSDCCodeSnippetName());
        }
        return this;
    }

    @JsonProperty(value="psdccodesnippetname")
    public void setPSDCCodeSnippetName(String pSDCCodeSnippetName) {
        this._set(DTOFIELD_PSDCCODESNIPPETNAME, pSDCCodeSnippetName);
    }

    @JsonIgnore
    public String getPSDCCodeSnippetName() {
        Object objValue = this._get(DTOFIELD_PSDCCODESNIPPETNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCCodeSnippetNameDirty() {
        return this._contains(DTOFIELD_PSDCCODESNIPPETNAME);
    }

    @JsonIgnore
    public void resetPSDCCodeSnippetName() {
        this._reset(DTOFIELD_PSDCCODESNIPPETNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    @JsonProperty(value="psdcfileid")
    public void setPSDCFileId(String pSDCFileId) {
        this._set(DTOFIELD_PSDCFILEID, pSDCFileId);
    }

    @JsonIgnore
    public String getPSDCFileId() {
        Object objValue = this._get(DTOFIELD_PSDCFILEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileIdDirty() {
        return this._contains(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public void resetPSDCFileId() {
        this._reset(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcfileid(PSDCFileDTO pSDCFile) {
        if (pSDCFile == null) {
            this.setPSDCFileId(null);
            this.setPSDCFileName(null);
        } else {
            this.setPSDCFileId(pSDCFile.getPSDCFileId());
            this.setPSDCFileName(pSDCFile.getPSDCFileName());
        }
        return this;
    }

    @JsonProperty(value="psdcfilename")
    public void setPSDCFileName(String pSDCFileName) {
        this._set(DTOFIELD_PSDCFILENAME, pSDCFileName);
    }

    @JsonIgnore
    public String getPSDCFileName() {
        Object objValue = this._get(DTOFIELD_PSDCFILENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileNameDirty() {
        return this._contains(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public void resetPSDCFileName() {
        this._reset(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
        return this;
    }

    @JsonProperty(value="psdcmsplatformfuncid")
    public void setPSDCMSPlatformFuncId(String pSDCMSPlatformFuncId) {
        this._set(DTOFIELD_PSDCMSPLATFORMFUNCID, pSDCMSPlatformFuncId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformFuncId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMFUNCID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformFuncIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformFuncId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformfuncid(String pSDCMSPlatformFuncId) {
        this.setPSDCMSPlatformFuncId(pSDCMSPlatformFuncId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformfuncid(PSDCMSPlatformFuncDTO pSDCMSPlatformFunc) {
        if (pSDCMSPlatformFunc == null) {
            this.setPSDCMSPlatformFuncId(null);
            this.setPSDCMSPlatformFuncName(null);
        } else {
            this.setPSDCMSPlatformFuncId(pSDCMSPlatformFunc.getPSDCMSPlatformFuncId());
            this.setPSDCMSPlatformFuncName(pSDCMSPlatformFunc.getPSDCMSPlatformFuncName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformfuncname")
    public void setPSDCMSPlatformFuncName(String pSDCMSPlatformFuncName) {
        this._set(DTOFIELD_PSDCMSPLATFORMFUNCNAME, pSDCMSPlatformFuncName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformFuncName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformFuncNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformFuncName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformfuncname(String pSDCMSPlatformFuncName) {
        this.setPSDCMSPlatformFuncName(pSDCMSPlatformFuncName);
        return this;
    }

    @JsonProperty(value="psdcmsplatformid")
    public void setPSDCMSPlatformId(String pSDCMSPlatformId) {
        this._set(DTOFIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformid(PSDCMSPlatformDTO pSDCMSPlatform) {
        if (pSDCMSPlatform == null) {
            this.setPSDCMSPlatformId(null);
            this.setPSDCMSPlatformName(null);
        } else {
            this.setPSDCMSPlatformId(pSDCMSPlatform.getPSDCMSPlatformId());
            this.setPSDCMSPlatformName(pSDCMSPlatform.getPSDCMSPlatformName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformname")
    public void setPSDCMSPlatformName(String pSDCMSPlatformName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformname(String pSDCMSPlatformName) {
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodeid")
    public void setPSDCMSPlatformNodeId(String pSDCMSPlatformNodeId) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODEID, pSDCMSPlatformNodeId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId) {
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformnodeid(PSDCMSPlatformNodeDTO pSDCMSPlatformNode) {
        if (pSDCMSPlatformNode == null) {
            this.setPSDCMSPlatformNodeId(null);
            this.setPSDCMSPlatformNodeName(null);
        } else {
            this.setPSDCMSPlatformNodeId(pSDCMSPlatformNode.getPSDCMSPlatformNodeId());
            this.setPSDCMSPlatformNodeName(pSDCMSPlatformNode.getPSDCMSPlatformNodeName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodename")
    public void setPSDCMSPlatformNodeName(String pSDCMSPlatformNodeName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODENAME, pSDCMSPlatformNodeName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName) {
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
        return this;
    }

    @JsonProperty(value="psdcregistryitemid")
    public void setPSDCRegistryItemId(String pSDCRegistryItemId) {
        this._set(DTOFIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }

    @JsonIgnore
    public String getPSDCRegistryItemId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemId() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryitemid(String pSDCRegistryItemId) {
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryitemid(PSDCRegistryItemDTO pSDCRegistryItem) {
        if (pSDCRegistryItem == null) {
            this.setPSDCRegistryItemId(null);
            this.setPSDCRegistryItemName(null);
        } else {
            this.setPSDCRegistryItemId(pSDCRegistryItem.getPSDCRegistryItemId());
            this.setPSDCRegistryItemName(pSDCRegistryItem.getPSDCRegistryItemName());
        }
        return this;
    }

    @JsonProperty(value="psdcregistryitemname")
    public void setPSDCRegistryItemName(String pSDCRegistryItemName) {
        this._set(DTOFIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }

    @JsonIgnore
    public String getPSDCRegistryItemName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemName() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryitemname(String pSDCRegistryItemName) {
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    @JsonProperty(value="psdcregistryrepoid")
    public void setPSDCRegistryRepoId(String pSDCRegistryRepoId) {
        this._set(DTOFIELD_PSDCREGISTRYREPOID, pSDCRegistryRepoId);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoId() {
        this._reset(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryrepoid(String pSDCRegistryRepoId) {
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryrepoid(PSDCRegistryRepoDTO pSDCRegistryRepo) {
        if (pSDCRegistryRepo == null) {
            this.setPSDCRegistryRepoId(null);
            this.setPSDCRegistryRepoName(null);
        } else {
            this.setPSDCRegistryRepoId(pSDCRegistryRepo.getPSDCRegistryRepoId());
            this.setPSDCRegistryRepoName(pSDCRegistryRepo.getPSDCRegistryRepoName());
        }
        return this;
    }

    @JsonProperty(value="psdcregistryreponame")
    public void setPSDCRegistryRepoName(String pSDCRegistryRepoName) {
        this._set(DTOFIELD_PSDCREGISTRYREPONAME, pSDCRegistryRepoName);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoName() {
        this._reset(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdcregistryreponame(String pSDCRegistryRepoName) {
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstid")
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstId() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcenterdbinstid(String pSDevCenterDBInstId) {
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcenterdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPSDevCenterDBInstId(null);
            this.setPSDevCenterDBInstName(null);
        } else {
            this.setPSDevCenterDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPSDevCenterDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstname")
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstName() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcenterdbinstname(String pSDevCenterDBInstName) {
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
        return this;
    }

    @JsonProperty(value="psdevcentersvnid")
    public void setPSDevCenterSVNId(String pSDevCenterSVNId) {
        this._set(DTOFIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }

    @JsonIgnore
    public String getPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNId() {
        this._reset(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentersvnname")
    public void setPSDevCenterSVNName(String pSDevCenterSVNName) {
        this._set(DTOFIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }

    @JsonIgnore
    public String getPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNName() {
        this._reset(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevcentersvnname(String pSDevCenterSVNName) {
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiid")
    public void setPSDevSlnMSDepAPIId(String pSDevSlnMSDepAPIId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPIID, pSDevSlnMSDepAPIId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPIIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepapiid(String pSDevSlnMSDepAPIId) {
        this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPIId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepapiid(PSDevSlnMSDepAPIDTO pSDevSlnMSDepAPI) {
        if (pSDevSlnMSDepAPI == null) {
            this.setPSDevSlnMSDepAPIId(null);
            this.setPSDevSlnMSDepAPIName(null);
        } else {
            this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPI.getPSDevSlnMSDepAPIId());
            this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPI.getPSDevSlnMSDepAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiname")
    public void setPSDevSlnMSDepAPIName(String pSDevSlnMSDepAPIName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPINAME, pSDevSlnMSDepAPIName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPINameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepapiname(String pSDevSlnMSDepAPIName) {
        this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPIName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepappid")
    public void setPSDevSlnMSDepAppId(String pSDevSlnMSDepAppId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPPID, pSDevSlnMSDepAppId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAppId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPPID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAppIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPPID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAppId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPPID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepappid(String pSDevSlnMSDepAppId) {
        this.setPSDevSlnMSDepAppId(pSDevSlnMSDepAppId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepappid(PSDevSlnMSDepAppDTO pSDevSlnMSDepApp) {
        if (pSDevSlnMSDepApp == null) {
            this.setPSDevSlnMSDepAppId(null);
            this.setPSDevSlnMSDepAppName(null);
        } else {
            this.setPSDevSlnMSDepAppId(pSDevSlnMSDepApp.getPSDevSlnMSDepAppId());
            this.setPSDevSlnMSDepAppName(pSDevSlnMSDepApp.getPSDevSlnMSDepAppName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepappname")
    public void setPSDevSlnMSDepAppName(String pSDevSlnMSDepAppName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPPNAME, pSDevSlnMSDepAppName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAppName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAppNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAppName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepappname(String pSDevSlnMSDepAppName) {
        this.setPSDevSlnMSDepAppName(pSDevSlnMSDepAppName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncid")
    public void setPSDevSlnMSDepFuncId(String pSDevSlnMSDepFuncId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCID, pSDevSlnMSDepFuncId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepfuncid(String pSDevSlnMSDepFuncId) {
        this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFuncId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepfuncid(PSDevSlnMSDepFuncDTO pSDevSlnMSDepFunc) {
        if (pSDevSlnMSDepFunc == null) {
            this.setPSDevSlnMSDepFuncId(null);
            this.setPSDevSlnMSDepFuncName(null);
        } else {
            this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFunc.getPSDevSlnMSDepFuncId());
            this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFunc.getPSDevSlnMSDepFuncName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncname")
    public void setPSDevSlnMSDepFuncName(String pSDevSlnMSDepFuncName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCNAME, pSDevSlnMSDepFuncName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdepfuncname(String pSDevSlnMSDepFuncName) {
        this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFuncName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployid")
    public void setPSDevSlnMSDeployId(String pSDevSlnMSDeployId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYID, pSDevSlnMSDeployId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdeployid(String pSDevSlnMSDeployId) {
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdeployid(PSDevSlnMSDeployDTO pSDevSlnMSDeploy) {
        if (pSDevSlnMSDeploy == null) {
            this.setPSDevSlnMSDeployId(null);
            this.setPSDevSlnMSDeployName(null);
        } else {
            this.setPSDevSlnMSDeployId(pSDevSlnMSDeploy.getPSDevSlnMSDeployId());
            this.setPSDevSlnMSDeployName(pSDevSlnMSDeploy.getPSDevSlnMSDeployName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployname")
    public void setPSDevSlnMSDeployName(String pSDevSlnMSDeployName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYNAME, pSDevSlnMSDeployName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnmsdeployname(String pSDevSlnMSDeployName) {
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelineid")
    public void setPSDevSlnPipelineId(String pSDevSlnPipelineId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINEID, pSDevSlnPipelineId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
        if (pSDevSlnPipeline == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnPipelineId(null);
            this.setPSDevSlnPipelineName(null);
        } else {
            this.setPSDevSlnId(pSDevSlnPipeline.getPSDevSlnId());
            this.setPSDevSlnPipelineId(pSDevSlnPipeline.getPSDevSlnPipelineId());
            this.setPSDevSlnPipelineName(pSDevSlnPipeline.getPSDevSlnPipelineName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinename")
    public void setPSDevSlnPipelineName(String pSDevSlnPipelineName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINENAME, pSDevSlnPipelineName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
        this.setPSDevSlnPipelineName(pSDevSlnPipelineName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestageid")
    public void setPSDevSlnPipelineStageId(String pSDevSlnPipelineStageId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTAGEID, pSDevSlnPipelineStageId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStageId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStageIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStageId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTAGEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinestageid(String pSDevSlnPipelineStageId) {
        this.setPSDevSlnPipelineStageId(pSDevSlnPipelineStageId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinestageid(PSDevSlnPipelineStageDTO pSDevSlnPipelineStage) {
        if (pSDevSlnPipelineStage == null) {
            this.setPSDevSlnPipelineStageId(null);
            this.setPSDevSlnPipelineStageName(null);
        } else {
            this.setPSDevSlnPipelineStageId(pSDevSlnPipelineStage.getPSDevSlnPipelineStageId());
            this.setPSDevSlnPipelineStageName(pSDevSlnPipelineStage.getPSDevSlnPipelineStageName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestagename")
    public void setPSDevSlnPipelineStageName(String pSDevSlnPipelineStageName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTAGENAME, pSDevSlnPipelineStageName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStageName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStageNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStageName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTAGENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinestagename(String pSDevSlnPipelineStageName) {
        this.setPSDevSlnPipelineStageName(pSDevSlnPipelineStageName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestepid")
    public void setPSDevSlnPipelineStepId(String pSDevSlnPipelineStepId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTEPID, pSDevSlnPipelineStepId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStepId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTEPID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStepIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTEPID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStepId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTEPID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinestepid(String pSDevSlnPipelineStepId) {
        this.setPSDevSlnPipelineStepId(pSDevSlnPipelineStepId);
        return this;
    }

    @JsonProperty(value="psdevslnpipelinestepname")
    public void setPSDevSlnPipelineStepName(String pSDevSlnPipelineStepName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINESTEPNAME, pSDevSlnPipelineStepName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineStepName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineStepNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineStepName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINESTEPNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnpipelinestepname(String pSDevSlnPipelineStepName) {
        this.setPSDevSlnPipelineStepName(pSDevSlnPipelineStepName);
        return this;
    }

    @JsonProperty(value="psdevslnsysapiid")
    public void setPSDevSlnSysAPIId(String pSDevSlnSysAPIId) {
        this._set(DTOFIELD_PSDEVSLNSYSAPIID, pSDevSlnSysAPIId);
    }

    @JsonIgnore
    public String getPSDevSlnSysAPIId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAPIIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAPIId() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysapiid(String pSDevSlnSysAPIId) {
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysapiid(PSDevSlnSysAPIDTO pSDevSlnSysAPI) {
        if (pSDevSlnSysAPI == null) {
            this.setPSDevSlnSysAPIId(null);
            this.setPSDevSlnSysAPIName(null);
        } else {
            this.setPSDevSlnSysAPIId(pSDevSlnSysAPI.getPSDevSlnSysAPIId());
            this.setPSDevSlnSysAPIName(pSDevSlnSysAPI.getPSDevSlnSysAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysapiname")
    public void setPSDevSlnSysAPIName(String pSDevSlnSysAPIName) {
        this._set(DTOFIELD_PSDEVSLNSYSAPINAME, pSDevSlnSysAPIName);
    }

    @JsonIgnore
    public String getPSDevSlnSysAPIName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAPINameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAPIName() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysapiname(String pSDevSlnSysAPIName) {
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    @JsonProperty(value="psdevslnsysappid")
    public void setPSDevSlnSysAppId(String pSDevSlnSysAppId) {
        this._set(DTOFIELD_PSDEVSLNSYSAPPID, pSDevSlnSysAppId);
    }

    @JsonIgnore
    public String getPSDevSlnSysAppId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPPID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAppIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPPID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAppId() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPPID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysappid(String pSDevSlnSysAppId) {
        this.setPSDevSlnSysAppId(pSDevSlnSysAppId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysappid(PSDevSlnSysAppDTO pSDevSlnSysApp) {
        if (pSDevSlnSysApp == null) {
            this.setPSDevSlnSysAppId(null);
            this.setPSDevSlnSysAppName(null);
        } else {
            this.setPSDevSlnSysAppId(pSDevSlnSysApp.getPSDevSlnSysAppId());
            this.setPSDevSlnSysAppName(pSDevSlnSysApp.getPSDevSlnSysAppName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysappname")
    public void setPSDevSlnSysAppName(String pSDevSlnSysAppName) {
        this._set(DTOFIELD_PSDEVSLNSYSAPPNAME, pSDevSlnSysAppName);
    }

    @JsonIgnore
    public String getPSDevSlnSysAppName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPPNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAppNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAppName() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPPNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysappname(String pSDevSlnSysAppName) {
        this.setPSDevSlnSysAppName(pSDevSlnSysAppName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvid")
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvId() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsyssrvid(String pSDevSlnSysSrvId) {
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsyssrvid(PSDevSlnSysSrvDTO pSDevSlnSysSrv) {
        if (pSDevSlnSysSrv == null) {
            this.setPSDevSlnSysSrvId(null);
            this.setPSDevSlnSysSrvName(null);
        } else {
            this.setPSDevSlnSysSrvId(pSDevSlnSysSrv.getPSDevSlnSysSrvId());
            this.setPSDevSlnSysSrvName(pSDevSlnSysSrv.getPSDevSlnSysSrvName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvname")
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvName() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsyssrvname(String pSDevSlnSysSrvName) {
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    @JsonProperty(value="psdevslnsysverid")
    public void setPSDevSlnSysVerId(String pSDevSlnSysVerId) {
        this._set(DTOFIELD_PSDEVSLNSYSVERID, pSDevSlnSysVerId);
    }

    @JsonIgnore
    public String getPSDevSlnSysVerId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysVerIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSVERID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysVerId() {
        this._reset(DTOFIELD_PSDEVSLNSYSVERID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysverid(String pSDevSlnSysVerId) {
        this.setPSDevSlnSysVerId(pSDevSlnSysVerId);
        return this;
    }

    @JsonProperty(value="psdevslnsysvername")
    public void setPSDevSlnSysVerName(String pSDevSlnSysVerName) {
        this._set(DTOFIELD_PSDEVSLNSYSVERNAME, pSDevSlnSysVerName);
    }

    @JsonIgnore
    public String getPSDevSlnSysVerName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysVerNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSVERNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysVerName() {
        this._reset(DTOFIELD_PSDEVSLNSYSVERNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslnsysvername(String pSDevSlnSysVerName) {
        this.setPSDevSlnSysVerName(pSDevSlnSysVerName);
        return this;
    }

    @JsonProperty(value="psdevslntemplid")
    public void setPSDevSlnTemplId(String pSDevSlnTemplId) {
        this._set(DTOFIELD_PSDEVSLNTEMPLID, pSDevSlnTemplId);
    }

    @JsonIgnore
    public String getPSDevSlnTemplId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplId() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslntemplid(String pSDevSlnTemplId) {
        this.setPSDevSlnTemplId(pSDevSlnTemplId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslntemplid(PSDevSlnTemplDTO pSDevSlnTempl) {
        if (pSDevSlnTempl == null) {
            this.setPSDevSlnTemplId(null);
            this.setPSDevSlnTemplName(null);
        } else {
            this.setPSDevSlnTemplId(pSDevSlnTempl.getPSDevSlnTemplId());
            this.setPSDevSlnTemplName(pSDevSlnTempl.getPSDevSlnTemplName());
        }
        return this;
    }

    @JsonProperty(value="psdevslntemplname")
    public void setPSDevSlnTemplName(String pSDevSlnTemplName) {
        this._set(DTOFIELD_PSDEVSLNTEMPLNAME, pSDevSlnTemplName);
    }

    @JsonIgnore
    public String getPSDevSlnTemplName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplName() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO psdevslntemplname(String pSDevSlnTemplName) {
        this.setPSDevSlnTemplName(pSDevSlnTemplName);
        return this;
    }

    @JsonProperty(value="refpsdevslnpipelineid")
    public void setRefPSDevSlnPipelineId(String refPSDevSlnPipelineId) {
        this._set(DTOFIELD_REFPSDEVSLNPIPELINEID, refPSDevSlnPipelineId);
    }

    @JsonIgnore
    public String getRefPSDevSlnPipelineId() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNPIPELINEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnPipelineIdDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public void resetRefPSDevSlnPipelineId() {
        this._reset(DTOFIELD_REFPSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO refpsdevslnpipelineid(String refPSDevSlnPipelineId) {
        this.setRefPSDevSlnPipelineId(refPSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO refpsdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
        if (pSDevSlnPipeline == null) {
            this.setRefPSDevSlnPipelineId(null);
            this.setRefPSDevSlnPipelineName(null);
        } else {
            this.setRefPSDevSlnPipelineId(pSDevSlnPipeline.getPSDevSlnPipelineId());
            this.setRefPSDevSlnPipelineName(pSDevSlnPipeline.getPSDevSlnPipelineName());
        }
        return this;
    }

    @JsonProperty(value="refpsdevslnpipelinename")
    public void setRefPSDevSlnPipelineName(String refPSDevSlnPipelineName) {
        this._set(DTOFIELD_REFPSDEVSLNPIPELINENAME, refPSDevSlnPipelineName);
    }

    @JsonIgnore
    public String getRefPSDevSlnPipelineName() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNPIPELINENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnPipelineNameDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public void resetRefPSDevSlnPipelineName() {
        this._reset(DTOFIELD_REFPSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO refpsdevslnpipelinename(String refPSDevSlnPipelineName) {
        this.setRefPSDevSlnPipelineName(refPSDevSlnPipelineName);
        return this;
    }

    @JsonProperty(value="runcmd")
    public void setRunCmd(String runCmd) {
        this._set(DTOFIELD_RUNCMD, runCmd);
    }

    @JsonIgnore
    public String getRunCmd() {
        Object objValue = this._get(DTOFIELD_RUNCMD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunCmdDirty() {
        return this._contains(DTOFIELD_RUNCMD);
    }

    @JsonIgnore
    public void resetRunCmd() {
        this._reset(DTOFIELD_RUNCMD);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO runcmd(String runCmd) {
        this.setRunCmd(runCmd);
        return this;
    }

    @JsonProperty(value="steptag")
    public void setStepTag(String stepTag) {
        this._set(DTOFIELD_STEPTAG, stepTag);
    }

    @JsonIgnore
    public String getStepTag() {
        Object objValue = this._get(DTOFIELD_STEPTAG);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO steptag(String stepTag) {
        this.setStepTag(stepTag);
        return this;
    }

    @JsonProperty(value="steptag2")
    public void setStepTag2(String stepTag2) {
        this._set(DTOFIELD_STEPTAG2, stepTag2);
    }

    @JsonIgnore
    public String getStepTag2() {
        Object objValue = this._get(DTOFIELD_STEPTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepTag2Dirty() {
        return this._contains(DTOFIELD_STEPTAG2);
    }

    @JsonIgnore
    public void resetStepTag2() {
        this._reset(DTOFIELD_STEPTAG2);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO steptag2(String stepTag2) {
        this.setStepTag2(stepTag2);
        return this;
    }

    @JsonProperty(value="steptag3")
    public void setStepTag3(String stepTag3) {
        this._set(DTOFIELD_STEPTAG3, stepTag3);
    }

    @JsonIgnore
    public String getStepTag3() {
        Object objValue = this._get(DTOFIELD_STEPTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepTag3Dirty() {
        return this._contains(DTOFIELD_STEPTAG3);
    }

    @JsonIgnore
    public void resetStepTag3() {
        this._reset(DTOFIELD_STEPTAG3);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO steptag3(String stepTag3) {
        this.setStepTag3(stepTag3);
        return this;
    }

    @JsonProperty(value="steptag4")
    public void setStepTag4(String stepTag4) {
        this._set(DTOFIELD_STEPTAG4, stepTag4);
    }

    @JsonIgnore
    public String getStepTag4() {
        Object objValue = this._get(DTOFIELD_STEPTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepTag4Dirty() {
        return this._contains(DTOFIELD_STEPTAG4);
    }

    @JsonIgnore
    public void resetStepTag4() {
        this._reset(DTOFIELD_STEPTAG4);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO steptag4(String stepTag4) {
        this.setStepTag4(stepTag4);
        return this;
    }

    @JsonProperty(value="templatemode")
    public void setTemplateMode(Integer templateMode) {
        this._set(DTOFIELD_TEMPLATEMODE, templateMode);
    }

    @JsonIgnore
    public Integer getTemplateMode() {
        Object objValue = this._get(DTOFIELD_TEMPLATEMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplateModeDirty() {
        return this._contains(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public void resetTemplateMode() {
        this._reset(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonProperty(value="templpsdevcentersvnid")
    public void setTemplPSDevCenterSVNId(String templPSDevCenterSVNId) {
        this._set(DTOFIELD_TEMPLPSDEVCENTERSVNID, templPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getTemplPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_TEMPLPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_TEMPLPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetTemplPSDevCenterSVNId() {
        this._reset(DTOFIELD_TEMPLPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO templpsdevcentersvnid(String templPSDevCenterSVNId) {
        this.setTemplPSDevCenterSVNId(templPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO templpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setTemplPSDevCenterSVNId(null);
            this.setTemplPSDevCenterSVNName(null);
        } else {
            this.setTemplPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setTemplPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="templpsdevcentersvnname")
    public void setTemplPSDevCenterSVNName(String templPSDevCenterSVNName) {
        this._set(DTOFIELD_TEMPLPSDEVCENTERSVNNAME, templPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getTemplPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_TEMPLPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_TEMPLPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetTemplPSDevCenterSVNName() {
        this._reset(DTOFIELD_TEMPLPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO templpsdevcentersvnname(String templPSDevCenterSVNName) {
        this.setTemplPSDevCenterSVNName(templPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="toolpsdcregistryitemid")
    public void setToolPSDCRegistryItemId(String toolPSDCRegistryItemId) {
        this._set(DTOFIELD_TOOLPSDCREGISTRYITEMID, toolPSDCRegistryItemId);
    }

    @JsonIgnore
    public String getToolPSDCRegistryItemId() {
        Object objValue = this._get(DTOFIELD_TOOLPSDCREGISTRYITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToolPSDCRegistryItemIdDirty() {
        return this._contains(DTOFIELD_TOOLPSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public void resetToolPSDCRegistryItemId() {
        this._reset(DTOFIELD_TOOLPSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO toolpsdcregistryitemid(String toolPSDCRegistryItemId) {
        this.setToolPSDCRegistryItemId(toolPSDCRegistryItemId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO toolpsdcregistryitemid(PSDCRegistryItemDTO pSDCRegistryItem) {
        if (pSDCRegistryItem == null) {
            this.setToolPSDCRegistryItemId(null);
            this.setToolPSDCRegistryItemName(null);
        } else {
            this.setToolPSDCRegistryItemId(pSDCRegistryItem.getPSDCRegistryItemId());
            this.setToolPSDCRegistryItemName(pSDCRegistryItem.getPSDCRegistryItemName());
        }
        return this;
    }

    @JsonProperty(value="toolpsdcregistryitemname")
    public void setToolPSDCRegistryItemName(String toolPSDCRegistryItemName) {
        this._set(DTOFIELD_TOOLPSDCREGISTRYITEMNAME, toolPSDCRegistryItemName);
    }

    @JsonIgnore
    public String getToolPSDCRegistryItemName() {
        Object objValue = this._get(DTOFIELD_TOOLPSDCREGISTRYITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToolPSDCRegistryItemNameDirty() {
        return this._contains(DTOFIELD_TOOLPSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public void resetToolPSDCRegistryItemName() {
        this._reset(DTOFIELD_TOOLPSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO toolpsdcregistryitemname(String toolPSDCRegistryItemName) {
        this.setToolPSDCRegistryItemName(toolPSDCRegistryItemName);
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO usertag2(String userTag2) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO usertag3(String userTag3) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO usertag4(String userTag4) {
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
        if (objValue == null) return null;
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
    public PSDevSlnPipelineStepDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="workfolder")
    public void setWorkFolder(String workFolder) {
        this._set(DTOFIELD_WORKFOLDER, workFolder);
    }

    @JsonIgnore
    public String getWorkFolder() {
        Object objValue = this._get(DTOFIELD_WORKFOLDER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkFolderDirty() {
        return this._contains(DTOFIELD_WORKFOLDER);
    }

    @JsonIgnore
    public void resetWorkFolder() {
        this._reset(DTOFIELD_WORKFOLDER);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO workfolder(String workFolder) {
        this.setWorkFolder(workFolder);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnPipelineStepName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnPipelineStepName(strName);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO name(String strName) {
        this.setPSDevSlnPipelineStepName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnPipelineStepId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnPipelineStepId(strValue);
    }

    @JsonIgnore
    public PSDevSlnPipelineStepDTO id(String strValue) {
        this.setPSDevSlnPipelineStepId(strValue);
        return this;
    }

}
