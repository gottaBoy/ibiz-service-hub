package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFSFItemDTO
extends PSModelDTOBase {
    public static final String FIELD_ARRAYFLAG = "ARRAYFLAG";
    protected static final String DTOFIELD_ARRAYFLAG = "arrayflag";
    public static final String FIELD_CAPPSLANRESID = "CAPPSLANRESID";
    protected static final String DTOFIELD_CAPPSLANRESID = "cappslanresid";
    public static final String FIELD_CAPPSLANRESNAME = "CAPPSLANRESNAME";
    protected static final String DTOFIELD_CAPPSLANRESNAME = "cappslanresname";
    public static final String FIELD_CAPTION = "CAPTION";
    protected static final String DTOFIELD_CAPTION = "caption";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DSTPSDEFID = "DSTPSDEFID";
    protected static final String DTOFIELD_DSTPSDEFID = "dstpsdefid";
    public static final String FIELD_DSTPSDEFSFITEMID = "DSTPSDEFSFITEMID";
    protected static final String DTOFIELD_DSTPSDEFSFITEMID = "dstpsdefsfitemid";
    public static final String FIELD_DSTPSDEFSFITEMNAME = "DSTPSDEFSFITEMNAME";
    protected static final String DTOFIELD_DSTPSDEFSFITEMNAME = "dstpsdefsfitemname";
    public static final String FIELD_DSTPSDEID = "DSTPSDEID";
    protected static final String DTOFIELD_DSTPSDEID = "dstpsdeid";
    public static final String FIELD_EDITORTYPE = "EDITORTYPE";
    protected static final String DTOFIELD_EDITORTYPE = "editortype";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_ITEMTAG = "ITEMTAG";
    protected static final String DTOFIELD_ITEMTAG = "itemtag";
    public static final String FIELD_ITEMTAG2 = "ITEMTAG2";
    protected static final String DTOFIELD_ITEMTAG2 = "itemtag2";
    public static final String FIELD_JSONFORMAT = "JSONFORMAT";
    protected static final String DTOFIELD_JSONFORMAT = "jsonformat";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_O2MPSDERID = "O2MPSDERID";
    protected static final String DTOFIELD_O2MPSDERID = "o2mpsderid";
    public static final String FIELD_O2OPSDERID = "O2OPSDERID";
    protected static final String DTOFIELD_O2OPSDERID = "o2opsderid";
    public static final String FIELD_PHPSLANRESID = "PHPSLANRESID";
    protected static final String DTOFIELD_PHPSLANRESID = "phpslanresid";
    public static final String FIELD_PHPSLANRESNAME = "PHPSLANRESNAME";
    protected static final String DTOFIELD_PHPSLANRESNAME = "phpslanresname";
    public static final String FIELD_PLACEHOLDER = "PLACEHOLDER";
    protected static final String DTOFIELD_PLACEHOLDER = "placeholder";
    public static final String FIELD_PSCODELISTID = "PSCODELISTID";
    protected static final String DTOFIELD_PSCODELISTID = "pscodelistid";
    public static final String FIELD_PSCODELISTNAME = "PSCODELISTNAME";
    protected static final String DTOFIELD_PSCODELISTNAME = "pscodelistname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEFSFITEMID = "PSDEFSFITEMID";
    protected static final String DTOFIELD_PSDEFSFITEMID = "psdefsfitemid";
    public static final String FIELD_PSDEFSFITEMNAME = "PSDEFSFITEMNAME";
    protected static final String DTOFIELD_PSDEFSFITEMNAME = "psdefsfitemname";
    public static final String FIELD_PSDEFVALUERULEID = "PSDEFVALUERULEID";
    protected static final String DTOFIELD_PSDEFVALUERULEID = "psdefvalueruleid";
    public static final String FIELD_PSDEFVALUERULENAME = "PSDEFVALUERULENAME";
    protected static final String DTOFIELD_PSDEFVALUERULENAME = "psdefvaluerulename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSDBVFID = "PSSYSDBVFID";
    protected static final String DTOFIELD_PSSYSDBVFID = "pssysdbvfid";
    public static final String FIELD_PSSYSDBVFNAME = "PSSYSDBVFNAME";
    protected static final String DTOFIELD_PSSYSDBVFNAME = "pssysdbvfname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
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
    public static final String FIELD_REFADPSDELOGICID = "REFADPSDELOGICID";
    protected static final String DTOFIELD_REFADPSDELOGICID = "refadpsdelogicid";
    public static final String FIELD_REFADPSDELOGICNAME = "REFADPSDELOGICNAME";
    protected static final String DTOFIELD_REFADPSDELOGICNAME = "refadpsdelogicname";
    public static final String FIELD_REFMOBMPICKUPPSDEVIEWID = "REFMOBMPICKUPPSDEVIEWID";
    protected static final String DTOFIELD_REFMOBMPICKUPPSDEVIEWID = "refmobmpickuppsdeviewid";
    public static final String FIELD_REFMOBMPICKUPPSDEVIEWNAME = "REFMOBMPICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_REFMOBMPICKUPPSDEVIEWNAME = "refmobmpickuppsdeviewname";
    public static final String FIELD_REFMOBPICKUPPSDEVIEWID = "REFMOBPICKUPPSDEVIEWID";
    protected static final String DTOFIELD_REFMOBPICKUPPSDEVIEWID = "refmobpickuppsdeviewid";
    public static final String FIELD_REFMOBPICKUPPSDEVIEWNAME = "REFMOBPICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_REFMOBPICKUPPSDEVIEWNAME = "refmobpickuppsdeviewname";
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
    public static final String FIELD_SEARCHMODE = "SEARCHMODE";
    protected static final String DTOFIELD_SEARCHMODE = "searchmode";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
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
    public static final String FIELD_VALUEFORMAT = "VALUEFORMAT";
    protected static final String DTOFIELD_VALUEFORMAT = "valueformat";
    public static final String FIELD_VALUESEPERATOR = "VALUESEPERATOR";
    protected static final String DTOFIELD_VALUESEPERATOR = "valueseperator";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

    @JsonProperty(value="arrayflag")
    public void setArrayFlag(Integer arrayFlag) {
        this._set(DTOFIELD_ARRAYFLAG, arrayFlag);
    }

    @JsonIgnore
    public Integer getArrayFlag() {
        Object objValue = this._get(DTOFIELD_ARRAYFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isArrayFlagDirty() {
        return this._contains(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public void resetArrayFlag() {
        this._reset(DTOFIELD_ARRAYFLAG);
    }

    @JsonIgnore
    public PSDEFSFItemDTO arrayflag(Integer arrayFlag) {
        this.setArrayFlag(arrayFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO arrayflag(Boolean arrayFlag) {
        if (arrayFlag == null) {
            this.setArrayFlag(null);
        } else {
            this.setArrayFlag(arrayFlag != false ? 1 : 0);
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
    public PSDEFSFItemDTO cappslanresid(String capPSLanResId) {
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFSFItemDTO cappslanresname(String capPSLanResName) {
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
    public PSDEFSFItemDTO caption(String caption) {
        this.setCaption(caption);
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
    public PSDEFSFItemDTO codename(String codeName) {
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
    public PSDEFSFItemDTO createdate(Timestamp createDate) {
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
    public PSDEFSFItemDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEFSFItemDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dstpsdefid")
    public void setDstPSDEFId(String dstPSDEFId) {
        this._set(DTOFIELD_DSTPSDEFID, dstPSDEFId);
    }

    @JsonIgnore
    public String getDstPSDEFId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFID);
    }

    @JsonIgnore
    public void resetDstPSDEFId() {
        this._reset(DTOFIELD_DSTPSDEFID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO dstpsdefid(String dstPSDEFId) {
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    @JsonProperty(value="dstpsdefsfitemid")
    public void setDstPSDEFSFItemId(String dstPSDEFSFItemId) {
        this._set(DTOFIELD_DSTPSDEFSFITEMID, dstPSDEFSFItemId);
    }

    @JsonIgnore
    public String getDstPSDEFSFItemId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFSFITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFSFItemIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFSFITEMID);
    }

    @JsonIgnore
    public void resetDstPSDEFSFItemId() {
        this._reset(DTOFIELD_DSTPSDEFSFITEMID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO dstpsdefsfitemid(String dstPSDEFSFItemId) {
        this.setDstPSDEFSFItemId(dstPSDEFSFItemId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO dstpsdefsfitemid(PSDEFSFItemDTO pSDEFSFItem) {
        if (pSDEFSFItem == null) {
            this.setDstPSDEFId(null);
            this.setDstPSDEFSFItemId(null);
            this.setDstPSDEFSFItemName(null);
            this.setDstPSDEId(null);
        } else {
            this.setDstPSDEFId(pSDEFSFItem.getPSDEFId());
            this.setDstPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setDstPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
            this.setDstPSDEId(pSDEFSFItem.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="dstpsdefsfitemname")
    public void setDstPSDEFSFItemName(String dstPSDEFSFItemName) {
        this._set(DTOFIELD_DSTPSDEFSFITEMNAME, dstPSDEFSFItemName);
    }

    @JsonIgnore
    public String getDstPSDEFSFItemName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFSFITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFSFItemNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEFSFITEMNAME);
    }

    @JsonIgnore
    public void resetDstPSDEFSFItemName() {
        this._reset(DTOFIELD_DSTPSDEFSFITEMNAME);
    }

    @JsonIgnore
    public PSDEFSFItemDTO dstpsdefsfitemname(String dstPSDEFSFItemName) {
        this.setDstPSDEFSFItemName(dstPSDEFSFItemName);
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
    public PSDEFSFItemDTO dstpsdeid(String dstPSDEId) {
        this.setDstPSDEId(dstPSDEId);
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
    public PSDEFSFItemDTO editortype(String editorType) {
        this.setEditorType(editorType);
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
    public PSDEFSFItemDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
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
    public PSDEFSFItemDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="itemtag")
    public void setItemTag(String itemTag) {
        this._set(DTOFIELD_ITEMTAG, itemTag);
    }

    @JsonIgnore
    public String getItemTag() {
        Object objValue = this._get(DTOFIELD_ITEMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTagDirty() {
        return this._contains(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public void resetItemTag() {
        this._reset(DTOFIELD_ITEMTAG);
    }

    @JsonIgnore
    public PSDEFSFItemDTO itemtag(String itemTag) {
        this.setItemTag(itemTag);
        return this;
    }

    @JsonProperty(value="itemtag2")
    public void setItemTag2(String itemTag2) {
        this._set(DTOFIELD_ITEMTAG2, itemTag2);
    }

    @JsonIgnore
    public String getItemTag2() {
        Object objValue = this._get(DTOFIELD_ITEMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isItemTag2Dirty() {
        return this._contains(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public void resetItemTag2() {
        this._reset(DTOFIELD_ITEMTAG2);
    }

    @JsonIgnore
    public PSDEFSFItemDTO itemtag2(String itemTag2) {
        this.setItemTag2(itemTag2);
        return this;
    }

    @JsonProperty(value="jsonformat")
    public void setJsonFormat(String jsonFormat) {
        this._set(DTOFIELD_JSONFORMAT, jsonFormat);
    }

    @JsonIgnore
    public String getJsonFormat() {
        Object objValue = this._get(DTOFIELD_JSONFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJsonFormatDirty() {
        return this._contains(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public void resetJsonFormat() {
        this._reset(DTOFIELD_JSONFORMAT);
    }

    @JsonIgnore
    public PSDEFSFItemDTO jsonformat(String jsonFormat) {
        this.setJsonFormat(jsonFormat);
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
    public PSDEFSFItemDTO logicname(String logicName) {
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
    public PSDEFSFItemDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="o2mpsderid")
    public void setO2MPSDERId(String o2MPSDERId) {
        this._set(DTOFIELD_O2MPSDERID, o2MPSDERId);
    }

    @JsonIgnore
    public String getO2MPSDERId() {
        Object objValue = this._get(DTOFIELD_O2MPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2MPSDERIdDirty() {
        return this._contains(DTOFIELD_O2MPSDERID);
    }

    @JsonIgnore
    public void resetO2MPSDERId() {
        this._reset(DTOFIELD_O2MPSDERID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO o2mpsderid(String o2MPSDERId) {
        this.setO2MPSDERId(o2MPSDERId);
        return this;
    }

    @JsonProperty(value="o2opsderid")
    public void setO2OPSDERId(String o2OPSDERId) {
        this._set(DTOFIELD_O2OPSDERID, o2OPSDERId);
    }

    @JsonIgnore
    public String getO2OPSDERId() {
        Object objValue = this._get(DTOFIELD_O2OPSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isO2OPSDERIdDirty() {
        return this._contains(DTOFIELD_O2OPSDERID);
    }

    @JsonIgnore
    public void resetO2OPSDERId() {
        this._reset(DTOFIELD_O2OPSDERID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO o2opsderid(String o2OPSDERId) {
        this.setO2OPSDERId(o2OPSDERId);
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
    public PSDEFSFItemDTO phpslanresid(String pHPSLanResId) {
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO phpslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSDEFSFItemDTO phpslanresname(String pHPSLanResName) {
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
    public PSDEFSFItemDTO placeholder(String placeHolder) {
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
    public PSDEFSFItemDTO pscodelistid(String pSCodeListId) {
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pscodelistid(PSCodeListDTO pSCodeList) {
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
    public PSDEFSFItemDTO pscodelistname(String pSCodeListName) {
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonProperty(value="psdbvalueopid")
    public void setPSDBValueOPId(String pSDBValueOPId) {
        this._set(DTOFIELD_PSDBVALUEOPID, pSDBValueOPId);
    }

    @JsonIgnore
    public String getPSDBValueOPId() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPIdDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public void resetPSDBValueOPId() {
        this._reset(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
        if (pSDBValueOP == null) {
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        } else {
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    @JsonProperty(value="psdbvalueopname")
    public void setPSDBValueOPName(String pSDBValueOPName) {
        this._set(DTOFIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }

    @JsonIgnore
    public String getPSDBValueOPName() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPNameDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public void resetPSDBValueOPName() {
        this._reset(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
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
    public PSDEFSFItemDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setLogicName(null);
            this.setO2MPSDERId(null);
            this.setO2OPSDERId(null);
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setLogicName(pSDEField.getLogicName());
            this.setO2MPSDERId(pSDEField.getO2MPSDERId());
            this.setO2OPSDERId(pSDEField.getO2OPSDERId());
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
    public PSDEFSFItemDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSDEFSFItemDTO psdefsfitemid(String pSDEFSFItemId) {
        this.setPSDEFSFItemId(pSDEFSFItemId);
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
    public PSDEFSFItemDTO psdefsfitemname(String pSDEFSFItemName) {
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFSFItemName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFSFItemName(strName);
    }

    @JsonIgnore
    public PSDEFSFItemDTO name(String strName) {
        this.setPSDEFSFItemName(strName);
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
    public PSDEFSFItemDTO psdefvalueruleid(String pSDEFValueRuleId) {
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule) {
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
    public PSDEFSFItemDTO psdefvaluerulename(String pSDEFValueRuleName) {
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
    public PSDEFSFItemDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
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
    public PSDEFSFItemDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysdbvfid")
    public void setPSSysDBVFId(String pSSysDBVFId) {
        this._set(DTOFIELD_PSSYSDBVFID, pSSysDBVFId);
    }

    @JsonIgnore
    public String getPSSysDBVFId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public void resetPSSysDBVFId() {
        this._reset(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssysdbvfid(String pSSysDBVFId) {
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssysdbvfid(PSSysDBVFDTO pSSysDBVF) {
        if (pSSysDBVF == null) {
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        } else {
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbvfname")
    public void setPSSysDBVFName(String pSSysDBVFName) {
        this._set(DTOFIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }

    @JsonIgnore
    public String getPSSysDBVFName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFName() {
        this._reset(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssysdbvfname(String pSSysDBVFName) {
        this.setPSSysDBVFName(pSSysDBVFName);
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
    public PSDEFSFItemDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle) {
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
    public PSDEFSFItemDTO pssyseditorstylename(String pSSysEditorStyleName) {
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
    public PSDEFSFItemDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
    public PSDEFSFItemDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
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
    public PSDEFSFItemDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEFSFItemDTO pssyssfpluginname(String pSSysSFPluginName) {
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
    public PSDEFSFItemDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
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
    public PSDEFSFItemDTO pssystranslatorname(String pSSysTranslatorName) {
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
    public PSDEFSFItemDTO pssysvalueruleid(String pSSysValueRuleId) {
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule) {
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
    public PSDEFSFItemDTO pssysvaluerulename(String pSSysValueRuleName) {
        this.setPSSysValueRuleName(pSSysValueRuleName);
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
    public PSDEFSFItemDTO refadpsdelogicid(String refADPSDELogicId) {
        this.setRefADPSDELogicId(refADPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refadpsdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEFSFItemDTO refadpsdelogicname(String refADPSDELogicName) {
        this.setRefADPSDELogicName(refADPSDELogicName);
        return this;
    }

    @JsonProperty(value="refmobmpickuppsdeviewid")
    public void setRefMobMPickupPSDEViewId(String refMobMPickupPSDEViewId) {
        this._set(DTOFIELD_REFMOBMPICKUPPSDEVIEWID, refMobMPickupPSDEViewId);
    }

    @JsonIgnore
    public String getRefMobMPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_REFMOBMPICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMobMPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_REFMOBMPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetRefMobMPickupPSDEViewId() {
        this._reset(DTOFIELD_REFMOBMPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobmpickuppsdeviewid(String refMobMPickupPSDEViewId) {
        this.setRefMobMPickupPSDEViewId(refMobMPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobmpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setRefMobMPickupPSDEViewId(null);
            this.setRefMobMPickupPSDEViewName(null);
        } else {
            this.setRefMobMPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMobMPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="refmobmpickuppsdeviewname")
    public void setRefMobMPickupPSDEViewName(String refMobMPickupPSDEViewName) {
        this._set(DTOFIELD_REFMOBMPICKUPPSDEVIEWNAME, refMobMPickupPSDEViewName);
    }

    @JsonIgnore
    public String getRefMobMPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_REFMOBMPICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMobMPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_REFMOBMPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetRefMobMPickupPSDEViewName() {
        this._reset(DTOFIELD_REFMOBMPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobmpickuppsdeviewname(String refMobMPickupPSDEViewName) {
        this.setRefMobMPickupPSDEViewName(refMobMPickupPSDEViewName);
        return this;
    }

    @JsonProperty(value="refmobpickuppsdeviewid")
    public void setRefMobPickupPSDEViewId(String refMobPickupPSDEViewId) {
        this._set(DTOFIELD_REFMOBPICKUPPSDEVIEWID, refMobPickupPSDEViewId);
    }

    @JsonIgnore
    public String getRefMobPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_REFMOBPICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMobPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_REFMOBPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetRefMobPickupPSDEViewId() {
        this._reset(DTOFIELD_REFMOBPICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobpickuppsdeviewid(String refMobPickupPSDEViewId) {
        this.setRefMobPickupPSDEViewId(refMobPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setRefMobPickupPSDEViewId(null);
            this.setRefMobPickupPSDEViewName(null);
        } else {
            this.setRefMobPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMobPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="refmobpickuppsdeviewname")
    public void setRefMobPickupPSDEViewName(String refMobPickupPSDEViewName) {
        this._set(DTOFIELD_REFMOBPICKUPPSDEVIEWNAME, refMobPickupPSDEViewName);
    }

    @JsonIgnore
    public String getRefMobPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_REFMOBPICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefMobPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_REFMOBPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetRefMobPickupPSDEViewName() {
        this._reset(DTOFIELD_REFMOBPICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmobpickuppsdeviewname(String refMobPickupPSDEViewName) {
        this.setRefMobPickupPSDEViewName(refMobPickupPSDEViewName);
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
    public PSDEFSFItemDTO refmpickuppsdeviewid(String refMPickupPSDEViewId) {
        this.setRefMPickupPSDEViewId(refMPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refmpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEFSFItemDTO refmpickuppsdeviewname(String refMPickupPSDEViewName) {
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
    public PSDEFSFItemDTO refpickuppsdeviewid(String refPickupPSDEViewId) {
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refpickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
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
    public PSDEFSFItemDTO refpickuppsdeviewname(String refPickupPSDEViewName) {
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
    public PSDEFSFItemDTO refpsdeacmodeid(String refPSDEACModeId) {
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refpsdeacmodeid(PSDEACModeDTO pSDEACMode) {
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
    public PSDEFSFItemDTO refpsdeacmodename(String refPSDEACModeName) {
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
    public PSDEFSFItemDTO refpsdedatasetid(String refPSDEDataSetId) {
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refpsdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEFSFItemDTO refpsdedatasetname(String refPSDEDataSetName) {
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
    public PSDEFSFItemDTO refpsdeid(String refPSDEId) {
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refpsdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEFSFItemDTO refpsdename(String refPSDEName) {
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
    public PSDEFSFItemDTO refpsderid(String refPSDERId) {
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO refpsderid(PSDERDTO pSDER) {
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
    public PSDEFSFItemDTO refpsdername(String refPSDERName) {
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    @JsonProperty(value="searchmode")
    public void setSearchMode(String searchMode) {
        this._set(DTOFIELD_SEARCHMODE, searchMode);
    }

    @JsonIgnore
    public String getSearchMode() {
        Object objValue = this._get(DTOFIELD_SEARCHMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSearchModeDirty() {
        return this._contains(DTOFIELD_SEARCHMODE);
    }

    @JsonIgnore
    public void resetSearchMode() {
        this._reset(DTOFIELD_SEARCHMODE);
    }

    @JsonIgnore
    public PSDEFSFItemDTO searchmode(String searchMode) {
        this.setSearchMode(searchMode);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO searchmode(PSModelEnums.DEFSFMode searchMode) {
        if (searchMode == null) {
            this.setSearchMode(null);
        } else {
            this.setSearchMode(searchMode.value);
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
    public PSDEFSFItemDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
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
    public PSDEFSFItemDTO updatedate(Timestamp updateDate) {
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
    public PSDEFSFItemDTO updateman(String updateMan) {
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
    public PSDEFSFItemDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEFSFItemDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEFSFItemDTO userparams(String userParams) {
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
    public PSDEFSFItemDTO usertag(String userTag) {
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
    public PSDEFSFItemDTO usertag2(String userTag2) {
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
    public PSDEFSFItemDTO usertag3(String userTag3) {
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
    public PSDEFSFItemDTO usertag4(String userTag4) {
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
    public PSDEFSFItemDTO valueformat(String valueFormat) {
        this.setValueFormat(valueFormat);
        return this;
    }

    @JsonProperty(value="valueseperator")
    public void setValueSeperator(String valueSeperator) {
        this._set(DTOFIELD_VALUESEPERATOR, valueSeperator);
    }

    @JsonIgnore
    public String getValueSeperator() {
        Object objValue = this._get(DTOFIELD_VALUESEPERATOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValueSeperatorDirty() {
        return this._contains(DTOFIELD_VALUESEPERATOR);
    }

    @JsonIgnore
    public void resetValueSeperator() {
        this._reset(DTOFIELD_VALUESEPERATOR);
    }

    @JsonIgnore
    public PSDEFSFItemDTO valueseperator(String valueSeperator) {
        this.setValueSeperator(valueSeperator);
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
    public PSDEFSFItemDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFSFItemId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFSFItemId(strValue);
    }

    @JsonIgnore
    public PSDEFSFItemDTO id(String strValue) {
        this.setPSDEFSFItemId(strValue);
        return this;
    }
}
