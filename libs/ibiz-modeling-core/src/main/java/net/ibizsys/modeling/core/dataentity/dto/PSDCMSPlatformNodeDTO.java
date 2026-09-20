package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCMSPlatformNodeDTO extends PSModelDTOBase {
    public static final String FIELD_CFGTYPE = "CFGTYPE";
    protected static final String DTOFIELD_CFGTYPE = "cfgtype";
    public static final String FIELD_CONTAINERCFG = "CONTAINERCFG";
    protected static final String DTOFIELD_CONTAINERCFG = "containercfg";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DCREGISTRYITEMTAG = "DCREGISTRYITEMTAG";
    protected static final String DTOFIELD_DCREGISTRYITEMTAG = "dcregistryitemtag";
    public static final String FIELD_DCREGISTRYITEMTAG2 = "DCREGISTRYITEMTAG2";
    protected static final String DTOFIELD_DCREGISTRYITEMTAG2 = "dcregistryitemtag2";
    public static final String FIELD_DCREGISTRYITEMTAG3 = "DCREGISTRYITEMTAG3";
    protected static final String DTOFIELD_DCREGISTRYITEMTAG3 = "dcregistryitemtag3";
    public static final String FIELD_DCREGISTRYITEMTAG4 = "DCREGISTRYITEMTAG4";
    protected static final String DTOFIELD_DCREGISTRYITEMTAG4 = "dcregistryitemtag4";
    public static final String FIELD_ENVPARAMS = "ENVPARAMS";
    protected static final String DTOFIELD_ENVPARAMS = "envparams";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MAXCPU = "MAXCPU";
    protected static final String DTOFIELD_MAXCPU = "maxcpu";
    public static final String FIELD_MAXMEM = "MAXMEN";
    protected static final String DTOFIELD_MAXMEM = "maxmem";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINCPU = "MINCPU";
    protected static final String DTOFIELD_MINCPU = "mincpu";
    public static final String FIELD_MINMEM = "MINMEN";
    protected static final String DTOFIELD_MINMEM = "minmem";
    public static final String FIELD_NODEINFO = "NODEINFO";
    protected static final String DTOFIELD_NODEINFO = "nodeinfo";
    public static final String FIELD_NODESTATE = "NODESTATE";
    protected static final String DTOFIELD_NODESTATE = "nodestate";
    public static final String FIELD_NODETAG = "NODETAG";
    protected static final String DTOFIELD_NODETAG = "nodetag";
    public static final String FIELD_NODETAG2 = "NODETAG2";
    protected static final String DTOFIELD_NODETAG2 = "nodetag2";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
    public static final String FIELD_PORT2 = "PORT2";
    protected static final String DTOFIELD_PORT2 = "port2";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNAME = "PSDCMSPLATFORMNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";
    public static final String FIELD_PSDCMSPLATFORMNODEID = "PSDCMSPLATFORMNODEID";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODEID = "psdcmsplatformnodeid";
    public static final String FIELD_PSDCMSPLATFORMNODENAME = "PSDCMSPLATFORMNODENAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNODENAME = "psdcmsplatformnodename";
    public static final String FIELD_PSDCREGISTRYITEMID = "PSDCREGISTRYITEMID";
    protected static final String DTOFIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";
    public static final String FIELD_PSDCREGISTRYITEMNAME = "PSDCREGISTRYITEMNAME";
    protected static final String DTOFIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSMSPLATFORMNODEID = "PSMSPLATFORMNODEID";
    protected static final String DTOFIELD_PSMSPLATFORMNODEID = "psmsplatformnodeid";
    public static final String FIELD_PSMSPLATFORMNODENAME = "PSMSPLATFORMNODENAME";
    protected static final String DTOFIELD_PSMSPLATFORMNODENAME = "psmsplatformnodename";
    public static final String FIELD_REFCOUNT = "REFCOUNT";
    protected static final String DTOFIELD_REFCOUNT = "refcount";
    public static final String FIELD_REFINFO = "REFINFO";
    protected static final String DTOFIELD_REFINFO = "refinfo";
    public static final String FIELD_REPLICATED = "REPLICATED";
    protected static final String DTOFIELD_REPLICATED = "replicated";
    public static final String FIELD_SCALE = "SCALE";
    protected static final String DTOFIELD_SCALE = "scale";
    public static final String FIELD_SERVICEID = "SERVICEID";
    protected static final String DTOFIELD_SERVICEID = "serviceid";
    public static final String FIELD_SERVICENAME = "SERVICENAME";
    protected static final String DTOFIELD_SERVICENAME = "servicename";
    public static final String FIELD_SERVICEURL = "SERVICEURL";
    protected static final String DTOFIELD_SERVICEURL = "serviceurl";
    public static final String FIELD_SSHIPADDR = "SSHIPADDR";
    protected static final String DTOFIELD_SSHIPADDR = "sshipaddr";
    public static final String FIELD_SSHPORT = "SSHPORT";
    protected static final String DTOFIELD_SSHPORT = "sshport";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPLOADFILEMODE = "UPLOADFILEMODE";
    protected static final String DTOFIELD_UPLOADFILEMODE = "uploadfilemode";
    public static final String FIELD_UPLOADPATH = "UPLOADPATH";
    protected static final String DTOFIELD_UPLOADPATH = "uploadpath";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public static final String FIELD_WORKSHOPPATH = "WORKSHOPPATH";
    protected static final String DTOFIELD_WORKSHOPPATH = "workshoppath";

    @JsonProperty(value="cfgtype")
    public void setCfgType(String cfgType) {
        this._set(DTOFIELD_CFGTYPE, cfgType);
    }

    @JsonIgnore
    public String getCfgType() {
        Object objValue = this._get(DTOFIELD_CFGTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgTypeDirty() {
        return this._contains(DTOFIELD_CFGTYPE);
    }

    @JsonIgnore
    public void resetCfgType() {
        this._reset(DTOFIELD_CFGTYPE);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO cfgtype(String cfgType) {
        this.setCfgType(cfgType);
        return this;
    }

    @JsonProperty(value="containercfg")
    public void setContainerCfg(String containerCfg) {
        this._set(DTOFIELD_CONTAINERCFG, containerCfg);
    }

    @JsonIgnore
    public String getContainerCfg() {
        Object objValue = this._get(DTOFIELD_CONTAINERCFG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContainerCfgDirty() {
        return this._contains(DTOFIELD_CONTAINERCFG);
    }

    @JsonIgnore
    public void resetContainerCfg() {
        this._reset(DTOFIELD_CONTAINERCFG);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO containercfg(String containerCfg) {
        this.setContainerCfg(containerCfg);
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
    public PSDCMSPlatformNodeDTO createdate(Timestamp createDate) {
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
    public PSDCMSPlatformNodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dcregistryitemtag")
    public void setDCRegistryItemTag(String dCRegistryItemTag) {
        this._set(DTOFIELD_DCREGISTRYITEMTAG, dCRegistryItemTag);
    }

    @JsonIgnore
    public String getDCRegistryItemTag() {
        Object objValue = this._get(DTOFIELD_DCREGISTRYITEMTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCRegistryItemTagDirty() {
        return this._contains(DTOFIELD_DCREGISTRYITEMTAG);
    }

    @JsonIgnore
    public void resetDCRegistryItemTag() {
        this._reset(DTOFIELD_DCREGISTRYITEMTAG);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag(String dCRegistryItemTag) {
        this.setDCRegistryItemTag(dCRegistryItemTag);
        return this;
    }

    @JsonProperty(value="dcregistryitemtag2")
    public void setDCRegistryItemTag2(String dCRegistryItemTag2) {
        this._set(DTOFIELD_DCREGISTRYITEMTAG2, dCRegistryItemTag2);
    }

    @JsonIgnore
    public String getDCRegistryItemTag2() {
        Object objValue = this._get(DTOFIELD_DCREGISTRYITEMTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCRegistryItemTag2Dirty() {
        return this._contains(DTOFIELD_DCREGISTRYITEMTAG2);
    }

    @JsonIgnore
    public void resetDCRegistryItemTag2() {
        this._reset(DTOFIELD_DCREGISTRYITEMTAG2);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag2(String dCRegistryItemTag2) {
        this.setDCRegistryItemTag2(dCRegistryItemTag2);
        return this;
    }

    @JsonProperty(value="dcregistryitemtag3")
    public void setDCRegistryItemTag3(String dCRegistryItemTag3) {
        this._set(DTOFIELD_DCREGISTRYITEMTAG3, dCRegistryItemTag3);
    }

    @JsonIgnore
    public String getDCRegistryItemTag3() {
        Object objValue = this._get(DTOFIELD_DCREGISTRYITEMTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCRegistryItemTag3Dirty() {
        return this._contains(DTOFIELD_DCREGISTRYITEMTAG3);
    }

    @JsonIgnore
    public void resetDCRegistryItemTag3() {
        this._reset(DTOFIELD_DCREGISTRYITEMTAG3);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag3(String dCRegistryItemTag3) {
        this.setDCRegistryItemTag3(dCRegistryItemTag3);
        return this;
    }

    @JsonProperty(value="dcregistryitemtag4")
    public void setDCRegistryItemTag4(String dCRegistryItemTag4) {
        this._set(DTOFIELD_DCREGISTRYITEMTAG4, dCRegistryItemTag4);
    }

    @JsonIgnore
    public String getDCRegistryItemTag4() {
        Object objValue = this._get(DTOFIELD_DCREGISTRYITEMTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCRegistryItemTag4Dirty() {
        return this._contains(DTOFIELD_DCREGISTRYITEMTAG4);
    }

    @JsonIgnore
    public void resetDCRegistryItemTag4() {
        this._reset(DTOFIELD_DCREGISTRYITEMTAG4);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO dcregistryitemtag4(String dCRegistryItemTag4) {
        this.setDCRegistryItemTag4(dCRegistryItemTag4);
        return this;
    }

    @JsonProperty(value="envparams")
    public void setEnvParams(String envParams) {
        this._set(DTOFIELD_ENVPARAMS, envParams);
    }

    @JsonIgnore
    public String getEnvParams() {
        Object objValue = this._get(DTOFIELD_ENVPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnvParamsDirty() {
        return this._contains(DTOFIELD_ENVPARAMS);
    }

    @JsonIgnore
    public void resetEnvParams() {
        this._reset(DTOFIELD_ENVPARAMS);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO envparams(String envParams) {
        this.setEnvParams(envParams);
        return this;
    }

    @JsonProperty(value="ipaddr")
    public void setIpAddr(String ipAddr) {
        this._set(DTOFIELD_IPADDR, ipAddr);
    }

    @JsonIgnore
    public String getIpAddr() {
        Object objValue = this._get(DTOFIELD_IPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddrDirty() {
        return this._contains(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public void resetIpAddr() {
        this._reset(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO ipaddr(String ipAddr) {
        this.setIpAddr(ipAddr);
        return this;
    }

    @JsonProperty(value="ipaddr2")
    public void setIpAddr2(String ipAddr2) {
        this._set(DTOFIELD_IPADDR2, ipAddr2);
    }

    @JsonIgnore
    public String getIpAddr2() {
        Object objValue = this._get(DTOFIELD_IPADDR2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddr2Dirty() {
        return this._contains(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public void resetIpAddr2() {
        this._reset(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO ipaddr2(String ipAddr2) {
        this.setIpAddr2(ipAddr2);
        return this;
    }

    @JsonProperty(value="maxcpu")
    public void setMaxCPU(Double maxCPU) {
        this._set(DTOFIELD_MAXCPU, maxCPU);
    }

    @JsonIgnore
    public Double getMaxCPU() {
        Object objValue = this._get(DTOFIELD_MAXCPU);
        if (objValue == null) return null;
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isMaxCPUDirty() {
        return this._contains(DTOFIELD_MAXCPU);
    }

    @JsonIgnore
    public void resetMaxCPU() {
        this._reset(DTOFIELD_MAXCPU);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO maxcpu(Double maxCPU) {
        this.setMaxCPU(maxCPU);
        return this;
    }

    @JsonProperty(value="maxmem")
    public void setMaxMem(Double maxMem) {
        this._set(DTOFIELD_MAXMEM, maxMem);
        this._set(FIELD_MAXMEM, maxMem);
    }

    @JsonIgnore
    public Double getMaxMem() {
        Object objValue = this._get(DTOFIELD_MAXMEM);
        if (objValue == null) objValue = this._get(FIELD_MAXMEM);
        if (objValue == null) return null;
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isMaxMemDirty() {
        return this._contains(DTOFIELD_MAXMEM) || this._contains(FIELD_MAXMEM);
    }

    @JsonIgnore
    public void resetMaxMem() {
        this._reset(DTOFIELD_MAXMEM);
        this._reset(FIELD_MAXMEM);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO maxmem(Double maxMem) {
        this.setMaxMem(maxMem);
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
    public PSDCMSPlatformNodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mincpu")
    public void setMinCPU(Double minCPU) {
        this._set(DTOFIELD_MINCPU, minCPU);
    }

    @JsonIgnore
    public Double getMinCPU() {
        Object objValue = this._get(DTOFIELD_MINCPU);
        if (objValue == null) return null;
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isMinCPUDirty() {
        return this._contains(DTOFIELD_MINCPU);
    }

    @JsonIgnore
    public void resetMinCPU() {
        this._reset(DTOFIELD_MINCPU);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO mincpu(Double minCPU) {
        this.setMinCPU(minCPU);
        return this;
    }

    @JsonProperty(value="minmem")
    public void setMinMem(Double minMem) {
        this._set(DTOFIELD_MINMEM, minMem);
        this._set(FIELD_MINMEM, minMem);
    }

    @JsonIgnore
    public Double getMinMem() {
        Object objValue = this._get(DTOFIELD_MINMEM);
        if (objValue == null) objValue = this._get(FIELD_MINMEM);
        if (objValue == null) return null;
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isMinMemDirty() {
        return this._contains(DTOFIELD_MINMEM) || this._contains(FIELD_MINMEM);
    }

    @JsonIgnore
    public void resetMinMem() {
        this._reset(DTOFIELD_MINMEM);
        this._reset(FIELD_MINMEM);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO minmem(Double minMem) {
        this.setMinMem(minMem);
        return this;
    }

    @JsonProperty(value="nodeinfo")
    public void setNodeInfo(String nodeInfo) {
        this._set(DTOFIELD_NODEINFO, nodeInfo);
    }

    @JsonIgnore
    public String getNodeInfo() {
        Object objValue = this._get(DTOFIELD_NODEINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeInfoDirty() {
        return this._contains(DTOFIELD_NODEINFO);
    }

    @JsonIgnore
    public void resetNodeInfo() {
        this._reset(DTOFIELD_NODEINFO);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodeinfo(String nodeInfo) {
        this.setNodeInfo(nodeInfo);
        return this;
    }

    @JsonProperty(value="nodestate")
    public void setNodeState(String nodeState) {
        this._set(DTOFIELD_NODESTATE, nodeState);
    }

    @JsonIgnore
    public String getNodeState() {
        Object objValue = this._get(DTOFIELD_NODESTATE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeStateDirty() {
        return this._contains(DTOFIELD_NODESTATE);
    }

    @JsonIgnore
    public void resetNodeState() {
        this._reset(DTOFIELD_NODESTATE);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodestate(String nodeState) {
        this.setNodeState(nodeState);
        return this;
    }

    @JsonProperty(value="nodetag")
    public void setNodeTag(String nodeTag) {
        this._set(DTOFIELD_NODETAG, nodeTag);
    }

    @JsonIgnore
    public String getNodeTag() {
        Object objValue = this._get(DTOFIELD_NODETAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTagDirty() {
        return this._contains(DTOFIELD_NODETAG);
    }

    @JsonIgnore
    public void resetNodeTag() {
        this._reset(DTOFIELD_NODETAG);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodetag(String nodeTag) {
        this.setNodeTag(nodeTag);
        return this;
    }

    @JsonProperty(value="nodetag2")
    public void setNodeTag2(String nodeTag2) {
        this._set(DTOFIELD_NODETAG2, nodeTag2);
    }

    @JsonIgnore
    public String getNodeTag2() {
        Object objValue = this._get(DTOFIELD_NODETAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTag2Dirty() {
        return this._contains(DTOFIELD_NODETAG2);
    }

    @JsonIgnore
    public void resetNodeTag2() {
        this._reset(DTOFIELD_NODETAG2);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO nodetag2(String nodeTag2) {
        this.setNodeTag2(nodeTag2);
        return this;
    }

    @JsonProperty(value="passwd")
    public void setPasswd(String passwd) {
        this._set(DTOFIELD_PASSWD, passwd);
    }

    @JsonIgnore
    public String getPasswd() {
        Object objValue = this._get(DTOFIELD_PASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswdDirty() {
        return this._contains(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public void resetPasswd() {
        this._reset(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO passwd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    @JsonProperty(value="port")
    public void setPort(Integer port) {
        this._set(DTOFIELD_PORT, port);
    }

    @JsonIgnore
    public Integer getPort() {
        Object objValue = this._get(DTOFIELD_PORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPortDirty() {
        return this._contains(DTOFIELD_PORT);
    }

    @JsonIgnore
    public void resetPort() {
        this._reset(DTOFIELD_PORT);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO port(Integer port) {
        this.setPort(port);
        return this;
    }

    @JsonProperty(value="port2")
    public void setPort2(Integer port2) {
        this._set(DTOFIELD_PORT2, port2);
    }

    @JsonIgnore
    public Integer getPort2() {
        Object objValue = this._get(DTOFIELD_PORT2);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPort2Dirty() {
        return this._contains(DTOFIELD_PORT2);
    }

    @JsonIgnore
    public void resetPort2() {
        this._reset(DTOFIELD_PORT2);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO port2(Integer port2) {
        this.setPort2(port2);
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
    public PSDCMSPlatformNodeDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcmsplatformid(PSDCMSPlatformDTO pSDCMSPlatform) {
        if (pSDCMSPlatform == null) {
            this.setPSDCMSPlatformId(null);
            this.setPSDCMSPlatformName(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDCMSPlatformId(pSDCMSPlatform.getPSDCMSPlatformId());
            this.setPSDCMSPlatformName(pSDCMSPlatform.getPSDCMSPlatformName());
            this.setPSDevSlnId(pSDCMSPlatform.getPSDevSlnId());
            this.setPSDevSlnName(pSDCMSPlatform.getPSDevSlnName());
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
    public PSDCMSPlatformNodeDTO psdcmsplatformname(String pSDCMSPlatformName) {
        this.setPSDCMSPlatformName(pSDCMSPlatformName);
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
    public PSDCMSPlatformNodeDTO psdcmsplatformnodeid(String pSDCMSPlatformNodeId) {
        this.setPSDCMSPlatformNodeId(pSDCMSPlatformNodeId);
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
    public PSDCMSPlatformNodeDTO psdcmsplatformnodename(String pSDCMSPlatformNodeName) {
        this.setPSDCMSPlatformNodeName(pSDCMSPlatformNodeName);
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
    public PSDCMSPlatformNodeDTO psdcregistryitemid(String pSDCRegistryItemId) {
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO psdcregistryitemid(PSDCRegistryItemDTO pSDCRegistryItem) {
        if (pSDCRegistryItem == null) {
            this.setDCRegistryItemTag(null);
            this.setDCRegistryItemTag2(null);
            this.setDCRegistryItemTag3(null);
            this.setDCRegistryItemTag4(null);
            this.setPSDCRegistryItemId(null);
            this.setPSDCRegistryItemName(null);
        } else {
            this.setDCRegistryItemTag(pSDCRegistryItem.getItemTag());
            this.setDCRegistryItemTag2(pSDCRegistryItem.getItemTag2());
            this.setDCRegistryItemTag3(pSDCRegistryItem.getItemTag3());
            this.setDCRegistryItemTag4(pSDCRegistryItem.getItemTag4());
            this.setPSDCRegistryItemId(pSDCRegistryItem.getPSDCRegistryItemId());
            this.setPSDCRegistryItemName(pSDCRegistryItem.getPSDCRegistryItemName());
        }
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
    public PSDCMSPlatformNodeDTO psdcregistryitemname(String pSDCRegistryItemName) {
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
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
    public PSDCMSPlatformNodeDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDCMSPlatformNodeDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psmsplatformnodeid")
    public void setPSMSPlatformNodeId(String pSMSPlatformNodeId) {
        this._set(DTOFIELD_PSMSPLATFORMNODEID, pSMSPlatformNodeId);
    }

    @JsonIgnore
    public String getPSMSPlatformNodeId() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMNODEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformNodeIdDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMNODEID);
    }

    @JsonIgnore
    public void resetPSMSPlatformNodeId() {
        this._reset(DTOFIELD_PSMSPLATFORMNODEID);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO psmsplatformnodeid(String pSMSPlatformNodeId) {
        this.setPSMSPlatformNodeId(pSMSPlatformNodeId);
        return this;
    }

    @JsonProperty(value="psmsplatformnodename")
    public void setPSMSPlatformNodeName(String pSMSPlatformNodeName) {
        this._set(DTOFIELD_PSMSPLATFORMNODENAME, pSMSPlatformNodeName);
    }

    @JsonIgnore
    public String getPSMSPlatformNodeName() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMNODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformNodeNameDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public void resetPSMSPlatformNodeName() {
        this._reset(DTOFIELD_PSMSPLATFORMNODENAME);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO psmsplatformnodename(String pSMSPlatformNodeName) {
        this.setPSMSPlatformNodeName(pSMSPlatformNodeName);
        return this;
    }

    @JsonProperty(value="refcount")
    public void setRefCount(Integer refCount) {
        this._set(DTOFIELD_REFCOUNT, refCount);
    }

    @JsonIgnore
    public Integer getRefCount() {
        Object objValue = this._get(DTOFIELD_REFCOUNT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefCountDirty() {
        return this._contains(DTOFIELD_REFCOUNT);
    }

    @JsonIgnore
    public void resetRefCount() {
        this._reset(DTOFIELD_REFCOUNT);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO refcount(Integer refCount) {
        this.setRefCount(refCount);
        return this;
    }

    @JsonProperty(value="refinfo")
    public void setRefInfo(String refInfo) {
        this._set(DTOFIELD_REFINFO, refInfo);
    }

    @JsonIgnore
    public String getRefInfo() {
        Object objValue = this._get(DTOFIELD_REFINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefInfoDirty() {
        return this._contains(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public void resetRefInfo() {
        this._reset(DTOFIELD_REFINFO);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO refinfo(String refInfo) {
        this.setRefInfo(refInfo);
        return this;
    }

    @JsonProperty(value="replicated")
    public void setReplicated(Integer replicated) {
        this._set(DTOFIELD_REPLICATED, replicated);
    }

    @JsonIgnore
    public Integer getReplicated() {
        Object objValue = this._get(DTOFIELD_REPLICATED);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReplicatedDirty() {
        return this._contains(DTOFIELD_REPLICATED);
    }

    @JsonIgnore
    public void resetReplicated() {
        this._reset(DTOFIELD_REPLICATED);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO replicated(Integer replicated) {
        this.setReplicated(replicated);
        return this;
    }

    @JsonProperty(value="scale")
    public void setScale(Integer scale) {
        this._set(DTOFIELD_SCALE, scale);
    }

    @JsonIgnore
    public Integer getScale() {
        Object objValue = this._get(DTOFIELD_SCALE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isScaleDirty() {
        return this._contains(DTOFIELD_SCALE);
    }

    @JsonIgnore
    public void resetScale() {
        this._reset(DTOFIELD_SCALE);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO scale(Integer scale) {
        this.setScale(scale);
        return this;
    }

    @JsonProperty(value="serviceid")
    public void setServiceId(String serviceId) {
        this._set(DTOFIELD_SERVICEID, serviceId);
    }

    @JsonIgnore
    public String getServiceId() {
        Object objValue = this._get(DTOFIELD_SERVICEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceIdDirty() {
        return this._contains(DTOFIELD_SERVICEID);
    }

    @JsonIgnore
    public void resetServiceId() {
        this._reset(DTOFIELD_SERVICEID);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO serviceid(String serviceId) {
        this.setServiceId(serviceId);
        return this;
    }

    @JsonProperty(value="servicename")
    public void setServiceName(String serviceName) {
        this._set(DTOFIELD_SERVICENAME, serviceName);
    }

    @JsonIgnore
    public String getServiceName() {
        Object objValue = this._get(DTOFIELD_SERVICENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceNameDirty() {
        return this._contains(DTOFIELD_SERVICENAME);
    }

    @JsonIgnore
    public void resetServiceName() {
        this._reset(DTOFIELD_SERVICENAME);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO servicename(String serviceName) {
        this.setServiceName(serviceName);
        return this;
    }

    @JsonProperty(value="serviceurl")
    public void setServiceUrl(String serviceUrl) {
        this._set(DTOFIELD_SERVICEURL, serviceUrl);
    }

    @JsonIgnore
    public String getServiceUrl() {
        Object objValue = this._get(DTOFIELD_SERVICEURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceUrlDirty() {
        return this._contains(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public void resetServiceUrl() {
        this._reset(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO serviceurl(String serviceUrl) {
        this.setServiceUrl(serviceUrl);
        return this;
    }

    @JsonProperty(value="sshipaddr")
    public void setSSHIPAddr(String sSHIPAddr) {
        this._set(DTOFIELD_SSHIPADDR, sSHIPAddr);
    }

    @JsonIgnore
    public String getSSHIPAddr() {
        Object objValue = this._get(DTOFIELD_SSHIPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSSHIPAddrDirty() {
        return this._contains(DTOFIELD_SSHIPADDR);
    }

    @JsonIgnore
    public void resetSSHIPAddr() {
        this._reset(DTOFIELD_SSHIPADDR);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO sshipaddr(String sSHIPAddr) {
        this.setSSHIPAddr(sSHIPAddr);
        return this;
    }

    @JsonProperty(value="sshport")
    public void setSSHPort(Integer sSHPort) {
        this._set(DTOFIELD_SSHPORT, sSHPort);
    }

    @JsonIgnore
    public Integer getSSHPort() {
        Object objValue = this._get(DTOFIELD_SSHPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSSHPortDirty() {
        return this._contains(DTOFIELD_SSHPORT);
    }

    @JsonIgnore
    public void resetSSHPort() {
        this._reset(DTOFIELD_SSHPORT);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO sshport(Integer sSHPort) {
        this.setSSHPort(sSHPort);
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
    public PSDCMSPlatformNodeDTO updatedate(Timestamp updateDate) {
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
    public PSDCMSPlatformNodeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="uploadfilemode")
    public void setUploadFileMode(String uploadFileMode) {
        this._set(DTOFIELD_UPLOADFILEMODE, uploadFileMode);
    }

    @JsonIgnore
    public String getUploadFileMode() {
        Object objValue = this._get(DTOFIELD_UPLOADFILEMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUploadFileModeDirty() {
        return this._contains(DTOFIELD_UPLOADFILEMODE);
    }

    @JsonIgnore
    public void resetUploadFileMode() {
        this._reset(DTOFIELD_UPLOADFILEMODE);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO uploadfilemode(String uploadFileMode) {
        this.setUploadFileMode(uploadFileMode);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO uploadfilemode(PSModelEnums.FileUploadMode uploadFileMode) {
        this.setUploadFileMode(uploadFileMode == null ? null : uploadFileMode.value);
        return this;
    }

    @JsonProperty(value="uploadpath")
    public void setUploadPath(String uploadPath) {
        this._set(DTOFIELD_UPLOADPATH, uploadPath);
    }

    @JsonIgnore
    public String getUploadPath() {
        Object objValue = this._get(DTOFIELD_UPLOADPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUploadPathDirty() {
        return this._contains(DTOFIELD_UPLOADPATH);
    }

    @JsonIgnore
    public void resetUploadPath() {
        this._reset(DTOFIELD_UPLOADPATH);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO uploadpath(String uploadPath) {
        this.setUploadPath(uploadPath);
        return this;
    }

    @JsonProperty(value="username")
    public void setUserName(String userName) {
        this._set(DTOFIELD_USERNAME, userName);
    }

    @JsonIgnore
    public String getUserName() {
        Object objValue = this._get(DTOFIELD_USERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserNameDirty() {
        return this._contains(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public void resetUserName() {
        this._reset(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO username(String userName) {
        this.setUserName(userName);
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
    public PSDCMSPlatformNodeDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDCMSPlatformNodeDTO usertag(String userTag) {
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
    public PSDCMSPlatformNodeDTO usertag2(String userTag2) {
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
    public PSDCMSPlatformNodeDTO usertag3(String userTag3) {
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
    public PSDCMSPlatformNodeDTO usertag4(String userTag4) {
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
    public PSDCMSPlatformNodeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="workshoppath")
    public void setWorkshopPath(String workshopPath) {
        this._set(DTOFIELD_WORKSHOPPATH, workshopPath);
    }

    @JsonIgnore
    public String getWorkshopPath() {
        Object objValue = this._get(DTOFIELD_WORKSHOPPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkshopPathDirty() {
        return this._contains(DTOFIELD_WORKSHOPPATH);
    }

    @JsonIgnore
    public void resetWorkshopPath() {
        this._reset(DTOFIELD_WORKSHOPPATH);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO workshoppath(String workshopPath) {
        this.setWorkshopPath(workshopPath);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCMSPlatformNodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCMSPlatformNodeName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO name(String strName) {
        this.setPSDCMSPlatformNodeName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCMSPlatformNodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCMSPlatformNodeId(strValue);
    }

    @JsonIgnore
    public PSDCMSPlatformNodeDTO id(String strValue) {
        this.setPSDCMSPlatformNodeId(strValue);
        return this;
    }

}
