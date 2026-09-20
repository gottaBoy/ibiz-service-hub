package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCRegistryRepoDTO extends PSModelDTOBase {
    public static final String FIELD_CONNSTR = "CONNSTR";
    protected static final String DTOFIELD_CONNSTR = "connstr";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
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
    public static final String FIELD_PSDCREGISTRYREPOID = "PSDCREGISTRYREPOID";
    protected static final String DTOFIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";
    public static final String FIELD_PSDCREGISTRYREPONAME = "PSDCREGISTRYREPONAME";
    protected static final String DTOFIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";
    public static final String FIELD_PSDCREGISTRYSERVERID = "PSDCREGISTRYSERVERID";
    protected static final String DTOFIELD_PSDCREGISTRYSERVERID = "psdcregistryserverid";
    public static final String FIELD_PSDCREGISTRYSERVERNAME = "PSDCREGISTRYSERVERNAME";
    protected static final String DTOFIELD_PSDCREGISTRYSERVERNAME = "psdcregistryservername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSREGISTRYREPOID = "PSREGISTRYREPOID";
    protected static final String DTOFIELD_PSREGISTRYREPOID = "psregistryrepoid";
    public static final String FIELD_PSREGISTRYREPONAME = "PSREGISTRYREPONAME";
    protected static final String DTOFIELD_PSREGISTRYREPONAME = "psregistryreponame";
    public static final String FIELD_REGISTRYPASSWD = "REGISTRYPASSWD";
    protected static final String DTOFIELD_REGISTRYPASSWD = "registrypasswd";
    public static final String FIELD_REGISTRYTYPE = "REGISTRYTYPE";
    protected static final String DTOFIELD_REGISTRYTYPE = "registrytype";
    public static final String FIELD_REGISTRYUSERNAME = "REGISTRYUSERNAME";
    protected static final String DTOFIELD_REGISTRYUSERNAME = "registryusername";
    public static final String FIELD_RESPOS = "RESPOS";
    protected static final String DTOFIELD_RESPOS = "respos";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_ROPASSWD = "ROPASSWD";
    protected static final String DTOFIELD_ROPASSWD = "ropasswd";
    public static final String FIELD_ROPSCREDENTIALID = "ROPSCREDENTIALID";
    protected static final String DTOFIELD_ROPSCREDENTIALID = "ropscredentialid";
    public static final String FIELD_ROPSCREDENTIALNAME = "ROPSCREDENTIALNAME";
    protected static final String DTOFIELD_ROPSCREDENTIALNAME = "ropscredentialname";
    public static final String FIELD_ROUSERNAME = "ROUSERNAME";
    protected static final String DTOFIELD_ROUSERNAME = "rousername";
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
    public PSDCRegistryRepoDTO connstr(String connStr) {
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
    public PSDCRegistryRepoDTO createdate(Timestamp createDate) {
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
    public PSDCRegistryRepoDTO createman(String createMan) {
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
        if (objValue == null) return null;
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
    public PSDCRegistryRepoDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO defaultflag(Boolean defaultFlag) {
        this.setDefaultFlag(defaultFlag == null ? null : (defaultFlag ? 1 : 0));
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
    public PSDCRegistryRepoDTO memo(String memo) {
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
    public PSDCRegistryRepoDTO param(String param) {
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
    public PSDCRegistryRepoDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(String param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public String getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO param3(String param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(String param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public String getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO param4(String param4) {
        this.setParam4(param4);
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
    public PSDCRegistryRepoDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO pscredentialid(PSCredentialDTO pSCredential) {
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
    public PSDCRegistryRepoDTO pscredentialname(String pSCredentialName) {
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
    public PSDCRegistryRepoDTO psdcclusterid(String pSDCClusterId) {
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdcclusterid(PSDCClusterDTO pSDCCluster) {
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
    public PSDCRegistryRepoDTO psdcclustername(String pSDCClusterName) {
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
    public PSDCRegistryRepoDTO psdccontainerspecid(String pSDCContainerSpecId) {
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
    public PSDCRegistryRepoDTO psdccontainerspecname(String pSDCContainerSpecName) {
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
    public PSDCRegistryRepoDTO psdcfileid(String pSDCFileId) {
        this.setPSDCFileId(pSDCFileId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdcfileid(PSDCFileDTO pSDCFile) {
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
    public PSDCRegistryRepoDTO psdcfilename(String pSDCFileName) {
        this.setPSDCFileName(pSDCFileName);
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
    public PSDCRegistryRepoDTO psdcregistryrepoid(String pSDCRegistryRepoId) {
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
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
    public PSDCRegistryRepoDTO psdcregistryreponame(String pSDCRegistryRepoName) {
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
        return this;
    }

    @JsonProperty(value="psdcregistryserverid")
    public void setPSDCRegistryServerId(String pSDCRegistryServerId) {
        this._set(DTOFIELD_PSDCREGISTRYSERVERID, pSDCRegistryServerId);
    }

    @JsonIgnore
    public String getPSDCRegistryServerId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryServerIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYSERVERID);
    }

    @JsonIgnore
    public void resetPSDCRegistryServerId() {
        this._reset(DTOFIELD_PSDCREGISTRYSERVERID);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdcregistryserverid(String pSDCRegistryServerId) {
        this.setPSDCRegistryServerId(pSDCRegistryServerId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdcregistryserverid(PSDCRegistryServerDTO pSDCRegistryServer) {
        if (pSDCRegistryServer == null) {
            this.setPSDCRegistryServerId(null);
            this.setPSDCRegistryServerName(null);
        } else {
            this.setPSDCRegistryServerId(pSDCRegistryServer.getPSDCRegistryServerId());
            this.setPSDCRegistryServerName(pSDCRegistryServer.getPSDCRegistryServerName());
        }
        return this;
    }

    @JsonProperty(value="psdcregistryservername")
    public void setPSDCRegistryServerName(String pSDCRegistryServerName) {
        this._set(DTOFIELD_PSDCREGISTRYSERVERNAME, pSDCRegistryServerName);
    }

    @JsonIgnore
    public String getPSDCRegistryServerName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryServerNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYSERVERNAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryServerName() {
        this._reset(DTOFIELD_PSDCREGISTRYSERVERNAME);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdcregistryservername(String pSDCRegistryServerName) {
        this.setPSDCRegistryServerName(pSDCRegistryServerName);
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
    public PSDCRegistryRepoDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCRegistryRepoDTO psdevcentername(String pSDevCenterName) {
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
    public PSDCRegistryRepoDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDCRegistryRepoDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psregistryrepoid")
    public void setPSRegistryRepoId(String pSRegistryRepoId) {
        this._set(DTOFIELD_PSREGISTRYREPOID, pSRegistryRepoId);
    }

    @JsonIgnore
    public String getPSRegistryRepoId() {
        Object objValue = this._get(DTOFIELD_PSREGISTRYREPOID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSRegistryRepoIdDirty() {
        return this._contains(DTOFIELD_PSREGISTRYREPOID);
    }

    @JsonIgnore
    public void resetPSRegistryRepoId() {
        this._reset(DTOFIELD_PSREGISTRYREPOID);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psregistryrepoid(String pSRegistryRepoId) {
        this.setPSRegistryRepoId(pSRegistryRepoId);
        return this;
    }

    @JsonProperty(value="psregistryreponame")
    public void setPSRegistryRepoName(String pSRegistryRepoName) {
        this._set(DTOFIELD_PSREGISTRYREPONAME, pSRegistryRepoName);
    }

    @JsonIgnore
    public String getPSRegistryRepoName() {
        Object objValue = this._get(DTOFIELD_PSREGISTRYREPONAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSRegistryRepoNameDirty() {
        return this._contains(DTOFIELD_PSREGISTRYREPONAME);
    }

    @JsonIgnore
    public void resetPSRegistryRepoName() {
        this._reset(DTOFIELD_PSREGISTRYREPONAME);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO psregistryreponame(String pSRegistryRepoName) {
        this.setPSRegistryRepoName(pSRegistryRepoName);
        return this;
    }

    @JsonProperty(value="registrypasswd")
    public void setRegistryPasswd(String registryPasswd) {
        this._set(DTOFIELD_REGISTRYPASSWD, registryPasswd);
    }

    @JsonIgnore
    public String getRegistryPasswd() {
        Object objValue = this._get(DTOFIELD_REGISTRYPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegistryPasswdDirty() {
        return this._contains(DTOFIELD_REGISTRYPASSWD);
    }

    @JsonIgnore
    public void resetRegistryPasswd() {
        this._reset(DTOFIELD_REGISTRYPASSWD);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO registrypasswd(String registryPasswd) {
        this.setRegistryPasswd(registryPasswd);
        return this;
    }

    @JsonProperty(value="registrytype")
    public void setRegistryType(String registryType) {
        this._set(DTOFIELD_REGISTRYTYPE, registryType);
    }

    @JsonIgnore
    public String getRegistryType() {
        Object objValue = this._get(DTOFIELD_REGISTRYTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegistryTypeDirty() {
        return this._contains(DTOFIELD_REGISTRYTYPE);
    }

    @JsonIgnore
    public void resetRegistryType() {
        this._reset(DTOFIELD_REGISTRYTYPE);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO registrytype(String registryType) {
        this.setRegistryType(registryType);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO registrytype(PSModelEnums.RegistryServerType registryType) {
        this.setRegistryType(registryType == null ? null : registryType.value);
        return this;
    }

    @JsonProperty(value="registryusername")
    public void setRegistryUserName(String registryUserName) {
        this._set(DTOFIELD_REGISTRYUSERNAME, registryUserName);
    }

    @JsonIgnore
    public String getRegistryUserName() {
        Object objValue = this._get(DTOFIELD_REGISTRYUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegistryUserNameDirty() {
        return this._contains(DTOFIELD_REGISTRYUSERNAME);
    }

    @JsonIgnore
    public void resetRegistryUserName() {
        this._reset(DTOFIELD_REGISTRYUSERNAME);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO registryusername(String registryUserName) {
        this.setRegistryUserName(registryUserName);
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
    public PSDCRegistryRepoDTO respos(Integer resPos) {
        this.setResPos(resPos);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO respos(PSModelEnums.DCResPos resPos) {
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
    public PSDCRegistryRepoDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
        return this;
    }

    @JsonProperty(value="ropasswd")
    public void setROPasswd(String rOPasswd) {
        this._set(DTOFIELD_ROPASSWD, rOPasswd);
    }

    @JsonIgnore
    public String getROPasswd() {
        Object objValue = this._get(DTOFIELD_ROPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROPasswdDirty() {
        return this._contains(DTOFIELD_ROPASSWD);
    }

    @JsonIgnore
    public void resetROPasswd() {
        this._reset(DTOFIELD_ROPASSWD);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO ropasswd(String rOPasswd) {
        this.setROPasswd(rOPasswd);
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
    public PSDCRegistryRepoDTO ropscredentialid(String rOPSCredentialId) {
        this.setROPSCredentialId(rOPSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO ropscredentialid(PSCredentialDTO pSCredential) {
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
    public PSDCRegistryRepoDTO ropscredentialname(String rOPSCredentialName) {
        this.setROPSCredentialName(rOPSCredentialName);
        return this;
    }

    @JsonProperty(value="rousername")
    public void setROUserName(String rOUserName) {
        this._set(DTOFIELD_ROUSERNAME, rOUserName);
    }

    @JsonIgnore
    public String getROUserName() {
        Object objValue = this._get(DTOFIELD_ROUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROUserNameDirty() {
        return this._contains(DTOFIELD_ROUSERNAME);
    }

    @JsonIgnore
    public void resetROUserName() {
        this._reset(DTOFIELD_ROUSERNAME);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO rousername(String rOUserName) {
        this.setROUserName(rOUserName);
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
    public PSDCRegistryRepoDTO updatedate(Timestamp updateDate) {
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
    public PSDCRegistryRepoDTO updateman(String updateMan) {
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
    public PSDCRegistryRepoDTO usertag(String userTag) {
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
    public PSDCRegistryRepoDTO usertag2(String userTag2) {
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
    public PSDCRegistryRepoDTO usertag3(String userTag3) {
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
    public PSDCRegistryRepoDTO usertag4(String userTag4) {
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
    public PSDCRegistryRepoDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCRegistryRepoName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCRegistryRepoName(strName);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO name(String strName) {
        this.setPSDCRegistryRepoName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCRegistryRepoId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCRegistryRepoId(strValue);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO id(String strValue) {
        this.setPSDCRegistryRepoId(strValue);
        return this;
    }

}
