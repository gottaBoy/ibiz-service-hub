package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFVRCondDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDTAG = "CONDTAG";
    protected static final String DTOFIELD_CONDTAG = "condtag";
    public static final String FIELD_CONDTAG2 = "CONDTAG2";
    protected static final String DTOFIELD_CONDTAG2 = "condtag2";
    public static final String FIELD_CONDTYPE = "CONDTYPE";
    protected static final String DTOFIELD_CONDTYPE = "condtype";
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDEFNAME = "CUSTOMDEFNAME";
    protected static final String DTOFIELD_CUSTOMDEFNAME = "customdefname";
    public static final String FIELD_EXTMAJORPSDEFID = "EXTMAJORPSDEFID";
    protected static final String DTOFIELD_EXTMAJORPSDEFID = "extmajorpsdefid";
    public static final String FIELD_EXTMAJORPSDEFNAME = "EXTMAJORPSDEFNAME";
    protected static final String DTOFIELD_EXTMAJORPSDEFNAME = "extmajorpsdefname";
    public static final String FIELD_EXTMINORPSDEFID = "EXTMINORPSDEFID";
    protected static final String DTOFIELD_EXTMINORPSDEFID = "extminorpsdefid";
    public static final String FIELD_EXTMINORPSDEFNAME = "EXTMINORPSDEFNAME";
    protected static final String DTOFIELD_EXTMINORPSDEFNAME = "extminorpsdefname";
    public static final String FIELD_GROUPNOTFLAG = "GROUPNOTFLAG";
    protected static final String DTOFIELD_GROUPNOTFLAG = "groupnotflag";
    public static final String FIELD_GROUPOP = "GROUPOP";
    protected static final String DTOFIELD_GROUPOP = "groupop";
    public static final String FIELD_KEYCONDFLAG = "KEYCONDFLAG";
    protected static final String DTOFIELD_KEYCONDFLAG = "keycondflag";
    public static final String FIELD_MAJORPSDEDSID = "MAJORPSDEDSTID";
    protected static final String DTOFIELD_MAJORPSDEDSID = "majorpsdedsid";
    public static final String FIELD_MAJORPSDEDSNAME = "MAJORPSDEDSTNAME";
    protected static final String DTOFIELD_MAJORPSDEDSNAME = "majorpsdedsname";
    public static final String FIELD_MAJORPSDEID = "MAJORPSDEID";
    protected static final String DTOFIELD_MAJORPSDEID = "majorpsdeid";
    public static final String FIELD_MAJORPSDENAME = "MAJORPSDENAME";
    protected static final String DTOFIELD_MAJORPSDENAME = "majorpsdename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM10 = "PARAM10";
    protected static final String DTOFIELD_PARAM10 = "param10";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
    public static final String FIELD_PARAM5 = "PARAM5";
    protected static final String DTOFIELD_PARAM5 = "param5";
    public static final String FIELD_PARAM6 = "PARAM6";
    protected static final String DTOFIELD_PARAM6 = "param6";
    public static final String FIELD_PARAM7 = "PARAM7";
    protected static final String DTOFIELD_PARAM7 = "param7";
    public static final String FIELD_PARAM8 = "PARAM8";
    protected static final String DTOFIELD_PARAM8 = "param8";
    public static final String FIELD_PARAM9 = "PARAM9";
    protected static final String DTOFIELD_PARAM9 = "param9";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_PPSDEFVRCONDID = "PPSDEFVRCONDID";
    protected static final String DTOFIELD_PPSDEFVRCONDID = "ppsdefvrcondid";
    public static final String FIELD_PPSDEFVRCONDNAME = "PPSDEFVRCONDNAME";
    protected static final String DTOFIELD_PPSDEFVRCONDNAME = "ppsdefvrcondname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFVRCONDID = "PSDEFVRCONDID";
    protected static final String DTOFIELD_PSDEFVRCONDID = "psdefvrcondid";
    public static final String FIELD_PSDEFVRCONDNAME = "PSDEFVRCONDNAME";
    protected static final String DTOFIELD_PSDEFVRCONDNAME = "psdefvrcondname";
    public static final String FIELD_PSDEFVRID = "PSDEFVRID";
    protected static final String DTOFIELD_PSDEFVRID = "psdefvrid";
    public static final String FIELD_PSDEFVRNAME = "PSDEFVRNAME";
    protected static final String DTOFIELD_PSDEFVRNAME = "psdefvrname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
    public static final String FIELD_RIPSLANRESID = "RIPSLANRESID";
    protected static final String DTOFIELD_RIPSLANRESID = "ripslanresid";
    public static final String FIELD_RIPSLANRESNAME = "RIPSLANRESNAME";
    protected static final String DTOFIELD_RIPSLANRESNAME = "ripslanresname";
    public static final String FIELD_RULEINFO = "RULEINFO";
    protected static final String DTOFIELD_RULEINFO = "ruleinfo";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String DTOFIELD_PSDEFVRCONDS = "psdefvrconds";

    @JsonProperty(value="condtag")
    public void setCondTag(String condTag) {
        this._set(DTOFIELD_CONDTAG, condTag);
    }

    @JsonIgnore
    public String getCondTag() {
        Object objValue = this._get(DTOFIELD_CONDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTagDirty() {
        return this._contains(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public void resetCondTag() {
        this._reset(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public PSDEFVRCondDTO condtag(String condTag) {
        this.setCondTag(condTag);
        return this;
    }

    @JsonProperty(value="condtag2")
    public void setCondTag2(String condTag2) {
        this._set(DTOFIELD_CONDTAG2, condTag2);
    }

    @JsonIgnore
    public String getCondTag2() {
        Object objValue = this._get(DTOFIELD_CONDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTag2Dirty() {
        return this._contains(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public void resetCondTag2() {
        this._reset(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public PSDEFVRCondDTO condtag2(String condTag2) {
        this.setCondTag2(condTag2);
        return this;
    }

    @JsonProperty(value="condtype")
    public void setCondType(String condType) {
        this._set(DTOFIELD_CONDTYPE, condType);
    }

    @JsonIgnore
    public String getCondType() {
        Object objValue = this._get(DTOFIELD_CONDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTypeDirty() {
        return this._contains(DTOFIELD_CONDTYPE);
    }

    @JsonIgnore
    public void resetCondType() {
        this._reset(DTOFIELD_CONDTYPE);
    }

    @JsonIgnore
    public PSDEFVRCondDTO condtype(String condType) {
        this.setCondType(condType);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO condtype(PSModelEnums.DEFVRType condType) {
        if (condType == null) {
            this.setCondType(null);
        } else {
            this.setCondType(condType.value);
        }
        return this;
    }

    @JsonProperty(value="condvalue")
    public void setCondValue(String condValue) {
        this._set(DTOFIELD_CONDVALUE, condValue);
    }

    @JsonIgnore
    public String getCondValue() {
        Object objValue = this._get(DTOFIELD_CONDVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondValueDirty() {
        return this._contains(DTOFIELD_CONDVALUE);
    }

    @JsonIgnore
    public void resetCondValue() {
        this._reset(DTOFIELD_CONDVALUE);
    }

    @JsonIgnore
    public PSDEFVRCondDTO condvalue(String condValue) {
        this.setCondValue(condValue);
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
    public PSDEFVRCondDTO createdate(Timestamp createDate) {
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
    public PSDEFVRCondDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdefname")
    public void setCustomDEFName(String customDEFName) {
        this._set(DTOFIELD_CUSTOMDEFNAME, customDEFName);
    }

    @JsonIgnore
    public String getCustomDEFName() {
        Object objValue = this._get(DTOFIELD_CUSTOMDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDEFNameDirty() {
        return this._contains(DTOFIELD_CUSTOMDEFNAME);
    }

    @JsonIgnore
    public void resetCustomDEFName() {
        this._reset(DTOFIELD_CUSTOMDEFNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO customdefname(String customDEFName) {
        this.setCustomDEFName(customDEFName);
        return this;
    }

    @JsonProperty(value="extmajorpsdefid")
    public void setExtMajorPSDEFId(String extMajorPSDEFId) {
        this._set(DTOFIELD_EXTMAJORPSDEFID, extMajorPSDEFId);
    }

    @JsonIgnore
    public String getExtMajorPSDEFId() {
        Object objValue = this._get(DTOFIELD_EXTMAJORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtMajorPSDEFIdDirty() {
        return this._contains(DTOFIELD_EXTMAJORPSDEFID);
    }

    @JsonIgnore
    public void resetExtMajorPSDEFId() {
        this._reset(DTOFIELD_EXTMAJORPSDEFID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefid(String extMajorPSDEFId) {
        this.setExtMajorPSDEFId(extMajorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setExtMajorPSDEFId(null);
            this.setExtMajorPSDEFName(null);
        } else {
            this.setExtMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setExtMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="extmajorpsdefname")
    public void setExtMajorPSDEFName(String extMajorPSDEFName) {
        this._set(DTOFIELD_EXTMAJORPSDEFNAME, extMajorPSDEFName);
    }

    @JsonIgnore
    public String getExtMajorPSDEFName() {
        Object objValue = this._get(DTOFIELD_EXTMAJORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtMajorPSDEFNameDirty() {
        return this._contains(DTOFIELD_EXTMAJORPSDEFNAME);
    }

    @JsonIgnore
    public void resetExtMajorPSDEFName() {
        this._reset(DTOFIELD_EXTMAJORPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO extmajorpsdefname(String extMajorPSDEFName) {
        this.setExtMajorPSDEFName(extMajorPSDEFName);
        return this;
    }

    @JsonProperty(value="extminorpsdefid")
    public void setExtMinorPSDEFId(String extMinorPSDEFId) {
        this._set(DTOFIELD_EXTMINORPSDEFID, extMinorPSDEFId);
    }

    @JsonIgnore
    public String getExtMinorPSDEFId() {
        Object objValue = this._get(DTOFIELD_EXTMINORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtMinorPSDEFIdDirty() {
        return this._contains(DTOFIELD_EXTMINORPSDEFID);
    }

    @JsonIgnore
    public void resetExtMinorPSDEFId() {
        this._reset(DTOFIELD_EXTMINORPSDEFID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefid(String extMinorPSDEFId) {
        this.setExtMinorPSDEFId(extMinorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setExtMinorPSDEFId(null);
            this.setExtMinorPSDEFName(null);
        } else {
            this.setExtMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setExtMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="extminorpsdefname")
    public void setExtMinorPSDEFName(String extMinorPSDEFName) {
        this._set(DTOFIELD_EXTMINORPSDEFNAME, extMinorPSDEFName);
    }

    @JsonIgnore
    public String getExtMinorPSDEFName() {
        Object objValue = this._get(DTOFIELD_EXTMINORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtMinorPSDEFNameDirty() {
        return this._contains(DTOFIELD_EXTMINORPSDEFNAME);
    }

    @JsonIgnore
    public void resetExtMinorPSDEFName() {
        this._reset(DTOFIELD_EXTMINORPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO extminorpsdefname(String extMinorPSDEFName) {
        this.setExtMinorPSDEFName(extMinorPSDEFName);
        return this;
    }

    @JsonProperty(value="groupnotflag")
    public void setGroupNotFlag(Integer groupNotFlag) {
        this._set(DTOFIELD_GROUPNOTFLAG, groupNotFlag);
    }

    @JsonIgnore
    public Integer getGroupNotFlag() {
        Object objValue = this._get(DTOFIELD_GROUPNOTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupNotFlagDirty() {
        return this._contains(DTOFIELD_GROUPNOTFLAG);
    }

    @JsonIgnore
    public void resetGroupNotFlag() {
        this._reset(DTOFIELD_GROUPNOTFLAG);
    }

    @JsonIgnore
    public PSDEFVRCondDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO groupnotflag(Boolean groupNotFlag) {
        if (groupNotFlag == null) {
            this.setGroupNotFlag(null);
        } else {
            this.setGroupNotFlag(groupNotFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="groupop")
    public void setGroupOP(String groupOP) {
        this._set(DTOFIELD_GROUPOP, groupOP);
    }

    @JsonIgnore
    public String getGroupOP() {
        Object objValue = this._get(DTOFIELD_GROUPOP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupOPDirty() {
        return this._contains(DTOFIELD_GROUPOP);
    }

    @JsonIgnore
    public void resetGroupOP() {
        this._reset(DTOFIELD_GROUPOP);
    }

    @JsonIgnore
    public PSDEFVRCondDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO groupop(PSModelEnums.GroupCondOP groupOP) {
        if (groupOP == null) {
            this.setGroupOP(null);
        } else {
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    @JsonProperty(value="keycondflag")
    public void setKeyCondFlag(Integer keyCondFlag) {
        this._set(DTOFIELD_KEYCONDFLAG, keyCondFlag);
    }

    @JsonIgnore
    public Integer getKeyCondFlag() {
        Object objValue = this._get(DTOFIELD_KEYCONDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isKeyCondFlagDirty() {
        return this._contains(DTOFIELD_KEYCONDFLAG);
    }

    @JsonIgnore
    public void resetKeyCondFlag() {
        this._reset(DTOFIELD_KEYCONDFLAG);
    }

    @JsonIgnore
    public PSDEFVRCondDTO keycondflag(Integer keyCondFlag) {
        this.setKeyCondFlag(keyCondFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO keycondflag(Boolean keyCondFlag) {
        if (keyCondFlag == null) {
            this.setKeyCondFlag(null);
        } else {
            this.setKeyCondFlag(keyCondFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="majorpsdedsid")
    public void setMajorPSDEDSId(String majorPSDEDSId) {
        this._set(DTOFIELD_MAJORPSDEDSID, majorPSDEDSId);
        this._set(FIELD_MAJORPSDEDSID, majorPSDEDSId);
    }

    @JsonIgnore
    public String getMajorPSDEDSId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEDSID);
        if (objValue == null && (objValue = this._get(FIELD_MAJORPSDEDSID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEDSIdDirty() {
        if (this._contains(DTOFIELD_MAJORPSDEDSID)) {
            return true;
        }
        return this._contains(FIELD_MAJORPSDEDSID);
    }

    @JsonIgnore
    public void resetMajorPSDEDSId() {
        this._reset(DTOFIELD_MAJORPSDEDSID);
        this._reset(FIELD_MAJORPSDEDSID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsid(String majorPSDEDSId) {
        this.setMajorPSDEDSId(majorPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setMajorPSDEDSId(null);
            this.setMajorPSDEDSName(null);
        } else {
            this.setMajorPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setMajorPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdedsname")
    public void setMajorPSDEDSName(String majorPSDEDSName) {
        this._set(DTOFIELD_MAJORPSDEDSNAME, majorPSDEDSName);
        this._set(FIELD_MAJORPSDEDSNAME, majorPSDEDSName);
    }

    @JsonIgnore
    public String getMajorPSDEDSName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEDSNAME);
        if (objValue == null && (objValue = this._get(FIELD_MAJORPSDEDSNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEDSNameDirty() {
        if (this._contains(DTOFIELD_MAJORPSDEDSNAME)) {
            return true;
        }
        return this._contains(FIELD_MAJORPSDEDSNAME);
    }

    @JsonIgnore
    public void resetMajorPSDEDSName() {
        this._reset(DTOFIELD_MAJORPSDEDSNAME);
        this._reset(FIELD_MAJORPSDEDSNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO majorpsdedsname(String majorPSDEDSName) {
        this.setMajorPSDEDSName(majorPSDEDSName);
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
    public PSDEFVRCondDTO majorpsdeid(String majorPSDEId) {
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO majorpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setMajorPSDEId(null);
            this.setMajorPSDEName(null);
        } else {
            this.setMajorPSDEId(pSDataEntity.getPSDataEntityId());
            this.setMajorPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdename")
    public void setMajorPSDEName(String majorPSDEName) {
        this._set(DTOFIELD_MAJORPSDENAME, majorPSDEName);
    }

    @JsonIgnore
    public String getMajorPSDEName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDENameDirty() {
        return this._contains(DTOFIELD_MAJORPSDENAME);
    }

    @JsonIgnore
    public void resetMajorPSDEName() {
        this._reset(DTOFIELD_MAJORPSDENAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO majorpsdename(String majorPSDEName) {
        this.setMajorPSDEName(majorPSDEName);
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
    public PSDEFVRCondDTO memo(String memo) {
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
    public PSDEFVRCondDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="param")
    public void setParam(String param) {
        this._set(DTOFIELD_PARAM, param);
    }

    @JsonIgnore
    public String getParam() {
        Object objValue = this._get(DTOFIELD_PARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDirty() {
        return this._contains(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public void resetParam() {
        this._reset(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param(String param) {
        this.setParam(param);
        return this;
    }

    @JsonProperty(value="param10")
    public void setParam10(Integer param10) {
        this._set(DTOFIELD_PARAM10, param10);
    }

    @JsonIgnore
    public Integer getParam10() {
        Object objValue = this._get(DTOFIELD_PARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam10Dirty() {
        return this._contains(DTOFIELD_PARAM10);
    }

    @JsonIgnore
    public void resetParam10() {
        this._reset(DTOFIELD_PARAM10);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param10(Integer param10) {
        this.setParam10(param10);
        return this;
    }

    @JsonProperty(value="param2")
    public void setParam2(String param2) {
        this._set(DTOFIELD_PARAM2, param2);
    }

    @JsonIgnore
    public String getParam2() {
        Object objValue = this._get(DTOFIELD_PARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam2Dirty() {
        return this._contains(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public void resetParam2() {
        this._reset(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(Integer param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public Integer getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param3(Integer param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(Integer param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public Integer getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param4(Integer param4) {
        this.setParam4(param4);
        return this;
    }

    @JsonProperty(value="param5")
    public void setParam5(Integer param5) {
        this._set(DTOFIELD_PARAM5, param5);
    }

    @JsonIgnore
    public Integer getParam5() {
        Object objValue = this._get(DTOFIELD_PARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam5Dirty() {
        return this._contains(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public void resetParam5() {
        this._reset(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param5(Integer param5) {
        this.setParam5(param5);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO param5(Boolean param5) {
        if (param5 == null) {
            this.setParam5(null);
        } else {
            this.setParam5(param5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="param6")
    public void setParam6(Integer param6) {
        this._set(DTOFIELD_PARAM6, param6);
    }

    @JsonIgnore
    public Integer getParam6() {
        Object objValue = this._get(DTOFIELD_PARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam6Dirty() {
        return this._contains(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public void resetParam6() {
        this._reset(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param6(Integer param6) {
        this.setParam6(param6);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO param6(Boolean param6) {
        if (param6 == null) {
            this.setParam6(null);
        } else {
            this.setParam6(param6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="param7")
    public void setParam7(BigDecimal param7) {
        this._set(DTOFIELD_PARAM7, param7);
    }

    @JsonIgnore
    public BigDecimal getParam7() {
        Object objValue = this._get(DTOFIELD_PARAM7);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isParam7Dirty() {
        return this._contains(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public void resetParam7() {
        this._reset(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param7(BigDecimal param7) {
        this.setParam7(param7);
        return this;
    }

    @JsonProperty(value="param8")
    public void setParam8(BigDecimal param8) {
        this._set(DTOFIELD_PARAM8, param8);
    }

    @JsonIgnore
    public BigDecimal getParam8() {
        Object objValue = this._get(DTOFIELD_PARAM8);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isParam8Dirty() {
        return this._contains(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public void resetParam8() {
        this._reset(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param8(BigDecimal param8) {
        this.setParam8(param8);
        return this;
    }

    @JsonProperty(value="param9")
    public void setParam9(Integer param9) {
        this._set(DTOFIELD_PARAM9, param9);
    }

    @JsonIgnore
    public Integer getParam9() {
        Object objValue = this._get(DTOFIELD_PARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam9Dirty() {
        return this._contains(DTOFIELD_PARAM9);
    }

    @JsonIgnore
    public void resetParam9() {
        this._reset(DTOFIELD_PARAM9);
    }

    @JsonIgnore
    public PSDEFVRCondDTO param9(Integer param9) {
        this.setParam9(param9);
        return this;
    }

    @JsonProperty(value="paramtype")
    public void setParamType(String paramType) {
        this._set(DTOFIELD_PARAMTYPE, paramType);
    }

    @JsonIgnore
    public String getParamType() {
        Object objValue = this._get(DTOFIELD_PARAMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTypeDirty() {
        return this._contains(DTOFIELD_PARAMTYPE);
    }

    @JsonIgnore
    public void resetParamType() {
        this._reset(DTOFIELD_PARAMTYPE);
    }

    @JsonIgnore
    public PSDEFVRCondDTO paramtype(String paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO paramtype(PSModelEnums.DEFVRParamType paramType) {
        if (paramType == null) {
            this.setParamType(null);
        } else {
            this.setParamType(paramType.value);
        }
        return this;
    }

    @JsonProperty(value="ppsdefvrcondid")
    public void setPPSDEFVRCondId(String pPSDEFVRCondId) {
        this._set(DTOFIELD_PPSDEFVRCONDID, pPSDEFVRCondId);
    }

    @JsonIgnore
    public String getPPSDEFVRCondId() {
        Object objValue = this._get(DTOFIELD_PPSDEFVRCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFVRCondIdDirty() {
        return this._contains(DTOFIELD_PPSDEFVRCONDID);
    }

    @JsonIgnore
    public void resetPPSDEFVRCondId() {
        this._reset(DTOFIELD_PPSDEFVRCONDID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondid(String pPSDEFVRCondId) {
        this.setPPSDEFVRCondId(pPSDEFVRCondId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondid(PSDEFVRCondDTO pSDEFVRCond) {
        if (pSDEFVRCond == null) {
            this.setPPSDEFVRCondId(null);
            this.setPPSDEFVRCondName(null);
        } else {
            this.setPPSDEFVRCondId(pSDEFVRCond.getPSDEFVRCondId());
            this.setPPSDEFVRCondName(pSDEFVRCond.getPSDEFVRCondName());
        }
        return this;
    }

    @JsonProperty(value="ppsdefvrcondname")
    public void setPPSDEFVRCondName(String pPSDEFVRCondName) {
        this._set(DTOFIELD_PPSDEFVRCONDNAME, pPSDEFVRCondName);
    }

    @JsonIgnore
    public String getPPSDEFVRCondName() {
        Object objValue = this._get(DTOFIELD_PPSDEFVRCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFVRCondNameDirty() {
        return this._contains(DTOFIELD_PPSDEFVRCONDNAME);
    }

    @JsonIgnore
    public void resetPPSDEFVRCondName() {
        this._reset(DTOFIELD_PPSDEFVRCONDNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO ppsdefvrcondname(String pPSDEFVRCondName) {
        this.setPPSDEFVRCondName(pPSDEFVRCondName);
        return this;
    }

    @JsonProperty(value="psdbvalueopid")
    public void setPSDBValueOPId(String pSDBValueOPId) {
        this._set(DTOFIELD_PSDBVALUEOPID, pSDBValueOPId);
    }

    @JsonIgnore
    public String getPSDBValueOPId() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPIdDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public void resetPSDBValueOPId() {
        this._reset(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
        if (pSDBValueOP == null) {
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        } else {
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    @JsonProperty(value="psdbvalueopname")
    public void setPSDBValueOPName(String pSDBValueOPName) {
        this._set(DTOFIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }

    @JsonIgnore
    public String getPSDBValueOPName() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPNameDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public void resetPSDBValueOPName() {
        this._reset(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
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
    public PSDEFVRCondDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
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
    public PSDEFVRCondDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
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
    public PSDEFVRCondDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEFVRCondDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdefvrcondid")
    public void setPSDEFVRCondId(String pSDEFVRCondId) {
        this._set(DTOFIELD_PSDEFVRCONDID, pSDEFVRCondId);
    }

    @JsonIgnore
    public String getPSDEFVRCondId() {
        Object objValue = this._get(DTOFIELD_PSDEFVRCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRCondIdDirty() {
        return this._contains(DTOFIELD_PSDEFVRCONDID);
    }

    @JsonIgnore
    public void resetPSDEFVRCondId() {
        this._reset(DTOFIELD_PSDEFVRCONDID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefvrcondid(String pSDEFVRCondId) {
        this.setPSDEFVRCondId(pSDEFVRCondId);
        return this;
    }

    @JsonProperty(value="psdefvrcondname")
    public void setPSDEFVRCondName(String pSDEFVRCondName) {
        this._set(DTOFIELD_PSDEFVRCONDNAME, pSDEFVRCondName);
    }

    @JsonIgnore
    public String getPSDEFVRCondName() {
        Object objValue = this._get(DTOFIELD_PSDEFVRCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRCondNameDirty() {
        return this._contains(DTOFIELD_PSDEFVRCONDNAME);
    }

    @JsonIgnore
    public void resetPSDEFVRCondName() {
        this._reset(DTOFIELD_PSDEFVRCONDNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefvrcondname(String pSDEFVRCondName) {
        this.setPSDEFVRCondName(pSDEFVRCondName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFVRCondName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFVRCondName(strName);
    }

    @JsonIgnore
    public PSDEFVRCondDTO name(String strName) {
        this.setPSDEFVRCondName(strName);
        return this;
    }

    @JsonProperty(value="psdefvrid")
    public void setPSDEFVRId(String pSDEFVRId) {
        this._set(DTOFIELD_PSDEFVRID, pSDEFVRId);
    }

    @JsonIgnore
    public String getPSDEFVRId() {
        Object objValue = this._get(DTOFIELD_PSDEFVRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRIdDirty() {
        return this._contains(DTOFIELD_PSDEFVRID);
    }

    @JsonIgnore
    public void resetPSDEFVRId() {
        this._reset(DTOFIELD_PSDEFVRID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefvrid(String pSDEFVRId) {
        this.setPSDEFVRId(pSDEFVRId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefvrid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setPSDEFVRId(null);
            this.setPSDEFVRName(null);
        } else {
            this.setPSDEFVRId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFVRName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="psdefvrname")
    public void setPSDEFVRName(String pSDEFVRName) {
        this._set(DTOFIELD_PSDEFVRNAME, pSDEFVRName);
    }

    @JsonIgnore
    public String getPSDEFVRName() {
        Object objValue = this._get(DTOFIELD_PSDEFVRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFVRNameDirty() {
        return this._contains(DTOFIELD_PSDEFVRNAME);
    }

    @JsonIgnore
    public void resetPSDEFVRName() {
        this._reset(DTOFIELD_PSDEFVRNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO psdefvrname(String pSDEFVRName) {
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    @JsonProperty(value="pssysvalueruleid")
    public void setPSSysValueRuleId(String pSSysValueRuleId) {
        this._set(DTOFIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }

    @JsonIgnore
    public String getPSSysValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public void resetPSSysValueRuleId() {
        this._reset(DTOFIELD_PSSYSVALUERULEID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
        if (pSSysValueRule == null) {
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        } else {
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="pssysvaluerulename")
    public void setPSSysValueRuleName(String pSSysValueRuleName) {
        this._set(DTOFIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }

    @JsonIgnore
    public String getPSSysValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSSysValueRuleName() {
        this._reset(DTOFIELD_PSSYSVALUERULENAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonProperty(value="ripslanresid")
    public void setRIPSLanResId(String rIPSLanResId) {
        this._set(DTOFIELD_RIPSLANRESID, rIPSLanResId);
    }

    @JsonIgnore
    public String getRIPSLanResId() {
        Object objValue = this._get(DTOFIELD_RIPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRIPSLanResIdDirty() {
        return this._contains(DTOFIELD_RIPSLANRESID);
    }

    @JsonIgnore
    public void resetRIPSLanResId() {
        this._reset(DTOFIELD_RIPSLANRESID);
    }

    @JsonIgnore
    public PSDEFVRCondDTO ripslanresid(String rIPSLanResId) {
        this.setRIPSLanResId(rIPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFVRCondDTO ripslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setRIPSLanResId(null);
            this.setRIPSLanResName(null);
        } else {
            this.setRIPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setRIPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="ripslanresname")
    public void setRIPSLanResName(String rIPSLanResName) {
        this._set(DTOFIELD_RIPSLANRESNAME, rIPSLanResName);
    }

    @JsonIgnore
    public String getRIPSLanResName() {
        Object objValue = this._get(DTOFIELD_RIPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRIPSLanResNameDirty() {
        return this._contains(DTOFIELD_RIPSLANRESNAME);
    }

    @JsonIgnore
    public void resetRIPSLanResName() {
        this._reset(DTOFIELD_RIPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEFVRCondDTO ripslanresname(String rIPSLanResName) {
        this.setRIPSLanResName(rIPSLanResName);
        return this;
    }

    @JsonProperty(value="ruleinfo")
    public void setRuleInfo(String ruleInfo) {
        this._set(DTOFIELD_RULEINFO, ruleInfo);
    }

    @JsonIgnore
    public String getRuleInfo() {
        Object objValue = this._get(DTOFIELD_RULEINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRuleInfoDirty() {
        return this._contains(DTOFIELD_RULEINFO);
    }

    @JsonIgnore
    public void resetRuleInfo() {
        this._reset(DTOFIELD_RULEINFO);
    }

    @JsonIgnore
    public PSDEFVRCondDTO ruleinfo(String ruleInfo) {
        this.setRuleInfo(ruleInfo);
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
    public PSDEFVRCondDTO updatedate(Timestamp updateDate) {
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
    public PSDEFVRCondDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSDEFVRCondDTO usertag(String userTag) {
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
    public PSDEFVRCondDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFVRCondId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFVRCondId(strValue);
    }

    @JsonIgnore
    public PSDEFVRCondDTO id(String strValue) {
        this.setPSDEFVRCondId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEFVRCondDTO> getPSDEFVRConds() {
        Object list = this._get(DTOFIELD_PSDEFVRCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefvrconds")
    public void setPSDEFVRConds(List<PSDEFVRCondDTO> psdefvrconds) {
        this._set(DTOFIELD_PSDEFVRCONDS, psdefvrconds);
    }

    @JsonIgnore
    public List<PSDEFVRCondDTO> getPSDEFVRCondsIf() {
        Object list = this._get(DTOFIELD_PSDEFVRCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFVRCONDS, list);
        }
        return (List) list;
    }
}
