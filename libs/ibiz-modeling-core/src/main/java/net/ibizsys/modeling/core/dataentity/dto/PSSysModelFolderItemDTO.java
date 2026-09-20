package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelFolderDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysModelFolderItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLUSERFLAG = "ALLUSERFLAG";
    protected static final String DTOFIELD_ALLUSERFLAG = "alluserflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_ICONCLS = "ICONCLS";
    protected static final String DTOFIELD_ICONCLS = "iconcls";
    public static final String FIELD_ITEMPARAM = "ITEMPARAM";
    protected static final String DTOFIELD_ITEMPARAM = "itemparam";
    public static final String FIELD_ITEMPARAM2 = "ITEMPARAM2";
    protected static final String DTOFIELD_ITEMPARAM2 = "itemparam2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSOBJTYPENAME = "PSOBJTYPENAME";
    protected static final String DTOFIELD_PSOBJTYPENAME = "psobjtypename";
    public static final String FIELD_PSSYSMODELFOLDERID = "PSSYSMODELFOLDERID";
    protected static final String DTOFIELD_PSSYSMODELFOLDERID = "pssysmodelfolderid";
    public static final String FIELD_PSSYSMODELFOLDERITEMID = "PSSYSMODELFOLDERITEMID";
    protected static final String DTOFIELD_PSSYSMODELFOLDERITEMID = "pssysmodelfolderitemid";
    public static final String FIELD_PSSYSMODELFOLDERITEMNAME = "PSSYSMODELFOLDERITEMNAME";
    protected static final String DTOFIELD_PSSYSMODELFOLDERITEMNAME = "pssysmodelfolderitemname";
    public static final String FIELD_PSSYSMODELFOLDERNAME = "PSSYSMODELFOLDERNAME";
    protected static final String DTOFIELD_PSSYSMODELFOLDERNAME = "pssysmodelfoldername";
    public static final String FIELD_STUDIOTAG = "STUDIOTAG";
    protected static final String DTOFIELD_STUDIOTAG = "studiotag";
    public static final String FIELD_STUDIOTAG2 = "STUDIOTAG2";
    protected static final String DTOFIELD_STUDIOTAG2 = "studiotag2";
    public static final String FIELD_STUDIOTYPE = "STUDIOTYPE";
    protected static final String DTOFIELD_STUDIOTYPE = "studiotype";
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
    public PSSysModelFolderItemDTO alluserflag(Integer allUserFlag) {
        this.setAllUserFlag(allUserFlag);
        return this;
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO alluserflag(Boolean allUserFlag) {
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
    public PSSysModelFolderItemDTO createdate(Timestamp createDate) {
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
    public PSSysModelFolderItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="iconcls")
    public void setIconCls(String iconCls) {
        this._set(DTOFIELD_ICONCLS, iconCls);
    }

    @JsonIgnore
    public String getIconCls() {
        Object objValue = this._get(DTOFIELD_ICONCLS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsDirty() {
        return this._contains(DTOFIELD_ICONCLS);
    }

    @JsonIgnore
    public void resetIconCls() {
        this._reset(DTOFIELD_ICONCLS);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO iconcls(String iconCls) {
        this.setIconCls(iconCls);
        return this;
    }

    @JsonProperty(value="itemparam")
    public void setItemParam(String itemParam) {
        this._set(DTOFIELD_ITEMPARAM, itemParam);
    }

    @JsonIgnore
    public String getItemParam() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParamDirty() {
        return this._contains(DTOFIELD_ITEMPARAM);
    }

    @JsonIgnore
    public void resetItemParam() {
        this._reset(DTOFIELD_ITEMPARAM);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO itemparam(String itemParam) {
        this.setItemParam(itemParam);
        return this;
    }

    @JsonProperty(value="itemparam2")
    public void setItemParam2(String itemParam2) {
        this._set(DTOFIELD_ITEMPARAM2, itemParam2);
    }

    @JsonIgnore
    public String getItemParam2() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParam2Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM2);
    }

    @JsonIgnore
    public void resetItemParam2() {
        this._reset(DTOFIELD_ITEMPARAM2);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO itemparam2(String itemParam2) {
        this.setItemParam2(itemParam2);
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
    public PSSysModelFolderItemDTO memo(String memo) {
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
    public PSSysModelFolderItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysModelFolderItemDTO psobjid(String pSObjId) {
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
    public PSSysModelFolderItemDTO psobjname(String pSObjName) {
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
    public PSSysModelFolderItemDTO psobjtype(String pSObjType) {
        this.setPSObjType(pSObjType);
        return this;
    }

    @JsonProperty(value="psobjtypename")
    public void setPSObjTypeName(String pSObjTypeName) {
        this._set(DTOFIELD_PSOBJTYPENAME, pSObjTypeName);
    }

    @JsonIgnore
    public String getPSObjTypeName() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjTypeNameDirty() {
        return this._contains(DTOFIELD_PSOBJTYPENAME);
    }

    @JsonIgnore
    public void resetPSObjTypeName() {
        this._reset(DTOFIELD_PSOBJTYPENAME);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO psobjtypename(String pSObjTypeName) {
        this.setPSObjTypeName(pSObjTypeName);
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
    public PSSysModelFolderItemDTO pssysmodelfolderid(String pSSysModelFolderId) {
        this.setPSSysModelFolderId(pSSysModelFolderId);
        return this;
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO pssysmodelfolderid(PSSysModelFolderDTO pSSysModelFolder) {
        if (pSSysModelFolder == null) {
            this.setPSSysModelFolderId(null);
            this.setPSSysModelFolderName(null);
        } else {
            this.setPSSysModelFolderId(pSSysModelFolder.getPSSysModelFolderId());
            this.setPSSysModelFolderName(pSSysModelFolder.getPSSysModelFolderName());
        }
        return this;
    }

    @JsonProperty(value="pssysmodelfolderitemid")
    public void setPSSysModelFolderItemId(String pSSysModelFolderItemId) {
        this._set(DTOFIELD_PSSYSMODELFOLDERITEMID, pSSysModelFolderItemId);
    }

    @JsonIgnore
    public String getPSSysModelFolderItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELFOLDERITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelFolderItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELFOLDERITEMID);
    }

    @JsonIgnore
    public void resetPSSysModelFolderItemId() {
        this._reset(DTOFIELD_PSSYSMODELFOLDERITEMID);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO pssysmodelfolderitemid(String pSSysModelFolderItemId) {
        this.setPSSysModelFolderItemId(pSSysModelFolderItemId);
        return this;
    }

    @JsonProperty(value="pssysmodelfolderitemname")
    public void setPSSysModelFolderItemName(String pSSysModelFolderItemName) {
        this._set(DTOFIELD_PSSYSMODELFOLDERITEMNAME, pSSysModelFolderItemName);
    }

    @JsonIgnore
    public String getPSSysModelFolderItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELFOLDERITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelFolderItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELFOLDERITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysModelFolderItemName() {
        this._reset(DTOFIELD_PSSYSMODELFOLDERITEMNAME);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO pssysmodelfolderitemname(String pSSysModelFolderItemName) {
        this.setPSSysModelFolderItemName(pSSysModelFolderItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysModelFolderItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysModelFolderItemName(strName);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO name(String strName) {
        this.setPSSysModelFolderItemName(strName);
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
    public PSSysModelFolderItemDTO pssysmodelfoldername(String pSSysModelFolderName) {
        this.setPSSysModelFolderName(pSSysModelFolderName);
        return this;
    }

    @JsonProperty(value="studiotag")
    public void setStudioTag(String studioTag) {
        this._set(DTOFIELD_STUDIOTAG, studioTag);
    }

    @JsonIgnore
    public String getStudioTag() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTagDirty() {
        return this._contains(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public void resetStudioTag() {
        this._reset(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO studiotag(String studioTag) {
        this.setStudioTag(studioTag);
        return this;
    }

    @JsonProperty(value="studiotag2")
    public void setStudioTag2(String studioTag2) {
        this._set(DTOFIELD_STUDIOTAG2, studioTag2);
    }

    @JsonIgnore
    public String getStudioTag2() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTag2Dirty() {
        return this._contains(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public void resetStudioTag2() {
        this._reset(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO studiotag2(String studioTag2) {
        this.setStudioTag2(studioTag2);
        return this;
    }

    @JsonProperty(value="studiotype")
    public void setStudioType(String studioType) {
        this._set(DTOFIELD_STUDIOTYPE, studioType);
    }

    @JsonIgnore
    public String getStudioType() {
        Object objValue = this._get(DTOFIELD_STUDIOTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTypeDirty() {
        return this._contains(DTOFIELD_STUDIOTYPE);
    }

    @JsonIgnore
    public void resetStudioType() {
        this._reset(DTOFIELD_STUDIOTYPE);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO studiotype(String studioType) {
        this.setStudioType(studioType);
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
    public PSSysModelFolderItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysModelFolderItemDTO updateman(String updateMan) {
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
    public PSSysModelFolderItemDTO usertag(String userTag) {
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
    public PSSysModelFolderItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysModelFolderItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysModelFolderItemId(strValue);
    }

    @JsonIgnore
    public PSSysModelFolderItemDTO id(String strValue) {
        this.setPSSysModelFolderItemId(strValue);
        return this;
    }
}
