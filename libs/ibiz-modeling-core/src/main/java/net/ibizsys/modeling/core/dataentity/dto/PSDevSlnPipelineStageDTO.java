package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnPipelineStageDTO extends PSModelDTOBase {
    public static final String FIELD_AGENTDOCKERFILE = "AGENTDOCKERFILE";
    protected static final String DTOFIELD_AGENTDOCKERFILE = "agentdockerfile";
    public static final String FIELD_AGENTIMAGE = "AGENTIMAGE";
    protected static final String DTOFIELD_AGENTIMAGE = "agentimage";
    public static final String FIELD_AGENTIMAGEARGS = "AGENTIMAGEARGS";
    protected static final String DTOFIELD_AGENTIMAGEARGS = "agentimageargs";
    public static final String FIELD_AGENTPSDCREGISTRYITEMID = "AGENTPSDCREGISTRYITEMID";
    protected static final String DTOFIELD_AGENTPSDCREGISTRYITEMID = "agentpsdcregistryitemid";
    public static final String FIELD_AGENTPSDCREGISTRYITEMNAME = "AGENTPSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_AGENTPSDCREGISTRYITEMNAME = "agentpsdcregistryitemname";
    public static final String FIELD_AGENTREUSEMODE = "AGENTREUSEMODE";
    protected static final String DTOFIELD_AGENTREUSEMODE = "agentreusemode";
    public static final String FIELD_AGENTTAGS = "AGENTTAGS";
    protected static final String DTOFIELD_AGENTTAGS = "agenttags";
    public static final String FIELD_AGENTTYPE = "AGENTTYPE";
    protected static final String DTOFIELD_AGENTTYPE = "agenttype";
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
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_POSTMODE = "POSTMODE";
    protected static final String DTOFIELD_POSTMODE = "postmode";
    public static final String FIELD_PSDCCODESNIPPETID = "PSDCCODESNIPPETID";
    protected static final String DTOFIELD_PSDCCODESNIPPETID = "psdccodesnippetid";
    public static final String FIELD_PSDCCODESNIPPETNAME = "PSDCCODESNIPPETNAME";
    protected static final String DTOFIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
    public static final String FIELD_PSDEVSLNPIPELINESTAGEID = "PSDEVSLNPIPELINESTAGEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGEID = "psdevslnpipelinestageid";
    public static final String FIELD_PSDEVSLNPIPELINESTAGENAME = "PSDEVSLNPIPELINESTAGENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINESTAGENAME = "psdevslnpipelinestagename";
    public static final String FIELD_STAGEPARAMS = "STAGEPARAMS";
    protected static final String DTOFIELD_STAGEPARAMS = "stageparams";
    public static final String FIELD_STAGETYPE = "STAGETYPE";
    protected static final String DTOFIELD_STAGETYPE = "stagetype";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
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

    @JsonProperty(value="agentdockerfile")
    public void setAgentDockerFile(String agentDockerFile) {
        this._set(DTOFIELD_AGENTDOCKERFILE, agentDockerFile);
    }

    @JsonIgnore
    public String getAgentDockerFile() {
        Object objValue = this._get(DTOFIELD_AGENTDOCKERFILE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentDockerFileDirty() {
        return this._contains(DTOFIELD_AGENTDOCKERFILE);
    }

    @JsonIgnore
    public void resetAgentDockerFile() {
        this._reset(DTOFIELD_AGENTDOCKERFILE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentdockerfile(String agentDockerFile) {
        this.setAgentDockerFile(agentDockerFile);
        return this;
    }

    @JsonProperty(value="agentimage")
    public void setAgentImage(String agentImage) {
        this._set(DTOFIELD_AGENTIMAGE, agentImage);
    }

    @JsonIgnore
    public String getAgentImage() {
        Object objValue = this._get(DTOFIELD_AGENTIMAGE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentImageDirty() {
        return this._contains(DTOFIELD_AGENTIMAGE);
    }

    @JsonIgnore
    public void resetAgentImage() {
        this._reset(DTOFIELD_AGENTIMAGE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentimage(String agentImage) {
        this.setAgentImage(agentImage);
        return this;
    }

    @JsonProperty(value="agentimageargs")
    public void setAgentImageArgs(String agentImageArgs) {
        this._set(DTOFIELD_AGENTIMAGEARGS, agentImageArgs);
    }

    @JsonIgnore
    public String getAgentImageArgs() {
        Object objValue = this._get(DTOFIELD_AGENTIMAGEARGS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentImageArgsDirty() {
        return this._contains(DTOFIELD_AGENTIMAGEARGS);
    }

    @JsonIgnore
    public void resetAgentImageArgs() {
        this._reset(DTOFIELD_AGENTIMAGEARGS);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentimageargs(String agentImageArgs) {
        this.setAgentImageArgs(agentImageArgs);
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
    public PSDevSlnPipelineStageDTO agentpsdcregistryitemid(String agentPSDCRegistryItemId) {
        this.setAgentPSDCRegistryItemId(agentPSDCRegistryItemId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentpsdcregistryitemid(PSDCRegistryItemDTO pSDCRegistryItem) {
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
    public PSDevSlnPipelineStageDTO agentpsdcregistryitemname(String agentPSDCRegistryItemName) {
        this.setAgentPSDCRegistryItemName(agentPSDCRegistryItemName);
        return this;
    }

    @JsonProperty(value="agentreusemode")
    public void setAgentReuseMode(Integer agentReuseMode) {
        this._set(DTOFIELD_AGENTREUSEMODE, agentReuseMode);
    }

    @JsonIgnore
    public Integer getAgentReuseMode() {
        Object objValue = this._get(DTOFIELD_AGENTREUSEMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAgentReuseModeDirty() {
        return this._contains(DTOFIELD_AGENTREUSEMODE);
    }

    @JsonIgnore
    public void resetAgentReuseMode() {
        this._reset(DTOFIELD_AGENTREUSEMODE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentreusemode(Integer agentReuseMode) {
        this.setAgentReuseMode(agentReuseMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agentreusemode(Boolean agentReuseMode) {
        this.setAgentReuseMode(agentReuseMode == null ? null : (agentReuseMode ? 1 : 0));
        return this;
    }

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
    public PSDevSlnPipelineStageDTO agenttags(String agentTags) {
        this.setAgentTags(agentTags);
        return this;
    }

    @JsonProperty(value="agenttype")
    public void setAgentType(String agentType) {
        this._set(DTOFIELD_AGENTTYPE, agentType);
    }

    @JsonIgnore
    public String getAgentType() {
        Object objValue = this._get(DTOFIELD_AGENTTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAgentTypeDirty() {
        return this._contains(DTOFIELD_AGENTTYPE);
    }

    @JsonIgnore
    public void resetAgentType() {
        this._reset(DTOFIELD_AGENTTYPE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agenttype(String agentType) {
        this.setAgentType(agentType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO agenttype(PSModelEnums.PipelineStageAgentType agentType) {
        this.setAgentType(agentType == null ? null : agentType.value);
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
    public PSDevSlnPipelineStageDTO codename(String codeName) {
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
    public PSDevSlnPipelineStageDTO condmodel(String condModel) {
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
    public PSDevSlnPipelineStageDTO condmodelflag(Integer condModelFlag) {
        this.setCondModelFlag(condModelFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO condmodelflag(Boolean condModelFlag) {
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
    public PSDevSlnPipelineStageDTO createdate(Timestamp createDate) {
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
    public PSDevSlnPipelineStageDTO createman(String createMan) {
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
    public PSDevSlnPipelineStageDTO customcode(String customCode) {
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
    public PSDevSlnPipelineStageDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDevSlnPipelineStageDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="postmode")
    public void setPostMode(String postMode) {
        this._set(DTOFIELD_POSTMODE, postMode);
    }

    @JsonIgnore
    public String getPostMode() {
        Object objValue = this._get(DTOFIELD_POSTMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPostModeDirty() {
        return this._contains(DTOFIELD_POSTMODE);
    }

    @JsonIgnore
    public void resetPostMode() {
        this._reset(DTOFIELD_POSTMODE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO postmode(String postMode) {
        this.setPostMode(postMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO postmode(PSModelEnums.PipelineStagePostType postMode) {
        this.setPostMode(postMode == null ? null : postMode.value);
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
    public PSDevSlnPipelineStageDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO psdccodesnippetid(PSDCCodeSnippetDTO pSDCCodeSnippet) {
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
    public PSDevSlnPipelineStageDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
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
    public PSDevSlnPipelineStageDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnPipelineStageDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO psdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
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
    public PSDevSlnPipelineStageDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
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
    public PSDevSlnPipelineStageDTO psdevslnpipelinestageid(String pSDevSlnPipelineStageId) {
        this.setPSDevSlnPipelineStageId(pSDevSlnPipelineStageId);
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
    public PSDevSlnPipelineStageDTO psdevslnpipelinestagename(String pSDevSlnPipelineStageName) {
        this.setPSDevSlnPipelineStageName(pSDevSlnPipelineStageName);
        return this;
    }

    @JsonProperty(value="stageparams")
    public void setStageParams(String stageParams) {
        this._set(DTOFIELD_STAGEPARAMS, stageParams);
    }

    @JsonIgnore
    public String getStageParams() {
        Object objValue = this._get(DTOFIELD_STAGEPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStageParamsDirty() {
        return this._contains(DTOFIELD_STAGEPARAMS);
    }

    @JsonIgnore
    public void resetStageParams() {
        this._reset(DTOFIELD_STAGEPARAMS);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO stageparams(String stageParams) {
        this.setStageParams(stageParams);
        return this;
    }

    @JsonProperty(value="stagetype")
    public void setStageType(String stageType) {
        this._set(DTOFIELD_STAGETYPE, stageType);
    }

    @JsonIgnore
    public String getStageType() {
        Object objValue = this._get(DTOFIELD_STAGETYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStageTypeDirty() {
        return this._contains(DTOFIELD_STAGETYPE);
    }

    @JsonIgnore
    public void resetStageType() {
        this._reset(DTOFIELD_STAGETYPE);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO stagetype(String stageType) {
        this.setStageType(stageType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO stagetype(PSModelEnums.PipelineStageType stageType) {
        this.setStageType(stageType == null ? null : stageType.value);
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
    public PSDevSlnPipelineStageDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
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
    public PSDevSlnPipelineStageDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnPipelineStageDTO updateman(String updateMan) {
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
    public PSDevSlnPipelineStageDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDevSlnPipelineStageDTO usertag(String userTag) {
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
    public PSDevSlnPipelineStageDTO usertag2(String userTag2) {
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
    public PSDevSlnPipelineStageDTO usertag3(String userTag3) {
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
    public PSDevSlnPipelineStageDTO usertag4(String userTag4) {
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
    public PSDevSlnPipelineStageDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnPipelineStageName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnPipelineStageName(strName);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO name(String strName) {
        this.setPSDevSlnPipelineStageName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnPipelineStageId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnPipelineStageId(strValue);
    }

    @JsonIgnore
    public PSDevSlnPipelineStageDTO id(String strValue) {
        this.setPSDevSlnPipelineStageId(strValue);
        return this;
    }

}
