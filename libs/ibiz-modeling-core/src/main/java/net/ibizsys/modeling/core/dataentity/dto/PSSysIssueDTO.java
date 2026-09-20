package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysIssueDTO
extends PSModelDTOBase {
    public static final String FIELD_CANCELDATE = "CANCELDATE";
    protected static final String DTOFIELD_CANCELDATE = "canceldate";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FINISHDATE = "FINISHDATE";
    protected static final String DTOFIELD_FINISHDATE = "finishdate";
    public static final String FIELD_ISSUEINFO = "ISSUEINFO";
    protected static final String DTOFIELD_ISSUEINFO = "issueinfo";
    public static final String FIELD_ISSUESTATE = "ISSUESTATE";
    protected static final String DTOFIELD_ISSUESTATE = "issuestate";
    public static final String FIELD_ISSUETYPE = "ISSUETYPE";
    protected static final String DTOFIELD_ISSUETYPE = "issuetype";
    public static final String FIELD_OBJTYPE = "OBJTYPE";
    protected static final String DTOFIELD_OBJTYPE = "objtype";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSOBJ2ID = "PSOBJ2ID";
    protected static final String DTOFIELD_PSOBJ2ID = "psobj2id";
    public static final String FIELD_PSOBJ2NAME = "PSOBJ2NAME";
    protected static final String DTOFIELD_PSOBJ2NAME = "psobj2name";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSISSUEID = "PSSYSISSUEID";
    protected static final String DTOFIELD_PSSYSISSUEID = "pssysissueid";
    public static final String FIELD_PSSYSISSUENAME = "PSSYSISSUENAME";
    protected static final String DTOFIELD_PSSYSISSUENAME = "pssysissuename";
    public static final String FIELD_PSSYSISSUETYPEID = "PSSYSISSUETYPEID";
    protected static final String DTOFIELD_PSSYSISSUETYPEID = "pssysissuetypeid";
    public static final String FIELD_PSSYSISSUETYPENAME = "PSSYSISSUETYPENAME";
    protected static final String DTOFIELD_PSSYSISSUETYPENAME = "pssysissuetypename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="canceldate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCancelDate(Timestamp cancelDate) {
        this._set(DTOFIELD_CANCELDATE, cancelDate);
    }

    @JsonIgnore
    public Timestamp getCancelDate() {
        Object objValue = this._get(DTOFIELD_CANCELDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isCancelDateDirty() {
        return this._contains(DTOFIELD_CANCELDATE);
    }

    @JsonIgnore
    public void resetCancelDate() {
        this._reset(DTOFIELD_CANCELDATE);
    }

    @JsonIgnore
    public PSSysIssueDTO canceldate(Timestamp cancelDate) {
        this.setCancelDate(cancelDate);
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
    public PSSysIssueDTO createdate(Timestamp createDate) {
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
    public PSSysIssueDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="finishdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setFinishDate(Timestamp finishDate) {
        this._set(DTOFIELD_FINISHDATE, finishDate);
    }

    @JsonIgnore
    public Timestamp getFinishDate() {
        Object objValue = this._get(DTOFIELD_FINISHDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isFinishDateDirty() {
        return this._contains(DTOFIELD_FINISHDATE);
    }

    @JsonIgnore
    public void resetFinishDate() {
        this._reset(DTOFIELD_FINISHDATE);
    }

    @JsonIgnore
    public PSSysIssueDTO finishdate(Timestamp finishDate) {
        this.setFinishDate(finishDate);
        return this;
    }

    @JsonProperty(value="issueinfo")
    public void setIssueInfo(String issueInfo) {
        this._set(DTOFIELD_ISSUEINFO, issueInfo);
    }

    @JsonIgnore
    public String getIssueInfo() {
        Object objValue = this._get(DTOFIELD_ISSUEINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIssueInfoDirty() {
        return this._contains(DTOFIELD_ISSUEINFO);
    }

    @JsonIgnore
    public void resetIssueInfo() {
        this._reset(DTOFIELD_ISSUEINFO);
    }

    @JsonIgnore
    public PSSysIssueDTO issueinfo(String issueInfo) {
        this.setIssueInfo(issueInfo);
        return this;
    }

    @JsonProperty(value="issuestate")
    public void setIssueState(String issueState) {
        this._set(DTOFIELD_ISSUESTATE, issueState);
    }

    @JsonIgnore
    public String getIssueState() {
        Object objValue = this._get(DTOFIELD_ISSUESTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIssueStateDirty() {
        return this._contains(DTOFIELD_ISSUESTATE);
    }

    @JsonIgnore
    public void resetIssueState() {
        this._reset(DTOFIELD_ISSUESTATE);
    }

    @JsonIgnore
    public PSSysIssueDTO issuestate(String issueState) {
        this.setIssueState(issueState);
        return this;
    }

    @JsonIgnore
    public PSSysIssueDTO issuestate(PSModelEnums.SysIssueState issueState) {
        if (issueState == null) {
            this.setIssueState(null);
        } else {
            this.setIssueState(issueState.value);
        }
        return this;
    }

    @JsonProperty(value="issuetype")
    public void setIssueType(String issueType) {
        this._set(DTOFIELD_ISSUETYPE, issueType);
    }

    @JsonIgnore
    public String getIssueType() {
        Object objValue = this._get(DTOFIELD_ISSUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIssueTypeDirty() {
        return this._contains(DTOFIELD_ISSUETYPE);
    }

    @JsonIgnore
    public void resetIssueType() {
        this._reset(DTOFIELD_ISSUETYPE);
    }

    @JsonIgnore
    public PSSysIssueDTO issuetype(String issueType) {
        this.setIssueType(issueType);
        return this;
    }

    @JsonIgnore
    public PSSysIssueDTO issuetype(PSModelEnums.SysIssueType issueType) {
        if (issueType == null) {
            this.setIssueType(null);
        } else {
            this.setIssueType(issueType.value);
        }
        return this;
    }

    @JsonProperty(value="objtype")
    public void setObjType(String objType) {
        this._set(DTOFIELD_OBJTYPE, objType);
    }

    @JsonIgnore
    public String getObjType() {
        Object objValue = this._get(DTOFIELD_OBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjTypeDirty() {
        return this._contains(DTOFIELD_OBJTYPE);
    }

    @JsonIgnore
    public void resetObjType() {
        this._reset(DTOFIELD_OBJTYPE);
    }

    @JsonIgnore
    public PSSysIssueDTO objtype(String objType) {
        this.setObjType(objType);
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
    public PSSysIssueDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysIssueDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysIssueDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSSysIssueDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="psobj2id")
    public void setPSObj2Id(String pSObj2Id) {
        this._set(DTOFIELD_PSOBJ2ID, pSObj2Id);
    }

    @JsonIgnore
    public String getPSObj2Id() {
        Object objValue = this._get(DTOFIELD_PSOBJ2ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObj2IdDirty() {
        return this._contains(DTOFIELD_PSOBJ2ID);
    }

    @JsonIgnore
    public void resetPSObj2Id() {
        this._reset(DTOFIELD_PSOBJ2ID);
    }

    @JsonIgnore
    public PSSysIssueDTO psobj2id(String pSObj2Id) {
        this.setPSObj2Id(pSObj2Id);
        return this;
    }

    @JsonProperty(value="psobj2name")
    public void setPSObj2Name(String pSObj2Name) {
        this._set(DTOFIELD_PSOBJ2NAME, pSObj2Name);
    }

    @JsonIgnore
    public String getPSObj2Name() {
        Object objValue = this._get(DTOFIELD_PSOBJ2NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObj2NameDirty() {
        return this._contains(DTOFIELD_PSOBJ2NAME);
    }

    @JsonIgnore
    public void resetPSObj2Name() {
        this._reset(DTOFIELD_PSOBJ2NAME);
    }

    @JsonIgnore
    public PSSysIssueDTO psobj2name(String pSObj2Name) {
        this.setPSObj2Name(pSObj2Name);
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
    public PSSysIssueDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSObjName(String pSObjName) {
        this._set(DTOFIELD_PSOBJNAME, pSObjName);
    }

    @JsonIgnore
    public String getPSObjName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSObjName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSSysIssueDTO psobjname(String pSObjName) {
        this.setPSObjName(pSObjName);
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
    public PSSysIssueDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSysIssueDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
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
    public PSSysIssueDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysissueid")
    public void setPSSysIssueId(String pSSysIssueId) {
        this._set(DTOFIELD_PSSYSISSUEID, pSSysIssueId);
    }

    @JsonIgnore
    public String getPSSysIssueId() {
        Object objValue = this._get(DTOFIELD_PSSYSISSUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysIssueIdDirty() {
        return this._contains(DTOFIELD_PSSYSISSUEID);
    }

    @JsonIgnore
    public void resetPSSysIssueId() {
        this._reset(DTOFIELD_PSSYSISSUEID);
    }

    @JsonIgnore
    public PSSysIssueDTO pssysissueid(String pSSysIssueId) {
        this.setPSSysIssueId(pSSysIssueId);
        return this;
    }

    @JsonProperty(value="pssysissuename")
    public void setPSSysIssueName(String pSSysIssueName) {
        this._set(DTOFIELD_PSSYSISSUENAME, pSSysIssueName);
    }

    @JsonIgnore
    public String getPSSysIssueName() {
        Object objValue = this._get(DTOFIELD_PSSYSISSUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysIssueNameDirty() {
        return this._contains(DTOFIELD_PSSYSISSUENAME);
    }

    @JsonIgnore
    public void resetPSSysIssueName() {
        this._reset(DTOFIELD_PSSYSISSUENAME);
    }

    @JsonIgnore
    public PSSysIssueDTO pssysissuename(String pSSysIssueName) {
        this.setPSSysIssueName(pSSysIssueName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysIssueName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysIssueName(strName);
    }

    @JsonIgnore
    public PSSysIssueDTO name(String strName) {
        this.setPSSysIssueName(strName);
        return this;
    }

    @JsonProperty(value="pssysissuetypeid")
    public void setPSSysIssueTypeId(String pSSysIssueTypeId) {
        this._set(DTOFIELD_PSSYSISSUETYPEID, pSSysIssueTypeId);
    }

    @JsonIgnore
    public String getPSSysIssueTypeId() {
        Object objValue = this._get(DTOFIELD_PSSYSISSUETYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysIssueTypeIdDirty() {
        return this._contains(DTOFIELD_PSSYSISSUETYPEID);
    }

    @JsonIgnore
    public void resetPSSysIssueTypeId() {
        this._reset(DTOFIELD_PSSYSISSUETYPEID);
    }

    @JsonIgnore
    public PSSysIssueDTO pssysissuetypeid(String pSSysIssueTypeId) {
        this.setPSSysIssueTypeId(pSSysIssueTypeId);
        return this;
    }

    @JsonProperty(value="pssysissuetypename")
    public void setPSSysIssueTypeName(String pSSysIssueTypeName) {
        this._set(DTOFIELD_PSSYSISSUETYPENAME, pSSysIssueTypeName);
    }

    @JsonIgnore
    public String getPSSysIssueTypeName() {
        Object objValue = this._get(DTOFIELD_PSSYSISSUETYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysIssueTypeNameDirty() {
        return this._contains(DTOFIELD_PSSYSISSUETYPENAME);
    }

    @JsonIgnore
    public void resetPSSysIssueTypeName() {
        this._reset(DTOFIELD_PSSYSISSUETYPENAME);
    }

    @JsonIgnore
    public PSSysIssueDTO pssysissuetypename(String pSSysIssueTypeName) {
        this.setPSSysIssueTypeName(pSSysIssueTypeName);
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
    public PSSysIssueDTO updatedate(Timestamp updateDate) {
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
    public PSSysIssueDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysIssueId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysIssueId(strValue);
    }

    @JsonIgnore
    public PSSysIssueDTO id(String strValue) {
        this.setPSSysIssueId(strValue);
        return this;
    }
}
