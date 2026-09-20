package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppMenuDTO
extends PSModelDTOBase {
    public static final String FIELD_APPMENUSTYLE = "APPMENUSTYLE";
    protected static final String DTOFIELD_APPMENUSTYLE = "appmenustyle";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMIZEDFLAG = "CUSTOMIZEDFLAG";
    protected static final String DTOFIELD_CUSTOMIZEDFLAG = "customizedflag";
    public static final String FIELD_FLEXALIGN = "FLEXALIGN";
    protected static final String DTOFIELD_FLEXALIGN = "flexalign";
    public static final String FIELD_FLEXDIR = "FLEXDIR";
    protected static final String DTOFIELD_FLEXDIR = "flexdir";
    public static final String FIELD_FLEXVALIGN = "FLEXVALIGN";
    protected static final String DTOFIELD_FLEXVALIGN = "flexvalign";
    public static final String FIELD_FROMOBJID = "FROMOBJID";
    protected static final String DTOFIELD_FROMOBJID = "fromobjid";
    public static final String FIELD_ICONALIGN = "ICONALIGN";
    protected static final String DTOFIELD_ICONALIGN = "iconalign";
    public static final String FIELD_JSMODEL = "JSMODEL";
    protected static final String DTOFIELD_JSMODEL = "jsmodel";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MENUSN = "MENUSN";
    protected static final String DTOFIELD_MENUSN = "menusn";
    public static final String FIELD_OWNERID = "OWNERID";
    protected static final String DTOFIELD_OWNERID = "ownerid";
    public static final String FIELD_OWNERTAG = "OWNERTAG";
    protected static final String DTOFIELD_OWNERTAG = "ownertag";
    public static final String FIELD_OWNERTYPE = "OWNERTYPE";
    protected static final String DTOFIELD_OWNERTYPE = "ownertype";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSCTRLMSGID = "PSCTRLMSGID";
    protected static final String DTOFIELD_PSCTRLMSGID = "psctrlmsgid";
    public static final String FIELD_PSCTRLMSGNAME = "PSCTRLMSGNAME";
    protected static final String DTOFIELD_PSCTRLMSGNAME = "psctrlmsgname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_PUBLICFLAG = "PUBLICFLAG";
    protected static final String DTOFIELD_PUBLICFLAG = "publicflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String DTOFIELD_PSAPPMENUITEMS = "psappmenuitems";
    public static final String DTOFIELD_PSAPPMENULOGICS = "psappmenulogics";

    @JsonProperty(value="appmenustyle")
    public void setAppMenuStyle(String appMenuStyle) {
        this._set(DTOFIELD_APPMENUSTYLE, appMenuStyle);
    }

    @JsonIgnore
    public String getAppMenuStyle() {
        Object objValue = this._get(DTOFIELD_APPMENUSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppMenuStyleDirty() {
        return this._contains(DTOFIELD_APPMENUSTYLE);
    }

    @JsonIgnore
    public void resetAppMenuStyle() {
        this._reset(DTOFIELD_APPMENUSTYLE);
    }

    @JsonIgnore
    public PSAppMenuDTO appmenustyle(String appMenuStyle) {
        this.setAppMenuStyle(appMenuStyle);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO appmenustyle(PSModelEnums.AppMenuStyle appMenuStyle) {
        if (appMenuStyle == null) {
            this.setAppMenuStyle(null);
        } else {
            this.setAppMenuStyle(appMenuStyle.value);
        }
        return this;
    }

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
    public PSAppMenuDTO codename(String codeName) {
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
    public PSAppMenuDTO createdate(Timestamp createDate) {
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
    public PSAppMenuDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customizedflag")
    public void setCustomizedFlag(Integer customizedFlag) {
        this._set(DTOFIELD_CUSTOMIZEDFLAG, customizedFlag);
    }

    @JsonIgnore
    public Integer getCustomizedFlag() {
        Object objValue = this._get(DTOFIELD_CUSTOMIZEDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomizedFlagDirty() {
        return this._contains(DTOFIELD_CUSTOMIZEDFLAG);
    }

    @JsonIgnore
    public void resetCustomizedFlag() {
        this._reset(DTOFIELD_CUSTOMIZEDFLAG);
    }

    @JsonIgnore
    public PSAppMenuDTO customizedflag(Integer customizedFlag) {
        this.setCustomizedFlag(customizedFlag);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO customizedflag(Boolean customizedFlag) {
        if (customizedFlag == null) {
            this.setCustomizedFlag(null);
        } else {
            this.setCustomizedFlag(customizedFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="flexalign")
    public void setFlexAlign(String flexAlign) {
        this._set(DTOFIELD_FLEXALIGN, flexAlign);
    }

    @JsonIgnore
    public String getFlexAlign() {
        Object objValue = this._get(DTOFIELD_FLEXALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexAlignDirty() {
        return this._contains(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public void resetFlexAlign() {
        this._reset(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public PSAppMenuDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
        if (flexAlign == null) {
            this.setFlexAlign(null);
        } else {
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    @JsonProperty(value="flexdir")
    public void setFlexDir(String flexDir) {
        this._set(DTOFIELD_FLEXDIR, flexDir);
    }

    @JsonIgnore
    public String getFlexDir() {
        Object objValue = this._get(DTOFIELD_FLEXDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexDirDirty() {
        return this._contains(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public void resetFlexDir() {
        this._reset(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public PSAppMenuDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
        if (flexDir == null) {
            this.setFlexDir(null);
        } else {
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    @JsonProperty(value="flexvalign")
    public void setFlexVAlign(String flexVAlign) {
        this._set(DTOFIELD_FLEXVALIGN, flexVAlign);
    }

    @JsonIgnore
    public String getFlexVAlign() {
        Object objValue = this._get(DTOFIELD_FLEXVALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexVAlignDirty() {
        return this._contains(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public void resetFlexVAlign() {
        this._reset(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public PSAppMenuDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
        if (flexVAlign == null) {
            this.setFlexVAlign(null);
        } else {
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    @JsonProperty(value="fromobjid")
    public void setFromObjId(String fromObjId) {
        this._set(DTOFIELD_FROMOBJID, fromObjId);
    }

    @JsonIgnore
    public String getFromObjId() {
        Object objValue = this._get(DTOFIELD_FROMOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFromObjIdDirty() {
        return this._contains(DTOFIELD_FROMOBJID);
    }

    @JsonIgnore
    public void resetFromObjId() {
        this._reset(DTOFIELD_FROMOBJID);
    }

    @JsonIgnore
    public PSAppMenuDTO fromobjid(String fromObjId) {
        this.setFromObjId(fromObjId);
        return this;
    }

    @JsonProperty(value="iconalign")
    public void setIconAlign(String iconAlign) {
        this._set(DTOFIELD_ICONALIGN, iconAlign);
    }

    @JsonIgnore
    public String getIconAlign() {
        Object objValue = this._get(DTOFIELD_ICONALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconAlignDirty() {
        return this._contains(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public void resetIconAlign() {
        this._reset(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public PSAppMenuDTO iconalign(String iconAlign) {
        this.setIconAlign(iconAlign);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO iconalign(PSModelEnums.ButtonIconAlign iconAlign) {
        if (iconAlign == null) {
            this.setIconAlign(null);
        } else {
            this.setIconAlign(iconAlign.value);
        }
        return this;
    }

    @JsonProperty(value="jsmodel")
    public void setJSModel(String jSModel) {
        this._set(DTOFIELD_JSMODEL, jSModel);
    }

    @JsonIgnore
    public String getJSModel() {
        Object objValue = this._get(DTOFIELD_JSMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJSModelDirty() {
        return this._contains(DTOFIELD_JSMODEL);
    }

    @JsonIgnore
    public void resetJSModel() {
        this._reset(DTOFIELD_JSMODEL);
    }

    @JsonIgnore
    public PSAppMenuDTO jsmodel(String jSModel) {
        this.setJSModel(jSModel);
        return this;
    }

    @JsonProperty(value="layoutmode")
    public void setLayoutMode(String layoutMode) {
        this._set(DTOFIELD_LAYOUTMODE, layoutMode);
    }

    @JsonIgnore
    public String getLayoutMode() {
        Object objValue = this._get(DTOFIELD_LAYOUTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutModeDirty() {
        return this._contains(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public void resetLayoutMode() {
        this._reset(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public PSAppMenuDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
        if (layoutMode == null) {
            this.setLayoutMode(null);
        } else {
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSAppMenuDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="menusn")
    public void setMenuSN(String menuSN) {
        this._set(DTOFIELD_MENUSN, menuSN);
    }

    @JsonIgnore
    public String getMenuSN() {
        Object objValue = this._get(DTOFIELD_MENUSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMenuSNDirty() {
        return this._contains(DTOFIELD_MENUSN);
    }

    @JsonIgnore
    public void resetMenuSN() {
        this._reset(DTOFIELD_MENUSN);
    }

    @JsonIgnore
    public PSAppMenuDTO menusn(String menuSN) {
        this.setMenuSN(menuSN);
        return this;
    }

    @JsonProperty(value="ownerid")
    public void setOwnerId(String ownerId) {
        this._set(DTOFIELD_OWNERID, ownerId);
    }

    @JsonIgnore
    public String getOwnerId() {
        Object objValue = this._get(DTOFIELD_OWNERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerIdDirty() {
        return this._contains(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public void resetOwnerId() {
        this._reset(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public PSAppMenuDTO ownerid(String ownerId) {
        this.setOwnerId(ownerId);
        return this;
    }

    @JsonProperty(value="ownertag")
    public void setOwnerTag(String ownerTag) {
        this._set(DTOFIELD_OWNERTAG, ownerTag);
    }

    @JsonIgnore
    public String getOwnerTag() {
        Object objValue = this._get(DTOFIELD_OWNERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerTagDirty() {
        return this._contains(DTOFIELD_OWNERTAG);
    }

    @JsonIgnore
    public void resetOwnerTag() {
        this._reset(DTOFIELD_OWNERTAG);
    }

    @JsonIgnore
    public PSAppMenuDTO ownertag(String ownerTag) {
        this.setOwnerTag(ownerTag);
        return this;
    }

    @JsonProperty(value="ownertype")
    public void setOwnerType(String ownerType) {
        this._set(DTOFIELD_OWNERTYPE, ownerType);
    }

    @JsonIgnore
    public String getOwnerType() {
        Object objValue = this._get(DTOFIELD_OWNERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerTypeDirty() {
        return this._contains(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public void resetOwnerType() {
        this._reset(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public PSAppMenuDTO ownertype(String ownerType) {
        this.setOwnerType(ownerType);
        return this;
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSAppMenuDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppMenuName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppMenuName(strName);
    }

    @JsonIgnore
    public PSAppMenuDTO name(String strName) {
        this.setPSAppMenuName(strName);
        return this;
    }

    @JsonProperty(value="psctrlmsgid")
    public void setPSCtrlMsgId(String pSCtrlMsgId) {
        this._set(DTOFIELD_PSCTRLMSGID, pSCtrlMsgId);
    }

    @JsonIgnore
    public String getPSCtrlMsgId() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public void resetPSCtrlMsgId() {
        this._reset(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public PSAppMenuDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
        if (pSCtrlMsg == null) {
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        } else {
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    @JsonProperty(value="psctrlmsgname")
    public void setPSCtrlMsgName(String pSCtrlMsgName) {
        this._set(DTOFIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }

    @JsonIgnore
    public String getPSCtrlMsgName() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public void resetPSCtrlMsgName() {
        this._reset(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSAppMenuDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssyscounterid")
    public void setPSSysCounterId(String pSSysCounterId) {
        this._set(DTOFIELD_PSSYSCOUNTERID, pSSysCounterId);
    }

    @JsonIgnore
    public String getPSSysCounterId() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterIdDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public void resetPSSysCounterId() {
        this._reset(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
        if (pSSysCounter == null) {
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        } else {
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    @JsonProperty(value="pssyscountername")
    public void setPSSysCounterName(String pSSysCounterName) {
        this._set(DTOFIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }

    @JsonIgnore
    public String getPSSysCounterName() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterNameDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public void resetPSSysCounterName() {
        this._reset(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSAppMenuDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSAppMenuDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSAppMenuDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSAppMenuDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="publicflag")
    public void setPublicFlag(Integer publicFlag) {
        this._set(DTOFIELD_PUBLICFLAG, publicFlag);
    }

    @JsonIgnore
    public Integer getPublicFlag() {
        Object objValue = this._get(DTOFIELD_PUBLICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPublicFlagDirty() {
        return this._contains(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public void resetPublicFlag() {
        this._reset(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public PSAppMenuDTO publicflag(Integer publicFlag) {
        this.setPublicFlag(publicFlag);
        return this;
    }

    @JsonIgnore
    public PSAppMenuDTO publicflag(Boolean publicFlag) {
        if (publicFlag == null) {
            this.setPublicFlag(null);
        } else {
            this.setPublicFlag(publicFlag != false ? 1 : 0);
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
    public PSAppMenuDTO updatedate(Timestamp updateDate) {
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
    public PSAppMenuDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSAppMenuDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSAppMenuDTO usertag(String userTag) {
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
    public PSAppMenuDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppMenuId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppMenuId(strValue);
    }

    @JsonIgnore
    public PSAppMenuDTO id(String strValue) {
        this.setPSAppMenuId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSAppMenuItemDTO> getPSAppMenuItems() {
        Object list = this._get(DTOFIELD_PSAPPMENUITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psappmenuitems")
    public void setPSAppMenuItems(List<PSAppMenuItemDTO> psappmenuitems) {
        this._set(DTOFIELD_PSAPPMENUITEMS, psappmenuitems);
    }

    @JsonIgnore
    public List<PSAppMenuItemDTO> getPSAppMenuItemsIf() {
        Object list = this._get(DTOFIELD_PSAPPMENUITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSAPPMENUITEMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSAppMenuLogicDTO> getPSAppMenuLogics() {
        Object list = this._get(DTOFIELD_PSAPPMENULOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psappmenulogics")
    public void setPSAppMenuLogics(List<PSAppMenuLogicDTO> psappmenulogics) {
        this._set(DTOFIELD_PSAPPMENULOGICS, psappmenulogics);
    }

    @JsonIgnore
    public List<PSAppMenuLogicDTO> getPSAppMenuLogicsIf() {
        Object list = this._get(DTOFIELD_PSAPPMENULOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSAPPMENULOGICS, list);
        }
        return (List) list;
    }
}
