package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCWorkspaceDTO extends PSModelDTOBase {
    public static final String FIELD_ACCESSUSERS = "ACCESSUSERS";
    protected static final String DTOFIELD_ACCESSUSERS = "accessusers";
    public static final String FIELD_ACTIONOWNER = "ACTIONOWNER";
    protected static final String DTOFIELD_ACTIONOWNER = "actionowner";
    public static final String FIELD_ACTIONPARAM = "ACTIONPARAM";
    protected static final String DTOFIELD_ACTIONPARAM = "actionparam";
    public static final String FIELD_ACTIONPARAM2 = "ACTIONPARAM2";
    protected static final String DTOFIELD_ACTIONPARAM2 = "actionparam2";
    public static final String FIELD_ACTIONPARAM3 = "ACTIONPARAM3";
    protected static final String DTOFIELD_ACTIONPARAM3 = "actionparam3";
    public static final String FIELD_ACTIONPARAM4 = "ACTIONPARAM4";
    protected static final String DTOFIELD_ACTIONPARAM4 = "actionparam4";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CURACTION = "CURACTION";
    protected static final String DTOFIELD_CURACTION = "curaction";
    public static final String FIELD_CURACTIVETIME = "CURACTIVETIME";
    protected static final String DTOFIELD_CURACTIVETIME = "curactivetime";
    public static final String FIELD_CUREXPIREDTIME = "CUREXPIREDTIME";
    protected static final String DTOFIELD_CUREXPIREDTIME = "curexpiredtime";
    public static final String FIELD_EXP = "EXP";
    protected static final String DTOFIELD_EXP = "exp";
    public static final String FIELD_EXP2 = "EXP2";
    protected static final String DTOFIELD_EXP2 = "exp2";
    public static final String FIELD_EXPIREDTIME = "EXPIREDTIME";
    protected static final String DTOFIELD_EXPIREDTIME = "expiredtime";
    public static final String FIELD_IPADDRS = "IPADDRS";
    protected static final String DTOFIELD_IPADDRS = "ipaddrs";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCWORKSPACEID = "PSDCWORKSPACEID";
    protected static final String DTOFIELD_PSDCWORKSPACEID = "psdcworkspaceid";
    public static final String FIELD_PSDCWORKSPACENAME = "PSDCWORKSPACENAME";
    protected static final String DTOFIELD_PSDCWORKSPACENAME = "psdcworkspacename";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSWORKSPACEID = "PSWORKSPACEID";
    protected static final String DTOFIELD_PSWORKSPACEID = "psworkspaceid";
    public static final String FIELD_PSWORKSPACENAME = "PSWORKSPACENAME";
    protected static final String DTOFIELD_PSWORKSPACENAME = "psworkspacename";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_WORKSPACELEVEL = "WORKSPACELEVEL";
    protected static final String DTOFIELD_WORKSPACELEVEL = "workspacelevel";
    public static final String FIELD_WORKSPACESTATE = "WORKSPACESTATE";
    protected static final String DTOFIELD_WORKSPACESTATE = "workspacestate";
    public static final String FIELD_WORKSPACETYPE = "WORKSPACETYPE";
    protected static final String DTOFIELD_WORKSPACETYPE = "workspacetype";
    public static final String FIELD_WORKSPACEUPDATEDATE = "WORKSPACEUPDATEDATE";
    protected static final String DTOFIELD_WORKSPACEUPDATEDATE = "workspaceupdatedate";
    public static final String FIELD_WORKSPACEUSAGE = "WORKSPACEUSAGE";
    protected static final String DTOFIELD_WORKSPACEUSAGE = "workspaceusage";

    @JsonProperty(value="accessusers")
    public void setAccessUsers(String accessUsers) {
        this._set(DTOFIELD_ACCESSUSERS, accessUsers);
    }

    @JsonIgnore
    public String getAccessUsers() {
        Object objValue = this._get(DTOFIELD_ACCESSUSERS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAccessUsersDirty() {
        return this._contains(DTOFIELD_ACCESSUSERS);
    }

    @JsonIgnore
    public void resetAccessUsers() {
        this._reset(DTOFIELD_ACCESSUSERS);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO accessusers(String accessUsers) {
        this.setAccessUsers(accessUsers);
        return this;
    }

    @JsonProperty(value="actionowner")
    public void setActionOwner(String actionOwner) {
        this._set(DTOFIELD_ACTIONOWNER, actionOwner);
    }

    @JsonIgnore
    public String getActionOwner() {
        Object objValue = this._get(DTOFIELD_ACTIONOWNER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionOwnerDirty() {
        return this._contains(DTOFIELD_ACTIONOWNER);
    }

    @JsonIgnore
    public void resetActionOwner() {
        this._reset(DTOFIELD_ACTIONOWNER);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO actionowner(String actionOwner) {
        this.setActionOwner(actionOwner);
        return this;
    }

    @JsonProperty(value="actionparam")
    public void setActionParam(String actionParam) {
        this._set(DTOFIELD_ACTIONPARAM, actionParam);
    }

    @JsonIgnore
    public String getActionParam() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamDirty() {
        return this._contains(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public void resetActionParam() {
        this._reset(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO actionparam(String actionParam) {
        this.setActionParam(actionParam);
        return this;
    }

    @JsonProperty(value="actionparam2")
    public void setActionParam2(String actionParam2) {
        this._set(DTOFIELD_ACTIONPARAM2, actionParam2);
    }

    @JsonIgnore
    public String getActionParam2() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam2Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public void resetActionParam2() {
        this._reset(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO actionparam2(String actionParam2) {
        this.setActionParam2(actionParam2);
        return this;
    }

    @JsonProperty(value="actionparam3")
    public void setActionParam3(String actionParam3) {
        this._set(DTOFIELD_ACTIONPARAM3, actionParam3);
    }

    @JsonIgnore
    public String getActionParam3() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam3Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public void resetActionParam3() {
        this._reset(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO actionparam3(String actionParam3) {
        this.setActionParam3(actionParam3);
        return this;
    }

    @JsonProperty(value="actionparam4")
    public void setActionParam4(String actionParam4) {
        this._set(DTOFIELD_ACTIONPARAM4, actionParam4);
    }

    @JsonIgnore
    public String getActionParam4() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam4Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public void resetActionParam4() {
        this._reset(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO actionparam4(String actionParam4) {
        this.setActionParam4(actionParam4);
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
    public PSDCWorkspaceDTO createdate(Timestamp createDate) {
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
    public PSDCWorkspaceDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="curaction")
    public void setCurAction(String curAction) {
        this._set(DTOFIELD_CURACTION, curAction);
    }

    @JsonIgnore
    public String getCurAction() {
        Object objValue = this._get(DTOFIELD_CURACTION);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCurActionDirty() {
        return this._contains(DTOFIELD_CURACTION);
    }

    @JsonIgnore
    public void resetCurAction() {
        this._reset(DTOFIELD_CURACTION);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO curaction(String curAction) {
        this.setCurAction(curAction);
        return this;
    }

    @JsonProperty(value="curactivetime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCurActiveTime(Timestamp curActiveTime) {
        this._set(DTOFIELD_CURACTIVETIME, curActiveTime);
    }

    @JsonIgnore
    public Timestamp getCurActiveTime() {
        Object objValue = this._get(DTOFIELD_CURACTIVETIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isCurActiveTimeDirty() {
        return this._contains(DTOFIELD_CURACTIVETIME);
    }

    @JsonIgnore
    public void resetCurActiveTime() {
        this._reset(DTOFIELD_CURACTIVETIME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO curactivetime(Timestamp curActiveTime) {
        this.setCurActiveTime(curActiveTime);
        return this;
    }

    @JsonProperty(value="curexpiredtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCurExpiredTime(Timestamp curExpiredTime) {
        this._set(DTOFIELD_CUREXPIREDTIME, curExpiredTime);
    }

    @JsonIgnore
    public Timestamp getCurExpiredTime() {
        Object objValue = this._get(DTOFIELD_CUREXPIREDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isCurExpiredTimeDirty() {
        return this._contains(DTOFIELD_CUREXPIREDTIME);
    }

    @JsonIgnore
    public void resetCurExpiredTime() {
        this._reset(DTOFIELD_CUREXPIREDTIME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO curexpiredtime(Timestamp curExpiredTime) {
        this.setCurExpiredTime(curExpiredTime);
        return this;
    }

    @JsonProperty(value="exp")
    public void setExp(BigDecimal exp) {
        this._set(DTOFIELD_EXP, exp);
    }

    @JsonIgnore
    public BigDecimal getExp() {
        Object objValue = this._get(DTOFIELD_EXP);
        if (objValue == null) return null;
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isExpDirty() {
        return this._contains(DTOFIELD_EXP);
    }

    @JsonIgnore
    public void resetExp() {
        this._reset(DTOFIELD_EXP);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO exp(BigDecimal exp) {
        this.setExp(exp);
        return this;
    }

    @JsonProperty(value="exp2")
    public void setExp2(BigDecimal exp2) {
        this._set(DTOFIELD_EXP2, exp2);
    }

    @JsonIgnore
    public BigDecimal getExp2() {
        Object objValue = this._get(DTOFIELD_EXP2);
        if (objValue == null) return null;
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isExp2Dirty() {
        return this._contains(DTOFIELD_EXP2);
    }

    @JsonIgnore
    public void resetExp2() {
        this._reset(DTOFIELD_EXP2);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO exp2(BigDecimal exp2) {
        this.setExp2(exp2);
        return this;
    }

    @JsonProperty(value="expiredtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpiredTime(Timestamp expiredTime) {
        this._set(DTOFIELD_EXPIREDTIME, expiredTime);
    }

    @JsonIgnore
    public Timestamp getExpiredTime() {
        Object objValue = this._get(DTOFIELD_EXPIREDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpiredTimeDirty() {
        return this._contains(DTOFIELD_EXPIREDTIME);
    }

    @JsonIgnore
    public void resetExpiredTime() {
        this._reset(DTOFIELD_EXPIREDTIME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO expiredtime(Timestamp expiredTime) {
        this.setExpiredTime(expiredTime);
        return this;
    }

    @JsonProperty(value="ipaddrs")
    public void setIPAddrs(String iPAddrs) {
        this._set(DTOFIELD_IPADDRS, iPAddrs);
    }

    @JsonIgnore
    public String getIPAddrs() {
        Object objValue = this._get(DTOFIELD_IPADDRS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIPAddrsDirty() {
        return this._contains(DTOFIELD_IPADDRS);
    }

    @JsonIgnore
    public void resetIPAddrs() {
        this._reset(DTOFIELD_IPADDRS);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO ipaddrs(String iPAddrs) {
        this.setIPAddrs(iPAddrs);
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
    public PSDCWorkspaceDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcworkspaceid")
    public void setPSDCWorkspaceId(String pSDCWorkspaceId) {
        this._set(DTOFIELD_PSDCWORKSPACEID, pSDCWorkspaceId);
    }

    @JsonIgnore
    public String getPSDCWorkspaceId() {
        Object objValue = this._get(DTOFIELD_PSDCWORKSPACEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCWorkspaceIdDirty() {
        return this._contains(DTOFIELD_PSDCWORKSPACEID);
    }

    @JsonIgnore
    public void resetPSDCWorkspaceId() {
        this._reset(DTOFIELD_PSDCWORKSPACEID);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdcworkspaceid(String pSDCWorkspaceId) {
        this.setPSDCWorkspaceId(pSDCWorkspaceId);
        return this;
    }

    @JsonProperty(value="psdcworkspacename")
    public void setPSDCWorkspaceName(String pSDCWorkspaceName) {
        this._set(DTOFIELD_PSDCWORKSPACENAME, pSDCWorkspaceName);
    }

    @JsonIgnore
    public String getPSDCWorkspaceName() {
        Object objValue = this._get(DTOFIELD_PSDCWORKSPACENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCWorkspaceNameDirty() {
        return this._contains(DTOFIELD_PSDCWORKSPACENAME);
    }

    @JsonIgnore
    public void resetPSDCWorkspaceName() {
        this._reset(DTOFIELD_PSDCWORKSPACENAME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdcworkspacename(String pSDCWorkspaceName) {
        this.setPSDCWorkspaceName(pSDCWorkspaceName);
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
    public PSDCWorkspaceDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCWorkspaceDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
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
    public PSDCWorkspaceDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
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
    public PSDCWorkspaceDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psworkspaceid")
    public void setPSWorkspaceId(String pSWorkspaceId) {
        this._set(DTOFIELD_PSWORKSPACEID, pSWorkspaceId);
    }

    @JsonIgnore
    public String getPSWorkspaceId() {
        Object objValue = this._get(DTOFIELD_PSWORKSPACEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkspaceIdDirty() {
        return this._contains(DTOFIELD_PSWORKSPACEID);
    }

    @JsonIgnore
    public void resetPSWorkspaceId() {
        this._reset(DTOFIELD_PSWORKSPACEID);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psworkspaceid(String pSWorkspaceId) {
        this.setPSWorkspaceId(pSWorkspaceId);
        return this;
    }

    @JsonProperty(value="psworkspacename")
    public void setPSWorkspaceName(String pSWorkspaceName) {
        this._set(DTOFIELD_PSWORKSPACENAME, pSWorkspaceName);
    }

    @JsonIgnore
    public String getPSWorkspaceName() {
        Object objValue = this._get(DTOFIELD_PSWORKSPACENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkspaceNameDirty() {
        return this._contains(DTOFIELD_PSWORKSPACENAME);
    }

    @JsonIgnore
    public void resetPSWorkspaceName() {
        this._reset(DTOFIELD_PSWORKSPACENAME);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO psworkspacename(String pSWorkspaceName) {
        this.setPSWorkspaceName(pSWorkspaceName);
        return this;
    }

    @JsonProperty(value="resstate")
    public void setResState(Integer resState) {
        this._set(DTOFIELD_RESSTATE, resState);
    }

    @JsonIgnore
    public Integer getResState() {
        Object objValue = this._get(DTOFIELD_RESSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResStateDirty() {
        return this._contains(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public void resetResState() {
        this._reset(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCWorkspaceDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
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
    public PSDCWorkspaceDTO updatedate(Timestamp updateDate) {
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
    public PSDCWorkspaceDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="workspacelevel")
    public void setWorkspaceLevel(Integer workspaceLevel) {
        this._set(DTOFIELD_WORKSPACELEVEL, workspaceLevel);
    }

    @JsonIgnore
    public Integer getWorkspaceLevel() {
        Object objValue = this._get(DTOFIELD_WORKSPACELEVEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWorkspaceLevelDirty() {
        return this._contains(DTOFIELD_WORKSPACELEVEL);
    }

    @JsonIgnore
    public void resetWorkspaceLevel() {
        this._reset(DTOFIELD_WORKSPACELEVEL);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO workspacelevel(Integer workspaceLevel) {
        this.setWorkspaceLevel(workspaceLevel);
        return this;
    }

    @JsonProperty(value="workspacestate")
    public void setWorkspaceState(Integer workspaceState) {
        this._set(DTOFIELD_WORKSPACESTATE, workspaceState);
    }

    @JsonIgnore
    public Integer getWorkspaceState() {
        Object objValue = this._get(DTOFIELD_WORKSPACESTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWorkspaceStateDirty() {
        return this._contains(DTOFIELD_WORKSPACESTATE);
    }

    @JsonIgnore
    public void resetWorkspaceState() {
        this._reset(DTOFIELD_WORKSPACESTATE);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO workspacestate(Integer workspaceState) {
        this.setWorkspaceState(workspaceState);
        return this;
    }

    @JsonProperty(value="workspacetype")
    public void setWorkspaceType(String workspaceType) {
        this._set(DTOFIELD_WORKSPACETYPE, workspaceType);
    }

    @JsonIgnore
    public String getWorkspaceType() {
        Object objValue = this._get(DTOFIELD_WORKSPACETYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkspaceTypeDirty() {
        return this._contains(DTOFIELD_WORKSPACETYPE);
    }

    @JsonIgnore
    public void resetWorkspaceType() {
        this._reset(DTOFIELD_WORKSPACETYPE);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO workspacetype(String workspaceType) {
        this.setWorkspaceType(workspaceType);
        return this;
    }

    @JsonProperty(value="workspaceupdatedate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setWorkspaceUpdateDate(Timestamp workspaceUpdateDate) {
        this._set(DTOFIELD_WORKSPACEUPDATEDATE, workspaceUpdateDate);
    }

    @JsonIgnore
    public Timestamp getWorkspaceUpdateDate() {
        Object objValue = this._get(DTOFIELD_WORKSPACEUPDATEDATE);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isWorkspaceUpdateDateDirty() {
        return this._contains(DTOFIELD_WORKSPACEUPDATEDATE);
    }

    @JsonIgnore
    public void resetWorkspaceUpdateDate() {
        this._reset(DTOFIELD_WORKSPACEUPDATEDATE);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO workspaceupdatedate(Timestamp workspaceUpdateDate) {
        this.setWorkspaceUpdateDate(workspaceUpdateDate);
        return this;
    }

    @JsonProperty(value="workspaceusage")
    public void setWorkspaceUsage(String workspaceUsage) {
        this._set(DTOFIELD_WORKSPACEUSAGE, workspaceUsage);
    }

    @JsonIgnore
    public String getWorkspaceUsage() {
        Object objValue = this._get(DTOFIELD_WORKSPACEUSAGE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkspaceUsageDirty() {
        return this._contains(DTOFIELD_WORKSPACEUSAGE);
    }

    @JsonIgnore
    public void resetWorkspaceUsage() {
        this._reset(DTOFIELD_WORKSPACEUSAGE);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO workspaceusage(String workspaceUsage) {
        this.setWorkspaceUsage(workspaceUsage);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCWorkspaceName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCWorkspaceName(strName);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO name(String strName) {
        this.setPSDCWorkspaceName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCWorkspaceId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCWorkspaceId(strValue);
    }

    @JsonIgnore
    public PSDCWorkspaceDTO id(String strValue) {
        this.setPSDCWorkspaceId(strValue);
        return this;
    }

}
