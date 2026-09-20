package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBICubeDimensionDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLHIERARCHYFLAG = "ALLHIERARCHYFLAG";
    protected static final String DTOFIELD_ALLHIERARCHYFLAG = "allhierarchyflag";
    public static final String FIELD_BICUBEDIMENSIONTAG = "BICUBEDIMENSIONTAG";
    protected static final String DTOFIELD_BICUBEDIMENSIONTAG = "bicubedimensiontag";
    public static final String FIELD_BICUBEDIMENSIONTAG2 = "BICUBEDIMENSIONTAG2";
    protected static final String DTOFIELD_BICUBEDIMENSIONTAG2 = "bicubedimensiontag2";
    public static final String FIELD_BIDIMENSIONTYPE = "BIDIMENSIONTYPE";
    protected static final String DTOFIELD_BIDIMENSIONTYPE = "bidimensiontype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DIMENSIONFORMULA = "DIMENSIONFORMULA";
    protected static final String DTOFIELD_DIMENSIONFORMULA = "dimensionformula";
    public static final String FIELD_EXPANDFLAG = "EXPANDFLAG";
    protected static final String DTOFIELD_EXPANDFLAG = "expandflag";
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
    public static final String FIELD_PSSYSBICUBEDIMENSIONID = "PSSYSBICUBEDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";
    public static final String FIELD_PSSYSBICUBEDIMENSIONNAME = "PSSYSBICUBEDIMENSIONNAME";
    protected static final String DTOFIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBIDIMENSIONID = "PSSYSBIDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";
    public static final String FIELD_PSSYSBIDIMENSIONNAME = "PSSYSBIDIMENSIONNAME";
    protected static final String DTOFIELD_PSSYSBIDIMENSIONNAME = "pssysbidimensionname";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSDBVFID = "PSSYSDBVFID";
    protected static final String DTOFIELD_PSSYSDBVFID = "pssysdbvfid";
    public static final String FIELD_PSSYSDBVFNAME = "PSSYSDBVFNAME";
    protected static final String DTOFIELD_PSSYSDBVFNAME = "pssysdbvfname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
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

    @JsonProperty(value="allhierarchyflag")
    public void setAllHierarchyFlag(Integer allHierarchyFlag) {
        this._set(DTOFIELD_ALLHIERARCHYFLAG, allHierarchyFlag);
    }

    @JsonIgnore
    public Integer getAllHierarchyFlag() {
        Object objValue = this._get(DTOFIELD_ALLHIERARCHYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllHierarchyFlagDirty() {
        return this._contains(DTOFIELD_ALLHIERARCHYFLAG);
    }

    @JsonIgnore
    public void resetAllHierarchyFlag() {
        this._reset(DTOFIELD_ALLHIERARCHYFLAG);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO allhierarchyflag(Integer allHierarchyFlag) {
        this.setAllHierarchyFlag(allHierarchyFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO allhierarchyflag(Boolean allHierarchyFlag) {
        if (allHierarchyFlag == null) {
            this.setAllHierarchyFlag(null);
        } else {
            this.setAllHierarchyFlag(allHierarchyFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="bicubedimensiontag")
    public void setBICubeDimensionTag(String bICubeDimensionTag) {
        this._set(DTOFIELD_BICUBEDIMENSIONTAG, bICubeDimensionTag);
    }

    @JsonIgnore
    public String getBICubeDimensionTag() {
        Object objValue = this._get(DTOFIELD_BICUBEDIMENSIONTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeDimensionTagDirty() {
        return this._contains(DTOFIELD_BICUBEDIMENSIONTAG);
    }

    @JsonIgnore
    public void resetBICubeDimensionTag() {
        this._reset(DTOFIELD_BICUBEDIMENSIONTAG);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO bicubedimensiontag(String bICubeDimensionTag) {
        this.setBICubeDimensionTag(bICubeDimensionTag);
        return this;
    }

    @JsonProperty(value="bicubedimensiontag2")
    public void setBICubeDimensionTag2(String bICubeDimensionTag2) {
        this._set(DTOFIELD_BICUBEDIMENSIONTAG2, bICubeDimensionTag2);
    }

    @JsonIgnore
    public String getBICubeDimensionTag2() {
        Object objValue = this._get(DTOFIELD_BICUBEDIMENSIONTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeDimensionTag2Dirty() {
        return this._contains(DTOFIELD_BICUBEDIMENSIONTAG2);
    }

    @JsonIgnore
    public void resetBICubeDimensionTag2() {
        this._reset(DTOFIELD_BICUBEDIMENSIONTAG2);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO bicubedimensiontag2(String bICubeDimensionTag2) {
        this.setBICubeDimensionTag2(bICubeDimensionTag2);
        return this;
    }

    @JsonProperty(value="bidimensiontype")
    public void setBIDimensionType(String bIDimensionType) {
        this._set(DTOFIELD_BIDIMENSIONTYPE, bIDimensionType);
    }

    @JsonIgnore
    public String getBIDimensionType() {
        Object objValue = this._get(DTOFIELD_BIDIMENSIONTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIDimensionTypeDirty() {
        return this._contains(DTOFIELD_BIDIMENSIONTYPE);
    }

    @JsonIgnore
    public void resetBIDimensionType() {
        this._reset(DTOFIELD_BIDIMENSIONTYPE);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO bidimensiontype(String bIDimensionType) {
        this.setBIDimensionType(bIDimensionType);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO bidimensiontype(PSModelEnums.BIDimensionType bIDimensionType) {
        if (bIDimensionType == null) {
            this.setBIDimensionType(null);
        } else {
            this.setBIDimensionType(bIDimensionType.value);
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
    public PSSysBICubeDimensionDTO codename(String codeName) {
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
    public PSSysBICubeDimensionDTO createdate(Timestamp createDate) {
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
    public PSSysBICubeDimensionDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dimensionformula")
    public void setDimensionFormula(String dimensionFormula) {
        this._set(DTOFIELD_DIMENSIONFORMULA, dimensionFormula);
    }

    @JsonIgnore
    public String getDimensionFormula() {
        Object objValue = this._get(DTOFIELD_DIMENSIONFORMULA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDimensionFormulaDirty() {
        return this._contains(DTOFIELD_DIMENSIONFORMULA);
    }

    @JsonIgnore
    public void resetDimensionFormula() {
        this._reset(DTOFIELD_DIMENSIONFORMULA);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO dimensionformula(String dimensionFormula) {
        this.setDimensionFormula(dimensionFormula);
        return this;
    }

    @JsonProperty(value="expandflag")
    public void setExpandFlag(Integer expandFlag) {
        this._set(DTOFIELD_EXPANDFLAG, expandFlag);
    }

    @JsonIgnore
    public Integer getExpandFlag() {
        Object objValue = this._get(DTOFIELD_EXPANDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExpandFlagDirty() {
        return this._contains(DTOFIELD_EXPANDFLAG);
    }

    @JsonIgnore
    public void resetExpandFlag() {
        this._reset(DTOFIELD_EXPANDFLAG);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO expandflag(Integer expandFlag) {
        this.setExpandFlag(expandFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO expandflag(Boolean expandFlag) {
        if (expandFlag == null) {
            this.setExpandFlag(null);
        } else {
            this.setExpandFlag(expandFlag != false ? 1 : 0);
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
    public PSSysBICubeDimensionDTO memo(String memo) {
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
    public PSSysBICubeDimensionDTO ordervalue(Integer orderValue) {
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
    public PSSysBICubeDimensionDTO parampsdeuiactionid(String paramPSDEUIActionId) {
        this.setParamPSDEUIActionId(paramPSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO parampsdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSSysBICubeDimensionDTO parampsdeuiactionname(String paramPSDEUIActionName) {
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
    public PSSysBICubeDimensionDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSSysBICubeDimensionDTO pscodelistname(String pSCodeListName) {
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
    public PSSysBICubeDimensionDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysBICubeDimensionDTO psdefname(String pSDEFName) {
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
    public PSSysBICubeDimensionDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSSysBICubeDimensionDTO pssysbicubedimensionid(String pSSysBICubeDimensionId) {
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
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
    public PSSysBICubeDimensionDTO pssysbicubedimensionname(String pSSysBICubeDimensionName) {
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBICubeDimensionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBICubeDimensionName(strName);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO name(String strName) {
        this.setPSSysBICubeDimensionName(strName);
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
    public PSSysBICubeDimensionDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
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
    public PSSysBICubeDimensionDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonProperty(value="pssysbidimensionid")
    public void setPSSysBIDimensionId(String pSSysBIDimensionId) {
        this._set(DTOFIELD_PSSYSBIDIMENSIONID, pSSysBIDimensionId);
    }

    @JsonIgnore
    public String getPSSysBIDimensionId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIDIMENSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIDimensionIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIDIMENSIONID);
    }

    @JsonIgnore
    public void resetPSSysBIDimensionId() {
        this._reset(DTOFIELD_PSSYSBIDIMENSIONID);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysbidimensionid(String pSSysBIDimensionId) {
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysbidimensionid(PSSysBIDimensionDTO pSSysBIDimension) {
        if (pSSysBIDimension == null) {
            this.setPSSysBIDimensionId(null);
            this.setPSSysBIDimensionName(null);
        } else {
            this.setPSSysBIDimensionId(pSSysBIDimension.getPSSysBIDimensionId());
            this.setPSSysBIDimensionName(pSSysBIDimension.getPSSysBIDimensionName());
        }
        return this;
    }

    @JsonProperty(value="pssysbidimensionname")
    public void setPSSysBIDimensionName(String pSSysBIDimensionName) {
        this._set(DTOFIELD_PSSYSBIDIMENSIONNAME, pSSysBIDimensionName);
    }

    @JsonIgnore
    public String getPSSysBIDimensionName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIDIMENSIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIDimensionNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIDIMENSIONNAME);
    }

    @JsonIgnore
    public void resetPSSysBIDimensionName() {
        this._reset(DTOFIELD_PSSYSBIDIMENSIONNAME);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysbidimensionname(String pSSysBIDimensionName) {
        this.setPSSysBIDimensionName(pSSysBIDimensionName);
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
    public PSSysBICubeDimensionDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonProperty(value="pssysdbvfid")
    public void setPSSysDBVFId(String pSSysDBVFId) {
        this._set(DTOFIELD_PSSYSDBVFID, pSSysDBVFId);
    }

    @JsonIgnore
    public String getPSSysDBVFId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public void resetPSSysDBVFId() {
        this._reset(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysdbvfid(String pSSysDBVFId) {
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysdbvfid(PSSysDBVFDTO pSSysDBVF) {
        if (pSSysDBVF == null) {
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        } else {
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbvfname")
    public void setPSSysDBVFName(String pSSysDBVFName) {
        this._set(DTOFIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }

    @JsonIgnore
    public String getPSSysDBVFName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFName() {
        this._reset(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO pssysdbvfname(String pSSysDBVFName) {
        this.setPSSysDBVFName(pSSysDBVFName);
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
    public PSSysBICubeDimensionDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
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
    public PSSysBICubeDimensionDTO texttemplate(String textTemplate) {
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
    public PSSysBICubeDimensionDTO tiptemplate(String tipTemplate) {
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
    public PSSysBICubeDimensionDTO updatedate(Timestamp updateDate) {
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
    public PSSysBICubeDimensionDTO updateman(String updateMan) {
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
    public PSSysBICubeDimensionDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBICubeDimensionDTO usertag(String userTag) {
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
    public PSSysBICubeDimensionDTO usertag2(String userTag2) {
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
    public PSSysBICubeDimensionDTO usertag3(String userTag3) {
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
    public PSSysBICubeDimensionDTO usertag4(String userTag4) {
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
    public PSSysBICubeDimensionDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBICubeDimensionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBICubeDimensionId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeDimensionDTO id(String strValue) {
        this.setPSSysBICubeDimensionId(strValue);
        return this;
    }
}
