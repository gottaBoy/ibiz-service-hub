package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSequenceDTO
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
    public static final String FIELD_EXTFORMATPARAMS = "EXTFORMATPARAMS";
    protected static final String DTOFIELD_EXTFORMATPARAMS = "extformatparams";
    public static final String FIELD_KEYPSDEFID = "KEYPSDEFID";
    protected static final String DTOFIELD_KEYPSDEFID = "keypsdefid";
    public static final String FIELD_KEYPSDEFNAME = "KEYPSDEFNAME";
    protected static final String DTOFIELD_KEYPSDEFNAME = "keypsdefname";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
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
    public static final String FIELD_PSSYSSEQUENCEID = "PSSYSSEQUENCEID";
    protected static final String DTOFIELD_PSSYSSEQUENCEID = "pssyssequenceid";
    public static final String FIELD_PSSYSSEQUENCENAME = "PSSYSSEQUENCENAME";
    protected static final String DTOFIELD_PSSYSSEQUENCENAME = "pssyssequencename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_SEQUENCEFORMAT = "SEQUENCEFORMAT";
    protected static final String DTOFIELD_SEQUENCEFORMAT = "sequenceformat";
    public static final String FIELD_SEQUENCEPARAMS = "SEQUENCEPARAMS";
    protected static final String DTOFIELD_SEQUENCEPARAMS = "sequenceparams";
    public static final String FIELD_SEQUENCETAG = "SEQUENCETAG";
    protected static final String DTOFIELD_SEQUENCETAG = "sequencetag";
    public static final String FIELD_SEQUENCETAG2 = "SEQUENCETAG2";
    protected static final String DTOFIELD_SEQUENCETAG2 = "sequencetag2";
    public static final String FIELD_SEQUENCETYPE = "SEQUENCETYPE";
    protected static final String DTOFIELD_SEQUENCETYPE = "sequencetype";
    public static final String FIELD_TIMEFORMAT = "TIMEFORMAT";
    protected static final String DTOFIELD_TIMEFORMAT = "timeformat";
    public static final String FIELD_TIMEPSDEFID = "TIMEPSDEFID";
    protected static final String DTOFIELD_TIMEPSDEFID = "timepsdefid";
    public static final String FIELD_TIMEPSDEFNAME = "TIMEPSDEFNAME";
    protected static final String DTOFIELD_TIMEPSDEFNAME = "timepsdefname";
    public static final String FIELD_TYPEPSDEFID = "TYPEPSDEFID";
    protected static final String DTOFIELD_TYPEPSDEFID = "typepsdefid";
    public static final String FIELD_TYPEPSDEFNAME = "TYPEPSDEFNAME";
    protected static final String DTOFIELD_TYPEPSDEFNAME = "typepsdefname";
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
    public static final String FIELD_VALUEPSDEFID = "VALUEPSDEFID";
    protected static final String DTOFIELD_VALUEPSDEFID = "valuepsdefid";
    public static final String FIELD_VALUEPSDEFNAME = "VALUEPSDEFNAME";
    protected static final String DTOFIELD_VALUEPSDEFNAME = "valuepsdefname";

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
    public PSSysSequenceDTO codename(String codeName) {
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
    public PSSysSequenceDTO createdate(Timestamp createDate) {
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
    public PSSysSequenceDTO createman(String createMan) {
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
    public PSSysSequenceDTO customcode(String customCode) {
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
    public PSSysSequenceDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="extformatparams")
    public void setExtFormatParams(String extFormatParams) {
        this._set(DTOFIELD_EXTFORMATPARAMS, extFormatParams);
    }

    @JsonIgnore
    public String getExtFormatParams() {
        Object objValue = this._get(DTOFIELD_EXTFORMATPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtFormatParamsDirty() {
        return this._contains(DTOFIELD_EXTFORMATPARAMS);
    }

    @JsonIgnore
    public void resetExtFormatParams() {
        this._reset(DTOFIELD_EXTFORMATPARAMS);
    }

    @JsonIgnore
    public PSSysSequenceDTO extformatparams(String extFormatParams) {
        this.setExtFormatParams(extFormatParams);
        return this;
    }

    @JsonProperty(value="keypsdefid")
    public void setKeyPSDEFId(String keyPSDEFId) {
        this._set(DTOFIELD_KEYPSDEFID, keyPSDEFId);
    }

    @JsonIgnore
    public String getKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public void resetKeyPSDEFId() {
        this._reset(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public PSSysSequenceDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO keypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        } else {
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="keypsdefname")
    public void setKeyPSDEFName(String keyPSDEFName) {
        this._set(DTOFIELD_KEYPSDEFNAME, keyPSDEFName);
    }

    @JsonIgnore
    public String getKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetKeyPSDEFName() {
        this._reset(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public PSSysSequenceDTO keypsdefname(String keyPSDEFName) {
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(Integer maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public Integer getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxValueDirty() {
        return this._contains(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public void resetMaxValue() {
        this._reset(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public PSSysSequenceDTO maxvalue(Integer maxValue) {
        this.setMaxValue(maxValue);
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
    public PSSysSequenceDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(Integer minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public Integer getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinValueDirty() {
        return this._contains(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public void resetMinValue() {
        this._reset(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public PSSysSequenceDTO minvalue(Integer minValue) {
        this.setMinValue(minValue);
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
    public PSSysSequenceDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysSequenceDTO psdename(String pSDEName) {
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
    public PSSysSequenceDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysSequenceDTO psmodulename(String pSModuleName) {
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
    public PSSysSequenceDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysSequenceDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyssequenceid")
    public void setPSSysSequenceId(String pSSysSequenceId) {
        this._set(DTOFIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }

    @JsonIgnore
    public String getPSSysSequenceId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public void resetPSSysSequenceId() {
        this._reset(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public PSSysSequenceDTO pssyssequenceid(String pSSysSequenceId) {
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    @JsonProperty(value="pssyssequencename")
    public void setPSSysSequenceName(String pSSysSequenceName) {
        this._set(DTOFIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }

    @JsonIgnore
    public String getPSSysSequenceName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public void resetPSSysSequenceName() {
        this._reset(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public PSSysSequenceDTO pssyssequencename(String pSSysSequenceName) {
        this.setPSSysSequenceName(pSSysSequenceName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSequenceName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSequenceName(strName);
    }

    @JsonIgnore
    public PSSysSequenceDTO name(String strName) {
        this.setPSSysSequenceName(strName);
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
    public PSSysSequenceDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysSequenceDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="sequenceformat")
    public void setSequenceFormat(String sequenceFormat) {
        this._set(DTOFIELD_SEQUENCEFORMAT, sequenceFormat);
    }

    @JsonIgnore
    public String getSequenceFormat() {
        Object objValue = this._get(DTOFIELD_SEQUENCEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceFormatDirty() {
        return this._contains(DTOFIELD_SEQUENCEFORMAT);
    }

    @JsonIgnore
    public void resetSequenceFormat() {
        this._reset(DTOFIELD_SEQUENCEFORMAT);
    }

    @JsonIgnore
    public PSSysSequenceDTO sequenceformat(String sequenceFormat) {
        this.setSequenceFormat(sequenceFormat);
        return this;
    }

    @JsonProperty(value="sequenceparams")
    public void setSequenceParams(String sequenceParams) {
        this._set(DTOFIELD_SEQUENCEPARAMS, sequenceParams);
    }

    @JsonIgnore
    public String getSequenceParams() {
        Object objValue = this._get(DTOFIELD_SEQUENCEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceParamsDirty() {
        return this._contains(DTOFIELD_SEQUENCEPARAMS);
    }

    @JsonIgnore
    public void resetSequenceParams() {
        this._reset(DTOFIELD_SEQUENCEPARAMS);
    }

    @JsonIgnore
    public PSSysSequenceDTO sequenceparams(String sequenceParams) {
        this.setSequenceParams(sequenceParams);
        return this;
    }

    @JsonProperty(value="sequencetag")
    public void setSequenceTag(String sequenceTag) {
        this._set(DTOFIELD_SEQUENCETAG, sequenceTag);
    }

    @JsonIgnore
    public String getSequenceTag() {
        Object objValue = this._get(DTOFIELD_SEQUENCETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceTagDirty() {
        return this._contains(DTOFIELD_SEQUENCETAG);
    }

    @JsonIgnore
    public void resetSequenceTag() {
        this._reset(DTOFIELD_SEQUENCETAG);
    }

    @JsonIgnore
    public PSSysSequenceDTO sequencetag(String sequenceTag) {
        this.setSequenceTag(sequenceTag);
        return this;
    }

    @JsonProperty(value="sequencetag2")
    public void setSequenceTag2(String sequenceTag2) {
        this._set(DTOFIELD_SEQUENCETAG2, sequenceTag2);
    }

    @JsonIgnore
    public String getSequenceTag2() {
        Object objValue = this._get(DTOFIELD_SEQUENCETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceTag2Dirty() {
        return this._contains(DTOFIELD_SEQUENCETAG2);
    }

    @JsonIgnore
    public void resetSequenceTag2() {
        this._reset(DTOFIELD_SEQUENCETAG2);
    }

    @JsonIgnore
    public PSSysSequenceDTO sequencetag2(String sequenceTag2) {
        this.setSequenceTag2(sequenceTag2);
        return this;
    }

    @JsonProperty(value="sequencetype")
    public void setSequenceType(String sequenceType) {
        this._set(DTOFIELD_SEQUENCETYPE, sequenceType);
    }

    @JsonIgnore
    public String getSequenceType() {
        Object objValue = this._get(DTOFIELD_SEQUENCETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSequenceTypeDirty() {
        return this._contains(DTOFIELD_SEQUENCETYPE);
    }

    @JsonIgnore
    public void resetSequenceType() {
        this._reset(DTOFIELD_SEQUENCETYPE);
    }

    @JsonIgnore
    public PSSysSequenceDTO sequencetype(String sequenceType) {
        this.setSequenceType(sequenceType);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO sequencetype(PSModelEnums.SequenceType sequenceType) {
        if (sequenceType == null) {
            this.setSequenceType(null);
        } else {
            this.setSequenceType(sequenceType.value);
        }
        return this;
    }

    @JsonProperty(value="timeformat")
    public void setTimeFormat(String timeFormat) {
        this._set(DTOFIELD_TIMEFORMAT, timeFormat);
    }

    @JsonIgnore
    public String getTimeFormat() {
        Object objValue = this._get(DTOFIELD_TIMEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimeFormatDirty() {
        return this._contains(DTOFIELD_TIMEFORMAT);
    }

    @JsonIgnore
    public void resetTimeFormat() {
        this._reset(DTOFIELD_TIMEFORMAT);
    }

    @JsonIgnore
    public PSSysSequenceDTO timeformat(String timeFormat) {
        this.setTimeFormat(timeFormat);
        return this;
    }

    @JsonProperty(value="timepsdefid")
    public void setTimePSDEFId(String timePSDEFId) {
        this._set(DTOFIELD_TIMEPSDEFID, timePSDEFId);
    }

    @JsonIgnore
    public String getTimePSDEFId() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFIdDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public void resetTimePSDEFId() {
        this._reset(DTOFIELD_TIMEPSDEFID);
    }

    @JsonIgnore
    public PSSysSequenceDTO timepsdefid(String timePSDEFId) {
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO timepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        } else {
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="timepsdefname")
    public void setTimePSDEFName(String timePSDEFName) {
        this._set(DTOFIELD_TIMEPSDEFNAME, timePSDEFName);
    }

    @JsonIgnore
    public String getTimePSDEFName() {
        Object objValue = this._get(DTOFIELD_TIMEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimePSDEFNameDirty() {
        return this._contains(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTimePSDEFName() {
        this._reset(DTOFIELD_TIMEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysSequenceDTO timepsdefname(String timePSDEFName) {
        this.setTimePSDEFName(timePSDEFName);
        return this;
    }

    @JsonProperty(value="typepsdefid")
    public void setTypePSDEFId(String typePSDEFId) {
        this._set(DTOFIELD_TYPEPSDEFID, typePSDEFId);
    }

    @JsonIgnore
    public String getTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_TYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_TYPEPSDEFID);
    }

    @JsonIgnore
    public void resetTypePSDEFId() {
        this._reset(DTOFIELD_TYPEPSDEFID);
    }

    @JsonIgnore
    public PSSysSequenceDTO typepsdefid(String typePSDEFId) {
        this.setTypePSDEFId(typePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO typepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTypePSDEFId(null);
            this.setTypePSDEFName(null);
        } else {
            this.setTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="typepsdefname")
    public void setTypePSDEFName(String typePSDEFName) {
        this._set(DTOFIELD_TYPEPSDEFNAME, typePSDEFName);
    }

    @JsonIgnore
    public String getTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_TYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_TYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTypePSDEFName() {
        this._reset(DTOFIELD_TYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysSequenceDTO typepsdefname(String typePSDEFName) {
        this.setTypePSDEFName(typePSDEFName);
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
    public PSSysSequenceDTO updatedate(Timestamp updateDate) {
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
    public PSSysSequenceDTO updateman(String updateMan) {
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
    public PSSysSequenceDTO user2psdefid(String user2PSDEFId) {
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO user2psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysSequenceDTO user2psdefname(String user2PSDEFName) {
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
    public PSSysSequenceDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSequenceDTO userpsdefid(String userPSDEFId) {
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO userpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysSequenceDTO userpsdefname(String userPSDEFName) {
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
    public PSSysSequenceDTO usertag(String userTag) {
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
    public PSSysSequenceDTO usertag2(String userTag2) {
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
    public PSSysSequenceDTO usertag3(String userTag3) {
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
    public PSSysSequenceDTO usertag4(String userTag4) {
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
    public PSSysSequenceDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valuepsdefid")
    public void setValuePSDEFId(String valuePSDEFId) {
        this._set(DTOFIELD_VALUEPSDEFID, valuePSDEFId);
    }

    @JsonIgnore
    public String getValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public void resetValuePSDEFId() {
        this._reset(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public PSSysSequenceDTO valuepsdefid(String valuePSDEFId) {
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSequenceDTO valuepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        } else {
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="valuepsdefname")
    public void setValuePSDEFName(String valuePSDEFName) {
        this._set(DTOFIELD_VALUEPSDEFNAME, valuePSDEFName);
    }

    @JsonIgnore
    public String getValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetValuePSDEFName() {
        this._reset(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysSequenceDTO valuepsdefname(String valuePSDEFName) {
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSequenceId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSequenceId(strValue);
    }

    @JsonIgnore
    public PSSysSequenceDTO id(String strValue) {
        this.setPSSysSequenceId(strValue);
        return this;
    }
}
