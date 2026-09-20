package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWXMenuDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSWXACCOUNTID = "PSWXACCOUNTID";
    protected static final String DTOFIELD_PSWXACCOUNTID = "pswxaccountid";
    public static final String FIELD_PSWXACCOUNTNAME = "PSWXACCOUNTNAME";
    protected static final String DTOFIELD_PSWXACCOUNTNAME = "pswxaccountname";
    public static final String FIELD_PSWXENTAPPID = "PSWXENTAPPID";
    protected static final String DTOFIELD_PSWXENTAPPID = "pswxentappid";
    public static final String FIELD_PSWXENTAPPNAME = "PSWXENTAPPNAME";
    protected static final String DTOFIELD_PSWXENTAPPNAME = "pswxentappname";
    public static final String FIELD_PSWXMENUID = "PSWXMENUID";
    protected static final String DTOFIELD_PSWXMENUID = "pswxmenuid";
    public static final String FIELD_PSWXMENUNAME = "PSWXMENUNAME";
    protected static final String DTOFIELD_PSWXMENUNAME = "pswxmenuname";
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
    public static final String DTOFIELD_PSWXMENUITEMS = "pswxmenuitems";

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
    public PSWXMenuDTO codename(String codeName) {
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
    public PSWXMenuDTO createdate(Timestamp createDate) {
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
    public PSWXMenuDTO createman(String createMan) {
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
    public PSWXMenuDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSWXMenuDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
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
    public PSWXMenuDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pswxaccountid")
    public void setPSWXAccountId(String pSWXAccountId) {
        this._set(DTOFIELD_PSWXACCOUNTID, pSWXAccountId);
    }

    @JsonIgnore
    public String getPSWXAccountId() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountIdDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public void resetPSWXAccountId() {
        this._reset(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxaccountid(String pSWXAccountId) {
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    @JsonIgnore
    public PSWXMenuDTO pswxaccountid(PSWXAccountDTO pSWXAccount) {
        if (pSWXAccount == null) {
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        } else {
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    @JsonProperty(value="pswxaccountname")
    public void setPSWXAccountName(String pSWXAccountName) {
        this._set(DTOFIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }

    @JsonIgnore
    public String getPSWXAccountName() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountNameDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public void resetPSWXAccountName() {
        this._reset(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxaccountname(String pSWXAccountName) {
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    @JsonProperty(value="pswxentappid")
    public void setPSWXEntAppId(String pSWXEntAppId) {
        this._set(DTOFIELD_PSWXENTAPPID, pSWXEntAppId);
    }

    @JsonIgnore
    public String getPSWXEntAppId() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppIdDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public void resetPSWXEntAppId() {
        this._reset(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxentappid(String pSWXEntAppId) {
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    @JsonIgnore
    public PSWXMenuDTO pswxentappid(PSWXEntAppDTO pSWXEntApp) {
        if (pSWXEntApp == null) {
            this.setPSWXEntAppId(null);
            this.setPSWXEntAppName(null);
        } else {
            this.setPSWXEntAppId(pSWXEntApp.getPSWXEntAppId());
            this.setPSWXEntAppName(pSWXEntApp.getPSWXEntAppName());
        }
        return this;
    }

    @JsonProperty(value="pswxentappname")
    public void setPSWXEntAppName(String pSWXEntAppName) {
        this._set(DTOFIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }

    @JsonIgnore
    public String getPSWXEntAppName() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppNameDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public void resetPSWXEntAppName() {
        this._reset(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxentappname(String pSWXEntAppName) {
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    @JsonProperty(value="pswxmenuid")
    public void setPSWXMenuId(String pSWXMenuId) {
        this._set(DTOFIELD_PSWXMENUID, pSWXMenuId);
    }

    @JsonIgnore
    public String getPSWXMenuId() {
        Object objValue = this._get(DTOFIELD_PSWXMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuIdDirty() {
        return this._contains(DTOFIELD_PSWXMENUID);
    }

    @JsonIgnore
    public void resetPSWXMenuId() {
        this._reset(DTOFIELD_PSWXMENUID);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxmenuid(String pSWXMenuId) {
        this.setPSWXMenuId(pSWXMenuId);
        return this;
    }

    @JsonProperty(value="pswxmenuname")
    public void setPSWXMenuName(String pSWXMenuName) {
        this._set(DTOFIELD_PSWXMENUNAME, pSWXMenuName);
    }

    @JsonIgnore
    public String getPSWXMenuName() {
        Object objValue = this._get(DTOFIELD_PSWXMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuNameDirty() {
        return this._contains(DTOFIELD_PSWXMENUNAME);
    }

    @JsonIgnore
    public void resetPSWXMenuName() {
        this._reset(DTOFIELD_PSWXMENUNAME);
    }

    @JsonIgnore
    public PSWXMenuDTO pswxmenuname(String pSWXMenuName) {
        this.setPSWXMenuName(pSWXMenuName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWXMenuName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWXMenuName(strName);
    }

    @JsonIgnore
    public PSWXMenuDTO name(String strName) {
        this.setPSWXMenuName(strName);
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
    public PSWXMenuDTO updatedate(Timestamp updateDate) {
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
    public PSWXMenuDTO updateman(String updateMan) {
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
    public PSWXMenuDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWXMenuDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWXMenuDTO usertag(String userTag) {
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
    public PSWXMenuDTO usertag2(String userTag2) {
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
    public PSWXMenuDTO usertag3(String userTag3) {
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
    public PSWXMenuDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWXMenuId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWXMenuId(strValue);
    }

    @JsonIgnore
    public PSWXMenuDTO id(String strValue) {
        this.setPSWXMenuId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWXMenuItemDTO> getPSWXMenuItems() {
        Object list = this._get(DTOFIELD_PSWXMENUITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswxmenuitems")
    public void setPSWXMenuItems(List<PSWXMenuItemDTO> pswxmenuitems) {
        this._set(DTOFIELD_PSWXMENUITEMS, pswxmenuitems);
    }

    @JsonIgnore
    public List<PSWXMenuItemDTO> getPSWXMenuItemsIf() {
        Object list = this._get(DTOFIELD_PSWXMENUITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWXMENUITEMS, list);
        }
        return (List) list;
    }
}
