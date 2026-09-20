package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFormDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_BL_POS = "BL_POS";
    protected static final String DTOFIELD_BL_POS = "bl_pos";
    public static final String FIELD_BORDERSTYLE = "BORDERSTYLE";
    protected static final String DTOFIELD_BORDERSTYLE = "borderstyle";
    public static final String FIELD_BTNACTIONTYPE = "BTNACTIONTYPE";
    protected static final String DTOFIELD_BTNACTIONTYPE = "btnactiontype";
    public static final String FIELD_BUILDINACTION = "BUILDINACTION";
    protected static final String DTOFIELD_BUILDINACTION = "buildinaction";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CHILD_COL_LG = "CHILD_COL_LG";
    protected static final String DTOFIELD_CHILD_COL_LG = "child_col_lg";
    public static final String FIELD_CHILD_COL_MD = "CHILD_COL_MD";
    protected static final String DTOFIELD_CHILD_COL_MD = "child_col_md";
    public static final String FIELD_CHILD_COL_SM = "CHILD_COL_SM";
    protected static final String DTOFIELD_CHILD_COL_SM = "child_col_sm";
    public static final String FIELD_CHILD_COL_XS = "CHILD_COL_XS";
    protected static final String DTOFIELD_CHILD_COL_XS = "child_col_xs";
    public static final String FIELD_CODELISTCONFIGMODE = "CODELISTCONFIGMODE";
    protected static final String DTOFIELD_CODELISTCONFIGMODE = "codelistconfigmode";
    public static final String FIELD_COLALIGN = "COLALIGN";
    protected static final String DTOFIELD_COLALIGN = "colalign";
    public static final String FIELD_COLID = "COLID";
    protected static final String DTOFIELD_COLID = "colid";
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
    public static final String FIELD_CONVERTCITEXT = "CONVERTCITEXT";
    protected static final String DTOFIELD_CONVERTCITEXT = "convertcitext";
    public static final String FIELD_COUNTERID = "COUNTERID";
    protected static final String DTOFIELD_COUNTERID = "counterid";
    public static final String FIELD_COUNTERMODE = "COUNTERMODE";
    protected static final String DTOFIELD_COUNTERMODE = "countermode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDV = "CREATEDV";
    protected static final String DTOFIELD_CREATEDV = "createdv";
    public static final String FIELD_CREATEDVT = "CREATEDVT";
    protected static final String DTOFIELD_CREATEDVT = "createdvt";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLCOLSPAN = "CTRLCOLSPAN";
    protected static final String DTOFIELD_CTRLCOLSPAN = "ctrlcolspan";
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
    public static final String FIELD_CTRLWIDTH = "CTRLWIDTH";
    protected static final String DTOFIELD_CTRLWIDTH = "ctrlwidth";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DATA = "DATA";
    protected static final String DTOFIELD_DATA = "data";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DETAILSTYLE = "DETAILSTYLE";
    protected static final String DTOFIELD_DETAILSTYLE = "detailstyle";
    public static final String FIELD_DETAILSTYLETEXT = "DETAILSTYLETEXT";
    protected static final String DTOFIELD_DETAILSTYLETEXT = "detailstyletext";
    public static final String FIELD_DETAILTAG = "DETAILTAG";
    protected static final String DTOFIELD_DETAILTAG = "detailtag";
    public static final String FIELD_DETAILTAG2 = "DETAILTAG2";
    protected static final String DTOFIELD_DETAILTAG2 = "detailtag2";
    public static final String FIELD_DETAILTYPE = "DETAILTYPE";
    protected static final String DTOFIELD_DETAILTYPE = "detailtype";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_EDITORPARAMS = "EDITORPARAMS";
    protected static final String DTOFIELD_EDITORPARAMS = "editorparams";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_EMPTYCAPTION = "EMPTYCAPTION";
    protected static final String DTOFIELD_EMPTYCAPTION = "emptycaption";
    public static final String FIELD_ENABLEANCHOR = "ENABLEANCHOR";
    protected static final String DTOFIELD_ENABLEANCHOR = "enableanchor";
    public static final String FIELD_ENABLECOND = "ENABLECOND";
    protected static final String DTOFIELD_ENABLECOND = "enablecond";
    public static final String FIELD_ENABLEINPUTTIP = "ENABLEINPUTTIP";
    protected static final String DTOFIELD_ENABLEINPUTTIP = "enableinputtip";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_FIELDNAME = "FIELDNAME";
    protected static final String DTOFIELD_FIELDNAME = "fieldname";
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
    public static final String FIELD_FORMTYPE = "FORMTYPE";
    protected static final String DTOFIELD_FORMTYPE = "formtype";
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
    public static final String FIELD_INSERTPOS = "INSERTPOS";
    protected static final String DTOFIELD_INSERTPOS = "insertpos";
    public static final String FIELD_ITEMPSACHANDLERID = "ITEMPSACHANDLERID";
    protected static final String DTOFIELD_ITEMPSACHANDLERID = "itempsachandlerid";
    public static final String FIELD_ITEMPSACHANDLERNAME = "ITEMPSACHANDLERNAME";
    protected static final String DTOFIELD_ITEMPSACHANDLERNAME = "itempsachandlername";
    public static final String FIELD_ITEMSTATES = "ITEMSTATES";
    protected static final String DTOFIELD_ITEMSTATES = "itemstates";
    public static final String FIELD_LABELCOLSPAN = "LABELCOLSPAN";
    protected static final String DTOFIELD_LABELCOLSPAN = "labelcolspan";
    public static final String FIELD_LABELCOLSPAN2 = "LABELCOLSPAN2";
    protected static final String DTOFIELD_LABELCOLSPAN2 = "labelcolspan2";
    public static final String FIELD_LABELDYNACLASS = "LABELDYNACLASS";
    protected static final String DTOFIELD_LABELDYNACLASS = "labeldynaclass";
    public static final String FIELD_LABELPOS = "LABELPOS";
    protected static final String DTOFIELD_LABELPOS = "labelpos";
    public static final String FIELD_LABELPSSYSCSSID = "LABELPSSYSCSSID";
    protected static final String DTOFIELD_LABELPSSYSCSSID = "labelpssyscssid";
    public static final String FIELD_LABELPSSYSCSSNAME = "LABELPSSYSCSSNAME";
    protected static final String DTOFIELD_LABELPSSYSCSSNAME = "labelpssyscssname";
    public static final String FIELD_LABELRAWCSSSTYLE = "LABELRAWCSSSTYLE";
    protected static final String DTOFIELD_LABELRAWCSSSTYLE = "labelrawcssstyle";
    public static final String FIELD_LABELWIDTH = "LABELWIDTH";
    protected static final String DTOFIELD_LABELWIDTH = "labelwidth";
    public static final String FIELD_LAYOUTMODE = "LAYOUTMODE";
    protected static final String DTOFIELD_LAYOUTMODE = "layoutmode";
    public static final String FIELD_LEVELTAG = "LEVELTAG";
    protected static final String DTOFIELD_LEVELTAG = "leveltag";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_MARGIN = "MARGIN";
    protected static final String DTOFIELD_MARGIN = "margin";
    public static final String FIELD_MASKINFO = "MASKINFO";
    protected static final String DTOFIELD_MASKINFO = "maskinfo";
    public static final String FIELD_MASKMODE = "MASKMODE";
    protected static final String DTOFIELD_MASKMODE = "maskmode";
    public static final String FIELD_MASKPSLANRESID = "MASKPSLANRESID";
    protected static final String DTOFIELD_MASKPSLANRESID = "maskpslanresid";
    public static final String FIELD_MASKPSLANRESNAME = "MASKPSLANRESNAME";
    protected static final String DTOFIELD_MASKPSLANRESNAME = "maskpslanresname";
    public static final String FIELD_MDCTRLTYPE = "MDCTRLTYPE";
    protected static final String DTOFIELD_MDCTRLTYPE = "mdctrltype";
    public static final String FIELD_MDPSDEDATAVIEWID = "MDPSDEDATAVIEWID";
    protected static final String DTOFIELD_MDPSDEDATAVIEWID = "mdpsdedataviewid";
    public static final String FIELD_MDPSDEDATAVIEWNAME = "MDPSDEDATAVIEWNAME";
    protected static final String DTOFIELD_MDPSDEDATAVIEWNAME = "mdpsdedataviewname";
    public static final String FIELD_MDPSDEFORMID = "MDPSDEFORMID";
    protected static final String DTOFIELD_MDPSDEFORMID = "mdpsdeformid";
    public static final String FIELD_MDPSDEFORMNAME = "MDPSDEFORMNAME";
    protected static final String DTOFIELD_MDPSDEFORMNAME = "mdpsdeformname";
    public static final String FIELD_MDPSDEGRIDID = "MDPSDEGRIDID";
    protected static final String DTOFIELD_MDPSDEGRIDID = "mdpsdegridid";
    public static final String FIELD_MDPSDEGRIDNAME = "MDPSDEGRIDNAME";
    protected static final String DTOFIELD_MDPSDEGRIDNAME = "mdpsdegridname";
    public static final String FIELD_MDPSDELISTID = "MDPSDELISTID";
    protected static final String DTOFIELD_MDPSDELISTID = "mdpsdelistid";
    public static final String FIELD_MDPSDELISTNAME = "MDPSDELISTNAME";
    protected static final String DTOFIELD_MDPSDELISTNAME = "mdpsdelistname";
    public static final String FIELD_MDPSSYSVIEWPANELID = "MDPSSYSVIEWPANELID";
    protected static final String DTOFIELD_MDPSSYSVIEWPANELID = "mdpssysviewpanelid";
    public static final String FIELD_MDPSSYSVIEWPANELNAME = "MDPSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_MDPSSYSVIEWPANELNAME = "mdpssysviewpanelname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBFLAG = "MOBFLAG";
    protected static final String DTOFIELD_MOBFLAG = "mobflag";
    public static final String FIELD_MODELSTATE = "MODELSTATE";
    protected static final String DTOFIELD_MODELSTATE = "modelstate";
    public static final String FIELD_NEEDCODELISTCONFIG = "NEEDCODELISTCONFIG";
    protected static final String DTOFIELD_NEEDCODELISTCONFIG = "needcodelistconfig";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
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
    public static final String FIELD_PADDING = "PADDING";
    protected static final String DTOFIELD_PADDING = "padding";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PICKUPPSDEVIEWID = "PICKUPPSDEVIEWID";
    protected static final String DTOFIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";
    public static final String FIELD_PICKUPPSDEVIEWNAME = "PICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PLAYOUTMODE = "PLAYOUTMODE";
    protected static final String DTOFIELD_PLAYOUTMODE = "playoutmode";
    public static final String FIELD_PPSDEFORMDETAILID = "PPSDEFORMDETAILID";
    protected static final String DTOFIELD_PPSDEFORMDETAILID = "ppsdeformdetailid";
    public static final String FIELD_PPSDEFORMDETAILNAME = "PPSDEFORMDETAILNAME";
    protected static final String DTOFIELD_PPSDEFORMDETAILNAME = "ppsdeformdetailname";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPETEXT = "PREDEFINEDTYPETEXT";
    protected static final String DTOFIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEDRID = "PSDEDRID";
    protected static final String DTOFIELD_PSDEDRID = "psdedrid";
    public static final String FIELD_PSDEDRITEMID = "PSDEDRITEMID";
    protected static final String DTOFIELD_PSDEDRITEMID = "psdedritemid";
    public static final String FIELD_PSDEDRITEMNAME = "PSDEDRITEMNAME";
    protected static final String DTOFIELD_PSDEDRITEMNAME = "psdedritemname";
    public static final String FIELD_PSDEDRNAME = "PSDEDRNAME";
    protected static final String DTOFIELD_PSDEDRNAME = "psdedrname";
    public static final String FIELD_PSDEFUIMODEID = "PSDEFFORMITEMID";
    protected static final String DTOFIELD_PSDEFUIMODEID = "psdefuimodeid";
    public static final String FIELD_PSDEFUIMODENAME = "PSDEFFORMITEMNAME";
    protected static final String DTOFIELD_PSDEFUIMODENAME = "psdefuimodename";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFIUPDATEID = "PSDEFIUPDATEID";
    protected static final String DTOFIELD_PSDEFIUPDATEID = "psdefiupdateid";
    public static final String FIELD_PSDEFIUPDATENAME = "PSDEFIUPDATENAME";
    protected static final String DTOFIELD_PSDEFIUPDATENAME = "psdefiupdatename";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFORMDETAILID = "PSDEFORMDETAILID";
    protected static final String DTOFIELD_PSDEFORMDETAILID = "psdeformdetailid";
    public static final String FIELD_PSDEFORMDETAILNAME = "PSDEFORMDETAILNAME";
    protected static final String DTOFIELD_PSDEFORMDETAILNAME = "psdeformdetailname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_PSDEFORMRFID = "PSDEFORMRFID";
    protected static final String DTOFIELD_PSDEFORMRFID = "psdeformrfid";
    public static final String FIELD_PSDEFORMRFNAME = "PSDEFORMRFNAME";
    protected static final String DTOFIELD_PSDEFORMRFNAME = "psdeformrfname";
    public static final String FIELD_PSDEFSFITEMID = "PSDEFSFITEMID";
    protected static final String DTOFIELD_PSDEFSFITEMID = "psdefsfitemid";
    public static final String FIELD_PSDEFSFITEMNAME = "PSDEFSFITEMNAME";
    protected static final String DTOFIELD_PSDEFSFITEMNAME = "psdefsfitemname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDICTCATID = "PSSYSDICTCATID";
    protected static final String DTOFIELD_PSSYSDICTCATID = "pssysdictcatid";
    public static final String FIELD_PSSYSDICTCATNAME = "PSSYSDICTCATNAME";
    protected static final String DTOFIELD_PSSYSDICTCATNAME = "pssysdictcatname";
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
    public static final String FIELD_PSSYSRESOURCEID = "PSSYSRESOURCEID";
    protected static final String DTOFIELD_PSSYSRESOURCEID = "pssysresourceid";
    public static final String FIELD_PSSYSRESOURCENAME = "PSSYSRESOURCENAME";
    protected static final String DTOFIELD_PSSYSRESOURCENAME = "pssysresourcename";
    public static final String FIELD_RAWCONTENT = "RAWCONTENT";
    protected static final String DTOFIELD_RAWCONTENT = "rawcontent";
    public static final String FIELD_RAWCSSSTYLE = "RAWCSSSTYLE";
    protected static final String DTOFIELD_RAWCSSSTYLE = "rawcssstyle";
    public static final String FIELD_RAWSERVICEMETHOD = "RAWSERVICEMETHOD";
    protected static final String DTOFIELD_RAWSERVICEMETHOD = "rawservicemethod";
    public static final String FIELD_RAWSERVICEURL = "RAWSERVICEURL";
    protected static final String DTOFIELD_RAWSERVICEURL = "rawserviceurl";
    public static final String FIELD_REFPSDEACMODEID = "REFPSDEACMODEID";
    protected static final String DTOFIELD_REFPSDEACMODEID = "refpsdeacmodeid";
    public static final String FIELD_REFPSDEACMODENAME = "REFPSDEACMODENAME";
    protected static final String DTOFIELD_REFPSDEACMODENAME = "refpsdeacmodename";
    public static final String FIELD_REFPSDEDATASETID = "REFPSDEDATASETID";
    protected static final String DTOFIELD_REFPSDEDATASETID = "refpsdedatasetid";
    public static final String FIELD_REFPSDEDATASETNAME = "REFPSDEDATASETNAME";
    protected static final String DTOFIELD_REFPSDEDATASETNAME = "refpsdedatasetname";
    public static final String FIELD_REFPSDEFORMDETAILID = "REFPSDEFORMDETAILID";
    protected static final String DTOFIELD_REFPSDEFORMDETAILID = "refpsdeformdetailid";
    public static final String FIELD_REFPSDEFORMDETAILNAME = "REFPSDEFORMDETAILNAME";
    protected static final String DTOFIELD_REFPSDEFORMDETAILNAME = "refpsdeformdetailname";
    public static final String FIELD_REFPSDEFORMID = "REFPSDEFORMID";
    protected static final String DTOFIELD_REFPSDEFORMID = "refpsdeformid";
    public static final String FIELD_REFPSDEID = "REFPSDEID";
    protected static final String DTOFIELD_REFPSDEID = "refpsdeid";
    public static final String FIELD_REFPSDENAME = "REFPSDENAME";
    protected static final String DTOFIELD_REFPSDENAME = "refpsdename";
    public static final String FIELD_REFPSDERID = "REFPSDERID";
    protected static final String DTOFIELD_REFPSDERID = "refpsderid";
    public static final String FIELD_REFPSDERNAME = "REFPSDERNAME";
    protected static final String DTOFIELD_REFPSDERNAME = "refpsdername";
    public static final String FIELD_RENDERMODE = "RENDERMODE";
    protected static final String DTOFIELD_RENDERMODE = "rendermode";
    public static final String FIELD_RENDERMODETEXT = "RENDERMODETEXT";
    protected static final String DTOFIELD_RENDERMODETEXT = "rendermodetext";
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_ROWSPAN = "ROWSPAN";
    protected static final String DTOFIELD_ROWSPAN = "rowspan";
    public static final String FIELD_SHOWCAPTION = "SHOWCAPTION";
    protected static final String DTOFIELD_SHOWCAPTION = "showcaption";
    public static final String FIELD_SHOWMOREMODE = "SHOWMOREMODE";
    protected static final String DTOFIELD_SHOWMOREMODE = "showmoremode";
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
    public static final String FIELD_UCPSSYSPFPLUGINID = "UCPSSYSPFPLUGINID";
    protected static final String DTOFIELD_UCPSSYSPFPLUGINID = "ucpssyspfpluginid";
    public static final String FIELD_UCPSSYSPFPLUGINNAME = "UCPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_UCPSSYSPFPLUGINNAME = "ucpssyspfpluginname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEDV = "UPDATEDV";
    protected static final String DTOFIELD_UPDATEDV = "updatedv";
    public static final String FIELD_UPDATEDVT = "UPDATEDVT";
    protected static final String DTOFIELD_UPDATEDVT = "updatedvt";
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
    public static final String FIELD_WBDEFMODE = "WBDEFMODE";
    protected static final String DTOFIELD_WBDEFMODE = "wbdefmode";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";
    public static final String FIELD_WIDTHMODE = "WIDTHMODE";
    protected static final String DTOFIELD_WIDTHMODE = "widthmode";
    public static final String DTOFIELD_PSDEFORMDETAILS = "psdeformdetails";
    public static final String DTOFIELD_PSDEFDLOGICS = "psdefdlogics";

    @JsonProperty(value="allowempty")
    public void setAllowEmpty(Integer allowEmpty) {
        this._set(DTOFIELD_ALLOWEMPTY, allowEmpty);
    }

    @JsonIgnore
    public Integer getAllowEmpty() {
        Object objValue = this._get(DTOFIELD_ALLOWEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllowEmptyDirty() {
        return this._contains(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public void resetAllowEmpty() {
        this._reset(DTOFIELD_ALLOWEMPTY);
    }

    @JsonIgnore
    public PSDEFormDetailDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
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
    public PSDEFormDetailDTO bl_pos(String bL_Pos) {
        this.setBL_Pos(bL_Pos);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO bl_pos(PSModelEnums.BorderLayoutPos bL_Pos) {
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
    public PSDEFormDetailDTO borderstyle(String borderStyle) {
        this.setBorderStyle(borderStyle);
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
    public PSDEFormDetailDTO btnactiontype(String btnActionType) {
        this.setBtnActionType(btnActionType);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO btnactiontype(PSModelEnums.FormButtonActionType btnActionType) {
        if (btnActionType == null) {
            this.setBtnActionType(null);
        } else {
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    @JsonProperty(value="buildinaction")
    public void setBuildInAction(Integer buildInAction) {
        this._set(DTOFIELD_BUILDINACTION, buildInAction);
    }

    @JsonIgnore
    public Integer getBuildInAction() {
        Object objValue = this._get(DTOFIELD_BUILDINACTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBuildInActionDirty() {
        return this._contains(DTOFIELD_BUILDINACTION);
    }

    @JsonIgnore
    public void resetBuildInAction() {
        this._reset(DTOFIELD_BUILDINACTION);
    }

    @JsonIgnore
    public PSDEFormDetailDTO buildinaction(Integer buildInAction) {
        this.setBuildInAction(buildInAction);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO buildinaction(PSModelEnums.GroupBarMoreAction[] buildInAction) {
        if (buildInAction == null || buildInAction.length == 0) {
            this.setBuildInAction(null);
        } else {
            int _value = 0;
            for (PSModelEnums.GroupBarMoreAction _item : buildInAction) {
                _value |= _item.value;
            }
            this.setBuildInAction(_value);
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
    public PSDEFormDetailDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFormDetailDTO cappslanresname(String capPSLanResName) {
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
    public PSDEFormDetailDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEFormDetailDTO child_col_lg(Integer child_Col_LG) {
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
    public PSDEFormDetailDTO child_col_md(Integer child_Col_MD) {
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
    public PSDEFormDetailDTO child_col_sm(Integer child_Col_SM) {
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
    public PSDEFormDetailDTO child_col_xs(Integer child_Col_XS) {
        this.setChild_Col_XS(child_Col_XS);
        return this;
    }

    @JsonProperty(value="codelistconfigmode")
    public void setCodeListConfigMode(Integer codeListConfigMode) {
        this._set(DTOFIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }

    @JsonIgnore
    public Integer getCodeListConfigMode() {
        Object objValue = this._get(DTOFIELD_CODELISTCONFIGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCodeListConfigModeDirty() {
        return this._contains(DTOFIELD_CODELISTCONFIGMODE);
    }

    @JsonIgnore
    public void resetCodeListConfigMode() {
        this._reset(DTOFIELD_CODELISTCONFIGMODE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO codelistconfigmode(Integer codeListConfigMode) {
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO codelistconfigmode(PSModelEnums.OutputCodeListMode codeListConfigMode) {
        if (codeListConfigMode == null) {
            this.setCodeListConfigMode(null);
        } else {
            this.setCodeListConfigMode(codeListConfigMode.value);
        }
        return this;
    }

    @JsonProperty(value="colalign")
    public void setColAlign(String colAlign) {
        this._set(DTOFIELD_COLALIGN, colAlign);
    }

    @JsonIgnore
    public String getColAlign() {
        Object objValue = this._get(DTOFIELD_COLALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColAlignDirty() {
        return this._contains(DTOFIELD_COLALIGN);
    }

    @JsonIgnore
    public void resetColAlign() {
        this._reset(DTOFIELD_COLALIGN);
    }

    @JsonIgnore
    public PSDEFormDetailDTO colalign(String colAlign) {
        this.setColAlign(colAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO colalign(PSModelEnums.GridColAlign colAlign) {
        if (colAlign == null) {
            this.setColAlign(null);
        } else {
            this.setColAlign(colAlign.value);
        }
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
    public PSDEFormDetailDTO colid(Integer colId) {
        this.setColId(colId);
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
    public PSDEFormDetailDTO colmodel(String colModel) {
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
    public PSDEFormDetailDTO colspan(Integer colSpan) {
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
    public PSDEFormDetailDTO col_lg(Integer col_LG) {
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
    public PSDEFormDetailDTO col_lg_os(Integer col_LG_OS) {
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
    public PSDEFormDetailDTO col_md(Integer col_MD) {
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
    public PSDEFormDetailDTO col_md_os(Integer col_MD_OS) {
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
    public PSDEFormDetailDTO col_sm(Integer col_SM) {
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
    public PSDEFormDetailDTO col_sm_os(Integer col_SM_OS) {
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
    public PSDEFormDetailDTO col_width(Integer col_Width) {
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
    public PSDEFormDetailDTO col_xs(Integer col_XS) {
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
    public PSDEFormDetailDTO col_xs_os(Integer col_XS_OS) {
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
    public PSDEFormDetailDTO contenttype(String contentType) {
        this.setContentType(contentType);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO contenttype(PSModelEnums.RawItemContentType contentType) {
        if (contentType == null) {
            this.setContentType(null);
        } else {
            this.setContentType(contentType.value);
        }
        return this;
    }

    @JsonProperty(value="convertcitext")
    public void setConvertCIText(Integer convertCIText) {
        this._set(DTOFIELD_CONVERTCITEXT, convertCIText);
    }

    @JsonIgnore
    public Integer getConvertCIText() {
        Object objValue = this._get(DTOFIELD_CONVERTCITEXT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isConvertCITextDirty() {
        return this._contains(DTOFIELD_CONVERTCITEXT);
    }

    @JsonIgnore
    public void resetConvertCIText() {
        this._reset(DTOFIELD_CONVERTCITEXT);
    }

    @JsonIgnore
    public PSDEFormDetailDTO convertcitext(Integer convertCIText) {
        this.setConvertCIText(convertCIText);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO convertcitext(Boolean convertCIText) {
        if (convertCIText == null) {
            this.setConvertCIText(null);
        } else {
            this.setConvertCIText(convertCIText != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="counterid")
    public void setCounterId(String counterId) {
        this._set(DTOFIELD_COUNTERID, counterId);
    }

    @JsonIgnore
    public String getCounterId() {
        Object objValue = this._get(DTOFIELD_COUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCounterIdDirty() {
        return this._contains(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public void resetCounterId() {
        this._reset(DTOFIELD_COUNTERID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO counterid(String counterId) {
        this.setCounterId(counterId);
        return this;
    }

    @JsonProperty(value="countermode")
    public void setCounterMode(Integer counterMode) {
        this._set(DTOFIELD_COUNTERMODE, counterMode);
    }

    @JsonIgnore
    public Integer getCounterMode() {
        Object objValue = this._get(DTOFIELD_COUNTERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCounterModeDirty() {
        return this._contains(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public void resetCounterMode() {
        this._reset(DTOFIELD_COUNTERMODE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
        if (counterMode == null) {
            this.setCounterMode(null);
        } else {
            this.setCounterMode(counterMode.value);
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
    public PSDEFormDetailDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createdv")
    public void setCreateDV(String createDV) {
        this._set(DTOFIELD_CREATEDV, createDV);
    }

    @JsonIgnore
    public String getCreateDV() {
        Object objValue = this._get(DTOFIELD_CREATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVDirty() {
        return this._contains(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public void resetCreateDV() {
        this._reset(DTOFIELD_CREATEDV);
    }

    @JsonIgnore
    public PSDEFormDetailDTO createdv(String createDV) {
        this.setCreateDV(createDV);
        return this;
    }

    @JsonProperty(value="createdvt")
    public void setCreateDVT(String createDVT) {
        this._set(DTOFIELD_CREATEDVT, createDVT);
    }

    @JsonIgnore
    public String getCreateDVT() {
        Object objValue = this._get(DTOFIELD_CREATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateDVTDirty() {
        return this._contains(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public void resetCreateDVT() {
        this._reset(DTOFIELD_CREATEDVT);
    }

    @JsonIgnore
    public PSDEFormDetailDTO createdvt(String createDVT) {
        this.setCreateDVT(createDVT);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO createdvt(PSModelEnums.CreateDefaultValueType createDVT) {
        if (createDVT == null) {
            this.setCreateDVT(null);
        } else {
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEFormDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlcolspan")
    public void setCtrlColSpan(Integer ctrlColSpan) {
        this._set(DTOFIELD_CTRLCOLSPAN, ctrlColSpan);
    }

    @JsonIgnore
    public Integer getCtrlColSpan() {
        Object objValue = this._get(DTOFIELD_CTRLCOLSPAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlColSpanDirty() {
        return this._contains(DTOFIELD_CTRLCOLSPAN);
    }

    @JsonIgnore
    public void resetCtrlColSpan() {
        this._reset(DTOFIELD_CTRLCOLSPAN);
    }

    @JsonIgnore
    public PSDEFormDetailDTO ctrlcolspan(Integer ctrlColSpan) {
        this.setCtrlColSpan(ctrlColSpan);
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
    public PSDEFormDetailDTO ctrldynaclass(String ctrlDynaClass) {
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
    public PSDEFormDetailDTO ctrlheight(Integer ctrlHeight) {
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
    public PSDEFormDetailDTO ctrlpssyscssid(String ctrlPSSysCssId) {
        this.setCtrlPSSysCssId(ctrlPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO ctrlpssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEFormDetailDTO ctrlpssyscssname(String ctrlPSSysCssName) {
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
    public PSDEFormDetailDTO ctrlrawcssstyle(String ctrlRawCssStyle) {
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
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
    public PSDEFormDetailDTO ctrlwidth(Integer ctrlWidth) {
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
    public PSDEFormDetailDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="data")
    public void setData(String data) {
        this._set(DTOFIELD_DATA, data);
    }

    @JsonIgnore
    public String getData() {
        Object objValue = this._get(DTOFIELD_DATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataDirty() {
        return this._contains(DTOFIELD_DATA);
    }

    @JsonIgnore
    public void resetData() {
        this._reset(DTOFIELD_DATA);
    }

    @JsonIgnore
    public PSDEFormDetailDTO data(String data) {
        this.setData(data);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSDEFormDetailDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
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
    public PSDEFormDetailDTO detailstyle(String detailStyle) {
        this.setDetailStyle(detailStyle);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO detailstyle(PSModelEnums.CtrlDetailStyle detailStyle) {
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
    public PSDEFormDetailDTO detailstyletext(String detailStyleText) {
        this.setDetailStyleText(detailStyleText);
        return this;
    }

    @JsonProperty(value="detailtag")
    public void setDetailTag(String detailTag) {
        this._set(DTOFIELD_DETAILTAG, detailTag);
    }

    @JsonIgnore
    public String getDetailTag() {
        Object objValue = this._get(DTOFIELD_DETAILTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTagDirty() {
        return this._contains(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public void resetDetailTag() {
        this._reset(DTOFIELD_DETAILTAG);
    }

    @JsonIgnore
    public PSDEFormDetailDTO detailtag(String detailTag) {
        this.setDetailTag(detailTag);
        return this;
    }

    @JsonProperty(value="detailtag2")
    public void setDetailTag2(String detailTag2) {
        this._set(DTOFIELD_DETAILTAG2, detailTag2);
    }

    @JsonIgnore
    public String getDetailTag2() {
        Object objValue = this._get(DTOFIELD_DETAILTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTag2Dirty() {
        return this._contains(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public void resetDetailTag2() {
        this._reset(DTOFIELD_DETAILTAG2);
    }

    @JsonIgnore
    public PSDEFormDetailDTO detailtag2(String detailTag2) {
        this.setDetailTag2(detailTag2);
        return this;
    }

    @JsonProperty(value="detailtype")
    public void setDetailType(String detailType) {
        this._set(DTOFIELD_DETAILTYPE, detailType);
    }

    @JsonIgnore
    public String getDetailType() {
        Object objValue = this._get(DTOFIELD_DETAILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTypeDirty() {
        return this._contains(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public void resetDetailType() {
        this._reset(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO detailtype(String detailType) {
        this.setDetailType(detailType);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO detailtype(PSModelEnums.FormDetailType detailType) {
        if (detailType == null) {
            this.setDetailType(null);
        } else {
            this.setDetailType(detailType.value);
        }
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
    public PSDEFormDetailDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="editorparams")
    public void setEditorParams(String editorParams) {
        this._set(DTOFIELD_EDITORPARAMS, editorParams);
    }

    @JsonIgnore
    public String getEditorParams() {
        Object objValue = this._get(DTOFIELD_EDITORPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorParamsDirty() {
        return this._contains(DTOFIELD_EDITORPARAMS);
    }

    @JsonIgnore
    public void resetEditorParams() {
        this._reset(DTOFIELD_EDITORPARAMS);
    }

    @JsonIgnore
    public PSDEFormDetailDTO editorparams(String editorParams) {
        this.setEditorParams(editorParams);
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
    public PSDEFormDetailDTO editortype(String editorType) {
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
    public PSDEFormDetailDTO emptycaption(Integer emptyCaption) {
        this.setEmptyCaption(emptyCaption);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO emptycaption(Boolean emptyCaption) {
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
    public PSDEFormDetailDTO enableanchor(Integer enableAnchor) {
        this.setEnableAnchor(enableAnchor);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO enableanchor(Boolean enableAnchor) {
        if (enableAnchor == null) {
            this.setEnableAnchor(null);
        } else {
            this.setEnableAnchor(enableAnchor != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablecond")
    public void setEnableCond(Integer enableCond) {
        this._set(DTOFIELD_ENABLECOND, enableCond);
    }

    @JsonIgnore
    public Integer getEnableCond() {
        Object objValue = this._get(DTOFIELD_ENABLECOND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCondDirty() {
        return this._contains(DTOFIELD_ENABLECOND);
    }

    @JsonIgnore
    public void resetEnableCond() {
        this._reset(DTOFIELD_ENABLECOND);
    }

    @JsonIgnore
    public PSDEFormDetailDTO enablecond(Integer enableCond) {
        this.setEnableCond(enableCond);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO enablecond(PSModelEnums.EditItemEnableCond enableCond) {
        if (enableCond == null) {
            this.setEnableCond(null);
        } else {
            this.setEnableCond(enableCond.value);
        }
        return this;
    }

    @JsonProperty(value="enableinputtip")
    public void setEnableInputTip(Integer enableInputTip) {
        this._set(DTOFIELD_ENABLEINPUTTIP, enableInputTip);
    }

    @JsonIgnore
    public Integer getEnableInputTip() {
        Object objValue = this._get(DTOFIELD_ENABLEINPUTTIP);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableInputTipDirty() {
        return this._contains(DTOFIELD_ENABLEINPUTTIP);
    }

    @JsonIgnore
    public void resetEnableInputTip() {
        this._reset(DTOFIELD_ENABLEINPUTTIP);
    }

    @JsonIgnore
    public PSDEFormDetailDTO enableinputtip(Integer enableInputTip) {
        this.setEnableInputTip(enableInputTip);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO enableinputtip(Boolean enableInputTip) {
        if (enableInputTip == null) {
            this.setEnableInputTip(null);
        } else {
            this.setEnableInputTip(enableInputTip != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableitempriv")
    public void setEnableItemPriv(Integer enableItemPriv) {
        this._set(DTOFIELD_ENABLEITEMPRIV, enableItemPriv);
    }

    @JsonIgnore
    public Integer getEnableItemPriv() {
        Object objValue = this._get(DTOFIELD_ENABLEITEMPRIV);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableItemPrivDirty() {
        return this._contains(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public void resetEnableItemPriv() {
        this._reset(DTOFIELD_ENABLEITEMPRIV);
    }

    @JsonIgnore
    public PSDEFormDetailDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
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
    public PSDEFormDetailDTO fieldname(String fieldName) {
        this.setFieldName(fieldName);
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
    public PSDEFormDetailDTO flexalign(String flexAlign) {
        this.setFlexAlign(flexAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO flexalign(PSModelEnums.FlexAlign flexAlign) {
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
    public PSDEFormDetailDTO flexbasis(Integer flexBasis) {
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
    public PSDEFormDetailDTO flexdir(String flexDir) {
        this.setFlexDir(flexDir);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO flexdir(PSModelEnums.FlexLayoutDir flexDir) {
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
    public PSDEFormDetailDTO flexgrow(Integer flexGrow) {
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
    public PSDEFormDetailDTO flexshrink(Integer flexShrink) {
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
    public PSDEFormDetailDTO flexvalign(String flexVAlign) {
        this.setFlexVAlign(flexVAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO flexvalign(PSModelEnums.FlexVAlign flexVAlign) {
        if (flexVAlign == null) {
            this.setFlexVAlign(null);
        } else {
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    @JsonProperty(value="formtype")
    public void setFormType(String formType) {
        this._set(DTOFIELD_FORMTYPE, formType);
    }

    @JsonIgnore
    public String getFormType() {
        Object objValue = this._get(DTOFIELD_FORMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormTypeDirty() {
        return this._contains(DTOFIELD_FORMTYPE);
    }

    @JsonIgnore
    public void resetFormType() {
        this._reset(DTOFIELD_FORMTYPE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO formtype(String formType) {
        this.setFormType(formType);
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
    public PSDEFormDetailDTO gridrowid(Integer gridRowId) {
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
    public PSDEFormDetailDTO halign(String hAlign) {
        this.setHAlign(hAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO halign(PSModelEnums.TextAlign hAlign) {
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
    public PSDEFormDetailDTO halignself(String hAlignSelf) {
        this.setHAlignSelf(hAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO halignself(PSModelEnums.TextAlign hAlignSelf) {
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
    public PSDEFormDetailDTO height(Integer height) {
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
    public PSDEFormDetailDTO heightmode(String heightMode) {
        this.setHeightMode(heightMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO heightmode(PSModelEnums.HeightMode heightMode) {
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
    public PSDEFormDetailDTO htmlcontent(String htmlContent) {
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
    public PSDEFormDetailDTO htmlpageurl(String htmlPageUrl) {
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
    public PSDEFormDetailDTO iconalign(String iconAlign) {
        this.setIconAlign(iconAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO iconalign(PSModelEnums.ButtonIconAlign iconAlign) {
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
    public PSDEFormDetailDTO ignoreinput(Integer ignoreInput) {
        this.setIgnoreInput(ignoreInput);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO ignoreinput(PSModelEnums.EditItemIgnoreMode ignoreInput) {
        if (ignoreInput == null) {
            this.setIgnoreInput(null);
        } else {
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    @JsonProperty(value="insertpos")
    public void setInsertPos(Integer insertPos) {
        this._set(DTOFIELD_INSERTPOS, insertPos);
    }

    @JsonIgnore
    public Integer getInsertPos() {
        Object objValue = this._get(DTOFIELD_INSERTPOS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInsertPosDirty() {
        return this._contains(DTOFIELD_INSERTPOS);
    }

    @JsonIgnore
    public void resetInsertPos() {
        this._reset(DTOFIELD_INSERTPOS);
    }

    @JsonIgnore
    public PSDEFormDetailDTO insertpos(Integer insertPos) {
        this.setInsertPos(insertPos);
        return this;
    }

    @JsonProperty(value="itempsachandlerid")
    public void setItemPSACHandlerId(String itemPSACHandlerId) {
        this._set(DTOFIELD_ITEMPSACHANDLERID, itemPSACHandlerId);
    }

    @JsonIgnore
    public String getItemPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_ITEMPSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_ITEMPSACHANDLERID);
    }

    @JsonIgnore
    public void resetItemPSACHandlerId() {
        this._reset(DTOFIELD_ITEMPSACHANDLERID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO itempsachandlerid(String itemPSACHandlerId) {
        this.setItemPSACHandlerId(itemPSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO itempsachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setItemPSACHandlerId(null);
            this.setItemPSACHandlerName(null);
        } else {
            this.setItemPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setItemPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    @JsonProperty(value="itempsachandlername")
    public void setItemPSACHandlerName(String itemPSACHandlerName) {
        this._set(DTOFIELD_ITEMPSACHANDLERNAME, itemPSACHandlerName);
    }

    @JsonIgnore
    public String getItemPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_ITEMPSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_ITEMPSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetItemPSACHandlerName() {
        this._reset(DTOFIELD_ITEMPSACHANDLERNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO itempsachandlername(String itemPSACHandlerName) {
        this.setItemPSACHandlerName(itemPSACHandlerName);
        return this;
    }

    @JsonProperty(value="itemstates")
    public void setItemStates(Integer itemStates) {
        this._set(DTOFIELD_ITEMSTATES, itemStates);
    }

    @JsonIgnore
    public Integer getItemStates() {
        Object objValue = this._get(DTOFIELD_ITEMSTATES);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isItemStatesDirty() {
        return this._contains(DTOFIELD_ITEMSTATES);
    }

    @JsonIgnore
    public void resetItemStates() {
        this._reset(DTOFIELD_ITEMSTATES);
    }

    @JsonIgnore
    public PSDEFormDetailDTO itemstates(Integer itemStates) {
        this.setItemStates(itemStates);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO itemstates(PSModelEnums.PanelFieldState[] itemStates) {
        if (itemStates == null || itemStates.length == 0) {
            this.setItemStates(null);
        } else {
            int _value = 0;
            for (PSModelEnums.PanelFieldState _item : itemStates) {
                _value |= _item.value;
            }
            this.setItemStates(_value);
        }
        return this;
    }

    @JsonProperty(value="labelcolspan")
    public void setLabelColSpan(Integer labelColSpan) {
        this._set(DTOFIELD_LABELCOLSPAN, labelColSpan);
    }

    @JsonIgnore
    public Integer getLabelColSpan() {
        Object objValue = this._get(DTOFIELD_LABELCOLSPAN);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLabelColSpanDirty() {
        return this._contains(DTOFIELD_LABELCOLSPAN);
    }

    @JsonIgnore
    public void resetLabelColSpan() {
        this._reset(DTOFIELD_LABELCOLSPAN);
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelcolspan(Integer labelColSpan) {
        this.setLabelColSpan(labelColSpan);
        return this;
    }

    @JsonProperty(value="labelcolspan2")
    public void setLabelColSpan2(Integer labelColSpan2) {
        this._set(DTOFIELD_LABELCOLSPAN2, labelColSpan2);
    }

    @JsonIgnore
    public Integer getLabelColSpan2() {
        Object objValue = this._get(DTOFIELD_LABELCOLSPAN2);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLabelColSpan2Dirty() {
        return this._contains(DTOFIELD_LABELCOLSPAN2);
    }

    @JsonIgnore
    public void resetLabelColSpan2() {
        this._reset(DTOFIELD_LABELCOLSPAN2);
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelcolspan2(Integer labelColSpan2) {
        this.setLabelColSpan2(labelColSpan2);
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
    public PSDEFormDetailDTO labeldynaclass(String labelDynaClass) {
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    @JsonProperty(value="labelpos")
    public void setLabelPos(String labelPos) {
        this._set(DTOFIELD_LABELPOS, labelPos);
    }

    @JsonIgnore
    public String getLabelPos() {
        Object objValue = this._get(DTOFIELD_LABELPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLabelPosDirty() {
        return this._contains(DTOFIELD_LABELPOS);
    }

    @JsonIgnore
    public void resetLabelPos() {
        this._reset(DTOFIELD_LABELPOS);
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelpos(String labelPos) {
        this.setLabelPos(labelPos);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelpos(PSModelEnums.LabelPos labelPos) {
        if (labelPos == null) {
            this.setLabelPos(null);
        } else {
            this.setLabelPos(labelPos.value);
        }
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
    public PSDEFormDetailDTO labelpssyscssid(String labelPSSysCssId) {
        this.setLabelPSSysCssId(labelPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelpssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEFormDetailDTO labelpssyscssname(String labelPSSysCssName) {
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
    public PSDEFormDetailDTO labelrawcssstyle(String labelRawCssStyle) {
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    @JsonProperty(value="labelwidth")
    public void setLabelWidth(Integer labelWidth) {
        this._set(DTOFIELD_LABELWIDTH, labelWidth);
    }

    @JsonIgnore
    public Integer getLabelWidth() {
        Object objValue = this._get(DTOFIELD_LABELWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLabelWidthDirty() {
        return this._contains(DTOFIELD_LABELWIDTH);
    }

    @JsonIgnore
    public void resetLabelWidth() {
        this._reset(DTOFIELD_LABELWIDTH);
    }

    @JsonIgnore
    public PSDEFormDetailDTO labelwidth(Integer labelWidth) {
        this.setLabelWidth(labelWidth);
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
    public PSDEFormDetailDTO layoutmode(String layoutMode) {
        this.setLayoutMode(layoutMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO layoutmode(PSModelEnums.LayoutMode layoutMode) {
        if (layoutMode == null) {
            this.setLayoutMode(null);
        } else {
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    @JsonProperty(value="leveltag")
    public void setLevelTag(String levelTag) {
        this._set(DTOFIELD_LEVELTAG, levelTag);
    }

    @JsonIgnore
    public String getLevelTag() {
        Object objValue = this._get(DTOFIELD_LEVELTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLevelTagDirty() {
        return this._contains(DTOFIELD_LEVELTAG);
    }

    @JsonIgnore
    public void resetLevelTag() {
        this._reset(DTOFIELD_LEVELTAG);
    }

    @JsonIgnore
    public PSDEFormDetailDTO leveltag(String levelTag) {
        this.setLevelTag(levelTag);
        return this;
    }

    @JsonProperty(value="linkpsdeviewid")
    public void setLinkPSDEViewId(String linkPSDEViewId) {
        this._set(DTOFIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }

    @JsonIgnore
    public String getLinkPSDEViewId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public void resetLinkPSDEViewId() {
        this._reset(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO linkpsdeviewid(String linkPSDEViewId) {
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        } else {
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewname")
    public void setLinkPSDEViewName(String linkPSDEViewName) {
        this._set(DTOFIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }

    @JsonIgnore
    public String getLinkPSDEViewName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEViewName() {
        this._reset(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO linkpsdeviewname(String linkPSDEViewName) {
        this.setLinkPSDEViewName(linkPSDEViewName);
        return this;
    }

    @JsonProperty(value="margin")
    public void setMargin(String margin) {
        this._set(DTOFIELD_MARGIN, margin);
    }

    @JsonIgnore
    public String getMargin() {
        Object objValue = this._get(DTOFIELD_MARGIN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMarginDirty() {
        return this._contains(DTOFIELD_MARGIN);
    }

    @JsonIgnore
    public void resetMargin() {
        this._reset(DTOFIELD_MARGIN);
    }

    @JsonIgnore
    public PSDEFormDetailDTO margin(String margin) {
        this.setMargin(margin);
        return this;
    }

    @JsonProperty(value="maskinfo")
    public void setMaskInfo(String maskInfo) {
        this._set(DTOFIELD_MASKINFO, maskInfo);
    }

    @JsonIgnore
    public String getMaskInfo() {
        Object objValue = this._get(DTOFIELD_MASKINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaskInfoDirty() {
        return this._contains(DTOFIELD_MASKINFO);
    }

    @JsonIgnore
    public void resetMaskInfo() {
        this._reset(DTOFIELD_MASKINFO);
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskinfo(String maskInfo) {
        this.setMaskInfo(maskInfo);
        return this;
    }

    @JsonProperty(value="maskmode")
    public void setMaskMode(Integer maskMode) {
        this._set(DTOFIELD_MASKMODE, maskMode);
    }

    @JsonIgnore
    public Integer getMaskMode() {
        Object objValue = this._get(DTOFIELD_MASKMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaskModeDirty() {
        return this._contains(DTOFIELD_MASKMODE);
    }

    @JsonIgnore
    public void resetMaskMode() {
        this._reset(DTOFIELD_MASKMODE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskmode(Integer maskMode) {
        this.setMaskMode(maskMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskmode(PSModelEnums.FormDRUIPartMaskMode maskMode) {
        if (maskMode == null) {
            this.setMaskMode(null);
        } else {
            this.setMaskMode(maskMode.value);
        }
        return this;
    }

    @JsonProperty(value="maskpslanresid")
    public void setMaskPSLanResId(String maskPSLanResId) {
        this._set(DTOFIELD_MASKPSLANRESID, maskPSLanResId);
    }

    @JsonIgnore
    public String getMaskPSLanResId() {
        Object objValue = this._get(DTOFIELD_MASKPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaskPSLanResIdDirty() {
        return this._contains(DTOFIELD_MASKPSLANRESID);
    }

    @JsonIgnore
    public void resetMaskPSLanResId() {
        this._reset(DTOFIELD_MASKPSLANRESID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskpslanresid(String maskPSLanResId) {
        this.setMaskPSLanResId(maskPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setMaskPSLanResId(null);
            this.setMaskPSLanResName(null);
        } else {
            this.setMaskPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMaskPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="maskpslanresname")
    public void setMaskPSLanResName(String maskPSLanResName) {
        this._set(DTOFIELD_MASKPSLANRESNAME, maskPSLanResName);
    }

    @JsonIgnore
    public String getMaskPSLanResName() {
        Object objValue = this._get(DTOFIELD_MASKPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaskPSLanResNameDirty() {
        return this._contains(DTOFIELD_MASKPSLANRESNAME);
    }

    @JsonIgnore
    public void resetMaskPSLanResName() {
        this._reset(DTOFIELD_MASKPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO maskpslanresname(String maskPSLanResName) {
        this.setMaskPSLanResName(maskPSLanResName);
        return this;
    }

    @JsonProperty(value="mdctrltype")
    public void setMDCtrlType(String mDCtrlType) {
        this._set(DTOFIELD_MDCTRLTYPE, mDCtrlType);
    }

    @JsonIgnore
    public String getMDCtrlType() {
        Object objValue = this._get(DTOFIELD_MDCTRLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDCtrlTypeDirty() {
        return this._contains(DTOFIELD_MDCTRLTYPE);
    }

    @JsonIgnore
    public void resetMDCtrlType() {
        this._reset(DTOFIELD_MDCTRLTYPE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdctrltype(String mDCtrlType) {
        this.setMDCtrlType(mDCtrlType);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdctrltype(PSModelEnums.FormDetailMDCtrlType mDCtrlType) {
        if (mDCtrlType == null) {
            this.setMDCtrlType(null);
        } else {
            this.setMDCtrlType(mDCtrlType.value);
        }
        return this;
    }

    @JsonProperty(value="mdpsdedataviewid")
    public void setMDPSDEDataViewId(String mDPSDEDataViewId) {
        this._set(DTOFIELD_MDPSDEDATAVIEWID, mDPSDEDataViewId);
    }

    @JsonIgnore
    public String getMDPSDEDataViewId() {
        Object objValue = this._get(DTOFIELD_MDPSDEDATAVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEDataViewIdDirty() {
        return this._contains(DTOFIELD_MDPSDEDATAVIEWID);
    }

    @JsonIgnore
    public void resetMDPSDEDataViewId() {
        this._reset(DTOFIELD_MDPSDEDATAVIEWID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdedataviewid(String mDPSDEDataViewId) {
        this.setMDPSDEDataViewId(mDPSDEDataViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdedataviewid(PSDEDataViewDTO pSDEDataView) {
        if (pSDEDataView == null) {
            this.setMDPSDEDataViewId(null);
            this.setMDPSDEDataViewName(null);
        } else {
            this.setMDPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setMDPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    @JsonProperty(value="mdpsdedataviewname")
    public void setMDPSDEDataViewName(String mDPSDEDataViewName) {
        this._set(DTOFIELD_MDPSDEDATAVIEWNAME, mDPSDEDataViewName);
    }

    @JsonIgnore
    public String getMDPSDEDataViewName() {
        Object objValue = this._get(DTOFIELD_MDPSDEDATAVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEDataViewNameDirty() {
        return this._contains(DTOFIELD_MDPSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public void resetMDPSDEDataViewName() {
        this._reset(DTOFIELD_MDPSDEDATAVIEWNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdedataviewname(String mDPSDEDataViewName) {
        this.setMDPSDEDataViewName(mDPSDEDataViewName);
        return this;
    }

    @JsonProperty(value="mdpsdeformid")
    public void setMDPSDEFormId(String mDPSDEFormId) {
        this._set(DTOFIELD_MDPSDEFORMID, mDPSDEFormId);
    }

    @JsonIgnore
    public String getMDPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MDPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MDPSDEFORMID);
    }

    @JsonIgnore
    public void resetMDPSDEFormId() {
        this._reset(DTOFIELD_MDPSDEFORMID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdeformid(String mDPSDEFormId) {
        this.setMDPSDEFormId(mDPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMDPSDEFormId(null);
            this.setMDPSDEFormName(null);
        } else {
            this.setMDPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMDPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="mdpsdeformname")
    public void setMDPSDEFormName(String mDPSDEFormName) {
        this._set(DTOFIELD_MDPSDEFORMNAME, mDPSDEFormName);
    }

    @JsonIgnore
    public String getMDPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MDPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MDPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMDPSDEFormName() {
        this._reset(DTOFIELD_MDPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdeformname(String mDPSDEFormName) {
        this.setMDPSDEFormName(mDPSDEFormName);
        return this;
    }

    @JsonProperty(value="mdpsdegridid")
    public void setMDPSDEGridId(String mDPSDEGridId) {
        this._set(DTOFIELD_MDPSDEGRIDID, mDPSDEGridId);
    }

    @JsonIgnore
    public String getMDPSDEGridId() {
        Object objValue = this._get(DTOFIELD_MDPSDEGRIDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEGridIdDirty() {
        return this._contains(DTOFIELD_MDPSDEGRIDID);
    }

    @JsonIgnore
    public void resetMDPSDEGridId() {
        this._reset(DTOFIELD_MDPSDEGRIDID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdegridid(String mDPSDEGridId) {
        this.setMDPSDEGridId(mDPSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdegridid(PSDEGridDTO pSDEGrid) {
        if (pSDEGrid == null) {
            this.setMDPSDEGridId(null);
            this.setMDPSDEGridName(null);
        } else {
            this.setMDPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setMDPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    @JsonProperty(value="mdpsdegridname")
    public void setMDPSDEGridName(String mDPSDEGridName) {
        this._set(DTOFIELD_MDPSDEGRIDNAME, mDPSDEGridName);
    }

    @JsonIgnore
    public String getMDPSDEGridName() {
        Object objValue = this._get(DTOFIELD_MDPSDEGRIDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEGridNameDirty() {
        return this._contains(DTOFIELD_MDPSDEGRIDNAME);
    }

    @JsonIgnore
    public void resetMDPSDEGridName() {
        this._reset(DTOFIELD_MDPSDEGRIDNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdegridname(String mDPSDEGridName) {
        this.setMDPSDEGridName(mDPSDEGridName);
        return this;
    }

    @JsonProperty(value="mdpsdelistid")
    public void setMDPSDEListId(String mDPSDEListId) {
        this._set(DTOFIELD_MDPSDELISTID, mDPSDEListId);
    }

    @JsonIgnore
    public String getMDPSDEListId() {
        Object objValue = this._get(DTOFIELD_MDPSDELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEListIdDirty() {
        return this._contains(DTOFIELD_MDPSDELISTID);
    }

    @JsonIgnore
    public void resetMDPSDEListId() {
        this._reset(DTOFIELD_MDPSDELISTID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdelistid(String mDPSDEListId) {
        this.setMDPSDEListId(mDPSDEListId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdelistid(PSDEListDTO pSDEList) {
        if (pSDEList == null) {
            this.setMDPSDEListId(null);
            this.setMDPSDEListName(null);
        } else {
            this.setMDPSDEListId(pSDEList.getPSDEListId());
            this.setMDPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    @JsonProperty(value="mdpsdelistname")
    public void setMDPSDEListName(String mDPSDEListName) {
        this._set(DTOFIELD_MDPSDELISTNAME, mDPSDEListName);
    }

    @JsonIgnore
    public String getMDPSDEListName() {
        Object objValue = this._get(DTOFIELD_MDPSDELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSDEListNameDirty() {
        return this._contains(DTOFIELD_MDPSDELISTNAME);
    }

    @JsonIgnore
    public void resetMDPSDEListName() {
        this._reset(DTOFIELD_MDPSDELISTNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpsdelistname(String mDPSDEListName) {
        this.setMDPSDEListName(mDPSDEListName);
        return this;
    }

    @JsonProperty(value="mdpssysviewpanelid")
    public void setMDPSSysViewPanelId(String mDPSSysViewPanelId) {
        this._set(DTOFIELD_MDPSSYSVIEWPANELID, mDPSSysViewPanelId);
    }

    @JsonIgnore
    public String getMDPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_MDPSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_MDPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetMDPSSysViewPanelId() {
        this._reset(DTOFIELD_MDPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpssysviewpanelid(String mDPSSysViewPanelId) {
        this.setMDPSSysViewPanelId(mDPSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setMDPSSysViewPanelId(null);
            this.setMDPSSysViewPanelName(null);
        } else {
            this.setMDPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setMDPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="mdpssysviewpanelname")
    public void setMDPSSysViewPanelName(String mDPSSysViewPanelName) {
        this._set(DTOFIELD_MDPSSYSVIEWPANELNAME, mDPSSysViewPanelName);
    }

    @JsonIgnore
    public String getMDPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_MDPSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMDPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_MDPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetMDPSSysViewPanelName() {
        this._reset(DTOFIELD_MDPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO mdpssysviewpanelname(String mDPSSysViewPanelName) {
        this.setMDPSSysViewPanelName(mDPSSysViewPanelName);
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
    public PSDEFormDetailDTO memo(String memo) {
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
    public PSDEFormDetailDTO mobflag(Integer mobFlag) {
        this.setMobFlag(mobFlag);
        return this;
    }

    @JsonProperty(value="modelstate")
    public void setModelState(Integer modelState) {
        this._set(DTOFIELD_MODELSTATE, modelState);
    }

    @JsonIgnore
    public Integer getModelState() {
        Object objValue = this._get(DTOFIELD_MODELSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelStateDirty() {
        return this._contains(DTOFIELD_MODELSTATE);
    }

    @JsonIgnore
    public void resetModelState() {
        this._reset(DTOFIELD_MODELSTATE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO modelstate(Integer modelState) {
        this.setModelState(modelState);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO modelstate(PSModelEnums.DEFormDetailState[] modelState) {
        if (modelState == null || modelState.length == 0) {
            this.setModelState(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DEFormDetailState _item : modelState) {
                _value |= _item.value;
            }
            this.setModelState(_value);
        }
        return this;
    }

    @JsonProperty(value="needcodelistconfig")
    public void setNeedCodeListConfig(Integer needCodeListConfig) {
        this._set(DTOFIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }

    @JsonIgnore
    public Integer getNeedCodeListConfig() {
        Object objValue = this._get(DTOFIELD_NEEDCODELISTCONFIG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNeedCodeListConfigDirty() {
        return this._contains(DTOFIELD_NEEDCODELISTCONFIG);
    }

    @JsonIgnore
    public void resetNeedCodeListConfig() {
        this._reset(DTOFIELD_NEEDCODELISTCONFIG);
    }

    @JsonIgnore
    public PSDEFormDetailDTO needcodelistconfig(Integer needCodeListConfig) {
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO needcodelistconfig(Boolean needCodeListConfig) {
        if (needCodeListConfig == null) {
            this.setNeedCodeListConfig(null);
        } else {
            this.setNeedCodeListConfig(needCodeListConfig != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="noprivdm")
    public void setNoPrivDM(Integer noPrivDM) {
        this._set(DTOFIELD_NOPRIVDM, noPrivDM);
    }

    @JsonIgnore
    public Integer getNoPrivDM() {
        Object objValue = this._get(DTOFIELD_NOPRIVDM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoPrivDMDirty() {
        return this._contains(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public void resetNoPrivDM() {
        this._reset(DTOFIELD_NOPRIVDM);
    }

    @JsonIgnore
    public PSDEFormDetailDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO noprivdm(PSModelEnums.NoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
        }
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
    public PSDEFormDetailDTO openpsdeviewid(String openPSDEViewId) {
        this.setOpenPSDEViewId(openPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO openpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEFormDetailDTO openpsdeviewname(String openPSDEViewName) {
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
    public PSDEFormDetailDTO openpssyspdtviewid(String openPSSysPDTViewId) {
        this.setOpenPSSysPDTViewId(openPSSysPDTViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO openpssyspdtviewid(PSSysPDTViewDTO pSSysPDTView) {
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
    public PSDEFormDetailDTO openpssyspdtviewname(String openPSSysPDTViewName) {
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
    public PSDEFormDetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="padding")
    public void setPadding(String padding) {
        this._set(DTOFIELD_PADDING, padding);
    }

    @JsonIgnore
    public String getPadding() {
        Object objValue = this._get(DTOFIELD_PADDING);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPaddingDirty() {
        return this._contains(DTOFIELD_PADDING);
    }

    @JsonIgnore
    public void resetPadding() {
        this._reset(DTOFIELD_PADDING);
    }

    @JsonIgnore
    public PSDEFormDetailDTO padding(String padding) {
        this.setPadding(padding);
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
    public PSDEFormDetailDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFormDetailDTO phpslanresname(String pHPSLanResName) {
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    @JsonProperty(value="pickuppsdeviewid")
    public void setPickupPSDEViewId(String pickupPSDEViewId) {
        this._set(DTOFIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }

    @JsonIgnore
    public String getPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetPickupPSDEViewId() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pickuppsdeviewid(String pickupPSDEViewId) {
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        } else {
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="pickuppsdeviewname")
    public void setPickupPSDEViewName(String pickupPSDEViewName) {
        this._set(DTOFIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }

    @JsonIgnore
    public String getPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetPickupPSDEViewName() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pickuppsdeviewname(String pickupPSDEViewName) {
        this.setPickupPSDEViewName(pickupPSDEViewName);
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
    public PSDEFormDetailDTO placeholder(String placeHolder) {
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
    public PSDEFormDetailDTO playoutmode(String pLayoutMode) {
        this.setPLayoutMode(pLayoutMode);
        return this;
    }

    @JsonProperty(value="ppsdeformdetailid")
    public void setPPSDEFormDetailId(String pPSDEFormDetailId) {
        this._set(DTOFIELD_PPSDEFORMDETAILID, pPSDEFormDetailId);
    }

    @JsonIgnore
    public String getPPSDEFormDetailId() {
        Object objValue = this._get(DTOFIELD_PPSDEFORMDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFormDetailIdDirty() {
        return this._contains(DTOFIELD_PPSDEFORMDETAILID);
    }

    @JsonIgnore
    public void resetPPSDEFormDetailId() {
        this._reset(DTOFIELD_PPSDEFORMDETAILID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO ppsdeformdetailid(String pPSDEFormDetailId) {
        this.setPPSDEFormDetailId(pPSDEFormDetailId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO ppsdeformdetailid(PSDEFormDetailDTO pSDEFormDetail) {
        if (pSDEFormDetail == null) {
            this.setPLayoutMode(null);
            this.setPPSDEFormDetailId(null);
            this.setPPSDEFormDetailName(null);
        } else {
            this.setPLayoutMode(pSDEFormDetail.getLayoutMode());
            this.setPPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    @JsonProperty(value="ppsdeformdetailname")
    public void setPPSDEFormDetailName(String pPSDEFormDetailName) {
        this._set(DTOFIELD_PPSDEFORMDETAILNAME, pPSDEFormDetailName);
    }

    @JsonIgnore
    public String getPPSDEFormDetailName() {
        Object objValue = this._get(DTOFIELD_PPSDEFORMDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFormDetailNameDirty() {
        return this._contains(DTOFIELD_PPSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public void resetPPSDEFormDetailName() {
        this._reset(DTOFIELD_PPSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO ppsdeformdetailname(String pPSDEFormDetailName) {
        this.setPPSDEFormDetailName(pPSDEFormDetailName);
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
    public PSDEFormDetailDTO predefinedtype(String predefinedType) {
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
    public PSDEFormDetailDTO predefinedtypetext(String predefinedTypeText) {
        this.setPredefinedTypeText(predefinedTypeText);
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
    public PSDEFormDetailDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEFormDetailDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSDEFormDetailDTO psdedrid(String pSDEDRId) {
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdedrid(PSDEDataRelationDTO pSDEDataRelation) {
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
    public PSDEFormDetailDTO psdedritemid(String pSDEDRItemId) {
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdedritemid(PSDEDRItemDTO pSDEDRItem) {
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
    public PSDEFormDetailDTO psdedritemname(String pSDEDRItemName) {
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
    public PSDEFormDetailDTO psdedrname(String pSDEDRName) {
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    @JsonProperty(value="psdefuimodeid")
    public void setPSDEFUIModeId(String pSDEFUIModeId) {
        this._set(DTOFIELD_PSDEFUIMODEID, pSDEFUIModeId);
        this._set(FIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }

    @JsonIgnore
    public String getPSDEFUIModeId() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODEID);
        if (objValue == null && (objValue = this._get(FIELD_PSDEFUIMODEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty() {
        if (this._contains(DTOFIELD_PSDEFUIMODEID)) {
            return true;
        }
        return this._contains(FIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public void resetPSDEFUIModeId() {
        this._reset(DTOFIELD_PSDEFUIMODEID);
        this._reset(FIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefuimodeid(String pSDEFUIModeId) {
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefuimodeid(PSDEFUIModeDTO pSDEFUIMode) {
        if (pSDEFUIMode == null) {
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        } else {
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    @JsonProperty(value="psdefuimodename")
    public void setPSDEFUIModeName(String pSDEFUIModeName) {
        this._set(DTOFIELD_PSDEFUIMODENAME, pSDEFUIModeName);
        this._set(FIELD_PSDEFUIMODENAME, pSDEFUIModeName);
    }

    @JsonIgnore
    public String getPSDEFUIModeName() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSDEFUIMODENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty() {
        if (this._contains(DTOFIELD_PSDEFUIMODENAME)) {
            return true;
        }
        return this._contains(FIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public void resetPSDEFUIModeName() {
        this._reset(DTOFIELD_PSDEFUIMODENAME);
        this._reset(FIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefuimodename(String pSDEFUIModeName) {
        this.setPSDEFUIModeName(pSDEFUIModeName);
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
    public PSDEFormDetailDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefiupdateid")
    public void setPSDEFIUpdateId(String pSDEFIUpdateId) {
        this._set(DTOFIELD_PSDEFIUPDATEID, pSDEFIUpdateId);
    }

    @JsonIgnore
    public String getPSDEFIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDEFIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDEFIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDEFIUpdateId() {
        this._reset(DTOFIELD_PSDEFIUPDATEID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefiupdateid(String pSDEFIUpdateId) {
        this.setPSDEFIUpdateId(pSDEFIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefiupdateid(PSDEFIUpdateDTO pSDEFIUpdate) {
        if (pSDEFIUpdate == null) {
            this.setPSDEFIUpdateId(null);
            this.setPSDEFIUpdateName(null);
        } else {
            this.setPSDEFIUpdateId(pSDEFIUpdate.getPSDEFIUpdateId());
            this.setPSDEFIUpdateName(pSDEFIUpdate.getPSDEFIUpdateName());
        }
        return this;
    }

    @JsonProperty(value="psdefiupdatename")
    public void setPSDEFIUpdateName(String pSDEFIUpdateName) {
        this._set(DTOFIELD_PSDEFIUPDATENAME, pSDEFIUpdateName);
    }

    @JsonIgnore
    public String getPSDEFIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDEFIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDEFIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDEFIUpdateName() {
        this._reset(DTOFIELD_PSDEFIUPDATENAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefiupdatename(String pSDEFIUpdateName) {
        this.setPSDEFIUpdateName(pSDEFIUpdateName);
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
    public PSDEFormDetailDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdeformdetailid")
    public void setPSDEFormDetailId(String pSDEFormDetailId) {
        this._set(DTOFIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }

    @JsonIgnore
    public String getPSDEFormDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public void resetPSDEFormDetailId() {
        this._reset(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformdetailid(String pSDEFormDetailId) {
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    @JsonProperty(value="psdeformdetailname")
    public void setPSDEFormDetailName(String pSDEFormDetailName) {
        this._set(DTOFIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }

    @JsonIgnore
    public String getPSDEFormDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEFormDetailName() {
        this._reset(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformdetailname(String pSDEFormDetailName) {
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFormDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFormDetailName(strName);
    }

    @JsonIgnore
    public PSDEFormDetailDTO name(String strName) {
        this.setPSDEFormDetailName(strName);
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
    public PSDEFormDetailDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setFormType(null);
            this.setMobFlag(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
            this.setPSDEId(null);
        } else {
            this.setFormType(pSDEForm.getFormType());
            this.setMobFlag(pSDEForm.getMobFlag());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
            this.setPSDEId(pSDEForm.getPSDEId());
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
    public PSDEFormDetailDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    @JsonProperty(value="psdeformrfid")
    public void setPSDEFormRFId(String pSDEFormRFId) {
        this._set(DTOFIELD_PSDEFORMRFID, pSDEFormRFId);
    }

    @JsonIgnore
    public String getPSDEFormRFId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMRFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormRFIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMRFID);
    }

    @JsonIgnore
    public void resetPSDEFormRFId() {
        this._reset(DTOFIELD_PSDEFORMRFID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformrfid(String pSDEFormRFId) {
        this.setPSDEFormRFId(pSDEFormRFId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformrfid(PSDEFormRFDTO pSDEFormRF) {
        if (pSDEFormRF == null) {
            this.setPSDEFormRFId(null);
            this.setPSDEFormRFName(null);
            this.setRefPSDEFormId(null);
        } else {
            this.setPSDEFormRFId(pSDEFormRF.getPSDEFormRFId());
            this.setPSDEFormRFName(pSDEFormRF.getPSDEFormRFName());
            this.setRefPSDEFormId(pSDEFormRF.getMinorPSDEFormId());
        }
        return this;
    }

    @JsonProperty(value="psdeformrfname")
    public void setPSDEFormRFName(String pSDEFormRFName) {
        this._set(DTOFIELD_PSDEFORMRFNAME, pSDEFormRFName);
    }

    @JsonIgnore
    public String getPSDEFormRFName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMRFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormRFNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMRFNAME);
    }

    @JsonIgnore
    public void resetPSDEFormRFName() {
        this._reset(DTOFIELD_PSDEFORMRFNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeformrfname(String pSDEFormRFName) {
        this.setPSDEFormRFName(pSDEFormRFName);
        return this;
    }

    @JsonProperty(value="psdefsfitemid")
    public void setPSDEFSFItemId(String pSDEFSFItemId) {
        this._set(DTOFIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }

    @JsonIgnore
    public String getPSDEFSFItemId() {
        Object objValue = this._get(DTOFIELD_PSDEFSFITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty() {
        return this._contains(DTOFIELD_PSDEFSFITEMID);
    }

    @JsonIgnore
    public void resetPSDEFSFItemId() {
        this._reset(DTOFIELD_PSDEFSFITEMID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefsfitemid(String pSDEFSFItemId) {
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefsfitemid(PSDEFSFItemDTO pSDEFSFItem) {
        if (pSDEFSFItem == null) {
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        } else {
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    @JsonProperty(value="psdefsfitemname")
    public void setPSDEFSFItemName(String pSDEFSFItemName) {
        this._set(DTOFIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }

    @JsonIgnore
    public String getPSDEFSFItemName() {
        Object objValue = this._get(DTOFIELD_PSDEFSFITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty() {
        return this._contains(DTOFIELD_PSDEFSFITEMNAME);
    }

    @JsonIgnore
    public void resetPSDEFSFItemName() {
        this._reset(DTOFIELD_PSDEFSFITEMNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdefsfitemname(String pSDEFSFItemName) {
        this.setPSDEFSFItemName(pSDEFSFItemName);
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
    public PSDEFormDetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEFormDetailDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEFormDetailDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSDEFormDetailDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDEFormDetailDTO psdeuagroupname(String pSDEUAGroupName) {
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
    public PSDEFormDetailDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSDEFormDetailDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pssyscounterid")
    public void setPSSysCounterId(String pSSysCounterId) {
        this._set(DTOFIELD_PSSYSCOUNTERID, pSSysCounterId);
    }

    @JsonIgnore
    public String getPSSysCounterId() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterIdDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public void resetPSSysCounterId() {
        this._reset(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
        if (pSSysCounter == null) {
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        } else {
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    @JsonProperty(value="pssyscountername")
    public void setPSSysCounterName(String pSSysCounterName) {
        this._set(DTOFIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }

    @JsonIgnore
    public String getPSSysCounterName() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterNameDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public void resetPSSysCounterName() {
        this._reset(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
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
    public PSDEFormDetailDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDEFormDetailDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonProperty(value="pssysdictcatid")
    public void setPSSysDictCatId(String pSSysDictCatId) {
        this._set(DTOFIELD_PSSYSDICTCATID, pSSysDictCatId);
    }

    @JsonIgnore
    public String getPSSysDictCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSDICTCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDictCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSDICTCATID);
    }

    @JsonIgnore
    public void resetPSSysDictCatId() {
        this._reset(DTOFIELD_PSSYSDICTCATID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysdictcatid(String pSSysDictCatId) {
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysdictcatid(PSSysDictCatDTO pSSysDictCat) {
        if (pSSysDictCat == null) {
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        } else {
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    @JsonProperty(value="pssysdictcatname")
    public void setPSSysDictCatName(String pSSysDictCatName) {
        this._set(DTOFIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }

    @JsonIgnore
    public String getPSSysDictCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSDICTCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDictCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSDICTCATNAME);
    }

    @JsonIgnore
    public void resetPSSysDictCatName() {
        this._reset(DTOFIELD_PSSYSDICTCATNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysdictcatname(String pSSysDictCatName) {
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDEFormDetailDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDEFormDetailDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDEFormDetailDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
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
    public PSDEFormDetailDTO pssyseditorstylename(String pSSysEditorStyleName) {
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
    public PSDEFormDetailDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEFormDetailDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDEFormDetailDTO pssysresourceid(String pSSysResourceId) {
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO pssysresourceid(PSSysResourceDTO pSSysResource) {
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
    public PSDEFormDetailDTO pssysresourcename(String pSSysResourceName) {
        this.setPSSysResourceName(pSSysResourceName);
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
    public PSDEFormDetailDTO rawcontent(String rawContent) {
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
    public PSDEFormDetailDTO rawcssstyle(String rawCssStyle) {
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
    public PSDEFormDetailDTO rawservicemethod(String rawServiceMethod) {
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO rawservicemethod(PSModelEnums.RequestMethod rawServiceMethod) {
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
    public PSDEFormDetailDTO rawserviceurl(String rawServiceUrl) {
        this.setRawServiceUrl(rawServiceUrl);
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
    public PSDEFormDetailDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
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
    public PSDEFormDetailDTO refpsdeacmodename(String refPSDEACModeName) {
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
    public PSDEFormDetailDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEFormDetailDTO refpsdedatasetname(String refPSDEDataSetName) {
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    @JsonProperty(value="refpsdeformdetailid")
    public void setRefPSDEFormDetailId(String refPSDEFormDetailId) {
        this._set(DTOFIELD_REFPSDEFORMDETAILID, refPSDEFormDetailId);
    }

    @JsonIgnore
    public String getRefPSDEFormDetailId() {
        Object objValue = this._get(DTOFIELD_REFPSDEFORMDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEFormDetailIdDirty() {
        return this._contains(DTOFIELD_REFPSDEFORMDETAILID);
    }

    @JsonIgnore
    public void resetRefPSDEFormDetailId() {
        this._reset(DTOFIELD_REFPSDEFORMDETAILID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeformdetailid(String refPSDEFormDetailId) {
        this.setRefPSDEFormDetailId(refPSDEFormDetailId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeformdetailid(PSDEFormDetailDTO pSDEFormDetail) {
        if (pSDEFormDetail == null) {
            this.setRefPSDEFormDetailId(null);
            this.setRefPSDEFormDetailName(null);
        } else {
            this.setRefPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setRefPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    @JsonProperty(value="refpsdeformdetailname")
    public void setRefPSDEFormDetailName(String refPSDEFormDetailName) {
        this._set(DTOFIELD_REFPSDEFORMDETAILNAME, refPSDEFormDetailName);
    }

    @JsonIgnore
    public String getRefPSDEFormDetailName() {
        Object objValue = this._get(DTOFIELD_REFPSDEFORMDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEFormDetailNameDirty() {
        return this._contains(DTOFIELD_REFPSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public void resetRefPSDEFormDetailName() {
        this._reset(DTOFIELD_REFPSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeformdetailname(String refPSDEFormDetailName) {
        this.setRefPSDEFormDetailName(refPSDEFormDetailName);
        return this;
    }

    @JsonProperty(value="refpsdeformid")
    public void setRefPSDEFormId(String refPSDEFormId) {
        this._set(DTOFIELD_REFPSDEFORMID, refPSDEFormId);
    }

    @JsonIgnore
    public String getRefPSDEFormId() {
        Object objValue = this._get(DTOFIELD_REFPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDEFormIdDirty() {
        return this._contains(DTOFIELD_REFPSDEFORMID);
    }

    @JsonIgnore
    public void resetRefPSDEFormId() {
        this._reset(DTOFIELD_REFPSDEFORMID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeformid(String refPSDEFormId) {
        this.setRefPSDEFormId(refPSDEFormId);
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
    public PSDEFormDetailDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFormDetailDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    @JsonProperty(value="refpsderid")
    public void setRefPSDERId(String refPSDERId) {
        this._set(DTOFIELD_REFPSDERID, refPSDERId);
    }

    @JsonIgnore
    public String getRefPSDERId() {
        Object objValue = this._get(DTOFIELD_REFPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDERIdDirty() {
        return this._contains(DTOFIELD_REFPSDERID);
    }

    @JsonIgnore
    public void resetRefPSDERId() {
        this._reset(DTOFIELD_REFPSDERID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsderid(String refPSDERId) {
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        } else {
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="refpsdername")
    public void setRefPSDERName(String refPSDERName) {
        this._set(DTOFIELD_REFPSDERNAME, refPSDERName);
    }

    @JsonIgnore
    public String getRefPSDERName() {
        Object objValue = this._get(DTOFIELD_REFPSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefPSDERNameDirty() {
        return this._contains(DTOFIELD_REFPSDERNAME);
    }

    @JsonIgnore
    public void resetRefPSDERName() {
        this._reset(DTOFIELD_REFPSDERNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO refpsdername(String refPSDERName) {
        this.setRefPSDERName(refPSDERName);
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
    public PSDEFormDetailDTO rendermode(String renderMode) {
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
    public PSDEFormDetailDTO rendermodetext(String renderModeText) {
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
    public PSDEFormDetailDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
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
    public PSDEFormDetailDTO rowspan(Integer rowSpan) {
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
    public PSDEFormDetailDTO showcaption(Integer showCaption) {
        this.setShowCaption(showCaption);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO showcaption(Boolean showCaption) {
        if (showCaption == null) {
            this.setShowCaption(null);
        } else {
            this.setShowCaption(showCaption != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="showmoremode")
    public void setShowMoreMode(Integer showMoreMode) {
        this._set(DTOFIELD_SHOWMOREMODE, showMoreMode);
    }

    @JsonIgnore
    public Integer getShowMoreMode() {
        Object objValue = this._get(DTOFIELD_SHOWMOREMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowMoreModeDirty() {
        return this._contains(DTOFIELD_SHOWMOREMODE);
    }

    @JsonIgnore
    public void resetShowMoreMode() {
        this._reset(DTOFIELD_SHOWMOREMODE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO showmoremode(Integer showMoreMode) {
        this.setShowMoreMode(showMoreMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO showmoremode(PSModelEnums.FormDetailShowMoreMode showMoreMode) {
        if (showMoreMode == null) {
            this.setShowMoreMode(null);
        } else {
            this.setShowMoreMode(showMoreMode.value);
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
    public PSDEFormDetailDTO spacingbottom(String spacingBottom) {
        this.setSpacingBottom(spacingBottom);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO spacingbottom(PSModelEnums.SpacingMode spacingBottom) {
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
    public PSDEFormDetailDTO spacingleft(String spacingLeft) {
        this.setSpacingLeft(spacingLeft);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO spacingleft(PSModelEnums.SpacingMode spacingLeft) {
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
    public PSDEFormDetailDTO spacingright(String spacingRight) {
        this.setSpacingRight(spacingRight);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO spacingright(PSModelEnums.SpacingMode spacingRight) {
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
    public PSDEFormDetailDTO spacingtop(String spacingTop) {
        this.setSpacingTop(spacingTop);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO spacingtop(PSModelEnums.SpacingMode spacingTop) {
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
    public PSDEFormDetailDTO swapmode(String swapMode) {
        this.setSwapMode(swapMode);
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
    public PSDEFormDetailDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO templatemode(Boolean templateMode) {
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
    public PSDEFormDetailDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFormDetailDTO tippslanresname(String tipPSLanResName) {
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
    public PSDEFormDetailDTO titlebarclosemode(Integer titleBarCloseMode) {
        this.setTitleBarCloseMode(titleBarCloseMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO titlebarclosemode(PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode) {
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
    public PSDEFormDetailDTO togglemode(String toggleMode) {
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
    public PSDEFormDetailDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    @JsonProperty(value="ucpssyspfpluginid")
    public void setUCPSSysPFPluginId(String uCPSSysPFPluginId) {
        this._set(DTOFIELD_UCPSSYSPFPLUGINID, uCPSSysPFPluginId);
    }

    @JsonIgnore
    public String getUCPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_UCPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUCPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_UCPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetUCPSSysPFPluginId() {
        this._reset(DTOFIELD_UCPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEFormDetailDTO ucpssyspfpluginid(String uCPSSysPFPluginId) {
        this.setUCPSSysPFPluginId(uCPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO ucpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setUCPSSysPFPluginId(null);
            this.setUCPSSysPFPluginName(null);
        } else {
            this.setUCPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setUCPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="ucpssyspfpluginname")
    public void setUCPSSysPFPluginName(String uCPSSysPFPluginName) {
        this._set(DTOFIELD_UCPSSYSPFPLUGINNAME, uCPSSysPFPluginName);
    }

    @JsonIgnore
    public String getUCPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_UCPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUCPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_UCPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetUCPSSysPFPluginName() {
        this._reset(DTOFIELD_UCPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEFormDetailDTO ucpssyspfpluginname(String uCPSSysPFPluginName) {
        this.setUCPSSysPFPluginName(uCPSSysPFPluginName);
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
    public PSDEFormDetailDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @JsonProperty(value="updatedv")
    public void setUpdateDV(String updateDV) {
        this._set(DTOFIELD_UPDATEDV, updateDV);
    }

    @JsonIgnore
    public String getUpdateDV() {
        Object objValue = this._get(DTOFIELD_UPDATEDV);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVDirty() {
        return this._contains(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public void resetUpdateDV() {
        this._reset(DTOFIELD_UPDATEDV);
    }

    @JsonIgnore
    public PSDEFormDetailDTO updatedv(String updateDV) {
        this.setUpdateDV(updateDV);
        return this;
    }

    @JsonProperty(value="updatedvt")
    public void setUpdateDVT(String updateDVT) {
        this._set(DTOFIELD_UPDATEDVT, updateDVT);
    }

    @JsonIgnore
    public String getUpdateDVT() {
        Object objValue = this._get(DTOFIELD_UPDATEDVT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDVTDirty() {
        return this._contains(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public void resetUpdateDVT() {
        this._reset(DTOFIELD_UPDATEDVT);
    }

    @JsonIgnore
    public PSDEFormDetailDTO updatedvt(String updateDVT) {
        this.setUpdateDVT(updateDVT);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO updatedvt(PSModelEnums.UpdateDefaultValueType updateDVT) {
        if (updateDVT == null) {
            this.setUpdateDVT(null);
        } else {
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEFormDetailDTO updateman(String updateMan) {
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
    public PSDEFormDetailDTO usertag(String userTag) {
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
    public PSDEFormDetailDTO usertag2(String userTag2) {
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
    public PSDEFormDetailDTO valign(String vAlign) {
        this.setVAlign(vAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO valign(PSModelEnums.TextVAlign vAlign) {
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
    public PSDEFormDetailDTO valignself(String vAlignSelf) {
        this.setVAlignSelf(vAlignSelf);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO valignself(PSModelEnums.TextVAlign vAlignSelf) {
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
    public PSDEFormDetailDTO valueformat(String valueFormat) {
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
    public PSDEFormDetailDTO valueitemname(String valueItemName) {
        this.setValueItemName(valueItemName);
        return this;
    }

    @JsonProperty(value="wbdefmode")
    public void setWBDEFMode(Integer wBDEFMode) {
        this._set(DTOFIELD_WBDEFMODE, wBDEFMode);
    }

    @JsonIgnore
    public Integer getWBDEFMode() {
        Object objValue = this._get(DTOFIELD_WBDEFMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWBDEFModeDirty() {
        return this._contains(DTOFIELD_WBDEFMODE);
    }

    @JsonIgnore
    public void resetWBDEFMode() {
        this._reset(DTOFIELD_WBDEFMODE);
    }

    @JsonIgnore
    public PSDEFormDetailDTO wbdefmode(Integer wBDEFMode) {
        this.setWBDEFMode(wBDEFMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO wbdefmode(PSModelEnums.EditItemWriteBackMode wBDEFMode) {
        if (wBDEFMode == null) {
            this.setWBDEFMode(null);
        } else {
            this.setWBDEFMode(wBDEFMode.value);
        }
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
    public PSDEFormDetailDTO width(Integer width) {
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
    public PSDEFormDetailDTO widthmode(String widthMode) {
        this.setWidthMode(widthMode);
        return this;
    }

    @JsonIgnore
    public PSDEFormDetailDTO widthmode(PSModelEnums.WidthMode widthMode) {
        if (widthMode == null) {
            this.setWidthMode(null);
        } else {
            this.setWidthMode(widthMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFormDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFormDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFormDetailDTO id(String strValue) {
        this.setPSDEFormDetailId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEFormDetailDTO> getPSDEFormDetails() {
        Object list = this._get(DTOFIELD_PSDEFORMDETAILS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeformdetails")
    public void setPSDEFormDetails(List<PSDEFormDetailDTO> psdeformdetails) {
        this._set(DTOFIELD_PSDEFORMDETAILS, psdeformdetails);
    }

    @JsonIgnore
    public List<PSDEFormDetailDTO> getPSDEFormDetailsIf() {
        Object list = this._get(DTOFIELD_PSDEFORMDETAILS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFORMDETAILS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEFDLogicDTO> getPSDEFDLogics() {
        Object list = this._get(DTOFIELD_PSDEFDLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefdlogics")
    public void setPSDEFDLogics(List<PSDEFDLogicDTO> psdefdlogics) {
        this._set(DTOFIELD_PSDEFDLOGICS, psdefdlogics);
    }

    @JsonIgnore
    public List<PSDEFDLogicDTO> getPSDEFDLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEFDLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFDLOGICS, list);
        }
        return (List) list;
    }
}
