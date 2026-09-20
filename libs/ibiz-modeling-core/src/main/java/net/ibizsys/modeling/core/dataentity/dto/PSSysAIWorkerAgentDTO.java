package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIFactoryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysAIWorkerAgentDTO
extends PSModelDTOBase {
    public static final String FIELD_AIPLATFORMTYPE = "AIPLATFORMTYPE";
    protected static final String DTOFIELD_AIPLATFORMTYPE = "aiplatformtype";
    public static final String FIELD_AIWORKERAGENTPARAMS = "AIWORKERAGENTPARAMS";
    protected static final String DTOFIELD_AIWORKERAGENTPARAMS = "aiworkeragentparams";
    public static final String FIELD_AIWORKERAGENTTAG = "AIWORKERAGENTTAG";
    protected static final String DTOFIELD_AIWORKERAGENTTAG = "aiworkeragenttag";
    public static final String FIELD_AIWORKERAGENTTAG2 = "AIWORKERAGENTTAG2";
    protected static final String DTOFIELD_AIWORKERAGENTTAG2 = "aiworkeragenttag2";
    public static final String FIELD_AIWORKERAGENTTYPE = "AIWORKERAGENTTYPE";
    protected static final String DTOFIELD_AIWORKERAGENTTYPE = "aiworkeragenttype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSAIFACTORYID = "PSSYSAIFACTORYID";
    protected static final String DTOFIELD_PSSYSAIFACTORYID = "pssysaifactoryid";
    public static final String FIELD_PSSYSAIFACTORYNAME = "PSSYSAIFACTORYNAME";
    protected static final String DTOFIELD_PSSYSAIFACTORYNAME = "pssysaifactoryname";
    public static final String FIELD_PSSYSAIWORKERAGENTID = "PSSYSAIWORKERAGENTID";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTID = "pssysaiworkeragentid";
    public static final String FIELD_PSSYSAIWORKERAGENTNAME = "PSSYSAIWORKERAGENTNAME";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTNAME = "pssysaiworkeragentname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
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

    @JsonProperty(value="aiplatformtype")
    public void setAIPlatformType(String aIPlatformType) {
        this._set(DTOFIELD_AIPLATFORMTYPE, aIPlatformType);
    }

    @JsonIgnore
    public String getAIPlatformType() {
        Object objValue = this._get(DTOFIELD_AIPLATFORMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPlatformTypeDirty() {
        return this._contains(DTOFIELD_AIPLATFORMTYPE);
    }

    @JsonIgnore
    public void resetAIPlatformType() {
        this._reset(DTOFIELD_AIPLATFORMTYPE);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiplatformtype(String aIPlatformType) {
        this.setAIPlatformType(aIPlatformType);
        return this;
    }

    @JsonProperty(value="aiworkeragentparams")
    public void setAIWorkerAgentParams(String aIWorkerAgentParams) {
        this._set(DTOFIELD_AIWORKERAGENTPARAMS, aIWorkerAgentParams);
    }

    @JsonIgnore
    public String getAIWorkerAgentParams() {
        Object objValue = this._get(DTOFIELD_AIWORKERAGENTPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIWorkerAgentParamsDirty() {
        return this._contains(DTOFIELD_AIWORKERAGENTPARAMS);
    }

    @JsonIgnore
    public void resetAIWorkerAgentParams() {
        this._reset(DTOFIELD_AIWORKERAGENTPARAMS);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiworkeragentparams(String aIWorkerAgentParams) {
        this.setAIWorkerAgentParams(aIWorkerAgentParams);
        return this;
    }

    @JsonProperty(value="aiworkeragenttag")
    public void setAIWorkerAgentTag(String aIWorkerAgentTag) {
        this._set(DTOFIELD_AIWORKERAGENTTAG, aIWorkerAgentTag);
    }

    @JsonIgnore
    public String getAIWorkerAgentTag() {
        Object objValue = this._get(DTOFIELD_AIWORKERAGENTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIWorkerAgentTagDirty() {
        return this._contains(DTOFIELD_AIWORKERAGENTTAG);
    }

    @JsonIgnore
    public void resetAIWorkerAgentTag() {
        this._reset(DTOFIELD_AIWORKERAGENTTAG);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiworkeragenttag(String aIWorkerAgentTag) {
        this.setAIWorkerAgentTag(aIWorkerAgentTag);
        return this;
    }

    @JsonProperty(value="aiworkeragenttag2")
    public void setAIWorkerAgentTag2(String aIWorkerAgentTag2) {
        this._set(DTOFIELD_AIWORKERAGENTTAG2, aIWorkerAgentTag2);
    }

    @JsonIgnore
    public String getAIWorkerAgentTag2() {
        Object objValue = this._get(DTOFIELD_AIWORKERAGENTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIWorkerAgentTag2Dirty() {
        return this._contains(DTOFIELD_AIWORKERAGENTTAG2);
    }

    @JsonIgnore
    public void resetAIWorkerAgentTag2() {
        this._reset(DTOFIELD_AIWORKERAGENTTAG2);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiworkeragenttag2(String aIWorkerAgentTag2) {
        this.setAIWorkerAgentTag2(aIWorkerAgentTag2);
        return this;
    }

    @JsonProperty(value="aiworkeragenttype")
    public void setAIWorkerAgentType(String aIWorkerAgentType) {
        this._set(DTOFIELD_AIWORKERAGENTTYPE, aIWorkerAgentType);
    }

    @JsonIgnore
    public String getAIWorkerAgentType() {
        Object objValue = this._get(DTOFIELD_AIWORKERAGENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIWorkerAgentTypeDirty() {
        return this._contains(DTOFIELD_AIWORKERAGENTTYPE);
    }

    @JsonIgnore
    public void resetAIWorkerAgentType() {
        this._reset(DTOFIELD_AIWORKERAGENTTYPE);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiworkeragenttype(String aIWorkerAgentType) {
        this.setAIWorkerAgentType(aIWorkerAgentType);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO aiworkeragenttype(PSModelEnums.AIWorkerAgentType aIWorkerAgentType) {
        if (aIWorkerAgentType == null) {
            this.setAIWorkerAgentType(null);
        } else {
            this.setAIWorkerAgentType(aIWorkerAgentType.value);
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
    public PSSysAIWorkerAgentDTO codename(String codeName) {
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
    public PSSysAIWorkerAgentDTO createdate(Timestamp createDate) {
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
    public PSSysAIWorkerAgentDTO createman(String createMan) {
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
    public PSSysAIWorkerAgentDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysAIWorkerAgentDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysAIWorkerAgentDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSSysAIWorkerAgentDTO pssysaifactoryid(String pSSysAIFactoryId) {
        this.setPSSysAIFactoryId(pSSysAIFactoryId);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO pssysaifactoryid(PSSysAIFactoryDTO pSSysAIFactory) {
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
    public PSSysAIWorkerAgentDTO pssysaifactoryname(String pSSysAIFactoryName) {
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
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
    public PSSysAIWorkerAgentDTO pssysaiworkeragentid(String pSSysAIWorkerAgentId) {
        this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgentId);
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
    public PSSysAIWorkerAgentDTO pssysaiworkeragentname(String pSSysAIWorkerAgentName) {
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysAIWorkerAgentName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysAIWorkerAgentName(strName);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO name(String strName) {
        this.setPSSysAIWorkerAgentName(strName);
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
    public PSSysAIWorkerAgentDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysAIWorkerAgentDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSSysAIWorkerAgentDTO updatedate(Timestamp updateDate) {
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
    public PSSysAIWorkerAgentDTO updateman(String updateMan) {
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
    public PSSysAIWorkerAgentDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysAIWorkerAgentDTO usertag(String userTag) {
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
    public PSSysAIWorkerAgentDTO usertag2(String userTag2) {
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
    public PSSysAIWorkerAgentDTO usertag3(String userTag3) {
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
    public PSSysAIWorkerAgentDTO usertag4(String userTag4) {
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
    public PSSysAIWorkerAgentDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysAIWorkerAgentId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysAIWorkerAgentId(strValue);
    }

    @JsonIgnore
    public PSSysAIWorkerAgentDTO id(String strValue) {
        this.setPSSysAIWorkerAgentId(strValue);
        return this;
    }
}
