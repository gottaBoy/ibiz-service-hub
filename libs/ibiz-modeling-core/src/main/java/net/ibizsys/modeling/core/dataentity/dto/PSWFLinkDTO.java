package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFLinkDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONFIELD = "ACTIONFIELD";
    protected static final String DTOFIELD_ACTIONFIELD = "actionfield";
    public static final String FIELD_ACTIONPSCODELISTID = "ACTIONPSCODELISTID";
    protected static final String DTOFIELD_ACTIONPSCODELISTID = "actionpscodelistid";
    public static final String FIELD_ACTIONPSCODELISTNAME = "ACTIONPSCODELISTNAME";
    protected static final String DTOFIELD_ACTIONPSCODELISTNAME = "actionpscodelistname";
    public static final String FIELD_ACTORFIELDS = "ACTORFIELDS";
    protected static final String DTOFIELD_ACTORFIELDS = "actorfields";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMCONDFLAG = "CUSTOMCONDFLAG";
    protected static final String DTOFIELD_CUSTOMCONDFLAG = "customcondflag";
    public static final String FIELD_DEFAULTLINK = "DEFAULTLINK";
    protected static final String DTOFIELD_DEFAULTLINK = "defaultlink";
    public static final String FIELD_DSTENDPOINT = "DSTENDPOINT";
    protected static final String DTOFIELD_DSTENDPOINT = "dstendpoint";
    public static final String FIELD_ENABLEMOBILE = "ENABLEMOBILE";
    protected static final String DTOFIELD_ENABLEMOBILE = "enablemobile";
    public static final String FIELD_FORMCODENAME = "FORMCODENAME";
    protected static final String DTOFIELD_FORMCODENAME = "formcodename";
    public static final String FIELD_FROMPSWFPROCID = "FROMPSWFPROCID";
    protected static final String DTOFIELD_FROMPSWFPROCID = "frompswfprocid";
    public static final String FIELD_FROMPSWFPROCNAME = "FROMPSWFPROCNAME";
    protected static final String DTOFIELD_FROMPSWFPROCNAME = "frompswfprocname";
    public static final String FIELD_LNPSLANRESID = "LNPSLANRESID";
    protected static final String DTOFIELD_LNPSLANRESID = "lnpslanresid";
    public static final String FIELD_LNPSLANRESNAME = "LNPSLANRESNAME";
    protected static final String DTOFIELD_LNPSLANRESNAME = "lnpslanresname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MEMOFIELD = "MEMOFIELD";
    protected static final String DTOFIELD_MEMOFIELD = "memofield";
    public static final String FIELD_MOBFORMCODENAME = "MOBFORMCODENAME";
    protected static final String DTOFIELD_MOBFORMCODENAME = "mobformcodename";
    public static final String FIELD_MOBPSDEFORMID = "MOBPSDEFORMID";
    protected static final String DTOFIELD_MOBPSDEFORMID = "mobpsdeformid";
    public static final String FIELD_MOBPSDEFORMNAME = "MOBPSDEFORMNAME";
    protected static final String DTOFIELD_MOBPSDEFORMNAME = "mobpsdeformname";
    public static final String FIELD_MOBPSDEVIEWID = "MOBPSDEVIEWID";
    protected static final String DTOFIELD_MOBPSDEVIEWID = "mobpsdeviewid";
    public static final String FIELD_MOBPSDEVIEWNAME = "MOBPSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";
    public static final String FIELD_MOBVIEWCODENAME = "MOBVIEWCODENAME";
    protected static final String DTOFIELD_MOBVIEWCODENAME = "mobviewcodename";
    public static final String FIELD_MODELID = "MODELID";
    protected static final String DTOFIELD_MODELID = "modelid";
    public static final String FIELD_NEXTCOND = "NEXTCOND";
    protected static final String DTOFIELD_NEXTCOND = "nextcond";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
    public static final String FIELD_PSWFLINKID = "PSWFLINKID";
    protected static final String DTOFIELD_PSWFLINKID = "pswflinkid";
    public static final String FIELD_PSWFLINKNAME = "PSWFLINKNAME";
    protected static final String DTOFIELD_PSWFLINKNAME = "pswflinkname";
    public static final String FIELD_PSWFROLEID = "PSWFROLEID";
    protected static final String DTOFIELD_PSWFROLEID = "pswfroleid";
    public static final String FIELD_PSWFROLENAME = "PSWFROLENAME";
    protected static final String DTOFIELD_PSWFROLENAME = "pswfrolename";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_PSWFVERSIONNAME = "PSWFVERSIONNAME";
    protected static final String DTOFIELD_PSWFVERSIONNAME = "pswfversionname";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
    public static final String FIELD_SOMEROLEFLAG = "SOMEROLEFLAG";
    protected static final String DTOFIELD_SOMEROLEFLAG = "someroleflag";
    public static final String FIELD_SRCENDPOINT = "SRCENDPOINT";
    protected static final String DTOFIELD_SRCENDPOINT = "srcendpoint";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOPSWFPROCID = "TOPSWFPROCID";
    protected static final String DTOFIELD_TOPSWFPROCID = "topswfprocid";
    public static final String FIELD_TOPSWFPROCNAME = "TOPSWFPROCNAME";
    protected static final String DTOFIELD_TOPSWFPROCNAME = "topswfprocname";
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
    public static final String FIELD_WFENGINETYPE = "WFENGINETYPE";
    protected static final String DTOFIELD_WFENGINETYPE = "wfenginetype";
    public static final String FIELD_WFLINKTYPE = "WFLINKTYPE";
    protected static final String DTOFIELD_WFLINKTYPE = "wflinktype";
    public static final String DTOFIELD_PSWFLINKROLES = "pswflinkroles";
    public static final String DTOFIELD_PSWFLINKCONDS = "pswflinkconds";

    @JsonProperty(value="actionfield")
    public void setActionField(String actionField) {
        this._set(DTOFIELD_ACTIONFIELD, actionField);
    }

    @JsonIgnore
    public String getActionField() {
        Object objValue = this._get(DTOFIELD_ACTIONFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionFieldDirty() {
        return this._contains(DTOFIELD_ACTIONFIELD);
    }

    @JsonIgnore
    public void resetActionField() {
        this._reset(DTOFIELD_ACTIONFIELD);
    }

    @JsonIgnore
    public PSWFLinkDTO actionfield(String actionField) {
        this.setActionField(actionField);
        return this;
    }

    @JsonProperty(value="actionpscodelistid")
    public void setActionPSCodeListId(String actionPSCodeListId) {
        this._set(DTOFIELD_ACTIONPSCODELISTID, actionPSCodeListId);
    }

    @JsonIgnore
    public String getActionPSCodeListId() {
        Object objValue = this._get(DTOFIELD_ACTIONPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionPSCodeListIdDirty() {
        return this._contains(DTOFIELD_ACTIONPSCODELISTID);
    }

    @JsonIgnore
    public void resetActionPSCodeListId() {
        this._reset(DTOFIELD_ACTIONPSCODELISTID);
    }

    @JsonIgnore
    public PSWFLinkDTO actionpscodelistid(String actionPSCodeListId) {
        this.setActionPSCodeListId(actionPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO actionpscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setActionPSCodeListId(null);
            this.setActionPSCodeListName(null);
        } else {
            this.setActionPSCodeListId(pSCodeList.getPSCodeListId());
            this.setActionPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="actionpscodelistname")
    public void setActionPSCodeListName(String actionPSCodeListName) {
        this._set(DTOFIELD_ACTIONPSCODELISTNAME, actionPSCodeListName);
    }

    @JsonIgnore
    public String getActionPSCodeListName() {
        Object objValue = this._get(DTOFIELD_ACTIONPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionPSCodeListNameDirty() {
        return this._contains(DTOFIELD_ACTIONPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetActionPSCodeListName() {
        this._reset(DTOFIELD_ACTIONPSCODELISTNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO actionpscodelistname(String actionPSCodeListName) {
        this.setActionPSCodeListName(actionPSCodeListName);
        return this;
    }

    @JsonProperty(value="actorfields")
    public void setActorFields(String actorFields) {
        this._set(DTOFIELD_ACTORFIELDS, actorFields);
    }

    @JsonIgnore
    public String getActorFields() {
        Object objValue = this._get(DTOFIELD_ACTORFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActorFieldsDirty() {
        return this._contains(DTOFIELD_ACTORFIELDS);
    }

    @JsonIgnore
    public void resetActorFields() {
        this._reset(DTOFIELD_ACTORFIELDS);
    }

    @JsonIgnore
    public PSWFLinkDTO actorfields(String actorFields) {
        this.setActorFields(actorFields);
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
    public PSWFLinkDTO codename(String codeName) {
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
    public PSWFLinkDTO createdate(Timestamp createDate) {
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
    public PSWFLinkDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSWFLinkDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customcondflag")
    public void setCustomCondFlag(Integer customCondFlag) {
        this._set(DTOFIELD_CUSTOMCONDFLAG, customCondFlag);
    }

    @JsonIgnore
    public Integer getCustomCondFlag() {
        Object objValue = this._get(DTOFIELD_CUSTOMCONDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondFlagDirty() {
        return this._contains(DTOFIELD_CUSTOMCONDFLAG);
    }

    @JsonIgnore
    public void resetCustomCondFlag() {
        this._reset(DTOFIELD_CUSTOMCONDFLAG);
    }

    @JsonIgnore
    public PSWFLinkDTO customcondflag(Integer customCondFlag) {
        this.setCustomCondFlag(customCondFlag);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO customcondflag(Boolean customCondFlag) {
        if (customCondFlag == null) {
            this.setCustomCondFlag(null);
        } else {
            this.setCustomCondFlag(customCondFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="defaultlink")
    public void setDefaultLink(Integer defaultLink) {
        this._set(DTOFIELD_DEFAULTLINK, defaultLink);
    }

    @JsonIgnore
    public Integer getDefaultLink() {
        Object objValue = this._get(DTOFIELD_DEFAULTLINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultLinkDirty() {
        return this._contains(DTOFIELD_DEFAULTLINK);
    }

    @JsonIgnore
    public void resetDefaultLink() {
        this._reset(DTOFIELD_DEFAULTLINK);
    }

    @JsonIgnore
    public PSWFLinkDTO defaultlink(Integer defaultLink) {
        this.setDefaultLink(defaultLink);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO defaultlink(Boolean defaultLink) {
        if (defaultLink == null) {
            this.setDefaultLink(null);
        } else {
            this.setDefaultLink(defaultLink != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dstendpoint")
    public void setDstEndPoint(String dstEndPoint) {
        this._set(DTOFIELD_DSTENDPOINT, dstEndPoint);
    }

    @JsonIgnore
    public String getDstEndPoint() {
        Object objValue = this._get(DTOFIELD_DSTENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstEndPointDirty() {
        return this._contains(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public void resetDstEndPoint() {
        this._reset(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public PSWFLinkDTO dstendpoint(String dstEndPoint) {
        this.setDstEndPoint(dstEndPoint);
        return this;
    }

    @JsonProperty(value="enablemobile")
    public void setEnableMobile(Integer enableMobile) {
        this._set(DTOFIELD_ENABLEMOBILE, enableMobile);
    }

    @JsonIgnore
    public Integer getEnableMobile() {
        Object objValue = this._get(DTOFIELD_ENABLEMOBILE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMobileDirty() {
        return this._contains(DTOFIELD_ENABLEMOBILE);
    }

    @JsonIgnore
    public void resetEnableMobile() {
        this._reset(DTOFIELD_ENABLEMOBILE);
    }

    @JsonIgnore
    public PSWFLinkDTO enablemobile(Integer enableMobile) {
        this.setEnableMobile(enableMobile);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO enablemobile(Boolean enableMobile) {
        if (enableMobile == null) {
            this.setEnableMobile(null);
        } else {
            this.setEnableMobile(enableMobile != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formcodename")
    public void setFormCodeName(String formCodeName) {
        this._set(DTOFIELD_FORMCODENAME, formCodeName);
    }

    @JsonIgnore
    public String getFormCodeName() {
        Object objValue = this._get(DTOFIELD_FORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCodeNameDirty() {
        return this._contains(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public void resetFormCodeName() {
        this._reset(DTOFIELD_FORMCODENAME);
    }

    @JsonIgnore
    public PSWFLinkDTO formcodename(String formCodeName) {
        this.setFormCodeName(formCodeName);
        return this;
    }

    @JsonProperty(value="frompswfprocid")
    public void setFromPSWFProcId(String fromPSWFProcId) {
        this._set(DTOFIELD_FROMPSWFPROCID, fromPSWFProcId);
    }

    @JsonIgnore
    public String getFromPSWFProcId() {
        Object objValue = this._get(DTOFIELD_FROMPSWFPROCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFromPSWFProcIdDirty() {
        return this._contains(DTOFIELD_FROMPSWFPROCID);
    }

    @JsonIgnore
    public void resetFromPSWFProcId() {
        this._reset(DTOFIELD_FROMPSWFPROCID);
    }

    @JsonIgnore
    public PSWFLinkDTO frompswfprocid(String fromPSWFProcId) {
        this.setFromPSWFProcId(fromPSWFProcId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO frompswfprocid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setFromPSWFProcId(null);
            this.setFromPSWFProcName(null);
            this.setPSDEId(null);
            this.setPSWFDEId(null);
        } else {
            this.setFromPSWFProcId(pSWFProcess.getPSWFProcessId());
            this.setFromPSWFProcName(pSWFProcess.getPSWFProcessName());
            this.setPSDEId(pSWFProcess.getPSDEId());
            this.setPSWFDEId(pSWFProcess.getPSWFDEId());
        }
        return this;
    }

    @JsonProperty(value="frompswfprocname")
    public void setFromPSWFProcName(String fromPSWFProcName) {
        this._set(DTOFIELD_FROMPSWFPROCNAME, fromPSWFProcName);
    }

    @JsonIgnore
    public String getFromPSWFProcName() {
        Object objValue = this._get(DTOFIELD_FROMPSWFPROCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFromPSWFProcNameDirty() {
        return this._contains(DTOFIELD_FROMPSWFPROCNAME);
    }

    @JsonIgnore
    public void resetFromPSWFProcName() {
        this._reset(DTOFIELD_FROMPSWFPROCNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO frompswfprocname(String fromPSWFProcName) {
        this.setFromPSWFProcName(fromPSWFProcName);
        return this;
    }

    @JsonProperty(value="lnpslanresid")
    public void setLNPSLanResId(String lNPSLanResId) {
        this._set(DTOFIELD_LNPSLANRESID, lNPSLanResId);
    }

    @JsonIgnore
    public String getLNPSLanResId() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResIdDirty() {
        return this._contains(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public void resetLNPSLanResId() {
        this._reset(DTOFIELD_LNPSLANRESID);
    }

    @JsonIgnore
    public PSWFLinkDTO lnpslanresid(String lNPSLanResId) {
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO lnpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        } else {
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="lnpslanresname")
    public void setLNPSLanResName(String lNPSLanResName) {
        this._set(DTOFIELD_LNPSLANRESNAME, lNPSLanResName);
    }

    @JsonIgnore
    public String getLNPSLanResName() {
        Object objValue = this._get(DTOFIELD_LNPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLNPSLanResNameDirty() {
        return this._contains(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public void resetLNPSLanResName() {
        this._reset(DTOFIELD_LNPSLANRESNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO lnpslanresname(String lNPSLanResName) {
        this.setLNPSLanResName(lNPSLanResName);
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
    public PSWFLinkDTO logicname(String logicName) {
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
    public PSWFLinkDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="memofield")
    public void setMemoField(String memoField) {
        this._set(DTOFIELD_MEMOFIELD, memoField);
    }

    @JsonIgnore
    public String getMemoField() {
        Object objValue = this._get(DTOFIELD_MEMOFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMemoFieldDirty() {
        return this._contains(DTOFIELD_MEMOFIELD);
    }

    @JsonIgnore
    public void resetMemoField() {
        this._reset(DTOFIELD_MEMOFIELD);
    }

    @JsonIgnore
    public PSWFLinkDTO memofield(String memoField) {
        this.setMemoField(memoField);
        return this;
    }

    @JsonProperty(value="mobformcodename")
    public void setMobFormCodeName(String mobFormCodeName) {
        this._set(DTOFIELD_MOBFORMCODENAME, mobFormCodeName);
    }

    @JsonIgnore
    public String getMobFormCodeName() {
        Object objValue = this._get(DTOFIELD_MOBFORMCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobFormCodeNameDirty() {
        return this._contains(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public void resetMobFormCodeName() {
        this._reset(DTOFIELD_MOBFORMCODENAME);
    }

    @JsonIgnore
    public PSWFLinkDTO mobformcodename(String mobFormCodeName) {
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    @JsonProperty(value="mobpsdeformid")
    public void setMobPSDEFormId(String mobPSDEFormId) {
        this._set(DTOFIELD_MOBPSDEFORMID, mobPSDEFormId);
    }

    @JsonIgnore
    public String getMobPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public void resetMobPSDEFormId() {
        this._reset(DTOFIELD_MOBPSDEFORMID);
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeformid(String mobPSDEFormId) {
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMobFormCodeName(null);
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        } else {
            this.setMobFormCodeName(pSDEForm.getCodeName());
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeformname")
    public void setMobPSDEFormName(String mobPSDEFormName) {
        this._set(DTOFIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }

    @JsonIgnore
    public String getMobPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMobPSDEFormName() {
        this._reset(DTOFIELD_MOBPSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeformname(String mobPSDEFormName) {
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    @JsonProperty(value="mobpsdeviewid")
    public void setMobPSDEViewId(String mobPSDEViewId) {
        this._set(DTOFIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }

    @JsonIgnore
    public String getMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobPSDEViewId() {
        this._reset(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeviewid(String mobPSDEViewId) {
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
            this.setMobViewCodeName(null);
        } else {
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
            this.setMobViewCodeName(pSDEViewBase.getCodeName());
        }
        return this;
    }

    @JsonProperty(value="mobpsdeviewname")
    public void setMobPSDEViewName(String mobPSDEViewName) {
        this._set(DTOFIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }

    @JsonIgnore
    public String getMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobPSDEViewName() {
        this._reset(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO mobpsdeviewname(String mobPSDEViewName) {
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    @JsonProperty(value="mobviewcodename")
    public void setMobViewCodeName(String mobViewCodeName) {
        this._set(DTOFIELD_MOBVIEWCODENAME, mobViewCodeName);
    }

    @JsonIgnore
    public String getMobViewCodeName() {
        Object objValue = this._get(DTOFIELD_MOBVIEWCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobViewCodeNameDirty() {
        return this._contains(DTOFIELD_MOBVIEWCODENAME);
    }

    @JsonIgnore
    public void resetMobViewCodeName() {
        this._reset(DTOFIELD_MOBVIEWCODENAME);
    }

    @JsonIgnore
    public PSWFLinkDTO mobviewcodename(String mobViewCodeName) {
        this.setMobViewCodeName(mobViewCodeName);
        return this;
    }

    @JsonProperty(value="modelid")
    public void setModelId(String modelId) {
        this._set(DTOFIELD_MODELID, modelId);
    }

    @JsonIgnore
    public String getModelId() {
        Object objValue = this._get(DTOFIELD_MODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelIdDirty() {
        return this._contains(DTOFIELD_MODELID);
    }

    @JsonIgnore
    public void resetModelId() {
        this._reset(DTOFIELD_MODELID);
    }

    @JsonIgnore
    public PSWFLinkDTO modelid(String modelId) {
        this.setModelId(modelId);
        return this;
    }

    @JsonProperty(value="nextcond")
    public void setNextCond(String nextCond) {
        this._set(DTOFIELD_NEXTCOND, nextCond);
    }

    @JsonIgnore
    public String getNextCond() {
        Object objValue = this._get(DTOFIELD_NEXTCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNextCondDirty() {
        return this._contains(DTOFIELD_NEXTCOND);
    }

    @JsonIgnore
    public void resetNextCond() {
        this._reset(DTOFIELD_NEXTCOND);
    }

    @JsonIgnore
    public PSWFLinkDTO nextcond(String nextCond) {
        this.setNextCond(nextCond);
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
    public PSWFLinkDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSWFLinkDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setFormCodeName(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setFormCodeName(pSDEForm.getCodeName());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSWFLinkDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSWFLinkDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSWFLinkDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="pswfdeid")
    public void setPSWFDEId(String pSWFDEId) {
        this._set(DTOFIELD_PSWFDEID, pSWFDEId);
    }

    @JsonIgnore
    public String getPSWFDEId() {
        Object objValue = this._get(DTOFIELD_PSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDEIdDirty() {
        return this._contains(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public void resetPSWFDEId() {
        this._reset(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public PSWFLinkDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    @JsonProperty(value="pswflinkid")
    public void setPSWFLinkId(String pSWFLinkId) {
        this._set(DTOFIELD_PSWFLINKID, pSWFLinkId);
    }

    @JsonIgnore
    public String getPSWFLinkId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkIdDirty() {
        return this._contains(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public void resetPSWFLinkId() {
        this._reset(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public PSWFLinkDTO pswflinkid(String pSWFLinkId) {
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    @JsonProperty(value="pswflinkname")
    public void setPSWFLinkName(String pSWFLinkName) {
        this._set(DTOFIELD_PSWFLINKNAME, pSWFLinkName);
    }

    @JsonIgnore
    public String getPSWFLinkName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkNameDirty() {
        return this._contains(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public void resetPSWFLinkName() {
        this._reset(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO pswflinkname(String pSWFLinkName) {
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    @JsonProperty(value="pswfroleid")
    public void setPSWFRoleId(String pSWFRoleId) {
        this._set(DTOFIELD_PSWFROLEID, pSWFRoleId);
    }

    @JsonIgnore
    public String getPSWFRoleId() {
        Object objValue = this._get(DTOFIELD_PSWFROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFRoleIdDirty() {
        return this._contains(DTOFIELD_PSWFROLEID);
    }

    @JsonIgnore
    public void resetPSWFRoleId() {
        this._reset(DTOFIELD_PSWFROLEID);
    }

    @JsonIgnore
    public PSWFLinkDTO pswfroleid(String pSWFRoleId) {
        this.setPSWFRoleId(pSWFRoleId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO pswfroleid(PSWFRoleDTO pSWFRole) {
        if (pSWFRole == null) {
            this.setPSWFRoleId(null);
            this.setPSWFRoleName(null);
        } else {
            this.setPSWFRoleId(pSWFRole.getPSWFRoleId());
            this.setPSWFRoleName(pSWFRole.getPSWFRoleName());
        }
        return this;
    }

    @JsonProperty(value="pswfrolename")
    public void setPSWFRoleName(String pSWFRoleName) {
        this._set(DTOFIELD_PSWFROLENAME, pSWFRoleName);
    }

    @JsonIgnore
    public String getPSWFRoleName() {
        Object objValue = this._get(DTOFIELD_PSWFROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFRoleNameDirty() {
        return this._contains(DTOFIELD_PSWFROLENAME);
    }

    @JsonIgnore
    public void resetPSWFRoleName() {
        this._reset(DTOFIELD_PSWFROLENAME);
    }

    @JsonIgnore
    public PSWFLinkDTO pswfrolename(String pSWFRoleName) {
        this.setPSWFRoleName(pSWFRoleName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFLinkDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO pswfversionid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
            this.setWFEngineType(null);
        } else {
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
            this.setWFEngineType(pSWFVersion.getWFEngineType());
        }
        return this;
    }

    @JsonProperty(value="pswfversionname")
    public void setPSWFVersionName(String pSWFVersionName) {
        this._set(DTOFIELD_PSWFVERSIONNAME, pSWFVersionName);
    }

    @JsonIgnore
    public String getPSWFVersionName() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionNameDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public void resetPSWFVersionName() {
        this._reset(DTOFIELD_PSWFVERSIONNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO pswfversionname(String pSWFVersionName) {
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    @JsonProperty(value="shapeparams")
    public void setShapeParams(String shapeParams) {
        this._set(DTOFIELD_SHAPEPARAMS, shapeParams);
    }

    @JsonIgnore
    public String getShapeParams() {
        Object objValue = this._get(DTOFIELD_SHAPEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeParamsDirty() {
        return this._contains(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public void resetShapeParams() {
        this._reset(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public PSWFLinkDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
        return this;
    }

    @JsonProperty(value="someroleflag")
    public void setSomeRoleFlag(Integer someRoleFlag) {
        this._set(DTOFIELD_SOMEROLEFLAG, someRoleFlag);
    }

    @JsonIgnore
    public Integer getSomeRoleFlag() {
        Object objValue = this._get(DTOFIELD_SOMEROLEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSomeRoleFlagDirty() {
        return this._contains(DTOFIELD_SOMEROLEFLAG);
    }

    @JsonIgnore
    public void resetSomeRoleFlag() {
        this._reset(DTOFIELD_SOMEROLEFLAG);
    }

    @JsonIgnore
    public PSWFLinkDTO someroleflag(Integer someRoleFlag) {
        this.setSomeRoleFlag(someRoleFlag);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO someroleflag(Boolean someRoleFlag) {
        if (someRoleFlag == null) {
            this.setSomeRoleFlag(null);
        } else {
            this.setSomeRoleFlag(someRoleFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="srcendpoint")
    public void setSrcEndPoint(String srcEndPoint) {
        this._set(DTOFIELD_SRCENDPOINT, srcEndPoint);
    }

    @JsonIgnore
    public String getSrcEndPoint() {
        Object objValue = this._get(DTOFIELD_SRCENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcEndPointDirty() {
        return this._contains(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public void resetSrcEndPoint() {
        this._reset(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public PSWFLinkDTO srcendpoint(String srcEndPoint) {
        this.setSrcEndPoint(srcEndPoint);
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
    public PSWFLinkDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSWFLinkDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="topswfprocid")
    public void setToPSWFProcId(String toPSWFProcId) {
        this._set(DTOFIELD_TOPSWFPROCID, toPSWFProcId);
    }

    @JsonIgnore
    public String getToPSWFProcId() {
        Object objValue = this._get(DTOFIELD_TOPSWFPROCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToPSWFProcIdDirty() {
        return this._contains(DTOFIELD_TOPSWFPROCID);
    }

    @JsonIgnore
    public void resetToPSWFProcId() {
        this._reset(DTOFIELD_TOPSWFPROCID);
    }

    @JsonIgnore
    public PSWFLinkDTO topswfprocid(String toPSWFProcId) {
        this.setToPSWFProcId(toPSWFProcId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO topswfprocid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setToPSWFProcId(null);
            this.setToPSWFProcName(null);
        } else {
            this.setToPSWFProcId(pSWFProcess.getPSWFProcessId());
            this.setToPSWFProcName(pSWFProcess.getPSWFProcessName());
        }
        return this;
    }

    @JsonProperty(value="topswfprocname")
    public void setToPSWFProcName(String toPSWFProcName) {
        this._set(DTOFIELD_TOPSWFPROCNAME, toPSWFProcName);
    }

    @JsonIgnore
    public String getToPSWFProcName() {
        Object objValue = this._get(DTOFIELD_TOPSWFPROCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToPSWFProcNameDirty() {
        return this._contains(DTOFIELD_TOPSWFPROCNAME);
    }

    @JsonIgnore
    public void resetToPSWFProcName() {
        this._reset(DTOFIELD_TOPSWFPROCNAME);
    }

    @JsonIgnore
    public PSWFLinkDTO topswfprocname(String toPSWFProcName) {
        this.setToPSWFProcName(toPSWFProcName);
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
    public PSWFLinkDTO updatedate(Timestamp updateDate) {
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
    public PSWFLinkDTO updateman(String updateMan) {
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
    public PSWFLinkDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWFLinkDTO userdata(String userData) {
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
    public PSWFLinkDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSWFLinkDTO usertag(String userTag) {
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
    public PSWFLinkDTO usertag2(String userTag2) {
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
    public PSWFLinkDTO usertag3(String userTag3) {
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
    public PSWFLinkDTO usertag4(String userTag4) {
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
    public PSWFLinkDTO viewcodename(String viewCodeName) {
        this.setViewCodeName(viewCodeName);
        return this;
    }

    @JsonProperty(value="wfenginetype")
    public void setWFEngineType(String wFEngineType) {
        this._set(DTOFIELD_WFENGINETYPE, wFEngineType);
    }

    @JsonIgnore
    public String getWFEngineType() {
        Object objValue = this._get(DTOFIELD_WFENGINETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFEngineTypeDirty() {
        return this._contains(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public void resetWFEngineType() {
        this._reset(DTOFIELD_WFENGINETYPE);
    }

    @JsonIgnore
    public PSWFLinkDTO wfenginetype(String wFEngineType) {
        this.setWFEngineType(wFEngineType);
        return this;
    }

    @JsonProperty(value="wflinktype")
    public void setWFLinkType(String wFLinkType) {
        this._set(DTOFIELD_WFLINKTYPE, wFLinkType);
    }

    @JsonIgnore
    public String getWFLinkType() {
        Object objValue = this._get(DTOFIELD_WFLINKTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFLinkTypeDirty() {
        return this._contains(DTOFIELD_WFLINKTYPE);
    }

    @JsonIgnore
    public void resetWFLinkType() {
        this._reset(DTOFIELD_WFLINKTYPE);
    }

    @JsonIgnore
    public PSWFLinkDTO wflinktype(String wFLinkType) {
        this.setWFLinkType(wFLinkType);
        return this;
    }

    @JsonIgnore
    public PSWFLinkDTO wflinktype(PSModelEnums.WFLinkType wFLinkType) {
        if (wFLinkType == null) {
            this.setWFLinkType(null);
        } else {
            this.setWFLinkType(wFLinkType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFLinkId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFLinkId(strValue);
    }

    @JsonIgnore
    public PSWFLinkDTO id(String strValue) {
        this.setPSWFLinkId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWFLinkRoleDTO> getPSWFLinkRoles() {
        Object list = this._get(DTOFIELD_PSWFLINKROLES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswflinkroles")
    public void setPSWFLinkRoles(List<PSWFLinkRoleDTO> pswflinkroles) {
        this._set(DTOFIELD_PSWFLINKROLES, pswflinkroles);
    }

    @JsonIgnore
    public List<PSWFLinkRoleDTO> getPSWFLinkRolesIf() {
        Object list = this._get(DTOFIELD_PSWFLINKROLES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFLINKROLES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSWFLinkCondDTO> getPSWFLinkConds() {
        Object list = this._get(DTOFIELD_PSWFLINKCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswflinkconds")
    public void setPSWFLinkConds(List<PSWFLinkCondDTO> pswflinkconds) {
        this._set(DTOFIELD_PSWFLINKCONDS, pswflinkconds);
    }

    @JsonIgnore
    public List<PSWFLinkCondDTO> getPSWFLinkCondsIf() {
        Object list = this._get(DTOFIELD_PSWFLINKCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFLINKCONDS, list);
        }
        return (List) list;
    }
}