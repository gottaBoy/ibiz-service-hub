package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDMVerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDMItemLogDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBOBJTYPE = "DBOBJTYPE";
    protected static final String DTOFIELD_DBOBJTYPE = "dbobjtype";
    public static final String FIELD_FIXSQL = "FIXSQL";
    protected static final String DTOFIELD_FIXSQL = "fixsql";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEWSQL = "NEWSQL";
    protected static final String DTOFIELD_NEWSQL = "newsql";
    public static final String FIELD_NEWTAG = "NEWTAG";
    protected static final String DTOFIELD_NEWTAG = "newtag";
    public static final String FIELD_NEWTAG2 = "NEWTAG2";
    protected static final String DTOFIELD_NEWTAG2 = "newtag2";
    public static final String FIELD_OLDSQL = "OLDSQL";
    protected static final String DTOFIELD_OLDSQL = "oldsql";
    public static final String FIELD_OLDTAG = "OLDTAG";
    protected static final String DTOFIELD_OLDTAG = "oldtag";
    public static final String FIELD_OLDTAG2 = "OLDTAG2";
    protected static final String DTOFIELD_OLDTAG2 = "oldtag2";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSSYSDMITEMLOGID = "PSSYSDMITEMLOGID";
    protected static final String DTOFIELD_PSSYSDMITEMLOGID = "pssysdmitemlogid";
    public static final String FIELD_PSSYSDMITEMLOGNAME = "PSSYSDMITEMLOGNAME";
    protected static final String DTOFIELD_PSSYSDMITEMLOGNAME = "pssysdmitemlogname";
    public static final String FIELD_PSSYSDMVERID = "PSSYSDMVERID";
    protected static final String DTOFIELD_PSSYSDMVERID = "pssysdmverid";
    public static final String FIELD_PSSYSDMVERNAME = "PSSYSDMVERNAME";
    protected static final String DTOFIELD_PSSYSDMVERNAME = "pssysdmvername";
    public static final String FIELD_PSSYSTEMDBCFGID = "PSSYSTEMDBCFGID";
    protected static final String DTOFIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";
    public static final String FIELD_PSSYSTEMDBCFGNAME = "PSSYSTEMDBCFGNAME";
    protected static final String DTOFIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";
    public static final String FIELD_SYSDBVER = "SYSDBVER";
    protected static final String DTOFIELD_SYSDBVER = "sysdbver";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="createdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCreateDate(Timestamp createDate) {
        this._set(DTOFIELD_CREATEDATE, createDate);
    }

    @JsonIgnore
    public Timestamp getCreateDate() {
        Object objValue = this._get(DTOFIELD_CREATEDATE);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDMItemLogDTO createdate(Timestamp createDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDMItemLogDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbobjtype")
    public void setDBObjType(String dBObjType) {
        this._set(DTOFIELD_DBOBJTYPE, dBObjType);
    }

    @JsonIgnore
    public String getDBObjType() {
        Object objValue = this._get(DTOFIELD_DBOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBObjTypeDirty() {
        return this._contains(DTOFIELD_DBOBJTYPE);
    }

    @JsonIgnore
    public void resetDBObjType() {
        this._reset(DTOFIELD_DBOBJTYPE);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO dbobjtype(String dBObjType) {
        this.setDBObjType(dBObjType);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemLogDTO dbobjtype(PSModelEnums.DBObjectType dBObjType) {
        if (dBObjType == null) {
            this.setDBObjType(null);
        } else {
            this.setDBObjType(dBObjType.value);
        }
        return this;
    }

    @JsonProperty(value="fixsql")
    public void setFixSql(String fixSql) {
        this._set(DTOFIELD_FIXSQL, fixSql);
    }

    @JsonIgnore
    public String getFixSql() {
        Object objValue = this._get(DTOFIELD_FIXSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFixSqlDirty() {
        return this._contains(DTOFIELD_FIXSQL);
    }

    @JsonIgnore
    public void resetFixSql() {
        this._reset(DTOFIELD_FIXSQL);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO fixsql(String fixSql) {
        this.setFixSql(fixSql);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDMItemLogDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="newsql")
    public void setNewSql(String newSql) {
        this._set(DTOFIELD_NEWSQL, newSql);
    }

    @JsonIgnore
    public String getNewSql() {
        Object objValue = this._get(DTOFIELD_NEWSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNewSqlDirty() {
        return this._contains(DTOFIELD_NEWSQL);
    }

    @JsonIgnore
    public void resetNewSql() {
        this._reset(DTOFIELD_NEWSQL);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO newsql(String newSql) {
        this.setNewSql(newSql);
        return this;
    }

    @JsonProperty(value="newtag")
    public void setNewTag(String newTag) {
        this._set(DTOFIELD_NEWTAG, newTag);
    }

    @JsonIgnore
    public String getNewTag() {
        Object objValue = this._get(DTOFIELD_NEWTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNewTagDirty() {
        return this._contains(DTOFIELD_NEWTAG);
    }

    @JsonIgnore
    public void resetNewTag() {
        this._reset(DTOFIELD_NEWTAG);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO newtag(String newTag) {
        this.setNewTag(newTag);
        return this;
    }

    @JsonProperty(value="newtag2")
    public void setNewTag2(String newTag2) {
        this._set(DTOFIELD_NEWTAG2, newTag2);
    }

    @JsonIgnore
    public String getNewTag2() {
        Object objValue = this._get(DTOFIELD_NEWTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNewTag2Dirty() {
        return this._contains(DTOFIELD_NEWTAG2);
    }

    @JsonIgnore
    public void resetNewTag2() {
        this._reset(DTOFIELD_NEWTAG2);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO newtag2(String newTag2) {
        this.setNewTag2(newTag2);
        return this;
    }

    @JsonProperty(value="oldsql")
    public void setOldSql(String oldSql) {
        this._set(DTOFIELD_OLDSQL, oldSql);
    }

    @JsonIgnore
    public String getOldSql() {
        Object objValue = this._get(DTOFIELD_OLDSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOldSqlDirty() {
        return this._contains(DTOFIELD_OLDSQL);
    }

    @JsonIgnore
    public void resetOldSql() {
        this._reset(DTOFIELD_OLDSQL);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO oldsql(String oldSql) {
        this.setOldSql(oldSql);
        return this;
    }

    @JsonProperty(value="oldtag")
    public void setOldTag(String oldTag) {
        this._set(DTOFIELD_OLDTAG, oldTag);
    }

    @JsonIgnore
    public String getOldTag() {
        Object objValue = this._get(DTOFIELD_OLDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOldTagDirty() {
        return this._contains(DTOFIELD_OLDTAG);
    }

    @JsonIgnore
    public void resetOldTag() {
        this._reset(DTOFIELD_OLDTAG);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO oldtag(String oldTag) {
        this.setOldTag(oldTag);
        return this;
    }

    @JsonProperty(value="oldtag2")
    public void setOldTag2(String oldTag2) {
        this._set(DTOFIELD_OLDTAG2, oldTag2);
    }

    @JsonIgnore
    public String getOldTag2() {
        Object objValue = this._get(DTOFIELD_OLDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOldTag2Dirty() {
        return this._contains(DTOFIELD_OLDTAG2);
    }

    @JsonIgnore
    public void resetOldTag2() {
        this._reset(DTOFIELD_OLDTAG2);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO oldtag2(String oldTag2) {
        this.setOldTag2(oldTag2);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEIdDirty() {
        return this._contains(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public void resetPSDEId() {
        this._reset(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemLogDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSOBJId(String pSOBJId) {
        this._set(DTOFIELD_PSOBJID, pSOBJId);
    }

    @JsonIgnore
    public String getPSOBJId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSOBJIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSOBJId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO psobjid(String pSOBJId) {
        this.setPSOBJId(pSOBJId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSOBJName(String pSOBJName) {
        this._set(DTOFIELD_PSOBJNAME, pSOBJName);
    }

    @JsonIgnore
    public String getPSOBJName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSOBJNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSOBJName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO psobjname(String pSOBJName) {
        this.setPSOBJName(pSOBJName);
        return this;
    }

    @JsonProperty(value="pssysdmitemlogid")
    public void setPSSysDMItemLogId(String pSSysDMItemLogId) {
        this._set(DTOFIELD_PSSYSDMITEMLOGID, pSSysDMItemLogId);
    }

    @JsonIgnore
    public String getPSSysDMItemLogId() {
        Object objValue = this._get(DTOFIELD_PSSYSDMITEMLOGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMItemLogIdDirty() {
        return this._contains(DTOFIELD_PSSYSDMITEMLOGID);
    }

    @JsonIgnore
    public void resetPSSysDMItemLogId() {
        this._reset(DTOFIELD_PSSYSDMITEMLOGID);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssysdmitemlogid(String pSSysDMItemLogId) {
        this.setPSSysDMItemLogId(pSSysDMItemLogId);
        return this;
    }

    @JsonProperty(value="pssysdmitemlogname")
    public void setPSSysDMItemLogName(String pSSysDMItemLogName) {
        this._set(DTOFIELD_PSSYSDMITEMLOGNAME, pSSysDMItemLogName);
    }

    @JsonIgnore
    public String getPSSysDMItemLogName() {
        Object objValue = this._get(DTOFIELD_PSSYSDMITEMLOGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMItemLogNameDirty() {
        return this._contains(DTOFIELD_PSSYSDMITEMLOGNAME);
    }

    @JsonIgnore
    public void resetPSSysDMItemLogName() {
        this._reset(DTOFIELD_PSSYSDMITEMLOGNAME);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssysdmitemlogname(String pSSysDMItemLogName) {
        this.setPSSysDMItemLogName(pSSysDMItemLogName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDMItemLogName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDMItemLogName(strName);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO name(String strName) {
        this.setPSSysDMItemLogName(strName);
        return this;
    }

    @JsonProperty(value="pssysdmverid")
    public void setPSSysDMVerId(String pSSysDMVerId) {
        this._set(DTOFIELD_PSSYSDMVERID, pSSysDMVerId);
    }

    @JsonIgnore
    public String getPSSysDMVerId() {
        Object objValue = this._get(DTOFIELD_PSSYSDMVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMVerIdDirty() {
        return this._contains(DTOFIELD_PSSYSDMVERID);
    }

    @JsonIgnore
    public void resetPSSysDMVerId() {
        this._reset(DTOFIELD_PSSYSDMVERID);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssysdmverid(String pSSysDMVerId) {
        this.setPSSysDMVerId(pSSysDMVerId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssysdmverid(PSSysDMVerDTO pSSysDMVer) {
        if (pSSysDMVer == null) {
            this.setPSSysDMVerId(null);
            this.setPSSysDMVerName(null);
        } else {
            this.setPSSysDMVerId(pSSysDMVer.getPSSysDMVerId());
            this.setPSSysDMVerName(pSSysDMVer.getPSSysDMVerName());
        }
        return this;
    }

    @JsonProperty(value="pssysdmvername")
    public void setPSSysDMVerName(String pSSysDMVerName) {
        this._set(DTOFIELD_PSSYSDMVERNAME, pSSysDMVerName);
    }

    @JsonIgnore
    public String getPSSysDMVerName() {
        Object objValue = this._get(DTOFIELD_PSSYSDMVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMVerNameDirty() {
        return this._contains(DTOFIELD_PSSYSDMVERNAME);
    }

    @JsonIgnore
    public void resetPSSysDMVerName() {
        this._reset(DTOFIELD_PSSYSDMVERNAME);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssysdmvername(String pSSysDMVerName) {
        this.setPSSysDMVerName(pSSysDMVerName);
        return this;
    }

    @JsonProperty(value="pssystemdbcfgid")
    public void setPSSystemDBCfgId(String pSSystemDBCfgId) {
        this._set(DTOFIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }

    @JsonIgnore
    public String getPSSystemDBCfgId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMDBCFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMDBCFGID);
    }

    @JsonIgnore
    public void resetPSSystemDBCfgId() {
        this._reset(DTOFIELD_PSSYSTEMDBCFGID);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg) {
        if (pSSystemDBCfg == null) {
            this.setPSSystemDBCfgId(null);
            this.setPSSystemDBCfgName(null);
        } else {
            this.setPSSystemDBCfgId(pSSystemDBCfg.getPSSystemDBCfgId());
            this.setPSSystemDBCfgName(pSSystemDBCfg.getPSSystemDBCfgName());
        }
        return this;
    }

    @JsonProperty(value="pssystemdbcfgname")
    public void setPSSystemDBCfgName(String pSSystemDBCfgName) {
        this._set(DTOFIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }

    @JsonIgnore
    public String getPSSystemDBCfgName() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMDBCFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemDBCfgNameDirty() {
        return this._contains(DTOFIELD_PSSYSTEMDBCFGNAME);
    }

    @JsonIgnore
    public void resetPSSystemDBCfgName() {
        this._reset(DTOFIELD_PSSYSTEMDBCFGNAME);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO pssystemdbcfgname(String pSSystemDBCfgName) {
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    @JsonProperty(value="sysdbver")
    public void setSysDBVer(Integer sysDBVer) {
        this._set(DTOFIELD_SYSDBVER, sysDBVer);
    }

    @JsonIgnore
    public Integer getSysDBVer() {
        Object objValue = this._get(DTOFIELD_SYSDBVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSysDBVerDirty() {
        return this._contains(DTOFIELD_SYSDBVER);
    }

    @JsonIgnore
    public void resetSysDBVer() {
        this._reset(DTOFIELD_SYSDBVER);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO sysdbver(Integer sysDBVer) {
        this.setSysDBVer(sysDBVer);
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDMItemLogDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysDMItemLogDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDMItemLogId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDMItemLogId(strValue);
    }

    @JsonIgnore
    public PSSysDMItemLogDTO id(String strValue) {
        this.setPSSysDMItemLogId(strValue);
        return this;
    }
}
