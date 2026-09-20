package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysContentCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysResourceDTO
extends PSModelDTOBase {
    public static final String FIELD_AUTHACCESSTOKENURI = "AUTHACCESSTOKENURI";
    protected static final String DTOFIELD_AUTHACCESSTOKENURI = "authaccesstokenuri";
    public static final String FIELD_AUTHCLIENTID = "AUTHCLIENTID";
    protected static final String DTOFIELD_AUTHCLIENTID = "authclientid";
    public static final String FIELD_AUTHCLIENTSECRET = "AUTHCLIENTSECRET";
    protected static final String DTOFIELD_AUTHCLIENTSECRET = "authclientsecret";
    public static final String FIELD_AUTHMODE = "AUTHMODE";
    protected static final String DTOFIELD_AUTHMODE = "authmode";
    public static final String FIELD_AUTHPARAM = "AUTHPARAM";
    protected static final String DTOFIELD_AUTHPARAM = "authparam";
    public static final String FIELD_AUTHPARAM2 = "AUTHPARAM2";
    protected static final String DTOFIELD_AUTHPARAM2 = "authparam2";
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENTPSDEFID = "CONTENTPSDEFID";
    protected static final String DTOFIELD_CONTENTPSDEFID = "contentpsdefid";
    public static final String FIELD_CONTENTPSDEFNAME = "CONTENTPSDEFNAME";
    protected static final String DTOFIELD_CONTENTPSDEFNAME = "contentpsdefname";
    public static final String FIELD_CONTENTPSLANRESID = "CONTENTPSLANRESID";
    protected static final String DTOFIELD_CONTENTPSLANRESID = "contentpslanresid";
    public static final String FIELD_CONTENTPSLANRESNAME = "CONTENTPSLANRESNAME";
    protected static final String DTOFIELD_CONTENTPSLANRESNAME = "contentpslanresname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NAMEPSDEFID = "NAMEPSDEFID";
    protected static final String DTOFIELD_NAMEPSDEFID = "namepsdefid";
    public static final String FIELD_NAMEPSDEFNAME = "NAMEPSDEFNAME";
    protected static final String DTOFIELD_NAMEPSDEFNAME = "namepsdefname";
    public static final String FIELD_PATHPSDEFID = "PATHPSDEFID";
    protected static final String DTOFIELD_PATHPSDEFID = "pathpsdefid";
    public static final String FIELD_PATHPSDEFNAME = "PATHPSDEFNAME";
    protected static final String DTOFIELD_PATHPSDEFNAME = "pathpsdefname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCONTENTCATID = "PSSYSCONTENTCATID";
    protected static final String DTOFIELD_PSSYSCONTENTCATID = "pssyscontentcatid";
    public static final String FIELD_PSSYSCONTENTCATNAME = "PSSYSCONTENTCATNAME";
    protected static final String DTOFIELD_PSSYSCONTENTCATNAME = "pssyscontentcatname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_RESOURCEPARAMS = "RESOURCEPARAMS";
    protected static final String DTOFIELD_RESOURCEPARAMS = "resourceparams";
    public static final String FIELD_RESOURCETYPE = "RESOURCETYPE";
    protected static final String DTOFIELD_RESOURCETYPE = "resourcetype";
    public static final String FIELD_RESOURCEURI = "RESOURCEURI";
    protected static final String DTOFIELD_RESOURCEURI = "resourceuri";
    public static final String FIELD_RESTAG = "RESTAG";
    protected static final String DTOFIELD_RESTAG = "restag";
    public static final String FIELD_SUBJECT = "SUBJECT";
    protected static final String DTOFIELD_SUBJECT = "subject";
    public static final String FIELD_TAGPSDEFID = "TAGPSDEFID";
    protected static final String DTOFIELD_TAGPSDEFID = "tagpsdefid";
    public static final String FIELD_TAGPSDEFNAME = "TAGPSDEFNAME";
    protected static final String DTOFIELD_TAGPSDEFNAME = "tagpsdefname";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USER2PSDEFID = "USER2PSDEFID";
    protected static final String DTOFIELD_USER2PSDEFID = "user2psdefid";
    public static final String FIELD_USER2PSDEFNAME = "USER2PSDEFNAME";
    protected static final String DTOFIELD_USER2PSDEFNAME = "user2psdefname";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPSDEFID = "USERPSDEFID";
    protected static final String DTOFIELD_USERPSDEFID = "userpsdefid";
    public static final String FIELD_USERPSDEFNAME = "USERPSDEFNAME";
    protected static final String DTOFIELD_USERPSDEFNAME = "userpsdefname";
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

    @JsonProperty(value="authaccesstokenuri")
    public void setAuthAccessTokenUri(String authAccessTokenUri) {
        this._set(DTOFIELD_AUTHACCESSTOKENURI, authAccessTokenUri);
    }

    @JsonIgnore
    public String getAuthAccessTokenUri() {
        Object objValue = this._get(DTOFIELD_AUTHACCESSTOKENURI);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthAccessTokenUriDirty() {
        return this._contains(DTOFIELD_AUTHACCESSTOKENURI);
    }

    @JsonIgnore
    public void resetAuthAccessTokenUri() {
        this._reset(DTOFIELD_AUTHACCESSTOKENURI);
    }

    @JsonIgnore
    public PSSysResourceDTO authaccesstokenuri(String authAccessTokenUri) {
        this.setAuthAccessTokenUri(authAccessTokenUri);
        return this;
    }

    @JsonProperty(value="authclientid")
    public void setAuthClientId(String authClientId) {
        this._set(DTOFIELD_AUTHCLIENTID, authClientId);
    }

    @JsonIgnore
    public String getAuthClientId() {
        Object objValue = this._get(DTOFIELD_AUTHCLIENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthClientIdDirty() {
        return this._contains(DTOFIELD_AUTHCLIENTID);
    }

    @JsonIgnore
    public void resetAuthClientId() {
        this._reset(DTOFIELD_AUTHCLIENTID);
    }

    @JsonIgnore
    public PSSysResourceDTO authclientid(String authClientId) {
        this.setAuthClientId(authClientId);
        return this;
    }

    @JsonProperty(value="authclientsecret")
    public void setAuthClientSecret(String authClientSecret) {
        this._set(DTOFIELD_AUTHCLIENTSECRET, authClientSecret);
    }

    @JsonIgnore
    public String getAuthClientSecret() {
        Object objValue = this._get(DTOFIELD_AUTHCLIENTSECRET);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthClientSecretDirty() {
        return this._contains(DTOFIELD_AUTHCLIENTSECRET);
    }

    @JsonIgnore
    public void resetAuthClientSecret() {
        this._reset(DTOFIELD_AUTHCLIENTSECRET);
    }

    @JsonIgnore
    public PSSysResourceDTO authclientsecret(String authClientSecret) {
        this.setAuthClientSecret(authClientSecret);
        return this;
    }

    @JsonProperty(value="authmode")
    public void setAuthMode(String authMode) {
        this._set(DTOFIELD_AUTHMODE, authMode);
    }

    @JsonIgnore
    public String getAuthMode() {
        Object objValue = this._get(DTOFIELD_AUTHMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthModeDirty() {
        return this._contains(DTOFIELD_AUTHMODE);
    }

    @JsonIgnore
    public void resetAuthMode() {
        this._reset(DTOFIELD_AUTHMODE);
    }

    @JsonIgnore
    public PSSysResourceDTO authmode(String authMode) {
        this.setAuthMode(authMode);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO authmode(PSModelEnums.APIAuthMode authMode) {
        if (authMode == null) {
            this.setAuthMode(null);
        } else {
            this.setAuthMode(authMode.value);
        }
        return this;
    }

    @JsonProperty(value="authparam")
    public void setAuthParam(String authParam) {
        this._set(DTOFIELD_AUTHPARAM, authParam);
    }

    @JsonIgnore
    public String getAuthParam() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParamDirty() {
        return this._contains(DTOFIELD_AUTHPARAM);
    }

    @JsonIgnore
    public void resetAuthParam() {
        this._reset(DTOFIELD_AUTHPARAM);
    }

    @JsonIgnore
    public PSSysResourceDTO authparam(String authParam) {
        this.setAuthParam(authParam);
        return this;
    }

    @JsonProperty(value="authparam2")
    public void setAuthParam2(String authParam2) {
        this._set(DTOFIELD_AUTHPARAM2, authParam2);
    }

    @JsonIgnore
    public String getAuthParam2() {
        Object objValue = this._get(DTOFIELD_AUTHPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthParam2Dirty() {
        return this._contains(DTOFIELD_AUTHPARAM2);
    }

    @JsonIgnore
    public void resetAuthParam2() {
        this._reset(DTOFIELD_AUTHPARAM2);
    }

    @JsonIgnore
    public PSSysResourceDTO authparam2(String authParam2) {
        this.setAuthParam2(authParam2);
        return this;
    }

    @JsonProperty(value="content")
    public void setContent(String content) {
        this._set(DTOFIELD_CONTENT, content);
    }

    @JsonIgnore
    public String getContent() {
        Object objValue = this._get(DTOFIELD_CONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentDirty() {
        return this._contains(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public void resetContent() {
        this._reset(DTOFIELD_CONTENT);
    }

    @JsonIgnore
    public PSSysResourceDTO content(String content) {
        this.setContent(content);
        return this;
    }

    @JsonProperty(value="contentpsdefid")
    public void setContentPSDEFId(String contentPSDEFId) {
        this._set(DTOFIELD_CONTENTPSDEFID, contentPSDEFId);
    }

    @JsonIgnore
    public String getContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetContentPSDEFId() {
        this._reset(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO contentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        } else {
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="contentpsdefname")
    public void setContentPSDEFName(String contentPSDEFName) {
        this._set(DTOFIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }

    @JsonIgnore
    public String getContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetContentPSDEFName() {
        this._reset(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO contentpsdefname(String contentPSDEFName) {
        this.setContentPSDEFName(contentPSDEFName);
        return this;
    }

    @JsonProperty(value="contentpslanresid")
    public void setContentPSLanResId(String contentPSLanResId) {
        this._set(DTOFIELD_CONTENTPSLANRESID, contentPSLanResId);
    }

    @JsonIgnore
    public String getContentPSLanResId() {
        Object objValue = this._get(DTOFIELD_CONTENTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSLanResIdDirty() {
        return this._contains(DTOFIELD_CONTENTPSLANRESID);
    }

    @JsonIgnore
    public void resetContentPSLanResId() {
        this._reset(DTOFIELD_CONTENTPSLANRESID);
    }

    @JsonIgnore
    public PSSysResourceDTO contentpslanresid(String contentPSLanResId) {
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO contentpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setContentPSLanResId(null);
            this.setContentPSLanResName(null);
        } else {
            this.setContentPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setContentPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="contentpslanresname")
    public void setContentPSLanResName(String contentPSLanResName) {
        this._set(DTOFIELD_CONTENTPSLANRESNAME, contentPSLanResName);
    }

    @JsonIgnore
    public String getContentPSLanResName() {
        Object objValue = this._get(DTOFIELD_CONTENTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSLanResNameDirty() {
        return this._contains(DTOFIELD_CONTENTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetContentPSLanResName() {
        this._reset(DTOFIELD_CONTENTPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO contentpslanresname(String contentPSLanResName) {
        this.setContentPSLanResName(contentPSLanResName);
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
    public PSSysResourceDTO createdate(Timestamp createDate) {
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
    public PSSysResourceDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSSysResourceDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSSysResourceDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
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
    public PSSysResourceDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="namepsdefid")
    public void setNamePSDEFId(String namePSDEFId) {
        this._set(DTOFIELD_NAMEPSDEFID, namePSDEFId);
    }

    @JsonIgnore
    public String getNamePSDEFId() {
        Object objValue = this._get(DTOFIELD_NAMEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSDEFIdDirty() {
        return this._contains(DTOFIELD_NAMEPSDEFID);
    }

    @JsonIgnore
    public void resetNamePSDEFId() {
        this._reset(DTOFIELD_NAMEPSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO namepsdefid(String namePSDEFId) {
        this.setNamePSDEFId(namePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO namepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNamePSDEFId(null);
            this.setNamePSDEFName(null);
        } else {
            this.setNamePSDEFId(pSDEField.getPSDEFieldId());
            this.setNamePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="namepsdefname")
    public void setNamePSDEFName(String namePSDEFName) {
        this._set(DTOFIELD_NAMEPSDEFNAME, namePSDEFName);
    }

    @JsonIgnore
    public String getNamePSDEFName() {
        Object objValue = this._get(DTOFIELD_NAMEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSDEFNameDirty() {
        return this._contains(DTOFIELD_NAMEPSDEFNAME);
    }

    @JsonIgnore
    public void resetNamePSDEFName() {
        this._reset(DTOFIELD_NAMEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO namepsdefname(String namePSDEFName) {
        this.setNamePSDEFName(namePSDEFName);
        return this;
    }

    @JsonProperty(value="pathpsdefid")
    public void setPathPSDEFId(String pathPSDEFId) {
        this._set(DTOFIELD_PATHPSDEFID, pathPSDEFId);
    }

    @JsonIgnore
    public String getPathPSDEFId() {
        Object objValue = this._get(DTOFIELD_PATHPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPathPSDEFIdDirty() {
        return this._contains(DTOFIELD_PATHPSDEFID);
    }

    @JsonIgnore
    public void resetPathPSDEFId() {
        this._reset(DTOFIELD_PATHPSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO pathpsdefid(String pathPSDEFId) {
        this.setPathPSDEFId(pathPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO pathpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPathPSDEFId(null);
            this.setPathPSDEFName(null);
        } else {
            this.setPathPSDEFId(pSDEField.getPSDEFieldId());
            this.setPathPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="pathpsdefname")
    public void setPathPSDEFName(String pathPSDEFName) {
        this._set(DTOFIELD_PATHPSDEFNAME, pathPSDEFName);
    }

    @JsonIgnore
    public String getPathPSDEFName() {
        Object objValue = this._get(DTOFIELD_PATHPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPathPSDEFNameDirty() {
        return this._contains(DTOFIELD_PATHPSDEFNAME);
    }

    @JsonIgnore
    public void resetPathPSDEFName() {
        this._reset(DTOFIELD_PATHPSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO pathpsdefname(String pathPSDEFName) {
        this.setPathPSDEFName(pathPSDEFName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSSysResourceDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSSysResourceDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysResourceDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSysResourceDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSysResourceDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssyscontentcatid")
    public void setPSSysContentCatId(String pSSysContentCatId) {
        this._set(DTOFIELD_PSSYSCONTENTCATID, pSSysContentCatId);
    }

    @JsonIgnore
    public String getPSSysContentCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSCONTENTCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysContentCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSCONTENTCATID);
    }

    @JsonIgnore
    public void resetPSSysContentCatId() {
        this._reset(DTOFIELD_PSSYSCONTENTCATID);
    }

    @JsonIgnore
    public PSSysResourceDTO pssyscontentcatid(String pSSysContentCatId) {
        this.setPSSysContentCatId(pSSysContentCatId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO pssyscontentcatid(PSSysContentCatDTO pSSysContentCat) {
        if (pSSysContentCat == null) {
            this.setPSSysContentCatId(null);
            this.setPSSysContentCatName(null);
        } else {
            this.setPSSysContentCatId(pSSysContentCat.getPSSysContentCatId());
            this.setPSSysContentCatName(pSSysContentCat.getPSSysContentCatName());
        }
        return this;
    }

    @JsonProperty(value="pssyscontentcatname")
    public void setPSSysContentCatName(String pSSysContentCatName) {
        this._set(DTOFIELD_PSSYSCONTENTCATNAME, pSSysContentCatName);
    }

    @JsonIgnore
    public String getPSSysContentCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSCONTENTCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysContentCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSCONTENTCATNAME);
    }

    @JsonIgnore
    public void resetPSSysContentCatName() {
        this._reset(DTOFIELD_PSSYSCONTENTCATNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO pssyscontentcatname(String pSSysContentCatName) {
        this.setPSSysContentCatName(pSSysContentCatName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSSysResourceDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSSysResourceDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysResourceName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysResourceName(strName);
    }

    @JsonIgnore
    public PSSysResourceDTO name(String strName) {
        this.setPSSysResourceName(strName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSSysResourceDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="resourceparams")
    public void setResourceParams(String resourceParams) {
        this._set(DTOFIELD_RESOURCEPARAMS, resourceParams);
    }

    @JsonIgnore
    public String getResourceParams() {
        Object objValue = this._get(DTOFIELD_RESOURCEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResourceParamsDirty() {
        return this._contains(DTOFIELD_RESOURCEPARAMS);
    }

    @JsonIgnore
    public void resetResourceParams() {
        this._reset(DTOFIELD_RESOURCEPARAMS);
    }

    @JsonIgnore
    public PSSysResourceDTO resourceparams(String resourceParams) {
        this.setResourceParams(resourceParams);
        return this;
    }

    @JsonProperty(value="resourcetype")
    public void setResourceType(String resourceType) {
        this._set(DTOFIELD_RESOURCETYPE, resourceType);
    }

    @JsonIgnore
    public String getResourceType() {
        Object objValue = this._get(DTOFIELD_RESOURCETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResourceTypeDirty() {
        return this._contains(DTOFIELD_RESOURCETYPE);
    }

    @JsonIgnore
    public void resetResourceType() {
        this._reset(DTOFIELD_RESOURCETYPE);
    }

    @JsonIgnore
    public PSSysResourceDTO resourcetype(String resourceType) {
        this.setResourceType(resourceType);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO resourcetype(PSModelEnums.ResourceType resourceType) {
        if (resourceType == null) {
            this.setResourceType(null);
        } else {
            this.setResourceType(resourceType.value);
        }
        return this;
    }

    @JsonProperty(value="resourceuri")
    public void setResourceUri(String resourceUri) {
        this._set(DTOFIELD_RESOURCEURI, resourceUri);
    }

    @JsonIgnore
    public String getResourceUri() {
        Object objValue = this._get(DTOFIELD_RESOURCEURI);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResourceUriDirty() {
        return this._contains(DTOFIELD_RESOURCEURI);
    }

    @JsonIgnore
    public void resetResourceUri() {
        this._reset(DTOFIELD_RESOURCEURI);
    }

    @JsonIgnore
    public PSSysResourceDTO resourceuri(String resourceUri) {
        this.setResourceUri(resourceUri);
        return this;
    }

    @JsonProperty(value="restag")
    public void setResTag(String resTag) {
        this._set(DTOFIELD_RESTAG, resTag);
    }

    @JsonIgnore
    public String getResTag() {
        Object objValue = this._get(DTOFIELD_RESTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResTagDirty() {
        return this._contains(DTOFIELD_RESTAG);
    }

    @JsonIgnore
    public void resetResTag() {
        this._reset(DTOFIELD_RESTAG);
    }

    @JsonIgnore
    public PSSysResourceDTO restag(String resTag) {
        this.setResTag(resTag);
        return this;
    }

    @JsonProperty(value="subject")
    public void setSubject(String subject) {
        this._set(DTOFIELD_SUBJECT, subject);
    }

    @JsonIgnore
    public String getSubject() {
        Object objValue = this._get(DTOFIELD_SUBJECT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubjectDirty() {
        return this._contains(DTOFIELD_SUBJECT);
    }

    @JsonIgnore
    public void resetSubject() {
        this._reset(DTOFIELD_SUBJECT);
    }

    @JsonIgnore
    public PSSysResourceDTO subject(String subject) {
        this.setSubject(subject);
        return this;
    }

    @JsonProperty(value="tagpsdefid")
    public void setTagPSDEFId(String tagPSDEFId) {
        this._set(DTOFIELD_TAGPSDEFID, tagPSDEFId);
    }

    @JsonIgnore
    public String getTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_TAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_TAGPSDEFID);
    }

    @JsonIgnore
    public void resetTagPSDEFId() {
        this._reset(DTOFIELD_TAGPSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO tagpsdefid(String tagPSDEFId) {
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO tagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTagPSDEFId(null);
            this.setTagPSDEFName(null);
        } else {
            this.setTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tagpsdefname")
    public void setTagPSDEFName(String tagPSDEFName) {
        this._set(DTOFIELD_TAGPSDEFNAME, tagPSDEFName);
    }

    @JsonIgnore
    public String getTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_TAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_TAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetTagPSDEFName() {
        this._reset(DTOFIELD_TAGPSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO tagpsdefname(String tagPSDEFName) {
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    @JsonProperty(value="tags")
    public void setTags(String tags) {
        this._set(DTOFIELD_TAGS, tags);
    }

    @JsonIgnore
    public String getTags() {
        Object objValue = this._get(DTOFIELD_TAGS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagsDirty() {
        return this._contains(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public void resetTags() {
        this._reset(DTOFIELD_TAGS);
    }

    @JsonIgnore
    public PSSysResourceDTO tags(String tags) {
        this.setTags(tags);
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
    public PSSysResourceDTO updatedate(Timestamp updateDate) {
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
    public PSSysResourceDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="user2psdefid")
    public void setUser2PSDEFId(String user2PSDEFId) {
        this._set(DTOFIELD_USER2PSDEFID, user2PSDEFId);
    }

    @JsonIgnore
    public String getUser2PSDEFId() {
        Object objValue = this._get(DTOFIELD_USER2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEFIdDirty() {
        return this._contains(DTOFIELD_USER2PSDEFID);
    }

    @JsonIgnore
    public void resetUser2PSDEFId() {
        this._reset(DTOFIELD_USER2PSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO user2psdefid(String user2PSDEFId) {
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO user2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUser2PSDEFId(null);
            this.setUser2PSDEFName(null);
        } else {
            this.setUser2PSDEFId(pSDEField.getPSDEFieldId());
            this.setUser2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="user2psdefname")
    public void setUser2PSDEFName(String user2PSDEFName) {
        this._set(DTOFIELD_USER2PSDEFNAME, user2PSDEFName);
    }

    @JsonIgnore
    public String getUser2PSDEFName() {
        Object objValue = this._get(DTOFIELD_USER2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEFNameDirty() {
        return this._contains(DTOFIELD_USER2PSDEFNAME);
    }

    @JsonIgnore
    public void resetUser2PSDEFName() {
        this._reset(DTOFIELD_USER2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO user2psdefname(String user2PSDEFName) {
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysResourceDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userpsdefid")
    public void setUserPSDEFId(String userPSDEFId) {
        this._set(DTOFIELD_USERPSDEFID, userPSDEFId);
    }

    @JsonIgnore
    public String getUserPSDEFId() {
        Object objValue = this._get(DTOFIELD_USERPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEFIdDirty() {
        return this._contains(DTOFIELD_USERPSDEFID);
    }

    @JsonIgnore
    public void resetUserPSDEFId() {
        this._reset(DTOFIELD_USERPSDEFID);
    }

    @JsonIgnore
    public PSSysResourceDTO userpsdefid(String userPSDEFId) {
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO userpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUserPSDEFId(null);
            this.setUserPSDEFName(null);
        } else {
            this.setUserPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="userpsdefname")
    public void setUserPSDEFName(String userPSDEFName) {
        this._set(DTOFIELD_USERPSDEFNAME, userPSDEFName);
    }

    @JsonIgnore
    public String getUserPSDEFName() {
        Object objValue = this._get(DTOFIELD_USERPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEFNameDirty() {
        return this._contains(DTOFIELD_USERPSDEFNAME);
    }

    @JsonIgnore
    public void resetUserPSDEFName() {
        this._reset(DTOFIELD_USERPSDEFNAME);
    }

    @JsonIgnore
    public PSSysResourceDTO userpsdefname(String userPSDEFName) {
        this.setUserPSDEFName(userPSDEFName);
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
    public PSSysResourceDTO usertag(String userTag) {
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
    public PSSysResourceDTO usertag2(String userTag2) {
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
    public PSSysResourceDTO usertag3(String userTag3) {
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
    public PSSysResourceDTO usertag4(String userTag4) {
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
    public PSSysResourceDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysResourceDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysResourceId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysResourceId(strValue);
    }

    @JsonIgnore
    public PSSysResourceDTO id(String strValue) {
        this.setPSSysResourceId(strValue);
        return this;
    }
}
