package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELogicParamDTO
extends PSModelDTOBase {
    public static final String FIELD_CLONEPARAMFLAG = "CLONEPARAMFLAG";
    protected static final String DTOFIELD_CLONEPARAMFLAG = "cloneparamflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTPARAM = "DEFAULTPARAM";
    protected static final String DTOFIELD_DEFAULTPARAM = "defaultparam";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DEFAULTVALUETYPE = "DEFAULTVALUETYPE";
    protected static final String DTOFIELD_DEFAULTVALUETYPE = "defaultvaluetype";
    public static final String FIELD_FILETYPE = "FILETYPE";
    protected static final String DTOFIELD_FILETYPE = "filetype";
    public static final String FIELD_FILEURL = "FILEURL";
    protected static final String DTOFIELD_FILEURL = "fileurl";
    public static final String FIELD_GLOBALPARAM = "GLOBALPARAM";
    protected static final String DTOFIELD_GLOBALPARAM = "globalparam";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORIGINENTITYFLAG = "ORIGINENTITYFLAG";
    protected static final String DTOFIELD_ORIGINENTITYFLAG = "originentityflag";
    public static final String FIELD_PARAMPSDEFGROUPID = "PARAMPSDEFGROUPID";
    protected static final String DTOFIELD_PARAMPSDEFGROUPID = "parampsdefgroupid";
    public static final String FIELD_PARAMPSDEFGROUPNAME = "PARAMPSDEFGROUPNAME";
    protected static final String DTOFIELD_PARAMPSDEFGROUPNAME = "parampsdefgroupname";
    public static final String FIELD_PARAMPSDEID = "PARAMPSDEID";
    protected static final String DTOFIELD_PARAMPSDEID = "parampsdeid";
    public static final String FIELD_PARAMPSDENAME = "PARAMPSDENAME";
    protected static final String DTOFIELD_PARAMPSDENAME = "parampsdename";
    public static final String FIELD_PARAMS = "PARAMS";
    protected static final String DTOFIELD_PARAMS = "params";
    public static final String FIELD_PARAMTAG = "PARAMTAG";
    protected static final String DTOFIELD_PARAMTAG = "paramtag";
    public static final String FIELD_PARAMTAG2 = "PARAMTAG2";
    protected static final String DTOFIELD_PARAMTAG2 = "paramtag2";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDELOGICPARAMID = "PSDELOGICPARAMID";
    protected static final String DTOFIELD_PSDELOGICPARAMID = "psdelogicparamid";
    public static final String FIELD_PSDELOGICPARAMNAME = "PSDELOGICPARAMNAME";
    protected static final String DTOFIELD_PSDELOGICPARAMNAME = "psdelogicparamname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_REFFIELDNAME = "REFFIELDNAME";
    protected static final String DTOFIELD_REFFIELDNAME = "reffieldname";
    public static final String FIELD_REFPARAMNAME = "REFPARAMNAME";
    protected static final String DTOFIELD_REFPARAMNAME = "refparamname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="cloneparamflag")
    public void setCloneParamFlag(Integer cloneParamFlag) {
        this._set(DTOFIELD_CLONEPARAMFLAG, cloneParamFlag);
    }

    @JsonIgnore
    public Integer getCloneParamFlag() {
        Object objValue = this._get(DTOFIELD_CLONEPARAMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCloneParamFlagDirty() {
        return this._contains(DTOFIELD_CLONEPARAMFLAG);
    }

    @JsonIgnore
    public void resetCloneParamFlag() {
        this._reset(DTOFIELD_CLONEPARAMFLAG);
    }

    @JsonIgnore
    public PSDELogicParamDTO cloneparamflag(Integer cloneParamFlag) {
        this.setCloneParamFlag(cloneParamFlag);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO cloneparamflag(Boolean cloneParamFlag) {
        if (cloneParamFlag == null) {
            this.setCloneParamFlag(null);
        } else {
            this.setCloneParamFlag(cloneParamFlag != false ? 1 : 0);
        }
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
    public PSDELogicParamDTO createdate(Timestamp createDate) {
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
    public PSDELogicParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultparam")
    public void setDefaultParam(Integer defaultParam) {
        this._set(DTOFIELD_DEFAULTPARAM, defaultParam);
    }

    @JsonIgnore
    public Integer getDefaultParam() {
        Object objValue = this._get(DTOFIELD_DEFAULTPARAM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultParamDirty() {
        return this._contains(DTOFIELD_DEFAULTPARAM);
    }

    @JsonIgnore
    public void resetDefaultParam() {
        this._reset(DTOFIELD_DEFAULTPARAM);
    }

    @JsonIgnore
    public PSDELogicParamDTO defaultparam(Integer defaultParam) {
        this.setDefaultParam(defaultParam);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO defaultparam(Boolean defaultParam) {
        if (defaultParam == null) {
            this.setDefaultParam(null);
        } else {
            this.setDefaultParam(defaultParam != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSDELogicParamDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="defaultvaluetype")
    public void setDefaultValueType(String defaultValueType) {
        this._set(DTOFIELD_DEFAULTVALUETYPE, defaultValueType);
    }

    @JsonIgnore
    public String getDefaultValueType() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueTypeDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public void resetDefaultValueType() {
        this._reset(DTOFIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public PSDELogicParamDTO defaultvaluetype(String defaultValueType) {
        this.setDefaultValueType(defaultValueType);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO defaultvaluetype(PSModelEnums.DEFDefaultValueType defaultValueType) {
        if (defaultValueType == null) {
            this.setDefaultValueType(null);
        } else {
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    @JsonProperty(value="filetype")
    public void setFileType(String fileType) {
        this._set(DTOFIELD_FILETYPE, fileType);
    }

    @JsonIgnore
    public String getFileType() {
        Object objValue = this._get(DTOFIELD_FILETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFileTypeDirty() {
        return this._contains(DTOFIELD_FILETYPE);
    }

    @JsonIgnore
    public void resetFileType() {
        this._reset(DTOFIELD_FILETYPE);
    }

    @JsonIgnore
    public PSDELogicParamDTO filetype(String fileType) {
        this.setFileType(fileType);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO filetype(PSModelEnums.DELogicParamFileType fileType) {
        if (fileType == null) {
            this.setFileType(null);
        } else {
            this.setFileType(fileType.value);
        }
        return this;
    }

    @JsonProperty(value="fileurl")
    public void setFileUrl(String fileUrl) {
        this._set(DTOFIELD_FILEURL, fileUrl);
    }

    @JsonIgnore
    public String getFileUrl() {
        Object objValue = this._get(DTOFIELD_FILEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFileUrlDirty() {
        return this._contains(DTOFIELD_FILEURL);
    }

    @JsonIgnore
    public void resetFileUrl() {
        this._reset(DTOFIELD_FILEURL);
    }

    @JsonIgnore
    public PSDELogicParamDTO fileurl(String fileUrl) {
        this.setFileUrl(fileUrl);
        return this;
    }

    @JsonProperty(value="globalparam")
    public void setGlobalParam(Integer globalParam) {
        this._set(DTOFIELD_GLOBALPARAM, globalParam);
    }

    @JsonIgnore
    public Integer getGlobalParam() {
        Object objValue = this._get(DTOFIELD_GLOBALPARAM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGlobalParamDirty() {
        return this._contains(DTOFIELD_GLOBALPARAM);
    }

    @JsonIgnore
    public void resetGlobalParam() {
        this._reset(DTOFIELD_GLOBALPARAM);
    }

    @JsonIgnore
    public PSDELogicParamDTO globalparam(Integer globalParam) {
        this.setGlobalParam(globalParam);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO globalparam(PSModelEnums.DELogicParamMode globalParam) {
        if (globalParam == null) {
            this.setGlobalParam(null);
        } else {
            this.setGlobalParam(globalParam.value);
        }
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
    public PSDELogicParamDTO logicname(String logicName) {
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
    public PSDELogicParamDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="originentityflag")
    public void setOriginEntityFlag(Integer originEntityFlag) {
        this._set(DTOFIELD_ORIGINENTITYFLAG, originEntityFlag);
    }

    @JsonIgnore
    public Integer getOriginEntityFlag() {
        Object objValue = this._get(DTOFIELD_ORIGINENTITYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOriginEntityFlagDirty() {
        return this._contains(DTOFIELD_ORIGINENTITYFLAG);
    }

    @JsonIgnore
    public void resetOriginEntityFlag() {
        this._reset(DTOFIELD_ORIGINENTITYFLAG);
    }

    @JsonIgnore
    public PSDELogicParamDTO originentityflag(Integer originEntityFlag) {
        this.setOriginEntityFlag(originEntityFlag);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO originentityflag(Boolean originEntityFlag) {
        if (originEntityFlag == null) {
            this.setOriginEntityFlag(null);
        } else {
            this.setOriginEntityFlag(originEntityFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="parampsdefgroupid")
    public void setParamPSDEFGroupId(String paramPSDEFGroupId) {
        this._set(DTOFIELD_PARAMPSDEFGROUPID, paramPSDEFGroupId);
    }

    @JsonIgnore
    public String getParamPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_PARAMPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_PARAMPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetParamPSDEFGroupId() {
        this._reset(DTOFIELD_PARAMPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdefgroupid(String paramPSDEFGroupId) {
        this.setParamPSDEFGroupId(paramPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setParamPSDEFGroupId(null);
            this.setParamPSDEFGroupName(null);
        } else {
            this.setParamPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setParamPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="parampsdefgroupname")
    public void setParamPSDEFGroupName(String paramPSDEFGroupName) {
        this._set(DTOFIELD_PARAMPSDEFGROUPNAME, paramPSDEFGroupName);
    }

    @JsonIgnore
    public String getParamPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_PARAMPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_PARAMPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetParamPSDEFGroupName() {
        this._reset(DTOFIELD_PARAMPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdefgroupname(String paramPSDEFGroupName) {
        this.setParamPSDEFGroupName(paramPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="parampsdeid")
    public void setParamPSDEId(String paramPSDEId) {
        this._set(DTOFIELD_PARAMPSDEID, paramPSDEId);
    }

    @JsonIgnore
    public String getParamPSDEId() {
        Object objValue = this._get(DTOFIELD_PARAMPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDEIdDirty() {
        return this._contains(DTOFIELD_PARAMPSDEID);
    }

    @JsonIgnore
    public void resetParamPSDEId() {
        this._reset(DTOFIELD_PARAMPSDEID);
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdeid(String paramPSDEId) {
        this.setParamPSDEId(paramPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setParamPSDEId(null);
            this.setParamPSDEName(null);
        } else {
            this.setParamPSDEId(pSDataEntity.getPSDataEntityId());
            this.setParamPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="parampsdename")
    public void setParamPSDEName(String paramPSDEName) {
        this._set(DTOFIELD_PARAMPSDENAME, paramPSDEName);
    }

    @JsonIgnore
    public String getParamPSDEName() {
        Object objValue = this._get(DTOFIELD_PARAMPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDENameDirty() {
        return this._contains(DTOFIELD_PARAMPSDENAME);
    }

    @JsonIgnore
    public void resetParamPSDEName() {
        this._reset(DTOFIELD_PARAMPSDENAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO parampsdename(String paramPSDEName) {
        this.setParamPSDEName(paramPSDEName);
        return this;
    }

    @JsonProperty(value="params")
    public void setParams(String params) {
        this._set(DTOFIELD_PARAMS, params);
    }

    @JsonIgnore
    public String getParams() {
        Object objValue = this._get(DTOFIELD_PARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamsDirty() {
        return this._contains(DTOFIELD_PARAMS);
    }

    @JsonIgnore
    public void resetParams() {
        this._reset(DTOFIELD_PARAMS);
    }

    @JsonIgnore
    public PSDELogicParamDTO params(String params) {
        this.setParams(params);
        return this;
    }

    @JsonProperty(value="paramtag")
    public void setParamTag(String paramTag) {
        this._set(DTOFIELD_PARAMTAG, paramTag);
    }

    @JsonIgnore
    public String getParamTag() {
        Object objValue = this._get(DTOFIELD_PARAMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTagDirty() {
        return this._contains(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public void resetParamTag() {
        this._reset(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public PSDELogicParamDTO paramtag(String paramTag) {
        this.setParamTag(paramTag);
        return this;
    }

    @JsonProperty(value="paramtag2")
    public void setParamTag2(String paramTag2) {
        this._set(DTOFIELD_PARAMTAG2, paramTag2);
    }

    @JsonIgnore
    public String getParamTag2() {
        Object objValue = this._get(DTOFIELD_PARAMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTag2Dirty() {
        return this._contains(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public void resetParamTag2() {
        this._reset(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public PSDELogicParamDTO paramtag2(String paramTag2) {
        this.setParamTag2(paramTag2);
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSDELogicParamDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdelogicparamid")
    public void setPSDELogicParamId(String pSDELogicParamId) {
        this._set(DTOFIELD_PSDELOGICPARAMID, pSDELogicParamId);
    }

    @JsonIgnore
    public String getPSDELogicParamId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicParamIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICPARAMID);
    }

    @JsonIgnore
    public void resetPSDELogicParamId() {
        this._reset(DTOFIELD_PSDELOGICPARAMID);
    }

    @JsonIgnore
    public PSDELogicParamDTO psdelogicparamid(String pSDELogicParamId) {
        this.setPSDELogicParamId(pSDELogicParamId);
        return this;
    }

    @JsonProperty(value="psdelogicparamname")
    public void setPSDELogicParamName(String pSDELogicParamName) {
        this._set(DTOFIELD_PSDELOGICPARAMNAME, pSDELogicParamName);
    }

    @JsonIgnore
    public String getPSDELogicParamName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicParamNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICPARAMNAME);
    }

    @JsonIgnore
    public void resetPSDELogicParamName() {
        this._reset(DTOFIELD_PSDELOGICPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO psdelogicparamname(String pSDELogicParamName) {
        this.setPSDELogicParamName(pSDELogicParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELogicParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELogicParamName(strName);
    }

    @JsonIgnore
    public PSDELogicParamDTO name(String strName) {
        this.setPSDELogicParamName(strName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDELogicParamDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDELogicParamDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
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
    public PSDELogicParamDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDELogicParamDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="reffieldname")
    public void setRefFieldName(String refFieldName) {
        this._set(DTOFIELD_REFFIELDNAME, refFieldName);
    }

    @JsonIgnore
    public String getRefFieldName() {
        Object objValue = this._get(DTOFIELD_REFFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefFieldNameDirty() {
        return this._contains(DTOFIELD_REFFIELDNAME);
    }

    @JsonIgnore
    public void resetRefFieldName() {
        this._reset(DTOFIELD_REFFIELDNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO reffieldname(String refFieldName) {
        this.setRefFieldName(refFieldName);
        return this;
    }

    @JsonProperty(value="refparamname")
    public void setRefParamName(String refParamName) {
        this._set(DTOFIELD_REFPARAMNAME, refParamName);
    }

    @JsonIgnore
    public String getRefParamName() {
        Object objValue = this._get(DTOFIELD_REFPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamNameDirty() {
        return this._contains(DTOFIELD_REFPARAMNAME);
    }

    @JsonIgnore
    public void resetRefParamName() {
        this._reset(DTOFIELD_REFPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicParamDTO refparamname(String refParamName) {
        this.setRefParamName(refParamName);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStdDataTypeDirty() {
        return this._contains(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public void resetStdDataType() {
        this._reset(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public PSDELogicParamDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
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
    public PSDELogicParamDTO updatedate(Timestamp updateDate) {
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
    public PSDELogicParamDTO updateman(String updateMan) {
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
    public PSDELogicParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELogicParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDELogicParamDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDELogicParamDTO usertag(String userTag) {
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
    public PSDELogicParamDTO usertag2(String userTag2) {
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
    public PSDELogicParamDTO usertag3(String userTag3) {
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
    public PSDELogicParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELogicParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELogicParamId(strValue);
    }

    @JsonIgnore
    public PSDELogicParamDTO id(String strValue) {
        this.setPSDELogicParamId(strValue);
        return this;
    }
}
