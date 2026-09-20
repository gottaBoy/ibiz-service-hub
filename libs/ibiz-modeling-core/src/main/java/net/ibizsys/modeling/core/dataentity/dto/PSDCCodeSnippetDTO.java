package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCCodeSnippetDTO extends PSModelDTOBase {
    public static final String FIELD_ALLDCFLAG = "ALLDCFLAG";
    protected static final String DTOFIELD_ALLDCFLAG = "alldcflag";
    public static final String FIELD_CODECAT = "CODECAT";
    protected static final String DTOFIELD_CODECAT = "codecat";
    public static final String FIELD_CODETARGET = "CODETARGET";
    protected static final String DTOFIELD_CODETARGET = "codetarget";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_KEYWORDS = "KEYWORDS";
    protected static final String DTOFIELD_KEYWORDS = "keywords";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCCODESNIPPETID = "PSDCCODESNIPPETID";
    protected static final String DTOFIELD_PSDCCODESNIPPETID = "psdccodesnippetid";
    public static final String FIELD_PSDCCODESNIPPETNAME = "PSDCCODESNIPPETNAME";
    protected static final String DTOFIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_REFMODE = "REFMODE";
    protected static final String DTOFIELD_REFMODE = "refmode";
    public static final String FIELD_TEMPLCODE = "TEMPLCODE";
    protected static final String DTOFIELD_TEMPLCODE = "templcode";
    public static final String FIELD_TEMPLCODE2 = "TEMPLCODE2";
    protected static final String DTOFIELD_TEMPLCODE2 = "templcode2";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="alldcflag")
    public void setAllDCFlag(Integer allDCFlag) {
        this._set(DTOFIELD_ALLDCFLAG, allDCFlag);
    }

    @JsonIgnore
    public Integer getAllDCFlag() {
        Object objValue = this._get(DTOFIELD_ALLDCFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllDCFlagDirty() {
        return this._contains(DTOFIELD_ALLDCFLAG);
    }

    @JsonIgnore
    public void resetAllDCFlag() {
        this._reset(DTOFIELD_ALLDCFLAG);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO alldcflag(Integer allDCFlag) {
        this.setAllDCFlag(allDCFlag);
        return this;
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO alldcflag(Boolean allDCFlag) {
        this.setAllDCFlag(allDCFlag == null ? null : (allDCFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="codecat")
    public void setCodeCat(String codeCat) {
        this._set(DTOFIELD_CODECAT, codeCat);
    }

    @JsonIgnore
    public String getCodeCat() {
        Object objValue = this._get(DTOFIELD_CODECAT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeCatDirty() {
        return this._contains(DTOFIELD_CODECAT);
    }

    @JsonIgnore
    public void resetCodeCat() {
        this._reset(DTOFIELD_CODECAT);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO codecat(String codeCat) {
        this.setCodeCat(codeCat);
        return this;
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO codecat(PSModelEnums.CodeSnippetCat codeCat) {
        this.setCodeCat(codeCat == null ? null : codeCat.value);
        return this;
    }

    @JsonProperty(value="codetarget")
    public void setCodeTarget(String codeTarget) {
        this._set(DTOFIELD_CODETARGET, codeTarget);
    }

    @JsonIgnore
    public String getCodeTarget() {
        Object objValue = this._get(DTOFIELD_CODETARGET);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeTargetDirty() {
        return this._contains(DTOFIELD_CODETARGET);
    }

    @JsonIgnore
    public void resetCodeTarget() {
        this._reset(DTOFIELD_CODETARGET);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO codetarget(String codeTarget) {
        this.setCodeTarget(codeTarget);
        return this;
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO codetarget(PSModelEnums.CodeSnippetTarget codeTarget) {
        this.setCodeTarget(codeTarget == null ? null : codeTarget.value);
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="keywords")
    public void setKeywords(String keywords) {
        this._set(DTOFIELD_KEYWORDS, keywords);
    }

    @JsonIgnore
    public String getKeywords() {
        Object objValue = this._get(DTOFIELD_KEYWORDS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeywordsDirty() {
        return this._contains(DTOFIELD_KEYWORDS);
    }

    @JsonIgnore
    public void resetKeywords() {
        this._reset(DTOFIELD_KEYWORDS);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO keywords(String keywords) {
        this.setKeywords(keywords);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO memo(String memo) {
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonProperty(value="psdccodesnippetname")
    public void setPSDCCodeSnippetName(String pSDCCodeSnippetName) {
        this._set(DTOFIELD_PSDCCODESNIPPETNAME, pSDCCodeSnippetName);
    }

    @JsonIgnore
    public String getPSDCCodeSnippetName() {
        Object objValue = this._get(DTOFIELD_PSDCCODESNIPPETNAME);
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="refmode")
    public void setRefMode(String refMode) {
        this._set(DTOFIELD_REFMODE, refMode);
    }

    @JsonIgnore
    public String getRefMode() {
        Object objValue = this._get(DTOFIELD_REFMODE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefModeDirty() {
        return this._contains(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public void resetRefMode() {
        this._reset(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO refmode(String refMode) {
        this.setRefMode(refMode);
        return this;
    }

    @JsonProperty(value="templcode")
    public void setTemplCode(String templCode) {
        this._set(DTOFIELD_TEMPLCODE, templCode);
    }

    @JsonIgnore
    public String getTemplCode() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE);
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO templcode(String templCode) {
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO templcode2(String templCode2) {
        this.setTemplCode2(templCode2);
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSDCCodeSnippetDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCCodeSnippetName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCCodeSnippetName(strName);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO name(String strName) {
        this.setPSDCCodeSnippetName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCCodeSnippetId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCCodeSnippetId(strValue);
    }

    @JsonIgnore
    public PSDCCodeSnippetDTO id(String strValue) {
        this.setPSDCCodeSnippetId(strValue);
        return this;
    }

}
