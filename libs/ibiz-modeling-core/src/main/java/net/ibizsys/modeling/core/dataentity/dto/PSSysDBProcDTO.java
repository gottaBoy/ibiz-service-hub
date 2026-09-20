package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBProcDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PROCDESC = "PROCDESC";
    protected static final String DTOFIELD_PROCDESC = "procdesc";
    public static final String FIELD_PSSYSDBPROCID = "PSSYSDBPROCID";
    protected static final String DTOFIELD_PSSYSDBPROCID = "pssysdbprocid";
    public static final String FIELD_PSSYSDBPROCNAME = "PSSYSDBPROCNAME";
    protected static final String DTOFIELD_PSSYSDBPROCNAME = "pssysdbprocname";
    public static final String FIELD_PSSYSDBSCHEMEID = "PSSYSDBSCHEMEID";
    protected static final String DTOFIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";
    public static final String FIELD_PSSYSDBSCHEMENAME = "PSSYSDBSCHEMENAME";
    protected static final String DTOFIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";
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
    public PSSysDBProcDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSSysDBProcDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
    public PSSysDBProcDTO createdate(Timestamp createDate) {
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
    public PSSysDBProcDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSSysDBProcDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSSysDBProcDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="procdesc")
    public void setProcDesc(String procDesc) {
        this._set(DTOFIELD_PROCDESC, procDesc);
    }

    @JsonIgnore
    public String getProcDesc() {
        Object objValue = this._get(DTOFIELD_PROCDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProcDescDirty() {
        return this._contains(DTOFIELD_PROCDESC);
    }

    @JsonIgnore
    public void resetProcDesc() {
        this._reset(DTOFIELD_PROCDESC);
    }

    @JsonIgnore
    public PSSysDBProcDTO procdesc(String procDesc) {
        this.setProcDesc(procDesc);
        return this;
    }

    @JsonProperty(value="pssysdbprocid")
    public void setPSSysDBProcId(String pSSysDBProcId) {
        this._set(DTOFIELD_PSSYSDBPROCID, pSSysDBProcId);
    }

    @JsonIgnore
    public String getPSSysDBProcId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCID);
    }

    @JsonIgnore
    public void resetPSSysDBProcId() {
        this._reset(DTOFIELD_PSSYSDBPROCID);
    }

    @JsonIgnore
    public PSSysDBProcDTO pssysdbprocid(String pSSysDBProcId) {
        this.setPSSysDBProcId(pSSysDBProcId);
        return this;
    }

    @JsonProperty(value="pssysdbprocname")
    public void setPSSysDBProcName(String pSSysDBProcName) {
        this._set(DTOFIELD_PSSYSDBPROCNAME, pSSysDBProcName);
    }

    @JsonIgnore
    public String getPSSysDBProcName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCNAME);
    }

    @JsonIgnore
    public void resetPSSysDBProcName() {
        this._reset(DTOFIELD_PSSYSDBPROCNAME);
    }

    @JsonIgnore
    public PSSysDBProcDTO pssysdbprocname(String pSSysDBProcName) {
        this.setPSSysDBProcName(pSSysDBProcName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBProcName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBProcName(strName);
    }

    @JsonIgnore
    public PSSysDBProcDTO name(String strName) {
        this.setPSSysDBProcName(strName);
        return this;
    }

    @JsonProperty(value="pssysdbschemeid")
    public void setPSSysDBSchemeId(String pSSysDBSchemeId) {
        this._set(DTOFIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }

    @JsonIgnore
    public String getPSSysDBSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeId() {
        this._reset(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public PSSysDBProcDTO pssysdbschemeid(String pSSysDBSchemeId) {
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcDTO pssysdbschemeid(PSSysDBSchemeDTO pSSysDBScheme) {
        if (pSSysDBScheme == null) {
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        } else {
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbschemename")
    public void setPSSysDBSchemeName(String pSSysDBSchemeName) {
        this._set(DTOFIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }

    @JsonIgnore
    public String getPSSysDBSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeName() {
        this._reset(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public PSSysDBProcDTO pssysdbschemename(String pSSysDBSchemeName) {
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
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
    public PSSysDBProcDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBProcDTO updateman(String updateMan) {
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
    public PSSysDBProcDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysDBProcDTO usertag(String userTag) {
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
    public PSSysDBProcDTO usertag2(String userTag2) {
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
    public PSSysDBProcDTO usertag3(String userTag3) {
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
    public PSSysDBProcDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBProcId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBProcId(strValue);
    }

    @JsonIgnore
    public PSSysDBProcDTO id(String strValue) {
        this.setPSSysDBProcId(strValue);
        return this;
    }
}
