package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTCInputDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestCaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTCAssertDTO
extends PSModelDTOBase {
    public static final String FIELD_ASSERTRESULT = "ASSERTRESULT";
    protected static final String DTOFIELD_ASSERTRESULT = "assertresult";
    public static final String FIELD_ASSERTTAG = "ASSERTTAG";
    protected static final String DTOFIELD_ASSERTTAG = "asserttag";
    public static final String FIELD_ASSERTTAG2 = "ASSERTTAG2";
    protected static final String DTOFIELD_ASSERTTAG2 = "asserttag2";
    public static final String FIELD_ASSERTTAG3 = "ASSERTTAG3";
    protected static final String DTOFIELD_ASSERTTAG3 = "asserttag3";
    public static final String FIELD_ASSERTTAG4 = "ASSERTTAG4";
    protected static final String DTOFIELD_ASSERTTAG4 = "asserttag4";
    public static final String FIELD_ASSERTTYPE = "ASSERTTYPE";
    protected static final String DTOFIELD_ASSERTTYPE = "asserttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DSTKEYPSDEFID = "DSTKEYPSDEFID";
    protected static final String DTOFIELD_DSTKEYPSDEFID = "dstkeypsdefid";
    public static final String FIELD_DSTKEYPSDEFNAME = "DSTKEYPSDEFNAME";
    protected static final String DTOFIELD_DSTKEYPSDEFNAME = "dstkeypsdefname";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_DSTPSDENAME = "DSTPSDENAME";
    protected static final String DTOFIELD_DSTPSDENAME = "dstpsdename";
    public static final String FIELD_EXCEPTIONDATA = "EXCEPTIONDATA";
    protected static final String DTOFIELD_EXCEPTIONDATA = "exceptiondata";
    public static final String FIELD_EXCEPTIONDATA2 = "EXCEPTIONDATA2";
    protected static final String DTOFIELD_EXCEPTIONDATA2 = "exceptiondata2";
    public static final String FIELD_EXCEPTIONNAME = "EXCEPTIONNAME";
    protected static final String DTOFIELD_EXCEPTIONNAME = "exceptionname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSTCASSERTID = "PSSYSTCASSERTID";
    protected static final String DTOFIELD_PSSYSTCASSERTID = "pssystcassertid";
    public static final String FIELD_PSSYSTCASSERTNAME = "PSSYSTCASSERTNAME";
    protected static final String DTOFIELD_PSSYSTCASSERTNAME = "pssystcassertname";
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
    public PSSysTCAssertDTO assertresult(String assertResult) {
        this.setAssertResult(assertResult);
        return this;
    }

    @JsonProperty(value="asserttag")
    public void setAssertTag(String assertTag) {
        this._set(DTOFIELD_ASSERTTAG, assertTag);
    }

    @JsonIgnore
    public String getAssertTag() {
        Object objValue = this._get(DTOFIELD_ASSERTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertTagDirty() {
        return this._contains(DTOFIELD_ASSERTTAG);
    }

    @JsonIgnore
    public void resetAssertTag() {
        this._reset(DTOFIELD_ASSERTTAG);
    }

    @JsonIgnore
    public PSSysTCAssertDTO asserttag(String assertTag) {
        this.setAssertTag(assertTag);
        return this;
    }

    @JsonProperty(value="asserttag2")
    public void setAssertTag2(String assertTag2) {
        this._set(DTOFIELD_ASSERTTAG2, assertTag2);
    }

    @JsonIgnore
    public String getAssertTag2() {
        Object objValue = this._get(DTOFIELD_ASSERTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertTag2Dirty() {
        return this._contains(DTOFIELD_ASSERTTAG2);
    }

    @JsonIgnore
    public void resetAssertTag2() {
        this._reset(DTOFIELD_ASSERTTAG2);
    }

    @JsonIgnore
    public PSSysTCAssertDTO asserttag2(String assertTag2) {
        this.setAssertTag2(assertTag2);
        return this;
    }

    @JsonProperty(value="asserttag3")
    public void setAssertTag3(String assertTag3) {
        this._set(DTOFIELD_ASSERTTAG3, assertTag3);
    }

    @JsonIgnore
    public String getAssertTag3() {
        Object objValue = this._get(DTOFIELD_ASSERTTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertTag3Dirty() {
        return this._contains(DTOFIELD_ASSERTTAG3);
    }

    @JsonIgnore
    public void resetAssertTag3() {
        this._reset(DTOFIELD_ASSERTTAG3);
    }

    @JsonIgnore
    public PSSysTCAssertDTO asserttag3(String assertTag3) {
        this.setAssertTag3(assertTag3);
        return this;
    }

    @JsonProperty(value="asserttag4")
    public void setAssertTag4(String assertTag4) {
        this._set(DTOFIELD_ASSERTTAG4, assertTag4);
    }

    @JsonIgnore
    public String getAssertTag4() {
        Object objValue = this._get(DTOFIELD_ASSERTTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAssertTag4Dirty() {
        return this._contains(DTOFIELD_ASSERTTAG4);
    }

    @JsonIgnore
    public void resetAssertTag4() {
        this._reset(DTOFIELD_ASSERTTAG4);
    }

    @JsonIgnore
    public PSSysTCAssertDTO asserttag4(String assertTag4) {
        this.setAssertTag4(assertTag4);
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
    public PSSysTCAssertDTO asserttype(String assertType) {
        this.setAssertType(assertType);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO asserttype(PSModelEnums.TestCaseAssertType assertType) {
        if (assertType == null) {
            this.setAssertType(null);
        } else {
            this.setAssertType(assertType.value);
        }
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
    public PSSysTCAssertDTO createdate(Timestamp createDate) {
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
    public PSSysTCAssertDTO createman(String createMan) {
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
    public PSSysTCAssertDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="dstkeypsdefid")
    public void setDstKeyPSDEFId(String dstKeyPSDEFId) {
        this._set(DTOFIELD_DSTKEYPSDEFID, dstKeyPSDEFId);
    }

    @JsonIgnore
    public String getDstKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_DSTKEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_DSTKEYPSDEFID);
    }

    @JsonIgnore
    public void resetDstKeyPSDEFId() {
        this._reset(DTOFIELD_DSTKEYPSDEFID);
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefid(String dstKeyPSDEFId) {
        this.setDstKeyPSDEFId(dstKeyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDstKeyPSDEFId(null);
            this.setDstKeyPSDEFName(null);
        } else {
            this.setDstKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setDstKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="dstkeypsdefname")
    public void setDstKeyPSDEFName(String dstKeyPSDEFName) {
        this._set(DTOFIELD_DSTKEYPSDEFNAME, dstKeyPSDEFName);
    }

    @JsonIgnore
    public String getDstKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_DSTKEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_DSTKEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetDstKeyPSDEFName() {
        this._reset(DTOFIELD_DSTKEYPSDEFNAME);
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefname(String dstKeyPSDEFName) {
        this.setDstKeyPSDEFName(dstKeyPSDEFName);
        return this;
    }

    @JsonProperty(value="dstpsdeid")
    public void setDstPSDEId(String dstPSDEId) {
        this._set(DTOFIELD_DSTPSDEID, dstPSDEId);
    }

    @JsonIgnore
    public String getDstPSDEId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public void resetDstPSDEId() {
        this._reset(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstpsdeid(String dstPSDEId) {
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setDstPSDEId(null);
            this.setDstPSDEName(null);
        } else {
            this.setDstPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDstPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdename")
    public void setDstPSDEName(String dstPSDEName) {
        this._set(DTOFIELD_DSTPSDENAME, dstPSDEName);
    }

    @JsonIgnore
    public String getDstPSDEName() {
        Object objValue = this._get(DTOFIELD_DSTPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDENameDirty() {
        return this._contains(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public void resetDstPSDEName() {
        this._reset(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public PSSysTCAssertDTO dstpsdename(String dstPSDEName) {
        this.setDstPSDEName(dstPSDEName);
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
    public PSSysTCAssertDTO exceptiondata(String exceptionData) {
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
    public PSSysTCAssertDTO exceptiondata2(String exceptionData2) {
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
    public PSSysTCAssertDTO exceptionname(String exceptionName) {
        this.setExceptionName(exceptionName);
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
    public PSSysTCAssertDTO memo(String memo) {
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
    public PSSysTCAssertDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysTCAssertDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssystcassertid")
    public void setPSSysTCAssertId(String pSSysTCAssertId) {
        this._set(DTOFIELD_PSSYSTCASSERTID, pSSysTCAssertId);
    }

    @JsonIgnore
    public String getPSSysTCAssertId() {
        Object objValue = this._get(DTOFIELD_PSSYSTCASSERTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTCAssertIdDirty() {
        return this._contains(DTOFIELD_PSSYSTCASSERTID);
    }

    @JsonIgnore
    public void resetPSSysTCAssertId() {
        this._reset(DTOFIELD_PSSYSTCASSERTID);
    }

    @JsonIgnore
    public PSSysTCAssertDTO pssystcassertid(String pSSysTCAssertId) {
        this.setPSSysTCAssertId(pSSysTCAssertId);
        return this;
    }

    @JsonProperty(value="pssystcassertname")
    public void setPSSysTCAssertName(String pSSysTCAssertName) {
        this._set(DTOFIELD_PSSYSTCASSERTNAME, pSSysTCAssertName);
    }

    @JsonIgnore
    public String getPSSysTCAssertName() {
        Object objValue = this._get(DTOFIELD_PSSYSTCASSERTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTCAssertNameDirty() {
        return this._contains(DTOFIELD_PSSYSTCASSERTNAME);
    }

    @JsonIgnore
    public void resetPSSysTCAssertName() {
        this._reset(DTOFIELD_PSSYSTCASSERTNAME);
    }

    @JsonIgnore
    public PSSysTCAssertDTO pssystcassertname(String pSSysTCAssertName) {
        this.setPSSysTCAssertName(pSSysTCAssertName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTCAssertName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTCAssertName(strName);
    }

    @JsonIgnore
    public PSSysTCAssertDTO name(String strName) {
        this.setPSSysTCAssertName(strName);
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
    public PSSysTCAssertDTO pssystcinputid(String pSSysTCInputId) {
        this.setPSSysTCInputId(pSSysTCInputId);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO pssystcinputid(PSSysTCInputDTO pSSysTCInput) {
        if (pSSysTCInput == null) {
            this.setPSSysTCInputId(null);
            this.setPSSysTCInputName(null);
        } else {
            this.setPSSysTCInputId(pSSysTCInput.getPSSysTCInputId());
            this.setPSSysTCInputName(pSSysTCInput.getPSSysTCInputName());
        }
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
    public PSSysTCAssertDTO pssystcinputname(String pSSysTCInputName) {
        this.setPSSysTCInputName(pSSysTCInputName);
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
    public PSSysTCAssertDTO pssystestcaseid(String pSSysTestCaseId) {
        this.setPSSysTestCaseId(pSSysTestCaseId);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO pssystestcaseid(PSSysTestCaseDTO pSSysTestCase) {
        if (pSSysTestCase == null) {
            this.setPSDEId(null);
            this.setPSSysTestCaseId(null);
            this.setPSSysTestCaseName(null);
            this.setTargetType(null);
        } else {
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
    public PSSysTCAssertDTO pssystestcasename(String pSSysTestCaseName) {
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
    public PSSysTCAssertDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO pssystestdataid(PSSysTestDataDTO pSSysTestData) {
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
    public PSSysTCAssertDTO pssystestdataname(String pSSysTestDataName) {
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
    public PSSysTCAssertDTO targettype(String targetType) {
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
    public PSSysTCAssertDTO testdatasn(Integer testDataSN) {
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
    public PSSysTCAssertDTO updatedate(Timestamp updateDate) {
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
    public PSSysTCAssertDTO updateman(String updateMan) {
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
    public PSSysTCAssertDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysTCAssertDTO usertag(String userTag) {
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
    public PSSysTCAssertDTO usertag2(String userTag2) {
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
    public PSSysTCAssertDTO usertag3(String userTag3) {
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
    public PSSysTCAssertDTO usertag4(String userTag4) {
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
    public PSSysTCAssertDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTCAssertDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTCAssertId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTCAssertId(strValue);
    }

    @JsonIgnore
    public PSSysTCAssertDTO id(String strValue) {
        this.setPSSysTCAssertId(strValue);
        return this;
    }
}
