package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnMSDeployDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEPLOYMDURL = "DEPLOYMDURL";
    protected static final String DTOFIELD_DEPLOYMDURL = "deploymdurl";
    public static final String FIELD_DEPLOYTAG = "DEPLOYTAG";
    protected static final String DTOFIELD_DEPLOYTAG = "deploytag";
    public static final String FIELD_DEPLOYTAG2 = "DEPLOYTAG2";
    protected static final String DTOFIELD_DEPLOYTAG2 = "deploytag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNAME = "PSDCMSPLATFORMNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNMSDEPLOYID = "PSDEVSLNMSDEPLOYID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";
    public static final String FIELD_PSDEVSLNMSDEPLOYNAME = "PSDEVSLNMSDEPLOYNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="deploymdurl")
    public void setDeployMDUrl(String deployMDUrl) {
        this._set(DTOFIELD_DEPLOYMDURL, deployMDUrl);
    }

    @JsonIgnore
    public String getDeployMDUrl() {
        Object objValue = this._get(DTOFIELD_DEPLOYMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployMDUrlDirty() {
        return this._contains(DTOFIELD_DEPLOYMDURL);
    }

    @JsonIgnore
    public void resetDeployMDUrl() {
        this._reset(DTOFIELD_DEPLOYMDURL);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO deploymdurl(String deployMDUrl) {
        this.setDeployMDUrl(deployMDUrl);
        return this;
    }

    @JsonProperty(value="deploytag")
    public void setDeployTag(String deployTag) {
        this._set(DTOFIELD_DEPLOYTAG, deployTag);
    }

    @JsonIgnore
    public String getDeployTag() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTagDirty() {
        return this._contains(DTOFIELD_DEPLOYTAG);
    }

    @JsonIgnore
    public void resetDeployTag() {
        this._reset(DTOFIELD_DEPLOYTAG);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO deploytag(String deployTag) {
        this.setDeployTag(deployTag);
        return this;
    }

    @JsonProperty(value="deploytag2")
    public void setDeployTag2(String deployTag2) {
        this._set(DTOFIELD_DEPLOYTAG2, deployTag2);
    }

    @JsonIgnore
    public String getDeployTag2() {
        Object objValue = this._get(DTOFIELD_DEPLOYTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeployTag2Dirty() {
        return this._contains(DTOFIELD_DEPLOYTAG2);
    }

    @JsonIgnore
    public void resetDeployTag2() {
        this._reset(DTOFIELD_DEPLOYTAG2);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO deploytag2(String deployTag2) {
        this.setDeployTag2(deployTag2);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcmsplatformid")
    public void setPSDCMSPlatformId(String pSDCMSPlatformId) {
        this._set(DTOFIELD_PSDCMSPLATFORMID, pSDCMSPlatformId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMID);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdcmsplatformid(PSDCMSPlatformDTO pSDCMSPlatform) {
        if (pSDCMSPlatform == null) {
            this.setPSDCMSPlatformId(null);
            this.setPSDCMSPlatformName(null);
        } else {
            this.setPSDCMSPlatformId(pSDCMSPlatform.getPSDCMSPlatformId());
            this.setPSDCMSPlatformName(pSDCMSPlatform.getPSDCMSPlatformName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformname")
    public void setPSDCMSPlatformName(String pSDCMSPlatformName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNAME, pSDCMSPlatformName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdcmsplatformname(String pSDCMSPlatformName) {
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployid")
    public void setPSDevSlnMSDeployId(String pSDevSlnMSDeployId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYID, pSDevSlnMSDeployId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYID);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdevslnmsdeployid(String pSDevSlnMSDeployId) {
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    @JsonProperty(value="psdevslnmsdeployname")
    public void setPSDevSlnMSDeployName(String pSDevSlnMSDeployName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPLOYNAME, pSDevSlnMSDeployName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDeployName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDeployNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDeployName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPLOYNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdevslnmsdeployname(String pSDevSlnMSDeployName) {
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
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
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
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
    public PSDevSlnMSDeployDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnMSDeployName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnMSDeployName(strName);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO name(String strName) {
        this.setPSDevSlnMSDeployName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnMSDeployId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnMSDeployId(strValue);
    }

    @JsonIgnore
    public PSDevSlnMSDeployDTO id(String strValue) {
        this.setPSDevSlnMSDeployId(strValue);
        return this;
    }

}
