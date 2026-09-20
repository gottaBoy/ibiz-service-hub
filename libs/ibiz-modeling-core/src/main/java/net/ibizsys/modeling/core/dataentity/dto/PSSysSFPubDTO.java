package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSFStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSFPubDTO
extends PSModelDTOBase {
    public static final String FIELD_BASECLSPARAMS = "BASECLSPARAMS";
    protected static final String DTOFIELD_BASECLSPARAMS = "baseclsparams";
    public static final String FIELD_BASECLSPKGCODENAME = "BASECLSPKGCODENAME";
    protected static final String DTOFIELD_BASECLSPKGCODENAME = "baseclspkgcodename";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTPUB = "DEFAULTPUB";
    protected static final String DTOFIELD_DEFAULTPUB = "defaultpub";
    public static final String FIELD_DOCPSSFSTYLEID = "DOCPSSFSTYLEID";
    protected static final String DTOFIELD_DOCPSSFSTYLEID = "docpssfstyleid";
    public static final String FIELD_DOCPSSFSTYLENAME = "DOCPSSFSTYLENAME";
    protected static final String DTOFIELD_DOCPSSFSTYLENAME = "docpssfstylename";
    public static final String FIELD_DYNAMODELMODE = "DYNAMODELMODE";
    protected static final String DTOFIELD_DYNAMODELMODE = "dynamodelmode";
    public static final String FIELD_GLOBALTSFLAG = "GLOBALTSFLAG";
    protected static final String DTOFIELD_GLOBALTSFLAG = "globaltsflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PKGCODENAME = "PKGCODENAME";
    protected static final String DTOFIELD_PKGCODENAME = "pkgcodename";
    public static final String FIELD_PPSSYSSFPUBID = "PPSSYSSFPUBID";
    protected static final String DTOFIELD_PPSSYSSFPUBID = "ppssyssfpubid";
    public static final String FIELD_PPSSYSSFPUBNAME = "PPSSYSSFPUBNAME";
    protected static final String DTOFIELD_PPSSYSSFPUBNAME = "ppssyssfpubname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSFSTYLENAME = "PSSFSTYLENAME";
    protected static final String DTOFIELD_PSSFSTYLENAME = "pssfstylename";
    public static final String FIELD_PSSFSTYLEPARAMID = "PSSFSTYLEPARAMID";
    protected static final String DTOFIELD_PSSFSTYLEPARAMID = "pssfstyleparamid";
    public static final String FIELD_PSSFSTYLEPARAMNAME = "PSSFSTYLEPARAMNAME";
    protected static final String DTOFIELD_PSSFSTYLEPARAMNAME = "pssfstyleparamname";
    public static final String FIELD_PSSFSTYLEVERID = "PSSFSTYLEVERID";
    protected static final String DTOFIELD_PSSFSTYLEVERID = "pssfstyleverid";
    public static final String FIELD_PSSFSTYLEVERNAME = "PSSFSTYLEVERNAME";
    protected static final String DTOFIELD_PSSFSTYLEVERNAME = "pssfstylevername";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSSYSSFPUBNAME = "PSSYSSFPUBNAME";
    protected static final String DTOFIELD_PSSYSSFPUBNAME = "pssyssfpubname";
    public static final String FIELD_PUBFOLDER = "PUBFOLDER";
    protected static final String DTOFIELD_PUBFOLDER = "pubfolder";
    public static final String FIELD_PUBTAG = "PUBTAG";
    protected static final String DTOFIELD_PUBTAG = "pubtag";
    public static final String FIELD_PUBTAG2 = "PUBTAG2";
    protected static final String DTOFIELD_PUBTAG2 = "pubtag2";
    public static final String FIELD_PUBTAG3 = "PUBTAG3";
    protected static final String DTOFIELD_PUBTAG3 = "pubtag3";
    public static final String FIELD_PUBTAG4 = "PUBTAG4";
    protected static final String DTOFIELD_PUBTAG4 = "pubtag4";
    public static final String FIELD_REMOVEFLAG = "REMOVEFLAG";
    protected static final String DTOFIELD_REMOVEFLAG = "removeflag";
    public static final String FIELD_STYLEPARAMS = "STYLEPARAMS";
    protected static final String DTOFIELD_STYLEPARAMS = "styleparams";
    public static final String FIELD_SUBSYSPKGFLAG = "SUBSYSPKGFLAG";
    protected static final String DTOFIELD_SUBSYSPKGFLAG = "subsyspkgflag";
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
    public static final String FIELD_VERSTR = "VERSTR";
    protected static final String DTOFIELD_VERSTR = "verstr";

    @JsonProperty(value="baseclsparams")
    public void setBaseClsParams(String baseClsParams) {
        this._set(DTOFIELD_BASECLSPARAMS, baseClsParams);
    }

    @JsonIgnore
    public String getBaseClsParams() {
        Object objValue = this._get(DTOFIELD_BASECLSPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBaseClsParamsDirty() {
        return this._contains(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public void resetBaseClsParams() {
        this._reset(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public PSSysSFPubDTO baseclsparams(String baseClsParams) {
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    @JsonProperty(value="baseclspkgcodename")
    public void setBaseCLSPKGCodeName(String baseCLSPKGCodeName) {
        this._set(DTOFIELD_BASECLSPKGCODENAME, baseCLSPKGCodeName);
    }

    @JsonIgnore
    public String getBaseCLSPKGCodeName() {
        Object objValue = this._get(DTOFIELD_BASECLSPKGCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBaseCLSPKGCodeNameDirty() {
        return this._contains(DTOFIELD_BASECLSPKGCODENAME);
    }

    @JsonIgnore
    public void resetBaseCLSPKGCodeName() {
        this._reset(DTOFIELD_BASECLSPKGCODENAME);
    }

    @JsonIgnore
    public PSSysSFPubDTO baseclspkgcodename(String baseCLSPKGCodeName) {
        this.setBaseCLSPKGCodeName(baseCLSPKGCodeName);
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
    public PSSysSFPubDTO codename(String codeName) {
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
    public PSSysSFPubDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO contenttype(PSModelEnums.SFPubContentType contentType) {
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
    public PSSysSFPubDTO createdate(Timestamp createDate) {
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
    public PSSysSFPubDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultpub")
    public void setDefaultPub(Integer defaultPub) {
        this._set(DTOFIELD_DEFAULTPUB, defaultPub);
    }

    @JsonIgnore
    public Integer getDefaultPub() {
        Object objValue = this._get(DTOFIELD_DEFAULTPUB);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultPubDirty() {
        return this._contains(DTOFIELD_DEFAULTPUB);
    }

    @JsonIgnore
    public void resetDefaultPub() {
        this._reset(DTOFIELD_DEFAULTPUB);
    }

    @JsonIgnore
    public PSSysSFPubDTO defaultpub(Integer defaultPub) {
        this.setDefaultPub(defaultPub);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO defaultpub(Boolean defaultPub) {
        if (defaultPub == null) {
            this.setDefaultPub(null);
        } else {
            this.setDefaultPub(defaultPub != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="docpssfstyleid")
    public void setDocPSSFStyleId(String docPSSFStyleId) {
        this._set(DTOFIELD_DOCPSSFSTYLEID, docPSSFStyleId);
    }

    @JsonIgnore
    public String getDocPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_DOCPSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_DOCPSSFSTYLEID);
    }

    @JsonIgnore
    public void resetDocPSSFStyleId() {
        this._reset(DTOFIELD_DOCPSSFSTYLEID);
    }

    @JsonIgnore
    public PSSysSFPubDTO docpssfstyleid(String docPSSFStyleId) {
        this.setDocPSSFStyleId(docPSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO docpssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setDocPSSFStyleId(null);
            this.setDocPSSFStyleName(null);
        } else {
            this.setDocPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setDocPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="docpssfstylename")
    public void setDocPSSFStyleName(String docPSSFStyleName) {
        this._set(DTOFIELD_DOCPSSFSTYLENAME, docPSSFStyleName);
    }

    @JsonIgnore
    public String getDocPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_DOCPSSFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_DOCPSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetDocPSSFStyleName() {
        this._reset(DTOFIELD_DOCPSSFSTYLENAME);
    }

    @JsonIgnore
    public PSSysSFPubDTO docpssfstylename(String docPSSFStyleName) {
        this.setDocPSSFStyleName(docPSSFStyleName);
        return this;
    }

    @JsonProperty(value="dynamodelmode")
    public void setDynaModelMode(String dynaModelMode) {
        this._set(DTOFIELD_DYNAMODELMODE, dynaModelMode);
    }

    @JsonIgnore
    public String getDynaModelMode() {
        Object objValue = this._get(DTOFIELD_DYNAMODELMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaModelModeDirty() {
        return this._contains(DTOFIELD_DYNAMODELMODE);
    }

    @JsonIgnore
    public void resetDynaModelMode() {
        this._reset(DTOFIELD_DYNAMODELMODE);
    }

    @JsonIgnore
    public PSSysSFPubDTO dynamodelmode(String dynaModelMode) {
        this.setDynaModelMode(dynaModelMode);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO dynamodelmode(PSModelEnums.SFPubDynaModelMode dynaModelMode) {
        if (dynaModelMode == null) {
            this.setDynaModelMode(null);
        } else {
            this.setDynaModelMode(dynaModelMode.value);
        }
        return this;
    }

    @JsonProperty(value="globaltsflag")
    public void setGlobalTSFlag(Integer globalTSFlag) {
        this._set(DTOFIELD_GLOBALTSFLAG, globalTSFlag);
    }

    @JsonIgnore
    public Integer getGlobalTSFlag() {
        Object objValue = this._get(DTOFIELD_GLOBALTSFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGlobalTSFlagDirty() {
        return this._contains(DTOFIELD_GLOBALTSFLAG);
    }

    @JsonIgnore
    public void resetGlobalTSFlag() {
        this._reset(DTOFIELD_GLOBALTSFLAG);
    }

    @JsonIgnore
    public PSSysSFPubDTO globaltsflag(Integer globalTSFlag) {
        this.setGlobalTSFlag(globalTSFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO globaltsflag(Boolean globalTSFlag) {
        if (globalTSFlag == null) {
            this.setGlobalTSFlag(null);
        } else {
            this.setGlobalTSFlag(globalTSFlag != false ? 1 : 0);
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
    public PSSysSFPubDTO memo(String memo) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pkgcodename(String pKGCodeName) {
        this.setPKGCodeName(pKGCodeName);
        return this;
    }

    @JsonProperty(value="ppssyssfpubid")
    public void setPPSSysSFPubId(String pPSSysSFPubId) {
        this._set(DTOFIELD_PPSSYSSFPUBID, pPSSysSFPubId);
    }

    @JsonIgnore
    public String getPPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PPSSYSSFPUBID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysSFPubIdDirty() {
        return this._contains(DTOFIELD_PPSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPPSSysSFPubId() {
        this._reset(DTOFIELD_PPSSYSSFPUBID);
    }

    @JsonIgnore
    public PSSysSFPubDTO ppssyssfpubid(String pPSSysSFPubId) {
        this.setPPSSysSFPubId(pPSSysSFPubId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO ppssyssfpubid(PSSysSFPubDTO pSSysSFPub) {
        if (pSSysSFPub == null) {
            this.setPPSSysSFPubId(null);
            this.setPPSSysSFPubName(null);
        } else {
            this.setPPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    @JsonProperty(value="ppssyssfpubname")
    public void setPPSSysSFPubName(String pPSSysSFPubName) {
        this._set(DTOFIELD_PPSSYSSFPUBNAME, pPSSysSFPubName);
    }

    @JsonIgnore
    public String getPPSSysSFPubName() {
        Object objValue = this._get(DTOFIELD_PPSSYSSFPUBNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysSFPubNameDirty() {
        return this._contains(DTOFIELD_PPSSYSSFPUBNAME);
    }

    @JsonIgnore
    public void resetPPSSysSFPubName() {
        this._reset(DTOFIELD_PPSSYSSFPUBNAME);
    }

    @JsonIgnore
    public PSSysSFPubDTO ppssyssfpubname(String pPSSysSFPubName) {
        this.setPPSSysSFPubName(pPSSysSFPubName);
        return this;
    }

    @JsonProperty(value="pssfstyleid")
    public void setPSSFStyleId(String pSSFStyleId) {
        this._set(DTOFIELD_PSSFSTYLEID, pSSFStyleId);
    }

    @JsonIgnore
    public String getPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO pssfstyleid(PSSFStyleDTO pSSFStyle) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssfstylename(String pSSFStyleName) {
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    @JsonProperty(value="pssfstyleparamid")
    public void setPSSFStyleParamId(String pSSFStyleParamId) {
        this._set(DTOFIELD_PSSFSTYLEPARAMID, pSSFStyleParamId);
    }

    @JsonIgnore
    public String getPSSFStyleParamId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleParamIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEPARAMID);
    }

    @JsonIgnore
    public void resetPSSFStyleParamId() {
        this._reset(DTOFIELD_PSSFSTYLEPARAMID);
    }

    @JsonIgnore
    public PSSysSFPubDTO pssfstyleparamid(String pSSFStyleParamId) {
        this.setPSSFStyleParamId(pSSFStyleParamId);
        return this;
    }

    @JsonProperty(value="pssfstyleparamname")
    public void setPSSFStyleParamName(String pSSFStyleParamName) {
        this._set(DTOFIELD_PSSFSTYLEPARAMNAME, pSSFStyleParamName);
    }

    @JsonIgnore
    public String getPSSFStyleParamName() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleParamNameDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEPARAMNAME);
    }

    @JsonIgnore
    public void resetPSSFStyleParamName() {
        this._reset(DTOFIELD_PSSFSTYLEPARAMNAME);
    }

    @JsonIgnore
    public PSSysSFPubDTO pssfstyleparamname(String pSSFStyleParamName) {
        this.setPSSFStyleParamName(pSSFStyleParamName);
        return this;
    }

    @JsonProperty(value="pssfstyleverid")
    public void setPSSFStyleVerId(String pSSFStyleVerId) {
        this._set(DTOFIELD_PSSFSTYLEVERID, pSSFStyleVerId);
    }

    @JsonIgnore
    public String getPSSFStyleVerId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEVERID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssfstyleverid(String pSSFStyleVerId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssfstylevername(String pSSFStyleVerName) {
        this.setPSSFStyleVerName(pSSFStyleVerName);
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
    public PSSysSFPubDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysSFPubDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyssfpubid")
    public void setPSSysSFPubId(String pSSysSFPubId) {
        this._set(DTOFIELD_PSSYSSFPUBID, pSSysSFPubId);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssyssfpubid(String pSSysSFPubId) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pssyssfpubname(String pSSysSFPubName) {
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSFPubName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSFPubName(strName);
    }

    @JsonIgnore
    public PSSysSFPubDTO name(String strName) {
        this.setPSSysSFPubName(strName);
        return this;
    }

    @JsonProperty(value="pubfolder")
    public void setPubFolder(String pubFolder) {
        this._set(DTOFIELD_PUBFOLDER, pubFolder);
    }

    @JsonIgnore
    public String getPubFolder() {
        Object objValue = this._get(DTOFIELD_PUBFOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPubFolderDirty() {
        return this._contains(DTOFIELD_PUBFOLDER);
    }

    @JsonIgnore
    public void resetPubFolder() {
        this._reset(DTOFIELD_PUBFOLDER);
    }

    @JsonIgnore
    public PSSysSFPubDTO pubfolder(String pubFolder) {
        this.setPubFolder(pubFolder);
        return this;
    }

    @JsonProperty(value="pubtag")
    public void setPubTag(String pubTag) {
        this._set(DTOFIELD_PUBTAG, pubTag);
    }

    @JsonIgnore
    public String getPubTag() {
        Object objValue = this._get(DTOFIELD_PUBTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pubtag(String pubTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pubtag2(String pubTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pubtag3(String pubTag3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysSFPubDTO pubtag4(String pubTag4) {
        this.setPubTag4(pubTag4);
        return this;
    }

    @JsonProperty(value="removeflag")
    public void setRemoveFlag(Integer removeFlag) {
        this._set(DTOFIELD_REMOVEFLAG, removeFlag);
    }

    @JsonIgnore
    public Integer getRemoveFlag() {
        Object objValue = this._get(DTOFIELD_REMOVEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRemoveFlagDirty() {
        return this._contains(DTOFIELD_REMOVEFLAG);
    }

    @JsonIgnore
    public void resetRemoveFlag() {
        this._reset(DTOFIELD_REMOVEFLAG);
    }

    @JsonIgnore
    public PSSysSFPubDTO removeflag(Integer removeFlag) {
        this.setRemoveFlag(removeFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO removeflag(PSModelEnums.ModelRemoveMode removeFlag) {
        if (removeFlag == null) {
            this.setRemoveFlag(null);
        } else {
            this.setRemoveFlag(removeFlag.value);
        }
        return this;
    }

    @JsonProperty(value="styleparams")
    public void setStyleParams(String styleParams) {
        this._set(DTOFIELD_STYLEPARAMS, styleParams);
    }

    @JsonIgnore
    public String getStyleParams() {
        Object objValue = this._get(DTOFIELD_STYLEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleParamsDirty() {
        return this._contains(DTOFIELD_STYLEPARAMS);
    }

    @JsonIgnore
    public void resetStyleParams() {
        this._reset(DTOFIELD_STYLEPARAMS);
    }

    @JsonIgnore
    public PSSysSFPubDTO styleparams(String styleParams) {
        this.setStyleParams(styleParams);
        return this;
    }

    @JsonProperty(value="subsyspkgflag")
    public void setSubSysPkgFlag(Integer subSysPkgFlag) {
        this._set(DTOFIELD_SUBSYSPKGFLAG, subSysPkgFlag);
    }

    @JsonIgnore
    public Integer getSubSysPkgFlag() {
        Object objValue = this._get(DTOFIELD_SUBSYSPKGFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSubSysPkgFlagDirty() {
        return this._contains(DTOFIELD_SUBSYSPKGFLAG);
    }

    @JsonIgnore
    public void resetSubSysPkgFlag() {
        this._reset(DTOFIELD_SUBSYSPKGFLAG);
    }

    @JsonIgnore
    public PSSysSFPubDTO subsyspkgflag(Integer subSysPkgFlag) {
        this.setSubSysPkgFlag(subSysPkgFlag);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO subsyspkgflag(Boolean subSysPkgFlag) {
        if (subSysPkgFlag == null) {
            this.setSubSysPkgFlag(null);
        } else {
            this.setSubSysPkgFlag(subSysPkgFlag != false ? 1 : 0);
        }
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
    public PSSysSFPubDTO updatedate(Timestamp updateDate) {
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
    public PSSysSFPubDTO updateman(String updateMan) {
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
    public PSSysSFPubDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysSFPubDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysSFPubDTO usertag(String userTag) {
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
    public PSSysSFPubDTO usertag2(String userTag2) {
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
    public PSSysSFPubDTO usertag3(String userTag3) {
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
    public PSSysSFPubDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="verstr")
    public void setVerStr(String verStr) {
        this._set(DTOFIELD_VERSTR, verStr);
    }

    @JsonIgnore
    public String getVerStr() {
        Object objValue = this._get(DTOFIELD_VERSTR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVerStrDirty() {
        return this._contains(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public void resetVerStr() {
        this._reset(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public PSSysSFPubDTO verstr(String verStr) {
        this.setVerStr(verStr);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSFPubId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSFPubId(strValue);
    }

    @JsonIgnore
    public PSSysSFPubDTO id(String strValue) {
        this.setPSSysSFPubId(strValue);
        return this;
    }
}
