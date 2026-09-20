package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnUserDTO extends PSModelDTOBase {
    public static final String FIELD_ACCMODE = "ACCMODE";
    protected static final String DTOFIELD_ACCMODE = "accmode";
    public static final String FIELD_ALLSYSFLAG = "ALLSYSFLAG";
    protected static final String DTOFIELD_ALLSYSFLAG = "allsysflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DEVUSEROBJTYPE = "DEVUSEROBJTYPE";
    protected static final String DTOFIELD_DEVUSEROBJTYPE = "devuserobjtype";
    public static final String FIELD_EXPIREDTIME = "EXPIREDTIME";
    protected static final String DTOFIELD_EXPIREDTIME = "expiredtime";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSDYNAINSTID = "PSDEVSLNSYSDYNAINSTID";
    protected static final String DTOFIELD_PSDEVSLNSYSDYNAINSTID = "psdevslnsysdynainstid";
    public static final String FIELD_PSDEVSLNSYSDYNAINSTNAME = "PSDEVSLNSYSDYNAINSTNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSDYNAINSTNAME = "psdevslnsysdynainstname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNTEMPLID = "PSDEVSLNTEMPLID";
    protected static final String DTOFIELD_PSDEVSLNTEMPLID = "psdevslntemplid";
    public static final String FIELD_PSDEVSLNTEMPLNAME = "PSDEVSLNTEMPLNAME";
    protected static final String DTOFIELD_PSDEVSLNTEMPLNAME = "psdevslntemplname";
    public static final String FIELD_PSDEVSLNUSERID = "PSDEVSLNUSERID";
    protected static final String DTOFIELD_PSDEVSLNUSERID = "psdevslnuserid";
    public static final String FIELD_PSDEVSLNUSERNAME = "PSDEVSLNUSERNAME";
    protected static final String DTOFIELD_PSDEVSLNUSERNAME = "psdevslnusername";
    public static final String FIELD_PSDEVUSEROBJID = "PSDEVUSEROBJID";
    protected static final String DTOFIELD_PSDEVUSEROBJID = "psdevuserobjid";
    public static final String FIELD_PSDEVUSEROBJNAME = "PSDEVUSEROBJNAME";
    protected static final String DTOFIELD_PSDEVUSEROBJNAME = "psdevuserobjname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="accmode")
    public void setAccMode(Integer accMode) {
        this._set(DTOFIELD_ACCMODE, accMode);
    }

    @JsonIgnore
    public Integer getAccMode() {
        Object objValue = this._get(DTOFIELD_ACCMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAccModeDirty() {
        return this._contains(DTOFIELD_ACCMODE);
    }

    @JsonIgnore
    public void resetAccMode() {
        this._reset(DTOFIELD_ACCMODE);
    }

    @JsonIgnore
    public PSDevSlnUserDTO accmode(Integer accMode) {
        this.setAccMode(accMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO accmode(PSModelEnums.DevSlnAccMode accMode) {
        this.setAccMode(accMode == null ? null : accMode.value);
        return this;
    }

    @JsonProperty(value="allsysflag")
    public void setAllSysFlag(Integer allSysFlag) {
        this._set(DTOFIELD_ALLSYSFLAG, allSysFlag);
    }

    @JsonIgnore
    public Integer getAllSysFlag() {
        Object objValue = this._get(DTOFIELD_ALLSYSFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllSysFlagDirty() {
        return this._contains(DTOFIELD_ALLSYSFLAG);
    }

    @JsonIgnore
    public void resetAllSysFlag() {
        this._reset(DTOFIELD_ALLSYSFLAG);
    }

    @JsonIgnore
    public PSDevSlnUserDTO allsysflag(Integer allSysFlag) {
        this.setAllSysFlag(allSysFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO allsysflag(PSModelEnums.DevSlnUserTarget allSysFlag) {
        this.setAllSysFlag(allSysFlag == null ? null : allSysFlag.value);
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
    public PSDevSlnUserDTO createdate(Timestamp createDate) {
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
    public PSDevSlnUserDTO createman(String createMan) {
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
    public PSDevSlnUserDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO defaultflag(Boolean defaultFlag) {
        this.setDefaultFlag(defaultFlag == null ? null : (defaultFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="devuserobjtype")
    public void setDevUserObjType(String devUserObjType) {
        this._set(DTOFIELD_DEVUSEROBJTYPE, devUserObjType);
    }

    @JsonIgnore
    public String getDevUserObjType() {
        Object objValue = this._get(DTOFIELD_DEVUSEROBJTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDevUserObjTypeDirty() {
        return this._contains(DTOFIELD_DEVUSEROBJTYPE);
    }

    @JsonIgnore
    public void resetDevUserObjType() {
        this._reset(DTOFIELD_DEVUSEROBJTYPE);
    }

    @JsonIgnore
    public PSDevSlnUserDTO devuserobjtype(String devUserObjType) {
        this.setDevUserObjType(devUserObjType);
        return this;
    }

    @JsonProperty(value="expiredtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpiredTime(Timestamp expiredTime) {
        this._set(DTOFIELD_EXPIREDTIME, expiredTime);
    }

    @JsonIgnore
    public Timestamp getExpiredTime() {
        Object objValue = this._get(DTOFIELD_EXPIREDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpiredTimeDirty() {
        return this._contains(DTOFIELD_EXPIREDTIME);
    }

    @JsonIgnore
    public void resetExpiredTime() {
        this._reset(DTOFIELD_EXPIREDTIME);
    }

    @JsonIgnore
    public PSDevSlnUserDTO expiredtime(Timestamp expiredTime) {
        this.setExpiredTime(expiredTime);
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
    public PSDevSlnUserDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDevSlnUserDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDevSlnUserDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysdynainstid")
    public void setPSDevSlnSysDynaInstId(String pSDevSlnSysDynaInstId) {
        this._set(DTOFIELD_PSDEVSLNSYSDYNAINSTID, pSDevSlnSysDynaInstId);
    }

    @JsonIgnore
    public String getPSDevSlnSysDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDynaInstId() {
        this._reset(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysdynainstid(String pSDevSlnSysDynaInstId) {
        this.setPSDevSlnSysDynaInstId(pSDevSlnSysDynaInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysdynainstid(PSDevSlnSysDynaInstDTO pSDevSlnSysDynaInst) {
        if (pSDevSlnSysDynaInst == null) {
            this.setPSDevSlnSysDynaInstId(null);
            this.setPSDevSlnSysDynaInstName(null);
        } else {
            this.setPSDevSlnSysDynaInstId(pSDevSlnSysDynaInst.getPSDevSlnSysDynaInstId());
            this.setPSDevSlnSysDynaInstName(pSDevSlnSysDynaInst.getPSDevSlnSysDynaInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysdynainstname")
    public void setPSDevSlnSysDynaInstName(String pSDevSlnSysDynaInstName) {
        this._set(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME, pSDevSlnSysDynaInstName);
    }

    @JsonIgnore
    public String getPSDevSlnSysDynaInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDynaInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDynaInstName() {
        this._reset(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysdynainstname(String pSDevSlnSysDynaInstName) {
        this.setPSDevSlnSysDynaInstName(pSDevSlnSysDynaInstName);
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
    public PSDevSlnUserDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
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
    public PSDevSlnUserDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslntemplid")
    public void setPSDevSlnTemplId(String pSDevSlnTemplId) {
        this._set(DTOFIELD_PSDEVSLNTEMPLID, pSDevSlnTemplId);
    }

    @JsonIgnore
    public String getPSDevSlnTemplId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplId() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslntemplid(String pSDevSlnTemplId) {
        this.setPSDevSlnTemplId(pSDevSlnTemplId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslntemplid(PSDevSlnTemplDTO pSDevSlnTempl) {
        if (pSDevSlnTempl == null) {
            this.setPSDevSlnTemplId(null);
            this.setPSDevSlnTemplName(null);
        } else {
            this.setPSDevSlnTemplId(pSDevSlnTempl.getPSDevSlnTemplId());
            this.setPSDevSlnTemplName(pSDevSlnTempl.getPSDevSlnTemplName());
        }
        return this;
    }

    @JsonProperty(value="psdevslntemplname")
    public void setPSDevSlnTemplName(String pSDevSlnTemplName) {
        this._set(DTOFIELD_PSDEVSLNTEMPLNAME, pSDevSlnTemplName);
    }

    @JsonIgnore
    public String getPSDevSlnTemplName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnTemplNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnTemplName() {
        this._reset(DTOFIELD_PSDEVSLNTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslntemplname(String pSDevSlnTemplName) {
        this.setPSDevSlnTemplName(pSDevSlnTemplName);
        return this;
    }

    @JsonProperty(value="psdevslnuserid")
    public void setPSDevSlnUserId(String pSDevSlnUserId) {
        this._set(DTOFIELD_PSDEVSLNUSERID, pSDevSlnUserId);
    }

    @JsonIgnore
    public String getPSDevSlnUserId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNUSERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnUserIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNUSERID);
    }

    @JsonIgnore
    public void resetPSDevSlnUserId() {
        this._reset(DTOFIELD_PSDEVSLNUSERID);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnuserid(String pSDevSlnUserId) {
        this.setPSDevSlnUserId(pSDevSlnUserId);
        return this;
    }

    @JsonProperty(value="psdevslnusername")
    public void setPSDevSlnUserName(String pSDevSlnUserName) {
        this._set(DTOFIELD_PSDEVSLNUSERNAME, pSDevSlnUserName);
    }

    @JsonIgnore
    public String getPSDevSlnUserName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnUserNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNUSERNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnUserName() {
        this._reset(DTOFIELD_PSDEVSLNUSERNAME);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevslnusername(String pSDevSlnUserName) {
        this.setPSDevSlnUserName(pSDevSlnUserName);
        return this;
    }

    @JsonProperty(value="psdevuserobjid")
    public void setPSDevUserObjId(String pSDevUserObjId) {
        this._set(DTOFIELD_PSDEVUSEROBJID, pSDevUserObjId);
    }

    @JsonIgnore
    public String getPSDevUserObjId() {
        Object objValue = this._get(DTOFIELD_PSDEVUSEROBJID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevUserObjIdDirty() {
        return this._contains(DTOFIELD_PSDEVUSEROBJID);
    }

    @JsonIgnore
    public void resetPSDevUserObjId() {
        this._reset(DTOFIELD_PSDEVUSEROBJID);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevuserobjid(String pSDevUserObjId) {
        this.setPSDevUserObjId(pSDevUserObjId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevuserobjid(PSDevUserObjDTO pSDevUserObj) {
        if (pSDevUserObj == null) {
            this.setDevUserObjType(null);
            this.setPSDevUserObjId(null);
            this.setPSDevUserObjName(null);
        } else {
            this.setDevUserObjType(pSDevUserObj.getPSDevUserObjType());
            this.setPSDevUserObjId(pSDevUserObj.getPSDevUserObjectId());
            this.setPSDevUserObjName(pSDevUserObj.getPSDevUserObjName());
        }
        return this;
    }

    @JsonProperty(value="psdevuserobjname")
    public void setPSDevUserObjName(String pSDevUserObjName) {
        this._set(DTOFIELD_PSDEVUSEROBJNAME, pSDevUserObjName);
    }

    @JsonIgnore
    public String getPSDevUserObjName() {
        Object objValue = this._get(DTOFIELD_PSDEVUSEROBJNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevUserObjNameDirty() {
        return this._contains(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public void resetPSDevUserObjName() {
        this._reset(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public PSDevSlnUserDTO psdevuserobjname(String pSDevUserObjName) {
        this.setPSDevUserObjName(pSDevUserObjName);
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
    public PSDevSlnUserDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnUserDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnUserName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnUserName(strName);
    }

    @JsonIgnore
    public PSDevSlnUserDTO name(String strName) {
        this.setPSDevSlnUserName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnUserId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnUserId(strValue);
    }

    @JsonIgnore
    public PSDevSlnUserDTO id(String strValue) {
        this.setPSDevSlnUserId(strValue);
        return this;
    }

}
