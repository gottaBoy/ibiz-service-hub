package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleResDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUserRoleDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_GLOBALFLAG = "GLOBALFLAG";
    protected static final String DTOFIELD_GLOBALFLAG = "globalflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PRIVID = "PRIVID";
    protected static final String DTOFIELD_PRIVID = "privid";
    public static final String FIELD_PRIVTYPE = "PRIVTYPE";
    protected static final String DTOFIELD_PRIVTYPE = "privtype";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSUSERROLEID = "PSSYSOPPRIVID";
    protected static final String DTOFIELD_PSSYSUSERROLEID = "pssysuserroleid";
    public static final String FIELD_PSSYSUSERROLENAME = "PSSYSOPPRIVNAME";
    protected static final String DTOFIELD_PSSYSUSERROLENAME = "pssysuserrolename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_ROLETAGPSDEFID = "ROLETAGPSDEFID";
    protected static final String DTOFIELD_ROLETAGPSDEFID = "roletagpsdefid";
    public static final String FIELD_ROLETAGPSDEFNAME = "ROLETAGPSDEFNAME";
    protected static final String DTOFIELD_ROLETAGPSDEFNAME = "roletagpsdefname";
    public static final String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
    protected static final String DTOFIELD_SYSTEMFLAG = "systemflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERIDPSDEFID = "USERIDPSDEFID";
    protected static final String DTOFIELD_USERIDPSDEFID = "useridpsdefid";
    public static final String FIELD_USERIDPSDEFNAME = "USERIDPSDEFNAME";
    protected static final String DTOFIELD_USERIDPSDEFNAME = "useridpsdefname";
    public static final String FIELD_USERROLESN = "USERROLESN";
    protected static final String DTOFIELD_USERROLESN = "userrolesn";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String DTOFIELD_PSSYSUSERROLERESES = "pssysuserroleres";
    public static final String DTOFIELD_PSSYSUSERROLEDATAS = "pssysuserroledata";

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
    public PSSysUserRoleDTO codename(String codeName) {
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
    public PSSysUserRoleDTO createdate(Timestamp createDate) {
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
    public PSSysUserRoleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(String defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public String getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
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
    public PSSysUserRoleDTO defaultmode(String defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO defaultmode(PSModelEnums.SysRoleDefaultUser defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode.value);
        }
        return this;
    }

    @JsonProperty(value="globalflag")
    public void setGlobalFlag(Integer globalFlag) {
        this._set(DTOFIELD_GLOBALFLAG, globalFlag);
    }

    @JsonIgnore
    public Integer getGlobalFlag() {
        Object objValue = this._get(DTOFIELD_GLOBALFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGlobalFlagDirty() {
        return this._contains(DTOFIELD_GLOBALFLAG);
    }

    @JsonIgnore
    public void resetGlobalFlag() {
        this._reset(DTOFIELD_GLOBALFLAG);
    }

    @JsonIgnore
    public PSSysUserRoleDTO globalflag(Integer globalFlag) {
        this.setGlobalFlag(globalFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO globalflag(Boolean globalFlag) {
        if (globalFlag == null) {
            this.setGlobalFlag(null);
        } else {
            this.setGlobalFlag(globalFlag != false ? 1 : 0);
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
    public PSSysUserRoleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="privid")
    public void setPrivId(String privId) {
        this._set(DTOFIELD_PRIVID, privId);
    }

    @JsonIgnore
    public String getPrivId() {
        Object objValue = this._get(DTOFIELD_PRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrivIdDirty() {
        return this._contains(DTOFIELD_PRIVID);
    }

    @JsonIgnore
    public void resetPrivId() {
        this._reset(DTOFIELD_PRIVID);
    }

    @JsonIgnore
    public PSSysUserRoleDTO privid(String privId) {
        this.setPrivId(privId);
        return this;
    }

    @JsonProperty(value="privtype")
    public void setPrivType(String privType) {
        this._set(DTOFIELD_PRIVTYPE, privType);
    }

    @JsonIgnore
    public String getPrivType() {
        Object objValue = this._get(DTOFIELD_PRIVTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrivTypeDirty() {
        return this._contains(DTOFIELD_PRIVTYPE);
    }

    @JsonIgnore
    public void resetPrivType() {
        this._reset(DTOFIELD_PRIVTYPE);
    }

    @JsonIgnore
    public PSSysUserRoleDTO privtype(String privType) {
        this.setPrivType(privType);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO privtype(PSModelEnums.SysUserRoleType privType) {
        if (privType == null) {
            this.setPrivType(null);
        } else {
            this.setPrivType(privType.value);
        }
        return this;
    }

    @JsonProperty(value="psdedatasetid")
    public void setPSDEDataSetId(String pSDEDataSetId) {
        this._set(DTOFIELD_PSDEDATASETID, pSDEDataSetId);
    }

    @JsonIgnore
    public String getPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public void resetPSDEDataSetId() {
        this._reset(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public PSSysUserRoleDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        } else {
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasetname")
    public void setPSDEDataSetName(String pSDEDataSetName) {
        this._set(DTOFIELD_PSDEDATASETNAME, pSDEDataSetName);
    }

    @JsonIgnore
    public String getPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSetName() {
        this._reset(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public PSSysUserRoleDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
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
    public PSSysUserRoleDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysUserRoleDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSSysUserRoleDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysUserRoleDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysUserRoleDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysUserRoleDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysuserroleid")
    public void setPSSysUserRoleId(String pSSysUserRoleId) {
        this._set(DTOFIELD_PSSYSUSERROLEID, pSSysUserRoleId);
        this._set(FIELD_PSSYSUSERROLEID, pSSysUserRoleId);
    }

    @JsonIgnore
    public String getPSSysUserRoleId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLEID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSERROLEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleIdDirty() {
        if (this._contains(DTOFIELD_PSSYSUSERROLEID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSERROLEID);
    }

    @JsonIgnore
    public void resetPSSysUserRoleId() {
        this._reset(DTOFIELD_PSSYSUSERROLEID);
        this._reset(FIELD_PSSYSUSERROLEID);
    }

    @JsonIgnore
    public PSSysUserRoleDTO pssysuserroleid(String pSSysUserRoleId) {
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivId() {
        return this.getPSSysUserRoleId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysOPPrivId(String pSSysOPPrivId) {
        this.setPSSysUserRoleId(pSSysOPPrivId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivIdDirty() {
        return this.isPSSysUserRoleIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivId() {
        this.resetPSSysUserRoleId();
    }

    @JsonProperty(value="pssysuserrolename")
    public void setPSSysUserRoleName(String pSSysUserRoleName) {
        this._set(DTOFIELD_PSSYSUSERROLENAME, pSSysUserRoleName);
        this._set(FIELD_PSSYSUSERROLENAME, pSSysUserRoleName);
    }

    @JsonIgnore
    public String getPSSysUserRoleName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSERROLENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleNameDirty() {
        if (this._contains(DTOFIELD_PSSYSUSERROLENAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSERROLENAME);
    }

    @JsonIgnore
    public void resetPSSysUserRoleName() {
        this._reset(DTOFIELD_PSSYSUSERROLENAME);
        this._reset(FIELD_PSSYSUSERROLENAME);
    }

    @JsonIgnore
    public PSSysUserRoleDTO pssysuserrolename(String pSSysUserRoleName) {
        this.setPSSysUserRoleName(pSSysUserRoleName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivName() {
        return this.getPSSysUserRoleName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysOPPrivName(String pSSysOPPrivName) {
        this.setPSSysUserRoleName(pSSysOPPrivName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivNameDirty() {
        return this.isPSSysUserRoleNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivName() {
        this.resetPSSysUserRoleName();
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUserRoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUserRoleName(strName);
    }

    @JsonIgnore
    public PSSysUserRoleDTO name(String strName) {
        this.setPSSysUserRoleName(strName);
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
    public PSSysUserRoleDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysUserRoleDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="roletagpsdefid")
    public void setRoleTagPSDEFId(String roleTagPSDEFId) {
        this._set(DTOFIELD_ROLETAGPSDEFID, roleTagPSDEFId);
    }

    @JsonIgnore
    public String getRoleTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_ROLETAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRoleTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_ROLETAGPSDEFID);
    }

    @JsonIgnore
    public void resetRoleTagPSDEFId() {
        this._reset(DTOFIELD_ROLETAGPSDEFID);
    }

    @JsonIgnore
    public PSSysUserRoleDTO roletagpsdefid(String roleTagPSDEFId) {
        this.setRoleTagPSDEFId(roleTagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO roletagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setRoleTagPSDEFId(null);
            this.setRoleTagPSDEFName(null);
        } else {
            this.setRoleTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setRoleTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="roletagpsdefname")
    public void setRoleTagPSDEFName(String roleTagPSDEFName) {
        this._set(DTOFIELD_ROLETAGPSDEFNAME, roleTagPSDEFName);
    }

    @JsonIgnore
    public String getRoleTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_ROLETAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRoleTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_ROLETAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetRoleTagPSDEFName() {
        this._reset(DTOFIELD_ROLETAGPSDEFNAME);
    }

    @JsonIgnore
    public PSSysUserRoleDTO roletagpsdefname(String roleTagPSDEFName) {
        this.setRoleTagPSDEFName(roleTagPSDEFName);
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
    public PSSysUserRoleDTO systemflag(Integer systemFlag) {
        this.setSystemFlag(systemFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO systemflag(Boolean systemFlag) {
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
    public PSSysUserRoleDTO updatedate(Timestamp updateDate) {
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
    public PSSysUserRoleDTO updateman(String updateMan) {
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
    public PSSysUserRoleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="useridpsdefid")
    public void setUserIdPSDEFId(String userIdPSDEFId) {
        this._set(DTOFIELD_USERIDPSDEFID, userIdPSDEFId);
    }

    @JsonIgnore
    public String getUserIdPSDEFId() {
        Object objValue = this._get(DTOFIELD_USERIDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserIdPSDEFIdDirty() {
        return this._contains(DTOFIELD_USERIDPSDEFID);
    }

    @JsonIgnore
    public void resetUserIdPSDEFId() {
        this._reset(DTOFIELD_USERIDPSDEFID);
    }

    @JsonIgnore
    public PSSysUserRoleDTO useridpsdefid(String userIdPSDEFId) {
        this.setUserIdPSDEFId(userIdPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDTO useridpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUserIdPSDEFId(null);
            this.setUserIdPSDEFName(null);
        } else {
            this.setUserIdPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserIdPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="useridpsdefname")
    public void setUserIdPSDEFName(String userIdPSDEFName) {
        this._set(DTOFIELD_USERIDPSDEFNAME, userIdPSDEFName);
    }

    @JsonIgnore
    public String getUserIdPSDEFName() {
        Object objValue = this._get(DTOFIELD_USERIDPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserIdPSDEFNameDirty() {
        return this._contains(DTOFIELD_USERIDPSDEFNAME);
    }

    @JsonIgnore
    public void resetUserIdPSDEFName() {
        this._reset(DTOFIELD_USERIDPSDEFNAME);
    }

    @JsonIgnore
    public PSSysUserRoleDTO useridpsdefname(String userIdPSDEFName) {
        this.setUserIdPSDEFName(userIdPSDEFName);
        return this;
    }

    @JsonProperty(value="userrolesn")
    public void setUserRoleSN(String userRoleSN) {
        this._set(DTOFIELD_USERROLESN, userRoleSN);
    }

    @JsonIgnore
    public String getUserRoleSN() {
        Object objValue = this._get(DTOFIELD_USERROLESN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserRoleSNDirty() {
        return this._contains(DTOFIELD_USERROLESN);
    }

    @JsonIgnore
    public void resetUserRoleSN() {
        this._reset(DTOFIELD_USERROLESN);
    }

    @JsonIgnore
    public PSSysUserRoleDTO userrolesn(String userRoleSN) {
        this.setUserRoleSN(userRoleSN);
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
    public PSSysUserRoleDTO usertag(String userTag) {
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
    public PSSysUserRoleDTO usertag2(String userTag2) {
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
    public PSSysUserRoleDTO usertag3(String userTag3) {
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
    public PSSysUserRoleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUserRoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUserRoleId(strValue);
    }

    @JsonIgnore
    public PSSysUserRoleDTO id(String strValue) {
        this.setPSSysUserRoleId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysUserRoleResDTO> getPSSysUserRoleReses() {
        Object list = this._get(DTOFIELD_PSSYSUSERROLERESES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysuserroleres")
    public void setPSSysUserRoleReses(List<PSSysUserRoleResDTO> pssysuserroleres) {
        this._set(DTOFIELD_PSSYSUSERROLERESES, pssysuserroleres);
    }

    @JsonIgnore
    public List<PSSysUserRoleResDTO> getPSSysUserRoleResesIf() {
        Object list = this._get(DTOFIELD_PSSYSUSERROLERESES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSUSERROLERESES, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysUserRoleDataDTO> getPSSysUserRoleDatas() {
        Object list = this._get(DTOFIELD_PSSYSUSERROLEDATAS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysuserroledata")
    public void setPSSysUserRoleDatas(List<PSSysUserRoleDataDTO> pssysuserroledata) {
        this._set(DTOFIELD_PSSYSUSERROLEDATAS, pssysuserroledata);
    }

    @JsonIgnore
    public List<PSSysUserRoleDataDTO> getPSSysUserRoleDatasIf() {
        Object list = this._get(DTOFIELD_PSSYSUSERROLEDATAS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSUSERROLEDATAS, list);
        }
        return (List)list;
    }
}
