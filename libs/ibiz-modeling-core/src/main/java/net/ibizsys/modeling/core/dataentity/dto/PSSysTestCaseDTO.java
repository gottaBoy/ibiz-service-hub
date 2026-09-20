package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSAppViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESADetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSampleValueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTCAssertDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTCInputDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestPrjDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTestCaseDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAMS = "ACTIONPARAMS";
    protected static final String DTOFIELD_ACTIONPARAMS = "actionparams";
    public static final String FIELD_ASSERTRESULT = "ASSERTRESULT";
    protected static final String DTOFIELD_ASSERTRESULT = "assertresult";
    public static final String FIELD_ASSERTTYPE = "ASSERTTYPE";
    protected static final String DTOFIELD_ASSERTTYPE = "asserttype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFPSSYSSAMPLEVALUEID = "DEFPSSYSSAMPLEVALUEID";
    protected static final String DTOFIELD_DEFPSSYSSAMPLEVALUEID = "defpssyssamplevalueid";
    public static final String FIELD_DEFPSSYSSAMPLEVALUENAME = "DEFPSSYSSAMPLEVALUENAME";
    protected static final String DTOFIELD_DEFPSSYSSAMPLEVALUENAME = "defpssyssamplevaluename";
    public static final String FIELD_DEFVALUE = "DEFVALUE";
    protected static final String DTOFIELD_DEFVALUE = "defvalue";
    public static final String FIELD_EXCEPTIONDATA = "EXCEPTIONDATA";
    protected static final String DTOFIELD_EXCEPTIONDATA = "exceptiondata";
    public static final String FIELD_EXCEPTIONDATA2 = "EXCEPTIONDATA2";
    protected static final String DTOFIELD_EXCEPTIONDATA2 = "exceptiondata2";
    public static final String FIELD_EXCEPTIONNAME = "EXCEPTIONNAME";
    protected static final String DTOFIELD_EXCEPTIONNAME = "exceptionname";
    public static final String FIELD_INPUTVALUES = "INPUTVALUES";
    protected static final String DTOFIELD_INPUTVALUES = "inputvalues";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDESADETAILID = "PSDESADETAILID";
    protected static final String DTOFIELD_PSDESADETAILID = "psdesadetailid";
    public static final String FIELD_PSDESADETAILNAME = "PSDESADETAILNAME";
    protected static final String DTOFIELD_PSDESADETAILNAME = "psdesadetailname";
    public static final String FIELD_PSDESERVICEAPIID = "PSDESERVICEAPIID";
    protected static final String DTOFIELD_PSDESERVICEAPIID = "psdeserviceapiid";
    public static final String FIELD_PSDESERVICEAPINAME = "PSDESERVICEAPINAME";
    protected static final String DTOFIELD_PSDESERVICEAPINAME = "psdeserviceapiname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSTESTCASEID = "PSSYSTESTCASEID";
    protected static final String DTOFIELD_PSSYSTESTCASEID = "pssystestcaseid";
    public static final String FIELD_PSSYSTESTCASENAME = "PSSYSTESTCASENAME";
    protected static final String DTOFIELD_PSSYSTESTCASENAME = "pssystestcasename";
    public static final String FIELD_PSSYSTESTDATAID = "PSSYSTESTDATAID";
    protected static final String DTOFIELD_PSSYSTESTDATAID = "pssystestdataid";
    public static final String FIELD_PSSYSTESTDATANAME = "PSSYSTESTDATANAME";
    protected static final String DTOFIELD_PSSYSTESTDATANAME = "pssystestdataname";
    public static final String FIELD_PSSYSTESTMODULEID = "PSSYSTESTMODULEID";
    protected static final String DTOFIELD_PSSYSTESTMODULEID = "pssystestmoduleid";
    public static final String FIELD_PSSYSTESTMODULENAME = "PSSYSTESTMODULENAME";
    protected static final String DTOFIELD_PSSYSTESTMODULENAME = "pssystestmodulename";
    public static final String FIELD_PSSYSTESTPRJID = "PSSYSTESTPRJID";
    protected static final String DTOFIELD_PSSYSTESTPRJID = "pssystestprjid";
    public static final String FIELD_PSSYSTESTPRJNAME = "PSSYSTESTPRJNAME";
    protected static final String DTOFIELD_PSSYSTESTPRJNAME = "pssystestprjname";
    public static final String FIELD_ROLLBACKTRAN = "ROLLBACKTRAN";
    protected static final String DTOFIELD_ROLLBACKTRAN = "rollbacktran";
    public static final String FIELD_TARGETTYPE = "TARGETTYPE";
    protected static final String DTOFIELD_TARGETTYPE = "targettype";
    public static final String FIELD_TESTCASELEVEL = "TESTCASELEVEL";
    protected static final String DTOFIELD_TESTCASELEVEL = "testcaselevel";
    public static final String FIELD_TESTCASESN = "TESTCASESN";
    protected static final String DTOFIELD_TESTCASESN = "testcasesn";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERDATA3 = "USERDATA3";
    protected static final String DTOFIELD_USERDATA3 = "userdata3";
    public static final String FIELD_USERDATA4 = "USERDATA4";
    protected static final String DTOFIELD_USERDATA4 = "userdata4";
    public static final String FIELD_USERFLAG = "USERFLAG";
    protected static final String DTOFIELD_USERFLAG = "userflag";
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
    public static final String DTOFIELD_PSSYSTCINPUTS = "pssystcinputs";
    public static final String DTOFIELD_PSSYSTCASSERTS = "pssystcasserts";

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
    public PSSysTestCaseDTO actionparams(String actionParams) {
        this.setActionParams(actionParams);
        return this;
    }

    @JsonProperty(value="assertresult")
    public void setAssertResult(String assertResult) {
        this._set(DTOFIELD_ASSERTRESULT, assertResult);
    }

    @JsonIgnore
    public String getAssertResult() {
        Object objValue = this._get(DTOFIELD_ASSERTRESULT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertResultDirty() {
        return this._contains(DTOFIELD_ASSERTRESULT);
    }

    @JsonIgnore
    public void resetAssertResult() {
        this._reset(DTOFIELD_ASSERTRESULT);
    }

    @JsonIgnore
    public PSSysTestCaseDTO assertresult(String assertResult) {
        this.setAssertResult(assertResult);
        return this;
    }

    @JsonProperty(value="asserttype")
    public void setAssertType(String assertType) {
        this._set(DTOFIELD_ASSERTTYPE, assertType);
    }

    @JsonIgnore
    public String getAssertType() {
        Object objValue = this._get(DTOFIELD_ASSERTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertTypeDirty() {
        return this._contains(DTOFIELD_ASSERTTYPE);
    }

    @JsonIgnore
    public void resetAssertType() {
        this._reset(DTOFIELD_ASSERTTYPE);
    }

    @JsonIgnore
    public PSSysTestCaseDTO asserttype(String assertType) {
        this.setAssertType(assertType);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO asserttype(PSModelEnums.TestCaseAssertType assertType) {
        if (assertType == null) {
            this.setAssertType(null);
        } else {
            this.setAssertType(assertType.value);
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
    public PSSysTestCaseDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="content")
    public void setContent(String content) {
        this._set(DTOFIELD_CONTENT, content);
    }

    @JsonIgnore
    public String getContent() {
        Object objValue = this._get(DTOFIELD_CONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentDirty() {
        return this._contains(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public void resetContent() {
        this._reset(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public PSSysTestCaseDTO content(String content) {
        this.setContent(content);
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
    public PSSysTestCaseDTO createdate(Timestamp createDate) {
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
    public PSSysTestCaseDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysTestCaseDTO defpssyssamplevalueid(String dEFPSSysSampleValueId) {
        this.setDEFPSSysSampleValueId(dEFPSSysSampleValueId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO defpssyssamplevalueid(PSSysSampleValueDTO pSSysSampleValue) {
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
    public PSSysTestCaseDTO defpssyssamplevaluename(String dEFPSSysSampleValueName) {
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
    public PSSysTestCaseDTO defvalue(String dEFValue) {
        this.setDEFValue(dEFValue);
        return this;
    }

    @JsonProperty(value="exceptiondata")
    public void setExceptionData(String exceptionData) {
        this._set(DTOFIELD_EXCEPTIONDATA, exceptionData);
    }

    @JsonIgnore
    public String getExceptionData() {
        Object objValue = this._get(DTOFIELD_EXCEPTIONDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExceptionDataDirty() {
        return this._contains(DTOFIELD_EXCEPTIONDATA);
    }

    @JsonIgnore
    public void resetExceptionData() {
        this._reset(DTOFIELD_EXCEPTIONDATA);
    }

    @JsonIgnore
    public PSSysTestCaseDTO exceptiondata(String exceptionData) {
        this.setExceptionData(exceptionData);
        return this;
    }

    @JsonProperty(value="exceptiondata2")
    public void setExceptionData2(String exceptionData2) {
        this._set(DTOFIELD_EXCEPTIONDATA2, exceptionData2);
    }

    @JsonIgnore
    public String getExceptionData2() {
        Object objValue = this._get(DTOFIELD_EXCEPTIONDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExceptionData2Dirty() {
        return this._contains(DTOFIELD_EXCEPTIONDATA2);
    }

    @JsonIgnore
    public void resetExceptionData2() {
        this._reset(DTOFIELD_EXCEPTIONDATA2);
    }

    @JsonIgnore
    public PSSysTestCaseDTO exceptiondata2(String exceptionData2) {
        this.setExceptionData2(exceptionData2);
        return this;
    }

    @JsonProperty(value="exceptionname")
    public void setExceptionName(String exceptionName) {
        this._set(DTOFIELD_EXCEPTIONNAME, exceptionName);
    }

    @JsonIgnore
    public String getExceptionName() {
        Object objValue = this._get(DTOFIELD_EXCEPTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExceptionNameDirty() {
        return this._contains(DTOFIELD_EXCEPTIONNAME);
    }

    @JsonIgnore
    public void resetExceptionName() {
        this._reset(DTOFIELD_EXCEPTIONNAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO exceptionname(String exceptionName) {
        this.setExceptionName(exceptionName);
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
    public PSSysTestCaseDTO inputvalues(String inputValues) {
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
    public PSSysTestCaseDTO memo(String memo) {
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
    public PSSysTestCaseDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
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
    public PSSysTestCaseDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSSysTestCaseDTO psdeactionname(String pSDEActionName) {
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
    public PSSysTestCaseDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysTestCaseDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSSysTestCaseDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSSysTestCaseDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSSysTestCaseDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSSysTestCaseDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdesadetailid")
    public void setPSDESADetailId(String pSDESADetailId) {
        this._set(DTOFIELD_PSDESADETAILID, pSDESADetailId);
    }

    @JsonIgnore
    public String getPSDESADetailId() {
        Object objValue = this._get(DTOFIELD_PSDESADETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESADetailIdDirty() {
        return this._contains(DTOFIELD_PSDESADETAILID);
    }

    @JsonIgnore
    public void resetPSDESADetailId() {
        this._reset(DTOFIELD_PSDESADETAILID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdesadetailid(String pSDESADetailId) {
        this.setPSDESADetailId(pSDESADetailId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdesadetailid(PSDESADetailDTO pSDESADetail) {
        if (pSDESADetail == null) {
            this.setPSDESADetailId(null);
            this.setPSDESADetailName(null);
        } else {
            this.setPSDESADetailId(pSDESADetail.getPSDESADetailId());
            this.setPSDESADetailName(pSDESADetail.getPSDESADetailName());
        }
        return this;
    }

    @JsonProperty(value="psdesadetailname")
    public void setPSDESADetailName(String pSDESADetailName) {
        this._set(DTOFIELD_PSDESADETAILNAME, pSDESADetailName);
    }

    @JsonIgnore
    public String getPSDESADetailName() {
        Object objValue = this._get(DTOFIELD_PSDESADETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESADetailNameDirty() {
        return this._contains(DTOFIELD_PSDESADETAILNAME);
    }

    @JsonIgnore
    public void resetPSDESADetailName() {
        this._reset(DTOFIELD_PSDESADETAILNAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdesadetailname(String pSDESADetailName) {
        this.setPSDESADetailName(pSDESADetailName);
        return this;
    }

    @JsonProperty(value="psdeserviceapiid")
    public void setPSDEServiceAPIId(String pSDEServiceAPIId) {
        this._set(DTOFIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }

    @JsonIgnore
    public String getPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIId() {
        this._reset(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdeserviceapiid(String pSDEServiceAPIId) {
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
        } else {
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdeserviceapiname")
    public void setPSDEServiceAPIName(String pSDEServiceAPIName) {
        this._set(DTOFIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }

    @JsonIgnore
    public String getPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIName() {
        this._reset(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO psdeserviceapiname(String pSDEServiceAPIName) {
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
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
    public PSSysTestCaseDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSSysTestCaseDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
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
    public PSSysTestCaseDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysTestCaseDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSSysTestCaseDTO pssystestcaseid(String pSSysTestCaseId) {
        this.setPSSysTestCaseId(pSSysTestCaseId);
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
    public PSSysTestCaseDTO pssystestcasename(String pSSysTestCaseName) {
        this.setPSSysTestCaseName(pSSysTestCaseName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTestCaseName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTestCaseName(strName);
    }

    @JsonIgnore
    public PSSysTestCaseDTO name(String strName) {
        this.setPSSysTestCaseName(strName);
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
    public PSSysTestCaseDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestdataid(PSSysTestDataDTO pSSysTestData) {
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
    public PSSysTestCaseDTO pssystestdataname(String pSSysTestDataName) {
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonProperty(value="pssystestmoduleid")
    public void setPSSysTestModuleId(String pSSysTestModuleId) {
        this._set(DTOFIELD_PSSYSTESTMODULEID, pSSysTestModuleId);
    }

    @JsonIgnore
    public String getPSSysTestModuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestModuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTMODULEID);
    }

    @JsonIgnore
    public void resetPSSysTestModuleId() {
        this._reset(DTOFIELD_PSSYSTESTMODULEID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestmoduleid(String pSSysTestModuleId) {
        this.setPSSysTestModuleId(pSSysTestModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestmoduleid(PSSysTestModuleDTO pSSysTestModule) {
        if (pSSysTestModule == null) {
            this.setPSSysTestModuleId(null);
            this.setPSSysTestModuleName(null);
        } else {
            this.setPSSysTestModuleId(pSSysTestModule.getPSSysTestModuleId());
            this.setPSSysTestModuleName(pSSysTestModule.getPSSysTestModuleName());
        }
        return this;
    }

    @JsonProperty(value="pssystestmodulename")
    public void setPSSysTestModuleName(String pSSysTestModuleName) {
        this._set(DTOFIELD_PSSYSTESTMODULENAME, pSSysTestModuleName);
    }

    @JsonIgnore
    public String getPSSysTestModuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestModuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public void resetPSSysTestModuleName() {
        this._reset(DTOFIELD_PSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestmodulename(String pSSysTestModuleName) {
        this.setPSSysTestModuleName(pSSysTestModuleName);
        return this;
    }

    @JsonProperty(value="pssystestprjid")
    public void setPSSysTestPrjId(String pSSysTestPrjId) {
        this._set(DTOFIELD_PSSYSTESTPRJID, pSSysTestPrjId);
    }

    @JsonIgnore
    public String getPSSysTestPrjId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTPRJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestPrjIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTPRJID);
    }

    @JsonIgnore
    public void resetPSSysTestPrjId() {
        this._reset(DTOFIELD_PSSYSTESTPRJID);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestprjid(String pSSysTestPrjId) {
        this.setPSSysTestPrjId(pSSysTestPrjId);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestprjid(PSSysTestPrjDTO pSSysTestPrj) {
        if (pSSysTestPrj == null) {
            this.setPSSysAppId(null);
            this.setPSSysServiceAPIId(null);
            this.setPSSysTestPrjId(null);
            this.setPSSysTestPrjName(null);
        } else {
            this.setPSSysAppId(pSSysTestPrj.getPSSysAppId());
            this.setPSSysServiceAPIId(pSSysTestPrj.getPSSysServiceAPIId());
            this.setPSSysTestPrjId(pSSysTestPrj.getPSSysTestPrjId());
            this.setPSSysTestPrjName(pSSysTestPrj.getPSSysTestPrjName());
        }
        return this;
    }

    @JsonProperty(value="pssystestprjname")
    public void setPSSysTestPrjName(String pSSysTestPrjName) {
        this._set(DTOFIELD_PSSYSTESTPRJNAME, pSSysTestPrjName);
    }

    @JsonIgnore
    public String getPSSysTestPrjName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTPRJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestPrjNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTPRJNAME);
    }

    @JsonIgnore
    public void resetPSSysTestPrjName() {
        this._reset(DTOFIELD_PSSYSTESTPRJNAME);
    }

    @JsonIgnore
    public PSSysTestCaseDTO pssystestprjname(String pSSysTestPrjName) {
        this.setPSSysTestPrjName(pSSysTestPrjName);
        return this;
    }

    @JsonProperty(value="rollbacktran")
    public void setRollbackTran(Integer rollbackTran) {
        this._set(DTOFIELD_ROLLBACKTRAN, rollbackTran);
    }

    @JsonIgnore
    public Integer getRollbackTran() {
        Object objValue = this._get(DTOFIELD_ROLLBACKTRAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRollbackTranDirty() {
        return this._contains(DTOFIELD_ROLLBACKTRAN);
    }

    @JsonIgnore
    public void resetRollbackTran() {
        this._reset(DTOFIELD_ROLLBACKTRAN);
    }

    @JsonIgnore
    public PSSysTestCaseDTO rollbacktran(Integer rollbackTran) {
        this.setRollbackTran(rollbackTran);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO rollbacktran(Boolean rollbackTran) {
        if (rollbackTran == null) {
            this.setRollbackTran(null);
        } else {
            this.setRollbackTran(rollbackTran != false ? 1 : 0);
        }
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
    public PSSysTestCaseDTO targettype(String targetType) {
        this.setTargetType(targetType);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO targettype(PSModelEnums.TestCaseTargetType targetType) {
        if (targetType == null) {
            this.setTargetType(null);
        } else {
            this.setTargetType(targetType.value);
        }
        return this;
    }

    @JsonProperty(value="testcaselevel")
    public void setTestCaseLevel(String testCaseLevel) {
        this._set(DTOFIELD_TESTCASELEVEL, testCaseLevel);
    }

    @JsonIgnore
    public String getTestCaseLevel() {
        Object objValue = this._get(DTOFIELD_TESTCASELEVEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestCaseLevelDirty() {
        return this._contains(DTOFIELD_TESTCASELEVEL);
    }

    @JsonIgnore
    public void resetTestCaseLevel() {
        this._reset(DTOFIELD_TESTCASELEVEL);
    }

    @JsonIgnore
    public PSSysTestCaseDTO testcaselevel(String testCaseLevel) {
        this.setTestCaseLevel(testCaseLevel);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO testcaselevel(PSModelEnums.TestCaseLevel testCaseLevel) {
        if (testCaseLevel == null) {
            this.setTestCaseLevel(null);
        } else {
            this.setTestCaseLevel(testCaseLevel.value);
        }
        return this;
    }

    @JsonProperty(value="testcasesn")
    public void setTestCaseSN(String testCaseSN) {
        this._set(DTOFIELD_TESTCASESN, testCaseSN);
    }

    @JsonIgnore
    public String getTestCaseSN() {
        Object objValue = this._get(DTOFIELD_TESTCASESN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestCaseSNDirty() {
        return this._contains(DTOFIELD_TESTCASESN);
    }

    @JsonIgnore
    public void resetTestCaseSN() {
        this._reset(DTOFIELD_TESTCASESN);
    }

    @JsonIgnore
    public PSSysTestCaseDTO testcasesn(String testCaseSN) {
        this.setTestCaseSN(testCaseSN);
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
    public PSSysTestCaseDTO updatedate(Timestamp updateDate) {
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
    public PSSysTestCaseDTO updateman(String updateMan) {
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
    public PSSysTestCaseDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSSysTestCaseDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSSysTestCaseDTO userdata2(String userData2) {
        this.setUserData2(userData2);
        return this;
    }

    @JsonProperty(value="userdata3")
    public void setUserData3(String userData3) {
        this._set(DTOFIELD_USERDATA3, userData3);
    }

    @JsonIgnore
    public String getUserData3() {
        Object objValue = this._get(DTOFIELD_USERDATA3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData3Dirty() {
        return this._contains(DTOFIELD_USERDATA3);
    }

    @JsonIgnore
    public void resetUserData3() {
        this._reset(DTOFIELD_USERDATA3);
    }

    @JsonIgnore
    public PSSysTestCaseDTO userdata3(String userData3) {
        this.setUserData3(userData3);
        return this;
    }

    @JsonProperty(value="userdata4")
    public void setUserData4(String userData4) {
        this._set(DTOFIELD_USERDATA4, userData4);
    }

    @JsonIgnore
    public String getUserData4() {
        Object objValue = this._get(DTOFIELD_USERDATA4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData4Dirty() {
        return this._contains(DTOFIELD_USERDATA4);
    }

    @JsonIgnore
    public void resetUserData4() {
        this._reset(DTOFIELD_USERDATA4);
    }

    @JsonIgnore
    public PSSysTestCaseDTO userdata4(String userData4) {
        this.setUserData4(userData4);
        return this;
    }

    @JsonProperty(value="userflag")
    public void setUserFlag(Integer userFlag) {
        this._set(DTOFIELD_USERFLAG, userFlag);
    }

    @JsonIgnore
    public Integer getUserFlag() {
        Object objValue = this._get(DTOFIELD_USERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserFlagDirty() {
        return this._contains(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public void resetUserFlag() {
        this._reset(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public PSSysTestCaseDTO userflag(Integer userFlag) {
        this.setUserFlag(userFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO userflag(Boolean userFlag) {
        if (userFlag == null) {
            this.setUserFlag(null);
        } else {
            this.setUserFlag(userFlag != false ? 1 : 0);
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
    public PSSysTestCaseDTO usertag(String userTag) {
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
    public PSSysTestCaseDTO usertag2(String userTag2) {
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
    public PSSysTestCaseDTO usertag3(String userTag3) {
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
    public PSSysTestCaseDTO usertag4(String userTag4) {
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
    public PSSysTestCaseDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTestCaseDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTestCaseId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTestCaseId(strValue);
    }

    @JsonIgnore
    public PSSysTestCaseDTO id(String strValue) {
        this.setPSSysTestCaseId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysTCInputDTO> getPSSysTCInputs() {
        Object list = this._get(DTOFIELD_PSSYSTCINPUTS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssystcinputs")
    public void setPSSysTCInputs(List<PSSysTCInputDTO> pssystcinputs) {
        this._set(DTOFIELD_PSSYSTCINPUTS, pssystcinputs);
    }

    @JsonIgnore
    public List<PSSysTCInputDTO> getPSSysTCInputsIf() {
        Object list = this._get(DTOFIELD_PSSYSTCINPUTS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSTCINPUTS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysTCAssertDTO> getPSSysTCAsserts() {
        Object list = this._get(DTOFIELD_PSSYSTCASSERTS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssystcasserts")
    public void setPSSysTCAsserts(List<PSSysTCAssertDTO> pssystcasserts) {
        this._set(DTOFIELD_PSSYSTCASSERTS, pssystcasserts);
    }

    @JsonIgnore
    public List<PSSysTCAssertDTO> getPSSysTCAssertsIf() {
        Object list = this._get(DTOFIELD_PSSYSTCASSERTS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSTCASSERTS, list);
        }
        return (List)list;
    }
}
