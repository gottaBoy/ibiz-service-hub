package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSubSysSADEFieldDTO extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_EXAMPLEVALUE = "EXAMPLEVALUE";
    protected static final String DTOFIELD_EXAMPLEVALUE = "examplevalue";
    public static final String FIELD_FIELDTAG = "FIELDTAG";
    protected static final String DTOFIELD_FIELDTAG = "fieldtag";
    public static final String FIELD_FIELDTAG2 = "FIELDTAG2";
    protected static final String DTOFIELD_FIELDTAG2 = "fieldtag2";
    public static final String FIELD_FIELDTYPE = "FIELDTYPE";
    protected static final String DTOFIELD_FIELDTYPE = "fieldtype";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAJORFIELD = "MAJORFIELD";
    protected static final String DTOFIELD_MAJORFIELD = "majorfield";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKEY = "PKEY";
    protected static final String DTOFIELD_PKEY = "pkey";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDATATYPEID = "PSDATATYPEID";
    protected static final String DTOFIELD_PSDATATYPEID = "psdatatypeid";
    public static final String FIELD_PSDATATYPENAME = "PSDATATYPENAME";
    protected static final String DTOFIELD_PSDATATYPENAME = "psdatatypename";
    public static final String FIELD_PSSUBSYSSADEFIELDID = "PSSUBSYSSADEFIELDID";
    protected static final String DTOFIELD_PSSUBSYSSADEFIELDID = "pssubsyssadefieldid";
    public static final String FIELD_PSSUBSYSSADEFIELDNAME = "PSSUBSYSSADEFIELDNAME";
    protected static final String DTOFIELD_PSSUBSYSSADEFIELDNAME = "pssubsyssadefieldname";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADENAME = "PSSUBSYSSADENAME";
    protected static final String DTOFIELD_PSSUBSYSSADENAME = "pssubsyssadename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_REFPSSUBSYSSADEID = "REFPSSUBSYSSADEID";
    protected static final String DTOFIELD_REFPSSUBSYSSADEID = "refpssubsyssadeid";
    public static final String FIELD_REFPSSUBSYSSADENAME = "REFPSSUBSYSSADENAME";
    protected static final String DTOFIELD_REFPSSUBSYSSADENAME = "refpssubsyssadename";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO allowempty(Boolean allowEmpty) {
        this.setAllowEmpty(allowEmpty == null ? null : (allowEmpty ? 1 : 0));
        return this;
    }

    @JsonProperty(value="arrayflag")
    public void setArrayFlag(Integer arrayFlag) {
        this._set(DTOFIELD_ARRAYFLAG, arrayFlag);
    }

    @JsonIgnore
    public Integer getArrayFlag() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO arrayflag(Boolean arrayFlag) {
        this.setArrayFlag(arrayFlag == null ? null : (arrayFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="examplevalue")
    public void setExampleValue(String exampleValue) {
        this._set(DTOFIELD_EXAMPLEVALUE, exampleValue);
    }

    @JsonIgnore
    public String getExampleValue() {
        Object objValue = this._get(DTOFIELD_EXAMPLEVALUE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExampleValueDirty() {
        return this._contains(DTOFIELD_EXAMPLEVALUE);
    }

    @JsonIgnore
    public void resetExampleValue() {
        this._reset(DTOFIELD_EXAMPLEVALUE);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO examplevalue(String exampleValue) {
        this.setExampleValue(exampleValue);
        return this;
    }

    @JsonProperty(value="fieldtag")
    public void setFieldTag(String fieldTag) {
        this._set(DTOFIELD_FIELDTAG, fieldTag);
    }

    @JsonIgnore
    public String getFieldTag() {
        Object objValue = this._get(DTOFIELD_FIELDTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldTagDirty() {
        return this._contains(DTOFIELD_FIELDTAG);
    }

    @JsonIgnore
    public void resetFieldTag() {
        this._reset(DTOFIELD_FIELDTAG);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO fieldtag(String fieldTag) {
        this.setFieldTag(fieldTag);
        return this;
    }

    @JsonProperty(value="fieldtag2")
    public void setFieldTag2(String fieldTag2) {
        this._set(DTOFIELD_FIELDTAG2, fieldTag2);
    }

    @JsonIgnore
    public String getFieldTag2() {
        Object objValue = this._get(DTOFIELD_FIELDTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldTag2Dirty() {
        return this._contains(DTOFIELD_FIELDTAG2);
    }

    @JsonIgnore
    public void resetFieldTag2() {
        this._reset(DTOFIELD_FIELDTAG2);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO fieldtag2(String fieldTag2) {
        this.setFieldTag2(fieldTag2);
        return this;
    }

    @JsonProperty(value="fieldtype")
    public void setFieldType(String fieldType) {
        this._set(DTOFIELD_FIELDTYPE, fieldType);
    }

    @JsonIgnore
    public String getFieldType() {
        Object objValue = this._get(DTOFIELD_FIELDTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldTypeDirty() {
        return this._contains(DTOFIELD_FIELDTYPE);
    }

    @JsonIgnore
    public void resetFieldType() {
        this._reset(DTOFIELD_FIELDTYPE);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO fieldtype(String fieldType) {
        this.setFieldType(fieldType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO fieldtype(PSModelEnums.SubSysSADEFieldType fieldType) {
        this.setFieldType(fieldType == null ? null : fieldType.value);
        return this;
    }

    @JsonProperty(value="length")
    public void setLength(Integer length) {
        this._set(DTOFIELD_LENGTH, length);
    }

    @JsonIgnore
    public Integer getLength() {
        Object objValue = this._get(DTOFIELD_LENGTH);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLengthDirty() {
        return this._contains(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public void resetLength() {
        this._reset(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO length(Integer length) {
        this.setLength(length);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="majorfield")
    public void setMajorField(Integer majorField) {
        this._set(DTOFIELD_MAJORFIELD, majorField);
    }

    @JsonIgnore
    public Integer getMajorField() {
        Object objValue = this._get(DTOFIELD_MAJORFIELD);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMajorFieldDirty() {
        return this._contains(DTOFIELD_MAJORFIELD);
    }

    @JsonIgnore
    public void resetMajorField() {
        this._reset(DTOFIELD_MAJORFIELD);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO majorfield(Integer majorField) {
        this.setMajorField(majorField);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO majorfield(Boolean majorField) {
        this.setMajorField(majorField == null ? null : (majorField ? 1 : 0));
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(String maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public String getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) return null;
        return (String)objValue;
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
    public PSSubSysSADEFieldDTO maxvalue(String maxValue) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minstrlength")
    public void setMinStrLength(Integer minStrLength) {
        this._set(DTOFIELD_MINSTRLENGTH, minStrLength);
    }

    @JsonIgnore
    public Integer getMinStrLength() {
        Object objValue = this._get(DTOFIELD_MINSTRLENGTH);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinStrLengthDirty() {
        return this._contains(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public void resetMinStrLength() {
        this._reset(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO minstrlength(Integer minStrLength) {
        this.setMinStrLength(minStrLength);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(String minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public String getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) return null;
        return (String)objValue;
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
    public PSSubSysSADEFieldDTO minvalue(String minValue) {
        this.setMinValue(minValue);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pkey")
    public void setPKey(Integer pKey) {
        this._set(DTOFIELD_PKEY, pKey);
    }

    @JsonIgnore
    public Integer getPKey() {
        Object objValue = this._get(DTOFIELD_PKEY);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPKeyDirty() {
        return this._contains(DTOFIELD_PKEY);
    }

    @JsonIgnore
    public void resetPKey() {
        this._reset(DTOFIELD_PKEY);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pkey(Integer pKey) {
        this.setPKey(pKey);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pkey(PSModelEnums.FieldPKeyMode pKey) {
        this.setPKey(pKey == null ? null : pKey.value);
        return this;
    }

    @JsonProperty(value="precision")
    public void setPrecision(Integer precision) {
        this._set(DTOFIELD_PRECISION, precision);
        this._set(FIELD_PRECISION, precision);
    }

    @JsonIgnore
    public Integer getPrecision() {
        Object objValue = this._get(DTOFIELD_PRECISION);
        if (objValue == null) objValue = this._get(FIELD_PRECISION);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        return this._contains(DTOFIELD_PRECISION) || this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO predefinedtype(PSModelEnums.SubSysSADEFieldPredefinedType predefinedType) {
        this.setPredefinedType(predefinedType == null ? null : predefinedType.value);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdatatypeid")
    public void setPSDataTypeId(String pSDataTypeId) {
        this._set(DTOFIELD_PSDATATYPEID, pSDataTypeId);
    }

    @JsonIgnore
    public String getPSDataTypeId() {
        Object objValue = this._get(DTOFIELD_PSDATATYPEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDataTypeIdDirty() {
        return this._contains(DTOFIELD_PSDATATYPEID);
    }

    @JsonIgnore
    public void resetPSDataTypeId() {
        this._reset(DTOFIELD_PSDATATYPEID);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO psdatatypeid(String pSDataTypeId) {
        this.setPSDataTypeId(pSDataTypeId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO psdatatypeid(PSDEFDataTypeDTO pSDEFDataType) {
        if (pSDEFDataType == null) {
            this.setPSDataTypeId(null);
            this.setPSDataTypeName(null);
        } else {
            this.setPSDataTypeId(pSDEFDataType.getPSDEFDataTypeId());
            this.setPSDataTypeName(pSDEFDataType.getPSDEFDataTypeName());
        }
        return this;
    }

    @JsonProperty(value="psdatatypename")
    public void setPSDataTypeName(String pSDataTypeName) {
        this._set(DTOFIELD_PSDATATYPENAME, pSDataTypeName);
    }

    @JsonIgnore
    public String getPSDataTypeName() {
        Object objValue = this._get(DTOFIELD_PSDATATYPENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDataTypeNameDirty() {
        return this._contains(DTOFIELD_PSDATATYPENAME);
    }

    @JsonIgnore
    public void resetPSDataTypeName() {
        this._reset(DTOFIELD_PSDATATYPENAME);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO psdatatypename(String pSDataTypeName) {
        this.setPSDataTypeName(pSDataTypeName);
        return this;
    }

    @JsonProperty(value="pssubsyssadefieldid")
    public void setPSSubSysSADEFieldId(String pSSubSysSADEFieldId) {
        this._set(DTOFIELD_PSSUBSYSSADEFIELDID, pSSubSysSADEFieldId);
    }

    @JsonIgnore
    public String getPSSubSysSADEFieldId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEFIELDID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEFieldIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEFIELDID);
    }

    @JsonIgnore
    public void resetPSSubSysSADEFieldId() {
        this._reset(DTOFIELD_PSSUBSYSSADEFIELDID);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsyssadefieldid(String pSSubSysSADEFieldId) {
        this.setPSSubSysSADEFieldId(pSSubSysSADEFieldId);
        return this;
    }

    @JsonProperty(value="pssubsyssadefieldname")
    public void setPSSubSysSADEFieldName(String pSSubSysSADEFieldName) {
        this._set(DTOFIELD_PSSUBSYSSADEFIELDNAME, pSSubSysSADEFieldName);
    }

    @JsonIgnore
    public String getPSSubSysSADEFieldName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEFIELDNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEFieldNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEFIELDNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADEFieldName() {
        this._reset(DTOFIELD_PSSUBSYSSADEFIELDNAME);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsyssadefieldname(String pSSubSysSADEFieldName) {
        this.setPSSubSysSADEFieldName(pSSubSysSADEFieldName);
        return this;
    }

    @JsonProperty(value="pssubsyssadeid")
    public void setPSSubSysSADEId(String pSSubSysSADEId) {
        this._set(DTOFIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }

    @JsonIgnore
    public String getPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetPSSubSysSADEId() {
        this._reset(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsyssadeid(String pSSubSysSADEId) {
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
            this.setPSSubSysServiceAPIId(null);
        } else {
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
            this.setPSSubSysServiceAPIId(pSSubSysSADE.getPSSubSysServiceAPIId());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadename")
    public void setPSSubSysSADEName(String pSSubSysSADEName) {
        this._set(DTOFIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }

    @JsonIgnore
    public String getPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADEName() {
        this._reset(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsyssadename(String pSSubSysSADEName) {
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="refpssubsyssadeid")
    public void setRefPSSubSysSADEId(String refPSSubSysSADEId) {
        this._set(DTOFIELD_REFPSSUBSYSSADEID, refPSSubSysSADEId);
    }

    @JsonIgnore
    public String getRefPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_REFPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_REFPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetRefPSSubSysSADEId() {
        this._reset(DTOFIELD_REFPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO refpssubsyssadeid(String refPSSubSysSADEId) {
        this.setRefPSSubSysSADEId(refPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO refpssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setRefPSSubSysSADEId(null);
            this.setRefPSSubSysSADEName(null);
        } else {
            this.setRefPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setRefPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="refpssubsyssadename")
    public void setRefPSSubSysSADEName(String refPSSubSysSADEName) {
        this._set(DTOFIELD_REFPSSUBSYSSADENAME, refPSSubSysSADEName);
    }

    @JsonIgnore
    public String getRefPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_REFPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_REFPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetRefPSSubSysSADEName() {
        this._reset(DTOFIELD_REFPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO refpssubsyssadename(String refPSSubSysSADEName) {
        this.setRefPSSubSysSADEName(refPSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        this.setStdDataType(stdDataType == null ? null : stdDataType.value);
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO usertag2(String userTag2) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO usertag3(String userTag3) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO usertag4(String userTag4) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADEFieldDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSubSysSADEFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSubSysSADEFieldName(strName);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO name(String strName) {
        this.setPSSubSysSADEFieldName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSubSysSADEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSubSysSADEFieldId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADEFieldDTO id(String strValue) {
        this.setPSSubSysSADEFieldId(strValue);
        return this;
    }

}
