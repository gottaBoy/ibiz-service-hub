package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMainStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESampleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTDItemDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTestDataDTO
extends PSModelDTOBase {
    public static final String FIELD_BASEMODE = "BASEMODE";
    protected static final String DTOFIELD_BASEMODE = "basemode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_MAINPSSYSTDID = "MAINPSSYSTDID";
    protected static final String DTOFIELD_MAINPSSYSTDID = "mainpssystdid";
    public static final String FIELD_MAINPSSYSTDNAME = "MAINPSSYSTDNAME";
    protected static final String DTOFIELD_MAINPSSYSTDNAME = "mainpssystdname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
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
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSTESTDATAID = "PSSYSTESTDATAID";
    protected static final String DTOFIELD_PSSYSTESTDATAID = "pssystestdataid";
    public static final String FIELD_PSSYSTESTDATANAME = "PSSYSTESTDATANAME";
    protected static final String DTOFIELD_PSSYSTESTDATANAME = "pssystestdataname";
    public static final String FIELD_RANDOMCOUNT = "RANDOMCOUNT";
    protected static final String DTOFIELD_RANDOMCOUNT = "randomcount";
    public static final String FIELD_TESTDATATAG = "TESTDATATAG";
    protected static final String DTOFIELD_TESTDATATAG = "testdatatag";
    public static final String FIELD_TESTDATATAG2 = "TESTDATATAG2";
    protected static final String DTOFIELD_TESTDATATAG2 = "testdatatag2";
    public static final String FIELD_TESTDATATYPE = "TESTDATATYPE";
    protected static final String DTOFIELD_TESTDATATYPE = "testdatatype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USAGE = "USAGE";
    protected static final String DTOFIELD_USAGE = "usage";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERFLAG = "USERFLAG";
    protected static final String DTOFIELD_USERFLAG = "userflag";
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
    public static final String DTOFIELD_PSSYSTDITEMS = "pssystditems";

    @JsonProperty(value="basemode")
    public void setBaseMode(Integer baseMode) {
        this._set(DTOFIELD_BASEMODE, baseMode);
    }

    @JsonIgnore
    public Integer getBaseMode() {
        Object objValue = this._get(DTOFIELD_BASEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBaseModeDirty() {
        return this._contains(DTOFIELD_BASEMODE);
    }

    @JsonIgnore
    public void resetBaseMode() {
        this._reset(DTOFIELD_BASEMODE);
    }

    @JsonIgnore
    public PSSysTestDataDTO basemode(Integer baseMode) {
        this.setBaseMode(baseMode);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO basemode(Boolean baseMode) {
        if (baseMode == null) {
            this.setBaseMode(null);
        } else {
            this.setBaseMode(baseMode != false ? 1 : 0);
        }
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
    public PSSysTestDataDTO codename(String codeName) {
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
    public PSSysTestDataDTO createdate(Timestamp createDate) {
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
    public PSSysTestDataDTO createman(String createMan) {
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
    public PSSysTestDataDTO customcode(String customCode) {
        this.setCustomCode(customCode);
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
    public PSSysTestDataDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="mainpssystdid")
    public void setMainPSSysTDId(String mainPSSysTDId) {
        this._set(DTOFIELD_MAINPSSYSTDID, mainPSSysTDId);
    }

    @JsonIgnore
    public String getMainPSSysTDId() {
        Object objValue = this._get(DTOFIELD_MAINPSSYSTDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSSysTDIdDirty() {
        return this._contains(DTOFIELD_MAINPSSYSTDID);
    }

    @JsonIgnore
    public void resetMainPSSysTDId() {
        this._reset(DTOFIELD_MAINPSSYSTDID);
    }

    @JsonIgnore
    public PSSysTestDataDTO mainpssystdid(String mainPSSysTDId) {
        this.setMainPSSysTDId(mainPSSysTDId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO mainpssystdid(PSSysTestDataDTO pSSysTestData) {
        if (pSSysTestData == null) {
            this.setMainPSSysTDId(null);
            this.setMainPSSysTDName(null);
        } else {
            this.setMainPSSysTDId(pSSysTestData.getPSSysTestDataId());
            this.setMainPSSysTDName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    @JsonProperty(value="mainpssystdname")
    public void setMainPSSysTDName(String mainPSSysTDName) {
        this._set(DTOFIELD_MAINPSSYSTDNAME, mainPSSysTDName);
    }

    @JsonIgnore
    public String getMainPSSysTDName() {
        Object objValue = this._get(DTOFIELD_MAINPSSYSTDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSSysTDNameDirty() {
        return this._contains(DTOFIELD_MAINPSSYSTDNAME);
    }

    @JsonIgnore
    public void resetMainPSSysTDName() {
        this._reset(DTOFIELD_MAINPSSYSTDNAME);
    }

    @JsonIgnore
    public PSSysTestDataDTO mainpssystdname(String mainPSSysTDName) {
        this.setMainPSSysTDName(mainPSSysTDName);
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
    public PSSysTestDataDTO memo(String memo) {
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
    public PSSysTestDataDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysTestDataDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysTestDataDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO psdemainstateid(PSDEMainStateDTO pSDEMainState) {
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
    public PSSysTestDataDTO psdemainstatename(String pSDEMainStateName) {
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
    public PSSysTestDataDTO psdename(String pSDEName) {
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
    public PSSysTestDataDTO psdesampledataid(String pSDESampleDataId) {
        this.setPSDESampleDataId(pSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO psdesampledataid(PSDESampleDataDTO pSDESampleData) {
        if (pSDESampleData == null) {
            this.setPSDESampleDataId(null);
            this.setPSDESampleDataName(null);
        } else {
            this.setPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
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
    public PSSysTestDataDTO psdesampledataname(String pSDESampleDataName) {
        this.setPSDESampleDataName(pSDESampleDataName);
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
    public PSSysTestDataDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysTestDataDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysTestDataDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSSysTestDataDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssystestdataid")
    public void setPSSysTestDataId(String pSSysTestDataId) {
        this._set(DTOFIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }

    @JsonIgnore
    public String getPSSysTestDataId() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataIdDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public void resetPSSysTestDataId() {
        this._reset(DTOFIELD_PSSYSTESTDATAID);
    }

    @JsonIgnore
    public PSSysTestDataDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonProperty(value="pssystestdataname")
    public void setPSSysTestDataName(String pSSysTestDataName) {
        this._set(DTOFIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }

    @JsonIgnore
    public String getPSSysTestDataName() {
        Object objValue = this._get(DTOFIELD_PSSYSTESTDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTestDataNameDirty() {
        return this._contains(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public void resetPSSysTestDataName() {
        this._reset(DTOFIELD_PSSYSTESTDATANAME);
    }

    @JsonIgnore
    public PSSysTestDataDTO pssystestdataname(String pSSysTestDataName) {
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTestDataName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTestDataName(strName);
    }

    @JsonIgnore
    public PSSysTestDataDTO name(String strName) {
        this.setPSSysTestDataName(strName);
        return this;
    }

    @JsonProperty(value="randomcount")
    public void setRandomCount(Integer randomCount) {
        this._set(DTOFIELD_RANDOMCOUNT, randomCount);
    }

    @JsonIgnore
    public Integer getRandomCount() {
        Object objValue = this._get(DTOFIELD_RANDOMCOUNT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRandomCountDirty() {
        return this._contains(DTOFIELD_RANDOMCOUNT);
    }

    @JsonIgnore
    public void resetRandomCount() {
        this._reset(DTOFIELD_RANDOMCOUNT);
    }

    @JsonIgnore
    public PSSysTestDataDTO randomcount(Integer randomCount) {
        this.setRandomCount(randomCount);
        return this;
    }

    @JsonProperty(value="testdatatag")
    public void setTestDataTag(String testDataTag) {
        this._set(DTOFIELD_TESTDATATAG, testDataTag);
    }

    @JsonIgnore
    public String getTestDataTag() {
        Object objValue = this._get(DTOFIELD_TESTDATATAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestDataTagDirty() {
        return this._contains(DTOFIELD_TESTDATATAG);
    }

    @JsonIgnore
    public void resetTestDataTag() {
        this._reset(DTOFIELD_TESTDATATAG);
    }

    @JsonIgnore
    public PSSysTestDataDTO testdatatag(String testDataTag) {
        this.setTestDataTag(testDataTag);
        return this;
    }

    @JsonProperty(value="testdatatag2")
    public void setTestDataTag2(String testDataTag2) {
        this._set(DTOFIELD_TESTDATATAG2, testDataTag2);
    }

    @JsonIgnore
    public String getTestDataTag2() {
        Object objValue = this._get(DTOFIELD_TESTDATATAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestDataTag2Dirty() {
        return this._contains(DTOFIELD_TESTDATATAG2);
    }

    @JsonIgnore
    public void resetTestDataTag2() {
        this._reset(DTOFIELD_TESTDATATAG2);
    }

    @JsonIgnore
    public PSSysTestDataDTO testdatatag2(String testDataTag2) {
        this.setTestDataTag2(testDataTag2);
        return this;
    }

    @JsonProperty(value="testdatatype")
    public void setTestDataType(String testDataType) {
        this._set(DTOFIELD_TESTDATATYPE, testDataType);
    }

    @JsonIgnore
    public String getTestDataType() {
        Object objValue = this._get(DTOFIELD_TESTDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTestDataTypeDirty() {
        return this._contains(DTOFIELD_TESTDATATYPE);
    }

    @JsonIgnore
    public void resetTestDataType() {
        this._reset(DTOFIELD_TESTDATATYPE);
    }

    @JsonIgnore
    public PSSysTestDataDTO testdatatype(String testDataType) {
        this.setTestDataType(testDataType);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO testdatatype(PSModelEnums.TestDataType testDataType) {
        if (testDataType == null) {
            this.setTestDataType(null);
        } else {
            this.setTestDataType(testDataType.value);
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
    public PSSysTestDataDTO updatedate(Timestamp updateDate) {
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
    public PSSysTestDataDTO updateman(String updateMan) {
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
    public PSSysTestDataDTO usage(String usage) {
        this.setUsage(usage);
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
    public PSSysTestDataDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userflag")
    public void setUserFlag(Integer userFlag) {
        this._set(DTOFIELD_USERFLAG, userFlag);
    }

    @JsonIgnore
    public Integer getUserFlag() {
        Object objValue = this._get(DTOFIELD_USERFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUserFlagDirty() {
        return this._contains(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public void resetUserFlag() {
        this._reset(DTOFIELD_USERFLAG);
    }

    @JsonIgnore
    public PSSysTestDataDTO userflag(Integer userFlag) {
        this.setUserFlag(userFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO userflag(Boolean userFlag) {
        if (userFlag == null) {
            this.setUserFlag(null);
        } else {
            this.setUserFlag(userFlag != false ? 1 : 0);
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
    public PSSysTestDataDTO usertag(String userTag) {
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
    public PSSysTestDataDTO usertag2(String userTag2) {
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
    public PSSysTestDataDTO usertag3(String userTag3) {
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
    public PSSysTestDataDTO usertag4(String userTag4) {
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
    public PSSysTestDataDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTestDataDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTestDataId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTestDataId(strValue);
    }

    @JsonIgnore
    public PSSysTestDataDTO id(String strValue) {
        this.setPSSysTestDataId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysTDItemDTO> getPSSysTDItems() {
        Object list = this._get(DTOFIELD_PSSYSTDITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssystditems")
    public void setPSSysTDItems(List<PSSysTDItemDTO> pssystditems) {
        this._set(DTOFIELD_PSSYSTDITEMS, pssystditems);
    }

    @JsonIgnore
    public List<PSSysTDItemDTO> getPSSysTDItemsIf() {
        Object list = this._get(DTOFIELD_PSSYSTDITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSTDITEMS, list);
        }
        return (List)list;
    }
}
