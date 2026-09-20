package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDESARSDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONRSMODE = "ACTIONRSMODE";
    protected static final String DTOFIELD_ACTIONRSMODE = "actionrsmode";
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CHILDFILTER = "CHILDFILTER";
    protected static final String DTOFIELD_CHILDFILTER = "childfilter";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CPSDEID = "CPSDEID";
    protected static final String DTOFIELD_CPSDEID = "cpsdeid";
    public static final String FIELD_CPSDESERVICEAPIID = "CPSDESERVICEAPIID";
    protected static final String DTOFIELD_CPSDESERVICEAPIID = "cpsdeserviceapiid";
    public static final String FIELD_CPSDESERVICEAPINAME = "CPSDESERVICEAPINAME";
    protected static final String DTOFIELD_CPSDESERVICEAPINAME = "cpsdeserviceapiname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATAACCMODE = "DATAACCMODE";
    protected static final String DTOFIELD_DATAACCMODE = "dataaccmode";
    public static final String FIELD_DATARSMODE = "DATARSMODE";
    protected static final String DTOFIELD_DATARSMODE = "datarsmode";
    public static final String FIELD_ENABLEDATAEXPORT = "ENABLEDATAEXPORT";
    protected static final String DTOFIELD_ENABLEDATAEXPORT = "enabledataexport";
    public static final String FIELD_ENABLEDATAIMPORT = "ENABLEDATAIMPORT";
    protected static final String DTOFIELD_ENABLEDATAIMPORT = "enabledataimport";
    public static final String FIELD_ENABLEDEACTION = "ENABLEDEACTION";
    protected static final String DTOFIELD_ENABLEDEACTION = "enabledeaction";
    public static final String FIELD_ENABLEDEDATASET = "ENABLEDEDATASET";
    protected static final String DTOFIELD_ENABLEDEDATASET = "enablededataset";
    public static final String FIELD_ENABLESELECT = "ENABLESELECT";
    protected static final String DTOFIELD_ENABLESELECT = "enableselect";
    public static final String FIELD_EXPORTMODEL = "EXPORTMODEL";
    protected static final String DTOFIELD_EXPORTMODEL = "exportmodel";
    public static final String FIELD_EXPORTSCOPE = "EXPORTSCOPE";
    protected static final String DTOFIELD_EXPORTSCOPE = "exportscope";
    public static final String FIELD_EXPORTSCOPE2 = "EXPORTSCOPE2";
    protected static final String DTOFIELD_EXPORTSCOPE2 = "exportscope2";
    public static final String FIELD_EXPORTSCOPE3 = "EXPORTSCOPE3";
    protected static final String DTOFIELD_EXPORTSCOPE3 = "exportscope3";
    public static final String FIELD_EXPORTSCOPE4 = "EXPORTSCOPE4";
    protected static final String DTOFIELD_EXPORTSCOPE4 = "exportscope4";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSDEID = "PPSDEID";
    protected static final String DTOFIELD_PPSDEID = "ppsdeid";
    public static final String FIELD_PPSDESERVICEAPIID = "PPSDESERVICEAPIID";
    protected static final String DTOFIELD_PPSDESERVICEAPIID = "ppsdeserviceapiid";
    public static final String FIELD_PPSDESERVICEAPINAME = "PPSDESERVICEAPINAME";
    protected static final String DTOFIELD_PPSDESERVICEAPINAME = "ppsdeserviceapiname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDESARSID = "PSDESARSID";
    protected static final String DTOFIELD_PSDESARSID = "psdesarsid";
    public static final String FIELD_PSDESARSNAME = "PSDESARSNAME";
    protected static final String DTOFIELD_PSDESARSNAME = "psdesarsname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_SYNCEXPORTMODEL = "SYNCEXPORTMODEL";
    protected static final String DTOFIELD_SYNCEXPORTMODEL = "syncexportmodel";
    public static final String FIELD_TEMPORDERVALUE = "TEMPORDERVALUE";
    protected static final String DTOFIELD_TEMPORDERVALUE = "tempordervalue";
    public static final String FIELD_TYPEFILTER = "TYPEFILTER";
    protected static final String DTOFIELD_TYPEFILTER = "typefilter";
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

    @JsonProperty(value="actionrsmode")
    public void setActionRSMode(Integer actionRSMode) {
        this._set(DTOFIELD_ACTIONRSMODE, actionRSMode);
    }

    @JsonIgnore
    public Integer getActionRSMode() {
        Object objValue = this._get(DTOFIELD_ACTIONRSMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionRSModeDirty() {
        return this._contains(DTOFIELD_ACTIONRSMODE);
    }

    @JsonIgnore
    public void resetActionRSMode() {
        this._reset(DTOFIELD_ACTIONRSMODE);
    }

    @JsonIgnore
    public PSDESARSDTO actionrsmode(Integer actionRSMode) {
        this.setActionRSMode(actionRSMode);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO actionrsmode(PSModelEnums.SADEActionRSMode actionRSMode) {
        if (actionRSMode == null) {
            this.setActionRSMode(null);
        } else {
            this.setActionRSMode(actionRSMode.value);
        }
        return this;
    }

    @JsonProperty(value="arrayflag")
    public void setArrayFlag(Integer arrayFlag) {
        this._set(DTOFIELD_ARRAYFLAG, arrayFlag);
    }

    @JsonIgnore
    public Integer getArrayFlag() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isArrayFlagDirty() {
        return this._contains(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public void resetArrayFlag() {
        this._reset(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public PSDESARSDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO arrayflag(Boolean arrayFlag) {
        if (arrayFlag == null) {
            this.setArrayFlag(null);
        } else {
            this.setArrayFlag(arrayFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="childfilter")
    public void setChildFilter(String childFilter) {
        this._set(DTOFIELD_CHILDFILTER, childFilter);
    }

    @JsonIgnore
    public String getChildFilter() {
        Object objValue = this._get(DTOFIELD_CHILDFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChildFilterDirty() {
        return this._contains(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public void resetChildFilter() {
        this._reset(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public PSDESARSDTO childfilter(String childFilter) {
        this.setChildFilter(childFilter);
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
    public PSDESARSDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSDESARSDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
        return this;
    }

    @JsonProperty(value="cpsdeid")
    public void setCPSDEId(String cPSDEId) {
        this._set(DTOFIELD_CPSDEID, cPSDEId);
    }

    @JsonIgnore
    public String getCPSDEId() {
        Object objValue = this._get(DTOFIELD_CPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSDEIdDirty() {
        return this._contains(DTOFIELD_CPSDEID);
    }

    @JsonIgnore
    public void resetCPSDEId() {
        this._reset(DTOFIELD_CPSDEID);
    }

    @JsonIgnore
    public PSDESARSDTO cpsdeid(String cPSDEId) {
        this.setCPSDEId(cPSDEId);
        return this;
    }

    @JsonProperty(value="cpsdeserviceapiid")
    public void setCPSDEServiceAPIId(String cPSDEServiceAPIId) {
        this._set(DTOFIELD_CPSDESERVICEAPIID, cPSDEServiceAPIId);
    }

    @JsonIgnore
    public String getCPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_CPSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_CPSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetCPSDEServiceAPIId() {
        this._reset(DTOFIELD_CPSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSDESARSDTO cpsdeserviceapiid(String cPSDEServiceAPIId) {
        this.setCPSDEServiceAPIId(cPSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO cpsdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setCPSDEId(null);
            this.setCPSDEServiceAPIId(null);
            this.setCPSDEServiceAPIName(null);
        } else {
            this.setCPSDEId(pSDEServiceAPI.getPSDEId());
            this.setCPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setCPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="cpsdeserviceapiname")
    public void setCPSDEServiceAPIName(String cPSDEServiceAPIName) {
        this._set(DTOFIELD_CPSDESERVICEAPINAME, cPSDEServiceAPIName);
    }

    @JsonIgnore
    public String getCPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_CPSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_CPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetCPSDEServiceAPIName() {
        this._reset(DTOFIELD_CPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESARSDTO cpsdeserviceapiname(String cPSDEServiceAPIName) {
        this.setCPSDEServiceAPIName(cPSDEServiceAPIName);
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
    public PSDESARSDTO createdate(Timestamp createDate) {
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
    public PSDESARSDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dataaccmode")
    public void setDataAccMode(Integer dataAccMode) {
        this._set(DTOFIELD_DATAACCMODE, dataAccMode);
    }

    @JsonIgnore
    public Integer getDataAccMode() {
        Object objValue = this._get(DTOFIELD_DATAACCMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDataAccModeDirty() {
        return this._contains(DTOFIELD_DATAACCMODE);
    }

    @JsonIgnore
    public void resetDataAccMode() {
        this._reset(DTOFIELD_DATAACCMODE);
    }

    @JsonIgnore
    public PSDESARSDTO dataaccmode(Integer dataAccMode) {
        this.setDataAccMode(dataAccMode);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO dataaccmode(PSModelEnums.DEDataAccCtrlMode dataAccMode) {
        if (dataAccMode == null) {
            this.setDataAccMode(null);
        } else {
            this.setDataAccMode(dataAccMode.value);
        }
        return this;
    }

    @JsonProperty(value="datarsmode")
    public void setDataRSMode(Integer dataRSMode) {
        this._set(DTOFIELD_DATARSMODE, dataRSMode);
    }

    @JsonIgnore
    public Integer getDataRSMode() {
        Object objValue = this._get(DTOFIELD_DATARSMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDataRSModeDirty() {
        return this._contains(DTOFIELD_DATARSMODE);
    }

    @JsonIgnore
    public void resetDataRSMode() {
        this._reset(DTOFIELD_DATARSMODE);
    }

    @JsonIgnore
    public PSDESARSDTO datarsmode(Integer dataRSMode) {
        this.setDataRSMode(dataRSMode);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO datarsmode(PSModelEnums.SADEDataRSMode[] dataRSMode) {
        if (dataRSMode == null || dataRSMode.length == 0) {
            this.setDataRSMode(null);
        } else {
            int _value = 0;
            for (PSModelEnums.SADEDataRSMode _item : dataRSMode) {
                _value |= _item.value;
            }
            this.setDataRSMode(_value);
        }
        return this;
    }

    @JsonProperty(value="enabledataexport")
    public void setEnableDataExport(Integer enableDataExport) {
        this._set(DTOFIELD_ENABLEDATAEXPORT, enableDataExport);
    }

    @JsonIgnore
    public Integer getEnableDataExport() {
        Object objValue = this._get(DTOFIELD_ENABLEDATAEXPORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDataExportDirty() {
        return this._contains(DTOFIELD_ENABLEDATAEXPORT);
    }

    @JsonIgnore
    public void resetEnableDataExport() {
        this._reset(DTOFIELD_ENABLEDATAEXPORT);
    }

    @JsonIgnore
    public PSDESARSDTO enabledataexport(Integer enableDataExport) {
        this.setEnableDataExport(enableDataExport);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO enabledataexport(Boolean enableDataExport) {
        if (enableDataExport == null) {
            this.setEnableDataExport(null);
        } else {
            this.setEnableDataExport(enableDataExport != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledataimport")
    public void setEnableDataImport(Integer enableDataImport) {
        this._set(DTOFIELD_ENABLEDATAIMPORT, enableDataImport);
    }

    @JsonIgnore
    public Integer getEnableDataImport() {
        Object objValue = this._get(DTOFIELD_ENABLEDATAIMPORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDataImportDirty() {
        return this._contains(DTOFIELD_ENABLEDATAIMPORT);
    }

    @JsonIgnore
    public void resetEnableDataImport() {
        this._reset(DTOFIELD_ENABLEDATAIMPORT);
    }

    @JsonIgnore
    public PSDESARSDTO enabledataimport(Integer enableDataImport) {
        this.setEnableDataImport(enableDataImport);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO enabledataimport(Boolean enableDataImport) {
        if (enableDataImport == null) {
            this.setEnableDataImport(null);
        } else {
            this.setEnableDataImport(enableDataImport != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabledeaction")
    public void setEnableDEAction(Integer enableDEAction) {
        this._set(DTOFIELD_ENABLEDEACTION, enableDEAction);
    }

    @JsonIgnore
    public Integer getEnableDEAction() {
        Object objValue = this._get(DTOFIELD_ENABLEDEACTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDEActionDirty() {
        return this._contains(DTOFIELD_ENABLEDEACTION);
    }

    @JsonIgnore
    public void resetEnableDEAction() {
        this._reset(DTOFIELD_ENABLEDEACTION);
    }

    @JsonIgnore
    public PSDESARSDTO enabledeaction(Integer enableDEAction) {
        this.setEnableDEAction(enableDEAction);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO enabledeaction(Boolean enableDEAction) {
        if (enableDEAction == null) {
            this.setEnableDEAction(null);
        } else {
            this.setEnableDEAction(enableDEAction != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablededataset")
    public void setEnableDEDataSet(Integer enableDEDataSet) {
        this._set(DTOFIELD_ENABLEDEDATASET, enableDEDataSet);
    }

    @JsonIgnore
    public Integer getEnableDEDataSet() {
        Object objValue = this._get(DTOFIELD_ENABLEDEDATASET);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDEDataSetDirty() {
        return this._contains(DTOFIELD_ENABLEDEDATASET);
    }

    @JsonIgnore
    public void resetEnableDEDataSet() {
        this._reset(DTOFIELD_ENABLEDEDATASET);
    }

    @JsonIgnore
    public PSDESARSDTO enablededataset(Integer enableDEDataSet) {
        this.setEnableDEDataSet(enableDEDataSet);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO enablededataset(Boolean enableDEDataSet) {
        if (enableDEDataSet == null) {
            this.setEnableDEDataSet(null);
        } else {
            this.setEnableDEDataSet(enableDEDataSet != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableselect")
    public void setEnableSelect(Integer enableSelect) {
        this._set(DTOFIELD_ENABLESELECT, enableSelect);
    }

    @JsonIgnore
    public Integer getEnableSelect() {
        Object objValue = this._get(DTOFIELD_ENABLESELECT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSelectDirty() {
        return this._contains(DTOFIELD_ENABLESELECT);
    }

    @JsonIgnore
    public void resetEnableSelect() {
        this._reset(DTOFIELD_ENABLESELECT);
    }

    @JsonIgnore
    public PSDESARSDTO enableselect(Integer enableSelect) {
        this.setEnableSelect(enableSelect);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO enableselect(Boolean enableSelect) {
        if (enableSelect == null) {
            this.setEnableSelect(null);
        } else {
            this.setEnableSelect(enableSelect != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="exportmodel")
    public void setExportModel(Integer exportModel) {
        this._set(DTOFIELD_EXPORTMODEL, exportModel);
    }

    @JsonIgnore
    public Integer getExportModel() {
        Object objValue = this._get(DTOFIELD_EXPORTMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportModelDirty() {
        return this._contains(DTOFIELD_EXPORTMODEL);
    }

    @JsonIgnore
    public void resetExportModel() {
        this._reset(DTOFIELD_EXPORTMODEL);
    }

    @JsonIgnore
    public PSDESARSDTO exportmodel(Integer exportModel) {
        this.setExportModel(exportModel);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO exportmodel(PSModelEnums.DERExportLevel exportModel) {
        if (exportModel == null) {
            this.setExportModel(null);
        } else {
            this.setExportModel(exportModel.value);
        }
        return this;
    }

    @JsonProperty(value="exportscope")
    public void setExportScope(Integer exportScope) {
        this._set(DTOFIELD_EXPORTSCOPE, exportScope);
    }

    @JsonIgnore
    public Integer getExportScope() {
        Object objValue = this._get(DTOFIELD_EXPORTSCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportScopeDirty() {
        return this._contains(DTOFIELD_EXPORTSCOPE);
    }

    @JsonIgnore
    public void resetExportScope() {
        this._reset(DTOFIELD_EXPORTSCOPE);
    }

    @JsonIgnore
    public PSDESARSDTO exportscope(Integer exportScope) {
        this.setExportScope(exportScope);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO exportscope(PSModelEnums.DEExportModelScope2 exportScope) {
        if (exportScope == null) {
            this.setExportScope(null);
        } else {
            this.setExportScope(exportScope.value);
        }
        return this;
    }

    @JsonProperty(value="exportscope2")
    public void setExportScope2(Integer exportScope2) {
        this._set(DTOFIELD_EXPORTSCOPE2, exportScope2);
    }

    @JsonIgnore
    public Integer getExportScope2() {
        Object objValue = this._get(DTOFIELD_EXPORTSCOPE2);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportScope2Dirty() {
        return this._contains(DTOFIELD_EXPORTSCOPE2);
    }

    @JsonIgnore
    public void resetExportScope2() {
        this._reset(DTOFIELD_EXPORTSCOPE2);
    }

    @JsonIgnore
    public PSDESARSDTO exportscope2(Integer exportScope2) {
        this.setExportScope2(exportScope2);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO exportscope2(PSModelEnums.DEExportModelScope2 exportScope2) {
        if (exportScope2 == null) {
            this.setExportScope2(null);
        } else {
            this.setExportScope2(exportScope2.value);
        }
        return this;
    }

    @JsonProperty(value="exportscope3")
    public void setExportScope3(Integer exportScope3) {
        this._set(DTOFIELD_EXPORTSCOPE3, exportScope3);
    }

    @JsonIgnore
    public Integer getExportScope3() {
        Object objValue = this._get(DTOFIELD_EXPORTSCOPE3);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportScope3Dirty() {
        return this._contains(DTOFIELD_EXPORTSCOPE3);
    }

    @JsonIgnore
    public void resetExportScope3() {
        this._reset(DTOFIELD_EXPORTSCOPE3);
    }

    @JsonIgnore
    public PSDESARSDTO exportscope3(Integer exportScope3) {
        this.setExportScope3(exportScope3);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO exportscope3(PSModelEnums.DEExportModelScope2 exportScope3) {
        if (exportScope3 == null) {
            this.setExportScope3(null);
        } else {
            this.setExportScope3(exportScope3.value);
        }
        return this;
    }

    @JsonProperty(value="exportscope4")
    public void setExportScope4(Integer exportScope4) {
        this._set(DTOFIELD_EXPORTSCOPE4, exportScope4);
    }

    @JsonIgnore
    public Integer getExportScope4() {
        Object objValue = this._get(DTOFIELD_EXPORTSCOPE4);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportScope4Dirty() {
        return this._contains(DTOFIELD_EXPORTSCOPE4);
    }

    @JsonIgnore
    public void resetExportScope4() {
        this._reset(DTOFIELD_EXPORTSCOPE4);
    }

    @JsonIgnore
    public PSDESARSDTO exportscope4(Integer exportScope4) {
        this.setExportScope4(exportScope4);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO exportscope4(PSModelEnums.DEExportModelScope2 exportScope4) {
        if (exportScope4 == null) {
            this.setExportScope4(null);
        } else {
            this.setExportScope4(exportScope4.value);
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
    public PSDESARSDTO memo(String memo) {
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
    public PSDESARSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsdeid")
    public void setPPSDEId(String pPSDEId) {
        this._set(DTOFIELD_PPSDEID, pPSDEId);
    }

    @JsonIgnore
    public String getPPSDEId() {
        Object objValue = this._get(DTOFIELD_PPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEIdDirty() {
        return this._contains(DTOFIELD_PPSDEID);
    }

    @JsonIgnore
    public void resetPPSDEId() {
        this._reset(DTOFIELD_PPSDEID);
    }

    @JsonIgnore
    public PSDESARSDTO ppsdeid(String pPSDEId) {
        this.setPPSDEId(pPSDEId);
        return this;
    }

    @JsonProperty(value="ppsdeserviceapiid")
    public void setPPSDEServiceAPIId(String pPSDEServiceAPIId) {
        this._set(DTOFIELD_PPSDESERVICEAPIID, pPSDEServiceAPIId);
    }

    @JsonIgnore
    public String getPPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PPSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PPSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetPPSDEServiceAPIId() {
        this._reset(DTOFIELD_PPSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSDESARSDTO ppsdeserviceapiid(String pPSDEServiceAPIId) {
        this.setPPSDEServiceAPIId(pPSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO ppsdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setPPSDEId(null);
            this.setPPSDEServiceAPIId(null);
            this.setPPSDEServiceAPIName(null);
        } else {
            this.setPPSDEId(pSDEServiceAPI.getPSDEId());
            this.setPPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="ppsdeserviceapiname")
    public void setPPSDEServiceAPIName(String pPSDEServiceAPIName) {
        this._set(DTOFIELD_PPSDESERVICEAPINAME, pPSDEServiceAPIName);
    }

    @JsonIgnore
    public String getPPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PPSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_PPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPPSDEServiceAPIName() {
        this._reset(DTOFIELD_PPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESARSDTO ppsdeserviceapiname(String pPSDEServiceAPIName) {
        this.setPPSDEServiceAPIName(pPSDEServiceAPIName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDESARSDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDESARSDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="psdesarsid")
    public void setPSDESARSId(String pSDESARSId) {
        this._set(DTOFIELD_PSDESARSID, pSDESARSId);
    }

    @JsonIgnore
    public String getPSDESARSId() {
        Object objValue = this._get(DTOFIELD_PSDESARSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESARSIdDirty() {
        return this._contains(DTOFIELD_PSDESARSID);
    }

    @JsonIgnore
    public void resetPSDESARSId() {
        this._reset(DTOFIELD_PSDESARSID);
    }

    @JsonIgnore
    public PSDESARSDTO psdesarsid(String pSDESARSId) {
        this.setPSDESARSId(pSDESARSId);
        return this;
    }

    @JsonProperty(value="psdesarsname")
    public void setPSDESARSName(String pSDESARSName) {
        this._set(DTOFIELD_PSDESARSNAME, pSDESARSName);
    }

    @JsonIgnore
    public String getPSDESARSName() {
        Object objValue = this._get(DTOFIELD_PSDESARSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESARSNameDirty() {
        return this._contains(DTOFIELD_PSDESARSNAME);
    }

    @JsonIgnore
    public void resetPSDESARSName() {
        this._reset(DTOFIELD_PSDESARSNAME);
    }

    @JsonIgnore
    public PSDESARSDTO psdesarsname(String pSDESARSName) {
        this.setPSDESARSName(pSDESARSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDESARSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDESARSName(strName);
    }

    @JsonIgnore
    public PSDESARSDTO name(String strName) {
        this.setPSDESARSName(strName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSDESARSDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
        if (pSSysServiceAPI == null) {
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        } else {
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssysserviceapiname")
    public void setPSSysServiceAPIName(String pSSysServiceAPIName) {
        this._set(DTOFIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIName() {
        this._reset(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESARSDTO pssysserviceapiname(String pSSysServiceAPIName) {
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="syncexportmodel")
    public void setSyncExportModel(Integer syncExportModel) {
        this._set(DTOFIELD_SYNCEXPORTMODEL, syncExportModel);
    }

    @JsonIgnore
    public Integer getSyncExportModel() {
        Object objValue = this._get(DTOFIELD_SYNCEXPORTMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSyncExportModelDirty() {
        return this._contains(DTOFIELD_SYNCEXPORTMODEL);
    }

    @JsonIgnore
    public void resetSyncExportModel() {
        this._reset(DTOFIELD_SYNCEXPORTMODEL);
    }

    @JsonIgnore
    public PSDESARSDTO syncexportmodel(Integer syncExportModel) {
        this.setSyncExportModel(syncExportModel);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO syncexportmodel(PSModelEnums.DERDataSyncAction syncExportModel) {
        if (syncExportModel == null) {
            this.setSyncExportModel(null);
        } else {
            this.setSyncExportModel(syncExportModel.value);
        }
        return this;
    }

    @JsonProperty(value="tempordervalue")
    public void setTempOrderValue(Integer tempOrderValue) {
        this._set(DTOFIELD_TEMPORDERVALUE, tempOrderValue);
    }

    @JsonIgnore
    public Integer getTempOrderValue() {
        Object objValue = this._get(DTOFIELD_TEMPORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTempOrderValueDirty() {
        return this._contains(DTOFIELD_TEMPORDERVALUE);
    }

    @JsonIgnore
    public void resetTempOrderValue() {
        this._reset(DTOFIELD_TEMPORDERVALUE);
    }

    @JsonIgnore
    public PSDESARSDTO tempordervalue(Integer tempOrderValue) {
        this.setTempOrderValue(tempOrderValue);
        return this;
    }

    @JsonProperty(value="typefilter")
    public void setTypeFilter(String typeFilter) {
        this._set(DTOFIELD_TYPEFILTER, typeFilter);
    }

    @JsonIgnore
    public String getTypeFilter() {
        Object objValue = this._get(DTOFIELD_TYPEFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypeFilterDirty() {
        return this._contains(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public void resetTypeFilter() {
        this._reset(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public PSDESARSDTO typefilter(String typeFilter) {
        this.setTypeFilter(typeFilter);
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
    public PSDESARSDTO updatedate(Timestamp updateDate) {
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
    public PSDESARSDTO updateman(String updateMan) {
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
    public PSDESARSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDESARSDTO usertag(String userTag) {
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
    public PSDESARSDTO usertag2(String userTag2) {
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
    public PSDESARSDTO usertag3(String userTag3) {
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
    public PSDESARSDTO usertag4(String userTag4) {
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
    public PSDESARSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDESARSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDESARSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDESARSId(strValue);
    }

    @JsonIgnore
    public PSDESARSDTO id(String strValue) {
        this.setPSDESARSId(strValue);
        return this;
    }
}
