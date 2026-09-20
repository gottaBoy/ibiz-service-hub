package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEMapDTO
extends PSModelDTOBase {
    public static final String FIELD_AUTODEACTIONMAP = "AUTODEACTIONMAP";
    protected static final String DTOFIELD_AUTODEACTIONMAP = "autodeactionmap";
    public static final String FIELD_AUTODEDQMAP = "AUTODEDQMAP";
    protected static final String DTOFIELD_AUTODEDQMAP = "autodedqmap";
    public static final String FIELD_AUTODEDSMAP = "AUTODEDSMAP";
    protected static final String DTOFIELD_AUTODEDSMAP = "autodedsmap";
    public static final String FIELD_AUTODEFIELDMAP = "AUTODEFIELDMAP";
    protected static final String DTOFIELD_AUTODEFIELDMAP = "autodefieldmap";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_DSTPSDENAME = "DSTPSDENAME";
    protected static final String DTOFIELD_DSTPSDENAME = "dstpsdename";
    public static final String FIELD_DSTPSSYSREFDEID = "DSTPSSYSREFDEID";
    protected static final String DTOFIELD_DSTPSSYSREFDEID = "dstpssysrefdeid";
    public static final String FIELD_DSTPSSYSREFDENAME = "DSTPSSYSREFDENAME";
    protected static final String DTOFIELD_DSTPSSYSREFDENAME = "dstpssysrefdename";
    public static final String FIELD_LOGICHOLDER = "LOGICHOLDER";
    protected static final String DTOFIELD_LOGICHOLDER = "logicholder";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MAPMODE = "MAPMODE";
    protected static final String DTOFIELD_MAPMODE = "mapmode";
    public static final String FIELD_MAPTARGET = "MAPTARGET";
    protected static final String DTOFIELD_MAPTARGET = "maptarget";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PROPERTYMAP = "PROPERTYMAP";
    protected static final String DTOFIELD_PROPERTYMAP = "propertymap";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAPID = "PSDEMAPID";
    protected static final String DTOFIELD_PSDEMAPID = "psdemapid";
    public static final String FIELD_PSDEMAPNAME = "PSDEMAPNAME";
    protected static final String DTOFIELD_PSDEMAPNAME = "psdemapname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREFID = "PSSYSREFID";
    protected static final String DTOFIELD_PSSYSREFID = "pssysrefid";
    public static final String FIELD_PSSYSREFNAME = "PSSYSREFNAME";
    protected static final String DTOFIELD_PSSYSREFNAME = "pssysrefname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String DTOFIELD_PSDEMAPACTIONS = "psdemapactions";
    public static final String DTOFIELD_PSDEMAPDETAILS = "psdemapdetails";
    public static final String DTOFIELD_PSDEMAPDQS = "psdemapdqs";
    public static final String DTOFIELD_PSDEMAPDS = "psdemapds";

    @JsonProperty(value="autodeactionmap")
    public void setAutoDEActionMap(Integer autoDEActionMap) {
        this._set(DTOFIELD_AUTODEACTIONMAP, autoDEActionMap);
    }

    @JsonIgnore
    public Integer getAutoDEActionMap() {
        Object objValue = this._get(DTOFIELD_AUTODEACTIONMAP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoDEActionMapDirty() {
        return this._contains(DTOFIELD_AUTODEACTIONMAP);
    }

    @JsonIgnore
    public void resetAutoDEActionMap() {
        this._reset(DTOFIELD_AUTODEACTIONMAP);
    }

    @JsonIgnore
    public PSDEMapDTO autodeactionmap(Integer autoDEActionMap) {
        this.setAutoDEActionMap(autoDEActionMap);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO autodeactionmap(Boolean autoDEActionMap) {
        if (autoDEActionMap == null) {
            this.setAutoDEActionMap(null);
        } else {
            this.setAutoDEActionMap(autoDEActionMap != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="autodedqmap")
    public void setAutoDEDQMap(Integer autoDEDQMap) {
        this._set(DTOFIELD_AUTODEDQMAP, autoDEDQMap);
    }

    @JsonIgnore
    public Integer getAutoDEDQMap() {
        Object objValue = this._get(DTOFIELD_AUTODEDQMAP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoDEDQMapDirty() {
        return this._contains(DTOFIELD_AUTODEDQMAP);
    }

    @JsonIgnore
    public void resetAutoDEDQMap() {
        this._reset(DTOFIELD_AUTODEDQMAP);
    }

    @JsonIgnore
    public PSDEMapDTO autodedqmap(Integer autoDEDQMap) {
        this.setAutoDEDQMap(autoDEDQMap);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO autodedqmap(Boolean autoDEDQMap) {
        if (autoDEDQMap == null) {
            this.setAutoDEDQMap(null);
        } else {
            this.setAutoDEDQMap(autoDEDQMap != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="autodedsmap")
    public void setAutoDEDSMap(Integer autoDEDSMap) {
        this._set(DTOFIELD_AUTODEDSMAP, autoDEDSMap);
    }

    @JsonIgnore
    public Integer getAutoDEDSMap() {
        Object objValue = this._get(DTOFIELD_AUTODEDSMAP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoDEDSMapDirty() {
        return this._contains(DTOFIELD_AUTODEDSMAP);
    }

    @JsonIgnore
    public void resetAutoDEDSMap() {
        this._reset(DTOFIELD_AUTODEDSMAP);
    }

    @JsonIgnore
    public PSDEMapDTO autodedsmap(Integer autoDEDSMap) {
        this.setAutoDEDSMap(autoDEDSMap);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO autodedsmap(Boolean autoDEDSMap) {
        if (autoDEDSMap == null) {
            this.setAutoDEDSMap(null);
        } else {
            this.setAutoDEDSMap(autoDEDSMap != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="autodefieldmap")
    public void setAutoDEFieldMap(Integer autoDEFieldMap) {
        this._set(DTOFIELD_AUTODEFIELDMAP, autoDEFieldMap);
    }

    @JsonIgnore
    public Integer getAutoDEFieldMap() {
        Object objValue = this._get(DTOFIELD_AUTODEFIELDMAP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoDEFieldMapDirty() {
        return this._contains(DTOFIELD_AUTODEFIELDMAP);
    }

    @JsonIgnore
    public void resetAutoDEFieldMap() {
        this._reset(DTOFIELD_AUTODEFIELDMAP);
    }

    @JsonIgnore
    public PSDEMapDTO autodefieldmap(Integer autoDEFieldMap) {
        this.setAutoDEFieldMap(autoDEFieldMap);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO autodefieldmap(Boolean autoDEFieldMap) {
        if (autoDEFieldMap == null) {
            this.setAutoDEFieldMap(null);
        } else {
            this.setAutoDEFieldMap(autoDEFieldMap != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDEMapDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEMapDTO createdate(Timestamp createDate) {
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
    public PSDEMapDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDEMapDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDEMapDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEMapDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dstpsdeid")
    public void setDSTPSDEId(String dSTPSDEId) {
        this._set(DTOFIELD_DSTPSDEID, dSTPSDEId);
    }

    @JsonIgnore
    public String getDSTPSDEId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTPSDEIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public void resetDSTPSDEId() {
        this._reset(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public PSDEMapDTO dstpsdeid(String dSTPSDEId) {
        this.setDSTPSDEId(dSTPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO dstpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setDSTPSDEId(null);
            this.setDSTPSDEName(null);
        } else {
            this.setDSTPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDSTPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdename")
    public void setDSTPSDEName(String dSTPSDEName) {
        this._set(DTOFIELD_DSTPSDENAME, dSTPSDEName);
    }

    @JsonIgnore
    public String getDSTPSDEName() {
        Object objValue = this._get(DTOFIELD_DSTPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTPSDENameDirty() {
        return this._contains(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public void resetDSTPSDEName() {
        this._reset(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public PSDEMapDTO dstpsdename(String dSTPSDEName) {
        this.setDSTPSDEName(dSTPSDEName);
        return this;
    }

    @JsonProperty(value="dstpssysrefdeid")
    public void setDstPSSysRefDEId(String dstPSSysRefDEId) {
        this._set(DTOFIELD_DSTPSSYSREFDEID, dstPSSysRefDEId);
    }

    @JsonIgnore
    public String getDstPSSysRefDEId() {
        Object objValue = this._get(DTOFIELD_DSTPSSYSREFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSSysRefDEIdDirty() {
        return this._contains(DTOFIELD_DSTPSSYSREFDEID);
    }

    @JsonIgnore
    public void resetDstPSSysRefDEId() {
        this._reset(DTOFIELD_DSTPSSYSREFDEID);
    }

    @JsonIgnore
    public PSDEMapDTO dstpssysrefdeid(String dstPSSysRefDEId) {
        this.setDstPSSysRefDEId(dstPSSysRefDEId);
        return this;
    }

    @JsonProperty(value="dstpssysrefdename")
    public void setDstPSSysRefDEName(String dstPSSysRefDEName) {
        this._set(DTOFIELD_DSTPSSYSREFDENAME, dstPSSysRefDEName);
    }

    @JsonIgnore
    public String getDstPSSysRefDEName() {
        Object objValue = this._get(DTOFIELD_DSTPSSYSREFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSSysRefDENameDirty() {
        return this._contains(DTOFIELD_DSTPSSYSREFDENAME);
    }

    @JsonIgnore
    public void resetDstPSSysRefDEName() {
        this._reset(DTOFIELD_DSTPSSYSREFDENAME);
    }

    @JsonIgnore
    public PSDEMapDTO dstpssysrefdename(String dstPSSysRefDEName) {
        this.setDstPSSysRefDEName(dstPSSysRefDEName);
        return this;
    }

    @JsonProperty(value="logicholder")
    public void setLogicHolder(Integer logicHolder) {
        this._set(DTOFIELD_LOGICHOLDER, logicHolder);
    }

    @JsonIgnore
    public Integer getLogicHolder() {
        Object objValue = this._get(DTOFIELD_LOGICHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLogicHolderDirty() {
        return this._contains(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public void resetLogicHolder() {
        this._reset(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public PSDEMapDTO logicholder(Integer logicHolder) {
        this.setLogicHolder(logicHolder);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO logicholder(PSModelEnums.DELogicHolder logicHolder) {
        if (logicHolder == null) {
            this.setLogicHolder(null);
        } else {
            this.setLogicHolder(logicHolder.value);
        }
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
    public PSDEMapDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="mapmode")
    public void setMapMode(String mapMode) {
        this._set(DTOFIELD_MAPMODE, mapMode);
    }

    @JsonIgnore
    public String getMapMode() {
        Object objValue = this._get(DTOFIELD_MAPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapModeDirty() {
        return this._contains(DTOFIELD_MAPMODE);
    }

    @JsonIgnore
    public void resetMapMode() {
        this._reset(DTOFIELD_MAPMODE);
    }

    @JsonIgnore
    public PSDEMapDTO mapmode(String mapMode) {
        this.setMapMode(mapMode);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO mapmode(PSModelEnums.DEMapObjectMapMode mapMode) {
        if (mapMode == null) {
            this.setMapMode(null);
        } else {
            this.setMapMode(mapMode.value);
        }
        return this;
    }

    @JsonProperty(value="maptarget")
    public void setMapTarget(String mapTarget) {
        this._set(DTOFIELD_MAPTARGET, mapTarget);
    }

    @JsonIgnore
    public String getMapTarget() {
        Object objValue = this._get(DTOFIELD_MAPTARGET);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTargetDirty() {
        return this._contains(DTOFIELD_MAPTARGET);
    }

    @JsonIgnore
    public void resetMapTarget() {
        this._reset(DTOFIELD_MAPTARGET);
    }

    @JsonIgnore
    public PSDEMapDTO maptarget(String mapTarget) {
        this.setMapTarget(mapTarget);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO maptarget(PSModelEnums.DEMapTargetType mapTarget) {
        if (mapTarget == null) {
            this.setMapTarget(null);
        } else {
            this.setMapTarget(mapTarget.value);
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
    public PSDEMapDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
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
    public PSDEMapDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="propertymap")
    public void setPropertyMap(String propertyMap) {
        this._set(DTOFIELD_PROPERTYMAP, propertyMap);
    }

    @JsonIgnore
    public String getPropertyMap() {
        Object objValue = this._get(DTOFIELD_PROPERTYMAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPropertyMapDirty() {
        return this._contains(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public void resetPropertyMap() {
        this._reset(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public PSDEMapDTO propertymap(String propertyMap) {
        this.setPropertyMap(propertyMap);
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
    public PSDEMapDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemapid")
    public void setPSDEMapId(String pSDEMapId) {
        this._set(DTOFIELD_PSDEMAPID, pSDEMapId);
    }

    @JsonIgnore
    public String getPSDEMapId() {
        Object objValue = this._get(DTOFIELD_PSDEMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapIdDirty() {
        return this._contains(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public void resetPSDEMapId() {
        this._reset(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public PSDEMapDTO psdemapid(String pSDEMapId) {
        this.setPSDEMapId(pSDEMapId);
        return this;
    }

    @JsonProperty(value="psdemapname")
    public void setPSDEMapName(String pSDEMapName) {
        this._set(DTOFIELD_PSDEMAPNAME, pSDEMapName);
    }

    @JsonIgnore
    public String getPSDEMapName() {
        Object objValue = this._get(DTOFIELD_PSDEMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapNameDirty() {
        return this._contains(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public void resetPSDEMapName() {
        this._reset(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public PSDEMapDTO psdemapname(String pSDEMapName) {
        this.setPSDEMapName(pSDEMapName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEMapName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEMapName(strName);
    }

    @JsonIgnore
    public PSDEMapDTO name(String strName) {
        this.setPSDEMapName(strName);
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
    public PSDEMapDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEMapDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEMapDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEMapDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEMapDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysrefid")
    public void setPSSysRefId(String pSSysRefId) {
        this._set(DTOFIELD_PSSYSREFID, pSSysRefId);
    }

    @JsonIgnore
    public String getPSSysRefId() {
        Object objValue = this._get(DTOFIELD_PSSYSREFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRefIdDirty() {
        return this._contains(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public void resetPSSysRefId() {
        this._reset(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public PSDEMapDTO pssysrefid(String pSSysRefId) {
        this.setPSSysRefId(pSSysRefId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO pssysrefid(PSSysRefDTO pSSysRef) {
        if (pSSysRef == null) {
            this.setPSSysRefId(null);
            this.setPSSysRefName(null);
        } else {
            this.setPSSysRefId(pSSysRef.getPSSysRefId());
            this.setPSSysRefName(pSSysRef.getPSSysRefName());
        }
        return this;
    }

    @JsonProperty(value="pssysrefname")
    public void setPSSysRefName(String pSSysRefName) {
        this._set(DTOFIELD_PSSYSREFNAME, pSSysRefName);
    }

    @JsonIgnore
    public String getPSSysRefName() {
        Object objValue = this._get(DTOFIELD_PSSYSREFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRefNameDirty() {
        return this._contains(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public void resetPSSysRefName() {
        this._reset(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public PSDEMapDTO pssysrefname(String pSSysRefName) {
        this.setPSSysRefName(pSSysRefName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSDEMapDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSDEMapDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSDEMapDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEMapDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSDEMapDTO updatedate(Timestamp updateDate) {
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
    public PSDEMapDTO updateman(String updateMan) {
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
    public PSDEMapDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEMapDTO usertag(String userTag) {
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
    public PSDEMapDTO usertag2(String userTag2) {
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
    public PSDEMapDTO usertag3(String userTag3) {
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
    public PSDEMapDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) {
            return null;
        }
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
    public PSDEMapDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEMapDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEMapId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEMapId(strValue);
    }

    @JsonIgnore
    public PSDEMapDTO id(String strValue) {
        this.setPSDEMapId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEMapActionDTO> getPSDEMapActions() {
        Object list = this._get(DTOFIELD_PSDEMAPACTIONS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemapactions")
    public void setPSDEMapActions(List<PSDEMapActionDTO> psdemapactions) {
        this._set(DTOFIELD_PSDEMAPACTIONS, psdemapactions);
    }

    @JsonIgnore
    public List<PSDEMapActionDTO> getPSDEMapActionsIf() {
        Object list = this._get(DTOFIELD_PSDEMAPACTIONS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMAPACTIONS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEMapDetailDTO> getPSDEMapDetails() {
        Object list = this._get(DTOFIELD_PSDEMAPDETAILS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemapdetails")
    public void setPSDEMapDetails(List<PSDEMapDetailDTO> psdemapdetails) {
        this._set(DTOFIELD_PSDEMAPDETAILS, psdemapdetails);
    }

    @JsonIgnore
    public List<PSDEMapDetailDTO> getPSDEMapDetailsIf() {
        Object list = this._get(DTOFIELD_PSDEMAPDETAILS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMAPDETAILS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEMapDQDTO> getPSDEMapDQs() {
        Object list = this._get(DTOFIELD_PSDEMAPDQS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemapdqs")
    public void setPSDEMapDQs(List<PSDEMapDQDTO> psdemapdqs) {
        this._set(DTOFIELD_PSDEMAPDQS, psdemapdqs);
    }

    @JsonIgnore
    public List<PSDEMapDQDTO> getPSDEMapDQsIf() {
        Object list = this._get(DTOFIELD_PSDEMAPDQS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMAPDQS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEMapDSDTO> getPSDEMapDs() {
        Object list = this._get(DTOFIELD_PSDEMAPDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdemapds")
    public void setPSDEMapDs(List<PSDEMapDSDTO> psdemapds) {
        this._set(DTOFIELD_PSDEMAPDS, psdemapds);
    }

    @JsonIgnore
    public List<PSDEMapDSDTO> getPSDEMapDsIf() {
        Object list = this._get(DTOFIELD_PSDEMAPDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEMAPDS, list);
        }
        return (List) list;
    }
}
