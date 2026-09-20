package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDRDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
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
    public static final String FIELD_DETAILTAG = "DETAILTAG";
    protected static final String DTOFIELD_DETAILTAG = "detailtag";
    public static final String FIELD_DETAILTAG2 = "DETAILTAG2";
    protected static final String DTOFIELD_DETAILTAG2 = "detailtag2";
    public static final String FIELD_DETAILTYPE = "DETAILTYPE";
    protected static final String DTOFIELD_DETAILTYPE = "detailtype";
    public static final String FIELD_ENABLEMODE = "ENABLEMODE";
    protected static final String DTOFIELD_ENABLEMODE = "enablemode";
    public static final String FIELD_GROUPORDERVALUE = "GROUPORDERVALUE";
    protected static final String DTOFIELD_GROUPORDERVALUE = "groupordervalue";
    public static final String FIELD_HEADERPSSYSPFPLUGINID = "HEADERPSSYSPFPLUGINID";
    protected static final String DTOFIELD_HEADERPSSYSPFPLUGINID = "headerpssyspfpluginid";
    public static final String FIELD_HEADERPSSYSPFPLUGINNAME = "HEADERPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_HEADERPSSYSPFPLUGINNAME = "headerpssyspfpluginname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEDRDETAILID = "PSDEDRDETAILID";
    protected static final String DTOFIELD_PSDEDRDETAILID = "psdedrdetailid";
    public static final String FIELD_PSDEDRDETAILNAME = "PSDEDRDETAILNAME";
    protected static final String DTOFIELD_PSDEDRDETAILNAME = "psdedrdetailname";
    public static final String FIELD_PSDEDRGROUPID = "PSDEDRGROUPID";
    protected static final String DTOFIELD_PSDEDRGROUPID = "psdedrgroupid";
    public static final String FIELD_PSDEDRGROUPNAME = "PSDEDRGROUPNAME";
    protected static final String DTOFIELD_PSDEDRGROUPNAME = "psdedrgroupname";
    public static final String FIELD_PSDEDRID = "PSDEDRID";
    protected static final String DTOFIELD_PSDEDRID = "psdedrid";
    public static final String FIELD_PSDEDRITEMID = "PSDEDRITEMID";
    protected static final String DTOFIELD_PSDEDRITEMID = "psdedritemid";
    public static final String FIELD_PSDEDRITEMNAME = "PSDEDRITEMNAME";
    protected static final String DTOFIELD_PSDEDRITEMNAME = "psdedritemname";
    public static final String FIELD_PSDEDRNAME = "PSDEDRNAME";
    protected static final String DTOFIELD_PSDEDRNAME = "psdedrname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSDEDRDetailDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEDRDetailDTO cappslanresname(String capPSLanResName) {
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
    public PSDEDRDetailDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEDRDetailDTO counterid(String counterId) {
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
    public PSDEDRDetailDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
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
    public PSDEDRDetailDTO createdate(Timestamp createDate) {
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
    public PSDEDRDetailDTO createman(String createMan) {
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
    public PSDEDRDetailDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="detailtag")
    public void setDetailTag(String detailTag) {
        this._set(DTOFIELD_DETAILTAG, detailTag);
    }

    @JsonIgnore
    public String getDetailTag() {
        Object objValue = this._get(DTOFIELD_DETAILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTagDirty() {
        return this._contains(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public void resetDetailTag() {
        this._reset(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public PSDEDRDetailDTO detailtag(String detailTag) {
        this.setDetailTag(detailTag);
        return this;
    }

    @JsonProperty(value="detailtag2")
    public void setDetailTag2(String detailTag2) {
        this._set(DTOFIELD_DETAILTAG2, detailTag2);
    }

    @JsonIgnore
    public String getDetailTag2() {
        Object objValue = this._get(DTOFIELD_DETAILTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTag2Dirty() {
        return this._contains(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public void resetDetailTag2() {
        this._reset(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public PSDEDRDetailDTO detailtag2(String detailTag2) {
        this.setDetailTag2(detailTag2);
        return this;
    }

    @JsonProperty(value="detailtype")
    public void setDetailType(String detailType) {
        this._set(DTOFIELD_DETAILTYPE, detailType);
    }

    @JsonIgnore
    public String getDetailType() {
        Object objValue = this._get(DTOFIELD_DETAILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTypeDirty() {
        return this._contains(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public void resetDetailType() {
        this._reset(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public PSDEDRDetailDTO detailtype(String detailType) {
        this.setDetailType(detailType);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO detailtype(PSModelEnums.DEDRDetailType detailType) {
        if (detailType == null) {
            this.setDetailType(null);
        } else {
            this.setDetailType(detailType.value);
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
    public PSDEDRDetailDTO enablemode(String enableMode) {
        this.setEnableMode(enableMode);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO enablemode(PSModelEnums.DEDRDetailEnableMode enableMode) {
        if (enableMode == null) {
            this.setEnableMode(null);
        } else {
            this.setEnableMode(enableMode.value);
        }
        return this;
    }

    @JsonProperty(value="groupordervalue")
    public void setGroupOrderValue(Integer groupOrderValue) {
        this._set(DTOFIELD_GROUPORDERVALUE, groupOrderValue);
    }

    @JsonIgnore
    public Integer getGroupOrderValue() {
        Object objValue = this._get(DTOFIELD_GROUPORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupOrderValueDirty() {
        return this._contains(DTOFIELD_GROUPORDERVALUE);
    }

    @JsonIgnore
    public void resetGroupOrderValue() {
        this._reset(DTOFIELD_GROUPORDERVALUE);
    }

    @JsonIgnore
    public PSDEDRDetailDTO groupordervalue(Integer groupOrderValue) {
        this.setGroupOrderValue(groupOrderValue);
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
    public PSDEDRDetailDTO headerpssyspfpluginid(String headerPSSysPFPluginId) {
        this.setHeaderPSSysPFPluginId(headerPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO headerpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEDRDetailDTO headerpssyspfpluginname(String headerPSSysPFPluginName) {
        this.setHeaderPSSysPFPluginName(headerPSSysPFPluginName);
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
    public PSDEDRDetailDTO memo(String memo) {
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
    public PSDEDRDetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdedrdetailid")
    public void setPSDEDRDetailId(String pSDEDRDetailId) {
        this._set(DTOFIELD_PSDEDRDETAILID, pSDEDRDetailId);
    }

    @JsonIgnore
    public String getPSDEDRDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEDRDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEDRDETAILID);
    }

    @JsonIgnore
    public void resetPSDEDRDetailId() {
        this._reset(DTOFIELD_PSDEDRDETAILID);
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrdetailid(String pSDEDRDetailId) {
        this.setPSDEDRDetailId(pSDEDRDetailId);
        return this;
    }

    @JsonProperty(value="psdedrdetailname")
    public void setPSDEDRDetailName(String pSDEDRDetailName) {
        this._set(DTOFIELD_PSDEDRDETAILNAME, pSDEDRDetailName);
    }

    @JsonIgnore
    public String getPSDEDRDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEDRDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEDRDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEDRDetailName() {
        this._reset(DTOFIELD_PSDEDRDETAILNAME);
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrdetailname(String pSDEDRDetailName) {
        this.setPSDEDRDetailName(pSDEDRDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDRDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDRDetailName(strName);
    }

    @JsonIgnore
    public PSDEDRDetailDTO name(String strName) {
        this.setPSDEDRDetailName(strName);
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
    public PSDEDRDetailDTO psdedrgroupid(String pSDEDRGroupId) {
        this.setPSDEDRGroupId(pSDEDRGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrgroupid(PSDEDRGroupDTO pSDEDRGroup) {
        if (pSDEDRGroup == null) {
            this.setGroupOrderValue(null);
            this.setPSDEDRGroupId(null);
            this.setPSDEDRGroupName(null);
        } else {
            this.setGroupOrderValue(pSDEDRGroup.getOrderValue());
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
    public PSDEDRDetailDTO psdedrgroupname(String pSDEDRGroupName) {
        this.setPSDEDRGroupName(pSDEDRGroupName);
        return this;
    }

    @JsonProperty(value="psdedrid")
    public void setPSDEDRId(String pSDEDRId) {
        this._set(DTOFIELD_PSDEDRID, pSDEDRId);
    }

    @JsonIgnore
    public String getPSDEDRId() {
        Object objValue = this._get(DTOFIELD_PSDEDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRIdDirty() {
        return this._contains(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public void resetPSDEDRId() {
        this._reset(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrid(String pSDEDRId) {
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrid(PSDEDataRelationDTO pSDEDataRelation) {
        if (pSDEDataRelation == null) {
            this.setPSDEDRId(null);
            this.setPSDEDRName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEDRId(pSDEDataRelation.getPSDEDataRelationId());
            this.setPSDEDRName(pSDEDataRelation.getPSDEDataRelationName());
            this.setPSDEId(pSDEDataRelation.getPSDEId());
        }
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
    public PSDEDRDetailDTO psdedritemid(String pSDEDRItemId) {
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedritemid(PSDEDRItemDTO pSDEDRItem) {
        if (pSDEDRItem == null) {
            this.setPSDEDRItemId(null);
            this.setPSDEDRItemName(null);
        } else {
            this.setPSDEDRItemId(pSDEDRItem.getPSDEDRItemId());
            this.setPSDEDRItemName(pSDEDRItem.getPSDEDRItemName());
        }
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
    public PSDEDRDetailDTO psdedritemname(String pSDEDRItemName) {
        this.setPSDEDRItemName(pSDEDRItemName);
        return this;
    }

    @JsonProperty(value="psdedrname")
    public void setPSDEDRName(String pSDEDRName) {
        this._set(DTOFIELD_PSDEDRNAME, pSDEDRName);
    }

    @JsonIgnore
    public String getPSDEDRName() {
        Object objValue = this._get(DTOFIELD_PSDEDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRNameDirty() {
        return this._contains(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public void resetPSDEDRName() {
        this._reset(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdedrname(String pSDEDRName) {
        this.setPSDEDRName(pSDEDRName);
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
    public PSDEDRDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEDRDetailDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
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
    public PSDEDRDetailDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSDEDRDetailDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
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
    public PSDEDRDetailDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
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
    public PSDEDRDetailDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEDRDetailDTO pssyscssname(String pSSysCssName) {
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
    public PSDEDRDetailDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEDRDetailDTO pssysimagename(String pSSysImageName) {
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
    public PSDEDRDetailDTO pssyspdtviewid(String pSSysPDTViewId) {
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO pssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
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
    public PSDEDRDetailDTO pssyspdtviewname(String pSSysPDTViewName) {
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
    public PSDEDRDetailDTO testcustomcode(String testCustomCode) {
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
    public PSDEDRDetailDTO testpsdeactionid(String testPSDEActionId) {
        this.setTestPSDEActionId(testPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO testpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDEDRDetailDTO testpsdeactionname(String testPSDEActionName) {
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
    public PSDEDRDetailDTO testpsdelogicid(String testPSDELogicId) {
        this.setTestPSDELogicId(testPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO testpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEDRDetailDTO testpsdelogicname(String testPSDELogicName) {
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
    public PSDEDRDetailDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEDRDetailDTO tippslanresname(String tipPSLanResName) {
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
    public PSDEDRDetailDTO tooltipinfo(String tooltipInfo) {
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
    public PSDEDRDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEDRDetailDTO updateman(String updateMan) {
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
    public PSDEDRDetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDRDetailDTO usertag(String userTag) {
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
    public PSDEDRDetailDTO usertag2(String userTag2) {
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
    public PSDEDRDetailDTO usertag3(String userTag3) {
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
    public PSDEDRDetailDTO usertag4(String userTag4) {
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
    public PSDEDRDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDRDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDRDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDRDetailId(strValue);
    }

    @JsonIgnore
    public PSDEDRDetailDTO id(String strValue) {
        this.setPSDEDRDetailId(strValue);
        return this;
    }
}
