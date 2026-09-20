package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUserRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUserRoleDataDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUSERROLEID = "PSDEUSERROLEID";
    protected static final String DTOFIELD_PSDEUSERROLEID = "psdeuserroleid";
    public static final String FIELD_PSDEUSERROLENAME = "PSDEUSERROLENAME";
    protected static final String DTOFIELD_PSDEUSERROLENAME = "psdeuserrolename";
    public static final String FIELD_PSSYSUSERROLEID = "PSSYSOPPRIVID";
    protected static final String DTOFIELD_PSSYSUSERROLEID = "pssysuserroleid";
    public static final String FIELD_PSSYSUSERROLENAME = "PSSYSOPPRIVNAME";
    protected static final String DTOFIELD_PSSYSUSERROLENAME = "pssysuserrolename";
    public static final String FIELD_PSSYSUSERROLEDATAID = "PSSYSUSERROLEDATAID";
    protected static final String DTOFIELD_PSSYSUSERROLEDATAID = "pssysuserroledataid";
    public static final String FIELD_PSSYSUSERROLEDATANAME = "PSSYSUSERROLEDATANAME";
    protected static final String DTOFIELD_PSSYSUSERROLEDATANAME = "pssysuserroledataname";
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
    public PSSysUserRoleDataDTO createdate(Timestamp createDate) {
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
    public PSSysUserRoleDataDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysUserRoleDataDTO memo(String memo) {
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
    public PSSysUserRoleDataDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysUserRoleDataDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSSysUserRoleDataDTO psdeuserroleid(String pSDEUserRoleId) {
        this.setPSDEUserRoleId(pSDEUserRoleId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO psdeuserroleid(PSDEUserRoleDTO pSDEUserRole) {
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
    public PSSysUserRoleDataDTO psdeuserrolename(String pSDEUserRoleName) {
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
    public PSSysUserRoleDataDTO pssysuserroleid(String pSSysUserRoleId) {
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroleid(PSSysUserRoleDTO pSSysUserRole) {
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
    public PSSysUserRoleDataDTO pssysuserrolename(String pSSysUserRoleName) {
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

    @JsonProperty(value="pssysuserroledataid")
    public void setPSSysUserRoleDataId(String pSSysUserRoleDataId) {
        this._set(DTOFIELD_PSSYSUSERROLEDATAID, pSSysUserRoleDataId);
    }

    @JsonIgnore
    public String getPSSysUserRoleDataId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLEDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleDataIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERROLEDATAID);
    }

    @JsonIgnore
    public void resetPSSysUserRoleDataId() {
        this._reset(DTOFIELD_PSSYSUSERROLEDATAID);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroledataid(String pSSysUserRoleDataId) {
        this.setPSSysUserRoleDataId(pSSysUserRoleDataId);
        return this;
    }

    @JsonProperty(value="pssysuserroledataname")
    public void setPSSysUserRoleDataName(String pSSysUserRoleDataName) {
        this._set(DTOFIELD_PSSYSUSERROLEDATANAME, pSSysUserRoleDataName);
    }

    @JsonIgnore
    public String getPSSysUserRoleDataName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLEDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleDataNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERROLEDATANAME);
    }

    @JsonIgnore
    public void resetPSSysUserRoleDataName() {
        this._reset(DTOFIELD_PSSYSUSERROLEDATANAME);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroledataname(String pSSysUserRoleDataName) {
        this.setPSSysUserRoleDataName(pSSysUserRoleDataName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUserRoleDataName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUserRoleDataName(strName);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO name(String strName) {
        this.setPSSysUserRoleDataName(strName);
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
    public PSSysUserRoleDataDTO updatedate(Timestamp updateDate) {
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
    public PSSysUserRoleDataDTO updateman(String updateMan) {
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
    public PSSysUserRoleDataDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysUserRoleDataDTO usertag(String userTag) {
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
    public PSSysUserRoleDataDTO usertag2(String userTag2) {
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
    public PSSysUserRoleDataDTO usertag3(String userTag3) {
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
    public PSSysUserRoleDataDTO usertag4(String userTag4) {
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
    public PSSysUserRoleDataDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUserRoleDataId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUserRoleDataId(strValue);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO id(String strValue) {
        this.setPSSysUserRoleDataId(strValue);
        return this;
    }
}
