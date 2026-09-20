package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSViewMsgDTO
extends PSModelDTOBase {
    public static final String FIELD_CACHESCOPE = "CACHESCOPE";
    protected static final String DTOFIELD_CACHESCOPE = "cachescope";
    public static final String FIELD_CACHETAG2PSDEFID = "CACHETAG2PSDEFID";
    protected static final String DTOFIELD_CACHETAG2PSDEFID = "cachetag2psdefid";
    public static final String FIELD_CACHETAG2PSDEFNAME = "CACHETAG2PSDEFNAME";
    protected static final String DTOFIELD_CACHETAG2PSDEFNAME = "cachetag2psdefname";
    public static final String FIELD_CACHETAGPSDEFID = "CACHETAGPSDEFID";
    protected static final String DTOFIELD_CACHETAGPSDEFID = "cachetagpsdefid";
    public static final String FIELD_CACHETAGPSDEFNAME = "CACHETAGPSDEFNAME";
    protected static final String DTOFIELD_CACHETAGPSDEFNAME = "cachetagpsdefname";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
    public static final String FIELD_CLSPSDEFID = "CLSPSDEFID";
    protected static final String DTOFIELD_CLSPSDEFID = "clspsdefid";
    public static final String FIELD_CLSPSDEFNAME = "CLSPSDEFNAME";
    protected static final String DTOFIELD_CLSPSDEFNAME = "clspsdefname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
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
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CONTENTTYPEPSDEFID = "CONTENTTYPEPSDEFID";
    protected static final String DTOFIELD_CONTENTTYPEPSDEFID = "contenttypepsdefid";
    public static final String FIELD_CONTENTTYPEPSDEFNAME = "CONTENTTYPEPSDEFNAME";
    protected static final String DTOFIELD_CONTENTTYPEPSDEFNAME = "contenttypepsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DSLINK = "DSLINK";
    protected static final String DTOFIELD_DSLINK = "dslink";
    public static final String FIELD_DYNAMICMODE = "DYNAMICMODE";
    protected static final String DTOFIELD_DYNAMICMODE = "dynamicmode";
    public static final String FIELD_ENABLECACHE = "ENABLECACHE";
    protected static final String DTOFIELD_ENABLECACHE = "enablecache";
    public static final String FIELD_ENABLEMODE = "ENABLEMODE";
    protected static final String DTOFIELD_ENABLEMODE = "enablemode";
    public static final String FIELD_ENABLEREMOVE = "ENABLEREMOVE";
    protected static final String DTOFIELD_ENABLEREMOVE = "enableremove";
    public static final String FIELD_GROUPPSDEFID = "GROUPPSDEFID";
    protected static final String DTOFIELD_GROUPPSDEFID = "grouppsdefid";
    public static final String FIELD_GROUPPSDEFNAME = "GROUPPSDEFNAME";
    protected static final String DTOFIELD_GROUPPSDEFNAME = "grouppsdefname";
    public static final String FIELD_ICONPSDEFID = "ICONPSDEFID";
    protected static final String DTOFIELD_ICONPSDEFID = "iconpsdefid";
    public static final String FIELD_ICONPSDEFNAME = "ICONPSDEFNAME";
    protected static final String DTOFIELD_ICONPSDEFNAME = "iconpsdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSGGROUP = "MSGGROUP";
    protected static final String DTOFIELD_MSGGROUP = "msggroup";
    public static final String FIELD_MSGPOS = "MSGPOS";
    protected static final String DTOFIELD_MSGPOS = "msgpos";
    public static final String FIELD_MSGPOSPSDEFID = "MSGPOSPSDEFID";
    protected static final String DTOFIELD_MSGPOSPSDEFID = "msgpospsdefid";
    public static final String FIELD_MSGPOSPSDEFNAME = "MSGPOSPSDEFNAME";
    protected static final String DTOFIELD_MSGPOSPSDEFNAME = "msgpospsdefname";
    public static final String FIELD_MSGTYPE = "MSGTYPE";
    protected static final String DTOFIELD_MSGTYPE = "msgtype";
    public static final String FIELD_MSGTYPEPSDEFID = "MSGTYPEPSDEFID";
    protected static final String DTOFIELD_MSGTYPEPSDEFID = "msgtypepsdefid";
    public static final String FIELD_MSGTYPEPSDEFNAME = "MSGTYPEPSDEFNAME";
    protected static final String DTOFIELD_MSGTYPEPSDEFNAME = "msgtypepsdefname";
    public static final String FIELD_ORDERVALUEPSDEFID = "ORDERVALUEPSDEFID";
    protected static final String DTOFIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";
    public static final String FIELD_ORDERVALUEPSDEFNAME = "ORDERVALUEPSDEFNAME";
    protected static final String DTOFIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSVIEWMSGID = "PSVIEWMSGID";
    protected static final String DTOFIELD_PSVIEWMSGID = "psviewmsgid";
    public static final String FIELD_PSVIEWMSGNAME = "PSVIEWMSGNAME";
    protected static final String DTOFIELD_PSVIEWMSGNAME = "psviewmsgname";
    public static final String FIELD_REMOVEPSDEFID = "REMOVEPSDEFID";
    protected static final String DTOFIELD_REMOVEPSDEFID = "removepsdefid";
    public static final String FIELD_REMOVEPSDEFNAME = "REMOVEPSDEFNAME";
    protected static final String DTOFIELD_REMOVEPSDEFNAME = "removepsdefname";
    public static final String FIELD_TESTCUSTOMCODE = "TESTCUSTOMCODE";
    protected static final String DTOFIELD_TESTCUSTOMCODE = "testcustomcode";
    public static final String FIELD_TESTPSDELOGICID = "TESTPSDELOGICID";
    protected static final String DTOFIELD_TESTPSDELOGICID = "testpsdelogicid";
    public static final String FIELD_TESTPSDELOGICNAME = "TESTPSDELOGICNAME";
    protected static final String DTOFIELD_TESTPSDELOGICNAME = "testpsdelogicname";
    public static final String FIELD_TIMEOUT = "TIMEOUT";
    protected static final String DTOFIELD_TIMEOUT = "timeout";
    public static final String FIELD_TITLE = "TITLE";
    protected static final String DTOFIELD_TITLE = "title";
    public static final String FIELD_TITLELANRESTAGPSDEFID = "TITLELANRESTAGPSDEFID";
    protected static final String DTOFIELD_TITLELANRESTAGPSDEFID = "titlelanrestagpsdefid";
    public static final String FIELD_TITLELANRESTAGPSDEFNAME = "TITLELANRESTAGPSDEFNAME";
    protected static final String DTOFIELD_TITLELANRESTAGPSDEFNAME = "titlelanrestagpsdefname";
    public static final String FIELD_TITLEPSDEFID = "TITLEPSDEFID";
    protected static final String DTOFIELD_TITLEPSDEFID = "titlepsdefid";
    public static final String FIELD_TITLEPSDEFNAME = "TITLEPSDEFNAME";
    protected static final String DTOFIELD_TITLEPSDEFNAME = "titlepsdefname";
    public static final String FIELD_TITLEPSLANRESID = "TITLEPSLANRESID";
    protected static final String DTOFIELD_TITLEPSLANRESID = "titlepslanresid";
    public static final String FIELD_TITLEPSLANRESNAME = "TITLEPSLANRESNAME";
    protected static final String DTOFIELD_TITLEPSLANRESNAME = "titlepslanresname";
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
    public static final String FIELD_VIEWMSGPARAMS = "VIEWMSGPARAMS";
    protected static final String DTOFIELD_VIEWMSGPARAMS = "viewmsgparams";
    public static final String FIELD_VEWMSGTAG = "VIEWMSGTAG";
    protected static final String DTOFIELD_VEWMSGTAG = "vewmsgtag";
    public static final String FIELD_VEWMSGTAG2 = "VIEWMSGTAG2";
    protected static final String DTOFIELD_VEWMSGTAG2 = "vewmsgtag2";

    @JsonProperty(value="cachescope")
    public void setCacheScope(String cacheScope) {
        this._set(DTOFIELD_CACHESCOPE, cacheScope);
    }

    @JsonIgnore
    public String getCacheScope() {
        Object objValue = this._get(DTOFIELD_CACHESCOPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheScopeDirty() {
        return this._contains(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public void resetCacheScope() {
        this._reset(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public PSViewMsgDTO cachescope(String cacheScope) {
        this.setCacheScope(cacheScope);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO cachescope(PSModelEnums.ViewMsgCacheScope cacheScope) {
        if (cacheScope == null) {
            this.setCacheScope(null);
        } else {
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    @JsonProperty(value="cachetag2psdefid")
    public void setCacheTag2PSDEFId(String cacheTag2PSDEFId) {
        this._set(DTOFIELD_CACHETAG2PSDEFID, cacheTag2PSDEFId);
    }

    @JsonIgnore
    public String getCacheTag2PSDEFId() {
        Object objValue = this._get(DTOFIELD_CACHETAG2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTag2PSDEFIdDirty() {
        return this._contains(DTOFIELD_CACHETAG2PSDEFID);
    }

    @JsonIgnore
    public void resetCacheTag2PSDEFId() {
        this._reset(DTOFIELD_CACHETAG2PSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefid(String cacheTag2PSDEFId) {
        this.setCacheTag2PSDEFId(cacheTag2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setCacheTag2PSDEFId(null);
            this.setCacheTag2PSDEFName(null);
        } else {
            this.setCacheTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setCacheTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="cachetag2psdefname")
    public void setCacheTag2PSDEFName(String cacheTag2PSDEFName) {
        this._set(DTOFIELD_CACHETAG2PSDEFNAME, cacheTag2PSDEFName);
    }

    @JsonIgnore
    public String getCacheTag2PSDEFName() {
        Object objValue = this._get(DTOFIELD_CACHETAG2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTag2PSDEFNameDirty() {
        return this._contains(DTOFIELD_CACHETAG2PSDEFNAME);
    }

    @JsonIgnore
    public void resetCacheTag2PSDEFName() {
        this._reset(DTOFIELD_CACHETAG2PSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO cachetag2psdefname(String cacheTag2PSDEFName) {
        this.setCacheTag2PSDEFName(cacheTag2PSDEFName);
        return this;
    }

    @JsonProperty(value="cachetagpsdefid")
    public void setCacheTagPSDEFId(String cacheTagPSDEFId) {
        this._set(DTOFIELD_CACHETAGPSDEFID, cacheTagPSDEFId);
    }

    @JsonIgnore
    public String getCacheTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_CACHETAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_CACHETAGPSDEFID);
    }

    @JsonIgnore
    public void resetCacheTagPSDEFId() {
        this._reset(DTOFIELD_CACHETAGPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefid(String cacheTagPSDEFId) {
        this.setCacheTagPSDEFId(cacheTagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setCacheTagPSDEFId(null);
            this.setCacheTagPSDEFName(null);
        } else {
            this.setCacheTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setCacheTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="cachetagpsdefname")
    public void setCacheTagPSDEFName(String cacheTagPSDEFName) {
        this._set(DTOFIELD_CACHETAGPSDEFNAME, cacheTagPSDEFName);
    }

    @JsonIgnore
    public String getCacheTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_CACHETAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_CACHETAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetCacheTagPSDEFName() {
        this._reset(DTOFIELD_CACHETAGPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO cachetagpsdefname(String cacheTagPSDEFName) {
        this.setCacheTagPSDEFName(cacheTagPSDEFName);
        return this;
    }

    @JsonProperty(value="cachetimeout")
    public void setCacheTimeout(Integer cacheTimeout) {
        this._set(DTOFIELD_CACHETIMEOUT, cacheTimeout);
    }

    @JsonIgnore
    public Integer getCacheTimeout() {
        Object objValue = this._get(DTOFIELD_CACHETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheTimeoutDirty() {
        return this._contains(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public void resetCacheTimeout() {
        this._reset(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public PSViewMsgDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    @JsonProperty(value="clspsdefid")
    public void setClsPSDEFId(String clsPSDEFId) {
        this._set(DTOFIELD_CLSPSDEFID, clsPSDEFId);
    }

    @JsonIgnore
    public String getClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public void resetClsPSDEFId() {
        this._reset(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO clspsdefid(String clsPSDEFId) {
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO clspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        } else {
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="clspsdefname")
    public void setClsPSDEFName(String clsPSDEFName) {
        this._set(DTOFIELD_CLSPSDEFNAME, clsPSDEFName);
    }

    @JsonIgnore
    public String getClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetClsPSDEFName() {
        this._reset(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO clspsdefname(String clsPSDEFName) {
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

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
    public PSViewMsgDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSViewMsgDTO content(String content) {
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
    public PSViewMsgDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO contentpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSViewMsgDTO contentpsdefname(String contentPSDEFName) {
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
    public PSViewMsgDTO contentpslanresid(String contentPSLanResId) {
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO contentpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSViewMsgDTO contentpslanresname(String contentPSLanResName) {
        this.setContentPSLanResName(contentPSLanResName);
        return this;
    }

    @JsonProperty(value="contenttype")
    public void setContentType(String contentType) {
        this._set(DTOFIELD_CONTENTTYPE, contentType);
    }

    @JsonIgnore
    public String getContentType() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypeDirty() {
        return this._contains(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public void resetContentType() {
        this._reset(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public PSViewMsgDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO contenttype(PSModelEnums.ViewMsgContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
        }
        return this;
    }

    @JsonProperty(value="contenttypepsdefid")
    public void setContentTypePSDEFId(String contentTypePSDEFId) {
        this._set(DTOFIELD_CONTENTTYPEPSDEFID, contentTypePSDEFId);
    }

    @JsonIgnore
    public String getContentTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_CONTENTTYPEPSDEFID);
    }

    @JsonIgnore
    public void resetContentTypePSDEFId() {
        this._reset(DTOFIELD_CONTENTTYPEPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO contenttypepsdefid(String contentTypePSDEFId) {
        this.setContentTypePSDEFId(contentTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO contenttypepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setContentTypePSDEFId(null);
            this.setContentTypePSDEFName(null);
        } else {
            this.setContentTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setContentTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="contenttypepsdefname")
    public void setContentTypePSDEFName(String contentTypePSDEFName) {
        this._set(DTOFIELD_CONTENTTYPEPSDEFNAME, contentTypePSDEFName);
    }

    @JsonIgnore
    public String getContentTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_CONTENTTYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetContentTypePSDEFName() {
        this._reset(DTOFIELD_CONTENTTYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO contenttypepsdefname(String contentTypePSDEFName) {
        this.setContentTypePSDEFName(contentTypePSDEFName);
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
    public PSViewMsgDTO createdate(Timestamp createDate) {
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
    public PSViewMsgDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dslink")
    public void setDSLink(String dSLink) {
        this._set(DTOFIELD_DSLINK, dSLink);
    }

    @JsonIgnore
    public String getDSLink() {
        Object objValue = this._get(DTOFIELD_DSLINK);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSLinkDirty() {
        return this._contains(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public void resetDSLink() {
        this._reset(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public PSViewMsgDTO dslink(String dSLink) {
        this.setDSLink(dSLink);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO dslink(PSModelEnums.DataSourceLink dSLink) {
        if (dSLink == null) {
            this.setDSLink(null);
        } else {
            this.setDSLink(dSLink.value);
        }
        return this;
    }

    @JsonProperty(value="dynamicmode")
    public void setDynamicMode(Integer dynamicMode) {
        this._set(DTOFIELD_DYNAMICMODE, dynamicMode);
    }

    @JsonIgnore
    public Integer getDynamicMode() {
        Object objValue = this._get(DTOFIELD_DYNAMICMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDynamicModeDirty() {
        return this._contains(DTOFIELD_DYNAMICMODE);
    }

    @JsonIgnore
    public void resetDynamicMode() {
        this._reset(DTOFIELD_DYNAMICMODE);
    }

    @JsonIgnore
    public PSViewMsgDTO dynamicmode(Integer dynamicMode) {
        this.setDynamicMode(dynamicMode);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO dynamicmode(PSModelEnums.ViewMsgDynamicMode dynamicMode) {
        if (dynamicMode == null) {
            this.setDynamicMode(null);
        } else {
            this.setDynamicMode(dynamicMode.value);
        }
        return this;
    }

    @JsonProperty(value="enablecache")
    public void setEnableCache(Integer enableCache) {
        this._set(DTOFIELD_ENABLECACHE, enableCache);
    }

    @JsonIgnore
    public Integer getEnableCache() {
        Object objValue = this._get(DTOFIELD_ENABLECACHE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCacheDirty() {
        return this._contains(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public void resetEnableCache() {
        this._reset(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public PSViewMsgDTO enablecache(Integer enableCache) {
        this.setEnableCache(enableCache);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO enablecache(Boolean enableCache) {
        if (enableCache == null) {
            this.setEnableCache(null);
        } else {
            this.setEnableCache(enableCache != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablemode")
    public void setEnableMode(String enableMode) {
        this._set(DTOFIELD_ENABLEMODE, enableMode);
    }

    @JsonIgnore
    public String getEnableMode() {
        Object objValue = this._get(DTOFIELD_ENABLEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnableModeDirty() {
        return this._contains(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public void resetEnableMode() {
        this._reset(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public PSViewMsgDTO enablemode(String enableMode) {
        this.setEnableMode(enableMode);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO enablemode(PSModelEnums.ViewMsgEnableMode enableMode) {
        if (enableMode == null) {
            this.setEnableMode(null);
        } else {
            this.setEnableMode(enableMode.value);
        }
        return this;
    }

    @JsonProperty(value="enableremove")
    public void setEnableRemove(Integer enableRemove) {
        this._set(DTOFIELD_ENABLEREMOVE, enableRemove);
    }

    @JsonIgnore
    public Integer getEnableRemove() {
        Object objValue = this._get(DTOFIELD_ENABLEREMOVE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableRemoveDirty() {
        return this._contains(DTOFIELD_ENABLEREMOVE);
    }

    @JsonIgnore
    public void resetEnableRemove() {
        this._reset(DTOFIELD_ENABLEREMOVE);
    }

    @JsonIgnore
    public PSViewMsgDTO enableremove(Integer enableRemove) {
        this.setEnableRemove(enableRemove);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO enableremove(PSModelEnums.ViewMsgRemoveMode enableRemove) {
        if (enableRemove == null) {
            this.setEnableRemove(null);
        } else {
            this.setEnableRemove(enableRemove.value);
        }
        return this;
    }

    @JsonProperty(value="grouppsdefid")
    public void setGroupPSDEFId(String groupPSDEFId) {
        this._set(DTOFIELD_GROUPPSDEFID, groupPSDEFId);
    }

    @JsonIgnore
    public String getGroupPSDEFId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public void resetGroupPSDEFId() {
        this._reset(DTOFIELD_GROUPPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO grouppsdefid(String groupPSDEFId) {
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO grouppsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        } else {
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdefname")
    public void setGroupPSDEFName(String groupPSDEFName) {
        this._set(DTOFIELD_GROUPPSDEFNAME, groupPSDEFName);
    }

    @JsonIgnore
    public String getGroupPSDEFName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEFNameDirty() {
        return this._contains(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public void resetGroupPSDEFName() {
        this._reset(DTOFIELD_GROUPPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO grouppsdefname(String groupPSDEFName) {
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    @JsonProperty(value="iconpsdefid")
    public void setIconPSDEFId(String iconPSDEFId) {
        this._set(DTOFIELD_ICONPSDEFID, iconPSDEFId);
    }

    @JsonIgnore
    public String getIconPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public void resetIconPSDEFId() {
        this._reset(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO iconpsdefid(String iconPSDEFId) {
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO iconpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        } else {
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconpsdefname")
    public void setIconPSDEFName(String iconPSDEFName) {
        this._set(DTOFIELD_ICONPSDEFNAME, iconPSDEFName);
    }

    @JsonIgnore
    public String getIconPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconPSDEFName() {
        this._reset(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO iconpsdefname(String iconPSDEFName) {
        this.setIconPSDEFName(iconPSDEFName);
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
    public PSViewMsgDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="msggroup")
    public void setMsgGroup(String msgGroup) {
        this._set(DTOFIELD_MSGGROUP, msgGroup);
    }

    @JsonIgnore
    public String getMsgGroup() {
        Object objValue = this._get(DTOFIELD_MSGGROUP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgGroupDirty() {
        return this._contains(DTOFIELD_MSGGROUP);
    }

    @JsonIgnore
    public void resetMsgGroup() {
        this._reset(DTOFIELD_MSGGROUP);
    }

    @JsonIgnore
    public PSViewMsgDTO msggroup(String msgGroup) {
        this.setMsgGroup(msgGroup);
        return this;
    }

    @JsonProperty(value="msgpos")
    public void setMsgPos(String msgPos) {
        this._set(DTOFIELD_MSGPOS, msgPos);
    }

    @JsonIgnore
    public String getMsgPos() {
        Object objValue = this._get(DTOFIELD_MSGPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgPosDirty() {
        return this._contains(DTOFIELD_MSGPOS);
    }

    @JsonIgnore
    public void resetMsgPos() {
        this._reset(DTOFIELD_MSGPOS);
    }

    @JsonIgnore
    public PSViewMsgDTO msgpos(String msgPos) {
        this.setMsgPos(msgPos);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO msgpos(PSModelEnums.ViewMsgPos msgPos) {
        if (msgPos == null) {
            this.setMsgPos(null);
        } else {
            this.setMsgPos(msgPos.value);
        }
        return this;
    }

    @JsonProperty(value="msgpospsdefid")
    public void setMsgPosPSDEFId(String msgPosPSDEFId) {
        this._set(DTOFIELD_MSGPOSPSDEFID, msgPosPSDEFId);
    }

    @JsonIgnore
    public String getMsgPosPSDEFId() {
        Object objValue = this._get(DTOFIELD_MSGPOSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgPosPSDEFIdDirty() {
        return this._contains(DTOFIELD_MSGPOSPSDEFID);
    }

    @JsonIgnore
    public void resetMsgPosPSDEFId() {
        this._reset(DTOFIELD_MSGPOSPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO msgpospsdefid(String msgPosPSDEFId) {
        this.setMsgPosPSDEFId(msgPosPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO msgpospsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMsgPosPSDEFId(null);
            this.setMsgPosPSDEFName(null);
        } else {
            this.setMsgPosPSDEFId(pSDEField.getPSDEFieldId());
            this.setMsgPosPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="msgpospsdefname")
    public void setMsgPosPSDEFName(String msgPosPSDEFName) {
        this._set(DTOFIELD_MSGPOSPSDEFNAME, msgPosPSDEFName);
    }

    @JsonIgnore
    public String getMsgPosPSDEFName() {
        Object objValue = this._get(DTOFIELD_MSGPOSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgPosPSDEFNameDirty() {
        return this._contains(DTOFIELD_MSGPOSPSDEFNAME);
    }

    @JsonIgnore
    public void resetMsgPosPSDEFName() {
        this._reset(DTOFIELD_MSGPOSPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO msgpospsdefname(String msgPosPSDEFName) {
        this.setMsgPosPSDEFName(msgPosPSDEFName);
        return this;
    }

    @JsonProperty(value="msgtype")
    public void setMsgType(String msgType) {
        this._set(DTOFIELD_MSGTYPE, msgType);
    }

    @JsonIgnore
    public String getMsgType() {
        Object objValue = this._get(DTOFIELD_MSGTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTypeDirty() {
        return this._contains(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public void resetMsgType() {
        this._reset(DTOFIELD_MSGTYPE);
    }

    @JsonIgnore
    public PSViewMsgDTO msgtype(String msgType) {
        this.setMsgType(msgType);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO msgtype(PSModelEnums.ViewMsgType msgType) {
        if (msgType == null) {
            this.setMsgType(null);
        } else {
            this.setMsgType(msgType.value);
        }
        return this;
    }

    @JsonProperty(value="msgtypepsdefid")
    public void setMsgTypePSDEFId(String msgTypePSDEFId) {
        this._set(DTOFIELD_MSGTYPEPSDEFID, msgTypePSDEFId);
    }

    @JsonIgnore
    public String getMsgTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_MSGTYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_MSGTYPEPSDEFID);
    }

    @JsonIgnore
    public void resetMsgTypePSDEFId() {
        this._reset(DTOFIELD_MSGTYPEPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefid(String msgTypePSDEFId) {
        this.setMsgTypePSDEFId(msgTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMsgTypePSDEFId(null);
            this.setMsgTypePSDEFName(null);
        } else {
            this.setMsgTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setMsgTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="msgtypepsdefname")
    public void setMsgTypePSDEFName(String msgTypePSDEFName) {
        this._set(DTOFIELD_MSGTYPEPSDEFNAME, msgTypePSDEFName);
    }

    @JsonIgnore
    public String getMsgTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_MSGTYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_MSGTYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetMsgTypePSDEFName() {
        this._reset(DTOFIELD_MSGTYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO msgtypepsdefname(String msgTypePSDEFName) {
        this.setMsgTypePSDEFName(msgTypePSDEFName);
        return this;
    }

    @JsonProperty(value="ordervaluepsdefid")
    public void setOrderValuePSDEFId(String orderValuePSDEFId) {
        this._set(DTOFIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }

    @JsonIgnore
    public String getOrderValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_ORDERVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_ORDERVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetOrderValuePSDEFId() {
        this._reset(DTOFIELD_ORDERVALUEPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefid(String orderValuePSDEFId) {
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        } else {
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="ordervaluepsdefname")
    public void setOrderValuePSDEFName(String orderValuePSDEFName) {
        this._set(DTOFIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }

    @JsonIgnore
    public String getOrderValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_ORDERVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_ORDERVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetOrderValuePSDEFName() {
        this._reset(DTOFIELD_ORDERVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO ordervaluepsdefname(String orderValuePSDEFName) {
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSViewMsgDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
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
    public PSViewMsgDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSViewMsgDTO psdedsname(String pSDEDSName) {
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
    public PSViewMsgDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSViewMsgDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSViewMsgDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSViewMsgDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSViewMsgDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSViewMsgDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSViewMsgDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageIdDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetPSSysImageId() {
        this._reset(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        } else {
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="pssysimagename")
    public void setPSSysImageName(String pSSysImageName) {
        this._set(DTOFIELD_PSSYSIMAGENAME, pSSysImageName);
    }

    @JsonIgnore
    public String getPSSysImageName() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageNameDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetPSSysImageName() {
        this._reset(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSViewMsgDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSViewMsgDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="psviewmsgid")
    public void setPSViewMsgId(String pSViewMsgId) {
        this._set(DTOFIELD_PSVIEWMSGID, pSViewMsgId);
    }

    @JsonIgnore
    public String getPSViewMsgId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGID);
    }

    @JsonIgnore
    public void resetPSViewMsgId() {
        this._reset(DTOFIELD_PSVIEWMSGID);
    }

    @JsonIgnore
    public PSViewMsgDTO psviewmsgid(String pSViewMsgId) {
        this.setPSViewMsgId(pSViewMsgId);
        return this;
    }

    @JsonProperty(value="psviewmsgname")
    public void setPSViewMsgName(String pSViewMsgName) {
        this._set(DTOFIELD_PSVIEWMSGNAME, pSViewMsgName);
    }

    @JsonIgnore
    public String getPSViewMsgName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgName() {
        this._reset(DTOFIELD_PSVIEWMSGNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO psviewmsgname(String pSViewMsgName) {
        this.setPSViewMsgName(pSViewMsgName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSViewMsgName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSViewMsgName(strName);
    }

    @JsonIgnore
    public PSViewMsgDTO name(String strName) {
        this.setPSViewMsgName(strName);
        return this;
    }

    @JsonProperty(value="removepsdefid")
    public void setRemovePSDEFId(String removePSDEFId) {
        this._set(DTOFIELD_REMOVEPSDEFID, removePSDEFId);
    }

    @JsonIgnore
    public String getRemovePSDEFId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEFIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEFID);
    }

    @JsonIgnore
    public void resetRemovePSDEFId() {
        this._reset(DTOFIELD_REMOVEPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO removepsdefid(String removePSDEFId) {
        this.setRemovePSDEFId(removePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO removepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setRemovePSDEFId(null);
            this.setRemovePSDEFName(null);
        } else {
            this.setRemovePSDEFId(pSDEField.getPSDEFieldId());
            this.setRemovePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="removepsdefname")
    public void setRemovePSDEFName(String removePSDEFName) {
        this._set(DTOFIELD_REMOVEPSDEFNAME, removePSDEFName);
    }

    @JsonIgnore
    public String getRemovePSDEFName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEFNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEFNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEFName() {
        this._reset(DTOFIELD_REMOVEPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO removepsdefname(String removePSDEFName) {
        this.setRemovePSDEFName(removePSDEFName);
        return this;
    }

    @JsonProperty(value="testcustomcode")
    public void setTestCustomCode(String testCustomCode) {
        this._set(DTOFIELD_TESTCUSTOMCODE, testCustomCode);
    }

    @JsonIgnore
    public String getTestCustomCode() {
        Object objValue = this._get(DTOFIELD_TESTCUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestCustomCodeDirty() {
        return this._contains(DTOFIELD_TESTCUSTOMCODE);
    }

    @JsonIgnore
    public void resetTestCustomCode() {
        this._reset(DTOFIELD_TESTCUSTOMCODE);
    }

    @JsonIgnore
    public PSViewMsgDTO testcustomcode(String testCustomCode) {
        this.setTestCustomCode(testCustomCode);
        return this;
    }

    @JsonProperty(value="testpsdelogicid")
    public void setTestPSDELogicId(String testPSDELogicId) {
        this._set(DTOFIELD_TESTPSDELOGICID, testPSDELogicId);
    }

    @JsonIgnore
    public String getTestPSDELogicId() {
        Object objValue = this._get(DTOFIELD_TESTPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDELogicIdDirty() {
        return this._contains(DTOFIELD_TESTPSDELOGICID);
    }

    @JsonIgnore
    public void resetTestPSDELogicId() {
        this._reset(DTOFIELD_TESTPSDELOGICID);
    }

    @JsonIgnore
    public PSViewMsgDTO testpsdelogicid(String testPSDELogicId) {
        this.setTestPSDELogicId(testPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO testpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setTestPSDELogicId(null);
            this.setTestPSDELogicName(null);
        } else {
            this.setTestPSDELogicId(pSDELogic.getPSDELogicId());
            this.setTestPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="testpsdelogicname")
    public void setTestPSDELogicName(String testPSDELogicName) {
        this._set(DTOFIELD_TESTPSDELOGICNAME, testPSDELogicName);
    }

    @JsonIgnore
    public String getTestPSDELogicName() {
        Object objValue = this._get(DTOFIELD_TESTPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDELogicNameDirty() {
        return this._contains(DTOFIELD_TESTPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetTestPSDELogicName() {
        this._reset(DTOFIELD_TESTPSDELOGICNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO testpsdelogicname(String testPSDELogicName) {
        this.setTestPSDELogicName(testPSDELogicName);
        return this;
    }

    @JsonProperty(value="timeout")
    public void setTimeout(Integer timeout) {
        this._set(DTOFIELD_TIMEOUT, timeout);
    }

    @JsonIgnore
    public Integer getTimeout() {
        Object objValue = this._get(DTOFIELD_TIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimeoutDirty() {
        return this._contains(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public void resetTimeout() {
        this._reset(DTOFIELD_TIMEOUT);
    }

    @JsonIgnore
    public PSViewMsgDTO timeout(Integer timeout) {
        this.setTimeout(timeout);
        return this;
    }

    @JsonProperty(value="title")
    public void setTitle(String title) {
        this._set(DTOFIELD_TITLE, title);
    }

    @JsonIgnore
    public String getTitle() {
        Object objValue = this._get(DTOFIELD_TITLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleDirty() {
        return this._contains(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public void resetTitle() {
        this._reset(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public PSViewMsgDTO title(String title) {
        this.setTitle(title);
        return this;
    }

    @JsonProperty(value="titlelanrestagpsdefid")
    public void setTitleLanResTagPSDEFId(String titleLanResTagPSDEFId) {
        this._set(DTOFIELD_TITLELANRESTAGPSDEFID, titleLanResTagPSDEFId);
    }

    @JsonIgnore
    public String getTitleLanResTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_TITLELANRESTAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleLanResTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_TITLELANRESTAGPSDEFID);
    }

    @JsonIgnore
    public void resetTitleLanResTagPSDEFId() {
        this._reset(DTOFIELD_TITLELANRESTAGPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefid(String titleLanResTagPSDEFId) {
        this.setTitleLanResTagPSDEFId(titleLanResTagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTitleLanResTagPSDEFId(null);
            this.setTitleLanResTagPSDEFName(null);
        } else {
            this.setTitleLanResTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTitleLanResTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="titlelanrestagpsdefname")
    public void setTitleLanResTagPSDEFName(String titleLanResTagPSDEFName) {
        this._set(DTOFIELD_TITLELANRESTAGPSDEFNAME, titleLanResTagPSDEFName);
    }

    @JsonIgnore
    public String getTitleLanResTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_TITLELANRESTAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleLanResTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_TITLELANRESTAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetTitleLanResTagPSDEFName() {
        this._reset(DTOFIELD_TITLELANRESTAGPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO titlelanrestagpsdefname(String titleLanResTagPSDEFName) {
        this.setTitleLanResTagPSDEFName(titleLanResTagPSDEFName);
        return this;
    }

    @JsonProperty(value="titlepsdefid")
    public void setTitlePSDEFId(String titlePSDEFId) {
        this._set(DTOFIELD_TITLEPSDEFID, titlePSDEFId);
    }

    @JsonIgnore
    public String getTitlePSDEFId() {
        Object objValue = this._get(DTOFIELD_TITLEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSDEFIdDirty() {
        return this._contains(DTOFIELD_TITLEPSDEFID);
    }

    @JsonIgnore
    public void resetTitlePSDEFId() {
        this._reset(DTOFIELD_TITLEPSDEFID);
    }

    @JsonIgnore
    public PSViewMsgDTO titlepsdefid(String titlePSDEFId) {
        this.setTitlePSDEFId(titlePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO titlepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTitlePSDEFId(null);
            this.setTitlePSDEFName(null);
        } else {
            this.setTitlePSDEFId(pSDEField.getPSDEFieldId());
            this.setTitlePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="titlepsdefname")
    public void setTitlePSDEFName(String titlePSDEFName) {
        this._set(DTOFIELD_TITLEPSDEFNAME, titlePSDEFName);
    }

    @JsonIgnore
    public String getTitlePSDEFName() {
        Object objValue = this._get(DTOFIELD_TITLEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSDEFNameDirty() {
        return this._contains(DTOFIELD_TITLEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTitlePSDEFName() {
        this._reset(DTOFIELD_TITLEPSDEFNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO titlepsdefname(String titlePSDEFName) {
        this.setTitlePSDEFName(titlePSDEFName);
        return this;
    }

    @JsonProperty(value="titlepslanresid")
    public void setTitlePSLanResId(String titlePSLanResId) {
        this._set(DTOFIELD_TITLEPSLANRESID, titlePSLanResId);
    }

    @JsonIgnore
    public String getTitlePSLanResId() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResIdDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public void resetTitlePSLanResId() {
        this._reset(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public PSViewMsgDTO titlepslanresid(String titlePSLanResId) {
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO titlepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        } else {
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="titlepslanresname")
    public void setTitlePSLanResName(String titlePSLanResName) {
        this._set(DTOFIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }

    @JsonIgnore
    public String getTitlePSLanResName() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResNameDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTitlePSLanResName() {
        this._reset(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public PSViewMsgDTO titlepslanresname(String titlePSLanResName) {
        this.setTitlePSLanResName(titlePSLanResName);
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
    public PSViewMsgDTO updatedate(Timestamp updateDate) {
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
    public PSViewMsgDTO updateman(String updateMan) {
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
    public PSViewMsgDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSViewMsgDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSViewMsgDTO usertag(String userTag) {
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
    public PSViewMsgDTO usertag2(String userTag2) {
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
    public PSViewMsgDTO usertag3(String userTag3) {
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
    public PSViewMsgDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewmsgparams")
    public void setViewMsgParams(String viewMsgParams) {
        this._set(DTOFIELD_VIEWMSGPARAMS, viewMsgParams);
    }

    @JsonIgnore
    public String getViewMsgParams() {
        Object objValue = this._get(DTOFIELD_VIEWMSGPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewMsgParamsDirty() {
        return this._contains(DTOFIELD_VIEWMSGPARAMS);
    }

    @JsonIgnore
    public void resetViewMsgParams() {
        this._reset(DTOFIELD_VIEWMSGPARAMS);
    }

    @JsonIgnore
    public PSViewMsgDTO viewmsgparams(String viewMsgParams) {
        this.setViewMsgParams(viewMsgParams);
        return this;
    }

    @JsonProperty(value="vewmsgtag")
    public void setVewMsgTag(String vewMsgTag) {
        this._set(DTOFIELD_VEWMSGTAG, vewMsgTag);
        this._set(FIELD_VEWMSGTAG, vewMsgTag);
    }

    @JsonIgnore
    public String getVewMsgTag() {
        Object objValue = this._get(DTOFIELD_VEWMSGTAG);
        if (objValue == null && (objValue = this._get(FIELD_VEWMSGTAG)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVewMsgTagDirty() {
        if (this._contains(DTOFIELD_VEWMSGTAG)) {
            return true;
        }
        return this._contains(FIELD_VEWMSGTAG);
    }

    @JsonIgnore
    public void resetVewMsgTag() {
        this._reset(DTOFIELD_VEWMSGTAG);
        this._reset(FIELD_VEWMSGTAG);
    }

    @JsonIgnore
    public PSViewMsgDTO vewmsgtag(String vewMsgTag) {
        this.setVewMsgTag(vewMsgTag);
        return this;
    }

    @JsonProperty(value="vewmsgtag2")
    public void setVewMsgTag2(String vewMsgTag2) {
        this._set(DTOFIELD_VEWMSGTAG2, vewMsgTag2);
        this._set(FIELD_VEWMSGTAG2, vewMsgTag2);
    }

    @JsonIgnore
    public String getVewMsgTag2() {
        Object objValue = this._get(DTOFIELD_VEWMSGTAG2);
        if (objValue == null && (objValue = this._get(FIELD_VEWMSGTAG2)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVewMsgTag2Dirty() {
        if (this._contains(DTOFIELD_VEWMSGTAG2)) {
            return true;
        }
        return this._contains(FIELD_VEWMSGTAG2);
    }

    @JsonIgnore
    public void resetVewMsgTag2() {
        this._reset(DTOFIELD_VEWMSGTAG2);
        this._reset(FIELD_VEWMSGTAG2);
    }

    @JsonIgnore
    public PSViewMsgDTO vewmsgtag2(String vewMsgTag2) {
        this.setVewMsgTag2(vewMsgTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSViewMsgId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSViewMsgId(strValue);
    }

    @JsonIgnore
    public PSViewMsgDTO id(String strValue) {
        this.setPSViewMsgId(strValue);
        return this;
    }
}
