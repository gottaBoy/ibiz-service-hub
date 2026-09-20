package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIHierarchyDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBILevelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBICubeLevelDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLLEVELFLAG = "ALLLEVELFLAG";
    protected static final String DTOFIELD_ALLLEVELFLAG = "alllevelflag";
    public static final String FIELD_BICUBELEVELTAG = "BICUBELEVELTAG";
    protected static final String DTOFIELD_BICUBELEVELTAG = "bicubeleveltag";
    public static final String FIELD_BICUBELEVELTAG2 = "BICUBELEVELTAG2";
    protected static final String DTOFIELD_BICUBELEVELTAG2 = "bicubeleveltag2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
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
    public static final String FIELD_PSSYSBICUBELEVELID = "PSSYSBICUBELEVELID";
    protected static final String DTOFIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";
    public static final String FIELD_PSSYSBICUBELEVELNAME = "PSSYSBICUBELEVELNAME";
    protected static final String DTOFIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";
    public static final String FIELD_PSSYSBIDIMENSIONID = "PSSYSBIDIMENSIONID";
    protected static final String DTOFIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";
    public static final String FIELD_PSSYSBIHIERARCHYID = "PSSYSBIHIERARCHYID";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";
    public static final String FIELD_PSSYSBIHIERARCHYNAME = "PSSYSBIHIERARCHYNAME";
    protected static final String DTOFIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";
    public static final String FIELD_PSSYSBILEVELID = "PSSYSBILEVELID";
    protected static final String DTOFIELD_PSSYSBILEVELID = "pssysbilevelid";
    public static final String FIELD_PSSYSBILEVELNAME = "PSSYSBILEVELNAME";
    protected static final String DTOFIELD_PSSYSBILEVELNAME = "pssysbilevelname";
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

    @JsonProperty(value="alllevelflag")
    public void setAllLevelFlag(Integer allLevelFlag) {
        this._set(DTOFIELD_ALLLEVELFLAG, allLevelFlag);
    }

    @JsonIgnore
    public Integer getAllLevelFlag() {
        Object objValue = this._get(DTOFIELD_ALLLEVELFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllLevelFlagDirty() {
        return this._contains(DTOFIELD_ALLLEVELFLAG);
    }

    @JsonIgnore
    public void resetAllLevelFlag() {
        this._reset(DTOFIELD_ALLLEVELFLAG);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO alllevelflag(Integer allLevelFlag) {
        this.setAllLevelFlag(allLevelFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO alllevelflag(Boolean allLevelFlag) {
        if (allLevelFlag == null) {
            this.setAllLevelFlag(null);
        } else {
            this.setAllLevelFlag(allLevelFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="bicubeleveltag")
    public void setBICubeLevelTag(String bICubeLevelTag) {
        this._set(DTOFIELD_BICUBELEVELTAG, bICubeLevelTag);
    }

    @JsonIgnore
    public String getBICubeLevelTag() {
        Object objValue = this._get(DTOFIELD_BICUBELEVELTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeLevelTagDirty() {
        return this._contains(DTOFIELD_BICUBELEVELTAG);
    }

    @JsonIgnore
    public void resetBICubeLevelTag() {
        this._reset(DTOFIELD_BICUBELEVELTAG);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO bicubeleveltag(String bICubeLevelTag) {
        this.setBICubeLevelTag(bICubeLevelTag);
        return this;
    }

    @JsonProperty(value="bicubeleveltag2")
    public void setBICubeLevelTag2(String bICubeLevelTag2) {
        this._set(DTOFIELD_BICUBELEVELTAG2, bICubeLevelTag2);
    }

    @JsonIgnore
    public String getBICubeLevelTag2() {
        Object objValue = this._get(DTOFIELD_BICUBELEVELTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeLevelTag2Dirty() {
        return this._contains(DTOFIELD_BICUBELEVELTAG2);
    }

    @JsonIgnore
    public void resetBICubeLevelTag2() {
        this._reset(DTOFIELD_BICUBELEVELTAG2);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO bicubeleveltag2(String bICubeLevelTag2) {
        this.setBICubeLevelTag2(bICubeLevelTag2);
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
    public PSSysBICubeLevelDTO codename(String codeName) {
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
    public PSSysBICubeLevelDTO createdate(Timestamp createDate) {
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
    public PSSysBICubeLevelDTO createman(String createMan) {
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
    public PSSysBICubeLevelDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysBICubeLevelDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysBICubeLevelDTO psdefname(String pSDEFName) {
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
    public PSSysBICubeLevelDTO psdeid(String pSDEId) {
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
    public PSSysBICubeLevelDTO pssysbicubedimensionid(String pSSysBICubeDimensionId) {
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbicubedimensionid(PSSysBICubeDimensionDTO pSSysBICubeDimension) {
        if (pSSysBICubeDimension == null) {
            this.setPSDEId(null);
            this.setPSSysBICubeDimensionId(null);
            this.setPSSysBICubeDimensionName(null);
            this.setPSSysBIDimensionId(null);
        } else {
            this.setPSDEId(pSSysBICubeDimension.getPSDEId());
            this.setPSSysBICubeDimensionId(pSSysBICubeDimension.getPSSysBICubeDimensionId());
            this.setPSSysBICubeDimensionName(pSSysBICubeDimension.getPSSysBICubeDimensionName());
            this.setPSSysBIDimensionId(pSSysBICubeDimension.getPSSysBIDimensionId());
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
    public PSSysBICubeLevelDTO pssysbicubedimensionname(String pSSysBICubeDimensionName) {
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
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
    public PSSysBICubeLevelDTO pssysbicubelevelid(String pSSysBICubeLevelId) {
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
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
    public PSSysBICubeLevelDTO pssysbicubelevelname(String pSSysBICubeLevelName) {
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBICubeLevelName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBICubeLevelName(strName);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO name(String strName) {
        this.setPSSysBICubeLevelName(strName);
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
    public PSSysBICubeLevelDTO pssysbidimensionid(String pSSysBIDimensionId) {
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    @JsonProperty(value="pssysbihierarchyid")
    public void setPSSysBIHierarchyId(String pSSysBIHierarchyId) {
        this._set(DTOFIELD_PSSYSBIHIERARCHYID, pSSysBIHierarchyId);
    }

    @JsonIgnore
    public String getPSSysBIHierarchyId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIHIERARCHYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIHierarchyIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIHIERARCHYID);
    }

    @JsonIgnore
    public void resetPSSysBIHierarchyId() {
        this._reset(DTOFIELD_PSSYSBIHIERARCHYID);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbihierarchyid(String pSSysBIHierarchyId) {
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbihierarchyid(PSSysBIHierarchyDTO pSSysBIHierarchy) {
        if (pSSysBIHierarchy == null) {
            this.setPSSysBIHierarchyId(null);
            this.setPSSysBIHierarchyName(null);
        } else {
            this.setPSSysBIHierarchyId(pSSysBIHierarchy.getPSSysBIHierarchyId());
            this.setPSSysBIHierarchyName(pSSysBIHierarchy.getPSSysBIHierarchyName());
        }
        return this;
    }

    @JsonProperty(value="pssysbihierarchyname")
    public void setPSSysBIHierarchyName(String pSSysBIHierarchyName) {
        this._set(DTOFIELD_PSSYSBIHIERARCHYNAME, pSSysBIHierarchyName);
    }

    @JsonIgnore
    public String getPSSysBIHierarchyName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIHIERARCHYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIHierarchyNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIHIERARCHYNAME);
    }

    @JsonIgnore
    public void resetPSSysBIHierarchyName() {
        this._reset(DTOFIELD_PSSYSBIHIERARCHYNAME);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbihierarchyname(String pSSysBIHierarchyName) {
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    @JsonProperty(value="pssysbilevelid")
    public void setPSSysBILevelId(String pSSysBILevelId) {
        this._set(DTOFIELD_PSSYSBILEVELID, pSSysBILevelId);
    }

    @JsonIgnore
    public String getPSSysBILevelId() {
        Object objValue = this._get(DTOFIELD_PSSYSBILEVELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBILevelIdDirty() {
        return this._contains(DTOFIELD_PSSYSBILEVELID);
    }

    @JsonIgnore
    public void resetPSSysBILevelId() {
        this._reset(DTOFIELD_PSSYSBILEVELID);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbilevelid(String pSSysBILevelId) {
        this.setPSSysBILevelId(pSSysBILevelId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbilevelid(PSSysBILevelDTO pSSysBILevel) {
        if (pSSysBILevel == null) {
            this.setPSSysBILevelId(null);
            this.setPSSysBILevelName(null);
        } else {
            this.setPSSysBILevelId(pSSysBILevel.getPSSysBILevelId());
            this.setPSSysBILevelName(pSSysBILevel.getPSSysBILevelName());
        }
        return this;
    }

    @JsonProperty(value="pssysbilevelname")
    public void setPSSysBILevelName(String pSSysBILevelName) {
        this._set(DTOFIELD_PSSYSBILEVELNAME, pSSysBILevelName);
    }

    @JsonIgnore
    public String getPSSysBILevelName() {
        Object objValue = this._get(DTOFIELD_PSSYSBILEVELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBILevelNameDirty() {
        return this._contains(DTOFIELD_PSSYSBILEVELNAME);
    }

    @JsonIgnore
    public void resetPSSysBILevelName() {
        this._reset(DTOFIELD_PSSYSBILEVELNAME);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO pssysbilevelname(String pSSysBILevelName) {
        this.setPSSysBILevelName(pSSysBILevelName);
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
    public PSSysBICubeLevelDTO updatedate(Timestamp updateDate) {
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
    public PSSysBICubeLevelDTO updateman(String updateMan) {
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
    public PSSysBICubeLevelDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBICubeLevelDTO usertag(String userTag) {
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
    public PSSysBICubeLevelDTO usertag2(String userTag2) {
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
    public PSSysBICubeLevelDTO usertag3(String userTag3) {
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
    public PSSysBICubeLevelDTO usertag4(String userTag4) {
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
    public PSSysBICubeLevelDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBICubeLevelId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBICubeLevelId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeLevelDTO id(String strValue) {
        this.setPSSysBICubeLevelId(strValue);
        return this;
    }
}
