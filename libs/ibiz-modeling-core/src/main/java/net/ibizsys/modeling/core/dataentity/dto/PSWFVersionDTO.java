package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFVersionDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIVITIMODEL = "ACTIVITIMODEL";
    protected static final String DTOFIELD_ACTIVITIMODEL = "activitimodel";
    public static final String FIELD_BPMNMODEL = "BPMNMODEL";
    protected static final String DTOFIELD_BPMNMODEL = "bpmnmodel";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DYNAWFVER = "DYNAWFVER";
    protected static final String DTOFIELD_DYNAWFVER = "dynawfver";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENABLELOG = "ENABLELOG";
    protected static final String DTOFIELD_ENABLELOG = "enablelog";
    public static final String FIELD_LASTBACKDATATAG = "LASTBACKDATATAG";
    protected static final String DTOFIELD_LASTBACKDATATAG = "lastbackdatatag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDYNAINSTNAME = "PSDYNAINSTNAME";
    protected static final String DTOFIELD_PSDYNAINSTNAME = "psdynainstname";
    public static final String FIELD_PSDYNAWFVERINSTID = "PSDYNAWFVERINSTID";
    protected static final String DTOFIELD_PSDYNAWFVERINSTID = "psdynawfverinstid";
    public static final String FIELD_PSDYNAWFVERINSTNAME = "PSDYNAWFVERINSTNAME";
    protected static final String DTOFIELD_PSDYNAWFVERINSTNAME = "psdynawfverinstname";
    public static final String FIELD_PSDYNAWFVERNAME = "PSDYNAWFVERNAME";
    protected static final String DTOFIELD_PSDYNAWFVERNAME = "psdynawfvername";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSWFMODEID = "PSSYSWFMODEID";
    protected static final String DTOFIELD_PSSYSWFMODEID = "pssyswfmodeid";
    public static final String FIELD_PSSYSWFMODENAME = "PSSYSWFMODENAME";
    protected static final String DTOFIELD_PSSYSWFMODENAME = "pssyswfmodename";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFNAME = "PSWFNAME";
    protected static final String DTOFIELD_PSWFNAME = "pswfname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_REMOVEFLAG = "REMOVEFLAG";
    protected static final String DTOFIELD_REMOVEFLAG = "removeflag";
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
    public static final String FIELD_VERTAG = "VERTAG";
    protected static final String DTOFIELD_VERTAG = "vertag";
    public static final String FIELD_VERTAG2 = "VERTAG2";
    protected static final String DTOFIELD_VERTAG2 = "vertag2";
    public static final String FIELD_WFENGINETYPE = "WFENGINETYPE";
    protected static final String DTOFIELD_WFENGINETYPE = "wfenginetype";
    public static final String FIELD_WFMODE = "WFMODE";
    protected static final String DTOFIELD_WFMODE = "wfmode";
    public static final String FIELD_WFSTEPPSCODELISTID = "WFSTEPPSCODELISTID";
    protected static final String DTOFIELD_WFSTEPPSCODELISTID = "wfsteppscodelistid";
    public static final String FIELD_WFSTEPPSCODELISTNAME = "WFSTEPPSCODELISTNAME";
    protected static final String DTOFIELD_WFSTEPPSCODELISTNAME = "wfsteppscodelistname";
    public static final String FIELD_WFVERMODE = "WFVERMODE";
    protected static final String DTOFIELD_WFVERMODE = "wfvermode";
    public static final String FIELD_WFVERSION = "WFVERSION";
    protected static final String DTOFIELD_WFVERSION = "wfversion";
    public static final String DTOFIELD_PSWFPROCESSES = "pswfprocesses";
    public static final String DTOFIELD_PSWFLINKS = "pswflinks";

    @JsonProperty(value="activitimodel")
    public void setActivitiModel(String activitiModel) {
        this._set(DTOFIELD_ACTIVITIMODEL, activitiModel);
    }

    @JsonIgnore
    public String getActivitiModel() {
        Object objValue = this._get(DTOFIELD_ACTIVITIMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActivitiModelDirty() {
        return this._contains(DTOFIELD_ACTIVITIMODEL);
    }

    @JsonIgnore
    public void resetActivitiModel() {
        this._reset(DTOFIELD_ACTIVITIMODEL);
    }

    @JsonIgnore
    public PSWFVersionDTO activitimodel(String activitiModel) {
        this.setActivitiModel(activitiModel);
        return this;
    }

    @JsonProperty(value="bpmnmodel")
    public void setBPMNModel(String bPMNModel) {
        this._set(DTOFIELD_BPMNMODEL, bPMNModel);
    }

    @JsonIgnore
    public String getBPMNModel() {
        Object objValue = this._get(DTOFIELD_BPMNMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBPMNModelDirty() {
        return this._contains(DTOFIELD_BPMNMODEL);
    }

    @JsonIgnore
    public void resetBPMNModel() {
        this._reset(DTOFIELD_BPMNMODEL);
    }

    @JsonIgnore
    public PSWFVersionDTO bpmnmodel(String bPMNModel) {
        this.setBPMNModel(bPMNModel);
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
    public PSWFVersionDTO createdate(Timestamp createDate) {
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
    public PSWFVersionDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dynawfver")
    public void setDynaWFVer(Integer dynaWFVer) {
        this._set(DTOFIELD_DYNAWFVER, dynaWFVer);
    }

    @JsonIgnore
    public Integer getDynaWFVer() {
        Object objValue = this._get(DTOFIELD_DYNAWFVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDynaWFVerDirty() {
        return this._contains(DTOFIELD_DYNAWFVER);
    }

    @JsonIgnore
    public void resetDynaWFVer() {
        this._reset(DTOFIELD_DYNAWFVER);
    }

    @JsonIgnore
    public PSWFVersionDTO dynawfver(Integer dynaWFVer) {
        this.setDynaWFVer(dynaWFVer);
        return this;
    }

    @JsonProperty(value="enabledynasys")
    public void setEnableDynaSys(Integer enableDynaSys) {
        this._set(DTOFIELD_ENABLEDYNASYS, enableDynaSys);
    }

    @JsonIgnore
    public Integer getEnableDynaSys() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNASYS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaSysDirty() {
        return this._contains(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public void resetEnableDynaSys() {
        this._reset(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public PSWFVersionDTO enabledynasys(Integer enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO enabledynasys(Boolean enableDynaSys) {
        if (enableDynaSys == null) {
            this.setEnableDynaSys(null);
        } else {
            this.setEnableDynaSys(enableDynaSys != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablelog")
    public void setEnableLog(Integer enableLog) {
        this._set(DTOFIELD_ENABLELOG, enableLog);
    }

    @JsonIgnore
    public Integer getEnableLog() {
        Object objValue = this._get(DTOFIELD_ENABLELOG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLogDirty() {
        return this._contains(DTOFIELD_ENABLELOG);
    }

    @JsonIgnore
    public void resetEnableLog() {
        this._reset(DTOFIELD_ENABLELOG);
    }

    @JsonIgnore
    public PSWFVersionDTO enablelog(Integer enableLog) {
        this.setEnableLog(enableLog);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO enablelog(Boolean enableLog) {
        if (enableLog == null) {
            this.setEnableLog(null);
        } else {
            this.setEnableLog(enableLog != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="lastbackdatatag")
    public void setLastBackDataTag(String lastBackDataTag) {
        this._set(DTOFIELD_LASTBACKDATATAG, lastBackDataTag);
    }

    @JsonIgnore
    public String getLastBackDataTag() {
        Object objValue = this._get(DTOFIELD_LASTBACKDATATAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLastBackDataTagDirty() {
        return this._contains(DTOFIELD_LASTBACKDATATAG);
    }

    @JsonIgnore
    public void resetLastBackDataTag() {
        this._reset(DTOFIELD_LASTBACKDATATAG);
    }

    @JsonIgnore
    public PSWFVersionDTO lastbackdatatag(String lastBackDataTag) {
        this.setLastBackDataTag(lastBackDataTag);
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
    public PSWFVersionDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdynainstname")
    public void setPSDynaInstName(String pSDynaInstName) {
        this._set(DTOFIELD_PSDYNAINSTNAME, pSDynaInstName);
    }

    @JsonIgnore
    public String getPSDynaInstName() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstNameDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPSDynaInstName() {
        this._reset(DTOFIELD_PSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO psdynainstname(String pSDynaInstName) {
        this.setPSDynaInstName(pSDynaInstName);
        return this;
    }

    @JsonProperty(value="psdynawfverinstid")
    public void setPSDynaWFVerInstId(String pSDynaWFVerInstId) {
        this._set(DTOFIELD_PSDYNAWFVERINSTID, pSDynaWFVerInstId);
    }

    @JsonIgnore
    public String getPSDynaWFVerInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAWFVERINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaWFVerInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAWFVERINSTID);
    }

    @JsonIgnore
    public void resetPSDynaWFVerInstId() {
        this._reset(DTOFIELD_PSDYNAWFVERINSTID);
    }

    @JsonIgnore
    public PSWFVersionDTO psdynawfverinstid(String pSDynaWFVerInstId) {
        this.setPSDynaWFVerInstId(pSDynaWFVerInstId);
        return this;
    }

    @JsonProperty(value="psdynawfverinstname")
    public void setPSDynaWFVerInstName(String pSDynaWFVerInstName) {
        this._set(DTOFIELD_PSDYNAWFVERINSTNAME, pSDynaWFVerInstName);
    }

    @JsonIgnore
    public String getPSDynaWFVerInstName() {
        Object objValue = this._get(DTOFIELD_PSDYNAWFVERINSTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaWFVerInstNameDirty() {
        return this._contains(DTOFIELD_PSDYNAWFVERINSTNAME);
    }

    @JsonIgnore
    public void resetPSDynaWFVerInstName() {
        this._reset(DTOFIELD_PSDYNAWFVERINSTNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO psdynawfverinstname(String pSDynaWFVerInstName) {
        this.setPSDynaWFVerInstName(pSDynaWFVerInstName);
        return this;
    }

    @JsonProperty(value="psdynawfvername")
    public void setPSDynaWFVerName(String pSDynaWFVerName) {
        this._set(DTOFIELD_PSDYNAWFVERNAME, pSDynaWFVerName);
    }

    @JsonIgnore
    public String getPSDynaWFVerName() {
        Object objValue = this._get(DTOFIELD_PSDYNAWFVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaWFVerNameDirty() {
        return this._contains(DTOFIELD_PSDYNAWFVERNAME);
    }

    @JsonIgnore
    public void resetPSDynaWFVerName() {
        this._reset(DTOFIELD_PSDYNAWFVERNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO psdynawfvername(String pSDynaWFVerName) {
        this.setPSDynaWFVerName(pSDynaWFVerName);
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
    public PSWFVersionDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSWFVersionDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssyswfmodeid")
    public void setPSSysWFModeId(String pSSysWFModeId) {
        this._set(DTOFIELD_PSSYSWFMODEID, pSSysWFModeId);
    }

    @JsonIgnore
    public String getPSSysWFModeId() {
        Object objValue = this._get(DTOFIELD_PSSYSWFMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFModeIdDirty() {
        return this._contains(DTOFIELD_PSSYSWFMODEID);
    }

    @JsonIgnore
    public void resetPSSysWFModeId() {
        this._reset(DTOFIELD_PSSYSWFMODEID);
    }

    @JsonIgnore
    public PSWFVersionDTO pssyswfmodeid(String pSSysWFModeId) {
        this.setPSSysWFModeId(pSSysWFModeId);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO pssyswfmodeid(PSSysWFModeDTO pSSysWFMode) {
        if (pSSysWFMode == null) {
            this.setPSSysWFModeId(null);
            this.setPSSysWFModeName(null);
            this.setWFMode(null);
        } else {
            this.setPSSysWFModeId(pSSysWFMode.getPSSysWFModeId());
            this.setPSSysWFModeName(pSSysWFMode.getPSSysWFModeName());
            this.setWFMode(pSSysWFMode.getWFMode());
        }
        return this;
    }

    @JsonProperty(value="pssyswfmodename")
    public void setPSSysWFModeName(String pSSysWFModeName) {
        this._set(DTOFIELD_PSSYSWFMODENAME, pSSysWFModeName);
    }

    @JsonIgnore
    public String getPSSysWFModeName() {
        Object objValue = this._get(DTOFIELD_PSSYSWFMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFModeNameDirty() {
        return this._contains(DTOFIELD_PSSYSWFMODENAME);
    }

    @JsonIgnore
    public void resetPSSysWFModeName() {
        this._reset(DTOFIELD_PSSYSWFMODENAME);
    }

    @JsonIgnore
    public PSWFVersionDTO pssyswfmodename(String pSSysWFModeName) {
        this.setPSSysWFModeName(pSSysWFModeName);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFId(String pSWFId) {
        this._set(DTOFIELD_PSWFID, pSWFId);
    }

    @JsonIgnore
    public String getPSWFId() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIdDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFId() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSWFVersionDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
            this.setPSWFName(null);
            this.setWFEngineType(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
            this.setWFEngineType(pSWorkflow.getWFEngineType());
        }
        return this;
    }

    @JsonProperty(value="pswfname")
    public void setPSWFName(String pSWFName) {
        this._set(DTOFIELD_PSWFNAME, pSWFName);
    }

    @JsonIgnore
    public String getPSWFName() {
        Object objValue = this._get(DTOFIELD_PSWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFNameDirty() {
        return this._contains(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public void resetPSWFName() {
        this._reset(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO pswfname(String pSWFName) {
        this.setPSWFName(pSWFName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFVersionDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonProperty(value="pswfversionname")
    public void setPSWFVersionName(String pSWFVersionName) {
        this._set(DTOFIELD_PSWFVERSIONNAME, pSWFVersionName);
    }

    @JsonIgnore
    public String getPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetPSWFVersionName() {
        this._reset(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFVersionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFVersionName(strName);
    }

    @JsonIgnore
    public PSWFVersionDTO name(String strName) {
        this.setPSWFVersionName(strName);
        return this;
    }

    @JsonProperty(value="removeflag")
    public void setRemoveFlag(Integer removeFlag) {
        this._set(DTOFIELD_REMOVEFLAG, removeFlag);
    }

    @JsonIgnore
    public Integer getRemoveFlag() {
        Object objValue = this._get(DTOFIELD_REMOVEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRemoveFlagDirty() {
        return this._contains(DTOFIELD_REMOVEFLAG);
    }

    @JsonIgnore
    public void resetRemoveFlag() {
        this._reset(DTOFIELD_REMOVEFLAG);
    }

    @JsonIgnore
    public PSWFVersionDTO removeflag(Integer removeFlag) {
        this.setRemoveFlag(removeFlag);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO removeflag(PSModelEnums.ModelRemoveMode removeFlag) {
        if (removeFlag == null) {
            this.setRemoveFlag(null);
        } else {
            this.setRemoveFlag(removeFlag.value);
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
    public PSWFVersionDTO updatedate(Timestamp updateDate) {
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
    public PSWFVersionDTO updateman(String updateMan) {
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
    public PSWFVersionDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWFVersionDTO usertag(String userTag) {
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
    public PSWFVersionDTO usertag2(String userTag2) {
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
    public PSWFVersionDTO usertag3(String userTag3) {
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
    public PSWFVersionDTO usertag4(String userTag4) {
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
    public PSWFVersionDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="vertag")
    public void setVerTag(String verTag) {
        this._set(DTOFIELD_VERTAG, verTag);
    }

    @JsonIgnore
    public String getVerTag() {
        Object objValue = this._get(DTOFIELD_VERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVerTagDirty() {
        return this._contains(DTOFIELD_VERTAG);
    }

    @JsonIgnore
    public void resetVerTag() {
        this._reset(DTOFIELD_VERTAG);
    }

    @JsonIgnore
    public PSWFVersionDTO vertag(String verTag) {
        this.setVerTag(verTag);
        return this;
    }

    @JsonProperty(value="vertag2")
    public void setVerTag2(String verTag2) {
        this._set(DTOFIELD_VERTAG2, verTag2);
    }

    @JsonIgnore
    public String getVerTag2() {
        Object objValue = this._get(DTOFIELD_VERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVerTag2Dirty() {
        return this._contains(DTOFIELD_VERTAG2);
    }

    @JsonIgnore
    public void resetVerTag2() {
        this._reset(DTOFIELD_VERTAG2);
    }

    @JsonIgnore
    public PSWFVersionDTO vertag2(String verTag2) {
        this.setVerTag2(verTag2);
        return this;
    }

    @JsonProperty(value="wfenginetype")
    public void setWFEngineType(String wFEngineType) {
        this._set(DTOFIELD_WFENGINETYPE, wFEngineType);
    }

    @JsonIgnore
    public String getWFEngineType() {
        Object objValue = this._get(DTOFIELD_WFENGINETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEngineTypeDirty() {
        return this._contains(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public void resetWFEngineType() {
        this._reset(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public PSWFVersionDTO wfenginetype(String wFEngineType) {
        this.setWFEngineType(wFEngineType);
        return this;
    }

    @JsonProperty(value="wfmode")
    public void setWFMode(String wFMode) {
        this._set(DTOFIELD_WFMODE, wFMode);
    }

    @JsonIgnore
    public String getWFMode() {
        Object objValue = this._get(DTOFIELD_WFMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFModeDirty() {
        return this._contains(DTOFIELD_WFMODE);
    }

    @JsonIgnore
    public void resetWFMode() {
        this._reset(DTOFIELD_WFMODE);
    }

    @JsonIgnore
    public PSWFVersionDTO wfmode(String wFMode) {
        this.setWFMode(wFMode);
        return this;
    }

    @JsonProperty(value="wfsteppscodelistid")
    public void setWFStepPSCodeListId(String wFStepPSCodeListId) {
        this._set(DTOFIELD_WFSTEPPSCODELISTID, wFStepPSCodeListId);
    }

    @JsonIgnore
    public String getWFStepPSCodeListId() {
        Object objValue = this._get(DTOFIELD_WFSTEPPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepPSCodeListIdDirty() {
        return this._contains(DTOFIELD_WFSTEPPSCODELISTID);
    }

    @JsonIgnore
    public void resetWFStepPSCodeListId() {
        this._reset(DTOFIELD_WFSTEPPSCODELISTID);
    }

    @JsonIgnore
    public PSWFVersionDTO wfsteppscodelistid(String wFStepPSCodeListId) {
        this.setWFStepPSCodeListId(wFStepPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO wfsteppscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setWFStepPSCodeListId(null);
            this.setWFStepPSCodeListName(null);
        } else {
            this.setWFStepPSCodeListId(pSCodeList.getPSCodeListId());
            this.setWFStepPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="wfsteppscodelistname")
    public void setWFStepPSCodeListName(String wFStepPSCodeListName) {
        this._set(DTOFIELD_WFSTEPPSCODELISTNAME, wFStepPSCodeListName);
    }

    @JsonIgnore
    public String getWFStepPSCodeListName() {
        Object objValue = this._get(DTOFIELD_WFSTEPPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFStepPSCodeListNameDirty() {
        return this._contains(DTOFIELD_WFSTEPPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetWFStepPSCodeListName() {
        this._reset(DTOFIELD_WFSTEPPSCODELISTNAME);
    }

    @JsonIgnore
    public PSWFVersionDTO wfsteppscodelistname(String wFStepPSCodeListName) {
        this.setWFStepPSCodeListName(wFStepPSCodeListName);
        return this;
    }

    @JsonProperty(value="wfvermode")
    public void setWFVerMode(String wFVerMode) {
        this._set(DTOFIELD_WFVERMODE, wFVerMode);
    }

    @JsonIgnore
    public String getWFVerMode() {
        Object objValue = this._get(DTOFIELD_WFVERMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFVerModeDirty() {
        return this._contains(DTOFIELD_WFVERMODE);
    }

    @JsonIgnore
    public void resetWFVerMode() {
        this._reset(DTOFIELD_WFVERMODE);
    }

    @JsonIgnore
    public PSWFVersionDTO wfvermode(String wFVerMode) {
        this.setWFVerMode(wFVerMode);
        return this;
    }

    @JsonIgnore
    public PSWFVersionDTO wfvermode(PSModelEnums.WFVerMode wFVerMode) {
        if (wFVerMode == null) {
            this.setWFVerMode(null);
        } else {
            this.setWFVerMode(wFVerMode.value);
        }
        return this;
    }

    @JsonProperty(value="wfversion")
    public void setWFVersion(Integer wFVersion) {
        this._set(DTOFIELD_WFVERSION, wFVersion);
    }

    @JsonIgnore
    public Integer getWFVersion() {
        Object objValue = this._get(DTOFIELD_WFVERSION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWFVersionDirty() {
        return this._contains(DTOFIELD_WFVERSION);
    }

    @JsonIgnore
    public void resetWFVersion() {
        this._reset(DTOFIELD_WFVERSION);
    }

    @JsonIgnore
    public PSWFVersionDTO wfversion(Integer wFVersion) {
        this.setWFVersion(wFVersion);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFVersionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFVersionId(strValue);
    }

    @JsonIgnore
    public PSWFVersionDTO id(String strValue) {
        this.setPSWFVersionId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWFProcessDTO> getPSWFProcesses() {
        Object list = this._get(DTOFIELD_PSWFPROCESSES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswfprocesses")
    public void setPSWFProcesses(List<PSWFProcessDTO> pswfprocesses) {
        this._set(DTOFIELD_PSWFPROCESSES, pswfprocesses);
    }

    @JsonIgnore
    public List<PSWFProcessDTO> getPSWFProcessesIf() {
        Object list = this._get(DTOFIELD_PSWFPROCESSES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFPROCESSES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSWFLinkDTO> getPSWFLinks() {
        Object list = this._get(DTOFIELD_PSWFLINKS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswflinks")
    public void setPSWFLinks(List<PSWFLinkDTO> pswflinks) {
        this._set(DTOFIELD_PSWFLINKS, pswflinks);
    }

    @JsonIgnore
    public List<PSWFLinkDTO> getPSWFLinksIf() {
        Object list = this._get(DTOFIELD_PSWFLINKS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFLINKS, list);
        }
        return (List) list;
    }
}