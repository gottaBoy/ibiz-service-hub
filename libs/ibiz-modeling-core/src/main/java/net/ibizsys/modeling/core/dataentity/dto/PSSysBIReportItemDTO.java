package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeLevelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeMeasureDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIReportDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBIReportItemDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGTYPE = "AGGTYPE";
    protected static final String DTOFIELD_AGGTYPE = "aggtype";
    public static final String FIELD_BIREPITEMPARAMS = "BIREPITEMPARAMS";
    protected static final String DTOFIELD_BIREPITEMPARAMS = "birepitemparams";
    public static final String FIELD_BIREPITEMTAG = "BIREPITEMTAG";
    protected static final String DTOFIELD_BIREPITEMTAG = "birepitemtag";
    public static final String FIELD_BIREPITEMTAG2 = "BIREPITEMTAG2";
    protected static final String DTOFIELD_BIREPITEMTAG2 = "birepitemtag2";
    public static final String FIELD_BIREPITEMTYPE = "BIREPITEMTYPE";
    protected static final String DTOFIELD_BIREPITEMTYPE = "birepitemtype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_HALIGN = "HALIGN";
    protected static final String DTOFIELD_HALIGN = "halign";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PLACEMENT = "PLACEMENT";
    protected static final String DTOFIELD_PLACEMENT = "placement";
    public static final String FIELD_PLACETYPE = "PLACETYPE";
    protected static final String DTOFIELD_PLACETYPE = "placetype";
    public static final String FIELD_PPSSYSBIREPORTITEMID = "PPSSYSBIREPORTITEMID";
    protected static final String DTOFIELD_PPSSYSBIREPORTITEMID = "ppssysbireportitemid";
    public static final String FIELD_PPSSYSBIREPORTITEMNAME = "PPSSYSBIREPORTITEMNAME";
    protected static final String DTOFIELD_PPSSYSBIREPORTITEMNAME = "ppssysbireportitemname";
    public static final String FIELD_PSSYSBICUBEDIMENSIONID = "PSSYSBICUBEDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";
    public static final String FIELD_PSSYSBICUBEDIMENSIONNAME = "PSSYSBICUBEDIMENSIONNAME";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBELEVELID = "PSSYSBICUBELEVELID";
    protected static final String DTOFIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";
    public static final String FIELD_PSSYSBICUBELEVELNAME = "PSSYSBICUBELEVELNAME";
    protected static final String DTOFIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";
    public static final String FIELD_PSSYSBICUBEMEASUREID = "PSSYSBICUBEMEASUREID";
    protected static final String DTOFIELD_PSSYSBICUBEMEASUREID = "pssysbicubemeasureid";
    public static final String FIELD_PSSYSBICUBEMEASURENAME = "PSSYSBICUBEMEASURENAME";
    protected static final String DTOFIELD_PSSYSBICUBEMEASURENAME = "pssysbicubemeasurename";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBIREPORTID = "PSSYSBIREPORTID";
    protected static final String DTOFIELD_PSSYSBIREPORTID = "pssysbireportid";
    public static final String FIELD_PSSYSBIREPORTITEMID = "PSSYSBIREPORTITEMID";
    protected static final String DTOFIELD_PSSYSBIREPORTITEMID = "pssysbireportitemid";
    public static final String FIELD_PSSYSBIREPORTITEMNAME = "PSSYSBIREPORTITEMNAME";
    protected static final String DTOFIELD_PSSYSBIREPORTITEMNAME = "pssysbireportitemname";
    public static final String FIELD_PSSYSBIREPORTNAME = "PSSYSBIREPORTNAME";
    protected static final String DTOFIELD_PSSYSBIREPORTNAME = "pssysbireportname";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_REFPSSYSBICUBEMEASUREID = "REFPSSYSBICUBEMEASUREID";
    protected static final String DTOFIELD_REFPSSYSBICUBEMEASUREID = "refpssysbicubemeasureid";
    public static final String FIELD_REFPSSYSBICUBEMEASURENAME = "REFPSSYSBICUBEMEASURENAME";
    protected static final String DTOFIELD_REFPSSYSBICUBEMEASURENAME = "refpssysbicubemeasurename";
    public static final String FIELD_REFTYPE = "REFTYPE";
    protected static final String DTOFIELD_REFTYPE = "reftype";
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
    public static final String FIELD_VALIGN = "VALIGN";
    protected static final String DTOFIELD_VALIGN = "valign";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_WIDTHUNIT = "WIDTHUNIT";
    protected static final String DTOFIELD_WIDTHUNIT = "widthunit";

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
    public PSSysBIReportItemDTO aggtype(String aggType) {
        this.setAggType(aggType);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO aggtype(PSModelEnums.BIMeasureAggMode aggType) {
        if (aggType == null) {
            this.setAggType(null);
        } else {
            this.setAggType(aggType.value);
        }
        return this;
    }

    @JsonProperty(value="birepitemparams")
    public void setBIRepItemParams(String bIRepItemParams) {
        this._set(DTOFIELD_BIREPITEMPARAMS, bIRepItemParams);
    }

    @JsonIgnore
    public String getBIRepItemParams() {
        Object objValue = this._get(DTOFIELD_BIREPITEMPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIRepItemParamsDirty() {
        return this._contains(DTOFIELD_BIREPITEMPARAMS);
    }

    @JsonIgnore
    public void resetBIRepItemParams() {
        this._reset(DTOFIELD_BIREPITEMPARAMS);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO birepitemparams(String bIRepItemParams) {
        this.setBIRepItemParams(bIRepItemParams);
        return this;
    }

    @JsonProperty(value="birepitemtag")
    public void setBIRepItemTag(String bIRepItemTag) {
        this._set(DTOFIELD_BIREPITEMTAG, bIRepItemTag);
    }

    @JsonIgnore
    public String getBIRepItemTag() {
        Object objValue = this._get(DTOFIELD_BIREPITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIRepItemTagDirty() {
        return this._contains(DTOFIELD_BIREPITEMTAG);
    }

    @JsonIgnore
    public void resetBIRepItemTag() {
        this._reset(DTOFIELD_BIREPITEMTAG);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO birepitemtag(String bIRepItemTag) {
        this.setBIRepItemTag(bIRepItemTag);
        return this;
    }

    @JsonProperty(value="birepitemtag2")
    public void setBIRepItemTag2(String bIRepItemTag2) {
        this._set(DTOFIELD_BIREPITEMTAG2, bIRepItemTag2);
    }

    @JsonIgnore
    public String getBIRepItemTag2() {
        Object objValue = this._get(DTOFIELD_BIREPITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIRepItemTag2Dirty() {
        return this._contains(DTOFIELD_BIREPITEMTAG2);
    }

    @JsonIgnore
    public void resetBIRepItemTag2() {
        this._reset(DTOFIELD_BIREPITEMTAG2);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO birepitemtag2(String bIRepItemTag2) {
        this.setBIRepItemTag2(bIRepItemTag2);
        return this;
    }

    @JsonProperty(value="birepitemtype")
    public void setBIRepItemType(String bIRepItemType) {
        this._set(DTOFIELD_BIREPITEMTYPE, bIRepItemType);
    }

    @JsonIgnore
    public String getBIRepItemType() {
        Object objValue = this._get(DTOFIELD_BIREPITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIRepItemTypeDirty() {
        return this._contains(DTOFIELD_BIREPITEMTYPE);
    }

    @JsonIgnore
    public void resetBIRepItemType() {
        this._reset(DTOFIELD_BIREPITEMTYPE);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO birepitemtype(String bIRepItemType) {
        this.setBIRepItemType(bIRepItemType);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO birepitemtype(PSModelEnums.BIReportItemType bIRepItemType) {
        if (bIRepItemType == null) {
            this.setBIRepItemType(null);
        } else {
            this.setBIRepItemType(bIRepItemType.value);
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
    public PSSysBIReportItemDTO codename(String codeName) {
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
    public PSSysBIReportItemDTO createdate(Timestamp createDate) {
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
    public PSSysBIReportItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysBIReportItemDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="halign")
    public void setHAlign(String hAlign) {
        this._set(DTOFIELD_HALIGN, hAlign);
    }

    @JsonIgnore
    public String getHAlign() {
        Object objValue = this._get(DTOFIELD_HALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHAlignDirty() {
        return this._contains(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public void resetHAlign() {
        this._reset(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO halign(String hAlign) {
        this.setHAlign(hAlign);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO halign(PSModelEnums.TextAlign hAlign) {
        if (hAlign == null) {
            this.setHAlign(null);
        } else {
            this.setHAlign(hAlign.value);
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
    public PSSysBIReportItemDTO memo(String memo) {
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
    public PSSysBIReportItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="placement")
    public void setPlacement(String placement) {
        this._set(DTOFIELD_PLACEMENT, placement);
    }

    @JsonIgnore
    public String getPlacement() {
        Object objValue = this._get(DTOFIELD_PLACEMENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlacementDirty() {
        return this._contains(DTOFIELD_PLACEMENT);
    }

    @JsonIgnore
    public void resetPlacement() {
        this._reset(DTOFIELD_PLACEMENT);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO placement(String placement) {
        this.setPlacement(placement);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO placement(PSModelEnums.BIReportItemPlacement placement) {
        if (placement == null) {
            this.setPlacement(null);
        } else {
            this.setPlacement(placement.value);
        }
        return this;
    }

    @JsonProperty(value="placetype")
    public void setPlaceType(String placeType) {
        this._set(DTOFIELD_PLACETYPE, placeType);
    }

    @JsonIgnore
    public String getPlaceType() {
        Object objValue = this._get(DTOFIELD_PLACETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlaceTypeDirty() {
        return this._contains(DTOFIELD_PLACETYPE);
    }

    @JsonIgnore
    public void resetPlaceType() {
        this._reset(DTOFIELD_PLACETYPE);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO placetype(String placeType) {
        this.setPlaceType(placeType);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO placetype(PSModelEnums.BIReportItemPlaceType placeType) {
        if (placeType == null) {
            this.setPlaceType(null);
        } else {
            this.setPlaceType(placeType.value);
        }
        return this;
    }

    @JsonProperty(value="ppssysbireportitemid")
    public void setPPSSysBIReportItemId(String pPSSysBIReportItemId) {
        this._set(DTOFIELD_PPSSYSBIREPORTITEMID, pPSSysBIReportItemId);
    }

    @JsonIgnore
    public String getPPSSysBIReportItemId() {
        Object objValue = this._get(DTOFIELD_PPSSYSBIREPORTITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysBIReportItemIdDirty() {
        return this._contains(DTOFIELD_PPSSYSBIREPORTITEMID);
    }

    @JsonIgnore
    public void resetPPSSysBIReportItemId() {
        this._reset(DTOFIELD_PPSSYSBIREPORTITEMID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO ppssysbireportitemid(String pPSSysBIReportItemId) {
        this.setPPSSysBIReportItemId(pPSSysBIReportItemId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO ppssysbireportitemid(PSSysBIReportItemDTO pSSysBIReportItem) {
        if (pSSysBIReportItem == null) {
            this.setPPSSysBIReportItemId(null);
            this.setPPSSysBIReportItemName(null);
        } else {
            this.setPPSSysBIReportItemId(pSSysBIReportItem.getPSSysBIReportItemId());
            this.setPPSSysBIReportItemName(pSSysBIReportItem.getPSSysBIReportItemName());
        }
        return this;
    }

    @JsonProperty(value="ppssysbireportitemname")
    public void setPPSSysBIReportItemName(String pPSSysBIReportItemName) {
        this._set(DTOFIELD_PPSSYSBIREPORTITEMNAME, pPSSysBIReportItemName);
    }

    @JsonIgnore
    public String getPPSSysBIReportItemName() {
        Object objValue = this._get(DTOFIELD_PPSSYSBIREPORTITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysBIReportItemNameDirty() {
        return this._contains(DTOFIELD_PPSSYSBIREPORTITEMNAME);
    }

    @JsonIgnore
    public void resetPPSSysBIReportItemName() {
        this._reset(DTOFIELD_PPSSYSBIREPORTITEMNAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO ppssysbireportitemname(String pPSSysBIReportItemName) {
        this.setPPSSysBIReportItemName(pPSSysBIReportItemName);
        return this;
    }

    @JsonProperty(value="pssysbicubedimensionid")
    public void setPSSysBICubeDimensionId(String pSSysBICubeDimensionId) {
        this._set(DTOFIELD_PSSYSBICUBEDIMENSIONID, pSSysBICubeDimensionId);
    }

    @JsonIgnore
    public String getPSSysBICubeDimensionId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEDIMENSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeDimensionIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEDIMENSIONID);
    }

    @JsonIgnore
    public void resetPSSysBICubeDimensionId() {
        this._reset(DTOFIELD_PSSYSBICUBEDIMENSIONID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubedimensionid(String pSSysBICubeDimensionId) {
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubedimensionid(PSSysBICubeDimensionDTO pSSysBICubeDimension) {
        if (pSSysBICubeDimension == null) {
            this.setPSSysBICubeDimensionId(null);
            this.setPSSysBICubeDimensionName(null);
        } else {
            this.setPSSysBICubeDimensionId(pSSysBICubeDimension.getPSSysBICubeDimensionId());
            this.setPSSysBICubeDimensionName(pSSysBICubeDimension.getPSSysBICubeDimensionName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubedimensionname")
    public void setPSSysBICubeDimensionName(String pSSysBICubeDimensionName) {
        this._set(DTOFIELD_PSSYSBICUBEDIMENSIONNAME, pSSysBICubeDimensionName);
    }

    @JsonIgnore
    public String getPSSysBICubeDimensionName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeDimensionNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeDimensionName() {
        this._reset(DTOFIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubedimensionname(String pSSysBICubeDimensionName) {
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
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
    public PSSysBIReportItemDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
        if (pSSysBICube == null) {
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        } else {
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubelevelid")
    public void setPSSysBICubeLevelId(String pSSysBICubeLevelId) {
        this._set(DTOFIELD_PSSYSBICUBELEVELID, pSSysBICubeLevelId);
    }

    @JsonIgnore
    public String getPSSysBICubeLevelId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBELEVELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeLevelIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBELEVELID);
    }

    @JsonIgnore
    public void resetPSSysBICubeLevelId() {
        this._reset(DTOFIELD_PSSYSBICUBELEVELID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubelevelid(String pSSysBICubeLevelId) {
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubelevelid(PSSysBICubeLevelDTO pSSysBICubeLevel) {
        if (pSSysBICubeLevel == null) {
            this.setPSSysBICubeLevelId(null);
            this.setPSSysBICubeLevelName(null);
        } else {
            this.setPSSysBICubeLevelId(pSSysBICubeLevel.getPSSysBICubeLevelId());
            this.setPSSysBICubeLevelName(pSSysBICubeLevel.getPSSysBICubeLevelName());
        }
        return this;
    }

    @JsonProperty(value="pssysbicubelevelname")
    public void setPSSysBICubeLevelName(String pSSysBICubeLevelName) {
        this._set(DTOFIELD_PSSYSBICUBELEVELNAME, pSSysBICubeLevelName);
    }

    @JsonIgnore
    public String getPSSysBICubeLevelName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBELEVELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeLevelNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBELEVELNAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeLevelName() {
        this._reset(DTOFIELD_PSSYSBICUBELEVELNAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubelevelname(String pSSysBICubeLevelName) {
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
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
    public PSSysBIReportItemDTO pssysbicubemeasureid(String pSSysBICubeMeasureId) {
        this.setPSSysBICubeMeasureId(pSSysBICubeMeasureId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbicubemeasureid(PSSysBICubeMeasureDTO pSSysBICubeMeasure) {
        if (pSSysBICubeMeasure == null) {
            this.setPSSysBICubeMeasureId(null);
            this.setPSSysBICubeMeasureName(null);
        } else {
            this.setPSSysBICubeMeasureId(pSSysBICubeMeasure.getPSSysBICubeMeasureId());
            this.setPSSysBICubeMeasureName(pSSysBICubeMeasure.getPSSysBICubeMeasureName());
        }
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
    public PSSysBIReportItemDTO pssysbicubemeasurename(String pSSysBICubeMeasureName) {
        this.setPSSysBICubeMeasureName(pSSysBICubeMeasureName);
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
    public PSSysBIReportItemDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonProperty(value="pssysbireportid")
    public void setPSSysBIReportId(String pSSysBIReportId) {
        this._set(DTOFIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }

    @JsonIgnore
    public String getPSSysBIReportId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public void resetPSSysBIReportId() {
        this._reset(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbireportid(String pSSysBIReportId) {
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbireportid(PSSysBIReportDTO pSSysBIReport) {
        if (pSSysBIReport == null) {
            this.setPSSysBIReportId(null);
            this.setPSSysBIReportName(null);
            this.setPSSysBISchemeId(null);
        } else {
            this.setPSSysBIReportId(pSSysBIReport.getPSSysBIReportId());
            this.setPSSysBIReportName(pSSysBIReport.getPSSysBIReportName());
            this.setPSSysBISchemeId(pSSysBIReport.getPSSysBISchemeId());
        }
        return this;
    }

    @JsonProperty(value="pssysbireportitemid")
    public void setPSSysBIReportItemId(String pSSysBIReportItemId) {
        this._set(DTOFIELD_PSSYSBIREPORTITEMID, pSSysBIReportItemId);
    }

    @JsonIgnore
    public String getPSSysBIReportItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTITEMID);
    }

    @JsonIgnore
    public void resetPSSysBIReportItemId() {
        this._reset(DTOFIELD_PSSYSBIREPORTITEMID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbireportitemid(String pSSysBIReportItemId) {
        this.setPSSysBIReportItemId(pSSysBIReportItemId);
        return this;
    }

    @JsonProperty(value="pssysbireportitemname")
    public void setPSSysBIReportItemName(String pSSysBIReportItemName) {
        this._set(DTOFIELD_PSSYSBIREPORTITEMNAME, pSSysBIReportItemName);
    }

    @JsonIgnore
    public String getPSSysBIReportItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysBIReportItemName() {
        this._reset(DTOFIELD_PSSYSBIREPORTITEMNAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbireportitemname(String pSSysBIReportItemName) {
        this.setPSSysBIReportItemName(pSSysBIReportItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBIReportItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBIReportItemName(strName);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO name(String strName) {
        this.setPSSysBIReportItemName(strName);
        return this;
    }

    @JsonProperty(value="pssysbireportname")
    public void setPSSysBIReportName(String pSSysBIReportName) {
        this._set(DTOFIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }

    @JsonIgnore
    public String getPSSysBIReportName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public void resetPSSysBIReportName() {
        this._reset(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO pssysbireportname(String pSSysBIReportName) {
        this.setPSSysBIReportName(pSSysBIReportName);
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
    public PSSysBIReportItemDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonProperty(value="refpssysbicubemeasureid")
    public void setRefPSSysBICubeMeasureId(String refPSSysBICubeMeasureId) {
        this._set(DTOFIELD_REFPSSYSBICUBEMEASUREID, refPSSysBICubeMeasureId);
    }

    @JsonIgnore
    public String getRefPSSysBICubeMeasureId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSBICUBEMEASUREID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysBICubeMeasureIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public void resetRefPSSysBICubeMeasureId() {
        this._reset(DTOFIELD_REFPSSYSBICUBEMEASUREID);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO refpssysbicubemeasureid(String refPSSysBICubeMeasureId) {
        this.setRefPSSysBICubeMeasureId(refPSSysBICubeMeasureId);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO refpssysbicubemeasureid(PSSysBICubeMeasureDTO pSSysBICubeMeasure) {
        if (pSSysBICubeMeasure == null) {
            this.setRefPSSysBICubeMeasureId(null);
            this.setRefPSSysBICubeMeasureName(null);
        } else {
            this.setRefPSSysBICubeMeasureId(pSSysBICubeMeasure.getPSSysBICubeMeasureId());
            this.setRefPSSysBICubeMeasureName(pSSysBICubeMeasure.getPSSysBICubeMeasureName());
        }
        return this;
    }

    @JsonProperty(value="refpssysbicubemeasurename")
    public void setRefPSSysBICubeMeasureName(String refPSSysBICubeMeasureName) {
        this._set(DTOFIELD_REFPSSYSBICUBEMEASURENAME, refPSSysBICubeMeasureName);
    }

    @JsonIgnore
    public String getRefPSSysBICubeMeasureName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSBICUBEMEASURENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysBICubeMeasureNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public void resetRefPSSysBICubeMeasureName() {
        this._reset(DTOFIELD_REFPSSYSBICUBEMEASURENAME);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO refpssysbicubemeasurename(String refPSSysBICubeMeasureName) {
        this.setRefPSSysBICubeMeasureName(refPSSysBICubeMeasureName);
        return this;
    }

    @JsonProperty(value="reftype")
    public void setRefType(String refType) {
        this._set(DTOFIELD_REFTYPE, refType);
    }

    @JsonIgnore
    public String getRefType() {
        Object objValue = this._get(DTOFIELD_REFTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefTypeDirty() {
        return this._contains(DTOFIELD_REFTYPE);
    }

    @JsonIgnore
    public void resetRefType() {
        this._reset(DTOFIELD_REFTYPE);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO reftype(String refType) {
        this.setRefType(refType);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO reftype(PSModelEnums.BIReportItemRefType refType) {
        if (refType == null) {
            this.setRefType(null);
        } else {
            this.setRefType(refType.value);
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
    public PSSysBIReportItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysBIReportItemDTO updateman(String updateMan) {
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
    public PSSysBIReportItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBIReportItemDTO usertag(String userTag) {
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
    public PSSysBIReportItemDTO usertag2(String userTag2) {
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
    public PSSysBIReportItemDTO usertag3(String userTag3) {
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
    public PSSysBIReportItemDTO usertag4(String userTag4) {
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
    public PSSysBIReportItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="valign")
    public void setVAlign(String vAlign) {
        this._set(DTOFIELD_VALIGN, vAlign);
    }

    @JsonIgnore
    public String getVAlign() {
        Object objValue = this._get(DTOFIELD_VALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVAlignDirty() {
        return this._contains(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public void resetVAlign() {
        this._reset(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO valign(String vAlign) {
        this.setVAlign(vAlign);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO valign(PSModelEnums.TextVAlign vAlign) {
        if (vAlign == null) {
            this.setVAlign(null);
        } else {
            this.setVAlign(vAlign.value);
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
    public PSSysBIReportItemDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Integer width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Integer getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWidthDirty() {
        return this._contains(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public void resetWidth() {
        this._reset(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonProperty(value="widthunit")
    public void setWidthUnit(String widthUnit) {
        this._set(DTOFIELD_WIDTHUNIT, widthUnit);
    }

    @JsonIgnore
    public String getWidthUnit() {
        Object objValue = this._get(DTOFIELD_WIDTHUNIT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWidthUnitDirty() {
        return this._contains(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public void resetWidthUnit() {
        this._reset(DTOFIELD_WIDTHUNIT);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO widthunit(String widthUnit) {
        this.setWidthUnit(widthUnit);
        return this;
    }

    @JsonIgnore
    public PSSysBIReportItemDTO widthunit(PSModelEnums.GridColWidthUnitType widthUnit) {
        if (widthUnit == null) {
            this.setWidthUnit(null);
        } else {
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBIReportItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBIReportItemId(strValue);
    }

    @JsonIgnore
    public PSSysBIReportItemDTO id(String strValue) {
        this.setPSSysBIReportItemId(strValue);
        return this;
    }
}
