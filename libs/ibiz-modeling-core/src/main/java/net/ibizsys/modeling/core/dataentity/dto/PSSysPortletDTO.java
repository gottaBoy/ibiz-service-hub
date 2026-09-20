package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEReportDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPortletCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysPortletDTO
extends PSModelDTOBase {
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_BASECLSPARAMS = "BASECLSPARAMS";
    protected static final String DTOFIELD_BASECLSPARAMS = "baseclsparams";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DASHBOARDSCOPE = "DASHBOARDSCOPE";
    protected static final String DTOFIELD_DASHBOARDSCOPE = "dashboardscope";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_FILTERPSDEDSID = "FILTERPSDEDSID";
    protected static final String DTOFIELD_FILTERPSDEDSID = "filterpsdedsid";
    public static final String FIELD_FILTERPSDEDSNAME = "FILTERPSDEDSNAME";
    protected static final String DTOFIELD_FILTERPSDEDSNAME = "filterpsdedsname";
    public static final String FIELD_GROUPEXTRACTMODE = "GROUPEXTRACTMODE";
    protected static final String DTOFIELD_GROUPEXTRACTMODE = "groupextractmode";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_HTMLSHOWMODE = "HTMLSHOWMODE";
    protected static final String DTOFIELD_HTMLSHOWMODE = "htmlshowmode";
    public static final String FIELD_HTMLURL = "HTMLURL";
    protected static final String DTOFIELD_HTMLURL = "htmlurl";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PORTLETPARAMS = "PORTLETPARAMS";
    protected static final String DTOFIELD_PORTLETPARAMS = "portletparams";
    public static final String FIELD_PORTLETSTYLE = "PORTLETSTYLE";
    protected static final String DTOFIELD_PORTLETSTYLE = "portletstyle";
    public static final String FIELD_PORTLETTYPE = "PORTLETTYPE";
    protected static final String DTOFIELD_PORTLETTYPE = "portlettype";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSDECHARTID = "PSDECHARTID";
    protected static final String DTOFIELD_PSDECHARTID = "psdechartid";
    public static final String FIELD_PSDECHARTNAME = "PSDECHARTNAME";
    protected static final String DTOFIELD_PSDECHARTNAME = "psdechartname";
    public static final String FIELD_PSDEDATAVIEWID = "PSDEDATAVIEWID";
    protected static final String DTOFIELD_PSDEDATAVIEWID = "psdedataviewid";
    public static final String FIELD_PSDEDATAVIEWNAME = "PSDEDATAVIEWNAME";
    protected static final String DTOFIELD_PSDEDATAVIEWNAME = "psdedataviewname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELISTID = "PSDELISTID";
    protected static final String DTOFIELD_PSDELISTID = "psdelistid";
    public static final String FIELD_PSDELISTNAME = "PSDELISTNAME";
    protected static final String DTOFIELD_PSDELISTNAME = "psdelistname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEREPORTID = "PSDEREPORTID";
    protected static final String DTOFIELD_PSDEREPORTID = "psdereportid";
    public static final String FIELD_PSDEREPORTNAME = "PSDEREPORTNAME";
    protected static final String DTOFIELD_PSDEREPORTNAME = "psdereportname";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEVIEWID = "PSDEVIEWID";
    protected static final String DTOFIELD_PSDEVIEWID = "psdeviewid";
    public static final String FIELD_PSDEVIEWNAME = "PSDEVIEWNAME";
    protected static final String DTOFIELD_PSDEVIEWNAME = "psdeviewname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSPORTLETID = "PSPORTLETID";
    protected static final String DTOFIELD_PSPORTLETID = "psportletid";
    public static final String FIELD_PSPORTLETNAME = "PSPORTLETNAME";
    protected static final String DTOFIELD_PSPORTLETNAME = "psportletname";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARNAME = "PSSYSCALENDARNAME";
    protected static final String DTOFIELD_PSSYSCALENDARNAME = "pssyscalendarname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMAPVIEWID = "PSSYSMAPVIEWID";
    protected static final String DTOFIELD_PSSYSMAPVIEWID = "pssysmapviewid";
    public static final String FIELD_PSSYSMAPVIEWNAME = "PSSYSMAPVIEWNAME";
    protected static final String DTOFIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSPORTLETCATID = "PSSYSPORTLETCATID";
    protected static final String DTOFIELD_PSSYSPORTLETCATID = "pssysportletcatid";
    public static final String FIELD_PSSYSPORTLETCATNAME = "PSSYSPORTLETCATNAME";
    protected static final String DTOFIELD_PSSYSPORTLETCATNAME = "pssysportletcatname";
    public static final String FIELD_PSSYSPORTLETID = "PSSYSPORTLETID";
    protected static final String DTOFIELD_PSSYSPORTLETID = "pssysportletid";
    public static final String FIELD_PSSYSPORTLETNAME = "PSSYSPORTLETNAME";
    protected static final String DTOFIELD_PSSYSPORTLETNAME = "pssysportletname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_RELOADTIMER = "RELOADTIMER";
    protected static final String DTOFIELD_RELOADTIMER = "reloadtimer";
    public static final String FIELD_SHOWTITLEBAR = "SHOWTITLEBAR";
    protected static final String DTOFIELD_SHOWTITLEBAR = "showtitlebar";
    public static final String FIELD_TEMPLENGINE = "TEMPLENGINE";
    protected static final String DTOFIELD_TEMPLENGINE = "templengine";
    public static final String FIELD_TITLEPSLANRESID = "TITLEPSLANRESID";
    protected static final String DTOFIELD_TITLEPSLANRESID = "titlepslanresid";
    public static final String FIELD_TITLEPSLANRESNAME = "TITLEPSLANRESNAME";
    protected static final String DTOFIELD_TITLEPSLANRESNAME = "titlepslanresname";
    public static final String FIELD_TITLEPSSYSPFPLUGINID = "TITLEPSSYSPFPLUGINID";
    protected static final String DTOFIELD_TITLEPSSYSPFPLUGINID = "titlepssyspfpluginid";
    public static final String FIELD_TITLEPSSYSPFPLUGINNAME = "TITLEPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_TITLEPSSYSPFPLUGINNAME = "titlepssyspfpluginname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";

    @JsonProperty(value="adpsdelogicid")
    public void setADPSDELogicId(String aDPSDELogicId) {
        this._set(DTOFIELD_ADPSDELOGICID, aDPSDELogicId);
    }

    @JsonIgnore
    public String getADPSDELogicId() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicIdDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public void resetADPSDELogicId() {
        this._reset(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public PSSysPortletDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        } else {
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicname")
    public void setADPSDELogicName(String aDPSDELogicName) {
        this._set(DTOFIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }

    @JsonIgnore
    public String getADPSDELogicName() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicNameDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetADPSDELogicName() {
        this._reset(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    @JsonProperty(value="baseclsparams")
    public void setBaseClsParams(String baseClsParams) {
        this._set(DTOFIELD_BASECLSPARAMS, baseClsParams);
    }

    @JsonIgnore
    public String getBaseClsParams() {
        Object objValue = this._get(DTOFIELD_BASECLSPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBaseClsParamsDirty() {
        return this._contains(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public void resetBaseClsParams() {
        this._reset(DTOFIELD_BASECLSPARAMS);
    }

    @JsonIgnore
    public PSSysPortletDTO baseclsparams(String baseClsParams) {
        this.setBaseClsParams(baseClsParams);
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
    public PSSysPortletDTO codename(String codeName) {
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
    public PSSysPortletDTO createdate(Timestamp createDate) {
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
    public PSSysPortletDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dashboardscope")
    public void setDashboardScope(Integer dashboardScope) {
        this._set(DTOFIELD_DASHBOARDSCOPE, dashboardScope);
    }

    @JsonIgnore
    public Integer getDashboardScope() {
        Object objValue = this._get(DTOFIELD_DASHBOARDSCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDashboardScopeDirty() {
        return this._contains(DTOFIELD_DASHBOARDSCOPE);
    }

    @JsonIgnore
    public void resetDashboardScope() {
        this._reset(DTOFIELD_DASHBOARDSCOPE);
    }

    @JsonIgnore
    public PSSysPortletDTO dashboardscope(Integer dashboardScope) {
        this.setDashboardScope(dashboardScope);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO dashboardscope(PSModelEnums.DashboardScope dashboardScope) {
        if (dashboardScope == null) {
            this.setDashboardScope(null);
        } else {
            this.setDashboardScope(dashboardScope.value);
        }
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSSysPortletDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSSysPortletDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="filterpsdedsid")
    public void setFilterPSDEDSId(String filterPSDEDSId) {
        this._set(DTOFIELD_FILTERPSDEDSID, filterPSDEDSId);
    }

    @JsonIgnore
    public String getFilterPSDEDSId() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public void resetFilterPSDEDSId() {
        this._reset(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public PSSysPortletDTO filterpsdedsid(String filterPSDEDSId) {
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO filterpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        } else {
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="filterpsdedsname")
    public void setFilterPSDEDSName(String filterPSDEDSName) {
        this._set(DTOFIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }

    @JsonIgnore
    public String getFilterPSDEDSName() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public void resetFilterPSDEDSName() {
        this._reset(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO filterpsdedsname(String filterPSDEDSName) {
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    @JsonProperty(value="groupextractmode")
    public void setGroupExtractMode(String groupExtractMode) {
        this._set(DTOFIELD_GROUPEXTRACTMODE, groupExtractMode);
    }

    @JsonIgnore
    public String getGroupExtractMode() {
        Object objValue = this._get(DTOFIELD_GROUPEXTRACTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupExtractModeDirty() {
        return this._contains(DTOFIELD_GROUPEXTRACTMODE);
    }

    @JsonIgnore
    public void resetGroupExtractMode() {
        this._reset(DTOFIELD_GROUPEXTRACTMODE);
    }

    @JsonIgnore
    public PSSysPortletDTO groupextractmode(String groupExtractMode) {
        this.setGroupExtractMode(groupExtractMode);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO groupextractmode(PSModelEnums.UGExtractMode groupExtractMode) {
        if (groupExtractMode == null) {
            this.setGroupExtractMode(null);
        } else {
            this.setGroupExtractMode(groupExtractMode.value);
        }
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(Integer height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public Integer getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSSysPortletDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="htmlshowmode")
    public void setHtmlShowMode(String htmlShowMode) {
        this._set(DTOFIELD_HTMLSHOWMODE, htmlShowMode);
    }

    @JsonIgnore
    public String getHtmlShowMode() {
        Object objValue = this._get(DTOFIELD_HTMLSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlShowModeDirty() {
        return this._contains(DTOFIELD_HTMLSHOWMODE);
    }

    @JsonIgnore
    public void resetHtmlShowMode() {
        this._reset(DTOFIELD_HTMLSHOWMODE);
    }

    @JsonIgnore
    public PSSysPortletDTO htmlshowmode(String htmlShowMode) {
        this.setHtmlShowMode(htmlShowMode);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO htmlshowmode(PSModelEnums.PortletHtmlShowMode htmlShowMode) {
        if (htmlShowMode == null) {
            this.setHtmlShowMode(null);
        } else {
            this.setHtmlShowMode(htmlShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="htmlurl")
    public void setHtmlUrl(String htmlUrl) {
        this._set(DTOFIELD_HTMLURL, htmlUrl);
    }

    @JsonIgnore
    public String getHtmlUrl() {
        Object objValue = this._get(DTOFIELD_HTMLURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlUrlDirty() {
        return this._contains(DTOFIELD_HTMLURL);
    }

    @JsonIgnore
    public void resetHtmlUrl() {
        this._reset(DTOFIELD_HTMLURL);
    }

    @JsonIgnore
    public PSSysPortletDTO htmlurl(String htmlUrl) {
        this.setHtmlUrl(htmlUrl);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSSysPortletDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="portletparams")
    public void setPortletParams(String portletParams) {
        this._set(DTOFIELD_PORTLETPARAMS, portletParams);
    }

    @JsonIgnore
    public String getPortletParams() {
        Object objValue = this._get(DTOFIELD_PORTLETPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletParamsDirty() {
        return this._contains(DTOFIELD_PORTLETPARAMS);
    }

    @JsonIgnore
    public void resetPortletParams() {
        this._reset(DTOFIELD_PORTLETPARAMS);
    }

    @JsonIgnore
    public PSSysPortletDTO portletparams(String portletParams) {
        this.setPortletParams(portletParams);
        return this;
    }

    @JsonProperty(value="portletstyle")
    public void setPortletStyle(String portletStyle) {
        this._set(DTOFIELD_PORTLETSTYLE, portletStyle);
    }

    @JsonIgnore
    public String getPortletStyle() {
        Object objValue = this._get(DTOFIELD_PORTLETSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletStyleDirty() {
        return this._contains(DTOFIELD_PORTLETSTYLE);
    }

    @JsonIgnore
    public void resetPortletStyle() {
        this._reset(DTOFIELD_PORTLETSTYLE);
    }

    @JsonIgnore
    public PSSysPortletDTO portletstyle(String portletStyle) {
        this.setPortletStyle(portletStyle);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO portletstyle(PSModelEnums.CtrlDetailStyle portletStyle) {
        if (portletStyle == null) {
            this.setPortletStyle(null);
        } else {
            this.setPortletStyle(portletStyle.value);
        }
        return this;
    }

    @JsonProperty(value="portlettype")
    public void setPortletType(String portletType) {
        this._set(DTOFIELD_PORTLETTYPE, portletType);
    }

    @JsonIgnore
    public String getPortletType() {
        Object objValue = this._get(DTOFIELD_PORTLETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletTypeDirty() {
        return this._contains(DTOFIELD_PORTLETTYPE);
    }

    @JsonIgnore
    public void resetPortletType() {
        this._reset(DTOFIELD_PORTLETTYPE);
    }

    @JsonIgnore
    public PSSysPortletDTO portlettype(String portletType) {
        this.setPortletType(portletType);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO portlettype(PSModelEnums.PortletType portletType) {
        if (portletType == null) {
            this.setPortletType(null);
        } else {
            this.setPortletType(portletType.value);
        }
        return this;
    }

    @JsonProperty(value="psachandlerid")
    public void setPSACHandlerId(String pSACHandlerId) {
        this._set(DTOFIELD_PSACHANDLERID, pSACHandlerId);
    }

    @JsonIgnore
    public String getPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSACHandlerId() {
        this._reset(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public PSSysPortletDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        } else {
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="psachandlername")
    public void setPSACHandlerName(String pSACHandlerName) {
        this._set(DTOFIELD_PSACHANDLERNAME, pSACHandlerName);
    }

    @JsonIgnore
    public String getPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSACHandlerName() {
        this._reset(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSSysPortletDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSSysPortletDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
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
    public PSSysPortletDTO psdechartid(String pSDEChartId) {
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdechartid(PSDEChartDTO pSDEChart) {
        if (pSDEChart == null) {
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
        } else {
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
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
    public PSSysPortletDTO psdechartname(String pSDEChartName) {
        this.setPSDEChartName(pSDEChartName);
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
    public PSSysPortletDTO psdedataviewid(String pSDEDataViewId) {
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdedataviewid(PSDEDataViewDTO pSDEDataView) {
        if (pSDEDataView == null) {
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        } else {
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
    public PSSysPortletDTO psdedataviewname(String pSDEDataViewName) {
        this.setPSDEDataViewName(pSDEDataViewName);
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
    public PSSysPortletDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysPortletDTO psdedsname(String pSDEDSName) {
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
    public PSSysPortletDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSSysPortletDTO psdelistid(String pSDEListId) {
        this.setPSDEListId(pSDEListId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdelistid(PSDEListDTO pSDEList) {
        if (pSDEList == null) {
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        } else {
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
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
    public PSSysPortletDTO psdelistname(String pSDEListName) {
        this.setPSDEListName(pSDEListName);
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
    public PSSysPortletDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdereportid")
    public void setPSDEReportId(String pSDEReportId) {
        this._set(DTOFIELD_PSDEREPORTID, pSDEReportId);
    }

    @JsonIgnore
    public String getPSDEReportId() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportIdDirty() {
        return this._contains(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public void resetPSDEReportId() {
        this._reset(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public PSSysPortletDTO psdereportid(String pSDEReportId) {
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdereportid(PSDEReportDTO pSDEReport) {
        if (pSDEReport == null) {
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        } else {
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    @JsonProperty(value="psdereportname")
    public void setPSDEReportName(String pSDEReportName) {
        this._set(DTOFIELD_PSDEREPORTNAME, pSDEReportName);
    }

    @JsonIgnore
    public String getPSDEReportName() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportNameDirty() {
        return this._contains(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public void resetPSDEReportName() {
        this._reset(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psdereportname(String pSDEReportName) {
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    @JsonProperty(value="psdetoolbarid")
    public void setPSDEToolbarId(String pSDEToolbarId) {
        this._set(DTOFIELD_PSDETOOLBARID, pSDEToolbarId);
    }

    @JsonIgnore
    public String getPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public void resetPSDEToolbarId() {
        this._reset(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public PSSysPortletDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        } else {
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="psdetoolbarname")
    public void setPSDEToolbarName(String pSDEToolbarName) {
        this._set(DTOFIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }

    @JsonIgnore
    public String getPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarName() {
        this._reset(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
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
    public PSSysPortletDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSSysPortletDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="psdeviewid")
    public void setPSDEViewId(String pSDEViewId) {
        this._set(DTOFIELD_PSDEVIEWID, pSDEViewId);
    }

    @JsonIgnore
    public String getPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWID);
    }

    @JsonIgnore
    public void resetPSDEViewId() {
        this._reset(DTOFIELD_PSDEVIEWID);
    }

    @JsonIgnore
    public PSSysPortletDTO psdeviewid(String pSDEViewId) {
        this.setPSDEViewId(pSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewId(null);
            this.setPSDEViewName(null);
        } else {
            this.setPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewname")
    public void setPSDEViewName(String pSDEViewName) {
        this._set(DTOFIELD_PSDEVIEWNAME, pSDEViewName);
    }

    @JsonIgnore
    public String getPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDEViewName() {
        this._reset(DTOFIELD_PSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psdeviewname(String pSDEViewName) {
        this.setPSDEViewName(pSDEViewName);
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
    public PSSysPortletDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysPortletDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="psportletid")
    public void setPSPortletId(String pSPortletId) {
        this._set(DTOFIELD_PSPORTLETID, pSPortletId);
    }

    @JsonIgnore
    public String getPSPortletId() {
        Object objValue = this._get(DTOFIELD_PSPORTLETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPortletIdDirty() {
        return this._contains(DTOFIELD_PSPORTLETID);
    }

    @JsonIgnore
    public void resetPSPortletId() {
        this._reset(DTOFIELD_PSPORTLETID);
    }

    @JsonIgnore
    public PSSysPortletDTO psportletid(String pSPortletId) {
        this.setPSPortletId(pSPortletId);
        return this;
    }

    @JsonProperty(value="psportletname")
    public void setPSPortletName(String pSPortletName) {
        this._set(DTOFIELD_PSPORTLETNAME, pSPortletName);
    }

    @JsonIgnore
    public String getPSPortletName() {
        Object objValue = this._get(DTOFIELD_PSPORTLETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPortletNameDirty() {
        return this._contains(DTOFIELD_PSPORTLETNAME);
    }

    @JsonIgnore
    public void resetPSPortletName() {
        this._reset(DTOFIELD_PSPORTLETNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO psportletname(String pSPortletName) {
        this.setPSPortletName(pSPortletName);
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssyscalendarid")
    public void setPSSysCalendarId(String pSSysCalendarId) {
        this._set(DTOFIELD_PSSYSCALENDARID, pSSysCalendarId);
    }

    @JsonIgnore
    public String getPSSysCalendarId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public void resetPSSysCalendarId() {
        this._reset(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar) {
        if (pSSysCalendar == null) {
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        } else {
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    @JsonProperty(value="pssyscalendarname")
    public void setPSSysCalendarName(String pSSysCalendarName) {
        this._set(DTOFIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }

    @JsonIgnore
    public String getPSSysCalendarName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarName() {
        this._reset(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssyscalendarname(String pSSysCalendarName) {
        this.setPSSysCalendarName(pSSysCalendarName);
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
    public PSSysPortletDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysPortletDTO pssyscssname(String pSSysCssName) {
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
    public PSSysPortletDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSSysPortletDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssysmapviewid")
    public void setPSSysMapViewId(String pSSysMapViewId) {
        this._set(DTOFIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }

    @JsonIgnore
    public String getPSSysMapViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public void resetPSSysMapViewId() {
        this._reset(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysmapviewid(String pSSysMapViewId) {
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysmapviewid(PSSysMapViewDTO pSSysMapView) {
        if (pSSysMapView == null) {
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        } else {
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    @JsonProperty(value="pssysmapviewname")
    public void setPSSysMapViewName(String pSSysMapViewName) {
        this._set(DTOFIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }

    @JsonIgnore
    public String getPSSysMapViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysMapViewName() {
        this._reset(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysmapviewname(String pSSysMapViewName) {
        this.setPSSysMapViewName(pSSysMapViewName);
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
    public PSSysPortletDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysPortletDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysportletcatid")
    public void setPSSysPortletCatId(String pSSysPortletCatId) {
        this._set(DTOFIELD_PSSYSPORTLETCATID, pSSysPortletCatId);
    }

    @JsonIgnore
    public String getPSSysPortletCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETCATID);
    }

    @JsonIgnore
    public void resetPSSysPortletCatId() {
        this._reset(DTOFIELD_PSSYSPORTLETCATID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysportletcatid(String pSSysPortletCatId) {
        this.setPSSysPortletCatId(pSSysPortletCatId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysportletcatid(PSSysPortletCatDTO pSSysPortletCat) {
        if (pSSysPortletCat == null) {
            this.setPSSysPortletCatId(null);
            this.setPSSysPortletCatName(null);
        } else {
            this.setPSSysPortletCatId(pSSysPortletCat.getPSSysPortletCatId());
            this.setPSSysPortletCatName(pSSysPortletCat.getPSSysPortletCatName());
        }
        return this;
    }

    @JsonProperty(value="pssysportletcatname")
    public void setPSSysPortletCatName(String pSSysPortletCatName) {
        this._set(DTOFIELD_PSSYSPORTLETCATNAME, pSSysPortletCatName);
    }

    @JsonIgnore
    public String getPSSysPortletCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETCATNAME);
    }

    @JsonIgnore
    public void resetPSSysPortletCatName() {
        this._reset(DTOFIELD_PSSYSPORTLETCATNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysportletcatname(String pSSysPortletCatName) {
        this.setPSSysPortletCatName(pSSysPortletCatName);
        return this;
    }

    @JsonProperty(value="pssysportletid")
    public void setPSSysPortletId(String pSSysPortletId) {
        this._set(DTOFIELD_PSSYSPORTLETID, pSSysPortletId);
    }

    @JsonIgnore
    public String getPSSysPortletId() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletIdDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETID);
    }

    @JsonIgnore
    public void resetPSSysPortletId() {
        this._reset(DTOFIELD_PSSYSPORTLETID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysportletid(String pSSysPortletId) {
        this.setPSSysPortletId(pSSysPortletId);
        return this;
    }

    @JsonProperty(value="pssysportletname")
    public void setPSSysPortletName(String pSSysPortletName) {
        this._set(DTOFIELD_PSSYSPORTLETNAME, pSSysPortletName);
    }

    @JsonIgnore
    public String getPSSysPortletName() {
        Object objValue = this._get(DTOFIELD_PSSYSPORTLETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPortletNameDirty() {
        return this._contains(DTOFIELD_PSSYSPORTLETNAME);
    }

    @JsonIgnore
    public void resetPSSysPortletName() {
        this._reset(DTOFIELD_PSSYSPORTLETNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysportletname(String pSSysPortletName) {
        this.setPSSysPortletName(pSSysPortletName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysPortletName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysPortletName(strName);
    }

    @JsonIgnore
    public PSSysPortletDTO name(String strName) {
        this.setPSSysPortletName(strName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="reloadtimer")
    public void setReloadTimer(Integer reloadTimer) {
        this._set(DTOFIELD_RELOADTIMER, reloadTimer);
    }

    @JsonIgnore
    public Integer getReloadTimer() {
        Object objValue = this._get(DTOFIELD_RELOADTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReloadTimerDirty() {
        return this._contains(DTOFIELD_RELOADTIMER);
    }

    @JsonIgnore
    public void resetReloadTimer() {
        this._reset(DTOFIELD_RELOADTIMER);
    }

    @JsonIgnore
    public PSSysPortletDTO reloadtimer(Integer reloadTimer) {
        this.setReloadTimer(reloadTimer);
        return this;
    }

    @JsonProperty(value="showtitlebar")
    public void setShowTitleBar(Integer showTitleBar) {
        this._set(DTOFIELD_SHOWTITLEBAR, showTitleBar);
    }

    @JsonIgnore
    public Integer getShowTitleBar() {
        Object objValue = this._get(DTOFIELD_SHOWTITLEBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowTitleBarDirty() {
        return this._contains(DTOFIELD_SHOWTITLEBAR);
    }

    @JsonIgnore
    public void resetShowTitleBar() {
        this._reset(DTOFIELD_SHOWTITLEBAR);
    }

    @JsonIgnore
    public PSSysPortletDTO showtitlebar(Integer showTitleBar) {
        this.setShowTitleBar(showTitleBar);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO showtitlebar(Boolean showTitleBar) {
        if (showTitleBar == null) {
            this.setShowTitleBar(null);
        } else {
            this.setShowTitleBar(showTitleBar != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="templengine")
    public void setTemplEngine(String templEngine) {
        this._set(DTOFIELD_TEMPLENGINE, templEngine);
    }

    @JsonIgnore
    public String getTemplEngine() {
        Object objValue = this._get(DTOFIELD_TEMPLENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplEngineDirty() {
        return this._contains(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public void resetTemplEngine() {
        this._reset(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public PSSysPortletDTO templengine(String templEngine) {
        this.setTemplEngine(templEngine);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO templengine(PSModelEnums.PSTemplEngine templEngine) {
        if (templEngine == null) {
            this.setTemplEngine(null);
        } else {
            this.setTemplEngine(templEngine.value);
        }
        return this;
    }

    @JsonProperty(value="titlepslanresid")
    public void setTitlePSLanResId(String titlePSLanResId) {
        this._set(DTOFIELD_TITLEPSLANRESID, titlePSLanResId);
    }

    @JsonIgnore
    public String getTitlePSLanResId() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResIdDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public void resetTitlePSLanResId() {
        this._reset(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public PSSysPortletDTO titlepslanresid(String titlePSLanResId) {
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO titlepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        } else {
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="titlepslanresname")
    public void setTitlePSLanResName(String titlePSLanResName) {
        this._set(DTOFIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }

    @JsonIgnore
    public String getTitlePSLanResName() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResNameDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTitlePSLanResName() {
        this._reset(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO titlepslanresname(String titlePSLanResName) {
        this.setTitlePSLanResName(titlePSLanResName);
        return this;
    }

    @JsonProperty(value="titlepssyspfpluginid")
    public void setTitlePSSysPFPluginId(String titlePSSysPFPluginId) {
        this._set(DTOFIELD_TITLEPSSYSPFPLUGINID, titlePSSysPFPluginId);
    }

    @JsonIgnore
    public String getTitlePSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_TITLEPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_TITLEPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetTitlePSSysPFPluginId() {
        this._reset(DTOFIELD_TITLEPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysPortletDTO titlepssyspfpluginid(String titlePSSysPFPluginId) {
        this.setTitlePSSysPFPluginId(titlePSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysPortletDTO titlepssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setTitlePSSysPFPluginId(null);
            this.setTitlePSSysPFPluginName(null);
        } else {
            this.setTitlePSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setTitlePSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="titlepssyspfpluginname")
    public void setTitlePSSysPFPluginName(String titlePSSysPFPluginName) {
        this._set(DTOFIELD_TITLEPSSYSPFPLUGINNAME, titlePSSysPFPluginName);
    }

    @JsonIgnore
    public String getTitlePSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_TITLEPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_TITLEPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetTitlePSSysPFPluginName() {
        this._reset(DTOFIELD_TITLEPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysPortletDTO titlepssyspfpluginname(String titlePSSysPFPluginName) {
        this.setTitlePSSysPFPluginName(titlePSSysPFPluginName);
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
    public PSSysPortletDTO updatedate(Timestamp updateDate) {
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
    public PSSysPortletDTO updateman(String updateMan) {
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
    public PSSysPortletDTO usertag(String userTag) {
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
    public PSSysPortletDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysPortletId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysPortletId(strValue);
    }

    @JsonIgnore
    public PSSysPortletDTO id(String strValue) {
        this.setPSSysPortletId(strValue);
        return this;
    }
}
