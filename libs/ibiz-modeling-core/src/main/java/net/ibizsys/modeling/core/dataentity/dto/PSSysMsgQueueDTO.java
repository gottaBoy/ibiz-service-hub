package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysMsgQueueDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENTPSDEFID = "CONTENTPSDEFID";
    protected static final String DTOFIELD_CONTENTPSDEFID = "contentpsdefid";
    public static final String FIELD_CONTENTPSDEFNAME = "CONTENTPSDEFNAME";
    protected static final String DTOFIELD_CONTENTPSDEFNAME = "contentpsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DDCONTENTPSDEFID = "DDCONTENTPSDEFID";
    protected static final String DTOFIELD_DDCONTENTPSDEFID = "ddcontentpsdefid";
    public static final String FIELD_DDCONTENTPSDEFNAME = "DDCONTENTPSDEFNAME";
    protected static final String DTOFIELD_DDCONTENTPSDEFNAME = "ddcontentpsdefname";
    public static final String FIELD_FILEPSDEFID = "FILEPSDEFID";
    protected static final String DTOFIELD_FILEPSDEFID = "filepsdefid";
    public static final String FIELD_FILEPSDEFNAME = "FILEPSDEFNAME";
    protected static final String DTOFIELD_FILEPSDEFNAME = "filepsdefname";
    public static final String FIELD_IMCONTENTPSDEFID = "IMCONTENTPSDEFID";
    protected static final String DTOFIELD_IMCONTENTPSDEFID = "imcontentpsdefid";
    public static final String FIELD_IMCONTENTPSDEFNAME = "IMCONTENTPSDEFNAME";
    protected static final String DTOFIELD_IMCONTENTPSDEFNAME = "imcontentpsdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBTASKURLPSDEFID = "MOBTASKURLPSDEFID";
    protected static final String DTOFIELD_MOBTASKURLPSDEFID = "mobtaskurlpsdefid";
    public static final String FIELD_MOBTASKURLPSDEFNAME = "MOBTASKURLPSDEFNAME";
    protected static final String DTOFIELD_MOBTASKURLPSDEFNAME = "mobtaskurlpsdefname";
    public static final String FIELD_MSGQUEUEPARAMS = "MSGQUEUEPARAMS";
    protected static final String DTOFIELD_MSGQUEUEPARAMS = "msgqueueparams";
    public static final String FIELD_MSGQUEUETAG = "MSGQUEUETAG";
    protected static final String DTOFIELD_MSGQUEUETAG = "msgqueuetag";
    public static final String FIELD_MSGQUEUETAG2 = "MSGQUEUETAG2";
    protected static final String DTOFIELD_MSGQUEUETAG2 = "msgqueuetag2";
    public static final String FIELD_MSGQUEUETYPE = "MSGQUEUETYPE";
    protected static final String DTOFIELD_MSGQUEUETYPE = "msgqueuetype";
    public static final String FIELD_MSGTYPEPSDEFID = "MSGTYPEPSDEFID";
    protected static final String DTOFIELD_MSGTYPEPSDEFID = "msgtypepsdefid";
    public static final String FIELD_MSGTYPEPSDEFNAME = "MSGTYPEPSDEFNAME";
    protected static final String DTOFIELD_MSGTYPEPSDEFNAME = "msgtypepsdefname";
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
    public static final String FIELD_PSSYSMSGQUEUEID = "PSSYSMSGQUEUEID";
    protected static final String DTOFIELD_PSSYSMSGQUEUEID = "pssysmsgqueueid";
    public static final String FIELD_PSSYSMSGQUEUENAME = "PSSYSMSGQUEUENAME";
    protected static final String DTOFIELD_PSSYSMSGQUEUENAME = "pssysmsgqueuename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUTILDEID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILDEID = "pssysutildeid";
    public static final String FIELD_PSSYSUTILDENAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILDENAME = "pssysutildename";
    public static final String FIELD_QUEUEPARAMS = "QUEUEPARAMS";
    protected static final String DTOFIELD_QUEUEPARAMS = "queueparams";
    public static final String FIELD_SENDTIMEPSDEFID = "SENDTIMEPSDEFID";
    protected static final String DTOFIELD_SENDTIMEPSDEFID = "sendtimepsdefid";
    public static final String FIELD_SENDTIMEPSDEFNAME = "SENDTIMEPSDEFNAME";
    protected static final String DTOFIELD_SENDTIMEPSDEFNAME = "sendtimepsdefname";
    public static final String FIELD_SMSCONTENTPSDEFID = "SMSCONTENTPSDEFID";
    protected static final String DTOFIELD_SMSCONTENTPSDEFID = "smscontentpsdefid";
    public static final String FIELD_SMSCONTENTPSDEFNAME = "SMSCONTENTPSDEFNAME";
    protected static final String DTOFIELD_SMSCONTENTPSDEFNAME = "smscontentpsdefname";
    public static final String FIELD_STATEPSDEFID = "STATEPSDEFID";
    protected static final String DTOFIELD_STATEPSDEFID = "statepsdefid";
    public static final String FIELD_STATEPSDEFNAME = "STATEPSDEFNAME";
    protected static final String DTOFIELD_STATEPSDEFNAME = "statepsdefname";
    public static final String FIELD_TAG2PSDEFID = "TAG2PSDEFID";
    protected static final String DTOFIELD_TAG2PSDEFID = "tag2psdefid";
    public static final String FIELD_TAG2PSDEFNAME = "TAG2PSDEFNAME";
    protected static final String DTOFIELD_TAG2PSDEFNAME = "tag2psdefname";
    public static final String FIELD_TAGPSDEFID = "TAGPSDEFID";
    protected static final String DTOFIELD_TAGPSDEFID = "tagpsdefid";
    public static final String FIELD_TAGPSDEFNAME = "TAGPSDEFNAME";
    protected static final String DTOFIELD_TAGPSDEFNAME = "tagpsdefname";
    public static final String FIELD_TARGETPSDEFID = "TARGETPSDEFID";
    protected static final String DTOFIELD_TARGETPSDEFID = "targetpsdefid";
    public static final String FIELD_TARGETPSDEFNAME = "TARGETPSDEFNAME";
    protected static final String DTOFIELD_TARGETPSDEFNAME = "targetpsdefname";
    public static final String FIELD_TARGETTYPEPSDEFID = "TARGETTYPEPSDEFID";
    protected static final String DTOFIELD_TARGETTYPEPSDEFID = "targettypepsdefid";
    public static final String FIELD_TARGETTYPEPSDEFNAME = "TARGETTYPEPSDEFNAME";
    protected static final String DTOFIELD_TARGETTYPEPSDEFNAME = "targettypepsdefname";
    public static final String FIELD_TASKURLPSDEFID = "TASKURLPSDEFID";
    protected static final String DTOFIELD_TASKURLPSDEFID = "taskurlpsdefid";
    public static final String FIELD_TASKURLPSDEFNAME = "TASKURLPSDEFNAME";
    protected static final String DTOFIELD_TASKURLPSDEFNAME = "taskurlpsdefname";
    public static final String FIELD_TITLEPSDEFID = "TITLEPSDEFID";
    protected static final String DTOFIELD_TITLEPSDEFID = "titlepsdefid";
    public static final String FIELD_TITLEPSDEFNAME = "TITLEPSDEFNAME";
    protected static final String DTOFIELD_TITLEPSDEFNAME = "titlepsdefname";
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
    public static final String FIELD_WXCONTENTPSDEFID = "WXCONTENTPSDEFID";
    protected static final String DTOFIELD_WXCONTENTPSDEFID = "wxcontentpsdefid";
    public static final String FIELD_WXCONTENTPSDEFNAME = "WXCONTENTPSDEFNAME";
    protected static final String DTOFIELD_WXCONTENTPSDEFNAME = "wxcontentpsdefname";

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
    public PSSysMsgQueueDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSSysMsgQueueDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO contentpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO contentpsdefname(String contentPSDEFName) {
        this.setContentPSDEFName(contentPSDEFName);
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
    public PSSysMsgQueueDTO createdate(Timestamp createDate) {
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
    public PSSysMsgQueueDTO createman(String createMan) {
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
    public PSSysMsgQueueDTO customcode(String customCode) {
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
    public PSSysMsgQueueDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="ddcontentpsdefid")
    public void setDDContentPSDEFId(String dDContentPSDEFId) {
        this._set(DTOFIELD_DDCONTENTPSDEFID, dDContentPSDEFId);
    }

    @JsonIgnore
    public String getDDContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_DDCONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDDContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_DDCONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetDDContentPSDEFId() {
        this._reset(DTOFIELD_DDCONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO ddcontentpsdefid(String dDContentPSDEFId) {
        this.setDDContentPSDEFId(dDContentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO ddcontentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDDContentPSDEFId(null);
            this.setDDContentPSDEFName(null);
        } else {
            this.setDDContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setDDContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="ddcontentpsdefname")
    public void setDDContentPSDEFName(String dDContentPSDEFName) {
        this._set(DTOFIELD_DDCONTENTPSDEFNAME, dDContentPSDEFName);
    }

    @JsonIgnore
    public String getDDContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_DDCONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDDContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_DDCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetDDContentPSDEFName() {
        this._reset(DTOFIELD_DDCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO ddcontentpsdefname(String dDContentPSDEFName) {
        this.setDDContentPSDEFName(dDContentPSDEFName);
        return this;
    }

    @JsonProperty(value="filepsdefid")
    public void setFilePSDEFId(String filePSDEFId) {
        this._set(DTOFIELD_FILEPSDEFID, filePSDEFId);
    }

    @JsonIgnore
    public String getFilePSDEFId() {
        Object objValue = this._get(DTOFIELD_FILEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilePSDEFIdDirty() {
        return this._contains(DTOFIELD_FILEPSDEFID);
    }

    @JsonIgnore
    public void resetFilePSDEFId() {
        this._reset(DTOFIELD_FILEPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO filepsdefid(String filePSDEFId) {
        this.setFilePSDEFId(filePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO filepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setFilePSDEFId(null);
            this.setFilePSDEFName(null);
        } else {
            this.setFilePSDEFId(pSDEField.getPSDEFieldId());
            this.setFilePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="filepsdefname")
    public void setFilePSDEFName(String filePSDEFName) {
        this._set(DTOFIELD_FILEPSDEFNAME, filePSDEFName);
    }

    @JsonIgnore
    public String getFilePSDEFName() {
        Object objValue = this._get(DTOFIELD_FILEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilePSDEFNameDirty() {
        return this._contains(DTOFIELD_FILEPSDEFNAME);
    }

    @JsonIgnore
    public void resetFilePSDEFName() {
        this._reset(DTOFIELD_FILEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO filepsdefname(String filePSDEFName) {
        this.setFilePSDEFName(filePSDEFName);
        return this;
    }

    @JsonProperty(value="imcontentpsdefid")
    public void setIMContentPSDEFId(String iMContentPSDEFId) {
        this._set(DTOFIELD_IMCONTENTPSDEFID, iMContentPSDEFId);
    }

    @JsonIgnore
    public String getIMContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_IMCONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIMContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_IMCONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetIMContentPSDEFId() {
        this._reset(DTOFIELD_IMCONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO imcontentpsdefid(String iMContentPSDEFId) {
        this.setIMContentPSDEFId(iMContentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO imcontentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIMContentPSDEFId(null);
            this.setIMContentPSDEFName(null);
        } else {
            this.setIMContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setIMContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="imcontentpsdefname")
    public void setIMContentPSDEFName(String iMContentPSDEFName) {
        this._set(DTOFIELD_IMCONTENTPSDEFNAME, iMContentPSDEFName);
    }

    @JsonIgnore
    public String getIMContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_IMCONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIMContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_IMCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetIMContentPSDEFName() {
        this._reset(DTOFIELD_IMCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO imcontentpsdefname(String iMContentPSDEFName) {
        this.setIMContentPSDEFName(iMContentPSDEFName);
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
    public PSSysMsgQueueDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobtaskurlpsdefid")
    public void setMobTaskUrlPSDEFId(String mobTaskUrlPSDEFId) {
        this._set(DTOFIELD_MOBTASKURLPSDEFID, mobTaskUrlPSDEFId);
    }

    @JsonIgnore
    public String getMobTaskUrlPSDEFId() {
        Object objValue = this._get(DTOFIELD_MOBTASKURLPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobTaskUrlPSDEFIdDirty() {
        return this._contains(DTOFIELD_MOBTASKURLPSDEFID);
    }

    @JsonIgnore
    public void resetMobTaskUrlPSDEFId() {
        this._reset(DTOFIELD_MOBTASKURLPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO mobtaskurlpsdefid(String mobTaskUrlPSDEFId) {
        this.setMobTaskUrlPSDEFId(mobTaskUrlPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO mobtaskurlpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMobTaskUrlPSDEFId(null);
            this.setMobTaskUrlPSDEFName(null);
        } else {
            this.setMobTaskUrlPSDEFId(pSDEField.getPSDEFieldId());
            this.setMobTaskUrlPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="mobtaskurlpsdefname")
    public void setMobTaskUrlPSDEFName(String mobTaskUrlPSDEFName) {
        this._set(DTOFIELD_MOBTASKURLPSDEFNAME, mobTaskUrlPSDEFName);
    }

    @JsonIgnore
    public String getMobTaskUrlPSDEFName() {
        Object objValue = this._get(DTOFIELD_MOBTASKURLPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobTaskUrlPSDEFNameDirty() {
        return this._contains(DTOFIELD_MOBTASKURLPSDEFNAME);
    }

    @JsonIgnore
    public void resetMobTaskUrlPSDEFName() {
        this._reset(DTOFIELD_MOBTASKURLPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO mobtaskurlpsdefname(String mobTaskUrlPSDEFName) {
        this.setMobTaskUrlPSDEFName(mobTaskUrlPSDEFName);
        return this;
    }

    @JsonProperty(value="msgqueueparams")
    public void setMsgQueueParams(String msgQueueParams) {
        this._set(DTOFIELD_MSGQUEUEPARAMS, msgQueueParams);
    }

    @JsonIgnore
    public String getMsgQueueParams() {
        Object objValue = this._get(DTOFIELD_MSGQUEUEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgQueueParamsDirty() {
        return this._contains(DTOFIELD_MSGQUEUEPARAMS);
    }

    @JsonIgnore
    public void resetMsgQueueParams() {
        this._reset(DTOFIELD_MSGQUEUEPARAMS);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgqueueparams(String msgQueueParams) {
        this.setMsgQueueParams(msgQueueParams);
        return this;
    }

    @JsonProperty(value="msgqueuetag")
    public void setMsgQueueTag(String msgQueueTag) {
        this._set(DTOFIELD_MSGQUEUETAG, msgQueueTag);
    }

    @JsonIgnore
    public String getMsgQueueTag() {
        Object objValue = this._get(DTOFIELD_MSGQUEUETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgQueueTagDirty() {
        return this._contains(DTOFIELD_MSGQUEUETAG);
    }

    @JsonIgnore
    public void resetMsgQueueTag() {
        this._reset(DTOFIELD_MSGQUEUETAG);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgqueuetag(String msgQueueTag) {
        this.setMsgQueueTag(msgQueueTag);
        return this;
    }

    @JsonProperty(value="msgqueuetag2")
    public void setMsgQueueTag2(String msgQueueTag2) {
        this._set(DTOFIELD_MSGQUEUETAG2, msgQueueTag2);
    }

    @JsonIgnore
    public String getMsgQueueTag2() {
        Object objValue = this._get(DTOFIELD_MSGQUEUETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgQueueTag2Dirty() {
        return this._contains(DTOFIELD_MSGQUEUETAG2);
    }

    @JsonIgnore
    public void resetMsgQueueTag2() {
        this._reset(DTOFIELD_MSGQUEUETAG2);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgqueuetag2(String msgQueueTag2) {
        this.setMsgQueueTag2(msgQueueTag2);
        return this;
    }

    @JsonProperty(value="msgqueuetype")
    public void setMsgQueueType(String msgQueueType) {
        this._set(DTOFIELD_MSGQUEUETYPE, msgQueueType);
    }

    @JsonIgnore
    public String getMsgQueueType() {
        Object objValue = this._get(DTOFIELD_MSGQUEUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgQueueTypeDirty() {
        return this._contains(DTOFIELD_MSGQUEUETYPE);
    }

    @JsonIgnore
    public void resetMsgQueueType() {
        this._reset(DTOFIELD_MSGQUEUETYPE);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgqueuetype(String msgQueueType) {
        this.setMsgQueueType(msgQueueType);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgqueuetype(PSModelEnums.MsgQueueType msgQueueType) {
        if (msgQueueType == null) {
            this.setMsgQueueType(null);
        } else {
            this.setMsgQueueType(msgQueueType.value);
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
    public PSSysMsgQueueDTO msgtypepsdefid(String msgTypePSDEFId) {
        this.setMsgTypePSDEFId(msgTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO msgtypepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO msgtypepsdefname(String msgTypePSDEFName) {
        this.setMsgTypePSDEFName(msgTypePSDEFName);
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
    public PSSysMsgQueueDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysMsgQueueDTO psdename(String pSDEName) {
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
    public PSSysMsgQueueDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysMsgQueueDTO psmodulename(String pSModuleName) {
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
    public PSSysMsgQueueDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysMsgQueueDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysmsgqueueid")
    public void setPSSysMsgQueueId(String pSSysMsgQueueId) {
        this._set(DTOFIELD_PSSYSMSGQUEUEID, pSSysMsgQueueId);
    }

    @JsonIgnore
    public String getPSSysMsgQueueId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGQUEUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgQueueIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGQUEUEID);
    }

    @JsonIgnore
    public void resetPSSysMsgQueueId() {
        this._reset(DTOFIELD_PSSYSMSGQUEUEID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysmsgqueueid(String pSSysMsgQueueId) {
        this.setPSSysMsgQueueId(pSSysMsgQueueId);
        return this;
    }

    @JsonProperty(value="pssysmsgqueuename")
    public void setPSSysMsgQueueName(String pSSysMsgQueueName) {
        this._set(DTOFIELD_PSSYSMSGQUEUENAME, pSSysMsgQueueName);
    }

    @JsonIgnore
    public String getPSSysMsgQueueName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGQUEUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgQueueNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGQUEUENAME);
    }

    @JsonIgnore
    public void resetPSSysMsgQueueName() {
        this._reset(DTOFIELD_PSSYSMSGQUEUENAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysmsgqueuename(String pSSysMsgQueueName) {
        this.setPSSysMsgQueueName(pSSysMsgQueueName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysMsgQueueName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysMsgQueueName(strName);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO name(String strName) {
        this.setPSSysMsgQueueName(strName);
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
    public PSSysMsgQueueDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysMsgQueueDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysutildeid")
    public void setPSSysUtilDEId(String pSSysUtilDEId) {
        this._set(DTOFIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }

    @JsonIgnore
    public String getPSSysUtilDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public void resetPSSysUtilDEId() {
        this._reset(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysutildeid(String pSSysUtilDEId) {
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysutildeid(PSSysUtilDTO pSSysUtil) {
        if (pSSysUtil == null) {
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        } else {
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonProperty(value="pssysutildename")
    public void setPSSysUtilDEName(String pSSysUtilDEName) {
        this._set(DTOFIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }

    @JsonIgnore
    public String getPSSysUtilDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDENameDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public void resetPSSysUtilDEName() {
        this._reset(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO pssysutildename(String pSSysUtilDEName) {
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="queueparams")
    public void setQueueParams(String queueParams) {
        this._set(DTOFIELD_QUEUEPARAMS, queueParams);
    }

    @JsonIgnore
    public String getQueueParams() {
        Object objValue = this._get(DTOFIELD_QUEUEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueueParamsDirty() {
        return this._contains(DTOFIELD_QUEUEPARAMS);
    }

    @JsonIgnore
    public void resetQueueParams() {
        this._reset(DTOFIELD_QUEUEPARAMS);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO queueparams(String queueParams) {
        this.setQueueParams(queueParams);
        return this;
    }

    @JsonProperty(value="sendtimepsdefid")
    public void setSendTimePSDEFId(String sendTimePSDEFId) {
        this._set(DTOFIELD_SENDTIMEPSDEFID, sendTimePSDEFId);
    }

    @JsonIgnore
    public String getSendTimePSDEFId() {
        Object objValue = this._get(DTOFIELD_SENDTIMEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSendTimePSDEFIdDirty() {
        return this._contains(DTOFIELD_SENDTIMEPSDEFID);
    }

    @JsonIgnore
    public void resetSendTimePSDEFId() {
        this._reset(DTOFIELD_SENDTIMEPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO sendtimepsdefid(String sendTimePSDEFId) {
        this.setSendTimePSDEFId(sendTimePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO sendtimepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSendTimePSDEFId(null);
            this.setSendTimePSDEFName(null);
        } else {
            this.setSendTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setSendTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="sendtimepsdefname")
    public void setSendTimePSDEFName(String sendTimePSDEFName) {
        this._set(DTOFIELD_SENDTIMEPSDEFNAME, sendTimePSDEFName);
    }

    @JsonIgnore
    public String getSendTimePSDEFName() {
        Object objValue = this._get(DTOFIELD_SENDTIMEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSendTimePSDEFNameDirty() {
        return this._contains(DTOFIELD_SENDTIMEPSDEFNAME);
    }

    @JsonIgnore
    public void resetSendTimePSDEFName() {
        this._reset(DTOFIELD_SENDTIMEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO sendtimepsdefname(String sendTimePSDEFName) {
        this.setSendTimePSDEFName(sendTimePSDEFName);
        return this;
    }

    @JsonProperty(value="smscontentpsdefid")
    public void setSMSContentPSDEFId(String sMSContentPSDEFId) {
        this._set(DTOFIELD_SMSCONTENTPSDEFID, sMSContentPSDEFId);
    }

    @JsonIgnore
    public String getSMSContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_SMSCONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMSContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_SMSCONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetSMSContentPSDEFId() {
        this._reset(DTOFIELD_SMSCONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO smscontentpsdefid(String sMSContentPSDEFId) {
        this.setSMSContentPSDEFId(sMSContentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO smscontentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSMSContentPSDEFId(null);
            this.setSMSContentPSDEFName(null);
        } else {
            this.setSMSContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setSMSContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="smscontentpsdefname")
    public void setSMSContentPSDEFName(String sMSContentPSDEFName) {
        this._set(DTOFIELD_SMSCONTENTPSDEFNAME, sMSContentPSDEFName);
    }

    @JsonIgnore
    public String getSMSContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_SMSCONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSMSContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_SMSCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetSMSContentPSDEFName() {
        this._reset(DTOFIELD_SMSCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO smscontentpsdefname(String sMSContentPSDEFName) {
        this.setSMSContentPSDEFName(sMSContentPSDEFName);
        return this;
    }

    @JsonProperty(value="statepsdefid")
    public void setStatePSDEFId(String statePSDEFId) {
        this._set(DTOFIELD_STATEPSDEFID, statePSDEFId);
    }

    @JsonIgnore
    public String getStatePSDEFId() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFIdDirty() {
        return this._contains(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public void resetStatePSDEFId() {
        this._reset(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO statepsdefid(String statePSDEFId) {
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO statepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        } else {
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="statepsdefname")
    public void setStatePSDEFName(String statePSDEFName) {
        this._set(DTOFIELD_STATEPSDEFNAME, statePSDEFName);
    }

    @JsonIgnore
    public String getStatePSDEFName() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFNameDirty() {
        return this._contains(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public void resetStatePSDEFName() {
        this._reset(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO statepsdefname(String statePSDEFName) {
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    @JsonProperty(value="tag2psdefid")
    public void setTag2PSDEFId(String tag2PSDEFId) {
        this._set(DTOFIELD_TAG2PSDEFID, tag2PSDEFId);
    }

    @JsonIgnore
    public String getTag2PSDEFId() {
        Object objValue = this._get(DTOFIELD_TAG2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTag2PSDEFIdDirty() {
        return this._contains(DTOFIELD_TAG2PSDEFID);
    }

    @JsonIgnore
    public void resetTag2PSDEFId() {
        this._reset(DTOFIELD_TAG2PSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO tag2psdefid(String tag2PSDEFId) {
        this.setTag2PSDEFId(tag2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO tag2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTag2PSDEFId(null);
            this.setTag2PSDEFName(null);
        } else {
            this.setTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tag2psdefname")
    public void setTag2PSDEFName(String tag2PSDEFName) {
        this._set(DTOFIELD_TAG2PSDEFNAME, tag2PSDEFName);
    }

    @JsonIgnore
    public String getTag2PSDEFName() {
        Object objValue = this._get(DTOFIELD_TAG2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTag2PSDEFNameDirty() {
        return this._contains(DTOFIELD_TAG2PSDEFNAME);
    }

    @JsonIgnore
    public void resetTag2PSDEFName() {
        this._reset(DTOFIELD_TAG2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO tag2psdefname(String tag2PSDEFName) {
        this.setTag2PSDEFName(tag2PSDEFName);
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
    public PSSysMsgQueueDTO tagpsdefid(String tagPSDEFId) {
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO tagpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO tagpsdefname(String tagPSDEFName) {
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    @JsonProperty(value="targetpsdefid")
    public void setTargetPSDEFId(String targetPSDEFId) {
        this._set(DTOFIELD_TARGETPSDEFID, targetPSDEFId);
    }

    @JsonIgnore
    public String getTargetPSDEFId() {
        Object objValue = this._get(DTOFIELD_TARGETPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetPSDEFIdDirty() {
        return this._contains(DTOFIELD_TARGETPSDEFID);
    }

    @JsonIgnore
    public void resetTargetPSDEFId() {
        this._reset(DTOFIELD_TARGETPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targetpsdefid(String targetPSDEFId) {
        this.setTargetPSDEFId(targetPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targetpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTargetPSDEFId(null);
            this.setTargetPSDEFName(null);
        } else {
            this.setTargetPSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="targetpsdefname")
    public void setTargetPSDEFName(String targetPSDEFName) {
        this._set(DTOFIELD_TARGETPSDEFNAME, targetPSDEFName);
    }

    @JsonIgnore
    public String getTargetPSDEFName() {
        Object objValue = this._get(DTOFIELD_TARGETPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetPSDEFNameDirty() {
        return this._contains(DTOFIELD_TARGETPSDEFNAME);
    }

    @JsonIgnore
    public void resetTargetPSDEFName() {
        this._reset(DTOFIELD_TARGETPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targetpsdefname(String targetPSDEFName) {
        this.setTargetPSDEFName(targetPSDEFName);
        return this;
    }

    @JsonProperty(value="targettypepsdefid")
    public void setTargetTypePSDEFId(String targetTypePSDEFId) {
        this._set(DTOFIELD_TARGETTYPEPSDEFID, targetTypePSDEFId);
    }

    @JsonIgnore
    public String getTargetTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_TARGETTYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_TARGETTYPEPSDEFID);
    }

    @JsonIgnore
    public void resetTargetTypePSDEFId() {
        this._reset(DTOFIELD_TARGETTYPEPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targettypepsdefid(String targetTypePSDEFId) {
        this.setTargetTypePSDEFId(targetTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targettypepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTargetTypePSDEFId(null);
            this.setTargetTypePSDEFName(null);
        } else {
            this.setTargetTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="targettypepsdefname")
    public void setTargetTypePSDEFName(String targetTypePSDEFName) {
        this._set(DTOFIELD_TARGETTYPEPSDEFNAME, targetTypePSDEFName);
    }

    @JsonIgnore
    public String getTargetTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_TARGETTYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_TARGETTYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTargetTypePSDEFName() {
        this._reset(DTOFIELD_TARGETTYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO targettypepsdefname(String targetTypePSDEFName) {
        this.setTargetTypePSDEFName(targetTypePSDEFName);
        return this;
    }

    @JsonProperty(value="taskurlpsdefid")
    public void setTaskUrlPSDEFId(String taskUrlPSDEFId) {
        this._set(DTOFIELD_TASKURLPSDEFID, taskUrlPSDEFId);
    }

    @JsonIgnore
    public String getTaskUrlPSDEFId() {
        Object objValue = this._get(DTOFIELD_TASKURLPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskUrlPSDEFIdDirty() {
        return this._contains(DTOFIELD_TASKURLPSDEFID);
    }

    @JsonIgnore
    public void resetTaskUrlPSDEFId() {
        this._reset(DTOFIELD_TASKURLPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO taskurlpsdefid(String taskUrlPSDEFId) {
        this.setTaskUrlPSDEFId(taskUrlPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO taskurlpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTaskUrlPSDEFId(null);
            this.setTaskUrlPSDEFName(null);
        } else {
            this.setTaskUrlPSDEFId(pSDEField.getPSDEFieldId());
            this.setTaskUrlPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="taskurlpsdefname")
    public void setTaskUrlPSDEFName(String taskUrlPSDEFName) {
        this._set(DTOFIELD_TASKURLPSDEFNAME, taskUrlPSDEFName);
    }

    @JsonIgnore
    public String getTaskUrlPSDEFName() {
        Object objValue = this._get(DTOFIELD_TASKURLPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTaskUrlPSDEFNameDirty() {
        return this._contains(DTOFIELD_TASKURLPSDEFNAME);
    }

    @JsonIgnore
    public void resetTaskUrlPSDEFName() {
        this._reset(DTOFIELD_TASKURLPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO taskurlpsdefname(String taskUrlPSDEFName) {
        this.setTaskUrlPSDEFName(taskUrlPSDEFName);
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
    public PSSysMsgQueueDTO titlepsdefid(String titlePSDEFId) {
        this.setTitlePSDEFId(titlePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO titlepsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO titlepsdefname(String titlePSDEFName) {
        this.setTitlePSDEFName(titlePSDEFName);
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
    public PSSysMsgQueueDTO updatedate(Timestamp updateDate) {
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
    public PSSysMsgQueueDTO updateman(String updateMan) {
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
    public PSSysMsgQueueDTO user2psdefid(String user2PSDEFId) {
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO user2psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO user2psdefname(String user2PSDEFName) {
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
    public PSSysMsgQueueDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysMsgQueueDTO userpsdefid(String userPSDEFId) {
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO userpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysMsgQueueDTO userpsdefname(String userPSDEFName) {
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
    public PSSysMsgQueueDTO usertag(String userTag) {
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
    public PSSysMsgQueueDTO usertag2(String userTag2) {
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
    public PSSysMsgQueueDTO usertag3(String userTag3) {
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
    public PSSysMsgQueueDTO usertag4(String userTag4) {
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
    public PSSysMsgQueueDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wxcontentpsdefid")
    public void setWXContentPSDEFId(String wXContentPSDEFId) {
        this._set(DTOFIELD_WXCONTENTPSDEFID, wXContentPSDEFId);
    }

    @JsonIgnore
    public String getWXContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_WXCONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWXContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_WXCONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetWXContentPSDEFId() {
        this._reset(DTOFIELD_WXCONTENTPSDEFID);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO wxcontentpsdefid(String wXContentPSDEFId) {
        this.setWXContentPSDEFId(wXContentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysMsgQueueDTO wxcontentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setWXContentPSDEFId(null);
            this.setWXContentPSDEFName(null);
        } else {
            this.setWXContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setWXContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="wxcontentpsdefname")
    public void setWXContentPSDEFName(String wXContentPSDEFName) {
        this._set(DTOFIELD_WXCONTENTPSDEFNAME, wXContentPSDEFName);
    }

    @JsonIgnore
    public String getWXContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_WXCONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWXContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_WXCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetWXContentPSDEFName() {
        this._reset(DTOFIELD_WXCONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO wxcontentpsdefname(String wXContentPSDEFName) {
        this.setWXContentPSDEFName(wXContentPSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysMsgQueueId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysMsgQueueId(strValue);
    }

    @JsonIgnore
    public PSSysMsgQueueDTO id(String strValue) {
        this.setPSSysMsgQueueId(strValue);
        return this;
    }
}
