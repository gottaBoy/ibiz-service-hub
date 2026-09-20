package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSCodeItemDTO
extends PSModelDTOBase {
    public static final String FIELD_BEGINVALUE = "BEGINVALUE";
    protected static final String DTOFIELD_BEGINVALUE = "beginvalue";
    public static final String FIELD_BKCOLOR = "BKCOLOR";
    protected static final String DTOFIELD_BKCOLOR = "bkcolor";
    public static final String FIELD_CODEITEMVALUE = "CODEITEMVALUE";
    protected static final String DTOFIELD_CODEITEMVALUE = "codeitemvalue";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CSSCLASS = "CSSCLASS";
    protected static final String DTOFIELD_CSSCLASS = "cssclass";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DISABLESELECT = "DISABLESELECT";
    protected static final String DTOFIELD_DISABLESELECT = "disableselect";
    public static final String FIELD_ENDVALUE = "ENDVALUE";
    protected static final String DTOFIELD_ENDVALUE = "endvalue";
    public static final String FIELD_ICONCLS = "ICONCLS";
    protected static final String DTOFIELD_ICONCLS = "iconcls";
    public static final String FIELD_INCBEGINVALUE = "INCBEGINVALUE";
    protected static final String DTOFIELD_INCBEGINVALUE = "incbeginvalue";
    public static final String FIELD_INCENDVALUE = "INCENDVALUE";
    protected static final String DTOFIELD_INCENDVALUE = "incendvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSCODEITEMID = "PPSCODEITEMID";
    protected static final String DTOFIELD_PPSCODEITEMID = "ppscodeitemid";
    public static final String FIELD_PPSCODEITEMNAME = "PPSCODEITEMNAME";
    protected static final String DTOFIELD_PPSCODEITEMNAME = "ppscodeitemname";
    public static final String FIELD_PSCODEITEMID = "PSCODEITEMID";
    protected static final String DTOFIELD_PSCODEITEMID = "pscodeitemid";
    public static final String FIELD_PSCODEITEMNAME = "PSCODEITEMNAME";
    protected static final String DTOFIELD_PSCODEITEMNAME = "pscodeitemname";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_SHORTKEY = "SHORTKEY";
    protected static final String DTOFIELD_SHORTKEY = "shortkey";
    public static final String FIELD_SHOWASALL = "SHOWASALL";
    protected static final String DTOFIELD_SHOWASALL = "showasall";
    public static final String FIELD_SHOWASEMPTY = "SHOWASEMPTY";
    protected static final String DTOFIELD_SHOWASEMPTY = "showasempty";
    public static final String FIELD_TEXTPSLANRESID = "TEXTPSLANRESID";
    protected static final String DTOFIELD_TEXTPSLANRESID = "textpslanresid";
    public static final String FIELD_TEXTPSLANRESNAME = "TEXTPSLANRESNAME";
    protected static final String DTOFIELD_TEXTPSLANRESNAME = "textpslanresname";
    public static final String FIELD_THRESHOLDGROUPFLAG = "THRESHOLDGROUPFLAG";
    protected static final String DTOFIELD_THRESHOLDGROUPFLAG = "thresholdgroupflag";
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
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public static final String DTOFIELD_PSCODEITEMS = "pscodeitems";

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
    public PSCodeItemDTO beginvalue(BigDecimal beginValue) {
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
    public PSCodeItemDTO bkcolor(String bKColor) {
        this.setBKColor(bKColor);
        return this;
    }

    @JsonProperty(value="codeitemvalue")
    public void setCodeItemValue(String codeItemValue) {
        this._set(DTOFIELD_CODEITEMVALUE, codeItemValue);
    }

    @JsonIgnore
    public String getCodeItemValue() {
        Object objValue = this._get(DTOFIELD_CODEITEMVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeItemValueDirty() {
        return this._contains(DTOFIELD_CODEITEMVALUE);
    }

    @JsonIgnore
    public void resetCodeItemValue() {
        this._reset(DTOFIELD_CODEITEMVALUE);
    }

    @JsonIgnore
    public PSCodeItemDTO codeitemvalue(String codeItemValue) {
        this.setCodeItemValue(codeItemValue);
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
    public PSCodeItemDTO codename(String codeName) {
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
    public PSCodeItemDTO color(String color) {
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
    public PSCodeItemDTO createdate(Timestamp createDate) {
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
    public PSCodeItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="cssclass")
    public void setCssClass(String cssClass) {
        this._set(DTOFIELD_CSSCLASS, cssClass);
    }

    @JsonIgnore
    public String getCssClass() {
        Object objValue = this._get(DTOFIELD_CSSCLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCssClassDirty() {
        return this._contains(DTOFIELD_CSSCLASS);
    }

    @JsonIgnore
    public void resetCssClass() {
        this._reset(DTOFIELD_CSSCLASS);
    }

    @JsonIgnore
    public PSCodeItemDTO cssclass(String cssClass) {
        this.setCssClass(cssClass);
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
    public PSCodeItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSCodeItemDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="disableselect")
    public void setDisableSelect(Integer disableSelect) {
        this._set(DTOFIELD_DISABLESELECT, disableSelect);
    }

    @JsonIgnore
    public Integer getDisableSelect() {
        Object objValue = this._get(DTOFIELD_DISABLESELECT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDisableSelectDirty() {
        return this._contains(DTOFIELD_DISABLESELECT);
    }

    @JsonIgnore
    public void resetDisableSelect() {
        this._reset(DTOFIELD_DISABLESELECT);
    }

    @JsonIgnore
    public PSCodeItemDTO disableselect(Integer disableSelect) {
        this.setDisableSelect(disableSelect);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO disableselect(Boolean disableSelect) {
        if (disableSelect == null) {
            this.setDisableSelect(null);
        } else {
            this.setDisableSelect(disableSelect != false ? 1 : 0);
        }
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
    public PSCodeItemDTO endvalue(BigDecimal endValue) {
        this.setEndValue(endValue);
        return this;
    }

    @JsonProperty(value="iconcls")
    public void setIconCls(String iconCls) {
        this._set(DTOFIELD_ICONCLS, iconCls);
    }

    @JsonIgnore
    public String getIconCls() {
        Object objValue = this._get(DTOFIELD_ICONCLS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconClsDirty() {
        return this._contains(DTOFIELD_ICONCLS);
    }

    @JsonIgnore
    public void resetIconCls() {
        this._reset(DTOFIELD_ICONCLS);
    }

    @JsonIgnore
    public PSCodeItemDTO iconcls(String iconCls) {
        this.setIconCls(iconCls);
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
    public PSCodeItemDTO incbeginvalue(Integer incBeginValue) {
        this.setIncBeginValue(incBeginValue);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO incbeginvalue(Boolean incBeginValue) {
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
    public PSCodeItemDTO incendvalue(Integer incEndValue) {
        this.setIncEndValue(incEndValue);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO incendvalue(Boolean incEndValue) {
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
    public PSCodeItemDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSCodeItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppscodeitemid")
    public void setPPSCodeItemId(String pPSCodeItemId) {
        this._set(DTOFIELD_PPSCODEITEMID, pPSCodeItemId);
    }

    @JsonIgnore
    public String getPPSCodeItemId() {
        Object objValue = this._get(DTOFIELD_PPSCODEITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSCodeItemIdDirty() {
        return this._contains(DTOFIELD_PPSCODEITEMID);
    }

    @JsonIgnore
    public void resetPPSCodeItemId() {
        this._reset(DTOFIELD_PPSCODEITEMID);
    }

    @JsonIgnore
    public PSCodeItemDTO ppscodeitemid(String pPSCodeItemId) {
        this.setPPSCodeItemId(pPSCodeItemId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO ppscodeitemid(PSCodeItemDTO pSCodeItem) {
        if (pSCodeItem == null) {
            this.setPPSCodeItemId(null);
            this.setPPSCodeItemName(null);
        } else {
            this.setPPSCodeItemId(pSCodeItem.getPSCodeItemId());
            this.setPPSCodeItemName(pSCodeItem.getPSCodeItemName());
        }
        return this;
    }

    @JsonProperty(value="ppscodeitemname")
    public void setPPSCodeItemName(String pPSCodeItemName) {
        this._set(DTOFIELD_PPSCODEITEMNAME, pPSCodeItemName);
    }

    @JsonIgnore
    public String getPPSCodeItemName() {
        Object objValue = this._get(DTOFIELD_PPSCODEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSCodeItemNameDirty() {
        return this._contains(DTOFIELD_PPSCODEITEMNAME);
    }

    @JsonIgnore
    public void resetPPSCodeItemName() {
        this._reset(DTOFIELD_PPSCODEITEMNAME);
    }

    @JsonIgnore
    public PSCodeItemDTO ppscodeitemname(String pPSCodeItemName) {
        this.setPPSCodeItemName(pPSCodeItemName);
        return this;
    }

    @JsonProperty(value="pscodeitemid")
    public void setPSCodeItemId(String pSCodeItemId) {
        this._set(DTOFIELD_PSCODEITEMID, pSCodeItemId);
    }

    @JsonIgnore
    public String getPSCodeItemId() {
        Object objValue = this._get(DTOFIELD_PSCODEITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeItemIdDirty() {
        return this._contains(DTOFIELD_PSCODEITEMID);
    }

    @JsonIgnore
    public void resetPSCodeItemId() {
        this._reset(DTOFIELD_PSCODEITEMID);
    }

    @JsonIgnore
    public PSCodeItemDTO pscodeitemid(String pSCodeItemId) {
        this.setPSCodeItemId(pSCodeItemId);
        return this;
    }

    @JsonProperty(value="pscodeitemname")
    public void setPSCodeItemName(String pSCodeItemName) {
        this._set(DTOFIELD_PSCODEITEMNAME, pSCodeItemName);
    }

    @JsonIgnore
    public String getPSCodeItemName() {
        Object objValue = this._get(DTOFIELD_PSCODEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeItemNameDirty() {
        return this._contains(DTOFIELD_PSCODEITEMNAME);
    }

    @JsonIgnore
    public void resetPSCodeItemName() {
        this._reset(DTOFIELD_PSCODEITEMNAME);
    }

    @JsonIgnore
    public PSCodeItemDTO pscodeitemname(String pSCodeItemName) {
        this.setPSCodeItemName(pSCodeItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSCodeItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSCodeItemName(strName);
    }

    @JsonIgnore
    public PSCodeItemDTO name(String strName) {
        this.setPSCodeItemName(strName);
        return this;
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
    public PSCodeItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
            this.setThresholdGroupFlag(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
            this.setThresholdGroupFlag(pSCodeList.getThresholdGroupFlag());
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
    public PSCodeItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSCodeItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSCodeItemDTO pssyscssname(String pSSysCssName) {
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
    public PSCodeItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSCodeItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="shortkey")
    public void setShortKey(String shortKey) {
        this._set(DTOFIELD_SHORTKEY, shortKey);
    }

    @JsonIgnore
    public String getShortKey() {
        Object objValue = this._get(DTOFIELD_SHORTKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShortKeyDirty() {
        return this._contains(DTOFIELD_SHORTKEY);
    }

    @JsonIgnore
    public void resetShortKey() {
        this._reset(DTOFIELD_SHORTKEY);
    }

    @JsonIgnore
    public PSCodeItemDTO shortkey(String shortKey) {
        this.setShortKey(shortKey);
        return this;
    }

    @JsonProperty(value="showasall")
    public void setShowAsAll(Integer showAsAll) {
        this._set(DTOFIELD_SHOWASALL, showAsAll);
    }

    @JsonIgnore
    public Integer getShowAsAll() {
        Object objValue = this._get(DTOFIELD_SHOWASALL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowAsAllDirty() {
        return this._contains(DTOFIELD_SHOWASALL);
    }

    @JsonIgnore
    public void resetShowAsAll() {
        this._reset(DTOFIELD_SHOWASALL);
    }

    @JsonIgnore
    public PSCodeItemDTO showasall(Integer showAsAll) {
        this.setShowAsAll(showAsAll);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO showasall(Boolean showAsAll) {
        if (showAsAll == null) {
            this.setShowAsAll(null);
        } else {
            this.setShowAsAll(showAsAll != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="showasempty")
    public void setShowAsEmpty(Integer showAsEmpty) {
        this._set(DTOFIELD_SHOWASEMPTY, showAsEmpty);
    }

    @JsonIgnore
    public Integer getShowAsEmpty() {
        Object objValue = this._get(DTOFIELD_SHOWASEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowAsEmptyDirty() {
        return this._contains(DTOFIELD_SHOWASEMPTY);
    }

    @JsonIgnore
    public void resetShowAsEmpty() {
        this._reset(DTOFIELD_SHOWASEMPTY);
    }

    @JsonIgnore
    public PSCodeItemDTO showasempty(Integer showAsEmpty) {
        this.setShowAsEmpty(showAsEmpty);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO showasempty(Boolean showAsEmpty) {
        if (showAsEmpty == null) {
            this.setShowAsEmpty(null);
        } else {
            this.setShowAsEmpty(showAsEmpty != false ? 1 : 0);
        }
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
    public PSCodeItemDTO textpslanresid(String textPSLanResId) {
        this.setTextPSLanResId(textPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO textpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSCodeItemDTO textpslanresname(String textPSLanResName) {
        this.setTextPSLanResName(textPSLanResName);
        return this;
    }

    @JsonProperty(value="thresholdgroupflag")
    public void setThresholdGroupFlag(Integer thresholdGroupFlag) {
        this._set(DTOFIELD_THRESHOLDGROUPFLAG, thresholdGroupFlag);
    }

    @JsonIgnore
    public Integer getThresholdGroupFlag() {
        Object objValue = this._get(DTOFIELD_THRESHOLDGROUPFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThresholdGroupFlagDirty() {
        return this._contains(DTOFIELD_THRESHOLDGROUPFLAG);
    }

    @JsonIgnore
    public void resetThresholdGroupFlag() {
        this._reset(DTOFIELD_THRESHOLDGROUPFLAG);
    }

    @JsonIgnore
    public PSCodeItemDTO thresholdgroupflag(Integer thresholdGroupFlag) {
        this.setThresholdGroupFlag(thresholdGroupFlag);
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
    public PSCodeItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSCodeItemDTO tippslanresname(String tipPSLanResName) {
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
    public PSCodeItemDTO tooltipinfo(String tooltipInfo) {
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
    public PSCodeItemDTO updatedate(Timestamp updateDate) {
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
    public PSCodeItemDTO updateman(String updateMan) {
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
    public PSCodeItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSCodeItemDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSCodeItemDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSCodeItemDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSCodeItemDTO usertag(String userTag) {
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
    public PSCodeItemDTO usertag2(String userTag2) {
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
    public PSCodeItemDTO usertag3(String userTag3) {
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
    public PSCodeItemDTO usertag4(String userTag4) {
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
    public PSCodeItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSCodeItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSCodeItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSCodeItemId(strValue);
    }

    @JsonIgnore
    public PSCodeItemDTO id(String strValue) {
        this.setPSCodeItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSCodeItemDTO> getPSCodeItems() {
        Object list = this._get(DTOFIELD_PSCODEITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pscodeitems")
    public void setPSCodeItems(List<PSCodeItemDTO> pscodeitems) {
        this._set(DTOFIELD_PSCODEITEMS, pscodeitems);
    }

    @JsonIgnore
    public List<PSCodeItemDTO> getPSCodeItemsIf() {
        Object list = this._get(DTOFIELD_PSCODEITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSCODEITEMS, list);
        }
        return (List) list;
    }
}
