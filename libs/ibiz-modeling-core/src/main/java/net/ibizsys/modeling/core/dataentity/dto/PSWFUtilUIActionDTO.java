package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFUtilUIActionDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSWFSETTINGID = "PSSYSWFSETTINGID";
    protected static final String DTOFIELD_PSSYSWFSETTINGID = "pssyswfsettingid";
    public static final String FIELD_PSSYSWFSETTINGNAME = "PSSYSWFSETTINGNAME";
    protected static final String DTOFIELD_PSSYSWFSETTINGNAME = "pssyswfsettingname";
    public static final String FIELD_PSWFUTILUIACTIONID = "PSWFUTILUIACTIONID";
    protected static final String DTOFIELD_PSWFUTILUIACTIONID = "pswfutiluiactionid";
    public static final String FIELD_PSWFUTILUIACTIONNAME = "PSWFUTILUIACTIONNAME";
    protected static final String DTOFIELD_PSWFUTILUIACTIONNAME = "pswfutiluiactionname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_PSWORKFLOWID = "PSWORKFLOWID";
    protected static final String DTOFIELD_PSWORKFLOWID = "psworkflowid";
    public static final String FIELD_PSWORKFLOWNAME = "PSWORKFLOWNAME";
    protected static final String DTOFIELD_PSWORKFLOWNAME = "psworkflowname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UTILTYPE = "UTILTYPE";
    protected static final String DTOFIELD_UTILTYPE = "utiltype";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSWFUtilUIActionDTO createdate(Timestamp createDate) {
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
    public PSWFUtilUIActionDTO createman(String createMan) {
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
    public PSWFUtilUIActionDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pssyswfsettingid")
    public void setPSSysWFSettingId(String pSSysWFSettingId) {
        this._set(DTOFIELD_PSSYSWFSETTINGID, pSSysWFSettingId);
    }

    @JsonIgnore
    public String getPSSysWFSettingId() {
        Object objValue = this._get(DTOFIELD_PSSYSWFSETTINGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFSettingIdDirty() {
        return this._contains(DTOFIELD_PSSYSWFSETTINGID);
    }

    @JsonIgnore
    public void resetPSSysWFSettingId() {
        this._reset(DTOFIELD_PSSYSWFSETTINGID);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pssyswfsettingid(String pSSysWFSettingId) {
        this.setPSSysWFSettingId(pSSysWFSettingId);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pssyswfsettingid(PSSysWFSettingDTO pSSysWFSetting) {
        if (pSSysWFSetting == null) {
            this.setPSSysWFSettingId(null);
            this.setPSSysWFSettingName(null);
        } else {
            this.setPSSysWFSettingId(pSSysWFSetting.getPSSysWFSettingId());
            this.setPSSysWFSettingName(pSSysWFSetting.getPSSysWFSettingName());
        }
        return this;
    }

    @JsonProperty(value="pssyswfsettingname")
    public void setPSSysWFSettingName(String pSSysWFSettingName) {
        this._set(DTOFIELD_PSSYSWFSETTINGNAME, pSSysWFSettingName);
    }

    @JsonIgnore
    public String getPSSysWFSettingName() {
        Object objValue = this._get(DTOFIELD_PSSYSWFSETTINGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFSettingNameDirty() {
        return this._contains(DTOFIELD_PSSYSWFSETTINGNAME);
    }

    @JsonIgnore
    public void resetPSSysWFSettingName() {
        this._reset(DTOFIELD_PSSYSWFSETTINGNAME);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pssyswfsettingname(String pSSysWFSettingName) {
        this.setPSSysWFSettingName(pSSysWFSettingName);
        return this;
    }

    @JsonProperty(value="pswfutiluiactionid")
    public void setPSWFUtilUIActionId(String pSWFUtilUIActionId) {
        this._set(DTOFIELD_PSWFUTILUIACTIONID, pSWFUtilUIActionId);
    }

    @JsonIgnore
    public String getPSWFUtilUIActionId() {
        Object objValue = this._get(DTOFIELD_PSWFUTILUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFUtilUIActionIdDirty() {
        return this._contains(DTOFIELD_PSWFUTILUIACTIONID);
    }

    @JsonIgnore
    public void resetPSWFUtilUIActionId() {
        this._reset(DTOFIELD_PSWFUTILUIACTIONID);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pswfutiluiactionid(String pSWFUtilUIActionId) {
        this.setPSWFUtilUIActionId(pSWFUtilUIActionId);
        return this;
    }

    @JsonProperty(value="pswfutiluiactionname")
    public void setPSWFUtilUIActionName(String pSWFUtilUIActionName) {
        this._set(DTOFIELD_PSWFUTILUIACTIONNAME, pSWFUtilUIActionName);
    }

    @JsonIgnore
    public String getPSWFUtilUIActionName() {
        Object objValue = this._get(DTOFIELD_PSWFUTILUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFUtilUIActionNameDirty() {
        return this._contains(DTOFIELD_PSWFUTILUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSWFUtilUIActionName() {
        this._reset(DTOFIELD_PSWFUTILUIACTIONNAME);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pswfutiluiactionname(String pSWFUtilUIActionName) {
        this.setPSWFUtilUIActionName(pSWFUtilUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFUtilUIActionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFUtilUIActionName(strName);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO name(String strName) {
        this.setPSWFUtilUIActionName(strName);
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
    public PSWFUtilUIActionDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
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
    public PSWFUtilUIActionDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="psworkflowid")
    public void setPSWorkflowId(String pSWorkflowId) {
        this._set(DTOFIELD_PSWORKFLOWID, pSWorkflowId);
    }

    @JsonIgnore
    public String getPSWorkflowId() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowIdDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public void resetPSWorkflowId() {
        this._reset(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psworkflowid(String pSWorkflowId) {
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psworkflowid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWorkflowId(null);
            this.setPSWorkflowName(null);
        } else {
            this.setPSWorkflowId(pSWorkflow.getPSWorkflowId());
            this.setPSWorkflowName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="psworkflowname")
    public void setPSWorkflowName(String pSWorkflowName) {
        this._set(DTOFIELD_PSWORKFLOWNAME, pSWorkflowName);
    }

    @JsonIgnore
    public String getPSWorkflowName() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowNameDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public void resetPSWorkflowName() {
        this._reset(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO psworkflowname(String pSWorkflowName) {
        this.setPSWorkflowName(pSWorkflowName);
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
    public PSWFUtilUIActionDTO updatedate(Timestamp updateDate) {
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
    public PSWFUtilUIActionDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="utiltype")
    public void setUtilType(String utilType) {
        this._set(DTOFIELD_UTILTYPE, utilType);
    }

    @JsonIgnore
    public String getUtilType() {
        Object objValue = this._get(DTOFIELD_UTILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTypeDirty() {
        return this._contains(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public void resetUtilType() {
        this._reset(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO utiltype(String utilType) {
        this.setUtilType(utilType);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO utiltype(PSModelEnums.WFUtilUIActionType utilType) {
        if (utilType == null) {
            this.setUtilType(null);
        } else {
            this.setUtilType(utilType.value);
        }
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
    public PSWFUtilUIActionDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFUtilUIActionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFUtilUIActionId(strValue);
    }

    @JsonIgnore
    public PSWFUtilUIActionDTO id(String strValue) {
        this.setPSWFUtilUIActionId(strValue);
        return this;
    }
}
