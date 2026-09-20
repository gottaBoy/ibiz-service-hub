package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysERMapNodeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysERMapDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLENTITYFLAG = "ALLENTITYFLAG";
    protected static final String DTOFIELD_ALLENTITYFLAG = "allentityflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFVIEWMODE = "DEFVIEWMODE";
    protected static final String DTOFIELD_DEFVIEWMODE = "defviewmode";
    public static final String FIELD_INCSUBSYSFLAG = "INCSUBSYSFLAG";
    protected static final String DTOFIELD_INCSUBSYSFLAG = "incsubsysflag";
    public static final String FIELD_MAPTAG = "MAPTAG";
    protected static final String DTOFIELD_MAPTAG = "maptag";
    public static final String FIELD_MAPTAG2 = "MAPTAG2";
    protected static final String DTOFIELD_MAPTAG2 = "maptag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSERMAPID = "PSSYSERMAPID";
    protected static final String DTOFIELD_PSSYSERMAPID = "pssysermapid";
    public static final String FIELD_PSSYSERMAPNAME = "PSSYSERMAPNAME";
    protected static final String DTOFIELD_PSSYSERMAPNAME = "pssysermapname";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
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
    public static final String DTOFIELD_PSSYSERMAPNODES = "pssysermapnodes";

    @JsonProperty(value="allentityflag")
    public void setAllEntityFlag(Integer allEntityFlag) {
        this._set(DTOFIELD_ALLENTITYFLAG, allEntityFlag);
    }

    @JsonIgnore
    public Integer getAllEntityFlag() {
        Object objValue = this._get(DTOFIELD_ALLENTITYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllEntityFlagDirty() {
        return this._contains(DTOFIELD_ALLENTITYFLAG);
    }

    @JsonIgnore
    public void resetAllEntityFlag() {
        this._reset(DTOFIELD_ALLENTITYFLAG);
    }

    @JsonIgnore
    public PSSysERMapDTO allentityflag(Integer allEntityFlag) {
        this.setAllEntityFlag(allEntityFlag);
        return this;
    }

    @JsonIgnore
    public PSSysERMapDTO allentityflag(Boolean allEntityFlag) {
        if (allEntityFlag == null) {
            this.setAllEntityFlag(null);
        } else {
            this.setAllEntityFlag(allEntityFlag != false ? 1 : 0);
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
    public PSSysERMapDTO codename(String codeName) {
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
    public PSSysERMapDTO createdate(Timestamp createDate) {
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
    public PSSysERMapDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defviewmode")
    public void setDefViewMode(String defViewMode) {
        this._set(DTOFIELD_DEFVIEWMODE, defViewMode);
    }

    @JsonIgnore
    public String getDefViewMode() {
        Object objValue = this._get(DTOFIELD_DEFVIEWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefViewModeDirty() {
        return this._contains(DTOFIELD_DEFVIEWMODE);
    }

    @JsonIgnore
    public void resetDefViewMode() {
        this._reset(DTOFIELD_DEFVIEWMODE);
    }

    @JsonIgnore
    public PSSysERMapDTO defviewmode(String defViewMode) {
        this.setDefViewMode(defViewMode);
        return this;
    }

    @JsonIgnore
    public PSSysERMapDTO defviewmode(PSModelEnums.ERMapViewMode defViewMode) {
        if (defViewMode == null) {
            this.setDefViewMode(null);
        } else {
            this.setDefViewMode(defViewMode.value);
        }
        return this;
    }

    @JsonProperty(value="incsubsysflag")
    public void setIncSubSysFlag(Integer incSubSysFlag) {
        this._set(DTOFIELD_INCSUBSYSFLAG, incSubSysFlag);
    }

    @JsonIgnore
    public Integer getIncSubSysFlag() {
        Object objValue = this._get(DTOFIELD_INCSUBSYSFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIncSubSysFlagDirty() {
        return this._contains(DTOFIELD_INCSUBSYSFLAG);
    }

    @JsonIgnore
    public void resetIncSubSysFlag() {
        this._reset(DTOFIELD_INCSUBSYSFLAG);
    }

    @JsonIgnore
    public PSSysERMapDTO incsubsysflag(Integer incSubSysFlag) {
        this.setIncSubSysFlag(incSubSysFlag);
        return this;
    }

    @JsonIgnore
    public PSSysERMapDTO incsubsysflag(Boolean incSubSysFlag) {
        if (incSubSysFlag == null) {
            this.setIncSubSysFlag(null);
        } else {
            this.setIncSubSysFlag(incSubSysFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="maptag")
    public void setMapTag(String mapTag) {
        this._set(DTOFIELD_MAPTAG, mapTag);
    }

    @JsonIgnore
    public String getMapTag() {
        Object objValue = this._get(DTOFIELD_MAPTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTagDirty() {
        return this._contains(DTOFIELD_MAPTAG);
    }

    @JsonIgnore
    public void resetMapTag() {
        this._reset(DTOFIELD_MAPTAG);
    }

    @JsonIgnore
    public PSSysERMapDTO maptag(String mapTag) {
        this.setMapTag(mapTag);
        return this;
    }

    @JsonProperty(value="maptag2")
    public void setMapTag2(String mapTag2) {
        this._set(DTOFIELD_MAPTAG2, mapTag2);
    }

    @JsonIgnore
    public String getMapTag2() {
        Object objValue = this._get(DTOFIELD_MAPTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMapTag2Dirty() {
        return this._contains(DTOFIELD_MAPTAG2);
    }

    @JsonIgnore
    public void resetMapTag2() {
        this._reset(DTOFIELD_MAPTAG2);
    }

    @JsonIgnore
    public PSSysERMapDTO maptag2(String mapTag2) {
        this.setMapTag2(mapTag2);
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
    public PSSysERMapDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSysERMapDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSysERMapDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssysappname")
    public void setPSSysAppName(String pSSysAppName) {
        this._set(DTOFIELD_PSSYSAPPNAME, pSSysAppName);
    }

    @JsonIgnore
    public String getPSSysAppName() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppNameDirty() {
        return this._contains(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public void resetPSSysAppName() {
        this._reset(DTOFIELD_PSSYSAPPNAME);
    }

    @JsonIgnore
    public PSSysERMapDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysermapid")
    public void setPSSysERMapId(String pSSysERMapId) {
        this._set(DTOFIELD_PSSYSERMAPID, pSSysERMapId);
    }

    @JsonIgnore
    public String getPSSysERMapId() {
        Object objValue = this._get(DTOFIELD_PSSYSERMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysERMapIdDirty() {
        return this._contains(DTOFIELD_PSSYSERMAPID);
    }

    @JsonIgnore
    public void resetPSSysERMapId() {
        this._reset(DTOFIELD_PSSYSERMAPID);
    }

    @JsonIgnore
    public PSSysERMapDTO pssysermapid(String pSSysERMapId) {
        this.setPSSysERMapId(pSSysERMapId);
        return this;
    }

    @JsonProperty(value="pssysermapname")
    public void setPSSysERMapName(String pSSysERMapName) {
        this._set(DTOFIELD_PSSYSERMAPNAME, pSSysERMapName);
    }

    @JsonIgnore
    public String getPSSysERMapName() {
        Object objValue = this._get(DTOFIELD_PSSYSERMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysERMapNameDirty() {
        return this._contains(DTOFIELD_PSSYSERMAPNAME);
    }

    @JsonIgnore
    public void resetPSSysERMapName() {
        this._reset(DTOFIELD_PSSYSERMAPNAME);
    }

    @JsonIgnore
    public PSSysERMapDTO pssysermapname(String pSSysERMapName) {
        this.setPSSysERMapName(pSSysERMapName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysERMapName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysERMapName(strName);
    }

    @JsonIgnore
    public PSSysERMapDTO name(String strName) {
        this.setPSSysERMapName(strName);
        return this;
    }

    @JsonProperty(value="shapeparams")
    public void setShapeParams(String shapeParams) {
        this._set(DTOFIELD_SHAPEPARAMS, shapeParams);
    }

    @JsonIgnore
    public String getShapeParams() {
        Object objValue = this._get(DTOFIELD_SHAPEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeParamsDirty() {
        return this._contains(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public void resetShapeParams() {
        this._reset(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public PSSysERMapDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
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
    public PSSysERMapDTO updatedate(Timestamp updateDate) {
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
    public PSSysERMapDTO updateman(String updateMan) {
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
    public PSSysERMapDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysERMapDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysERMapDTO usertag(String userTag) {
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
    public PSSysERMapDTO usertag2(String userTag2) {
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
    public PSSysERMapDTO usertag3(String userTag3) {
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
    public PSSysERMapDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysERMapId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysERMapId(strValue);
    }

    @JsonIgnore
    public PSSysERMapDTO id(String strValue) {
        this.setPSSysERMapId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysERMapNodeDTO> getPSSysERMapNodes() {
        Object list = this._get(DTOFIELD_PSSYSERMAPNODES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysermapnodes")
    public void setPSSysERMapNodes(List<PSSysERMapNodeDTO> pssysermapnodes) {
        this._set(DTOFIELD_PSSYSERMAPNODES, pssysermapnodes);
    }

    @JsonIgnore
    public List<PSSysERMapNodeDTO> getPSSysERMapNodesIf() {
        Object list = this._get(DTOFIELD_PSSYSERMAPNODES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSERMAPNODES, list);
        }
        return (List)list;
    }
}
