package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFProcSubWFDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EMBEDPSDEDSID = "EMBEDPSDEDSID";
    protected static final String DTOFIELD_EMBEDPSDEDSID = "embedpsdedsid";
    public static final String FIELD_EMBEDPSDEDSNAME = "EMBEDPSDEDSNAME";
    protected static final String DTOFIELD_EMBEDPSDEDSNAME = "embedpsdedsname";
    public static final String FIELD_EMBEDPSDEID = "EMBEDPSDEID";
    protected static final String DTOFIELD_EMBEDPSDEID = "embedpsdeid";
    public static final String FIELD_EMBEDPSWFDEID = "EMBEDPSWFDEID";
    protected static final String DTOFIELD_EMBEDPSWFDEID = "embedpswfdeid";
    public static final String FIELD_EMBEDPSWFDENAME = "EMBEDPSWFDENAME";
    protected static final String DTOFIELD_EMBEDPSWFDENAME = "embedpswfdename";
    public static final String FIELD_EMBEDPSWFID = "EMBEDPSWFID";
    protected static final String DTOFIELD_EMBEDPSWFID = "embedpswfid";
    public static final String FIELD_EMBEDPSWFNAME = "EMBEDPSWFNAME";
    protected static final String DTOFIELD_EMBEDPSWFNAME = "embedpswfname";
    public static final String FIELD_EMBEDPSWFVERID = "EMBEDPSWFVERID";
    protected static final String DTOFIELD_EMBEDPSWFVERID = "embedpswfverid";
    public static final String FIELD_EMBEDPSWFVERNAME = "EMBEDPSWFVERNAME";
    protected static final String DTOFIELD_EMBEDPSWFVERNAME = "embedpswfvername";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSWFID = "PSWFID";
    protected static final String DTOFIELD_PSWFID = "pswfid";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCESSNAME = "PSWFPROCESSNAME";
    protected static final String DTOFIELD_PSWFPROCESSNAME = "pswfprocessname";
    public static final String FIELD_PSWFPROCSUBWFID = "PSWFPROCSUBWFID";
    protected static final String DTOFIELD_PSWFPROCSUBWFID = "pswfprocsubwfid";
    public static final String FIELD_PSWFPROCSUBWFNAME = "PSWFPROCSUBWFNAME";
    protected static final String DTOFIELD_PSWFPROCSUBWFNAME = "pswfprocsubwfname";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
    public static final String FIELD_SUSPENDDEFAULT = "SUSPENDDEFAULT";
    protected static final String DTOFIELD_SUSPENDDEFAULT = "suspenddefault";
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
    public PSWFProcSubWFDTO codename(String codeName) {
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
    public PSWFProcSubWFDTO createdate(Timestamp createDate) {
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
    public PSWFProcSubWFDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="embedpsdedsid")
    public void setEmbedPSDEDSId(String embedPSDEDSId) {
        this._set(DTOFIELD_EMBEDPSDEDSID, embedPSDEDSId);
    }

    @JsonIgnore
    public String getEmbedPSDEDSId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEDSIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEDSID);
    }

    @JsonIgnore
    public void resetEmbedPSDEDSId() {
        this._reset(DTOFIELD_EMBEDPSDEDSID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsid(String embedPSDEDSId) {
        this.setEmbedPSDEDSId(embedPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setEmbedPSDEDSId(null);
            this.setEmbedPSDEDSName(null);
        } else {
            this.setEmbedPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setEmbedPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="embedpsdedsname")
    public void setEmbedPSDEDSName(String embedPSDEDSName) {
        this._set(DTOFIELD_EMBEDPSDEDSNAME, embedPSDEDSName);
    }

    @JsonIgnore
    public String getEmbedPSDEDSName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEDSNameDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEDSNAME);
    }

    @JsonIgnore
    public void resetEmbedPSDEDSName() {
        this._reset(DTOFIELD_EMBEDPSDEDSNAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdedsname(String embedPSDEDSName) {
        this.setEmbedPSDEDSName(embedPSDEDSName);
        return this;
    }

    @JsonProperty(value="embedpsdeid")
    public void setEmbedPSDEId(String embedPSDEId) {
        this._set(DTOFIELD_EMBEDPSDEID, embedPSDEId);
    }

    @JsonIgnore
    public String getEmbedPSDEId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSDEIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSDEID);
    }

    @JsonIgnore
    public void resetEmbedPSDEId() {
        this._reset(DTOFIELD_EMBEDPSDEID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpsdeid(String embedPSDEId) {
        this.setEmbedPSDEId(embedPSDEId);
        return this;
    }

    @JsonProperty(value="embedpswfdeid")
    public void setEmbedPSWFDEId(String embedPSWFDEId) {
        this._set(DTOFIELD_EMBEDPSWFDEID, embedPSWFDEId);
    }

    @JsonIgnore
    public String getEmbedPSWFDEId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFDEIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFDEID);
    }

    @JsonIgnore
    public void resetEmbedPSWFDEId() {
        this._reset(DTOFIELD_EMBEDPSWFDEID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfdeid(String embedPSWFDEId) {
        this.setEmbedPSWFDEId(embedPSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setEmbedPSDEId(null);
            this.setEmbedPSWFDEId(null);
            this.setEmbedPSWFDEName(null);
        } else {
            this.setEmbedPSDEId(pSWFDE.getPSDEId());
            this.setEmbedPSWFDEId(pSWFDE.getPSWFDEId());
            this.setEmbedPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    @JsonProperty(value="embedpswfdename")
    public void setEmbedPSWFDEName(String embedPSWFDEName) {
        this._set(DTOFIELD_EMBEDPSWFDENAME, embedPSWFDEName);
    }

    @JsonIgnore
    public String getEmbedPSWFDEName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFDENameDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFDENAME);
    }

    @JsonIgnore
    public void resetEmbedPSWFDEName() {
        this._reset(DTOFIELD_EMBEDPSWFDENAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfdename(String embedPSWFDEName) {
        this.setEmbedPSWFDEName(embedPSWFDEName);
        return this;
    }

    @JsonProperty(value="embedpswfid")
    public void setEmbedPSWFId(String embedPSWFId) {
        this._set(DTOFIELD_EMBEDPSWFID, embedPSWFId);
    }

    @JsonIgnore
    public String getEmbedPSWFId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFID);
    }

    @JsonIgnore
    public void resetEmbedPSWFId() {
        this._reset(DTOFIELD_EMBEDPSWFID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfid(String embedPSWFId) {
        this.setEmbedPSWFId(embedPSWFId);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setEmbedPSWFId(null);
            this.setEmbedPSWFName(null);
        } else {
            this.setEmbedPSWFId(pSWorkflow.getPSWorkflowId());
            this.setEmbedPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="embedpswfname")
    public void setEmbedPSWFName(String embedPSWFName) {
        this._set(DTOFIELD_EMBEDPSWFNAME, embedPSWFName);
    }

    @JsonIgnore
    public String getEmbedPSWFName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFNameDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFNAME);
    }

    @JsonIgnore
    public void resetEmbedPSWFName() {
        this._reset(DTOFIELD_EMBEDPSWFNAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfname(String embedPSWFName) {
        this.setEmbedPSWFName(embedPSWFName);
        return this;
    }

    @JsonProperty(value="embedpswfverid")
    public void setEmbedPSWFVerId(String embedPSWFVerId) {
        this._set(DTOFIELD_EMBEDPSWFVERID, embedPSWFVerId);
    }

    @JsonIgnore
    public String getEmbedPSWFVerId() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFVERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFVerIdDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFVERID);
    }

    @JsonIgnore
    public void resetEmbedPSWFVerId() {
        this._reset(DTOFIELD_EMBEDPSWFVERID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfverid(String embedPSWFVerId) {
        this.setEmbedPSWFVerId(embedPSWFVerId);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfverid(PSWFVersionDTO pSWFVersion) {
        if (pSWFVersion == null) {
            this.setEmbedPSWFVerId(null);
            this.setEmbedPSWFVerName(null);
        } else {
            this.setEmbedPSWFVerId(pSWFVersion.getPSWFVersionId());
            this.setEmbedPSWFVerName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    @JsonProperty(value="embedpswfvername")
    public void setEmbedPSWFVerName(String embedPSWFVerName) {
        this._set(DTOFIELD_EMBEDPSWFVERNAME, embedPSWFVerName);
    }

    @JsonIgnore
    public String getEmbedPSWFVerName() {
        Object objValue = this._get(DTOFIELD_EMBEDPSWFVERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmbedPSWFVerNameDirty() {
        return this._contains(DTOFIELD_EMBEDPSWFVERNAME);
    }

    @JsonIgnore
    public void resetEmbedPSWFVerName() {
        this._reset(DTOFIELD_EMBEDPSWFVERNAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO embedpswfvername(String embedPSWFVerName) {
        this.setEmbedPSWFVerName(embedPSWFVerName);
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
    public PSWFProcSubWFDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pswfid")
    public void setPSWFId(String pSWFId) {
        this._set(DTOFIELD_PSWFID, pSWFId);
    }

    @JsonIgnore
    public String getPSWFId() {
        Object objValue = this._get(DTOFIELD_PSWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFIdDirty() {
        return this._contains(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public void resetPSWFId() {
        this._reset(DTOFIELD_PSWFID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfid(String pSWFId) {
        this.setPSWFId(pSWFId);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessid(PSWFProcessDTO pSWFProcess) {
        if (pSWFProcess == null) {
            this.setPSWFId(null);
            this.setPSWFProcessId(null);
            this.setPSWFProcessName(null);
            this.setPSWFVersionId(null);
        } else {
            this.setPSWFId(pSWFProcess.getPSWFId());
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
            this.setPSWFProcessName(pSWFProcess.getPSWFProcessName());
            this.setPSWFVersionId(pSWFProcess.getPSWFVersionId());
        }
        return this;
    }

    @JsonProperty(value="pswfprocessname")
    public void setPSWFProcessName(String pSWFProcessName) {
        this._set(DTOFIELD_PSWFPROCESSNAME, pSWFProcessName);
    }

    @JsonIgnore
    public String getPSWFProcessName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public void resetPSWFProcessName() {
        this._reset(DTOFIELD_PSWFPROCESSNAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocessname(String pSWFProcessName) {
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    @JsonProperty(value="pswfprocsubwfid")
    public void setPSWFProcSubWFId(String pSWFProcSubWFId) {
        this._set(DTOFIELD_PSWFPROCSUBWFID, pSWFProcSubWFId);
    }

    @JsonIgnore
    public String getPSWFProcSubWFId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCSUBWFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcSubWFIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCSUBWFID);
    }

    @JsonIgnore
    public void resetPSWFProcSubWFId() {
        this._reset(DTOFIELD_PSWFPROCSUBWFID);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocsubwfid(String pSWFProcSubWFId) {
        this.setPSWFProcSubWFId(pSWFProcSubWFId);
        return this;
    }

    @JsonProperty(value="pswfprocsubwfname")
    public void setPSWFProcSubWFName(String pSWFProcSubWFName) {
        this._set(DTOFIELD_PSWFPROCSUBWFNAME, pSWFProcSubWFName);
    }

    @JsonIgnore
    public String getPSWFProcSubWFName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCSUBWFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcSubWFNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCSUBWFNAME);
    }

    @JsonIgnore
    public void resetPSWFProcSubWFName() {
        this._reset(DTOFIELD_PSWFPROCSUBWFNAME);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO pswfprocsubwfname(String pSWFProcSubWFName) {
        this.setPSWFProcSubWFName(pSWFProcSubWFName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFProcSubWFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFProcSubWFName(strName);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO name(String strName) {
        this.setPSWFProcSubWFName(strName);
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
    public PSWFProcSubWFDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    @JsonProperty(value="suspenddefault")
    public void setSuspendDefault(Integer suspendDefault) {
        this._set(DTOFIELD_SUSPENDDEFAULT, suspendDefault);
    }

    @JsonIgnore
    public Integer getSuspendDefault() {
        Object objValue = this._get(DTOFIELD_SUSPENDDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSuspendDefaultDirty() {
        return this._contains(DTOFIELD_SUSPENDDEFAULT);
    }

    @JsonIgnore
    public void resetSuspendDefault() {
        this._reset(DTOFIELD_SUSPENDDEFAULT);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO suspenddefault(Integer suspendDefault) {
        this.setSuspendDefault(suspendDefault);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO suspenddefault(Boolean suspendDefault) {
        if (suspendDefault == null) {
            this.setSuspendDefault(null);
        } else {
            this.setSuspendDefault(suspendDefault != false ? 1 : 0);
        }
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
    public PSWFProcSubWFDTO updatedate(Timestamp updateDate) {
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
    public PSWFProcSubWFDTO updateman(String updateMan) {
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
    public PSWFProcSubWFDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSWFProcSubWFDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSWFProcSubWFDTO userdata(String userData) {
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
    public PSWFProcSubWFDTO userdata2(String userData2) {
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
    public PSWFProcSubWFDTO usertag(String userTag) {
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
    public PSWFProcSubWFDTO usertag2(String userTag2) {
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
    public PSWFProcSubWFDTO usertag3(String userTag3) {
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
    public PSWFProcSubWFDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFProcSubWFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFProcSubWFId(strValue);
    }

    @JsonIgnore
    public PSWFProcSubWFDTO id(String strValue) {
        this.setPSWFProcSubWFId(strValue);
        return this;
    }
}
