package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDCCodeSnippetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFStyleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCodeSnippetDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODEREFMODE = "CODEREFMODE";
    protected static final String DTOFIELD_CODEREFMODE = "coderefmode";
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
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFSTYLEID = "PSPFSTYLEID";
    protected static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    public static final String FIELD_PSPFSTYLENAME = "PSPFSTYLENAME";
    protected static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSFSTYLENAME = "PSSFSTYLENAME";
    protected static final String DTOFIELD_PSSFSTYLENAME = "pssfstylename";
    public static final String FIELD_PSSYSCODESNIPPETID = "PSSYSCODESNIPPETID";
    protected static final String DTOFIELD_PSSYSCODESNIPPETID = "pssyscodesnippetid";
    public static final String FIELD_PSSYSCODESNIPPETNAME = "PSSYSCODESNIPPETNAME";
    protected static final String DTOFIELD_PSSYSCODESNIPPETNAME = "pssyscodesnippetname";
    public static final String FIELD_TEMPLTYPE = "TEMPLTYPE";
    protected static final String DTOFIELD_TEMPLTYPE = "templtype";
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
    public PSSysCodeSnippetDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="coderefmode")
    public void setCodeRefMode(String codeRefMode) {
        this._set(DTOFIELD_CODEREFMODE, codeRefMode);
    }

    @JsonIgnore
    public String getCodeRefMode() {
        Object objValue = this._get(DTOFIELD_CODEREFMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeRefModeDirty() {
        return this._contains(DTOFIELD_CODEREFMODE);
    }

    @JsonIgnore
    public void resetCodeRefMode() {
        this._reset(DTOFIELD_CODEREFMODE);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO coderefmode(String codeRefMode) {
        this.setCodeRefMode(codeRefMode);
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
    public PSSysCodeSnippetDTO createdate(Timestamp createDate) {
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
    public PSSysCodeSnippetDTO createman(String createMan) {
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
    public PSSysCodeSnippetDTO memo(String memo) {
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
    public PSSysCodeSnippetDTO psdccodesnippetid(String pSDCCodeSnippetId) {
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO psdccodesnippetid(PSDCCodeSnippetDTO pSDCCodeSnippet) {
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
    public PSSysCodeSnippetDTO psdccodesnippetname(String pSDCCodeSnippetName) {
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pspfstyleid")
    public void setPSPFStyleId(String pSPFStyleId) {
        this._set(DTOFIELD_PSPFSTYLEID, pSPFStyleId);
    }

    @JsonIgnore
    public String getPSPFStyleId() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleIdDirty() {
        return this._contains(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public void resetPSPFStyleId() {
        this._reset(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfstyleid(String pSPFStyleId) {
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfstyleid(PSPFStyleDTO pSPFStyle) {
        if (pSPFStyle == null) {
            this.setPSPFStyleId(null);
            this.setPSPFStyleName(null);
        } else {
            this.setPSPFStyleId(pSPFStyle.getPSPFStyleId());
            this.setPSPFStyleName(pSPFStyle.getPSPFStyleName());
        }
        return this;
    }

    @JsonProperty(value="pspfstylename")
    public void setPSPFStyleName(String pSPFStyleName) {
        this._set(DTOFIELD_PSPFSTYLENAME, pSPFStyleName);
    }

    @JsonIgnore
    public String getPSPFStyleName() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleNameDirty() {
        return this._contains(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSPFStyleName() {
        this._reset(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pspfstylename(String pSPFStyleName) {
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
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
    public PSSysCodeSnippetDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssfstyleid(PSSFStyleDTO pSSFStyle) {
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
    public PSSysCodeSnippetDTO pssfstylename(String pSSFStyleName) {
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    @JsonProperty(value="pssyscodesnippetid")
    public void setPSSysCodeSnippetId(String pSSysCodeSnippetId) {
        this._set(DTOFIELD_PSSYSCODESNIPPETID, pSSysCodeSnippetId);
    }

    @JsonIgnore
    public String getPSSysCodeSnippetId() {
        Object objValue = this._get(DTOFIELD_PSSYSCODESNIPPETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCodeSnippetIdDirty() {
        return this._contains(DTOFIELD_PSSYSCODESNIPPETID);
    }

    @JsonIgnore
    public void resetPSSysCodeSnippetId() {
        this._reset(DTOFIELD_PSSYSCODESNIPPETID);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssyscodesnippetid(String pSSysCodeSnippetId) {
        this.setPSSysCodeSnippetId(pSSysCodeSnippetId);
        return this;
    }

    @JsonProperty(value="pssyscodesnippetname")
    public void setPSSysCodeSnippetName(String pSSysCodeSnippetName) {
        this._set(DTOFIELD_PSSYSCODESNIPPETNAME, pSSysCodeSnippetName);
    }

    @JsonIgnore
    public String getPSSysCodeSnippetName() {
        Object objValue = this._get(DTOFIELD_PSSYSCODESNIPPETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCodeSnippetNameDirty() {
        return this._contains(DTOFIELD_PSSYSCODESNIPPETNAME);
    }

    @JsonIgnore
    public void resetPSSysCodeSnippetName() {
        this._reset(DTOFIELD_PSSYSCODESNIPPETNAME);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO pssyscodesnippetname(String pSSysCodeSnippetName) {
        this.setPSSysCodeSnippetName(pSSysCodeSnippetName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCodeSnippetName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCodeSnippetName(strName);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO name(String strName) {
        this.setPSSysCodeSnippetName(strName);
        return this;
    }

    @JsonProperty(value="templtype")
    public void setTemplType(String templType) {
        this._set(DTOFIELD_TEMPLTYPE, templType);
    }

    @JsonIgnore
    public String getTemplType() {
        Object objValue = this._get(DTOFIELD_TEMPLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplTypeDirty() {
        return this._contains(DTOFIELD_TEMPLTYPE);
    }

    @JsonIgnore
    public void resetTemplType() {
        this._reset(DTOFIELD_TEMPLTYPE);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO templtype(String templType) {
        this.setTemplType(templType);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO templtype(PSModelEnums.SnippetTemplType templType) {
        if (templType == null) {
            this.setTemplType(null);
        } else {
            this.setTemplType(templType.value);
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
    public PSSysCodeSnippetDTO updatedate(Timestamp updateDate) {
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
    public PSSysCodeSnippetDTO updateman(String updateMan) {
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
    public PSSysCodeSnippetDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysCodeSnippetDTO usertag(String userTag) {
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
    public PSSysCodeSnippetDTO usertag2(String userTag2) {
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
    public PSSysCodeSnippetDTO usertag3(String userTag3) {
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
    public PSSysCodeSnippetDTO usertag4(String userTag4) {
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
    public PSSysCodeSnippetDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCodeSnippetId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCodeSnippetId(strValue);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO id(String strValue) {
        this.setPSSysCodeSnippetId(strValue);
        return this;
    }
}
