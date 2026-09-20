package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;

public class PSLanguageResDTO
extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;

    public PSLanguageResDTO() {
        super("pslanguageresid", "pslanguageresname");
    }

    public static final String FIELD_APPREFFLAG = "APPREFFLAG";
    protected static final String DTOFIELD_APPREFFLAG = "apprefflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENT2 = "CONTENT2";
    protected static final String DTOFIELD_CONTENT2 = "content2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_LANRESTAG = "LANRESTAG";
    protected static final String DTOFIELD_LANRESTAG = "lanrestag";
    public static final String FIELD_LANRESTYPE = "LANRESTYPE";
    protected static final String DTOFIELD_LANRESTYPE = "lanrestype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSLANGUAGERESID = "PSLANGUAGERESID";
    protected static final String DTOFIELD_PSLANGUAGERESID = "pslanguageresid";
    public static final String FIELD_PSLANGUAGERESNAME = "PSLANGUAGERESNAME";
    protected static final String DTOFIELD_PSLANGUAGERESNAME = "pslanguageresname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSLANRESID = "PSSYSLANRESID";
    protected static final String DTOFIELD_PSSYSLANRESID = "pssyslanresid";
    public static final String FIELD_PSSYSLANRESNAME = "PSSYSLANRESNAME";
    protected static final String DTOFIELD_PSSYSLANRESNAME = "pssyslanresname";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFNAME = "PSWFNAME";
    protected static final String DTOFIELD_PSWFNAME = "pswfname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_SHORTTAG = "SHORTTAG";
    protected static final String DTOFIELD_SHORTTAG = "shorttag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";

    @JsonProperty(value="apprefflag")
    public void setAppRefFlag(Integer appRefFlag) {
        this._set(DTOFIELD_APPREFFLAG, appRefFlag);
    }

    @JsonIgnore
    public Integer getAppRefFlag() {
        Object objValue = this._get(DTOFIELD_APPREFFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAppRefFlagDirty() {
        return this._contains(DTOFIELD_APPREFFLAG);
    }

    @JsonIgnore
    public void resetAppRefFlag() {
        this._reset(DTOFIELD_APPREFFLAG);
    }

    @JsonIgnore
    public PSLanguageResDTO apprefflag(Integer appRefFlag) {
        this.setAppRefFlag(appRefFlag);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO apprefflag(Boolean appRefFlag) {
        if (appRefFlag == null) {
            this.setAppRefFlag(null);
        } else {
            this.setAppRefFlag(appRefFlag != false ? 1 : 0);
        }
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
    public PSLanguageResDTO codename(String codeName) {
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
    public PSLanguageResDTO content(String content) {
        this.setContent(content);
        return this;
    }

    @JsonProperty(value="content2")
    public void setContent2(String content2) {
        this._set(DTOFIELD_CONTENT2, content2);
    }

    @JsonIgnore
    public String getContent2() {
        Object objValue = this._get(DTOFIELD_CONTENT2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContent2Dirty() {
        return this._contains(DTOFIELD_CONTENT2);
    }

    @JsonIgnore
    public void resetContent2() {
        this._reset(DTOFIELD_CONTENT2);
    }

    @JsonIgnore
    public PSLanguageResDTO content2(String content2) {
        this.setContent2(content2);
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
    public PSLanguageResDTO createdate(Timestamp createDate) {
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
    public PSLanguageResDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="lanrestag")
    public void setLanResTag(String lanResTag) {
        this._set(DTOFIELD_LANRESTAG, lanResTag);
    }

    @JsonIgnore
    public String getLanResTag() {
        Object objValue = this._get(DTOFIELD_LANRESTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLanResTagDirty() {
        return this._contains(DTOFIELD_LANRESTAG);
    }

    @JsonIgnore
    public void resetLanResTag() {
        this._reset(DTOFIELD_LANRESTAG);
    }

    @JsonIgnore
    public PSLanguageResDTO lanrestag(String lanResTag) {
        this.setLanResTag(lanResTag);
        return this;
    }

    @JsonProperty(value="lanrestype")
    public void setLanResType(String lanResType) {
        this._set(DTOFIELD_LANRESTYPE, lanResType);
    }

    @JsonIgnore
    public String getLanResType() {
        Object objValue = this._get(DTOFIELD_LANRESTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLanResTypeDirty() {
        return this._contains(DTOFIELD_LANRESTYPE);
    }

    @JsonIgnore
    public void resetLanResType() {
        this._reset(DTOFIELD_LANRESTYPE);
    }

    @JsonIgnore
    public PSLanguageResDTO lanrestype(String lanResType) {
        this.setLanResType(lanResType);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO lanrestype(PSModelEnums.LanResType lanResType) {
        if (lanResType == null) {
            this.setLanResType(null);
        } else {
            this.setLanResType(lanResType.value);
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
    public PSLanguageResDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSLanguageResDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSLanguageResDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSLanguageResDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSLanguageResDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSLanguageResDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSLanguageResDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="pslanguageresid")
    public void setPSLanguageResId(String pSLanguageResId) {
        this._set(DTOFIELD_PSLANGUAGERESID, pSLanguageResId);
    }

    @JsonIgnore
    public String getPSLanguageResId() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGERESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageResIdDirty() {
        return this._contains(DTOFIELD_PSLANGUAGERESID);
    }

    @JsonIgnore
    public void resetPSLanguageResId() {
        this._reset(DTOFIELD_PSLANGUAGERESID);
    }

    @JsonIgnore
    public PSLanguageResDTO pslanguageresid(String pSLanguageResId) {
        this.setPSLanguageResId(pSLanguageResId);
        return this;
    }

    @JsonProperty(value="pslanguageresname")
    public void setPSLanguageResName(String pSLanguageResName) {
        this._set(DTOFIELD_PSLANGUAGERESNAME, pSLanguageResName);
    }

    @JsonIgnore
    public String getPSLanguageResName() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGERESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageResNameDirty() {
        return this._contains(DTOFIELD_PSLANGUAGERESNAME);
    }

    @JsonIgnore
    public void resetPSLanguageResName() {
        this._reset(DTOFIELD_PSLANGUAGERESNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO pslanguageresname(String pSLanguageResName) {
        this.setPSLanguageResName(pSLanguageResName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSLanguageResName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSLanguageResName(strName);
    }

    @JsonIgnore
    public PSLanguageResDTO name(String strName) {
        this.setPSLanguageResName(strName);
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
    public PSLanguageResDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSLanguageResDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSLanguageResDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssyslanresid")
    public void setPSSysLanResId(String pSSysLanResId) {
        this._set(DTOFIELD_PSSYSLANRESID, pSSysLanResId);
    }

    @JsonIgnore
    public String getPSSysLanResId() {
        Object objValue = this._get(DTOFIELD_PSSYSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysLanResIdDirty() {
        return this._contains(DTOFIELD_PSSYSLANRESID);
    }

    @JsonIgnore
    public void resetPSSysLanResId() {
        this._reset(DTOFIELD_PSSYSLANRESID);
    }

    @JsonIgnore
    public PSLanguageResDTO pssyslanresid(String pSSysLanResId) {
        this.setPSSysLanResId(pSSysLanResId);
        return this;
    }

    @JsonProperty(value="pssyslanresname")
    public void setPSSysLanResName(String pSSysLanResName) {
        this._set(DTOFIELD_PSSYSLANRESNAME, pSSysLanResName);
    }

    @JsonIgnore
    public String getPSSysLanResName() {
        Object objValue = this._get(DTOFIELD_PSSYSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysLanResNameDirty() {
        return this._contains(DTOFIELD_PSSYSLANRESNAME);
    }

    @JsonIgnore
    public void resetPSSysLanResName() {
        this._reset(DTOFIELD_PSSYSLANRESNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO pssyslanresname(String pSSysLanResName) {
        this.setPSSysLanResName(pSSysLanResName);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFId(String pSWFId) {
        this._set(DTOFIELD_PSWFID, pSWFId);
    }

    @JsonIgnore
    public String getPSWFId() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIdDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFId() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSLanguageResDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO pswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWFId(null);
            this.setPSWFName(null);
        } else {
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="pswfname")
    public void setPSWFName(String pSWFName) {
        this._set(DTOFIELD_PSWFNAME, pSWFName);
    }

    @JsonIgnore
    public String getPSWFName() {
        Object objValue = this._get(DTOFIELD_PSWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFNameDirty() {
        return this._contains(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public void resetPSWFName() {
        this._reset(DTOFIELD_PSWFNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO pswfname(String pSWFName) {
        this.setPSWFName(pSWFName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSLanguageResDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSLanguageResDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        } else {
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    @JsonProperty(value="pswfversionname")
    public void setPSWFVersionName(String pSWFVersionName) {
        this._set(DTOFIELD_PSWFVERSIONNAME, pSWFVersionName);
    }

    @JsonIgnore
    public String getPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetPSWFVersionName() {
        this._reset(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSLanguageResDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="shorttag")
    public void setShortTag(String shortTag) {
        this._set(DTOFIELD_SHORTTAG, shortTag);
    }

    @JsonIgnore
    public String getShortTag() {
        Object objValue = this._get(DTOFIELD_SHORTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShortTagDirty() {
        return this._contains(DTOFIELD_SHORTTAG);
    }

    @JsonIgnore
    public void resetShortTag() {
        this._reset(DTOFIELD_SHORTTAG);
    }

    @JsonIgnore
    public PSLanguageResDTO shorttag(String shortTag) {
        this.setShortTag(shortTag);
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
    public PSLanguageResDTO updatedate(Timestamp updateDate) {
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
    public PSLanguageResDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSLanguageResDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSLanguageResId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSLanguageResId(strValue);
    }

    @JsonIgnore
    public PSLanguageResDTO id(String strValue) {
        this.setPSLanguageResId(strValue);
        return this;
    }
}
