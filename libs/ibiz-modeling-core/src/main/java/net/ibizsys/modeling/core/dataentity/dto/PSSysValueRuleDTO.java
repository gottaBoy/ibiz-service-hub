package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysValueRuleDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMOBJ = "CUSTOMOBJ";
    protected static final String DTOFIELD_CUSTOMOBJ = "customobj";
    public static final String FIELD_CUSTOMPARAMS = "CUSTOMPARAMS";
    protected static final String DTOFIELD_CUSTOMPARAMS = "customparams";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_PSVALUERULEID = "PSVALUERULEID";
    protected static final String DTOFIELD_PSVALUERULEID = "psvalueruleid";
    public static final String FIELD_PSVALUERULENAME = "PSVALUERULENAME";
    protected static final String DTOFIELD_PSVALUERULENAME = "psvaluerulename";
    public static final String FIELD_REGEXPCODE = "REGEXPCODE";
    protected static final String DTOFIELD_REGEXPCODE = "regexpcode";
    public static final String FIELD_REGEXPCODE2 = "REGEXPCODE2";
    protected static final String DTOFIELD_REGEXPCODE2 = "regexpcode2";
    public static final String FIELD_REGEXPCODE3 = "REGEXPCODE3";
    protected static final String DTOFIELD_REGEXPCODE3 = "regexpcode3";
    public static final String FIELD_REGEXPCODE4 = "REGEXPCODE4";
    protected static final String DTOFIELD_REGEXPCODE4 = "regexpcode4";
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
    public static final String FIELD_RULETYPE = "RULETYPE";
    protected static final String DTOFIELD_RULETYPE = "ruletype";
    public static final String FIELD_SCRIPT = "SCRIPT";
    protected static final String DTOFIELD_SCRIPT = "script";
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
    public PSSysValueRuleDTO codename(String codeName) {
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
    public PSSysValueRuleDTO createdate(Timestamp createDate) {
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
    public PSSysValueRuleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customobj")
    public void setCustomObj(String customObj) {
        this._set(DTOFIELD_CUSTOMOBJ, customObj);
    }

    @JsonIgnore
    public String getCustomObj() {
        Object objValue = this._get(DTOFIELD_CUSTOMOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomObjDirty() {
        return this._contains(DTOFIELD_CUSTOMOBJ);
    }

    @JsonIgnore
    public void resetCustomObj() {
        this._reset(DTOFIELD_CUSTOMOBJ);
    }

    @JsonIgnore
    public PSSysValueRuleDTO customobj(String customObj) {
        this.setCustomObj(customObj);
        return this;
    }

    @JsonProperty(value="customparams")
    public void setCustomParams(String customParams) {
        this._set(DTOFIELD_CUSTOMPARAMS, customParams);
    }

    @JsonIgnore
    public String getCustomParams() {
        Object objValue = this._get(DTOFIELD_CUSTOMPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomParamsDirty() {
        return this._contains(DTOFIELD_CUSTOMPARAMS);
    }

    @JsonIgnore
    public void resetCustomParams() {
        this._reset(DTOFIELD_CUSTOMPARAMS);
    }

    @JsonIgnore
    public PSSysValueRuleDTO customparams(String customParams) {
        this.setCustomParams(customParams);
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
    public PSSysValueRuleDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysValueRuleDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysValueRuleDTO psmodulename(String pSModuleName) {
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
    public PSSysValueRuleDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysValueRuleDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSSysValueRuleDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysValueRuleDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSysValueRuleDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysValueRuleDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSSysValueRuleId() {
        this._reset(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public PSSysValueRuleDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonProperty(value="pssysvaluerulename")
    public void setPSSysValueRuleName(String pSSysValueRuleName) {
        this._set(DTOFIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }

    @JsonIgnore
    public String getPSSysValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSSysValueRuleName() {
        this._reset(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public PSSysValueRuleDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysValueRuleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysValueRuleName(strName);
    }

    @JsonIgnore
    public PSSysValueRuleDTO name(String strName) {
        this.setPSSysValueRuleName(strName);
        return this;
    }

    @JsonProperty(value="psvalueruleid")
    public void setPSValueRuleId(String pSValueRuleId) {
        this._set(DTOFIELD_PSVALUERULEID, pSValueRuleId);
    }

    @JsonIgnore
    public String getPSValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSValueRuleId() {
        this._reset(DTOFIELD_PSVALUERULEID);
    }

    @JsonIgnore
    public PSSysValueRuleDTO psvalueruleid(String pSValueRuleId) {
        this.setPSValueRuleId(pSValueRuleId);
        return this;
    }

    @JsonProperty(value="psvaluerulename")
    public void setPSValueRuleName(String pSValueRuleName) {
        this._set(DTOFIELD_PSVALUERULENAME, pSValueRuleName);
    }

    @JsonIgnore
    public String getPSValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSValueRuleName() {
        this._reset(DTOFIELD_PSVALUERULENAME);
    }

    @JsonIgnore
    public PSSysValueRuleDTO psvaluerulename(String pSValueRuleName) {
        this.setPSValueRuleName(pSValueRuleName);
        return this;
    }

    @JsonProperty(value="regexpcode")
    public void setRegExpCode(String regExpCode) {
        this._set(DTOFIELD_REGEXPCODE, regExpCode);
    }

    @JsonIgnore
    public String getRegExpCode() {
        Object objValue = this._get(DTOFIELD_REGEXPCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegExpCodeDirty() {
        return this._contains(DTOFIELD_REGEXPCODE);
    }

    @JsonIgnore
    public void resetRegExpCode() {
        this._reset(DTOFIELD_REGEXPCODE);
    }

    @JsonIgnore
    public PSSysValueRuleDTO regexpcode(String regExpCode) {
        this.setRegExpCode(regExpCode);
        return this;
    }

    @JsonProperty(value="regexpcode2")
    public void setRegExpCode2(String regExpCode2) {
        this._set(DTOFIELD_REGEXPCODE2, regExpCode2);
    }

    @JsonIgnore
    public String getRegExpCode2() {
        Object objValue = this._get(DTOFIELD_REGEXPCODE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegExpCode2Dirty() {
        return this._contains(DTOFIELD_REGEXPCODE2);
    }

    @JsonIgnore
    public void resetRegExpCode2() {
        this._reset(DTOFIELD_REGEXPCODE2);
    }

    @JsonIgnore
    public PSSysValueRuleDTO regexpcode2(String regExpCode2) {
        this.setRegExpCode2(regExpCode2);
        return this;
    }

    @JsonProperty(value="regexpcode3")
    public void setRegExpCode3(String regExpCode3) {
        this._set(DTOFIELD_REGEXPCODE3, regExpCode3);
    }

    @JsonIgnore
    public String getRegExpCode3() {
        Object objValue = this._get(DTOFIELD_REGEXPCODE3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegExpCode3Dirty() {
        return this._contains(DTOFIELD_REGEXPCODE3);
    }

    @JsonIgnore
    public void resetRegExpCode3() {
        this._reset(DTOFIELD_REGEXPCODE3);
    }

    @JsonIgnore
    public PSSysValueRuleDTO regexpcode3(String regExpCode3) {
        this.setRegExpCode3(regExpCode3);
        return this;
    }

    @JsonProperty(value="regexpcode4")
    public void setRegExpCode4(String regExpCode4) {
        this._set(DTOFIELD_REGEXPCODE4, regExpCode4);
    }

    @JsonIgnore
    public String getRegExpCode4() {
        Object objValue = this._get(DTOFIELD_REGEXPCODE4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegExpCode4Dirty() {
        return this._contains(DTOFIELD_REGEXPCODE4);
    }

    @JsonIgnore
    public void resetRegExpCode4() {
        this._reset(DTOFIELD_REGEXPCODE4);
    }

    @JsonIgnore
    public PSSysValueRuleDTO regexpcode4(String regExpCode4) {
        this.setRegExpCode4(regExpCode4);
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
    public PSSysValueRuleDTO ripslanresid(String rIPSLanResId) {
        this.setRIPSLanResId(rIPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO ripslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSSysValueRuleDTO ripslanresname(String rIPSLanResName) {
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
    public PSSysValueRuleDTO ruleholder(Integer ruleHolder) {
        this.setRuleHolder(ruleHolder);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO ruleholder(PSModelEnums.DELogicHolder ruleHolder) {
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
    public PSSysValueRuleDTO ruleinfo(String ruleInfo) {
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
    public PSSysValueRuleDTO ruletag(String ruleTag) {
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
    public PSSysValueRuleDTO ruletag2(String ruleTag2) {
        this.setRuleTag2(ruleTag2);
        return this;
    }

    @JsonProperty(value="ruletype")
    public void setRuleType(String ruleType) {
        this._set(DTOFIELD_RULETYPE, ruleType);
    }

    @JsonIgnore
    public String getRuleType() {
        Object objValue = this._get(DTOFIELD_RULETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRuleTypeDirty() {
        return this._contains(DTOFIELD_RULETYPE);
    }

    @JsonIgnore
    public void resetRuleType() {
        this._reset(DTOFIELD_RULETYPE);
    }

    @JsonIgnore
    public PSSysValueRuleDTO ruletype(String ruleType) {
        this.setRuleType(ruleType);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO ruletype(PSModelEnums.ValueRuleType ruleType) {
        if (ruleType == null) {
            this.setRuleType(null);
        } else {
            this.setRuleType(ruleType.value);
        }
        return this;
    }

    @JsonProperty(value="script")
    public void setScript(String script) {
        this._set(DTOFIELD_SCRIPT, script);
    }

    @JsonIgnore
    public String getScript() {
        Object objValue = this._get(DTOFIELD_SCRIPT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isScriptDirty() {
        return this._contains(DTOFIELD_SCRIPT);
    }

    @JsonIgnore
    public void resetScript() {
        this._reset(DTOFIELD_SCRIPT);
    }

    @JsonIgnore
    public PSSysValueRuleDTO script(String script) {
        this.setScript(script);
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
    public PSSysValueRuleDTO updatedate(Timestamp updateDate) {
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
    public PSSysValueRuleDTO updateman(String updateMan) {
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
    public PSSysValueRuleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysValueRuleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysValueRuleDTO usertag(String userTag) {
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
    public PSSysValueRuleDTO usertag2(String userTag2) {
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
    public PSSysValueRuleDTO usertag3(String userTag3) {
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
    public PSSysValueRuleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysValueRuleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysValueRuleId(strValue);
    }

    @JsonIgnore
    public PSSysValueRuleDTO id(String strValue) {
        this.setPSSysValueRuleId(strValue);
        return this;
    }
}
