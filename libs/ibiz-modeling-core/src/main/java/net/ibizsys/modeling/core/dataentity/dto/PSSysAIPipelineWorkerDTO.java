package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIFactoryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIPipelineAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIWorkerAgentDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysAIPipelineWorkerDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSAIFACTORYID = "PSSYSAIFACTORYID";
    protected static final String DTOFIELD_PSSYSAIFACTORYID = "pssysaifactoryid";
    public static final String FIELD_PSSYSAIFACTORYNAME = "PSSYSAIFACTORYNAME";
    protected static final String DTOFIELD_PSSYSAIFACTORYNAME = "pssysaifactoryname";
    public static final String FIELD_PSSYSAIPIPELINEAGENTID = "PSSYSAIPIPELINEAGENTID";
    protected static final String DTOFIELD_PSSYSAIPIPELINEAGENTID = "pssysaipipelineagentid";
    public static final String FIELD_PSSYSAIPIPELINEAGENTNAME = "PSSYSAIPIPELINEAGENTNAME";
    protected static final String DTOFIELD_PSSYSAIPIPELINEAGENTNAME = "pssysaipipelineagentname";
    public static final String FIELD_PSSYSAIPIPELINEWORKERID = "PSSYSAIPIPELINEWORKERID";
    protected static final String DTOFIELD_PSSYSAIPIPELINEWORKERID = "pssysaipipelineworkerid";
    public static final String FIELD_PSSYSAIPIPELINEWORKERNAME = "PSSYSAIPIPELINEWORKERNAME";
    protected static final String DTOFIELD_PSSYSAIPIPELINEWORKERNAME = "pssysaipipelineworkername";
    public static final String FIELD_PSSYSAIWORKERAGENTID = "PSSYSAIWORKERAGENTID";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTID = "pssysaiworkeragentid";
    public static final String FIELD_PSSYSAIWORKERAGENTNAME = "PSSYSAIWORKERAGENTNAME";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTNAME = "pssysaiworkeragentname";
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
    public PSSysAIPipelineWorkerDTO createdate(Timestamp createDate) {
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
    public PSSysAIPipelineWorkerDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysAIPipelineWorkerDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysaifactoryid")
    public void setPSSysAIFactoryId(String pSSysAIFactoryId) {
        this._set(DTOFIELD_PSSYSAIFACTORYID, pSSysAIFactoryId);
    }

    @JsonIgnore
    public String getPSSysAIFactoryId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryId() {
        this._reset(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaifactoryid(String pSSysAIFactoryId) {
        this.setPSSysAIFactoryId(pSSysAIFactoryId);
        return this;
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaifactoryid(PSSysAIFactoryDTO pSSysAIFactory) {
        if (pSSysAIFactory == null) {
            this.setPSSysAIFactoryId(null);
            this.setPSSysAIFactoryName(null);
        } else {
            this.setPSSysAIFactoryId(pSSysAIFactory.getPSSysAIFactoryId());
            this.setPSSysAIFactoryName(pSSysAIFactory.getPSSysAIFactoryName());
        }
        return this;
    }

    @JsonProperty(value="pssysaifactoryname")
    public void setPSSysAIFactoryName(String pSSysAIFactoryName) {
        this._set(DTOFIELD_PSSYSAIFACTORYNAME, pSSysAIFactoryName);
    }

    @JsonIgnore
    public String getPSSysAIFactoryName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryName() {
        this._reset(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaifactoryname(String pSSysAIFactoryName) {
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
        return this;
    }

    @JsonProperty(value="pssysaipipelineagentid")
    public void setPSSysAIPipelineAgentId(String pSSysAIPipelineAgentId) {
        this._set(DTOFIELD_PSSYSAIPIPELINEAGENTID, pSSysAIPipelineAgentId);
    }

    @JsonIgnore
    public String getPSSysAIPipelineAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineAgentId() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEAGENTID);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaipipelineagentid(String pSSysAIPipelineAgentId) {
        this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgentId);
        return this;
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaipipelineagentid(PSSysAIPipelineAgentDTO pSSysAIPipelineAgent) {
        if (pSSysAIPipelineAgent == null) {
            this.setPSSysAIPipelineAgentId(null);
            this.setPSSysAIPipelineAgentName(null);
        } else {
            this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgent.getPSSysAIPipelineAgentId());
            this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgent.getPSSysAIPipelineAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaipipelineagentname")
    public void setPSSysAIPipelineAgentName(String pSSysAIPipelineAgentName) {
        this._set(DTOFIELD_PSSYSAIPIPELINEAGENTNAME, pSSysAIPipelineAgentName);
    }

    @JsonIgnore
    public String getPSSysAIPipelineAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineAgentName() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaipipelineagentname(String pSSysAIPipelineAgentName) {
        this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgentName);
        return this;
    }

    @JsonProperty(value="pssysaipipelineworkerid")
    public void setPSSysAIPipelineWorkerId(String pSSysAIPipelineWorkerId) {
        this._set(DTOFIELD_PSSYSAIPIPELINEWORKERID, pSSysAIPipelineWorkerId);
    }

    @JsonIgnore
    public String getPSSysAIPipelineWorkerId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEWORKERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineWorkerIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEWORKERID);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineWorkerId() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEWORKERID);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaipipelineworkerid(String pSSysAIPipelineWorkerId) {
        this.setPSSysAIPipelineWorkerId(pSSysAIPipelineWorkerId);
        return this;
    }

    @JsonProperty(value="pssysaipipelineworkername")
    public void setPSSysAIPipelineWorkerName(String pSSysAIPipelineWorkerName) {
        this._set(DTOFIELD_PSSYSAIPIPELINEWORKERNAME, pSSysAIPipelineWorkerName);
    }

    @JsonIgnore
    public String getPSSysAIPipelineWorkerName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEWORKERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineWorkerNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEWORKERNAME);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineWorkerName() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEWORKERNAME);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaipipelineworkername(String pSSysAIPipelineWorkerName) {
        this.setPSSysAIPipelineWorkerName(pSSysAIPipelineWorkerName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysAIPipelineWorkerName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysAIPipelineWorkerName(strName);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO name(String strName) {
        this.setPSSysAIPipelineWorkerName(strName);
        return this;
    }

    @JsonProperty(value="pssysaiworkeragentid")
    public void setPSSysAIWorkerAgentId(String pSSysAIWorkerAgentId) {
        this._set(DTOFIELD_PSSYSAIWORKERAGENTID, pSSysAIWorkerAgentId);
    }

    @JsonIgnore
    public String getPSSysAIWorkerAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIWORKERAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIWorkerAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIWORKERAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIWorkerAgentId() {
        this._reset(DTOFIELD_PSSYSAIWORKERAGENTID);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaiworkeragentid(String pSSysAIWorkerAgentId) {
        this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgentId);
        return this;
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaiworkeragentid(PSSysAIWorkerAgentDTO pSSysAIWorkerAgent) {
        if (pSSysAIWorkerAgent == null) {
            this.setPSSysAIWorkerAgentId(null);
            this.setPSSysAIWorkerAgentName(null);
        } else {
            this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgent.getPSSysAIWorkerAgentId());
            this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgent.getPSSysAIWorkerAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaiworkeragentname")
    public void setPSSysAIWorkerAgentName(String pSSysAIWorkerAgentName) {
        this._set(DTOFIELD_PSSYSAIWORKERAGENTNAME, pSSysAIWorkerAgentName);
    }

    @JsonIgnore
    public String getPSSysAIWorkerAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIWORKERAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIWorkerAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIWORKERAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIWorkerAgentName() {
        this._reset(DTOFIELD_PSSYSAIWORKERAGENTNAME);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO pssysaiworkeragentname(String pSSysAIWorkerAgentName) {
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
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
    public PSSysAIPipelineWorkerDTO updatedate(Timestamp updateDate) {
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
    public PSSysAIPipelineWorkerDTO updateman(String updateMan) {
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
    public PSSysAIPipelineWorkerDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysAIPipelineWorkerDTO usertag(String userTag) {
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
    public PSSysAIPipelineWorkerDTO usertag2(String userTag2) {
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
    public PSSysAIPipelineWorkerDTO usertag3(String userTag3) {
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
    public PSSysAIPipelineWorkerDTO usertag4(String userTag4) {
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
    public PSSysAIPipelineWorkerDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysAIPipelineWorkerId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysAIPipelineWorkerId(strValue);
    }

    @JsonIgnore
    public PSSysAIPipelineWorkerDTO id(String strValue) {
        this.setPSSysAIPipelineWorkerId(strValue);
        return this;
    }
}
