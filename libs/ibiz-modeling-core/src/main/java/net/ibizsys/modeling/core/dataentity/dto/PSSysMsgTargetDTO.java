package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysMsgTargetDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSGTARGETPARAMS = "MSGTARGETPARAMS";
    protected static final String DTOFIELD_MSGTARGETPARAMS = "msgtargetparams";
    public static final String FIELD_MSGTARGETTAG = "MSGTARGETTAG";
    protected static final String DTOFIELD_MSGTARGETTAG = "msgtargettag";
    public static final String FIELD_MSGTARGETTAG2 = "MSGTARGETTAG2";
    protected static final String DTOFIELD_MSGTARGETTAG2 = "msgtargettag2";
    public static final String FIELD_MSGTARGETTYPE = "MSGTARGETTYPE";
    protected static final String DTOFIELD_MSGTARGETTYPE = "msgtargettype";
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
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSMSGTARGETID = "PSSYSMSGTARGETID";
    protected static final String DTOFIELD_PSSYSMSGTARGETID = "pssysmsgtargetid";
    public static final String FIELD_PSSYSMSGTARGETNAME = "PSSYSMSGTARGETNAME";
    protected static final String DTOFIELD_PSSYSMSGTARGETNAME = "pssysmsgtargetname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUTILDEID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILDEID = "pssysutildeid";
    public static final String FIELD_PSSYSUTILDENAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILDENAME = "pssysutildename";
    public static final String FIELD_TARGETPSDEFID = "TARGETPSDEFID";
    protected static final String DTOFIELD_TARGETPSDEFID = "targetpsdefid";
    public static final String FIELD_TARGETPSDEFNAME = "TARGETPSDEFNAME";
    protected static final String DTOFIELD_TARGETPSDEFNAME = "targetpsdefname";
    public static final String FIELD_TARGETTYPEPSDEFID = "TARGETTYPEPSDEFID";
    protected static final String DTOFIELD_TARGETTYPEPSDEFID = "targettypepsdefid";
    public static final String FIELD_TARGETTYPEPSDEFNAME = "TARGETTYPEPSDEFNAME";
    protected static final String DTOFIELD_TARGETTYPEPSDEFNAME = "targettypepsdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USER2PSDEFID = "USER2PSDEFID";
    protected static final String DTOFIELD_USER2PSDEFID = "user2psdefid";
    public static final String FIELD_USER2PSDEFNAME = "USER2PSDEFNAME";
    protected static final String DTOFIELD_USER2PSDEFNAME = "user2psdefname";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPSDEFID = "USERPSDEFID";
    protected static final String DTOFIELD_USERPSDEFID = "userpsdefid";
    public static final String FIELD_USERPSDEFNAME = "USERPSDEFNAME";
    protected static final String DTOFIELD_USERPSDEFNAME = "userpsdefname";
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
    public PSSysMsgTargetDTO codename(String codeName) {
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
    public PSSysMsgTargetDTO createdate(Timestamp createDate) {
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
    public PSSysMsgTargetDTO createman(String createMan) {
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
    public PSSysMsgTargetDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
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
    public PSSysMsgTargetDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="msgtargetparams")
    public void setMsgTargetParams(String msgTargetParams) {
        this._set(DTOFIELD_MSGTARGETPARAMS, msgTargetParams);
    }

    @JsonIgnore
    public String getMsgTargetParams() {
        Object objValue = this._get(DTOFIELD_MSGTARGETPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTargetParamsDirty() {
        return this._contains(DTOFIELD_MSGTARGETPARAMS);
    }

    @JsonIgnore
    public void resetMsgTargetParams() {
        this._reset(DTOFIELD_MSGTARGETPARAMS);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO msgtargetparams(String msgTargetParams) {
        this.setMsgTargetParams(msgTargetParams);
        return this;
    }

    @JsonProperty(value="msgtargettag")
    public void setMsgTargetTag(String msgTargetTag) {
        this._set(DTOFIELD_MSGTARGETTAG, msgTargetTag);
    }

    @JsonIgnore
    public String getMsgTargetTag() {
        Object objValue = this._get(DTOFIELD_MSGTARGETTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTargetTagDirty() {
        return this._contains(DTOFIELD_MSGTARGETTAG);
    }

    @JsonIgnore
    public void resetMsgTargetTag() {
        this._reset(DTOFIELD_MSGTARGETTAG);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO msgtargettag(String msgTargetTag) {
        this.setMsgTargetTag(msgTargetTag);
        return this;
    }

    @JsonProperty(value="msgtargettag2")
    public void setMsgTargetTag2(String msgTargetTag2) {
        this._set(DTOFIELD_MSGTARGETTAG2, msgTargetTag2);
    }

    @JsonIgnore
    public String getMsgTargetTag2() {
        Object objValue = this._get(DTOFIELD_MSGTARGETTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTargetTag2Dirty() {
        return this._contains(DTOFIELD_MSGTARGETTAG2);
    }

    @JsonIgnore
    public void resetMsgTargetTag2() {
        this._reset(DTOFIELD_MSGTARGETTAG2);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO msgtargettag2(String msgTargetTag2) {
        this.setMsgTargetTag2(msgTargetTag2);
        return this;
    }

    @JsonProperty(value="msgtargettype")
    public void setMsgTargetType(String msgTargetType) {
        this._set(DTOFIELD_MSGTARGETTYPE, msgTargetType);
    }

    @JsonIgnore
    public String getMsgTargetType() {
        Object objValue = this._get(DTOFIELD_MSGTARGETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTargetTypeDirty() {
        return this._contains(DTOFIELD_MSGTARGETTYPE);
    }

    @JsonIgnore
    public void resetMsgTargetType() {
        this._reset(DTOFIELD_MSGTARGETTYPE);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO msgtargettype(String msgTargetType) {
        this.setMsgTargetType(msgTargetType);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO msgtargettype(PSModelEnums.MsgTargetType msgTargetType) {
        if (msgTargetType == null) {
            this.setMsgTargetType(null);
        } else {
            this.setMsgTargetType(msgTargetType.value);
        }
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
    public PSSysMsgTargetDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysMsgTargetDTO psdedsname(String pSDEDSName) {
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
    public PSSysMsgTargetDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysMsgTargetDTO psdename(String pSDEName) {
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
    public PSSysMsgTargetDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysMsgTargetDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysMsgTargetDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysMsgTargetDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysmsgtargetid")
    public void setPSSysMsgTargetId(String pSSysMsgTargetId) {
        this._set(DTOFIELD_PSSYSMSGTARGETID, pSSysMsgTargetId);
    }

    @JsonIgnore
    public String getPSSysMsgTargetId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTARGETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTargetIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTARGETID);
    }

    @JsonIgnore
    public void resetPSSysMsgTargetId() {
        this._reset(DTOFIELD_PSSYSMSGTARGETID);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO pssysmsgtargetid(String pSSysMsgTargetId) {
        this.setPSSysMsgTargetId(pSSysMsgTargetId);
        return this;
    }

    @JsonProperty(value="pssysmsgtargetname")
    public void setPSSysMsgTargetName(String pSSysMsgTargetName) {
        this._set(DTOFIELD_PSSYSMSGTARGETNAME, pSSysMsgTargetName);
    }

    @JsonIgnore
    public String getPSSysMsgTargetName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTARGETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTargetNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTARGETNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTargetName() {
        this._reset(DTOFIELD_PSSYSMSGTARGETNAME);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO pssysmsgtargetname(String pSSysMsgTargetName) {
        this.setPSSysMsgTargetName(pSSysMsgTargetName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysMsgTargetName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysMsgTargetName(strName);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO name(String strName) {
        this.setPSSysMsgTargetName(strName);
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
    public PSSysMsgTargetDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysMsgTargetDTO pssyssfpluginname(String pSSysSFPluginName) {
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
    public PSSysMsgTargetDTO pssysutildeid(String pSSysUtilDEId) {
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO pssysutildeid(PSSysUtilDTO pSSysUtil) {
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
    public PSSysMsgTargetDTO pssysutildename(String pSSysUtilDEName) {
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="targetpsdefid")
    public void setTargetPSDEFId(String targetPSDEFId) {
        this._set(DTOFIELD_TARGETPSDEFID, targetPSDEFId);
    }

    @JsonIgnore
    public String getTargetPSDEFId() {
        Object objValue = this._get(DTOFIELD_TARGETPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetPSDEFIdDirty() {
        return this._contains(DTOFIELD_TARGETPSDEFID);
    }

    @JsonIgnore
    public void resetTargetPSDEFId() {
        this._reset(DTOFIELD_TARGETPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targetpsdefid(String targetPSDEFId) {
        this.setTargetPSDEFId(targetPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targetpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTargetPSDEFId(null);
            this.setTargetPSDEFName(null);
        } else {
            this.setTargetPSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="targetpsdefname")
    public void setTargetPSDEFName(String targetPSDEFName) {
        this._set(DTOFIELD_TARGETPSDEFNAME, targetPSDEFName);
    }

    @JsonIgnore
    public String getTargetPSDEFName() {
        Object objValue = this._get(DTOFIELD_TARGETPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetPSDEFNameDirty() {
        return this._contains(DTOFIELD_TARGETPSDEFNAME);
    }

    @JsonIgnore
    public void resetTargetPSDEFName() {
        this._reset(DTOFIELD_TARGETPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targetpsdefname(String targetPSDEFName) {
        this.setTargetPSDEFName(targetPSDEFName);
        return this;
    }

    @JsonProperty(value="targettypepsdefid")
    public void setTargetTypePSDEFId(String targetTypePSDEFId) {
        this._set(DTOFIELD_TARGETTYPEPSDEFID, targetTypePSDEFId);
    }

    @JsonIgnore
    public String getTargetTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_TARGETTYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_TARGETTYPEPSDEFID);
    }

    @JsonIgnore
    public void resetTargetTypePSDEFId() {
        this._reset(DTOFIELD_TARGETTYPEPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targettypepsdefid(String targetTypePSDEFId) {
        this.setTargetTypePSDEFId(targetTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targettypepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTargetTypePSDEFId(null);
            this.setTargetTypePSDEFName(null);
        } else {
            this.setTargetTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="targettypepsdefname")
    public void setTargetTypePSDEFName(String targetTypePSDEFName) {
        this._set(DTOFIELD_TARGETTYPEPSDEFNAME, targetTypePSDEFName);
    }

    @JsonIgnore
    public String getTargetTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_TARGETTYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_TARGETTYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTargetTypePSDEFName() {
        this._reset(DTOFIELD_TARGETTYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO targettypepsdefname(String targetTypePSDEFName) {
        this.setTargetTypePSDEFName(targetTypePSDEFName);
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
    public PSSysMsgTargetDTO updatedate(Timestamp updateDate) {
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
    public PSSysMsgTargetDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="user2psdefid")
    public void setUser2PSDEFId(String user2PSDEFId) {
        this._set(DTOFIELD_USER2PSDEFID, user2PSDEFId);
    }

    @JsonIgnore
    public String getUser2PSDEFId() {
        Object objValue = this._get(DTOFIELD_USER2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEFIdDirty() {
        return this._contains(DTOFIELD_USER2PSDEFID);
    }

    @JsonIgnore
    public void resetUser2PSDEFId() {
        this._reset(DTOFIELD_USER2PSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO user2psdefid(String user2PSDEFId) {
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO user2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUser2PSDEFId(null);
            this.setUser2PSDEFName(null);
        } else {
            this.setUser2PSDEFId(pSDEField.getPSDEFieldId());
            this.setUser2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="user2psdefname")
    public void setUser2PSDEFName(String user2PSDEFName) {
        this._set(DTOFIELD_USER2PSDEFNAME, user2PSDEFName);
    }

    @JsonIgnore
    public String getUser2PSDEFName() {
        Object objValue = this._get(DTOFIELD_USER2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEFNameDirty() {
        return this._contains(DTOFIELD_USER2PSDEFNAME);
    }

    @JsonIgnore
    public void resetUser2PSDEFName() {
        this._reset(DTOFIELD_USER2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO user2psdefname(String user2PSDEFName) {
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysMsgTargetDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userpsdefid")
    public void setUserPSDEFId(String userPSDEFId) {
        this._set(DTOFIELD_USERPSDEFID, userPSDEFId);
    }

    @JsonIgnore
    public String getUserPSDEFId() {
        Object objValue = this._get(DTOFIELD_USERPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEFIdDirty() {
        return this._contains(DTOFIELD_USERPSDEFID);
    }

    @JsonIgnore
    public void resetUserPSDEFId() {
        this._reset(DTOFIELD_USERPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO userpsdefid(String userPSDEFId) {
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO userpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUserPSDEFId(null);
            this.setUserPSDEFName(null);
        } else {
            this.setUserPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="userpsdefname")
    public void setUserPSDEFName(String userPSDEFName) {
        this._set(DTOFIELD_USERPSDEFNAME, userPSDEFName);
    }

    @JsonIgnore
    public String getUserPSDEFName() {
        Object objValue = this._get(DTOFIELD_USERPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEFNameDirty() {
        return this._contains(DTOFIELD_USERPSDEFNAME);
    }

    @JsonIgnore
    public void resetUserPSDEFName() {
        this._reset(DTOFIELD_USERPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO userpsdefname(String userPSDEFName) {
        this.setUserPSDEFName(userPSDEFName);
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
    public PSSysMsgTargetDTO usertag(String userTag) {
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
    public PSSysMsgTargetDTO usertag2(String userTag2) {
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
    public PSSysMsgTargetDTO usertag3(String userTag3) {
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
    public PSSysMsgTargetDTO usertag4(String userTag4) {
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
    public PSSysMsgTargetDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTargetDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysMsgTargetId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysMsgTargetId(strValue);
    }

    @JsonIgnore
    public PSSysMsgTargetDTO id(String strValue) {
        this.setPSSysMsgTargetId(strValue);
        return this;
    }
}
