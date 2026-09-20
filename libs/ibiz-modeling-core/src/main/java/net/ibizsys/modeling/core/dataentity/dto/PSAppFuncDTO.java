package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSAppFuncDTO
extends PSModelDTOBase {
    public static final String FIELD_APPFUNCTYPE = "APPFUNCTYPE";
    protected static final String DTOFIELD_APPFUNCTYPE = "appfunctype";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DYNAINSTTAG = "DYNAINSTTAG";
    protected static final String DTOFIELD_DYNAINSTTAG = "dynainsttag";
    public static final String FIELD_DYNAINSTTAG2 = "DYNAINSTTAG2";
    protected static final String DTOFIELD_DYNAINSTTAG2 = "dynainsttag2";
    public static final String FIELD_FROMOBJID = "FROMOBJID";
    protected static final String DTOFIELD_FROMOBJID = "fromobjid";
    public static final String FIELD_FUNCSN = "FUNCSN";
    protected static final String DTOFIELD_FUNCSN = "funcsn";
    public static final String FIELD_JSCODE = "JSCODE";
    protected static final String DTOFIELD_JSCODE = "jscode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NAMEPSLANRESID = "NAMEPSLANRESID";
    protected static final String DTOFIELD_NAMEPSLANRESID = "namepslanresid";
    public static final String FIELD_NAMEPSLANRESNAME = "NAMEPSLANRESNAME";
    protected static final String DTOFIELD_NAMEPSLANRESNAME = "namepslanresname";
    public static final String FIELD_OPENMODE = "OPENMODE";
    protected static final String DTOFIELD_OPENMODE = "openmode";
    public static final String FIELD_OPENVIEWPARAM = "OPENVIEWPARAM";
    protected static final String DTOFIELD_OPENVIEWPARAM = "openviewparam";
    public static final String FIELD_PAGEURL = "PAGEURL";
    protected static final String DTOFIELD_PAGEURL = "pageurl";
    public static final String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
    protected static final String DTOFIELD_PREDEFINEDTYPE = "predefinedtype";
    public static final String FIELD_PREDEFINEDTYPEPARAM = "PREDEFINEDTYPEPARAM";
    protected static final String DTOFIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";
    public static final String FIELD_PSAPPFUNCID = "PSAPPFUNCID";
    protected static final String DTOFIELD_PSAPPFUNCID = "psappfuncid";
    public static final String FIELD_PSAPPFUNCNAME = "PSAPPFUNCNAME";
    protected static final String DTOFIELD_PSAPPFUNCNAME = "psappfuncname";
    public static final String FIELD_PSAPPDATAENTITYID = "PSAPPLOCALDEID";
    protected static final String DTOFIELD_PSAPPDATAENTITYID = "psappdataentityid";
    public static final String FIELD_PSAPPDATAENTITYNAME = "PSAPPLOCALDENAME";
    protected static final String DTOFIELD_PSAPPDATAENTITYNAME = "psappdataentityname";
    public static final String FIELD_PSAPPSUBAPPID = "PSAPPSUBAPPID";
    protected static final String DTOFIELD_PSAPPSUBAPPID = "psappsubappid";
    public static final String FIELD_PSAPPSUBAPPNAME = "PSAPPSUBAPPNAME";
    protected static final String DTOFIELD_PSAPPSUBAPPNAME = "psappsubappname";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSDEACMODEID = "PSDEACMODEID";
    protected static final String DTOFIELD_PSDEACMODEID = "psdeacmodeid";
    public static final String FIELD_PSDEACMODENAME = "PSDEACMODENAME";
    protected static final String DTOFIELD_PSDEACMODENAME = "psdeacmodename";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSPDTAPPFUNCID = "PSPDTAPPFUNCID";
    protected static final String DTOFIELD_PSPDTAPPFUNCID = "pspdtappfuncid";
    public static final String FIELD_PSPDTAPPFUNCNAME = "PSPDTAPPFUNCNAME";
    protected static final String DTOFIELD_PSPDTAPPFUNCNAME = "pspdtappfuncname";
    public static final String FIELD_PSSUBAPPID = "PSSUBAPPID";
    protected static final String DTOFIELD_PSSUBAPPID = "pssubappid";
    public static final String FIELD_PSSUBAPPNAME = "PSSUBAPPNAME";
    protected static final String DTOFIELD_PSSUBAPPNAME = "pssubappname";
    public static final String FIELD_PSSUBAPPVIEWID = "PSSUBAPPVIEWID";
    protected static final String DTOFIELD_PSSUBAPPVIEWID = "pssubappviewid";
    public static final String FIELD_PSSUBAPPVIEWNAME = "PSSUBAPPVIEWNAME";
    protected static final String DTOFIELD_PSSUBAPPVIEWNAME = "pssubappviewname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
    protected static final String DTOFIELD_SYSTEMFLAG = "systemflag";
    public static final String FIELD_TIPPSLANRESID = "TIPPSLANRESID";
    protected static final String DTOFIELD_TIPPSLANRESID = "tippslanresid";
    public static final String FIELD_TIPPSLANRESNAME = "TIPPSLANRESNAME";
    protected static final String DTOFIELD_TIPPSLANRESNAME = "tippslanresname";
    public static final String FIELD_TOOLTIPINFO = "TOOLTIPINFO";
    protected static final String DTOFIELD_TOOLTIPINFO = "tooltipinfo";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
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

    @JsonProperty(value="appfunctype")
    public void setAppFuncType(String appFuncType) {
        this._set(DTOFIELD_APPFUNCTYPE, appFuncType);
    }

    @JsonIgnore
    public String getAppFuncType() {
        Object objValue = this._get(DTOFIELD_APPFUNCTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAppFuncTypeDirty() {
        return this._contains(DTOFIELD_APPFUNCTYPE);
    }

    @JsonIgnore
    public void resetAppFuncType() {
        this._reset(DTOFIELD_APPFUNCTYPE);
    }

    @JsonIgnore
    public PSAppFuncDTO appfunctype(String appFuncType) {
        this.setAppFuncType(appFuncType);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO appfunctype(PSModelEnums.AppFuncType appFuncType) {
        if (appFuncType == null) {
            this.setAppFuncType(null);
        } else {
            this.setAppFuncType(appFuncType.value);
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
    public PSAppFuncDTO codename(String codeName) {
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
    public PSAppFuncDTO createdate(Timestamp createDate) {
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
    public PSAppFuncDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dynainsttag")
    public void setDynaInstTag(String dynaInstTag) {
        this._set(DTOFIELD_DYNAINSTTAG, dynaInstTag);
    }

    @JsonIgnore
    public String getDynaInstTag() {
        Object objValue = this._get(DTOFIELD_DYNAINSTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaInstTagDirty() {
        return this._contains(DTOFIELD_DYNAINSTTAG);
    }

    @JsonIgnore
    public void resetDynaInstTag() {
        this._reset(DTOFIELD_DYNAINSTTAG);
    }

    @JsonIgnore
    public PSAppFuncDTO dynainsttag(String dynaInstTag) {
        this.setDynaInstTag(dynaInstTag);
        return this;
    }

    @JsonProperty(value="dynainsttag2")
    public void setDynaInstTag2(String dynaInstTag2) {
        this._set(DTOFIELD_DYNAINSTTAG2, dynaInstTag2);
    }

    @JsonIgnore
    public String getDynaInstTag2() {
        Object objValue = this._get(DTOFIELD_DYNAINSTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDynaInstTag2Dirty() {
        return this._contains(DTOFIELD_DYNAINSTTAG2);
    }

    @JsonIgnore
    public void resetDynaInstTag2() {
        this._reset(DTOFIELD_DYNAINSTTAG2);
    }

    @JsonIgnore
    public PSAppFuncDTO dynainsttag2(String dynaInstTag2) {
        this.setDynaInstTag2(dynaInstTag2);
        return this;
    }

    @JsonProperty(value="fromobjid")
    public void setFromObjId(String fromObjId) {
        this._set(DTOFIELD_FROMOBJID, fromObjId);
    }

    @JsonIgnore
    public String getFromObjId() {
        Object objValue = this._get(DTOFIELD_FROMOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFromObjIdDirty() {
        return this._contains(DTOFIELD_FROMOBJID);
    }

    @JsonIgnore
    public void resetFromObjId() {
        this._reset(DTOFIELD_FROMOBJID);
    }

    @JsonIgnore
    public PSAppFuncDTO fromobjid(String fromObjId) {
        this.setFromObjId(fromObjId);
        return this;
    }

    @JsonProperty(value="funcsn")
    public void setFuncSN(String funcSN) {
        this._set(DTOFIELD_FUNCSN, funcSN);
    }

    @JsonIgnore
    public String getFuncSN() {
        Object objValue = this._get(DTOFIELD_FUNCSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFuncSNDirty() {
        return this._contains(DTOFIELD_FUNCSN);
    }

    @JsonIgnore
    public void resetFuncSN() {
        this._reset(DTOFIELD_FUNCSN);
    }

    @JsonIgnore
    public PSAppFuncDTO funcsn(String funcSN) {
        this.setFuncSN(funcSN);
        return this;
    }

    @JsonProperty(value="jscode")
    public void setJSCode(String jSCode) {
        this._set(DTOFIELD_JSCODE, jSCode);
    }

    @JsonIgnore
    public String getJSCode() {
        Object objValue = this._get(DTOFIELD_JSCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJSCodeDirty() {
        return this._contains(DTOFIELD_JSCODE);
    }

    @JsonIgnore
    public void resetJSCode() {
        this._reset(DTOFIELD_JSCODE);
    }

    @JsonIgnore
    public PSAppFuncDTO jscode(String jSCode) {
        this.setJSCode(jSCode);
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
    public PSAppFuncDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSAppFuncDTO namepslanresid(String namePSLanResId) {
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO namepslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSAppFuncDTO namepslanresname(String namePSLanResName) {
        this.setNamePSLanResName(namePSLanResName);
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
    public PSAppFuncDTO openmode(String openMode) {
        this.setOpenMode(openMode);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO openmode(PSModelEnums.AppFuncOpenMode openMode) {
        if (openMode == null) {
            this.setOpenMode(null);
        } else {
            this.setOpenMode(openMode.value);
        }
        return this;
    }

    @JsonProperty(value="openviewparam")
    public void setOpenViewParam(String openViewParam) {
        this._set(DTOFIELD_OPENVIEWPARAM, openViewParam);
    }

    @JsonIgnore
    public String getOpenViewParam() {
        Object objValue = this._get(DTOFIELD_OPENVIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOpenViewParamDirty() {
        return this._contains(DTOFIELD_OPENVIEWPARAM);
    }

    @JsonIgnore
    public void resetOpenViewParam() {
        this._reset(DTOFIELD_OPENVIEWPARAM);
    }

    @JsonIgnore
    public PSAppFuncDTO openviewparam(String openViewParam) {
        this.setOpenViewParam(openViewParam);
        return this;
    }

    @JsonProperty(value="pageurl")
    public void setPageUrl(String pageUrl) {
        this._set(DTOFIELD_PAGEURL, pageUrl);
    }

    @JsonIgnore
    public String getPageUrl() {
        Object objValue = this._get(DTOFIELD_PAGEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPageUrlDirty() {
        return this._contains(DTOFIELD_PAGEURL);
    }

    @JsonIgnore
    public void resetPageUrl() {
        this._reset(DTOFIELD_PAGEURL);
    }

    @JsonIgnore
    public PSAppFuncDTO pageurl(String pageUrl) {
        this.setPageUrl(pageUrl);
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
    public PSAppFuncDTO predefinedtype(String predefinedType) {
        this.setPredefinedType(predefinedType);
        return this;
    }

    @JsonProperty(value="predefinedtypeparam")
    public void setPredefinedTypeParam(String predefinedTypeParam) {
        this._set(DTOFIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }

    @JsonIgnore
    public String getPredefinedTypeParam() {
        Object objValue = this._get(DTOFIELD_PREDEFINEDTYPEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPredefinedTypeParamDirty() {
        return this._contains(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public void resetPredefinedTypeParam() {
        this._reset(DTOFIELD_PREDEFINEDTYPEPARAM);
    }

    @JsonIgnore
    public PSAppFuncDTO predefinedtypeparam(String predefinedTypeParam) {
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    @JsonProperty(value="psappfuncid")
    public void setPSAppFuncId(String pSAppFuncId) {
        this._set(DTOFIELD_PSAPPFUNCID, pSAppFuncId);
    }

    @JsonIgnore
    public String getPSAppFuncId() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncIdDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public void resetPSAppFuncId() {
        this._reset(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public PSAppFuncDTO psappfuncid(String pSAppFuncId) {
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    @JsonProperty(value="psappfuncname")
    public void setPSAppFuncName(String pSAppFuncName) {
        this._set(DTOFIELD_PSAPPFUNCNAME, pSAppFuncName);
    }

    @JsonIgnore
    public String getPSAppFuncName() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncNameDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSAppFuncName() {
        this._reset(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO psappfuncname(String pSAppFuncName) {
        this.setPSAppFuncName(pSAppFuncName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSAppFuncName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppFuncName(strName);
    }

    @JsonIgnore
    public PSAppFuncDTO name(String strName) {
        this.setPSAppFuncName(strName);
        return this;
    }

    @JsonProperty(value="psappdataentityid")
    public void setPSAppDataEntityId(String pSAppDataEntityId) {
        this._set(DTOFIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        this._set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
    }

    @JsonIgnore
    public String getPSAppDataEntityId() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYID);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYID)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public void resetPSAppDataEntityId() {
        this._reset(DTOFIELD_PSAPPDATAENTITYID);
        this._reset(FIELD_PSAPPDATAENTITYID);
    }

    @JsonIgnore
    public PSAppFuncDTO psappdataentityid(String pSAppDataEntityId) {
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO psappdataentityid(PSAppDataEntityDTO pSAppDataEntity) {
        if (pSAppDataEntity == null) {
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
            this.setPSDEId(null);
        } else {
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
            this.setPSDEId(pSAppDataEntity.getPSDEId());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId() {
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEId(String pSAppLocalDEId) {
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty() {
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId() {
        this.resetPSAppDataEntityId();
    }

    @JsonProperty(value="psappdataentityname")
    public void setPSAppDataEntityName(String pSAppDataEntityName) {
        this._set(DTOFIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        this._set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
    }

    @JsonIgnore
    public String getPSAppDataEntityName() {
        Object objValue = this._get(DTOFIELD_PSAPPDATAENTITYNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSAPPDATAENTITYNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty() {
        if (this._contains(DTOFIELD_PSAPPDATAENTITYNAME)) {
            return true;
        }
        return this._contains(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public void resetPSAppDataEntityName() {
        this._reset(DTOFIELD_PSAPPDATAENTITYNAME);
        this._reset(FIELD_PSAPPDATAENTITYNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO psappdataentityname(String pSAppDataEntityName) {
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName() {
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSAppLocalDEName(String pSAppLocalDEName) {
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty() {
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName() {
        this.resetPSAppDataEntityName();
    }

    @JsonProperty(value="psappsubappid")
    public void setPSAppSubAppId(String pSAppSubAppId) {
        this._set(DTOFIELD_PSAPPSUBAPPID, pSAppSubAppId);
    }

    @JsonIgnore
    public String getPSAppSubAppId() {
        Object objValue = this._get(DTOFIELD_PSAPPSUBAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSubAppIdDirty() {
        return this._contains(DTOFIELD_PSAPPSUBAPPID);
    }

    @JsonIgnore
    public void resetPSAppSubAppId() {
        this._reset(DTOFIELD_PSAPPSUBAPPID);
    }

    @JsonIgnore
    public PSAppFuncDTO psappsubappid(String pSAppSubAppId) {
        this.setPSAppSubAppId(pSAppSubAppId);
        return this;
    }

    @JsonProperty(value="psappsubappname")
    public void setPSAppSubAppName(String pSAppSubAppName) {
        this._set(DTOFIELD_PSAPPSUBAPPNAME, pSAppSubAppName);
    }

    @JsonIgnore
    public String getPSAppSubAppName() {
        Object objValue = this._get(DTOFIELD_PSAPPSUBAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppSubAppNameDirty() {
        return this._contains(DTOFIELD_PSAPPSUBAPPNAME);
    }

    @JsonIgnore
    public void resetPSAppSubAppName() {
        this._reset(DTOFIELD_PSAPPSUBAPPNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO psappsubappname(String pSAppSubAppName) {
        this.setPSAppSubAppName(pSAppSubAppName);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSAppViewId() {
        this._reset(DTOFIELD_PSAPPVIEWID);
    }

    @JsonIgnore
    public PSAppFuncDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO psappviewid(PSAppViewDTO pSAppView) {
        if (pSAppView == null) {
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        } else {
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    @JsonProperty(value="psappviewname")
    public void setPSAppViewName(String pSAppViewName) {
        this._set(DTOFIELD_PSAPPVIEWNAME, pSAppViewName);
    }

    @JsonIgnore
    public String getPSAppViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppViewName() {
        this._reset(DTOFIELD_PSAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    @JsonProperty(value="psdeacmodeid")
    public void setPSDEACModeId(String pSDEACModeId) {
        this._set(DTOFIELD_PSDEACMODEID, pSDEACModeId);
    }

    @JsonIgnore
    public String getPSDEACModeId() {
        Object objValue = this._get(DTOFIELD_PSDEACMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeIdDirty() {
        return this._contains(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public void resetPSDEACModeId() {
        this._reset(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public PSAppFuncDTO psdeacmodeid(String pSDEACModeId) {
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO psdeacmodeid(PSDEACModeDTO pSDEACMode) {
        if (pSDEACMode == null) {
            this.setPSDEACModeId(null);
            this.setPSDEACModeName(null);
        } else {
            this.setPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    @JsonProperty(value="psdeacmodename")
    public void setPSDEACModeName(String pSDEACModeName) {
        this._set(DTOFIELD_PSDEACMODENAME, pSDEACModeName);
    }

    @JsonIgnore
    public String getPSDEACModeName() {
        Object objValue = this._get(DTOFIELD_PSDEACMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeNameDirty() {
        return this._contains(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public void resetPSDEACModeName() {
        this._reset(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public PSAppFuncDTO psdeacmodename(String pSDEACModeName) {
        this.setPSDEACModeName(pSDEACModeName);
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
    public PSAppFuncDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSAppFuncDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSAppFuncDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pspdtappfuncid")
    public void setPSPDTAppFuncId(String pSPDTAppFuncId) {
        this._set(DTOFIELD_PSPDTAPPFUNCID, pSPDTAppFuncId);
    }

    @JsonIgnore
    public String getPSPDTAppFuncId() {
        Object objValue = this._get(DTOFIELD_PSPDTAPPFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPDTAppFuncIdDirty() {
        return this._contains(DTOFIELD_PSPDTAPPFUNCID);
    }

    @JsonIgnore
    public void resetPSPDTAppFuncId() {
        this._reset(DTOFIELD_PSPDTAPPFUNCID);
    }

    @JsonIgnore
    public PSAppFuncDTO pspdtappfuncid(String pSPDTAppFuncId) {
        this.setPSPDTAppFuncId(pSPDTAppFuncId);
        return this;
    }

    @JsonProperty(value="pspdtappfuncname")
    public void setPSPDTAppFuncName(String pSPDTAppFuncName) {
        this._set(DTOFIELD_PSPDTAPPFUNCNAME, pSPDTAppFuncName);
    }

    @JsonIgnore
    public String getPSPDTAppFuncName() {
        Object objValue = this._get(DTOFIELD_PSPDTAPPFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPDTAppFuncNameDirty() {
        return this._contains(DTOFIELD_PSPDTAPPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSPDTAppFuncName() {
        this._reset(DTOFIELD_PSPDTAPPFUNCNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO pspdtappfuncname(String pSPDTAppFuncName) {
        this.setPSPDTAppFuncName(pSPDTAppFuncName);
        return this;
    }

    @JsonProperty(value="pssubappid")
    public void setPSSubAppId(String pSSubAppId) {
        this._set(DTOFIELD_PSSUBAPPID, pSSubAppId);
    }

    @JsonIgnore
    public String getPSSubAppId() {
        Object objValue = this._get(DTOFIELD_PSSUBAPPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubAppIdDirty() {
        return this._contains(DTOFIELD_PSSUBAPPID);
    }

    @JsonIgnore
    public void resetPSSubAppId() {
        this._reset(DTOFIELD_PSSUBAPPID);
    }

    @JsonIgnore
    public PSAppFuncDTO pssubappid(String pSSubAppId) {
        this.setPSSubAppId(pSSubAppId);
        return this;
    }

    @JsonProperty(value="pssubappname")
    public void setPSSubAppName(String pSSubAppName) {
        this._set(DTOFIELD_PSSUBAPPNAME, pSSubAppName);
    }

    @JsonIgnore
    public String getPSSubAppName() {
        Object objValue = this._get(DTOFIELD_PSSUBAPPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubAppNameDirty() {
        return this._contains(DTOFIELD_PSSUBAPPNAME);
    }

    @JsonIgnore
    public void resetPSSubAppName() {
        this._reset(DTOFIELD_PSSUBAPPNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO pssubappname(String pSSubAppName) {
        this.setPSSubAppName(pSSubAppName);
        return this;
    }

    @JsonProperty(value="pssubappviewid")
    public void setPSSubAppViewId(String pSSubAppViewId) {
        this._set(DTOFIELD_PSSUBAPPVIEWID, pSSubAppViewId);
    }

    @JsonIgnore
    public String getPSSubAppViewId() {
        Object objValue = this._get(DTOFIELD_PSSUBAPPVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubAppViewIdDirty() {
        return this._contains(DTOFIELD_PSSUBAPPVIEWID);
    }

    @JsonIgnore
    public void resetPSSubAppViewId() {
        this._reset(DTOFIELD_PSSUBAPPVIEWID);
    }

    @JsonIgnore
    public PSAppFuncDTO pssubappviewid(String pSSubAppViewId) {
        this.setPSSubAppViewId(pSSubAppViewId);
        return this;
    }

    @JsonProperty(value="pssubappviewname")
    public void setPSSubAppViewName(String pSSubAppViewName) {
        this._set(DTOFIELD_PSSUBAPPVIEWNAME, pSSubAppViewName);
    }

    @JsonIgnore
    public String getPSSubAppViewName() {
        Object objValue = this._get(DTOFIELD_PSSUBAPPVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSubAppViewNameDirty() {
        return this._contains(DTOFIELD_PSSUBAPPVIEWNAME);
    }

    @JsonIgnore
    public void resetPSSubAppViewName() {
        this._reset(DTOFIELD_PSSUBAPPVIEWNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO pssubappviewname(String pSSubAppViewName) {
        this.setPSSubAppViewName(pSSubAppViewName);
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
    public PSAppFuncDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO pssysappid(PSSysAppDTO pSSysApp) {
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
    public PSAppFuncDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSAppFuncDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSAppFuncDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="systemflag")
    public void setSystemFlag(Integer systemFlag) {
        this._set(DTOFIELD_SYSTEMFLAG, systemFlag);
    }

    @JsonIgnore
    public Integer getSystemFlag() {
        Object objValue = this._get(DTOFIELD_SYSTEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSystemFlagDirty() {
        return this._contains(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public void resetSystemFlag() {
        this._reset(DTOFIELD_SYSTEMFLAG);
    }

    @JsonIgnore
    public PSAppFuncDTO systemflag(Integer systemFlag) {
        this.setSystemFlag(systemFlag);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO systemflag(Boolean systemFlag) {
        if (systemFlag == null) {
            this.setSystemFlag(null);
        } else {
            this.setSystemFlag(systemFlag != false ? 1 : 0);
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
    public PSAppFuncDTO tippslanresid(String tipPSLanResId) {
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO tippslanresid(PSLanguageResDTO pSLanguageRes) {
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
    public PSAppFuncDTO tippslanresname(String tipPSLanResName) {
        this.setTipPSLanResName(tipPSLanResName);
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
    public PSAppFuncDTO tooltipinfo(String tooltipInfo) {
        this.setTooltipInfo(tooltipInfo);
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
    public PSAppFuncDTO updatedate(Timestamp updateDate) {
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
    public PSAppFuncDTO updateman(String updateMan) {
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
    public PSAppFuncDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSAppFuncDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSAppFuncDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSAppFuncDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSAppFuncDTO userparams(String userParams) {
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
    public PSAppFuncDTO usertag(String userTag) {
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
    public PSAppFuncDTO usertag2(String userTag2) {
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
    public PSAppFuncDTO usertag3(String userTag3) {
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
    public PSAppFuncDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSAppFuncId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppFuncId(strValue);
    }

    @JsonIgnore
    public PSAppFuncDTO id(String strValue) {
        this.setPSAppFuncId(strValue);
        return this;
    }
}
