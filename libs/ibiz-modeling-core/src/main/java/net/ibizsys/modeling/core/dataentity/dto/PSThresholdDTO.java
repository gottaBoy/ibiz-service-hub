package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSThresholdDTO
extends PSModelDTOBase {
    public static final String FIELD_BEGINVALUE = "BEGINVALUE";
    protected static final String DTOFIELD_BEGINVALUE = "beginvalue";
    public static final String FIELD_BKCOLOR = "BKCOLOR";
    protected static final String DTOFIELD_BKCOLOR = "bkcolor";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_ENDVALUE = "ENDVALUE";
    protected static final String DTOFIELD_ENDVALUE = "endvalue";
    public static final String FIELD_INCBEGINVALUE = "INCBEGINVALUE";
    protected static final String DTOFIELD_INCBEGINVALUE = "incbeginvalue";
    public static final String FIELD_INCENDVALUE = "INCENDVALUE";
    protected static final String DTOFIELD_INCENDVALUE = "incendvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSTHRESHOLDGROUPID = "PSTHRESHOLDGROUPID";
    protected static final String DTOFIELD_PSTHRESHOLDGROUPID = "psthresholdgroupid";
    public static final String FIELD_PSTHRESHOLDGROUPNAME = "PSTHRESHOLDGROUPNAME";
    protected static final String DTOFIELD_PSTHRESHOLDGROUPNAME = "psthresholdgroupname";
    public static final String FIELD_PSTHRESHOLDID = "PSTHRESHOLDID";
    protected static final String DTOFIELD_PSTHRESHOLDID = "psthresholdid";
    public static final String FIELD_PSTHRESHOLDNAME = "PSTHRESHOLDNAME";
    protected static final String DTOFIELD_PSTHRESHOLDNAME = "psthresholdname";
    public static final String FIELD_TEXTPSLANRESID = "TEXTPSLANRESID";
    protected static final String DTOFIELD_TEXTPSLANRESID = "textpslanresid";
    public static final String FIELD_TEXTPSLANRESNAME = "TEXTPSLANRESNAME";
    protected static final String DTOFIELD_TEXTPSLANRESNAME = "textpslanresname";
    public static final String FIELD_THRESHOLDTAG = "THRESHOLDTAG";
    protected static final String DTOFIELD_THRESHOLDTAG = "thresholdtag";
    public static final String FIELD_THRESHOLDTAG2 = "THRESHOLDTAG2";
    protected static final String DTOFIELD_THRESHOLDTAG2 = "thresholdtag2";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
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

    @JsonProperty(value="beginvalue")
    public void setBeginValue(BigDecimal beginValue) {
        this._set(DTOFIELD_BEGINVALUE, beginValue);
    }

    @JsonIgnore
    public BigDecimal getBeginValue() {
        Object objValue = this._get(DTOFIELD_BEGINVALUE);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isBeginValueDirty() {
        return this._contains(DTOFIELD_BEGINVALUE);
    }

    @JsonIgnore
    public void resetBeginValue() {
        this._reset(DTOFIELD_BEGINVALUE);
    }

    @JsonIgnore
    public PSThresholdDTO beginvalue(BigDecimal beginValue) {
        this.setBeginValue(beginValue);
        return this;
    }

    @JsonProperty(value="bkcolor")
    public void setBKColor(String bKColor) {
        this._set(DTOFIELD_BKCOLOR, bKColor);
    }

    @JsonIgnore
    public String getBKColor() {
        Object objValue = this._get(DTOFIELD_BKCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorDirty() {
        return this._contains(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public void resetBKColor() {
        this._reset(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public PSThresholdDTO bkcolor(String bKColor) {
        this.setBKColor(bKColor);
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
    public PSThresholdDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSThresholdDTO color(String color) {
        this.setColor(color);
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
    public PSThresholdDTO createdate(Timestamp createDate) {
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
    public PSThresholdDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSThresholdDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="endvalue")
    public void setEndValue(BigDecimal endValue) {
        this._set(DTOFIELD_ENDVALUE, endValue);
    }

    @JsonIgnore
    public BigDecimal getEndValue() {
        Object objValue = this._get(DTOFIELD_ENDVALUE);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isEndValueDirty() {
        return this._contains(DTOFIELD_ENDVALUE);
    }

    @JsonIgnore
    public void resetEndValue() {
        this._reset(DTOFIELD_ENDVALUE);
    }

    @JsonIgnore
    public PSThresholdDTO endvalue(BigDecimal endValue) {
        this.setEndValue(endValue);
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
    public PSThresholdDTO incbeginvalue(Integer incBeginValue) {
        this.setIncBeginValue(incBeginValue);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO incbeginvalue(Boolean incBeginValue) {
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
    public PSThresholdDTO incendvalue(Integer incEndValue) {
        this.setIncEndValue(incEndValue);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO incendvalue(Boolean incEndValue) {
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
    public PSThresholdDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSThresholdDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSThresholdDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageIdDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetPSSysImageId() {
        this._reset(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public PSThresholdDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO pssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        } else {
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="pssysimagename")
    public void setPSSysImageName(String pSSysImageName) {
        this._set(DTOFIELD_PSSYSIMAGENAME, pSSysImageName);
    }

    @JsonIgnore
    public String getPSSysImageName() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageNameDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetPSSysImageName() {
        this._reset(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSThresholdDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSThresholdDTO psthresholdgroupid(String pSThresholdGroupId) {
        this.setPSThresholdGroupId(pSThresholdGroupId);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO psthresholdgroupid(PSThresholdGroupDTO pSThresholdGroup) {
        if (pSThresholdGroup == null) {
            this.setPSThresholdGroupId(null);
            this.setPSThresholdGroupName(null);
        } else {
            this.setPSThresholdGroupId(pSThresholdGroup.getPSThresholdGroupId());
            this.setPSThresholdGroupName(pSThresholdGroup.getPSThresholdGroupName());
        }
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
    public PSThresholdDTO psthresholdgroupname(String pSThresholdGroupName) {
        this.setPSThresholdGroupName(pSThresholdGroupName);
        return this;
    }

    @JsonProperty(value="psthresholdid")
    public void setPSThresholdId(String pSThresholdId) {
        this._set(DTOFIELD_PSTHRESHOLDID, pSThresholdId);
    }

    @JsonIgnore
    public String getPSThresholdId() {
        Object objValue = this._get(DTOFIELD_PSTHRESHOLDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSThresholdIdDirty() {
        return this._contains(DTOFIELD_PSTHRESHOLDID);
    }

    @JsonIgnore
    public void resetPSThresholdId() {
        this._reset(DTOFIELD_PSTHRESHOLDID);
    }

    @JsonIgnore
    public PSThresholdDTO psthresholdid(String pSThresholdId) {
        this.setPSThresholdId(pSThresholdId);
        return this;
    }

    @JsonProperty(value="psthresholdname")
    public void setPSThresholdName(String pSThresholdName) {
        this._set(DTOFIELD_PSTHRESHOLDNAME, pSThresholdName);
    }

    @JsonIgnore
    public String getPSThresholdName() {
        Object objValue = this._get(DTOFIELD_PSTHRESHOLDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSThresholdNameDirty() {
        return this._contains(DTOFIELD_PSTHRESHOLDNAME);
    }

    @JsonIgnore
    public void resetPSThresholdName() {
        this._reset(DTOFIELD_PSTHRESHOLDNAME);
    }

    @JsonIgnore
    public PSThresholdDTO psthresholdname(String pSThresholdName) {
        this.setPSThresholdName(pSThresholdName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSThresholdName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSThresholdName(strName);
    }

    @JsonIgnore
    public PSThresholdDTO name(String strName) {
        this.setPSThresholdName(strName);
        return this;
    }

    @JsonProperty(value="textpslanresid")
    public void setTextPSLanResId(String textPSLanResId) {
        this._set(DTOFIELD_TEXTPSLANRESID, textPSLanResId);
    }

    @JsonIgnore
    public String getTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_TEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_TEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetTextPSLanResId() {
        this._reset(DTOFIELD_TEXTPSLANRESID);
    }

    @JsonIgnore
    public PSThresholdDTO textpslanresid(String textPSLanResId) {
        this.setTextPSLanResId(textPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO textpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTextPSLanResId(null);
            this.setTextPSLanResName(null);
        } else {
            this.setTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="textpslanresname")
    public void setTextPSLanResName(String textPSLanResName) {
        this._set(DTOFIELD_TEXTPSLANRESNAME, textPSLanResName);
    }

    @JsonIgnore
    public String getTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_TEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_TEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTextPSLanResName() {
        this._reset(DTOFIELD_TEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSThresholdDTO textpslanresname(String textPSLanResName) {
        this.setTextPSLanResName(textPSLanResName);
        return this;
    }

    @JsonProperty(value="thresholdtag")
    public void setThresholdTag(String thresholdTag) {
        this._set(DTOFIELD_THRESHOLDTAG, thresholdTag);
    }

    @JsonIgnore
    public String getThresholdTag() {
        Object objValue = this._get(DTOFIELD_THRESHOLDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThresholdTagDirty() {
        return this._contains(DTOFIELD_THRESHOLDTAG);
    }

    @JsonIgnore
    public void resetThresholdTag() {
        this._reset(DTOFIELD_THRESHOLDTAG);
    }

    @JsonIgnore
    public PSThresholdDTO thresholdtag(String thresholdTag) {
        this.setThresholdTag(thresholdTag);
        return this;
    }

    @JsonProperty(value="thresholdtag2")
    public void setThresholdTag2(String thresholdTag2) {
        this._set(DTOFIELD_THRESHOLDTAG2, thresholdTag2);
    }

    @JsonIgnore
    public String getThresholdTag2() {
        Object objValue = this._get(DTOFIELD_THRESHOLDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThresholdTag2Dirty() {
        return this._contains(DTOFIELD_THRESHOLDTAG2);
    }

    @JsonIgnore
    public void resetThresholdTag2() {
        this._reset(DTOFIELD_THRESHOLDTAG2);
    }

    @JsonIgnore
    public PSThresholdDTO thresholdtag2(String thresholdTag2) {
        this.setThresholdTag2(thresholdTag2);
        return this;
    }

    @JsonProperty(value="tippslanresid")
    public void setTipPSLanResId(String tipPSLanResId) {
        this._set(DTOFIELD_TIPPSLANRESID, tipPSLanResId);
    }

    @JsonIgnore
    public String getTipPSLanResId() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResIdDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public void resetTipPSLanResId() {
        this._reset(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public PSThresholdDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        } else {
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="tippslanresname")
    public void setTipPSLanResName(String tipPSLanResName) {
        this._set(DTOFIELD_TIPPSLANRESNAME, tipPSLanResName);
    }

    @JsonIgnore
    public String getTipPSLanResName() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResNameDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTipPSLanResName() {
        this._reset(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public PSThresholdDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="tooltipinfo")
    public void setTooltipInfo(String tooltipInfo) {
        this._set(DTOFIELD_TOOLTIPINFO, tooltipInfo);
    }

    @JsonIgnore
    public String getTooltipInfo() {
        Object objValue = this._get(DTOFIELD_TOOLTIPINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTooltipInfoDirty() {
        return this._contains(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public void resetTooltipInfo() {
        this._reset(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public PSThresholdDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
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
    public PSThresholdDTO updatedate(Timestamp updateDate) {
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
    public PSThresholdDTO updateman(String updateMan) {
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
    public PSThresholdDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSThresholdDTO usertag(String userTag) {
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
    public PSThresholdDTO usertag2(String userTag2) {
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
    public PSThresholdDTO usertag3(String userTag3) {
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
    public PSThresholdDTO usertag4(String userTag4) {
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
    public PSThresholdDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSThresholdDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSThresholdId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSThresholdId(strValue);
    }

    @JsonIgnore
    public PSThresholdDTO id(String strValue) {
        this.setPSThresholdId(strValue);
        return this;
    }
}
