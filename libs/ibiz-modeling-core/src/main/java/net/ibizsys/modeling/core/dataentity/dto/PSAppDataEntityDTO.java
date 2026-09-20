package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Application data entity model DTO.
 */
public class PSAppDataEntityDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_ACCCTRLARCH = "ACCCTRLARCH";
    protected static final String DTOFIELD_ACCCTRLARCH = "accctrlarch";
    public static final String FIELD_BASECLSPARAMS = "BASECLSPARAMS";
    protected static final String DTOFIELD_BASECLSPARAMS = "baseclsparams";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMUSERACTION = "CUSTOMUSERACTION";
    protected static final String DTOFIELD_CUSTOMUSERACTION = "customuseraction";
    public static final String FIELD_DATAACCMODE = "DATAACCMODE";
    protected static final String DTOFIELD_DATAACCMODE = "dataaccmode";
    public static final String FIELD_DECODENAME = "DECODENAME";
    protected static final String DTOFIELD_DECODENAME = "decodename";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DEFGROUPMODE = "DEFGROUPMODE";
    protected static final String DTOFIELD_DEFGROUPMODE = "defgroupmode";
    public static final String FIELD_DELOGICNAME = "DELOGICNAME";
    protected static final String DTOFIELD_DELOGICNAME = "delogicname";
    public static final String FIELD_STORAGEMODE = "ENABLESTORAGE";
    protected static final String DTOFIELD_STORAGEMODE = "storagemode";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAJORFLAG = "MAJORFLAG";
    protected static final String DTOFIELD_MAJORFLAG = "majorflag";
    public static final String FIELD_MDPSDEVIEWID = "MDPSDEVIEWID";
    protected static final String DTOFIELD_MDPSDEVIEWID = "mdpsdeviewid";
    public static final String FIELD_MDPSDEVIEWNAME = "MDPSDEVIEWNAME";
    protected static final String DTOFIELD_MDPSDEVIEWNAME = "mdpsdeviewname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PPSAPPDATAENTITYID = "PPSAPPLOCALDEID";
    protected static final String DTOFIELD_PPSAPPDATAENTITYID = "ppsappdataentityid";
    public static final String FIELD_PPSAPPDATAENTITYNAME = "PPSAPPLOCALDENAME";
    protected static final String DTOFIELD_PPSAPPDATAENTITYNAME = "ppsappdataentityname";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSAPPMODULEID = "PSAPPMODULEID";
    protected static final String DTOFIELD_PSAPPMODULEID = "psappmoduleid";
    public static final String FIELD_PSAPPMODULENAME = "PSAPPMODULENAME";
    protected static final String DTOFIELD_PSAPPMODULENAME = "psappmodulename";
    public static final String FIELD_PSDEFGROUPID = "PSDEFGROUPID";
    protected static final String DTOFIELD_PSDEFGROUPID = "psdefgroupid";
    public static final String FIELD_PSDEFGROUPNAME = "PSDEFGROUPNAME";
    protected static final String DTOFIELD_PSDEFGROUPNAME = "psdefgroupname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDESERVICEAPIID = "PSDESERVICEAPIID";
    protected static final String DTOFIELD_PSDESERVICEAPIID = "psdeserviceapiid";
    public static final String FIELD_PSDESERVICEAPINAME = "PSDESERVICEAPINAME";
    protected static final String DTOFIELD_PSDESERVICEAPINAME = "psdeserviceapiname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_SDPSDEVIEWID = "SDPSDEVIEWID";
    protected static final String DTOFIELD_SDPSDEVIEWID = "sdpsdeviewid";
    public static final String FIELD_SDPSDEVIEWNAME = "SDPSDEVIEWNAME";
    protected static final String DTOFIELD_SDPSDEVIEWNAME = "sdpsdeviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERACTION = "USERACTION";
    protected static final String DTOFIELD_USERACTION = "useraction";
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

    @JsonProperty("accctrlarch")
    public void setAccCtrlArch(Integer value) { _set(DTOFIELD_ACCCTRLARCH, value); }
    @JsonIgnore public Integer getAccCtrlArch() { return (Integer) _get(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public boolean isAccCtrlArchDirty() { return _contains(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public void resetAccCtrlArch() { _reset(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public PSAppDataEntityDTO accctrlarch(Integer value) { setAccCtrlArch(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO accctrlarch(PSModelEnums.AccCtrlArch value) {
        setAccCtrlArch(value == null ? null : value.value); return this;
    }

    @JsonProperty("baseclsparams")
    public void setBaseClsParams(String value) { _set(DTOFIELD_BASECLSPARAMS, value); }
    @JsonIgnore public String getBaseClsParams() { return (String) _get(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public boolean isBaseClsParamsDirty() { return _contains(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public void resetBaseClsParams() { _reset(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public PSAppDataEntityDTO baseclsparams(String value) { setBaseClsParams(value); return this; }

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSAppDataEntityDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("codename2")
    public void setCodeName2(String value) { _set(DTOFIELD_CODENAME2, value); }
    @JsonIgnore public String getCodeName2() { return (String) _get(DTOFIELD_CODENAME2); }
    @JsonIgnore public boolean isCodeName2Dirty() { return _contains(DTOFIELD_CODENAME2); }
    @JsonIgnore public void resetCodeName2() { _reset(DTOFIELD_CODENAME2); }
    @JsonIgnore public PSAppDataEntityDTO codename2(String value) { setCodeName2(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSAppDataEntityDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSAppDataEntityDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("customuseraction")
    public void setCustomUserAction(Integer value) { _set(DTOFIELD_CUSTOMUSERACTION, value); }
    @JsonIgnore public Integer getCustomUserAction() { return (Integer) _get(DTOFIELD_CUSTOMUSERACTION); }
    @JsonIgnore public boolean isCustomUserActionDirty() { return _contains(DTOFIELD_CUSTOMUSERACTION); }
    @JsonIgnore public void resetCustomUserAction() { _reset(DTOFIELD_CUSTOMUSERACTION); }
    @JsonIgnore public PSAppDataEntityDTO customuseraction(Integer value) { setCustomUserAction(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO customuseraction(Boolean value) {
        setCustomUserAction(flagValue(value)); return this;
    }

    @JsonProperty("dataaccmode")
    public void setDataAccMode(Integer value) { _set(DTOFIELD_DATAACCMODE, value); }
    @JsonIgnore public Integer getDataAccMode() { return (Integer) _get(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public boolean isDataAccModeDirty() { return _contains(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public void resetDataAccMode() { _reset(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public PSAppDataEntityDTO dataaccmode(Integer value) { setDataAccMode(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO dataaccmode(PSModelEnums.DEDataAccCtrlMode value) {
        setDataAccMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("decodename")
    public void setDECodeName(String value) { _set(DTOFIELD_DECODENAME, value); }
    @JsonIgnore public String getDECodeName() { return (String) _get(DTOFIELD_DECODENAME); }
    @JsonIgnore public boolean isDECodeNameDirty() { return _contains(DTOFIELD_DECODENAME); }
    @JsonIgnore public void resetDECodeName() { _reset(DTOFIELD_DECODENAME); }
    @JsonIgnore public PSAppDataEntityDTO decodename(String value) { setDECodeName(value); return this; }

    @JsonProperty("defaultflag")
    public void setDefaultFlag(Integer value) { _set(DTOFIELD_DEFAULTFLAG, value); }
    @JsonIgnore public Integer getDefaultFlag() { return (Integer) _get(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public boolean isDefaultFlagDirty() { return _contains(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public void resetDefaultFlag() { _reset(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public PSAppDataEntityDTO defaultflag(Integer value) { setDefaultFlag(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO defaultflag(Boolean value) {
        setDefaultFlag(flagValue(value)); return this;
    }

    @JsonProperty("defgroupmode")
    public void setDEFGroupMode(String value) { _set(DTOFIELD_DEFGROUPMODE, value); }
    @JsonIgnore public String getDEFGroupMode() { return (String) _get(DTOFIELD_DEFGROUPMODE); }
    @JsonIgnore public boolean isDEFGroupModeDirty() { return _contains(DTOFIELD_DEFGROUPMODE); }
    @JsonIgnore public void resetDEFGroupMode() { _reset(DTOFIELD_DEFGROUPMODE); }
    @JsonIgnore public PSAppDataEntityDTO defgroupmode(String value) { setDEFGroupMode(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO defgroupmode(PSModelEnums.SADEDEFGroupMode value) {
        setDEFGroupMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("delogicname")
    public void setDELogicName(String value) { _set(DTOFIELD_DELOGICNAME, value); }
    @JsonIgnore public String getDELogicName() { return (String) _get(DTOFIELD_DELOGICNAME); }
    @JsonIgnore public boolean isDELogicNameDirty() { return _contains(DTOFIELD_DELOGICNAME); }
    @JsonIgnore public void resetDELogicName() { _reset(DTOFIELD_DELOGICNAME); }
    @JsonIgnore public PSAppDataEntityDTO delogicname(String value) { setDELogicName(value); return this; }

    @JsonProperty("storagemode")
    public void setStorageMode(Integer value) {
        _set(DTOFIELD_STORAGEMODE, value);
        _set(FIELD_STORAGEMODE, value);
    }
    @JsonIgnore public Integer getStorageMode() {
        Object value = _get(DTOFIELD_STORAGEMODE);
        return (Integer) (value == null ? _get(FIELD_STORAGEMODE) : value);
    }
    @JsonIgnore public boolean isStorageModeDirty() {
        return _contains(DTOFIELD_STORAGEMODE) || _contains(FIELD_STORAGEMODE);
    }
    @JsonIgnore public void resetStorageMode() {
        _reset(DTOFIELD_STORAGEMODE);
        _reset(FIELD_STORAGEMODE);
    }
    @JsonIgnore public PSAppDataEntityDTO storagemode(Integer value) { setStorageMode(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO storagemode(PSModelEnums.AppDEStorageMode value) {
        setStorageMode(value == null ? null : value.value); return this;
    }
    @JsonIgnore @Deprecated public Integer getEnableStorage() { return getStorageMode(); }
    @JsonIgnore @Deprecated public void setEnableStorage(Integer value) { setStorageMode(value); }
    @JsonIgnore @Deprecated public boolean isEnableStorageDirty() { return isStorageModeDirty(); }
    @JsonIgnore @Deprecated public void resetEnableStorage() { resetStorageMode(); }

    @JsonProperty("linkpsdeviewid")
    public void setLinkPSDEViewId(String value) { _set(DTOFIELD_LINKPSDEVIEWID, value); }
    @JsonIgnore public String getLinkPSDEViewId() { return (String) _get(DTOFIELD_LINKPSDEVIEWID); }
    @JsonIgnore public boolean isLinkPSDEViewIdDirty() { return _contains(DTOFIELD_LINKPSDEVIEWID); }
    @JsonIgnore public void resetLinkPSDEViewId() { _reset(DTOFIELD_LINKPSDEVIEWID); }
    @JsonIgnore public PSAppDataEntityDTO linkpsdeviewid(String value) { setLinkPSDEViewId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO linkpsdeviewid(PSDEViewBaseDTO value) {
        if (value == null) {
            setLinkPSDEViewId(null);
            setLinkPSDEViewName(null);
        } else {
            setLinkPSDEViewId(value.getPSDEViewBaseId());
            setLinkPSDEViewName(value.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty("linkpsdeviewname")
    public void setLinkPSDEViewName(String value) { _set(DTOFIELD_LINKPSDEVIEWNAME, value); }
    @JsonIgnore public String getLinkPSDEViewName() { return (String) _get(DTOFIELD_LINKPSDEVIEWNAME); }
    @JsonIgnore public boolean isLinkPSDEViewNameDirty() { return _contains(DTOFIELD_LINKPSDEVIEWNAME); }
    @JsonIgnore public void resetLinkPSDEViewName() { _reset(DTOFIELD_LINKPSDEVIEWNAME); }
    @JsonIgnore public PSAppDataEntityDTO linkpsdeviewname(String value) { setLinkPSDEViewName(value); return this; }

    @JsonProperty("lnpslanresid")
    public void setLNPSLanResId(String value) { _set(DTOFIELD_LNPSLANRESID, value); }
    @JsonIgnore public String getLNPSLanResId() { return (String) _get(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public boolean isLNPSLanResIdDirty() { return _contains(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public void resetLNPSLanResId() { _reset(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public PSAppDataEntityDTO lnpslanresid(String value) { setLNPSLanResId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO lnpslanresid(PSLanguageResDTO value) {
        if (value == null) {
            setLNPSLanResId(null);
            setLNPSLanResName(null);
        } else {
            setLNPSLanResId(value.getPSLanguageResId());
            setLNPSLanResName(value.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty("lnpslanresname")
    public void setLNPSLanResName(String value) { _set(DTOFIELD_LNPSLANRESNAME, value); }
    @JsonIgnore public String getLNPSLanResName() { return (String) _get(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public boolean isLNPSLanResNameDirty() { return _contains(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public void resetLNPSLanResName() { _reset(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public PSAppDataEntityDTO lnpslanresname(String value) { setLNPSLanResName(value); return this; }

    @JsonProperty("logicname")
    public void setLogicName(String value) { _set(DTOFIELD_LOGICNAME, value); }
    @JsonIgnore public String getLogicName() { return (String) _get(DTOFIELD_LOGICNAME); }
    @JsonIgnore public boolean isLogicNameDirty() { return _contains(DTOFIELD_LOGICNAME); }
    @JsonIgnore public void resetLogicName() { _reset(DTOFIELD_LOGICNAME); }
    @JsonIgnore public PSAppDataEntityDTO logicname(String value) { setLogicName(value); return this; }

    @JsonProperty("majorflag")
    public void setMajorFlag(Integer value) { _set(DTOFIELD_MAJORFLAG, value); }
    @JsonIgnore public Integer getMajorFlag() { return (Integer) _get(DTOFIELD_MAJORFLAG); }
    @JsonIgnore public boolean isMajorFlagDirty() { return _contains(DTOFIELD_MAJORFLAG); }
    @JsonIgnore public void resetMajorFlag() { _reset(DTOFIELD_MAJORFLAG); }
    @JsonIgnore public PSAppDataEntityDTO majorflag(Integer value) { setMajorFlag(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO majorflag(PSModelEnums.AppDEMode value) {
        setMajorFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("mdpsdeviewid")
    public void setMDPSDEViewId(String value) { _set(DTOFIELD_MDPSDEVIEWID, value); }
    @JsonIgnore public String getMDPSDEViewId() { return (String) _get(DTOFIELD_MDPSDEVIEWID); }
    @JsonIgnore public boolean isMDPSDEViewIdDirty() { return _contains(DTOFIELD_MDPSDEVIEWID); }
    @JsonIgnore public void resetMDPSDEViewId() { _reset(DTOFIELD_MDPSDEVIEWID); }
    @JsonIgnore public PSAppDataEntityDTO mdpsdeviewid(String value) { setMDPSDEViewId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO mdpsdeviewid(PSDEViewBaseDTO value) {
        if (value == null) {
            setMDPSDEViewId(null);
            setMDPSDEViewName(null);
        } else {
            setMDPSDEViewId(value.getPSDEViewBaseId());
            setMDPSDEViewName(value.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty("mdpsdeviewname")
    public void setMDPSDEViewName(String value) { _set(DTOFIELD_MDPSDEVIEWNAME, value); }
    @JsonIgnore public String getMDPSDEViewName() { return (String) _get(DTOFIELD_MDPSDEVIEWNAME); }
    @JsonIgnore public boolean isMDPSDEViewNameDirty() { return _contains(DTOFIELD_MDPSDEVIEWNAME); }
    @JsonIgnore public void resetMDPSDEViewName() { _reset(DTOFIELD_MDPSDEVIEWNAME); }
    @JsonIgnore public PSAppDataEntityDTO mdpsdeviewname(String value) { setMDPSDEViewName(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSAppDataEntityDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("ppsappdataentityid")
    public void setPPSAppDataEntityId(String value) {
        _set(DTOFIELD_PPSAPPDATAENTITYID, value);
        _set(FIELD_PPSAPPDATAENTITYID, value);
    }
    @JsonIgnore public String getPPSAppDataEntityId() {
        Object value = _get(DTOFIELD_PPSAPPDATAENTITYID);
        return (String) (value == null ? _get(FIELD_PPSAPPDATAENTITYID) : value);
    }
    @JsonIgnore public boolean isPPSAppDataEntityIdDirty() {
        return _contains(DTOFIELD_PPSAPPDATAENTITYID) || _contains(FIELD_PPSAPPDATAENTITYID);
    }
    @JsonIgnore public void resetPPSAppDataEntityId() {
        _reset(DTOFIELD_PPSAPPDATAENTITYID);
        _reset(FIELD_PPSAPPDATAENTITYID);
    }
    @JsonIgnore public PSAppDataEntityDTO ppsappdataentityid(String value) {
        setPPSAppDataEntityId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO ppsappdataentityid(PSAppDataEntityDTO value) {
        if (value == null) {
            setPPSAppDataEntityId(null);
            setPPSAppDataEntityName(null);
        } else {
            setPPSAppDataEntityId(value.getPSAppDataEntityId());
            setPPSAppDataEntityName(value.getPSAppDataEntityName());
        }
        return this;
    }
    @JsonIgnore @Deprecated public String getPPSAppLocalDEId() { return getPPSAppDataEntityId(); }
    @JsonIgnore @Deprecated public void setPPSAppLocalDEId(String value) { setPPSAppDataEntityId(value); }
    @JsonIgnore @Deprecated public boolean isPPSAppLocalDEIdDirty() { return isPPSAppDataEntityIdDirty(); }
    @JsonIgnore @Deprecated public void resetPPSAppLocalDEId() { resetPPSAppDataEntityId(); }

    @JsonProperty("ppsappdataentityname")
    public void setPPSAppDataEntityName(String value) {
        _set(DTOFIELD_PPSAPPDATAENTITYNAME, value);
        _set(FIELD_PPSAPPDATAENTITYNAME, value);
    }
    @JsonIgnore public String getPPSAppDataEntityName() {
        Object value = _get(DTOFIELD_PPSAPPDATAENTITYNAME);
        return (String) (value == null ? _get(FIELD_PPSAPPDATAENTITYNAME) : value);
    }
    @JsonIgnore public boolean isPPSAppDataEntityNameDirty() {
        return _contains(DTOFIELD_PPSAPPDATAENTITYNAME) || _contains(FIELD_PPSAPPDATAENTITYNAME);
    }
    @JsonIgnore public void resetPPSAppDataEntityName() {
        _reset(DTOFIELD_PPSAPPDATAENTITYNAME);
        _reset(FIELD_PPSAPPDATAENTITYNAME);
    }
    @JsonIgnore public PSAppDataEntityDTO ppsappdataentityname(String value) {
        setPPSAppDataEntityName(value); return this;
    }
    @JsonIgnore @Deprecated public String getPPSAppLocalDEName() { return getPPSAppDataEntityName(); }
    @JsonIgnore @Deprecated public void setPPSAppLocalDEName(String value) { setPPSAppDataEntityName(value); }
    @JsonIgnore @Deprecated public boolean isPPSAppLocalDENameDirty() { return isPPSAppDataEntityNameDirty(); }
    @JsonIgnore @Deprecated public void resetPPSAppLocalDEName() { resetPPSAppDataEntityName(); }

    @JsonProperty("psappdataentityid")
    public void setPSAppDataEntityId(String value) {
        _set(DTOFIELD_PSAPPDATAENTITYID, value);
        _set(FIELD_PSAPPDATAENTITYID, value);
    }
    @JsonIgnore public String getPSAppDataEntityId() {
        Object value = _get(DTOFIELD_PSAPPDATAENTITYID);
        return (String) (value == null ? _get(FIELD_PSAPPDATAENTITYID) : value);
    }
    @JsonIgnore public boolean isPSAppDataEntityIdDirty() {
        return _contains(DTOFIELD_PSAPPDATAENTITYID) || _contains(FIELD_PSAPPDATAENTITYID);
    }
    @JsonIgnore public void resetPSAppDataEntityId() {
        _reset(DTOFIELD_PSAPPDATAENTITYID);
        _reset(FIELD_PSAPPDATAENTITYID);
    }
    @JsonIgnore public PSAppDataEntityDTO psappdataentityid(String value) {
        setPSAppDataEntityId(value); return this;
    }
    @JsonIgnore @Deprecated public String getPSAppLocalDEId() { return getPSAppDataEntityId(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEId(String value) { setPSAppDataEntityId(value); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDEIdDirty() { return isPSAppDataEntityIdDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEId() { resetPSAppDataEntityId(); }

    @JsonProperty("psappdataentityname")
    public void setPSAppDataEntityName(String value) {
        _set(DTOFIELD_PSAPPDATAENTITYNAME, value);
        _set(FIELD_PSAPPDATAENTITYNAME, value);
    }
    @JsonIgnore public String getPSAppDataEntityName() {
        Object value = _get(DTOFIELD_PSAPPDATAENTITYNAME);
        return (String) (value == null ? _get(FIELD_PSAPPDATAENTITYNAME) : value);
    }
    @JsonIgnore public boolean isPSAppDataEntityNameDirty() {
        return _contains(DTOFIELD_PSAPPDATAENTITYNAME) || _contains(FIELD_PSAPPDATAENTITYNAME);
    }
    @JsonIgnore public void resetPSAppDataEntityName() {
        _reset(DTOFIELD_PSAPPDATAENTITYNAME);
        _reset(FIELD_PSAPPDATAENTITYNAME);
    }
    @JsonIgnore public PSAppDataEntityDTO psappdataentityname(String value) {
        setPSAppDataEntityName(value); return this;
    }
    @JsonIgnore @Deprecated public String getPSAppLocalDEName() { return getPSAppDataEntityName(); }
    @JsonIgnore @Deprecated public void setPSAppLocalDEName(String value) { setPSAppDataEntityName(value); }
    @JsonIgnore @Deprecated public boolean isPSAppLocalDENameDirty() { return isPSAppDataEntityNameDirty(); }
    @JsonIgnore @Deprecated public void resetPSAppLocalDEName() { resetPSAppDataEntityName(); }

    @JsonIgnore public String getName() { return getPSAppDataEntityName(); }
    @JsonIgnore public void setName(String value) { setPSAppDataEntityName(value); }
    @JsonIgnore public PSAppDataEntityDTO name(String value) { setPSAppDataEntityName(value); return this; }

    @JsonProperty("psappmoduleid")
    public void setPSAppModuleId(String value) { _set(DTOFIELD_PSAPPMODULEID, value); }
    @JsonIgnore public String getPSAppModuleId() { return (String) _get(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public boolean isPSAppModuleIdDirty() { return _contains(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public void resetPSAppModuleId() { _reset(DTOFIELD_PSAPPMODULEID); }
    @JsonIgnore public PSAppDataEntityDTO psappmoduleid(String value) { setPSAppModuleId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO psappmoduleid(PSAppModuleDTO value) {
        if (value == null) {
            setPSAppModuleId(null);
            setPSAppModuleName(null);
        } else {
            setPSAppModuleId(value.getPSAppModuleId());
            setPSAppModuleName(value.getPSAppModuleName());
        }
        return this;
    }

    @JsonProperty("psappmodulename")
    public void setPSAppModuleName(String value) { _set(DTOFIELD_PSAPPMODULENAME, value); }
    @JsonIgnore public String getPSAppModuleName() { return (String) _get(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public boolean isPSAppModuleNameDirty() { return _contains(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public void resetPSAppModuleName() { _reset(DTOFIELD_PSAPPMODULENAME); }
    @JsonIgnore public PSAppDataEntityDTO psappmodulename(String value) {
        setPSAppModuleName(value); return this;
    }

    @JsonProperty("psdefgroupid")
    public void setPSDEFGroupId(String value) { _set(DTOFIELD_PSDEFGROUPID, value); }
    @JsonIgnore public String getPSDEFGroupId() { return (String) _get(DTOFIELD_PSDEFGROUPID); }
    @JsonIgnore public boolean isPSDEFGroupIdDirty() { return _contains(DTOFIELD_PSDEFGROUPID); }
    @JsonIgnore public void resetPSDEFGroupId() { _reset(DTOFIELD_PSDEFGROUPID); }
    @JsonIgnore public PSAppDataEntityDTO psdefgroupid(String value) { setPSDEFGroupId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO psdefgroupid(PSDEFGroupDTO value) {
        if (value == null) {
            setPSDEFGroupId(null);
            setPSDEFGroupName(null);
        } else {
            setPSDEFGroupId(value.getPSDEFGroupId());
            setPSDEFGroupName(value.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty("psdefgroupname")
    public void setPSDEFGroupName(String value) { _set(DTOFIELD_PSDEFGROUPNAME, value); }
    @JsonIgnore public String getPSDEFGroupName() { return (String) _get(DTOFIELD_PSDEFGROUPNAME); }
    @JsonIgnore public boolean isPSDEFGroupNameDirty() { return _contains(DTOFIELD_PSDEFGROUPNAME); }
    @JsonIgnore public void resetPSDEFGroupName() { _reset(DTOFIELD_PSDEFGROUPNAME); }
    @JsonIgnore public PSAppDataEntityDTO psdefgroupname(String value) {
        setPSDEFGroupName(value); return this;
    }

    @JsonProperty("psdeid")
    public void setPSDEId(String value) { _set(DTOFIELD_PSDEID, value); }
    @JsonIgnore public String getPSDEId() { return (String) _get(DTOFIELD_PSDEID); }
    @JsonIgnore public boolean isPSDEIdDirty() { return _contains(DTOFIELD_PSDEID); }
    @JsonIgnore public void resetPSDEId() { _reset(DTOFIELD_PSDEID); }
    @JsonIgnore public PSAppDataEntityDTO psdeid(String value) { setPSDEId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO psdeid(PSDataEntityDTO value) {
        if (value == null) {
            setDECodeName(null);
            setDELogicName(null);
            setPSDEId(null);
            setPSDEName(null);
            setPSModuleId(null);
        } else {
            setDECodeName(value.getCodeName());
            setDELogicName(value.getLogicName());
            setPSDEId(value.getPSDataEntityId());
            setPSDEName(value.getPSDataEntityName());
            setPSModuleId(value.getPSModuleId());
        }
        return this;
    }

    @JsonProperty("psdename")
    public void setPSDEName(String value) { _set(DTOFIELD_PSDENAME, value); }
    @JsonIgnore public String getPSDEName() { return (String) _get(DTOFIELD_PSDENAME); }
    @JsonIgnore public boolean isPSDENameDirty() { return _contains(DTOFIELD_PSDENAME); }
    @JsonIgnore public void resetPSDEName() { _reset(DTOFIELD_PSDENAME); }
    @JsonIgnore public PSAppDataEntityDTO psdename(String value) { setPSDEName(value); return this; }

    @JsonProperty("psderid")
    public void setPSDERId(String value) { _set(DTOFIELD_PSDERID, value); }
    @JsonIgnore public String getPSDERId() { return (String) _get(DTOFIELD_PSDERID); }
    @JsonIgnore public boolean isPSDERIdDirty() { return _contains(DTOFIELD_PSDERID); }
    @JsonIgnore public void resetPSDERId() { _reset(DTOFIELD_PSDERID); }
    @JsonIgnore public PSAppDataEntityDTO psderid(String value) { setPSDERId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO psderid(PSDERDTO value) {
        if (value == null) {
            setPSDERId(null);
            setPSDERName(null);
        } else {
            setPSDERId(value.getPSDERId());
            setPSDERName(value.getPSDERName());
        }
        return this;
    }

    @JsonProperty("psdername")
    public void setPSDERName(String value) { _set(DTOFIELD_PSDERNAME, value); }
    @JsonIgnore public String getPSDERName() { return (String) _get(DTOFIELD_PSDERNAME); }
    @JsonIgnore public boolean isPSDERNameDirty() { return _contains(DTOFIELD_PSDERNAME); }
    @JsonIgnore public void resetPSDERName() { _reset(DTOFIELD_PSDERNAME); }
    @JsonIgnore public PSAppDataEntityDTO psdername(String value) { setPSDERName(value); return this; }

    @JsonProperty("psdeserviceapiid")
    public void setPSDEServiceAPIId(String value) { _set(DTOFIELD_PSDESERVICEAPIID, value); }
    @JsonIgnore public String getPSDEServiceAPIId() { return (String) _get(DTOFIELD_PSDESERVICEAPIID); }
    @JsonIgnore public boolean isPSDEServiceAPIIdDirty() { return _contains(DTOFIELD_PSDESERVICEAPIID); }
    @JsonIgnore public void resetPSDEServiceAPIId() { _reset(DTOFIELD_PSDESERVICEAPIID); }
    @JsonIgnore public PSAppDataEntityDTO psdeserviceapiid(String value) {
        setPSDEServiceAPIId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO psdeserviceapiid(PSDEServiceAPIDTO value) {
        if (value == null) {
            setPSDEServiceAPIId(null);
            setPSDEServiceAPIName(null);
        } else {
            setPSDEServiceAPIId(value.getPSDEServiceAPIId());
            setPSDEServiceAPIName(value.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty("psdeserviceapiname")
    public void setPSDEServiceAPIName(String value) { _set(DTOFIELD_PSDESERVICEAPINAME, value); }
    @JsonIgnore public String getPSDEServiceAPIName() { return (String) _get(DTOFIELD_PSDESERVICEAPINAME); }
    @JsonIgnore public boolean isPSDEServiceAPINameDirty() { return _contains(DTOFIELD_PSDESERVICEAPINAME); }
    @JsonIgnore public void resetPSDEServiceAPIName() { _reset(DTOFIELD_PSDESERVICEAPINAME); }
    @JsonIgnore public PSAppDataEntityDTO psdeserviceapiname(String value) {
        setPSDEServiceAPIName(value); return this;
    }

    @JsonProperty("psmoduleid")
    public void setPSModuleId(String value) { _set(DTOFIELD_PSMODULEID, value); }
    @JsonIgnore public String getPSModuleId() { return (String) _get(DTOFIELD_PSMODULEID); }
    @JsonIgnore public boolean isPSModuleIdDirty() { return _contains(DTOFIELD_PSMODULEID); }
    @JsonIgnore public void resetPSModuleId() { _reset(DTOFIELD_PSMODULEID); }
    @JsonIgnore public PSAppDataEntityDTO psmoduleid(String value) { setPSModuleId(value); return this; }

    @JsonProperty("pssysappid")
    public void setPSSysAppId(String value) { _set(DTOFIELD_PSSYSAPPID, value); }
    @JsonIgnore public String getPSSysAppId() { return (String) _get(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public boolean isPSSysAppIdDirty() { return _contains(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public void resetPSSysAppId() { _reset(DTOFIELD_PSSYSAPPID); }
    @JsonIgnore public PSAppDataEntityDTO pssysappid(String value) { setPSSysAppId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO pssysappid(PSSysAppDTO value) {
        if (value == null) {
            setPSSysAppId(null);
            setPSSysAppName(null);
        } else {
            setPSSysAppId(value.getPSSysAppId());
            setPSSysAppName(value.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty("pssysappname")
    public void setPSSysAppName(String value) { _set(DTOFIELD_PSSYSAPPNAME, value); }
    @JsonIgnore public String getPSSysAppName() { return (String) _get(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public boolean isPSSysAppNameDirty() { return _contains(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public void resetPSSysAppName() { _reset(DTOFIELD_PSSYSAPPNAME); }
    @JsonIgnore public PSAppDataEntityDTO pssysappname(String value) { setPSSysAppName(value); return this; }

    @JsonProperty("pssysdynamodelid")
    public void setPSSysDynaModelId(String value) { _set(DTOFIELD_PSSYSDYNAMODELID, value); }
    @JsonIgnore public String getPSSysDynaModelId() { return (String) _get(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public boolean isPSSysDynaModelIdDirty() { return _contains(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public void resetPSSysDynaModelId() { _reset(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public PSAppDataEntityDTO pssysdynamodelid(String value) {
        setPSSysDynaModelId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO pssysdynamodelid(PSSysDynaModelDTO value) {
        if (value == null) {
            setPSSysDynaModelId(null);
            setPSSysDynaModelName(null);
        } else {
            setPSSysDynaModelId(value.getPSSysDynaModelId());
            setPSSysDynaModelName(value.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty("pssysdynamodelname")
    public void setPSSysDynaModelName(String value) { _set(DTOFIELD_PSSYSDYNAMODELNAME, value); }
    @JsonIgnore public String getPSSysDynaModelName() { return (String) _get(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public boolean isPSSysDynaModelNameDirty() { return _contains(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public void resetPSSysDynaModelName() { _reset(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public PSAppDataEntityDTO pssysdynamodelname(String value) {
        setPSSysDynaModelName(value); return this;
    }

    @JsonProperty("pssysreqitemid")
    public void setPSSysReqItemId(String value) { _set(DTOFIELD_PSSYSREQITEMID, value); }
    @JsonIgnore public String getPSSysReqItemId() { return (String) _get(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public boolean isPSSysReqItemIdDirty() { return _contains(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public void resetPSSysReqItemId() { _reset(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public PSAppDataEntityDTO pssysreqitemid(String value) {
        setPSSysReqItemId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO pssysreqitemid(PSSysReqItemDTO value) {
        if (value == null) {
            setPSSysReqItemId(null);
            setPSSysReqItemName(null);
        } else {
            setPSSysReqItemId(value.getPSSysReqItemId());
            setPSSysReqItemName(value.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty("pssysreqitemname")
    public void setPSSysReqItemName(String value) { _set(DTOFIELD_PSSYSREQITEMNAME, value); }
    @JsonIgnore public String getPSSysReqItemName() { return (String) _get(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public boolean isPSSysReqItemNameDirty() { return _contains(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public void resetPSSysReqItemName() { _reset(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public PSAppDataEntityDTO pssysreqitemname(String value) {
        setPSSysReqItemName(value); return this;
    }

    @JsonProperty("pssysserviceapiid")
    public void setPSSysServiceAPIId(String value) { _set(DTOFIELD_PSSYSSERVICEAPIID, value); }
    @JsonIgnore public String getPSSysServiceAPIId() { return (String) _get(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public boolean isPSSysServiceAPIIdDirty() { return _contains(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public void resetPSSysServiceAPIId() { _reset(DTOFIELD_PSSYSSERVICEAPIID); }
    @JsonIgnore public PSAppDataEntityDTO pssysserviceapiid(String value) {
        setPSSysServiceAPIId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO pssysserviceapiid(PSSysServiceAPIDTO value) {
        if (value == null) {
            setPSSysServiceAPIId(null);
            setPSSysServiceAPIName(null);
        } else {
            setPSSysServiceAPIId(value.getPSSysServiceAPIId());
            setPSSysServiceAPIName(value.getPSSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty("pssysserviceapiname")
    public void setPSSysServiceAPIName(String value) { _set(DTOFIELD_PSSYSSERVICEAPINAME, value); }
    @JsonIgnore public String getPSSysServiceAPIName() { return (String) _get(DTOFIELD_PSSYSSERVICEAPINAME); }
    @JsonIgnore public boolean isPSSysServiceAPINameDirty() { return _contains(DTOFIELD_PSSYSSERVICEAPINAME); }
    @JsonIgnore public void resetPSSysServiceAPIName() { _reset(DTOFIELD_PSSYSSERVICEAPINAME); }
    @JsonIgnore public PSAppDataEntityDTO pssysserviceapiname(String value) {
        setPSSysServiceAPIName(value); return this;
    }

    @JsonProperty("pssyssfpluginid")
    public void setPSSysSFPluginId(String value) { _set(DTOFIELD_PSSYSSFPLUGINID, value); }
    @JsonIgnore public String getPSSysSFPluginId() { return (String) _get(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public boolean isPSSysSFPluginIdDirty() { return _contains(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public void resetPSSysSFPluginId() { _reset(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public PSAppDataEntityDTO pssyssfpluginid(String value) {
        setPSSysSFPluginId(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO pssyssfpluginid(PSSysSFPluginDTO value) {
        if (value == null) {
            setPSSysSFPluginId(null);
            setPSSysSFPluginName(null);
        } else {
            setPSSysSFPluginId(value.getPSSysSFPluginId());
            setPSSysSFPluginName(value.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty("pssyssfpluginname")
    public void setPSSysSFPluginName(String value) { _set(DTOFIELD_PSSYSSFPLUGINNAME, value); }
    @JsonIgnore public String getPSSysSFPluginName() { return (String) _get(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public boolean isPSSysSFPluginNameDirty() { return _contains(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public void resetPSSysSFPluginName() { _reset(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public PSAppDataEntityDTO pssyssfpluginname(String value) {
        setPSSysSFPluginName(value); return this;
    }

    @JsonProperty("pssysuniresid")
    public void setPSSysUniResId(String value) { _set(DTOFIELD_PSSYSUNIRESID, value); }
    @JsonIgnore public String getPSSysUniResId() { return (String) _get(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public boolean isPSSysUniResIdDirty() { return _contains(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public void resetPSSysUniResId() { _reset(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public PSAppDataEntityDTO pssysuniresid(String value) { setPSSysUniResId(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO pssysuniresid(PSSysUniResDTO value) {
        if (value == null) {
            setPSSysUniResId(null);
            setPSSysUniResName(null);
        } else {
            setPSSysUniResId(value.getPSSysUniResId());
            setPSSysUniResName(value.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty("pssysuniresname")
    public void setPSSysUniResName(String value) { _set(DTOFIELD_PSSYSUNIRESNAME, value); }
    @JsonIgnore public String getPSSysUniResName() { return (String) _get(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public boolean isPSSysUniResNameDirty() { return _contains(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public void resetPSSysUniResName() { _reset(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public PSAppDataEntityDTO pssysuniresname(String value) {
        setPSSysUniResName(value); return this;
    }

    @JsonProperty("sdpsdeviewid")
    public void setSDPSDEViewID(String value) { _set(DTOFIELD_SDPSDEVIEWID, value); }
    @JsonIgnore public String getSDPSDEViewID() { return (String) _get(DTOFIELD_SDPSDEVIEWID); }
    @JsonIgnore public boolean isSDPSDEViewIDDirty() { return _contains(DTOFIELD_SDPSDEVIEWID); }
    @JsonIgnore public void resetSDPSDEViewID() { _reset(DTOFIELD_SDPSDEVIEWID); }
    @JsonIgnore public PSAppDataEntityDTO sdpsdeviewid(String value) {
        setSDPSDEViewID(value); return this;
    }
    @JsonIgnore public PSAppDataEntityDTO sdpsdeviewid(PSDEViewBaseDTO value) {
        if (value == null) {
            setSDPSDEViewID(null);
            setSDPSDEViewName(null);
        } else {
            setSDPSDEViewID(value.getPSDEViewBaseId());
            setSDPSDEViewName(value.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty("sdpsdeviewname")
    public void setSDPSDEViewName(String value) { _set(DTOFIELD_SDPSDEVIEWNAME, value); }
    @JsonIgnore public String getSDPSDEViewName() { return (String) _get(DTOFIELD_SDPSDEVIEWNAME); }
    @JsonIgnore public boolean isSDPSDEViewNameDirty() { return _contains(DTOFIELD_SDPSDEVIEWNAME); }
    @JsonIgnore public void resetSDPSDEViewName() { _reset(DTOFIELD_SDPSDEVIEWNAME); }
    @JsonIgnore public PSAppDataEntityDTO sdpsdeviewname(String value) {
        setSDPSDEViewName(value); return this;
    }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSAppDataEntityDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSAppDataEntityDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("useraction")
    public void setUserAction(Integer value) { _set(DTOFIELD_USERACTION, value); }
    @JsonIgnore public Integer getUserAction() { return (Integer) _get(DTOFIELD_USERACTION); }
    @JsonIgnore public boolean isUserActionDirty() { return _contains(DTOFIELD_USERACTION); }
    @JsonIgnore public void resetUserAction() { _reset(DTOFIELD_USERACTION); }
    @JsonIgnore public PSAppDataEntityDTO useraction(Integer value) { setUserAction(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO useraction(PSModelEnums.DEUserUIAbility[] value) {
        if (value == null || value.length == 0) {
            setUserAction(null);
        } else {
            int result = 0;
            for (PSModelEnums.DEUserUIAbility item : value) {
                if (item != null) {
                    result |= item.value;
                }
            }
            setUserAction(result);
        }
        return this;
    }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSAppDataEntityDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value); return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSAppDataEntityDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSAppDataEntityDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSAppDataEntityDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSAppDataEntityDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSAppDataEntityDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSAppDataEntityDTO validflag(Boolean value) {
        setValidFlag(flagValue(value)); return this;
    }

    @JsonIgnore public String getId() { return getPSAppDataEntityId(); }
    @JsonIgnore public void setId(String value) { setPSAppDataEntityId(value); }
    @JsonIgnore public PSAppDataEntityDTO id(String value) { setPSAppDataEntityId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}