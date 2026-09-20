/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEActionLogicAttachMode
 *  net.ibizsys.model.PSModelEnums$DEActionLogicType
 *  net.ibizsys.model.PSModelEnums$DEActionPrepareLastMode
 *  net.ibizsys.model.PSModelEnums$DELogicHolder
 *  net.ibizsys.model.PSModelEnums$DataSyncInformType
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSyncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFValueRuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMainStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDENotifyDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDELogicNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSequenceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTranslatorDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysValueRuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEActionLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_ATTACHMODE = "ATTACHMODE";
    protected static final String DTOFIELD_ATTACHMODE = "attachmode";
    public static final String FIELD_CLONEPARAMFLAG = "CLONEPARAMFLAG";
    protected static final String DTOFIELD_CLONEPARAMFLAG = "cloneparamflag";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DATASYNCEVENT = "DATASYNCEVENT";
    protected static final String DTOFIELD_DATASYNCEVENT = "datasyncevent";
    public static final String FIELD_DSTPSDEACTIONID = "DSTPSDEACTIONID";
    protected static final String DTOFIELD_DSTPSDEACTIONID = "dstpsdeactionid";
    public static final String FIELD_DSTPSDEACTIONNAME = "DSTPSDEACTIONNAME";
    protected static final String DTOFIELD_DSTPSDEACTIONNAME = "dstpsdeactionname";
    public static final String FIELD_DSTPSDEDATAQUERYID = "DSTPSDEDATAQUERYID";
    protected static final String DTOFIELD_DSTPSDEDATAQUERYID = "dstpsdedataqueryid";
    public static final String FIELD_DSTPSDEDATAQUERYNAME = "DSTPSDEDATAQUERYNAME";
    protected static final String DTOFIELD_DSTPSDEDATAQUERYNAME = "dstpsdedataqueryname";
    public static final String FIELD_DSTPSDEDATASETID = "DSTPSDEDATASETID";
    protected static final String DTOFIELD_DSTPSDEDATASETID = "dstpsdedatasetid";
    public static final String FIELD_DSTPSDEDATASETNAME = "DSTPSDEDATASETNAME";
    protected static final String DTOFIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_DSTPSDELOGICID = "DSTPSDELOGICID";
    protected static final String DTOFIELD_DSTPSDELOGICID = "dstpsdelogicid";
    public static final String FIELD_DSTPSDELOGICNAME = "DSTPSDELOGICNAME";
    protected static final String DTOFIELD_DSTPSDELOGICNAME = "dstpsdelogicname";
    public static final String FIELD_DSTPSDENAME = "DSTPSDENAME";
    protected static final String DTOFIELD_DSTPSDENAME = "dstpsdename";
    public static final String FIELD_ERRORCODE = "ERRORCODE";
    protected static final String DTOFIELD_ERRORCODE = "errorcode";
    public static final String FIELD_ERRORMSG = "ERRORMSG";
    protected static final String DTOFIELD_ERRORMSG = "errormsg";
    public static final String FIELD_ERRORPSLANRESID = "ERRORPSLANRESID";
    protected static final String DTOFIELD_ERRORPSLANRESID = "errorpslanresid";
    public static final String FIELD_ERRORPSLANRESNAME = "ERRORPSLANRESNAME";
    protected static final String DTOFIELD_ERRORPSLANRESNAME = "errorpslanresname";
    public static final String FIELD_EXCEPTIONOBJ = "EXCEPTIONOBJ";
    protected static final String DTOFIELD_EXCEPTIONOBJ = "exceptionobj";
    public static final String FIELD_IGNOREEXCEPTION = "IGNOREEXCEPTION";
    protected static final String DTOFIELD_IGNOREEXCEPTION = "ignoreexception";
    public static final String FIELD_INTERNALLOGIC = "INTERNALLOGIC";
    protected static final String DTOFIELD_INTERNALLOGIC = "internallogic";
    public static final String FIELD_LOGICHOLDER = "LOGICHOLDER";
    protected static final String DTOFIELD_LOGICHOLDER = "logicholder";
    public static final String FIELD_MAJORPSDERID = "MAJORPSDERID";
    protected static final String DTOFIELD_MAJORPSDERID = "majorpsderid";
    public static final String FIELD_MAJORPSDERNAME = "MAJORPSDERNAME";
    protected static final String DTOFIELD_MAJORPSDERNAME = "majorpsdername";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDERID = "MINORPSDERID";
    protected static final String DTOFIELD_MINORPSDERID = "minorpsderid";
    public static final String FIELD_MINORPSDERNAME = "MINORPSDERNAME";
    protected static final String DTOFIELD_MINORPSDERNAME = "minorpsdername";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PREPARELAST = "PREPARELAST";
    protected static final String DTOFIELD_PREPARELAST = "preparelast";
    public static final String FIELD_PROPERTYMAP = "PROPERTYMAP";
    protected static final String DTOFIELD_PROPERTYMAP = "propertymap";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONLOGICID = "PSDEACTIONLOGICID";
    protected static final String DTOFIELD_PSDEACTIONLOGICID = "psdeactionlogicid";
    public static final String FIELD_PSDEACTIONLOGICNAME = "PSDEACTIONLOGICNAME";
    protected static final String DTOFIELD_PSDEACTIONLOGICNAME = "psdeactionlogicname";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEDATASYNCID = "PSDEDATASYNCID";
    protected static final String DTOFIELD_PSDEDATASYNCID = "psdedatasyncid";
    public static final String FIELD_PSDEDATASYNCNAME = "PSDEDATASYNCNAME";
    protected static final String DTOFIELD_PSDEDATASYNCNAME = "psdedatasyncname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFVALUERULEID = "PSDEFVALUERULEID";
    protected static final String DTOFIELD_PSDEFVALUERULEID = "psdefvalueruleid";
    public static final String FIELD_PSDEFVALUERULENAME = "PSDEFVALUERULENAME";
    protected static final String DTOFIELD_PSDEFVALUERULENAME = "psdefvaluerulename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDEMAINSTATEID = "PSDEMAINSTATEID";
    protected static final String DTOFIELD_PSDEMAINSTATEID = "psdemainstateid";
    public static final String FIELD_PSDEMAINSTATENAME = "PSDEMAINSTATENAME";
    protected static final String DTOFIELD_PSDEMAINSTATENAME = "psdemainstatename";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDENOTIFYID = "PSDENOTIFYID";
    protected static final String DTOFIELD_PSDENOTIFYID = "psdenotifyid";
    public static final String FIELD_PSDENOTIFYNAME = "PSDENOTIFYNAME";
    protected static final String DTOFIELD_PSDENOTIFYNAME = "psdenotifyname";
    public static final String FIELD_PSSYSDELOGICNODEID = "PSSYSDELOGICNODEID";
    protected static final String DTOFIELD_PSSYSDELOGICNODEID = "pssysdelogicnodeid";
    public static final String FIELD_PSSYSDELOGICNODENAME = "PSSYSDELOGICNODENAME";
    protected static final String DTOFIELD_PSSYSDELOGICNODENAME = "pssysdelogicnodename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSSEQUENCEID = "PSSYSSEQUENCEID";
    protected static final String DTOFIELD_PSSYSSEQUENCEID = "pssyssequenceid";
    public static final String FIELD_PSSYSSEQUENCENAME = "PSSYSSEQUENCENAME";
    protected static final String DTOFIELD_PSSYSSEQUENCENAME = "pssyssequencename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_PSSYSVALUERULEID = "PSSYSVALUERULEID";
    protected static final String DTOFIELD_PSSYSVALUERULEID = "pssysvalueruleid";
    public static final String FIELD_PSSYSVALUERULENAME = "PSSYSVALUERULENAME";
    protected static final String DTOFIELD_PSSYSVALUERULENAME = "pssysvaluerulename";
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

    @JsonProperty(value="attachmode")
    public void setAttachMode(String attachMode) {
        this._set(DTOFIELD_ATTACHMODE, attachMode);
    }

    @JsonIgnore
    public String getAttachMode() {
        Object objValue = this._get(DTOFIELD_ATTACHMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttachModeDirty() {
        return this._contains(DTOFIELD_ATTACHMODE);
    }

    @JsonIgnore
    public void resetAttachMode() {
        this._reset(DTOFIELD_ATTACHMODE);
    }

    @JsonIgnore
    public PSDEActionLogicDTO attachmode(String attachMode) {
        this.setAttachMode(attachMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO attachmode(PSModelEnums.DEActionLogicAttachMode attachMode) {
        if (attachMode == null) {
            this.setAttachMode(null);
        } else {
            this.setAttachMode(attachMode.value);
        }
        return this;
    }

    @JsonProperty(value="cloneparamflag")
    public void setCloneParamFlag(Integer cloneParamFlag) {
        this._set(DTOFIELD_CLONEPARAMFLAG, cloneParamFlag);
    }

    @JsonIgnore
    public Integer getCloneParamFlag() {
        Object objValue = this._get(DTOFIELD_CLONEPARAMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCloneParamFlagDirty() {
        return this._contains(DTOFIELD_CLONEPARAMFLAG);
    }

    @JsonIgnore
    public void resetCloneParamFlag() {
        this._reset(DTOFIELD_CLONEPARAMFLAG);
    }

    @JsonIgnore
    public PSDEActionLogicDTO cloneparamflag(Integer cloneParamFlag) {
        this.setCloneParamFlag(cloneParamFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO cloneparamflag(Boolean cloneParamFlag) {
        if (cloneParamFlag == null) {
            this.setCloneParamFlag(null);
        } else {
            this.setCloneParamFlag(cloneParamFlag != false ? 1 : 0);
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
    public PSDEActionLogicDTO codename(String codeName) {
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
    public PSDEActionLogicDTO createdate(Timestamp createDate) {
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
    public PSDEActionLogicDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDEActionLogicDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="datasyncevent")
    public void setDataSyncEvent(Integer dataSyncEvent) {
        this._set(DTOFIELD_DATASYNCEVENT, dataSyncEvent);
    }

    @JsonIgnore
    public Integer getDataSyncEvent() {
        Object objValue = this._get(DTOFIELD_DATASYNCEVENT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDataSyncEventDirty() {
        return this._contains(DTOFIELD_DATASYNCEVENT);
    }

    @JsonIgnore
    public void resetDataSyncEvent() {
        this._reset(DTOFIELD_DATASYNCEVENT);
    }

    @JsonIgnore
    public PSDEActionLogicDTO datasyncevent(Integer dataSyncEvent) {
        this.setDataSyncEvent(dataSyncEvent);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO datasyncevent(PSModelEnums.DataSyncInformType dataSyncEvent) {
        if (dataSyncEvent == null) {
            this.setDataSyncEvent(null);
        } else {
            this.setDataSyncEvent(dataSyncEvent.value);
        }
        return this;
    }

    @JsonProperty(value="dstpsdeactionid")
    public void setDstPSDEActionId(String dstPSDEActionId) {
        this._set(DTOFIELD_DSTPSDEACTIONID, dstPSDEActionId);
    }

    @JsonIgnore
    public String getDstPSDEActionId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEActionIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetDstPSDEActionId() {
        this._reset(DTOFIELD_DSTPSDEACTIONID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionid(String dstPSDEActionId) {
        this.setDstPSDEActionId(dstPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setDstPSDEActionId(null);
            this.setDstPSDEActionName(null);
        } else {
            this.setDstPSDEActionId(pSDEAction.getPSDEActionId());
            this.setDstPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeactionname")
    public void setDstPSDEActionName(String dstPSDEActionName) {
        this._set(DTOFIELD_DSTPSDEACTIONNAME, dstPSDEActionName);
    }

    @JsonIgnore
    public String getDstPSDEActionName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEActionNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetDstPSDEActionName() {
        this._reset(DTOFIELD_DSTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeactionname(String dstPSDEActionName) {
        this.setDstPSDEActionName(dstPSDEActionName);
        return this;
    }

    @JsonProperty(value="dstpsdedataqueryid")
    public void setDstPSDEDataQueryId(String dstPSDEDataQueryId) {
        this._set(DTOFIELD_DSTPSDEDATAQUERYID, dstPSDEDataQueryId);
    }

    @JsonIgnore
    public String getDstPSDEDataQueryId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAQUERYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataQueryIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAQUERYID);
    }

    @JsonIgnore
    public void resetDstPSDEDataQueryId() {
        this._reset(DTOFIELD_DSTPSDEDATAQUERYID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryid(String dstPSDEDataQueryId) {
        this.setDstPSDEDataQueryId(dstPSDEDataQueryId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setDstPSDEDataQueryId(null);
            this.setDstPSDEDataQueryName(null);
        } else {
            this.setDstPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setDstPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedataqueryname")
    public void setDstPSDEDataQueryName(String dstPSDEDataQueryName) {
        this._set(DTOFIELD_DSTPSDEDATAQUERYNAME, dstPSDEDataQueryName);
    }

    @JsonIgnore
    public String getDstPSDEDataQueryName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAQUERYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataQueryNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataQueryName() {
        this._reset(DTOFIELD_DSTPSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedataqueryname(String dstPSDEDataQueryName) {
        this.setDstPSDEDataQueryName(dstPSDEDataQueryName);
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
    public PSDEActionLogicDTO dstpsdedatasetid(String dstPSDEDataSetId) {
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEActionLogicDTO dstpsdedatasetname(String dstPSDEDataSetName) {
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
    public PSDEActionLogicDTO dstpsdeid(String dstPSDEId) {
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setDstPSDEId(null);
            this.setDstPSDEName(null);
        } else {
            this.setDstPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDstPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdelogicid")
    public void setDstPSDELogicId(String dstPSDELogicId) {
        this._set(DTOFIELD_DSTPSDELOGICID, dstPSDELogicId);
    }

    @JsonIgnore
    public String getDstPSDELogicId() {
        Object objValue = this._get(DTOFIELD_DSTPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDELogicIdDirty() {
        return this._contains(DTOFIELD_DSTPSDELOGICID);
    }

    @JsonIgnore
    public void resetDstPSDELogicId() {
        this._reset(DTOFIELD_DSTPSDELOGICID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdelogicid(String dstPSDELogicId) {
        this.setDstPSDELogicId(dstPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setDstPSDELogicId(null);
            this.setDstPSDELogicName(null);
        } else {
            this.setDstPSDELogicId(pSDELogic.getPSDELogicId());
            this.setDstPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdelogicname")
    public void setDstPSDELogicName(String dstPSDELogicName) {
        this._set(DTOFIELD_DSTPSDELOGICNAME, dstPSDELogicName);
    }

    @JsonIgnore
    public String getDstPSDELogicName() {
        Object objValue = this._get(DTOFIELD_DSTPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDELogicNameDirty() {
        return this._contains(DTOFIELD_DSTPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetDstPSDELogicName() {
        this._reset(DTOFIELD_DSTPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdelogicname(String dstPSDELogicName) {
        this.setDstPSDELogicName(dstPSDELogicName);
        return this;
    }

    @JsonProperty(value="dstpsdename")
    public void setDstPSDEName(String dstPSDEName) {
        this._set(DTOFIELD_DSTPSDENAME, dstPSDEName);
    }

    @JsonIgnore
    public String getDstPSDEName() {
        Object objValue = this._get(DTOFIELD_DSTPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDENameDirty() {
        return this._contains(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public void resetDstPSDEName() {
        this._reset(DTOFIELD_DSTPSDENAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO dstpsdename(String dstPSDEName) {
        this.setDstPSDEName(dstPSDEName);
        return this;
    }

    @JsonProperty(value="errorcode")
    public void setErrorCode(Integer errorCode) {
        this._set(DTOFIELD_ERRORCODE, errorCode);
    }

    @JsonIgnore
    public Integer getErrorCode() {
        Object objValue = this._get(DTOFIELD_ERRORCODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isErrorCodeDirty() {
        return this._contains(DTOFIELD_ERRORCODE);
    }

    @JsonIgnore
    public void resetErrorCode() {
        this._reset(DTOFIELD_ERRORCODE);
    }

    @JsonIgnore
    public PSDEActionLogicDTO errorcode(Integer errorCode) {
        this.setErrorCode(errorCode);
        return this;
    }

    @JsonProperty(value="errormsg")
    public void setErrorMsg(String errorMsg) {
        this._set(DTOFIELD_ERRORMSG, errorMsg);
    }

    @JsonIgnore
    public String getErrorMsg() {
        Object objValue = this._get(DTOFIELD_ERRORMSG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrorMsgDirty() {
        return this._contains(DTOFIELD_ERRORMSG);
    }

    @JsonIgnore
    public void resetErrorMsg() {
        this._reset(DTOFIELD_ERRORMSG);
    }

    @JsonIgnore
    public PSDEActionLogicDTO errormsg(String errorMsg) {
        this.setErrorMsg(errorMsg);
        return this;
    }

    @JsonProperty(value="errorpslanresid")
    public void setErrorPSLanResId(String errorPSLanResId) {
        this._set(DTOFIELD_ERRORPSLANRESID, errorPSLanResId);
    }

    @JsonIgnore
    public String getErrorPSLanResId() {
        Object objValue = this._get(DTOFIELD_ERRORPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrorPSLanResIdDirty() {
        return this._contains(DTOFIELD_ERRORPSLANRESID);
    }

    @JsonIgnore
    public void resetErrorPSLanResId() {
        this._reset(DTOFIELD_ERRORPSLANRESID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresid(String errorPSLanResId) {
        this.setErrorPSLanResId(errorPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setErrorPSLanResId(null);
            this.setErrorPSLanResName(null);
        } else {
            this.setErrorPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setErrorPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="errorpslanresname")
    public void setErrorPSLanResName(String errorPSLanResName) {
        this._set(DTOFIELD_ERRORPSLANRESNAME, errorPSLanResName);
    }

    @JsonIgnore
    public String getErrorPSLanResName() {
        Object objValue = this._get(DTOFIELD_ERRORPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrorPSLanResNameDirty() {
        return this._contains(DTOFIELD_ERRORPSLANRESNAME);
    }

    @JsonIgnore
    public void resetErrorPSLanResName() {
        this._reset(DTOFIELD_ERRORPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO errorpslanresname(String errorPSLanResName) {
        this.setErrorPSLanResName(errorPSLanResName);
        return this;
    }

    @JsonProperty(value="exceptionobj")
    public void setExceptionObj(String exceptionObj) {
        this._set(DTOFIELD_EXCEPTIONOBJ, exceptionObj);
    }

    @JsonIgnore
    public String getExceptionObj() {
        Object objValue = this._get(DTOFIELD_EXCEPTIONOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExceptionObjDirty() {
        return this._contains(DTOFIELD_EXCEPTIONOBJ);
    }

    @JsonIgnore
    public void resetExceptionObj() {
        this._reset(DTOFIELD_EXCEPTIONOBJ);
    }

    @JsonIgnore
    public PSDEActionLogicDTO exceptionobj(String exceptionObj) {
        this.setExceptionObj(exceptionObj);
        return this;
    }

    @JsonProperty(value="ignoreexception")
    public void setIgnoreException(Integer ignoreException) {
        this._set(DTOFIELD_IGNOREEXCEPTION, ignoreException);
    }

    @JsonIgnore
    public Integer getIgnoreException() {
        Object objValue = this._get(DTOFIELD_IGNOREEXCEPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreExceptionDirty() {
        return this._contains(DTOFIELD_IGNOREEXCEPTION);
    }

    @JsonIgnore
    public void resetIgnoreException() {
        this._reset(DTOFIELD_IGNOREEXCEPTION);
    }

    @JsonIgnore
    public PSDEActionLogicDTO ignoreexception(Integer ignoreException) {
        this.setIgnoreException(ignoreException);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO ignoreexception(Boolean ignoreException) {
        if (ignoreException == null) {
            this.setIgnoreException(null);
        } else {
            this.setIgnoreException(ignoreException != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="internallogic")
    public void setInternalLogic(Integer internalLogic) {
        this._set(DTOFIELD_INTERNALLOGIC, internalLogic);
    }

    @JsonIgnore
    public Integer getInternalLogic() {
        Object objValue = this._get(DTOFIELD_INTERNALLOGIC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInternalLogicDirty() {
        return this._contains(DTOFIELD_INTERNALLOGIC);
    }

    @JsonIgnore
    public void resetInternalLogic() {
        this._reset(DTOFIELD_INTERNALLOGIC);
    }

    @JsonIgnore
    public PSDEActionLogicDTO internallogic(Integer internalLogic) {
        this.setInternalLogic(internalLogic);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO internallogic(PSModelEnums.DEActionLogicType internalLogic) {
        if (internalLogic == null) {
            this.setInternalLogic(null);
        } else {
            this.setInternalLogic(internalLogic.value);
        }
        return this;
    }

    @JsonProperty(value="logicholder")
    public void setLogicHolder(Integer logicHolder) {
        this._set(DTOFIELD_LOGICHOLDER, logicHolder);
    }

    @JsonIgnore
    public Integer getLogicHolder() {
        Object objValue = this._get(DTOFIELD_LOGICHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLogicHolderDirty() {
        return this._contains(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public void resetLogicHolder() {
        this._reset(DTOFIELD_LOGICHOLDER);
    }

    @JsonIgnore
    public PSDEActionLogicDTO logicholder(Integer logicHolder) {
        this.setLogicHolder(logicHolder);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO logicholder(PSModelEnums.DELogicHolder logicHolder) {
        if (logicHolder == null) {
            this.setLogicHolder(null);
        } else {
            this.setLogicHolder(logicHolder.value);
        }
        return this;
    }

    @JsonProperty(value="majorpsderid")
    public void setMajorPSDERId(String majorPSDERId) {
        this._set(DTOFIELD_MAJORPSDERID, majorPSDERId);
    }

    @JsonIgnore
    public String getMajorPSDERId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDERIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDERID);
    }

    @JsonIgnore
    public void resetMajorPSDERId() {
        this._reset(DTOFIELD_MAJORPSDERID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO majorpsderid(String majorPSDERId) {
        this.setMajorPSDERId(majorPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO majorpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setMajorPSDERId(null);
            this.setMajorPSDERName(null);
        } else {
            this.setMajorPSDERId(pSDER.getPSDERId());
            this.setMajorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdername")
    public void setMajorPSDERName(String majorPSDERName) {
        this._set(DTOFIELD_MAJORPSDERNAME, majorPSDERName);
    }

    @JsonIgnore
    public String getMajorPSDERName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDERNameDirty() {
        return this._contains(DTOFIELD_MAJORPSDERNAME);
    }

    @JsonIgnore
    public void resetMajorPSDERName() {
        this._reset(DTOFIELD_MAJORPSDERNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO majorpsdername(String majorPSDERName) {
        this.setMajorPSDERName(majorPSDERName);
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
    public PSDEActionLogicDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsderid")
    public void setMinorPSDERId(String minorPSDERId) {
        this._set(DTOFIELD_MINORPSDERID, minorPSDERId);
    }

    @JsonIgnore
    public String getMinorPSDERId() {
        Object objValue = this._get(DTOFIELD_MINORPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDERIdDirty() {
        return this._contains(DTOFIELD_MINORPSDERID);
    }

    @JsonIgnore
    public void resetMinorPSDERId() {
        this._reset(DTOFIELD_MINORPSDERID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO minorpsderid(String minorPSDERId) {
        this.setMinorPSDERId(minorPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO minorpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setMinorPSDERId(null);
            this.setMinorPSDERName(null);
        } else {
            this.setMinorPSDERId(pSDER.getPSDERId());
            this.setMinorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="minorpsdername")
    public void setMinorPSDERName(String minorPSDERName) {
        this._set(DTOFIELD_MINORPSDERNAME, minorPSDERName);
    }

    @JsonIgnore
    public String getMinorPSDERName() {
        Object objValue = this._get(DTOFIELD_MINORPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDERNameDirty() {
        return this._contains(DTOFIELD_MINORPSDERNAME);
    }

    @JsonIgnore
    public void resetMinorPSDERName() {
        this._reset(DTOFIELD_MINORPSDERNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO minorpsdername(String minorPSDERName) {
        this.setMinorPSDERName(minorPSDERName);
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
    public PSDEActionLogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="preparelast")
    public void setPrepareLast(Integer prepareLast) {
        this._set(DTOFIELD_PREPARELAST, prepareLast);
    }

    @JsonIgnore
    public Integer getPrepareLast() {
        Object objValue = this._get(DTOFIELD_PREPARELAST);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrepareLastDirty() {
        return this._contains(DTOFIELD_PREPARELAST);
    }

    @JsonIgnore
    public void resetPrepareLast() {
        this._reset(DTOFIELD_PREPARELAST);
    }

    @JsonIgnore
    public PSDEActionLogicDTO preparelast(Integer prepareLast) {
        this.setPrepareLast(prepareLast);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO preparelast(PSModelEnums.DEActionPrepareLastMode prepareLast) {
        if (prepareLast == null) {
            this.setPrepareLast(null);
        } else {
            this.setPrepareLast(prepareLast.value);
        }
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
    public PSDEActionLogicDTO propertymap(String propertyMap) {
        this.setPropertyMap(propertyMap);
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionlogicid")
    public void setPSDEActionLogicId(String pSDEActionLogicId) {
        this._set(DTOFIELD_PSDEACTIONLOGICID, pSDEActionLogicId);
    }

    @JsonIgnore
    public String getPSDEActionLogicId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionLogicIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONLOGICID);
    }

    @JsonIgnore
    public void resetPSDEActionLogicId() {
        this._reset(DTOFIELD_PSDEACTIONLOGICID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeactionlogicid(String pSDEActionLogicId) {
        this.setPSDEActionLogicId(pSDEActionLogicId);
        return this;
    }

    @JsonProperty(value="psdeactionlogicname")
    public void setPSDEActionLogicName(String pSDEActionLogicName) {
        this._set(DTOFIELD_PSDEACTIONLOGICNAME, pSDEActionLogicName);
    }

    @JsonIgnore
    public String getPSDEActionLogicName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionLogicNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEActionLogicName() {
        this._reset(DTOFIELD_PSDEACTIONLOGICNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeactionlogicname(String pSDEActionLogicName) {
        this.setPSDEActionLogicName(pSDEActionLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEActionLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEActionLogicName(strName);
    }

    @JsonIgnore
    public PSDEActionLogicDTO name(String strName) {
        this.setPSDEActionLogicName(strName);
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdedatasyncid")
    public void setPSDEDataSyncId(String pSDEDataSyncId) {
        this._set(DTOFIELD_PSDEDATASYNCID, pSDEDataSyncId);
    }

    @JsonIgnore
    public String getPSDEDataSyncId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASYNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSyncIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASYNCID);
    }

    @JsonIgnore
    public void resetPSDEDataSyncId() {
        this._reset(DTOFIELD_PSDEDATASYNCID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncid(String pSDEDataSyncId) {
        this.setPSDEDataSyncId(pSDEDataSyncId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncid(PSDEDataSyncDTO pSDEDataSync) {
        if (pSDEDataSync == null) {
            this.setPSDEDataSyncId(null);
            this.setPSDEDataSyncName(null);
        } else {
            this.setPSDEDataSyncId(pSDEDataSync.getPSDEDataSyncId());
            this.setPSDEDataSyncName(pSDEDataSync.getPSDEDataSyncName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasyncname")
    public void setPSDEDataSyncName(String pSDEDataSyncName) {
        this._set(DTOFIELD_PSDEDATASYNCNAME, pSDEDataSyncName);
    }

    @JsonIgnore
    public String getPSDEDataSyncName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASYNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSyncNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASYNCNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSyncName() {
        this._reset(DTOFIELD_PSDEDATASYNCNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdedatasyncname(String pSDEDataSyncName) {
        this.setPSDEDataSyncName(pSDEDataSyncName);
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
    public PSDEActionLogicDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEActionLogicDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdefvalueruleid")
    public void setPSDEFValueRuleId(String pSDEFValueRuleId) {
        this._set(DTOFIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }

    @JsonIgnore
    public String getPSDEFValueRuleId() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleId() {
        this._reset(DTOFIELD_PSDEFVALUERULEID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdefvalueruleid(String pSDEFValueRuleId) {
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        } else {
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="psdefvaluerulename")
    public void setPSDEFValueRuleName(String pSDEFValueRuleName) {
        this._set(DTOFIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }

    @JsonIgnore
    public String getPSDEFValueRuleName() {
        Object objValue = this._get(DTOFIELD_PSDEFVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty() {
        return this._contains(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public void resetPSDEFValueRuleName() {
        this._reset(DTOFIELD_PSDEFVALUERULENAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdefvaluerulename(String pSDEFValueRuleName) {
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
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
    public PSDEActionLogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdemainstateid")
    public void setPSDEMainStateId(String pSDEMainStateId) {
        this._set(DTOFIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }

    @JsonIgnore
    public String getPSDEMainStateId() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateIdDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public void resetPSDEMainStateId() {
        this._reset(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdemainstateid(PSDEMainStateDTO pSDEMainState) {
        if (pSDEMainState == null) {
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        } else {
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstatename")
    public void setPSDEMainStateName(String pSDEMainStateName) {
        this._set(DTOFIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }

    @JsonIgnore
    public String getPSDEMainStateName() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateNameDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public void resetPSDEMainStateName() {
        this._reset(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdemainstatename(String pSDEMainStateName) {
        this.setPSDEMainStateName(pSDEMainStateName);
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
    public PSDEActionLogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdenotifyid")
    public void setPSDENotifyId(String pSDENotifyId) {
        this._set(DTOFIELD_PSDENOTIFYID, pSDENotifyId);
    }

    @JsonIgnore
    public String getPSDENotifyId() {
        Object objValue = this._get(DTOFIELD_PSDENOTIFYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENotifyIdDirty() {
        return this._contains(DTOFIELD_PSDENOTIFYID);
    }

    @JsonIgnore
    public void resetPSDENotifyId() {
        this._reset(DTOFIELD_PSDENOTIFYID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyid(String pSDENotifyId) {
        this.setPSDENotifyId(pSDENotifyId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyid(PSDENotifyDTO pSDENotify) {
        if (pSDENotify == null) {
            this.setPSDENotifyId(null);
            this.setPSDENotifyName(null);
        } else {
            this.setPSDENotifyId(pSDENotify.getPSDENotifyId());
            this.setPSDENotifyName(pSDENotify.getPSDENotifyName());
        }
        return this;
    }

    @JsonProperty(value="psdenotifyname")
    public void setPSDENotifyName(String pSDENotifyName) {
        this._set(DTOFIELD_PSDENOTIFYNAME, pSDENotifyName);
    }

    @JsonIgnore
    public String getPSDENotifyName() {
        Object objValue = this._get(DTOFIELD_PSDENOTIFYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENotifyNameDirty() {
        return this._contains(DTOFIELD_PSDENOTIFYNAME);
    }

    @JsonIgnore
    public void resetPSDENotifyName() {
        this._reset(DTOFIELD_PSDENOTIFYNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO psdenotifyname(String pSDENotifyName) {
        this.setPSDENotifyName(pSDENotifyName);
        return this;
    }

    @JsonProperty(value="pssysdelogicnodeid")
    public void setPSSysDELogicNodeId(String pSSysDELogicNodeId) {
        this._set(DTOFIELD_PSSYSDELOGICNODEID, pSSysDELogicNodeId);
    }

    @JsonIgnore
    public String getPSSysDELogicNodeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDELOGICNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDELogicNodeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDELOGICNODEID);
    }

    @JsonIgnore
    public void resetPSSysDELogicNodeId() {
        this._reset(DTOFIELD_PSSYSDELOGICNODEID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodeid(String pSSysDELogicNodeId) {
        this.setPSSysDELogicNodeId(pSSysDELogicNodeId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodeid(PSSysDELogicNodeDTO pSSysDELogicNode) {
        if (pSSysDELogicNode == null) {
            this.setPSSysDELogicNodeId(null);
            this.setPSSysDELogicNodeName(null);
        } else {
            this.setPSSysDELogicNodeId(pSSysDELogicNode.getPSSysDELogicNodeId());
            this.setPSSysDELogicNodeName(pSSysDELogicNode.getPSSysDELogicNodeName());
        }
        return this;
    }

    @JsonProperty(value="pssysdelogicnodename")
    public void setPSSysDELogicNodeName(String pSSysDELogicNodeName) {
        this._set(DTOFIELD_PSSYSDELOGICNODENAME, pSSysDELogicNodeName);
    }

    @JsonIgnore
    public String getPSSysDELogicNodeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDELOGICNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDELogicNodeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDELOGICNODENAME);
    }

    @JsonIgnore
    public void resetPSSysDELogicNodeName() {
        this._reset(DTOFIELD_PSSYSDELOGICNODENAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssysdelogicnodename(String pSSysDELogicNodeName) {
        this.setPSSysDELogicNodeName(pSSysDELogicNodeName);
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
    public PSDEActionLogicDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEActionLogicDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssyssequenceid")
    public void setPSSysSequenceId(String pSSysSequenceId) {
        this._set(DTOFIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }

    @JsonIgnore
    public String getPSSysSequenceId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public void resetPSSysSequenceId() {
        this._reset(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssyssequenceid(String pSSysSequenceId) {
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssyssequenceid(PSSysSequenceDTO pSSysSequence) {
        if (pSSysSequence == null) {
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        } else {
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    @JsonProperty(value="pssyssequencename")
    public void setPSSysSequenceName(String pSSysSequenceName) {
        this._set(DTOFIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }

    @JsonIgnore
    public String getPSSysSequenceName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public void resetPSSysSequenceName() {
        this._reset(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssyssequencename(String pSSysSequenceName) {
        this.setPSSysSequenceName(pSSysSequenceName);
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
    public PSDEActionLogicDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEActionLogicDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
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
    public PSDEActionLogicDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
    public PSDEActionLogicDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
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
    public PSDEActionLogicDTO updatedate(Timestamp updateDate) {
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
    public PSDEActionLogicDTO updateman(String updateMan) {
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
    public PSDEActionLogicDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEActionLogicDTO usertag(String userTag) {
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
    public PSDEActionLogicDTO usertag2(String userTag2) {
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
    public PSDEActionLogicDTO usertag3(String userTag3) {
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
    public PSDEActionLogicDTO usertag4(String userTag4) {
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
    public PSDEActionLogicDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionLogicDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEActionLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEActionLogicId(strValue);
    }

    @JsonIgnore
    public PSDEActionLogicDTO id(String strValue) {
        this.setPSDEActionLogicId(strValue);
        return this;
    }
}
