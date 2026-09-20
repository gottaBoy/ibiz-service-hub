package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDataTypeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAISchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEAIDataTypeDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EAIDATATYPETAG = "EAIDATATYPETAG";
    protected static final String DTOFIELD_EAIDATATYPETAG = "eaidatatypetag";
    public static final String FIELD_EAIDATATYPETAG2 = "EAIDATATYPETAG2";
    protected static final String DTOFIELD_EAIDATATYPETAG2 = "eaidatatypetag2";
    public static final String FIELD_ENABLEENUM = "ENABLEENUM";
    protected static final String DTOFIELD_ENABLEENUM = "enableenum";
    public static final String FIELD_INCMAXVALUE = "INCMAXVALUE";
    protected static final String DTOFIELD_INCMAXVALUE = "incmaxvalue";
    public static final String FIELD_INCMINVALUE = "INCMINVALUE";
    protected static final String DTOFIELD_INCMINVALUE = "incminvalue";
    public static final String FIELD_MAXSTRLENGTH = "MAXSTRLENGTH";
    protected static final String DTOFIELD_MAXSTRLENGTH = "maxstrlength";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSSYSEAIDATATYPEID = "PSSYSEAIDATATYPEID";
    protected static final String DTOFIELD_PSSYSEAIDATATYPEID = "pssyseaidatatypeid";
    public static final String FIELD_PSSYSEAIDATATYPENAME = "PSSYSEAIDATATYPENAME";
    protected static final String DTOFIELD_PSSYSEAIDATATYPENAME = "pssyseaidatatypename";
    public static final String FIELD_PSSYSEAISCHEMEID = "PSSYSEAISCHEMEID";
    protected static final String DTOFIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";
    public static final String FIELD_PSSYSEAISCHEMENAME = "PSSYSEAISCHEMENAME";
    protected static final String DTOFIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";
    public static final String FIELD_REGEXPCODE = "REGEXPCODE";
    protected static final String DTOFIELD_REGEXPCODE = "regexpcode";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
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
    public static final String DTOFIELD_PSSYSEAIDATATYPEITEMS = "pssyseaidatatypeitems";

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
    public PSSysEAIDataTypeDTO codename(String codeName) {
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
    public PSSysEAIDataTypeDTO createdate(Timestamp createDate) {
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
    public PSSysEAIDataTypeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="eaidatatypetag")
    public void setEAIDataTypeTag(String eAIDataTypeTag) {
        this._set(DTOFIELD_EAIDATATYPETAG, eAIDataTypeTag);
    }

    @JsonIgnore
    public String getEAIDataTypeTag() {
        Object objValue = this._get(DTOFIELD_EAIDATATYPETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDataTypeTagDirty() {
        return this._contains(DTOFIELD_EAIDATATYPETAG);
    }

    @JsonIgnore
    public void resetEAIDataTypeTag() {
        this._reset(DTOFIELD_EAIDATATYPETAG);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO eaidatatypetag(String eAIDataTypeTag) {
        this.setEAIDataTypeTag(eAIDataTypeTag);
        return this;
    }

    @JsonProperty(value="eaidatatypetag2")
    public void setEAIDataTypeTag2(String eAIDataTypeTag2) {
        this._set(DTOFIELD_EAIDATATYPETAG2, eAIDataTypeTag2);
    }

    @JsonIgnore
    public String getEAIDataTypeTag2() {
        Object objValue = this._get(DTOFIELD_EAIDATATYPETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEAIDataTypeTag2Dirty() {
        return this._contains(DTOFIELD_EAIDATATYPETAG2);
    }

    @JsonIgnore
    public void resetEAIDataTypeTag2() {
        this._reset(DTOFIELD_EAIDATATYPETAG2);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO eaidatatypetag2(String eAIDataTypeTag2) {
        this.setEAIDataTypeTag2(eAIDataTypeTag2);
        return this;
    }

    @JsonProperty(value="enableenum")
    public void setEnableEnum(Integer enableEnum) {
        this._set(DTOFIELD_ENABLEENUM, enableEnum);
    }

    @JsonIgnore
    public Integer getEnableEnum() {
        Object objValue = this._get(DTOFIELD_ENABLEENUM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableEnumDirty() {
        return this._contains(DTOFIELD_ENABLEENUM);
    }

    @JsonIgnore
    public void resetEnableEnum() {
        this._reset(DTOFIELD_ENABLEENUM);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO enableenum(Integer enableEnum) {
        this.setEnableEnum(enableEnum);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO enableenum(Boolean enableEnum) {
        if (enableEnum == null) {
            this.setEnableEnum(null);
        } else {
            this.setEnableEnum(enableEnum != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="incmaxvalue")
    public void setIncMaxValue(Integer incMaxValue) {
        this._set(DTOFIELD_INCMAXVALUE, incMaxValue);
    }

    @JsonIgnore
    public Integer getIncMaxValue() {
        Object objValue = this._get(DTOFIELD_INCMAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncMaxValueDirty() {
        return this._contains(DTOFIELD_INCMAXVALUE);
    }

    @JsonIgnore
    public void resetIncMaxValue() {
        this._reset(DTOFIELD_INCMAXVALUE);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO incmaxvalue(Integer incMaxValue) {
        this.setIncMaxValue(incMaxValue);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO incmaxvalue(Boolean incMaxValue) {
        if (incMaxValue == null) {
            this.setIncMaxValue(null);
        } else {
            this.setIncMaxValue(incMaxValue != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="incminvalue")
    public void setIncMinValue(Integer incMinValue) {
        this._set(DTOFIELD_INCMINVALUE, incMinValue);
    }

    @JsonIgnore
    public Integer getIncMinValue() {
        Object objValue = this._get(DTOFIELD_INCMINVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncMinValueDirty() {
        return this._contains(DTOFIELD_INCMINVALUE);
    }

    @JsonIgnore
    public void resetIncMinValue() {
        this._reset(DTOFIELD_INCMINVALUE);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO incminvalue(Integer incMinValue) {
        this.setIncMinValue(incMinValue);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO incminvalue(Boolean incMinValue) {
        if (incMinValue == null) {
            this.setIncMinValue(null);
        } else {
            this.setIncMinValue(incMinValue != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="maxstrlength")
    public void setMaxStrLength(Integer maxStrLength) {
        this._set(DTOFIELD_MAXSTRLENGTH, maxStrLength);
    }

    @JsonIgnore
    public Integer getMaxStrLength() {
        Object objValue = this._get(DTOFIELD_MAXSTRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxStrLengthDirty() {
        return this._contains(DTOFIELD_MAXSTRLENGTH);
    }

    @JsonIgnore
    public void resetMaxStrLength() {
        this._reset(DTOFIELD_MAXSTRLENGTH);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO maxstrlength(Integer maxStrLength) {
        this.setMaxStrLength(maxStrLength);
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
    public PSSysEAIDataTypeDTO maxvalue(String maxValue) {
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
    public PSSysEAIDataTypeDTO memo(String memo) {
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
    public PSSysEAIDataTypeDTO minstrlength(Integer minStrLength) {
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
    public PSSysEAIDataTypeDTO minvalue(String minValue) {
        this.setMinValue(minValue);
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
    public PSSysEAIDataTypeDTO precision(Integer precision) {
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

    @JsonProperty(value="pssyseaidatatypeid")
    public void setPSSysEAIDataTypeId(String pSSysEAIDataTypeId) {
        this._set(DTOFIELD_PSSYSEAIDATATYPEID, pSSysEAIDataTypeId);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPEID);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeId() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPEID);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO pssyseaidatatypeid(String pSSysEAIDataTypeId) {
        this.setPSSysEAIDataTypeId(pSSysEAIDataTypeId);
        return this;
    }

    @JsonProperty(value="pssyseaidatatypename")
    public void setPSSysEAIDataTypeName(String pSSysEAIDataTypeName) {
        this._set(DTOFIELD_PSSYSEAIDATATYPENAME, pSSysEAIDataTypeName);
    }

    @JsonIgnore
    public String getPSSysEAIDataTypeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIDATATYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIDataTypeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIDATATYPENAME);
    }

    @JsonIgnore
    public void resetPSSysEAIDataTypeName() {
        this._reset(DTOFIELD_PSSYSEAIDATATYPENAME);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO pssyseaidatatypename(String pSSysEAIDataTypeName) {
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEAIDataTypeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEAIDataTypeName(strName);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO name(String strName) {
        this.setPSSysEAIDataTypeName(strName);
        return this;
    }

    @JsonProperty(value="pssyseaischemeid")
    public void setPSSysEAISchemeId(String pSSysEAISchemeId) {
        this._set(DTOFIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }

    @JsonIgnore
    public String getPSSysEAISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeId() {
        this._reset(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme) {
        if (pSSysEAIScheme == null) {
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        } else {
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaischemename")
    public void setPSSysEAISchemeName(String pSSysEAISchemeName) {
        this._set(DTOFIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }

    @JsonIgnore
    public String getPSSysEAISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeName() {
        this._reset(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO pssyseaischemename(String pSSysEAISchemeName) {
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    @JsonProperty(value="regexpcode")
    public void setRegExpCode(String regExpCode) {
        this._set(DTOFIELD_REGEXPCODE, regExpCode);
    }

    @JsonIgnore
    public String getRegExpCode() {
        Object objValue = this._get(DTOFIELD_REGEXPCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegExpCodeDirty() {
        return this._contains(DTOFIELD_REGEXPCODE);
    }

    @JsonIgnore
    public void resetRegExpCode() {
        this._reset(DTOFIELD_REGEXPCODE);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO regexpcode(String regExpCode) {
        this.setRegExpCode(regExpCode);
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
    public PSSysEAIDataTypeDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
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
    public PSSysEAIDataTypeDTO updatedate(Timestamp updateDate) {
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
    public PSSysEAIDataTypeDTO updateman(String updateMan) {
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
    public PSSysEAIDataTypeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEAIDataTypeDTO usertag(String userTag) {
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
    public PSSysEAIDataTypeDTO usertag2(String userTag2) {
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
    public PSSysEAIDataTypeDTO usertag3(String userTag3) {
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
    public PSSysEAIDataTypeDTO usertag4(String userTag4) {
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
    public PSSysEAIDataTypeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEAIDataTypeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEAIDataTypeId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDataTypeDTO id(String strValue) {
        this.setPSSysEAIDataTypeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysEAIDataTypeItemDTO> getPSSysEAIDataTypeItems() {
        Object list = this._get(DTOFIELD_PSSYSEAIDATATYPEITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssyseaidatatypeitems")
    public void setPSSysEAIDataTypeItems(List<PSSysEAIDataTypeItemDTO> pssyseaidatatypeitems) {
        this._set(DTOFIELD_PSSYSEAIDATATYPEITEMS, pssyseaidatatypeitems);
    }

    @JsonIgnore
    public List<PSSysEAIDataTypeItemDTO> getPSSysEAIDataTypeItemsIf() {
        Object list = this._get(DTOFIELD_PSSYSEAIDATATYPEITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSEAIDATATYPEITEMS, list);
        }
        return (List)list;
    }
}
