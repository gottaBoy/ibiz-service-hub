package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysSrvDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysRefDTO
extends PSModelDTOBase {
    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DCDOMAINNAME = "DCDOMAINNAME";
    protected static final String DTOFIELD_DCDOMAINNAME = "dcdomainname";
    public static final String FIELD_DEVSLNCODENAME = "DEVSLNCODENAME";
    protected static final String DTOFIELD_DEVSLNCODENAME = "devslncodename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSSRVID = "PSDEVSLNSYSSRVID";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";
    public static final String FIELD_PSDEVSLNSYSSRVNAME = "PSDEVSLNSYSSRVNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";
    public static final String FIELD_PSSUBSYSID = "PSSUBSYSID";
    protected static final String DTOFIELD_PSSUBSYSID = "pssubsysid";
    public static final String FIELD_PSSUBSYSNAME = "PSSUBSYSNAME";
    protected static final String DTOFIELD_PSSUBSYSNAME = "pssubsysname";
    public static final String FIELD_PSSYSREFID = "PSSYSREFID";
    protected static final String DTOFIELD_PSSYSREFID = "pssysrefid";
    public static final String FIELD_PSSYSREFNAME = "PSSYSREFNAME";
    protected static final String DTOFIELD_PSSYSREFNAME = "pssysrefname";
    public static final String FIELD_REALSYSID = "REALSYSID";
    protected static final String DTOFIELD_REALSYSID = "realsysid";
    public static final String FIELD_REFPARAM = "REFPARAM";
    protected static final String DTOFIELD_REFPARAM = "refparam";
    public static final String FIELD_REFPARAM2 = "REFPARAM2";
    protected static final String DTOFIELD_REFPARAM2 = "refparam2";
    public static final String FIELD_REFPARAMS = "REFPARAMS";
    protected static final String DTOFIELD_REFPARAMS = "refparams";
    public static final String FIELD_SFFWFLAG = "SFFWFLAG";
    protected static final String DTOFIELD_SFFWFLAG = "sffwflag";
    public static final String FIELD_SRVCODENAME = "SRVCODENAME";
    protected static final String DTOFIELD_SRVCODENAME = "srvcodename";
    public static final String FIELD_SYSCODENAME = "SYSCODENAME";
    protected static final String DTOFIELD_SYSCODENAME = "syscodename";
    public static final String FIELD_SYSNAME = "SYSNAME";
    protected static final String DTOFIELD_SYSNAME = "sysname";
    public static final String FIELD_SYSPKGNAME = "SYSPKGNAME";
    protected static final String DTOFIELD_SYSPKGNAME = "syspkgname";
    public static final String FIELD_SYSREFTYPE = "SYSREFTYPE";
    protected static final String DTOFIELD_SYSREFTYPE = "sysreftype";
    public static final String FIELD_SYSVCNAME = "SYSVCNAME";
    protected static final String DTOFIELD_SYSVCNAME = "sysvcname";
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
    public static final String FIELD_VERSION = "VERSION";
    protected static final String DTOFIELD_VERSION = "version";

    @JsonProperty(value="clspkgparams")
    public void setClsPkgParams(String clsPkgParams) {
        this._set(DTOFIELD_CLSPKGPARAMS, clsPkgParams);
    }

    @JsonIgnore
    public String getClsPkgParams() {
        Object objValue = this._get(DTOFIELD_CLSPKGPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPkgParamsDirty() {
        return this._contains(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public void resetClsPkgParams() {
        this._reset(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public PSSysRefDTO clspkgparams(String clsPkgParams) {
        this.setClsPkgParams(clsPkgParams);
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
    public PSSysRefDTO createdate(Timestamp createDate) {
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
    public PSSysRefDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dcdomainname")
    public void setDCDomainName(String dCDomainName) {
        this._set(DTOFIELD_DCDOMAINNAME, dCDomainName);
    }

    @JsonIgnore
    public String getDCDomainName() {
        Object objValue = this._get(DTOFIELD_DCDOMAINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCDomainNameDirty() {
        return this._contains(DTOFIELD_DCDOMAINNAME);
    }

    @JsonIgnore
    public void resetDCDomainName() {
        this._reset(DTOFIELD_DCDOMAINNAME);
    }

    @JsonIgnore
    public PSSysRefDTO dcdomainname(String dCDomainName) {
        this.setDCDomainName(dCDomainName);
        return this;
    }

    @JsonProperty(value="devslncodename")
    public void setDevSlnCodeName(String devSlnCodeName) {
        this._set(DTOFIELD_DEVSLNCODENAME, devSlnCodeName);
    }

    @JsonIgnore
    public String getDevSlnCodeName() {
        Object objValue = this._get(DTOFIELD_DEVSLNCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDevSlnCodeNameDirty() {
        return this._contains(DTOFIELD_DEVSLNCODENAME);
    }

    @JsonIgnore
    public void resetDevSlnCodeName() {
        this._reset(DTOFIELD_DEVSLNCODENAME);
    }

    @JsonIgnore
    public PSSysRefDTO devslncodename(String devSlnCodeName) {
        this.setDevSlnCodeName(devSlnCodeName);
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
    public PSSysRefDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSSysRefDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysRefDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysRefDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvid")
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvId() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public PSSysRefDTO psdevslnsyssrvid(String pSDevSlnSysSrvId) {
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO psdevslnsyssrvid(PSDevSlnSysSrvDTO pSDevSlnSysSrv) {
        if (pSDevSlnSysSrv == null) {
            this.setPSDevSlnSysSrvId(null);
            this.setPSDevSlnSysSrvName(null);
        } else {
            this.setPSDevSlnSysSrvId(pSDevSlnSysSrv.getPSDevSlnSysSrvId());
            this.setPSDevSlnSysSrvName(pSDevSlnSysSrv.getPSDevSlnSysSrvName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvname")
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvName() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public PSSysRefDTO psdevslnsyssrvname(String pSDevSlnSysSrvName) {
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    @JsonProperty(value="pssubsysid")
    public void setPSSubSysId(String pSSubSysId) {
        this._set(DTOFIELD_PSSUBSYSID, pSSubSysId);
    }

    @JsonIgnore
    public String getPSSubSysId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSID);
    }

    @JsonIgnore
    public void resetPSSubSysId() {
        this._reset(DTOFIELD_PSSUBSYSID);
    }

    @JsonIgnore
    public PSSysRefDTO pssubsysid(String pSSubSysId) {
        this.setPSSubSysId(pSSubSysId);
        return this;
    }

    @JsonProperty(value="pssubsysname")
    public void setPSSubSysName(String pSSubSysName) {
        this._set(DTOFIELD_PSSUBSYSNAME, pSSubSysName);
    }

    @JsonIgnore
    public String getPSSubSysName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSNAME);
    }

    @JsonIgnore
    public void resetPSSubSysName() {
        this._reset(DTOFIELD_PSSUBSYSNAME);
    }

    @JsonIgnore
    public PSSysRefDTO pssubsysname(String pSSubSysName) {
        this.setPSSubSysName(pSSubSysName);
        return this;
    }

    @JsonProperty(value="pssysrefid")
    public void setPSSysRefId(String pSSysRefId) {
        this._set(DTOFIELD_PSSYSREFID, pSSysRefId);
    }

    @JsonIgnore
    public String getPSSysRefId() {
        Object objValue = this._get(DTOFIELD_PSSYSREFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRefIdDirty() {
        return this._contains(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public void resetPSSysRefId() {
        this._reset(DTOFIELD_PSSYSREFID);
    }

    @JsonIgnore
    public PSSysRefDTO pssysrefid(String pSSysRefId) {
        this.setPSSysRefId(pSSysRefId);
        return this;
    }

    @JsonProperty(value="pssysrefname")
    public void setPSSysRefName(String pSSysRefName) {
        this._set(DTOFIELD_PSSYSREFNAME, pSSysRefName);
    }

    @JsonIgnore
    public String getPSSysRefName() {
        Object objValue = this._get(DTOFIELD_PSSYSREFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysRefNameDirty() {
        return this._contains(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public void resetPSSysRefName() {
        this._reset(DTOFIELD_PSSYSREFNAME);
    }

    @JsonIgnore
    public PSSysRefDTO pssysrefname(String pSSysRefName) {
        this.setPSSysRefName(pSSysRefName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysRefName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysRefName(strName);
    }

    @JsonIgnore
    public PSSysRefDTO name(String strName) {
        this.setPSSysRefName(strName);
        return this;
    }

    @JsonProperty(value="realsysid")
    public void setRealSysId(String realSysId) {
        this._set(DTOFIELD_REALSYSID, realSysId);
    }

    @JsonIgnore
    public String getRealSysId() {
        Object objValue = this._get(DTOFIELD_REALSYSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRealSysIdDirty() {
        return this._contains(DTOFIELD_REALSYSID);
    }

    @JsonIgnore
    public void resetRealSysId() {
        this._reset(DTOFIELD_REALSYSID);
    }

    @JsonIgnore
    public PSSysRefDTO realsysid(String realSysId) {
        this.setRealSysId(realSysId);
        return this;
    }

    @JsonProperty(value="refparam")
    public void setRefParam(String refParam) {
        this._set(DTOFIELD_REFPARAM, refParam);
    }

    @JsonIgnore
    public String getRefParam() {
        Object objValue = this._get(DTOFIELD_REFPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamDirty() {
        return this._contains(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public void resetRefParam() {
        this._reset(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public PSSysRefDTO refparam(String refParam) {
        this.setRefParam(refParam);
        return this;
    }

    @JsonProperty(value="refparam2")
    public void setRefParam2(String refParam2) {
        this._set(DTOFIELD_REFPARAM2, refParam2);
    }

    @JsonIgnore
    public String getRefParam2() {
        Object objValue = this._get(DTOFIELD_REFPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParam2Dirty() {
        return this._contains(DTOFIELD_REFPARAM2);
    }

    @JsonIgnore
    public void resetRefParam2() {
        this._reset(DTOFIELD_REFPARAM2);
    }

    @JsonIgnore
    public PSSysRefDTO refparam2(String refParam2) {
        this.setRefParam2(refParam2);
        return this;
    }

    @JsonProperty(value="refparams")
    public void setRefParams(String refParams) {
        this._set(DTOFIELD_REFPARAMS, refParams);
    }

    @JsonIgnore
    public String getRefParams() {
        Object objValue = this._get(DTOFIELD_REFPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamsDirty() {
        return this._contains(DTOFIELD_REFPARAMS);
    }

    @JsonIgnore
    public void resetRefParams() {
        this._reset(DTOFIELD_REFPARAMS);
    }

    @JsonIgnore
    public PSSysRefDTO refparams(String refParams) {
        this.setRefParams(refParams);
        return this;
    }

    @JsonProperty(value="sffwflag")
    public void setSFFWFlag(Integer sFFWFlag) {
        this._set(DTOFIELD_SFFWFLAG, sFFWFlag);
    }

    @JsonIgnore
    public Integer getSFFWFlag() {
        Object objValue = this._get(DTOFIELD_SFFWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSFFWFlagDirty() {
        return this._contains(DTOFIELD_SFFWFLAG);
    }

    @JsonIgnore
    public void resetSFFWFlag() {
        this._reset(DTOFIELD_SFFWFLAG);
    }

    @JsonIgnore
    public PSSysRefDTO sffwflag(Integer sFFWFlag) {
        this.setSFFWFlag(sFFWFlag);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO sffwflag(Boolean sFFWFlag) {
        if (sFFWFlag == null) {
            this.setSFFWFlag(null);
        } else {
            this.setSFFWFlag(sFFWFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="srvcodename")
    public void setSrvCodeName(String srvCodeName) {
        this._set(DTOFIELD_SRVCODENAME, srvCodeName);
    }

    @JsonIgnore
    public String getSrvCodeName() {
        Object objValue = this._get(DTOFIELD_SRVCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrvCodeNameDirty() {
        return this._contains(DTOFIELD_SRVCODENAME);
    }

    @JsonIgnore
    public void resetSrvCodeName() {
        this._reset(DTOFIELD_SRVCODENAME);
    }

    @JsonIgnore
    public PSSysRefDTO srvcodename(String srvCodeName) {
        this.setSrvCodeName(srvCodeName);
        return this;
    }

    @JsonProperty(value="syscodename")
    public void setSysCodeName(String sysCodeName) {
        this._set(DTOFIELD_SYSCODENAME, sysCodeName);
    }

    @JsonIgnore
    public String getSysCodeName() {
        Object objValue = this._get(DTOFIELD_SYSCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysCodeNameDirty() {
        return this._contains(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public void resetSysCodeName() {
        this._reset(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public PSSysRefDTO syscodename(String sysCodeName) {
        this.setSysCodeName(sysCodeName);
        return this;
    }

    @JsonProperty(value="sysname")
    public void setSysName(String sysName) {
        this._set(DTOFIELD_SYSNAME, sysName);
    }

    @JsonIgnore
    public String getSysName() {
        Object objValue = this._get(DTOFIELD_SYSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysNameDirty() {
        return this._contains(DTOFIELD_SYSNAME);
    }

    @JsonIgnore
    public void resetSysName() {
        this._reset(DTOFIELD_SYSNAME);
    }

    @JsonIgnore
    public PSSysRefDTO sysname(String sysName) {
        this.setSysName(sysName);
        return this;
    }

    @JsonProperty(value="syspkgname")
    public void setSysPkgName(String sysPkgName) {
        this._set(DTOFIELD_SYSPKGNAME, sysPkgName);
    }

    @JsonIgnore
    public String getSysPkgName() {
        Object objValue = this._get(DTOFIELD_SYSPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysPkgNameDirty() {
        return this._contains(DTOFIELD_SYSPKGNAME);
    }

    @JsonIgnore
    public void resetSysPkgName() {
        this._reset(DTOFIELD_SYSPKGNAME);
    }

    @JsonIgnore
    public PSSysRefDTO syspkgname(String sysPkgName) {
        this.setSysPkgName(sysPkgName);
        return this;
    }

    @JsonProperty(value="sysreftype")
    public void setSysRefType(String sysRefType) {
        this._set(DTOFIELD_SYSREFTYPE, sysRefType);
    }

    @JsonIgnore
    public String getSysRefType() {
        Object objValue = this._get(DTOFIELD_SYSREFTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysRefTypeDirty() {
        return this._contains(DTOFIELD_SYSREFTYPE);
    }

    @JsonIgnore
    public void resetSysRefType() {
        this._reset(DTOFIELD_SYSREFTYPE);
    }

    @JsonIgnore
    public PSSysRefDTO sysreftype(String sysRefType) {
        this.setSysRefType(sysRefType);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO sysreftype(PSModelEnums.SysRefType sysRefType) {
        if (sysRefType == null) {
            this.setSysRefType(null);
        } else {
            this.setSysRefType(sysRefType.value);
        }
        return this;
    }

    @JsonProperty(value="sysvcname")
    public void setSysVCName(String sysVCName) {
        this._set(DTOFIELD_SYSVCNAME, sysVCName);
    }

    @JsonIgnore
    public String getSysVCName() {
        Object objValue = this._get(DTOFIELD_SYSVCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysVCNameDirty() {
        return this._contains(DTOFIELD_SYSVCNAME);
    }

    @JsonIgnore
    public void resetSysVCName() {
        this._reset(DTOFIELD_SYSVCNAME);
    }

    @JsonIgnore
    public PSSysRefDTO sysvcname(String sysVCName) {
        this.setSysVCName(sysVCName);
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
    public PSSysRefDTO updatedate(Timestamp updateDate) {
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
    public PSSysRefDTO updateman(String updateMan) {
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
    public PSSysRefDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
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
    public PSSysRefDTO usertag(String userTag) {
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
    public PSSysRefDTO usertag2(String userTag2) {
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
    public PSSysRefDTO usertag3(String userTag3) {
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
    public PSSysRefDTO usertag4(String userTag4) {
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
    public PSSysRefDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysRefDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="version")
    public void setVersion(Integer version) {
        this._set(DTOFIELD_VERSION, version);
    }

    @JsonIgnore
    public Integer getVersion() {
        Object objValue = this._get(DTOFIELD_VERSION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isVersionDirty() {
        return this._contains(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public void resetVersion() {
        this._reset(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public PSSysRefDTO version(Integer version) {
        this.setVersion(version);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysRefId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysRefId(strValue);
    }

    @JsonIgnore
    public PSSysRefDTO id(String strValue) {
        this.setPSSysRefId(strValue);
        return this;
    }
}
