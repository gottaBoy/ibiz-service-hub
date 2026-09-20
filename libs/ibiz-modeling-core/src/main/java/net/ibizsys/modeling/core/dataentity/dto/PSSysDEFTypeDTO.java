package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUnitDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysValueRuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDEFTypeDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EDITORHEIGHT = "EDITORHEIGHT";
    protected static final String DTOFIELD_EDITORHEIGHT = "editorheight";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_EDITORWIDTH = "EDITORWIDTH";
    protected static final String DTOFIELD_EDITORWIDTH = "editorwidth";
    public static final String FIELD_FIELDS = "FIELDS";
    protected static final String DTOFIELD_FIELDS = "fields";
    public static final String FIELD_GRIDCOLALIGN = "GRIDCOLALIGN";
    protected static final String DTOFIELD_GRIDCOLALIGN = "gridcolalign";
    public static final String FIELD_GRIDCOLCLMODE = "GRIDCOLCLMODE";
    protected static final String DTOFIELD_GRIDCOLCLMODE = "gridcolclmode";
    public static final String FIELD_GRIDCOLWIDTH = "GRIDCOLWIDTH";
    protected static final String DTOFIELD_GRIDCOLWIDTH = "gridcolwidth";
    public static final String FIELD_JSFORMAT = "JSFORMAT";
    protected static final String DTOFIELD_JSFORMAT = "jsformat";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MBEDITORHEIGHT = "MBEDITORHEIGHT";
    protected static final String DTOFIELD_MBEDITORHEIGHT = "mbeditorheight";
    public static final String FIELD_MBEDITORTYPE = "MBEDITORTYPE";
    protected static final String DTOFIELD_MBEDITORTYPE = "mbeditortype";
    public static final String FIELD_MBEDITORWIDTH = "MBEDITORWIDTH";
    protected static final String DTOFIELD_MBEDITORWIDTH = "mbeditorwidth";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFTYPEID = "PSDEFTYPEID";
    protected static final String DTOFIELD_PSDEFTYPEID = "psdeftypeid";
    public static final String FIELD_PSDEFTYPENAME = "PSDEFTYPENAME";
    protected static final String DTOFIELD_PSDEFTYPENAME = "psdeftypename";
    public static final String FIELD_PSSYSDEFTYPEID = "PSSYSDEFTYPEID";
    protected static final String DTOFIELD_PSSYSDEFTYPEID = "pssysdeftypeid";
    public static final String FIELD_PSSYSDEFTYPENAME = "PSSYSDEFTYPENAME";
    protected static final String DTOFIELD_PSSYSDEFTYPENAME = "pssysdeftypename";
    public static final String FIELD_PSSYSUNITID = "PSSYSUNITID";
    protected static final String DTOFIELD_PSSYSUNITID = "pssysunitid";
    public static final String FIELD_PSSYSUNITNAME = "PSSYSUNITNAME";
    protected static final String DTOFIELD_PSSYSUNITNAME = "pssysunitname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_PYFORMAT = "PYFORMAT";
    protected static final String DTOFIELD_PYFORMAT = "pyformat";
    public static final String FIELD_SEARCHEDITORHEIGHT = "SEARCHEDITORHEIGHT";
    protected static final String DTOFIELD_SEARCHEDITORHEIGHT = "searcheditorheight";
    public static final String FIELD_SEARCHEDITORTYPE = "SEARCHEDITORTYPE";
    protected static final String DTOFIELD_SEARCHEDITORTYPE = "searcheditortype";
    public static final String FIELD_SEARCHEDITORWIDTH = "SEARCHEDITORWIDTH";
    protected static final String DTOFIELD_SEARCHEDITORWIDTH = "searcheditorwidth";
    public static final String FIELD_SEARCHMBEDITORHEIGHT = "SEARCHMBEDITORHEIGHT";
    protected static final String DTOFIELD_SEARCHMBEDITORHEIGHT = "searchmbeditorheight";
    public static final String FIELD_SEARCHMBEDITORTYPE = "SEARCHMBEDITORTYPE";
    protected static final String DTOFIELD_SEARCHMBEDITORTYPE = "searchmbeditortype";
    public static final String FIELD_SEARCHMBEDITORWIDTH = "SEARCHMBEDITORWIDTH";
    protected static final String DTOFIELD_SEARCHMBEDITORWIDTH = "searchmbeditorwidth";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_STRLENGTH = "STRLENGTH";
    protected static final String DTOFIELD_STRLENGTH = "strlength";
    public static final String FIELD_TSFORMAT = "TSFORMAT";
    protected static final String DTOFIELD_TSFORMAT = "tsformat";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";

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
    public PSSysDEFTypeDTO createdate(Timestamp createDate) {
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
    public PSSysDEFTypeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="editorheight")
    public void setEditorHeight(Integer editorHeight) {
        this._set(DTOFIELD_EDITORHEIGHT, editorHeight);
    }

    @JsonIgnore
    public Integer getEditorHeight() {
        Object objValue = this._get(DTOFIELD_EDITORHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEditorHeightDirty() {
        return this._contains(DTOFIELD_EDITORHEIGHT);
    }

    @JsonIgnore
    public void resetEditorHeight() {
        this._reset(DTOFIELD_EDITORHEIGHT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO editorheight(Integer editorHeight) {
        this.setEditorHeight(editorHeight);
        return this;
    }

    @JsonProperty(value="editortype")
    public void setEditorType(String editorType) {
        this._set(DTOFIELD_EDITORTYPE, editorType);
    }

    @JsonIgnore
    public String getEditorType() {
        Object objValue = this._get(DTOFIELD_EDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorTypeDirty() {
        return this._contains(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public void resetEditorType() {
        this._reset(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO editortype(String editorType) {
        this.setEditorType(editorType);
        return this;
    }

    @JsonProperty(value="editorwidth")
    public void setEditorWidth(Integer editorWidth) {
        this._set(DTOFIELD_EDITORWIDTH, editorWidth);
    }

    @JsonIgnore
    public Integer getEditorWidth() {
        Object objValue = this._get(DTOFIELD_EDITORWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEditorWidthDirty() {
        return this._contains(DTOFIELD_EDITORWIDTH);
    }

    @JsonIgnore
    public void resetEditorWidth() {
        this._reset(DTOFIELD_EDITORWIDTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO editorwidth(Integer editorWidth) {
        this.setEditorWidth(editorWidth);
        return this;
    }

    @JsonProperty(value="fields")
    public void setFields(String fields) {
        this._set(DTOFIELD_FIELDS, fields);
    }

    @JsonIgnore
    public String getFields() {
        Object objValue = this._get(DTOFIELD_FIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldsDirty() {
        return this._contains(DTOFIELD_FIELDS);
    }

    @JsonIgnore
    public void resetFields() {
        this._reset(DTOFIELD_FIELDS);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO fields(String fields) {
        this.setFields(fields);
        return this;
    }

    @JsonProperty(value="gridcolalign")
    public void setGridColAlign(String gridColAlign) {
        this._set(DTOFIELD_GRIDCOLALIGN, gridColAlign);
    }

    @JsonIgnore
    public String getGridColAlign() {
        Object objValue = this._get(DTOFIELD_GRIDCOLALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColAlignDirty() {
        return this._contains(DTOFIELD_GRIDCOLALIGN);
    }

    @JsonIgnore
    public void resetGridColAlign() {
        this._reset(DTOFIELD_GRIDCOLALIGN);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO gridcolalign(String gridColAlign) {
        this.setGridColAlign(gridColAlign);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO gridcolalign(PSModelEnums.GridColAlign gridColAlign) {
        if (gridColAlign == null) {
            this.setGridColAlign(null);
        } else {
            this.setGridColAlign(gridColAlign.value);
        }
        return this;
    }

    @JsonProperty(value="gridcolclmode")
    public void setGridColCLMode(String gridColCLMode) {
        this._set(DTOFIELD_GRIDCOLCLMODE, gridColCLMode);
    }

    @JsonIgnore
    public String getGridColCLMode() {
        Object objValue = this._get(DTOFIELD_GRIDCOLCLMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColCLModeDirty() {
        return this._contains(DTOFIELD_GRIDCOLCLMODE);
    }

    @JsonIgnore
    public void resetGridColCLMode() {
        this._reset(DTOFIELD_GRIDCOLCLMODE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO gridcolclmode(String gridColCLMode) {
        this.setGridColCLMode(gridColCLMode);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO gridcolclmode(PSModelEnums.CodeListConvertMode gridColCLMode) {
        if (gridColCLMode == null) {
            this.setGridColCLMode(null);
        } else {
            this.setGridColCLMode(gridColCLMode.value);
        }
        return this;
    }

    @JsonProperty(value="gridcolwidth")
    public void setGridColWidth(Integer gridColWidth) {
        this._set(DTOFIELD_GRIDCOLWIDTH, gridColWidth);
    }

    @JsonIgnore
    public Integer getGridColWidth() {
        Object objValue = this._get(DTOFIELD_GRIDCOLWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGridColWidthDirty() {
        return this._contains(DTOFIELD_GRIDCOLWIDTH);
    }

    @JsonIgnore
    public void resetGridColWidth() {
        this._reset(DTOFIELD_GRIDCOLWIDTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO gridcolwidth(Integer gridColWidth) {
        this.setGridColWidth(gridColWidth);
        return this;
    }

    @JsonProperty(value="jsformat")
    public void setJSFormat(String jSFormat) {
        this._set(DTOFIELD_JSFORMAT, jSFormat);
    }

    @JsonIgnore
    public String getJSFormat() {
        Object objValue = this._get(DTOFIELD_JSFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJSFormatDirty() {
        return this._contains(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public void resetJSFormat() {
        this._reset(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO jsformat(String jSFormat) {
        this.setJSFormat(jSFormat);
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(String maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public String getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaxValueDirty() {
        return this._contains(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public void resetMaxValue() {
        this._reset(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO maxvalue(String maxValue) {
        this.setMaxValue(maxValue);
        return this;
    }

    @JsonProperty(value="mbeditorheight")
    public void setMBEditorHeight(Integer mBEditorHeight) {
        this._set(DTOFIELD_MBEDITORHEIGHT, mBEditorHeight);
    }

    @JsonIgnore
    public Integer getMBEditorHeight() {
        Object objValue = this._get(DTOFIELD_MBEDITORHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMBEditorHeightDirty() {
        return this._contains(DTOFIELD_MBEDITORHEIGHT);
    }

    @JsonIgnore
    public void resetMBEditorHeight() {
        this._reset(DTOFIELD_MBEDITORHEIGHT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO mbeditorheight(Integer mBEditorHeight) {
        this.setMBEditorHeight(mBEditorHeight);
        return this;
    }

    @JsonProperty(value="mbeditortype")
    public void setMBEditorType(String mBEditorType) {
        this._set(DTOFIELD_MBEDITORTYPE, mBEditorType);
    }

    @JsonIgnore
    public String getMBEditorType() {
        Object objValue = this._get(DTOFIELD_MBEDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMBEditorTypeDirty() {
        return this._contains(DTOFIELD_MBEDITORTYPE);
    }

    @JsonIgnore
    public void resetMBEditorType() {
        this._reset(DTOFIELD_MBEDITORTYPE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO mbeditortype(String mBEditorType) {
        this.setMBEditorType(mBEditorType);
        return this;
    }

    @JsonProperty(value="mbeditorwidth")
    public void setMBEditorWidth(Integer mBEditorWidth) {
        this._set(DTOFIELD_MBEDITORWIDTH, mBEditorWidth);
    }

    @JsonIgnore
    public Integer getMBEditorWidth() {
        Object objValue = this._get(DTOFIELD_MBEDITORWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMBEditorWidthDirty() {
        return this._contains(DTOFIELD_MBEDITORWIDTH);
    }

    @JsonIgnore
    public void resetMBEditorWidth() {
        this._reset(DTOFIELD_MBEDITORWIDTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO mbeditorwidth(Integer mBEditorWidth) {
        this.setMBEditorWidth(mBEditorWidth);
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
    public PSSysDEFTypeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minstrlength")
    public void setMinStrLength(Integer minStrLength) {
        this._set(DTOFIELD_MINSTRLENGTH, minStrLength);
    }

    @JsonIgnore
    public Integer getMinStrLength() {
        Object objValue = this._get(DTOFIELD_MINSTRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinStrLengthDirty() {
        return this._contains(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public void resetMinStrLength() {
        this._reset(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO minstrlength(Integer minStrLength) {
        this.setMinStrLength(minStrLength);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(String minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public String getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinValueDirty() {
        return this._contains(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public void resetMinValue() {
        this._reset(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO minvalue(String minValue) {
        this.setMinValue(minValue);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="precision")
    public void setPrecision(Integer precision) {
        this._set(DTOFIELD_PRECISION, precision);
        this._set(FIELD_PRECISION, precision);
    }

    @JsonIgnore
    public Integer getPrecision() {
        Object objValue = this._get(DTOFIELD_PRECISION);
        if (objValue == null && (objValue = this._get(FIELD_PRECISION)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        if (this._contains(DTOFIELD_PRECISION)) {
            return true;
        }
        return this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2() {
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated
    public void setPrecision2(Integer precision2) {
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty() {
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2() {
        this.resetPrecision();
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdeftypeid")
    public void setPSDEFTypeId(String pSDEFTypeId) {
        this._set(DTOFIELD_PSDEFTYPEID, pSDEFTypeId);
    }

    @JsonIgnore
    public String getPSDEFTypeId() {
        Object objValue = this._get(DTOFIELD_PSDEFTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFTypeIdDirty() {
        return this._contains(DTOFIELD_PSDEFTYPEID);
    }

    @JsonIgnore
    public void resetPSDEFTypeId() {
        this._reset(DTOFIELD_PSDEFTYPEID);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO psdeftypeid(String pSDEFTypeId) {
        this.setPSDEFTypeId(pSDEFTypeId);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO psdeftypeid(PSDEFTypeDTO pSDEFType) {
        if (pSDEFType == null) {
            this.setPSDEFTypeId(null);
            this.setPSDEFTypeName(null);
        } else {
            this.setPSDEFTypeId(pSDEFType.getPSDEFTypeId());
            this.setPSDEFTypeName(pSDEFType.getPSDEFTypeName());
        }
        return this;
    }

    @JsonProperty(value="psdeftypename")
    public void setPSDEFTypeName(String pSDEFTypeName) {
        this._set(DTOFIELD_PSDEFTYPENAME, pSDEFTypeName);
    }

    @JsonIgnore
    public String getPSDEFTypeName() {
        Object objValue = this._get(DTOFIELD_PSDEFTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFTypeNameDirty() {
        return this._contains(DTOFIELD_PSDEFTYPENAME);
    }

    @JsonIgnore
    public void resetPSDEFTypeName() {
        this._reset(DTOFIELD_PSDEFTYPENAME);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO psdeftypename(String pSDEFTypeName) {
        this.setPSDEFTypeName(pSDEFTypeName);
        return this;
    }

    @JsonProperty(value="pssysdeftypeid")
    public void setPSSysDEFTypeId(String pSSysDEFTypeId) {
        this._set(DTOFIELD_PSSYSDEFTYPEID, pSSysDEFTypeId);
    }

    @JsonIgnore
    public String getPSSysDEFTypeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDEFTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDEFTypeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDEFTYPEID);
    }

    @JsonIgnore
    public void resetPSSysDEFTypeId() {
        this._reset(DTOFIELD_PSSYSDEFTYPEID);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysdeftypeid(String pSSysDEFTypeId) {
        this.setPSSysDEFTypeId(pSSysDEFTypeId);
        return this;
    }

    @JsonProperty(value="pssysdeftypename")
    public void setPSSysDEFTypeName(String pSSysDEFTypeName) {
        this._set(DTOFIELD_PSSYSDEFTYPENAME, pSSysDEFTypeName);
    }

    @JsonIgnore
    public String getPSSysDEFTypeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDEFTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDEFTypeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDEFTYPENAME);
    }

    @JsonIgnore
    public void resetPSSysDEFTypeName() {
        this._reset(DTOFIELD_PSSYSDEFTYPENAME);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysdeftypename(String pSSysDEFTypeName) {
        this.setPSSysDEFTypeName(pSSysDEFTypeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDEFTypeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDEFTypeName(strName);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO name(String strName) {
        this.setPSSysDEFTypeName(strName);
        return this;
    }

    @JsonProperty(value="pssysunitid")
    public void setPSSysUnitId(String pSSysUnitId) {
        this._set(DTOFIELD_PSSYSUNITID, pSSysUnitId);
    }

    @JsonIgnore
    public String getPSSysUnitId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public void resetPSSysUnitId() {
        this._reset(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysunitid(String pSSysUnitId) {
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysunitid(PSSysUnitDTO pSSysUnit) {
        if (pSSysUnit == null) {
            this.setPSSysUnitId(null);
            this.setPSSysUnitName(null);
        } else {
            this.setPSSysUnitId(pSSysUnit.getPSSysUnitId());
            this.setPSSysUnitName(pSSysUnit.getPSSysUnitName());
        }
        return this;
    }

    @JsonProperty(value="pssysunitname")
    public void setPSSysUnitName(String pSSysUnitName) {
        this._set(DTOFIELD_PSSYSUNITNAME, pSSysUnitName);
    }

    @JsonIgnore
    public String getPSSysUnitName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public void resetPSSysUnitName() {
        this._reset(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysunitname(String pSSysUnitName) {
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSSysValueRuleId() {
        this._reset(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
        if (pSSysValueRule == null) {
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        } else {
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="pssysvaluerulename")
    public void setPSSysValueRuleName(String pSSysValueRuleName) {
        this._set(DTOFIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }

    @JsonIgnore
    public String getPSSysValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSSysValueRuleName() {
        this._reset(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="pyformat")
    public void setPYFormat(String pYFormat) {
        this._set(DTOFIELD_PYFORMAT, pYFormat);
    }

    @JsonIgnore
    public String getPYFormat() {
        Object objValue = this._get(DTOFIELD_PYFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPYFormatDirty() {
        return this._contains(DTOFIELD_PYFORMAT);
    }

    @JsonIgnore
    public void resetPYFormat() {
        this._reset(DTOFIELD_PYFORMAT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO pyformat(String pYFormat) {
        this.setPYFormat(pYFormat);
        return this;
    }

    @JsonProperty(value="searcheditorheight")
    public void setSearchEditorHeight(Integer searchEditorHeight) {
        this._set(DTOFIELD_SEARCHEDITORHEIGHT, searchEditorHeight);
    }

    @JsonIgnore
    public Integer getSearchEditorHeight() {
        Object objValue = this._get(DTOFIELD_SEARCHEDITORHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSearchEditorHeightDirty() {
        return this._contains(DTOFIELD_SEARCHEDITORHEIGHT);
    }

    @JsonIgnore
    public void resetSearchEditorHeight() {
        this._reset(DTOFIELD_SEARCHEDITORHEIGHT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searcheditorheight(Integer searchEditorHeight) {
        this.setSearchEditorHeight(searchEditorHeight);
        return this;
    }

    @JsonProperty(value="searcheditortype")
    public void setSearchEditorType(String searchEditorType) {
        this._set(DTOFIELD_SEARCHEDITORTYPE, searchEditorType);
    }

    @JsonIgnore
    public String getSearchEditorType() {
        Object objValue = this._get(DTOFIELD_SEARCHEDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchEditorTypeDirty() {
        return this._contains(DTOFIELD_SEARCHEDITORTYPE);
    }

    @JsonIgnore
    public void resetSearchEditorType() {
        this._reset(DTOFIELD_SEARCHEDITORTYPE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searcheditortype(String searchEditorType) {
        this.setSearchEditorType(searchEditorType);
        return this;
    }

    @JsonProperty(value="searcheditorwidth")
    public void setSearchEditorWidth(Integer searchEditorWidth) {
        this._set(DTOFIELD_SEARCHEDITORWIDTH, searchEditorWidth);
    }

    @JsonIgnore
    public Integer getSearchEditorWidth() {
        Object objValue = this._get(DTOFIELD_SEARCHEDITORWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSearchEditorWidthDirty() {
        return this._contains(DTOFIELD_SEARCHEDITORWIDTH);
    }

    @JsonIgnore
    public void resetSearchEditorWidth() {
        this._reset(DTOFIELD_SEARCHEDITORWIDTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searcheditorwidth(Integer searchEditorWidth) {
        this.setSearchEditorWidth(searchEditorWidth);
        return this;
    }

    @JsonProperty(value="searchmbeditorheight")
    public void setSearchMBEditorHeight(Integer searchMBEditorHeight) {
        this._set(DTOFIELD_SEARCHMBEDITORHEIGHT, searchMBEditorHeight);
    }

    @JsonIgnore
    public Integer getSearchMBEditorHeight() {
        Object objValue = this._get(DTOFIELD_SEARCHMBEDITORHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSearchMBEditorHeightDirty() {
        return this._contains(DTOFIELD_SEARCHMBEDITORHEIGHT);
    }

    @JsonIgnore
    public void resetSearchMBEditorHeight() {
        this._reset(DTOFIELD_SEARCHMBEDITORHEIGHT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searchmbeditorheight(Integer searchMBEditorHeight) {
        this.setSearchMBEditorHeight(searchMBEditorHeight);
        return this;
    }

    @JsonProperty(value="searchmbeditortype")
    public void setSearchMBEditorType(String searchMBEditorType) {
        this._set(DTOFIELD_SEARCHMBEDITORTYPE, searchMBEditorType);
    }

    @JsonIgnore
    public String getSearchMBEditorType() {
        Object objValue = this._get(DTOFIELD_SEARCHMBEDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchMBEditorTypeDirty() {
        return this._contains(DTOFIELD_SEARCHMBEDITORTYPE);
    }

    @JsonIgnore
    public void resetSearchMBEditorType() {
        this._reset(DTOFIELD_SEARCHMBEDITORTYPE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searchmbeditortype(String searchMBEditorType) {
        this.setSearchMBEditorType(searchMBEditorType);
        return this;
    }

    @JsonProperty(value="searchmbeditorwidth")
    public void setSearchMBEditorWidth(Integer searchMBEditorWidth) {
        this._set(DTOFIELD_SEARCHMBEDITORWIDTH, searchMBEditorWidth);
    }

    @JsonIgnore
    public Integer getSearchMBEditorWidth() {
        Object objValue = this._get(DTOFIELD_SEARCHMBEDITORWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSearchMBEditorWidthDirty() {
        return this._contains(DTOFIELD_SEARCHMBEDITORWIDTH);
    }

    @JsonIgnore
    public void resetSearchMBEditorWidth() {
        this._reset(DTOFIELD_SEARCHMBEDITORWIDTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO searchmbeditorwidth(Integer searchMBEditorWidth) {
        this.setSearchMBEditorWidth(searchMBEditorWidth);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStdDataTypeDirty() {
        return this._contains(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public void resetStdDataType() {
        this._reset(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="strlength")
    public void setStrLength(Integer strLength) {
        this._set(DTOFIELD_STRLENGTH, strLength);
    }

    @JsonIgnore
    public Integer getStrLength() {
        Object objValue = this._get(DTOFIELD_STRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStrLengthDirty() {
        return this._contains(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public void resetStrLength() {
        this._reset(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO strlength(Integer strLength) {
        this.setStrLength(strLength);
        return this;
    }

    @JsonProperty(value="tsformat")
    public void setTSFormat(String tSFormat) {
        this._set(DTOFIELD_TSFORMAT, tSFormat);
    }

    @JsonIgnore
    public String getTSFormat() {
        Object objValue = this._get(DTOFIELD_TSFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTSFormatDirty() {
        return this._contains(DTOFIELD_TSFORMAT);
    }

    @JsonIgnore
    public void resetTSFormat() {
        this._reset(DTOFIELD_TSFORMAT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO tsformat(String tSFormat) {
        this.setTSFormat(tSFormat);
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
    public PSSysDEFTypeDTO updatedate(Timestamp updateDate) {
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
    public PSSysDEFTypeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysDEFTypeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysDEFTypeDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valueformat")
    public void setValueFormat(String valueFormat) {
        this._set(DTOFIELD_VALUEFORMAT, valueFormat);
    }

    @JsonIgnore
    public String getValueFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFormatDirty() {
        return this._contains(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public void resetValueFormat() {
        this._reset(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDEFTypeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDEFTypeId(strValue);
    }

    @JsonIgnore
    public PSSysDEFTypeDTO id(String strValue) {
        this.setPSSysDEFTypeId(strValue);
        return this;
    }
}
