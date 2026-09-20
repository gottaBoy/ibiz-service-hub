package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDERDEFMapDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FORMULAFORMAT = "FORMULAFORMAT";
    protected static final String DTOFIELD_FORMULAFORMAT = "formulaformat";
    public static final String FIELD_MAJORPSDEFID = "MAJORPSDEFID";
    protected static final String DTOFIELD_MAJORPSDEFID = "majorpsdefid";
    public static final String FIELD_MAJORPSDEFNAME = "MAJORPSDEFNAME";
    protected static final String DTOFIELD_MAJORPSDEFNAME = "majorpsdefname";
    public static final String FIELD_MAJORPSDEID = "MAJORPSDEID";
    protected static final String DTOFIELD_MAJORPSDEID = "majorpsdeid";
    public static final String FIELD_MAPTYPE = "MAPTYPE";
    protected static final String DTOFIELD_MAPTYPE = "maptype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDEFID = "MINORPSDEFID";
    protected static final String DTOFIELD_MINORPSDEFID = "minorpsdefid";
    public static final String FIELD_MINORPSDEFNAME = "MINORPSDEFNAME";
    protected static final String DTOFIELD_MINORPSDEFNAME = "minorpsdefname";
    public static final String FIELD_MINORPSDEID = "MINORPSDEID";
    protected static final String DTOFIELD_MINORPSDEID = "minorpsdeid";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDERDEFMAPID = "PSDERDEFMAPID";
    protected static final String DTOFIELD_PSDERDEFMAPID = "psderdefmapid";
    public static final String FIELD_PSDERDEFMAPNAME = "PSDERDEFMAPNAME";
    protected static final String DTOFIELD_PSDERDEFMAPNAME = "psderdefmapname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_SRCVALUE = "SRCVALUE";
    protected static final String DTOFIELD_SRCVALUE = "srcvalue";
    public static final String FIELD_SRCVALUESTDDATATYPE = "SRCVALUESTDDATATYPE";
    protected static final String DTOFIELD_SRCVALUESTDDATATYPE = "srcvaluestddatatype";
    public static final String FIELD_SRCVALUETYPE = "SRCVALUETYPE";
    protected static final String DTOFIELD_SRCVALUETYPE = "srcvaluetype";
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
    public PSDERDEFMapDTO codename(String codeName) {
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
    public PSDERDEFMapDTO createdate(Timestamp createDate) {
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
    public PSDERDEFMapDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="formulaformat")
    public void setFormulaFormat(String formulaFormat) {
        this._set(DTOFIELD_FORMULAFORMAT, formulaFormat);
    }

    @JsonIgnore
    public String getFormulaFormat() {
        Object objValue = this._get(DTOFIELD_FORMULAFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormulaFormatDirty() {
        return this._contains(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public void resetFormulaFormat() {
        this._reset(DTOFIELD_FORMULAFORMAT);
    }

    @JsonIgnore
    public PSDERDEFMapDTO formulaformat(String formulaFormat) {
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    @JsonProperty(value="majorpsdefid")
    public void setMajorPSDEFId(String majorPSDEFId) {
        this._set(DTOFIELD_MAJORPSDEFID, majorPSDEFId);
    }

    @JsonIgnore
    public String getMajorPSDEFId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFID);
    }

    @JsonIgnore
    public void resetMajorPSDEFId() {
        this._reset(DTOFIELD_MAJORPSDEFID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO majorpsdefid(String majorPSDEFId) {
        this.setMajorPSDEFId(majorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO majorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMajorPSDEFId(null);
            this.setMajorPSDEFName(null);
        } else {
            this.setMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdefname")
    public void setMajorPSDEFName(String majorPSDEFName) {
        this._set(DTOFIELD_MAJORPSDEFNAME, majorPSDEFName);
    }

    @JsonIgnore
    public String getMajorPSDEFName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFNameDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFNAME);
    }

    @JsonIgnore
    public void resetMajorPSDEFName() {
        this._reset(DTOFIELD_MAJORPSDEFNAME);
    }

    @JsonIgnore
    public PSDERDEFMapDTO majorpsdefname(String majorPSDEFName) {
        this.setMajorPSDEFName(majorPSDEFName);
        return this;
    }

    @JsonProperty(value="majorpsdeid")
    public void setMajorPSDEId(String majorPSDEId) {
        this._set(DTOFIELD_MAJORPSDEID, majorPSDEId);
    }

    @JsonIgnore
    public String getMajorPSDEId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEID);
    }

    @JsonIgnore
    public void resetMajorPSDEId() {
        this._reset(DTOFIELD_MAJORPSDEID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO majorpsdeid(String majorPSDEId) {
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    @JsonProperty(value="maptype")
    public void setMapType(String mapType) {
        this._set(DTOFIELD_MAPTYPE, mapType);
    }

    @JsonIgnore
    public String getMapType() {
        Object objValue = this._get(DTOFIELD_MAPTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTypeDirty() {
        return this._contains(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public void resetMapType() {
        this._reset(DTOFIELD_MAPTYPE);
    }

    @JsonIgnore
    public PSDERDEFMapDTO maptype(String mapType) {
        this.setMapType(mapType);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO maptype(PSModelEnums.DER1NDEFMapType mapType) {
        if (mapType == null) {
            this.setMapType(null);
        } else {
            this.setMapType(mapType.value);
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
    public PSDERDEFMapDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsdefid")
    public void setMinorPSDEFId(String minorPSDEFId) {
        this._set(DTOFIELD_MINORPSDEFID, minorPSDEFId);
    }

    @JsonIgnore
    public String getMinorPSDEFId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEFID);
    }

    @JsonIgnore
    public void resetMinorPSDEFId() {
        this._reset(DTOFIELD_MINORPSDEFID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO minorpsdefid(String minorPSDEFId) {
        this.setMinorPSDEFId(minorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO minorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMinorPSDEFId(null);
            this.setMinorPSDEFName(null);
        } else {
            this.setMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="minorpsdefname")
    public void setMinorPSDEFName(String minorPSDEFName) {
        this._set(DTOFIELD_MINORPSDEFNAME, minorPSDEFName);
    }

    @JsonIgnore
    public String getMinorPSDEFName() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFNameDirty() {
        return this._contains(DTOFIELD_MINORPSDEFNAME);
    }

    @JsonIgnore
    public void resetMinorPSDEFName() {
        this._reset(DTOFIELD_MINORPSDEFNAME);
    }

    @JsonIgnore
    public PSDERDEFMapDTO minorpsdefname(String minorPSDEFName) {
        this.setMinorPSDEFName(minorPSDEFName);
        return this;
    }

    @JsonProperty(value="minorpsdeid")
    public void setMinorPSDEId(String minorPSDEId) {
        this._set(DTOFIELD_MINORPSDEID, minorPSDEId);
    }

    @JsonIgnore
    public String getMinorPSDEId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEID);
    }

    @JsonIgnore
    public void resetMinorPSDEId() {
        this._reset(DTOFIELD_MINORPSDEID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO minorpsdeid(String minorPSDEId) {
        this.setMinorPSDEId(minorPSDEId);
        return this;
    }

    @JsonProperty(value="psdedqid")
    public void setPSDEDQId(String pSDEDQId) {
        this._set(DTOFIELD_PSDEDQID, pSDEDQId);
    }

    @JsonIgnore
    public String getPSDEDQId() {
        Object objValue = this._get(DTOFIELD_PSDEDQID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQIdDirty() {
        return this._contains(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public void resetPSDEDQId() {
        this._reset(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedqname")
    public void setPSDEDQName(String pSDEDQName) {
        this._set(DTOFIELD_PSDEDQNAME, pSDEDQName);
    }

    @JsonIgnore
    public String getPSDEDQName() {
        Object objValue = this._get(DTOFIELD_PSDEDQNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQNameDirty() {
        return this._contains(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public void resetPSDEDQName() {
        this._reset(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public PSDERDEFMapDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    @JsonProperty(value="psderdefmapid")
    public void setPSDERDEFMapId(String pSDERDEFMapId) {
        this._set(DTOFIELD_PSDERDEFMAPID, pSDERDEFMapId);
    }

    @JsonIgnore
    public String getPSDERDEFMapId() {
        Object objValue = this._get(DTOFIELD_PSDERDEFMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERDEFMapIdDirty() {
        return this._contains(DTOFIELD_PSDERDEFMAPID);
    }

    @JsonIgnore
    public void resetPSDERDEFMapId() {
        this._reset(DTOFIELD_PSDERDEFMAPID);
    }

    @JsonIgnore
    public PSDERDEFMapDTO psderdefmapid(String pSDERDEFMapId) {
        this.setPSDERDEFMapId(pSDERDEFMapId);
        return this;
    }

    @JsonProperty(value="psderdefmapname")
    public void setPSDERDEFMapName(String pSDERDEFMapName) {
        this._set(DTOFIELD_PSDERDEFMAPNAME, pSDERDEFMapName);
    }

    @JsonIgnore
    public String getPSDERDEFMapName() {
        Object objValue = this._get(DTOFIELD_PSDERDEFMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERDEFMapNameDirty() {
        return this._contains(DTOFIELD_PSDERDEFMAPNAME);
    }

    @JsonIgnore
    public void resetPSDERDEFMapName() {
        this._reset(DTOFIELD_PSDERDEFMAPNAME);
    }

    @JsonIgnore
    public PSDERDEFMapDTO psderdefmapname(String pSDERDEFMapName) {
        this.setPSDERDEFMapName(pSDERDEFMapName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDERDEFMapName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDERDEFMapName(strName);
    }

    @JsonIgnore
    public PSDERDEFMapDTO name(String strName) {
        this.setPSDERDEFMapName(strName);
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
    public PSDERDEFMapDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setMajorPSDEId(null);
            this.setMinorPSDEId(null);
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setMajorPSDEId(pSDER.getMajorPSDEId());
            this.setMinorPSDEId(pSDER.getMinorPSDEId());
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
    public PSDERDEFMapDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
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
    public PSDERDEFMapDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDERDEFMapDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="srcvalue")
    public void setSrcValue(String srcValue) {
        this._set(DTOFIELD_SRCVALUE, srcValue);
    }

    @JsonIgnore
    public String getSrcValue() {
        Object objValue = this._get(DTOFIELD_SRCVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueDirty() {
        return this._contains(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public void resetSrcValue() {
        this._reset(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public PSDERDEFMapDTO srcvalue(String srcValue) {
        this.setSrcValue(srcValue);
        return this;
    }

    @JsonProperty(value="srcvaluestddatatype")
    public void setSrcValueStdDataType(Integer srcValueStdDataType) {
        this._set(DTOFIELD_SRCVALUESTDDATATYPE, srcValueStdDataType);
    }

    @JsonIgnore
    public Integer getSrcValueStdDataType() {
        Object objValue = this._get(DTOFIELD_SRCVALUESTDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueStdDataTypeDirty() {
        return this._contains(DTOFIELD_SRCVALUESTDDATATYPE);
    }

    @JsonIgnore
    public void resetSrcValueStdDataType() {
        this._reset(DTOFIELD_SRCVALUESTDDATATYPE);
    }

    @JsonIgnore
    public PSDERDEFMapDTO srcvaluestddatatype(Integer srcValueStdDataType) {
        this.setSrcValueStdDataType(srcValueStdDataType);
        return this;
    }

    @JsonProperty(value="srcvaluetype")
    public void setSrcValueType(String srcValueType) {
        this._set(DTOFIELD_SRCVALUETYPE, srcValueType);
    }

    @JsonIgnore
    public String getSrcValueType() {
        Object objValue = this._get(DTOFIELD_SRCVALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueTypeDirty() {
        return this._contains(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public void resetSrcValueType() {
        this._reset(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public PSDERDEFMapDTO srcvaluetype(String srcValueType) {
        this.setSrcValueType(srcValueType);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO srcvaluetype(PSModelEnums.DELogicParamValueType srcValueType) {
        if (srcValueType == null) {
            this.setSrcValueType(null);
        } else {
            this.setSrcValueType(srcValueType.value);
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
    public PSDERDEFMapDTO updatedate(Timestamp updateDate) {
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
    public PSDERDEFMapDTO updateman(String updateMan) {
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
    public PSDERDEFMapDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDERDEFMapDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDERDEFMapDTO usertag(String userTag) {
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
    public PSDERDEFMapDTO usertag2(String userTag2) {
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
    public PSDERDEFMapDTO usertag3(String userTag3) {
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
    public PSDERDEFMapDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDERDEFMapId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDERDEFMapId(strValue);
    }

    @JsonIgnore
    public PSDERDEFMapDTO id(String strValue) {
        this.setPSDERDEFMapId(strValue);
        return this;
    }
}
