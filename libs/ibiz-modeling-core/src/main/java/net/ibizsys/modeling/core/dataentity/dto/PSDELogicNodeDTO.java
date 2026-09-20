package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELogicNodeDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDSTPARAM = "CUSTOMDSTPARAM";
    protected static final String DTOFIELD_CUSTOMDSTPARAM = "customdstparam";
    public static final String FIELD_CUSTOMSRCPARAM = "CUSTOMSRCPARAM";
    protected static final String DTOFIELD_CUSTOMSRCPARAM = "customsrcparam";
    public static final String FIELD_DEBUGMODE = "DEBUGMODE";
    protected static final String DTOFIELD_DEBUGMODE = "debugmode";
    public static final String FIELD_DSTPSDEUTILDEID = "DSTDEUTILDEID";
    protected static final String DTOFIELD_DSTPSDEUTILDEID = "dstpsdeutildeid";
    public static final String FIELD_DSTPSDEUTILDENAME = "DSTDEUTILDENAME";
    protected static final String DTOFIELD_DSTPSDEUTILDENAME = "dstpsdeutildename";
    public static final String FIELD_DSTINDEX = "DSTINDEX";
    protected static final String DTOFIELD_DSTINDEX = "dstindex";
    public static final String FIELD_DSTPARAMACTION = "DSTPARAMACTION";
    protected static final String DTOFIELD_DSTPARAMACTION = "dstparamaction";
    public static final String FIELD_DSTPSDEACTIONID = "DSTPSDEACTIONID";
    protected static final String DTOFIELD_DSTPSDEACTIONID = "dstpsdeactionid";
    public static final String FIELD_DSTPSDEACTIONNAME = "DSTPSDEACTIONNAME";
    protected static final String DTOFIELD_DSTPSDEACTIONNAME = "dstpsdeactionname";
    public static final String FIELD_DSTPSDEDATAEXPID = "DSTPSDEDATAEXPID";
    protected static final String DTOFIELD_DSTPSDEDATAEXPID = "dstpsdedataexpid";
    public static final String FIELD_DSTPSDEDATAEXPNAME = "DSTPSDEDATAEXPNAME";
    protected static final String DTOFIELD_DSTPSDEDATAEXPNAME = "dstpsdedataexpname";
    public static final String FIELD_DSTPSDEDATAFLOWID = "DSTPSDEDATAFLOWID";
    protected static final String DTOFIELD_DSTPSDEDATAFLOWID = "dstpsdedataflowid";
    public static final String FIELD_DSTPSDEDATAFLOWNAME = "DSTPSDEDATAFLOWNAME";
    protected static final String DTOFIELD_DSTPSDEDATAFLOWNAME = "dstpsdedataflowname";
    public static final String FIELD_DSTPSDEDATAIMPID = "DSTPSDEDATAIMPID";
    protected static final String DTOFIELD_DSTPSDEDATAIMPID = "dstpsdedataimpid";
    public static final String FIELD_DSTPSDEDATAIMPNAME = "DSTPSDEDATAIMPNAME";
    protected static final String DTOFIELD_DSTPSDEDATAIMPNAME = "dstpsdedataimpname";
    public static final String FIELD_DSTPSDEDATAQUERYID = "DSTPSDEDATAQUERYID";
    protected static final String DTOFIELD_DSTPSDEDATAQUERYID = "dstpsdedataqueryid";
    public static final String FIELD_DSTPSDEDATAQUERYNAME = "DSTPSDEDATAQUERYNAME";
    protected static final String DTOFIELD_DSTPSDEDATAQUERYNAME = "dstpsdedataqueryname";
    public static final String FIELD_DSTPSDEDATASETID = "DSTPSDEDATASETID";
    protected static final String DTOFIELD_DSTPSDEDATASETID = "dstpsdedatasetid";
    public static final String FIELD_DSTPSDEDATASETNAME = "DSTPSDEDATASETNAME";
    protected static final String DTOFIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";
    public static final String FIELD_DSTPSDEDATASYNCID = "DSTPSDEDATASYNCID";
    protected static final String DTOFIELD_DSTPSDEDATASYNCID = "dstpsdedatasyncid";
    public static final String FIELD_DSTPSDEDATASYNCNAME = "DSTPSDEDATASYNCNAME";
    protected static final String DTOFIELD_DSTPSDEDATASYNCNAME = "dstpsdedatasyncname";
    public static final String FIELD_DSTPSDEDTSQUEUEID = "DSTPSDEDTSQUEUEID";
    protected static final String DTOFIELD_DSTPSDEDTSQUEUEID = "dstpsdedtsqueueid";
    public static final String FIELD_DSTPSDEDTSQUEUENAME = "DSTPSDEDTSQUEUENAME";
    protected static final String DTOFIELD_DSTPSDEDTSQUEUENAME = "dstpsdedtsqueuename";
    public static final String FIELD_DSTPSDEFGROUPID = "DSTPSDEFGROUPID";
    protected static final String DTOFIELD_DSTPSDEFGROUPID = "dstpsdefgroupid";
    public static final String FIELD_DSTPSDEFGROUPNAME = "DSTPSDEFGROUPNAME";
    protected static final String DTOFIELD_DSTPSDEFGROUPNAME = "dstpsdefgroupname";
    public static final String FIELD_DSTPSDEFORMID = "DSTPSDEFORMID";
    protected static final String DTOFIELD_DSTPSDEFORMID = "dstpsdeformid";
    public static final String FIELD_DSTPSDEFORMNAME = "DSTPSDEFORMNAME";
    protected static final String DTOFIELD_DSTPSDEFORMNAME = "dstpsdeformname";
    public static final String FIELD_DSTPSDEFVALUERULEID = "DSTPSDEFVALUERULEID";
    protected static final String DTOFIELD_DSTPSDEFVALUERULEID = "dstpsdefvalueruleid";
    public static final String FIELD_DSTPSDEFVALUERULENAME = "DSTPSDEFVALUERULENAME";
    protected static final String DTOFIELD_DSTPSDEFVALUERULENAME = "dstpsdefvaluerulename";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_DSTPSDELOGICID = "DSTPSDELOGICID";
    protected static final String DTOFIELD_DSTPSDELOGICID = "dstpsdelogicid";
    public static final String FIELD_DSTPSDELOGICNAME = "DSTPSDELOGICNAME";
    protected static final String DTOFIELD_DSTPSDELOGICNAME = "dstpsdelogicname";
    public static final String FIELD_DSTPSDEMAPID = "DSTPSDEMAPID";
    protected static final String DTOFIELD_DSTPSDEMAPID = "dstpsdemapid";
    public static final String FIELD_DSTPSDEMAPNAME = "DSTPSDEMAPNAME";
    protected static final String DTOFIELD_DSTPSDEMAPNAME = "dstpsdemapname";
    public static final String FIELD_DSTPSDENAME = "DSTPSDENAME";
    protected static final String DTOFIELD_DSTPSDENAME = "dstpsdename";
    public static final String FIELD_DSTPSDENOTIFYID = "DSTPSDENOTIFYID";
    protected static final String DTOFIELD_DSTPSDENOTIFYID = "dstpsdenotifyid";
    public static final String FIELD_DSTPSDENOTIFYNAME = "DSTPSDENOTIFYNAME";
    protected static final String DTOFIELD_DSTPSDENOTIFYNAME = "dstpsdenotifyname";
    public static final String FIELD_DSTPSDEPRINTID = "DSTPSDEPRINTID";
    protected static final String DTOFIELD_DSTPSDEPRINTID = "dstpsdeprintid";
    public static final String FIELD_DSTPSDEPRINTNAME = "DSTPSDEPRINTNAME";
    protected static final String DTOFIELD_DSTPSDEPRINTNAME = "dstpsdeprintname";
    public static final String FIELD_DSTPSDEREPORTID = "DSTPSDEREPORTID";
    protected static final String DTOFIELD_DSTPSDEREPORTID = "dstpsdereportid";
    public static final String FIELD_DSTPSDEREPORTNAME = "DSTPSDEREPORTNAME";
    protected static final String DTOFIELD_DSTPSDEREPORTNAME = "dstpsdereportname";
    public static final String FIELD_DSTPSDESAMPLEDATAID = "DSTPSDESAMPLEDATAID";
    protected static final String DTOFIELD_DSTPSDESAMPLEDATAID = "dstpsdesampledataid";
    public static final String FIELD_DSTPSDESAMPLEDATANAME = "DSTPSDESAMPLEDATANAME";
    protected static final String DTOFIELD_DSTPSDESAMPLEDATANAME = "dstpsdesampledataname";
    public static final String FIELD_DSTPSDEUAGROUPID = "DSTPSDEUAGROUPID";
    protected static final String DTOFIELD_DSTPSDEUAGROUPID = "dstpsdeuagroupid";
    public static final String FIELD_DSTPSDEUAGROUPNAME = "DSTPSDEUAGROUPNAME";
    protected static final String DTOFIELD_DSTPSDEUAGROUPNAME = "dstpsdeuagroupname";
    public static final String FIELD_DSTPSDEUILOGICID = "DSTPSDEUILOGICID";
    protected static final String DTOFIELD_DSTPSDEUILOGICID = "dstpsdeuilogicid";
    public static final String FIELD_DSTPSDEUILOGICNAME = "DSTPSDEUILOGICNAME";
    protected static final String DTOFIELD_DSTPSDEUILOGICNAME = "dstpsdeuilogicname";
    public static final String FIELD_DSTPSDEVIEWID = "DSTPSDEVIEWID";
    protected static final String DTOFIELD_DSTPSDEVIEWID = "dstpsdeviewid";
    public static final String FIELD_DSTPSDEVIEWNAME = "DSTPSDEVIEWNAME";
    protected static final String DTOFIELD_DSTPSDEVIEWNAME = "dstpsdeviewname";
    public static final String FIELD_DSTPSDEVRGROUPID = "DSTPSDEVRGROUPID";
    protected static final String DTOFIELD_DSTPSDEVRGROUPID = "dstpsdevrgroupid";
    public static final String FIELD_DSTPSDEVRGROUPNAME = "DSTPSDEVRGROUPNAME";
    protected static final String DTOFIELD_DSTPSDEVRGROUPNAME = "dstpsdevrgroupname";
    public static final String FIELD_DSTPSDEWIZARDID = "DSTPSDEWIZARDID";
    protected static final String DTOFIELD_DSTPSDEWIZARDID = "dstpsdewizardid";
    public static final String FIELD_DSTPSDEWIZARDNAME = "DSTPSDEWIZARDNAME";
    protected static final String DTOFIELD_DSTPSDEWIZARDNAME = "dstpsdewizardname";
    public static final String FIELD_DSTPSDLPARAMID = "DSTPSDLPARAMID";
    protected static final String DTOFIELD_DSTPSDLPARAMID = "dstpsdlparamid";
    public static final String FIELD_DSTPSDLPARAMNAME = "DSTPSDLPARAMNAME";
    protected static final String DTOFIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";
    public static final String FIELD_DSTSORTDIR = "DSTSORTDIR";
    protected static final String DTOFIELD_DSTSORTDIR = "dstsortdir";
    public static final String FIELD_ISPSDLPARAMID = "ISPSDLPARAMID";
    protected static final String DTOFIELD_ISPSDLPARAMID = "ispsdlparamid";
    public static final String FIELD_ISPSDLPARAMNAME = "ISPSDLPARAMNAME";
    protected static final String DTOFIELD_ISPSDLPARAMNAME = "ispsdlparamname";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_LOGICNODESUBTYPE = "LOGICNODESUBTYPE";
    protected static final String DTOFIELD_LOGICNODESUBTYPE = "logicnodesubtype";
    public static final String FIELD_LOGICNODETYPE = "LOGICNODETYPE";
    protected static final String DTOFIELD_LOGICNODETYPE = "logicnodetype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MSGPSLANRESID = "MSGPSLANRESID";
    protected static final String DTOFIELD_MSGPSLANRESID = "msgpslanresid";
    public static final String FIELD_MSGPSLANRESNAME = "MSGPSLANRESNAME";
    protected static final String DTOFIELD_MSGPSLANRESNAME = "msgpslanresname";
    public static final String FIELD_NODEPARAMS = "NODEPARAMS";
    protected static final String DTOFIELD_NODEPARAMS = "nodeparams";
    public static final String FIELD_OPTPSDLPARAMID = "OPTPSDLPARAMID";
    protected static final String DTOFIELD_OPTPSDLPARAMID = "optpsdlparamid";
    public static final String FIELD_OPTPSDLPARAMNAME = "OPTPSDLPARAMNAME";
    protected static final String DTOFIELD_OPTPSDLPARAMNAME = "optpsdlparamname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_OSPSDLPARAMID = "OSPSDLPARAMID";
    protected static final String DTOFIELD_OSPSDLPARAMID = "ospsdlparamid";
    public static final String FIELD_OSPSDLPARAMNAME = "OSPSDLPARAMNAME";
    protected static final String DTOFIELD_OSPSDLPARAMNAME = "ospsdlparamname";
    public static final String FIELD_PARALLELOUTPUT = "PARALLELOUTPUT";
    protected static final String DTOFIELD_PARALLELOUTPUT = "paralleloutput";
    public static final String FIELD_PARAM1 = "PARAM1";
    protected static final String DTOFIELD_PARAM1 = "param1";
    public static final String FIELD_PARAM10 = "PARAM10";
    protected static final String DTOFIELD_PARAM10 = "param10";
    public static final String FIELD_PARAM11 = "PARAM11";
    protected static final String DTOFIELD_PARAM11 = "param11";
    public static final String FIELD_PARAM12 = "PARAM12";
    protected static final String DTOFIELD_PARAM12 = "param12";
    public static final String FIELD_PARAM13 = "PARAM13";
    protected static final String DTOFIELD_PARAM13 = "param13";
    public static final String FIELD_PARAM14 = "PARAM14";
    protected static final String DTOFIELD_PARAM14 = "param14";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
    public static final String FIELD_PARAM5 = "PARAM5";
    protected static final String DTOFIELD_PARAM5 = "param5";
    public static final String FIELD_PARAM6 = "PARAM6";
    protected static final String DTOFIELD_PARAM6 = "param6";
    public static final String FIELD_PARAM7 = "PARAM7";
    protected static final String DTOFIELD_PARAM7 = "param7";
    public static final String FIELD_PARAM8 = "PARAM8";
    protected static final String DTOFIELD_PARAM8 = "param8";
    public static final String FIELD_PARAM9 = "PARAM9";
    protected static final String DTOFIELD_PARAM9 = "param9";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDELOGICNODEID = "PSDELOGICNODEID";
    protected static final String DTOFIELD_PSDELOGICNODEID = "psdelogicnodeid";
    public static final String FIELD_PSDELOGICNODENAME = "PSDELOGICNODENAME";
    protected static final String DTOFIELD_PSDELOGICNODENAME = "psdelogicnodename";
    public static final String FIELD_PSDEMAINSTATEID = "PSDEMAINSTATEID";
    protected static final String DTOFIELD_PSDEMAINSTATEID = "psdemainstateid";
    public static final String FIELD_PSDEMAINSTATENAME = "PSDEMAINSTATENAME";
    protected static final String DTOFIELD_PSDEMAINSTATENAME = "psdemainstatename";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSUBSYSSADETAILID = "PSSUBSYSSADETAILID";
    protected static final String DTOFIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";
    public static final String FIELD_PSSUBSYSSADETAILNAME = "PSSUBSYSSADETAILNAME";
    protected static final String DTOFIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";
    public static final String FIELD_PSSUBSYSSERVICEAPIID = "PSSUBSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";
    public static final String FIELD_PSSUBSYSSERVICEAPINAME = "PSSUBSYSSERVICEAPINAME";
    protected static final String DTOFIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";
    public static final String FIELD_PSSYSAICHATAGENTID = "PSSYSAICHATAGENTID";
    protected static final String DTOFIELD_PSSYSAICHATAGENTID = "pssysaichatagentid";
    public static final String FIELD_PSSYSAICHATAGENTNAME = "PSSYSAICHATAGENTNAME";
    protected static final String DTOFIELD_PSSYSAICHATAGENTNAME = "pssysaichatagentname";
    public static final String FIELD_PSSYSAIFACTORYID = "PSSYSAIFACTORYID";
    protected static final String DTOFIELD_PSSYSAIFACTORYID = "pssysaifactoryid";
    public static final String FIELD_PSSYSAIFACTORYNAME = "PSSYSAIFACTORYNAME";
    protected static final String DTOFIELD_PSSYSAIFACTORYNAME = "pssysaifactoryname";
    public static final String FIELD_PSSYSAIPIPELINEAGENTID = "PSSYSAIPIPELINEAGENTID";
    protected static final String DTOFIELD_PSSYSAIPIPELINEAGENTID = "pssysaipipelineagentid";
    public static final String FIELD_PSSYSAIPIPELINEAGENTNAME = "PSSYSAIPIPELINEAGENTNAME";
    protected static final String DTOFIELD_PSSYSAIPIPELINEAGENTNAME = "pssysaipipelineagentname";
    public static final String FIELD_PSSYSAIWORKERAGENTID = "PSSYSAIWORKERAGENTID";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTID = "pssysaiworkeragentid";
    public static final String FIELD_PSSYSAIWORKERAGENTNAME = "PSSYSAIWORKERAGENTNAME";
    protected static final String DTOFIELD_PSSYSAIWORKERAGENTNAME = "pssysaiworkeragentname";
    public static final String FIELD_PSSYSBACKSERVICEID = "PSSYSBACKSERVICEID";
    protected static final String DTOFIELD_PSSYSBACKSERVICEID = "pssysbackserviceid";
    public static final String FIELD_PSSYSBACKSERVICENAME = "PSSYSBACKSERVICENAME";
    protected static final String DTOFIELD_PSSYSBACKSERVICENAME = "pssysbackservicename";
    public static final String FIELD_PSSYSBDSCHEMEID = "PSSYSBDSCHEMEID";
    protected static final String DTOFIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";
    public static final String FIELD_PSSYSBDSCHEMENAME = "PSSYSBDSCHEMENAME";
    protected static final String DTOFIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";
    public static final String FIELD_PSSYSBDTABLEID = "PSSYSBDTABLEID";
    protected static final String DTOFIELD_PSSYSBDTABLEID = "pssysbdtableid";
    public static final String FIELD_PSSYSBDTABLENAME = "PSSYSBDTABLENAME";
    protected static final String DTOFIELD_PSSYSBDTABLENAME = "pssysbdtablename";
    public static final String FIELD_PSSYSBIAGGTABLEID = "PSSYSBIAGGTABLEID";
    protected static final String DTOFIELD_PSSYSBIAGGTABLEID = "pssysbiaggtableid";
    public static final String FIELD_PSSYSBIAGGTABLENAME = "PSSYSBIAGGTABLENAME";
    protected static final String DTOFIELD_PSSYSBIAGGTABLENAME = "pssysbiaggtablename";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBIREPORTID = "PSSYSBIREPORTID";
    protected static final String DTOFIELD_PSSYSBIREPORTID = "pssysbireportid";
    public static final String FIELD_PSSYSBIREPORTNAME = "PSSYSBIREPORTNAME";
    protected static final String DTOFIELD_PSSYSBIREPORTNAME = "pssysbireportname";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSBISCHEMENAME = "PSSYSBISCHEMENAME";
    protected static final String DTOFIELD_PSSYSBISCHEMENAME = "pssysbischemename";
    public static final String FIELD_PSSYSDATASYNCAGENTID = "PSSYSDATASYNCAGENTID";
    protected static final String DTOFIELD_PSSYSDATASYNCAGENTID = "pssysdatasyncagentid";
    public static final String FIELD_PSSYSDATASYNCAGENTNAME = "PSSYSDATASYNCAGENTNAME";
    protected static final String DTOFIELD_PSSYSDATASYNCAGENTNAME = "pssysdatasyncagentname";
    public static final String FIELD_PSSYSDBSCHEMEID = "PSSYSDBSCHEMEID";
    protected static final String DTOFIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";
    public static final String FIELD_PSSYSDBSCHEMENAME = "PSSYSDBSCHEMENAME";
    protected static final String DTOFIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";
    public static final String FIELD_PSSYSDBTABLEID = "PSSYSDBTABLEID";
    protected static final String DTOFIELD_PSSYSDBTABLEID = "pssysdbtableid";
    public static final String FIELD_PSSYSDBTABLENAME = "PSSYSDBTABLENAME";
    protected static final String DTOFIELD_PSSYSDBTABLENAME = "pssysdbtablename";
    public static final String FIELD_PSSYSDELOGICNODEID = "PSSYSDELOGICNODEID";
    protected static final String DTOFIELD_PSSYSDELOGICNODEID = "pssysdelogicnodeid";
    public static final String FIELD_PSSYSDELOGICNODENAME = "PSSYSDELOGICNODENAME";
    protected static final String DTOFIELD_PSSYSDELOGICNODENAME = "pssysdelogicnodename";
    public static final String FIELD_PSSYSEAIELEMENTID = "PSSYSEAIELEMENTID";
    protected static final String DTOFIELD_PSSYSEAIELEMENTID = "pssyseaielementid";
    public static final String FIELD_PSSYSEAIELEMENTNAME = "PSSYSEAIELEMENTNAME";
    protected static final String DTOFIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";
    public static final String FIELD_PSSYSEAISCHEMEID = "PSSYSEAISCHEMEID";
    protected static final String DTOFIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";
    public static final String FIELD_PSSYSEAISCHEMENAME = "PSSYSEAISCHEMENAME";
    protected static final String DTOFIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSEARCHDOCID = "PSSYSSEARCHDOCID";
    protected static final String DTOFIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";
    public static final String FIELD_PSSYSSEARCHDOCNAME = "PSSYSSEARCHDOCNAME";
    protected static final String DTOFIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";
    public static final String FIELD_PSSYSSEARCHSCHEMEID = "PSSYSSEARCHSCHEMEID";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";
    public static final String FIELD_PSSYSSEARCHSCHEMENAME = "PSSYSSEARCHSCHEMENAME";
    protected static final String DTOFIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSSQLCMDID = "PSSYSSQLCMDID";
    protected static final String DTOFIELD_PSSYSSQLCMDID = "pssyssqlcmdid";
    public static final String FIELD_PSSYSSQLCMDNAME = "PSSYSSQLCMDNAME";
    protected static final String DTOFIELD_PSSYSSQLCMDNAME = "pssyssqlcmdname";
    public static final String FIELD_PSSYSUNISTATEID = "PSSYSUNISTATEID";
    protected static final String DTOFIELD_PSSYSUNISTATEID = "pssysunistateid";
    public static final String FIELD_PSSYSUNISTATENAME = "PSSYSUNISTATENAME";
    protected static final String DTOFIELD_PSSYSUNISTATENAME = "pssysunistatename";
    public static final String FIELD_PSSYSUTILDEID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILDEID = "pssysutildeid";
    public static final String FIELD_PSSYSUTILDENAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILDENAME = "pssysutildename";
    public static final String FIELD_PSVIEWMSGID = "PSVIEWMSGID";
    protected static final String DTOFIELD_PSVIEWMSGID = "psviewmsgid";
    public static final String FIELD_PSVIEWMSGNAME = "PSVIEWMSGNAME";
    protected static final String DTOFIELD_PSVIEWMSGNAME = "psviewmsgname";
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
    public static final String FIELD_PSWFDENAME = "PSWFDENAME";
    protected static final String DTOFIELD_PSWFDENAME = "pswfdename";
    public static final String FIELD_PSWORKFLOWID = "PSWORKFLOWID";
    protected static final String DTOFIELD_PSWORKFLOWID = "psworkflowid";
    public static final String FIELD_PSWORKFLOWNAME = "PSWORKFLOWNAME";
    protected static final String DTOFIELD_PSWORKFLOWNAME = "psworkflowname";
    public static final String FIELD_RETPSDLPARAMID = "RETPSDLPARAMID";
    protected static final String DTOFIELD_RETPSDLPARAMID = "retpsdlparamid";
    public static final String FIELD_RETPSDLPARAMNAME = "RETPSDLPARAMNAME";
    protected static final String DTOFIELD_RETPSDLPARAMNAME = "retpsdlparamname";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
    public static final String FIELD_SRCINDEX = "SRCINDEX";
    protected static final String DTOFIELD_SRCINDEX = "srcindex";
    public static final String FIELD_SRCPSDLPARAMID = "SRCPSDLPARAMID";
    protected static final String DTOFIELD_SRCPSDLPARAMID = "srcpsdlparamid";
    public static final String FIELD_SRCPSDLPARAMNAME = "SRCPSDLPARAMNAME";
    protected static final String DTOFIELD_SRCPSDLPARAMNAME = "srcpsdlparamname";
    public static final String FIELD_SRCSIZE = "SRCSIZE";
    protected static final String DTOFIELD_SRCSIZE = "srcsize";
    public static final String FIELD_THREADRUNMODE = "THREADRUNMODE";
    protected static final String DTOFIELD_THREADRUNMODE = "threadrunmode";
    public static final String FIELD_THREADRUNTIMER = "THREADRUNTIMER";
    protected static final String DTOFIELD_THREADRUNTIMER = "threadruntimer";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
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
    public static final String DTOFIELD_PSDELNPARAMS = "psdelnparams";

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
    public PSDELogicNodeDTO codename(String codeName) {
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
    public PSDELogicNodeDTO createdate(Timestamp createDate) {
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
    public PSDELogicNodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdstparam")
    public void setCustomDSTParam(String customDSTParam) {
        this._set(DTOFIELD_CUSTOMDSTPARAM, customDSTParam);
    }

    @JsonIgnore
    public String getCustomDSTParam() {
        Object objValue = this._get(DTOFIELD_CUSTOMDSTPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDSTParamDirty() {
        return this._contains(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public void resetCustomDSTParam() {
        this._reset(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public PSDELogicNodeDTO customdstparam(String customDSTParam) {
        this.setCustomDSTParam(customDSTParam);
        return this;
    }

    @JsonProperty(value="customsrcparam")
    public void setCustomSrcParam(String customSrcParam) {
        this._set(DTOFIELD_CUSTOMSRCPARAM, customSrcParam);
    }

    @JsonIgnore
    public String getCustomSrcParam() {
        Object objValue = this._get(DTOFIELD_CUSTOMSRCPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomSrcParamDirty() {
        return this._contains(DTOFIELD_CUSTOMSRCPARAM);
    }

    @JsonIgnore
    public void resetCustomSrcParam() {
        this._reset(DTOFIELD_CUSTOMSRCPARAM);
    }

    @JsonIgnore
    public PSDELogicNodeDTO customsrcparam(String customSrcParam) {
        this.setCustomSrcParam(customSrcParam);
        return this;
    }

    @JsonProperty(value="debugmode")
    public void setDebugMode(Integer debugMode) {
        this._set(DTOFIELD_DEBUGMODE, debugMode);
    }

    @JsonIgnore
    public Integer getDebugMode() {
        Object objValue = this._get(DTOFIELD_DEBUGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDebugModeDirty() {
        return this._contains(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public void resetDebugMode() {
        this._reset(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public PSDELogicNodeDTO debugmode(Integer debugMode) {
        this.setDebugMode(debugMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO debugmode(PSModelEnums.DELogicDebugMode debugMode) {
        if (debugMode == null) {
            this.setDebugMode(null);
        } else {
            this.setDebugMode(debugMode.value);
        }
        return this;
    }

    @JsonProperty(value="dstpsdeutildeid")
    public void setDstPSDEUtilDEId(String dstPSDEUtilDEId) {
        this._set(DTOFIELD_DSTPSDEUTILDEID, dstPSDEUtilDEId);
        this._set(FIELD_DSTPSDEUTILDEID, dstPSDEUtilDEId);
    }

    @JsonIgnore
    public String getDstPSDEUtilDEId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUTILDEID);
        if (objValue == null && (objValue = this._get(FIELD_DSTPSDEUTILDEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUtilDEIdDirty() {
        if (this._contains(DTOFIELD_DSTPSDEUTILDEID)) {
            return true;
        }
        return this._contains(FIELD_DSTPSDEUTILDEID);
    }

    @JsonIgnore
    public void resetDstPSDEUtilDEId() {
        this._reset(DTOFIELD_DSTPSDEUTILDEID);
        this._reset(FIELD_DSTPSDEUTILDEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeutildeid(String dstPSDEUtilDEId) {
        this.setDstPSDEUtilDEId(dstPSDEUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeutildeid(PSDEUtilDTO pSDEUtil) {
        if (pSDEUtil == null) {
            this.setDstPSDEUtilDEId(null);
            this.setDstPSDEUtilDEName(null);
        } else {
            this.setDstPSDEUtilDEId(pSDEUtil.getPSDEUtilId());
            this.setDstPSDEUtilDEName(pSDEUtil.getPSDEUtilName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeutildename")
    public void setDstPSDEUtilDEName(String dstPSDEUtilDEName) {
        this._set(DTOFIELD_DSTPSDEUTILDENAME, dstPSDEUtilDEName);
        this._set(FIELD_DSTPSDEUTILDENAME, dstPSDEUtilDEName);
    }

    @JsonIgnore
    public String getDstPSDEUtilDEName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUTILDENAME);
        if (objValue == null && (objValue = this._get(FIELD_DSTPSDEUTILDENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUtilDENameDirty() {
        if (this._contains(DTOFIELD_DSTPSDEUTILDENAME)) {
            return true;
        }
        return this._contains(FIELD_DSTPSDEUTILDENAME);
    }

    @JsonIgnore
    public void resetDstPSDEUtilDEName() {
        this._reset(DTOFIELD_DSTPSDEUTILDENAME);
        this._reset(FIELD_DSTPSDEUTILDENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeutildename(String dstPSDEUtilDEName) {
        this.setDstPSDEUtilDEName(dstPSDEUtilDEName);
        return this;
    }

    @JsonProperty(value="dstindex")
    public void setDstIndex(Integer dstIndex) {
        this._set(DTOFIELD_DSTINDEX, dstIndex);
    }

    @JsonIgnore
    public Integer getDstIndex() {
        Object objValue = this._get(DTOFIELD_DSTINDEX);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDstIndexDirty() {
        return this._contains(DTOFIELD_DSTINDEX);
    }

    @JsonIgnore
    public void resetDstIndex() {
        this._reset(DTOFIELD_DSTINDEX);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstindex(Integer dstIndex) {
        this.setDstIndex(dstIndex);
        return this;
    }

    @JsonProperty(value="dstparamaction")
    public void setDstParamAction(String dstParamAction) {
        this._set(DTOFIELD_DSTPARAMACTION, dstParamAction);
    }

    @JsonIgnore
    public String getDstParamAction() {
        Object objValue = this._get(DTOFIELD_DSTPARAMACTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstParamActionDirty() {
        return this._contains(DTOFIELD_DSTPARAMACTION);
    }

    @JsonIgnore
    public void resetDstParamAction() {
        this._reset(DTOFIELD_DSTPARAMACTION);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstparamaction(String dstParamAction) {
        this.setDstParamAction(dstParamAction);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstparamaction(PSModelEnums.DELogicParamAction2 dstParamAction) {
        if (dstParamAction == null) {
            this.setDstParamAction(null);
        } else {
            this.setDstParamAction(dstParamAction.value);
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
    public PSDELogicNodeDTO dstpsdeactionid(String dstPSDEActionId) {
        this.setDstPSDEActionId(dstPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDELogicNodeDTO dstpsdeactionname(String dstPSDEActionName) {
        this.setDstPSDEActionName(dstPSDEActionName);
        return this;
    }

    @JsonProperty(value="dstpsdedataexpid")
    public void setDstPSDEDataExpId(String dstPSDEDataExpId) {
        this._set(DTOFIELD_DSTPSDEDATAEXPID, dstPSDEDataExpId);
    }

    @JsonIgnore
    public String getDstPSDEDataExpId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAEXPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataExpIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAEXPID);
    }

    @JsonIgnore
    public void resetDstPSDEDataExpId() {
        this._reset(DTOFIELD_DSTPSDEDATAEXPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpid(String dstPSDEDataExpId) {
        this.setDstPSDEDataExpId(dstPSDEDataExpId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpid(PSDEDataExpDTO pSDEDataExp) {
        if (pSDEDataExp == null) {
            this.setDstPSDEDataExpId(null);
            this.setDstPSDEDataExpName(null);
        } else {
            this.setDstPSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setDstPSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedataexpname")
    public void setDstPSDEDataExpName(String dstPSDEDataExpName) {
        this._set(DTOFIELD_DSTPSDEDATAEXPNAME, dstPSDEDataExpName);
    }

    @JsonIgnore
    public String getDstPSDEDataExpName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAEXPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataExpNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAEXPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataExpName() {
        this._reset(DTOFIELD_DSTPSDEDATAEXPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpname(String dstPSDEDataExpName) {
        this.setDstPSDEDataExpName(dstPSDEDataExpName);
        return this;
    }

    @JsonProperty(value="dstpsdedataflowid")
    public void setDstPSDEDataFlowId(String dstPSDEDataFlowId) {
        this._set(DTOFIELD_DSTPSDEDATAFLOWID, dstPSDEDataFlowId);
    }

    @JsonIgnore
    public String getDstPSDEDataFlowId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAFLOWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataFlowIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAFLOWID);
    }

    @JsonIgnore
    public void resetDstPSDEDataFlowId() {
        this._reset(DTOFIELD_DSTPSDEDATAFLOWID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataflowid(String dstPSDEDataFlowId) {
        this.setDstPSDEDataFlowId(dstPSDEDataFlowId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataflowid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setDstPSDEDataFlowId(null);
            this.setDstPSDEDataFlowName(null);
        } else {
            this.setDstPSDEDataFlowId(pSDELogic.getPSDELogicId());
            this.setDstPSDEDataFlowName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedataflowname")
    public void setDstPSDEDataFlowName(String dstPSDEDataFlowName) {
        this._set(DTOFIELD_DSTPSDEDATAFLOWNAME, dstPSDEDataFlowName);
    }

    @JsonIgnore
    public String getDstPSDEDataFlowName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAFLOWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataFlowNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAFLOWNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataFlowName() {
        this._reset(DTOFIELD_DSTPSDEDATAFLOWNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataflowname(String dstPSDEDataFlowName) {
        this.setDstPSDEDataFlowName(dstPSDEDataFlowName);
        return this;
    }

    @JsonProperty(value="dstpsdedataimpid")
    public void setDstPSDEDataImpId(String dstPSDEDataImpId) {
        this._set(DTOFIELD_DSTPSDEDATAIMPID, dstPSDEDataImpId);
    }

    @JsonIgnore
    public String getDstPSDEDataImpId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAIMPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataImpIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAIMPID);
    }

    @JsonIgnore
    public void resetDstPSDEDataImpId() {
        this._reset(DTOFIELD_DSTPSDEDATAIMPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpid(String dstPSDEDataImpId) {
        this.setDstPSDEDataImpId(dstPSDEDataImpId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpid(PSDEDataImpDTO pSDEDataImp) {
        if (pSDEDataImp == null) {
            this.setDstPSDEDataImpId(null);
            this.setDstPSDEDataImpName(null);
        } else {
            this.setDstPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setDstPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedataimpname")
    public void setDstPSDEDataImpName(String dstPSDEDataImpName) {
        this._set(DTOFIELD_DSTPSDEDATAIMPNAME, dstPSDEDataImpName);
    }

    @JsonIgnore
    public String getDstPSDEDataImpName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATAIMPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataImpNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATAIMPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataImpName() {
        this._reset(DTOFIELD_DSTPSDEDATAIMPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpname(String dstPSDEDataImpName) {
        this.setDstPSDEDataImpName(dstPSDEDataImpName);
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
    public PSDELogicNodeDTO dstpsdedataqueryid(String dstPSDEDataQueryId) {
        this.setDstPSDEDataQueryId(dstPSDEDataQueryId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataqueryid(PSDEDataQueryDTO pSDEDataQuery) {
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
    public PSDELogicNodeDTO dstpsdedataqueryname(String dstPSDEDataQueryName) {
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
    public PSDELogicNodeDTO dstpsdedatasetid(String dstPSDEDataSetId) {
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDELogicNodeDTO dstpsdedatasetname(String dstPSDEDataSetName) {
        this.setDstPSDEDataSetName(dstPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="dstpsdedatasyncid")
    public void setDstPSDEDataSyncId(String dstPSDEDataSyncId) {
        this._set(DTOFIELD_DSTPSDEDATASYNCID, dstPSDEDataSyncId);
    }

    @JsonIgnore
    public String getDstPSDEDataSyncId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATASYNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataSyncIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATASYNCID);
    }

    @JsonIgnore
    public void resetDstPSDEDataSyncId() {
        this._reset(DTOFIELD_DSTPSDEDATASYNCID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncid(String dstPSDEDataSyncId) {
        this.setDstPSDEDataSyncId(dstPSDEDataSyncId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncid(PSDEDataSyncDTO pSDEDataSync) {
        if (pSDEDataSync == null) {
            this.setDstPSDEDataSyncId(null);
            this.setDstPSDEDataSyncName(null);
        } else {
            this.setDstPSDEDataSyncId(pSDEDataSync.getPSDEDataSyncId());
            this.setDstPSDEDataSyncName(pSDEDataSync.getPSDEDataSyncName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedatasyncname")
    public void setDstPSDEDataSyncName(String dstPSDEDataSyncName) {
        this._set(DTOFIELD_DSTPSDEDATASYNCNAME, dstPSDEDataSyncName);
    }

    @JsonIgnore
    public String getDstPSDEDataSyncName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDATASYNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDataSyncNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDATASYNCNAME);
    }

    @JsonIgnore
    public void resetDstPSDEDataSyncName() {
        this._reset(DTOFIELD_DSTPSDEDATASYNCNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncname(String dstPSDEDataSyncName) {
        this.setDstPSDEDataSyncName(dstPSDEDataSyncName);
        return this;
    }

    @JsonProperty(value="dstpsdedtsqueueid")
    public void setDstPSDEDTSQueueId(String dstPSDEDTSQueueId) {
        this._set(DTOFIELD_DSTPSDEDTSQUEUEID, dstPSDEDTSQueueId);
    }

    @JsonIgnore
    public String getDstPSDEDTSQueueId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDTSQUEUEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDTSQueueIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEDTSQUEUEID);
    }

    @JsonIgnore
    public void resetDstPSDEDTSQueueId() {
        this._reset(DTOFIELD_DSTPSDEDTSQUEUEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueueid(String dstPSDEDTSQueueId) {
        this.setDstPSDEDTSQueueId(dstPSDEDTSQueueId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueueid(PSDEDTSQueueDTO pSDEDTSQueue) {
        if (pSDEDTSQueue == null) {
            this.setDstPSDEDTSQueueId(null);
            this.setDstPSDEDTSQueueName(null);
        } else {
            this.setDstPSDEDTSQueueId(pSDEDTSQueue.getPSDEDTSQueueId());
            this.setDstPSDEDTSQueueName(pSDEDTSQueue.getPSDEDTSQueueName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdedtsqueuename")
    public void setDstPSDEDTSQueueName(String dstPSDEDTSQueueName) {
        this._set(DTOFIELD_DSTPSDEDTSQUEUENAME, dstPSDEDTSQueueName);
    }

    @JsonIgnore
    public String getDstPSDEDTSQueueName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEDTSQUEUENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEDTSQueueNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEDTSQUEUENAME);
    }

    @JsonIgnore
    public void resetDstPSDEDTSQueueName() {
        this._reset(DTOFIELD_DSTPSDEDTSQUEUENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueuename(String dstPSDEDTSQueueName) {
        this.setDstPSDEDTSQueueName(dstPSDEDTSQueueName);
        return this;
    }

    @JsonProperty(value="dstpsdefgroupid")
    public void setDstPSDEFGroupId(String dstPSDEFGroupId) {
        this._set(DTOFIELD_DSTPSDEFGROUPID, dstPSDEFGroupId);
    }

    @JsonIgnore
    public String getDstPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFGROUPID);
    }

    @JsonIgnore
    public void resetDstPSDEFGroupId() {
        this._reset(DTOFIELD_DSTPSDEFGROUPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupid(String dstPSDEFGroupId) {
        this.setDstPSDEFGroupId(dstPSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setDstPSDEFGroupId(null);
            this.setDstPSDEFGroupName(null);
        } else {
            this.setDstPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setDstPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdefgroupname")
    public void setDstPSDEFGroupName(String dstPSDEFGroupName) {
        this._set(DTOFIELD_DSTPSDEFGROUPNAME, dstPSDEFGroupName);
    }

    @JsonIgnore
    public String getDstPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEFGroupName() {
        this._reset(DTOFIELD_DSTPSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupname(String dstPSDEFGroupName) {
        this.setDstPSDEFGroupName(dstPSDEFGroupName);
        return this;
    }

    @JsonProperty(value="dstpsdeformid")
    public void setDstPSDEFormId(String dstPSDEFormId) {
        this._set(DTOFIELD_DSTPSDEFORMID, dstPSDEFormId);
    }

    @JsonIgnore
    public String getDstPSDEFormId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFormIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFORMID);
    }

    @JsonIgnore
    public void resetDstPSDEFormId() {
        this._reset(DTOFIELD_DSTPSDEFORMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformid(String dstPSDEFormId) {
        this.setDstPSDEFormId(dstPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setDstPSDEFormId(null);
            this.setDstPSDEFormName(null);
        } else {
            this.setDstPSDEFormId(pSDEForm.getPSDEFormId());
            this.setDstPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeformname")
    public void setDstPSDEFormName(String dstPSDEFormName) {
        this._set(DTOFIELD_DSTPSDEFORMNAME, dstPSDEFormName);
    }

    @JsonIgnore
    public String getDstPSDEFormName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFormNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetDstPSDEFormName() {
        this._reset(DTOFIELD_DSTPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformname(String dstPSDEFormName) {
        this.setDstPSDEFormName(dstPSDEFormName);
        return this;
    }

    @JsonProperty(value="dstpsdefvalueruleid")
    public void setDstPSDEFValueRuleId(String dstPSDEFValueRuleId) {
        this._set(DTOFIELD_DSTPSDEFVALUERULEID, dstPSDEFValueRuleId);
    }

    @JsonIgnore
    public String getDstPSDEFValueRuleId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFVALUERULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFValueRuleIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFVALUERULEID);
    }

    @JsonIgnore
    public void resetDstPSDEFValueRuleId() {
        this._reset(DTOFIELD_DSTPSDEFVALUERULEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvalueruleid(String dstPSDEFValueRuleId) {
        this.setDstPSDEFValueRuleId(dstPSDEFValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule) {
        if (pSDEFValueRule == null) {
            this.setDstPSDEFValueRuleId(null);
            this.setDstPSDEFValueRuleName(null);
        } else {
            this.setDstPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setDstPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdefvaluerulename")
    public void setDstPSDEFValueRuleName(String dstPSDEFValueRuleName) {
        this._set(DTOFIELD_DSTPSDEFVALUERULENAME, dstPSDEFValueRuleName);
    }

    @JsonIgnore
    public String getDstPSDEFValueRuleName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFVALUERULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFValueRuleNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEFVALUERULENAME);
    }

    @JsonIgnore
    public void resetDstPSDEFValueRuleName() {
        this._reset(DTOFIELD_DSTPSDEFVALUERULENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvaluerulename(String dstPSDEFValueRuleName) {
        this.setDstPSDEFValueRuleName(dstPSDEFValueRuleName);
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
    public PSDELogicNodeDTO dstpsdeid(String dstPSDEId) {
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDELogicNodeDTO dstpsdelogicid(String dstPSDELogicId) {
        this.setDstPSDELogicId(dstPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDELogicNodeDTO dstpsdelogicname(String dstPSDELogicName) {
        this.setDstPSDELogicName(dstPSDELogicName);
        return this;
    }

    @JsonProperty(value="dstpsdemapid")
    public void setDstPSDEMapId(String dstPSDEMapId) {
        this._set(DTOFIELD_DSTPSDEMAPID, dstPSDEMapId);
    }

    @JsonIgnore
    public String getDstPSDEMapId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEMAPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEMapIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEMAPID);
    }

    @JsonIgnore
    public void resetDstPSDEMapId() {
        this._reset(DTOFIELD_DSTPSDEMAPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapid(String dstPSDEMapId) {
        this.setDstPSDEMapId(dstPSDEMapId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapid(PSDEMapDTO pSDEMap) {
        if (pSDEMap == null) {
            this.setDstPSDEMapId(null);
            this.setDstPSDEMapName(null);
        } else {
            this.setDstPSDEMapId(pSDEMap.getPSDEMapId());
            this.setDstPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdemapname")
    public void setDstPSDEMapName(String dstPSDEMapName) {
        this._set(DTOFIELD_DSTPSDEMAPNAME, dstPSDEMapName);
    }

    @JsonIgnore
    public String getDstPSDEMapName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEMAPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEMapNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEMAPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEMapName() {
        this._reset(DTOFIELD_DSTPSDEMAPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapname(String dstPSDEMapName) {
        this.setDstPSDEMapName(dstPSDEMapName);
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
    public PSDELogicNodeDTO dstpsdename(String dstPSDEName) {
        this.setDstPSDEName(dstPSDEName);
        return this;
    }

    @JsonProperty(value="dstpsdenotifyid")
    public void setDstPSDENotifyId(String dstPSDENotifyId) {
        this._set(DTOFIELD_DSTPSDENOTIFYID, dstPSDENotifyId);
    }

    @JsonIgnore
    public String getDstPSDENotifyId() {
        Object objValue = this._get(DTOFIELD_DSTPSDENOTIFYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDENotifyIdDirty() {
        return this._contains(DTOFIELD_DSTPSDENOTIFYID);
    }

    @JsonIgnore
    public void resetDstPSDENotifyId() {
        this._reset(DTOFIELD_DSTPSDENOTIFYID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyid(String dstPSDENotifyId) {
        this.setDstPSDENotifyId(dstPSDENotifyId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyid(PSDENotifyDTO pSDENotify) {
        if (pSDENotify == null) {
            this.setDstPSDENotifyId(null);
            this.setDstPSDENotifyName(null);
        } else {
            this.setDstPSDENotifyId(pSDENotify.getPSDENotifyId());
            this.setDstPSDENotifyName(pSDENotify.getPSDENotifyName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdenotifyname")
    public void setDstPSDENotifyName(String dstPSDENotifyName) {
        this._set(DTOFIELD_DSTPSDENOTIFYNAME, dstPSDENotifyName);
    }

    @JsonIgnore
    public String getDstPSDENotifyName() {
        Object objValue = this._get(DTOFIELD_DSTPSDENOTIFYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDENotifyNameDirty() {
        return this._contains(DTOFIELD_DSTPSDENOTIFYNAME);
    }

    @JsonIgnore
    public void resetDstPSDENotifyName() {
        this._reset(DTOFIELD_DSTPSDENOTIFYNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyname(String dstPSDENotifyName) {
        this.setDstPSDENotifyName(dstPSDENotifyName);
        return this;
    }

    @JsonProperty(value="dstpsdeprintid")
    public void setDstPSDEPrintId(String dstPSDEPrintId) {
        this._set(DTOFIELD_DSTPSDEPRINTID, dstPSDEPrintId);
    }

    @JsonIgnore
    public String getDstPSDEPrintId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEPRINTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEPrintIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEPRINTID);
    }

    @JsonIgnore
    public void resetDstPSDEPrintId() {
        this._reset(DTOFIELD_DSTPSDEPRINTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintid(String dstPSDEPrintId) {
        this.setDstPSDEPrintId(dstPSDEPrintId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintid(PSDEPrintDTO pSDEPrint) {
        if (pSDEPrint == null) {
            this.setDstPSDEPrintId(null);
            this.setDstPSDEPrintName(null);
        } else {
            this.setDstPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setDstPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeprintname")
    public void setDstPSDEPrintName(String dstPSDEPrintName) {
        this._set(DTOFIELD_DSTPSDEPRINTNAME, dstPSDEPrintName);
    }

    @JsonIgnore
    public String getDstPSDEPrintName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEPRINTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEPrintNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEPRINTNAME);
    }

    @JsonIgnore
    public void resetDstPSDEPrintName() {
        this._reset(DTOFIELD_DSTPSDEPRINTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintname(String dstPSDEPrintName) {
        this.setDstPSDEPrintName(dstPSDEPrintName);
        return this;
    }

    @JsonProperty(value="dstpsdereportid")
    public void setDstPSDEReportId(String dstPSDEReportId) {
        this._set(DTOFIELD_DSTPSDEREPORTID, dstPSDEReportId);
    }

    @JsonIgnore
    public String getDstPSDEReportId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEReportIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEREPORTID);
    }

    @JsonIgnore
    public void resetDstPSDEReportId() {
        this._reset(DTOFIELD_DSTPSDEREPORTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportid(String dstPSDEReportId) {
        this.setDstPSDEReportId(dstPSDEReportId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportid(PSDEReportDTO pSDEReport) {
        if (pSDEReport == null) {
            this.setDstPSDEReportId(null);
            this.setDstPSDEReportName(null);
        } else {
            this.setDstPSDEReportId(pSDEReport.getPSDEReportId());
            this.setDstPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdereportname")
    public void setDstPSDEReportName(String dstPSDEReportName) {
        this._set(DTOFIELD_DSTPSDEREPORTNAME, dstPSDEReportName);
    }

    @JsonIgnore
    public String getDstPSDEReportName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEReportNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEREPORTNAME);
    }

    @JsonIgnore
    public void resetDstPSDEReportName() {
        this._reset(DTOFIELD_DSTPSDEREPORTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportname(String dstPSDEReportName) {
        this.setDstPSDEReportName(dstPSDEReportName);
        return this;
    }

    @JsonProperty(value="dstpsdesampledataid")
    public void setDstPSDESampleDataId(String dstPSDESampleDataId) {
        this._set(DTOFIELD_DSTPSDESAMPLEDATAID, dstPSDESampleDataId);
    }

    @JsonIgnore
    public String getDstPSDESampleDataId() {
        Object objValue = this._get(DTOFIELD_DSTPSDESAMPLEDATAID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDESampleDataIdDirty() {
        return this._contains(DTOFIELD_DSTPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public void resetDstPSDESampleDataId() {
        this._reset(DTOFIELD_DSTPSDESAMPLEDATAID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdesampledataid(String dstPSDESampleDataId) {
        this.setDstPSDESampleDataId(dstPSDESampleDataId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdesampledataid(PSDESampleDataDTO pSDESampleData) {
        if (pSDESampleData == null) {
            this.setDstPSDESampleDataId(null);
            this.setDstPSDESampleDataName(null);
        } else {
            this.setDstPSDESampleDataId(pSDESampleData.getPSDESampleDataId());
            this.setDstPSDESampleDataName(pSDESampleData.getPSDESampleDataName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdesampledataname")
    public void setDstPSDESampleDataName(String dstPSDESampleDataName) {
        this._set(DTOFIELD_DSTPSDESAMPLEDATANAME, dstPSDESampleDataName);
    }

    @JsonIgnore
    public String getDstPSDESampleDataName() {
        Object objValue = this._get(DTOFIELD_DSTPSDESAMPLEDATANAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDESampleDataNameDirty() {
        return this._contains(DTOFIELD_DSTPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public void resetDstPSDESampleDataName() {
        this._reset(DTOFIELD_DSTPSDESAMPLEDATANAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdesampledataname(String dstPSDESampleDataName) {
        this.setDstPSDESampleDataName(dstPSDESampleDataName);
        return this;
    }

    @JsonProperty(value="dstpsdeuagroupid")
    public void setDstPSDEUAGroupId(String dstPSDEUAGroupId) {
        this._set(DTOFIELD_DSTPSDEUAGROUPID, dstPSDEUAGroupId);
    }

    @JsonIgnore
    public String getDstPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetDstPSDEUAGroupId() {
        this._reset(DTOFIELD_DSTPSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupid(String dstPSDEUAGroupId) {
        this.setDstPSDEUAGroupId(dstPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setDstPSDEUAGroupId(null);
            this.setDstPSDEUAGroupName(null);
        } else {
            this.setDstPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setDstPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeuagroupname")
    public void setDstPSDEUAGroupName(String dstPSDEUAGroupName) {
        this._set(DTOFIELD_DSTPSDEUAGROUPNAME, dstPSDEUAGroupName);
    }

    @JsonIgnore
    public String getDstPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEUAGroupName() {
        this._reset(DTOFIELD_DSTPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupname(String dstPSDEUAGroupName) {
        this.setDstPSDEUAGroupName(dstPSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="dstpsdeuilogicid")
    public void setDstPSDEUILogicId(String dstPSDEUILogicId) {
        this._set(DTOFIELD_DSTPSDEUILOGICID, dstPSDEUILogicId);
    }

    @JsonIgnore
    public String getDstPSDEUILogicId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUILOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUILogicIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEUILOGICID);
    }

    @JsonIgnore
    public void resetDstPSDEUILogicId() {
        this._reset(DTOFIELD_DSTPSDEUILOGICID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicid(String dstPSDEUILogicId) {
        this.setDstPSDEUILogicId(dstPSDEUILogicId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setDstPSDEUILogicId(null);
            this.setDstPSDEUILogicName(null);
        } else {
            this.setDstPSDEUILogicId(pSDELogic.getPSDELogicId());
            this.setDstPSDEUILogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeuilogicname")
    public void setDstPSDEUILogicName(String dstPSDEUILogicName) {
        this._set(DTOFIELD_DSTPSDEUILOGICNAME, dstPSDEUILogicName);
    }

    @JsonIgnore
    public String getDstPSDEUILogicName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEUILOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEUILogicNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEUILOGICNAME);
    }

    @JsonIgnore
    public void resetDstPSDEUILogicName() {
        this._reset(DTOFIELD_DSTPSDEUILOGICNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicname(String dstPSDEUILogicName) {
        this.setDstPSDEUILogicName(dstPSDEUILogicName);
        return this;
    }

    @JsonProperty(value="dstpsdeviewid")
    public void setDstPSDEViewId(String dstPSDEViewId) {
        this._set(DTOFIELD_DSTPSDEVIEWID, dstPSDEViewId);
    }

    @JsonIgnore
    public String getDstPSDEViewId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEViewIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEVIEWID);
    }

    @JsonIgnore
    public void resetDstPSDEViewId() {
        this._reset(DTOFIELD_DSTPSDEVIEWID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewid(String dstPSDEViewId) {
        this.setDstPSDEViewId(dstPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setDstPSDEViewId(null);
            this.setDstPSDEViewName(null);
        } else {
            this.setDstPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDstPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdeviewname")
    public void setDstPSDEViewName(String dstPSDEViewName) {
        this._set(DTOFIELD_DSTPSDEVIEWNAME, dstPSDEViewName);
    }

    @JsonIgnore
    public String getDstPSDEViewName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEViewNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetDstPSDEViewName() {
        this._reset(DTOFIELD_DSTPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewname(String dstPSDEViewName) {
        this.setDstPSDEViewName(dstPSDEViewName);
        return this;
    }

    @JsonProperty(value="dstpsdevrgroupid")
    public void setDstPSDEVRGroupId(String dstPSDEVRGroupId) {
        this._set(DTOFIELD_DSTPSDEVRGROUPID, dstPSDEVRGroupId);
    }

    @JsonIgnore
    public String getDstPSDEVRGroupId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEVRGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEVRGroupIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEVRGROUPID);
    }

    @JsonIgnore
    public void resetDstPSDEVRGroupId() {
        this._reset(DTOFIELD_DSTPSDEVRGROUPID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupid(String dstPSDEVRGroupId) {
        this.setDstPSDEVRGroupId(dstPSDEVRGroupId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupid(PSDEVRGroupDTO pSDEVRGroup) {
        if (pSDEVRGroup == null) {
            this.setDstPSDEVRGroupId(null);
            this.setDstPSDEVRGroupName(null);
        } else {
            this.setDstPSDEVRGroupId(pSDEVRGroup.getPSDEVRGroupId());
            this.setDstPSDEVRGroupName(pSDEVRGroup.getPSDEVRGroupName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdevrgroupname")
    public void setDstPSDEVRGroupName(String dstPSDEVRGroupName) {
        this._set(DTOFIELD_DSTPSDEVRGROUPNAME, dstPSDEVRGroupName);
    }

    @JsonIgnore
    public String getDstPSDEVRGroupName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEVRGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEVRGroupNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEVRGROUPNAME);
    }

    @JsonIgnore
    public void resetDstPSDEVRGroupName() {
        this._reset(DTOFIELD_DSTPSDEVRGROUPNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupname(String dstPSDEVRGroupName) {
        this.setDstPSDEVRGroupName(dstPSDEVRGroupName);
        return this;
    }

    @JsonProperty(value="dstpsdewizardid")
    public void setDstPSDEWizardId(String dstPSDEWizardId) {
        this._set(DTOFIELD_DSTPSDEWIZARDID, dstPSDEWizardId);
    }

    @JsonIgnore
    public String getDstPSDEWizardId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEWIZARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEWizardIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEWIZARDID);
    }

    @JsonIgnore
    public void resetDstPSDEWizardId() {
        this._reset(DTOFIELD_DSTPSDEWIZARDID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardid(String dstPSDEWizardId) {
        this.setDstPSDEWizardId(dstPSDEWizardId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardid(PSDEWizardDTO pSDEWizard) {
        if (pSDEWizard == null) {
            this.setDstPSDEWizardId(null);
            this.setDstPSDEWizardName(null);
        } else {
            this.setDstPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setDstPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdewizardname")
    public void setDstPSDEWizardName(String dstPSDEWizardName) {
        this._set(DTOFIELD_DSTPSDEWIZARDNAME, dstPSDEWizardName);
    }

    @JsonIgnore
    public String getDstPSDEWizardName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEWIZARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEWizardNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEWIZARDNAME);
    }

    @JsonIgnore
    public void resetDstPSDEWizardName() {
        this._reset(DTOFIELD_DSTPSDEWIZARDNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardname(String dstPSDEWizardName) {
        this.setDstPSDEWizardName(dstPSDEWizardName);
        return this;
    }

    @JsonProperty(value="dstpsdlparamid")
    public void setDstPSDLParamId(String dstPSDLParamId) {
        this._set(DTOFIELD_DSTPSDLPARAMID, dstPSDLParamId);
    }

    @JsonIgnore
    public String getDstPSDLParamId() {
        Object objValue = this._get(DTOFIELD_DSTPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDLParamIdDirty() {
        return this._contains(DTOFIELD_DSTPSDLPARAMID);
    }

    @JsonIgnore
    public void resetDstPSDLParamId() {
        this._reset(DTOFIELD_DSTPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamid(String dstPSDLParamId) {
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        } else {
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdlparamname")
    public void setDstPSDLParamName(String dstPSDLParamName) {
        this._set(DTOFIELD_DSTPSDLPARAMNAME, dstPSDLParamName);
    }

    @JsonIgnore
    public String getDstPSDLParamName() {
        Object objValue = this._get(DTOFIELD_DSTPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDLParamNameDirty() {
        return this._contains(DTOFIELD_DSTPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetDstPSDLParamName() {
        this._reset(DTOFIELD_DSTPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamname(String dstPSDLParamName) {
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    @JsonProperty(value="dstsortdir")
    public void setDstSortDir(String dstSortDir) {
        this._set(DTOFIELD_DSTSORTDIR, dstSortDir);
    }

    @JsonIgnore
    public String getDstSortDir() {
        Object objValue = this._get(DTOFIELD_DSTSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstSortDirDirty() {
        return this._contains(DTOFIELD_DSTSORTDIR);
    }

    @JsonIgnore
    public void resetDstSortDir() {
        this._reset(DTOFIELD_DSTSORTDIR);
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstsortdir(String dstSortDir) {
        this.setDstSortDir(dstSortDir);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO dstsortdir(PSModelEnums.SortDir dstSortDir) {
        if (dstSortDir == null) {
            this.setDstSortDir(null);
        } else {
            this.setDstSortDir(dstSortDir.value);
        }
        return this;
    }

    @JsonProperty(value="ispsdlparamid")
    public void setISPSDLParamId(String iSPSDLParamId) {
        this._set(DTOFIELD_ISPSDLPARAMID, iSPSDLParamId);
    }

    @JsonIgnore
    public String getISPSDLParamId() {
        Object objValue = this._get(DTOFIELD_ISPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isISPSDLParamIdDirty() {
        return this._contains(DTOFIELD_ISPSDLPARAMID);
    }

    @JsonIgnore
    public void resetISPSDLParamId() {
        this._reset(DTOFIELD_ISPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamid(String iSPSDLParamId) {
        this.setISPSDLParamId(iSPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setISPSDLParamId(null);
            this.setISPSDLParamName(null);
        } else {
            this.setISPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setISPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="ispsdlparamname")
    public void setISPSDLParamName(String iSPSDLParamName) {
        this._set(DTOFIELD_ISPSDLPARAMNAME, iSPSDLParamName);
    }

    @JsonIgnore
    public String getISPSDLParamName() {
        Object objValue = this._get(DTOFIELD_ISPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isISPSDLParamNameDirty() {
        return this._contains(DTOFIELD_ISPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetISPSDLParamName() {
        this._reset(DTOFIELD_ISPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamname(String iSPSDLParamName) {
        this.setISPSDLParamName(iSPSDLParamName);
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
    public PSDELogicNodeDTO leftpos(Integer leftPos) {
        this.setLeftPos(leftPos);
        return this;
    }

    @JsonProperty(value="logicnodesubtype")
    public void setLogicNodeSubType(String logicNodeSubType) {
        this._set(DTOFIELD_LOGICNODESUBTYPE, logicNodeSubType);
    }

    @JsonIgnore
    public String getLogicNodeSubType() {
        Object objValue = this._get(DTOFIELD_LOGICNODESUBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNodeSubTypeDirty() {
        return this._contains(DTOFIELD_LOGICNODESUBTYPE);
    }

    @JsonIgnore
    public void resetLogicNodeSubType() {
        this._reset(DTOFIELD_LOGICNODESUBTYPE);
    }

    @JsonIgnore
    public PSDELogicNodeDTO logicnodesubtype(String logicNodeSubType) {
        this.setLogicNodeSubType(logicNodeSubType);
        return this;
    }

    @JsonProperty(value="logicnodetype")
    public void setLogicNodeType(String logicNodeType) {
        this._set(DTOFIELD_LOGICNODETYPE, logicNodeType);
    }

    @JsonIgnore
    public String getLogicNodeType() {
        Object objValue = this._get(DTOFIELD_LOGICNODETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNodeTypeDirty() {
        return this._contains(DTOFIELD_LOGICNODETYPE);
    }

    @JsonIgnore
    public void resetLogicNodeType() {
        this._reset(DTOFIELD_LOGICNODETYPE);
    }

    @JsonIgnore
    public PSDELogicNodeDTO logicnodetype(String logicNodeType) {
        this.setLogicNodeType(logicNodeType);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO logicnodetype(PSModelEnums.LogicNodeType logicNodeType) {
        if (logicNodeType == null) {
            this.setLogicNodeType(null);
        } else {
            this.setLogicNodeType(logicNodeType.value);
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
    public PSDELogicNodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="msgpslanresid")
    public void setMsgPSLanResId(String msgPSLanResId) {
        this._set(DTOFIELD_MSGPSLANRESID, msgPSLanResId);
    }

    @JsonIgnore
    public String getMsgPSLanResId() {
        Object objValue = this._get(DTOFIELD_MSGPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgPSLanResIdDirty() {
        return this._contains(DTOFIELD_MSGPSLANRESID);
    }

    @JsonIgnore
    public void resetMsgPSLanResId() {
        this._reset(DTOFIELD_MSGPSLANRESID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresid(String msgPSLanResId) {
        this.setMsgPSLanResId(msgPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setMsgPSLanResId(null);
            this.setMsgPSLanResName(null);
        } else {
            this.setMsgPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMsgPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="msgpslanresname")
    public void setMsgPSLanResName(String msgPSLanResName) {
        this._set(DTOFIELD_MSGPSLANRESNAME, msgPSLanResName);
    }

    @JsonIgnore
    public String getMsgPSLanResName() {
        Object objValue = this._get(DTOFIELD_MSGPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMsgPSLanResNameDirty() {
        return this._contains(DTOFIELD_MSGPSLANRESNAME);
    }

    @JsonIgnore
    public void resetMsgPSLanResName() {
        this._reset(DTOFIELD_MSGPSLANRESNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresname(String msgPSLanResName) {
        this.setMsgPSLanResName(msgPSLanResName);
        return this;
    }

    @JsonProperty(value="nodeparams")
    public void setNodeParams(String nodeParams) {
        this._set(DTOFIELD_NODEPARAMS, nodeParams);
    }

    @JsonIgnore
    public String getNodeParams() {
        Object objValue = this._get(DTOFIELD_NODEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeParamsDirty() {
        return this._contains(DTOFIELD_NODEPARAMS);
    }

    @JsonIgnore
    public void resetNodeParams() {
        this._reset(DTOFIELD_NODEPARAMS);
    }

    @JsonIgnore
    public PSDELogicNodeDTO nodeparams(String nodeParams) {
        this.setNodeParams(nodeParams);
        return this;
    }

    @JsonProperty(value="optpsdlparamid")
    public void setOptPSDLParamId(String optPSDLParamId) {
        this._set(DTOFIELD_OPTPSDLPARAMID, optPSDLParamId);
    }

    @JsonIgnore
    public String getOptPSDLParamId() {
        Object objValue = this._get(DTOFIELD_OPTPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOptPSDLParamIdDirty() {
        return this._contains(DTOFIELD_OPTPSDLPARAMID);
    }

    @JsonIgnore
    public void resetOptPSDLParamId() {
        this._reset(DTOFIELD_OPTPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO optpsdlparamid(String optPSDLParamId) {
        this.setOptPSDLParamId(optPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO optpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setOptPSDLParamId(null);
            this.setOptPSDLParamName(null);
        } else {
            this.setOptPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setOptPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="optpsdlparamname")
    public void setOptPSDLParamName(String optPSDLParamName) {
        this._set(DTOFIELD_OPTPSDLPARAMNAME, optPSDLParamName);
    }

    @JsonIgnore
    public String getOptPSDLParamName() {
        Object objValue = this._get(DTOFIELD_OPTPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOptPSDLParamNameDirty() {
        return this._contains(DTOFIELD_OPTPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetOptPSDLParamName() {
        this._reset(DTOFIELD_OPTPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO optpsdlparamname(String optPSDLParamName) {
        this.setOptPSDLParamName(optPSDLParamName);
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
    public PSDELogicNodeDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ospsdlparamid")
    public void setOSPSDLParamId(String oSPSDLParamId) {
        this._set(DTOFIELD_OSPSDLPARAMID, oSPSDLParamId);
    }

    @JsonIgnore
    public String getOSPSDLParamId() {
        Object objValue = this._get(DTOFIELD_OSPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOSPSDLParamIdDirty() {
        return this._contains(DTOFIELD_OSPSDLPARAMID);
    }

    @JsonIgnore
    public void resetOSPSDLParamId() {
        this._reset(DTOFIELD_OSPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamid(String oSPSDLParamId) {
        this.setOSPSDLParamId(oSPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setOSPSDLParamId(null);
            this.setOSPSDLParamName(null);
        } else {
            this.setOSPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setOSPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="ospsdlparamname")
    public void setOSPSDLParamName(String oSPSDLParamName) {
        this._set(DTOFIELD_OSPSDLPARAMNAME, oSPSDLParamName);
    }

    @JsonIgnore
    public String getOSPSDLParamName() {
        Object objValue = this._get(DTOFIELD_OSPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOSPSDLParamNameDirty() {
        return this._contains(DTOFIELD_OSPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetOSPSDLParamName() {
        this._reset(DTOFIELD_OSPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamname(String oSPSDLParamName) {
        this.setOSPSDLParamName(oSPSDLParamName);
        return this;
    }

    @JsonProperty(value="paralleloutput")
    public void setParallelOutput(Integer parallelOutput) {
        this._set(DTOFIELD_PARALLELOUTPUT, parallelOutput);
    }

    @JsonIgnore
    public Integer getParallelOutput() {
        Object objValue = this._get(DTOFIELD_PARALLELOUTPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParallelOutputDirty() {
        return this._contains(DTOFIELD_PARALLELOUTPUT);
    }

    @JsonIgnore
    public void resetParallelOutput() {
        this._reset(DTOFIELD_PARALLELOUTPUT);
    }

    @JsonIgnore
    public PSDELogicNodeDTO paralleloutput(Integer parallelOutput) {
        this.setParallelOutput(parallelOutput);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO paralleloutput(Boolean parallelOutput) {
        if (parallelOutput == null) {
            this.setParallelOutput(null);
        } else {
            this.setParallelOutput(parallelOutput != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="param1")
    public void setParam1(String param1) {
        this._set(DTOFIELD_PARAM1, param1);
    }

    @JsonIgnore
    public String getParam1() {
        Object objValue = this._get(DTOFIELD_PARAM1);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam1Dirty() {
        return this._contains(DTOFIELD_PARAM1);
    }

    @JsonIgnore
    public void resetParam1() {
        this._reset(DTOFIELD_PARAM1);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param1(String param1) {
        this.setParam1(param1);
        return this;
    }

    @JsonProperty(value="param10")
    public void setParam10(Integer param10) {
        this._set(DTOFIELD_PARAM10, param10);
    }

    @JsonIgnore
    public Integer getParam10() {
        Object objValue = this._get(DTOFIELD_PARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam10Dirty() {
        return this._contains(DTOFIELD_PARAM10);
    }

    @JsonIgnore
    public void resetParam10() {
        this._reset(DTOFIELD_PARAM10);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param10(Integer param10) {
        this.setParam10(param10);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO param10(Boolean param10) {
        if (param10 == null) {
            this.setParam10(null);
        } else {
            this.setParam10(param10 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="param11")
    public void setParam11(String param11) {
        this._set(DTOFIELD_PARAM11, param11);
    }

    @JsonIgnore
    public String getParam11() {
        Object objValue = this._get(DTOFIELD_PARAM11);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam11Dirty() {
        return this._contains(DTOFIELD_PARAM11);
    }

    @JsonIgnore
    public void resetParam11() {
        this._reset(DTOFIELD_PARAM11);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param11(String param11) {
        this.setParam11(param11);
        return this;
    }

    @JsonProperty(value="param12")
    public void setParam12(String param12) {
        this._set(DTOFIELD_PARAM12, param12);
    }

    @JsonIgnore
    public String getParam12() {
        Object objValue = this._get(DTOFIELD_PARAM12);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam12Dirty() {
        return this._contains(DTOFIELD_PARAM12);
    }

    @JsonIgnore
    public void resetParam12() {
        this._reset(DTOFIELD_PARAM12);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param12(String param12) {
        this.setParam12(param12);
        return this;
    }

    @JsonProperty(value="param13")
    public void setParam13(String param13) {
        this._set(DTOFIELD_PARAM13, param13);
    }

    @JsonIgnore
    public String getParam13() {
        Object objValue = this._get(DTOFIELD_PARAM13);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam13Dirty() {
        return this._contains(DTOFIELD_PARAM13);
    }

    @JsonIgnore
    public void resetParam13() {
        this._reset(DTOFIELD_PARAM13);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param13(String param13) {
        this.setParam13(param13);
        return this;
    }

    @JsonProperty(value="param14")
    public void setParam14(String param14) {
        this._set(DTOFIELD_PARAM14, param14);
    }

    @JsonIgnore
    public String getParam14() {
        Object objValue = this._get(DTOFIELD_PARAM14);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam14Dirty() {
        return this._contains(DTOFIELD_PARAM14);
    }

    @JsonIgnore
    public void resetParam14() {
        this._reset(DTOFIELD_PARAM14);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param14(String param14) {
        this.setParam14(param14);
        return this;
    }

    @JsonProperty(value="param2")
    public void setParam2(String param2) {
        this._set(DTOFIELD_PARAM2, param2);
    }

    @JsonIgnore
    public String getParam2() {
        Object objValue = this._get(DTOFIELD_PARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam2Dirty() {
        return this._contains(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public void resetParam2() {
        this._reset(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(String param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public String getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param3(String param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(String param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public String getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param4(String param4) {
        this.setParam4(param4);
        return this;
    }

    @JsonProperty(value="param5")
    public void setParam5(String param5) {
        this._set(DTOFIELD_PARAM5, param5);
    }

    @JsonIgnore
    public String getParam5() {
        Object objValue = this._get(DTOFIELD_PARAM5);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam5Dirty() {
        return this._contains(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public void resetParam5() {
        this._reset(DTOFIELD_PARAM5);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param5(String param5) {
        this.setParam5(param5);
        return this;
    }

    @JsonProperty(value="param6")
    public void setParam6(String param6) {
        this._set(DTOFIELD_PARAM6, param6);
    }

    @JsonIgnore
    public String getParam6() {
        Object objValue = this._get(DTOFIELD_PARAM6);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam6Dirty() {
        return this._contains(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public void resetParam6() {
        this._reset(DTOFIELD_PARAM6);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param6(String param6) {
        this.setParam6(param6);
        return this;
    }

    @JsonProperty(value="param7")
    public void setParam7(Integer param7) {
        this._set(DTOFIELD_PARAM7, param7);
    }

    @JsonIgnore
    public Integer getParam7() {
        Object objValue = this._get(DTOFIELD_PARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam7Dirty() {
        return this._contains(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public void resetParam7() {
        this._reset(DTOFIELD_PARAM7);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param7(Integer param7) {
        this.setParam7(param7);
        return this;
    }

    @JsonProperty(value="param8")
    public void setParam8(Integer param8) {
        this._set(DTOFIELD_PARAM8, param8);
    }

    @JsonIgnore
    public Integer getParam8() {
        Object objValue = this._get(DTOFIELD_PARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam8Dirty() {
        return this._contains(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public void resetParam8() {
        this._reset(DTOFIELD_PARAM8);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param8(Integer param8) {
        this.setParam8(param8);
        return this;
    }

    @JsonProperty(value="param9")
    public void setParam9(Integer param9) {
        this._set(DTOFIELD_PARAM9, param9);
    }

    @JsonIgnore
    public Integer getParam9() {
        Object objValue = this._get(DTOFIELD_PARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParam9Dirty() {
        return this._contains(DTOFIELD_PARAM9);
    }

    @JsonIgnore
    public void resetParam9() {
        this._reset(DTOFIELD_PARAM9);
    }

    @JsonIgnore
    public PSDELogicNodeDTO param9(Integer param9) {
        this.setParam9(param9);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO param9(Boolean param9) {
        if (param9 == null) {
            this.setParam9(null);
        } else {
            this.setParam9(param9 != false ? 1 : 0);
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
    public PSDELogicNodeDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDELogicNodeDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="psdelogicnodeid")
    public void setPSDELogicNodeId(String pSDELogicNodeId) {
        this._set(DTOFIELD_PSDELOGICNODEID, pSDELogicNodeId);
    }

    @JsonIgnore
    public String getPSDELogicNodeId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNodeIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICNODEID);
    }

    @JsonIgnore
    public void resetPSDELogicNodeId() {
        this._reset(DTOFIELD_PSDELOGICNODEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdelogicnodeid(String pSDELogicNodeId) {
        this.setPSDELogicNodeId(pSDELogicNodeId);
        return this;
    }

    @JsonProperty(value="psdelogicnodename")
    public void setPSDELogicNodeName(String pSDELogicNodeName) {
        this._set(DTOFIELD_PSDELOGICNODENAME, pSDELogicNodeName);
    }

    @JsonIgnore
    public String getPSDELogicNodeName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNodeNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNODENAME);
    }

    @JsonIgnore
    public void resetPSDELogicNodeName() {
        this._reset(DTOFIELD_PSDELOGICNODENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdelogicnodename(String pSDELogicNodeName) {
        this.setPSDELogicNodeName(pSDELogicNodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELogicNodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELogicNodeName(strName);
    }

    @JsonIgnore
    public PSDELogicNodeDTO name(String strName) {
        this.setPSDELogicNodeName(strName);
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
    public PSDELogicNodeDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdemainstateid(PSDEMainStateDTO pSDEMainState) {
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
    public PSDELogicNodeDTO psdemainstatename(String pSDEMainStateName) {
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSDELogicNodeDTO pssubsyssadetailid(String pSSubSysSADetailId) {
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail) {
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
    public PSDELogicNodeDTO pssubsyssadetailname(String pSSubSysSADetailName) {
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
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
    public PSDELogicNodeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId) {
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI) {
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
    public PSDELogicNodeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName) {
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysaichatagentid")
    public void setPSSysAIChatAgentId(String pSSysAIChatAgentId) {
        this._set(DTOFIELD_PSSYSAICHATAGENTID, pSSysAIChatAgentId);
    }

    @JsonIgnore
    public String getPSSysAIChatAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAICHATAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIChatAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAICHATAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIChatAgentId() {
        this._reset(DTOFIELD_PSSYSAICHATAGENTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaichatagentid(String pSSysAIChatAgentId) {
        this.setPSSysAIChatAgentId(pSSysAIChatAgentId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaichatagentid(PSSysAIChatAgentDTO pSSysAIChatAgent) {
        if (pSSysAIChatAgent == null) {
            this.setPSSysAIChatAgentId(null);
            this.setPSSysAIChatAgentName(null);
        } else {
            this.setPSSysAIChatAgentId(pSSysAIChatAgent.getPSSysAIChatAgentId());
            this.setPSSysAIChatAgentName(pSSysAIChatAgent.getPSSysAIChatAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaichatagentname")
    public void setPSSysAIChatAgentName(String pSSysAIChatAgentName) {
        this._set(DTOFIELD_PSSYSAICHATAGENTNAME, pSSysAIChatAgentName);
    }

    @JsonIgnore
    public String getPSSysAIChatAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAICHATAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIChatAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAICHATAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIChatAgentName() {
        this._reset(DTOFIELD_PSSYSAICHATAGENTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaichatagentname(String pSSysAIChatAgentName) {
        this.setPSSysAIChatAgentName(pSSysAIChatAgentName);
        return this;
    }

    @JsonProperty(value="pssysaifactoryid")
    public void setPSSysAIFactoryId(String pSSysAIFactoryId) {
        this._set(DTOFIELD_PSSYSAIFACTORYID, pSSysAIFactoryId);
    }

    @JsonIgnore
    public String getPSSysAIFactoryId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryId() {
        this._reset(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaifactoryid(String pSSysAIFactoryId) {
        this.setPSSysAIFactoryId(pSSysAIFactoryId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaifactoryid(PSSysAIFactoryDTO pSSysAIFactory) {
        if (pSSysAIFactory == null) {
            this.setPSSysAIFactoryId(null);
            this.setPSSysAIFactoryName(null);
        } else {
            this.setPSSysAIFactoryId(pSSysAIFactory.getPSSysAIFactoryId());
            this.setPSSysAIFactoryName(pSSysAIFactory.getPSSysAIFactoryName());
        }
        return this;
    }

    @JsonProperty(value="pssysaifactoryname")
    public void setPSSysAIFactoryName(String pSSysAIFactoryName) {
        this._set(DTOFIELD_PSSYSAIFACTORYNAME, pSSysAIFactoryName);
    }

    @JsonIgnore
    public String getPSSysAIFactoryName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryName() {
        this._reset(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaifactoryname(String pSSysAIFactoryName) {
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
        return this;
    }

    @JsonProperty(value="pssysaipipelineagentid")
    public void setPSSysAIPipelineAgentId(String pSSysAIPipelineAgentId) {
        this._set(DTOFIELD_PSSYSAIPIPELINEAGENTID, pSSysAIPipelineAgentId);
    }

    @JsonIgnore
    public String getPSSysAIPipelineAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineAgentId() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEAGENTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaipipelineagentid(String pSSysAIPipelineAgentId) {
        this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgentId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaipipelineagentid(PSSysAIPipelineAgentDTO pSSysAIPipelineAgent) {
        if (pSSysAIPipelineAgent == null) {
            this.setPSSysAIPipelineAgentId(null);
            this.setPSSysAIPipelineAgentName(null);
        } else {
            this.setPSSysAIPipelineAgentId(pSSysAIPipelineAgent.getPSSysAIPipelineAgentId());
            this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgent.getPSSysAIPipelineAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaipipelineagentname")
    public void setPSSysAIPipelineAgentName(String pSSysAIPipelineAgentName) {
        this._set(DTOFIELD_PSSYSAIPIPELINEAGENTNAME, pSSysAIPipelineAgentName);
    }

    @JsonIgnore
    public String getPSSysAIPipelineAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIPipelineAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIPipelineAgentName() {
        this._reset(DTOFIELD_PSSYSAIPIPELINEAGENTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaipipelineagentname(String pSSysAIPipelineAgentName) {
        this.setPSSysAIPipelineAgentName(pSSysAIPipelineAgentName);
        return this;
    }

    @JsonProperty(value="pssysaiworkeragentid")
    public void setPSSysAIWorkerAgentId(String pSSysAIWorkerAgentId) {
        this._set(DTOFIELD_PSSYSAIWORKERAGENTID, pSSysAIWorkerAgentId);
    }

    @JsonIgnore
    public String getPSSysAIWorkerAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIWORKERAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIWorkerAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIWORKERAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIWorkerAgentId() {
        this._reset(DTOFIELD_PSSYSAIWORKERAGENTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaiworkeragentid(String pSSysAIWorkerAgentId) {
        this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgentId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaiworkeragentid(PSSysAIWorkerAgentDTO pSSysAIWorkerAgent) {
        if (pSSysAIWorkerAgent == null) {
            this.setPSSysAIWorkerAgentId(null);
            this.setPSSysAIWorkerAgentName(null);
        } else {
            this.setPSSysAIWorkerAgentId(pSSysAIWorkerAgent.getPSSysAIWorkerAgentId());
            this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgent.getPSSysAIWorkerAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaiworkeragentname")
    public void setPSSysAIWorkerAgentName(String pSSysAIWorkerAgentName) {
        this._set(DTOFIELD_PSSYSAIWORKERAGENTNAME, pSSysAIWorkerAgentName);
    }

    @JsonIgnore
    public String getPSSysAIWorkerAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIWORKERAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIWorkerAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIWORKERAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIWorkerAgentName() {
        this._reset(DTOFIELD_PSSYSAIWORKERAGENTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysaiworkeragentname(String pSSysAIWorkerAgentName) {
        this.setPSSysAIWorkerAgentName(pSSysAIWorkerAgentName);
        return this;
    }

    @JsonProperty(value="pssysbackserviceid")
    public void setPSSysBackServiceId(String pSSysBackServiceId) {
        this._set(DTOFIELD_PSSYSBACKSERVICEID, pSSysBackServiceId);
    }

    @JsonIgnore
    public String getPSSysBackServiceId() {
        Object objValue = this._get(DTOFIELD_PSSYSBACKSERVICEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBackServiceIdDirty() {
        return this._contains(DTOFIELD_PSSYSBACKSERVICEID);
    }

    @JsonIgnore
    public void resetPSSysBackServiceId() {
        this._reset(DTOFIELD_PSSYSBACKSERVICEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbackserviceid(String pSSysBackServiceId) {
        this.setPSSysBackServiceId(pSSysBackServiceId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbackserviceid(PSSysBackServiceDTO pSSysBackService) {
        if (pSSysBackService == null) {
            this.setPSSysBackServiceId(null);
            this.setPSSysBackServiceName(null);
        } else {
            this.setPSSysBackServiceId(pSSysBackService.getPSSysBackServiceId());
            this.setPSSysBackServiceName(pSSysBackService.getPSSysBackServiceName());
        }
        return this;
    }

    @JsonProperty(value="pssysbackservicename")
    public void setPSSysBackServiceName(String pSSysBackServiceName) {
        this._set(DTOFIELD_PSSYSBACKSERVICENAME, pSSysBackServiceName);
    }

    @JsonIgnore
    public String getPSSysBackServiceName() {
        Object objValue = this._get(DTOFIELD_PSSYSBACKSERVICENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBackServiceNameDirty() {
        return this._contains(DTOFIELD_PSSYSBACKSERVICENAME);
    }

    @JsonIgnore
    public void resetPSSysBackServiceName() {
        this._reset(DTOFIELD_PSSYSBACKSERVICENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbackservicename(String pSSysBackServiceName) {
        this.setPSSysBackServiceName(pSSysBackServiceName);
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
    public PSDELogicNodeDTO pssysbdschemeid(String pSSysBDSchemeId) {
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme) {
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
    public PSDELogicNodeDTO pssysbdschemename(String pSSysBDSchemeName) {
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
    public PSDELogicNodeDTO pssysbdtableid(String pSSysBDTableId) {
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable) {
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
    public PSDELogicNodeDTO pssysbdtablename(String pSSysBDTableName) {
        this.setPSSysBDTableName(pSSysBDTableName);
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
    public PSDELogicNodeDTO pssysbiaggtableid(String pSSysBIAggTableId) {
        this.setPSSysBIAggTableId(pSSysBIAggTableId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbiaggtableid(PSSysBIAggTableDTO pSSysBIAggTable) {
        if (pSSysBIAggTable == null) {
            this.setPSSysBIAggTableId(null);
            this.setPSSysBIAggTableName(null);
        } else {
            this.setPSSysBIAggTableId(pSSysBIAggTable.getPSSysBIAggTableId());
            this.setPSSysBIAggTableName(pSSysBIAggTable.getPSSysBIAggTableName());
        }
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
    public PSDELogicNodeDTO pssysbiaggtablename(String pSSysBIAggTableName) {
        this.setPSSysBIAggTableName(pSSysBIAggTableName);
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
    public PSDELogicNodeDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbicubeid(PSSysBICubeDTO pSSysBICube) {
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
    public PSDELogicNodeDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonProperty(value="pssysbireportid")
    public void setPSSysBIReportId(String pSSysBIReportId) {
        this._set(DTOFIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }

    @JsonIgnore
    public String getPSSysBIReportId() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportIdDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public void resetPSSysBIReportId() {
        this._reset(DTOFIELD_PSSYSBIREPORTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbireportid(String pSSysBIReportId) {
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbireportid(PSSysBIReportDTO pSSysBIReport) {
        if (pSSysBIReport == null) {
            this.setPSSysBIReportId(null);
            this.setPSSysBIReportName(null);
        } else {
            this.setPSSysBIReportId(pSSysBIReport.getPSSysBIReportId());
            this.setPSSysBIReportName(pSSysBIReport.getPSSysBIReportName());
        }
        return this;
    }

    @JsonProperty(value="pssysbireportname")
    public void setPSSysBIReportName(String pSSysBIReportName) {
        this._set(DTOFIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }

    @JsonIgnore
    public String getPSSysBIReportName() {
        Object objValue = this._get(DTOFIELD_PSSYSBIREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBIReportNameDirty() {
        return this._contains(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public void resetPSSysBIReportName() {
        this._reset(DTOFIELD_PSSYSBIREPORTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbireportname(String pSSysBIReportName) {
        this.setPSSysBIReportName(pSSysBIReportName);
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
    public PSDELogicNodeDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme) {
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
    public PSDELogicNodeDTO pssysbischemename(String pSSysBISchemeName) {
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    @JsonProperty(value="pssysdatasyncagentid")
    public void setPSSysDataSyncAgentId(String pSSysDataSyncAgentId) {
        this._set(DTOFIELD_PSSYSDATASYNCAGENTID, pSSysDataSyncAgentId);
    }

    @JsonIgnore
    public String getPSSysDataSyncAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSDATASYNCAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDataSyncAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public void resetPSSysDataSyncAgentId() {
        this._reset(DTOFIELD_PSSYSDATASYNCAGENTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentid(String pSSysDataSyncAgentId) {
        this.setPSSysDataSyncAgentId(pSSysDataSyncAgentId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent) {
        if (pSSysDataSyncAgent == null) {
            this.setPSSysDataSyncAgentId(null);
            this.setPSSysDataSyncAgentName(null);
        } else {
            this.setPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysdatasyncagentname")
    public void setPSSysDataSyncAgentName(String pSSysDataSyncAgentName) {
        this._set(DTOFIELD_PSSYSDATASYNCAGENTNAME, pSSysDataSyncAgentName);
    }

    @JsonIgnore
    public String getPSSysDataSyncAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSDATASYNCAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDataSyncAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysDataSyncAgentName() {
        this._reset(DTOFIELD_PSSYSDATASYNCAGENTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentname(String pSSysDataSyncAgentName) {
        this.setPSSysDataSyncAgentName(pSSysDataSyncAgentName);
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
    public PSDELogicNodeDTO pssysdbschemeid(String pSSysDBSchemeId) {
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdbschemeid(PSSysDBSchemeDTO pSSysDBScheme) {
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
    public PSDELogicNodeDTO pssysdbschemename(String pSSysDBSchemeName) {
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
    public PSDELogicNodeDTO pssysdbtableid(String pSSysDBTableId) {
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable) {
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
    public PSDELogicNodeDTO pssysdbtablename(String pSSysDBTableName) {
        this.setPSSysDBTableName(pSSysDBTableName);
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
    public PSDELogicNodeDTO pssysdelogicnodeid(String pSSysDELogicNodeId) {
        this.setPSSysDELogicNodeId(pSSysDELogicNodeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysdelogicnodeid(PSSysDELogicNodeDTO pSSysDELogicNode) {
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
    public PSDELogicNodeDTO pssysdelogicnodename(String pSSysDELogicNodeName) {
        this.setPSSysDELogicNodeName(pSSysDELogicNodeName);
        return this;
    }

    @JsonProperty(value="pssyseaielementid")
    public void setPSSysEAIElementId(String pSSysEAIElementId) {
        this._set(DTOFIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }

    @JsonIgnore
    public String getPSSysEAIElementId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public void resetPSSysEAIElementId() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementid(String pSSysEAIElementId) {
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementid(PSSysEAIElementDTO pSSysEAIElement) {
        if (pSSysEAIElement == null) {
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
        } else {
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaielementname")
    public void setPSSysEAIElementName(String pSSysEAIElementName) {
        this._set(DTOFIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }

    @JsonIgnore
    public String getPSSysEAIElementName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAIELEMENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public void resetPSSysEAIElementName() {
        this._reset(DTOFIELD_PSSYSEAIELEMENTNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementname(String pSSysEAIElementName) {
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    @JsonProperty(value="pssyseaischemeid")
    public void setPSSysEAISchemeId(String pSSysEAISchemeId) {
        this._set(DTOFIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }

    @JsonIgnore
    public String getPSSysEAISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeId() {
        this._reset(DTOFIELD_PSSYSEAISCHEMEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemeid(String pSSysEAISchemeId) {
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme) {
        if (pSSysEAIScheme == null) {
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        } else {
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssyseaischemename")
    public void setPSSysEAISchemeName(String pSSysEAISchemeName) {
        this._set(DTOFIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }

    @JsonIgnore
    public String getPSSysEAISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSEAISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysEAISchemeName() {
        this._reset(DTOFIELD_PSSYSEAISCHEMENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemename(String pSSysEAISchemeName) {
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
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
    public PSDELogicNodeDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDELogicNodeDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysresourceid")
    public void setPSSysResourceId(String pSSysResourceId) {
        this._set(DTOFIELD_PSSYSRESOURCEID, pSSysResourceId);
    }

    @JsonIgnore
    public String getPSSysResourceId() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceIdDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public void resetPSSysResourceId() {
        this._reset(DTOFIELD_PSSYSRESOURCEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
        if (pSSysResource == null) {
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        } else {
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    @JsonProperty(value="pssysresourcename")
    public void setPSSysResourceName(String pSSysResourceName) {
        this._set(DTOFIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }

    @JsonIgnore
    public String getPSSysResourceName() {
        Object objValue = this._get(DTOFIELD_PSSYSRESOURCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysResourceNameDirty() {
        return this._contains(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public void resetPSSysResourceName() {
        this._reset(DTOFIELD_PSSYSRESOURCENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
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
    public PSDELogicNodeDTO pssyssearchdocid(String pSSysSearchDocId) {
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc) {
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
    public PSDELogicNodeDTO pssyssearchdocname(String pSSysSearchDocName) {
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
    public PSDELogicNodeDTO pssyssearchschemeid(String pSSysSearchSchemeId) {
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme) {
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
    public PSDELogicNodeDTO pssyssearchschemename(String pSSysSearchSchemeName) {
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
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
    public PSDELogicNodeDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDELogicNodeDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssyssqlcmdid")
    public void setPSSysSQLCmdId(String pSSysSQLCmdId) {
        this._set(DTOFIELD_PSSYSSQLCMDID, pSSysSQLCmdId);
    }

    @JsonIgnore
    public String getPSSysSQLCmdId() {
        Object objValue = this._get(DTOFIELD_PSSYSSQLCMDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSQLCmdIdDirty() {
        return this._contains(DTOFIELD_PSSYSSQLCMDID);
    }

    @JsonIgnore
    public void resetPSSysSQLCmdId() {
        this._reset(DTOFIELD_PSSYSSQLCMDID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyssqlcmdid(String pSSysSQLCmdId) {
        this.setPSSysSQLCmdId(pSSysSQLCmdId);
        return this;
    }

    @JsonProperty(value="pssyssqlcmdname")
    public void setPSSysSQLCmdName(String pSSysSQLCmdName) {
        this._set(DTOFIELD_PSSYSSQLCMDNAME, pSSysSQLCmdName);
    }

    @JsonIgnore
    public String getPSSysSQLCmdName() {
        Object objValue = this._get(DTOFIELD_PSSYSSQLCMDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSQLCmdNameDirty() {
        return this._contains(DTOFIELD_PSSYSSQLCMDNAME);
    }

    @JsonIgnore
    public void resetPSSysSQLCmdName() {
        this._reset(DTOFIELD_PSSYSSQLCMDNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssyssqlcmdname(String pSSysSQLCmdName) {
        this.setPSSysSQLCmdName(pSSysSQLCmdName);
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
    public PSDELogicNodeDTO pssysunistateid(String pSSysUniStateId) {
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysunistateid(PSSysUniStateDTO pSSysUniState) {
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
    public PSDELogicNodeDTO pssysunistatename(String pSSysUniStateName) {
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonProperty(value="pssysutildeid")
    public void setPSSysUtilDEId(String pSSysUtilDEId) {
        this._set(DTOFIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }

    @JsonIgnore
    public String getPSSysUtilDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public void resetPSSysUtilDEId() {
        this._reset(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysutildeid(String pSSysUtilDEId) {
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysutildeid(PSSysUtilDTO pSSysUtil) {
        if (pSSysUtil == null) {
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        } else {
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonProperty(value="pssysutildename")
    public void setPSSysUtilDEName(String pSSysUtilDEName) {
        this._set(DTOFIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }

    @JsonIgnore
    public String getPSSysUtilDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDENameDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public void resetPSSysUtilDEName() {
        this._reset(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pssysutildename(String pSSysUtilDEName) {
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="psviewmsgid")
    public void setPSViewMsgId(String pSViewMsgId) {
        this._set(DTOFIELD_PSVIEWMSGID, pSViewMsgId);
    }

    @JsonIgnore
    public String getPSViewMsgId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGID);
    }

    @JsonIgnore
    public void resetPSViewMsgId() {
        this._reset(DTOFIELD_PSVIEWMSGID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psviewmsgid(String pSViewMsgId) {
        this.setPSViewMsgId(pSViewMsgId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO psviewmsgid(PSViewMsgDTO pSViewMsg) {
        if (pSViewMsg == null) {
            this.setPSViewMsgId(null);
            this.setPSViewMsgName(null);
        } else {
            this.setPSViewMsgId(pSViewMsg.getPSViewMsgId());
            this.setPSViewMsgName(pSViewMsg.getPSViewMsgName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsgname")
    public void setPSViewMsgName(String pSViewMsgName) {
        this._set(DTOFIELD_PSVIEWMSGNAME, pSViewMsgName);
    }

    @JsonIgnore
    public String getPSViewMsgName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgName() {
        this._reset(DTOFIELD_PSVIEWMSGNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psviewmsgname(String pSViewMsgName) {
        this.setPSViewMsgName(pSViewMsgName);
        return this;
    }

    @JsonProperty(value="pswfdeid")
    public void setPSWFDEId(String pSWFDEId) {
        this._set(DTOFIELD_PSWFDEID, pSWFDEId);
    }

    @JsonIgnore
    public String getPSWFDEId() {
        Object objValue = this._get(DTOFIELD_PSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDEIdDirty() {
        return this._contains(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public void resetPSWFDEId() {
        this._reset(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO pswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
        } else {
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    @JsonProperty(value="pswfdename")
    public void setPSWFDEName(String pSWFDEName) {
        this._set(DTOFIELD_PSWFDENAME, pSWFDEName);
    }

    @JsonIgnore
    public String getPSWFDEName() {
        Object objValue = this._get(DTOFIELD_PSWFDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDENameDirty() {
        return this._contains(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public void resetPSWFDEName() {
        this._reset(DTOFIELD_PSWFDENAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO pswfdename(String pSWFDEName) {
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    @JsonProperty(value="psworkflowid")
    public void setPSWorkflowId(String pSWorkflowId) {
        this._set(DTOFIELD_PSWORKFLOWID, pSWorkflowId);
    }

    @JsonIgnore
    public String getPSWorkflowId() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowIdDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public void resetPSWorkflowId() {
        this._reset(DTOFIELD_PSWORKFLOWID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psworkflowid(String pSWorkflowId) {
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO psworkflowid(PSWorkflowDTO pSWorkflow) {
        if (pSWorkflow == null) {
            this.setPSWorkflowId(null);
            this.setPSWorkflowName(null);
        } else {
            this.setPSWorkflowId(pSWorkflow.getPSWorkflowId());
            this.setPSWorkflowName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    @JsonProperty(value="psworkflowname")
    public void setPSWorkflowName(String pSWorkflowName) {
        this._set(DTOFIELD_PSWORKFLOWNAME, pSWorkflowName);
    }

    @JsonIgnore
    public String getPSWorkflowName() {
        Object objValue = this._get(DTOFIELD_PSWORKFLOWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWorkflowNameDirty() {
        return this._contains(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public void resetPSWorkflowName() {
        this._reset(DTOFIELD_PSWORKFLOWNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO psworkflowname(String pSWorkflowName) {
        this.setPSWorkflowName(pSWorkflowName);
        return this;
    }

    @JsonProperty(value="retpsdlparamid")
    public void setRetPSDLParamId(String retPSDLParamId) {
        this._set(DTOFIELD_RETPSDLPARAMID, retPSDLParamId);
    }

    @JsonIgnore
    public String getRetPSDLParamId() {
        Object objValue = this._get(DTOFIELD_RETPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetPSDLParamIdDirty() {
        return this._contains(DTOFIELD_RETPSDLPARAMID);
    }

    @JsonIgnore
    public void resetRetPSDLParamId() {
        this._reset(DTOFIELD_RETPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamid(String retPSDLParamId) {
        this.setRetPSDLParamId(retPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setRetPSDLParamId(null);
            this.setRetPSDLParamName(null);
        } else {
            this.setRetPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setRetPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="retpsdlparamname")
    public void setRetPSDLParamName(String retPSDLParamName) {
        this._set(DTOFIELD_RETPSDLPARAMNAME, retPSDLParamName);
    }

    @JsonIgnore
    public String getRetPSDLParamName() {
        Object objValue = this._get(DTOFIELD_RETPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetPSDLParamNameDirty() {
        return this._contains(DTOFIELD_RETPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetRetPSDLParamName() {
        this._reset(DTOFIELD_RETPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamname(String retPSDLParamName) {
        this.setRetPSDLParamName(retPSDLParamName);
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
    public PSDELogicNodeDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
        return this;
    }

    @JsonProperty(value="srcindex")
    public void setSrcIndex(Integer srcIndex) {
        this._set(DTOFIELD_SRCINDEX, srcIndex);
    }

    @JsonIgnore
    public Integer getSrcIndex() {
        Object objValue = this._get(DTOFIELD_SRCINDEX);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcIndexDirty() {
        return this._contains(DTOFIELD_SRCINDEX);
    }

    @JsonIgnore
    public void resetSrcIndex() {
        this._reset(DTOFIELD_SRCINDEX);
    }

    @JsonIgnore
    public PSDELogicNodeDTO srcindex(Integer srcIndex) {
        this.setSrcIndex(srcIndex);
        return this;
    }

    @JsonProperty(value="srcpsdlparamid")
    public void setSrcPSDLParamId(String srcPSDLParamId) {
        this._set(DTOFIELD_SRCPSDLPARAMID, srcPSDLParamId);
    }

    @JsonIgnore
    public String getSrcPSDLParamId() {
        Object objValue = this._get(DTOFIELD_SRCPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDLParamIdDirty() {
        return this._contains(DTOFIELD_SRCPSDLPARAMID);
    }

    @JsonIgnore
    public void resetSrcPSDLParamId() {
        this._reset(DTOFIELD_SRCPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELogicNodeDTO srcpsdlparamid(String srcPSDLParamId) {
        this.setSrcPSDLParamId(srcPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO srcpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        } else {
            this.setSrcPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setSrcPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="srcpsdlparamname")
    public void setSrcPSDLParamName(String srcPSDLParamName) {
        this._set(DTOFIELD_SRCPSDLPARAMNAME, srcPSDLParamName);
    }

    @JsonIgnore
    public String getSrcPSDLParamName() {
        Object objValue = this._get(DTOFIELD_SRCPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDLParamNameDirty() {
        return this._contains(DTOFIELD_SRCPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetSrcPSDLParamName() {
        this._reset(DTOFIELD_SRCPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELogicNodeDTO srcpsdlparamname(String srcPSDLParamName) {
        this.setSrcPSDLParamName(srcPSDLParamName);
        return this;
    }

    @JsonProperty(value="srcsize")
    public void setSrcSize(Integer srcSize) {
        this._set(DTOFIELD_SRCSIZE, srcSize);
    }

    @JsonIgnore
    public Integer getSrcSize() {
        Object objValue = this._get(DTOFIELD_SRCSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcSizeDirty() {
        return this._contains(DTOFIELD_SRCSIZE);
    }

    @JsonIgnore
    public void resetSrcSize() {
        this._reset(DTOFIELD_SRCSIZE);
    }

    @JsonIgnore
    public PSDELogicNodeDTO srcsize(Integer srcSize) {
        this.setSrcSize(srcSize);
        return this;
    }

    @JsonProperty(value="threadrunmode")
    public void setThreadRunMode(Integer threadRunMode) {
        this._set(DTOFIELD_THREADRUNMODE, threadRunMode);
    }

    @JsonIgnore
    public Integer getThreadRunMode() {
        Object objValue = this._get(DTOFIELD_THREADRUNMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThreadRunModeDirty() {
        return this._contains(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public void resetThreadRunMode() {
        this._reset(DTOFIELD_THREADRUNMODE);
    }

    @JsonIgnore
    public PSDELogicNodeDTO threadrunmode(Integer threadRunMode) {
        this.setThreadRunMode(threadRunMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO threadrunmode(PSModelEnums.DELogicNodeThreadRunMode threadRunMode) {
        if (threadRunMode == null) {
            this.setThreadRunMode(null);
        } else {
            this.setThreadRunMode(threadRunMode.value);
        }
        return this;
    }

    @JsonProperty(value="threadruntimer")
    public void setThreadRunTimer(Integer threadRunTimer) {
        this._set(DTOFIELD_THREADRUNTIMER, threadRunTimer);
    }

    @JsonIgnore
    public Integer getThreadRunTimer() {
        Object objValue = this._get(DTOFIELD_THREADRUNTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isThreadRunTimerDirty() {
        return this._contains(DTOFIELD_THREADRUNTIMER);
    }

    @JsonIgnore
    public void resetThreadRunTimer() {
        this._reset(DTOFIELD_THREADRUNTIMER);
    }

    @JsonIgnore
    public PSDELogicNodeDTO threadruntimer(Integer threadRunTimer) {
        this.setThreadRunTimer(threadRunTimer);
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
    public PSDELogicNodeDTO toppos(Integer topPos) {
        this.setTopPos(topPos);
        return this;
    }

    @JsonProperty(value="tsmode")
    public void setTSMode(Integer tSMode) {
        this._set(DTOFIELD_TSMODE, tSMode);
    }

    @JsonIgnore
    public Integer getTSMode() {
        Object objValue = this._get(DTOFIELD_TSMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
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
    public PSDELogicNodeDTO tsmode(Integer tSMode) {
        this.setTSMode(tSMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO tsmode(PSModelEnums.DELogicNodeTSMode tSMode) {
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
    public PSDELogicNodeDTO updatedate(Timestamp updateDate) {
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
    public PSDELogicNodeDTO updateman(String updateMan) {
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
    public PSDELogicNodeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELogicNodeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDELogicNodeDTO userparams(String userParams) {
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
    public PSDELogicNodeDTO usertag(String userTag) {
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
    public PSDELogicNodeDTO usertag2(String userTag2) {
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
    public PSDELogicNodeDTO usertag3(String userTag3) {
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
    public PSDELogicNodeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELogicNodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELogicNodeId(strValue);
    }

    @JsonIgnore
    public PSDELogicNodeDTO id(String strValue) {
        this.setPSDELogicNodeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<Object> getPSDELNParams() {
        Object list = this._get(DTOFIELD_PSDELNPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdelnparams")
    public void setPSDELNParams(List<Object> psdelnparams) {
        this._set(DTOFIELD_PSDELNPARAMS, psdelnparams);
    }

    @JsonIgnore
    public List<Object> getPSDELNParamsIf() {
        Object list = this._get(DTOFIELD_PSDELNPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELNPARAMS, list);
        }
        return (List) list;
    }
}
