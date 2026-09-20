package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysPFPluginDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXTENDSTYLEONLY = "EXTENDSTYLEONLY";
    protected static final String DTOFIELD_EXTENDSTYLEONLY = "extendstyleonly";
    public static final String FIELD_KEYWORDS = "KEYWORDS";
    protected static final String DTOFIELD_KEYWORDS = "keywords";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PLUGINDESC = "PLUGINDESC";
    protected static final String DTOFIELD_PLUGINDESC = "plugindesc";
    public static final String FIELD_PLUGINMODEL = "PLUGINMODEL";
    protected static final String DTOFIELD_PLUGINMODEL = "pluginmodel";
    public static final String FIELD_PLUGINPARAMS = "PLUGINPARAMS";
    protected static final String DTOFIELD_PLUGINPARAMS = "pluginparams";
    public static final String FIELD_PLUGINTAG = "PLUGINTAG";
    protected static final String DTOFIELD_PLUGINTAG = "plugintag";
    public static final String FIELD_PLUGINTAG2 = "PLUGINTAG2";
    protected static final String DTOFIELD_PLUGINTAG2 = "plugintag2";
    public static final String FIELD_PLUGINTYPE = "PLUGINTYPE";
    protected static final String DTOFIELD_PLUGINTYPE = "plugintype";
    public static final String FIELD_PREVIEWHTML = "PREVIEWHTML";
    protected static final String DTOFIELD_PREVIEWHTML = "previewhtml";
    public static final String FIELD_PREVIEWPSNDFILEID = "PREVIEWPSNDFILEID";
    protected static final String DTOFIELD_PREVIEWPSNDFILEID = "previewpsndfileid";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSPFPLUGINID = "PSPFPLUGINID";
    protected static final String DTOFIELD_PSPFPLUGINID = "pspfpluginid";
    public static final String FIELD_PSPFPLUGINNAME = "PSPFPLUGINNAME";
    protected static final String DTOFIELD_PSPFPLUGINNAME = "pspfpluginname";
    public static final String FIELD_PSSYSFILEID = "PSSYSFILEID";
    protected static final String DTOFIELD_PSSYSFILEID = "pssysfileid";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_REPDEFAULT = "REPDEFAULT";
    protected static final String DTOFIELD_REPDEFAULT = "repdefault";
    public static final String FIELD_RTOBJECTMODE = "RTOBJECTMODE";
    protected static final String DTOFIELD_RTOBJECTMODE = "rtobjectmode";
    public static final String FIELD_RTOBJECTNAME = "RTOBJECTNAME";
    protected static final String DTOFIELD_RTOBJECTNAME = "rtobjectname";
    public static final String FIELD_RTOBJECTREPO = "RTOBJECTREPO";
    protected static final String DTOFIELD_RTOBJECTREPO = "rtobjectrepo";
    public static final String FIELD_STUDIOICON = "STUDIOICON";
    protected static final String DTOFIELD_STUDIOICON = "studioicon";
    public static final String FIELD_TEMPALTEFUNC = "TEMPLATEFUNC";
    protected static final String DTOFIELD_TEMPALTEFUNC = "tempaltefunc";
    public static final String FIELD_TEMPLATEMODE = "TEMPLATEMODE";
    protected static final String DTOFIELD_TEMPLATEMODE = "templatemode";
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
    public PSSysPFPluginDTO codename(String codeName) {
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
    public PSSysPFPluginDTO createdate(Timestamp createDate) {
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
    public PSSysPFPluginDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSSysPFPluginDTO extendstyleonly(Integer extendStyleOnly) {
        this.setExtendStyleOnly(extendStyleOnly);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO extendstyleonly(Boolean extendStyleOnly) {
        if (extendStyleOnly == null) {
            this.setExtendStyleOnly(null);
        } else {
            this.setExtendStyleOnly(extendStyleOnly != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="keywords")
    public void setKeywords(String keywords) {
        this._set(DTOFIELD_KEYWORDS, keywords);
    }

    @JsonIgnore
    public String getKeywords() {
        Object objValue = this._get(DTOFIELD_KEYWORDS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeywordsDirty() {
        return this._contains(DTOFIELD_KEYWORDS);
    }

    @JsonIgnore
    public void resetKeywords() {
        this._reset(DTOFIELD_KEYWORDS);
    }

    @JsonIgnore
    public PSSysPFPluginDTO keywords(String keywords) {
        this.setKeywords(keywords);
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
    public PSSysPFPluginDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSSysPFPluginDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="plugindesc")
    public void setPluginDesc(String pluginDesc) {
        this._set(DTOFIELD_PLUGINDESC, pluginDesc);
    }

    @JsonIgnore
    public String getPluginDesc() {
        Object objValue = this._get(DTOFIELD_PLUGINDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginDescDirty() {
        return this._contains(DTOFIELD_PLUGINDESC);
    }

    @JsonIgnore
    public void resetPluginDesc() {
        this._reset(DTOFIELD_PLUGINDESC);
    }

    @JsonIgnore
    public PSSysPFPluginDTO plugindesc(String pluginDesc) {
        this.setPluginDesc(pluginDesc);
        return this;
    }

    @JsonProperty(value="pluginmodel")
    public void setPluginModel(String pluginModel) {
        this._set(DTOFIELD_PLUGINMODEL, pluginModel);
    }

    @JsonIgnore
    public String getPluginModel() {
        Object objValue = this._get(DTOFIELD_PLUGINMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginModelDirty() {
        return this._contains(DTOFIELD_PLUGINMODEL);
    }

    @JsonIgnore
    public void resetPluginModel() {
        this._reset(DTOFIELD_PLUGINMODEL);
    }

    @JsonIgnore
    public PSSysPFPluginDTO pluginmodel(String pluginModel) {
        this.setPluginModel(pluginModel);
        return this;
    }

    @JsonProperty(value="pluginparams")
    public void setPluginParams(String pluginParams) {
        this._set(DTOFIELD_PLUGINPARAMS, pluginParams);
    }

    @JsonIgnore
    public String getPluginParams() {
        Object objValue = this._get(DTOFIELD_PLUGINPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginParamsDirty() {
        return this._contains(DTOFIELD_PLUGINPARAMS);
    }

    @JsonIgnore
    public void resetPluginParams() {
        this._reset(DTOFIELD_PLUGINPARAMS);
    }

    @JsonIgnore
    public PSSysPFPluginDTO pluginparams(String pluginParams) {
        this.setPluginParams(pluginParams);
        return this;
    }

    @JsonProperty(value="plugintag")
    public void setPluginTag(String pluginTag) {
        this._set(DTOFIELD_PLUGINTAG, pluginTag);
    }

    @JsonIgnore
    public String getPluginTag() {
        Object objValue = this._get(DTOFIELD_PLUGINTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginTagDirty() {
        return this._contains(DTOFIELD_PLUGINTAG);
    }

    @JsonIgnore
    public void resetPluginTag() {
        this._reset(DTOFIELD_PLUGINTAG);
    }

    @JsonIgnore
    public PSSysPFPluginDTO plugintag(String pluginTag) {
        this.setPluginTag(pluginTag);
        return this;
    }

    @JsonProperty(value="plugintag2")
    public void setPluginTag2(String pluginTag2) {
        this._set(DTOFIELD_PLUGINTAG2, pluginTag2);
    }

    @JsonIgnore
    public String getPluginTag2() {
        Object objValue = this._get(DTOFIELD_PLUGINTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginTag2Dirty() {
        return this._contains(DTOFIELD_PLUGINTAG2);
    }

    @JsonIgnore
    public void resetPluginTag2() {
        this._reset(DTOFIELD_PLUGINTAG2);
    }

    @JsonIgnore
    public PSSysPFPluginDTO plugintag2(String pluginTag2) {
        this.setPluginTag2(pluginTag2);
        return this;
    }

    @JsonProperty(value="plugintype")
    public void setPluginType(String pluginType) {
        this._set(DTOFIELD_PLUGINTYPE, pluginType);
    }

    @JsonIgnore
    public String getPluginType() {
        Object objValue = this._get(DTOFIELD_PLUGINTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPluginTypeDirty() {
        return this._contains(DTOFIELD_PLUGINTYPE);
    }

    @JsonIgnore
    public void resetPluginType() {
        this._reset(DTOFIELD_PLUGINTYPE);
    }

    @JsonIgnore
    public PSSysPFPluginDTO plugintype(String pluginType) {
        this.setPluginType(pluginType);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO plugintype(PSModelEnums.PFPluginType pluginType) {
        if (pluginType == null) {
            this.setPluginType(null);
        } else {
            this.setPluginType(pluginType.value);
        }
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
    public PSSysPFPluginDTO previewhtml(String previewHtml) {
        this.setPreviewHtml(previewHtml);
        return this;
    }

    @JsonProperty(value="previewpsndfileid")
    public void setPreviewPSNDFileId(String previewPSNDFileId) {
        this._set(DTOFIELD_PREVIEWPSNDFILEID, previewPSNDFileId);
    }

    @JsonIgnore
    public String getPreviewPSNDFileId() {
        Object objValue = this._get(DTOFIELD_PREVIEWPSNDFILEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPreviewPSNDFileIdDirty() {
        return this._contains(DTOFIELD_PREVIEWPSNDFILEID);
    }

    @JsonIgnore
    public void resetPreviewPSNDFileId() {
        this._reset(DTOFIELD_PREVIEWPSNDFILEID);
    }

    @JsonIgnore
    public PSSysPFPluginDTO previewpsndfileid(String previewPSNDFileId) {
        this.setPreviewPSNDFileId(previewPSNDFileId);
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
    public PSSysPFPluginDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO psmoduleid(PSModuleDTO pSModule) {
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
    public PSSysPFPluginDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pspfpluginid")
    public void setPSPFPluginId(String pSPFPluginId) {
        this._set(DTOFIELD_PSPFPLUGINID, pSPFPluginId);
    }

    @JsonIgnore
    public String getPSPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSPFPluginId() {
        this._reset(DTOFIELD_PSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysPFPluginDTO pspfpluginid(String pSPFPluginId) {
        this.setPSPFPluginId(pSPFPluginId);
        return this;
    }

    @JsonProperty(value="pspfpluginname")
    public void setPSPFPluginName(String pSPFPluginName) {
        this._set(DTOFIELD_PSPFPLUGINNAME, pSPFPluginName);
    }

    @JsonIgnore
    public String getPSPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSPFPluginName() {
        this._reset(DTOFIELD_PSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysPFPluginDTO pspfpluginname(String pSPFPluginName) {
        this.setPSPFPluginName(pSPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysfileid")
    public void setPSSysFileId(String pSSysFileId) {
        this._set(DTOFIELD_PSSYSFILEID, pSSysFileId);
    }

    @JsonIgnore
    public String getPSSysFileId() {
        Object objValue = this._get(DTOFIELD_PSSYSFILEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysFileIdDirty() {
        return this._contains(DTOFIELD_PSSYSFILEID);
    }

    @JsonIgnore
    public void resetPSSysFileId() {
        this._reset(DTOFIELD_PSSYSFILEID);
    }

    @JsonIgnore
    public PSSysPFPluginDTO pssysfileid(String pSSysFileId) {
        this.setPSSysFileId(pSSysFileId);
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
    public PSSysPFPluginDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
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
    public PSSysPFPluginDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysPFPluginName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysPFPluginName(strName);
    }

    @JsonIgnore
    public PSSysPFPluginDTO name(String strName) {
        this.setPSSysPFPluginName(strName);
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
    public PSSysPFPluginDTO repdefault(Integer repDefault) {
        this.setRepDefault(repDefault);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO repdefault(Boolean repDefault) {
        if (repDefault == null) {
            this.setRepDefault(null);
        } else {
            this.setRepDefault(repDefault != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="rtobjectmode")
    public void setRTObjectMode(Integer rTObjectMode) {
        this._set(DTOFIELD_RTOBJECTMODE, rTObjectMode);
    }

    @JsonIgnore
    public Integer getRTObjectMode() {
        Object objValue = this._get(DTOFIELD_RTOBJECTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRTObjectModeDirty() {
        return this._contains(DTOFIELD_RTOBJECTMODE);
    }

    @JsonIgnore
    public void resetRTObjectMode() {
        this._reset(DTOFIELD_RTOBJECTMODE);
    }

    @JsonIgnore
    public PSSysPFPluginDTO rtobjectmode(Integer rTObjectMode) {
        this.setRTObjectMode(rTObjectMode);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO rtobjectmode(PSModelEnums.PFPluginRTMode rTObjectMode) {
        if (rTObjectMode == null) {
            this.setRTObjectMode(null);
        } else {
            this.setRTObjectMode(rTObjectMode.value);
        }
        return this;
    }

    @JsonProperty(value="rtobjectname")
    public void setRTObjectName(String rTObjectName) {
        this._set(DTOFIELD_RTOBJECTNAME, rTObjectName);
    }

    @JsonIgnore
    public String getRTObjectName() {
        Object objValue = this._get(DTOFIELD_RTOBJECTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTObjectNameDirty() {
        return this._contains(DTOFIELD_RTOBJECTNAME);
    }

    @JsonIgnore
    public void resetRTObjectName() {
        this._reset(DTOFIELD_RTOBJECTNAME);
    }

    @JsonIgnore
    public PSSysPFPluginDTO rtobjectname(String rTObjectName) {
        this.setRTObjectName(rTObjectName);
        return this;
    }

    @JsonProperty(value="rtobjectrepo")
    public void setRTObjectRepo(String rTObjectRepo) {
        this._set(DTOFIELD_RTOBJECTREPO, rTObjectRepo);
    }

    @JsonIgnore
    public String getRTObjectRepo() {
        Object objValue = this._get(DTOFIELD_RTOBJECTREPO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTObjectRepoDirty() {
        return this._contains(DTOFIELD_RTOBJECTREPO);
    }

    @JsonIgnore
    public void resetRTObjectRepo() {
        this._reset(DTOFIELD_RTOBJECTREPO);
    }

    @JsonIgnore
    public PSSysPFPluginDTO rtobjectrepo(String rTObjectRepo) {
        this.setRTObjectRepo(rTObjectRepo);
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
    public PSSysPFPluginDTO studioicon(String studioIcon) {
        this.setStudioIcon(studioIcon);
        return this;
    }

    @JsonProperty(value="tempaltefunc")
    public void setTempalteFunc(String tempalteFunc) {
        this._set(DTOFIELD_TEMPALTEFUNC, tempalteFunc);
        this._set(FIELD_TEMPALTEFUNC, tempalteFunc);
    }

    @JsonIgnore
    public String getTempalteFunc() {
        Object objValue = this._get(DTOFIELD_TEMPALTEFUNC);
        if (objValue == null && (objValue = this._get(FIELD_TEMPALTEFUNC)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTempalteFuncDirty() {
        if (this._contains(DTOFIELD_TEMPALTEFUNC)) {
            return true;
        }
        return this._contains(FIELD_TEMPALTEFUNC);
    }

    @JsonIgnore
    public void resetTempalteFunc() {
        this._reset(DTOFIELD_TEMPALTEFUNC);
        this._reset(FIELD_TEMPALTEFUNC);
    }

    @JsonIgnore
    public PSSysPFPluginDTO tempaltefunc(String tempalteFunc) {
        this.setTempalteFunc(tempalteFunc);
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
    public PSSysPFPluginDTO templatemode(Integer templateMode) {
        this.setTemplateMode(templateMode);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO templatemode(Boolean templateMode) {
        if (templateMode == null) {
            this.setTemplateMode(null);
        } else {
            this.setTemplateMode(templateMode != false ? 1 : 0);
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
    public PSSysPFPluginDTO updatedate(Timestamp updateDate) {
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
    public PSSysPFPluginDTO updateman(String updateMan) {
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
    public PSSysPFPluginDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysPFPluginDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysPFPluginDTO usertag(String userTag) {
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
    public PSSysPFPluginDTO usertag2(String userTag2) {
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
    public PSSysPFPluginDTO usertag3(String userTag3) {
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
    public PSSysPFPluginDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysPFPluginId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysPFPluginId(strValue);
    }

    @JsonIgnore
    public PSSysPFPluginDTO id(String strValue) {
        this.setPSSysPFPluginId(strValue);
        return this;
    }
}
