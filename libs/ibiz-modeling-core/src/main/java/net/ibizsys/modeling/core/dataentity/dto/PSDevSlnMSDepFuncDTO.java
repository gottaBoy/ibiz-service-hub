package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnMSDepFuncDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEPLOYSTATE = "DEPLOYSTATE";
    protected static final String DTOFIELD_DEPLOYSTATE = "deploystate";
    public static final String FIELD_FUNCTYPE = "FUNCTYPE";
    protected static final String DTOFIELD_FUNCTYPE = "functype";
    public static final String FIELD_HTTPADDRESS = "HTTPADDRESS";
    protected static final String DTOFIELD_HTTPADDRESS = "httpaddress";
    public static final String FIELD_HTTPPORT = "HTTPPORT";
    protected static final String DTOFIELD_HTTPPORT = "httpport";
    public static final String FIELD_HTTPSPORT = "HTTPSPORT";
    protected static final String DTOFIELD_HTTPSPORT = "httpsport";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNODEID = "PSDCMSPLATFORMNODEID";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";
    public static final String FIELD_PSDCMSPLATFORMNODENAME = "PSDCMSPLATFORMNODENAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";
    public static final String FIELD_PSDEVCENTERDBINSTID = "PSDEVCENTERDBINSTID";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTID = "psdevcenterdbinstid";
    public static final String FIELD_PSDEVCENTERDBINSTNAME = "PSDEVCENTERDBINSTNAME";
    protected static final String DTOFIELD_PSDEVCENTERDBINSTNAME = "psdevcenterdbinstname";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNMSDEPFUNCID = "PSDEVSLNMSDEPFUNCID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCID = "psdevslnmsdepfuncid";
    public static final String FIELD_PSDEVSLNMSDEPFUNCNAME = "PSDEVSLNMSDEPFUNCNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPFUNCNAME = "psdevslnmsdepfuncname";
    public static final String FIELD_PSDEVSLNMSDEPLOYID = "PSDEVSLNMSDEPLOYID";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";
    public static final String FIELD_PSDEVSLNMSDEPLOYNAME = "PSDEVSLNMSDEPLOYNAME";
    protected static final String DTOFIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNPIPELINEID = "PSDEVSLNPIPELINEID";
    protected static final String DTOFIELD_PSDEVSLNPIPELINEID = "psdevslnpipelineid";
    public static final String FIELD_PSDEVSLNPIPELINENAME = "PSDEVSLNPIPELINENAME";
    protected static final String DTOFIELD_PSDEVSLNPIPELINENAME = "psdevslnpipelinename";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
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
    public PSDevSlnMSDepFuncDTO createdate(Timestamp createDate) {
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
    public PSDevSlnMSDepFuncDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="deploystate")
    public void setDeployState(Integer deployState) {
        this._set(DTOFIELD_DEPLOYSTATE, deployState);
    }

    @JsonIgnore
    public Integer getDeployState() {
        Object objValue = this._get(DTOFIELD_DEPLOYSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDeployStateDirty() {
        return this._contains(DTOFIELD_DEPLOYSTATE);
    }

    @JsonIgnore
    public void resetDeployState() {
        this._reset(DTOFIELD_DEPLOYSTATE);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO deploystate(Integer deployState) {
        this.setDeployState(deployState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO deploystate(PSModelEnums.MSDeployItemState deployState) {
        this.setDeployState(deployState == null ? null : deployState.value);
        return this;
    }

    @JsonProperty(value="functype")
    public void setFuncType(String funcType) {
        this._set(DTOFIELD_FUNCTYPE, funcType);
    }

    @JsonIgnore
    public String getFuncType() {
        Object objValue = this._get(DTOFIELD_FUNCTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncTypeDirty() {
        return this._contains(DTOFIELD_FUNCTYPE);
    }

    @JsonIgnore
    public void resetFuncType() {
        this._reset(DTOFIELD_FUNCTYPE);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO functype(String funcType) {
        this.setFuncType(funcType);
        return this;
    }

    @JsonProperty(value="httpaddress")
    public void setHttpAddress(String httpAddress) {
        this._set(DTOFIELD_HTTPADDRESS, httpAddress);
    }

    @JsonIgnore
    public String getHttpAddress() {
        Object objValue = this._get(DTOFIELD_HTTPADDRESS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHttpAddressDirty() {
        return this._contains(DTOFIELD_HTTPADDRESS);
    }

    @JsonIgnore
    public void resetHttpAddress() {
        this._reset(DTOFIELD_HTTPADDRESS);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO httpaddress(String httpAddress) {
        this.setHttpAddress(httpAddress);
        return this;
    }

    @JsonProperty(value="httpport")
    public void setHttpPort(Integer httpPort) {
        this._set(DTOFIELD_HTTPPORT, httpPort);
    }

    @JsonIgnore
    public Integer getHttpPort() {
        Object objValue = this._get(DTOFIELD_HTTPPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHttpPortDirty() {
        return this._contains(DTOFIELD_HTTPPORT);
    }

    @JsonIgnore
    public void resetHttpPort() {
        this._reset(DTOFIELD_HTTPPORT);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO httpport(Integer httpPort) {
        this.setHttpPort(httpPort);
        return this;
    }

    @JsonProperty(value="httpsport")
    public void setHttpsPort(Integer httpsPort) {
        this._set(DTOFIELD_HTTPSPORT, httpsPort);
    }

    @JsonIgnore
    public Integer getHttpsPort() {
        Object objValue = this._get(DTOFIELD_HTTPSPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHttpsPortDirty() {
        return this._contains(DTOFIELD_HTTPSPORT);
    }

    @JsonIgnore
    public void resetHttpsPort() {
        this._reset(DTOFIELD_HTTPSPORT);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO httpsport(Integer httpsPort) {
        this.setHttpsPort(httpsPort);
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
    public PSDevSlnMSDepFuncDTO memo(String memo) {
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
    public PSDevSlnMSDepFuncDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodeid")
    public void setPSDCMSPlatformNodeId(String pSDCMSPlatformNodeId) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODEID, pSDCMSPlatformNodeId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODEID);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId) {
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdcmsplatformnodeid(PSDCMSPlatformNodeDTO pSDCMSPlatformNode) {
        if (pSDCMSPlatformNode == null) {
            this.setPSDCMSPlatformNodeId(null);
            this.setPSDCMSPlatformNodeName(null);
        } else {
            this.setPSDCMSPlatformNodeId(pSDCMSPlatformNode.getPSDCMSPlatformNodeId());
            this.setPSDCMSPlatformNodeName(pSDCMSPlatformNode.getPSDCMSPlatformNodeName());
        }
        return this;
    }

    @JsonProperty(value="psdcmsplatformnodename")
    public void setPSDCMSPlatformNodeName(String pSDCMSPlatformNodeName) {
        this._set(DTOFIELD_PSDCMSPLATFORMNODENAME, pSDCMSPlatformNodeName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformNodeName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMNODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformNodeNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformNodeName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName) {
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstid")
    public void setPSDevCenterDBInstId(String pSDevCenterDBInstId) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTID, pSDevCenterDBInstId);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstId() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevcenterdbinstid(String pSDevCenterDBInstId) {
        this.setPSDevCenterDBInstId(pSDevCenterDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevcenterdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPSDevCenterDBInstId(null);
            this.setPSDevCenterDBInstName(null);
        } else {
            this.setPSDevCenterDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPSDevCenterDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevcenterdbinstname")
    public void setPSDevCenterDBInstName(String pSDevCenterDBInstName) {
        this._set(DTOFIELD_PSDEVCENTERDBINSTNAME, pSDevCenterDBInstName);
    }

    @JsonIgnore
    public String getPSDevCenterDBInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterDBInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterDBInstName() {
        this._reset(DTOFIELD_PSDEVCENTERDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevcenterdbinstname(String pSDevCenterDBInstName) {
        this.setPSDevCenterDBInstName(pSDevCenterDBInstName);
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
    public PSDevSlnMSDepFuncDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
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
    public PSDevSlnMSDepFuncDTO psdevcentersvnname(String pSDevCenterSVNName) {
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
    public PSDevSlnMSDepFuncDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncid")
    public void setPSDevSlnMSDepFuncId(String pSDevSlnMSDepFuncId) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCID, pSDevSlnMSDepFuncId);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncId() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCID);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnmsdepfuncid(String pSDevSlnMSDepFuncId) {
        this.setPSDevSlnMSDepFuncId(pSDevSlnMSDepFuncId);
        return this;
    }

    @JsonProperty(value="psdevslnmsdepfuncname")
    public void setPSDevSlnMSDepFuncName(String pSDevSlnMSDepFuncName) {
        this._set(DTOFIELD_PSDEVSLNMSDEPFUNCNAME, pSDevSlnMSDepFuncName);
    }

    @JsonIgnore
    public String getPSDevSlnMSDepFuncName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnMSDepFuncNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnMSDepFuncName() {
        this._reset(DTOFIELD_PSDEVSLNMSDEPFUNCNAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnmsdepfuncname(String pSDevSlnMSDepFuncName) {
        this.setPSDevSlnMSDepFuncName(pSDevSlnMSDepFuncName);
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
    public PSDevSlnMSDepFuncDTO psdevslnmsdeployid(String pSDevSlnMSDeployId) {
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnmsdeployid(PSDevSlnMSDeployDTO pSDevSlnMSDeploy) {
        if (pSDevSlnMSDeploy == null) {
            this.setPSDCMSPlatformId(null);
            this.setPSDevSlnMSDeployId(null);
            this.setPSDevSlnMSDeployName(null);
        } else {
            this.setPSDCMSPlatformId(pSDevSlnMSDeploy.getPSDCMSPlatformId());
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
    public PSDevSlnMSDepFuncDTO psdevslnmsdeployname(String pSDevSlnMSDeployName) {
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
    public PSDevSlnMSDepFuncDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnpipelineid")
    public void setPSDevSlnPipelineId(String pSDevSlnPipelineId) {
        this._set(DTOFIELD_PSDEVSLNPIPELINEID, pSDevSlnPipelineId);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineId() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINEID);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnpipelineid(String pSDevSlnPipelineId) {
        this.setPSDevSlnPipelineId(pSDevSlnPipelineId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnpipelineid(PSDevSlnPipelineDTO pSDevSlnPipeline) {
        if (pSDevSlnPipeline == null) {
            this.setPSDevSlnPipelineId(null);
            this.setPSDevSlnPipelineName(null);
        } else {
            this.setPSDevSlnPipelineId(pSDevSlnPipeline.getPSDevSlnPipelineId());
            this.setPSDevSlnPipelineName(pSDevSlnPipeline.getPSDevSlnPipelineName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnpipelinename")
    public void setPSDevSlnPipelineName(String pSDevSlnPipelineName) {
        this._set(DTOFIELD_PSDEVSLNPIPELINENAME, pSDevSlnPipelineName);
    }

    @JsonIgnore
    public String getPSDevSlnPipelineName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNPIPELINENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnPipelineNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public void resetPSDevSlnPipelineName() {
        this._reset(DTOFIELD_PSDEVSLNPIPELINENAME);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnpipelinename(String pSDevSlnPipelineName) {
        this.setPSDevSlnPipelineName(pSDevSlnPipelineName);
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
    public PSDevSlnMSDepFuncDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
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
    public PSDevSlnMSDepFuncDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
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
    public PSDevSlnMSDepFuncDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnMSDepFuncDTO updateman(String updateMan) {
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
    public PSDevSlnMSDepFuncDTO userparams(String userParams) {
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
    public PSDevSlnMSDepFuncDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnMSDepFuncName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnMSDepFuncName(strName);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO name(String strName) {
        this.setPSDevSlnMSDepFuncName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnMSDepFuncId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnMSDepFuncId(strValue);
    }

    @JsonIgnore
    public PSDevSlnMSDepFuncDTO id(String strValue) {
        this.setPSDevSlnMSDepFuncId(strValue);
        return this;
    }

}
