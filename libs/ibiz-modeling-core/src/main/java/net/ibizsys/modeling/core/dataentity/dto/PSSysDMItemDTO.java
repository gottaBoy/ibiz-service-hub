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

public class PSSysDMItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATESQL = "CREATESQL";
    protected static final String DTOFIELD_CREATESQL = "createsql";
    public static final String FIELD_CREATESQL2 = "CREATESQL2";
    protected static final String DTOFIELD_CREATESQL2 = "createsql2";
    public static final String FIELD_CREATESQL3 = "CREATESQL3";
    protected static final String DTOFIELD_CREATESQL3 = "createsql3";
    public static final String FIELD_CREATESQL4 = "CREATESQL4";
    protected static final String DTOFIELD_CREATESQL4 = "createsql4";
    public static final String FIELD_CREATESQL5 = "CREATESQL5";
    protected static final String DTOFIELD_CREATESQL5 = "createsql5";
    public static final String FIELD_CREATESQL6 = "CREATESQL6";
    protected static final String DTOFIELD_CREATESQL6 = "createsql6";
    public static final String FIELD_CREATESQL7 = "CREATESQL7";
    protected static final String DTOFIELD_CREATESQL7 = "createsql7";
    public static final String FIELD_DBOBJTYPE = "DBOBJTYPE";
    protected static final String DTOFIELD_DBOBJTYPE = "dbobjtype";
    public static final String FIELD_DROPSQL = "DROPSQL";
    protected static final String DTOFIELD_DROPSQL = "dropsql";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSSYSDMITEMID = "PSSYSDMITEMID";
    protected static final String DTOFIELD_PSSYSDMITEMID = "pssysdmitemid";
    public static final String FIELD_PSSYSDMITEMNAME = "PSSYSDMITEMNAME";
    protected static final String DTOFIELD_PSSYSDMITEMNAME = "pssysdmitemname";
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
    public static final String FIELD_TESTSQL = "TESTSQL";
    protected static final String DTOFIELD_TESTSQL = "testsql";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERFLAG = "USERFLAG";
    protected static final String DTOFIELD_USERFLAG = "userflag";

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
    public PSSysDMItemDTO createdate(Timestamp createDate) {
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
    public PSSysDMItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createsql")
    public void setCreateSql(String createSql) {
        this._set(DTOFIELD_CREATESQL, createSql);
    }

    @JsonIgnore
    public String getCreateSql() {
        Object objValue = this._get(DTOFIELD_CREATESQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSqlDirty() {
        return this._contains(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public void resetCreateSql() {
        this._reset(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql(String createSql) {
        this.setCreateSql(createSql);
        return this;
    }

    @JsonProperty(value="createsql2")
    public void setCreateSql2(String createSql2) {
        this._set(DTOFIELD_CREATESQL2, createSql2);
    }

    @JsonIgnore
    public String getCreateSql2() {
        Object objValue = this._get(DTOFIELD_CREATESQL2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql2Dirty() {
        return this._contains(DTOFIELD_CREATESQL2);
    }

    @JsonIgnore
    public void resetCreateSql2() {
        this._reset(DTOFIELD_CREATESQL2);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql2(String createSql2) {
        this.setCreateSql2(createSql2);
        return this;
    }

    @JsonProperty(value="createsql3")
    public void setCreateSql3(String createSql3) {
        this._set(DTOFIELD_CREATESQL3, createSql3);
    }

    @JsonIgnore
    public String getCreateSql3() {
        Object objValue = this._get(DTOFIELD_CREATESQL3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql3Dirty() {
        return this._contains(DTOFIELD_CREATESQL3);
    }

    @JsonIgnore
    public void resetCreateSql3() {
        this._reset(DTOFIELD_CREATESQL3);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql3(String createSql3) {
        this.setCreateSql3(createSql3);
        return this;
    }

    @JsonProperty(value="createsql4")
    public void setCreateSql4(String createSql4) {
        this._set(DTOFIELD_CREATESQL4, createSql4);
    }

    @JsonIgnore
    public String getCreateSql4() {
        Object objValue = this._get(DTOFIELD_CREATESQL4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql4Dirty() {
        return this._contains(DTOFIELD_CREATESQL4);
    }

    @JsonIgnore
    public void resetCreateSql4() {
        this._reset(DTOFIELD_CREATESQL4);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql4(String createSql4) {
        this.setCreateSql4(createSql4);
        return this;
    }

    @JsonProperty(value="createsql5")
    public void setCreateSql5(String createSql5) {
        this._set(DTOFIELD_CREATESQL5, createSql5);
    }

    @JsonIgnore
    public String getCreateSql5() {
        Object objValue = this._get(DTOFIELD_CREATESQL5);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql5Dirty() {
        return this._contains(DTOFIELD_CREATESQL5);
    }

    @JsonIgnore
    public void resetCreateSql5() {
        this._reset(DTOFIELD_CREATESQL5);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql5(String createSql5) {
        this.setCreateSql5(createSql5);
        return this;
    }

    @JsonProperty(value="createsql6")
    public void setCreateSql6(String createSql6) {
        this._set(DTOFIELD_CREATESQL6, createSql6);
    }

    @JsonIgnore
    public String getCreateSql6() {
        Object objValue = this._get(DTOFIELD_CREATESQL6);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql6Dirty() {
        return this._contains(DTOFIELD_CREATESQL6);
    }

    @JsonIgnore
    public void resetCreateSql6() {
        this._reset(DTOFIELD_CREATESQL6);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql6(String createSql6) {
        this.setCreateSql6(createSql6);
        return this;
    }

    @JsonProperty(value="createsql7")
    public void setCreateSql7(String createSql7) {
        this._set(DTOFIELD_CREATESQL7, createSql7);
    }

    @JsonIgnore
    public String getCreateSql7() {
        Object objValue = this._get(DTOFIELD_CREATESQL7);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSql7Dirty() {
        return this._contains(DTOFIELD_CREATESQL7);
    }

    @JsonIgnore
    public void resetCreateSql7() {
        this._reset(DTOFIELD_CREATESQL7);
    }

    @JsonIgnore
    public PSSysDMItemDTO createsql7(String createSql7) {
        this.setCreateSql7(createSql7);
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
    public PSSysDMItemDTO dbobjtype(String dBObjType) {
        this.setDBObjType(dBObjType);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemDTO dbobjtype(PSModelEnums.DBObjectType dBObjType) {
        if (dBObjType == null) {
            this.setDBObjType(null);
        } else {
            this.setDBObjType(dBObjType.value);
        }
        return this;
    }

    @JsonProperty(value="dropsql")
    public void setDropSql(String dropSql) {
        this._set(DTOFIELD_DROPSQL, dropSql);
    }

    @JsonIgnore
    public String getDropSql() {
        Object objValue = this._get(DTOFIELD_DROPSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDropSqlDirty() {
        return this._contains(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public void resetDropSql() {
        this._reset(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public PSSysDMItemDTO dropsql(String dropSql) {
        this.setDropSql(dropSql);
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
    public PSSysDMItemDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysDMItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysDMItemDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSObjId(String pSObjId) {
        this._set(DTOFIELD_PSOBJID, pSObjId);
    }

    @JsonIgnore
    public String getPSObjId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSObjId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSSysDMItemDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSObjName(String pSObjName) {
        this._set(DTOFIELD_PSOBJNAME, pSObjName);
    }

    @JsonIgnore
    public String getPSObjName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSObjName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSSysDMItemDTO psobjname(String pSObjName) {
        this.setPSObjName(pSObjName);
        return this;
    }

    @JsonProperty(value="pssysdmitemid")
    public void setPSSysDMItemId(String pSSysDMItemId) {
        this._set(DTOFIELD_PSSYSDMITEMID, pSSysDMItemId);
    }

    @JsonIgnore
    public String getPSSysDMItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSDMITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSDMITEMID);
    }

    @JsonIgnore
    public void resetPSSysDMItemId() {
        this._reset(DTOFIELD_PSSYSDMITEMID);
    }

    @JsonIgnore
    public PSSysDMItemDTO pssysdmitemid(String pSSysDMItemId) {
        this.setPSSysDMItemId(pSSysDMItemId);
        return this;
    }

    @JsonProperty(value="pssysdmitemname")
    public void setPSSysDMItemName(String pSSysDMItemName) {
        this._set(DTOFIELD_PSSYSDMITEMNAME, pSSysDMItemName);
    }

    @JsonIgnore
    public String getPSSysDMItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSDMITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDMItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSDMITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysDMItemName() {
        this._reset(DTOFIELD_PSSYSDMITEMNAME);
    }

    @JsonIgnore
    public PSSysDMItemDTO pssysdmitemname(String pSSysDMItemName) {
        this.setPSSysDMItemName(pSSysDMItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDMItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDMItemName(strName);
    }

    @JsonIgnore
    public PSSysDMItemDTO name(String strName) {
        this.setPSSysDMItemName(strName);
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
    public PSSysDMItemDTO pssysdmverid(String pSSysDMVerId) {
        this.setPSSysDMVerId(pSSysDMVerId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemDTO pssysdmverid(PSSysDMVerDTO pSSysDMVer) {
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
    public PSSysDMItemDTO pssysdmvername(String pSSysDMVerName) {
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
    public PSSysDMItemDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg) {
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
    public PSSysDMItemDTO pssystemdbcfgname(String pSSystemDBCfgName) {
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
    public PSSysDMItemDTO sysdbver(Integer sysDBVer) {
        this.setSysDBVer(sysDBVer);
        return this;
    }

    @JsonProperty(value="testsql")
    public void setTestSql(String testSql) {
        this._set(DTOFIELD_TESTSQL, testSql);
    }

    @JsonIgnore
    public String getTestSql() {
        Object objValue = this._get(DTOFIELD_TESTSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestSqlDirty() {
        return this._contains(DTOFIELD_TESTSQL);
    }

    @JsonIgnore
    public void resetTestSql() {
        this._reset(DTOFIELD_TESTSQL);
    }

    @JsonIgnore
    public PSSysDMItemDTO testsql(String testSql) {
        this.setTestSql(testSql);
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
    public PSSysDMItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysDMItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userflag")
    public void setUserFlag(Integer userFlag) {
        this._set(DTOFIELD_USERFLAG, userFlag);
    }

    @JsonIgnore
    public Integer getUserFlag() {
        Object objValue = this._get(DTOFIELD_USERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserFlagDirty() {
        return this._contains(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public void resetUserFlag() {
        this._reset(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public PSSysDMItemDTO userflag(Integer userFlag) {
        this.setUserFlag(userFlag);
        return this;
    }

    @JsonIgnore
    public PSSysDMItemDTO userflag(Boolean userFlag) {
        if (userFlag == null) {
            this.setUserFlag(null);
        } else {
            this.setUserFlag(userFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDMItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDMItemId(strValue);
    }

    @JsonIgnore
    public PSSysDMItemDTO id(String strValue) {
        this.setPSSysDMItemId(strValue);
        return this;
    }
}
