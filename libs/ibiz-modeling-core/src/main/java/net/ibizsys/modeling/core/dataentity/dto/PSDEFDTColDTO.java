package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFDTColDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDATATYPE = "CUSTOMDATATYPE";
    protected static final String DTOFIELD_CUSTOMDATATYPE = "customdatatype";
    public static final String FIELD_DATATYPE = "DATATYPE";
    protected static final String DTOFIELD_DATATYPE = "datatype";
    public static final String FIELD_DBTYPE = "DBTYPE";
    protected static final String DTOFIELD_DBTYPE = "dbtype";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_FORMULAFIELDS = "FORMULAFIELDS";
    protected static final String DTOFIELD_FORMULAFIELDS = "formulafields";
    public static final String FIELD_FORMULAFORMAT = "FORMULAFORMAT";
    protected static final String DTOFIELD_FORMULAFORMAT = "formulaformat";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NULLVALORDER = "NULLVALORDER";
    protected static final String DTOFIELD_NULLVALORDER = "nullvalorder";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSDEFDTCOLID = "PSDEFDTCOLID";
    protected static final String DTOFIELD_PSDEFDTCOLID = "psdefdtcolid";
    public static final String FIELD_PSDEFDTCOLNAME = "PSDEFDTCOLNAME";
    protected static final String DTOFIELD_PSDEFDTCOLNAME = "psdefdtcolname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_TABLENAME = "TABLENAME";
    protected static final String DTOFIELD_TABLENAME = "tablename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALUEFUNC2FIELDS = "VALUEFUNC2FIELDS";
    protected static final String DTOFIELD_VALUEFUNC2FIELDS = "valuefunc2fields";
    public static final String FIELD_VALUEFUNC2FORMAT = "VALUEFUNC2FORMAT";
    protected static final String DTOFIELD_VALUEFUNC2FORMAT = "valuefunc2format";
    public static final String FIELD_VALUEFUNCFIELDS = "VALUEFUNCFIELDS";
    protected static final String DTOFIELD_VALUEFUNCFIELDS = "valuefuncfields";
    public static final String FIELD_VALUEFUNCFORMAT = "VALUEFUNCFORMAT";
    protected static final String DTOFIELD_VALUEFUNCFORMAT = "valuefuncformat";

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
    public PSDEFDTColDTO createdate(Timestamp createDate) {
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
    public PSDEFDTColDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdatatype")
    public void setCustomDataType(Integer customDataType) {
        this._set(DTOFIELD_CUSTOMDATATYPE, customDataType);
    }

    @JsonIgnore
    public Integer getCustomDataType() {
        Object objValue = this._get(DTOFIELD_CUSTOMDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomDataTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMDATATYPE);
    }

    @JsonIgnore
    public void resetCustomDataType() {
        this._reset(DTOFIELD_CUSTOMDATATYPE);
    }

    @JsonIgnore
    public PSDEFDTColDTO customdatatype(Integer customDataType) {
        this.setCustomDataType(customDataType);
        return this;
    }

    @JsonIgnore
    public PSDEFDTColDTO customdatatype(Boolean customDataType) {
        if (customDataType == null) {
            this.setCustomDataType(null);
        } else {
            this.setCustomDataType(customDataType != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="datatype")
    public void setDataType(String dataType) {
        this._set(DTOFIELD_DATATYPE, dataType);
    }

    @JsonIgnore
    public String getDataType() {
        Object objValue = this._get(DTOFIELD_DATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypeDirty() {
        return this._contains(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public void resetDataType() {
        this._reset(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public PSDEFDTColDTO datatype(String dataType) {
        this.setDataType(dataType);
        return this;
    }

    @JsonProperty(value="dbtype")
    public void setDBType(String dBType) {
        this._set(DTOFIELD_DBTYPE, dBType);
    }

    @JsonIgnore
    public String getDBType() {
        Object objValue = this._get(DTOFIELD_DBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypeDirty() {
        return this._contains(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public void resetDBType() {
        this._reset(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public PSDEFDTColDTO dbtype(String dBType) {
        this.setDBType(dBType);
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
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
    public PSDEFDTColDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="formulafields")
    public void setFormulaFields(String formulaFields) {
        this._set(DTOFIELD_FORMULAFIELDS, formulaFields);
    }

    @JsonIgnore
    public String getFormulaFields() {
        Object objValue = this._get(DTOFIELD_FORMULAFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormulaFieldsDirty() {
        return this._contains(DTOFIELD_FORMULAFIELDS);
    }

    @JsonIgnore
    public void resetFormulaFields() {
        this._reset(DTOFIELD_FORMULAFIELDS);
    }

    @JsonIgnore
    public PSDEFDTColDTO formulafields(String formulaFields) {
        this.setFormulaFields(formulaFields);
        return this;
    }

    @JsonProperty(value="formulaformat")
    public void setFormulaFormat(String formulaFormat) {
        this._set(DTOFIELD_FORMULAFORMAT, formulaFormat);
    }

    @JsonIgnore
    public String getFormulaFormat() {
        Object objValue = this._get(DTOFIELD_FORMULAFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormulaFormatDirty() {
        return this._contains(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public void resetFormulaFormat() {
        this._reset(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public PSDEFDTColDTO formulaformat(String formulaFormat) {
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    @JsonProperty(value="length")
    public void setLength(Integer length) {
        this._set(DTOFIELD_LENGTH, length);
    }

    @JsonIgnore
    public Integer getLength() {
        Object objValue = this._get(DTOFIELD_LENGTH);
        if (objValue == null) {
            return null;
        }
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
    public PSDEFDTColDTO length(Integer length) {
        this.setLength(length);
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
    public PSDEFDTColDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nullvalorder")
    public void setNullValOrder(String nullValOrder) {
        this._set(DTOFIELD_NULLVALORDER, nullValOrder);
    }

    @JsonIgnore
    public String getNullValOrder() {
        Object objValue = this._get(DTOFIELD_NULLVALORDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNullValOrderDirty() {
        return this._contains(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public void resetNullValOrder() {
        this._reset(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public PSDEFDTColDTO nullvalorder(String nullValOrder) {
        this.setNullValOrder(nullValOrder);
        return this;
    }

    @JsonIgnore
    public PSDEFDTColDTO nullvalorder(PSModelEnums.DBNullValueOrderMode nullValOrder) {
        if (nullValOrder == null) {
            this.setNullValOrder(null);
        } else {
            this.setNullValOrder(nullValOrder.value);
        }
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
        if (objValue == null && (objValue = this._get(FIELD_PRECISION)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        if (this._contains(DTOFIELD_PRECISION)) {
            return true;
        }
        return this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSDEFDTColDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2() {
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated
    public void setPrecision2(Integer precision2) {
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty() {
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2() {
        this.resetPrecision();
    }

    @JsonProperty(value="psdefdtcolid")
    public void setPSDEFDTColId(String pSDEFDTColId) {
        this._set(DTOFIELD_PSDEFDTCOLID, pSDEFDTColId);
    }

    @JsonIgnore
    public String getPSDEFDTColId() {
        Object objValue = this._get(DTOFIELD_PSDEFDTCOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDTColIdDirty() {
        return this._contains(DTOFIELD_PSDEFDTCOLID);
    }

    @JsonIgnore
    public void resetPSDEFDTColId() {
        this._reset(DTOFIELD_PSDEFDTCOLID);
    }

    @JsonIgnore
    public PSDEFDTColDTO psdefdtcolid(String pSDEFDTColId) {
        this.setPSDEFDTColId(pSDEFDTColId);
        return this;
    }

    @JsonProperty(value="psdefdtcolname")
    public void setPSDEFDTColName(String pSDEFDTColName) {
        this._set(DTOFIELD_PSDEFDTCOLNAME, pSDEFDTColName);
    }

    @JsonIgnore
    public String getPSDEFDTColName() {
        Object objValue = this._get(DTOFIELD_PSDEFDTCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDTColNameDirty() {
        return this._contains(DTOFIELD_PSDEFDTCOLNAME);
    }

    @JsonIgnore
    public void resetPSDEFDTColName() {
        this._reset(DTOFIELD_PSDEFDTCOLNAME);
    }

    @JsonIgnore
    public PSDEFDTColDTO psdefdtcolname(String pSDEFDTColName) {
        this.setPSDEFDTColName(pSDEFDTColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFDTColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFDTColName(strName);
    }

    @JsonIgnore
    public PSDEFDTColDTO name(String strName) {
        this.setPSDEFDTColName(strName);
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
    public PSDEFDTColDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFDTColDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setTableName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
            this.setPSDEName(pSDEField.getPSDEName());
            this.setTableName(pSDEField.getTableName());
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
    public PSDEFDTColDTO psdefname(String pSDEFName) {
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
    public PSDEFDTColDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEFDTColDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="tablename")
    public void setTableName(String tableName) {
        this._set(DTOFIELD_TABLENAME, tableName);
    }

    @JsonIgnore
    public String getTableName() {
        Object objValue = this._get(DTOFIELD_TABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableNameDirty() {
        return this._contains(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public void resetTableName() {
        this._reset(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public PSDEFDTColDTO tablename(String tableName) {
        this.setTableName(tableName);
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
    public PSDEFDTColDTO updatedate(Timestamp updateDate) {
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
    public PSDEFDTColDTO updateman(String updateMan) {
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
    public PSDEFDTColDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFDTColDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDEFDTColDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDEFDTColDTO usertag(String userTag) {
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
    public PSDEFDTColDTO usertag2(String userTag2) {
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
    public PSDEFDTColDTO usertag3(String userTag3) {
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
    public PSDEFDTColDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="valuefunc2fields")
    public void setValueFunc2Fields(String valueFunc2Fields) {
        this._set(DTOFIELD_VALUEFUNC2FIELDS, valueFunc2Fields);
    }

    @JsonIgnore
    public String getValueFunc2Fields() {
        Object objValue = this._get(DTOFIELD_VALUEFUNC2FIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFunc2FieldsDirty() {
        return this._contains(DTOFIELD_VALUEFUNC2FIELDS);
    }

    @JsonIgnore
    public void resetValueFunc2Fields() {
        this._reset(DTOFIELD_VALUEFUNC2FIELDS);
    }

    @JsonIgnore
    public PSDEFDTColDTO valuefunc2fields(String valueFunc2Fields) {
        this.setValueFunc2Fields(valueFunc2Fields);
        return this;
    }

    @JsonProperty(value="valuefunc2format")
    public void setValueFunc2Format(String valueFunc2Format) {
        this._set(DTOFIELD_VALUEFUNC2FORMAT, valueFunc2Format);
    }

    @JsonIgnore
    public String getValueFunc2Format() {
        Object objValue = this._get(DTOFIELD_VALUEFUNC2FORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFunc2FormatDirty() {
        return this._contains(DTOFIELD_VALUEFUNC2FORMAT);
    }

    @JsonIgnore
    public void resetValueFunc2Format() {
        this._reset(DTOFIELD_VALUEFUNC2FORMAT);
    }

    @JsonIgnore
    public PSDEFDTColDTO valuefunc2format(String valueFunc2Format) {
        this.setValueFunc2Format(valueFunc2Format);
        return this;
    }

    @JsonProperty(value="valuefuncfields")
    public void setValueFuncFields(String valueFuncFields) {
        this._set(DTOFIELD_VALUEFUNCFIELDS, valueFuncFields);
    }

    @JsonIgnore
    public String getValueFuncFields() {
        Object objValue = this._get(DTOFIELD_VALUEFUNCFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFuncFieldsDirty() {
        return this._contains(DTOFIELD_VALUEFUNCFIELDS);
    }

    @JsonIgnore
    public void resetValueFuncFields() {
        this._reset(DTOFIELD_VALUEFUNCFIELDS);
    }

    @JsonIgnore
    public PSDEFDTColDTO valuefuncfields(String valueFuncFields) {
        this.setValueFuncFields(valueFuncFields);
        return this;
    }

    @JsonProperty(value="valuefuncformat")
    public void setValueFuncFormat(String valueFuncFormat) {
        this._set(DTOFIELD_VALUEFUNCFORMAT, valueFuncFormat);
    }

    @JsonIgnore
    public String getValueFuncFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFUNCFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFuncFormatDirty() {
        return this._contains(DTOFIELD_VALUEFUNCFORMAT);
    }

    @JsonIgnore
    public void resetValueFuncFormat() {
        this._reset(DTOFIELD_VALUEFUNCFORMAT);
    }

    @JsonIgnore
    public PSDEFDTColDTO valuefuncformat(String valueFuncFormat) {
        this.setValueFuncFormat(valueFuncFormat);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFDTColId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFDTColId(strValue);
    }

    @JsonIgnore
    public PSDEFDTColDTO id(String strValue) {
        this.setPSDEFDTColId(strValue);
        return this;
    }
}
