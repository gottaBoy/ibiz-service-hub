package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnDTO extends PSModelDTOBase {
    public static final String FIELD_ADMINPSDEVUSERID = "ADMINPSDEVUSERID";
    protected static final String DTOFIELD_ADMINPSDEVUSERID = "adminpsdevuserid";
    public static final String FIELD_ADMINPSDEVUSERNAME = "ADMINPSDEVUSERNAME";
    protected static final String DTOFIELD_ADMINPSDEVUSERNAME = "adminpsdevusername";
    public static final String FIELD_CALLBACKTAG = "CALLBACKTAG";
    protected static final String DTOFIELD_CALLBACKTAG = "callbacktag";
    public static final String FIELD_CALLBACKURL = "CALLBACKURL";
    protected static final String DTOFIELD_CALLBACKURL = "callbackurl";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLECALLBACK = "ENABLECALLBACK";
    protected static final String DTOFIELD_ENABLECALLBACK = "enablecallback";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCDEPLOYCENTERID = "PSDCDEPLOYCENTERID";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERID = "psdcdeploycenterid";
    public static final String FIELD_PSDCDEPLOYCENTERNAME = "PSDCDEPLOYCENTERNAME";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERNAME = "psdcdeploycentername";
    public static final String FIELD_PSDCMAVENREPOID = "PSDCMAVENREPOID";
    protected static final String DTOFIELD_PSDCMAVENREPOID = "psdcmavenrepoid";
    public static final String FIELD_PSDCMAVENREPONAME = "PSDCMAVENREPONAME";
    protected static final String DTOFIELD_PSDCMAVENREPONAME = "psdcmavenreponame";
    public static final String FIELD_PSDCWORKSHOPSERVERID = "PSDCWORKSHOPSERVERID";
    protected static final String DTOFIELD_PSDCWORKSHOPSERVERID = "psdcworkshopserverid";
    public static final String FIELD_PSDCWORKSHOPSERVERNAME = "PSDCWORKSHOPSERVERNAME";
    protected static final String DTOFIELD_PSDCWORKSHOPSERVERNAME = "psdcworkshopservername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_SLNFOLDER = "SLNFOLDER";
    protected static final String DTOFIELD_SLNFOLDER = "slnfolder";
    public static final String FIELD_SLNMDURL = "SLNMDURL";
    protected static final String DTOFIELD_SLNMDURL = "slnmdurl";
    public static final String FIELD_SLNSN = "SLNSN";
    protected static final String DTOFIELD_SLNSN = "slnsn";
    public static final String FIELD_SLNTAG = "SLNTAG";
    protected static final String DTOFIELD_SLNTAG = "slntag";
    public static final String FIELD_SLNTAG2 = "SLNTAG2";
    protected static final String DTOFIELD_SLNTAG2 = "slntag2";
    public static final String FIELD_SLNTYPE = "SLNTYPE";
    protected static final String DTOFIELD_SLNTYPE = "slntype";
    public static final String FIELD_SLNVER = "SLNVER";
    protected static final String DTOFIELD_SLNVER = "slnver";
    public static final String FIELD_STUDIOTAG = "STUDIOTAG";
    protected static final String DTOFIELD_STUDIOTAG = "studiotag";
    public static final String FIELD_STUDIOTAG2 = "STUDIOTAG2";
    protected static final String DTOFIELD_STUDIOTAG2 = "studiotag2";
    public static final String FIELD_SYSAPIFLAG = "SYSAPIFLAG";
    protected static final String DTOFIELD_SYSAPIFLAG = "sysapiflag";
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
    public static final String FIELD_VCPASSWORD = "VCPASSWORD";
    protected static final String DTOFIELD_VCPASSWORD = "vcpassword";
    public static final String FIELD_VCUSER = "VCUSER";
    protected static final String DTOFIELD_VCUSER = "vcuser";

    @JsonProperty(value="adminpsdevuserid")
    public void setAdminPSDevUserId(String adminPSDevUserId) {
        this._set(DTOFIELD_ADMINPSDEVUSERID, adminPSDevUserId);
    }

    @JsonIgnore
    public String getAdminPSDevUserId() {
        Object objValue = this._get(DTOFIELD_ADMINPSDEVUSERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAdminPSDevUserIdDirty() {
        return this._contains(DTOFIELD_ADMINPSDEVUSERID);
    }

    @JsonIgnore
    public void resetAdminPSDevUserId() {
        this._reset(DTOFIELD_ADMINPSDEVUSERID);
    }

    @JsonIgnore
    public PSDevSlnDTO adminpsdevuserid(String adminPSDevUserId) {
        this.setAdminPSDevUserId(adminPSDevUserId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO adminpsdevuserid(PSDevUserDTO pSDevUser) {
        if (pSDevUser == null) {
            this.setAdminPSDevUserId(null);
            this.setAdminPSDevUserName(null);
        } else {
            this.setAdminPSDevUserId(pSDevUser.getPSDevUserId());
            this.setAdminPSDevUserName(pSDevUser.getPSDevUserName());
        }
        return this;
    }

    @JsonProperty(value="adminpsdevusername")
    public void setAdminPSDevUserName(String adminPSDevUserName) {
        this._set(DTOFIELD_ADMINPSDEVUSERNAME, adminPSDevUserName);
    }

    @JsonIgnore
    public String getAdminPSDevUserName() {
        Object objValue = this._get(DTOFIELD_ADMINPSDEVUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAdminPSDevUserNameDirty() {
        return this._contains(DTOFIELD_ADMINPSDEVUSERNAME);
    }

    @JsonIgnore
    public void resetAdminPSDevUserName() {
        this._reset(DTOFIELD_ADMINPSDEVUSERNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO adminpsdevusername(String adminPSDevUserName) {
        this.setAdminPSDevUserName(adminPSDevUserName);
        return this;
    }

    @JsonProperty(value="callbacktag")
    public void setCallbackTag(String callbackTag) {
        this._set(DTOFIELD_CALLBACKTAG, callbackTag);
    }

    @JsonIgnore
    public String getCallbackTag() {
        Object objValue = this._get(DTOFIELD_CALLBACKTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallbackTagDirty() {
        return this._contains(DTOFIELD_CALLBACKTAG);
    }

    @JsonIgnore
    public void resetCallbackTag() {
        this._reset(DTOFIELD_CALLBACKTAG);
    }

    @JsonIgnore
    public PSDevSlnDTO callbacktag(String callbackTag) {
        this.setCallbackTag(callbackTag);
        return this;
    }

    @JsonProperty(value="callbackurl")
    public void setCallbackUrl(String callbackUrl) {
        this._set(DTOFIELD_CALLBACKURL, callbackUrl);
    }

    @JsonIgnore
    public String getCallbackUrl() {
        Object objValue = this._get(DTOFIELD_CALLBACKURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallbackUrlDirty() {
        return this._contains(DTOFIELD_CALLBACKURL);
    }

    @JsonIgnore
    public void resetCallbackUrl() {
        this._reset(DTOFIELD_CALLBACKURL);
    }

    @JsonIgnore
    public PSDevSlnDTO callbackurl(String callbackUrl) {
        this.setCallbackUrl(callbackUrl);
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
    public PSDevSlnDTO codename(String codeName) {
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
    public PSDevSlnDTO createdate(Timestamp createDate) {
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
    public PSDevSlnDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enablecallback")
    public void setEnableCallback(Integer enableCallback) {
        this._set(DTOFIELD_ENABLECALLBACK, enableCallback);
    }

    @JsonIgnore
    public Integer getEnableCallback() {
        Object objValue = this._get(DTOFIELD_ENABLECALLBACK);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCallbackDirty() {
        return this._contains(DTOFIELD_ENABLECALLBACK);
    }

    @JsonIgnore
    public void resetEnableCallback() {
        this._reset(DTOFIELD_ENABLECALLBACK);
    }

    @JsonIgnore
    public PSDevSlnDTO enablecallback(Integer enableCallback) {
        this.setEnableCallback(enableCallback);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO enablecallback(Boolean enableCallback) {
        this.setEnableCallback(enableCallback == null ? null : (enableCallback ? 1 : 0));
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) return null;
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
    public PSDevSlnDTO logicname(String logicName) {
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
    public PSDevSlnDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcdeploycenterid")
    public void setPSDCDeployCenterId(String pSDCDeployCenterId) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERID, pSDCDeployCenterId);
    }

    @JsonIgnore
    public String getPSDCDeployCenterId() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterIdDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterId() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcdeploycenterid(String pSDCDeployCenterId) {
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO psdcdeploycenterid(PSDCDeployCenterDTO pSDCDeployCenter) {
        if (pSDCDeployCenter == null) {
            this.setPSDCDeployCenterId(null);
            this.setPSDCDeployCenterName(null);
        } else {
            this.setPSDCDeployCenterId(pSDCDeployCenter.getPSDCDeployCenterId());
            this.setPSDCDeployCenterName(pSDCDeployCenter.getPSDCDeployCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdcdeploycentername")
    public void setPSDCDeployCenterName(String pSDCDeployCenterName) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERNAME, pSDCDeployCenterName);
    }

    @JsonIgnore
    public String getPSDCDeployCenterName() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterNameDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterName() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcdeploycentername(String pSDCDeployCenterName) {
        this.setPSDCDeployCenterName(pSDCDeployCenterName);
        return this;
    }

    @JsonProperty(value="psdcmavenrepoid")
    public void setPSDCMavenRepoId(String pSDCMavenRepoId) {
        this._set(DTOFIELD_PSDCMAVENREPOID, pSDCMavenRepoId);
    }

    @JsonIgnore
    public String getPSDCMavenRepoId() {
        Object objValue = this._get(DTOFIELD_PSDCMAVENREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMavenRepoIdDirty() {
        return this._contains(DTOFIELD_PSDCMAVENREPOID);
    }

    @JsonIgnore
    public void resetPSDCMavenRepoId() {
        this._reset(DTOFIELD_PSDCMAVENREPOID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcmavenrepoid(String pSDCMavenRepoId) {
        this.setPSDCMavenRepoId(pSDCMavenRepoId);
        return this;
    }

    @JsonProperty(value="psdcmavenreponame")
    public void setPSDCMavenRepoName(String pSDCMavenRepoName) {
        this._set(DTOFIELD_PSDCMAVENREPONAME, pSDCMavenRepoName);
    }

    @JsonIgnore
    public String getPSDCMavenRepoName() {
        Object objValue = this._get(DTOFIELD_PSDCMAVENREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMavenRepoNameDirty() {
        return this._contains(DTOFIELD_PSDCMAVENREPONAME);
    }

    @JsonIgnore
    public void resetPSDCMavenRepoName() {
        this._reset(DTOFIELD_PSDCMAVENREPONAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcmavenreponame(String pSDCMavenRepoName) {
        this.setPSDCMavenRepoName(pSDCMavenRepoName);
        return this;
    }

    @JsonProperty(value="psdcworkshopserverid")
    public void setPSDCWorkshopServerId(String pSDCWorkshopServerId) {
        this._set(DTOFIELD_PSDCWORKSHOPSERVERID, pSDCWorkshopServerId);
    }

    @JsonIgnore
    public String getPSDCWorkshopServerId() {
        Object objValue = this._get(DTOFIELD_PSDCWORKSHOPSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCWorkshopServerIdDirty() {
        return this._contains(DTOFIELD_PSDCWORKSHOPSERVERID);
    }

    @JsonIgnore
    public void resetPSDCWorkshopServerId() {
        this._reset(DTOFIELD_PSDCWORKSHOPSERVERID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcworkshopserverid(String pSDCWorkshopServerId) {
        this.setPSDCWorkshopServerId(pSDCWorkshopServerId);
        return this;
    }

    @JsonProperty(value="psdcworkshopservername")
    public void setPSDCWorkshopServerName(String pSDCWorkshopServerName) {
        this._set(DTOFIELD_PSDCWORKSHOPSERVERNAME, pSDCWorkshopServerName);
    }

    @JsonIgnore
    public String getPSDCWorkshopServerName() {
        Object objValue = this._get(DTOFIELD_PSDCWORKSHOPSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCWorkshopServerNameDirty() {
        return this._contains(DTOFIELD_PSDCWORKSHOPSERVERNAME);
    }

    @JsonIgnore
    public void resetPSDCWorkshopServerName() {
        this._reset(DTOFIELD_PSDCWORKSHOPSERVERNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdcworkshopservername(String pSDCWorkshopServerName) {
        this.setPSDCWorkshopServerName(pSDCWorkshopServerName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevcentersvnid")
    public void setPSDevCenterSVNId(String pSDevCenterSVNId) {
        this._set(DTOFIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }

    @JsonIgnore
    public String getPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNId() {
        this._reset(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentersvnname")
    public void setPSDevCenterSVNName(String pSDevCenterSVNName) {
        this._set(DTOFIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }

    @JsonIgnore
    public String getPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNName() {
        this._reset(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevcentersvnname(String pSDevCenterSVNName) {
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="slnfolder")
    public void setSLNFolder(String sLNFolder) {
        this._set(DTOFIELD_SLNFOLDER, sLNFolder);
    }

    @JsonIgnore
    public String getSLNFolder() {
        Object objValue = this._get(DTOFIELD_SLNFOLDER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSLNFolderDirty() {
        return this._contains(DTOFIELD_SLNFOLDER);
    }

    @JsonIgnore
    public void resetSLNFolder() {
        this._reset(DTOFIELD_SLNFOLDER);
    }

    @JsonIgnore
    public PSDevSlnDTO slnfolder(String sLNFolder) {
        this.setSLNFolder(sLNFolder);
        return this;
    }

    @JsonProperty(value="slnmdurl")
    public void setSlnMDUrl(String slnMDUrl) {
        this._set(DTOFIELD_SLNMDURL, slnMDUrl);
    }

    @JsonIgnore
    public String getSlnMDUrl() {
        Object objValue = this._get(DTOFIELD_SLNMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlnMDUrlDirty() {
        return this._contains(DTOFIELD_SLNMDURL);
    }

    @JsonIgnore
    public void resetSlnMDUrl() {
        this._reset(DTOFIELD_SLNMDURL);
    }

    @JsonIgnore
    public PSDevSlnDTO slnmdurl(String slnMDUrl) {
        this.setSlnMDUrl(slnMDUrl);
        return this;
    }

    @JsonProperty(value="slnsn")
    public void setSLNSN(String sLNSN) {
        this._set(DTOFIELD_SLNSN, sLNSN);
    }

    @JsonIgnore
    public String getSLNSN() {
        Object objValue = this._get(DTOFIELD_SLNSN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSLNSNDirty() {
        return this._contains(DTOFIELD_SLNSN);
    }

    @JsonIgnore
    public void resetSLNSN() {
        this._reset(DTOFIELD_SLNSN);
    }

    @JsonIgnore
    public PSDevSlnDTO slnsn(String sLNSN) {
        this.setSLNSN(sLNSN);
        return this;
    }

    @JsonProperty(value="slntag")
    public void setSlnTag(String slnTag) {
        this._set(DTOFIELD_SLNTAG, slnTag);
    }

    @JsonIgnore
    public String getSlnTag() {
        Object objValue = this._get(DTOFIELD_SLNTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlnTagDirty() {
        return this._contains(DTOFIELD_SLNTAG);
    }

    @JsonIgnore
    public void resetSlnTag() {
        this._reset(DTOFIELD_SLNTAG);
    }

    @JsonIgnore
    public PSDevSlnDTO slntag(String slnTag) {
        this.setSlnTag(slnTag);
        return this;
    }

    @JsonProperty(value="slntag2")
    public void setSlnTag2(String slnTag2) {
        this._set(DTOFIELD_SLNTAG2, slnTag2);
    }

    @JsonIgnore
    public String getSlnTag2() {
        Object objValue = this._get(DTOFIELD_SLNTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlnTag2Dirty() {
        return this._contains(DTOFIELD_SLNTAG2);
    }

    @JsonIgnore
    public void resetSlnTag2() {
        this._reset(DTOFIELD_SLNTAG2);
    }

    @JsonIgnore
    public PSDevSlnDTO slntag2(String slnTag2) {
        this.setSlnTag2(slnTag2);
        return this;
    }

    @JsonProperty(value="slntype")
    public void setSLNType(String sLNType) {
        this._set(DTOFIELD_SLNTYPE, sLNType);
    }

    @JsonIgnore
    public String getSLNType() {
        Object objValue = this._get(DTOFIELD_SLNTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSLNTypeDirty() {
        return this._contains(DTOFIELD_SLNTYPE);
    }

    @JsonIgnore
    public void resetSLNType() {
        this._reset(DTOFIELD_SLNTYPE);
    }

    @JsonIgnore
    public PSDevSlnDTO slntype(String sLNType) {
        this.setSLNType(sLNType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO slntype(PSModelEnums.DevSlnType sLNType) {
        this.setSLNType(sLNType == null ? null : sLNType.value);
        return this;
    }

    @JsonProperty(value="slnver")
    public void setSLNVer(Integer sLNVer) {
        this._set(DTOFIELD_SLNVER, sLNVer);
    }

    @JsonIgnore
    public Integer getSLNVer() {
        Object objValue = this._get(DTOFIELD_SLNVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSLNVerDirty() {
        return this._contains(DTOFIELD_SLNVER);
    }

    @JsonIgnore
    public void resetSLNVer() {
        this._reset(DTOFIELD_SLNVER);
    }

    @JsonIgnore
    public PSDevSlnDTO slnver(Integer sLNVer) {
        this.setSLNVer(sLNVer);
        return this;
    }

    @JsonProperty(value="studiotag")
    public void setStudioTag(String studioTag) {
        this._set(DTOFIELD_STUDIOTAG, studioTag);
    }

    @JsonIgnore
    public String getStudioTag() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTagDirty() {
        return this._contains(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public void resetStudioTag() {
        this._reset(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public PSDevSlnDTO studiotag(String studioTag) {
        this.setStudioTag(studioTag);
        return this;
    }

    @JsonProperty(value="studiotag2")
    public void setStudioTag2(String studioTag2) {
        this._set(DTOFIELD_STUDIOTAG2, studioTag2);
    }

    @JsonIgnore
    public String getStudioTag2() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTag2Dirty() {
        return this._contains(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public void resetStudioTag2() {
        this._reset(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public PSDevSlnDTO studiotag2(String studioTag2) {
        this.setStudioTag2(studioTag2);
        return this;
    }

    @JsonProperty(value="sysapiflag")
    public void setSysAPIFlag(Integer sysAPIFlag) {
        this._set(DTOFIELD_SYSAPIFLAG, sysAPIFlag);
    }

    @JsonIgnore
    public Integer getSysAPIFlag() {
        Object objValue = this._get(DTOFIELD_SYSAPIFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSysAPIFlagDirty() {
        return this._contains(DTOFIELD_SYSAPIFLAG);
    }

    @JsonIgnore
    public void resetSysAPIFlag() {
        this._reset(DTOFIELD_SYSAPIFLAG);
    }

    @JsonIgnore
    public PSDevSlnDTO sysapiflag(Integer sysAPIFlag) {
        this.setSysAPIFlag(sysAPIFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO sysapiflag(Boolean sysAPIFlag) {
        this.setSysAPIFlag(sysAPIFlag == null ? null : (sysAPIFlag ? 1 : 0));
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
    public PSDevSlnDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnDTO updateman(String updateMan) {
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
    public PSDevSlnDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDevSlnDTO usertag(String userTag) {
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
    public PSDevSlnDTO usertag2(String userTag2) {
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
    public PSDevSlnDTO usertag3(String userTag3) {
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
    public PSDevSlnDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="vcpassword")
    public void setVCPassword(String vCPassword) {
        this._set(DTOFIELD_VCPASSWORD, vCPassword);
    }

    @JsonIgnore
    public String getVCPassword() {
        Object objValue = this._get(DTOFIELD_VCPASSWORD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVCPasswordDirty() {
        return this._contains(DTOFIELD_VCPASSWORD);
    }

    @JsonIgnore
    public void resetVCPassword() {
        this._reset(DTOFIELD_VCPASSWORD);
    }

    @JsonIgnore
    public PSDevSlnDTO vcpassword(String vCPassword) {
        this.setVCPassword(vCPassword);
        return this;
    }

    @JsonProperty(value="vcuser")
    public void setVCUser(String vCUser) {
        this._set(DTOFIELD_VCUSER, vCUser);
    }

    @JsonIgnore
    public String getVCUser() {
        Object objValue = this._get(DTOFIELD_VCUSER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVCUserDirty() {
        return this._contains(DTOFIELD_VCUSER);
    }

    @JsonIgnore
    public void resetVCUser() {
        this._reset(DTOFIELD_VCUSER);
    }

    @JsonIgnore
    public PSDevSlnDTO vcuser(String vCUser) {
        this.setVCUser(vCUser);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnName(strName);
    }

    @JsonIgnore
    public PSDevSlnDTO name(String strName) {
        this.setPSDevSlnName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnId(strValue);
    }

    @JsonIgnore
    public PSDevSlnDTO id(String strValue) {
        this.setPSDevSlnId(strValue);
        return this;
    }

}
