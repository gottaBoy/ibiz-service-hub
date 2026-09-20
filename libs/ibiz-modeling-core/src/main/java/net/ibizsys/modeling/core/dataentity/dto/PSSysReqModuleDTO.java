package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysActorDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysReqModuleDTO
extends PSModelDTOBase {
    public static final String FIELD_AIBUILDMODE = "AIBUILDMODE";
    protected static final String DTOFIELD_AIBUILDMODE = "aibuildmode";
    public static final String FIELD_AIBUILDSTATE = "AIBUILDSTATE";
    protected static final String DTOFIELD_AIBUILDSTATE = "aibuildstate";
    public static final String FIELD_AICHOICES = "AICHOICES";
    protected static final String DTOFIELD_AICHOICES = "aichoices";
    public static final String FIELD_AIPROMPT = "AIPROMPT";
    protected static final String DTOFIELD_AIPROMPT = "aiprompt";
    public static final String FIELD_AIPROMPTCHOICES = "AIPROMPTCHOICES";
    protected static final String DTOFIELD_AIPROMPTCHOICES = "aipromptchoices";
    public static final String FIELD_AIPROMPTCHOICES2 = "AIPROMPTCHOICES2";
    protected static final String DTOFIELD_AIPROMPTCHOICES2 = "aipromptchoices2";
    public static final String FIELD_AIPROMPTCHOICES3 = "AIPROMPTCHOICES3";
    protected static final String DTOFIELD_AIPROMPTCHOICES3 = "aipromptchoices3";
    public static final String FIELD_AIPROMPTCHOICES4 = "AIPROMPTCHOICES4";
    protected static final String DTOFIELD_AIPROMPTCHOICES4 = "aipromptchoices4";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODULESN = "MODULESN";
    protected static final String DTOFIELD_MODULESN = "modulesn";
    public static final String FIELD_MODULETAG = "MODULETAG";
    protected static final String DTOFIELD_MODULETAG = "moduletag";
    public static final String FIELD_MODULETAG2 = "MODULETAG2";
    protected static final String DTOFIELD_MODULETAG2 = "moduletag2";
    public static final String FIELD_MODULETAG3 = "MODULETAG3";
    protected static final String DTOFIELD_MODULETAG3 = "moduletag3";
    public static final String FIELD_MODULETAG4 = "MODULETAG4";
    protected static final String DTOFIELD_MODULETAG4 = "moduletag4";
    public static final String FIELD_MODULETYPE = "MODULETYPE";
    protected static final String DTOFIELD_MODULETYPE = "moduletype";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSSYSREQMODULEID = "PPSSYSREQMODULEID";
    protected static final String DTOFIELD_PPSSYSREQMODULEID = "ppssysreqmoduleid";
    public static final String FIELD_PPSSYSREQMODULENAME = "PPSSYSREQMODULENAME";
    protected static final String DTOFIELD_PPSSYSREQMODULENAME = "ppssysreqmodulename";
    public static final String FIELD_PSDEVPRDID = "PSDEVPRDID";
    protected static final String DTOFIELD_PSDEVPRDID = "psdevprdid";
    public static final String FIELD_PSDEVPRDNAME = "PSDEVPRDNAME";
    protected static final String DTOFIELD_PSDEVPRDNAME = "psdevprdname";
    public static final String FIELD_PSDEVPRDVERID = "PSDEVPRDVERID";
    protected static final String DTOFIELD_PSDEVPRDVERID = "psdevprdverid";
    public static final String FIELD_PSDEVPRDVERNAME = "PSDEVPRDVERNAME";
    protected static final String DTOFIELD_PSDEVPRDVERNAME = "psdevprdvername";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSACTORID = "PSSYSACTORID";
    protected static final String DTOFIELD_PSSYSACTORID = "pssysactorid";
    public static final String FIELD_PSSYSACTORNAME = "PSSYSACTORNAME";
    protected static final String DTOFIELD_PSSYSACTORNAME = "pssysactorname";
    public static final String FIELD_PSSYSREQMODULEID = "PSSYSREQMODULEID";
    protected static final String DTOFIELD_PSSYSREQMODULEID = "pssysreqmoduleid";
    public static final String FIELD_PSSYSREQMODULENAME = "PSSYSREQMODULENAME";
    protected static final String DTOFIELD_PSSYSREQMODULENAME = "pssysreqmodulename";
    public static final String FIELD_PSSYSUSECASEID = "PSSYSUSECASEID";
    protected static final String DTOFIELD_PSSYSUSECASEID = "pssysusecaseid";
    public static final String FIELD_PSSYSUSECASENAME = "PSSYSUSECASENAME";
    protected static final String DTOFIELD_PSSYSUSECASENAME = "pssysusecasename";
    public static final String FIELD_REQMODEL = "REQMODEL";
    protected static final String DTOFIELD_REQMODEL = "reqmodel";
    public static final String FIELD_REQMODELTYPE = "REQMODELTYPE";
    protected static final String DTOFIELD_REQMODELTYPE = "reqmodeltype";
    public static final String FIELD_SUBJECT = "SUBJECT";
    protected static final String DTOFIELD_SUBJECT = "subject";
    public static final String FIELD_TAGS = "TAGS";
    protected static final String DTOFIELD_TAGS = "tags";
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

    @JsonProperty(value="aibuildmode")
    public void setAIBuildMode(Integer aIBuildMode) {
        this._set(DTOFIELD_AIBUILDMODE, aIBuildMode);
    }

    @JsonIgnore
    public Integer getAIBuildMode() {
        Object objValue = this._get(DTOFIELD_AIBUILDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAIBuildModeDirty() {
        return this._contains(DTOFIELD_AIBUILDMODE);
    }

    @JsonIgnore
    public void resetAIBuildMode() {
        this._reset(DTOFIELD_AIBUILDMODE);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aibuildmode(Integer aIBuildMode) {
        this.setAIBuildMode(aIBuildMode);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO aibuildmode(PSModelEnums.AIBuildMode aIBuildMode) {
        if (aIBuildMode == null) {
            this.setAIBuildMode(null);
        } else {
            this.setAIBuildMode(aIBuildMode.value);
        }
        return this;
    }

    @JsonProperty(value="aibuildstate")
    public void setAIBuildState(Integer aIBuildState) {
        this._set(DTOFIELD_AIBUILDSTATE, aIBuildState);
    }

    @JsonIgnore
    public Integer getAIBuildState() {
        Object objValue = this._get(DTOFIELD_AIBUILDSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAIBuildStateDirty() {
        return this._contains(DTOFIELD_AIBUILDSTATE);
    }

    @JsonIgnore
    public void resetAIBuildState() {
        this._reset(DTOFIELD_AIBUILDSTATE);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aibuildstate(Integer aIBuildState) {
        this.setAIBuildState(aIBuildState);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO aibuildstate(PSModelEnums.AIBuildState aIBuildState) {
        if (aIBuildState == null) {
            this.setAIBuildState(null);
        } else {
            this.setAIBuildState(aIBuildState.value);
        }
        return this;
    }

    @JsonProperty(value="aichoices")
    public void setAIChoices(String aIChoices) {
        this._set(DTOFIELD_AICHOICES, aIChoices);
    }

    @JsonIgnore
    public String getAIChoices() {
        Object objValue = this._get(DTOFIELD_AICHOICES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIChoicesDirty() {
        return this._contains(DTOFIELD_AICHOICES);
    }

    @JsonIgnore
    public void resetAIChoices() {
        this._reset(DTOFIELD_AICHOICES);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aichoices(String aIChoices) {
        this.setAIChoices(aIChoices);
        return this;
    }

    @JsonProperty(value="aiprompt")
    public void setAIPrompt(String aIPrompt) {
        this._set(DTOFIELD_AIPROMPT, aIPrompt);
    }

    @JsonIgnore
    public String getAIPrompt() {
        Object objValue = this._get(DTOFIELD_AIPROMPT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPromptDirty() {
        return this._contains(DTOFIELD_AIPROMPT);
    }

    @JsonIgnore
    public void resetAIPrompt() {
        this._reset(DTOFIELD_AIPROMPT);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aiprompt(String aIPrompt) {
        this.setAIPrompt(aIPrompt);
        return this;
    }

    @JsonProperty(value="aipromptchoices")
    public void setAIPromptChoices(String aIPromptChoices) {
        this._set(DTOFIELD_AIPROMPTCHOICES, aIPromptChoices);
    }

    @JsonIgnore
    public String getAIPromptChoices() {
        Object objValue = this._get(DTOFIELD_AIPROMPTCHOICES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPromptChoicesDirty() {
        return this._contains(DTOFIELD_AIPROMPTCHOICES);
    }

    @JsonIgnore
    public void resetAIPromptChoices() {
        this._reset(DTOFIELD_AIPROMPTCHOICES);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aipromptchoices(String aIPromptChoices) {
        this.setAIPromptChoices(aIPromptChoices);
        return this;
    }

    @JsonProperty(value="aipromptchoices2")
    public void setAIPromptChoices2(String aIPromptChoices2) {
        this._set(DTOFIELD_AIPROMPTCHOICES2, aIPromptChoices2);
    }

    @JsonIgnore
    public String getAIPromptChoices2() {
        Object objValue = this._get(DTOFIELD_AIPROMPTCHOICES2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPromptChoices2Dirty() {
        return this._contains(DTOFIELD_AIPROMPTCHOICES2);
    }

    @JsonIgnore
    public void resetAIPromptChoices2() {
        this._reset(DTOFIELD_AIPROMPTCHOICES2);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aipromptchoices2(String aIPromptChoices2) {
        this.setAIPromptChoices2(aIPromptChoices2);
        return this;
    }

    @JsonProperty(value="aipromptchoices3")
    public void setAIPromptChoices3(String aIPromptChoices3) {
        this._set(DTOFIELD_AIPROMPTCHOICES3, aIPromptChoices3);
    }

    @JsonIgnore
    public String getAIPromptChoices3() {
        Object objValue = this._get(DTOFIELD_AIPROMPTCHOICES3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPromptChoices3Dirty() {
        return this._contains(DTOFIELD_AIPROMPTCHOICES3);
    }

    @JsonIgnore
    public void resetAIPromptChoices3() {
        this._reset(DTOFIELD_AIPROMPTCHOICES3);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aipromptchoices3(String aIPromptChoices3) {
        this.setAIPromptChoices3(aIPromptChoices3);
        return this;
    }

    @JsonProperty(value="aipromptchoices4")
    public void setAIPromptChoices4(String aIPromptChoices4) {
        this._set(DTOFIELD_AIPROMPTCHOICES4, aIPromptChoices4);
    }

    @JsonIgnore
    public String getAIPromptChoices4() {
        Object objValue = this._get(DTOFIELD_AIPROMPTCHOICES4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIPromptChoices4Dirty() {
        return this._contains(DTOFIELD_AIPROMPTCHOICES4);
    }

    @JsonIgnore
    public void resetAIPromptChoices4() {
        this._reset(DTOFIELD_AIPROMPTCHOICES4);
    }

    @JsonIgnore
    public PSSysReqModuleDTO aipromptchoices4(String aIPromptChoices4) {
        this.setAIPromptChoices4(aIPromptChoices4);
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
    public PSSysReqModuleDTO codename(String codeName) {
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
    public PSSysReqModuleDTO content(String content) {
        this.setContent(content);
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
    public PSSysReqModuleDTO contenttype(String contentType) {
        this.setContentType(contentType);
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
    public PSSysReqModuleDTO createdate(Timestamp createDate) {
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
    public PSSysReqModuleDTO createman(String createMan) {
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
    public PSSysReqModuleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modulesn")
    public void setModuleSN(String moduleSN) {
        this._set(DTOFIELD_MODULESN, moduleSN);
    }

    @JsonIgnore
    public String getModuleSN() {
        Object objValue = this._get(DTOFIELD_MODULESN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleSNDirty() {
        return this._contains(DTOFIELD_MODULESN);
    }

    @JsonIgnore
    public void resetModuleSN() {
        this._reset(DTOFIELD_MODULESN);
    }

    @JsonIgnore
    public PSSysReqModuleDTO modulesn(String moduleSN) {
        this.setModuleSN(moduleSN);
        return this;
    }

    @JsonProperty(value="moduletag")
    public void setModuleTag(String moduleTag) {
        this._set(DTOFIELD_MODULETAG, moduleTag);
    }

    @JsonIgnore
    public String getModuleTag() {
        Object objValue = this._get(DTOFIELD_MODULETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTagDirty() {
        return this._contains(DTOFIELD_MODULETAG);
    }

    @JsonIgnore
    public void resetModuleTag() {
        this._reset(DTOFIELD_MODULETAG);
    }

    @JsonIgnore
    public PSSysReqModuleDTO moduletag(String moduleTag) {
        this.setModuleTag(moduleTag);
        return this;
    }

    @JsonProperty(value="moduletag2")
    public void setModuleTag2(String moduleTag2) {
        this._set(DTOFIELD_MODULETAG2, moduleTag2);
    }

    @JsonIgnore
    public String getModuleTag2() {
        Object objValue = this._get(DTOFIELD_MODULETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTag2Dirty() {
        return this._contains(DTOFIELD_MODULETAG2);
    }

    @JsonIgnore
    public void resetModuleTag2() {
        this._reset(DTOFIELD_MODULETAG2);
    }

    @JsonIgnore
    public PSSysReqModuleDTO moduletag2(String moduleTag2) {
        this.setModuleTag2(moduleTag2);
        return this;
    }

    @JsonProperty(value="moduletag3")
    public void setModuleTag3(String moduleTag3) {
        this._set(DTOFIELD_MODULETAG3, moduleTag3);
    }

    @JsonIgnore
    public String getModuleTag3() {
        Object objValue = this._get(DTOFIELD_MODULETAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTag3Dirty() {
        return this._contains(DTOFIELD_MODULETAG3);
    }

    @JsonIgnore
    public void resetModuleTag3() {
        this._reset(DTOFIELD_MODULETAG3);
    }

    @JsonIgnore
    public PSSysReqModuleDTO moduletag3(String moduleTag3) {
        this.setModuleTag3(moduleTag3);
        return this;
    }

    @JsonProperty(value="moduletag4")
    public void setModuleTag4(String moduleTag4) {
        this._set(DTOFIELD_MODULETAG4, moduleTag4);
    }

    @JsonIgnore
    public String getModuleTag4() {
        Object objValue = this._get(DTOFIELD_MODULETAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTag4Dirty() {
        return this._contains(DTOFIELD_MODULETAG4);
    }

    @JsonIgnore
    public void resetModuleTag4() {
        this._reset(DTOFIELD_MODULETAG4);
    }

    @JsonIgnore
    public PSSysReqModuleDTO moduletag4(String moduleTag4) {
        this.setModuleTag4(moduleTag4);
        return this;
    }

    @JsonProperty(value="moduletype")
    public void setModuleType(String moduleType) {
        this._set(DTOFIELD_MODULETYPE, moduleType);
    }

    @JsonIgnore
    public String getModuleType() {
        Object objValue = this._get(DTOFIELD_MODULETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModuleTypeDirty() {
        return this._contains(DTOFIELD_MODULETYPE);
    }

    @JsonIgnore
    public void resetModuleType() {
        this._reset(DTOFIELD_MODULETYPE);
    }

    @JsonIgnore
    public PSSysReqModuleDTO moduletype(String moduleType) {
        this.setModuleType(moduleType);
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
    public PSSysReqModuleDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppssysreqmoduleid")
    public void setPPSSysReqModuleId(String pPSSysReqModuleId) {
        this._set(DTOFIELD_PPSSYSREQMODULEID, pPSSysReqModuleId);
    }

    @JsonIgnore
    public String getPPSSysReqModuleId() {
        Object objValue = this._get(DTOFIELD_PPSSYSREQMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysReqModuleIdDirty() {
        return this._contains(DTOFIELD_PPSSYSREQMODULEID);
    }

    @JsonIgnore
    public void resetPPSSysReqModuleId() {
        this._reset(DTOFIELD_PPSSYSREQMODULEID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO ppssysreqmoduleid(String pPSSysReqModuleId) {
        this.setPPSSysReqModuleId(pPSSysReqModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO ppssysreqmoduleid(PSSysReqModuleDTO pSSysReqModule) {
        if (pSSysReqModule == null) {
            this.setPPSSysReqModuleId(null);
            this.setPPSSysReqModuleName(null);
        } else {
            this.setPPSSysReqModuleId(pSSysReqModule.getPSSysReqModuleId());
            this.setPPSSysReqModuleName(pSSysReqModule.getPSSysReqModuleName());
        }
        return this;
    }

    @JsonProperty(value="ppssysreqmodulename")
    public void setPPSSysReqModuleName(String pPSSysReqModuleName) {
        this._set(DTOFIELD_PPSSYSREQMODULENAME, pPSSysReqModuleName);
    }

    @JsonIgnore
    public String getPPSSysReqModuleName() {
        Object objValue = this._get(DTOFIELD_PPSSYSREQMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysReqModuleNameDirty() {
        return this._contains(DTOFIELD_PPSSYSREQMODULENAME);
    }

    @JsonIgnore
    public void resetPPSSysReqModuleName() {
        this._reset(DTOFIELD_PPSSYSREQMODULENAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO ppssysreqmodulename(String pPSSysReqModuleName) {
        this.setPPSSysReqModuleName(pPSSysReqModuleName);
        return this;
    }

    @JsonProperty(value="psdevprdid")
    public void setPSDevPrdId(String pSDevPrdId) {
        this._set(DTOFIELD_PSDEVPRDID, pSDevPrdId);
    }

    @JsonIgnore
    public String getPSDevPrdId() {
        Object objValue = this._get(DTOFIELD_PSDEVPRDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevPrdIdDirty() {
        return this._contains(DTOFIELD_PSDEVPRDID);
    }

    @JsonIgnore
    public void resetPSDevPrdId() {
        this._reset(DTOFIELD_PSDEVPRDID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO psdevprdid(String pSDevPrdId) {
        this.setPSDevPrdId(pSDevPrdId);
        return this;
    }

    @JsonProperty(value="psdevprdname")
    public void setPSDevPrdName(String pSDevPrdName) {
        this._set(DTOFIELD_PSDEVPRDNAME, pSDevPrdName);
    }

    @JsonIgnore
    public String getPSDevPrdName() {
        Object objValue = this._get(DTOFIELD_PSDEVPRDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevPrdNameDirty() {
        return this._contains(DTOFIELD_PSDEVPRDNAME);
    }

    @JsonIgnore
    public void resetPSDevPrdName() {
        this._reset(DTOFIELD_PSDEVPRDNAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO psdevprdname(String pSDevPrdName) {
        this.setPSDevPrdName(pSDevPrdName);
        return this;
    }

    @JsonProperty(value="psdevprdverid")
    public void setPSDevPrdVerId(String pSDevPrdVerId) {
        this._set(DTOFIELD_PSDEVPRDVERID, pSDevPrdVerId);
    }

    @JsonIgnore
    public String getPSDevPrdVerId() {
        Object objValue = this._get(DTOFIELD_PSDEVPRDVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevPrdVerIdDirty() {
        return this._contains(DTOFIELD_PSDEVPRDVERID);
    }

    @JsonIgnore
    public void resetPSDevPrdVerId() {
        this._reset(DTOFIELD_PSDEVPRDVERID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO psdevprdverid(String pSDevPrdVerId) {
        this.setPSDevPrdVerId(pSDevPrdVerId);
        return this;
    }

    @JsonProperty(value="psdevprdvername")
    public void setPSDevPrdVerName(String pSDevPrdVerName) {
        this._set(DTOFIELD_PSDEVPRDVERNAME, pSDevPrdVerName);
    }

    @JsonIgnore
    public String getPSDevPrdVerName() {
        Object objValue = this._get(DTOFIELD_PSDEVPRDVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevPrdVerNameDirty() {
        return this._contains(DTOFIELD_PSDEVPRDVERNAME);
    }

    @JsonIgnore
    public void resetPSDevPrdVerName() {
        this._reset(DTOFIELD_PSDEVPRDVERNAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO psdevprdvername(String pSDevPrdVerName) {
        this.setPSDevPrdVerName(pSDevPrdVerName);
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
    public PSSysReqModuleDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysReqModuleDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysactorid")
    public void setPSSysActorId(String pSSysActorId) {
        this._set(DTOFIELD_PSSYSACTORID, pSSysActorId);
    }

    @JsonIgnore
    public String getPSSysActorId() {
        Object objValue = this._get(DTOFIELD_PSSYSACTORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysActorIdDirty() {
        return this._contains(DTOFIELD_PSSYSACTORID);
    }

    @JsonIgnore
    public void resetPSSysActorId() {
        this._reset(DTOFIELD_PSSYSACTORID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysactorid(String pSSysActorId) {
        this.setPSSysActorId(pSSysActorId);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysactorid(PSSysActorDTO pSSysActor) {
        if (pSSysActor == null) {
            this.setPSSysActorId(null);
            this.setPSSysActorName(null);
        } else {
            this.setPSSysActorId(pSSysActor.getPSSysActorId());
            this.setPSSysActorName(pSSysActor.getPSSysActorName());
        }
        return this;
    }

    @JsonProperty(value="pssysactorname")
    public void setPSSysActorName(String pSSysActorName) {
        this._set(DTOFIELD_PSSYSACTORNAME, pSSysActorName);
    }

    @JsonIgnore
    public String getPSSysActorName() {
        Object objValue = this._get(DTOFIELD_PSSYSACTORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysActorNameDirty() {
        return this._contains(DTOFIELD_PSSYSACTORNAME);
    }

    @JsonIgnore
    public void resetPSSysActorName() {
        this._reset(DTOFIELD_PSSYSACTORNAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysactorname(String pSSysActorName) {
        this.setPSSysActorName(pSSysActorName);
        return this;
    }

    @JsonProperty(value="pssysreqmoduleid")
    public void setPSSysReqModuleId(String pSSysReqModuleId) {
        this._set(DTOFIELD_PSSYSREQMODULEID, pSSysReqModuleId);
    }

    @JsonIgnore
    public String getPSSysReqModuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqModuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQMODULEID);
    }

    @JsonIgnore
    public void resetPSSysReqModuleId() {
        this._reset(DTOFIELD_PSSYSREQMODULEID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysreqmoduleid(String pSSysReqModuleId) {
        this.setPSSysReqModuleId(pSSysReqModuleId);
        return this;
    }

    @JsonProperty(value="pssysreqmodulename")
    public void setPSSysReqModuleName(String pSSysReqModuleName) {
        this._set(DTOFIELD_PSSYSREQMODULENAME, pSSysReqModuleName);
    }

    @JsonIgnore
    public String getPSSysReqModuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqModuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQMODULENAME);
    }

    @JsonIgnore
    public void resetPSSysReqModuleName() {
        this._reset(DTOFIELD_PSSYSREQMODULENAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysreqmodulename(String pSSysReqModuleName) {
        this.setPSSysReqModuleName(pSSysReqModuleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysReqModuleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysReqModuleName(strName);
    }

    @JsonIgnore
    public PSSysReqModuleDTO name(String strName) {
        this.setPSSysReqModuleName(strName);
        return this;
    }

    @JsonProperty(value="pssysusecaseid")
    public void setPSSysUseCaseId(String pSSysUseCaseId) {
        this._set(DTOFIELD_PSSYSUSECASEID, pSSysUseCaseId);
    }

    @JsonIgnore
    public String getPSSysUseCaseId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public void resetPSSysUseCaseId() {
        this._reset(DTOFIELD_PSSYSUSECASEID);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysusecaseid(String pSSysUseCaseId) {
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    @JsonProperty(value="pssysusecasename")
    public void setPSSysUseCaseName(String pSSysUseCaseName) {
        this._set(DTOFIELD_PSSYSUSECASENAME, pSSysUseCaseName);
    }

    @JsonIgnore
    public String getPSSysUseCaseName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSECASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public void resetPSSysUseCaseName() {
        this._reset(DTOFIELD_PSSYSUSECASENAME);
    }

    @JsonIgnore
    public PSSysReqModuleDTO pssysusecasename(String pSSysUseCaseName) {
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonProperty(value="reqmodel")
    public void setReqModel(String reqModel) {
        this._set(DTOFIELD_REQMODEL, reqModel);
    }

    @JsonIgnore
    public String getReqModel() {
        Object objValue = this._get(DTOFIELD_REQMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReqModelDirty() {
        return this._contains(DTOFIELD_REQMODEL);
    }

    @JsonIgnore
    public void resetReqModel() {
        this._reset(DTOFIELD_REQMODEL);
    }

    @JsonIgnore
    public PSSysReqModuleDTO reqmodel(String reqModel) {
        this.setReqModel(reqModel);
        return this;
    }

    @JsonProperty(value="reqmodeltype")
    public void setReqModelType(String reqModelType) {
        this._set(DTOFIELD_REQMODELTYPE, reqModelType);
    }

    @JsonIgnore
    public String getReqModelType() {
        Object objValue = this._get(DTOFIELD_REQMODELTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReqModelTypeDirty() {
        return this._contains(DTOFIELD_REQMODELTYPE);
    }

    @JsonIgnore
    public void resetReqModelType() {
        this._reset(DTOFIELD_REQMODELTYPE);
    }

    @JsonIgnore
    public PSSysReqModuleDTO reqmodeltype(String reqModelType) {
        this.setReqModelType(reqModelType);
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
    public PSSysReqModuleDTO subject(String subject) {
        this.setSubject(subject);
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
    public PSSysReqModuleDTO tags(String tags) {
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
    public PSSysReqModuleDTO updatedate(Timestamp updateDate) {
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
    public PSSysReqModuleDTO updateman(String updateMan) {
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
    public PSSysReqModuleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysReqModuleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysReqModuleDTO usertag(String userTag) {
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
    public PSSysReqModuleDTO usertag2(String userTag2) {
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
    public PSSysReqModuleDTO usertag3(String userTag3) {
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
    public PSSysReqModuleDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysReqModuleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysReqModuleId(strValue);
    }

    @JsonIgnore
    public PSSysReqModuleDTO id(String strValue) {
        this.setPSSysReqModuleId(strValue);
        return this;
    }
}
