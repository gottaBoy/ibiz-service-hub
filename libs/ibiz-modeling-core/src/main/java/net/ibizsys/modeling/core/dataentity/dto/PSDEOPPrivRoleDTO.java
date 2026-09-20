package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEOPPrivRoleDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_FILTERMODEL = "FILTERMODEL";
    protected static final String DTOFIELD_FILTERMODEL = "filtermodel";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDEOPPRIVROLEID = "PSDEOPPRIVROLEID";
    protected static final String DTOFIELD_PSDEOPPRIVROLEID = "psdeopprivroleid";
    public static final String FIELD_PSDEOPPRIVROLENAME = "PSDEOPPRIVROLENAME";
    protected static final String DTOFIELD_PSDEOPPRIVROLENAME = "psdeopprivrolename";
    public static final String FIELD_PSDEUSERROLEID = "PSDEUSERROLEID";
    protected static final String DTOFIELD_PSDEUSERROLEID = "psdeuserroleid";
    public static final String FIELD_PSDEUSERROLENAME = "PSDEUSERROLENAME";
    protected static final String DTOFIELD_PSDEUSERROLENAME = "psdeuserrolename";
    public static final String FIELD_PSSYSUSERROLEID = "PSSYSOPPRIVID";
    protected static final String DTOFIELD_PSSYSUSERROLEID = "pssysuserroleid";
    public static final String FIELD_PSSYSUSERROLENAME = "PSSYSOPPRIVNAME";
    protected static final String DTOFIELD_PSSYSUSERROLENAME = "pssysuserrolename";
    public static final String FIELD_ROLETYPE = "ROLETYPE";
    protected static final String DTOFIELD_ROLETYPE = "roletype";
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
    public PSDEOPPrivRoleDTO createdate(Timestamp createDate) {
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
    public PSDEOPPrivRoleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="filtermodel")
    public void setFilterModel(String filterModel) {
        this._set(DTOFIELD_FILTERMODEL, filterModel);
    }

    @JsonIgnore
    public String getFilterModel() {
        Object objValue = this._get(DTOFIELD_FILTERMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterModelDirty() {
        return this._contains(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public void resetFilterModel() {
        this._reset(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO filtermodel(String filterModel) {
        this.setFilterModel(filterModel);
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
    public PSDEOPPrivRoleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdedqid")
    public void setPSDEDQId(String pSDEDQId) {
        this._set(DTOFIELD_PSDEDQID, pSDEDQId);
    }

    @JsonIgnore
    public String getPSDEDQId() {
        Object objValue = this._get(DTOFIELD_PSDEDQID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQIdDirty() {
        return this._contains(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public void resetPSDEDQId() {
        this._reset(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedqname")
    public void setPSDEDQName(String pSDEDQName) {
        this._set(DTOFIELD_PSDEDQNAME, pSDEDQName);
    }

    @JsonIgnore
    public String getPSDEDQName() {
        Object objValue = this._get(DTOFIELD_PSDEDQNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQNameDirty() {
        return this._contains(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public void resetPSDEDQName() {
        this._reset(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
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
    public PSDEOPPrivRoleDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEOPPrivRoleDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="psdeopprivroleid")
    public void setPSDEOPPrivRoleId(String pSDEOPPrivRoleId) {
        this._set(DTOFIELD_PSDEOPPRIVROLEID, pSDEOPPrivRoleId);
    }

    @JsonIgnore
    public String getPSDEOPPrivRoleId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivRoleIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVROLEID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivRoleId() {
        this._reset(DTOFIELD_PSDEOPPRIVROLEID);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivroleid(String pSDEOPPrivRoleId) {
        this.setPSDEOPPrivRoleId(pSDEOPPrivRoleId);
        return this;
    }

    @JsonProperty(value="psdeopprivrolename")
    public void setPSDEOPPrivRoleName(String pSDEOPPrivRoleName) {
        this._set(DTOFIELD_PSDEOPPRIVROLENAME, pSDEOPPrivRoleName);
    }

    @JsonIgnore
    public String getPSDEOPPrivRoleName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivRoleNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVROLENAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivRoleName() {
        this._reset(DTOFIELD_PSDEOPPRIVROLENAME);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivrolename(String pSDEOPPrivRoleName) {
        this.setPSDEOPPrivRoleName(pSDEOPPrivRoleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEOPPrivRoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEOPPrivRoleName(strName);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO name(String strName) {
        this.setPSDEOPPrivRoleName(strName);
        return this;
    }

    @JsonProperty(value="psdeuserroleid")
    public void setPSDEUserRoleId(String pSDEUserRoleId) {
        this._set(DTOFIELD_PSDEUSERROLEID, pSDEUserRoleId);
    }

    @JsonIgnore
    public String getPSDEUserRoleId() {
        Object objValue = this._get(DTOFIELD_PSDEUSERROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUserRoleIdDirty() {
        return this._contains(DTOFIELD_PSDEUSERROLEID);
    }

    @JsonIgnore
    public void resetPSDEUserRoleId() {
        this._reset(DTOFIELD_PSDEUSERROLEID);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeuserroleid(String pSDEUserRoleId) {
        this.setPSDEUserRoleId(pSDEUserRoleId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeuserroleid(PSDEUserRoleDTO pSDEUserRole) {
        if (pSDEUserRole == null) {
            this.setPSDEUserRoleId(null);
            this.setPSDEUserRoleName(null);
        } else {
            this.setPSDEUserRoleId(pSDEUserRole.getPSDEUserRoleId());
            this.setPSDEUserRoleName(pSDEUserRole.getPSDEUserRoleName());
        }
        return this;
    }

    @JsonProperty(value="psdeuserrolename")
    public void setPSDEUserRoleName(String pSDEUserRoleName) {
        this._set(DTOFIELD_PSDEUSERROLENAME, pSDEUserRoleName);
    }

    @JsonIgnore
    public String getPSDEUserRoleName() {
        Object objValue = this._get(DTOFIELD_PSDEUSERROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUserRoleNameDirty() {
        return this._contains(DTOFIELD_PSDEUSERROLENAME);
    }

    @JsonIgnore
    public void resetPSDEUserRoleName() {
        this._reset(DTOFIELD_PSDEUSERROLENAME);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeuserrolename(String pSDEUserRoleName) {
        this.setPSDEUserRoleName(pSDEUserRoleName);
        return this;
    }

    @JsonProperty(value="pssysuserroleid")
    public void setPSSysUserRoleId(String pSSysUserRoleId) {
        this._set(DTOFIELD_PSSYSUSERROLEID, pSSysUserRoleId);
        this._set(FIELD_PSSYSUSERROLEID, pSSysUserRoleId);
    }

    @JsonIgnore
    public String getPSSysUserRoleId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLEID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSERROLEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleIdDirty() {
        if (this._contains(DTOFIELD_PSSYSUSERROLEID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSERROLEID);
    }

    @JsonIgnore
    public void resetPSSysUserRoleId() {
        this._reset(DTOFIELD_PSSYSUSERROLEID);
        this._reset(FIELD_PSSYSUSERROLEID);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO pssysuserroleid(String pSSysUserRoleId) {
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO pssysuserroleid(PSSysUserRoleDTO pSSysUserRole) {
        if (pSSysUserRole == null) {
            this.setPSSysUserRoleId(null);
            this.setPSSysUserRoleName(null);
        } else {
            this.setPSSysUserRoleId(pSSysUserRole.getPSSysUserRoleId());
            this.setPSSysUserRoleName(pSSysUserRole.getPSSysUserRoleName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivId() {
        return this.getPSSysUserRoleId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysOPPrivId(String pSSysOPPrivId) {
        this.setPSSysUserRoleId(pSSysOPPrivId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivIdDirty() {
        return this.isPSSysUserRoleIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivId() {
        this.resetPSSysUserRoleId();
    }

    @JsonProperty(value="pssysuserrolename")
    public void setPSSysUserRoleName(String pSSysUserRoleName) {
        this._set(DTOFIELD_PSSYSUSERROLENAME, pSSysUserRoleName);
        this._set(FIELD_PSSYSUSERROLENAME, pSSysUserRoleName);
    }

    @JsonIgnore
    public String getPSSysUserRoleName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSERROLENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleNameDirty() {
        if (this._contains(DTOFIELD_PSSYSUSERROLENAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSERROLENAME);
    }

    @JsonIgnore
    public void resetPSSysUserRoleName() {
        this._reset(DTOFIELD_PSSYSUSERROLENAME);
        this._reset(FIELD_PSSYSUSERROLENAME);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO pssysuserrolename(String pSSysUserRoleName) {
        this.setPSSysUserRoleName(pSSysUserRoleName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivName() {
        return this.getPSSysUserRoleName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysOPPrivName(String pSSysOPPrivName) {
        this.setPSSysUserRoleName(pSSysOPPrivName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivNameDirty() {
        return this.isPSSysUserRoleNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivName() {
        this.resetPSSysUserRoleName();
    }

    @JsonProperty(value="roletype")
    public void setRoleType(String roleType) {
        this._set(DTOFIELD_ROLETYPE, roleType);
    }

    @JsonIgnore
    public String getRoleType() {
        Object objValue = this._get(DTOFIELD_ROLETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRoleTypeDirty() {
        return this._contains(DTOFIELD_ROLETYPE);
    }

    @JsonIgnore
    public void resetRoleType() {
        this._reset(DTOFIELD_ROLETYPE);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO roletype(String roleType) {
        this.setRoleType(roleType);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO roletype(PSModelEnums.DEOPPrivRoleType roleType) {
        if (roleType == null) {
            this.setRoleType(null);
        } else {
            this.setRoleType(roleType.value);
        }
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
    public PSDEOPPrivRoleDTO updatedate(Timestamp updateDate) {
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
    public PSDEOPPrivRoleDTO updateman(String updateMan) {
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
    public PSDEOPPrivRoleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEOPPrivRoleDTO usertag(String userTag) {
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
    public PSDEOPPrivRoleDTO usertag2(String userTag2) {
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
    public PSDEOPPrivRoleDTO usertag3(String userTag3) {
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
    public PSDEOPPrivRoleDTO usertag4(String userTag4) {
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
    public PSDEOPPrivRoleDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEOPPrivRoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEOPPrivRoleId(strValue);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO id(String strValue) {
        this.setPSDEOPPrivRoleId(strValue);
        return this;
    }
}
