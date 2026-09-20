package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDataTypeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIDataTypeItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_EAIDATATYPEITEMTAG = "EAIDATATYPEITEMTAG";
    protected static final String DTOFIELD_EAIDATATYPEITEMTAG = "eaidatatypeitemtag";
    public static final String FIELD_EAIDATATYPEITEMTAG2 = "EAIDATATYPEITEMTAG2";
    protected static final String DTOFIELD_EAIDATATYPEITEMTAG2 = "eaidatatypeitemtag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSSYSEAIDATATYPEID = "PSSYSEAIDATATYPEID";
    protected static final String DTOFIELD_PSSYSEAIDATATYPEID = "pssyseaidatatypeid";
    public static final String FIELD_PSSYSEAIDATATYPEITEMID = "PSSYSEAIDATATYPEITEMID";
    protected static final String DTOFIELD_PSSYSEAIDATATYPEITEMID = "pssyseaidatatypeitemid";
    public static final String FIELD_PSSYSEAIDATATYPEITEMNAME = "PSSYSEAIDATATYPEITEMNAME";
    protected static final String DTOFIELD_PSSYSEAIDATATYPEITEMNAME = "pssyseaidatatypeitemname";
    public static final String FIELD_PSSYSEAIDATATYPENAME = "PSSYSEAIDATATYPENAME";
    protected static final String DTOFIELD_PSSYSEAIDATATYPENAME = "pssyseaidatatypename";
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
    public static final String FIELD_VALUE = "VALUE";
    protected static final String DTOFIELD_VALUE = "value";

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
    public PSSysEAIDataTypeItemDTO codename(String codeName) {
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
    public PSSysEAIDataTypeItemDTO createdate(Timestamp createDate) {
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
    public PSSysEAIDataTypeItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="eaidatatypeitemtag")
    public void setEAIDataTypeItemTag(String eAIDataTypeItemTag) {
        this._set(DTOFIELD_EAIDATATYPEITEMTAG, eAIDataTypeItemTag);
    }

    @JsonIgnore
    public String getEAIDataTypeItemTag() {
        Object objValue = this._get(DTOFIELD_EAIDATATYPEITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDataTypeItemTagDirty() {
        return this._contains(DTOFIELD_EAIDATATYPEITEMTAG);
    }

    @JsonIgnore
    public void resetEAIDataTypeItemTag() {
        this._reset(DTOFIELD_EAIDATATYPEITEMTAG);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO eaidatatypeitemtag(String eAIDataTypeItemTag) {
        this.setEAIDataTypeItemTag(eAIDataTypeItemTag);
        return this;
    }

    @JsonProperty(value="eaidatatypeitemtag2")
    public void setEAIDataTypeItemTag2(String eAIDataTypeItemTag2) {
        this._set(DTOFIELD_EAIDATATYPEITEMTAG2, eAIDataTypeItemTag2);
    }

    @JsonIgnore
    public String getEAIDataTypeItemTag2() {
        Object objValue = this._get(DTOFIELD_EAIDATATYPEITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDataTypeItemTag2Dirty() {
        return this._contains(DTOFIELD_EAIDATATYPEITEMTAG2);
    }

    @JsonIgnore
    public void resetEAIDataTypeItemTag2() {
        this._reset(DTOFIELD_EAIDATATYPEITEMTAG2);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO eaidatatypeitemtag2(String eAIDataTypeItemTag2) {
        this.setEAIDataTypeItemTag2(eAIDataTypeItemTag2);
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
    public PSSysEAIDataTypeItemDTO memo(String memo) {
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
    public PSSysEAIDataTypeItemDTO ordervalue(Integer orderValue) {
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
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeid(String pSSysEAIDataTypeId) {
        this.setPSSysEAIDataTypeId(pSSysEAIDataTypeId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeid(PSSysEAIDataTypeDTO pSSysEAIDataType) {
        if (pSSysEAIDataType == null) {
            this.setPSSysEAIDataTypeId(null);
            this.setPSSysEAIDataTypeName(null);
        } else {
            this.setPSSysEAIDataTypeId(pSSysEAIDataType.getPSSysEAIDataTypeId());
            this.setPSSysEAIDataTypeName(pSSysEAIDataType.getPSSysEAIDataTypeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaidatatypeitemid")
    public void setPSSysEAIDataTypeItemId(String pSSysEAIDataTypeItemId) {
        this._set(DTOFIELD_PSSYSEAIDATATYPEITEMID, pSSysEAIDataTypeItemId);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPEITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPEITEMID);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeItemId() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPEITEMID);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeitemid(String pSSysEAIDataTypeItemId) {
        this.setPSSysEAIDataTypeItemId(pSSysEAIDataTypeItemId);
        return this;
    }

    @JsonProperty(value="pssyseaidatatypeitemname")
    public void setPSSysEAIDataTypeItemName(String pSSysEAIDataTypeItemName) {
        this._set(DTOFIELD_PSSYSEAIDATATYPEITEMNAME, pSSysEAIDataTypeItemName);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPEITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeItemName() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPEITEMNAME);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO pssyseaidatatypeitemname(String pSSysEAIDataTypeItemName) {
        this.setPSSysEAIDataTypeItemName(pSSysEAIDataTypeItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIDataTypeItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIDataTypeItemName(strName);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO name(String strName) {
        this.setPSSysEAIDataTypeItemName(strName);
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
    public PSSysEAIDataTypeItemDTO pssyseaidatatypename(String pSSysEAIDataTypeName) {
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
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
    public PSSysEAIDataTypeItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIDataTypeItemDTO updateman(String updateMan) {
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
    public PSSysEAIDataTypeItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIDataTypeItemDTO usertag(String userTag) {
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
    public PSSysEAIDataTypeItemDTO usertag2(String userTag2) {
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
    public PSSysEAIDataTypeItemDTO usertag3(String userTag3) {
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
    public PSSysEAIDataTypeItemDTO usertag4(String userTag4) {
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
    public PSSysEAIDataTypeItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="value")
    public void setValue(String value) {
        this._set(DTOFIELD_VALUE, value);
    }

    @JsonIgnore
    public String getValue() {
        Object objValue = this._get(DTOFIELD_VALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueDirty() {
        return this._contains(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public void resetValue() {
        this._reset(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO value(String value) {
        this.setValue(value);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIDataTypeItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIDataTypeItemId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDataTypeItemDTO id(String strValue) {
        this.setPSSysEAIDataTypeItemId(strValue);
        return this;
    }
}
