package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDColSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDColumnDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FULLCOLNAME = "FULLCOLNAME";
    protected static final String DTOFIELD_FULLCOLNAME = "fullcolname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBDCOLSETID = "PSSYSBDCOLSETID";
    protected static final String DTOFIELD_PSSYSBDCOLSETID = "pssysbdcolsetid";
    public static final String FIELD_PSSYSBDCOLSETNAME = "PSSYSBDCOLSETNAME";
    protected static final String DTOFIELD_PSSYSBDCOLSETNAME = "pssysbdcolsetname";
    public static final String FIELD_PSSYSBDCOLUMNID = "PSSYSBDCOLUMNID";
    protected static final String DTOFIELD_PSSYSBDCOLUMNID = "pssysbdcolumnid";
    public static final String FIELD_PSSYSBDCOLUMNNAME = "PSSYSBDCOLUMNNAME";
    protected static final String DTOFIELD_PSSYSBDCOLUMNNAME = "pssysbdcolumnname";
    public static final String FIELD_PSSYSBDTABLEDEID = "PSSYSBDTABLEDEID";
    protected static final String DTOFIELD_PSSYSBDTABLEDEID = "pssysbdtabledeid";
    public static final String FIELD_PSSYSBDTABLEDENAME = "PSSYSBDTABLEDENAME";
    protected static final String DTOFIELD_PSSYSBDTABLEDENAME = "pssysbdtabledename";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
    public static final String FIELD_UNIONKEYVALUE = "UNIONKEYVALUE";
    protected static final String DTOFIELD_UNIONKEYVALUE = "unionkeyvalue";
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
    public PSSysBDColumnDTO codename(String codeName) {
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
    public PSSysBDColumnDTO createdate(Timestamp createDate) {
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
    public PSSysBDColumnDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="fullcolname")
    public void setFullColName(String fullColName) {
        this._set(DTOFIELD_FULLCOLNAME, fullColName);
    }

    @JsonIgnore
    public String getFullColName() {
        Object objValue = this._get(DTOFIELD_FULLCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFullColNameDirty() {
        return this._contains(DTOFIELD_FULLCOLNAME);
    }

    @JsonIgnore
    public void resetFullColName() {
        this._reset(DTOFIELD_FULLCOLNAME);
    }

    @JsonIgnore
    public PSSysBDColumnDTO fullcolname(String fullColName) {
        this.setFullColName(fullColName);
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
    public PSSysBDColumnDTO logicname(String logicName) {
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
    public PSSysBDColumnDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSSysBDColumnDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSSysBDColumnDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSSysBDColumnDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysBDColumnDTO psdename(String pSDEName) {
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
    public PSSysBDColumnDTO pssysbdcolsetid(String pSSysBDColSetId) {
        this.setPSSysBDColSetId(pSSysBDColSetId);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO pssysbdcolsetid(PSSysBDColSetDTO pSSysBDColSet) {
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
    public PSSysBDColumnDTO pssysbdcolsetname(String pSSysBDColSetName) {
        this.setPSSysBDColSetName(pSSysBDColSetName);
        return this;
    }

    @JsonProperty(value="pssysbdcolumnid")
    public void setPSSysBDColumnId(String pSSysBDColumnId) {
        this._set(DTOFIELD_PSSYSBDCOLUMNID, pSSysBDColumnId);
    }

    @JsonIgnore
    public String getPSSysBDColumnId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDCOLUMNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDColumnIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDCOLUMNID);
    }

    @JsonIgnore
    public void resetPSSysBDColumnId() {
        this._reset(DTOFIELD_PSSYSBDCOLUMNID);
    }

    @JsonIgnore
    public PSSysBDColumnDTO pssysbdcolumnid(String pSSysBDColumnId) {
        this.setPSSysBDColumnId(pSSysBDColumnId);
        return this;
    }

    @JsonProperty(value="pssysbdcolumnname")
    public void setPSSysBDColumnName(String pSSysBDColumnName) {
        this._set(DTOFIELD_PSSYSBDCOLUMNNAME, pSSysBDColumnName);
    }

    @JsonIgnore
    public String getPSSysBDColumnName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDCOLUMNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDColumnNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDCOLUMNNAME);
    }

    @JsonIgnore
    public void resetPSSysBDColumnName() {
        this._reset(DTOFIELD_PSSYSBDCOLUMNNAME);
    }

    @JsonIgnore
    public PSSysBDColumnDTO pssysbdcolumnname(String pSSysBDColumnName) {
        this.setPSSysBDColumnName(pSSysBDColumnName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDColumnName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDColumnName(strName);
    }

    @JsonIgnore
    public PSSysBDColumnDTO name(String strName) {
        this.setPSSysBDColumnName(strName);
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
    public PSSysBDColumnDTO pssysbdtabledeid(String pSSysBDTableDEId) {
        this.setPSSysBDTableDEId(pSSysBDTableDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO pssysbdtabledeid(PSSysBDTableDEDTO pSSysBDTableDE) {
        if (pSSysBDTableDE == null) {
            this.setPSSysBDTableDEId(null);
            this.setPSSysBDTableDEName(null);
        } else {
            this.setPSSysBDTableDEId(pSSysBDTableDE.getPSSysBDTableDEId());
            this.setPSSysBDTableDEName(pSSysBDTableDE.getPSSysBDTableDEName());
        }
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
    public PSSysBDColumnDTO pssysbdtabledename(String pSSysBDTableDEName) {
        this.setPSSysBDTableDEName(pSSysBDTableDEName);
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
    public PSSysBDColumnDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
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
    public PSSysBDColumnDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    @JsonProperty(value="unionkeyvalue")
    public void setUnionKeyValue(String unionKeyValue) {
        this._set(DTOFIELD_UNIONKEYVALUE, unionKeyValue);
    }

    @JsonIgnore
    public String getUnionKeyValue() {
        Object objValue = this._get(DTOFIELD_UNIONKEYVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUnionKeyValueDirty() {
        return this._contains(DTOFIELD_UNIONKEYVALUE);
    }

    @JsonIgnore
    public void resetUnionKeyValue() {
        this._reset(DTOFIELD_UNIONKEYVALUE);
    }

    @JsonIgnore
    public PSSysBDColumnDTO unionkeyvalue(String unionKeyValue) {
        this.setUnionKeyValue(unionKeyValue);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO unionkeyvalue(PSModelEnums.UnionKeyValueMode unionKeyValue) {
        if (unionKeyValue == null) {
            this.setUnionKeyValue(null);
        } else {
            this.setUnionKeyValue(unionKeyValue.value);
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
    public PSSysBDColumnDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDColumnDTO updateman(String updateMan) {
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
    public PSSysBDColumnDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDColumnDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDColumnDTO usertag(String userTag) {
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
    public PSSysBDColumnDTO usertag2(String userTag2) {
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
    public PSSysBDColumnDTO usertag3(String userTag3) {
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
    public PSSysBDColumnDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDColumnId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDColumnId(strValue);
    }

    @JsonIgnore
    public PSSysBDColumnDTO id(String strValue) {
        this.setPSSysBDColumnId(strValue);
        return this;
    }
}
