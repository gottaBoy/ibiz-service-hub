package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFIVRDTO
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
    public static final String FIELD_PSDEFIID = "PSDEFIID";
    protected static final String DTOFIELD_PSDEFIID = "psdefiid";
    public static final String FIELD_PSDEFINAME = "PSDEFINAME";
    protected static final String DTOFIELD_PSDEFINAME = "psdefiname";
    public static final String FIELD_PSDEFIVRID = "PSDEFIVRID";
    protected static final String DTOFIELD_PSDEFIVRID = "psdefivrid";
    public static final String FIELD_PSDEFIVRNAME = "PSDEFIVRNAME";
    protected static final String DTOFIELD_PSDEFIVRNAME = "psdefivrname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEFVRID = "PSDEFVRID";
    protected static final String DTOFIELD_PSDEFVRID = "psdefvrid";
    public static final String FIELD_PSDEFVRNAME = "PSDEFVRNAME";
    protected static final String DTOFIELD_PSDEFVRNAME = "psdefvrname";
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
    public PSDEFIVRDTO checkmode(Integer checkMode) {
        this.setCheckMode(checkMode);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO checkmode(PSModelEnums.EditItemVRCheckMode checkMode) {
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
    public PSDEFIVRDTO createdate(Timestamp createDate) {
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
    public PSDEFIVRDTO createman(String createMan) {
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
    public PSDEFIVRDTO memo(String memo) {
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
    public PSDEFIVRDTO modelstate(Integer modelState) {
        this.setModelState(modelState);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO modelstate(PSModelEnums.DEFormDetailState[] modelState) {
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
    public PSDEFIVRDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdefiid")
    public void setPSDEFIId(String pSDEFIId) {
        this._set(DTOFIELD_PSDEFIID, pSDEFIId);
    }

    @JsonIgnore
    public String getPSDEFIId() {
        Object objValue = this._get(DTOFIELD_PSDEFIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIIdDirty() {
        return this._contains(DTOFIELD_PSDEFIID);
    }

    @JsonIgnore
    public void resetPSDEFIId() {
        this._reset(DTOFIELD_PSDEFIID);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefiid(String pSDEFIId) {
        this.setPSDEFIId(pSDEFIId);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefiid(PSDEFormDetailDTO pSDEFormDetail) {
        if (pSDEFormDetail == null) {
            this.setPSDEFIId(null);
            this.setPSDEFIName(null);
        } else {
            this.setPSDEFIId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPSDEFIName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    @JsonProperty(value="psdefiname")
    public void setPSDEFIName(String pSDEFIName) {
        this._set(DTOFIELD_PSDEFINAME, pSDEFIName);
    }

    @JsonIgnore
    public String getPSDEFIName() {
        Object objValue = this._get(DTOFIELD_PSDEFINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFINameDirty() {
        return this._contains(DTOFIELD_PSDEFINAME);
    }

    @JsonIgnore
    public void resetPSDEFIName() {
        this._reset(DTOFIELD_PSDEFINAME);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefiname(String pSDEFIName) {
        this.setPSDEFIName(pSDEFIName);
        return this;
    }

    @JsonProperty(value="psdefivrid")
    public void setPSDEFIVRId(String pSDEFIVRId) {
        this._set(DTOFIELD_PSDEFIVRID, pSDEFIVRId);
    }

    @JsonIgnore
    public String getPSDEFIVRId() {
        Object objValue = this._get(DTOFIELD_PSDEFIVRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIVRIdDirty() {
        return this._contains(DTOFIELD_PSDEFIVRID);
    }

    @JsonIgnore
    public void resetPSDEFIVRId() {
        this._reset(DTOFIELD_PSDEFIVRID);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefivrid(String pSDEFIVRId) {
        this.setPSDEFIVRId(pSDEFIVRId);
        return this;
    }

    @JsonProperty(value="psdefivrname")
    public void setPSDEFIVRName(String pSDEFIVRName) {
        this._set(DTOFIELD_PSDEFIVRNAME, pSDEFIVRName);
    }

    @JsonIgnore
    public String getPSDEFIVRName() {
        Object objValue = this._get(DTOFIELD_PSDEFIVRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIVRNameDirty() {
        return this._contains(DTOFIELD_PSDEFIVRNAME);
    }

    @JsonIgnore
    public void resetPSDEFIVRName() {
        this._reset(DTOFIELD_PSDEFIVRNAME);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefivrname(String pSDEFIVRName) {
        this.setPSDEFIVRName(pSDEFIVRName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFIVRName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFIVRName(strName);
    }

    @JsonIgnore
    public PSDEFIVRDTO name(String strName) {
        this.setPSDEFIVRName(strName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFIVRDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSDEFIVRDTO psdefvrid(String pSDEFVRId) {
        this.setPSDEFVRId(pSDEFVRId);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO psdefvrid(PSDEFValueRuleDTO pSDEFValueRule) {
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
    public PSDEFIVRDTO psdefvrname(String pSDEFVRName) {
        this.setPSDEFVRName(pSDEFVRName);
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
    public PSDEFIVRDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
    public PSDEFIVRDTO pssysvaluerulename(String pSSysValueRuleName) {
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
    public PSDEFIVRDTO updatedate(Timestamp updateDate) {
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
    public PSDEFIVRDTO updateman(String updateMan) {
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
    public PSDEFIVRDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFIVRDTO usertag(String userTag) {
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
    public PSDEFIVRDTO usertag2(String userTag2) {
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
    public PSDEFIVRDTO usertag3(String userTag3) {
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
    public PSDEFIVRDTO usertag4(String userTag4) {
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
    public PSDEFIVRDTO vrtype(String vRType) {
        this.setVRType(vRType);
        return this;
    }

    @JsonIgnore
    public PSDEFIVRDTO vrtype(PSModelEnums.TargetVRType vRType) {
        if (vRType == null) {
            this.setVRType(null);
        } else {
            this.setVRType(vRType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFIVRId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFIVRId(strValue);
    }

    @JsonIgnore
    public PSDEFIVRDTO id(String strValue) {
        this.setPSDEFIVRId(strValue);
        return this;
    }
}
