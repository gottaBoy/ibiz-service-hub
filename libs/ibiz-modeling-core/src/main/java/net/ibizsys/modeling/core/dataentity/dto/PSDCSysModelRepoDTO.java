package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCSysModelRepoDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_GITBRANCH = "GITBRANCH";
    protected static final String DTOFIELD_GITBRANCH = "gitbranch";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCSYSMODELREPOID = "PSDCSYSMODELREPOID";
    protected static final String DTOFIELD_PSDCSYSMODELREPOID = "psdcsysmodelrepoid";
    public static final String FIELD_PSDCSYSMODELREPONAME = "PSDCSYSMODELREPONAME";
    protected static final String DTOFIELD_PSDCSYSMODELREPONAME = "psdcsysmodelreponame";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_REPOTAG = "REPOTAG";
    protected static final String DTOFIELD_REPOTAG = "repotag";
    public static final String FIELD_REPOTAG2 = "REPOTAG2";
    protected static final String DTOFIELD_REPOTAG2 = "repotag2";
    public static final String FIELD_REPOTYPE = "REPOTYPE";
    protected static final String DTOFIELD_REPOTYPE = "repotype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
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
    public PSDCSysModelRepoDTO createdate(Timestamp createDate) {
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
    public PSDCSysModelRepoDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="gitbranch")
    public void setGitBranch(String gitBranch) {
        this._set(DTOFIELD_GITBRANCH, gitBranch);
    }

    @JsonIgnore
    public String getGitBranch() {
        Object objValue = this._get(DTOFIELD_GITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitBranchDirty() {
        return this._contains(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public void resetGitBranch() {
        this._reset(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO gitbranch(String gitBranch) {
        this.setGitBranch(gitBranch);
        return this;
    }

    @JsonProperty(value="gitpath")
    public void setGitPath(String gitPath) {
        this._set(DTOFIELD_GITPATH, gitPath);
    }

    @JsonIgnore
    public String getGitPath() {
        Object objValue = this._get(DTOFIELD_GITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitPathDirty() {
        return this._contains(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public void resetGitPath() {
        this._reset(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO gitpath(String gitPath) {
        this.setGitPath(gitPath);
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
    public PSDCSysModelRepoDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcsysmodelrepoid")
    public void setPSDCSysModelRepoId(String pSDCSysModelRepoId) {
        this._set(DTOFIELD_PSDCSYSMODELREPOID, pSDCSysModelRepoId);
    }

    @JsonIgnore
    public String getPSDCSysModelRepoId() {
        Object objValue = this._get(DTOFIELD_PSDCSYSMODELREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCSysModelRepoIdDirty() {
        return this._contains(DTOFIELD_PSDCSYSMODELREPOID);
    }

    @JsonIgnore
    public void resetPSDCSysModelRepoId() {
        this._reset(DTOFIELD_PSDCSYSMODELREPOID);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO psdcsysmodelrepoid(String pSDCSysModelRepoId) {
        this.setPSDCSysModelRepoId(pSDCSysModelRepoId);
        return this;
    }

    @JsonProperty(value="psdcsysmodelreponame")
    public void setPSDCSysModelRepoName(String pSDCSysModelRepoName) {
        this._set(DTOFIELD_PSDCSYSMODELREPONAME, pSDCSysModelRepoName);
    }

    @JsonIgnore
    public String getPSDCSysModelRepoName() {
        Object objValue = this._get(DTOFIELD_PSDCSYSMODELREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCSysModelRepoNameDirty() {
        return this._contains(DTOFIELD_PSDCSYSMODELREPONAME);
    }

    @JsonIgnore
    public void resetPSDCSysModelRepoName() {
        this._reset(DTOFIELD_PSDCSYSMODELREPONAME);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO psdcsysmodelreponame(String pSDCSysModelRepoName) {
        this.setPSDCSysModelRepoName(pSDCSysModelRepoName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
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
    public PSDCSysModelRepoDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
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
    public PSDCSysModelRepoDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="repotag")
    public void setRepoTag(String repoTag) {
        this._set(DTOFIELD_REPOTAG, repoTag);
    }

    @JsonIgnore
    public String getRepoTag() {
        Object objValue = this._get(DTOFIELD_REPOTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRepoTagDirty() {
        return this._contains(DTOFIELD_REPOTAG);
    }

    @JsonIgnore
    public void resetRepoTag() {
        this._reset(DTOFIELD_REPOTAG);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO repotag(String repoTag) {
        this.setRepoTag(repoTag);
        return this;
    }

    @JsonProperty(value="repotag2")
    public void setRepoTag2(String repoTag2) {
        this._set(DTOFIELD_REPOTAG2, repoTag2);
    }

    @JsonIgnore
    public String getRepoTag2() {
        Object objValue = this._get(DTOFIELD_REPOTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRepoTag2Dirty() {
        return this._contains(DTOFIELD_REPOTAG2);
    }

    @JsonIgnore
    public void resetRepoTag2() {
        this._reset(DTOFIELD_REPOTAG2);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO repotag2(String repoTag2) {
        this.setRepoTag2(repoTag2);
        return this;
    }

    @JsonProperty(value="repotype")
    public void setRepoType(String repoType) {
        this._set(DTOFIELD_REPOTYPE, repoType);
    }

    @JsonIgnore
    public String getRepoType() {
        Object objValue = this._get(DTOFIELD_REPOTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRepoTypeDirty() {
        return this._contains(DTOFIELD_REPOTYPE);
    }

    @JsonIgnore
    public void resetRepoType() {
        this._reset(DTOFIELD_REPOTYPE);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO repotype(String repoType) {
        this.setRepoType(repoType);
        return this;
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO repotype(PSModelEnums.SysModelRepoType repoType) {
        this.setRepoType(repoType == null ? null : repoType.value);
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
    public PSDCSysModelRepoDTO updatedate(Timestamp updateDate) {
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
    public PSDCSysModelRepoDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO usertag2(String userTag2) {
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
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO usertag3(String userTag3) {
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
        if (objValue == null) return null;
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
    public PSDCSysModelRepoDTO usertag4(String userTag4) {
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
    public PSDCSysModelRepoDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCSysModelRepoName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCSysModelRepoName(strName);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO name(String strName) {
        this.setPSDCSysModelRepoName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCSysModelRepoId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCSysModelRepoId(strValue);
    }

    @JsonIgnore
    public PSDCSysModelRepoDTO id(String strValue) {
        this.setPSDCSysModelRepoId(strValue);
        return this;
    }

}
