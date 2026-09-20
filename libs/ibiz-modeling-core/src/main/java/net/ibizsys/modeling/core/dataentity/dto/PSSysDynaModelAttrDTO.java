package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysValueRuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDynaModelAttrDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_ATTRTAG = "ATTRTAG";
    protected static final String DTOFIELD_ATTRTAG = "attrtag";
    public static final String FIELD_ATTRTAG2 = "ATTRTAG2";
    protected static final String DTOFIELD_ATTRTAG2 = "attrtag2";
    public static final String FIELD_ATTRVALUE = "ATTRVALUE";
    protected static final String DTOFIELD_ATTRVALUE = "attrvalue";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DYNAMODELUSAGE = "DYNAMODELUSAGE";
    protected static final String DTOFIELD_DYNAMODELUSAGE = "dynamodelusage";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSSYSDYNAMODELATTRID = "PSSYSDYNAMODELATTRID";
    protected static final String DTOFIELD_PSSYSDYNAMODELATTRID = "pssysdynamodelattrid";
    public static final String FIELD_PSSYSDYNAMODELATTRNAME = "PSSYSDYNAMODELATTRNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELATTRNAME = "pssysdynamodelattrname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
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
    public PSSysDynaModelAttrDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO allowempty(Boolean allowEmpty) {
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
    public PSSysDynaModelAttrDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO arrayflag(Boolean arrayFlag) {
        if (arrayFlag == null) {
            this.setArrayFlag(null);
        } else {
            this.setArrayFlag(arrayFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="attrtag")
    public void setAttrTag(String attrTag) {
        this._set(DTOFIELD_ATTRTAG, attrTag);
    }

    @JsonIgnore
    public String getAttrTag() {
        Object objValue = this._get(DTOFIELD_ATTRTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttrTagDirty() {
        return this._contains(DTOFIELD_ATTRTAG);
    }

    @JsonIgnore
    public void resetAttrTag() {
        this._reset(DTOFIELD_ATTRTAG);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO attrtag(String attrTag) {
        this.setAttrTag(attrTag);
        return this;
    }

    @JsonProperty(value="attrtag2")
    public void setAttrTag2(String attrTag2) {
        this._set(DTOFIELD_ATTRTAG2, attrTag2);
    }

    @JsonIgnore
    public String getAttrTag2() {
        Object objValue = this._get(DTOFIELD_ATTRTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttrTag2Dirty() {
        return this._contains(DTOFIELD_ATTRTAG2);
    }

    @JsonIgnore
    public void resetAttrTag2() {
        this._reset(DTOFIELD_ATTRTAG2);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO attrtag2(String attrTag2) {
        this.setAttrTag2(attrTag2);
        return this;
    }

    @JsonProperty(value="attrvalue")
    public void setAttrValue(String attrValue) {
        this._set(DTOFIELD_ATTRVALUE, attrValue);
    }

    @JsonIgnore
    public String getAttrValue() {
        Object objValue = this._get(DTOFIELD_ATTRVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttrValueDirty() {
        return this._contains(DTOFIELD_ATTRVALUE);
    }

    @JsonIgnore
    public void resetAttrValue() {
        this._reset(DTOFIELD_ATTRVALUE);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO attrvalue(String attrValue) {
        this.setAttrValue(attrValue);
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
    public PSSysDynaModelAttrDTO codename(String codeName) {
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
    public PSSysDynaModelAttrDTO createdate(Timestamp createDate) {
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
    public PSSysDynaModelAttrDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dynamodelusage")
    public void setDynaModelUsage(String dynaModelUsage) {
        this._set(DTOFIELD_DYNAMODELUSAGE, dynaModelUsage);
    }

    @JsonIgnore
    public String getDynaModelUsage() {
        Object objValue = this._get(DTOFIELD_DYNAMODELUSAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaModelUsageDirty() {
        return this._contains(DTOFIELD_DYNAMODELUSAGE);
    }

    @JsonIgnore
    public void resetDynaModelUsage() {
        this._reset(DTOFIELD_DYNAMODELUSAGE);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO dynamodelusage(String dynaModelUsage) {
        this.setDynaModelUsage(dynaModelUsage);
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
    public PSSysDynaModelAttrDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
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
    public PSSysDynaModelAttrDTO logicname(String logicName) {
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
    public PSSysDynaModelAttrDTO memo(String memo) {
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
    public PSSysDynaModelAttrDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelattrid")
    public void setPSSysDynaModelAttrId(String pSSysDynaModelAttrId) {
        this._set(DTOFIELD_PSSYSDYNAMODELATTRID, pSSysDynaModelAttrId);
    }

    @JsonIgnore
    public String getPSSysDynaModelAttrId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELATTRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelAttrIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELATTRID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelAttrId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELATTRID);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelattrid(String pSSysDynaModelAttrId) {
        this.setPSSysDynaModelAttrId(pSSysDynaModelAttrId);
        return this;
    }

    @JsonProperty(value="pssysdynamodelattrname")
    public void setPSSysDynaModelAttrName(String pSSysDynaModelAttrName) {
        this._set(DTOFIELD_PSSYSDYNAMODELATTRNAME, pSSysDynaModelAttrName);
    }

    @JsonIgnore
    public String getPSSysDynaModelAttrName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELATTRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelAttrNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELATTRNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelAttrName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELATTRNAME);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelattrname(String pSSysDynaModelAttrName) {
        this.setPSSysDynaModelAttrName(pSSysDynaModelAttrName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDynaModelAttrName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDynaModelAttrName(strName);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO name(String strName) {
        this.setPSSysDynaModelAttrName(strName);
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
    public PSSysDynaModelAttrDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setDynaModelUsage(null);
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setDynaModelUsage(pSSysDynaModel.getDynaModelUsage());
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
    public PSSysDynaModelAttrDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysDynaModelAttrDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
    public PSSysDynaModelAttrDTO pssysvaluerulename(String pSSysValueRuleName) {
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
    public PSSysDynaModelAttrDTO refpsdefgroupid(String refPSDEFGroupId) {
        this.setRefPSDEFGroupId(refPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
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
    public PSSysDynaModelAttrDTO refpsdefgroupname(String refPSDEFGroupName) {
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
    public PSSysDynaModelAttrDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysDynaModelAttrDTO refpsdename(String refPSDEName) {
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
    public PSSysDynaModelAttrDTO refpssysdynamodelid(String refPSSysDynaModelId) {
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO refpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysDynaModelAttrDTO refpssysdynamodelname(String refPSSysDynaModelName) {
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
    public PSSysDynaModelAttrDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
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
    public PSSysDynaModelAttrDTO updatedate(Timestamp updateDate) {
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
    public PSSysDynaModelAttrDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysDynaModelAttrDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
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
    public PSSysDynaModelAttrDTO valuetype(String valueType) {
        this.setValueType(valueType);
        return this;
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO valuetype(PSModelEnums.DynaModelAttrValueType valueType) {
        if (valueType == null) {
            this.setValueType(null);
        } else {
            this.setValueType(valueType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDynaModelAttrId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDynaModelAttrId(strValue);
    }

    @JsonIgnore
    public PSSysDynaModelAttrDTO id(String strValue) {
        this.setPSSysDynaModelAttrId(strValue);
        return this;
    }
}
