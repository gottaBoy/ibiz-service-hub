package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSThresholdGroupDTO
extends PSModelDTOBase {
    public static final String FIELD_BEGINVALUEPSDEFID = "BEGINVALUEPSDEFID";
    protected static final String DTOFIELD_BEGINVALUEPSDEFID = "beginvaluepsdefid";
    public static final String FIELD_BEGINVALUEPSDEFNAME = "BEGINVALUEPSDEFNAME";
    protected static final String DTOFIELD_BEGINVALUEPSDEFNAME = "beginvaluepsdefname";
    public static final String FIELD_BKCOLORPSDEFID = "BKCOLORPSDEFID";
    protected static final String DTOFIELD_BKCOLORPSDEFID = "bkcolorpsdefid";
    public static final String FIELD_BKCOLORPSDEFNAME = "BKCOLORPSDEFNAME";
    protected static final String DTOFIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLORPSDEFID = "COLORPSDEFID";
    protected static final String DTOFIELD_COLORPSDEFID = "colorpsdefid";
    public static final String FIELD_COLORPSDEFNAME = "COLORPSDEFNAME";
    protected static final String DTOFIELD_COLORPSDEFNAME = "colorpsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_DATAPSDEFID = "DATAPSDEFID";
    protected static final String DTOFIELD_DATAPSDEFID = "datapsdefid";
    public static final String FIELD_DATAPSDEFNAME = "DATAPSDEFNAME";
    protected static final String DTOFIELD_DATAPSDEFNAME = "datapsdefname";
    public static final String FIELD_ENDVALUEPSDEFID = "ENDVALUEPSDEFID";
    protected static final String DTOFIELD_ENDVALUEPSDEFID = "endvaluepsdefid";
    public static final String FIELD_ENDVALUEPSDEFNAME = "ENDVALUEPSDEFNAME";
    protected static final String DTOFIELD_ENDVALUEPSDEFNAME = "endvaluepsdefname";
    public static final String FIELD_ICONCLSPSDEFID = "ICONCLSPSDEFID";
    protected static final String DTOFIELD_ICONCLSPSDEFID = "iconclspsdefid";
    public static final String FIELD_ICONCLSPSDEFNAME = "ICONCLSPSDEFNAME";
    protected static final String DTOFIELD_ICONCLSPSDEFNAME = "iconclspsdefname";
    public static final String FIELD_INCBEGINVALUE = "INCBEGINVALUE";
    protected static final String DTOFIELD_INCBEGINVALUE = "incbeginvalue";
    public static final String FIELD_INCENDVALUE = "INCENDVALUE";
    protected static final String DTOFIELD_INCENDVALUE = "incendvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSTHRESHOLDGROUPID = "PSTHRESHOLDGROUPID";
    protected static final String DTOFIELD_PSTHRESHOLDGROUPID = "psthresholdgroupid";
    public static final String FIELD_PSTHRESHOLDGROUPNAME = "PSTHRESHOLDGROUPNAME";
    protected static final String DTOFIELD_PSTHRESHOLDGROUPNAME = "psthresholdgroupname";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
    public static final String FIELD_THRESHOLDGROUPTAG = "THRESHOLDGROUPTAG";
    protected static final String DTOFIELD_THRESHOLDGROUPTAG = "thresholdgrouptag";
    public static final String FIELD_THRESHOLDGROUPTAG2 = "THRESHOLDGROUPTAG2";
    protected static final String DTOFIELD_THRESHOLDGROUPTAG2 = "thresholdgrouptag2";
    public static final String FIELD_THRESHOLDGROUPTYPE = "THRESHOLDGROUPTYPE";
    protected static final String DTOFIELD_THRESHOLDGROUPTYPE = "thresholdgrouptype";
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
    public static final String DTOFIELD_PSTHRESHOLDS = "psthresholds";

    @JsonProperty(value="beginvaluepsdefid")
    public void setBeginValuePSDEFId(String beginValuePSDEFId) {
        this._set(DTOFIELD_BEGINVALUEPSDEFID, beginValuePSDEFId);
    }

    @JsonIgnore
    public String getBeginValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_BEGINVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_BEGINVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetBeginValuePSDEFId() {
        this._reset(DTOFIELD_BEGINVALUEPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefid(String beginValuePSDEFId) {
        this.setBeginValuePSDEFId(beginValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBeginValuePSDEFId(null);
            this.setBeginValuePSDEFName(null);
        } else {
            this.setBeginValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="beginvaluepsdefname")
    public void setBeginValuePSDEFName(String beginValuePSDEFName) {
        this._set(DTOFIELD_BEGINVALUEPSDEFNAME, beginValuePSDEFName);
    }

    @JsonIgnore
    public String getBeginValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_BEGINVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeginValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_BEGINVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetBeginValuePSDEFName() {
        this._reset(DTOFIELD_BEGINVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO beginvaluepsdefname(String beginValuePSDEFName) {
        this.setBeginValuePSDEFName(beginValuePSDEFName);
        return this;
    }

    @JsonProperty(value="bkcolorpsdefid")
    public void setBKColorPSDEFId(String bKColorPSDEFId) {
        this._set(DTOFIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }

    @JsonIgnore
    public String getBKColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public void resetBKColorPSDEFId() {
        this._reset(DTOFIELD_BKCOLORPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefid(String bKColorPSDEFId) {
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setBKColorPSDEFId(null);
            this.setBKColorPSDEFName(null);
        } else {
            this.setBKColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setBKColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="bkcolorpsdefname")
    public void setBKColorPSDEFName(String bKColorPSDEFName) {
        this._set(DTOFIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }

    @JsonIgnore
    public String getBKColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_BKCOLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetBKColorPSDEFName() {
        this._reset(DTOFIELD_BKCOLORPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO bkcolorpsdefname(String bKColorPSDEFName) {
        this.setBKColorPSDEFName(bKColorPSDEFName);
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
    public PSThresholdGroupDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="colorpsdefid")
    public void setColorPSDEFId(String colorPSDEFId) {
        this._set(DTOFIELD_COLORPSDEFID, colorPSDEFId);
    }

    @JsonIgnore
    public String getColorPSDEFId() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFIdDirty() {
        return this._contains(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public void resetColorPSDEFId() {
        this._reset(DTOFIELD_COLORPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefid(String colorPSDEFId) {
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setColorPSDEFId(null);
            this.setColorPSDEFName(null);
        } else {
            this.setColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="colorpsdefname")
    public void setColorPSDEFName(String colorPSDEFName) {
        this._set(DTOFIELD_COLORPSDEFNAME, colorPSDEFName);
    }

    @JsonIgnore
    public String getColorPSDEFName() {
        Object objValue = this._get(DTOFIELD_COLORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorPSDEFNameDirty() {
        return this._contains(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public void resetColorPSDEFName() {
        this._reset(DTOFIELD_COLORPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO colorpsdefname(String colorPSDEFName) {
        this.setColorPSDEFName(colorPSDEFName);
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
    public PSThresholdGroupDTO createdate(Timestamp createDate) {
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
    public PSThresholdGroupDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSThresholdGroupDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="datapsdefid")
    public void setDataPSDEFId(String dataPSDEFId) {
        this._set(DTOFIELD_DATAPSDEFID, dataPSDEFId);
    }

    @JsonIgnore
    public String getDataPSDEFId() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFIdDirty() {
        return this._contains(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public void resetDataPSDEFId() {
        this._reset(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO datapsdefid(String dataPSDEFId) {
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO datapsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        } else {
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="datapsdefname")
    public void setDataPSDEFName(String dataPSDEFName) {
        this._set(DTOFIELD_DATAPSDEFNAME, dataPSDEFName);
    }

    @JsonIgnore
    public String getDataPSDEFName() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFNameDirty() {
        return this._contains(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public void resetDataPSDEFName() {
        this._reset(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO datapsdefname(String dataPSDEFName) {
        this.setDataPSDEFName(dataPSDEFName);
        return this;
    }

    @JsonProperty(value="endvaluepsdefid")
    public void setEndValuePSDEFId(String endValuePSDEFId) {
        this._set(DTOFIELD_ENDVALUEPSDEFID, endValuePSDEFId);
    }

    @JsonIgnore
    public String getEndValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_ENDVALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_ENDVALUEPSDEFID);
    }

    @JsonIgnore
    public void resetEndValuePSDEFId() {
        this._reset(DTOFIELD_ENDVALUEPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefid(String endValuePSDEFId) {
        this.setEndValuePSDEFId(endValuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setEndValuePSDEFId(null);
            this.setEndValuePSDEFName(null);
        } else {
            this.setEndValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setEndValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="endvaluepsdefname")
    public void setEndValuePSDEFName(String endValuePSDEFName) {
        this._set(DTOFIELD_ENDVALUEPSDEFNAME, endValuePSDEFName);
    }

    @JsonIgnore
    public String getEndValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_ENDVALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEndValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_ENDVALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetEndValuePSDEFName() {
        this._reset(DTOFIELD_ENDVALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO endvaluepsdefname(String endValuePSDEFName) {
        this.setEndValuePSDEFName(endValuePSDEFName);
        return this;
    }

    @JsonProperty(value="iconclspsdefid")
    public void setIconClsPSDEFId(String iconClsPSDEFId) {
        this._set(DTOFIELD_ICONCLSPSDEFID, iconClsPSDEFId);
    }

    @JsonIgnore
    public String getIconClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONCLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONCLSPSDEFID);
    }

    @JsonIgnore
    public void resetIconClsPSDEFId() {
        this._reset(DTOFIELD_ICONCLSPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefid(String iconClsPSDEFId) {
        this.setIconClsPSDEFId(iconClsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconClsPSDEFId(null);
            this.setIconClsPSDEFName(null);
        } else {
            this.setIconClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconclspsdefname")
    public void setIconClsPSDEFName(String iconClsPSDEFName) {
        this._set(DTOFIELD_ICONCLSPSDEFNAME, iconClsPSDEFName);
    }

    @JsonIgnore
    public String getIconClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONCLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONCLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconClsPSDEFName() {
        this._reset(DTOFIELD_ICONCLSPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO iconclspsdefname(String iconClsPSDEFName) {
        this.setIconClsPSDEFName(iconClsPSDEFName);
        return this;
    }

    @JsonProperty(value="incbeginvalue")
    public void setIncBeginValue(Integer incBeginValue) {
        this._set(DTOFIELD_INCBEGINVALUE, incBeginValue);
    }

    @JsonIgnore
    public Integer getIncBeginValue() {
        Object objValue = this._get(DTOFIELD_INCBEGINVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncBeginValueDirty() {
        return this._contains(DTOFIELD_INCBEGINVALUE);
    }

    @JsonIgnore
    public void resetIncBeginValue() {
        this._reset(DTOFIELD_INCBEGINVALUE);
    }

    @JsonIgnore
    public PSThresholdGroupDTO incbeginvalue(Integer incBeginValue) {
        this.setIncBeginValue(incBeginValue);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO incbeginvalue(Boolean incBeginValue) {
        if (incBeginValue == null) {
            this.setIncBeginValue(null);
        } else {
            this.setIncBeginValue(incBeginValue != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="incendvalue")
    public void setIncEndValue(Integer incEndValue) {
        this._set(DTOFIELD_INCENDVALUE, incEndValue);
    }

    @JsonIgnore
    public Integer getIncEndValue() {
        Object objValue = this._get(DTOFIELD_INCENDVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncEndValueDirty() {
        return this._contains(DTOFIELD_INCENDVALUE);
    }

    @JsonIgnore
    public void resetIncEndValue() {
        this._reset(DTOFIELD_INCENDVALUE);
    }

    @JsonIgnore
    public PSThresholdGroupDTO incendvalue(Integer incEndValue) {
        this.setIncEndValue(incEndValue);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO incendvalue(Boolean incEndValue) {
        if (incEndValue == null) {
            this.setIncEndValue(null);
        } else {
            this.setIncEndValue(incEndValue != false ? 1 : 0);
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
    public PSThresholdGroupDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSThresholdGroupDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSThresholdGroupDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="psthresholdgroupid")
    public void setPSThresholdGroupId(String pSThresholdGroupId) {
        this._set(DTOFIELD_PSTHRESHOLDGROUPID, pSThresholdGroupId);
    }

    @JsonIgnore
    public String getPSThresholdGroupId() {
        Object objValue = this._get(DTOFIELD_PSTHRESHOLDGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSThresholdGroupIdDirty() {
        return this._contains(DTOFIELD_PSTHRESHOLDGROUPID);
    }

    @JsonIgnore
    public void resetPSThresholdGroupId() {
        this._reset(DTOFIELD_PSTHRESHOLDGROUPID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psthresholdgroupid(String pSThresholdGroupId) {
        this.setPSThresholdGroupId(pSThresholdGroupId);
        return this;
    }

    @JsonProperty(value="psthresholdgroupname")
    public void setPSThresholdGroupName(String pSThresholdGroupName) {
        this._set(DTOFIELD_PSTHRESHOLDGROUPNAME, pSThresholdGroupName);
    }

    @JsonIgnore
    public String getPSThresholdGroupName() {
        Object objValue = this._get(DTOFIELD_PSTHRESHOLDGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSThresholdGroupNameDirty() {
        return this._contains(DTOFIELD_PSTHRESHOLDGROUPNAME);
    }

    @JsonIgnore
    public void resetPSThresholdGroupName() {
        this._reset(DTOFIELD_PSTHRESHOLDGROUPNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO psthresholdgroupname(String pSThresholdGroupName) {
        this.setPSThresholdGroupName(pSThresholdGroupName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSThresholdGroupName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSThresholdGroupName(strName);
    }

    @JsonIgnore
    public PSThresholdGroupDTO name(String strName) {
        this.setPSThresholdGroupName(strName);
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSThresholdGroupDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSThresholdGroupDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    @JsonProperty(value="thresholdgrouptag")
    public void setThresholdGroupTag(String thresholdGroupTag) {
        this._set(DTOFIELD_THRESHOLDGROUPTAG, thresholdGroupTag);
    }

    @JsonIgnore
    public String getThresholdGroupTag() {
        Object objValue = this._get(DTOFIELD_THRESHOLDGROUPTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThresholdGroupTagDirty() {
        return this._contains(DTOFIELD_THRESHOLDGROUPTAG);
    }

    @JsonIgnore
    public void resetThresholdGroupTag() {
        this._reset(DTOFIELD_THRESHOLDGROUPTAG);
    }

    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptag(String thresholdGroupTag) {
        this.setThresholdGroupTag(thresholdGroupTag);
        return this;
    }

    @JsonProperty(value="thresholdgrouptag2")
    public void setThresholdGroupTag2(String thresholdGroupTag2) {
        this._set(DTOFIELD_THRESHOLDGROUPTAG2, thresholdGroupTag2);
    }

    @JsonIgnore
    public String getThresholdGroupTag2() {
        Object objValue = this._get(DTOFIELD_THRESHOLDGROUPTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThresholdGroupTag2Dirty() {
        return this._contains(DTOFIELD_THRESHOLDGROUPTAG2);
    }

    @JsonIgnore
    public void resetThresholdGroupTag2() {
        this._reset(DTOFIELD_THRESHOLDGROUPTAG2);
    }

    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptag2(String thresholdGroupTag2) {
        this.setThresholdGroupTag2(thresholdGroupTag2);
        return this;
    }

    @JsonProperty(value="thresholdgrouptype")
    public void setThresholdGroupType(String thresholdGroupType) {
        this._set(DTOFIELD_THRESHOLDGROUPTYPE, thresholdGroupType);
    }

    @JsonIgnore
    public String getThresholdGroupType() {
        Object objValue = this._get(DTOFIELD_THRESHOLDGROUPTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThresholdGroupTypeDirty() {
        return this._contains(DTOFIELD_THRESHOLDGROUPTYPE);
    }

    @JsonIgnore
    public void resetThresholdGroupType() {
        this._reset(DTOFIELD_THRESHOLDGROUPTYPE);
    }

    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptype(String thresholdGroupType) {
        this.setThresholdGroupType(thresholdGroupType);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO thresholdgrouptype(PSModelEnums.ThresholdGroupType thresholdGroupType) {
        if (thresholdGroupType == null) {
            this.setThresholdGroupType(null);
        } else {
            this.setThresholdGroupType(thresholdGroupType.value);
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
    public PSThresholdGroupDTO updatedate(Timestamp updateDate) {
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
    public PSThresholdGroupDTO updateman(String updateMan) {
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
    public PSThresholdGroupDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSThresholdGroupDTO usertag(String userTag) {
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
    public PSThresholdGroupDTO usertag2(String userTag2) {
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
    public PSThresholdGroupDTO usertag3(String userTag3) {
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
    public PSThresholdGroupDTO usertag4(String userTag4) {
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
    public PSThresholdGroupDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSThresholdGroupDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSThresholdGroupId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSThresholdGroupId(strValue);
    }

    @JsonIgnore
    public PSThresholdGroupDTO id(String strValue) {
        this.setPSThresholdGroupId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSThresholdDTO> getPSThresholds() {
        Object list = this._get(DTOFIELD_PSTHRESHOLDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psthresholds")
    public void setPSThresholds(List<PSThresholdDTO> psthresholds) {
        this._set(DTOFIELD_PSTHRESHOLDS, psthresholds);
    }

    @JsonIgnore
    public List<PSThresholdDTO> getPSThresholdsIf() {
        Object list = this._get(DTOFIELD_PSTHRESHOLDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSTHRESHOLDS, list);
        }
        return (List) list;
    }
}
