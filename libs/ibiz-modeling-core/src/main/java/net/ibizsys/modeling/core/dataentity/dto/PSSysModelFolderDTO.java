package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysModelFolderDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLUSERFLAG = "ALLUSERFLAG";
    protected static final String DTOFIELD_ALLUSERFLAG = "alluserflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FOLDERTYPE = "FOLDERTYPE";
    protected static final String DTOFIELD_FOLDERTYPE = "foldertype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSSYSMODELFOLDERID = "PPSSYSMODELFOLDERID";
    protected static final String DTOFIELD_PPSSYSMODELFOLDERID = "ppssysmodelfolderid";
    public static final String FIELD_PPSSYSMODELFOLDERNAME = "PPSSYSMODELFOLDERNAME";
    protected static final String DTOFIELD_PPSSYSMODELFOLDERNAME = "ppssysmodelfoldername";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSMODELFOLDERID = "PSSYSMODELFOLDERID";
    protected static final String DTOFIELD_PSSYSMODELFOLDERID = "pssysmodelfolderid";
    public static final String FIELD_PSSYSMODELFOLDERNAME = "PSSYSMODELFOLDERNAME";
    protected static final String DTOFIELD_PSSYSMODELFOLDERNAME = "pssysmodelfoldername";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";

    @JsonProperty(value="alluserflag")
    public void setAllUserFlag(Integer allUserFlag) {
        this._set(DTOFIELD_ALLUSERFLAG, allUserFlag);
    }

    @JsonIgnore
    public Integer getAllUserFlag() {
        Object objValue = this._get(DTOFIELD_ALLUSERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllUserFlagDirty() {
        return this._contains(DTOFIELD_ALLUSERFLAG);
    }

    @JsonIgnore
    public void resetAllUserFlag() {
        this._reset(DTOFIELD_ALLUSERFLAG);
    }

    @JsonIgnore
    public PSSysModelFolderDTO alluserflag(Integer allUserFlag) {
        this.setAllUserFlag(allUserFlag);
        return this;
    }

    @JsonIgnore
    public PSSysModelFolderDTO alluserflag(Boolean allUserFlag) {
        if (allUserFlag == null) {
            this.setAllUserFlag(null);
        } else {
            this.setAllUserFlag(allUserFlag != false ? 1 : 0);
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
    public PSSysModelFolderDTO createdate(Timestamp createDate) {
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
    public PSSysModelFolderDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="foldertype")
    public void setFolderType(String folderType) {
        this._set(DTOFIELD_FOLDERTYPE, folderType);
    }

    @JsonIgnore
    public String getFolderType() {
        Object objValue = this._get(DTOFIELD_FOLDERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFolderTypeDirty() {
        return this._contains(DTOFIELD_FOLDERTYPE);
    }

    @JsonIgnore
    public void resetFolderType() {
        this._reset(DTOFIELD_FOLDERTYPE);
    }

    @JsonIgnore
    public PSSysModelFolderDTO foldertype(String folderType) {
        this.setFolderType(folderType);
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
    public PSSysModelFolderDTO memo(String memo) {
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
    public PSSysModelFolderDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppssysmodelfolderid")
    public void setPPSSysModelFolderId(String pPSSysModelFolderId) {
        this._set(DTOFIELD_PPSSYSMODELFOLDERID, pPSSysModelFolderId);
    }

    @JsonIgnore
    public String getPPSSysModelFolderId() {
        Object objValue = this._get(DTOFIELD_PPSSYSMODELFOLDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysModelFolderIdDirty() {
        return this._contains(DTOFIELD_PPSSYSMODELFOLDERID);
    }

    @JsonIgnore
    public void resetPPSSysModelFolderId() {
        this._reset(DTOFIELD_PPSSYSMODELFOLDERID);
    }

    @JsonIgnore
    public PSSysModelFolderDTO ppssysmodelfolderid(String pPSSysModelFolderId) {
        this.setPPSSysModelFolderId(pPSSysModelFolderId);
        return this;
    }

    @JsonIgnore
    public PSSysModelFolderDTO ppssysmodelfolderid(PSSysModelFolderDTO pSSysModelFolder) {
        if (pSSysModelFolder == null) {
            this.setPPSSysModelFolderId(null);
            this.setPPSSysModelFolderName(null);
        } else {
            this.setPPSSysModelFolderId(pSSysModelFolder.getPSSysModelFolderId());
            this.setPPSSysModelFolderName(pSSysModelFolder.getPSSysModelFolderName());
        }
        return this;
    }

    @JsonProperty(value="ppssysmodelfoldername")
    public void setPPSSysModelFolderName(String pPSSysModelFolderName) {
        this._set(DTOFIELD_PPSSYSMODELFOLDERNAME, pPSSysModelFolderName);
    }

    @JsonIgnore
    public String getPPSSysModelFolderName() {
        Object objValue = this._get(DTOFIELD_PPSSYSMODELFOLDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysModelFolderNameDirty() {
        return this._contains(DTOFIELD_PPSSYSMODELFOLDERNAME);
    }

    @JsonIgnore
    public void resetPPSSysModelFolderName() {
        this._reset(DTOFIELD_PPSSYSMODELFOLDERNAME);
    }

    @JsonIgnore
    public PSSysModelFolderDTO ppssysmodelfoldername(String pPSSysModelFolderName) {
        this.setPPSSysModelFolderName(pPSSysModelFolderName);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSObjId(String pSObjId) {
        this._set(DTOFIELD_PSOBJID, pSObjId);
    }

    @JsonIgnore
    public String getPSObjId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSObjId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSSysModelFolderDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSObjName(String pSObjName) {
        this._set(DTOFIELD_PSOBJNAME, pSObjName);
    }

    @JsonIgnore
    public String getPSObjName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSObjName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSSysModelFolderDTO psobjname(String pSObjName) {
        this.setPSObjName(pSObjName);
        return this;
    }

    @JsonProperty(value="psobjtype")
    public void setPSObjType(String pSObjType) {
        this._set(DTOFIELD_PSOBJTYPE, pSObjType);
    }

    @JsonIgnore
    public String getPSObjType() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjTypeDirty() {
        return this._contains(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public void resetPSObjType() {
        this._reset(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public PSSysModelFolderDTO psobjtype(String pSObjType) {
        this.setPSObjType(pSObjType);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysModelFolderDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonProperty(value="pssysmodelfolderid")
    public void setPSSysModelFolderId(String pSSysModelFolderId) {
        this._set(DTOFIELD_PSSYSMODELFOLDERID, pSSysModelFolderId);
    }

    @JsonIgnore
    public String getPSSysModelFolderId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELFOLDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelFolderIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELFOLDERID);
    }

    @JsonIgnore
    public void resetPSSysModelFolderId() {
        this._reset(DTOFIELD_PSSYSMODELFOLDERID);
    }

    @JsonIgnore
    public PSSysModelFolderDTO pssysmodelfolderid(String pSSysModelFolderId) {
        this.setPSSysModelFolderId(pSSysModelFolderId);
        return this;
    }

    @JsonProperty(value="pssysmodelfoldername")
    public void setPSSysModelFolderName(String pSSysModelFolderName) {
        this._set(DTOFIELD_PSSYSMODELFOLDERNAME, pSSysModelFolderName);
    }

    @JsonIgnore
    public String getPSSysModelFolderName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELFOLDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelFolderNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELFOLDERNAME);
    }

    @JsonIgnore
    public void resetPSSysModelFolderName() {
        this._reset(DTOFIELD_PSSYSMODELFOLDERNAME);
    }

    @JsonIgnore
    public PSSysModelFolderDTO pssysmodelfoldername(String pSSysModelFolderName) {
        this.setPSSysModelFolderName(pSSysModelFolderName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysModelFolderName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysModelFolderName(strName);
    }

    @JsonIgnore
    public PSSysModelFolderDTO name(String strName) {
        this.setPSSysModelFolderName(strName);
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
    public PSSysModelFolderDTO updatedate(Timestamp updateDate) {
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
    public PSSysModelFolderDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysModelFolderDTO usertag(String userTag) {
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
    public PSSysModelFolderDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysModelFolderId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysModelFolderId(strValue);
    }

    @JsonIgnore
    public PSSysModelFolderDTO id(String strValue) {
        this.setPSSysModelFolderId(strValue);
        return this;
    }
}
