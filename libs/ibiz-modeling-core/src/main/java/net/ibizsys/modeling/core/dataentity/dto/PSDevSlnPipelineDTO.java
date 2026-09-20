package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnPipelineDTO extends PSModelDTOBase {
    public static final String FIELD_AGENTTAGS = "AGENTTAGS";
    protected static final String DTOFIELD_AGENTTAGS = "agenttags";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_MAJORFLAG = "MAJORFLAG";
    protected static final String DTOFIELD_MAJORFLAG = "majorflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODEL = "MODEL";
    protected static final String DTOFIELD_MODEL = "model";
    public static final String FIELD_PIPELINEMODEL = "PIPELINEMODEL";
    protected static final String DTOFIELD_PIPELINEMODEL = "pipelinemodel";
    public static final String FIELD_PIPELINEPARAMS = "PIPELINEPARAMS";
    protected static final String DTOFIELD_PIPELINEPARAMS = "pipelineparams";
    public static final String FIELD_PIPELINETAG = "PIPELINETAG";
    protected static final String DTOFIELD_PIPELINETAG = "pipelinetag";
    public static final String FIELD_PIPELINETAG2 = "PIPELINETAG2";
    protected static final String DTOFIELD_PIPELINETAG2 = "pipelinetag2";
    public static final String FIELD_PIPELINETAG3 = "PIPELINETAG3";
    protected static final String DTOFIELD_PIPELINETAG3 = "pipelinetag3";
    public static final String FIELD_PIPELINETAG4 = "PIPELINETAG4";
    protected static final String DTOFIELD_PIPELINETAG4 = "pipelinetag4";
    public static final String FIELD_PIPELINETYPE = "PIPELINETYPE";
    protected static final String DTOFIELD_PIPELINETYPE = "pipelinetype";
    public static final String FIELD_PSDCCODESNIPPETID = "PSDCCODESNIPPETID";
    protected static final String DTOFIELD_PSDCCODESNIPPETID = "psdccodesnippetid";
    public static final String FIELD_PSDCCODESNIPPETNAME = "PSDCCODESNIPPETNAME";
    protected static final String DTOFIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";
    public static final String FIELD_PSDCDEPLOYCENTERID = "PSDCDEPLOYCENTERID";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERID = "psdcdeploycenterid";
    public static final String FIELD_PSDCDEPLOYCENTERNAME = "PSDCDEPLOYCENTERNAME";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERNAME = "psdcdeploycentername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TRIGGERPARAMS = "TRIGGERPARAMS";
    protected static final String DTOFIELD_TRIGGERPARAMS = "triggerparams";
    public static final String FIELD_TRIGGERTYPE = "TRIGGERTYPE";
    protected static final String DTOFIELD_TRIGGERTYPE = "triggertype";
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

    @JsonProperty(value="agenttags")
    public void setAgentTags(String agentTags) {
        this._set(DTOFIELD_AGENTTAGS, agentTags);
    }

    @JsonIgnore
    public String getAgentTags() {
        Object objValue = this._get(DTOFIELD_AGENTTAGS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentTagsDirty() {
        return this._contains(DTOFIELD_AGENTTAGS);
    }

    @JsonIgnore
    public void resetAgentTags() {
        this._reset(DTOFIELD_AGENTTAGS);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO agenttags(String agentTags) {
        this.setAgentTags(agentTags);
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
    public PSDevSlnPipelineDTO codename(String codeName) {
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
    public PSDevSlnPipelineDTO createdate(Timestamp createDate) {
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
    public PSDevSlnPipelineDTO createman(String createMan) {
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
    public PSDevSlnPipelineDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="majorflag")
    public void setMajorFlag(Integer majorFlag) {
        this._set(DTOFIELD_MAJORFLAG, majorFlag);
    }

    @JsonIgnore
    public Integer getMajorFlag() {
        Object objValue = this._get(DTOFIELD_MAJORFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMajorFlagDirty() {
        return this._contains(DTOFIELD_MAJORFLAG);
    }

    @JsonIgnore
    public void resetMajorFlag() {
        this._reset(DTOFIELD_MAJORFLAG);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO majorflag(Integer majorFlag) {
        this.setMajorFlag(majorFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO majorflag(Boolean majorFlag) {
        this.setMajorFlag(majorFlag == null ? null : (majorFlag ? 1 : 0));
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
    public PSDevSlnPipelineDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="model")
    public void setModel(String model) {
        this._set(DTOFIELD_MODEL, model);
    }

    @JsonIgnore
    public String getModel() {
        Object objValue = this._get(DTOFIELD_MODEL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelDirty() {
        return this._contains(DTOFIELD_MODEL);
    }

    @JsonIgnore
    public void resetModel() {
        this._reset(DTOFIELD_MODEL);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO model(String model) {
        this.setModel(model);
        return this;
    }

    @JsonProperty(value="pipelinemodel")
    public void setPipelineModel(String pipelineModel) {
        this._set(DTOFIELD_PIPELINEMODEL, pipelineModel);
    }

    @JsonIgnore
    public String getPipelineModel() {
        Object objValue = this._get(DTOFIELD_PIPELINEMODEL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineModelDirty() {
        return this._contains(DTOFIELD_PIPELINEMODEL);
    }

    @JsonIgnore
    public void resetPipelineModel() {
        this._reset(DTOFIELD_PIPELINEMODEL);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinemodel(String pipelineModel) {
        this.setPipelineModel(pipelineModel);
        return this;
    }

    @JsonProperty(value="pipelineparams")
    public void setPipelineParams(String pipelineParams) {
        this._set(DTOFIELD_PIPELINEPARAMS, pipelineParams);
    }

    @JsonIgnore
    public String getPipelineParams() {
        Object objValue = this._get(DTOFIELD_PIPELINEPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineParamsDirty() {
        return this._contains(DTOFIELD_PIPELINEPARAMS);
    }

    @JsonIgnore
    public void resetPipelineParams() {
        this._reset(DTOFIELD_PIPELINEPARAMS);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelineparams(String pipelineParams) {
        this.setPipelineParams(pipelineParams);
        return this;
    }

    @JsonProperty(value="pipelinetag")
    public void setPipelineTag(String pipelineTag) {
        this._set(DTOFIELD_PIPELINETAG, pipelineTag);
    }

    @JsonIgnore
    public String getPipelineTag() {
        Object objValue = this._get(DTOFIELD_PIPELINETAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineTagDirty() {
        return this._contains(DTOFIELD_PIPELINETAG);
    }

    @JsonIgnore
    public void resetPipelineTag() {
        this._reset(DTOFIELD_PIPELINETAG);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetag(String pipelineTag) {
        this.setPipelineTag(pipelineTag);
        return this;
    }

    @JsonProperty(value="pipelinetag2")
    public void setPipelineTag2(String pipelineTag2) {
        this._set(DTOFIELD_PIPELINETAG2, pipelineTag2);
    }

    @JsonIgnore
    public String getPipelineTag2() {
        Object objValue = this._get(DTOFIELD_PIPELINETAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineTag2Dirty() {
        return this._contains(DTOFIELD_PIPELINETAG2);
    }

    @JsonIgnore
    public void resetPipelineTag2() {
        this._reset(DTOFIELD_PIPELINETAG2);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetag2(String pipelineTag2) {
        this.setPipelineTag2(pipelineTag2);
        return this;
    }

    @JsonProperty(value="pipelinetag3")
    public void setPipelineTag3(String pipelineTag3) {
        this._set(DTOFIELD_PIPELINETAG3, pipelineTag3);
    }

    @JsonIgnore
    public String getPipelineTag3() {
        Object objValue = this._get(DTOFIELD_PIPELINETAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineTag3Dirty() {
        return this._contains(DTOFIELD_PIPELINETAG3);
    }

    @JsonIgnore
    public void resetPipelineTag3() {
        this._reset(DTOFIELD_PIPELINETAG3);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetag3(String pipelineTag3) {
        this.setPipelineTag3(pipelineTag3);
        return this;
    }

    @JsonProperty(value="pipelinetag4")
    public void setPipelineTag4(String pipelineTag4) {
        this._set(DTOFIELD_PIPELINETAG4, pipelineTag4);
    }

    @JsonIgnore
    public String getPipelineTag4() {
        Object objValue = this._get(DTOFIELD_PIPELINETAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineTag4Dirty() {
        return this._contains(DTOFIELD_PIPELINETAG4);
    }

    @JsonIgnore
    public void resetPipelineTag4() {
        this._reset(DTOFIELD_PIPELINETAG4);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetag4(String pipelineTag4) {
        this.setPipelineTag4(pipelineTag4);
        return this;
    }

    @JsonProperty(value="pipelinetype")
    public void setPipelineType(String pipelineType) {
        this._set(DTOFIELD_PIPELINETYPE, pipelineType);
    }

    @JsonIgnore
    public String getPipelineType() {
        Object objValue = this._get(DTOFIELD_PIPELINETYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPipelineTypeDirty() {
        return this._contains(DTOFIELD_PIPELINETYPE);
    }

    @JsonIgnore
    public void resetPipelineType() {
        this._reset(DTOFIELD_PIPELINETYPE);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetype(String pipelineType) {
        this.setPipelineType(pipelineType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO pipelinetype(PSModelEnums.PipelineType pipelineType) {
        this.setPipelineType(pipelineType == null ? null : pipelineType.value);
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
    public PSDevSlnPipelineDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdccodesnippetid(PSDCCodeSnippetDTO pSDCCodeSnippet) {
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
    public PSDevSlnPipelineDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    @JsonProperty(value="psdcdeploycenterid")
    public void setPSDCDeployCenterId(String pSDCDeployCenterId) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERID, pSDCDeployCenterId);
    }

    @JsonIgnore
    public String getPSDCDeployCenterId() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterIdDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterId() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdcdeploycenterid(String pSDCDeployCenterId) {
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdcdeploycenterid(PSDCDeployCenterDTO pSDCDeployCenter) {
        if (pSDCDeployCenter == null) {
            this.setPSDCDeployCenterId(null);
            this.setPSDCDeployCenterName(null);
        } else {
            this.setPSDCDeployCenterId(pSDCDeployCenter.getPSDCDeployCenterId());
            this.setPSDCDeployCenterName(pSDCDeployCenter.getPSDCDeployCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdcdeploycentername")
    public void setPSDCDeployCenterName(String pSDCDeployCenterName) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERNAME, pSDCDeployCenterName);
    }

    @JsonIgnore
    public String getPSDCDeployCenterName() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterNameDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterName() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdcdeploycentername(String pSDCDeployCenterName) {
        this.setPSDCDeployCenterName(pSDCDeployCenterName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
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
    public PSDevSlnPipelineDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
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
    public PSDevSlnPipelineDTO psdevcentersvnname(String pSDevCenterSVNName) {
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
    public PSDevSlnPipelineDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevCenterId(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevCenterId(pSDevSln.getPSDevCenterId());
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
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
    public PSDevSlnPipelineDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
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
    public PSDevSlnPipelineDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
        this.setPSDevSlnPipelineName(pSDevSlnPipelineName);
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
    public PSDevSlnPipelineDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDevSlnPipelineDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDevSlnPipelineDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonProperty(value="triggerparams")
    public void setTriggerParams(String triggerParams) {
        this._set(DTOFIELD_TRIGGERPARAMS, triggerParams);
    }

    @JsonIgnore
    public String getTriggerParams() {
        Object objValue = this._get(DTOFIELD_TRIGGERPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTriggerParamsDirty() {
        return this._contains(DTOFIELD_TRIGGERPARAMS);
    }

    @JsonIgnore
    public void resetTriggerParams() {
        this._reset(DTOFIELD_TRIGGERPARAMS);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO triggerparams(String triggerParams) {
        this.setTriggerParams(triggerParams);
        return this;
    }

    @JsonProperty(value="triggertype")
    public void setTriggerType(String triggerType) {
        this._set(DTOFIELD_TRIGGERTYPE, triggerType);
    }

    @JsonIgnore
    public String getTriggerType() {
        Object objValue = this._get(DTOFIELD_TRIGGERTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTriggerTypeDirty() {
        return this._contains(DTOFIELD_TRIGGERTYPE);
    }

    @JsonIgnore
    public void resetTriggerType() {
        this._reset(DTOFIELD_TRIGGERTYPE);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO triggertype(String triggerType) {
        this.setTriggerType(triggerType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO triggertype(PSModelEnums.PipelineTriggerType triggerType) {
        this.setTriggerType(triggerType == null ? null : triggerType.value);
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
    public PSDevSlnPipelineDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnPipelineDTO updateman(String updateMan) {
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
    public PSDevSlnPipelineDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDevSlnPipelineDTO usertag(String userTag) {
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
    public PSDevSlnPipelineDTO usertag2(String userTag2) {
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
    public PSDevSlnPipelineDTO usertag3(String userTag3) {
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
    public PSDevSlnPipelineDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnPipelineName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnPipelineName(strName);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO name(String strName) {
        this.setPSDevSlnPipelineName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnPipelineId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnPipelineId(strValue);
    }

    @JsonIgnore
    public PSDevSlnPipelineDTO id(String strValue) {
        this.setPSDevSlnPipelineId(strValue);
        return this;
    }

}
