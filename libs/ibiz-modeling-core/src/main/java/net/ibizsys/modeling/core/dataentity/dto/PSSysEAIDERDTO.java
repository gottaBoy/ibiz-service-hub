package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementREDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIDERDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EAIDERTAG = "EAIDERTAG";
    protected static final String DTOFIELD_EAIDERTAG = "eaidertag";
    public static final String FIELD_EAIDERTAG2 = "EAIDERTAG2";
    protected static final String DTOFIELD_EAIDERTAG2 = "eaidertag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSSYSEAIDEID = "PSSYSEAIDEID";
    protected static final String DTOFIELD_PSSYSEAIDEID = "pssyseaideid";
    public static final String FIELD_PSSYSEAIDENAME = "PSSYSEAIDENAME";
    protected static final String DTOFIELD_PSSYSEAIDENAME = "pssyseaidename";
    public static final String FIELD_PSSYSEAIDERID = "PSSYSEAIDERID";
    protected static final String DTOFIELD_PSSYSEAIDERID = "pssyseaiderid";
    public static final String FIELD_PSSYSEAIDERNAME = "PSSYSEAIDERNAME";
    protected static final String DTOFIELD_PSSYSEAIDERNAME = "pssyseaidername";
    public static final String FIELD_PSSYSEAIELEMENTID = "PSSYSEAIELEMENTID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTID = "pssyseaielementid";
    public static final String FIELD_PSSYSEAIELEMENTREID = "PSSYSEAIELEMENTREID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";
    public static final String FIELD_PSSYSEAIELEMENTRENAME = "PSSYSEAIELEMENTRENAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";
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
    public PSSysEAIDERDTO codename(String codeName) {
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
    public PSSysEAIDERDTO createdate(Timestamp createDate) {
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
    public PSSysEAIDERDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eaidertag")
    public void setEAIDERTag(String eAIDERTag) {
        this._set(DTOFIELD_EAIDERTAG, eAIDERTag);
    }

    @JsonIgnore
    public String getEAIDERTag() {
        Object objValue = this._get(DTOFIELD_EAIDERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDERTagDirty() {
        return this._contains(DTOFIELD_EAIDERTAG);
    }

    @JsonIgnore
    public void resetEAIDERTag() {
        this._reset(DTOFIELD_EAIDERTAG);
    }

    @JsonIgnore
    public PSSysEAIDERDTO eaidertag(String eAIDERTag) {
        this.setEAIDERTag(eAIDERTag);
        return this;
    }

    @JsonProperty(value="eaidertag2")
    public void setEAIDERTag2(String eAIDERTag2) {
        this._set(DTOFIELD_EAIDERTAG2, eAIDERTag2);
    }

    @JsonIgnore
    public String getEAIDERTag2() {
        Object objValue = this._get(DTOFIELD_EAIDERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDERTag2Dirty() {
        return this._contains(DTOFIELD_EAIDERTAG2);
    }

    @JsonIgnore
    public void resetEAIDERTag2() {
        this._reset(DTOFIELD_EAIDERTAG2);
    }

    @JsonIgnore
    public PSSysEAIDERDTO eaidertag2(String eAIDERTag2) {
        this.setEAIDERTag2(eAIDERTag2);
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
    public PSSysEAIDERDTO memo(String memo) {
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
    public PSSysEAIDERDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSSysEAIDERDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDERDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSSysEAIDERDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
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
    public PSSysEAIDERDTO pssyseaideid(String pSSysEAIDEId) {
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaideid(PSSysEAIDEDTO pSSysEAIDE) {
        if (pSSysEAIDE == null) {
            this.setPSDEId(null);
            this.setPSSysEAIDEId(null);
            this.setPSSysEAIDEName(null);
            this.setPSSysEAIElementId(null);
        } else {
            this.setPSDEId(pSSysEAIDE.getPSDEId());
            this.setPSSysEAIDEId(pSSysEAIDE.getPSSysEAIDEId());
            this.setPSSysEAIDEName(pSSysEAIDE.getPSSysEAIDEName());
            this.setPSSysEAIElementId(pSSysEAIDE.getPSSysEAIElementId());
        }
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
    public PSSysEAIDERDTO pssyseaidename(String pSSysEAIDEName) {
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    @JsonProperty(value="pssyseaiderid")
    public void setPSSysEAIDERId(String pSSysEAIDERId) {
        this._set(DTOFIELD_PSSYSEAIDERID, pSSysEAIDERId);
    }

    @JsonIgnore
    public String getPSSysEAIDERId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDERIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDERID);
    }

    @JsonIgnore
    public void resetPSSysEAIDERId() {
        this._reset(DTOFIELD_PSSYSEAIDERID);
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaiderid(String pSSysEAIDERId) {
        this.setPSSysEAIDERId(pSSysEAIDERId);
        return this;
    }

    @JsonProperty(value="pssyseaidername")
    public void setPSSysEAIDERName(String pSSysEAIDERName) {
        this._set(DTOFIELD_PSSYSEAIDERNAME, pSSysEAIDERName);
    }

    @JsonIgnore
    public String getPSSysEAIDERName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDERNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDERNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDERName() {
        this._reset(DTOFIELD_PSSYSEAIDERNAME);
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaidername(String pSSysEAIDERName) {
        this.setPSSysEAIDERName(pSSysEAIDERName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIDERName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIDERName(strName);
    }

    @JsonIgnore
    public PSSysEAIDERDTO name(String strName) {
        this.setPSSysEAIDERName(strName);
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
    public PSSysEAIDERDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonProperty(value="pssyseaielementreid")
    public void setPSSysEAIElementREId(String pSSysEAIElementREId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }

    @JsonIgnore
    public String getPSSysEAIElementREId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTREID);
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaielementreid(String pSSysEAIElementREId) {
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaielementreid(PSSysEAIElementREDTO pSSysEAIElementRE) {
        if (pSSysEAIElementRE == null) {
            this.setPSSysEAIElementREId(null);
            this.setPSSysEAIElementREName(null);
        } else {
            this.setPSSysEAIElementREId(pSSysEAIElementRE.getPSSysEAIElementREId());
            this.setPSSysEAIElementREName(pSSysEAIElementRE.getPSSysEAIElementREName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementrename")
    public void setPSSysEAIElementREName(String pSSysEAIElementREName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }

    @JsonIgnore
    public String getPSSysEAIElementREName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTRENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementREName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTRENAME);
    }

    @JsonIgnore
    public PSSysEAIDERDTO pssyseaielementrename(String pSSysEAIElementREName) {
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
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
    public PSSysEAIDERDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIDERDTO updateman(String updateMan) {
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
    public PSSysEAIDERDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDERDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIDERDTO usertag(String userTag) {
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
    public PSSysEAIDERDTO usertag2(String userTag2) {
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
    public PSSysEAIDERDTO usertag3(String userTag3) {
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
    public PSSysEAIDERDTO usertag4(String userTag4) {
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
    public PSSysEAIDERDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDERDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIDERId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIDERId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDERDTO id(String strValue) {
        this.setPSSysEAIDERId(strValue);
        return this;
    }
}
