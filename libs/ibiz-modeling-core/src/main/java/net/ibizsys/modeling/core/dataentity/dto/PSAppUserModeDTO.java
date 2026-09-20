package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppUserModeDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSAPPUSERMODEID = "PSAPPUSERMODEID";
    protected static final String DTOFIELD_PSAPPUSERMODEID = "psappusermodeid";
    public static final String FIELD_PSAPPUSERMODENAME = "PSAPPUSERMODENAME";
    protected static final String DTOFIELD_PSAPPUSERMODENAME = "psappusermodename";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSUSERMODEID = "PSSYSUSERMODEID";
    protected static final String DTOFIELD_PSSYSUSERMODEID = "pssysusermodeid";
    public static final String FIELD_PSSYSUSERMODENAME = "PSSYSUSERMODENAME";
    protected static final String DTOFIELD_PSSYSUSERMODENAME = "pssysusermodename";
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
    public PSAppUserModeDTO codename(String codeName) {
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
    public PSAppUserModeDTO createdate(Timestamp createDate) {
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
    public PSAppUserModeDTO createman(String createMan) {
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
    public PSAppUserModeDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
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
    public PSAppUserModeDTO logicname(String logicName) {
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
    public PSAppUserModeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    @JsonProperty(value="psappusermodeid")
    public void setPSAppUserModeId(String pSAppUserModeId) {
        this._set(DTOFIELD_PSAPPUSERMODEID, pSAppUserModeId);
    }

    @JsonIgnore
    public String getPSAppUserModeId() {
        Object objValue = this._get(DTOFIELD_PSAPPUSERMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUserModeIdDirty() {
        return this._contains(DTOFIELD_PSAPPUSERMODEID);
    }

    @JsonIgnore
    public void resetPSAppUserModeId() {
        this._reset(DTOFIELD_PSAPPUSERMODEID);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappusermodeid(String pSAppUserModeId) {
        this.setPSAppUserModeId(pSAppUserModeId);
        return this;
    }

    @JsonProperty(value="psappusermodename")
    public void setPSAppUserModeName(String pSAppUserModeName) {
        this._set(DTOFIELD_PSAPPUSERMODENAME, pSAppUserModeName);
    }

    @JsonIgnore
    public String getPSAppUserModeName() {
        Object objValue = this._get(DTOFIELD_PSAPPUSERMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUserModeNameDirty() {
        return this._contains(DTOFIELD_PSAPPUSERMODENAME);
    }

    @JsonIgnore
    public void resetPSAppUserModeName() {
        this._reset(DTOFIELD_PSAPPUSERMODENAME);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappusermodename(String pSAppUserModeName) {
        this.setPSAppUserModeName(pSAppUserModeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppUserModeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppUserModeName(strName);
    }

    @JsonIgnore
    public PSAppUserModeDTO name(String strName) {
        this.setPSAppUserModeName(strName);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppUserModeDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
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
    public PSAppUserModeDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSAppUserModeDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysusermodeid")
    public void setPSSysUserModeId(String pSSysUserModeId) {
        this._set(DTOFIELD_PSSYSUSERMODEID, pSSysUserModeId);
    }

    @JsonIgnore
    public String getPSSysUserModeId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserModeIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERMODEID);
    }

    @JsonIgnore
    public void resetPSSysUserModeId() {
        this._reset(DTOFIELD_PSSYSUSERMODEID);
    }

    @JsonIgnore
    public PSAppUserModeDTO pssysusermodeid(String pSSysUserModeId) {
        this.setPSSysUserModeId(pSSysUserModeId);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO pssysusermodeid(PSSysUserModeDTO pSSysUserMode) {
        if (pSSysUserMode == null) {
            this.setPSSysUserModeId(null);
            this.setPSSysUserModeName(null);
        } else {
            this.setPSSysUserModeId(pSSysUserMode.getPSSysUserModeId());
            this.setPSSysUserModeName(pSSysUserMode.getPSSysUserModeName());
        }
        return this;
    }

    @JsonProperty(value="pssysusermodename")
    public void setPSSysUserModeName(String pSSysUserModeName) {
        this._set(DTOFIELD_PSSYSUSERMODENAME, pSSysUserModeName);
    }

    @JsonIgnore
    public String getPSSysUserModeName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserModeNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERMODENAME);
    }

    @JsonIgnore
    public void resetPSSysUserModeName() {
        this._reset(DTOFIELD_PSSYSUSERMODENAME);
    }

    @JsonIgnore
    public PSAppUserModeDTO pssysusermodename(String pSSysUserModeName) {
        this.setPSSysUserModeName(pSSysUserModeName);
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
    public PSAppUserModeDTO updatedate(Timestamp updateDate) {
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
    public PSAppUserModeDTO updateman(String updateMan) {
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
    public PSAppUserModeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppUserModeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSAppUserModeDTO usertag(String userTag) {
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
    public PSAppUserModeDTO usertag2(String userTag2) {
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
    public PSAppUserModeDTO usertag3(String userTag3) {
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
    public PSAppUserModeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppUserModeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppUserModeId(strValue);
    }

    @JsonIgnore
    public PSAppUserModeDTO id(String strValue) {
        this.setPSAppUserModeId(strValue);
        return this;
    }
}
