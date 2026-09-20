package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBColumnDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_COLDESC = "COLDESC";
    protected static final String DTOFIELD_COLDESC = "coldesc";
    public static final String FIELD_COLUMNTAG = "COLUMNTAG";
    protected static final String DTOFIELD_COLUMNTAG = "columntag";
    public static final String FIELD_COLUMNTAG2 = "COLUMNTAG2";
    protected static final String DTOFIELD_COLUMNTAG2 = "columntag2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATESQL = "CREATESQL";
    protected static final String DTOFIELD_CREATESQL = "createsql";
    public static final String FIELD_DATATYPE = "DATATYPE";
    protected static final String DTOFIELD_DATATYPE = "datatype";
    public static final String FIELD_DATATYPES = "DATATYPES";
    protected static final String DTOFIELD_DATATYPES = "datatypes";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DROPSQL = "DROPSQL";
    protected static final String DTOFIELD_DROPSQL = "dropsql";
    public static final String FIELD_FKEY = "FKEY";
    protected static final String DTOFIELD_FKEY = "fkey";
    public static final String FIELD_IDENTITYMODE = "IDENTITYMODE";
    protected static final String DTOFIELD_IDENTITYMODE = "identitymode";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKEY = "PKEY";
    protected static final String DTOFIELD_PKEY = "pkey";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSSYSDBCOLUMNID = "PSSYSDBCOLUMNID";
    protected static final String DTOFIELD_PSSYSDBCOLUMNID = "pssysdbcolumnid";
    public static final String FIELD_PSSYSDBCOLUMNNAME = "PSSYSDBCOLUMNNAME";
    protected static final String DTOFIELD_PSSYSDBCOLUMNNAME = "pssysdbcolumnname";
    public static final String FIELD_PSSYSDBSCHEMEID = "PSSYSDBSCHEMEID";
    protected static final String DTOFIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";
    public static final String FIELD_PSSYSDBTABLEID = "PSSYSDBTABLEID";
    protected static final String DTOFIELD_PSSYSDBTABLEID = "pssysdbtableid";
    public static final String FIELD_PSSYSDBTABLENAME = "PSSYSDBTABLENAME";
    protected static final String DTOFIELD_PSSYSDBTABLENAME = "pssysdbtablename";
    public static final String FIELD_REFPSSYSDBCOLUMNID = "REFPSSYSDBCOLUMNID";
    protected static final String DTOFIELD_REFPSSYSDBCOLUMNID = "refpssysdbcolumnid";
    public static final String FIELD_REFPSSYSDBCOLUMNNAME = "REFPSSYSDBCOLUMNNAME";
    protected static final String DTOFIELD_REFPSSYSDBCOLUMNNAME = "refpssysdbcolumnname";
    public static final String FIELD_REFPSSYSDBTABLEID = "REFPSSYSDBTABLEID";
    protected static final String DTOFIELD_REFPSSYSDBTABLEID = "refpssysdbtableid";
    public static final String FIELD_REFPSSYSDBTABLENAME = "REFPSSYSDBTABLENAME";
    protected static final String DTOFIELD_REFPSSYSDBTABLENAME = "refpssysdbtablename";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_UNSIGNEDMODE = "UNSIGNEDMODE";
    protected static final String DTOFIELD_UNSIGNEDMODE = "unsignedmode";
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
    public PSSysDBColumnDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
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
    public PSSysDBColumnDTO codename(String codeName) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDBColumnDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
        return this;
    }

    @JsonProperty(value="coldesc")
    public void setColDesc(String colDesc) {
        this._set(DTOFIELD_COLDESC, colDesc);
    }

    @JsonIgnore
    public String getColDesc() {
        Object objValue = this._get(DTOFIELD_COLDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColDescDirty() {
        return this._contains(DTOFIELD_COLDESC);
    }

    @JsonIgnore
    public void resetColDesc() {
        this._reset(DTOFIELD_COLDESC);
    }

    @JsonIgnore
    public PSSysDBColumnDTO coldesc(String colDesc) {
        this.setColDesc(colDesc);
        return this;
    }

    @JsonProperty(value="columntag")
    public void setColumnTag(String columnTag) {
        this._set(DTOFIELD_COLUMNTAG, columnTag);
    }

    @JsonIgnore
    public String getColumnTag() {
        Object objValue = this._get(DTOFIELD_COLUMNTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColumnTagDirty() {
        return this._contains(DTOFIELD_COLUMNTAG);
    }

    @JsonIgnore
    public void resetColumnTag() {
        this._reset(DTOFIELD_COLUMNTAG);
    }

    @JsonIgnore
    public PSSysDBColumnDTO columntag(String columnTag) {
        this.setColumnTag(columnTag);
        return this;
    }

    @JsonProperty(value="columntag2")
    public void setColumnTag2(String columnTag2) {
        this._set(DTOFIELD_COLUMNTAG2, columnTag2);
    }

    @JsonIgnore
    public String getColumnTag2() {
        Object objValue = this._get(DTOFIELD_COLUMNTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColumnTag2Dirty() {
        return this._contains(DTOFIELD_COLUMNTAG2);
    }

    @JsonIgnore
    public void resetColumnTag2() {
        this._reset(DTOFIELD_COLUMNTAG2);
    }

    @JsonIgnore
    public PSSysDBColumnDTO columntag2(String columnTag2) {
        this.setColumnTag2(columnTag2);
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
    public PSSysDBColumnDTO createdate(Timestamp createDate) {
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
    public PSSysDBColumnDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createsql")
    public void setCreateSql(String createSql) {
        this._set(DTOFIELD_CREATESQL, createSql);
    }

    @JsonIgnore
    public String getCreateSql() {
        Object objValue = this._get(DTOFIELD_CREATESQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSqlDirty() {
        return this._contains(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public void resetCreateSql() {
        this._reset(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public PSSysDBColumnDTO createsql(String createSql) {
        this.setCreateSql(createSql);
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
    public PSSysDBColumnDTO datatype(String dataType) {
        this.setDataType(dataType);
        return this;
    }

    @JsonProperty(value="datatypes")
    public void setDataTypes(String dataTypes) {
        this._set(DTOFIELD_DATATYPES, dataTypes);
    }

    @JsonIgnore
    public String getDataTypes() {
        Object objValue = this._get(DTOFIELD_DATATYPES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypesDirty() {
        return this._contains(DTOFIELD_DATATYPES);
    }

    @JsonIgnore
    public void resetDataTypes() {
        this._reset(DTOFIELD_DATATYPES);
    }

    @JsonIgnore
    public PSSysDBColumnDTO datatypes(String dataTypes) {
        this.setDataTypes(dataTypes);
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
    public PSSysDBColumnDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="dropsql")
    public void setDropSql(String dropSql) {
        this._set(DTOFIELD_DROPSQL, dropSql);
    }

    @JsonIgnore
    public String getDropSql() {
        Object objValue = this._get(DTOFIELD_DROPSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDropSqlDirty() {
        return this._contains(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public void resetDropSql() {
        this._reset(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public PSSysDBColumnDTO dropsql(String dropSql) {
        this.setDropSql(dropSql);
        return this;
    }

    @JsonProperty(value="fkey")
    public void setFKey(Integer fKey) {
        this._set(DTOFIELD_FKEY, fKey);
    }

    @JsonIgnore
    public Integer getFKey() {
        Object objValue = this._get(DTOFIELD_FKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFKeyDirty() {
        return this._contains(DTOFIELD_FKEY);
    }

    @JsonIgnore
    public void resetFKey() {
        this._reset(DTOFIELD_FKEY);
    }

    @JsonIgnore
    public PSSysDBColumnDTO fkey(Integer fKey) {
        this.setFKey(fKey);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO fkey(Boolean fKey) {
        if (fKey == null) {
            this.setFKey(null);
        } else {
            this.setFKey(fKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="identitymode")
    public void setIdentityMode(Integer identityMode) {
        this._set(DTOFIELD_IDENTITYMODE, identityMode);
    }

    @JsonIgnore
    public Integer getIdentityMode() {
        Object objValue = this._get(DTOFIELD_IDENTITYMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIdentityModeDirty() {
        return this._contains(DTOFIELD_IDENTITYMODE);
    }

    @JsonIgnore
    public void resetIdentityMode() {
        this._reset(DTOFIELD_IDENTITYMODE);
    }

    @JsonIgnore
    public PSSysDBColumnDTO identitymode(Integer identityMode) {
        this.setIdentityMode(identityMode);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO identitymode(Boolean identityMode) {
        if (identityMode == null) {
            this.setIdentityMode(null);
        } else {
            this.setIdentityMode(identityMode != false ? 1 : 0);
        }
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
    public PSSysDBColumnDTO length(Integer length) {
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
    public PSSysDBColumnDTO logicname(String logicName) {
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
    public PSSysDBColumnDTO memo(String memo) {
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
    public PSSysDBColumnDTO ordervalue(Integer orderValue) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDBColumnDTO pkey(Integer pKey) {
        this.setPKey(pKey);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO pkey(Boolean pKey) {
        if (pKey == null) {
            this.setPKey(null);
        } else {
            this.setPKey(pKey != false ? 1 : 0);
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
    public PSSysDBColumnDTO precision(Integer precision) {
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

    @JsonProperty(value="pssysdbcolumnid")
    public void setPSSysDBColumnId(String pSSysDBColumnId) {
        this._set(DTOFIELD_PSSYSDBCOLUMNID, pSSysDBColumnId);
    }

    @JsonIgnore
    public String getPSSysDBColumnId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBCOLUMNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBColumnIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public void resetPSSysDBColumnId() {
        this._reset(DTOFIELD_PSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbcolumnid(String pSSysDBColumnId) {
        this.setPSSysDBColumnId(pSSysDBColumnId);
        return this;
    }

    @JsonProperty(value="pssysdbcolumnname")
    public void setPSSysDBColumnName(String pSSysDBColumnName) {
        this._set(DTOFIELD_PSSYSDBCOLUMNNAME, pSSysDBColumnName);
    }

    @JsonIgnore
    public String getPSSysDBColumnName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBCOLUMNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBColumnNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBCOLUMNNAME);
    }

    @JsonIgnore
    public void resetPSSysDBColumnName() {
        this._reset(DTOFIELD_PSSYSDBCOLUMNNAME);
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbcolumnname(String pSSysDBColumnName) {
        this.setPSSysDBColumnName(pSSysDBColumnName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBColumnName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBColumnName(strName);
    }

    @JsonIgnore
    public PSSysDBColumnDTO name(String strName) {
        this.setPSSysDBColumnName(strName);
        return this;
    }

    @JsonProperty(value="pssysdbschemeid")
    public void setPSSysDBSchemeId(String pSSysDBSchemeId) {
        this._set(DTOFIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }

    @JsonIgnore
    public String getPSSysDBSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeId() {
        this._reset(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbschemeid(String pSSysDBSchemeId) {
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    @JsonProperty(value="pssysdbtableid")
    public void setPSSysDBTableId(String pSSysDBTableId) {
        this._set(DTOFIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }

    @JsonIgnore
    public String getPSSysDBTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public void resetPSSysDBTableId() {
        this._reset(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtableid(String pSSysDBTableId) {
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable) {
        if (pSSysDBTable == null) {
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        } else {
            this.setPSSysDBSchemeId(pSSysDBTable.getPSSysDBSchemeId());
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbtablename")
    public void setPSSysDBTableName(String pSSysDBTableName) {
        this._set(DTOFIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }

    @JsonIgnore
    public String getPSSysDBTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysDBTableName() {
        this._reset(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public PSSysDBColumnDTO pssysdbtablename(String pSSysDBTableName) {
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    @JsonProperty(value="refpssysdbcolumnid")
    public void setRefPSSysDBColumnId(String refPSSysDBColumnId) {
        this._set(DTOFIELD_REFPSSYSDBCOLUMNID, refPSSysDBColumnId);
    }

    @JsonIgnore
    public String getRefPSSysDBColumnId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDBCOLUMNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDBColumnIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public void resetRefPSSysDBColumnId() {
        this._reset(DTOFIELD_REFPSSYSDBCOLUMNID);
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnid(String refPSSysDBColumnId) {
        this.setRefPSSysDBColumnId(refPSSysDBColumnId);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnid(PSSysDBColumnDTO pSSysDBColumn) {
        if (pSSysDBColumn == null) {
            this.setRefPSSysDBColumnId(null);
            this.setRefPSSysDBColumnName(null);
        } else {
            this.setRefPSSysDBColumnId(pSSysDBColumn.getPSSysDBColumnId());
            this.setRefPSSysDBColumnName(pSSysDBColumn.getPSSysDBColumnName());
        }
        return this;
    }

    @JsonProperty(value="refpssysdbcolumnname")
    public void setRefPSSysDBColumnName(String refPSSysDBColumnName) {
        this._set(DTOFIELD_REFPSSYSDBCOLUMNNAME, refPSSysDBColumnName);
    }

    @JsonIgnore
    public String getRefPSSysDBColumnName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDBCOLUMNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDBColumnNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSDBCOLUMNNAME);
    }

    @JsonIgnore
    public void resetRefPSSysDBColumnName() {
        this._reset(DTOFIELD_REFPSSYSDBCOLUMNNAME);
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbcolumnname(String refPSSysDBColumnName) {
        this.setRefPSSysDBColumnName(refPSSysDBColumnName);
        return this;
    }

    @JsonProperty(value="refpssysdbtableid")
    public void setRefPSSysDBTableId(String refPSSysDBTableId) {
        this._set(DTOFIELD_REFPSSYSDBTABLEID, refPSSysDBTableId);
    }

    @JsonIgnore
    public String getRefPSSysDBTableId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDBTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDBTableIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSDBTABLEID);
    }

    @JsonIgnore
    public void resetRefPSSysDBTableId() {
        this._reset(DTOFIELD_REFPSSYSDBTABLEID);
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtableid(String refPSSysDBTableId) {
        this.setRefPSSysDBTableId(refPSSysDBTableId);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtableid(PSSysDBTableDTO pSSysDBTable) {
        if (pSSysDBTable == null) {
            this.setRefPSSysDBTableId(null);
            this.setRefPSSysDBTableName(null);
        } else {
            this.setRefPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setRefPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    @JsonProperty(value="refpssysdbtablename")
    public void setRefPSSysDBTableName(String refPSSysDBTableName) {
        this._set(DTOFIELD_REFPSSYSDBTABLENAME, refPSSysDBTableName);
    }

    @JsonIgnore
    public String getRefPSSysDBTableName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDBTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDBTableNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSDBTABLENAME);
    }

    @JsonIgnore
    public void resetRefPSSysDBTableName() {
        this._reset(DTOFIELD_REFPSSYSDBTABLENAME);
    }

    @JsonIgnore
    public PSSysDBColumnDTO refpssysdbtablename(String refPSSysDBTableName) {
        this.setRefPSSysDBTableName(refPSSysDBTableName);
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
    public PSSysDBColumnDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="unsignedmode")
    public void setUnsignedMode(Integer unsignedMode) {
        this._set(DTOFIELD_UNSIGNEDMODE, unsignedMode);
    }

    @JsonIgnore
    public Integer getUnsignedMode() {
        Object objValue = this._get(DTOFIELD_UNSIGNEDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUnsignedModeDirty() {
        return this._contains(DTOFIELD_UNSIGNEDMODE);
    }

    @JsonIgnore
    public void resetUnsignedMode() {
        this._reset(DTOFIELD_UNSIGNEDMODE);
    }

    @JsonIgnore
    public PSSysDBColumnDTO unsignedmode(Integer unsignedMode) {
        this.setUnsignedMode(unsignedMode);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO unsignedmode(Boolean unsignedMode) {
        if (unsignedMode == null) {
            this.setUnsignedMode(null);
        } else {
            this.setUnsignedMode(unsignedMode != false ? 1 : 0);
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
    public PSSysDBColumnDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBColumnDTO updateman(String updateMan) {
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
    public PSSysDBColumnDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDBColumnDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysDBColumnDTO usertag(String userTag) {
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
    public PSSysDBColumnDTO usertag2(String userTag2) {
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
    public PSSysDBColumnDTO usertag3(String userTag3) {
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
    public PSSysDBColumnDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBColumnId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBColumnId(strValue);
    }

    @JsonIgnore
    public PSSysDBColumnDTO id(String strValue) {
        this.setPSSysDBColumnId(strValue);
        return this;
    }
}
