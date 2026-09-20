package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSubSysSADetailParamDTO extends PSModelDTOBase {
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
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
    public static final String FIELD_PARAMTAG = "PARAMTAG";
    protected static final String DTOFIELD_PARAMTAG = "paramtag";
    public static final String FIELD_PARAMTAG2 = "PARAMTAG2";
    protected static final String DTOFIELD_PARAMTAG2 = "paramtag2";
    public static final String FIELD_PSSUBSYSSADETAILID = "PSSUBSYSSADETAILID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";
    public static final String FIELD_PSSUBSYSSADETAILNAME = "PSSUBSYSSADETAILNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";
    public static final String FIELD_PSSUBSYSSADETAILPARAMID = "PSSUBSYSSADETAILPARAMID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILPARAMID = "pssubsyssadetailparamid";
    public static final String FIELD_PSSUBSYSSADETAILPARAMNAME = "PSSUBSYSSADETAILPARAMNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILPARAMNAME = "pssubsyssadetailparamname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
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

    @JsonProperty(value="arrayflag")
    public void setArrayFlag(Integer arrayFlag) {
        this._set(DTOFIELD_ARRAYFLAG, arrayFlag);
    }

    @JsonIgnore
    public Integer getArrayFlag() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isArrayFlagDirty() {
        return this._contains(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public void resetArrayFlag() {
        this._reset(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO arrayflag(Boolean arrayFlag) {
        this.setArrayFlag(arrayFlag == null ? null : (arrayFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO codename(String codeName) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO createman(String createMan) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO memo(String memo) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="paramtag")
    public void setParamTag(String paramTag) {
        this._set(DTOFIELD_PARAMTAG, paramTag);
    }

    @JsonIgnore
    public String getParamTag() {
        Object objValue = this._get(DTOFIELD_PARAMTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTagDirty() {
        return this._contains(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public void resetParamTag() {
        this._reset(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO paramtag(String paramTag) {
        this.setParamTag(paramTag);
        return this;
    }

    @JsonProperty(value="paramtag2")
    public void setParamTag2(String paramTag2) {
        this._set(DTOFIELD_PARAMTAG2, paramTag2);
    }

    @JsonIgnore
    public String getParamTag2() {
        Object objValue = this._get(DTOFIELD_PARAMTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTag2Dirty() {
        return this._contains(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public void resetParamTag2() {
        this._reset(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO paramtag2(String paramTag2) {
        this.setParamTag2(paramTag2);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailid")
    public void setPSSubSysSADetailId(String pSSubSysSADetailId) {
        this._set(DTOFIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }

    @JsonIgnore
    public String getPSSubSysSADetailId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailId() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO pssubsyssadetailid(String pSSubSysSADetailId) {
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail) {
        if (pSSubSysSADetail == null) {
            this.setPSSubSysSADetailId(null);
            this.setPSSubSysSADetailName(null);
        } else {
            this.setPSSubSysSADetailId(pSSubSysSADetail.getPSSubSysSADetailId());
            this.setPSSubSysSADetailName(pSSubSysSADetail.getPSSubSysSADetailName());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadetailname")
    public void setPSSubSysSADetailName(String pSSubSysSADetailName) {
        this._set(DTOFIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }

    @JsonIgnore
    public String getPSSubSysSADetailName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailName() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO pssubsyssadetailname(String pSSubSysSADetailName) {
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailparamid")
    public void setPSSubSysSADetailParamId(String pSSubSysSADetailParamId) {
        this._set(DTOFIELD_PSSUBSYSSADETAILPARAMID, pSSubSysSADetailParamId);
    }

    @JsonIgnore
    public String getPSSubSysSADetailParamId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILPARAMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailParamIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILPARAMID);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailParamId() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILPARAMID);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO pssubsyssadetailparamid(String pSSubSysSADetailParamId) {
        this.setPSSubSysSADetailParamId(pSSubSysSADetailParamId);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailparamname")
    public void setPSSubSysSADetailParamName(String pSSubSysSADetailParamName) {
        this._set(DTOFIELD_PSSUBSYSSADETAILPARAMNAME, pSSubSysSADetailParamName);
    }

    @JsonIgnore
    public String getPSSubSysSADetailParamName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILPARAMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailParamNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILPARAMNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailParamName() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILPARAMNAME);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO pssubsyssadetailparamname(String pSSubSysSADetailParamName) {
        this.setPSSubSysSADetailParamName(pSSubSysSADetailParamName);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        this.setStdDataType(stdDataType == null ? null : stdDataType.value);
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO usertag2(String userTag2) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO usertag3(String userTag3) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADetailParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSubSysSADetailParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSubSysSADetailParamName(strName);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO name(String strName) {
        this.setPSSubSysSADetailParamName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSubSysSADetailParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSubSysSADetailParamId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADetailParamDTO id(String strValue) {
        this.setPSSubSysSADetailParamId(strValue);
        return this;
    }

}
