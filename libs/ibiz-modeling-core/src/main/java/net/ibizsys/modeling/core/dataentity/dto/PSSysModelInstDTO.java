package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysModelInstDTO
extends PSModelDTOBase {
    public static final String FIELD_BEGINCALCTIME = "BEGINCALCTIME";
    protected static final String DTOFIELD_BEGINCALCTIME = "begincalctime";
    public static final String FIELD_BEGINMAINTAINTIME = "BEGINMAINTAINTIME";
    protected static final String DTOFIELD_BEGINMAINTAINTIME = "beginmaintaintime";
    public static final String FIELD_CONFPSSYSMODELINSTID = "CONFPSSYSMODELINSTID";
    protected static final String DTOFIELD_CONFPSSYSMODELINSTID = "confpssysmodelinstid";
    public static final String FIELD_CONFPSSYSMODELINSTNAME = "CONFPSSYSMODELINSTNAME";
    protected static final String DTOFIELD_CONFPSSYSMODELINSTNAME = "confpssysmodelinstname";
    public static final String FIELD_CONNSTR = "CONNSTR";
    protected static final String DTOFIELD_CONNSTR = "connstr";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBNAME = "DBNAME";
    protected static final String DTOFIELD_DBNAME = "dbname";
    public static final String FIELD_DBTYPE = "DBTYPE";
    protected static final String DTOFIELD_DBTYPE = "dbtype";
    public static final String FIELD_ENDCALCTIME = "ENDCALCTIME";
    protected static final String DTOFIELD_ENDCALCTIME = "endcalctime";
    public static final String FIELD_ENDMAINTAINTIME = "ENDMAINTAINTIME";
    protected static final String DTOFIELD_ENDMAINTAINTIME = "endmaintaintime";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_INITPOOLSIZE = "INITPOOLSIZE";
    protected static final String DTOFIELD_INITPOOLSIZE = "initpoolsize";
    public static final String FIELD_INSTGROUP = "INSTGROUP";
    protected static final String DTOFIELD_INSTGROUP = "instgroup";
    public static final String FIELD_INSTSTATE = "INSTSTATE";
    protected static final String DTOFIELD_INSTSTATE = "inststate";
    public static final String FIELD_MAXPOOLSIZE = "MAXPOOLSIZE";
    protected static final String DTOFIELD_MAXPOOLSIZE = "maxpoolsize";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINPOOLSIZE = "MINPOOLSIZE";
    protected static final String DTOFIELD_MINPOOLSIZE = "minpoolsize";
    public static final String FIELD_MODELVER = "MODELVER";
    protected static final String DTOFIELD_MODELVER = "modelver";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
    public static final String FIELD_PARAM5 = "PARAM5";
    protected static final String DTOFIELD_PARAM5 = "param5";
    public static final String FIELD_PARAM6 = "PARAM6";
    protected static final String DTOFIELD_PARAM6 = "param6";
    public static final String FIELD_PARAM7 = "PARAM7";
    protected static final String DTOFIELD_PARAM7 = "param7";
    public static final String FIELD_PARAM8 = "PARAM8";
    protected static final String DTOFIELD_PARAM8 = "param8";
    public static final String FIELD_PASSWORD = "PASSWD";
    protected static final String DTOFIELD_PASSWORD = "password";
    public static final String FIELD_PATCHNUM = "PATCHNUM";
    protected static final String DTOFIELD_PATCHNUM = "patchnum";
    public static final String FIELD_PSDBSERVERID = "PSDBSERVERID";
    protected static final String DTOFIELD_PSDBSERVERID = "psdbserverid";
    public static final String FIELD_PSDBSERVERNAME = "PSDBSERVERNAME";
    protected static final String DTOFIELD_PSDBSERVERNAME = "psdbservername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSSVRDOMAINID = "PSSVRDOMAINID";
    protected static final String DTOFIELD_PSSVRDOMAINID = "pssvrdomainid";
    public static final String FIELD_PSSVRDOMAINNAME = "PSSVRDOMAINNAME";
    protected static final String DTOFIELD_PSSVRDOMAINNAME = "pssvrdomainname";
    public static final String FIELD_PSSYSMODELINSTID = "PSSYSMODELINSTID";
    protected static final String DTOFIELD_PSSYSMODELINSTID = "pssysmodelinstid";
    public static final String FIELD_PSSYSMODELINSTNAME = "PSSYSMODELINSTNAME";
    protected static final String DTOFIELD_PSSYSMODELINSTNAME = "pssysmodelinstname";
    public static final String FIELD_REFINFO = "REFINFO";
    protected static final String DTOFIELD_REFINFO = "refinfo";
    public static final String FIELD_ROWCNT = "ROWCNT";
    protected static final String DTOFIELD_ROWCNT = "rowcnt";
    public static final String FIELD_SHAREFLAG = "SHAREFLAG";
    protected static final String DTOFIELD_SHAREFLAG = "shareflag";
    public static final String FIELD_SYSROWKEY = "SYSROWKEY";
    protected static final String DTOFIELD_SYSROWKEY = "sysrowkey";
    public static final String FIELD_TEMPPSSYSMODELINSTID = "TEMPPSSYSMODELINSTID";
    protected static final String DTOFIELD_TEMPPSSYSMODELINSTID = "temppssysmodelinstid";
    public static final String FIELD_TEMPPSSYSMODELINSTNAME = "TEMPPSSYSMODELINSTNAME";
    protected static final String DTOFIELD_TEMPPSSYSMODELINSTNAME = "temppssysmodelinstname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USEDSIZE = "USEDSIZE";
    protected static final String DTOFIELD_USEDSIZE = "usedsize";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";

    @JsonProperty(value="begincalctime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBeginCalcTime(Timestamp beginCalcTime) {
        this._set(DTOFIELD_BEGINCALCTIME, beginCalcTime);
    }

    @JsonIgnore
    public Timestamp getBeginCalcTime() {
        Object objValue = this._get(DTOFIELD_BEGINCALCTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBeginCalcTimeDirty() {
        return this._contains(DTOFIELD_BEGINCALCTIME);
    }

    @JsonIgnore
    public void resetBeginCalcTime() {
        this._reset(DTOFIELD_BEGINCALCTIME);
    }

    @JsonIgnore
    public PSSysModelInstDTO begincalctime(Timestamp beginCalcTime) {
        this.setBeginCalcTime(beginCalcTime);
        return this;
    }

    @JsonProperty(value="beginmaintaintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBeginMaintainTime(Timestamp beginMaintainTime) {
        this._set(DTOFIELD_BEGINMAINTAINTIME, beginMaintainTime);
    }

    @JsonIgnore
    public Timestamp getBeginMaintainTime() {
        Object objValue = this._get(DTOFIELD_BEGINMAINTAINTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBeginMaintainTimeDirty() {
        return this._contains(DTOFIELD_BEGINMAINTAINTIME);
    }

    @JsonIgnore
    public void resetBeginMaintainTime() {
        this._reset(DTOFIELD_BEGINMAINTAINTIME);
    }

    @JsonIgnore
    public PSSysModelInstDTO beginmaintaintime(Timestamp beginMaintainTime) {
        this.setBeginMaintainTime(beginMaintainTime);
        return this;
    }

    @JsonProperty(value="confpssysmodelinstid")
    public void setConfPSSysModelInstId(String confPSSysModelInstId) {
        this._set(DTOFIELD_CONFPSSYSMODELINSTID, confPSSysModelInstId);
    }

    @JsonIgnore
    public String getConfPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_CONFPSSYSMODELINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConfPSSysModelInstIdDirty() {
        return this._contains(DTOFIELD_CONFPSSYSMODELINSTID);
    }

    @JsonIgnore
    public void resetConfPSSysModelInstId() {
        this._reset(DTOFIELD_CONFPSSYSMODELINSTID);
    }

    @JsonIgnore
    public PSSysModelInstDTO confpssysmodelinstid(String confPSSysModelInstId) {
        this.setConfPSSysModelInstId(confPSSysModelInstId);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO confpssysmodelinstid(PSSysModelInstDTO pSSysModelInst) {
        if (pSSysModelInst == null) {
            this.setConfPSSysModelInstId(null);
            this.setConfPSSysModelInstName(null);
        } else {
            this.setConfPSSysModelInstId(pSSysModelInst.getPSSysModelInstId());
            this.setConfPSSysModelInstName(pSSysModelInst.getPSSysModelInstName());
        }
        return this;
    }

    @JsonProperty(value="confpssysmodelinstname")
    public void setConfPSSysModelInstName(String confPSSysModelInstName) {
        this._set(DTOFIELD_CONFPSSYSMODELINSTNAME, confPSSysModelInstName);
    }

    @JsonIgnore
    public String getConfPSSysModelInstName() {
        Object objValue = this._get(DTOFIELD_CONFPSSYSMODELINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConfPSSysModelInstNameDirty() {
        return this._contains(DTOFIELD_CONFPSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public void resetConfPSSysModelInstName() {
        this._reset(DTOFIELD_CONFPSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO confpssysmodelinstname(String confPSSysModelInstName) {
        this.setConfPSSysModelInstName(confPSSysModelInstName);
        return this;
    }

    @JsonProperty(value="connstr")
    public void setConnStr(String connStr) {
        this._set(DTOFIELD_CONNSTR, connStr);
    }

    @JsonIgnore
    public String getConnStr() {
        Object objValue = this._get(DTOFIELD_CONNSTR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConnStrDirty() {
        return this._contains(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public void resetConnStr() {
        this._reset(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public PSSysModelInstDTO connstr(String connStr) {
        this.setConnStr(connStr);
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
    public PSSysModelInstDTO createdate(Timestamp createDate) {
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
    public PSSysModelInstDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbname")
    public void setDBName(String dBName) {
        this._set(DTOFIELD_DBNAME, dBName);
    }

    @JsonIgnore
    public String getDBName() {
        Object objValue = this._get(DTOFIELD_DBNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBNameDirty() {
        return this._contains(DTOFIELD_DBNAME);
    }

    @JsonIgnore
    public void resetDBName() {
        this._reset(DTOFIELD_DBNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO dbname(String dBName) {
        this.setDBName(dBName);
        return this;
    }

    @JsonProperty(value="dbtype")
    public void setDBType(String dBType) {
        this._set(DTOFIELD_DBTYPE, dBType);
    }

    @JsonIgnore
    public String getDBType() {
        Object objValue = this._get(DTOFIELD_DBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypeDirty() {
        return this._contains(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public void resetDBType() {
        this._reset(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public PSSysModelInstDTO dbtype(String dBType) {
        this.setDBType(dBType);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO dbtype(PSModelEnums.ModelInstDBType dBType) {
        if (dBType == null) {
            this.setDBType(null);
        } else {
            this.setDBType(dBType.value);
        }
        return this;
    }

    @JsonProperty(value="endcalctime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndCalcTime(Timestamp endCalcTime) {
        this._set(DTOFIELD_ENDCALCTIME, endCalcTime);
    }

    @JsonIgnore
    public Timestamp getEndCalcTime() {
        Object objValue = this._get(DTOFIELD_ENDCALCTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndCalcTimeDirty() {
        return this._contains(DTOFIELD_ENDCALCTIME);
    }

    @JsonIgnore
    public void resetEndCalcTime() {
        this._reset(DTOFIELD_ENDCALCTIME);
    }

    @JsonIgnore
    public PSSysModelInstDTO endcalctime(Timestamp endCalcTime) {
        this.setEndCalcTime(endCalcTime);
        return this;
    }

    @JsonProperty(value="endmaintaintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndMaintainTime(Timestamp endMaintainTime) {
        this._set(DTOFIELD_ENDMAINTAINTIME, endMaintainTime);
    }

    @JsonIgnore
    public Timestamp getEndMaintainTime() {
        Object objValue = this._get(DTOFIELD_ENDMAINTAINTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndMaintainTimeDirty() {
        return this._contains(DTOFIELD_ENDMAINTAINTIME);
    }

    @JsonIgnore
    public void resetEndMaintainTime() {
        this._reset(DTOFIELD_ENDMAINTAINTIME);
    }

    @JsonIgnore
    public PSSysModelInstDTO endmaintaintime(Timestamp endMaintainTime) {
        this.setEndMaintainTime(endMaintainTime);
        return this;
    }

    @JsonProperty(value="expriedtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpriedTime(Timestamp expriedTime) {
        this._set(DTOFIELD_EXPRIEDTIME, expriedTime);
    }

    @JsonIgnore
    public Timestamp getExpriedTime() {
        Object objValue = this._get(DTOFIELD_EXPRIEDTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpriedTimeDirty() {
        return this._contains(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public void resetExpriedTime() {
        this._reset(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public PSSysModelInstDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="initpoolsize")
    public void setInitPoolSize(Integer initPoolSize) {
        this._set(DTOFIELD_INITPOOLSIZE, initPoolSize);
    }

    @JsonIgnore
    public Integer getInitPoolSize() {
        Object objValue = this._get(DTOFIELD_INITPOOLSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInitPoolSizeDirty() {
        return this._contains(DTOFIELD_INITPOOLSIZE);
    }

    @JsonIgnore
    public void resetInitPoolSize() {
        this._reset(DTOFIELD_INITPOOLSIZE);
    }

    @JsonIgnore
    public PSSysModelInstDTO initpoolsize(Integer initPoolSize) {
        this.setInitPoolSize(initPoolSize);
        return this;
    }

    @JsonProperty(value="instgroup")
    public void setInstGroup(String instGroup) {
        this._set(DTOFIELD_INSTGROUP, instGroup);
    }

    @JsonIgnore
    public String getInstGroup() {
        Object objValue = this._get(DTOFIELD_INSTGROUP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstGroupDirty() {
        return this._contains(DTOFIELD_INSTGROUP);
    }

    @JsonIgnore
    public void resetInstGroup() {
        this._reset(DTOFIELD_INSTGROUP);
    }

    @JsonIgnore
    public PSSysModelInstDTO instgroup(String instGroup) {
        this.setInstGroup(instGroup);
        return this;
    }

    @JsonProperty(value="inststate")
    public void setInstState(String instState) {
        this._set(DTOFIELD_INSTSTATE, instState);
    }

    @JsonIgnore
    public String getInstState() {
        Object objValue = this._get(DTOFIELD_INSTSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstStateDirty() {
        return this._contains(DTOFIELD_INSTSTATE);
    }

    @JsonIgnore
    public void resetInstState() {
        this._reset(DTOFIELD_INSTSTATE);
    }

    @JsonIgnore
    public PSSysModelInstDTO inststate(String instState) {
        this.setInstState(instState);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO inststate(PSModelEnums.ModelInstState instState) {
        if (instState == null) {
            this.setInstState(null);
        } else {
            this.setInstState(instState.value);
        }
        return this;
    }

    @JsonProperty(value="maxpoolsize")
    public void setMaxPoolSize(Integer maxPoolSize) {
        this._set(DTOFIELD_MAXPOOLSIZE, maxPoolSize);
    }

    @JsonIgnore
    public Integer getMaxPoolSize() {
        Object objValue = this._get(DTOFIELD_MAXPOOLSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxPoolSizeDirty() {
        return this._contains(DTOFIELD_MAXPOOLSIZE);
    }

    @JsonIgnore
    public void resetMaxPoolSize() {
        this._reset(DTOFIELD_MAXPOOLSIZE);
    }

    @JsonIgnore
    public PSSysModelInstDTO maxpoolsize(Integer maxPoolSize) {
        this.setMaxPoolSize(maxPoolSize);
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
    public PSSysModelInstDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minpoolsize")
    public void setMinPoolSize(Integer minPoolSize) {
        this._set(DTOFIELD_MINPOOLSIZE, minPoolSize);
    }

    @JsonIgnore
    public Integer getMinPoolSize() {
        Object objValue = this._get(DTOFIELD_MINPOOLSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinPoolSizeDirty() {
        return this._contains(DTOFIELD_MINPOOLSIZE);
    }

    @JsonIgnore
    public void resetMinPoolSize() {
        this._reset(DTOFIELD_MINPOOLSIZE);
    }

    @JsonIgnore
    public PSSysModelInstDTO minpoolsize(Integer minPoolSize) {
        this.setMinPoolSize(minPoolSize);
        return this;
    }

    @JsonProperty(value="modelver")
    public void setModelVer(Integer modelVer) {
        this._set(DTOFIELD_MODELVER, modelVer);
    }

    @JsonIgnore
    public Integer getModelVer() {
        Object objValue = this._get(DTOFIELD_MODELVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelVerDirty() {
        return this._contains(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public void resetModelVer() {
        this._reset(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public PSSysModelInstDTO modelver(Integer modelVer) {
        this.setModelVer(modelVer);
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
    public PSSysModelInstDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="param")
    public void setParam(String param) {
        this._set(DTOFIELD_PARAM, param);
    }

    @JsonIgnore
    public String getParam() {
        Object objValue = this._get(DTOFIELD_PARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDirty() {
        return this._contains(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public void resetParam() {
        this._reset(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public PSSysModelInstDTO param(String param) {
        this.setParam(param);
        return this;
    }

    @JsonProperty(value="param2")
    public void setParam2(String param2) {
        this._set(DTOFIELD_PARAM2, param2);
    }

    @JsonIgnore
    public String getParam2() {
        Object objValue = this._get(DTOFIELD_PARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam2Dirty() {
        return this._contains(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public void resetParam2() {
        this._reset(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public PSSysModelInstDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(String param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public String getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSSysModelInstDTO param3(String param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(String param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public String getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSSysModelInstDTO param4(String param4) {
        this.setParam4(param4);
        return this;
    }

    @JsonProperty(value="param5")
    public void setParam5(Integer param5) {
        this._set(DTOFIELD_PARAM5, param5);
    }

    @JsonIgnore
    public Integer getParam5() {
        Object objValue = this._get(DTOFIELD_PARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam5Dirty() {
        return this._contains(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public void resetParam5() {
        this._reset(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public PSSysModelInstDTO param5(Integer param5) {
        this.setParam5(param5);
        return this;
    }

    @JsonProperty(value="param6")
    public void setParam6(Integer param6) {
        this._set(DTOFIELD_PARAM6, param6);
    }

    @JsonIgnore
    public Integer getParam6() {
        Object objValue = this._get(DTOFIELD_PARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam6Dirty() {
        return this._contains(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public void resetParam6() {
        this._reset(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public PSSysModelInstDTO param6(Integer param6) {
        this.setParam6(param6);
        return this;
    }

    @JsonProperty(value="param7")
    public void setParam7(Integer param7) {
        this._set(DTOFIELD_PARAM7, param7);
    }

    @JsonIgnore
    public Integer getParam7() {
        Object objValue = this._get(DTOFIELD_PARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam7Dirty() {
        return this._contains(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public void resetParam7() {
        this._reset(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public PSSysModelInstDTO param7(Integer param7) {
        this.setParam7(param7);
        return this;
    }

    @JsonProperty(value="param8")
    public void setParam8(Integer param8) {
        this._set(DTOFIELD_PARAM8, param8);
    }

    @JsonIgnore
    public Integer getParam8() {
        Object objValue = this._get(DTOFIELD_PARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam8Dirty() {
        return this._contains(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public void resetParam8() {
        this._reset(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public PSSysModelInstDTO param8(Integer param8) {
        this.setParam8(param8);
        return this;
    }

    @JsonProperty(value="password")
    public void setPassword(String password) {
        this._set(DTOFIELD_PASSWORD, password);
        this._set(FIELD_PASSWORD, password);
    }

    @JsonIgnore
    public String getPassword() {
        Object objValue = this._get(DTOFIELD_PASSWORD);
        if (objValue == null && (objValue = this._get(FIELD_PASSWORD)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswordDirty() {
        if (this._contains(DTOFIELD_PASSWORD)) {
            return true;
        }
        return this._contains(FIELD_PASSWORD);
    }

    @JsonIgnore
    public void resetPassword() {
        this._reset(DTOFIELD_PASSWORD);
        this._reset(FIELD_PASSWORD);
    }

    @JsonIgnore
    public PSSysModelInstDTO password(String password) {
        this.setPassword(password);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPassWD() {
        return this.getPassword();
    }

    @JsonIgnore
    @Deprecated
    public void setPassWD(String passWD) {
        this.setPassword(passWD);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPassWDDirty() {
        return this.isPasswordDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPassWD() {
        this.resetPassword();
    }

    @JsonProperty(value="patchnum")
    public void setPatchNum(Integer patchNum) {
        this._set(DTOFIELD_PATCHNUM, patchNum);
    }

    @JsonIgnore
    public Integer getPatchNum() {
        Object objValue = this._get(DTOFIELD_PATCHNUM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPatchNumDirty() {
        return this._contains(DTOFIELD_PATCHNUM);
    }

    @JsonIgnore
    public void resetPatchNum() {
        this._reset(DTOFIELD_PATCHNUM);
    }

    @JsonIgnore
    public PSSysModelInstDTO patchnum(Integer patchNum) {
        this.setPatchNum(patchNum);
        return this;
    }

    @JsonProperty(value="psdbserverid")
    public void setPSDBServerId(String pSDBServerId) {
        this._set(DTOFIELD_PSDBSERVERID, pSDBServerId);
    }

    @JsonIgnore
    public String getPSDBServerId() {
        Object objValue = this._get(DTOFIELD_PSDBSERVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBServerIdDirty() {
        return this._contains(DTOFIELD_PSDBSERVERID);
    }

    @JsonIgnore
    public void resetPSDBServerId() {
        this._reset(DTOFIELD_PSDBSERVERID);
    }

    @JsonIgnore
    public PSSysModelInstDTO psdbserverid(String pSDBServerId) {
        this.setPSDBServerId(pSDBServerId);
        return this;
    }

    @JsonProperty(value="psdbservername")
    public void setPSDBServerName(String pSDBServerName) {
        this._set(DTOFIELD_PSDBSERVERNAME, pSDBServerName);
    }

    @JsonIgnore
    public String getPSDBServerName() {
        Object objValue = this._get(DTOFIELD_PSDBSERVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBServerNameDirty() {
        return this._contains(DTOFIELD_PSDBSERVERNAME);
    }

    @JsonIgnore
    public void resetPSDBServerName() {
        this._reset(DTOFIELD_PSDBSERVERNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO psdbservername(String pSDBServerName) {
        this.setPSDBServerName(pSDBServerName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSSysModelInstDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="pssvrdomainid")
    public void setPSSvrDomainId(String pSSvrDomainId) {
        this._set(DTOFIELD_PSSVRDOMAINID, pSSvrDomainId);
    }

    @JsonIgnore
    public String getPSSvrDomainId() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainIdDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public void resetPSSvrDomainId() {
        this._reset(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public PSSysModelInstDTO pssvrdomainid(String pSSvrDomainId) {
        this.setPSSvrDomainId(pSSvrDomainId);
        return this;
    }

    @JsonProperty(value="pssvrdomainname")
    public void setPSSvrDomainName(String pSSvrDomainName) {
        this._set(DTOFIELD_PSSVRDOMAINNAME, pSSvrDomainName);
    }

    @JsonIgnore
    public String getPSSvrDomainName() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainNameDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public void resetPSSvrDomainName() {
        this._reset(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO pssvrdomainname(String pSSvrDomainName) {
        this.setPSSvrDomainName(pSSvrDomainName);
        return this;
    }

    @JsonProperty(value="pssysmodelinstid")
    public void setPSSysModelInstId(String pSSysModelInstId) {
        this._set(DTOFIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }

    @JsonIgnore
    public String getPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public void resetPSSysModelInstId() {
        this._reset(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public PSSysModelInstDTO pssysmodelinstid(String pSSysModelInstId) {
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    @JsonProperty(value="pssysmodelinstname")
    public void setPSSysModelInstName(String pSSysModelInstName) {
        this._set(DTOFIELD_PSSYSMODELINSTNAME, pSSysModelInstName);
    }

    @JsonIgnore
    public String getPSSysModelInstName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public void resetPSSysModelInstName() {
        this._reset(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO pssysmodelinstname(String pSSysModelInstName) {
        this.setPSSysModelInstName(pSSysModelInstName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysModelInstName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysModelInstName(strName);
    }

    @JsonIgnore
    public PSSysModelInstDTO name(String strName) {
        this.setPSSysModelInstName(strName);
        return this;
    }

    @JsonProperty(value="refinfo")
    public void setRefInfo(String refInfo) {
        this._set(DTOFIELD_REFINFO, refInfo);
    }

    @JsonIgnore
    public String getRefInfo() {
        Object objValue = this._get(DTOFIELD_REFINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefInfoDirty() {
        return this._contains(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public void resetRefInfo() {
        this._reset(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public PSSysModelInstDTO refinfo(String refInfo) {
        this.setRefInfo(refInfo);
        return this;
    }

    @JsonProperty(value="rowcnt")
    public void setRowCnt(Integer rowCnt) {
        this._set(DTOFIELD_ROWCNT, rowCnt);
    }

    @JsonIgnore
    public Integer getRowCnt() {
        Object objValue = this._get(DTOFIELD_ROWCNT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRowCntDirty() {
        return this._contains(DTOFIELD_ROWCNT);
    }

    @JsonIgnore
    public void resetRowCnt() {
        this._reset(DTOFIELD_ROWCNT);
    }

    @JsonIgnore
    public PSSysModelInstDTO rowcnt(Integer rowCnt) {
        this.setRowCnt(rowCnt);
        return this;
    }

    @JsonProperty(value="shareflag")
    public void setShareFlag(Integer shareFlag) {
        this._set(DTOFIELD_SHAREFLAG, shareFlag);
    }

    @JsonIgnore
    public Integer getShareFlag() {
        Object objValue = this._get(DTOFIELD_SHAREFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShareFlagDirty() {
        return this._contains(DTOFIELD_SHAREFLAG);
    }

    @JsonIgnore
    public void resetShareFlag() {
        this._reset(DTOFIELD_SHAREFLAG);
    }

    @JsonIgnore
    public PSSysModelInstDTO shareflag(Integer shareFlag) {
        this.setShareFlag(shareFlag);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO shareflag(Boolean shareFlag) {
        if (shareFlag == null) {
            this.setShareFlag(null);
        } else {
            this.setShareFlag(shareFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="sysrowkey")
    public void setSysRowKey(String sysRowKey) {
        this._set(DTOFIELD_SYSROWKEY, sysRowKey);
    }

    @JsonIgnore
    public String getSysRowKey() {
        Object objValue = this._get(DTOFIELD_SYSROWKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysRowKeyDirty() {
        return this._contains(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public void resetSysRowKey() {
        this._reset(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public PSSysModelInstDTO sysrowkey(String sysRowKey) {
        this.setSysRowKey(sysRowKey);
        return this;
    }

    @JsonProperty(value="temppssysmodelinstid")
    public void setTempPSSysModelInstId(String tempPSSysModelInstId) {
        this._set(DTOFIELD_TEMPPSSYSMODELINSTID, tempPSSysModelInstId);
    }

    @JsonIgnore
    public String getTempPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_TEMPPSSYSMODELINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTempPSSysModelInstIdDirty() {
        return this._contains(DTOFIELD_TEMPPSSYSMODELINSTID);
    }

    @JsonIgnore
    public void resetTempPSSysModelInstId() {
        this._reset(DTOFIELD_TEMPPSSYSMODELINSTID);
    }

    @JsonIgnore
    public PSSysModelInstDTO temppssysmodelinstid(String tempPSSysModelInstId) {
        this.setTempPSSysModelInstId(tempPSSysModelInstId);
        return this;
    }

    @JsonIgnore
    public PSSysModelInstDTO temppssysmodelinstid(PSSysModelInstDTO pSSysModelInst) {
        if (pSSysModelInst == null) {
            this.setTempPSSysModelInstId(null);
            this.setTempPSSysModelInstName(null);
        } else {
            this.setTempPSSysModelInstId(pSSysModelInst.getPSSysModelInstId());
            this.setTempPSSysModelInstName(pSSysModelInst.getPSSysModelInstName());
        }
        return this;
    }

    @JsonProperty(value="temppssysmodelinstname")
    public void setTempPSSysModelInstName(String tempPSSysModelInstName) {
        this._set(DTOFIELD_TEMPPSSYSMODELINSTNAME, tempPSSysModelInstName);
    }

    @JsonIgnore
    public String getTempPSSysModelInstName() {
        Object objValue = this._get(DTOFIELD_TEMPPSSYSMODELINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTempPSSysModelInstNameDirty() {
        return this._contains(DTOFIELD_TEMPPSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public void resetTempPSSysModelInstName() {
        this._reset(DTOFIELD_TEMPPSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO temppssysmodelinstname(String tempPSSysModelInstName) {
        this.setTempPSSysModelInstName(tempPSSysModelInstName);
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
    public PSSysModelInstDTO updatedate(Timestamp updateDate) {
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
    public PSSysModelInstDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usedsize")
    public void setUsedSize(Integer usedSize) {
        this._set(DTOFIELD_USEDSIZE, usedSize);
    }

    @JsonIgnore
    public Integer getUsedSize() {
        Object objValue = this._get(DTOFIELD_USEDSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUsedSizeDirty() {
        return this._contains(DTOFIELD_USEDSIZE);
    }

    @JsonIgnore
    public void resetUsedSize() {
        this._reset(DTOFIELD_USEDSIZE);
    }

    @JsonIgnore
    public PSSysModelInstDTO usedsize(Integer usedSize) {
        this.setUsedSize(usedSize);
        return this;
    }

    @JsonProperty(value="username")
    public void setUserName(String userName) {
        this._set(DTOFIELD_USERNAME, userName);
    }

    @JsonIgnore
    public String getUserName() {
        Object objValue = this._get(DTOFIELD_USERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserNameDirty() {
        return this._contains(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public void resetUserName() {
        this._reset(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public PSSysModelInstDTO username(String userName) {
        this.setUserName(userName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysModelInstId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysModelInstId(strValue);
    }

    @JsonIgnore
    public PSSysModelInstDTO id(String strValue) {
        this.setPSSysModelInstId(strValue);
        return this;
    }
}
