package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDocDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSearchFieldDTO
extends PSModelDTOBase {
    public static final String FIELD_ANALYZER = "ANALYZER";
    protected static final String DTOFIELD_ANALYZER = "analyzer";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATEFORMAT = "DATEFORMAT";
    protected static final String DTOFIELD_DATEFORMAT = "dateformat";
    public static final String FIELD_FIELDDATAFLAG = "FIELDDATAFLAG";
    protected static final String DTOFIELD_FIELDDATAFLAG = "fielddataflag";
    public static final String FIELD_FIELDPARAMS = "FIELDPARAMS";
    protected static final String DTOFIELD_FIELDPARAMS = "fieldparams";
    public static final String FIELD_FIELDTAG = "FIELDTAG";
    protected static final String DTOFIELD_FIELDTAG = "fieldtag";
    public static final String FIELD_FIELDTAG2 = "FIELDTAG2";
    protected static final String DTOFIELD_FIELDTAG2 = "fieldtag2";
    public static final String FIELD_FIELDTYPE = "FIELDTYPE";
    protected static final String DTOFIELD_FIELDTYPE = "fieldtype";
    public static final String FIELD_IGNOREFIELDS = "IGNOREFIELDS";
    protected static final String DTOFIELD_IGNOREFIELDS = "ignorefields";
    public static final String FIELD_INCINPARENTFLAG = "INCINPARENTFLAG";
    protected static final String DTOFIELD_INCINPARENTFLAG = "incinparentflag";
    public static final String FIELD_INDEXFLAG = "INDEXFLAG";
    protected static final String DTOFIELD_INDEXFLAG = "indexflag";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PATTERN = "PATTERN";
    protected static final String DTOFIELD_PATTERN = "pattern";
    public static final String FIELD_PKEY = "PKEY";
    protected static final String DTOFIELD_PKEY = "pkey";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHDOCNAME = "PSSYSSEARCHDOCNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";
    public static final String FIELD_PSSYSSEARCHFIELDID = "PSSYSSEARCHFIELDID";
    protected static final String DTOFIELD_PSSYSSEARCHFIELDID = "pssyssearchfieldid";
    public static final String FIELD_PSSYSSEARCHFIELDNAME = "PSSYSSEARCHFIELDNAME";
    protected static final String DTOFIELD_PSSYSSEARCHFIELDNAME = "pssyssearchfieldname";
    public static final String FIELD_SEARCHANALYZER = "SEARCHANALYZER";
    protected static final String DTOFIELD_SEARCHANALYZER = "searchanalyzer";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_STOREFLAG = "STOREFLAG";
    protected static final String DTOFIELD_STOREFLAG = "storeflag";
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

    @JsonProperty(value="analyzer")
    public void setAnalyzer(String analyzer) {
        this._set(DTOFIELD_ANALYZER, analyzer);
    }

    @JsonIgnore
    public String getAnalyzer() {
        Object objValue = this._get(DTOFIELD_ANALYZER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAnalyzerDirty() {
        return this._contains(DTOFIELD_ANALYZER);
    }

    @JsonIgnore
    public void resetAnalyzer() {
        this._reset(DTOFIELD_ANALYZER);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO analyzer(String analyzer) {
        this.setAnalyzer(analyzer);
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
    public PSSysSearchFieldDTO codename(String codeName) {
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
    public PSSysSearchFieldDTO createdate(Timestamp createDate) {
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
    public PSSysSearchFieldDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dateformat")
    public void setDateFormat(String dateFormat) {
        this._set(DTOFIELD_DATEFORMAT, dateFormat);
    }

    @JsonIgnore
    public String getDateFormat() {
        Object objValue = this._get(DTOFIELD_DATEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDateFormatDirty() {
        return this._contains(DTOFIELD_DATEFORMAT);
    }

    @JsonIgnore
    public void resetDateFormat() {
        this._reset(DTOFIELD_DATEFORMAT);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO dateformat(String dateFormat) {
        this.setDateFormat(dateFormat);
        return this;
    }

    @JsonProperty(value="fielddataflag")
    public void setFieldDataFlag(Integer fieldDataFlag) {
        this._set(DTOFIELD_FIELDDATAFLAG, fieldDataFlag);
    }

    @JsonIgnore
    public Integer getFieldDataFlag() {
        Object objValue = this._get(DTOFIELD_FIELDDATAFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFieldDataFlagDirty() {
        return this._contains(DTOFIELD_FIELDDATAFLAG);
    }

    @JsonIgnore
    public void resetFieldDataFlag() {
        this._reset(DTOFIELD_FIELDDATAFLAG);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO fielddataflag(Integer fieldDataFlag) {
        this.setFieldDataFlag(fieldDataFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO fielddataflag(Boolean fieldDataFlag) {
        if (fieldDataFlag == null) {
            this.setFieldDataFlag(null);
        } else {
            this.setFieldDataFlag(fieldDataFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="fieldparams")
    public void setFieldParams(String fieldParams) {
        this._set(DTOFIELD_FIELDPARAMS, fieldParams);
    }

    @JsonIgnore
    public String getFieldParams() {
        Object objValue = this._get(DTOFIELD_FIELDPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldParamsDirty() {
        return this._contains(DTOFIELD_FIELDPARAMS);
    }

    @JsonIgnore
    public void resetFieldParams() {
        this._reset(DTOFIELD_FIELDPARAMS);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO fieldparams(String fieldParams) {
        this.setFieldParams(fieldParams);
        return this;
    }

    @JsonProperty(value="fieldtag")
    public void setFieldTag(String fieldTag) {
        this._set(DTOFIELD_FIELDTAG, fieldTag);
    }

    @JsonIgnore
    public String getFieldTag() {
        Object objValue = this._get(DTOFIELD_FIELDTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSysSearchFieldDTO fieldtag(String fieldTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSearchFieldDTO fieldtag2(String fieldTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSearchFieldDTO fieldtype(String fieldType) {
        this.setFieldType(fieldType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO fieldtype(PSModelEnums.SearchFieldDataType fieldType) {
        if (fieldType == null) {
            this.setFieldType(null);
        } else {
            this.setFieldType(fieldType.value);
        }
        return this;
    }

    @JsonProperty(value="ignorefields")
    public void setIgnoreFields(String ignoreFields) {
        this._set(DTOFIELD_IGNOREFIELDS, ignoreFields);
    }

    @JsonIgnore
    public String getIgnoreFields() {
        Object objValue = this._get(DTOFIELD_IGNOREFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreFieldsDirty() {
        return this._contains(DTOFIELD_IGNOREFIELDS);
    }

    @JsonIgnore
    public void resetIgnoreFields() {
        this._reset(DTOFIELD_IGNOREFIELDS);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO ignorefields(String ignoreFields) {
        this.setIgnoreFields(ignoreFields);
        return this;
    }

    @JsonProperty(value="incinparentflag")
    public void setIncInParentFlag(Integer incInParentFlag) {
        this._set(DTOFIELD_INCINPARENTFLAG, incInParentFlag);
    }

    @JsonIgnore
    public Integer getIncInParentFlag() {
        Object objValue = this._get(DTOFIELD_INCINPARENTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncInParentFlagDirty() {
        return this._contains(DTOFIELD_INCINPARENTFLAG);
    }

    @JsonIgnore
    public void resetIncInParentFlag() {
        this._reset(DTOFIELD_INCINPARENTFLAG);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO incinparentflag(Integer incInParentFlag) {
        this.setIncInParentFlag(incInParentFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO incinparentflag(Boolean incInParentFlag) {
        if (incInParentFlag == null) {
            this.setIncInParentFlag(null);
        } else {
            this.setIncInParentFlag(incInParentFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="indexflag")
    public void setIndexFlag(Integer indexFlag) {
        this._set(DTOFIELD_INDEXFLAG, indexFlag);
    }

    @JsonIgnore
    public Integer getIndexFlag() {
        Object objValue = this._get(DTOFIELD_INDEXFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIndexFlagDirty() {
        return this._contains(DTOFIELD_INDEXFLAG);
    }

    @JsonIgnore
    public void resetIndexFlag() {
        this._reset(DTOFIELD_INDEXFLAG);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO indexflag(Integer indexFlag) {
        this.setIndexFlag(indexFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO indexflag(Boolean indexFlag) {
        if (indexFlag == null) {
            this.setIndexFlag(null);
        } else {
            this.setIndexFlag(indexFlag != false ? 1 : 0);
        }
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
    public PSSysSearchFieldDTO logicname(String logicName) {
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
    public PSSysSearchFieldDTO memo(String memo) {
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
    public PSSysSearchFieldDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pattern")
    public void setPattern(String pattern) {
        this._set(DTOFIELD_PATTERN, pattern);
    }

    @JsonIgnore
    public String getPattern() {
        Object objValue = this._get(DTOFIELD_PATTERN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPatternDirty() {
        return this._contains(DTOFIELD_PATTERN);
    }

    @JsonIgnore
    public void resetPattern() {
        this._reset(DTOFIELD_PATTERN);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pattern(String pattern) {
        this.setPattern(pattern);
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
    public PSSysSearchFieldDTO pkey(Integer pKey) {
        this.setPKey(pKey);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pkey(Boolean pKey) {
        if (pKey == null) {
            this.setPKey(null);
        } else {
            this.setPKey(pKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pssyssearchdocid")
    public void setPSSysSearchDocId(String pSSysSearchDocId) {
        this._set(DTOFIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }

    @JsonIgnore
    public String getPSSysSearchDocId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public void resetPSSysSearchDocId() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc) {
        if (pSSysSearchDoc == null) {
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        } else {
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchdocname")
    public void setPSSysSearchDocName(String pSSysSearchDocName) {
        this._set(DTOFIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }

    @JsonIgnore
    public String getPSSysSearchDocName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDocName() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocname(String pSSysSearchDocName) {
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    @JsonProperty(value="pssyssearchfieldid")
    public void setPSSysSearchFieldId(String pSSysSearchFieldId) {
        this._set(DTOFIELD_PSSYSSEARCHFIELDID, pSSysSearchFieldId);
    }

    @JsonIgnore
    public String getPSSysSearchFieldId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchFieldIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHFIELDID);
    }

    @JsonIgnore
    public void resetPSSysSearchFieldId() {
        this._reset(DTOFIELD_PSSYSSEARCHFIELDID);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchfieldid(String pSSysSearchFieldId) {
        this.setPSSysSearchFieldId(pSSysSearchFieldId);
        return this;
    }

    @JsonProperty(value="pssyssearchfieldname")
    public void setPSSysSearchFieldName(String pSSysSearchFieldName) {
        this._set(DTOFIELD_PSSYSSEARCHFIELDNAME, pSSysSearchFieldName);
    }

    @JsonIgnore
    public String getPSSysSearchFieldName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchFieldNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHFIELDNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchFieldName() {
        this._reset(DTOFIELD_PSSYSSEARCHFIELDNAME);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchfieldname(String pSSysSearchFieldName) {
        this.setPSSysSearchFieldName(pSSysSearchFieldName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSearchFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSearchFieldName(strName);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO name(String strName) {
        this.setPSSysSearchFieldName(strName);
        return this;
    }

    @JsonProperty(value="searchanalyzer")
    public void setSearchAnalyzer(String searchAnalyzer) {
        this._set(DTOFIELD_SEARCHANALYZER, searchAnalyzer);
    }

    @JsonIgnore
    public String getSearchAnalyzer() {
        Object objValue = this._get(DTOFIELD_SEARCHANALYZER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchAnalyzerDirty() {
        return this._contains(DTOFIELD_SEARCHANALYZER);
    }

    @JsonIgnore
    public void resetSearchAnalyzer() {
        this._reset(DTOFIELD_SEARCHANALYZER);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO searchanalyzer(String searchAnalyzer) {
        this.setSearchAnalyzer(searchAnalyzer);
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
    public PSSysSearchFieldDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="storeflag")
    public void setStoreFlag(Integer storeFlag) {
        this._set(DTOFIELD_STOREFLAG, storeFlag);
    }

    @JsonIgnore
    public Integer getStoreFlag() {
        Object objValue = this._get(DTOFIELD_STOREFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStoreFlagDirty() {
        return this._contains(DTOFIELD_STOREFLAG);
    }

    @JsonIgnore
    public void resetStoreFlag() {
        this._reset(DTOFIELD_STOREFLAG);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO storeflag(Integer storeFlag) {
        this.setStoreFlag(storeFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO storeflag(Boolean storeFlag) {
        if (storeFlag == null) {
            this.setStoreFlag(null);
        } else {
            this.setStoreFlag(storeFlag != false ? 1 : 0);
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
    public PSSysSearchFieldDTO updatedate(Timestamp updateDate) {
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
    public PSSysSearchFieldDTO updateman(String updateMan) {
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
    public PSSysSearchFieldDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSearchFieldDTO usertag(String userTag) {
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
    public PSSysSearchFieldDTO usertag2(String userTag2) {
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
    public PSSysSearchFieldDTO usertag3(String userTag3) {
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
    public PSSysSearchFieldDTO usertag4(String userTag4) {
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
    public PSSysSearchFieldDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchFieldDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSearchFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSearchFieldId(strValue);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO id(String strValue) {
        this.setPSSysSearchFieldId(strValue);
        return this;
    }
}
