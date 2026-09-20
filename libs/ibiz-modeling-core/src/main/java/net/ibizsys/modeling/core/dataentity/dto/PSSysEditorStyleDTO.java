package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSEditorTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysEditorStyleDTO
extends PSModelDTOBase {
    public static final String FIELD_AJAXHANDLER = "AJAXHANDLER";
    protected static final String DTOFIELD_AJAXHANDLER = "ajaxhandler";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CONTAINERTYPE = "CONTAINERTYPE";
    protected static final String DTOFIELD_CONTAINERTYPE = "containertype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLPARAM = "CTRLPARAM";
    protected static final String DTOFIELD_CTRLPARAM = "ctrlparam";
    public static final String FIELD_CTRLPARAM10 = "CTRLPARAM10";
    protected static final String DTOFIELD_CTRLPARAM10 = "ctrlparam10";
    public static final String FIELD_CTRLPARAM11 = "CTRLPARAM11";
    protected static final String DTOFIELD_CTRLPARAM11 = "ctrlparam11";
    public static final String FIELD_CTRLPARAM12 = "CTRLPARAM12";
    protected static final String DTOFIELD_CTRLPARAM12 = "ctrlparam12";
    public static final String FIELD_CTRLPARAM2 = "CTRLPARAM2";
    protected static final String DTOFIELD_CTRLPARAM2 = "ctrlparam2";
    public static final String FIELD_CTRLPARAM3 = "CTRLPARAM3";
    protected static final String DTOFIELD_CTRLPARAM3 = "ctrlparam3";
    public static final String FIELD_CTRLPARAM4 = "CTRLPARAM4";
    protected static final String DTOFIELD_CTRLPARAM4 = "ctrlparam4";
    public static final String FIELD_CTRLPARAM5 = "CTRLPARAM5";
    protected static final String DTOFIELD_CTRLPARAM5 = "ctrlparam5";
    public static final String FIELD_CTRLPARAM6 = "CTRLPARAM6";
    protected static final String DTOFIELD_CTRLPARAM6 = "ctrlparam6";
    public static final String FIELD_CTRLPARAM7 = "CTRLPARAM7";
    protected static final String DTOFIELD_CTRLPARAM7 = "ctrlparam7";
    public static final String FIELD_CTRLPARAM8 = "CTRLPARAM8";
    protected static final String DTOFIELD_CTRLPARAM8 = "ctrlparam8";
    public static final String FIELD_CTRLPARAM9 = "CTRLPARAM9";
    protected static final String DTOFIELD_CTRLPARAM9 = "ctrlparam9";
    public static final String FIELD_CTRLPARAMS = "CTRLPARAMS";
    protected static final String DTOFIELD_CTRLPARAMS = "ctrlparams";
    public static final String FIELD_EXTENDSTYLEONLY = "EXTENDSTYLEONLY";
    protected static final String DTOFIELD_EXTENDSTYLEONLY = "extendstyleonly";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_LINKVIEWSHOWMODE = "LINKVIEWSHOWMODE";
    protected static final String DTOFIELD_LINKVIEWSHOWMODE = "linkviewshowmode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PREVIEWHTML = "PREVIEWHTML";
    protected static final String DTOFIELD_PREVIEWHTML = "previewhtml";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSEDITORSTYLEID = "PSEDITORSTYLEID";
    protected static final String DTOFIELD_PSEDITORSTYLEID = "pseditorstyleid";
    public static final String FIELD_PSEDITORSTYLENAME = "PSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSEDITORSTYLENAME = "pseditorstylename";
    public static final String FIELD_PSEDITORTYPEID = "PSEDITORTYPEID";
    protected static final String DTOFIELD_PSEDITORTYPEID = "pseditortypeid";
    public static final String FIELD_PSEDITORTYPENAME = "PSEDITORTYPENAME";
    protected static final String DTOFIELD_PSEDITORTYPENAME = "pseditortypename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSEDITORSTYLEID = "PSSYSEDITORSTYLEID";
    protected static final String DTOFIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";
    public static final String FIELD_PSSYSEDITORSTYLENAME = "PSSYSEDITORSTYLENAME";
    protected static final String DTOFIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_REFVIEWSHOWMODE = "REFVIEWSHOWMODE";
    protected static final String DTOFIELD_REFVIEWSHOWMODE = "refviewshowmode";
    public static final String FIELD_REPDEFAULT = "REPDEFAULT";
    protected static final String DTOFIELD_REPDEFAULT = "repdefault";
    public static final String FIELD_STUDIOICON = "STUDIOICON";
    protected static final String DTOFIELD_STUDIOICON = "studioicon";
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
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

    @JsonProperty(value="ajaxhandler")
    public void setAjaxHandler(String ajaxHandler) {
        this._set(DTOFIELD_AJAXHANDLER, ajaxHandler);
    }

    @JsonIgnore
    public String getAjaxHandler() {
        Object objValue = this._get(DTOFIELD_AJAXHANDLER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAjaxHandlerDirty() {
        return this._contains(DTOFIELD_AJAXHANDLER);
    }

    @JsonIgnore
    public void resetAjaxHandler() {
        this._reset(DTOFIELD_AJAXHANDLER);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ajaxhandler(String ajaxHandler) {
        this.setAjaxHandler(ajaxHandler);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ajaxhandler(PSModelEnums.EditorHandlerType ajaxHandler) {
        if (ajaxHandler == null) {
            this.setAjaxHandler(null);
        } else {
            this.setAjaxHandler(ajaxHandler.value);
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
    public PSSysEditorStyleDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="containertype")
    public void setContainerType(String containerType) {
        this._set(DTOFIELD_CONTAINERTYPE, containerType);
    }

    @JsonIgnore
    public String getContainerType() {
        Object objValue = this._get(DTOFIELD_CONTAINERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isContainerTypeDirty() {
        return this._contains(DTOFIELD_CONTAINERTYPE);
    }

    @JsonIgnore
    public void resetContainerType() {
        this._reset(DTOFIELD_CONTAINERTYPE);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO containertype(String containerType) {
        this.setContainerType(containerType);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO containertype(PSModelEnums.EditorContainer containerType) {
        if (containerType == null) {
            this.setContainerType(null);
        } else {
            this.setContainerType(containerType.value);
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
    public PSSysEditorStyleDTO createdate(Timestamp createDate) {
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
    public PSSysEditorStyleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlparam")
    public void setCtrlParam(String ctrlParam) {
        this._set(DTOFIELD_CTRLPARAM, ctrlParam);
    }

    @JsonIgnore
    public String getCtrlParam() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParamDirty() {
        return this._contains(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public void resetCtrlParam() {
        this._reset(DTOFIELD_CTRLPARAM);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam(String ctrlParam) {
        this.setCtrlParam(ctrlParam);
        return this;
    }

    @JsonProperty(value="ctrlparam10")
    public void setCtrlParam10(Double ctrlParam10) {
        this._set(DTOFIELD_CTRLPARAM10, ctrlParam10);
    }

    @JsonIgnore
    public Double getCtrlParam10() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam10Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public void resetCtrlParam10() {
        this._reset(DTOFIELD_CTRLPARAM10);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam10(Double ctrlParam10) {
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    @JsonProperty(value="ctrlparam11")
    public void setCtrlParam11(Integer ctrlParam11) {
        this._set(DTOFIELD_CTRLPARAM11, ctrlParam11);
    }

    @JsonIgnore
    public Integer getCtrlParam11() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM11);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam11Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public void resetCtrlParam11() {
        this._reset(DTOFIELD_CTRLPARAM11);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam11(Integer ctrlParam11) {
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    @JsonProperty(value="ctrlparam12")
    public void setCtrlParam12(Integer ctrlParam12) {
        this._set(DTOFIELD_CTRLPARAM12, ctrlParam12);
    }

    @JsonIgnore
    public Integer getCtrlParam12() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM12);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam12Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public void resetCtrlParam12() {
        this._reset(DTOFIELD_CTRLPARAM12);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam12(Integer ctrlParam12) {
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    @JsonProperty(value="ctrlparam2")
    public void setCtrlParam2(String ctrlParam2) {
        this._set(DTOFIELD_CTRLPARAM2, ctrlParam2);
    }

    @JsonIgnore
    public String getCtrlParam2() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam2Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public void resetCtrlParam2() {
        this._reset(DTOFIELD_CTRLPARAM2);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam2(String ctrlParam2) {
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    @JsonProperty(value="ctrlparam3")
    public void setCtrlParam3(String ctrlParam3) {
        this._set(DTOFIELD_CTRLPARAM3, ctrlParam3);
    }

    @JsonIgnore
    public String getCtrlParam3() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam3Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public void resetCtrlParam3() {
        this._reset(DTOFIELD_CTRLPARAM3);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam3(String ctrlParam3) {
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    @JsonProperty(value="ctrlparam4")
    public void setCtrlParam4(String ctrlParam4) {
        this._set(DTOFIELD_CTRLPARAM4, ctrlParam4);
    }

    @JsonIgnore
    public String getCtrlParam4() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam4Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public void resetCtrlParam4() {
        this._reset(DTOFIELD_CTRLPARAM4);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam4(String ctrlParam4) {
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    @JsonProperty(value="ctrlparam5")
    public void setCtrlParam5(Integer ctrlParam5) {
        this._set(DTOFIELD_CTRLPARAM5, ctrlParam5);
    }

    @JsonIgnore
    public Integer getCtrlParam5() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam5Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public void resetCtrlParam5() {
        this._reset(DTOFIELD_CTRLPARAM5);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam5(Integer ctrlParam5) {
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam5(Boolean ctrlParam5) {
        if (ctrlParam5 == null) {
            this.setCtrlParam5(null);
        } else {
            this.setCtrlParam5(ctrlParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam6")
    public void setCtrlParam6(Integer ctrlParam6) {
        this._set(DTOFIELD_CTRLPARAM6, ctrlParam6);
    }

    @JsonIgnore
    public Integer getCtrlParam6() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam6Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public void resetCtrlParam6() {
        this._reset(DTOFIELD_CTRLPARAM6);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam6(Integer ctrlParam6) {
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam6(Boolean ctrlParam6) {
        if (ctrlParam6 == null) {
            this.setCtrlParam6(null);
        } else {
            this.setCtrlParam6(ctrlParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="ctrlparam7")
    public void setCtrlParam7(Integer ctrlParam7) {
        this._set(DTOFIELD_CTRLPARAM7, ctrlParam7);
    }

    @JsonIgnore
    public Integer getCtrlParam7() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam7Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public void resetCtrlParam7() {
        this._reset(DTOFIELD_CTRLPARAM7);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam7(Integer ctrlParam7) {
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    @JsonProperty(value="ctrlparam8")
    public void setCtrlParam8(Integer ctrlParam8) {
        this._set(DTOFIELD_CTRLPARAM8, ctrlParam8);
    }

    @JsonIgnore
    public Integer getCtrlParam8() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam8Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public void resetCtrlParam8() {
        this._reset(DTOFIELD_CTRLPARAM8);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam8(Integer ctrlParam8) {
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    @JsonProperty(value="ctrlparam9")
    public void setCtrlParam9(Double ctrlParam9) {
        this._set(DTOFIELD_CTRLPARAM9, ctrlParam9);
    }

    @JsonIgnore
    public Double getCtrlParam9() {
        Object objValue = this._get(DTOFIELD_CTRLPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParam9Dirty() {
        return this._contains(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public void resetCtrlParam9() {
        this._reset(DTOFIELD_CTRLPARAM9);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparam9(Double ctrlParam9) {
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    @JsonProperty(value="ctrlparams")
    public void setCtrlParams(String ctrlParams) {
        this._set(DTOFIELD_CTRLPARAMS, ctrlParams);
    }

    @JsonIgnore
    public String getCtrlParams() {
        Object objValue = this._get(DTOFIELD_CTRLPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlParamsDirty() {
        return this._contains(DTOFIELD_CTRLPARAMS);
    }

    @JsonIgnore
    public void resetCtrlParams() {
        this._reset(DTOFIELD_CTRLPARAMS);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO ctrlparams(String ctrlParams) {
        this.setCtrlParams(ctrlParams);
        return this;
    }

    @JsonProperty(value="extendstyleonly")
    public void setExtendStyleOnly(Integer extendStyleOnly) {
        this._set(DTOFIELD_EXTENDSTYLEONLY, extendStyleOnly);
    }

    @JsonIgnore
    public Integer getExtendStyleOnly() {
        Object objValue = this._get(DTOFIELD_EXTENDSTYLEONLY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendStyleOnlyDirty() {
        return this._contains(DTOFIELD_EXTENDSTYLEONLY);
    }

    @JsonIgnore
    public void resetExtendStyleOnly() {
        this._reset(DTOFIELD_EXTENDSTYLEONLY);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO extendstyleonly(Integer extendStyleOnly) {
        this.setExtendStyleOnly(extendStyleOnly);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO extendstyleonly(Boolean extendStyleOnly) {
        if (extendStyleOnly == null) {
            this.setExtendStyleOnly(null);
        } else {
            this.setExtendStyleOnly(extendStyleOnly != false ? 1 : 0);
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
    public PSSysEditorStyleDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="linkviewshowmode")
    public void setLinkViewShowMode(String linkViewShowMode) {
        this._set(DTOFIELD_LINKVIEWSHOWMODE, linkViewShowMode);
    }

    @JsonIgnore
    public String getLinkViewShowMode() {
        Object objValue = this._get(DTOFIELD_LINKVIEWSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkViewShowModeDirty() {
        return this._contains(DTOFIELD_LINKVIEWSHOWMODE);
    }

    @JsonIgnore
    public void resetLinkViewShowMode() {
        this._reset(DTOFIELD_LINKVIEWSHOWMODE);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO linkviewshowmode(String linkViewShowMode) {
        this.setLinkViewShowMode(linkViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO linkviewshowmode(PSModelEnums.EditorRefViewShowMode linkViewShowMode) {
        if (linkViewShowMode == null) {
            this.setLinkViewShowMode(null);
        } else {
            this.setLinkViewShowMode(linkViewShowMode.value);
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
    public PSSysEditorStyleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="previewhtml")
    public void setPreviewHtml(String previewHtml) {
        this._set(DTOFIELD_PREVIEWHTML, previewHtml);
    }

    @JsonIgnore
    public String getPreviewHtml() {
        Object objValue = this._get(DTOFIELD_PREVIEWHTML);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPreviewHtmlDirty() {
        return this._contains(DTOFIELD_PREVIEWHTML);
    }

    @JsonIgnore
    public void resetPreviewHtml() {
        this._reset(DTOFIELD_PREVIEWHTML);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO previewhtml(String previewHtml) {
        this.setPreviewHtml(previewHtml);
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
    public PSSysEditorStyleDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSSysEditorStyleDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonProperty(value="pseditorstyleid")
    public void setPSEditorStyleId(String pSEditorStyleId) {
        this._set(DTOFIELD_PSEDITORSTYLEID, pSEditorStyleId);
    }

    @JsonIgnore
    public String getPSEditorStyleId() {
        Object objValue = this._get(DTOFIELD_PSEDITORSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSEditorStyleIdDirty() {
        return this._contains(DTOFIELD_PSEDITORSTYLEID);
    }

    @JsonIgnore
    public void resetPSEditorStyleId() {
        this._reset(DTOFIELD_PSEDITORSTYLEID);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pseditorstyleid(String pSEditorStyleId) {
        this.setPSEditorStyleId(pSEditorStyleId);
        return this;
    }

    @JsonProperty(value="pseditorstylename")
    public void setPSEditorStyleName(String pSEditorStyleName) {
        this._set(DTOFIELD_PSEDITORSTYLENAME, pSEditorStyleName);
    }

    @JsonIgnore
    public String getPSEditorStyleName() {
        Object objValue = this._get(DTOFIELD_PSEDITORSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSEditorStyleNameDirty() {
        return this._contains(DTOFIELD_PSEDITORSTYLENAME);
    }

    @JsonIgnore
    public void resetPSEditorStyleName() {
        this._reset(DTOFIELD_PSEDITORSTYLENAME);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pseditorstylename(String pSEditorStyleName) {
        this.setPSEditorStyleName(pSEditorStyleName);
        return this;
    }

    @JsonProperty(value="pseditortypeid")
    public void setPSEditorTypeId(String pSEditorTypeId) {
        this._set(DTOFIELD_PSEDITORTYPEID, pSEditorTypeId);
    }

    @JsonIgnore
    public String getPSEditorTypeId() {
        Object objValue = this._get(DTOFIELD_PSEDITORTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSEditorTypeIdDirty() {
        return this._contains(DTOFIELD_PSEDITORTYPEID);
    }

    @JsonIgnore
    public void resetPSEditorTypeId() {
        this._reset(DTOFIELD_PSEDITORTYPEID);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pseditortypeid(String pSEditorTypeId) {
        this.setPSEditorTypeId(pSEditorTypeId);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pseditortypeid(PSEditorTypeDTO pSEditorType) {
        if (pSEditorType == null) {
            this.setPSEditorTypeId(null);
            this.setPSEditorTypeName(null);
        } else {
            this.setPSEditorTypeId(pSEditorType.getPSEditorTypeId());
            this.setPSEditorTypeName(pSEditorType.getPSEditorTypeName());
        }
        return this;
    }

    @JsonProperty(value="pseditortypename")
    public void setPSEditorTypeName(String pSEditorTypeName) {
        this._set(DTOFIELD_PSEDITORTYPENAME, pSEditorTypeName);
    }

    @JsonIgnore
    public String getPSEditorTypeName() {
        Object objValue = this._get(DTOFIELD_PSEDITORTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSEditorTypeNameDirty() {
        return this._contains(DTOFIELD_PSEDITORTYPENAME);
    }

    @JsonIgnore
    public void resetPSEditorTypeName() {
        this._reset(DTOFIELD_PSEDITORTYPENAME);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pseditortypename(String pSEditorTypeName) {
        this.setPSEditorTypeName(pSEditorTypeName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysEditorStyleDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSSysEditorStyleDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSSysEditorStyleDTO pssyseditorstyleid(String pSSysEditorStyleId) {
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
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
    public PSSysEditorStyleDTO pssyseditorstylename(String pSSysEditorStyleName) {
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysEditorStyleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysEditorStyleName(strName);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO name(String strName) {
        this.setPSSysEditorStyleName(strName);
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
    public PSSysEditorStyleDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSSysEditorStyleDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="refviewshowmode")
    public void setRefViewShowMode(String refViewShowMode) {
        this._set(DTOFIELD_REFVIEWSHOWMODE, refViewShowMode);
    }

    @JsonIgnore
    public String getRefViewShowMode() {
        Object objValue = this._get(DTOFIELD_REFVIEWSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefViewShowModeDirty() {
        return this._contains(DTOFIELD_REFVIEWSHOWMODE);
    }

    @JsonIgnore
    public void resetRefViewShowMode() {
        this._reset(DTOFIELD_REFVIEWSHOWMODE);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO refviewshowmode(String refViewShowMode) {
        this.setRefViewShowMode(refViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO refviewshowmode(PSModelEnums.EditorRefViewShowMode refViewShowMode) {
        if (refViewShowMode == null) {
            this.setRefViewShowMode(null);
        } else {
            this.setRefViewShowMode(refViewShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="repdefault")
    public void setRepDefault(Integer repDefault) {
        this._set(DTOFIELD_REPDEFAULT, repDefault);
    }

    @JsonIgnore
    public Integer getRepDefault() {
        Object objValue = this._get(DTOFIELD_REPDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRepDefaultDirty() {
        return this._contains(DTOFIELD_REPDEFAULT);
    }

    @JsonIgnore
    public void resetRepDefault() {
        this._reset(DTOFIELD_REPDEFAULT);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO repdefault(Integer repDefault) {
        this.setRepDefault(repDefault);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO repdefault(Boolean repDefault) {
        if (repDefault == null) {
            this.setRepDefault(null);
        } else {
            this.setRepDefault(repDefault != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="studioicon")
    public void setStudioIcon(String studioIcon) {
        this._set(DTOFIELD_STUDIOICON, studioIcon);
    }

    @JsonIgnore
    public String getStudioIcon() {
        Object objValue = this._get(DTOFIELD_STUDIOICON);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioIconDirty() {
        return this._contains(DTOFIELD_STUDIOICON);
    }

    @JsonIgnore
    public void resetStudioIcon() {
        this._reset(DTOFIELD_STUDIOICON);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO studioicon(String studioIcon) {
        this.setStudioIcon(studioIcon);
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
    public PSSysEditorStyleDTO updatedate(Timestamp updateDate) {
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
    public PSSysEditorStyleDTO updateman(String updateMan) {
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
    public PSSysEditorStyleDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysEditorStyleDTO usertag(String userTag) {
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
    public PSSysEditorStyleDTO usertag2(String userTag2) {
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
    public PSSysEditorStyleDTO usertag3(String userTag3) {
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
    public PSSysEditorStyleDTO usertag4(String userTag4) {
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
    public PSSysEditorStyleDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysEditorStyleDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
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
    public PSSysEditorStyleDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysEditorStyleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysEditorStyleId(strValue);
    }

    @JsonIgnore
    public PSSysEditorStyleDTO id(String strValue) {
        this.setPSSysEditorStyleId(strValue);
        return this;
    }
}
