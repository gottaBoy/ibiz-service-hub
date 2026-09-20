package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementAttrDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementREDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAISchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIElementDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EAIELEMENTTAG = "EAIELEMENTTAG";
    protected static final String DTOFIELD_EAIELEMENTTAG = "eaielementtag";
    public static final String FIELD_EAIELEMENTTAG2 = "EAIELEMENTTAG2";
    protected static final String DTOFIELD_EAIELEMENTTAG2 = "eaielementtag2";
    public static final String FIELD_EAIELEMENTTYPE = "EAIELEMENTTYPE";
    protected static final String DTOFIELD_EAIELEMENTTYPE = "eaielementtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERMODE = "ORDERMODE";
    protected static final String DTOFIELD_ORDERMODE = "ordermode";
    public static final String FIELD_PSSYSEAIELEMENTID = "PSSYSEAIELEMENTID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTID = "pssyseaielementid";
    public static final String FIELD_PSSYSEAIELEMENTNAME = "PSSYSEAIELEMENTNAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";
    public static final String FIELD_PSSYSEAISCHEMEID = "PSSYSEAISCHEMEID";
    protected static final String DTOFIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";
    public static final String FIELD_PSSYSEAISCHEMENAME = "PSSYSEAISCHEMENAME";
    protected static final String DTOFIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";
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
    public static final String DTOFIELD_PSSYSEAIELEMENTATTRS = "pssyseaielementattrs";
    public static final String DTOFIELD_PSSYSEAIELEMENTRES = "pssyseaielementres";

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
    public PSSysEAIElementDTO codename(String codeName) {
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
    public PSSysEAIElementDTO createdate(Timestamp createDate) {
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
    public PSSysEAIElementDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eaielementtag")
    public void setEAIElementTag(String eAIElementTag) {
        this._set(DTOFIELD_EAIELEMENTTAG, eAIElementTag);
    }

    @JsonIgnore
    public String getEAIElementTag() {
        Object objValue = this._get(DTOFIELD_EAIELEMENTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIElementTagDirty() {
        return this._contains(DTOFIELD_EAIELEMENTTAG);
    }

    @JsonIgnore
    public void resetEAIElementTag() {
        this._reset(DTOFIELD_EAIELEMENTTAG);
    }

    @JsonIgnore
    public PSSysEAIElementDTO eaielementtag(String eAIElementTag) {
        this.setEAIElementTag(eAIElementTag);
        return this;
    }

    @JsonProperty(value="eaielementtag2")
    public void setEAIElementTag2(String eAIElementTag2) {
        this._set(DTOFIELD_EAIELEMENTTAG2, eAIElementTag2);
    }

    @JsonIgnore
    public String getEAIElementTag2() {
        Object objValue = this._get(DTOFIELD_EAIELEMENTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIElementTag2Dirty() {
        return this._contains(DTOFIELD_EAIELEMENTTAG2);
    }

    @JsonIgnore
    public void resetEAIElementTag2() {
        this._reset(DTOFIELD_EAIELEMENTTAG2);
    }

    @JsonIgnore
    public PSSysEAIElementDTO eaielementtag2(String eAIElementTag2) {
        this.setEAIElementTag2(eAIElementTag2);
        return this;
    }

    @JsonProperty(value="eaielementtype")
    public void setEAIElementType(String eAIElementType) {
        this._set(DTOFIELD_EAIELEMENTTYPE, eAIElementType);
    }

    @JsonIgnore
    public String getEAIElementType() {
        Object objValue = this._get(DTOFIELD_EAIELEMENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIElementTypeDirty() {
        return this._contains(DTOFIELD_EAIELEMENTTYPE);
    }

    @JsonIgnore
    public void resetEAIElementType() {
        this._reset(DTOFIELD_EAIELEMENTTYPE);
    }

    @JsonIgnore
    public PSSysEAIElementDTO eaielementtype(String eAIElementType) {
        this.setEAIElementType(eAIElementType);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementDTO eaielementtype(PSModelEnums.EAIElementType eAIElementType) {
        if (eAIElementType == null) {
            this.setEAIElementType(null);
        } else {
            this.setEAIElementType(eAIElementType.value);
        }
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
    public PSSysEAIElementDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ordermode")
    public void setOrderMode(String orderMode) {
        this._set(DTOFIELD_ORDERMODE, orderMode);
    }

    @JsonIgnore
    public String getOrderMode() {
        Object objValue = this._get(DTOFIELD_ORDERMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderModeDirty() {
        return this._contains(DTOFIELD_ORDERMODE);
    }

    @JsonIgnore
    public void resetOrderMode() {
        this._reset(DTOFIELD_ORDERMODE);
    }

    @JsonIgnore
    public PSSysEAIElementDTO ordermode(String orderMode) {
        this.setOrderMode(orderMode);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementDTO ordermode(PSModelEnums.EAIElementREOrderMode orderMode) {
        if (orderMode == null) {
            this.setOrderMode(null);
        } else {
            this.setOrderMode(orderMode.value);
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementid")
    public void setPSSysEAIElementId(String pSSysEAIElementId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }

    @JsonIgnore
    public String getPSSysEAIElementId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public PSSysEAIElementDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonProperty(value="pssyseaielementname")
    public void setPSSysEAIElementName(String pSSysEAIElementName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }

    @JsonIgnore
    public String getPSSysEAIElementName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public PSSysEAIElementDTO pssyseaielementname(String pSSysEAIElementName) {
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIElementName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIElementName(strName);
    }

    @JsonIgnore
    public PSSysEAIElementDTO name(String strName) {
        this.setPSSysEAIElementName(strName);
        return this;
    }

    @JsonProperty(value="pssyseaischemeid")
    public void setPSSysEAISchemeId(String pSSysEAISchemeId) {
        this._set(DTOFIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }

    @JsonIgnore
    public String getPSSysEAISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeId() {
        this._reset(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public PSSysEAIElementDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme) {
        if (pSSysEAIScheme == null) {
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        } else {
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaischemename")
    public void setPSSysEAISchemeName(String pSSysEAISchemeName) {
        this._set(DTOFIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }

    @JsonIgnore
    public String getPSSysEAISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeName() {
        this._reset(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public PSSysEAIElementDTO pssyseaischemename(String pSSysEAISchemeName) {
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
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
    public PSSysEAIElementDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIElementDTO updateman(String updateMan) {
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
    public PSSysEAIElementDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIElementDTO usertag(String userTag) {
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
    public PSSysEAIElementDTO usertag2(String userTag2) {
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
    public PSSysEAIElementDTO usertag3(String userTag3) {
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
    public PSSysEAIElementDTO usertag4(String userTag4) {
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
    public PSSysEAIElementDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIElementDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIElementId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIElementId(strValue);
    }

    @JsonIgnore
    public PSSysEAIElementDTO id(String strValue) {
        this.setPSSysEAIElementId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysEAIElementAttrDTO> getPSSysEAIElementAttrs() {
        Object list = this._get(DTOFIELD_PSSYSEAIELEMENTATTRS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyseaielementattrs")
    public void setPSSysEAIElementAttrs(List<PSSysEAIElementAttrDTO> pssyseaielementattrs) {
        this._set(DTOFIELD_PSSYSEAIELEMENTATTRS, pssyseaielementattrs);
    }

    @JsonIgnore
    public List<PSSysEAIElementAttrDTO> getPSSysEAIElementAttrsIf() {
        Object list = this._get(DTOFIELD_PSSYSEAIELEMENTATTRS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSEAIELEMENTATTRS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysEAIElementREDTO> getPSSysEAIElementREs() {
        Object list = this._get(DTOFIELD_PSSYSEAIELEMENTRES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyseaielementres")
    public void setPSSysEAIElementREs(List<PSSysEAIElementREDTO> pssyseaielementres) {
        this._set(DTOFIELD_PSSYSEAIELEMENTRES, pssyseaielementres);
    }

    @JsonIgnore
    public List<PSSysEAIElementREDTO> getPSSysEAIElementREsIf() {
        Object list = this._get(DTOFIELD_PSSYSEAIELEMENTRES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSEAIELEMENTRES, list);
        }
        return (List)list;
    }
}
