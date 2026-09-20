package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFInputTipSetDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTENTPSDEFID = "CONTENTPSDEFID";
    protected static final String DTOFIELD_CONTENTPSDEFID = "contentpsdefid";
    public static final String FIELD_CONTENTPSDEFNAME = "CONTENTPSDEFNAME";
    protected static final String DTOFIELD_CONTENTPSDEFNAME = "contentpsdefname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ECPSDEFID = "ECPSDEFID";
    protected static final String DTOFIELD_ECPSDEFID = "ecpsdefid";
    public static final String FIELD_ECPSDEFNAME = "ECPSDEFNAME";
    protected static final String DTOFIELD_ECPSDEFNAME = "ecpsdefname";
    public static final String FIELD_LINKPSDEFID = "LINKPSDEFID";
    protected static final String DTOFIELD_LINKPSDEFID = "linkpsdefid";
    public static final String FIELD_LINKPSDEFNAME = "LINKPSDEFNAME";
    protected static final String DTOFIELD_LINKPSDEFNAME = "linkpsdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEFINPUTTIPSETID = "PSDEFINPUTTIPSETID";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";
    public static final String FIELD_PSDEFINPUTTIPSETNAME = "PSDEFINPUTTIPSETNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_UNIQUETAGPSDEFID = "UNIQUETAGPSDEFID";
    protected static final String DTOFIELD_UNIQUETAGPSDEFID = "uniquetagpsdefid";
    public static final String FIELD_UNIQUETAGPSDEFNAME = "UNIQUETAGPSDEFNAME";
    protected static final String DTOFIELD_UNIQUETAGPSDEFNAME = "uniquetagpsdefname";
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
    public PSDEFInputTipSetDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="contentpsdefid")
    public void setContentPSDEFId(String contentPSDEFId) {
        this._set(DTOFIELD_CONTENTPSDEFID, contentPSDEFId);
    }

    @JsonIgnore
    public String getContentPSDEFId() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFIdDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public void resetContentPSDEFId() {
        this._reset(DTOFIELD_CONTENTPSDEFID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO contentpsdefid(String contentPSDEFId) {
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO contentpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        } else {
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="contentpsdefname")
    public void setContentPSDEFName(String contentPSDEFName) {
        this._set(DTOFIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }

    @JsonIgnore
    public String getContentPSDEFName() {
        Object objValue = this._get(DTOFIELD_CONTENTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentPSDEFNameDirty() {
        return this._contains(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public void resetContentPSDEFName() {
        this._reset(DTOFIELD_CONTENTPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO contentpsdefname(String contentPSDEFName) {
        this.setContentPSDEFName(contentPSDEFName);
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
    public PSDEFInputTipSetDTO createdate(Timestamp createDate) {
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
    public PSDEFInputTipSetDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ecpsdefid")
    public void setECPSDEFId(String eCPSDEFId) {
        this._set(DTOFIELD_ECPSDEFID, eCPSDEFId);
    }

    @JsonIgnore
    public String getECPSDEFId() {
        Object objValue = this._get(DTOFIELD_ECPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isECPSDEFIdDirty() {
        return this._contains(DTOFIELD_ECPSDEFID);
    }

    @JsonIgnore
    public void resetECPSDEFId() {
        this._reset(DTOFIELD_ECPSDEFID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefid(String eCPSDEFId) {
        this.setECPSDEFId(eCPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setECPSDEFId(null);
            this.setECPSDEFName(null);
        } else {
            this.setECPSDEFId(pSDEField.getPSDEFieldId());
            this.setECPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="ecpsdefname")
    public void setECPSDEFName(String eCPSDEFName) {
        this._set(DTOFIELD_ECPSDEFNAME, eCPSDEFName);
    }

    @JsonIgnore
    public String getECPSDEFName() {
        Object objValue = this._get(DTOFIELD_ECPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isECPSDEFNameDirty() {
        return this._contains(DTOFIELD_ECPSDEFNAME);
    }

    @JsonIgnore
    public void resetECPSDEFName() {
        this._reset(DTOFIELD_ECPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefname(String eCPSDEFName) {
        this.setECPSDEFName(eCPSDEFName);
        return this;
    }

    @JsonProperty(value="linkpsdefid")
    public void setLinkPSDEFId(String linkPSDEFId) {
        this._set(DTOFIELD_LINKPSDEFID, linkPSDEFId);
    }

    @JsonIgnore
    public String getLinkPSDEFId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEFIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEFID);
    }

    @JsonIgnore
    public void resetLinkPSDEFId() {
        this._reset(DTOFIELD_LINKPSDEFID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefid(String linkPSDEFId) {
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLinkPSDEFId(null);
            this.setLinkPSDEFName(null);
        } else {
            this.setLinkPSDEFId(pSDEField.getPSDEFieldId());
            this.setLinkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdefname")
    public void setLinkPSDEFName(String linkPSDEFName) {
        this._set(DTOFIELD_LINKPSDEFNAME, linkPSDEFName);
    }

    @JsonIgnore
    public String getLinkPSDEFName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEFNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEFNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEFName() {
        this._reset(DTOFIELD_LINKPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefname(String linkPSDEFName) {
        this.setLinkPSDEFName(linkPSDEFName);
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
    public PSDEFInputTipSetDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEFInputTipSetDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEFInputTipSetDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonProperty(value="psdefinputtipsetid")
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetId() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetId() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO psdefinputtipsetid(String pSDEFInputTipSetId) {
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    @JsonProperty(value="psdefinputtipsetname")
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName) {
        this._set(DTOFIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }

    @JsonIgnore
    public String getPSDEFInputTipSetName() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPSETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public void resetPSDEFInputTipSetName() {
        this._reset(DTOFIELD_PSDEFINPUTTIPSETNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO psdefinputtipsetname(String pSDEFInputTipSetName) {
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFInputTipSetName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFInputTipSetName(strName);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO name(String strName) {
        this.setPSDEFInputTipSetName(strName);
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
    public PSDEFInputTipSetDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFInputTipSetDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEFInputTipSetDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSDEFInputTipSetDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="uniquetagpsdefid")
    public void setUniqueTagPSDEFId(String uniqueTagPSDEFId) {
        this._set(DTOFIELD_UNIQUETAGPSDEFID, uniqueTagPSDEFId);
    }

    @JsonIgnore
    public String getUniqueTagPSDEFId() {
        Object objValue = this._get(DTOFIELD_UNIQUETAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagPSDEFIdDirty() {
        return this._contains(DTOFIELD_UNIQUETAGPSDEFID);
    }

    @JsonIgnore
    public void resetUniqueTagPSDEFId() {
        this._reset(DTOFIELD_UNIQUETAGPSDEFID);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefid(String uniqueTagPSDEFId) {
        this.setUniqueTagPSDEFId(uniqueTagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setUniqueTagPSDEFId(null);
            this.setUniqueTagPSDEFName(null);
        } else {
            this.setUniqueTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setUniqueTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="uniquetagpsdefname")
    public void setUniqueTagPSDEFName(String uniqueTagPSDEFName) {
        this._set(DTOFIELD_UNIQUETAGPSDEFNAME, uniqueTagPSDEFName);
    }

    @JsonIgnore
    public String getUniqueTagPSDEFName() {
        Object objValue = this._get(DTOFIELD_UNIQUETAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagPSDEFNameDirty() {
        return this._contains(DTOFIELD_UNIQUETAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetUniqueTagPSDEFName() {
        this._reset(DTOFIELD_UNIQUETAGPSDEFNAME);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefname(String uniqueTagPSDEFName) {
        this.setUniqueTagPSDEFName(uniqueTagPSDEFName);
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
    public PSDEFInputTipSetDTO updatedate(Timestamp updateDate) {
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
    public PSDEFInputTipSetDTO updateman(String updateMan) {
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
    public PSDEFInputTipSetDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFInputTipSetDTO usertag(String userTag) {
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
    public PSDEFInputTipSetDTO usertag2(String userTag2) {
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
    public PSDEFInputTipSetDTO usertag3(String userTag3) {
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
    public PSDEFInputTipSetDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFInputTipSetId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFInputTipSetId(strValue);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO id(String strValue) {
        this.setPSDEFInputTipSetId(strValue);
        return this;
    }
}
