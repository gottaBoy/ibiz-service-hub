package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppSBItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_ITEMTAG3 = "ITEMTAG3";
    protected static final String DTOFIELD_ITEMTAG3 = "itemtag3";
    public static final String FIELD_ITEMTAG4 = "ITEMTAG4";
    protected static final String DTOFIELD_ITEMTAG4 = "itemtag4";
    public static final String FIELD_ITEMTYPE = "ITEMTYPE";
    protected static final String DTOFIELD_ITEMTYPE = "itemtype";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPSBITEMID = "PSAPPSBITEMID";
    protected static final String DTOFIELD_PSAPPSBITEMID = "psappsbitemid";
    public static final String FIELD_PSAPPSBITEMNAME = "PSAPPSBITEMNAME";
    protected static final String DTOFIELD_PSAPPSBITEMNAME = "psappsbitemname";
    public static final String FIELD_PSAPPSTORYBOARDID = "PSAPPSTORYBOARDID";
    protected static final String DTOFIELD_PSAPPSTORYBOARDID = "psappstoryboardid";
    public static final String FIELD_PSAPPSTORYBOARDNAME = "PSAPPSTORYBOARDNAME";
    protected static final String DTOFIELD_PSAPPSTORYBOARDNAME = "psappstoryboardname";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUSECASEID = "PSSYSUSERCASEID";
    protected static final String DTOFIELD_PSSYSUSECASEID = "pssysusecaseid";
    public static final String FIELD_PSSYSUSECASENAME = "PSSYSUSERCASENAME";
    protected static final String DTOFIELD_PSSYSUSECASENAME = "pssysusecasename";
    public static final String FIELD_ROOTITEM = "ROOTITEM";
    protected static final String DTOFIELD_ROOTITEM = "rootitem";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERFLAG = "USERFLAG";
    protected static final String DTOFIELD_USERFLAG = "userflag";
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

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSAppSBItemDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSAppSBItemDTO createdate(Timestamp createDate) {
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
    public PSAppSBItemDTO createman(String createMan) {
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
    public PSAppSBItemDTO itemtag(String itemTag) {
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
    public PSAppSBItemDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
        return this;
    }

    @JsonProperty(value="itemtag3")
    public void setItemTag3(String itemTag3) {
        this._set(DTOFIELD_ITEMTAG3, itemTag3);
    }

    @JsonIgnore
    public String getItemTag3() {
        Object objValue = this._get(DTOFIELD_ITEMTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag3Dirty() {
        return this._contains(DTOFIELD_ITEMTAG3);
    }

    @JsonIgnore
    public void resetItemTag3() {
        this._reset(DTOFIELD_ITEMTAG3);
    }

    @JsonIgnore
    public PSAppSBItemDTO itemtag3(String itemTag3) {
        this.setItemTag3(itemTag3);
        return this;
    }

    @JsonProperty(value="itemtag4")
    public void setItemTag4(String itemTag4) {
        this._set(DTOFIELD_ITEMTAG4, itemTag4);
    }

    @JsonIgnore
    public String getItemTag4() {
        Object objValue = this._get(DTOFIELD_ITEMTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag4Dirty() {
        return this._contains(DTOFIELD_ITEMTAG4);
    }

    @JsonIgnore
    public void resetItemTag4() {
        this._reset(DTOFIELD_ITEMTAG4);
    }

    @JsonIgnore
    public PSAppSBItemDTO itemtag4(String itemTag4) {
        this.setItemTag4(itemTag4);
        return this;
    }

    @JsonProperty(value="itemtype")
    public void setItemType(String itemType) {
        this._set(DTOFIELD_ITEMTYPE, itemType);
    }

    @JsonIgnore
    public String getItemType() {
        Object objValue = this._get(DTOFIELD_ITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTypeDirty() {
        return this._contains(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public void resetItemType() {
        this._reset(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public PSAppSBItemDTO itemtype(String itemType) {
        this.setItemType(itemType);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO itemtype(PSModelEnums.AppStoryBoardItemType itemType) {
        if (itemType == null) {
            this.setItemType(null);
        } else {
            this.setItemType(itemType.value);
        }
        return this;
    }

    @JsonProperty(value="leftpos")
    public void setLeftPos(Integer leftPos) {
        this._set(DTOFIELD_LEFTPOS, leftPos);
    }

    @JsonIgnore
    public Integer getLeftPos() {
        Object objValue = this._get(DTOFIELD_LEFTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLeftPosDirty() {
        return this._contains(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public void resetLeftPos() {
        this._reset(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public PSAppSBItemDTO leftpos(Integer leftPos) {
        this.setLeftPos(leftPos);
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
    public PSAppSBItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psappsbitemid")
    public void setPSAppSBItemId(String pSAppSBItemId) {
        this._set(DTOFIELD_PSAPPSBITEMID, pSAppSBItemId);
    }

    @JsonIgnore
    public String getPSAppSBItemId() {
        Object objValue = this._get(DTOFIELD_PSAPPSBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSBItemIdDirty() {
        return this._contains(DTOFIELD_PSAPPSBITEMID);
    }

    @JsonIgnore
    public void resetPSAppSBItemId() {
        this._reset(DTOFIELD_PSAPPSBITEMID);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappsbitemid(String pSAppSBItemId) {
        this.setPSAppSBItemId(pSAppSBItemId);
        return this;
    }

    @JsonProperty(value="psappsbitemname")
    public void setPSAppSBItemName(String pSAppSBItemName) {
        this._set(DTOFIELD_PSAPPSBITEMNAME, pSAppSBItemName);
    }

    @JsonIgnore
    public String getPSAppSBItemName() {
        Object objValue = this._get(DTOFIELD_PSAPPSBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSBItemNameDirty() {
        return this._contains(DTOFIELD_PSAPPSBITEMNAME);
    }

    @JsonIgnore
    public void resetPSAppSBItemName() {
        this._reset(DTOFIELD_PSAPPSBITEMNAME);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappsbitemname(String pSAppSBItemName) {
        this.setPSAppSBItemName(pSAppSBItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppSBItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppSBItemName(strName);
    }

    @JsonIgnore
    public PSAppSBItemDTO name(String strName) {
        this.setPSAppSBItemName(strName);
        return this;
    }

    @JsonProperty(value="psappstoryboardid")
    public void setPSAppStoryBoardId(String pSAppStoryBoardId) {
        this._set(DTOFIELD_PSAPPSTORYBOARDID, pSAppStoryBoardId);
    }

    @JsonIgnore
    public String getPSAppStoryBoardId() {
        Object objValue = this._get(DTOFIELD_PSAPPSTORYBOARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppStoryBoardIdDirty() {
        return this._contains(DTOFIELD_PSAPPSTORYBOARDID);
    }

    @JsonIgnore
    public void resetPSAppStoryBoardId() {
        this._reset(DTOFIELD_PSAPPSTORYBOARDID);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappstoryboardid(String pSAppStoryBoardId) {
        this.setPSAppStoryBoardId(pSAppStoryBoardId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO psappstoryboardid(PSAppStoryBoardDTO pSAppStoryBoard) {
        if (pSAppStoryBoard == null) {
            this.setPSAppStoryBoardId(null);
            this.setPSAppStoryBoardName(null);
            this.setPSSysAppId(null);
        } else {
            this.setPSAppStoryBoardId(pSAppStoryBoard.getPSAppStoryBoardId());
            this.setPSAppStoryBoardName(pSAppStoryBoard.getPSAppStoryBoardName());
            this.setPSSysAppId(pSAppStoryBoard.getPSSysAppId());
        }
        return this;
    }

    @JsonProperty(value="psappstoryboardname")
    public void setPSAppStoryBoardName(String pSAppStoryBoardName) {
        this._set(DTOFIELD_PSAPPSTORYBOARDNAME, pSAppStoryBoardName);
    }

    @JsonIgnore
    public String getPSAppStoryBoardName() {
        Object objValue = this._get(DTOFIELD_PSAPPSTORYBOARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppStoryBoardNameDirty() {
        return this._contains(DTOFIELD_PSAPPSTORYBOARDNAME);
    }

    @JsonIgnore
    public void resetPSAppStoryBoardName() {
        this._reset(DTOFIELD_PSAPPSTORYBOARDNAME);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappstoryboardname(String pSAppStoryBoardName) {
        this.setPSAppStoryBoardName(pSAppStoryBoardName);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppSBItemDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSAppSBItemDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
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
    public PSAppSBItemDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
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
    public PSAppSBItemDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSAppSBItemDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysusecaseid")
    public void setPSSysUseCaseId(String pSSysUseCaseId) {
        this._set(DTOFIELD_PSSYSUSECASEID, pSSysUseCaseId);
        this._set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
    }

    @JsonIgnore
    public String getPSSysUseCaseId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASEID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSECASEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty() {
        if (this._contains(DTOFIELD_PSSYSUSECASEID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public void resetPSSysUseCaseId() {
        this._reset(DTOFIELD_PSSYSUSECASEID);
        this._reset(FIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public PSAppSBItemDTO pssysusecaseid(String pSSysUseCaseId) {
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId() {
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUserCaseId(String pSSysUserCaseId) {
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty() {
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId() {
        this.resetPSSysUseCaseId();
    }

    @JsonProperty(value="pssysusecasename")
    public void setPSSysUseCaseName(String pSSysUseCaseName) {
        this._set(DTOFIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        this._set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
    }

    @JsonIgnore
    public String getPSSysUseCaseName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSUSECASENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty() {
        if (this._contains(DTOFIELD_PSSYSUSECASENAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public void resetPSSysUseCaseName() {
        this._reset(DTOFIELD_PSSYSUSECASENAME);
        this._reset(FIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public PSAppSBItemDTO pssysusecasename(String pSSysUseCaseName) {
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName() {
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSSysUserCaseName(String pSSysUserCaseName) {
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty() {
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName() {
        this.resetPSSysUseCaseName();
    }

    @JsonProperty(value="rootitem")
    public void setRootItem(Integer rootItem) {
        this._set(DTOFIELD_ROOTITEM, rootItem);
    }

    @JsonIgnore
    public Integer getRootItem() {
        Object objValue = this._get(DTOFIELD_ROOTITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRootItemDirty() {
        return this._contains(DTOFIELD_ROOTITEM);
    }

    @JsonIgnore
    public void resetRootItem() {
        this._reset(DTOFIELD_ROOTITEM);
    }

    @JsonIgnore
    public PSAppSBItemDTO rootitem(Integer rootItem) {
        this.setRootItem(rootItem);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO rootitem(Boolean rootItem) {
        if (rootItem == null) {
            this.setRootItem(null);
        } else {
            this.setRootItem(rootItem != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="toppos")
    public void setTopPos(Integer topPos) {
        this._set(DTOFIELD_TOPPOS, topPos);
    }

    @JsonIgnore
    public Integer getTopPos() {
        Object objValue = this._get(DTOFIELD_TOPPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTopPosDirty() {
        return this._contains(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public void resetTopPos() {
        this._reset(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public PSAppSBItemDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
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
    public PSAppSBItemDTO updatedate(Timestamp updateDate) {
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
    public PSAppSBItemDTO updateman(String updateMan) {
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
    public PSAppSBItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userflag")
    public void setUserFlag(Integer userFlag) {
        this._set(DTOFIELD_USERFLAG, userFlag);
    }

    @JsonIgnore
    public Integer getUserFlag() {
        Object objValue = this._get(DTOFIELD_USERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserFlagDirty() {
        return this._contains(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public void resetUserFlag() {
        this._reset(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public PSAppSBItemDTO userflag(Integer userFlag) {
        this.setUserFlag(userFlag);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO userflag(Boolean userFlag) {
        if (userFlag == null) {
            this.setUserFlag(null);
        } else {
            this.setUserFlag(userFlag != false ? 1 : 0);
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
    public PSAppSBItemDTO usertag(String userTag) {
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
    public PSAppSBItemDTO usertag2(String userTag2) {
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
    public PSAppSBItemDTO usertag3(String userTag3) {
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
    public PSAppSBItemDTO usertag4(String userTag4) {
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
    public PSAppSBItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSAppSBItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppSBItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppSBItemId(strValue);
    }

    @JsonIgnore
    public PSAppSBItemDTO id(String strValue) {
        this.setPSAppSBItemId(strValue);
        return this;
    }
}
