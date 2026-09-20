package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeColDTO
extends PSModelDTOBase {
    public static final String FIELD_ALIGN = "ALIGN";
    protected static final String DTOFIELD_ALIGN = "align";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CELLPSSYSCSSID = "CELLPSSYSCSSID";
    protected static final String DTOFIELD_CELLPSSYSCSSID = "cellpssyscssid";
    public static final String FIELD_CELLPSSYSCSSNAME = "CELLPSSYSCSSNAME";
    protected static final String DTOFIELD_CELLPSSYSCSSNAME = "cellpssyscssname";
    public static final String FIELD_COLENABLEFILTER = "COLENABLEFILTER";
    protected static final String DTOFIELD_COLENABLEFILTER = "colenablefilter";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_GCRPSSYSPFPLUGINID = "GCRPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";
    public static final String FIELD_GCRPSSYSPFPLUGINNAME = "GCRPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";
    public static final String FIELD_GRIDCOLSTYLE = "GRIDCOLSTYLE";
    protected static final String DTOFIELD_GRIDCOLSTYLE = "gridcolstyle";
    public static final String FIELD_GRIDCOLTYPE = "GRIDCOLTYPE";
    protected static final String DTOFIELD_GRIDCOLTYPE = "gridcoltype";
    public static final String FIELD_HEADERPSSYSCSSID = "HEADERPSSYSCSSID";
    protected static final String DTOFIELD_HEADERPSSYSCSSID = "headerpssyscssid";
    public static final String FIELD_HEADERPSSYSCSSNAME = "HEADERPSSYSCSSNAME";
    protected static final String DTOFIELD_HEADERPSSYSCSSNAME = "headerpssyscssname";
    public static final String FIELD_HIDEDEFAULT = "HIDEDEFAULT";
    protected static final String DTOFIELD_HIDEDEFAULT = "hidedefault";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDETREECOLID = "PSDETREECOLID";
    protected static final String DTOFIELD_PSDETREECOLID = "psdetreecolid";
    public static final String FIELD_PSDETREECOLNAME = "PSDETREECOLNAME";
    protected static final String DTOFIELD_PSDETREECOLNAME = "psdetreecolname";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
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
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_WIDTHUNIT = "WIDTHUNIT";
    protected static final String DTOFIELD_WIDTHUNIT = "widthunit";

    @JsonProperty(value="align")
    public void setAlign(String align) {
        this._set(DTOFIELD_ALIGN, align);
    }

    @JsonIgnore
    public String getAlign() {
        Object objValue = this._get(DTOFIELD_ALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAlignDirty() {
        return this._contains(DTOFIELD_ALIGN);
    }

    @JsonIgnore
    public void resetAlign() {
        this._reset(DTOFIELD_ALIGN);
    }

    @JsonIgnore
    public PSDETreeColDTO align(String align) {
        this.setAlign(align);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO align(PSModelEnums.GridColAlign align) {
        if (align == null) {
            this.setAlign(null);
        } else {
            this.setAlign(align.value);
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
    public PSDETreeColDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDETreeColDTO cappslanresname(String capPSLanResName) {
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
    public PSDETreeColDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="cellpssyscssid")
    public void setCellPSSysCssId(String cellPSSysCssId) {
        this._set(DTOFIELD_CELLPSSYSCSSID, cellPSSysCssId);
    }

    @JsonIgnore
    public String getCellPSSysCssId() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssIdDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public void resetCellPSSysCssId() {
        this._reset(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public PSDETreeColDTO cellpssyscssid(String cellPSSysCssId) {
        this.setCellPSSysCssId(cellPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO cellpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setCellPSSysCssId(null);
            this.setCellPSSysCssName(null);
        } else {
            this.setCellPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCellPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="cellpssyscssname")
    public void setCellPSSysCssName(String cellPSSysCssName) {
        this._set(DTOFIELD_CELLPSSYSCSSNAME, cellPSSysCssName);
    }

    @JsonIgnore
    public String getCellPSSysCssName() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssNameDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetCellPSSysCssName() {
        this._reset(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO cellpssyscssname(String cellPSSysCssName) {
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    @JsonProperty(value="colenablefilter")
    public void setColEnableFilter(Integer colEnableFilter) {
        this._set(DTOFIELD_COLENABLEFILTER, colEnableFilter);
    }

    @JsonIgnore
    public Integer getColEnableFilter() {
        Object objValue = this._get(DTOFIELD_COLENABLEFILTER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColEnableFilterDirty() {
        return this._contains(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public void resetColEnableFilter() {
        this._reset(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public PSDETreeColDTO colenablefilter(Integer colEnableFilter) {
        this.setColEnableFilter(colEnableFilter);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO colenablefilter(PSModelEnums.DEGridColLinkMode colEnableFilter) {
        if (colEnableFilter == null) {
            this.setColEnableFilter(null);
        } else {
            this.setColEnableFilter(colEnableFilter.value);
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
    public PSDETreeColDTO createdate(Timestamp createDate) {
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
    public PSDETreeColDTO createman(String createMan) {
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
    public PSDETreeColDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDETreeColDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO enablelink(PSModelEnums.DEGridColLinkMode enableLink) {
        if (enableLink == null) {
            this.setEnableLink(null);
        } else {
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginid")
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginId() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDETreeColDTO gcrpssyspfpluginid(String gCRPSSysPFPluginId) {
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO gcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        } else {
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginname")
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginName() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO gcrpssyspfpluginname(String gCRPSSysPFPluginName) {
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="gridcolstyle")
    public void setGridColStyle(String gridColStyle) {
        this._set(DTOFIELD_GRIDCOLSTYLE, gridColStyle);
    }

    @JsonIgnore
    public String getGridColStyle() {
        Object objValue = this._get(DTOFIELD_GRIDCOLSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColStyleDirty() {
        return this._contains(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public void resetGridColStyle() {
        this._reset(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public PSDETreeColDTO gridcolstyle(String gridColStyle) {
        this.setGridColStyle(gridColStyle);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO gridcolstyle(PSModelEnums.GridColStype gridColStyle) {
        if (gridColStyle == null) {
            this.setGridColStyle(null);
        } else {
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    @JsonProperty(value="gridcoltype")
    public void setGridColType(String gridColType) {
        this._set(DTOFIELD_GRIDCOLTYPE, gridColType);
    }

    @JsonIgnore
    public String getGridColType() {
        Object objValue = this._get(DTOFIELD_GRIDCOLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColTypeDirty() {
        return this._contains(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public void resetGridColType() {
        this._reset(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public PSDETreeColDTO gridcoltype(String gridColType) {
        this.setGridColType(gridColType);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO gridcoltype(PSModelEnums.TreeColType gridColType) {
        if (gridColType == null) {
            this.setGridColType(null);
        } else {
            this.setGridColType(gridColType.value);
        }
        return this;
    }

    @JsonProperty(value="headerpssyscssid")
    public void setHeaderPSSysCssId(String headerPSSysCssId) {
        this._set(DTOFIELD_HEADERPSSYSCSSID, headerPSSysCssId);
    }

    @JsonIgnore
    public String getHeaderPSSysCssId() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysCssIdDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSCSSID);
    }

    @JsonIgnore
    public void resetHeaderPSSysCssId() {
        this._reset(DTOFIELD_HEADERPSSYSCSSID);
    }

    @JsonIgnore
    public PSDETreeColDTO headerpssyscssid(String headerPSSysCssId) {
        this.setHeaderPSSysCssId(headerPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO headerpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setHeaderPSSysCssId(null);
            this.setHeaderPSSysCssName(null);
        } else {
            this.setHeaderPSSysCssId(pSSysCss.getPSSysCssId());
            this.setHeaderPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="headerpssyscssname")
    public void setHeaderPSSysCssName(String headerPSSysCssName) {
        this._set(DTOFIELD_HEADERPSSYSCSSNAME, headerPSSysCssName);
    }

    @JsonIgnore
    public String getHeaderPSSysCssName() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysCssNameDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetHeaderPSSysCssName() {
        this._reset(DTOFIELD_HEADERPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO headerpssyscssname(String headerPSSysCssName) {
        this.setHeaderPSSysCssName(headerPSSysCssName);
        return this;
    }

    @JsonProperty(value="hidedefault")
    public void setHideDefault(Integer hideDefault) {
        this._set(DTOFIELD_HIDEDEFAULT, hideDefault);
    }

    @JsonIgnore
    public Integer getHideDefault() {
        Object objValue = this._get(DTOFIELD_HIDEDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHideDefaultDirty() {
        return this._contains(DTOFIELD_HIDEDEFAULT);
    }

    @JsonIgnore
    public void resetHideDefault() {
        this._reset(DTOFIELD_HIDEDEFAULT);
    }

    @JsonIgnore
    public PSDETreeColDTO hidedefault(Integer hideDefault) {
        this.setHideDefault(hideDefault);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO hidedefault(PSModelEnums.DEGridColHideMode hideDefault) {
        if (hideDefault == null) {
            this.setHideDefault(null);
        } else {
            this.setHideDefault(hideDefault.value);
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
    public PSDETreeColDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="noprivdm")
    public void setNoPrivDM(Integer noPrivDM) {
        this._set(DTOFIELD_NOPRIVDM, noPrivDM);
    }

    @JsonIgnore
    public Integer getNoPrivDM() {
        Object objValue = this._get(DTOFIELD_NOPRIVDM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoPrivDMDirty() {
        return this._contains(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public void resetNoPrivDM() {
        this._reset(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public PSDETreeColDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO noprivdm(PSModelEnums.NoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
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
    public PSDETreeColDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDETreeColDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDETreeColDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdetreecolid")
    public void setPSDETreeColId(String pSDETreeColId) {
        this._set(DTOFIELD_PSDETREECOLID, pSDETreeColId);
    }

    @JsonIgnore
    public String getPSDETreeColId() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColIdDirty() {
        return this._contains(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public void resetPSDETreeColId() {
        this._reset(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public PSDETreeColDTO psdetreecolid(String pSDETreeColId) {
        this.setPSDETreeColId(pSDETreeColId);
        return this;
    }

    @JsonProperty(value="psdetreecolname")
    public void setPSDETreeColName(String pSDETreeColName) {
        this._set(DTOFIELD_PSDETREECOLNAME, pSDETreeColName);
    }

    @JsonIgnore
    public String getPSDETreeColName() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColNameDirty() {
        return this._contains(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public void resetPSDETreeColName() {
        this._reset(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO psdetreecolname(String pSDETreeColName) {
        this.setPSDETreeColName(pSDETreeColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeColName(strName);
    }

    @JsonIgnore
    public PSDETreeColDTO name(String strName) {
        this.setPSDETreeColName(strName);
        return this;
    }

    @JsonProperty(value="psdetreeviewid")
    public void setPSDETreeViewId(String pSDETreeViewId) {
        this._set(DTOFIELD_PSDETREEVIEWID, pSDETreeViewId);
    }

    @JsonIgnore
    public String getPSDETreeViewId() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewIdDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public void resetPSDETreeViewId() {
        this._reset(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public PSDETreeColDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
        if (pSDETreeView == null) {
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        } else {
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    @JsonProperty(value="psdetreeviewname")
    public void setPSDETreeViewName(String pSDETreeViewName) {
        this._set(DTOFIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }

    @JsonIgnore
    public String getPSDETreeViewName() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewNameDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDETreeViewName() {
        this._reset(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSDETreeColDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSDETreeColDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDETreeColDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDETreeColDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDETreeColDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDETreeColDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeColDTO updateman(String updateMan) {
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
    public PSDETreeColDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeColDTO usertag(String userTag) {
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
    public PSDETreeColDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Integer width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Integer getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSDETreeColDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonProperty(value="widthunit")
    public void setWidthUnit(String widthUnit) {
        this._set(DTOFIELD_WIDTHUNIT, widthUnit);
    }

    @JsonIgnore
    public String getWidthUnit() {
        Object objValue = this._get(DTOFIELD_WIDTHUNIT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWidthUnitDirty() {
        return this._contains(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public void resetWidthUnit() {
        this._reset(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public PSDETreeColDTO widthunit(String widthUnit) {
        this.setWidthUnit(widthUnit);
        return this;
    }

    @JsonIgnore
    public PSDETreeColDTO widthunit(PSModelEnums.GridColWidthUnitType widthUnit) {
        if (widthUnit == null) {
            this.setWidthUnit(null);
        } else {
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeColId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeColId(strValue);
    }

    @JsonIgnore
    public PSDETreeColDTO id(String strValue) {
        this.setPSDETreeColId(strValue);
        return this;
    }
}
