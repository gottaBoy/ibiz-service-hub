package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWXLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EVENTTYPE = "EVENTTYPE";
    protected static final String DTOFIELD_EVENTTYPE = "eventtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSWXACCOUNTID = "PSWXACCOUNTID";
    protected static final String DTOFIELD_PSWXACCOUNTID = "pswxaccountid";
    public static final String FIELD_PSWXACCOUNTNAME = "PSWXACCOUNTNAME";
    protected static final String DTOFIELD_PSWXACCOUNTNAME = "pswxaccountname";
    public static final String FIELD_PSWXENTAPPID = "PSWXENTAPPID";
    protected static final String DTOFIELD_PSWXENTAPPID = "pswxentappid";
    public static final String FIELD_PSWXENTAPPNAME = "PSWXENTAPPNAME";
    protected static final String DTOFIELD_PSWXENTAPPNAME = "pswxentappname";
    public static final String FIELD_PSWXLOGICID = "PSWXLOGICID";
    protected static final String DTOFIELD_PSWXLOGICID = "pswxlogicid";
    public static final String FIELD_PSWXLOGICNAME = "PSWXLOGICNAME";
    protected static final String DTOFIELD_PSWXLOGICNAME = "pswxlogicname";
    public static final String FIELD_PSWXMENUFUNCID = "PSWXMENUFUNCID";
    protected static final String DTOFIELD_PSWXMENUFUNCID = "pswxmenufuncid";
    public static final String FIELD_PSWXMENUFUNCNAME = "PSWXMENUFUNCNAME";
    protected static final String DTOFIELD_PSWXMENUFUNCNAME = "pswxmenufuncname";
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
    public PSWXLogicDTO codename(String codeName) {
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
    public PSWXLogicDTO createdate(Timestamp createDate) {
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
    public PSWXLogicDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eventtype")
    public void setEventType(String eventType) {
        this._set(DTOFIELD_EVENTTYPE, eventType);
    }

    @JsonIgnore
    public String getEventType() {
        Object objValue = this._get(DTOFIELD_EVENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventTypeDirty() {
        return this._contains(DTOFIELD_EVENTTYPE);
    }

    @JsonIgnore
    public void resetEventType() {
        this._reset(DTOFIELD_EVENTTYPE);
    }

    @JsonIgnore
    public PSWXLogicDTO eventtype(String eventType) {
        this.setEventType(eventType);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO eventtype(PSModelEnums.WXLogicEventType eventType) {
        if (eventType == null) {
            this.setEventType(null);
        } else {
            this.setEventType(eventType.value);
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
    public PSWXLogicDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSWXLogicDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSWXLogicDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
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
    public PSWXLogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSWXLogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSWXLogicDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSWXLogicDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
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
    public PSWXLogicDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSWXLogicDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pswxaccountid")
    public void setPSWXAccountId(String pSWXAccountId) {
        this._set(DTOFIELD_PSWXACCOUNTID, pSWXAccountId);
    }

    @JsonIgnore
    public String getPSWXAccountId() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountIdDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public void resetPSWXAccountId() {
        this._reset(DTOFIELD_PSWXACCOUNTID);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxaccountid(String pSWXAccountId) {
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO pswxaccountid(PSWXAccountDTO pSWXAccount) {
        if (pSWXAccount == null) {
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        } else {
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    @JsonProperty(value="pswxaccountname")
    public void setPSWXAccountName(String pSWXAccountName) {
        this._set(DTOFIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }

    @JsonIgnore
    public String getPSWXAccountName() {
        Object objValue = this._get(DTOFIELD_PSWXACCOUNTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXAccountNameDirty() {
        return this._contains(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public void resetPSWXAccountName() {
        this._reset(DTOFIELD_PSWXACCOUNTNAME);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxaccountname(String pSWXAccountName) {
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    @JsonProperty(value="pswxentappid")
    public void setPSWXEntAppId(String pSWXEntAppId) {
        this._set(DTOFIELD_PSWXENTAPPID, pSWXEntAppId);
    }

    @JsonIgnore
    public String getPSWXEntAppId() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppIdDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public void resetPSWXEntAppId() {
        this._reset(DTOFIELD_PSWXENTAPPID);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxentappid(String pSWXEntAppId) {
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO pswxentappid(PSWXEntAppDTO pSWXEntApp) {
        if (pSWXEntApp == null) {
            this.setPSWXEntAppId(null);
            this.setPSWXEntAppName(null);
        } else {
            this.setPSWXEntAppId(pSWXEntApp.getPSWXEntAppId());
            this.setPSWXEntAppName(pSWXEntApp.getPSWXEntAppName());
        }
        return this;
    }

    @JsonProperty(value="pswxentappname")
    public void setPSWXEntAppName(String pSWXEntAppName) {
        this._set(DTOFIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }

    @JsonIgnore
    public String getPSWXEntAppName() {
        Object objValue = this._get(DTOFIELD_PSWXENTAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXEntAppNameDirty() {
        return this._contains(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public void resetPSWXEntAppName() {
        this._reset(DTOFIELD_PSWXENTAPPNAME);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxentappname(String pSWXEntAppName) {
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    @JsonProperty(value="pswxlogicid")
    public void setPSWXLogicId(String pSWXLogicId) {
        this._set(DTOFIELD_PSWXLOGICID, pSWXLogicId);
    }

    @JsonIgnore
    public String getPSWXLogicId() {
        Object objValue = this._get(DTOFIELD_PSWXLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXLogicIdDirty() {
        return this._contains(DTOFIELD_PSWXLOGICID);
    }

    @JsonIgnore
    public void resetPSWXLogicId() {
        this._reset(DTOFIELD_PSWXLOGICID);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxlogicid(String pSWXLogicId) {
        this.setPSWXLogicId(pSWXLogicId);
        return this;
    }

    @JsonProperty(value="pswxlogicname")
    public void setPSWXLogicName(String pSWXLogicName) {
        this._set(DTOFIELD_PSWXLOGICNAME, pSWXLogicName);
    }

    @JsonIgnore
    public String getPSWXLogicName() {
        Object objValue = this._get(DTOFIELD_PSWXLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXLogicNameDirty() {
        return this._contains(DTOFIELD_PSWXLOGICNAME);
    }

    @JsonIgnore
    public void resetPSWXLogicName() {
        this._reset(DTOFIELD_PSWXLOGICNAME);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxlogicname(String pSWXLogicName) {
        this.setPSWXLogicName(pSWXLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWXLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWXLogicName(strName);
    }

    @JsonIgnore
    public PSWXLogicDTO name(String strName) {
        this.setPSWXLogicName(strName);
        return this;
    }

    @JsonProperty(value="pswxmenufuncid")
    public void setPSWXMenuFuncId(String pSWXMenuFuncId) {
        this._set(DTOFIELD_PSWXMENUFUNCID, pSWXMenuFuncId);
    }

    @JsonIgnore
    public String getPSWXMenuFuncId() {
        Object objValue = this._get(DTOFIELD_PSWXMENUFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuFuncIdDirty() {
        return this._contains(DTOFIELD_PSWXMENUFUNCID);
    }

    @JsonIgnore
    public void resetPSWXMenuFuncId() {
        this._reset(DTOFIELD_PSWXMENUFUNCID);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxmenufuncid(String pSWXMenuFuncId) {
        this.setPSWXMenuFuncId(pSWXMenuFuncId);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO pswxmenufuncid(PSWXMenuFuncDTO pSWXMenuFunc) {
        if (pSWXMenuFunc == null) {
            this.setPSWXMenuFuncId(null);
            this.setPSWXMenuFuncName(null);
        } else {
            this.setPSWXMenuFuncId(pSWXMenuFunc.getPSWXMenuFuncId());
            this.setPSWXMenuFuncName(pSWXMenuFunc.getPSWXMenuFuncName());
        }
        return this;
    }

    @JsonProperty(value="pswxmenufuncname")
    public void setPSWXMenuFuncName(String pSWXMenuFuncName) {
        this._set(DTOFIELD_PSWXMENUFUNCNAME, pSWXMenuFuncName);
    }

    @JsonIgnore
    public String getPSWXMenuFuncName() {
        Object objValue = this._get(DTOFIELD_PSWXMENUFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuFuncNameDirty() {
        return this._contains(DTOFIELD_PSWXMENUFUNCNAME);
    }

    @JsonIgnore
    public void resetPSWXMenuFuncName() {
        this._reset(DTOFIELD_PSWXMENUFUNCNAME);
    }

    @JsonIgnore
    public PSWXLogicDTO pswxmenufuncname(String pSWXMenuFuncName) {
        this.setPSWXMenuFuncName(pSWXMenuFuncName);
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
    public PSWXLogicDTO updatedate(Timestamp updateDate) {
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
    public PSWXLogicDTO updateman(String updateMan) {
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
    public PSWXLogicDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWXLogicDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWXLogicDTO usertag(String userTag) {
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
    public PSWXLogicDTO usertag2(String userTag2) {
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
    public PSWXLogicDTO usertag3(String userTag3) {
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
    public PSWXLogicDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWXLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWXLogicId(strValue);
    }

    @JsonIgnore
    public PSWXLogicDTO id(String strValue) {
        this.setPSWXLogicId(strValue);
        return this;
    }
}
