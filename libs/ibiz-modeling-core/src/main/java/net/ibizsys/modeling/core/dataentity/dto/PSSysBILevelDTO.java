package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIHierarchyDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBILevelDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGCAPTION = "AGGCAPTION";
    protected static final String DTOFIELD_AGGCAPTION = "aggcaption";
    public static final String FIELD_BILEVELTAG = "BILEVELTAG";
    protected static final String DTOFIELD_BILEVELTAG = "bileveltag";
    public static final String FIELD_BILEVELTAG2 = "BILEVELTAG2";
    protected static final String DTOFIELD_BILEVELTAG2 = "bileveltag2";
    public static final String FIELD_BILEVELTYPE = "BILEVELTYPE";
    protected static final String DTOFIELD_BILEVELTYPE = "bileveltype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSBIHIERARCHYID = "PSSYSBIHIERARCHYID";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";
    public static final String FIELD_PSSYSBIHIERARCHYNAME = "PSSYSBIHIERARCHYNAME";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";
    public static final String FIELD_PSSYSBILEVELID = "PSSYSBILEVELID";
    protected static final String DTOFIELD_PSSYSBILEVELID = "pssysbilevelid";
    public static final String FIELD_PSSYSBILEVELNAME = "PSSYSBILEVELNAME";
    protected static final String DTOFIELD_PSSYSBILEVELNAME = "pssysbilevelname";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
    public static final String FIELD_UNIQUEMEMBERS = "UNIQUEMEMBERS";
    protected static final String DTOFIELD_UNIQUEMEMBERS = "uniquemembers";
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
    public static final String FIELD_VALUEPSDEFID = "VALUEPSDEFID";
    protected static final String DTOFIELD_VALUEPSDEFID = "valuepsdefid";
    public static final String FIELD_VALUEPSDEFNAME = "VALUEPSDEFNAME";
    protected static final String DTOFIELD_VALUEPSDEFNAME = "valuepsdefname";

    @JsonProperty(value="aggcaption")
    public void setAggCaption(String aggCaption) {
        this._set(DTOFIELD_AGGCAPTION, aggCaption);
    }

    @JsonIgnore
    public String getAggCaption() {
        Object objValue = this._get(DTOFIELD_AGGCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggCaptionDirty() {
        return this._contains(DTOFIELD_AGGCAPTION);
    }

    @JsonIgnore
    public void resetAggCaption() {
        this._reset(DTOFIELD_AGGCAPTION);
    }

    @JsonIgnore
    public PSSysBILevelDTO aggcaption(String aggCaption) {
        this.setAggCaption(aggCaption);
        return this;
    }

    @JsonProperty(value="bileveltag")
    public void setBILevelTag(String bILevelTag) {
        this._set(DTOFIELD_BILEVELTAG, bILevelTag);
    }

    @JsonIgnore
    public String getBILevelTag() {
        Object objValue = this._get(DTOFIELD_BILEVELTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBILevelTagDirty() {
        return this._contains(DTOFIELD_BILEVELTAG);
    }

    @JsonIgnore
    public void resetBILevelTag() {
        this._reset(DTOFIELD_BILEVELTAG);
    }

    @JsonIgnore
    public PSSysBILevelDTO bileveltag(String bILevelTag) {
        this.setBILevelTag(bILevelTag);
        return this;
    }

    @JsonProperty(value="bileveltag2")
    public void setBILevelTag2(String bILevelTag2) {
        this._set(DTOFIELD_BILEVELTAG2, bILevelTag2);
    }

    @JsonIgnore
    public String getBILevelTag2() {
        Object objValue = this._get(DTOFIELD_BILEVELTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBILevelTag2Dirty() {
        return this._contains(DTOFIELD_BILEVELTAG2);
    }

    @JsonIgnore
    public void resetBILevelTag2() {
        this._reset(DTOFIELD_BILEVELTAG2);
    }

    @JsonIgnore
    public PSSysBILevelDTO bileveltag2(String bILevelTag2) {
        this.setBILevelTag2(bILevelTag2);
        return this;
    }

    @JsonProperty(value="bileveltype")
    public void setBILevelType(String bILevelType) {
        this._set(DTOFIELD_BILEVELTYPE, bILevelType);
    }

    @JsonIgnore
    public String getBILevelType() {
        Object objValue = this._get(DTOFIELD_BILEVELTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBILevelTypeDirty() {
        return this._contains(DTOFIELD_BILEVELTYPE);
    }

    @JsonIgnore
    public void resetBILevelType() {
        this._reset(DTOFIELD_BILEVELTYPE);
    }

    @JsonIgnore
    public PSSysBILevelDTO bileveltype(String bILevelType) {
        this.setBILevelType(bILevelType);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO bileveltype(PSModelEnums.BILevelType bILevelType) {
        if (bILevelType == null) {
            this.setBILevelType(null);
        } else {
            this.setBILevelType(bILevelType.value);
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
    public PSSysBILevelDTO codename(String codeName) {
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
    public PSSysBILevelDTO createdate(Timestamp createDate) {
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
    public PSSysBILevelDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysBILevelDTO memo(String memo) {
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
    public PSSysBILevelDTO ordervalue(Integer orderValue) {
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
    public PSSysBILevelDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssysbihierarchyid")
    public void setPSSysBIHierarchyId(String pSSysBIHierarchyId) {
        this._set(DTOFIELD_PSSYSBIHIERARCHYID, pSSysBIHierarchyId);
    }

    @JsonIgnore
    public String getPSSysBIHierarchyId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIHIERARCHYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIHierarchyIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIHIERARCHYID);
    }

    @JsonIgnore
    public void resetPSSysBIHierarchyId() {
        this._reset(DTOFIELD_PSSYSBIHIERARCHYID);
    }

    @JsonIgnore
    public PSSysBILevelDTO pssysbihierarchyid(String pSSysBIHierarchyId) {
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO pssysbihierarchyid(PSSysBIHierarchyDTO pSSysBIHierarchy) {
        if (pSSysBIHierarchy == null) {
            this.setPSDEId(null);
            this.setPSSysBIHierarchyId(null);
            this.setPSSysBIHierarchyName(null);
        } else {
            this.setPSDEId(pSSysBIHierarchy.getPSDEId());
            this.setPSSysBIHierarchyId(pSSysBIHierarchy.getPSSysBIHierarchyId());
            this.setPSSysBIHierarchyName(pSSysBIHierarchy.getPSSysBIHierarchyName());
        }
        return this;
    }

    @JsonProperty(value="pssysbihierarchyname")
    public void setPSSysBIHierarchyName(String pSSysBIHierarchyName) {
        this._set(DTOFIELD_PSSYSBIHIERARCHYNAME, pSSysBIHierarchyName);
    }

    @JsonIgnore
    public String getPSSysBIHierarchyName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIHIERARCHYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIHierarchyNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIHIERARCHYNAME);
    }

    @JsonIgnore
    public void resetPSSysBIHierarchyName() {
        this._reset(DTOFIELD_PSSYSBIHIERARCHYNAME);
    }

    @JsonIgnore
    public PSSysBILevelDTO pssysbihierarchyname(String pSSysBIHierarchyName) {
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    @JsonProperty(value="pssysbilevelid")
    public void setPSSysBILevelId(String pSSysBILevelId) {
        this._set(DTOFIELD_PSSYSBILEVELID, pSSysBILevelId);
    }

    @JsonIgnore
    public String getPSSysBILevelId() {
        Object objValue = this._get(DTOFIELD_PSSYSBILEVELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBILevelIdDirty() {
        return this._contains(DTOFIELD_PSSYSBILEVELID);
    }

    @JsonIgnore
    public void resetPSSysBILevelId() {
        this._reset(DTOFIELD_PSSYSBILEVELID);
    }

    @JsonIgnore
    public PSSysBILevelDTO pssysbilevelid(String pSSysBILevelId) {
        this.setPSSysBILevelId(pSSysBILevelId);
        return this;
    }

    @JsonProperty(value="pssysbilevelname")
    public void setPSSysBILevelName(String pSSysBILevelName) {
        this._set(DTOFIELD_PSSYSBILEVELNAME, pSSysBILevelName);
    }

    @JsonIgnore
    public String getPSSysBILevelName() {
        Object objValue = this._get(DTOFIELD_PSSYSBILEVELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBILevelNameDirty() {
        return this._contains(DTOFIELD_PSSYSBILEVELNAME);
    }

    @JsonIgnore
    public void resetPSSysBILevelName() {
        this._reset(DTOFIELD_PSSYSBILEVELNAME);
    }

    @JsonIgnore
    public PSSysBILevelDTO pssysbilevelname(String pSSysBILevelName) {
        this.setPSSysBILevelName(pSSysBILevelName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBILevelName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBILevelName(strName);
    }

    @JsonIgnore
    public PSSysBILevelDTO name(String strName) {
        this.setPSSysBILevelName(strName);
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSSysBILevelDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysBILevelDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    @JsonProperty(value="uniquemembers")
    public void setUniqueMembers(Integer uniqueMembers) {
        this._set(DTOFIELD_UNIQUEMEMBERS, uniqueMembers);
    }

    @JsonIgnore
    public Integer getUniqueMembers() {
        Object objValue = this._get(DTOFIELD_UNIQUEMEMBERS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUniqueMembersDirty() {
        return this._contains(DTOFIELD_UNIQUEMEMBERS);
    }

    @JsonIgnore
    public void resetUniqueMembers() {
        this._reset(DTOFIELD_UNIQUEMEMBERS);
    }

    @JsonIgnore
    public PSSysBILevelDTO uniquemembers(Integer uniqueMembers) {
        this.setUniqueMembers(uniqueMembers);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO uniquemembers(Boolean uniqueMembers) {
        if (uniqueMembers == null) {
            this.setUniqueMembers(null);
        } else {
            this.setUniqueMembers(uniqueMembers != false ? 1 : 0);
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
    public PSSysBILevelDTO updatedate(Timestamp updateDate) {
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
    public PSSysBILevelDTO updateman(String updateMan) {
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
    public PSSysBILevelDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBILevelDTO usertag(String userTag) {
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
    public PSSysBILevelDTO usertag2(String userTag2) {
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
    public PSSysBILevelDTO usertag3(String userTag3) {
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
    public PSSysBILevelDTO usertag4(String userTag4) {
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
    public PSSysBILevelDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valuepsdefid")
    public void setValuePSDEFId(String valuePSDEFId) {
        this._set(DTOFIELD_VALUEPSDEFID, valuePSDEFId);
    }

    @JsonIgnore
    public String getValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public void resetValuePSDEFId() {
        this._reset(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public PSSysBILevelDTO valuepsdefid(String valuePSDEFId) {
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBILevelDTO valuepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        } else {
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="valuepsdefname")
    public void setValuePSDEFName(String valuePSDEFName) {
        this._set(DTOFIELD_VALUEPSDEFNAME, valuePSDEFName);
    }

    @JsonIgnore
    public String getValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetValuePSDEFName() {
        this._reset(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysBILevelDTO valuepsdefname(String valuePSDEFName) {
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBILevelId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBILevelId(strValue);
    }

    @JsonIgnore
    public PSSysBILevelDTO id(String strValue) {
        this.setPSSysBILevelId(strValue);
        return this;
    }
}
