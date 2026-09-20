package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIAggColumnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBISchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBIAggTableDTO
extends PSModelDTOBase {
    public static final String FIELD_BIAGGTABLEMODE = "BIAGGTABLEMODE";
    protected static final String DTOFIELD_BIAGGTABLEMODE = "biaggtablemode";
    public static final String FIELD_BIAGGTABLEOPTION = "BIAGGTABLEOPTION";
    protected static final String DTOFIELD_BIAGGTABLEOPTION = "biaggtableoption";
    public static final String FIELD_BIAGGTABLEPARAMS = "BIAGGTABLEPARAMS";
    protected static final String DTOFIELD_BIAGGTABLEPARAMS = "biaggtableparams";
    public static final String FIELD_BIAGGTABLETAG = "BIAGGTABLETAG";
    protected static final String DTOFIELD_BIAGGTABLETAG = "biaggtabletag";
    public static final String FIELD_BIAGGTABLETAG2 = "BIAGGTABLETAG2";
    protected static final String DTOFIELD_BIAGGTABLETAG2 = "biaggtabletag2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDATAQUERYID = "PSDEDATAQUERYID";
    protected static final String DTOFIELD_PSDEDATAQUERYID = "psdedataqueryid";
    public static final String FIELD_PSDEDATAQUERYNAME = "PSDEDATAQUERYNAME";
    protected static final String DTOFIELD_PSDEDATAQUERYNAME = "psdedataqueryname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBIAGGTABLEID = "PSSYSBIAGGTABLEID";
    protected static final String DTOFIELD_PSSYSBIAGGTABLEID = "pssysbiaggtableid";
    public static final String FIELD_PSSYSBIAGGTABLENAME = "PSSYSBIAGGTABLENAME";
    protected static final String DTOFIELD_PSSYSBIAGGTABLENAME = "pssysbiaggtablename";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSBISCHEMENAME = "PSSYSBISCHEMENAME";
    protected static final String DTOFIELD_PSSYSBISCHEMENAME = "pssysbischemename";
    public static final String FIELD_REALTIMEMODE = "REALTIMEMODE";
    protected static final String DTOFIELD_REALTIMEMODE = "realtimemode";
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
    public static final String DTOFIELD_PSSYSBIAGGCOLUMNS = "pssysbiaggcolumns";

    @JsonProperty(value="biaggtablemode")
    public void setBIAggTableMode(String bIAggTableMode) {
        this._set(DTOFIELD_BIAGGTABLEMODE, bIAggTableMode);
    }

    @JsonIgnore
    public String getBIAggTableMode() {
        Object objValue = this._get(DTOFIELD_BIAGGTABLEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggTableModeDirty() {
        return this._contains(DTOFIELD_BIAGGTABLEMODE);
    }

    @JsonIgnore
    public void resetBIAggTableMode() {
        this._reset(DTOFIELD_BIAGGTABLEMODE);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO biaggtablemode(String bIAggTableMode) {
        this.setBIAggTableMode(bIAggTableMode);
        return this;
    }

    @JsonProperty(value="biaggtableoption")
    public void setBIAggTableOption(Integer bIAggTableOption) {
        this._set(DTOFIELD_BIAGGTABLEOPTION, bIAggTableOption);
    }

    @JsonIgnore
    public Integer getBIAggTableOption() {
        Object objValue = this._get(DTOFIELD_BIAGGTABLEOPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBIAggTableOptionDirty() {
        return this._contains(DTOFIELD_BIAGGTABLEOPTION);
    }

    @JsonIgnore
    public void resetBIAggTableOption() {
        this._reset(DTOFIELD_BIAGGTABLEOPTION);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO biaggtableoption(Integer bIAggTableOption) {
        this.setBIAggTableOption(bIAggTableOption);
        return this;
    }

    @JsonProperty(value="biaggtableparams")
    public void setBIAggTableParams(String bIAggTableParams) {
        this._set(DTOFIELD_BIAGGTABLEPARAMS, bIAggTableParams);
    }

    @JsonIgnore
    public String getBIAggTableParams() {
        Object objValue = this._get(DTOFIELD_BIAGGTABLEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggTableParamsDirty() {
        return this._contains(DTOFIELD_BIAGGTABLEPARAMS);
    }

    @JsonIgnore
    public void resetBIAggTableParams() {
        this._reset(DTOFIELD_BIAGGTABLEPARAMS);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO biaggtableparams(String bIAggTableParams) {
        this.setBIAggTableParams(bIAggTableParams);
        return this;
    }

    @JsonProperty(value="biaggtabletag")
    public void setBIAggTableTag(String bIAggTableTag) {
        this._set(DTOFIELD_BIAGGTABLETAG, bIAggTableTag);
    }

    @JsonIgnore
    public String getBIAggTableTag() {
        Object objValue = this._get(DTOFIELD_BIAGGTABLETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggTableTagDirty() {
        return this._contains(DTOFIELD_BIAGGTABLETAG);
    }

    @JsonIgnore
    public void resetBIAggTableTag() {
        this._reset(DTOFIELD_BIAGGTABLETAG);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO biaggtabletag(String bIAggTableTag) {
        this.setBIAggTableTag(bIAggTableTag);
        return this;
    }

    @JsonProperty(value="biaggtabletag2")
    public void setBIAggTableTag2(String bIAggTableTag2) {
        this._set(DTOFIELD_BIAGGTABLETAG2, bIAggTableTag2);
    }

    @JsonIgnore
    public String getBIAggTableTag2() {
        Object objValue = this._get(DTOFIELD_BIAGGTABLETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBIAggTableTag2Dirty() {
        return this._contains(DTOFIELD_BIAGGTABLETAG2);
    }

    @JsonIgnore
    public void resetBIAggTableTag2() {
        this._reset(DTOFIELD_BIAGGTABLETAG2);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO biaggtabletag2(String bIAggTableTag2) {
        this.setBIAggTableTag2(bIAggTableTag2);
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
    public PSSysBIAggTableDTO codename(String codeName) {
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
    public PSSysBIAggTableDTO createdate(Timestamp createDate) {
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
    public PSSysBIAggTableDTO createman(String createMan) {
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
    public PSSysBIAggTableDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdedataqueryid")
    public void setPSDEDataQueryId(String pSDEDataQueryId) {
        this._set(DTOFIELD_PSDEDATAQUERYID, pSDEDataQueryId);
    }

    @JsonIgnore
    public String getPSDEDataQueryId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAQUERYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataQueryIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAQUERYID);
    }

    @JsonIgnore
    public void resetPSDEDataQueryId() {
        this._reset(DTOFIELD_PSDEDATAQUERYID);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedataqueryid(String pSDEDataQueryId) {
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedataqueryid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDataQueryId(null);
            this.setPSDEDataQueryName(null);
        } else {
            this.setPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedataqueryname")
    public void setPSDEDataQueryName(String pSDEDataQueryName) {
        this._set(DTOFIELD_PSDEDATAQUERYNAME, pSDEDataQueryName);
    }

    @JsonIgnore
    public String getPSDEDataQueryName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAQUERYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataQueryNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public void resetPSDEDataQueryName() {
        this._reset(DTOFIELD_PSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedataqueryname(String pSDEDataQueryName) {
        this.setPSDEDataQueryName(pSDEDataQueryName);
        return this;
    }

    @JsonProperty(value="psdedatasetid")
    public void setPSDEDataSetId(String pSDEDataSetId) {
        this._set(DTOFIELD_PSDEDATASETID, pSDEDataSetId);
    }

    @JsonIgnore
    public String getPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public void resetPSDEDataSetId() {
        this._reset(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        } else {
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasetname")
    public void setPSDEDataSetName(String pSDEDataSetName) {
        this._set(DTOFIELD_PSDEDATASETNAME, pSDEDataSetName);
    }

    @JsonIgnore
    public String getPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSetName() {
        this._reset(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
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
    public PSSysBIAggTableDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysBIAggTableDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysbiaggtableid")
    public void setPSSysBIAggTableId(String pSSysBIAggTableId) {
        this._set(DTOFIELD_PSSYSBIAGGTABLEID, pSSysBIAggTableId);
    }

    @JsonIgnore
    public String getPSSysBIAggTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGTABLEID);
    }

    @JsonIgnore
    public void resetPSSysBIAggTableId() {
        this._reset(DTOFIELD_PSSYSBIAGGTABLEID);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO pssysbiaggtableid(String pSSysBIAggTableId) {
        this.setPSSysBIAggTableId(pSSysBIAggTableId);
        return this;
    }

    @JsonProperty(value="pssysbiaggtablename")
    public void setPSSysBIAggTableName(String pSSysBIAggTableName) {
        this._set(DTOFIELD_PSSYSBIAGGTABLENAME, pSSysBIAggTableName);
    }

    @JsonIgnore
    public String getPSSysBIAggTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIAGGTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIAggTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIAGGTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysBIAggTableName() {
        this._reset(DTOFIELD_PSSYSBIAGGTABLENAME);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO pssysbiaggtablename(String pSSysBIAggTableName) {
        this.setPSSysBIAggTableName(pSSysBIAggTableName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBIAggTableName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBIAggTableName(strName);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO name(String strName) {
        this.setPSSysBIAggTableName(strName);
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
    public PSSysBIAggTableDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
        if (pSSysBICube == null) {
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        } else {
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
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
    public PSSysBIAggTableDTO pssysbicubename(String pSSysBICubeName) {
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
    public PSSysBIAggTableDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme) {
        if (pSSysBIScheme == null) {
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        } else {
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbischemename")
    public void setPSSysBISchemeName(String pSSysBISchemeName) {
        this._set(DTOFIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }

    @JsonIgnore
    public String getPSSysBISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBISchemeName() {
        this._reset(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO pssysbischemename(String pSSysBISchemeName) {
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    @JsonProperty(value="realtimemode")
    public void setRealTimeMode(Integer realTimeMode) {
        this._set(DTOFIELD_REALTIMEMODE, realTimeMode);
    }

    @JsonIgnore
    public Integer getRealTimeMode() {
        Object objValue = this._get(DTOFIELD_REALTIMEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRealTimeModeDirty() {
        return this._contains(DTOFIELD_REALTIMEMODE);
    }

    @JsonIgnore
    public void resetRealTimeMode() {
        this._reset(DTOFIELD_REALTIMEMODE);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO realtimemode(Integer realTimeMode) {
        this.setRealTimeMode(realTimeMode);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO realtimemode(Boolean realTimeMode) {
        if (realTimeMode == null) {
            this.setRealTimeMode(null);
        } else {
            this.setRealTimeMode(realTimeMode != false ? 1 : 0);
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
    public PSSysBIAggTableDTO updatedate(Timestamp updateDate) {
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
    public PSSysBIAggTableDTO updateman(String updateMan) {
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
    public PSSysBIAggTableDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBIAggTableDTO usertag(String userTag) {
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
    public PSSysBIAggTableDTO usertag2(String userTag2) {
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
    public PSSysBIAggTableDTO usertag3(String userTag3) {
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
    public PSSysBIAggTableDTO usertag4(String userTag4) {
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
    public PSSysBIAggTableDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBIAggTableDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBIAggTableId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBIAggTableId(strValue);
    }

    @JsonIgnore
    public PSSysBIAggTableDTO id(String strValue) {
        this.setPSSysBIAggTableId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysBIAggColumnDTO> getPSSysBIAggColumns() {
        Object list = this._get(DTOFIELD_PSSYSBIAGGCOLUMNS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysbiaggcolumns")
    public void setPSSysBIAggColumns(List<PSSysBIAggColumnDTO> pssysbiaggcolumns) {
        this._set(DTOFIELD_PSSYSBIAGGCOLUMNS, pssysbiaggcolumns);
    }

    @JsonIgnore
    public List<PSSysBIAggColumnDTO> getPSSysBIAggColumnsIf() {
        Object list = this._get(DTOFIELD_PSSYSBIAGGCOLUMNS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSBIAGGCOLUMNS, list);
        }
        return (List)list;
    }
}
