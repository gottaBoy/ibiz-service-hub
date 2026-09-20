package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSMobAppPackDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDInstCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDMVerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysRunSessionDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEBUGMODE = "DEBUGMODE";
    protected static final String DTOFIELD_DEBUGMODE = "debugmode";
    public static final String FIELD_ENABLEVC = "ENABLEVC";
    protected static final String DTOFIELD_ENABLEVC = "enablevc";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_FIXDBMODEL = "FIXDBMODEL";
    protected static final String DTOFIELD_FIXDBMODEL = "fixdbmodel";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PACKMODE = "PACKMODE";
    protected static final String DTOFIELD_PACKMODE = "packmode";
    public static final String FIELD_PSDEVSLNMSDEPAPIID = "PSDEVSLNMSDEPAPIID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPIID = "psdevslnmsdepapiid";
    public static final String FIELD_PSDEVSLNMSDEPAPINAME = "PSDEVSLNMSDEPAPINAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPINAME = "psdevslnmsdepapiname";
    public static final String FIELD_PSDEVSLNMSDEPAPPID = "PSDEVSLNMSDEPAPPID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPPID = "psdevslnmsdepappid";
    public static final String FIELD_PSDEVSLNMSDEPAPPNAME = "PSDEVSLNMSDEPAPPNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPAPPNAME = "psdevslnmsdepappname";
    public static final String FIELD_PSDEVSLNMSDEPFUNCID = "PSDEVSLNMSDEPFUNCID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCID = "psdevslnmsdepfuncid";
    public static final String FIELD_PSDEVSLNMSDEPFUNCNAME = "PSDEVSLNMSDEPFUNCNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCNAME = "psdevslnmsdepfuncname";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSMOBAPPPACKID = "PSMOBAPPPACKID";
    protected static final String DTOFIELD_PSMOBAPPPACKID = "psmobapppackid";
    public static final String FIELD_PSMOBAPPPACKNAME = "PSMOBAPPPACKNAME";
    protected static final String DTOFIELD_PSMOBAPPPACKNAME = "psmobapppackname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPID2 = "PSSYSAPPID2";
    protected static final String DTOFIELD_PSSYSAPPID2 = "pssysappid2";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSAPPNAME2 = "PSSYSAPPNAME2";
    protected static final String DTOFIELD_PSSYSAPPNAME2 = "pssysappname2";
    public static final String FIELD_PSSYSBDINSTCFGID = "PSSYSBDINSTCFGID";
    protected static final String DTOFIELD_PSSYSBDINSTCFGID = "pssysbdinstcfgid";
    public static final String FIELD_PSSYSBDINSTCFGNAME = "PSSYSBDINSTCFGNAME";
    protected static final String DTOFIELD_PSSYSBDINSTCFGNAME = "pssysbdinstcfgname";
    public static final String FIELD_PSSYSRUNSESSIONID = "PSSYSRUNSESSIONID";
    protected static final String DTOFIELD_PSSYSRUNSESSIONID = "pssysrunsessionid";
    public static final String FIELD_PSSYSRUNSESSIONNAME = "PSSYSRUNSESSIONNAME";
    protected static final String DTOFIELD_PSSYSRUNSESSIONNAME = "pssysrunsessionname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSSYSSFPUBNAME = "PSSYSSFPUBNAME";
    protected static final String DTOFIELD_PSSYSSFPUBNAME = "pssyssfpubname";
    public static final String FIELD_PSSYSTEMASID = "PSSYSTEMASID";
    protected static final String DTOFIELD_PSSYSTEMASID = "pssystemasid";
    public static final String FIELD_PSSYSTEMASNAME = "PSSYSTEMASNAME";
    protected static final String DTOFIELD_PSSYSTEMASNAME = "pssystemasname";
    public static final String FIELD_PSSYSTEMDBCFGID = "PSSYSTEMDBCFGID";
    protected static final String DTOFIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";
    public static final String FIELD_PSSYSTEMDBCFGNAME = "PSSYSTEMDBCFGNAME";
    protected static final String DTOFIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";
    public static final String FIELD_QUICKMODE = "QUICKMODE";
    protected static final String DTOFIELD_QUICKMODE = "quickmode";
    public static final String FIELD_REBUILDMODE = "REBUILDMODE";
    protected static final String DTOFIELD_REBUILDMODE = "rebuildmode";
    public static final String FIELD_RUNMODE = "RUNMODE";
    protected static final String DTOFIELD_RUNMODE = "runmode";
    public static final String FIELD_RUNPARAM = "RUNPARAM";
    protected static final String DTOFIELD_RUNPARAM = "runparam";
    public static final String FIELD_RUNPARAM10 = "RUNPARAM10";
    protected static final String DTOFIELD_RUNPARAM10 = "runparam10";
    public static final String FIELD_RUNPARAM11 = "RUNPARAM11";
    protected static final String DTOFIELD_RUNPARAM11 = "runparam11";
    public static final String FIELD_RUNPARAM12 = "RUNPARAM12";
    protected static final String DTOFIELD_RUNPARAM12 = "runparam12";
    public static final String FIELD_RUNPARAM2 = "RUNPARAM2";
    protected static final String DTOFIELD_RUNPARAM2 = "runparam2";
    public static final String FIELD_RUNPARAM3 = "RUNPARAM3";
    protected static final String DTOFIELD_RUNPARAM3 = "runparam3";
    public static final String FIELD_RUNPARAM4 = "RUNPARAM4";
    protected static final String DTOFIELD_RUNPARAM4 = "runparam4";
    public static final String FIELD_RUNPARAM5 = "RUNPARAM5";
    protected static final String DTOFIELD_RUNPARAM5 = "runparam5";
    public static final String FIELD_RUNPARAM6 = "RUNPARAM6";
    protected static final String DTOFIELD_RUNPARAM6 = "runparam6";
    public static final String FIELD_RUNPARAM7 = "RUNPARAM7";
    protected static final String DTOFIELD_RUNPARAM7 = "runparam7";
    public static final String FIELD_RUNPARAM8 = "RUNPARAM8";
    protected static final String DTOFIELD_RUNPARAM8 = "runparam8";
    public static final String FIELD_RUNPARAM9 = "RUNPARAM9";
    protected static final String DTOFIELD_RUNPARAM9 = "runparam9";
    public static final String FIELD_RUNPSSYSDYNAMODELID = "RUNPSSYSDYNAMODELID";
    protected static final String DTOFIELD_RUNPSSYSDYNAMODELID = "runpssysdynamodelid";
    public static final String FIELD_RUNPSSYSDYNAMODELNAME = "RUNPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_RUNPSSYSDYNAMODELNAME = "runpssysdynamodelname";
    public static final String FIELD_RUNSTATE = "RUNSTATE";
    protected static final String DTOFIELD_RUNSTATE = "runstate";
    public static final String FIELD_SRCPSSYSDMVERID = "SRCPSSYSDMVERID";
    protected static final String DTOFIELD_SRCPSSYSDMVERID = "srcpssysdmverid";
    public static final String FIELD_SRCPSSYSDMVERNAME = "SRCPSSYSDMVERNAME";
    protected static final String DTOFIELD_SRCPSSYSDMVERNAME = "srcpssysdmvername";
    public static final String FIELD_STARTTIME = "STARTTIME";
    protected static final String DTOFIELD_STARTTIME = "starttime";
    public static final String FIELD_STOPWHENTEMPLERROR = "STOPWHENTEMPLERROR";
    protected static final String DTOFIELD_STOPWHENTEMPLERROR = "stopwhentemplerror";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";

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
    public PSSysRunSessionDTO createdate(Timestamp createDate) {
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
    public PSSysRunSessionDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="debugmode")
    public void setDebugMode(Integer debugMode) {
        this._set(DTOFIELD_DEBUGMODE, debugMode);
    }

    @JsonIgnore
    public Integer getDebugMode() {
        Object objValue = this._get(DTOFIELD_DEBUGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDebugModeDirty() {
        return this._contains(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public void resetDebugMode() {
        this._reset(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO debugmode(Integer debugMode) {
        this.setDebugMode(debugMode);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO debugmode(Boolean debugMode) {
        if (debugMode == null) {
            this.setDebugMode(null);
        } else {
            this.setDebugMode(debugMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablevc")
    public void setEnableVC(Integer enableVC) {
        this._set(DTOFIELD_ENABLEVC, enableVC);
    }

    @JsonIgnore
    public Integer getEnableVC() {
        Object objValue = this._get(DTOFIELD_ENABLEVC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableVCDirty() {
        return this._contains(DTOFIELD_ENABLEVC);
    }

    @JsonIgnore
    public void resetEnableVC() {
        this._reset(DTOFIELD_ENABLEVC);
    }

    @JsonIgnore
    public PSSysRunSessionDTO enablevc(Integer enableVC) {
        this.setEnableVC(enableVC);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO enablevc(Boolean enableVC) {
        if (enableVC == null) {
            this.setEnableVC(null);
        } else {
            this.setEnableVC(enableVC != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="endtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndTime(Timestamp endTime) {
        this._set(DTOFIELD_ENDTIME, endTime);
    }

    @JsonIgnore
    public Timestamp getEndTime() {
        Object objValue = this._get(DTOFIELD_ENDTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndTimeDirty() {
        return this._contains(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public void resetEndTime() {
        this._reset(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO endtime(Timestamp endTime) {
        this.setEndTime(endTime);
        return this;
    }

    @JsonProperty(value="fixdbmodel")
    public void setFixDBModel(Integer fixDBModel) {
        this._set(DTOFIELD_FIXDBMODEL, fixDBModel);
    }

    @JsonIgnore
    public Integer getFixDBModel() {
        Object objValue = this._get(DTOFIELD_FIXDBMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFixDBModelDirty() {
        return this._contains(DTOFIELD_FIXDBMODEL);
    }

    @JsonIgnore
    public void resetFixDBModel() {
        this._reset(DTOFIELD_FIXDBMODEL);
    }

    @JsonIgnore
    public PSSysRunSessionDTO fixdbmodel(Integer fixDBModel) {
        this.setFixDBModel(fixDBModel);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO fixdbmodel(Boolean fixDBModel) {
        if (fixDBModel == null) {
            this.setFixDBModel(null);
        } else {
            this.setFixDBModel(fixDBModel != false ? 1 : 0);
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
    public PSSysRunSessionDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="packmode")
    public void setPackMode(String packMode) {
        this._set(DTOFIELD_PACKMODE, packMode);
    }

    @JsonIgnore
    public String getPackMode() {
        Object objValue = this._get(DTOFIELD_PACKMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPackModeDirty() {
        return this._contains(DTOFIELD_PACKMODE);
    }

    @JsonIgnore
    public void resetPackMode() {
        this._reset(DTOFIELD_PACKMODE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO packmode(String packMode) {
        this.setPackMode(packMode);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO packmode(PSModelEnums.SysRunPackMode packMode) {
        if (packMode == null) {
            this.setPackMode(null);
        } else {
            this.setPackMode(packMode.value);
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiid")
    public void setPSDevSlnMSDepAPIId(String pSDevSlnMSDepAPIId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPIID, pSDevSlnMSDepAPIId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPIIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPIID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepapiid(String pSDevSlnMSDepAPIId) {
        this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepapiid(PSDevSlnMSDepAPIDTO pSDevSlnMSDepAPI) {
        if (pSDevSlnMSDepAPI == null) {
            this.setPSDevSlnMSDepAPIId(null);
            this.setPSDevSlnMSDepAPIName(null);
        } else {
            this.setPSDevSlnMSDepAPIId(pSDevSlnMSDepAPI.getPSDevSlnMSDepAPIId());
            this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPI.getPSDevSlnMSDepAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepapiname")
    public void setPSDevSlnMSDepAPIName(String pSDevSlnMSDepAPIName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPINAME, pSDevSlnMSDepAPIName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAPIName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAPINameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAPIName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPINAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepapiname(String pSDevSlnMSDepAPIName) {
        this.setPSDevSlnMSDepAPIName(pSDevSlnMSDepAPIName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepappid")
    public void setPSDevSlnMSDepAppId(String pSDevSlnMSDepAppId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPPID, pSDevSlnMSDepAppId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAppId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAppIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPPID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAppId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPPID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepappid(String pSDevSlnMSDepAppId) {
        this.setPSDevSlnMSDepAppId(pSDevSlnMSDepAppId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepappid(PSDevSlnMSDepAppDTO pSDevSlnMSDepApp) {
        if (pSDevSlnMSDepApp == null) {
            this.setPSDevSlnMSDepAppId(null);
            this.setPSDevSlnMSDepAppName(null);
        } else {
            this.setPSDevSlnMSDepAppId(pSDevSlnMSDepApp.getPSDevSlnMSDepAppId());
            this.setPSDevSlnMSDepAppName(pSDevSlnMSDepApp.getPSDevSlnMSDepAppName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepappname")
    public void setPSDevSlnMSDepAppName(String pSDevSlnMSDepAppName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPAPPNAME, pSDevSlnMSDepAppName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepAppName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepAppNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepAppName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPAPPNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepappname(String pSDevSlnMSDepAppName) {
        this.setPSDevSlnMSDepAppName(pSDevSlnMSDepAppName);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncid")
    public void setPSDevSlnMSDepFuncId(String pSDevSlnMSDepFuncId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCID, pSDevSlnMSDepFuncId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepfuncid(String pSDevSlnMSDepFuncId) {
        this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFuncId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepfuncid(PSDevSlnMSDepFuncDTO pSDevSlnMSDepFunc) {
        if (pSDevSlnMSDepFunc == null) {
            this.setPSDevSlnMSDepFuncId(null);
            this.setPSDevSlnMSDepFuncName(null);
        } else {
            this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFunc.getPSDevSlnMSDepFuncId());
            this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFunc.getPSDevSlnMSDepFuncName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncname")
    public void setPSDevSlnMSDepFuncName(String pSDevSlnMSDepFuncName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCNAME, pSDevSlnMSDepFuncName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdevslnmsdepfuncname(String pSDevSlnMSDepFuncName) {
        this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFuncName);
        return this;
    }

    @JsonProperty(value="psdsconsoleid")
    public void setPSDSConsoleId(String pSDSConsoleId) {
        this._set(DTOFIELD_PSDSCONSOLEID, pSDSConsoleId);
    }

    @JsonIgnore
    public String getPSDSConsoleId() {
        Object objValue = this._get(DTOFIELD_PSDSCONSOLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDSConsoleIdDirty() {
        return this._contains(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public void resetPSDSConsoleId() {
        this._reset(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdsconsoleid(String pSDSConsoleId) {
        this.setPSDSConsoleId(pSDSConsoleId);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="psmobapppackid")
    public void setPSMobAppPackId(String pSMobAppPackId) {
        this._set(DTOFIELD_PSMOBAPPPACKID, pSMobAppPackId);
    }

    @JsonIgnore
    public String getPSMobAppPackId() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPPACKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppPackIdDirty() {
        return this._contains(DTOFIELD_PSMOBAPPPACKID);
    }

    @JsonIgnore
    public void resetPSMobAppPackId() {
        this._reset(DTOFIELD_PSMOBAPPPACKID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackid(String pSMobAppPackId) {
        this.setPSMobAppPackId(pSMobAppPackId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackid(PSMobAppPackDTO pSMobAppPack) {
        if (pSMobAppPack == null) {
            this.setPSMobAppPackId(null);
            this.setPSMobAppPackName(null);
        } else {
            this.setPSMobAppPackId(pSMobAppPack.getPSMobAppPackId());
            this.setPSMobAppPackName(pSMobAppPack.getPSMobAppPackName());
        }
        return this;
    }

    @JsonProperty(value="psmobapppackname")
    public void setPSMobAppPackName(String pSMobAppPackName) {
        this._set(DTOFIELD_PSMOBAPPPACKNAME, pSMobAppPackName);
    }

    @JsonIgnore
    public String getPSMobAppPackName() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPPACKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppPackNameDirty() {
        return this._contains(DTOFIELD_PSMOBAPPPACKNAME);
    }

    @JsonIgnore
    public void resetPSMobAppPackName() {
        this._reset(DTOFIELD_PSMOBAPPPACKNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO psmobapppackname(String pSMobAppPackName) {
        this.setPSMobAppPackName(pSMobAppPackName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappid2")
    public void setPSSysAppId2(String pSSysAppId2) {
        this._set(DTOFIELD_PSSYSAPPID2, pSSysAppId2);
    }

    @JsonIgnore
    public String getPSSysAppId2() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppId2Dirty() {
        return this._contains(DTOFIELD_PSSYSAPPID2);
    }

    @JsonIgnore
    public void resetPSSysAppId2() {
        this._reset(DTOFIELD_PSSYSAPPID2);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappid2(String pSSysAppId2) {
        this.setPSSysAppId2(pSSysAppId2);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappid2(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId2(null);
            this.setPSSysAppName2(null);
        } else {
            this.setPSSysAppId2(pSSysApp.getPSSysAppId());
            this.setPSSysAppName2(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysappname2")
    public void setPSSysAppName2(String pSSysAppName2) {
        this._set(DTOFIELD_PSSYSAPPNAME2, pSSysAppName2);
    }

    @JsonIgnore
    public String getPSSysAppName2() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppName2Dirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME2);
    }

    @JsonIgnore
    public void resetPSSysAppName2() {
        this._reset(DTOFIELD_PSSYSAPPNAME2);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysappname2(String pSSysAppName2) {
        this.setPSSysAppName2(pSSysAppName2);
        return this;
    }

    @JsonProperty(value="pssysbdinstcfgid")
    public void setPSSysBDInstCfgId(String pSSysBDInstCfgId) {
        this._set(DTOFIELD_PSSYSBDINSTCFGID, pSSysBDInstCfgId);
    }

    @JsonIgnore
    public String getPSSysBDInstCfgId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDINSTCFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDInstCfgIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDINSTCFGID);
    }

    @JsonIgnore
    public void resetPSSysBDInstCfgId() {
        this._reset(DTOFIELD_PSSYSBDINSTCFGID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgid(String pSSysBDInstCfgId) {
        this.setPSSysBDInstCfgId(pSSysBDInstCfgId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgid(PSSysBDInstCfgDTO pSSysBDInstCfg) {
        if (pSSysBDInstCfg == null) {
            this.setPSSysBDInstCfgId(null);
            this.setPSSysBDInstCfgName(null);
        } else {
            this.setPSSysBDInstCfgId(pSSysBDInstCfg.getPSSysBDInstCfgId());
            this.setPSSysBDInstCfgName(pSSysBDInstCfg.getPSSysBDInstCfgName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdinstcfgname")
    public void setPSSysBDInstCfgName(String pSSysBDInstCfgName) {
        this._set(DTOFIELD_PSSYSBDINSTCFGNAME, pSSysBDInstCfgName);
    }

    @JsonIgnore
    public String getPSSysBDInstCfgName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDINSTCFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDInstCfgNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDINSTCFGNAME);
    }

    @JsonIgnore
    public void resetPSSysBDInstCfgName() {
        this._reset(DTOFIELD_PSSYSBDINSTCFGNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysbdinstcfgname(String pSSysBDInstCfgName) {
        this.setPSSysBDInstCfgName(pSSysBDInstCfgName);
        return this;
    }

    @JsonProperty(value="pssysrunsessionid")
    public void setPSSysRunSessionId(String pSSysRunSessionId) {
        this._set(DTOFIELD_PSSYSRUNSESSIONID, pSSysRunSessionId);
    }

    @JsonIgnore
    public String getPSSysRunSessionId() {
        Object objValue = this._get(DTOFIELD_PSSYSRUNSESSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRunSessionIdDirty() {
        return this._contains(DTOFIELD_PSSYSRUNSESSIONID);
    }

    @JsonIgnore
    public void resetPSSysRunSessionId() {
        this._reset(DTOFIELD_PSSYSRUNSESSIONID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysrunsessionid(String pSSysRunSessionId) {
        this.setPSSysRunSessionId(pSSysRunSessionId);
        return this;
    }

    @JsonProperty(value="pssysrunsessionname")
    public void setPSSysRunSessionName(String pSSysRunSessionName) {
        this._set(DTOFIELD_PSSYSRUNSESSIONNAME, pSSysRunSessionName);
    }

    @JsonIgnore
    public String getPSSysRunSessionName() {
        Object objValue = this._get(DTOFIELD_PSSYSRUNSESSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRunSessionNameDirty() {
        return this._contains(DTOFIELD_PSSYSRUNSESSIONNAME);
    }

    @JsonIgnore
    public void resetPSSysRunSessionName() {
        this._reset(DTOFIELD_PSSYSRUNSESSIONNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysrunsessionname(String pSSysRunSessionName) {
        this.setPSSysRunSessionName(pSSysRunSessionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysRunSessionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysRunSessionName(strName);
    }

    @JsonIgnore
    public PSSysRunSessionDTO name(String strName) {
        this.setPSSysRunSessionName(strName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
        if (pSSysServiceAPI == null) {
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        } else {
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssysserviceapiname")
    public void setPSSysServiceAPIName(String pSSysServiceAPIName) {
        this._set(DTOFIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIName() {
        this._reset(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssysserviceapiname(String pSSysServiceAPIName) {
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssyssfpubid")
    public void setPSSysSFPubId(String pSSysSFPubId) {
        this._set(DTOFIELD_PSSYSSFPUBID, pSSysSFPubId);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPSSysSFPubId() {
        this._reset(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubid(String pSSysSFPubId) {
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub) {
        if (pSSysSFPub == null) {
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        } else {
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpubname")
    public void setPSSysSFPubName(String pSSysSFPubName) {
        this._set(DTOFIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }

    @JsonIgnore
    public String getPSSysSFPubName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPubName() {
        this._reset(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssyssfpubname(String pSSysSFPubName) {
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    @JsonProperty(value="pssystemasid")
    public void setPSSystemASId(String pSSystemASId) {
        this._set(DTOFIELD_PSSYSTEMASID, pSSystemASId);
    }

    @JsonIgnore
    public String getPSSystemASId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMASID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemASIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMASID);
    }

    @JsonIgnore
    public void resetPSSystemASId() {
        this._reset(DTOFIELD_PSSYSTEMASID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssystemasid(String pSSystemASId) {
        this.setPSSystemASId(pSSystemASId);
        return this;
    }

    @JsonProperty(value="pssystemasname")
    public void setPSSystemASName(String pSSystemASName) {
        this._set(DTOFIELD_PSSYSTEMASNAME, pSSystemASName);
    }

    @JsonIgnore
    public String getPSSystemASName() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMASNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemASNameDirty() {
        return this._contains(DTOFIELD_PSSYSTEMASNAME);
    }

    @JsonIgnore
    public void resetPSSystemASName() {
        this._reset(DTOFIELD_PSSYSTEMASNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssystemasname(String pSSystemASName) {
        this.setPSSystemASName(pSSystemASName);
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
    public PSSysRunSessionDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg) {
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
    public PSSysRunSessionDTO pssystemdbcfgname(String pSSystemDBCfgName) {
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    @JsonProperty(value="quickmode")
    public void setQuickMode(Integer quickMode) {
        this._set(DTOFIELD_QUICKMODE, quickMode);
    }

    @JsonIgnore
    public Integer getQuickMode() {
        Object objValue = this._get(DTOFIELD_QUICKMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isQuickModeDirty() {
        return this._contains(DTOFIELD_QUICKMODE);
    }

    @JsonIgnore
    public void resetQuickMode() {
        this._reset(DTOFIELD_QUICKMODE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO quickmode(Integer quickMode) {
        this.setQuickMode(quickMode);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO quickmode(Boolean quickMode) {
        if (quickMode == null) {
            this.setQuickMode(null);
        } else {
            this.setQuickMode(quickMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="rebuildmode")
    public void setRebuildMode(Integer rebuildMode) {
        this._set(DTOFIELD_REBUILDMODE, rebuildMode);
    }

    @JsonIgnore
    public Integer getRebuildMode() {
        Object objValue = this._get(DTOFIELD_REBUILDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRebuildModeDirty() {
        return this._contains(DTOFIELD_REBUILDMODE);
    }

    @JsonIgnore
    public void resetRebuildMode() {
        this._reset(DTOFIELD_REBUILDMODE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO rebuildmode(Integer rebuildMode) {
        this.setRebuildMode(rebuildMode);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO rebuildmode(PSModelEnums.SysRunRebuildMode rebuildMode) {
        if (rebuildMode == null) {
            this.setRebuildMode(null);
        } else {
            this.setRebuildMode(rebuildMode.value);
        }
        return this;
    }

    @JsonProperty(value="runmode")
    public void setRunMode(String runMode) {
        this._set(DTOFIELD_RUNMODE, runMode);
    }

    @JsonIgnore
    public String getRunMode() {
        Object objValue = this._get(DTOFIELD_RUNMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunModeDirty() {
        return this._contains(DTOFIELD_RUNMODE);
    }

    @JsonIgnore
    public void resetRunMode() {
        this._reset(DTOFIELD_RUNMODE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runmode(String runMode) {
        this.setRunMode(runMode);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO runmode(PSModelEnums.SysRunMode runMode) {
        if (runMode == null) {
            this.setRunMode(null);
        } else {
            this.setRunMode(runMode.value);
        }
        return this;
    }

    @JsonProperty(value="runparam")
    public void setRunParam(String runParam) {
        this._set(DTOFIELD_RUNPARAM, runParam);
    }

    @JsonIgnore
    public String getRunParam() {
        Object objValue = this._get(DTOFIELD_RUNPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParamDirty() {
        return this._contains(DTOFIELD_RUNPARAM);
    }

    @JsonIgnore
    public void resetRunParam() {
        this._reset(DTOFIELD_RUNPARAM);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam(String runParam) {
        this.setRunParam(runParam);
        return this;
    }

    @JsonProperty(value="runparam10")
    public void setRunParam10(String runParam10) {
        this._set(DTOFIELD_RUNPARAM10, runParam10);
    }

    @JsonIgnore
    public String getRunParam10() {
        Object objValue = this._get(DTOFIELD_RUNPARAM10);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam10Dirty() {
        return this._contains(DTOFIELD_RUNPARAM10);
    }

    @JsonIgnore
    public void resetRunParam10() {
        this._reset(DTOFIELD_RUNPARAM10);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam10(String runParam10) {
        this.setRunParam10(runParam10);
        return this;
    }

    @JsonProperty(value="runparam11")
    public void setRunParam11(String runParam11) {
        this._set(DTOFIELD_RUNPARAM11, runParam11);
    }

    @JsonIgnore
    public String getRunParam11() {
        Object objValue = this._get(DTOFIELD_RUNPARAM11);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam11Dirty() {
        return this._contains(DTOFIELD_RUNPARAM11);
    }

    @JsonIgnore
    public void resetRunParam11() {
        this._reset(DTOFIELD_RUNPARAM11);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam11(String runParam11) {
        this.setRunParam11(runParam11);
        return this;
    }

    @JsonProperty(value="runparam12")
    public void setRunParam12(String runParam12) {
        this._set(DTOFIELD_RUNPARAM12, runParam12);
    }

    @JsonIgnore
    public String getRunParam12() {
        Object objValue = this._get(DTOFIELD_RUNPARAM12);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam12Dirty() {
        return this._contains(DTOFIELD_RUNPARAM12);
    }

    @JsonIgnore
    public void resetRunParam12() {
        this._reset(DTOFIELD_RUNPARAM12);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam12(String runParam12) {
        this.setRunParam12(runParam12);
        return this;
    }

    @JsonProperty(value="runparam2")
    public void setRunParam2(String runParam2) {
        this._set(DTOFIELD_RUNPARAM2, runParam2);
    }

    @JsonIgnore
    public String getRunParam2() {
        Object objValue = this._get(DTOFIELD_RUNPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam2Dirty() {
        return this._contains(DTOFIELD_RUNPARAM2);
    }

    @JsonIgnore
    public void resetRunParam2() {
        this._reset(DTOFIELD_RUNPARAM2);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam2(String runParam2) {
        this.setRunParam2(runParam2);
        return this;
    }

    @JsonProperty(value="runparam3")
    public void setRunParam3(String runParam3) {
        this._set(DTOFIELD_RUNPARAM3, runParam3);
    }

    @JsonIgnore
    public String getRunParam3() {
        Object objValue = this._get(DTOFIELD_RUNPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam3Dirty() {
        return this._contains(DTOFIELD_RUNPARAM3);
    }

    @JsonIgnore
    public void resetRunParam3() {
        this._reset(DTOFIELD_RUNPARAM3);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam3(String runParam3) {
        this.setRunParam3(runParam3);
        return this;
    }

    @JsonProperty(value="runparam4")
    public void setRunParam4(String runParam4) {
        this._set(DTOFIELD_RUNPARAM4, runParam4);
    }

    @JsonIgnore
    public String getRunParam4() {
        Object objValue = this._get(DTOFIELD_RUNPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam4Dirty() {
        return this._contains(DTOFIELD_RUNPARAM4);
    }

    @JsonIgnore
    public void resetRunParam4() {
        this._reset(DTOFIELD_RUNPARAM4);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam4(String runParam4) {
        this.setRunParam4(runParam4);
        return this;
    }

    @JsonProperty(value="runparam5")
    public void setRunParam5(Integer runParam5) {
        this._set(DTOFIELD_RUNPARAM5, runParam5);
    }

    @JsonIgnore
    public Integer getRunParam5() {
        Object objValue = this._get(DTOFIELD_RUNPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRunParam5Dirty() {
        return this._contains(DTOFIELD_RUNPARAM5);
    }

    @JsonIgnore
    public void resetRunParam5() {
        this._reset(DTOFIELD_RUNPARAM5);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam5(Integer runParam5) {
        this.setRunParam5(runParam5);
        return this;
    }

    @JsonProperty(value="runparam6")
    public void setRunParam6(Integer runParam6) {
        this._set(DTOFIELD_RUNPARAM6, runParam6);
    }

    @JsonIgnore
    public Integer getRunParam6() {
        Object objValue = this._get(DTOFIELD_RUNPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRunParam6Dirty() {
        return this._contains(DTOFIELD_RUNPARAM6);
    }

    @JsonIgnore
    public void resetRunParam6() {
        this._reset(DTOFIELD_RUNPARAM6);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam6(Integer runParam6) {
        this.setRunParam6(runParam6);
        return this;
    }

    @JsonProperty(value="runparam7")
    public void setRunParam7(String runParam7) {
        this._set(DTOFIELD_RUNPARAM7, runParam7);
    }

    @JsonIgnore
    public String getRunParam7() {
        Object objValue = this._get(DTOFIELD_RUNPARAM7);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam7Dirty() {
        return this._contains(DTOFIELD_RUNPARAM7);
    }

    @JsonIgnore
    public void resetRunParam7() {
        this._reset(DTOFIELD_RUNPARAM7);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam7(String runParam7) {
        this.setRunParam7(runParam7);
        return this;
    }

    @JsonProperty(value="runparam8")
    public void setRunParam8(String runParam8) {
        this._set(DTOFIELD_RUNPARAM8, runParam8);
    }

    @JsonIgnore
    public String getRunParam8() {
        Object objValue = this._get(DTOFIELD_RUNPARAM8);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam8Dirty() {
        return this._contains(DTOFIELD_RUNPARAM8);
    }

    @JsonIgnore
    public void resetRunParam8() {
        this._reset(DTOFIELD_RUNPARAM8);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam8(String runParam8) {
        this.setRunParam8(runParam8);
        return this;
    }

    @JsonProperty(value="runparam9")
    public void setRunParam9(String runParam9) {
        this._set(DTOFIELD_RUNPARAM9, runParam9);
    }

    @JsonIgnore
    public String getRunParam9() {
        Object objValue = this._get(DTOFIELD_RUNPARAM9);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunParam9Dirty() {
        return this._contains(DTOFIELD_RUNPARAM9);
    }

    @JsonIgnore
    public void resetRunParam9() {
        this._reset(DTOFIELD_RUNPARAM9);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runparam9(String runParam9) {
        this.setRunParam9(runParam9);
        return this;
    }

    @JsonProperty(value="runpssysdynamodelid")
    public void setRunPSSysDynaModelId(String runPSSysDynaModelId) {
        this._set(DTOFIELD_RUNPSSYSDYNAMODELID, runPSSysDynaModelId);
    }

    @JsonIgnore
    public String getRunPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_RUNPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_RUNPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetRunPSSysDynaModelId() {
        this._reset(DTOFIELD_RUNPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelid(String runPSSysDynaModelId) {
        this.setRunPSSysDynaModelId(runPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setRunPSSysDynaModelId(null);
            this.setRunPSSysDynaModelName(null);
        } else {
            this.setRunPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRunPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="runpssysdynamodelname")
    public void setRunPSSysDynaModelName(String runPSSysDynaModelName) {
        this._set(DTOFIELD_RUNPSSYSDYNAMODELNAME, runPSSysDynaModelName);
    }

    @JsonIgnore
    public String getRunPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_RUNPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRunPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_RUNPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetRunPSSysDynaModelName() {
        this._reset(DTOFIELD_RUNPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runpssysdynamodelname(String runPSSysDynaModelName) {
        this.setRunPSSysDynaModelName(runPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="runstate")
    public void setRunState(Integer runState) {
        this._set(DTOFIELD_RUNSTATE, runState);
    }

    @JsonIgnore
    public Integer getRunState() {
        Object objValue = this._get(DTOFIELD_RUNSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRunStateDirty() {
        return this._contains(DTOFIELD_RUNSTATE);
    }

    @JsonIgnore
    public void resetRunState() {
        this._reset(DTOFIELD_RUNSTATE);
    }

    @JsonIgnore
    public PSSysRunSessionDTO runstate(Integer runState) {
        this.setRunState(runState);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO runstate(PSModelEnums.SysRunSessionState runState) {
        if (runState == null) {
            this.setRunState(null);
        } else {
            this.setRunState(runState.value);
        }
        return this;
    }

    @JsonProperty(value="srcpssysdmverid")
    public void setSrcPSSysDMVerId(String srcPSSysDMVerId) {
        this._set(DTOFIELD_SRCPSSYSDMVERID, srcPSSysDMVerId);
    }

    @JsonIgnore
    public String getSrcPSSysDMVerId() {
        Object objValue = this._get(DTOFIELD_SRCPSSYSDMVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSSysDMVerIdDirty() {
        return this._contains(DTOFIELD_SRCPSSYSDMVERID);
    }

    @JsonIgnore
    public void resetSrcPSSysDMVerId() {
        this._reset(DTOFIELD_SRCPSSYSDMVERID);
    }

    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmverid(String srcPSSysDMVerId) {
        this.setSrcPSSysDMVerId(srcPSSysDMVerId);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmverid(PSSysDMVerDTO pSSysDMVer) {
        if (pSSysDMVer == null) {
            this.setSrcPSSysDMVerId(null);
            this.setSrcPSSysDMVerName(null);
        } else {
            this.setSrcPSSysDMVerId(pSSysDMVer.getPSSysDMVerId());
            this.setSrcPSSysDMVerName(pSSysDMVer.getPSSysDMVerName());
        }
        return this;
    }

    @JsonProperty(value="srcpssysdmvername")
    public void setSrcPSSysDMVerName(String srcPSSysDMVerName) {
        this._set(DTOFIELD_SRCPSSYSDMVERNAME, srcPSSysDMVerName);
    }

    @JsonIgnore
    public String getSrcPSSysDMVerName() {
        Object objValue = this._get(DTOFIELD_SRCPSSYSDMVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSSysDMVerNameDirty() {
        return this._contains(DTOFIELD_SRCPSSYSDMVERNAME);
    }

    @JsonIgnore
    public void resetSrcPSSysDMVerName() {
        this._reset(DTOFIELD_SRCPSSYSDMVERNAME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO srcpssysdmvername(String srcPSSysDMVerName) {
        this.setSrcPSSysDMVerName(srcPSSysDMVerName);
        return this;
    }

    @JsonProperty(value="starttime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setStartTime(Timestamp startTime) {
        this._set(DTOFIELD_STARTTIME, startTime);
    }

    @JsonIgnore
    public Timestamp getStartTime() {
        Object objValue = this._get(DTOFIELD_STARTTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isStartTimeDirty() {
        return this._contains(DTOFIELD_STARTTIME);
    }

    @JsonIgnore
    public void resetStartTime() {
        this._reset(DTOFIELD_STARTTIME);
    }

    @JsonIgnore
    public PSSysRunSessionDTO starttime(Timestamp startTime) {
        this.setStartTime(startTime);
        return this;
    }

    @JsonProperty(value="stopwhentemplerror")
    public void setStopWhenTemplError(Integer stopWhenTemplError) {
        this._set(DTOFIELD_STOPWHENTEMPLERROR, stopWhenTemplError);
    }

    @JsonIgnore
    public Integer getStopWhenTemplError() {
        Object objValue = this._get(DTOFIELD_STOPWHENTEMPLERROR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStopWhenTemplErrorDirty() {
        return this._contains(DTOFIELD_STOPWHENTEMPLERROR);
    }

    @JsonIgnore
    public void resetStopWhenTemplError() {
        this._reset(DTOFIELD_STOPWHENTEMPLERROR);
    }

    @JsonIgnore
    public PSSysRunSessionDTO stopwhentemplerror(Integer stopWhenTemplError) {
        this.setStopWhenTemplError(stopWhenTemplError);
        return this;
    }

    @JsonIgnore
    public PSSysRunSessionDTO stopwhentemplerror(Boolean stopWhenTemplError) {
        if (stopWhenTemplError == null) {
            this.setStopWhenTemplError(null);
        } else {
            this.setStopWhenTemplError(stopWhenTemplError != false ? 1 : 0);
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
    public PSSysRunSessionDTO updatedate(Timestamp updateDate) {
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
    public PSSysRunSessionDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysRunSessionDTO usertag(String userTag) {
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
    public PSSysRunSessionDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysRunSessionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysRunSessionId(strValue);
    }

    @JsonIgnore
    public PSSysRunSessionDTO id(String strValue) {
        this.setPSSysRunSessionId(strValue);
        return this;
    }
}
