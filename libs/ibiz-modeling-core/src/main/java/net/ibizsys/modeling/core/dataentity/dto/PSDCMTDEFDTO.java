package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCMTDEFDTO extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFDATATYPE = "DEFDATATYPE";
    protected static final String DTOFIELD_DEFDATATYPE = "defdatatype";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAJORFIELD = "MAJORFIELD";
    protected static final String DTOFIELD_MAJORFIELD = "majorfield";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKEY = "PKEY";
    protected static final String DTOFIELD_PKEY = "pkey";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSDCMODELTEMPLID = "PSDCMODELTEMPLID";
    protected static final String DTOFIELD_PSDCMODELTEMPLID = "psdcmodeltemplid";
    public static final String FIELD_PSDCMODELTEMPLNAME = "PSDCMODELTEMPLNAME";
    protected static final String DTOFIELD_PSDCMODELTEMPLNAME = "psdcmodeltemplname";
    public static final String FIELD_PSDCMTDEFID = "PSDCMTDEFID";
    protected static final String DTOFIELD_PSDCMTDEFID = "psdcmtdefid";
    public static final String FIELD_PSDCMTDEFNAME = "PSDCMTDEFNAME";
    protected static final String DTOFIELD_PSDCMTDEFNAME = "psdcmtdefname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSDCMTDEFDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO allowempty(Boolean allowEmpty) {
        this.setAllowEmpty(allowEmpty == null ? null : (allowEmpty ? 1 : 0));
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
    public PSDCMTDEFDTO codename(String codeName) {
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
    public PSDCMTDEFDTO createdate(Timestamp createDate) {
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
    public PSDCMTDEFDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defdatatype")
    public void setDEFDataType(String dEFDataType) {
        this._set(DTOFIELD_DEFDATATYPE, dEFDataType);
    }

    @JsonIgnore
    public String getDEFDataType() {
        Object objValue = this._get(DTOFIELD_DEFDATATYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFDataTypeDirty() {
        return this._contains(DTOFIELD_DEFDATATYPE);
    }

    @JsonIgnore
    public void resetDEFDataType() {
        this._reset(DTOFIELD_DEFDATATYPE);
    }

    @JsonIgnore
    public PSDCMTDEFDTO defdatatype(String dEFDataType) {
        this.setDEFDataType(dEFDataType);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO defdatatype(PSModelEnums.SimpleDEFDataType dEFDataType) {
        this.setDEFDataType(dEFDataType == null ? null : dEFDataType.value);
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
    public PSDCMTDEFDTO length(Integer length) {
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
    public PSDCMTDEFDTO logicname(String logicName) {
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
    public PSDCMTDEFDTO majorfield(Integer majorField) {
        this.setMajorField(majorField);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO majorfield(Boolean majorField) {
        this.setMajorField(majorField == null ? null : (majorField ? 1 : 0));
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
    public PSDCMTDEFDTO memo(String memo) {
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
    public PSDCMTDEFDTO ordervalue(Integer orderValue) {
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
    public PSDCMTDEFDTO pkey(Integer pKey) {
        this.setPKey(pKey);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO pkey(Boolean pKey) {
        this.setPKey(pKey == null ? null : (pKey ? 1 : 0));
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
    public PSDCMTDEFDTO precision(Integer precision) {
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
    public PSDCMTDEFDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO predefinedtype(PSModelEnums.PredefinedFieldType predefinedType) {
        this.setPredefinedType(predefinedType == null ? null : predefinedType.value);
        return this;
    }

    @JsonProperty(value="psdcmodeltemplid")
    public void setPSDCModelTemplId(String pSDCModelTemplId) {
        this._set(DTOFIELD_PSDCMODELTEMPLID, pSDCModelTemplId);
    }

    @JsonIgnore
    public String getPSDCModelTemplId() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplIdDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public void resetPSDCModelTemplId() {
        this._reset(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public PSDCMTDEFDTO psdcmodeltemplid(String pSDCModelTemplId) {
        this.setPSDCModelTemplId(pSDCModelTemplId);
        return this;
    }

    @JsonIgnore
    public PSDCMTDEFDTO psdcmodeltemplid(PSDCModelTemplDTO pSDCModelTempl) {
        if (pSDCModelTempl == null) {
            this.setPSDCModelTemplId(null);
            this.setPSDCModelTemplName(null);
        } else {
            this.setPSDCModelTemplId(pSDCModelTempl.getPSDCModelTemplId());
            this.setPSDCModelTemplName(pSDCModelTempl.getPSDCModelTemplName());
        }
        return this;
    }

    @JsonProperty(value="psdcmodeltemplname")
    public void setPSDCModelTemplName(String pSDCModelTemplName) {
        this._set(DTOFIELD_PSDCMODELTEMPLNAME, pSDCModelTemplName);
    }

    @JsonIgnore
    public String getPSDCModelTemplName() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplNameDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDCModelTemplName() {
        this._reset(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public PSDCMTDEFDTO psdcmodeltemplname(String pSDCModelTemplName) {
        this.setPSDCModelTemplName(pSDCModelTemplName);
        return this;
    }

    @JsonProperty(value="psdcmtdefid")
    public void setPSDCMTDEFId(String pSDCMTDEFId) {
        this._set(DTOFIELD_PSDCMTDEFID, pSDCMTDEFId);
    }

    @JsonIgnore
    public String getPSDCMTDEFId() {
        Object objValue = this._get(DTOFIELD_PSDCMTDEFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMTDEFIdDirty() {
        return this._contains(DTOFIELD_PSDCMTDEFID);
    }

    @JsonIgnore
    public void resetPSDCMTDEFId() {
        this._reset(DTOFIELD_PSDCMTDEFID);
    }

    @JsonIgnore
    public PSDCMTDEFDTO psdcmtdefid(String pSDCMTDEFId) {
        this.setPSDCMTDEFId(pSDCMTDEFId);
        return this;
    }

    @JsonProperty(value="psdcmtdefname")
    public void setPSDCMTDEFName(String pSDCMTDEFName) {
        this._set(DTOFIELD_PSDCMTDEFNAME, pSDCMTDEFName);
    }

    @JsonIgnore
    public String getPSDCMTDEFName() {
        Object objValue = this._get(DTOFIELD_PSDCMTDEFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMTDEFNameDirty() {
        return this._contains(DTOFIELD_PSDCMTDEFNAME);
    }

    @JsonIgnore
    public void resetPSDCMTDEFName() {
        this._reset(DTOFIELD_PSDCMTDEFNAME);
    }

    @JsonIgnore
    public PSDCMTDEFDTO psdcmtdefname(String pSDCMTDEFName) {
        this.setPSDCMTDEFName(pSDCMTDEFName);
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
    public PSDCMTDEFDTO updatedate(Timestamp updateDate) {
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
    public PSDCMTDEFDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCMTDEFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCMTDEFName(strName);
    }

    @JsonIgnore
    public PSDCMTDEFDTO name(String strName) {
        this.setPSDCMTDEFName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCMTDEFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCMTDEFId(strValue);
    }

    @JsonIgnore
    public PSDCMTDEFDTO id(String strValue) {
        this.setPSDCMTDEFId(strValue);
        return this;
    }

}
