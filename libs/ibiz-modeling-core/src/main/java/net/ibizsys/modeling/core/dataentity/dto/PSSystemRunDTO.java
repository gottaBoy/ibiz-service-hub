package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDInstCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSystemRunDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
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
    public static final String FIELD_PSSYSTEMRUNID = "PSSYSTEMRUNID";
    protected static final String DTOFIELD_PSSYSTEMRUNID = "pssystemrunid";
    public static final String FIELD_PSSYSTEMRUNNAME = "PSSYSTEMRUNNAME";
    protected static final String DTOFIELD_PSSYSTEMRUNNAME = "pssystemrunname";
    public static final String FIELD_RUNPSSYSDYNAMODELID = "RUNPSSYSDYNAMODELID";
    protected static final String DTOFIELD_RUNPSSYSDYNAMODELID = "runpssysdynamodelid";
    public static final String FIELD_RUNPSSYSDYNAMODELNAME = "RUNPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_RUNPSSYSDYNAMODELNAME = "runpssysdynamodelname";
    public static final String FIELD_STOPWHENTEMPLERROR = "STOPWHENTEMPLERROR";
    protected static final String DTOFIELD_STOPWHENTEMPLERROR = "stopwhentemplerror";
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
    public PSSystemRunDTO createdate(Timestamp createDate) {
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
    public PSSystemRunDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSystemRunDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO defaultflag(Boolean defaultFlag) {
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
    public PSSystemRunDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSystemRunDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSSystemRunDTO pssysappid2(String pSSysAppId2) {
        this.setPSSysAppId2(pSSysAppId2);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO pssysappid2(PSSysAppDTO pSSysApp) {
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
    public PSSystemRunDTO pssysappname(String pSSysAppName) {
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
    public PSSystemRunDTO pssysappname2(String pSSysAppName2) {
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
    public PSSystemRunDTO pssysbdinstcfgid(String pSSysBDInstCfgId) {
        this.setPSSysBDInstCfgId(pSSysBDInstCfgId);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO pssysbdinstcfgid(PSSysBDInstCfgDTO pSSysBDInstCfg) {
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
    public PSSystemRunDTO pssysbdinstcfgname(String pSSysBDInstCfgName) {
        this.setPSSysBDInstCfgName(pSSysBDInstCfgName);
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
    public PSSystemRunDTO pssyssfpubid(String pSSysSFPubId) {
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub) {
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
    public PSSystemRunDTO pssyssfpubname(String pSSysSFPubName) {
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
    public PSSystemRunDTO pssystemasid(String pSSystemASId) {
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
    public PSSystemRunDTO pssystemasname(String pSSystemASName) {
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
    public PSSystemRunDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg) {
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
    public PSSystemRunDTO pssystemdbcfgname(String pSSystemDBCfgName) {
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    @JsonProperty(value="pssystemrunid")
    public void setPSSystemRunId(String pSSystemRunId) {
        this._set(DTOFIELD_PSSYSTEMRUNID, pSSystemRunId);
    }

    @JsonIgnore
    public String getPSSystemRunId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMRUNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemRunIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMRUNID);
    }

    @JsonIgnore
    public void resetPSSystemRunId() {
        this._reset(DTOFIELD_PSSYSTEMRUNID);
    }

    @JsonIgnore
    public PSSystemRunDTO pssystemrunid(String pSSystemRunId) {
        this.setPSSystemRunId(pSSystemRunId);
        return this;
    }

    @JsonProperty(value="pssystemrunname")
    public void setPSSystemRunName(String pSSystemRunName) {
        this._set(DTOFIELD_PSSYSTEMRUNNAME, pSSystemRunName);
    }

    @JsonIgnore
    public String getPSSystemRunName() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMRUNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemRunNameDirty() {
        return this._contains(DTOFIELD_PSSYSTEMRUNNAME);
    }

    @JsonIgnore
    public void resetPSSystemRunName() {
        this._reset(DTOFIELD_PSSYSTEMRUNNAME);
    }

    @JsonIgnore
    public PSSystemRunDTO pssystemrunname(String pSSystemRunName) {
        this.setPSSystemRunName(pSSystemRunName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSystemRunName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSystemRunName(strName);
    }

    @JsonIgnore
    public PSSystemRunDTO name(String strName) {
        this.setPSSystemRunName(strName);
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
    public PSSystemRunDTO runpssysdynamodelid(String runPSSysDynaModelId) {
        this.setRunPSSysDynaModelId(runPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO runpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSystemRunDTO runpssysdynamodelname(String runPSSysDynaModelName) {
        this.setRunPSSysDynaModelName(runPSSysDynaModelName);
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
    public PSSystemRunDTO stopwhentemplerror(Integer stopWhenTemplError) {
        this.setStopWhenTemplError(stopWhenTemplError);
        return this;
    }

    @JsonIgnore
    public PSSystemRunDTO stopwhentemplerror(Boolean stopWhenTemplError) {
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
    public PSSystemRunDTO updatedate(Timestamp updateDate) {
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
    public PSSystemRunDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSystemRunId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSystemRunId(strValue);
    }

    @JsonIgnore
    public PSSystemRunDTO id(String strValue) {
        this.setPSSystemRunId(strValue);
        return this;
    }
}
