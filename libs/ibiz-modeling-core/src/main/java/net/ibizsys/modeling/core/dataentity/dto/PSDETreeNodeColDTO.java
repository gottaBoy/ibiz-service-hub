package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeNodeColDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CELLPSSYSCSSID = "CELLPSSYSCSSID";
    protected static final String DTOFIELD_CELLPSSYSCSSID = "cellpssyscssid";
    public static final String FIELD_CELLPSSYSCSSNAME = "CELLPSSYSCSSNAME";
    protected static final String DTOFIELD_CELLPSSYSCSSNAME = "cellpssyscssname";
    public static final String FIELD_CLCONVERTMODE = "CLCONVERTMODE";
    protected static final String DTOFIELD_CLCONVERTMODE = "clconvertmode";
    public static final String FIELD_CODELISTCONFIGMODE = "CODELISTCONFIGMODE";
    protected static final String DTOFIELD_CODELISTCONFIGMODE = "codelistconfigmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDV = "CREATEDV";
    protected static final String DTOFIELD_CREATEDV = "createdv";
    public static final String FIELD_CREATEDVT = "CREATEDVT";
    protected static final String DTOFIELD_CREATEDVT = "createdvt";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_EDITORPARAMS = "EDITORPARAMS";
    protected static final String DTOFIELD_EDITORPARAMS = "editorparams";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_ENABLECOND = "ENABLECOND";
    protected static final String DTOFIELD_ENABLECOND = "enablecond";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLELINK = "ENABLELINK";
    protected static final String DTOFIELD_ENABLELINK = "enablelink";
    public static final String FIELD_ENABLEROWEDIT = "ENABLEROWEDIT";
    protected static final String DTOFIELD_ENABLEROWEDIT = "enablerowedit";
    public static final String FIELD_GCRPSSYSPFPLUGINID = "GCRPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";
    public static final String FIELD_GCRPSSYSPFPLUGINNAME = "GCRPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";
    public static final String FIELD_GRIDCOLSTYLE = "GRIDCOLSTYLE";
    protected static final String DTOFIELD_GRIDCOLSTYLE = "gridcolstyle";
    public static final String FIELD_GRIDCOLTYPE = "GRIDCOLTYPE";
    protected static final String DTOFIELD_GRIDCOLTYPE = "gridcoltype";
    public static final String FIELD_GROUPITEM = "GROUPITEM";
    protected static final String DTOFIELD_GROUPITEM = "groupitem";
    public static final String FIELD_HIDDENDATAITEM = "HIDDENDATAITEM";
    protected static final String DTOFIELD_HIDDENDATAITEM = "hiddendataitem";
    public static final String FIELD_IGNOREINPUT = "IGNOREINPUT";
    protected static final String DTOFIELD_IGNOREINPUT = "ignoreinput";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NEEDCODELISTCONFIG = "NEEDCODELISTCONFIG";
    protected static final String DTOFIELD_NEEDCODELISTCONFIG = "needcodelistconfig";
    public static final String FIELD_NOPRIVDM = "NOPRIVDM";
    protected static final String DTOFIELD_NOPRIVDM = "noprivdm";
    public static final String FIELD_PICKUPPSDEVIEWID = "PICKUPPSDEVIEWID";
    protected static final String DTOFIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";
    public static final String FIELD_PICKUPPSDEVIEWNAME = "PICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFUIMODEID = "PSDEFUIMODEID";
    protected static final String DTOFIELD_PSDEFUIMODEID = "psdefuimodeid";
    public static final String FIELD_PSDEFUIMODENAME = "PSDEFUIMODENAME";
    protected static final String DTOFIELD_PSDEFUIMODENAME = "psdefuimodename";
    public static final String FIELD_PSDETEIUPDATEID = "PSDETEIUPDATEID";
    protected static final String DTOFIELD_PSDETEIUPDATEID = "psdeteiupdateid";
    public static final String FIELD_PSDETEIUPDATENAME = "PSDETEIUPDATENAME";
    protected static final String DTOFIELD_PSDETEIUPDATENAME = "psdeteiupdatename";
    public static final String FIELD_PSDETREECOLID = "PSDETREECOLID";
    protected static final String DTOFIELD_PSDETREECOLID = "psdetreecolid";
    public static final String FIELD_PSDETREECOLNAME = "PSDETREECOLNAME";
    protected static final String DTOFIELD_PSDETREECOLNAME = "psdetreecolname";
    public static final String FIELD_PSDETREENODECOLID = "PSDETREENODECOLID";
    protected static final String DTOFIELD_PSDETREENODECOLID = "psdetreenodecolid";
    public static final String FIELD_PSDETREENODECOLNAME = "PSDETREENODECOLNAME";
    protected static final String DTOFIELD_PSDETREENODECOLNAME = "psdetreenodecolname";
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
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
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
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEDV = "UPDATEDV";
    protected static final String DTOFIELD_UPDATEDV = "updatedv";
    public static final String FIELD_UPDATEDVT = "UPDATEDVT";
    protected static final String DTOFIELD_UPDATEDVT = "updatedvt";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUEITEMNAME = "VALUEITEMNAME";
    protected static final String DTOFIELD_VALUEITEMNAME = "valueitemname";

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
    public PSDETreeNodeColDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="cellpssyscssid")
    public void setCellPSSysCssId(String cellPSSysCssId) {
        this._set(DTOFIELD_CELLPSSYSCSSID, cellPSSysCssId);
    }

    @JsonIgnore
    public String getCellPSSysCssId() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssIdDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public void resetCellPSSysCssId() {
        this._reset(DTOFIELD_CELLPSSYSCSSID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO cellpssyscssid(String cellPSSysCssId) {
        this.setCellPSSysCssId(cellPSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO cellpssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setCellPSSysCssId(null);
            this.setCellPSSysCssName(null);
        } else {
            this.setCellPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCellPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="cellpssyscssname")
    public void setCellPSSysCssName(String cellPSSysCssName) {
        this._set(DTOFIELD_CELLPSSYSCSSNAME, cellPSSysCssName);
    }

    @JsonIgnore
    public String getCellPSSysCssName() {
        Object objValue = this._get(DTOFIELD_CELLPSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCellPSSysCssNameDirty() {
        return this._contains(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetCellPSSysCssName() {
        this._reset(DTOFIELD_CELLPSSYSCSSNAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO cellpssyscssname(String cellPSSysCssName) {
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    @JsonProperty(value="clconvertmode")
    public void setCLConvertMode(String cLConvertMode) {
        this._set(DTOFIELD_CLCONVERTMODE, cLConvertMode);
    }

    @JsonIgnore
    public String getCLConvertMode() {
        Object objValue = this._get(DTOFIELD_CLCONVERTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCLConvertModeDirty() {
        return this._contains(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public void resetCLConvertMode() {
        this._reset(DTOFIELD_CLCONVERTMODE);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO clconvertmode(String cLConvertMode) {
        this.setCLConvertMode(cLConvertMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO clconvertmode(PSModelEnums.CodeListConvertMode cLConvertMode) {
        if (cLConvertMode == null) {
            this.setCLConvertMode(null);
        } else {
            this.setCLConvertMode(cLConvertMode.value);
        }
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
    public PSDETreeNodeColDTO codelistconfigmode(Integer codeListConfigMode) {
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO codelistconfigmode(PSModelEnums.OutputCodeListMode codeListConfigMode) {
        if (codeListConfigMode == null) {
            this.setCodeListConfigMode(null);
        } else {
            this.setCodeListConfigMode(codeListConfigMode.value);
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
    public PSDETreeNodeColDTO createdate(Timestamp createDate) {
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
    public PSDETreeNodeColDTO createdv(String createDV) {
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
    public PSDETreeNodeColDTO createdvt(String createDVT) {
        this.setCreateDVT(createDVT);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO createdvt(PSModelEnums.CreateDefaultValueType createDVT) {
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
    public PSDETreeNodeColDTO createman(String createMan) {
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
    public PSDETreeNodeColDTO customcode(String customCode) {
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
    public PSDETreeNodeColDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
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
    public PSDETreeNodeColDTO editorparams(String editorParams) {
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
    public PSDETreeNodeColDTO editortype(String editorType) {
        this.setEditorType(editorType);
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
    public PSDETreeNodeColDTO enablecond(Integer enableCond) {
        this.setEnableCond(enableCond);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enablecond(PSModelEnums.EditItemEnableCond enableCond) {
        if (enableCond == null) {
            this.setEnableCond(null);
        } else {
            this.setEnableCond(enableCond.value);
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
    public PSDETreeNodeColDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablelink")
    public void setEnableLink(Integer enableLink) {
        this._set(DTOFIELD_ENABLELINK, enableLink);
    }

    @JsonIgnore
    public Integer getEnableLink() {
        Object objValue = this._get(DTOFIELD_ENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableLinkDirty() {
        return this._contains(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public void resetEnableLink() {
        this._reset(DTOFIELD_ENABLELINK);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enablelink(Integer enableLink) {
        this.setEnableLink(enableLink);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enablelink(PSModelEnums.DEGridColLinkMode enableLink) {
        if (enableLink == null) {
            this.setEnableLink(null);
        } else {
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    @JsonProperty(value="enablerowedit")
    public void setEnableRowEdit(Integer enableRowEdit) {
        this._set(DTOFIELD_ENABLEROWEDIT, enableRowEdit);
    }

    @JsonIgnore
    public Integer getEnableRowEdit() {
        Object objValue = this._get(DTOFIELD_ENABLEROWEDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableRowEditDirty() {
        return this._contains(DTOFIELD_ENABLEROWEDIT);
    }

    @JsonIgnore
    public void resetEnableRowEdit() {
        this._reset(DTOFIELD_ENABLEROWEDIT);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enablerowedit(Integer enableRowEdit) {
        this.setEnableRowEdit(enableRowEdit);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO enablerowedit(Boolean enableRowEdit) {
        if (enableRowEdit == null) {
            this.setEnableRowEdit(null);
        } else {
            this.setEnableRowEdit(enableRowEdit != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginid")
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginId() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gcrpssyspfpluginid(String gCRPSSysPFPluginId) {
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        } else {
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="gcrpssyspfpluginname")
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName) {
        this._set(DTOFIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }

    @JsonIgnore
    public String getGCRPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_GCRPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetGCRPSSysPFPluginName() {
        this._reset(DTOFIELD_GCRPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gcrpssyspfpluginname(String gCRPSSysPFPluginName) {
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="gridcolstyle")
    public void setGridColStyle(String gridColStyle) {
        this._set(DTOFIELD_GRIDCOLSTYLE, gridColStyle);
    }

    @JsonIgnore
    public String getGridColStyle() {
        Object objValue = this._get(DTOFIELD_GRIDCOLSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColStyleDirty() {
        return this._contains(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public void resetGridColStyle() {
        this._reset(DTOFIELD_GRIDCOLSTYLE);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gridcolstyle(String gridColStyle) {
        this.setGridColStyle(gridColStyle);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gridcolstyle(PSModelEnums.GridColStype gridColStyle) {
        if (gridColStyle == null) {
            this.setGridColStyle(null);
        } else {
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    @JsonProperty(value="gridcoltype")
    public void setGridColType(String gridColType) {
        this._set(DTOFIELD_GRIDCOLTYPE, gridColType);
    }

    @JsonIgnore
    public String getGridColType() {
        Object objValue = this._get(DTOFIELD_GRIDCOLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColTypeDirty() {
        return this._contains(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public void resetGridColType() {
        this._reset(DTOFIELD_GRIDCOLTYPE);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO gridcoltype(String gridColType) {
        this.setGridColType(gridColType);
        return this;
    }

    @JsonProperty(value="groupitem")
    public void setGroupItem(String groupItem) {
        this._set(DTOFIELD_GROUPITEM, groupItem);
    }

    @JsonIgnore
    public String getGroupItem() {
        Object objValue = this._get(DTOFIELD_GROUPITEM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupItemDirty() {
        return this._contains(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public void resetGroupItem() {
        this._reset(DTOFIELD_GROUPITEM);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO groupitem(String groupItem) {
        this.setGroupItem(groupItem);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO groupitem(PSModelEnums.GridColGroupMode groupItem) {
        if (groupItem == null) {
            this.setGroupItem(null);
        } else {
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    @JsonProperty(value="hiddendataitem")
    public void setHiddenDataItem(Integer hiddenDataItem) {
        this._set(DTOFIELD_HIDDENDATAITEM, hiddenDataItem);
    }

    @JsonIgnore
    public Integer getHiddenDataItem() {
        Object objValue = this._get(DTOFIELD_HIDDENDATAITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHiddenDataItemDirty() {
        return this._contains(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public void resetHiddenDataItem() {
        this._reset(DTOFIELD_HIDDENDATAITEM);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO hiddendataitem(Integer hiddenDataItem) {
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO hiddendataitem(Boolean hiddenDataItem) {
        if (hiddenDataItem == null) {
            this.setHiddenDataItem(null);
        } else {
            this.setHiddenDataItem(hiddenDataItem != false ? 1 : 0);
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
    public PSDETreeNodeColDTO ignoreinput(Integer ignoreInput) {
        this.setIgnoreInput(ignoreInput);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO ignoreinput(PSModelEnums.EditItemEnableCond ignoreInput) {
        if (ignoreInput == null) {
            this.setIgnoreInput(null);
        } else {
            this.setIgnoreInput(ignoreInput.value);
        }
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
    public PSDETreeNodeColDTO linkpsdeviewid(String linkPSDEViewId) {
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDETreeNodeColDTO linkpsdeviewname(String linkPSDEViewName) {
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSDETreeNodeColDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDETreeNodeColDTO needcodelistconfig(Integer needCodeListConfig) {
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO needcodelistconfig(Boolean needCodeListConfig) {
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
    public PSDETreeNodeColDTO noprivdm(Integer noPrivDM) {
        this.setNoPrivDM(noPrivDM);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO noprivdm(PSModelEnums.NoPrivDisplayMode noPrivDM) {
        if (noPrivDM == null) {
            this.setNoPrivDM(null);
        } else {
            this.setNoPrivDM(noPrivDM.value);
        }
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
    public PSDETreeNodeColDTO pickuppsdeviewid(String pickupPSDEViewId) {
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO pickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDETreeNodeColDTO pickuppsdeviewname(String pickupPSDEViewName) {
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
    public PSDETreeNodeColDTO placeholder(String placeHolder) {
        this.setPlaceHolder(placeHolder);
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
    public PSDETreeNodeColDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDETreeNodeColDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSDETreeNodeColDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDETreeNodeColDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="psdefuimodeid")
    public void setPSDEFUIModeId(String pSDEFUIModeId) {
        this._set(DTOFIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }

    @JsonIgnore
    public String getPSDEFUIModeId() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public void resetPSDEFUIModeId() {
        this._reset(DTOFIELD_PSDEFUIMODEID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdefuimodeid(String pSDEFUIModeId) {
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdefuimodeid(PSDEFUIModeDTO pSDEFUIMode) {
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
    }

    @JsonIgnore
    public String getPSDEFUIModeName() {
        Object objValue = this._get(DTOFIELD_PSDEFUIMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty() {
        return this._contains(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public void resetPSDEFUIModeName() {
        this._reset(DTOFIELD_PSDEFUIMODENAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdefuimodename(String pSDEFUIModeName) {
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    @JsonProperty(value="psdeteiupdateid")
    public void setPSDETEIUpdateId(String pSDETEIUpdateId) {
        this._set(DTOFIELD_PSDETEIUPDATEID, pSDETEIUpdateId);
    }

    @JsonIgnore
    public String getPSDETEIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDETEIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDETEIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDETEIUpdateId() {
        this._reset(DTOFIELD_PSDETEIUPDATEID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdeteiupdateid(String pSDETEIUpdateId) {
        this.setPSDETEIUpdateId(pSDETEIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdeteiupdateid(PSDETEIUpdateDTO pSDETEIUpdate) {
        if (pSDETEIUpdate == null) {
            this.setPSDETEIUpdateId(null);
            this.setPSDETEIUpdateName(null);
        } else {
            this.setPSDETEIUpdateId(pSDETEIUpdate.getPSDETEIUpdateId());
            this.setPSDETEIUpdateName(pSDETEIUpdate.getPSDETEIUpdateName());
        }
        return this;
    }

    @JsonProperty(value="psdeteiupdatename")
    public void setPSDETEIUpdateName(String pSDETEIUpdateName) {
        this._set(DTOFIELD_PSDETEIUPDATENAME, pSDETEIUpdateName);
    }

    @JsonIgnore
    public String getPSDETEIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDETEIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDETEIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDETEIUpdateName() {
        this._reset(DTOFIELD_PSDETEIUPDATENAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdeteiupdatename(String pSDETEIUpdateName) {
        this.setPSDETEIUpdateName(pSDETEIUpdateName);
        return this;
    }

    @JsonProperty(value="psdetreecolid")
    public void setPSDETreeColId(String pSDETreeColId) {
        this._set(DTOFIELD_PSDETREECOLID, pSDETreeColId);
    }

    @JsonIgnore
    public String getPSDETreeColId() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColIdDirty() {
        return this._contains(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public void resetPSDETreeColId() {
        this._reset(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolid(String pSDETreeColId) {
        this.setPSDETreeColId(pSDETreeColId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolid(PSDETreeColDTO pSDETreeCol) {
        if (pSDETreeCol == null) {
            this.setGridColType(null);
            this.setPSDETreeColId(null);
            this.setPSDETreeColName(null);
        } else {
            this.setGridColType(pSDETreeCol.getGridColType());
            this.setPSDETreeColId(pSDETreeCol.getPSDETreeColId());
            this.setPSDETreeColName(pSDETreeCol.getPSDETreeColName());
        }
        return this;
    }

    @JsonProperty(value="psdetreecolname")
    public void setPSDETreeColName(String pSDETreeColName) {
        this._set(DTOFIELD_PSDETREECOLNAME, pSDETreeColName);
    }

    @JsonIgnore
    public String getPSDETreeColName() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColNameDirty() {
        return this._contains(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public void resetPSDETreeColName() {
        this._reset(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolname(String pSDETreeColName) {
        this.setPSDETreeColName(pSDETreeColName);
        return this;
    }

    @JsonProperty(value="psdetreenodecolid")
    public void setPSDETreeNodeColId(String pSDETreeNodeColId) {
        this._set(DTOFIELD_PSDETREENODECOLID, pSDETreeNodeColId);
    }

    @JsonIgnore
    public String getPSDETreeNodeColId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODECOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeColIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODECOLID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeColId() {
        this._reset(DTOFIELD_PSDETREENODECOLID);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodecolid(String pSDETreeNodeColId) {
        this.setPSDETreeNodeColId(pSDETreeNodeColId);
        return this;
    }

    @JsonProperty(value="psdetreenodecolname")
    public void setPSDETreeNodeColName(String pSDETreeNodeColName) {
        this._set(DTOFIELD_PSDETREENODECOLNAME, pSDETreeNodeColName);
    }

    @JsonIgnore
    public String getPSDETreeNodeColName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODECOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeColNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODECOLNAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeColName() {
        this._reset(DTOFIELD_PSDETREENODECOLNAME);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodecolname(String pSDETreeNodeColName) {
        this.setPSDETreeNodeColName(pSDETreeNodeColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeNodeColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeNodeColName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO name(String strName) {
        this.setPSDETreeNodeColName(strName);
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
    public PSDETreeNodeColDTO psdetreenodeid(String pSDETreeNodeId) {
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodeid(PSDETreeNodeDTO pSDETreeNode) {
        if (pSDETreeNode == null) {
            this.setPSDETreeNodeId(null);
            this.setPSDETreeNodeName(null);
        } else {
            this.setPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
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
    public PSDETreeNodeColDTO psdetreenodename(String pSDETreeNodeName) {
        this.setPSDETreeNodeName(pSDETreeNodeName);
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
    public PSDETreeNodeColDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
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
    public PSDETreeNodeColDTO psdetreeviewname(String pSDETreeViewName) {
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
    public PSDETreeNodeColDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
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
    public PSDETreeNodeColDTO psdeuagroupname(String pSDEUAGroupName) {
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
    public PSDETreeNodeColDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSDETreeNodeColDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
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
    public PSDETreeNodeColDTO pssysdictcatid(String pSSysDictCatId) {
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO pssysdictcatid(PSSysDictCatDTO pSSysDictCat) {
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
    public PSDETreeNodeColDTO pssysdictcatname(String pSSysDictCatName) {
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
    public PSDETreeNodeColDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSDETreeNodeColDTO pssysdynamodelname(String pSSysDynaModelName) {
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
    public PSDETreeNodeColDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
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
    public PSDETreeNodeColDTO pssyseditorstylename(String pSSysEditorStyleName) {
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
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
    public PSDETreeNodeColDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
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
    public PSDETreeNodeColDTO refpsdeacmodename(String refPSDEACModeName) {
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
    public PSDETreeNodeColDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDETreeNodeColDTO refpsdedatasetname(String refPSDEDataSetName) {
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
    public PSDETreeNodeColDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDETreeNodeColDTO refpsdename(String refPSDEName) {
        this.setRefPSDEName(refPSDEName);
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
    public PSDETreeNodeColDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
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
    public PSDETreeNodeColDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeNodeColDTO updatedv(String updateDV) {
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
    public PSDETreeNodeColDTO updatedvt(String updateDVT) {
        this.setUpdateDVT(updateDVT);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO updatedvt(PSModelEnums.UpdateDefaultValueType updateDVT) {
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
    public PSDETreeNodeColDTO updateman(String updateMan) {
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
    public PSDETreeNodeColDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeColDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeNodeColDTO usertag(String userTag) {
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
    public PSDETreeNodeColDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
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
    public PSDETreeNodeColDTO valueformat(String valueFormat) {
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
    public PSDETreeNodeColDTO valueitemname(String valueItemName) {
        this.setValueItemName(valueItemName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeNodeColId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeNodeColId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO id(String strValue) {
        this.setPSDETreeNodeColId(strValue);
        return this;
    }
}
