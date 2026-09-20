package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTranslatorDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSearchDEFieldDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DEFAULTVALUETYPE = "DEFAULTVALUETYPE";
    protected static final String DTOFIELD_DEFAULTVALUETYPE = "defaultvaluetype";
    public static final String FIELD_FIELDPARAMS = "FIELDPARAMS";
    protected static final String DTOFIELD_FIELDPARAMS = "fieldparams";
    public static final String FIELD_FIELDS = "FIELDS";
    protected static final String DTOFIELD_FIELDS = "fields";
    public static final String FIELD_FIELDTAG = "FIELDTAG";
    protected static final String DTOFIELD_FIELDTAG = "fieldtag";
    public static final String FIELD_FIELDTAG2 = "FIELDTAG2";
    protected static final String DTOFIELD_FIELDTAG2 = "fieldtag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSSEARCHDEFIELDID = "PSSYSSEARCHDEFIELDID";
    protected static final String DTOFIELD_PSSYSSEARCHDEFIELDID = "pssyssearchdefieldid";
    public static final String FIELD_PSSYSSEARCHDEFIELDNAME = "PSSYSSEARCHDEFIELDNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDEFIELDNAME = "pssyssearchdefieldname";
    public static final String FIELD_PSSYSSEARCHDEID = "PSSYSSEARCHDEID";
    protected static final String DTOFIELD_PSSYSSEARCHDEID = "pssyssearchdeid";
    public static final String FIELD_PSSYSSEARCHDENAME = "PSSYSSEARCHDENAME";
    protected static final String DTOFIELD_PSSYSSEARCHDENAME = "pssyssearchdename";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHFIELDID = "PSSYSSEARCHFIELDID";
    protected static final String DTOFIELD_PSSYSSEARCHFIELDID = "pssyssearchfieldid";
    public static final String FIELD_PSSYSSEARCHFIELDNAME = "PSSYSSEARCHFIELDNAME";
    protected static final String DTOFIELD_PSSYSSEARCHFIELDNAME = "pssyssearchfieldname";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
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
    public PSSysSearchDEFieldDTO codename(String codeName) {
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
    public PSSysSearchDEFieldDTO createdate(Timestamp createDate) {
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
    public PSSysSearchDEFieldDTO createman(String createMan) {
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
    public PSSysSearchDEFieldDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="defaultvaluetype")
    public void setDefaultValueType(String defaultValueType) {
        this._set(DTOFIELD_DEFAULTVALUETYPE, defaultValueType);
    }

    @JsonIgnore
    public String getDefaultValueType() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueTypeDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public void resetDefaultValueType() {
        this._reset(DTOFIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO defaultvaluetype(String defaultValueType) {
        this.setDefaultValueType(defaultValueType);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO defaultvaluetype(PSModelEnums.DEFDefaultValueType defaultValueType) {
        if (defaultValueType == null) {
            this.setDefaultValueType(null);
        } else {
            this.setDefaultValueType(defaultValueType.value);
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
    public PSSysSearchDEFieldDTO fieldparams(String fieldParams) {
        this.setFieldParams(fieldParams);
        return this;
    }

    @JsonProperty(value="fields")
    public void setFields(String fields) {
        this._set(DTOFIELD_FIELDS, fields);
    }

    @JsonIgnore
    public String getFields() {
        Object objValue = this._get(DTOFIELD_FIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldsDirty() {
        return this._contains(DTOFIELD_FIELDS);
    }

    @JsonIgnore
    public void resetFields() {
        this._reset(DTOFIELD_FIELDS);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO fields(String fields) {
        this.setFields(fields);
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
    public PSSysSearchDEFieldDTO fieldtag(String fieldTag) {
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
    public PSSysSearchDEFieldDTO fieldtag2(String fieldTag2) {
        this.setFieldTag2(fieldTag2);
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
    public PSSysSearchDEFieldDTO memo(String memo) {
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
    public PSSysSearchDEFieldDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysSearchDEFieldDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
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
    public PSSysSearchDEFieldDTO psdefname(String pSDEFName) {
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
    public PSSysSearchDEFieldDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssyssearchdefieldid")
    public void setPSSysSearchDEFieldId(String pSSysSearchDEFieldId) {
        this._set(DTOFIELD_PSSYSSEARCHDEFIELDID, pSSysSearchDEFieldId);
    }

    @JsonIgnore
    public String getPSSysSearchDEFieldId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDEFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDEFieldIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDEFIELDID);
    }

    @JsonIgnore
    public void resetPSSysSearchDEFieldId() {
        this._reset(DTOFIELD_PSSYSSEARCHDEFIELDID);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdefieldid(String pSSysSearchDEFieldId) {
        this.setPSSysSearchDEFieldId(pSSysSearchDEFieldId);
        return this;
    }

    @JsonProperty(value="pssyssearchdefieldname")
    public void setPSSysSearchDEFieldName(String pSSysSearchDEFieldName) {
        this._set(DTOFIELD_PSSYSSEARCHDEFIELDNAME, pSSysSearchDEFieldName);
    }

    @JsonIgnore
    public String getPSSysSearchDEFieldName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDEFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDEFieldNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDEFIELDNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDEFieldName() {
        this._reset(DTOFIELD_PSSYSSEARCHDEFIELDNAME);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdefieldname(String pSSysSearchDEFieldName) {
        this.setPSSysSearchDEFieldName(pSSysSearchDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSearchDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSearchDEFieldName(strName);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO name(String strName) {
        this.setPSSysSearchDEFieldName(strName);
        return this;
    }

    @JsonProperty(value="pssyssearchdeid")
    public void setPSSysSearchDEId(String pSSysSearchDEId) {
        this._set(DTOFIELD_PSSYSSEARCHDEID, pSSysSearchDEId);
    }

    @JsonIgnore
    public String getPSSysSearchDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDEID);
    }

    @JsonIgnore
    public void resetPSSysSearchDEId() {
        this._reset(DTOFIELD_PSSYSSEARCHDEID);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdeid(String pSSysSearchDEId) {
        this.setPSSysSearchDEId(pSSysSearchDEId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdeid(PSSysSearchDEDTO pSSysSearchDE) {
        if (pSSysSearchDE == null) {
            this.setPSSysSearchDEId(null);
            this.setPSSysSearchDEName(null);
            this.setPSSysSearchDocId(null);
        } else {
            this.setPSSysSearchDEId(pSSysSearchDE.getPSSysSearchDEId());
            this.setPSSysSearchDEName(pSSysSearchDE.getPSSysSearchDEName());
            this.setPSSysSearchDocId(pSSysSearchDE.getPSSysSearchDocId());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchdename")
    public void setPSSysSearchDEName(String pSSysSearchDEName) {
        this._set(DTOFIELD_PSSYSSEARCHDENAME, pSSysSearchDEName);
    }

    @JsonIgnore
    public String getPSSysSearchDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDENameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDENAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDEName() {
        this._reset(DTOFIELD_PSSYSSEARCHDENAME);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchdename(String pSSysSearchDEName) {
        this.setPSSysSearchDEName(pSSysSearchDEName);
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
    public PSSysSearchDEFieldDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
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
    public PSSysSearchDEFieldDTO pssyssearchfieldid(String pSSysSearchFieldId) {
        this.setPSSysSearchFieldId(pSSysSearchFieldId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssyssearchfieldid(PSSysSearchFieldDTO pSSysSearchField) {
        if (pSSysSearchField == null) {
            this.setPSSysSearchFieldId(null);
            this.setPSSysSearchFieldName(null);
        } else {
            this.setPSSysSearchFieldId(pSSysSearchField.getPSSysSearchFieldId());
            this.setPSSysSearchFieldName(pSSysSearchField.getPSSysSearchFieldName());
        }
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
    public PSSysSearchDEFieldDTO pssyssearchfieldname(String pSSysSearchFieldName) {
        this.setPSSysSearchFieldName(pSSysSearchFieldName);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
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
    public PSSysSearchDEFieldDTO updatedate(Timestamp updateDate) {
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
    public PSSysSearchDEFieldDTO updateman(String updateMan) {
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
    public PSSysSearchDEFieldDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSearchDEFieldDTO usertag(String userTag) {
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
    public PSSysSearchDEFieldDTO usertag2(String userTag2) {
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
    public PSSysSearchDEFieldDTO usertag3(String userTag3) {
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
    public PSSysSearchDEFieldDTO usertag4(String userTag4) {
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
    public PSSysSearchDEFieldDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSearchDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSearchDEFieldId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDEFieldDTO id(String strValue) {
        this.setPSSysSearchDEFieldId(strValue);
        return this;
    }
}
