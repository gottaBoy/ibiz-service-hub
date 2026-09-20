package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Data entity model DTO.
 *
 * <p>The original modeling service exposes DTOs backed by {@code EntityDTO}'s
 * attribute map. This source implementation keeps that contract, including
 * dirty tracking and the generated-style fluent methods.</p>
 */
public class PSDataEntityDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_ACCCTRLARCH = "ACCCTRLARCH";
    protected static final String DTOFIELD_ACCCTRLARCH = "accctrlarch";
    public static final String FIELD_AUDITMODE = "AUDITMODE";
    protected static final String DTOFIELD_AUDITMODE = "auditmode";
    public static final String FIELD_BASECLSPARAMS = "BASECLSPARAMS";
    protected static final String DTOFIELD_BASECLSPARAMS = "baseclsparams";
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
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATAACCMODE = "DATAACCMODE";
    protected static final String DTOFIELD_DATAACCMODE = "dataaccmode";
    public static final String FIELD_DATACHGLOGMODE = "DATACHGLOGMODE";
    protected static final String DTOFIELD_DATACHGLOGMODE = "datachglogmode";
    public static final String FIELD_DATAIMPEXPFLAG = "DATAIMPEXPFLAG";
    protected static final String DTOFIELD_DATAIMPEXPFLAG = "dataimpexpflag";
    public static final String FIELD_DELOCKFLAG = "DELOCKFLAG";
    protected static final String DTOFIELD_DELOCKFLAG = "delockflag";
    public static final String FIELD_DESN = "DESN";
    protected static final String DTOFIELD_DESN = "desn";
    public static final String FIELD_DETAG = "DETAG";
    protected static final String DTOFIELD_DETAG = "detag";
    public static final String FIELD_DETAG2 = "DETAG2";
    protected static final String DTOFIELD_DETAG2 = "detag2";
    public static final String FIELD_DETYPE = "DETYPE";
    protected static final String DTOFIELD_DETYPE = "detype";
    public static final String FIELD_DSLINK = "DSLINK";
    protected static final String DTOFIELD_DSLINK = "dslink";
    public static final String FIELD_DYNAMICMODE = "DYNAMICMODE";
    protected static final String DTOFIELD_DYNAMICMODE = "dynamicmode";
    public static final String FIELD_ENABLEAUDIT = "ENABLEAUDIT";
    protected static final String DTOFIELD_ENABLEAUDIT = "enableaudit";
    public static final String FIELD_ENABLEDATAVER = "ENABLEDATAVER";
    protected static final String DTOFIELD_ENABLEDATAVER = "enabledataver";
    public static final String FIELD_ENABLEDEACTION = "ENABLEDEACTION";
    protected static final String DTOFIELD_ENABLEDEACTION = "enabledeaction";
    public static final String FIELD_ENABLEDEDATASET = "ENABLEDEDATASET";
    protected static final String DTOFIELD_ENABLEDEDATASET = "enablededataset";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENABLEENTITYCACHE = "ENABLEENTITYCACHE";
    protected static final String DTOFIELD_ENABLEENTITYCACHE = "enableentitycache";
    public static final String FIELD_ENABLEMOB = "ENABLEMOB";
    protected static final String DTOFIELD_ENABLEMOB = "enablemob";
    public static final String FIELD_ENABLEOPNAMEMODEL = "ENABLEOPNAMEMODEL";
    protected static final String DTOFIELD_ENABLEOPNAMEMODEL = "enableopnamemodel";
    public static final String FIELD_ENABLEORGMODEL = "ENABLEORGMODEL";
    protected static final String DTOFIELD_ENABLEORGMODEL = "enableorgmodel";
    public static final String FIELD_ENABLEPQL = "ENABLEPQL";
    protected static final String DTOFIELD_ENABLEPQL = "enablepql";
    public static final String FIELD_ENABLESELECT = "ENABLESELECT";
    protected static final String DTOFIELD_ENABLESELECT = "enableselect";
    public static final String FIELD_ENABLEWFMODEL = "ENABLEWFMODEL";
    protected static final String DTOFIELD_ENABLEWFMODEL = "enablewfmodel";
    public static final String FIELD_ENAMULTIFORM = "ENAMULTIFORM";
    protected static final String DTOFIELD_ENAMULTIFORM = "enamultiform";
    public static final String FIELD_ENATEMPDATA = "ENATEMPDATA";
    protected static final String DTOFIELD_ENATEMPDATA = "enatempdata";
    public static final String FIELD_ENTITYCACHETIMEOUT = "ENTITYCACHETIMEOUT";
    protected static final String DTOFIELD_ENTITYCACHETIMEOUT = "entitycachetimeout";
    public static final String FIELD_EXISTINGMODEL = "EXISTINGMODEL";
    protected static final String DTOFIELD_EXISTINGMODEL = "existingmodel";
    public static final String FIELD_INDEXDETYPE = "INDEXDETYPE";
    protected static final String DTOFIELD_INDEXDETYPE = "indexdetype";
    public static final String FIELD_KEYRULE = "KEYRULE";
    protected static final String DTOFIELD_KEYRULE = "keyrule";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_LOGICINVALIDVALUE = "LOGICINVALIDVALUE";
    protected static final String DTOFIELD_LOGICINVALIDVALUE = "logicinvalidvalue";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_LOGICVALID = "LOGICVALID";
    protected static final String DTOFIELD_LOGICVALID = "logicvalid";
    public static final String FIELD_LOGICVALIDVALUE = "LOGICVALIDVALUE";
    protected static final String DTOFIELD_LOGICVALIDVALUE = "logicvalidvalue";
    public static final String FIELD_MAXENTITYCACHECNT = "MAXENTITYCACHECNT";
    protected static final String DTOFIELD_MAXENTITYCACHECNT = "maxentitycachecnt";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_MSACTIONLOGICFLAG = "MSACTIONLOGICFLAG";
    protected static final String DTOFIELD_MSACTIONLOGICFLAG = "msactionlogicflag";
    public static final String FIELD_NOVIEWMODE = "NOVIEWMODE";
    protected static final String DTOFIELD_NOVIEWMODE = "noviewmode";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDATAENTITYID = "PSDATAENTITYID";
    protected static final String DTOFIELD_PSDATAENTITYID = "psdataentityid";
    public static final String FIELD_PSDATAENTITYNAME = "PSDATAENTITYNAME";
    protected static final String DTOFIELD_PSDATAENTITYNAME = "psdataentityname";
    public static final String FIELD_PSDEFINPUTTIPSETID = "PSDEFINPUTTIPSETID";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";
    public static final String FIELD_PSDEFINPUTTIPSETNAME = "PSDEFINPUTTIPSETNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";
    public static final String FIELD_PSDYNADETEMPLID = "PSDYNADETEMPLID";
    protected static final String DTOFIELD_PSDYNADETEMPLID = "psdynadetemplid";
    public static final String FIELD_PSDYNADETEMPLNAME = "PSDYNADETEMPLNAME";
    protected static final String DTOFIELD_PSDYNADETEMPLNAME = "psdynadetemplname";
    public static final String FIELD_PSHELPMODULEID = "PSHELPMODULEID";
    protected static final String DTOFIELD_PSHELPMODULEID = "pshelpmoduleid";
    public static final String FIELD_PSHELPMODULENAME = "PSHELPMODULENAME";
    protected static final String DTOFIELD_PSHELPMODULENAME = "pshelpmodulename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADENAME = "PSSUBSYSSADENAME";
    protected static final String DTOFIELD_PSSUBSYSSADENAME = "pssubsyssadename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMODELGROUPID = "PSSYSMODELGROUPID";
    protected static final String DTOFIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";
    public static final String FIELD_PSSYSMODELGROUPNAME = "PSSYSMODELGROUPNAME";
    protected static final String DTOFIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_REMOVEFLAG = "REMOVEFLAG";
    protected static final String DTOFIELD_REMOVEFLAG = "removeflag";
    public static final String FIELD_SAASMODE = "SAASMODE";
    protected static final String DTOFIELD_SAASMODE = "saasmode";
    public static final String FIELD_SERVICEAPIFLAG = "SERVICEAPIFLAG";
    protected static final String DTOFIELD_SERVICEAPIFLAG = "serviceapiflag";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_STORAGEMODE = "STORAGEMODE";
    protected static final String DTOFIELD_STORAGEMODE = "storagemode";
    public static final String FIELD_SUBSYSMODULE = "SUBSYSMODULE";
    protected static final String DTOFIELD_SUBSYSMODULE = "subsysmodule";
    public static final String FIELD_TABLENAME = "TABLENAME";
    protected static final String DTOFIELD_TABLENAME = "tablename";
    public static final String FIELD_TESTCASEFLAG = "TESTCASEFLAG";
    protected static final String DTOFIELD_TESTCASEFLAG = "testcaseflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERACTION = "USERACTION";
    protected static final String DTOFIELD_USERACTION = "useraction";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VIEWLEVEL = "VIEWLEVEL";
    protected static final String DTOFIELD_VIEWLEVEL = "viewlevel";
    public static final String FIELD_VIEWNAME = "VIEWNAME";
    protected static final String DTOFIELD_VIEWNAME = "viewname";
    public static final String FIELD_VIRTUALFLAG = "VIRTUALFLAG";
    protected static final String DTOFIELD_VIRTUALFLAG = "virtualflag";
    public static final String FIELD_VKEYSEPARATOR = "VKEYSEPARATOR";
    protected static final String DTOFIELD_VKEYSEPARATOR = "vkeyseparator";

    @JsonProperty("accctrlarch")
    public void setAccCtrlArch(Integer value) { _set(DTOFIELD_ACCCTRLARCH, value); }
    @JsonIgnore public Integer getAccCtrlArch() { return (Integer) _get(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public boolean isAccCtrlArchDirty() { return _contains(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public void resetAccCtrlArch() { _reset(DTOFIELD_ACCCTRLARCH); }
    @JsonIgnore public PSDataEntityDTO accctrlarch(Integer value) { setAccCtrlArch(value); return this; }
    @JsonIgnore public PSDataEntityDTO accctrlarch(PSModelEnums.AccCtrlArch value) {
        setAccCtrlArch(value == null ? null : value.value); return this;
    }

    @JsonProperty("auditmode")
    public void setAuditMode(Integer value) { _set(DTOFIELD_AUDITMODE, value); }
    @JsonIgnore public Integer getAuditMode() { return (Integer) _get(DTOFIELD_AUDITMODE); }
    @JsonIgnore public boolean isAuditModeDirty() { return _contains(DTOFIELD_AUDITMODE); }
    @JsonIgnore public void resetAuditMode() { _reset(DTOFIELD_AUDITMODE); }
    @JsonIgnore public PSDataEntityDTO auditmode(Integer value) { setAuditMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO auditmode(PSModelEnums.DEDataAuditMode value) {
        setAuditMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("baseclsparams")
    public void setBaseClsParams(String value) { _set(DTOFIELD_BASECLSPARAMS, value); }
    @JsonIgnore public String getBaseClsParams() { return (String) _get(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public boolean isBaseClsParamsDirty() { return _contains(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public void resetBaseClsParams() { _reset(DTOFIELD_BASECLSPARAMS); }
    @JsonIgnore public PSDataEntityDTO baseclsparams(String value) { setBaseClsParams(value); return this; }

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSDataEntityDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("codenamemode")
    public void setCodeNameMode(String value) { _set(DTOFIELD_CODENAMEMODE, value); }
    @JsonIgnore public String getCodeNameMode() { return (String) _get(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public boolean isCodeNameModeDirty() { return _contains(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public void resetCodeNameMode() { _reset(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public PSDataEntityDTO codenamemode(String value) { setCodeNameMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO codenamemode(PSModelEnums.CodeNameMode value) {
        setCodeNameMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("color")
    public void setColor(String value) { _set(DTOFIELD_COLOR, value); }
    @JsonIgnore public String getColor() { return (String) _get(DTOFIELD_COLOR); }
    @JsonIgnore public boolean isColorDirty() { return _contains(DTOFIELD_COLOR); }
    @JsonIgnore public void resetColor() { _reset(DTOFIELD_COLOR); }
    @JsonIgnore public PSDataEntityDTO color(String value) { setColor(value); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSDataEntityDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSDataEntityDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("customcode")
    public void setCustomCode(String value) { _set(DTOFIELD_CUSTOMCODE, value); }
    @JsonIgnore public String getCustomCode() { return (String) _get(DTOFIELD_CUSTOMCODE); }
    @JsonIgnore public boolean isCustomCodeDirty() { return _contains(DTOFIELD_CUSTOMCODE); }
    @JsonIgnore public void resetCustomCode() { _reset(DTOFIELD_CUSTOMCODE); }
    @JsonIgnore public PSDataEntityDTO customcode(String value) { setCustomCode(value); return this; }

    @JsonProperty("custommode")
    public void setCustomMode(Integer value) { _set(DTOFIELD_CUSTOMMODE, value); }
    @JsonIgnore public Integer getCustomMode() { return (Integer) _get(DTOFIELD_CUSTOMMODE); }
    @JsonIgnore public boolean isCustomModeDirty() { return _contains(DTOFIELD_CUSTOMMODE); }
    @JsonIgnore public void resetCustomMode() { _reset(DTOFIELD_CUSTOMMODE); }
    @JsonIgnore public PSDataEntityDTO custommode(Integer value) { setCustomMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO custommode(PSModelEnums.ScriptMode2 value) {
        setCustomMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("dataaccmode")
    public void setDataAccMode(Integer value) { _set(DTOFIELD_DATAACCMODE, value); }
    @JsonIgnore public Integer getDataAccMode() { return (Integer) _get(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public boolean isDataAccModeDirty() { return _contains(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public void resetDataAccMode() { _reset(DTOFIELD_DATAACCMODE); }
    @JsonIgnore public PSDataEntityDTO dataaccmode(Integer value) { setDataAccMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO dataaccmode(PSModelEnums.DEDataAccCtrlMode value) {
        setDataAccMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("datachglogmode")
    public void setDataChgLogMode(Integer value) { _set(DTOFIELD_DATACHGLOGMODE, value); }
    @JsonIgnore public Integer getDataChgLogMode() { return (Integer) _get(DTOFIELD_DATACHGLOGMODE); }
    @JsonIgnore public boolean isDataChgLogModeDirty() { return _contains(DTOFIELD_DATACHGLOGMODE); }
    @JsonIgnore public void resetDataChgLogMode() { _reset(DTOFIELD_DATACHGLOGMODE); }
    @JsonIgnore public PSDataEntityDTO datachglogmode(Integer value) { setDataChgLogMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO datachglogmode(PSModelEnums.DEDataChgLogMode value) {
        setDataChgLogMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("dataimpexpflag")
    public void setDataImpExpFlag(Integer value) { _set(DTOFIELD_DATAIMPEXPFLAG, value); }
    @JsonIgnore public Integer getDataImpExpFlag() { return (Integer) _get(DTOFIELD_DATAIMPEXPFLAG); }
    @JsonIgnore public boolean isDataImpExpFlagDirty() { return _contains(DTOFIELD_DATAIMPEXPFLAG); }
    @JsonIgnore public void resetDataImpExpFlag() { _reset(DTOFIELD_DATAIMPEXPFLAG); }
    @JsonIgnore public PSDataEntityDTO dataimpexpflag(Integer value) { setDataImpExpFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO dataimpexpflag(PSModelEnums.DEDataImpExpMode value) {
        setDataImpExpFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("delockflag")
    public void setDELockFlag(Integer value) { _set(DTOFIELD_DELOCKFLAG, value); }
    @JsonIgnore public Integer getDELockFlag() { return (Integer) _get(DTOFIELD_DELOCKFLAG); }
    @JsonIgnore public boolean isDELockFlagDirty() { return _contains(DTOFIELD_DELOCKFLAG); }
    @JsonIgnore public void resetDELockFlag() { _reset(DTOFIELD_DELOCKFLAG); }
    @JsonIgnore public PSDataEntityDTO delockflag(Integer value) { setDELockFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO delockflag(Boolean value) {
        setDELockFlag(flagValue(value)); return this;
    }

    @JsonProperty("desn")
    public void setDESN(String value) { _set(DTOFIELD_DESN, value); }
    @JsonIgnore public String getDESN() { return (String) _get(DTOFIELD_DESN); }
    @JsonIgnore public boolean isDESNDirty() { return _contains(DTOFIELD_DESN); }
    @JsonIgnore public void resetDESN() { _reset(DTOFIELD_DESN); }
    @JsonIgnore public PSDataEntityDTO desn(String value) { setDESN(value); return this; }

    @JsonProperty("detag")
    public void setDETag(String value) { _set(DTOFIELD_DETAG, value); }
    @JsonIgnore public String getDETag() { return (String) _get(DTOFIELD_DETAG); }
    @JsonIgnore public boolean isDETagDirty() { return _contains(DTOFIELD_DETAG); }
    @JsonIgnore public void resetDETag() { _reset(DTOFIELD_DETAG); }
    @JsonIgnore public PSDataEntityDTO detag(String value) { setDETag(value); return this; }

    @JsonProperty("detag2")
    public void setDETag2(String value) { _set(DTOFIELD_DETAG2, value); }
    @JsonIgnore public String getDETag2() { return (String) _get(DTOFIELD_DETAG2); }
    @JsonIgnore public boolean isDETag2Dirty() { return _contains(DTOFIELD_DETAG2); }
    @JsonIgnore public void resetDETag2() { _reset(DTOFIELD_DETAG2); }
    @JsonIgnore public PSDataEntityDTO detag2(String value) { setDETag2(value); return this; }

    @JsonProperty("detype")
    public void setDEType(Integer value) { _set(DTOFIELD_DETYPE, value); }
    @JsonIgnore public Integer getDEType() { return (Integer) _get(DTOFIELD_DETYPE); }
    @JsonIgnore public boolean isDETypeDirty() { return _contains(DTOFIELD_DETYPE); }
    @JsonIgnore public void resetDEType() { _reset(DTOFIELD_DETYPE); }
    @JsonIgnore public PSDataEntityDTO detype(Integer value) { setDEType(value); return this; }
    @JsonIgnore public PSDataEntityDTO detype(PSModelEnums.DEType value) {
        setDEType(value == null ? null : value.value); return this;
    }

    @JsonProperty("dslink")
    public void setDSLink(String value) { _set(DTOFIELD_DSLINK, value); }
    @JsonIgnore public String getDSLink() { return (String) _get(DTOFIELD_DSLINK); }
    @JsonIgnore public boolean isDSLinkDirty() { return _contains(DTOFIELD_DSLINK); }
    @JsonIgnore public void resetDSLink() { _reset(DTOFIELD_DSLINK); }
    @JsonIgnore public PSDataEntityDTO dslink(String value) { setDSLink(value); return this; }
    @JsonIgnore public PSDataEntityDTO dslink(PSModelEnums.DataSourceLink value) {
        setDSLink(value == null ? null : value.value); return this;
    }

    @JsonProperty("dynamicmode")
    public void setDynamicMode(Integer value) { _set(DTOFIELD_DYNAMICMODE, value); }
    @JsonIgnore public Integer getDynamicMode() { return (Integer) _get(DTOFIELD_DYNAMICMODE); }
    @JsonIgnore public boolean isDynamicModeDirty() { return _contains(DTOFIELD_DYNAMICMODE); }
    @JsonIgnore public void resetDynamicMode() { _reset(DTOFIELD_DYNAMICMODE); }
    @JsonIgnore public PSDataEntityDTO dynamicmode(Integer value) { setDynamicMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO dynamicmode(PSModelEnums.DEExtendMode value) {
        setDynamicMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("enableaudit")
    public void setEnableAudit(Integer value) { _set(DTOFIELD_ENABLEAUDIT, value); }
    @JsonIgnore public Integer getEnableAudit() { return (Integer) _get(DTOFIELD_ENABLEAUDIT); }
    @JsonIgnore public boolean isEnableAuditDirty() { return _contains(DTOFIELD_ENABLEAUDIT); }
    @JsonIgnore public void resetEnableAudit() { _reset(DTOFIELD_ENABLEAUDIT); }
    @JsonIgnore public PSDataEntityDTO enableaudit(Integer value) { setEnableAudit(value); return this; }
    @JsonIgnore public PSDataEntityDTO enableaudit(Boolean value) {
        setEnableAudit(flagValue(value)); return this;
    }

    @JsonProperty("enabledataver")
    public void setEnableDataVer(Integer value) { _set(DTOFIELD_ENABLEDATAVER, value); }
    @JsonIgnore public Integer getEnableDataVer() { return (Integer) _get(DTOFIELD_ENABLEDATAVER); }
    @JsonIgnore public boolean isEnableDataVerDirty() { return _contains(DTOFIELD_ENABLEDATAVER); }
    @JsonIgnore public void resetEnableDataVer() { _reset(DTOFIELD_ENABLEDATAVER); }
    @JsonIgnore public PSDataEntityDTO enabledataver(Integer value) { setEnableDataVer(value); return this; }
    @JsonIgnore public PSDataEntityDTO enabledataver(Boolean value) {
        setEnableDataVer(flagValue(value)); return this;
    }

    @JsonProperty("enabledeaction")
    public void setEnableDEAction(Integer value) { _set(DTOFIELD_ENABLEDEACTION, value); }
    @JsonIgnore public Integer getEnableDEAction() { return (Integer) _get(DTOFIELD_ENABLEDEACTION); }
    @JsonIgnore public boolean isEnableDEActionDirty() { return _contains(DTOFIELD_ENABLEDEACTION); }
    @JsonIgnore public void resetEnableDEAction() { _reset(DTOFIELD_ENABLEDEACTION); }
    @JsonIgnore public PSDataEntityDTO enabledeaction(Integer value) { setEnableDEAction(value); return this; }
    @JsonIgnore public PSDataEntityDTO enabledeaction(Boolean value) {
        setEnableDEAction(flagValue(value)); return this;
    }

    @JsonProperty("enablededataset")
    public void setEnableDEDataSet(Integer value) { _set(DTOFIELD_ENABLEDEDATASET, value); }
    @JsonIgnore public Integer getEnableDEDataSet() { return (Integer) _get(DTOFIELD_ENABLEDEDATASET); }
    @JsonIgnore public boolean isEnableDEDataSetDirty() { return _contains(DTOFIELD_ENABLEDEDATASET); }
    @JsonIgnore public void resetEnableDEDataSet() { _reset(DTOFIELD_ENABLEDEDATASET); }
    @JsonIgnore public PSDataEntityDTO enablededataset(Integer value) { setEnableDEDataSet(value); return this; }
    @JsonIgnore public PSDataEntityDTO enablededataset(Boolean value) {
        setEnableDEDataSet(flagValue(value)); return this;
    }

    @JsonProperty("enabledynasys")
    public void setEnableDynaSys(Integer value) { _set(DTOFIELD_ENABLEDYNASYS, value); }
    @JsonIgnore public Integer getEnableDynaSys() { return (Integer) _get(DTOFIELD_ENABLEDYNASYS); }
    @JsonIgnore public boolean isEnableDynaSysDirty() { return _contains(DTOFIELD_ENABLEDYNASYS); }
    @JsonIgnore public void resetEnableDynaSys() { _reset(DTOFIELD_ENABLEDYNASYS); }
    @JsonIgnore public PSDataEntityDTO enabledynasys(Integer value) { setEnableDynaSys(value); return this; }
    @JsonIgnore public PSDataEntityDTO enabledynasys(PSModelEnums.DEDynaSysMode value) {
        setEnableDynaSys(value == null ? null : value.value); return this;
    }

    @JsonProperty("enableentitycache")
    public void setEnableEntityCache(Integer value) { _set(DTOFIELD_ENABLEENTITYCACHE, value); }
    @JsonIgnore public Integer getEnableEntityCache() { return (Integer) _get(DTOFIELD_ENABLEENTITYCACHE); }
    @JsonIgnore public boolean isEnableEntityCacheDirty() { return _contains(DTOFIELD_ENABLEENTITYCACHE); }
    @JsonIgnore public void resetEnableEntityCache() { _reset(DTOFIELD_ENABLEENTITYCACHE); }
    @JsonIgnore public PSDataEntityDTO enableentitycache(Integer value) { setEnableEntityCache(value); return this; }
    @JsonIgnore public PSDataEntityDTO enableentitycache(Boolean value) {
        setEnableEntityCache(flagValue(value)); return this;
    }

    @JsonProperty("enablemob")
    public void setEnableMob(Integer value) { _set(DTOFIELD_ENABLEMOB, value); }
    @JsonIgnore public Integer getEnableMob() { return (Integer) _get(DTOFIELD_ENABLEMOB); }
    @JsonIgnore public boolean isEnableMobDirty() { return _contains(DTOFIELD_ENABLEMOB); }
    @JsonIgnore public void resetEnableMob() { _reset(DTOFIELD_ENABLEMOB); }
    @JsonIgnore public PSDataEntityDTO enablemob(Integer value) { setEnableMob(value); return this; }
    @JsonIgnore public PSDataEntityDTO enablemob(Boolean value) {
        setEnableMob(flagValue(value)); return this;
    }

    @JsonProperty("enableopnamemodel")
    public void setEnableOPNameModel(Integer value) { _set(DTOFIELD_ENABLEOPNAMEMODEL, value); }
    @JsonIgnore public Integer getEnableOPNameModel() { return (Integer) _get(DTOFIELD_ENABLEOPNAMEMODEL); }
    @JsonIgnore public boolean isEnableOPNameModelDirty() { return _contains(DTOFIELD_ENABLEOPNAMEMODEL); }
    @JsonIgnore public void resetEnableOPNameModel() { _reset(DTOFIELD_ENABLEOPNAMEMODEL); }
    @JsonIgnore public PSDataEntityDTO enableopnamemodel(Integer value) { setEnableOPNameModel(value); return this; }
    @JsonIgnore public PSDataEntityDTO enableopnamemodel(Boolean value) {
        setEnableOPNameModel(flagValue(value)); return this;
    }

    @JsonProperty("enableorgmodel")
    public void setEnableOrgModel(Integer value) { _set(DTOFIELD_ENABLEORGMODEL, value); }
    @JsonIgnore public Integer getEnableOrgModel() { return (Integer) _get(DTOFIELD_ENABLEORGMODEL); }
    @JsonIgnore public boolean isEnableOrgModelDirty() { return _contains(DTOFIELD_ENABLEORGMODEL); }
    @JsonIgnore public void resetEnableOrgModel() { _reset(DTOFIELD_ENABLEORGMODEL); }
    @JsonIgnore public PSDataEntityDTO enableorgmodel(Integer value) { setEnableOrgModel(value); return this; }
    @JsonIgnore public PSDataEntityDTO enableorgmodel(Boolean value) {
        setEnableOrgModel(flagValue(value)); return this;
    }

    @JsonProperty("enablepql")
    public void setEnablePQL(Integer value) { _set(DTOFIELD_ENABLEPQL, value); }
    @JsonIgnore public Integer getEnablePQL() { return (Integer) _get(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public boolean isEnablePQLDirty() { return _contains(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public void resetEnablePQL() { _reset(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public PSDataEntityDTO enablepql(Integer value) { setEnablePQL(value); return this; }
    @JsonIgnore public PSDataEntityDTO enablepql(Boolean value) {
        setEnablePQL(flagValue(value)); return this;
    }

    @JsonProperty("enableselect")
    public void setEnableSelect(Integer value) { _set(DTOFIELD_ENABLESELECT, value); }
    @JsonIgnore public Integer getEnableSelect() { return (Integer) _get(DTOFIELD_ENABLESELECT); }
    @JsonIgnore public boolean isEnableSelectDirty() { return _contains(DTOFIELD_ENABLESELECT); }
    @JsonIgnore public void resetEnableSelect() { _reset(DTOFIELD_ENABLESELECT); }
    @JsonIgnore public PSDataEntityDTO enableselect(Integer value) { setEnableSelect(value); return this; }
    @JsonIgnore public PSDataEntityDTO enableselect(Boolean value) {
        setEnableSelect(flagValue(value)); return this;
    }

    @JsonProperty("enablewfmodel")
    public void setEnableWFModel(Integer value) { _set(DTOFIELD_ENABLEWFMODEL, value); }
    @JsonIgnore public Integer getEnableWFModel() { return (Integer) _get(DTOFIELD_ENABLEWFMODEL); }
    @JsonIgnore public boolean isEnableWFModelDirty() { return _contains(DTOFIELD_ENABLEWFMODEL); }
    @JsonIgnore public void resetEnableWFModel() { _reset(DTOFIELD_ENABLEWFMODEL); }
    @JsonIgnore public PSDataEntityDTO enablewfmodel(Integer value) { setEnableWFModel(value); return this; }
    @JsonIgnore public PSDataEntityDTO enablewfmodel(Boolean value) {
        setEnableWFModel(flagValue(value)); return this;
    }

    @JsonProperty("enamultiform")
    public void setEnaMultiForm(Integer value) { _set(DTOFIELD_ENAMULTIFORM, value); }
    @JsonIgnore public Integer getEnaMultiForm() { return (Integer) _get(DTOFIELD_ENAMULTIFORM); }
    @JsonIgnore public boolean isEnaMultiFormDirty() { return _contains(DTOFIELD_ENAMULTIFORM); }
    @JsonIgnore public void resetEnaMultiForm() { _reset(DTOFIELD_ENAMULTIFORM); }
    @JsonIgnore public PSDataEntityDTO enamultiform(Integer value) { setEnaMultiForm(value); return this; }
    @JsonIgnore public PSDataEntityDTO enamultiform(PSModelEnums.DEMultiFormMode value) {
        setEnaMultiForm(value == null ? null : value.value); return this;
    }

    @JsonProperty("enatempdata")
    public void setEnaTempData(Integer value) { _set(DTOFIELD_ENATEMPDATA, value); }
    @JsonIgnore public Integer getEnaTempData() { return (Integer) _get(DTOFIELD_ENATEMPDATA); }
    @JsonIgnore public boolean isEnaTempDataDirty() { return _contains(DTOFIELD_ENATEMPDATA); }
    @JsonIgnore public void resetEnaTempData() { _reset(DTOFIELD_ENATEMPDATA); }
    @JsonIgnore public PSDataEntityDTO enatempdata(Integer value) { setEnaTempData(value); return this; }
    @JsonIgnore public PSDataEntityDTO enatempdata(PSModelEnums.DETempDataHolder value) {
        setEnaTempData(value == null ? null : value.value); return this;
    }

    @JsonProperty("entitycachetimeout")
    public void setEntityCacheTimeout(Integer value) { _set(DTOFIELD_ENTITYCACHETIMEOUT, value); }
    @JsonIgnore public Integer getEntityCacheTimeout() { return (Integer) _get(DTOFIELD_ENTITYCACHETIMEOUT); }
    @JsonIgnore public boolean isEntityCacheTimeoutDirty() { return _contains(DTOFIELD_ENTITYCACHETIMEOUT); }
    @JsonIgnore public void resetEntityCacheTimeout() { _reset(DTOFIELD_ENTITYCACHETIMEOUT); }
    @JsonIgnore public PSDataEntityDTO entitycachetimeout(Integer value) { setEntityCacheTimeout(value); return this; }

    @JsonProperty("existingmodel")
    public void setExistingModel(Integer value) { _set(DTOFIELD_EXISTINGMODEL, value); }
    @JsonIgnore public Integer getExistingModel() { return (Integer) _get(DTOFIELD_EXISTINGMODEL); }
    @JsonIgnore public boolean isExistingModelDirty() { return _contains(DTOFIELD_EXISTINGMODEL); }
    @JsonIgnore public void resetExistingModel() { _reset(DTOFIELD_EXISTINGMODEL); }
    @JsonIgnore public PSDataEntityDTO existingmodel(Integer value) { setExistingModel(value); return this; }
    @JsonIgnore public PSDataEntityDTO existingmodel(Boolean value) {
        setExistingModel(flagValue(value)); return this;
    }

    @JsonProperty("indexdetype")
    public void setIndexDEType(String value) { _set(DTOFIELD_INDEXDETYPE, value); }
    @JsonIgnore public String getIndexDEType() { return (String) _get(DTOFIELD_INDEXDETYPE); }
    @JsonIgnore public boolean isIndexDETypeDirty() { return _contains(DTOFIELD_INDEXDETYPE); }
    @JsonIgnore public void resetIndexDEType() { _reset(DTOFIELD_INDEXDETYPE); }
    @JsonIgnore public PSDataEntityDTO indexdetype(String value) { setIndexDEType(value); return this; }
    @JsonIgnore public PSDataEntityDTO indexdetype(PSModelEnums.DEIndexType value) {
        setIndexDEType(value == null ? null : value.value); return this;
    }

    @JsonProperty("keyrule")
    public void setKeyRule(String value) { _set(DTOFIELD_KEYRULE, value); }
    @JsonIgnore public String getKeyRule() { return (String) _get(DTOFIELD_KEYRULE); }
    @JsonIgnore public boolean isKeyRuleDirty() { return _contains(DTOFIELD_KEYRULE); }
    @JsonIgnore public void resetKeyRule() { _reset(DTOFIELD_KEYRULE); }
    @JsonIgnore public PSDataEntityDTO keyrule(String value) { setKeyRule(value); return this; }
    @JsonIgnore public PSDataEntityDTO keyrule(PSModelEnums.DEUnionKeyMode value) {
        setKeyRule(value == null ? null : value.value); return this;
    }

    @JsonProperty("lnpslanresid")
    public void setLNPSLanResId(String value) { _set(DTOFIELD_LNPSLANRESID, value); }
    @JsonIgnore public String getLNPSLanResId() { return (String) _get(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public boolean isLNPSLanResIdDirty() { return _contains(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public void resetLNPSLanResId() { _reset(DTOFIELD_LNPSLANRESID); }
    @JsonIgnore public PSDataEntityDTO lnpslanresid(String value) { setLNPSLanResId(value); return this; }

    @JsonProperty("lnpslanresname")
    public void setLNPSLanResName(String value) { _set(DTOFIELD_LNPSLANRESNAME, value); }
    @JsonIgnore public String getLNPSLanResName() { return (String) _get(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public boolean isLNPSLanResNameDirty() { return _contains(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public void resetLNPSLanResName() { _reset(DTOFIELD_LNPSLANRESNAME); }
    @JsonIgnore public PSDataEntityDTO lnpslanresname(String value) { setLNPSLanResName(value); return this; }

    @JsonProperty("logicinvalidvalue")
    public void setLogicInvalidValue(String value) { _set(DTOFIELD_LOGICINVALIDVALUE, value); }
    @JsonIgnore public String getLogicInvalidValue() { return (String) _get(DTOFIELD_LOGICINVALIDVALUE); }
    @JsonIgnore public boolean isLogicInvalidValueDirty() { return _contains(DTOFIELD_LOGICINVALIDVALUE); }
    @JsonIgnore public void resetLogicInvalidValue() { _reset(DTOFIELD_LOGICINVALIDVALUE); }
    @JsonIgnore public PSDataEntityDTO logicinvalidvalue(String value) { setLogicInvalidValue(value); return this; }

    @JsonProperty("logicname")
    public void setLogicName(String value) { _set(DTOFIELD_LOGICNAME, value); }
    @JsonIgnore public String getLogicName() { return (String) _get(DTOFIELD_LOGICNAME); }
    @JsonIgnore public boolean isLogicNameDirty() { return _contains(DTOFIELD_LOGICNAME); }
    @JsonIgnore public void resetLogicName() { _reset(DTOFIELD_LOGICNAME); }
    @JsonIgnore public PSDataEntityDTO logicname(String value) { setLogicName(value); return this; }

    @JsonProperty("logicvalid")
    public void setLogicValid(Integer value) { _set(DTOFIELD_LOGICVALID, value); }
    @JsonIgnore public Integer getLogicValid() { return (Integer) _get(DTOFIELD_LOGICVALID); }
    @JsonIgnore public boolean isLogicValidDirty() { return _contains(DTOFIELD_LOGICVALID); }
    @JsonIgnore public void resetLogicValid() { _reset(DTOFIELD_LOGICVALID); }
    @JsonIgnore public PSDataEntityDTO logicvalid(Integer value) { setLogicValid(value); return this; }
    @JsonIgnore public PSDataEntityDTO logicvalid(Boolean value) {
        setLogicValid(flagValue(value)); return this;
    }

    @JsonProperty("logicvalidvalue")
    public void setLogicValidValue(String value) { _set(DTOFIELD_LOGICVALIDVALUE, value); }
    @JsonIgnore public String getLogicValidValue() { return (String) _get(DTOFIELD_LOGICVALIDVALUE); }
    @JsonIgnore public boolean isLogicValidValueDirty() { return _contains(DTOFIELD_LOGICVALIDVALUE); }
    @JsonIgnore public void resetLogicValidValue() { _reset(DTOFIELD_LOGICVALIDVALUE); }
    @JsonIgnore public PSDataEntityDTO logicvalidvalue(String value) { setLogicValidValue(value); return this; }

    @JsonProperty("maxentitycachecnt")
    public void setMaxEntityCacheCnt(Integer value) { _set(DTOFIELD_MAXENTITYCACHECNT, value); }
    @JsonIgnore public Integer getMaxEntityCacheCnt() { return (Integer) _get(DTOFIELD_MAXENTITYCACHECNT); }
    @JsonIgnore public boolean isMaxEntityCacheCntDirty() { return _contains(DTOFIELD_MAXENTITYCACHECNT); }
    @JsonIgnore public void resetMaxEntityCacheCnt() { _reset(DTOFIELD_MAXENTITYCACHECNT); }
    @JsonIgnore public PSDataEntityDTO maxentitycachecnt(Integer value) { setMaxEntityCacheCnt(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSDataEntityDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("modcolor")
    public void setModColor(String value) { _set(DTOFIELD_MODCOLOR, value); }
    @JsonIgnore public String getModColor() { return (String) _get(DTOFIELD_MODCOLOR); }
    @JsonIgnore public boolean isModColorDirty() { return _contains(DTOFIELD_MODCOLOR); }
    @JsonIgnore public void resetModColor() { _reset(DTOFIELD_MODCOLOR); }
    @JsonIgnore public PSDataEntityDTO modcolor(String value) { setModColor(value); return this; }

    @JsonProperty("msactionlogicflag")
    public void setMSActionLogicFlag(Integer value) { _set(DTOFIELD_MSACTIONLOGICFLAG, value); }
    @JsonIgnore public Integer getMSActionLogicFlag() { return (Integer) _get(DTOFIELD_MSACTIONLOGICFLAG); }
    @JsonIgnore public boolean isMSActionLogicFlagDirty() { return _contains(DTOFIELD_MSACTIONLOGICFLAG); }
    @JsonIgnore public void resetMSActionLogicFlag() { _reset(DTOFIELD_MSACTIONLOGICFLAG); }
    @JsonIgnore public PSDataEntityDTO msactionlogicflag(Integer value) { setMSActionLogicFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO msactionlogicflag(PSModelEnums.DEMSActionLogicMode value) {
        setMSActionLogicFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("noviewmode")
    public void setNoViewMode(Integer value) { _set(DTOFIELD_NOVIEWMODE, value); }
    @JsonIgnore public Integer getNoViewMode() { return (Integer) _get(DTOFIELD_NOVIEWMODE); }
    @JsonIgnore public boolean isNoViewModeDirty() { return _contains(DTOFIELD_NOVIEWMODE); }
    @JsonIgnore public void resetNoViewMode() { _reset(DTOFIELD_NOVIEWMODE); }
    @JsonIgnore public PSDataEntityDTO noviewmode(Integer value) { setNoViewMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO noviewmode(Boolean value) {
        setNoViewMode(flagValue(value)); return this;
    }

    @JsonProperty("ordervalue")
    public void setOrderValue(Integer value) { _set(DTOFIELD_ORDERVALUE, value); }
    @JsonIgnore public Integer getOrderValue() { return (Integer) _get(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public boolean isOrderValueDirty() { return _contains(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public void resetOrderValue() { _reset(DTOFIELD_ORDERVALUE); }
    @JsonIgnore public PSDataEntityDTO ordervalue(Integer value) { setOrderValue(value); return this; }

    @JsonProperty("psdataentityid")
    public void setPSDataEntityId(String value) { _set(DTOFIELD_PSDATAENTITYID, value); }
    @JsonIgnore public String getPSDataEntityId() { return (String) _get(DTOFIELD_PSDATAENTITYID); }
    @JsonIgnore public boolean isPSDataEntityIdDirty() { return _contains(DTOFIELD_PSDATAENTITYID); }
    @JsonIgnore public void resetPSDataEntityId() { _reset(DTOFIELD_PSDATAENTITYID); }
    @JsonIgnore public PSDataEntityDTO psdataentityid(String value) { setPSDataEntityId(value); return this; }

    @JsonProperty("psdataentityname")
    public void setPSDataEntityName(String value) { _set(DTOFIELD_PSDATAENTITYNAME, value); }
    @JsonIgnore public String getPSDataEntityName() { return (String) _get(DTOFIELD_PSDATAENTITYNAME); }
    @JsonIgnore public boolean isPSDataEntityNameDirty() { return _contains(DTOFIELD_PSDATAENTITYNAME); }
    @JsonIgnore public void resetPSDataEntityName() { _reset(DTOFIELD_PSDATAENTITYNAME); }
    @JsonIgnore public PSDataEntityDTO psdataentityname(String value) { setPSDataEntityName(value); return this; }
    @JsonIgnore public String getName() { return getPSDataEntityName(); }
    @JsonIgnore public void setName(String value) { setPSDataEntityName(value); }
    @JsonIgnore public PSDataEntityDTO name(String value) { setPSDataEntityName(value); return this; }

    @JsonProperty("psdefinputtipsetid")
    public void setPSDEFInputTipSetId(String value) { _set(DTOFIELD_PSDEFINPUTTIPSETID, value); }
    @JsonIgnore public String getPSDEFInputTipSetId() { return (String) _get(DTOFIELD_PSDEFINPUTTIPSETID); }
    @JsonIgnore public boolean isPSDEFInputTipSetIdDirty() { return _contains(DTOFIELD_PSDEFINPUTTIPSETID); }
    @JsonIgnore public void resetPSDEFInputTipSetId() { _reset(DTOFIELD_PSDEFINPUTTIPSETID); }
    @JsonIgnore public PSDataEntityDTO psdefinputtipsetid(String value) { setPSDEFInputTipSetId(value); return this; }

    @JsonProperty("psdefinputtipsetname")
    public void setPSDEFInputTipSetName(String value) { _set(DTOFIELD_PSDEFINPUTTIPSETNAME, value); }
    @JsonIgnore public String getPSDEFInputTipSetName() { return (String) _get(DTOFIELD_PSDEFINPUTTIPSETNAME); }
    @JsonIgnore public boolean isPSDEFInputTipSetNameDirty() { return _contains(DTOFIELD_PSDEFINPUTTIPSETNAME); }
    @JsonIgnore public void resetPSDEFInputTipSetName() { _reset(DTOFIELD_PSDEFINPUTTIPSETNAME); }
    @JsonIgnore public PSDataEntityDTO psdefinputtipsetname(String value) { setPSDEFInputTipSetName(value); return this; }

    @JsonProperty("psdynadetemplid")
    public void setPSDynaDETemplId(String value) { _set(DTOFIELD_PSDYNADETEMPLID, value); }
    @JsonIgnore public String getPSDynaDETemplId() { return (String) _get(DTOFIELD_PSDYNADETEMPLID); }
    @JsonIgnore public boolean isPSDynaDETemplIdDirty() { return _contains(DTOFIELD_PSDYNADETEMPLID); }
    @JsonIgnore public void resetPSDynaDETemplId() { _reset(DTOFIELD_PSDYNADETEMPLID); }
    @JsonIgnore public PSDataEntityDTO psdynadetemplid(String value) { setPSDynaDETemplId(value); return this; }

    @JsonProperty("psdynadetemplname")
    public void setPSDynaDETemplName(String value) { _set(DTOFIELD_PSDYNADETEMPLNAME, value); }
    @JsonIgnore public String getPSDynaDETemplName() { return (String) _get(DTOFIELD_PSDYNADETEMPLNAME); }
    @JsonIgnore public boolean isPSDynaDETemplNameDirty() { return _contains(DTOFIELD_PSDYNADETEMPLNAME); }
    @JsonIgnore public void resetPSDynaDETemplName() { _reset(DTOFIELD_PSDYNADETEMPLNAME); }
    @JsonIgnore public PSDataEntityDTO psdynadetemplname(String value) { setPSDynaDETemplName(value); return this; }

    @JsonProperty("pshelpmoduleid")
    public void setPSHelpModuleId(String value) { _set(DTOFIELD_PSHELPMODULEID, value); }
    @JsonIgnore public String getPSHelpModuleId() { return (String) _get(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public boolean isPSHelpModuleIdDirty() { return _contains(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public void resetPSHelpModuleId() { _reset(DTOFIELD_PSHELPMODULEID); }
    @JsonIgnore public PSDataEntityDTO pshelpmoduleid(String value) { setPSHelpModuleId(value); return this; }

    @JsonProperty("pshelpmodulename")
    public void setPSHelpModuleName(String value) { _set(DTOFIELD_PSHELPMODULENAME, value); }
    @JsonIgnore public String getPSHelpModuleName() { return (String) _get(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public boolean isPSHelpModuleNameDirty() { return _contains(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public void resetPSHelpModuleName() { _reset(DTOFIELD_PSHELPMODULENAME); }
    @JsonIgnore public PSDataEntityDTO pshelpmodulename(String value) { setPSHelpModuleName(value); return this; }

    @JsonProperty("psmoduleid")
    public void setPSModuleId(String value) { _set(DTOFIELD_PSMODULEID, value); }
    @JsonIgnore public String getPSModuleId() { return (String) _get(DTOFIELD_PSMODULEID); }
    @JsonIgnore public boolean isPSModuleIdDirty() { return _contains(DTOFIELD_PSMODULEID); }
    @JsonIgnore public void resetPSModuleId() { _reset(DTOFIELD_PSMODULEID); }
    @JsonIgnore public PSDataEntityDTO psmoduleid(String value) { setPSModuleId(value); return this; }
    @JsonIgnore public PSDataEntityDTO psmoduleid(PSModuleDTO value) {
        if (value == null) {
            setModColor(null);
            setPSModuleId(null);
            setPSModuleName(null);
            setSubSysModule(null);
        } else {
            setModColor(value.getColor());
            setPSModuleId(value.getPSModuleId());
            setPSModuleName(value.getPSModuleName());
            setSubSysModule(value.getSubSysModule());
        }
        return this;
    }

    @JsonProperty("psmodulename")
    public void setPSModuleName(String value) { _set(DTOFIELD_PSMODULENAME, value); }
    @JsonIgnore public String getPSModuleName() { return (String) _get(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public boolean isPSModuleNameDirty() { return _contains(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public void resetPSModuleName() { _reset(DTOFIELD_PSMODULENAME); }
    @JsonIgnore public PSDataEntityDTO psmodulename(String value) { setPSModuleName(value); return this; }

    @JsonProperty("pssubsyssadeid")
    public void setPSSubSysSADEId(String value) { _set(DTOFIELD_PSSUBSYSSADEID, value); }
    @JsonIgnore public String getPSSubSysSADEId() { return (String) _get(DTOFIELD_PSSUBSYSSADEID); }
    @JsonIgnore public boolean isPSSubSysSADEIdDirty() { return _contains(DTOFIELD_PSSUBSYSSADEID); }
    @JsonIgnore public void resetPSSubSysSADEId() { _reset(DTOFIELD_PSSUBSYSSADEID); }
    @JsonIgnore public PSDataEntityDTO pssubsyssadeid(String value) { setPSSubSysSADEId(value); return this; }

    @JsonProperty("pssubsyssadename")
    public void setPSSubSysSADEName(String value) { _set(DTOFIELD_PSSUBSYSSADENAME, value); }
    @JsonIgnore public String getPSSubSysSADEName() { return (String) _get(DTOFIELD_PSSUBSYSSADENAME); }
    @JsonIgnore public boolean isPSSubSysSADENameDirty() { return _contains(DTOFIELD_PSSUBSYSSADENAME); }
    @JsonIgnore public void resetPSSubSysSADEName() { _reset(DTOFIELD_PSSUBSYSSADENAME); }
    @JsonIgnore public PSDataEntityDTO pssubsyssadename(String value) { setPSSubSysSADEName(value); return this; }

    @JsonProperty("pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String value) { _set(DTOFIELD_PSSUBSYSSERVICEAPIID, value); }
    @JsonIgnore public String getPSSubSysServiceAPIId() { return (String) _get(DTOFIELD_PSSUBSYSSERVICEAPIID); }
    @JsonIgnore public boolean isPSSubSysServiceAPIIdDirty() { return _contains(DTOFIELD_PSSUBSYSSERVICEAPIID); }
    @JsonIgnore public void resetPSSubSysServiceAPIId() { _reset(DTOFIELD_PSSUBSYSSERVICEAPIID); }
    @JsonIgnore public PSDataEntityDTO pssubsysserviceapiid(String value) { setPSSubSysServiceAPIId(value); return this; }

    @JsonProperty("pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String value) { _set(DTOFIELD_PSSUBSYSSERVICEAPINAME, value); }
    @JsonIgnore public String getPSSubSysServiceAPIName() { return (String) _get(DTOFIELD_PSSUBSYSSERVICEAPINAME); }
    @JsonIgnore public boolean isPSSubSysServiceAPINameDirty() { return _contains(DTOFIELD_PSSUBSYSSERVICEAPINAME); }
    @JsonIgnore public void resetPSSubSysServiceAPIName() { _reset(DTOFIELD_PSSUBSYSSERVICEAPINAME); }
    @JsonIgnore public PSDataEntityDTO pssubsysserviceapiname(String value) { setPSSubSysServiceAPIName(value); return this; }

    @JsonProperty("pssysdynamodelid")
    public void setPSSysDynaModelId(String value) { _set(DTOFIELD_PSSYSDYNAMODELID, value); }
    @JsonIgnore public String getPSSysDynaModelId() { return (String) _get(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public boolean isPSSysDynaModelIdDirty() { return _contains(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public void resetPSSysDynaModelId() { _reset(DTOFIELD_PSSYSDYNAMODELID); }
    @JsonIgnore public PSDataEntityDTO pssysdynamodelid(String value) { setPSSysDynaModelId(value); return this; }

    @JsonProperty("pssysdynamodelname")
    public void setPSSysDynaModelName(String value) { _set(DTOFIELD_PSSYSDYNAMODELNAME, value); }
    @JsonIgnore public String getPSSysDynaModelName() { return (String) _get(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public boolean isPSSysDynaModelNameDirty() { return _contains(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public void resetPSSysDynaModelName() { _reset(DTOFIELD_PSSYSDYNAMODELNAME); }
    @JsonIgnore public PSDataEntityDTO pssysdynamodelname(String value) { setPSSysDynaModelName(value); return this; }

    @JsonProperty("pssysimageid")
    public void setPSSysImageId(String value) { _set(DTOFIELD_PSSYSIMAGEID, value); }
    @JsonIgnore public String getPSSysImageId() { return (String) _get(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public boolean isPSSysImageIdDirty() { return _contains(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public void resetPSSysImageId() { _reset(DTOFIELD_PSSYSIMAGEID); }
    @JsonIgnore public PSDataEntityDTO pssysimageid(String value) { setPSSysImageId(value); return this; }

    @JsonProperty("pssysimagename")
    public void setPSSysImageName(String value) { _set(DTOFIELD_PSSYSIMAGENAME, value); }
    @JsonIgnore public String getPSSysImageName() { return (String) _get(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public boolean isPSSysImageNameDirty() { return _contains(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public void resetPSSysImageName() { _reset(DTOFIELD_PSSYSIMAGENAME); }
    @JsonIgnore public PSDataEntityDTO pssysimagename(String value) { setPSSysImageName(value); return this; }

    @JsonProperty("pssysmodelgroupid")
    public void setPSSysModelGroupId(String value) { _set(DTOFIELD_PSSYSMODELGROUPID, value); }
    @JsonIgnore public String getPSSysModelGroupId() { return (String) _get(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public boolean isPSSysModelGroupIdDirty() { return _contains(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public void resetPSSysModelGroupId() { _reset(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public PSDataEntityDTO pssysmodelgroupid(String value) { setPSSysModelGroupId(value); return this; }

    @JsonProperty("pssysmodelgroupname")
    public void setPSSysModelGroupName(String value) { _set(DTOFIELD_PSSYSMODELGROUPNAME, value); }
    @JsonIgnore public String getPSSysModelGroupName() { return (String) _get(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public boolean isPSSysModelGroupNameDirty() { return _contains(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public void resetPSSysModelGroupName() { _reset(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public PSDataEntityDTO pssysmodelgroupname(String value) { setPSSysModelGroupName(value); return this; }

    @JsonProperty("pssysreqitemid")
    public void setPSSysReqItemId(String value) { _set(DTOFIELD_PSSYSREQITEMID, value); }
    @JsonIgnore public String getPSSysReqItemId() { return (String) _get(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public boolean isPSSysReqItemIdDirty() { return _contains(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public void resetPSSysReqItemId() { _reset(DTOFIELD_PSSYSREQITEMID); }
    @JsonIgnore public PSDataEntityDTO pssysreqitemid(String value) { setPSSysReqItemId(value); return this; }

    @JsonProperty("pssysreqitemname")
    public void setPSSysReqItemName(String value) { _set(DTOFIELD_PSSYSREQITEMNAME, value); }
    @JsonIgnore public String getPSSysReqItemName() { return (String) _get(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public boolean isPSSysReqItemNameDirty() { return _contains(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public void resetPSSysReqItemName() { _reset(DTOFIELD_PSSYSREQITEMNAME); }
    @JsonIgnore public PSDataEntityDTO pssysreqitemname(String value) { setPSSysReqItemName(value); return this; }

    @JsonProperty("pssyssfpluginid")
    public void setPSSysSFPluginId(String value) { _set(DTOFIELD_PSSYSSFPLUGINID, value); }
    @JsonIgnore public String getPSSysSFPluginId() { return (String) _get(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public boolean isPSSysSFPluginIdDirty() { return _contains(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public void resetPSSysSFPluginId() { _reset(DTOFIELD_PSSYSSFPLUGINID); }
    @JsonIgnore public PSDataEntityDTO pssyssfpluginid(String value) { setPSSysSFPluginId(value); return this; }

    @JsonProperty("pssyssfpluginname")
    public void setPSSysSFPluginName(String value) { _set(DTOFIELD_PSSYSSFPLUGINNAME, value); }
    @JsonIgnore public String getPSSysSFPluginName() { return (String) _get(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public boolean isPSSysSFPluginNameDirty() { return _contains(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public void resetPSSysSFPluginName() { _reset(DTOFIELD_PSSYSSFPLUGINNAME); }
    @JsonIgnore public PSDataEntityDTO pssyssfpluginname(String value) { setPSSysSFPluginName(value); return this; }

    @JsonProperty("pssysuniresid")
    public void setPSSysUniResId(String value) { _set(DTOFIELD_PSSYSUNIRESID, value); }
    @JsonIgnore public String getPSSysUniResId() { return (String) _get(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public boolean isPSSysUniResIdDirty() { return _contains(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public void resetPSSysUniResId() { _reset(DTOFIELD_PSSYSUNIRESID); }
    @JsonIgnore public PSDataEntityDTO pssysuniresid(String value) { setPSSysUniResId(value); return this; }

    @JsonProperty("pssysuniresname")
    public void setPSSysUniResName(String value) { _set(DTOFIELD_PSSYSUNIRESNAME, value); }
    @JsonIgnore public String getPSSysUniResName() { return (String) _get(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public boolean isPSSysUniResNameDirty() { return _contains(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public void resetPSSysUniResName() { _reset(DTOFIELD_PSSYSUNIRESNAME); }
    @JsonIgnore public PSDataEntityDTO pssysuniresname(String value) { setPSSysUniResName(value); return this; }

    @JsonProperty("removeflag")
    public void setRemoveFlag(Integer value) { _set(DTOFIELD_REMOVEFLAG, value); }
    @JsonIgnore public Integer getRemoveFlag() { return (Integer) _get(DTOFIELD_REMOVEFLAG); }
    @JsonIgnore public boolean isRemoveFlagDirty() { return _contains(DTOFIELD_REMOVEFLAG); }
    @JsonIgnore public void resetRemoveFlag() { _reset(DTOFIELD_REMOVEFLAG); }
    @JsonIgnore public PSDataEntityDTO removeflag(Integer value) { setRemoveFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO removeflag(PSModelEnums.ModelRemoveMode value) {
        setRemoveFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("saasmode")
    public void setSaaSMode(Integer value) { _set(DTOFIELD_SAASMODE, value); }
    @JsonIgnore public Integer getSaaSMode() { return (Integer) _get(DTOFIELD_SAASMODE); }
    @JsonIgnore public boolean isSaaSModeDirty() { return _contains(DTOFIELD_SAASMODE); }
    @JsonIgnore public void resetSaaSMode() { _reset(DTOFIELD_SAASMODE); }
    @JsonIgnore public PSDataEntityDTO saasmode(Integer value) { setSaaSMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO saasmode(PSModelEnums.DESaaSMode value) {
        setSaaSMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("serviceapiflag")
    public void setServiceAPIFlag(Integer value) { _set(DTOFIELD_SERVICEAPIFLAG, value); }
    @JsonIgnore public Integer getServiceAPIFlag() { return (Integer) _get(DTOFIELD_SERVICEAPIFLAG); }
    @JsonIgnore public boolean isServiceAPIFlagDirty() { return _contains(DTOFIELD_SERVICEAPIFLAG); }
    @JsonIgnore public void resetServiceAPIFlag() { _reset(DTOFIELD_SERVICEAPIFLAG); }
    @JsonIgnore public PSDataEntityDTO serviceapiflag(Integer value) { setServiceAPIFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO serviceapiflag(PSModelEnums.DEServiceAPIMode value) {
        setServiceAPIFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("servicecodename")
    public void setServiceCodeName(String value) { _set(DTOFIELD_SERVICECODENAME, value); }
    @JsonIgnore public String getServiceCodeName() { return (String) _get(DTOFIELD_SERVICECODENAME); }
    @JsonIgnore public boolean isServiceCodeNameDirty() { return _contains(DTOFIELD_SERVICECODENAME); }
    @JsonIgnore public void resetServiceCodeName() { _reset(DTOFIELD_SERVICECODENAME); }
    @JsonIgnore public PSDataEntityDTO servicecodename(String value) { setServiceCodeName(value); return this; }

    @JsonProperty("storagemode")
    public void setStorageMode(Integer value) { _set(DTOFIELD_STORAGEMODE, value); }
    @JsonIgnore public Integer getStorageMode() { return (Integer) _get(DTOFIELD_STORAGEMODE); }
    @JsonIgnore public boolean isStorageModeDirty() { return _contains(DTOFIELD_STORAGEMODE); }
    @JsonIgnore public void resetStorageMode() { _reset(DTOFIELD_STORAGEMODE); }
    @JsonIgnore public PSDataEntityDTO storagemode(Integer value) { setStorageMode(value); return this; }
    @JsonIgnore public PSDataEntityDTO storagemode(PSModelEnums.DEStorageType value) {
        setStorageMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("subsysmodule")
    public void setSubSysModule(Integer value) { _set(DTOFIELD_SUBSYSMODULE, value); }
    @JsonIgnore public Integer getSubSysModule() { return (Integer) _get(DTOFIELD_SUBSYSMODULE); }
    @JsonIgnore public boolean isSubSysModuleDirty() { return _contains(DTOFIELD_SUBSYSMODULE); }
    @JsonIgnore public void resetSubSysModule() { _reset(DTOFIELD_SUBSYSMODULE); }
    @JsonIgnore public PSDataEntityDTO subsysmodule(Integer value) { setSubSysModule(value); return this; }
    @JsonIgnore public PSDataEntityDTO subsysmodule(Boolean value) {
        setSubSysModule(flagValue(value)); return this;
    }

    @JsonProperty("tablename")
    public void setTableName(String value) { _set(DTOFIELD_TABLENAME, value); }
    @JsonIgnore public String getTableName() { return (String) _get(DTOFIELD_TABLENAME); }
    @JsonIgnore public boolean isTableNameDirty() { return _contains(DTOFIELD_TABLENAME); }
    @JsonIgnore public void resetTableName() { _reset(DTOFIELD_TABLENAME); }
    @JsonIgnore public PSDataEntityDTO tablename(String value) { setTableName(value); return this; }

    @JsonProperty("testcaseflag")
    public void setTestCaseFlag(Integer value) { _set(DTOFIELD_TESTCASEFLAG, value); }
    @JsonIgnore public Integer getTestCaseFlag() { return (Integer) _get(DTOFIELD_TESTCASEFLAG); }
    @JsonIgnore public boolean isTestCaseFlagDirty() { return _contains(DTOFIELD_TESTCASEFLAG); }
    @JsonIgnore public void resetTestCaseFlag() { _reset(DTOFIELD_TESTCASEFLAG); }
    @JsonIgnore public PSDataEntityDTO testcaseflag(Integer value) { setTestCaseFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO testcaseflag(Boolean value) {
        setTestCaseFlag(flagValue(value)); return this;
    }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSDataEntityDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSDataEntityDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("useraction")
    public void setUserAction(Integer value) { _set(DTOFIELD_USERACTION, value); }
    @JsonIgnore public Integer getUserAction() { return (Integer) _get(DTOFIELD_USERACTION); }
    @JsonIgnore public boolean isUserActionDirty() { return _contains(DTOFIELD_USERACTION); }
    @JsonIgnore public void resetUserAction() { _reset(DTOFIELD_USERACTION); }
    @JsonIgnore public PSDataEntityDTO useraction(Integer value) { setUserAction(value); return this; }
    @JsonIgnore public PSDataEntityDTO useraction(PSModelEnums.DEUserUIAbility[] value) {
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
    @JsonIgnore public PSDataEntityDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSDataEntityDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value); return this;
    }

    @JsonProperty("userparams")
    public void setUserParams(String value) { _set(DTOFIELD_USERPARAMS, value); }
    @JsonIgnore public String getUserParams() { return (String) _get(DTOFIELD_USERPARAMS); }
    @JsonIgnore public boolean isUserParamsDirty() { return _contains(DTOFIELD_USERPARAMS); }
    @JsonIgnore public void resetUserParams() { _reset(DTOFIELD_USERPARAMS); }
    @JsonIgnore public PSDataEntityDTO userparams(String value) { setUserParams(value); return this; }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSDataEntityDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSDataEntityDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSDataEntityDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSDataEntityDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSDataEntityDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO validflag(Boolean value) {
        setValidFlag(flagValue(value)); return this;
    }

    @JsonProperty("viewlevel")
    public void setViewLevel(Integer value) { _set(DTOFIELD_VIEWLEVEL, value); }
    @JsonIgnore public Integer getViewLevel() { return (Integer) _get(DTOFIELD_VIEWLEVEL); }
    @JsonIgnore public boolean isViewLevelDirty() { return _contains(DTOFIELD_VIEWLEVEL); }
    @JsonIgnore public void resetViewLevel() { _reset(DTOFIELD_VIEWLEVEL); }
    @JsonIgnore public PSDataEntityDTO viewlevel(Integer value) { setViewLevel(value); return this; }
    @JsonIgnore public PSDataEntityDTO viewlevel(PSModelEnums.DEFieldViewColLevel value) {
        setViewLevel(value == null ? null : value.value); return this;
    }

    @JsonProperty("viewname")
    public void setViewName(String value) { _set(DTOFIELD_VIEWNAME, value); }
    @JsonIgnore public String getViewName() { return (String) _get(DTOFIELD_VIEWNAME); }
    @JsonIgnore public boolean isViewNameDirty() { return _contains(DTOFIELD_VIEWNAME); }
    @JsonIgnore public void resetViewName() { _reset(DTOFIELD_VIEWNAME); }
    @JsonIgnore public PSDataEntityDTO viewname(String value) { setViewName(value); return this; }

    @JsonProperty("virtualflag")
    public void setVirtualFlag(Integer value) { _set(DTOFIELD_VIRTUALFLAG, value); }
    @JsonIgnore public Integer getVirtualFlag() { return (Integer) _get(DTOFIELD_VIRTUALFLAG); }
    @JsonIgnore public boolean isVirtualFlagDirty() { return _contains(DTOFIELD_VIRTUALFLAG); }
    @JsonIgnore public void resetVirtualFlag() { _reset(DTOFIELD_VIRTUALFLAG); }
    @JsonIgnore public PSDataEntityDTO virtualflag(Integer value) { setVirtualFlag(value); return this; }
    @JsonIgnore public PSDataEntityDTO virtualflag(PSModelEnums.DEVirtualMode value) {
        setVirtualFlag(value == null ? null : value.value); return this;
    }

    @JsonProperty("vkeyseparator")
    public void setVKeySeparator(String value) { _set(DTOFIELD_VKEYSEPARATOR, value); }
    @JsonIgnore public String getVKeySeparator() { return (String) _get(DTOFIELD_VKEYSEPARATOR); }
    @JsonIgnore public boolean isVKeySeparatorDirty() { return _contains(DTOFIELD_VKEYSEPARATOR); }
    @JsonIgnore public void resetVKeySeparator() { _reset(DTOFIELD_VKEYSEPARATOR); }
    @JsonIgnore public PSDataEntityDTO vkeyseparator(String value) { setVKeySeparator(value); return this; }

    @JsonIgnore public String getId() { return getPSDataEntityId(); }
    @JsonIgnore public void setId(String value) { setPSDataEntityId(value); }
    @JsonIgnore public PSDataEntityDTO id(String value) { setPSDataEntityId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}