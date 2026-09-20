package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Modeling module DTO.
 *
 * <p>Values are stored in {@link net.ibizsys.central.util.EntityDTO}'s
 * attribute map so the DTO keeps the modeling service's dirty tracking
 * behavior while remaining independent of generated bean fields.</p>
 */
public class PSModuleDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAMEMODE = "CODENAMEMODE";
    protected static final String DTOFIELD_CODENAMEMODE = "codenamemode";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DSLINK = "DSLINK";
    protected static final String DTOFIELD_DSLINK = "dslink";
    public static final String FIELD_DTOFORMAT = "DTOFORMAT";
    protected static final String DTOFIELD_DTOFORMAT = "dtoformat";
    public static final String FIELD_DYNAINSTTAG = "DYNAINSTTAG";
    protected static final String DTOFIELD_DYNAINSTTAG = "dynainsttag";
    public static final String FIELD_DYNAINSTTAG2 = "DYNAINSTTAG2";
    protected static final String DTOFIELD_DYNAINSTTAG2 = "dynainsttag2";
    public static final String FIELD_ENABLEPQL = "ENABLEPQL";
    protected static final String DTOFIELD_ENABLEPQL = "enablepql";
    public static final String FIELD_LANRESTAG = "LANRESTAG";
    protected static final String DTOFIELD_LANRESTAG = "lanrestag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODTAG = "MODTAG";
    protected static final String DTOFIELD_MODTAG = "modtag";
    public static final String FIELD_MODTAG2 = "MODTAG2";
    protected static final String DTOFIELD_MODTAG2 = "modtag2";
    public static final String FIELD_MODTAG3 = "MODTAG3";
    protected static final String DTOFIELD_MODTAG3 = "modtag3";
    public static final String FIELD_MODTAG4 = "MODTAG4";
    protected static final String DTOFIELD_MODTAG4 = "modtag4";
    public static final String FIELD_MODULESN = "MODULESN";
    protected static final String DTOFIELD_MODULESN = "modulesn";
    public static final String FIELD_NOVIEWMODE = "NOVIEWMODE";
    protected static final String DTOFIELD_NOVIEWMODE = "noviewmode";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKGCODENAME = "PKGCODENAME";
    protected static final String DTOFIELD_PKGCODENAME = "pkgcodename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSMODELGROUPID = "PSSYSMODELGROUPID";
    protected static final String DTOFIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";
    public static final String FIELD_PSSYSMODELGROUPNAME = "PSSYSMODELGROUPNAME";
    protected static final String DTOFIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";
    public static final String FIELD_PSSYSREFID = "PSSYSREFID";
    protected static final String DTOFIELD_PSSYSREFID = "pssysrefid";
    public static final String FIELD_PSSYSREFNAME = "PSSYSREFNAME";
    protected static final String DTOFIELD_PSSYSREFNAME = "pssysrefname";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSSYSSFPUBNAME = "PSSYSSFPUBNAME";
    protected static final String DTOFIELD_PSSYSSFPUBNAME = "pssyssfpubname";
    public static final String FIELD_REQMODULE = "REQMODULE";
    protected static final String DTOFIELD_REQMODULE = "reqmodule";
    public static final String FIELD_RUNTIMETYPE = "RUNTIMETYPE";
    protected static final String DTOFIELD_RUNTIMETYPE = "runtimetype";
    public static final String FIELD_SERVICEAPIFLAG = "SERVICEAPIFLAG";
    protected static final String DTOFIELD_SERVICEAPIFLAG = "serviceapiflag";
    public static final String FIELD_SHORTTAG = "SHORTTAG";
    protected static final String DTOFIELD_SHORTTAG = "shorttag";
    public static final String FIELD_SUBSYSMODULE = "SUBSYSMODULE";
    protected static final String DTOFIELD_SUBSYSMODULE = "subsysmodule";
    public static final String FIELD_SYSREFTYPE = "SYSREFTYPE";
    protected static final String DTOFIELD_SYSREFTYPE = "sysreftype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
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
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_UTILTAG = "UTILTAG";
    protected static final String DTOFIELD_UTILTAG = "utiltag";
    public static final String FIELD_UTILTYPE = "UTILTYPE";
    protected static final String DTOFIELD_UTILTYPE = "utiltype";

    @JsonProperty("clspkgparams")
    public void setClsPkgParams(String value) {
        _set(DTOFIELD_CLSPKGPARAMS, value);
    }

    @JsonIgnore
    public String getClsPkgParams() {
        return (String) _get(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public boolean isClsPkgParamsDirty() {
        return _contains(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public void resetClsPkgParams() {
        _reset(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public PSModuleDTO clspkgparams(String value) {
        setClsPkgParams(value);
        return this;
    }

    @JsonProperty("codename")
    public void setCodeName(String value) {
        _set(DTOFIELD_CODENAME, value);
    }

    @JsonIgnore
    public String getCodeName() {
        return (String) _get(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return _contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        _reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSModuleDTO codename(String value) {
        setCodeName(value);
        return this;
    }

    @JsonProperty("codenamemode")
    public void setCodeNameMode(String value) {
        _set(DTOFIELD_CODENAMEMODE, value);
    }

    @JsonIgnore
    public String getCodeNameMode() {
        return (String) _get(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public boolean isCodeNameModeDirty() {
        return _contains(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public void resetCodeNameMode() {
        _reset(DTOFIELD_CODENAMEMODE);
    }

    @JsonIgnore
    public PSModuleDTO codenamemode(String value) {
        setCodeNameMode(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO codenamemode(PSModelEnums.CodeNameMode value) {
        setCodeNameMode(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("color")
    public void setColor(String value) {
        _set(DTOFIELD_COLOR, value);
    }

    @JsonIgnore
    public String getColor() {
        return (String) _get(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return _contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        _reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSModuleDTO color(String value) {
        setColor(value);
        return this;
    }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) {
        _set(DTOFIELD_CREATEDATE, value);
    }

    @JsonIgnore
    public Timestamp getCreateDate() {
        return (Timestamp) _get(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public boolean isCreateDateDirty() {
        return _contains(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public void resetCreateDate() {
        _reset(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public PSModuleDTO createdate(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    @JsonProperty("createman")
    public void setCreateMan(String value) {
        _set(DTOFIELD_CREATEMAN, value);
    }

    @JsonIgnore
    public String getCreateMan() {
        return (String) _get(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public boolean isCreateManDirty() {
        return _contains(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public void resetCreateMan() {
        _reset(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public PSModuleDTO createman(String value) {
        setCreateMan(value);
        return this;
    }

    @JsonProperty("defaultflag")
    public void setDefaultFlag(Integer value) {
        _set(DTOFIELD_DEFAULTFLAG, value);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        return (Integer) _get(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return _contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        _reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSModuleDTO defaultflag(Integer value) {
        setDefaultFlag(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO defaultflag(Boolean value) {
        setDefaultFlag(flagValue(value));
        return this;
    }

    @JsonProperty("dslink")
    public void setDSLink(String value) {
        _set(DTOFIELD_DSLINK, value);
    }

    @JsonIgnore
    public String getDSLink() {
        return (String) _get(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public boolean isDSLinkDirty() {
        return _contains(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public void resetDSLink() {
        _reset(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public PSModuleDTO dslink(String value) {
        setDSLink(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO dslink(PSModelEnums.DataSourceLink value) {
        setDSLink(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("dtoformat")
    public void setDTOFormat(String value) {
        _set(DTOFIELD_DTOFORMAT, value);
    }

    @JsonIgnore
    public String getDTOFormat() {
        return (String) _get(DTOFIELD_DTOFORMAT);
    }

    @JsonIgnore
    public boolean isDTOFormatDirty() {
        return _contains(DTOFIELD_DTOFORMAT);
    }

    @JsonIgnore
    public void resetDTOFormat() {
        _reset(DTOFIELD_DTOFORMAT);
    }

    @JsonIgnore
    public PSModuleDTO dtoformat(String value) {
        setDTOFormat(value);
        return this;
    }

    @JsonProperty("dynainsttag")
    public void setDynaInstTag(String value) {
        _set(DTOFIELD_DYNAINSTTAG, value);
    }

    @JsonIgnore
    public String getDynaInstTag() {
        return (String) _get(DTOFIELD_DYNAINSTTAG);
    }

    @JsonIgnore
    public boolean isDynaInstTagDirty() {
        return _contains(DTOFIELD_DYNAINSTTAG);
    }

    @JsonIgnore
    public void resetDynaInstTag() {
        _reset(DTOFIELD_DYNAINSTTAG);
    }

    @JsonIgnore
    public PSModuleDTO dynainsttag(String value) {
        setDynaInstTag(value);
        return this;
    }

    @JsonProperty("dynainsttag2")
    public void setDynaInstTag2(String value) {
        _set(DTOFIELD_DYNAINSTTAG2, value);
    }

    @JsonIgnore
    public String getDynaInstTag2() {
        return (String) _get(DTOFIELD_DYNAINSTTAG2);
    }

    @JsonIgnore
    public boolean isDynaInstTag2Dirty() {
        return _contains(DTOFIELD_DYNAINSTTAG2);
    }

    @JsonIgnore
    public void resetDynaInstTag2() {
        _reset(DTOFIELD_DYNAINSTTAG2);
    }

    @JsonIgnore
    public PSModuleDTO dynainsttag2(String value) {
        setDynaInstTag2(value);
        return this;
    }

    @JsonProperty("enablepql")
    public void setEnablePQL(Integer value) {
        _set(DTOFIELD_ENABLEPQL, value);
    }

    @JsonIgnore
    public Integer getEnablePQL() {
        return (Integer) _get(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public boolean isEnablePQLDirty() {
        return _contains(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public void resetEnablePQL() {
        _reset(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public PSModuleDTO enablepql(Integer value) {
        setEnablePQL(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO enablepql(Boolean value) {
        setEnablePQL(flagValue(value));
        return this;
    }

    @JsonProperty("lanrestag")
    public void setLanResTag(String value) {
        _set(DTOFIELD_LANRESTAG, value);
    }

    @JsonIgnore
    public String getLanResTag() {
        return (String) _get(DTOFIELD_LANRESTAG);
    }

    @JsonIgnore
    public boolean isLanResTagDirty() {
        return _contains(DTOFIELD_LANRESTAG);
    }

    @JsonIgnore
    public void resetLanResTag() {
        _reset(DTOFIELD_LANRESTAG);
    }

    @JsonIgnore
    public PSModuleDTO lanrestag(String value) {
        setLanResTag(value);
        return this;
    }

    @JsonProperty("memo")
    public void setMemo(String value) {
        _set(DTOFIELD_MEMO, value);
    }

    @JsonIgnore
    public String getMemo() {
        return (String) _get(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public boolean isMemoDirty() {
        return _contains(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public void resetMemo() {
        _reset(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public PSModuleDTO memo(String value) {
        setMemo(value);
        return this;
    }

    @JsonProperty("modtag")
    public void setModTag(String value) {
        _set(DTOFIELD_MODTAG, value);
    }

    @JsonIgnore
    public String getModTag() {
        return (String) _get(DTOFIELD_MODTAG);
    }

    @JsonIgnore
    public boolean isModTagDirty() {
        return _contains(DTOFIELD_MODTAG);
    }

    @JsonIgnore
    public void resetModTag() {
        _reset(DTOFIELD_MODTAG);
    }

    @JsonIgnore
    public PSModuleDTO modtag(String value) {
        setModTag(value);
        return this;
    }

    @JsonProperty("modtag2")
    public void setModTag2(String value) {
        _set(DTOFIELD_MODTAG2, value);
    }

    @JsonIgnore
    public String getModTag2() {
        return (String) _get(DTOFIELD_MODTAG2);
    }

    @JsonIgnore
    public boolean isModTag2Dirty() {
        return _contains(DTOFIELD_MODTAG2);
    }

    @JsonIgnore
    public void resetModTag2() {
        _reset(DTOFIELD_MODTAG2);
    }

    @JsonIgnore
    public PSModuleDTO modtag2(String value) {
        setModTag2(value);
        return this;
    }

    @JsonProperty("modtag3")
    public void setModTag3(String value) {
        _set(DTOFIELD_MODTAG3, value);
    }

    @JsonIgnore
    public String getModTag3() {
        return (String) _get(DTOFIELD_MODTAG3);
    }

    @JsonIgnore
    public boolean isModTag3Dirty() {
        return _contains(DTOFIELD_MODTAG3);
    }

    @JsonIgnore
    public void resetModTag3() {
        _reset(DTOFIELD_MODTAG3);
    }

    @JsonIgnore
    public PSModuleDTO modtag3(String value) {
        setModTag3(value);
        return this;
    }

    @JsonProperty("modtag4")
    public void setModTag4(String value) {
        _set(DTOFIELD_MODTAG4, value);
    }

    @JsonIgnore
    public String getModTag4() {
        return (String) _get(DTOFIELD_MODTAG4);
    }

    @JsonIgnore
    public boolean isModTag4Dirty() {
        return _contains(DTOFIELD_MODTAG4);
    }

    @JsonIgnore
    public void resetModTag4() {
        _reset(DTOFIELD_MODTAG4);
    }

    @JsonIgnore
    public PSModuleDTO modtag4(String value) {
        setModTag4(value);
        return this;
    }

    @JsonProperty("modulesn")
    public void setModuleSN(String value) {
        _set(DTOFIELD_MODULESN, value);
    }

    @JsonIgnore
    public String getModuleSN() {
        return (String) _get(DTOFIELD_MODULESN);
    }

    @JsonIgnore
    public boolean isModuleSNDirty() {
        return _contains(DTOFIELD_MODULESN);
    }

    @JsonIgnore
    public void resetModuleSN() {
        _reset(DTOFIELD_MODULESN);
    }

    @JsonIgnore
    public PSModuleDTO modulesn(String value) {
        setModuleSN(value);
        return this;
    }

    @JsonProperty("noviewmode")
    public void setNoViewMode(Integer value) {
        _set(DTOFIELD_NOVIEWMODE, value);
    }

    @JsonIgnore
    public Integer getNoViewMode() {
        return (Integer) _get(DTOFIELD_NOVIEWMODE);
    }

    @JsonIgnore
    public boolean isNoViewModeDirty() {
        return _contains(DTOFIELD_NOVIEWMODE);
    }

    @JsonIgnore
    public void resetNoViewMode() {
        _reset(DTOFIELD_NOVIEWMODE);
    }

    @JsonIgnore
    public PSModuleDTO noviewmode(Integer value) {
        setNoViewMode(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO noviewmode(Boolean value) {
        setNoViewMode(flagValue(value));
        return this;
    }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) {
        _set(DTOFIELD_ORDERVALUE, value);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        return (Integer) _get(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return _contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        _reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSModuleDTO ordervalue(Integer value) {
        setOrderValue(value);
        return this;
    }

    @JsonProperty("pkgcodename")
    public void setPKGCodeName(String value) {
        _set(DTOFIELD_PKGCODENAME, value);
    }

    @JsonIgnore
    public String getPKGCodeName() {
        return (String) _get(DTOFIELD_PKGCODENAME);
    }

    @JsonIgnore
    public boolean isPKGCodeNameDirty() {
        return _contains(DTOFIELD_PKGCODENAME);
    }

    @JsonIgnore
    public void resetPKGCodeName() {
        _reset(DTOFIELD_PKGCODENAME);
    }

    @JsonIgnore
    public PSModuleDTO pkgcodename(String value) {
        setPKGCodeName(value);
        return this;
    }

    @JsonProperty("psmoduleid")
    public void setPSModuleId(String value) {
        _set(DTOFIELD_PSMODULEID, value);
    }

    @JsonIgnore
    public String getPSModuleId() {
        return (String) _get(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return _contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        _reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSModuleDTO psmoduleid(String value) {
        setPSModuleId(value);
        return this;
    }

    @JsonProperty("psmodulename")
    public void setPSModuleName(String value) {
        _set(DTOFIELD_PSMODULENAME, value);
    }

    @JsonIgnore
    public String getPSModuleName() {
        return (String) _get(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return _contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        _reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSModuleDTO psmodulename(String value) {
        setPSModuleName(value);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return getPSModuleName();
    }

    @JsonIgnore
    public void setName(String value) {
        setPSModuleName(value);
    }

    @JsonIgnore
    public PSModuleDTO name(String value) {
        setPSModuleName(value);
        return this;
    }

    @JsonProperty("pssysmodelgroupid")
    public void setPSSysModelGroupId(String value) {
        _set(DTOFIELD_PSSYSMODELGROUPID, value);
    }

    @JsonIgnore
    public String getPSSysModelGroupId() {
        return (String) _get(DTOFIELD_PSSYSMODELGROUPID);
    }

    @JsonIgnore
    public boolean isPSSysModelGroupIdDirty() {
        return _contains(DTOFIELD_PSSYSMODELGROUPID);
    }

    @JsonIgnore
    public void resetPSSysModelGroupId() {
        _reset(DTOFIELD_PSSYSMODELGROUPID);
    }

    @JsonIgnore
    public PSModuleDTO pssysmodelgroupid(String value) {
        setPSSysModelGroupId(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO pssysmodelgroupid(PSSysModelGroupDTO value) {
        if (value == null) {
            setPSSysModelGroupId(null);
            setPSSysModelGroupName(null);
        } else {
            setPSSysModelGroupId(value.getPSSysModelGroupId());
            setPSSysModelGroupName(value.getPSSysModelGroupName());
        }
        return this;
    }

    @JsonProperty("pssysmodelgroupname")
    public void setPSSysModelGroupName(String value) {
        _set(DTOFIELD_PSSYSMODELGROUPNAME, value);
    }

    @JsonIgnore
    public String getPSSysModelGroupName() {
        return (String) _get(DTOFIELD_PSSYSMODELGROUPNAME);
    }

    @JsonIgnore
    public boolean isPSSysModelGroupNameDirty() {
        return _contains(DTOFIELD_PSSYSMODELGROUPNAME);
    }

    @JsonIgnore
    public void resetPSSysModelGroupName() {
        _reset(DTOFIELD_PSSYSMODELGROUPNAME);
    }

    @JsonIgnore
    public PSModuleDTO pssysmodelgroupname(String value) {
        setPSSysModelGroupName(value);
        return this;
    }

    @JsonProperty("pssysrefid")
    public void setPSSysRefId(String value) {
        _set(DTOFIELD_PSSYSREFID, value);
    }

    @JsonIgnore
    public String getPSSysRefId() {
        return (String) _get(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public boolean isPSSysRefIdDirty() {
        return _contains(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public void resetPSSysRefId() {
        _reset(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public PSModuleDTO pssysrefid(String value) {
        setPSSysRefId(value);
        return this;
    }

    @JsonProperty("pssysrefname")
    public void setPSSysRefName(String value) {
        _set(DTOFIELD_PSSYSREFNAME, value);
    }

    @JsonIgnore
    public String getPSSysRefName() {
        return (String) _get(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public boolean isPSSysRefNameDirty() {
        return _contains(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public void resetPSSysRefName() {
        _reset(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public PSModuleDTO pssysrefname(String value) {
        setPSSysRefName(value);
        return this;
    }

    @JsonProperty("pssyssfpubid")
    public void setPSSysSFPubId(String value) {
        _set(DTOFIELD_PSSYSSFPUBID, value);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        return (String) _get(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public boolean isPSSysSFPubIdDirty() {
        return _contains(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPSSysSFPubId() {
        _reset(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public PSModuleDTO pssyssfpubid(String value) {
        setPSSysSFPubId(value);
        return this;
    }

    @JsonProperty("pssyssfpubname")
    public void setPSSysSFPubName(String value) {
        _set(DTOFIELD_PSSYSSFPUBNAME, value);
    }

    @JsonIgnore
    public String getPSSysSFPubName() {
        return (String) _get(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public boolean isPSSysSFPubNameDirty() {
        return _contains(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPubName() {
        _reset(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public PSModuleDTO pssyssfpubname(String value) {
        setPSSysSFPubName(value);
        return this;
    }

    @JsonProperty("reqmodule")
    public void setReqModule(Integer value) {
        _set(DTOFIELD_REQMODULE, value);
    }

    @JsonIgnore
    public Integer getReqModule() {
        return (Integer) _get(DTOFIELD_REQMODULE);
    }

    @JsonIgnore
    public boolean isReqModuleDirty() {
        return _contains(DTOFIELD_REQMODULE);
    }

    @JsonIgnore
    public void resetReqModule() {
        _reset(DTOFIELD_REQMODULE);
    }

    @JsonIgnore
    public PSModuleDTO reqmodule(Integer value) {
        setReqModule(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO reqmodule(Boolean value) {
        setReqModule(flagValue(value));
        return this;
    }

    @JsonProperty("runtimetype")
    public void setRuntimeType(String value) {
        _set(DTOFIELD_RUNTIMETYPE, value);
    }

    @JsonIgnore
    public String getRuntimeType() {
        return (String) _get(DTOFIELD_RUNTIMETYPE);
    }

    @JsonIgnore
    public boolean isRuntimeTypeDirty() {
        return _contains(DTOFIELD_RUNTIMETYPE);
    }

    @JsonIgnore
    public void resetRuntimeType() {
        _reset(DTOFIELD_RUNTIMETYPE);
    }

    @JsonIgnore
    public PSModuleDTO runtimetype(String value) {
        setRuntimeType(value);
        return this;
    }

    @JsonProperty("serviceapiflag")
    public void setServiceAPIFlag(Integer value) {
        _set(DTOFIELD_SERVICEAPIFLAG, value);
    }

    @JsonIgnore
    public Integer getServiceAPIFlag() {
        return (Integer) _get(DTOFIELD_SERVICEAPIFLAG);
    }

    @JsonIgnore
    public boolean isServiceAPIFlagDirty() {
        return _contains(DTOFIELD_SERVICEAPIFLAG);
    }

    @JsonIgnore
    public void resetServiceAPIFlag() {
        _reset(DTOFIELD_SERVICEAPIFLAG);
    }

    @JsonIgnore
    public PSModuleDTO serviceapiflag(Integer value) {
        setServiceAPIFlag(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO serviceapiflag(PSModelEnums.DEServiceAPIMode value) {
        setServiceAPIFlag(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("shorttag")
    public void setShortTag(String value) {
        _set(DTOFIELD_SHORTTAG, value);
    }

    @JsonIgnore
    public String getShortTag() {
        return (String) _get(DTOFIELD_SHORTTAG);
    }

    @JsonIgnore
    public boolean isShortTagDirty() {
        return _contains(DTOFIELD_SHORTTAG);
    }

    @JsonIgnore
    public void resetShortTag() {
        _reset(DTOFIELD_SHORTTAG);
    }

    @JsonIgnore
    public PSModuleDTO shorttag(String value) {
        setShortTag(value);
        return this;
    }

    @JsonProperty("subsysmodule")
    public void setSubSysModule(Integer value) {
        _set(DTOFIELD_SUBSYSMODULE, value);
    }

    @JsonIgnore
    public Integer getSubSysModule() {
        return (Integer) _get(DTOFIELD_SUBSYSMODULE);
    }

    @JsonIgnore
    public boolean isSubSysModuleDirty() {
        return _contains(DTOFIELD_SUBSYSMODULE);
    }

    @JsonIgnore
    public void resetSubSysModule() {
        _reset(DTOFIELD_SUBSYSMODULE);
    }

    @JsonIgnore
    public PSModuleDTO subsysmodule(Integer value) {
        setSubSysModule(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO subsysmodule(Boolean value) {
        setSubSysModule(flagValue(value));
        return this;
    }

    @JsonProperty("sysreftype")
    public void setSysRefType(String value) {
        _set(DTOFIELD_SYSREFTYPE, value);
    }

    @JsonIgnore
    public String getSysRefType() {
        return (String) _get(DTOFIELD_SYSREFTYPE);
    }

    @JsonIgnore
    public boolean isSysRefTypeDirty() {
        return _contains(DTOFIELD_SYSREFTYPE);
    }

    @JsonIgnore
    public void resetSysRefType() {
        _reset(DTOFIELD_SYSREFTYPE);
    }

    @JsonIgnore
    public PSModuleDTO sysreftype(String value) {
        setSysRefType(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO sysreftype(PSModelEnums.SysRefType value) {
        setSysRefType(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) {
        _set(DTOFIELD_UPDATEDATE, value);
    }

    @JsonIgnore
    public Timestamp getUpdateDate() {
        return (Timestamp) _get(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public boolean isUpdateDateDirty() {
        return _contains(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public void resetUpdateDate() {
        _reset(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public PSModuleDTO updatedate(Timestamp value) {
        setUpdateDate(value);
        return this;
    }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) {
        _set(DTOFIELD_UPDATEMAN, value);
    }

    @JsonIgnore
    public String getUpdateMan() {
        return (String) _get(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public boolean isUpdateManDirty() {
        return _contains(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public void resetUpdateMan() {
        _reset(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public PSModuleDTO updateman(String value) {
        setUpdateMan(value);
        return this;
    }

    @JsonProperty("usercat")
    public void setUserCat(String value) {
        _set(DTOFIELD_USERCAT, value);
    }

    @JsonIgnore
    public String getUserCat() {
        return (String) _get(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return _contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        _reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSModuleDTO usercat(String value) {
        setUserCat(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("userparams")
    public void setUserParams(String value) {
        _set(DTOFIELD_USERPARAMS, value);
    }

    @JsonIgnore
    public String getUserParams() {
        return (String) _get(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return _contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        _reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSModuleDTO userparams(String value) {
        setUserParams(value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) {
        _set(DTOFIELD_USERTAG, value);
    }

    @JsonIgnore
    public String getUserTag() {
        return (String) _get(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return _contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        _reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSModuleDTO usertag(String value) {
        setUserTag(value);
        return this;
    }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) {
        _set(DTOFIELD_USERTAG2, value);
    }

    @JsonIgnore
    public String getUserTag2() {
        return (String) _get(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return _contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        _reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSModuleDTO usertag2(String value) {
        setUserTag2(value);
        return this;
    }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) {
        _set(DTOFIELD_USERTAG3, value);
    }

    @JsonIgnore
    public String getUserTag3() {
        return (String) _get(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return _contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        _reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSModuleDTO usertag3(String value) {
        setUserTag3(value);
        return this;
    }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) {
        _set(DTOFIELD_USERTAG4, value);
    }

    @JsonIgnore
    public String getUserTag4() {
        return (String) _get(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return _contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        _reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSModuleDTO usertag4(String value) {
        setUserTag4(value);
        return this;
    }

    @JsonProperty("utilparams")
    public void setUtilParams(String value) {
        _set(DTOFIELD_UTILPARAMS, value);
    }

    @JsonIgnore
    public String getUtilParams() {
        return (String) _get(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public boolean isUtilParamsDirty() {
        return _contains(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public void resetUtilParams() {
        _reset(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public PSModuleDTO utilparams(String value) {
        setUtilParams(value);
        return this;
    }

    @JsonProperty("utiltag")
    public void setUtilTag(String value) {
        _set(DTOFIELD_UTILTAG, value);
    }

    @JsonIgnore
    public String getUtilTag() {
        return (String) _get(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public boolean isUtilTagDirty() {
        return _contains(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public void resetUtilTag() {
        _reset(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public PSModuleDTO utiltag(String value) {
        setUtilTag(value);
        return this;
    }

    @JsonProperty("utiltype")
    public void setUtilType(String value) {
        _set(DTOFIELD_UTILTYPE, value);
    }

    @JsonIgnore
    public String getUtilType() {
        return (String) _get(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public boolean isUtilTypeDirty() {
        return _contains(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public void resetUtilType() {
        _reset(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public PSModuleDTO utiltype(String value) {
        setUtilType(value);
        return this;
    }

    @JsonIgnore
    public PSModuleDTO utiltype(PSModelEnums.ModuleUtilType value) {
        setUtilType(value == null ? null : value.value);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return getPSModuleId();
    }

    @JsonIgnore
    public void setId(String value) {
        setPSModuleId(value);
    }

    @JsonIgnore
    public PSModuleDTO id(String value) {
        setPSModuleId(value);
        return this;
    }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}