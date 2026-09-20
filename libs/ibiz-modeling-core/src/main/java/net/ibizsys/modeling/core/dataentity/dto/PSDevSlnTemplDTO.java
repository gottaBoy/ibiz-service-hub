package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnTemplDTO extends PSModelDTOBase {
    public static final String FIELD_ACTIONOWNER = "ACTIONOWNER";
    protected static final String DTOFIELD_ACTIONOWNER = "actionowner";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CURACTION = "CURACTION";
    protected static final String DTOFIELD_CURACTION = "curaction";
    public static final String FIELD_DEVTEMPLSTATE = "DEVTEMPLSTATE";
    protected static final String DTOFIELD_DEVTEMPLSTATE = "devtemplstate";
    public static final String FIELD_ENABLEREF = "ENABLEREF";
    protected static final String DTOFIELD_ENABLEREF = "enableref";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_GITBRANCH = "GITBRANCH";
    protected static final String DTOFIELD_GITBRANCH = "gitbranch";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_LASTACTIVETIME = "LASTACTIVETIME";
    protected static final String DTOFIELD_LASTACTIVETIME = "lastactivetime";
    public static final String FIELD_LASTPUBDATE = "LASTPUBDATE";
    protected static final String DTOFIELD_LASTPUBDATE = "lastpubdate";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAINPSDEVSLNTEMPLID = "MAINPSDEVSLNTEMPLID";
    protected static final String DTOFIELD_MAINPSDEVSLNTEMPLID = "mainpsdevslntemplid";
    public static final String FIELD_MAINPSDEVSLNTEMPLNAME = "MAINPSDEVSLNTEMPLNAME";
    protected static final String DTOFIELD_MAINPSDEVSLNTEMPLNAME = "mainpsdevslntemplname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PKGPARAM = "PKGPARAM";
    protected static final String DTOFIELD_PKGPARAM = "pkgparam";
    public static final String FIELD_PKGPARAM2 = "PKGPARAM2";
    protected static final String DTOFIELD_PKGPARAM2 = "pkgparam2";
    public static final String FIELD_PKGPARAM3 = "PKGPARAM3";
    protected static final String DTOFIELD_PKGPARAM3 = "pkgparam3";
    public static final String FIELD_PKGPARAM4 = "PKGPARAM4";
    protected static final String DTOFIELD_PKGPARAM4 = "pkgparam4";
    public static final String FIELD_PPSDEVSLNTEMPLID = "PPSDEVSLNTEMPLID";
    protected static final String DTOFIELD_PPSDEVSLNTEMPLID = "ppsdevslntemplid";
    public static final String FIELD_PPSDEVSLNTEMPLNAME = "PPSDEVSLNTEMPLNAME";
    protected static final String DTOFIELD_PPSDEVSLNTEMPLNAME = "ppsdevslntemplname";
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
    public static final String FIELD_PSDEVSLNSYSAPPID = "PSDEVSLNSYSAPPID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPID = "psdevslnsysappid";
    public static final String FIELD_PSDEVSLNSYSAPPNAME = "PSDEVSLNSYSAPPNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPNAME = "psdevslnsysappname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSSRVID = "PSDEVSLNSYSSRVID";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";
    public static final String FIELD_PSDEVSLNSYSSRVNAME = "PSDEVSLNSYSSRVNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";
    public static final String FIELD_PSDEVSLNTEMPLID = "PSDEVSLNTEMPLID";
    protected static final String DTOFIELD_PSDEVSLNTEMPLID = "psdevslntemplid";
    public static final String FIELD_PSDEVSLNTEMPLNAME = "PSDEVSLNTEMPLNAME";
    protected static final String DTOFIELD_PSDEVSLNTEMPLNAME = "psdevslntemplname";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFSTYLEID = "PSPFSTYLEID";
    protected static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    public static final String FIELD_PSPFSTYLENAME = "PSPFSTYLENAME";
    protected static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSFSTYLENAME = "PSSFSTYLENAME";
    protected static final String DTOFIELD_PSSFSTYLENAME = "pssfstylename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_REFCODE = "REFCODE";
    protected static final String DTOFIELD_REFCODE = "refcode";
    public static final String FIELD_STYLECODE = "STYLECODE";
    protected static final String DTOFIELD_STYLECODE = "stylecode";
    public static final String FIELD_STYLEENGINE = "STYLEENGINE";
    protected static final String DTOFIELD_STYLEENGINE = "styleengine";
    public static final String FIELD_TEMPLMDURL = "TEMPLMDURL";
    protected static final String DTOFIELD_TEMPLMDURL = "templmdurl";
    public static final String FIELD_TEMPLPARAMS = "TEMPLPARAMS";
    protected static final String DTOFIELD_TEMPLPARAMS = "templparams";
    public static final String FIELD_TEMPLPSPFSTYLEID = "TEMPLPSPFSTYLEID";
    protected static final String DTOFIELD_TEMPLPSPFSTYLEID = "templpspfstyleid";
    public static final String FIELD_TEMPLPSPFSTYLENAME = "TEMPLPSPFSTYLENAME";
    protected static final String DTOFIELD_TEMPLPSPFSTYLENAME = "templpspfstylename";
    public static final String FIELD_TEMPLPSSFSTYLEID = "TEMPLPSSFSTYLEID";
    protected static final String DTOFIELD_TEMPLPSSFSTYLEID = "templpssfstyleid";
    public static final String FIELD_TEMPLPSSFSTYLENAME = "TEMPLPSSFSTYLENAME";
    protected static final String DTOFIELD_TEMPLPSSFSTYLENAME = "templpssfstylename";
    public static final String FIELD_TEMPLTAG = "TEMPLTAG";
    protected static final String DTOFIELD_TEMPLTAG = "templtag";
    public static final String FIELD_TEMPLTAG2 = "TEMPLTAG2";
    protected static final String DTOFIELD_TEMPLTAG2 = "templtag2";
    public static final String FIELD_TEMPLTYPE = "TEMPLTYPE";
    protected static final String DTOFIELD_TEMPLTYPE = "templtype";
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
    public static final String FIELD_V2GITPATH = "V2GITPATH";
    protected static final String DTOFIELD_V2GITPATH = "v2gitpath";
    public static final String FIELD_VCTYPE = "VCTYPE";
    protected static final String DTOFIELD_VCTYPE = "vctype";
    public static final String FIELD_VERSTR = "VERSTR";
    protected static final String DTOFIELD_VERSTR = "verstr";

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
    public PSDevSlnTemplDTO actionowner(String actionOwner) {
        this.setActionOwner(actionOwner);
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
    public PSDevSlnTemplDTO createdate(Timestamp createDate) {
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
    public PSDevSlnTemplDTO createman(String createMan) {
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
    public PSDevSlnTemplDTO curaction(String curAction) {
        this.setCurAction(curAction);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO curaction(PSModelEnums.DevSysAction curAction) {
        this.setCurAction(curAction == null ? null : curAction.value);
        return this;
    }

    @JsonProperty(value="devtemplstate")
    public void setDevTemplState(Integer devTemplState) {
        this._set(DTOFIELD_DEVTEMPLSTATE, devTemplState);
    }

    @JsonIgnore
    public Integer getDevTemplState() {
        Object objValue = this._get(DTOFIELD_DEVTEMPLSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDevTemplStateDirty() {
        return this._contains(DTOFIELD_DEVTEMPLSTATE);
    }

    @JsonIgnore
    public void resetDevTemplState() {
        this._reset(DTOFIELD_DEVTEMPLSTATE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO devtemplstate(Integer devTemplState) {
        this.setDevTemplState(devTemplState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO devtemplstate(PSModelEnums.DevSysState devTemplState) {
        this.setDevTemplState(devTemplState == null ? null : devTemplState.value);
        return this;
    }

    @JsonProperty(value="enableref")
    public void setEnableRef(Integer enableRef) {
        this._set(DTOFIELD_ENABLEREF, enableRef);
    }

    @JsonIgnore
    public Integer getEnableRef() {
        Object objValue = this._get(DTOFIELD_ENABLEREF);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableRefDirty() {
        return this._contains(DTOFIELD_ENABLEREF);
    }

    @JsonIgnore
    public void resetEnableRef() {
        this._reset(DTOFIELD_ENABLEREF);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO enableref(Integer enableRef) {
        this.setEnableRef(enableRef);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO enableref(Boolean enableRef) {
        this.setEnableRef(enableRef == null ? null : (enableRef ? 1 : 0));
        return this;
    }

    @JsonProperty(value="expriedtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpriedTime(Timestamp expriedTime) {
        this._set(DTOFIELD_EXPRIEDTIME, expriedTime);
    }

    @JsonIgnore
    public Timestamp getExpriedTime() {
        Object objValue = this._get(DTOFIELD_EXPRIEDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpriedTimeDirty() {
        return this._contains(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public void resetExpriedTime() {
        this._reset(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="gitbranch")
    public void setGitBranch(String gitBranch) {
        this._set(DTOFIELD_GITBRANCH, gitBranch);
    }

    @JsonIgnore
    public String getGitBranch() {
        Object objValue = this._get(DTOFIELD_GITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitBranchDirty() {
        return this._contains(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public void resetGitBranch() {
        this._reset(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO gitbranch(String gitBranch) {
        this.setGitBranch(gitBranch);
        return this;
    }

    @JsonProperty(value="gitpath")
    public void setGitPath(String gitPath) {
        this._set(DTOFIELD_GITPATH, gitPath);
    }

    @JsonIgnore
    public String getGitPath() {
        Object objValue = this._get(DTOFIELD_GITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitPathDirty() {
        return this._contains(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public void resetGitPath() {
        this._reset(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO gitpath(String gitPath) {
        this.setGitPath(gitPath);
        return this;
    }

    @JsonProperty(value="lastactivetime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastActiveTime(Timestamp lastActiveTime) {
        this._set(DTOFIELD_LASTACTIVETIME, lastActiveTime);
    }

    @JsonIgnore
    public Timestamp getLastActiveTime() {
        Object objValue = this._get(DTOFIELD_LASTACTIVETIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastActiveTimeDirty() {
        return this._contains(DTOFIELD_LASTACTIVETIME);
    }

    @JsonIgnore
    public void resetLastActiveTime() {
        this._reset(DTOFIELD_LASTACTIVETIME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO lastactivetime(Timestamp lastActiveTime) {
        this.setLastActiveTime(lastActiveTime);
        return this;
    }

    @JsonProperty(value="lastpubdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastPubDate(Timestamp lastPubDate) {
        this._set(DTOFIELD_LASTPUBDATE, lastPubDate);
    }

    @JsonIgnore
    public Timestamp getLastPubDate() {
        Object objValue = this._get(DTOFIELD_LASTPUBDATE);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastPubDateDirty() {
        return this._contains(DTOFIELD_LASTPUBDATE);
    }

    @JsonIgnore
    public void resetLastPubDate() {
        this._reset(DTOFIELD_LASTPUBDATE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO lastpubdate(Timestamp lastPubDate) {
        this.setLastPubDate(lastPubDate);
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
    public PSDevSlnTemplDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="mainpsdevslntemplid")
    public void setMainPSDevSlnTemplId(String mainPSDevSlnTemplId) {
        this._set(DTOFIELD_MAINPSDEVSLNTEMPLID, mainPSDevSlnTemplId);
    }

    @JsonIgnore
    public String getMainPSDevSlnTemplId() {
        Object objValue = this._get(DTOFIELD_MAINPSDEVSLNTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSDevSlnTemplIdDirty() {
        return this._contains(DTOFIELD_MAINPSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public void resetMainPSDevSlnTemplId() {
        this._reset(DTOFIELD_MAINPSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO mainpsdevslntemplid(String mainPSDevSlnTemplId) {
        this.setMainPSDevSlnTemplId(mainPSDevSlnTemplId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO mainpsdevslntemplid(PSDevSlnTemplDTO pSDevSlnTempl) {
        if (pSDevSlnTempl == null) {
            this.setMainPSDevSlnTemplId(null);
            this.setMainPSDevSlnTemplName(null);
        } else {
            this.setMainPSDevSlnTemplId(pSDevSlnTempl.getPSDevSlnTemplId());
            this.setMainPSDevSlnTemplName(pSDevSlnTempl.getPSDevSlnTemplName());
        }
        return this;
    }

    @JsonProperty(value="mainpsdevslntemplname")
    public void setMainPSDevSlnTemplName(String mainPSDevSlnTemplName) {
        this._set(DTOFIELD_MAINPSDEVSLNTEMPLNAME, mainPSDevSlnTemplName);
    }

    @JsonIgnore
    public String getMainPSDevSlnTemplName() {
        Object objValue = this._get(DTOFIELD_MAINPSDEVSLNTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSDevSlnTemplNameDirty() {
        return this._contains(DTOFIELD_MAINPSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public void resetMainPSDevSlnTemplName() {
        this._reset(DTOFIELD_MAINPSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO mainpsdevslntemplname(String mainPSDevSlnTemplName) {
        this.setMainPSDevSlnTemplName(mainPSDevSlnTemplName);
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
    public PSDevSlnTemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pkgparam")
    public void setPkgParam(String pkgParam) {
        this._set(DTOFIELD_PKGPARAM, pkgParam);
    }

    @JsonIgnore
    public String getPkgParam() {
        Object objValue = this._get(DTOFIELD_PKGPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParamDirty() {
        return this._contains(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public void resetPkgParam() {
        this._reset(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pkgparam(String pkgParam) {
        this.setPkgParam(pkgParam);
        return this;
    }

    @JsonProperty(value="pkgparam2")
    public void setPkgParam2(String pkgParam2) {
        this._set(DTOFIELD_PKGPARAM2, pkgParam2);
    }

    @JsonIgnore
    public String getPkgParam2() {
        Object objValue = this._get(DTOFIELD_PKGPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam2Dirty() {
        return this._contains(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public void resetPkgParam2() {
        this._reset(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pkgparam2(String pkgParam2) {
        this.setPkgParam2(pkgParam2);
        return this;
    }

    @JsonProperty(value="pkgparam3")
    public void setPkgParam3(String pkgParam3) {
        this._set(DTOFIELD_PKGPARAM3, pkgParam3);
    }

    @JsonIgnore
    public String getPkgParam3() {
        Object objValue = this._get(DTOFIELD_PKGPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam3Dirty() {
        return this._contains(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public void resetPkgParam3() {
        this._reset(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pkgparam3(String pkgParam3) {
        this.setPkgParam3(pkgParam3);
        return this;
    }

    @JsonProperty(value="pkgparam4")
    public void setPkgParam4(String pkgParam4) {
        this._set(DTOFIELD_PKGPARAM4, pkgParam4);
    }

    @JsonIgnore
    public String getPkgParam4() {
        Object objValue = this._get(DTOFIELD_PKGPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam4Dirty() {
        return this._contains(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public void resetPkgParam4() {
        this._reset(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pkgparam4(String pkgParam4) {
        this.setPkgParam4(pkgParam4);
        return this;
    }

    @JsonProperty(value="ppsdevslntemplid")
    public void setPPSDevSlnTemplId(String pPSDevSlnTemplId) {
        this._set(DTOFIELD_PPSDEVSLNTEMPLID, pPSDevSlnTemplId);
    }

    @JsonIgnore
    public String getPPSDevSlnTemplId() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnTemplIdDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public void resetPPSDevSlnTemplId() {
        this._reset(DTOFIELD_PPSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO ppsdevslntemplid(String pPSDevSlnTemplId) {
        this.setPPSDevSlnTemplId(pPSDevSlnTemplId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO ppsdevslntemplid(PSDevSlnTemplDTO pSDevSlnTempl) {
        if (pSDevSlnTempl == null) {
            this.setPPSDevSlnTemplId(null);
            this.setPPSDevSlnTemplName(null);
        } else {
            this.setPPSDevSlnTemplId(pSDevSlnTempl.getPSDevSlnTemplId());
            this.setPPSDevSlnTemplName(pSDevSlnTempl.getPSDevSlnTemplName());
        }
        return this;
    }

    @JsonProperty(value="ppsdevslntemplname")
    public void setPPSDevSlnTemplName(String pPSDevSlnTemplName) {
        this._set(DTOFIELD_PPSDEVSLNTEMPLNAME, pPSDevSlnTemplName);
    }

    @JsonIgnore
    public String getPPSDevSlnTemplName() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnTemplNameDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public void resetPPSDevSlnTemplName() {
        this._reset(DTOFIELD_PPSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO ppsdevslntemplname(String pPSDevSlnTemplName) {
        this.setPPSDevSlnTemplName(pPSDevSlnTemplName);
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
    public PSDevSlnTemplDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
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
    public PSDevSlnTemplDTO psdevcentername(String pSDevCenterName) {
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
    public PSDevSlnTemplDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setGitBranch(null);
            this.setGitPath(null);
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setGitBranch(pSDevCenterSVN.getGitBranch());
            this.setGitPath(pSDevCenterSVN.getGitPath());
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
    public PSDevSlnTemplDTO psdevcentersvnname(String pSDevCenterSVNName) {
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
    public PSDevSlnTemplDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevCenterId(pSDevSln.getPSDevCenterId());
            this.setPSDevCenterName(pSDevSln.getPSDevCenterName());
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
    public PSDevSlnTemplDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysappid")
    public void setPSDevSlnSysAppId(String pSDevSlnSysAppId) {
        this._set(DTOFIELD_PSDEVSLNSYSAPPID, pSDevSlnSysAppId);
    }

    @JsonIgnore
    public String getPSDevSlnSysAppId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPPID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAppIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPPID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAppId() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPPID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsysappid(String pSDevSlnSysAppId) {
        this.setPSDevSlnSysAppId(pSDevSlnSysAppId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsysappid(PSDevSlnSysAppDTO pSDevSlnSysApp) {
        if (pSDevSlnSysApp == null) {
            this.setPSDevSlnSysAppId(null);
            this.setPSDevSlnSysAppName(null);
        } else {
            this.setPSDevSlnSysAppId(pSDevSlnSysApp.getPSDevSlnSysAppId());
            this.setPSDevSlnSysAppName(pSDevSlnSysApp.getPSDevSlnSysAppName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysappname")
    public void setPSDevSlnSysAppName(String pSDevSlnSysAppName) {
        this._set(DTOFIELD_PSDEVSLNSYSAPPNAME, pSDevSlnSysAppName);
    }

    @JsonIgnore
    public String getPSDevSlnSysAppName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSAPPNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysAppNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysAppName() {
        this._reset(DTOFIELD_PSDEVSLNSYSAPPNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsysappname(String pSDevSlnSysAppName) {
        this.setPSDevSlnSysAppName(pSDevSlnSysAppName);
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
    public PSDevSlnTemplDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDevSlnTemplDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvid")
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvId() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsyssrvid(String pSDevSlnSysSrvId) {
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsyssrvid(PSDevSlnSysSrvDTO pSDevSlnSysSrv) {
        if (pSDevSlnSysSrv == null) {
            this.setPSDevSlnSysSrvId(null);
            this.setPSDevSlnSysSrvName(null);
        } else {
            this.setPSDevSlnSysSrvId(pSDevSlnSysSrv.getPSDevSlnSysSrvId());
            this.setPSDevSlnSysSrvName(pSDevSlnSysSrv.getPSDevSlnSysSrvName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvname")
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvName() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnsyssrvname(String pSDevSlnSysSrvName) {
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    @JsonProperty(value="psdevslntemplid")
    public void setPSDevSlnTemplId(String pSDevSlnTemplId) {
        this._set(DTOFIELD_PSDEVSLNTEMPLID, pSDevSlnTemplId);
    }

    @JsonIgnore
    public String getPSDevSlnTemplId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplId() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslntemplid(String pSDevSlnTemplId) {
        this.setPSDevSlnTemplId(pSDevSlnTemplId);
        return this;
    }

    @JsonProperty(value="psdevslntemplname")
    public void setPSDevSlnTemplName(String pSDevSlnTemplName) {
        this._set(DTOFIELD_PSDEVSLNTEMPLNAME, pSDevSlnTemplName);
    }

    @JsonIgnore
    public String getPSDevSlnTemplName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplName() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO psdevslntemplname(String pSDevSlnTemplName) {
        this.setPSDevSlnTemplName(pSDevSlnTemplName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) return null;
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
    public PSDevSlnTemplDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pspfid(PSPFDTO pSPF) {
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
        if (objValue == null) return null;
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
    public PSDevSlnTemplDTO pspfname(String pSPFName) {
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
        if (objValue == null) return null;
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
    public PSDevSlnTemplDTO pspfstyleid(String pSPFStyleId) {
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pspfstyleid(PSPFStyleDTO pSPFStyle) {
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
        if (objValue == null) return null;
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
    public PSDevSlnTemplDTO pspfstylename(String pSPFStyleName) {
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="pssfstyleid")
    public void setPSSFStyleId(String pSSFStyleId) {
        this._set(DTOFIELD_PSSFSTYLEID, pSSFStyleId);
    }

    @JsonIgnore
    public String getPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public void resetPSSFStyleId() {
        this._reset(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setPSSFStyleId(null);
            this.setPSSFStyleName(null);
        } else {
            this.setPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="pssfstylename")
    public void setPSSFStyleName(String pSSFStyleName) {
        this._set(DTOFIELD_PSSFSTYLENAME, pSSFStyleName);
    }

    @JsonIgnore
    public String getPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSSFStyleName() {
        this._reset(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pssfstylename(String pSSFStyleName) {
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    @JsonProperty(value="pubmode")
    public void setPubMode(Integer pubMode) {
        this._set(DTOFIELD_PUBMODE, pubMode);
    }

    @JsonIgnore
    public Integer getPubMode() {
        Object objValue = this._get(DTOFIELD_PUBMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubModeDirty() {
        return this._contains(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public void resetPubMode() {
        this._reset(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO pubmode(PSModelEnums.PublicMode pubMode) {
        this.setPubMode(pubMode == null ? null : pubMode.value);
        return this;
    }

    @JsonProperty(value="refcode")
    public void setRefCode(String refCode) {
        this._set(DTOFIELD_REFCODE, refCode);
    }

    @JsonIgnore
    public String getRefCode() {
        Object objValue = this._get(DTOFIELD_REFCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCodeDirty() {
        return this._contains(DTOFIELD_REFCODE);
    }

    @JsonIgnore
    public void resetRefCode() {
        this._reset(DTOFIELD_REFCODE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO refcode(String refCode) {
        this.setRefCode(refCode);
        return this;
    }

    @JsonProperty(value="stylecode")
    public void setStyleCode(String styleCode) {
        this._set(DTOFIELD_STYLECODE, styleCode);
    }

    @JsonIgnore
    public String getStyleCode() {
        Object objValue = this._get(DTOFIELD_STYLECODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleCodeDirty() {
        return this._contains(DTOFIELD_STYLECODE);
    }

    @JsonIgnore
    public void resetStyleCode() {
        this._reset(DTOFIELD_STYLECODE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO stylecode(String styleCode) {
        this.setStyleCode(styleCode);
        return this;
    }

    @JsonProperty(value="styleengine")
    public void setStyleEngine(String styleEngine) {
        this._set(DTOFIELD_STYLEENGINE, styleEngine);
    }

    @JsonIgnore
    public String getStyleEngine() {
        Object objValue = this._get(DTOFIELD_STYLEENGINE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleEngineDirty() {
        return this._contains(DTOFIELD_STYLEENGINE);
    }

    @JsonIgnore
    public void resetStyleEngine() {
        this._reset(DTOFIELD_STYLEENGINE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO styleengine(String styleEngine) {
        this.setStyleEngine(styleEngine);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO styleengine(PSModelEnums.PSTemplEngine styleEngine) {
        this.setStyleEngine(styleEngine == null ? null : styleEngine.value);
        return this;
    }

    @JsonProperty(value="templmdurl")
    public void setTemplMDUrl(String templMDUrl) {
        this._set(DTOFIELD_TEMPLMDURL, templMDUrl);
    }

    @JsonIgnore
    public String getTemplMDUrl() {
        Object objValue = this._get(DTOFIELD_TEMPLMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplMDUrlDirty() {
        return this._contains(DTOFIELD_TEMPLMDURL);
    }

    @JsonIgnore
    public void resetTemplMDUrl() {
        this._reset(DTOFIELD_TEMPLMDURL);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templmdurl(String templMDUrl) {
        this.setTemplMDUrl(templMDUrl);
        return this;
    }

    @JsonProperty(value="templparams")
    public void setTemplParams(String templParams) {
        this._set(DTOFIELD_TEMPLPARAMS, templParams);
    }

    @JsonIgnore
    public String getTemplParams() {
        Object objValue = this._get(DTOFIELD_TEMPLPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplParamsDirty() {
        return this._contains(DTOFIELD_TEMPLPARAMS);
    }

    @JsonIgnore
    public void resetTemplParams() {
        this._reset(DTOFIELD_TEMPLPARAMS);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templparams(String templParams) {
        this.setTemplParams(templParams);
        return this;
    }

    @JsonProperty(value="templpspfstyleid")
    public void setTemplPSPFStyleId(String templPSPFStyleId) {
        this._set(DTOFIELD_TEMPLPSPFSTYLEID, templPSPFStyleId);
    }

    @JsonIgnore
    public String getTemplPSPFStyleId() {
        Object objValue = this._get(DTOFIELD_TEMPLPSPFSTYLEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSPFStyleIdDirty() {
        return this._contains(DTOFIELD_TEMPLPSPFSTYLEID);
    }

    @JsonIgnore
    public void resetTemplPSPFStyleId() {
        this._reset(DTOFIELD_TEMPLPSPFSTYLEID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpspfstyleid(String templPSPFStyleId) {
        this.setTemplPSPFStyleId(templPSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpspfstyleid(PSPFStyleDTO pSPFStyle) {
        if (pSPFStyle == null) {
            this.setTemplPSPFStyleId(null);
            this.setTemplPSPFStyleName(null);
        } else {
            this.setTemplPSPFStyleId(pSPFStyle.getPSPFStyleId());
            this.setTemplPSPFStyleName(pSPFStyle.getPSPFStyleName());
        }
        return this;
    }

    @JsonProperty(value="templpspfstylename")
    public void setTemplPSPFStyleName(String templPSPFStyleName) {
        this._set(DTOFIELD_TEMPLPSPFSTYLENAME, templPSPFStyleName);
    }

    @JsonIgnore
    public String getTemplPSPFStyleName() {
        Object objValue = this._get(DTOFIELD_TEMPLPSPFSTYLENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSPFStyleNameDirty() {
        return this._contains(DTOFIELD_TEMPLPSPFSTYLENAME);
    }

    @JsonIgnore
    public void resetTemplPSPFStyleName() {
        this._reset(DTOFIELD_TEMPLPSPFSTYLENAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpspfstylename(String templPSPFStyleName) {
        this.setTemplPSPFStyleName(templPSPFStyleName);
        return this;
    }

    @JsonProperty(value="templpssfstyleid")
    public void setTemplPSSFStyleId(String templPSSFStyleId) {
        this._set(DTOFIELD_TEMPLPSSFSTYLEID, templPSSFStyleId);
    }

    @JsonIgnore
    public String getTemplPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_TEMPLPSSFSTYLEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_TEMPLPSSFSTYLEID);
    }

    @JsonIgnore
    public void resetTemplPSSFStyleId() {
        this._reset(DTOFIELD_TEMPLPSSFSTYLEID);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpssfstyleid(String templPSSFStyleId) {
        this.setTemplPSSFStyleId(templPSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setTemplPSSFStyleId(null);
            this.setTemplPSSFStyleName(null);
        } else {
            this.setTemplPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setTemplPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="templpssfstylename")
    public void setTemplPSSFStyleName(String templPSSFStyleName) {
        this._set(DTOFIELD_TEMPLPSSFSTYLENAME, templPSSFStyleName);
    }

    @JsonIgnore
    public String getTemplPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_TEMPLPSSFSTYLENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_TEMPLPSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetTemplPSSFStyleName() {
        this._reset(DTOFIELD_TEMPLPSSFSTYLENAME);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templpssfstylename(String templPSSFStyleName) {
        this.setTemplPSSFStyleName(templPSSFStyleName);
        return this;
    }

    @JsonProperty(value="templtag")
    public void setTemplTag(String templTag) {
        this._set(DTOFIELD_TEMPLTAG, templTag);
    }

    @JsonIgnore
    public String getTemplTag() {
        Object objValue = this._get(DTOFIELD_TEMPLTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTagDirty() {
        return this._contains(DTOFIELD_TEMPLTAG);
    }

    @JsonIgnore
    public void resetTemplTag() {
        this._reset(DTOFIELD_TEMPLTAG);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templtag(String templTag) {
        this.setTemplTag(templTag);
        return this;
    }

    @JsonProperty(value="templtag2")
    public void setTemplTag2(String templTag2) {
        this._set(DTOFIELD_TEMPLTAG2, templTag2);
    }

    @JsonIgnore
    public String getTemplTag2() {
        Object objValue = this._get(DTOFIELD_TEMPLTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTag2Dirty() {
        return this._contains(DTOFIELD_TEMPLTAG2);
    }

    @JsonIgnore
    public void resetTemplTag2() {
        this._reset(DTOFIELD_TEMPLTAG2);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templtag2(String templTag2) {
        this.setTemplTag2(templTag2);
        return this;
    }

    @JsonProperty(value="templtype")
    public void setTemplType(String templType) {
        this._set(DTOFIELD_TEMPLTYPE, templType);
    }

    @JsonIgnore
    public String getTemplType() {
        Object objValue = this._get(DTOFIELD_TEMPLTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTypeDirty() {
        return this._contains(DTOFIELD_TEMPLTYPE);
    }

    @JsonIgnore
    public void resetTemplType() {
        this._reset(DTOFIELD_TEMPLTYPE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templtype(String templType) {
        this.setTemplType(templType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO templtype(PSModelEnums.DevSlnTemplType templType) {
        this.setTemplType(templType == null ? null : templType.value);
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
    public PSDevSlnTemplDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnTemplDTO updateman(String updateMan) {
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
    public PSDevSlnTemplDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDevSlnTemplDTO usertag(String userTag) {
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
    public PSDevSlnTemplDTO usertag2(String userTag2) {
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
    public PSDevSlnTemplDTO usertag3(String userTag3) {
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
    public PSDevSlnTemplDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="v2gitpath")
    public void setV2GitPath(String v2GitPath) {
        this._set(DTOFIELD_V2GITPATH, v2GitPath);
    }

    @JsonIgnore
    public String getV2GitPath() {
        Object objValue = this._get(DTOFIELD_V2GITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2GitPathDirty() {
        return this._contains(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public void resetV2GitPath() {
        this._reset(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO v2gitpath(String v2GitPath) {
        this.setV2GitPath(v2GitPath);
        return this;
    }

    @JsonProperty(value="vctype")
    public void setVCType(String vCType) {
        this._set(DTOFIELD_VCTYPE, vCType);
    }

    @JsonIgnore
    public String getVCType() {
        Object objValue = this._get(DTOFIELD_VCTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVCTypeDirty() {
        return this._contains(DTOFIELD_VCTYPE);
    }

    @JsonIgnore
    public void resetVCType() {
        this._reset(DTOFIELD_VCTYPE);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO vctype(String vCType) {
        this.setVCType(vCType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnTemplDTO vctype(PSModelEnums.DevSlnSysVCType vCType) {
        this.setVCType(vCType == null ? null : vCType.value);
        return this;
    }

    @JsonProperty(value="verstr")
    public void setVerStr(String verStr) {
        this._set(DTOFIELD_VERSTR, verStr);
    }

    @JsonIgnore
    public String getVerStr() {
        Object objValue = this._get(DTOFIELD_VERSTR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVerStrDirty() {
        return this._contains(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public void resetVerStr() {
        this._reset(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO verstr(String verStr) {
        this.setVerStr(verStr);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnTemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnTemplName(strName);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO name(String strName) {
        this.setPSDevSlnTemplName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnTemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnTemplId(strValue);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO id(String strValue) {
        this.setPSDevSlnTemplId(strValue);
        return this;
    }

}
