package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWXMenuItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSWXMENUITEMID = "PPSWXMENUITEMID";
    protected static final String DTOFIELD_PPSWXMENUITEMID = "ppswxmenuitemid";
    public static final String FIELD_PPSWXMENUITEMNAME = "PPSWXMENUITEMNAME";
    protected static final String DTOFIELD_PPSWXMENUITEMNAME = "ppswxmenuitemname";
    public static final String FIELD_PSWXMENUFUNCID = "PSWXMENUFUNCID";
    protected static final String DTOFIELD_PSWXMENUFUNCID = "pswxmenufuncid";
    public static final String FIELD_PSWXMENUFUNCNAME = "PSWXMENUFUNCNAME";
    protected static final String DTOFIELD_PSWXMENUFUNCNAME = "pswxmenufuncname";
    public static final String FIELD_PSWXMENUID = "PSWXMENUID";
    protected static final String DTOFIELD_PSWXMENUID = "pswxmenuid";
    public static final String FIELD_PSWXMENUITEMID = "PSWXMENUITEMID";
    protected static final String DTOFIELD_PSWXMENUITEMID = "pswxmenuitemid";
    public static final String FIELD_PSWXMENUITEMNAME = "PSWXMENUITEMNAME";
    protected static final String DTOFIELD_PSWXMENUITEMNAME = "pswxmenuitemname";
    public static final String FIELD_PSWXMENUNAME = "PSWXMENUNAME";
    protected static final String DTOFIELD_PSWXMENUNAME = "pswxmenuname";
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
    public static final String DTOFIELD_PSWXMENUITEMS = "pswxmenuitems";

    @JsonProperty(value="caption")
    public void setCaption(String caption) {
        this._set(DTOFIELD_CAPTION, caption);
    }

    @JsonIgnore
    public String getCaption() {
        Object objValue = this._get(DTOFIELD_CAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionDirty() {
        return this._contains(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public void resetCaption() {
        this._reset(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public PSWXMenuItemDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSWXMenuItemDTO createdate(Timestamp createDate) {
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
    public PSWXMenuItemDTO createman(String createMan) {
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
    public PSWXMenuItemDTO memo(String memo) {
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
    public PSWXMenuItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppswxmenuitemid")
    public void setPPSWXMenuItemId(String pPSWXMenuItemId) {
        this._set(DTOFIELD_PPSWXMENUITEMID, pPSWXMenuItemId);
    }

    @JsonIgnore
    public String getPPSWXMenuItemId() {
        Object objValue = this._get(DTOFIELD_PPSWXMENUITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSWXMenuItemIdDirty() {
        return this._contains(DTOFIELD_PPSWXMENUITEMID);
    }

    @JsonIgnore
    public void resetPPSWXMenuItemId() {
        this._reset(DTOFIELD_PPSWXMENUITEMID);
    }

    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemid(String pPSWXMenuItemId) {
        this.setPPSWXMenuItemId(pPSWXMenuItemId);
        return this;
    }

    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemid(PSWXMenuItemDTO pSWXMenuItem) {
        if (pSWXMenuItem == null) {
            this.setPPSWXMenuItemId(null);
            this.setPPSWXMenuItemName(null);
        } else {
            this.setPPSWXMenuItemId(pSWXMenuItem.getPSWXMenuItemId());
            this.setPPSWXMenuItemName(pSWXMenuItem.getPSWXMenuItemName());
        }
        return this;
    }

    @JsonProperty(value="ppswxmenuitemname")
    public void setPPSWXMenuItemName(String pPSWXMenuItemName) {
        this._set(DTOFIELD_PPSWXMENUITEMNAME, pPSWXMenuItemName);
    }

    @JsonIgnore
    public String getPPSWXMenuItemName() {
        Object objValue = this._get(DTOFIELD_PPSWXMENUITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSWXMenuItemNameDirty() {
        return this._contains(DTOFIELD_PPSWXMENUITEMNAME);
    }

    @JsonIgnore
    public void resetPPSWXMenuItemName() {
        this._reset(DTOFIELD_PPSWXMENUITEMNAME);
    }

    @JsonIgnore
    public PSWXMenuItemDTO ppswxmenuitemname(String pPSWXMenuItemName) {
        this.setPPSWXMenuItemName(pPSWXMenuItemName);
        return this;
    }

    @JsonProperty(value="pswxmenufuncid")
    public void setPSWXMenuFuncId(String pSWXMenuFuncId) {
        this._set(DTOFIELD_PSWXMENUFUNCID, pSWXMenuFuncId);
    }

    @JsonIgnore
    public String getPSWXMenuFuncId() {
        Object objValue = this._get(DTOFIELD_PSWXMENUFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuFuncIdDirty() {
        return this._contains(DTOFIELD_PSWXMENUFUNCID);
    }

    @JsonIgnore
    public void resetPSWXMenuFuncId() {
        this._reset(DTOFIELD_PSWXMENUFUNCID);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncid(String pSWXMenuFuncId) {
        this.setPSWXMenuFuncId(pSWXMenuFuncId);
        return this;
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncid(PSWXMenuFuncDTO pSWXMenuFunc) {
        if (pSWXMenuFunc == null) {
            this.setPSWXMenuFuncId(null);
            this.setPSWXMenuFuncName(null);
        } else {
            this.setPSWXMenuFuncId(pSWXMenuFunc.getPSWXMenuFuncId());
            this.setPSWXMenuFuncName(pSWXMenuFunc.getPSWXMenuFuncName());
        }
        return this;
    }

    @JsonProperty(value="pswxmenufuncname")
    public void setPSWXMenuFuncName(String pSWXMenuFuncName) {
        this._set(DTOFIELD_PSWXMENUFUNCNAME, pSWXMenuFuncName);
    }

    @JsonIgnore
    public String getPSWXMenuFuncName() {
        Object objValue = this._get(DTOFIELD_PSWXMENUFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuFuncNameDirty() {
        return this._contains(DTOFIELD_PSWXMENUFUNCNAME);
    }

    @JsonIgnore
    public void resetPSWXMenuFuncName() {
        this._reset(DTOFIELD_PSWXMENUFUNCNAME);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenufuncname(String pSWXMenuFuncName) {
        this.setPSWXMenuFuncName(pSWXMenuFuncName);
        return this;
    }

    @JsonProperty(value="pswxmenuid")
    public void setPSWXMenuId(String pSWXMenuId) {
        this._set(DTOFIELD_PSWXMENUID, pSWXMenuId);
    }

    @JsonIgnore
    public String getPSWXMenuId() {
        Object objValue = this._get(DTOFIELD_PSWXMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuIdDirty() {
        return this._contains(DTOFIELD_PSWXMENUID);
    }

    @JsonIgnore
    public void resetPSWXMenuId() {
        this._reset(DTOFIELD_PSWXMENUID);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuid(String pSWXMenuId) {
        this.setPSWXMenuId(pSWXMenuId);
        return this;
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuid(PSWXMenuDTO pSWXMenu) {
        if (pSWXMenu == null) {
            this.setPSWXMenuId(null);
            this.setPSWXMenuName(null);
        } else {
            this.setPSWXMenuId(pSWXMenu.getPSWXMenuId());
            this.setPSWXMenuName(pSWXMenu.getPSWXMenuName());
        }
        return this;
    }

    @JsonProperty(value="pswxmenuitemid")
    public void setPSWXMenuItemId(String pSWXMenuItemId) {
        this._set(DTOFIELD_PSWXMENUITEMID, pSWXMenuItemId);
    }

    @JsonIgnore
    public String getPSWXMenuItemId() {
        Object objValue = this._get(DTOFIELD_PSWXMENUITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuItemIdDirty() {
        return this._contains(DTOFIELD_PSWXMENUITEMID);
    }

    @JsonIgnore
    public void resetPSWXMenuItemId() {
        this._reset(DTOFIELD_PSWXMENUITEMID);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuitemid(String pSWXMenuItemId) {
        this.setPSWXMenuItemId(pSWXMenuItemId);
        return this;
    }

    @JsonProperty(value="pswxmenuitemname")
    public void setPSWXMenuItemName(String pSWXMenuItemName) {
        this._set(DTOFIELD_PSWXMENUITEMNAME, pSWXMenuItemName);
    }

    @JsonIgnore
    public String getPSWXMenuItemName() {
        Object objValue = this._get(DTOFIELD_PSWXMENUITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuItemNameDirty() {
        return this._contains(DTOFIELD_PSWXMENUITEMNAME);
    }

    @JsonIgnore
    public void resetPSWXMenuItemName() {
        this._reset(DTOFIELD_PSWXMENUITEMNAME);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuitemname(String pSWXMenuItemName) {
        this.setPSWXMenuItemName(pSWXMenuItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWXMenuItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWXMenuItemName(strName);
    }

    @JsonIgnore
    public PSWXMenuItemDTO name(String strName) {
        this.setPSWXMenuItemName(strName);
        return this;
    }

    @JsonProperty(value="pswxmenuname")
    public void setPSWXMenuName(String pSWXMenuName) {
        this._set(DTOFIELD_PSWXMENUNAME, pSWXMenuName);
    }

    @JsonIgnore
    public String getPSWXMenuName() {
        Object objValue = this._get(DTOFIELD_PSWXMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWXMenuNameDirty() {
        return this._contains(DTOFIELD_PSWXMENUNAME);
    }

    @JsonIgnore
    public void resetPSWXMenuName() {
        this._reset(DTOFIELD_PSWXMENUNAME);
    }

    @JsonIgnore
    public PSWXMenuItemDTO pswxmenuname(String pSWXMenuName) {
        this.setPSWXMenuName(pSWXMenuName);
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
    public PSWXMenuItemDTO updatedate(Timestamp updateDate) {
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
    public PSWXMenuItemDTO updateman(String updateMan) {
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
    public PSWXMenuItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWXMenuItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWXMenuItemDTO usertag(String userTag) {
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
    public PSWXMenuItemDTO usertag2(String userTag2) {
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
    public PSWXMenuItemDTO usertag3(String userTag3) {
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
    public PSWXMenuItemDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWXMenuItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWXMenuItemId(strValue);
    }

    @JsonIgnore
    public PSWXMenuItemDTO id(String strValue) {
        this.setPSWXMenuItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWXMenuItemDTO> getPSWXMenuItems() {
        Object list = this._get(DTOFIELD_PSWXMENUITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswxmenuitems")
    public void setPSWXMenuItems(List<PSWXMenuItemDTO> pswxmenuitems) {
        this._set(DTOFIELD_PSWXMENUITEMS, pswxmenuitems);
    }

    @JsonIgnore
    public List<PSWXMenuItemDTO> getPSWXMenuItemsIf() {
        Object list = this._get(DTOFIELD_PSWXMENUITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWXMENUITEMS, list);
        }
        return (List) list;
    }
}
