package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysSrvDTO extends PSModelDTOBase {
    public static final String FIELD_ACCESSTOKEN = "ACCESSTOKEN";
    protected static final String DTOFIELD_ACCESSTOKEN = "accesstoken";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PKGCODENAME = "PKGCODENAME";
    protected static final String DTOFIELD_PKGCODENAME = "pkgcodename";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSSRVID = "PSDEVSLNSYSSRVID";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";
    public static final String FIELD_PSDEVSLNSYSSRVNAME = "PSDEVSLNSYSSRVNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSFSTYLENAME = "PSSFSTYLENAME";
    protected static final String DTOFIELD_PSSFSTYLENAME = "pssfstylename";
    public static final String FIELD_PSSFSTYLEVERID = "PSSFSTYLEVERID";
    protected static final String DTOFIELD_PSSFSTYLEVERID = "pssfstyleverid";
    public static final String FIELD_PSSFSTYLEVERNAME = "PSSFSTYLEVERNAME";
    protected static final String DTOFIELD_PSSFSTYLEVERNAME = "pssfstylevername";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSSYSSFPUBNAME = "PSSYSSFPUBNAME";
    protected static final String DTOFIELD_PSSYSSFPUBNAME = "pssyssfpubname";
    public static final String FIELD_PUBTAG = "PUBTAG";
    protected static final String DTOFIELD_PUBTAG = "pubtag";
    public static final String FIELD_PUBTAG2 = "PUBTAG2";
    protected static final String DTOFIELD_PUBTAG2 = "pubtag2";
    public static final String FIELD_PUBTAG3 = "PUBTAG3";
    protected static final String DTOFIELD_PUBTAG3 = "pubtag3";
    public static final String FIELD_PUBTAG4 = "PUBTAG4";
    protected static final String DTOFIELD_PUBTAG4 = "pubtag4";
    public static final String FIELD_SYSCODENAME = "SYSCODENAME";
    protected static final String DTOFIELD_SYSCODENAME = "syscodename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="accesstoken")
    public void setAccessToken(String accessToken) {
        this._set(DTOFIELD_ACCESSTOKEN, accessToken);
    }

    @JsonIgnore
    public String getAccessToken() {
        Object objValue = this._get(DTOFIELD_ACCESSTOKEN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAccessTokenDirty() {
        return this._contains(DTOFIELD_ACCESSTOKEN);
    }

    @JsonIgnore
    public void resetAccessToken() {
        this._reset(DTOFIELD_ACCESSTOKEN);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO accesstoken(String accessToken) {
        this.setAccessToken(accessToken);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSDevSlnSysSrvDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="contenttype")
    public void setContentType(String contentType) {
        this._set(DTOFIELD_CONTENTTYPE, contentType);
    }

    @JsonIgnore
    public String getContentType() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPE);
        if (objValue == null) return null;
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
    public PSDevSlnSysSrvDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO contenttype(PSModelEnums.SFPubContentType contentType) {
        this.setContentType(contentType == null ? null : contentType.value);
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
    public PSDevSlnSysSrvDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysSrvDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO enablelink(Boolean enableLink) {
        this.setEnableLink(enableLink == null ? null : (enableLink ? 1 : 0));
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
    public PSDevSlnSysSrvDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pkgcodename")
    public void setPKGCodeName(String pKGCodeName) {
        this._set(DTOFIELD_PKGCODENAME, pKGCodeName);
    }

    @JsonIgnore
    public String getPKGCodeName() {
        Object objValue = this._get(DTOFIELD_PKGCODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPKGCodeNameDirty() {
        return this._contains(DTOFIELD_PKGCODENAME);
    }

    @JsonIgnore
    public void resetPKGCodeName() {
        this._reset(DTOFIELD_PKGCODENAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pkgcodename(String pKGCodeName) {
        this.setPKGCodeName(pKGCodeName);
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
    public PSDevSlnSysSrvDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
            this.setSysCodeName(null);
        } else {
            this.setPSDevSlnId(pSDevSlnSys.getPSDevSlnId());
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
            this.setSysCodeName(pSDevSlnSys.getCodeName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvid")
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvId() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVID);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsyssrvid(String pSDevSlnSysSrvId) {
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    @JsonProperty(value="psdevslnsyssrvname")
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName) {
        this._set(DTOFIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }

    @JsonIgnore
    public String getPSDevSlnSysSrvName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSSRVNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysSrvName() {
        this._reset(DTOFIELD_PSDEVSLNSYSSRVNAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO psdevslnsyssrvname(String pSDevSlnSysSrvName) {
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    @JsonProperty(value="pssfstyleid")
    public void setPSSFStyleId(String pSSFStyleId) {
        this._set(DTOFIELD_PSSFSTYLEID, pSSFStyleId);
    }

    @JsonIgnore
    public String getPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public void resetPSSFStyleId() {
        this._reset(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setPSSFStyleId(null);
            this.setPSSFStyleName(null);
        } else {
            this.setPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="pssfstylename")
    public void setPSSFStyleName(String pSSFStyleName) {
        this._set(DTOFIELD_PSSFSTYLENAME, pSSFStyleName);
    }

    @JsonIgnore
    public String getPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSSFStyleName() {
        this._reset(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssfstylename(String pSSFStyleName) {
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    @JsonProperty(value="pssfstyleverid")
    public void setPSSFStyleVerId(String pSSFStyleVerId) {
        this._set(DTOFIELD_PSSFSTYLEVERID, pSSFStyleVerId);
    }

    @JsonIgnore
    public String getPSSFStyleVerId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleVerIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEVERID);
    }

    @JsonIgnore
    public void resetPSSFStyleVerId() {
        this._reset(DTOFIELD_PSSFSTYLEVERID);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssfstyleverid(String pSSFStyleVerId) {
        this.setPSSFStyleVerId(pSSFStyleVerId);
        return this;
    }

    @JsonProperty(value="pssfstylevername")
    public void setPSSFStyleVerName(String pSSFStyleVerName) {
        this._set(DTOFIELD_PSSFSTYLEVERNAME, pSSFStyleVerName);
    }

    @JsonIgnore
    public String getPSSFStyleVerName() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleVerNameDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEVERNAME);
    }

    @JsonIgnore
    public void resetPSSFStyleVerName() {
        this._reset(DTOFIELD_PSSFSTYLEVERNAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssfstylevername(String pSSFStyleVerName) {
        this.setPSSFStyleVerName(pSSFStyleVerName);
        return this;
    }

    @JsonProperty(value="pssyssfpubid")
    public void setPSSysSFPubId(String pSSysSFPubId) {
        this._set(DTOFIELD_PSSYSSFPUBID, pSSysSFPubId);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPSSysSFPubId() {
        this._reset(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssyssfpubid(String pSSysSFPubId) {
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    @JsonProperty(value="pssyssfpubname")
    public void setPSSysSFPubName(String pSSysSFPubName) {
        this._set(DTOFIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }

    @JsonIgnore
    public String getPSSysSFPubName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPubName() {
        this._reset(DTOFIELD_PSSYSSFPUBNAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pssyssfpubname(String pSSysSFPubName) {
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    @JsonProperty(value="pubtag")
    public void setPubTag(String pubTag) {
        this._set(DTOFIELD_PUBTAG, pubTag);
    }

    @JsonIgnore
    public String getPubTag() {
        Object objValue = this._get(DTOFIELD_PUBTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPubTagDirty() {
        return this._contains(DTOFIELD_PUBTAG);
    }

    @JsonIgnore
    public void resetPubTag() {
        this._reset(DTOFIELD_PUBTAG);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pubtag(String pubTag) {
        this.setPubTag(pubTag);
        return this;
    }

    @JsonProperty(value="pubtag2")
    public void setPubTag2(String pubTag2) {
        this._set(DTOFIELD_PUBTAG2, pubTag2);
    }

    @JsonIgnore
    public String getPubTag2() {
        Object objValue = this._get(DTOFIELD_PUBTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPubTag2Dirty() {
        return this._contains(DTOFIELD_PUBTAG2);
    }

    @JsonIgnore
    public void resetPubTag2() {
        this._reset(DTOFIELD_PUBTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pubtag2(String pubTag2) {
        this.setPubTag2(pubTag2);
        return this;
    }

    @JsonProperty(value="pubtag3")
    public void setPubTag3(String pubTag3) {
        this._set(DTOFIELD_PUBTAG3, pubTag3);
    }

    @JsonIgnore
    public String getPubTag3() {
        Object objValue = this._get(DTOFIELD_PUBTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPubTag3Dirty() {
        return this._contains(DTOFIELD_PUBTAG3);
    }

    @JsonIgnore
    public void resetPubTag3() {
        this._reset(DTOFIELD_PUBTAG3);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pubtag3(String pubTag3) {
        this.setPubTag3(pubTag3);
        return this;
    }

    @JsonProperty(value="pubtag4")
    public void setPubTag4(String pubTag4) {
        this._set(DTOFIELD_PUBTAG4, pubTag4);
    }

    @JsonIgnore
    public String getPubTag4() {
        Object objValue = this._get(DTOFIELD_PUBTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPubTag4Dirty() {
        return this._contains(DTOFIELD_PUBTAG4);
    }

    @JsonIgnore
    public void resetPubTag4() {
        this._reset(DTOFIELD_PUBTAG4);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO pubtag4(String pubTag4) {
        this.setPubTag4(pubTag4);
        return this;
    }

    @JsonProperty(value="syscodename")
    public void setSysCodeName(String sysCodeName) {
        this._set(DTOFIELD_SYSCODENAME, sysCodeName);
    }

    @JsonIgnore
    public String getSysCodeName() {
        Object objValue = this._get(DTOFIELD_SYSCODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysCodeNameDirty() {
        return this._contains(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public void resetSysCodeName() {
        this._reset(DTOFIELD_SYSCODENAME);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO syscodename(String sysCodeName) {
        this.setSysCodeName(sysCodeName);
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
    public PSDevSlnSysSrvDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysSrvDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
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
    public PSDevSlnSysSrvDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysSrvName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysSrvName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO name(String strName) {
        this.setPSDevSlnSysSrvName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysSrvId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysSrvId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysSrvDTO id(String strValue) {
        this.setPSDevSlnSysSrvId(strValue);
        return this;
    }

}
