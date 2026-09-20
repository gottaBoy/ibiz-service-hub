package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterDBInstDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSystemDBCfgDTO
extends PSModelDTOBase {
    public static final String FIELD_APPENDSCHEMA = "APPENDSCHEMA";
    protected static final String DTOFIELD_APPENDSCHEMA = "appendschema";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBSCHEMANAME = "DBSCHEMANAME";
    protected static final String DTOFIELD_DBSCHEMANAME = "dbschemaname";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NO2PSDBDEVINSTID = "NO2PSDBDEVINSTID";
    protected static final String DTOFIELD_NO2PSDBDEVINSTID = "no2psdbdevinstid";
    public static final String FIELD_NO2PSDBDEVINSTNAME = "NO2PSDBDEVINSTNAME";
    protected static final String DTOFIELD_NO2PSDBDEVINSTNAME = "no2psdbdevinstname";
    public static final String FIELD_NO2PSDCDBINSTID = "NO2PSDCDBINSTID";
    protected static final String DTOFIELD_NO2PSDCDBINSTID = "no2psdcdbinstid";
    public static final String FIELD_NO2PSDCDBINSTNAME = "NO2PSDCDBINSTNAME";
    protected static final String DTOFIELD_NO2PSDCDBINSTNAME = "no2psdcdbinstname";
    public static final String FIELD_NULLVALORDER = "NULLVALORDER";
    protected static final String DTOFIELD_NULLVALORDER = "nullvalorder";
    public static final String FIELD_OBJNAMECASE = "OBJNAMECASE";
    protected static final String DTOFIELD_OBJNAMECASE = "objnamecase";
    public static final String FIELD_PSDBDEVINSTID = "PSDBDEVINSTID";
    protected static final String DTOFIELD_PSDBDEVINSTID = "psdbdevinstid";
    public static final String FIELD_PSDBDEVINSTNAME = "PSDBDEVINSTNAME";
    protected static final String DTOFIELD_PSDBDEVINSTNAME = "psdbdevinstname";
    public static final String FIELD_PSDEVCENTERDBINSTID = "PSDEVCENTERDBINSTID";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";
    public static final String FIELD_PSDEVCENTERDBINSTNAME = "PSDEVCENTERDBINSTNAME";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";
    public static final String FIELD_PSSYSTEMDBCFGID = "PSSYSTEMDBCFGID";
    protected static final String DTOFIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";
    public static final String FIELD_PSSYSTEMDBCFGNAME = "PSSYSTEMDBCFGNAME";
    protected static final String DTOFIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";
    public static final String FIELD_PUBCOMMENTFLAG = "PUBCOMMENTFLAG";
    protected static final String DTOFIELD_PUBCOMMENTFLAG = "pubcommentflag";
    public static final String FIELD_PUBDBMODELFLAG = "PUBDBMODELFLAG";
    protected static final String DTOFIELD_PUBDBMODELFLAG = "pubdbmodelflag";
    public static final String FIELD_PUBFKEYFLAG = "PUBFKEYFLAG";
    protected static final String DTOFIELD_PUBFKEYFLAG = "pubfkeyflag";
    public static final String FIELD_PUBINDEXFLAG = "PUBINDEXFLAG";
    protected static final String DTOFIELD_PUBINDEXFLAG = "pubindexflag";
    public static final String FIELD_PUBVIEWFLAG = "PUBVIEWFLAG";
    protected static final String DTOFIELD_PUBVIEWFLAG = "pubviewflag";
    public static final String FIELD_RESREADYTIME = "RESREADYTIME";
    protected static final String DTOFIELD_RESREADYTIME = "resreadytime";
    public static final String FIELD_TABSPACE = "TABSPACE";
    protected static final String DTOFIELD_TABSPACE = "tabspace";
    public static final String FIELD_TABSPACE2 = "TABSPACE2";
    protected static final String DTOFIELD_TABSPACE2 = "tabspace2";
    public static final String FIELD_TABSPACE3 = "TABSPACE3";
    protected static final String DTOFIELD_TABSPACE3 = "tabspace3";
    public static final String FIELD_TABSPACE4 = "TABSPACE4";
    protected static final String DTOFIELD_TABSPACE4 = "tabspace4";
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

    @JsonProperty(value="appendschema")
    public void setAppendSchema(Integer appendSchema) {
        this._set(DTOFIELD_APPENDSCHEMA, appendSchema);
    }

    @JsonIgnore
    public Integer getAppendSchema() {
        Object objValue = this._get(DTOFIELD_APPENDSCHEMA);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAppendSchemaDirty() {
        return this._contains(DTOFIELD_APPENDSCHEMA);
    }

    @JsonIgnore
    public void resetAppendSchema() {
        this._reset(DTOFIELD_APPENDSCHEMA);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO appendschema(Integer appendSchema) {
        this.setAppendSchema(appendSchema);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO appendschema(Boolean appendSchema) {
        if (appendSchema == null) {
            this.setAppendSchema(null);
        } else {
            this.setAppendSchema(appendSchema != false ? 1 : 0);
        }
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
    public PSSystemDBCfgDTO createdate(Timestamp createDate) {
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
    public PSSystemDBCfgDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbschemaname")
    public void setDBSchemaName(String dBSchemaName) {
        this._set(DTOFIELD_DBSCHEMANAME, dBSchemaName);
    }

    @JsonIgnore
    public String getDBSchemaName() {
        Object objValue = this._get(DTOFIELD_DBSCHEMANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBSchemaNameDirty() {
        return this._contains(DTOFIELD_DBSCHEMANAME);
    }

    @JsonIgnore
    public void resetDBSchemaName() {
        this._reset(DTOFIELD_DBSCHEMANAME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO dbschemaname(String dBSchemaName) {
        this.setDBSchemaName(dBSchemaName);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
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
    public PSSystemDBCfgDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="no2psdbdevinstid")
    public void setNo2PSDBDevInstId(String no2PSDBDevInstId) {
        this._set(DTOFIELD_NO2PSDBDEVINSTID, no2PSDBDevInstId);
    }

    @JsonIgnore
    public String getNo2PSDBDevInstId() {
        Object objValue = this._get(DTOFIELD_NO2PSDBDEVINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDBDevInstIdDirty() {
        return this._contains(DTOFIELD_NO2PSDBDEVINSTID);
    }

    @JsonIgnore
    public void resetNo2PSDBDevInstId() {
        this._reset(DTOFIELD_NO2PSDBDEVINSTID);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO no2psdbdevinstid(String no2PSDBDevInstId) {
        this.setNo2PSDBDevInstId(no2PSDBDevInstId);
        return this;
    }

    @JsonProperty(value="no2psdbdevinstname")
    public void setNo2PSDBDevInstName(String no2PSDBDevInstName) {
        this._set(DTOFIELD_NO2PSDBDEVINSTNAME, no2PSDBDevInstName);
    }

    @JsonIgnore
    public String getNo2PSDBDevInstName() {
        Object objValue = this._get(DTOFIELD_NO2PSDBDEVINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDBDevInstNameDirty() {
        return this._contains(DTOFIELD_NO2PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public void resetNo2PSDBDevInstName() {
        this._reset(DTOFIELD_NO2PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO no2psdbdevinstname(String no2PSDBDevInstName) {
        this.setNo2PSDBDevInstName(no2PSDBDevInstName);
        return this;
    }

    @JsonProperty(value="no2psdcdbinstid")
    public void setNo2PSDCDBInstId(String no2PSDCDBInstId) {
        this._set(DTOFIELD_NO2PSDCDBINSTID, no2PSDCDBInstId);
    }

    @JsonIgnore
    public String getNo2PSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_NO2PSDCDBINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_NO2PSDCDBINSTID);
    }

    @JsonIgnore
    public void resetNo2PSDCDBInstId() {
        this._reset(DTOFIELD_NO2PSDCDBINSTID);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO no2psdcdbinstid(String no2PSDCDBInstId) {
        this.setNo2PSDCDBInstId(no2PSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO no2psdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setNo2PSDCDBInstId(null);
            this.setNo2PSDCDBInstName(null);
        } else {
            this.setNo2PSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setNo2PSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="no2psdcdbinstname")
    public void setNo2PSDCDBInstName(String no2PSDCDBInstName) {
        this._set(DTOFIELD_NO2PSDCDBINSTNAME, no2PSDCDBInstName);
    }

    @JsonIgnore
    public String getNo2PSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_NO2PSDCDBINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_NO2PSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetNo2PSDCDBInstName() {
        this._reset(DTOFIELD_NO2PSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO no2psdcdbinstname(String no2PSDCDBInstName) {
        this.setNo2PSDCDBInstName(no2PSDCDBInstName);
        return this;
    }

    @JsonProperty(value="nullvalorder")
    public void setNullValOrder(String nullValOrder) {
        this._set(DTOFIELD_NULLVALORDER, nullValOrder);
    }

    @JsonIgnore
    public String getNullValOrder() {
        Object objValue = this._get(DTOFIELD_NULLVALORDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNullValOrderDirty() {
        return this._contains(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public void resetNullValOrder() {
        this._reset(DTOFIELD_NULLVALORDER);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO nullvalorder(String nullValOrder) {
        this.setNullValOrder(nullValOrder);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO nullvalorder(PSModelEnums.DBNullValueOrderMode nullValOrder) {
        if (nullValOrder == null) {
            this.setNullValOrder(null);
        } else {
            this.setNullValOrder(nullValOrder.value);
        }
        return this;
    }

    @JsonProperty(value="objnamecase")
    public void setObjNameCase(String objNameCase) {
        this._set(DTOFIELD_OBJNAMECASE, objNameCase);
    }

    @JsonIgnore
    public String getObjNameCase() {
        Object objValue = this._get(DTOFIELD_OBJNAMECASE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjNameCaseDirty() {
        return this._contains(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public void resetObjNameCase() {
        this._reset(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO objnamecase(String objNameCase) {
        this.setObjNameCase(objNameCase);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO objnamecase(PSModelEnums.DBObjNameCaseMode objNameCase) {
        if (objNameCase == null) {
            this.setObjNameCase(null);
        } else {
            this.setObjNameCase(objNameCase.value);
        }
        return this;
    }

    @JsonProperty(value="psdbdevinstid")
    public void setPSDBDevInstId(String pSDBDevInstId) {
        this._set(DTOFIELD_PSDBDEVINSTID, pSDBDevInstId);
    }

    @JsonIgnore
    public String getPSDBDevInstId() {
        Object objValue = this._get(DTOFIELD_PSDBDEVINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBDevInstIdDirty() {
        return this._contains(DTOFIELD_PSDBDEVINSTID);
    }

    @JsonIgnore
    public void resetPSDBDevInstId() {
        this._reset(DTOFIELD_PSDBDEVINSTID);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO psdbdevinstid(String pSDBDevInstId) {
        this.setPSDBDevInstId(pSDBDevInstId);
        return this;
    }

    @JsonProperty(value="psdbdevinstname")
    public void setPSDBDevInstName(String pSDBDevInstName) {
        this._set(DTOFIELD_PSDBDEVINSTNAME, pSDBDevInstName);
    }

    @JsonIgnore
    public String getPSDBDevInstName() {
        Object objValue = this._get(DTOFIELD_PSDBDEVINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBDevInstNameDirty() {
        return this._contains(DTOFIELD_PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public void resetPSDBDevInstName() {
        this._reset(DTOFIELD_PSDBDEVINSTNAME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO psdbdevinstname(String pSDBDevInstName) {
        this.setPSDBDevInstName(pSDBDevInstName);
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstid")
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstId() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO psdevcenterdbinstid(String pSDevCenterDBInstId) {
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO psdevcenterdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPSDevCenterDBInstId(null);
            this.setPSDevCenterDBInstName(null);
        } else {
            this.setPSDevCenterDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPSDevCenterDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstname")
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstName() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO psdevcenterdbinstname(String pSDevCenterDBInstName) {
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
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
    public PSSystemDBCfgDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
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
    public PSSystemDBCfgDTO pssystemdbcfgname(String pSSystemDBCfgName) {
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pssystemdbcfgname(PSModelEnums.DBType pSSystemDBCfgName) {
        if (pSSystemDBCfgName == null) {
            this.setPSSystemDBCfgName(null);
        } else {
            this.setPSSystemDBCfgName(pSSystemDBCfgName.value);
        }
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSystemDBCfgName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSystemDBCfgName(strName);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO name(String strName) {
        this.setPSSystemDBCfgName(strName);
        return this;
    }

    @JsonProperty(value="pubcommentflag")
    public void setPubCommentFlag(Integer pubCommentFlag) {
        this._set(DTOFIELD_PUBCOMMENTFLAG, pubCommentFlag);
    }

    @JsonIgnore
    public Integer getPubCommentFlag() {
        Object objValue = this._get(DTOFIELD_PUBCOMMENTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubCommentFlagDirty() {
        return this._contains(DTOFIELD_PUBCOMMENTFLAG);
    }

    @JsonIgnore
    public void resetPubCommentFlag() {
        this._reset(DTOFIELD_PUBCOMMENTFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubcommentflag(Integer pubCommentFlag) {
        this.setPubCommentFlag(pubCommentFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubcommentflag(Boolean pubCommentFlag) {
        if (pubCommentFlag == null) {
            this.setPubCommentFlag(null);
        } else {
            this.setPubCommentFlag(pubCommentFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pubdbmodelflag")
    public void setPubDBModelFlag(Integer pubDBModelFlag) {
        this._set(DTOFIELD_PUBDBMODELFLAG, pubDBModelFlag);
    }

    @JsonIgnore
    public Integer getPubDBModelFlag() {
        Object objValue = this._get(DTOFIELD_PUBDBMODELFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubDBModelFlagDirty() {
        return this._contains(DTOFIELD_PUBDBMODELFLAG);
    }

    @JsonIgnore
    public void resetPubDBModelFlag() {
        this._reset(DTOFIELD_PUBDBMODELFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubdbmodelflag(Integer pubDBModelFlag) {
        this.setPubDBModelFlag(pubDBModelFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubdbmodelflag(Boolean pubDBModelFlag) {
        if (pubDBModelFlag == null) {
            this.setPubDBModelFlag(null);
        } else {
            this.setPubDBModelFlag(pubDBModelFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pubfkeyflag")
    public void setPubFKeyFlag(Integer pubFKeyFlag) {
        this._set(DTOFIELD_PUBFKEYFLAG, pubFKeyFlag);
    }

    @JsonIgnore
    public Integer getPubFKeyFlag() {
        Object objValue = this._get(DTOFIELD_PUBFKEYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubFKeyFlagDirty() {
        return this._contains(DTOFIELD_PUBFKEYFLAG);
    }

    @JsonIgnore
    public void resetPubFKeyFlag() {
        this._reset(DTOFIELD_PUBFKEYFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubfkeyflag(Integer pubFKeyFlag) {
        this.setPubFKeyFlag(pubFKeyFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubfkeyflag(Boolean pubFKeyFlag) {
        if (pubFKeyFlag == null) {
            this.setPubFKeyFlag(null);
        } else {
            this.setPubFKeyFlag(pubFKeyFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pubindexflag")
    public void setPubIndexFlag(Integer pubIndexFlag) {
        this._set(DTOFIELD_PUBINDEXFLAG, pubIndexFlag);
    }

    @JsonIgnore
    public Integer getPubIndexFlag() {
        Object objValue = this._get(DTOFIELD_PUBINDEXFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubIndexFlagDirty() {
        return this._contains(DTOFIELD_PUBINDEXFLAG);
    }

    @JsonIgnore
    public void resetPubIndexFlag() {
        this._reset(DTOFIELD_PUBINDEXFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubindexflag(Integer pubIndexFlag) {
        this.setPubIndexFlag(pubIndexFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubindexflag(Boolean pubIndexFlag) {
        if (pubIndexFlag == null) {
            this.setPubIndexFlag(null);
        } else {
            this.setPubIndexFlag(pubIndexFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pubviewflag")
    public void setPubViewFlag(Integer pubViewFlag) {
        this._set(DTOFIELD_PUBVIEWFLAG, pubViewFlag);
    }

    @JsonIgnore
    public Integer getPubViewFlag() {
        Object objValue = this._get(DTOFIELD_PUBVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubViewFlagDirty() {
        return this._contains(DTOFIELD_PUBVIEWFLAG);
    }

    @JsonIgnore
    public void resetPubViewFlag() {
        this._reset(DTOFIELD_PUBVIEWFLAG);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubviewflag(Integer pubViewFlag) {
        this.setPubViewFlag(pubViewFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO pubviewflag(Boolean pubViewFlag) {
        if (pubViewFlag == null) {
            this.setPubViewFlag(null);
        } else {
            this.setPubViewFlag(pubViewFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="resreadytime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setResReadyTime(Timestamp resReadyTime) {
        this._set(DTOFIELD_RESREADYTIME, resReadyTime);
    }

    @JsonIgnore
    public Timestamp getResReadyTime() {
        Object objValue = this._get(DTOFIELD_RESREADYTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isResReadyTimeDirty() {
        return this._contains(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public void resetResReadyTime() {
        this._reset(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO resreadytime(Timestamp resReadyTime) {
        this.setResReadyTime(resReadyTime);
        return this;
    }

    @JsonProperty(value="tabspace")
    public void setTabSpace(String tabSpace) {
        this._set(DTOFIELD_TABSPACE, tabSpace);
    }

    @JsonIgnore
    public String getTabSpace() {
        Object objValue = this._get(DTOFIELD_TABSPACE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabSpaceDirty() {
        return this._contains(DTOFIELD_TABSPACE);
    }

    @JsonIgnore
    public void resetTabSpace() {
        this._reset(DTOFIELD_TABSPACE);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO tabspace(String tabSpace) {
        this.setTabSpace(tabSpace);
        return this;
    }

    @JsonProperty(value="tabspace2")
    public void setTabSpace2(String tabSpace2) {
        this._set(DTOFIELD_TABSPACE2, tabSpace2);
    }

    @JsonIgnore
    public String getTabSpace2() {
        Object objValue = this._get(DTOFIELD_TABSPACE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabSpace2Dirty() {
        return this._contains(DTOFIELD_TABSPACE2);
    }

    @JsonIgnore
    public void resetTabSpace2() {
        this._reset(DTOFIELD_TABSPACE2);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO tabspace2(String tabSpace2) {
        this.setTabSpace2(tabSpace2);
        return this;
    }

    @JsonProperty(value="tabspace3")
    public void setTabSpace3(String tabSpace3) {
        this._set(DTOFIELD_TABSPACE3, tabSpace3);
    }

    @JsonIgnore
    public String getTabSpace3() {
        Object objValue = this._get(DTOFIELD_TABSPACE3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabSpace3Dirty() {
        return this._contains(DTOFIELD_TABSPACE3);
    }

    @JsonIgnore
    public void resetTabSpace3() {
        this._reset(DTOFIELD_TABSPACE3);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO tabspace3(String tabSpace3) {
        this.setTabSpace3(tabSpace3);
        return this;
    }

    @JsonProperty(value="tabspace4")
    public void setTabSpace4(String tabSpace4) {
        this._set(DTOFIELD_TABSPACE4, tabSpace4);
    }

    @JsonIgnore
    public String getTabSpace4() {
        Object objValue = this._get(DTOFIELD_TABSPACE4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabSpace4Dirty() {
        return this._contains(DTOFIELD_TABSPACE4);
    }

    @JsonIgnore
    public void resetTabSpace4() {
        this._reset(DTOFIELD_TABSPACE4);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO tabspace4(String tabSpace4) {
        this.setTabSpace4(tabSpace4);
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
    public PSSystemDBCfgDTO updatedate(Timestamp updateDate) {
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
    public PSSystemDBCfgDTO updateman(String updateMan) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDBCfgDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSystemDBCfgDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDBCfgDTO usertag(String userTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDBCfgDTO usertag2(String userTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDBCfgDTO usertag3(String userTag3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSystemDBCfgDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSystemDBCfgId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSystemDBCfgId(strValue);
    }

    @JsonIgnore
    public PSSystemDBCfgDTO id(String strValue) {
        this.setPSSystemDBCfgId(strValue);
        return this;
    }
}
