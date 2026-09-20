package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFProcParamDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDSTDEFNAME = "CUSTOMDSTDEFNAME";
    protected static final String DTOFIELD_CUSTOMDSTDEFNAME = "customdstdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFPROCPARAMID = "PSWFPROCPARAMID";
    protected static final String DTOFIELD_PSWFPROCPARAMID = "pswfprocparamid";
    public static final String FIELD_PSWFPROCPARAMNAME = "PSWFPROCPARAMNAME";
    protected static final String DTOFIELD_PSWFPROCPARAMNAME = "pswfprocparamname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_SRCVALUE = "SRCVALUE";
    protected static final String DTOFIELD_SRCVALUE = "srcvalue";
    public static final String FIELD_SRCVALUETYPE = "SRCVALUETYPE";
    protected static final String DTOFIELD_SRCVALUETYPE = "srcvaluetype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

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
    public PSWFProcParamDTO createdate(Timestamp createDate) {
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
    public PSWFProcParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdstdefname")
    public void setCustomDstDEFName(String customDstDEFName) {
        this._set(DTOFIELD_CUSTOMDSTDEFNAME, customDstDEFName);
    }

    @JsonIgnore
    public String getCustomDstDEFName() {
        Object objValue = this._get(DTOFIELD_CUSTOMDSTDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDstDEFNameDirty() {
        return this._contains(DTOFIELD_CUSTOMDSTDEFNAME);
    }

    @JsonIgnore
    public void resetCustomDstDEFName() {
        this._reset(DTOFIELD_CUSTOMDSTDEFNAME);
    }

    @JsonIgnore
    public PSWFProcParamDTO customdstdefname(String customDstDEFName) {
        this.setCustomDstDEFName(customDstDEFName);
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
    public PSWFProcParamDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSWFProcParamDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFProcParamDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
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
    public PSWFProcParamDTO psdefname(String pSDEFName) {
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
    public PSWFProcParamDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfprocessid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setPSDEId(null);
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
            this.setPSWFVersionId(null);
        } else {
            this.setPSDEId(pSWFProcess.getPSDEId());
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
            this.setPSWFVersionId(pSWFProcess.getPSWFVersionId());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonProperty(value="pswfprocparamid")
    public void setPSWFProcParamId(String pSWFProcParamId) {
        this._set(DTOFIELD_PSWFPROCPARAMID, pSWFProcParamId);
    }

    @JsonIgnore
    public String getPSWFProcParamId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcParamIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCPARAMID);
    }

    @JsonIgnore
    public void resetPSWFProcParamId() {
        this._reset(DTOFIELD_PSWFPROCPARAMID);
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfprocparamid(String pSWFProcParamId) {
        this.setPSWFProcParamId(pSWFProcParamId);
        return this;
    }

    @JsonProperty(value="pswfprocparamname")
    public void setPSWFProcParamName(String pSWFProcParamName) {
        this._set(DTOFIELD_PSWFPROCPARAMNAME, pSWFProcParamName);
    }

    @JsonIgnore
    public String getPSWFProcParamName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcParamNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCPARAMNAME);
    }

    @JsonIgnore
    public void resetPSWFProcParamName() {
        this._reset(DTOFIELD_PSWFPROCPARAMNAME);
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfprocparamname(String pSWFProcParamName) {
        this.setPSWFProcParamName(pSWFProcParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFProcParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFProcParamName(strName);
    }

    @JsonIgnore
    public PSWFProcParamDTO name(String strName) {
        this.setPSWFProcParamName(strName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFProcParamDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonProperty(value="srcvalue")
    public void setSrcValue(String srcValue) {
        this._set(DTOFIELD_SRCVALUE, srcValue);
    }

    @JsonIgnore
    public String getSrcValue() {
        Object objValue = this._get(DTOFIELD_SRCVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueDirty() {
        return this._contains(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public void resetSrcValue() {
        this._reset(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public PSWFProcParamDTO srcvalue(String srcValue) {
        this.setSrcValue(srcValue);
        return this;
    }

    @JsonProperty(value="srcvaluetype")
    public void setSrcValueType(String srcValueType) {
        this._set(DTOFIELD_SRCVALUETYPE, srcValueType);
    }

    @JsonIgnore
    public String getSrcValueType() {
        Object objValue = this._get(DTOFIELD_SRCVALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueTypeDirty() {
        return this._contains(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public void resetSrcValueType() {
        this._reset(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public PSWFProcParamDTO srcvaluetype(String srcValueType) {
        this.setSrcValueType(srcValueType);
        return this;
    }

    @JsonIgnore
    public PSWFProcParamDTO srcvaluetype(PSModelEnums.WFProcParamValueType srcValueType) {
        if (srcValueType == null) {
            this.setSrcValueType(null);
        } else {
            this.setSrcValueType(srcValueType.value);
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
    public PSWFProcParamDTO updatedate(Timestamp updateDate) {
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
    public PSWFProcParamDTO updateman(String updateMan) {
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
    public PSWFProcParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFProcParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSWFProcParamDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSWFProcParamDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSWFProcParamDTO usertag(String userTag) {
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
    public PSWFProcParamDTO usertag2(String userTag2) {
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
    public PSWFProcParamDTO usertag3(String userTag3) {
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
    public PSWFProcParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFProcParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFProcParamId(strValue);
    }

    @JsonIgnore
    public PSWFProcParamDTO id(String strValue) {
        this.setPSWFProcParamId(strValue);
        return this;
    }
}
