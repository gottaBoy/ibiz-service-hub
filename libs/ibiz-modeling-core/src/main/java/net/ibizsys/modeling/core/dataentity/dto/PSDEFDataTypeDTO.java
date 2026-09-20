package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFDataTypeDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DB2DATATYPE = "DB2DATATYPE";
    protected static final String DTOFIELD_DB2DATATYPE = "db2datatype";
    public static final String FIELD_ENABLEUSERCREATE = "ENABLEUSERCREATE";
    protected static final String DTOFIELD_ENABLEUSERCREATE = "enableusercreate";
    public static final String FIELD_EXPHYFLAG = "EXPHYFLAG";
    protected static final String DTOFIELD_EXPHYFLAG = "exphyflag";
    public static final String FIELD_FORMULARFLAG = "FORMULAFLAG";
    protected static final String DTOFIELD_FORMULARFLAG = "formularflag";
    public static final String FIELD_INTDATATYPE = "INTDATATYPE";
    protected static final String DTOFIELD_INTDATATYPE = "intdatatype";
    public static final String FIELD_INTDATATYPE2 = "INTDATATYPE2";
    protected static final String DTOFIELD_INTDATATYPE2 = "intdatatype2";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LINKFLAG = "LINKFLAG";
    protected static final String DTOFIELD_LINKFLAG = "linkflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSSQLDATATYPE = "MSSQLDATATYPE";
    protected static final String DTOFIELD_MSSQLDATATYPE = "mssqldatatype";
    public static final String FIELD_MYSQLDATATYPE = "MYSQLDATATYPE";
    protected static final String DTOFIELD_MYSQLDATATYPE = "mysqldatatype";
    public static final String FIELD_ORACLEDATATYPE = "ORACLEDATATYPE";
    protected static final String DTOFIELD_ORACLEDATATYPE = "oracledatatype";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PHYSICALFLAG = "PHYSICALFLAG";
    protected static final String DTOFIELD_PHYSICALFLAG = "physicalflag";
    public static final String FIELD_POSTGRESQLTYPE = "POSTGRESQLTYPE";
    protected static final String DTOFIELD_POSTGRESQLTYPE = "postgresqltype";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSDEFDATATYPEID = "PSDEFDATATYPEID";
    protected static final String DTOFIELD_PSDEFDATATYPEID = "psdefdatatypeid";
    public static final String FIELD_PSDEFDATATYPENAME = "PSDEFDATATYPENAME";
    protected static final String DTOFIELD_PSDEFDATATYPENAME = "psdefdatatypename";
    public static final String FIELD_PSUNITID = "PSUNITID";
    protected static final String DTOFIELD_PSUNITID = "psunitid";
    public static final String FIELD_PSUNITNAME = "PSUNITNAME";
    protected static final String DTOFIELD_PSUNITNAME = "psunitname";
    public static final String FIELD_PSVALUERULEID = "PSVALUERULEID";
    protected static final String DTOFIELD_PSVALUERULEID = "psvalueruleid";
    public static final String FIELD_PSVALUERULENAME = "PSVALUERULENAME";
    protected static final String DTOFIELD_PSVALUERULENAME = "psvaluerulename";
    public static final String FIELD_SADEFIELDTYPE = "SADEFIELDTYPE";
    protected static final String DTOFIELD_SADEFIELDTYPE = "sadefieldtype";
    public static final String FIELD_SADEFIELDTYPE2 = "SADEFIELDTYPE2";
    protected static final String DTOFIELD_SADEFIELDTYPE2 = "sadefieldtype2";
    public static final String FIELD_TYPEDESC = "TYPEDESC";
    protected static final String DTOFIELD_TYPEDESC = "typedesc";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSDEFDataTypeDTO createdate(Timestamp createDate) {
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
    public PSDEFDataTypeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="db2datatype")
    public void setDB2DataType(String dB2DataType) {
        this._set(DTOFIELD_DB2DATATYPE, dB2DataType);
    }

    @JsonIgnore
    public String getDB2DataType() {
        Object objValue = this._get(DTOFIELD_DB2DATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDB2DataTypeDirty() {
        return this._contains(DTOFIELD_DB2DATATYPE);
    }

    @JsonIgnore
    public void resetDB2DataType() {
        this._reset(DTOFIELD_DB2DATATYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO db2datatype(String dB2DataType) {
        this.setDB2DataType(dB2DataType);
        return this;
    }

    @JsonProperty(value="enableusercreate")
    public void setEnableUserCreate(Integer enableUserCreate) {
        this._set(DTOFIELD_ENABLEUSERCREATE, enableUserCreate);
    }

    @JsonIgnore
    public Integer getEnableUserCreate() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERCREATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserCreateDirty() {
        return this._contains(DTOFIELD_ENABLEUSERCREATE);
    }

    @JsonIgnore
    public void resetEnableUserCreate() {
        this._reset(DTOFIELD_ENABLEUSERCREATE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO enableusercreate(Integer enableUserCreate) {
        this.setEnableUserCreate(enableUserCreate);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO enableusercreate(Boolean enableUserCreate) {
        if (enableUserCreate == null) {
            this.setEnableUserCreate(null);
        } else {
            this.setEnableUserCreate(enableUserCreate != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="exphyflag")
    public void setExPhyFlag(Integer exPhyFlag) {
        this._set(DTOFIELD_EXPHYFLAG, exPhyFlag);
    }

    @JsonIgnore
    public Integer getExPhyFlag() {
        Object objValue = this._get(DTOFIELD_EXPHYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExPhyFlagDirty() {
        return this._contains(DTOFIELD_EXPHYFLAG);
    }

    @JsonIgnore
    public void resetExPhyFlag() {
        this._reset(DTOFIELD_EXPHYFLAG);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO exphyflag(Integer exPhyFlag) {
        this.setExPhyFlag(exPhyFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO exphyflag(Boolean exPhyFlag) {
        if (exPhyFlag == null) {
            this.setExPhyFlag(null);
        } else {
            this.setExPhyFlag(exPhyFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formularflag")
    public void setFormularFlag(Integer formularFlag) {
        this._set(DTOFIELD_FORMULARFLAG, formularFlag);
        this._set(FIELD_FORMULARFLAG, formularFlag);
    }

    @JsonIgnore
    public Integer getFormularFlag() {
        Object objValue = this._get(DTOFIELD_FORMULARFLAG);
        if (objValue == null && (objValue = this._get(FIELD_FORMULARFLAG)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFormularFlagDirty() {
        if (this._contains(DTOFIELD_FORMULARFLAG)) {
            return true;
        }
        return this._contains(FIELD_FORMULARFLAG);
    }

    @JsonIgnore
    public void resetFormularFlag() {
        this._reset(DTOFIELD_FORMULARFLAG);
        this._reset(FIELD_FORMULARFLAG);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO formularflag(Integer formularFlag) {
        this.setFormularFlag(formularFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO formularflag(Boolean formularFlag) {
        if (formularFlag == null) {
            this.setFormularFlag(null);
        } else {
            this.setFormularFlag(formularFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="intdatatype")
    public void setIntDataType(String intDataType) {
        this._set(DTOFIELD_INTDATATYPE, intDataType);
    }

    @JsonIgnore
    public String getIntDataType() {
        Object objValue = this._get(DTOFIELD_INTDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIntDataTypeDirty() {
        return this._contains(DTOFIELD_INTDATATYPE);
    }

    @JsonIgnore
    public void resetIntDataType() {
        this._reset(DTOFIELD_INTDATATYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO intdatatype(String intDataType) {
        this.setIntDataType(intDataType);
        return this;
    }

    @JsonProperty(value="intdatatype2")
    public void setIntDataType2(String intDataType2) {
        this._set(DTOFIELD_INTDATATYPE2, intDataType2);
    }

    @JsonIgnore
    public String getIntDataType2() {
        Object objValue = this._get(DTOFIELD_INTDATATYPE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIntDataType2Dirty() {
        return this._contains(DTOFIELD_INTDATATYPE2);
    }

    @JsonIgnore
    public void resetIntDataType2() {
        this._reset(DTOFIELD_INTDATATYPE2);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO intdatatype2(String intDataType2) {
        this.setIntDataType2(intDataType2);
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
    public PSDEFDataTypeDTO length(Integer length) {
        this.setLength(length);
        return this;
    }

    @JsonProperty(value="linkflag")
    public void setLinkFlag(Integer linkFlag) {
        this._set(DTOFIELD_LINKFLAG, linkFlag);
    }

    @JsonIgnore
    public Integer getLinkFlag() {
        Object objValue = this._get(DTOFIELD_LINKFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLinkFlagDirty() {
        return this._contains(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public void resetLinkFlag() {
        this._reset(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO linkflag(Integer linkFlag) {
        this.setLinkFlag(linkFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO linkflag(Boolean linkFlag) {
        if (linkFlag == null) {
            this.setLinkFlag(null);
        } else {
            this.setLinkFlag(linkFlag != false ? 1 : 0);
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
    public PSDEFDataTypeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mssqldatatype")
    public void setMSSQLDataType(String mSSQLDataType) {
        this._set(DTOFIELD_MSSQLDATATYPE, mSSQLDataType);
    }

    @JsonIgnore
    public String getMSSQLDataType() {
        Object objValue = this._get(DTOFIELD_MSSQLDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSSQLDataTypeDirty() {
        return this._contains(DTOFIELD_MSSQLDATATYPE);
    }

    @JsonIgnore
    public void resetMSSQLDataType() {
        this._reset(DTOFIELD_MSSQLDATATYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO mssqldatatype(String mSSQLDataType) {
        this.setMSSQLDataType(mSSQLDataType);
        return this;
    }

    @JsonProperty(value="mysqldatatype")
    public void setMySQLDataType(String mySQLDataType) {
        this._set(DTOFIELD_MYSQLDATATYPE, mySQLDataType);
    }

    @JsonIgnore
    public String getMySQLDataType() {
        Object objValue = this._get(DTOFIELD_MYSQLDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMySQLDataTypeDirty() {
        return this._contains(DTOFIELD_MYSQLDATATYPE);
    }

    @JsonIgnore
    public void resetMySQLDataType() {
        this._reset(DTOFIELD_MYSQLDATATYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO mysqldatatype(String mySQLDataType) {
        this.setMySQLDataType(mySQLDataType);
        return this;
    }

    @JsonProperty(value="oracledatatype")
    public void setOracleDataType(String oracleDataType) {
        this._set(DTOFIELD_ORACLEDATATYPE, oracleDataType);
    }

    @JsonIgnore
    public String getOracleDataType() {
        Object objValue = this._get(DTOFIELD_ORACLEDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOracleDataTypeDirty() {
        return this._contains(DTOFIELD_ORACLEDATATYPE);
    }

    @JsonIgnore
    public void resetOracleDataType() {
        this._reset(DTOFIELD_ORACLEDATATYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO oracledatatype(String oracleDataType) {
        this.setOracleDataType(oracleDataType);
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
    public PSDEFDataTypeDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="physicalflag")
    public void setPhysicalFlag(Integer physicalFlag) {
        this._set(DTOFIELD_PHYSICALFLAG, physicalFlag);
    }

    @JsonIgnore
    public Integer getPhysicalFlag() {
        Object objValue = this._get(DTOFIELD_PHYSICALFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPhysicalFlagDirty() {
        return this._contains(DTOFIELD_PHYSICALFLAG);
    }

    @JsonIgnore
    public void resetPhysicalFlag() {
        this._reset(DTOFIELD_PHYSICALFLAG);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO physicalflag(Integer physicalFlag) {
        this.setPhysicalFlag(physicalFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO physicalflag(Boolean physicalFlag) {
        if (physicalFlag == null) {
            this.setPhysicalFlag(null);
        } else {
            this.setPhysicalFlag(physicalFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="postgresqltype")
    public void setPostgreSQLType(String postgreSQLType) {
        this._set(DTOFIELD_POSTGRESQLTYPE, postgreSQLType);
    }

    @JsonIgnore
    public String getPostgreSQLType() {
        Object objValue = this._get(DTOFIELD_POSTGRESQLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPostgreSQLTypeDirty() {
        return this._contains(DTOFIELD_POSTGRESQLTYPE);
    }

    @JsonIgnore
    public void resetPostgreSQLType() {
        this._reset(DTOFIELD_POSTGRESQLTYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO postgresqltype(String postgreSQLType) {
        this.setPostgreSQLType(postgreSQLType);
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
    public PSDEFDataTypeDTO precision(Integer precision) {
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

    @JsonProperty(value="psdefdatatypeid")
    public void setPSDEFDataTypeId(String pSDEFDataTypeId) {
        this._set(DTOFIELD_PSDEFDATATYPEID, pSDEFDataTypeId);
    }

    @JsonIgnore
    public String getPSDEFDataTypeId() {
        Object objValue = this._get(DTOFIELD_PSDEFDATATYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDataTypeIdDirty() {
        return this._contains(DTOFIELD_PSDEFDATATYPEID);
    }

    @JsonIgnore
    public void resetPSDEFDataTypeId() {
        this._reset(DTOFIELD_PSDEFDATATYPEID);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO psdefdatatypeid(String pSDEFDataTypeId) {
        this.setPSDEFDataTypeId(pSDEFDataTypeId);
        return this;
    }

    @JsonProperty(value="psdefdatatypename")
    public void setPSDEFDataTypeName(String pSDEFDataTypeName) {
        this._set(DTOFIELD_PSDEFDATATYPENAME, pSDEFDataTypeName);
    }

    @JsonIgnore
    public String getPSDEFDataTypeName() {
        Object objValue = this._get(DTOFIELD_PSDEFDATATYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDataTypeNameDirty() {
        return this._contains(DTOFIELD_PSDEFDATATYPENAME);
    }

    @JsonIgnore
    public void resetPSDEFDataTypeName() {
        this._reset(DTOFIELD_PSDEFDATATYPENAME);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO psdefdatatypename(String pSDEFDataTypeName) {
        this.setPSDEFDataTypeName(pSDEFDataTypeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFDataTypeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFDataTypeName(strName);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO name(String strName) {
        this.setPSDEFDataTypeName(strName);
        return this;
    }

    @JsonProperty(value="psunitid")
    public void setPSUnitId(String pSUnitId) {
        this._set(DTOFIELD_PSUNITID, pSUnitId);
    }

    @JsonIgnore
    public String getPSUnitId() {
        Object objValue = this._get(DTOFIELD_PSUNITID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUnitIdDirty() {
        return this._contains(DTOFIELD_PSUNITID);
    }

    @JsonIgnore
    public void resetPSUnitId() {
        this._reset(DTOFIELD_PSUNITID);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO psunitid(String pSUnitId) {
        this.setPSUnitId(pSUnitId);
        return this;
    }

    @JsonProperty(value="psunitname")
    public void setPSUnitName(String pSUnitName) {
        this._set(DTOFIELD_PSUNITNAME, pSUnitName);
    }

    @JsonIgnore
    public String getPSUnitName() {
        Object objValue = this._get(DTOFIELD_PSUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUnitNameDirty() {
        return this._contains(DTOFIELD_PSUNITNAME);
    }

    @JsonIgnore
    public void resetPSUnitName() {
        this._reset(DTOFIELD_PSUNITNAME);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO psunitname(String pSUnitName) {
        this.setPSUnitName(pSUnitName);
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
    public PSDEFDataTypeDTO psvalueruleid(String pSValueRuleId) {
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
    public PSDEFDataTypeDTO psvaluerulename(String pSValueRuleName) {
        this.setPSValueRuleName(pSValueRuleName);
        return this;
    }

    @JsonProperty(value="sadefieldtype")
    public void setSADEFieldType(Integer sADEFieldType) {
        this._set(DTOFIELD_SADEFIELDTYPE, sADEFieldType);
    }

    @JsonIgnore
    public Integer getSADEFieldType() {
        Object objValue = this._get(DTOFIELD_SADEFIELDTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSADEFieldTypeDirty() {
        return this._contains(DTOFIELD_SADEFIELDTYPE);
    }

    @JsonIgnore
    public void resetSADEFieldType() {
        this._reset(DTOFIELD_SADEFIELDTYPE);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO sadefieldtype(Integer sADEFieldType) {
        this.setSADEFieldType(sADEFieldType);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO sadefieldtype(Boolean sADEFieldType) {
        if (sADEFieldType == null) {
            this.setSADEFieldType(null);
        } else {
            this.setSADEFieldType(sADEFieldType != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="sadefieldtype2")
    public void setSADEFieldType2(Integer sADEFieldType2) {
        this._set(DTOFIELD_SADEFIELDTYPE2, sADEFieldType2);
    }

    @JsonIgnore
    public Integer getSADEFieldType2() {
        Object objValue = this._get(DTOFIELD_SADEFIELDTYPE2);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSADEFieldType2Dirty() {
        return this._contains(DTOFIELD_SADEFIELDTYPE2);
    }

    @JsonIgnore
    public void resetSADEFieldType2() {
        this._reset(DTOFIELD_SADEFIELDTYPE2);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO sadefieldtype2(Integer sADEFieldType2) {
        this.setSADEFieldType2(sADEFieldType2);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO sadefieldtype2(Boolean sADEFieldType2) {
        if (sADEFieldType2 == null) {
            this.setSADEFieldType2(null);
        } else {
            this.setSADEFieldType2(sADEFieldType2 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="typedesc")
    public void setTypeDesc(String typeDesc) {
        this._set(DTOFIELD_TYPEDESC, typeDesc);
    }

    @JsonIgnore
    public String getTypeDesc() {
        Object objValue = this._get(DTOFIELD_TYPEDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypeDescDirty() {
        return this._contains(DTOFIELD_TYPEDESC);
    }

    @JsonIgnore
    public void resetTypeDesc() {
        this._reset(DTOFIELD_TYPEDESC);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO typedesc(String typeDesc) {
        this.setTypeDesc(typeDesc);
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
    public PSDEFDataTypeDTO updatedate(Timestamp updateDate) {
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
    public PSDEFDataTypeDTO updateman(String updateMan) {
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
    public PSDEFDataTypeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDataTypeDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFDataTypeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFDataTypeId(strValue);
    }

    @JsonIgnore
    public PSDEFDataTypeDTO id(String strValue) {
        this.setPSDEFDataTypeId(strValue);
        return this;
    }
}
