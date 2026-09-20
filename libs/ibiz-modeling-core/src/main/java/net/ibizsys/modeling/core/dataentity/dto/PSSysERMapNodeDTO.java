package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysERMapDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDocDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysServiceAPIDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysERMapNodeDTO
extends PSModelDTOBase {
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DETAILMODE = "DETAILMODE";
    protected static final String DTOFIELD_DETAILMODE = "detailmode";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODCOLOR = "MODCOLOR";
    protected static final String DTOFIELD_MODCOLOR = "modcolor";
    public static final String FIELD_NODETAG = "NODETAG";
    protected static final String DTOFIELD_NODETAG = "nodetag";
    public static final String FIELD_NODETAG2 = "NODETAG2";
    protected static final String DTOFIELD_NODETAG2 = "nodetag2";
    public static final String FIELD_NODETYPE = "NODETYPE";
    protected static final String DTOFIELD_NODETYPE = "nodetype";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDESERVICEAPIID = "PSDESERVICEAPIID";
    protected static final String DTOFIELD_PSDESERVICEAPIID = "psdeserviceapiid";
    public static final String FIELD_PSDESERVICEAPINAME = "PSDESERVICEAPINAME";
    protected static final String DTOFIELD_PSDESERVICEAPINAME = "psdeserviceapiname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADENAME = "PSSUBSYSSADENAME";
    protected static final String DTOFIELD_PSSUBSYSSADENAME = "pssubsyssadename";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDSCHEMENAME = "PSSYSBDSCHEMENAME";
    protected static final String DTOFIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
    public static final String FIELD_PSSYSDBSCHEMEID = "PSSYSDBSCHEMEID";
    protected static final String DTOFIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";
    public static final String FIELD_PSSYSDBSCHEMENAME = "PSSYSDBSCHEMENAME";
    protected static final String DTOFIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";
    public static final String FIELD_PSSYSDBTABLEID = "PSSYSDBTABLEID";
    protected static final String DTOFIELD_PSSYSDBTABLEID = "pssysdbtableid";
    public static final String FIELD_PSSYSDBTABLENAME = "PSSYSDBTABLENAME";
    protected static final String DTOFIELD_PSSYSDBTABLENAME = "pssysdbtablename";
    public static final String FIELD_PSSYSERMAPID = "PSSYSERMAPID";
    protected static final String DTOFIELD_PSSYSERMAPID = "pssysermapid";
    public static final String FIELD_PSSYSERMAPNAME = "PSSYSERMAPNAME";
    protected static final String DTOFIELD_PSSYSERMAPNAME = "pssysermapname";
    public static final String FIELD_PSSYSERMAPNODEID = "PSSYSERMAPNODEID";
    protected static final String DTOFIELD_PSSYSERMAPNODEID = "pssysermapnodeid";
    public static final String FIELD_PSSYSERMAPNODENAME = "PSSYSERMAPNODENAME";
    protected static final String DTOFIELD_PSSYSERMAPNODENAME = "pssysermapnodename";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHDOCNAME = "PSSYSSEARCHDOCNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";
    public static final String FIELD_PSSYSSEARCHSCHEMEID = "PSSYSSEARCHSCHEMEID";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";
    public static final String FIELD_PSSYSSEARCHSCHEMENAME = "PSSYSSEARCHSCHEMENAME";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSERVICEAPINAME = "PSSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";
    public static final String FIELD_REFPSSYSDYNAMODELID = "REFPSSYSDYNAMODELID";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";
    public static final String FIELD_REFPSSYSDYNAMODELNAME = "REFPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
    public static final String FIELD_SHOWDEFIELDS = "SHOWDEFIELDS";
    protected static final String DTOFIELD_SHOWDEFIELDS = "showdefields";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
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

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO color(String color) {
        this.setColor(color);
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
    public PSSysERMapNodeDTO createdate(Timestamp createDate) {
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
    public PSSysERMapNodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="detailmode")
    public void setDetailMode(Integer detailMode) {
        this._set(DTOFIELD_DETAILMODE, detailMode);
    }

    @JsonIgnore
    public Integer getDetailMode() {
        Object objValue = this._get(DTOFIELD_DETAILMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDetailModeDirty() {
        return this._contains(DTOFIELD_DETAILMODE);
    }

    @JsonIgnore
    public void resetDetailMode() {
        this._reset(DTOFIELD_DETAILMODE);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO detailmode(Integer detailMode) {
        this.setDetailMode(detailMode);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO detailmode(Boolean detailMode) {
        if (detailMode == null) {
            this.setDetailMode(null);
        } else {
            this.setDetailMode(detailMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="leftpos")
    public void setLeftPos(Integer leftPos) {
        this._set(DTOFIELD_LEFTPOS, leftPos);
    }

    @JsonIgnore
    public Integer getLeftPos() {
        Object objValue = this._get(DTOFIELD_LEFTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLeftPosDirty() {
        return this._contains(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public void resetLeftPos() {
        this._reset(DTOFIELD_LEFTPOS);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO leftpos(Integer leftPos) {
        this.setLeftPos(leftPos);
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
    public PSSysERMapNodeDTO logicname(String logicName) {
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
    public PSSysERMapNodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modcolor")
    public void setModColor(String modColor) {
        this._set(DTOFIELD_MODCOLOR, modColor);
    }

    @JsonIgnore
    public String getModColor() {
        Object objValue = this._get(DTOFIELD_MODCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModColorDirty() {
        return this._contains(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public void resetModColor() {
        this._reset(DTOFIELD_MODCOLOR);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO modcolor(String modColor) {
        this.setModColor(modColor);
        return this;
    }

    @JsonProperty(value="nodetag")
    public void setNodeTag(String nodeTag) {
        this._set(DTOFIELD_NODETAG, nodeTag);
    }

    @JsonIgnore
    public String getNodeTag() {
        Object objValue = this._get(DTOFIELD_NODETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTagDirty() {
        return this._contains(DTOFIELD_NODETAG);
    }

    @JsonIgnore
    public void resetNodeTag() {
        this._reset(DTOFIELD_NODETAG);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO nodetag(String nodeTag) {
        this.setNodeTag(nodeTag);
        return this;
    }

    @JsonProperty(value="nodetag2")
    public void setNodeTag2(String nodeTag2) {
        this._set(DTOFIELD_NODETAG2, nodeTag2);
    }

    @JsonIgnore
    public String getNodeTag2() {
        Object objValue = this._get(DTOFIELD_NODETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTag2Dirty() {
        return this._contains(DTOFIELD_NODETAG2);
    }

    @JsonIgnore
    public void resetNodeTag2() {
        this._reset(DTOFIELD_NODETAG2);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO nodetag2(String nodeTag2) {
        this.setNodeTag2(nodeTag2);
        return this;
    }

    @JsonProperty(value="nodetype")
    public void setNodeType(String nodeType) {
        this._set(DTOFIELD_NODETYPE, nodeType);
    }

    @JsonIgnore
    public String getNodeType() {
        Object objValue = this._get(DTOFIELD_NODETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeTypeDirty() {
        return this._contains(DTOFIELD_NODETYPE);
    }

    @JsonIgnore
    public void resetNodeType() {
        this._reset(DTOFIELD_NODETYPE);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO nodetype(String nodeType) {
        this.setNodeType(nodeType);
        return this;
    }

    @JsonProperty(value="psappdataentityid")
    public void setPSAppDataEntityId(String pSAppDataEntityId) {
        this._set(DTOFIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        this._set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
    }

    @JsonIgnore
    public String getPSAppDataEntityId() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYID);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYID)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public void resetPSAppDataEntityId() {
        this._reset(DTOFIELD_PSAPPDATAENTITYID);
        this._reset(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psappdataentityid(String pSAppDataEntityId) {
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psappdataentityid(PSAppDataEntityDTO pSAppDataEntity) {
        if (pSAppDataEntity == null) {
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
        } else {
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId() {
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEId(String pSAppLocalDEId) {
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty() {
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId() {
        this.resetPSAppDataEntityId();
    }

    @JsonProperty(value="psappdataentityname")
    public void setPSAppDataEntityName(String pSAppDataEntityName) {
        this._set(DTOFIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        this._set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
    }

    @JsonIgnore
    public String getPSAppDataEntityName() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYNAME)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public void resetPSAppDataEntityName() {
        this._reset(DTOFIELD_PSAPPDATAENTITYNAME);
        this._reset(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psappdataentityname(String pSAppDataEntityName) {
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName() {
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEName(String pSAppLocalDEName) {
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty() {
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName() {
        this.resetPSAppDataEntityName();
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
    public PSSysERMapNodeDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setColor(null);
            this.setLogicName(null);
            this.setModColor(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setColor(pSDataEntity.getColor());
            this.setLogicName(pSDataEntity.getLogicName());
            this.setModColor(pSDataEntity.getModColor());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSModuleId(pSDataEntity.getPSModuleId());
            this.setPSModuleName(pSDataEntity.getPSModuleName());
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
    public PSSysERMapNodeDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeserviceapiid")
    public void setPSDEServiceAPIId(String pSDEServiceAPIId) {
        this._set(DTOFIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }

    @JsonIgnore
    public String getPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIId() {
        this._reset(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psdeserviceapiid(String pSDEServiceAPIId) {
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
        } else {
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="psdeserviceapiname")
    public void setPSDEServiceAPIName(String pSDEServiceAPIName) {
        this._set(DTOFIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }

    @JsonIgnore
    public String getPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIName() {
        this._reset(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO psdeserviceapiname(String pSDEServiceAPIName) {
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
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
    public PSSysERMapNodeDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
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
    public PSSysERMapNodeDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssubsyssadeid")
    public void setPSSubSysSADEId(String pSSubSysSADEId) {
        this._set(DTOFIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }

    @JsonIgnore
    public String getPSSubSysSADEId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public void resetPSSubSysSADEId() {
        this._reset(DTOFIELD_PSSUBSYSSADEID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsyssadeid(String pSSubSysSADEId) {
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsyssadeid(PSSubSysSADEDTO pSSubSysSADE) {
        if (pSSubSysSADE == null) {
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
        } else {
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadename")
    public void setPSSubSysSADEName(String pSSubSysSADEName) {
        this._set(DTOFIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }

    @JsonIgnore
    public String getPSSubSysSADEName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADENameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADEName() {
        this._reset(DTOFIELD_PSSUBSYSSADENAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsyssadename(String pSSubSysSADEName) {
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiid")
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIId() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
        if (pSSubSysServiceAPI == null) {
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        } else {
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssubsysserviceapiname")
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName) {
        this._set(DTOFIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSubSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSubSysServiceAPIName() {
        this._reset(DTOFIELD_PSSUBSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAppIdDirty() {
        return this._contains(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public void resetPSSysAppId() {
        this._reset(DTOFIELD_PSSYSAPPID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysappid(PSSysAppDTO pSSysApp) {
        if (pSSysApp == null) {
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        } else {
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
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
    public PSSysERMapNodeDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
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
    public PSSysERMapNodeDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme) {
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
    public PSSysERMapNodeDTO pssysbdschemename(String pSSysBDSchemeName) {
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
    public PSSysERMapNodeDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
        if (pSSysBDTable == null) {
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        } else {
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
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
    public PSSysERMapNodeDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    @JsonProperty(value="pssysdbschemeid")
    public void setPSSysDBSchemeId(String pSSysDBSchemeId) {
        this._set(DTOFIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }

    @JsonIgnore
    public String getPSSysDBSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeId() {
        this._reset(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbschemeid(String pSSysDBSchemeId) {
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbschemeid(PSSysDBSchemeDTO pSSysDBScheme) {
        if (pSSysDBScheme == null) {
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        } else {
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbschemename")
    public void setPSSysDBSchemeName(String pSSysDBSchemeName) {
        this._set(DTOFIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }

    @JsonIgnore
    public String getPSSysDBSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeName() {
        this._reset(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbschemename(String pSSysDBSchemeName) {
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
        return this;
    }

    @JsonProperty(value="pssysdbtableid")
    public void setPSSysDBTableId(String pSSysDBTableId) {
        this._set(DTOFIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }

    @JsonIgnore
    public String getPSSysDBTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public void resetPSSysDBTableId() {
        this._reset(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbtableid(String pSSysDBTableId) {
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable) {
        if (pSSysDBTable == null) {
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        } else {
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbtablename")
    public void setPSSysDBTableName(String pSSysDBTableName) {
        this._set(DTOFIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }

    @JsonIgnore
    public String getPSSysDBTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysDBTableName() {
        this._reset(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysdbtablename(String pSSysDBTableName) {
        this.setPSSysDBTableName(pSSysDBTableName);
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
    public PSSysERMapNodeDTO pssysermapid(String pSSysERMapId) {
        this.setPSSysERMapId(pSSysERMapId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysermapid(PSSysERMapDTO pSSysERMap) {
        if (pSSysERMap == null) {
            this.setPSSysERMapId(null);
            this.setPSSysERMapName(null);
        } else {
            this.setPSSysERMapId(pSSysERMap.getPSSysERMapId());
            this.setPSSysERMapName(pSSysERMap.getPSSysERMapName());
        }
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
    public PSSysERMapNodeDTO pssysermapname(String pSSysERMapName) {
        this.setPSSysERMapName(pSSysERMapName);
        return this;
    }

    @JsonProperty(value="pssysermapnodeid")
    public void setPSSysERMapNodeId(String pSSysERMapNodeId) {
        this._set(DTOFIELD_PSSYSERMAPNODEID, pSSysERMapNodeId);
    }

    @JsonIgnore
    public String getPSSysERMapNodeId() {
        Object objValue = this._get(DTOFIELD_PSSYSERMAPNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysERMapNodeIdDirty() {
        return this._contains(DTOFIELD_PSSYSERMAPNODEID);
    }

    @JsonIgnore
    public void resetPSSysERMapNodeId() {
        this._reset(DTOFIELD_PSSYSERMAPNODEID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysermapnodeid(String pSSysERMapNodeId) {
        this.setPSSysERMapNodeId(pSSysERMapNodeId);
        return this;
    }

    @JsonProperty(value="pssysermapnodename")
    public void setPSSysERMapNodeName(String pSSysERMapNodeName) {
        this._set(DTOFIELD_PSSYSERMAPNODENAME, pSSysERMapNodeName);
    }

    @JsonIgnore
    public String getPSSysERMapNodeName() {
        Object objValue = this._get(DTOFIELD_PSSYSERMAPNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysERMapNodeNameDirty() {
        return this._contains(DTOFIELD_PSSYSERMAPNODENAME);
    }

    @JsonIgnore
    public void resetPSSysERMapNodeName() {
        this._reset(DTOFIELD_PSSYSERMAPNODENAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysermapnodename(String pSSysERMapNodeName) {
        this.setPSSysERMapNodeName(pSSysERMapNodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysERMapNodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysERMapNodeName(strName);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO name(String strName) {
        this.setPSSysERMapNodeName(strName);
        return this;
    }

    @JsonProperty(value="pssyssearchdocid")
    public void setPSSysSearchDocId(String pSSysSearchDocId) {
        this._set(DTOFIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }

    @JsonIgnore
    public String getPSSysSearchDocId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public void resetPSSysSearchDocId() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc) {
        if (pSSysSearchDoc == null) {
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        } else {
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchdocname")
    public void setPSSysSearchDocName(String pSSysSearchDocName) {
        this._set(DTOFIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }

    @JsonIgnore
    public String getPSSysSearchDocName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHDOCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchDocName() {
        this._reset(DTOFIELD_PSSYSSEARCHDOCNAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchdocname(String pSSysSearchDocName) {
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    @JsonProperty(value="pssyssearchschemeid")
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId) {
        this._set(DTOFIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }

    @JsonIgnore
    public String getPSSysSearchSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysSearchSchemeId() {
        this._reset(DTOFIELD_PSSYSSEARCHSCHEMEID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchschemeid(String pSSysSearchSchemeId) {
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme) {
        if (pSSysSearchScheme == null) {
            this.setPSSysSearchSchemeId(null);
            this.setPSSysSearchSchemeName(null);
        } else {
            this.setPSSysSearchSchemeId(pSSysSearchScheme.getPSSysSearchSchemeId());
            this.setPSSysSearchSchemeName(pSSysSearchScheme.getPSSysSearchSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchschemename")
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName) {
        this._set(DTOFIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }

    @JsonIgnore
    public String getPSSysSearchSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysSearchSchemeName() {
        this._reset(DTOFIELD_PSSYSSEARCHSCHEMENAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssyssearchschemename(String pSSysSearchSchemeName) {
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI) {
        if (pSSysServiceAPI == null) {
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        } else {
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="pssysserviceapiname")
    public void setPSSysServiceAPIName(String pSSysServiceAPIName) {
        this._set(DTOFIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }

    @JsonIgnore
    public String getPSSysServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIName() {
        this._reset(DTOFIELD_PSSYSSERVICEAPINAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO pssysserviceapiname(String pSSysServiceAPIName) {
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="refpssysdynamodelid")
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelId() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO refpssysdynamodelid(String refPSSysDynaModelId) {
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO refpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        } else {
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="refpssysdynamodelname")
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName) {
        this._set(DTOFIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }

    @JsonIgnore
    public String getRefPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_REFPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetRefPSSysDynaModelName() {
        this._reset(DTOFIELD_REFPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO refpssysdynamodelname(String refPSSysDynaModelName) {
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
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
    public PSSysERMapNodeDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
        return this;
    }

    @JsonProperty(value="showdefields")
    public void setShowDEFields(String showDEFields) {
        this._set(DTOFIELD_SHOWDEFIELDS, showDEFields);
    }

    @JsonIgnore
    public String getShowDEFields() {
        Object objValue = this._get(DTOFIELD_SHOWDEFIELDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShowDEFieldsDirty() {
        return this._contains(DTOFIELD_SHOWDEFIELDS);
    }

    @JsonIgnore
    public void resetShowDEFields() {
        this._reset(DTOFIELD_SHOWDEFIELDS);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO showdefields(String showDEFields) {
        this.setShowDEFields(showDEFields);
        return this;
    }

    @JsonProperty(value="toppos")
    public void setTopPos(Integer topPos) {
        this._set(DTOFIELD_TOPPOS, topPos);
    }

    @JsonIgnore
    public Integer getTopPos() {
        Object objValue = this._get(DTOFIELD_TOPPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTopPosDirty() {
        return this._contains(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public void resetTopPos() {
        this._reset(DTOFIELD_TOPPOS);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
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
    public PSSysERMapNodeDTO updatedate(Timestamp updateDate) {
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
    public PSSysERMapNodeDTO updateman(String updateMan) {
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
    public PSSysERMapNodeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysERMapNodeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysERMapNodeDTO usertag(String userTag) {
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
    public PSSysERMapNodeDTO usertag2(String userTag2) {
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
    public PSSysERMapNodeDTO usertag3(String userTag3) {
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
    public PSSysERMapNodeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysERMapNodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysERMapNodeId(strValue);
    }

    @JsonIgnore
    public PSSysERMapNodeDTO id(String strValue) {
        this.setPSSysERMapNodeId(strValue);
        return this;
    }
}
