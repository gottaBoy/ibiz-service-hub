package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDESampleDataDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DATA2 = "DATA2";
    protected static final String DTOFIELD_DATA2 = "data2";
    public static final String FIELD_DATATYPE = "DATATYPE";
    protected static final String DTOFIELD_DATATYPE = "datatype";
    public static final String FIELD_LOGICMODE = "LOGICMODE";
    protected static final String DTOFIELD_LOGICMODE = "logicmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAINSTATEID = "PSDEMAINSTATEID";
    protected static final String DTOFIELD_PSDEMAINSTATEID = "psdemainstateid";
    public static final String FIELD_PSDEMAINSTATENAME = "PSDEMAINSTATENAME";
    protected static final String DTOFIELD_PSDEMAINSTATENAME = "psdemainstatename";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDESAMPLEDATAID = "PSDESAMPLEDATAID";
    protected static final String DTOFIELD_PSDESAMPLEDATAID = "psdesampledataid";
    public static final String FIELD_PSDESAMPLEDATANAME = "PSDESAMPLEDATANAME";
    protected static final String DTOFIELD_PSDESAMPLEDATANAME = "psdesampledataname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_RANDOMCNT = "RANDOMECNT";
    protected static final String DTOFIELD_RANDOMCNT = "randomcnt";
    public static final String FIELD_RANDOMMODE = "RANDOMMODE";
    protected static final String DTOFIELD_RANDOMMODE = "randommode";
    public static final String FIELD_RANDOMPARAM = "RANDOMPARAM";
    protected static final String DTOFIELD_RANDOMPARAM = "randomparam";
    public static final String FIELD_RANDOMPARAM2 = "RANDOMPARAM2";
    protected static final String DTOFIELD_RANDOMPARAM2 = "randomparam2";
    public static final String FIELD_RANDOMPARAM3 = "RANDOMPARAM3";
    protected static final String DTOFIELD_RANDOMPARAM3 = "randomparam3";
    public static final String FIELD_RANDOMPARAM4 = "RANDOMPARAM4";
    protected static final String DTOFIELD_RANDOMPARAM4 = "randomparam4";
    public static final String FIELD_SDTAG = "SDTAG";
    protected static final String DTOFIELD_SDTAG = "sdtag";
    public static final String FIELD_SDTAG2 = "SDTAG2";
    protected static final String DTOFIELD_SDTAG2 = "sdtag2";
    public static final String FIELD_SDTAG3 = "SDTAG3";
    protected static final String DTOFIELD_SDTAG3 = "sdtag3";
    public static final String FIELD_SDTAG4 = "SDTAG4";
    protected static final String DTOFIELD_SDTAG4 = "sdtag4";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USAGE = "USAGE";
    protected static final String DTOFIELD_USAGE = "usage";
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
    public PSDESampleDataDTO codename(String codeName) {
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
    public PSDESampleDataDTO createdate(Timestamp createDate) {
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
    public PSDESampleDataDTO createman(String createMan) {
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
    public PSDESampleDataDTO customcode(String customCode) {
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
    public PSDESampleDataDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
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
    public PSDESampleDataDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="data2")
    public void setData2(String data2) {
        this._set(DTOFIELD_DATA2, data2);
    }

    @JsonIgnore
    public String getData2() {
        Object objValue = this._get(DTOFIELD_DATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isData2Dirty() {
        return this._contains(DTOFIELD_DATA2);
    }

    @JsonIgnore
    public void resetData2() {
        this._reset(DTOFIELD_DATA2);
    }

    @JsonIgnore
    public PSDESampleDataDTO data2(String data2) {
        this.setData2(data2);
        return this;
    }

    @JsonProperty(value="datatype")
    public void setDataType(String dataType) {
        this._set(DTOFIELD_DATATYPE, dataType);
    }

    @JsonIgnore
    public String getDataType() {
        Object objValue = this._get(DTOFIELD_DATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypeDirty() {
        return this._contains(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public void resetDataType() {
        this._reset(DTOFIELD_DATATYPE);
    }

    @JsonIgnore
    public PSDESampleDataDTO datatype(String dataType) {
        this.setDataType(dataType);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO datatype(PSModelEnums.SampleDataType dataType) {
        if (dataType == null) {
            this.setDataType(null);
        } else {
            this.setDataType(dataType.value);
        }
        return this;
    }

    @JsonProperty(value="logicmode")
    public void setLogicMode(String logicMode) {
        this._set(DTOFIELD_LOGICMODE, logicMode);
    }

    @JsonIgnore
    public String getLogicMode() {
        Object objValue = this._get(DTOFIELD_LOGICMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicModeDirty() {
        return this._contains(DTOFIELD_LOGICMODE);
    }

    @JsonIgnore
    public void resetLogicMode() {
        this._reset(DTOFIELD_LOGICMODE);
    }

    @JsonIgnore
    public PSDESampleDataDTO logicmode(String logicMode) {
        this.setLogicMode(logicMode);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO logicmode(PSModelEnums.SampleDataLogicMode logicMode) {
        if (logicMode == null) {
            this.setLogicMode(null);
        } else {
            this.setLogicMode(logicMode.value);
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
    public PSDESampleDataDTO memo(String memo) {
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
    public PSDESampleDataDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstateid")
    public void setPSDEMainStateId(String pSDEMainStateId) {
        this._set(DTOFIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }

    @JsonIgnore
    public String getPSDEMainStateId() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateIdDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public void resetPSDEMainStateId() {
        this._reset(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public PSDESampleDataDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO psdemainstateid(PSDEMainStateDTO pSDEMainState) {
        if (pSDEMainState == null) {
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        } else {
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstatename")
    public void setPSDEMainStateName(String pSDEMainStateName) {
        this._set(DTOFIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }

    @JsonIgnore
    public String getPSDEMainStateName() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateNameDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public void resetPSDEMainStateName() {
        this._reset(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public PSDESampleDataDTO psdemainstatename(String pSDEMainStateName) {
        this.setPSDEMainStateName(pSDEMainStateName);
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
    public PSDESampleDataDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdesampledataid")
    public void setPSDESampleDataId(String pSDESampleDataId) {
        this._set(DTOFIELD_PSDESAMPLEDATAID, pSDESampleDataId);
    }

    @JsonIgnore
    public String getPSDESampleDataId() {
        Object objValue = this._get(DTOFIELD_PSDESAMPLEDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESampleDataIdDirty() {
        return this._contains(DTOFIELD_PSDESAMPLEDATAID);
    }

    @JsonIgnore
    public void resetPSDESampleDataId() {
        this._reset(DTOFIELD_PSDESAMPLEDATAID);
    }

    @JsonIgnore
    public PSDESampleDataDTO psdesampledataid(String pSDESampleDataId) {
        this.setPSDESampleDataId(pSDESampleDataId);
        return this;
    }

    @JsonProperty(value="psdesampledataname")
    public void setPSDESampleDataName(String pSDESampleDataName) {
        this._set(DTOFIELD_PSDESAMPLEDATANAME, pSDESampleDataName);
    }

    @JsonIgnore
    public String getPSDESampleDataName() {
        Object objValue = this._get(DTOFIELD_PSDESAMPLEDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESampleDataNameDirty() {
        return this._contains(DTOFIELD_PSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public void resetPSDESampleDataName() {
        this._reset(DTOFIELD_PSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public PSDESampleDataDTO psdesampledataname(String pSDESampleDataName) {
        this.setPSDESampleDataName(pSDESampleDataName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDESampleDataName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDESampleDataName(strName);
    }

    @JsonIgnore
    public PSDESampleDataDTO name(String strName) {
        this.setPSDESampleDataName(strName);
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
    public PSDESampleDataDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDESampleDataDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="randomcnt")
    public void setRandomCnt(Integer randomCnt) {
        this._set(DTOFIELD_RANDOMCNT, randomCnt);
        this._set(FIELD_RANDOMCNT, randomCnt);
    }

    @JsonIgnore
    public Integer getRandomCnt() {
        Object objValue = this._get(DTOFIELD_RANDOMCNT);
        if (objValue == null && (objValue = this._get(FIELD_RANDOMCNT)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRandomCntDirty() {
        if (this._contains(DTOFIELD_RANDOMCNT)) {
            return true;
        }
        return this._contains(FIELD_RANDOMCNT);
    }

    @JsonIgnore
    public void resetRandomCnt() {
        this._reset(DTOFIELD_RANDOMCNT);
        this._reset(FIELD_RANDOMCNT);
    }

    @JsonIgnore
    public PSDESampleDataDTO randomcnt(Integer randomCnt) {
        this.setRandomCnt(randomCnt);
        return this;
    }

    @JsonProperty(value="randommode")
    public void setRandomMode(String randomMode) {
        this._set(DTOFIELD_RANDOMMODE, randomMode);
    }

    @JsonIgnore
    public String getRandomMode() {
        Object objValue = this._get(DTOFIELD_RANDOMMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRandomModeDirty() {
        return this._contains(DTOFIELD_RANDOMMODE);
    }

    @JsonIgnore
    public void resetRandomMode() {
        this._reset(DTOFIELD_RANDOMMODE);
    }

    @JsonIgnore
    public PSDESampleDataDTO randommode(String randomMode) {
        this.setRandomMode(randomMode);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO randommode(PSModelEnums.SampleDataRandomMode randomMode) {
        if (randomMode == null) {
            this.setRandomMode(null);
        } else {
            this.setRandomMode(randomMode.value);
        }
        return this;
    }

    @JsonProperty(value="randomparam")
    public void setRandomParam(String randomParam) {
        this._set(DTOFIELD_RANDOMPARAM, randomParam);
    }

    @JsonIgnore
    public String getRandomParam() {
        Object objValue = this._get(DTOFIELD_RANDOMPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRandomParamDirty() {
        return this._contains(DTOFIELD_RANDOMPARAM);
    }

    @JsonIgnore
    public void resetRandomParam() {
        this._reset(DTOFIELD_RANDOMPARAM);
    }

    @JsonIgnore
    public PSDESampleDataDTO randomparam(String randomParam) {
        this.setRandomParam(randomParam);
        return this;
    }

    @JsonProperty(value="randomparam2")
    public void setRandomParam2(String randomParam2) {
        this._set(DTOFIELD_RANDOMPARAM2, randomParam2);
    }

    @JsonIgnore
    public String getRandomParam2() {
        Object objValue = this._get(DTOFIELD_RANDOMPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRandomParam2Dirty() {
        return this._contains(DTOFIELD_RANDOMPARAM2);
    }

    @JsonIgnore
    public void resetRandomParam2() {
        this._reset(DTOFIELD_RANDOMPARAM2);
    }

    @JsonIgnore
    public PSDESampleDataDTO randomparam2(String randomParam2) {
        this.setRandomParam2(randomParam2);
        return this;
    }

    @JsonProperty(value="randomparam3")
    public void setRandomParam3(Integer randomParam3) {
        this._set(DTOFIELD_RANDOMPARAM3, randomParam3);
    }

    @JsonIgnore
    public Integer getRandomParam3() {
        Object objValue = this._get(DTOFIELD_RANDOMPARAM3);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRandomParam3Dirty() {
        return this._contains(DTOFIELD_RANDOMPARAM3);
    }

    @JsonIgnore
    public void resetRandomParam3() {
        this._reset(DTOFIELD_RANDOMPARAM3);
    }

    @JsonIgnore
    public PSDESampleDataDTO randomparam3(Integer randomParam3) {
        this.setRandomParam3(randomParam3);
        return this;
    }

    @JsonProperty(value="randomparam4")
    public void setRandomParam4(Integer randomParam4) {
        this._set(DTOFIELD_RANDOMPARAM4, randomParam4);
    }

    @JsonIgnore
    public Integer getRandomParam4() {
        Object objValue = this._get(DTOFIELD_RANDOMPARAM4);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRandomParam4Dirty() {
        return this._contains(DTOFIELD_RANDOMPARAM4);
    }

    @JsonIgnore
    public void resetRandomParam4() {
        this._reset(DTOFIELD_RANDOMPARAM4);
    }

    @JsonIgnore
    public PSDESampleDataDTO randomparam4(Integer randomParam4) {
        this.setRandomParam4(randomParam4);
        return this;
    }

    @JsonProperty(value="sdtag")
    public void setSDTag(String sDTag) {
        this._set(DTOFIELD_SDTAG, sDTag);
    }

    @JsonIgnore
    public String getSDTag() {
        Object objValue = this._get(DTOFIELD_SDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSDTagDirty() {
        return this._contains(DTOFIELD_SDTAG);
    }

    @JsonIgnore
    public void resetSDTag() {
        this._reset(DTOFIELD_SDTAG);
    }

    @JsonIgnore
    public PSDESampleDataDTO sdtag(String sDTag) {
        this.setSDTag(sDTag);
        return this;
    }

    @JsonProperty(value="sdtag2")
    public void setSDTag2(String sDTag2) {
        this._set(DTOFIELD_SDTAG2, sDTag2);
    }

    @JsonIgnore
    public String getSDTag2() {
        Object objValue = this._get(DTOFIELD_SDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSDTag2Dirty() {
        return this._contains(DTOFIELD_SDTAG2);
    }

    @JsonIgnore
    public void resetSDTag2() {
        this._reset(DTOFIELD_SDTAG2);
    }

    @JsonIgnore
    public PSDESampleDataDTO sdtag2(String sDTag2) {
        this.setSDTag2(sDTag2);
        return this;
    }

    @JsonProperty(value="sdtag3")
    public void setSDTag3(String sDTag3) {
        this._set(DTOFIELD_SDTAG3, sDTag3);
    }

    @JsonIgnore
    public String getSDTag3() {
        Object objValue = this._get(DTOFIELD_SDTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSDTag3Dirty() {
        return this._contains(DTOFIELD_SDTAG3);
    }

    @JsonIgnore
    public void resetSDTag3() {
        this._reset(DTOFIELD_SDTAG3);
    }

    @JsonIgnore
    public PSDESampleDataDTO sdtag3(String sDTag3) {
        this.setSDTag3(sDTag3);
        return this;
    }

    @JsonProperty(value="sdtag4")
    public void setSDTag4(String sDTag4) {
        this._set(DTOFIELD_SDTAG4, sDTag4);
    }

    @JsonIgnore
    public String getSDTag4() {
        Object objValue = this._get(DTOFIELD_SDTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSDTag4Dirty() {
        return this._contains(DTOFIELD_SDTAG4);
    }

    @JsonIgnore
    public void resetSDTag4() {
        this._reset(DTOFIELD_SDTAG4);
    }

    @JsonIgnore
    public PSDESampleDataDTO sdtag4(String sDTag4) {
        this.setSDTag4(sDTag4);
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
    public PSDESampleDataDTO updatedate(Timestamp updateDate) {
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
    public PSDESampleDataDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usage")
    public void setUsage(String usage) {
        this._set(DTOFIELD_USAGE, usage);
    }

    @JsonIgnore
    public String getUsage() {
        Object objValue = this._get(DTOFIELD_USAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUsageDirty() {
        return this._contains(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public void resetUsage() {
        this._reset(DTOFIELD_USAGE);
    }

    @JsonIgnore
    public PSDESampleDataDTO usage(String usage) {
        this.setUsage(usage);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO usage(PSModelEnums.SampleDataUsage usage) {
        if (usage == null) {
            this.setUsage(null);
        } else {
            this.setUsage(usage.value);
        }
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
    public PSDESampleDataDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDESampleDataDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDESampleDataDTO usertag(String userTag) {
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
    public PSDESampleDataDTO usertag2(String userTag2) {
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
    public PSDESampleDataDTO usertag3(String userTag3) {
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
    public PSDESampleDataDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDESampleDataId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDESampleDataId(strValue);
    }

    @JsonIgnore
    public PSDESampleDataDTO id(String strValue) {
        this.setPSDESampleDataId(strValue);
        return this;
    }
}
