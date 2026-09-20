package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSViewTypeDTO
extends PSModelDTOBase {
    public static final String FIELD_APPVIEWOBJ = "APPVIEWOBJ";
    protected static final String DTOFIELD_APPVIEWOBJ = "appviewobj";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DESCURL = "DESCURL";
    protected static final String DTOFIELD_DESCURL = "descurl";
    public static final String FIELD_DEVIEWMODE = "DEVIEWMODE";
    protected static final String DTOFIELD_DEVIEWMODE = "deviewmode";
    public static final String FIELD_DEVIEWOBJ = "DEVIEWOBJ";
    protected static final String DTOFIELD_DEVIEWOBJ = "deviewobj";
    public static final String FIELD_EMBEDVIEWFLAG = "EMBEDVIEWFLAG";
    protected static final String DTOFIELD_EMBEDVIEWFLAG = "embedviewflag";
    public static final String FIELD_ENABLEDYNATOOL = "ENABLEDYNATOOL";
    protected static final String DTOFIELD_ENABLEDYNATOOL = "enabledynatool";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_LAYOUTMODEL = "LAYOUTMODEL";
    protected static final String DTOFIELD_LAYOUTMODEL = "layoutmodel";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSVIEWENGINEID = "PSVIEWENGINEID";
    protected static final String DTOFIELD_PSVIEWENGINEID = "psviewengineid";
    public static final String FIELD_PSVIEWENGINENAME = "PSVIEWENGINENAME";
    protected static final String DTOFIELD_PSVIEWENGINENAME = "psviewenginename";
    public static final String FIELD_PSVIEWTYPEID = "PSVIEWTYPEID";
    protected static final String DTOFIELD_PSVIEWTYPEID = "psviewtypeid";
    public static final String FIELD_PSVIEWTYPENAME = "PSVIEWTYPENAME";
    protected static final String DTOFIELD_PSVIEWTYPENAME = "psviewtypename";
    public static final String FIELD_TITLE = "TITLE";
    protected static final String DTOFIELD_TITLE = "title";
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
    public static final String FIELD_VIEWOBJINT = "VIEWOBJINT";
    protected static final String DTOFIELD_VIEWOBJINT = "viewobjint";
    public static final String FIELD_VTFULLSN = "VTFULLSN";
    protected static final String DTOFIELD_VTFULLSN = "vtfullsn";
    public static final String FIELD_VTSN = "VTSN";
    protected static final String DTOFIELD_VTSN = "vtsn";
    public static final String DTODTOFIELD_PSVTCTRLS = "psvtctrls";

    @JsonProperty(value="appviewobj")
    public void setAppViewObj(String appViewObj) {
        this._set(DTOFIELD_APPVIEWOBJ, appViewObj);
    }

    @JsonIgnore
    public String getAppViewObj() {
        Object objValue = this._get(DTOFIELD_APPVIEWOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppViewObjDirty() {
        return this._contains(DTOFIELD_APPVIEWOBJ);
    }

    @JsonIgnore
    public void resetAppViewObj() {
        this._reset(DTOFIELD_APPVIEWOBJ);
    }

    @JsonIgnore
    public PSViewTypeDTO appviewobj(String appViewObj) {
        this.setAppViewObj(appViewObj);
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
    public PSViewTypeDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSViewTypeDTO color(String color) {
        this.setColor(color);
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
    public PSViewTypeDTO createdate(Timestamp createDate) {
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
    public PSViewTypeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="descurl")
    public void setDescURL(String descURL) {
        this._set(DTOFIELD_DESCURL, descURL);
    }

    @JsonIgnore
    public String getDescURL() {
        Object objValue = this._get(DTOFIELD_DESCURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDescURLDirty() {
        return this._contains(DTOFIELD_DESCURL);
    }

    @JsonIgnore
    public void resetDescURL() {
        this._reset(DTOFIELD_DESCURL);
    }

    @JsonIgnore
    public PSViewTypeDTO descurl(String descURL) {
        this.setDescURL(descURL);
        return this;
    }

    @JsonProperty(value="deviewmode")
    public void setDEViewMode(Integer dEViewMode) {
        this._set(DTOFIELD_DEVIEWMODE, dEViewMode);
    }

    @JsonIgnore
    public Integer getDEViewMode() {
        Object objValue = this._get(DTOFIELD_DEVIEWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEViewModeDirty() {
        return this._contains(DTOFIELD_DEVIEWMODE);
    }

    @JsonIgnore
    public void resetDEViewMode() {
        this._reset(DTOFIELD_DEVIEWMODE);
    }

    @JsonIgnore
    public PSViewTypeDTO deviewmode(Integer dEViewMode) {
        this.setDEViewMode(dEViewMode);
        return this;
    }

    @JsonIgnore
    public PSViewTypeDTO deviewmode(Boolean dEViewMode) {
        if (dEViewMode == null) {
            this.setDEViewMode(null);
        } else {
            this.setDEViewMode(dEViewMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="deviewobj")
    public void setDEViewObj(String dEViewObj) {
        this._set(DTOFIELD_DEVIEWOBJ, dEViewObj);
    }

    @JsonIgnore
    public String getDEViewObj() {
        Object objValue = this._get(DTOFIELD_DEVIEWOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDEViewObjDirty() {
        return this._contains(DTOFIELD_DEVIEWOBJ);
    }

    @JsonIgnore
    public void resetDEViewObj() {
        this._reset(DTOFIELD_DEVIEWOBJ);
    }

    @JsonIgnore
    public PSViewTypeDTO deviewobj(String dEViewObj) {
        this.setDEViewObj(dEViewObj);
        return this;
    }

    @JsonProperty(value="embedviewflag")
    public void setEmbedViewFlag(Integer embedViewFlag) {
        this._set(DTOFIELD_EMBEDVIEWFLAG, embedViewFlag);
    }

    @JsonIgnore
    public Integer getEmbedViewFlag() {
        Object objValue = this._get(DTOFIELD_EMBEDVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEmbedViewFlagDirty() {
        return this._contains(DTOFIELD_EMBEDVIEWFLAG);
    }

    @JsonIgnore
    public void resetEmbedViewFlag() {
        this._reset(DTOFIELD_EMBEDVIEWFLAG);
    }

    @JsonIgnore
    public PSViewTypeDTO embedviewflag(Integer embedViewFlag) {
        this.setEmbedViewFlag(embedViewFlag);
        return this;
    }

    @JsonIgnore
    public PSViewTypeDTO embedviewflag(Boolean embedViewFlag) {
        if (embedViewFlag == null) {
            this.setEmbedViewFlag(null);
        } else {
            this.setEmbedViewFlag(embedViewFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledynatool")
    public void setEnableDynaTool(Integer enableDynaTool) {
        this._set(DTOFIELD_ENABLEDYNATOOL, enableDynaTool);
    }

    @JsonIgnore
    public Integer getEnableDynaTool() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNATOOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaToolDirty() {
        return this._contains(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public void resetEnableDynaTool() {
        this._reset(DTOFIELD_ENABLEDYNATOOL);
    }

    @JsonIgnore
    public PSViewTypeDTO enabledynatool(Integer enableDynaTool) {
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

    @JsonIgnore
    public PSViewTypeDTO enabledynatool(Boolean enableDynaTool) {
        if (enableDynaTool == null) {
            this.setEnableDynaTool(null);
        } else {
            this.setEnableDynaTool(enableDynaTool != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="iconpath")
    public void setIconPath(String iconPath) {
        this._set(DTOFIELD_ICONPATH, iconPath);
    }

    @JsonIgnore
    public String getIconPath() {
        Object objValue = this._get(DTOFIELD_ICONPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathDirty() {
        return this._contains(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public void resetIconPath() {
        this._reset(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public PSViewTypeDTO iconpath(String iconPath) {
        this.setIconPath(iconPath);
        return this;
    }

    @JsonProperty(value="layoutmodel")
    public void setLayoutModel(String layoutModel) {
        this._set(DTOFIELD_LAYOUTMODEL, layoutModel);
    }

    @JsonIgnore
    public String getLayoutModel() {
        Object objValue = this._get(DTOFIELD_LAYOUTMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutModelDirty() {
        return this._contains(DTOFIELD_LAYOUTMODEL);
    }

    @JsonIgnore
    public void resetLayoutModel() {
        this._reset(DTOFIELD_LAYOUTMODEL);
    }

    @JsonIgnore
    public PSViewTypeDTO layoutmodel(String layoutModel) {
        this.setLayoutModel(layoutModel);
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
    public PSViewTypeDTO memo(String memo) {
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
    public PSViewTypeDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psviewengineid")
    public void setPSViewEngineId(String pSViewEngineId) {
        this._set(DTOFIELD_PSVIEWENGINEID, pSViewEngineId);
    }

    @JsonIgnore
    public String getPSViewEngineId() {
        Object objValue = this._get(DTOFIELD_PSVIEWENGINEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewEngineIdDirty() {
        return this._contains(DTOFIELD_PSVIEWENGINEID);
    }

    @JsonIgnore
    public void resetPSViewEngineId() {
        this._reset(DTOFIELD_PSVIEWENGINEID);
    }

    @JsonIgnore
    public PSViewTypeDTO psviewengineid(String pSViewEngineId) {
        this.setPSViewEngineId(pSViewEngineId);
        return this;
    }

    @JsonProperty(value="psviewenginename")
    public void setPSViewEngineName(String pSViewEngineName) {
        this._set(DTOFIELD_PSVIEWENGINENAME, pSViewEngineName);
    }

    @JsonIgnore
    public String getPSViewEngineName() {
        Object objValue = this._get(DTOFIELD_PSVIEWENGINENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewEngineNameDirty() {
        return this._contains(DTOFIELD_PSVIEWENGINENAME);
    }

    @JsonIgnore
    public void resetPSViewEngineName() {
        this._reset(DTOFIELD_PSVIEWENGINENAME);
    }

    @JsonIgnore
    public PSViewTypeDTO psviewenginename(String pSViewEngineName) {
        this.setPSViewEngineName(pSViewEngineName);
        return this;
    }

    @JsonProperty(value="psviewtypeid")
    public void setPSViewTypeId(String pSViewTypeId) {
        this._set(DTOFIELD_PSVIEWTYPEID, pSViewTypeId);
    }

    @JsonIgnore
    public String getPSViewTypeId() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeIdDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public void resetPSViewTypeId() {
        this._reset(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public PSViewTypeDTO psviewtypeid(String pSViewTypeId) {
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    @JsonProperty(value="psviewtypename")
    public void setPSViewTypeName(String pSViewTypeName) {
        this._set(DTOFIELD_PSVIEWTYPENAME, pSViewTypeName);
    }

    @JsonIgnore
    public String getPSViewTypeName() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeNameDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public void resetPSViewTypeName() {
        this._reset(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public PSViewTypeDTO psviewtypename(String pSViewTypeName) {
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSViewTypeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSViewTypeName(strName);
    }

    @JsonIgnore
    public PSViewTypeDTO name(String strName) {
        this.setPSViewTypeName(strName);
        return this;
    }

    @JsonProperty(value="title")
    public void setTitle(String title) {
        this._set(DTOFIELD_TITLE, title);
    }

    @JsonIgnore
    public String getTitle() {
        Object objValue = this._get(DTOFIELD_TITLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleDirty() {
        return this._contains(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public void resetTitle() {
        this._reset(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public PSViewTypeDTO title(String title) {
        this.setTitle(title);
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
    public PSViewTypeDTO updatedate(Timestamp updateDate) {
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
    public PSViewTypeDTO updateman(String updateMan) {
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
    public PSViewTypeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSViewTypeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSViewTypeDTO usertag(String userTag) {
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
    public PSViewTypeDTO usertag2(String userTag2) {
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
    public PSViewTypeDTO usertag3(String userTag3) {
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
    public PSViewTypeDTO usertag4(String userTag4) {
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
    public PSViewTypeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSViewTypeDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewobjint")
    public void setViewObjInt(String viewObjInt) {
        this._set(DTOFIELD_VIEWOBJINT, viewObjInt);
    }

    @JsonIgnore
    public String getViewObjInt() {
        Object objValue = this._get(DTOFIELD_VIEWOBJINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewObjIntDirty() {
        return this._contains(DTOFIELD_VIEWOBJINT);
    }

    @JsonIgnore
    public void resetViewObjInt() {
        this._reset(DTOFIELD_VIEWOBJINT);
    }

    @JsonIgnore
    public PSViewTypeDTO viewobjint(String viewObjInt) {
        this.setViewObjInt(viewObjInt);
        return this;
    }

    @JsonProperty(value="vtfullsn")
    public void setVTFullSN(String vTFullSN) {
        this._set(DTOFIELD_VTFULLSN, vTFullSN);
    }

    @JsonIgnore
    public String getVTFullSN() {
        Object objValue = this._get(DTOFIELD_VTFULLSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVTFullSNDirty() {
        return this._contains(DTOFIELD_VTFULLSN);
    }

    @JsonIgnore
    public void resetVTFullSN() {
        this._reset(DTOFIELD_VTFULLSN);
    }

    @JsonIgnore
    public PSViewTypeDTO vtfullsn(String vTFullSN) {
        this.setVTFullSN(vTFullSN);
        return this;
    }

    @JsonProperty(value="vtsn")
    public void setVTSN(String vTSN) {
        this._set(DTOFIELD_VTSN, vTSN);
    }

    @JsonIgnore
    public String getVTSN() {
        Object objValue = this._get(DTOFIELD_VTSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVTSNDirty() {
        return this._contains(DTOFIELD_VTSN);
    }

    @JsonIgnore
    public void resetVTSN() {
        this._reset(DTOFIELD_VTSN);
    }

    @JsonIgnore
    public PSViewTypeDTO vtsn(String vTSN) {
        this.setVTSN(vTSN);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSViewTypeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSViewTypeId(strValue);
    }

    @JsonIgnore
    public PSViewTypeDTO id(String strValue) {
        this.setPSViewTypeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSVTCtrlDTO> getPSVTCtrls() {
        Object list = this._get(DTODTOFIELD_PSVTCTRLS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psvtctrls")
    public void setPSVTCtrls(List<PSVTCtrlDTO> psappmenuitems) {
        this._set(DTODTOFIELD_PSVTCTRLS, psappmenuitems);
    }

    @JsonIgnore
    public List<PSVTCtrlDTO> getPSVTCtrlsIf() {
        Object list = this._get(DTODTOFIELD_PSVTCTRLS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTODTOFIELD_PSVTCTRLS, list);
        }
        return (List) list;
    }
}
