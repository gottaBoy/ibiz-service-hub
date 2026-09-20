/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DBIndexType
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBIdxFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDBIndexDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWREVERSE = "ALLOWREVERSE";
    protected static final String DTOFIELD_ALLOWREVERSE = "allowreverse";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_INDEXTYPE = "INDEXTYPE";
    protected static final String DTOFIELD_INDEXTYPE = "indextype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDBINDEXID = "PSDEDBINDEXID";
    protected static final String DTOFIELD_PSDEDBINDEXID = "psdedbindexid";
    public static final String FIELD_PSDEDBINDEXNAME = "PSDEDBINDEXNAME";
    protected static final String DTOFIELD_PSDEDBINDEXNAME = "psdedbindexname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_REMOVEFLAG = "REMOVEFLAG";
    protected static final String DTOFIELD_REMOVEFLAG = "removeflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String DTOFIELD_PSDEDBIDXFIELDS = "psdedbidxfields";

    @JsonProperty(value="allowreverse")
    public void setAllowReverse(Integer allowReverse) {
        this._set(DTOFIELD_ALLOWREVERSE, allowReverse);
    }

    @JsonIgnore
    public Integer getAllowReverse() {
        Object objValue = this._get(DTOFIELD_ALLOWREVERSE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowReverseDirty() {
        return this._contains(DTOFIELD_ALLOWREVERSE);
    }

    @JsonIgnore
    public void resetAllowReverse() {
        this._reset(DTOFIELD_ALLOWREVERSE);
    }

    @JsonIgnore
    public PSDEDBIndexDTO allowreverse(Integer allowReverse) {
        this.setAllowReverse(allowReverse);
        return this;
    }

    @JsonIgnore
    public PSDEDBIndexDTO allowreverse(Boolean allowReverse) {
        if (allowReverse == null) {
            this.setAllowReverse(null);
        } else {
            this.setAllowReverse(allowReverse != false ? 1 : 0);
        }
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
    public PSDEDBIndexDTO codename(String codeName) {
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
    public PSDEDBIndexDTO createdate(Timestamp createDate) {
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
    public PSDEDBIndexDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="indextype")
    public void setIndexType(String indexType) {
        this._set(DTOFIELD_INDEXTYPE, indexType);
    }

    @JsonIgnore
    public String getIndexType() {
        Object objValue = this._get(DTOFIELD_INDEXTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIndexTypeDirty() {
        return this._contains(DTOFIELD_INDEXTYPE);
    }

    @JsonIgnore
    public void resetIndexType() {
        this._reset(DTOFIELD_INDEXTYPE);
    }

    @JsonIgnore
    public PSDEDBIndexDTO indextype(String indexType) {
        this.setIndexType(indexType);
        return this;
    }

    @JsonIgnore
    public PSDEDBIndexDTO indextype(PSModelEnums.DBIndexType indexType) {
        if (indexType == null) {
            this.setIndexType(null);
        } else {
            this.setIndexType(indexType.value);
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
    public PSDEDBIndexDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdedbindexid")
    public void setPSDEDBIndexId(String pSDEDBIndexId) {
        this._set(DTOFIELD_PSDEDBINDEXID, pSDEDBIndexId);
    }

    @JsonIgnore
    public String getPSDEDBIndexId() {
        Object objValue = this._get(DTOFIELD_PSDEDBINDEXID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBIndexIdDirty() {
        return this._contains(DTOFIELD_PSDEDBINDEXID);
    }

    @JsonIgnore
    public void resetPSDEDBIndexId() {
        this._reset(DTOFIELD_PSDEDBINDEXID);
    }

    @JsonIgnore
    public PSDEDBIndexDTO psdedbindexid(String pSDEDBIndexId) {
        this.setPSDEDBIndexId(pSDEDBIndexId);
        return this;
    }

    @JsonProperty(value="psdedbindexname")
    public void setPSDEDBIndexName(String pSDEDBIndexName) {
        this._set(DTOFIELD_PSDEDBINDEXNAME, pSDEDBIndexName);
    }

    @JsonIgnore
    public String getPSDEDBIndexName() {
        Object objValue = this._get(DTOFIELD_PSDEDBINDEXNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBIndexNameDirty() {
        return this._contains(DTOFIELD_PSDEDBINDEXNAME);
    }

    @JsonIgnore
    public void resetPSDEDBIndexName() {
        this._reset(DTOFIELD_PSDEDBINDEXNAME);
    }

    @JsonIgnore
    public PSDEDBIndexDTO psdedbindexname(String pSDEDBIndexName) {
        this.setPSDEDBIndexName(pSDEDBIndexName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDBIndexName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDBIndexName(strName);
    }

    @JsonIgnore
    public PSDEDBIndexDTO name(String strName) {
        this.setPSDEDBIndexName(strName);
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
    public PSDEDBIndexDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDBIndexDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDBIndexDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEDBIndexDTO removeflag(Integer removeFlag) {
        this.setRemoveFlag(removeFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDBIndexDTO removeflag(Boolean removeFlag) {
        if (removeFlag == null) {
            this.setRemoveFlag(null);
        } else {
            this.setRemoveFlag(removeFlag != false ? 1 : 0);
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
    public PSDEDBIndexDTO updatedate(Timestamp updateDate) {
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
    public PSDEDBIndexDTO updateman(String updateMan) {
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
    public PSDEDBIndexDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDBIndexId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDBIndexId(strValue);
    }

    @JsonIgnore
    public PSDEDBIndexDTO id(String strValue) {
        this.setPSDEDBIndexId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDBIdxFieldDTO> getPSDEDBIdxFields() {
        Object list = this._get(DTOFIELD_PSDEDBIDXFIELDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedbidxfields")
    public void setPSDEDBIdxFields(List<PSDEDBIdxFieldDTO> psdedbidxfields) {
        this._set(DTOFIELD_PSDEDBIDXFIELDS, psdedbidxfields);
    }

    @JsonIgnore
    public List<PSDEDBIdxFieldDTO> getPSDEDBIdxFieldsIf() {
        Object list = this._get(DTOFIELD_PSDEDBIDXFIELDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDBIDXFIELDS, list);
        }
        return (List) list;
    }
}
