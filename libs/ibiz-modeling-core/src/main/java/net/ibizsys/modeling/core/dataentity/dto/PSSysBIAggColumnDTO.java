package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIAggTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeLevelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeMeasureDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBIAggColumnDTO
extends PSModelDTOBase {
    public static final String FIELD_BIAGGCOLUMNTAG = "BIAGGCOLUMNTAG";
    protected static final String DTOFIELD_BIAGGCOLUMNTAG = "biaggcolumntag";
    public static final String FIELD_BIAGGCOLUMNTAG2 = "BIAGGCOLUMNTAG2";
    protected static final String DTOFIELD_BIAGGCOLUMNTAG2 = "biaggcolumntag2";
    public static final String FIELD_BIAGGCOLUMNTYPE = "BIAGGCOLUMNTYPE";
    protected static final String DTOFIELD_BIAGGCOLUMNTYPE = "biaggcolumntype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DEFAULTVALUETYPE = "DVT";
    protected static final String DTOFIELD_DEFAULTVALUETYPE = "defaultvaluetype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSBIAGGCOLUMNID = "PSSYSBIAGGCOLUMNID";
    protected static final String DTOFIELD_PSSYSBIAGGCOLUMNID = "pssysbiaggcolumnid";
    public static final String FIELD_PSSYSBIAGGCOLUMNNAME = "PSSYSBIAGGCOLUMNNAME";
    protected static final String DTOFIELD_PSSYSBIAGGCOLUMNNAME = "pssysbiaggcolumnname";
    public static final String FIELD_PSSYSBIAGGTABLEID = "PSSYSBIAGGTABLEID";
    protected static final String DTOFIELD_PSSYSBIAGGTABLEID = "pssysbiaggtableid";
    public static final String FIELD_PSSYSBIAGGTABLENAME = "PSSYSBIAGGTABLENAME";
    protected static final String DTOFIELD_PSSYSBIAGGTABLENAME = "pssysbiaggtablename";
    public static final String FIELD_PSSYSBICUBEDIMENSIONID = "PSSYSBICUBEDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";
    public static final String FIELD_PSSYSBICUBEDIMENSIONNAME = "PSSYSBICUBEDIMENSIONNAME";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBELEVELID = "PSSYSBICUBELEVELID";
    protected static final String DTOFIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";
    public static final String FIELD_PSSYSBICUBELEVELNAME = "PSSYSBICUBELEVELNAME";
    protected static final String DTOFIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";
    public static final String FIELD_PSSYSBICUBEMEASUREID = "PSSYSBICUBEMEASUREID";
    protected static final String DTOFIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";
    public static final String FIELD_PSSYSBICUBEMEASURENAME = "PSSYSBICUBEMEASURENAME";
    protected static final String DTOFIELD_PSSYSBICUBEMEASURENAME = "pssysbicubemeasurename";
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

    @JsonProperty(value="biaggcolumntag")
    public void setBIAggColumnTag(String bIAggColumnTag) {
        this._set(DTOFIELD_BIAGGCOLUMNTAG, bIAggColumnTag);
    }

    @JsonIgnore
    public String getBIAggColumnTag() {
        Object objValue = this._get(DTOFIELD_BIAGGCOLUMNTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggColumnTagDirty() {
        return this._contains(DTOFIELD_BIAGGCOLUMNTAG);
    }

    @JsonIgnore
    public void resetBIAggColumnTag() {
        this._reset(DTOFIELD_BIAGGCOLUMNTAG);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO biaggcolumntag(String bIAggColumnTag) {
        this.setBIAggColumnTag(bIAggColumnTag);
        return this;
    }

    @JsonProperty(value="biaggcolumntag2")
    public void setBIAggColumnTag2(String bIAggColumnTag2) {
        this._set(DTOFIELD_BIAGGCOLUMNTAG2, bIAggColumnTag2);
    }

    @JsonIgnore
    public String getBIAggColumnTag2() {
        Object objValue = this._get(DTOFIELD_BIAGGCOLUMNTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggColumnTag2Dirty() {
        return this._contains(DTOFIELD_BIAGGCOLUMNTAG2);
    }

    @JsonIgnore
    public void resetBIAggColumnTag2() {
        this._reset(DTOFIELD_BIAGGCOLUMNTAG2);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO biaggcolumntag2(String bIAggColumnTag2) {
        this.setBIAggColumnTag2(bIAggColumnTag2);
        return this;
    }

    @JsonProperty(value="biaggcolumntype")
    public void setBIAggColumnType(String bIAggColumnType) {
        this._set(DTOFIELD_BIAGGCOLUMNTYPE, bIAggColumnType);
    }

    @JsonIgnore
    public String getBIAggColumnType() {
        Object objValue = this._get(DTOFIELD_BIAGGCOLUMNTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggColumnTypeDirty() {
        return this._contains(DTOFIELD_BIAGGCOLUMNTYPE);
    }

    @JsonIgnore
    public void resetBIAggColumnType() {
        this._reset(DTOFIELD_BIAGGCOLUMNTYPE);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO biaggcolumntype(String bIAggColumnType) {
        this.setBIAggColumnType(bIAggColumnType);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO biaggcolumntype(PSModelEnums.BIAggColumnType bIAggColumnType) {
        if (bIAggColumnType == null) {
            this.setBIAggColumnType(null);
        } else {
            this.setBIAggColumnType(bIAggColumnType.value);
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
    public PSSysBIAggColumnDTO codename(String codeName) {
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
    public PSSysBIAggColumnDTO createdate(Timestamp createDate) {
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
    public PSSysBIAggColumnDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="defaultvaluetype")
    public void setDefaultValueType(String defaultValueType) {
        this._set(DTOFIELD_DEFAULTVALUETYPE, defaultValueType);
        this._set(FIELD_DEFAULTVALUETYPE, defaultValueType);
    }

    @JsonIgnore
    public String getDefaultValueType() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUETYPE);
        if (objValue == null && (objValue = this._get(FIELD_DEFAULTVALUETYPE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueTypeDirty() {
        if (this._contains(DTOFIELD_DEFAULTVALUETYPE)) {
            return true;
        }
        return this._contains(FIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public void resetDefaultValueType() {
        this._reset(DTOFIELD_DEFAULTVALUETYPE);
        this._reset(FIELD_DEFAULTVALUETYPE);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO defaultvaluetype(String defaultValueType) {
        this.setDefaultValueType(defaultValueType);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO defaultvaluetype(PSModelEnums.DEFDefaultValueType defaultValueType) {
        if (defaultValueType == null) {
            this.setDefaultValueType(null);
        } else {
            this.setDefaultValueType(defaultValueType.value);
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
    public PSSysBIAggColumnDTO memo(String memo) {
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
    public PSSysBIAggColumnDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysBIAggColumnDTO psdefname(String pSDEFName) {
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
    public PSSysBIAggColumnDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssysbiaggcolumnid")
    public void setPSSysBIAggColumnId(String pSSysBIAggColumnId) {
        this._set(DTOFIELD_PSSYSBIAGGCOLUMNID, pSSysBIAggColumnId);
    }

    @JsonIgnore
    public String getPSSysBIAggColumnId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGCOLUMNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggColumnIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGCOLUMNID);
    }

    @JsonIgnore
    public void resetPSSysBIAggColumnId() {
        this._reset(DTOFIELD_PSSYSBIAGGCOLUMNID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbiaggcolumnid(String pSSysBIAggColumnId) {
        this.setPSSysBIAggColumnId(pSSysBIAggColumnId);
        return this;
    }

    @JsonProperty(value="pssysbiaggcolumnname")
    public void setPSSysBIAggColumnName(String pSSysBIAggColumnName) {
        this._set(DTOFIELD_PSSYSBIAGGCOLUMNNAME, pSSysBIAggColumnName);
    }

    @JsonIgnore
    public String getPSSysBIAggColumnName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGCOLUMNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggColumnNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGCOLUMNNAME);
    }

    @JsonIgnore
    public void resetPSSysBIAggColumnName() {
        this._reset(DTOFIELD_PSSYSBIAGGCOLUMNNAME);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbiaggcolumnname(String pSSysBIAggColumnName) {
        this.setPSSysBIAggColumnName(pSSysBIAggColumnName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBIAggColumnName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBIAggColumnName(strName);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO name(String strName) {
        this.setPSSysBIAggColumnName(strName);
        return this;
    }

    @JsonProperty(value="pssysbiaggtableid")
    public void setPSSysBIAggTableId(String pSSysBIAggTableId) {
        this._set(DTOFIELD_PSSYSBIAGGTABLEID, pSSysBIAggTableId);
    }

    @JsonIgnore
    public String getPSSysBIAggTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGTABLEID);
    }

    @JsonIgnore
    public void resetPSSysBIAggTableId() {
        this._reset(DTOFIELD_PSSYSBIAGGTABLEID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbiaggtableid(String pSSysBIAggTableId) {
        this.setPSSysBIAggTableId(pSSysBIAggTableId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbiaggtableid(PSSysBIAggTableDTO pSSysBIAggTable) {
        if (pSSysBIAggTable == null) {
            this.setPSDEId(null);
            this.setPSSysBIAggTableId(null);
            this.setPSSysBIAggTableName(null);
            this.setPSSysBICubeId(null);
        } else {
            this.setPSDEId(pSSysBIAggTable.getPSDEId());
            this.setPSSysBIAggTableId(pSSysBIAggTable.getPSSysBIAggTableId());
            this.setPSSysBIAggTableName(pSSysBIAggTable.getPSSysBIAggTableName());
            this.setPSSysBICubeId(pSSysBIAggTable.getPSSysBICubeId());
        }
        return this;
    }

    @JsonProperty(value="pssysbiaggtablename")
    public void setPSSysBIAggTableName(String pSSysBIAggTableName) {
        this._set(DTOFIELD_PSSYSBIAGGTABLENAME, pSSysBIAggTableName);
    }

    @JsonIgnore
    public String getPSSysBIAggTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysBIAggTableName() {
        this._reset(DTOFIELD_PSSYSBIAGGTABLENAME);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbiaggtablename(String pSSysBIAggTableName) {
        this.setPSSysBIAggTableName(pSSysBIAggTableName);
        return this;
    }

    @JsonProperty(value="pssysbicubedimensionid")
    public void setPSSysBICubeDimensionId(String pSSysBICubeDimensionId) {
        this._set(DTOFIELD_PSSYSBICUBEDIMENSIONID, pSSysBICubeDimensionId);
    }

    @JsonIgnore
    public String getPSSysBICubeDimensionId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEDIMENSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeDimensionIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEDIMENSIONID);
    }

    @JsonIgnore
    public void resetPSSysBICubeDimensionId() {
        this._reset(DTOFIELD_PSSYSBICUBEDIMENSIONID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubedimensionid(String pSSysBICubeDimensionId) {
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubedimensionid(PSSysBICubeDimensionDTO pSSysBICubeDimension) {
        if (pSSysBICubeDimension == null) {
            this.setPSSysBICubeDimensionId(null);
            this.setPSSysBICubeDimensionName(null);
        } else {
            this.setPSSysBICubeDimensionId(pSSysBICubeDimension.getPSSysBICubeDimensionId());
            this.setPSSysBICubeDimensionName(pSSysBICubeDimension.getPSSysBICubeDimensionName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubedimensionname")
    public void setPSSysBICubeDimensionName(String pSSysBICubeDimensionName) {
        this._set(DTOFIELD_PSSYSBICUBEDIMENSIONNAME, pSSysBICubeDimensionName);
    }

    @JsonIgnore
    public String getPSSysBICubeDimensionName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeDimensionNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeDimensionName() {
        this._reset(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubedimensionname(String pSSysBICubeDimensionName) {
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    @JsonProperty(value="pssysbicubeid")
    public void setPSSysBICubeId(String pSSysBICubeId) {
        this._set(DTOFIELD_PSSYSBICUBEID, pSSysBICubeId);
    }

    @JsonIgnore
    public String getPSSysBICubeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public void resetPSSysBICubeId() {
        this._reset(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonProperty(value="pssysbicubelevelid")
    public void setPSSysBICubeLevelId(String pSSysBICubeLevelId) {
        this._set(DTOFIELD_PSSYSBICUBELEVELID, pSSysBICubeLevelId);
    }

    @JsonIgnore
    public String getPSSysBICubeLevelId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBELEVELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeLevelIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBELEVELID);
    }

    @JsonIgnore
    public void resetPSSysBICubeLevelId() {
        this._reset(DTOFIELD_PSSYSBICUBELEVELID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubelevelid(String pSSysBICubeLevelId) {
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubelevelid(PSSysBICubeLevelDTO pSSysBICubeLevel) {
        if (pSSysBICubeLevel == null) {
            this.setPSSysBICubeLevelId(null);
            this.setPSSysBICubeLevelName(null);
        } else {
            this.setPSSysBICubeLevelId(pSSysBICubeLevel.getPSSysBICubeLevelId());
            this.setPSSysBICubeLevelName(pSSysBICubeLevel.getPSSysBICubeLevelName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubelevelname")
    public void setPSSysBICubeLevelName(String pSSysBICubeLevelName) {
        this._set(DTOFIELD_PSSYSBICUBELEVELNAME, pSSysBICubeLevelName);
    }

    @JsonIgnore
    public String getPSSysBICubeLevelName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBELEVELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeLevelNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBELEVELNAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeLevelName() {
        this._reset(DTOFIELD_PSSYSBICUBELEVELNAME);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubelevelname(String pSSysBICubeLevelName) {
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
        return this;
    }

    @JsonProperty(value="pssysbicubemeasureid")
    public void setPSSysBICubeMeasureId(String pSSysBICubeMeasureId) {
        this._set(DTOFIELD_PSSYSBICUBEMEASUREID, pSSysBICubeMeasureId);
    }

    @JsonIgnore
    public String getPSSysBICubeMeasureId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEMEASUREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeMeasureIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public void resetPSSysBICubeMeasureId() {
        this._reset(DTOFIELD_PSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubemeasureid(String pSSysBICubeMeasureId) {
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubemeasureid(PSSysBICubeMeasureDTO pSSysBICubeMeasure) {
        if (pSSysBICubeMeasure == null) {
            this.setPSSysBICubeMeasureId(null);
            this.setPSSysBICubeMeasureName(null);
        } else {
            this.setPSSysBICubeMeasureId(pSSysBICubeMeasure.getPSSysBICubeMeasureId());
            this.setPSSysBICubeMeasureName(pSSysBICubeMeasure.getPSSysBICubeMeasureName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubemeasurename")
    public void setPSSysBICubeMeasureName(String pSSysBICubeMeasureName) {
        this._set(DTOFIELD_PSSYSBICUBEMEASURENAME, pSSysBICubeMeasureName);
    }

    @JsonIgnore
    public String getPSSysBICubeMeasureName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEMEASURENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeMeasureNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeMeasureName() {
        this._reset(DTOFIELD_PSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO pssysbicubemeasurename(String pSSysBICubeMeasureName) {
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
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
    public PSSysBIAggColumnDTO updatedate(Timestamp updateDate) {
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
    public PSSysBIAggColumnDTO updateman(String updateMan) {
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
    public PSSysBIAggColumnDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBIAggColumnDTO usertag(String userTag) {
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
    public PSSysBIAggColumnDTO usertag2(String userTag2) {
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
    public PSSysBIAggColumnDTO usertag3(String userTag3) {
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
    public PSSysBIAggColumnDTO usertag4(String userTag4) {
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
    public PSSysBIAggColumnDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBIAggColumnId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBIAggColumnId(strValue);
    }

    @JsonIgnore
    public PSSysBIAggColumnDTO id(String strValue) {
        this.setPSSysBIAggColumnId(strValue);
        return this;
    }
}
