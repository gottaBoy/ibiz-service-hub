package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDataTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIElementREDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_EAIELEMENTRETYPE = "EAIELEMENTRETYPE";
    protected static final String DTOFIELD_EAIELEMENTRETYPE = "eaielementretype";
    public static final String FIELD_FIXEDVALUE = "FIXEDVALUE";
    protected static final String DTOFIELD_FIXEDVALUE = "fixedvalue";
    public static final String FIELD_MAXOCCURS = "MAXOCCURS";
    protected static final String DTOFIELD_MAXOCCURS = "maxoccurs";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINOCCURS = "MINOCCURS";
    protected static final String DTOFIELD_MINOCCURS = "minoccurs";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSSYSEAIDATATYPEID = "PSSYSEAIDATATYPEID";
    protected static final String DTOFIELD_PSSYSEAIDATATYPEID = "pssyseaidatatypeid";
    public static final String FIELD_PSSYSEAIDATATYPENAME = "PSSYSEAIDATATYPENAME";
    protected static final String DTOFIELD_PSSYSEAIDATATYPENAME = "pssyseaidatatypename";
    public static final String FIELD_PSSYSEAIELEMENTID = "PSSYSEAIELEMENTID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTID = "pssyseaielementid";
    public static final String FIELD_PSSYSEAIELEMENTNAME = "PSSYSEAIELEMENTNAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";
    public static final String FIELD_PSSYSEAIELEMENTREID = "PSSYSEAIELEMENTREID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";
    public static final String FIELD_PSSYSEAIELEMENTRENAME = "PSSYSEAIELEMENTRENAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";
    public static final String FIELD_PSSYSEAISCHEMEID = "PSSYSEAISCHEMEID";
    protected static final String DTOFIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";
    public static final String FIELD_REFPSSYSEAIELEMENTID = "REFPSSYSEAIELEMENTID";
    protected static final String DTOFIELD_REFPSSYSEAIELEMENTID = "refpssyseaielementid";
    public static final String FIELD_REFPSSYSEAIELEMENTNAME = "REFPSSYSEAIELEMENTNAME";
    protected static final String DTOFIELD_REFPSSYSEAIELEMENTNAME = "refpssyseaielementname";
    public static final String FIELD_RETAG = "RETAG";
    protected static final String DTOFIELD_RETAG = "retag";
    public static final String FIELD_RETAG2 = "RETAG2";
    protected static final String DTOFIELD_RETAG2 = "retag2";
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
    public PSSysEAIElementREDTO codename(String codeName) {
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
    public PSSysEAIElementREDTO createdate(Timestamp createDate) {
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
    public PSSysEAIElementREDTO createman(String createMan) {
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
    public PSSysEAIElementREDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="eaielementretype")
    public void setEAIElementREType(String eAIElementREType) {
        this._set(DTOFIELD_EAIELEMENTRETYPE, eAIElementREType);
    }

    @JsonIgnore
    public String getEAIElementREType() {
        Object objValue = this._get(DTOFIELD_EAIELEMENTRETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIElementRETypeDirty() {
        return this._contains(DTOFIELD_EAIELEMENTRETYPE);
    }

    @JsonIgnore
    public void resetEAIElementREType() {
        this._reset(DTOFIELD_EAIELEMENTRETYPE);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO eaielementretype(String eAIElementREType) {
        this.setEAIElementREType(eAIElementREType);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO eaielementretype(PSModelEnums.EAIElementREType eAIElementREType) {
        if (eAIElementREType == null) {
            this.setEAIElementREType(null);
        } else {
            this.setEAIElementREType(eAIElementREType.value);
        }
        return this;
    }

    @JsonProperty(value="fixedvalue")
    public void setFixedValue(String fixedValue) {
        this._set(DTOFIELD_FIXEDVALUE, fixedValue);
    }

    @JsonIgnore
    public String getFixedValue() {
        Object objValue = this._get(DTOFIELD_FIXEDVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFixedValueDirty() {
        return this._contains(DTOFIELD_FIXEDVALUE);
    }

    @JsonIgnore
    public void resetFixedValue() {
        this._reset(DTOFIELD_FIXEDVALUE);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO fixedvalue(String fixedValue) {
        this.setFixedValue(fixedValue);
        return this;
    }

    @JsonProperty(value="maxoccurs")
    public void setMaxOccurs(Integer maxOccurs) {
        this._set(DTOFIELD_MAXOCCURS, maxOccurs);
    }

    @JsonIgnore
    public Integer getMaxOccurs() {
        Object objValue = this._get(DTOFIELD_MAXOCCURS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxOccursDirty() {
        return this._contains(DTOFIELD_MAXOCCURS);
    }

    @JsonIgnore
    public void resetMaxOccurs() {
        this._reset(DTOFIELD_MAXOCCURS);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO maxoccurs(Integer maxOccurs) {
        this.setMaxOccurs(maxOccurs);
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
    public PSSysEAIElementREDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minoccurs")
    public void setMinOccurs(Integer minOccurs) {
        this._set(DTOFIELD_MINOCCURS, minOccurs);
    }

    @JsonIgnore
    public Integer getMinOccurs() {
        Object objValue = this._get(DTOFIELD_MINOCCURS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinOccursDirty() {
        return this._contains(DTOFIELD_MINOCCURS);
    }

    @JsonIgnore
    public void resetMinOccurs() {
        this._reset(DTOFIELD_MINOCCURS);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO minoccurs(Integer minOccurs) {
        this.setMinOccurs(minOccurs);
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
    public PSSysEAIElementREDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pssyseaidatatypeid")
    public void setPSSysEAIDataTypeId(String pSSysEAIDataTypeId) {
        this._set(DTOFIELD_PSSYSEAIDATATYPEID, pSSysEAIDataTypeId);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPEID);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeId() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPEID);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaidatatypeid(String pSSysEAIDataTypeId) {
        this.setPSSysEAIDataTypeId(pSSysEAIDataTypeId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaidatatypeid(PSSysEAIDataTypeDTO pSSysEAIDataType) {
        if (pSSysEAIDataType == null) {
            this.setPSSysEAIDataTypeId(null);
            this.setPSSysEAIDataTypeName(null);
        } else {
            this.setPSSysEAIDataTypeId(pSSysEAIDataType.getPSSysEAIDataTypeId());
            this.setPSSysEAIDataTypeName(pSSysEAIDataType.getPSSysEAIDataTypeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaidatatypename")
    public void setPSSysEAIDataTypeName(String pSSysEAIDataTypeName) {
        this._set(DTOFIELD_PSSYSEAIDATATYPENAME, pSSysEAIDataTypeName);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeName() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPENAME);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaidatatypename(String pSSysEAIDataTypeName) {
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
        return this;
    }

    @JsonProperty(value="pssyseaielementid")
    public void setPSSysEAIElementId(String pSSysEAIElementId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }

    @JsonIgnore
    public String getPSSysEAIElementId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaielementid(PSSysEAIElementDTO pSSysEAIElement) {
        if (pSSysEAIElement == null) {
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
            this.setPSSysEAISchemeId(null);
        } else {
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
            this.setPSSysEAISchemeId(pSSysEAIElement.getPSSysEAISchemeId());
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementname")
    public void setPSSysEAIElementName(String pSSysEAIElementName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }

    @JsonIgnore
    public String getPSSysEAIElementName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaielementname(String pSSysEAIElementName) {
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    @JsonProperty(value="pssyseaielementreid")
    public void setPSSysEAIElementREId(String pSSysEAIElementREId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }

    @JsonIgnore
    public String getPSSysEAIElementREId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaielementreid(String pSSysEAIElementREId) {
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    @JsonProperty(value="pssyseaielementrename")
    public void setPSSysEAIElementREName(String pSSysEAIElementREName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }

    @JsonIgnore
    public String getPSSysEAIElementREName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTRENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaielementrename(String pSSysEAIElementREName) {
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIElementREName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIElementREName(strName);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO name(String strName) {
        this.setPSSysEAIElementREName(strName);
        return this;
    }

    @JsonProperty(value="pssyseaischemeid")
    public void setPSSysEAISchemeId(String pSSysEAISchemeId) {
        this._set(DTOFIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }

    @JsonIgnore
    public String getPSSysEAISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeId() {
        this._reset(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonProperty(value="refpssyseaielementid")
    public void setRefPSSysEAIElementId(String refPSSysEAIElementId) {
        this._set(DTOFIELD_REFPSSYSEAIELEMENTID, refPSSysEAIElementId);
    }

    @JsonIgnore
    public String getRefPSSysEAIElementId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSEAIELEMENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysEAIElementIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public void resetRefPSSysEAIElementId() {
        this._reset(DTOFIELD_REFPSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO refpssyseaielementid(String refPSSysEAIElementId) {
        this.setRefPSSysEAIElementId(refPSSysEAIElementId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO refpssyseaielementid(PSSysEAIElementDTO pSSysEAIElement) {
        if (pSSysEAIElement == null) {
            this.setRefPSSysEAIElementId(null);
            this.setRefPSSysEAIElementName(null);
        } else {
            this.setRefPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setRefPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
        return this;
    }

    @JsonProperty(value="refpssyseaielementname")
    public void setRefPSSysEAIElementName(String refPSSysEAIElementName) {
        this._set(DTOFIELD_REFPSSYSEAIELEMENTNAME, refPSSysEAIElementName);
    }

    @JsonIgnore
    public String getRefPSSysEAIElementName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSEAIELEMENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysEAIElementNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public void resetRefPSSysEAIElementName() {
        this._reset(DTOFIELD_REFPSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO refpssyseaielementname(String refPSSysEAIElementName) {
        this.setRefPSSysEAIElementName(refPSSysEAIElementName);
        return this;
    }

    @JsonProperty(value="retag")
    public void setRETag(String rETag) {
        this._set(DTOFIELD_RETAG, rETag);
    }

    @JsonIgnore
    public String getRETag() {
        Object objValue = this._get(DTOFIELD_RETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRETagDirty() {
        return this._contains(DTOFIELD_RETAG);
    }

    @JsonIgnore
    public void resetRETag() {
        this._reset(DTOFIELD_RETAG);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO retag(String rETag) {
        this.setRETag(rETag);
        return this;
    }

    @JsonProperty(value="retag2")
    public void setRETag2(String rETag2) {
        this._set(DTOFIELD_RETAG2, rETag2);
    }

    @JsonIgnore
    public String getRETag2() {
        Object objValue = this._get(DTOFIELD_RETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRETag2Dirty() {
        return this._contains(DTOFIELD_RETAG2);
    }

    @JsonIgnore
    public void resetRETag2() {
        this._reset(DTOFIELD_RETAG2);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO retag2(String rETag2) {
        this.setRETag2(rETag2);
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
    public PSSysEAIElementREDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIElementREDTO updateman(String updateMan) {
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
    public PSSysEAIElementREDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIElementREDTO usertag(String userTag) {
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
    public PSSysEAIElementREDTO usertag2(String userTag2) {
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
    public PSSysEAIElementREDTO usertag3(String userTag3) {
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
    public PSSysEAIElementREDTO usertag4(String userTag4) {
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
    public PSSysEAIElementREDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementREDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIElementREId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIElementREId(strValue);
    }

    @JsonIgnore
    public PSSysEAIElementREDTO id(String strValue) {
        this.setPSSysEAIElementREId(strValue);
        return this;
    }
}
