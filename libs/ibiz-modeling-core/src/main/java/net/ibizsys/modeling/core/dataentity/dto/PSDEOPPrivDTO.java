package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEOPPrivDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DERVALIDFLAG = "DERVALIDFLAG";
    protected static final String DTOFIELD_DERVALIDFLAG = "dervalidflag";
    public static final String FIELD_DEVALIDFLAG = "DEVALIDFLAG";
    protected static final String DTOFIELD_DEVALIDFLAG = "devalidflag";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAJORPSDEID = "MAJORPSDEID";
    protected static final String DTOFIELD_MAJORPSDEID = "majorpsdeid";
    public static final String FIELD_MAPPSDEOPPRIVID = "MAPPSDEOPPRIVID";
    protected static final String DTOFIELD_MAPPSDEOPPRIVID = "mappsdeopprivid";
    public static final String FIELD_MAPPSDEOPPRIVNAME = "MAPPSDEOPPRIVNAME";
    protected static final String DTOFIELD_MAPPSDEOPPRIVNAME = "mappsdeopprivname";
    public static final String FIELD_MAPSYSUNIRESMODE = "MAPSYSUNIRESMODE";
    protected static final String DTOFIELD_MAPSYSUNIRESMODE = "mapsysuniresmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
    protected static final String DTOFIELD_SYSTEMFLAG = "systemflag";
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
    public PSDEOPPrivDTO createdate(Timestamp createDate) {
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
    public PSDEOPPrivDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dervalidflag")
    public void setDERValidFlag(Integer dERValidFlag) {
        this._set(DTOFIELD_DERVALIDFLAG, dERValidFlag);
    }

    @JsonIgnore
    public Integer getDERValidFlag() {
        Object objValue = this._get(DTOFIELD_DERVALIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDERValidFlagDirty() {
        return this._contains(DTOFIELD_DERVALIDFLAG);
    }

    @JsonIgnore
    public void resetDERValidFlag() {
        this._reset(DTOFIELD_DERVALIDFLAG);
    }

    @JsonIgnore
    public PSDEOPPrivDTO dervalidflag(Integer dERValidFlag) {
        this.setDERValidFlag(dERValidFlag);
        return this;
    }

    @JsonProperty(value="devalidflag")
    public void setDEValidFlag(Integer dEValidFlag) {
        this._set(DTOFIELD_DEVALIDFLAG, dEValidFlag);
    }

    @JsonIgnore
    public Integer getDEValidFlag() {
        Object objValue = this._get(DTOFIELD_DEVALIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEValidFlagDirty() {
        return this._contains(DTOFIELD_DEVALIDFLAG);
    }

    @JsonIgnore
    public void resetDEValidFlag() {
        this._reset(DTOFIELD_DEVALIDFLAG);
    }

    @JsonIgnore
    public PSDEOPPrivDTO devalidflag(Integer dEValidFlag) {
        this.setDEValidFlag(dEValidFlag);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
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
    public PSDEOPPrivDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="majorpsdeid")
    public void setMajorPSDEId(String majorPSDEId) {
        this._set(DTOFIELD_MAJORPSDEID, majorPSDEId);
    }

    @JsonIgnore
    public String getMajorPSDEId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEID);
    }

    @JsonIgnore
    public void resetMajorPSDEId() {
        this._reset(DTOFIELD_MAJORPSDEID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO majorpsdeid(String majorPSDEId) {
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    @JsonProperty(value="mappsdeopprivid")
    public void setMapPSDEOPPrivId(String mapPSDEOPPrivId) {
        this._set(DTOFIELD_MAPPSDEOPPRIVID, mapPSDEOPPrivId);
    }

    @JsonIgnore
    public String getMapPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_MAPPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_MAPPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetMapPSDEOPPrivId() {
        this._reset(DTOFIELD_MAPPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO mappsdeopprivid(String mapPSDEOPPrivId) {
        this.setMapPSDEOPPrivId(mapPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO mappsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setMapPSDEOPPrivId(null);
            this.setMapPSDEOPPrivName(null);
        } else {
            this.setMapPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setMapPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="mappsdeopprivname")
    public void setMapPSDEOPPrivName(String mapPSDEOPPrivName) {
        this._set(DTOFIELD_MAPPSDEOPPRIVNAME, mapPSDEOPPrivName);
    }

    @JsonIgnore
    public String getMapPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_MAPPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_MAPPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetMapPSDEOPPrivName() {
        this._reset(DTOFIELD_MAPPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEOPPrivDTO mappsdeopprivname(String mapPSDEOPPrivName) {
        this.setMapPSDEOPPrivName(mapPSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="mapsysuniresmode")
    public void setMapSysUniResMode(Integer mapSysUniResMode) {
        this._set(DTOFIELD_MAPSYSUNIRESMODE, mapSysUniResMode);
    }

    @JsonIgnore
    public Integer getMapSysUniResMode() {
        Object objValue = this._get(DTOFIELD_MAPSYSUNIRESMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMapSysUniResModeDirty() {
        return this._contains(DTOFIELD_MAPSYSUNIRESMODE);
    }

    @JsonIgnore
    public void resetMapSysUniResMode() {
        this._reset(DTOFIELD_MAPSYSUNIRESMODE);
    }

    @JsonIgnore
    public PSDEOPPrivDTO mapsysuniresmode(Integer mapSysUniResMode) {
        this.setMapSysUniResMode(mapSysUniResMode);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO mapsysuniresmode(Boolean mapSysUniResMode) {
        if (mapSysUniResMode == null) {
            this.setMapSysUniResMode(null);
        } else {
            this.setMapSysUniResMode(mapSysUniResMode != false ? 1 : 0);
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
    public PSDEOPPrivDTO memo(String memo) {
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
    public PSDEOPPrivDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setDEValidFlag(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setDEValidFlag(pSDataEntity.getValidFlag());
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
    public PSDEOPPrivDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEOPPrivName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEOPPrivName(strName);
    }

    @JsonIgnore
    public PSDEOPPrivDTO name(String strName) {
        this.setPSDEOPPrivName(strName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setDERValidFlag(null);
            this.setMajorPSDEId(null);
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setDERValidFlag(pSDER.getValidFlag());
            this.setMajorPSDEId(pSDER.getMajorPSDEId());
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSDEOPPrivDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSDEOPPrivDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSDEOPPrivDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    @JsonProperty(value="systemflag")
    public void setSystemFlag(Integer systemFlag) {
        this._set(DTOFIELD_SYSTEMFLAG, systemFlag);
    }

    @JsonIgnore
    public Integer getSystemFlag() {
        Object objValue = this._get(DTOFIELD_SYSTEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSystemFlagDirty() {
        return this._contains(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public void resetSystemFlag() {
        this._reset(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public PSDEOPPrivDTO systemflag(Integer systemFlag) {
        this.setSystemFlag(systemFlag);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO systemflag(Boolean systemFlag) {
        if (systemFlag == null) {
            this.setSystemFlag(null);
        } else {
            this.setSystemFlag(systemFlag != false ? 1 : 0);
        }
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
    public PSDEOPPrivDTO updatedate(Timestamp updateDate) {
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
    public PSDEOPPrivDTO updateman(String updateMan) {
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
    public PSDEOPPrivDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
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
    public PSDEOPPrivDTO usertag(String userTag) {
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
    public PSDEOPPrivDTO usertag2(String userTag2) {
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
    public PSDEOPPrivDTO usertag3(String userTag3) {
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
    public PSDEOPPrivDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEOPPrivId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEOPPrivId(strValue);
    }

    @JsonIgnore
    public PSDEOPPrivDTO id(String strValue) {
        this.setPSDEOPPrivId(strValue);
        return this;
    }
}
