package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDPartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDSchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBDTableDTO
extends PSModelDTOBase {
    public static final String FIELD_BDTABLETYPE = "BDTABLETYPE";
    protected static final String DTOFIELD_BDTABLETYPE = "bdtabletype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELVER = "MODELVER";
    protected static final String DTOFIELD_MODELVER = "modelver";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBDMODULEID = "PSSYSBDMODULEID";
    protected static final String DTOFIELD_PSSYSBDMODULEID = "pssysbdmoduleid";
    public static final String FIELD_PSSYSBDMODULENAME = "PSSYSBDMODULENAME";
    protected static final String DTOFIELD_PSSYSBDMODULENAME = "pssysbdmodulename";
    public static final String FIELD_PSSYSBDPARTID = "PSSYSBDPARTID";
    protected static final String DTOFIELD_PSSYSBDPARTID = "pssysbdpartid";
    public static final String FIELD_PSSYSBDPARTNAME = "PSSYSBDPARTNAME";
    protected static final String DTOFIELD_PSSYSBDPARTNAME = "pssysbdpartname";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDSCHEMENAME = "PSSYSBDSCHEMENAME";
    protected static final String DTOFIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
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

    @JsonProperty(value="bdtabletype")
    public void setBDTableType(Integer bDTableType) {
        this._set(DTOFIELD_BDTABLETYPE, bDTableType);
    }

    @JsonIgnore
    public Integer getBDTableType() {
        Object objValue = this._get(DTOFIELD_BDTABLETYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBDTableTypeDirty() {
        return this._contains(DTOFIELD_BDTABLETYPE);
    }

    @JsonIgnore
    public void resetBDTableType() {
        this._reset(DTOFIELD_BDTABLETYPE);
    }

    @JsonIgnore
    public PSSysBDTableDTO bdtabletype(Integer bDTableType) {
        this.setBDTableType(bDTableType);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO bdtabletype(PSModelEnums.BDTableType bDTableType) {
        if (bDTableType == null) {
            this.setBDTableType(null);
        } else {
            this.setBDTableType(bDTableType.value);
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
    public PSSysBDTableDTO codename(String codeName) {
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
    public PSSysBDTableDTO createdate(Timestamp createDate) {
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
    public PSSysBDTableDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSSysBDTableDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSSysBDTableDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelver")
    public void setModelVer(Integer modelVer) {
        this._set(DTOFIELD_MODELVER, modelVer);
    }

    @JsonIgnore
    public Integer getModelVer() {
        Object objValue = this._get(DTOFIELD_MODELVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelVerDirty() {
        return this._contains(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public void resetModelVer() {
        this._reset(DTOFIELD_MODELVER);
    }

    @JsonIgnore
    public PSSysBDTableDTO modelver(Integer modelVer) {
        this.setModelVer(modelVer);
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
    public PSSysBDTableDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysBDTableDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysbdmoduleid")
    public void setPSSysBDModuleId(String pSSysBDModuleId) {
        this._set(DTOFIELD_PSSYSBDMODULEID, pSSysBDModuleId);
    }

    @JsonIgnore
    public String getPSSysBDModuleId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDModuleIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDMODULEID);
    }

    @JsonIgnore
    public void resetPSSysBDModuleId() {
        this._reset(DTOFIELD_PSSYSBDMODULEID);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdmoduleid(String pSSysBDModuleId) {
        this.setPSSysBDModuleId(pSSysBDModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdmoduleid(PSSysBDModuleDTO pSSysBDModule) {
        if (pSSysBDModule == null) {
            this.setPSSysBDModuleId(null);
            this.setPSSysBDModuleName(null);
        } else {
            this.setPSSysBDModuleId(pSSysBDModule.getPSSysBDModuleId());
            this.setPSSysBDModuleName(pSSysBDModule.getPSSysBDModuleName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdmodulename")
    public void setPSSysBDModuleName(String pSSysBDModuleName) {
        this._set(DTOFIELD_PSSYSBDMODULENAME, pSSysBDModuleName);
    }

    @JsonIgnore
    public String getPSSysBDModuleName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDModuleNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDMODULENAME);
    }

    @JsonIgnore
    public void resetPSSysBDModuleName() {
        this._reset(DTOFIELD_PSSYSBDMODULENAME);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdmodulename(String pSSysBDModuleName) {
        this.setPSSysBDModuleName(pSSysBDModuleName);
        return this;
    }

    @JsonProperty(value="pssysbdpartid")
    public void setPSSysBDPartId(String pSSysBDPartId) {
        this._set(DTOFIELD_PSSYSBDPARTID, pSSysBDPartId);
    }

    @JsonIgnore
    public String getPSSysBDPartId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDPARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDPartIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDPARTID);
    }

    @JsonIgnore
    public void resetPSSysBDPartId() {
        this._reset(DTOFIELD_PSSYSBDPARTID);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdpartid(String pSSysBDPartId) {
        this.setPSSysBDPartId(pSSysBDPartId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdpartid(PSSysBDPartDTO pSSysBDPart) {
        if (pSSysBDPart == null) {
            this.setPSSysBDPartId(null);
            this.setPSSysBDPartName(null);
        } else {
            this.setPSSysBDPartId(pSSysBDPart.getPSSysBDPartId());
            this.setPSSysBDPartName(pSSysBDPart.getPSSysBDPartName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdpartname")
    public void setPSSysBDPartName(String pSSysBDPartName) {
        this._set(DTOFIELD_PSSYSBDPARTNAME, pSSysBDPartName);
    }

    @JsonIgnore
    public String getPSSysBDPartName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDPARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDPartNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDPARTNAME);
    }

    @JsonIgnore
    public void resetPSSysBDPartName() {
        this._reset(DTOFIELD_PSSYSBDPARTNAME);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdpartname(String pSSysBDPartName) {
        this.setPSSysBDPartName(pSSysBDPartName);
        return this;
    }

    @JsonProperty(value="pssysbdschemeid")
    public void setPSSysBDSchemeId(String pSSysBDSchemeId) {
        this._set(DTOFIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }

    @JsonIgnore
    public String getPSSysBDSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeId() {
        this._reset(DTOFIELD_PSSYSBDSCHEMEID);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme) {
        if (pSSysBDScheme == null) {
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        } else {
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbdschemename")
    public void setPSSysBDSchemeName(String pSSysBDSchemeName) {
        this._set(DTOFIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }

    @JsonIgnore
    public String getPSSysBDSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBDSchemeName() {
        this._reset(DTOFIELD_PSSYSBDSCHEMENAME);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdschemename(String pSSysBDSchemeName) {
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    @JsonProperty(value="pssysbdtableid")
    public void setPSSysBDTableId(String pSSysBDTableId) {
        this._set(DTOFIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }

    @JsonIgnore
    public String getPSSysBDTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLEID);
    }

    @JsonIgnore
    public void resetPSSysBDTableId() {
        this._reset(DTOFIELD_PSSYSBDTABLEID);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonProperty(value="pssysbdtablename")
    public void setPSSysBDTableName(String pSSysBDTableName) {
        this._set(DTOFIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }

    @JsonIgnore
    public String getPSSysBDTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSBDTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBDTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSBDTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysBDTableName() {
        this._reset(DTOFIELD_PSSYSBDTABLENAME);
    }

    @JsonIgnore
    public PSSysBDTableDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBDTableName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBDTableName(strName);
    }

    @JsonIgnore
    public PSSysBDTableDTO name(String strName) {
        this.setPSSysBDTableName(strName);
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
    public PSSysBDTableDTO updatedate(Timestamp updateDate) {
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
    public PSSysBDTableDTO updateman(String updateMan) {
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
    public PSSysBDTableDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBDTableDTO usertag(String userTag) {
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
    public PSSysBDTableDTO usertag2(String userTag2) {
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
    public PSSysBDTableDTO usertag3(String userTag3) {
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
    public PSSysBDTableDTO usertag4(String userTag4) {
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
    public PSSysBDTableDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBDTableDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBDTableId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBDTableId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableDTO id(String strValue) {
        this.setPSSysBDTableId(strValue);
        return this;
    }
}
