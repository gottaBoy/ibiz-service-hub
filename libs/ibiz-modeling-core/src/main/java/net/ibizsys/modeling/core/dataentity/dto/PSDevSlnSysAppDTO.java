package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysAppDTO extends PSModelDTOBase {
    public static final String FIELD_APPMDURL = "APPMDURL";
    protected static final String DTOFIELD_APPMDURL = "appmdurl";
    public static final String FIELD_APPMODE = "APPMODE";
    protected static final String DTOFIELD_APPMODE = "appmode";
    public static final String FIELD_APPPKGNAME = "APPPKGNAME";
    protected static final String DTOFIELD_APPPKGNAME = "apppkgname";
    public static final String FIELD_APPSN = "APPSN";
    protected static final String DTOFIELD_APPSN = "appsn";
    public static final String FIELD_APPTAG = "APPTAG";
    protected static final String DTOFIELD_APPTAG = "apptag";
    public static final String FIELD_APPTAG2 = "APPTAG2";
    protected static final String DTOFIELD_APPTAG2 = "apptag2";
    public static final String FIELD_APPTAG3 = "APPTAG3";
    protected static final String DTOFIELD_APPTAG3 = "apptag3";
    public static final String FIELD_APPTAG4 = "APPTAG4";
    protected static final String DTOFIELD_APPTAG4 = "apptag4";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEVSYSSTATE = "DEVSYSSTATE";
    protected static final String DTOFIELD_DEVSYSSTATE = "devsysstate";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPTYPEID = "PSAPPTYPEID";
    protected static final String DTOFIELD_PSAPPTYPEID = "psapptypeid";
    public static final String FIELD_PSAPPTYPENAME = "PSAPPTYPENAME";
    protected static final String DTOFIELD_PSAPPTYPENAME = "psapptypename";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSAPPID = "PSDEVSLNSYSAPPID";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPID = "psdevslnsysappid";
    public static final String FIELD_PSDEVSLNSYSAPPNAME = "PSDEVSLNSYSAPPNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSAPPNAME = "psdevslnsysappname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFSTYLEID = "PSPFSTYLEID";
    protected static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    public static final String FIELD_PSPFSTYLENAME = "PSPFSTYLENAME";
    protected static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    public static final String FIELD_PSSTUDIOTHEMEID = "PSSTUDIOTHEMEID";
    protected static final String DTOFIELD_PSSTUDIOTHEMEID = "psstudiothemeid";
    public static final String FIELD_PSSTUDIOTHEMENAME = "PSSTUDIOTHEMENAME";
    protected static final String DTOFIELD_PSSTUDIOTHEMENAME = "psstudiothemename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_THEMECSSSTYLE = "THEMECSSSTYLE";
    protected static final String DTOFIELD_THEMECSSSTYLE = "themecssstyle";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="appmdurl")
    public void setAppMDUrl(String appMDUrl) {
        this._set(DTOFIELD_APPMDURL, appMDUrl);
    }

    @JsonIgnore
    public String getAppMDUrl() {
        Object objValue = this._get(DTOFIELD_APPMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppMDUrlDirty() {
        return this._contains(DTOFIELD_APPMDURL);
    }

    @JsonIgnore
    public void resetAppMDUrl() {
        this._reset(DTOFIELD_APPMDURL);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO appmdurl(String appMDUrl) {
        this.setAppMDUrl(appMDUrl);
        return this;
    }

    @JsonProperty(value="appmode")
    public void setAppMode(String appMode) {
        this._set(DTOFIELD_APPMODE, appMode);
    }

    @JsonIgnore
    public String getAppMode() {
        Object objValue = this._get(DTOFIELD_APPMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppModeDirty() {
        return this._contains(DTOFIELD_APPMODE);
    }

    @JsonIgnore
    public void resetAppMode() {
        this._reset(DTOFIELD_APPMODE);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO appmode(String appMode) {
        this.setAppMode(appMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO appmode(PSModelEnums.AppMode appMode) {
        this.setAppMode(appMode == null ? null : appMode.value);
        return this;
    }

    @JsonProperty(value="apppkgname")
    public void setAppPKGName(String appPKGName) {
        this._set(DTOFIELD_APPPKGNAME, appPKGName);
    }

    @JsonIgnore
    public String getAppPKGName() {
        Object objValue = this._get(DTOFIELD_APPPKGNAME);
        if (objValue == null) return null;
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
    public PSDevSlnSysAppDTO apppkgname(String appPKGName) {
        this.setAppPKGName(appPKGName);
        return this;
    }

    @JsonProperty(value="appsn")
    public void setAppSN(String appSN) {
        this._set(DTOFIELD_APPSN, appSN);
    }

    @JsonIgnore
    public String getAppSN() {
        Object objValue = this._get(DTOFIELD_APPSN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppSNDirty() {
        return this._contains(DTOFIELD_APPSN);
    }

    @JsonIgnore
    public void resetAppSN() {
        this._reset(DTOFIELD_APPSN);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO appsn(String appSN) {
        this.setAppSN(appSN);
        return this;
    }

    @JsonProperty(value="apptag")
    public void setAppTag(String appTag) {
        this._set(DTOFIELD_APPTAG, appTag);
    }

    @JsonIgnore
    public String getAppTag() {
        Object objValue = this._get(DTOFIELD_APPTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppTagDirty() {
        return this._contains(DTOFIELD_APPTAG);
    }

    @JsonIgnore
    public void resetAppTag() {
        this._reset(DTOFIELD_APPTAG);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO apptag(String appTag) {
        this.setAppTag(appTag);
        return this;
    }

    @JsonProperty(value="apptag2")
    public void setAppTag2(String appTag2) {
        this._set(DTOFIELD_APPTAG2, appTag2);
    }

    @JsonIgnore
    public String getAppTag2() {
        Object objValue = this._get(DTOFIELD_APPTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppTag2Dirty() {
        return this._contains(DTOFIELD_APPTAG2);
    }

    @JsonIgnore
    public void resetAppTag2() {
        this._reset(DTOFIELD_APPTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO apptag2(String appTag2) {
        this.setAppTag2(appTag2);
        return this;
    }

    @JsonProperty(value="apptag3")
    public void setAppTag3(String appTag3) {
        this._set(DTOFIELD_APPTAG3, appTag3);
    }

    @JsonIgnore
    public String getAppTag3() {
        Object objValue = this._get(DTOFIELD_APPTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppTag3Dirty() {
        return this._contains(DTOFIELD_APPTAG3);
    }

    @JsonIgnore
    public void resetAppTag3() {
        this._reset(DTOFIELD_APPTAG3);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO apptag3(String appTag3) {
        this.setAppTag3(appTag3);
        return this;
    }

    @JsonProperty(value="apptag4")
    public void setAppTag4(String appTag4) {
        this._set(DTOFIELD_APPTAG4, appTag4);
    }

    @JsonIgnore
    public String getAppTag4() {
        Object objValue = this._get(DTOFIELD_APPTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppTag4Dirty() {
        return this._contains(DTOFIELD_APPTAG4);
    }

    @JsonIgnore
    public void resetAppTag4() {
        this._reset(DTOFIELD_APPTAG4);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO apptag4(String appTag4) {
        this.setAppTag4(appTag4);
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
    public PSDevSlnSysAppDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysAppDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="devsysstate")
    public void setDevSysState(Integer devSysState) {
        this._set(DTOFIELD_DEVSYSSTATE, devSysState);
    }

    @JsonIgnore
    public Integer getDevSysState() {
        Object objValue = this._get(DTOFIELD_DEVSYSSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDevSysStateDirty() {
        return this._contains(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public void resetDevSysState() {
        this._reset(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO devsysstate(Integer devSysState) {
        this.setDevSysState(devSysState);
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
    public PSDevSlnSysAppDTO logicname(String logicName) {
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
    public PSDevSlnSysAppDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psapptypeid")
    public void setPSAppTypeId(String pSAppTypeId) {
        this._set(DTOFIELD_PSAPPTYPEID, pSAppTypeId);
    }

    @JsonIgnore
    public String getPSAppTypeId() {
        Object objValue = this._get(DTOFIELD_PSAPPTYPEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppTypeIdDirty() {
        return this._contains(DTOFIELD_PSAPPTYPEID);
    }

    @JsonIgnore
    public void resetPSAppTypeId() {
        this._reset(DTOFIELD_PSAPPTYPEID);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypeid(String pSAppTypeId) {
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypeid(PSAppTypeDTO pSAppType) {
        if (pSAppType == null) {
            this.setPSAppTypeId(null);
            this.setPSAppTypeName(null);
        } else {
            this.setPSAppTypeId(pSAppType.getPSAppTypeId());
            this.setPSAppTypeName(pSAppType.getPSAppTypeName());
        }
        return this;
    }

    @JsonProperty(value="psapptypename")
    public void setPSAppTypeName(String pSAppTypeName) {
        this._set(DTOFIELD_PSAPPTYPENAME, pSAppTypeName);
    }

    @JsonIgnore
    public String getPSAppTypeName() {
        Object objValue = this._get(DTOFIELD_PSAPPTYPENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppTypeNameDirty() {
        return this._contains(DTOFIELD_PSAPPTYPENAME);
    }

    @JsonIgnore
    public void resetPSAppTypeName() {
        this._reset(DTOFIELD_PSAPPTYPENAME);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psapptypename(String pSAppTypeName) {
        this.setPSAppTypeName(pSAppTypeName);
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
    public PSDevSlnSysAppDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnSysAppDTO psdevslnsysappid(String pSDevSlnSysAppId) {
        this.setPSDevSlnSysAppId(pSDevSlnSysAppId);
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
    public PSDevSlnSysAppDTO psdevslnsysappname(String pSDevSlnSysAppName) {
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
    public PSDevSlnSysAppDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setDevSysState(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setDevSysState(pSDevSlnSys.getDevSysState());
            this.setPSDevSlnId(pSDevSlnSys.getPSDevSlnId());
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
    public PSDevSlnSysAppDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDevSlnSysAppDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO pspfid(PSPFDTO pSPF) {
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
    public PSDevSlnSysAppDTO pspfname(String pSPFName) {
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
    public PSDevSlnSysAppDTO pspfstyleid(String pSPFStyleId) {
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO pspfstyleid(PSPFStyleDTO pSPFStyle) {
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
    public PSDevSlnSysAppDTO pspfstylename(String pSPFStyleName) {
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    @JsonProperty(value="psstudiothemeid")
    public void setPSStudioThemeId(String pSStudioThemeId) {
        this._set(DTOFIELD_PSSTUDIOTHEMEID, pSStudioThemeId);
    }

    @JsonIgnore
    public String getPSStudioThemeId() {
        Object objValue = this._get(DTOFIELD_PSSTUDIOTHEMEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSStudioThemeIdDirty() {
        return this._contains(DTOFIELD_PSSTUDIOTHEMEID);
    }

    @JsonIgnore
    public void resetPSStudioThemeId() {
        this._reset(DTOFIELD_PSSTUDIOTHEMEID);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psstudiothemeid(String pSStudioThemeId) {
        this.setPSStudioThemeId(pSStudioThemeId);
        return this;
    }

    @JsonProperty(value="psstudiothemename")
    public void setPSStudioThemeName(String pSStudioThemeName) {
        this._set(DTOFIELD_PSSTUDIOTHEMENAME, pSStudioThemeName);
    }

    @JsonIgnore
    public String getPSStudioThemeName() {
        Object objValue = this._get(DTOFIELD_PSSTUDIOTHEMENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSStudioThemeNameDirty() {
        return this._contains(DTOFIELD_PSSTUDIOTHEMENAME);
    }

    @JsonIgnore
    public void resetPSStudioThemeName() {
        this._reset(DTOFIELD_PSSTUDIOTHEMENAME);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO psstudiothemename(String pSStudioThemeName) {
        this.setPSStudioThemeName(pSStudioThemeName);
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
    public PSDevSlnSysAppDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSDevSlnSysAppDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="themecssstyle")
    public void setThemeCssStyle(String themeCssStyle) {
        this._set(DTOFIELD_THEMECSSSTYLE, themeCssStyle);
    }

    @JsonIgnore
    public String getThemeCssStyle() {
        Object objValue = this._get(DTOFIELD_THEMECSSSTYLE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThemeCssStyleDirty() {
        return this._contains(DTOFIELD_THEMECSSSTYLE);
    }

    @JsonIgnore
    public void resetThemeCssStyle() {
        this._reset(DTOFIELD_THEMECSSSTYLE);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO themecssstyle(String themeCssStyle) {
        this.setThemeCssStyle(themeCssStyle);
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
    public PSDevSlnSysAppDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysAppDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
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
    public PSDevSlnSysAppDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysAppName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysAppName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO name(String strName) {
        this.setPSDevSlnSysAppName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysAppId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysAppId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysAppDTO id(String strValue) {
        this.setPSDevSlnSysAppId(strValue);
        return this;
    }

}
