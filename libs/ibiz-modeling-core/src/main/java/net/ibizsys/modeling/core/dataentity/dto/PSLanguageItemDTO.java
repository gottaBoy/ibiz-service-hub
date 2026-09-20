package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSLanguageItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CONTENT = "CONTENT";
    protected static final String DTOFIELD_CONTENT = "content";
    public static final String FIELD_CONTENT2 = "CONTENT2";
    protected static final String DTOFIELD_CONTENT2 = "content2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFCONTENT = "DEFCONTENT";
    protected static final String DTOFIELD_DEFCONTENT = "defcontent";
    public static final String FIELD_LANRESTAG = "LANRESTAG";
    protected static final String DTOFIELD_LANRESTAG = "lanrestag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSLANGUAGEID = "PSLANGUAGEID";
    protected static final String DTOFIELD_PSLANGUAGEID = "pslanguageid";
    public static final String FIELD_PSLANGUAGEITEMID = "PSLANGUAGEITEMID";
    protected static final String DTOFIELD_PSLANGUAGEITEMID = "pslanguageitemid";
    public static final String FIELD_PSLANGUAGEITEMNAME = "PSLANGUAGEITEMNAME";
    protected static final String DTOFIELD_PSLANGUAGEITEMNAME = "pslanguageitemname";
    public static final String FIELD_PSLANGUAGENAME = "PSLANGUAGENAME";
    protected static final String DTOFIELD_PSLANGUAGENAME = "pslanguagename";
    public static final String FIELD_PSLANGUAGERESID = "PSLANGUAGERESID";
    protected static final String DTOFIELD_PSLANGUAGERESID = "pslanguageresid";
    public static final String FIELD_PSLANGUAGERESNAME = "PSLANGUAGERESNAME";
    protected static final String DTOFIELD_PSLANGUAGERESNAME = "pslanguageresname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSLanguageItemDTO content(String content) {
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
    public PSLanguageItemDTO content2(String content2) {
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
    public PSLanguageItemDTO createdate(Timestamp createDate) {
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
    public PSLanguageItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defcontent")
    public void setDefContent(String defContent) {
        this._set(DTOFIELD_DEFCONTENT, defContent);
    }

    @JsonIgnore
    public String getDefContent() {
        Object objValue = this._get(DTOFIELD_DEFCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefContentDirty() {
        return this._contains(DTOFIELD_DEFCONTENT);
    }

    @JsonIgnore
    public void resetDefContent() {
        this._reset(DTOFIELD_DEFCONTENT);
    }

    @JsonIgnore
    public PSLanguageItemDTO defcontent(String defContent) {
        this.setDefContent(defContent);
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
    public PSLanguageItemDTO lanrestag(String lanResTag) {
        this.setLanResTag(lanResTag);
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
    public PSLanguageItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pslanguageid")
    public void setPSLanguageId(String pSLanguageId) {
        this._set(DTOFIELD_PSLANGUAGEID, pSLanguageId);
    }

    @JsonIgnore
    public String getPSLanguageId() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageIdDirty() {
        return this._contains(DTOFIELD_PSLANGUAGEID);
    }

    @JsonIgnore
    public void resetPSLanguageId() {
        this._reset(DTOFIELD_PSLANGUAGEID);
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguageid(String pSLanguageId) {
        this.setPSLanguageId(pSLanguageId);
        return this;
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguageid(PSLanguageDTO pSLanguage) {
        if (pSLanguage == null) {
            this.setPSLanguageId(null);
            this.setPSLanguageName(null);
        } else {
            this.setPSLanguageId(pSLanguage.getPSLanguageId());
            this.setPSLanguageName(pSLanguage.getPSLanguageName());
        }
        return this;
    }

    @JsonProperty(value="pslanguageitemid")
    public void setPSLanguageItemId(String pSLanguageItemId) {
        this._set(DTOFIELD_PSLANGUAGEITEMID, pSLanguageItemId);
    }

    @JsonIgnore
    public String getPSLanguageItemId() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGEITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageItemIdDirty() {
        return this._contains(DTOFIELD_PSLANGUAGEITEMID);
    }

    @JsonIgnore
    public void resetPSLanguageItemId() {
        this._reset(DTOFIELD_PSLANGUAGEITEMID);
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguageitemid(String pSLanguageItemId) {
        this.setPSLanguageItemId(pSLanguageItemId);
        return this;
    }

    @JsonProperty(value="pslanguageitemname")
    public void setPSLanguageItemName(String pSLanguageItemName) {
        this._set(DTOFIELD_PSLANGUAGEITEMNAME, pSLanguageItemName);
    }

    @JsonIgnore
    public String getPSLanguageItemName() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageItemNameDirty() {
        return this._contains(DTOFIELD_PSLANGUAGEITEMNAME);
    }

    @JsonIgnore
    public void resetPSLanguageItemName() {
        this._reset(DTOFIELD_PSLANGUAGEITEMNAME);
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguageitemname(String pSLanguageItemName) {
        this.setPSLanguageItemName(pSLanguageItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSLanguageItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSLanguageItemName(strName);
    }

    @JsonIgnore
    public PSLanguageItemDTO name(String strName) {
        this.setPSLanguageItemName(strName);
        return this;
    }

    @JsonProperty(value="pslanguagename")
    public void setPSLanguageName(String pSLanguageName) {
        this._set(DTOFIELD_PSLANGUAGENAME, pSLanguageName);
    }

    @JsonIgnore
    public String getPSLanguageName() {
        Object objValue = this._get(DTOFIELD_PSLANGUAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSLanguageNameDirty() {
        return this._contains(DTOFIELD_PSLANGUAGENAME);
    }

    @JsonIgnore
    public void resetPSLanguageName() {
        this._reset(DTOFIELD_PSLANGUAGENAME);
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguagename(String pSLanguageName) {
        this.setPSLanguageName(pSLanguageName);
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
    public PSLanguageItemDTO pslanguageresid(String pSLanguageResId) {
        this.setPSLanguageResId(pSLanguageResId);
        return this;
    }

    @JsonIgnore
    public PSLanguageItemDTO pslanguageresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setDefContent(null);
            this.setLanResTag(null);
            this.setPSLanguageResId(null);
            this.setPSLanguageResName(null);
        } else {
            this.setDefContent(pSLanguageRes.getContent());
            this.setLanResTag(pSLanguageRes.getLanResTag());
            this.setPSLanguageResId(pSLanguageRes.getPSLanguageResId());
            this.setPSLanguageResName(pSLanguageRes.getPSLanguageResName());
        }
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
    public PSLanguageItemDTO pslanguageresname(String pSLanguageResName) {
        this.setPSLanguageResName(pSLanguageResName);
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
    public PSLanguageItemDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSLanguageItemDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSLanguageItemDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSLanguageItemDTO updatedate(Timestamp updateDate) {
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
    public PSLanguageItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSLanguageItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSLanguageItemId(strValue);
    }

    @JsonIgnore
    public PSLanguageItemDTO id(String strValue) {
        this.setPSLanguageItemId(strValue);
        return this;
    }
}
