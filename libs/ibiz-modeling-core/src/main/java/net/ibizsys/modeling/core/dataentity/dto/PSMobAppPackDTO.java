package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSMobAppPackDTO extends PSModelDTOBase {
    public static final String FIELD_ANDROIDPERMISSIONS = "ANDROIDPERMISSIONS";
    protected static final String DTOFIELD_ANDROIDPERMISSIONS = "androidpermissions";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLEANDROID = "ENABLEANDROID";
    protected static final String DTOFIELD_ENABLEANDROID = "enableandroid";
    public static final String FIELD_ENABLEENCRYPTION = "ENABLEENCRYPTION";
    protected static final String DTOFIELD_ENABLEENCRYPTION = "enableencryption";
    public static final String FIELD_ENABLEIOS = "ENABLEIOS";
    protected static final String DTOFIELD_ENABLEIOS = "enableios";
    public static final String FIELD_IOSDEVICES = "IOSDEVICES";
    protected static final String DTOFIELD_IOSDEVICES = "iosdevices";
    public static final String FIELD_IOSPRIVACIES = "IOSPRIVACIES";
    protected static final String DTOFIELD_IOSPRIVACIES = "iosprivacies";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_OSTYPE = "OSTYPE";
    protected static final String DTOFIELD_OSTYPE = "ostype";
    public static final String FIELD_OSTYPES = "OSTYPES";
    protected static final String DTOFIELD_OSTYPES = "ostypes";
    public static final String FIELD_PACKTYPE = "PACKTYPE";
    protected static final String DTOFIELD_PACKTYPE = "packtype";
    public static final String FIELD_PKGNAME = "PKGNAME";
    protected static final String DTOFIELD_PKGNAME = "pkgname";
    public static final String FIELD_PSDCMOBPACKCERTID = "PSDCMOBPACKCERTID";
    protected static final String DTOFIELD_PSDCMOBPACKCERTID = "psdcmobpackcertid";
    public static final String FIELD_PSDCMOBPACKCERTNAME = "PSDCMOBPACKCERTNAME";
    protected static final String DTOFIELD_PSDCMOBPACKCERTNAME = "psdcmobpackcertname";
    public static final String FIELD_PSMOBAPPPACKID = "PSMOBAPPPACKID";
    protected static final String DTOFIELD_PSMOBAPPPACKID = "psmobapppackid";
    public static final String FIELD_PSMOBAPPPACKNAME = "PSMOBAPPPACKNAME";
    protected static final String DTOFIELD_PSMOBAPPPACKNAME = "psmobapppackname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_SERVICEURL = "SERVICEURL";
    protected static final String DTOFIELD_SERVICEURL = "serviceurl";
    public static final String FIELD_TDCNT = "TDCNT";
    protected static final String DTOFIELD_TDCNT = "tdcnt";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
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
    public static final String FIELD_VERSION = "VERSION";
    protected static final String DTOFIELD_VERSION = "version";

    @JsonProperty(value="androidpermissions")
    public void setAndroidPermissions(String androidPermissions) {
        this._set(DTOFIELD_ANDROIDPERMISSIONS, androidPermissions);
    }

    @JsonIgnore
    public String getAndroidPermissions() {
        Object objValue = this._get(DTOFIELD_ANDROIDPERMISSIONS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAndroidPermissionsDirty() {
        return this._contains(DTOFIELD_ANDROIDPERMISSIONS);
    }

    @JsonIgnore
    public void resetAndroidPermissions() {
        this._reset(DTOFIELD_ANDROIDPERMISSIONS);
    }

    @JsonIgnore
    public PSMobAppPackDTO androidpermissions(String androidPermissions) {
        this.setAndroidPermissions(androidPermissions);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO androidpermissions(PSModelEnums.AndroidPermission[] androidPermissions) {
        if (androidPermissions == null || androidPermissions.length == 0) {
            this.setAndroidPermissions(null);
        } else {
            String value = "";
            for (PSModelEnums.AndroidPermission item : androidPermissions) {
                if (value.length() > 0) value = value + ";";
                value = value + item.value;
            }
            this.setAndroidPermissions(value);
        }
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
    public PSMobAppPackDTO codename(String codeName) {
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
    public PSMobAppPackDTO createdate(Timestamp createDate) {
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
    public PSMobAppPackDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enableandroid")
    public void setEnableAndroid(Integer enableAndroid) {
        this._set(DTOFIELD_ENABLEANDROID, enableAndroid);
    }

    @JsonIgnore
    public Integer getEnableAndroid() {
        Object objValue = this._get(DTOFIELD_ENABLEANDROID);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAndroidDirty() {
        return this._contains(DTOFIELD_ENABLEANDROID);
    }

    @JsonIgnore
    public void resetEnableAndroid() {
        this._reset(DTOFIELD_ENABLEANDROID);
    }

    @JsonIgnore
    public PSMobAppPackDTO enableandroid(Integer enableAndroid) {
        this.setEnableAndroid(enableAndroid);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO enableandroid(Boolean enableAndroid) {
        this.setEnableAndroid(enableAndroid == null ? null : (enableAndroid ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enableencryption")
    public void setEnableEncryption(Integer enableEncryption) {
        this._set(DTOFIELD_ENABLEENCRYPTION, enableEncryption);
    }

    @JsonIgnore
    public Integer getEnableEncryption() {
        Object objValue = this._get(DTOFIELD_ENABLEENCRYPTION);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableEncryptionDirty() {
        return this._contains(DTOFIELD_ENABLEENCRYPTION);
    }

    @JsonIgnore
    public void resetEnableEncryption() {
        this._reset(DTOFIELD_ENABLEENCRYPTION);
    }

    @JsonIgnore
    public PSMobAppPackDTO enableencryption(Integer enableEncryption) {
        this.setEnableEncryption(enableEncryption);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO enableencryption(Boolean enableEncryption) {
        this.setEnableEncryption(enableEncryption == null ? null : (enableEncryption ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enableios")
    public void setEnableIOS(Integer enableIOS) {
        this._set(DTOFIELD_ENABLEIOS, enableIOS);
    }

    @JsonIgnore
    public Integer getEnableIOS() {
        Object objValue = this._get(DTOFIELD_ENABLEIOS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableIOSDirty() {
        return this._contains(DTOFIELD_ENABLEIOS);
    }

    @JsonIgnore
    public void resetEnableIOS() {
        this._reset(DTOFIELD_ENABLEIOS);
    }

    @JsonIgnore
    public PSMobAppPackDTO enableios(Integer enableIOS) {
        this.setEnableIOS(enableIOS);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO enableios(Boolean enableIOS) {
        this.setEnableIOS(enableIOS == null ? null : (enableIOS ? 1 : 0));
        return this;
    }

    @JsonProperty(value="iosdevices")
    public void setIOSDevices(String iOSDevices) {
        this._set(DTOFIELD_IOSDEVICES, iOSDevices);
    }

    @JsonIgnore
    public String getIOSDevices() {
        Object objValue = this._get(DTOFIELD_IOSDEVICES);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIOSDevicesDirty() {
        return this._contains(DTOFIELD_IOSDEVICES);
    }

    @JsonIgnore
    public void resetIOSDevices() {
        this._reset(DTOFIELD_IOSDEVICES);
    }

    @JsonIgnore
    public PSMobAppPackDTO iosdevices(String iOSDevices) {
        this.setIOSDevices(iOSDevices);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO iosdevices(PSModelEnums.IOSDeviceType[] iOSDevices) {
        if (iOSDevices == null || iOSDevices.length == 0) {
            this.setIOSDevices(null);
        } else {
            String value = "";
            for (PSModelEnums.IOSDeviceType item : iOSDevices) {
                if (value.length() > 0) value = value + ";";
                value = value + item.value;
            }
            this.setIOSDevices(value);
        }
        return this;
    }

    @JsonProperty(value="iosprivacies")
    public void setIOSPrivacies(String iOSPrivacies) {
        this._set(DTOFIELD_IOSPRIVACIES, iOSPrivacies);
    }

    @JsonIgnore
    public String getIOSPrivacies() {
        Object objValue = this._get(DTOFIELD_IOSPRIVACIES);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIOSPrivaciesDirty() {
        return this._contains(DTOFIELD_IOSPRIVACIES);
    }

    @JsonIgnore
    public void resetIOSPrivacies() {
        this._reset(DTOFIELD_IOSPRIVACIES);
    }

    @JsonIgnore
    public PSMobAppPackDTO iosprivacies(String iOSPrivacies) {
        this.setIOSPrivacies(iOSPrivacies);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO iosprivacies(PSModelEnums.IOSPrivicy[] iOSPrivacies) {
        if (iOSPrivacies == null || iOSPrivacies.length == 0) {
            this.setIOSPrivacies(null);
        } else {
            String value = "";
            for (PSModelEnums.IOSPrivicy item : iOSPrivacies) {
                if (value.length() > 0) value = value + ";";
                value = value + item.value;
            }
            this.setIOSPrivacies(value);
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
    public PSMobAppPackDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ostype")
    public void setOSType(String oSType) {
        this._set(DTOFIELD_OSTYPE, oSType);
    }

    @JsonIgnore
    public String getOSType() {
        Object objValue = this._get(DTOFIELD_OSTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOSTypeDirty() {
        return this._contains(DTOFIELD_OSTYPE);
    }

    @JsonIgnore
    public void resetOSType() {
        this._reset(DTOFIELD_OSTYPE);
    }

    @JsonIgnore
    public PSMobAppPackDTO ostype(String oSType) {
        this.setOSType(oSType);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO ostype(PSModelEnums.MobOSType oSType) {
        this.setOSType(oSType == null ? null : oSType.value);
        return this;
    }

    @JsonProperty(value="ostypes")
    public void setOSTypes(String oSTypes) {
        this._set(DTOFIELD_OSTYPES, oSTypes);
    }

    @JsonIgnore
    public String getOSTypes() {
        Object objValue = this._get(DTOFIELD_OSTYPES);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOSTypesDirty() {
        return this._contains(DTOFIELD_OSTYPES);
    }

    @JsonIgnore
    public void resetOSTypes() {
        this._reset(DTOFIELD_OSTYPES);
    }

    @JsonIgnore
    public PSMobAppPackDTO ostypes(String oSTypes) {
        this.setOSTypes(oSTypes);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO ostypes(PSModelEnums.MobOSType[] oSTypes) {
        if (oSTypes == null || oSTypes.length == 0) {
            this.setOSTypes(null);
        } else {
            String value = "";
            for (PSModelEnums.MobOSType item : oSTypes) {
                if (value.length() > 0) value = value + ";";
                value = value + item.value;
            }
            this.setOSTypes(value);
        }
        return this;
    }

    @JsonProperty(value="packtype")
    public void setPackType(String packType) {
        this._set(DTOFIELD_PACKTYPE, packType);
    }

    @JsonIgnore
    public String getPackType() {
        Object objValue = this._get(DTOFIELD_PACKTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPackTypeDirty() {
        return this._contains(DTOFIELD_PACKTYPE);
    }

    @JsonIgnore
    public void resetPackType() {
        this._reset(DTOFIELD_PACKTYPE);
    }

    @JsonIgnore
    public PSMobAppPackDTO packtype(String packType) {
        this.setPackType(packType);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO packtype(PSModelEnums.MobAppPackType packType) {
        this.setPackType(packType == null ? null : packType.value);
        return this;
    }

    @JsonProperty(value="pkgname")
    public void setPkgName(String pkgName) {
        this._set(DTOFIELD_PKGNAME, pkgName);
    }

    @JsonIgnore
    public String getPkgName() {
        Object objValue = this._get(DTOFIELD_PKGNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgNameDirty() {
        return this._contains(DTOFIELD_PKGNAME);
    }

    @JsonIgnore
    public void resetPkgName() {
        this._reset(DTOFIELD_PKGNAME);
    }

    @JsonIgnore
    public PSMobAppPackDTO pkgname(String pkgName) {
        this.setPkgName(pkgName);
        return this;
    }

    @JsonProperty(value="psdcmobpackcertid")
    public void setPSDCMobPackCertId(String pSDCMobPackCertId) {
        this._set(DTOFIELD_PSDCMOBPACKCERTID, pSDCMobPackCertId);
    }

    @JsonIgnore
    public String getPSDCMobPackCertId() {
        Object objValue = this._get(DTOFIELD_PSDCMOBPACKCERTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMobPackCertIdDirty() {
        return this._contains(DTOFIELD_PSDCMOBPACKCERTID);
    }

    @JsonIgnore
    public void resetPSDCMobPackCertId() {
        this._reset(DTOFIELD_PSDCMOBPACKCERTID);
    }

    @JsonIgnore
    public PSMobAppPackDTO psdcmobpackcertid(String pSDCMobPackCertId) {
        this.setPSDCMobPackCertId(pSDCMobPackCertId);
        return this;
    }

    @JsonProperty(value="psdcmobpackcertname")
    public void setPSDCMobPackCertName(String pSDCMobPackCertName) {
        this._set(DTOFIELD_PSDCMOBPACKCERTNAME, pSDCMobPackCertName);
    }

    @JsonIgnore
    public String getPSDCMobPackCertName() {
        Object objValue = this._get(DTOFIELD_PSDCMOBPACKCERTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMobPackCertNameDirty() {
        return this._contains(DTOFIELD_PSDCMOBPACKCERTNAME);
    }

    @JsonIgnore
    public void resetPSDCMobPackCertName() {
        this._reset(DTOFIELD_PSDCMOBPACKCERTNAME);
    }

    @JsonIgnore
    public PSMobAppPackDTO psdcmobpackcertname(String pSDCMobPackCertName) {
        this.setPSDCMobPackCertName(pSDCMobPackCertName);
        return this;
    }

    @JsonProperty(value="psmobapppackid")
    public void setPSMobAppPackId(String pSMobAppPackId) {
        this._set(DTOFIELD_PSMOBAPPPACKID, pSMobAppPackId);
    }

    @JsonIgnore
    public String getPSMobAppPackId() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPPACKID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppPackIdDirty() {
        return this._contains(DTOFIELD_PSMOBAPPPACKID);
    }

    @JsonIgnore
    public void resetPSMobAppPackId() {
        this._reset(DTOFIELD_PSMOBAPPPACKID);
    }

    @JsonIgnore
    public PSMobAppPackDTO psmobapppackid(String pSMobAppPackId) {
        this.setPSMobAppPackId(pSMobAppPackId);
        return this;
    }

    @JsonProperty(value="psmobapppackname")
    public void setPSMobAppPackName(String pSMobAppPackName) {
        this._set(DTOFIELD_PSMOBAPPPACKNAME, pSMobAppPackName);
    }

    @JsonIgnore
    public String getPSMobAppPackName() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPPACKNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppPackNameDirty() {
        return this._contains(DTOFIELD_PSMOBAPPPACKNAME);
    }

    @JsonIgnore
    public void resetPSMobAppPackName() {
        this._reset(DTOFIELD_PSMOBAPPPACKNAME);
    }

    @JsonIgnore
    public PSMobAppPackDTO psmobapppackname(String pSMobAppPackName) {
        this.setPSMobAppPackName(pSMobAppPackName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) return null;
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
    public PSMobAppPackDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSMobAppPackDTO pssysappid(PSSysAppDTO pSSysApp) {
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
        if (objValue == null) return null;
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
    public PSMobAppPackDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="serviceurl")
    public void setServiceUrl(String serviceUrl) {
        this._set(DTOFIELD_SERVICEURL, serviceUrl);
    }

    @JsonIgnore
    public String getServiceUrl() {
        Object objValue = this._get(DTOFIELD_SERVICEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceUrlDirty() {
        return this._contains(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public void resetServiceUrl() {
        this._reset(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public PSMobAppPackDTO serviceurl(String serviceUrl) {
        this.setServiceUrl(serviceUrl);
        return this;
    }

    @JsonProperty(value="tdcnt")
    public void setTDCnt(Integer tDCnt) {
        this._set(DTOFIELD_TDCNT, tDCnt);
    }

    @JsonIgnore
    public Integer getTDCnt() {
        Object objValue = this._get(DTOFIELD_TDCNT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTDCntDirty() {
        return this._contains(DTOFIELD_TDCNT);
    }

    @JsonIgnore
    public void resetTDCnt() {
        this._reset(DTOFIELD_TDCNT);
    }

    @JsonIgnore
    public PSMobAppPackDTO tdcnt(Integer tDCnt) {
        this.setTDCnt(tDCnt);
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
    public PSMobAppPackDTO updatedate(Timestamp updateDate) {
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
    public PSMobAppPackDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) return null;
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
    public PSMobAppPackDTO userparams(String userParams) {
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
    public PSMobAppPackDTO usertag(String userTag) {
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
    public PSMobAppPackDTO usertag2(String userTag2) {
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
    public PSMobAppPackDTO usertag3(String userTag3) {
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
    public PSMobAppPackDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="version")
    public void setVersion(String version) {
        this._set(DTOFIELD_VERSION, version);
    }

    @JsonIgnore
    public String getVersion() {
        Object objValue = this._get(DTOFIELD_VERSION);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVersionDirty() {
        return this._contains(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public void resetVersion() {
        this._reset(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public PSMobAppPackDTO version(String version) {
        this.setVersion(version);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSMobAppPackName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSMobAppPackName(strName);
    }

    @JsonIgnore
    public PSMobAppPackDTO name(String strName) {
        this.setPSMobAppPackName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSMobAppPackId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSMobAppPackId(strValue);
    }

    @JsonIgnore
    public PSMobAppPackDTO id(String strValue) {
        this.setPSMobAppPackId(strValue);
        return this;
    }

}
