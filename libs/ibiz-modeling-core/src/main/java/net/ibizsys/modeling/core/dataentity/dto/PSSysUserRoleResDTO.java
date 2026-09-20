package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUserRoleResDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSUSERROLEID = "PSSYSOPPRIVID";
    protected static final String DTOFIELD_PSSYSUSERROLEID = "pssysuserroleid";
    public static final String FIELD_PSSYSUSERROLENAME = "PSSYSOPPRIVNAME";
    protected static final String DTOFIELD_PSSYSUSERROLENAME = "pssysuserrolename";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PSSYSUSERROLERESID = "PSSYSUSERROLERESID";
    protected static final String DTOFIELD_PSSYSUSERROLERESID = "pssysuserroleresid";
    public static final String FIELD_PSSYSUSERROLERESNAME = "PSSYSUSERROLERESNAME";
    protected static final String DTOFIELD_PSSYSUSERROLERESNAME = "pssysuserroleresname";
    public static final String FIELD_RESMODEL = "RESMODEL";
    protected static final String DTOFIELD_RESMODEL = "resmodel";
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
    public PSSysUserRoleResDTO createdate(Timestamp createDate) {
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
    public PSSysUserRoleResDTO createman(String createMan) {
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
    public PSSysUserRoleResDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysUserRoleResDTO pssysuserroleid(String pSSysUserRoleId) {
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuserroleid(PSSysUserRoleDTO pSSysUserRole) {
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
    public PSSysUserRoleResDTO pssysuserrolename(String pSSysUserRoleName) {
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

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    @JsonProperty(value="pssysuserroleresid")
    public void setPSSysUserRoleResId(String pSSysUserRoleResId) {
        this._set(DTOFIELD_PSSYSUSERROLERESID, pSSysUserRoleResId);
    }

    @JsonIgnore
    public String getPSSysUserRoleResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLERESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERROLERESID);
    }

    @JsonIgnore
    public void resetPSSysUserRoleResId() {
        this._reset(DTOFIELD_PSSYSUSERROLERESID);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuserroleresid(String pSSysUserRoleResId) {
        this.setPSSysUserRoleResId(pSSysUserRoleResId);
        return this;
    }

    @JsonProperty(value="pssysuserroleresname")
    public void setPSSysUserRoleResName(String pSSysUserRoleResName) {
        this._set(DTOFIELD_PSSYSUSERROLERESNAME, pSSysUserRoleResName);
    }

    @JsonIgnore
    public String getPSSysUserRoleResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERROLERESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserRoleResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERROLERESNAME);
    }

    @JsonIgnore
    public void resetPSSysUserRoleResName() {
        this._reset(DTOFIELD_PSSYSUSERROLERESNAME);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO pssysuserroleresname(String pSSysUserRoleResName) {
        this.setPSSysUserRoleResName(pSSysUserRoleResName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUserRoleResName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUserRoleResName(strName);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO name(String strName) {
        this.setPSSysUserRoleResName(strName);
        return this;
    }

    @JsonProperty(value="resmodel")
    public void setResModel(String resModel) {
        this._set(DTOFIELD_RESMODEL, resModel);
    }

    @JsonIgnore
    public String getResModel() {
        Object objValue = this._get(DTOFIELD_RESMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResModelDirty() {
        return this._contains(DTOFIELD_RESMODEL);
    }

    @JsonIgnore
    public void resetResModel() {
        this._reset(DTOFIELD_RESMODEL);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO resmodel(String resModel) {
        this.setResModel(resModel);
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
    public PSSysUserRoleResDTO updatedate(Timestamp updateDate) {
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
    public PSSysUserRoleResDTO updateman(String updateMan) {
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
    public PSSysUserRoleResDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleResDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysUserRoleResDTO usertag(String userTag) {
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
    public PSSysUserRoleResDTO usertag2(String userTag2) {
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
    public PSSysUserRoleResDTO usertag3(String userTag3) {
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
    public PSSysUserRoleResDTO usertag4(String userTag4) {
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
    public PSSysUserRoleResDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUserRoleResDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUserRoleResId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUserRoleResId(strValue);
    }

    @JsonIgnore
    public PSSysUserRoleResDTO id(String strValue) {
        this.setPSSysUserRoleResId(strValue);
        return this;
    }
}
