package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFInputTipDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENTPSLANRESID = "CONTENTPSLANRESID";
    protected static final String DTOFIELD_CONTENTPSLANRESID = "contentpslanresid";
    public static final String FIELD_CONTENTPSLANRESNAME = "CONTENTPSLANRESNAME";
    protected static final String DTOFIELD_CONTENTPSLANRESNAME = "contentpslanresname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_ENABLECLOSE = "ENABLECLOSE";
    protected static final String DTOFIELD_ENABLECLOSE = "enableclose";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOREURL = "MOREURL";
    protected static final String DTOFIELD_MOREURL = "moreurl";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFINPUTTIPID = "PSDEFINPUTTIPID";
    protected static final String DTOFIELD_PSDEFINPUTTIPID = "psdefinputtipid";
    public static final String FIELD_PSDEFINPUTTIPNAME = "PSDEFINPUTTIPNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPNAME = "psdefinputtipname";
    public static final String FIELD_PSDEFINPUTTIPSETID = "PSDEFINPUTTIPSETID";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";
    public static final String FIELD_PSDEFINPUTTIPSETNAME = "PSDEFINPUTTIPSETNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_TIPMODE = "TIPMODE";
    protected static final String DTOFIELD_TIPMODE = "tipmode";
    public static final String FIELD_UNIQUETAG = "UNIQUETAG";
    protected static final String DTOFIELD_UNIQUETAG = "uniquetag";
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
    public PSDEFInputTipDTO codename(String codeName) {
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
    public PSDEFInputTipDTO content(String content) {
        this.setContent(content);
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
    public PSDEFInputTipDTO contentpslanresid(String contentPSLanResId) {
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO contentpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFInputTipDTO contentpslanresname(String contentPSLanResName) {
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
    public PSDEFInputTipDTO createdate(Timestamp createDate) {
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
    public PSDEFInputTipDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSDEFInputTipDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableclose")
    public void setEnableClose(Integer enableClose) {
        this._set(DTOFIELD_ENABLECLOSE, enableClose);
    }

    @JsonIgnore
    public Integer getEnableClose() {
        Object objValue = this._get(DTOFIELD_ENABLECLOSE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCloseDirty() {
        return this._contains(DTOFIELD_ENABLECLOSE);
    }

    @JsonIgnore
    public void resetEnableClose() {
        this._reset(DTOFIELD_ENABLECLOSE);
    }

    @JsonIgnore
    public PSDEFInputTipDTO enableclose(Integer enableClose) {
        this.setEnableClose(enableClose);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO enableclose(Boolean enableClose) {
        if (enableClose == null) {
            this.setEnableClose(null);
        } else {
            this.setEnableClose(enableClose != false ? 1 : 0);
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
    public PSDEFInputTipDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="moreurl")
    public void setMoreUrl(String moreUrl) {
        this._set(DTOFIELD_MOREURL, moreUrl);
    }

    @JsonIgnore
    public String getMoreUrl() {
        Object objValue = this._get(DTOFIELD_MOREURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMoreUrlDirty() {
        return this._contains(DTOFIELD_MOREURL);
    }

    @JsonIgnore
    public void resetMoreUrl() {
        this._reset(DTOFIELD_MOREURL);
    }

    @JsonIgnore
    public PSDEFInputTipDTO moreurl(String moreUrl) {
        this.setMoreUrl(moreUrl);
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
    public PSDEFInputTipDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefinputtipid")
    public void setPSDEFInputTipId(String pSDEFInputTipId) {
        this._set(DTOFIELD_PSDEFINPUTTIPID, pSDEFInputTipId);
    }

    @JsonIgnore
    public String getPSDEFInputTipId() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipIdDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPID);
    }

    @JsonIgnore
    public void resetPSDEFInputTipId() {
        this._reset(DTOFIELD_PSDEFINPUTTIPID);
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefinputtipid(String pSDEFInputTipId) {
        this.setPSDEFInputTipId(pSDEFInputTipId);
        return this;
    }

    @JsonProperty(value="psdefinputtipname")
    public void setPSDEFInputTipName(String pSDEFInputTipName) {
        this._set(DTOFIELD_PSDEFINPUTTIPNAME, pSDEFInputTipName);
    }

    @JsonIgnore
    public String getPSDEFInputTipName() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipNameDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPNAME);
    }

    @JsonIgnore
    public void resetPSDEFInputTipName() {
        this._reset(DTOFIELD_PSDEFINPUTTIPNAME);
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefinputtipname(String pSDEFInputTipName) {
        this.setPSDEFInputTipName(pSDEFInputTipName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFInputTipName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFInputTipName(strName);
    }

    @JsonIgnore
    public PSDEFInputTipDTO name(String strName) {
        this.setPSDEFInputTipName(strName);
        return this;
    }

    @JsonProperty(value="psdefinputtipsetid")
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetId() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetId() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefinputtipsetid(String pSDEFInputTipSetId) {
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefinputtipsetid(PSDEFInputTipSetDTO pSDEFInputTipSet) {
        if (pSDEFInputTipSet == null) {
            this.setPSDEFInputTipSetId(null);
            this.setPSDEFInputTipSetName(null);
        } else {
            this.setPSDEFInputTipSetId(pSDEFInputTipSet.getPSDEFInputTipSetId());
            this.setPSDEFInputTipSetName(pSDEFInputTipSet.getPSDEFInputTipSetName());
        }
        return this;
    }

    @JsonProperty(value="psdefinputtipsetname")
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetName() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetName() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdefinputtipsetname(String pSDEFInputTipSetName) {
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
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
    public PSDEFInputTipDTO psdefname(String pSDEFName) {
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
    public PSDEFInputTipDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFInputTipDTO psdename(String pSDEName) {
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
    public PSDEFInputTipDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSDEFInputTipDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="rawcontent")
    public void setRawContent(String rawContent) {
        this._set(DTOFIELD_RAWCONTENT, rawContent);
    }

    @JsonIgnore
    public String getRawContent() {
        Object objValue = this._get(DTOFIELD_RAWCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawContentDirty() {
        return this._contains(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public void resetRawContent() {
        this._reset(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public PSDEFInputTipDTO rawcontent(String rawContent) {
        this.setRawContent(rawContent);
        return this;
    }

    @JsonProperty(value="tipmode")
    public void setTipMode(String tipMode) {
        this._set(DTOFIELD_TIPMODE, tipMode);
    }

    @JsonIgnore
    public String getTipMode() {
        Object objValue = this._get(DTOFIELD_TIPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipModeDirty() {
        return this._contains(DTOFIELD_TIPMODE);
    }

    @JsonIgnore
    public void resetTipMode() {
        this._reset(DTOFIELD_TIPMODE);
    }

    @JsonIgnore
    public PSDEFInputTipDTO tipmode(String tipMode) {
        this.setTipMode(tipMode);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO tipmode(PSModelEnums.DEFInputTipMode tipMode) {
        if (tipMode == null) {
            this.setTipMode(null);
        } else {
            this.setTipMode(tipMode.value);
        }
        return this;
    }

    @JsonProperty(value="uniquetag")
    public void setUniqueTag(String uniqueTag) {
        this._set(DTOFIELD_UNIQUETAG, uniqueTag);
    }

    @JsonIgnore
    public String getUniqueTag() {
        Object objValue = this._get(DTOFIELD_UNIQUETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagDirty() {
        return this._contains(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public void resetUniqueTag() {
        this._reset(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public PSDEFInputTipDTO uniquetag(String uniqueTag) {
        this.setUniqueTag(uniqueTag);
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
    public PSDEFInputTipDTO updatedate(Timestamp updateDate) {
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
    public PSDEFInputTipDTO updateman(String updateMan) {
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
    public PSDEFInputTipDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFInputTipDTO usertag(String userTag) {
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
    public PSDEFInputTipDTO usertag2(String userTag2) {
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
    public PSDEFInputTipDTO usertag3(String userTag3) {
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
    public PSDEFInputTipDTO usertag4(String userTag4) {
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
    public PSDEFInputTipDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFInputTipId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFInputTipId(strValue);
    }

    @JsonIgnore
    public PSDEFInputTipDTO id(String strValue) {
        this.setPSDEFInputTipId(strValue);
        return this;
    }
}
