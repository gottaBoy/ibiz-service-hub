package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDColSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDTableDEDTO
extends PSModelDTOBase {
    public static final String FIELD_ADDCOLMODE = "ADDCOLMODE";
    protected static final String DTOFIELD_ADDCOLMODE = "addcolmode";
    public static final String FIELD_COLFILTER = "COLFILTER";
    protected static final String DTOFIELD_COLFILTER = "colfilter";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBDCOLSETID = "PSSYSBDCOLSETID";
    protected static final String DTOFIELD_PSSYSBDCOLSETID = "pssysbdcolsetid";
    public static final String FIELD_PSSYSBDCOLSETNAME = "PSSYSBDCOLSETNAME";
    protected static final String DTOFIELD_PSSYSBDCOLSETNAME = "pssysbdcolsetname";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDTABLEDEID = "PSSYSBDTABLEDEID";
    protected static final String DTOFIELD_PSSYSBDTABLEDEID = "pssysbdtabledeid";
    public static final String FIELD_PSSYSBDTABLEDENAME = "PSSYSBDTABLEDENAME";
    protected static final String DTOFIELD_PSSYSBDTABLEDENAME = "pssysbdtabledename";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
    public static final String FIELD_ROWKEYFORMAT = "ROWKEYFORMAT";
    protected static final String DTOFIELD_ROWKEYFORMAT = "rowkeyformat";
    public static final String FIELD_ROWKEYPARAMS = "ROWKEYPARAMS";
    protected static final String DTOFIELD_ROWKEYPARAMS = "rowkeyparams";
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

    @JsonProperty(value="addcolmode")
    public void setAddColMode(Integer addColMode) {
        this._set(DTOFIELD_ADDCOLMODE, addColMode);
    }

    @JsonIgnore
    public Integer getAddColMode() {
        Object objValue = this._get(DTOFIELD_ADDCOLMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAddColModeDirty() {
        return this._contains(DTOFIELD_ADDCOLMODE);
    }

    @JsonIgnore
    public void resetAddColMode() {
        this._reset(DTOFIELD_ADDCOLMODE);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO addcolmode(Integer addColMode) {
        this.setAddColMode(addColMode);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO addcolmode(PSModelEnums.BDTableColMode addColMode) {
        if (addColMode == null) {
            this.setAddColMode(null);
        } else {
            this.setAddColMode(addColMode.value);
        }
        return this;
    }

    @JsonProperty(value="colfilter")
    public void setColFilter(String colFilter) {
        this._set(DTOFIELD_COLFILTER, colFilter);
    }

    @JsonIgnore
    public String getColFilter() {
        Object objValue = this._get(DTOFIELD_COLFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColFilterDirty() {
        return this._contains(DTOFIELD_COLFILTER);
    }

    @JsonIgnore
    public void resetColFilter() {
        this._reset(DTOFIELD_COLFILTER);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO colfilter(String colFilter) {
        this.setColFilter(colFilter);
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
    public PSSysBDTableDEDTO createdate(Timestamp createDate) {
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
    public PSSysBDTableDEDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO defaultflag(PSModelEnums.DEBDTableType defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag.value);
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
    public PSSysBDTableDEDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdeid")
    public void setPSDEId(String pSDEId) {
        this._set(DTOFIELD_PSDEID, pSDEId);
    }

    @JsonIgnore
    public String getPSDEId() {
        Object objValue = this._get(DTOFIELD_PSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEIdDirty() {
        return this._contains(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public void resetPSDEId() {
        this._reset(DTOFIELD_PSDEID);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysbdcolsetid")
    public void setPSSysBDColSetId(String pSSysBDColSetId) {
        this._set(DTOFIELD_PSSYSBDCOLSETID, pSSysBDColSetId);
    }

    @JsonIgnore
    public String getPSSysBDColSetId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDCOLSETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDColSetIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDCOLSETID);
    }

    @JsonIgnore
    public void resetPSSysBDColSetId() {
        this._reset(DTOFIELD_PSSYSBDCOLSETID);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdcolsetid(String pSSysBDColSetId) {
        this.setPSSysBDColSetId(pSSysBDColSetId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdcolsetid(PSSysBDColSetDTO pSSysBDColSet) {
        if (pSSysBDColSet == null) {
            this.setPSSysBDColSetId(null);
            this.setPSSysBDColSetName(null);
        } else {
            this.setPSSysBDColSetId(pSSysBDColSet.getPSSysBDColSetId());
            this.setPSSysBDColSetName(pSSysBDColSet.getPSSysBDColSetName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdcolsetname")
    public void setPSSysBDColSetName(String pSSysBDColSetName) {
        this._set(DTOFIELD_PSSYSBDCOLSETNAME, pSSysBDColSetName);
    }

    @JsonIgnore
    public String getPSSysBDColSetName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDCOLSETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDColSetNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDCOLSETNAME);
    }

    @JsonIgnore
    public void resetPSSysBDColSetName() {
        this._reset(DTOFIELD_PSSYSBDCOLSETNAME);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdcolsetname(String pSSysBDColSetName) {
        this.setPSSysBDColSetName(pSSysBDColSetName);
        return this;
    }

    @JsonProperty(value="pssysbdschemeid")
    public void setPSSysBDSchemeId(String pSSysBDSchemeId) {
        this._set(DTOFIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }

    @JsonIgnore
    public String getPSSysBDSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeId() {
        this._reset(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonProperty(value="pssysbdtabledeid")
    public void setPSSysBDTableDEId(String pSSysBDTableDEId) {
        this._set(DTOFIELD_PSSYSBDTABLEDEID, pSSysBDTableDEId);
    }

    @JsonIgnore
    public String getPSSysBDTableDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEDEID);
    }

    @JsonIgnore
    public void resetPSSysBDTableDEId() {
        this._reset(DTOFIELD_PSSYSBDTABLEDEID);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdtabledeid(String pSSysBDTableDEId) {
        this.setPSSysBDTableDEId(pSSysBDTableDEId);
        return this;
    }

    @JsonProperty(value="pssysbdtabledename")
    public void setPSSysBDTableDEName(String pSSysBDTableDEName) {
        this._set(DTOFIELD_PSSYSBDTABLEDENAME, pSSysBDTableDEName);
    }

    @JsonIgnore
    public String getPSSysBDTableDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableDENameDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEDENAME);
    }

    @JsonIgnore
    public void resetPSSysBDTableDEName() {
        this._reset(DTOFIELD_PSSYSBDTABLEDENAME);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdtabledename(String pSSysBDTableDEName) {
        this.setPSSysBDTableDEName(pSSysBDTableDEName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDTableDEName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDTableDEName(strName);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO name(String strName) {
        this.setPSSysBDTableDEName(strName);
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
    public PSSysBDTableDEDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
        if (pSSysBDTable == null) {
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        } else {
            this.setPSSysBDSchemeId(pSSysBDTable.getPSSysBDSchemeId());
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
    public PSSysBDTableDEDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    @JsonProperty(value="rowkeyformat")
    public void setRowKeyFormat(String rowKeyFormat) {
        this._set(DTOFIELD_ROWKEYFORMAT, rowKeyFormat);
    }

    @JsonIgnore
    public String getRowKeyFormat() {
        Object objValue = this._get(DTOFIELD_ROWKEYFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRowKeyFormatDirty() {
        return this._contains(DTOFIELD_ROWKEYFORMAT);
    }

    @JsonIgnore
    public void resetRowKeyFormat() {
        this._reset(DTOFIELD_ROWKEYFORMAT);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO rowkeyformat(String rowKeyFormat) {
        this.setRowKeyFormat(rowKeyFormat);
        return this;
    }

    @JsonProperty(value="rowkeyparams")
    public void setRowKeyParams(String rowKeyParams) {
        this._set(DTOFIELD_ROWKEYPARAMS, rowKeyParams);
    }

    @JsonIgnore
    public String getRowKeyParams() {
        Object objValue = this._get(DTOFIELD_ROWKEYPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRowKeyParamsDirty() {
        return this._contains(DTOFIELD_ROWKEYPARAMS);
    }

    @JsonIgnore
    public void resetRowKeyParams() {
        this._reset(DTOFIELD_ROWKEYPARAMS);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO rowkeyparams(String rowKeyParams) {
        this.setRowKeyParams(rowKeyParams);
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
    public PSSysBDTableDEDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDTableDEDTO updateman(String updateMan) {
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
    public PSSysBDTableDEDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDEDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDTableDEDTO usertag(String userTag) {
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
    public PSSysBDTableDEDTO usertag2(String userTag2) {
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
    public PSSysBDTableDEDTO usertag3(String userTag3) {
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
    public PSSysBDTableDEDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDTableDEId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDTableDEId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableDEDTO id(String strValue) {
        this.setPSSysBDTableDEId(strValue);
        return this;
    }
}
