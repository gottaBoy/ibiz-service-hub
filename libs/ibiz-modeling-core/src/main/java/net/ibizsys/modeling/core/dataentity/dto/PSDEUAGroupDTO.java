package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEUAGroupDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFNAME = "PSWFNAME";
    protected static final String DTOFIELD_PSWFNAME = "pswfname";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_UAGROUPPARAM = "UAGROUPPARAM";
    protected static final String DTOFIELD_UAGROUPPARAM = "uagroupparam";
    public static final String FIELD_UAGTAG = "UAGTAG";
    protected static final String DTOFIELD_UAGTAG = "uagtag";
    public static final String FIELD_UAGTAG2 = "UAGTAG2";
    protected static final String DTOFIELD_UAGTAG2 = "uagtag2";
    public static final String FIELD_UAGTAG3 = "UAGTAG3";
    protected static final String DTOFIELD_UAGTAG3 = "uagtag3";
    public static final String FIELD_UAGTAG4 = "UAGTAG4";
    protected static final String DTOFIELD_UAGTAG4 = "uagtag4";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERREFFLAG = "USERREFFLAG";
    protected static final String DTOFIELD_USERREFFLAG = "userrefflag";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String DTOFIELD_PSDEUAGRPDETAILS = "psdeuagrpdetails";

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
    public PSDEUAGroupDTO codename(String codeName) {
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
    public PSDEUAGroupDTO createdate(Timestamp createDate) {
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
    public PSDEUAGroupDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEUAGroupDTO memo(String memo) {
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
    public PSDEUAGroupDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEUAGroupDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEUAGroupDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEUAGroupName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEUAGroupName(strName);
    }

    @JsonIgnore
    public PSDEUAGroupDTO name(String strName) {
        this.setPSDEUAGroupName(strName);
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
    public PSDEUAGroupDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSDEUAGroupDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSDEUAGroupDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
            this.setPSWFName(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
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
    public PSDEUAGroupDTO pswfname(String pSWFName) {
        this.setPSWFName(pSWFName);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setPSWFProcessId(null);
        } else {
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSDEUAGroupDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
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
    public PSDEUAGroupDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        } else {
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
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
    public PSDEUAGroupDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="uagroupparam")
    public void setUAGroupParam(String uAGroupParam) {
        this._set(DTOFIELD_UAGROUPPARAM, uAGroupParam);
    }

    @JsonIgnore
    public String getUAGroupParam() {
        Object objValue = this._get(DTOFIELD_UAGROUPPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGroupParamDirty() {
        return this._contains(DTOFIELD_UAGROUPPARAM);
    }

    @JsonIgnore
    public void resetUAGroupParam() {
        this._reset(DTOFIELD_UAGROUPPARAM);
    }

    @JsonIgnore
    public PSDEUAGroupDTO uagroupparam(String uAGroupParam) {
        this.setUAGroupParam(uAGroupParam);
        return this;
    }

    @JsonProperty(value="uagtag")
    public void setUAGTag(String uAGTag) {
        this._set(DTOFIELD_UAGTAG, uAGTag);
    }

    @JsonIgnore
    public String getUAGTag() {
        Object objValue = this._get(DTOFIELD_UAGTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGTagDirty() {
        return this._contains(DTOFIELD_UAGTAG);
    }

    @JsonIgnore
    public void resetUAGTag() {
        this._reset(DTOFIELD_UAGTAG);
    }

    @JsonIgnore
    public PSDEUAGroupDTO uagtag(String uAGTag) {
        this.setUAGTag(uAGTag);
        return this;
    }

    @JsonProperty(value="uagtag2")
    public void setUAGTag2(String uAGTag2) {
        this._set(DTOFIELD_UAGTAG2, uAGTag2);
    }

    @JsonIgnore
    public String getUAGTag2() {
        Object objValue = this._get(DTOFIELD_UAGTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGTag2Dirty() {
        return this._contains(DTOFIELD_UAGTAG2);
    }

    @JsonIgnore
    public void resetUAGTag2() {
        this._reset(DTOFIELD_UAGTAG2);
    }

    @JsonIgnore
    public PSDEUAGroupDTO uagtag2(String uAGTag2) {
        this.setUAGTag2(uAGTag2);
        return this;
    }

    @JsonProperty(value="uagtag3")
    public void setUAGTag3(String uAGTag3) {
        this._set(DTOFIELD_UAGTAG3, uAGTag3);
    }

    @JsonIgnore
    public String getUAGTag3() {
        Object objValue = this._get(DTOFIELD_UAGTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGTag3Dirty() {
        return this._contains(DTOFIELD_UAGTAG3);
    }

    @JsonIgnore
    public void resetUAGTag3() {
        this._reset(DTOFIELD_UAGTAG3);
    }

    @JsonIgnore
    public PSDEUAGroupDTO uagtag3(String uAGTag3) {
        this.setUAGTag3(uAGTag3);
        return this;
    }

    @JsonProperty(value="uagtag4")
    public void setUAGTag4(String uAGTag4) {
        this._set(DTOFIELD_UAGTAG4, uAGTag4);
    }

    @JsonIgnore
    public String getUAGTag4() {
        Object objValue = this._get(DTOFIELD_UAGTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAGTag4Dirty() {
        return this._contains(DTOFIELD_UAGTAG4);
    }

    @JsonIgnore
    public void resetUAGTag4() {
        this._reset(DTOFIELD_UAGTAG4);
    }

    @JsonIgnore
    public PSDEUAGroupDTO uagtag4(String uAGTag4) {
        this.setUAGTag4(uAGTag4);
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
    public PSDEUAGroupDTO updatedate(Timestamp updateDate) {
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
    public PSDEUAGroupDTO updateman(String updateMan) {
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
    public PSDEUAGroupDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userrefflag")
    public void setUserRefFlag(Integer userRefFlag) {
        this._set(DTOFIELD_USERREFFLAG, userRefFlag);
    }

    @JsonIgnore
    public Integer getUserRefFlag() {
        Object objValue = this._get(DTOFIELD_USERREFFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserRefFlagDirty() {
        return this._contains(DTOFIELD_USERREFFLAG);
    }

    @JsonIgnore
    public void resetUserRefFlag() {
        this._reset(DTOFIELD_USERREFFLAG);
    }

    @JsonIgnore
    public PSDEUAGroupDTO userrefflag(Integer userRefFlag) {
        this.setUserRefFlag(userRefFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUAGroupDTO userrefflag(Boolean userRefFlag) {
        if (userRefFlag == null) {
            this.setUserRefFlag(null);
        } else {
            this.setUserRefFlag(userRefFlag != false ? 1 : 0);
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
    public PSDEUAGroupDTO usertag(String userTag) {
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
    public PSDEUAGroupDTO usertag2(String userTag2) {
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
    public PSDEUAGroupDTO usertag3(String userTag3) {
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
    public PSDEUAGroupDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEUAGroupId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEUAGroupId(strValue);
    }

    @JsonIgnore
    public PSDEUAGroupDTO id(String strValue) {
        this.setPSDEUAGroupId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEUAGroupDetailDTO> getPSDEUAGrpDetails() {
        Object list = this._get(DTOFIELD_PSDEUAGRPDETAILS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeuagrpdetails")
    public void setPSDEUAGrpDetails(List<PSDEUAGroupDetailDTO> psdeuagrpdetails) {
        this._set(DTOFIELD_PSDEUAGRPDETAILS, psdeuagrpdetails);
    }

    @JsonIgnore
    public List<PSDEUAGroupDetailDTO> getPSDEUAGrpDetailsIf() {
        Object list = this._get(DTOFIELD_PSDEUAGRPDETAILS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEUAGRPDETAILS, list);
        }
        return (List) list;
    }
}
