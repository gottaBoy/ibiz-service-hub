package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCRegistryItemDTO extends PSModelDTOBase {
    public static final String FIELD_CONNSTR = "CONNSTR";
    protected static final String DTOFIELD_CONNSTR = "connstr";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DOCKERFILE = "DOCKERFILE";
    protected static final String DTOFIELD_DOCKERFILE = "dockerfile";
    public static final String FIELD_ITEMPARAMS = "ITEMPARAMS";
    protected static final String DTOFIELD_ITEMPARAMS = "itemparams";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_ITEMTAG3 = "ITEMTAG3";
    protected static final String DTOFIELD_ITEMTAG3 = "itemtag3";
    public static final String FIELD_ITEMTAG4 = "ITEMTAG4";
    protected static final String DTOFIELD_ITEMTAG4 = "itemtag4";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCREGISTRYITEMID = "PSDCREGISTRYITEMID";
    protected static final String DTOFIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";
    public static final String FIELD_PSDCREGISTRYITEMNAME = "PSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";
    public static final String FIELD_PSDCREGISTRYREPOID = "PSDCREGISTRYREPOID";
    protected static final String DTOFIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";
    public static final String FIELD_PSDCREGISTRYREPONAME = "PSDCREGISTRYREPONAME";
    protected static final String DTOFIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNMSDEPLOYID = "PSDEVSLNMSDEPLOYID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";
    public static final String FIELD_PSDEVSLNMSDEPLOYNAME = "PSDEVSLNMSDEPLOYNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
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

    @JsonProperty(value="connstr")
    public void setConnStr(String connStr) {
        this._set(DTOFIELD_CONNSTR, connStr);
    }

    @JsonIgnore
    public String getConnStr() {
        Object objValue = this._get(DTOFIELD_CONNSTR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConnStrDirty() {
        return this._contains(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public void resetConnStr() {
        this._reset(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO connstr(String connStr) {
        this.setConnStr(connStr);
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
    public PSDCRegistryItemDTO createdate(Timestamp createDate) {
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
    public PSDCRegistryItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dockerfile")
    public void setDockerFile(String dockerFile) {
        this._set(DTOFIELD_DOCKERFILE, dockerFile);
    }

    @JsonIgnore
    public String getDockerFile() {
        Object objValue = this._get(DTOFIELD_DOCKERFILE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDockerFileDirty() {
        return this._contains(DTOFIELD_DOCKERFILE);
    }

    @JsonIgnore
    public void resetDockerFile() {
        this._reset(DTOFIELD_DOCKERFILE);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO dockerfile(String dockerFile) {
        this.setDockerFile(dockerFile);
        return this;
    }

    @JsonProperty(value="itemparams")
    public void setItemParams(String itemParams) {
        this._set(DTOFIELD_ITEMPARAMS, itemParams);
    }

    @JsonIgnore
    public String getItemParams() {
        Object objValue = this._get(DTOFIELD_ITEMPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParamsDirty() {
        return this._contains(DTOFIELD_ITEMPARAMS);
    }

    @JsonIgnore
    public void resetItemParams() {
        this._reset(DTOFIELD_ITEMPARAMS);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO itemparams(String itemParams) {
        this.setItemParams(itemParams);
        return this;
    }

    @JsonProperty(value="itemtag")
    public void setItemTag(String itemTag) {
        this._set(DTOFIELD_ITEMTAG, itemTag);
    }

    @JsonIgnore
    public String getItemTag() {
        Object objValue = this._get(DTOFIELD_ITEMTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTagDirty() {
        return this._contains(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public void resetItemTag() {
        this._reset(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO itemtag(String itemTag) {
        this.setItemTag(itemTag);
        return this;
    }

    @JsonProperty(value="itemtag2")
    public void setItemTag2(String itemTag2) {
        this._set(DTOFIELD_ITEMTAG2, itemTag2);
    }

    @JsonIgnore
    public String getItemTag2() {
        Object objValue = this._get(DTOFIELD_ITEMTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag2Dirty() {
        return this._contains(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public void resetItemTag2() {
        this._reset(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
        return this;
    }

    @JsonProperty(value="itemtag3")
    public void setItemTag3(String itemTag3) {
        this._set(DTOFIELD_ITEMTAG3, itemTag3);
    }

    @JsonIgnore
    public String getItemTag3() {
        Object objValue = this._get(DTOFIELD_ITEMTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag3Dirty() {
        return this._contains(DTOFIELD_ITEMTAG3);
    }

    @JsonIgnore
    public void resetItemTag3() {
        this._reset(DTOFIELD_ITEMTAG3);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO itemtag3(String itemTag3) {
        this.setItemTag3(itemTag3);
        return this;
    }

    @JsonProperty(value="itemtag4")
    public void setItemTag4(String itemTag4) {
        this._set(DTOFIELD_ITEMTAG4, itemTag4);
    }

    @JsonIgnore
    public String getItemTag4() {
        Object objValue = this._get(DTOFIELD_ITEMTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag4Dirty() {
        return this._contains(DTOFIELD_ITEMTAG4);
    }

    @JsonIgnore
    public void resetItemTag4() {
        this._reset(DTOFIELD_ITEMTAG4);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO itemtag4(String itemTag4) {
        this.setItemTag4(itemTag4);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSDCRegistryItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcregistryitemid")
    public void setPSDCRegistryItemId(String pSDCRegistryItemId) {
        this._set(DTOFIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }

    @JsonIgnore
    public String getPSDCRegistryItemId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemId() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMID);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryitemid(String pSDCRegistryItemId) {
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    @JsonProperty(value="psdcregistryitemname")
    public void setPSDCRegistryItemName(String pSDCRegistryItemName) {
        this._set(DTOFIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }

    @JsonIgnore
    public String getPSDCRegistryItemName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYITEMNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryItemNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryItemName() {
        this._reset(DTOFIELD_PSDCREGISTRYITEMNAME);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryitemname(String pSDCRegistryItemName) {
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    @JsonProperty(value="psdcregistryrepoid")
    public void setPSDCRegistryRepoId(String pSDCRegistryRepoId) {
        this._set(DTOFIELD_PSDCREGISTRYREPOID, pSDCRegistryRepoId);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoId() {
        this._reset(DTOFIELD_PSDCREGISTRYREPOID);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryrepoid(String pSDCRegistryRepoId) {
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryrepoid(PSDCRegistryRepoDTO pSDCRegistryRepo) {
        if (pSDCRegistryRepo == null) {
            this.setPSDCRegistryRepoId(null);
            this.setPSDCRegistryRepoName(null);
        } else {
            this.setPSDCRegistryRepoId(pSDCRegistryRepo.getPSDCRegistryRepoId());
            this.setPSDCRegistryRepoName(pSDCRegistryRepo.getPSDCRegistryRepoName());
        }
        return this;
    }

    @JsonProperty(value="psdcregistryreponame")
    public void setPSDCRegistryRepoName(String pSDCRegistryRepoName) {
        this._set(DTOFIELD_PSDCREGISTRYREPONAME, pSDCRegistryRepoName);
    }

    @JsonIgnore
    public String getPSDCRegistryRepoName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryRepoNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryRepoName() {
        this._reset(DTOFIELD_PSDCREGISTRYREPONAME);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryreponame(String pSDCRegistryRepoName) {
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
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
    public PSDCRegistryItemDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
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
    public PSDCRegistryItemDTO psdevcentersvnname(String pSDevCenterSVNName) {
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
    public PSDCRegistryItemDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDCRegistryItemDTO psdevslnmsdeployid(String pSDevSlnMSDeployId) {
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnmsdeployid(PSDevSlnMSDeployDTO pSDevSlnMSDeploy) {
        if (pSDevSlnMSDeploy == null) {
            this.setPSDevSlnMSDeployId(null);
            this.setPSDevSlnMSDeployName(null);
        } else {
            this.setPSDevSlnMSDeployId(pSDevSlnMSDeploy.getPSDevSlnMSDeployId());
            this.setPSDevSlnMSDeployName(pSDevSlnMSDeploy.getPSDevSlnMSDeployName());
        }
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
    public PSDCRegistryItemDTO psdevslnmsdeployname(String pSDevSlnMSDeployName) {
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
    public PSDCRegistryItemDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setPSDevSlnId(pSDevSlnSys.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSlnSys.getPSDevSlnName());
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDCRegistryItemDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
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
    public PSDCRegistryItemDTO tags(String tags) {
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
    public PSDCRegistryItemDTO updatedate(Timestamp updateDate) {
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
    public PSDCRegistryItemDTO updateman(String updateMan) {
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
        if (objValue == null) return null;
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
    public PSDCRegistryItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
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
    public PSDCRegistryItemDTO usertag(String userTag) {
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
    public PSDCRegistryItemDTO usertag2(String userTag2) {
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
    public PSDCRegistryItemDTO usertag3(String userTag3) {
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
    public PSDCRegistryItemDTO usertag4(String userTag4) {
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
    public PSDCRegistryItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryItemDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCRegistryItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCRegistryItemName(strName);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO name(String strName) {
        this.setPSDCRegistryItemName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCRegistryItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCRegistryItemId(strValue);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO id(String strValue) {
        this.setPSDCRegistryItemId(strValue);
        return this;
    }

}
