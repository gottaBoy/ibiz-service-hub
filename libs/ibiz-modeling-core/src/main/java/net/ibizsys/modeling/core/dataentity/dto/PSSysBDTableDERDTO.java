package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDTableDERDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DERLEVEL = "DERLEVEL";
    protected static final String DTOFIELD_DERLEVEL = "derlevel";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSSYSBDTABLEDERID = "PSSYSBDTABLEDERID";
    protected static final String DTOFIELD_PSSYSBDTABLEDERID = "pssysbdtablederid";
    public static final String FIELD_PSSYSBDTABLEDERNAME = "PSSYSBDTABLEDERNAME";
    protected static final String DTOFIELD_PSSYSBDTABLEDERNAME = "pssysbdtabledername";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
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
    public PSSysBDTableDERDTO createdate(Timestamp createDate) {
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
    public PSSysBDTableDERDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="derlevel")
    public void setDERLevel(Integer dERLevel) {
        this._set(DTOFIELD_DERLEVEL, dERLevel);
    }

    @JsonIgnore
    public Integer getDERLevel() {
        Object objValue = this._get(DTOFIELD_DERLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDERLevelDirty() {
        return this._contains(DTOFIELD_DERLEVEL);
    }

    @JsonIgnore
    public void resetDERLevel() {
        this._reset(DTOFIELD_DERLEVEL);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO derlevel(Integer dERLevel) {
        this.setDERLevel(dERLevel);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDERDTO derlevel(PSModelEnums.BDTableDERLevel dERLevel) {
        if (dERLevel == null) {
            this.setDERLevel(null);
        } else {
            this.setDERLevel(dERLevel.value);
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
    public PSSysBDTableDERDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDERDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="pssysbdtablederid")
    public void setPSSysBDTableDERId(String pSSysBDTableDERId) {
        this._set(DTOFIELD_PSSYSBDTABLEDERID, pSSysBDTableDERId);
    }

    @JsonIgnore
    public String getPSSysBDTableDERId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableDERIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEDERID);
    }

    @JsonIgnore
    public void resetPSSysBDTableDERId() {
        this._reset(DTOFIELD_PSSYSBDTABLEDERID);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtablederid(String pSSysBDTableDERId) {
        this.setPSSysBDTableDERId(pSSysBDTableDERId);
        return this;
    }

    @JsonProperty(value="pssysbdtabledername")
    public void setPSSysBDTableDERName(String pSSysBDTableDERName) {
        this._set(DTOFIELD_PSSYSBDTABLEDERNAME, pSSysBDTableDERName);
    }

    @JsonIgnore
    public String getPSSysBDTableDERName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableDERNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEDERNAME);
    }

    @JsonIgnore
    public void resetPSSysBDTableDERName() {
        this._reset(DTOFIELD_PSSYSBDTABLEDERNAME);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtabledername(String pSSysBDTableDERName) {
        this.setPSSysBDTableDERName(pSSysBDTableDERName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDTableDERName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDTableDERName(strName);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO name(String strName) {
        this.setPSSysBDTableDERName(strName);
        return this;
    }

    @JsonProperty(value="pssysbdtableid")
    public void setPSSysBDTableId(String pSSysBDTableId) {
        this._set(DTOFIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }

    @JsonIgnore
    public String getPSSysBDTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEID);
    }

    @JsonIgnore
    public void resetPSSysBDTableId() {
        this._reset(DTOFIELD_PSSYSBDTABLEID);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
        if (pSSysBDTable == null) {
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        } else {
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdtablename")
    public void setPSSysBDTableName(String pSSysBDTableName) {
        this._set(DTOFIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }

    @JsonIgnore
    public String getPSSysBDTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysBDTableName() {
        this._reset(DTOFIELD_PSSYSBDTABLENAME);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
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
    public PSSysBDTableDERDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDTableDERDTO updateman(String updateMan) {
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
    public PSSysBDTableDERDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDERDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDTableDERDTO usertag(String userTag) {
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
    public PSSysBDTableDERDTO usertag2(String userTag2) {
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
    public PSSysBDTableDERDTO usertag3(String userTag3) {
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
    public PSSysBDTableDERDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDTableDERId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDTableDERId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO id(String strValue) {
        this.setPSSysBDTableDERId(strValue);
        return this;
    }
}
