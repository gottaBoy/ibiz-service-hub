package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDTableRSDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MAJORPSSYSBDTABLEID = "MAJORPSSYSBDTABLEID";
    protected static final String DTOFIELD_MAJORPSSYSBDTABLEID = "majorpssysbdtableid";
    public static final String FIELD_MAJORPSSYSBDTABLENAME = "MAJORPSSYSBDTABLENAME";
    protected static final String DTOFIELD_MAJORPSSYSBDTABLENAME = "majorpssysbdtablename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORCODENAME = "MINORCODENAME";
    protected static final String DTOFIELD_MINORCODENAME = "minorcodename";
    public static final String FIELD_MINORPSSYSBDTABLEID = "MINORPSSYSBDTABLEID";
    protected static final String DTOFIELD_MINORPSSYSBDTABLEID = "minorpssysbdtableid";
    public static final String FIELD_MINORPSSYSBDTABLENAME = "MINORPSSYSBDTABLENAME";
    protected static final String DTOFIELD_MINORPSSYSBDTABLENAME = "minorpssysbdtablename";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDSCHEMENAME = "PSSYSBDSCHEMENAME";
    protected static final String DTOFIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";
    public static final String FIELD_PSSYSBDTABLERSID = "PSSYSBDTABLERSID";
    protected static final String DTOFIELD_PSSYSBDTABLERSID = "pssysbdtablersid";
    public static final String FIELD_PSSYSBDTABLERSNAME = "PSSYSBDTABLERSNAME";
    protected static final String DTOFIELD_PSSYSBDTABLERSNAME = "pssysbdtablersname";
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
    public PSSysBDTableRSDTO codename(String codeName) {
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
    public PSSysBDTableRSDTO createdate(Timestamp createDate) {
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
    public PSSysBDTableRSDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="majorpssysbdtableid")
    public void setMajorPSSysBDTableId(String majorPSSysBDTableId) {
        this._set(DTOFIELD_MAJORPSSYSBDTABLEID, majorPSSysBDTableId);
    }

    @JsonIgnore
    public String getMajorPSSysBDTableId() {
        Object objValue = this._get(DTOFIELD_MAJORPSSYSBDTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSSysBDTableIdDirty() {
        return this._contains(DTOFIELD_MAJORPSSYSBDTABLEID);
    }

    @JsonIgnore
    public void resetMajorPSSysBDTableId() {
        this._reset(DTOFIELD_MAJORPSSYSBDTABLEID);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtableid(String majorPSSysBDTableId) {
        this.setMajorPSSysBDTableId(majorPSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
        if (pSSysBDTable == null) {
            this.setMajorPSSysBDTableId(null);
            this.setMajorPSSysBDTableName(null);
        } else {
            this.setMajorPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setMajorPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    @JsonProperty(value="majorpssysbdtablename")
    public void setMajorPSSysBDTableName(String majorPSSysBDTableName) {
        this._set(DTOFIELD_MAJORPSSYSBDTABLENAME, majorPSSysBDTableName);
    }

    @JsonIgnore
    public String getMajorPSSysBDTableName() {
        Object objValue = this._get(DTOFIELD_MAJORPSSYSBDTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSSysBDTableNameDirty() {
        return this._contains(DTOFIELD_MAJORPSSYSBDTABLENAME);
    }

    @JsonIgnore
    public void resetMajorPSSysBDTableName() {
        this._reset(DTOFIELD_MAJORPSSYSBDTABLENAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtablename(String majorPSSysBDTableName) {
        this.setMajorPSSysBDTableName(majorPSSysBDTableName);
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
    public PSSysBDTableRSDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorcodename")
    public void setMinorCodeName(String minorCodeName) {
        this._set(DTOFIELD_MINORCODENAME, minorCodeName);
    }

    @JsonIgnore
    public String getMinorCodeName() {
        Object objValue = this._get(DTOFIELD_MINORCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorCodeNameDirty() {
        return this._contains(DTOFIELD_MINORCODENAME);
    }

    @JsonIgnore
    public void resetMinorCodeName() {
        this._reset(DTOFIELD_MINORCODENAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO minorcodename(String minorCodeName) {
        this.setMinorCodeName(minorCodeName);
        return this;
    }

    @JsonProperty(value="minorpssysbdtableid")
    public void setMinorPSSysBDTableId(String minorPSSysBDTableId) {
        this._set(DTOFIELD_MINORPSSYSBDTABLEID, minorPSSysBDTableId);
    }

    @JsonIgnore
    public String getMinorPSSysBDTableId() {
        Object objValue = this._get(DTOFIELD_MINORPSSYSBDTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSSysBDTableIdDirty() {
        return this._contains(DTOFIELD_MINORPSSYSBDTABLEID);
    }

    @JsonIgnore
    public void resetMinorPSSysBDTableId() {
        this._reset(DTOFIELD_MINORPSSYSBDTABLEID);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtableid(String minorPSSysBDTableId) {
        this.setMinorPSSysBDTableId(minorPSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
        if (pSSysBDTable == null) {
            this.setMinorPSSysBDTableId(null);
            this.setMinorPSSysBDTableName(null);
        } else {
            this.setMinorPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setMinorPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    @JsonProperty(value="minorpssysbdtablename")
    public void setMinorPSSysBDTableName(String minorPSSysBDTableName) {
        this._set(DTOFIELD_MINORPSSYSBDTABLENAME, minorPSSysBDTableName);
    }

    @JsonIgnore
    public String getMinorPSSysBDTableName() {
        Object objValue = this._get(DTOFIELD_MINORPSSYSBDTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSSysBDTableNameDirty() {
        return this._contains(DTOFIELD_MINORPSSYSBDTABLENAME);
    }

    @JsonIgnore
    public void resetMinorPSSysBDTableName() {
        this._reset(DTOFIELD_MINORPSSYSBDTABLENAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtablename(String minorPSSysBDTableName) {
        this.setMinorPSSysBDTableName(minorPSSysBDTableName);
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
    public PSSysBDTableRSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="pssysbdschemeid")
    public void setPSSysBDSchemeId(String pSSysBDSchemeId) {
        this._set(DTOFIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }

    @JsonIgnore
    public String getPSSysBDSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeId() {
        this._reset(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme) {
        if (pSSysBDScheme == null) {
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        } else {
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdschemename")
    public void setPSSysBDSchemeName(String pSSysBDSchemeName) {
        this._set(DTOFIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }

    @JsonIgnore
    public String getPSSysBDSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeName() {
        this._reset(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemename(String pSSysBDSchemeName) {
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    @JsonProperty(value="pssysbdtablersid")
    public void setPSSysBDTableRSId(String pSSysBDTableRSId) {
        this._set(DTOFIELD_PSSYSBDTABLERSID, pSSysBDTableRSId);
    }

    @JsonIgnore
    public String getPSSysBDTableRSId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLERSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableRSIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLERSID);
    }

    @JsonIgnore
    public void resetPSSysBDTableRSId() {
        this._reset(DTOFIELD_PSSYSBDTABLERSID);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdtablersid(String pSSysBDTableRSId) {
        this.setPSSysBDTableRSId(pSSysBDTableRSId);
        return this;
    }

    @JsonProperty(value="pssysbdtablersname")
    public void setPSSysBDTableRSName(String pSSysBDTableRSName) {
        this._set(DTOFIELD_PSSYSBDTABLERSNAME, pSSysBDTableRSName);
    }

    @JsonIgnore
    public String getPSSysBDTableRSName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLERSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableRSNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLERSNAME);
    }

    @JsonIgnore
    public void resetPSSysBDTableRSName() {
        this._reset(DTOFIELD_PSSYSBDTABLERSNAME);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdtablersname(String pSSysBDTableRSName) {
        this.setPSSysBDTableRSName(pSSysBDTableRSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDTableRSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDTableRSName(strName);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO name(String strName) {
        this.setPSSysBDTableRSName(strName);
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
    public PSSysBDTableRSDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDTableRSDTO updateman(String updateMan) {
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
    public PSSysBDTableRSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDTableRSDTO usertag(String userTag) {
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
    public PSSysBDTableRSDTO usertag2(String userTag2) {
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
    public PSSysBDTableRSDTO usertag3(String userTag3) {
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
    public PSSysBDTableRSDTO usertag4(String userTag4) {
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
    public PSSysBDTableRSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableRSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDTableRSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDTableRSId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO id(String strValue) {
        this.setPSSysBDTableRSId(strValue);
        return this;
    }
}
