package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBackServiceDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTAINERTAG = "CONTAINERTAG";
    protected static final String DTOFIELD_CONTAINERTAG = "containertag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSBACKSERVICEID = "PSBACKSERVICEID";
    protected static final String DTOFIELD_PSBACKSERVICEID = "psbackserviceid";
    public static final String FIELD_PSBACKSERVICENAME = "PSBACKSERVICENAME";
    protected static final String DTOFIELD_PSBACKSERVICENAME = "psbackservicename";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSBACKSERVICEID = "PSSYSBACKSERVICEID";
    protected static final String DTOFIELD_PSSYSBACKSERVICEID = "pssysbackserviceid";
    public static final String FIELD_PSSYSBACKSERVICENAME = "PSSYSBACKSERVICENAME";
    protected static final String DTOFIELD_PSSYSBACKSERVICENAME = "pssysbackservicename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUTILDEID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILDEID = "pssysutildeid";
    public static final String FIELD_PSSYSUTILDENAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILDENAME = "pssysutildename";
    public static final String FIELD_RUNORDER = "RUNORDER";
    protected static final String DTOFIELD_RUNORDER = "runorder";
    public static final String FIELD_SERVICECONTAINER = "SERVICECONTAINER";
    protected static final String DTOFIELD_SERVICECONTAINER = "servicecontainer";
    public static final String FIELD_SERVICEOBJ = "SERVICEOBJ";
    protected static final String DTOFIELD_SERVICEOBJ = "serviceobj";
    public static final String FIELD_SERVICEPARAMS = "SERVICEPARAMS";
    protected static final String DTOFIELD_SERVICEPARAMS = "serviceparams";
    public static final String FIELD_SERVICEPOLICY = "SERVICEPOLICY";
    protected static final String DTOFIELD_SERVICEPOLICY = "servicepolicy";
    public static final String FIELD_SERVICEPOLICY2 = "SERVICEPOLICY2";
    protected static final String DTOFIELD_SERVICEPOLICY2 = "servicepolicy2";
    public static final String FIELD_SERVICETAG = "SERVICETAG";
    protected static final String DTOFIELD_SERVICETAG = "servicetag";
    public static final String FIELD_SERVICETAG2 = "SERVICETAG2";
    protected static final String DTOFIELD_SERVICETAG2 = "servicetag2";
    public static final String FIELD_STARTMODE = "STARTMODE";
    protected static final String DTOFIELD_STARTMODE = "startmode";
    public static final String FIELD_TASKTYPE = "TASKTYPE";
    protected static final String DTOFIELD_TASKTYPE = "tasktype";
    public static final String FIELD_TIMERMODE = "TIMERMODE";
    protected static final String DTOFIELD_TIMERMODE = "timermode";
    public static final String FIELD_TIMERPOLICY = "TIMERPOLICY";
    protected static final String DTOFIELD_TIMERPOLICY = "timerpolicy";
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
    public PSSysBackServiceDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="containertag")
    public void setContainerTag(String containerTag) {
        this._set(DTOFIELD_CONTAINERTAG, containerTag);
    }

    @JsonIgnore
    public String getContainerTag() {
        Object objValue = this._get(DTOFIELD_CONTAINERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContainerTagDirty() {
        return this._contains(DTOFIELD_CONTAINERTAG);
    }

    @JsonIgnore
    public void resetContainerTag() {
        this._reset(DTOFIELD_CONTAINERTAG);
    }

    @JsonIgnore
    public PSSysBackServiceDTO containertag(String containerTag) {
        this.setContainerTag(containerTag);
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
    public PSSysBackServiceDTO createdate(Timestamp createDate) {
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
    public PSSysBackServiceDTO createman(String createMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysBackServiceDTO customcode(String customCode) {
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
    public PSSysBackServiceDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSSysBackServiceDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO predefinedtype(PSModelEnums.PredefinedBackendTaskType predefinedType) {
        if (predefinedType == null) {
            this.setPredefinedType(null);
        } else {
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    @JsonProperty(value="psbackserviceid")
    public void setPSBackServiceId(String pSBackServiceId) {
        this._set(DTOFIELD_PSBACKSERVICEID, pSBackServiceId);
    }

    @JsonIgnore
    public String getPSBackServiceId() {
        Object objValue = this._get(DTOFIELD_PSBACKSERVICEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSBackServiceIdDirty() {
        return this._contains(DTOFIELD_PSBACKSERVICEID);
    }

    @JsonIgnore
    public void resetPSBackServiceId() {
        this._reset(DTOFIELD_PSBACKSERVICEID);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psbackserviceid(String pSBackServiceId) {
        this.setPSBackServiceId(pSBackServiceId);
        return this;
    }

    @JsonProperty(value="psbackservicename")
    public void setPSBackServiceName(String pSBackServiceName) {
        this._set(DTOFIELD_PSBACKSERVICENAME, pSBackServiceName);
    }

    @JsonIgnore
    public String getPSBackServiceName() {
        Object objValue = this._get(DTOFIELD_PSBACKSERVICENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSBackServiceNameDirty() {
        return this._contains(DTOFIELD_PSBACKSERVICENAME);
    }

    @JsonIgnore
    public void resetPSBackServiceName() {
        this._reset(DTOFIELD_PSBACKSERVICENAME);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psbackservicename(String pSBackServiceName) {
        this.setPSBackServiceName(pSBackServiceName);
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSSysBackServiceDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysBackServiceDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSSysBackServiceDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
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
    public PSSysBackServiceDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysbackserviceid")
    public void setPSSysBackServiceId(String pSSysBackServiceId) {
        this._set(DTOFIELD_PSSYSBACKSERVICEID, pSSysBackServiceId);
    }

    @JsonIgnore
    public String getPSSysBackServiceId() {
        Object objValue = this._get(DTOFIELD_PSSYSBACKSERVICEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBackServiceIdDirty() {
        return this._contains(DTOFIELD_PSSYSBACKSERVICEID);
    }

    @JsonIgnore
    public void resetPSSysBackServiceId() {
        this._reset(DTOFIELD_PSSYSBACKSERVICEID);
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysbackserviceid(String pSSysBackServiceId) {
        this.setPSSysBackServiceId(pSSysBackServiceId);
        return this;
    }

    @JsonProperty(value="pssysbackservicename")
    public void setPSSysBackServiceName(String pSSysBackServiceName) {
        this._set(DTOFIELD_PSSYSBACKSERVICENAME, pSSysBackServiceName);
    }

    @JsonIgnore
    public String getPSSysBackServiceName() {
        Object objValue = this._get(DTOFIELD_PSSYSBACKSERVICENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBackServiceNameDirty() {
        return this._contains(DTOFIELD_PSSYSBACKSERVICENAME);
    }

    @JsonIgnore
    public void resetPSSysBackServiceName() {
        this._reset(DTOFIELD_PSSYSBACKSERVICENAME);
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysbackservicename(String pSSysBackServiceName) {
        this.setPSSysBackServiceName(pSSysBackServiceName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBackServiceName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBackServiceName(strName);
    }

    @JsonIgnore
    public PSSysBackServiceDTO name(String strName) {
        this.setPSSysBackServiceName(strName);
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
    public PSSysBackServiceDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysBackServiceDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysBackServiceDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysBackServiceDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysutildeid")
    public void setPSSysUtilDEId(String pSSysUtilDEId) {
        this._set(DTOFIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }

    @JsonIgnore
    public String getPSSysUtilDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public void resetPSSysUtilDEId() {
        this._reset(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysutildeid(String pSSysUtilDEId) {
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysutildeid(PSSysUtilDTO pSSysUtil) {
        if (pSSysUtil == null) {
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        } else {
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonProperty(value="pssysutildename")
    public void setPSSysUtilDEName(String pSSysUtilDEName) {
        this._set(DTOFIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }

    @JsonIgnore
    public String getPSSysUtilDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDENameDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public void resetPSSysUtilDEName() {
        this._reset(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public PSSysBackServiceDTO pssysutildename(String pSSysUtilDEName) {
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="runorder")
    public void setRunOrder(Integer runOrder) {
        this._set(DTOFIELD_RUNORDER, runOrder);
    }

    @JsonIgnore
    public Integer getRunOrder() {
        Object objValue = this._get(DTOFIELD_RUNORDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRunOrderDirty() {
        return this._contains(DTOFIELD_RUNORDER);
    }

    @JsonIgnore
    public void resetRunOrder() {
        this._reset(DTOFIELD_RUNORDER);
    }

    @JsonIgnore
    public PSSysBackServiceDTO runorder(Integer runOrder) {
        this.setRunOrder(runOrder);
        return this;
    }

    @JsonProperty(value="servicecontainer")
    public void setServiceContainer(String serviceContainer) {
        this._set(DTOFIELD_SERVICECONTAINER, serviceContainer);
    }

    @JsonIgnore
    public String getServiceContainer() {
        Object objValue = this._get(DTOFIELD_SERVICECONTAINER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceContainerDirty() {
        return this._contains(DTOFIELD_SERVICECONTAINER);
    }

    @JsonIgnore
    public void resetServiceContainer() {
        this._reset(DTOFIELD_SERVICECONTAINER);
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicecontainer(String serviceContainer) {
        this.setServiceContainer(serviceContainer);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicecontainer(PSModelEnums.BackendTaskContainer serviceContainer) {
        if (serviceContainer == null) {
            this.setServiceContainer(null);
        } else {
            this.setServiceContainer(serviceContainer.value);
        }
        return this;
    }

    @JsonProperty(value="serviceobj")
    public void setServiceObj(String serviceObj) {
        this._set(DTOFIELD_SERVICEOBJ, serviceObj);
    }

    @JsonIgnore
    public String getServiceObj() {
        Object objValue = this._get(DTOFIELD_SERVICEOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceObjDirty() {
        return this._contains(DTOFIELD_SERVICEOBJ);
    }

    @JsonIgnore
    public void resetServiceObj() {
        this._reset(DTOFIELD_SERVICEOBJ);
    }

    @JsonIgnore
    public PSSysBackServiceDTO serviceobj(String serviceObj) {
        this.setServiceObj(serviceObj);
        return this;
    }

    @JsonProperty(value="serviceparams")
    public void setServiceParams(String serviceParams) {
        this._set(DTOFIELD_SERVICEPARAMS, serviceParams);
    }

    @JsonIgnore
    public String getServiceParams() {
        Object objValue = this._get(DTOFIELD_SERVICEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceParamsDirty() {
        return this._contains(DTOFIELD_SERVICEPARAMS);
    }

    @JsonIgnore
    public void resetServiceParams() {
        this._reset(DTOFIELD_SERVICEPARAMS);
    }

    @JsonIgnore
    public PSSysBackServiceDTO serviceparams(String serviceParams) {
        this.setServiceParams(serviceParams);
        return this;
    }

    @JsonProperty(value="servicepolicy")
    public void setServicePolicy(String servicePolicy) {
        this._set(DTOFIELD_SERVICEPOLICY, servicePolicy);
    }

    @JsonIgnore
    public String getServicePolicy() {
        Object objValue = this._get(DTOFIELD_SERVICEPOLICY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServicePolicyDirty() {
        return this._contains(DTOFIELD_SERVICEPOLICY);
    }

    @JsonIgnore
    public void resetServicePolicy() {
        this._reset(DTOFIELD_SERVICEPOLICY);
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicepolicy(String servicePolicy) {
        this.setServicePolicy(servicePolicy);
        return this;
    }

    @JsonProperty(value="servicepolicy2")
    public void setServicePolicy2(String servicePolicy2) {
        this._set(DTOFIELD_SERVICEPOLICY2, servicePolicy2);
    }

    @JsonIgnore
    public String getServicePolicy2() {
        Object objValue = this._get(DTOFIELD_SERVICEPOLICY2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServicePolicy2Dirty() {
        return this._contains(DTOFIELD_SERVICEPOLICY2);
    }

    @JsonIgnore
    public void resetServicePolicy2() {
        this._reset(DTOFIELD_SERVICEPOLICY2);
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicepolicy2(String servicePolicy2) {
        this.setServicePolicy2(servicePolicy2);
        return this;
    }

    @JsonProperty(value="servicetag")
    public void setServiceTag(String serviceTag) {
        this._set(DTOFIELD_SERVICETAG, serviceTag);
    }

    @JsonIgnore
    public String getServiceTag() {
        Object objValue = this._get(DTOFIELD_SERVICETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceTagDirty() {
        return this._contains(DTOFIELD_SERVICETAG);
    }

    @JsonIgnore
    public void resetServiceTag() {
        this._reset(DTOFIELD_SERVICETAG);
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicetag(String serviceTag) {
        this.setServiceTag(serviceTag);
        return this;
    }

    @JsonProperty(value="servicetag2")
    public void setServiceTag2(String serviceTag2) {
        this._set(DTOFIELD_SERVICETAG2, serviceTag2);
    }

    @JsonIgnore
    public String getServiceTag2() {
        Object objValue = this._get(DTOFIELD_SERVICETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceTag2Dirty() {
        return this._contains(DTOFIELD_SERVICETAG2);
    }

    @JsonIgnore
    public void resetServiceTag2() {
        this._reset(DTOFIELD_SERVICETAG2);
    }

    @JsonIgnore
    public PSSysBackServiceDTO servicetag2(String serviceTag2) {
        this.setServiceTag2(serviceTag2);
        return this;
    }

    @JsonProperty(value="startmode")
    public void setStartMode(String startMode) {
        this._set(DTOFIELD_STARTMODE, startMode);
    }

    @JsonIgnore
    public String getStartMode() {
        Object objValue = this._get(DTOFIELD_STARTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartModeDirty() {
        return this._contains(DTOFIELD_STARTMODE);
    }

    @JsonIgnore
    public void resetStartMode() {
        this._reset(DTOFIELD_STARTMODE);
    }

    @JsonIgnore
    public PSSysBackServiceDTO startmode(String startMode) {
        this.setStartMode(startMode);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO startmode(PSModelEnums.BackendTaskStartMode startMode) {
        if (startMode == null) {
            this.setStartMode(null);
        } else {
            this.setStartMode(startMode.value);
        }
        return this;
    }

    @JsonProperty(value="tasktype")
    public void setTaskType(String taskType) {
        this._set(DTOFIELD_TASKTYPE, taskType);
    }

    @JsonIgnore
    public String getTaskType() {
        Object objValue = this._get(DTOFIELD_TASKTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskTypeDirty() {
        return this._contains(DTOFIELD_TASKTYPE);
    }

    @JsonIgnore
    public void resetTaskType() {
        this._reset(DTOFIELD_TASKTYPE);
    }

    @JsonIgnore
    public PSSysBackServiceDTO tasktype(String taskType) {
        this.setTaskType(taskType);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO tasktype(PSModelEnums.BackendTaskType taskType) {
        if (taskType == null) {
            this.setTaskType(null);
        } else {
            this.setTaskType(taskType.value);
        }
        return this;
    }

    @JsonProperty(value="timermode")
    public void setTimerMode(Integer timerMode) {
        this._set(DTOFIELD_TIMERMODE, timerMode);
    }

    @JsonIgnore
    public Integer getTimerMode() {
        Object objValue = this._get(DTOFIELD_TIMERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimerModeDirty() {
        return this._contains(DTOFIELD_TIMERMODE);
    }

    @JsonIgnore
    public void resetTimerMode() {
        this._reset(DTOFIELD_TIMERMODE);
    }

    @JsonIgnore
    public PSSysBackServiceDTO timermode(Integer timerMode) {
        this.setTimerMode(timerMode);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO timermode(PSModelEnums.BackendTaskTimerMode timerMode) {
        if (timerMode == null) {
            this.setTimerMode(null);
        } else {
            this.setTimerMode(timerMode.value);
        }
        return this;
    }

    @JsonProperty(value="timerpolicy")
    public void setTimerPolicy(String timerPolicy) {
        this._set(DTOFIELD_TIMERPOLICY, timerPolicy);
    }

    @JsonIgnore
    public String getTimerPolicy() {
        Object objValue = this._get(DTOFIELD_TIMERPOLICY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimerPolicyDirty() {
        return this._contains(DTOFIELD_TIMERPOLICY);
    }

    @JsonIgnore
    public void resetTimerPolicy() {
        this._reset(DTOFIELD_TIMERPOLICY);
    }

    @JsonIgnore
    public PSSysBackServiceDTO timerpolicy(String timerPolicy) {
        this.setTimerPolicy(timerPolicy);
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
    public PSSysBackServiceDTO updatedate(Timestamp updateDate) {
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
    public PSSysBackServiceDTO updateman(String updateMan) {
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
    public PSSysBackServiceDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBackServiceDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBackServiceDTO userparams(String userParams) {
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
    public PSSysBackServiceDTO usertag(String userTag) {
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
    public PSSysBackServiceDTO usertag2(String userTag2) {
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
    public PSSysBackServiceDTO usertag3(String userTag3) {
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
    public PSSysBackServiceDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBackServiceId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBackServiceId(strValue);
    }

    @JsonIgnore
    public PSSysBackServiceDTO id(String strValue) {
        this.setPSSysBackServiceId(strValue);
        return this;
    }
}
