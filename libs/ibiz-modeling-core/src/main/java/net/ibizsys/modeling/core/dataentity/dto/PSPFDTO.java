package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSPFDTO
extends PSModelDTOBase {
    public static final String FIELD_APPPUBOBJ = "APPPUBOBJ";
    protected static final String DTOFIELD_APPPUBOBJ = "apppubobj";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLPARTPUBOBJ = "CTRLPARTPUBOBJ";
    protected static final String DTOFIELD_CTRLPARTPUBOBJ = "ctrlpartpubobj";
    public static final String FIELD_CTRLPUBOBJ = "CTRLPUBOBJ";
    protected static final String DTOFIELD_CTRLPUBOBJ = "ctrlpubobj";
    public static final String FIELD_EDITORPUBOBJ = "EDITORPUBOBJ";
    protected static final String DTOFIELD_EDITORPUBOBJ = "editorpubobj";
    public static final String FIELD_ENABLEJIT = "ENABLEJIT";
    protected static final String DTOFIELD_ENABLEJIT = "enablejit";
    public static final String FIELD_FORMLAYOUTMODE = "FORMLAYOUTMODE";
    protected static final String DTOFIELD_FORMLAYOUTMODE = "formlayoutmode";
    public static final String FIELD_JITAPPOBJ = "JITAPPOBJ";
    protected static final String DTOFIELD_JITAPPOBJ = "jitappobj";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPTYPEID = "PSAPPTYPEID";
    protected static final String DTOFIELD_PSAPPTYPEID = "psapptypeid";
    public static final String FIELD_PSAPPTYPENAME = "PSAPPTYPENAME";
    protected static final String DTOFIELD_PSAPPTYPENAME = "psapptypename";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_STYLE2OBJ = "STYLE2OBJ";
    protected static final String DTOFIELD_STYLE2OBJ = "style2obj";
    public static final String FIELD_STYLEOBJ = "STYLEOBJ";
    protected static final String DTOFIELD_STYLEOBJ = "styleobj";
    public static final String FIELD_TYPEOBJ = "TYPEOBJ";
    protected static final String DTOFIELD_TYPEOBJ = "typeobj";
    public static final String FIELD_UAPUBOBJ = "UAPUBOBJ";
    protected static final String DTOFIELD_UAPUBOBJ = "uapubobj";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USEJITPREVIEW = "USEJITPREVIEW";
    protected static final String DTOFIELD_USEJITPREVIEW = "usejitpreview";
    public static final String FIELD_V2FOLDER = "V2FOLDER";
    protected static final String DTOFIELD_V2FOLDER = "v2folder";
    public static final String FIELD_V2GITPATH = "V2GITPATH";
    protected static final String DTOFIELD_V2GITPATH = "v2gitpath";
    public static final String FIELD_V2VIEWMACROPARAMS = "V2VIEWMACROPARAMS";
    protected static final String DTOFIELD_V2VIEWMACROPARAMS = "v2viewmacroparams";
    public static final String FIELD_V2VIEWPUBOBJ = "V2VIEWPUBOBJ";
    protected static final String DTOFIELD_V2VIEWPUBOBJ = "v2viewpubobj";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VIEWPUBOBJ = "VIEWPUBOBJ";
    protected static final String DTOFIELD_VIEWPUBOBJ = "viewpubobj";
    public static final String FIELD_VLPUBOBJ = "VLPUBOBJ";
    protected static final String DTOFIELD_VLPUBOBJ = "vlpubobj";

    @JsonProperty(value="apppubobj")
    public void setAppPubObj(String appPubObj) {
        this._set(DTOFIELD_APPPUBOBJ, appPubObj);
    }

    @JsonIgnore
    public String getAppPubObj() {
        Object objValue = this._get(DTOFIELD_APPPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppPubObjDirty() {
        return this._contains(DTOFIELD_APPPUBOBJ);
    }

    @JsonIgnore
    public void resetAppPubObj() {
        this._reset(DTOFIELD_APPPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO apppubobj(String appPubObj) {
        this.setAppPubObj(appPubObj);
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
    public PSPFDTO createdate(Timestamp createDate) {
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
    public PSPFDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlpartpubobj")
    public void setCtrlPartPubObj(String ctrlPartPubObj) {
        this._set(DTOFIELD_CTRLPARTPUBOBJ, ctrlPartPubObj);
    }

    @JsonIgnore
    public String getCtrlPartPubObj() {
        Object objValue = this._get(DTOFIELD_CTRLPARTPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPartPubObjDirty() {
        return this._contains(DTOFIELD_CTRLPARTPUBOBJ);
    }

    @JsonIgnore
    public void resetCtrlPartPubObj() {
        this._reset(DTOFIELD_CTRLPARTPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO ctrlpartpubobj(String ctrlPartPubObj) {
        this.setCtrlPartPubObj(ctrlPartPubObj);
        return this;
    }

    @JsonProperty(value="ctrlpubobj")
    public void setCtrlPubObj(String ctrlPubObj) {
        this._set(DTOFIELD_CTRLPUBOBJ, ctrlPubObj);
    }

    @JsonIgnore
    public String getCtrlPubObj() {
        Object objValue = this._get(DTOFIELD_CTRLPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlPubObjDirty() {
        return this._contains(DTOFIELD_CTRLPUBOBJ);
    }

    @JsonIgnore
    public void resetCtrlPubObj() {
        this._reset(DTOFIELD_CTRLPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO ctrlpubobj(String ctrlPubObj) {
        this.setCtrlPubObj(ctrlPubObj);
        return this;
    }

    @JsonProperty(value="editorpubobj")
    public void setEditorPubObj(String editorPubObj) {
        this._set(DTOFIELD_EDITORPUBOBJ, editorPubObj);
    }

    @JsonIgnore
    public String getEditorPubObj() {
        Object objValue = this._get(DTOFIELD_EDITORPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEditorPubObjDirty() {
        return this._contains(DTOFIELD_EDITORPUBOBJ);
    }

    @JsonIgnore
    public void resetEditorPubObj() {
        this._reset(DTOFIELD_EDITORPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO editorpubobj(String editorPubObj) {
        this.setEditorPubObj(editorPubObj);
        return this;
    }

    @JsonProperty(value="enablejit")
    public void setEnableJIT(Integer enableJIT) {
        this._set(DTOFIELD_ENABLEJIT, enableJIT);
    }

    @JsonIgnore
    public Integer getEnableJIT() {
        Object objValue = this._get(DTOFIELD_ENABLEJIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableJITDirty() {
        return this._contains(DTOFIELD_ENABLEJIT);
    }

    @JsonIgnore
    public void resetEnableJIT() {
        this._reset(DTOFIELD_ENABLEJIT);
    }

    @JsonIgnore
    public PSPFDTO enablejit(Integer enableJIT) {
        this.setEnableJIT(enableJIT);
        return this;
    }

    @JsonIgnore
    public PSPFDTO enablejit(Boolean enableJIT) {
        if (enableJIT == null) {
            this.setEnableJIT(null);
        } else {
            this.setEnableJIT(enableJIT != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formlayoutmode")
    public void setFormLayoutMode(String formLayoutMode) {
        this._set(DTOFIELD_FORMLAYOUTMODE, formLayoutMode);
    }

    @JsonIgnore
    public String getFormLayoutMode() {
        Object objValue = this._get(DTOFIELD_FORMLAYOUTMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormLayoutModeDirty() {
        return this._contains(DTOFIELD_FORMLAYOUTMODE);
    }

    @JsonIgnore
    public void resetFormLayoutMode() {
        this._reset(DTOFIELD_FORMLAYOUTMODE);
    }

    @JsonIgnore
    public PSPFDTO formlayoutmode(String formLayoutMode) {
        this.setFormLayoutMode(formLayoutMode);
        return this;
    }

    @JsonIgnore
    public PSPFDTO formlayoutmode(PSModelEnums.LayoutMode formLayoutMode) {
        if (formLayoutMode == null) {
            this.setFormLayoutMode(null);
        } else {
            this.setFormLayoutMode(formLayoutMode.value);
        }
        return this;
    }

    @JsonProperty(value="jitappobj")
    public void setJITAppObj(String jITAppObj) {
        this._set(DTOFIELD_JITAPPOBJ, jITAppObj);
    }

    @JsonIgnore
    public String getJITAppObj() {
        Object objValue = this._get(DTOFIELD_JITAPPOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJITAppObjDirty() {
        return this._contains(DTOFIELD_JITAPPOBJ);
    }

    @JsonIgnore
    public void resetJITAppObj() {
        this._reset(DTOFIELD_JITAPPOBJ);
    }

    @JsonIgnore
    public PSPFDTO jitappobj(String jITAppObj) {
        this.setJITAppObj(jITAppObj);
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
    public PSPFDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psapptypeid")
    public void setPSAppTypeId(String pSAppTypeId) {
        this._set(DTOFIELD_PSAPPTYPEID, pSAppTypeId);
    }

    @JsonIgnore
    public String getPSAppTypeId() {
        Object objValue = this._get(DTOFIELD_PSAPPTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppTypeIdDirty() {
        return this._contains(DTOFIELD_PSAPPTYPEID);
    }

    @JsonIgnore
    public void resetPSAppTypeId() {
        this._reset(DTOFIELD_PSAPPTYPEID);
    }

    @JsonIgnore
    public PSPFDTO psapptypeid(String pSAppTypeId) {
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

    @JsonIgnore
    public PSPFDTO psapptypeid(PSAppTypeDTO pSAppType) {
        if (pSAppType == null) {
            this.setPSAppTypeId(null);
            this.setPSAppTypeName(null);
        } else {
            this.setPSAppTypeId(pSAppType.getPSAppTypeId());
            this.setPSAppTypeName(pSAppType.getPSAppTypeName());
        }
        return this;
    }

    @JsonProperty(value="psapptypename")
    public void setPSAppTypeName(String pSAppTypeName) {
        this._set(DTOFIELD_PSAPPTYPENAME, pSAppTypeName);
    }

    @JsonIgnore
    public String getPSAppTypeName() {
        Object objValue = this._get(DTOFIELD_PSAPPTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppTypeNameDirty() {
        return this._contains(DTOFIELD_PSAPPTYPENAME);
    }

    @JsonIgnore
    public void resetPSAppTypeName() {
        this._reset(DTOFIELD_PSAPPTYPENAME);
    }

    @JsonIgnore
    public PSPFDTO psapptypename(String pSAppTypeName) {
        this.setPSAppTypeName(pSAppTypeName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSPFDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSPFDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSPFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSPFName(strName);
    }

    @JsonIgnore
    public PSPFDTO name(String strName) {
        this.setPSPFName(strName);
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
    public PSPFDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSPFDTO pubmode(PSModelEnums.PublicMode pubMode) {
        if (pubMode == null) {
            this.setPubMode(null);
        } else {
            this.setPubMode(pubMode.value);
        }
        return this;
    }

    @JsonProperty(value="style2obj")
    public void setStyle2Obj(String style2Obj) {
        this._set(DTOFIELD_STYLE2OBJ, style2Obj);
    }

    @JsonIgnore
    public String getStyle2Obj() {
        Object objValue = this._get(DTOFIELD_STYLE2OBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyle2ObjDirty() {
        return this._contains(DTOFIELD_STYLE2OBJ);
    }

    @JsonIgnore
    public void resetStyle2Obj() {
        this._reset(DTOFIELD_STYLE2OBJ);
    }

    @JsonIgnore
    public PSPFDTO style2obj(String style2Obj) {
        this.setStyle2Obj(style2Obj);
        return this;
    }

    @JsonProperty(value="styleobj")
    public void setStyleObj(String styleObj) {
        this._set(DTOFIELD_STYLEOBJ, styleObj);
    }

    @JsonIgnore
    public String getStyleObj() {
        Object objValue = this._get(DTOFIELD_STYLEOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleObjDirty() {
        return this._contains(DTOFIELD_STYLEOBJ);
    }

    @JsonIgnore
    public void resetStyleObj() {
        this._reset(DTOFIELD_STYLEOBJ);
    }

    @JsonIgnore
    public PSPFDTO styleobj(String styleObj) {
        this.setStyleObj(styleObj);
        return this;
    }

    @JsonProperty(value="typeobj")
    public void setTypeObj(String typeObj) {
        this._set(DTOFIELD_TYPEOBJ, typeObj);
    }

    @JsonIgnore
    public String getTypeObj() {
        Object objValue = this._get(DTOFIELD_TYPEOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypeObjDirty() {
        return this._contains(DTOFIELD_TYPEOBJ);
    }

    @JsonIgnore
    public void resetTypeObj() {
        this._reset(DTOFIELD_TYPEOBJ);
    }

    @JsonIgnore
    public PSPFDTO typeobj(String typeObj) {
        this.setTypeObj(typeObj);
        return this;
    }

    @JsonProperty(value="uapubobj")
    public void setUAPubObj(String uAPubObj) {
        this._set(DTOFIELD_UAPUBOBJ, uAPubObj);
    }

    @JsonIgnore
    public String getUAPubObj() {
        Object objValue = this._get(DTOFIELD_UAPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUAPubObjDirty() {
        return this._contains(DTOFIELD_UAPUBOBJ);
    }

    @JsonIgnore
    public void resetUAPubObj() {
        this._reset(DTOFIELD_UAPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO uapubobj(String uAPubObj) {
        this.setUAPubObj(uAPubObj);
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
    public PSPFDTO updatedate(Timestamp updateDate) {
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
    public PSPFDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usejitpreview")
    public void setUseJITPreview(Integer useJITPreview) {
        this._set(DTOFIELD_USEJITPREVIEW, useJITPreview);
    }

    @JsonIgnore
    public Integer getUseJITPreview() {
        Object objValue = this._get(DTOFIELD_USEJITPREVIEW);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUseJITPreviewDirty() {
        return this._contains(DTOFIELD_USEJITPREVIEW);
    }

    @JsonIgnore
    public void resetUseJITPreview() {
        this._reset(DTOFIELD_USEJITPREVIEW);
    }

    @JsonIgnore
    public PSPFDTO usejitpreview(Integer useJITPreview) {
        this.setUseJITPreview(useJITPreview);
        return this;
    }

    @JsonIgnore
    public PSPFDTO usejitpreview(Boolean useJITPreview) {
        if (useJITPreview == null) {
            this.setUseJITPreview(null);
        } else {
            this.setUseJITPreview(useJITPreview != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="v2folder")
    public void setV2Folder(String v2Folder) {
        this._set(DTOFIELD_V2FOLDER, v2Folder);
    }

    @JsonIgnore
    public String getV2Folder() {
        Object objValue = this._get(DTOFIELD_V2FOLDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2FolderDirty() {
        return this._contains(DTOFIELD_V2FOLDER);
    }

    @JsonIgnore
    public void resetV2Folder() {
        this._reset(DTOFIELD_V2FOLDER);
    }

    @JsonIgnore
    public PSPFDTO v2folder(String v2Folder) {
        this.setV2Folder(v2Folder);
        return this;
    }

    @JsonProperty(value="v2gitpath")
    public void setV2GitPath(String v2GitPath) {
        this._set(DTOFIELD_V2GITPATH, v2GitPath);
    }

    @JsonIgnore
    public String getV2GitPath() {
        Object objValue = this._get(DTOFIELD_V2GITPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2GitPathDirty() {
        return this._contains(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public void resetV2GitPath() {
        this._reset(DTOFIELD_V2GITPATH);
    }

    @JsonIgnore
    public PSPFDTO v2gitpath(String v2GitPath) {
        this.setV2GitPath(v2GitPath);
        return this;
    }

    @JsonProperty(value="v2viewmacroparams")
    public void setV2ViewMacroParams(String v2ViewMacroParams) {
        this._set(DTOFIELD_V2VIEWMACROPARAMS, v2ViewMacroParams);
    }

    @JsonIgnore
    public String getV2ViewMacroParams() {
        Object objValue = this._get(DTOFIELD_V2VIEWMACROPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2ViewMacroParamsDirty() {
        return this._contains(DTOFIELD_V2VIEWMACROPARAMS);
    }

    @JsonIgnore
    public void resetV2ViewMacroParams() {
        this._reset(DTOFIELD_V2VIEWMACROPARAMS);
    }

    @JsonIgnore
    public PSPFDTO v2viewmacroparams(String v2ViewMacroParams) {
        this.setV2ViewMacroParams(v2ViewMacroParams);
        return this;
    }

    @JsonProperty(value="v2viewpubobj")
    public void setV2ViewPubObj(String v2ViewPubObj) {
        this._set(DTOFIELD_V2VIEWPUBOBJ, v2ViewPubObj);
    }

    @JsonIgnore
    public String getV2ViewPubObj() {
        Object objValue = this._get(DTOFIELD_V2VIEWPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2ViewPubObjDirty() {
        return this._contains(DTOFIELD_V2VIEWPUBOBJ);
    }

    @JsonIgnore
    public void resetV2ViewPubObj() {
        this._reset(DTOFIELD_V2VIEWPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO v2viewpubobj(String v2ViewPubObj) {
        this.setV2ViewPubObj(v2ViewPubObj);
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
    public PSPFDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSPFDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewpubobj")
    public void setViewPubObj(String viewPubObj) {
        this._set(DTOFIELD_VIEWPUBOBJ, viewPubObj);
    }

    @JsonIgnore
    public String getViewPubObj() {
        Object objValue = this._get(DTOFIELD_VIEWPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewPubObjDirty() {
        return this._contains(DTOFIELD_VIEWPUBOBJ);
    }

    @JsonIgnore
    public void resetViewPubObj() {
        this._reset(DTOFIELD_VIEWPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO viewpubobj(String viewPubObj) {
        this.setViewPubObj(viewPubObj);
        return this;
    }

    @JsonProperty(value="vlpubobj")
    public void setVLPubObj(String vLPubObj) {
        this._set(DTOFIELD_VLPUBOBJ, vLPubObj);
    }

    @JsonIgnore
    public String getVLPubObj() {
        Object objValue = this._get(DTOFIELD_VLPUBOBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVLPubObjDirty() {
        return this._contains(DTOFIELD_VLPUBOBJ);
    }

    @JsonIgnore
    public void resetVLPubObj() {
        this._reset(DTOFIELD_VLPUBOBJ);
    }

    @JsonIgnore
    public PSPFDTO vlpubobj(String vLPubObj) {
        this.setVLPubObj(vLPubObj);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSPFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSPFId(strValue);
    }

    @JsonIgnore
    public PSPFDTO id(String strValue) {
        this.setPSPFId(strValue);
        return this;
    }
}
