package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MATCHFLAG = "MATCHFLAG";
    protected static final String DTOFIELD_MATCHFLAG = "matchflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSDBDETAILID = "PSSYSDBDETAILID";
    protected static final String DTOFIELD_PSSYSDBDETAILID = "pssysdbdetailid";
    public static final String FIELD_PSSYSDBDETAILNAME = "PSSYSDBDETAILNAME";
    protected static final String DTOFIELD_PSSYSDBDETAILNAME = "pssysdbdetailname";
    public static final String FIELD_PSSYSTEMDBCFGID = "PSSYSTEMDBCFGID";
    protected static final String DTOFIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";
    public static final String FIELD_PSSYSTEMDBCFGNAME = "PSSYSTEMDBCFGNAME";
    protected static final String DTOFIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";
    public static final String FIELD_PUBDBVER = "PUBDBVER";
    protected static final String DTOFIELD_PUBDBVER = "pubdbver";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSSysDBDetailDTO createdate(Timestamp createDate) {
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
    public PSSysDBDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="matchflag")
    public void setMatchFlag(Integer matchFlag) {
        this._set(DTOFIELD_MATCHFLAG, matchFlag);
    }

    @JsonIgnore
    public Integer getMatchFlag() {
        Object objValue = this._get(DTOFIELD_MATCHFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMatchFlagDirty() {
        return this._contains(DTOFIELD_MATCHFLAG);
    }

    @JsonIgnore
    public void resetMatchFlag() {
        this._reset(DTOFIELD_MATCHFLAG);
    }

    @JsonIgnore
    public PSSysDBDetailDTO matchflag(Integer matchFlag) {
        this.setMatchFlag(matchFlag);
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
    public PSSysDBDetailDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEIdDirty() {
        return this._contains(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public void resetPSDEId() {
        this._reset(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public PSSysDBDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysDBDetailDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysDBDetailDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysdbdetailid")
    public void setPSSysDBDetailId(String pSSysDBDetailId) {
        this._set(DTOFIELD_PSSYSDBDETAILID, pSSysDBDetailId);
    }

    @JsonIgnore
    public String getPSSysDBDetailId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBDetailIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBDETAILID);
    }

    @JsonIgnore
    public void resetPSSysDBDetailId() {
        this._reset(DTOFIELD_PSSYSDBDETAILID);
    }

    @JsonIgnore
    public PSSysDBDetailDTO pssysdbdetailid(String pSSysDBDetailId) {
        this.setPSSysDBDetailId(pSSysDBDetailId);
        return this;
    }

    @JsonProperty(value="pssysdbdetailname")
    public void setPSSysDBDetailName(String pSSysDBDetailName) {
        this._set(DTOFIELD_PSSYSDBDETAILNAME, pSSysDBDetailName);
    }

    @JsonIgnore
    public String getPSSysDBDetailName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBDetailNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBDETAILNAME);
    }

    @JsonIgnore
    public void resetPSSysDBDetailName() {
        this._reset(DTOFIELD_PSSYSDBDETAILNAME);
    }

    @JsonIgnore
    public PSSysDBDetailDTO pssysdbdetailname(String pSSysDBDetailName) {
        this.setPSSysDBDetailName(pSSysDBDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBDetailName(strName);
    }

    @JsonIgnore
    public PSSysDBDetailDTO name(String strName) {
        this.setPSSysDBDetailName(strName);
        return this;
    }

    @JsonProperty(value="pssystemdbcfgid")
    public void setPSSystemDBCfgId(String pSSystemDBCfgId) {
        this._set(DTOFIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }

    @JsonIgnore
    public String getPSSystemDBCfgId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMDBCFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMDBCFGID);
    }

    @JsonIgnore
    public void resetPSSystemDBCfgId() {
        this._reset(DTOFIELD_PSSYSTEMDBCFGID);
    }

    @JsonIgnore
    public PSSysDBDetailDTO pssystemdbcfgid(String pSSystemDBCfgId) {
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    @JsonIgnore
    public PSSysDBDetailDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg) {
        if (pSSystemDBCfg == null) {
            this.setPSSystemDBCfgId(null);
            this.setPSSystemDBCfgName(null);
        } else {
            this.setPSSystemDBCfgId(pSSystemDBCfg.getPSSystemDBCfgId());
            this.setPSSystemDBCfgName(pSSystemDBCfg.getPSSystemDBCfgName());
        }
        return this;
    }

    @JsonProperty(value="pssystemdbcfgname")
    public void setPSSystemDBCfgName(String pSSystemDBCfgName) {
        this._set(DTOFIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }

    @JsonIgnore
    public String getPSSystemDBCfgName() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMDBCFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemDBCfgNameDirty() {
        return this._contains(DTOFIELD_PSSYSTEMDBCFGNAME);
    }

    @JsonIgnore
    public void resetPSSystemDBCfgName() {
        this._reset(DTOFIELD_PSSYSTEMDBCFGNAME);
    }

    @JsonIgnore
    public PSSysDBDetailDTO pssystemdbcfgname(String pSSystemDBCfgName) {
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    @JsonProperty(value="pubdbver")
    public void setPubDBVer(Integer pubDBVer) {
        this._set(DTOFIELD_PUBDBVER, pubDBVer);
    }

    @JsonIgnore
    public Integer getPubDBVer() {
        Object objValue = this._get(DTOFIELD_PUBDBVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubDBVerDirty() {
        return this._contains(DTOFIELD_PUBDBVER);
    }

    @JsonIgnore
    public void resetPubDBVer() {
        this._reset(DTOFIELD_PUBDBVER);
    }

    @JsonIgnore
    public PSSysDBDetailDTO pubdbver(Integer pubDBVer) {
        this.setPubDBVer(pubDBVer);
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
    public PSSysDBDetailDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBDetailDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBDetailId(strValue);
    }

    @JsonIgnore
    public PSSysDBDetailDTO id(String strValue) {
        this.setPSSysDBDetailId(strValue);
        return this;
    }
}
