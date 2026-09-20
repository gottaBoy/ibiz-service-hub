package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEMapDSDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DSTPSDEDATASETID = "DSTPSDEDATASETID";
    protected static final String DTOFIELD_DSTPSDEDATASETID = "dstpsdedatasetid";
    public static final String FIELD_DSTPSDEDATASETNAME = "DSTPSDEDATASETNAME";
    protected static final String DTOFIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_ENABLEDQCOND = "ENABLEDQCOND";
    protected static final String DTOFIELD_ENABLEDQCOND = "enabledqcond";
    public static final String FIELD_MAPMODE = "MAPMODE";
    protected static final String DTOFIELD_MAPMODE = "mapmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PROPERTYMAP = "PROPERTYMAP";
    protected static final String DTOFIELD_PROPERTYMAP = "propertymap";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAPDSID = "PSDEMAPDSID";
    protected static final String DTOFIELD_PSDEMAPDSID = "psdemapdsid";
    public static final String FIELD_PSDEMAPDSNAME = "PSDEMAPDSNAME";
    protected static final String DTOFIELD_PSDEMAPDSNAME = "psdemapdsname";
    public static final String FIELD_PSDEMAPID = "PSDEMAPID";
    protected static final String DTOFIELD_PSDEMAPID = "psdemapid";
    public static final String FIELD_PSDEMAPNAME = "PSDEMAPNAME";
    protected static final String DTOFIELD_PSDEMAPNAME = "psdemapname";
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
    public PSDEMapDSDTO createdate(Timestamp createDate) {
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
    public PSDEMapDSDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dstpsdedatasetid")
    public void setDstPSDEDataSetId(String dstPSDEDataSetId) {
        this._set(DTOFIELD_DSTPSDEDATASETID, dstPSDEDataSetId);
    }

    @JsonIgnore
    public String getDstPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATASETID);
    }

    @JsonIgnore
    public void resetDstPSDEDataSetId() {
        this._reset(DTOFIELD_DSTPSDEDATASETID);
    }

    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetid(String dstPSDEDataSetId) {
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setDstPSDEDataSetId(null);
            this.setDstPSDEDataSetName(null);
        } else {
            this.setDstPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setDstPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedatasetname")
    public void setDstPSDEDataSetName(String dstPSDEDataSetName) {
        this._set(DTOFIELD_DSTPSDEDATASETNAME, dstPSDEDataSetName);
    }

    @JsonIgnore
    public String getDstPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataSetName() {
        this._reset(DTOFIELD_DSTPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetname(String dstPSDEDataSetName) {
        this.setDstPSDEDataSetName(dstPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="dstpsdeid")
    public void setDstPSDEId(String dstPSDEId) {
        this._set(DTOFIELD_DSTPSDEID, dstPSDEId);
    }

    @JsonIgnore
    public String getDstPSDEId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public void resetDstPSDEId() {
        this._reset(DTOFIELD_DSTPSDEID);
    }

    @JsonIgnore
    public PSDEMapDSDTO dstpsdeid(String dstPSDEId) {
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    @JsonProperty(value="enabledqcond")
    public void setEnableDQCond(Integer enableDQCond) {
        this._set(DTOFIELD_ENABLEDQCOND, enableDQCond);
    }

    @JsonIgnore
    public Integer getEnableDQCond() {
        Object objValue = this._get(DTOFIELD_ENABLEDQCOND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDQCondDirty() {
        return this._contains(DTOFIELD_ENABLEDQCOND);
    }

    @JsonIgnore
    public void resetEnableDQCond() {
        this._reset(DTOFIELD_ENABLEDQCOND);
    }

    @JsonIgnore
    public PSDEMapDSDTO enabledqcond(Integer enableDQCond) {
        this.setEnableDQCond(enableDQCond);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO enabledqcond(Boolean enableDQCond) {
        if (enableDQCond == null) {
            this.setEnableDQCond(null);
        } else {
            this.setEnableDQCond(enableDQCond != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="mapmode")
    public void setMapMode(String mapMode) {
        this._set(DTOFIELD_MAPMODE, mapMode);
    }

    @JsonIgnore
    public String getMapMode() {
        Object objValue = this._get(DTOFIELD_MAPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapModeDirty() {
        return this._contains(DTOFIELD_MAPMODE);
    }

    @JsonIgnore
    public void resetMapMode() {
        this._reset(DTOFIELD_MAPMODE);
    }

    @JsonIgnore
    public PSDEMapDSDTO mapmode(String mapMode) {
        this.setMapMode(mapMode);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO mapmode(PSModelEnums.DEMapObjectMapMode mapMode) {
        if (mapMode == null) {
            this.setMapMode(null);
        } else {
            this.setMapMode(mapMode.value);
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
    public PSDEMapDSDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="propertymap")
    public void setPropertyMap(String propertyMap) {
        this._set(DTOFIELD_PROPERTYMAP, propertyMap);
    }

    @JsonIgnore
    public String getPropertyMap() {
        Object objValue = this._get(DTOFIELD_PROPERTYMAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPropertyMapDirty() {
        return this._contains(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public void resetPropertyMap() {
        this._reset(DTOFIELD_PROPERTYMAP);
    }

    @JsonIgnore
    public PSDEMapDSDTO propertymap(String propertyMap) {
        this.setPropertyMap(propertyMap);
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
    public PSDEMapDSDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEMapDSDTO psdedatasetname(String pSDEDataSetName) {
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
    public PSDEMapDSDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdemapdsid")
    public void setPSDEMapDSId(String pSDEMapDSId) {
        this._set(DTOFIELD_PSDEMAPDSID, pSDEMapDSId);
    }

    @JsonIgnore
    public String getPSDEMapDSId() {
        Object objValue = this._get(DTOFIELD_PSDEMAPDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapDSIdDirty() {
        return this._contains(DTOFIELD_PSDEMAPDSID);
    }

    @JsonIgnore
    public void resetPSDEMapDSId() {
        this._reset(DTOFIELD_PSDEMAPDSID);
    }

    @JsonIgnore
    public PSDEMapDSDTO psdemapdsid(String pSDEMapDSId) {
        this.setPSDEMapDSId(pSDEMapDSId);
        return this;
    }

    @JsonProperty(value="psdemapdsname")
    public void setPSDEMapDSName(String pSDEMapDSName) {
        this._set(DTOFIELD_PSDEMAPDSNAME, pSDEMapDSName);
    }

    @JsonIgnore
    public String getPSDEMapDSName() {
        Object objValue = this._get(DTOFIELD_PSDEMAPDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapDSNameDirty() {
        return this._contains(DTOFIELD_PSDEMAPDSNAME);
    }

    @JsonIgnore
    public void resetPSDEMapDSName() {
        this._reset(DTOFIELD_PSDEMAPDSNAME);
    }

    @JsonIgnore
    public PSDEMapDSDTO psdemapdsname(String pSDEMapDSName) {
        this.setPSDEMapDSName(pSDEMapDSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEMapDSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEMapDSName(strName);
    }

    @JsonIgnore
    public PSDEMapDSDTO name(String strName) {
        this.setPSDEMapDSName(strName);
        return this;
    }

    @JsonProperty(value="psdemapid")
    public void setPSDEMapId(String pSDEMapId) {
        this._set(DTOFIELD_PSDEMAPID, pSDEMapId);
    }

    @JsonIgnore
    public String getPSDEMapId() {
        Object objValue = this._get(DTOFIELD_PSDEMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapIdDirty() {
        return this._contains(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public void resetPSDEMapId() {
        this._reset(DTOFIELD_PSDEMAPID);
    }

    @JsonIgnore
    public PSDEMapDSDTO psdemapid(String pSDEMapId) {
        this.setPSDEMapId(pSDEMapId);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO psdemapid(PSDEMapDTO pSDEMap) {
        if (pSDEMap == null) {
            this.setDstPSDEId(null);
            this.setPSDEId(null);
            this.setPSDEMapId(null);
            this.setPSDEMapName(null);
        } else {
            this.setDstPSDEId(pSDEMap.getDSTPSDEId());
            this.setPSDEId(pSDEMap.getPSDEId());
            this.setPSDEMapId(pSDEMap.getPSDEMapId());
            this.setPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    @JsonProperty(value="psdemapname")
    public void setPSDEMapName(String pSDEMapName) {
        this._set(DTOFIELD_PSDEMAPNAME, pSDEMapName);
    }

    @JsonIgnore
    public String getPSDEMapName() {
        Object objValue = this._get(DTOFIELD_PSDEMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMapNameDirty() {
        return this._contains(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public void resetPSDEMapName() {
        this._reset(DTOFIELD_PSDEMAPNAME);
    }

    @JsonIgnore
    public PSDEMapDSDTO psdemapname(String pSDEMapName) {
        this.setPSDEMapName(pSDEMapName);
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
    public PSDEMapDSDTO updatedate(Timestamp updateDate) {
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
    public PSDEMapDSDTO updateman(String updateMan) {
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
    public PSDEMapDSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEMapDSDTO usertag(String userTag) {
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
    public PSDEMapDSDTO usertag2(String userTag2) {
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
    public PSDEMapDSDTO usertag3(String userTag3) {
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
    public PSDEMapDSDTO usertag4(String userTag4) {
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
    public PSDEMapDSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEMapDSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEMapDSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEMapDSId(strValue);
    }

    @JsonIgnore
    public PSDEMapDSDTO id(String strValue) {
        this.setPSDEMapDSId(strValue);
        return this;
    }
}
