package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppUtilPageDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PAGEURL = "PAGEURL";
    protected static final String DTOFIELD_PAGEURL = "pageurl";
    public static final String FIELD_PSAPPUTILPAGEID = "PSAPPUTILPAGEID";
    protected static final String DTOFIELD_PSAPPUTILPAGEID = "psapputilpageid";
    public static final String FIELD_PSAPPUTILPAGENAME = "PSAPPUTILPAGENAME";
    protected static final String DTOFIELD_PSAPPUTILPAGENAME = "psapputilpagename";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_TARGETTYPE = "TARGETTYPE";
    protected static final String DTOFIELD_TARGETTYPE = "targettype";
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
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_UTILTAG = "UTILTAG";
    protected static final String DTOFIELD_UTILTAG = "utiltag";
    public static final String FIELD_UTILTYPE = "UTILTYPE";
    protected static final String DTOFIELD_UTILTYPE = "utiltype";

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
    public PSAppUtilPageDTO codename(String codeName) {
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
    public PSAppUtilPageDTO createdate(Timestamp createDate) {
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
    public PSAppUtilPageDTO createman(String createMan) {
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
    public PSAppUtilPageDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pageurl")
    public void setPageUrl(String pageUrl) {
        this._set(DTOFIELD_PAGEURL, pageUrl);
    }

    @JsonIgnore
    public String getPageUrl() {
        Object objValue = this._get(DTOFIELD_PAGEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPageUrlDirty() {
        return this._contains(DTOFIELD_PAGEURL);
    }

    @JsonIgnore
    public void resetPageUrl() {
        this._reset(DTOFIELD_PAGEURL);
    }

    @JsonIgnore
    public PSAppUtilPageDTO pageurl(String pageUrl) {
        this.setPageUrl(pageUrl);
        return this;
    }

    @JsonProperty(value="psapputilpageid")
    public void setPSAppUtilPageId(String pSAppUtilPageId) {
        this._set(DTOFIELD_PSAPPUTILPAGEID, pSAppUtilPageId);
    }

    @JsonIgnore
    public String getPSAppUtilPageId() {
        Object objValue = this._get(DTOFIELD_PSAPPUTILPAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUtilPageIdDirty() {
        return this._contains(DTOFIELD_PSAPPUTILPAGEID);
    }

    @JsonIgnore
    public void resetPSAppUtilPageId() {
        this._reset(DTOFIELD_PSAPPUTILPAGEID);
    }

    @JsonIgnore
    public PSAppUtilPageDTO psapputilpageid(String pSAppUtilPageId) {
        this.setPSAppUtilPageId(pSAppUtilPageId);
        return this;
    }

    @JsonProperty(value="psapputilpagename")
    public void setPSAppUtilPageName(String pSAppUtilPageName) {
        this._set(DTOFIELD_PSAPPUTILPAGENAME, pSAppUtilPageName);
    }

    @JsonIgnore
    public String getPSAppUtilPageName() {
        Object objValue = this._get(DTOFIELD_PSAPPUTILPAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUtilPageNameDirty() {
        return this._contains(DTOFIELD_PSAPPUTILPAGENAME);
    }

    @JsonIgnore
    public void resetPSAppUtilPageName() {
        this._reset(DTOFIELD_PSAPPUTILPAGENAME);
    }

    @JsonIgnore
    public PSAppUtilPageDTO psapputilpagename(String pSAppUtilPageName) {
        this.setPSAppUtilPageName(pSAppUtilPageName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppUtilPageName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppUtilPageName(strName);
    }

    @JsonIgnore
    public PSAppUtilPageDTO name(String strName) {
        this.setPSAppUtilPageName(strName);
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
    public PSAppUtilPageDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO psappviewid(PSAppViewDTO pSAppView) {
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
    public PSAppUtilPageDTO psappviewname(String pSAppViewName) {
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
    public PSAppUtilPageDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSAppUtilPageDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSAppUtilPageDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSAppUtilPageDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="targettype")
    public void setTargetType(String targetType) {
        this._set(DTOFIELD_TARGETTYPE, targetType);
    }

    @JsonIgnore
    public String getTargetType() {
        Object objValue = this._get(DTOFIELD_TARGETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypeDirty() {
        return this._contains(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public void resetTargetType() {
        this._reset(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public PSAppUtilPageDTO targettype(String targetType) {
        this.setTargetType(targetType);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO targettype(PSModelEnums.AppUtilPageTargetType targetType) {
        if (targetType == null) {
            this.setTargetType(null);
        } else {
            this.setTargetType(targetType.value);
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
    public PSAppUtilPageDTO updatedate(Timestamp updateDate) {
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
    public PSAppUtilPageDTO updateman(String updateMan) {
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
    public PSAppUtilPageDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSAppUtilPageDTO usertag(String userTag) {
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
    public PSAppUtilPageDTO usertag2(String userTag2) {
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
    public PSAppUtilPageDTO usertag3(String userTag3) {
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
    public PSAppUtilPageDTO usertag4(String userTag4) {
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
    public PSAppUtilPageDTO utilparams(String utilParams) {
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
    public PSAppUtilPageDTO utiltag(String utilTag) {
        this.setUtilTag(utilTag);
        return this;
    }

    @JsonProperty(value="utiltype")
    public void setUtilType(String utilType) {
        this._set(DTOFIELD_UTILTYPE, utilType);
    }

    @JsonIgnore
    public String getUtilType() {
        Object objValue = this._get(DTOFIELD_UTILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTypeDirty() {
        return this._contains(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public void resetUtilType() {
        this._reset(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public PSAppUtilPageDTO utiltype(String utilType) {
        this.setUtilType(utilType);
        return this;
    }

    @JsonIgnore
    public PSAppUtilPageDTO utiltype(PSModelEnums.AppUtilPage utilType) {
        if (utilType == null) {
            this.setUtilType(null);
        } else {
            this.setUtilType(utilType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppUtilPageId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppUtilPageId(strValue);
    }

    @JsonIgnore
    public PSAppUtilPageDTO id(String strValue) {
        this.setPSAppUtilPageId(strValue);
        return this;
    }
}
