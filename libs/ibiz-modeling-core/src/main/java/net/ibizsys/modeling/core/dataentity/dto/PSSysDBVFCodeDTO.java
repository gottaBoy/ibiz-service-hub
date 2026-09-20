package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBVFCodeDTO
extends PSModelDTOBase {
    public static final String FIELD_CALLCODE = "CALLCODE";
    protected static final String DTOFIELD_CALLCODE = "callcode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBTYPE = "DBTYPE";
    protected static final String DTOFIELD_DBTYPE = "dbtype";
    public static final String FIELD_FUNCCODE = "FUNCCODE";
    protected static final String DTOFIELD_FUNCCODE = "funccode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSDBVFCODEID = "PSSYSDBVFCODEID";
    protected static final String DTOFIELD_PSSYSDBVFCODEID = "pssysdbvfcodeid";
    public static final String FIELD_PSSYSDBVFCODENAME = "PSSYSDBVFCODENAME";
    protected static final String DTOFIELD_PSSYSDBVFCODENAME = "pssysdbvfcodename";
    public static final String FIELD_PSSYSDBVFID = "PSSYSDBVFID";
    protected static final String DTOFIELD_PSSYSDBVFID = "pssysdbvfid";
    public static final String FIELD_PSSYSDBVFNAME = "PSSYSDBVFNAME";
    protected static final String DTOFIELD_PSSYSDBVFNAME = "pssysdbvfname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="callcode")
    public void setCallCode(String callCode) {
        this._set(DTOFIELD_CALLCODE, callCode);
    }

    @JsonIgnore
    public String getCallCode() {
        Object objValue = this._get(DTOFIELD_CALLCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallCodeDirty() {
        return this._contains(DTOFIELD_CALLCODE);
    }

    @JsonIgnore
    public void resetCallCode() {
        this._reset(DTOFIELD_CALLCODE);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO callcode(String callCode) {
        this.setCallCode(callCode);
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
    public PSSysDBVFCodeDTO createdate(Timestamp createDate) {
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
    public PSSysDBVFCodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbtype")
    public void setDBType(String dBType) {
        this._set(DTOFIELD_DBTYPE, dBType);
    }

    @JsonIgnore
    public String getDBType() {
        Object objValue = this._get(DTOFIELD_DBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypeDirty() {
        return this._contains(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public void resetDBType() {
        this._reset(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO dbtype(String dBType) {
        this.setDBType(dBType);
        return this;
    }

    @JsonProperty(value="funccode")
    public void setFuncCode(String funcCode) {
        this._set(DTOFIELD_FUNCCODE, funcCode);
    }

    @JsonIgnore
    public String getFuncCode() {
        Object objValue = this._get(DTOFIELD_FUNCCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncCodeDirty() {
        return this._contains(DTOFIELD_FUNCCODE);
    }

    @JsonIgnore
    public void resetFuncCode() {
        this._reset(DTOFIELD_FUNCCODE);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO funccode(String funcCode) {
        this.setFuncCode(funcCode);
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
    public PSSysDBVFCodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysdbvfcodeid")
    public void setPSSysDBVFCodeId(String pSSysDBVFCodeId) {
        this._set(DTOFIELD_PSSYSDBVFCODEID, pSSysDBVFCodeId);
    }

    @JsonIgnore
    public String getPSSysDBVFCodeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFCODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFCodeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFCODEID);
    }

    @JsonIgnore
    public void resetPSSysDBVFCodeId() {
        this._reset(DTOFIELD_PSSYSDBVFCODEID);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO pssysdbvfcodeid(String pSSysDBVFCodeId) {
        this.setPSSysDBVFCodeId(pSSysDBVFCodeId);
        return this;
    }

    @JsonProperty(value="pssysdbvfcodename")
    public void setPSSysDBVFCodeName(String pSSysDBVFCodeName) {
        this._set(DTOFIELD_PSSYSDBVFCODENAME, pSSysDBVFCodeName);
    }

    @JsonIgnore
    public String getPSSysDBVFCodeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFCodeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFCODENAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFCodeName() {
        this._reset(DTOFIELD_PSSYSDBVFCODENAME);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO pssysdbvfcodename(String pSSysDBVFCodeName) {
        this.setPSSysDBVFCodeName(pSSysDBVFCodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBVFCodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBVFCodeName(strName);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO name(String strName) {
        this.setPSSysDBVFCodeName(strName);
        return this;
    }

    @JsonProperty(value="pssysdbvfid")
    public void setPSSysDBVFId(String pSSysDBVFId) {
        this._set(DTOFIELD_PSSYSDBVFID, pSSysDBVFId);
    }

    @JsonIgnore
    public String getPSSysDBVFId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public void resetPSSysDBVFId() {
        this._reset(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO pssysdbvfid(String pSSysDBVFId) {
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO pssysdbvfid(PSSysDBVFDTO pSSysDBVF) {
        if (pSSysDBVF == null) {
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        } else {
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbvfname")
    public void setPSSysDBVFName(String pSSysDBVFName) {
        this._set(DTOFIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }

    @JsonIgnore
    public String getPSSysDBVFName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFName() {
        this._reset(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO pssysdbvfname(String pSSysDBVFName) {
        this.setPSSysDBVFName(pSSysDBVFName);
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
    public PSSysDBVFCodeDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBVFCodeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBVFCodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBVFCodeId(strValue);
    }

    @JsonIgnore
    public PSSysDBVFCodeDTO id(String strValue) {
        this.setPSSysDBVFCodeId(strValue);
        return this;
    }
}
