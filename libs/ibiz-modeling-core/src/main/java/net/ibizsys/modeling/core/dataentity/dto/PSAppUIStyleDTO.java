package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppUIStyleDTO
extends PSModelDTOBase {
    public static final String FIELD_ACMINCHARS = "ACMINCHARS";
    protected static final String DTOFIELD_ACMINCHARS = "acminchars";
    public static final String FIELD_APPFOLDER = "APPFOLDER";
    protected static final String DTOFIELD_APPFOLDER = "appfolder";
    public static final String FIELD_APPPKGNAME = "APPPKGNAME";
    protected static final String DTOFIELD_APPPKGNAME = "apppkgname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MAINMENUSIDE = "MAINMENUSIDE";
    protected static final String DTOFIELD_MAINMENUSIDE = "mainmenuside";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PFSTYLEPARAM = "PFSTYLEPARAM";
    protected static final String DTOFIELD_PFSTYLEPARAM = "pfstyleparam";
    public static final String FIELD_PSAPPUISTYLEID = "PSAPPUISTYLEID";
    protected static final String DTOFIELD_PSAPPUISTYLEID = "psappuistyleid";
    public static final String FIELD_PSAPPUISTYLENAME = "PSAPPUISTYLENAME";
    protected static final String DTOFIELD_PSAPPUISTYLENAME = "psappuistylename";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFSTYLEID = "PSPFSTYLEID";
    protected static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    public static final String FIELD_PSPFSTYLENAME = "PSPFSTYLENAME";
    protected static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_ROOTPSAPPVIEWID = "ROOTPSAPPVIEWID";
    protected static final String DTOFIELD_ROOTPSAPPVIEWID = "rootpsappviewid";
    public static final String FIELD_ROOTPSAPPVIEWNAME = "ROOTPSAPPVIEWNAME";
    protected static final String DTOFIELD_ROOTPSAPPVIEWNAME = "rootpsappviewname";
    public static final String FIELD_UISTYLE = "UISTYLE";
    protected static final String DTOFIELD_UISTYLE = "uistyle";
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

    @JsonProperty(value="acminchars")
    public void setACMinChars(Integer aCMinChars) {
        this._set(DTOFIELD_ACMINCHARS, aCMinChars);
    }

    @JsonIgnore
    public Integer getACMinChars() {
        Object objValue = this._get(DTOFIELD_ACMINCHARS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isACMinCharsDirty() {
        return this._contains(DTOFIELD_ACMINCHARS);
    }

    @JsonIgnore
    public void resetACMinChars() {
        this._reset(DTOFIELD_ACMINCHARS);
    }

    @JsonIgnore
    public PSAppUIStyleDTO acminchars(Integer aCMinChars) {
        this.setACMinChars(aCMinChars);
        return this;
    }

    @JsonProperty(value="appfolder")
    public void setAppFolder(String appFolder) {
        this._set(DTOFIELD_APPFOLDER, appFolder);
    }

    @JsonIgnore
    public String getAppFolder() {
        Object objValue = this._get(DTOFIELD_APPFOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppFolderDirty() {
        return this._contains(DTOFIELD_APPFOLDER);
    }

    @JsonIgnore
    public void resetAppFolder() {
        this._reset(DTOFIELD_APPFOLDER);
    }

    @JsonIgnore
    public PSAppUIStyleDTO appfolder(String appFolder) {
        this.setAppFolder(appFolder);
        return this;
    }

    @JsonProperty(value="apppkgname")
    public void setAppPKGName(String appPKGName) {
        this._set(DTOFIELD_APPPKGNAME, appPKGName);
    }

    @JsonIgnore
    public String getAppPKGName() {
        Object objValue = this._get(DTOFIELD_APPPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppPKGNameDirty() {
        return this._contains(DTOFIELD_APPPKGNAME);
    }

    @JsonIgnore
    public void resetAppPKGName() {
        this._reset(DTOFIELD_APPPKGNAME);
    }

    @JsonIgnore
    public PSAppUIStyleDTO apppkgname(String appPKGName) {
        this.setAppPKGName(appPKGName);
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
    public PSAppUIStyleDTO createdate(Timestamp createDate) {
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
    public PSAppUIStyleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="mainmenuside")
    public void setMainMenuSide(String mainMenuSide) {
        this._set(DTOFIELD_MAINMENUSIDE, mainMenuSide);
    }

    @JsonIgnore
    public String getMainMenuSide() {
        Object objValue = this._get(DTOFIELD_MAINMENUSIDE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainMenuSideDirty() {
        return this._contains(DTOFIELD_MAINMENUSIDE);
    }

    @JsonIgnore
    public void resetMainMenuSide() {
        this._reset(DTOFIELD_MAINMENUSIDE);
    }

    @JsonIgnore
    public PSAppUIStyleDTO mainmenuside(String mainMenuSide) {
        this.setMainMenuSide(mainMenuSide);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO mainmenuside(PSModelEnums.AppIndexViewMenuAlign mainMenuSide) {
        if (mainMenuSide == null) {
            this.setMainMenuSide(null);
        } else {
            this.setMainMenuSide(mainMenuSide.value);
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
    public PSAppUIStyleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pfstyleparam")
    public void setPFStyleParam(String pFStyleParam) {
        this._set(DTOFIELD_PFSTYLEPARAM, pFStyleParam);
    }

    @JsonIgnore
    public String getPFStyleParam() {
        Object objValue = this._get(DTOFIELD_PFSTYLEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPFStyleParamDirty() {
        return this._contains(DTOFIELD_PFSTYLEPARAM);
    }

    @JsonIgnore
    public void resetPFStyleParam() {
        this._reset(DTOFIELD_PFSTYLEPARAM);
    }

    @JsonIgnore
    public PSAppUIStyleDTO pfstyleparam(String pFStyleParam) {
        this.setPFStyleParam(pFStyleParam);
        return this;
    }

    @JsonProperty(value="psappuistyleid")
    public void setPSAppUIStyleId(String pSAppUIStyleId) {
        this._set(DTOFIELD_PSAPPUISTYLEID, pSAppUIStyleId);
    }

    @JsonIgnore
    public String getPSAppUIStyleId() {
        Object objValue = this._get(DTOFIELD_PSAPPUISTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUIStyleIdDirty() {
        return this._contains(DTOFIELD_PSAPPUISTYLEID);
    }

    @JsonIgnore
    public void resetPSAppUIStyleId() {
        this._reset(DTOFIELD_PSAPPUISTYLEID);
    }

    @JsonIgnore
    public PSAppUIStyleDTO psappuistyleid(String pSAppUIStyleId) {
        this.setPSAppUIStyleId(pSAppUIStyleId);
        return this;
    }

    @JsonProperty(value="psappuistylename")
    public void setPSAppUIStyleName(String pSAppUIStyleName) {
        this._set(DTOFIELD_PSAPPUISTYLENAME, pSAppUIStyleName);
    }

    @JsonIgnore
    public String getPSAppUIStyleName() {
        Object objValue = this._get(DTOFIELD_PSAPPUISTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUIStyleNameDirty() {
        return this._contains(DTOFIELD_PSAPPUISTYLENAME);
    }

    @JsonIgnore
    public void resetPSAppUIStyleName() {
        this._reset(DTOFIELD_PSAPPUISTYLENAME);
    }

    @JsonIgnore
    public PSAppUIStyleDTO psappuistylename(String pSAppUIStyleName) {
        this.setPSAppUIStyleName(pSAppUIStyleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppUIStyleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppUIStyleName(strName);
    }

    @JsonIgnore
    public PSAppUIStyleDTO name(String strName) {
        this.setPSAppUIStyleName(strName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pspfstyleid")
    public void setPSPFStyleId(String pSPFStyleId) {
        this._set(DTOFIELD_PSPFSTYLEID, pSPFStyleId);
    }

    @JsonIgnore
    public String getPSPFStyleId() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleIdDirty() {
        return this._contains(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public void resetPSPFStyleId() {
        this._reset(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfstyleid(String pSPFStyleId) {
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfstyleid(PSPFStyleDTO pSPFStyle) {
        if (pSPFStyle == null) {
            this.setPSPFStyleId(null);
            this.setPSPFStyleName(null);
        } else {
            this.setPSPFStyleId(pSPFStyle.getPSPFStyleId());
            this.setPSPFStyleName(pSPFStyle.getPSPFStyleName());
        }
        return this;
    }

    @JsonProperty(value="pspfstylename")
    public void setPSPFStyleName(String pSPFStyleName) {
        this._set(DTOFIELD_PSPFSTYLENAME, pSPFStyleName);
    }

    @JsonIgnore
    public String getPSPFStyleName() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleNameDirty() {
        return this._contains(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSPFStyleName() {
        this._reset(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public PSAppUIStyleDTO pspfstylename(String pSPFStyleName) {
        this.setPSPFStyleName(pSPFStyleName);
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
    public PSAppUIStyleDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSAppUIStyleDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="rootpsappviewid")
    public void setRootPSAppViewId(String rootPSAppViewId) {
        this._set(DTOFIELD_ROOTPSAPPVIEWID, rootPSAppViewId);
    }

    @JsonIgnore
    public String getRootPSAppViewId() {
        Object objValue = this._get(DTOFIELD_ROOTPSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRootPSAppViewIdDirty() {
        return this._contains(DTOFIELD_ROOTPSAPPVIEWID);
    }

    @JsonIgnore
    public void resetRootPSAppViewId() {
        this._reset(DTOFIELD_ROOTPSAPPVIEWID);
    }

    @JsonIgnore
    public PSAppUIStyleDTO rootpsappviewid(String rootPSAppViewId) {
        this.setRootPSAppViewId(rootPSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO rootpsappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setRootPSAppViewId(null);
            this.setRootPSAppViewName(null);
        } else {
            this.setRootPSAppViewId(pSAppView.getPSAppViewId());
            this.setRootPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="rootpsappviewname")
    public void setRootPSAppViewName(String rootPSAppViewName) {
        this._set(DTOFIELD_ROOTPSAPPVIEWNAME, rootPSAppViewName);
    }

    @JsonIgnore
    public String getRootPSAppViewName() {
        Object objValue = this._get(DTOFIELD_ROOTPSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRootPSAppViewNameDirty() {
        return this._contains(DTOFIELD_ROOTPSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetRootPSAppViewName() {
        this._reset(DTOFIELD_ROOTPSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppUIStyleDTO rootpsappviewname(String rootPSAppViewName) {
        this.setRootPSAppViewName(rootPSAppViewName);
        return this;
    }

    @JsonProperty(value="uistyle")
    public void setUIStyle(String uIStyle) {
        this._set(DTOFIELD_UISTYLE, uIStyle);
    }

    @JsonIgnore
    public String getUIStyle() {
        Object objValue = this._get(DTOFIELD_UISTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIStyleDirty() {
        return this._contains(DTOFIELD_UISTYLE);
    }

    @JsonIgnore
    public void resetUIStyle() {
        this._reset(DTOFIELD_UISTYLE);
    }

    @JsonIgnore
    public PSAppUIStyleDTO uistyle(String uIStyle) {
        this.setUIStyle(uIStyle);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO uistyle(PSModelEnums.AppUIStyle uIStyle) {
        if (uIStyle == null) {
            this.setUIStyle(null);
        } else {
            this.setUIStyle(uIStyle.value);
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
    public PSAppUIStyleDTO updatedate(Timestamp updateDate) {
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
    public PSAppUIStyleDTO updateman(String updateMan) {
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
    public PSAppUIStyleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppUIStyleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSAppUIStyleDTO usertag(String userTag) {
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
    public PSAppUIStyleDTO usertag2(String userTag2) {
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
    public PSAppUIStyleDTO usertag3(String userTag3) {
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
    public PSAppUIStyleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppUIStyleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppUIStyleId(strValue);
    }

    @JsonIgnore
    public PSAppUIStyleDTO id(String strValue) {
        this.setPSAppUIStyleId(strValue);
        return this;
    }
}
