/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$SortDir
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBIndexDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDBIdxFieldDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_INCMODE = "INCMODE";
    protected static final String DTOFIELD_INCMODE = "incmode";
    public static final String FIELD_INDEXLENGTH = "INDEXLENGTH";
    protected static final String DTOFIELD_INDEXLENGTH = "indexlength";
    public static final String FIELD_PSDEDBIDXFIELDID = "PSDEDBIDXFIELDID";
    protected static final String DTOFIELD_PSDEDBIDXFIELDID = "psdedbidxfieldid";
    public static final String FIELD_PSDEDBIDXFIELDNAME = "PSDEDBIDXFIELDNAME";
    protected static final String DTOFIELD_PSDEDBIDXFIELDNAME = "psdedbidxfieldname";
    public static final String FIELD_PSDEDBINDEXID = "PSDEDBINDEXID";
    protected static final String DTOFIELD_PSDEDBINDEXID = "psdedbindexid";
    public static final String FIELD_PSDEDBINDEXNAME = "PSDEDBINDEXNAME";
    protected static final String DTOFIELD_PSDEDBINDEXNAME = "psdedbindexname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_SORTDIR = "SORTDIR";
    protected static final String DTOFIELD_SORTDIR = "sortdir";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSDEDBIdxFieldDTO createdate(Timestamp createDate) {
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
    public PSDEDBIdxFieldDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="incmode")
    public void setIncMode(Integer incMode) {
        this._set(DTOFIELD_INCMODE, incMode);
    }

    @JsonIgnore
    public Integer getIncMode() {
        Object objValue = this._get(DTOFIELD_INCMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncModeDirty() {
        return this._contains(DTOFIELD_INCMODE);
    }

    @JsonIgnore
    public void resetIncMode() {
        this._reset(DTOFIELD_INCMODE);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO incmode(Integer incMode) {
        this.setIncMode(incMode);
        return this;
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO incmode(Boolean incMode) {
        if (incMode == null) {
            this.setIncMode(null);
        } else {
            this.setIncMode(incMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="indexlength")
    public void setIndexLength(Integer indexLength) {
        this._set(DTOFIELD_INDEXLENGTH, indexLength);
    }

    @JsonIgnore
    public Integer getIndexLength() {
        Object objValue = this._get(DTOFIELD_INDEXLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIndexLengthDirty() {
        return this._contains(DTOFIELD_INDEXLENGTH);
    }

    @JsonIgnore
    public void resetIndexLength() {
        this._reset(DTOFIELD_INDEXLENGTH);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO indexlength(Integer indexLength) {
        this.setIndexLength(indexLength);
        return this;
    }

    @JsonProperty(value="psdedbidxfieldid")
    public void setPSDEDBIdxFieldId(String pSDEDBIdxFieldId) {
        this._set(DTOFIELD_PSDEDBIDXFIELDID, pSDEDBIdxFieldId);
    }

    @JsonIgnore
    public String getPSDEDBIdxFieldId() {
        Object objValue = this._get(DTOFIELD_PSDEDBIDXFIELDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBIdxFieldIdDirty() {
        return this._contains(DTOFIELD_PSDEDBIDXFIELDID);
    }

    @JsonIgnore
    public void resetPSDEDBIdxFieldId() {
        this._reset(DTOFIELD_PSDEDBIDXFIELDID);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO psdedbidxfieldid(String pSDEDBIdxFieldId) {
        this.setPSDEDBIdxFieldId(pSDEDBIdxFieldId);
        return this;
    }

    @JsonProperty(value="psdedbidxfieldname")
    public void setPSDEDBIdxFieldName(String pSDEDBIdxFieldName) {
        this._set(DTOFIELD_PSDEDBIDXFIELDNAME, pSDEDBIdxFieldName);
    }

    @JsonIgnore
    public String getPSDEDBIdxFieldName() {
        Object objValue = this._get(DTOFIELD_PSDEDBIDXFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBIdxFieldNameDirty() {
        return this._contains(DTOFIELD_PSDEDBIDXFIELDNAME);
    }

    @JsonIgnore
    public void resetPSDEDBIdxFieldName() {
        this._reset(DTOFIELD_PSDEDBIDXFIELDNAME);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO psdedbidxfieldname(String pSDEDBIdxFieldName) {
        this.setPSDEDBIdxFieldName(pSDEDBIdxFieldName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDBIdxFieldName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDBIdxFieldName(strName);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO name(String strName) {
        this.setPSDEDBIdxFieldName(strName);
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
    public PSDEDBIdxFieldDTO psdedbindexid(String pSDEDBIndexId) {
        this.setPSDEDBIndexId(pSDEDBIndexId);
        return this;
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO psdedbindexid(PSDEDBIndexDTO pSDEDBIndex) {
        if (pSDEDBIndex == null) {
            this.setPSDEDBIndexId(null);
            this.setPSDEDBIndexName(null);
        } else {
            this.setPSDEDBIndexId(pSDEDBIndex.getPSDEDBIndexId());
            this.setPSDEDBIndexName(pSDEDBIndex.getPSDEDBIndexName());
        }
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
    public PSDEDBIdxFieldDTO psdedbindexname(String pSDEDBIndexName) {
        this.setPSDEDBIndexName(pSDEDBIndexName);
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
    public PSDEDBIdxFieldDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
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
    public PSDEDBIdxFieldDTO psdefname(String pSDEFName) {
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
    public PSDEDBIdxFieldDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="sortdir")
    public void setSortDir(String sortDir) {
        this._set(DTOFIELD_SORTDIR, sortDir);
    }

    @JsonIgnore
    public String getSortDir() {
        Object objValue = this._get(DTOFIELD_SORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSortDirDirty() {
        return this._contains(DTOFIELD_SORTDIR);
    }

    @JsonIgnore
    public void resetSortDir() {
        this._reset(DTOFIELD_SORTDIR);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO sortdir(String sortDir) {
        this.setSortDir(sortDir);
        return this;
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO sortdir(PSModelEnums.SortDir sortDir) {
        if (sortDir == null) {
            this.setSortDir(null);
        } else {
            this.setSortDir(sortDir.value);
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
    public PSDEDBIdxFieldDTO updatedate(Timestamp updateDate) {
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
    public PSDEDBIdxFieldDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDBIdxFieldId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDBIdxFieldId(strValue);
    }

    @JsonIgnore
    public PSDEDBIdxFieldDTO id(String strValue) {
        this.setPSDEDBIdxFieldId(strValue);
        return this;
    }
}
