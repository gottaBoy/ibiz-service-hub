package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSVTRVDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DEFVIEWTYPE = "DEFVIEWTYPE";
    protected static final String DTOFIELD_DEFVIEWTYPE = "defviewtype";
    public static final String FIELD_DYNADEFVIEWTYPE = "DYNADEFVIEWTYPE";
    protected static final String DTOFIELD_DYNADEFVIEWTYPE = "dynadefviewtype";
    public static final String FIELD_ENABLEDYNATOOL = "ENABLEDYNATOOL";
    protected static final String DTOFIELD_ENABLEDYNATOOL = "enabledynatool";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSVIEWTYPEID = "PSVIEWTYPEID";
    protected static final String DTOFIELD_PSVIEWTYPEID = "psviewtypeid";
    public static final String FIELD_PSVIEWTYPENAME = "PSVIEWTYPENAME";
    protected static final String DTOFIELD_PSVIEWTYPENAME = "psviewtypename";
    public static final String FIELD_PSVTRVID = "PSVTRVID";
    protected static final String DTOFIELD_PSVTRVID = "psvtrvid";
    public static final String FIELD_PSVTRVNAME = "PSVTRVNAME";
    protected static final String DTOFIELD_PSVTRVNAME = "psvtrvname";
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
    public PSVTRVDTO createdate(Timestamp createDate) {
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
    public PSVTRVDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSVTRVDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="defviewtype")
    public void setDEFViewType(String dEFViewType) {
        this._set(DTOFIELD_DEFVIEWTYPE, dEFViewType);
    }

    @JsonIgnore
    public String getDEFViewType() {
        Object objValue = this._get(DTOFIELD_DEFVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEFViewTypeDirty() {
        return this._contains(DTOFIELD_DEFVIEWTYPE);
    }

    @JsonIgnore
    public void resetDEFViewType() {
        this._reset(DTOFIELD_DEFVIEWTYPE);
    }

    @JsonIgnore
    public PSVTRVDTO defviewtype(String dEFViewType) {
        this.setDEFViewType(dEFViewType);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO defviewtype(PSModelEnums.PredefinedViewType dEFViewType) {
        if (dEFViewType == null) {
            this.setDEFViewType(null);
        } else {
            this.setDEFViewType(dEFViewType.value);
        }
        return this;
    }

    @JsonProperty(value="dynadefviewtype")
    public void setDynaDEFViewType(String dynaDEFViewType) {
        this._set(DTOFIELD_DYNADEFVIEWTYPE, dynaDEFViewType);
    }

    @JsonIgnore
    public String getDynaDEFViewType() {
        Object objValue = this._get(DTOFIELD_DYNADEFVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaDEFViewTypeDirty() {
        return this._contains(DTOFIELD_DYNADEFVIEWTYPE);
    }

    @JsonIgnore
    public void resetDynaDEFViewType() {
        this._reset(DTOFIELD_DYNADEFVIEWTYPE);
    }

    @JsonIgnore
    public PSVTRVDTO dynadefviewtype(String dynaDEFViewType) {
        this.setDynaDEFViewType(dynaDEFViewType);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO dynadefviewtype(PSModelEnums.PredefinedViewType dynaDEFViewType) {
        if (dynaDEFViewType == null) {
            this.setDynaDEFViewType(null);
        } else {
            this.setDynaDEFViewType(dynaDEFViewType.value);
        }
        return this;
    }

    @JsonProperty(value="enabledynatool")
    public void setEnableDynaTool(Integer enableDynaTool) {
        this._set(DTOFIELD_ENABLEDYNATOOL, enableDynaTool);
    }

    @JsonIgnore
    public Integer getEnableDynaTool() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNATOOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaToolDirty() {
        return this._contains(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public void resetEnableDynaTool() {
        this._reset(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public PSVTRVDTO enabledynatool(Integer enableDynaTool) {
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO enabledynatool(Boolean enableDynaTool) {
        if (enableDynaTool == null) {
            this.setEnableDynaTool(null);
        } else {
            this.setEnableDynaTool(enableDynaTool != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSVTRVDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSVTRVDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psviewtypeid")
    public void setPSViewTypeId(String pSViewTypeId) {
        this._set(DTOFIELD_PSVIEWTYPEID, pSViewTypeId);
    }

    @JsonIgnore
    public String getPSViewTypeId() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeIdDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public void resetPSViewTypeId() {
        this._reset(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public PSVTRVDTO psviewtypeid(String pSViewTypeId) {
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO psviewtypeid(PSViewTypeDTO pSViewType) {
        if (pSViewType == null) {
            this.setPSViewTypeId(null);
            this.setPSViewTypeName(null);
        } else {
            this.setPSViewTypeId(pSViewType.getPSViewTypeId());
            this.setPSViewTypeName(pSViewType.getPSViewTypeName());
        }
        return this;
    }

    @JsonProperty(value="psviewtypename")
    public void setPSViewTypeName(String pSViewTypeName) {
        this._set(DTOFIELD_PSVIEWTYPENAME, pSViewTypeName);
    }

    @JsonIgnore
    public String getPSViewTypeName() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeNameDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public void resetPSViewTypeName() {
        this._reset(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public PSVTRVDTO psviewtypename(String pSViewTypeName) {
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    @JsonProperty(value="psvtrvid")
    public void setPSVTRVId(String pSVTRVId) {
        this._set(DTOFIELD_PSVTRVID, pSVTRVId);
    }

    @JsonIgnore
    public String getPSVTRVId() {
        Object objValue = this._get(DTOFIELD_PSVTRVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTRVIdDirty() {
        return this._contains(DTOFIELD_PSVTRVID);
    }

    @JsonIgnore
    public void resetPSVTRVId() {
        this._reset(DTOFIELD_PSVTRVID);
    }

    @JsonIgnore
    public PSVTRVDTO psvtrvid(String pSVTRVId) {
        this.setPSVTRVId(pSVTRVId);
        return this;
    }

    @JsonProperty(value="psvtrvname")
    public void setPSVTRVName(String pSVTRVName) {
        this._set(DTOFIELD_PSVTRVNAME, pSVTRVName);
    }

    @JsonIgnore
    public String getPSVTRVName() {
        Object objValue = this._get(DTOFIELD_PSVTRVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTRVNameDirty() {
        return this._contains(DTOFIELD_PSVTRVNAME);
    }

    @JsonIgnore
    public void resetPSVTRVName() {
        this._reset(DTOFIELD_PSVTRVNAME);
    }

    @JsonIgnore
    public PSVTRVDTO psvtrvname(String pSVTRVName) {
        this.setPSVTRVName(pSVTRVName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSVTRVName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSVTRVName(strName);
    }

    @JsonIgnore
    public PSVTRVDTO name(String strName) {
        this.setPSVTRVName(strName);
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
    public PSVTRVDTO updatedate(Timestamp updateDate) {
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
    public PSVTRVDTO updateman(String updateMan) {
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
    public PSVTRVDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSVTRVDTO usertag(String userTag) {
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
    public PSVTRVDTO usertag2(String userTag2) {
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
    public PSVTRVDTO usertag3(String userTag3) {
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
    public PSVTRVDTO usertag4(String userTag4) {
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
    public PSVTRVDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSVTRVDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSVTRVId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSVTRVId(strValue);
    }

    @JsonIgnore
    public PSVTRVDTO id(String strValue) {
        this.setPSVTRVId(strValue);
        return this;
    }
}
