package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCMSPlatformFuncDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FUNCPARAM = "FUNCPARAM";
    protected static final String DTOFIELD_FUNCPARAM = "funcparam";
    public static final String FIELD_FUNCPARAM10 = "FUNCPARAM10";
    protected static final String DTOFIELD_FUNCPARAM10 = "funcparam10";
    public static final String FIELD_FUNCPARAM2 = "FUNCPARAM2";
    protected static final String DTOFIELD_FUNCPARAM2 = "funcparam2";
    public static final String FIELD_FUNCPARAM3 = "FUNCPARAM3";
    protected static final String DTOFIELD_FUNCPARAM3 = "funcparam3";
    public static final String FIELD_FUNCPARAM4 = "FUNCPARAM4";
    protected static final String DTOFIELD_FUNCPARAM4 = "funcparam4";
    public static final String FIELD_FUNCPARAM5 = "FUNCPARAM5";
    protected static final String DTOFIELD_FUNCPARAM5 = "funcparam5";
    public static final String FIELD_FUNCPARAM6 = "FUNCPARAM6";
    protected static final String DTOFIELD_FUNCPARAM6 = "funcparam6";
    public static final String FIELD_FUNCPARAM7 = "FUNCPARAM7";
    protected static final String DTOFIELD_FUNCPARAM7 = "funcparam7";
    public static final String FIELD_FUNCPARAM8 = "FUNCPARAM8";
    protected static final String DTOFIELD_FUNCPARAM8 = "funcparam8";
    public static final String FIELD_FUNCPARAM9 = "FUNCPARAM9";
    protected static final String DTOFIELD_FUNCPARAM9 = "funcparam9";
    public static final String FIELD_FUNCPARAMS = "FUNCPARAMS";
    protected static final String DTOFIELD_FUNCPARAMS = "funcparams";
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
    public static final String FIELD_MSFUNCTYPE = "MSFUNCTYPE";
    protected static final String DTOFIELD_MSFUNCTYPE = "msfunctype";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
    public static final String FIELD_PSDCMSPLATFORMFUNCID = "PSDCMSPLATFORMFUNCID";
    protected static final String DTOFIELD_PSDCMSPLATFORMFUNCID = "psdcmsplatformfuncid";
    public static final String FIELD_PSDCMSPLATFORMFUNCNAME = "PSDCMSPLATFORMFUNCNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMFUNCNAME = "psdcmsplatformfuncname";
    public static final String FIELD_PSDCMSPLATFORMID = "PSDCMSPLATFORMID";
    protected static final String DTOFIELD_PSDCMSPLATFORMID = "psdcmsplatformid";
    public static final String FIELD_PSDCMSPLATFORMNAME = "PSDCMSPLATFORMNAME";
    protected static final String DTOFIELD_PSDCMSPLATFORMNAME = "psdcmsplatformname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSMSPLATFORMFUNCID = "PSMSPLATFORMFUNCID";
    protected static final String DTOFIELD_PSMSPLATFORMFUNCID = "psmsplatformfuncid";
    public static final String FIELD_PSMSPLATFORMFUNCNAME = "PSMSPLATFORMFUNCNAME";
    protected static final String DTOFIELD_PSMSPLATFORMFUNCNAME = "psmsplatformfuncname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_WORKSHOPPATH = "WORKSHOPPATH";
    protected static final String DTOFIELD_WORKSHOPPATH = "workshoppath";

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
    public PSDCMSPlatformFuncDTO createdate(Timestamp createDate) {
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
    public PSDCMSPlatformFuncDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="funcparam")
    public void setFuncParam(String funcParam) {
        this._set(DTOFIELD_FUNCPARAM, funcParam);
    }

    @JsonIgnore
    public String getFuncParam() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParamDirty() {
        return this._contains(DTOFIELD_FUNCPARAM);
    }

    @JsonIgnore
    public void resetFuncParam() {
        this._reset(DTOFIELD_FUNCPARAM);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam(String funcParam) {
        this.setFuncParam(funcParam);
        return this;
    }

    @JsonProperty(value="funcparam10")
    public void setFuncParam10(String funcParam10) {
        this._set(DTOFIELD_FUNCPARAM10, funcParam10);
    }

    @JsonIgnore
    public String getFuncParam10() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM10);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam10Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM10);
    }

    @JsonIgnore
    public void resetFuncParam10() {
        this._reset(DTOFIELD_FUNCPARAM10);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam10(String funcParam10) {
        this.setFuncParam10(funcParam10);
        return this;
    }

    @JsonProperty(value="funcparam2")
    public void setFuncParam2(String funcParam2) {
        this._set(DTOFIELD_FUNCPARAM2, funcParam2);
    }

    @JsonIgnore
    public String getFuncParam2() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam2Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM2);
    }

    @JsonIgnore
    public void resetFuncParam2() {
        this._reset(DTOFIELD_FUNCPARAM2);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam2(String funcParam2) {
        this.setFuncParam2(funcParam2);
        return this;
    }

    @JsonProperty(value="funcparam3")
    public void setFuncParam3(String funcParam3) {
        this._set(DTOFIELD_FUNCPARAM3, funcParam3);
    }

    @JsonIgnore
    public String getFuncParam3() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam3Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM3);
    }

    @JsonIgnore
    public void resetFuncParam3() {
        this._reset(DTOFIELD_FUNCPARAM3);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam3(String funcParam3) {
        this.setFuncParam3(funcParam3);
        return this;
    }

    @JsonProperty(value="funcparam4")
    public void setFuncParam4(String funcParam4) {
        this._set(DTOFIELD_FUNCPARAM4, funcParam4);
    }

    @JsonIgnore
    public String getFuncParam4() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam4Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM4);
    }

    @JsonIgnore
    public void resetFuncParam4() {
        this._reset(DTOFIELD_FUNCPARAM4);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam4(String funcParam4) {
        this.setFuncParam4(funcParam4);
        return this;
    }

    @JsonProperty(value="funcparam5")
    public void setFuncParam5(Integer funcParam5) {
        this._set(DTOFIELD_FUNCPARAM5, funcParam5);
    }

    @JsonIgnore
    public Integer getFuncParam5() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM5);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam5Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM5);
    }

    @JsonIgnore
    public void resetFuncParam5() {
        this._reset(DTOFIELD_FUNCPARAM5);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam5(Integer funcParam5) {
        this.setFuncParam5(funcParam5);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam5(Boolean funcParam5) {
        this.setFuncParam5(funcParam5 == null ? null : (funcParam5 ? 1 : 0));
        return this;
    }

    @JsonProperty(value="funcparam6")
    public void setFuncParam6(Integer funcParam6) {
        this._set(DTOFIELD_FUNCPARAM6, funcParam6);
    }

    @JsonIgnore
    public Integer getFuncParam6() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM6);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam6Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM6);
    }

    @JsonIgnore
    public void resetFuncParam6() {
        this._reset(DTOFIELD_FUNCPARAM6);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam6(Integer funcParam6) {
        this.setFuncParam6(funcParam6);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam6(Boolean funcParam6) {
        this.setFuncParam6(funcParam6 == null ? null : (funcParam6 ? 1 : 0));
        return this;
    }

    @JsonProperty(value="funcparam7")
    public void setFuncParam7(Integer funcParam7) {
        this._set(DTOFIELD_FUNCPARAM7, funcParam7);
    }

    @JsonIgnore
    public Integer getFuncParam7() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM7);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam7Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM7);
    }

    @JsonIgnore
    public void resetFuncParam7() {
        this._reset(DTOFIELD_FUNCPARAM7);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam7(Integer funcParam7) {
        this.setFuncParam7(funcParam7);
        return this;
    }

    @JsonProperty(value="funcparam8")
    public void setFuncParam8(Integer funcParam8) {
        this._set(DTOFIELD_FUNCPARAM8, funcParam8);
    }

    @JsonIgnore
    public Integer getFuncParam8() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM8);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam8Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM8);
    }

    @JsonIgnore
    public void resetFuncParam8() {
        this._reset(DTOFIELD_FUNCPARAM8);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam8(Integer funcParam8) {
        this.setFuncParam8(funcParam8);
        return this;
    }

    @JsonProperty(value="funcparam9")
    public void setFuncParam9(String funcParam9) {
        this._set(DTOFIELD_FUNCPARAM9, funcParam9);
    }

    @JsonIgnore
    public String getFuncParam9() {
        Object objValue = this._get(DTOFIELD_FUNCPARAM9);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParam9Dirty() {
        return this._contains(DTOFIELD_FUNCPARAM9);
    }

    @JsonIgnore
    public void resetFuncParam9() {
        this._reset(DTOFIELD_FUNCPARAM9);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparam9(String funcParam9) {
        this.setFuncParam9(funcParam9);
        return this;
    }

    @JsonProperty(value="funcparams")
    public void setFuncParams(String funcParams) {
        this._set(DTOFIELD_FUNCPARAMS, funcParams);
    }

    @JsonIgnore
    public String getFuncParams() {
        Object objValue = this._get(DTOFIELD_FUNCPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncParamsDirty() {
        return this._contains(DTOFIELD_FUNCPARAMS);
    }

    @JsonIgnore
    public void resetFuncParams() {
        this._reset(DTOFIELD_FUNCPARAMS);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO funcparams(String funcParams) {
        this.setFuncParams(funcParams);
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
    public PSDCMSPlatformFuncDTO ipaddr(String ipAddr) {
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
    public PSDCMSPlatformFuncDTO ipaddr2(String ipAddr2) {
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
    public PSDCMSPlatformFuncDTO maxcpu(Double maxCPU) {
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
    public PSDCMSPlatformFuncDTO maxmem(Double maxMem) {
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
    public PSDCMSPlatformFuncDTO memo(String memo) {
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
    public PSDCMSPlatformFuncDTO mincpu(Double minCPU) {
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
    public PSDCMSPlatformFuncDTO minmem(Double minMem) {
        this.setMinMem(minMem);
        return this;
    }

    @JsonProperty(value="msfunctype")
    public void setMSFuncType(String mSFuncType) {
        this._set(DTOFIELD_MSFUNCTYPE, mSFuncType);
    }

    @JsonIgnore
    public String getMSFuncType() {
        Object objValue = this._get(DTOFIELD_MSFUNCTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSFuncTypeDirty() {
        return this._contains(DTOFIELD_MSFUNCTYPE);
    }

    @JsonIgnore
    public void resetMSFuncType() {
        this._reset(DTOFIELD_MSFUNCTYPE);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO msfunctype(String mSFuncType) {
        this.setMSFuncType(mSFuncType);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO msfunctype(PSModelEnums.MSPlatformFuncType mSFuncType) {
        this.setMSFuncType(mSFuncType == null ? null : mSFuncType.value);
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
    public PSDCMSPlatformFuncDTO passwd(String passwd) {
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
    public PSDCMSPlatformFuncDTO port(Integer port) {
        this.setPort(port);
        return this;
    }

    @JsonProperty(value="psdcmsplatformfuncid")
    public void setPSDCMSPlatformFuncId(String pSDCMSPlatformFuncId) {
        this._set(DTOFIELD_PSDCMSPLATFORMFUNCID, pSDCMSPlatformFuncId);
    }

    @JsonIgnore
    public String getPSDCMSPlatformFuncId() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMFUNCID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformFuncIdDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformFuncId() {
        this._reset(DTOFIELD_PSDCMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformfuncid(String pSDCMSPlatformFuncId) {
        this.setPSDCMSPlatformFuncId(pSDCMSPlatformFuncId);
        return this;
    }

    @JsonProperty(value="psdcmsplatformfuncname")
    public void setPSDCMSPlatformFuncName(String pSDCMSPlatformFuncName) {
        this._set(DTOFIELD_PSDCMSPLATFORMFUNCNAME, pSDCMSPlatformFuncName);
    }

    @JsonIgnore
    public String getPSDCMSPlatformFuncName() {
        Object objValue = this._get(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCMSPlatformFuncNameDirty() {
        return this._contains(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public void resetPSDCMSPlatformFuncName() {
        this._reset(DTOFIELD_PSDCMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformfuncname(String pSDCMSPlatformFuncName) {
        this.setPSDCMSPlatformFuncName(pSDCMSPlatformFuncName);
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
    public PSDCMSPlatformFuncDTO psdcmsplatformid(String pSDCMSPlatformId) {
        this.setPSDCMSPlatformId(pSDCMSPlatformId);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO psdcmsplatformid(PSDCMSPlatformDTO pSDCMSPlatform) {
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
    public PSDCMSPlatformFuncDTO psdcmsplatformname(String pSDCMSPlatformName) {
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
    public PSDCMSPlatformFuncDTO psdevslnid(String pSDevSlnId) {
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
    public PSDCMSPlatformFuncDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psmsplatformfuncid")
    public void setPSMSPlatformFuncId(String pSMSPlatformFuncId) {
        this._set(DTOFIELD_PSMSPLATFORMFUNCID, pSMSPlatformFuncId);
    }

    @JsonIgnore
    public String getPSMSPlatformFuncId() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMFUNCID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformFuncIdDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public void resetPSMSPlatformFuncId() {
        this._reset(DTOFIELD_PSMSPLATFORMFUNCID);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO psmsplatformfuncid(String pSMSPlatformFuncId) {
        this.setPSMSPlatformFuncId(pSMSPlatformFuncId);
        return this;
    }

    @JsonProperty(value="psmsplatformfuncname")
    public void setPSMSPlatformFuncName(String pSMSPlatformFuncName) {
        this._set(DTOFIELD_PSMSPLATFORMFUNCNAME, pSMSPlatformFuncName);
    }

    @JsonIgnore
    public String getPSMSPlatformFuncName() {
        Object objValue = this._get(DTOFIELD_PSMSPLATFORMFUNCNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMSPlatformFuncNameDirty() {
        return this._contains(DTOFIELD_PSMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public void resetPSMSPlatformFuncName() {
        this._reset(DTOFIELD_PSMSPLATFORMFUNCNAME);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO psmsplatformfuncname(String pSMSPlatformFuncName) {
        this.setPSMSPlatformFuncName(pSMSPlatformFuncName);
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
    public PSDCMSPlatformFuncDTO serviceurl(String serviceUrl) {
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
    public PSDCMSPlatformFuncDTO sshipaddr(String sSHIPAddr) {
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
    public PSDCMSPlatformFuncDTO sshport(Integer sSHPort) {
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
    public PSDCMSPlatformFuncDTO updatedate(Timestamp updateDate) {
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
    public PSDCMSPlatformFuncDTO updateman(String updateMan) {
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
    public PSDCMSPlatformFuncDTO uploadfilemode(String uploadFileMode) {
        this.setUploadFileMode(uploadFileMode);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO uploadfilemode(PSModelEnums.FileUploadMode uploadFileMode) {
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
    public PSDCMSPlatformFuncDTO uploadpath(String uploadPath) {
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
    public PSDCMSPlatformFuncDTO username(String userName) {
        this.setUserName(userName);
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
    public PSDCMSPlatformFuncDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO validflag(Boolean validFlag) {
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
    public PSDCMSPlatformFuncDTO workshoppath(String workshopPath) {
        this.setWorkshopPath(workshopPath);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCMSPlatformFuncName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCMSPlatformFuncName(strName);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO name(String strName) {
        this.setPSDCMSPlatformFuncName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCMSPlatformFuncId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCMSPlatformFuncId(strValue);
    }

    @JsonIgnore
    public PSDCMSPlatformFuncDTO id(String strValue) {
        this.setPSDCMSPlatformFuncId(strValue);
        return this;
    }

}
