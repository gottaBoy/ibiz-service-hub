package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFProcRoleDTO
extends PSModelDTOBase {
    public static final String FIELD_CCMODE = "CCMODE";
    protected static final String DTOFIELD_CCMODE = "ccmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFPROCROLEID = "PSWFPROCROLEID";
    protected static final String DTOFIELD_PSWFPROCROLEID = "pswfprocroleid";
    public static final String FIELD_PSWFPROCROLENAME = "PSWFPROCROLENAME";
    protected static final String DTOFIELD_PSWFPROCROLENAME = "pswfprocrolename";
    public static final String FIELD_PSWFROLEID = "PSWFROLEID";
    protected static final String DTOFIELD_PSWFROLEID = "pswfroleid";
    public static final String FIELD_PSWFROLENAME = "PSWFROLENAME";
    protected static final String DTOFIELD_PSWFROLENAME = "pswfrolename";
    public static final String FIELD_ROLETYPE = "ROLETYPE";
    protected static final String DTOFIELD_ROLETYPE = "roletype";
    public static final String FIELD_UDFIELDS = "UDFIELDS";
    protected static final String DTOFIELD_UDFIELDS = "udfields";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="ccmode")
    public void setCCMode(Integer cCMode) {
        this._set(DTOFIELD_CCMODE, cCMode);
    }

    @JsonIgnore
    public Integer getCCMode() {
        Object objValue = this._get(DTOFIELD_CCMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCCModeDirty() {
        return this._contains(DTOFIELD_CCMODE);
    }

    @JsonIgnore
    public void resetCCMode() {
        this._reset(DTOFIELD_CCMODE);
    }

    @JsonIgnore
    public PSWFProcRoleDTO ccmode(Integer cCMode) {
        this.setCCMode(cCMode);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO ccmode(Boolean cCMode) {
        if (cCMode == null) {
            this.setCCMode(null);
        } else {
            this.setCCMode(cCMode != false ? 1 : 0);
        }
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
    public PSWFProcRoleDTO createdate(Timestamp createDate) {
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
    public PSWFProcRoleDTO createman(String createMan) {
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
    public PSWFProcRoleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFID(String pSWFID) {
        this._set(DTOFIELD_PSWFID, pSWFID);
    }

    @JsonIgnore
    public String getPSWFID() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIDDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFID() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfid(String pSWFID) {
        this.setPSWFID(pSWFID);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfprocessid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
        } else {
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonProperty(value="pswfprocroleid")
    public void setPSWFProcRoleId(String pSWFProcRoleId) {
        this._set(DTOFIELD_PSWFPROCROLEID, pSWFProcRoleId);
    }

    @JsonIgnore
    public String getPSWFProcRoleId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcRoleIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCROLEID);
    }

    @JsonIgnore
    public void resetPSWFProcRoleId() {
        this._reset(DTOFIELD_PSWFPROCROLEID);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfprocroleid(String pSWFProcRoleId) {
        this.setPSWFProcRoleId(pSWFProcRoleId);
        return this;
    }

    @JsonProperty(value="pswfprocrolename")
    public void setPSWFProcRoleName(String pSWFProcRoleName) {
        this._set(DTOFIELD_PSWFPROCROLENAME, pSWFProcRoleName);
    }

    @JsonIgnore
    public String getPSWFProcRoleName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcRoleNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCROLENAME);
    }

    @JsonIgnore
    public void resetPSWFProcRoleName() {
        this._reset(DTOFIELD_PSWFPROCROLENAME);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfprocrolename(String pSWFProcRoleName) {
        this.setPSWFProcRoleName(pSWFProcRoleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFProcRoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFProcRoleName(strName);
    }

    @JsonIgnore
    public PSWFProcRoleDTO name(String strName) {
        this.setPSWFProcRoleName(strName);
        return this;
    }

    @JsonProperty(value="pswfroleid")
    public void setPSWFRoleId(String pSWFRoleId) {
        this._set(DTOFIELD_PSWFROLEID, pSWFRoleId);
    }

    @JsonIgnore
    public String getPSWFRoleId() {
        Object objValue = this._get(DTOFIELD_PSWFROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFRoleIdDirty() {
        return this._contains(DTOFIELD_PSWFROLEID);
    }

    @JsonIgnore
    public void resetPSWFRoleId() {
        this._reset(DTOFIELD_PSWFROLEID);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfroleid(String pSWFRoleId) {
        this.setPSWFRoleId(pSWFRoleId);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfroleid(PSWFRoleDTO pSWFRole) {
        if (pSWFRole == null) {
            this.setPSWFRoleId(null);
            this.setPSWFRoleName(null);
        } else {
            this.setPSWFRoleId(pSWFRole.getPSWFRoleId());
            this.setPSWFRoleName(pSWFRole.getPSWFRoleName());
        }
        return this;
    }

    @JsonProperty(value="pswfrolename")
    public void setPSWFRoleName(String pSWFRoleName) {
        this._set(DTOFIELD_PSWFROLENAME, pSWFRoleName);
    }

    @JsonIgnore
    public String getPSWFRoleName() {
        Object objValue = this._get(DTOFIELD_PSWFROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFRoleNameDirty() {
        return this._contains(DTOFIELD_PSWFROLENAME);
    }

    @JsonIgnore
    public void resetPSWFRoleName() {
        this._reset(DTOFIELD_PSWFROLENAME);
    }

    @JsonIgnore
    public PSWFProcRoleDTO pswfrolename(String pSWFRoleName) {
        this.setPSWFRoleName(pSWFRoleName);
        return this;
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
    public PSWFProcRoleDTO roletype(String roleType) {
        this.setRoleType(roleType);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO roletype(PSModelEnums.WFProcRoleType roleType) {
        if (roleType == null) {
            this.setRoleType(null);
        } else {
            this.setRoleType(roleType.value);
        }
        return this;
    }

    @JsonProperty(value="udfields")
    public void setUDFields(String uDFields) {
        this._set(DTOFIELD_UDFIELDS, uDFields);
    }

    @JsonIgnore
    public String getUDFields() {
        Object objValue = this._get(DTOFIELD_UDFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUDFieldsDirty() {
        return this._contains(DTOFIELD_UDFIELDS);
    }

    @JsonIgnore
    public void resetUDFields() {
        this._reset(DTOFIELD_UDFIELDS);
    }

    @JsonIgnore
    public PSWFProcRoleDTO udfields(String uDFields) {
        this.setUDFields(uDFields);
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
    public PSWFProcRoleDTO updatedate(Timestamp updateDate) {
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
    public PSWFProcRoleDTO updateman(String updateMan) {
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
    public PSWFProcRoleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFProcRoleDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSWFProcRoleDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSWFProcRoleDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSWFProcRoleDTO usertag(String userTag) {
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
    public PSWFProcRoleDTO usertag2(String userTag2) {
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
    public PSWFProcRoleDTO usertag3(String userTag3) {
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
    public PSWFProcRoleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFProcRoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFProcRoleId(strValue);
    }

    @JsonIgnore
    public PSWFProcRoleDTO id(String strValue) {
        this.setPSWFProcRoleId(strValue);
        return this;
    }
}
