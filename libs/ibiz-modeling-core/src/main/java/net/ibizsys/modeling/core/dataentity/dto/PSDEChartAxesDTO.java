/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$ChartAxisDataShowMode
 *  net.ibizsys.model.PSModelEnums$ChartAxisPos
 *  net.ibizsys.model.PSModelEnums$ChartAxisType
 *  net.ibizsys.model.PSModelEnums$ChartCSIndex
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEChartAxesDTO
extends PSModelDTOBase {
    public static final String FIELD_AXESDATA = "AXESDATA";
    protected static final String DTOFIELD_AXESDATA = "axesdata";
    public static final String FIELD_AXESDATA2 = "AXESDATA2";
    protected static final String DTOFIELD_AXESDATA2 = "axesdata2";
    public static final String FIELD_AXESMAXVALUE = "AXESMAXVALUE";
    protected static final String DTOFIELD_AXESMAXVALUE = "axesmaxvalue";
    public static final String FIELD_AXESMINVALUE = "AXESMINVALUE";
    protected static final String DTOFIELD_AXESMINVALUE = "axesminvalue";
    public static final String FIELD_AXESPOS = "AXESPOS";
    protected static final String DTOFIELD_AXESPOS = "axespos";
    public static final String FIELD_AXESTYPE = "AXESTYPE";
    protected static final String DTOFIELD_AXESTYPE = "axestype";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_COORDINATESYSTEMID = "COORDINATESYSTEMID";
    protected static final String DTOFIELD_COORDINATESYSTEMID = "coordinatesystemid";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATASHOWMODE = "DATASHOWMODE";
    protected static final String DTOFIELD_DATASHOWMODE = "datashowmode";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_FIELDS = "FIELDS";
    protected static final String DTOFIELD_FIELDS = "fields";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDECHARTAXESID = "PSDECHARTAXESID";
    protected static final String DTOFIELD_PSDECHARTAXESID = "psdechartaxesid";
    public static final String FIELD_PSDECHARTAXESNAME = "PSDECHARTAXESNAME";
    protected static final String DTOFIELD_PSDECHARTAXESNAME = "psdechartaxesname";
    public static final String FIELD_PSDECHARTID = "PSDECHARTID";
    protected static final String DTOFIELD_PSDECHARTID = "psdechartid";
    public static final String FIELD_PSDECHARTNAME = "PSDECHARTNAME";
    protected static final String DTOFIELD_PSDECHARTNAME = "psdechartname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
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

    @JsonProperty(value="axesdata")
    public void setAxesData(String axesData) {
        this._set(DTOFIELD_AXESDATA, axesData);
    }

    @JsonIgnore
    public String getAxesData() {
        Object objValue = this._get(DTOFIELD_AXESDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAxesDataDirty() {
        return this._contains(DTOFIELD_AXESDATA);
    }

    @JsonIgnore
    public void resetAxesData() {
        this._reset(DTOFIELD_AXESDATA);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axesdata(String axesData) {
        this.setAxesData(axesData);
        return this;
    }

    @JsonProperty(value="axesdata2")
    public void setAxesData2(String axesData2) {
        this._set(DTOFIELD_AXESDATA2, axesData2);
    }

    @JsonIgnore
    public String getAxesData2() {
        Object objValue = this._get(DTOFIELD_AXESDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAxesData2Dirty() {
        return this._contains(DTOFIELD_AXESDATA2);
    }

    @JsonIgnore
    public void resetAxesData2() {
        this._reset(DTOFIELD_AXESDATA2);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axesdata2(String axesData2) {
        this.setAxesData2(axesData2);
        return this;
    }

    @JsonProperty(value="axesmaxvalue")
    public void setAxesMaxValue(BigDecimal axesMaxValue) {
        this._set(DTOFIELD_AXESMAXVALUE, axesMaxValue);
    }

    @JsonIgnore
    public BigDecimal getAxesMaxValue() {
        Object objValue = this._get(DTOFIELD_AXESMAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isAxesMaxValueDirty() {
        return this._contains(DTOFIELD_AXESMAXVALUE);
    }

    @JsonIgnore
    public void resetAxesMaxValue() {
        this._reset(DTOFIELD_AXESMAXVALUE);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axesmaxvalue(BigDecimal axesMaxValue) {
        this.setAxesMaxValue(axesMaxValue);
        return this;
    }

    @JsonProperty(value="axesminvalue")
    public void setAxesMinValue(BigDecimal axesMinValue) {
        this._set(DTOFIELD_AXESMINVALUE, axesMinValue);
    }

    @JsonIgnore
    public BigDecimal getAxesMinValue() {
        Object objValue = this._get(DTOFIELD_AXESMINVALUE);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isAxesMinValueDirty() {
        return this._contains(DTOFIELD_AXESMINVALUE);
    }

    @JsonIgnore
    public void resetAxesMinValue() {
        this._reset(DTOFIELD_AXESMINVALUE);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axesminvalue(BigDecimal axesMinValue) {
        this.setAxesMinValue(axesMinValue);
        return this;
    }

    @JsonProperty(value="axespos")
    public void setAxesPos(String axesPos) {
        this._set(DTOFIELD_AXESPOS, axesPos);
    }

    @JsonIgnore
    public String getAxesPos() {
        Object objValue = this._get(DTOFIELD_AXESPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAxesPosDirty() {
        return this._contains(DTOFIELD_AXESPOS);
    }

    @JsonIgnore
    public void resetAxesPos() {
        this._reset(DTOFIELD_AXESPOS);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axespos(String axesPos) {
        this.setAxesPos(axesPos);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO axespos(PSModelEnums.ChartAxisPos axesPos) {
        if (axesPos == null) {
            this.setAxesPos(null);
        } else {
            this.setAxesPos(axesPos.value);
        }
        return this;
    }

    @JsonProperty(value="axestype")
    public void setAxesType(String axesType) {
        this._set(DTOFIELD_AXESTYPE, axesType);
    }

    @JsonIgnore
    public String getAxesType() {
        Object objValue = this._get(DTOFIELD_AXESTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAxesTypeDirty() {
        return this._contains(DTOFIELD_AXESTYPE);
    }

    @JsonIgnore
    public void resetAxesType() {
        this._reset(DTOFIELD_AXESTYPE);
    }

    @JsonIgnore
    public PSDEChartAxesDTO axestype(String axesType) {
        this.setAxesType(axesType);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO axestype(PSModelEnums.ChartAxisType axesType) {
        if (axesType == null) {
            this.setAxesType(null);
        } else {
            this.setAxesType(axesType.value);
        }
        return this;
    }

    @JsonProperty(value="cappslanresid")
    public void setCapPSLanResId(String capPSLanResId) {
        this._set(DTOFIELD_CAPPSLANRESID, capPSLanResId);
    }

    @JsonIgnore
    public String getCapPSLanResId() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResIdDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public void resetCapPSLanResId() {
        this._reset(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public PSDEChartAxesDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        } else {
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cappslanresname")
    public void setCapPSLanResName(String capPSLanResName) {
        this._set(DTOFIELD_CAPPSLANRESNAME, capPSLanResName);
    }

    @JsonIgnore
    public String getCapPSLanResName() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResNameDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCapPSLanResName() {
        this._reset(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEChartAxesDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    @JsonProperty(value="caption")
    public void setCaption(String caption) {
        this._set(DTOFIELD_CAPTION, caption);
    }

    @JsonIgnore
    public String getCaption() {
        Object objValue = this._get(DTOFIELD_CAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionDirty() {
        return this._contains(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public void resetCaption() {
        this._reset(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public PSDEChartAxesDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="coordinatesystemid")
    public void setCoordinateSystemId(Integer coordinateSystemId) {
        this._set(DTOFIELD_COORDINATESYSTEMID, coordinateSystemId);
    }

    @JsonIgnore
    public Integer getCoordinateSystemId() {
        Object objValue = this._get(DTOFIELD_COORDINATESYSTEMID);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCoordinateSystemIdDirty() {
        return this._contains(DTOFIELD_COORDINATESYSTEMID);
    }

    @JsonIgnore
    public void resetCoordinateSystemId() {
        this._reset(DTOFIELD_COORDINATESYSTEMID);
    }

    @JsonIgnore
    public PSDEChartAxesDTO coordinatesystemid(Integer coordinateSystemId) {
        this.setCoordinateSystemId(coordinateSystemId);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO coordinatesystemid(PSModelEnums.ChartCSIndex coordinateSystemId) {
        if (coordinateSystemId == null) {
            this.setCoordinateSystemId(null);
        } else {
            this.setCoordinateSystemId(coordinateSystemId.value);
        }
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
    public PSDEChartAxesDTO createdate(Timestamp createDate) {
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
    public PSDEChartAxesDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="datashowmode")
    public void setDataShowMode(Integer dataShowMode) {
        this._set(DTOFIELD_DATASHOWMODE, dataShowMode);
    }

    @JsonIgnore
    public Integer getDataShowMode() {
        Object objValue = this._get(DTOFIELD_DATASHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDataShowModeDirty() {
        return this._contains(DTOFIELD_DATASHOWMODE);
    }

    @JsonIgnore
    public void resetDataShowMode() {
        this._reset(DTOFIELD_DATASHOWMODE);
    }

    @JsonIgnore
    public PSDEChartAxesDTO datashowmode(Integer dataShowMode) {
        this.setDataShowMode(dataShowMode);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO datashowmode(PSModelEnums.ChartAxisDataShowMode dataShowMode) {
        if (dataShowMode == null) {
            this.setDataShowMode(null);
        } else {
            this.setDataShowMode(dataShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="dynaclass")
    public void setDynaClass(String dynaClass) {
        this._set(DTOFIELD_DYNACLASS, dynaClass);
    }

    @JsonIgnore
    public String getDynaClass() {
        Object objValue = this._get(DTOFIELD_DYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaClassDirty() {
        return this._contains(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public void resetDynaClass() {
        this._reset(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public PSDEChartAxesDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
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
    public PSDEChartAxesDTO fields(String fields) {
        this.setFields(fields);
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
    public PSDEChartAxesDTO memo(String memo) {
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
    public PSDEChartAxesDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdechartaxesid")
    public void setPSDEChartAxesId(String pSDEChartAxesId) {
        this._set(DTOFIELD_PSDECHARTAXESID, pSDEChartAxesId);
    }

    @JsonIgnore
    public String getPSDEChartAxesId() {
        Object objValue = this._get(DTOFIELD_PSDECHARTAXESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartAxesIdDirty() {
        return this._contains(DTOFIELD_PSDECHARTAXESID);
    }

    @JsonIgnore
    public void resetPSDEChartAxesId() {
        this._reset(DTOFIELD_PSDECHARTAXESID);
    }

    @JsonIgnore
    public PSDEChartAxesDTO psdechartaxesid(String pSDEChartAxesId) {
        this.setPSDEChartAxesId(pSDEChartAxesId);
        return this;
    }

    @JsonProperty(value="psdechartaxesname")
    public void setPSDEChartAxesName(String pSDEChartAxesName) {
        this._set(DTOFIELD_PSDECHARTAXESNAME, pSDEChartAxesName);
    }

    @JsonIgnore
    public String getPSDEChartAxesName() {
        Object objValue = this._get(DTOFIELD_PSDECHARTAXESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartAxesNameDirty() {
        return this._contains(DTOFIELD_PSDECHARTAXESNAME);
    }

    @JsonIgnore
    public void resetPSDEChartAxesName() {
        this._reset(DTOFIELD_PSDECHARTAXESNAME);
    }

    @JsonIgnore
    public PSDEChartAxesDTO psdechartaxesname(String pSDEChartAxesName) {
        this.setPSDEChartAxesName(pSDEChartAxesName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEChartAxesName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEChartAxesName(strName);
    }

    @JsonIgnore
    public PSDEChartAxesDTO name(String strName) {
        this.setPSDEChartAxesName(strName);
        return this;
    }

    @JsonProperty(value="psdechartid")
    public void setPSDEChartId(String pSDEChartId) {
        this._set(DTOFIELD_PSDECHARTID, pSDEChartId);
    }

    @JsonIgnore
    public String getPSDEChartId() {
        Object objValue = this._get(DTOFIELD_PSDECHARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartIdDirty() {
        return this._contains(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public void resetPSDEChartId() {
        this._reset(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public PSDEChartAxesDTO psdechartid(String pSDEChartId) {
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO psdechartid(PSDEChartDTO pSDEChart) {
        if (pSDEChart == null) {
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
            this.setPSDEId(pSDEChart.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="psdechartname")
    public void setPSDEChartName(String pSDEChartName) {
        this._set(DTOFIELD_PSDECHARTNAME, pSDEChartName);
    }

    @JsonIgnore
    public String getPSDEChartName() {
        Object objValue = this._get(DTOFIELD_PSDECHARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartNameDirty() {
        return this._contains(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public void resetPSDEChartName() {
        this._reset(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public PSDEChartAxesDTO psdechartname(String pSDEChartName) {
        this.setPSDEChartName(pSDEChartName);
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
    public PSDEChartAxesDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEChartAxesDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEChartAxesDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEChartAxesDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEChartAxesDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEChartAxesDTO updatedate(Timestamp updateDate) {
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
    public PSDEChartAxesDTO updateman(String updateMan) {
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
    public PSDEChartAxesDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEChartAxesDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
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
    public PSDEChartAxesDTO userparams(String userParams) {
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
    public PSDEChartAxesDTO usertag(String userTag) {
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
    public PSDEChartAxesDTO usertag2(String userTag2) {
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
    public PSDEChartAxesDTO usertag3(String userTag3) {
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
    public PSDEChartAxesDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEChartAxesId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEChartAxesId(strValue);
    }

    @JsonIgnore
    public PSDEChartAxesDTO id(String strValue) {
        this.setPSDEChartAxesId(strValue);
        return this;
    }
}
