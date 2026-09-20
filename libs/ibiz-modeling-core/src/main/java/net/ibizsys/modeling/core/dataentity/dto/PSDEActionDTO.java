/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEActionBatchMode
 *  net.ibizsys.model.PSModelEnums$DEActionMode
 *  net.ibizsys.model.PSModelEnums$DEActionParamMode
 *  net.ibizsys.model.PSModelEnums$DEActionPrepareLastMode
 *  net.ibizsys.model.PSModelEnums$DEActionRetType
 *  net.ibizsys.model.PSModelEnums$DEActionSyncEvent
 *  net.ibizsys.model.PSModelEnums$DEActionTSMode
 *  net.ibizsys.model.PSModelEnums$DEActionTestActionMode
 *  net.ibizsys.model.PSModelEnums$DEActionType
 *  net.ibizsys.model.PSModelEnums$DECacheScope
 *  net.ibizsys.model.PSModelEnums$DEExtendMode
 *  net.ibizsys.model.PSModelEnums$DELogicHolder
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$RequestMethod
 *  net.ibizsys.model.PSModelEnums$ScriptMode2
 *  net.ibizsys.model.PSModelEnums$ServiceReqParamType
 *  net.ibizsys.model.PSModelEnums$StdDataType
 *  net.ibizsys.model.PSModelEnums$SubSysSADEMethodBindingMode
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionVRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESampleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniStateDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEActionDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONHOLDER = "ACTIONHOLDER";
    protected static final String DTOFIELD_ACTIONHOLDER = "actionholder";
    public static final String FIELD_ACTIONMODE = "ACTIONMODE";
    protected static final String DTOFIELD_ACTIONMODE = "actionmode";
    public static final String FIELD_ACTIONOPTION = "ACTIONOPTION";
    protected static final String DTOFIELD_ACTIONOPTION = "actionoption";
    public static final String FIELD_ACTIONPARAMS = "ACTIONPARAMS";
    protected static final String DTOFIELD_ACTIONPARAMS = "actionparams";
    public static final String FIELD_ACTIONTAG = "ACTIONTAG";
    protected static final String DTOFIELD_ACTIONTAG = "actiontag";
    public static final String FIELD_ACTIONTAG2 = "ACTIONTAG2";
    protected static final String DTOFIELD_ACTIONTAG2 = "actiontag2";
    public static final String FIELD_ACTIONTAG3 = "ACTIONTAG3";
    protected static final String DTOFIELD_ACTIONTAG3 = "actiontag3";
    public static final String FIELD_ACTIONTAG4 = "ACTIONTAG4";
    protected static final String DTOFIELD_ACTIONTAG4 = "actiontag4";
    public static final String FIELD_ACTIONTYPE = "ACTIONTYPE";
    protected static final String DTOFIELD_ACTIONTYPE = "actiontype";
    public static final String FIELD_AFTERCODE = "AFTERCODE";
    protected static final String DTOFIELD_AFTERCODE = "aftercode";
    public static final String FIELD_BATCHACTIONMODE = "BATCHACTIONMODE";
    protected static final String DTOFIELD_BATCHACTIONMODE = "batchactionmode";
    public static final String FIELD_BEFORECODE = "BEFORECODE";
    protected static final String DTOFIELD_BEFORECODE = "beforecode";
    public static final String FIELD_CACHECAT = "CACHECAT";
    protected static final String DTOFIELD_CACHECAT = "cachecat";
    public static final String FIELD_CACHESCOPE = "CACHESCOPE";
    protected static final String DTOFIELD_CACHESCOPE = "cachescope";
    public static final String FIELD_CACHETAG = "CACHETAG";
    protected static final String DTOFIELD_CACHETAG = "cachetag";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
    public static final String FIELD_CALLEROBJ = "CALLEROBJ";
    protected static final String DTOFIELD_CALLEROBJ = "callerobj";
    public static final String FIELD_CALLTIMEOUT = "CALLTIMEOUT";
    protected static final String DTOFIELD_CALLTIMEOUT = "calltimeout";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_ENABLEAUDIT = "ENABLEAUDIT";
    protected static final String DTOFIELD_ENABLEAUDIT = "enableaudit";
    public static final String FIELD_ENABLECACHE = "ENABLECACHE";
    protected static final String DTOFIELD_ENABLECACHE = "enablecache";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FINISHFLAG = "FINISHFLAG";
    protected static final String DTOFIELD_FINISHFLAG = "finishflag";
    public static final String FIELD_INPSDEFGROUPID = "INPSDEFGROUPID";
    protected static final String DTOFIELD_INPSDEFGROUPID = "inpsdefgroupid";
    public static final String FIELD_INPSDEFGROUPNAME = "INPSDEFGROUPNAME";
    protected static final String DTOFIELD_INPSDEFGROUPNAME = "inpsdefgroupname";
    public static final String FIELD_INPSDESAMPLEDATAID = "INPSDESAMPLEDATAID";
    protected static final String DTOFIELD_INPSDESAMPLEDATAID = "inpsdesampledataid";
    public static final String FIELD_INPSDESAMPLEDATANAME = "INPSDESAMPLEDATANAME";
    protected static final String DTOFIELD_INPSDESAMPLEDATANAME = "inpsdesampledataname";
    public static final String FIELD_INPSSYSDYNAMODELID = "INPSSYSDYNAMODELID";
    protected static final String DTOFIELD_INPSSYSDYNAMODELID = "inpssysdynamodelid";
    public static final String FIELD_INPSSYSDYNAMODELNAME = "INPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_INPSSYSDYNAMODELNAME = "inpssysdynamodelname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEEDRESOURCEKEY = "NEEDRESOURCEKEY";
    protected static final String DTOFIELD_NEEDRESOURCEKEY = "needresourcekey";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_OUTPSDEFGROUPID = "OUTPSDEFGROUPID";
    protected static final String DTOFIELD_OUTPSDEFGROUPID = "outpsdefgroupid";
    public static final String FIELD_OUTPSDEFGROUPNAME = "OUTPSDEFGROUPNAME";
    protected static final String DTOFIELD_OUTPSDEFGROUPNAME = "outpsdefgroupname";
    public static final String FIELD_OUTPSDESAMPLEDATAID = "OUTPSDESAMPLEDATAID";
    protected static final String DTOFIELD_OUTPSDESAMPLEDATAID = "outpsdesampledataid";
    public static final String FIELD_OUTPSDESAMPLEDATANAME = "OUTPSDESAMPLEDATANAME";
    protected static final String DTOFIELD_OUTPSDESAMPLEDATANAME = "outpsdesampledataname";
    public static final String FIELD_OUTPSSYSDYNAMODELID = "OUTPSSYSDYNAMODELID";
    protected static final String DTOFIELD_OUTPSSYSDYNAMODELID = "outpssysdynamodelid";
    public static final String FIELD_OUTPSSYSDYNAMODELNAME = "OUTPSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_OUTPSSYSDYNAMODELNAME = "outpssysdynamodelname";
    public static final String FIELD_OUTREFPSDEFGROUPID = "OUTREFPSDEFGROUPID";
    protected static final String DTOFIELD_OUTREFPSDEFGROUPID = "outrefpsdefgroupid";
    public static final String FIELD_OUTREFPSDEFGROUPNAME = "OUTREFPSDEFGROUPNAME";
    protected static final String DTOFIELD_OUTREFPSDEFGROUPNAME = "outrefpsdefgroupname";
    public static final String FIELD_OUTREFPSDEID = "OUTREFPSDEID";
    protected static final String DTOFIELD_OUTREFPSDEID = "outrefpsdeid";
    public static final String FIELD_OUTREFPSDENAME = "OUTREFPSDENAME";
    protected static final String DTOFIELD_OUTREFPSDENAME = "outrefpsdename";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_POTIME = "POTIME";
    protected static final String DTOFIELD_POTIME = "potime";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPEPARAM = "PREDEFINEDTYPEPARAM";
    protected static final String DTOFIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PREPARELAST = "PREPARELAST";
    protected static final String DTOFIELD_PREPARELAST = "preparelast";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEACTIONTEMPLID = "PSDEACTIONTEMPLID";
    protected static final String DTOFIELD_PSDEACTIONTEMPLID = "psdeactiontemplid";
    public static final String FIELD_PSDEACTIONTEMPLNAME = "PSDEACTIONTEMPLNAME";
    protected static final String DTOFIELD_PSDEACTIONTEMPLNAME = "psdeactiontemplname";
    public static final String FIELD_PSDEDATAFLOWID = "PSDEDATAFLOWID";
    protected static final String DTOFIELD_PSDEDATAFLOWID = "psdedataflowid";
    public static final String FIELD_PSDEDATAFLOWNAME = "PSDEDATAFLOWNAME";
    protected static final String DTOFIELD_PSDEDATAFLOWNAME = "psdedataflowname";
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
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDESYSPROCID = "PSDESYSPROCID";
    protected static final String DTOFIELD_PSDESYSPROCID = "psdesysprocid";
    public static final String FIELD_PSDESYSPROCNAME = "PSDESYSPROCNAME";
    protected static final String DTOFIELD_PSDESYSPROCNAME = "psdesysprocname";
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADETAILID = "PSSUBSYSSADETAILID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";
    public static final String FIELD_PSSUBSYSSADETAILNAME = "PSSUBSYSSADETAILNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNISTATEID = "PSSYSUNISTATEID";
    protected static final String DTOFIELD_PSSYSUNISTATEID = "pssysunistateid";
    public static final String FIELD_PSSYSUNISTATENAME = "PSSYSUNISTATENAME";
    protected static final String DTOFIELD_PSSYSUNISTATENAME = "pssysunistatename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_REQUESTFIELD = "REQUESTFIELD";
    protected static final String DTOFIELD_REQUESTFIELD = "requestfield";
    public static final String FIELD_REQUESTMETHOD = "REQUESTMETHOD";
    protected static final String DTOFIELD_REQUESTMETHOD = "requestmethod";
    public static final String FIELD_REQUESTPARAMTYPE = "REQUESTPARAMTYPE";
    protected static final String DTOFIELD_REQUESTPARAMTYPE = "requestparamtype";
    public static final String FIELD_REQUESTPATH = "REQUESTPATH";
    protected static final String DTOFIELD_REQUESTPATH = "requestpath";
    public static final String FIELD_RETSTDDATATYPE = "RETSTDDATATYPE";
    protected static final String DTOFIELD_RETSTDDATATYPE = "retstddatatype";
    public static final String FIELD_RETVALTYPE = "RETVALTYPE";
    protected static final String DTOFIELD_RETVALTYPE = "retvaltype";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_SUBSYSSADETAILMODE = "SUBSYSSADETAILMODE";
    protected static final String DTOFIELD_SUBSYSSADETAILMODE = "subsyssadetailmode";
    public static final String FIELD_SYNCEVENT = "SYNCEVENT";
    protected static final String DTOFIELD_SYNCEVENT = "syncevent";
    public static final String FIELD_TESTACTIONMODE = "TESTACTIONMODE";
    protected static final String DTOFIELD_TESTACTIONMODE = "testactionmode";
    public static final String FIELD_TESTCASEFLAG = "TESTCASEFLAG";
    protected static final String DTOFIELD_TESTCASEFLAG = "testcaseflag";
    public static final String FIELD_TSMODE = "TSMODE";
    protected static final String DTOFIELD_TSMODE = "tsmode";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public static final String DTOFIELD_PSDEACTIONPARAMS = "psdeactionparams";
    public static final String DTOFIELD_PSDEACTIONVRS = "psdeactionvrs";

    @JsonProperty(value="actionholder")
    public void setActionHolder(Integer actionHolder) {
        this._set(DTOFIELD_ACTIONHOLDER, actionHolder);
    }

    @JsonIgnore
    public Integer getActionHolder() {
        Object objValue = this._get(DTOFIELD_ACTIONHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionHolderDirty() {
        return this._contains(DTOFIELD_ACTIONHOLDER);
    }

    @JsonIgnore
    public void resetActionHolder() {
        this._reset(DTOFIELD_ACTIONHOLDER);
    }

    @JsonIgnore
    public PSDEActionDTO actionholder(Integer actionHolder) {
        this.setActionHolder(actionHolder);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO actionholder(PSModelEnums.DELogicHolder actionHolder) {
        if (actionHolder == null) {
            this.setActionHolder(null);
        } else {
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    @JsonProperty(value="actionmode")
    public void setActionMode(String actionMode) {
        this._set(DTOFIELD_ACTIONMODE, actionMode);
    }

    @JsonIgnore
    public String getActionMode() {
        Object objValue = this._get(DTOFIELD_ACTIONMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionModeDirty() {
        return this._contains(DTOFIELD_ACTIONMODE);
    }

    @JsonIgnore
    public void resetActionMode() {
        this._reset(DTOFIELD_ACTIONMODE);
    }

    @JsonIgnore
    public PSDEActionDTO actionmode(String actionMode) {
        this.setActionMode(actionMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO actionmode(PSModelEnums.DEActionMode actionMode) {
        if (actionMode == null) {
            this.setActionMode(null);
        } else {
            this.setActionMode(actionMode.value);
        }
        return this;
    }

    @JsonProperty(value="actionoption")
    public void setActionOption(Integer actionOption) {
        this._set(DTOFIELD_ACTIONOPTION, actionOption);
    }

    @JsonIgnore
    public Integer getActionOption() {
        Object objValue = this._get(DTOFIELD_ACTIONOPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionOptionDirty() {
        return this._contains(DTOFIELD_ACTIONOPTION);
    }

    @JsonIgnore
    public void resetActionOption() {
        this._reset(DTOFIELD_ACTIONOPTION);
    }

    @JsonIgnore
    public PSDEActionDTO actionoption(Integer actionOption) {
        this.setActionOption(actionOption);
        return this;
    }

    @JsonProperty(value="actionparams")
    public void setActionParams(String actionParams) {
        this._set(DTOFIELD_ACTIONPARAMS, actionParams);
    }

    @JsonIgnore
    public String getActionParams() {
        Object objValue = this._get(DTOFIELD_ACTIONPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionParamsDirty() {
        return this._contains(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public void resetActionParams() {
        this._reset(DTOFIELD_ACTIONPARAMS);
    }

    @JsonIgnore
    public PSDEActionDTO actionparams(String actionParams) {
        this.setActionParams(actionParams);
        return this;
    }

    @JsonProperty(value="actiontag")
    public void setActionTag(String actionTag) {
        this._set(DTOFIELD_ACTIONTAG, actionTag);
    }

    @JsonIgnore
    public String getActionTag() {
        Object objValue = this._get(DTOFIELD_ACTIONTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTagDirty() {
        return this._contains(DTOFIELD_ACTIONTAG);
    }

    @JsonIgnore
    public void resetActionTag() {
        this._reset(DTOFIELD_ACTIONTAG);
    }

    @JsonIgnore
    public PSDEActionDTO actiontag(String actionTag) {
        this.setActionTag(actionTag);
        return this;
    }

    @JsonProperty(value="actiontag2")
    public void setActionTag2(String actionTag2) {
        this._set(DTOFIELD_ACTIONTAG2, actionTag2);
    }

    @JsonIgnore
    public String getActionTag2() {
        Object objValue = this._get(DTOFIELD_ACTIONTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTag2Dirty() {
        return this._contains(DTOFIELD_ACTIONTAG2);
    }

    @JsonIgnore
    public void resetActionTag2() {
        this._reset(DTOFIELD_ACTIONTAG2);
    }

    @JsonIgnore
    public PSDEActionDTO actiontag2(String actionTag2) {
        this.setActionTag2(actionTag2);
        return this;
    }

    @JsonProperty(value="actiontag3")
    public void setActionTag3(String actionTag3) {
        this._set(DTOFIELD_ACTIONTAG3, actionTag3);
    }

    @JsonIgnore
    public String getActionTag3() {
        Object objValue = this._get(DTOFIELD_ACTIONTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTag3Dirty() {
        return this._contains(DTOFIELD_ACTIONTAG3);
    }

    @JsonIgnore
    public void resetActionTag3() {
        this._reset(DTOFIELD_ACTIONTAG3);
    }

    @JsonIgnore
    public PSDEActionDTO actiontag3(String actionTag3) {
        this.setActionTag3(actionTag3);
        return this;
    }

    @JsonProperty(value="actiontag4")
    public void setActionTag4(String actionTag4) {
        this._set(DTOFIELD_ACTIONTAG4, actionTag4);
    }

    @JsonIgnore
    public String getActionTag4() {
        Object objValue = this._get(DTOFIELD_ACTIONTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTag4Dirty() {
        return this._contains(DTOFIELD_ACTIONTAG4);
    }

    @JsonIgnore
    public void resetActionTag4() {
        this._reset(DTOFIELD_ACTIONTAG4);
    }

    @JsonIgnore
    public PSDEActionDTO actiontag4(String actionTag4) {
        this.setActionTag4(actionTag4);
        return this;
    }

    @JsonProperty(value="actiontype")
    public void setActionType(String actionType) {
        this._set(DTOFIELD_ACTIONTYPE, actionType);
    }

    @JsonIgnore
    public String getActionType() {
        Object objValue = this._get(DTOFIELD_ACTIONTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionTypeDirty() {
        return this._contains(DTOFIELD_ACTIONTYPE);
    }

    @JsonIgnore
    public void resetActionType() {
        this._reset(DTOFIELD_ACTIONTYPE);
    }

    @JsonIgnore
    public PSDEActionDTO actiontype(String actionType) {
        this.setActionType(actionType);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO actiontype(PSModelEnums.DEActionType actionType) {
        if (actionType == null) {
            this.setActionType(null);
        } else {
            this.setActionType(actionType.value);
        }
        return this;
    }

    @JsonProperty(value="aftercode")
    public void setAfterCode(String afterCode) {
        this._set(DTOFIELD_AFTERCODE, afterCode);
    }

    @JsonIgnore
    public String getAfterCode() {
        Object objValue = this._get(DTOFIELD_AFTERCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAfterCodeDirty() {
        return this._contains(DTOFIELD_AFTERCODE);
    }

    @JsonIgnore
    public void resetAfterCode() {
        this._reset(DTOFIELD_AFTERCODE);
    }

    @JsonIgnore
    public PSDEActionDTO aftercode(String afterCode) {
        this.setAfterCode(afterCode);
        return this;
    }

    @JsonProperty(value="batchactionmode")
    public void setBatchActionMode(Integer batchActionMode) {
        this._set(DTOFIELD_BATCHACTIONMODE, batchActionMode);
    }

    @JsonIgnore
    public Integer getBatchActionMode() {
        Object objValue = this._get(DTOFIELD_BATCHACTIONMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBatchActionModeDirty() {
        return this._contains(DTOFIELD_BATCHACTIONMODE);
    }

    @JsonIgnore
    public void resetBatchActionMode() {
        this._reset(DTOFIELD_BATCHACTIONMODE);
    }

    @JsonIgnore
    public PSDEActionDTO batchactionmode(Integer batchActionMode) {
        this.setBatchActionMode(batchActionMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO batchactionmode(PSModelEnums.DEActionBatchMode batchActionMode) {
        if (batchActionMode == null) {
            this.setBatchActionMode(null);
        } else {
            this.setBatchActionMode(batchActionMode.value);
        }
        return this;
    }

    @JsonProperty(value="beforecode")
    public void setBeforeCode(String beforeCode) {
        this._set(DTOFIELD_BEFORECODE, beforeCode);
    }

    @JsonIgnore
    public String getBeforeCode() {
        Object objValue = this._get(DTOFIELD_BEFORECODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBeforeCodeDirty() {
        return this._contains(DTOFIELD_BEFORECODE);
    }

    @JsonIgnore
    public void resetBeforeCode() {
        this._reset(DTOFIELD_BEFORECODE);
    }

    @JsonIgnore
    public PSDEActionDTO beforecode(String beforeCode) {
        this.setBeforeCode(beforeCode);
        return this;
    }

    @JsonProperty(value="cachecat")
    public void setCacheCat(String cacheCat) {
        this._set(DTOFIELD_CACHECAT, cacheCat);
    }

    @JsonIgnore
    public String getCacheCat() {
        Object objValue = this._get(DTOFIELD_CACHECAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheCatDirty() {
        return this._contains(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public void resetCacheCat() {
        this._reset(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public PSDEActionDTO cachecat(String cacheCat) {
        this.setCacheCat(cacheCat);
        return this;
    }

    @JsonProperty(value="cachescope")
    public void setCacheScope(String cacheScope) {
        this._set(DTOFIELD_CACHESCOPE, cacheScope);
    }

    @JsonIgnore
    public String getCacheScope() {
        Object objValue = this._get(DTOFIELD_CACHESCOPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheScopeDirty() {
        return this._contains(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public void resetCacheScope() {
        this._reset(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public PSDEActionDTO cachescope(String cacheScope) {
        this.setCacheScope(cacheScope);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO cachescope(PSModelEnums.DECacheScope cacheScope) {
        if (cacheScope == null) {
            this.setCacheScope(null);
        } else {
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    @JsonProperty(value="cachetag")
    public void setCacheTag(String cacheTag) {
        this._set(DTOFIELD_CACHETAG, cacheTag);
    }

    @JsonIgnore
    public String getCacheTag() {
        Object objValue = this._get(DTOFIELD_CACHETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheTagDirty() {
        return this._contains(DTOFIELD_CACHETAG);
    }

    @JsonIgnore
    public void resetCacheTag() {
        this._reset(DTOFIELD_CACHETAG);
    }

    @JsonIgnore
    public PSDEActionDTO cachetag(String cacheTag) {
        this.setCacheTag(cacheTag);
        return this;
    }

    @JsonProperty(value="cachetimeout")
    public void setCacheTimeout(Integer cacheTimeout) {
        this._set(DTOFIELD_CACHETIMEOUT, cacheTimeout);
    }

    @JsonIgnore
    public Integer getCacheTimeout() {
        Object objValue = this._get(DTOFIELD_CACHETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheTimeoutDirty() {
        return this._contains(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public void resetCacheTimeout() {
        this._reset(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public PSDEActionDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    @JsonProperty(value="callerobj")
    public void setCallerObj(String callerObj) {
        this._set(DTOFIELD_CALLEROBJ, callerObj);
    }

    @JsonIgnore
    public String getCallerObj() {
        Object objValue = this._get(DTOFIELD_CALLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallerObjDirty() {
        return this._contains(DTOFIELD_CALLEROBJ);
    }

    @JsonIgnore
    public void resetCallerObj() {
        this._reset(DTOFIELD_CALLEROBJ);
    }

    @JsonIgnore
    public PSDEActionDTO callerobj(String callerObj) {
        this.setCallerObj(callerObj);
        return this;
    }

    @JsonProperty(value="calltimeout")
    public void setCallTimeout(Integer callTimeout) {
        this._set(DTOFIELD_CALLTIMEOUT, callTimeout);
    }

    @JsonIgnore
    public Integer getCallTimeout() {
        Object objValue = this._get(DTOFIELD_CALLTIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCallTimeoutDirty() {
        return this._contains(DTOFIELD_CALLTIMEOUT);
    }

    @JsonIgnore
    public void resetCallTimeout() {
        this._reset(DTOFIELD_CALLTIMEOUT);
    }

    @JsonIgnore
    public PSDEActionDTO calltimeout(Integer callTimeout) {
        this.setCallTimeout(callTimeout);
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
    public PSDEActionDTO codename(String codeName) {
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
    public PSDEActionDTO createdate(Timestamp createDate) {
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
    public PSDEActionDTO createman(String createMan) {
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
    public PSDEActionDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDEActionDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="enableaudit")
    public void setEnableAudit(Integer enableAudit) {
        this._set(DTOFIELD_ENABLEAUDIT, enableAudit);
    }

    @JsonIgnore
    public Integer getEnableAudit() {
        Object objValue = this._get(DTOFIELD_ENABLEAUDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAuditDirty() {
        return this._contains(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public void resetEnableAudit() {
        this._reset(DTOFIELD_ENABLEAUDIT);
    }

    @JsonIgnore
    public PSDEActionDTO enableaudit(Integer enableAudit) {
        this.setEnableAudit(enableAudit);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO enableaudit(Boolean enableAudit) {
        if (enableAudit == null) {
            this.setEnableAudit(null);
        } else {
            this.setEnableAudit(enableAudit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablecache")
    public void setEnableCache(Integer enableCache) {
        this._set(DTOFIELD_ENABLECACHE, enableCache);
    }

    @JsonIgnore
    public Integer getEnableCache() {
        Object objValue = this._get(DTOFIELD_ENABLECACHE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCacheDirty() {
        return this._contains(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public void resetEnableCache() {
        this._reset(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public PSDEActionDTO enablecache(Integer enableCache) {
        this.setEnableCache(enableCache);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO enablecache(Boolean enableCache) {
        if (enableCache == null) {
            this.setEnableCache(null);
        } else {
            this.setEnableCache(enableCache != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEActionDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="finishflag")
    public void setFinishFlag(Integer finishFlag) {
        this._set(DTOFIELD_FINISHFLAG, finishFlag);
    }

    @JsonIgnore
    public Integer getFinishFlag() {
        Object objValue = this._get(DTOFIELD_FINISHFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFinishFlagDirty() {
        return this._contains(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public void resetFinishFlag() {
        this._reset(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public PSDEActionDTO finishflag(Integer finishFlag) {
        this.setFinishFlag(finishFlag);
        return this;
    }

    @JsonProperty(value="inpsdefgroupid")
    public void setInPSDEFGroupId(String inPSDEFGroupId) {
        this._set(DTOFIELD_INPSDEFGROUPID, inPSDEFGroupId);
    }

    @JsonIgnore
    public String getInPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_INPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_INPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetInPSDEFGroupId() {
        this._reset(DTOFIELD_INPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEActionDTO inpsdefgroupid(String inPSDEFGroupId) {
        this.setInPSDEFGroupId(inPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO inpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setInPSDEFGroupId(null);
            this.setInPSDEFGroupName(null);
        } else {
            this.setInPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setInPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="inpsdefgroupname")
    public void setInPSDEFGroupName(String inPSDEFGroupName) {
        this._set(DTOFIELD_INPSDEFGROUPNAME, inPSDEFGroupName);
    }

    @JsonIgnore
    public String getInPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_INPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_INPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetInPSDEFGroupName() {
        this._reset(DTOFIELD_INPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEActionDTO inpsdefgroupname(String inPSDEFGroupName) {
        this.setInPSDEFGroupName(inPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="inpsdesampledataid")
    public void setInPSDESampleDataId(String inPSDESampleDataId) {
        this._set(DTOFIELD_INPSDESAMPLEDATAID, inPSDESampleDataId);
    }

    @JsonIgnore
    public String getInPSDESampleDataId() {
        Object objValue = this._get(DTOFIELD_INPSDESAMPLEDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDESampleDataIdDirty() {
        return this._contains(DTOFIELD_INPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public void resetInPSDESampleDataId() {
        this._reset(DTOFIELD_INPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public PSDEActionDTO inpsdesampledataid(String inPSDESampleDataId) {
        this.setInPSDESampleDataId(inPSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO inpsdesampledataid(PSDESampleDataDTO pSDESampleData) {
        if (pSDESampleData == null) {
            this.setInPSDESampleDataId(null);
            this.setInPSDESampleDataName(null);
        } else {
            this.setInPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setInPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    @JsonProperty(value="inpsdesampledataname")
    public void setInPSDESampleDataName(String inPSDESampleDataName) {
        this._set(DTOFIELD_INPSDESAMPLEDATANAME, inPSDESampleDataName);
    }

    @JsonIgnore
    public String getInPSDESampleDataName() {
        Object objValue = this._get(DTOFIELD_INPSDESAMPLEDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDESampleDataNameDirty() {
        return this._contains(DTOFIELD_INPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public void resetInPSDESampleDataName() {
        this._reset(DTOFIELD_INPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public PSDEActionDTO inpsdesampledataname(String inPSDESampleDataName) {
        this.setInPSDESampleDataName(inPSDESampleDataName);
        return this;
    }

    @JsonProperty(value="inpssysdynamodelid")
    public void setInPSSysDynaModelId(String inPSSysDynaModelId) {
        this._set(DTOFIELD_INPSSYSDYNAMODELID, inPSSysDynaModelId);
    }

    @JsonIgnore
    public String getInPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_INPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_INPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetInPSSysDynaModelId() {
        this._reset(DTOFIELD_INPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelid(String inPSSysDynaModelId) {
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setInPSSysDynaModelId(null);
            this.setInPSSysDynaModelName(null);
        } else {
            this.setInPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setInPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="inpssysdynamodelname")
    public void setInPSSysDynaModelName(String inPSSysDynaModelName) {
        this._set(DTOFIELD_INPSSYSDYNAMODELNAME, inPSSysDynaModelName);
    }

    @JsonIgnore
    public String getInPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_INPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_INPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetInPSSysDynaModelName() {
        this._reset(DTOFIELD_INPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEActionDTO inpssysdynamodelname(String inPSSysDynaModelName) {
        this.setInPSSysDynaModelName(inPSSysDynaModelName);
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
    public PSDEActionDTO logicname(String logicName) {
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
    public PSDEActionDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="needresourcekey")
    public void setNeedResourceKey(Integer needResourceKey) {
        this._set(DTOFIELD_NEEDRESOURCEKEY, needResourceKey);
    }

    @JsonIgnore
    public Integer getNeedResourceKey() {
        Object objValue = this._get(DTOFIELD_NEEDRESOURCEKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNeedResourceKeyDirty() {
        return this._contains(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public void resetNeedResourceKey() {
        this._reset(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public PSDEActionDTO needresourcekey(Integer needResourceKey) {
        this.setNeedResourceKey(needResourceKey);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO needresourcekey(Boolean needResourceKey) {
        if (needResourceKey == null) {
            this.setNeedResourceKey(null);
        } else {
            this.setNeedResourceKey(needResourceKey != false ? 1 : 0);
        }
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
    public PSDEActionDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="outpsdefgroupid")
    public void setOutPSDEFGroupId(String outPSDEFGroupId) {
        this._set(DTOFIELD_OUTPSDEFGROUPID, outPSDEFGroupId);
    }

    @JsonIgnore
    public String getOutPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_OUTPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_OUTPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetOutPSDEFGroupId() {
        this._reset(DTOFIELD_OUTPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEActionDTO outpsdefgroupid(String outPSDEFGroupId) {
        this.setOutPSDEFGroupId(outPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO outpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setOutPSDEFGroupId(null);
            this.setOutPSDEFGroupName(null);
        } else {
            this.setOutPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setOutPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="outpsdefgroupname")
    public void setOutPSDEFGroupName(String outPSDEFGroupName) {
        this._set(DTOFIELD_OUTPSDEFGROUPNAME, outPSDEFGroupName);
    }

    @JsonIgnore
    public String getOutPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_OUTPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_OUTPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetOutPSDEFGroupName() {
        this._reset(DTOFIELD_OUTPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEActionDTO outpsdefgroupname(String outPSDEFGroupName) {
        this.setOutPSDEFGroupName(outPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="outpsdesampledataid")
    public void setOutPSDESampleDataId(String outPSDESampleDataId) {
        this._set(DTOFIELD_OUTPSDESAMPLEDATAID, outPSDESampleDataId);
    }

    @JsonIgnore
    public String getOutPSDESampleDataId() {
        Object objValue = this._get(DTOFIELD_OUTPSDESAMPLEDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDESampleDataIdDirty() {
        return this._contains(DTOFIELD_OUTPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public void resetOutPSDESampleDataId() {
        this._reset(DTOFIELD_OUTPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public PSDEActionDTO outpsdesampledataid(String outPSDESampleDataId) {
        this.setOutPSDESampleDataId(outPSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO outpsdesampledataid(PSDESampleDataDTO pSDESampleData) {
        if (pSDESampleData == null) {
            this.setOutPSDESampleDataId(null);
            this.setOutPSDESampleDataName(null);
        } else {
            this.setOutPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setOutPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    @JsonProperty(value="outpsdesampledataname")
    public void setOutPSDESampleDataName(String outPSDESampleDataName) {
        this._set(DTOFIELD_OUTPSDESAMPLEDATANAME, outPSDESampleDataName);
    }

    @JsonIgnore
    public String getOutPSDESampleDataName() {
        Object objValue = this._get(DTOFIELD_OUTPSDESAMPLEDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDESampleDataNameDirty() {
        return this._contains(DTOFIELD_OUTPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public void resetOutPSDESampleDataName() {
        this._reset(DTOFIELD_OUTPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public PSDEActionDTO outpsdesampledataname(String outPSDESampleDataName) {
        this.setOutPSDESampleDataName(outPSDESampleDataName);
        return this;
    }

    @JsonProperty(value="outpssysdynamodelid")
    public void setOutPSSysDynaModelId(String outPSSysDynaModelId) {
        this._set(DTOFIELD_OUTPSSYSDYNAMODELID, outPSSysDynaModelId);
    }

    @JsonIgnore
    public String getOutPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetOutPSSysDynaModelId() {
        this._reset(DTOFIELD_OUTPSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelid(String outPSSysDynaModelId) {
        this.setOutPSSysDynaModelId(outPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setOutPSSysDynaModelId(null);
            this.setOutPSSysDynaModelName(null);
        } else {
            this.setOutPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setOutPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="outpssysdynamodelname")
    public void setOutPSSysDynaModelName(String outPSSysDynaModelName) {
        this._set(DTOFIELD_OUTPSSYSDYNAMODELNAME, outPSSysDynaModelName);
    }

    @JsonIgnore
    public String getOutPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_OUTPSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_OUTPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetOutPSSysDynaModelName() {
        this._reset(DTOFIELD_OUTPSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEActionDTO outpssysdynamodelname(String outPSSysDynaModelName) {
        this.setOutPSSysDynaModelName(outPSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="outrefpsdefgroupid")
    public void setOutRefPSDEFGroupId(String outRefPSDEFGroupId) {
        this._set(DTOFIELD_OUTREFPSDEFGROUPID, outRefPSDEFGroupId);
    }

    @JsonIgnore
    public String getOutRefPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_OUTREFPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutRefPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_OUTREFPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetOutRefPSDEFGroupId() {
        this._reset(DTOFIELD_OUTREFPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupid(String outRefPSDEFGroupId) {
        this.setOutRefPSDEFGroupId(outRefPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setOutRefPSDEFGroupId(null);
            this.setOutRefPSDEFGroupName(null);
        } else {
            this.setOutRefPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setOutRefPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="outrefpsdefgroupname")
    public void setOutRefPSDEFGroupName(String outRefPSDEFGroupName) {
        this._set(DTOFIELD_OUTREFPSDEFGROUPNAME, outRefPSDEFGroupName);
    }

    @JsonIgnore
    public String getOutRefPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_OUTREFPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutRefPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_OUTREFPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetOutRefPSDEFGroupName() {
        this._reset(DTOFIELD_OUTREFPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdefgroupname(String outRefPSDEFGroupName) {
        this.setOutRefPSDEFGroupName(outRefPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="outrefpsdeid")
    public void setOutRefPSDEId(String outRefPSDEId) {
        this._set(DTOFIELD_OUTREFPSDEID, outRefPSDEId);
    }

    @JsonIgnore
    public String getOutRefPSDEId() {
        Object objValue = this._get(DTOFIELD_OUTREFPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutRefPSDEIdDirty() {
        return this._contains(DTOFIELD_OUTREFPSDEID);
    }

    @JsonIgnore
    public void resetOutRefPSDEId() {
        this._reset(DTOFIELD_OUTREFPSDEID);
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdeid(String outRefPSDEId) {
        this.setOutRefPSDEId(outRefPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setOutRefPSDEId(null);
            this.setOutRefPSDEName(null);
        } else {
            this.setOutRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setOutRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="outrefpsdename")
    public void setOutRefPSDEName(String outRefPSDEName) {
        this._set(DTOFIELD_OUTREFPSDENAME, outRefPSDEName);
    }

    @JsonIgnore
    public String getOutRefPSDEName() {
        Object objValue = this._get(DTOFIELD_OUTREFPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutRefPSDENameDirty() {
        return this._contains(DTOFIELD_OUTREFPSDENAME);
    }

    @JsonIgnore
    public void resetOutRefPSDEName() {
        this._reset(DTOFIELD_OUTREFPSDENAME);
    }

    @JsonIgnore
    public PSDEActionDTO outrefpsdename(String outRefPSDEName) {
        this.setOutRefPSDEName(outRefPSDEName);
        return this;
    }

    @JsonProperty(value="paramtype")
    public void setParamType(Integer paramType) {
        this._set(DTOFIELD_PARAMTYPE, paramType);
    }

    @JsonIgnore
    public Integer getParamType() {
        Object objValue = this._get(DTOFIELD_PARAMTYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSDEActionDTO paramtype(Integer paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO paramtype(PSModelEnums.DEActionParamMode paramType) {
        if (paramType == null) {
            this.setParamType(null);
        } else {
            this.setParamType(paramType.value);
        }
        return this;
    }

    @JsonProperty(value="potime")
    public void setPOTime(Integer pOTime) {
        this._set(DTOFIELD_POTIME, pOTime);
    }

    @JsonIgnore
    public Integer getPOTime() {
        Object objValue = this._get(DTOFIELD_POTIME);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPOTimeDirty() {
        return this._contains(DTOFIELD_POTIME);
    }

    @JsonIgnore
    public void resetPOTime() {
        this._reset(DTOFIELD_POTIME);
    }

    @JsonIgnore
    public PSDEActionDTO potime(Integer pOTime) {
        this.setPOTime(pOTime);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSDEActionDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonProperty(value="predefinedtypeparam")
    public void setPredefinedTypeParam(String predefinedTypeParam) {
        this._set(DTOFIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }

    @JsonIgnore
    public String getPredefinedTypeParam() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeParamDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public void resetPredefinedTypeParam() {
        this._reset(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public PSDEActionDTO predefinedtypeparam(String predefinedTypeParam) {
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    @JsonProperty(value="predefinedtypetext")
    public void setPredefinedTypeText(String predefinedTypeText) {
        this._set(DTOFIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }

    @JsonIgnore
    public String getPredefinedTypeText() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeTextDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public void resetPredefinedTypeText() {
        this._reset(DTOFIELD_PREDEFINEDTYPETEXT);
    }

    @JsonIgnore
    public PSDEActionDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDEActionDTO preparelast(Integer prepareLast) {
        this.setPrepareLast(prepareLast);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO preparelast(PSModelEnums.DEActionPrepareLastMode prepareLast) {
        if (prepareLast == null) {
            this.setPrepareLast(null);
        } else {
            this.setPrepareLast(prepareLast.value);
        }
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
    public PSDEActionDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
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
    public PSDEActionDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEActionName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEActionName(strName);
    }

    @JsonIgnore
    public PSDEActionDTO name(String strName) {
        this.setPSDEActionName(strName);
        return this;
    }

    @JsonProperty(value="psdeactiontemplid")
    public void setPSDEActionTemplId(String pSDEActionTemplId) {
        this._set(DTOFIELD_PSDEACTIONTEMPLID, pSDEActionTemplId);
    }

    @JsonIgnore
    public String getPSDEActionTemplId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionTemplIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONTEMPLID);
    }

    @JsonIgnore
    public void resetPSDEActionTemplId() {
        this._reset(DTOFIELD_PSDEACTIONTEMPLID);
    }

    @JsonIgnore
    public PSDEActionDTO psdeactiontemplid(String pSDEActionTemplId) {
        this.setPSDEActionTemplId(pSDEActionTemplId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdeactiontemplid(PSDEActionTemplDTO pSDEActionTempl) {
        if (pSDEActionTempl == null) {
            this.setPSDEActionTemplId(null);
            this.setPSDEActionTemplName(null);
        } else {
            this.setPSDEActionTemplId(pSDEActionTempl.getPSDEActionTemplId());
            this.setPSDEActionTemplName(pSDEActionTempl.getPSDEActionTemplName());
        }
        return this;
    }

    @JsonProperty(value="psdeactiontemplname")
    public void setPSDEActionTemplName(String pSDEActionTemplName) {
        this._set(DTOFIELD_PSDEACTIONTEMPLNAME, pSDEActionTemplName);
    }

    @JsonIgnore
    public String getPSDEActionTemplName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionTemplNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDEActionTemplName() {
        this._reset(DTOFIELD_PSDEACTIONTEMPLNAME);
    }

    @JsonIgnore
    public PSDEActionDTO psdeactiontemplname(String pSDEActionTemplName) {
        this.setPSDEActionTemplName(pSDEActionTemplName);
        return this;
    }

    @JsonProperty(value="psdedataflowid")
    public void setPSDEDataFlowId(String pSDEDataFlowId) {
        this._set(DTOFIELD_PSDEDATAFLOWID, pSDEDataFlowId);
    }

    @JsonIgnore
    public String getPSDEDataFlowId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAFLOWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataFlowIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAFLOWID);
    }

    @JsonIgnore
    public void resetPSDEDataFlowId() {
        this._reset(DTOFIELD_PSDEDATAFLOWID);
    }

    @JsonIgnore
    public PSDEActionDTO psdedataflowid(String pSDEDataFlowId) {
        this.setPSDEDataFlowId(pSDEDataFlowId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdedataflowid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDEDataFlowId(null);
            this.setPSDEDataFlowName(null);
        } else {
            this.setPSDEDataFlowId(pSDELogic.getPSDELogicId());
            this.setPSDEDataFlowName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdedataflowname")
    public void setPSDEDataFlowName(String pSDEDataFlowName) {
        this._set(DTOFIELD_PSDEDATAFLOWNAME, pSDEDataFlowName);
    }

    @JsonIgnore
    public String getPSDEDataFlowName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAFLOWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataFlowNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAFLOWNAME);
    }

    @JsonIgnore
    public void resetPSDEDataFlowName() {
        this._reset(DTOFIELD_PSDEDATAFLOWNAME);
    }

    @JsonIgnore
    public PSDEActionDTO psdedataflowname(String pSDEDataFlowName) {
        this.setPSDEDataFlowName(pSDEDataFlowName);
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
    public PSDEActionDTO psdedataqueryid(String pSDEDataQueryId) {
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdedataqueryid(PSDEDataQueryDTO pSDEDataQuery) {
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
    public PSDEActionDTO psdedataqueryname(String pSDEDataQueryName) {
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
    public PSDEActionDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEActionDTO psdedatasetname(String pSDEDataSetName) {
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
    public PSDEActionDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSSubSysSADEId(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSSubSysSADEId(pSDataEntity.getPSSubSysSADEId());
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
    public PSDEActionDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEActionDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSDEActionDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEActionDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEActionDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="psdesysprocid")
    public void setPSDESysProcId(String pSDESysProcId) {
        this._set(DTOFIELD_PSDESYSPROCID, pSDESysProcId);
    }

    @JsonIgnore
    public String getPSDESysProcId() {
        Object objValue = this._get(DTOFIELD_PSDESYSPROCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESysProcIdDirty() {
        return this._contains(DTOFIELD_PSDESYSPROCID);
    }

    @JsonIgnore
    public void resetPSDESysProcId() {
        this._reset(DTOFIELD_PSDESYSPROCID);
    }

    @JsonIgnore
    public PSDEActionDTO psdesysprocid(String pSDESysProcId) {
        this.setPSDESysProcId(pSDESysProcId);
        return this;
    }

    @JsonProperty(value="psdesysprocname")
    public void setPSDESysProcName(String pSDESysProcName) {
        this._set(DTOFIELD_PSDESYSPROCNAME, pSDESysProcName);
    }

    @JsonIgnore
    public String getPSDESysProcName() {
        Object objValue = this._get(DTOFIELD_PSDESYSPROCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESysProcNameDirty() {
        return this._contains(DTOFIELD_PSDESYSPROCNAME);
    }

    @JsonIgnore
    public void resetPSDESysProcName() {
        this._reset(DTOFIELD_PSDESYSPROCNAME);
    }

    @JsonIgnore
    public PSDEActionDTO psdesysprocname(String pSDESysProcName) {
        this.setPSDESysProcName(pSDESysProcName);
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
    public PSDEActionDTO pssubsyssadeid(String pSSubSysSADEId) {
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    @JsonProperty(value="pssubsyssadetailid")
    public void setPSSubSysSADetailId(String pSSubSysSADetailId) {
        this._set(DTOFIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }

    @JsonIgnore
    public String getPSSubSysSADetailId() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailId() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILID);
    }

    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailid(String pSSubSysSADetailId) {
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail) {
        if (pSSubSysSADetail == null) {
            this.setPSSubSysSADetailId(null);
            this.setPSSubSysSADetailName(null);
        } else {
            this.setPSSubSysSADetailId(pSSubSysSADetail.getPSSubSysSADetailId());
            this.setPSSubSysSADetailName(pSSubSysSADetail.getPSSubSysSADetailName());
        }
        return this;
    }

    @JsonProperty(value="pssubsyssadetailname")
    public void setPSSubSysSADetailName(String pSSubSysSADetailName) {
        this._set(DTOFIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }

    @JsonIgnore
    public String getPSSubSysSADetailName() {
        Object objValue = this._get(DTOFIELD_PSSUBSYSSADETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty() {
        return this._contains(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public void resetPSSubSysSADetailName() {
        this._reset(DTOFIELD_PSSUBSYSSADETAILNAME);
    }

    @JsonIgnore
    public PSDEActionDTO pssubsyssadetailname(String pSSubSysSADetailName) {
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSDEActionDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSDEActionDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDEActionDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEActionDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSDEActionDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSDEActionDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDEActionDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEActionDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysunistateid")
    public void setPSSysUniStateId(String pSSysUniStateId) {
        this._set(DTOFIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }

    @JsonIgnore
    public String getPSSysUniStateId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public void resetPSSysUniStateId() {
        this._reset(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public PSDEActionDTO pssysunistateid(String pSSysUniStateId) {
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pssysunistateid(PSSysUniStateDTO pSSysUniState) {
        if (pSSysUniState == null) {
            this.setPSSysUniStateId(null);
            this.setPSSysUniStateName(null);
        } else {
            this.setPSSysUniStateId(pSSysUniState.getPSSysUniStateId());
            this.setPSSysUniStateName(pSSysUniState.getPSSysUniStateName());
        }
        return this;
    }

    @JsonProperty(value="pssysunistatename")
    public void setPSSysUniStateName(String pSSysUniStateName) {
        this._set(DTOFIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }

    @JsonIgnore
    public String getPSSysUniStateName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public void resetPSSysUniStateName() {
        this._reset(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public PSDEActionDTO pssysunistatename(String pSSysUniStateName) {
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonProperty(value="pubmode")
    public void setPubMode(Integer pubMode) {
        this._set(DTOFIELD_PUBMODE, pubMode);
    }

    @JsonIgnore
    public Integer getPubMode() {
        Object objValue = this._get(DTOFIELD_PUBMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubModeDirty() {
        return this._contains(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public void resetPubMode() {
        this._reset(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public PSDEActionDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO pubmode(Boolean pubMode) {
        if (pubMode == null) {
            this.setPubMode(null);
        } else {
            this.setPubMode(pubMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="rawservicemethod")
    public void setRawServiceMethod(String rawServiceMethod) {
        this._set(DTOFIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }

    @JsonIgnore
    public String getRawServiceMethod() {
        Object objValue = this._get(DTOFIELD_RAWSERVICEMETHOD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawServiceMethodDirty() {
        return this._contains(DTOFIELD_RAWSERVICEMETHOD);
    }

    @JsonIgnore
    public void resetRawServiceMethod() {
        this._reset(DTOFIELD_RAWSERVICEMETHOD);
    }

    @JsonIgnore
    public PSDEActionDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
        if (rawServiceMethod == null) {
            this.setRawServiceMethod(null);
        } else {
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    @JsonProperty(value="rawserviceurl")
    public void setRawServiceUrl(String rawServiceUrl) {
        this._set(DTOFIELD_RAWSERVICEURL, rawServiceUrl);
    }

    @JsonIgnore
    public String getRawServiceUrl() {
        Object objValue = this._get(DTOFIELD_RAWSERVICEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawServiceUrlDirty() {
        return this._contains(DTOFIELD_RAWSERVICEURL);
    }

    @JsonIgnore
    public void resetRawServiceUrl() {
        this._reset(DTOFIELD_RAWSERVICEURL);
    }

    @JsonIgnore
    public PSDEActionDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    @JsonProperty(value="requestfield")
    public void setRequestField(String requestField) {
        this._set(DTOFIELD_REQUESTFIELD, requestField);
    }

    @JsonIgnore
    public String getRequestField() {
        Object objValue = this._get(DTOFIELD_REQUESTFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestFieldDirty() {
        return this._contains(DTOFIELD_REQUESTFIELD);
    }

    @JsonIgnore
    public void resetRequestField() {
        this._reset(DTOFIELD_REQUESTFIELD);
    }

    @JsonIgnore
    public PSDEActionDTO requestfield(String requestField) {
        this.setRequestField(requestField);
        return this;
    }

    @JsonProperty(value="requestmethod")
    public void setRequestMethod(String requestMethod) {
        this._set(DTOFIELD_REQUESTMETHOD, requestMethod);
    }

    @JsonIgnore
    public String getRequestMethod() {
        Object objValue = this._get(DTOFIELD_REQUESTMETHOD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestMethodDirty() {
        return this._contains(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public void resetRequestMethod() {
        this._reset(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public PSDEActionDTO requestmethod(String requestMethod) {
        this.setRequestMethod(requestMethod);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO requestmethod(PSModelEnums.RequestMethod requestMethod) {
        if (requestMethod == null) {
            this.setRequestMethod(null);
        } else {
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    @JsonProperty(value="requestparamtype")
    public void setRequestParamType(String requestParamType) {
        this._set(DTOFIELD_REQUESTPARAMTYPE, requestParamType);
    }

    @JsonIgnore
    public String getRequestParamType() {
        Object objValue = this._get(DTOFIELD_REQUESTPARAMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestParamTypeDirty() {
        return this._contains(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public void resetRequestParamType() {
        this._reset(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public PSDEActionDTO requestparamtype(String requestParamType) {
        this.setRequestParamType(requestParamType);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO requestparamtype(PSModelEnums.ServiceReqParamType requestParamType) {
        if (requestParamType == null) {
            this.setRequestParamType(null);
        } else {
            this.setRequestParamType(requestParamType.value);
        }
        return this;
    }

    @JsonProperty(value="requestpath")
    public void setRequestPath(String requestPath) {
        this._set(DTOFIELD_REQUESTPATH, requestPath);
    }

    @JsonIgnore
    public String getRequestPath() {
        Object objValue = this._get(DTOFIELD_REQUESTPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestPathDirty() {
        return this._contains(DTOFIELD_REQUESTPATH);
    }

    @JsonIgnore
    public void resetRequestPath() {
        this._reset(DTOFIELD_REQUESTPATH);
    }

    @JsonIgnore
    public PSDEActionDTO requestpath(String requestPath) {
        this.setRequestPath(requestPath);
        return this;
    }

    @JsonProperty(value="retstddatatype")
    public void setRetStdDataType(Integer retStdDataType) {
        this._set(DTOFIELD_RETSTDDATATYPE, retStdDataType);
    }

    @JsonIgnore
    public Integer getRetStdDataType() {
        Object objValue = this._get(DTOFIELD_RETSTDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRetStdDataTypeDirty() {
        return this._contains(DTOFIELD_RETSTDDATATYPE);
    }

    @JsonIgnore
    public void resetRetStdDataType() {
        this._reset(DTOFIELD_RETSTDDATATYPE);
    }

    @JsonIgnore
    public PSDEActionDTO retstddatatype(Integer retStdDataType) {
        this.setRetStdDataType(retStdDataType);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO retstddatatype(PSModelEnums.StdDataType retStdDataType) {
        if (retStdDataType == null) {
            this.setRetStdDataType(null);
        } else {
            this.setRetStdDataType(retStdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="retvaltype")
    public void setRetValType(String retValType) {
        this._set(DTOFIELD_RETVALTYPE, retValType);
    }

    @JsonIgnore
    public String getRetValType() {
        Object objValue = this._get(DTOFIELD_RETVALTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetValTypeDirty() {
        return this._contains(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public void resetRetValType() {
        this._reset(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public PSDEActionDTO retvaltype(String retValType) {
        this.setRetValType(retValType);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO retvaltype(PSModelEnums.DEActionRetType retValType) {
        if (retValType == null) {
            this.setRetValType(null);
        } else {
            this.setRetValType(retValType.value);
        }
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public void resetServiceCodeName() {
        this._reset(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public PSDEActionDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    @JsonProperty(value="subsyssadetailmode")
    public void setSubSysSADetailMode(Integer subSysSADetailMode) {
        this._set(DTOFIELD_SUBSYSSADETAILMODE, subSysSADetailMode);
    }

    @JsonIgnore
    public Integer getSubSysSADetailMode() {
        Object objValue = this._get(DTOFIELD_SUBSYSSADETAILMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSubSysSADetailModeDirty() {
        return this._contains(DTOFIELD_SUBSYSSADETAILMODE);
    }

    @JsonIgnore
    public void resetSubSysSADetailMode() {
        this._reset(DTOFIELD_SUBSYSSADETAILMODE);
    }

    @JsonIgnore
    public PSDEActionDTO subsyssadetailmode(Integer subSysSADetailMode) {
        this.setSubSysSADetailMode(subSysSADetailMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO subsyssadetailmode(PSModelEnums.SubSysSADEMethodBindingMode subSysSADetailMode) {
        if (subSysSADetailMode == null) {
            this.setSubSysSADetailMode(null);
        } else {
            this.setSubSysSADetailMode(subSysSADetailMode.value);
        }
        return this;
    }

    @JsonProperty(value="syncevent")
    public void setSyncEvent(Integer syncEvent) {
        this._set(DTOFIELD_SYNCEVENT, syncEvent);
    }

    @JsonIgnore
    public Integer getSyncEvent() {
        Object objValue = this._get(DTOFIELD_SYNCEVENT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSyncEventDirty() {
        return this._contains(DTOFIELD_SYNCEVENT);
    }

    @JsonIgnore
    public void resetSyncEvent() {
        this._reset(DTOFIELD_SYNCEVENT);
    }

    @JsonIgnore
    public PSDEActionDTO syncevent(Integer syncEvent) {
        this.setSyncEvent(syncEvent);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO syncevent(PSModelEnums.DEActionSyncEvent syncEvent) {
        if (syncEvent == null) {
            this.setSyncEvent(null);
        } else {
            this.setSyncEvent(syncEvent.value);
        }
        return this;
    }

    @JsonProperty(value="testactionmode")
    public void setTestActionMode(Integer testActionMode) {
        this._set(DTOFIELD_TESTACTIONMODE, testActionMode);
    }

    @JsonIgnore
    public Integer getTestActionMode() {
        Object objValue = this._get(DTOFIELD_TESTACTIONMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTestActionModeDirty() {
        return this._contains(DTOFIELD_TESTACTIONMODE);
    }

    @JsonIgnore
    public void resetTestActionMode() {
        this._reset(DTOFIELD_TESTACTIONMODE);
    }

    @JsonIgnore
    public PSDEActionDTO testactionmode(Integer testActionMode) {
        this.setTestActionMode(testActionMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO testactionmode(PSModelEnums.DEActionTestActionMode testActionMode) {
        if (testActionMode == null) {
            this.setTestActionMode(null);
        } else {
            this.setTestActionMode(testActionMode.value);
        }
        return this;
    }

    @JsonProperty(value="testcaseflag")
    public void setTestCaseFlag(Integer testCaseFlag) {
        this._set(DTOFIELD_TESTCASEFLAG, testCaseFlag);
    }

    @JsonIgnore
    public Integer getTestCaseFlag() {
        Object objValue = this._get(DTOFIELD_TESTCASEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTestCaseFlagDirty() {
        return this._contains(DTOFIELD_TESTCASEFLAG);
    }

    @JsonIgnore
    public void resetTestCaseFlag() {
        this._reset(DTOFIELD_TESTCASEFLAG);
    }

    @JsonIgnore
    public PSDEActionDTO testcaseflag(Integer testCaseFlag) {
        this.setTestCaseFlag(testCaseFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO testcaseflag(Boolean testCaseFlag) {
        if (testCaseFlag == null) {
            this.setTestCaseFlag(null);
        } else {
            this.setTestCaseFlag(testCaseFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tsmode")
    public void setTSMode(String tSMode) {
        this._set(DTOFIELD_TSMODE, tSMode);
    }

    @JsonIgnore
    public String getTSMode() {
        Object objValue = this._get(DTOFIELD_TSMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTSModeDirty() {
        return this._contains(DTOFIELD_TSMODE);
    }

    @JsonIgnore
    public void resetTSMode() {
        this._reset(DTOFIELD_TSMODE);
    }

    @JsonIgnore
    public PSDEActionDTO tsmode(String tSMode) {
        this.setTSMode(tSMode);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO tsmode(PSModelEnums.DEActionTSMode tSMode) {
        if (tSMode == null) {
            this.setTSMode(null);
        } else {
            this.setTSMode(tSMode.value);
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
    public PSDEActionDTO updatedate(Timestamp updateDate) {
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
    public PSDEActionDTO updateman(String updateMan) {
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
    public PSDEActionDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSDEActionDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDEActionDTO usertag(String userTag) {
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
    public PSDEActionDTO usertag2(String userTag2) {
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
    public PSDEActionDTO usertag3(String userTag3) {
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
    public PSDEActionDTO usertag4(String userTag4) {
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
    public PSDEActionDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEActionDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEActionId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEActionId(strValue);
    }

    @JsonIgnore
    public PSDEActionDTO id(String strValue) {
        this.setPSDEActionId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEActionParamDTO> getPSDEActionParams() {
        Object list = this._get(DTOFIELD_PSDEACTIONPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeactionparams")
    public void setPSDEActionParams(List<PSDEActionParamDTO> psdeactionparams) {
        this._set(DTOFIELD_PSDEACTIONPARAMS, psdeactionparams);
    }

    @JsonIgnore
    public List<PSDEActionParamDTO> getPSDEActionParamsIf() {
        Object list = this._get(DTOFIELD_PSDEACTIONPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEACTIONPARAMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEActionVRDTO> getPSDEActionVRs() {
        Object list = this._get(DTOFIELD_PSDEACTIONVRS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeactionvrs")
    public void setPSDEActionVRs(List<PSDEActionVRDTO> psdeactionvrs) {
        this._set(DTOFIELD_PSDEACTIONVRS, psdeactionvrs);
    }

    @JsonIgnore
    public List<PSDEActionVRDTO> getPSDEActionVRsIf() {
        Object list = this._get(DTOFIELD_PSDEACTIONVRS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEACTIONVRS, list);
        }
        return (List) list;
    }
}
