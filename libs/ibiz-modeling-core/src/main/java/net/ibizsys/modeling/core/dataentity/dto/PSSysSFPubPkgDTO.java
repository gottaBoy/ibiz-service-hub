package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSFPubPkgDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PKGPARAM = "PKGPARAM";
    protected static final String DTOFIELD_PKGPARAM = "pkgparam";
    public static final String FIELD_PKGPARAM2 = "PKGPARAM2";
    protected static final String DTOFIELD_PKGPARAM2 = "pkgparam2";
    public static final String FIELD_PKGPARAM3 = "PKGPARAM3";
    protected static final String DTOFIELD_PKGPARAM3 = "pkgparam3";
    public static final String FIELD_PKGPARAM4 = "PKGPARAM4";
    protected static final String DTOFIELD_PKGPARAM4 = "pkgparam4";
    public static final String FIELD_PSSFPKGID = "PSSFPKGID";
    protected static final String DTOFIELD_PSSFPKGID = "pssfpkgid";
    public static final String FIELD_PSSFPKGNAME = "PSSFPKGNAME";
    protected static final String DTOFIELD_PSSFPKGNAME = "pssfpkgname";
    public static final String FIELD_PSSFPKGVERID = "PSSFPKGVERID";
    protected static final String DTOFIELD_PSSFPKGVERID = "pssfpkgverid";
    public static final String FIELD_PSSFPKGVERNAME = "PSSFPKGVERNAME";
    protected static final String DTOFIELD_PSSFPKGVERNAME = "pssfpkgvername";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSSYSSFPUBNAME = "PSSYSSFPUBNAME";
    protected static final String DTOFIELD_PSSYSSFPUBNAME = "pssyssfpubname";
    public static final String FIELD_PSSYSSFPUBPKGID = "PSSYSSFPUBPKGID";
    protected static final String DTOFIELD_PSSYSSFPUBPKGID = "pssyssfpubpkgid";
    public static final String FIELD_PSSYSSFPUBPKGNAME = "PSSYSSFPUBPKGNAME";
    protected static final String DTOFIELD_PSSYSSFPUBPKGNAME = "pssyssfpubpkgname";
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
    public PSSysSFPubPkgDTO createdate(Timestamp createDate) {
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
    public PSSysSFPubPkgDTO createman(String createMan) {
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
    public PSSysSFPubPkgDTO memo(String memo) {
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
    public PSSysSFPubPkgDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pkgparam")
    public void setPkgParam(String pkgParam) {
        this._set(DTOFIELD_PKGPARAM, pkgParam);
    }

    @JsonIgnore
    public String getPkgParam() {
        Object objValue = this._get(DTOFIELD_PKGPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParamDirty() {
        return this._contains(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public void resetPkgParam() {
        this._reset(DTOFIELD_PKGPARAM);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam(String pkgParam) {
        this.setPkgParam(pkgParam);
        return this;
    }

    @JsonProperty(value="pkgparam2")
    public void setPkgParam2(String pkgParam2) {
        this._set(DTOFIELD_PKGPARAM2, pkgParam2);
    }

    @JsonIgnore
    public String getPkgParam2() {
        Object objValue = this._get(DTOFIELD_PKGPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam2Dirty() {
        return this._contains(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public void resetPkgParam2() {
        this._reset(DTOFIELD_PKGPARAM2);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam2(String pkgParam2) {
        this.setPkgParam2(pkgParam2);
        return this;
    }

    @JsonProperty(value="pkgparam3")
    public void setPkgParam3(String pkgParam3) {
        this._set(DTOFIELD_PKGPARAM3, pkgParam3);
    }

    @JsonIgnore
    public String getPkgParam3() {
        Object objValue = this._get(DTOFIELD_PKGPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam3Dirty() {
        return this._contains(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public void resetPkgParam3() {
        this._reset(DTOFIELD_PKGPARAM3);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam3(String pkgParam3) {
        this.setPkgParam3(pkgParam3);
        return this;
    }

    @JsonProperty(value="pkgparam4")
    public void setPkgParam4(String pkgParam4) {
        this._set(DTOFIELD_PKGPARAM4, pkgParam4);
    }

    @JsonIgnore
    public String getPkgParam4() {
        Object objValue = this._get(DTOFIELD_PKGPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPkgParam4Dirty() {
        return this._contains(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public void resetPkgParam4() {
        this._reset(DTOFIELD_PKGPARAM4);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam4(String pkgParam4) {
        this.setPkgParam4(pkgParam4);
        return this;
    }

    @JsonProperty(value="pssfpkgid")
    public void setPSSFPkgId(String pSSFPkgId) {
        this._set(DTOFIELD_PSSFPKGID, pSSFPkgId);
    }

    @JsonIgnore
    public String getPSSFPkgId() {
        Object objValue = this._get(DTOFIELD_PSSFPKGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPkgIdDirty() {
        return this._contains(DTOFIELD_PSSFPKGID);
    }

    @JsonIgnore
    public void resetPSSFPkgId() {
        this._reset(DTOFIELD_PSSFPKGID);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgid(String pSSFPkgId) {
        this.setPSSFPkgId(pSSFPkgId);
        return this;
    }

    @JsonProperty(value="pssfpkgname")
    public void setPSSFPkgName(String pSSFPkgName) {
        this._set(DTOFIELD_PSSFPKGNAME, pSSFPkgName);
    }

    @JsonIgnore
    public String getPSSFPkgName() {
        Object objValue = this._get(DTOFIELD_PSSFPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPkgNameDirty() {
        return this._contains(DTOFIELD_PSSFPKGNAME);
    }

    @JsonIgnore
    public void resetPSSFPkgName() {
        this._reset(DTOFIELD_PSSFPKGNAME);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgname(String pSSFPkgName) {
        this.setPSSFPkgName(pSSFPkgName);
        return this;
    }

    @JsonProperty(value="pssfpkgverid")
    public void setPSSFPkgVerId(String pSSFPkgVerId) {
        this._set(DTOFIELD_PSSFPKGVERID, pSSFPkgVerId);
    }

    @JsonIgnore
    public String getPSSFPkgVerId() {
        Object objValue = this._get(DTOFIELD_PSSFPKGVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPkgVerIdDirty() {
        return this._contains(DTOFIELD_PSSFPKGVERID);
    }

    @JsonIgnore
    public void resetPSSFPkgVerId() {
        this._reset(DTOFIELD_PSSFPKGVERID);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgverid(String pSSFPkgVerId) {
        this.setPSSFPkgVerId(pSSFPkgVerId);
        return this;
    }

    @JsonProperty(value="pssfpkgvername")
    public void setPSSFPkgVerName(String pSSFPkgVerName) {
        this._set(DTOFIELD_PSSFPKGVERNAME, pSSFPkgVerName);
    }

    @JsonIgnore
    public String getPSSFPkgVerName() {
        Object objValue = this._get(DTOFIELD_PSSFPKGVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPkgVerNameDirty() {
        return this._contains(DTOFIELD_PSSFPKGVERNAME);
    }

    @JsonIgnore
    public void resetPSSFPkgVerName() {
        this._reset(DTOFIELD_PSSFPKGVERNAME);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgvername(String pSSFPkgVerName) {
        this.setPSSFPkgVerName(pSSFPkgVerName);
        return this;
    }

    @JsonProperty(value="pssyssfpubid")
    public void setPSSysSFPubId(String pSSysSFPubId) {
        this._set(DTOFIELD_PSSYSSFPUBID, pSSysSFPubId);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPSSysSFPubId() {
        this._reset(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubid(String pSSysSFPubId) {
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub) {
        if (pSSysSFPub == null) {
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        } else {
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpubname")
    public void setPSSysSFPubName(String pSSysSFPubName) {
        this._set(DTOFIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }

    @JsonIgnore
    public String getPSSysSFPubName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPubName() {
        this._reset(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubname(String pSSysSFPubName) {
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    @JsonProperty(value="pssyssfpubpkgid")
    public void setPSSysSFPubPkgId(String pSSysSFPubPkgId) {
        this._set(DTOFIELD_PSSYSSFPUBPKGID, pSSysSFPubPkgId);
    }

    @JsonIgnore
    public String getPSSysSFPubPkgId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBPKGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubPkgIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBPKGID);
    }

    @JsonIgnore
    public void resetPSSysSFPubPkgId() {
        this._reset(DTOFIELD_PSSYSSFPUBPKGID);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubpkgid(String pSSysSFPubPkgId) {
        this.setPSSysSFPubPkgId(pSSysSFPubPkgId);
        return this;
    }

    @JsonProperty(value="pssyssfpubpkgname")
    public void setPSSysSFPubPkgName(String pSSysSFPubPkgName) {
        this._set(DTOFIELD_PSSYSSFPUBPKGNAME, pSSysSFPubPkgName);
    }

    @JsonIgnore
    public String getPSSysSFPubPkgName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBPKGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubPkgNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBPKGNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPubPkgName() {
        this._reset(DTOFIELD_PSSYSSFPUBPKGNAME);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubpkgname(String pSSysSFPubPkgName) {
        this.setPSSysSFPubPkgName(pSSysSFPubPkgName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSFPubPkgName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSFPubPkgName(strName);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO name(String strName) {
        this.setPSSysSFPubPkgName(strName);
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
    public PSSysSFPubPkgDTO updatedate(Timestamp updateDate) {
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
    public PSSysSFPubPkgDTO updateman(String updateMan) {
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
    public PSSysSFPubPkgDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSFPubPkgDTO usertag(String userTag) {
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
    public PSSysSFPubPkgDTO usertag2(String userTag2) {
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
    public PSSysSFPubPkgDTO usertag3(String userTag3) {
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
    public PSSysSFPubPkgDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSFPubPkgId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSFPubPkgId(strValue);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO id(String strValue) {
        this.setPSSysSFPubPkgId(strValue);
        return this;
    }
}
