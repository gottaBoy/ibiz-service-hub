package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Database type DTO.
 */
public class PSDBTypeDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBCLIENTPATH = "DBCLIENTPATH";
    protected static final String DTOFIELD_DBCLIENTPATH = "dbclientpath";
    public static final String FIELD_DEDBCFGOBJ = "DEDBCFGOBJ";
    protected static final String DTOFIELD_DEDBCFGOBJ = "dedbcfgobj";
    public static final String FIELD_DEDQENGOBJ = "DEDQENGOBJ";
    protected static final String DTOFIELD_DEDQENGOBJ = "dedqengobj";
    public static final String FIELD_DEDQPUBOBJ = "DEDQPUBOBJ";
    protected static final String DTOFIELD_DEDQPUBOBJ = "dedqpubobj";
    public static final String FIELD_DEDSPUBOBJ = "DEDSPUBOBJ";
    protected static final String DTOFIELD_DEDSPUBOBJ = "dedspubobj";
    public static final String FIELD_DEFDTCOLOBJ = "DEFDTCOLOBJ";
    protected static final String DTOFIELD_DEFDTCOLOBJ = "defdtcolobj";
    public static final String FIELD_DELETESPPUBOBJ = "DELETESPPUBOBJ";
    protected static final String DTOFIELD_DELETESPPUBOBJ = "deletesppubobj";
    public static final String FIELD_GETSPPUBOBJ = "GETSPPUBOBJ";
    protected static final String DTOFIELD_GETSPPUBOBJ = "getsppubobj";
    public static final String FIELD_HIBDIALECT = "HIBDIALECT";
    protected static final String DTOFIELD_HIBDIALECT = "hibdialect";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_INSERTSPPUBOBJ = "INSERTSPPUBOBJ";
    protected static final String DTOFIELD_INSERTSPPUBOBJ = "insertsppubobj";
    public static final String FIELD_INSTALLPATH = "INSTALLPATH";
    protected static final String DTOFIELD_INSTALLPATH = "installpath";
    public static final String FIELD_JDBCDIALECT = "JDBCDIALECT";
    protected static final String DTOFIELD_JDBCDIALECT = "jdbcdialect";
    public static final String FIELD_JDBCDRIVERNAME = "JDBCDRIVERNAME";
    protected static final String DTOFIELD_JDBCDRIVERNAME = "jdbcdrivername";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDBTYPEID = "PSDBTYPEID";
    protected static final String DTOFIELD_PSDBTYPEID = "psdbtypeid";
    public static final String FIELD_PSDBTYPENAME = "PSDBTYPENAME";
    protected static final String DTOFIELD_PSDBTYPENAME = "psdbtypename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_SYSDBCFGOBJ = "SYSDBCFGOBJ";
    protected static final String DTOFIELD_SYSDBCFGOBJ = "sysdbcfgobj";
    public static final String FIELD_TYPEHELPER = "TYPEHELPER";
    protected static final String DTOFIELD_TYPEHELPER = "typehelper";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATESPPUBOBJ = "UPDATESPPUBOBJ";
    protected static final String DTOFIELD_UPDATESPPUBOBJ = "updatesppubobj";

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSDBTypeDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSDBTypeDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("dbclientpath")
    public void setDBClientPath(String value) { _set(DTOFIELD_DBCLIENTPATH, value); }
    @JsonIgnore public String getDBClientPath() { return (String) _get(DTOFIELD_DBCLIENTPATH); }
    @JsonIgnore public boolean isDBClientPathDirty() { return _contains(DTOFIELD_DBCLIENTPATH); }
    @JsonIgnore public void resetDBClientPath() { _reset(DTOFIELD_DBCLIENTPATH); }
    @JsonIgnore public PSDBTypeDTO dbclientpath(String value) { setDBClientPath(value); return this; }

    @JsonProperty("dedbcfgobj")
    public void setDEDBCfgObj(String value) { _set(DTOFIELD_DEDBCFGOBJ, value); }
    @JsonIgnore public String getDEDBCfgObj() { return (String) _get(DTOFIELD_DEDBCFGOBJ); }
    @JsonIgnore public boolean isDEDBCfgObjDirty() { return _contains(DTOFIELD_DEDBCFGOBJ); }
    @JsonIgnore public void resetDEDBCfgObj() { _reset(DTOFIELD_DEDBCFGOBJ); }
    @JsonIgnore public PSDBTypeDTO dedbcfgobj(String value) { setDEDBCfgObj(value); return this; }

    @JsonProperty("dedqengobj")
    public void setDEDQEngObj(String value) { _set(DTOFIELD_DEDQENGOBJ, value); }
    @JsonIgnore public String getDEDQEngObj() { return (String) _get(DTOFIELD_DEDQENGOBJ); }
    @JsonIgnore public boolean isDEDQEngObjDirty() { return _contains(DTOFIELD_DEDQENGOBJ); }
    @JsonIgnore public void resetDEDQEngObj() { _reset(DTOFIELD_DEDQENGOBJ); }
    @JsonIgnore public PSDBTypeDTO dedqengobj(String value) { setDEDQEngObj(value); return this; }

    @JsonProperty("dedqpubobj")
    public void setDEDQPubObj(String value) { _set(DTOFIELD_DEDQPUBOBJ, value); }
    @JsonIgnore public String getDEDQPubObj() { return (String) _get(DTOFIELD_DEDQPUBOBJ); }
    @JsonIgnore public boolean isDEDQPubObjDirty() { return _contains(DTOFIELD_DEDQPUBOBJ); }
    @JsonIgnore public void resetDEDQPubObj() { _reset(DTOFIELD_DEDQPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO dedqpubobj(String value) { setDEDQPubObj(value); return this; }

    @JsonProperty("dedspubobj")
    public void setDEDSPubObj(String value) { _set(DTOFIELD_DEDSPUBOBJ, value); }
    @JsonIgnore public String getDEDSPubObj() { return (String) _get(DTOFIELD_DEDSPUBOBJ); }
    @JsonIgnore public boolean isDEDSPubObjDirty() { return _contains(DTOFIELD_DEDSPUBOBJ); }
    @JsonIgnore public void resetDEDSPubObj() { _reset(DTOFIELD_DEDSPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO dedspubobj(String value) { setDEDSPubObj(value); return this; }

    @JsonProperty("defdtcolobj")
    public void setDEFDTColObj(String value) { _set(DTOFIELD_DEFDTCOLOBJ, value); }
    @JsonIgnore public String getDEFDTColObj() { return (String) _get(DTOFIELD_DEFDTCOLOBJ); }
    @JsonIgnore public boolean isDEFDTColObjDirty() { return _contains(DTOFIELD_DEFDTCOLOBJ); }
    @JsonIgnore public void resetDEFDTColObj() { _reset(DTOFIELD_DEFDTCOLOBJ); }
    @JsonIgnore public PSDBTypeDTO defdtcolobj(String value) { setDEFDTColObj(value); return this; }

    @JsonProperty("deletesppubobj")
    public void setDeleteSPPubObj(String value) { _set(DTOFIELD_DELETESPPUBOBJ, value); }
    @JsonIgnore public String getDeleteSPPubObj() { return (String) _get(DTOFIELD_DELETESPPUBOBJ); }
    @JsonIgnore public boolean isDeleteSPPubObjDirty() { return _contains(DTOFIELD_DELETESPPUBOBJ); }
    @JsonIgnore public void resetDeleteSPPubObj() { _reset(DTOFIELD_DELETESPPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO deletesppubobj(String value) { setDeleteSPPubObj(value); return this; }

    @JsonProperty("getsppubobj")
    public void setGetSPPubObj(String value) { _set(DTOFIELD_GETSPPUBOBJ, value); }
    @JsonIgnore public String getGetSPPubObj() { return (String) _get(DTOFIELD_GETSPPUBOBJ); }
    @JsonIgnore public boolean isGetSPPubObjDirty() { return _contains(DTOFIELD_GETSPPUBOBJ); }
    @JsonIgnore public void resetGetSPPubObj() { _reset(DTOFIELD_GETSPPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO getsppubobj(String value) { setGetSPPubObj(value); return this; }

    @JsonProperty("hibdialect")
    public void setHibDialect(String value) { _set(DTOFIELD_HIBDIALECT, value); }
    @JsonIgnore public String getHibDialect() { return (String) _get(DTOFIELD_HIBDIALECT); }
    @JsonIgnore public boolean isHibDialectDirty() { return _contains(DTOFIELD_HIBDIALECT); }
    @JsonIgnore public void resetHibDialect() { _reset(DTOFIELD_HIBDIALECT); }
    @JsonIgnore public PSDBTypeDTO hibdialect(String value) { setHibDialect(value); return this; }

    @JsonProperty("iconpath")
    public void setIconPath(String value) { _set(DTOFIELD_ICONPATH, value); }
    @JsonIgnore public String getIconPath() { return (String) _get(DTOFIELD_ICONPATH); }
    @JsonIgnore public boolean isIconPathDirty() { return _contains(DTOFIELD_ICONPATH); }
    @JsonIgnore public void resetIconPath() { _reset(DTOFIELD_ICONPATH); }
    @JsonIgnore public PSDBTypeDTO iconpath(String value) { setIconPath(value); return this; }

    @JsonProperty("insertsppubobj")
    public void setInsertSPPubObj(String value) { _set(DTOFIELD_INSERTSPPUBOBJ, value); }
    @JsonIgnore public String getInsertSPPubObj() { return (String) _get(DTOFIELD_INSERTSPPUBOBJ); }
    @JsonIgnore public boolean isInsertSPPubObjDirty() { return _contains(DTOFIELD_INSERTSPPUBOBJ); }
    @JsonIgnore public void resetInsertSPPubObj() { _reset(DTOFIELD_INSERTSPPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO insertsppubobj(String value) { setInsertSPPubObj(value); return this; }

    @JsonProperty("installpath")
    public void setInstallPath(String value) { _set(DTOFIELD_INSTALLPATH, value); }
    @JsonIgnore public String getInstallPath() { return (String) _get(DTOFIELD_INSTALLPATH); }
    @JsonIgnore public boolean isInstallPathDirty() { return _contains(DTOFIELD_INSTALLPATH); }
    @JsonIgnore public void resetInstallPath() { _reset(DTOFIELD_INSTALLPATH); }
    @JsonIgnore public PSDBTypeDTO installpath(String value) { setInstallPath(value); return this; }

    @JsonProperty("jdbcdialect")
    public void setJdbcDialect(String value) { _set(DTOFIELD_JDBCDIALECT, value); }
    @JsonIgnore public String getJdbcDialect() { return (String) _get(DTOFIELD_JDBCDIALECT); }
    @JsonIgnore public boolean isJdbcDialectDirty() { return _contains(DTOFIELD_JDBCDIALECT); }
    @JsonIgnore public void resetJdbcDialect() { _reset(DTOFIELD_JDBCDIALECT); }
    @JsonIgnore public PSDBTypeDTO jdbcdialect(String value) { setJdbcDialect(value); return this; }

    @JsonProperty("jdbcdrivername")
    public void setJdbcDriverName(String value) { _set(DTOFIELD_JDBCDRIVERNAME, value); }
    @JsonIgnore public String getJdbcDriverName() { return (String) _get(DTOFIELD_JDBCDRIVERNAME); }
    @JsonIgnore public boolean isJdbcDriverNameDirty() { return _contains(DTOFIELD_JDBCDRIVERNAME); }
    @JsonIgnore public void resetJdbcDriverName() { _reset(DTOFIELD_JDBCDRIVERNAME); }
    @JsonIgnore public PSDBTypeDTO jdbcdrivername(String value) { setJdbcDriverName(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSDBTypeDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("psdbtypeid")
    public void setPSDBTypeId(String value) { _set(DTOFIELD_PSDBTYPEID, value); }
    @JsonIgnore public String getPSDBTypeId() { return (String) _get(DTOFIELD_PSDBTYPEID); }
    @JsonIgnore public boolean isPSDBTypeIdDirty() { return _contains(DTOFIELD_PSDBTYPEID); }
    @JsonIgnore public void resetPSDBTypeId() { _reset(DTOFIELD_PSDBTYPEID); }
    @JsonIgnore public PSDBTypeDTO psdbtypeid(String value) { setPSDBTypeId(value); return this; }

    @JsonProperty("psdbtypename")
    public void setPSDBTypeName(String value) { _set(DTOFIELD_PSDBTYPENAME, value); }
    @JsonIgnore public String getPSDBTypeName() { return (String) _get(DTOFIELD_PSDBTYPENAME); }
    @JsonIgnore public boolean isPSDBTypeNameDirty() { return _contains(DTOFIELD_PSDBTYPENAME); }
    @JsonIgnore public void resetPSDBTypeName() { _reset(DTOFIELD_PSDBTYPENAME); }
    @JsonIgnore public PSDBTypeDTO psdbtypename(String value) { setPSDBTypeName(value); return this; }
    @JsonIgnore public String getName() { return getPSDBTypeName(); }
    @JsonIgnore public void setName(String value) { setPSDBTypeName(value); }
    @JsonIgnore public PSDBTypeDTO name(String value) { setPSDBTypeName(value); return this; }

    @JsonProperty("pubmode")
    public void setPubMode(Integer value) { _set(DTOFIELD_PUBMODE, value); }
    @JsonIgnore public Integer getPubMode() { return (Integer) _get(DTOFIELD_PUBMODE); }
    @JsonIgnore public boolean isPubModeDirty() { return _contains(DTOFIELD_PUBMODE); }
    @JsonIgnore public void resetPubMode() { _reset(DTOFIELD_PUBMODE); }
    @JsonIgnore public PSDBTypeDTO pubmode(Integer value) { setPubMode(value); return this; }

    @JsonProperty("sysdbcfgobj")
    public void setSysDBCfgObj(String value) { _set(DTOFIELD_SYSDBCFGOBJ, value); }
    @JsonIgnore public String getSysDBCfgObj() { return (String) _get(DTOFIELD_SYSDBCFGOBJ); }
    @JsonIgnore public boolean isSysDBCfgObjDirty() { return _contains(DTOFIELD_SYSDBCFGOBJ); }
    @JsonIgnore public void resetSysDBCfgObj() { _reset(DTOFIELD_SYSDBCFGOBJ); }
    @JsonIgnore public PSDBTypeDTO sysdbcfgobj(String value) { setSysDBCfgObj(value); return this; }

    @JsonProperty("typehelper")
    public void setTypeHelper(String value) { _set(DTOFIELD_TYPEHELPER, value); }
    @JsonIgnore public String getTypeHelper() { return (String) _get(DTOFIELD_TYPEHELPER); }
    @JsonIgnore public boolean isTypeHelperDirty() { return _contains(DTOFIELD_TYPEHELPER); }
    @JsonIgnore public void resetTypeHelper() { _reset(DTOFIELD_TYPEHELPER); }
    @JsonIgnore public PSDBTypeDTO typehelper(String value) { setTypeHelper(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSDBTypeDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSDBTypeDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("updatesppubobj")
    public void setUpdateSPPubObj(String value) { _set(DTOFIELD_UPDATESPPUBOBJ, value); }
    @JsonIgnore public String getUpdateSPPubObj() { return (String) _get(DTOFIELD_UPDATESPPUBOBJ); }
    @JsonIgnore public boolean isUpdateSPPubObjDirty() { return _contains(DTOFIELD_UPDATESPPUBOBJ); }
    @JsonIgnore public void resetUpdateSPPubObj() { _reset(DTOFIELD_UPDATESPPUBOBJ); }
    @JsonIgnore public PSDBTypeDTO updatesppubobj(String value) { setUpdateSPPubObj(value); return this; }

    @JsonIgnore public String getId() { return getPSDBTypeId(); }
    @JsonIgnore public void setId(String value) { setPSDBTypeId(value); }
    @JsonIgnore public PSDBTypeDTO id(String value) { setPSDBTypeId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}