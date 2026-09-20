package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgTemplDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysWFSettingDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSWFSETTINGID = "PSSYSWFSETTINGID";
    protected static final String DTOFIELD_PSSYSWFSETTINGID = "pssyswfsettingid";
    public static final String FIELD_PSSYSWFSETTINGNAME = "PSSYSWFSETTINGNAME";
    protected static final String DTOFIELD_PSSYSWFSETTINGNAME = "pssyswfsettingname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";

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
    public PSSysWFSettingDTO codename(String codeName) {
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
    public PSSysWFSettingDTO createdate(Timestamp createDate) {
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
    public PSSysWFSettingDTO createman(String createMan) {
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
    public PSSysWFSettingDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSSysWFSettingDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSSysWFSettingDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSSysWFSettingDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="pssyswfsettingid")
    public void setPSSysWFSettingId(String pSSysWFSettingId) {
        this._set(DTOFIELD_PSSYSWFSETTINGID, pSSysWFSettingId);
    }

    @JsonIgnore
    public String getPSSysWFSettingId() {
        Object objValue = this._get(DTOFIELD_PSSYSWFSETTINGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFSettingIdDirty() {
        return this._contains(DTOFIELD_PSSYSWFSETTINGID);
    }

    @JsonIgnore
    public void resetPSSysWFSettingId() {
        this._reset(DTOFIELD_PSSYSWFSETTINGID);
    }

    @JsonIgnore
    public PSSysWFSettingDTO pssyswfsettingid(String pSSysWFSettingId) {
        this.setPSSysWFSettingId(pSSysWFSettingId);
        return this;
    }

    @JsonProperty(value="pssyswfsettingname")
    public void setPSSysWFSettingName(String pSSysWFSettingName) {
        this._set(DTOFIELD_PSSYSWFSETTINGNAME, pSSysWFSettingName);
    }

    @JsonIgnore
    public String getPSSysWFSettingName() {
        Object objValue = this._get(DTOFIELD_PSSYSWFSETTINGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysWFSettingNameDirty() {
        return this._contains(DTOFIELD_PSSYSWFSETTINGNAME);
    }

    @JsonIgnore
    public void resetPSSysWFSettingName() {
        this._reset(DTOFIELD_PSSYSWFSETTINGNAME);
    }

    @JsonIgnore
    public PSSysWFSettingDTO pssyswfsettingname(String pSSysWFSettingName) {
        this.setPSSysWFSettingName(pSSysWFSettingName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysWFSettingName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysWFSettingName(strName);
    }

    @JsonIgnore
    public PSSysWFSettingDTO name(String strName) {
        this.setPSSysWFSettingName(strName);
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
    public PSSysWFSettingDTO updatedate(Timestamp updateDate) {
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
    public PSSysWFSettingDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSSysWFSettingDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysWFSettingId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysWFSettingId(strValue);
    }

    @JsonIgnore
    public PSSysWFSettingDTO id(String strValue) {
        this.setPSSysWFSettingId(strValue);
        return this;
    }
}
