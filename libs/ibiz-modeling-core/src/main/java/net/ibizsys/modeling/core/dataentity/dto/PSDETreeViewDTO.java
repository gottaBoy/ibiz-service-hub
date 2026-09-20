package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeViewDTO
extends PSModelDTOBase {
    public static final String FIELD_BUFFERRENDERERMODE = "BUFFERRENDERERMODE";
    protected static final String DTOFIELD_BUFFERRENDERERMODE = "bufferrenderermode";
    public static final String FIELD_BUSYINDICATOR = "BUSYINDICATOR";
    protected static final String DTOFIELD_BUSYINDICATOR = "busyindicator";
    public static final String FIELD_CATPSCODELISTID = "CATPSCODELISTID";
    protected static final String DTOFIELD_CATPSCODELISTID = "catpscodelistid";
    public static final String FIELD_CATPSCODELISTNAME = "CATPSCODELISTNAME";
    protected static final String DTOFIELD_CATPSCODELISTNAME = "catpscodelistname";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COLENABLEFILTER = "COLENABLEFILTER";
    protected static final String DTOFIELD_COLENABLEFILTER = "colenablefilter";
    public static final String FIELD_COLENABLELINK = "COLENABLELINK";
    protected static final String DTOFIELD_COLENABLELINK = "colenablelink";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_ENABLEEDIT = "ENABLEEDIT";
    protected static final String DTOFIELD_ENABLEEDIT = "enableedit";
    public static final String FIELD_ENABLEITEMPRIV = "ENABLEITEMPRIV";
    protected static final String DTOFIELD_ENABLEITEMPRIV = "enableitempriv";
    public static final String FIELD_ENABLESEARCH = "ENABLESEARCH";
    protected static final String DTOFIELD_ENABLESEARCH = "enablesearch";
    public static final String FIELD_FROZENCOL = "FROZENCOL";
    protected static final String DTOFIELD_FROZENCOL = "frozencol";
    public static final String FIELD_FROZENLASTCOL = "FROZENLASTCOL";
    protected static final String DTOFIELD_FROZENLASTCOL = "frozenlastcol";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NAVVIEWHEIGHT = "NAVVIEWHEIGHT";
    protected static final String DTOFIELD_NAVVIEWHEIGHT = "navviewheight";
    public static final String FIELD_NAVVIEWMAXHEIGHT = "NAVVIEWMAXHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMAXHEIGHT = "navviewmaxheight";
    public static final String FIELD_NAVVIEWMAXWIDTH = "NAVVIEWMAXWIDTH";
    protected static final String DTOFIELD_NAVVIEWMAXWIDTH = "navviewmaxwidth";
    public static final String FIELD_NAVVIEWMINHEIGHT = "NAVVIEWMINHEIGHT";
    protected static final String DTOFIELD_NAVVIEWMINHEIGHT = "navviewminheight";
    public static final String FIELD_NAVVIEWMINWIDTH = "NAVVIEWMINWIDTH";
    protected static final String DTOFIELD_NAVVIEWMINWIDTH = "navviewminwidth";
    public static final String FIELD_NAVVIEWPOS = "NAVVIEWPOS";
    protected static final String DTOFIELD_NAVVIEWPOS = "navviewpos";
    public static final String FIELD_NAVVIEWSHOWMODE = "NAVVIEWSHOWMODE";
    protected static final String DTOFIELD_NAVVIEWSHOWMODE = "navviewshowmode";
    public static final String FIELD_NAVVIEWWIDTH = "NAVVIEWWIDTH";
    protected static final String DTOFIELD_NAVVIEWWIDTH = "navviewwidth";
    public static final String FIELD_NOICONDEFAULT = "NOICONDEFAULT";
    protected static final String DTOFIELD_NOICONDEFAULT = "noicondefault";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSCTRLMSGID = "PSCTRLMSGID";
    protected static final String DTOFIELD_PSCTRLMSGID = "psctrlmsgid";
    public static final String FIELD_PSCTRLMSGNAME = "PSCTRLMSGNAME";
    protected static final String DTOFIELD_PSCTRLMSGNAME = "psctrlmsgname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSVIEWMSGGROUPID = "PSVIEWMSGGROUPID";
    protected static final String DTOFIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";
    public static final String FIELD_PSVIEWMSGGROUPNAME = "PSVIEWMSGGROUPNAME";
    protected static final String DTOFIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";
    public static final String FIELD_ROOTSELECT = "ROOTSELECT";
    protected static final String DTOFIELD_ROOTSELECT = "rootselect";
    public static final String FIELD_SHOWROOT = "SHOWROOT";
    protected static final String DTOFIELD_SHOWROOT = "showroot";
    public static final String FIELD_TREEGRIDFLAG = "TREEGRIDFLAG";
    protected static final String DTOFIELD_TREEGRIDFLAG = "treegridflag";
    public static final String FIELD_TREESTYLE = "TREESTYLE";
    protected static final String DTOFIELD_TREESTYLE = "treestyle";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSDETREECOLS = "psdetreecols";
    public static final String DTOFIELD_PSDETREENODES = "psdetreenodes";
    public static final String DTOFIELD_PSDETEIUPDATES = "psdeteiupdates";
    public static final String DTOFIELD_PSDETREENODERS = "psdetreenoders";
    public static final String DTOFIELD_PSDETREELOGICS = "psdetreelogics";

    @JsonProperty(value="bufferrenderermode")
    public void setBufferRendererMode(Integer bufferRendererMode) {
        this._set(DTOFIELD_BUFFERRENDERERMODE, bufferRendererMode);
    }

    @JsonIgnore
    public Integer getBufferRendererMode() {
        Object objValue = this._get(DTOFIELD_BUFFERRENDERERMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBufferRendererModeDirty() {
        return this._contains(DTOFIELD_BUFFERRENDERERMODE);
    }

    @JsonIgnore
    public void resetBufferRendererMode() {
        this._reset(DTOFIELD_BUFFERRENDERERMODE);
    }

    @JsonIgnore
    public PSDETreeViewDTO bufferrenderermode(Integer bufferRendererMode) {
        this.setBufferRendererMode(bufferRendererMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO bufferrenderermode(Boolean bufferRendererMode) {
        if (bufferRendererMode == null) {
            this.setBufferRendererMode(null);
        } else {
            this.setBufferRendererMode(bufferRendererMode != false ? 1 : 0);
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
    public PSDETreeViewDTO busyindicator(Integer busyIndicator) {
        this.setBusyIndicator(busyIndicator);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO busyindicator(Boolean busyIndicator) {
        if (busyIndicator == null) {
            this.setBusyIndicator(null);
        } else {
            this.setBusyIndicator(busyIndicator != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="catpscodelistid")
    public void setCatPSCodeListId(String catPSCodeListId) {
        this._set(DTOFIELD_CATPSCODELISTID, catPSCodeListId);
    }

    @JsonIgnore
    public String getCatPSCodeListId() {
        Object objValue = this._get(DTOFIELD_CATPSCODELISTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCatPSCodeListIdDirty() {
        return this._contains(DTOFIELD_CATPSCODELISTID);
    }

    @JsonIgnore
    public void resetCatPSCodeListId() {
        this._reset(DTOFIELD_CATPSCODELISTID);
    }

    @JsonIgnore
    public PSDETreeViewDTO catpscodelistid(String catPSCodeListId) {
        this.setCatPSCodeListId(catPSCodeListId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO catpscodelistid(PSCodeListDTO pSCodeList) {
        if (pSCodeList == null) {
            this.setCatPSCodeListId(null);
            this.setCatPSCodeListName(null);
        } else {
            this.setCatPSCodeListId(pSCodeList.getPSCodeListId());
            this.setCatPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    @JsonProperty(value="catpscodelistname")
    public void setCatPSCodeListName(String catPSCodeListName) {
        this._set(DTOFIELD_CATPSCODELISTNAME, catPSCodeListName);
    }

    @JsonIgnore
    public String getCatPSCodeListName() {
        Object objValue = this._get(DTOFIELD_CATPSCODELISTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCatPSCodeListNameDirty() {
        return this._contains(DTOFIELD_CATPSCODELISTNAME);
    }

    @JsonIgnore
    public void resetCatPSCodeListName() {
        this._reset(DTOFIELD_CATPSCODELISTNAME);
    }

    @JsonIgnore
    public PSDETreeViewDTO catpscodelistname(String catPSCodeListName) {
        this.setCatPSCodeListName(catPSCodeListName);
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
    public PSDETreeViewDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="colenablefilter")
    public void setColEnableFilter(Integer colEnableFilter) {
        this._set(DTOFIELD_COLENABLEFILTER, colEnableFilter);
    }

    @JsonIgnore
    public Integer getColEnableFilter() {
        Object objValue = this._get(DTOFIELD_COLENABLEFILTER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColEnableFilterDirty() {
        return this._contains(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public void resetColEnableFilter() {
        this._reset(DTOFIELD_COLENABLEFILTER);
    }

    @JsonIgnore
    public PSDETreeViewDTO colenablefilter(Integer colEnableFilter) {
        this.setColEnableFilter(colEnableFilter);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO colenablefilter(PSModelEnums.DEGridColLinkMode colEnableFilter) {
        if (colEnableFilter == null) {
            this.setColEnableFilter(null);
        } else {
            this.setColEnableFilter(colEnableFilter.value);
        }
        return this;
    }

    @JsonProperty(value="colenablelink")
    public void setColEnableLink(Integer colEnableLink) {
        this._set(DTOFIELD_COLENABLELINK, colEnableLink);
    }

    @JsonIgnore
    public Integer getColEnableLink() {
        Object objValue = this._get(DTOFIELD_COLENABLELINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColEnableLinkDirty() {
        return this._contains(DTOFIELD_COLENABLELINK);
    }

    @JsonIgnore
    public void resetColEnableLink() {
        this._reset(DTOFIELD_COLENABLELINK);
    }

    @JsonIgnore
    public PSDETreeViewDTO colenablelink(Integer colEnableLink) {
        this.setColEnableLink(colEnableLink);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO colenablelink(PSModelEnums.DEGridColLinkMode colEnableLink) {
        if (colEnableLink == null) {
            this.setColEnableLink(null);
        } else {
            this.setColEnableLink(colEnableLink.value);
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
    public PSDETreeViewDTO createdate(Timestamp createDate) {
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
    public PSDETreeViewDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSDETreeViewDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="enableedit")
    public void setEnableEdit(Integer enableEdit) {
        this._set(DTOFIELD_ENABLEEDIT, enableEdit);
    }

    @JsonIgnore
    public Integer getEnableEdit() {
        Object objValue = this._get(DTOFIELD_ENABLEEDIT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableEditDirty() {
        return this._contains(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public void resetEnableEdit() {
        this._reset(DTOFIELD_ENABLEEDIT);
    }

    @JsonIgnore
    public PSDETreeViewDTO enableedit(Integer enableEdit) {
        this.setEnableEdit(enableEdit);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO enableedit(Boolean enableEdit) {
        if (enableEdit == null) {
            this.setEnableEdit(null);
        } else {
            this.setEnableEdit(enableEdit != false ? 1 : 0);
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
    public PSDETreeViewDTO enableitempriv(Integer enableItemPriv) {
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO enableitempriv(Boolean enableItemPriv) {
        if (enableItemPriv == null) {
            this.setEnableItemPriv(null);
        } else {
            this.setEnableItemPriv(enableItemPriv != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesearch")
    public void setEnableSearch(Integer enableSearch) {
        this._set(DTOFIELD_ENABLESEARCH, enableSearch);
    }

    @JsonIgnore
    public Integer getEnableSearch() {
        Object objValue = this._get(DTOFIELD_ENABLESEARCH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSearchDirty() {
        return this._contains(DTOFIELD_ENABLESEARCH);
    }

    @JsonIgnore
    public void resetEnableSearch() {
        this._reset(DTOFIELD_ENABLESEARCH);
    }

    @JsonIgnore
    public PSDETreeViewDTO enablesearch(Integer enableSearch) {
        this.setEnableSearch(enableSearch);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO enablesearch(Boolean enableSearch) {
        if (enableSearch == null) {
            this.setEnableSearch(null);
        } else {
            this.setEnableSearch(enableSearch != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="frozencol")
    public void setFrozenCol(Integer frozenCol) {
        this._set(DTOFIELD_FROZENCOL, frozenCol);
    }

    @JsonIgnore
    public Integer getFrozenCol() {
        Object objValue = this._get(DTOFIELD_FROZENCOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFrozenColDirty() {
        return this._contains(DTOFIELD_FROZENCOL);
    }

    @JsonIgnore
    public void resetFrozenCol() {
        this._reset(DTOFIELD_FROZENCOL);
    }

    @JsonIgnore
    public PSDETreeViewDTO frozencol(Integer frozenCol) {
        this.setFrozenCol(frozenCol);
        return this;
    }

    @JsonProperty(value="frozenlastcol")
    public void setFrozenLastCol(Integer frozenLastCol) {
        this._set(DTOFIELD_FROZENLASTCOL, frozenLastCol);
    }

    @JsonIgnore
    public Integer getFrozenLastCol() {
        Object objValue = this._get(DTOFIELD_FROZENLASTCOL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFrozenLastColDirty() {
        return this._contains(DTOFIELD_FROZENLASTCOL);
    }

    @JsonIgnore
    public void resetFrozenLastCol() {
        this._reset(DTOFIELD_FROZENLASTCOL);
    }

    @JsonIgnore
    public PSDETreeViewDTO frozenlastcol(Integer frozenLastCol) {
        this.setFrozenLastCol(frozenLastCol);
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
    public PSDETreeViewDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="navviewheight")
    public void setNavViewHeight(Double navViewHeight) {
        this._set(DTOFIELD_NAVVIEWHEIGHT, navViewHeight);
    }

    @JsonIgnore
    public Double getNavViewHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewHeight() {
        this._reset(DTOFIELD_NAVVIEWHEIGHT);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewheight(Double navViewHeight) {
        this.setNavViewHeight(navViewHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxheight")
    public void setNavViewMaxHeight(Double navViewMaxHeight) {
        this._set(DTOFIELD_NAVVIEWMAXHEIGHT, navViewMaxHeight);
    }

    @JsonIgnore
    public Double getNavViewMaxHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMaxHeight() {
        this._reset(DTOFIELD_NAVVIEWMAXHEIGHT);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewmaxheight(Double navViewMaxHeight) {
        this.setNavViewMaxHeight(navViewMaxHeight);
        return this;
    }

    @JsonProperty(value="navviewmaxwidth")
    public void setNavViewMaxWidth(Double navViewMaxWidth) {
        this._set(DTOFIELD_NAVVIEWMAXWIDTH, navViewMaxWidth);
    }

    @JsonIgnore
    public Double getNavViewMaxWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMAXWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMaxWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMaxWidth() {
        this._reset(DTOFIELD_NAVVIEWMAXWIDTH);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewmaxwidth(Double navViewMaxWidth) {
        this.setNavViewMaxWidth(navViewMaxWidth);
        return this;
    }

    @JsonProperty(value="navviewminheight")
    public void setNavViewMinHeight(Double navViewMinHeight) {
        this._set(DTOFIELD_NAVVIEWMINHEIGHT, navViewMinHeight);
    }

    @JsonIgnore
    public Double getNavViewMinHeight() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINHEIGHT);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinHeightDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public void resetNavViewMinHeight() {
        this._reset(DTOFIELD_NAVVIEWMINHEIGHT);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewminheight(Double navViewMinHeight) {
        this.setNavViewMinHeight(navViewMinHeight);
        return this;
    }

    @JsonProperty(value="navviewminwidth")
    public void setNavViewMinWidth(Double navViewMinWidth) {
        this._set(DTOFIELD_NAVVIEWMINWIDTH, navViewMinWidth);
    }

    @JsonIgnore
    public Double getNavViewMinWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWMINWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewMinWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public void resetNavViewMinWidth() {
        this._reset(DTOFIELD_NAVVIEWMINWIDTH);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewminwidth(Double navViewMinWidth) {
        this.setNavViewMinWidth(navViewMinWidth);
        return this;
    }

    @JsonProperty(value="navviewpos")
    public void setNavViewPos(String navViewPos) {
        this._set(DTOFIELD_NAVVIEWPOS, navViewPos);
    }

    @JsonIgnore
    public String getNavViewPos() {
        Object objValue = this._get(DTOFIELD_NAVVIEWPOS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNavViewPosDirty() {
        return this._contains(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public void resetNavViewPos() {
        this._reset(DTOFIELD_NAVVIEWPOS);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewpos(String navViewPos) {
        this.setNavViewPos(navViewPos);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewpos(PSModelEnums.NavViewPos navViewPos) {
        if (navViewPos == null) {
            this.setNavViewPos(null);
        } else {
            this.setNavViewPos(navViewPos.value);
        }
        return this;
    }

    @JsonProperty(value="navviewshowmode")
    public void setNavViewShowMode(Integer navViewShowMode) {
        this._set(DTOFIELD_NAVVIEWSHOWMODE, navViewShowMode);
    }

    @JsonIgnore
    public Integer getNavViewShowMode() {
        Object objValue = this._get(DTOFIELD_NAVVIEWSHOWMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNavViewShowModeDirty() {
        return this._contains(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public void resetNavViewShowMode() {
        this._reset(DTOFIELD_NAVVIEWSHOWMODE);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewshowmode(Integer navViewShowMode) {
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewshowmode(PSModelEnums.NavViewShowMode navViewShowMode) {
        if (navViewShowMode == null) {
            this.setNavViewShowMode(null);
        } else {
            this.setNavViewShowMode(navViewShowMode.value);
        }
        return this;
    }

    @JsonProperty(value="navviewwidth")
    public void setNavViewWidth(Double navViewWidth) {
        this._set(DTOFIELD_NAVVIEWWIDTH, navViewWidth);
    }

    @JsonIgnore
    public Double getNavViewWidth() {
        Object objValue = this._get(DTOFIELD_NAVVIEWWIDTH);
        if (objValue == null) {
            return null;
        }
        return (Double)objValue;
    }

    @JsonIgnore
    public boolean isNavViewWidthDirty() {
        return this._contains(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public void resetNavViewWidth() {
        this._reset(DTOFIELD_NAVVIEWWIDTH);
    }

    @JsonIgnore
    public PSDETreeViewDTO navviewwidth(Double navViewWidth) {
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    @JsonProperty(value="noicondefault")
    public void setNoIconDefault(Integer noIconDefault) {
        this._set(DTOFIELD_NOICONDEFAULT, noIconDefault);
    }

    @JsonIgnore
    public Integer getNoIconDefault() {
        Object objValue = this._get(DTOFIELD_NOICONDEFAULT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoIconDefaultDirty() {
        return this._contains(DTOFIELD_NOICONDEFAULT);
    }

    @JsonIgnore
    public void resetNoIconDefault() {
        this._reset(DTOFIELD_NOICONDEFAULT);
    }

    @JsonIgnore
    public PSDETreeViewDTO noicondefault(Integer noIconDefault) {
        this.setNoIconDefault(noIconDefault);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO noicondefault(Boolean noIconDefault) {
        if (noIconDefault == null) {
            this.setNoIconDefault(null);
        } else {
            this.setNoIconDefault(noIconDefault != false ? 1 : 0);
        }
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
    public PSDETreeViewDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO psachandlerid(PSACHandlerDTO pSACHandler) {
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
    public PSDETreeViewDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
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
    public PSDETreeViewDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
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
    public PSDETreeViewDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    @JsonProperty(value="psctrlmsgid")
    public void setPSCtrlMsgId(String pSCtrlMsgId) {
        this._set(DTOFIELD_PSCTRLMSGID, pSCtrlMsgId);
    }

    @JsonIgnore
    public String getPSCtrlMsgId() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public void resetPSCtrlMsgId() {
        this._reset(DTOFIELD_PSCTRLMSGID);
    }

    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgid(String pSCtrlMsgId) {
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg) {
        if (pSCtrlMsg == null) {
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        } else {
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    @JsonProperty(value="psctrlmsgname")
    public void setPSCtrlMsgName(String pSCtrlMsgName) {
        this._set(DTOFIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }

    @JsonIgnore
    public String getPSCtrlMsgName() {
        Object objValue = this._get(DTOFIELD_PSCTRLMSGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty() {
        return this._contains(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public void resetPSCtrlMsgName() {
        this._reset(DTOFIELD_PSCTRLMSGNAME);
    }

    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgname(String pSCtrlMsgName) {
        this.setPSCtrlMsgName(pSCtrlMsgName);
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
    public PSDETreeViewDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDETreeViewDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
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
    public PSDETreeViewDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
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
    public PSDETreeViewDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeViewName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeViewName(strName);
    }

    @JsonIgnore
    public PSDETreeViewDTO name(String strName) {
        this.setPSDETreeViewName(strName);
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
    public PSDETreeViewDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
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
    public PSDETreeViewDTO pssyscountername(String pSSysCounterName) {
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
    public PSDETreeViewDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO pssyscssid(PSSysCssDTO pSSysCss) {
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
    public PSDETreeViewDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSDETreeViewDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDETreeViewDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="psviewmsggroupid")
    public void setPSViewMsgGroupId(String pSViewMsgGroupId) {
        this._set(DTOFIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }

    @JsonIgnore
    public String getPSViewMsgGroupId() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupId() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPID);
    }

    @JsonIgnore
    public PSDETreeViewDTO psviewmsggroupid(String pSViewMsgGroupId) {
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup) {
        if (pSViewMsgGroup == null) {
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        } else {
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    @JsonProperty(value="psviewmsggroupname")
    public void setPSViewMsgGroupName(String pSViewMsgGroupName) {
        this._set(DTOFIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }

    @JsonIgnore
    public String getPSViewMsgGroupName() {
        Object objValue = this._get(DTOFIELD_PSVIEWMSGGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty() {
        return this._contains(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public void resetPSViewMsgGroupName() {
        this._reset(DTOFIELD_PSVIEWMSGGROUPNAME);
    }

    @JsonIgnore
    public PSDETreeViewDTO psviewmsggroupname(String pSViewMsgGroupName) {
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonProperty(value="rootselect")
    public void setRootSelect(Integer rootSelect) {
        this._set(DTOFIELD_ROOTSELECT, rootSelect);
    }

    @JsonIgnore
    public Integer getRootSelect() {
        Object objValue = this._get(DTOFIELD_ROOTSELECT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRootSelectDirty() {
        return this._contains(DTOFIELD_ROOTSELECT);
    }

    @JsonIgnore
    public void resetRootSelect() {
        this._reset(DTOFIELD_ROOTSELECT);
    }

    @JsonIgnore
    public PSDETreeViewDTO rootselect(Integer rootSelect) {
        this.setRootSelect(rootSelect);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO rootselect(Boolean rootSelect) {
        if (rootSelect == null) {
            this.setRootSelect(null);
        } else {
            this.setRootSelect(rootSelect != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="showroot")
    public void setShowRoot(Integer showRoot) {
        this._set(DTOFIELD_SHOWROOT, showRoot);
    }

    @JsonIgnore
    public Integer getShowRoot() {
        Object objValue = this._get(DTOFIELD_SHOWROOT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShowRootDirty() {
        return this._contains(DTOFIELD_SHOWROOT);
    }

    @JsonIgnore
    public void resetShowRoot() {
        this._reset(DTOFIELD_SHOWROOT);
    }

    @JsonIgnore
    public PSDETreeViewDTO showroot(Integer showRoot) {
        this.setShowRoot(showRoot);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO showroot(Boolean showRoot) {
        if (showRoot == null) {
            this.setShowRoot(null);
        } else {
            this.setShowRoot(showRoot != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="treegridflag")
    public void setTreeGridFlag(Integer treeGridFlag) {
        this._set(DTOFIELD_TREEGRIDFLAG, treeGridFlag);
    }

    @JsonIgnore
    public Integer getTreeGridFlag() {
        Object objValue = this._get(DTOFIELD_TREEGRIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTreeGridFlagDirty() {
        return this._contains(DTOFIELD_TREEGRIDFLAG);
    }

    @JsonIgnore
    public void resetTreeGridFlag() {
        this._reset(DTOFIELD_TREEGRIDFLAG);
    }

    @JsonIgnore
    public PSDETreeViewDTO treegridflag(Integer treeGridFlag) {
        this.setTreeGridFlag(treeGridFlag);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO treegridflag(PSModelEnums.TreeGridMode treeGridFlag) {
        if (treeGridFlag == null) {
            this.setTreeGridFlag(null);
        } else {
            this.setTreeGridFlag(treeGridFlag.value);
        }
        return this;
    }

    @JsonProperty(value="treestyle")
    public void setTreeStyle(String treeStyle) {
        this._set(DTOFIELD_TREESTYLE, treeStyle);
    }

    @JsonIgnore
    public String getTreeStyle() {
        Object objValue = this._get(DTOFIELD_TREESTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTreeStyleDirty() {
        return this._contains(DTOFIELD_TREESTYLE);
    }

    @JsonIgnore
    public void resetTreeStyle() {
        this._reset(DTOFIELD_TREESTYLE);
    }

    @JsonIgnore
    public PSDETreeViewDTO treestyle(String treeStyle) {
        this.setTreeStyle(treeStyle);
        return this;
    }

    @JsonIgnore
    public PSDETreeViewDTO treestyle(PSModelEnums.TreeStyle treeStyle) {
        if (treeStyle == null) {
            this.setTreeStyle(null);
        } else {
            this.setTreeStyle(treeStyle.value);
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
    public PSDETreeViewDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeViewDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeViewId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeViewId(strValue);
    }

    @JsonIgnore
    public PSDETreeViewDTO id(String strValue) {
        this.setPSDETreeViewId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDETreeColDTO> getPSDETreeCols() {
        Object list = this._get(DTOFIELD_PSDETREECOLS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreecols")
    public void setPSDETreeCols(List<PSDETreeColDTO> psdetreecols) {
        this._set(DTOFIELD_PSDETREECOLS, psdetreecols);
    }

    @JsonIgnore
    public List<PSDETreeColDTO> getPSDETreeColsIf() {
        Object list = this._get(DTOFIELD_PSDETREECOLS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREECOLS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDETreeNodeDTO> getPSDETreeNodes() {
        Object list = this._get(DTOFIELD_PSDETREENODES);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreenodes")
    public void setPSDETreeNodes(List<PSDETreeNodeDTO> psdetreenodes) {
        this._set(DTOFIELD_PSDETREENODES, psdetreenodes);
    }

    @JsonIgnore
    public List<PSDETreeNodeDTO> getPSDETreeNodesIf() {
        Object list = this._get(DTOFIELD_PSDETREENODES);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREENODES, list);
        }
        return (List) list;
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
    public List<PSDETreeNodeRSDTO> getPSDETreeNodeRs() {
        Object list = this._get(DTOFIELD_PSDETREENODERS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreenoders")
    public void setPSDETreeNodeRs(List<PSDETreeNodeRSDTO> psdetreenoders) {
        this._set(DTOFIELD_PSDETREENODERS, psdetreenoders);
    }

    @JsonIgnore
    public List<PSDETreeNodeRSDTO> getPSDETreeNodeRsIf() {
        Object list = this._get(DTOFIELD_PSDETREENODERS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREENODERS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDETreeLogicDTO> getPSDETreeLogics() {
        Object list = this._get(DTOFIELD_PSDETREELOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdetreelogics")
    public void setPSDETreeLogics(List<PSDETreeLogicDTO> psdetreelogics) {
        this._set(DTOFIELD_PSDETREELOGICS, psdetreelogics);
    }

    @JsonIgnore
    public List<PSDETreeLogicDTO> getPSDETreeLogicsIf() {
        Object list = this._get(DTOFIELD_PSDETREELOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDETREELOGICS, list);
        }
        return (List) list;
    }
}
