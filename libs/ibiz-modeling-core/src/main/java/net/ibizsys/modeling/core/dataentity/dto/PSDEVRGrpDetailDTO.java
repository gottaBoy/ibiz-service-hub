package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEVRGrpDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DETAILPARAM = "DETAILPARAM";
    protected static final String DTOFIELD_DETAILPARAM = "detailparam";
    public static final String FIELD_DETAILPARAM2 = "DETAILPARAM2";
    protected static final String DTOFIELD_DETAILPARAM2 = "detailparam2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFVALUERULEID = "PSDEFVALUERULEID";
    protected static final String DTOFIELD_PSDEFVALUERULEID = "psdefvalueruleid";
    public static final String FIELD_PSDEFVALUERULENAME = "PSDEFVALUERULENAME";
    protected static final String DTOFIELD_PSDEFVALUERULENAME = "psdefvaluerulename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEVRGROUPID = "PSDEVRGROUPID";
    protected static final String DTOFIELD_PSDEVRGROUPID = "psdevrgroupid";
    public static final String FIELD_PSDEVRGROUPNAME = "PSDEVRGROUPNAME";
    protected static final String DTOFIELD_PSDEVRGROUPNAME = "psdevrgroupname";
    public static final String FIELD_PSDEVRGRPDETAILID = "PSDEVRGRPDETAILID";
    protected static final String DTOFIELD_PSDEVRGRPDETAILID = "psdevrgrpdetailid";
    public static final String FIELD_PSDEVRGRPDETAILNAME = "PSDEVRGRPDETAILNAME";
    protected static final String DTOFIELD_PSDEVRGRPDETAILNAME = "psdevrgrpdetailname";
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
    public PSDEVRGrpDetailDTO createdate(Timestamp createDate) {
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
    public PSDEVRGrpDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="detailparam")
    public void setDetailParam(String detailParam) {
        this._set(DTOFIELD_DETAILPARAM, detailParam);
    }

    @JsonIgnore
    public String getDetailParam() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParamDirty() {
        return this._contains(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public void resetDetailParam() {
        this._reset(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO detailparam(String detailParam) {
        this.setDetailParam(detailParam);
        return this;
    }

    @JsonProperty(value="detailparam2")
    public void setDetailParam2(String detailParam2) {
        this._set(DTOFIELD_DETAILPARAM2, detailParam2);
    }

    @JsonIgnore
    public String getDetailParam2() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParam2Dirty() {
        return this._contains(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public void resetDetailParam2() {
        this._reset(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO detailparam2(String detailParam2) {
        this.setDetailParam2(detailParam2);
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
    public PSDEVRGrpDetailDTO memo(String memo) {
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
    public PSDEVRGrpDetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdefvalueruleid")
    public void setPSDEFValueRuleId(String pSDEFValueRuleId) {
        this._set(DTOFIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }

    @JsonIgnore
    public String getPSDEFValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleId() {
        this._reset(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdefvalueruleid(String pSDEFValueRuleId) {
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        } else {
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="psdefvaluerulename")
    public void setPSDEFValueRuleName(String pSDEFValueRuleName) {
        this._set(DTOFIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }

    @JsonIgnore
    public String getPSDEFValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleName() {
        this._reset(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdefvaluerulename(String pSDEFValueRuleName) {
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEIdDirty() {
        return this._contains(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public void resetPSDEId() {
        this._reset(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdevrgroupid")
    public void setPSDEVRGroupId(String pSDEVRGroupId) {
        this._set(DTOFIELD_PSDEVRGROUPID, pSDEVRGroupId);
    }

    @JsonIgnore
    public String getPSDEVRGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEVRGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVRGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEVRGROUPID);
    }

    @JsonIgnore
    public void resetPSDEVRGroupId() {
        this._reset(DTOFIELD_PSDEVRGROUPID);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdevrgroupid(String pSDEVRGroupId) {
        this.setPSDEVRGroupId(pSDEVRGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdevrgroupid(PSDEVRGroupDTO pSDEVRGroup) {
        if (pSDEVRGroup == null) {
            this.setPSDEId(null);
            this.setPSDEVRGroupId(null);
            this.setPSDEVRGroupName(null);
        } else {
            this.setPSDEId(pSDEVRGroup.getPSDEId());
            this.setPSDEVRGroupId(pSDEVRGroup.getPSDEVRGroupId());
            this.setPSDEVRGroupName(pSDEVRGroup.getPSDEVRGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdevrgroupname")
    public void setPSDEVRGroupName(String pSDEVRGroupName) {
        this._set(DTOFIELD_PSDEVRGROUPNAME, pSDEVRGroupName);
    }

    @JsonIgnore
    public String getPSDEVRGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEVRGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVRGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEVRGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEVRGroupName() {
        this._reset(DTOFIELD_PSDEVRGROUPNAME);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdevrgroupname(String pSDEVRGroupName) {
        this.setPSDEVRGroupName(pSDEVRGroupName);
        return this;
    }

    @JsonProperty(value="psdevrgrpdetailid")
    public void setPSDEVRGrpDetailId(String pSDEVRGrpDetailId) {
        this._set(DTOFIELD_PSDEVRGRPDETAILID, pSDEVRGrpDetailId);
    }

    @JsonIgnore
    public String getPSDEVRGrpDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEVRGRPDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVRGrpDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEVRGRPDETAILID);
    }

    @JsonIgnore
    public void resetPSDEVRGrpDetailId() {
        this._reset(DTOFIELD_PSDEVRGRPDETAILID);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdevrgrpdetailid(String pSDEVRGrpDetailId) {
        this.setPSDEVRGrpDetailId(pSDEVRGrpDetailId);
        return this;
    }

    @JsonProperty(value="psdevrgrpdetailname")
    public void setPSDEVRGrpDetailName(String pSDEVRGrpDetailName) {
        this._set(DTOFIELD_PSDEVRGRPDETAILNAME, pSDEVRGrpDetailName);
    }

    @JsonIgnore
    public String getPSDEVRGrpDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEVRGRPDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEVRGrpDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEVRGRPDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEVRGrpDetailName() {
        this._reset(DTOFIELD_PSDEVRGRPDETAILNAME);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO psdevrgrpdetailname(String pSDEVRGrpDetailName) {
        this.setPSDEVRGrpDetailName(pSDEVRGrpDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEVRGrpDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEVRGrpDetailName(strName);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO name(String strName) {
        this.setPSDEVRGrpDetailName(strName);
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
    public PSDEVRGrpDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEVRGrpDetailDTO updateman(String updateMan) {
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
    public PSDEVRGrpDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEVRGrpDetailDTO usertag(String userTag) {
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
    public PSDEVRGrpDetailDTO usertag2(String userTag2) {
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
    public PSDEVRGrpDetailDTO usertag3(String userTag3) {
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
    public PSDEVRGrpDetailDTO usertag4(String userTag4) {
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
    public PSDEVRGrpDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEVRGrpDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEVRGrpDetailId(strValue);
    }

    @JsonIgnore
    public PSDEVRGrpDetailDTO id(String strValue) {
        this.setPSDEVRGrpDetailId(strValue);
        return this;
    }
}
