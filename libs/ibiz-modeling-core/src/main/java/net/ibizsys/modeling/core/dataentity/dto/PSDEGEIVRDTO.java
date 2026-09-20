package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEGEIVRDTO
extends PSModelDTOBase {
    public static final String FIELD_CHECKMODE = "CHECKMODE";
    protected static final String DTOFIELD_CHECKMODE = "checkmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELSTATE = "MODELSTATE";
    protected static final String DTOFIELD_MODELSTATE = "modelstate";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFVRID = "PSDEFVRID";
    protected static final String DTOFIELD_PSDEFVRID = "psdefvrid";
    public static final String FIELD_PSDEFVRNAME = "PSDEFVRNAME";
    protected static final String DTOFIELD_PSDEFVRNAME = "psdefvrname";
    public static final String FIELD_PSDEGEIVRID = "PSDEGEIVRID";
    protected static final String DTOFIELD_PSDEGEIVRID = "psdegeivrid";
    public static final String FIELD_PSDEGEIVRNAME = "PSDEGEIVRNAME";
    protected static final String DTOFIELD_PSDEGEIVRNAME = "psdegeivrname";
    public static final String FIELD_PSDEGRIDCOLID = "PSDEGRIDCOLID";
    protected static final String DTOFIELD_PSDEGRIDCOLID = "psdegridcolid";
    public static final String FIELD_PSDEGRIDCOLNAME = "PSDEGRIDCOLNAME";
    protected static final String DTOFIELD_PSDEGRIDCOLNAME = "psdegridcolname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
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
    public static final String FIELD_VRTYPE = "VRTYPE";
    protected static final String DTOFIELD_VRTYPE = "vrtype";

    @JsonProperty(value="checkmode")
    public void setCheckMode(Integer checkMode) {
        this._set(DTOFIELD_CHECKMODE, checkMode);
    }

    @JsonIgnore
    public Integer getCheckMode() {
        Object objValue = this._get(DTOFIELD_CHECKMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckModeDirty() {
        return this._contains(DTOFIELD_CHECKMODE);
    }

    @JsonIgnore
    public void resetCheckMode() {
        this._reset(DTOFIELD_CHECKMODE);
    }

    @JsonIgnore
    public PSDEGEIVRDTO checkmode(Integer checkMode) {
        this.setCheckMode(checkMode);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO checkmode(PSModelEnums.EditItemVRCheckMode checkMode) {
        if (checkMode == null) {
            this.setCheckMode(null);
        } else {
            this.setCheckMode(checkMode.value);
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
    public PSDEGEIVRDTO createdate(Timestamp createDate) {
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
    public PSDEGEIVRDTO createman(String createMan) {
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
    public PSDEGEIVRDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelstate")
    public void setModelState(Integer modelState) {
        this._set(DTOFIELD_MODELSTATE, modelState);
    }

    @JsonIgnore
    public Integer getModelState() {
        Object objValue = this._get(DTOFIELD_MODELSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelStateDirty() {
        return this._contains(DTOFIELD_MODELSTATE);
    }

    @JsonIgnore
    public void resetModelState() {
        this._reset(DTOFIELD_MODELSTATE);
    }

    @JsonIgnore
    public PSDEGEIVRDTO modelstate(Integer modelState) {
        this.setModelState(modelState);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO modelstate(PSModelEnums.DEFormDetailState[] modelState) {
        if (modelState == null || modelState.length == 0) {
            this.setModelState(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEFormDetailState _item : modelState) {
                _value |= _item.value;
            }
            this.setModelState(_value);
        }
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
    public PSDEGEIVRDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdefvrid")
    public void setPSDEFVRId(String pSDEFVRId) {
        this._set(DTOFIELD_PSDEFVRID, pSDEFVRId);
    }

    @JsonIgnore
    public String getPSDEFVRId() {
        Object objValue = this._get(DTOFIELD_PSDEFVRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRIdDirty() {
        return this._contains(DTOFIELD_PSDEFVRID);
    }

    @JsonIgnore
    public void resetPSDEFVRId() {
        this._reset(DTOFIELD_PSDEFVRID);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdefvrid(String pSDEFVRId) {
        this.setPSDEFVRId(pSDEFVRId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdefvrid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setPSDEFVRId(null);
            this.setPSDEFVRName(null);
        } else {
            this.setPSDEFVRId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFVRName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="psdefvrname")
    public void setPSDEFVRName(String pSDEFVRName) {
        this._set(DTOFIELD_PSDEFVRNAME, pSDEFVRName);
    }

    @JsonIgnore
    public String getPSDEFVRName() {
        Object objValue = this._get(DTOFIELD_PSDEFVRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRNameDirty() {
        return this._contains(DTOFIELD_PSDEFVRNAME);
    }

    @JsonIgnore
    public void resetPSDEFVRName() {
        this._reset(DTOFIELD_PSDEFVRNAME);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdefvrname(String pSDEFVRName) {
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    @JsonProperty(value="psdegeivrid")
    public void setPSDEGEIVRId(String pSDEGEIVRId) {
        this._set(DTOFIELD_PSDEGEIVRID, pSDEGEIVRId);
    }

    @JsonIgnore
    public String getPSDEGEIVRId() {
        Object objValue = this._get(DTOFIELD_PSDEGEIVRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIVRIdDirty() {
        return this._contains(DTOFIELD_PSDEGEIVRID);
    }

    @JsonIgnore
    public void resetPSDEGEIVRId() {
        this._reset(DTOFIELD_PSDEGEIVRID);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegeivrid(String pSDEGEIVRId) {
        this.setPSDEGEIVRId(pSDEGEIVRId);
        return this;
    }

    @JsonProperty(value="psdegeivrname")
    public void setPSDEGEIVRName(String pSDEGEIVRName) {
        this._set(DTOFIELD_PSDEGEIVRNAME, pSDEGEIVRName);
    }

    @JsonIgnore
    public String getPSDEGEIVRName() {
        Object objValue = this._get(DTOFIELD_PSDEGEIVRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIVRNameDirty() {
        return this._contains(DTOFIELD_PSDEGEIVRNAME);
    }

    @JsonIgnore
    public void resetPSDEGEIVRName() {
        this._reset(DTOFIELD_PSDEGEIVRNAME);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegeivrname(String pSDEGEIVRName) {
        this.setPSDEGEIVRName(pSDEGEIVRName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEGEIVRName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEGEIVRName(strName);
    }

    @JsonIgnore
    public PSDEGEIVRDTO name(String strName) {
        this.setPSDEGEIVRName(strName);
        return this;
    }

    @JsonProperty(value="psdegridcolid")
    public void setPSDEGridColId(String pSDEGridColId) {
        this._set(DTOFIELD_PSDEGRIDCOLID, pSDEGridColId);
    }

    @JsonIgnore
    public String getPSDEGridColId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public void resetPSDEGridColId() {
        this._reset(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolid(String pSDEGridColId) {
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolid(PSDEGridColDTO pSDEGridCol) {
        if (pSDEGridCol == null) {
            this.setPSDEGridColId(null);
            this.setPSDEGridColName(null);
        } else {
            this.setPSDEGridColId(pSDEGridCol.getPSDEGridColId());
            this.setPSDEGridColName(pSDEGridCol.getPSDEGridColName());
        }
        return this;
    }

    @JsonProperty(value="psdegridcolname")
    public void setPSDEGridColName(String pSDEGridColName) {
        this._set(DTOFIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }

    @JsonIgnore
    public String getPSDEGridColName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public void resetPSDEGridColName() {
        this._reset(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolname(String pSDEGridColName) {
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    @JsonProperty(value="psdegridid")
    public void setPSDEGridId(String pSDEGridId) {
        this._set(DTOFIELD_PSDEGRIDID, pSDEGridId);
    }

    @JsonIgnore
    public String getPSDEGridId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public void resetPSDEGridId() {
        this._reset(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridid(PSDEGridDTO pSDEGrid) {
        if (pSDEGrid == null) {
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        } else {
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    @JsonProperty(value="psdegridname")
    public void setPSDEGridName(String pSDEGridName) {
        this._set(DTOFIELD_PSDEGRIDNAME, pSDEGridName);
    }

    @JsonIgnore
    public String getPSDEGridName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public void resetPSDEGridName() {
        this._reset(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public PSDEGEIVRDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSSysValueRuleId() {
        this._reset(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public PSDEGEIVRDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
        if (pSSysValueRule == null) {
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        } else {
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="pssysvaluerulename")
    public void setPSSysValueRuleName(String pSSysValueRuleName) {
        this._set(DTOFIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }

    @JsonIgnore
    public String getPSSysValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSSysValueRuleName() {
        this._reset(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public PSDEGEIVRDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
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
    public PSDEGEIVRDTO updatedate(Timestamp updateDate) {
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
    public PSDEGEIVRDTO updateman(String updateMan) {
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
    public PSDEGEIVRDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEGEIVRDTO usertag(String userTag) {
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
    public PSDEGEIVRDTO usertag2(String userTag2) {
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
    public PSDEGEIVRDTO usertag3(String userTag3) {
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
    public PSDEGEIVRDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="vrtype")
    public void setVRType(String vRType) {
        this._set(DTOFIELD_VRTYPE, vRType);
    }

    @JsonIgnore
    public String getVRType() {
        Object objValue = this._get(DTOFIELD_VRTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVRTypeDirty() {
        return this._contains(DTOFIELD_VRTYPE);
    }

    @JsonIgnore
    public void resetVRType() {
        this._reset(DTOFIELD_VRTYPE);
    }

    @JsonIgnore
    public PSDEGEIVRDTO vrtype(String vRType) {
        this.setVRType(vRType);
        return this;
    }

    @JsonIgnore
    public PSDEGEIVRDTO vrtype(PSModelEnums.TargetVRType vRType) {
        if (vRType == null) {
            this.setVRType(null);
        } else {
            this.setVRType(vRType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEGEIVRId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEGEIVRId(strValue);
    }

    @JsonIgnore
    public PSDEGEIVRDTO id(String strValue) {
        this.setPSDEGEIVRId(strValue);
        return this;
    }
}
