package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEViewRVDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFVIEWTYPE = "DEFVIEWTYPE";
    protected static final String DTOFIELD_DEFVIEWTYPE = "defviewtype";
    public static final String FIELD_HEIGHT = "HEIGHT";
    protected static final String DTOFIELD_HEIGHT = "height";
    public static final String FIELD_MAJORPSDEVIEWID = "MAJORPSDEVIEWID";
    protected static final String DTOFIELD_MAJORPSDEVIEWID = "majorpsdeviewid";
    public static final String FIELD_MAJORPSDEVIEWNAME = "MAJORPSDEVIEWNAME";
    protected static final String DTOFIELD_MAJORPSDEVIEWNAME = "majorpsdeviewname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDEVIEWID = "MINORPSDEVIEWID";
    protected static final String DTOFIELD_MINORPSDEVIEWID = "minorpsdeviewid";
    public static final String FIELD_MINORPSDEVIEWNAME = "MINORPSDEVIEWNAME";
    protected static final String DTOFIELD_MINORPSDEVIEWNAME = "minorpsdeviewname";
    public static final String FIELD_OPENMODE = "OPENMODE";
    protected static final String DTOFIELD_OPENMODE = "openmode";
    public static final String FIELD_PSDEVIEWRVID = "PSDEVIEWRVID";
    protected static final String DTOFIELD_PSDEVIEWRVID = "psdeviewrvid";
    public static final String FIELD_PSDEVIEWRVNAME = "PSDEVIEWRVNAME";
    protected static final String DTOFIELD_PSDEVIEWRVNAME = "psdeviewrvname";
    public static final String FIELD_REFMODE = "REFMODE";
    protected static final String DTOFIELD_REFMODE = "refmode";
    public static final String FIELD_REFPARAM = "REFPARAM";
    protected static final String DTOFIELD_REFPARAM = "refparam";
    public static final String FIELD_TITLE = "TITLE";
    protected static final String DTOFIELD_TITLE = "title";
    public static final String FIELD_TITLEPSLANRESID = "TITLEPSLANRESID";
    protected static final String DTOFIELD_TITLEPSLANRESID = "titlepslanresid";
    public static final String FIELD_TITLEPSLANRESNAME = "TITLEPSLANRESNAME";
    protected static final String DTOFIELD_TITLEPSLANRESNAME = "titlepslanresname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VIEWPARAMS = "VIEWPARAMS";
    protected static final String DTOFIELD_VIEWPARAMS = "viewparams";
    public static final String FIELD_WIDTH = "WIDTH";
    protected static final String DTOFIELD_WIDTH = "width";

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
    public PSDEViewRVDTO createdate(Timestamp createDate) {
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
    public PSDEViewRVDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defviewtype")
    public void setDefViewType(String defViewType) {
        this._set(DTOFIELD_DEFVIEWTYPE, defViewType);
    }

    @JsonIgnore
    public String getDefViewType() {
        Object objValue = this._get(DTOFIELD_DEFVIEWTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefViewTypeDirty() {
        return this._contains(DTOFIELD_DEFVIEWTYPE);
    }

    @JsonIgnore
    public void resetDefViewType() {
        this._reset(DTOFIELD_DEFVIEWTYPE);
    }

    @JsonIgnore
    public PSDEViewRVDTO defviewtype(String defViewType) {
        this.setDefViewType(defViewType);
        return this;
    }

    @JsonIgnore
    public PSDEViewRVDTO defviewtype(PSModelEnums.PredefinedViewType defViewType) {
        if (defViewType == null) {
            this.setDefViewType(null);
        } else {
            this.setDefViewType(defViewType.value);
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
    public PSDEViewRVDTO height(Integer height) {
        this.setHeight(height);
        return this;
    }

    @JsonProperty(value="majorpsdeviewid")
    public void setMajorPSDEViewId(String majorPSDEViewId) {
        this._set(DTOFIELD_MAJORPSDEVIEWID, majorPSDEViewId);
    }

    @JsonIgnore
    public String getMajorPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMajorPSDEViewId() {
        this._reset(DTOFIELD_MAJORPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEViewRVDTO majorpsdeviewid(String majorPSDEViewId) {
        this.setMajorPSDEViewId(majorPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewRVDTO majorpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMajorPSDEViewId(null);
            this.setMajorPSDEViewName(null);
        } else {
            this.setMajorPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMajorPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="majorpsdeviewname")
    public void setMajorPSDEViewName(String majorPSDEViewName) {
        this._set(DTOFIELD_MAJORPSDEVIEWNAME, majorPSDEViewName);
    }

    @JsonIgnore
    public String getMajorPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MAJORPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMajorPSDEViewName() {
        this._reset(DTOFIELD_MAJORPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEViewRVDTO majorpsdeviewname(String majorPSDEViewName) {
        this.setMajorPSDEViewName(majorPSDEViewName);
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
    public PSDEViewRVDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsdeviewid")
    public void setMinorPSDEViewId(String minorPSDEViewId) {
        this._set(DTOFIELD_MINORPSDEVIEWID, minorPSDEViewId);
    }

    @JsonIgnore
    public String getMinorPSDEViewId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEViewIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEVIEWID);
    }

    @JsonIgnore
    public void resetMinorPSDEViewId() {
        this._reset(DTOFIELD_MINORPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEViewRVDTO minorpsdeviewid(String minorPSDEViewId) {
        this.setMinorPSDEViewId(minorPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEViewRVDTO minorpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setMinorPSDEViewId(null);
            this.setMinorPSDEViewName(null);
        } else {
            this.setMinorPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMinorPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="minorpsdeviewname")
    public void setMinorPSDEViewName(String minorPSDEViewName) {
        this._set(DTOFIELD_MINORPSDEVIEWNAME, minorPSDEViewName);
    }

    @JsonIgnore
    public String getMinorPSDEViewName() {
        Object objValue = this._get(DTOFIELD_MINORPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEViewNameDirty() {
        return this._contains(DTOFIELD_MINORPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetMinorPSDEViewName() {
        this._reset(DTOFIELD_MINORPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEViewRVDTO minorpsdeviewname(String minorPSDEViewName) {
        this.setMinorPSDEViewName(minorPSDEViewName);
        return this;
    }

    @JsonProperty(value="openmode")
    public void setOpenMode(String openMode) {
        this._set(DTOFIELD_OPENMODE, openMode);
    }

    @JsonIgnore
    public String getOpenMode() {
        Object objValue = this._get(DTOFIELD_OPENMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenModeDirty() {
        return this._contains(DTOFIELD_OPENMODE);
    }

    @JsonIgnore
    public void resetOpenMode() {
        this._reset(DTOFIELD_OPENMODE);
    }

    @JsonIgnore
    public PSDEViewRVDTO openmode(String openMode) {
        this.setOpenMode(openMode);
        return this;
    }

    @JsonIgnore
    public PSDEViewRVDTO openmode(PSModelEnums.OpenViewMode openMode) {
        if (openMode == null) {
            this.setOpenMode(null);
        } else {
            this.setOpenMode(openMode.value);
        }
        return this;
    }

    @JsonProperty(value="psdeviewrvid")
    public void setPSDEViewRVId(String pSDEViewRVId) {
        this._set(DTOFIELD_PSDEVIEWRVID, pSDEViewRVId);
    }

    @JsonIgnore
    public String getPSDEViewRVId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWRVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewRVIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWRVID);
    }

    @JsonIgnore
    public void resetPSDEViewRVId() {
        this._reset(DTOFIELD_PSDEVIEWRVID);
    }

    @JsonIgnore
    public PSDEViewRVDTO psdeviewrvid(String pSDEViewRVId) {
        this.setPSDEViewRVId(pSDEViewRVId);
        return this;
    }

    @JsonProperty(value="psdeviewrvname")
    public void setPSDEViewRVName(String pSDEViewRVName) {
        this._set(DTOFIELD_PSDEVIEWRVNAME, pSDEViewRVName);
    }

    @JsonIgnore
    public String getPSDEViewRVName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWRVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewRVNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWRVNAME);
    }

    @JsonIgnore
    public void resetPSDEViewRVName() {
        this._reset(DTOFIELD_PSDEVIEWRVNAME);
    }

    @JsonIgnore
    public PSDEViewRVDTO psdeviewrvname(String pSDEViewRVName) {
        this.setPSDEViewRVName(pSDEViewRVName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEViewRVName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEViewRVName(strName);
    }

    @JsonIgnore
    public PSDEViewRVDTO name(String strName) {
        this.setPSDEViewRVName(strName);
        return this;
    }

    @JsonProperty(value="refmode")
    public void setRefMode(String refMode) {
        this._set(DTOFIELD_REFMODE, refMode);
    }

    @JsonIgnore
    public String getRefMode() {
        Object objValue = this._get(DTOFIELD_REFMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefModeDirty() {
        return this._contains(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public void resetRefMode() {
        this._reset(DTOFIELD_REFMODE);
    }

    @JsonIgnore
    public PSDEViewRVDTO refmode(String refMode) {
        this.setRefMode(refMode);
        return this;
    }

    @JsonProperty(value="refparam")
    public void setRefParam(String refParam) {
        this._set(DTOFIELD_REFPARAM, refParam);
    }

    @JsonIgnore
    public String getRefParam() {
        Object objValue = this._get(DTOFIELD_REFPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefParamDirty() {
        return this._contains(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public void resetRefParam() {
        this._reset(DTOFIELD_REFPARAM);
    }

    @JsonIgnore
    public PSDEViewRVDTO refparam(String refParam) {
        this.setRefParam(refParam);
        return this;
    }

    @JsonProperty(value="title")
    public void setTitle(String title) {
        this._set(DTOFIELD_TITLE, title);
    }

    @JsonIgnore
    public String getTitle() {
        Object objValue = this._get(DTOFIELD_TITLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitleDirty() {
        return this._contains(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public void resetTitle() {
        this._reset(DTOFIELD_TITLE);
    }

    @JsonIgnore
    public PSDEViewRVDTO title(String title) {
        this.setTitle(title);
        return this;
    }

    @JsonProperty(value="titlepslanresid")
    public void setTitlePSLanResId(String titlePSLanResId) {
        this._set(DTOFIELD_TITLEPSLANRESID, titlePSLanResId);
    }

    @JsonIgnore
    public String getTitlePSLanResId() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResIdDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public void resetTitlePSLanResId() {
        this._reset(DTOFIELD_TITLEPSLANRESID);
    }

    @JsonIgnore
    public PSDEViewRVDTO titlepslanresid(String titlePSLanResId) {
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEViewRVDTO titlepslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        } else {
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="titlepslanresname")
    public void setTitlePSLanResName(String titlePSLanResName) {
        this._set(DTOFIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }

    @JsonIgnore
    public String getTitlePSLanResName() {
        Object objValue = this._get(DTOFIELD_TITLEPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTitlePSLanResNameDirty() {
        return this._contains(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public void resetTitlePSLanResName() {
        this._reset(DTOFIELD_TITLEPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEViewRVDTO titlepslanresname(String titlePSLanResName) {
        this.setTitlePSLanResName(titlePSLanResName);
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
    public PSDEViewRVDTO updatedate(Timestamp updateDate) {
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
    public PSDEViewRVDTO updateman(String updateMan) {
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
    public PSDEViewRVDTO usertag(String userTag) {
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
    public PSDEViewRVDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="viewparams")
    public void setViewParams(String viewParams) {
        this._set(DTOFIELD_VIEWPARAMS, viewParams);
    }

    @JsonIgnore
    public String getViewParams() {
        Object objValue = this._get(DTOFIELD_VIEWPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParamsDirty() {
        return this._contains(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public void resetViewParams() {
        this._reset(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public PSDEViewRVDTO viewparams(String viewParams) {
        this.setViewParams(viewParams);
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
    public PSDEViewRVDTO width(Integer width) {
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEViewRVId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEViewRVId(strValue);
    }

    @JsonIgnore
    public PSDEViewRVDTO id(String strValue) {
        this.setPSDEViewRVId(strValue);
        return this;
    }
}
