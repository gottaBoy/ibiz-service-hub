package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevCenterSVNDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_GITBRANCH = "GITBRANCH";
    protected static final String DTOFIELD_GITBRANCH = "gitbranch";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_GITPRJ = "GITPRJ";
    protected static final String DTOFIELD_GITPRJ = "gitprj";
    public static final String FIELD_GITREPO = "GITREPO";
    protected static final String DTOFIELD_GITREPO = "gitrepo";
    public static final String FIELD_LOCKOBJID = "LOCKOBJID";
    protected static final String DTOFIELD_LOCKOBJID = "lockobjid";
    public static final String FIELD_LOCKOBJTYPE = "LOCKOBJTYPE";
    protected static final String DTOFIELD_LOCKOBJTYPE = "lockobjtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSDCCLUSTERID = "PSDCCLUSTERID";
    protected static final String DTOFIELD_PSDCCLUSTERID = "psdcclusterid";
    public static final String FIELD_PSDCCLUSTERNAME = "PSDCCLUSTERNAME";
    protected static final String DTOFIELD_PSDCCLUSTERNAME = "psdcclustername";
    public static final String FIELD_PSDCCONTAINERSPECID = "PSDCCONTAINERSPECID";
    protected static final String DTOFIELD_PSDCCONTAINERSPECID = "psdccontainerspecid";
    public static final String FIELD_PSDCCONTAINERSPECNAME = "PSDCCONTAINERSPECNAME";
    protected static final String DTOFIELD_PSDCCONTAINERSPECNAME = "psdccontainerspecname";
    public static final String FIELD_PSDCFILEID = "PSDCFILEID";
    protected static final String DTOFIELD_PSDCFILEID = "psdcfileid";
    public static final String FIELD_PSDCFILENAME = "PSDCFILENAME";
    protected static final String DTOFIELD_PSDCFILENAME = "psdcfilename";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSGITUSERID = "PSGITUSERID";
    protected static final String DTOFIELD_PSGITUSERID = "psgituserid";
    public static final String FIELD_PSGITUSERNAME = "PSGITUSERNAME";
    protected static final String DTOFIELD_PSGITUSERNAME = "psgitusername";
    public static final String FIELD_PSSVNINSTREPOID = "PSSVNINSTREPOID";
    protected static final String DTOFIELD_PSSVNINSTREPOID = "pssvninstrepoid";
    public static final String FIELD_PSSVNINSTREPONAME = "PSSVNINSTREPONAME";
    protected static final String DTOFIELD_PSSVNINSTREPONAME = "pssvninstreponame";
    public static final String FIELD_PSSVNSERVERID = "PSSVNSERVERID";
    protected static final String DTOFIELD_PSSVNSERVERID = "pssvnserverid";
    public static final String FIELD_REFFLAG = "REFFLAG";
    protected static final String DTOFIELD_REFFLAG = "refflag";
    public static final String FIELD_REFOBJID = "REFOBJID";
    protected static final String DTOFIELD_REFOBJID = "refobjid";
    public static final String FIELD_REFOBJNAME = "REFOBJNAME";
    protected static final String DTOFIELD_REFOBJNAME = "refobjname";
    public static final String FIELD_REFOBJTYPE = "REFOBJTYPE";
    protected static final String DTOFIELD_REFOBJTYPE = "refobjtype";
    public static final String FIELD_RESPOS = "RESPOS";
    protected static final String DTOFIELD_RESPOS = "respos";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_RESVER = "RESVER";
    protected static final String DTOFIELD_RESVER = "resver";
    public static final String FIELD_ROPSCREDENTIALID = "ROPSCREDENTIALID";
    protected static final String DTOFIELD_ROPSCREDENTIALID = "ropscredentialid";
    public static final String FIELD_ROPSCREDENTIALNAME = "ROPSCREDENTIALNAME";
    protected static final String DTOFIELD_ROPSCREDENTIALNAME = "ropscredentialname";
    public static final String FIELD_SVNTYPE = "SVNTYPE";
    protected static final String DTOFIELD_SVNTYPE = "svntype";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USAGE = "USAGE";
    protected static final String DTOFIELD_USAGE = "usage";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

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
    public PSDevCenterSVNDTO createdate(Timestamp createDate) {
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
    public PSDevCenterSVNDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
        if (objValue == null) return null;
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
    public PSDevCenterSVNDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
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
    public PSDevCenterSVNDTO gitbranch(String gitBranch) {
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
    public PSDevCenterSVNDTO gitpath(String gitPath) {
        this.setGitPath(gitPath);
        return this;
    }

    @JsonProperty(value="gitprj")
    public void setGitPrj(String gitPrj) {
        this._set(DTOFIELD_GITPRJ, gitPrj);
    }

    @JsonIgnore
    public String getGitPrj() {
        Object objValue = this._get(DTOFIELD_GITPRJ);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitPrjDirty() {
        return this._contains(DTOFIELD_GITPRJ);
    }

    @JsonIgnore
    public void resetGitPrj() {
        this._reset(DTOFIELD_GITPRJ);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO gitprj(String gitPrj) {
        this.setGitPrj(gitPrj);
        return this;
    }

    @JsonProperty(value="gitrepo")
    public void setGitRepo(String gitRepo) {
        this._set(DTOFIELD_GITREPO, gitRepo);
    }

    @JsonIgnore
    public String getGitRepo() {
        Object objValue = this._get(DTOFIELD_GITREPO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitRepoDirty() {
        return this._contains(DTOFIELD_GITREPO);
    }

    @JsonIgnore
    public void resetGitRepo() {
        this._reset(DTOFIELD_GITREPO);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO gitrepo(String gitRepo) {
        this.setGitRepo(gitRepo);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO gitrepo(PSModelEnums.GitRepoType gitRepo) {
        this.setGitRepo(gitRepo == null ? null : gitRepo.value);
        return this;
    }

    @JsonProperty(value="lockobjid")
    public void setLockObjId(String lockObjId) {
        this._set(DTOFIELD_LOCKOBJID, lockObjId);
    }

    @JsonIgnore
    public String getLockObjId() {
        Object objValue = this._get(DTOFIELD_LOCKOBJID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLockObjIdDirty() {
        return this._contains(DTOFIELD_LOCKOBJID);
    }

    @JsonIgnore
    public void resetLockObjId() {
        this._reset(DTOFIELD_LOCKOBJID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO lockobjid(String lockObjId) {
        this.setLockObjId(lockObjId);
        return this;
    }

    @JsonProperty(value="lockobjtype")
    public void setLockObjType(String lockObjType) {
        this._set(DTOFIELD_LOCKOBJTYPE, lockObjType);
    }

    @JsonIgnore
    public String getLockObjType() {
        Object objValue = this._get(DTOFIELD_LOCKOBJTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLockObjTypeDirty() {
        return this._contains(DTOFIELD_LOCKOBJTYPE);
    }

    @JsonIgnore
    public void resetLockObjType() {
        this._reset(DTOFIELD_LOCKOBJTYPE);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO lockobjtype(String lockObjType) {
        this.setLockObjType(lockObjType);
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
    public PSDevCenterSVNDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="param")
    public void setParam(String param) {
        this._set(DTOFIELD_PARAM, param);
    }

    @JsonIgnore
    public String getParam() {
        Object objValue = this._get(DTOFIELD_PARAM);
        if (objValue == null) return null;
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
    public PSDevCenterSVNDTO param(String param) {
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
        if (objValue == null) return null;
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
    public PSDevCenterSVNDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="pscredentialid")
    public void setPSCredentialId(String pSCredentialId) {
        this._set(DTOFIELD_PSCREDENTIALID, pSCredentialId);
    }

    @JsonIgnore
    public String getPSCredentialId() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialIdDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public void resetPSCredentialId() {
        this._reset(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pscredentialid(PSCredentialDTO pSCredential) {
        if (pSCredential == null) {
            this.setPSCredentialId(null);
            this.setPSCredentialName(null);
        } else {
            this.setPSCredentialId(pSCredential.getPSCredentialId());
            this.setPSCredentialName(pSCredential.getPSCredentialName());
        }
        return this;
    }

    @JsonProperty(value="pscredentialname")
    public void setPSCredentialName(String pSCredentialName) {
        this._set(DTOFIELD_PSCREDENTIALNAME, pSCredentialName);
    }

    @JsonIgnore
    public String getPSCredentialName() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialNameDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetPSCredentialName() {
        this._reset(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
        return this;
    }

    @JsonProperty(value="psdcclusterid")
    public void setPSDCClusterId(String pSDCClusterId) {
        this._set(DTOFIELD_PSDCCLUSTERID, pSDCClusterId);
    }

    @JsonIgnore
    public String getPSDCClusterId() {
        Object objValue = this._get(DTOFIELD_PSDCCLUSTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCClusterIdDirty() {
        return this._contains(DTOFIELD_PSDCCLUSTERID);
    }

    @JsonIgnore
    public void resetPSDCClusterId() {
        this._reset(DTOFIELD_PSDCCLUSTERID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcclusterid(PSDCClusterDTO pSDCCluster) {
        if (pSDCCluster == null) {
            this.setPSDCClusterId(null);
            this.setPSDCClusterName(null);
        } else {
            this.setPSDCClusterId(pSDCCluster.getPSDCClusterId());
            this.setPSDCClusterName(pSDCCluster.getPSDCClusterName());
        }
        return this;
    }

    @JsonProperty(value="psdcclustername")
    public void setPSDCClusterName(String pSDCClusterName) {
        this._set(DTOFIELD_PSDCCLUSTERNAME, pSDCClusterName);
    }

    @JsonIgnore
    public String getPSDCClusterName() {
        Object objValue = this._get(DTOFIELD_PSDCCLUSTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCClusterNameDirty() {
        return this._contains(DTOFIELD_PSDCCLUSTERNAME);
    }

    @JsonIgnore
    public void resetPSDCClusterName() {
        this._reset(DTOFIELD_PSDCCLUSTERNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcclustername(String pSDCClusterName) {
        this.setPSDCClusterName(pSDCClusterName);
        return this;
    }

    @JsonProperty(value="psdccontainerspecid")
    public void setPSDCContainerSpecId(String pSDCContainerSpecId) {
        this._set(DTOFIELD_PSDCCONTAINERSPECID, pSDCContainerSpecId);
    }

    @JsonIgnore
    public String getPSDCContainerSpecId() {
        Object objValue = this._get(DTOFIELD_PSDCCONTAINERSPECID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCContainerSpecIdDirty() {
        return this._contains(DTOFIELD_PSDCCONTAINERSPECID);
    }

    @JsonIgnore
    public void resetPSDCContainerSpecId() {
        this._reset(DTOFIELD_PSDCCONTAINERSPECID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdccontainerspecid(String pSDCContainerSpecId) {
        this.setPSDCContainerSpecId(pSDCContainerSpecId);
        return this;
    }

    @JsonProperty(value="psdccontainerspecname")
    public void setPSDCContainerSpecName(String pSDCContainerSpecName) {
        this._set(DTOFIELD_PSDCCONTAINERSPECNAME, pSDCContainerSpecName);
    }

    @JsonIgnore
    public String getPSDCContainerSpecName() {
        Object objValue = this._get(DTOFIELD_PSDCCONTAINERSPECNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCContainerSpecNameDirty() {
        return this._contains(DTOFIELD_PSDCCONTAINERSPECNAME);
    }

    @JsonIgnore
    public void resetPSDCContainerSpecName() {
        this._reset(DTOFIELD_PSDCCONTAINERSPECNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdccontainerspecname(String pSDCContainerSpecName) {
        this.setPSDCContainerSpecName(pSDCContainerSpecName);
        return this;
    }

    @JsonProperty(value="psdcfileid")
    public void setPSDCFileId(String pSDCFileId) {
        this._set(DTOFIELD_PSDCFILEID, pSDCFileId);
    }

    @JsonIgnore
    public String getPSDCFileId() {
        Object objValue = this._get(DTOFIELD_PSDCFILEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileIdDirty() {
        return this._contains(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public void resetPSDCFileId() {
        this._reset(DTOFIELD_PSDCFILEID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcfileid(PSDCFileDTO pSDCFile) {
        if (pSDCFile == null) {
            this.setPSDCFileId(null);
            this.setPSDCFileName(null);
        } else {
            this.setPSDCFileId(pSDCFile.getPSDCFileId());
            this.setPSDCFileName(pSDCFile.getPSDCFileName());
        }
        return this;
    }

    @JsonProperty(value="psdcfilename")
    public void setPSDCFileName(String pSDCFileName) {
        this._set(DTOFIELD_PSDCFILENAME, pSDCFileName);
    }

    @JsonIgnore
    public String getPSDCFileName() {
        Object objValue = this._get(DTOFIELD_PSDCFILENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCFileNameDirty() {
        return this._contains(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public void resetPSDCFileName() {
        this._reset(DTOFIELD_PSDCFILENAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
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
    public PSDevCenterSVNDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDevCenterSVNDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevcentersvnid")
    public void setPSDevCenterSVNId(String pSDevCenterSVNId) {
        this._set(DTOFIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }

    @JsonIgnore
    public String getPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNId() {
        this._reset(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonProperty(value="psdevcentersvnname")
    public void setPSDevCenterSVNName(String pSDevCenterSVNName) {
        this._set(DTOFIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }

    @JsonIgnore
    public String getPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNName() {
        this._reset(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdevcentersvnname(String pSDevCenterSVNName) {
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
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
    public PSDevCenterSVNDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDevCenterSVNDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psgituserid")
    public void setPSGitUserId(String pSGitUserId) {
        this._set(DTOFIELD_PSGITUSERID, pSGitUserId);
    }

    @JsonIgnore
    public String getPSGitUserId() {
        Object objValue = this._get(DTOFIELD_PSGITUSERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSGitUserIdDirty() {
        return this._contains(DTOFIELD_PSGITUSERID);
    }

    @JsonIgnore
    public void resetPSGitUserId() {
        this._reset(DTOFIELD_PSGITUSERID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psgituserid(String pSGitUserId) {
        this.setPSGitUserId(pSGitUserId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psgituserid(PSGitUserDTO pSGitUser) {
        if (pSGitUser == null) {
            this.setPSGitUserId(null);
            this.setPSGitUserName(null);
        } else {
            this.setPSGitUserId(pSGitUser.getPSGitUserId());
            this.setPSGitUserName(pSGitUser.getPSGitUserName());
        }
        return this;
    }

    @JsonProperty(value="psgitusername")
    public void setPSGitUserName(String pSGitUserName) {
        this._set(DTOFIELD_PSGITUSERNAME, pSGitUserName);
    }

    @JsonIgnore
    public String getPSGitUserName() {
        Object objValue = this._get(DTOFIELD_PSGITUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSGitUserNameDirty() {
        return this._contains(DTOFIELD_PSGITUSERNAME);
    }

    @JsonIgnore
    public void resetPSGitUserName() {
        this._reset(DTOFIELD_PSGITUSERNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO psgitusername(String pSGitUserName) {
        this.setPSGitUserName(pSGitUserName);
        return this;
    }

    @JsonProperty(value="pssvninstrepoid")
    public void setPSSVNInstRepoId(String pSSVNInstRepoId) {
        this._set(DTOFIELD_PSSVNINSTREPOID, pSSVNInstRepoId);
    }

    @JsonIgnore
    public String getPSSVNInstRepoId() {
        Object objValue = this._get(DTOFIELD_PSSVNINSTREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSVNInstRepoIdDirty() {
        return this._contains(DTOFIELD_PSSVNINSTREPOID);
    }

    @JsonIgnore
    public void resetPSSVNInstRepoId() {
        this._reset(DTOFIELD_PSSVNINSTREPOID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pssvninstrepoid(String pSSVNInstRepoId) {
        this.setPSSVNInstRepoId(pSSVNInstRepoId);
        return this;
    }

    @JsonProperty(value="pssvninstreponame")
    public void setPSSVNInstRepoName(String pSSVNInstRepoName) {
        this._set(DTOFIELD_PSSVNINSTREPONAME, pSSVNInstRepoName);
    }

    @JsonIgnore
    public String getPSSVNInstRepoName() {
        Object objValue = this._get(DTOFIELD_PSSVNINSTREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSVNInstRepoNameDirty() {
        return this._contains(DTOFIELD_PSSVNINSTREPONAME);
    }

    @JsonIgnore
    public void resetPSSVNInstRepoName() {
        this._reset(DTOFIELD_PSSVNINSTREPONAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pssvninstreponame(String pSSVNInstRepoName) {
        this.setPSSVNInstRepoName(pSSVNInstRepoName);
        return this;
    }

    @JsonProperty(value="pssvnserverid")
    public void setPSSVNServerId(String pSSVNServerId) {
        this._set(DTOFIELD_PSSVNSERVERID, pSSVNServerId);
    }

    @JsonIgnore
    public String getPSSVNServerId() {
        Object objValue = this._get(DTOFIELD_PSSVNSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSVNServerIdDirty() {
        return this._contains(DTOFIELD_PSSVNSERVERID);
    }

    @JsonIgnore
    public void resetPSSVNServerId() {
        this._reset(DTOFIELD_PSSVNSERVERID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO pssvnserverid(String pSSVNServerId) {
        this.setPSSVNServerId(pSSVNServerId);
        return this;
    }

    @JsonProperty(value="refflag")
    public void setRefFlag(Integer refFlag) {
        this._set(DTOFIELD_REFFLAG, refFlag);
    }

    @JsonIgnore
    public Integer getRefFlag() {
        Object objValue = this._get(DTOFIELD_REFFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefFlagDirty() {
        return this._contains(DTOFIELD_REFFLAG);
    }

    @JsonIgnore
    public void resetRefFlag() {
        this._reset(DTOFIELD_REFFLAG);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO refflag(Integer refFlag) {
        this.setRefFlag(refFlag);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO refflag(Boolean refFlag) {
        this.setRefFlag(refFlag == null ? null : (refFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="refobjid")
    public void setRefObjId(String refObjId) {
        this._set(DTOFIELD_REFOBJID, refObjId);
    }

    @JsonIgnore
    public String getRefObjId() {
        Object objValue = this._get(DTOFIELD_REFOBJID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjIdDirty() {
        return this._contains(DTOFIELD_REFOBJID);
    }

    @JsonIgnore
    public void resetRefObjId() {
        this._reset(DTOFIELD_REFOBJID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO refobjid(String refObjId) {
        this.setRefObjId(refObjId);
        return this;
    }

    @JsonProperty(value="refobjname")
    public void setRefObjName(String refObjName) {
        this._set(DTOFIELD_REFOBJNAME, refObjName);
    }

    @JsonIgnore
    public String getRefObjName() {
        Object objValue = this._get(DTOFIELD_REFOBJNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjNameDirty() {
        return this._contains(DTOFIELD_REFOBJNAME);
    }

    @JsonIgnore
    public void resetRefObjName() {
        this._reset(DTOFIELD_REFOBJNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO refobjname(String refObjName) {
        this.setRefObjName(refObjName);
        return this;
    }

    @JsonProperty(value="refobjtype")
    public void setRefObjType(String refObjType) {
        this._set(DTOFIELD_REFOBJTYPE, refObjType);
    }

    @JsonIgnore
    public String getRefObjType() {
        Object objValue = this._get(DTOFIELD_REFOBJTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjTypeDirty() {
        return this._contains(DTOFIELD_REFOBJTYPE);
    }

    @JsonIgnore
    public void resetRefObjType() {
        this._reset(DTOFIELD_REFOBJTYPE);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO refobjtype(String refObjType) {
        this.setRefObjType(refObjType);
        return this;
    }

    @JsonProperty(value="respos")
    public void setResPos(Integer resPos) {
        this._set(DTOFIELD_RESPOS, resPos);
    }

    @JsonIgnore
    public Integer getResPos() {
        Object objValue = this._get(DTOFIELD_RESPOS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResPosDirty() {
        return this._contains(DTOFIELD_RESPOS);
    }

    @JsonIgnore
    public void resetResPos() {
        this._reset(DTOFIELD_RESPOS);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO respos(PSModelEnums.DCResPos resPos) {
        this.setResPos(resPos == null ? null : resPos.value);
        return this;
    }

    @JsonProperty(value="resstate")
    public void setResState(Integer resState) {
        this._set(DTOFIELD_RESSTATE, resState);
    }

    @JsonIgnore
    public Integer getResState() {
        Object objValue = this._get(DTOFIELD_RESSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResStateDirty() {
        return this._contains(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public void resetResState() {
        this._reset(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
        return this;
    }

    @JsonProperty(value="resver")
    public void setResVer(Integer resVer) {
        this._set(DTOFIELD_RESVER, resVer);
    }

    @JsonIgnore
    public Integer getResVer() {
        Object objValue = this._get(DTOFIELD_RESVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResVerDirty() {
        return this._contains(DTOFIELD_RESVER);
    }

    @JsonIgnore
    public void resetResVer() {
        this._reset(DTOFIELD_RESVER);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO resver(Integer resVer) {
        this.setResVer(resVer);
        return this;
    }

    @JsonProperty(value="ropscredentialid")
    public void setROPSCredentialId(String rOPSCredentialId) {
        this._set(DTOFIELD_ROPSCREDENTIALID, rOPSCredentialId);
    }

    @JsonIgnore
    public String getROPSCredentialId() {
        Object objValue = this._get(DTOFIELD_ROPSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROPSCredentialIdDirty() {
        return this._contains(DTOFIELD_ROPSCREDENTIALID);
    }

    @JsonIgnore
    public void resetROPSCredentialId() {
        this._reset(DTOFIELD_ROPSCREDENTIALID);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO ropscredentialid(String rOPSCredentialId) {
        this.setROPSCredentialId(rOPSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO ropscredentialid(PSCredentialDTO pSCredential) {
        if (pSCredential == null) {
            this.setROPSCredentialId(null);
            this.setROPSCredentialName(null);
        } else {
            this.setROPSCredentialId(pSCredential.getPSCredentialId());
            this.setROPSCredentialName(pSCredential.getPSCredentialName());
        }
        return this;
    }

    @JsonProperty(value="ropscredentialname")
    public void setROPSCredentialName(String rOPSCredentialName) {
        this._set(DTOFIELD_ROPSCREDENTIALNAME, rOPSCredentialName);
    }

    @JsonIgnore
    public String getROPSCredentialName() {
        Object objValue = this._get(DTOFIELD_ROPSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROPSCredentialNameDirty() {
        return this._contains(DTOFIELD_ROPSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetROPSCredentialName() {
        this._reset(DTOFIELD_ROPSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO ropscredentialname(String rOPSCredentialName) {
        this.setROPSCredentialName(rOPSCredentialName);
        return this;
    }

    @JsonProperty(value="svntype")
    public void setSVNType(String sVNType) {
        this._set(DTOFIELD_SVNTYPE, sVNType);
    }

    @JsonIgnore
    public String getSVNType() {
        Object objValue = this._get(DTOFIELD_SVNTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSVNTypeDirty() {
        return this._contains(DTOFIELD_SVNTYPE);
    }

    @JsonIgnore
    public void resetSVNType() {
        this._reset(DTOFIELD_SVNTYPE);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO svntype(String sVNType) {
        this.setSVNType(sVNType);
        return this;
    }

    @JsonIgnore
    public PSDevCenterSVNDTO svntype(PSModelEnums.DCSVNType sVNType) {
        this.setSVNType(sVNType == null ? null : sVNType.value);
        return this;
    }

    @JsonProperty(value="tags")
    public void setTags(String tags) {
        this._set(DTOFIELD_TAGS, tags);
    }

    @JsonIgnore
    public String getTags() {
        Object objValue = this._get(DTOFIELD_TAGS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagsDirty() {
        return this._contains(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public void resetTags() {
        this._reset(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO tags(String tags) {
        this.setTags(tags);
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
    public PSDevCenterSVNDTO updatedate(Timestamp updateDate) {
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
    public PSDevCenterSVNDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usage")
    public void setUsage(String usage) {
        this._set(DTOFIELD_USAGE, usage);
    }

    @JsonIgnore
    public String getUsage() {
        Object objValue = this._get(DTOFIELD_USAGE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUsageDirty() {
        return this._contains(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public void resetUsage() {
        this._reset(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO usage(String usage) {
        this.setUsage(usage);
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
    public PSDevCenterSVNDTO usertag(String userTag) {
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
    public PSDevCenterSVNDTO usertag2(String userTag2) {
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
    public PSDevCenterSVNDTO usertag3(String userTag3) {
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
    public PSDevCenterSVNDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevCenterSVNName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevCenterSVNName(strName);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO name(String strName) {
        this.setPSDevCenterSVNName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevCenterSVNId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevCenterSVNId(strValue);
    }

    @JsonIgnore
    public PSDevCenterSVNDTO id(String strValue) {
        this.setPSDevCenterSVNId(strValue);
        return this;
    }

}
