package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDRItemDTO
extends PSModelDTOBase {
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COUNTERID = "COUNTERID";
    protected static final String DTOFIELD_COUNTERID = "counterid";
    public static final String FIELD_COUNTERMODE = "COUNTERMODE";
    protected static final String DTOFIELD_COUNTERMODE = "countermode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DRITEMTYPE = "DRITEMTYPE";
    protected static final String DTOFIELD_DRITEMTYPE = "dritemtype";
    public static final String FIELD_ENABLEMODE = "ENABLEMODE";
    protected static final String DTOFIELD_ENABLEMODE = "enablemode";
    public static final String FIELD_HEADERPSSYSPFPLUGINID = "HEADERPSSYSPFPLUGINID";
    protected static final String DTOFIELD_HEADERPSSYSPFPLUGINID = "headerpssyspfpluginid";
    public static final String FIELD_HEADERPSSYSPFPLUGINNAME = "HEADERPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_HEADERPSSYSPFPLUGINNAME = "headerpssyspfpluginname";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDEID = "MINORPSDEID";
    protected static final String DTOFIELD_MINORPSDEID = "minorpsdeid";
    public static final String FIELD_NAVVIEWFILTER = "NAVVIEWFILTER";
    protected static final String DTOFIELD_NAVVIEWFILTER = "navviewfilter";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PDTVIEWFLAG = "PDTVIEWFLAG";
    protected static final String DTOFIELD_PDTVIEWFLAG = "pdtviewflag";
    public static final String FIELD_PSDEDRGROUPID = "PSDEDRGROUPID";
    protected static final String DTOFIELD_PSDEDRGROUPID = "psdedrgroupid";
    public static final String FIELD_PSDEDRGROUPNAME = "PSDEDRGROUPNAME";
    protected static final String DTOFIELD_PSDEDRGROUPNAME = "psdedrgroupname";
    public static final String FIELD_PSDEDRITEMID = "PSDEDRITEMID";
    protected static final String DTOFIELD_PSDEDRITEMID = "psdedritemid";
    public static final String FIELD_PSDEDRITEMNAME = "PSDEDRITEMNAME";
    protected static final String DTOFIELD_PSDEDRITEMNAME = "psdedritemname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSPDTVIEWID = "PSSYSPDTVIEWID";
    protected static final String DTOFIELD_PSSYSPDTVIEWID = "pssyspdtviewid";
    public static final String FIELD_PSSYSPDTVIEWNAME = "PSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";
    public static final String FIELD_TESTCUSTOMCODE = "TESTCUSTOMCODE";
    protected static final String DTOFIELD_TESTCUSTOMCODE = "testcustomcode";
    public static final String FIELD_TESTPSDEACTIONID = "TESTPSDEACTIONID";
    protected static final String DTOFIELD_TESTPSDEACTIONID = "testpsdeactionid";
    public static final String FIELD_TESTPSDEACTIONNAME = "TESTPSDEACTIONNAME";
    protected static final String DTOFIELD_TESTPSDEACTIONNAME = "testpsdeactionname";
    public static final String FIELD_TESTPSDELOGICID = "TESTPSDELOGICID";
    protected static final String DTOFIELD_TESTPSDELOGICID = "testpsdelogicid";
    public static final String FIELD_TESTPSDELOGICNAME = "TESTPSDELOGICNAME";
    protected static final String DTOFIELD_TESTPSDELOGICNAME = "testpsdelogicname";
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
    public static final String FIELD_VIEWCODENAME = "VIEWCODENAME";
    protected static final String DTOFIELD_VIEWCODENAME = "viewcodename";
    public static final String FIELD_VIEWPARAMS = "VIEWPARAMS";
    protected static final String DTOFIELD_VIEWPARAMS = "viewparams";

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
    public PSDEDRItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEDRItemDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
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
    public PSDEDRItemDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="counterid")
    public void setCounterId(String counterId) {
        this._set(DTOFIELD_COUNTERID, counterId);
    }

    @JsonIgnore
    public String getCounterId() {
        Object objValue = this._get(DTOFIELD_COUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCounterIdDirty() {
        return this._contains(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public void resetCounterId() {
        this._reset(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public PSDEDRItemDTO counterid(String counterId) {
        this.setCounterId(counterId);
        return this;
    }

    @JsonProperty(value="countermode")
    public void setCounterMode(Integer counterMode) {
        this._set(DTOFIELD_COUNTERMODE, counterMode);
    }

    @JsonIgnore
    public Integer getCounterMode() {
        Object objValue = this._get(DTOFIELD_COUNTERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCounterModeDirty() {
        return this._contains(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public void resetCounterMode() {
        this._reset(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public PSDEDRItemDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
        if (counterMode == null) {
            this.setCounterMode(null);
        } else {
            this.setCounterMode(counterMode.value);
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
    public PSDEDRItemDTO createdate(Timestamp createDate) {
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
    public PSDEDRItemDTO createman(String createMan) {
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
    public PSDEDRItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="dritemtype")
    public void setDRItemType(String dRItemType) {
        this._set(DTOFIELD_DRITEMTYPE, dRItemType);
    }

    @JsonIgnore
    public String getDRItemType() {
        Object objValue = this._get(DTOFIELD_DRITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDRItemTypeDirty() {
        return this._contains(DTOFIELD_DRITEMTYPE);
    }

    @JsonIgnore
    public void resetDRItemType() {
        this._reset(DTOFIELD_DRITEMTYPE);
    }

    @JsonIgnore
    public PSDEDRItemDTO dritemtype(String dRItemType) {
        this.setDRItemType(dRItemType);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO dritemtype(PSModelEnums.DEDRItemType dRItemType) {
        if (dRItemType == null) {
            this.setDRItemType(null);
        } else {
            this.setDRItemType(dRItemType.value);
        }
        return this;
    }

    @JsonProperty(value="enablemode")
    public void setEnableMode(String enableMode) {
        this._set(DTOFIELD_ENABLEMODE, enableMode);
    }

    @JsonIgnore
    public String getEnableMode() {
        Object objValue = this._get(DTOFIELD_ENABLEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEnableModeDirty() {
        return this._contains(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public void resetEnableMode() {
        this._reset(DTOFIELD_ENABLEMODE);
    }

    @JsonIgnore
    public PSDEDRItemDTO enablemode(String enableMode) {
        this.setEnableMode(enableMode);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO enablemode(PSModelEnums.DEDRDetailEnableMode enableMode) {
        if (enableMode == null) {
            this.setEnableMode(null);
        } else {
            this.setEnableMode(enableMode.value);
        }
        return this;
    }

    @JsonProperty(value="headerpssyspfpluginid")
    public void setHeaderPSSysPFPluginId(String headerPSSysPFPluginId) {
        this._set(DTOFIELD_HEADERPSSYSPFPLUGINID, headerPSSysPFPluginId);
    }

    @JsonIgnore
    public String getHeaderPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetHeaderPSSysPFPluginId() {
        this._reset(DTOFIELD_HEADERPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEDRItemDTO headerpssyspfpluginid(String headerPSSysPFPluginId) {
        this.setHeaderPSSysPFPluginId(headerPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO headerpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setHeaderPSSysPFPluginId(null);
            this.setHeaderPSSysPFPluginName(null);
        } else {
            this.setHeaderPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setHeaderPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="headerpssyspfpluginname")
    public void setHeaderPSSysPFPluginName(String headerPSSysPFPluginName) {
        this._set(DTOFIELD_HEADERPSSYSPFPLUGINNAME, headerPSSysPFPluginName);
    }

    @JsonIgnore
    public String getHeaderPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_HEADERPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeaderPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_HEADERPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetHeaderPSSysPFPluginName() {
        this._reset(DTOFIELD_HEADERPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO headerpssyspfpluginname(String headerPSSysPFPluginName) {
        this.setHeaderPSSysPFPluginName(headerPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="itemtag")
    public void setItemTag(String itemTag) {
        this._set(DTOFIELD_ITEMTAG, itemTag);
    }

    @JsonIgnore
    public String getItemTag() {
        Object objValue = this._get(DTOFIELD_ITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTagDirty() {
        return this._contains(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public void resetItemTag() {
        this._reset(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public PSDEDRItemDTO itemtag(String itemTag) {
        this.setItemTag(itemTag);
        return this;
    }

    @JsonProperty(value="itemtag2")
    public void setItemTag2(String itemTag2) {
        this._set(DTOFIELD_ITEMTAG2, itemTag2);
    }

    @JsonIgnore
    public String getItemTag2() {
        Object objValue = this._get(DTOFIELD_ITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag2Dirty() {
        return this._contains(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public void resetItemTag2() {
        this._reset(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public PSDEDRItemDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
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
    public PSDEDRItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsdeid")
    public void setMinorPSDEId(String minorPSDEId) {
        this._set(DTOFIELD_MINORPSDEID, minorPSDEId);
    }

    @JsonIgnore
    public String getMinorPSDEId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEID);
    }

    @JsonIgnore
    public void resetMinorPSDEId() {
        this._reset(DTOFIELD_MINORPSDEID);
    }

    @JsonIgnore
    public PSDEDRItemDTO minorpsdeid(String minorPSDEId) {
        this.setMinorPSDEId(minorPSDEId);
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
    public PSDEDRItemDTO navviewfilter(String navViewFilter) {
        this.setNavViewFilter(navViewFilter);
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
    public PSDEDRItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pdtviewflag")
    public void setPDTViewFlag(Integer pDTViewFlag) {
        this._set(DTOFIELD_PDTVIEWFLAG, pDTViewFlag);
    }

    @JsonIgnore
    public Integer getPDTViewFlag() {
        Object objValue = this._get(DTOFIELD_PDTVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPDTViewFlagDirty() {
        return this._contains(DTOFIELD_PDTVIEWFLAG);
    }

    @JsonIgnore
    public void resetPDTViewFlag() {
        this._reset(DTOFIELD_PDTVIEWFLAG);
    }

    @JsonIgnore
    public PSDEDRItemDTO pdtviewflag(Integer pDTViewFlag) {
        this.setPDTViewFlag(pDTViewFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO pdtviewflag(Boolean pDTViewFlag) {
        if (pDTViewFlag == null) {
            this.setPDTViewFlag(null);
        } else {
            this.setPDTViewFlag(pDTViewFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="psdedrgroupid")
    public void setPSDEDRGroupId(String pSDEDRGroupId) {
        this._set(DTOFIELD_PSDEDRGROUPID, pSDEDRGroupId);
    }

    @JsonIgnore
    public String getPSDEDRGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEDRGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEDRGROUPID);
    }

    @JsonIgnore
    public void resetPSDEDRGroupId() {
        this._reset(DTOFIELD_PSDEDRGROUPID);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdedrgroupid(String pSDEDRGroupId) {
        this.setPSDEDRGroupId(pSDEDRGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO psdedrgroupid(PSDEDRGroupDTO pSDEDRGroup) {
        if (pSDEDRGroup == null) {
            this.setPSDEDRGroupId(null);
            this.setPSDEDRGroupName(null);
        } else {
            this.setPSDEDRGroupId(pSDEDRGroup.getPSDEDRGroupId());
            this.setPSDEDRGroupName(pSDEDRGroup.getPSDEDRGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdedrgroupname")
    public void setPSDEDRGroupName(String pSDEDRGroupName) {
        this._set(DTOFIELD_PSDEDRGROUPNAME, pSDEDRGroupName);
    }

    @JsonIgnore
    public String getPSDEDRGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEDRGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEDRGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEDRGroupName() {
        this._reset(DTOFIELD_PSDEDRGROUPNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdedrgroupname(String pSDEDRGroupName) {
        this.setPSDEDRGroupName(pSDEDRGroupName);
        return this;
    }

    @JsonProperty(value="psdedritemid")
    public void setPSDEDRItemId(String pSDEDRItemId) {
        this._set(DTOFIELD_PSDEDRITEMID, pSDEDRItemId);
    }

    @JsonIgnore
    public String getPSDEDRItemId() {
        Object objValue = this._get(DTOFIELD_PSDEDRITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRItemIdDirty() {
        return this._contains(DTOFIELD_PSDEDRITEMID);
    }

    @JsonIgnore
    public void resetPSDEDRItemId() {
        this._reset(DTOFIELD_PSDEDRITEMID);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdedritemid(String pSDEDRItemId) {
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    @JsonProperty(value="psdedritemname")
    public void setPSDEDRItemName(String pSDEDRItemName) {
        this._set(DTOFIELD_PSDEDRITEMNAME, pSDEDRItemName);
    }

    @JsonIgnore
    public String getPSDEDRItemName() {
        Object objValue = this._get(DTOFIELD_PSDEDRITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRItemNameDirty() {
        return this._contains(DTOFIELD_PSDEDRITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEDRItemName() {
        this._reset(DTOFIELD_PSDEDRITEMNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdedritemname(String pSDEDRItemName) {
        this.setPSDEDRItemName(pSDEDRItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDRItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDRItemName(strName);
    }

    @JsonIgnore
    public PSDEDRItemDTO name(String strName) {
        this.setPSDEDRItemName(strName);
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
    public PSDEDRItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDRItemDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSDEDRItemDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO psderid(PSDERDTO pSDER) {
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
    public PSDEDRItemDTO psdername(String pSDERName) {
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
    public PSDEDRItemDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setViewCodeName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setViewCodeName(pSDEViewBase.getCodeName());
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
    public PSDEDRItemDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
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
    public PSDEDRItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEDRItemDTO pssyscssname(String pSSysCssName) {
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
    public PSDEDRItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEDRItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssyspdtviewid")
    public void setPSSysPDTViewId(String pSSysPDTViewId) {
        this._set(DTOFIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }

    @JsonIgnore
    public String getPSSysPDTViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public void resetPSSysPDTViewId() {
        this._reset(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public PSDEDRItemDTO pssyspdtviewid(String pSSysPDTViewId) {
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO pssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
        if (pSSysPDTView == null) {
            this.setPSSysPDTViewId(null);
            this.setPSSysPDTViewName(null);
        } else {
            this.setPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    @JsonProperty(value="pssyspdtviewname")
    public void setPSSysPDTViewName(String pSSysPDTViewName) {
        this._set(DTOFIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }

    @JsonIgnore
    public String getPSSysPDTViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysPDTViewName() {
        this._reset(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO pssyspdtviewname(String pSSysPDTViewName) {
        this.setPSSysPDTViewName(pSSysPDTViewName);
        return this;
    }

    @JsonProperty(value="testcustomcode")
    public void setTestCustomCode(String testCustomCode) {
        this._set(DTOFIELD_TESTCUSTOMCODE, testCustomCode);
    }

    @JsonIgnore
    public String getTestCustomCode() {
        Object objValue = this._get(DTOFIELD_TESTCUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestCustomCodeDirty() {
        return this._contains(DTOFIELD_TESTCUSTOMCODE);
    }

    @JsonIgnore
    public void resetTestCustomCode() {
        this._reset(DTOFIELD_TESTCUSTOMCODE);
    }

    @JsonIgnore
    public PSDEDRItemDTO testcustomcode(String testCustomCode) {
        this.setTestCustomCode(testCustomCode);
        return this;
    }

    @JsonProperty(value="testpsdeactionid")
    public void setTestPSDEActionId(String testPSDEActionId) {
        this._set(DTOFIELD_TESTPSDEACTIONID, testPSDEActionId);
    }

    @JsonIgnore
    public String getTestPSDEActionId() {
        Object objValue = this._get(DTOFIELD_TESTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDEActionIdDirty() {
        return this._contains(DTOFIELD_TESTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetTestPSDEActionId() {
        this._reset(DTOFIELD_TESTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdeactionid(String testPSDEActionId) {
        this.setTestPSDEActionId(testPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setTestPSDEActionId(null);
            this.setTestPSDEActionName(null);
        } else {
            this.setTestPSDEActionId(pSDEAction.getPSDEActionId());
            this.setTestPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="testpsdeactionname")
    public void setTestPSDEActionName(String testPSDEActionName) {
        this._set(DTOFIELD_TESTPSDEACTIONNAME, testPSDEActionName);
    }

    @JsonIgnore
    public String getTestPSDEActionName() {
        Object objValue = this._get(DTOFIELD_TESTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDEActionNameDirty() {
        return this._contains(DTOFIELD_TESTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetTestPSDEActionName() {
        this._reset(DTOFIELD_TESTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdeactionname(String testPSDEActionName) {
        this.setTestPSDEActionName(testPSDEActionName);
        return this;
    }

    @JsonProperty(value="testpsdelogicid")
    public void setTestPSDELogicId(String testPSDELogicId) {
        this._set(DTOFIELD_TESTPSDELOGICID, testPSDELogicId);
    }

    @JsonIgnore
    public String getTestPSDELogicId() {
        Object objValue = this._get(DTOFIELD_TESTPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDELogicIdDirty() {
        return this._contains(DTOFIELD_TESTPSDELOGICID);
    }

    @JsonIgnore
    public void resetTestPSDELogicId() {
        this._reset(DTOFIELD_TESTPSDELOGICID);
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdelogicid(String testPSDELogicId) {
        this.setTestPSDELogicId(testPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setTestPSDELogicId(null);
            this.setTestPSDELogicName(null);
        } else {
            this.setTestPSDELogicId(pSDELogic.getPSDELogicId());
            this.setTestPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="testpsdelogicname")
    public void setTestPSDELogicName(String testPSDELogicName) {
        this._set(DTOFIELD_TESTPSDELOGICNAME, testPSDELogicName);
    }

    @JsonIgnore
    public String getTestPSDELogicName() {
        Object objValue = this._get(DTOFIELD_TESTPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestPSDELogicNameDirty() {
        return this._contains(DTOFIELD_TESTPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetTestPSDELogicName() {
        this._reset(DTOFIELD_TESTPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO testpsdelogicname(String testPSDELogicName) {
        this.setTestPSDELogicName(testPSDELogicName);
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
    public PSDEDRItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEDRItemDTO tippslanresname(String tipPSLanResName) {
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
    public PSDEDRItemDTO tooltipinfo(String tooltipInfo) {
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
    public PSDEDRItemDTO updatedate(Timestamp updateDate) {
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
    public PSDEDRItemDTO updateman(String updateMan) {
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
    public PSDEDRItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDRItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDRItemDTO usertag(String userTag) {
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
    public PSDEDRItemDTO usertag2(String userTag2) {
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
    public PSDEDRItemDTO usertag3(String userTag3) {
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
    public PSDEDRItemDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewcodename")
    public void setViewCodeName(String viewCodeName) {
        this._set(DTOFIELD_VIEWCODENAME, viewCodeName);
    }

    @JsonIgnore
    public String getViewCodeName() {
        Object objValue = this._get(DTOFIELD_VIEWCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewCodeNameDirty() {
        return this._contains(DTOFIELD_VIEWCODENAME);
    }

    @JsonIgnore
    public void resetViewCodeName() {
        this._reset(DTOFIELD_VIEWCODENAME);
    }

    @JsonIgnore
    public PSDEDRItemDTO viewcodename(String viewCodeName) {
        this.setViewCodeName(viewCodeName);
        return this;
    }

    @JsonProperty(value="viewparams")
    public void setViewParams(String viewParams) {
        this._set(DTOFIELD_VIEWPARAMS, viewParams);
    }

    @JsonIgnore
    public String getViewParams() {
        Object objValue = this._get(DTOFIELD_VIEWPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParamsDirty() {
        return this._contains(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public void resetViewParams() {
        this._reset(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public PSDEDRItemDTO viewparams(String viewParams) {
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDRItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDRItemId(strValue);
    }

    @JsonIgnore
    public PSDEDRItemDTO id(String strValue) {
        this.setPSDEDRItemId(strValue);
        return this;
    }
}
