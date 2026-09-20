package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEUtilDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUTILID = "PSDEUTILDEID";
    protected static final String DTOFIELD_PSDEUTILID = "psdeutilid";
    public static final String FIELD_PSDEUTILNAME = "PSDEUTILDENAME";
    protected static final String DTOFIELD_PSDEUTILNAME = "psdeutilname";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
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
    public static final String FIELD_UTILOBJ = "UTILOBJ";
    protected static final String DTOFIELD_UTILOBJ = "utilobj";
    public static final String FIELD_UTILPARAM = "UTILPARAM";
    protected static final String DTOFIELD_UTILPARAM = "utilparam";
    public static final String FIELD_UTILPARAM10 = "UTILPARAM10";
    protected static final String DTOFIELD_UTILPARAM10 = "utilparam10";
    public static final String FIELD_UTILPARAM11 = "UTILPARAM11";
    protected static final String DTOFIELD_UTILPARAM11 = "utilparam11";
    public static final String FIELD_UTILPARAM12 = "UTILPARAM12";
    protected static final String DTOFIELD_UTILPARAM12 = "utilparam12";
    public static final String FIELD_UTILPARAM2 = "UTILPARAM2";
    protected static final String DTOFIELD_UTILPARAM2 = "utilparam2";
    public static final String FIELD_UTILPARAM3 = "UTILPARAM3";
    protected static final String DTOFIELD_UTILPARAM3 = "utilparam3";
    public static final String FIELD_UTILPARAM4 = "UTILPARAM4";
    protected static final String DTOFIELD_UTILPARAM4 = "utilparam4";
    public static final String FIELD_UTILPARAM5 = "UTILPARAM5";
    protected static final String DTOFIELD_UTILPARAM5 = "utilparam5";
    public static final String FIELD_UTILPARAM6 = "UTILPARAM6";
    protected static final String DTOFIELD_UTILPARAM6 = "utilparam6";
    public static final String FIELD_UTILPARAM7 = "UTILPARAM7";
    protected static final String DTOFIELD_UTILPARAM7 = "utilparam7";
    public static final String FIELD_UTILPARAM8 = "UTILPARAM8";
    protected static final String DTOFIELD_UTILPARAM8 = "utilparam8";
    public static final String FIELD_UTILPARAM9 = "UTILPARAM9";
    protected static final String DTOFIELD_UTILPARAM9 = "utilparam9";
    public static final String FIELD_UTILPARAMS = "UTILPARAMS";
    protected static final String DTOFIELD_UTILPARAMS = "utilparams";
    public static final String FIELD_UTILPSDE10ID = "UTILPSDE10ID";
    protected static final String DTOFIELD_UTILPSDE10ID = "utilpsde10id";
    public static final String FIELD_UTILPSDE10NAME = "UTILPSDE10NAME";
    protected static final String DTOFIELD_UTILPSDE10NAME = "utilpsde10name";
    public static final String FIELD_UTILPSDE11ID = "UTILPSDE11ID";
    protected static final String DTOFIELD_UTILPSDE11ID = "utilpsde11id";
    public static final String FIELD_UTILPSDE11NAME = "UTILPSDE11NAME";
    protected static final String DTOFIELD_UTILPSDE11NAME = "utilpsde11name";
    public static final String FIELD_UTILPSDE12ID = "UTILPSDE12ID";
    protected static final String DTOFIELD_UTILPSDE12ID = "utilpsde12id";
    public static final String FIELD_UTILPSDE12NAME = "UTILPSDE12NAME";
    protected static final String DTOFIELD_UTILPSDE12NAME = "utilpsde12name";
    public static final String FIELD_UTILPSDE13ID = "UTILPSDE13ID";
    protected static final String DTOFIELD_UTILPSDE13ID = "utilpsde13id";
    public static final String FIELD_UTILPSDE13NAME = "UTILPSDE13NAME";
    protected static final String DTOFIELD_UTILPSDE13NAME = "utilpsde13name";
    public static final String FIELD_UTILPSDE14ID = "UTILPSDE14ID";
    protected static final String DTOFIELD_UTILPSDE14ID = "utilpsde14id";
    public static final String FIELD_UTILPSDE14NAME = "UTILPSDE14NAME";
    protected static final String DTOFIELD_UTILPSDE14NAME = "utilpsde14name";
    public static final String FIELD_UTILPSDE15ID = "UTILPSDE15ID";
    protected static final String DTOFIELD_UTILPSDE15ID = "utilpsde15id";
    public static final String FIELD_UTILPSDE15NAME = "UTILPSDE15NAME";
    protected static final String DTOFIELD_UTILPSDE15NAME = "utilpsde15name";
    public static final String FIELD_UTILPSDE16ID = "UTILPSDE16ID";
    protected static final String DTOFIELD_UTILPSDE16ID = "utilpsde16id";
    public static final String FIELD_UTILPSDE16NAME = "UTILPSDE16NAME";
    protected static final String DTOFIELD_UTILPSDE16NAME = "utilpsde16name";
    public static final String FIELD_UTILPSDE17ID = "UTILPSDE17ID";
    protected static final String DTOFIELD_UTILPSDE17ID = "utilpsde17id";
    public static final String FIELD_UTILPSDE17NAME = "UTILPSDE17NAME";
    protected static final String DTOFIELD_UTILPSDE17NAME = "utilpsde17name";
    public static final String FIELD_UTILPSDE18ID = "UTILPSDE18ID";
    protected static final String DTOFIELD_UTILPSDE18ID = "utilpsde18id";
    public static final String FIELD_UTILPSDE18NAME = "UTILPSDE18NAME";
    protected static final String DTOFIELD_UTILPSDE18NAME = "utilpsde18name";
    public static final String FIELD_UTILPSDE19ID = "UTILPSDE19ID";
    protected static final String DTOFIELD_UTILPSDE19ID = "utilpsde19id";
    public static final String FIELD_UTILPSDE19NAME = "UTILPSDE19NAME";
    protected static final String DTOFIELD_UTILPSDE19NAME = "utilpsde19name";
    public static final String FIELD_UTILPSDE20ID = "UTILPSDE20ID";
    protected static final String DTOFIELD_UTILPSDE20ID = "utilpsde20id";
    public static final String FIELD_UTILPSDE20NAME = "UTILPSDE20NAME";
    protected static final String DTOFIELD_UTILPSDE20NAME = "utilpsde20name";
    public static final String FIELD_UTILPSDE2ID = "UTILPSDE2ID";
    protected static final String DTOFIELD_UTILPSDE2ID = "utilpsde2id";
    public static final String FIELD_UTILPSDE2NAME = "UTILPSDE2NAME";
    protected static final String DTOFIELD_UTILPSDE2NAME = "utilpsde2name";
    public static final String FIELD_UTILPSDE3ID = "UTILPSDE3ID";
    protected static final String DTOFIELD_UTILPSDE3ID = "utilpsde3id";
    public static final String FIELD_UTILPSDE3NAME = "UTILPSDE3NAME";
    protected static final String DTOFIELD_UTILPSDE3NAME = "utilpsde3name";
    public static final String FIELD_UTILPSDE4ID = "UTILPSDE4ID";
    protected static final String DTOFIELD_UTILPSDE4ID = "utilpsde4id";
    public static final String FIELD_UTILPSDE4NAME = "UTILPSDE4NAME";
    protected static final String DTOFIELD_UTILPSDE4NAME = "utilpsde4name";
    public static final String FIELD_UTILPSDE5ID = "UTILPSDE5ID";
    protected static final String DTOFIELD_UTILPSDE5ID = "utilpsde5id";
    public static final String FIELD_UTILPSDE5NAME = "UTILPSDE5NAME";
    protected static final String DTOFIELD_UTILPSDE5NAME = "utilpsde5name";
    public static final String FIELD_UTILPSDE6ID = "UTILPSDE6ID";
    protected static final String DTOFIELD_UTILPSDE6ID = "utilpsde6id";
    public static final String FIELD_UTILPSDE6NAME = "UTILPSDE6NAME";
    protected static final String DTOFIELD_UTILPSDE6NAME = "utilpsde6name";
    public static final String FIELD_UTILPSDE7ID = "UTILPSDE7ID";
    protected static final String DTOFIELD_UTILPSDE7ID = "utilpsde7id";
    public static final String FIELD_UTILPSDE7NAME = "UTILPSDE7NAME";
    protected static final String DTOFIELD_UTILPSDE7NAME = "utilpsde7name";
    public static final String FIELD_UTILPSDE8ID = "UTILPSDE8ID";
    protected static final String DTOFIELD_UTILPSDE8ID = "utilpsde8id";
    public static final String FIELD_UTILPSDE8NAME = "UTILPSDE8NAME";
    protected static final String DTOFIELD_UTILPSDE8NAME = "utilpsde8name";
    public static final String FIELD_UTILPSDE9ID = "UTILPSDE9ID";
    protected static final String DTOFIELD_UTILPSDE9ID = "utilpsde9id";
    public static final String FIELD_UTILPSDE9NAME = "UTILPSDE9NAME";
    protected static final String DTOFIELD_UTILPSDE9NAME = "utilpsde9name";
    public static final String FIELD_UTILPSDEID = "UTILPSDEID";
    protected static final String DTOFIELD_UTILPSDEID = "utilpsdeid";
    public static final String FIELD_UTILPSDENAME = "UTILPSDENAME";
    protected static final String DTOFIELD_UTILPSDENAME = "utilpsdename";
    public static final String FIELD_UTILTAG = "UTILTAG";
    protected static final String DTOFIELD_UTILTAG = "utiltag";
    public static final String FIELD_UTILTAG2 = "UTILTAG2";
    protected static final String DTOFIELD_UTILTAG2 = "utiltag2";
    public static final String FIELD_UTILTYPE = "UTILTYPE";
    protected static final String DTOFIELD_UTILTYPE = "utiltype";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSDEUtilDTO codename(String codeName) {
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
    public PSDEUtilDTO createdate(Timestamp createDate) {
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
    public PSDEUtilDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEUtilDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
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
    public PSDEUtilDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEUtilDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEUtilDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeutilid")
    public void setPSDEUtilId(String pSDEUtilId) {
        this._set(DTOFIELD_PSDEUTILID, pSDEUtilId);
        this._set(FIELD_PSDEUTILID, pSDEUtilId);
    }

    @JsonIgnore
    public String getPSDEUtilId() {
        Object objValue = this._get(DTOFIELD_PSDEUTILID);
        if (objValue == null && (objValue = this._get(FIELD_PSDEUTILID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUtilIdDirty() {
        if (this._contains(DTOFIELD_PSDEUTILID)) {
            return true;
        }
        return this._contains(FIELD_PSDEUTILID);
    }

    @JsonIgnore
    public void resetPSDEUtilId() {
        this._reset(DTOFIELD_PSDEUTILID);
        this._reset(FIELD_PSDEUTILID);
    }

    @JsonIgnore
    public PSDEUtilDTO psdeutilid(String pSDEUtilId) {
        this.setPSDEUtilId(pSDEUtilId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDEUtilDEId() {
        return this.getPSDEUtilId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSDEUtilDEId(String pSDEUtilDEId) {
        this.setPSDEUtilId(pSDEUtilDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDEUtilDEIdDirty() {
        return this.isPSDEUtilIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDEUtilDEId() {
        this.resetPSDEUtilId();
    }

    @JsonProperty(value="psdeutilname")
    public void setPSDEUtilName(String pSDEUtilName) {
        this._set(DTOFIELD_PSDEUTILNAME, pSDEUtilName);
        this._set(FIELD_PSDEUTILNAME, pSDEUtilName);
    }

    @JsonIgnore
    public String getPSDEUtilName() {
        Object objValue = this._get(DTOFIELD_PSDEUTILNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSDEUTILNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUtilNameDirty() {
        if (this._contains(DTOFIELD_PSDEUTILNAME)) {
            return true;
        }
        return this._contains(FIELD_PSDEUTILNAME);
    }

    @JsonIgnore
    public void resetPSDEUtilName() {
        this._reset(DTOFIELD_PSDEUTILNAME);
        this._reset(FIELD_PSDEUTILNAME);
    }

    @JsonIgnore
    public PSDEUtilDTO psdeutilname(String pSDEUtilName) {
        this.setPSDEUtilName(pSDEUtilName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDEUtilDEName() {
        return this.getPSDEUtilName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSDEUtilDEName(String pSDEUtilDEName) {
        this.setPSDEUtilName(pSDEUtilDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDEUtilDENameDirty() {
        return this.isPSDEUtilNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDEUtilDEName() {
        this.resetPSDEUtilName();
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEUtilName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEUtilName(strName);
    }

    @JsonIgnore
    public PSDEUtilDTO name(String strName) {
        this.setPSDEUtilName(strName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSDEUtilDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
        if (pSSubSysServiceAPI == null) {
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        } else {
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIName() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSDEUtilDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
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
    public PSDEUtilDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEUtilDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDEUtilDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEUtilDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSDEUtilDTO updatedate(Timestamp updateDate) {
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
    public PSDEUtilDTO updateman(String updateMan) {
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
    public PSDEUtilDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEUtilDTO usertag(String userTag) {
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
    public PSDEUtilDTO usertag2(String userTag2) {
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
    public PSDEUtilDTO usertag3(String userTag3) {
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
    public PSDEUtilDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="utilobj")
    public void setUtilObj(String utilObj) {
        this._set(DTOFIELD_UTILOBJ, utilObj);
    }

    @JsonIgnore
    public String getUtilObj() {
        Object objValue = this._get(DTOFIELD_UTILOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilObjDirty() {
        return this._contains(DTOFIELD_UTILOBJ);
    }

    @JsonIgnore
    public void resetUtilObj() {
        this._reset(DTOFIELD_UTILOBJ);
    }

    @JsonIgnore
    public PSDEUtilDTO utilobj(String utilObj) {
        this.setUtilObj(utilObj);
        return this;
    }

    @JsonProperty(value="utilparam")
    public void setUtilParam(String utilParam) {
        this._set(DTOFIELD_UTILPARAM, utilParam);
    }

    @JsonIgnore
    public String getUtilParam() {
        Object objValue = this._get(DTOFIELD_UTILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParamDirty() {
        return this._contains(DTOFIELD_UTILPARAM);
    }

    @JsonIgnore
    public void resetUtilParam() {
        this._reset(DTOFIELD_UTILPARAM);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam(String utilParam) {
        this.setUtilParam(utilParam);
        return this;
    }

    @JsonProperty(value="utilparam10")
    public void setUtilParam10(Integer utilParam10) {
        this._set(DTOFIELD_UTILPARAM10, utilParam10);
    }

    @JsonIgnore
    public Integer getUtilParam10() {
        Object objValue = this._get(DTOFIELD_UTILPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam10Dirty() {
        return this._contains(DTOFIELD_UTILPARAM10);
    }

    @JsonIgnore
    public void resetUtilParam10() {
        this._reset(DTOFIELD_UTILPARAM10);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam10(Integer utilParam10) {
        this.setUtilParam10(utilParam10);
        return this;
    }

    @JsonProperty(value="utilparam11")
    public void setUtilParam11(String utilParam11) {
        this._set(DTOFIELD_UTILPARAM11, utilParam11);
    }

    @JsonIgnore
    public String getUtilParam11() {
        Object objValue = this._get(DTOFIELD_UTILPARAM11);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam11Dirty() {
        return this._contains(DTOFIELD_UTILPARAM11);
    }

    @JsonIgnore
    public void resetUtilParam11() {
        this._reset(DTOFIELD_UTILPARAM11);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam11(String utilParam11) {
        this.setUtilParam11(utilParam11);
        return this;
    }

    @JsonProperty(value="utilparam12")
    public void setUtilParam12(String utilParam12) {
        this._set(DTOFIELD_UTILPARAM12, utilParam12);
    }

    @JsonIgnore
    public String getUtilParam12() {
        Object objValue = this._get(DTOFIELD_UTILPARAM12);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam12Dirty() {
        return this._contains(DTOFIELD_UTILPARAM12);
    }

    @JsonIgnore
    public void resetUtilParam12() {
        this._reset(DTOFIELD_UTILPARAM12);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam12(String utilParam12) {
        this.setUtilParam12(utilParam12);
        return this;
    }

    @JsonProperty(value="utilparam2")
    public void setUtilParam2(String utilParam2) {
        this._set(DTOFIELD_UTILPARAM2, utilParam2);
    }

    @JsonIgnore
    public String getUtilParam2() {
        Object objValue = this._get(DTOFIELD_UTILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam2Dirty() {
        return this._contains(DTOFIELD_UTILPARAM2);
    }

    @JsonIgnore
    public void resetUtilParam2() {
        this._reset(DTOFIELD_UTILPARAM2);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam2(String utilParam2) {
        this.setUtilParam2(utilParam2);
        return this;
    }

    @JsonProperty(value="utilparam3")
    public void setUtilParam3(String utilParam3) {
        this._set(DTOFIELD_UTILPARAM3, utilParam3);
    }

    @JsonIgnore
    public String getUtilParam3() {
        Object objValue = this._get(DTOFIELD_UTILPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam3Dirty() {
        return this._contains(DTOFIELD_UTILPARAM3);
    }

    @JsonIgnore
    public void resetUtilParam3() {
        this._reset(DTOFIELD_UTILPARAM3);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam3(String utilParam3) {
        this.setUtilParam3(utilParam3);
        return this;
    }

    @JsonProperty(value="utilparam4")
    public void setUtilParam4(String utilParam4) {
        this._set(DTOFIELD_UTILPARAM4, utilParam4);
    }

    @JsonIgnore
    public String getUtilParam4() {
        Object objValue = this._get(DTOFIELD_UTILPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam4Dirty() {
        return this._contains(DTOFIELD_UTILPARAM4);
    }

    @JsonIgnore
    public void resetUtilParam4() {
        this._reset(DTOFIELD_UTILPARAM4);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam4(String utilParam4) {
        this.setUtilParam4(utilParam4);
        return this;
    }

    @JsonProperty(value="utilparam5")
    public void setUtilParam5(Integer utilParam5) {
        this._set(DTOFIELD_UTILPARAM5, utilParam5);
    }

    @JsonIgnore
    public Integer getUtilParam5() {
        Object objValue = this._get(DTOFIELD_UTILPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam5Dirty() {
        return this._contains(DTOFIELD_UTILPARAM5);
    }

    @JsonIgnore
    public void resetUtilParam5() {
        this._reset(DTOFIELD_UTILPARAM5);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam5(Integer utilParam5) {
        this.setUtilParam5(utilParam5);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam5(Boolean utilParam5) {
        if (utilParam5 == null) {
            this.setUtilParam5(null);
        } else {
            this.setUtilParam5(utilParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="utilparam6")
    public void setUtilParam6(Integer utilParam6) {
        this._set(DTOFIELD_UTILPARAM6, utilParam6);
    }

    @JsonIgnore
    public Integer getUtilParam6() {
        Object objValue = this._get(DTOFIELD_UTILPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam6Dirty() {
        return this._contains(DTOFIELD_UTILPARAM6);
    }

    @JsonIgnore
    public void resetUtilParam6() {
        this._reset(DTOFIELD_UTILPARAM6);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam6(Integer utilParam6) {
        this.setUtilParam6(utilParam6);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam6(Boolean utilParam6) {
        if (utilParam6 == null) {
            this.setUtilParam6(null);
        } else {
            this.setUtilParam6(utilParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="utilparam7")
    public void setUtilParam7(Integer utilParam7) {
        this._set(DTOFIELD_UTILPARAM7, utilParam7);
    }

    @JsonIgnore
    public Integer getUtilParam7() {
        Object objValue = this._get(DTOFIELD_UTILPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam7Dirty() {
        return this._contains(DTOFIELD_UTILPARAM7);
    }

    @JsonIgnore
    public void resetUtilParam7() {
        this._reset(DTOFIELD_UTILPARAM7);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam7(Integer utilParam7) {
        this.setUtilParam7(utilParam7);
        return this;
    }

    @JsonProperty(value="utilparam8")
    public void setUtilParam8(Integer utilParam8) {
        this._set(DTOFIELD_UTILPARAM8, utilParam8);
    }

    @JsonIgnore
    public Integer getUtilParam8() {
        Object objValue = this._get(DTOFIELD_UTILPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam8Dirty() {
        return this._contains(DTOFIELD_UTILPARAM8);
    }

    @JsonIgnore
    public void resetUtilParam8() {
        this._reset(DTOFIELD_UTILPARAM8);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam8(Integer utilParam8) {
        this.setUtilParam8(utilParam8);
        return this;
    }

    @JsonProperty(value="utilparam9")
    public void setUtilParam9(Integer utilParam9) {
        this._set(DTOFIELD_UTILPARAM9, utilParam9);
    }

    @JsonIgnore
    public Integer getUtilParam9() {
        Object objValue = this._get(DTOFIELD_UTILPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUtilParam9Dirty() {
        return this._contains(DTOFIELD_UTILPARAM9);
    }

    @JsonIgnore
    public void resetUtilParam9() {
        this._reset(DTOFIELD_UTILPARAM9);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparam9(Integer utilParam9) {
        this.setUtilParam9(utilParam9);
        return this;
    }

    @JsonProperty(value="utilparams")
    public void setUtilParams(String utilParams) {
        this._set(DTOFIELD_UTILPARAMS, utilParams);
    }

    @JsonIgnore
    public String getUtilParams() {
        Object objValue = this._get(DTOFIELD_UTILPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilParamsDirty() {
        return this._contains(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public void resetUtilParams() {
        this._reset(DTOFIELD_UTILPARAMS);
    }

    @JsonIgnore
    public PSDEUtilDTO utilparams(String utilParams) {
        this.setUtilParams(utilParams);
        return this;
    }

    @JsonProperty(value="utilpsde10id")
    public void setUtilPSDE10Id(String utilPSDE10Id) {
        this._set(DTOFIELD_UTILPSDE10ID, utilPSDE10Id);
    }

    @JsonIgnore
    public String getUtilPSDE10Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE10ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE10IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE10ID);
    }

    @JsonIgnore
    public void resetUtilPSDE10Id() {
        this._reset(DTOFIELD_UTILPSDE10ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde10id(String utilPSDE10Id) {
        this.setUtilPSDE10Id(utilPSDE10Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde10id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE10Id(null);
            this.setUtilPSDE10Name(null);
        } else {
            this.setUtilPSDE10Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE10Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde10name")
    public void setUtilPSDE10Name(String utilPSDE10Name) {
        this._set(DTOFIELD_UTILPSDE10NAME, utilPSDE10Name);
    }

    @JsonIgnore
    public String getUtilPSDE10Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE10NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE10NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE10NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE10Name() {
        this._reset(DTOFIELD_UTILPSDE10NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde10name(String utilPSDE10Name) {
        this.setUtilPSDE10Name(utilPSDE10Name);
        return this;
    }

    @JsonProperty(value="utilpsde11id")
    public void setUtilPSDE11Id(String utilPSDE11Id) {
        this._set(DTOFIELD_UTILPSDE11ID, utilPSDE11Id);
    }

    @JsonIgnore
    public String getUtilPSDE11Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE11ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE11IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE11ID);
    }

    @JsonIgnore
    public void resetUtilPSDE11Id() {
        this._reset(DTOFIELD_UTILPSDE11ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde11id(String utilPSDE11Id) {
        this.setUtilPSDE11Id(utilPSDE11Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde11id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE11Id(null);
            this.setUtilPSDE11Name(null);
        } else {
            this.setUtilPSDE11Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE11Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde11name")
    public void setUtilPSDE11Name(String utilPSDE11Name) {
        this._set(DTOFIELD_UTILPSDE11NAME, utilPSDE11Name);
    }

    @JsonIgnore
    public String getUtilPSDE11Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE11NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE11NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE11NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE11Name() {
        this._reset(DTOFIELD_UTILPSDE11NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde11name(String utilPSDE11Name) {
        this.setUtilPSDE11Name(utilPSDE11Name);
        return this;
    }

    @JsonProperty(value="utilpsde12id")
    public void setUtilPSDE12Id(String utilPSDE12Id) {
        this._set(DTOFIELD_UTILPSDE12ID, utilPSDE12Id);
    }

    @JsonIgnore
    public String getUtilPSDE12Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE12ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE12IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE12ID);
    }

    @JsonIgnore
    public void resetUtilPSDE12Id() {
        this._reset(DTOFIELD_UTILPSDE12ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde12id(String utilPSDE12Id) {
        this.setUtilPSDE12Id(utilPSDE12Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde12id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE12Id(null);
            this.setUtilPSDE12Name(null);
        } else {
            this.setUtilPSDE12Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE12Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde12name")
    public void setUtilPSDE12Name(String utilPSDE12Name) {
        this._set(DTOFIELD_UTILPSDE12NAME, utilPSDE12Name);
    }

    @JsonIgnore
    public String getUtilPSDE12Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE12NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE12NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE12NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE12Name() {
        this._reset(DTOFIELD_UTILPSDE12NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde12name(String utilPSDE12Name) {
        this.setUtilPSDE12Name(utilPSDE12Name);
        return this;
    }

    @JsonProperty(value="utilpsde13id")
    public void setUtilPSDE13Id(String utilPSDE13Id) {
        this._set(DTOFIELD_UTILPSDE13ID, utilPSDE13Id);
    }

    @JsonIgnore
    public String getUtilPSDE13Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE13ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE13IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE13ID);
    }

    @JsonIgnore
    public void resetUtilPSDE13Id() {
        this._reset(DTOFIELD_UTILPSDE13ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde13id(String utilPSDE13Id) {
        this.setUtilPSDE13Id(utilPSDE13Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde13id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE13Id(null);
            this.setUtilPSDE13Name(null);
        } else {
            this.setUtilPSDE13Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE13Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde13name")
    public void setUtilPSDE13Name(String utilPSDE13Name) {
        this._set(DTOFIELD_UTILPSDE13NAME, utilPSDE13Name);
    }

    @JsonIgnore
    public String getUtilPSDE13Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE13NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE13NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE13NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE13Name() {
        this._reset(DTOFIELD_UTILPSDE13NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde13name(String utilPSDE13Name) {
        this.setUtilPSDE13Name(utilPSDE13Name);
        return this;
    }

    @JsonProperty(value="utilpsde14id")
    public void setUtilPSDE14Id(String utilPSDE14Id) {
        this._set(DTOFIELD_UTILPSDE14ID, utilPSDE14Id);
    }

    @JsonIgnore
    public String getUtilPSDE14Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE14ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE14IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE14ID);
    }

    @JsonIgnore
    public void resetUtilPSDE14Id() {
        this._reset(DTOFIELD_UTILPSDE14ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde14id(String utilPSDE14Id) {
        this.setUtilPSDE14Id(utilPSDE14Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde14id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE14Id(null);
            this.setUtilPSDE14Name(null);
        } else {
            this.setUtilPSDE14Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE14Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde14name")
    public void setUtilPSDE14Name(String utilPSDE14Name) {
        this._set(DTOFIELD_UTILPSDE14NAME, utilPSDE14Name);
    }

    @JsonIgnore
    public String getUtilPSDE14Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE14NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE14NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE14NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE14Name() {
        this._reset(DTOFIELD_UTILPSDE14NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde14name(String utilPSDE14Name) {
        this.setUtilPSDE14Name(utilPSDE14Name);
        return this;
    }

    @JsonProperty(value="utilpsde15id")
    public void setUtilPSDE15Id(String utilPSDE15Id) {
        this._set(DTOFIELD_UTILPSDE15ID, utilPSDE15Id);
    }

    @JsonIgnore
    public String getUtilPSDE15Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE15ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE15IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE15ID);
    }

    @JsonIgnore
    public void resetUtilPSDE15Id() {
        this._reset(DTOFIELD_UTILPSDE15ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde15id(String utilPSDE15Id) {
        this.setUtilPSDE15Id(utilPSDE15Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde15id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE15Id(null);
            this.setUtilPSDE15Name(null);
        } else {
            this.setUtilPSDE15Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE15Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde15name")
    public void setUtilPSDE15Name(String utilPSDE15Name) {
        this._set(DTOFIELD_UTILPSDE15NAME, utilPSDE15Name);
    }

    @JsonIgnore
    public String getUtilPSDE15Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE15NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE15NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE15NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE15Name() {
        this._reset(DTOFIELD_UTILPSDE15NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde15name(String utilPSDE15Name) {
        this.setUtilPSDE15Name(utilPSDE15Name);
        return this;
    }

    @JsonProperty(value="utilpsde16id")
    public void setUtilPSDE16Id(String utilPSDE16Id) {
        this._set(DTOFIELD_UTILPSDE16ID, utilPSDE16Id);
    }

    @JsonIgnore
    public String getUtilPSDE16Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE16ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE16IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE16ID);
    }

    @JsonIgnore
    public void resetUtilPSDE16Id() {
        this._reset(DTOFIELD_UTILPSDE16ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde16id(String utilPSDE16Id) {
        this.setUtilPSDE16Id(utilPSDE16Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde16id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE16Id(null);
            this.setUtilPSDE16Name(null);
        } else {
            this.setUtilPSDE16Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE16Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde16name")
    public void setUtilPSDE16Name(String utilPSDE16Name) {
        this._set(DTOFIELD_UTILPSDE16NAME, utilPSDE16Name);
    }

    @JsonIgnore
    public String getUtilPSDE16Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE16NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE16NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE16NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE16Name() {
        this._reset(DTOFIELD_UTILPSDE16NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde16name(String utilPSDE16Name) {
        this.setUtilPSDE16Name(utilPSDE16Name);
        return this;
    }

    @JsonProperty(value="utilpsde17id")
    public void setUtilPSDE17Id(String utilPSDE17Id) {
        this._set(DTOFIELD_UTILPSDE17ID, utilPSDE17Id);
    }

    @JsonIgnore
    public String getUtilPSDE17Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE17ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE17IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE17ID);
    }

    @JsonIgnore
    public void resetUtilPSDE17Id() {
        this._reset(DTOFIELD_UTILPSDE17ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde17id(String utilPSDE17Id) {
        this.setUtilPSDE17Id(utilPSDE17Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde17id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE17Id(null);
            this.setUtilPSDE17Name(null);
        } else {
            this.setUtilPSDE17Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE17Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde17name")
    public void setUtilPSDE17Name(String utilPSDE17Name) {
        this._set(DTOFIELD_UTILPSDE17NAME, utilPSDE17Name);
    }

    @JsonIgnore
    public String getUtilPSDE17Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE17NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE17NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE17NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE17Name() {
        this._reset(DTOFIELD_UTILPSDE17NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde17name(String utilPSDE17Name) {
        this.setUtilPSDE17Name(utilPSDE17Name);
        return this;
    }

    @JsonProperty(value="utilpsde18id")
    public void setUtilPSDE18Id(String utilPSDE18Id) {
        this._set(DTOFIELD_UTILPSDE18ID, utilPSDE18Id);
    }

    @JsonIgnore
    public String getUtilPSDE18Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE18ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE18IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE18ID);
    }

    @JsonIgnore
    public void resetUtilPSDE18Id() {
        this._reset(DTOFIELD_UTILPSDE18ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde18id(String utilPSDE18Id) {
        this.setUtilPSDE18Id(utilPSDE18Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde18id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE18Id(null);
            this.setUtilPSDE18Name(null);
        } else {
            this.setUtilPSDE18Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE18Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde18name")
    public void setUtilPSDE18Name(String utilPSDE18Name) {
        this._set(DTOFIELD_UTILPSDE18NAME, utilPSDE18Name);
    }

    @JsonIgnore
    public String getUtilPSDE18Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE18NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE18NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE18NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE18Name() {
        this._reset(DTOFIELD_UTILPSDE18NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde18name(String utilPSDE18Name) {
        this.setUtilPSDE18Name(utilPSDE18Name);
        return this;
    }

    @JsonProperty(value="utilpsde19id")
    public void setUtilPSDE19Id(String utilPSDE19Id) {
        this._set(DTOFIELD_UTILPSDE19ID, utilPSDE19Id);
    }

    @JsonIgnore
    public String getUtilPSDE19Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE19ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE19IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE19ID);
    }

    @JsonIgnore
    public void resetUtilPSDE19Id() {
        this._reset(DTOFIELD_UTILPSDE19ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde19id(String utilPSDE19Id) {
        this.setUtilPSDE19Id(utilPSDE19Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde19id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE19Id(null);
            this.setUtilPSDE19Name(null);
        } else {
            this.setUtilPSDE19Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE19Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde19name")
    public void setUtilPSDE19Name(String utilPSDE19Name) {
        this._set(DTOFIELD_UTILPSDE19NAME, utilPSDE19Name);
    }

    @JsonIgnore
    public String getUtilPSDE19Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE19NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE19NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE19NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE19Name() {
        this._reset(DTOFIELD_UTILPSDE19NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde19name(String utilPSDE19Name) {
        this.setUtilPSDE19Name(utilPSDE19Name);
        return this;
    }

    @JsonProperty(value="utilpsde20id")
    public void setUtilPSDE20Id(String utilPSDE20Id) {
        this._set(DTOFIELD_UTILPSDE20ID, utilPSDE20Id);
    }

    @JsonIgnore
    public String getUtilPSDE20Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE20ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE20IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE20ID);
    }

    @JsonIgnore
    public void resetUtilPSDE20Id() {
        this._reset(DTOFIELD_UTILPSDE20ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde20id(String utilPSDE20Id) {
        this.setUtilPSDE20Id(utilPSDE20Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde20id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE20Id(null);
            this.setUtilPSDE20Name(null);
        } else {
            this.setUtilPSDE20Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE20Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde20name")
    public void setUtilPSDE20Name(String utilPSDE20Name) {
        this._set(DTOFIELD_UTILPSDE20NAME, utilPSDE20Name);
    }

    @JsonIgnore
    public String getUtilPSDE20Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE20NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE20NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE20NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE20Name() {
        this._reset(DTOFIELD_UTILPSDE20NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde20name(String utilPSDE20Name) {
        this.setUtilPSDE20Name(utilPSDE20Name);
        return this;
    }

    @JsonProperty(value="utilpsde2id")
    public void setUtilPSDE2Id(String utilPSDE2Id) {
        this._set(DTOFIELD_UTILPSDE2ID, utilPSDE2Id);
    }

    @JsonIgnore
    public String getUtilPSDE2Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE2ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE2IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE2ID);
    }

    @JsonIgnore
    public void resetUtilPSDE2Id() {
        this._reset(DTOFIELD_UTILPSDE2ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde2id(String utilPSDE2Id) {
        this.setUtilPSDE2Id(utilPSDE2Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde2id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE2Id(null);
            this.setUtilPSDE2Name(null);
        } else {
            this.setUtilPSDE2Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE2Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde2name")
    public void setUtilPSDE2Name(String utilPSDE2Name) {
        this._set(DTOFIELD_UTILPSDE2NAME, utilPSDE2Name);
    }

    @JsonIgnore
    public String getUtilPSDE2Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE2NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE2NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE2NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE2Name() {
        this._reset(DTOFIELD_UTILPSDE2NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde2name(String utilPSDE2Name) {
        this.setUtilPSDE2Name(utilPSDE2Name);
        return this;
    }

    @JsonProperty(value="utilpsde3id")
    public void setUtilPSDE3Id(String utilPSDE3Id) {
        this._set(DTOFIELD_UTILPSDE3ID, utilPSDE3Id);
    }

    @JsonIgnore
    public String getUtilPSDE3Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE3ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE3IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE3ID);
    }

    @JsonIgnore
    public void resetUtilPSDE3Id() {
        this._reset(DTOFIELD_UTILPSDE3ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde3id(String utilPSDE3Id) {
        this.setUtilPSDE3Id(utilPSDE3Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde3id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE3Id(null);
            this.setUtilPSDE3Name(null);
        } else {
            this.setUtilPSDE3Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE3Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde3name")
    public void setUtilPSDE3Name(String utilPSDE3Name) {
        this._set(DTOFIELD_UTILPSDE3NAME, utilPSDE3Name);
    }

    @JsonIgnore
    public String getUtilPSDE3Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE3NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE3NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE3NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE3Name() {
        this._reset(DTOFIELD_UTILPSDE3NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde3name(String utilPSDE3Name) {
        this.setUtilPSDE3Name(utilPSDE3Name);
        return this;
    }

    @JsonProperty(value="utilpsde4id")
    public void setUtilPSDE4Id(String utilPSDE4Id) {
        this._set(DTOFIELD_UTILPSDE4ID, utilPSDE4Id);
    }

    @JsonIgnore
    public String getUtilPSDE4Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE4ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE4IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE4ID);
    }

    @JsonIgnore
    public void resetUtilPSDE4Id() {
        this._reset(DTOFIELD_UTILPSDE4ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde4id(String utilPSDE4Id) {
        this.setUtilPSDE4Id(utilPSDE4Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde4id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE4Id(null);
            this.setUtilPSDE4Name(null);
        } else {
            this.setUtilPSDE4Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE4Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde4name")
    public void setUtilPSDE4Name(String utilPSDE4Name) {
        this._set(DTOFIELD_UTILPSDE4NAME, utilPSDE4Name);
    }

    @JsonIgnore
    public String getUtilPSDE4Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE4NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE4NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE4NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE4Name() {
        this._reset(DTOFIELD_UTILPSDE4NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde4name(String utilPSDE4Name) {
        this.setUtilPSDE4Name(utilPSDE4Name);
        return this;
    }

    @JsonProperty(value="utilpsde5id")
    public void setUtilPSDE5Id(String utilPSDE5Id) {
        this._set(DTOFIELD_UTILPSDE5ID, utilPSDE5Id);
    }

    @JsonIgnore
    public String getUtilPSDE5Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE5ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE5IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE5ID);
    }

    @JsonIgnore
    public void resetUtilPSDE5Id() {
        this._reset(DTOFIELD_UTILPSDE5ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde5id(String utilPSDE5Id) {
        this.setUtilPSDE5Id(utilPSDE5Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde5id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE5Id(null);
            this.setUtilPSDE5Name(null);
        } else {
            this.setUtilPSDE5Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE5Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde5name")
    public void setUtilPSDE5Name(String utilPSDE5Name) {
        this._set(DTOFIELD_UTILPSDE5NAME, utilPSDE5Name);
    }

    @JsonIgnore
    public String getUtilPSDE5Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE5NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE5NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE5NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE5Name() {
        this._reset(DTOFIELD_UTILPSDE5NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde5name(String utilPSDE5Name) {
        this.setUtilPSDE5Name(utilPSDE5Name);
        return this;
    }

    @JsonProperty(value="utilpsde6id")
    public void setUtilPSDE6Id(String utilPSDE6Id) {
        this._set(DTOFIELD_UTILPSDE6ID, utilPSDE6Id);
    }

    @JsonIgnore
    public String getUtilPSDE6Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE6ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE6IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE6ID);
    }

    @JsonIgnore
    public void resetUtilPSDE6Id() {
        this._reset(DTOFIELD_UTILPSDE6ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde6id(String utilPSDE6Id) {
        this.setUtilPSDE6Id(utilPSDE6Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde6id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE6Id(null);
            this.setUtilPSDE6Name(null);
        } else {
            this.setUtilPSDE6Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE6Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde6name")
    public void setUtilPSDE6Name(String utilPSDE6Name) {
        this._set(DTOFIELD_UTILPSDE6NAME, utilPSDE6Name);
    }

    @JsonIgnore
    public String getUtilPSDE6Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE6NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE6NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE6NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE6Name() {
        this._reset(DTOFIELD_UTILPSDE6NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde6name(String utilPSDE6Name) {
        this.setUtilPSDE6Name(utilPSDE6Name);
        return this;
    }

    @JsonProperty(value="utilpsde7id")
    public void setUtilPSDE7Id(String utilPSDE7Id) {
        this._set(DTOFIELD_UTILPSDE7ID, utilPSDE7Id);
    }

    @JsonIgnore
    public String getUtilPSDE7Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE7ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE7IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE7ID);
    }

    @JsonIgnore
    public void resetUtilPSDE7Id() {
        this._reset(DTOFIELD_UTILPSDE7ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde7id(String utilPSDE7Id) {
        this.setUtilPSDE7Id(utilPSDE7Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde7id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE7Id(null);
            this.setUtilPSDE7Name(null);
        } else {
            this.setUtilPSDE7Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE7Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde7name")
    public void setUtilPSDE7Name(String utilPSDE7Name) {
        this._set(DTOFIELD_UTILPSDE7NAME, utilPSDE7Name);
    }

    @JsonIgnore
    public String getUtilPSDE7Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE7NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE7NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE7NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE7Name() {
        this._reset(DTOFIELD_UTILPSDE7NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde7name(String utilPSDE7Name) {
        this.setUtilPSDE7Name(utilPSDE7Name);
        return this;
    }

    @JsonProperty(value="utilpsde8id")
    public void setUtilPSDE8Id(String utilPSDE8Id) {
        this._set(DTOFIELD_UTILPSDE8ID, utilPSDE8Id);
    }

    @JsonIgnore
    public String getUtilPSDE8Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE8ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE8IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE8ID);
    }

    @JsonIgnore
    public void resetUtilPSDE8Id() {
        this._reset(DTOFIELD_UTILPSDE8ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde8id(String utilPSDE8Id) {
        this.setUtilPSDE8Id(utilPSDE8Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde8id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE8Id(null);
            this.setUtilPSDE8Name(null);
        } else {
            this.setUtilPSDE8Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE8Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde8name")
    public void setUtilPSDE8Name(String utilPSDE8Name) {
        this._set(DTOFIELD_UTILPSDE8NAME, utilPSDE8Name);
    }

    @JsonIgnore
    public String getUtilPSDE8Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE8NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE8NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE8NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE8Name() {
        this._reset(DTOFIELD_UTILPSDE8NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde8name(String utilPSDE8Name) {
        this.setUtilPSDE8Name(utilPSDE8Name);
        return this;
    }

    @JsonProperty(value="utilpsde9id")
    public void setUtilPSDE9Id(String utilPSDE9Id) {
        this._set(DTOFIELD_UTILPSDE9ID, utilPSDE9Id);
    }

    @JsonIgnore
    public String getUtilPSDE9Id() {
        Object objValue = this._get(DTOFIELD_UTILPSDE9ID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE9IdDirty() {
        return this._contains(DTOFIELD_UTILPSDE9ID);
    }

    @JsonIgnore
    public void resetUtilPSDE9Id() {
        this._reset(DTOFIELD_UTILPSDE9ID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde9id(String utilPSDE9Id) {
        this.setUtilPSDE9Id(utilPSDE9Id);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde9id(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDE9Id(null);
            this.setUtilPSDE9Name(null);
        } else {
            this.setUtilPSDE9Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE9Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsde9name")
    public void setUtilPSDE9Name(String utilPSDE9Name) {
        this._set(DTOFIELD_UTILPSDE9NAME, utilPSDE9Name);
    }

    @JsonIgnore
    public String getUtilPSDE9Name() {
        Object objValue = this._get(DTOFIELD_UTILPSDE9NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDE9NameDirty() {
        return this._contains(DTOFIELD_UTILPSDE9NAME);
    }

    @JsonIgnore
    public void resetUtilPSDE9Name() {
        this._reset(DTOFIELD_UTILPSDE9NAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsde9name(String utilPSDE9Name) {
        this.setUtilPSDE9Name(utilPSDE9Name);
        return this;
    }

    @JsonProperty(value="utilpsdeid")
    public void setUtilPSDEId(String utilPSDEId) {
        this._set(DTOFIELD_UTILPSDEID, utilPSDEId);
    }

    @JsonIgnore
    public String getUtilPSDEId() {
        Object objValue = this._get(DTOFIELD_UTILPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDEIdDirty() {
        return this._contains(DTOFIELD_UTILPSDEID);
    }

    @JsonIgnore
    public void resetUtilPSDEId() {
        this._reset(DTOFIELD_UTILPSDEID);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsdeid(String utilPSDEId) {
        this.setUtilPSDEId(utilPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setUtilPSDEId(null);
            this.setUtilPSDEName(null);
        } else {
            this.setUtilPSDEId(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="utilpsdename")
    public void setUtilPSDEName(String utilPSDEName) {
        this._set(DTOFIELD_UTILPSDENAME, utilPSDEName);
    }

    @JsonIgnore
    public String getUtilPSDEName() {
        Object objValue = this._get(DTOFIELD_UTILPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilPSDENameDirty() {
        return this._contains(DTOFIELD_UTILPSDENAME);
    }

    @JsonIgnore
    public void resetUtilPSDEName() {
        this._reset(DTOFIELD_UTILPSDENAME);
    }

    @JsonIgnore
    public PSDEUtilDTO utilpsdename(String utilPSDEName) {
        this.setUtilPSDEName(utilPSDEName);
        return this;
    }

    @JsonProperty(value="utiltag")
    public void setUtilTag(String utilTag) {
        this._set(DTOFIELD_UTILTAG, utilTag);
    }

    @JsonIgnore
    public String getUtilTag() {
        Object objValue = this._get(DTOFIELD_UTILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTagDirty() {
        return this._contains(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public void resetUtilTag() {
        this._reset(DTOFIELD_UTILTAG);
    }

    @JsonIgnore
    public PSDEUtilDTO utiltag(String utilTag) {
        this.setUtilTag(utilTag);
        return this;
    }

    @JsonProperty(value="utiltag2")
    public void setUtilTag2(String utilTag2) {
        this._set(DTOFIELD_UTILTAG2, utilTag2);
    }

    @JsonIgnore
    public String getUtilTag2() {
        Object objValue = this._get(DTOFIELD_UTILTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTag2Dirty() {
        return this._contains(DTOFIELD_UTILTAG2);
    }

    @JsonIgnore
    public void resetUtilTag2() {
        this._reset(DTOFIELD_UTILTAG2);
    }

    @JsonIgnore
    public PSDEUtilDTO utiltag2(String utilTag2) {
        this.setUtilTag2(utilTag2);
        return this;
    }

    @JsonProperty(value="utiltype")
    public void setUtilType(String utilType) {
        this._set(DTOFIELD_UTILTYPE, utilType);
    }

    @JsonIgnore
    public String getUtilType() {
        Object objValue = this._get(DTOFIELD_UTILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUtilTypeDirty() {
        return this._contains(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public void resetUtilType() {
        this._reset(DTOFIELD_UTILTYPE);
    }

    @JsonIgnore
    public PSDEUtilDTO utiltype(String utilType) {
        this.setUtilType(utilType);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO utiltype(PSModelEnums.DEUtilType utilType) {
        if (utilType == null) {
            this.setUtilType(null);
        } else {
            this.setUtilType(utilType.value);
        }
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
    public PSDEUtilDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEUtilDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEUtilId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEUtilId(strValue);
    }

    @JsonIgnore
    public PSDEUtilDTO id(String strValue) {
        this.setPSDEUtilId(strValue);
        return this;
    }
}
