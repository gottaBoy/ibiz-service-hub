package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEReportDTO
extends PSModelDTOBase {
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_ENABLEAUDIT = "ENABLEAUDIT";
    protected static final String DTOFIELD_ENABLEAUDIT = "enableaudit";
    public static final String FIELD_ENABLELOG = "ENABLELOG";
    protected static final String DTOFIELD_ENABLELOG = "enablelog";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_LAYOUTPANELMODE = "LAYOUTPANELMODE";
    protected static final String DTOFIELD_LAYOUTPANELMODE = "layoutpanelmode";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MULTIPAGE = "MULTIPAGE";
    protected static final String DTOFIELD_MULTIPAGE = "multipage";
    public static final String FIELD_POTIME = "POTIME";
    protected static final String DTOFIELD_POTIME = "potime";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSID2 = "PSDEDSID2";
    protected static final String DTOFIELD_PSDEDSID2 = "psdedsid2";
    public static final String FIELD_PSDEDSID3 = "PSDEDSID3";
    protected static final String DTOFIELD_PSDEDSID3 = "psdedsid3";
    public static final String FIELD_PSDEDSID4 = "PSDEDSID4";
    protected static final String DTOFIELD_PSDEDSID4 = "psdedsid4";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEDSNAME2 = "PSDEDSNAME2";
    protected static final String DTOFIELD_PSDEDSNAME2 = "psdedsname2";
    public static final String FIELD_PSDEDSNAME3 = "PSDEDSNAME3";
    protected static final String DTOFIELD_PSDEDSNAME3 = "psdedsname3";
    public static final String FIELD_PSDEDSNAME4 = "PSDEDSNAME4";
    protected static final String DTOFIELD_PSDEDSNAME4 = "psdedsname4";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEREPORTID = "PSDEREPORTID";
    protected static final String DTOFIELD_PSDEREPORTID = "psdereportid";
    public static final String FIELD_PSDEREPORTNAME = "PSDEREPORTNAME";
    protected static final String DTOFIELD_PSDEREPORTNAME = "psdereportname";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBIREPORTID = "PSSYSBIREPORTID";
    protected static final String DTOFIELD_PSSYSBIREPORTID = "pssysbireportid";
    public static final String FIELD_PSSYSBIREPORTNAME = "PSSYSBIREPORTNAME";
    protected static final String DTOFIELD_PSSYSBIREPORTNAME = "pssysbireportname";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSBISCHEMENAME = "PSSYSBISCHEMENAME";
    protected static final String DTOFIELD_PSSYSBISCHEMENAME = "pssysbischemename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_REPORTFILE = "REPORTFILE";
    protected static final String DTOFIELD_REPORTFILE = "reportfile";
    public static final String FIELD_REPORTMODEL = "REPORTMODEL";
    protected static final String DTOFIELD_REPORTMODEL = "reportmodel";
    public static final String FIELD_REPORTPARAMS = "REPORTPARAMS";
    protected static final String DTOFIELD_REPORTPARAMS = "reportparams";
    public static final String FIELD_REPORTTAG = "REPORTTAG";
    protected static final String DTOFIELD_REPORTTAG = "reporttag";
    public static final String FIELD_REPORTTAG2 = "REPORTTAG2";
    protected static final String DTOFIELD_REPORTTAG2 = "reporttag2";
    public static final String FIELD_REPORTTYPE = "REPORTTYPE";
    protected static final String DTOFIELD_REPORTTYPE = "reporttype";
    public static final String FIELD_REPORTUIMODEL = "REPORTUIMODEL";
    protected static final String DTOFIELD_REPORTUIMODEL = "reportuimodel";
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
    public static final String DTOFIELD_PSDEREPITEMS = "psderepitems";

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
    public PSDEReportDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEReportDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
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
    public PSDEReportDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="contenttype")
    public void setContentType(String contentType) {
        this._set(DTOFIELD_CONTENTTYPE, contentType);
    }

    @JsonIgnore
    public String getContentType() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypeDirty() {
        return this._contains(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public void resetContentType() {
        this._reset(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public PSDEReportDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO contenttype(PSModelEnums.ReportContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
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
    public PSDEReportDTO createdate(Timestamp createDate) {
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
    public PSDEReportDTO createman(String createMan) {
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
    public PSDEReportDTO customcode(String customCode) {
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
    public PSDEReportDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableaudit")
    public void setEnableAudit(Integer enableAudit) {
        this._set(DTOFIELD_ENABLEAUDIT, enableAudit);
    }

    @JsonIgnore
    public Integer getEnableAudit() {
        Object objValue = this._get(DTOFIELD_ENABLEAUDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAuditDirty() {
        return this._contains(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public void resetEnableAudit() {
        this._reset(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public PSDEReportDTO enableaudit(Integer enableAudit) {
        this.setEnableAudit(enableAudit);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO enableaudit(Boolean enableAudit) {
        if (enableAudit == null) {
            this.setEnableAudit(null);
        } else {
            this.setEnableAudit(enableAudit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablelog")
    public void setEnableLog(Integer enableLog) {
        this._set(DTOFIELD_ENABLELOG, enableLog);
    }

    @JsonIgnore
    public Integer getEnableLog() {
        Object objValue = this._get(DTOFIELD_ENABLELOG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLogDirty() {
        return this._contains(DTOFIELD_ENABLELOG);
    }

    @JsonIgnore
    public void resetEnableLog() {
        this._reset(DTOFIELD_ENABLELOG);
    }

    @JsonIgnore
    public PSDEReportDTO enablelog(Integer enableLog) {
        this.setEnableLog(enableLog);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO enablelog(Boolean enableLog) {
        if (enableLog == null) {
            this.setEnableLog(null);
        } else {
            this.setEnableLog(enableLog != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEReportDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="layoutpanelmode")
    public void setLayoutPanelMode(Integer layoutPanelMode) {
        this._set(DTOFIELD_LAYOUTPANELMODE, layoutPanelMode);
    }

    @JsonIgnore
    public Integer getLayoutPanelMode() {
        Object objValue = this._get(DTOFIELD_LAYOUTPANELMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLayoutPanelModeDirty() {
        return this._contains(DTOFIELD_LAYOUTPANELMODE);
    }

    @JsonIgnore
    public void resetLayoutPanelMode() {
        this._reset(DTOFIELD_LAYOUTPANELMODE);
    }

    @JsonIgnore
    public PSDEReportDTO layoutpanelmode(Integer layoutPanelMode) {
        this.setLayoutPanelMode(layoutPanelMode);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO layoutpanelmode(PSModelEnums.LayoutPanelMode layoutPanelMode) {
        if (layoutPanelMode == null) {
            this.setLayoutPanelMode(null);
        } else {
            this.setLayoutPanelMode(layoutPanelMode.value);
        }
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
    public PSDEReportDTO logicname(String logicName) {
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
    public PSDEReportDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="multipage")
    public void setMultiPage(Integer multiPage) {
        this._set(DTOFIELD_MULTIPAGE, multiPage);
    }

    @JsonIgnore
    public Integer getMultiPage() {
        Object objValue = this._get(DTOFIELD_MULTIPAGE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMultiPageDirty() {
        return this._contains(DTOFIELD_MULTIPAGE);
    }

    @JsonIgnore
    public void resetMultiPage() {
        this._reset(DTOFIELD_MULTIPAGE);
    }

    @JsonIgnore
    public PSDEReportDTO multipage(Integer multiPage) {
        this.setMultiPage(multiPage);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO multipage(Boolean multiPage) {
        if (multiPage == null) {
            this.setMultiPage(null);
        } else {
            this.setMultiPage(multiPage != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="potime")
    public void setPOTime(Integer pOTime) {
        this._set(DTOFIELD_POTIME, pOTime);
    }

    @JsonIgnore
    public Integer getPOTime() {
        Object objValue = this._get(DTOFIELD_POTIME);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPOTimeDirty() {
        return this._contains(DTOFIELD_POTIME);
    }

    @JsonIgnore
    public void resetPOTime() {
        this._reset(DTOFIELD_POTIME);
    }

    @JsonIgnore
    public PSDEReportDTO potime(Integer pOTime) {
        this.setPOTime(pOTime);
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
    public PSDEReportDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsid2")
    public void setPSDEDSId2(String pSDEDSId2) {
        this._set(DTOFIELD_PSDEDSID2, pSDEDSId2);
    }

    @JsonIgnore
    public String getPSDEDSId2() {
        Object objValue = this._get(DTOFIELD_PSDEDSID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSId2Dirty() {
        return this._contains(DTOFIELD_PSDEDSID2);
    }

    @JsonIgnore
    public void resetPSDEDSId2() {
        this._reset(DTOFIELD_PSDEDSID2);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid2(String pSDEDSId2) {
        this.setPSDEDSId2(pSDEDSId2);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid2(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId2(null);
            this.setPSDEDSName2(null);
        } else {
            this.setPSDEDSId2(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName2(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsid3")
    public void setPSDEDSId3(String pSDEDSId3) {
        this._set(DTOFIELD_PSDEDSID3, pSDEDSId3);
    }

    @JsonIgnore
    public String getPSDEDSId3() {
        Object objValue = this._get(DTOFIELD_PSDEDSID3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSId3Dirty() {
        return this._contains(DTOFIELD_PSDEDSID3);
    }

    @JsonIgnore
    public void resetPSDEDSId3() {
        this._reset(DTOFIELD_PSDEDSID3);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid3(String pSDEDSId3) {
        this.setPSDEDSId3(pSDEDSId3);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid3(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId3(null);
            this.setPSDEDSName3(null);
        } else {
            this.setPSDEDSId3(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName3(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsid4")
    public void setPSDEDSId4(String pSDEDSId4) {
        this._set(DTOFIELD_PSDEDSID4, pSDEDSId4);
    }

    @JsonIgnore
    public String getPSDEDSId4() {
        Object objValue = this._get(DTOFIELD_PSDEDSID4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSId4Dirty() {
        return this._contains(DTOFIELD_PSDEDSID4);
    }

    @JsonIgnore
    public void resetPSDEDSId4() {
        this._reset(DTOFIELD_PSDEDSID4);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid4(String pSDEDSId4) {
        this.setPSDEDSId4(pSDEDSId4);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psdedsid4(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId4(null);
            this.setPSDEDSName4(null);
        } else {
            this.setPSDEDSId4(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName4(pSDEDataSet.getPSDEDataSetName());
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
    public PSDEReportDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    @JsonProperty(value="psdedsname2")
    public void setPSDEDSName2(String pSDEDSName2) {
        this._set(DTOFIELD_PSDEDSNAME2, pSDEDSName2);
    }

    @JsonIgnore
    public String getPSDEDSName2() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSName2Dirty() {
        return this._contains(DTOFIELD_PSDEDSNAME2);
    }

    @JsonIgnore
    public void resetPSDEDSName2() {
        this._reset(DTOFIELD_PSDEDSNAME2);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsname2(String pSDEDSName2) {
        this.setPSDEDSName2(pSDEDSName2);
        return this;
    }

    @JsonProperty(value="psdedsname3")
    public void setPSDEDSName3(String pSDEDSName3) {
        this._set(DTOFIELD_PSDEDSNAME3, pSDEDSName3);
    }

    @JsonIgnore
    public String getPSDEDSName3() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSName3Dirty() {
        return this._contains(DTOFIELD_PSDEDSNAME3);
    }

    @JsonIgnore
    public void resetPSDEDSName3() {
        this._reset(DTOFIELD_PSDEDSNAME3);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsname3(String pSDEDSName3) {
        this.setPSDEDSName3(pSDEDSName3);
        return this;
    }

    @JsonProperty(value="psdedsname4")
    public void setPSDEDSName4(String pSDEDSName4) {
        this._set(DTOFIELD_PSDEDSNAME4, pSDEDSName4);
    }

    @JsonIgnore
    public String getPSDEDSName4() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSName4Dirty() {
        return this._contains(DTOFIELD_PSDEDSNAME4);
    }

    @JsonIgnore
    public void resetPSDEDSName4() {
        this._reset(DTOFIELD_PSDEDSNAME4);
    }

    @JsonIgnore
    public PSDEReportDTO psdedsname4(String pSDEDSName4) {
        this.setPSDEDSName4(pSDEDSName4);
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
    public PSDEReportDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEReportDTO psdename(String pSDEName) {
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
    public PSDEReportDTO psdereportid(String pSDEReportId) {
        this.setPSDEReportId(pSDEReportId);
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
    public PSDEReportDTO psdereportname(String pSDEReportName) {
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEReportName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEReportName(strName);
    }

    @JsonIgnore
    public PSDEReportDTO name(String strName) {
        this.setPSDEReportName(strName);
        return this;
    }

    @JsonProperty(value="pssysbicubeid")
    public void setPSSysBICubeId(String pSSysBICubeId) {
        this._set(DTOFIELD_PSSYSBICUBEID, pSSysBICubeId);
    }

    @JsonIgnore
    public String getPSSysBICubeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public void resetPSSysBICubeId() {
        this._reset(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
        if (pSSysBICube == null) {
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        } else {
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubename")
    public void setPSSysBICubeName(String pSSysBICubeName) {
        this._set(DTOFIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }

    @JsonIgnore
    public String getPSSysBICubeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeName() {
        this._reset(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonProperty(value="pssysbireportid")
    public void setPSSysBIReportId(String pSSysBIReportId) {
        this._set(DTOFIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }

    @JsonIgnore
    public String getPSSysBIReportId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public void resetPSSysBIReportId() {
        this._reset(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbireportid(String pSSysBIReportId) {
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysbireportid(PSSysBIReportDTO pSSysBIReport) {
        if (pSSysBIReport == null) {
            this.setPSSysBIReportId(null);
            this.setPSSysBIReportName(null);
        } else {
            this.setPSSysBIReportId(pSSysBIReport.getPSSysBIReportId());
            this.setPSSysBIReportName(pSSysBIReport.getPSSysBIReportName());
        }
        return this;
    }

    @JsonProperty(value="pssysbireportname")
    public void setPSSysBIReportName(String pSSysBIReportName) {
        this._set(DTOFIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }

    @JsonIgnore
    public String getPSSysBIReportName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public void resetPSSysBIReportName() {
        this._reset(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbireportname(String pSSysBIReportName) {
        this.setPSSysBIReportName(pSSysBIReportName);
        return this;
    }

    @JsonProperty(value="pssysbischemeid")
    public void setPSSysBISchemeId(String pSSysBISchemeId) {
        this._set(DTOFIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }

    @JsonIgnore
    public String getPSSysBISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBISchemeId() {
        this._reset(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme) {
        if (pSSysBIScheme == null) {
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        } else {
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbischemename")
    public void setPSSysBISchemeName(String pSSysBISchemeName) {
        this._set(DTOFIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }

    @JsonIgnore
    public String getPSSysBISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBISchemeName() {
        this._reset(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public PSDEReportDTO pssysbischemename(String pSSysBISchemeName) {
        this.setPSSysBISchemeName(pSSysBISchemeName);
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
    public PSDEReportDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEReportDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEReportDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEReportDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSDEReportDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSDEReportDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSDEReportDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEReportDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSDEReportDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
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
    public PSDEReportDTO pssysuniresname(String pSSysUniResName) {
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
    public PSDEReportDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSDEReportDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSDEReportDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSDEReportDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="reportfile")
    public void setReportFile(String reportFile) {
        this._set(DTOFIELD_REPORTFILE, reportFile);
    }

    @JsonIgnore
    public String getReportFile() {
        Object objValue = this._get(DTOFIELD_REPORTFILE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportFileDirty() {
        return this._contains(DTOFIELD_REPORTFILE);
    }

    @JsonIgnore
    public void resetReportFile() {
        this._reset(DTOFIELD_REPORTFILE);
    }

    @JsonIgnore
    public PSDEReportDTO reportfile(String reportFile) {
        this.setReportFile(reportFile);
        return this;
    }

    @JsonProperty(value="reportmodel")
    public void setReportModel(String reportModel) {
        this._set(DTOFIELD_REPORTMODEL, reportModel);
    }

    @JsonIgnore
    public String getReportModel() {
        Object objValue = this._get(DTOFIELD_REPORTMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportModelDirty() {
        return this._contains(DTOFIELD_REPORTMODEL);
    }

    @JsonIgnore
    public void resetReportModel() {
        this._reset(DTOFIELD_REPORTMODEL);
    }

    @JsonIgnore
    public PSDEReportDTO reportmodel(String reportModel) {
        this.setReportModel(reportModel);
        return this;
    }

    @JsonProperty(value="reportparams")
    public void setReportParams(String reportParams) {
        this._set(DTOFIELD_REPORTPARAMS, reportParams);
    }

    @JsonIgnore
    public String getReportParams() {
        Object objValue = this._get(DTOFIELD_REPORTPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportParamsDirty() {
        return this._contains(DTOFIELD_REPORTPARAMS);
    }

    @JsonIgnore
    public void resetReportParams() {
        this._reset(DTOFIELD_REPORTPARAMS);
    }

    @JsonIgnore
    public PSDEReportDTO reportparams(String reportParams) {
        this.setReportParams(reportParams);
        return this;
    }

    @JsonProperty(value="reporttag")
    public void setReportTag(String reportTag) {
        this._set(DTOFIELD_REPORTTAG, reportTag);
    }

    @JsonIgnore
    public String getReportTag() {
        Object objValue = this._get(DTOFIELD_REPORTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportTagDirty() {
        return this._contains(DTOFIELD_REPORTTAG);
    }

    @JsonIgnore
    public void resetReportTag() {
        this._reset(DTOFIELD_REPORTTAG);
    }

    @JsonIgnore
    public PSDEReportDTO reporttag(String reportTag) {
        this.setReportTag(reportTag);
        return this;
    }

    @JsonProperty(value="reporttag2")
    public void setReportTag2(String reportTag2) {
        this._set(DTOFIELD_REPORTTAG2, reportTag2);
    }

    @JsonIgnore
    public String getReportTag2() {
        Object objValue = this._get(DTOFIELD_REPORTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportTag2Dirty() {
        return this._contains(DTOFIELD_REPORTTAG2);
    }

    @JsonIgnore
    public void resetReportTag2() {
        this._reset(DTOFIELD_REPORTTAG2);
    }

    @JsonIgnore
    public PSDEReportDTO reporttag2(String reportTag2) {
        this.setReportTag2(reportTag2);
        return this;
    }

    @JsonProperty(value="reporttype")
    public void setReportType(String reportType) {
        this._set(DTOFIELD_REPORTTYPE, reportType);
    }

    @JsonIgnore
    public String getReportType() {
        Object objValue = this._get(DTOFIELD_REPORTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportTypeDirty() {
        return this._contains(DTOFIELD_REPORTTYPE);
    }

    @JsonIgnore
    public void resetReportType() {
        this._reset(DTOFIELD_REPORTTYPE);
    }

    @JsonIgnore
    public PSDEReportDTO reporttype(String reportType) {
        this.setReportType(reportType);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO reporttype(PSModelEnums.ReportType reportType) {
        if (reportType == null) {
            this.setReportType(null);
        } else {
            this.setReportType(reportType.value);
        }
        return this;
    }

    @JsonProperty(value="reportuimodel")
    public void setReportUIModel(String reportUIModel) {
        this._set(DTOFIELD_REPORTUIMODEL, reportUIModel);
    }

    @JsonIgnore
    public String getReportUIModel() {
        Object objValue = this._get(DTOFIELD_REPORTUIMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReportUIModelDirty() {
        return this._contains(DTOFIELD_REPORTUIMODEL);
    }

    @JsonIgnore
    public void resetReportUIModel() {
        this._reset(DTOFIELD_REPORTUIMODEL);
    }

    @JsonIgnore
    public PSDEReportDTO reportuimodel(String reportUIModel) {
        this.setReportUIModel(reportUIModel);
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
    public PSDEReportDTO updatedate(Timestamp updateDate) {
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
    public PSDEReportDTO updateman(String updateMan) {
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
    public PSDEReportDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEReportDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEReportDTO usertag(String userTag) {
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
    public PSDEReportDTO usertag2(String userTag2) {
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
    public PSDEReportDTO usertag3(String userTag3) {
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
    public PSDEReportDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEReportId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEReportId(strValue);
    }

    @JsonIgnore
    public PSDEReportDTO id(String strValue) {
        this.setPSDEReportId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDERepItemDTO> getPSDERepItems() {
        Object list = this._get(DTOFIELD_PSDEREPITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psderepitems")
    public void setPSDERepItems(List<PSDERepItemDTO> psderepitems) {
        this._set(DTOFIELD_PSDEREPITEMS, psderepitems);
    }

    @JsonIgnore
    public List<PSDERepItemDTO> getPSDERepItemsIf() {
        Object list = this._get(DTOFIELD_PSDEREPITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEREPITEMS, list);
        }
        return (List) list;
    }
}
