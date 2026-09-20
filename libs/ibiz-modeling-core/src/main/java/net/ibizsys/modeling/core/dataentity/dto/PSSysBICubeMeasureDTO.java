package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTranslatorDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBICubeMeasureDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGTYPE = "AGGTYPE";
    protected static final String DTOFIELD_AGGTYPE = "aggtype";
    public static final String FIELD_BICUBEMEASURETAG = "BICUBEMEASURETAG";
    protected static final String DTOFIELD_BICUBEMEASURETAG = "bicubemeasuretag";
    public static final String FIELD_BICUBEMEASURETAG2 = "BICUBEMEASURETAG2";
    protected static final String DTOFIELD_BICUBEMEASURETAG2 = "bicubemeasuretag2";
    public static final String FIELD_BIMEASUREGROUP = "BIMEASUREGROUP";
    protected static final String DTOFIELD_BIMEASUREGROUP = "bimeasuregroup";
    public static final String FIELD_BIMEASURETYPE = "BIMEASURETYPE";
    protected static final String DTOFIELD_BIMEASURETYPE = "bimeasuretype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DRILLDETAILCUSTOMCOND = "DRILLDETAILCUSTOMCOND";
    protected static final String DTOFIELD_DRILLDETAILCUSTOMCOND = "drilldetailcustomcond";
    public static final String FIELD_DRILLDETAILCUSTOMTYPE = "DRILLDETAILCUSTOMTYPE";
    protected static final String DTOFIELD_DRILLDETAILCUSTOMTYPE = "drilldetailcustomtype";
    public static final String FIELD_DRILLDETAILPSDEVIEWID = "DRILLDETAILPSDEVIEWID";
    protected static final String DTOFIELD_DRILLDETAILPSDEVIEWID = "drilldetailpsdeviewid";
    public static final String FIELD_DRILLDETAILPSDEVIEWNAME = "DRILLDETAILPSDEVIEWNAME";
    protected static final String DTOFIELD_DRILLDETAILPSDEVIEWNAME = "drilldetailpsdeviewname";
    public static final String FIELD_DRILLDOWNCUSTOMCOND = "DRILLDOWNCUSTOMCOND";
    protected static final String DTOFIELD_DRILLDOWNCUSTOMCOND = "drilldowncustomcond";
    public static final String FIELD_DRILLDOWNCUSTOMTYPE = "DRILLDOWNCUSTOMTYPE";
    protected static final String DTOFIELD_DRILLDOWNCUSTOMTYPE = "drilldowncustomtype";
    public static final String FIELD_DRILLDOWNPSDEVIEWID = "DRILLDOWNPSDEVIEWID";
    protected static final String DTOFIELD_DRILLDOWNPSDEVIEWID = "drilldownpsdeviewid";
    public static final String FIELD_DRILLDOWNPSDEVIEWNAME = "DRILLDOWNPSDEVIEWNAME";
    protected static final String DTOFIELD_DRILLDOWNPSDEVIEWNAME = "drilldownpsdeviewname";
    public static final String FIELD_HIDDENDATAITEM = "HIDDENDATAITEM";
    protected static final String DTOFIELD_HIDDENDATAITEM = "hiddendataitem";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_MEASUREFORMULA = "MEASUREFORMULA";
    protected static final String DTOFIELD_MEASUREFORMULA = "measureformula";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMPSDEUIACTIONID = "PARAMPSDEUIACTIONID";
    protected static final String DTOFIELD_PARAMPSDEUIACTIONID = "parampsdeuiactionid";
    public static final String FIELD_PARAMPSDEUIACTIONNAME = "PARAMPSDEUIACTIONNAME";
    protected static final String DTOFIELD_PARAMPSDEUIACTIONNAME = "parampsdeuiactionname";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBEMEASUREID = "PSSYSBICUBEMEASUREID";
    protected static final String DTOFIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";
    public static final String FIELD_PSSYSBICUBEMEASURENAME = "PSSYSBICUBEMEASURENAME";
    protected static final String DTOFIELD_PSSYSBICUBEMEASURENAME = "pssysbicubemeasurename";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_TEXTTEMPLATE = "TEXTTEMPLATE";
    protected static final String DTOFIELD_TEXTTEMPLATE = "texttemplate";
    public static final String FIELD_TIPTEMPLATE = "TIPTEMPLATE";
    protected static final String DTOFIELD_TIPTEMPLATE = "tiptemplate";
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
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";

    @JsonProperty(value="aggtype")
    public void setAggType(String aggType) {
        this._set(DTOFIELD_AGGTYPE, aggType);
    }

    @JsonIgnore
    public String getAggType() {
        Object objValue = this._get(DTOFIELD_AGGTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggTypeDirty() {
        return this._contains(DTOFIELD_AGGTYPE);
    }

    @JsonIgnore
    public void resetAggType() {
        this._reset(DTOFIELD_AGGTYPE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO aggtype(String aggType) {
        this.setAggType(aggType);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO aggtype(PSModelEnums.BIMeasureAggMode aggType) {
        if (aggType == null) {
            this.setAggType(null);
        } else {
            this.setAggType(aggType.value);
        }
        return this;
    }

    @JsonProperty(value="bicubemeasuretag")
    public void setBICubeMeasureTag(String bICubeMeasureTag) {
        this._set(DTOFIELD_BICUBEMEASURETAG, bICubeMeasureTag);
    }

    @JsonIgnore
    public String getBICubeMeasureTag() {
        Object objValue = this._get(DTOFIELD_BICUBEMEASURETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeMeasureTagDirty() {
        return this._contains(DTOFIELD_BICUBEMEASURETAG);
    }

    @JsonIgnore
    public void resetBICubeMeasureTag() {
        this._reset(DTOFIELD_BICUBEMEASURETAG);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO bicubemeasuretag(String bICubeMeasureTag) {
        this.setBICubeMeasureTag(bICubeMeasureTag);
        return this;
    }

    @JsonProperty(value="bicubemeasuretag2")
    public void setBICubeMeasureTag2(String bICubeMeasureTag2) {
        this._set(DTOFIELD_BICUBEMEASURETAG2, bICubeMeasureTag2);
    }

    @JsonIgnore
    public String getBICubeMeasureTag2() {
        Object objValue = this._get(DTOFIELD_BICUBEMEASURETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeMeasureTag2Dirty() {
        return this._contains(DTOFIELD_BICUBEMEASURETAG2);
    }

    @JsonIgnore
    public void resetBICubeMeasureTag2() {
        this._reset(DTOFIELD_BICUBEMEASURETAG2);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO bicubemeasuretag2(String bICubeMeasureTag2) {
        this.setBICubeMeasureTag2(bICubeMeasureTag2);
        return this;
    }

    @JsonProperty(value="bimeasuregroup")
    public void setBIMeasureGroup(String bIMeasureGroup) {
        this._set(DTOFIELD_BIMEASUREGROUP, bIMeasureGroup);
    }

    @JsonIgnore
    public String getBIMeasureGroup() {
        Object objValue = this._get(DTOFIELD_BIMEASUREGROUP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIMeasureGroupDirty() {
        return this._contains(DTOFIELD_BIMEASUREGROUP);
    }

    @JsonIgnore
    public void resetBIMeasureGroup() {
        this._reset(DTOFIELD_BIMEASUREGROUP);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO bimeasuregroup(String bIMeasureGroup) {
        this.setBIMeasureGroup(bIMeasureGroup);
        return this;
    }

    @JsonProperty(value="bimeasuretype")
    public void setBIMeasureType(String bIMeasureType) {
        this._set(DTOFIELD_BIMEASURETYPE, bIMeasureType);
    }

    @JsonIgnore
    public String getBIMeasureType() {
        Object objValue = this._get(DTOFIELD_BIMEASURETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIMeasureTypeDirty() {
        return this._contains(DTOFIELD_BIMEASURETYPE);
    }

    @JsonIgnore
    public void resetBIMeasureType() {
        this._reset(DTOFIELD_BIMEASURETYPE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO bimeasuretype(String bIMeasureType) {
        this.setBIMeasureType(bIMeasureType);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO bimeasuretype(PSModelEnums.BIMeasureType bIMeasureType) {
        if (bIMeasureType == null) {
            this.setBIMeasureType(null);
        } else {
            this.setBIMeasureType(bIMeasureType.value);
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
    public PSSysBICubeMeasureDTO codename(String codeName) {
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
    public PSSysBICubeMeasureDTO createdate(Timestamp createDate) {
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
    public PSSysBICubeMeasureDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="drilldetailcustomcond")
    public void setDrillDetailCustomCond(String drillDetailCustomCond) {
        this._set(DTOFIELD_DRILLDETAILCUSTOMCOND, drillDetailCustomCond);
    }

    @JsonIgnore
    public String getDrillDetailCustomCond() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILCUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailCustomCondDirty() {
        return this._contains(DTOFIELD_DRILLDETAILCUSTOMCOND);
    }

    @JsonIgnore
    public void resetDrillDetailCustomCond() {
        this._reset(DTOFIELD_DRILLDETAILCUSTOMCOND);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldetailcustomcond(String drillDetailCustomCond) {
        this.setDrillDetailCustomCond(drillDetailCustomCond);
        return this;
    }

    @JsonProperty(value="drilldetailcustomtype")
    public void setDrillDetailCustomType(String drillDetailCustomType) {
        this._set(DTOFIELD_DRILLDETAILCUSTOMTYPE, drillDetailCustomType);
    }

    @JsonIgnore
    public String getDrillDetailCustomType() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILCUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailCustomTypeDirty() {
        return this._contains(DTOFIELD_DRILLDETAILCUSTOMTYPE);
    }

    @JsonIgnore
    public void resetDrillDetailCustomType() {
        this._reset(DTOFIELD_DRILLDETAILCUSTOMTYPE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldetailcustomtype(String drillDetailCustomType) {
        this.setDrillDetailCustomType(drillDetailCustomType);
        return this;
    }

    @JsonProperty(value="drilldetailpsdeviewid")
    public void setDrillDetailPSDEViewId(String drillDetailPSDEViewId) {
        this._set(DTOFIELD_DRILLDETAILPSDEVIEWID, drillDetailPSDEViewId);
    }

    @JsonIgnore
    public String getDrillDetailPSDEViewId() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailPSDEViewIdDirty() {
        return this._contains(DTOFIELD_DRILLDETAILPSDEVIEWID);
    }

    @JsonIgnore
    public void resetDrillDetailPSDEViewId() {
        this._reset(DTOFIELD_DRILLDETAILPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldetailpsdeviewid(String drillDetailPSDEViewId) {
        this.setDrillDetailPSDEViewId(drillDetailPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldetailpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setDrillDetailPSDEViewId(null);
            this.setDrillDetailPSDEViewName(null);
        } else {
            this.setDrillDetailPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDetailPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="drilldetailpsdeviewname")
    public void setDrillDetailPSDEViewName(String drillDetailPSDEViewName) {
        this._set(DTOFIELD_DRILLDETAILPSDEVIEWNAME, drillDetailPSDEViewName);
    }

    @JsonIgnore
    public String getDrillDetailPSDEViewName() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailPSDEViewNameDirty() {
        return this._contains(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetDrillDetailPSDEViewName() {
        this._reset(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldetailpsdeviewname(String drillDetailPSDEViewName) {
        this.setDrillDetailPSDEViewName(drillDetailPSDEViewName);
        return this;
    }

    @JsonProperty(value="drilldowncustomcond")
    public void setDrillDownCustomCond(String drillDownCustomCond) {
        this._set(DTOFIELD_DRILLDOWNCUSTOMCOND, drillDownCustomCond);
    }

    @JsonIgnore
    public String getDrillDownCustomCond() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNCUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownCustomCondDirty() {
        return this._contains(DTOFIELD_DRILLDOWNCUSTOMCOND);
    }

    @JsonIgnore
    public void resetDrillDownCustomCond() {
        this._reset(DTOFIELD_DRILLDOWNCUSTOMCOND);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldowncustomcond(String drillDownCustomCond) {
        this.setDrillDownCustomCond(drillDownCustomCond);
        return this;
    }

    @JsonProperty(value="drilldowncustomtype")
    public void setDrillDownCustomType(String drillDownCustomType) {
        this._set(DTOFIELD_DRILLDOWNCUSTOMTYPE, drillDownCustomType);
    }

    @JsonIgnore
    public String getDrillDownCustomType() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNCUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownCustomTypeDirty() {
        return this._contains(DTOFIELD_DRILLDOWNCUSTOMTYPE);
    }

    @JsonIgnore
    public void resetDrillDownCustomType() {
        this._reset(DTOFIELD_DRILLDOWNCUSTOMTYPE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldowncustomtype(String drillDownCustomType) {
        this.setDrillDownCustomType(drillDownCustomType);
        return this;
    }

    @JsonProperty(value="drilldownpsdeviewid")
    public void setDrillDownPSDEViewId(String drillDownPSDEViewId) {
        this._set(DTOFIELD_DRILLDOWNPSDEVIEWID, drillDownPSDEViewId);
    }

    @JsonIgnore
    public String getDrillDownPSDEViewId() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownPSDEViewIdDirty() {
        return this._contains(DTOFIELD_DRILLDOWNPSDEVIEWID);
    }

    @JsonIgnore
    public void resetDrillDownPSDEViewId() {
        this._reset(DTOFIELD_DRILLDOWNPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldownpsdeviewid(String drillDownPSDEViewId) {
        this.setDrillDownPSDEViewId(drillDownPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldownpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setDrillDownPSDEViewId(null);
            this.setDrillDownPSDEViewName(null);
        } else {
            this.setDrillDownPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDownPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="drilldownpsdeviewname")
    public void setDrillDownPSDEViewName(String drillDownPSDEViewName) {
        this._set(DTOFIELD_DRILLDOWNPSDEVIEWNAME, drillDownPSDEViewName);
    }

    @JsonIgnore
    public String getDrillDownPSDEViewName() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownPSDEViewNameDirty() {
        return this._contains(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetDrillDownPSDEViewName() {
        this._reset(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO drilldownpsdeviewname(String drillDownPSDEViewName) {
        this.setDrillDownPSDEViewName(drillDownPSDEViewName);
        return this;
    }

    @JsonProperty(value="hiddendataitem")
    public void setHiddenDataItem(Integer hiddenDataItem) {
        this._set(DTOFIELD_HIDDENDATAITEM, hiddenDataItem);
    }

    @JsonIgnore
    public Integer getHiddenDataItem() {
        Object objValue = this._get(DTOFIELD_HIDDENDATAITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHiddenDataItemDirty() {
        return this._contains(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public void resetHiddenDataItem() {
        this._reset(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO hiddendataitem(Integer hiddenDataItem) {
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO hiddendataitem(Boolean hiddenDataItem) {
        if (hiddenDataItem == null) {
            this.setHiddenDataItem(null);
        } else {
            this.setHiddenDataItem(hiddenDataItem != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="jsonformat")
    public void setJsonFormat(String jsonFormat) {
        this._set(DTOFIELD_JSONFORMAT, jsonFormat);
    }

    @JsonIgnore
    public String getJsonFormat() {
        Object objValue = this._get(DTOFIELD_JSONFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJsonFormatDirty() {
        return this._contains(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public void resetJsonFormat() {
        this._reset(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
        return this;
    }

    @JsonProperty(value="measureformula")
    public void setMeasureFormula(String measureFormula) {
        this._set(DTOFIELD_MEASUREFORMULA, measureFormula);
    }

    @JsonIgnore
    public String getMeasureFormula() {
        Object objValue = this._get(DTOFIELD_MEASUREFORMULA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMeasureFormulaDirty() {
        return this._contains(DTOFIELD_MEASUREFORMULA);
    }

    @JsonIgnore
    public void resetMeasureFormula() {
        this._reset(DTOFIELD_MEASUREFORMULA);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO measureformula(String measureFormula) {
        this.setMeasureFormula(measureFormula);
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
    public PSSysBICubeMeasureDTO memo(String memo) {
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
    public PSSysBICubeMeasureDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="parampsdeuiactionid")
    public void setParamPSDEUIActionId(String paramPSDEUIActionId) {
        this._set(DTOFIELD_PARAMPSDEUIACTIONID, paramPSDEUIActionId);
    }

    @JsonIgnore
    public String getParamPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PARAMPSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PARAMPSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetParamPSDEUIActionId() {
        this._reset(DTOFIELD_PARAMPSDEUIACTIONID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO parampsdeuiactionid(String paramPSDEUIActionId) {
        this.setParamPSDEUIActionId(paramPSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO parampsdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setParamPSDEUIActionId(null);
            this.setParamPSDEUIActionName(null);
        } else {
            this.setParamPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setParamPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="parampsdeuiactionname")
    public void setParamPSDEUIActionName(String paramPSDEUIActionName) {
        this._set(DTOFIELD_PARAMPSDEUIACTIONNAME, paramPSDEUIActionName);
    }

    @JsonIgnore
    public String getParamPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PARAMPSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PARAMPSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetParamPSDEUIActionName() {
        this._reset(DTOFIELD_PARAMPSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO parampsdeuiactionname(String paramPSDEUIActionName) {
        this.setParamPSDEUIActionName(paramPSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSSysBICubeMeasureDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssysbicubeid")
    public void setPSSysBICubeId(String pSSysBICubeId) {
        this._set(DTOFIELD_PSSYSBICUBEID, pSSysBICubeId);
    }

    @JsonIgnore
    public String getPSSysBICubeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public void resetPSSysBICubeId() {
        this._reset(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
        if (pSSysBICube == null) {
            this.setPSDEId(null);
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
            this.setPSSysBISchemeId(null);
        } else {
            this.setPSDEId(pSSysBICube.getPSDEId());
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
            this.setPSSysBISchemeId(pSSysBICube.getPSSysBISchemeId());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubemeasureid")
    public void setPSSysBICubeMeasureId(String pSSysBICubeMeasureId) {
        this._set(DTOFIELD_PSSYSBICUBEMEASUREID, pSSysBICubeMeasureId);
    }

    @JsonIgnore
    public String getPSSysBICubeMeasureId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEMEASUREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeMeasureIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public void resetPSSysBICubeMeasureId() {
        this._reset(DTOFIELD_PSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubemeasureid(String pSSysBICubeMeasureId) {
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    @JsonProperty(value="pssysbicubemeasurename")
    public void setPSSysBICubeMeasureName(String pSSysBICubeMeasureName) {
        this._set(DTOFIELD_PSSYSBICUBEMEASURENAME, pSSysBICubeMeasureName);
    }

    @JsonIgnore
    public String getPSSysBICubeMeasureName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEMEASURENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeMeasureNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeMeasureName() {
        this._reset(DTOFIELD_PSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubemeasurename(String pSSysBICubeMeasureName) {
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBICubeMeasureName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBICubeMeasureName(strName);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO name(String strName) {
        this.setPSSysBICubeMeasureName(strName);
        return this;
    }

    @JsonProperty(value="pssysbicubename")
    public void setPSSysBICubeName(String pSSysBICubeName) {
        this._set(DTOFIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }

    @JsonIgnore
    public String getPSSysBICubeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeName() {
        this._reset(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonProperty(value="pssysbischemeid")
    public void setPSSysBISchemeId(String pSSysBISchemeId) {
        this._set(DTOFIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }

    @JsonIgnore
    public String getPSSysBISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBISchemeId() {
        this._reset(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStdDataTypeDirty() {
        return this._contains(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public void resetStdDataType() {
        this._reset(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="texttemplate")
    public void setTextTemplate(String textTemplate) {
        this._set(DTOFIELD_TEXTTEMPLATE, textTemplate);
    }

    @JsonIgnore
    public String getTextTemplate() {
        Object objValue = this._get(DTOFIELD_TEXTTEMPLATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextTemplateDirty() {
        return this._contains(DTOFIELD_TEXTTEMPLATE);
    }

    @JsonIgnore
    public void resetTextTemplate() {
        this._reset(DTOFIELD_TEXTTEMPLATE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO texttemplate(String textTemplate) {
        this.setTextTemplate(textTemplate);
        return this;
    }

    @JsonProperty(value="tiptemplate")
    public void setTipTemplate(String tipTemplate) {
        this._set(DTOFIELD_TIPTEMPLATE, tipTemplate);
    }

    @JsonIgnore
    public String getTipTemplate() {
        Object objValue = this._get(DTOFIELD_TIPTEMPLATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipTemplateDirty() {
        return this._contains(DTOFIELD_TIPTEMPLATE);
    }

    @JsonIgnore
    public void resetTipTemplate() {
        this._reset(DTOFIELD_TIPTEMPLATE);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO tiptemplate(String tipTemplate) {
        this.setTipTemplate(tipTemplate);
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
    public PSSysBICubeMeasureDTO updatedate(Timestamp updateDate) {
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
    public PSSysBICubeMeasureDTO updateman(String updateMan) {
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
    public PSSysBICubeMeasureDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBICubeMeasureDTO usertag(String userTag) {
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
    public PSSysBICubeMeasureDTO usertag2(String userTag2) {
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
    public PSSysBICubeMeasureDTO usertag3(String userTag3) {
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
    public PSSysBICubeMeasureDTO usertag4(String userTag4) {
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
    public PSSysBICubeMeasureDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valueformat")
    public void setValueFormat(String valueFormat) {
        this._set(DTOFIELD_VALUEFORMAT, valueFormat);
    }

    @JsonIgnore
    public String getValueFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFormatDirty() {
        return this._contains(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public void resetValueFormat() {
        this._reset(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBICubeMeasureId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBICubeMeasureId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeMeasureDTO id(String strValue) {
        this.setPSSysBICubeMeasureId(strValue);
        return this;
    }
}
