package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEACModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataRelationDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEReportDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPanelItemLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDashboardDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEditorStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPDTViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysResourceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchBarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysViewPanelItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ACTIVEDATAMODE = "ACTIVEDATAMODE";
    protected static final String DTOFIELD_ACTIVEDATAMODE = "activedatamode";
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_AL_POS = "AL_POS";
    protected static final String DTOFIELD_AL_POS = "al_pos";
    public static final String FIELD_BL_POS = "BL_POS";
    protected static final String DTOFIELD_BL_POS = "bl_pos";
    public static final String FIELD_BORDERSTYLE = "BORDERSTYLE";
    protected static final String DTOFIELD_BORDERSTYLE = "borderstyle";
    public static final String FIELD_BOTTOMPOS = "BOTTOMPOS";
    protected static final String DTOFIELD_BOTTOMPOS = "bottompos";
    public static final String FIELD_BTNACTIONTYPE = "BTNACTIONTYPE";
    protected static final String DTOFIELD_BTNACTIONTYPE = "btnactiontype";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CAPTIONPOS = "CAPTIONPOS";
    protected static final String DTOFIELD_CAPTIONPOS = "captionpos";
    public static final String FIELD_CHILD_COL_LG = "CHILD_COL_LG";
    protected static final String DTOFIELD_CHILD_COL_LG = "child_col_lg";
    public static final String FIELD_CHILD_COL_MD = "CHILD_COL_MD";
    protected static final String DTOFIELD_CHILD_COL_MD = "child_col_md";
    public static final String FIELD_CHILD_COL_SM = "CHILD_COL_SM";
    protected static final String DTOFIELD_CHILD_COL_SM = "child_col_sm";
    public static final String FIELD_CHILD_COL_XS = "CHILD_COL_XS";
    protected static final String DTOFIELD_CHILD_COL_XS = "child_col_xs";
    public static final String FIELD_COLID = "COLID";
    protected static final String DTOFIELD_COLID = "colid";
    public static final String FIELD_COLLAPSIBLEFLAG = "COLLAPSIBLEFLAG";
    protected static final String DTOFIELD_COLLAPSIBLEFLAG = "collapsibleflag";
    public static final String FIELD_COLMODEL = "COLMODEL";
    protected static final String DTOFIELD_COLMODEL = "colmodel";
    public static final String FIELD_COLSPAN = "COLSPAN";
    protected static final String DTOFIELD_COLSPAN = "colspan";
    public static final String FIELD_COL_LG = "COL_LG";
    protected static final String DTOFIELD_COL_LG = "col_lg";
    public static final String FIELD_COL_LG_OS = "COL_LG_OS";
    protected static final String DTOFIELD_COL_LG_OS = "col_lg_os";
    public static final String FIELD_COL_MD = "COL_MD";
    protected static final String DTOFIELD_COL_MD = "col_md";
    public static final String FIELD_COL_MD_OS = "COL_MD_OS";
    protected static final String DTOFIELD_COL_MD_OS = "col_md_os";
    public static final String FIELD_COL_SM = "COL_SM";
    protected static final String DTOFIELD_COL_SM = "col_sm";
    public static final String FIELD_COL_SM_OS = "COL_SM_OS";
    protected static final String DTOFIELD_COL_SM_OS = "col_sm_os";
    public static final String FIELD_COL_WIDTH = "COL_WIDTH";
    protected static final String DTOFIELD_COL_WIDTH = "col_width";
    public static final String FIELD_COL_XS = "COL_XS";
    protected static final String DTOFIELD_COL_XS = "col_xs";
    public static final String FIELD_COL_XS_OS = "COL_XS_OS";
    protected static final String DTOFIELD_COL_XS_OS = "col_xs_os";
    public static final String FIELD_CONTENTTYPE = "CONTENTTYPE";
    protected static final String DTOFIELD_CONTENTTYPE = "contenttype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLDYNACLASS = "CTRLDYNACLASS";
    protected static final String DTOFIELD_CTRLDYNACLASS = "ctrldynaclass";
    public static final String FIELD_CTRLHEIGHT = "CTRLHEIGHT";
    protected static final String DTOFIELD_CTRLHEIGHT = "ctrlheight";
    public static final String FIELD_CTRLPSSYSCSSID = "CTRLPSSYSCSSID";
    protected static final String DTOFIELD_CTRLPSSYSCSSID = "ctrlpssyscssid";
    public static final String FIELD_CTRLPSSYSCSSNAME = "CTRLPSSYSCSSNAME";
    protected static final String DTOFIELD_CTRLPSSYSCSSNAME = "ctrlpssyscssname";
    public static final String FIELD_CTRLRAWCSSSTYLE = "CTRLRAWCSSSTYLE";
    protected static final String DTOFIELD_CTRLRAWCSSSTYLE = "ctrlrawcssstyle";
    public static final String FIELD_CTRLTYPE = "CTRLTYPE";
    protected static final String DTOFIELD_CTRLTYPE = "ctrltype";
    public static final String FIELD_CTRLWIDTH = "CTRLWIDTH";
    protected static final String DTOFIELD_CTRLWIDTH = "ctrlwidth";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DATAPANELMODE = "DATAPANELMODE";
    protected static final String DTOFIELD_DATAPANELMODE = "datapanelmode";
    public static final String FIELD_DATASOURCE = "DATASOURCE";
    protected static final String DTOFIELD_DATASOURCE = "datasource";
    public static final String FIELD_DATASOURCETEXT = "DATASOURCETEXT";
    protected static final String DTOFIELD_DATASOURCETEXT = "datasourcetext";
    public static final String FIELD_DETAILSTYLE = "DETAILSTYLE";
    protected static final String DTOFIELD_DETAILSTYLE = "detailstyle";
    public static final String FIELD_DETAILSTYLETEXT = "DETAILSTYLETEXT";
    protected static final String DTOFIELD_DETAILSTYLETEXT = "detailstyletext";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_EMPTYCAPTION = "EMPTYCAPTION";
    protected static final String DTOFIELD_EMPTYCAPTION = "emptycaption";
    public static final String FIELD_ENABLEANCHOR = "ENABLEANCHOR";
    protected static final String DTOFIELD_ENABLEANCHOR = "enableanchor";
    public static final String FIELD_FIELDNAME = "FIELDNAME";
    protected static final String DTOFIELD_FIELDNAME = "fieldname";
    public static final String FIELD_FIELDSTATES = "FIELDSTATES";
    protected static final String DTOFIELD_FIELDSTATES = "fieldstates";
    public static final String FIELD_FLEXALIGN = "FLEXALIGN";
    protected static final String DTOFIELD_FLEXALIGN = "flexalign";
    public static final String FIELD_FLEXBASIS = "FLEXBASIS";
    protected static final String DTOFIELD_FLEXBASIS = "flexbasis";
    public static final String FIELD_FLEXDIR = "FLEXDIR";
    protected static final String DTOFIELD_FLEXDIR = "flexdir";
    public static final String FIELD_FLEXGROW = "FLEXGROW";
    protected static final String DTOFIELD_FLEXGROW = "flexgrow";
    public static final String FIELD_FLEXSHRINK = "FLEXSHRINK";
    protected static final String DTOFIELD_FLEXSHRINK = "flexshrink";
    public static final String FIELD_FLEXVALIGN = "FLEXVALIGN";
    protected static final String DTOFIELD_FLEXVALIGN = "flexvalign";
    public static final String FIELD_GETDATATIMER = "GETDATATIMER";
    protected static final String DTOFIELD_GETDATATIMER = "getdatatimer";
    public static final String FIELD_GRIDROWID = "GRIDROWID";
    protected static final String DTOFIELD_GRIDROWID = "gridrowid";
    public static final String FIELD_HALIGN = "HALIGN";
    protected static final String DTOFIELD_HALIGN = "halign";
    public static final String FIELD_HALIGNSELF = "HALIGNSELF";
    protected static final String DTOFIELD_HALIGNSELF = "halignself";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_HEIGHTMODE = "HEIGHTMODE";
    protected static final String DTOFIELD_HEIGHTMODE = "heightmode";
    public static final String FIELD_HTMLCONTENT = "HTMLCONTENT";
    protected static final String DTOFIELD_HTMLCONTENT = "htmlcontent";
    public static final String FIELD_HTMLPAGEURL = "HTMLPAGEURL";
    protected static final String DTOFIELD_HTMLPAGEURL = "htmlpageurl";
    public static final String FIELD_ICONALIGN = "ICONALIGN";
    protected static final String DTOFIELD_ICONALIGN = "iconalign";
    public static final String FIELD_IGNOREINPUT = "IGNOREINPUT";
    protected static final String DTOFIELD_IGNOREINPUT = "ignoreinput";
    public static final String FIELD_ITEMPARAM = "ITEMPARAM";
    protected static final String DTOFIELD_ITEMPARAM = "itemparam";
    public static final String FIELD_ITEMPARAM10 = "ITEMPARAM10";
    protected static final String DTOFIELD_ITEMPARAM10 = "itemparam10";
    public static final String FIELD_ITEMPARAM11 = "ITEMPARAM11";
    protected static final String DTOFIELD_ITEMPARAM11 = "itemparam11";
    public static final String FIELD_ITEMPARAM12 = "ITEMPARAM12";
    protected static final String DTOFIELD_ITEMPARAM12 = "itemparam12";
    public static final String FIELD_ITEMPARAM2 = "ITEMPARAM2";
    protected static final String DTOFIELD_ITEMPARAM2 = "itemparam2";
    public static final String FIELD_ITEMPARAM3 = "ITEMPARAM3";
    protected static final String DTOFIELD_ITEMPARAM3 = "itemparam3";
    public static final String FIELD_ITEMPARAM4 = "ITEMPARAM4";
    protected static final String DTOFIELD_ITEMPARAM4 = "itemparam4";
    public static final String FIELD_ITEMPARAM5 = "ITEMPARAM5";
    protected static final String DTOFIELD_ITEMPARAM5 = "itemparam5";
    public static final String FIELD_ITEMPARAM6 = "ITEMPARAM6";
    protected static final String DTOFIELD_ITEMPARAM6 = "itemparam6";
    public static final String FIELD_ITEMPARAM7 = "ITEMPARAM7";
    protected static final String DTOFIELD_ITEMPARAM7 = "itemparam7";
    public static final String FIELD_ITEMPARAM8 = "ITEMPARAM8";
    protected static final String DTOFIELD_ITEMPARAM8 = "itemparam8";
    public static final String FIELD_ITEMPARAM9 = "ITEMPARAM9";
    protected static final String DTOFIELD_ITEMPARAM9 = "itemparam9";
    public static final String FIELD_ITEMPARAMS = "ITEMPARAMS";
    protected static final String DTOFIELD_ITEMPARAMS = "itemparams";
    public static final String FIELD_ITEMTYPE = "ITEMTYPE";
    protected static final String DTOFIELD_ITEMTYPE = "itemtype";
    public static final String FIELD_LABELDYNACLASS = "LABELDYNACLASS";
    protected static final String DTOFIELD_LABELDYNACLASS = "labeldynaclass";
    public static final String FIELD_LABELPSSYSCSSID = "LABELPSSYSCSSID";
    protected static final String DTOFIELD_LABELPSSYSCSSID = "labelpssyscssid";
    public static final String FIELD_LABELPSSYSCSSNAME = "LABELPSSYSCSSNAME";
    protected static final String DTOFIELD_LABELPSSYSCSSNAME = "labelpssyscssname";
    public static final String FIELD_LABELRAWCSSSTYLE = "LABELRAWCSSSTYLE";
    protected static final String DTOFIELD_LABELRAWCSSSTYLE = "labelrawcssstyle";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_LEFTPOS = "LEFTPOS";
    protected static final String DTOFIELD_LEFTPOS = "leftpos";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_OPENPSAPPVIEWID = "OPENPSAPPVIEWID";
    protected static final String DTOFIELD_OPENPSAPPVIEWID = "openpsappviewid";
    public static final String FIELD_OPENPSAPPVIEWNAME = "OPENPSAPPVIEWNAME";
    protected static final String DTOFIELD_OPENPSAPPVIEWNAME = "openpsappviewname";
    public static final String FIELD_OPENPSDEVIEWID = "OPENPSDEVIEWID";
    protected static final String DTOFIELD_OPENPSDEVIEWID = "openpsdeviewid";
    public static final String FIELD_OPENPSDEVIEWNAME = "OPENPSDEVIEWNAME";
    protected static final String DTOFIELD_OPENPSDEVIEWNAME = "openpsdeviewname";
    public static final String FIELD_OPENPSSYSPDTVIEWID = "OPENPSSYSPDTVIEWID";
    protected static final String DTOFIELD_OPENPSSYSPDTVIEWID = "openpssyspdtviewid";
    public static final String FIELD_OPENPSSYSPDTVIEWNAME = "OPENPSSYSPDTVIEWNAME";
    protected static final String DTOFIELD_OPENPSSYSPDTVIEWNAME = "openpssyspdtviewname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_ORIENTATIONMODE = "ORIENTATIONMODE";
    protected static final String DTOFIELD_ORIENTATIONMODE = "orientationmode";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PLAYOUTMODE = "PLAYOUTMODE";
    protected static final String DTOFIELD_PLAYOUTMODE = "playoutmode";
    public static final String FIELD_PPSSYSVIEWPANELITEMID = "PPSSYSVIEWPANELITEMID";
    protected static final String DTOFIELD_PPSSYSVIEWPANELITEMID = "ppssysviewpanelitemid";
    public static final String FIELD_PPSSYSVIEWPANELITEMNAME = "PPSSYSVIEWPANELITEMNAME";
    protected static final String DTOFIELD_PPSSYSVIEWPANELITEMNAME = "ppssysviewpanelitemname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSCTRLID = "PSCTRLID";
    protected static final String DTOFIELD_PSCTRLID = "psctrlid";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSCTRLNAME = "PSCTRLNAME";
    protected static final String DTOFIELD_PSCTRLNAME = "psctrlname";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDECHARTID = "PSDECHARTID";
    protected static final String DTOFIELD_PSDECHARTID = "psdechartid";
    public static final String FIELD_PSDECHARTNAME = "PSDECHARTNAME";
    protected static final String DTOFIELD_PSDECHARTNAME = "psdechartname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEDATAVIEWID = "PSDEDATAVIEWID";
    protected static final String DTOFIELD_PSDEDATAVIEWID = "psdedataviewid";
    public static final String FIELD_PSDEDATAVIEWNAME = "PSDEDATAVIEWNAME";
    protected static final String DTOFIELD_PSDEDATAVIEWNAME = "psdedataviewname";
    public static final String FIELD_PSDEDRID = "PSDEDRID";
    protected static final String DTOFIELD_PSDEDRID = "psdedrid";
    public static final String FIELD_PSDEDRITEMID = "PSDEDRITEMID";
    protected static final String DTOFIELD_PSDEDRITEMID = "psdedritemid";
    public static final String FIELD_PSDEDRITEMNAME = "PSDEDRITEMNAME";
    protected static final String DTOFIELD_PSDEDRITEMNAME = "psdedritemname";
    public static final String FIELD_PSDEDRNAME = "PSDEDRNAME";
    protected static final String DTOFIELD_PSDEDRNAME = "psdedrname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELISTID = "PSDELISTID";
    protected static final String DTOFIELD_PSDELISTID = "psdelistid";
    public static final String FIELD_PSDELISTNAME = "PSDELISTNAME";
    protected static final String DTOFIELD_PSDELISTNAME = "psdelistname";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEPANELID = "PSDEPANELID";
    protected static final String DTOFIELD_PSDEPANELID = "psdepanelid";
    public static final String FIELD_PSDEPANELNAME = "PSDEPANELNAME";
    protected static final String DTOFIELD_PSDEPANELNAME = "psdepanelname";
    public static final String FIELD_PSDEREPORTID = "PSDEREPORTID";
    protected static final String DTOFIELD_PSDEREPORTID = "psdereportid";
    public static final String FIELD_PSDEREPORTNAME = "PSDEREPORTNAME";
    protected static final String DTOFIELD_PSDEREPORTNAME = "psdereportname";
    public static final String FIELD_PSDESEARCHFORMID = "PSDESEARCHFORMID";
    protected static final String DTOFIELD_PSDESEARCHFORMID = "psdesearchformid";
    public static final String FIELD_PSDESEARCHFORMNAME = "PSDESEARCHFORMNAME";
    protected static final String DTOFIELD_PSDESEARCHFORMNAME = "psdesearchformname";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSDEWIZARDID = "PSDEWIZARDID";
    protected static final String DTOFIELD_PSDEWIZARDID = "psdewizardid";
    public static final String FIELD_PSDEWIZARDNAME = "PSDEWIZARDNAME";
    protected static final String DTOFIELD_PSDEWIZARDNAME = "psdewizardname";
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARNAME = "PSSYSCALENDARNAME";
    protected static final String DTOFIELD_PSSYSCALENDARNAME = "pssyscalendarname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDASHBOARDID = "PSSYSDASHBOARDID";
    protected static final String DTOFIELD_PSSYSDASHBOARDID = "pssysdashboardid";
    public static final String FIELD_PSSYSDASHBOARDNAME = "PSSYSDASHBOARDNAME";
    protected static final String DTOFIELD_PSSYSDASHBOARDNAME = "pssysdashboardname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSMAPVIEWID = "PSSYSMAPVIEWID";
    protected static final String DTOFIELD_PSSYSMAPVIEWID = "pssysmapviewid";
    public static final String FIELD_PSSYSMAPVIEWNAME = "PSSYSMAPVIEWNAME";
    protected static final String DTOFIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_PSSYSSEARCHBARID = "PSSYSSEARCHBARID";
    protected static final String DTOFIELD_PSSYSSEARCHBARID = "pssyssearchbarid";
    public static final String FIELD_PSSYSSEARCHBARNAME = "PSSYSSEARCHBARNAME";
    protected static final String DTOFIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELITEMID = "PSSYSVIEWPANELITEMID";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";
    public static final String FIELD_PSSYSVIEWPANELITEMNAME = "PSSYSVIEWPANELITEMNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_RAWCSSSTYLE = "RAWCSSSTYLE";
    protected static final String DTOFIELD_RAWCSSSTYLE = "rawcssstyle";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_READONLYMODE = "READONLYMODE";
    protected static final String DTOFIELD_READONLYMODE = "readonlymode";
    public static final String FIELD_REFCTRL2NAME = "REFCTRL2NAME";
    protected static final String DTOFIELD_REFCTRL2NAME = "refctrl2name";
    public static final String FIELD_REFCTRL2USAGE = "REFCTRL2USAGE";
    protected static final String DTOFIELD_REFCTRL2USAGE = "refctrl2usage";
    public static final String FIELD_REFCTRL2USAGETEXT = "REFCTRL2USAGETEXT";
    protected static final String DTOFIELD_REFCTRL2USAGETEXT = "refctrl2usagetext";
    public static final String FIELD_REFCTRLNAME = "REFCTRLNAME";
    protected static final String DTOFIELD_REFCTRLNAME = "refctrlname";
    public static final String FIELD_REFCTRLUSAGE = "REFCTRLUSAGE";
    protected static final String DTOFIELD_REFCTRLUSAGE = "refctrlusage";
    public static final String FIELD_REFCTRLUSAGETEXT = "REFCTRLUSAGETEXT";
    protected static final String DTOFIELD_REFCTRLUSAGETEXT = "refctrlusagetext";
    public static final String FIELD_REFLINKPSDEVIEWID = "REFLINKPSDEVIEWID";
    protected static final String DTOFIELD_REFLINKPSDEVIEWID = "reflinkpsdeviewid";
    public static final String FIELD_REFLINKPSDEVIEWNAME = "REFLINKPSDEVIEWNAME";
    protected static final String DTOFIELD_REFLINKPSDEVIEWNAME = "reflinkpsdeviewname";
    public static final String FIELD_REFPICKUPPSDEVIEWID = "REFPICKUPPSDEVIEWID";
    protected static final String DTOFIELD_REFPICKUPPSDEVIEWID = "refpickuppsdeviewid";
    public static final String FIELD_REFPICKUPPSDEVIEWNAME = "REFPICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_REFPICKUPPSDEVIEWNAME = "refpickuppsdeviewname";
    public static final String FIELD_REFPSDEACMODEID = "REFPSDEACMODEID";
    protected static final String DTOFIELD_REFPSDEACMODEID = "refpsdeacmodeid";
    public static final String FIELD_REFPSDEACMODENAME = "REFPSDEACMODENAME";
    protected static final String DTOFIELD_REFPSDEACMODENAME = "refpsdeacmodename";
    public static final String FIELD_REFPSDEDATASETID = "REFPSDEDATASETID";
    protected static final String DTOFIELD_REFPSDEDATASETID = "refpsdedatasetid";
    public static final String FIELD_REFPSDEDATASETNAME = "REFPSDEDATASETNAME";
    protected static final String DTOFIELD_REFPSDEDATASETNAME = "refpsdedatasetname";
    public static final String FIELD_REFPSDEID = "REFPSDEID";
    protected static final String DTOFIELD_REFPSDEID = "refpsdeid";
    public static final String FIELD_REFPSDENAME = "REFPSDENAME";
    protected static final String DTOFIELD_REFPSDENAME = "refpsdename";
    public static final String FIELD_RENDERMODE = "RENDERMODE";
    protected static final String DTOFIELD_RENDERMODE = "rendermode";
    public static final String FIELD_RENDERMODETEXT = "RENDERMODETEXT";
    protected static final String DTOFIELD_RENDERMODETEXT = "rendermodetext";
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_RIGHTPOS = "RIGHTPOS";
    protected static final String DTOFIELD_RIGHTPOS = "rightpos";
    public static final String FIELD_ROWSPAN = "ROWSPAN";
    protected static final String DTOFIELD_ROWSPAN = "rowspan";
    public static final String FIELD_SHOWCAPTION = "SHOWCAPTION";
    protected static final String DTOFIELD_SHOWCAPTION = "showcaption";
    public static final String FIELD_SPACINGBOTTOM = "SPACINGBOTTOM";
    protected static final String DTOFIELD_SPACINGBOTTOM = "spacingbottom";
    public static final String FIELD_SPACINGLEFT = "SPACINGLEFT";
    protected static final String DTOFIELD_SPACINGLEFT = "spacingleft";
    public static final String FIELD_SPACINGRIGHT = "SPACINGRIGHT";
    protected static final String DTOFIELD_SPACINGRIGHT = "spacingright";
    public static final String FIELD_SPACINGTOP = "SPACINGTOP";
    protected static final String DTOFIELD_SPACINGTOP = "spacingtop";
    public static final String FIELD_SWAPMODE = "SWAPMODE";
    protected static final String DTOFIELD_SWAPMODE = "swapmode";
    public static final String FIELD_TABINDEX = "TABINDEX";
    protected static final String DTOFIELD_TABINDEX = "tabindex";
    public static final String FIELD_TARGETID = "TARGETID";
    protected static final String DTOFIELD_TARGETID = "targetid";
    public static final String FIELD_TARGETNAME = "TARGETNAME";
    protected static final String DTOFIELD_TARGETNAME = "targetname";
    public static final String FIELD_TARGETTYPE = "TARGETTYPE";
    protected static final String DTOFIELD_TARGETTYPE = "targettype";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TITLEBARCLOSEMODE = "TITLEBARCLOSEMODE";
    protected static final String DTOFIELD_TITLEBARCLOSEMODE = "titlebarclosemode";
    public static final String FIELD_TOGGLEMODE = "TOGGLEMODE";
    protected static final String DTOFIELD_TOGGLEMODE = "togglemode";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_TOPPOS = "TOPPOS";
    protected static final String DTOFIELD_TOPPOS = "toppos";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALIGN = "VALIGN";
    protected static final String DTOFIELD_VALIGN = "valign";
    public static final String FIELD_VALIGNSELF = "VALIGNSELF";
    protected static final String DTOFIELD_VALIGNSELF = "valignself";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUEITEMNAME = "VALUEITEMNAME";
    protected static final String DTOFIELD_VALUEITEMNAME = "valueitemname";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_WIDTHMODE = "WIDTHMODE";
    protected static final String DTOFIELD_WIDTHMODE = "widthmode";
    public static final String DTOFIELD_PSSYSVIEWPANELITEMS = "pssysviewpanelitems";
    public static final String DTOFIELD_PSPANELITEMLOGICS = "pspanelitemlogics";

    @JsonProperty(value="activedatamode")
    public void setActiveDataMode(Integer activeDataMode) {
        this._set(DTOFIELD_ACTIVEDATAMODE, activeDataMode);
    }

    @JsonIgnore
    public Integer getActiveDataMode() {
        Object objValue = this._get(DTOFIELD_ACTIVEDATAMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActiveDataModeDirty() {
        return this._contains(DTOFIELD_ACTIVEDATAMODE);
    }

    @JsonIgnore
    public void resetActiveDataMode() {
        this._reset(DTOFIELD_ACTIVEDATAMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO activedatamode(Integer activeDataMode) {
        this.setActiveDataMode(activeDataMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO activedatamode(Boolean activeDataMode) {
        if (activeDataMode == null) {
            this.setActiveDataMode(null);
        } else {
            this.setActiveDataMode(activeDataMode != false ? 1 : 0);
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
    public PSSysViewPanelItemDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSSysViewPanelItemDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    @JsonProperty(value="al_pos")
    public void setAL_Pos(String aL_Pos) {
        this._set(DTOFIELD_AL_POS, aL_Pos);
    }

    @JsonIgnore
    public String getAL_Pos() {
        Object objValue = this._get(DTOFIELD_AL_POS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAL_PosDirty() {
        return this._contains(DTOFIELD_AL_POS);
    }

    @JsonIgnore
    public void resetAL_Pos() {
        this._reset(DTOFIELD_AL_POS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO al_pos(String aL_Pos) {
        this.setAL_Pos(aL_Pos);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO al_pos(PSModelEnums.AbsoluteLayoutPos aL_Pos) {
        if (aL_Pos == null) {
            this.setAL_Pos(null);
        } else {
            this.setAL_Pos(aL_Pos.value);
        }
        return this;
    }

    @JsonProperty(value="bl_pos")
    public void setBL_Pos(String bL_Pos) {
        this._set(DTOFIELD_BL_POS, bL_Pos);
    }

    @JsonIgnore
    public String getBL_Pos() {
        Object objValue = this._get(DTOFIELD_BL_POS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBL_PosDirty() {
        return this._contains(DTOFIELD_BL_POS);
    }

    @JsonIgnore
    public void resetBL_Pos() {
        this._reset(DTOFIELD_BL_POS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO bl_pos(String bL_Pos) {
        this.setBL_Pos(bL_Pos);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO bl_pos(PSModelEnums.BorderLayoutPos bL_Pos) {
        if (bL_Pos == null) {
            this.setBL_Pos(null);
        } else {
            this.setBL_Pos(bL_Pos.value);
        }
        return this;
    }

    @JsonProperty(value="borderstyle")
    public void setBorderStyle(String borderStyle) {
        this._set(DTOFIELD_BORDERSTYLE, borderStyle);
    }

    @JsonIgnore
    public String getBorderStyle() {
        Object objValue = this._get(DTOFIELD_BORDERSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderStyleDirty() {
        return this._contains(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public void resetBorderStyle() {
        this._reset(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO borderstyle(String borderStyle) {
        this.setBorderStyle(borderStyle);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO borderstyle(PSModelEnums.BorderStyle borderStyle) {
        if (borderStyle == null) {
            this.setBorderStyle(null);
        } else {
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    @JsonProperty(value="bottompos")
    public void setBottomPos(Integer bottomPos) {
        this._set(DTOFIELD_BOTTOMPOS, bottomPos);
    }

    @JsonIgnore
    public Integer getBottomPos() {
        Object objValue = this._get(DTOFIELD_BOTTOMPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBottomPosDirty() {
        return this._contains(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public void resetBottomPos() {
        this._reset(DTOFIELD_BOTTOMPOS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO bottompos(Integer bottomPos) {
        this.setBottomPos(bottomPos);
        return this;
    }

    @JsonProperty(value="btnactiontype")
    public void setBtnActionType(String btnActionType) {
        this._set(DTOFIELD_BTNACTIONTYPE, btnActionType);
    }

    @JsonIgnore
    public String getBtnActionType() {
        Object objValue = this._get(DTOFIELD_BTNACTIONTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBtnActionTypeDirty() {
        return this._contains(DTOFIELD_BTNACTIONTYPE);
    }

    @JsonIgnore
    public void resetBtnActionType() {
        this._reset(DTOFIELD_BTNACTIONTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO btnactiontype(String btnActionType) {
        this.setBtnActionType(btnActionType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO btnactiontype(PSModelEnums.PanelButtonActionType btnActionType) {
        if (btnActionType == null) {
            this.setBtnActionType(null);
        } else {
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    @JsonProperty(value="busyindicator")
    public void setBusyIndicator(Integer busyIndicator) {
        this._set(DTOFIELD_BUSYINDICATOR, busyIndicator);
    }

    @JsonIgnore
    public Integer getBusyIndicator() {
        Object objValue = this._get(DTOFIELD_BUSYINDICATOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBusyIndicatorDirty() {
        return this._contains(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public void resetBusyIndicator() {
        this._reset(DTOFIELD_BUSYINDICATOR);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

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
    public PSSysViewPanelItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSSysViewPanelItemDTO cappslanresname(String capPSLanResName) {
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    @JsonProperty(value="caption")
    public void setCaption(String caption) {
        this._set(DTOFIELD_CAPTION, caption);
    }

    @JsonIgnore
    public String getCaption() {
        Object objValue = this._get(DTOFIELD_CAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionDirty() {
        return this._contains(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public void resetCaption() {
        this._reset(DTOFIELD_CAPTION);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="captionpos")
    public void setCaptionPos(String captionPos) {
        this._set(DTOFIELD_CAPTIONPOS, captionPos);
    }

    @JsonIgnore
    public String getCaptionPos() {
        Object objValue = this._get(DTOFIELD_CAPTIONPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCaptionPosDirty() {
        return this._contains(DTOFIELD_CAPTIONPOS);
    }

    @JsonIgnore
    public void resetCaptionPos() {
        this._reset(DTOFIELD_CAPTIONPOS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO captionpos(String captionPos) {
        this.setCaptionPos(captionPos);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO captionpos(PSModelEnums.LabelPos captionPos) {
        if (captionPos == null) {
            this.setCaptionPos(null);
        } else {
            this.setCaptionPos(captionPos.value);
        }
        return this;
    }

    @JsonProperty(value="child_col_lg")
    public void setChild_Col_LG(Integer child_Col_LG) {
        this._set(DTOFIELD_CHILD_COL_LG, child_Col_LG);
    }

    @JsonIgnore
    public Integer getChild_Col_LG() {
        Object objValue = this._get(DTOFIELD_CHILD_COL_LG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isChild_Col_LGDirty() {
        return this._contains(DTOFIELD_CHILD_COL_LG);
    }

    @JsonIgnore
    public void resetChild_Col_LG() {
        this._reset(DTOFIELD_CHILD_COL_LG);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO child_col_lg(Integer child_Col_LG) {
        this.setChild_Col_LG(child_Col_LG);
        return this;
    }

    @JsonProperty(value="child_col_md")
    public void setChild_Col_MD(Integer child_Col_MD) {
        this._set(DTOFIELD_CHILD_COL_MD, child_Col_MD);
    }

    @JsonIgnore
    public Integer getChild_Col_MD() {
        Object objValue = this._get(DTOFIELD_CHILD_COL_MD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isChild_Col_MDDirty() {
        return this._contains(DTOFIELD_CHILD_COL_MD);
    }

    @JsonIgnore
    public void resetChild_Col_MD() {
        this._reset(DTOFIELD_CHILD_COL_MD);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO child_col_md(Integer child_Col_MD) {
        this.setChild_Col_MD(child_Col_MD);
        return this;
    }

    @JsonProperty(value="child_col_sm")
    public void setChild_Col_SM(Integer child_Col_SM) {
        this._set(DTOFIELD_CHILD_COL_SM, child_Col_SM);
    }

    @JsonIgnore
    public Integer getChild_Col_SM() {
        Object objValue = this._get(DTOFIELD_CHILD_COL_SM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isChild_Col_SMDirty() {
        return this._contains(DTOFIELD_CHILD_COL_SM);
    }

    @JsonIgnore
    public void resetChild_Col_SM() {
        this._reset(DTOFIELD_CHILD_COL_SM);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO child_col_sm(Integer child_Col_SM) {
        this.setChild_Col_SM(child_Col_SM);
        return this;
    }

    @JsonProperty(value="child_col_xs")
    public void setChild_Col_XS(Integer child_Col_XS) {
        this._set(DTOFIELD_CHILD_COL_XS, child_Col_XS);
    }

    @JsonIgnore
    public Integer getChild_Col_XS() {
        Object objValue = this._get(DTOFIELD_CHILD_COL_XS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isChild_Col_XSDirty() {
        return this._contains(DTOFIELD_CHILD_COL_XS);
    }

    @JsonIgnore
    public void resetChild_Col_XS() {
        this._reset(DTOFIELD_CHILD_COL_XS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO child_col_xs(Integer child_Col_XS) {
        this.setChild_Col_XS(child_Col_XS);
        return this;
    }

    @JsonProperty(value="colid")
    public void setColId(Integer colId) {
        this._set(DTOFIELD_COLID, colId);
    }

    @JsonIgnore
    public Integer getColId() {
        Object objValue = this._get(DTOFIELD_COLID);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColIdDirty() {
        return this._contains(DTOFIELD_COLID);
    }

    @JsonIgnore
    public void resetColId() {
        this._reset(DTOFIELD_COLID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO colid(Integer colId) {
        this.setColId(colId);
        return this;
    }

    @JsonProperty(value="collapsibleflag")
    public void setCollapsibleFlag(Integer collapsibleFlag) {
        this._set(DTOFIELD_COLLAPSIBLEFLAG, collapsibleFlag);
    }

    @JsonIgnore
    public Integer getCollapsibleFlag() {
        Object objValue = this._get(DTOFIELD_COLLAPSIBLEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCollapsibleFlagDirty() {
        return this._contains(DTOFIELD_COLLAPSIBLEFLAG);
    }

    @JsonIgnore
    public void resetCollapsibleFlag() {
        this._reset(DTOFIELD_COLLAPSIBLEFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO collapsibleflag(Integer collapsibleFlag) {
        this.setCollapsibleFlag(collapsibleFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO collapsibleflag(PSModelEnums.PanelCollapsibleMode collapsibleFlag) {
        if (collapsibleFlag == null) {
            this.setCollapsibleFlag(null);
        } else {
            this.setCollapsibleFlag(collapsibleFlag.value);
        }
        return this;
    }

    @JsonProperty(value="colmodel")
    public void setColModel(String colModel) {
        this._set(DTOFIELD_COLMODEL, colModel);
    }

    @JsonIgnore
    public String getColModel() {
        Object objValue = this._get(DTOFIELD_COLMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColModelDirty() {
        return this._contains(DTOFIELD_COLMODEL);
    }

    @JsonIgnore
    public void resetColModel() {
        this._reset(DTOFIELD_COLMODEL);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO colmodel(String colModel) {
        this.setColModel(colModel);
        return this;
    }

    @JsonProperty(value="colspan")
    public void setColSpan(Integer colSpan) {
        this._set(DTOFIELD_COLSPAN, colSpan);
    }

    @JsonIgnore
    public Integer getColSpan() {
        Object objValue = this._get(DTOFIELD_COLSPAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColSpanDirty() {
        return this._contains(DTOFIELD_COLSPAN);
    }

    @JsonIgnore
    public void resetColSpan() {
        this._reset(DTOFIELD_COLSPAN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO colspan(Integer colSpan) {
        this.setColSpan(colSpan);
        return this;
    }

    @JsonProperty(value="col_lg")
    public void setCol_LG(Integer col_LG) {
        this._set(DTOFIELD_COL_LG, col_LG);
    }

    @JsonIgnore
    public Integer getCol_LG() {
        Object objValue = this._get(DTOFIELD_COL_LG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_LGDirty() {
        return this._contains(DTOFIELD_COL_LG);
    }

    @JsonIgnore
    public void resetCol_LG() {
        this._reset(DTOFIELD_COL_LG);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_lg(Integer col_LG) {
        this.setCol_LG(col_LG);
        return this;
    }

    @JsonProperty(value="col_lg_os")
    public void setCol_LG_OS(Integer col_LG_OS) {
        this._set(DTOFIELD_COL_LG_OS, col_LG_OS);
    }

    @JsonIgnore
    public Integer getCol_LG_OS() {
        Object objValue = this._get(DTOFIELD_COL_LG_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_LG_OSDirty() {
        return this._contains(DTOFIELD_COL_LG_OS);
    }

    @JsonIgnore
    public void resetCol_LG_OS() {
        this._reset(DTOFIELD_COL_LG_OS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_lg_os(Integer col_LG_OS) {
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    @JsonProperty(value="col_md")
    public void setCol_MD(Integer col_MD) {
        this._set(DTOFIELD_COL_MD, col_MD);
    }

    @JsonIgnore
    public Integer getCol_MD() {
        Object objValue = this._get(DTOFIELD_COL_MD);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_MDDirty() {
        return this._contains(DTOFIELD_COL_MD);
    }

    @JsonIgnore
    public void resetCol_MD() {
        this._reset(DTOFIELD_COL_MD);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_md(Integer col_MD) {
        this.setCol_MD(col_MD);
        return this;
    }

    @JsonProperty(value="col_md_os")
    public void setCol_MD_OS(Integer col_MD_OS) {
        this._set(DTOFIELD_COL_MD_OS, col_MD_OS);
    }

    @JsonIgnore
    public Integer getCol_MD_OS() {
        Object objValue = this._get(DTOFIELD_COL_MD_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_MD_OSDirty() {
        return this._contains(DTOFIELD_COL_MD_OS);
    }

    @JsonIgnore
    public void resetCol_MD_OS() {
        this._reset(DTOFIELD_COL_MD_OS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_md_os(Integer col_MD_OS) {
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    @JsonProperty(value="col_sm")
    public void setCol_SM(Integer col_SM) {
        this._set(DTOFIELD_COL_SM, col_SM);
    }

    @JsonIgnore
    public Integer getCol_SM() {
        Object objValue = this._get(DTOFIELD_COL_SM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_SMDirty() {
        return this._contains(DTOFIELD_COL_SM);
    }

    @JsonIgnore
    public void resetCol_SM() {
        this._reset(DTOFIELD_COL_SM);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_sm(Integer col_SM) {
        this.setCol_SM(col_SM);
        return this;
    }

    @JsonProperty(value="col_sm_os")
    public void setCol_SM_OS(Integer col_SM_OS) {
        this._set(DTOFIELD_COL_SM_OS, col_SM_OS);
    }

    @JsonIgnore
    public Integer getCol_SM_OS() {
        Object objValue = this._get(DTOFIELD_COL_SM_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_SM_OSDirty() {
        return this._contains(DTOFIELD_COL_SM_OS);
    }

    @JsonIgnore
    public void resetCol_SM_OS() {
        this._reset(DTOFIELD_COL_SM_OS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_sm_os(Integer col_SM_OS) {
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    @JsonProperty(value="col_width")
    public void setCol_Width(Integer col_Width) {
        this._set(DTOFIELD_COL_WIDTH, col_Width);
    }

    @JsonIgnore
    public Integer getCol_Width() {
        Object objValue = this._get(DTOFIELD_COL_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_WidthDirty() {
        return this._contains(DTOFIELD_COL_WIDTH);
    }

    @JsonIgnore
    public void resetCol_Width() {
        this._reset(DTOFIELD_COL_WIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_width(Integer col_Width) {
        this.setCol_Width(col_Width);
        return this;
    }

    @JsonProperty(value="col_xs")
    public void setCol_XS(Integer col_XS) {
        this._set(DTOFIELD_COL_XS, col_XS);
    }

    @JsonIgnore
    public Integer getCol_XS() {
        Object objValue = this._get(DTOFIELD_COL_XS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_XSDirty() {
        return this._contains(DTOFIELD_COL_XS);
    }

    @JsonIgnore
    public void resetCol_XS() {
        this._reset(DTOFIELD_COL_XS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_xs(Integer col_XS) {
        this.setCol_XS(col_XS);
        return this;
    }

    @JsonProperty(value="col_xs_os")
    public void setCol_XS_OS(Integer col_XS_OS) {
        this._set(DTOFIELD_COL_XS_OS, col_XS_OS);
    }

    @JsonIgnore
    public Integer getCol_XS_OS() {
        Object objValue = this._get(DTOFIELD_COL_XS_OS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCol_XS_OSDirty() {
        return this._contains(DTOFIELD_COL_XS_OS);
    }

    @JsonIgnore
    public void resetCol_XS_OS() {
        this._reset(DTOFIELD_COL_XS_OS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO col_xs_os(Integer col_XS_OS) {
        this.setCol_XS_OS(col_XS_OS);
        return this;
    }

    @JsonProperty(value="contenttype")
    public void setContentType(String contentType) {
        this._set(DTOFIELD_CONTENTTYPE, contentType);
    }

    @JsonIgnore
    public String getContentType() {
        Object objValue = this._get(DTOFIELD_CONTENTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContentTypeDirty() {
        return this._contains(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public void resetContentType() {
        this._reset(DTOFIELD_CONTENTTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO contenttype(PSModelEnums.RawItemContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
        }
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
    public PSSysViewPanelItemDTO createdate(Timestamp createDate) {
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
    public PSSysViewPanelItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrldynaclass")
    public void setCtrlDynaClass(String ctrlDynaClass) {
        this._set(DTOFIELD_CTRLDYNACLASS, ctrlDynaClass);
    }

    @JsonIgnore
    public String getCtrlDynaClass() {
        Object objValue = this._get(DTOFIELD_CTRLDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlDynaClassDirty() {
        return this._contains(DTOFIELD_CTRLDYNACLASS);
    }

    @JsonIgnore
    public void resetCtrlDynaClass() {
        this._reset(DTOFIELD_CTRLDYNACLASS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrldynaclass(String ctrlDynaClass) {
        this.setCtrlDynaClass(ctrlDynaClass);
        return this;
    }

    @JsonProperty(value="ctrlheight")
    public void setCtrlHeight(Integer ctrlHeight) {
        this._set(DTOFIELD_CTRLHEIGHT, ctrlHeight);
    }

    @JsonIgnore
    public Integer getCtrlHeight() {
        Object objValue = this._get(DTOFIELD_CTRLHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlHeightDirty() {
        return this._contains(DTOFIELD_CTRLHEIGHT);
    }

    @JsonIgnore
    public void resetCtrlHeight() {
        this._reset(DTOFIELD_CTRLHEIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlheight(Integer ctrlHeight) {
        this.setCtrlHeight(ctrlHeight);
        return this;
    }

    @JsonProperty(value="ctrlpssyscssid")
    public void setCtrlPSSysCssId(String ctrlPSSysCssId) {
        this._set(DTOFIELD_CTRLPSSYSCSSID, ctrlPSSysCssId);
    }

    @JsonIgnore
    public String getCtrlPSSysCssId() {
        Object objValue = this._get(DTOFIELD_CTRLPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPSSysCssIdDirty() {
        return this._contains(DTOFIELD_CTRLPSSYSCSSID);
    }

    @JsonIgnore
    public void resetCtrlPSSysCssId() {
        this._reset(DTOFIELD_CTRLPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlpssyscssid(String ctrlPSSysCssId) {
        this.setCtrlPSSysCssId(ctrlPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setCtrlPSSysCssId(null);
            this.setCtrlPSSysCssName(null);
        } else {
            this.setCtrlPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCtrlPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="ctrlpssyscssname")
    public void setCtrlPSSysCssName(String ctrlPSSysCssName) {
        this._set(DTOFIELD_CTRLPSSYSCSSNAME, ctrlPSSysCssName);
    }

    @JsonIgnore
    public String getCtrlPSSysCssName() {
        Object objValue = this._get(DTOFIELD_CTRLPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPSSysCssNameDirty() {
        return this._contains(DTOFIELD_CTRLPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetCtrlPSSysCssName() {
        this._reset(DTOFIELD_CTRLPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlpssyscssname(String ctrlPSSysCssName) {
        this.setCtrlPSSysCssName(ctrlPSSysCssName);
        return this;
    }

    @JsonProperty(value="ctrlrawcssstyle")
    public void setCtrlRawCssStyle(String ctrlRawCssStyle) {
        this._set(DTOFIELD_CTRLRAWCSSSTYLE, ctrlRawCssStyle);
    }

    @JsonIgnore
    public String getCtrlRawCssStyle() {
        Object objValue = this._get(DTOFIELD_CTRLRAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlRawCssStyleDirty() {
        return this._contains(DTOFIELD_CTRLRAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetCtrlRawCssStyle() {
        this._reset(DTOFIELD_CTRLRAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlrawcssstyle(String ctrlRawCssStyle) {
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
        return this;
    }

    @JsonProperty(value="ctrltype")
    public void setCtrlType(String ctrlType) {
        this._set(DTOFIELD_CTRLTYPE, ctrlType);
    }

    @JsonIgnore
    public String getCtrlType() {
        Object objValue = this._get(DTOFIELD_CTRLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlTypeDirty() {
        return this._contains(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public void resetCtrlType() {
        this._reset(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrltype(String ctrlType) {
        this.setCtrlType(ctrlType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrltype(PSModelEnums.PanelCtrlType ctrlType) {
        if (ctrlType == null) {
            this.setCtrlType(null);
        } else {
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    @JsonProperty(value="ctrlwidth")
    public void setCtrlWidth(Integer ctrlWidth) {
        this._set(DTOFIELD_CTRLWIDTH, ctrlWidth);
    }

    @JsonIgnore
    public Integer getCtrlWidth() {
        Object objValue = this._get(DTOFIELD_CTRLWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlWidthDirty() {
        return this._contains(DTOFIELD_CTRLWIDTH);
    }

    @JsonIgnore
    public void resetCtrlWidth() {
        this._reset(DTOFIELD_CTRLWIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ctrlwidth(Integer ctrlWidth) {
        this.setCtrlWidth(ctrlWidth);
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
    public PSSysViewPanelItemDTO customcode(String customCode) {
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
    public PSSysViewPanelItemDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="datapanelmode")
    public void setDataPanelMode(String dataPanelMode) {
        this._set(DTOFIELD_DATAPANELMODE, dataPanelMode);
    }

    @JsonIgnore
    public String getDataPanelMode() {
        Object objValue = this._get(DTOFIELD_DATAPANELMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPanelModeDirty() {
        return this._contains(DTOFIELD_DATAPANELMODE);
    }

    @JsonIgnore
    public void resetDataPanelMode() {
        this._reset(DTOFIELD_DATAPANELMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO datapanelmode(String dataPanelMode) {
        this.setDataPanelMode(dataPanelMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO datapanelmode(PSModelEnums.DataPanelMode dataPanelMode) {
        if (dataPanelMode == null) {
            this.setDataPanelMode(null);
        } else {
            this.setDataPanelMode(dataPanelMode.value);
        }
        return this;
    }

    @JsonProperty(value="datasource")
    public void setDataSource(String dataSource) {
        this._set(DTOFIELD_DATASOURCE, dataSource);
    }

    @JsonIgnore
    public String getDataSource() {
        Object objValue = this._get(DTOFIELD_DATASOURCE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataSourceDirty() {
        return this._contains(DTOFIELD_DATASOURCE);
    }

    @JsonIgnore
    public void resetDataSource() {
        this._reset(DTOFIELD_DATASOURCE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO datasource(String dataSource) {
        this.setDataSource(dataSource);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO datasource(PSModelEnums.DataPanelSource dataSource) {
        if (dataSource == null) {
            this.setDataSource(null);
        } else {
            this.setDataSource(dataSource.value);
        }
        return this;
    }

    @JsonProperty(value="datasourcetext")
    public void setDataSourceText(String dataSourceText) {
        this._set(DTOFIELD_DATASOURCETEXT, dataSourceText);
    }

    @JsonIgnore
    public String getDataSourceText() {
        Object objValue = this._get(DTOFIELD_DATASOURCETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataSourceTextDirty() {
        return this._contains(DTOFIELD_DATASOURCETEXT);
    }

    @JsonIgnore
    public void resetDataSourceText() {
        this._reset(DTOFIELD_DATASOURCETEXT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO datasourcetext(String dataSourceText) {
        this.setDataSourceText(dataSourceText);
        return this;
    }

    @JsonProperty(value="detailstyle")
    public void setDetailStyle(String detailStyle) {
        this._set(DTOFIELD_DETAILSTYLE, detailStyle);
    }

    @JsonIgnore
    public String getDetailStyle() {
        Object objValue = this._get(DTOFIELD_DETAILSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailStyleDirty() {
        return this._contains(DTOFIELD_DETAILSTYLE);
    }

    @JsonIgnore
    public void resetDetailStyle() {
        this._reset(DTOFIELD_DETAILSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO detailstyle(String detailStyle) {
        this.setDetailStyle(detailStyle);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO detailstyle(PSModelEnums.CtrlDetailStyle detailStyle) {
        if (detailStyle == null) {
            this.setDetailStyle(null);
        } else {
            this.setDetailStyle(detailStyle.value);
        }
        return this;
    }

    @JsonProperty(value="detailstyletext")
    public void setDetailStyleText(String detailStyleText) {
        this._set(DTOFIELD_DETAILSTYLETEXT, detailStyleText);
    }

    @JsonIgnore
    public String getDetailStyleText() {
        Object objValue = this._get(DTOFIELD_DETAILSTYLETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailStyleTextDirty() {
        return this._contains(DTOFIELD_DETAILSTYLETEXT);
    }

    @JsonIgnore
    public void resetDetailStyleText() {
        this._reset(DTOFIELD_DETAILSTYLETEXT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO detailstyletext(String detailStyleText) {
        this.setDetailStyleText(detailStyleText);
        return this;
    }

    @JsonProperty(value="dynaclass")
    public void setDynaClass(String dynaClass) {
        this._set(DTOFIELD_DYNACLASS, dynaClass);
    }

    @JsonIgnore
    public String getDynaClass() {
        Object objValue = this._get(DTOFIELD_DYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaClassDirty() {
        return this._contains(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public void resetDynaClass() {
        this._reset(DTOFIELD_DYNACLASS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="editortype")
    public void setEditorType(String editorType) {
        this._set(DTOFIELD_EDITORTYPE, editorType);
    }

    @JsonIgnore
    public String getEditorType() {
        Object objValue = this._get(DTOFIELD_EDITORTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorTypeDirty() {
        return this._contains(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public void resetEditorType() {
        this._reset(DTOFIELD_EDITORTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO editortype(String editorType) {
        this.setEditorType(editorType);
        return this;
    }

    @JsonProperty(value="emptycaption")
    public void setEmptyCaption(Integer emptyCaption) {
        this._set(DTOFIELD_EMPTYCAPTION, emptyCaption);
    }

    @JsonIgnore
    public Integer getEmptyCaption() {
        Object objValue = this._get(DTOFIELD_EMPTYCAPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEmptyCaptionDirty() {
        return this._contains(DTOFIELD_EMPTYCAPTION);
    }

    @JsonIgnore
    public void resetEmptyCaption() {
        this._reset(DTOFIELD_EMPTYCAPTION);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO emptycaption(Integer emptyCaption) {
        this.setEmptyCaption(emptyCaption);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO emptycaption(Boolean emptyCaption) {
        if (emptyCaption == null) {
            this.setEmptyCaption(null);
        } else {
            this.setEmptyCaption(emptyCaption != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableanchor")
    public void setEnableAnchor(Integer enableAnchor) {
        this._set(DTOFIELD_ENABLEANCHOR, enableAnchor);
    }

    @JsonIgnore
    public Integer getEnableAnchor() {
        Object objValue = this._get(DTOFIELD_ENABLEANCHOR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableAnchorDirty() {
        return this._contains(DTOFIELD_ENABLEANCHOR);
    }

    @JsonIgnore
    public void resetEnableAnchor() {
        this._reset(DTOFIELD_ENABLEANCHOR);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO enableanchor(Integer enableAnchor) {
        this.setEnableAnchor(enableAnchor);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO enableanchor(Boolean enableAnchor) {
        if (enableAnchor == null) {
            this.setEnableAnchor(null);
        } else {
            this.setEnableAnchor(enableAnchor != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="fieldname")
    public void setFieldName(String fieldName) {
        this._set(DTOFIELD_FIELDNAME, fieldName);
    }

    @JsonIgnore
    public String getFieldName() {
        Object objValue = this._get(DTOFIELD_FIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldNameDirty() {
        return this._contains(DTOFIELD_FIELDNAME);
    }

    @JsonIgnore
    public void resetFieldName() {
        this._reset(DTOFIELD_FIELDNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO fieldname(String fieldName) {
        this.setFieldName(fieldName);
        return this;
    }

    @JsonProperty(value="fieldstates")
    public void setFieldStates(Integer fieldStates) {
        this._set(DTOFIELD_FIELDSTATES, fieldStates);
    }

    @JsonIgnore
    public Integer getFieldStates() {
        Object objValue = this._get(DTOFIELD_FIELDSTATES);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFieldStatesDirty() {
        return this._contains(DTOFIELD_FIELDSTATES);
    }

    @JsonIgnore
    public void resetFieldStates() {
        this._reset(DTOFIELD_FIELDSTATES);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO fieldstates(Integer fieldStates) {
        this.setFieldStates(fieldStates);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO fieldstates(PSModelEnums.PanelFieldState[] fieldStates) {
        if (fieldStates == null || fieldStates.length == 0) {
            this.setFieldStates(null);
        } else {
            int _value = 0;
            for (PSModelEnums.PanelFieldState _item : fieldStates) {
                _value |= _item.value;
            }
            this.setFieldStates(_value);
        }
        return this;
    }

    @JsonProperty(value="flexalign")
    public void setFlexAlign(String flexAlign) {
        this._set(DTOFIELD_FLEXALIGN, flexAlign);
    }

    @JsonIgnore
    public String getFlexAlign() {
        Object objValue = this._get(DTOFIELD_FLEXALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexAlignDirty() {
        return this._contains(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public void resetFlexAlign() {
        this._reset(DTOFIELD_FLEXALIGN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
        if (flexAlign == null) {
            this.setFlexAlign(null);
        } else {
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    @JsonProperty(value="flexbasis")
    public void setFlexBasis(Integer flexBasis) {
        this._set(DTOFIELD_FLEXBASIS, flexBasis);
    }

    @JsonIgnore
    public Integer getFlexBasis() {
        Object objValue = this._get(DTOFIELD_FLEXBASIS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexBasisDirty() {
        return this._contains(DTOFIELD_FLEXBASIS);
    }

    @JsonIgnore
    public void resetFlexBasis() {
        this._reset(DTOFIELD_FLEXBASIS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexbasis(Integer flexBasis) {
        this.setFlexBasis(flexBasis);
        return this;
    }

    @JsonProperty(value="flexdir")
    public void setFlexDir(String flexDir) {
        this._set(DTOFIELD_FLEXDIR, flexDir);
    }

    @JsonIgnore
    public String getFlexDir() {
        Object objValue = this._get(DTOFIELD_FLEXDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexDirDirty() {
        return this._contains(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public void resetFlexDir() {
        this._reset(DTOFIELD_FLEXDIR);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
        if (flexDir == null) {
            this.setFlexDir(null);
        } else {
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    @JsonProperty(value="flexgrow")
    public void setFlexGrow(Integer flexGrow) {
        this._set(DTOFIELD_FLEXGROW, flexGrow);
    }

    @JsonIgnore
    public Integer getFlexGrow() {
        Object objValue = this._get(DTOFIELD_FLEXGROW);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexGrowDirty() {
        return this._contains(DTOFIELD_FLEXGROW);
    }

    @JsonIgnore
    public void resetFlexGrow() {
        this._reset(DTOFIELD_FLEXGROW);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexgrow(Integer flexGrow) {
        this.setFlexGrow(flexGrow);
        return this;
    }

    @JsonProperty(value="flexshrink")
    public void setFlexShrink(Integer flexShrink) {
        this._set(DTOFIELD_FLEXSHRINK, flexShrink);
    }

    @JsonIgnore
    public Integer getFlexShrink() {
        Object objValue = this._get(DTOFIELD_FLEXSHRINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFlexShrinkDirty() {
        return this._contains(DTOFIELD_FLEXSHRINK);
    }

    @JsonIgnore
    public void resetFlexShrink() {
        this._reset(DTOFIELD_FLEXSHRINK);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexshrink(Integer flexShrink) {
        this.setFlexShrink(flexShrink);
        return this;
    }

    @JsonProperty(value="flexvalign")
    public void setFlexVAlign(String flexVAlign) {
        this._set(DTOFIELD_FLEXVALIGN, flexVAlign);
    }

    @JsonIgnore
    public String getFlexVAlign() {
        Object objValue = this._get(DTOFIELD_FLEXVALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFlexVAlignDirty() {
        return this._contains(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public void resetFlexVAlign() {
        this._reset(DTOFIELD_FLEXVALIGN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
        if (flexVAlign == null) {
            this.setFlexVAlign(null);
        } else {
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    @JsonProperty(value="getdatatimer")
    public void setGetDataTimer(Integer getDataTimer) {
        this._set(DTOFIELD_GETDATATIMER, getDataTimer);
    }

    @JsonIgnore
    public Integer getGetDataTimer() {
        Object objValue = this._get(DTOFIELD_GETDATATIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGetDataTimerDirty() {
        return this._contains(DTOFIELD_GETDATATIMER);
    }

    @JsonIgnore
    public void resetGetDataTimer() {
        this._reset(DTOFIELD_GETDATATIMER);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO getdatatimer(Integer getDataTimer) {
        this.setGetDataTimer(getDataTimer);
        return this;
    }

    @JsonProperty(value="gridrowid")
    public void setGridRowId(Integer gridRowId) {
        this._set(DTOFIELD_GRIDROWID, gridRowId);
    }

    @JsonIgnore
    public Integer getGridRowId() {
        Object objValue = this._get(DTOFIELD_GRIDROWID);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGridRowIdDirty() {
        return this._contains(DTOFIELD_GRIDROWID);
    }

    @JsonIgnore
    public void resetGridRowId() {
        this._reset(DTOFIELD_GRIDROWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO gridrowid(Integer gridRowId) {
        this.setGridRowId(gridRowId);
        return this;
    }

    @JsonProperty(value="halign")
    public void setHAlign(String hAlign) {
        this._set(DTOFIELD_HALIGN, hAlign);
    }

    @JsonIgnore
    public String getHAlign() {
        Object objValue = this._get(DTOFIELD_HALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHAlignDirty() {
        return this._contains(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public void resetHAlign() {
        this._reset(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO halign(String hAlign) {
        this.setHAlign(hAlign);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO halign(PSModelEnums.TextAlign hAlign) {
        if (hAlign == null) {
            this.setHAlign(null);
        } else {
            this.setHAlign(hAlign.value);
        }
        return this;
    }

    @JsonProperty(value="halignself")
    public void setHAlignSelf(String hAlignSelf) {
        this._set(DTOFIELD_HALIGNSELF, hAlignSelf);
    }

    @JsonIgnore
    public String getHAlignSelf() {
        Object objValue = this._get(DTOFIELD_HALIGNSELF);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHAlignSelfDirty() {
        return this._contains(DTOFIELD_HALIGNSELF);
    }

    @JsonIgnore
    public void resetHAlignSelf() {
        this._reset(DTOFIELD_HALIGNSELF);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO halignself(String hAlignSelf) {
        this.setHAlignSelf(hAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO halignself(PSModelEnums.TextAlign hAlignSelf) {
        if (hAlignSelf == null) {
            this.setHAlignSelf(null);
        } else {
            this.setHAlignSelf(hAlignSelf.value);
        }
        return this;
    }

    @JsonProperty(value="height")
    public void setHeight(Integer height) {
        this._set(DTOFIELD_HEIGHT, height);
    }

    @JsonIgnore
    public Integer getHeight() {
        Object objValue = this._get(DTOFIELD_HEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHeightDirty() {
        return this._contains(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public void resetHeight() {
        this._reset(DTOFIELD_HEIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="heightmode")
    public void setHeightMode(String heightMode) {
        this._set(DTOFIELD_HEIGHTMODE, heightMode);
    }

    @JsonIgnore
    public String getHeightMode() {
        Object objValue = this._get(DTOFIELD_HEIGHTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHeightModeDirty() {
        return this._contains(DTOFIELD_HEIGHTMODE);
    }

    @JsonIgnore
    public void resetHeightMode() {
        this._reset(DTOFIELD_HEIGHTMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO heightmode(String heightMode) {
        this.setHeightMode(heightMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO heightmode(PSModelEnums.HeightMode heightMode) {
        if (heightMode == null) {
            this.setHeightMode(null);
        } else {
            this.setHeightMode(heightMode.value);
        }
        return this;
    }

    @JsonProperty(value="htmlcontent")
    public void setHtmlContent(String htmlContent) {
        this._set(DTOFIELD_HTMLCONTENT, htmlContent);
    }

    @JsonIgnore
    public String getHtmlContent() {
        Object objValue = this._get(DTOFIELD_HTMLCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlContentDirty() {
        return this._contains(DTOFIELD_HTMLCONTENT);
    }

    @JsonIgnore
    public void resetHtmlContent() {
        this._reset(DTOFIELD_HTMLCONTENT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO htmlcontent(String htmlContent) {
        this.setHtmlContent(htmlContent);
        return this;
    }

    @JsonProperty(value="htmlpageurl")
    public void setHtmlPageUrl(String htmlPageUrl) {
        this._set(DTOFIELD_HTMLPAGEURL, htmlPageUrl);
    }

    @JsonIgnore
    public String getHtmlPageUrl() {
        Object objValue = this._get(DTOFIELD_HTMLPAGEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHtmlPageUrlDirty() {
        return this._contains(DTOFIELD_HTMLPAGEURL);
    }

    @JsonIgnore
    public void resetHtmlPageUrl() {
        this._reset(DTOFIELD_HTMLPAGEURL);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO htmlpageurl(String htmlPageUrl) {
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    @JsonProperty(value="iconalign")
    public void setIconAlign(String iconAlign) {
        this._set(DTOFIELD_ICONALIGN, iconAlign);
    }

    @JsonIgnore
    public String getIconAlign() {
        Object objValue = this._get(DTOFIELD_ICONALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconAlignDirty() {
        return this._contains(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public void resetIconAlign() {
        this._reset(DTOFIELD_ICONALIGN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO iconalign(String iconAlign) {
        this.setIconAlign(iconAlign);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO iconalign(PSModelEnums.ButtonIconAlign iconAlign) {
        if (iconAlign == null) {
            this.setIconAlign(null);
        } else {
            this.setIconAlign(iconAlign.value);
        }
        return this;
    }

    @JsonProperty(value="ignoreinput")
    public void setIgnoreInput(Integer ignoreInput) {
        this._set(DTOFIELD_IGNOREINPUT, ignoreInput);
    }

    @JsonIgnore
    public Integer getIgnoreInput() {
        Object objValue = this._get(DTOFIELD_IGNOREINPUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreInputDirty() {
        return this._contains(DTOFIELD_IGNOREINPUT);
    }

    @JsonIgnore
    public void resetIgnoreInput() {
        this._reset(DTOFIELD_IGNOREINPUT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ignoreinput(Integer ignoreInput) {
        this.setIgnoreInput(ignoreInput);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ignoreinput(PSModelEnums.EditItemIgnoreMode ignoreInput) {
        if (ignoreInput == null) {
            this.setIgnoreInput(null);
        } else {
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    @JsonProperty(value="itemparam")
    public void setItemParam(String itemParam) {
        this._set(DTOFIELD_ITEMPARAM, itemParam);
    }

    @JsonIgnore
    public String getItemParam() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParamDirty() {
        return this._contains(DTOFIELD_ITEMPARAM);
    }

    @JsonIgnore
    public void resetItemParam() {
        this._reset(DTOFIELD_ITEMPARAM);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam(String itemParam) {
        this.setItemParam(itemParam);
        return this;
    }

    @JsonProperty(value="itemparam10")
    public void setItemParam10(Double itemParam10) {
        this._set(DTOFIELD_ITEMPARAM10, itemParam10);
    }

    @JsonIgnore
    public Double getItemParam10() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isItemParam10Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM10);
    }

    @JsonIgnore
    public void resetItemParam10() {
        this._reset(DTOFIELD_ITEMPARAM10);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam10(Double itemParam10) {
        this.setItemParam10(itemParam10);
        return this;
    }

    @JsonProperty(value="itemparam11")
    public void setItemParam11(Integer itemParam11) {
        this._set(DTOFIELD_ITEMPARAM11, itemParam11);
    }

    @JsonIgnore
    public Integer getItemParam11() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam11Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM11);
    }

    @JsonIgnore
    public void resetItemParam11() {
        this._reset(DTOFIELD_ITEMPARAM11);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam11(Integer itemParam11) {
        this.setItemParam11(itemParam11);
        return this;
    }

    @JsonProperty(value="itemparam12")
    public void setItemParam12(Integer itemParam12) {
        this._set(DTOFIELD_ITEMPARAM12, itemParam12);
    }

    @JsonIgnore
    public Integer getItemParam12() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam12Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM12);
    }

    @JsonIgnore
    public void resetItemParam12() {
        this._reset(DTOFIELD_ITEMPARAM12);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam12(Integer itemParam12) {
        this.setItemParam12(itemParam12);
        return this;
    }

    @JsonProperty(value="itemparam2")
    public void setItemParam2(String itemParam2) {
        this._set(DTOFIELD_ITEMPARAM2, itemParam2);
    }

    @JsonIgnore
    public String getItemParam2() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParam2Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM2);
    }

    @JsonIgnore
    public void resetItemParam2() {
        this._reset(DTOFIELD_ITEMPARAM2);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam2(String itemParam2) {
        this.setItemParam2(itemParam2);
        return this;
    }

    @JsonProperty(value="itemparam3")
    public void setItemParam3(String itemParam3) {
        this._set(DTOFIELD_ITEMPARAM3, itemParam3);
    }

    @JsonIgnore
    public String getItemParam3() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParam3Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM3);
    }

    @JsonIgnore
    public void resetItemParam3() {
        this._reset(DTOFIELD_ITEMPARAM3);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam3(String itemParam3) {
        this.setItemParam3(itemParam3);
        return this;
    }

    @JsonProperty(value="itemparam4")
    public void setItemParam4(String itemParam4) {
        this._set(DTOFIELD_ITEMPARAM4, itemParam4);
    }

    @JsonIgnore
    public String getItemParam4() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParam4Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM4);
    }

    @JsonIgnore
    public void resetItemParam4() {
        this._reset(DTOFIELD_ITEMPARAM4);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam4(String itemParam4) {
        this.setItemParam4(itemParam4);
        return this;
    }

    @JsonProperty(value="itemparam5")
    public void setItemParam5(Integer itemParam5) {
        this._set(DTOFIELD_ITEMPARAM5, itemParam5);
    }

    @JsonIgnore
    public Integer getItemParam5() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam5Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM5);
    }

    @JsonIgnore
    public void resetItemParam5() {
        this._reset(DTOFIELD_ITEMPARAM5);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam5(Integer itemParam5) {
        this.setItemParam5(itemParam5);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam5(Boolean itemParam5) {
        if (itemParam5 == null) {
            this.setItemParam5(null);
        } else {
            this.setItemParam5(itemParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="itemparam6")
    public void setItemParam6(Integer itemParam6) {
        this._set(DTOFIELD_ITEMPARAM6, itemParam6);
    }

    @JsonIgnore
    public Integer getItemParam6() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam6Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM6);
    }

    @JsonIgnore
    public void resetItemParam6() {
        this._reset(DTOFIELD_ITEMPARAM6);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam6(Integer itemParam6) {
        this.setItemParam6(itemParam6);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam6(Boolean itemParam6) {
        if (itemParam6 == null) {
            this.setItemParam6(null);
        } else {
            this.setItemParam6(itemParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="itemparam7")
    public void setItemParam7(Integer itemParam7) {
        this._set(DTOFIELD_ITEMPARAM7, itemParam7);
    }

    @JsonIgnore
    public Integer getItemParam7() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam7Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM7);
    }

    @JsonIgnore
    public void resetItemParam7() {
        this._reset(DTOFIELD_ITEMPARAM7);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam7(Integer itemParam7) {
        this.setItemParam7(itemParam7);
        return this;
    }

    @JsonProperty(value="itemparam8")
    public void setItemParam8(Integer itemParam8) {
        this._set(DTOFIELD_ITEMPARAM8, itemParam8);
    }

    @JsonIgnore
    public Integer getItemParam8() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemParam8Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM8);
    }

    @JsonIgnore
    public void resetItemParam8() {
        this._reset(DTOFIELD_ITEMPARAM8);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam8(Integer itemParam8) {
        this.setItemParam8(itemParam8);
        return this;
    }

    @JsonProperty(value="itemparam9")
    public void setItemParam9(Double itemParam9) {
        this._set(DTOFIELD_ITEMPARAM9, itemParam9);
    }

    @JsonIgnore
    public Double getItemParam9() {
        Object objValue = this._get(DTOFIELD_ITEMPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isItemParam9Dirty() {
        return this._contains(DTOFIELD_ITEMPARAM9);
    }

    @JsonIgnore
    public void resetItemParam9() {
        this._reset(DTOFIELD_ITEMPARAM9);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparam9(Double itemParam9) {
        this.setItemParam9(itemParam9);
        return this;
    }

    @JsonProperty(value="itemparams")
    public void setItemParams(String itemParams) {
        this._set(DTOFIELD_ITEMPARAMS, itemParams);
    }

    @JsonIgnore
    public String getItemParams() {
        Object objValue = this._get(DTOFIELD_ITEMPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemParamsDirty() {
        return this._contains(DTOFIELD_ITEMPARAMS);
    }

    @JsonIgnore
    public void resetItemParams() {
        this._reset(DTOFIELD_ITEMPARAMS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemparams(String itemParams) {
        this.setItemParams(itemParams);
        return this;
    }

    @JsonProperty(value="itemtype")
    public void setItemType(String itemType) {
        this._set(DTOFIELD_ITEMTYPE, itemType);
    }

    @JsonIgnore
    public String getItemType() {
        Object objValue = this._get(DTOFIELD_ITEMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTypeDirty() {
        return this._contains(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public void resetItemType() {
        this._reset(DTOFIELD_ITEMTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemtype(String itemType) {
        this.setItemType(itemType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO itemtype(PSModelEnums.PanelItemType itemType) {
        if (itemType == null) {
            this.setItemType(null);
        } else {
            this.setItemType(itemType.value);
        }
        return this;
    }

    @JsonProperty(value="labeldynaclass")
    public void setLabelDynaClass(String labelDynaClass) {
        this._set(DTOFIELD_LABELDYNACLASS, labelDynaClass);
    }

    @JsonIgnore
    public String getLabelDynaClass() {
        Object objValue = this._get(DTOFIELD_LABELDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelDynaClassDirty() {
        return this._contains(DTOFIELD_LABELDYNACLASS);
    }

    @JsonIgnore
    public void resetLabelDynaClass() {
        this._reset(DTOFIELD_LABELDYNACLASS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO labeldynaclass(String labelDynaClass) {
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    @JsonProperty(value="labelpssyscssid")
    public void setLabelPSSysCssId(String labelPSSysCssId) {
        this._set(DTOFIELD_LABELPSSYSCSSID, labelPSSysCssId);
    }

    @JsonIgnore
    public String getLabelPSSysCssId() {
        Object objValue = this._get(DTOFIELD_LABELPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPSSysCssIdDirty() {
        return this._contains(DTOFIELD_LABELPSSYSCSSID);
    }

    @JsonIgnore
    public void resetLabelPSSysCssId() {
        this._reset(DTOFIELD_LABELPSSYSCSSID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO labelpssyscssid(String labelPSSysCssId) {
        this.setLabelPSSysCssId(labelPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO labelpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setLabelPSSysCssId(null);
            this.setLabelPSSysCssName(null);
        } else {
            this.setLabelPSSysCssId(pSSysCss.getPSSysCssId());
            this.setLabelPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="labelpssyscssname")
    public void setLabelPSSysCssName(String labelPSSysCssName) {
        this._set(DTOFIELD_LABELPSSYSCSSNAME, labelPSSysCssName);
    }

    @JsonIgnore
    public String getLabelPSSysCssName() {
        Object objValue = this._get(DTOFIELD_LABELPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPSSysCssNameDirty() {
        return this._contains(DTOFIELD_LABELPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetLabelPSSysCssName() {
        this._reset(DTOFIELD_LABELPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO labelpssyscssname(String labelPSSysCssName) {
        this.setLabelPSSysCssName(labelPSSysCssName);
        return this;
    }

    @JsonProperty(value="labelrawcssstyle")
    public void setLabelRawCssStyle(String labelRawCssStyle) {
        this._set(DTOFIELD_LABELRAWCSSSTYLE, labelRawCssStyle);
    }

    @JsonIgnore
    public String getLabelRawCssStyle() {
        Object objValue = this._get(DTOFIELD_LABELRAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelRawCssStyleDirty() {
        return this._contains(DTOFIELD_LABELRAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetLabelRawCssStyle() {
        this._reset(DTOFIELD_LABELRAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO labelrawcssstyle(String labelRawCssStyle) {
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    @JsonProperty(value="layoutmode")
    public void setLayoutMode(String layoutMode) {
        this._set(DTOFIELD_LAYOUTMODE, layoutMode);
    }

    @JsonIgnore
    public String getLayoutMode() {
        Object objValue = this._get(DTOFIELD_LAYOUTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutModeDirty() {
        return this._contains(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public void resetLayoutMode() {
        this._reset(DTOFIELD_LAYOUTMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
        if (layoutMode == null) {
            this.setLayoutMode(null);
        } else {
            this.setLayoutMode(layoutMode.value);
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
    public PSSysViewPanelItemDTO leftpos(Integer leftPos) {
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
    public PSSysViewPanelItemDTO logicname(String logicName) {
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
    public PSSysViewPanelItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="mobflag")
    public void setMobFlag(Integer mobFlag) {
        this._set(DTOFIELD_MOBFLAG, mobFlag);
    }

    @JsonIgnore
    public Integer getMobFlag() {
        Object objValue = this._get(DTOFIELD_MOBFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMobFlagDirty() {
        return this._contains(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public void resetMobFlag() {
        this._reset(DTOFIELD_MOBFLAG);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonProperty(value="openpsappviewid")
    public void setOpenPSAppViewId(String openPSAppViewId) {
        this._set(DTOFIELD_OPENPSAPPVIEWID, openPSAppViewId);
    }

    @JsonIgnore
    public String getOpenPSAppViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSAppViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSAPPVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSAppViewId() {
        this._reset(DTOFIELD_OPENPSAPPVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsappviewid(String openPSAppViewId) {
        this.setOpenPSAppViewId(openPSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setOpenPSAppViewId(null);
            this.setOpenPSAppViewName(null);
        } else {
            this.setOpenPSAppViewId(pSAppView.getPSAppViewId());
            this.setOpenPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="openpsappviewname")
    public void setOpenPSAppViewName(String openPSAppViewName) {
        this._set(DTOFIELD_OPENPSAPPVIEWNAME, openPSAppViewName);
    }

    @JsonIgnore
    public String getOpenPSAppViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSAppViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSAppViewName() {
        this._reset(DTOFIELD_OPENPSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsappviewname(String openPSAppViewName) {
        this.setOpenPSAppViewName(openPSAppViewName);
        return this;
    }

    @JsonProperty(value="openpsdeviewid")
    public void setOpenPSDEViewId(String openPSDEViewId) {
        this._set(DTOFIELD_OPENPSDEVIEWID, openPSDEViewId);
    }

    @JsonIgnore
    public String getOpenPSDEViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSDEViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSDEVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSDEViewId() {
        this._reset(DTOFIELD_OPENPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsdeviewid(String openPSDEViewId) {
        this.setOpenPSDEViewId(openPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setOpenPSDEViewId(null);
            this.setOpenPSDEViewName(null);
        } else {
            this.setOpenPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setOpenPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="openpsdeviewname")
    public void setOpenPSDEViewName(String openPSDEViewName) {
        this._set(DTOFIELD_OPENPSDEVIEWNAME, openPSDEViewName);
    }

    @JsonIgnore
    public String getOpenPSDEViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSDEViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSDEViewName() {
        this._reset(DTOFIELD_OPENPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpsdeviewname(String openPSDEViewName) {
        this.setOpenPSDEViewName(openPSDEViewName);
        return this;
    }

    @JsonProperty(value="openpssyspdtviewid")
    public void setOpenPSSysPDTViewId(String openPSSysPDTViewId) {
        this._set(DTOFIELD_OPENPSSYSPDTVIEWID, openPSSysPDTViewId);
    }

    @JsonIgnore
    public String getOpenPSSysPDTViewId() {
        Object objValue = this._get(DTOFIELD_OPENPSSYSPDTVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSSysPDTViewIdDirty() {
        return this._contains(DTOFIELD_OPENPSSYSPDTVIEWID);
    }

    @JsonIgnore
    public void resetOpenPSSysPDTViewId() {
        this._reset(DTOFIELD_OPENPSSYSPDTVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpssyspdtviewid(String openPSSysPDTViewId) {
        this.setOpenPSSysPDTViewId(openPSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
        if (pSSysPDTView == null) {
            this.setOpenPSSysPDTViewId(null);
            this.setOpenPSSysPDTViewName(null);
        } else {
            this.setOpenPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setOpenPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    @JsonProperty(value="openpssyspdtviewname")
    public void setOpenPSSysPDTViewName(String openPSSysPDTViewName) {
        this._set(DTOFIELD_OPENPSSYSPDTVIEWNAME, openPSSysPDTViewName);
    }

    @JsonIgnore
    public String getOpenPSSysPDTViewName() {
        Object objValue = this._get(DTOFIELD_OPENPSSYSPDTVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenPSSysPDTViewNameDirty() {
        return this._contains(DTOFIELD_OPENPSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public void resetOpenPSSysPDTViewName() {
        this._reset(DTOFIELD_OPENPSSYSPDTVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO openpssyspdtviewname(String openPSSysPDTViewName) {
        this.setOpenPSSysPDTViewName(openPSSysPDTViewName);
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
    public PSSysViewPanelItemDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="orientationmode")
    public void setOrientationMode(String orientationMode) {
        this._set(DTOFIELD_ORIENTATIONMODE, orientationMode);
    }

    @JsonIgnore
    public String getOrientationMode() {
        Object objValue = this._get(DTOFIELD_ORIENTATIONMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrientationModeDirty() {
        return this._contains(DTOFIELD_ORIENTATIONMODE);
    }

    @JsonIgnore
    public void resetOrientationMode() {
        this._reset(DTOFIELD_ORIENTATIONMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO orientationmode(String orientationMode) {
        this.setOrientationMode(orientationMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO orientationmode(PSModelEnums.MobAppOrientationMode orientationMode) {
        if (orientationMode == null) {
            this.setOrientationMode(null);
        } else {
            this.setOrientationMode(orientationMode.value);
        }
        return this;
    }

    @JsonProperty(value="phpslanresid")
    public void setPHPSLanResId(String pHPSLanResId) {
        this._set(DTOFIELD_PHPSLANRESID, pHPSLanResId);
    }

    @JsonIgnore
    public String getPHPSLanResId() {
        Object objValue = this._get(DTOFIELD_PHPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPHPSLanResIdDirty() {
        return this._contains(DTOFIELD_PHPSLANRESID);
    }

    @JsonIgnore
    public void resetPHPSLanResId() {
        this._reset(DTOFIELD_PHPSLANRESID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        } else {
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="phpslanresname")
    public void setPHPSLanResName(String pHPSLanResName) {
        this._set(DTOFIELD_PHPSLANRESNAME, pHPSLanResName);
    }

    @JsonIgnore
    public String getPHPSLanResName() {
        Object objValue = this._get(DTOFIELD_PHPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPHPSLanResNameDirty() {
        return this._contains(DTOFIELD_PHPSLANRESNAME);
    }

    @JsonIgnore
    public void resetPHPSLanResName() {
        this._reset(DTOFIELD_PHPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO phpslanresname(String pHPSLanResName) {
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    @JsonProperty(value="placeholder")
    public void setPlaceHolder(String placeHolder) {
        this._set(DTOFIELD_PLACEHOLDER, placeHolder);
    }

    @JsonIgnore
    public String getPlaceHolder() {
        Object objValue = this._get(DTOFIELD_PLACEHOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPlaceHolderDirty() {
        return this._contains(DTOFIELD_PLACEHOLDER);
    }

    @JsonIgnore
    public void resetPlaceHolder() {
        this._reset(DTOFIELD_PLACEHOLDER);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO placeholder(String placeHolder) {
        this.setPlaceHolder(placeHolder);
        return this;
    }

    @JsonProperty(value="playoutmode")
    public void setPLayoutMode(String pLayoutMode) {
        this._set(DTOFIELD_PLAYOUTMODE, pLayoutMode);
    }

    @JsonIgnore
    public String getPLayoutMode() {
        Object objValue = this._get(DTOFIELD_PLAYOUTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPLayoutModeDirty() {
        return this._contains(DTOFIELD_PLAYOUTMODE);
    }

    @JsonIgnore
    public void resetPLayoutMode() {
        this._reset(DTOFIELD_PLAYOUTMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO playoutmode(String pLayoutMode) {
        this.setPLayoutMode(pLayoutMode);
        return this;
    }

    @JsonProperty(value="ppssysviewpanelitemid")
    public void setPPSSysViewPanelItemId(String pPSSysViewPanelItemId) {
        this._set(DTOFIELD_PPSSYSVIEWPANELITEMID, pPSSysViewPanelItemId);
    }

    @JsonIgnore
    public String getPPSSysViewPanelItemId() {
        Object objValue = this._get(DTOFIELD_PPSSYSVIEWPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysViewPanelItemIdDirty() {
        return this._contains(DTOFIELD_PPSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public void resetPPSSysViewPanelItemId() {
        this._reset(DTOFIELD_PPSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ppssysviewpanelitemid(String pPSSysViewPanelItemId) {
        this.setPPSSysViewPanelItemId(pPSSysViewPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ppssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setPLayoutMode(null);
            this.setPPSSysViewPanelItemId(null);
            this.setPPSSysViewPanelItemName(null);
        } else {
            this.setPLayoutMode(pSSysViewPanelItem.getLayoutMode());
            this.setPPSSysViewPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPPSSysViewPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="ppssysviewpanelitemname")
    public void setPPSSysViewPanelItemName(String pPSSysViewPanelItemName) {
        this._set(DTOFIELD_PPSSYSVIEWPANELITEMNAME, pPSSysViewPanelItemName);
    }

    @JsonIgnore
    public String getPPSSysViewPanelItemName() {
        Object objValue = this._get(DTOFIELD_PPSSYSVIEWPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSysViewPanelItemNameDirty() {
        return this._contains(DTOFIELD_PPSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public void resetPPSSysViewPanelItemName() {
        this._reset(DTOFIELD_PPSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO ppssysviewpanelitemname(String pPSSysViewPanelItemName) {
        this.setPPSSysViewPanelItemName(pPSSysViewPanelItemName);
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
    public PSSysViewPanelItemDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
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
    public PSSysViewPanelItemDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    @JsonProperty(value="psachandlerid")
    public void setPSACHandlerId(String pSACHandlerId) {
        this._set(DTOFIELD_PSACHANDLERID, pSACHandlerId);
    }

    @JsonIgnore
    public String getPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSACHandlerId() {
        this._reset(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        } else {
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="psachandlername")
    public void setPSACHandlerName(String pSACHandlerName) {
        this._set(DTOFIELD_PSACHANDLERNAME, pSACHandlerName);
    }

    @JsonIgnore
    public String getPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSACHandlerName() {
        this._reset(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
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
    public PSSysViewPanelItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSSysViewPanelItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psctrlid")
    public void setPSCtrlId(String pSCtrlId) {
        this._set(DTOFIELD_PSCTRLID, pSCtrlId);
    }

    @JsonIgnore
    public String getPSCtrlId() {
        Object objValue = this._get(DTOFIELD_PSCTRLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlIdDirty() {
        return this._contains(DTOFIELD_PSCTRLID);
    }

    @JsonIgnore
    public void resetPSCtrlId() {
        this._reset(DTOFIELD_PSCTRLID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psctrlid(String pSCtrlId) {
        this.setPSCtrlId(pSCtrlId);
        return this;
    }

    @JsonProperty(value="psctrllogicgroupid")
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupId() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupId() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
        if (pSCtrlLogicGroup == null) {
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        } else {
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    @JsonProperty(value="psctrllogicgroupname")
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupName() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupName() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    @JsonProperty(value="psctrlname")
    public void setPSCtrlName(String pSCtrlName) {
        this._set(DTOFIELD_PSCTRLNAME, pSCtrlName);
    }

    @JsonIgnore
    public String getPSCtrlName() {
        Object objValue = this._get(DTOFIELD_PSCTRLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlNameDirty() {
        return this._contains(DTOFIELD_PSCTRLNAME);
    }

    @JsonIgnore
    public void resetPSCtrlName() {
        this._reset(DTOFIELD_PSCTRLNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psctrlname(String pSCtrlName) {
        this.setPSCtrlName(pSCtrlName);
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
    public PSSysViewPanelItemDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
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
    public PSSysViewPanelItemDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdechartid")
    public void setPSDEChartId(String pSDEChartId) {
        this._set(DTOFIELD_PSDECHARTID, pSDEChartId);
    }

    @JsonIgnore
    public String getPSDEChartId() {
        Object objValue = this._get(DTOFIELD_PSDECHARTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartIdDirty() {
        return this._contains(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public void resetPSDEChartId() {
        this._reset(DTOFIELD_PSDECHARTID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdechartid(String pSDEChartId) {
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdechartid(PSDEChartDTO pSDEChart) {
        if (pSDEChart == null) {
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
        } else {
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
        }
        return this;
    }

    @JsonProperty(value="psdechartname")
    public void setPSDEChartName(String pSDEChartName) {
        this._set(DTOFIELD_PSDECHARTNAME, pSDEChartName);
    }

    @JsonIgnore
    public String getPSDEChartName() {
        Object objValue = this._get(DTOFIELD_PSDECHARTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEChartNameDirty() {
        return this._contains(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public void resetPSDEChartName() {
        this._reset(DTOFIELD_PSDECHARTNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdechartname(String pSDEChartName) {
        this.setPSDEChartName(pSDEChartName);
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
    public PSSysViewPanelItemDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysViewPanelItemDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    @JsonProperty(value="psdedataviewid")
    public void setPSDEDataViewId(String pSDEDataViewId) {
        this._set(DTOFIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }

    @JsonIgnore
    public String getPSDEDataViewId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public void resetPSDEDataViewId() {
        this._reset(DTOFIELD_PSDEDATAVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedataviewid(String pSDEDataViewId) {
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedataviewid(PSDEDataViewDTO pSDEDataView) {
        if (pSDEDataView == null) {
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        } else {
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    @JsonProperty(value="psdedataviewname")
    public void setPSDEDataViewName(String pSDEDataViewName) {
        this._set(DTOFIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }

    @JsonIgnore
    public String getPSDEDataViewName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataViewNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDEDataViewName() {
        this._reset(DTOFIELD_PSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedataviewname(String pSDEDataViewName) {
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    @JsonProperty(value="psdedrid")
    public void setPSDEDRId(String pSDEDRId) {
        this._set(DTOFIELD_PSDEDRID, pSDEDRId);
    }

    @JsonIgnore
    public String getPSDEDRId() {
        Object objValue = this._get(DTOFIELD_PSDEDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRIdDirty() {
        return this._contains(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public void resetPSDEDRId() {
        this._reset(DTOFIELD_PSDEDRID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedrid(String pSDEDRId) {
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedrid(PSDEDataRelationDTO pSDEDataRelation) {
        if (pSDEDataRelation == null) {
            this.setPSDEDRId(null);
            this.setPSDEDRName(null);
        } else {
            this.setPSDEDRId(pSDEDataRelation.getPSDEDataRelationId());
            this.setPSDEDRName(pSDEDataRelation.getPSDEDataRelationName());
        }
        return this;
    }

    @JsonProperty(value="psdedritemid")
    public void setPSDEDRItemId(String pSDEDRItemId) {
        this._set(DTOFIELD_PSDEDRITEMID, pSDEDRItemId);
    }

    @JsonIgnore
    public String getPSDEDRItemId() {
        Object objValue = this._get(DTOFIELD_PSDEDRITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRItemIdDirty() {
        return this._contains(DTOFIELD_PSDEDRITEMID);
    }

    @JsonIgnore
    public void resetPSDEDRItemId() {
        this._reset(DTOFIELD_PSDEDRITEMID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedritemid(String pSDEDRItemId) {
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedritemid(PSDEDRItemDTO pSDEDRItem) {
        if (pSDEDRItem == null) {
            this.setPSDEDRItemId(null);
            this.setPSDEDRItemName(null);
        } else {
            this.setPSDEDRItemId(pSDEDRItem.getPSDEDRItemId());
            this.setPSDEDRItemName(pSDEDRItem.getPSDEDRItemName());
        }
        return this;
    }

    @JsonProperty(value="psdedritemname")
    public void setPSDEDRItemName(String pSDEDRItemName) {
        this._set(DTOFIELD_PSDEDRITEMNAME, pSDEDRItemName);
    }

    @JsonIgnore
    public String getPSDEDRItemName() {
        Object objValue = this._get(DTOFIELD_PSDEDRITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRItemNameDirty() {
        return this._contains(DTOFIELD_PSDEDRITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEDRItemName() {
        this._reset(DTOFIELD_PSDEDRITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedritemname(String pSDEDRItemName) {
        this.setPSDEDRItemName(pSDEDRItemName);
        return this;
    }

    @JsonProperty(value="psdedrname")
    public void setPSDEDRName(String pSDEDRName) {
        this._set(DTOFIELD_PSDEDRNAME, pSDEDRName);
    }

    @JsonIgnore
    public String getPSDEDRName() {
        Object objValue = this._get(DTOFIELD_PSDEDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDRNameDirty() {
        return this._contains(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public void resetPSDEDRName() {
        this._reset(DTOFIELD_PSDEDRNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdedrname(String pSDEDRName) {
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    @JsonProperty(value="psdegridid")
    public void setPSDEGridId(String pSDEGridId) {
        this._set(DTOFIELD_PSDEGRIDID, pSDEGridId);
    }

    @JsonIgnore
    public String getPSDEGridId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public void resetPSDEGridId() {
        this._reset(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdegridid(PSDEGridDTO pSDEGrid) {
        if (pSDEGrid == null) {
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        } else {
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    @JsonProperty(value="psdegridname")
    public void setPSDEGridName(String pSDEGridName) {
        this._set(DTOFIELD_PSDEGRIDNAME, pSDEGridName);
    }

    @JsonIgnore
    public String getPSDEGridName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public void resetPSDEGridName() {
        this._reset(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
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
    public PSSysViewPanelItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelistid")
    public void setPSDEListId(String pSDEListId) {
        this._set(DTOFIELD_PSDELISTID, pSDEListId);
    }

    @JsonIgnore
    public String getPSDEListId() {
        Object objValue = this._get(DTOFIELD_PSDELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListIdDirty() {
        return this._contains(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public void resetPSDEListId() {
        this._reset(DTOFIELD_PSDELISTID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdelistid(String pSDEListId) {
        this.setPSDEListId(pSDEListId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdelistid(PSDEListDTO pSDEList) {
        if (pSDEList == null) {
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        } else {
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    @JsonProperty(value="psdelistname")
    public void setPSDEListName(String pSDEListName) {
        this._set(DTOFIELD_PSDELISTNAME, pSDEListName);
    }

    @JsonIgnore
    public String getPSDEListName() {
        Object objValue = this._get(DTOFIELD_PSDELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEListNameDirty() {
        return this._contains(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public void resetPSDEListName() {
        this._reset(DTOFIELD_PSDELISTNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdelistname(String pSDEListName) {
        this.setPSDEListName(pSDEListName);
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
    public PSSysViewPanelItemDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSSysViewPanelItemDTO psdelogicname(String pSDELogicName) {
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
    public PSSysViewPanelItemDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdepanelid")
    public void setPSDEPanelId(String pSDEPanelId) {
        this._set(DTOFIELD_PSDEPANELID, pSDEPanelId);
    }

    @JsonIgnore
    public String getPSDEPanelId() {
        Object objValue = this._get(DTOFIELD_PSDEPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPanelIdDirty() {
        return this._contains(DTOFIELD_PSDEPANELID);
    }

    @JsonIgnore
    public void resetPSDEPanelId() {
        this._reset(DTOFIELD_PSDEPANELID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdepanelid(String pSDEPanelId) {
        this.setPSDEPanelId(pSDEPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdepanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSDEPanelId(null);
            this.setPSDEPanelName(null);
        } else {
            this.setPSDEPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSDEPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="psdepanelname")
    public void setPSDEPanelName(String pSDEPanelName) {
        this._set(DTOFIELD_PSDEPANELNAME, pSDEPanelName);
    }

    @JsonIgnore
    public String getPSDEPanelName() {
        Object objValue = this._get(DTOFIELD_PSDEPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEPanelNameDirty() {
        return this._contains(DTOFIELD_PSDEPANELNAME);
    }

    @JsonIgnore
    public void resetPSDEPanelName() {
        this._reset(DTOFIELD_PSDEPANELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdepanelname(String pSDEPanelName) {
        this.setPSDEPanelName(pSDEPanelName);
        return this;
    }

    @JsonProperty(value="psdereportid")
    public void setPSDEReportId(String pSDEReportId) {
        this._set(DTOFIELD_PSDEREPORTID, pSDEReportId);
    }

    @JsonIgnore
    public String getPSDEReportId() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportIdDirty() {
        return this._contains(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public void resetPSDEReportId() {
        this._reset(DTOFIELD_PSDEREPORTID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdereportid(String pSDEReportId) {
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdereportid(PSDEReportDTO pSDEReport) {
        if (pSDEReport == null) {
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        } else {
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    @JsonProperty(value="psdereportname")
    public void setPSDEReportName(String pSDEReportName) {
        this._set(DTOFIELD_PSDEREPORTNAME, pSDEReportName);
    }

    @JsonIgnore
    public String getPSDEReportName() {
        Object objValue = this._get(DTOFIELD_PSDEREPORTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEReportNameDirty() {
        return this._contains(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public void resetPSDEReportName() {
        this._reset(DTOFIELD_PSDEREPORTNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdereportname(String pSDEReportName) {
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    @JsonProperty(value="psdesearchformid")
    public void setPSDESearchFormId(String pSDESearchFormId) {
        this._set(DTOFIELD_PSDESEARCHFORMID, pSDESearchFormId);
    }

    @JsonIgnore
    public String getPSDESearchFormId() {
        Object objValue = this._get(DTOFIELD_PSDESEARCHFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESearchFormIdDirty() {
        return this._contains(DTOFIELD_PSDESEARCHFORMID);
    }

    @JsonIgnore
    public void resetPSDESearchFormId() {
        this._reset(DTOFIELD_PSDESEARCHFORMID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdesearchformid(String pSDESearchFormId) {
        this.setPSDESearchFormId(pSDESearchFormId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdesearchformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDESearchFormId(null);
            this.setPSDESearchFormName(null);
        } else {
            this.setPSDESearchFormId(pSDEForm.getPSDEFormId());
            this.setPSDESearchFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdesearchformname")
    public void setPSDESearchFormName(String pSDESearchFormName) {
        this._set(DTOFIELD_PSDESEARCHFORMNAME, pSDESearchFormName);
    }

    @JsonIgnore
    public String getPSDESearchFormName() {
        Object objValue = this._get(DTOFIELD_PSDESEARCHFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESearchFormNameDirty() {
        return this._contains(DTOFIELD_PSDESEARCHFORMNAME);
    }

    @JsonIgnore
    public void resetPSDESearchFormName() {
        this._reset(DTOFIELD_PSDESEARCHFORMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdesearchformname(String pSDESearchFormName) {
        this.setPSDESearchFormName(pSDESearchFormName);
        return this;
    }

    @JsonProperty(value="psdetoolbarid")
    public void setPSDEToolbarId(String pSDEToolbarId) {
        this._set(DTOFIELD_PSDETOOLBARID, pSDEToolbarId);
    }

    @JsonIgnore
    public String getPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public void resetPSDEToolbarId() {
        this._reset(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        } else {
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="psdetoolbarname")
    public void setPSDEToolbarName(String pSDEToolbarName) {
        this._set(DTOFIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }

    @JsonIgnore
    public String getPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarName() {
        this._reset(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonProperty(value="psdetreeviewid")
    public void setPSDETreeViewId(String pSDETreeViewId) {
        this._set(DTOFIELD_PSDETREEVIEWID, pSDETreeViewId);
    }

    @JsonIgnore
    public String getPSDETreeViewId() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewIdDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public void resetPSDETreeViewId() {
        this._reset(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
        if (pSDETreeView == null) {
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        } else {
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    @JsonProperty(value="psdetreeviewname")
    public void setPSDETreeViewName(String pSDETreeViewName) {
        this._set(DTOFIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }

    @JsonIgnore
    public String getPSDETreeViewName() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewNameDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDETreeViewName() {
        this._reset(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
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
    public PSSysViewPanelItemDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSSysViewPanelItemDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSSysViewPanelItemDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
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
    public PSSysViewPanelItemDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="psdewizardid")
    public void setPSDEWizardId(String pSDEWizardId) {
        this._set(DTOFIELD_PSDEWIZARDID, pSDEWizardId);
    }

    @JsonIgnore
    public String getPSDEWizardId() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardIdDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDID);
    }

    @JsonIgnore
    public void resetPSDEWizardId() {
        this._reset(DTOFIELD_PSDEWIZARDID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdewizardid(String pSDEWizardId) {
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdewizardid(PSDEWizardDTO pSDEWizard) {
        if (pSDEWizard == null) {
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        } else {
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    @JsonProperty(value="psdewizardname")
    public void setPSDEWizardName(String pSDEWizardName) {
        this._set(DTOFIELD_PSDEWIZARDNAME, pSDEWizardName);
    }

    @JsonIgnore
    public String getPSDEWizardName() {
        Object objValue = this._get(DTOFIELD_PSDEWIZARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEWizardNameDirty() {
        return this._contains(DTOFIELD_PSDEWIZARDNAME);
    }

    @JsonIgnore
    public void resetPSDEWizardName() {
        this._reset(DTOFIELD_PSDEWIZARDNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO psdewizardname(String pSDEWizardName) {
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    @JsonProperty(value="pssyscalendarid")
    public void setPSSysCalendarId(String pSSysCalendarId) {
        this._set(DTOFIELD_PSSYSCALENDARID, pSSysCalendarId);
    }

    @JsonIgnore
    public String getPSSysCalendarId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public void resetPSSysCalendarId() {
        this._reset(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar) {
        if (pSSysCalendar == null) {
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        } else {
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    @JsonProperty(value="pssyscalendarname")
    public void setPSSysCalendarName(String pSSysCalendarName) {
        this._set(DTOFIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }

    @JsonIgnore
    public String getPSSysCalendarName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarName() {
        this._reset(DTOFIELD_PSSYSCALENDARNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscalendarname(String pSSysCalendarName) {
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysdashboardid")
    public void setPSSysDashboardId(String pSSysDashboardId) {
        this._set(DTOFIELD_PSSYSDASHBOARDID, pSSysDashboardId);
    }

    @JsonIgnore
    public String getPSSysDashboardId() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardIdDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public void resetPSSysDashboardId() {
        this._reset(DTOFIELD_PSSYSDASHBOARDID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysdashboardid(String pSSysDashboardId) {
        this.setPSSysDashboardId(pSSysDashboardId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysdashboardid(PSSysDashboardDTO pSSysDashboard) {
        if (pSSysDashboard == null) {
            this.setPSSysDashboardId(null);
            this.setPSSysDashboardName(null);
        } else {
            this.setPSSysDashboardId(pSSysDashboard.getPSSysDashboardId());
            this.setPSSysDashboardName(pSSysDashboard.getPSSysDashboardName());
        }
        return this;
    }

    @JsonProperty(value="pssysdashboardname")
    public void setPSSysDashboardName(String pSSysDashboardName) {
        this._set(DTOFIELD_PSSYSDASHBOARDNAME, pSSysDashboardName);
    }

    @JsonIgnore
    public String getPSSysDashboardName() {
        Object objValue = this._get(DTOFIELD_PSSYSDASHBOARDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDashboardNameDirty() {
        return this._contains(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public void resetPSSysDashboardName() {
        this._reset(DTOFIELD_PSSYSDASHBOARDNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysdashboardname(String pSSysDashboardName) {
        this.setPSSysDashboardName(pSSysDashboardName);
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
    public PSSysViewPanelItemDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysViewPanelItemDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyseditorstyleid")
    public void setPSSysEditorStyleId(String pSSysEditorStyleId) {
        this._set(DTOFIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }

    @JsonIgnore
    public String getPSSysEditorStyleId() {
        Object objValue = this._get(DTOFIELD_PSSYSEDITORSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty() {
        return this._contains(DTOFIELD_PSSYSEDITORSTYLEID);
    }

    @JsonIgnore
    public void resetPSSysEditorStyleId() {
        this._reset(DTOFIELD_PSSYSEDITORSTYLEID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
        if (pSSysEditorStyle == null) {
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        } else {
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    @JsonProperty(value="pssyseditorstylename")
    public void setPSSysEditorStyleName(String pSSysEditorStyleName) {
        this._set(DTOFIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }

    @JsonIgnore
    public String getPSSysEditorStyleName() {
        Object objValue = this._get(DTOFIELD_PSSYSEDITORSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty() {
        return this._contains(DTOFIELD_PSSYSEDITORSTYLENAME);
    }

    @JsonIgnore
    public void resetPSSysEditorStyleName() {
        this._reset(DTOFIELD_PSSYSEDITORSTYLENAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyseditorstylename(String pSSysEditorStyleName) {
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageIdDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetPSSysImageId() {
        this._reset(DTOFIELD_PSSYSIMAGEID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        } else {
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="pssysimagename")
    public void setPSSysImageName(String pSSysImageName) {
        this._set(DTOFIELD_PSSYSIMAGENAME, pSSysImageName);
    }

    @JsonIgnore
    public String getPSSysImageName() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysImageNameDirty() {
        return this._contains(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetPSSysImageName() {
        this._reset(DTOFIELD_PSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssysmapviewid")
    public void setPSSysMapViewId(String pSSysMapViewId) {
        this._set(DTOFIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }

    @JsonIgnore
    public String getPSSysMapViewId() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewIdDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public void resetPSSysMapViewId() {
        this._reset(DTOFIELD_PSSYSMAPVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysmapviewid(String pSSysMapViewId) {
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysmapviewid(PSSysMapViewDTO pSSysMapView) {
        if (pSSysMapView == null) {
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        } else {
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    @JsonProperty(value="pssysmapviewname")
    public void setPSSysMapViewName(String pSSysMapViewName) {
        this._set(DTOFIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }

    @JsonIgnore
    public String getPSSysMapViewName() {
        Object objValue = this._get(DTOFIELD_PSSYSMAPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMapViewNameDirty() {
        return this._contains(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSysMapViewName() {
        this._reset(DTOFIELD_PSSYSMAPVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysmapviewname(String pSSysMapViewName) {
        this.setPSSysMapViewName(pSSysMapViewName);
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
    public PSSysViewPanelItemDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysViewPanelItemDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSSysViewPanelItemDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
    public PSSysViewPanelItemDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    @JsonProperty(value="pssyssearchbarid")
    public void setPSSysSearchBarId(String pSSysSearchBarId) {
        this._set(DTOFIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }

    @JsonIgnore
    public String getPSSysSearchBarId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public void resetPSSysSearchBarId() {
        this._reset(DTOFIELD_PSSYSSEARCHBARID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyssearchbarid(String pSSysSearchBarId) {
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyssearchbarid(PSSysSearchBarDTO pSSysSearchBar) {
        if (pSSysSearchBar == null) {
            this.setPSSysSearchBarId(null);
            this.setPSSysSearchBarName(null);
        } else {
            this.setPSSysSearchBarId(pSSysSearchBar.getPSSysSearchBarId());
            this.setPSSysSearchBarName(pSSysSearchBar.getPSSysSearchBarName());
        }
        return this;
    }

    @JsonProperty(value="pssyssearchbarname")
    public void setPSSysSearchBarName(String pSSysSearchBarName) {
        this._set(DTOFIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }

    @JsonIgnore
    public String getPSSysSearchBarName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEARCHBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public void resetPSSysSearchBarName() {
        this._reset(DTOFIELD_PSSYSSEARCHBARNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssyssearchbarname(String pSSysSearchBarName) {
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setMobFlag(null);
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setMobFlag(pSSysViewPanel.getMobFlag());
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemid")
    public void setPSSysViewPanelItemId(String pSSysViewPanelItemId) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMID, pSSysViewPanelItemId);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysviewpanelitemid(String pSSysViewPanelItemId) {
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemname")
    public void setPSSysViewPanelItemName(String pSSysViewPanelItemName) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMNAME, pSSysViewPanelItemName);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysviewpanelitemname(String pSSysViewPanelItemName) {
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysViewPanelItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysViewPanelItemName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO name(String strName) {
        this.setPSSysViewPanelItemName(strName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="rawcontent")
    public void setRawContent(String rawContent) {
        this._set(DTOFIELD_RAWCONTENT, rawContent);
    }

    @JsonIgnore
    public String getRawContent() {
        Object objValue = this._get(DTOFIELD_RAWCONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawContentDirty() {
        return this._contains(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public void resetRawContent() {
        this._reset(DTOFIELD_RAWCONTENT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rawcontent(String rawContent) {
        this.setRawContent(rawContent);
        return this;
    }

    @JsonProperty(value="rawcssstyle")
    public void setRawCssStyle(String rawCssStyle) {
        this._set(DTOFIELD_RAWCSSSTYLE, rawCssStyle);
    }

    @JsonIgnore
    public String getRawCssStyle() {
        Object objValue = this._get(DTOFIELD_RAWCSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRawCssStyleDirty() {
        return this._contains(DTOFIELD_RAWCSSSTYLE);
    }

    @JsonIgnore
    public void resetRawCssStyle() {
        this._reset(DTOFIELD_RAWCSSSTYLE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rawcssstyle(String rawCssStyle) {
        this.setRawCssStyle(rawCssStyle);
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
    public PSSysViewPanelItemDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
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
    public PSSysViewPanelItemDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    @JsonProperty(value="readonlymode")
    public void setReadOnlyMode(Integer readOnlyMode) {
        this._set(DTOFIELD_READONLYMODE, readOnlyMode);
    }

    @JsonIgnore
    public Integer getReadOnlyMode() {
        Object objValue = this._get(DTOFIELD_READONLYMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReadOnlyModeDirty() {
        return this._contains(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public void resetReadOnlyMode() {
        this._reset(DTOFIELD_READONLYMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO readonlymode(Integer readOnlyMode) {
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO readonlymode(Boolean readOnlyMode) {
        if (readOnlyMode == null) {
            this.setReadOnlyMode(null);
        } else {
            this.setReadOnlyMode(readOnlyMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="refctrl2name")
    public void setRefCtrl2Name(String refCtrl2Name) {
        this._set(DTOFIELD_REFCTRL2NAME, refCtrl2Name);
    }

    @JsonIgnore
    public String getRefCtrl2Name() {
        Object objValue = this._get(DTOFIELD_REFCTRL2NAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2NameDirty() {
        return this._contains(DTOFIELD_REFCTRL2NAME);
    }

    @JsonIgnore
    public void resetRefCtrl2Name() {
        this._reset(DTOFIELD_REFCTRL2NAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrl2name(String refCtrl2Name) {
        this.setRefCtrl2Name(refCtrl2Name);
        return this;
    }

    @JsonProperty(value="refctrl2usage")
    public void setRefCtrl2Usage(String refCtrl2Usage) {
        this._set(DTOFIELD_REFCTRL2USAGE, refCtrl2Usage);
    }

    @JsonIgnore
    public String getRefCtrl2Usage() {
        Object objValue = this._get(DTOFIELD_REFCTRL2USAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2UsageDirty() {
        return this._contains(DTOFIELD_REFCTRL2USAGE);
    }

    @JsonIgnore
    public void resetRefCtrl2Usage() {
        this._reset(DTOFIELD_REFCTRL2USAGE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrl2usage(String refCtrl2Usage) {
        this.setRefCtrl2Usage(refCtrl2Usage);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrl2usage(PSModelEnums.ViewCtrlRefUsageAll refCtrl2Usage) {
        if (refCtrl2Usage == null) {
            this.setRefCtrl2Usage(null);
        } else {
            this.setRefCtrl2Usage(refCtrl2Usage.value);
        }
        return this;
    }

    @JsonProperty(value="refctrl2usagetext")
    public void setRefCtrl2UsageText(String refCtrl2UsageText) {
        this._set(DTOFIELD_REFCTRL2USAGETEXT, refCtrl2UsageText);
    }

    @JsonIgnore
    public String getRefCtrl2UsageText() {
        Object objValue = this._get(DTOFIELD_REFCTRL2USAGETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrl2UsageTextDirty() {
        return this._contains(DTOFIELD_REFCTRL2USAGETEXT);
    }

    @JsonIgnore
    public void resetRefCtrl2UsageText() {
        this._reset(DTOFIELD_REFCTRL2USAGETEXT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrl2usagetext(String refCtrl2UsageText) {
        this.setRefCtrl2UsageText(refCtrl2UsageText);
        return this;
    }

    @JsonProperty(value="refctrlname")
    public void setRefCtrlName(String refCtrlName) {
        this._set(DTOFIELD_REFCTRLNAME, refCtrlName);
    }

    @JsonIgnore
    public String getRefCtrlName() {
        Object objValue = this._get(DTOFIELD_REFCTRLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlNameDirty() {
        return this._contains(DTOFIELD_REFCTRLNAME);
    }

    @JsonIgnore
    public void resetRefCtrlName() {
        this._reset(DTOFIELD_REFCTRLNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrlname(String refCtrlName) {
        this.setRefCtrlName(refCtrlName);
        return this;
    }

    @JsonProperty(value="refctrlusage")
    public void setRefCtrlUsage(String refCtrlUsage) {
        this._set(DTOFIELD_REFCTRLUSAGE, refCtrlUsage);
    }

    @JsonIgnore
    public String getRefCtrlUsage() {
        Object objValue = this._get(DTOFIELD_REFCTRLUSAGE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlUsageDirty() {
        return this._contains(DTOFIELD_REFCTRLUSAGE);
    }

    @JsonIgnore
    public void resetRefCtrlUsage() {
        this._reset(DTOFIELD_REFCTRLUSAGE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrlusage(String refCtrlUsage) {
        this.setRefCtrlUsage(refCtrlUsage);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrlusage(PSModelEnums.ViewCtrlRefUsageAll refCtrlUsage) {
        if (refCtrlUsage == null) {
            this.setRefCtrlUsage(null);
        } else {
            this.setRefCtrlUsage(refCtrlUsage.value);
        }
        return this;
    }

    @JsonProperty(value="refctrlusagetext")
    public void setRefCtrlUsageText(String refCtrlUsageText) {
        this._set(DTOFIELD_REFCTRLUSAGETEXT, refCtrlUsageText);
    }

    @JsonIgnore
    public String getRefCtrlUsageText() {
        Object objValue = this._get(DTOFIELD_REFCTRLUSAGETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefCtrlUsageTextDirty() {
        return this._contains(DTOFIELD_REFCTRLUSAGETEXT);
    }

    @JsonIgnore
    public void resetRefCtrlUsageText() {
        this._reset(DTOFIELD_REFCTRLUSAGETEXT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refctrlusagetext(String refCtrlUsageText) {
        this.setRefCtrlUsageText(refCtrlUsageText);
        return this;
    }

    @JsonProperty(value="reflinkpsdeviewid")
    public void setRefLinkPSDEViewId(String refLinkPSDEViewId) {
        this._set(DTOFIELD_REFLINKPSDEVIEWID, refLinkPSDEViewId);
    }

    @JsonIgnore
    public String getRefLinkPSDEViewId() {
        Object objValue = this._get(DTOFIELD_REFLINKPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefLinkPSDEViewIdDirty() {
        return this._contains(DTOFIELD_REFLINKPSDEVIEWID);
    }

    @JsonIgnore
    public void resetRefLinkPSDEViewId() {
        this._reset(DTOFIELD_REFLINKPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO reflinkpsdeviewid(String refLinkPSDEViewId) {
        this.setRefLinkPSDEViewId(refLinkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO reflinkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setRefLinkPSDEViewId(null);
            this.setRefLinkPSDEViewName(null);
        } else {
            this.setRefLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="reflinkpsdeviewname")
    public void setRefLinkPSDEViewName(String refLinkPSDEViewName) {
        this._set(DTOFIELD_REFLINKPSDEVIEWNAME, refLinkPSDEViewName);
    }

    @JsonIgnore
    public String getRefLinkPSDEViewName() {
        Object objValue = this._get(DTOFIELD_REFLINKPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefLinkPSDEViewNameDirty() {
        return this._contains(DTOFIELD_REFLINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetRefLinkPSDEViewName() {
        this._reset(DTOFIELD_REFLINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO reflinkpsdeviewname(String refLinkPSDEViewName) {
        this.setRefLinkPSDEViewName(refLinkPSDEViewName);
        return this;
    }

    @JsonProperty(value="refpickuppsdeviewid")
    public void setRefPickupPSDEViewId(String refPickupPSDEViewId) {
        this._set(DTOFIELD_REFPICKUPPSDEVIEWID, refPickupPSDEViewId);
    }

    @JsonIgnore
    public String getRefPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_REFPICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_REFPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetRefPickupPSDEViewId() {
        this._reset(DTOFIELD_REFPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpickuppsdeviewid(String refPickupPSDEViewId) {
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setRefPickupPSDEViewId(null);
            this.setRefPickupPSDEViewName(null);
        } else {
            this.setRefPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="refpickuppsdeviewname")
    public void setRefPickupPSDEViewName(String refPickupPSDEViewName) {
        this._set(DTOFIELD_REFPICKUPPSDEVIEWNAME, refPickupPSDEViewName);
    }

    @JsonIgnore
    public String getRefPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_REFPICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_REFPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetRefPickupPSDEViewName() {
        this._reset(DTOFIELD_REFPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpickuppsdeviewname(String refPickupPSDEViewName) {
        this.setRefPickupPSDEViewName(refPickupPSDEViewName);
        return this;
    }

    @JsonProperty(value="refpsdeacmodeid")
    public void setRefPSDEACModeId(String refPSDEACModeId) {
        this._set(DTOFIELD_REFPSDEACMODEID, refPSDEACModeId);
    }

    @JsonIgnore
    public String getRefPSDEACModeId() {
        Object objValue = this._get(DTOFIELD_REFPSDEACMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty() {
        return this._contains(DTOFIELD_REFPSDEACMODEID);
    }

    @JsonIgnore
    public void resetRefPSDEACModeId() {
        this._reset(DTOFIELD_REFPSDEACMODEID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
        if (pSDEACMode == null) {
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        } else {
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    @JsonProperty(value="refpsdeacmodename")
    public void setRefPSDEACModeName(String refPSDEACModeName) {
        this._set(DTOFIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }

    @JsonIgnore
    public String getRefPSDEACModeName() {
        Object objValue = this._get(DTOFIELD_REFPSDEACMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty() {
        return this._contains(DTOFIELD_REFPSDEACMODENAME);
    }

    @JsonIgnore
    public void resetRefPSDEACModeName() {
        this._reset(DTOFIELD_REFPSDEACMODENAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdeacmodename(String refPSDEACModeName) {
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    @JsonProperty(value="refpsdedatasetid")
    public void setRefPSDEDataSetId(String refPSDEDataSetId) {
        this._set(DTOFIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }

    @JsonIgnore
    public String getRefPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetId() {
        this._reset(DTOFIELD_REFPSDEDATASETID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        } else {
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="refpsdedatasetname")
    public void setRefPSDEDataSetName(String refPSDEDataSetName) {
        this._set(DTOFIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }

    @JsonIgnore
    public String getRefPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_REFPSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetRefPSDEDataSetName() {
        this._reset(DTOFIELD_REFPSDEDATASETNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdedatasetname(String refPSDEDataSetName) {
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="refpsdeid")
    public void setRefPSDEId(String refPSDEId) {
        this._set(DTOFIELD_REFPSDEID, refPSDEId);
    }

    @JsonIgnore
    public String getRefPSDEId() {
        Object objValue = this._get(DTOFIELD_REFPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEIdDirty() {
        return this._contains(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public void resetRefPSDEId() {
        this._reset(DTOFIELD_REFPSDEID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        } else {
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="refpsdename")
    public void setRefPSDEName(String refPSDEName) {
        this._set(DTOFIELD_REFPSDENAME, refPSDEName);
    }

    @JsonIgnore
    public String getRefPSDEName() {
        Object objValue = this._get(DTOFIELD_REFPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDENameDirty() {
        return this._contains(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public void resetRefPSDEName() {
        this._reset(DTOFIELD_REFPSDENAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    @JsonProperty(value="rendermode")
    public void setRenderMode(String renderMode) {
        this._set(DTOFIELD_RENDERMODE, renderMode);
    }

    @JsonIgnore
    public String getRenderMode() {
        Object objValue = this._get(DTOFIELD_RENDERMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeDirty() {
        return this._contains(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public void resetRenderMode() {
        this._reset(DTOFIELD_RENDERMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rendermode(String renderMode) {
        this.setRenderMode(renderMode);
        return this;
    }

    @JsonProperty(value="rendermodetext")
    public void setRenderModeText(String renderModeText) {
        this._set(DTOFIELD_RENDERMODETEXT, renderModeText);
    }

    @JsonIgnore
    public String getRenderModeText() {
        Object objValue = this._get(DTOFIELD_RENDERMODETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRenderModeTextDirty() {
        return this._contains(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public void resetRenderModeText() {
        this._reset(DTOFIELD_RENDERMODETEXT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rendermodetext(String renderModeText) {
        this.setRenderModeText(renderModeText);
        return this;
    }

    @JsonProperty(value="resetitemname")
    public void setResetItemName(String resetItemName) {
        this._set(DTOFIELD_RESETITEMNAME, resetItemName);
    }

    @JsonIgnore
    public String getResetItemName() {
        Object objValue = this._get(DTOFIELD_RESETITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResetItemNameDirty() {
        return this._contains(DTOFIELD_RESETITEMNAME);
    }

    @JsonIgnore
    public void resetResetItemName() {
        this._reset(DTOFIELD_RESETITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
        return this;
    }

    @JsonProperty(value="rightpos")
    public void setRightPos(Integer rightPos) {
        this._set(DTOFIELD_RIGHTPOS, rightPos);
    }

    @JsonIgnore
    public Integer getRightPos() {
        Object objValue = this._get(DTOFIELD_RIGHTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRightPosDirty() {
        return this._contains(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public void resetRightPos() {
        this._reset(DTOFIELD_RIGHTPOS);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rightpos(Integer rightPos) {
        this.setRightPos(rightPos);
        return this;
    }

    @JsonProperty(value="rowspan")
    public void setRowSpan(Integer rowSpan) {
        this._set(DTOFIELD_ROWSPAN, rowSpan);
    }

    @JsonIgnore
    public Integer getRowSpan() {
        Object objValue = this._get(DTOFIELD_ROWSPAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRowSpanDirty() {
        return this._contains(DTOFIELD_ROWSPAN);
    }

    @JsonIgnore
    public void resetRowSpan() {
        this._reset(DTOFIELD_ROWSPAN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO rowspan(Integer rowSpan) {
        this.setRowSpan(rowSpan);
        return this;
    }

    @JsonProperty(value="showcaption")
    public void setShowCaption(Integer showCaption) {
        this._set(DTOFIELD_SHOWCAPTION, showCaption);
    }

    @JsonIgnore
    public Integer getShowCaption() {
        Object objValue = this._get(DTOFIELD_SHOWCAPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowCaptionDirty() {
        return this._contains(DTOFIELD_SHOWCAPTION);
    }

    @JsonIgnore
    public void resetShowCaption() {
        this._reset(DTOFIELD_SHOWCAPTION);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO showcaption(Integer showCaption) {
        this.setShowCaption(showCaption);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO showcaption(Boolean showCaption) {
        if (showCaption == null) {
            this.setShowCaption(null);
        } else {
            this.setShowCaption(showCaption != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="spacingbottom")
    public void setSpacingBottom(String spacingBottom) {
        this._set(DTOFIELD_SPACINGBOTTOM, spacingBottom);
    }

    @JsonIgnore
    public String getSpacingBottom() {
        Object objValue = this._get(DTOFIELD_SPACINGBOTTOM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSpacingBottomDirty() {
        return this._contains(DTOFIELD_SPACINGBOTTOM);
    }

    @JsonIgnore
    public void resetSpacingBottom() {
        this._reset(DTOFIELD_SPACINGBOTTOM);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingbottom(String spacingBottom) {
        this.setSpacingBottom(spacingBottom);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingbottom(PSModelEnums.SpacingMode spacingBottom) {
        if (spacingBottom == null) {
            this.setSpacingBottom(null);
        } else {
            this.setSpacingBottom(spacingBottom.value);
        }
        return this;
    }

    @JsonProperty(value="spacingleft")
    public void setSpacingLeft(String spacingLeft) {
        this._set(DTOFIELD_SPACINGLEFT, spacingLeft);
    }

    @JsonIgnore
    public String getSpacingLeft() {
        Object objValue = this._get(DTOFIELD_SPACINGLEFT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSpacingLeftDirty() {
        return this._contains(DTOFIELD_SPACINGLEFT);
    }

    @JsonIgnore
    public void resetSpacingLeft() {
        this._reset(DTOFIELD_SPACINGLEFT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingleft(String spacingLeft) {
        this.setSpacingLeft(spacingLeft);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingleft(PSModelEnums.SpacingMode spacingLeft) {
        if (spacingLeft == null) {
            this.setSpacingLeft(null);
        } else {
            this.setSpacingLeft(spacingLeft.value);
        }
        return this;
    }

    @JsonProperty(value="spacingright")
    public void setSpacingRight(String spacingRight) {
        this._set(DTOFIELD_SPACINGRIGHT, spacingRight);
    }

    @JsonIgnore
    public String getSpacingRight() {
        Object objValue = this._get(DTOFIELD_SPACINGRIGHT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSpacingRightDirty() {
        return this._contains(DTOFIELD_SPACINGRIGHT);
    }

    @JsonIgnore
    public void resetSpacingRight() {
        this._reset(DTOFIELD_SPACINGRIGHT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingright(String spacingRight) {
        this.setSpacingRight(spacingRight);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingright(PSModelEnums.SpacingMode spacingRight) {
        if (spacingRight == null) {
            this.setSpacingRight(null);
        } else {
            this.setSpacingRight(spacingRight.value);
        }
        return this;
    }

    @JsonProperty(value="spacingtop")
    public void setSpacingTop(String spacingTop) {
        this._set(DTOFIELD_SPACINGTOP, spacingTop);
    }

    @JsonIgnore
    public String getSpacingTop() {
        Object objValue = this._get(DTOFIELD_SPACINGTOP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSpacingTopDirty() {
        return this._contains(DTOFIELD_SPACINGTOP);
    }

    @JsonIgnore
    public void resetSpacingTop() {
        this._reset(DTOFIELD_SPACINGTOP);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingtop(String spacingTop) {
        this.setSpacingTop(spacingTop);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO spacingtop(PSModelEnums.SpacingMode spacingTop) {
        if (spacingTop == null) {
            this.setSpacingTop(null);
        } else {
            this.setSpacingTop(spacingTop.value);
        }
        return this;
    }

    @JsonProperty(value="swapmode")
    public void setSwapMode(String swapMode) {
        this._set(DTOFIELD_SWAPMODE, swapMode);
    }

    @JsonIgnore
    public String getSwapMode() {
        Object objValue = this._get(DTOFIELD_SWAPMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSwapModeDirty() {
        return this._contains(DTOFIELD_SWAPMODE);
    }

    @JsonIgnore
    public void resetSwapMode() {
        this._reset(DTOFIELD_SWAPMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO swapmode(String swapMode) {
        this.setSwapMode(swapMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO swapmode(PSModelEnums.WrapMode swapMode) {
        if (swapMode == null) {
            this.setSwapMode(null);
        } else {
            this.setSwapMode(swapMode.value);
        }
        return this;
    }

    @JsonProperty(value="tabindex")
    public void setTabIndex(Integer tabIndex) {
        this._set(DTOFIELD_TABINDEX, tabIndex);
    }

    @JsonIgnore
    public Integer getTabIndex() {
        Object objValue = this._get(DTOFIELD_TABINDEX);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTabIndexDirty() {
        return this._contains(DTOFIELD_TABINDEX);
    }

    @JsonIgnore
    public void resetTabIndex() {
        this._reset(DTOFIELD_TABINDEX);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO tabindex(Integer tabIndex) {
        this.setTabIndex(tabIndex);
        return this;
    }

    @JsonProperty(value="targetid")
    public void setTargetId(String targetId) {
        this._set(DTOFIELD_TARGETID, targetId);
    }

    @JsonIgnore
    public String getTargetId() {
        Object objValue = this._get(DTOFIELD_TARGETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetIdDirty() {
        return this._contains(DTOFIELD_TARGETID);
    }

    @JsonIgnore
    public void resetTargetId() {
        this._reset(DTOFIELD_TARGETID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO targetid(String targetId) {
        this.setTargetId(targetId);
        return this;
    }

    @JsonProperty(value="targetname")
    public void setTargetName(String targetName) {
        this._set(DTOFIELD_TARGETNAME, targetName);
    }

    @JsonIgnore
    public String getTargetName() {
        Object objValue = this._get(DTOFIELD_TARGETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetNameDirty() {
        return this._contains(DTOFIELD_TARGETNAME);
    }

    @JsonIgnore
    public void resetTargetName() {
        this._reset(DTOFIELD_TARGETNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO targetname(String targetName) {
        this.setTargetName(targetName);
        return this;
    }

    @JsonProperty(value="targettype")
    public void setTargetType(String targetType) {
        this._set(DTOFIELD_TARGETTYPE, targetType);
    }

    @JsonIgnore
    public String getTargetType() {
        Object objValue = this._get(DTOFIELD_TARGETTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTargetTypeDirty() {
        return this._contains(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public void resetTargetType() {
        this._reset(DTOFIELD_TARGETTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO targettype(String targetType) {
        this.setTargetType(targetType);
        return this;
    }

    @JsonProperty(value="templatemode")
    public void setTemplateMode(Integer templateMode) {
        this._set(DTOFIELD_TEMPLATEMODE, templateMode);
    }

    @JsonIgnore
    public Integer getTemplateMode() {
        Object objValue = this._get(DTOFIELD_TEMPLATEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplateModeDirty() {
        return this._contains(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public void resetTemplateMode() {
        this._reset(DTOFIELD_TEMPLATEMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO templatemode(Boolean templateMode) {
        if (templateMode == null) {
            this.setTemplateMode(null);
        } else {
            this.setTemplateMode(templateMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tippslanresid")
    public void setTipPSLanResId(String tipPSLanResId) {
        this._set(DTOFIELD_TIPPSLANRESID, tipPSLanResId);
    }

    @JsonIgnore
    public String getTipPSLanResId() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResIdDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public void resetTipPSLanResId() {
        this._reset(DTOFIELD_TIPPSLANRESID);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        } else {
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="tippslanresname")
    public void setTipPSLanResName(String tipPSLanResName) {
        this._set(DTOFIELD_TIPPSLANRESNAME, tipPSLanResName);
    }

    @JsonIgnore
    public String getTipPSLanResName() {
        Object objValue = this._get(DTOFIELD_TIPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipPSLanResNameDirty() {
        return this._contains(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTipPSLanResName() {
        this._reset(DTOFIELD_TIPPSLANRESNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="titlebarclosemode")
    public void setTitleBarCloseMode(Integer titleBarCloseMode) {
        this._set(DTOFIELD_TITLEBARCLOSEMODE, titleBarCloseMode);
    }

    @JsonIgnore
    public Integer getTitleBarCloseMode() {
        Object objValue = this._get(DTOFIELD_TITLEBARCLOSEMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTitleBarCloseModeDirty() {
        return this._contains(DTOFIELD_TITLEBARCLOSEMODE);
    }

    @JsonIgnore
    public void resetTitleBarCloseMode() {
        this._reset(DTOFIELD_TITLEBARCLOSEMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO titlebarclosemode(Integer titleBarCloseMode) {
        this.setTitleBarCloseMode(titleBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO titlebarclosemode(PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode) {
        if (titleBarCloseMode == null) {
            this.setTitleBarCloseMode(null);
        } else {
            this.setTitleBarCloseMode(titleBarCloseMode.value);
        }
        return this;
    }

    @JsonProperty(value="togglemode")
    public void setToggleMode(String toggleMode) {
        this._set(DTOFIELD_TOGGLEMODE, toggleMode);
    }

    @JsonIgnore
    public String getToggleMode() {
        Object objValue = this._get(DTOFIELD_TOGGLEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isToggleModeDirty() {
        return this._contains(DTOFIELD_TOGGLEMODE);
    }

    @JsonIgnore
    public void resetToggleMode() {
        this._reset(DTOFIELD_TOGGLEMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO togglemode(String toggleMode) {
        this.setToggleMode(toggleMode);
        return this;
    }

    @JsonProperty(value="tooltipinfo")
    public void setTooltipInfo(String tooltipInfo) {
        this._set(DTOFIELD_TOOLTIPINFO, tooltipInfo);
    }

    @JsonIgnore
    public String getTooltipInfo() {
        Object objValue = this._get(DTOFIELD_TOOLTIPINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTooltipInfoDirty() {
        return this._contains(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public void resetTooltipInfo() {
        this._reset(DTOFIELD_TOOLTIPINFO);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
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
    public PSSysViewPanelItemDTO toppos(Integer topPos) {
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
    public PSSysViewPanelItemDTO updatedate(Timestamp updateDate) {
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
    public PSSysViewPanelItemDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysViewPanelItemDTO usertag(String userTag) {
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
    public PSSysViewPanelItemDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="valign")
    public void setVAlign(String vAlign) {
        this._set(DTOFIELD_VALIGN, vAlign);
    }

    @JsonIgnore
    public String getVAlign() {
        Object objValue = this._get(DTOFIELD_VALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVAlignDirty() {
        return this._contains(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public void resetVAlign() {
        this._reset(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valign(String vAlign) {
        this.setVAlign(vAlign);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valign(PSModelEnums.TextVAlign vAlign) {
        if (vAlign == null) {
            this.setVAlign(null);
        } else {
            this.setVAlign(vAlign.value);
        }
        return this;
    }

    @JsonProperty(value="valignself")
    public void setVAlignSelf(String vAlignSelf) {
        this._set(DTOFIELD_VALIGNSELF, vAlignSelf);
    }

    @JsonIgnore
    public String getVAlignSelf() {
        Object objValue = this._get(DTOFIELD_VALIGNSELF);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVAlignSelfDirty() {
        return this._contains(DTOFIELD_VALIGNSELF);
    }

    @JsonIgnore
    public void resetVAlignSelf() {
        this._reset(DTOFIELD_VALIGNSELF);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valignself(String vAlignSelf) {
        this.setVAlignSelf(vAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valignself(PSModelEnums.TextVAlign vAlignSelf) {
        if (vAlignSelf == null) {
            this.setVAlignSelf(null);
        } else {
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    @JsonProperty(value="valueformat")
    public void setValueFormat(String valueFormat) {
        this._set(DTOFIELD_VALUEFORMAT, valueFormat);
    }

    @JsonIgnore
    public String getValueFormat() {
        Object objValue = this._get(DTOFIELD_VALUEFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueFormatDirty() {
        return this._contains(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public void resetValueFormat() {
        this._reset(DTOFIELD_VALUEFORMAT);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonProperty(value="valueitemname")
    public void setValueItemName(String valueItemName) {
        this._set(DTOFIELD_VALUEITEMNAME, valueItemName);
    }

    @JsonIgnore
    public String getValueItemName() {
        Object objValue = this._get(DTOFIELD_VALUEITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueItemNameDirty() {
        return this._contains(DTOFIELD_VALUEITEMNAME);
    }

    @JsonIgnore
    public void resetValueItemName() {
        this._reset(DTOFIELD_VALUEITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO valueitemname(String valueItemName) {
        this.setValueItemName(valueItemName);
        return this;
    }

    @JsonProperty(value="width")
    public void setWidth(Integer width) {
        this._set(DTOFIELD_WIDTH, width);
    }

    @JsonIgnore
    public Integer getWidth() {
        Object objValue = this._get(DTOFIELD_WIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWidthDirty() {
        return this._contains(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public void resetWidth() {
        this._reset(DTOFIELD_WIDTH);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonProperty(value="widthmode")
    public void setWidthMode(String widthMode) {
        this._set(DTOFIELD_WIDTHMODE, widthMode);
    }

    @JsonIgnore
    public String getWidthMode() {
        Object objValue = this._get(DTOFIELD_WIDTHMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWidthModeDirty() {
        return this._contains(DTOFIELD_WIDTHMODE);
    }

    @JsonIgnore
    public void resetWidthMode() {
        this._reset(DTOFIELD_WIDTHMODE);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO widthmode(String widthMode) {
        this.setWidthMode(widthMode);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO widthmode(PSModelEnums.WidthMode widthMode) {
        if (widthMode == null) {
            this.setWidthMode(null);
        } else {
            this.setWidthMode(widthMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysViewPanelItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysViewPanelItemId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelItemDTO id(String strValue) {
        this.setPSSysViewPanelItemId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSSysViewPanelItemDTO> getPSSysViewPanelItems() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pssysviewpanelitems")
    public void setPSSysViewPanelItems(List<PSSysViewPanelItemDTO> pssysviewpanelitems) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMS, pssysviewpanelitems);
    }

    @JsonIgnore
    public List<PSSysViewPanelItemDTO> getPSSysViewPanelItemsIf() {
        Object list = this._get(DTOFIELD_PSSYSVIEWPANELITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSSYSVIEWPANELITEMS, list);
        }
        return (List)list;
    }

    @JsonIgnore
    public List<PSPanelItemLogicDTO> getPSPanelItemLogics() {
        Object list = this._get(DTOFIELD_PSPANELITEMLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pspanelitemlogics")
    public void setPSPanelItemLogics(List<PSPanelItemLogicDTO> pspanelitemlogics) {
        this._set(DTOFIELD_PSPANELITEMLOGICS, pspanelitemlogics);
    }

    @JsonIgnore
    public List<PSPanelItemLogicDTO> getPSPanelItemLogicsIf() {
        Object list = this._get(DTOFIELD_PSPANELITEMLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSPANELITEMLOGICS, list);
        }
        return (List)list;
    }
}
