package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeNodeDTO
extends PSModelDTOBase {
    public static final String FIELD_APPENDCAPFLAG = "APPENDCAPFLAG";
    protected static final String DTOFIELD_APPENDCAPFLAG = "appendcapflag";
    public static final String FIELD_APPENDPNODEID = "APPENDPNODEID";
    protected static final String DTOFIELD_APPENDPNODEID = "appendpnodeid";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CHECKED = "CHECKED";
    protected static final String DTOFIELD_CHECKED = "checked";
    public static final String FIELD_CHILDCNTPSDEFID = "CHILDCNTPSDEFID";
    protected static final String DTOFIELD_CHILDCNTPSDEFID = "childcntpsdefid";
    public static final String FIELD_CHILDCNTPSDEFNAME = "CHILDCNTPSDEFNAME";
    protected static final String DTOFIELD_CHILDCNTPSDEFNAME = "childcntpsdefname";
    public static final String FIELD_CLSPSDEFID = "CLSPSDEFID";
    protected static final String DTOFIELD_CLSPSDEFID = "clspsdefid";
    public static final String FIELD_CLSPSDEFNAME = "CLSPSDEFNAME";
    protected static final String DTOFIELD_CLSPSDEFNAME = "clspsdefname";
    public static final String FIELD_COUNTERID = "COUNTERID";
    protected static final String DTOFIELD_COUNTERID = "counterid";
    public static final String FIELD_COUNTERMODE = "COUNTERMODE";
    protected static final String DTOFIELD_COUNTERMODE = "countermode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_DATA2PSDEFID = "DATA2PSDEFID";
    protected static final String DTOFIELD_DATA2PSDEFID = "data2psdefid";
    public static final String FIELD_DATA2PSDEFNAME = "DATA2PSDEFNAME";
    protected static final String DTOFIELD_DATA2PSDEFNAME = "data2psdefname";
    public static final String FIELD_DATAPSDEFID = "DATAPSDEFID";
    protected static final String DTOFIELD_DATAPSDEFID = "datapsdefid";
    public static final String FIELD_DATAPSDEFNAME = "DATAPSDEFNAME";
    protected static final String DTOFIELD_DATAPSDEFNAME = "datapsdefname";
    public static final String FIELD_DATASOURCE = "DATASOURCE";
    protected static final String DTOFIELD_DATASOURCE = "datasource";
    public static final String FIELD_DATATYPEPSDEFID = "DATATYPEPSDEFID";
    protected static final String DTOFIELD_DATATYPEPSDEFID = "datatypepsdefid";
    public static final String FIELD_DATATYPEPSDEFNAME = "DATATYPEPSDEFNAME";
    protected static final String DTOFIELD_DATATYPEPSDEFNAME = "datatypepsdefname";
    public static final String FIELD_DISABLESELECT = "DISABLESELECT";
    protected static final String DTOFIELD_DISABLESELECT = "disableselect";
    public static final String FIELD_DISTINCTMODE = "DISTINCTMODE";
    protected static final String DTOFIELD_DISTINCTMODE = "distinctmode";
    public static final String FIELD_DYNACLASS = "DYNACLASS";
    protected static final String DTOFIELD_DYNACLASS = "dynaclass";
    public static final String FIELD_EDITDATAMODE = "EDITDATAMODE";
    protected static final String DTOFIELD_EDITDATAMODE = "editdatamode";
    public static final String FIELD_EDITMODE = "EDITMODE";
    protected static final String DTOFIELD_EDITMODE = "editmode";
    public static final String FIELD_ENABLECHECK = "ENABLECHECK";
    protected static final String DTOFIELD_ENABLECHECK = "enablecheck";
    public static final String FIELD_ENABLEPAGING = "ENABLEPAGING";
    protected static final String DTOFIELD_ENABLEPAGING = "enablepaging";
    public static final String FIELD_ENABLEQUICKSEARCH = "ENABLEQUICKSEARCH";
    protected static final String DTOFIELD_ENABLEQUICKSEARCH = "enablequicksearch";
    public static final String FIELD_ENABLEVIEWACTIONS = "ENABLEVIEWACTIONS";
    protected static final String DTOFIELD_ENABLEVIEWACTIONS = "enableviewactions";
    public static final String FIELD_EXPAND = "EXPAND";
    protected static final String DTOFIELD_EXPAND = "expand";
    public static final String FIELD_FIELDNAME = "FIELDNAME";
    protected static final String DTOFIELD_FIELDNAME = "fieldname";
    public static final String FIELD_FILTERPSDEDSID = "FILTERPSDEDSID";
    protected static final String DTOFIELD_FILTERPSDEDSID = "filterpsdedsid";
    public static final String FIELD_FILTERPSDEDSNAME = "FILTERPSDEDSNAME";
    protected static final String DTOFIELD_FILTERPSDEDSNAME = "filterpsdedsname";
    public static final String FIELD_ICONPSDEFID = "ICONPSDEFID";
    protected static final String DTOFIELD_ICONPSDEFID = "iconpsdefid";
    public static final String FIELD_ICONPSDEFNAME = "ICONPSDEFNAME";
    protected static final String DTOFIELD_ICONPSDEFNAME = "iconpsdefname";
    public static final String FIELD_KEYPSDEFID = "KEYPSDEFID";
    protected static final String DTOFIELD_KEYPSDEFID = "keypsdefid";
    public static final String FIELD_KEYPSDEFNAME = "KEYPSDEFNAME";
    protected static final String DTOFIELD_KEYPSDEFNAME = "keypsdefname";
    public static final String FIELD_LEAFFLAGPSDEFID = "LEAFFLAGPSDEFID";
    protected static final String DTOFIELD_LEAFFLAGPSDEFID = "leafflagpsdefid";
    public static final String FIELD_LEAFFLAGPSDEFNAME = "LEAFFLAGPSDEFNAME";
    protected static final String DTOFIELD_LEAFFLAGPSDEFNAME = "leafflagpsdefname";
    public static final String FIELD_LINKPSDEFID = "LINKPSDEFID";
    protected static final String DTOFIELD_LINKPSDEFID = "linkpsdefid";
    public static final String FIELD_LINKPSDEFNAME = "LINKPSDEFNAME";
    protected static final String DTOFIELD_LINKPSDEFNAME = "linkpsdefname";
    public static final String FIELD_MAXSIZE = "MAXSIZE";
    protected static final String DTOFIELD_MAXSIZE = "maxsize";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELOBJ = "MODELOBJ";
    protected static final String DTOFIELD_MODELOBJ = "modelobj";
    public static final String FIELD_MOVEPSDEACTIONID = "MOVEPSDEACTIONID";
    protected static final String DTOFIELD_MOVEPSDEACTIONID = "movepsdeactionid";
    public static final String FIELD_MOVEPSDEACTIONNAME = "MOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";
    public static final String FIELD_MOVEPSDEOPPRIVID = "MOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_MOVEPSDEOPPRIVID = "movepsdeopprivid";
    public static final String FIELD_MOVEPSDEOPPRIVNAME = "MOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_MOVEPSDEOPPRIVNAME = "movepsdeopprivname";
    public static final String FIELD_NAMEPSLANRESID = "NAMEPSLANRESID";
    protected static final String DTOFIELD_NAMEPSLANRESID = "namepslanresid";
    public static final String FIELD_NAMEPSLANRESNAME = "NAMEPSLANRESNAME";
    protected static final String DTOFIELD_NAMEPSLANRESNAME = "namepslanresname";
    public static final String FIELD_NAVVIEWFILTER = "NAVVIEWFILTER";
    protected static final String DTOFIELD_NAVVIEWFILTER = "navviewfilter";
    public static final String FIELD_NAVVIEWPARAM = "NAVVIEWPARAM";
    protected static final String DTOFIELD_NAVVIEWPARAM = "navviewparam";
    public static final String FIELD_NEWDATAMODE = "NEWDATAMODE";
    protected static final String DTOFIELD_NEWDATAMODE = "newdatamode";
    public static final String FIELD_NO2PSDEUAGROUPID = "NO2PSDEUAGROUPID";
    protected static final String DTOFIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";
    public static final String FIELD_NO2PSDEUAGROUPNAME = "NO2PSDEUAGROUPNAME";
    protected static final String DTOFIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";
    public static final String FIELD_NODEDATATYPE = "NODEDATATYPE";
    protected static final String DTOFIELD_NODEDATATYPE = "nodedatatype";
    public static final String FIELD_NODEID2PSDEFID = "NODEID2PSDEFID";
    protected static final String DTOFIELD_NODEID2PSDEFID = "nodeid2psdefid";
    public static final String FIELD_NODEID3PSDEFID = "NODEID3PSDEFID";
    protected static final String DTOFIELD_NODEID3PSDEFID = "nodeid3psdefid";
    public static final String FIELD_NODEID4PSDEFID = "NODEID4PSDEFID";
    protected static final String DTOFIELD_NODEID4PSDEFID = "nodeid4psdefid";
    public static final String FIELD_NODEIDPSDEFID = "NODEIDPSDEFID";
    protected static final String DTOFIELD_NODEIDPSDEFID = "nodeidpsdefid";
    public static final String FIELD_NODETYPE = "NODETYPE";
    protected static final String DTOFIELD_NODETYPE = "nodetype";
    public static final String FIELD_NODEVALUE = "NODEVALUE";
    protected static final String DTOFIELD_NODEVALUE = "nodevalue";
    public static final String FIELD_PAGESIZE = "PAGESIZE";
    protected static final String DTOFIELD_PAGESIZE = "pagesize";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
    public static final String FIELD_PSDETREENODEID = "PSDETREENODEID";
    protected static final String DTOFIELD_PSDETREENODEID = "psdetreenodeid";
    public static final String FIELD_PSDETREENODENAME = "PSDETREENODENAME";
    protected static final String DTOFIELD_PSDETREENODENAME = "psdetreenodename";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_REMOVEPSDEOPPRIVID = "REMOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";
    public static final String FIELD_REMOVEPSDEOPPRIVNAME = "REMOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";
    public static final String FIELD_ROOTNODE = "ROOTNODE";
    protected static final String DTOFIELD_ROOTNODE = "rootnode";
    public static final String FIELD_SELECTED = "SELECTED";
    protected static final String DTOFIELD_SELECTED = "selected";
    public static final String FIELD_SHAPECLSPSDEFID = "SHAPECLSPSDEFID";
    protected static final String DTOFIELD_SHAPECLSPSDEFID = "shapeclspsdefid";
    public static final String FIELD_SHAPECLSPSDEFNAME = "SHAPECLSPSDEFNAME";
    protected static final String DTOFIELD_SHAPECLSPSDEFNAME = "shapeclspsdefname";
    public static final String FIELD_SHAPEDYNACLASS = "SHAPEDYNACLASS";
    protected static final String DTOFIELD_SHAPEDYNACLASS = "shapedynaclass";
    public static final String FIELD_SHAPEPSSYSCSSID = "SHAPEPSSYSCSSID";
    protected static final String DTOFIELD_SHAPEPSSYSCSSID = "shapepssyscssid";
    public static final String FIELD_SHAPEPSSYSCSSNAME = "SHAPEPSSYSCSSNAME";
    protected static final String DTOFIELD_SHAPEPSSYSCSSNAME = "shapepssyscssname";
    public static final String FIELD_SORTDIR = "SORTDIR";
    protected static final String DTOFIELD_SORTDIR = "sortdir";
    public static final String FIELD_SORTPSDEFID = "SORTPSDEFID";
    protected static final String DTOFIELD_SORTPSDEFID = "sortpsdefid";
    public static final String FIELD_SORTPSDEFNAME = "SORTPSDEFNAME";
    protected static final String DTOFIELD_SORTPSDEFNAME = "sortpsdefname";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TIPSPSDEFID = "TIPSPSDEFID";
    protected static final String DTOFIELD_TIPSPSDEFID = "tipspsdefid";
    public static final String FIELD_TIPSPSDEFNAME = "TIPSPSDEFNAME";
    protected static final String DTOFIELD_TIPSPSDEFNAME = "tipspsdefname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_TREENODETYPE = "TREENODETYPE";
    protected static final String DTOFIELD_TREENODETYPE = "treenodetype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATEPSDEACTIONID = "UPDATEPSDEACTIONID";
    protected static final String DTOFIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";
    public static final String FIELD_UPDATEPSDEACTIONNAME = "UPDATEPSDEACTIONNAME";
    protected static final String DTOFIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";
    public static final String FIELD_UPDATEPSDEOPPRIVID = "UPDATEPSDEOPPRIVID";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";
    public static final String FIELD_UPDATEPSDEOPPRIVNAME = "UPDATEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";
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
    public static final String FIELD_VIEWACTIONS = "VIEWACTIONS";
    protected static final String DTOFIELD_VIEWACTIONS = "viewactions";
    public static final String DTOFIELD_PSDETEIUPDATES = "psdeteiupdates";
    public static final String DTOFIELD_PSDETREENODECOLS = "psdetreenodecols";
    public static final String DTOFIELD_PSDETREENODERVS = "psdetreenodervs";

    @JsonProperty(value="appendcapflag")
    public void setAppendCapFlag(Integer appendCapFlag) {
        this._set(DTOFIELD_APPENDCAPFLAG, appendCapFlag);
    }

    @JsonIgnore
    public Integer getAppendCapFlag() {
        Object objValue = this._get(DTOFIELD_APPENDCAPFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAppendCapFlagDirty() {
        return this._contains(DTOFIELD_APPENDCAPFLAG);
    }

    @JsonIgnore
    public void resetAppendCapFlag() {
        this._reset(DTOFIELD_APPENDCAPFLAG);
    }

    @JsonIgnore
    public PSDETreeNodeDTO appendcapflag(Integer appendCapFlag) {
        this.setAppendCapFlag(appendCapFlag);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO appendcapflag(Boolean appendCapFlag) {
        if (appendCapFlag == null) {
            this.setAppendCapFlag(null);
        } else {
            this.setAppendCapFlag(appendCapFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="appendpnodeid")
    public void setAppendPNodeId(Integer appendPNodeId) {
        this._set(DTOFIELD_APPENDPNODEID, appendPNodeId);
    }

    @JsonIgnore
    public Integer getAppendPNodeId() {
        Object objValue = this._get(DTOFIELD_APPENDPNODEID);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAppendPNodeIdDirty() {
        return this._contains(DTOFIELD_APPENDPNODEID);
    }

    @JsonIgnore
    public void resetAppendPNodeId() {
        this._reset(DTOFIELD_APPENDPNODEID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO appendpnodeid(Integer appendPNodeId) {
        this.setAppendPNodeId(appendPNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO appendpnodeid(Boolean appendPNodeId) {
        if (appendPNodeId == null) {
            this.setAppendPNodeId(null);
        } else {
            this.setAppendPNodeId(appendPNodeId != false ? 1 : 0);
        }
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
    public PSDETreeNodeDTO caption(String caption) {
        this.setCaption(caption);
        return this;
    }

    @JsonProperty(value="checked")
    public void setChecked(Integer checked) {
        this._set(DTOFIELD_CHECKED, checked);
    }

    @JsonIgnore
    public Integer getChecked() {
        Object objValue = this._get(DTOFIELD_CHECKED);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCheckedDirty() {
        return this._contains(DTOFIELD_CHECKED);
    }

    @JsonIgnore
    public void resetChecked() {
        this._reset(DTOFIELD_CHECKED);
    }

    @JsonIgnore
    public PSDETreeNodeDTO checked(Integer checked) {
        this.setChecked(checked);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO checked(Boolean checked) {
        if (checked == null) {
            this.setChecked(null);
        } else {
            this.setChecked(checked != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="childcntpsdefid")
    public void setChildCntPSDEFId(String childCntPSDEFId) {
        this._set(DTOFIELD_CHILDCNTPSDEFID, childCntPSDEFId);
    }

    @JsonIgnore
    public String getChildCntPSDEFId() {
        Object objValue = this._get(DTOFIELD_CHILDCNTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChildCntPSDEFIdDirty() {
        return this._contains(DTOFIELD_CHILDCNTPSDEFID);
    }

    @JsonIgnore
    public void resetChildCntPSDEFId() {
        this._reset(DTOFIELD_CHILDCNTPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO childcntpsdefid(String childCntPSDEFId) {
        this.setChildCntPSDEFId(childCntPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO childcntpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setChildCntPSDEFId(null);
            this.setChildCntPSDEFName(null);
        } else {
            this.setChildCntPSDEFId(pSDEField.getPSDEFieldId());
            this.setChildCntPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="childcntpsdefname")
    public void setChildCntPSDEFName(String childCntPSDEFName) {
        this._set(DTOFIELD_CHILDCNTPSDEFNAME, childCntPSDEFName);
    }

    @JsonIgnore
    public String getChildCntPSDEFName() {
        Object objValue = this._get(DTOFIELD_CHILDCNTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChildCntPSDEFNameDirty() {
        return this._contains(DTOFIELD_CHILDCNTPSDEFNAME);
    }

    @JsonIgnore
    public void resetChildCntPSDEFName() {
        this._reset(DTOFIELD_CHILDCNTPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO childcntpsdefname(String childCntPSDEFName) {
        this.setChildCntPSDEFName(childCntPSDEFName);
        return this;
    }

    @JsonProperty(value="clspsdefid")
    public void setClsPSDEFId(String clsPSDEFId) {
        this._set(DTOFIELD_CLSPSDEFID, clsPSDEFId);
    }

    @JsonIgnore
    public String getClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public void resetClsPSDEFId() {
        this._reset(DTOFIELD_CLSPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO clspsdefid(String clsPSDEFId) {
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO clspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        } else {
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="clspsdefname")
    public void setClsPSDEFName(String clsPSDEFName) {
        this._set(DTOFIELD_CLSPSDEFNAME, clsPSDEFName);
    }

    @JsonIgnore
    public String getClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_CLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetClsPSDEFName() {
        this._reset(DTOFIELD_CLSPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO clspsdefname(String clsPSDEFName) {
        this.setClsPSDEFName(clsPSDEFName);
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
    public PSDETreeNodeDTO counterid(String counterId) {
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
    public PSDETreeNodeDTO countermode(Integer counterMode) {
        this.setCounterMode(counterMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO countermode(PSModelEnums.TreeNodeCounterMode counterMode) {
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
    public PSDETreeNodeDTO createdate(Timestamp createDate) {
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
    public PSDETreeNodeDTO createman(String createMan) {
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
    public PSDETreeNodeDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSDETreeNodeDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="data2psdefid")
    public void setData2PSDEFId(String data2PSDEFId) {
        this._set(DTOFIELD_DATA2PSDEFID, data2PSDEFId);
    }

    @JsonIgnore
    public String getData2PSDEFId() {
        Object objValue = this._get(DTOFIELD_DATA2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isData2PSDEFIdDirty() {
        return this._contains(DTOFIELD_DATA2PSDEFID);
    }

    @JsonIgnore
    public void resetData2PSDEFId() {
        this._reset(DTOFIELD_DATA2PSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO data2psdefid(String data2PSDEFId) {
        this.setData2PSDEFId(data2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO data2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setData2PSDEFId(null);
            this.setData2PSDEFName(null);
        } else {
            this.setData2PSDEFId(pSDEField.getPSDEFieldId());
            this.setData2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="data2psdefname")
    public void setData2PSDEFName(String data2PSDEFName) {
        this._set(DTOFIELD_DATA2PSDEFNAME, data2PSDEFName);
    }

    @JsonIgnore
    public String getData2PSDEFName() {
        Object objValue = this._get(DTOFIELD_DATA2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isData2PSDEFNameDirty() {
        return this._contains(DTOFIELD_DATA2PSDEFNAME);
    }

    @JsonIgnore
    public void resetData2PSDEFName() {
        this._reset(DTOFIELD_DATA2PSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO data2psdefname(String data2PSDEFName) {
        this.setData2PSDEFName(data2PSDEFName);
        return this;
    }

    @JsonProperty(value="datapsdefid")
    public void setDataPSDEFId(String dataPSDEFId) {
        this._set(DTOFIELD_DATAPSDEFID, dataPSDEFId);
    }

    @JsonIgnore
    public String getDataPSDEFId() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFIdDirty() {
        return this._contains(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public void resetDataPSDEFId() {
        this._reset(DTOFIELD_DATAPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO datapsdefid(String dataPSDEFId) {
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO datapsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        } else {
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="datapsdefname")
    public void setDataPSDEFName(String dataPSDEFName) {
        this._set(DTOFIELD_DATAPSDEFNAME, dataPSDEFName);
    }

    @JsonIgnore
    public String getDataPSDEFName() {
        Object objValue = this._get(DTOFIELD_DATAPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataPSDEFNameDirty() {
        return this._contains(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public void resetDataPSDEFName() {
        this._reset(DTOFIELD_DATAPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO datapsdefname(String dataPSDEFName) {
        this.setDataPSDEFName(dataPSDEFName);
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
    public PSDETreeNodeDTO datasource(String dataSource) {
        this.setDataSource(dataSource);
        return this;
    }

    @JsonProperty(value="datatypepsdefid")
    public void setDataTypePSDEFId(String dataTypePSDEFId) {
        this._set(DTOFIELD_DATATYPEPSDEFID, dataTypePSDEFId);
    }

    @JsonIgnore
    public String getDataTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_DATATYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_DATATYPEPSDEFID);
    }

    @JsonIgnore
    public void resetDataTypePSDEFId() {
        this._reset(DTOFIELD_DATATYPEPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO datatypepsdefid(String dataTypePSDEFId) {
        this.setDataTypePSDEFId(dataTypePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO datatypepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDataTypePSDEFId(null);
            this.setDataTypePSDEFName(null);
        } else {
            this.setDataTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setDataTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="datatypepsdefname")
    public void setDataTypePSDEFName(String dataTypePSDEFName) {
        this._set(DTOFIELD_DATATYPEPSDEFNAME, dataTypePSDEFName);
    }

    @JsonIgnore
    public String getDataTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_DATATYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDataTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_DATATYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetDataTypePSDEFName() {
        this._reset(DTOFIELD_DATATYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO datatypepsdefname(String dataTypePSDEFName) {
        this.setDataTypePSDEFName(dataTypePSDEFName);
        return this;
    }

    @JsonProperty(value="disableselect")
    public void setDisableSelect(Integer disableSelect) {
        this._set(DTOFIELD_DISABLESELECT, disableSelect);
    }

    @JsonIgnore
    public Integer getDisableSelect() {
        Object objValue = this._get(DTOFIELD_DISABLESELECT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDisableSelectDirty() {
        return this._contains(DTOFIELD_DISABLESELECT);
    }

    @JsonIgnore
    public void resetDisableSelect() {
        this._reset(DTOFIELD_DISABLESELECT);
    }

    @JsonIgnore
    public PSDETreeNodeDTO disableselect(Integer disableSelect) {
        this.setDisableSelect(disableSelect);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO disableselect(Boolean disableSelect) {
        if (disableSelect == null) {
            this.setDisableSelect(null);
        } else {
            this.setDisableSelect(disableSelect != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="distinctmode")
    public void setDistinctMode(Integer distinctMode) {
        this._set(DTOFIELD_DISTINCTMODE, distinctMode);
    }

    @JsonIgnore
    public Integer getDistinctMode() {
        Object objValue = this._get(DTOFIELD_DISTINCTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDistinctModeDirty() {
        return this._contains(DTOFIELD_DISTINCTMODE);
    }

    @JsonIgnore
    public void resetDistinctMode() {
        this._reset(DTOFIELD_DISTINCTMODE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO distinctmode(Integer distinctMode) {
        this.setDistinctMode(distinctMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO distinctmode(Boolean distinctMode) {
        if (distinctMode == null) {
            this.setDistinctMode(null);
        } else {
            this.setDistinctMode(distinctMode != false ? 1 : 0);
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
    public PSDETreeNodeDTO dynaclass(String dynaClass) {
        this.setDynaClass(dynaClass);
        return this;
    }

    @JsonProperty(value="editdatamode")
    public void setEditDataMode(String editDataMode) {
        this._set(DTOFIELD_EDITDATAMODE, editDataMode);
    }

    @JsonIgnore
    public String getEditDataMode() {
        Object objValue = this._get(DTOFIELD_EDITDATAMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditDataModeDirty() {
        return this._contains(DTOFIELD_EDITDATAMODE);
    }

    @JsonIgnore
    public void resetEditDataMode() {
        this._reset(DTOFIELD_EDITDATAMODE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO editdatamode(String editDataMode) {
        this.setEditDataMode(editDataMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO editdatamode(PSModelEnums.EditDataMode editDataMode) {
        if (editDataMode == null) {
            this.setEditDataMode(null);
        } else {
            this.setEditDataMode(editDataMode.value);
        }
        return this;
    }

    @JsonProperty(value="editmode")
    public void setEditMode(Integer editMode) {
        this._set(DTOFIELD_EDITMODE, editMode);
    }

    @JsonIgnore
    public Integer getEditMode() {
        Object objValue = this._get(DTOFIELD_EDITMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEditModeDirty() {
        return this._contains(DTOFIELD_EDITMODE);
    }

    @JsonIgnore
    public void resetEditMode() {
        this._reset(DTOFIELD_EDITMODE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO editmode(Integer editMode) {
        this.setEditMode(editMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO editmode(PSModelEnums.TreeNodeEditMode[] editMode) {
        if (editMode == null || editMode.length == 0) {
            this.setEditMode(null);
        } else {
            int _value = 0;
            for (PSModelEnums.TreeNodeEditMode _item : editMode) {
                _value |= _item.value;
            }
            this.setEditMode(_value);
        }
        return this;
    }

    @JsonProperty(value="enablecheck")
    public void setEnableCheck(Integer enableCheck) {
        this._set(DTOFIELD_ENABLECHECK, enableCheck);
    }

    @JsonIgnore
    public Integer getEnableCheck() {
        Object objValue = this._get(DTOFIELD_ENABLECHECK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCheckDirty() {
        return this._contains(DTOFIELD_ENABLECHECK);
    }

    @JsonIgnore
    public void resetEnableCheck() {
        this._reset(DTOFIELD_ENABLECHECK);
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablecheck(Integer enableCheck) {
        this.setEnableCheck(enableCheck);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablecheck(Boolean enableCheck) {
        if (enableCheck == null) {
            this.setEnableCheck(null);
        } else {
            this.setEnableCheck(enableCheck != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablepaging")
    public void setEnablePaging(Integer enablePaging) {
        this._set(DTOFIELD_ENABLEPAGING, enablePaging);
    }

    @JsonIgnore
    public Integer getEnablePaging() {
        Object objValue = this._get(DTOFIELD_ENABLEPAGING);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePagingDirty() {
        return this._contains(DTOFIELD_ENABLEPAGING);
    }

    @JsonIgnore
    public void resetEnablePaging() {
        this._reset(DTOFIELD_ENABLEPAGING);
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablepaging(Integer enablePaging) {
        this.setEnablePaging(enablePaging);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablepaging(Boolean enablePaging) {
        if (enablePaging == null) {
            this.setEnablePaging(null);
        } else {
            this.setEnablePaging(enablePaging != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablequicksearch")
    public void setEnableQuickSearch(Integer enableQuickSearch) {
        this._set(DTOFIELD_ENABLEQUICKSEARCH, enableQuickSearch);
    }

    @JsonIgnore
    public Integer getEnableQuickSearch() {
        Object objValue = this._get(DTOFIELD_ENABLEQUICKSEARCH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableQuickSearchDirty() {
        return this._contains(DTOFIELD_ENABLEQUICKSEARCH);
    }

    @JsonIgnore
    public void resetEnableQuickSearch() {
        this._reset(DTOFIELD_ENABLEQUICKSEARCH);
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablequicksearch(Integer enableQuickSearch) {
        this.setEnableQuickSearch(enableQuickSearch);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO enablequicksearch(Boolean enableQuickSearch) {
        if (enableQuickSearch == null) {
            this.setEnableQuickSearch(null);
        } else {
            this.setEnableQuickSearch(enableQuickSearch != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableviewactions")
    public void setEnableViewActions(Integer enableViewActions) {
        this._set(DTOFIELD_ENABLEVIEWACTIONS, enableViewActions);
    }

    @JsonIgnore
    public Integer getEnableViewActions() {
        Object objValue = this._get(DTOFIELD_ENABLEVIEWACTIONS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableViewActionsDirty() {
        return this._contains(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public void resetEnableViewActions() {
        this._reset(DTOFIELD_ENABLEVIEWACTIONS);
    }

    @JsonIgnore
    public PSDETreeNodeDTO enableviewactions(Integer enableViewActions) {
        this.setEnableViewActions(enableViewActions);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO enableviewactions(Boolean enableViewActions) {
        if (enableViewActions == null) {
            this.setEnableViewActions(null);
        } else {
            this.setEnableViewActions(enableViewActions != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="expand")
    public void setExpand(Integer expand) {
        this._set(DTOFIELD_EXPAND, expand);
    }

    @JsonIgnore
    public Integer getExpand() {
        Object objValue = this._get(DTOFIELD_EXPAND);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExpandDirty() {
        return this._contains(DTOFIELD_EXPAND);
    }

    @JsonIgnore
    public void resetExpand() {
        this._reset(DTOFIELD_EXPAND);
    }

    @JsonIgnore
    public PSDETreeNodeDTO expand(Integer expand) {
        this.setExpand(expand);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO expand(PSModelEnums.TreeNodeExpandMode expand) {
        if (expand == null) {
            this.setExpand(null);
        } else {
            this.setExpand(expand.value);
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
    public PSDETreeNodeDTO fieldname(String fieldName) {
        this.setFieldName(fieldName);
        return this;
    }

    @JsonProperty(value="filterpsdedsid")
    public void setFilterPSDEDSId(String filterPSDEDSId) {
        this._set(DTOFIELD_FILTERPSDEDSID, filterPSDEDSId);
    }

    @JsonIgnore
    public String getFilterPSDEDSId() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public void resetFilterPSDEDSId() {
        this._reset(DTOFIELD_FILTERPSDEDSID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO filterpsdedsid(String filterPSDEDSId) {
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO filterpsdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        } else {
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="filterpsdedsname")
    public void setFilterPSDEDSName(String filterPSDEDSName) {
        this._set(DTOFIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }

    @JsonIgnore
    public String getFilterPSDEDSName() {
        Object objValue = this._get(DTOFIELD_FILTERPSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty() {
        return this._contains(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public void resetFilterPSDEDSName() {
        this._reset(DTOFIELD_FILTERPSDEDSNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO filterpsdedsname(String filterPSDEDSName) {
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    @JsonProperty(value="iconpsdefid")
    public void setIconPSDEFId(String iconPSDEFId) {
        this._set(DTOFIELD_ICONPSDEFID, iconPSDEFId);
    }

    @JsonIgnore
    public String getIconPSDEFId() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFIdDirty() {
        return this._contains(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public void resetIconPSDEFId() {
        this._reset(DTOFIELD_ICONPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO iconpsdefid(String iconPSDEFId) {
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO iconpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        } else {
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="iconpsdefname")
    public void setIconPSDEFName(String iconPSDEFName) {
        this._set(DTOFIELD_ICONPSDEFNAME, iconPSDEFName);
    }

    @JsonIgnore
    public String getIconPSDEFName() {
        Object objValue = this._get(DTOFIELD_ICONPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPSDEFNameDirty() {
        return this._contains(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public void resetIconPSDEFName() {
        this._reset(DTOFIELD_ICONPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO iconpsdefname(String iconPSDEFName) {
        this.setIconPSDEFName(iconPSDEFName);
        return this;
    }

    @JsonProperty(value="keypsdefid")
    public void setKeyPSDEFId(String keyPSDEFId) {
        this._set(DTOFIELD_KEYPSDEFID, keyPSDEFId);
    }

    @JsonIgnore
    public String getKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public void resetKeyPSDEFId() {
        this._reset(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO keypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        } else {
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="keypsdefname")
    public void setKeyPSDEFName(String keyPSDEFName) {
        this._set(DTOFIELD_KEYPSDEFNAME, keyPSDEFName);
    }

    @JsonIgnore
    public String getKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetKeyPSDEFName() {
        this._reset(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO keypsdefname(String keyPSDEFName) {
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    @JsonProperty(value="leafflagpsdefid")
    public void setLeafFlagPSDEFId(String leafFlagPSDEFId) {
        this._set(DTOFIELD_LEAFFLAGPSDEFID, leafFlagPSDEFId);
    }

    @JsonIgnore
    public String getLeafFlagPSDEFId() {
        Object objValue = this._get(DTOFIELD_LEAFFLAGPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLeafFlagPSDEFIdDirty() {
        return this._contains(DTOFIELD_LEAFFLAGPSDEFID);
    }

    @JsonIgnore
    public void resetLeafFlagPSDEFId() {
        this._reset(DTOFIELD_LEAFFLAGPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO leafflagpsdefid(String leafFlagPSDEFId) {
        this.setLeafFlagPSDEFId(leafFlagPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO leafflagpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLeafFlagPSDEFId(null);
            this.setLeafFlagPSDEFName(null);
        } else {
            this.setLeafFlagPSDEFId(pSDEField.getPSDEFieldId());
            this.setLeafFlagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="leafflagpsdefname")
    public void setLeafFlagPSDEFName(String leafFlagPSDEFName) {
        this._set(DTOFIELD_LEAFFLAGPSDEFNAME, leafFlagPSDEFName);
    }

    @JsonIgnore
    public String getLeafFlagPSDEFName() {
        Object objValue = this._get(DTOFIELD_LEAFFLAGPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLeafFlagPSDEFNameDirty() {
        return this._contains(DTOFIELD_LEAFFLAGPSDEFNAME);
    }

    @JsonIgnore
    public void resetLeafFlagPSDEFName() {
        this._reset(DTOFIELD_LEAFFLAGPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO leafflagpsdefname(String leafFlagPSDEFName) {
        this.setLeafFlagPSDEFName(leafFlagPSDEFName);
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
    public PSDETreeNodeDTO linkpsdefid(String linkPSDEFId) {
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO linkpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDETreeNodeDTO linkpsdefname(String linkPSDEFName) {
        this.setLinkPSDEFName(linkPSDEFName);
        return this;
    }

    @JsonProperty(value="maxsize")
    public void setMaxSize(Integer maxSize) {
        this._set(DTOFIELD_MAXSIZE, maxSize);
    }

    @JsonIgnore
    public Integer getMaxSize() {
        Object objValue = this._get(DTOFIELD_MAXSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxSizeDirty() {
        return this._contains(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public void resetMaxSize() {
        this._reset(DTOFIELD_MAXSIZE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO maxsize(Integer maxSize) {
        this.setMaxSize(maxSize);
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
    public PSDETreeNodeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelobj")
    public void setModelObj(String modelObj) {
        this._set(DTOFIELD_MODELOBJ, modelObj);
    }

    @JsonIgnore
    public String getModelObj() {
        Object objValue = this._get(DTOFIELD_MODELOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelObjDirty() {
        return this._contains(DTOFIELD_MODELOBJ);
    }

    @JsonIgnore
    public void resetModelObj() {
        this._reset(DTOFIELD_MODELOBJ);
    }

    @JsonIgnore
    public PSDETreeNodeDTO modelobj(String modelObj) {
        this.setModelObj(modelObj);
        return this;
    }

    @JsonProperty(value="movepsdeactionid")
    public void setMovePSDEActionId(String movePSDEActionId) {
        this._set(DTOFIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }

    @JsonIgnore
    public String getMovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetMovePSDEActionId() {
        this._reset(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        } else {
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="movepsdeactionname")
    public void setMovePSDEActionName(String movePSDEActionName) {
        this._set(DTOFIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }

    @JsonIgnore
    public String getMovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetMovePSDEActionName() {
        this._reset(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeactionname(String movePSDEActionName) {
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    @JsonProperty(value="movepsdeopprivid")
    public void setMovePSDEOPPrivId(String movePSDEOPPrivId) {
        this._set(DTOFIELD_MOVEPSDEOPPRIVID, movePSDEOPPrivId);
    }

    @JsonIgnore
    public String getMovePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_MOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetMovePSDEOPPrivId() {
        this._reset(DTOFIELD_MOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeopprivid(String movePSDEOPPrivId) {
        this.setMovePSDEOPPrivId(movePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setMovePSDEOPPrivId(null);
            this.setMovePSDEOPPrivName(null);
        } else {
            this.setMovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setMovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="movepsdeopprivname")
    public void setMovePSDEOPPrivName(String movePSDEOPPrivName) {
        this._set(DTOFIELD_MOVEPSDEOPPRIVNAME, movePSDEOPPrivName);
    }

    @JsonIgnore
    public String getMovePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_MOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetMovePSDEOPPrivName() {
        this._reset(DTOFIELD_MOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO movepsdeopprivname(String movePSDEOPPrivName) {
        this.setMovePSDEOPPrivName(movePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="namepslanresid")
    public void setNamePSLanResId(String namePSLanResId) {
        this._set(DTOFIELD_NAMEPSLANRESID, namePSLanResId);
    }

    @JsonIgnore
    public String getNamePSLanResId() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResIdDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public void resetNamePSLanResId() {
        this._reset(DTOFIELD_NAMEPSLANRESID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        } else {
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="namepslanresname")
    public void setNamePSLanResName(String namePSLanResName) {
        this._set(DTOFIELD_NAMEPSLANRESNAME, namePSLanResName);
    }

    @JsonIgnore
    public String getNamePSLanResName() {
        Object objValue = this._get(DTOFIELD_NAMEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNamePSLanResNameDirty() {
        return this._contains(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetNamePSLanResName() {
        this._reset(DTOFIELD_NAMEPSLANRESNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO namepslanresname(String namePSLanResName) {
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    @JsonProperty(value="navviewfilter")
    public void setNavViewFilter(String navViewFilter) {
        this._set(DTOFIELD_NAVVIEWFILTER, navViewFilter);
    }

    @JsonIgnore
    public String getNavViewFilter() {
        Object objValue = this._get(DTOFIELD_NAVVIEWFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewFilterDirty() {
        return this._contains(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public void resetNavViewFilter() {
        this._reset(DTOFIELD_NAVVIEWFILTER);
    }

    @JsonIgnore
    public PSDETreeNodeDTO navviewfilter(String navViewFilter) {
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    @JsonProperty(value="navviewparam")
    public void setNavViewParam(String navViewParam) {
        this._set(DTOFIELD_NAVVIEWPARAM, navViewParam);
    }

    @JsonIgnore
    public String getNavViewParam() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewParamDirty() {
        return this._contains(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public void resetNavViewParam() {
        this._reset(DTOFIELD_NAVVIEWPARAM);
    }

    @JsonIgnore
    public PSDETreeNodeDTO navviewparam(String navViewParam) {
        this.setNavViewParam(navViewParam);
        return this;
    }

    @JsonProperty(value="newdatamode")
    public void setNewDataMode(String newDataMode) {
        this._set(DTOFIELD_NEWDATAMODE, newDataMode);
    }

    @JsonIgnore
    public String getNewDataMode() {
        Object objValue = this._get(DTOFIELD_NEWDATAMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNewDataModeDirty() {
        return this._contains(DTOFIELD_NEWDATAMODE);
    }

    @JsonIgnore
    public void resetNewDataMode() {
        this._reset(DTOFIELD_NEWDATAMODE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO newdatamode(String newDataMode) {
        this.setNewDataMode(newDataMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO newdatamode(PSModelEnums.NewDataMode newDataMode) {
        if (newDataMode == null) {
            this.setNewDataMode(null);
        } else {
            this.setNewDataMode(newDataMode.value);
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupid")
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId) {
        this._set(DTOFIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupId() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO no2psdeuagroupid(String no2PSDEUAGroupId) {
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        } else {
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="no2psdeuagroupname")
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName) {
        this._set(DTOFIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }

    @JsonIgnore
    public String getNo2PSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_NO2PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetNo2PSDEUAGroupName() {
        this._reset(DTOFIELD_NO2PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO no2psdeuagroupname(String no2PSDEUAGroupName) {
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="nodedatatype")
    public void setNodeDataType(String nodeDataType) {
        this._set(DTOFIELD_NODEDATATYPE, nodeDataType);
    }

    @JsonIgnore
    public String getNodeDataType() {
        Object objValue = this._get(DTOFIELD_NODEDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeDataTypeDirty() {
        return this._contains(DTOFIELD_NODEDATATYPE);
    }

    @JsonIgnore
    public void resetNodeDataType() {
        this._reset(DTOFIELD_NODEDATATYPE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodedatatype(String nodeDataType) {
        this.setNodeDataType(nodeDataType);
        return this;
    }

    @JsonProperty(value="nodeid2psdefid")
    public void setNodeId2PSDEFId(String nodeId2PSDEFId) {
        this._set(DTOFIELD_NODEID2PSDEFID, nodeId2PSDEFId);
    }

    @JsonIgnore
    public String getNodeId2PSDEFId() {
        Object objValue = this._get(DTOFIELD_NODEID2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeId2PSDEFIdDirty() {
        return this._contains(DTOFIELD_NODEID2PSDEFID);
    }

    @JsonIgnore
    public void resetNodeId2PSDEFId() {
        this._reset(DTOFIELD_NODEID2PSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid2psdefid(String nodeId2PSDEFId) {
        this.setNodeId2PSDEFId(nodeId2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNodeId2PSDEFId(null);
        } else {
            this.setNodeId2PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    @JsonProperty(value="nodeid3psdefid")
    public void setNodeId3PSDEFId(String nodeId3PSDEFId) {
        this._set(DTOFIELD_NODEID3PSDEFID, nodeId3PSDEFId);
    }

    @JsonIgnore
    public String getNodeId3PSDEFId() {
        Object objValue = this._get(DTOFIELD_NODEID3PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeId3PSDEFIdDirty() {
        return this._contains(DTOFIELD_NODEID3PSDEFID);
    }

    @JsonIgnore
    public void resetNodeId3PSDEFId() {
        this._reset(DTOFIELD_NODEID3PSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid3psdefid(String nodeId3PSDEFId) {
        this.setNodeId3PSDEFId(nodeId3PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid3psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNodeId3PSDEFId(null);
        } else {
            this.setNodeId3PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    @JsonProperty(value="nodeid4psdefid")
    public void setNodeId4PSDEFId(String nodeId4PSDEFId) {
        this._set(DTOFIELD_NODEID4PSDEFID, nodeId4PSDEFId);
    }

    @JsonIgnore
    public String getNodeId4PSDEFId() {
        Object objValue = this._get(DTOFIELD_NODEID4PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeId4PSDEFIdDirty() {
        return this._contains(DTOFIELD_NODEID4PSDEFID);
    }

    @JsonIgnore
    public void resetNodeId4PSDEFId() {
        this._reset(DTOFIELD_NODEID4PSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid4psdefid(String nodeId4PSDEFId) {
        this.setNodeId4PSDEFId(nodeId4PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeid4psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNodeId4PSDEFId(null);
        } else {
            this.setNodeId4PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    @JsonProperty(value="nodeidpsdefid")
    public void setNodeIdPSDEFId(String nodeIdPSDEFId) {
        this._set(DTOFIELD_NODEIDPSDEFID, nodeIdPSDEFId);
    }

    @JsonIgnore
    public String getNodeIdPSDEFId() {
        Object objValue = this._get(DTOFIELD_NODEIDPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeIdPSDEFIdDirty() {
        return this._contains(DTOFIELD_NODEIDPSDEFID);
    }

    @JsonIgnore
    public void resetNodeIdPSDEFId() {
        this._reset(DTOFIELD_NODEIDPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeidpsdefid(String nodeIdPSDEFId) {
        this.setNodeIdPSDEFId(nodeIdPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodeidpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setNodeIdPSDEFId(null);
        } else {
            this.setNodeIdPSDEFId(pSDEField.getPSDEFieldId());
        }
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
    public PSDETreeNodeDTO nodetype(String nodeType) {
        this.setNodeType(nodeType);
        return this;
    }

    @JsonProperty(value="nodevalue")
    public void setNodeValue(String nodeValue) {
        this._set(DTOFIELD_NODEVALUE, nodeValue);
    }

    @JsonIgnore
    public String getNodeValue() {
        Object objValue = this._get(DTOFIELD_NODEVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNodeValueDirty() {
        return this._contains(DTOFIELD_NODEVALUE);
    }

    @JsonIgnore
    public void resetNodeValue() {
        this._reset(DTOFIELD_NODEVALUE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO nodevalue(String nodeValue) {
        this.setNodeValue(nodeValue);
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
    public PSDETreeNodeDTO pagesize(Integer pageSize) {
        this.setPageSize(pageSize);
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
    public PSDETreeNodeDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDETreeNodeDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSDETreeNodeDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDETreeNodeDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSDETreeNodeDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdegridid(PSDEGridDTO pSDEGrid) {
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
    public PSDETreeNodeDTO psdegridname(String pSDEGridName) {
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
    public PSDETreeNodeDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDETreeNodeDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDETreeNodeDTO psdelogicname(String pSDELogicName) {
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
    public PSDETreeNodeDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
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
    public PSDETreeNodeDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
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
    public PSDETreeNodeDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonProperty(value="psdetreenodeid")
    public void setPSDETreeNodeId(String pSDETreeNodeId) {
        this._set(DTOFIELD_PSDETREENODEID, pSDETreeNodeId);
    }

    @JsonIgnore
    public String getPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeId() {
        this._reset(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdetreenodeid(String pSDETreeNodeId) {
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    @JsonProperty(value="psdetreenodename")
    public void setPSDETreeNodeName(String pSDETreeNodeName) {
        this._set(DTOFIELD_PSDETREENODENAME, pSDETreeNodeName);
    }

    @JsonIgnore
    public String getPSDETreeNodeName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeName() {
        this._reset(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdetreenodename(String pSDETreeNodeName) {
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeNodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeNodeName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeDTO name(String strName) {
        this.setPSDETreeNodeName(strName);
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
    public PSDETreeNodeDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
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
    public PSDETreeNodeDTO psdetreeviewname(String pSDETreeViewName) {
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
    public PSDETreeNodeDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDETreeNodeDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
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
    public PSDETreeNodeDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDETreeNodeDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
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
    public PSDETreeNodeDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDETreeNodeDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDETreeNodeDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDETreeNodeDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDETreeNodeDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDETreeNodeDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
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
    public PSDETreeNodeDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
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
    public PSDETreeNodeDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="removepsdeactionid")
    public void setRemovePSDEActionId(String removePSDEActionId) {
        this._set(DTOFIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }

    @JsonIgnore
    public String getRemovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetRemovePSDEActionId() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        } else {
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeactionname")
    public void setRemovePSDEActionName(String removePSDEActionName) {
        this._set(DTOFIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }

    @JsonIgnore
    public String getRemovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEActionName() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    @JsonProperty(value="removepsdeopprivid")
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivId() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeopprivid(String removePSDEOPPrivId) {
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        } else {
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeopprivname")
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivName() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO removepsdeopprivname(String removePSDEOPPrivName) {
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="rootnode")
    public void setRootNode(Integer rootNode) {
        this._set(DTOFIELD_ROOTNODE, rootNode);
    }

    @JsonIgnore
    public Integer getRootNode() {
        Object objValue = this._get(DTOFIELD_ROOTNODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRootNodeDirty() {
        return this._contains(DTOFIELD_ROOTNODE);
    }

    @JsonIgnore
    public void resetRootNode() {
        this._reset(DTOFIELD_ROOTNODE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO rootnode(Integer rootNode) {
        this.setRootNode(rootNode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO rootnode(Boolean rootNode) {
        if (rootNode == null) {
            this.setRootNode(null);
        } else {
            this.setRootNode(rootNode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="selected")
    public void setSelected(Integer selected) {
        this._set(DTOFIELD_SELECTED, selected);
    }

    @JsonIgnore
    public Integer getSelected() {
        Object objValue = this._get(DTOFIELD_SELECTED);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSelectedDirty() {
        return this._contains(DTOFIELD_SELECTED);
    }

    @JsonIgnore
    public void resetSelected() {
        this._reset(DTOFIELD_SELECTED);
    }

    @JsonIgnore
    public PSDETreeNodeDTO selected(Integer selected) {
        this.setSelected(selected);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO selected(PSModelEnums.TreeNodeSelectMode selected) {
        if (selected == null) {
            this.setSelected(null);
        } else {
            this.setSelected(selected.value);
        }
        return this;
    }

    @JsonProperty(value="shapeclspsdefid")
    public void setShapeClsPSDEFId(String shapeClsPSDEFId) {
        this._set(DTOFIELD_SHAPECLSPSDEFID, shapeClsPSDEFId);
    }

    @JsonIgnore
    public String getShapeClsPSDEFId() {
        Object objValue = this._get(DTOFIELD_SHAPECLSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeClsPSDEFIdDirty() {
        return this._contains(DTOFIELD_SHAPECLSPSDEFID);
    }

    @JsonIgnore
    public void resetShapeClsPSDEFId() {
        this._reset(DTOFIELD_SHAPECLSPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapeclspsdefid(String shapeClsPSDEFId) {
        this.setShapeClsPSDEFId(shapeClsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapeclspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setShapeClsPSDEFId(null);
            this.setShapeClsPSDEFName(null);
        } else {
            this.setShapeClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setShapeClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="shapeclspsdefname")
    public void setShapeClsPSDEFName(String shapeClsPSDEFName) {
        this._set(DTOFIELD_SHAPECLSPSDEFNAME, shapeClsPSDEFName);
    }

    @JsonIgnore
    public String getShapeClsPSDEFName() {
        Object objValue = this._get(DTOFIELD_SHAPECLSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeClsPSDEFNameDirty() {
        return this._contains(DTOFIELD_SHAPECLSPSDEFNAME);
    }

    @JsonIgnore
    public void resetShapeClsPSDEFName() {
        this._reset(DTOFIELD_SHAPECLSPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapeclspsdefname(String shapeClsPSDEFName) {
        this.setShapeClsPSDEFName(shapeClsPSDEFName);
        return this;
    }

    @JsonProperty(value="shapedynaclass")
    public void setShapeDynaClass(String shapeDynaClass) {
        this._set(DTOFIELD_SHAPEDYNACLASS, shapeDynaClass);
    }

    @JsonIgnore
    public String getShapeDynaClass() {
        Object objValue = this._get(DTOFIELD_SHAPEDYNACLASS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeDynaClassDirty() {
        return this._contains(DTOFIELD_SHAPEDYNACLASS);
    }

    @JsonIgnore
    public void resetShapeDynaClass() {
        this._reset(DTOFIELD_SHAPEDYNACLASS);
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapedynaclass(String shapeDynaClass) {
        this.setShapeDynaClass(shapeDynaClass);
        return this;
    }

    @JsonProperty(value="shapepssyscssid")
    public void setShapePSSysCssId(String shapePSSysCssId) {
        this._set(DTOFIELD_SHAPEPSSYSCSSID, shapePSSysCssId);
    }

    @JsonIgnore
    public String getShapePSSysCssId() {
        Object objValue = this._get(DTOFIELD_SHAPEPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapePSSysCssIdDirty() {
        return this._contains(DTOFIELD_SHAPEPSSYSCSSID);
    }

    @JsonIgnore
    public void resetShapePSSysCssId() {
        this._reset(DTOFIELD_SHAPEPSSYSCSSID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapepssyscssid(String shapePSSysCssId) {
        this.setShapePSSysCssId(shapePSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapepssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setShapePSSysCssId(null);
            this.setShapePSSysCssName(null);
        } else {
            this.setShapePSSysCssId(pSSysCss.getPSSysCssId());
            this.setShapePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="shapepssyscssname")
    public void setShapePSSysCssName(String shapePSSysCssName) {
        this._set(DTOFIELD_SHAPEPSSYSCSSNAME, shapePSSysCssName);
    }

    @JsonIgnore
    public String getShapePSSysCssName() {
        Object objValue = this._get(DTOFIELD_SHAPEPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapePSSysCssNameDirty() {
        return this._contains(DTOFIELD_SHAPEPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetShapePSSysCssName() {
        this._reset(DTOFIELD_SHAPEPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO shapepssyscssname(String shapePSSysCssName) {
        this.setShapePSSysCssName(shapePSSysCssName);
        return this;
    }

    @JsonProperty(value="sortdir")
    public void setSortDir(String sortDir) {
        this._set(DTOFIELD_SORTDIR, sortDir);
    }

    @JsonIgnore
    public String getSortDir() {
        Object objValue = this._get(DTOFIELD_SORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSortDirDirty() {
        return this._contains(DTOFIELD_SORTDIR);
    }

    @JsonIgnore
    public void resetSortDir() {
        this._reset(DTOFIELD_SORTDIR);
    }

    @JsonIgnore
    public PSDETreeNodeDTO sortdir(String sortDir) {
        this.setSortDir(sortDir);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO sortdir(PSModelEnums.TreeNodeSortDir sortDir) {
        if (sortDir == null) {
            this.setSortDir(null);
        } else {
            this.setSortDir(sortDir.value);
        }
        return this;
    }

    @JsonProperty(value="sortpsdefid")
    public void setSortPSDEFId(String sortPSDEFId) {
        this._set(DTOFIELD_SORTPSDEFID, sortPSDEFId);
    }

    @JsonIgnore
    public String getSortPSDEFId() {
        Object objValue = this._get(DTOFIELD_SORTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSortPSDEFIdDirty() {
        return this._contains(DTOFIELD_SORTPSDEFID);
    }

    @JsonIgnore
    public void resetSortPSDEFId() {
        this._reset(DTOFIELD_SORTPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO sortpsdefid(String sortPSDEFId) {
        this.setSortPSDEFId(sortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO sortpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSortPSDEFId(null);
            this.setSortPSDEFName(null);
        } else {
            this.setSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="sortpsdefname")
    public void setSortPSDEFName(String sortPSDEFName) {
        this._set(DTOFIELD_SORTPSDEFNAME, sortPSDEFName);
    }

    @JsonIgnore
    public String getSortPSDEFName() {
        Object objValue = this._get(DTOFIELD_SORTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSortPSDEFNameDirty() {
        return this._contains(DTOFIELD_SORTPSDEFNAME);
    }

    @JsonIgnore
    public void resetSortPSDEFName() {
        this._reset(DTOFIELD_SORTPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO sortpsdefname(String sortPSDEFName) {
        this.setSortPSDEFName(sortPSDEFName);
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
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
    public PSDETreeNodeDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDETreeNodeDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    @JsonProperty(value="tipspsdefid")
    public void setTipsPSDEFId(String tipsPSDEFId) {
        this._set(DTOFIELD_TIPSPSDEFID, tipsPSDEFId);
    }

    @JsonIgnore
    public String getTipsPSDEFId() {
        Object objValue = this._get(DTOFIELD_TIPSPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipsPSDEFIdDirty() {
        return this._contains(DTOFIELD_TIPSPSDEFID);
    }

    @JsonIgnore
    public void resetTipsPSDEFId() {
        this._reset(DTOFIELD_TIPSPSDEFID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO tipspsdefid(String tipsPSDEFId) {
        this.setTipsPSDEFId(tipsPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO tipspsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTipsPSDEFId(null);
            this.setTipsPSDEFName(null);
        } else {
            this.setTipsPSDEFId(pSDEField.getPSDEFieldId());
            this.setTipsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="tipspsdefname")
    public void setTipsPSDEFName(String tipsPSDEFName) {
        this._set(DTOFIELD_TIPSPSDEFNAME, tipsPSDEFName);
    }

    @JsonIgnore
    public String getTipsPSDEFName() {
        Object objValue = this._get(DTOFIELD_TIPSPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTipsPSDEFNameDirty() {
        return this._contains(DTOFIELD_TIPSPSDEFNAME);
    }

    @JsonIgnore
    public void resetTipsPSDEFName() {
        this._reset(DTOFIELD_TIPSPSDEFNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO tipspsdefname(String tipsPSDEFName) {
        this.setTipsPSDEFName(tipsPSDEFName);
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
    public PSDETreeNodeDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    @JsonProperty(value="treenodetype")
    public void setTreeNodeType(String treeNodeType) {
        this._set(DTOFIELD_TREENODETYPE, treeNodeType);
    }

    @JsonIgnore
    public String getTreeNodeType() {
        Object objValue = this._get(DTOFIELD_TREENODETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTreeNodeTypeDirty() {
        return this._contains(DTOFIELD_TREENODETYPE);
    }

    @JsonIgnore
    public void resetTreeNodeType() {
        this._reset(DTOFIELD_TREENODETYPE);
    }

    @JsonIgnore
    public PSDETreeNodeDTO treenodetype(String treeNodeType) {
        this.setTreeNodeType(treeNodeType);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO treenodetype(PSModelEnums.TreeNodeType treeNodeType) {
        if (treeNodeType == null) {
            this.setTreeNodeType(null);
        } else {
            this.setTreeNodeType(treeNodeType.value);
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
    public PSDETreeNodeDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeNodeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="updatepsdeactionid")
    public void setUpdatePSDEActionId(String updatePSDEActionId) {
        this._set(DTOFIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }

    @JsonIgnore
    public String getUpdatePSDEActionId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionId() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        } else {
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeactionname")
    public void setUpdatePSDEActionName(String updatePSDEActionName) {
        this._set(DTOFIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }

    @JsonIgnore
    public String getUpdatePSDEActionName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionName() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeactionname(String updatePSDEActionName) {
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    @JsonProperty(value="updatepsdeopprivid")
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivId() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeopprivid(String updatePSDEOPPrivId) {
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        } else {
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeopprivname")
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivName() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDETreeNodeDTO updatepsdeopprivname(String updatePSDEOPPrivName) {
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
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
    public PSDETreeNodeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeNodeDTO usertag(String userTag) {
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
    public PSDETreeNodeDTO usertag2(String userTag2) {
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
    public PSDETreeNodeDTO usertag3(String userTag3) {
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
    public PSDETreeNodeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="viewactions")
    public void setViewActions(Integer viewActions) {
        this._set(DTOFIELD_VIEWACTIONS, viewActions);
    }

    @JsonIgnore
    public Integer getViewActions() {
        Object objValue = this._get(DTOFIELD_VIEWACTIONS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewActionsDirty() {
        return this._contains(DTOFIELD_VIEWACTIONS);
    }

    @JsonIgnore
    public void resetViewActions() {
        this._reset(DTOFIELD_VIEWACTIONS);
    }

    @JsonIgnore
    public PSDETreeNodeDTO viewactions(Integer viewActions) {
        this.setViewActions(viewActions);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeDTO viewactions(PSModelEnums.CtrlUIAction[] viewActions) {
        if (viewActions == null || viewActions.length == 0) {
            this.setViewActions(null);
        } else {
            int _value = 0;
            for (PSModelEnums.CtrlUIAction _item : viewActions) {
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeNodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeNodeId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeDTO id(String strValue) {
        this.setPSDETreeNodeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDETEIUpdateDTO> getPSDETEIUpdates() {
        Object list = this._get(DTOFIELD_PSDETEIUPDATES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeteiupdates")
    public void setPSDETEIUpdates(List<PSDETEIUpdateDTO> psdeteiupdates) {
        this._set(DTOFIELD_PSDETEIUPDATES, psdeteiupdates);
    }

    @JsonIgnore
    public List<PSDETEIUpdateDTO> getPSDETEIUpdatesIf() {
        Object list = this._get(DTOFIELD_PSDETEIUPDATES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETEIUPDATES, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDETreeNodeColDTO> getPSDETreeNodeCols() {
        Object list = this._get(DTOFIELD_PSDETREENODECOLS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreenodecols")
    public void setPSDETreeNodeCols(List<PSDETreeNodeColDTO> psdetreenodecols) {
        this._set(DTOFIELD_PSDETREENODECOLS, psdetreenodecols);
    }

    @JsonIgnore
    public List<PSDETreeNodeColDTO> getPSDETreeNodeColsIf() {
        Object list = this._get(DTOFIELD_PSDETREENODECOLS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREENODECOLS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDETreeNodeRVDTO> getPSDETreeNodeRVs() {
        Object list = this._get(DTOFIELD_PSDETREENODERVS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreenodervs")
    public void setPSDETreeNodeRVs(List<PSDETreeNodeRVDTO> psdetreenodervs) {
        this._set(DTOFIELD_PSDETREENODERVS, psdetreenodervs);
    }

    @JsonIgnore
    public List<PSDETreeNodeRVDTO> getPSDETreeNodeRVsIf() {
        Object list = this._get(DTOFIELD_PSDETREENODERVS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREENODERVS, list);
        }
        return (List) list;
    }
}
