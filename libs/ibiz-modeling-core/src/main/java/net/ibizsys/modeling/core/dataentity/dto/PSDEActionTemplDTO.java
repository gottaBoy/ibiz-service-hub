/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDCCodeSnippetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEActionTemplDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCCODESNIPPETID = "PSDCCODESNIPPETID";
    protected static final String DTOFIELD_PSDCCODESNIPPETID = "psdccodesnippetid";
    public static final String FIELD_PSDCCODESNIPPETNAME = "PSDCCODESNIPPETNAME";
    protected static final String DTOFIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";
    public static final String FIELD_PSDEACTIONTEMPLID = "PSDEACTIONTEMPLID";
    protected static final String DTOFIELD_PSDEACTIONTEMPLID = "psdeactiontemplid";
    public static final String FIELD_PSDEACTIONTEMPLNAME = "PSDEACTIONTEMPLNAME";
    protected static final String DTOFIELD_PSDEACTIONTEMPLNAME = "psdeactiontemplname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_TEMPLCODE = "TEMPLCODE";
    protected static final String DTOFIELD_TEMPLCODE = "templcode";
    public static final String FIELD_TEMPLCODE2 = "TEMPLCODE2";
    protected static final String DTOFIELD_TEMPLCODE2 = "templcode2";
    public static final String FIELD_TEMPLCODE2EX = "TEMPLCODE2EX";
    protected static final String DTOFIELD_TEMPLCODE2EX = "templcode2ex";
    public static final String FIELD_TEMPLCODEEX = "TEMPLCODEEX";
    protected static final String DTOFIELD_TEMPLCODEEX = "templcodeex";
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
    public PSDEActionTemplDTO codename(String codeName) {
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
    public PSDEActionTemplDTO createdate(Timestamp createDate) {
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
    public PSDEActionTemplDTO createman(String createMan) {
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
    public PSDEActionTemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdccodesnippetid")
    public void setPSDCCodeSnippetId(String pSDCCodeSnippetId) {
        this._set(DTOFIELD_PSDCCODESNIPPETID, pSDCCodeSnippetId);
    }

    @JsonIgnore
    public String getPSDCCodeSnippetId() {
        Object objValue = this._get(DTOFIELD_PSDCCODESNIPPETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCCodeSnippetIdDirty() {
        return this._contains(DTOFIELD_PSDCCODESNIPPETID);
    }

    @JsonIgnore
    public void resetPSDCCodeSnippetId() {
        this._reset(DTOFIELD_PSDCCODESNIPPETID);
    }

    @JsonIgnore
    public PSDEActionTemplDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonIgnore
    public PSDEActionTemplDTO psdccodesnippetid(PSDCCodeSnippetDTO pSDCCodeSnippet) {
        if (pSDCCodeSnippet == null) {
            this.setPSDCCodeSnippetId(null);
            this.setPSDCCodeSnippetName(null);
        } else {
            this.setPSDCCodeSnippetId(pSDCCodeSnippet.getPSDCCodeSnippetId());
            this.setPSDCCodeSnippetName(pSDCCodeSnippet.getPSDCCodeSnippetName());
        }
        return this;
    }

    @JsonProperty(value="psdccodesnippetname")
    public void setPSDCCodeSnippetName(String pSDCCodeSnippetName) {
        this._set(DTOFIELD_PSDCCODESNIPPETNAME, pSDCCodeSnippetName);
    }

    @JsonIgnore
    public String getPSDCCodeSnippetName() {
        Object objValue = this._get(DTOFIELD_PSDCCODESNIPPETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCCodeSnippetNameDirty() {
        return this._contains(DTOFIELD_PSDCCODESNIPPETNAME);
    }

    @JsonIgnore
    public void resetPSDCCodeSnippetName() {
        this._reset(DTOFIELD_PSDCCODESNIPPETNAME);
    }

    @JsonIgnore
    public PSDEActionTemplDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    @JsonProperty(value="psdeactiontemplid")
    public void setPSDEActionTemplId(String pSDEActionTemplId) {
        this._set(DTOFIELD_PSDEACTIONTEMPLID, pSDEActionTemplId);
    }

    @JsonIgnore
    public String getPSDEActionTemplId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionTemplIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONTEMPLID);
    }

    @JsonIgnore
    public void resetPSDEActionTemplId() {
        this._reset(DTOFIELD_PSDEACTIONTEMPLID);
    }

    @JsonIgnore
    public PSDEActionTemplDTO psdeactiontemplid(String pSDEActionTemplId) {
        this.setPSDEActionTemplId(pSDEActionTemplId);
        return this;
    }

    @JsonProperty(value="psdeactiontemplname")
    public void setPSDEActionTemplName(String pSDEActionTemplName) {
        this._set(DTOFIELD_PSDEACTIONTEMPLNAME, pSDEActionTemplName);
    }

    @JsonIgnore
    public String getPSDEActionTemplName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionTemplNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDEActionTemplName() {
        this._reset(DTOFIELD_PSDEACTIONTEMPLNAME);
    }

    @JsonIgnore
    public PSDEActionTemplDTO psdeactiontemplname(String pSDEActionTemplName) {
        this.setPSDEActionTemplName(pSDEActionTemplName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEActionTemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEActionTemplName(strName);
    }

    @JsonIgnore
    public PSDEActionTemplDTO name(String strName) {
        this.setPSDEActionTemplName(strName);
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
    public PSDEActionTemplDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEActionTemplDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSDEActionTemplDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="templcode")
    public void setTemplCode(String templCode) {
        this._set(DTOFIELD_TEMPLCODE, templCode);
    }

    @JsonIgnore
    public String getTemplCode() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCodeDirty() {
        return this._contains(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public void resetTemplCode() {
        this._reset(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public PSDEActionTemplDTO templcode(String templCode) {
        this.setTemplCode(templCode);
        return this;
    }

    @JsonProperty(value="templcode2")
    public void setTemplCode2(String templCode2) {
        this._set(DTOFIELD_TEMPLCODE2, templCode2);
    }

    @JsonIgnore
    public String getTemplCode2() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode2Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE2);
    }

    @JsonIgnore
    public void resetTemplCode2() {
        this._reset(DTOFIELD_TEMPLCODE2);
    }

    @JsonIgnore
    public PSDEActionTemplDTO templcode2(String templCode2) {
        this.setTemplCode2(templCode2);
        return this;
    }

    @JsonProperty(value="templcode2ex")
    public void setTemplCode2Ex(String templCode2Ex) {
        this._set(DTOFIELD_TEMPLCODE2EX, templCode2Ex);
    }

    @JsonIgnore
    public String getTemplCode2Ex() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE2EX);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode2ExDirty() {
        return this._contains(DTOFIELD_TEMPLCODE2EX);
    }

    @JsonIgnore
    public void resetTemplCode2Ex() {
        this._reset(DTOFIELD_TEMPLCODE2EX);
    }

    @JsonIgnore
    public PSDEActionTemplDTO templcode2ex(String templCode2Ex) {
        this.setTemplCode2Ex(templCode2Ex);
        return this;
    }

    @JsonProperty(value="templcodeex")
    public void setTemplCodeEx(String templCodeEx) {
        this._set(DTOFIELD_TEMPLCODEEX, templCodeEx);
    }

    @JsonIgnore
    public String getTemplCodeEx() {
        Object objValue = this._get(DTOFIELD_TEMPLCODEEX);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCodeExDirty() {
        return this._contains(DTOFIELD_TEMPLCODEEX);
    }

    @JsonIgnore
    public void resetTemplCodeEx() {
        this._reset(DTOFIELD_TEMPLCODEEX);
    }

    @JsonIgnore
    public PSDEActionTemplDTO templcodeex(String templCodeEx) {
        this.setTemplCodeEx(templCodeEx);
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
    public PSDEActionTemplDTO updatedate(Timestamp updateDate) {
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
    public PSDEActionTemplDTO updateman(String updateMan) {
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
    public PSDEActionTemplDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEActionTemplDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEActionTemplDTO usertag(String userTag) {
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
    public PSDEActionTemplDTO usertag2(String userTag2) {
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
    public PSDEActionTemplDTO usertag3(String userTag3) {
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
    public PSDEActionTemplDTO usertag4(String userTag4) {
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
    public PSDEActionTemplDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionTemplDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEActionTemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEActionTemplId(strValue);
    }

    @JsonIgnore
    public PSDEActionTemplDTO id(String strValue) {
        this.setPSDEActionTemplId(strValue);
        return this;
    }
}
