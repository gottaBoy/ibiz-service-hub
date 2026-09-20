package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAISchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIDEDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EAIDETAG = "EAIDETAG";
    protected static final String DTOFIELD_EAIDETAG = "eaidetag";
    public static final String FIELD_EAIDETAG2 = "EAIDETAG2";
    protected static final String DTOFIELD_EAIDETAG2 = "eaidetag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSEAIDEID = "PSSYSEAIDEID";
    protected static final String DTOFIELD_PSSYSEAIDEID = "pssyseaideid";
    public static final String FIELD_PSSYSEAIDENAME = "PSSYSEAIDENAME";
    protected static final String DTOFIELD_PSSYSEAIDENAME = "pssyseaidename";
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
    public static final String DTOFIELD_PSSYSEAIDEFIELDS = "pssyseaidefields";
    public static final String DTOFIELD_PSSYSEAIDERS = "pssyseaiders";

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
    public PSSysEAIDEDTO codename(String codeName) {
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
    public PSSysEAIDEDTO createdate(Timestamp createDate) {
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
    public PSSysEAIDEDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eaidetag")
    public void setEAIDETag(String eAIDETag) {
        this._set(DTOFIELD_EAIDETAG, eAIDETag);
    }

    @JsonIgnore
    public String getEAIDETag() {
        Object objValue = this._get(DTOFIELD_EAIDETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDETagDirty() {
        return this._contains(DTOFIELD_EAIDETAG);
    }

    @JsonIgnore
    public void resetEAIDETag() {
        this._reset(DTOFIELD_EAIDETAG);
    }

    @JsonIgnore
    public PSSysEAIDEDTO eaidetag(String eAIDETag) {
        this.setEAIDETag(eAIDETag);
        return this;
    }

    @JsonProperty(value="eaidetag2")
    public void setEAIDETag2(String eAIDETag2) {
        this._set(DTOFIELD_EAIDETAG2, eAIDETag2);
    }

    @JsonIgnore
    public String getEAIDETag2() {
        Object objValue = this._get(DTOFIELD_EAIDETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDETag2Dirty() {
        return this._contains(DTOFIELD_EAIDETAG2);
    }

    @JsonIgnore
    public void resetEAIDETag2() {
        this._reset(DTOFIELD_EAIDETAG2);
    }

    @JsonIgnore
    public PSSysEAIDEDTO eaidetag2(String eAIDETag2) {
        this.setEAIDETag2(eAIDETag2);
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
    public PSSysEAIDEDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysEAIDEDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysEAIDEDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssyseaideid")
    public void setPSSysEAIDEId(String pSSysEAIDEId) {
        this._set(DTOFIELD_PSSYSEAIDEID, pSSysEAIDEId);
    }

    @JsonIgnore
    public String getPSSysEAIDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDEID);
    }

    @JsonIgnore
    public void resetPSSysEAIDEId() {
        this._reset(DTOFIELD_PSSYSEAIDEID);
    }

    @JsonIgnore
    public PSSysEAIDEDTO pssyseaideid(String pSSysEAIDEId) {
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    @JsonProperty(value="pssyseaidename")
    public void setPSSysEAIDEName(String pSSysEAIDEName) {
        this._set(DTOFIELD_PSSYSEAIDENAME, pSSysEAIDEName);
    }

    @JsonIgnore
    public String getPSSysEAIDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDENameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDEName() {
        this._reset(DTOFIELD_PSSYSEAIDENAME);
    }

    @JsonIgnore
    public PSSysEAIDEDTO pssyseaidename(String pSSysEAIDEName) {
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIDEName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIDEName(strName);
    }

    @JsonIgnore
    public PSSysEAIDEDTO name(String strName) {
        this.setPSSysEAIDEName(strName);
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
    public PSSysEAIDEDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEDTO pssyseaielementid(PSSysEAIElementDTO pSSysEAIElement) {
        if (pSSysEAIElement == null) {
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
        } else {
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
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
    public PSSysEAIDEDTO pssyseaielementname(String pSSysEAIElementName) {
        this.setPSSysEAIElementName(pSSysEAIElementName);
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
    public PSSysEAIDEDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme) {
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
    public PSSysEAIDEDTO pssyseaischemename(String pSSysEAISchemeName) {
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
    public PSSysEAIDEDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIDEDTO updateman(String updateMan) {
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
    public PSSysEAIDEDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIDEDTO usertag(String userTag) {
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
    public PSSysEAIDEDTO usertag2(String userTag2) {
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
    public PSSysEAIDEDTO usertag3(String userTag3) {
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
    public PSSysEAIDEDTO usertag4(String userTag4) {
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
    public PSSysEAIDEDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDEDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIDEId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIDEId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDEDTO id(String strValue) {
        this.setPSSysEAIDEId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysEAIDEFieldDTO> getPSSysEAIDEFields() {
        Object list = this._get(DTOFIELD_PSSYSEAIDEFIELDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyseaidefields")
    public void setPSSysEAIDEFields(List<PSSysEAIDEFieldDTO> pssyseaidefields) {
        this._set(DTOFIELD_PSSYSEAIDEFIELDS, pssyseaidefields);
    }

    @JsonIgnore
    public List<PSSysEAIDEFieldDTO> getPSSysEAIDEFieldsIf() {
        Object list = this._get(DTOFIELD_PSSYSEAIDEFIELDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSEAIDEFIELDS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSSysEAIDERDTO> getPSSysEAIDERs() {
        Object list = this._get(DTOFIELD_PSSYSEAIDERS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyseaiders")
    public void setPSSysEAIDERs(List<PSSysEAIDERDTO> pssyseaiders) {
        this._set(DTOFIELD_PSSYSEAIDERS, pssyseaiders);
    }

    @JsonIgnore
    public List<PSSysEAIDERDTO> getPSSysEAIDERsIf() {
        Object list = this._get(DTOFIELD_PSSYSEAIDERS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSEAIDERS, list);
        }
        return (List)list;
    }
}
