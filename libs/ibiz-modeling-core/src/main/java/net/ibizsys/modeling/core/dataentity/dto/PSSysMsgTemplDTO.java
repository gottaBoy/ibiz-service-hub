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
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysMsgTemplDTO
extends PSModelDTOBase {
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
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DDCONTENT = "DDCONTENT";
    protected static final String DTOFIELD_DDCONTENT = "ddcontent";
    public static final String FIELD_DDPSLANRESID = "DDPSLANRESID";
    protected static final String DTOFIELD_DDPSLANRESID = "ddpslanresid";
    public static final String FIELD_DDPSLANRESNAME = "DDPSLANRESNAME";
    protected static final String DTOFIELD_DDPSLANRESNAME = "ddpslanresname";
    public static final String FIELD_IMCONTENT = "IMCONTENT";
    protected static final String DTOFIELD_IMCONTENT = "imcontent";
    public static final String FIELD_IMPSLANRESID = "IMPSLANRESID";
    protected static final String DTOFIELD_IMPSLANRESID = "impslanresid";
    public static final String FIELD_IMPSLANRESNAME = "IMPSLANRESNAME";
    protected static final String DTOFIELD_IMPSLANRESNAME = "impslanresname";
    public static final String FIELD_MAILGROUPSEND = "MAILGROUPSEND";
    protected static final String DTOFIELD_MAILGROUPSEND = "mailgroupsend";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBTASKURL = "MOBTASKURL";
    protected static final String DTOFIELD_MOBTASKURL = "mobtaskurl";
    public static final String FIELD_MSGTEMPLPARAMS = "MSGTEMPLPARAMS";
    protected static final String DTOFIELD_MSGTEMPLPARAMS = "msgtemplparams";
    public static final String FIELD_MSGTEMPLTAG = "MSGTEMPLTAG";
    protected static final String DTOFIELD_MSGTEMPLTAG = "msgtempltag";
    public static final String FIELD_MSGTEMPLTAG2 = "MSGTEMPLTAG2";
    protected static final String DTOFIELD_MSGTEMPLTAG2 = "msgtempltag2";
    public static final String FIELD_MSGTEMPLTYPE = "MSGTEMPLTYPE";
    protected static final String DTOFIELD_MSGTEMPLTYPE = "msgtempltype";
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
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_SMSCONTENT = "SMSCONTENT";
    protected static final String DTOFIELD_SMSCONTENT = "smscontent";
    public static final String FIELD_SMSPSLANRESID = "SMSPSLANRESID";
    protected static final String DTOFIELD_SMSPSLANRESID = "smspslanresid";
    public static final String FIELD_SMSPSLANRESNAME = "SMSPSLANRESNAME";
    protected static final String DTOFIELD_SMSPSLANRESNAME = "smspslanresname";
    public static final String FIELD_SUBJECT = "SUBJECT";
    protected static final String DTOFIELD_SUBJECT = "subject";
    public static final String FIELD_SUBJECTPSDEFID = "SUBJECTPSDEFID";
    protected static final String DTOFIELD_SUBJECTPSDEFID = "subjectpsdefid";
    public static final String FIELD_SUBJECTPSDEFNAME = "SUBJECTPSDEFNAME";
    protected static final String DTOFIELD_SUBJECTPSDEFNAME = "subjectpsdefname";
    public static final String FIELD_SUBPSLANRESID = "SUBPSLANRESID";
    protected static final String DTOFIELD_SUBPSLANRESID = "subpslanresid";
    public static final String FIELD_SUBPSLANRESNAME = "SUBPSLANRESNAME";
    protected static final String DTOFIELD_SUBPSLANRESNAME = "subpslanresname";
    public static final String FIELD_TASKURL = "TASKURL";
    protected static final String DTOFIELD_TASKURL = "taskurl";
    public static final String FIELD_TEMPLENGINE = "TEMPLENGINE";
    protected static final String DTOFIELD_TEMPLENGINE = "templengine";
    public static final String FIELD_TEMPLTAGPSDEFID = "TEMPLTAGPSDEFID";
    protected static final String DTOFIELD_TEMPLTAGPSDEFID = "templtagpsdefid";
    public static final String FIELD_TEMPLTAGPSDEFNAME = "TEMPLTAGPSDEFNAME";
    protected static final String DTOFIELD_TEMPLTAGPSDEFNAME = "templtagpsdefname";
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
    public static final String FIELD_WCCONTENT = "WCCONTENT";
    protected static final String DTOFIELD_WCCONTENT = "wccontent";
    public static final String FIELD_WXPSLANRESID = "WXPSLANRESID";
    protected static final String DTOFIELD_WXPSLANRESID = "wxpslanresid";
    public static final String FIELD_WXPSLANRESNAME = "WXPSLANRESNAME";
    protected static final String DTOFIELD_WXPSLANRESNAME = "wxpslanresname";

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
    public PSSysMsgTemplDTO codename(String codeName) {
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
    public PSSysMsgTemplDTO content(String content) {
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
    public PSSysMsgTemplDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO contentpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgTemplDTO contentpsdefname(String contentPSDEFName) {
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
    public PSSysMsgTemplDTO contentpslanresid(String contentPSLanResId) {
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO contentpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSSysMsgTemplDTO contentpslanresname(String contentPSLanResName) {
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
    public PSSysMsgTemplDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO contenttype(PSModelEnums.MsgContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
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
    public PSSysMsgTemplDTO createdate(Timestamp createDate) {
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
    public PSSysMsgTemplDTO createman(String createMan) {
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
    public PSSysMsgTemplDTO customcode(String customCode) {
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
    public PSSysMsgTemplDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="ddcontent")
    public void setDDContent(String dDContent) {
        this._set(DTOFIELD_DDCONTENT, dDContent);
    }

    @JsonIgnore
    public String getDDContent() {
        Object objValue = this._get(DTOFIELD_DDCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDDContentDirty() {
        return this._contains(DTOFIELD_DDCONTENT);
    }

    @JsonIgnore
    public void resetDDContent() {
        this._reset(DTOFIELD_DDCONTENT);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO ddcontent(String dDContent) {
        this.setDDContent(dDContent);
        return this;
    }

    @JsonProperty(value="ddpslanresid")
    public void setDDPSLanResId(String dDPSLanResId) {
        this._set(DTOFIELD_DDPSLANRESID, dDPSLanResId);
    }

    @JsonIgnore
    public String getDDPSLanResId() {
        Object objValue = this._get(DTOFIELD_DDPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDDPSLanResIdDirty() {
        return this._contains(DTOFIELD_DDPSLANRESID);
    }

    @JsonIgnore
    public void resetDDPSLanResId() {
        this._reset(DTOFIELD_DDPSLANRESID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO ddpslanresid(String dDPSLanResId) {
        this.setDDPSLanResId(dDPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO ddpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setDDPSLanResId(null);
            this.setDDPSLanResName(null);
        } else {
            this.setDDPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDDPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="ddpslanresname")
    public void setDDPSLanResName(String dDPSLanResName) {
        this._set(DTOFIELD_DDPSLANRESNAME, dDPSLanResName);
    }

    @JsonIgnore
    public String getDDPSLanResName() {
        Object objValue = this._get(DTOFIELD_DDPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDDPSLanResNameDirty() {
        return this._contains(DTOFIELD_DDPSLANRESNAME);
    }

    @JsonIgnore
    public void resetDDPSLanResName() {
        this._reset(DTOFIELD_DDPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO ddpslanresname(String dDPSLanResName) {
        this.setDDPSLanResName(dDPSLanResName);
        return this;
    }

    @JsonProperty(value="imcontent")
    public void setIMContent(String iMContent) {
        this._set(DTOFIELD_IMCONTENT, iMContent);
    }

    @JsonIgnore
    public String getIMContent() {
        Object objValue = this._get(DTOFIELD_IMCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIMContentDirty() {
        return this._contains(DTOFIELD_IMCONTENT);
    }

    @JsonIgnore
    public void resetIMContent() {
        this._reset(DTOFIELD_IMCONTENT);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO imcontent(String iMContent) {
        this.setIMContent(iMContent);
        return this;
    }

    @JsonProperty(value="impslanresid")
    public void setIMPSLanResId(String iMPSLanResId) {
        this._set(DTOFIELD_IMPSLANRESID, iMPSLanResId);
    }

    @JsonIgnore
    public String getIMPSLanResId() {
        Object objValue = this._get(DTOFIELD_IMPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIMPSLanResIdDirty() {
        return this._contains(DTOFIELD_IMPSLANRESID);
    }

    @JsonIgnore
    public void resetIMPSLanResId() {
        this._reset(DTOFIELD_IMPSLANRESID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO impslanresid(String iMPSLanResId) {
        this.setIMPSLanResId(iMPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO impslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setIMPSLanResId(null);
            this.setIMPSLanResName(null);
        } else {
            this.setIMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setIMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="impslanresname")
    public void setIMPSLanResName(String iMPSLanResName) {
        this._set(DTOFIELD_IMPSLANRESNAME, iMPSLanResName);
    }

    @JsonIgnore
    public String getIMPSLanResName() {
        Object objValue = this._get(DTOFIELD_IMPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIMPSLanResNameDirty() {
        return this._contains(DTOFIELD_IMPSLANRESNAME);
    }

    @JsonIgnore
    public void resetIMPSLanResName() {
        this._reset(DTOFIELD_IMPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO impslanresname(String iMPSLanResName) {
        this.setIMPSLanResName(iMPSLanResName);
        return this;
    }

    @JsonProperty(value="mailgroupsend")
    public void setMailGroupSend(Integer mailGroupSend) {
        this._set(DTOFIELD_MAILGROUPSEND, mailGroupSend);
    }

    @JsonIgnore
    public Integer getMailGroupSend() {
        Object objValue = this._get(DTOFIELD_MAILGROUPSEND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMailGroupSendDirty() {
        return this._contains(DTOFIELD_MAILGROUPSEND);
    }

    @JsonIgnore
    public void resetMailGroupSend() {
        this._reset(DTOFIELD_MAILGROUPSEND);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO mailgroupsend(Integer mailGroupSend) {
        this.setMailGroupSend(mailGroupSend);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO mailgroupsend(Boolean mailGroupSend) {
        if (mailGroupSend == null) {
            this.setMailGroupSend(null);
        } else {
            this.setMailGroupSend(mailGroupSend != false ? 1 : 0);
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
    public PSSysMsgTemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobtaskurl")
    public void setMobTaskUrl(String mobTaskUrl) {
        this._set(DTOFIELD_MOBTASKURL, mobTaskUrl);
    }

    @JsonIgnore
    public String getMobTaskUrl() {
        Object objValue = this._get(DTOFIELD_MOBTASKURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobTaskUrlDirty() {
        return this._contains(DTOFIELD_MOBTASKURL);
    }

    @JsonIgnore
    public void resetMobTaskUrl() {
        this._reset(DTOFIELD_MOBTASKURL);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO mobtaskurl(String mobTaskUrl) {
        this.setMobTaskUrl(mobTaskUrl);
        return this;
    }

    @JsonProperty(value="msgtemplparams")
    public void setMsgTemplParams(String msgTemplParams) {
        this._set(DTOFIELD_MSGTEMPLPARAMS, msgTemplParams);
    }

    @JsonIgnore
    public String getMsgTemplParams() {
        Object objValue = this._get(DTOFIELD_MSGTEMPLPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTemplParamsDirty() {
        return this._contains(DTOFIELD_MSGTEMPLPARAMS);
    }

    @JsonIgnore
    public void resetMsgTemplParams() {
        this._reset(DTOFIELD_MSGTEMPLPARAMS);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO msgtemplparams(String msgTemplParams) {
        this.setMsgTemplParams(msgTemplParams);
        return this;
    }

    @JsonProperty(value="msgtempltag")
    public void setMsgTemplTag(String msgTemplTag) {
        this._set(DTOFIELD_MSGTEMPLTAG, msgTemplTag);
    }

    @JsonIgnore
    public String getMsgTemplTag() {
        Object objValue = this._get(DTOFIELD_MSGTEMPLTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTemplTagDirty() {
        return this._contains(DTOFIELD_MSGTEMPLTAG);
    }

    @JsonIgnore
    public void resetMsgTemplTag() {
        this._reset(DTOFIELD_MSGTEMPLTAG);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO msgtempltag(String msgTemplTag) {
        this.setMsgTemplTag(msgTemplTag);
        return this;
    }

    @JsonProperty(value="msgtempltag2")
    public void setMsgTemplTag2(String msgTemplTag2) {
        this._set(DTOFIELD_MSGTEMPLTAG2, msgTemplTag2);
    }

    @JsonIgnore
    public String getMsgTemplTag2() {
        Object objValue = this._get(DTOFIELD_MSGTEMPLTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTemplTag2Dirty() {
        return this._contains(DTOFIELD_MSGTEMPLTAG2);
    }

    @JsonIgnore
    public void resetMsgTemplTag2() {
        this._reset(DTOFIELD_MSGTEMPLTAG2);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO msgtempltag2(String msgTemplTag2) {
        this.setMsgTemplTag2(msgTemplTag2);
        return this;
    }

    @JsonProperty(value="msgtempltype")
    public void setMsgTemplType(String msgTemplType) {
        this._set(DTOFIELD_MSGTEMPLTYPE, msgTemplType);
    }

    @JsonIgnore
    public String getMsgTemplType() {
        Object objValue = this._get(DTOFIELD_MSGTEMPLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgTemplTypeDirty() {
        return this._contains(DTOFIELD_MSGTEMPLTYPE);
    }

    @JsonIgnore
    public void resetMsgTemplType() {
        this._reset(DTOFIELD_MSGTEMPLTYPE);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO msgtempltype(String msgTemplType) {
        this.setMsgTemplType(msgTemplType);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO msgtempltype(PSModelEnums.MsgTemplType msgTemplType) {
        if (msgTemplType == null) {
            this.setMsgTemplType(null);
        } else {
            this.setMsgTemplType(msgTemplType.value);
        }
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
    public PSSysMsgTemplDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysMsgTemplDTO psdedsname(String pSDEDSName) {
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
    public PSSysMsgTemplDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysMsgTemplDTO psdename(String pSDEName) {
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
    public PSSysMsgTemplDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysMsgTemplDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysMsgTemplDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysMsgTemplDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysMsgTemplDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
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
    public PSSysMsgTemplDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysMsgTemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysMsgTemplName(strName);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO name(String strName) {
        this.setPSSysMsgTemplName(strName);
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
    public PSSysMsgTemplDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysMsgTemplDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="smscontent")
    public void setSMSContent(String sMSContent) {
        this._set(DTOFIELD_SMSCONTENT, sMSContent);
    }

    @JsonIgnore
    public String getSMSContent() {
        Object objValue = this._get(DTOFIELD_SMSCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMSContentDirty() {
        return this._contains(DTOFIELD_SMSCONTENT);
    }

    @JsonIgnore
    public void resetSMSContent() {
        this._reset(DTOFIELD_SMSCONTENT);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO smscontent(String sMSContent) {
        this.setSMSContent(sMSContent);
        return this;
    }

    @JsonProperty(value="smspslanresid")
    public void setSMSPSLanResId(String sMSPSLanResId) {
        this._set(DTOFIELD_SMSPSLANRESID, sMSPSLanResId);
    }

    @JsonIgnore
    public String getSMSPSLanResId() {
        Object objValue = this._get(DTOFIELD_SMSPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMSPSLanResIdDirty() {
        return this._contains(DTOFIELD_SMSPSLANRESID);
    }

    @JsonIgnore
    public void resetSMSPSLanResId() {
        this._reset(DTOFIELD_SMSPSLANRESID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO smspslanresid(String sMSPSLanResId) {
        this.setSMSPSLanResId(sMSPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO smspslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setSMSPSLanResId(null);
            this.setSMSPSLanResName(null);
        } else {
            this.setSMSPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSMSPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="smspslanresname")
    public void setSMSPSLanResName(String sMSPSLanResName) {
        this._set(DTOFIELD_SMSPSLANRESNAME, sMSPSLanResName);
    }

    @JsonIgnore
    public String getSMSPSLanResName() {
        Object objValue = this._get(DTOFIELD_SMSPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMSPSLanResNameDirty() {
        return this._contains(DTOFIELD_SMSPSLANRESNAME);
    }

    @JsonIgnore
    public void resetSMSPSLanResName() {
        this._reset(DTOFIELD_SMSPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO smspslanresname(String sMSPSLanResName) {
        this.setSMSPSLanResName(sMSPSLanResName);
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
    public PSSysMsgTemplDTO subject(String subject) {
        this.setSubject(subject);
        return this;
    }

    @JsonProperty(value="subjectpsdefid")
    public void setSubjectPSDEFId(String subjectPSDEFId) {
        this._set(DTOFIELD_SUBJECTPSDEFID, subjectPSDEFId);
    }

    @JsonIgnore
    public String getSubjectPSDEFId() {
        Object objValue = this._get(DTOFIELD_SUBJECTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubjectPSDEFIdDirty() {
        return this._contains(DTOFIELD_SUBJECTPSDEFID);
    }

    @JsonIgnore
    public void resetSubjectPSDEFId() {
        this._reset(DTOFIELD_SUBJECTPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subjectpsdefid(String subjectPSDEFId) {
        this.setSubjectPSDEFId(subjectPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subjectpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSubjectPSDEFId(null);
            this.setSubjectPSDEFName(null);
        } else {
            this.setSubjectPSDEFId(pSDEField.getPSDEFieldId());
            this.setSubjectPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="subjectpsdefname")
    public void setSubjectPSDEFName(String subjectPSDEFName) {
        this._set(DTOFIELD_SUBJECTPSDEFNAME, subjectPSDEFName);
    }

    @JsonIgnore
    public String getSubjectPSDEFName() {
        Object objValue = this._get(DTOFIELD_SUBJECTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubjectPSDEFNameDirty() {
        return this._contains(DTOFIELD_SUBJECTPSDEFNAME);
    }

    @JsonIgnore
    public void resetSubjectPSDEFName() {
        this._reset(DTOFIELD_SUBJECTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subjectpsdefname(String subjectPSDEFName) {
        this.setSubjectPSDEFName(subjectPSDEFName);
        return this;
    }

    @JsonProperty(value="subpslanresid")
    public void setSubPSLanResId(String subPSLanResId) {
        this._set(DTOFIELD_SUBPSLANRESID, subPSLanResId);
    }

    @JsonIgnore
    public String getSubPSLanResId() {
        Object objValue = this._get(DTOFIELD_SUBPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubPSLanResIdDirty() {
        return this._contains(DTOFIELD_SUBPSLANRESID);
    }

    @JsonIgnore
    public void resetSubPSLanResId() {
        this._reset(DTOFIELD_SUBPSLANRESID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subpslanresid(String subPSLanResId) {
        this.setSubPSLanResId(subPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setSubPSLanResId(null);
            this.setSubPSLanResName(null);
        } else {
            this.setSubPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="subpslanresname")
    public void setSubPSLanResName(String subPSLanResName) {
        this._set(DTOFIELD_SUBPSLANRESNAME, subPSLanResName);
    }

    @JsonIgnore
    public String getSubPSLanResName() {
        Object objValue = this._get(DTOFIELD_SUBPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSubPSLanResNameDirty() {
        return this._contains(DTOFIELD_SUBPSLANRESNAME);
    }

    @JsonIgnore
    public void resetSubPSLanResName() {
        this._reset(DTOFIELD_SUBPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO subpslanresname(String subPSLanResName) {
        this.setSubPSLanResName(subPSLanResName);
        return this;
    }

    @JsonProperty(value="taskurl")
    public void setTaskUrl(String taskUrl) {
        this._set(DTOFIELD_TASKURL, taskUrl);
    }

    @JsonIgnore
    public String getTaskUrl() {
        Object objValue = this._get(DTOFIELD_TASKURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskUrlDirty() {
        return this._contains(DTOFIELD_TASKURL);
    }

    @JsonIgnore
    public void resetTaskUrl() {
        this._reset(DTOFIELD_TASKURL);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO taskurl(String taskUrl) {
        this.setTaskUrl(taskUrl);
        return this;
    }

    @JsonProperty(value="templengine")
    public void setTemplEngine(String templEngine) {
        this._set(DTOFIELD_TEMPLENGINE, templEngine);
    }

    @JsonIgnore
    public String getTemplEngine() {
        Object objValue = this._get(DTOFIELD_TEMPLENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplEngineDirty() {
        return this._contains(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public void resetTemplEngine() {
        this._reset(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO templengine(String templEngine) {
        this.setTemplEngine(templEngine);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO templengine(PSModelEnums.MsgTemplEngine templEngine) {
        if (templEngine == null) {
            this.setTemplEngine(null);
        } else {
            this.setTemplEngine(templEngine.value);
        }
        return this;
    }

    @JsonProperty(value="templtagpsdefid")
    public void setTemplTagPSDEFId(String templTagPSDEFId) {
        this._set(DTOFIELD_TEMPLTAGPSDEFID, templTagPSDEFId);
    }

    @JsonIgnore
    public String getTemplTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEMPLTAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEMPLTAGPSDEFID);
    }

    @JsonIgnore
    public void resetTemplTagPSDEFId() {
        this._reset(DTOFIELD_TEMPLTAGPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO templtagpsdefid(String templTagPSDEFId) {
        this.setTemplTagPSDEFId(templTagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO templtagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTemplTagPSDEFId(null);
            this.setTemplTagPSDEFName(null);
        } else {
            this.setTemplTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTemplTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="templtagpsdefname")
    public void setTemplTagPSDEFName(String templTagPSDEFName) {
        this._set(DTOFIELD_TEMPLTAGPSDEFNAME, templTagPSDEFName);
    }

    @JsonIgnore
    public String getTemplTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEMPLTAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEMPLTAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetTemplTagPSDEFName() {
        this._reset(DTOFIELD_TEMPLTAGPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO templtagpsdefname(String templTagPSDEFName) {
        this.setTemplTagPSDEFName(templTagPSDEFName);
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
    public PSSysMsgTemplDTO updatedate(Timestamp updateDate) {
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
    public PSSysMsgTemplDTO updateman(String updateMan) {
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
    public PSSysMsgTemplDTO user2psdefid(String user2PSDEFId) {
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO user2psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgTemplDTO user2psdefname(String user2PSDEFName) {
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
    public PSSysMsgTemplDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysMsgTemplDTO userpsdefid(String userPSDEFId) {
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO userpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgTemplDTO userpsdefname(String userPSDEFName) {
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
    public PSSysMsgTemplDTO usertag(String userTag) {
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
    public PSSysMsgTemplDTO usertag2(String userTag2) {
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
    public PSSysMsgTemplDTO usertag3(String userTag3) {
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
    public PSSysMsgTemplDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="wccontent")
    public void setWCContent(String wCContent) {
        this._set(DTOFIELD_WCCONTENT, wCContent);
    }

    @JsonIgnore
    public String getWCContent() {
        Object objValue = this._get(DTOFIELD_WCCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWCContentDirty() {
        return this._contains(DTOFIELD_WCCONTENT);
    }

    @JsonIgnore
    public void resetWCContent() {
        this._reset(DTOFIELD_WCCONTENT);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO wccontent(String wCContent) {
        this.setWCContent(wCContent);
        return this;
    }

    @JsonProperty(value="wxpslanresid")
    public void setWXPSLanResId(String wXPSLanResId) {
        this._set(DTOFIELD_WXPSLANRESID, wXPSLanResId);
    }

    @JsonIgnore
    public String getWXPSLanResId() {
        Object objValue = this._get(DTOFIELD_WXPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWXPSLanResIdDirty() {
        return this._contains(DTOFIELD_WXPSLANRESID);
    }

    @JsonIgnore
    public void resetWXPSLanResId() {
        this._reset(DTOFIELD_WXPSLANRESID);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO wxpslanresid(String wXPSLanResId) {
        this.setWXPSLanResId(wXPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgTemplDTO wxpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setWXPSLanResId(null);
            this.setWXPSLanResName(null);
        } else {
            this.setWXPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setWXPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="wxpslanresname")
    public void setWXPSLanResName(String wXPSLanResName) {
        this._set(DTOFIELD_WXPSLANRESNAME, wXPSLanResName);
    }

    @JsonIgnore
    public String getWXPSLanResName() {
        Object objValue = this._get(DTOFIELD_WXPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWXPSLanResNameDirty() {
        return this._contains(DTOFIELD_WXPSLANRESNAME);
    }

    @JsonIgnore
    public void resetWXPSLanResName() {
        this._reset(DTOFIELD_WXPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO wxpslanresname(String wXPSLanResName) {
        this.setWXPSLanResName(wXPSLanResName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysMsgTemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysMsgTemplId(strValue);
    }

    @JsonIgnore
    public PSSysMsgTemplDTO id(String strValue) {
        this.setPSSysMsgTemplId(strValue);
        return this;
    }
}
