package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBVFDTO
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
    public static final String FIELD_INPUTSTDDATATYPE = "INPUTSTDDATATYPE";
    protected static final String DTOFIELD_INPUTSTDDATATYPE = "inputstddatatype";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_OUTPUTSTDDATATYPE = "OUTPUTSTDDATATYPE";
    protected static final String DTOFIELD_OUTPUTSTDDATATYPE = "outputstddatatype";
    public static final String FIELD_OUTPUTVALUEFORMAT = "OUTPUTVALUEFORMAT";
    protected static final String DTOFIELD_OUTPUTVALUEFORMAT = "outputvalueformat";
    public static final String FIELD_PSDBVFID = "PSDBVFID";
    protected static final String DTOFIELD_PSDBVFID = "psdbvfid";
    public static final String FIELD_PSDBVFNAME = "PSDBVFNAME";
    protected static final String DTOFIELD_PSDBVFNAME = "psdbvfname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDBVFID = "PSSYSDBVFID";
    protected static final String DTOFIELD_PSSYSDBVFID = "pssysdbvfid";
    public static final String FIELD_PSSYSDBVFNAME = "PSSYSDBVFNAME";
    protected static final String DTOFIELD_PSSYSDBVFNAME = "pssysdbvfname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
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
    public static final String FIELD_UXCODENAME = "UXCODENAME";
    protected static final String DTOFIELD_UXCODENAME = "uxcodename";
    public static final String FIELD_VFTAG = "VFTAG";
    protected static final String DTOFIELD_VFTAG = "vftag";
    public static final String FIELD_VFTAG2 = "VFTAG2";
    protected static final String DTOFIELD_VFTAG2 = "vftag2";
    public static final String FIELD_VFTYPE = "VFTYPE";
    protected static final String DTOFIELD_VFTYPE = "vftype";

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
    public PSSysDBVFDTO codename(String codeName) {
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
    public PSSysDBVFDTO createdate(Timestamp createDate) {
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
    public PSSysDBVFDTO createman(String createMan) {
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
    public PSSysDBVFDTO customcode(String customCode) {
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
    public PSSysDBVFDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="inputstddatatype")
    public void setInputStdDataType(Integer inputStdDataType) {
        this._set(DTOFIELD_INPUTSTDDATATYPE, inputStdDataType);
    }

    @JsonIgnore
    public Integer getInputStdDataType() {
        Object objValue = this._get(DTOFIELD_INPUTSTDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInputStdDataTypeDirty() {
        return this._contains(DTOFIELD_INPUTSTDDATATYPE);
    }

    @JsonIgnore
    public void resetInputStdDataType() {
        this._reset(DTOFIELD_INPUTSTDDATATYPE);
    }

    @JsonIgnore
    public PSSysDBVFDTO inputstddatatype(Integer inputStdDataType) {
        this.setInputStdDataType(inputStdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO inputstddatatype(PSModelEnums.StdDataType inputStdDataType) {
        if (inputStdDataType == null) {
            this.setInputStdDataType(null);
        } else {
            this.setInputStdDataType(inputStdDataType.value);
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
    public PSSysDBVFDTO logicname(String logicName) {
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
    public PSSysDBVFDTO memo(String memo) {
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
    public PSSysDBVFDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="outputstddatatype")
    public void setOutputStdDataType(Integer outputStdDataType) {
        this._set(DTOFIELD_OUTPUTSTDDATATYPE, outputStdDataType);
    }

    @JsonIgnore
    public Integer getOutputStdDataType() {
        Object objValue = this._get(DTOFIELD_OUTPUTSTDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOutputStdDataTypeDirty() {
        return this._contains(DTOFIELD_OUTPUTSTDDATATYPE);
    }

    @JsonIgnore
    public void resetOutputStdDataType() {
        this._reset(DTOFIELD_OUTPUTSTDDATATYPE);
    }

    @JsonIgnore
    public PSSysDBVFDTO outputstddatatype(Integer outputStdDataType) {
        this.setOutputStdDataType(outputStdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO outputstddatatype(PSModelEnums.StdDataType outputStdDataType) {
        if (outputStdDataType == null) {
            this.setOutputStdDataType(null);
        } else {
            this.setOutputStdDataType(outputStdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="outputvalueformat")
    public void setOutputValueFormat(String outputValueFormat) {
        this._set(DTOFIELD_OUTPUTVALUEFORMAT, outputValueFormat);
    }

    @JsonIgnore
    public String getOutputValueFormat() {
        Object objValue = this._get(DTOFIELD_OUTPUTVALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutputValueFormatDirty() {
        return this._contains(DTOFIELD_OUTPUTVALUEFORMAT);
    }

    @JsonIgnore
    public void resetOutputValueFormat() {
        this._reset(DTOFIELD_OUTPUTVALUEFORMAT);
    }

    @JsonIgnore
    public PSSysDBVFDTO outputvalueformat(String outputValueFormat) {
        this.setOutputValueFormat(outputValueFormat);
        return this;
    }

    @JsonProperty(value="psdbvfid")
    public void setPSDBVFId(String pSDBVFId) {
        this._set(DTOFIELD_PSDBVFID, pSDBVFId);
    }

    @JsonIgnore
    public String getPSDBVFId() {
        Object objValue = this._get(DTOFIELD_PSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBVFIdDirty() {
        return this._contains(DTOFIELD_PSDBVFID);
    }

    @JsonIgnore
    public void resetPSDBVFId() {
        this._reset(DTOFIELD_PSDBVFID);
    }

    @JsonIgnore
    public PSSysDBVFDTO psdbvfid(String pSDBVFId) {
        this.setPSDBVFId(pSDBVFId);
        return this;
    }

    @JsonProperty(value="psdbvfname")
    public void setPSDBVFName(String pSDBVFName) {
        this._set(DTOFIELD_PSDBVFNAME, pSDBVFName);
    }

    @JsonIgnore
    public String getPSDBVFName() {
        Object objValue = this._get(DTOFIELD_PSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBVFNameDirty() {
        return this._contains(DTOFIELD_PSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSDBVFName() {
        this._reset(DTOFIELD_PSDBVFNAME);
    }

    @JsonIgnore
    public PSSysDBVFDTO psdbvfname(String pSDBVFName) {
        this.setPSDBVFName(pSDBVFName);
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
    public PSSysDBVFDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysDBVFDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysdbvfid")
    public void setPSSysDBVFId(String pSSysDBVFId) {
        this._set(DTOFIELD_PSSYSDBVFID, pSSysDBVFId);
    }

    @JsonIgnore
    public String getPSSysDBVFId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public void resetPSSysDBVFId() {
        this._reset(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public PSSysDBVFDTO pssysdbvfid(String pSSysDBVFId) {
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    @JsonProperty(value="pssysdbvfname")
    public void setPSSysDBVFName(String pSSysDBVFName) {
        this._set(DTOFIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }

    @JsonIgnore
    public String getPSSysDBVFName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFName() {
        this._reset(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public PSSysDBVFDTO pssysdbvfname(String pSSysDBVFName) {
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBVFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBVFName(strName);
    }

    @JsonIgnore
    public PSSysDBVFDTO name(String strName) {
        this.setPSSysDBVFName(strName);
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
    public PSSysDBVFDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysDBVFDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSSysDBVFDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysDBVFDTO pssyssfpluginname(String pSSysSFPluginName) {
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
    public PSSysDBVFDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBVFDTO updateman(String updateMan) {
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
    public PSSysDBVFDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysDBVFDTO usertag(String userTag) {
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
    public PSSysDBVFDTO usertag2(String userTag2) {
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
    public PSSysDBVFDTO usertag3(String userTag3) {
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
    public PSSysDBVFDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="uxcodename")
    public void setUXCodeName(String uXCodeName) {
        this._set(DTOFIELD_UXCODENAME, uXCodeName);
    }

    @JsonIgnore
    public String getUXCodeName() {
        Object objValue = this._get(DTOFIELD_UXCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUXCodeNameDirty() {
        return this._contains(DTOFIELD_UXCODENAME);
    }

    @JsonIgnore
    public void resetUXCodeName() {
        this._reset(DTOFIELD_UXCODENAME);
    }

    @JsonIgnore
    public PSSysDBVFDTO uxcodename(String uXCodeName) {
        this.setUXCodeName(uXCodeName);
        return this;
    }

    @JsonProperty(value="vftag")
    public void setVFTag(String vFTag) {
        this._set(DTOFIELD_VFTAG, vFTag);
    }

    @JsonIgnore
    public String getVFTag() {
        Object objValue = this._get(DTOFIELD_VFTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVFTagDirty() {
        return this._contains(DTOFIELD_VFTAG);
    }

    @JsonIgnore
    public void resetVFTag() {
        this._reset(DTOFIELD_VFTAG);
    }

    @JsonIgnore
    public PSSysDBVFDTO vftag(String vFTag) {
        this.setVFTag(vFTag);
        return this;
    }

    @JsonProperty(value="vftag2")
    public void setVFTag2(String vFTag2) {
        this._set(DTOFIELD_VFTAG2, vFTag2);
    }

    @JsonIgnore
    public String getVFTag2() {
        Object objValue = this._get(DTOFIELD_VFTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVFTag2Dirty() {
        return this._contains(DTOFIELD_VFTAG2);
    }

    @JsonIgnore
    public void resetVFTag2() {
        this._reset(DTOFIELD_VFTAG2);
    }

    @JsonIgnore
    public PSSysDBVFDTO vftag2(String vFTag2) {
        this.setVFTag2(vFTag2);
        return this;
    }

    @JsonProperty(value="vftype")
    public void setVFType(String vFType) {
        this._set(DTOFIELD_VFTYPE, vFType);
    }

    @JsonIgnore
    public String getVFType() {
        Object objValue = this._get(DTOFIELD_VFTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVFTypeDirty() {
        return this._contains(DTOFIELD_VFTYPE);
    }

    @JsonIgnore
    public void resetVFType() {
        this._reset(DTOFIELD_VFTYPE);
    }

    @JsonIgnore
    public PSSysDBVFDTO vftype(String vFType) {
        this.setVFType(vFType);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFDTO vftype(PSModelEnums.DBValueFuncType vFType) {
        if (vFType == null) {
            this.setVFType(null);
        } else {
            this.setVFType(vFType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBVFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBVFId(strValue);
    }

    @JsonIgnore
    public PSSysDBVFDTO id(String strValue) {
        this.setPSSysDBVFId(strValue);
        return this;
    }
}
