package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchSchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSearchDocDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_DOCPARAMS = "DOCPARAMS";
    protected static final String DTOFIELD_DOCPARAMS = "docparams";
    public static final String FIELD_DOCTAG = "DOCTAG";
    protected static final String DTOFIELD_DOCTAG = "doctag";
    public static final String FIELD_DOCTAG2 = "DOCTAG2";
    protected static final String DTOFIELD_DOCTAG2 = "doctag2";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHDOCNAME = "PSSYSSEARCHDOCNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";
    public static final String FIELD_PSSYSSEARCHSCHEMEID = "PSSYSSEARCHSCHEMEID";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";
    public static final String FIELD_PSSYSSEARCHSCHEMENAME = "PSSYSSEARCHSCHEMENAME";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";
    public static final String FIELD_REPLICAS = "REPLICAS";
    protected static final String DTOFIELD_REPLICAS = "replicas";
    public static final String FIELD_SHARDS = "SHARDS";
    protected static final String DTOFIELD_SHARDS = "shards";
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
    public PSSysSearchDocDTO codename(String codeName) {
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
    public PSSysSearchDocDTO createdate(Timestamp createDate) {
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
    public PSSysSearchDocDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSSysSearchDocDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDocDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="docparams")
    public void setDocParams(String docParams) {
        this._set(DTOFIELD_DOCPARAMS, docParams);
    }

    @JsonIgnore
    public String getDocParams() {
        Object objValue = this._get(DTOFIELD_DOCPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocParamsDirty() {
        return this._contains(DTOFIELD_DOCPARAMS);
    }

    @JsonIgnore
    public void resetDocParams() {
        this._reset(DTOFIELD_DOCPARAMS);
    }

    @JsonIgnore
    public PSSysSearchDocDTO docparams(String docParams) {
        this.setDocParams(docParams);
        return this;
    }

    @JsonProperty(value="doctag")
    public void setDocTag(String docTag) {
        this._set(DTOFIELD_DOCTAG, docTag);
    }

    @JsonIgnore
    public String getDocTag() {
        Object objValue = this._get(DTOFIELD_DOCTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocTagDirty() {
        return this._contains(DTOFIELD_DOCTAG);
    }

    @JsonIgnore
    public void resetDocTag() {
        this._reset(DTOFIELD_DOCTAG);
    }

    @JsonIgnore
    public PSSysSearchDocDTO doctag(String docTag) {
        this.setDocTag(docTag);
        return this;
    }

    @JsonProperty(value="doctag2")
    public void setDocTag2(String docTag2) {
        this._set(DTOFIELD_DOCTAG2, docTag2);
    }

    @JsonIgnore
    public String getDocTag2() {
        Object objValue = this._get(DTOFIELD_DOCTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocTag2Dirty() {
        return this._contains(DTOFIELD_DOCTAG2);
    }

    @JsonIgnore
    public void resetDocTag2() {
        this._reset(DTOFIELD_DOCTAG2);
    }

    @JsonIgnore
    public PSSysSearchDocDTO doctag2(String docTag2) {
        this.setDocTag2(docTag2);
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
    public PSSysSearchDocDTO logicname(String logicName) {
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
    public PSSysSearchDocDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysSearchDocDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
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
    public PSSysSearchDocDTO pssyssearchdocname(String pSSysSearchDocName) {
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSearchDocName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSearchDocName(strName);
    }

    @JsonIgnore
    public PSSysSearchDocDTO name(String strName) {
        this.setPSSysSearchDocName(strName);
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
    public PSSysSearchDocDTO pssyssearchschemeid(String pSSysSearchSchemeId) {
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDocDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme) {
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
    public PSSysSearchDocDTO pssyssearchschemename(String pSSysSearchSchemeName) {
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    @JsonProperty(value="replicas")
    public void setReplicas(Integer replicas) {
        this._set(DTOFIELD_REPLICAS, replicas);
    }

    @JsonIgnore
    public Integer getReplicas() {
        Object objValue = this._get(DTOFIELD_REPLICAS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReplicasDirty() {
        return this._contains(DTOFIELD_REPLICAS);
    }

    @JsonIgnore
    public void resetReplicas() {
        this._reset(DTOFIELD_REPLICAS);
    }

    @JsonIgnore
    public PSSysSearchDocDTO replicas(Integer replicas) {
        this.setReplicas(replicas);
        return this;
    }

    @JsonProperty(value="shards")
    public void setShards(Integer shards) {
        this._set(DTOFIELD_SHARDS, shards);
    }

    @JsonIgnore
    public Integer getShards() {
        Object objValue = this._get(DTOFIELD_SHARDS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShardsDirty() {
        return this._contains(DTOFIELD_SHARDS);
    }

    @JsonIgnore
    public void resetShards() {
        this._reset(DTOFIELD_SHARDS);
    }

    @JsonIgnore
    public PSSysSearchDocDTO shards(Integer shards) {
        this.setShards(shards);
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
    public PSSysSearchDocDTO updatedate(Timestamp updateDate) {
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
    public PSSysSearchDocDTO updateman(String updateMan) {
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
    public PSSysSearchDocDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDocDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSearchDocDTO usertag(String userTag) {
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
    public PSSysSearchDocDTO usertag2(String userTag2) {
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
    public PSSysSearchDocDTO usertag3(String userTag3) {
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
    public PSSysSearchDocDTO usertag4(String userTag4) {
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
    public PSSysSearchDocDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSearchDocDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSearchDocId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSearchDocId(strValue);
    }

    @JsonIgnore
    public PSSysSearchDocDTO id(String strValue) {
        this.setPSSysSearchDocId(strValue);
        return this;
    }
}
