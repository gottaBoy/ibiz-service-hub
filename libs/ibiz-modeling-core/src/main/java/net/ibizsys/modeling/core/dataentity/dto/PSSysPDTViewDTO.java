package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysPDTViewDTO
extends PSModelDTOBase {
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FROMDEVIEWFLAG = "FROMDEVIEWFLAG";
    protected static final String DTOFIELD_FROMDEVIEWFLAG = "fromdeviewflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBPSDEVIEWID = "MOBPSDEVIEWID";
    protected static final String DTOFIELD_MOBPSDEVIEWID = "mobpsdeviewid";
    public static final String FIELD_MOBPSDEVIEWNAME = "MOBPSDEVIEWNAME";
    protected static final String DTOFIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";
    public static final String FIELD_MOBVIEWCODENAME = "MOBVIEWCODENAME";
    protected static final String DTOFIELD_MOBVIEWCODENAME = "mobviewcodename";
    public static final String FIELD_MOBVIEWPSDEID = "MOBVIEWPSDEID";
    protected static final String DTOFIELD_MOBVIEWPSDEID = "mobviewpsdeid";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSPDTVIEWID = "PSPDTVIEWID";
    protected static final String DTOFIELD_PSPDTVIEWID = "pspdtviewid";
    public static final String FIELD_PSPDTVIEWNAME = "PSPDTVIEWNAME";
    protected static final String DTOFIELD_PSPDTVIEWNAME = "pspdtviewname";
    public static final String FIELD_PSSYSPDTVIEWID = "PSSYSPDTVIEWID";
    protected static final String DTOFIELD_PSSYSPDTVIEWID = "pssyspdtviewid";
    public static final String FIELD_PSSYSPDTVIEWNAME = "PSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";
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
    public static final String FIELD_VIEWCODENAME = "VIEWCODENAME";
    protected static final String DTOFIELD_VIEWCODENAME = "viewcodename";
    public static final String FIELD_VIEWPSDEID = "VIEWPSDEID";
    protected static final String DTOFIELD_VIEWPSDEID = "viewpsdeid";

    @JsonProperty(value="cappslanresid")
    public void setCapPSLanResId(String capPSLanResId) {
        this._set(DTOFIELD_CAPPSLANRESID, capPSLanResId);
    }

    @JsonIgnore
    public String getCapPSLanResId() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResIdDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public void resetCapPSLanResId() {
        this._reset(DTOFIELD_CAPPSLANRESID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        } else {
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="cappslanresname")
    public void setCapPSLanResName(String capPSLanResName) {
        this._set(DTOFIELD_CAPPSLANRESNAME, capPSLanResName);
    }

    @JsonIgnore
    public String getCapPSLanResName() {
        Object objValue = this._get(DTOFIELD_CAPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCapPSLanResNameDirty() {
        return this._contains(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetCapPSLanResName() {
        this._reset(DTOFIELD_CAPPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
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
    public PSSysPDTViewDTO codename(String codeName) {
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
    public PSSysPDTViewDTO createdate(Timestamp createDate) {
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
    public PSSysPDTViewDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="fromdeviewflag")
    public void setFromDEViewFlag(Integer fromDEViewFlag) {
        this._set(DTOFIELD_FROMDEVIEWFLAG, fromDEViewFlag);
    }

    @JsonIgnore
    public Integer getFromDEViewFlag() {
        Object objValue = this._get(DTOFIELD_FROMDEVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFromDEViewFlagDirty() {
        return this._contains(DTOFIELD_FROMDEVIEWFLAG);
    }

    @JsonIgnore
    public void resetFromDEViewFlag() {
        this._reset(DTOFIELD_FROMDEVIEWFLAG);
    }

    @JsonIgnore
    public PSSysPDTViewDTO fromdeviewflag(Integer fromDEViewFlag) {
        this.setFromDEViewFlag(fromDEViewFlag);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO fromdeviewflag(Boolean fromDEViewFlag) {
        if (fromDEViewFlag == null) {
            this.setFromDEViewFlag(null);
        } else {
            this.setFromDEViewFlag(fromDEViewFlag != false ? 1 : 0);
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
    public PSSysPDTViewDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobpsdeviewid")
    public void setMobPSDEViewId(String mobPSDEViewId) {
        this._set(DTOFIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }

    @JsonIgnore
    public String getMobPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMobPSDEViewId() {
        this._reset(DTOFIELD_MOBPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO mobpsdeviewid(String mobPSDEViewId) {
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO mobpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
            this.setMobViewCodeName(null);
            this.setMobViewPSDEId(null);
        } else {
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
            this.setMobViewCodeName((String)pSDEViewBase.get("codename"));
            this.setMobViewPSDEId((String)pSDEViewBase.get("psdeid"));
        }
        return this;
    }

    @JsonProperty(value="mobpsdeviewname")
    public void setMobPSDEViewName(String mobPSDEViewName) {
        this._set(DTOFIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }

    @JsonIgnore
    public String getMobPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MOBPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMobPSDEViewName() {
        this._reset(DTOFIELD_MOBPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO mobpsdeviewname(String mobPSDEViewName) {
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    @JsonProperty(value="mobviewcodename")
    public void setMobViewCodeName(String mobViewCodeName) {
        this._set(DTOFIELD_MOBVIEWCODENAME, mobViewCodeName);
    }

    @JsonIgnore
    public String getMobViewCodeName() {
        Object objValue = this._get(DTOFIELD_MOBVIEWCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobViewCodeNameDirty() {
        return this._contains(DTOFIELD_MOBVIEWCODENAME);
    }

    @JsonIgnore
    public void resetMobViewCodeName() {
        this._reset(DTOFIELD_MOBVIEWCODENAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO mobviewcodename(String mobViewCodeName) {
        this.setMobViewCodeName(mobViewCodeName);
        return this;
    }

    @JsonProperty(value="mobviewpsdeid")
    public void setMobViewPSDEId(String mobViewPSDEId) {
        this._set(DTOFIELD_MOBVIEWPSDEID, mobViewPSDEId);
    }

    @JsonIgnore
    public String getMobViewPSDEId() {
        Object objValue = this._get(DTOFIELD_MOBVIEWPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMobViewPSDEIdDirty() {
        return this._contains(DTOFIELD_MOBVIEWPSDEID);
    }

    @JsonIgnore
    public void resetMobViewPSDEId() {
        this._reset(DTOFIELD_MOBVIEWPSDEID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO mobviewpsdeid(String mobViewPSDEId) {
        this.setMobViewPSDEId(mobViewPSDEId);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setViewCodeName(null);
            this.setViewPSDEId(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setViewCodeName((String)pSDEViewBase.get("codename"));
            this.setViewPSDEId((String)pSDEViewBase.get("psdeid"));
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
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
    public PSSysPDTViewDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysPDTViewDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pspdtviewid")
    public void setPSPDTViewId(String pSPDTViewId) {
        this._set(DTOFIELD_PSPDTVIEWID, pSPDTViewId);
    }

    @JsonIgnore
    public String getPSPDTViewId() {
        Object objValue = this._get(DTOFIELD_PSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPDTViewIdDirty() {
        return this._contains(DTOFIELD_PSPDTVIEWID);
    }

    @JsonIgnore
    public void resetPSPDTViewId() {
        this._reset(DTOFIELD_PSPDTVIEWID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO pspdtviewid(String pSPDTViewId) {
        this.setPSPDTViewId(pSPDTViewId);
        return this;
    }

    @JsonProperty(value="pspdtviewname")
    public void setPSPDTViewName(String pSPDTViewName) {
        this._set(DTOFIELD_PSPDTVIEWNAME, pSPDTViewName);
    }

    @JsonIgnore
    public String getPSPDTViewName() {
        Object objValue = this._get(DTOFIELD_PSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPDTViewNameDirty() {
        return this._contains(DTOFIELD_PSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetPSPDTViewName() {
        this._reset(DTOFIELD_PSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO pspdtviewname(String pSPDTViewName) {
        this.setPSPDTViewName(pSPDTViewName);
        return this;
    }

    @JsonProperty(value="pssyspdtviewid")
    public void setPSSysPDTViewId(String pSSysPDTViewId) {
        this._set(DTOFIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }

    @JsonIgnore
    public String getPSSysPDTViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public void resetPSSysPDTViewId() {
        this._reset(DTOFIELD_PSSYSPDTVIEWID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO pssyspdtviewid(String pSSysPDTViewId) {
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    @JsonProperty(value="pssyspdtviewname")
    public void setPSSysPDTViewName(String pSSysPDTViewName) {
        this._set(DTOFIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }

    @JsonIgnore
    public String getPSSysPDTViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysPDTViewName() {
        this._reset(DTOFIELD_PSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO pssyspdtviewname(String pSSysPDTViewName) {
        this.setPSSysPDTViewName(pSSysPDTViewName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysPDTViewName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysPDTViewName(strName);
    }

    @JsonIgnore
    public PSSysPDTViewDTO name(String strName) {
        this.setPSSysPDTViewName(strName);
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
    public PSSysPDTViewDTO updatedate(Timestamp updateDate) {
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
    public PSSysPDTViewDTO updateman(String updateMan) {
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
    public PSSysPDTViewDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysPDTViewDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysPDTViewDTO usertag(String userTag) {
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
    public PSSysPDTViewDTO usertag2(String userTag2) {
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
    public PSSysPDTViewDTO usertag3(String userTag3) {
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
    public PSSysPDTViewDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewcodename")
    public void setViewCodeName(String viewCodeName) {
        this._set(DTOFIELD_VIEWCODENAME, viewCodeName);
    }

    @JsonIgnore
    public String getViewCodeName() {
        Object objValue = this._get(DTOFIELD_VIEWCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewCodeNameDirty() {
        return this._contains(DTOFIELD_VIEWCODENAME);
    }

    @JsonIgnore
    public void resetViewCodeName() {
        this._reset(DTOFIELD_VIEWCODENAME);
    }

    @JsonIgnore
    public PSSysPDTViewDTO viewcodename(String viewCodeName) {
        this.setViewCodeName(viewCodeName);
        return this;
    }

    @JsonProperty(value="viewpsdeid")
    public void setViewPSDEId(String viewPSDEId) {
        this._set(DTOFIELD_VIEWPSDEID, viewPSDEId);
    }

    @JsonIgnore
    public String getViewPSDEId() {
        Object objValue = this._get(DTOFIELD_VIEWPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewPSDEIdDirty() {
        return this._contains(DTOFIELD_VIEWPSDEID);
    }

    @JsonIgnore
    public void resetViewPSDEId() {
        this._reset(DTOFIELD_VIEWPSDEID);
    }

    @JsonIgnore
    public PSSysPDTViewDTO viewpsdeid(String viewPSDEId) {
        this.setViewPSDEId(viewPSDEId);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysPDTViewId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysPDTViewId(strValue);
    }

    @JsonIgnore
    public PSSysPDTViewDTO id(String strValue) {
        this.setPSSysPDTViewId(strValue);
        return this;
    }
}