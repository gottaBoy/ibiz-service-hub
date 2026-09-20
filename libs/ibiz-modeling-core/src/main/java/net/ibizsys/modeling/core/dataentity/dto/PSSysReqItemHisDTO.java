package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysReqItemHisDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_PSSYSREQITEMHISID = "PSSYSREQITEMHISID";
    protected static final String DTOFIELD_PSSYSREQITEMHISID = "pssysreqitemhisid";
    public static final String FIELD_PSSYSREQITEMHISNAME = "PSSYSREQITEMHISNAME";
    protected static final String DTOFIELD_PSSYSREQITEMHISNAME = "pssysreqitemhisname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_REQCONTENT = "REQCONTENT";
    protected static final String DTOFIELD_REQCONTENT = "reqcontent";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
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
    public static final String FIELD_VER = "VER";
    protected static final String DTOFIELD_VER = "ver";

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
    public PSSysReqItemHisDTO createdate(Timestamp createDate) {
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
    public PSSysReqItemHisDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="itemtag")
    public void setItemTag(String itemTag) {
        this._set(DTOFIELD_ITEMTAG, itemTag);
    }

    @JsonIgnore
    public String getItemTag() {
        Object objValue = this._get(DTOFIELD_ITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTagDirty() {
        return this._contains(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public void resetItemTag() {
        this._reset(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO itemtag(String itemTag) {
        this.setItemTag(itemTag);
        return this;
    }

    @JsonProperty(value="itemtag2")
    public void setItemTag2(String itemTag2) {
        this._set(DTOFIELD_ITEMTAG2, itemTag2);
    }

    @JsonIgnore
    public String getItemTag2() {
        Object objValue = this._get(DTOFIELD_ITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag2Dirty() {
        return this._contains(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public void resetItemTag2() {
        this._reset(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
        return this;
    }

    @JsonProperty(value="pssysreqitemhisid")
    public void setPSSysReqItemHisId(String pSSysReqItemHisId) {
        this._set(DTOFIELD_PSSYSREQITEMHISID, pSSysReqItemHisId);
    }

    @JsonIgnore
    public String getPSSysReqItemHisId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMHISID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemHisIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMHISID);
    }

    @JsonIgnore
    public void resetPSSysReqItemHisId() {
        this._reset(DTOFIELD_PSSYSREQITEMHISID);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO pssysreqitemhisid(String pSSysReqItemHisId) {
        this.setPSSysReqItemHisId(pSSysReqItemHisId);
        return this;
    }

    @JsonProperty(value="pssysreqitemhisname")
    public void setPSSysReqItemHisName(String pSSysReqItemHisName) {
        this._set(DTOFIELD_PSSYSREQITEMHISNAME, pSSysReqItemHisName);
    }

    @JsonIgnore
    public String getPSSysReqItemHisName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMHISNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemHisNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMHISNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemHisName() {
        this._reset(DTOFIELD_PSSYSREQITEMHISNAME);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO pssysreqitemhisname(String pSSysReqItemHisName) {
        this.setPSSysReqItemHisName(pSSysReqItemHisName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysReqItemHisName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysReqItemHisName(strName);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO name(String strName) {
        this.setPSSysReqItemHisName(strName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSSysReqItemHisDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="reqcontent")
    public void setReqContent(String reqContent) {
        this._set(DTOFIELD_REQCONTENT, reqContent);
    }

    @JsonIgnore
    public String getReqContent() {
        Object objValue = this._get(DTOFIELD_REQCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReqContentDirty() {
        return this._contains(DTOFIELD_REQCONTENT);
    }

    @JsonIgnore
    public void resetReqContent() {
        this._reset(DTOFIELD_REQCONTENT);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO reqcontent(String reqContent) {
        this.setReqContent(reqContent);
        return this;
    }

    @JsonProperty(value="tags")
    public void setTags(String tags) {
        this._set(DTOFIELD_TAGS, tags);
    }

    @JsonIgnore
    public String getTags() {
        Object objValue = this._get(DTOFIELD_TAGS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagsDirty() {
        return this._contains(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public void resetTags() {
        this._reset(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO tags(String tags) {
        this.setTags(tags);
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
    public PSSysReqItemHisDTO updatedate(Timestamp updateDate) {
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
    public PSSysReqItemHisDTO updateman(String updateMan) {
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
    public PSSysReqItemHisDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysReqItemHisDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysReqItemHisDTO usertag(String userTag) {
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
    public PSSysReqItemHisDTO usertag2(String userTag2) {
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
    public PSSysReqItemHisDTO usertag3(String userTag3) {
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
    public PSSysReqItemHisDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="ver")
    public void setVer(Integer ver) {
        this._set(DTOFIELD_VER, ver);
    }

    @JsonIgnore
    public Integer getVer() {
        Object objValue = this._get(DTOFIELD_VER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isVerDirty() {
        return this._contains(DTOFIELD_VER);
    }

    @JsonIgnore
    public void resetVer() {
        this._reset(DTOFIELD_VER);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO ver(Integer ver) {
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysReqItemHisId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysReqItemHisId(strValue);
    }

    @JsonIgnore
    public PSSysReqItemHisDTO id(String strValue) {
        this.setPSSysReqItemHisId(strValue);
        return this;
    }
}
