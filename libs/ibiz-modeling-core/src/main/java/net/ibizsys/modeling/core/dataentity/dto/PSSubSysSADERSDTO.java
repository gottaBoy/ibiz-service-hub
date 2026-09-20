package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSubSysSADERSDTO extends PSModelDTOBase {
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CHILDFILTER = "CHILDFILTER";
    protected static final String DTOFIELD_CHILDFILTER = "childfilter";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CPSSUBSYSSADEID = "CPSSUBSYSSADEID";
    protected static final String DTOFIELD_CPSSUBSYSSADEID = "cpssubsyssadeid";
    public static final String FIELD_CPSSUBSYSSADENAME = "CPSSUBSYSSADENAME";
    protected static final String DTOFIELD_CPSSUBSYSSADENAME = "cpssubsyssadename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSSUBSYSSADEID = "PPSSUBSYSSADEID";
    protected static final String DTOFIELD_PPSSUBSYSSADEID = "ppssubsyssadeid";
    public static final String FIELD_PPSSUBSYSSADENAME = "PPSSUBSYSSADENAME";
    protected static final String DTOFIELD_PPSSUBSYSSADENAME = "ppssubsyssadename";
    public static final String FIELD_PSSUBSYSSADERSID = "PSSUBSYSSADERSID";
    protected static final String DTOFIELD_PSSUBSYSSADERSID = "pssubsyssadersid";
    public static final String FIELD_PSSUBSYSSADERSNAME = "PSSUBSYSSADERSNAME";
    protected static final String DTOFIELD_PSSUBSYSSADERSNAME = "pssubsyssadersname";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_RSTAG = "RSTAG";
    protected static final String DTOFIELD_RSTAG = "rstag";
    public static final String FIELD_RSTAG2 = "RSTAG2";
    protected static final String DTOFIELD_RSTAG2 = "rstag2";
    public static final String FIELD_TYPEFILTER = "TYPEFILTER";
    protected static final String DTOFIELD_TYPEFILTER = "typefilter";
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
    public PSSubSysSADERSDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO arrayflag(Boolean arrayFlag) {
        this.setArrayFlag(arrayFlag == null ? null : (arrayFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="childfilter")
    public void setChildFilter(String childFilter) {
        this._set(DTOFIELD_CHILDFILTER, childFilter);
    }

    @JsonIgnore
    public String getChildFilter() {
        Object objValue = this._get(DTOFIELD_CHILDFILTER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChildFilterDirty() {
        return this._contains(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public void resetChildFilter() {
        this._reset(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO childfilter(String childFilter) {
        this.setChildFilter(childFilter);
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
    public PSSubSysSADERSDTO codename(String codeName) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADERSDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
        return this;
    }

    @JsonProperty(value="cpssubsyssadeid")
    public void setCPSSubSysSADEId(String cPSSubSysSADEId) {
        this._set(DTOFIELD_CPSSUBSYSSADEID, cPSSubSysSADEId);
    }

    @JsonIgnore
    public String getCPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_CPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_CPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetCPSSubSysSADEId() {
        this._reset(DTOFIELD_CPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO cpssubsyssadeid(String cPSSubSysSADEId) {
        this.setCPSSubSysSADEId(cPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO cpssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setCPSSubSysSADEId(null);
            this.setCPSSubSysSADEName(null);
        } else {
            this.setCPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setCPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="cpssubsyssadename")
    public void setCPSSubSysSADEName(String cPSSubSysSADEName) {
        this._set(DTOFIELD_CPSSUBSYSSADENAME, cPSSubSysSADEName);
    }

    @JsonIgnore
    public String getCPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_CPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_CPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetCPSSubSysSADEName() {
        this._reset(DTOFIELD_CPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO cpssubsyssadename(String cPSSubSysSADEName) {
        this.setCPSSubSysSADEName(cPSSubSysSADEName);
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
    public PSSubSysSADERSDTO createdate(Timestamp createDate) {
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
    public PSSubSysSADERSDTO createman(String createMan) {
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
    public PSSubSysSADERSDTO memo(String memo) {
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
    public PSSubSysSADERSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppssubsyssadeid")
    public void setPPSSubSysSADEId(String pPSSubSysSADEId) {
        this._set(DTOFIELD_PPSSUBSYSSADEID, pPSSubSysSADEId);
    }

    @JsonIgnore
    public String getPPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_PPSSUBSYSSADEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_PPSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetPPSSubSysSADEId() {
        this._reset(DTOFIELD_PPSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO ppssubsyssadeid(String pPSSubSysSADEId) {
        this.setPPSSubSysSADEId(pPSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO ppssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setPPSSubSysSADEId(null);
            this.setPPSSubSysSADEName(null);
        } else {
            this.setPPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="ppssubsyssadename")
    public void setPPSSubSysSADEName(String pPSSubSysSADEName) {
        this._set(DTOFIELD_PPSSUBSYSSADENAME, pPSSubSysSADEName);
    }

    @JsonIgnore
    public String getPPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_PPSSUBSYSSADENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_PPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetPPSSubSysSADEName() {
        this._reset(DTOFIELD_PPSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO ppssubsyssadename(String pPSSubSysSADEName) {
        this.setPPSSubSysSADEName(pPSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="pssubsyssadersid")
    public void setPSSubSysSADERSId(String pSSubSysSADERSId) {
        this._set(DTOFIELD_PSSUBSYSSADERSID, pSSubSysSADERSId);
    }

    @JsonIgnore
    public String getPSSubSysSADERSId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADERSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADERSIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADERSID);
    }

    @JsonIgnore
    public void resetPSSubSysSADERSId() {
        this._reset(DTOFIELD_PSSUBSYSSADERSID);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO pssubsyssadersid(String pSSubSysSADERSId) {
        this.setPSSubSysSADERSId(pSSubSysSADERSId);
        return this;
    }

    @JsonProperty(value="pssubsyssadersname")
    public void setPSSubSysSADERSName(String pSSubSysSADERSName) {
        this._set(DTOFIELD_PSSUBSYSSADERSNAME, pSSubSysSADERSName);
    }

    @JsonIgnore
    public String getPSSubSysSADERSName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADERSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADERSNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADERSNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADERSName() {
        this._reset(DTOFIELD_PSSUBSYSSADERSNAME);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO pssubsyssadersname(String pSSubSysSADERSName) {
        this.setPSSubSysSADERSName(pSSubSysSADERSName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
        if (pSSubSysServiceAPI == null) {
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        } else {
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIName() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="rstag")
    public void setRSTag(String rSTag) {
        this._set(DTOFIELD_RSTAG, rSTag);
    }

    @JsonIgnore
    public String getRSTag() {
        Object objValue = this._get(DTOFIELD_RSTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTagDirty() {
        return this._contains(DTOFIELD_RSTAG);
    }

    @JsonIgnore
    public void resetRSTag() {
        this._reset(DTOFIELD_RSTAG);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO rstag(String rSTag) {
        this.setRSTag(rSTag);
        return this;
    }

    @JsonProperty(value="rstag2")
    public void setRSTag2(String rSTag2) {
        this._set(DTOFIELD_RSTAG2, rSTag2);
    }

    @JsonIgnore
    public String getRSTag2() {
        Object objValue = this._get(DTOFIELD_RSTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRSTag2Dirty() {
        return this._contains(DTOFIELD_RSTAG2);
    }

    @JsonIgnore
    public void resetRSTag2() {
        this._reset(DTOFIELD_RSTAG2);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO rstag2(String rSTag2) {
        this.setRSTag2(rSTag2);
        return this;
    }

    @JsonProperty(value="typefilter")
    public void setTypeFilter(String typeFilter) {
        this._set(DTOFIELD_TYPEFILTER, typeFilter);
    }

    @JsonIgnore
    public String getTypeFilter() {
        Object objValue = this._get(DTOFIELD_TYPEFILTER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypeFilterDirty() {
        return this._contains(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public void resetTypeFilter() {
        this._reset(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO typefilter(String typeFilter) {
        this.setTypeFilter(typeFilter);
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
    public PSSubSysSADERSDTO updatedate(Timestamp updateDate) {
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
    public PSSubSysSADERSDTO updateman(String updateMan) {
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
    public PSSubSysSADERSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSubSysSADERSDTO usertag(String userTag) {
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
    public PSSubSysSADERSDTO usertag2(String userTag2) {
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
    public PSSubSysSADERSDTO usertag3(String userTag3) {
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
    public PSSubSysSADERSDTO usertag4(String userTag4) {
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
        if (objValue == null) return null;
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
    public PSSubSysSADERSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSubSysSADERSDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSubSysSADERSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSubSysSADERSName(strName);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO name(String strName) {
        this.setPSSubSysSADERSName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSubSysSADERSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSubSysSADERSId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADERSDTO id(String strValue) {
        this.setPSSubSysSADERSId(strValue);
        return this;
    }

}
