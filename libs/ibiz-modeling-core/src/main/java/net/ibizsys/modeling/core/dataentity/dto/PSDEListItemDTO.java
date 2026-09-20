package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEListItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ALIGN = "ALIGN";
    protected static final String DTOFIELD_ALIGN = "align";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CLCONVERTMODE = "CLCONVERTMODE";
    protected static final String DTOFIELD_CLCONVERTMODE = "clconvertmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATAITEMS = "DATAITEMS";
    protected static final String DTOFIELD_DATAITEMS = "dataitems";
    public static final String FIELD_DATAVIEWPSDEID = "DATAVIEWPSDEID";
    protected static final String DTOFIELD_DATAVIEWPSDEID = "dataviewpsdeid";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_GROUPITEM = "GROUPITEM";
    protected static final String DTOFIELD_GROUPITEM = "groupitem";
    public static final String FIELD_ITEMTYPE = "ITEMTYPE";
    protected static final String DTOFIELD_ITEMTYPE = "itemtype";
    public static final String FIELD_LCRPSSYSPFPLUGINID = "LCRPSSYSPFPLUGINID";
    protected static final String DTOFIELD_LCRPSSYSPFPLUGINID = "lcrpssyspfpluginid";
    public static final String FIELD_LCRPSSYSPFPLUGINNAME = "LCRPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_LCRPSSYSPFPLUGINNAME = "lcrpssyspfpluginname";
    public static final String FIELD_LISTPSDEID = "LISTPSDEID";
    protected static final String DTOFIELD_LISTPSDEID = "listpsdeid";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NOSORT = "NOSORT";
    protected static final String DTOFIELD_NOSORT = "nosort";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEDATAVIEWID = "PSDEDATAVIEWID";
    protected static final String DTOFIELD_PSDEDATAVIEWID = "psdedataviewid";
    public static final String FIELD_PSDEDATAVIEWNAME = "PSDEDATAVIEWNAME";
    protected static final String DTOFIELD_PSDEDATAVIEWNAME = "psdedataviewname";
    public static final String FIELD_PSDELISTID = "PSDELISTID";
    protected static final String DTOFIELD_PSDELISTID = "psdelistid";
    public static final String FIELD_PSDELISTITEMID = "PSDELISTITEMID";
    protected static final String DTOFIELD_PSDELISTITEMID = "psdelistitemid";
    public static final String FIELD_PSDELISTITEMNAME = "PSDELISTITEMNAME";
    protected static final String DTOFIELD_PSDELISTITEMNAME = "psdelistitemname";
    public static final String FIELD_PSDELISTNAME = "PSDELISTNAME";
    protected static final String DTOFIELD_PSDELISTNAME = "psdelistname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_RENDERMODE = "RENDERMODE";
    protected static final String DTOFIELD_RENDERMODE = "rendermode";
    public static final String FIELD_RENDERMODETEXT = "RENDERMODETEXT";
    protected static final String DTOFIELD_RENDERMODETEXT = "rendermodetext";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
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
    public PSDEListItemDTO align(String align) {
        this.setAlign(align);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO align(PSModelEnums.GridColAlign align) {
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
    public PSDEListItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEListItemDTO cappslanresname(String capPSLanResName) {
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
    public PSDEListItemDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="clconvertmode")
    public void setCLConvertMode(String cLConvertMode) {
        this._set(DTOFIELD_CLCONVERTMODE, cLConvertMode);
    }

    @JsonIgnore
    public String getCLConvertMode() {
        Object objValue = this._get(DTOFIELD_CLCONVERTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLConvertModeDirty() {
        return this._contains(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public void resetCLConvertMode() {
        this._reset(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public PSDEListItemDTO clconvertmode(String cLConvertMode) {
        this.setCLConvertMode(cLConvertMode);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO clconvertmode(PSModelEnums.CodeListConvertMode cLConvertMode) {
        if (cLConvertMode == null) {
            this.setCLConvertMode(null);
        } else {
            this.setCLConvertMode(cLConvertMode.value);
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
    public PSDEListItemDTO createdate(Timestamp createDate) {
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
    public PSDEListItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDEListItemDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDEListItemDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dataitems")
    public void setDataItems(String dataItems) {
        this._set(DTOFIELD_DATAITEMS, dataItems);
    }

    @JsonIgnore
    public String getDataItems() {
        Object objValue = this._get(DTOFIELD_DATAITEMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataItemsDirty() {
        return this._contains(DTOFIELD_DATAITEMS);
    }

    @JsonIgnore
    public void resetDataItems() {
        this._reset(DTOFIELD_DATAITEMS);
    }

    @JsonIgnore
    public PSDEListItemDTO dataitems(String dataItems) {
        this.setDataItems(dataItems);
        return this;
    }

    @JsonProperty(value="dataviewpsdeid")
    public void setDataViewPSDEId(String dataViewPSDEId) {
        this._set(DTOFIELD_DATAVIEWPSDEID, dataViewPSDEId);
    }

    @JsonIgnore
    public String getDataViewPSDEId() {
        Object objValue = this._get(DTOFIELD_DATAVIEWPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataViewPSDEIdDirty() {
        return this._contains(DTOFIELD_DATAVIEWPSDEID);
    }

    @JsonIgnore
    public void resetDataViewPSDEId() {
        this._reset(DTOFIELD_DATAVIEWPSDEID);
    }

    @JsonIgnore
    public PSDEListItemDTO dataviewpsdeid(String dataViewPSDEId) {
        this.setDataViewPSDEId(dataViewPSDEId);
        return this;
    }

    @JsonProperty(value="enableitempriv")
    public void setEnableItemPriv(Integer enableItemPriv) {
        this._set(DTOFIELD_ENABLEITEMPRIV, enableItemPriv);
    }

    @JsonIgnore
    public Integer getEnableItemPriv() {
        Object objValue = this._get(DTOFIELD_ENABLEITEMPRIV);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableItemPrivDirty() {
        return this._contains(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public void resetEnableItemPriv() {
        this._reset(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public PSDEListItemDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="groupitem")
    public void setGroupItem(String groupItem) {
        this._set(DTOFIELD_GROUPITEM, groupItem);
    }

    @JsonIgnore
    public String getGroupItem() {
        Object objValue = this._get(DTOFIELD_GROUPITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupItemDirty() {
        return this._contains(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public void resetGroupItem() {
        this._reset(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public PSDEListItemDTO groupitem(String groupItem) {
        this.setGroupItem(groupItem);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO groupitem(PSModelEnums.GridColGroupMode groupItem) {
        if (groupItem == null) {
            this.setGroupItem(null);
        } else {
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    @JsonProperty(value="itemtype")
    public void setItemType(String itemType) {
        this._set(DTOFIELD_ITEMTYPE, itemType);
    }

    @JsonIgnore
    public String getItemType() {
        Object objValue = this._get(DTOFIELD_ITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTypeDirty() {
        return this._contains(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public void resetItemType() {
        this._reset(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public PSDEListItemDTO itemtype(String itemType) {
        this.setItemType(itemType);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO itemtype(PSModelEnums.ListItemType itemType) {
        if (itemType == null) {
            this.setItemType(null);
        } else {
            this.setItemType(itemType.value);
        }
        return this;
    }

    @JsonProperty(value="lcrpssyspfpluginid")
    public void setLCRPSSysPFPluginId(String lCRPSSysPFPluginId) {
        this._set(DTOFIELD_LCRPSSYSPFPLUGINID, lCRPSSysPFPluginId);
    }

    @JsonIgnore
    public String getLCRPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_LCRPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLCRPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_LCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetLCRPSSysPFPluginId() {
        this._reset(DTOFIELD_LCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginid(String lCRPSSysPFPluginId) {
        this.setLCRPSSysPFPluginId(lCRPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setLCRPSSysPFPluginId(null);
            this.setLCRPSSysPFPluginName(null);
        } else {
            this.setLCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setLCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="lcrpssyspfpluginname")
    public void setLCRPSSysPFPluginName(String lCRPSSysPFPluginName) {
        this._set(DTOFIELD_LCRPSSYSPFPLUGINNAME, lCRPSSysPFPluginName);
    }

    @JsonIgnore
    public String getLCRPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_LCRPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLCRPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_LCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetLCRPSSysPFPluginName() {
        this._reset(DTOFIELD_LCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginname(String lCRPSSysPFPluginName) {
        this.setLCRPSSysPFPluginName(lCRPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="listpsdeid")
    public void setListPSDEId(String listPSDEId) {
        this._set(DTOFIELD_LISTPSDEID, listPSDEId);
    }

    @JsonIgnore
    public String getListPSDEId() {
        Object objValue = this._get(DTOFIELD_LISTPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isListPSDEIdDirty() {
        return this._contains(DTOFIELD_LISTPSDEID);
    }

    @JsonIgnore
    public void resetListPSDEId() {
        this._reset(DTOFIELD_LISTPSDEID);
    }

    @JsonIgnore
    public PSDEListItemDTO listpsdeid(String listPSDEId) {
        this.setListPSDEId(listPSDEId);
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
    public PSDEListItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="nosort")
    public void setNoSort(Integer noSort) {
        this._set(DTOFIELD_NOSORT, noSort);
    }

    @JsonIgnore
    public Integer getNoSort() {
        Object objValue = this._get(DTOFIELD_NOSORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoSortDirty() {
        return this._contains(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public void resetNoSort() {
        this._reset(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public PSDEListItemDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO nosort(Boolean noSort) {
        if (noSort == null) {
            this.setNoSort(null);
        } else {
            this.setNoSort(noSort != false ? 1 : 0);
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
    public PSDEListItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSDEListItemDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonProperty(value="predefinedtypetext")
    public void setPredefinedTypeText(String predefinedTypeText) {
        this._set(DTOFIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }

    @JsonIgnore
    public String getPredefinedTypeText() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeTextDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public void resetPredefinedTypeText() {
        this._reset(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public PSDEListItemDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDEListItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEListItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdedataviewid")
    public void setPSDEDataViewId(String pSDEDataViewId) {
        this._set(DTOFIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }

    @JsonIgnore
    public String getPSDEDataViewId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public void resetPSDEDataViewId() {
        this._reset(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public PSDEListItemDTO psdedataviewid(String pSDEDataViewId) {
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO psdedataviewid(PSDEDataViewDTO pSDEDataView) {
        if (pSDEDataView == null) {
            this.setDataViewPSDEId(null);
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        } else {
            this.setDataViewPSDEId(pSDEDataView.getPSDEId());
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    @JsonProperty(value="psdedataviewname")
    public void setPSDEDataViewName(String pSDEDataViewName) {
        this._set(DTOFIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }

    @JsonIgnore
    public String getPSDEDataViewName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDEDataViewName() {
        this._reset(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public PSDEListItemDTO psdedataviewname(String pSDEDataViewName) {
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    @JsonProperty(value="psdelistid")
    public void setPSDEListId(String pSDEListId) {
        this._set(DTOFIELD_PSDELISTID, pSDEListId);
    }

    @JsonIgnore
    public String getPSDEListId() {
        Object objValue = this._get(DTOFIELD_PSDELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListIdDirty() {
        return this._contains(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public void resetPSDEListId() {
        this._reset(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public PSDEListItemDTO psdelistid(String pSDEListId) {
        this.setPSDEListId(pSDEListId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO psdelistid(PSDEListDTO pSDEList) {
        if (pSDEList == null) {
            this.setListPSDEId(null);
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        } else {
            this.setListPSDEId(pSDEList.getPSDEId());
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    @JsonProperty(value="psdelistitemid")
    public void setPSDEListItemId(String pSDEListItemId) {
        this._set(DTOFIELD_PSDELISTITEMID, pSDEListItemId);
    }

    @JsonIgnore
    public String getPSDEListItemId() {
        Object objValue = this._get(DTOFIELD_PSDELISTITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListItemIdDirty() {
        return this._contains(DTOFIELD_PSDELISTITEMID);
    }

    @JsonIgnore
    public void resetPSDEListItemId() {
        this._reset(DTOFIELD_PSDELISTITEMID);
    }

    @JsonIgnore
    public PSDEListItemDTO psdelistitemid(String pSDEListItemId) {
        this.setPSDEListItemId(pSDEListItemId);
        return this;
    }

    @JsonProperty(value="psdelistitemname")
    public void setPSDEListItemName(String pSDEListItemName) {
        this._set(DTOFIELD_PSDELISTITEMNAME, pSDEListItemName);
    }

    @JsonIgnore
    public String getPSDEListItemName() {
        Object objValue = this._get(DTOFIELD_PSDELISTITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListItemNameDirty() {
        return this._contains(DTOFIELD_PSDELISTITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEListItemName() {
        this._reset(DTOFIELD_PSDELISTITEMNAME);
    }

    @JsonIgnore
    public PSDEListItemDTO psdelistitemname(String pSDEListItemName) {
        this.setPSDEListItemName(pSDEListItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEListItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEListItemName(strName);
    }

    @JsonIgnore
    public PSDEListItemDTO name(String strName) {
        this.setPSDEListItemName(strName);
        return this;
    }

    @JsonProperty(value="psdelistname")
    public void setPSDEListName(String pSDEListName) {
        this._set(DTOFIELD_PSDELISTNAME, pSDEListName);
    }

    @JsonIgnore
    public String getPSDEListName() {
        Object objValue = this._get(DTOFIELD_PSDELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListNameDirty() {
        return this._contains(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public void resetPSDEListName() {
        this._reset(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public PSDEListItemDTO psdelistname(String pSDEListName) {
        this.setPSDEListName(pSDEListName);
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
    public PSDEListItemDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEListItemDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="rendermode")
    public void setRenderMode(String renderMode) {
        this._set(DTOFIELD_RENDERMODE, renderMode);
    }

    @JsonIgnore
    public String getRenderMode() {
        Object objValue = this._get(DTOFIELD_RENDERMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeDirty() {
        return this._contains(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public void resetRenderMode() {
        this._reset(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public PSDEListItemDTO rendermode(String renderMode) {
        this.setRenderMode(renderMode);
        return this;
    }

    @JsonProperty(value="rendermodetext")
    public void setRenderModeText(String renderModeText) {
        this._set(DTOFIELD_RENDERMODETEXT, renderModeText);
    }

    @JsonIgnore
    public String getRenderModeText() {
        Object objValue = this._get(DTOFIELD_RENDERMODETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeTextDirty() {
        return this._contains(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public void resetRenderModeText() {
        this._reset(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public PSDEListItemDTO rendermodetext(String renderModeText) {
        this.setRenderModeText(renderModeText);
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
    public PSDEListItemDTO updatedate(Timestamp updateDate) {
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
    public PSDEListItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSDEListItemDTO usertag(String userTag) {
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
    public PSDEListItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
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
    public PSDEListItemDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
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
    public PSDEListItemDTO width(Integer width) {
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
    public PSDEListItemDTO widthunit(String widthUnit) {
        this.setWidthUnit(widthUnit);
        return this;
    }

    @JsonIgnore
    public PSDEListItemDTO widthunit(PSModelEnums.GridColWidthUnitType widthUnit) {
        if (widthUnit == null) {
            this.setWidthUnit(null);
        } else {
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEListItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEListItemId(strValue);
    }

    @JsonIgnore
    public PSDEListItemDTO id(String strValue) {
        this.setPSDEListItemId(strValue);
        return this;
    }
}
