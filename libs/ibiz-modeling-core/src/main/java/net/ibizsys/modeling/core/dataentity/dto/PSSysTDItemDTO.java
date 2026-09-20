package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSampleValueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysTDItemDTO
extends PSModelDTOBase {
    public static final String FIELD_BADVALUE = "BADVALUE";
    protected static final String DTOFIELD_BADVALUE = "badvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
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
    public static final String FIELD_PSSYSSAMPLEVALUEID = "PSSYSSAMPLEVALUEID";
    protected static final String DTOFIELD_PSSYSSAMPLEVALUEID = "pssyssamplevalueid";
    public static final String FIELD_PSSYSSAMPLEVALUENAME = "PSSYSSAMPLEVALUENAME";
    protected static final String DTOFIELD_PSSYSSAMPLEVALUENAME = "pssyssamplevaluename";
    public static final String FIELD_PSSYSTDITEMID = "PSSYSTDITEMID";
    protected static final String DTOFIELD_PSSYSTDITEMID = "pssystditemid";
    public static final String FIELD_PSSYSTDITEMNAME = "PSSYSTDITEMNAME";
    protected static final String DTOFIELD_PSSYSTDITEMNAME = "pssystditemname";
    public static final String FIELD_PSSYSTESTDATAID = "PSSYSTESTDATAID";
    protected static final String DTOFIELD_PSSYSTESTDATAID = "pssystestdataid";
    public static final String FIELD_PSSYSTESTDATANAME = "PSSYSTESTDATANAME";
    protected static final String DTOFIELD_PSSYSTESTDATANAME = "pssystestdataname";
    public static final String FIELD_REFPSDEDATASETID = "REFPSDEDATASETID";
    protected static final String DTOFIELD_REFPSDEDATASETID = "refpsdedatasetid";
    public static final String FIELD_REFPSDEDATASETNAME = "REFPSDEDATASETNAME";
    protected static final String DTOFIELD_REFPSDEDATASETNAME = "refpsdedatasetname";
    public static final String FIELD_REFPSDEID = "REFPSDEID";
    protected static final String DTOFIELD_REFPSDEID = "refpsdeid";
    public static final String FIELD_REFPSDENAME = "REFPSDENAME";
    protected static final String DTOFIELD_REFPSDENAME = "refpsdename";
    public static final String FIELD_REFPSSYSTESTDATAID = "REFPSSYSTESTDATAID";
    protected static final String DTOFIELD_REFPSSYSTESTDATAID = "refpssystestdataid";
    public static final String FIELD_REFPSSYSTESTDATANAME = "REFPSSYSTESTDATANAME";
    protected static final String DTOFIELD_REFPSSYSTESTDATANAME = "refpssystestdataname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
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
    public static final String FIELD_VALUE = "VALUE";
    protected static final String DTOFIELD_VALUE = "value";
    public static final String FIELD_VALUERANGE = "VALUERANGE";
    protected static final String DTOFIELD_VALUERANGE = "valuerange";
    public static final String FIELD_VALUETYPE = "VALUETYPE";
    protected static final String DTOFIELD_VALUETYPE = "valuetype";

    @JsonProperty(value="badvalue")
    public void setBadValue(String badValue) {
        this._set(DTOFIELD_BADVALUE, badValue);
    }

    @JsonIgnore
    public String getBadValue() {
        Object objValue = this._get(DTOFIELD_BADVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBadValueDirty() {
        return this._contains(DTOFIELD_BADVALUE);
    }

    @JsonIgnore
    public void resetBadValue() {
        this._reset(DTOFIELD_BADVALUE);
    }

    @JsonIgnore
    public PSSysTDItemDTO badvalue(String badValue) {
        this.setBadValue(badValue);
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
    public PSSysTDItemDTO createdate(Timestamp createDate) {
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
    public PSSysTDItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysTDItemDTO memo(String memo) {
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
    public PSSysTDItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSSysTDItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSSysTDItemDTO pscodelistname(String pSCodeListName) {
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
    public PSSysTDItemDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysTDItemDTO psdefname(String pSDEFName) {
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
    public PSSysTDItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="pssyssamplevalueid")
    public void setPSSysSampleValueId(String pSSysSampleValueId) {
        this._set(DTOFIELD_PSSYSSAMPLEVALUEID, pSSysSampleValueId);
    }

    @JsonIgnore
    public String getPSSysSampleValueId() {
        Object objValue = this._get(DTOFIELD_PSSYSSAMPLEVALUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSampleValueIdDirty() {
        return this._contains(DTOFIELD_PSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public void resetPSSysSampleValueId() {
        this._reset(DTOFIELD_PSSYSSAMPLEVALUEID);
    }

    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevalueid(String pSSysSampleValueId) {
        this.setPSSysSampleValueId(pSSysSampleValueId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevalueid(PSSysSampleValueDTO pSSysSampleValue) {
        if (pSSysSampleValue == null) {
            this.setPSSysSampleValueId(null);
            this.setPSSysSampleValueName(null);
        } else {
            this.setPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    @JsonProperty(value="pssyssamplevaluename")
    public void setPSSysSampleValueName(String pSSysSampleValueName) {
        this._set(DTOFIELD_PSSYSSAMPLEVALUENAME, pSSysSampleValueName);
    }

    @JsonIgnore
    public String getPSSysSampleValueName() {
        Object objValue = this._get(DTOFIELD_PSSYSSAMPLEVALUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSampleValueNameDirty() {
        return this._contains(DTOFIELD_PSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public void resetPSSysSampleValueName() {
        this._reset(DTOFIELD_PSSYSSAMPLEVALUENAME);
    }

    @JsonIgnore
    public PSSysTDItemDTO pssyssamplevaluename(String pSSysSampleValueName) {
        this.setPSSysSampleValueName(pSSysSampleValueName);
        return this;
    }

    @JsonProperty(value="pssystditemid")
    public void setPSSysTDItemId(String pSSysTDItemId) {
        this._set(DTOFIELD_PSSYSTDITEMID, pSSysTDItemId);
    }

    @JsonIgnore
    public String getPSSysTDItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSTDITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTDItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSTDITEMID);
    }

    @JsonIgnore
    public void resetPSSysTDItemId() {
        this._reset(DTOFIELD_PSSYSTDITEMID);
    }

    @JsonIgnore
    public PSSysTDItemDTO pssystditemid(String pSSysTDItemId) {
        this.setPSSysTDItemId(pSSysTDItemId);
        return this;
    }

    @JsonProperty(value="pssystditemname")
    public void setPSSysTDItemName(String pSSysTDItemName) {
        this._set(DTOFIELD_PSSYSTDITEMNAME, pSSysTDItemName);
    }

    @JsonIgnore
    public String getPSSysTDItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSTDITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTDItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSTDITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysTDItemName() {
        this._reset(DTOFIELD_PSSYSTDITEMNAME);
    }

    @JsonIgnore
    public PSSysTDItemDTO pssystditemname(String pSSysTDItemName) {
        this.setPSSysTDItemName(pSSysTDItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysTDItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysTDItemName(strName);
    }

    @JsonIgnore
    public PSSysTDItemDTO name(String strName) {
        this.setPSSysTDItemName(strName);
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
    public PSSysTDItemDTO pssystestdataid(String pSSysTestDataId) {
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO pssystestdataid(PSSysTestDataDTO pSSysTestData) {
        if (pSSysTestData == null) {
            this.setPSDEId(null);
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        } else {
            this.setPSDEId(pSSysTestData.getPSDEId());
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
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
    public PSSysTDItemDTO pssystestdataname(String pSSysTestDataName) {
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    @JsonProperty(value="refpsdedatasetid")
    public void setRefPSDEDataSetId(String refPSDEDataSetId) {
        this._set(DTOFIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }

    @JsonIgnore
    public String getRefPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetId() {
        this._reset(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        } else {
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="refpsdedatasetname")
    public void setRefPSDEDataSetName(String refPSDEDataSetName) {
        this._set(DTOFIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }

    @JsonIgnore
    public String getRefPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetName() {
        this._reset(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdedatasetname(String refPSDEDataSetName) {
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="refpsdeid")
    public void setRefPSDEId(String refPSDEId) {
        this._set(DTOFIELD_REFPSDEID, refPSDEId);
    }

    @JsonIgnore
    public String getRefPSDEId() {
        Object objValue = this._get(DTOFIELD_REFPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEIdDirty() {
        return this._contains(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public void resetRefPSDEId() {
        this._reset(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        } else {
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="refpsdename")
    public void setRefPSDEName(String refPSDEName) {
        this._set(DTOFIELD_REFPSDENAME, refPSDEName);
    }

    @JsonIgnore
    public String getRefPSDEName() {
        Object objValue = this._get(DTOFIELD_REFPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDENameDirty() {
        return this._contains(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public void resetRefPSDEName() {
        this._reset(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    @JsonProperty(value="refpssystestdataid")
    public void setRefPSSysTestDataId(String refPSSysTestDataId) {
        this._set(DTOFIELD_REFPSSYSTESTDATAID, refPSSysTestDataId);
    }

    @JsonIgnore
    public String getRefPSSysTestDataId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSTESTDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysTestDataIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSTESTDATAID);
    }

    @JsonIgnore
    public void resetRefPSSysTestDataId() {
        this._reset(DTOFIELD_REFPSSYSTESTDATAID);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataid(String refPSSysTestDataId) {
        this.setRefPSSysTestDataId(refPSSysTestDataId);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataid(PSSysTestDataDTO pSSysTestData) {
        if (pSSysTestData == null) {
            this.setRefPSSysTestDataId(null);
            this.setRefPSSysTestDataName(null);
        } else {
            this.setRefPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setRefPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    @JsonProperty(value="refpssystestdataname")
    public void setRefPSSysTestDataName(String refPSSysTestDataName) {
        this._set(DTOFIELD_REFPSSYSTESTDATANAME, refPSSysTestDataName);
    }

    @JsonIgnore
    public String getRefPSSysTestDataName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSTESTDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysTestDataNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSTESTDATANAME);
    }

    @JsonIgnore
    public void resetRefPSSysTestDataName() {
        this._reset(DTOFIELD_REFPSSYSTESTDATANAME);
    }

    @JsonIgnore
    public PSSysTDItemDTO refpssystestdataname(String refPSSysTestDataName) {
        this.setRefPSSysTestDataName(refPSSysTestDataName);
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
    public PSSysTDItemDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
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
    public PSSysTDItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysTDItemDTO updateman(String updateMan) {
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
    public PSSysTDItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysTDItemDTO usertag(String userTag) {
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
    public PSSysTDItemDTO usertag2(String userTag2) {
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
    public PSSysTDItemDTO usertag3(String userTag3) {
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
    public PSSysTDItemDTO usertag4(String userTag4) {
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
    public PSSysTDItemDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="value")
    public void setValue(String value) {
        this._set(DTOFIELD_VALUE, value);
    }

    @JsonIgnore
    public String getValue() {
        Object objValue = this._get(DTOFIELD_VALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueDirty() {
        return this._contains(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public void resetValue() {
        this._reset(DTOFIELD_VALUE);
    }

    @JsonIgnore
    public PSSysTDItemDTO value(String value) {
        this.setValue(value);
        return this;
    }

    @JsonProperty(value="valuerange")
    public void setValueRange(String valueRange) {
        this._set(DTOFIELD_VALUERANGE, valueRange);
    }

    @JsonIgnore
    public String getValueRange() {
        Object objValue = this._get(DTOFIELD_VALUERANGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueRangeDirty() {
        return this._contains(DTOFIELD_VALUERANGE);
    }

    @JsonIgnore
    public void resetValueRange() {
        this._reset(DTOFIELD_VALUERANGE);
    }

    @JsonIgnore
    public PSSysTDItemDTO valuerange(String valueRange) {
        this.setValueRange(valueRange);
        return this;
    }

    @JsonProperty(value="valuetype")
    public void setValueType(String valueType) {
        this._set(DTOFIELD_VALUETYPE, valueType);
    }

    @JsonIgnore
    public String getValueType() {
        Object objValue = this._get(DTOFIELD_VALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueTypeDirty() {
        return this._contains(DTOFIELD_VALUETYPE);
    }

    @JsonIgnore
    public void resetValueType() {
        this._reset(DTOFIELD_VALUETYPE);
    }

    @JsonIgnore
    public PSSysTDItemDTO valuetype(String valueType) {
        this.setValueType(valueType);
        return this;
    }

    @JsonIgnore
    public PSSysTDItemDTO valuetype(PSModelEnums.TestDataItemValueType valueType) {
        if (valueType == null) {
            this.setValueType(null);
        } else {
            this.setValueType(valueType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysTDItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysTDItemId(strValue);
    }

    @JsonIgnore
    public PSSysTDItemDTO id(String strValue) {
        this.setPSSysTDItemId(strValue);
        return this;
    }
}
