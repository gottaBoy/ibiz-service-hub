package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSFPreviewActionDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONPARAM = "ACTIONPARAM";
    protected static final String DTOFIELD_ACTIONPARAM = "actionparam";
    public static final String FIELD_ACTIONPARAM2 = "ACTIONPARAM2";
    protected static final String DTOFIELD_ACTIONPARAM2 = "actionparam2";
    public static final String FIELD_ACTIONPARAM3 = "ACTIONPARAM3";
    protected static final String DTOFIELD_ACTIONPARAM3 = "actionparam3";
    public static final String FIELD_ACTIONPARAM4 = "ACTIONPARAM4";
    protected static final String DTOFIELD_ACTIONPARAM4 = "actionparam4";
    public static final String FIELD_ACTIONPARAM5 = "ACTIONPARAM5";
    protected static final String DTOFIELD_ACTIONPARAM5 = "actionparam5";
    public static final String FIELD_ACTIONPARAM6 = "ACTIONPARAM6";
    protected static final String DTOFIELD_ACTIONPARAM6 = "actionparam6";
    public static final String FIELD_ACTIONRESULT = "ACTIONRESULT";
    protected static final String DTOFIELD_ACTIONRESULT = "actionresult";
    public static final String FIELD_ACTIONSTATE = "ACTIONSTATE";
    protected static final String DTOFIELD_ACTIONSTATE = "actionstate";
    public static final String FIELD_BEGINTIME = "BEGINTIME";
    protected static final String DTOFIELD_BEGINTIME = "begintime";
    public static final String FIELD_CODEURL = "CODEURL";
    protected static final String DTOFIELD_CODEURL = "codeurl";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENDTIME = "ENDTIME";
    protected static final String DTOFIELD_ENDTIME = "endtime";
    public static final String FIELD_PREVIEWINFO = "PREVIEWINFO";
    protected static final String DTOFIELD_PREVIEWINFO = "previewinfo";
    public static final String FIELD_PREVIEWSTEP = "PREVIEWSTEP";
    protected static final String DTOFIELD_PREVIEWSTEP = "previewstep";
    public static final String FIELD_PREVIEWURL = "PREVIEWURL";
    protected static final String DTOFIELD_PREVIEWURL = "previewurl";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDSCONSOLEID = "PSDSCONSOLEID";
    protected static final String DTOFIELD_PSDSCONSOLEID = "psdsconsoleid";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFPREVIEWACTIONID = "PSSFPREVIEWACTIONID";
    protected static final String DTOFIELD_PSSFPREVIEWACTIONID = "pssfpreviewactionid";
    public static final String FIELD_PSSFPREVIEWACTIONNAME = "PSSFPREVIEWACTIONNAME";
    protected static final String DTOFIELD_PSSFPREVIEWACTIONNAME = "pssfpreviewactionname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSSFPUBID = "PSSYSSFPUBID";
    protected static final String DTOFIELD_PSSYSSFPUBID = "pssyssfpubid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="actionparam")
    public void setActionParam(String actionParam) {
        this._set(DTOFIELD_ACTIONPARAM, actionParam);
    }

    @JsonIgnore
    public String getActionParam() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamDirty() {
        return this._contains(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public void resetActionParam() {
        this._reset(DTOFIELD_ACTIONPARAM);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam(String actionParam) {
        this.setActionParam(actionParam);
        return this;
    }

    @JsonProperty(value="actionparam2")
    public void setActionParam2(String actionParam2) {
        this._set(DTOFIELD_ACTIONPARAM2, actionParam2);
    }

    @JsonIgnore
    public String getActionParam2() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam2Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public void resetActionParam2() {
        this._reset(DTOFIELD_ACTIONPARAM2);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam2(String actionParam2) {
        this.setActionParam2(actionParam2);
        return this;
    }

    @JsonProperty(value="actionparam3")
    public void setActionParam3(String actionParam3) {
        this._set(DTOFIELD_ACTIONPARAM3, actionParam3);
    }

    @JsonIgnore
    public String getActionParam3() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam3Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public void resetActionParam3() {
        this._reset(DTOFIELD_ACTIONPARAM3);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam3(String actionParam3) {
        this.setActionParam3(actionParam3);
        return this;
    }

    @JsonProperty(value="actionparam4")
    public void setActionParam4(String actionParam4) {
        this._set(DTOFIELD_ACTIONPARAM4, actionParam4);
    }

    @JsonIgnore
    public String getActionParam4() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParam4Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public void resetActionParam4() {
        this._reset(DTOFIELD_ACTIONPARAM4);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam4(String actionParam4) {
        this.setActionParam4(actionParam4);
        return this;
    }

    @JsonProperty(value="actionparam5")
    public void setActionParam5(Integer actionParam5) {
        this._set(DTOFIELD_ACTIONPARAM5, actionParam5);
    }

    @JsonIgnore
    public Integer getActionParam5() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionParam5Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM5);
    }

    @JsonIgnore
    public void resetActionParam5() {
        this._reset(DTOFIELD_ACTIONPARAM5);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam5(Integer actionParam5) {
        this.setActionParam5(actionParam5);
        return this;
    }

    @JsonProperty(value="actionparam6")
    public void setActionParam6(Integer actionParam6) {
        this._set(DTOFIELD_ACTIONPARAM6, actionParam6);
    }

    @JsonIgnore
    public Integer getActionParam6() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionParam6Dirty() {
        return this._contains(DTOFIELD_ACTIONPARAM6);
    }

    @JsonIgnore
    public void resetActionParam6() {
        this._reset(DTOFIELD_ACTIONPARAM6);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionparam6(Integer actionParam6) {
        this.setActionParam6(actionParam6);
        return this;
    }

    @JsonProperty(value="actionresult")
    public void setActionResult(String actionResult) {
        this._set(DTOFIELD_ACTIONRESULT, actionResult);
    }

    @JsonIgnore
    public String getActionResult() {
        Object objValue = this._get(DTOFIELD_ACTIONRESULT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionResultDirty() {
        return this._contains(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public void resetActionResult() {
        this._reset(DTOFIELD_ACTIONRESULT);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionresult(String actionResult) {
        this.setActionResult(actionResult);
        return this;
    }

    @JsonProperty(value="actionstate")
    public void setActionState(Integer actionState) {
        this._set(DTOFIELD_ACTIONSTATE, actionState);
    }

    @JsonIgnore
    public Integer getActionState() {
        Object objValue = this._get(DTOFIELD_ACTIONSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionStateDirty() {
        return this._contains(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public void resetActionState() {
        this._reset(DTOFIELD_ACTIONSTATE);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionstate(Integer actionState) {
        this.setActionState(actionState);
        return this;
    }

    @JsonIgnore
    public PSSFPreviewActionDTO actionstate(PSModelEnums.BackendActionState actionState) {
        if (actionState == null) {
            this.setActionState(null);
        } else {
            this.setActionState(actionState.value);
        }
        return this;
    }

    @JsonProperty(value="begintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setBeginTime(Timestamp beginTime) {
        this._set(DTOFIELD_BEGINTIME, beginTime);
    }

    @JsonIgnore
    public Timestamp getBeginTime() {
        Object objValue = this._get(DTOFIELD_BEGINTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isBeginTimeDirty() {
        return this._contains(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public void resetBeginTime() {
        this._reset(DTOFIELD_BEGINTIME);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO begintime(Timestamp beginTime) {
        this.setBeginTime(beginTime);
        return this;
    }

    @JsonProperty(value="codeurl")
    public void setCodeUrl(String codeUrl) {
        this._set(DTOFIELD_CODEURL, codeUrl);
    }

    @JsonIgnore
    public String getCodeUrl() {
        Object objValue = this._get(DTOFIELD_CODEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeUrlDirty() {
        return this._contains(DTOFIELD_CODEURL);
    }

    @JsonIgnore
    public void resetCodeUrl() {
        this._reset(DTOFIELD_CODEURL);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO codeurl(String codeUrl) {
        this.setCodeUrl(codeUrl);
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
    public PSSFPreviewActionDTO createdate(Timestamp createDate) {
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
    public PSSFPreviewActionDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="endtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setEndTime(Timestamp endTime) {
        this._set(DTOFIELD_ENDTIME, endTime);
    }

    @JsonIgnore
    public Timestamp getEndTime() {
        Object objValue = this._get(DTOFIELD_ENDTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isEndTimeDirty() {
        return this._contains(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public void resetEndTime() {
        this._reset(DTOFIELD_ENDTIME);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO endtime(Timestamp endTime) {
        this.setEndTime(endTime);
        return this;
    }

    @JsonProperty(value="previewinfo")
    public void setPreviewInfo(String previewInfo) {
        this._set(DTOFIELD_PREVIEWINFO, previewInfo);
    }

    @JsonIgnore
    public String getPreviewInfo() {
        Object objValue = this._get(DTOFIELD_PREVIEWINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPreviewInfoDirty() {
        return this._contains(DTOFIELD_PREVIEWINFO);
    }

    @JsonIgnore
    public void resetPreviewInfo() {
        this._reset(DTOFIELD_PREVIEWINFO);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO previewinfo(String previewInfo) {
        this.setPreviewInfo(previewInfo);
        return this;
    }

    @JsonProperty(value="previewstep")
    public void setPreviewStep(String previewStep) {
        this._set(DTOFIELD_PREVIEWSTEP, previewStep);
    }

    @JsonIgnore
    public String getPreviewStep() {
        Object objValue = this._get(DTOFIELD_PREVIEWSTEP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPreviewStepDirty() {
        return this._contains(DTOFIELD_PREVIEWSTEP);
    }

    @JsonIgnore
    public void resetPreviewStep() {
        this._reset(DTOFIELD_PREVIEWSTEP);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO previewstep(String previewStep) {
        this.setPreviewStep(previewStep);
        return this;
    }

    @JsonProperty(value="previewurl")
    public void setPreviewUrl(String previewUrl) {
        this._set(DTOFIELD_PREVIEWURL, previewUrl);
    }

    @JsonIgnore
    public String getPreviewUrl() {
        Object objValue = this._get(DTOFIELD_PREVIEWURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPreviewUrlDirty() {
        return this._contains(DTOFIELD_PREVIEWURL);
    }

    @JsonIgnore
    public void resetPreviewUrl() {
        this._reset(DTOFIELD_PREVIEWURL);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO previewurl(String previewUrl) {
        this.setPreviewUrl(previewUrl);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonProperty(value="psdsconsoleid")
    public void setPSDSConsoleId(String pSDSConsoleId) {
        this._set(DTOFIELD_PSDSCONSOLEID, pSDSConsoleId);
    }

    @JsonIgnore
    public String getPSDSConsoleId() {
        Object objValue = this._get(DTOFIELD_PSDSCONSOLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDSConsoleIdDirty() {
        return this._contains(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public void resetPSDSConsoleId() {
        this._reset(DTOFIELD_PSDSCONSOLEID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO psdsconsoleid(String pSDSConsoleId) {
        this.setPSDSConsoleId(pSDSConsoleId);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSObjId(String pSObjId) {
        this._set(DTOFIELD_PSOBJID, pSObjId);
    }

    @JsonIgnore
    public String getPSObjId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSObjId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjtype")
    public void setPSObjType(String pSObjType) {
        this._set(DTOFIELD_PSOBJTYPE, pSObjType);
    }

    @JsonIgnore
    public String getPSObjType() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjTypeDirty() {
        return this._contains(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public void resetPSObjType() {
        this._reset(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO psobjtype(String pSObjType) {
        this.setPSObjType(pSObjType);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonProperty(value="pssfpreviewactionid")
    public void setPSSFPreviewActionId(String pSSFPreviewActionId) {
        this._set(DTOFIELD_PSSFPREVIEWACTIONID, pSSFPreviewActionId);
    }

    @JsonIgnore
    public String getPSSFPreviewActionId() {
        Object objValue = this._get(DTOFIELD_PSSFPREVIEWACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPreviewActionIdDirty() {
        return this._contains(DTOFIELD_PSSFPREVIEWACTIONID);
    }

    @JsonIgnore
    public void resetPSSFPreviewActionId() {
        this._reset(DTOFIELD_PSSFPREVIEWACTIONID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssfpreviewactionid(String pSSFPreviewActionId) {
        this.setPSSFPreviewActionId(pSSFPreviewActionId);
        return this;
    }

    @JsonProperty(value="pssfpreviewactionname")
    public void setPSSFPreviewActionName(String pSSFPreviewActionName) {
        this._set(DTOFIELD_PSSFPREVIEWACTIONNAME, pSSFPreviewActionName);
    }

    @JsonIgnore
    public String getPSSFPreviewActionName() {
        Object objValue = this._get(DTOFIELD_PSSFPREVIEWACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFPreviewActionNameDirty() {
        return this._contains(DTOFIELD_PSSFPREVIEWACTIONNAME);
    }

    @JsonIgnore
    public void resetPSSFPreviewActionName() {
        this._reset(DTOFIELD_PSSFPREVIEWACTIONNAME);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssfpreviewactionname(String pSSFPreviewActionName) {
        this.setPSSFPreviewActionName(pSSFPreviewActionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSFPreviewActionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSFPreviewActionName(strName);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO name(String strName) {
        this.setPSSFPreviewActionName(strName);
        return this;
    }

    @JsonProperty(value="pssfstyleid")
    public void setPSSFStyleId(String pSSFStyleId) {
        this._set(DTOFIELD_PSSFSTYLEID, pSSFStyleId);
    }

    @JsonIgnore
    public String getPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public void resetPSSFStyleId() {
        this._reset(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonProperty(value="pssyssfpubid")
    public void setPSSysSFPubId(String pSSysSFPubId) {
        this._set(DTOFIELD_PSSYSSFPUBID, pSSysSFPubId);
    }

    @JsonIgnore
    public String getPSSysSFPubId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPUBID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPubIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public void resetPSSysSFPubId() {
        this._reset(DTOFIELD_PSSYSSFPUBID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pssyssfpubid(String pSSysSFPubId) {
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    @JsonProperty(value="pstaskserverid")
    public void setPSTaskServerId(String pSTaskServerId) {
        this._set(DTOFIELD_PSTASKSERVERID, pSTaskServerId);
    }

    @JsonIgnore
    public String getPSTaskServerId() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTaskServerIdDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public void resetPSTaskServerId() {
        this._reset(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO pstaskserverid(String pSTaskServerId) {
        this.setPSTaskServerId(pSTaskServerId);
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
    public PSSFPreviewActionDTO updatedate(Timestamp updateDate) {
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
    public PSSFPreviewActionDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSFPreviewActionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSFPreviewActionId(strValue);
    }

    @JsonIgnore
    public PSSFPreviewActionDTO id(String strValue) {
        this.setPSSFPreviewActionId(strValue);
        return this;
    }
}
