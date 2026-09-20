package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIDimensionDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBIHierarchyDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLCAPTION = "ALLCAPTION";
    protected static final String DTOFIELD_ALLCAPTION = "allcaption";
    public static final String FIELD_BIHIERARCHYTAG = "BIHIERARCHYTAG";
    protected static final String DTOFIELD_BIHIERARCHYTAG = "bihierarchytag";
    public static final String FIELD_BIHIERARCHYTAG2 = "BIHIERARCHYTAG2";
    protected static final String DTOFIELD_BIHIERARCHYTAG2 = "bihierarchytag2";
    public static final String FIELD_BIHIERARCHYTYPE = "BIHIERARCHYTYPE";
    protected static final String DTOFIELD_BIHIERARCHYTYPE = "bihierarchytype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_HASALL = "HASALL";
    protected static final String DTOFIELD_HASALL = "hasall";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBIDIMENSIONID = "PSSYSBIDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";
    public static final String FIELD_PSSYSBIDIMENSIONNAME = "PSSYSBIDIMENSIONNAME";
    protected static final String DTOFIELD_PSSYSBIDIMENSIONNAME = "pssysbidimensionname";
    public static final String FIELD_PSSYSBIHIERARCHYID = "PSSYSBIHIERARCHYID";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";
    public static final String FIELD_PSSYSBIHIERARCHYNAME = "PSSYSBIHIERARCHYNAME";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";
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

    @JsonProperty(value="allcaption")
    public void setAllCaption(String allCaption) {
        this._set(DTOFIELD_ALLCAPTION, allCaption);
    }

    @JsonIgnore
    public String getAllCaption() {
        Object objValue = this._get(DTOFIELD_ALLCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAllCaptionDirty() {
        return this._contains(DTOFIELD_ALLCAPTION);
    }

    @JsonIgnore
    public void resetAllCaption() {
        this._reset(DTOFIELD_ALLCAPTION);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO allcaption(String allCaption) {
        this.setAllCaption(allCaption);
        return this;
    }

    @JsonProperty(value="bihierarchytag")
    public void setBIHierarchyTag(String bIHierarchyTag) {
        this._set(DTOFIELD_BIHIERARCHYTAG, bIHierarchyTag);
    }

    @JsonIgnore
    public String getBIHierarchyTag() {
        Object objValue = this._get(DTOFIELD_BIHIERARCHYTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIHierarchyTagDirty() {
        return this._contains(DTOFIELD_BIHIERARCHYTAG);
    }

    @JsonIgnore
    public void resetBIHierarchyTag() {
        this._reset(DTOFIELD_BIHIERARCHYTAG);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO bihierarchytag(String bIHierarchyTag) {
        this.setBIHierarchyTag(bIHierarchyTag);
        return this;
    }

    @JsonProperty(value="bihierarchytag2")
    public void setBIHierarchyTag2(String bIHierarchyTag2) {
        this._set(DTOFIELD_BIHIERARCHYTAG2, bIHierarchyTag2);
    }

    @JsonIgnore
    public String getBIHierarchyTag2() {
        Object objValue = this._get(DTOFIELD_BIHIERARCHYTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIHierarchyTag2Dirty() {
        return this._contains(DTOFIELD_BIHIERARCHYTAG2);
    }

    @JsonIgnore
    public void resetBIHierarchyTag2() {
        this._reset(DTOFIELD_BIHIERARCHYTAG2);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO bihierarchytag2(String bIHierarchyTag2) {
        this.setBIHierarchyTag2(bIHierarchyTag2);
        return this;
    }

    @JsonProperty(value="bihierarchytype")
    public void setBIHierarchyType(String bIHierarchyType) {
        this._set(DTOFIELD_BIHIERARCHYTYPE, bIHierarchyType);
    }

    @JsonIgnore
    public String getBIHierarchyType() {
        Object objValue = this._get(DTOFIELD_BIHIERARCHYTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIHierarchyTypeDirty() {
        return this._contains(DTOFIELD_BIHIERARCHYTYPE);
    }

    @JsonIgnore
    public void resetBIHierarchyType() {
        this._reset(DTOFIELD_BIHIERARCHYTYPE);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO bihierarchytype(String bIHierarchyType) {
        this.setBIHierarchyType(bIHierarchyType);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO bihierarchytype(PSModelEnums.BIHierarchyType bIHierarchyType) {
        if (bIHierarchyType == null) {
            this.setBIHierarchyType(null);
        } else {
            this.setBIHierarchyType(bIHierarchyType.value);
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
    public PSSysBIHierarchyDTO codename(String codeName) {
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
    public PSSysBIHierarchyDTO createdate(Timestamp createDate) {
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
    public PSSysBIHierarchyDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="hasall")
    public void setHasAll(Integer hasAll) {
        this._set(DTOFIELD_HASALL, hasAll);
    }

    @JsonIgnore
    public Integer getHasAll() {
        Object objValue = this._get(DTOFIELD_HASALL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHasAllDirty() {
        return this._contains(DTOFIELD_HASALL);
    }

    @JsonIgnore
    public void resetHasAll() {
        this._reset(DTOFIELD_HASALL);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO hasall(Integer hasAll) {
        this.setHasAll(hasAll);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO hasall(Boolean hasAll) {
        if (hasAll == null) {
            this.setHasAll(null);
        } else {
            this.setHasAll(hasAll != false ? 1 : 0);
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
    public PSSysBIHierarchyDTO memo(String memo) {
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
    public PSSysBIHierarchyDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysBIHierarchyDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysBIHierarchyDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSSysBIHierarchyDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSSysBIHierarchyDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysbidimensionid")
    public void setPSSysBIDimensionId(String pSSysBIDimensionId) {
        this._set(DTOFIELD_PSSYSBIDIMENSIONID, pSSysBIDimensionId);
    }

    @JsonIgnore
    public String getPSSysBIDimensionId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIDIMENSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIDimensionIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIDIMENSIONID);
    }

    @JsonIgnore
    public void resetPSSysBIDimensionId() {
        this._reset(DTOFIELD_PSSYSBIDIMENSIONID);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO pssysbidimensionid(String pSSysBIDimensionId) {
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO pssysbidimensionid(PSSysBIDimensionDTO pSSysBIDimension) {
        if (pSSysBIDimension == null) {
            this.setPSSysBIDimensionId(null);
            this.setPSSysBIDimensionName(null);
        } else {
            this.setPSSysBIDimensionId(pSSysBIDimension.getPSSysBIDimensionId());
            this.setPSSysBIDimensionName(pSSysBIDimension.getPSSysBIDimensionName());
        }
        return this;
    }

    @JsonProperty(value="pssysbidimensionname")
    public void setPSSysBIDimensionName(String pSSysBIDimensionName) {
        this._set(DTOFIELD_PSSYSBIDIMENSIONNAME, pSSysBIDimensionName);
    }

    @JsonIgnore
    public String getPSSysBIDimensionName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIDIMENSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIDimensionNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIDIMENSIONNAME);
    }

    @JsonIgnore
    public void resetPSSysBIDimensionName() {
        this._reset(DTOFIELD_PSSYSBIDIMENSIONNAME);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO pssysbidimensionname(String pSSysBIDimensionName) {
        this.setPSSysBIDimensionName(pSSysBIDimensionName);
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
    public PSSysBIHierarchyDTO pssysbihierarchyid(String pSSysBIHierarchyId) {
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
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
    public PSSysBIHierarchyDTO pssysbihierarchyname(String pSSysBIHierarchyName) {
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBIHierarchyName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBIHierarchyName(strName);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO name(String strName) {
        this.setPSSysBIHierarchyName(strName);
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
    public PSSysBIHierarchyDTO updatedate(Timestamp updateDate) {
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
    public PSSysBIHierarchyDTO updateman(String updateMan) {
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
    public PSSysBIHierarchyDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBIHierarchyDTO usertag(String userTag) {
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
    public PSSysBIHierarchyDTO usertag2(String userTag2) {
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
    public PSSysBIHierarchyDTO usertag3(String userTag3) {
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
    public PSSysBIHierarchyDTO usertag4(String userTag4) {
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
    public PSSysBIHierarchyDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBIHierarchyId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBIHierarchyId(strValue);
    }

    @JsonIgnore
    public PSSysBIHierarchyDTO id(String strValue) {
        this.setPSSysBIHierarchyId(strValue);
        return this;
    }
}
