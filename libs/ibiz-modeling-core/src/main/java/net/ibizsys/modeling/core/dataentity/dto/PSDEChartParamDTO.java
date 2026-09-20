/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$ChartCSIndex
 *  net.ibizsys.model.PSModelEnums$ChartCoordinateSystem
 *  net.ibizsys.model.PSModelEnums$ChartFunnelAlign
 *  net.ibizsys.model.PSModelEnums$ChartPieRoseType
 *  net.ibizsys.model.PSModelEnums$ChartSeriesGroupMode
 *  net.ibizsys.model.PSModelEnums$ChartSeriesLayoutBy
 *  net.ibizsys.model.PSModelEnums$ChartType
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartAxesDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEChartParamDTO
extends PSModelDTOBase {
    public static final String FIELD_BARCATEGORYGAP = "BARCATEGORYGAP";
    protected static final String DTOFIELD_BARCATEGORYGAP = "barcategorygap";
    public static final String FIELD_BARGAP = "BARGAP";
    protected static final String DTOFIELD_BARGAP = "bargap";
    public static final String FIELD_BARMAXWIDTH = "BARMAXWIDTH";
    protected static final String DTOFIELD_BARMAXWIDTH = "barmaxwidth";
    public static final String FIELD_BARMINHEIGHT = "BARMINHEIGHT";
    protected static final String DTOFIELD_BARMINHEIGHT = "barminheight";
    public static final String FIELD_BARMINWIDTH = "BARMINWIDTH";
    protected static final String DTOFIELD_BARMINWIDTH = "barminwidth";
    public static final String FIELD_BARWIDTH = "BARWIDTH";
    protected static final String DTOFIELD_BARWIDTH = "barwidth";
    public static final String FIELD_BOTTOMPOS = "BOTTOMPOS";
    protected static final String DTOFIELD_BOTTOMPOS = "bottompos";
    public static final String FIELD_BOXWIDTHS = "BOXWIDTHS";
    protected static final String DTOFIELD_BOXWIDTHS = "boxwidths";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CENTER = "CENTER";
    protected static final String DTOFIELD_CENTER = "center";
    public static final String FIELD_CHARTTYPE = "CHARTTYPE";
    protected static final String DTOFIELD_CHARTTYPE = "charttype";
    public static final String FIELD_CLOCKWISE = "CLOCKWISE";
    protected static final String DTOFIELD_CLOCKWISE = "clockwise";
    public static final String FIELD_COORDINATESYSTEM = "COORDINATESYSTEM";
    protected static final String DTOFIELD_COORDINATESYSTEM = "coordinatesystem";
    public static final String FIELD_COORDINATESYSTEMID = "COORDINATESYSTEMID";
    protected static final String DTOFIELD_COORDINATESYSTEMID = "coordinatesystemid";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CSPSSYSDYNAMODELID = "CSPSSYSDYNAMODELID";
    protected static final String DTOFIELD_CSPSSYSDYNAMODELID = "cspssysdynamodelid";
    public static final String FIELD_CSPSSYSDYNAMODELNAME = "CSPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_CSPSSYSDYNAMODELNAME = "cspssysdynamodelname";
    public static final String FIELD_CSPSSYSPFPLUGINID = "CSPSSYSPFPLUGINID";
    protected static final String DTOFIELD_CSPSSYSPFPLUGINID = "cspssyspfpluginid";
    public static final String FIELD_CSPSSYSPFPLUGINNAME = "CSPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_CSPSSYSPFPLUGINNAME = "cspssyspfpluginname";
    public static final String FIELD_DATAFIELD = "DATAFIELD";
    protected static final String DTOFIELD_DATAFIELD = "datafield";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_ENDANGLE = "ENDANGLE";
    protected static final String DTOFIELD_ENDANGLE = "endangle";
    public static final String FIELD_EXTFIELD = "EXTFIELD";
    protected static final String DTOFIELD_EXTFIELD = "extfield";
    public static final String FIELD_EXTFIELD2 = "EXTFIELD2";
    protected static final String DTOFIELD_EXTFIELD2 = "extfield2";
    public static final String FIELD_EXTFIELD3 = "EXTFIELD3";
    protected static final String DTOFIELD_EXTFIELD3 = "extfield3";
    public static final String FIELD_EXTFIELD4 = "EXTFIELD4";
    protected static final String DTOFIELD_EXTFIELD4 = "extfield4";
    public static final String FIELD_FUNNELALIGN = "FUNNELALIGN";
    protected static final String DTOFIELD_FUNNELALIGN = "funnelalign";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_MAPTYPE = "MAPTYPE";
    protected static final String DTOFIELD_MAPTYPE = "maptype";
    public static final String FIELD_MAXSIZE = "MAXSIZE";
    protected static final String DTOFIELD_MAXSIZE = "maxsize";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINANGLE = "MINANGLE";
    protected static final String DTOFIELD_MINANGLE = "minangle";
    public static final String FIELD_MINSHOWLABELANGLE = "MINSHOWLABELANGLE";
    protected static final String DTOFIELD_MINSHOWLABELANGLE = "minshowlabelangle";
    public static final String FIELD_MINSIZE = "MINSIZE";
    protected static final String DTOFIELD_MINSIZE = "minsize";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_NAVVIEWFILTER = "NAVVIEWFILTER";
    protected static final String DTOFIELD_NAVVIEWFILTER = "navviewfilter";
    public static final String FIELD_NAVVIEWPARAM = "NAVVIEWPARAM";
    protected static final String DTOFIELD_NAVVIEWPARAM = "navviewparam";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDECHARTID = "PSDECHARTID";
    protected static final String DTOFIELD_PSDECHARTID = "psdechartid";
    public static final String FIELD_PSDECHARTNAME = "PSDECHARTNAME";
    protected static final String DTOFIELD_PSDECHARTNAME = "psdechartname";
    public static final String FIELD_PSDECHARTPARAMID = "PSDECHARTPARAMID";
    protected static final String DTOFIELD_PSDECHARTPARAMID = "psdechartparamid";
    public static final String FIELD_PSDECHARTPARAMNAME = "PSDECHARTPARAMNAME";
    protected static final String DTOFIELD_PSDECHARTPARAMNAME = "psdechartparamname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_RADIUS = "RADIUS";
    protected static final String DTOFIELD_RADIUS = "radius";
    public static final String FIELD_RIGHTPOS = "RIGHTPOS";
    protected static final String DTOFIELD_RIGHTPOS = "rightpos";
    public static final String FIELD_ROSETYPE = "ROSETYPE";
    protected static final String DTOFIELD_ROSETYPE = "rosetype";
    public static final String FIELD_SAMPLEDATA = "SAMPLEDATA";
    protected static final String DTOFIELD_SAMPLEDATA = "sampledata";
    public static final String FIELD_SERIESFIELD = "SERIESFIELD";
    protected static final String DTOFIELD_SERIESFIELD = "seriesfield";
    public static final String FIELD_SERIESLAYOUTBY = "SERIESLAYOUTBY";
    protected static final String DTOFIELD_SERIESLAYOUTBY = "serieslayoutby";
    public static final String FIELD_SERIESPARAM = "SERIESPARAM";
    protected static final String DTOFIELD_SERIESPARAM = "seriesparam";
    public static final String FIELD_SERIESPARAM10 = "SERIESPARAM10";
    protected static final String DTOFIELD_SERIESPARAM10 = "seriesparam10";
    public static final String FIELD_SERIESPARAM11 = "SERIESPARAM11";
    protected static final String DTOFIELD_SERIESPARAM11 = "seriesparam11";
    public static final String FIELD_SERIESPARAM12 = "SERIESPARAM12";
    protected static final String DTOFIELD_SERIESPARAM12 = "seriesparam12";
    public static final String FIELD_SERIESPARAM2 = "SERIESPARAM2";
    protected static final String DTOFIELD_SERIESPARAM2 = "seriesparam2";
    public static final String FIELD_SERIESPARAM3 = "SERIESPARAM3";
    protected static final String DTOFIELD_SERIESPARAM3 = "seriesparam3";
    public static final String FIELD_SERIESPARAM4 = "SERIESPARAM4";
    protected static final String DTOFIELD_SERIESPARAM4 = "seriesparam4";
    public static final String FIELD_SERIESPARAM5 = "SERIESPARAM5";
    protected static final String DTOFIELD_SERIESPARAM5 = "seriesparam5";
    public static final String FIELD_SERIESPARAM6 = "SERIESPARAM6";
    protected static final String DTOFIELD_SERIESPARAM6 = "seriesparam6";
    public static final String FIELD_SERIESPARAM7 = "SERIESPARAM7";
    protected static final String DTOFIELD_SERIESPARAM7 = "seriesparam7";
    public static final String FIELD_SERIESPARAM8 = "SERIESPARAM8";
    protected static final String DTOFIELD_SERIESPARAM8 = "seriesparam8";
    public static final String FIELD_SERIESPARAM9 = "SERIESPARAM9";
    protected static final String DTOFIELD_SERIESPARAM9 = "seriesparam9";
    public static final String FIELD_SFPSCODELISTID = "SFPSCODELISTID";
    protected static final String DTOFIELD_SFPSCODELISTID = "sfpscodelistid";
    public static final String FIELD_SFPSCODELISTNAME = "SFPSCODELISTNAME";
    protected static final String DTOFIELD_SFPSCODELISTNAME = "sfpscodelistname";
    public static final String FIELD_SPLITNUMBER = "SPLITNUMBER";
    protected static final String DTOFIELD_SPLITNUMBER = "splitnumber";
    public static final String FIELD_STACK = "STACK";
    protected static final String DTOFIELD_STACK = "stack";
    public static final String FIELD_STARTANGLE = "STARTANGLE";
    protected static final String DTOFIELD_STARTANGLE = "startangle";
    public static final String FIELD_STEP = "STEP";
    protected static final String DTOFIELD_STEP = "step";
    public static final String FIELD_TAGFIELD = "TAGFIELD";
    protected static final String DTOFIELD_TAGFIELD = "tagfield";
    public static final String FIELD_TIMEGROUP = "TIMEGROUP";
    protected static final String DTOFIELD_TIMEGROUP = "timegroup";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
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
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_XFIELD = "XFIELD";
    protected static final String DTOFIELD_XFIELD = "xfield";
    public static final String FIELD_XFPSCODELISTID = "XFPSCODELISTID";
    protected static final String DTOFIELD_XFPSCODELISTID = "xfpscodelistid";
    public static final String FIELD_XFPSCODELISTNAME = "XFPSCODELISTNAME";
    protected static final String DTOFIELD_XFPSCODELISTNAME = "xfpscodelistname";
    public static final String FIELD_XPSDECHARTAXESID = "XPSDECHARTAXESID";
    protected static final String DTOFIELD_XPSDECHARTAXESID = "xpsdechartaxesid";
    public static final String FIELD_XPSDECHARTAXESNAME = "XPSDECHARTAXESNAME";
    protected static final String DTOFIELD_XPSDECHARTAXESNAME = "xpsdechartaxesname";
    public static final String FIELD_YFIELD = "YFIELD";
    protected static final String DTOFIELD_YFIELD = "yfield";
    public static final String FIELD_YPSDECHARTAXESID = "YPSDECHARTAXESID";
    protected static final String DTOFIELD_YPSDECHARTAXESID = "ypsdechartaxesid";
    public static final String FIELD_YPSDECHARTAXESNAME = "YPSDECHARTAXESNAME";
    protected static final String DTOFIELD_YPSDECHARTAXESNAME = "ypsdechartaxesname";
    public static final String FIELD_ZFIELD = "ZFIELD";
    protected static final String DTOFIELD_ZFIELD = "zfield";

    @JsonProperty(value="barcategorygap")
    public void setBarCategoryGap(String barCategoryGap) {
        this._set(DTOFIELD_BARCATEGORYGAP, barCategoryGap);
    }

    @JsonIgnore
    public String getBarCategoryGap() {
        Object objValue = this._get(DTOFIELD_BARCATEGORYGAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarCategoryGapDirty() {
        return this._contains(DTOFIELD_BARCATEGORYGAP);
    }

    @JsonIgnore
    public void resetBarCategoryGap() {
        this._reset(DTOFIELD_BARCATEGORYGAP);
    }

    @JsonIgnore
    public PSDEChartParamDTO barcategorygap(String barCategoryGap) {
        this.setBarCategoryGap(barCategoryGap);
        return this;
    }

    @JsonProperty(value="bargap")
    public void setBarGap(String barGap) {
        this._set(DTOFIELD_BARGAP, barGap);
    }

    @JsonIgnore
    public String getBarGap() {
        Object objValue = this._get(DTOFIELD_BARGAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarGapDirty() {
        return this._contains(DTOFIELD_BARGAP);
    }

    @JsonIgnore
    public void resetBarGap() {
        this._reset(DTOFIELD_BARGAP);
    }

    @JsonIgnore
    public PSDEChartParamDTO bargap(String barGap) {
        this.setBarGap(barGap);
        return this;
    }

    @JsonProperty(value="barmaxwidth")
    public void setBarMaxWidth(String barMaxWidth) {
        this._set(DTOFIELD_BARMAXWIDTH, barMaxWidth);
    }

    @JsonIgnore
    public String getBarMaxWidth() {
        Object objValue = this._get(DTOFIELD_BARMAXWIDTH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarMaxWidthDirty() {
        return this._contains(DTOFIELD_BARMAXWIDTH);
    }

    @JsonIgnore
    public void resetBarMaxWidth() {
        this._reset(DTOFIELD_BARMAXWIDTH);
    }

    @JsonIgnore
    public PSDEChartParamDTO barmaxwidth(String barMaxWidth) {
        this.setBarMaxWidth(barMaxWidth);
        return this;
    }

    @JsonProperty(value="barminheight")
    public void setBarMinHeight(String barMinHeight) {
        this._set(DTOFIELD_BARMINHEIGHT, barMinHeight);
    }

    @JsonIgnore
    public String getBarMinHeight() {
        Object objValue = this._get(DTOFIELD_BARMINHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarMinHeightDirty() {
        return this._contains(DTOFIELD_BARMINHEIGHT);
    }

    @JsonIgnore
    public void resetBarMinHeight() {
        this._reset(DTOFIELD_BARMINHEIGHT);
    }

    @JsonIgnore
    public PSDEChartParamDTO barminheight(String barMinHeight) {
        this.setBarMinHeight(barMinHeight);
        return this;
    }

    @JsonProperty(value="barminwidth")
    public void setBarMinWidth(String barMinWidth) {
        this._set(DTOFIELD_BARMINWIDTH, barMinWidth);
    }

    @JsonIgnore
    public String getBarMinWidth() {
        Object objValue = this._get(DTOFIELD_BARMINWIDTH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarMinWidthDirty() {
        return this._contains(DTOFIELD_BARMINWIDTH);
    }

    @JsonIgnore
    public void resetBarMinWidth() {
        this._reset(DTOFIELD_BARMINWIDTH);
    }

    @JsonIgnore
    public PSDEChartParamDTO barminwidth(String barMinWidth) {
        this.setBarMinWidth(barMinWidth);
        return this;
    }

    @JsonProperty(value="barwidth")
    public void setBarWidth(String barWidth) {
        this._set(DTOFIELD_BARWIDTH, barWidth);
    }

    @JsonIgnore
    public String getBarWidth() {
        Object objValue = this._get(DTOFIELD_BARWIDTH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBarWidthDirty() {
        return this._contains(DTOFIELD_BARWIDTH);
    }

    @JsonIgnore
    public void resetBarWidth() {
        this._reset(DTOFIELD_BARWIDTH);
    }

    @JsonIgnore
    public PSDEChartParamDTO barwidth(String barWidth) {
        this.setBarWidth(barWidth);
        return this;
    }

    @JsonProperty(value="bottompos")
    public void setBottomPos(String bottomPos) {
        this._set(DTOFIELD_BOTTOMPOS, bottomPos);
    }

    @JsonIgnore
    public String getBottomPos() {
        Object objValue = this._get(DTOFIELD_BOTTOMPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBottomPosDirty() {
        return this._contains(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public void resetBottomPos() {
        this._reset(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public PSDEChartParamDTO bottompos(String bottomPos) {
        this.setBottomPos(bottomPos);
        return this;
    }

    @JsonProperty(value="boxwidths")
    public void setBoxWidths(String boxWidths) {
        this._set(DTOFIELD_BOXWIDTHS, boxWidths);
    }

    @JsonIgnore
    public String getBoxWidths() {
        Object objValue = this._get(DTOFIELD_BOXWIDTHS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBoxWidthsDirty() {
        return this._contains(DTOFIELD_BOXWIDTHS);
    }

    @JsonIgnore
    public void resetBoxWidths() {
        this._reset(DTOFIELD_BOXWIDTHS);
    }

    @JsonIgnore
    public PSDEChartParamDTO boxwidths(String boxWidths) {
        this.setBoxWidths(boxWidths);
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
    public PSDEChartParamDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEChartParamDTO cappslanresname(String capPSLanResName) {
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
    public PSDEChartParamDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="center")
    public void setCenter(String center) {
        this._set(DTOFIELD_CENTER, center);
    }

    @JsonIgnore
    public String getCenter() {
        Object objValue = this._get(DTOFIELD_CENTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCenterDirty() {
        return this._contains(DTOFIELD_CENTER);
    }

    @JsonIgnore
    public void resetCenter() {
        this._reset(DTOFIELD_CENTER);
    }

    @JsonIgnore
    public PSDEChartParamDTO center(String center) {
        this.setCenter(center);
        return this;
    }

    @JsonProperty(value="charttype")
    public void setChartType(String chartType) {
        this._set(DTOFIELD_CHARTTYPE, chartType);
    }

    @JsonIgnore
    public String getChartType() {
        Object objValue = this._get(DTOFIELD_CHARTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChartTypeDirty() {
        return this._contains(DTOFIELD_CHARTTYPE);
    }

    @JsonIgnore
    public void resetChartType() {
        this._reset(DTOFIELD_CHARTTYPE);
    }

    @JsonIgnore
    public PSDEChartParamDTO charttype(String chartType) {
        this.setChartType(chartType);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO charttype(PSModelEnums.ChartType chartType) {
        if (chartType == null) {
            this.setChartType(null);
        } else {
            this.setChartType(chartType.value);
        }
        return this;
    }

    @JsonProperty(value="clockwise")
    public void setClockWise(Integer clockWise) {
        this._set(DTOFIELD_CLOCKWISE, clockWise);
    }

    @JsonIgnore
    public Integer getClockWise() {
        Object objValue = this._get(DTOFIELD_CLOCKWISE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isClockWiseDirty() {
        return this._contains(DTOFIELD_CLOCKWISE);
    }

    @JsonIgnore
    public void resetClockWise() {
        this._reset(DTOFIELD_CLOCKWISE);
    }

    @JsonIgnore
    public PSDEChartParamDTO clockwise(Integer clockWise) {
        this.setClockWise(clockWise);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO clockwise(Boolean clockWise) {
        if (clockWise == null) {
            this.setClockWise(null);
        } else {
            this.setClockWise(clockWise != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="coordinatesystem")
    public void setCoordinateSystem(String coordinateSystem) {
        this._set(DTOFIELD_COORDINATESYSTEM, coordinateSystem);
    }

    @JsonIgnore
    public String getCoordinateSystem() {
        Object objValue = this._get(DTOFIELD_COORDINATESYSTEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCoordinateSystemDirty() {
        return this._contains(DTOFIELD_COORDINATESYSTEM);
    }

    @JsonIgnore
    public void resetCoordinateSystem() {
        this._reset(DTOFIELD_COORDINATESYSTEM);
    }

    @JsonIgnore
    public PSDEChartParamDTO coordinatesystem(String coordinateSystem) {
        this.setCoordinateSystem(coordinateSystem);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO coordinatesystem(PSModelEnums.ChartCoordinateSystem coordinateSystem) {
        if (coordinateSystem == null) {
            this.setCoordinateSystem(null);
        } else {
            this.setCoordinateSystem(coordinateSystem.value);
        }
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
    public PSDEChartParamDTO coordinatesystemid(Integer coordinateSystemId) {
        this.setCoordinateSystemId(coordinateSystemId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO coordinatesystemid(PSModelEnums.ChartCSIndex coordinateSystemId) {
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
    public PSDEChartParamDTO createdate(Timestamp createDate) {
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
    public PSDEChartParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="cspssysdynamodelid")
    public void setCSPSSysDynaModelId(String cSPSSysDynaModelId) {
        this._set(DTOFIELD_CSPSSYSDYNAMODELID, cSPSSysDynaModelId);
    }

    @JsonIgnore
    public String getCSPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_CSPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_CSPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetCSPSSysDynaModelId() {
        this._reset(DTOFIELD_CSPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssysdynamodelid(String cSPSSysDynaModelId) {
        this.setCSPSSysDynaModelId(cSPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setCSPSSysDynaModelId(null);
            this.setCSPSSysDynaModelName(null);
        } else {
            this.setCSPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setCSPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="cspssysdynamodelname")
    public void setCSPSSysDynaModelName(String cSPSSysDynaModelName) {
        this._set(DTOFIELD_CSPSSYSDYNAMODELNAME, cSPSSysDynaModelName);
    }

    @JsonIgnore
    public String getCSPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_CSPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_CSPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetCSPSSysDynaModelName() {
        this._reset(DTOFIELD_CSPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssysdynamodelname(String cSPSSysDynaModelName) {
        this.setCSPSSysDynaModelName(cSPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="cspssyspfpluginid")
    public void setCSPSSysPFPluginId(String cSPSSysPFPluginId) {
        this._set(DTOFIELD_CSPSSYSPFPLUGINID, cSPSSysPFPluginId);
    }

    @JsonIgnore
    public String getCSPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_CSPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_CSPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetCSPSSysPFPluginId() {
        this._reset(DTOFIELD_CSPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssyspfpluginid(String cSPSSysPFPluginId) {
        this.setCSPSSysPFPluginId(cSPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setCSPSSysPFPluginId(null);
            this.setCSPSSysPFPluginName(null);
        } else {
            this.setCSPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setCSPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="cspssyspfpluginname")
    public void setCSPSSysPFPluginName(String cSPSSysPFPluginName) {
        this._set(DTOFIELD_CSPSSYSPFPLUGINNAME, cSPSSysPFPluginName);
    }

    @JsonIgnore
    public String getCSPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_CSPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_CSPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetCSPSSysPFPluginName() {
        this._reset(DTOFIELD_CSPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO cspssyspfpluginname(String cSPSSysPFPluginName) {
        this.setCSPSSysPFPluginName(cSPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="datafield")
    public void setDataField(String dataField) {
        this._set(DTOFIELD_DATAFIELD, dataField);
    }

    @JsonIgnore
    public String getDataField() {
        Object objValue = this._get(DTOFIELD_DATAFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataFieldDirty() {
        return this._contains(DTOFIELD_DATAFIELD);
    }

    @JsonIgnore
    public void resetDataField() {
        this._reset(DTOFIELD_DATAFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO datafield(String dataField) {
        this.setDataField(dataField);
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
    public PSDEChartParamDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="endangle")
    public void setEndAngle(Integer endAngle) {
        this._set(DTOFIELD_ENDANGLE, endAngle);
    }

    @JsonIgnore
    public Integer getEndAngle() {
        Object objValue = this._get(DTOFIELD_ENDANGLE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEndAngleDirty() {
        return this._contains(DTOFIELD_ENDANGLE);
    }

    @JsonIgnore
    public void resetEndAngle() {
        this._reset(DTOFIELD_ENDANGLE);
    }

    @JsonIgnore
    public PSDEChartParamDTO endangle(Integer endAngle) {
        this.setEndAngle(endAngle);
        return this;
    }

    @JsonProperty(value="extfield")
    public void setExtField(String extField) {
        this._set(DTOFIELD_EXTFIELD, extField);
    }

    @JsonIgnore
    public String getExtField() {
        Object objValue = this._get(DTOFIELD_EXTFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtFieldDirty() {
        return this._contains(DTOFIELD_EXTFIELD);
    }

    @JsonIgnore
    public void resetExtField() {
        this._reset(DTOFIELD_EXTFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO extfield(String extField) {
        this.setExtField(extField);
        return this;
    }

    @JsonProperty(value="extfield2")
    public void setExtField2(String extField2) {
        this._set(DTOFIELD_EXTFIELD2, extField2);
    }

    @JsonIgnore
    public String getExtField2() {
        Object objValue = this._get(DTOFIELD_EXTFIELD2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtField2Dirty() {
        return this._contains(DTOFIELD_EXTFIELD2);
    }

    @JsonIgnore
    public void resetExtField2() {
        this._reset(DTOFIELD_EXTFIELD2);
    }

    @JsonIgnore
    public PSDEChartParamDTO extfield2(String extField2) {
        this.setExtField2(extField2);
        return this;
    }

    @JsonProperty(value="extfield3")
    public void setExtField3(String extField3) {
        this._set(DTOFIELD_EXTFIELD3, extField3);
    }

    @JsonIgnore
    public String getExtField3() {
        Object objValue = this._get(DTOFIELD_EXTFIELD3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtField3Dirty() {
        return this._contains(DTOFIELD_EXTFIELD3);
    }

    @JsonIgnore
    public void resetExtField3() {
        this._reset(DTOFIELD_EXTFIELD3);
    }

    @JsonIgnore
    public PSDEChartParamDTO extfield3(String extField3) {
        this.setExtField3(extField3);
        return this;
    }

    @JsonProperty(value="extfield4")
    public void setExtField4(String extField4) {
        this._set(DTOFIELD_EXTFIELD4, extField4);
    }

    @JsonIgnore
    public String getExtField4() {
        Object objValue = this._get(DTOFIELD_EXTFIELD4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtField4Dirty() {
        return this._contains(DTOFIELD_EXTFIELD4);
    }

    @JsonIgnore
    public void resetExtField4() {
        this._reset(DTOFIELD_EXTFIELD4);
    }

    @JsonIgnore
    public PSDEChartParamDTO extfield4(String extField4) {
        this.setExtField4(extField4);
        return this;
    }

    @JsonProperty(value="funnelalign")
    public void setFunnelAlign(String funnelAlign) {
        this._set(DTOFIELD_FUNNELALIGN, funnelAlign);
    }

    @JsonIgnore
    public String getFunnelAlign() {
        Object objValue = this._get(DTOFIELD_FUNNELALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFunnelAlignDirty() {
        return this._contains(DTOFIELD_FUNNELALIGN);
    }

    @JsonIgnore
    public void resetFunnelAlign() {
        this._reset(DTOFIELD_FUNNELALIGN);
    }

    @JsonIgnore
    public PSDEChartParamDTO funnelalign(String funnelAlign) {
        this.setFunnelAlign(funnelAlign);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO funnelalign(PSModelEnums.ChartFunnelAlign funnelAlign) {
        if (funnelAlign == null) {
            this.setFunnelAlign(null);
        } else {
            this.setFunnelAlign(funnelAlign.value);
        }
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(String height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public String getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeightDirty() {
        return this._contains(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public void resetHeight() {
        this._reset(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public PSDEChartParamDTO height(String height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="leftpos")
    public void setLeftPos(String leftPos) {
        this._set(DTOFIELD_LEFTPOS, leftPos);
    }

    @JsonIgnore
    public String getLeftPos() {
        Object objValue = this._get(DTOFIELD_LEFTPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLeftPosDirty() {
        return this._contains(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public void resetLeftPos() {
        this._reset(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public PSDEChartParamDTO leftpos(String leftPos) {
        this.setLeftPos(leftPos);
        return this;
    }

    @JsonProperty(value="maptype")
    public void setMapType(String mapType) {
        this._set(DTOFIELD_MAPTYPE, mapType);
    }

    @JsonIgnore
    public String getMapType() {
        Object objValue = this._get(DTOFIELD_MAPTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTypeDirty() {
        return this._contains(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public void resetMapType() {
        this._reset(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public PSDEChartParamDTO maptype(String mapType) {
        this.setMapType(mapType);
        return this;
    }

    @JsonProperty(value="maxsize")
    public void setMaxSize(String maxSize) {
        this._set(DTOFIELD_MAXSIZE, maxSize);
    }

    @JsonIgnore
    public String getMaxSize() {
        Object objValue = this._get(DTOFIELD_MAXSIZE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaxSizeDirty() {
        return this._contains(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public void resetMaxSize() {
        this._reset(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public PSDEChartParamDTO maxsize(String maxSize) {
        this.setMaxSize(maxSize);
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(Integer maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public Integer getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSDEChartParamDTO maxvalue(Integer maxValue) {
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
    public PSDEChartParamDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minangle")
    public void setMinAngle(Integer minAngle) {
        this._set(DTOFIELD_MINANGLE, minAngle);
    }

    @JsonIgnore
    public Integer getMinAngle() {
        Object objValue = this._get(DTOFIELD_MINANGLE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinAngleDirty() {
        return this._contains(DTOFIELD_MINANGLE);
    }

    @JsonIgnore
    public void resetMinAngle() {
        this._reset(DTOFIELD_MINANGLE);
    }

    @JsonIgnore
    public PSDEChartParamDTO minangle(Integer minAngle) {
        this.setMinAngle(minAngle);
        return this;
    }

    @JsonProperty(value="minshowlabelangle")
    public void setMinShowLabelAngle(Integer minShowLabelAngle) {
        this._set(DTOFIELD_MINSHOWLABELANGLE, minShowLabelAngle);
    }

    @JsonIgnore
    public Integer getMinShowLabelAngle() {
        Object objValue = this._get(DTOFIELD_MINSHOWLABELANGLE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinShowLabelAngleDirty() {
        return this._contains(DTOFIELD_MINSHOWLABELANGLE);
    }

    @JsonIgnore
    public void resetMinShowLabelAngle() {
        this._reset(DTOFIELD_MINSHOWLABELANGLE);
    }

    @JsonIgnore
    public PSDEChartParamDTO minshowlabelangle(Integer minShowLabelAngle) {
        this.setMinShowLabelAngle(minShowLabelAngle);
        return this;
    }

    @JsonProperty(value="minsize")
    public void setMinSize(String minSize) {
        this._set(DTOFIELD_MINSIZE, minSize);
    }

    @JsonIgnore
    public String getMinSize() {
        Object objValue = this._get(DTOFIELD_MINSIZE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinSizeDirty() {
        return this._contains(DTOFIELD_MINSIZE);
    }

    @JsonIgnore
    public void resetMinSize() {
        this._reset(DTOFIELD_MINSIZE);
    }

    @JsonIgnore
    public PSDEChartParamDTO minsize(String minSize) {
        this.setMinSize(minSize);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(Integer minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public Integer getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSDEChartParamDTO minvalue(Integer minValue) {
        this.setMinValue(minValue);
        return this;
    }

    @JsonProperty(value="navviewfilter")
    public void setNavViewFilter(String navViewFilter) {
        this._set(DTOFIELD_NAVVIEWFILTER, navViewFilter);
    }

    @JsonIgnore
    public String getNavViewFilter() {
        Object objValue = this._get(DTOFIELD_NAVVIEWFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewFilterDirty() {
        return this._contains(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public void resetNavViewFilter() {
        this._reset(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public PSDEChartParamDTO navviewfilter(String navViewFilter) {
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    @JsonProperty(value="navviewparam")
    public void setNavViewParam(String navViewParam) {
        this._set(DTOFIELD_NAVVIEWPARAM, navViewParam);
    }

    @JsonIgnore
    public String getNavViewParam() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewParamDirty() {
        return this._contains(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public void resetNavViewParam() {
        this._reset(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public PSDEChartParamDTO navviewparam(String navViewParam) {
        this.setNavViewParam(navViewParam);
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
    public PSDEChartParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEChartParamDTO psdechartid(String pSDEChartId) {
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO psdechartid(PSDEChartDTO pSDEChart) {
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
    public PSDEChartParamDTO psdechartname(String pSDEChartName) {
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    @JsonProperty(value="psdechartparamid")
    public void setPSDEChartParamId(String pSDEChartParamId) {
        this._set(DTOFIELD_PSDECHARTPARAMID, pSDEChartParamId);
    }

    @JsonIgnore
    public String getPSDEChartParamId() {
        Object objValue = this._get(DTOFIELD_PSDECHARTPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartParamIdDirty() {
        return this._contains(DTOFIELD_PSDECHARTPARAMID);
    }

    @JsonIgnore
    public void resetPSDEChartParamId() {
        this._reset(DTOFIELD_PSDECHARTPARAMID);
    }

    @JsonIgnore
    public PSDEChartParamDTO psdechartparamid(String pSDEChartParamId) {
        this.setPSDEChartParamId(pSDEChartParamId);
        return this;
    }

    @JsonProperty(value="psdechartparamname")
    public void setPSDEChartParamName(String pSDEChartParamName) {
        this._set(DTOFIELD_PSDECHARTPARAMNAME, pSDEChartParamName);
    }

    @JsonIgnore
    public String getPSDEChartParamName() {
        Object objValue = this._get(DTOFIELD_PSDECHARTPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartParamNameDirty() {
        return this._contains(DTOFIELD_PSDECHARTPARAMNAME);
    }

    @JsonIgnore
    public void resetPSDEChartParamName() {
        this._reset(DTOFIELD_PSDECHARTPARAMNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO psdechartparamname(String pSDEChartParamName) {
        this.setPSDEChartParamName(pSDEChartParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEChartParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEChartParamName(strName);
    }

    @JsonIgnore
    public PSDEChartParamDTO name(String strName) {
        this.setPSDEChartParamName(strName);
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
    public PSDEChartParamDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDEChartParamDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSDEChartParamDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
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
    public PSDEChartParamDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEChartParamDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEChartParamDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEChartParamDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="radius")
    public void setRadius(String radius) {
        this._set(DTOFIELD_RADIUS, radius);
    }

    @JsonIgnore
    public String getRadius() {
        Object objValue = this._get(DTOFIELD_RADIUS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRadiusDirty() {
        return this._contains(DTOFIELD_RADIUS);
    }

    @JsonIgnore
    public void resetRadius() {
        this._reset(DTOFIELD_RADIUS);
    }

    @JsonIgnore
    public PSDEChartParamDTO radius(String radius) {
        this.setRadius(radius);
        return this;
    }

    @JsonProperty(value="rightpos")
    public void setRightPos(String rightPos) {
        this._set(DTOFIELD_RIGHTPOS, rightPos);
    }

    @JsonIgnore
    public String getRightPos() {
        Object objValue = this._get(DTOFIELD_RIGHTPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRightPosDirty() {
        return this._contains(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public void resetRightPos() {
        this._reset(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public PSDEChartParamDTO rightpos(String rightPos) {
        this.setRightPos(rightPos);
        return this;
    }

    @JsonProperty(value="rosetype")
    public void setRoseType(String roseType) {
        this._set(DTOFIELD_ROSETYPE, roseType);
    }

    @JsonIgnore
    public String getRoseType() {
        Object objValue = this._get(DTOFIELD_ROSETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRoseTypeDirty() {
        return this._contains(DTOFIELD_ROSETYPE);
    }

    @JsonIgnore
    public void resetRoseType() {
        this._reset(DTOFIELD_ROSETYPE);
    }

    @JsonIgnore
    public PSDEChartParamDTO rosetype(String roseType) {
        this.setRoseType(roseType);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO rosetype(PSModelEnums.ChartPieRoseType roseType) {
        if (roseType == null) {
            this.setRoseType(null);
        } else {
            this.setRoseType(roseType.value);
        }
        return this;
    }

    @JsonProperty(value="sampledata")
    public void setSampleData(String sampleData) {
        this._set(DTOFIELD_SAMPLEDATA, sampleData);
    }

    @JsonIgnore
    public String getSampleData() {
        Object objValue = this._get(DTOFIELD_SAMPLEDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSampleDataDirty() {
        return this._contains(DTOFIELD_SAMPLEDATA);
    }

    @JsonIgnore
    public void resetSampleData() {
        this._reset(DTOFIELD_SAMPLEDATA);
    }

    @JsonIgnore
    public PSDEChartParamDTO sampledata(String sampleData) {
        this.setSampleData(sampleData);
        return this;
    }

    @JsonProperty(value="seriesfield")
    public void setSeriesField(String seriesField) {
        this._set(DTOFIELD_SERIESFIELD, seriesField);
    }

    @JsonIgnore
    public String getSeriesField() {
        Object objValue = this._get(DTOFIELD_SERIESFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesFieldDirty() {
        return this._contains(DTOFIELD_SERIESFIELD);
    }

    @JsonIgnore
    public void resetSeriesField() {
        this._reset(DTOFIELD_SERIESFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesfield(String seriesField) {
        this.setSeriesField(seriesField);
        return this;
    }

    @JsonProperty(value="serieslayoutby")
    public void setSeriesLayoutBy(String seriesLayoutBy) {
        this._set(DTOFIELD_SERIESLAYOUTBY, seriesLayoutBy);
    }

    @JsonIgnore
    public String getSeriesLayoutBy() {
        Object objValue = this._get(DTOFIELD_SERIESLAYOUTBY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesLayoutByDirty() {
        return this._contains(DTOFIELD_SERIESLAYOUTBY);
    }

    @JsonIgnore
    public void resetSeriesLayoutBy() {
        this._reset(DTOFIELD_SERIESLAYOUTBY);
    }

    @JsonIgnore
    public PSDEChartParamDTO serieslayoutby(String seriesLayoutBy) {
        this.setSeriesLayoutBy(seriesLayoutBy);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO serieslayoutby(PSModelEnums.ChartSeriesLayoutBy seriesLayoutBy) {
        if (seriesLayoutBy == null) {
            this.setSeriesLayoutBy(null);
        } else {
            this.setSeriesLayoutBy(seriesLayoutBy.value);
        }
        return this;
    }

    @JsonProperty(value="seriesparam")
    public void setSeriesParam(String seriesParam) {
        this._set(DTOFIELD_SERIESPARAM, seriesParam);
    }

    @JsonIgnore
    public String getSeriesParam() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParamDirty() {
        return this._contains(DTOFIELD_SERIESPARAM);
    }

    @JsonIgnore
    public void resetSeriesParam() {
        this._reset(DTOFIELD_SERIESPARAM);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam(String seriesParam) {
        this.setSeriesParam(seriesParam);
        return this;
    }

    @JsonProperty(value="seriesparam10")
    public void setSeriesParam10(Double seriesParam10) {
        this._set(DTOFIELD_SERIESPARAM10, seriesParam10);
    }

    @JsonIgnore
    public Double getSeriesParam10() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam10Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM10);
    }

    @JsonIgnore
    public void resetSeriesParam10() {
        this._reset(DTOFIELD_SERIESPARAM10);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam10(Double seriesParam10) {
        this.setSeriesParam10(seriesParam10);
        return this;
    }

    @JsonProperty(value="seriesparam11")
    public void setSeriesParam11(Integer seriesParam11) {
        this._set(DTOFIELD_SERIESPARAM11, seriesParam11);
    }

    @JsonIgnore
    public Integer getSeriesParam11() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam11Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM11);
    }

    @JsonIgnore
    public void resetSeriesParam11() {
        this._reset(DTOFIELD_SERIESPARAM11);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam11(Integer seriesParam11) {
        this.setSeriesParam11(seriesParam11);
        return this;
    }

    @JsonProperty(value="seriesparam12")
    public void setSeriesParam12(Integer seriesParam12) {
        this._set(DTOFIELD_SERIESPARAM12, seriesParam12);
    }

    @JsonIgnore
    public Integer getSeriesParam12() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam12Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM12);
    }

    @JsonIgnore
    public void resetSeriesParam12() {
        this._reset(DTOFIELD_SERIESPARAM12);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam12(Integer seriesParam12) {
        this.setSeriesParam12(seriesParam12);
        return this;
    }

    @JsonProperty(value="seriesparam2")
    public void setSeriesParam2(String seriesParam2) {
        this._set(DTOFIELD_SERIESPARAM2, seriesParam2);
    }

    @JsonIgnore
    public String getSeriesParam2() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam2Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM2);
    }

    @JsonIgnore
    public void resetSeriesParam2() {
        this._reset(DTOFIELD_SERIESPARAM2);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam2(String seriesParam2) {
        this.setSeriesParam2(seriesParam2);
        return this;
    }

    @JsonProperty(value="seriesparam3")
    public void setSeriesParam3(String seriesParam3) {
        this._set(DTOFIELD_SERIESPARAM3, seriesParam3);
    }

    @JsonIgnore
    public String getSeriesParam3() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam3Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM3);
    }

    @JsonIgnore
    public void resetSeriesParam3() {
        this._reset(DTOFIELD_SERIESPARAM3);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam3(String seriesParam3) {
        this.setSeriesParam3(seriesParam3);
        return this;
    }

    @JsonProperty(value="seriesparam4")
    public void setSeriesParam4(String seriesParam4) {
        this._set(DTOFIELD_SERIESPARAM4, seriesParam4);
    }

    @JsonIgnore
    public String getSeriesParam4() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam4Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM4);
    }

    @JsonIgnore
    public void resetSeriesParam4() {
        this._reset(DTOFIELD_SERIESPARAM4);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam4(String seriesParam4) {
        this.setSeriesParam4(seriesParam4);
        return this;
    }

    @JsonProperty(value="seriesparam5")
    public void setSeriesParam5(Integer seriesParam5) {
        this._set(DTOFIELD_SERIESPARAM5, seriesParam5);
    }

    @JsonIgnore
    public Integer getSeriesParam5() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam5Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM5);
    }

    @JsonIgnore
    public void resetSeriesParam5() {
        this._reset(DTOFIELD_SERIESPARAM5);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam5(Integer seriesParam5) {
        this.setSeriesParam5(seriesParam5);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam5(Boolean seriesParam5) {
        if (seriesParam5 == null) {
            this.setSeriesParam5(null);
        } else {
            this.setSeriesParam5(seriesParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="seriesparam6")
    public void setSeriesParam6(Integer seriesParam6) {
        this._set(DTOFIELD_SERIESPARAM6, seriesParam6);
    }

    @JsonIgnore
    public Integer getSeriesParam6() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam6Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM6);
    }

    @JsonIgnore
    public void resetSeriesParam6() {
        this._reset(DTOFIELD_SERIESPARAM6);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam6(Integer seriesParam6) {
        this.setSeriesParam6(seriesParam6);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam6(Boolean seriesParam6) {
        if (seriesParam6 == null) {
            this.setSeriesParam6(null);
        } else {
            this.setSeriesParam6(seriesParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="seriesparam7")
    public void setSeriesParam7(Integer seriesParam7) {
        this._set(DTOFIELD_SERIESPARAM7, seriesParam7);
    }

    @JsonIgnore
    public Integer getSeriesParam7() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam7Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM7);
    }

    @JsonIgnore
    public void resetSeriesParam7() {
        this._reset(DTOFIELD_SERIESPARAM7);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam7(Integer seriesParam7) {
        this.setSeriesParam7(seriesParam7);
        return this;
    }

    @JsonProperty(value="seriesparam8")
    public void setSeriesParam8(Integer seriesParam8) {
        this._set(DTOFIELD_SERIESPARAM8, seriesParam8);
    }

    @JsonIgnore
    public Integer getSeriesParam8() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam8Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM8);
    }

    @JsonIgnore
    public void resetSeriesParam8() {
        this._reset(DTOFIELD_SERIESPARAM8);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam8(Integer seriesParam8) {
        this.setSeriesParam8(seriesParam8);
        return this;
    }

    @JsonProperty(value="seriesparam9")
    public void setSeriesParam9(Double seriesParam9) {
        this._set(DTOFIELD_SERIESPARAM9, seriesParam9);
    }

    @JsonIgnore
    public Double getSeriesParam9() {
        Object objValue = this._get(DTOFIELD_SERIESPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isSeriesParam9Dirty() {
        return this._contains(DTOFIELD_SERIESPARAM9);
    }

    @JsonIgnore
    public void resetSeriesParam9() {
        this._reset(DTOFIELD_SERIESPARAM9);
    }

    @JsonIgnore
    public PSDEChartParamDTO seriesparam9(Double seriesParam9) {
        this.setSeriesParam9(seriesParam9);
        return this;
    }

    @JsonProperty(value="sfpscodelistid")
    public void setSFPSCodeListId(String sFPSCodeListId) {
        this._set(DTOFIELD_SFPSCODELISTID, sFPSCodeListId);
    }

    @JsonIgnore
    public String getSFPSCodeListId() {
        Object objValue = this._get(DTOFIELD_SFPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSFPSCodeListIdDirty() {
        return this._contains(DTOFIELD_SFPSCODELISTID);
    }

    @JsonIgnore
    public void resetSFPSCodeListId() {
        this._reset(DTOFIELD_SFPSCODELISTID);
    }

    @JsonIgnore
    public PSDEChartParamDTO sfpscodelistid(String sFPSCodeListId) {
        this.setSFPSCodeListId(sFPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO sfpscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setSFPSCodeListId(null);
            this.setSFPSCodeListName(null);
        } else {
            this.setSFPSCodeListId(pSCodeList.getPSCodeListId());
            this.setSFPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="sfpscodelistname")
    public void setSFPSCodeListName(String sFPSCodeListName) {
        this._set(DTOFIELD_SFPSCODELISTNAME, sFPSCodeListName);
    }

    @JsonIgnore
    public String getSFPSCodeListName() {
        Object objValue = this._get(DTOFIELD_SFPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSFPSCodeListNameDirty() {
        return this._contains(DTOFIELD_SFPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetSFPSCodeListName() {
        this._reset(DTOFIELD_SFPSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO sfpscodelistname(String sFPSCodeListName) {
        this.setSFPSCodeListName(sFPSCodeListName);
        return this;
    }

    @JsonProperty(value="splitnumber")
    public void setSplitNumber(Integer splitNumber) {
        this._set(DTOFIELD_SPLITNUMBER, splitNumber);
    }

    @JsonIgnore
    public Integer getSplitNumber() {
        Object objValue = this._get(DTOFIELD_SPLITNUMBER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSplitNumberDirty() {
        return this._contains(DTOFIELD_SPLITNUMBER);
    }

    @JsonIgnore
    public void resetSplitNumber() {
        this._reset(DTOFIELD_SPLITNUMBER);
    }

    @JsonIgnore
    public PSDEChartParamDTO splitnumber(Integer splitNumber) {
        this.setSplitNumber(splitNumber);
        return this;
    }

    @JsonProperty(value="stack")
    public void setStack(Integer stack) {
        this._set(DTOFIELD_STACK, stack);
    }

    @JsonIgnore
    public Integer getStack() {
        Object objValue = this._get(DTOFIELD_STACK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStackDirty() {
        return this._contains(DTOFIELD_STACK);
    }

    @JsonIgnore
    public void resetStack() {
        this._reset(DTOFIELD_STACK);
    }

    @JsonIgnore
    public PSDEChartParamDTO stack(Integer stack) {
        this.setStack(stack);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO stack(Boolean stack) {
        if (stack == null) {
            this.setStack(null);
        } else {
            this.setStack(stack != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="startangle")
    public void setStartAngle(Integer startAngle) {
        this._set(DTOFIELD_STARTANGLE, startAngle);
    }

    @JsonIgnore
    public Integer getStartAngle() {
        Object objValue = this._get(DTOFIELD_STARTANGLE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStartAngleDirty() {
        return this._contains(DTOFIELD_STARTANGLE);
    }

    @JsonIgnore
    public void resetStartAngle() {
        this._reset(DTOFIELD_STARTANGLE);
    }

    @JsonIgnore
    public PSDEChartParamDTO startangle(Integer startAngle) {
        this.setStartAngle(startAngle);
        return this;
    }

    @JsonProperty(value="step")
    public void setStep(String step) {
        this._set(DTOFIELD_STEP, step);
    }

    @JsonIgnore
    public String getStep() {
        Object objValue = this._get(DTOFIELD_STEP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStepDirty() {
        return this._contains(DTOFIELD_STEP);
    }

    @JsonIgnore
    public void resetStep() {
        this._reset(DTOFIELD_STEP);
    }

    @JsonIgnore
    public PSDEChartParamDTO step(String step) {
        this.setStep(step);
        return this;
    }

    @JsonProperty(value="tagfield")
    public void setTagField(String tagField) {
        this._set(DTOFIELD_TAGFIELD, tagField);
    }

    @JsonIgnore
    public String getTagField() {
        Object objValue = this._get(DTOFIELD_TAGFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTagFieldDirty() {
        return this._contains(DTOFIELD_TAGFIELD);
    }

    @JsonIgnore
    public void resetTagField() {
        this._reset(DTOFIELD_TAGFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO tagfield(String tagField) {
        this.setTagField(tagField);
        return this;
    }

    @JsonProperty(value="timegroup")
    public void setTimeGroup(String timeGroup) {
        this._set(DTOFIELD_TIMEGROUP, timeGroup);
    }

    @JsonIgnore
    public String getTimeGroup() {
        Object objValue = this._get(DTOFIELD_TIMEGROUP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTimeGroupDirty() {
        return this._contains(DTOFIELD_TIMEGROUP);
    }

    @JsonIgnore
    public void resetTimeGroup() {
        this._reset(DTOFIELD_TIMEGROUP);
    }

    @JsonIgnore
    public PSDEChartParamDTO timegroup(String timeGroup) {
        this.setTimeGroup(timeGroup);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO timegroup(PSModelEnums.ChartSeriesGroupMode timeGroup) {
        if (timeGroup == null) {
            this.setTimeGroup(null);
        } else {
            this.setTimeGroup(timeGroup.value);
        }
        return this;
    }

    @JsonProperty(value="toppos")
    public void setTopPos(String topPos) {
        this._set(DTOFIELD_TOPPOS, topPos);
    }

    @JsonIgnore
    public String getTopPos() {
        Object objValue = this._get(DTOFIELD_TOPPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTopPosDirty() {
        return this._contains(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public void resetTopPos() {
        this._reset(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public PSDEChartParamDTO toppos(String topPos) {
        this.setTopPos(topPos);
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
    public PSDEChartParamDTO updatedate(Timestamp updateDate) {
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
    public PSDEChartParamDTO updateman(String updateMan) {
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
    public PSDEChartParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEChartParamDTO userparams(String userParams) {
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
    public PSDEChartParamDTO usertag(String userTag) {
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
    public PSDEChartParamDTO usertag2(String userTag2) {
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
    public PSDEChartParamDTO usertag3(String userTag3) {
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
    public PSDEChartParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(String width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public String getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWidthDirty() {
        return this._contains(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public void resetWidth() {
        this._reset(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public PSDEChartParamDTO width(String width) {
        this.setWidth(width);
        return this;
    }

    @JsonProperty(value="xfield")
    public void setXField(String xField) {
        this._set(DTOFIELD_XFIELD, xField);
    }

    @JsonIgnore
    public String getXField() {
        Object objValue = this._get(DTOFIELD_XFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isXFieldDirty() {
        return this._contains(DTOFIELD_XFIELD);
    }

    @JsonIgnore
    public void resetXField() {
        this._reset(DTOFIELD_XFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO xfield(String xField) {
        this.setXField(xField);
        return this;
    }

    @JsonProperty(value="xfpscodelistid")
    public void setXFPSCodeListId(String xFPSCodeListId) {
        this._set(DTOFIELD_XFPSCODELISTID, xFPSCodeListId);
    }

    @JsonIgnore
    public String getXFPSCodeListId() {
        Object objValue = this._get(DTOFIELD_XFPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isXFPSCodeListIdDirty() {
        return this._contains(DTOFIELD_XFPSCODELISTID);
    }

    @JsonIgnore
    public void resetXFPSCodeListId() {
        this._reset(DTOFIELD_XFPSCODELISTID);
    }

    @JsonIgnore
    public PSDEChartParamDTO xfpscodelistid(String xFPSCodeListId) {
        this.setXFPSCodeListId(xFPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO xfpscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setXFPSCodeListId(null);
            this.setXFPSCodeListName(null);
        } else {
            this.setXFPSCodeListId(pSCodeList.getPSCodeListId());
            this.setXFPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="xfpscodelistname")
    public void setXFPSCodeListName(String xFPSCodeListName) {
        this._set(DTOFIELD_XFPSCODELISTNAME, xFPSCodeListName);
    }

    @JsonIgnore
    public String getXFPSCodeListName() {
        Object objValue = this._get(DTOFIELD_XFPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isXFPSCodeListNameDirty() {
        return this._contains(DTOFIELD_XFPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetXFPSCodeListName() {
        this._reset(DTOFIELD_XFPSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO xfpscodelistname(String xFPSCodeListName) {
        this.setXFPSCodeListName(xFPSCodeListName);
        return this;
    }

    @JsonProperty(value="xpsdechartaxesid")
    public void setXPSDEChartAxesId(String xPSDEChartAxesId) {
        this._set(DTOFIELD_XPSDECHARTAXESID, xPSDEChartAxesId);
    }

    @JsonIgnore
    public String getXPSDEChartAxesId() {
        Object objValue = this._get(DTOFIELD_XPSDECHARTAXESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isXPSDEChartAxesIdDirty() {
        return this._contains(DTOFIELD_XPSDECHARTAXESID);
    }

    @JsonIgnore
    public void resetXPSDEChartAxesId() {
        this._reset(DTOFIELD_XPSDECHARTAXESID);
    }

    @JsonIgnore
    public PSDEChartParamDTO xpsdechartaxesid(String xPSDEChartAxesId) {
        this.setXPSDEChartAxesId(xPSDEChartAxesId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO xpsdechartaxesid(PSDEChartAxesDTO pSDEChartAxes) {
        if (pSDEChartAxes == null) {
            this.setXPSDEChartAxesId(null);
            this.setXPSDEChartAxesName(null);
        } else {
            this.setXPSDEChartAxesId(pSDEChartAxes.getPSDEChartAxesId());
            this.setXPSDEChartAxesName(pSDEChartAxes.getPSDEChartAxesName());
        }
        return this;
    }

    @JsonProperty(value="xpsdechartaxesname")
    public void setXPSDEChartAxesName(String xPSDEChartAxesName) {
        this._set(DTOFIELD_XPSDECHARTAXESNAME, xPSDEChartAxesName);
    }

    @JsonIgnore
    public String getXPSDEChartAxesName() {
        Object objValue = this._get(DTOFIELD_XPSDECHARTAXESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isXPSDEChartAxesNameDirty() {
        return this._contains(DTOFIELD_XPSDECHARTAXESNAME);
    }

    @JsonIgnore
    public void resetXPSDEChartAxesName() {
        this._reset(DTOFIELD_XPSDECHARTAXESNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO xpsdechartaxesname(String xPSDEChartAxesName) {
        this.setXPSDEChartAxesName(xPSDEChartAxesName);
        return this;
    }

    @JsonProperty(value="yfield")
    public void setYField(String yField) {
        this._set(DTOFIELD_YFIELD, yField);
    }

    @JsonIgnore
    public String getYField() {
        Object objValue = this._get(DTOFIELD_YFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isYFieldDirty() {
        return this._contains(DTOFIELD_YFIELD);
    }

    @JsonIgnore
    public void resetYField() {
        this._reset(DTOFIELD_YFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO yfield(String yField) {
        this.setYField(yField);
        return this;
    }

    @JsonProperty(value="ypsdechartaxesid")
    public void setYPSDEChartAxesId(String yPSDEChartAxesId) {
        this._set(DTOFIELD_YPSDECHARTAXESID, yPSDEChartAxesId);
    }

    @JsonIgnore
    public String getYPSDEChartAxesId() {
        Object objValue = this._get(DTOFIELD_YPSDECHARTAXESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isYPSDEChartAxesIdDirty() {
        return this._contains(DTOFIELD_YPSDECHARTAXESID);
    }

    @JsonIgnore
    public void resetYPSDEChartAxesId() {
        this._reset(DTOFIELD_YPSDECHARTAXESID);
    }

    @JsonIgnore
    public PSDEChartParamDTO ypsdechartaxesid(String yPSDEChartAxesId) {
        this.setYPSDEChartAxesId(yPSDEChartAxesId);
        return this;
    }

    @JsonIgnore
    public PSDEChartParamDTO ypsdechartaxesid(PSDEChartAxesDTO pSDEChartAxes) {
        if (pSDEChartAxes == null) {
            this.setYPSDEChartAxesId(null);
            this.setYPSDEChartAxesName(null);
        } else {
            this.setYPSDEChartAxesId(pSDEChartAxes.getPSDEChartAxesId());
            this.setYPSDEChartAxesName(pSDEChartAxes.getPSDEChartAxesName());
        }
        return this;
    }

    @JsonProperty(value="ypsdechartaxesname")
    public void setYPSDEChartAxesName(String yPSDEChartAxesName) {
        this._set(DTOFIELD_YPSDECHARTAXESNAME, yPSDEChartAxesName);
    }

    @JsonIgnore
    public String getYPSDEChartAxesName() {
        Object objValue = this._get(DTOFIELD_YPSDECHARTAXESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isYPSDEChartAxesNameDirty() {
        return this._contains(DTOFIELD_YPSDECHARTAXESNAME);
    }

    @JsonIgnore
    public void resetYPSDEChartAxesName() {
        this._reset(DTOFIELD_YPSDECHARTAXESNAME);
    }

    @JsonIgnore
    public PSDEChartParamDTO ypsdechartaxesname(String yPSDEChartAxesName) {
        this.setYPSDEChartAxesName(yPSDEChartAxesName);
        return this;
    }

    @JsonProperty(value="zfield")
    public void setZField(String zField) {
        this._set(DTOFIELD_ZFIELD, zField);
    }

    @JsonIgnore
    public String getZField() {
        Object objValue = this._get(DTOFIELD_ZFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isZFieldDirty() {
        return this._contains(DTOFIELD_ZFIELD);
    }

    @JsonIgnore
    public void resetZField() {
        this._reset(DTOFIELD_ZFIELD);
    }

    @JsonIgnore
    public PSDEChartParamDTO zfield(String zField) {
        this.setZField(zField);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEChartParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEChartParamId(strValue);
    }

    @JsonIgnore
    public PSDEChartParamDTO id(String strValue) {
        this.setPSDEChartParamId(strValue);
        return this;
    }
}
