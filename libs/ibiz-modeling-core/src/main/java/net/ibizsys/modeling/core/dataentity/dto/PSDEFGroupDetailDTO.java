package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFGroupDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DETAILPARAM = "DETAILPARAM";
    protected static final String DTOFIELD_DETAILPARAM = "detailparam";
    public static final String FIELD_DETAILPARAM2 = "DETAILPARAM2";
    protected static final String DTOFIELD_DETAILPARAM2 = "detailparam2";
    public static final String FIELD_DEFAULTVALUETYPE = "DVT";
    protected static final String DTOFIELD_DEFAULTVALUETYPE = "defaultvaluetype";
    public static final String FIELD_ENABLEUSERINPUT = "ENABLEUSERINPUT";
    protected static final String DTOFIELD_ENABLEUSERINPUT = "enableuserinput";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_MODIFYUSERINPUT = "MODIFYUSERINPUT";
    protected static final String DTOFIELD_MODIFYUSERINPUT = "modifyuserinput";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFGROUPDETAILID = "PSDEFGROUPDETAILID";
    protected static final String DTOFIELD_PSDEFGROUPDETAILID = "psdefgroupdetailid";
    public static final String FIELD_PSDEFGROUPDETAILNAME = "PSDEFGROUPDETAILNAME";
    protected static final String DTOFIELD_PSDEFGROUPDETAILNAME = "psdefgroupdetailname";
    public static final String FIELD_PSDEFGROUPID = "PSDEFGROUPID";
    protected static final String DTOFIELD_PSDEFGROUPID = "psdefgroupid";
    public static final String FIELD_PSDEFGROUPNAME = "PSDEFGROUPNAME";
    protected static final String DTOFIELD_PSDEFGROUPNAME = "psdefgroupname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFUIMODEID = "PSDEFUIMODEID";
    protected static final String DTOFIELD_PSDEFUIMODEID = "psdefuimodeid";
    public static final String FIELD_PSDEFUIMODENAME = "PSDEFUIMODENAME";
    protected static final String DTOFIELD_PSDEFUIMODENAME = "psdefuimodename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_SEARCHMODES = "SEARCHMODES";
    protected static final String DTOFIELD_SEARCHMODES = "searchmodes";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_STRLENGTH = "STRLENGTH";
    protected static final String DTOFIELD_STRLENGTH = "strlength";
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

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowEmptyDirty() {
        return this._contains(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public void resetAllowEmpty() {
        this._reset(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
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
    public PSDEFGroupDetailDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
    public PSDEFGroupDetailDTO createdate(Timestamp createDate) {
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
    public PSDEFGroupDetailDTO createman(String createMan) {
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
    public PSDEFGroupDetailDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="detailparam")
    public void setDetailParam(String detailParam) {
        this._set(DTOFIELD_DETAILPARAM, detailParam);
    }

    @JsonIgnore
    public String getDetailParam() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParamDirty() {
        return this._contains(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public void resetDetailParam() {
        this._reset(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO detailparam(String detailParam) {
        this.setDetailParam(detailParam);
        return this;
    }

    @JsonProperty(value="detailparam2")
    public void setDetailParam2(String detailParam2) {
        this._set(DTOFIELD_DETAILPARAM2, detailParam2);
    }

    @JsonIgnore
    public String getDetailParam2() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParam2Dirty() {
        return this._contains(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public void resetDetailParam2() {
        this._reset(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO detailparam2(String detailParam2) {
        this.setDetailParam2(detailParam2);
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
    public PSDEFGroupDetailDTO defaultvaluetype(String defaultValueType) {
        this.setDefaultValueType(defaultValueType);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO defaultvaluetype(PSModelEnums.DEFDefaultValueType defaultValueType) {
        if (defaultValueType == null) {
            this.setDefaultValueType(null);
        } else {
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    @JsonProperty(value="enableuserinput")
    public void setEnableUserInput(Integer enableUserInput) {
        this._set(DTOFIELD_ENABLEUSERINPUT, enableUserInput);
    }

    @JsonIgnore
    public Integer getEnableUserInput() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERINPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserInputDirty() {
        return this._contains(DTOFIELD_ENABLEUSERINPUT);
    }

    @JsonIgnore
    public void resetEnableUserInput() {
        this._reset(DTOFIELD_ENABLEUSERINPUT);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO enableuserinput(Integer enableUserInput) {
        this.setEnableUserInput(enableUserInput);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO enableuserinput(PSModelEnums.UserInputMode[] enableUserInput) {
        if (enableUserInput == null || enableUserInput.length == 0) {
            this.setEnableUserInput(null);
        } else {
            int _value = 0;
            for (PSModelEnums.UserInputMode _item : enableUserInput) {
                _value |= _item.value;
            }
            this.setEnableUserInput(_value);
        }
        return this;
    }

    @JsonProperty(value="jsonformat")
    public void setJsonFormat(String jsonFormat) {
        this._set(DTOFIELD_JSONFORMAT, jsonFormat);
    }

    @JsonIgnore
    public String getJsonFormat() {
        Object objValue = this._get(DTOFIELD_JSONFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJsonFormatDirty() {
        return this._contains(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public void resetJsonFormat() {
        this._reset(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
        return this;
    }

    @JsonProperty(value="lnpslanresid")
    public void setLNPSLanResId(String lNPSLanResId) {
        this._set(DTOFIELD_LNPSLANRESID, lNPSLanResId);
    }

    @JsonIgnore
    public String getLNPSLanResId() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResIdDirty() {
        return this._contains(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public void resetLNPSLanResId() {
        this._reset(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresid(String lNPSLanResId) {
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        } else {
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="lnpslanresname")
    public void setLNPSLanResName(String lNPSLanResName) {
        this._set(DTOFIELD_LNPSLANRESNAME, lNPSLanResName);
    }

    @JsonIgnore
    public String getLNPSLanResName() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResNameDirty() {
        return this._contains(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public void resetLNPSLanResName() {
        this._reset(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresname(String lNPSLanResName) {
        this.setLNPSLanResName(lNPSLanResName);
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
    public PSDEFGroupDetailDTO maxvalue(String maxValue) {
        this.setMaxValue(maxValue);
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
    public PSDEFGroupDetailDTO memo(String memo) {
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
    public PSDEFGroupDetailDTO minstrlength(Integer minStrLength) {
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
    public PSDEFGroupDetailDTO minvalue(String minValue) {
        this.setMinValue(minValue);
        return this;
    }

    @JsonProperty(value="modifyuserinput")
    public void setModifyUserInput(Integer modifyUserInput) {
        this._set(DTOFIELD_MODIFYUSERINPUT, modifyUserInput);
    }

    @JsonIgnore
    public Integer getModifyUserInput() {
        Object objValue = this._get(DTOFIELD_MODIFYUSERINPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModifyUserInputDirty() {
        return this._contains(DTOFIELD_MODIFYUSERINPUT);
    }

    @JsonIgnore
    public void resetModifyUserInput() {
        this._reset(DTOFIELD_MODIFYUSERINPUT);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO modifyuserinput(Integer modifyUserInput) {
        this.setModifyUserInput(modifyUserInput);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO modifyuserinput(Boolean modifyUserInput) {
        if (modifyUserInput == null) {
            this.setModifyUserInput(null);
        } else {
            this.setModifyUserInput(modifyUserInput != false ? 1 : 0);
        }
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
    public PSDEFGroupDetailDTO ordervalue(Integer orderValue) {
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
    public PSDEFGroupDetailDTO precision(Integer precision) {
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
    public PSDEFGroupDetailDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEFGroupDetailDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdefgroupdetailid")
    public void setPSDEFGroupDetailId(String pSDEFGroupDetailId) {
        this._set(DTOFIELD_PSDEFGROUPDETAILID, pSDEFGroupDetailId);
    }

    @JsonIgnore
    public String getPSDEFGroupDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPDETAILID);
    }

    @JsonIgnore
    public void resetPSDEFGroupDetailId() {
        this._reset(DTOFIELD_PSDEFGROUPDETAILID);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupdetailid(String pSDEFGroupDetailId) {
        this.setPSDEFGroupDetailId(pSDEFGroupDetailId);
        return this;
    }

    @JsonProperty(value="psdefgroupdetailname")
    public void setPSDEFGroupDetailName(String pSDEFGroupDetailName) {
        this._set(DTOFIELD_PSDEFGROUPDETAILNAME, pSDEFGroupDetailName);
    }

    @JsonIgnore
    public String getPSDEFGroupDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEFGroupDetailName() {
        this._reset(DTOFIELD_PSDEFGROUPDETAILNAME);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupdetailname(String pSDEFGroupDetailName) {
        this.setPSDEFGroupDetailName(pSDEFGroupDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFGroupDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFGroupDetailName(strName);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO name(String strName) {
        this.setPSDEFGroupDetailName(strName);
        return this;
    }

    @JsonProperty(value="psdefgroupid")
    public void setPSDEFGroupId(String pSDEFGroupId) {
        this._set(DTOFIELD_PSDEFGROUPID, pSDEFGroupId);
    }

    @JsonIgnore
    public String getPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public void resetPSDEFGroupId() {
        this._reset(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupid(String pSDEFGroupId) {
        this.setPSDEFGroupId(pSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
            this.setPSDEId(pSDEFGroup.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="psdefgroupname")
    public void setPSDEFGroupName(String pSDEFGroupName) {
        this._set(DTOFIELD_PSDEFGROUPNAME, pSDEFGroupName);
    }

    @JsonIgnore
    public String getPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEFGroupName() {
        this._reset(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupname(String pSDEFGroupName) {
        this.setPSDEFGroupName(pSDEFGroupName);
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
    public PSDEFGroupDetailDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEFGroupDetailDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdefuimodeid")
    public void setPSDEFUIModeId(String pSDEFUIModeId) {
        this._set(DTOFIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }

    @JsonIgnore
    public String getPSDEFUIModeId() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public void resetPSDEFUIModeId() {
        this._reset(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefuimodeid(String pSDEFUIModeId) {
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefuimodeid(PSDEFUIModeDTO pSDEFUIMode) {
        if (pSDEFUIMode == null) {
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        } else {
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    @JsonProperty(value="psdefuimodename")
    public void setPSDEFUIModeName(String pSDEFUIModeName) {
        this._set(DTOFIELD_PSDEFUIMODENAME, pSDEFUIModeName);
    }

    @JsonIgnore
    public String getPSDEFUIModeName() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public void resetPSDEFUIModeName() {
        this._reset(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO psdefuimodename(String pSDEFUIModeName) {
        this.setPSDEFUIModeName(pSDEFUIModeName);
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
    public PSDEFGroupDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEFGroupDetailDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
    public PSDEFGroupDetailDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="searchmodes")
    public void setSearchModes(String searchModes) {
        this._set(DTOFIELD_SEARCHMODES, searchModes);
    }

    @JsonIgnore
    public String getSearchModes() {
        Object objValue = this._get(DTOFIELD_SEARCHMODES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchModesDirty() {
        return this._contains(DTOFIELD_SEARCHMODES);
    }

    @JsonIgnore
    public void resetSearchModes() {
        this._reset(DTOFIELD_SEARCHMODES);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO searchmodes(String searchModes) {
        this.setSearchModes(searchModes);
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public void resetServiceCodeName() {
        this._reset(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
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
    public PSDEFGroupDetailDTO strlength(Integer strLength) {
        this.setStrLength(strLength);
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
    public PSDEFGroupDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEFGroupDetailDTO updateman(String updateMan) {
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
    public PSDEFGroupDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFGroupDetailDTO usertag(String userTag) {
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
    public PSDEFGroupDetailDTO usertag2(String userTag2) {
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
    public PSDEFGroupDetailDTO usertag3(String userTag3) {
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
    public PSDEFGroupDetailDTO usertag4(String userTag4) {
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
    public PSDEFGroupDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFGroupDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFGroupDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO id(String strValue) {
        this.setPSDEFGroupDetailId(strValue);
        return this;
    }
}
