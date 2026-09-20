package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFUIModeDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLOWEMPTY = "ALLOWEMPTY";
    protected static final String DTOFIELD_ALLOWEMPTY = "allowempty";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CODELISTCONFIGMODE = "CODELISTCONFIGMODE";
    protected static final String DTOFIELD_CODELISTCONFIGMODE = "codelistconfigmode";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONVERTCITEXT = "CONVERTCITEXT";
    protected static final String DTOFIELD_CONVERTCITEXT = "convertcitext";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEDV = "CREATEDV";
    protected static final String DTOFIELD_CREATEDV = "createdv";
    public static final String FIELD_CREATEDVT = "CREATEDVT";
    protected static final String DTOFIELD_CREATEDVT = "createdvt";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EDITORPARAMS = "EDITORPARAMS";
    protected static final String DTOFIELD_EDITORPARAMS = "editorparams";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_ENABLEINPUTTIP = "ENABLEINPUTTIP";
    protected static final String DTOFIELD_ENABLEINPUTTIP = "enableinputtip";
    public static final String FIELD_ENABLERESETITEMNAME = "ENABLERESETITEMNAME";
    protected static final String DTOFIELD_ENABLERESETITEMNAME = "enableresetitemname";
    public static final String FIELD_ENABLEUNITNAME = "ENABLEUNITNAME";
    protected static final String DTOFIELD_ENABLEUNITNAME = "enableunitname";
    public static final String FIELD_ENABLEVALUERULE = "ENABLEVALUERULE";
    protected static final String DTOFIELD_ENABLEVALUERULE = "enablevaluerule";
    public static final String FIELD_FTMODE = "FTMODE";
    protected static final String DTOFIELD_FTMODE = "ftmode";
    public static final String FIELD_GCRPSSYSPFPLUGINID = "GCRPSSYSPFPLUGINID";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";
    public static final String FIELD_GCRPSSYSPFPLUGINNAME = "GCRPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";
    public static final String FIELD_GRIDCOLALIGN = "GRIDCOLALIGN";
    protected static final String DTOFIELD_GRIDCOLALIGN = "gridcolalign";
    public static final String FIELD_GRIDCOLCLMODE = "GRIDCOLCLMODE";
    protected static final String DTOFIELD_GRIDCOLCLMODE = "gridcolclmode";
    public static final String FIELD_GRIDCOLWIDTH = "GRIDCOLWIDTH";
    protected static final String DTOFIELD_GRIDCOLWIDTH = "gridcolwidth";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_IGNOREINPUT = "IGNOREINPUT";
    protected static final String DTOFIELD_IGNOREINPUT = "ignoreinput";
    public static final String FIELD_ITEMPSACHANDLERID = "ITEMPSACHANDLERID";
    protected static final String DTOFIELD_ITEMPSACHANDLERID = "itempsachandlerid";
    public static final String FIELD_JSFORMAT = "JSFORMAT";
    protected static final String DTOFIELD_JSFORMAT = "jsformat";
    public static final String FIELD_MAXVALUE = "MAXVALUE";
    protected static final String DTOFIELD_MAXVALUE = "maxvalue";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINSTRLENGTH = "MINSTRLENGTH";
    protected static final String DTOFIELD_MINSTRLENGTH = "minstrlength";
    public static final String FIELD_MINVALUE = "MINVALUE";
    protected static final String DTOFIELD_MINVALUE = "minvalue";
    public static final String FIELD_NEEDCODELISTCONFIG = "NEEDCODELISTCONFIG";
    protected static final String DTOFIELD_NEEDCODELISTCONFIG = "needcodelistconfig";
    public static final String FIELD_NOSORT = "NOSORT";
    protected static final String DTOFIELD_NOSORT = "nosort";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PICKUPTEXTOPTS = "PICKUPTEXTOPTS";
    protected static final String DTOFIELD_PICKUPTEXTOPTS = "pickuptextopts";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDEFUIMODEID = "PSDEFFORMITEMID";
    protected static final String DTOFIELD_PSDEFUIMODEID = "psdefuimodeid";
    public static final String FIELD_PSDEFUIMODENAME = "PSDEFFORMITEMNAME";
    protected static final String DTOFIELD_PSDEFUIMODENAME = "psdefuimodename";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFINPUTTIPID = "PSDEFINPUTTIPID";
    protected static final String DTOFIELD_PSDEFINPUTTIPID = "psdefinputtipid";
    public static final String FIELD_PSDEFINPUTTIPNAME = "PSDEFINPUTTIPNAME";
    protected static final String DTOFIELD_PSDEFINPUTTIPNAME = "psdefinputtipname";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSDICTCATID = "PSSYSDICTCATID";
    protected static final String DTOFIELD_PSSYSDICTCATID = "pssysdictcatid";
    public static final String FIELD_PSSYSDICTCATNAME = "PSSYSDICTCATNAME";
    protected static final String DTOFIELD_PSSYSDICTCATNAME = "pssysdictcatname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_PSSYSUNITID = "PSSYSUNITID";
    protected static final String DTOFIELD_PSSYSUNITID = "pssysunitid";
    public static final String FIELD_PSSYSUNITNAME = "PSSYSUNITNAME";
    protected static final String DTOFIELD_PSSYSUNITNAME = "pssysunitname";
    public static final String FIELD_REFADPSDELOGICID = "REFADPSDELOGICID";
    protected static final String DTOFIELD_REFADPSDELOGICID = "refadpsdelogicid";
    public static final String FIELD_REFADPSDELOGICNAME = "REFADPSDELOGICNAME";
    protected static final String DTOFIELD_REFADPSDELOGICNAME = "refadpsdelogicname";
    public static final String FIELD_REFLINKPSDEVIEWID = "REFLINKPSDEVIEWID";
    protected static final String DTOFIELD_REFLINKPSDEVIEWID = "reflinkpsdeviewid";
    public static final String FIELD_REFLINKPSDEVIEWNAME = "REFLINKPSDEVIEWNAME";
    protected static final String DTOFIELD_REFLINKPSDEVIEWNAME = "reflinkpsdeviewname";
    public static final String FIELD_REFMPICKUPPSDEVIEWID = "REFMPICKUPPSDEVIEWID";
    protected static final String DTOFIELD_REFMPICKUPPSDEVIEWID = "refmpickuppsdeviewid";
    public static final String FIELD_REFMPICKUPPSDEVIEWNAME = "REFMPICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_REFMPICKUPPSDEVIEWNAME = "refmpickuppsdeviewname";
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
    public static final String FIELD_REFPSDERID = "REFPSDERID";
    protected static final String DTOFIELD_REFPSDERID = "refpsderid";
    public static final String FIELD_REFPSDERNAME = "REFPSDERNAME";
    protected static final String DTOFIELD_REFPSDERNAME = "refpsdername";
    public static final String FIELD_REFTEMPDATA = "REFTEMPDATA";
    protected static final String DTOFIELD_REFTEMPDATA = "reftempdata";
    public static final String FIELD_RESETITEMNAME = "RESETITEMNAME";
    protected static final String DTOFIELD_RESETITEMNAME = "resetitemname";
    public static final String FIELD_STRINGCASE = "STRINGCASE";
    protected static final String DTOFIELD_STRINGCASE = "stringcase";
    public static final String FIELD_STRLENGTH = "STRLENGTH";
    protected static final String DTOFIELD_STRLENGTH = "strlength";
    public static final String FIELD_UNITNAME = "UNITNAME";
    protected static final String DTOFIELD_UNITNAME = "unitname";
    public static final String FIELD_UNITNAMEWIDTH = "UNITNAMEWIDTH";
    protected static final String DTOFIELD_UNITNAMEWIDTH = "unitnamewidth";
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
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUEITEMNAME = "VALUEITEMNAME";
    protected static final String DTOFIELD_VALUEITEMNAME = "valueitemname";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

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
    public PSDEFUIModeDTO allowempty(Integer allowEmpty) {
        this.setAllowEmpty(allowEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO allowempty(Boolean allowEmpty) {
        if (allowEmpty == null) {
            this.setAllowEmpty(null);
        } else {
            this.setAllowEmpty(allowEmpty != false ? 1 : 0);
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
    public PSDEFUIModeDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFUIModeDTO cappslanresname(String capPSLanResName) {
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
    public PSDEFUIModeDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEFUIModeDTO codelistconfigmode(Integer codeListConfigMode) {
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO codelistconfigmode(PSModelEnums.OutputCodeListMode codeListConfigMode) {
        if (codeListConfigMode == null) {
            this.setCodeListConfigMode(null);
        } else {
            this.setCodeListConfigMode(codeListConfigMode.value);
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
    public PSDEFUIModeDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEFUIModeDTO convertcitext(Integer convertCIText) {
        this.setConvertCIText(convertCIText);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO convertcitext(Boolean convertCIText) {
        if (convertCIText == null) {
            this.setConvertCIText(null);
        } else {
            this.setConvertCIText(convertCIText != false ? 1 : 0);
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
    public PSDEFUIModeDTO createdate(Timestamp createDate) {
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
    public PSDEFUIModeDTO createdv(String createDV) {
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
    public PSDEFUIModeDTO createdvt(String createDVT) {
        this.setCreateDVT(createDVT);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO createdvt(PSModelEnums.CreateDefaultValueType createDVT) {
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
    public PSDEFUIModeDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEFUIModeDTO editorparams(String editorParams) {
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
    public PSDEFUIModeDTO editortype(String editorType) {
        this.setEditorType(editorType);
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
    public PSDEFUIModeDTO enableinputtip(Integer enableInputTip) {
        this.setEnableInputTip(enableInputTip);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO enableinputtip(Boolean enableInputTip) {
        if (enableInputTip == null) {
            this.setEnableInputTip(null);
        } else {
            this.setEnableInputTip(enableInputTip != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableresetitemname")
    public void setEnableResetItemName(Integer enableResetItemName) {
        this._set(DTOFIELD_ENABLERESETITEMNAME, enableResetItemName);
    }

    @JsonIgnore
    public Integer getEnableResetItemName() {
        Object objValue = this._get(DTOFIELD_ENABLERESETITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableResetItemNameDirty() {
        return this._contains(DTOFIELD_ENABLERESETITEMNAME);
    }

    @JsonIgnore
    public void resetEnableResetItemName() {
        this._reset(DTOFIELD_ENABLERESETITEMNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO enableresetitemname(Integer enableResetItemName) {
        this.setEnableResetItemName(enableResetItemName);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO enableresetitemname(Boolean enableResetItemName) {
        if (enableResetItemName == null) {
            this.setEnableResetItemName(null);
        } else {
            this.setEnableResetItemName(enableResetItemName != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableunitname")
    public void setEnableUnitName(Integer enableUnitName) {
        this._set(DTOFIELD_ENABLEUNITNAME, enableUnitName);
    }

    @JsonIgnore
    public Integer getEnableUnitName() {
        Object objValue = this._get(DTOFIELD_ENABLEUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUnitNameDirty() {
        return this._contains(DTOFIELD_ENABLEUNITNAME);
    }

    @JsonIgnore
    public void resetEnableUnitName() {
        this._reset(DTOFIELD_ENABLEUNITNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO enableunitname(Integer enableUnitName) {
        this.setEnableUnitName(enableUnitName);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO enableunitname(Boolean enableUnitName) {
        if (enableUnitName == null) {
            this.setEnableUnitName(null);
        } else {
            this.setEnableUnitName(enableUnitName != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablevaluerule")
    public void setEnableValueRule(Integer enableValueRule) {
        this._set(DTOFIELD_ENABLEVALUERULE, enableValueRule);
    }

    @JsonIgnore
    public Integer getEnableValueRule() {
        Object objValue = this._get(DTOFIELD_ENABLEVALUERULE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableValueRuleDirty() {
        return this._contains(DTOFIELD_ENABLEVALUERULE);
    }

    @JsonIgnore
    public void resetEnableValueRule() {
        this._reset(DTOFIELD_ENABLEVALUERULE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO enablevaluerule(Integer enableValueRule) {
        this.setEnableValueRule(enableValueRule);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO enablevaluerule(Boolean enableValueRule) {
        if (enableValueRule == null) {
            this.setEnableValueRule(null);
        } else {
            this.setEnableValueRule(enableValueRule != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ftmode")
    public void setFTMode(String fTMode) {
        this._set(DTOFIELD_FTMODE, fTMode);
    }

    @JsonIgnore
    public String getFTMode() {
        Object objValue = this._get(DTOFIELD_FTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFTModeDirty() {
        return this._contains(DTOFIELD_FTMODE);
    }

    @JsonIgnore
    public void resetFTMode() {
        this._reset(DTOFIELD_FTMODE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO ftmode(String fTMode) {
        this.setFTMode(fTMode);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO ftmode(PSModelEnums.DEFUIMode fTMode) {
        if (fTMode == null) {
            this.setFTMode(null);
        } else {
            this.setFTMode(fTMode.value);
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
    public PSDEFUIModeDTO gcrpssyspfpluginid(String gCRPSSysPFPluginId) {
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO gcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEFUIModeDTO gcrpssyspfpluginname(String gCRPSSysPFPluginName) {
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="gridcolalign")
    public void setGridColAlign(String gridColAlign) {
        this._set(DTOFIELD_GRIDCOLALIGN, gridColAlign);
    }

    @JsonIgnore
    public String getGridColAlign() {
        Object objValue = this._get(DTOFIELD_GRIDCOLALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColAlignDirty() {
        return this._contains(DTOFIELD_GRIDCOLALIGN);
    }

    @JsonIgnore
    public void resetGridColAlign() {
        this._reset(DTOFIELD_GRIDCOLALIGN);
    }

    @JsonIgnore
    public PSDEFUIModeDTO gridcolalign(String gridColAlign) {
        this.setGridColAlign(gridColAlign);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO gridcolalign(PSModelEnums.GridColAlign gridColAlign) {
        if (gridColAlign == null) {
            this.setGridColAlign(null);
        } else {
            this.setGridColAlign(gridColAlign.value);
        }
        return this;
    }

    @JsonProperty(value="gridcolclmode")
    public void setGridColCLMode(String gridColCLMode) {
        this._set(DTOFIELD_GRIDCOLCLMODE, gridColCLMode);
    }

    @JsonIgnore
    public String getGridColCLMode() {
        Object objValue = this._get(DTOFIELD_GRIDCOLCLMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGridColCLModeDirty() {
        return this._contains(DTOFIELD_GRIDCOLCLMODE);
    }

    @JsonIgnore
    public void resetGridColCLMode() {
        this._reset(DTOFIELD_GRIDCOLCLMODE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO gridcolclmode(String gridColCLMode) {
        this.setGridColCLMode(gridColCLMode);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO gridcolclmode(PSModelEnums.CodeListConvertMode gridColCLMode) {
        if (gridColCLMode == null) {
            this.setGridColCLMode(null);
        } else {
            this.setGridColCLMode(gridColCLMode.value);
        }
        return this;
    }

    @JsonProperty(value="gridcolwidth")
    public void setGridColWidth(Integer gridColWidth) {
        this._set(DTOFIELD_GRIDCOLWIDTH, gridColWidth);
    }

    @JsonIgnore
    public Integer getGridColWidth() {
        Object objValue = this._get(DTOFIELD_GRIDCOLWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGridColWidthDirty() {
        return this._contains(DTOFIELD_GRIDCOLWIDTH);
    }

    @JsonIgnore
    public void resetGridColWidth() {
        this._reset(DTOFIELD_GRIDCOLWIDTH);
    }

    @JsonIgnore
    public PSDEFUIModeDTO gridcolwidth(Integer gridColWidth) {
        this.setGridColWidth(gridColWidth);
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
    public PSDEFUIModeDTO height(Integer height) {
        this.setHeight(height);
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
    public PSDEFUIModeDTO ignoreinput(Integer ignoreInput) {
        this.setIgnoreInput(ignoreInput);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO ignoreinput(PSModelEnums.EditItemIgnoreMode ignoreInput) {
        if (ignoreInput == null) {
            this.setIgnoreInput(null);
        } else {
            this.setIgnoreInput(ignoreInput.value);
        }
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
    public PSDEFUIModeDTO itempsachandlerid(String itemPSACHandlerId) {
        this.setItemPSACHandlerId(itemPSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO itempsachandlerid(PSACHandlerDTO pSACHandler) {
        if (pSACHandler == null) {
            this.setItemPSACHandlerId(null);
        } else {
            this.setItemPSACHandlerId(pSACHandler.getPSACHandlerId());
        }
        return this;
    }

    @JsonProperty(value="jsformat")
    public void setJSFormat(String jSFormat) {
        this._set(DTOFIELD_JSFORMAT, jSFormat);
    }

    @JsonIgnore
    public String getJSFormat() {
        Object objValue = this._get(DTOFIELD_JSFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJSFormatDirty() {
        return this._contains(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public void resetJSFormat() {
        this._reset(DTOFIELD_JSFORMAT);
    }

    @JsonIgnore
    public PSDEFUIModeDTO jsformat(String jSFormat) {
        this.setJSFormat(jSFormat);
        return this;
    }

    @JsonProperty(value="maxvalue")
    public void setMaxValue(String maxValue) {
        this._set(DTOFIELD_MAXVALUE, maxValue);
    }

    @JsonIgnore
    public String getMaxValue() {
        Object objValue = this._get(DTOFIELD_MAXVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMaxValueDirty() {
        return this._contains(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public void resetMaxValue() {
        this._reset(DTOFIELD_MAXVALUE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO maxvalue(String maxValue) {
        this.setMaxValue(maxValue);
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
    public PSDEFUIModeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minstrlength")
    public void setMinStrLength(Integer minStrLength) {
        this._set(DTOFIELD_MINSTRLENGTH, minStrLength);
    }

    @JsonIgnore
    public Integer getMinStrLength() {
        Object objValue = this._get(DTOFIELD_MINSTRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMinStrLengthDirty() {
        return this._contains(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public void resetMinStrLength() {
        this._reset(DTOFIELD_MINSTRLENGTH);
    }

    @JsonIgnore
    public PSDEFUIModeDTO minstrlength(Integer minStrLength) {
        this.setMinStrLength(minStrLength);
        return this;
    }

    @JsonProperty(value="minvalue")
    public void setMinValue(String minValue) {
        this._set(DTOFIELD_MINVALUE, minValue);
    }

    @JsonIgnore
    public String getMinValue() {
        Object objValue = this._get(DTOFIELD_MINVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinValueDirty() {
        return this._contains(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public void resetMinValue() {
        this._reset(DTOFIELD_MINVALUE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO minvalue(String minValue) {
        this.setMinValue(minValue);
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
    public PSDEFUIModeDTO needcodelistconfig(Integer needCodeListConfig) {
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO needcodelistconfig(Boolean needCodeListConfig) {
        if (needCodeListConfig == null) {
            this.setNeedCodeListConfig(null);
        } else {
            this.setNeedCodeListConfig(needCodeListConfig != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="nosort")
    public void setNoSort(Integer noSort) {
        this._set(DTOFIELD_NOSORT, noSort);
    }

    @JsonIgnore
    public Integer getNoSort() {
        Object objValue = this._get(DTOFIELD_NOSORT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoSortDirty() {
        return this._contains(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public void resetNoSort() {
        this._reset(DTOFIELD_NOSORT);
    }

    @JsonIgnore
    public PSDEFUIModeDTO nosort(Integer noSort) {
        this.setNoSort(noSort);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO nosort(Boolean noSort) {
        if (noSort == null) {
            this.setNoSort(null);
        } else {
            this.setNoSort(noSort != false ? 1 : 0);
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
    public PSDEFUIModeDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFUIModeDTO phpslanresname(String pHPSLanResName) {
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    @JsonProperty(value="pickuptextopts")
    public void setPickupTextOpts(Integer pickupTextOpts) {
        this._set(DTOFIELD_PICKUPTEXTOPTS, pickupTextOpts);
    }

    @JsonIgnore
    public Integer getPickupTextOpts() {
        Object objValue = this._get(DTOFIELD_PICKUPTEXTOPTS);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPickupTextOptsDirty() {
        return this._contains(DTOFIELD_PICKUPTEXTOPTS);
    }

    @JsonIgnore
    public void resetPickupTextOpts() {
        this._reset(DTOFIELD_PICKUPTEXTOPTS);
    }

    @JsonIgnore
    public PSDEFUIModeDTO pickuptextopts(Integer pickupTextOpts) {
        this.setPickupTextOpts(pickupTextOpts);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pickuptextopts(PSModelEnums.FieldUIPickupTextOpt[] pickupTextOpts) {
        if (pickupTextOpts == null || pickupTextOpts.length == 0) {
            this.setPickupTextOpts(null);
        } else {
            int _value = 0;
            for (PSModelEnums.FieldUIPickupTextOpt _item : pickupTextOpts) {
                _value |= _item.value;
            }
            this.setPickupTextOpts(_value);
        }
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
    public PSDEFUIModeDTO placeholder(String placeHolder) {
        this.setPlaceHolder(placeHolder);
        return this;
    }

    @JsonProperty(value="precision")
    public void setPrecision(Integer precision) {
        this._set(DTOFIELD_PRECISION, precision);
        this._set(FIELD_PRECISION, precision);
    }

    @JsonIgnore
    public Integer getPrecision() {
        Object objValue = this._get(DTOFIELD_PRECISION);
        if (objValue == null && (objValue = this._get(FIELD_PRECISION)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        if (this._contains(DTOFIELD_PRECISION)) {
            return true;
        }
        return this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSDEFUIModeDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2() {
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated
    public void setPrecision2(Integer precision2) {
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty() {
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2() {
        this.resetPrecision();
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
    public PSDEFUIModeDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEFUIModeDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
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
    public PSDEFUIModeDTO psdefuimodeid(String pSDEFUIModeId) {
        this.setPSDEFUIModeId(pSDEFUIModeId);
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
    public PSDEFUIModeDTO psdefuimodename(String pSDEFUIModeName) {
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFUIModeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFUIModeName(strName);
    }

    @JsonIgnore
    public PSDEFUIModeDTO name(String strName) {
        this.setPSDEFUIModeName(strName);
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
    public PSDEFUIModeDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
            this.setPSDEName(pSDEField.getPSDEName());
        }
        return this;
    }

    @JsonProperty(value="psdefinputtipid")
    public void setPSDEFInputTipId(String pSDEFInputTipId) {
        this._set(DTOFIELD_PSDEFINPUTTIPID, pSDEFInputTipId);
    }

    @JsonIgnore
    public String getPSDEFInputTipId() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipIdDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPID);
    }

    @JsonIgnore
    public void resetPSDEFInputTipId() {
        this._reset(DTOFIELD_PSDEFINPUTTIPID);
    }

    @JsonIgnore
    public PSDEFUIModeDTO psdefinputtipid(String pSDEFInputTipId) {
        this.setPSDEFInputTipId(pSDEFInputTipId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO psdefinputtipid(PSDEFInputTipDTO pSDEFInputTip) {
        if (pSDEFInputTip == null) {
            this.setPSDEFInputTipId(null);
            this.setPSDEFInputTipName(null);
        } else {
            this.setPSDEFInputTipId(pSDEFInputTip.getPSDEFInputTipId());
            this.setPSDEFInputTipName(pSDEFInputTip.getPSDEFInputTipName());
        }
        return this;
    }

    @JsonProperty(value="psdefinputtipname")
    public void setPSDEFInputTipName(String pSDEFInputTipName) {
        this._set(DTOFIELD_PSDEFINPUTTIPNAME, pSDEFInputTipName);
    }

    @JsonIgnore
    public String getPSDEFInputTipName() {
        Object objValue = this._get(DTOFIELD_PSDEFINPUTTIPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFInputTipNameDirty() {
        return this._contains(DTOFIELD_PSDEFINPUTTIPNAME);
    }

    @JsonIgnore
    public void resetPSDEFInputTipName() {
        this._reset(DTOFIELD_PSDEFINPUTTIPNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO psdefinputtipname(String pSDEFInputTipName) {
        this.setPSDEFInputTipName(pSDEFInputTipName);
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
    public PSDEFUIModeDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSDEFUIModeDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEFUIModeDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDEFUIModeDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSDEFUIModeDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
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
    public PSDEFUIModeDTO pssysdictcatid(String pSSysDictCatId) {
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysdictcatid(PSSysDictCatDTO pSSysDictCat) {
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
    public PSDEFUIModeDTO pssysdictcatname(String pSSysDictCatName) {
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDEFUIModeDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
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
    public PSDEFUIModeDTO pssyseditorstylename(String pSSysEditorStyleName) {
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
    public PSDEFUIModeDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEFUIModeDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="pssysunitid")
    public void setPSSysUnitId(String pSSysUnitId) {
        this._set(DTOFIELD_PSSYSUNITID, pSSysUnitId);
    }

    @JsonIgnore
    public String getPSSysUnitId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public void resetPSSysUnitId() {
        this._reset(DTOFIELD_PSSYSUNITID);
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysunitid(String pSSysUnitId) {
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysunitid(PSSysUnitDTO pSSysUnit) {
        if (pSSysUnit == null) {
            this.setPSSysUnitId(null);
            this.setPSSysUnitName(null);
        } else {
            this.setPSSysUnitId(pSSysUnit.getPSSysUnitId());
            this.setPSSysUnitName(pSSysUnit.getPSSysUnitName());
        }
        return this;
    }

    @JsonProperty(value="pssysunitname")
    public void setPSSysUnitName(String pSSysUnitName) {
        this._set(DTOFIELD_PSSYSUNITNAME, pSSysUnitName);
    }

    @JsonIgnore
    public String getPSSysUnitName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUnitNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public void resetPSSysUnitName() {
        this._reset(DTOFIELD_PSSYSUNITNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO pssysunitname(String pSSysUnitName) {
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    @JsonProperty(value="refadpsdelogicid")
    public void setRefADPSDELogicId(String refADPSDELogicId) {
        this._set(DTOFIELD_REFADPSDELOGICID, refADPSDELogicId);
    }

    @JsonIgnore
    public String getRefADPSDELogicId() {
        Object objValue = this._get(DTOFIELD_REFADPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefADPSDELogicIdDirty() {
        return this._contains(DTOFIELD_REFADPSDELOGICID);
    }

    @JsonIgnore
    public void resetRefADPSDELogicId() {
        this._reset(DTOFIELD_REFADPSDELOGICID);
    }

    @JsonIgnore
    public PSDEFUIModeDTO refadpsdelogicid(String refADPSDELogicId) {
        this.setRefADPSDELogicId(refADPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refadpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setRefADPSDELogicId(null);
            this.setRefADPSDELogicName(null);
        } else {
            this.setRefADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setRefADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="refadpsdelogicname")
    public void setRefADPSDELogicName(String refADPSDELogicName) {
        this._set(DTOFIELD_REFADPSDELOGICNAME, refADPSDELogicName);
    }

    @JsonIgnore
    public String getRefADPSDELogicName() {
        Object objValue = this._get(DTOFIELD_REFADPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefADPSDELogicNameDirty() {
        return this._contains(DTOFIELD_REFADPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetRefADPSDELogicName() {
        this._reset(DTOFIELD_REFADPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO refadpsdelogicname(String refADPSDELogicName) {
        this.setRefADPSDELogicName(refADPSDELogicName);
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
    public PSDEFUIModeDTO reflinkpsdeviewid(String refLinkPSDEViewId) {
        this.setRefLinkPSDEViewId(refLinkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO reflinkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEFUIModeDTO reflinkpsdeviewname(String refLinkPSDEViewName) {
        this.setRefLinkPSDEViewName(refLinkPSDEViewName);
        return this;
    }

    @JsonProperty(value="refmpickuppsdeviewid")
    public void setRefMPickupPSDEViewId(String refMPickupPSDEViewId) {
        this._set(DTOFIELD_REFMPICKUPPSDEVIEWID, refMPickupPSDEViewId);
    }

    @JsonIgnore
    public String getRefMPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_REFMPICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_REFMPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetRefMPickupPSDEViewId() {
        this._reset(DTOFIELD_REFMPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEFUIModeDTO refmpickuppsdeviewid(String refMPickupPSDEViewId) {
        this.setRefMPickupPSDEViewId(refMPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refmpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setRefMPickupPSDEViewId(null);
            this.setRefMPickupPSDEViewName(null);
        } else {
            this.setRefMPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="refmpickuppsdeviewname")
    public void setRefMPickupPSDEViewName(String refMPickupPSDEViewName) {
        this._set(DTOFIELD_REFMPICKUPPSDEVIEWNAME, refMPickupPSDEViewName);
    }

    @JsonIgnore
    public String getRefMPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_REFMPICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_REFMPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetRefMPickupPSDEViewName() {
        this._reset(DTOFIELD_REFMPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO refmpickuppsdeviewname(String refMPickupPSDEViewName) {
        this.setRefMPickupPSDEViewName(refMPickupPSDEViewName);
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
    public PSDEFUIModeDTO refpickuppsdeviewid(String refPickupPSDEViewId) {
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEFUIModeDTO refpickuppsdeviewname(String refPickupPSDEViewName) {
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
    public PSDEFUIModeDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
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
    public PSDEFUIModeDTO refpsdeacmodename(String refPSDEACModeName) {
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
    public PSDEFUIModeDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEFUIModeDTO refpsdedatasetname(String refPSDEDataSetName) {
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
    public PSDEFUIModeDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFUIModeDTO refpsdename(String refPSDEName) {
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
    public PSDEFUIModeDTO refpsderid(String refPSDERId) {
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO refpsderid(PSDERDTO pSDER) {
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
    public PSDEFUIModeDTO refpsdername(String refPSDERName) {
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    @JsonProperty(value="reftempdata")
    public void setRefTempData(Integer refTempData) {
        this._set(DTOFIELD_REFTEMPDATA, refTempData);
    }

    @JsonIgnore
    public Integer getRefTempData() {
        Object objValue = this._get(DTOFIELD_REFTEMPDATA);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefTempDataDirty() {
        return this._contains(DTOFIELD_REFTEMPDATA);
    }

    @JsonIgnore
    public void resetRefTempData() {
        this._reset(DTOFIELD_REFTEMPDATA);
    }

    @JsonIgnore
    public PSDEFUIModeDTO reftempdata(Integer refTempData) {
        this.setRefTempData(refTempData);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO reftempdata(Boolean refTempData) {
        if (refTempData == null) {
            this.setRefTempData(null);
        } else {
            this.setRefTempData(refTempData != false ? 1 : 0);
        }
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
    public PSDEFUIModeDTO resetitemname(String resetItemName) {
        this.setResetItemName(resetItemName);
        return this;
    }

    @JsonProperty(value="stringcase")
    public void setStringCase(String stringCase) {
        this._set(DTOFIELD_STRINGCASE, stringCase);
    }

    @JsonIgnore
    public String getStringCase() {
        Object objValue = this._get(DTOFIELD_STRINGCASE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStringCaseDirty() {
        return this._contains(DTOFIELD_STRINGCASE);
    }

    @JsonIgnore
    public void resetStringCase() {
        this._reset(DTOFIELD_STRINGCASE);
    }

    @JsonIgnore
    public PSDEFUIModeDTO stringcase(String stringCase) {
        this.setStringCase(stringCase);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO stringcase(PSModelEnums.StringCaseMode stringCase) {
        if (stringCase == null) {
            this.setStringCase(null);
        } else {
            this.setStringCase(stringCase.value);
        }
        return this;
    }

    @JsonProperty(value="strlength")
    public void setStrLength(Integer strLength) {
        this._set(DTOFIELD_STRLENGTH, strLength);
    }

    @JsonIgnore
    public Integer getStrLength() {
        Object objValue = this._get(DTOFIELD_STRLENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStrLengthDirty() {
        return this._contains(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public void resetStrLength() {
        this._reset(DTOFIELD_STRLENGTH);
    }

    @JsonIgnore
    public PSDEFUIModeDTO strlength(Integer strLength) {
        this.setStrLength(strLength);
        return this;
    }

    @JsonProperty(value="unitname")
    public void setUnitName(String unitName) {
        this._set(DTOFIELD_UNITNAME, unitName);
    }

    @JsonIgnore
    public String getUnitName() {
        Object objValue = this._get(DTOFIELD_UNITNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUnitNameDirty() {
        return this._contains(DTOFIELD_UNITNAME);
    }

    @JsonIgnore
    public void resetUnitName() {
        this._reset(DTOFIELD_UNITNAME);
    }

    @JsonIgnore
    public PSDEFUIModeDTO unitname(String unitName) {
        this.setUnitName(unitName);
        return this;
    }

    @JsonProperty(value="unitnamewidth")
    public void setUnitNameWidth(Integer unitNameWidth) {
        this._set(DTOFIELD_UNITNAMEWIDTH, unitNameWidth);
    }

    @JsonIgnore
    public Integer getUnitNameWidth() {
        Object objValue = this._get(DTOFIELD_UNITNAMEWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUnitNameWidthDirty() {
        return this._contains(DTOFIELD_UNITNAMEWIDTH);
    }

    @JsonIgnore
    public void resetUnitNameWidth() {
        this._reset(DTOFIELD_UNITNAMEWIDTH);
    }

    @JsonIgnore
    public PSDEFUIModeDTO unitnamewidth(Integer unitNameWidth) {
        this.setUnitNameWidth(unitNameWidth);
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
    public PSDEFUIModeDTO updatedate(Timestamp updateDate) {
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
    public PSDEFUIModeDTO updatedv(String updateDV) {
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
    public PSDEFUIModeDTO updatedvt(String updateDVT) {
        this.setUpdateDVT(updateDVT);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO updatedvt(PSModelEnums.UpdateDefaultValueType updateDVT) {
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
    public PSDEFUIModeDTO updateman(String updateMan) {
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
    public PSDEFUIModeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFUIModeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFUIModeDTO userparams(String userParams) {
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
    public PSDEFUIModeDTO usertag(String userTag) {
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
    public PSDEFUIModeDTO usertag2(String userTag2) {
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
    public PSDEFUIModeDTO usertag3(String userTag3) {
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
    public PSDEFUIModeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
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
    public PSDEFUIModeDTO valueformat(String valueFormat) {
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
    public PSDEFUIModeDTO valueitemname(String valueItemName) {
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
    public PSDEFUIModeDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFUIModeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFUIModeId(strValue);
    }

    @JsonIgnore
    public PSDEFUIModeDTO id(String strValue) {
        this.setPSDEFUIModeId(strValue);
        return this;
    }
}
