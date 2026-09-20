package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysRefDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DENAMES = "DENAMES";
    protected static final String DTOFIELD_DENAMES = "denames";
    public static final String FIELD_IGNOREIMPDBMODEL = "IGNOREIMPDBMODEL";
    protected static final String DTOFIELD_IGNOREIMPDBMODEL = "ignoreimpdbmodel";
    public static final String FIELD_IGNOREIMPUIMODEL = "IGNOREIMPUIMODEL";
    protected static final String DTOFIELD_IGNOREIMPUIMODEL = "ignoreimpuimodel";
    public static final String FIELD_IGNOREIMPWFMODEL = "IGNOREIMPWFMODEL";
    protected static final String DTOFIELD_IGNOREIMPWFMODEL = "ignoreimpwfmodel";
    public static final String FIELD_IMPCOREMODELONLY = "IMPCOREMODELONLY";
    protected static final String DTOFIELD_IMPCOREMODELONLY = "impcoremodelonly";
    public static final String FIELD_IMPMODE = "IMPMODE";
    protected static final String DTOFIELD_IMPMODE = "impmode";
    public static final String FIELD_IMPUIMODEL = "IMPUIMODEL";
    protected static final String DTOFIELD_IMPUIMODEL = "impuimodel";
    public static final String FIELD_LINKCODE = "LINKCODE";
    protected static final String DTOFIELD_LINKCODE = "linkcode";
    public static final String FIELD_LINKFLAG = "LINKFLAG";
    protected static final String DTOFIELD_LINKFLAG = "linkflag";
    public static final String FIELD_LINKREPMSG = "LINKREPMSG";
    protected static final String DTOFIELD_LINKREPMSG = "linkrepmsg";
    public static final String FIELD_LINKREQMSG = "LINKREQMSG";
    protected static final String DTOFIELD_LINKREQMSG = "linkreqmsg";
    public static final String FIELD_LINKSTATE = "LINKSTATE";
    protected static final String DTOFIELD_LINKSTATE = "linkstate";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODULELIST = "MODULELIST";
    protected static final String DTOFIELD_MODULELIST = "modulelist";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSREFID = "PSDEVSLNSYSREFID";
    protected static final String DTOFIELD_PSDEVSLNSYSREFID = "psdevslnsysrefid";
    public static final String FIELD_PSDEVSLNSYSREFNAME = "PSDEVSLNSYSREFNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSREFNAME = "psdevslnsysrefname";
    public static final String FIELD_REFMODE = "REFMODE";
    protected static final String DTOFIELD_REFMODE = "refmode";
    public static final String FIELD_REFPARAM = "REFPARAM";
    protected static final String DTOFIELD_REFPARAM = "refparam";
    public static final String FIELD_REFPARAM2 = "REFPARAM2";
    protected static final String DTOFIELD_REFPARAM2 = "refparam2";
    public static final String FIELD_REFPARAMS = "REFPARAMS";
    protected static final String DTOFIELD_REFPARAMS = "refparams";
    public static final String FIELD_REFPSDEVSLNID = "REFPSDEVSLNID";
    protected static final String DTOFIELD_REFPSDEVSLNID = "refpsdevslnid";
    public static final String FIELD_REFPSDEVSLNNAME = "REFPSDEVSLNNAME";
    protected static final String DTOFIELD_REFPSDEVSLNNAME = "refpsdevslnname";
    public static final String FIELD_REFPSDEVSLNSYSAPIID = "REFPSDEVSLNSYSAPIID";
    protected static final String DTOFIELD_REFPSDEVSLNSYSAPIID = "refpsdevslnsysapiid";
    public static final String FIELD_REFPSDEVSLNSYSAPINAME = "REFPSDEVSLNSYSAPINAME";
    protected static final String DTOFIELD_REFPSDEVSLNSYSAPINAME = "refpsdevslnsysapiname";
    public static final String FIELD_REFPSDEVSLNSYSID = "REFPSDEVSLNSYSID";
    protected static final String DTOFIELD_REFPSDEVSLNSYSID = "refpsdevslnsysid";
    public static final String FIELD_REFPSDEVSLNSYSNAME = "REFPSDEVSLNSYSNAME";
    protected static final String DTOFIELD_REFPSDEVSLNSYSNAME = "refpsdevslnsysname";
    public static final String FIELD_REFPSDEVSLNSYSSRVID = "REFPSDEVSLNSYSSRVID";
    protected static final String DTOFIELD_REFPSDEVSLNSYSSRVID = "refpsdevslnsyssrvid";
    public static final String FIELD_REFPSDEVSLNSYSSRVNAME = "REFPSDEVSLNSYSSRVNAME";
    protected static final String DTOFIELD_REFPSDEVSLNSYSSRVNAME = "refpsdevslnsyssrvname";
    public static final String FIELD_SETDENAMESFLAG = "SETDENAMESFLAG";
    protected static final String DTOFIELD_SETDENAMESFLAG = "setdenamesflag";
    public static final String FIELD_SETMODULEFLAG = "SETMODULEFLAG";
    protected static final String DTOFIELD_SETMODULEFLAG = "setmoduleflag";
    public static final String FIELD_SYSCODENAME = "SYSCODENAME";
    protected static final String DTOFIELD_SYSCODENAME = "syscodename";
    public static final String FIELD_SYSPKGNAME = "SYSPKGNAME";
    protected static final String DTOFIELD_SYSPKGNAME = "syspkgname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USAGE = "USAGE";
    protected static final String DTOFIELD_USAGE = "usage";
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
    public PSDevSlnSysRefDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysRefDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="denames")
    public void setDENames(String dENames) {
        this._set(DTOFIELD_DENAMES, dENames);
    }

    @JsonIgnore
    public String getDENames() {
        Object objValue = this._get(DTOFIELD_DENAMES);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDENamesDirty() {
        return this._contains(DTOFIELD_DENAMES);
    }

    @JsonIgnore
    public void resetDENames() {
        this._reset(DTOFIELD_DENAMES);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO denames(String dENames) {
        this.setDENames(dENames);
        return this;
    }

    @JsonProperty(value="ignoreimpdbmodel")
    public void setIgnoreImpDBModel(Integer ignoreImpDBModel) {
        this._set(DTOFIELD_IGNOREIMPDBMODEL, ignoreImpDBModel);
    }

    @JsonIgnore
    public Integer getIgnoreImpDBModel() {
        Object objValue = this._get(DTOFIELD_IGNOREIMPDBMODEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreImpDBModelDirty() {
        return this._contains(DTOFIELD_IGNOREIMPDBMODEL);
    }

    @JsonIgnore
    public void resetIgnoreImpDBModel() {
        this._reset(DTOFIELD_IGNOREIMPDBMODEL);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpdbmodel(Integer ignoreImpDBModel) {
        this.setIgnoreImpDBModel(ignoreImpDBModel);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpdbmodel(Boolean ignoreImpDBModel) {
        this.setIgnoreImpDBModel(ignoreImpDBModel == null ? null : (ignoreImpDBModel ? 1 : 0));
        return this;
    }

    @JsonProperty(value="ignoreimpuimodel")
    public void setIgnoreImpUIModel(Integer ignoreImpUIModel) {
        this._set(DTOFIELD_IGNOREIMPUIMODEL, ignoreImpUIModel);
    }

    @JsonIgnore
    public Integer getIgnoreImpUIModel() {
        Object objValue = this._get(DTOFIELD_IGNOREIMPUIMODEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreImpUIModelDirty() {
        return this._contains(DTOFIELD_IGNOREIMPUIMODEL);
    }

    @JsonIgnore
    public void resetIgnoreImpUIModel() {
        this._reset(DTOFIELD_IGNOREIMPUIMODEL);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpuimodel(Integer ignoreImpUIModel) {
        this.setIgnoreImpUIModel(ignoreImpUIModel);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpuimodel(Boolean ignoreImpUIModel) {
        this.setIgnoreImpUIModel(ignoreImpUIModel == null ? null : (ignoreImpUIModel ? 1 : 0));
        return this;
    }

    @JsonProperty(value="ignoreimpwfmodel")
    public void setIgnoreImpWFModel(Integer ignoreImpWFModel) {
        this._set(DTOFIELD_IGNOREIMPWFMODEL, ignoreImpWFModel);
    }

    @JsonIgnore
    public Integer getIgnoreImpWFModel() {
        Object objValue = this._get(DTOFIELD_IGNOREIMPWFMODEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreImpWFModelDirty() {
        return this._contains(DTOFIELD_IGNOREIMPWFMODEL);
    }

    @JsonIgnore
    public void resetIgnoreImpWFModel() {
        this._reset(DTOFIELD_IGNOREIMPWFMODEL);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpwfmodel(Integer ignoreImpWFModel) {
        this.setIgnoreImpWFModel(ignoreImpWFModel);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO ignoreimpwfmodel(Boolean ignoreImpWFModel) {
        this.setIgnoreImpWFModel(ignoreImpWFModel == null ? null : (ignoreImpWFModel ? 1 : 0));
        return this;
    }

    @JsonProperty(value="impcoremodelonly")
    public void setImpCoreModelOnly(Integer impCoreModelOnly) {
        this._set(DTOFIELD_IMPCOREMODELONLY, impCoreModelOnly);
    }

    @JsonIgnore
    public Integer getImpCoreModelOnly() {
        Object objValue = this._get(DTOFIELD_IMPCOREMODELONLY);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isImpCoreModelOnlyDirty() {
        return this._contains(DTOFIELD_IMPCOREMODELONLY);
    }

    @JsonIgnore
    public void resetImpCoreModelOnly() {
        this._reset(DTOFIELD_IMPCOREMODELONLY);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impcoremodelonly(Integer impCoreModelOnly) {
        this.setImpCoreModelOnly(impCoreModelOnly);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impcoremodelonly(Boolean impCoreModelOnly) {
        this.setImpCoreModelOnly(impCoreModelOnly == null ? null : (impCoreModelOnly ? 1 : 0));
        return this;
    }

    @JsonProperty(value="impmode")
    public void setImpMode(String impMode) {
        this._set(DTOFIELD_IMPMODE, impMode);
    }

    @JsonIgnore
    public String getImpMode() {
        Object objValue = this._get(DTOFIELD_IMPMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImpModeDirty() {
        return this._contains(DTOFIELD_IMPMODE);
    }

    @JsonIgnore
    public void resetImpMode() {
        this._reset(DTOFIELD_IMPMODE);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impmode(String impMode) {
        this.setImpMode(impMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impmode(PSModelEnums.DevSysRefImpMode impMode) {
        this.setImpMode(impMode == null ? null : impMode.value);
        return this;
    }

    @JsonProperty(value="impuimodel")
    public void setImpUIModel(Integer impUIModel) {
        this._set(DTOFIELD_IMPUIMODEL, impUIModel);
    }

    @JsonIgnore
    public Integer getImpUIModel() {
        Object objValue = this._get(DTOFIELD_IMPUIMODEL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isImpUIModelDirty() {
        return this._contains(DTOFIELD_IMPUIMODEL);
    }

    @JsonIgnore
    public void resetImpUIModel() {
        this._reset(DTOFIELD_IMPUIMODEL);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impuimodel(Integer impUIModel) {
        this.setImpUIModel(impUIModel);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO impuimodel(Boolean impUIModel) {
        this.setImpUIModel(impUIModel == null ? null : (impUIModel ? 1 : 0));
        return this;
    }

    @JsonProperty(value="linkcode")
    public void setLinkCode(String linkCode) {
        this._set(DTOFIELD_LINKCODE, linkCode);
    }

    @JsonIgnore
    public String getLinkCode() {
        Object objValue = this._get(DTOFIELD_LINKCODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkCodeDirty() {
        return this._contains(DTOFIELD_LINKCODE);
    }

    @JsonIgnore
    public void resetLinkCode() {
        this._reset(DTOFIELD_LINKCODE);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkcode(String linkCode) {
        this.setLinkCode(linkCode);
        return this;
    }

    @JsonProperty(value="linkflag")
    public void setLinkFlag(Integer linkFlag) {
        this._set(DTOFIELD_LINKFLAG, linkFlag);
    }

    @JsonIgnore
    public Integer getLinkFlag() {
        Object objValue = this._get(DTOFIELD_LINKFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLinkFlagDirty() {
        return this._contains(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public void resetLinkFlag() {
        this._reset(DTOFIELD_LINKFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkflag(Integer linkFlag) {
        this.setLinkFlag(linkFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkflag(Boolean linkFlag) {
        this.setLinkFlag(linkFlag == null ? null : (linkFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="linkrepmsg")
    public void setLinkRepMsg(String linkRepMsg) {
        this._set(DTOFIELD_LINKREPMSG, linkRepMsg);
    }

    @JsonIgnore
    public String getLinkRepMsg() {
        Object objValue = this._get(DTOFIELD_LINKREPMSG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkRepMsgDirty() {
        return this._contains(DTOFIELD_LINKREPMSG);
    }

    @JsonIgnore
    public void resetLinkRepMsg() {
        this._reset(DTOFIELD_LINKREPMSG);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkrepmsg(String linkRepMsg) {
        this.setLinkRepMsg(linkRepMsg);
        return this;
    }

    @JsonProperty(value="linkreqmsg")
    public void setLinkReqMsg(String linkReqMsg) {
        this._set(DTOFIELD_LINKREQMSG, linkReqMsg);
    }

    @JsonIgnore
    public String getLinkReqMsg() {
        Object objValue = this._get(DTOFIELD_LINKREQMSG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkReqMsgDirty() {
        return this._contains(DTOFIELD_LINKREQMSG);
    }

    @JsonIgnore
    public void resetLinkReqMsg() {
        this._reset(DTOFIELD_LINKREQMSG);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkreqmsg(String linkReqMsg) {
        this.setLinkReqMsg(linkReqMsg);
        return this;
    }

    @JsonProperty(value="linkstate")
    public void setLinkState(Integer linkState) {
        this._set(DTOFIELD_LINKSTATE, linkState);
    }

    @JsonIgnore
    public Integer getLinkState() {
        Object objValue = this._get(DTOFIELD_LINKSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLinkStateDirty() {
        return this._contains(DTOFIELD_LINKSTATE);
    }

    @JsonIgnore
    public void resetLinkState() {
        this._reset(DTOFIELD_LINKSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkstate(Integer linkState) {
        this.setLinkState(linkState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO linkstate(PSModelEnums.DevSysRefLinkState linkState) {
        this.setLinkState(linkState == null ? null : linkState.value);
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
    public PSDevSlnSysRefDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modulelist")
    public void setModuleList(String moduleList) {
        this._set(DTOFIELD_MODULELIST, moduleList);
    }

    @JsonIgnore
    public String getModuleList() {
        Object objValue = this._get(DTOFIELD_MODULELIST);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleListDirty() {
        return this._contains(DTOFIELD_MODULELIST);
    }

    @JsonIgnore
    public void resetModuleList() {
        this._reset(DTOFIELD_MODULELIST);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO modulelist(String moduleList) {
        this.setModuleList(moduleList);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) return null;
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
    public PSDevSlnSysRefDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDevSlnSysRefDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDevSlnSysRefDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
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
    public PSDevSlnSysRefDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsysrefid")
    public void setPSDevSlnSysRefId(String pSDevSlnSysRefId) {
        this._set(DTOFIELD_PSDEVSLNSYSREFID, pSDevSlnSysRefId);
    }

    @JsonIgnore
    public String getPSDevSlnSysRefId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSREFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysRefIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSREFID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysRefId() {
        this._reset(DTOFIELD_PSDEVSLNSYSREFID);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO psdevslnsysrefid(String pSDevSlnSysRefId) {
        this.setPSDevSlnSysRefId(pSDevSlnSysRefId);
        return this;
    }

    @JsonProperty(value="psdevslnsysrefname")
    public void setPSDevSlnSysRefName(String pSDevSlnSysRefName) {
        this._set(DTOFIELD_PSDEVSLNSYSREFNAME, pSDevSlnSysRefName);
    }

    @JsonIgnore
    public String getPSDevSlnSysRefName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSREFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysRefNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSREFNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysRefName() {
        this._reset(DTOFIELD_PSDEVSLNSYSREFNAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO psdevslnsysrefname(String pSDevSlnSysRefName) {
        this.setPSDevSlnSysRefName(pSDevSlnSysRefName);
        return this;
    }

    @JsonProperty(value="refmode")
    public void setRefMode(String refMode) {
        this._set(DTOFIELD_REFMODE, refMode);
    }

    @JsonIgnore
    public String getRefMode() {
        Object objValue = this._get(DTOFIELD_REFMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefModeDirty() {
        return this._contains(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public void resetRefMode() {
        this._reset(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refmode(String refMode) {
        this.setRefMode(refMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refmode(PSModelEnums.DevSysRefMode refMode) {
        this.setRefMode(refMode == null ? null : refMode.value);
        return this;
    }

    @JsonProperty(value="refparam")
    public void setRefParam(String refParam) {
        this._set(DTOFIELD_REFPARAM, refParam);
    }

    @JsonIgnore
    public String getRefParam() {
        Object objValue = this._get(DTOFIELD_REFPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamDirty() {
        return this._contains(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public void resetRefParam() {
        this._reset(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refparam(String refParam) {
        this.setRefParam(refParam);
        return this;
    }

    @JsonProperty(value="refparam2")
    public void setRefParam2(String refParam2) {
        this._set(DTOFIELD_REFPARAM2, refParam2);
    }

    @JsonIgnore
    public String getRefParam2() {
        Object objValue = this._get(DTOFIELD_REFPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParam2Dirty() {
        return this._contains(DTOFIELD_REFPARAM2);
    }

    @JsonIgnore
    public void resetRefParam2() {
        this._reset(DTOFIELD_REFPARAM2);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refparam2(String refParam2) {
        this.setRefParam2(refParam2);
        return this;
    }

    @JsonProperty(value="refparams")
    public void setRefParams(String refParams) {
        this._set(DTOFIELD_REFPARAMS, refParams);
    }

    @JsonIgnore
    public String getRefParams() {
        Object objValue = this._get(DTOFIELD_REFPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamsDirty() {
        return this._contains(DTOFIELD_REFPARAMS);
    }

    @JsonIgnore
    public void resetRefParams() {
        this._reset(DTOFIELD_REFPARAMS);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refparams(String refParams) {
        this.setRefParams(refParams);
        return this;
    }

    @JsonProperty(value="refpsdevslnid")
    public void setRefPSDevSlnId(String refPSDevSlnId) {
        this._set(DTOFIELD_REFPSDEVSLNID, refPSDevSlnId);
    }

    @JsonIgnore
    public String getRefPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNID);
    }

    @JsonIgnore
    public void resetRefPSDevSlnId() {
        this._reset(DTOFIELD_REFPSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnid(String refPSDevSlnId) {
        this.setRefPSDevSlnId(refPSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setRefPSDevSlnId(null);
            this.setRefPSDevSlnName(null);
        } else {
            this.setRefPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setRefPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="refpsdevslnname")
    public void setRefPSDevSlnName(String refPSDevSlnName) {
        this._set(DTOFIELD_REFPSDEVSLNNAME, refPSDevSlnName);
    }

    @JsonIgnore
    public String getRefPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetRefPSDevSlnName() {
        this._reset(DTOFIELD_REFPSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnname(String refPSDevSlnName) {
        this.setRefPSDevSlnName(refPSDevSlnName);
        return this;
    }

    @JsonProperty(value="refpsdevslnsysapiid")
    public void setRefPSDevSlnSysAPIId(String refPSDevSlnSysAPIId) {
        this._set(DTOFIELD_REFPSDEVSLNSYSAPIID, refPSDevSlnSysAPIId);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysAPIId() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSAPIID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysAPIIdDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysAPIId() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSAPIID);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysapiid(String refPSDevSlnSysAPIId) {
        this.setRefPSDevSlnSysAPIId(refPSDevSlnSysAPIId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysapiid(PSDevSlnSysAPIDTO pSDevSlnSysAPI) {
        if (pSDevSlnSysAPI == null) {
            this.setRefPSDevSlnSysAPIId(null);
            this.setRefPSDevSlnSysAPIName(null);
        } else {
            this.setRefPSDevSlnSysAPIId(pSDevSlnSysAPI.getPSDevSlnSysAPIId());
            this.setRefPSDevSlnSysAPIName(pSDevSlnSysAPI.getPSDevSlnSysAPIName());
        }
        return this;
    }

    @JsonProperty(value="refpsdevslnsysapiname")
    public void setRefPSDevSlnSysAPIName(String refPSDevSlnSysAPIName) {
        this._set(DTOFIELD_REFPSDEVSLNSYSAPINAME, refPSDevSlnSysAPIName);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysAPIName() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSAPINAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysAPINameDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysAPIName() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSAPINAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysapiname(String refPSDevSlnSysAPIName) {
        this.setRefPSDevSlnSysAPIName(refPSDevSlnSysAPIName);
        return this;
    }

    @JsonProperty(value="refpsdevslnsysid")
    public void setRefPSDevSlnSysId(String refPSDevSlnSysId) {
        this._set(DTOFIELD_REFPSDEVSLNSYSID, refPSDevSlnSysId);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysId() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysid(String refPSDevSlnSysId) {
        this.setRefPSDevSlnSysId(refPSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setRefPSDevSlnSysId(null);
            this.setRefPSDevSlnSysName(null);
        } else {
            this.setRefPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setRefPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="refpsdevslnsysname")
    public void setRefPSDevSlnSysName(String refPSDevSlnSysName) {
        this._set(DTOFIELD_REFPSDEVSLNSYSNAME, refPSDevSlnSysName);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysName() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsysname(String refPSDevSlnSysName) {
        this.setRefPSDevSlnSysName(refPSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="refpsdevslnsyssrvid")
    public void setRefPSDevSlnSysSrvId(String refPSDevSlnSysSrvId) {
        this._set(DTOFIELD_REFPSDEVSLNSYSSRVID, refPSDevSlnSysSrvId);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysSrvId() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSSRVID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysSrvIdDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysSrvId() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsyssrvid(String refPSDevSlnSysSrvId) {
        this.setRefPSDevSlnSysSrvId(refPSDevSlnSysSrvId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsyssrvid(PSDevSlnSysSrvDTO pSDevSlnSysSrv) {
        if (pSDevSlnSysSrv == null) {
            this.setRefPSDevSlnSysSrvId(null);
            this.setRefPSDevSlnSysSrvName(null);
        } else {
            this.setRefPSDevSlnSysSrvId(pSDevSlnSysSrv.getPSDevSlnSysSrvId());
            this.setRefPSDevSlnSysSrvName(pSDevSlnSysSrv.getPSDevSlnSysSrvName());
        }
        return this;
    }

    @JsonProperty(value="refpsdevslnsyssrvname")
    public void setRefPSDevSlnSysSrvName(String refPSDevSlnSysSrvName) {
        this._set(DTOFIELD_REFPSDEVSLNSYSSRVNAME, refPSDevSlnSysSrvName);
    }

    @JsonIgnore
    public String getRefPSDevSlnSysSrvName() {
        Object objValue = this._get(DTOFIELD_REFPSDEVSLNSYSSRVNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDevSlnSysSrvNameDirty() {
        return this._contains(DTOFIELD_REFPSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public void resetRefPSDevSlnSysSrvName() {
        this._reset(DTOFIELD_REFPSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO refpsdevslnsyssrvname(String refPSDevSlnSysSrvName) {
        this.setRefPSDevSlnSysSrvName(refPSDevSlnSysSrvName);
        return this;
    }

    @JsonProperty(value="setdenamesflag")
    public void setSetDENamesFlag(Integer setDENamesFlag) {
        this._set(DTOFIELD_SETDENAMESFLAG, setDENamesFlag);
    }

    @JsonIgnore
    public Integer getSetDENamesFlag() {
        Object objValue = this._get(DTOFIELD_SETDENAMESFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSetDENamesFlagDirty() {
        return this._contains(DTOFIELD_SETDENAMESFLAG);
    }

    @JsonIgnore
    public void resetSetDENamesFlag() {
        this._reset(DTOFIELD_SETDENAMESFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO setdenamesflag(Integer setDENamesFlag) {
        this.setSetDENamesFlag(setDENamesFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO setdenamesflag(Boolean setDENamesFlag) {
        this.setSetDENamesFlag(setDENamesFlag == null ? null : (setDENamesFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="setmoduleflag")
    public void setSetModuleFlag(Integer setModuleFlag) {
        this._set(DTOFIELD_SETMODULEFLAG, setModuleFlag);
    }

    @JsonIgnore
    public Integer getSetModuleFlag() {
        Object objValue = this._get(DTOFIELD_SETMODULEFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSetModuleFlagDirty() {
        return this._contains(DTOFIELD_SETMODULEFLAG);
    }

    @JsonIgnore
    public void resetSetModuleFlag() {
        this._reset(DTOFIELD_SETMODULEFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO setmoduleflag(Integer setModuleFlag) {
        this.setSetModuleFlag(setModuleFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO setmoduleflag(Boolean setModuleFlag) {
        this.setSetModuleFlag(setModuleFlag == null ? null : (setModuleFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="syscodename")
    public void setSysCodeName(String sysCodeName) {
        this._set(DTOFIELD_SYSCODENAME, sysCodeName);
    }

    @JsonIgnore
    public String getSysCodeName() {
        Object objValue = this._get(DTOFIELD_SYSCODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysCodeNameDirty() {
        return this._contains(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public void resetSysCodeName() {
        this._reset(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO syscodename(String sysCodeName) {
        this.setSysCodeName(sysCodeName);
        return this;
    }

    @JsonProperty(value="syspkgname")
    public void setSysPkgName(String sysPkgName) {
        this._set(DTOFIELD_SYSPKGNAME, sysPkgName);
    }

    @JsonIgnore
    public String getSysPkgName() {
        Object objValue = this._get(DTOFIELD_SYSPKGNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysPkgNameDirty() {
        return this._contains(DTOFIELD_SYSPKGNAME);
    }

    @JsonIgnore
    public void resetSysPkgName() {
        this._reset(DTOFIELD_SYSPKGNAME);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO syspkgname(String sysPkgName) {
        this.setSysPkgName(sysPkgName);
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
    public PSDevSlnSysRefDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysRefDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usage")
    public void setUsage(String usage) {
        this._set(DTOFIELD_USAGE, usage);
    }

    @JsonIgnore
    public String getUsage() {
        Object objValue = this._get(DTOFIELD_USAGE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUsageDirty() {
        return this._contains(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public void resetUsage() {
        this._reset(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO usage(String usage) {
        this.setUsage(usage);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO usage(PSModelEnums.DevSysRefUsage usage) {
        this.setUsage(usage == null ? null : usage.value);
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
    public PSDevSlnSysRefDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDevSlnSysRefDTO usertag(String userTag) {
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
    public PSDevSlnSysRefDTO usertag2(String userTag2) {
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
    public PSDevSlnSysRefDTO usertag3(String userTag3) {
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
    public PSDevSlnSysRefDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysRefName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysRefName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO name(String strName) {
        this.setPSDevSlnSysRefName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysRefId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysRefId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysRefDTO id(String strValue) {
        this.setPSDevSlnSysRefId(strValue);
        return this;
    }

}
