package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestPrjDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTestModuleDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODULETAG = "MODULETAG";
    protected static final String DTOFIELD_MODULETAG = "moduletag";
    public static final String FIELD_MODULETAG2 = "MODULETAG2";
    protected static final String DTOFIELD_MODULETAG2 = "moduletag2";
    public static final String FIELD_MODULETYPE = "MODULETYPE";
    protected static final String DTOFIELD_MODULETYPE = "moduletype";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSSYSTESTMODULEID = "PPSSYSTESTMODULEID";
    protected static final String DTOFIELD_PPSSYSTESTMODULEID = "ppssystestmoduleid";
    public static final String FIELD_PPSSYSTESTMODULENAME = "PPSSYSTESTMODULENAME";
    protected static final String DTOFIELD_PPSSYSTESTMODULENAME = "ppssystestmodulename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSTESTDATAID = "PSSYSTESTDATAID";
    protected static final String DTOFIELD_PSSYSTESTDATAID = "pssystestdataid";
    public static final String FIELD_PSSYSTESTDATANAME = "PSSYSTESTDATANAME";
    protected static final String DTOFIELD_PSSYSTESTDATANAME = "pssystestdataname";
    public static final String FIELD_PSSYSTESTMODULEID = "PSSYSTESTMODULEID";
    protected static final String DTOFIELD_PSSYSTESTMODULEID = "pssystestmoduleid";
    public static final String FIELD_PSSYSTESTMODULENAME = "PSSYSTESTMODULENAME";
    protected static final String DTOFIELD_PSSYSTESTMODULENAME = "pssystestmodulename";
    public static final String FIELD_PSSYSTESTPRJID = "PSSYSTESTPRJID";
    protected static final String DTOFIELD_PSSYSTESTPRJID = "pssystestprjid";
    public static final String FIELD_PSSYSTESTPRJNAME = "PSSYSTESTPRJNAME";
    protected static final String DTOFIELD_PSSYSTESTPRJNAME = "pssystestprjname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_UTILTAG = "UTILTAG";
    protected static final String DTOFIELD_UTILTAG = "utiltag";

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
    public PSSysTestModuleDTO codename(String codeName) {
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
    public PSSysTestModuleDTO createdate(Timestamp createDate) {
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
    public PSSysTestModuleDTO createman(String createMan) {
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
    public PSSysTestModuleDTO data(String data) {
        this.setData(data);
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
    public PSSysTestModuleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="moduletag")
    public void setModuleTag(String moduleTag) {
        this._set(DTOFIELD_MODULETAG, moduleTag);
    }

    @JsonIgnore
    public String getModuleTag() {
        Object objValue = this._get(DTOFIELD_MODULETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTagDirty() {
        return this._contains(DTOFIELD_MODULETAG);
    }

    @JsonIgnore
    public void resetModuleTag() {
        this._reset(DTOFIELD_MODULETAG);
    }

    @JsonIgnore
    public PSSysTestModuleDTO moduletag(String moduleTag) {
        this.setModuleTag(moduleTag);
        return this;
    }

    @JsonProperty(value="moduletag2")
    public void setModuleTag2(String moduleTag2) {
        this._set(DTOFIELD_MODULETAG2, moduleTag2);
    }

    @JsonIgnore
    public String getModuleTag2() {
        Object objValue = this._get(DTOFIELD_MODULETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTag2Dirty() {
        return this._contains(DTOFIELD_MODULETAG2);
    }

    @JsonIgnore
    public void resetModuleTag2() {
        this._reset(DTOFIELD_MODULETAG2);
    }

    @JsonIgnore
    public PSSysTestModuleDTO moduletag2(String moduleTag2) {
        this.setModuleTag2(moduleTag2);
        return this;
    }

    @JsonProperty(value="moduletype")
    public void setModuleType(String moduleType) {
        this._set(DTOFIELD_MODULETYPE, moduleType);
    }

    @JsonIgnore
    public String getModuleType() {
        Object objValue = this._get(DTOFIELD_MODULETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTypeDirty() {
        return this._contains(DTOFIELD_MODULETYPE);
    }

    @JsonIgnore
    public void resetModuleType() {
        this._reset(DTOFIELD_MODULETYPE);
    }

    @JsonIgnore
    public PSSysTestModuleDTO moduletype(String moduleType) {
        this.setModuleType(moduleType);
        return this;
    }

    @JsonIgnore
    public PSSysTestModuleDTO moduletype(PSModelEnums.TestModuleType moduleType) {
        if (moduleType == null) {
            this.setModuleType(null);
        } else {
            this.setModuleType(moduleType.value);
        }
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
    public PSSysTestModuleDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppssystestmoduleid")
    public void setPPSSysTestModuleId(String pPSSysTestModuleId) {
        this._set(DTOFIELD_PPSSYSTESTMODULEID, pPSSysTestModuleId);
    }

    @JsonIgnore
    public String getPPSSysTestModuleId() {
        Object objValue = this._get(DTOFIELD_PPSSYSTESTMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysTestModuleIdDirty() {
        return this._contains(DTOFIELD_PPSSYSTESTMODULEID);
    }

    @JsonIgnore
    public void resetPPSSysTestModuleId() {
        this._reset(DTOFIELD_PPSSYSTESTMODULEID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmoduleid(String pPSSysTestModuleId) {
        this.setPPSSysTestModuleId(pPSSysTestModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmoduleid(PSSysTestModuleDTO pSSysTestModule) {
        if (pSSysTestModule == null) {
            this.setPPSSysTestModuleId(null);
            this.setPPSSysTestModuleName(null);
        } else {
            this.setPPSSysTestModuleId(pSSysTestModule.getPSSysTestModuleId());
            this.setPPSSysTestModuleName(pSSysTestModule.getPSSysTestModuleName());
        }
        return this;
    }

    @JsonProperty(value="ppssystestmodulename")
    public void setPPSSysTestModuleName(String pPSSysTestModuleName) {
        this._set(DTOFIELD_PPSSYSTESTMODULENAME, pPSSysTestModuleName);
    }

    @JsonIgnore
    public String getPPSSysTestModuleName() {
        Object objValue = this._get(DTOFIELD_PPSSYSTESTMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysTestModuleNameDirty() {
        return this._contains(DTOFIELD_PPSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public void resetPPSSysTestModuleName() {
        this._reset(DTOFIELD_PPSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public PSSysTestModuleDTO ppssystestmodulename(String pPSSysTestModuleName) {
        this.setPPSSysTestModuleName(pPSSysTestModuleName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonProperty(value="pssystestdataid")
    public void setPSSysTestDataId(String pSSysTestDataId) {
        this._set(DTOFIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }

    @JsonIgnore
    public String getPSSysTestDataId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public void resetPSSysTestDataId() {
        this._reset(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataid(PSSysTestDataDTO pSSysTestData) {
        if (pSSysTestData == null) {
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        } else {
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    @JsonProperty(value="pssystestdataname")
    public void setPSSysTestDataName(String pSSysTestDataName) {
        this._set(DTOFIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }

    @JsonIgnore
    public String getPSSysTestDataName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public void resetPSSysTestDataName() {
        this._reset(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestdataname(String pSSysTestDataName) {
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonProperty(value="pssystestmoduleid")
    public void setPSSysTestModuleId(String pSSysTestModuleId) {
        this._set(DTOFIELD_PSSYSTESTMODULEID, pSSysTestModuleId);
    }

    @JsonIgnore
    public String getPSSysTestModuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestModuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTMODULEID);
    }

    @JsonIgnore
    public void resetPSSysTestModuleId() {
        this._reset(DTOFIELD_PSSYSTESTMODULEID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestmoduleid(String pSSysTestModuleId) {
        this.setPSSysTestModuleId(pSSysTestModuleId);
        return this;
    }

    @JsonProperty(value="pssystestmodulename")
    public void setPSSysTestModuleName(String pSSysTestModuleName) {
        this._set(DTOFIELD_PSSYSTESTMODULENAME, pSSysTestModuleName);
    }

    @JsonIgnore
    public String getPSSysTestModuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestModuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public void resetPSSysTestModuleName() {
        this._reset(DTOFIELD_PSSYSTESTMODULENAME);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestmodulename(String pSSysTestModuleName) {
        this.setPSSysTestModuleName(pSSysTestModuleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTestModuleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTestModuleName(strName);
    }

    @JsonIgnore
    public PSSysTestModuleDTO name(String strName) {
        this.setPSSysTestModuleName(strName);
        return this;
    }

    @JsonProperty(value="pssystestprjid")
    public void setPSSysTestPrjId(String pSSysTestPrjId) {
        this._set(DTOFIELD_PSSYSTESTPRJID, pSSysTestPrjId);
    }

    @JsonIgnore
    public String getPSSysTestPrjId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTPRJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestPrjIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTPRJID);
    }

    @JsonIgnore
    public void resetPSSysTestPrjId() {
        this._reset(DTOFIELD_PSSYSTESTPRJID);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjid(String pSSysTestPrjId) {
        this.setPSSysTestPrjId(pSSysTestPrjId);
        return this;
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjid(PSSysTestPrjDTO pSSysTestPrj) {
        if (pSSysTestPrj == null) {
            this.setPSSysAppId(null);
            this.setPSSysServiceAPIId(null);
            this.setPSSysTestPrjId(null);
            this.setPSSysTestPrjName(null);
        } else {
            this.setPSSysAppId(pSSysTestPrj.getPSSysAppId());
            this.setPSSysServiceAPIId(pSSysTestPrj.getPSSysServiceAPIId());
            this.setPSSysTestPrjId(pSSysTestPrj.getPSSysTestPrjId());
            this.setPSSysTestPrjName(pSSysTestPrj.getPSSysTestPrjName());
        }
        return this;
    }

    @JsonProperty(value="pssystestprjname")
    public void setPSSysTestPrjName(String pSSysTestPrjName) {
        this._set(DTOFIELD_PSSYSTESTPRJNAME, pSSysTestPrjName);
    }

    @JsonIgnore
    public String getPSSysTestPrjName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTPRJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestPrjNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTPRJNAME);
    }

    @JsonIgnore
    public void resetPSSysTestPrjName() {
        this._reset(DTOFIELD_PSSYSTESTPRJNAME);
    }

    @JsonIgnore
    public PSSysTestModuleDTO pssystestprjname(String pSSysTestPrjName) {
        this.setPSSysTestPrjName(pSSysTestPrjName);
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
    public PSSysTestModuleDTO updatedate(Timestamp updateDate) {
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
    public PSSysTestModuleDTO updateman(String updateMan) {
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
    public PSSysTestModuleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTestModuleDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSSysTestModuleDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSSysTestModuleDTO usertag(String userTag) {
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
    public PSSysTestModuleDTO usertag2(String userTag2) {
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
    public PSSysTestModuleDTO usertag3(String userTag3) {
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
    public PSSysTestModuleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="utilparams")
    public void setUtilParams(String utilParams) {
        this._set(DTOFIELD_UTILPARAMS, utilParams);
    }

    @JsonIgnore
    public String getUtilParams() {
        Object objValue = this._get(DTOFIELD_UTILPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParamsDirty() {
        return this._contains(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public void resetUtilParams() {
        this._reset(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public PSSysTestModuleDTO utilparams(String utilParams) {
        this.setUtilParams(utilParams);
        return this;
    }

    @JsonProperty(value="utiltag")
    public void setUtilTag(String utilTag) {
        this._set(DTOFIELD_UTILTAG, utilTag);
    }

    @JsonIgnore
    public String getUtilTag() {
        Object objValue = this._get(DTOFIELD_UTILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTagDirty() {
        return this._contains(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public void resetUtilTag() {
        this._reset(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public PSSysTestModuleDTO utiltag(String utilTag) {
        this.setUtilTag(utilTag);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTestModuleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTestModuleId(strValue);
    }

    @JsonIgnore
    public PSSysTestModuleDTO id(String strValue) {
        this.setPSSysTestModuleId(strValue);
        return this;
    }
}
