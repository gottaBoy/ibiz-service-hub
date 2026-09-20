/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DataSyncDir
 *  net.ibizsys.model.PSModelEnums$DataSyncInformType
 *  net.ibizsys.model.PSModelEnums$DataSyncOutMode
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$ScriptMode
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDataSyncAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataSyncDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DENAMES = "DENAMES";
    protected static final String DTOFIELD_DENAMES = "denames";
    public static final String FIELD_EVENTTYPE = "EVENTTYPE";
    protected static final String DTOFIELD_EVENTTYPE = "eventtype";
    public static final String FIELD_EXPORTFULL = "EXPORTFULL";
    protected static final String DTOFIELD_EXPORTFULL = "exportfull";
    public static final String FIELD_FILTERMODEL = "FILTERMODEL";
    protected static final String DTOFIELD_FILTERMODEL = "filtermodel";
    public static final String FIELD_IMPORTPSDEACTIONID = "IMPORTPSDEACTIONID";
    protected static final String DTOFIELD_IMPORTPSDEACTIONID = "importpsdeactionid";
    public static final String FIELD_IMPORTPSDEACTIONNAME = "IMPORTPSDEACTIONNAME";
    protected static final String DTOFIELD_IMPORTPSDEACTIONNAME = "importpsdeactionname";
    public static final String FIELD_INCUSTOMCODE = "INCUSTOMCODE";
    protected static final String DTOFIELD_INCUSTOMCODE = "incustomcode";
    public static final String FIELD_INCUSTOMMODE = "INCUSTOMMODE";
    protected static final String DTOFIELD_INCUSTOMMODE = "incustommode";
    public static final String FIELD_INPSDEACTIONID = "INPSDEACTIONID";
    protected static final String DTOFIELD_INPSDEACTIONID = "inpsdeactionid";
    public static final String FIELD_INPSDEACTIONNAME = "INPSDEACTIONNAME";
    protected static final String DTOFIELD_INPSDEACTIONNAME = "inpsdeactionname";
    public static final String FIELD_INPSDEDATASETID = "INPSDEDATASETID";
    protected static final String DTOFIELD_INPSDEDATASETID = "inpsdedatasetid";
    public static final String FIELD_INPSDEDATASETNAME = "INPSDEDATASETNAME";
    protected static final String DTOFIELD_INPSDEDATASETNAME = "inpsdedatasetname";
    public static final String FIELD_INPSSYSDATASYNCAGENTID = "INPSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_INPSSYSDATASYNCAGENTID = "inpssysdatasyncagentid";
    public static final String FIELD_INPSSYSDATASYNCAGENTNAME = "INPSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_INPSSYSDATASYNCAGENTNAME = "inpssysdatasyncagentname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_OUTCUSTOMCODE = "OUTCUSTOMCODE";
    protected static final String DTOFIELD_OUTCUSTOMCODE = "outcustomcode";
    public static final String FIELD_OUTCUSTOMMODE = "OUTCUSTOMMODE";
    protected static final String DTOFIELD_OUTCUSTOMMODE = "outcustommode";
    public static final String FIELD_OUTMODE = "OUTMODE";
    protected static final String DTOFIELD_OUTMODE = "outmode";
    public static final String FIELD_OUTPSDEACTIONID = "OUTPSDEACTIONID";
    protected static final String DTOFIELD_OUTPSDEACTIONID = "outpsdeactionid";
    public static final String FIELD_OUTPSDEACTIONNAME = "OUTPSDEACTIONNAME";
    protected static final String DTOFIELD_OUTPSDEACTIONNAME = "outpsdeactionname";
    public static final String FIELD_OUTPSDEDATASETID = "OUTPSDEDATASETID";
    protected static final String DTOFIELD_OUTPSDEDATASETID = "outpsdedatasetid";
    public static final String FIELD_OUTPSDEDATASETNAME = "OUTPSDEDATASETNAME";
    protected static final String DTOFIELD_OUTPSDEDATASETNAME = "outpsdedatasetname";
    public static final String FIELD_OUTPSSYSDATASYNCAGENTID = "OUTPSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_OUTPSSYSDATASYNCAGENTID = "outpssysdatasyncagentid";
    public static final String FIELD_OUTPSSYSDATASYNCAGENTNAME = "OUTPSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_OUTPSSYSDATASYNCAGENTNAME = "outpssysdatasyncagentname";
    public static final String FIELD_OUTTIMER = "OUTTIMER";
    protected static final String DTOFIELD_OUTTIMER = "outtimer";
    public static final String FIELD_PSDEDATASYNCID = "PSDEDATASYNCID";
    protected static final String DTOFIELD_PSDEDATASYNCID = "psdedatasyncid";
    public static final String FIELD_PSDEDATASYNCNAME = "PSDEDATASYNCNAME";
    protected static final String DTOFIELD_PSDEDATASYNCNAME = "psdedatasyncname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_SYNCDIR = "SYNCDIR";
    protected static final String DTOFIELD_SYNCDIR = "syncdir";
    public static final String FIELD_SYNCEXPORT = "SYNCEXPORT";
    protected static final String DTOFIELD_SYNCEXPORT = "syncexport";
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
    public PSDEDataSyncDTO codename(String codeName) {
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
    public PSDEDataSyncDTO createdate(Timestamp createDate) {
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
    public PSDEDataSyncDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="denames")
    public void setDENames(String dENames) {
        this._set(DTOFIELD_DENAMES, dENames);
    }

    @JsonIgnore
    public String getDENames() {
        Object objValue = this._get(DTOFIELD_DENAMES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDENamesDirty() {
        return this._contains(DTOFIELD_DENAMES);
    }

    @JsonIgnore
    public void resetDENames() {
        this._reset(DTOFIELD_DENAMES);
    }

    @JsonIgnore
    public PSDEDataSyncDTO denames(String dENames) {
        this.setDENames(dENames);
        return this;
    }

    @JsonProperty(value="eventtype")
    public void setEventType(Integer eventType) {
        this._set(DTOFIELD_EVENTTYPE, eventType);
    }

    @JsonIgnore
    public Integer getEventType() {
        Object objValue = this._get(DTOFIELD_EVENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEventTypeDirty() {
        return this._contains(DTOFIELD_EVENTTYPE);
    }

    @JsonIgnore
    public void resetEventType() {
        this._reset(DTOFIELD_EVENTTYPE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO eventtype(Integer eventType) {
        this.setEventType(eventType);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO eventtype(PSModelEnums.DataSyncInformType[] eventType) {
        if (eventType == null || eventType.length == 0) {
            this.setEventType(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DataSyncInformType _item : eventType) {
                _value |= _item.value;
            }
            this.setEventType(_value);
        }
        return this;
    }

    @JsonProperty(value="exportfull")
    public void setExportFull(Integer exportFull) {
        this._set(DTOFIELD_EXPORTFULL, exportFull);
    }

    @JsonIgnore
    public Integer getExportFull() {
        Object objValue = this._get(DTOFIELD_EXPORTFULL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExportFullDirty() {
        return this._contains(DTOFIELD_EXPORTFULL);
    }

    @JsonIgnore
    public void resetExportFull() {
        this._reset(DTOFIELD_EXPORTFULL);
    }

    @JsonIgnore
    public PSDEDataSyncDTO exportfull(Integer exportFull) {
        this.setExportFull(exportFull);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO exportfull(Boolean exportFull) {
        if (exportFull == null) {
            this.setExportFull(null);
        } else {
            this.setExportFull(exportFull != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="filtermodel")
    public void setFilterModel(String filterModel) {
        this._set(DTOFIELD_FILTERMODEL, filterModel);
    }

    @JsonIgnore
    public String getFilterModel() {
        Object objValue = this._get(DTOFIELD_FILTERMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterModelDirty() {
        return this._contains(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public void resetFilterModel() {
        this._reset(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public PSDEDataSyncDTO filtermodel(String filterModel) {
        this.setFilterModel(filterModel);
        return this;
    }

    @JsonProperty(value="importpsdeactionid")
    public void setImportPSDEActionId(String importPSDEActionId) {
        this._set(DTOFIELD_IMPORTPSDEACTIONID, importPSDEActionId);
    }

    @JsonIgnore
    public String getImportPSDEActionId() {
        Object objValue = this._get(DTOFIELD_IMPORTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImportPSDEActionIdDirty() {
        return this._contains(DTOFIELD_IMPORTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetImportPSDEActionId() {
        this._reset(DTOFIELD_IMPORTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO importpsdeactionid(String importPSDEActionId) {
        this.setImportPSDEActionId(importPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO importpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setImportPSDEActionId(null);
            this.setImportPSDEActionName(null);
        } else {
            this.setImportPSDEActionId(pSDEAction.getPSDEActionId());
            this.setImportPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="importpsdeactionname")
    public void setImportPSDEActionName(String importPSDEActionName) {
        this._set(DTOFIELD_IMPORTPSDEACTIONNAME, importPSDEActionName);
    }

    @JsonIgnore
    public String getImportPSDEActionName() {
        Object objValue = this._get(DTOFIELD_IMPORTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isImportPSDEActionNameDirty() {
        return this._contains(DTOFIELD_IMPORTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetImportPSDEActionName() {
        this._reset(DTOFIELD_IMPORTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO importpsdeactionname(String importPSDEActionName) {
        this.setImportPSDEActionName(importPSDEActionName);
        return this;
    }

    @JsonProperty(value="incustomcode")
    public void setInCustomCode(String inCustomCode) {
        this._set(DTOFIELD_INCUSTOMCODE, inCustomCode);
    }

    @JsonIgnore
    public String getInCustomCode() {
        Object objValue = this._get(DTOFIELD_INCUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInCustomCodeDirty() {
        return this._contains(DTOFIELD_INCUSTOMCODE);
    }

    @JsonIgnore
    public void resetInCustomCode() {
        this._reset(DTOFIELD_INCUSTOMCODE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO incustomcode(String inCustomCode) {
        this.setInCustomCode(inCustomCode);
        return this;
    }

    @JsonProperty(value="incustommode")
    public void setInCustomMode(Integer inCustomMode) {
        this._set(DTOFIELD_INCUSTOMMODE, inCustomMode);
    }

    @JsonIgnore
    public Integer getInCustomMode() {
        Object objValue = this._get(DTOFIELD_INCUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInCustomModeDirty() {
        return this._contains(DTOFIELD_INCUSTOMMODE);
    }

    @JsonIgnore
    public void resetInCustomMode() {
        this._reset(DTOFIELD_INCUSTOMMODE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO incustommode(Integer inCustomMode) {
        this.setInCustomMode(inCustomMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO incustommode(PSModelEnums.ScriptMode inCustomMode) {
        if (inCustomMode == null) {
            this.setInCustomMode(null);
        } else {
            this.setInCustomMode(inCustomMode.value);
        }
        return this;
    }

    @JsonProperty(value="inpsdeactionid")
    public void setInPSDEActionId(String inPSDEActionId) {
        this._set(DTOFIELD_INPSDEACTIONID, inPSDEActionId);
    }

    @JsonIgnore
    public String getInPSDEActionId() {
        Object objValue = this._get(DTOFIELD_INPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEActionIdDirty() {
        return this._contains(DTOFIELD_INPSDEACTIONID);
    }

    @JsonIgnore
    public void resetInPSDEActionId() {
        this._reset(DTOFIELD_INPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdeactionid(String inPSDEActionId) {
        this.setInPSDEActionId(inPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setInPSDEActionId(null);
            this.setInPSDEActionName(null);
        } else {
            this.setInPSDEActionId(pSDEAction.getPSDEActionId());
            this.setInPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="inpsdeactionname")
    public void setInPSDEActionName(String inPSDEActionName) {
        this._set(DTOFIELD_INPSDEACTIONNAME, inPSDEActionName);
    }

    @JsonIgnore
    public String getInPSDEActionName() {
        Object objValue = this._get(DTOFIELD_INPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEActionNameDirty() {
        return this._contains(DTOFIELD_INPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetInPSDEActionName() {
        this._reset(DTOFIELD_INPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdeactionname(String inPSDEActionName) {
        this.setInPSDEActionName(inPSDEActionName);
        return this;
    }

    @JsonProperty(value="inpsdedatasetid")
    public void setInPSDEDataSetId(String inPSDEDataSetId) {
        this._set(DTOFIELD_INPSDEDATASETID, inPSDEDataSetId);
    }

    @JsonIgnore
    public String getInPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_INPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_INPSDEDATASETID);
    }

    @JsonIgnore
    public void resetInPSDEDataSetId() {
        this._reset(DTOFIELD_INPSDEDATASETID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdedatasetid(String inPSDEDataSetId) {
        this.setInPSDEDataSetId(inPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setInPSDEDataSetId(null);
            this.setInPSDEDataSetName(null);
        } else {
            this.setInPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setInPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="inpsdedatasetname")
    public void setInPSDEDataSetName(String inPSDEDataSetName) {
        this._set(DTOFIELD_INPSDEDATASETNAME, inPSDEDataSetName);
    }

    @JsonIgnore
    public String getInPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_INPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_INPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetInPSDEDataSetName() {
        this._reset(DTOFIELD_INPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpsdedatasetname(String inPSDEDataSetName) {
        this.setInPSDEDataSetName(inPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="inpssysdatasyncagentid")
    public void setInPSSysDataSyncAgentId(String inPSSysDataSyncAgentId) {
        this._set(DTOFIELD_INPSSYSDATASYNCAGENTID, inPSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getInPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_INPSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_INPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetInPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_INPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpssysdatasyncagentid(String inPSSysDataSyncAgentId) {
        this.setInPSSysDataSyncAgentId(inPSSysDataSyncAgentId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent) {
        if (pSSysDataSyncAgent == null) {
            this.setInPSSysDataSyncAgentId(null);
            this.setInPSSysDataSyncAgentName(null);
        } else {
            this.setInPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setInPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    @JsonProperty(value="inpssysdatasyncagentname")
    public void setInPSSysDataSyncAgentName(String inPSSysDataSyncAgentName) {
        this._set(DTOFIELD_INPSSYSDATASYNCAGENTNAME, inPSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getInPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetInPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_INPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO inpssysdatasyncagentname(String inPSSysDataSyncAgentName) {
        this.setInPSSysDataSyncAgentName(inPSSysDataSyncAgentName);
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
    public PSDEDataSyncDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="outcustomcode")
    public void setOutCustomCode(String outCustomCode) {
        this._set(DTOFIELD_OUTCUSTOMCODE, outCustomCode);
    }

    @JsonIgnore
    public String getOutCustomCode() {
        Object objValue = this._get(DTOFIELD_OUTCUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutCustomCodeDirty() {
        return this._contains(DTOFIELD_OUTCUSTOMCODE);
    }

    @JsonIgnore
    public void resetOutCustomCode() {
        this._reset(DTOFIELD_OUTCUSTOMCODE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outcustomcode(String outCustomCode) {
        this.setOutCustomCode(outCustomCode);
        return this;
    }

    @JsonProperty(value="outcustommode")
    public void setOutCustomMode(Integer outCustomMode) {
        this._set(DTOFIELD_OUTCUSTOMMODE, outCustomMode);
    }

    @JsonIgnore
    public Integer getOutCustomMode() {
        Object objValue = this._get(DTOFIELD_OUTCUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOutCustomModeDirty() {
        return this._contains(DTOFIELD_OUTCUSTOMMODE);
    }

    @JsonIgnore
    public void resetOutCustomMode() {
        this._reset(DTOFIELD_OUTCUSTOMMODE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outcustommode(Integer outCustomMode) {
        this.setOutCustomMode(outCustomMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO outcustommode(PSModelEnums.ScriptMode outCustomMode) {
        if (outCustomMode == null) {
            this.setOutCustomMode(null);
        } else {
            this.setOutCustomMode(outCustomMode.value);
        }
        return this;
    }

    @JsonProperty(value="outmode")
    public void setOutMode(Integer outMode) {
        this._set(DTOFIELD_OUTMODE, outMode);
    }

    @JsonIgnore
    public Integer getOutMode() {
        Object objValue = this._get(DTOFIELD_OUTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOutModeDirty() {
        return this._contains(DTOFIELD_OUTMODE);
    }

    @JsonIgnore
    public void resetOutMode() {
        this._reset(DTOFIELD_OUTMODE);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outmode(Integer outMode) {
        this.setOutMode(outMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO outmode(PSModelEnums.DataSyncOutMode outMode) {
        if (outMode == null) {
            this.setOutMode(null);
        } else {
            this.setOutMode(outMode.value);
        }
        return this;
    }

    @JsonProperty(value="outpsdeactionid")
    public void setOutPSDEActionId(String outPSDEActionId) {
        this._set(DTOFIELD_OUTPSDEACTIONID, outPSDEActionId);
    }

    @JsonIgnore
    public String getOutPSDEActionId() {
        Object objValue = this._get(DTOFIELD_OUTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEActionIdDirty() {
        return this._contains(DTOFIELD_OUTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetOutPSDEActionId() {
        this._reset(DTOFIELD_OUTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdeactionid(String outPSDEActionId) {
        this.setOutPSDEActionId(outPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setOutPSDEActionId(null);
            this.setOutPSDEActionName(null);
        } else {
            this.setOutPSDEActionId(pSDEAction.getPSDEActionId());
            this.setOutPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="outpsdeactionname")
    public void setOutPSDEActionName(String outPSDEActionName) {
        this._set(DTOFIELD_OUTPSDEACTIONNAME, outPSDEActionName);
    }

    @JsonIgnore
    public String getOutPSDEActionName() {
        Object objValue = this._get(DTOFIELD_OUTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEActionNameDirty() {
        return this._contains(DTOFIELD_OUTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetOutPSDEActionName() {
        this._reset(DTOFIELD_OUTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdeactionname(String outPSDEActionName) {
        this.setOutPSDEActionName(outPSDEActionName);
        return this;
    }

    @JsonProperty(value="outpsdedatasetid")
    public void setOutPSDEDataSetId(String outPSDEDataSetId) {
        this._set(DTOFIELD_OUTPSDEDATASETID, outPSDEDataSetId);
    }

    @JsonIgnore
    public String getOutPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_OUTPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_OUTPSDEDATASETID);
    }

    @JsonIgnore
    public void resetOutPSDEDataSetId() {
        this._reset(DTOFIELD_OUTPSDEDATASETID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdedatasetid(String outPSDEDataSetId) {
        this.setOutPSDEDataSetId(outPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setOutPSDEDataSetId(null);
            this.setOutPSDEDataSetName(null);
        } else {
            this.setOutPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setOutPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="outpsdedatasetname")
    public void setOutPSDEDataSetName(String outPSDEDataSetName) {
        this._set(DTOFIELD_OUTPSDEDATASETNAME, outPSDEDataSetName);
    }

    @JsonIgnore
    public String getOutPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_OUTPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_OUTPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetOutPSDEDataSetName() {
        this._reset(DTOFIELD_OUTPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpsdedatasetname(String outPSDEDataSetName) {
        this.setOutPSDEDataSetName(outPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="outpssysdatasyncagentid")
    public void setOutPSSysDataSyncAgentId(String outPSSysDataSyncAgentId) {
        this._set(DTOFIELD_OUTPSSYSDATASYNCAGENTID, outPSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getOutPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetOutPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_OUTPSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpssysdatasyncagentid(String outPSSysDataSyncAgentId) {
        this.setOutPSSysDataSyncAgentId(outPSSysDataSyncAgentId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent) {
        if (pSSysDataSyncAgent == null) {
            this.setOutPSSysDataSyncAgentId(null);
            this.setOutPSSysDataSyncAgentName(null);
        } else {
            this.setOutPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setOutPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    @JsonProperty(value="outpssysdatasyncagentname")
    public void setOutPSSysDataSyncAgentName(String outPSSysDataSyncAgentName) {
        this._set(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME, outPSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getOutPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetOutPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_OUTPSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outpssysdatasyncagentname(String outPSSysDataSyncAgentName) {
        this.setOutPSSysDataSyncAgentName(outPSSysDataSyncAgentName);
        return this;
    }

    @JsonProperty(value="outtimer")
    public void setOutTimer(Integer outTimer) {
        this._set(DTOFIELD_OUTTIMER, outTimer);
    }

    @JsonIgnore
    public Integer getOutTimer() {
        Object objValue = this._get(DTOFIELD_OUTTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOutTimerDirty() {
        return this._contains(DTOFIELD_OUTTIMER);
    }

    @JsonIgnore
    public void resetOutTimer() {
        this._reset(DTOFIELD_OUTTIMER);
    }

    @JsonIgnore
    public PSDEDataSyncDTO outtimer(Integer outTimer) {
        this.setOutTimer(outTimer);
        return this;
    }

    @JsonProperty(value="psdedatasyncid")
    public void setPSDEDataSyncId(String pSDEDataSyncId) {
        this._set(DTOFIELD_PSDEDATASYNCID, pSDEDataSyncId);
    }

    @JsonIgnore
    public String getPSDEDataSyncId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASYNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSyncIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASYNCID);
    }

    @JsonIgnore
    public void resetPSDEDataSyncId() {
        this._reset(DTOFIELD_PSDEDATASYNCID);
    }

    @JsonIgnore
    public PSDEDataSyncDTO psdedatasyncid(String pSDEDataSyncId) {
        this.setPSDEDataSyncId(pSDEDataSyncId);
        return this;
    }

    @JsonProperty(value="psdedatasyncname")
    public void setPSDEDataSyncName(String pSDEDataSyncName) {
        this._set(DTOFIELD_PSDEDATASYNCNAME, pSDEDataSyncName);
    }

    @JsonIgnore
    public String getPSDEDataSyncName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASYNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSyncNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASYNCNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSyncName() {
        this._reset(DTOFIELD_PSDEDATASYNCNAME);
    }

    @JsonIgnore
    public PSDEDataSyncDTO psdedatasyncname(String pSDEDataSyncName) {
        this.setPSDEDataSyncName(pSDEDataSyncName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataSyncName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataSyncName(strName);
    }

    @JsonIgnore
    public PSDEDataSyncDTO name(String strName) {
        this.setPSDEDataSyncName(strName);
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
    public PSDEDataSyncDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDataSyncDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEDataSyncDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEDataSyncDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDEDataSyncDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEDataSyncDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="syncdir")
    public void setSyncDir(String syncDir) {
        this._set(DTOFIELD_SYNCDIR, syncDir);
    }

    @JsonIgnore
    public String getSyncDir() {
        Object objValue = this._get(DTOFIELD_SYNCDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSyncDirDirty() {
        return this._contains(DTOFIELD_SYNCDIR);
    }

    @JsonIgnore
    public void resetSyncDir() {
        this._reset(DTOFIELD_SYNCDIR);
    }

    @JsonIgnore
    public PSDEDataSyncDTO syncdir(String syncDir) {
        this.setSyncDir(syncDir);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO syncdir(PSModelEnums.DataSyncDir syncDir) {
        if (syncDir == null) {
            this.setSyncDir(null);
        } else {
            this.setSyncDir(syncDir.value);
        }
        return this;
    }

    @JsonProperty(value="syncexport")
    public void setSyncExport(Integer syncExport) {
        this._set(DTOFIELD_SYNCEXPORT, syncExport);
    }

    @JsonIgnore
    public Integer getSyncExport() {
        Object objValue = this._get(DTOFIELD_SYNCEXPORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSyncExportDirty() {
        return this._contains(DTOFIELD_SYNCEXPORT);
    }

    @JsonIgnore
    public void resetSyncExport() {
        this._reset(DTOFIELD_SYNCEXPORT);
    }

    @JsonIgnore
    public PSDEDataSyncDTO syncexport(Integer syncExport) {
        this.setSyncExport(syncExport);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO syncexport(Boolean syncExport) {
        if (syncExport == null) {
            this.setSyncExport(null);
        } else {
            this.setSyncExport(syncExport != false ? 1 : 0);
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
    public PSDEDataSyncDTO updatedate(Timestamp updateDate) {
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
    public PSDEDataSyncDTO updateman(String updateMan) {
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
    public PSDEDataSyncDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDataSyncDTO usertag(String userTag) {
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
    public PSDEDataSyncDTO usertag2(String userTag2) {
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
    public PSDEDataSyncDTO usertag3(String userTag3) {
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
    public PSDEDataSyncDTO usertag4(String userTag4) {
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
    public PSDEDataSyncDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataSyncDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataSyncId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataSyncId(strValue);
    }

    @JsonIgnore
    public PSDEDataSyncDTO id(String strValue) {
        this.setPSDEDataSyncId(strValue);
        return this;
    }
}
