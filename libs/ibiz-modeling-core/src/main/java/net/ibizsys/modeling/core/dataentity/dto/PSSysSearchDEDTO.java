package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDocDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchSchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSearchDEDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DETAG = "DETAG";
    protected static final String DTOFIELD_DETAG = "detag";
    public static final String FIELD_DETAG2 = "DETAG2";
    protected static final String DTOFIELD_DETAG2 = "detag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NOSQLFLAG = "NOSQLFLAG";
    protected static final String DTOFIELD_NOSQLFLAG = "nosqlflag";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSSEARCHDEID = "PSSYSSEARCHDEID";
    protected static final String DTOFIELD_PSSYSSEARCHDEID = "pssyssearchdeid";
    public static final String FIELD_PSSYSSEARCHDENAME = "PSSYSSEARCHDENAME";
    protected static final String DTOFIELD_PSSYSSEARCHDENAME = "pssyssearchdename";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHDOCNAME = "PSSYSSEARCHDOCNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";
    public static final String FIELD_PSSYSSEARCHSCHEMEID = "PSSYSSEARCHSCHEMEID";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";
    public static final String FIELD_PSSYSSEARCHSCHEMENAME = "PSSYSSEARCHSCHEMENAME";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";
    public static final String FIELD_THREADRUNMODE = "THREADRUNMODE";
    protected static final String DTOFIELD_THREADRUNMODE = "threadrunmode";
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
    public PSSysSearchDEDTO codename(String codeName) {
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
    public PSSysSearchDEDTO createdate(Timestamp createDate) {
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
    public PSSysSearchDEDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="detag")
    public void setDETag(String dETag) {
        this._set(DTOFIELD_DETAG, dETag);
    }

    @JsonIgnore
    public String getDETag() {
        Object objValue = this._get(DTOFIELD_DETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDETagDirty() {
        return this._contains(DTOFIELD_DETAG);
    }

    @JsonIgnore
    public void resetDETag() {
        this._reset(DTOFIELD_DETAG);
    }

    @JsonIgnore
    public PSSysSearchDEDTO detag(String dETag) {
        this.setDETag(dETag);
        return this;
    }

    @JsonProperty(value="detag2")
    public void setDETag2(String dETag2) {
        this._set(DTOFIELD_DETAG2, dETag2);
    }

    @JsonIgnore
    public String getDETag2() {
        Object objValue = this._get(DTOFIELD_DETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDETag2Dirty() {
        return this._contains(DTOFIELD_DETAG2);
    }

    @JsonIgnore
    public void resetDETag2() {
        this._reset(DTOFIELD_DETAG2);
    }

    @JsonIgnore
    public PSSysSearchDEDTO detag2(String dETag2) {
        this.setDETag2(dETag2);
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
    public PSSysSearchDEDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nosqlflag")
    public void setNoSQLFlag(Integer noSQLFlag) {
        this._set(DTOFIELD_NOSQLFLAG, noSQLFlag);
    }

    @JsonIgnore
    public Integer getNoSQLFlag() {
        Object objValue = this._get(DTOFIELD_NOSQLFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoSQLFlagDirty() {
        return this._contains(DTOFIELD_NOSQLFLAG);
    }

    @JsonIgnore
    public void resetNoSQLFlag() {
        this._reset(DTOFIELD_NOSQLFLAG);
    }

    @JsonIgnore
    public PSSysSearchDEDTO nosqlflag(Integer noSQLFlag) {
        this.setNoSQLFlag(noSQLFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO nosqlflag(Boolean noSQLFlag) {
        if (noSQLFlag == null) {
            this.setNoSQLFlag(null);
        } else {
            this.setNoSQLFlag(noSQLFlag != false ? 1 : 0);
        }
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
    public PSSysSearchDEDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysSearchDEDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssyssearchdeid")
    public void setPSSysSearchDEId(String pSSysSearchDEId) {
        this._set(DTOFIELD_PSSYSSEARCHDEID, pSSysSearchDEId);
    }

    @JsonIgnore
    public String getPSSysSearchDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDEID);
    }

    @JsonIgnore
    public void resetPSSysSearchDEId() {
        this._reset(DTOFIELD_PSSYSSEARCHDEID);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchdeid(String pSSysSearchDEId) {
        this.setPSSysSearchDEId(pSSysSearchDEId);
        return this;
    }

    @JsonProperty(value="pssyssearchdename")
    public void setPSSysSearchDEName(String pSSysSearchDEName) {
        this._set(DTOFIELD_PSSYSSEARCHDENAME, pSSysSearchDEName);
    }

    @JsonIgnore
    public String getPSSysSearchDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDENameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDENAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDEName() {
        this._reset(DTOFIELD_PSSYSSEARCHDENAME);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchdename(String pSSysSearchDEName) {
        this.setPSSysSearchDEName(pSSysSearchDEName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSearchDEName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSearchDEName(strName);
    }

    @JsonIgnore
    public PSSysSearchDEDTO name(String strName) {
        this.setPSSysSearchDEName(strName);
        return this;
    }

    @JsonProperty(value="pssyssearchdocid")
    public void setPSSysSearchDocId(String pSSysSearchDocId) {
        this._set(DTOFIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }

    @JsonIgnore
    public String getPSSysSearchDocId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public void resetPSSysSearchDocId() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc) {
        if (pSSysSearchDoc == null) {
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        } else {
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchdocname")
    public void setPSSysSearchDocName(String pSSysSearchDocName) {
        this._set(DTOFIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }

    @JsonIgnore
    public String getPSSysSearchDocName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDocName() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchdocname(String pSSysSearchDocName) {
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    @JsonProperty(value="pssyssearchschemeid")
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId) {
        this._set(DTOFIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }

    @JsonIgnore
    public String getPSSysSearchSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysSearchSchemeId() {
        this._reset(DTOFIELD_PSSYSSEARCHSCHEMEID);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchschemeid(String pSSysSearchSchemeId) {
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme) {
        if (pSSysSearchScheme == null) {
            this.setPSSysSearchSchemeId(null);
            this.setPSSysSearchSchemeName(null);
        } else {
            this.setPSSysSearchSchemeId(pSSysSearchScheme.getPSSysSearchSchemeId());
            this.setPSSysSearchSchemeName(pSSysSearchScheme.getPSSysSearchSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchschemename")
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName) {
        this._set(DTOFIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }

    @JsonIgnore
    public String getPSSysSearchSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysSearchSchemeName() {
        this._reset(DTOFIELD_PSSYSSEARCHSCHEMENAME);
    }

    @JsonIgnore
    public PSSysSearchDEDTO pssyssearchschemename(String pSSysSearchSchemeName) {
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    @JsonProperty(value="threadrunmode")
    public void setThreadRunMode(Integer threadRunMode) {
        this._set(DTOFIELD_THREADRUNMODE, threadRunMode);
    }

    @JsonIgnore
    public Integer getThreadRunMode() {
        Object objValue = this._get(DTOFIELD_THREADRUNMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThreadRunModeDirty() {
        return this._contains(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public void resetThreadRunMode() {
        this._reset(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public PSSysSearchDEDTO threadrunmode(Integer threadRunMode) {
        this.setThreadRunMode(threadRunMode);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO threadrunmode(PSModelEnums.DELogicThreadRunMode threadRunMode) {
        if (threadRunMode == null) {
            this.setThreadRunMode(null);
        } else {
            this.setThreadRunMode(threadRunMode.value);
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
    public PSSysSearchDEDTO updatedate(Timestamp updateDate) {
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
    public PSSysSearchDEDTO updateman(String updateMan) {
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
    public PSSysSearchDEDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSearchDEDTO usertag(String userTag) {
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
    public PSSysSearchDEDTO usertag2(String userTag2) {
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
    public PSSysSearchDEDTO usertag3(String userTag3) {
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
    public PSSysSearchDEDTO usertag4(String userTag4) {
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
    public PSSysSearchDEDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDEDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSearchDEId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSearchDEId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDEDTO id(String strValue) {
        this.setPSSysSearchDEId(strValue);
        return this;
    }
}
