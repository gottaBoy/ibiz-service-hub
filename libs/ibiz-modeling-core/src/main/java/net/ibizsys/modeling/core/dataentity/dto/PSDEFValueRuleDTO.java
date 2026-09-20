package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFValueRuleDTO
extends PSModelDTOBase {
    public static final String FIELD_CHECKDEFAULT = "CHECKDEFAULT";
    protected static final String DTOFIELD_CHECKDEFAULT = "checkdefault";
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
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEFVALUERULEID = "PSDEFVALUERULEID";
    protected static final String DTOFIELD_PSDEFVALUERULEID = "psdefvalueruleid";
    public static final String FIELD_PSDEFVALUERULENAME = "PSDEFVALUERULENAME";
    protected static final String DTOFIELD_PSDEFVALUERULENAME = "psdefvaluerulename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_RIPSLANRESID = "RIPSLANRESID";
    protected static final String DTOFIELD_RIPSLANRESID = "ripslanresid";
    public static final String FIELD_RIPSLANRESNAME = "RIPSLANRESNAME";
    protected static final String DTOFIELD_RIPSLANRESNAME = "ripslanresname";
    public static final String FIELD_RULEHOLDER = "RULEHOLDER";
    protected static final String DTOFIELD_RULEHOLDER = "ruleholder";
    public static final String FIELD_RULEINFO = "RULEINFO";
    protected static final String DTOFIELD_RULEINFO = "ruleinfo";
    public static final String FIELD_RULETAG = "RULETAG";
    protected static final String DTOFIELD_RULETAG = "ruletag";
    public static final String FIELD_RULETAG2 = "RULETAG2";
    protected static final String DTOFIELD_RULETAG2 = "ruletag2";
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
    public static final String FIELD_VRMODE = "VRMODE";
    protected static final String DTOFIELD_VRMODE = "vrmode";
    public static final String FIELD_VRTYPE = "VRTYPE";
    protected static final String DTOFIELD_VRTYPE = "vrtype";
    public static final String DTOFIELD_PSDEFVRCONDS = "psdefvrconds";

    @JsonProperty(value="checkdefault")
    public void setCheckDefault(Integer checkDefault) {
        this._set(DTOFIELD_CHECKDEFAULT, checkDefault);
    }

    @JsonIgnore
    public Integer getCheckDefault() {
        Object objValue = this._get(DTOFIELD_CHECKDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckDefaultDirty() {
        return this._contains(DTOFIELD_CHECKDEFAULT);
    }

    @JsonIgnore
    public void resetCheckDefault() {
        this._reset(DTOFIELD_CHECKDEFAULT);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO checkdefault(Integer checkDefault) {
        this.setCheckDefault(checkDefault);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO checkdefault(Boolean checkDefault) {
        if (checkDefault == null) {
            this.setCheckDefault(null);
        } else {
            this.setCheckDefault(checkDefault != false ? 1 : 0);
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
    public PSDEFValueRuleDTO codename(String codeName) {
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
    public PSDEFValueRuleDTO createdate(Timestamp createDate) {
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
    public PSDEFValueRuleDTO createman(String createMan) {
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
    public PSDEFValueRuleDTO customcode(String customCode) {
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
    public PSDEFValueRuleDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO custommode(PSModelEnums.ScriptMode customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
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
    public PSDEFValueRuleDTO memo(String memo) {
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
    public PSDEFValueRuleDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    @JsonProperty(value="psdefvalueruleid")
    public void setPSDEFValueRuleId(String pSDEFValueRuleId) {
        this._set(DTOFIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }

    @JsonIgnore
    public String getPSDEFValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleId() {
        this._reset(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdefvalueruleid(String pSDEFValueRuleId) {
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    @JsonProperty(value="psdefvaluerulename")
    public void setPSDEFValueRuleName(String pSDEFValueRuleName) {
        this._set(DTOFIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }

    @JsonIgnore
    public String getPSDEFValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleName() {
        this._reset(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdefvaluerulename(String pSDEFValueRuleName) {
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFValueRuleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFValueRuleName(strName);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO name(String strName) {
        this.setPSDEFValueRuleName(strName);
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
    public PSDEFValueRuleDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFValueRuleDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEFValueRuleDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEFValueRuleDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEFValueRuleDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEFValueRuleDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDEFValueRuleDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEFValueRuleDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="ripslanresid")
    public void setRIPSLanResId(String rIPSLanResId) {
        this._set(DTOFIELD_RIPSLANRESID, rIPSLanResId);
    }

    @JsonIgnore
    public String getRIPSLanResId() {
        Object objValue = this._get(DTOFIELD_RIPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRIPSLanResIdDirty() {
        return this._contains(DTOFIELD_RIPSLANRESID);
    }

    @JsonIgnore
    public void resetRIPSLanResId() {
        this._reset(DTOFIELD_RIPSLANRESID);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ripslanresid(String rIPSLanResId) {
        this.setRIPSLanResId(rIPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ripslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setRIPSLanResId(null);
            this.setRIPSLanResName(null);
        } else {
            this.setRIPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setRIPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="ripslanresname")
    public void setRIPSLanResName(String rIPSLanResName) {
        this._set(DTOFIELD_RIPSLANRESNAME, rIPSLanResName);
    }

    @JsonIgnore
    public String getRIPSLanResName() {
        Object objValue = this._get(DTOFIELD_RIPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRIPSLanResNameDirty() {
        return this._contains(DTOFIELD_RIPSLANRESNAME);
    }

    @JsonIgnore
    public void resetRIPSLanResName() {
        this._reset(DTOFIELD_RIPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ripslanresname(String rIPSLanResName) {
        this.setRIPSLanResName(rIPSLanResName);
        return this;
    }

    @JsonProperty(value="ruleholder")
    public void setRuleHolder(Integer ruleHolder) {
        this._set(DTOFIELD_RULEHOLDER, ruleHolder);
    }

    @JsonIgnore
    public Integer getRuleHolder() {
        Object objValue = this._get(DTOFIELD_RULEHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRuleHolderDirty() {
        return this._contains(DTOFIELD_RULEHOLDER);
    }

    @JsonIgnore
    public void resetRuleHolder() {
        this._reset(DTOFIELD_RULEHOLDER);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ruleholder(Integer ruleHolder) {
        this.setRuleHolder(ruleHolder);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ruleholder(PSModelEnums.DELogicHolder ruleHolder) {
        if (ruleHolder == null) {
            this.setRuleHolder(null);
        } else {
            this.setRuleHolder(ruleHolder.value);
        }
        return this;
    }

    @JsonProperty(value="ruleinfo")
    public void setRuleInfo(String ruleInfo) {
        this._set(DTOFIELD_RULEINFO, ruleInfo);
    }

    @JsonIgnore
    public String getRuleInfo() {
        Object objValue = this._get(DTOFIELD_RULEINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRuleInfoDirty() {
        return this._contains(DTOFIELD_RULEINFO);
    }

    @JsonIgnore
    public void resetRuleInfo() {
        this._reset(DTOFIELD_RULEINFO);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ruleinfo(String ruleInfo) {
        this.setRuleInfo(ruleInfo);
        return this;
    }

    @JsonProperty(value="ruletag")
    public void setRuleTag(String ruleTag) {
        this._set(DTOFIELD_RULETAG, ruleTag);
    }

    @JsonIgnore
    public String getRuleTag() {
        Object objValue = this._get(DTOFIELD_RULETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRuleTagDirty() {
        return this._contains(DTOFIELD_RULETAG);
    }

    @JsonIgnore
    public void resetRuleTag() {
        this._reset(DTOFIELD_RULETAG);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ruletag(String ruleTag) {
        this.setRuleTag(ruleTag);
        return this;
    }

    @JsonProperty(value="ruletag2")
    public void setRuleTag2(String ruleTag2) {
        this._set(DTOFIELD_RULETAG2, ruleTag2);
    }

    @JsonIgnore
    public String getRuleTag2() {
        Object objValue = this._get(DTOFIELD_RULETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRuleTag2Dirty() {
        return this._contains(DTOFIELD_RULETAG2);
    }

    @JsonIgnore
    public void resetRuleTag2() {
        this._reset(DTOFIELD_RULETAG2);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO ruletag2(String ruleTag2) {
        this.setRuleTag2(ruleTag2);
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
    public PSDEFValueRuleDTO updatedate(Timestamp updateDate) {
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
    public PSDEFValueRuleDTO updateman(String updateMan) {
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
    public PSDEFValueRuleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFValueRuleDTO usertag(String userTag) {
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
    public PSDEFValueRuleDTO usertag2(String userTag2) {
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
    public PSDEFValueRuleDTO usertag3(String userTag3) {
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
    public PSDEFValueRuleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="vrmode")
    public void setVRMode(String vRMode) {
        this._set(DTOFIELD_VRMODE, vRMode);
    }

    @JsonIgnore
    public String getVRMode() {
        Object objValue = this._get(DTOFIELD_VRMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVRModeDirty() {
        return this._contains(DTOFIELD_VRMODE);
    }

    @JsonIgnore
    public void resetVRMode() {
        this._reset(DTOFIELD_VRMODE);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO vrmode(String vRMode) {
        this.setVRMode(vRMode);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO vrmode(PSModelEnums.DEFVRMode vRMode) {
        if (vRMode == null) {
            this.setVRMode(null);
        } else {
            this.setVRMode(vRMode.value);
        }
        return this;
    }

    @JsonProperty(value="vrtype")
    public void setVRType(String vRType) {
        this._set(DTOFIELD_VRTYPE, vRType);
    }

    @JsonIgnore
    public String getVRType() {
        Object objValue = this._get(DTOFIELD_VRTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVRTypeDirty() {
        return this._contains(DTOFIELD_VRTYPE);
    }

    @JsonIgnore
    public void resetVRType() {
        this._reset(DTOFIELD_VRTYPE);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO vrtype(String vRType) {
        this.setVRType(vRType);
        return this;
    }

    @JsonIgnore
    public PSDEFValueRuleDTO vrtype(PSModelEnums.DEFValueRuleType vRType) {
        if (vRType == null) {
            this.setVRType(null);
        } else {
            this.setVRType(vRType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFValueRuleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFValueRuleId(strValue);
    }

    @JsonIgnore
    public PSDEFValueRuleDTO id(String strValue) {
        this.setPSDEFValueRuleId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEFVRCondDTO> getPSDEFVRConds() {
        Object list = this._get(DTOFIELD_PSDEFVRCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefvrconds")
    public void setPSDEFVRConds(List<PSDEFVRCondDTO> psdefvrconds) {
        this._set(DTOFIELD_PSDEFVRCONDS, psdefvrconds);
    }

    @JsonIgnore
    public List<PSDEFVRCondDTO> getPSDEFVRCondsIf() {
        Object list = this._get(DTOFIELD_PSDEFVRCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFVRCONDS, list);
        }
        return (List) list;
    }
}
