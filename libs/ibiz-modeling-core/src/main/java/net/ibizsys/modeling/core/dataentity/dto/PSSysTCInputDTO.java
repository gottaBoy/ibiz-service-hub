package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSampleValueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestCaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTCInputDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAMS = "ACTIONPARAMS";
    protected static final String DTOFIELD_ACTIONPARAMS = "actionparams";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DEFPSSYSSAMPLEVALUEID = "DEFPSSYSSAMPLEVALUEID";
    protected static final String DTOFIELD_DEFPSSYSSAMPLEVALUEID = "defpssyssamplevalueid";
    public static final String FIELD_DEFPSSYSSAMPLEVALUENAME = "DEFPSSYSSAMPLEVALUENAME";
    protected static final String DTOFIELD_DEFPSSYSSAMPLEVALUENAME = "defpssyssamplevaluename";
    public static final String FIELD_DEFVALUE = "DEFVALUE";
    protected static final String DTOFIELD_DEFVALUE = "defvalue";
    public static final String FIELD_INPUTTAG = "INPUTTAG";
    protected static final String DTOFIELD_INPUTTAG = "inputtag";
    public static final String FIELD_INPUTTAG2 = "INPUTTAG2";
    protected static final String DTOFIELD_INPUTTAG2 = "inputtag2";
    public static final String FIELD_INPUTTAG3 = "INPUTTAG3";
    protected static final String DTOFIELD_INPUTTAG3 = "inputtag3";
    public static final String FIELD_INPUTTAG4 = "INPUTTAG4";
    protected static final String DTOFIELD_INPUTTAG4 = "inputtag4";
    public static final String FIELD_INPUTTYPE = "INPUTTYPE";
    protected static final String DTOFIELD_INPUTTYPE = "inputtype";
    public static final String FIELD_INPUTVALUES = "INPUTVALUES";
    protected static final String DTOFIELD_INPUTVALUES = "inputvalues";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSTCINPUTID = "PSSYSTCINPUTID";
    protected static final String DTOFIELD_PSSYSTCINPUTID = "pssystcinputid";
    public static final String FIELD_PSSYSTCINPUTNAME = "PSSYSTCINPUTNAME";
    protected static final String DTOFIELD_PSSYSTCINPUTNAME = "pssystcinputname";
    public static final String FIELD_PSSYSTESTCASEID = "PSSYSTESTCASEID";
    protected static final String DTOFIELD_PSSYSTESTCASEID = "pssystestcaseid";
    public static final String FIELD_PSSYSTESTCASENAME = "PSSYSTESTCASENAME";
    protected static final String DTOFIELD_PSSYSTESTCASENAME = "pssystestcasename";
    public static final String FIELD_PSSYSTESTDATAID = "PSSYSTESTDATAID";
    protected static final String DTOFIELD_PSSYSTESTDATAID = "pssystestdataid";
    public static final String FIELD_PSSYSTESTDATANAME = "PSSYSTESTDATANAME";
    protected static final String DTOFIELD_PSSYSTESTDATANAME = "pssystestdataname";
    public static final String FIELD_TARGETTYPE = "TARGETTYPE";
    protected static final String DTOFIELD_TARGETTYPE = "targettype";
    public static final String FIELD_TESTDATASN = "TESTDATASN";
    protected static final String DTOFIELD_TESTDATASN = "testdatasn";
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

    @JsonProperty(value="actionparams")
    public void setActionParams(String actionParams) {
        this._set(DTOFIELD_ACTIONPARAMS, actionParams);
    }

    @JsonIgnore
    public String getActionParams() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamsDirty() {
        return this._contains(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public void resetActionParams() {
        this._reset(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public PSSysTCInputDTO actionparams(String actionParams) {
        this.setActionParams(actionParams);
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
    public PSSysTCInputDTO createdate(Timestamp createDate) {
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
    public PSSysTCInputDTO createman(String createMan) {
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
    public PSSysTCInputDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="defpssyssamplevalueid")
    public void setDEFPSSysSampleValueId(String dEFPSSysSampleValueId) {
        this._set(DTOFIELD_DEFPSSYSSAMPLEVALUEID, dEFPSSysSampleValueId);
    }

    @JsonIgnore
    public String getDEFPSSysSampleValueId() {
        Object objValue = this._get(DTOFIELD_DEFPSSYSSAMPLEVALUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFPSSysSampleValueIdDirty() {
        return this._contains(DTOFIELD_DEFPSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public void resetDEFPSSysSampleValueId() {
        this._reset(DTOFIELD_DEFPSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public PSSysTCInputDTO defpssyssamplevalueid(String dEFPSSysSampleValueId) {
        this.setDEFPSSysSampleValueId(dEFPSSysSampleValueId);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO defpssyssamplevalueid(PSSysSampleValueDTO pSSysSampleValue) {
        if (pSSysSampleValue == null) {
            this.setDEFPSSysSampleValueId(null);
            this.setDEFPSSysSampleValueName(null);
        } else {
            this.setDEFPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setDEFPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    @JsonProperty(value="defpssyssamplevaluename")
    public void setDEFPSSysSampleValueName(String dEFPSSysSampleValueName) {
        this._set(DTOFIELD_DEFPSSYSSAMPLEVALUENAME, dEFPSSysSampleValueName);
    }

    @JsonIgnore
    public String getDEFPSSysSampleValueName() {
        Object objValue = this._get(DTOFIELD_DEFPSSYSSAMPLEVALUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFPSSysSampleValueNameDirty() {
        return this._contains(DTOFIELD_DEFPSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public void resetDEFPSSysSampleValueName() {
        this._reset(DTOFIELD_DEFPSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public PSSysTCInputDTO defpssyssamplevaluename(String dEFPSSysSampleValueName) {
        this.setDEFPSSysSampleValueName(dEFPSSysSampleValueName);
        return this;
    }

    @JsonProperty(value="defvalue")
    public void setDEFValue(String dEFValue) {
        this._set(DTOFIELD_DEFVALUE, dEFValue);
    }

    @JsonIgnore
    public String getDEFValue() {
        Object objValue = this._get(DTOFIELD_DEFVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFValueDirty() {
        return this._contains(DTOFIELD_DEFVALUE);
    }

    @JsonIgnore
    public void resetDEFValue() {
        this._reset(DTOFIELD_DEFVALUE);
    }

    @JsonIgnore
    public PSSysTCInputDTO defvalue(String dEFValue) {
        this.setDEFValue(dEFValue);
        return this;
    }

    @JsonProperty(value="inputtag")
    public void setInputTag(String inputTag) {
        this._set(DTOFIELD_INPUTTAG, inputTag);
    }

    @JsonIgnore
    public String getInputTag() {
        Object objValue = this._get(DTOFIELD_INPUTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputTagDirty() {
        return this._contains(DTOFIELD_INPUTTAG);
    }

    @JsonIgnore
    public void resetInputTag() {
        this._reset(DTOFIELD_INPUTTAG);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtag(String inputTag) {
        this.setInputTag(inputTag);
        return this;
    }

    @JsonProperty(value="inputtag2")
    public void setInputTag2(String inputTag2) {
        this._set(DTOFIELD_INPUTTAG2, inputTag2);
    }

    @JsonIgnore
    public String getInputTag2() {
        Object objValue = this._get(DTOFIELD_INPUTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputTag2Dirty() {
        return this._contains(DTOFIELD_INPUTTAG2);
    }

    @JsonIgnore
    public void resetInputTag2() {
        this._reset(DTOFIELD_INPUTTAG2);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtag2(String inputTag2) {
        this.setInputTag2(inputTag2);
        return this;
    }

    @JsonProperty(value="inputtag3")
    public void setInputTag3(String inputTag3) {
        this._set(DTOFIELD_INPUTTAG3, inputTag3);
    }

    @JsonIgnore
    public String getInputTag3() {
        Object objValue = this._get(DTOFIELD_INPUTTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputTag3Dirty() {
        return this._contains(DTOFIELD_INPUTTAG3);
    }

    @JsonIgnore
    public void resetInputTag3() {
        this._reset(DTOFIELD_INPUTTAG3);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtag3(String inputTag3) {
        this.setInputTag3(inputTag3);
        return this;
    }

    @JsonProperty(value="inputtag4")
    public void setInputTag4(String inputTag4) {
        this._set(DTOFIELD_INPUTTAG4, inputTag4);
    }

    @JsonIgnore
    public String getInputTag4() {
        Object objValue = this._get(DTOFIELD_INPUTTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputTag4Dirty() {
        return this._contains(DTOFIELD_INPUTTAG4);
    }

    @JsonIgnore
    public void resetInputTag4() {
        this._reset(DTOFIELD_INPUTTAG4);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtag4(String inputTag4) {
        this.setInputTag4(inputTag4);
        return this;
    }

    @JsonProperty(value="inputtype")
    public void setInputType(String inputType) {
        this._set(DTOFIELD_INPUTTYPE, inputType);
    }

    @JsonIgnore
    public String getInputType() {
        Object objValue = this._get(DTOFIELD_INPUTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputTypeDirty() {
        return this._contains(DTOFIELD_INPUTTYPE);
    }

    @JsonIgnore
    public void resetInputType() {
        this._reset(DTOFIELD_INPUTTYPE);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtype(String inputType) {
        this.setInputType(inputType);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO inputtype(PSModelEnums.TestCaseInputType inputType) {
        if (inputType == null) {
            this.setInputType(null);
        } else {
            this.setInputType(inputType.value);
        }
        return this;
    }

    @JsonProperty(value="inputvalues")
    public void setInputValues(String inputValues) {
        this._set(DTOFIELD_INPUTVALUES, inputValues);
    }

    @JsonIgnore
    public String getInputValues() {
        Object objValue = this._get(DTOFIELD_INPUTVALUES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInputValuesDirty() {
        return this._contains(DTOFIELD_INPUTVALUES);
    }

    @JsonIgnore
    public void resetInputValues() {
        this._reset(DTOFIELD_INPUTVALUES);
    }

    @JsonIgnore
    public PSSysTCInputDTO inputvalues(String inputValues) {
        this.setInputValues(inputValues);
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
    public PSSysTCInputDTO memo(String memo) {
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
    public PSSysTCInputDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysTCInputDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSSysTCInputDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
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
    public PSSysTCInputDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
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
    public PSSysTCInputDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssystcinputid")
    public void setPSSysTCInputId(String pSSysTCInputId) {
        this._set(DTOFIELD_PSSYSTCINPUTID, pSSysTCInputId);
    }

    @JsonIgnore
    public String getPSSysTCInputId() {
        Object objValue = this._get(DTOFIELD_PSSYSTCINPUTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTCInputIdDirty() {
        return this._contains(DTOFIELD_PSSYSTCINPUTID);
    }

    @JsonIgnore
    public void resetPSSysTCInputId() {
        this._reset(DTOFIELD_PSSYSTCINPUTID);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystcinputid(String pSSysTCInputId) {
        this.setPSSysTCInputId(pSSysTCInputId);
        return this;
    }

    @JsonProperty(value="pssystcinputname")
    public void setPSSysTCInputName(String pSSysTCInputName) {
        this._set(DTOFIELD_PSSYSTCINPUTNAME, pSSysTCInputName);
    }

    @JsonIgnore
    public String getPSSysTCInputName() {
        Object objValue = this._get(DTOFIELD_PSSYSTCINPUTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTCInputNameDirty() {
        return this._contains(DTOFIELD_PSSYSTCINPUTNAME);
    }

    @JsonIgnore
    public void resetPSSysTCInputName() {
        this._reset(DTOFIELD_PSSYSTCINPUTNAME);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystcinputname(String pSSysTCInputName) {
        this.setPSSysTCInputName(pSSysTCInputName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTCInputName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTCInputName(strName);
    }

    @JsonIgnore
    public PSSysTCInputDTO name(String strName) {
        this.setPSSysTCInputName(strName);
        return this;
    }

    @JsonProperty(value="pssystestcaseid")
    public void setPSSysTestCaseId(String pSSysTestCaseId) {
        this._set(DTOFIELD_PSSYSTESTCASEID, pSSysTestCaseId);
    }

    @JsonIgnore
    public String getPSSysTestCaseId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTCASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestCaseIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTCASEID);
    }

    @JsonIgnore
    public void resetPSSysTestCaseId() {
        this._reset(DTOFIELD_PSSYSTESTCASEID);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestcaseid(String pSSysTestCaseId) {
        this.setPSSysTestCaseId(pSSysTestCaseId);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestcaseid(PSSysTestCaseDTO pSSysTestCase) {
        if (pSSysTestCase == null) {
            this.setPSDEFId(null);
            this.setPSDEId(null);
            this.setPSSysTestCaseId(null);
            this.setPSSysTestCaseName(null);
            this.setTargetType(null);
        } else {
            this.setPSDEFId(pSSysTestCase.getPSDEFId());
            this.setPSDEId(pSSysTestCase.getPSDEId());
            this.setPSSysTestCaseId(pSSysTestCase.getPSSysTestCaseId());
            this.setPSSysTestCaseName(pSSysTestCase.getPSSysTestCaseName());
            this.setTargetType(pSSysTestCase.getTargetType());
        }
        return this;
    }

    @JsonProperty(value="pssystestcasename")
    public void setPSSysTestCaseName(String pSSysTestCaseName) {
        this._set(DTOFIELD_PSSYSTESTCASENAME, pSSysTestCaseName);
    }

    @JsonIgnore
    public String getPSSysTestCaseName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTCASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestCaseNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTCASENAME);
    }

    @JsonIgnore
    public void resetPSSysTestCaseName() {
        this._reset(DTOFIELD_PSSYSTESTCASENAME);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestcasename(String pSSysTestCaseName) {
        this.setPSSysTestCaseName(pSSysTestCaseName);
        return this;
    }

    @JsonProperty(value="pssystestdataid")
    public void setPSSysTestDataId(String pSSysTestDataId) {
        this._set(DTOFIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }

    @JsonIgnore
    public String getPSSysTestDataId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public void resetPSSysTestDataId() {
        this._reset(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestdataid(PSSysTestDataDTO pSSysTestData) {
        if (pSSysTestData == null) {
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        } else {
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    @JsonProperty(value="pssystestdataname")
    public void setPSSysTestDataName(String pSSysTestDataName) {
        this._set(DTOFIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }

    @JsonIgnore
    public String getPSSysTestDataName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public void resetPSSysTestDataName() {
        this._reset(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public PSSysTCInputDTO pssystestdataname(String pSSysTestDataName) {
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonProperty(value="targettype")
    public void setTargetType(String targetType) {
        this._set(DTOFIELD_TARGETTYPE, targetType);
    }

    @JsonIgnore
    public String getTargetType() {
        Object objValue = this._get(DTOFIELD_TARGETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypeDirty() {
        return this._contains(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public void resetTargetType() {
        this._reset(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public PSSysTCInputDTO targettype(String targetType) {
        this.setTargetType(targetType);
        return this;
    }

    @JsonProperty(value="testdatasn")
    public void setTestDataSN(Integer testDataSN) {
        this._set(DTOFIELD_TESTDATASN, testDataSN);
    }

    @JsonIgnore
    public Integer getTestDataSN() {
        Object objValue = this._get(DTOFIELD_TESTDATASN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTestDataSNDirty() {
        return this._contains(DTOFIELD_TESTDATASN);
    }

    @JsonIgnore
    public void resetTestDataSN() {
        this._reset(DTOFIELD_TESTDATASN);
    }

    @JsonIgnore
    public PSSysTCInputDTO testdatasn(Integer testDataSN) {
        this.setTestDataSN(testDataSN);
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
    public PSSysTCInputDTO updatedate(Timestamp updateDate) {
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
    public PSSysTCInputDTO updateman(String updateMan) {
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
    public PSSysTCInputDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysTCInputDTO usertag(String userTag) {
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
    public PSSysTCInputDTO usertag2(String userTag2) {
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
    public PSSysTCInputDTO usertag3(String userTag3) {
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
    public PSSysTCInputDTO usertag4(String userTag4) {
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
    public PSSysTCInputDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTCInputDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTCInputId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTCInputId(strValue);
    }

    @JsonIgnore
    public PSSysTCInputDTO id(String strValue) {
        this.setPSSysTCInputId(strValue);
        return this;
    }
}
