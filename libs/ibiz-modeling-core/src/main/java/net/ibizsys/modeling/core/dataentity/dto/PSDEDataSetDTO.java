/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DECacheScope
 *  net.ibizsys.model.PSModelEnums$DEDataQueryViewLevel
 *  net.ibizsys.model.PSModelEnums$DEDataSetGroupMode
 *  net.ibizsys.model.PSModelEnums$DEDataSetOption
 *  net.ibizsys.model.PSModelEnums$DEDataSetParamMode
 *  net.ibizsys.model.PSModelEnums$DEDataSetPredefinedType
 *  net.ibizsys.model.PSModelEnums$DEDataSetRetType
 *  net.ibizsys.model.PSModelEnums$DEDataSetUnionMode
 *  net.ibizsys.model.PSModelEnums$DEExtendMode
 *  net.ibizsys.model.PSModelEnums$DELogicHolder
 *  net.ibizsys.model.PSModelEnums$DeptScope
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$OrgScope
 *  net.ibizsys.model.PSModelEnums$RequestMethod
 *  net.ibizsys.model.PSModelEnums$ScriptMode2
 *  net.ibizsys.model.PSModelEnums$SortDir
 *  net.ibizsys.model.PSModelEnums$SubSysSADEMethodBindingMode
 *  net.ibizsys.model.PSModelEnums$UniState
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSDQDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSGrpParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataImpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESampleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserDRDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataSetDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIONHOLDER = "ACTIONHOLDER";
    protected static final String DTOFIELD_ACTIONHOLDER = "actionholder";
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_AFTERCODE = "AFTERCODE";
    protected static final String DTOFIELD_AFTERCODE = "aftercode";
    public static final String FIELD_AGGDATAPSDERID = "AGGDATAPSDERID";
    protected static final String DTOFIELD_AGGDATAPSDERID = "aggdatapsderid";
    public static final String FIELD_AGGDATAPSDERNAME = "AGGDATAPSDERNAME";
    protected static final String DTOFIELD_AGGDATAPSDERNAME = "aggdatapsdername";
    public static final String FIELD_BEFORECODE = "BEFORECODE";
    protected static final String DTOFIELD_BEFORECODE = "beforecode";
    public static final String FIELD_CACHECAT = "CACHECAT";
    protected static final String DTOFIELD_CACHECAT = "cachecat";
    public static final String FIELD_CACHECHECKSTATE = "CACHECHECKSTATE";
    protected static final String DTOFIELD_CACHECHECKSTATE = "cachecheckstate";
    public static final String FIELD_CACHESCOPE = "CACHESCOPE";
    protected static final String DTOFIELD_CACHESCOPE = "cachescope";
    public static final String FIELD_CACHESTATEPSDELOGICID = "CACHESTATEPSDELOGICID";
    protected static final String DTOFIELD_CACHESTATEPSDELOGICID = "cachestatepsdelogicid";
    public static final String FIELD_CACHESTATEPSDELOGICNAME = "CACHESTATEPSDELOGICNAME";
    protected static final String DTOFIELD_CACHESTATEPSDELOGICNAME = "cachestatepsdelogicname";
    public static final String FIELD_CACHETAG = "CACHETAG";
    protected static final String DTOFIELD_CACHETAG = "cachetag";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
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
    public static final String FIELD_DATASETPARAMS = "DATASETPARAMS";
    protected static final String DTOFIELD_DATASETPARAMS = "datasetparams";
    public static final String FIELD_DATASETSN = "DATASETSN";
    protected static final String DTOFIELD_DATASETSN = "datasetsn";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_DSOPTION = "DSOPTION";
    protected static final String DTOFIELD_DSOPTION = "dsoption";
    public static final String FIELD_DSTAG = "DSTAG";
    protected static final String DTOFIELD_DSTAG = "dstag";
    public static final String FIELD_DSTAG2 = "DSTAG2";
    protected static final String DTOFIELD_DSTAG2 = "dstag2";
    public static final String FIELD_DSTAG3 = "DSTAG3";
    protected static final String DTOFIELD_DSTAG3 = "dstag3";
    public static final String FIELD_DSTAG4 = "DSTAG4";
    protected static final String DTOFIELD_DSTAG4 = "dstag4";
    public static final String FIELD_ENABLEAUDIT = "ENABLEAUDIT";
    protected static final String DTOFIELD_ENABLEAUDIT = "enableaudit";
    public static final String FIELD_ENABLECACHE = "ENABLECACHE";
    protected static final String DTOFIELD_ENABLECACHE = "enablecache";
    public static final String FIELD_ENABLEGROUP = "ENABLEGROUP";
    protected static final String DTOFIELD_ENABLEGROUP = "enablegroup";
    public static final String FIELD_ENABLEORGDR = "ENABLEORGDR";
    protected static final String DTOFIELD_ENABLEORGDR = "enableorgdr";
    public static final String FIELD_ENABLESECBC = "ENABLESECBC";
    protected static final String DTOFIELD_ENABLESECBC = "enablesecbc";
    public static final String FIELD_ENABLESECDR = "ENABLESECDR";
    protected static final String DTOFIELD_ENABLESECDR = "enablesecdr";
    public static final String FIELD_ENABLETEMPDATA = "ENABLETEMPDATA";
    protected static final String DTOFIELD_ENABLETEMPDATA = "enabletempdata";
    public static final String FIELD_ENABLEUSERDR = "ENABLEUSERDR";
    protected static final String DTOFIELD_ENABLEUSERDR = "enableuserdr";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FILTERMODEL = "FILTERMODEL";
    protected static final String DTOFIELD_FILTERMODEL = "filtermodel";
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
    public static final String FIELD_MAJORPSDEFID = "MAJORPSDEFID";
    protected static final String DTOFIELD_MAJORPSDEFID = "majorpsdefid";
    public static final String FIELD_MAJORPSDEFNAME = "MAJORPSDEFNAME";
    protected static final String DTOFIELD_MAJORPSDEFNAME = "majorpsdefname";
    public static final String FIELD_MAJORSORTDIR = "MAJORSORTDIR";
    protected static final String DTOFIELD_MAJORSORTDIR = "majorsortdir";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDEFID = "MINORPSDEFID";
    protected static final String DTOFIELD_MINORPSDEFID = "minorpsdefid";
    public static final String FIELD_MINORPSDEFNAME = "MINORPSDEFNAME";
    protected static final String DTOFIELD_MINORPSDEFNAME = "minorpsdefname";
    public static final String FIELD_MINORSORTDIR = "MINORSORTDIR";
    protected static final String DTOFIELD_MINORSORTDIR = "minorsortdir";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_ORGDR = "ORGDR";
    protected static final String DTOFIELD_ORGDR = "orgdr";
    public static final String FIELD_OUTPSDEFGROUPID = "OUTPSDEFGROUPID";
    protected static final String DTOFIELD_OUTPSDEFGROUPID = "outpsdefgroupid";
    public static final String FIELD_OUTPSDEFGROUPNAME = "OUTPSDEFGROUPNAME";
    protected static final String DTOFIELD_OUTPSDEFGROUPNAME = "outpsdefgroupname";
    public static final String FIELD_OUTPSDESAMPLEDATAID = "OUTPSDESAMPLEDATAID";
    protected static final String DTOFIELD_OUTPSDESAMPLEDATAID = "outpsdesampledataid";
    public static final String FIELD_OUTPSDESAMPLEDATANAME = "OUTPSDESAMPLEDATANAME";
    protected static final String DTOFIELD_OUTPSDESAMPLEDATANAME = "outpsdesampledataname";
    public static final String FIELD_PAGESIZE = "PAGESIZE";
    protected static final String DTOFIELD_PAGESIZE = "pagesize";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_POTIME = "POTIME";
    protected static final String DTOFIELD_POTIME = "potime";
    public static final String FIELD_PREDEFINEDTYPEPARAM = "PREDEFINEDTYPEPARAM";
    protected static final String DTOFIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINETYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEDATAIMPID = "PSDEDATAIMPID";
    protected static final String DTOFIELD_PSDEDATAIMPID = "psdedataimpid";
    public static final String FIELD_PSDEDATAIMPNAME = "PSDEDATAIMPNAME";
    protected static final String DTOFIELD_PSDEDATAIMPNAME = "psdedataimpname";
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
    public static final String FIELD_PSSUBSYSSADEID = "PSSUBSYSSADEID";
    protected static final String DTOFIELD_PSSUBSYSSADEID = "pssubsyssadeid";
    public static final String FIELD_PSSUBSYSSADETAILID = "PSSUBSYSSADETAILID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";
    public static final String FIELD_PSSUBSYSSADETAILNAME = "PSSUBSYSSADETAILNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";
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
    public static final String FIELD_PSSYSUSERDRID = "PSSYSUSERDRID";
    protected static final String DTOFIELD_PSSYSUSERDRID = "pssysuserdrid";
    public static final String FIELD_PSSYSUSERDRID2 = "PSSYSUSERDRID2";
    protected static final String DTOFIELD_PSSYSUSERDRID2 = "pssysuserdrid2";
    public static final String FIELD_PSSYSUSERDRNAME = "PSSYSUSERDRNAME";
    protected static final String DTOFIELD_PSSYSUSERDRNAME = "pssysuserdrname";
    public static final String FIELD_PSSYSUSERDRNAME2 = "PSSYSUSERDRNAME2";
    protected static final String DTOFIELD_PSSYSUSERDRNAME2 = "pssysuserdrname2";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_REQUESTMETHOD = "REQUESTMETHOD";
    protected static final String DTOFIELD_REQUESTMETHOD = "requestmethod";
    public static final String FIELD_REQUESTPATH = "REQUESTPATH";
    protected static final String DTOFIELD_REQUESTPATH = "requestpath";
    public static final String FIELD_RETVALTYPE = "RETVALTYPE";
    protected static final String DTOFIELD_RETVALTYPE = "retvaltype";
    public static final String FIELD_SECBC = "SECBC";
    protected static final String DTOFIELD_SECBC = "secbc";
    public static final String FIELD_SECDR = "SECDR";
    protected static final String DTOFIELD_SECDR = "secdr";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_SUBSYSSADETAILMODE = "SUBSYSSADETAILMODE";
    protected static final String DTOFIELD_SUBSYSSADETAILMODE = "subsyssadetailmode";
    public static final String FIELD_SYSUSERDR2PARAM = "SYSUSERDR2PARAM";
    protected static final String DTOFIELD_SYSUSERDR2PARAM = "sysuserdr2param";
    public static final String FIELD_SYSUSERDRPARAM = "SYSUSERDRPARAM";
    protected static final String DTOFIELD_SYSUSERDRPARAM = "sysuserdrparam";
    public static final String FIELD_UNIONMODE = "UNIONMODE";
    protected static final String DTOFIELD_UNIONMODE = "unionmode";
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
    public static final String FIELD_VIEWCOLLEVEL = "VIEWCOLLEVEL";
    protected static final String DTOFIELD_VIEWCOLLEVEL = "viewcollevel";
    public static final String DTOFIELD_PSDEDSPARAMS = "psdedsparams";
    public static final String DTOFIELD_PSDEDSDQS = "psdedsdqs";
    public static final String DTOFIELD_PSDEDSGRPPARAMS = "psdedsgrpparams";

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
    public PSDEDataSetDTO actionholder(Integer actionHolder) {
        this.setActionHolder(actionHolder);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO actionholder(PSModelEnums.DELogicHolder actionHolder) {
        if (actionHolder == null) {
            this.setActionHolder(null);
        } else {
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicid")
    public void setADPSDELogicId(String aDPSDELogicId) {
        this._set(DTOFIELD_ADPSDELOGICID, aDPSDELogicId);
    }

    @JsonIgnore
    public String getADPSDELogicId() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicIdDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public void resetADPSDELogicId() {
        this._reset(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public PSDEDataSetDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        } else {
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicname")
    public void setADPSDELogicName(String aDPSDELogicName) {
        this._set(DTOFIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }

    @JsonIgnore
    public String getADPSDELogicName() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicNameDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetADPSDELogicName() {
        this._reset(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
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
    public PSDEDataSetDTO aftercode(String afterCode) {
        this.setAfterCode(afterCode);
        return this;
    }

    @JsonProperty(value="aggdatapsderid")
    public void setAggDataPSDERId(String aggDataPSDERId) {
        this._set(DTOFIELD_AGGDATAPSDERID, aggDataPSDERId);
    }

    @JsonIgnore
    public String getAggDataPSDERId() {
        Object objValue = this._get(DTOFIELD_AGGDATAPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggDataPSDERIdDirty() {
        return this._contains(DTOFIELD_AGGDATAPSDERID);
    }

    @JsonIgnore
    public void resetAggDataPSDERId() {
        this._reset(DTOFIELD_AGGDATAPSDERID);
    }

    @JsonIgnore
    public PSDEDataSetDTO aggdatapsderid(String aggDataPSDERId) {
        this.setAggDataPSDERId(aggDataPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO aggdatapsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setAggDataPSDERId(null);
            this.setAggDataPSDERName(null);
        } else {
            this.setAggDataPSDERId(pSDER.getPSDERId());
            this.setAggDataPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="aggdatapsdername")
    public void setAggDataPSDERName(String aggDataPSDERName) {
        this._set(DTOFIELD_AGGDATAPSDERNAME, aggDataPSDERName);
    }

    @JsonIgnore
    public String getAggDataPSDERName() {
        Object objValue = this._get(DTOFIELD_AGGDATAPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggDataPSDERNameDirty() {
        return this._contains(DTOFIELD_AGGDATAPSDERNAME);
    }

    @JsonIgnore
    public void resetAggDataPSDERName() {
        this._reset(DTOFIELD_AGGDATAPSDERNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO aggdatapsdername(String aggDataPSDERName) {
        this.setAggDataPSDERName(aggDataPSDERName);
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
    public PSDEDataSetDTO beforecode(String beforeCode) {
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
    public PSDEDataSetDTO cachecat(String cacheCat) {
        this.setCacheCat(cacheCat);
        return this;
    }

    @JsonProperty(value="cachecheckstate")
    public void setCacheCheckState(String cacheCheckState) {
        this._set(DTOFIELD_CACHECHECKSTATE, cacheCheckState);
    }

    @JsonIgnore
    public String getCacheCheckState() {
        Object objValue = this._get(DTOFIELD_CACHECHECKSTATE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheCheckStateDirty() {
        return this._contains(DTOFIELD_CACHECHECKSTATE);
    }

    @JsonIgnore
    public void resetCacheCheckState() {
        this._reset(DTOFIELD_CACHECHECKSTATE);
    }

    @JsonIgnore
    public PSDEDataSetDTO cachecheckstate(String cacheCheckState) {
        this.setCacheCheckState(cacheCheckState);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO cachecheckstate(PSModelEnums.UniState cacheCheckState) {
        if (cacheCheckState == null) {
            this.setCacheCheckState(null);
        } else {
            this.setCacheCheckState(cacheCheckState.value);
        }
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
    public PSDEDataSetDTO cachescope(String cacheScope) {
        this.setCacheScope(cacheScope);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO cachescope(PSModelEnums.DECacheScope cacheScope) {
        if (cacheScope == null) {
            this.setCacheScope(null);
        } else {
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    @JsonProperty(value="cachestatepsdelogicid")
    public void setCacheStatePSDELogicId(String cacheStatePSDELogicId) {
        this._set(DTOFIELD_CACHESTATEPSDELOGICID, cacheStatePSDELogicId);
    }

    @JsonIgnore
    public String getCacheStatePSDELogicId() {
        Object objValue = this._get(DTOFIELD_CACHESTATEPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheStatePSDELogicIdDirty() {
        return this._contains(DTOFIELD_CACHESTATEPSDELOGICID);
    }

    @JsonIgnore
    public void resetCacheStatePSDELogicId() {
        this._reset(DTOFIELD_CACHESTATEPSDELOGICID);
    }

    @JsonIgnore
    public PSDEDataSetDTO cachestatepsdelogicid(String cacheStatePSDELogicId) {
        this.setCacheStatePSDELogicId(cacheStatePSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO cachestatepsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setCacheStatePSDELogicId(null);
            this.setCacheStatePSDELogicName(null);
        } else {
            this.setCacheStatePSDELogicId(pSDELogic.getPSDELogicId());
            this.setCacheStatePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="cachestatepsdelogicname")
    public void setCacheStatePSDELogicName(String cacheStatePSDELogicName) {
        this._set(DTOFIELD_CACHESTATEPSDELOGICNAME, cacheStatePSDELogicName);
    }

    @JsonIgnore
    public String getCacheStatePSDELogicName() {
        Object objValue = this._get(DTOFIELD_CACHESTATEPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheStatePSDELogicNameDirty() {
        return this._contains(DTOFIELD_CACHESTATEPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetCacheStatePSDELogicName() {
        this._reset(DTOFIELD_CACHESTATEPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO cachestatepsdelogicname(String cacheStatePSDELogicName) {
        this.setCacheStatePSDELogicName(cacheStatePSDELogicName);
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
    public PSDEDataSetDTO cachetag(String cacheTag) {
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
    public PSDEDataSetDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
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
    public PSDEDataSetDTO codename(String codeName) {
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
    public PSDEDataSetDTO createdate(Timestamp createDate) {
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
    public PSDEDataSetDTO createman(String createMan) {
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
    public PSDEDataSetDTO customcode(String customCode) {
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
    public PSDEDataSetDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="datasetparams")
    public void setDataSetParams(String dataSetParams) {
        this._set(DTOFIELD_DATASETPARAMS, dataSetParams);
    }

    @JsonIgnore
    public String getDataSetParams() {
        Object objValue = this._get(DTOFIELD_DATASETPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataSetParamsDirty() {
        return this._contains(DTOFIELD_DATASETPARAMS);
    }

    @JsonIgnore
    public void resetDataSetParams() {
        this._reset(DTOFIELD_DATASETPARAMS);
    }

    @JsonIgnore
    public PSDEDataSetDTO datasetparams(String dataSetParams) {
        this.setDataSetParams(dataSetParams);
        return this;
    }

    @JsonProperty(value="datasetsn")
    public void setDataSetSN(String dataSetSN) {
        this._set(DTOFIELD_DATASETSN, dataSetSN);
    }

    @JsonIgnore
    public String getDataSetSN() {
        Object objValue = this._get(DTOFIELD_DATASETSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataSetSNDirty() {
        return this._contains(DTOFIELD_DATASETSN);
    }

    @JsonIgnore
    public void resetDataSetSN() {
        this._reset(DTOFIELD_DATASETSN);
    }

    @JsonIgnore
    public PSDEDataSetDTO datasetsn(String dataSetSN) {
        this.setDataSetSN(dataSetSN);
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEDataSetDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dsoption")
    public void setDSOption(Integer dSOption) {
        this._set(DTOFIELD_DSOPTION, dSOption);
    }

    @JsonIgnore
    public Integer getDSOption() {
        Object objValue = this._get(DTOFIELD_DSOPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDSOptionDirty() {
        return this._contains(DTOFIELD_DSOPTION);
    }

    @JsonIgnore
    public void resetDSOption() {
        this._reset(DTOFIELD_DSOPTION);
    }

    @JsonIgnore
    public PSDEDataSetDTO dsoption(Integer dSOption) {
        this.setDSOption(dSOption);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO dsoption(PSModelEnums.DEDataSetOption[] dSOption) {
        if (dSOption == null || dSOption.length == 0) {
            this.setDSOption(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEDataSetOption _item : dSOption) {
                _value |= _item.value;
            }
            this.setDSOption(_value);
        }
        return this;
    }

    @JsonProperty(value="dstag")
    public void setDSTag(String dSTag) {
        this._set(DTOFIELD_DSTAG, dSTag);
    }

    @JsonIgnore
    public String getDSTag() {
        Object objValue = this._get(DTOFIELD_DSTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTagDirty() {
        return this._contains(DTOFIELD_DSTAG);
    }

    @JsonIgnore
    public void resetDSTag() {
        this._reset(DTOFIELD_DSTAG);
    }

    @JsonIgnore
    public PSDEDataSetDTO dstag(String dSTag) {
        this.setDSTag(dSTag);
        return this;
    }

    @JsonProperty(value="dstag2")
    public void setDSTag2(String dSTag2) {
        this._set(DTOFIELD_DSTAG2, dSTag2);
    }

    @JsonIgnore
    public String getDSTag2() {
        Object objValue = this._get(DTOFIELD_DSTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTag2Dirty() {
        return this._contains(DTOFIELD_DSTAG2);
    }

    @JsonIgnore
    public void resetDSTag2() {
        this._reset(DTOFIELD_DSTAG2);
    }

    @JsonIgnore
    public PSDEDataSetDTO dstag2(String dSTag2) {
        this.setDSTag2(dSTag2);
        return this;
    }

    @JsonProperty(value="dstag3")
    public void setDSTag3(String dSTag3) {
        this._set(DTOFIELD_DSTAG3, dSTag3);
    }

    @JsonIgnore
    public String getDSTag3() {
        Object objValue = this._get(DTOFIELD_DSTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTag3Dirty() {
        return this._contains(DTOFIELD_DSTAG3);
    }

    @JsonIgnore
    public void resetDSTag3() {
        this._reset(DTOFIELD_DSTAG3);
    }

    @JsonIgnore
    public PSDEDataSetDTO dstag3(String dSTag3) {
        this.setDSTag3(dSTag3);
        return this;
    }

    @JsonProperty(value="dstag4")
    public void setDSTag4(String dSTag4) {
        this._set(DTOFIELD_DSTAG4, dSTag4);
    }

    @JsonIgnore
    public String getDSTag4() {
        Object objValue = this._get(DTOFIELD_DSTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSTag4Dirty() {
        return this._contains(DTOFIELD_DSTAG4);
    }

    @JsonIgnore
    public void resetDSTag4() {
        this._reset(DTOFIELD_DSTAG4);
    }

    @JsonIgnore
    public PSDEDataSetDTO dstag4(String dSTag4) {
        this.setDSTag4(dSTag4);
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
    public PSDEDataSetDTO enableaudit(Integer enableAudit) {
        this.setEnableAudit(enableAudit);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enableaudit(Boolean enableAudit) {
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
    public PSDEDataSetDTO enablecache(Integer enableCache) {
        this.setEnableCache(enableCache);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enablecache(Boolean enableCache) {
        if (enableCache == null) {
            this.setEnableCache(null);
        } else {
            this.setEnableCache(enableCache != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablegroup")
    public void setEnableGroup(Integer enableGroup) {
        this._set(DTOFIELD_ENABLEGROUP, enableGroup);
    }

    @JsonIgnore
    public Integer getEnableGroup() {
        Object objValue = this._get(DTOFIELD_ENABLEGROUP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableGroupDirty() {
        return this._contains(DTOFIELD_ENABLEGROUP);
    }

    @JsonIgnore
    public void resetEnableGroup() {
        this._reset(DTOFIELD_ENABLEGROUP);
    }

    @JsonIgnore
    public PSDEDataSetDTO enablegroup(Integer enableGroup) {
        this.setEnableGroup(enableGroup);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enablegroup(PSModelEnums.DEDataSetGroupMode enableGroup) {
        if (enableGroup == null) {
            this.setEnableGroup(null);
        } else {
            this.setEnableGroup(enableGroup.value);
        }
        return this;
    }

    @JsonProperty(value="enableorgdr")
    public void setEnableOrgDR(Integer enableOrgDR) {
        this._set(DTOFIELD_ENABLEORGDR, enableOrgDR);
    }

    @JsonIgnore
    public Integer getEnableOrgDR() {
        Object objValue = this._get(DTOFIELD_ENABLEORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableOrgDRDirty() {
        return this._contains(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public void resetEnableOrgDR() {
        this._reset(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public PSDEDataSetDTO enableorgdr(Integer enableOrgDR) {
        this.setEnableOrgDR(enableOrgDR);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enableorgdr(Boolean enableOrgDR) {
        if (enableOrgDR == null) {
            this.setEnableOrgDR(null);
        } else {
            this.setEnableOrgDR(enableOrgDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecbc")
    public void setEnableSecBC(Integer enableSecBC) {
        this._set(DTOFIELD_ENABLESECBC, enableSecBC);
    }

    @JsonIgnore
    public Integer getEnableSecBC() {
        Object objValue = this._get(DTOFIELD_ENABLESECBC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecBCDirty() {
        return this._contains(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public void resetEnableSecBC() {
        this._reset(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public PSDEDataSetDTO enablesecbc(Integer enableSecBC) {
        this.setEnableSecBC(enableSecBC);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enablesecbc(Boolean enableSecBC) {
        if (enableSecBC == null) {
            this.setEnableSecBC(null);
        } else {
            this.setEnableSecBC(enableSecBC != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecdr")
    public void setEnableSecDR(Integer enableSecDR) {
        this._set(DTOFIELD_ENABLESECDR, enableSecDR);
    }

    @JsonIgnore
    public Integer getEnableSecDR() {
        Object objValue = this._get(DTOFIELD_ENABLESECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecDRDirty() {
        return this._contains(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public void resetEnableSecDR() {
        this._reset(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public PSDEDataSetDTO enablesecdr(Integer enableSecDR) {
        this.setEnableSecDR(enableSecDR);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enablesecdr(Boolean enableSecDR) {
        if (enableSecDR == null) {
            this.setEnableSecDR(null);
        } else {
            this.setEnableSecDR(enableSecDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enabletempdata")
    public void setEnableTempData(Integer enableTempData) {
        this._set(DTOFIELD_ENABLETEMPDATA, enableTempData);
    }

    @JsonIgnore
    public Integer getEnableTempData() {
        Object objValue = this._get(DTOFIELD_ENABLETEMPDATA);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableTempDataDirty() {
        return this._contains(DTOFIELD_ENABLETEMPDATA);
    }

    @JsonIgnore
    public void resetEnableTempData() {
        this._reset(DTOFIELD_ENABLETEMPDATA);
    }

    @JsonIgnore
    public PSDEDataSetDTO enabletempdata(Integer enableTempData) {
        this.setEnableTempData(enableTempData);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enabletempdata(Boolean enableTempData) {
        if (enableTempData == null) {
            this.setEnableTempData(null);
        } else {
            this.setEnableTempData(enableTempData != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableuserdr")
    public void setEnableUserDR(Integer enableUserDR) {
        this._set(DTOFIELD_ENABLEUSERDR, enableUserDR);
    }

    @JsonIgnore
    public Integer getEnableUserDR() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserDRDirty() {
        return this._contains(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public void resetEnableUserDR() {
        this._reset(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public PSDEDataSetDTO enableuserdr(Integer enableUserDR) {
        this.setEnableUserDR(enableUserDR);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO enableuserdr(Boolean enableUserDR) {
        if (enableUserDR == null) {
            this.setEnableUserDR(null);
        } else {
            this.setEnableUserDR(enableUserDR != false ? 1 : 0);
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
    public PSDEDataSetDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="filtermodel")
    public void setFilterModel(String filterModel) {
        this._set(DTOFIELD_FILTERMODEL, filterModel);
    }

    @JsonIgnore
    public String getFilterModel() {
        Object objValue = this._get(DTOFIELD_FILTERMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterModelDirty() {
        return this._contains(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public void resetFilterModel() {
        this._reset(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public PSDEDataSetDTO filtermodel(String filterModel) {
        this.setFilterModel(filterModel);
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
    public PSDEDataSetDTO finishflag(Integer finishFlag) {
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
    public PSDEDataSetDTO inpsdefgroupid(String inPSDEFGroupId) {
        this.setInPSDEFGroupId(inPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO inpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
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
    public PSDEDataSetDTO inpsdefgroupname(String inPSDEFGroupName) {
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
    public PSDEDataSetDTO inpsdesampledataid(String inPSDESampleDataId) {
        this.setInPSDESampleDataId(inPSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO inpsdesampledataid(PSDESampleDataDTO pSDESampleData) {
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
    public PSDEDataSetDTO inpsdesampledataname(String inPSDESampleDataName) {
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
    public PSDEDataSetDTO inpssysdynamodelid(String inPSSysDynaModelId) {
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO inpssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEDataSetDTO inpssysdynamodelname(String inPSSysDynaModelName) {
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
    public PSDEDataSetDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="majorpsdefid")
    public void setMajorPSDEFId(String majorPSDEFId) {
        this._set(DTOFIELD_MAJORPSDEFID, majorPSDEFId);
    }

    @JsonIgnore
    public String getMajorPSDEFId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFID);
    }

    @JsonIgnore
    public void resetMajorPSDEFId() {
        this._reset(DTOFIELD_MAJORPSDEFID);
    }

    @JsonIgnore
    public PSDEDataSetDTO majorpsdefid(String majorPSDEFId) {
        this.setMajorPSDEFId(majorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO majorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMajorPSDEFId(null);
            this.setMajorPSDEFName(null);
        } else {
            this.setMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdefname")
    public void setMajorPSDEFName(String majorPSDEFName) {
        this._set(DTOFIELD_MAJORPSDEFNAME, majorPSDEFName);
    }

    @JsonIgnore
    public String getMajorPSDEFName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFNameDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFNAME);
    }

    @JsonIgnore
    public void resetMajorPSDEFName() {
        this._reset(DTOFIELD_MAJORPSDEFNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO majorpsdefname(String majorPSDEFName) {
        this.setMajorPSDEFName(majorPSDEFName);
        return this;
    }

    @JsonProperty(value="majorsortdir")
    public void setMajorSortDir(String majorSortDir) {
        this._set(DTOFIELD_MAJORSORTDIR, majorSortDir);
    }

    @JsonIgnore
    public String getMajorSortDir() {
        Object objValue = this._get(DTOFIELD_MAJORSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorSortDirDirty() {
        return this._contains(DTOFIELD_MAJORSORTDIR);
    }

    @JsonIgnore
    public void resetMajorSortDir() {
        this._reset(DTOFIELD_MAJORSORTDIR);
    }

    @JsonIgnore
    public PSDEDataSetDTO majorsortdir(String majorSortDir) {
        this.setMajorSortDir(majorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO majorsortdir(PSModelEnums.SortDir majorSortDir) {
        if (majorSortDir == null) {
            this.setMajorSortDir(null);
        } else {
            this.setMajorSortDir(majorSortDir.value);
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
    public PSDEDataSetDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsdefid")
    public void setMinorPSDEFId(String minorPSDEFId) {
        this._set(DTOFIELD_MINORPSDEFID, minorPSDEFId);
    }

    @JsonIgnore
    public String getMinorPSDEFId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEFID);
    }

    @JsonIgnore
    public void resetMinorPSDEFId() {
        this._reset(DTOFIELD_MINORPSDEFID);
    }

    @JsonIgnore
    public PSDEDataSetDTO minorpsdefid(String minorPSDEFId) {
        this.setMinorPSDEFId(minorPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO minorpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMinorPSDEFId(null);
            this.setMinorPSDEFName(null);
        } else {
            this.setMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="minorpsdefname")
    public void setMinorPSDEFName(String minorPSDEFName) {
        this._set(DTOFIELD_MINORPSDEFNAME, minorPSDEFName);
    }

    @JsonIgnore
    public String getMinorPSDEFName() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFNameDirty() {
        return this._contains(DTOFIELD_MINORPSDEFNAME);
    }

    @JsonIgnore
    public void resetMinorPSDEFName() {
        this._reset(DTOFIELD_MINORPSDEFNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO minorpsdefname(String minorPSDEFName) {
        this.setMinorPSDEFName(minorPSDEFName);
        return this;
    }

    @JsonProperty(value="minorsortdir")
    public void setMinorSortDir(String minorSortDir) {
        this._set(DTOFIELD_MINORSORTDIR, minorSortDir);
    }

    @JsonIgnore
    public String getMinorSortDir() {
        Object objValue = this._get(DTOFIELD_MINORSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortDirDirty() {
        return this._contains(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public void resetMinorSortDir() {
        this._reset(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public PSDEDataSetDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
        if (minorSortDir == null) {
            this.setMinorSortDir(null);
        } else {
            this.setMinorSortDir(minorSortDir.value);
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
    public PSDEDataSetDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="orgdr")
    public void setOrgDR(Integer orgDR) {
        this._set(DTOFIELD_ORGDR, orgDR);
    }

    @JsonIgnore
    public Integer getOrgDR() {
        Object objValue = this._get(DTOFIELD_ORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrgDRDirty() {
        return this._contains(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public void resetOrgDR() {
        this._reset(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public PSDEDataSetDTO orgdr(Integer orgDR) {
        this.setOrgDR(orgDR);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO orgdr(PSModelEnums.OrgScope[] orgDR) {
        if (orgDR == null || orgDR.length == 0) {
            this.setOrgDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.OrgScope _item : orgDR) {
                _value |= _item.value;
            }
            this.setOrgDR(_value);
        }
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
    public PSDEDataSetDTO outpsdefgroupid(String outPSDEFGroupId) {
        this.setOutPSDEFGroupId(outPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO outpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
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
    public PSDEDataSetDTO outpsdefgroupname(String outPSDEFGroupName) {
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
    public PSDEDataSetDTO outpsdesampledataid(String outPSDESampleDataId) {
        this.setOutPSDESampleDataId(outPSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO outpsdesampledataid(PSDESampleDataDTO pSDESampleData) {
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
    public PSDEDataSetDTO outpsdesampledataname(String outPSDESampleDataName) {
        this.setOutPSDESampleDataName(outPSDESampleDataName);
        return this;
    }

    @JsonProperty(value="pagesize")
    public void setPageSize(Integer pageSize) {
        this._set(DTOFIELD_PAGESIZE, pageSize);
    }

    @JsonIgnore
    public Integer getPageSize() {
        Object objValue = this._get(DTOFIELD_PAGESIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPageSizeDirty() {
        return this._contains(DTOFIELD_PAGESIZE);
    }

    @JsonIgnore
    public void resetPageSize() {
        this._reset(DTOFIELD_PAGESIZE);
    }

    @JsonIgnore
    public PSDEDataSetDTO pagesize(Integer pageSize) {
        this.setPageSize(pageSize);
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
    public PSDEDataSetDTO paramtype(Integer paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO paramtype(PSModelEnums.DEDataSetParamMode paramType) {
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
    public PSDEDataSetDTO potime(Integer pOTime) {
        this.setPOTime(pOTime);
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
    public PSDEDataSetDTO predefinedtypeparam(String predefinedTypeParam) {
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
    public PSDEDataSetDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    @JsonProperty(value="predefinedtype")
    public void setPredefinedType(String predefinedType) {
        this._set(DTOFIELD_PREDEFINEDTYPE, predefinedType);
        this._set(FIELD_PREDEFINEDTYPE, predefinedType);
    }

    @JsonIgnore
    public String getPredefinedType() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPE);
        if (objValue == null && (objValue = this._get(FIELD_PREDEFINEDTYPE)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeDirty() {
        if (this._contains(DTOFIELD_PREDEFINEDTYPE)) {
            return true;
        }
        return this._contains(FIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public void resetPredefinedType() {
        this._reset(DTOFIELD_PREDEFINEDTYPE);
        this._reset(FIELD_PREDEFINEDTYPE);
    }

    @JsonIgnore
    public PSDEDataSetDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO predefinedtype(PSModelEnums.DEDataSetPredefinedType predefinedType) {
        if (predefinedType == null) {
            this.setPredefinedType(null);
        } else {
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPredefineType() {
        return this.getPredefinedType();
    }

    @JsonIgnore
    @Deprecated
    public void setPredefineType(String predefineType) {
        this.setPredefinedType(predefineType);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPredefineTypeDirty() {
        return this.isPredefinedTypeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPredefineType() {
        this.resetPredefinedType();
    }

    @JsonProperty(value="pscodelistid")
    public void setPSCodeListId(String pSCodeListId) {
        this._set(DTOFIELD_PSCODELISTID, pSCodeListId);
    }

    @JsonIgnore
    public String getPSCodeListId() {
        Object objValue = this._get(DTOFIELD_PSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListIdDirty() {
        return this._contains(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public void resetPSCodeListId() {
        this._reset(DTOFIELD_PSCODELISTID);
    }

    @JsonIgnore
    public PSDEDataSetDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        } else {
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="pscodelistname")
    public void setPSCodeListName(String pSCodeListName) {
        this._set(DTOFIELD_PSCODELISTNAME, pSCodeListName);
    }

    @JsonIgnore
    public String getPSCodeListName() {
        Object objValue = this._get(DTOFIELD_PSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCodeListNameDirty() {
        return this._contains(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public void resetPSCodeListName() {
        this._reset(DTOFIELD_PSCODELISTNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdedataimpid")
    public void setPSDEDataImpId(String pSDEDataImpId) {
        this._set(DTOFIELD_PSDEDATAIMPID, pSDEDataImpId);
    }

    @JsonIgnore
    public String getPSDEDataImpId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public void resetPSDEDataImpId() {
        this._reset(DTOFIELD_PSDEDATAIMPID);
    }

    @JsonIgnore
    public PSDEDataSetDTO psdedataimpid(String pSDEDataImpId) {
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp) {
        if (pSDEDataImp == null) {
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
        } else {
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    @JsonProperty(value="psdedataimpname")
    public void setPSDEDataImpName(String pSDEDataImpName) {
        this._set(DTOFIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }

    @JsonIgnore
    public String getPSDEDataImpName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAIMPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataImpNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public void resetPSDEDataImpName() {
        this._reset(DTOFIELD_PSDEDATAIMPNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO psdedataimpname(String pSDEDataImpName) {
        this.setPSDEDataImpName(pSDEDataImpName);
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
    public PSDEDataSetDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
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
    public PSDEDataSetDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataSetName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataSetName(strName);
    }

    @JsonIgnore
    public PSDEDataSetDTO name(String strName) {
        this.setPSDEDataSetName(strName);
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
    public PSDEDataSetDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDataSetDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEDataSetDTO psdelogicname(String pSDELogicName) {
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
    public PSDEDataSetDTO psdename(String pSDEName) {
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
    public PSDEDataSetDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
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
    public PSDEDataSetDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSDEDataSetDTO pssubsyssadeid(String pSSubSysSADEId) {
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
    public PSDEDataSetDTO pssubsyssadetailid(String pSSubSysSADetailId) {
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail) {
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
    public PSDEDataSetDTO pssubsyssadetailname(String pSSubSysSADetailName) {
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
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
    public PSDEDataSetDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEDataSetDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEDataSetDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
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
    public PSDEDataSetDTO pssysreqitemname(String pSSysReqItemName) {
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
    public PSDEDataSetDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEDataSetDTO pssyssfpluginname(String pSSysSFPluginName) {
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
    public PSDEDataSetDTO pssysunistateid(String pSSysUniStateId) {
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysunistateid(PSSysUniStateDTO pSSysUniState) {
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
    public PSDEDataSetDTO pssysunistatename(String pSSysUniStateName) {
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonProperty(value="pssysuserdrid")
    public void setPSSysUserDRId(String pSSysUserDRId) {
        this._set(DTOFIELD_PSSYSUSERDRID, pSSysUserDRId);
    }

    @JsonIgnore
    public String getPSSysUserDRId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public void resetPSSysUserDRId() {
        this._reset(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrid(String pSSysUserDRId) {
        this.setPSSysUserDRId(pSSysUserDRId);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrid(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId(null);
            this.setPSSysUserDRName(null);
        } else {
            this.setPSSysUserDRId(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrid2")
    public void setPSSysUserDRId2(String pSSysUserDRId2) {
        this._set(DTOFIELD_PSSYSUSERDRID2, pSSysUserDRId2);
    }

    @JsonIgnore
    public String getPSSysUserDRId2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRId2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public void resetPSSysUserDRId2() {
        this._reset(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrid2(String pSSysUserDRId2) {
        this.setPSSysUserDRId2(pSSysUserDRId2);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrid2(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId2(null);
            this.setPSSysUserDRName2(null);
        } else {
            this.setPSSysUserDRId2(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName2(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrname")
    public void setPSSysUserDRName(String pSSysUserDRName) {
        this._set(DTOFIELD_PSSYSUSERDRNAME, pSSysUserDRName);
    }

    @JsonIgnore
    public String getPSSysUserDRName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public void resetPSSysUserDRName() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrname(String pSSysUserDRName) {
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    @JsonProperty(value="pssysuserdrname2")
    public void setPSSysUserDRName2(String pSSysUserDRName2) {
        this._set(DTOFIELD_PSSYSUSERDRNAME2, pSSysUserDRName2);
    }

    @JsonIgnore
    public String getPSSysUserDRName2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRName2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public void resetPSSysUserDRName2() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public PSDEDataSetDTO pssysuserdrname2(String pSSysUserDRName2) {
        this.setPSSysUserDRName2(pSSysUserDRName2);
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
    public PSDEDataSetDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO pubmode(Boolean pubMode) {
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
    public PSDEDataSetDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
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
    public PSDEDataSetDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
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
    public PSDEDataSetDTO requestmethod(String requestMethod) {
        this.setRequestMethod(requestMethod);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO requestmethod(PSModelEnums.RequestMethod requestMethod) {
        if (requestMethod == null) {
            this.setRequestMethod(null);
        } else {
            this.setRequestMethod(requestMethod.value);
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
    public PSDEDataSetDTO requestpath(String requestPath) {
        this.setRequestPath(requestPath);
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
    public PSDEDataSetDTO retvaltype(String retValType) {
        this.setRetValType(retValType);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO retvaltype(PSModelEnums.DEDataSetRetType retValType) {
        if (retValType == null) {
            this.setRetValType(null);
        } else {
            this.setRetValType(retValType.value);
        }
        return this;
    }

    @JsonProperty(value="secbc")
    public void setSecBC(String secBC) {
        this._set(DTOFIELD_SECBC, secBC);
    }

    @JsonIgnore
    public String getSecBC() {
        Object objValue = this._get(DTOFIELD_SECBC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSecBCDirty() {
        return this._contains(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public void resetSecBC() {
        this._reset(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public PSDEDataSetDTO secbc(String secBC) {
        this.setSecBC(secBC);
        return this;
    }

    @JsonProperty(value="secdr")
    public void setSecDR(Integer secDR) {
        this._set(DTOFIELD_SECDR, secDR);
    }

    @JsonIgnore
    public Integer getSecDR() {
        Object objValue = this._get(DTOFIELD_SECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSecDRDirty() {
        return this._contains(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public void resetSecDR() {
        this._reset(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public PSDEDataSetDTO secdr(Integer secDR) {
        this.setSecDR(secDR);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO secdr(PSModelEnums.DeptScope[] secDR) {
        if (secDR == null || secDR.length == 0) {
            this.setSecDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DeptScope _item : secDR) {
                _value |= _item.value;
            }
            this.setSecDR(_value);
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
    public PSDEDataSetDTO servicecodename(String serviceCodeName) {
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
    public PSDEDataSetDTO subsyssadetailmode(Integer subSysSADetailMode) {
        this.setSubSysSADetailMode(subSysSADetailMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO subsyssadetailmode(PSModelEnums.SubSysSADEMethodBindingMode subSysSADetailMode) {
        if (subSysSADetailMode == null) {
            this.setSubSysSADetailMode(null);
        } else {
            this.setSubSysSADetailMode(subSysSADetailMode.value);
        }
        return this;
    }

    @JsonProperty(value="sysuserdr2param")
    public void setSysUserDR2Param(String sysUserDR2Param) {
        this._set(DTOFIELD_SYSUSERDR2PARAM, sysUserDR2Param);
    }

    @JsonIgnore
    public String getSysUserDR2Param() {
        Object objValue = this._get(DTOFIELD_SYSUSERDR2PARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDR2ParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public void resetSysUserDR2Param() {
        this._reset(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public PSDEDataSetDTO sysuserdr2param(String sysUserDR2Param) {
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    @JsonProperty(value="sysuserdrparam")
    public void setSysUserDRParam(String sysUserDRParam) {
        this._set(DTOFIELD_SYSUSERDRPARAM, sysUserDRParam);
    }

    @JsonIgnore
    public String getSysUserDRParam() {
        Object objValue = this._get(DTOFIELD_SYSUSERDRPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDRParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public void resetSysUserDRParam() {
        this._reset(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public PSDEDataSetDTO sysuserdrparam(String sysUserDRParam) {
        this.setSysUserDRParam(sysUserDRParam);
        return this;
    }

    @JsonProperty(value="unionmode")
    public void setUnionMode(String unionMode) {
        this._set(DTOFIELD_UNIONMODE, unionMode);
    }

    @JsonIgnore
    public String getUnionMode() {
        Object objValue = this._get(DTOFIELD_UNIONMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUnionModeDirty() {
        return this._contains(DTOFIELD_UNIONMODE);
    }

    @JsonIgnore
    public void resetUnionMode() {
        this._reset(DTOFIELD_UNIONMODE);
    }

    @JsonIgnore
    public PSDEDataSetDTO unionmode(String unionMode) {
        this.setUnionMode(unionMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO unionmode(PSModelEnums.DEDataSetUnionMode unionMode) {
        if (unionMode == null) {
            this.setUnionMode(null);
        } else {
            this.setUnionMode(unionMode.value);
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
    public PSDEDataSetDTO updatedate(Timestamp updateDate) {
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
    public PSDEDataSetDTO updateman(String updateMan) {
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
    public PSDEDataSetDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDataSetDTO userparams(String userParams) {
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
    public PSDEDataSetDTO usertag(String userTag) {
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
    public PSDEDataSetDTO usertag2(String userTag2) {
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
    public PSDEDataSetDTO usertag3(String userTag3) {
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
    public PSDEDataSetDTO usertag4(String userTag4) {
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
    public PSDEDataSetDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewcollevel")
    public void setViewColLevel(Integer viewColLevel) {
        this._set(DTOFIELD_VIEWCOLLEVEL, viewColLevel);
    }

    @JsonIgnore
    public Integer getViewColLevel() {
        Object objValue = this._get(DTOFIELD_VIEWCOLLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewColLevelDirty() {
        return this._contains(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public void resetViewColLevel() {
        this._reset(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public PSDEDataSetDTO viewcollevel(Integer viewColLevel) {
        this.setViewColLevel(viewColLevel);
        return this;
    }

    @JsonIgnore
    public PSDEDataSetDTO viewcollevel(PSModelEnums.DEDataQueryViewLevel viewColLevel) {
        if (viewColLevel == null) {
            this.setViewColLevel(null);
        } else {
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataSetId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataSetId(strValue);
    }

    @JsonIgnore
    public PSDEDataSetDTO id(String strValue) {
        this.setPSDEDataSetId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDSParamDTO> getPSDEDSParams() {
        Object list = this._get(DTOFIELD_PSDEDSPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedsparams")
    public void setPSDEDSParams(List<PSDEDSParamDTO> psdedsparams) {
        this._set(DTOFIELD_PSDEDSPARAMS, psdedsparams);
    }

    @JsonIgnore
    public List<PSDEDSParamDTO> getPSDEDSParamsIf() {
        Object list = this._get(DTOFIELD_PSDEDSPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDSPARAMS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEDSDQDTO> getPSDEDSDQs() {
        Object list = this._get(DTOFIELD_PSDEDSDQS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedsdqs")
    public void setPSDEDSDQs(List<PSDEDSDQDTO> psdedsdqs) {
        this._set(DTOFIELD_PSDEDSDQS, psdedsdqs);
    }

    @JsonIgnore
    public List<PSDEDSDQDTO> getPSDEDSDQsIf() {
        Object list = this._get(DTOFIELD_PSDEDSDQS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDSDQS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEDSGrpParamDTO> getPSDEDSGrpParams() {
        Object list = this._get(DTOFIELD_PSDEDSGRPPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedsgrpparams")
    public void setPSDEDSGrpParams(List<PSDEDSGrpParamDTO> psdedsgrpparams) {
        this._set(DTOFIELD_PSDEDSGRPPARAMS, psdedsgrpparams);
    }

    @JsonIgnore
    public List<PSDEDSGrpParamDTO> getPSDEDSGrpParamsIf() {
        Object list = this._get(DTOFIELD_PSDEDSGRPPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDSGRPPARAMS, list);
        }
        return (List) list;
    }
}
