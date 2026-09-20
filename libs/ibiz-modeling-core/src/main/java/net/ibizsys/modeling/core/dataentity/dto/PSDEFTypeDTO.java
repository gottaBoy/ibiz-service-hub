package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFTypeDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATATYPES = "DATATYPES";
    protected static final String DTOFIELD_DATATYPES = "datatypes";
    public static final String FIELD_DOTNETFORMAT = "DOTNETFORMAT";
    protected static final String DTOFIELD_DOTNETFORMAT = "dotnetformat";
    public static final String FIELD_EDITORHEIGHT = "EDITORHEIGHT";
    protected static final String DTOFIELD_EDITORHEIGHT = "editorheight";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_EDITORWIDTH = "EDITORWIDTH";
    protected static final String DTOFIELD_EDITORWIDTH = "editorwidth";
    public static final String FIELD_FIELDS = "FIELDS";
    protected static final String DTOFIELD_FIELDS = "fields";
    public static final String FIELD_FORMITEMOBJ = "FORMITEMOBJ";
    protected static final String DTOFIELD_FORMITEMOBJ = "formitemobj";
    public static final String FIELD_GRIDCOLALIGN = "GRIDCOLALIGN";
    protected static final String DTOFIELD_GRIDCOLALIGN = "gridcolalign";
    public static final String FIELD_GRIDCOLCLMODE = "GRIDCOLCLMODE";
    protected static final String DTOFIELD_GRIDCOLCLMODE = "gridcolclmode";
    public static final String FIELD_GRIDCOLOBJ = "GRIDCOLOBJ";
    protected static final String DTOFIELD_GRIDCOLOBJ = "gridcolobj";
    public static final String FIELD_GRIDCOLWIDTH = "GRIDCOLWIDTH";
    protected static final String DTOFIELD_GRIDCOLWIDTH = "gridcolwidth";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_INCREMENTFLAG = "INCREMENTFLAG";
    protected static final String DTOFIELD_INCREMENTFLAG = "incrementflag";
    public static final String FIELD_JAVAFORMAT = "JAVAFORMAT";
    protected static final String DTOFIELD_JAVAFORMAT = "javaformat";
    public static final String FIELD_JSFORMAT = "JSFORMAT";
    protected static final String DTOFIELD_JSFORMAT = "jsformat";
    public static final String FIELD_MAXVALUESTR = "MAXVALUESTR";
    protected static final String DTOFIELD_MAXVALUESTR = "maxvaluestr";
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
    public static final String FIELD_MINVALUESTR = "MINVALUESTR";
    protected static final String DTOFIELD_MINVALUESTR = "minvaluestr";
    public static final String FIELD_OBJHELPER = "OBJHELPER";
    protected static final String DTOFIELD_OBJHELPER = "objhelper";
    public static final String FIELD_OBJHELPER2 = "OBJHELPER2";
    protected static final String DTOFIELD_OBJHELPER2 = "objhelper2";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSCODELISTTEMPLID = "PSCODELISTTEMPLID";
    protected static final String DTOFIELD_PSCODELISTTEMPLID = "pscodelisttemplid";
    public static final String FIELD_PSCODELISTTEMPLNAME = "PSCODELISTTEMPLNAME";
    protected static final String DTOFIELD_PSCODELISTTEMPLNAME = "pscodelisttemplname";
    public static final String FIELD_PSDEFTYPEID = "PSDEFTYPEID";
    protected static final String DTOFIELD_PSDEFTYPEID = "psdeftypeid";
    public static final String FIELD_PSDEFTYPENAME = "PSDEFTYPENAME";
    protected static final String DTOFIELD_PSDEFTYPENAME = "psdeftypename";
    public static final String FIELD_PSUNITID = "PSUNITID";
    protected static final String DTOFIELD_PSUNITID = "psunitid";
    public static final String FIELD_PSUNITNAME = "PSUNITNAME";
    protected static final String DTOFIELD_PSUNITNAME = "psunitname";
    public static final String FIELD_PSVALUERULEID = "PSVALUERULEID";
    protected static final String DTOFIELD_PSVALUERULEID = "psvalueruleid";
    public static final String FIELD_PSVALUERULENAME = "PSVALUERULENAME";
    protected static final String DTOFIELD_PSVALUERULENAME = "psvaluerulename";
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
    public static final String FIELD_SEARCHMODEOBJ = "SEARCHMODEOBJ";
    protected static final String DTOFIELD_SEARCHMODEOBJ = "searchmodeobj";
    public static final String FIELD_SFITEMOBJ = "SFITEMOBJ";
    protected static final String DTOFIELD_SFITEMOBJ = "sfitemobj";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_STRLENGTH = "STRLENGTH";
    protected static final String DTOFIELD_STRLENGTH = "strlength";
    public static final String FIELD_TESTDATA = "TESTDATA";
    protected static final String DTOFIELD_TESTDATA = "testdata";
    public static final String FIELD_TSFORMAT = "TSFORMAT";
    protected static final String DTOFIELD_TSFORMAT = "tsformat";
    public static final String FIELD_UIMODEOBJ = "UIMODEOBJ";
    protected static final String DTOFIELD_UIMODEOBJ = "uimodeobj";
    public static final String FIELD_UNSIGNEDFLAG = "UNSIGNEDFLAG";
    protected static final String DTOFIELD_UNSIGNEDFLAG = "unsignedflag";
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
    public PSDEFTypeDTO createdate(Timestamp createDate) {
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
    public PSDEFTypeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="datatypes")
    public void setDataTypes(String dataTypes) {
        this._set(DTOFIELD_DATATYPES, dataTypes);
    }

    @JsonIgnore
    public String getDataTypes() {
        Object objValue = this._get(DTOFIELD_DATATYPES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypesDirty() {
        return this._contains(DTOFIELD_DATATYPES);
    }

    @JsonIgnore
    public void resetDataTypes() {
        this._reset(DTOFIELD_DATATYPES);
    }

    @JsonIgnore
    public PSDEFTypeDTO datatypes(String dataTypes) {
        this.setDataTypes(dataTypes);
        return this;
    }

    @JsonProperty(value="dotnetformat")
    public void setDotNETFormat(String dotNETFormat) {
        this._set(DTOFIELD_DOTNETFORMAT, dotNETFormat);
    }

    @JsonIgnore
    public String getDotNETFormat() {
        Object objValue = this._get(DTOFIELD_DOTNETFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDotNETFormatDirty() {
        return this._contains(DTOFIELD_DOTNETFORMAT);
    }

    @JsonIgnore
    public void resetDotNETFormat() {
        this._reset(DTOFIELD_DOTNETFORMAT);
    }

    @JsonIgnore
    public PSDEFTypeDTO dotnetformat(String dotNETFormat) {
        this.setDotNETFormat(dotNETFormat);
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
    public PSDEFTypeDTO editorheight(Integer editorHeight) {
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
    public PSDEFTypeDTO editortype(String editorType) {
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
    public PSDEFTypeDTO editorwidth(Integer editorWidth) {
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
    public PSDEFTypeDTO fields(String fields) {
        this.setFields(fields);
        return this;
    }

    @JsonProperty(value="formitemobj")
    public void setFormItemObj(String formItemObj) {
        this._set(DTOFIELD_FORMITEMOBJ, formItemObj);
    }

    @JsonIgnore
    public String getFormItemObj() {
        Object objValue = this._get(DTOFIELD_FORMITEMOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormItemObjDirty() {
        return this._contains(DTOFIELD_FORMITEMOBJ);
    }

    @JsonIgnore
    public void resetFormItemObj() {
        this._reset(DTOFIELD_FORMITEMOBJ);
    }

    @JsonIgnore
    public PSDEFTypeDTO formitemobj(String formItemObj) {
        this.setFormItemObj(formItemObj);
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
    public PSDEFTypeDTO gridcolalign(String gridColAlign) {
        this.setGridColAlign(gridColAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFTypeDTO gridcolalign(PSModelEnums.GridColAlign gridColAlign) {
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
    public PSDEFTypeDTO gridcolclmode(String gridColCLMode) {
        this.setGridColCLMode(gridColCLMode);
        return this;
    }

    @JsonIgnore
    public PSDEFTypeDTO gridcolclmode(PSModelEnums.CodeListConvertMode gridColCLMode) {
        if (gridColCLMode == null) {
            this.setGridColCLMode(null);
        } else {
            this.setGridColCLMode(gridColCLMode.value);
        }
        return this;
    }

    @JsonProperty(value="gridcolobj")
    public void setGridColObj(String gridColObj) {
        this._set(DTOFIELD_GRIDCOLOBJ, gridColObj);
    }

    @JsonIgnore
    public String getGridColObj() {
        Object objValue = this._get(DTOFIELD_GRIDCOLOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColObjDirty() {
        return this._contains(DTOFIELD_GRIDCOLOBJ);
    }

    @JsonIgnore
    public void resetGridColObj() {
        this._reset(DTOFIELD_GRIDCOLOBJ);
    }

    @JsonIgnore
    public PSDEFTypeDTO gridcolobj(String gridColObj) {
        this.setGridColObj(gridColObj);
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
    public PSDEFTypeDTO gridcolwidth(Integer gridColWidth) {
        this.setGridColWidth(gridColWidth);
        return this;
    }

    @JsonProperty(value="iconpath")
    public void setIconPath(String iconPath) {
        this._set(DTOFIELD_ICONPATH, iconPath);
    }

    @JsonIgnore
    public String getIconPath() {
        Object objValue = this._get(DTOFIELD_ICONPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathDirty() {
        return this._contains(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public void resetIconPath() {
        this._reset(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public PSDEFTypeDTO iconpath(String iconPath) {
        this.setIconPath(iconPath);
        return this;
    }

    @JsonProperty(value="incrementflag")
    public void setIncrementFlag(Integer incrementFlag) {
        this._set(DTOFIELD_INCREMENTFLAG, incrementFlag);
    }

    @JsonIgnore
    public Integer getIncrementFlag() {
        Object objValue = this._get(DTOFIELD_INCREMENTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncrementFlagDirty() {
        return this._contains(DTOFIELD_INCREMENTFLAG);
    }

    @JsonIgnore
    public void resetIncrementFlag() {
        this._reset(DTOFIELD_INCREMENTFLAG);
    }

    @JsonIgnore
    public PSDEFTypeDTO incrementflag(Integer incrementFlag) {
        this.setIncrementFlag(incrementFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFTypeDTO incrementflag(Boolean incrementFlag) {
        if (incrementFlag == null) {
            this.setIncrementFlag(null);
        } else {
            this.setIncrementFlag(incrementFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="javaformat")
    public void setJAVAFormat(String jAVAFormat) {
        this._set(DTOFIELD_JAVAFORMAT, jAVAFormat);
    }

    @JsonIgnore
    public String getJAVAFormat() {
        Object objValue = this._get(DTOFIELD_JAVAFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJAVAFormatDirty() {
        return this._contains(DTOFIELD_JAVAFORMAT);
    }

    @JsonIgnore
    public void resetJAVAFormat() {
        this._reset(DTOFIELD_JAVAFORMAT);
    }

    @JsonIgnore
    public PSDEFTypeDTO javaformat(String jAVAFormat) {
        this.setJAVAFormat(jAVAFormat);
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
    public PSDEFTypeDTO jsformat(String jSFormat) {
        this.setJSFormat(jSFormat);
        return this;
    }

    @JsonProperty(value="maxvaluestr")
    public void setMaxValueStr(String maxValueStr) {
        this._set(DTOFIELD_MAXVALUESTR, maxValueStr);
    }

    @JsonIgnore
    public String getMaxValueStr() {
        Object objValue = this._get(DTOFIELD_MAXVALUESTR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaxValueStrDirty() {
        return this._contains(DTOFIELD_MAXVALUESTR);
    }

    @JsonIgnore
    public void resetMaxValueStr() {
        this._reset(DTOFIELD_MAXVALUESTR);
    }

    @JsonIgnore
    public PSDEFTypeDTO maxvaluestr(String maxValueStr) {
        this.setMaxValueStr(maxValueStr);
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
    public PSDEFTypeDTO mbeditorheight(Integer mBEditorHeight) {
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
    public PSDEFTypeDTO mbeditortype(String mBEditorType) {
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
    public PSDEFTypeDTO mbeditorwidth(Integer mBEditorWidth) {
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
    public PSDEFTypeDTO memo(String memo) {
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
    public PSDEFTypeDTO minstrlength(Integer minStrLength) {
        this.setMinStrLength(minStrLength);
        return this;
    }

    @JsonProperty(value="minvaluestr")
    public void setMinValueStr(String minValueStr) {
        this._set(DTOFIELD_MINVALUESTR, minValueStr);
    }

    @JsonIgnore
    public String getMinValueStr() {
        Object objValue = this._get(DTOFIELD_MINVALUESTR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinValueStrDirty() {
        return this._contains(DTOFIELD_MINVALUESTR);
    }

    @JsonIgnore
    public void resetMinValueStr() {
        this._reset(DTOFIELD_MINVALUESTR);
    }

    @JsonIgnore
    public PSDEFTypeDTO minvaluestr(String minValueStr) {
        this.setMinValueStr(minValueStr);
        return this;
    }

    @JsonProperty(value="objhelper")
    public void setObjHelper(String objHelper) {
        this._set(DTOFIELD_OBJHELPER, objHelper);
    }

    @JsonIgnore
    public String getObjHelper() {
        Object objValue = this._get(DTOFIELD_OBJHELPER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjHelperDirty() {
        return this._contains(DTOFIELD_OBJHELPER);
    }

    @JsonIgnore
    public void resetObjHelper() {
        this._reset(DTOFIELD_OBJHELPER);
    }

    @JsonIgnore
    public PSDEFTypeDTO objhelper(String objHelper) {
        this.setObjHelper(objHelper);
        return this;
    }

    @JsonProperty(value="objhelper2")
    public void setObjHelper2(String objHelper2) {
        this._set(DTOFIELD_OBJHELPER2, objHelper2);
    }

    @JsonIgnore
    public String getObjHelper2() {
        Object objValue = this._get(DTOFIELD_OBJHELPER2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjHelper2Dirty() {
        return this._contains(DTOFIELD_OBJHELPER2);
    }

    @JsonIgnore
    public void resetObjHelper2() {
        this._reset(DTOFIELD_OBJHELPER2);
    }

    @JsonIgnore
    public PSDEFTypeDTO objhelper2(String objHelper2) {
        this.setObjHelper2(objHelper2);
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
    public PSDEFTypeDTO ordervalue(Integer orderValue) {
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
    public PSDEFTypeDTO precision(Integer precision) {
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

    @JsonProperty(value="pscodelisttemplid")
    public void setPSCodeListTemplId(String pSCodeListTemplId) {
        this._set(DTOFIELD_PSCODELISTTEMPLID, pSCodeListTemplId);
    }

    @JsonIgnore
    public String getPSCodeListTemplId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListTemplIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTTEMPLID);
    }

    @JsonIgnore
    public void resetPSCodeListTemplId() {
        this._reset(DTOFIELD_PSCODELISTTEMPLID);
    }

    @JsonIgnore
    public PSDEFTypeDTO pscodelisttemplid(String pSCodeListTemplId) {
        this.setPSCodeListTemplId(pSCodeListTemplId);
        return this;
    }

    @JsonProperty(value="pscodelisttemplname")
    public void setPSCodeListTemplName(String pSCodeListTemplName) {
        this._set(DTOFIELD_PSCODELISTTEMPLNAME, pSCodeListTemplName);
    }

    @JsonIgnore
    public String getPSCodeListTemplName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListTemplNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSCodeListTemplName() {
        this._reset(DTOFIELD_PSCODELISTTEMPLNAME);
    }

    @JsonIgnore
    public PSDEFTypeDTO pscodelisttemplname(String pSCodeListTemplName) {
        this.setPSCodeListTemplName(pSCodeListTemplName);
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
    public PSDEFTypeDTO psdeftypeid(String pSDEFTypeId) {
        this.setPSDEFTypeId(pSDEFTypeId);
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
    public PSDEFTypeDTO psdeftypename(String pSDEFTypeName) {
        this.setPSDEFTypeName(pSDEFTypeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFTypeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFTypeName(strName);
    }

    @JsonIgnore
    public PSDEFTypeDTO name(String strName) {
        this.setPSDEFTypeName(strName);
        return this;
    }

    @JsonProperty(value="psunitid")
    public void setPSUnitId(String pSUnitId) {
        this._set(DTOFIELD_PSUNITID, pSUnitId);
    }

    @JsonIgnore
    public String getPSUnitId() {
        Object objValue = this._get(DTOFIELD_PSUNITID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUnitIdDirty() {
        return this._contains(DTOFIELD_PSUNITID);
    }

    @JsonIgnore
    public void resetPSUnitId() {
        this._reset(DTOFIELD_PSUNITID);
    }

    @JsonIgnore
    public PSDEFTypeDTO psunitid(String pSUnitId) {
        this.setPSUnitId(pSUnitId);
        return this;
    }

    @JsonProperty(value="psunitname")
    public void setPSUnitName(String pSUnitName) {
        this._set(DTOFIELD_PSUNITNAME, pSUnitName);
    }

    @JsonIgnore
    public String getPSUnitName() {
        Object objValue = this._get(DTOFIELD_PSUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUnitNameDirty() {
        return this._contains(DTOFIELD_PSUNITNAME);
    }

    @JsonIgnore
    public void resetPSUnitName() {
        this._reset(DTOFIELD_PSUNITNAME);
    }

    @JsonIgnore
    public PSDEFTypeDTO psunitname(String pSUnitName) {
        this.setPSUnitName(pSUnitName);
        return this;
    }

    @JsonProperty(value="psvalueruleid")
    public void setPSValueRuleId(String pSValueRuleId) {
        this._set(DTOFIELD_PSVALUERULEID, pSValueRuleId);
    }

    @JsonIgnore
    public String getPSValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSValueRuleId() {
        this._reset(DTOFIELD_PSVALUERULEID);
    }

    @JsonIgnore
    public PSDEFTypeDTO psvalueruleid(String pSValueRuleId) {
        this.setPSValueRuleId(pSValueRuleId);
        return this;
    }

    @JsonProperty(value="psvaluerulename")
    public void setPSValueRuleName(String pSValueRuleName) {
        this._set(DTOFIELD_PSVALUERULENAME, pSValueRuleName);
    }

    @JsonIgnore
    public String getPSValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSValueRuleName() {
        this._reset(DTOFIELD_PSVALUERULENAME);
    }

    @JsonIgnore
    public PSDEFTypeDTO psvaluerulename(String pSValueRuleName) {
        this.setPSValueRuleName(pSValueRuleName);
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
    public PSDEFTypeDTO pyformat(String pYFormat) {
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
    public PSDEFTypeDTO searcheditorheight(Integer searchEditorHeight) {
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
    public PSDEFTypeDTO searcheditortype(String searchEditorType) {
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
    public PSDEFTypeDTO searcheditorwidth(Integer searchEditorWidth) {
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
    public PSDEFTypeDTO searchmbeditorheight(Integer searchMBEditorHeight) {
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
    public PSDEFTypeDTO searchmbeditortype(String searchMBEditorType) {
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
    public PSDEFTypeDTO searchmbeditorwidth(Integer searchMBEditorWidth) {
        this.setSearchMBEditorWidth(searchMBEditorWidth);
        return this;
    }

    @JsonProperty(value="searchmodeobj")
    public void setSearchModeObj(String searchModeObj) {
        this._set(DTOFIELD_SEARCHMODEOBJ, searchModeObj);
    }

    @JsonIgnore
    public String getSearchModeObj() {
        Object objValue = this._get(DTOFIELD_SEARCHMODEOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchModeObjDirty() {
        return this._contains(DTOFIELD_SEARCHMODEOBJ);
    }

    @JsonIgnore
    public void resetSearchModeObj() {
        this._reset(DTOFIELD_SEARCHMODEOBJ);
    }

    @JsonIgnore
    public PSDEFTypeDTO searchmodeobj(String searchModeObj) {
        this.setSearchModeObj(searchModeObj);
        return this;
    }

    @JsonProperty(value="sfitemobj")
    public void setSFItemObj(String sFItemObj) {
        this._set(DTOFIELD_SFITEMOBJ, sFItemObj);
    }

    @JsonIgnore
    public String getSFItemObj() {
        Object objValue = this._get(DTOFIELD_SFITEMOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSFItemObjDirty() {
        return this._contains(DTOFIELD_SFITEMOBJ);
    }

    @JsonIgnore
    public void resetSFItemObj() {
        this._reset(DTOFIELD_SFITEMOBJ);
    }

    @JsonIgnore
    public PSDEFTypeDTO sfitemobj(String sFItemObj) {
        this.setSFItemObj(sFItemObj);
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
    public PSDEFTypeDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSDEFTypeDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
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
    public PSDEFTypeDTO strlength(Integer strLength) {
        this.setStrLength(strLength);
        return this;
    }

    @JsonProperty(value="testdata")
    public void setTestData(String testData) {
        this._set(DTOFIELD_TESTDATA, testData);
    }

    @JsonIgnore
    public String getTestData() {
        Object objValue = this._get(DTOFIELD_TESTDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestDataDirty() {
        return this._contains(DTOFIELD_TESTDATA);
    }

    @JsonIgnore
    public void resetTestData() {
        this._reset(DTOFIELD_TESTDATA);
    }

    @JsonIgnore
    public PSDEFTypeDTO testdata(String testData) {
        this.setTestData(testData);
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
    public PSDEFTypeDTO tsformat(String tSFormat) {
        this.setTSFormat(tSFormat);
        return this;
    }

    @JsonProperty(value="uimodeobj")
    public void setUIModeObj(String uIModeObj) {
        this._set(DTOFIELD_UIMODEOBJ, uIModeObj);
    }

    @JsonIgnore
    public String getUIModeObj() {
        Object objValue = this._get(DTOFIELD_UIMODEOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUIModeObjDirty() {
        return this._contains(DTOFIELD_UIMODEOBJ);
    }

    @JsonIgnore
    public void resetUIModeObj() {
        this._reset(DTOFIELD_UIMODEOBJ);
    }

    @JsonIgnore
    public PSDEFTypeDTO uimodeobj(String uIModeObj) {
        this.setUIModeObj(uIModeObj);
        return this;
    }

    @JsonProperty(value="unsignedflag")
    public void setUnsignedFlag(Integer unsignedFlag) {
        this._set(DTOFIELD_UNSIGNEDFLAG, unsignedFlag);
    }

    @JsonIgnore
    public Integer getUnsignedFlag() {
        Object objValue = this._get(DTOFIELD_UNSIGNEDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUnsignedFlagDirty() {
        return this._contains(DTOFIELD_UNSIGNEDFLAG);
    }

    @JsonIgnore
    public void resetUnsignedFlag() {
        this._reset(DTOFIELD_UNSIGNEDFLAG);
    }

    @JsonIgnore
    public PSDEFTypeDTO unsignedflag(Integer unsignedFlag) {
        this.setUnsignedFlag(unsignedFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFTypeDTO unsignedflag(Boolean unsignedFlag) {
        if (unsignedFlag == null) {
            this.setUnsignedFlag(null);
        } else {
            this.setUnsignedFlag(unsignedFlag != false ? 1 : 0);
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
    public PSDEFTypeDTO updatedate(Timestamp updateDate) {
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
    public PSDEFTypeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFTypeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFTypeId(strValue);
    }

    @JsonIgnore
    public PSDEFTypeDTO id(String strValue) {
        this.setPSDEFTypeId(strValue);
        return this;
    }
}
