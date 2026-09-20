/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEActionParamValueType
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$StdDataType
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFValueRuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysValueRuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEActionParamDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMDESC = "PARAMDESC";
    protected static final String DTOFIELD_PARAMDESC = "paramdesc";
    public static final String FIELD_PARAMTAG = "PARAMTAG";
    protected static final String DTOFIELD_PARAMTAG = "paramtag";
    public static final String FIELD_PARAMTAG2 = "PARAMTAG2";
    protected static final String DTOFIELD_PARAMTAG2 = "paramtag2";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEACTIONPARAMID = "PSDEACTIONPARAMID";
    protected static final String DTOFIELD_PSDEACTIONPARAMID = "psdeactionparamid";
    public static final String FIELD_PSDEACTIONPARAMNAME = "PSDEACTIONPARAMNAME";
    protected static final String DTOFIELD_PSDEACTIONPARAMNAME = "psdeactionparamname";
    public static final String FIELD_PSDEFVALUERULEID = "PSDEFVALUERULEID";
    protected static final String DTOFIELD_PSDEFVALUERULEID = "psdefvalueruleid";
    public static final String FIELD_PSDEFVALUERULENAME = "PSDEFVALUERULENAME";
    protected static final String DTOFIELD_PSDEFVALUERULENAME = "psdefvaluerulename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_REFPSDEFGROUPID = "REFPSDEFGROUPID";
    protected static final String DTOFIELD_REFPSDEFGROUPID = "refpsdefgroupid";
    public static final String FIELD_REFPSDEFGROUPNAME = "REFPSDEFGROUPNAME";
    protected static final String DTOFIELD_REFPSDEFGROUPNAME = "refpsdefgroupname";
    public static final String FIELD_REFPSDEID = "REFPSDEID";
    protected static final String DTOFIELD_REFPSDEID = "refpsdeid";
    public static final String FIELD_REFPSDENAME = "REFPSDENAME";
    protected static final String DTOFIELD_REFPSDENAME = "refpsdename";
    public static final String FIELD_REFPSSYSDYNAMODELID = "REFPSSYSDYNAMODELID";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";
    public static final String FIELD_REFPSSYSDYNAMODELNAME = "REFPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
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
    public static final String FIELD_VALUE = "VALUE";
    protected static final String DTOFIELD_VALUE = "value";
    public static final String FIELD_VALUEDESC = "VALUEDESC";
    protected static final String DTOFIELD_VALUEDESC = "valuedesc";
    public static final String FIELD_VALUETYPE = "VALUETYPE";
    protected static final String DTOFIELD_VALUETYPE = "valuetype";

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowEmptyDirty() {
        return this._contains(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public void resetAllowEmpty() {
        this._reset(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public PSDEActionParamDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="arrayflag")
    public void setArrayFlag(Integer arrayFlag) {
        this._set(DTOFIELD_ARRAYFLAG, arrayFlag);
    }

    @JsonIgnore
    public Integer getArrayFlag() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isArrayFlagDirty() {
        return this._contains(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public void resetArrayFlag() {
        this._reset(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public PSDEActionParamDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO arrayflag(Boolean arrayFlag) {
        if (arrayFlag == null) {
            this.setArrayFlag(null);
        } else {
            this.setArrayFlag(arrayFlag != false ? 1 : 0);
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
    public PSDEActionParamDTO codename(String codeName) {
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
    public PSDEActionParamDTO createdate(Timestamp createDate) {
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
    public PSDEActionParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="jsonformat")
    public void setJsonFormat(String jsonFormat) {
        this._set(DTOFIELD_JSONFORMAT, jsonFormat);
    }

    @JsonIgnore
    public String getJsonFormat() {
        Object objValue = this._get(DTOFIELD_JSONFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJsonFormatDirty() {
        return this._contains(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public void resetJsonFormat() {
        this._reset(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public PSDEActionParamDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
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
    public PSDEActionParamDTO memo(String memo) {
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
    public PSDEActionParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="paramdesc")
    public void setParamDesc(String paramDesc) {
        this._set(DTOFIELD_PARAMDESC, paramDesc);
    }

    @JsonIgnore
    public String getParamDesc() {
        Object objValue = this._get(DTOFIELD_PARAMDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDescDirty() {
        return this._contains(DTOFIELD_PARAMDESC);
    }

    @JsonIgnore
    public void resetParamDesc() {
        this._reset(DTOFIELD_PARAMDESC);
    }

    @JsonIgnore
    public PSDEActionParamDTO paramdesc(String paramDesc) {
        this.setParamDesc(paramDesc);
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
    public PSDEActionParamDTO paramtag(String paramTag) {
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
    public PSDEActionParamDTO paramtag2(String paramTag2) {
        this.setParamTag2(paramTag2);
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
    public PSDEActionParamDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
            this.setPSDEId(pSDEAction.getPSDEId());
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
    public PSDEActionParamDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdeactionparamid")
    public void setPSDEActionParamId(String pSDEActionParamId) {
        this._set(DTOFIELD_PSDEACTIONPARAMID, pSDEActionParamId);
    }

    @JsonIgnore
    public String getPSDEActionParamId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionParamIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONPARAMID);
    }

    @JsonIgnore
    public void resetPSDEActionParamId() {
        this._reset(DTOFIELD_PSDEACTIONPARAMID);
    }

    @JsonIgnore
    public PSDEActionParamDTO psdeactionparamid(String pSDEActionParamId) {
        this.setPSDEActionParamId(pSDEActionParamId);
        return this;
    }

    @JsonProperty(value="psdeactionparamname")
    public void setPSDEActionParamName(String pSDEActionParamName) {
        this._set(DTOFIELD_PSDEACTIONPARAMNAME, pSDEActionParamName);
    }

    @JsonIgnore
    public String getPSDEActionParamName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionParamNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONPARAMNAME);
    }

    @JsonIgnore
    public void resetPSDEActionParamName() {
        this._reset(DTOFIELD_PSDEACTIONPARAMNAME);
    }

    @JsonIgnore
    public PSDEActionParamDTO psdeactionparamname(String pSDEActionParamName) {
        this.setPSDEActionParamName(pSDEActionParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEActionParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEActionParamName(strName);
    }

    @JsonIgnore
    public PSDEActionParamDTO name(String strName) {
        this.setPSDEActionParamName(strName);
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
    public PSDEActionParamDTO psdefvalueruleid(String pSDEFValueRuleId) {
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        } else {
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
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
    public PSDEActionParamDTO psdefvaluerulename(String pSDEFValueRuleName) {
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
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
    public PSDEActionParamDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEActionParamDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
        if (pSSysValueRule == null) {
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        } else {
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
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
    public PSDEActionParamDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="refpsdefgroupid")
    public void setRefPSDEFGroupId(String refPSDEFGroupId) {
        this._set(DTOFIELD_REFPSDEFGROUPID, refPSDEFGroupId);
    }

    @JsonIgnore
    public String getRefPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_REFPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_REFPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetRefPSDEFGroupId() {
        this._reset(DTOFIELD_REFPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdefgroupid(String refPSDEFGroupId) {
        this.setRefPSDEFGroupId(refPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setRefPSDEFGroupId(null);
            this.setRefPSDEFGroupName(null);
        } else {
            this.setRefPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setRefPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="refpsdefgroupname")
    public void setRefPSDEFGroupName(String refPSDEFGroupName) {
        this._set(DTOFIELD_REFPSDEFGROUPNAME, refPSDEFGroupName);
    }

    @JsonIgnore
    public String getRefPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_REFPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_REFPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetRefPSDEFGroupName() {
        this._reset(DTOFIELD_REFPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdefgroupname(String refPSDEFGroupName) {
        this.setRefPSDEFGroupName(refPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="refpsdeid")
    public void setRefPSDEId(String refPSDEId) {
        this._set(DTOFIELD_REFPSDEID, refPSDEId);
    }

    @JsonIgnore
    public String getRefPSDEId() {
        Object objValue = this._get(DTOFIELD_REFPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEIdDirty() {
        return this._contains(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public void resetRefPSDEId() {
        this._reset(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        } else {
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="refpsdename")
    public void setRefPSDEName(String refPSDEName) {
        this._set(DTOFIELD_REFPSDENAME, refPSDEName);
    }

    @JsonIgnore
    public String getRefPSDEName() {
        Object objValue = this._get(DTOFIELD_REFPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDENameDirty() {
        return this._contains(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public void resetRefPSDEName() {
        this._reset(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    @JsonProperty(value="refpssysdynamodelid")
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelId() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpssysdynamodelid(String refPSSysDynaModelId) {
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO refpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        } else {
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="refpssysdynamodelname")
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelName() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEActionParamDTO refpssysdynamodelname(String refPSSysDynaModelName) {
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
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
    public PSDEActionParamDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
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
    public PSDEActionParamDTO updatedate(Timestamp updateDate) {
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
    public PSDEActionParamDTO updateman(String updateMan) {
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
    public PSDEActionParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEActionParamDTO usertag(String userTag) {
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
    public PSDEActionParamDTO usertag2(String userTag2) {
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
    public PSDEActionParamDTO usertag3(String userTag3) {
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
    public PSDEActionParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="value")
    public void setValue(String value) {
        this._set(DTOFIELD_VALUE, value);
    }

    @JsonIgnore
    public String getValue() {
        Object objValue = this._get(DTOFIELD_VALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueDirty() {
        return this._contains(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public void resetValue() {
        this._reset(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public PSDEActionParamDTO value(String value) {
        this.setValue(value);
        return this;
    }

    @JsonProperty(value="valuedesc")
    public void setValueDesc(String valueDesc) {
        this._set(DTOFIELD_VALUEDESC, valueDesc);
    }

    @JsonIgnore
    public String getValueDesc() {
        Object objValue = this._get(DTOFIELD_VALUEDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueDescDirty() {
        return this._contains(DTOFIELD_VALUEDESC);
    }

    @JsonIgnore
    public void resetValueDesc() {
        this._reset(DTOFIELD_VALUEDESC);
    }

    @JsonIgnore
    public PSDEActionParamDTO valuedesc(String valueDesc) {
        this.setValueDesc(valueDesc);
        return this;
    }

    @JsonProperty(value="valuetype")
    public void setValueType(String valueType) {
        this._set(DTOFIELD_VALUETYPE, valueType);
    }

    @JsonIgnore
    public String getValueType() {
        Object objValue = this._get(DTOFIELD_VALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueTypeDirty() {
        return this._contains(DTOFIELD_VALUETYPE);
    }

    @JsonIgnore
    public void resetValueType() {
        this._reset(DTOFIELD_VALUETYPE);
    }

    @JsonIgnore
    public PSDEActionParamDTO valuetype(String valueType) {
        this.setValueType(valueType);
        return this;
    }

    @JsonIgnore
    public PSDEActionParamDTO valuetype(PSModelEnums.DEActionParamValueType valueType) {
        if (valueType == null) {
            this.setValueType(null);
        } else {
            this.setValueType(valueType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEActionParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEActionParamId(strValue);
    }

    @JsonIgnore
    public PSDEActionParamDTO id(String strValue) {
        this.setPSDEActionParamId(strValue);
        return this;
    }
}
