package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWXEntAppDTO
extends PSModelDTOBase {
    public static final String FIELD_APPTYPE = "APPTYPE";
    protected static final String DTOFIELD_APPTYPE = "apptype";
    public static final String FIELD_APPURL = "APPURL";
    protected static final String DTOFIELD_APPURL = "appurl";
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
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSWXACCOUNTID = "PSWXACCOUNTID";
    protected static final String DTOFIELD_PSWXACCOUNTID = "pswxaccountid";
    public static final String FIELD_PSWXACCOUNTNAME = "PSWXACCOUNTNAME";
    protected static final String DTOFIELD_PSWXACCOUNTNAME = "pswxaccountname";
    public static final String FIELD_PSWXENTAPPID = "PSWXENTAPPID";
    protected static final String DTOFIELD_PSWXENTAPPID = "pswxentappid";
    public static final String FIELD_PSWXENTAPPNAME = "PSWXENTAPPNAME";
    protected static final String DTOFIELD_PSWXENTAPPNAME = "pswxentappname";
    public static final String FIELD_REPENTERFLAG = "REPENTERFLAG";
    protected static final String DTOFIELD_REPENTERFLAG = "repenterflag";
    public static final String FIELD_REPLOCATIONFLAG = "REPLOCATIONFLAG";
    protected static final String DTOFIELD_REPLOCATIONFLAG = "replocationflag";
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
    public static final String FIELD_WXENTAPPPARAMS = "WXENTAPPPARAMS";
    protected static final String DTOFIELD_WXENTAPPPARAMS = "wxentappparams";

    @JsonProperty(value="apptype")
    public void setAppType(String appType) {
        this._set(DTOFIELD_APPTYPE, appType);
    }

    @JsonIgnore
    public String getAppType() {
        Object objValue = this._get(DTOFIELD_APPTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppTypeDirty() {
        return this._contains(DTOFIELD_APPTYPE);
    }

    @JsonIgnore
    public void resetAppType() {
        this._reset(DTOFIELD_APPTYPE);
    }

    @JsonIgnore
    public PSWXEntAppDTO apptype(String appType) {
        this.setAppType(appType);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO apptype(PSModelEnums.WXAppType appType) {
        if (appType == null) {
            this.setAppType(null);
        } else {
            this.setAppType(appType.value);
        }
        return this;
    }

    @JsonProperty(value="appurl")
    public void setAppUrl(String appUrl) {
        this._set(DTOFIELD_APPURL, appUrl);
    }

    @JsonIgnore
    public String getAppUrl() {
        Object objValue = this._get(DTOFIELD_APPURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppUrlDirty() {
        return this._contains(DTOFIELD_APPURL);
    }

    @JsonIgnore
    public void resetAppUrl() {
        this._reset(DTOFIELD_APPURL);
    }

    @JsonIgnore
    public PSWXEntAppDTO appurl(String appUrl) {
        this.setAppUrl(appUrl);
        return this;
    }

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
    public PSWXEntAppDTO codename(String codeName) {
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
    public PSWXEntAppDTO createdate(Timestamp createDate) {
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
    public PSWXEntAppDTO createman(String createMan) {
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
    public PSWXEntAppDTO memo(String memo) {
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
    public PSWXEntAppDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSWXEntAppDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSWXEntAppDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSWXEntAppDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSWXEntAppDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSWXEntAppDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSWXEntAppDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSWXEntAppDTO pswxaccountid(String pSWXAccountId) {
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO pswxaccountid(PSWXAccountDTO pSWXAccount) {
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
    public PSWXEntAppDTO pswxaccountname(String pSWXAccountName) {
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
    public PSWXEntAppDTO pswxentappid(String pSWXEntAppId) {
        this.setPSWXEntAppId(pSWXEntAppId);
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
    public PSWXEntAppDTO pswxentappname(String pSWXEntAppName) {
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWXEntAppName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWXEntAppName(strName);
    }

    @JsonIgnore
    public PSWXEntAppDTO name(String strName) {
        this.setPSWXEntAppName(strName);
        return this;
    }

    @JsonProperty(value="repenterflag")
    public void setRepEnterFlag(Integer repEnterFlag) {
        this._set(DTOFIELD_REPENTERFLAG, repEnterFlag);
    }

    @JsonIgnore
    public Integer getRepEnterFlag() {
        Object objValue = this._get(DTOFIELD_REPENTERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRepEnterFlagDirty() {
        return this._contains(DTOFIELD_REPENTERFLAG);
    }

    @JsonIgnore
    public void resetRepEnterFlag() {
        this._reset(DTOFIELD_REPENTERFLAG);
    }

    @JsonIgnore
    public PSWXEntAppDTO repenterflag(Integer repEnterFlag) {
        this.setRepEnterFlag(repEnterFlag);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO repenterflag(Boolean repEnterFlag) {
        if (repEnterFlag == null) {
            this.setRepEnterFlag(null);
        } else {
            this.setRepEnterFlag(repEnterFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="replocationflag")
    public void setRepLocationFlag(Integer repLocationFlag) {
        this._set(DTOFIELD_REPLOCATIONFLAG, repLocationFlag);
    }

    @JsonIgnore
    public Integer getRepLocationFlag() {
        Object objValue = this._get(DTOFIELD_REPLOCATIONFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRepLocationFlagDirty() {
        return this._contains(DTOFIELD_REPLOCATIONFLAG);
    }

    @JsonIgnore
    public void resetRepLocationFlag() {
        this._reset(DTOFIELD_REPLOCATIONFLAG);
    }

    @JsonIgnore
    public PSWXEntAppDTO replocationflag(Integer repLocationFlag) {
        this.setRepLocationFlag(repLocationFlag);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO replocationflag(Boolean repLocationFlag) {
        if (repLocationFlag == null) {
            this.setRepLocationFlag(null);
        } else {
            this.setRepLocationFlag(repLocationFlag != false ? 1 : 0);
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
    public PSWXEntAppDTO updatedate(Timestamp updateDate) {
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
    public PSWXEntAppDTO updateman(String updateMan) {
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
    public PSWXEntAppDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWXEntAppDTO usertag(String userTag) {
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
    public PSWXEntAppDTO usertag2(String userTag2) {
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
    public PSWXEntAppDTO usertag3(String userTag3) {
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
    public PSWXEntAppDTO usertag4(String userTag4) {
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
    public PSWXEntAppDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSWXEntAppDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wxentappparams")
    public void setWXEntAppParams(String wXEntAppParams) {
        this._set(DTOFIELD_WXENTAPPPARAMS, wXEntAppParams);
    }

    @JsonIgnore
    public String getWXEntAppParams() {
        Object objValue = this._get(DTOFIELD_WXENTAPPPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWXEntAppParamsDirty() {
        return this._contains(DTOFIELD_WXENTAPPPARAMS);
    }

    @JsonIgnore
    public void resetWXEntAppParams() {
        this._reset(DTOFIELD_WXENTAPPPARAMS);
    }

    @JsonIgnore
    public PSWXEntAppDTO wxentappparams(String wXEntAppParams) {
        this.setWXEntAppParams(wXEntAppParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWXEntAppId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWXEntAppId(strValue);
    }

    @JsonIgnore
    public PSWXEntAppDTO id(String strValue) {
        this.setPSWXEntAppId(strValue);
        return this;
    }
}
