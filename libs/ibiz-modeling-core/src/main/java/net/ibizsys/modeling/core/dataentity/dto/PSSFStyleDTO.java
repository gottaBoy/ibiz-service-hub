package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSFStyleDTO
extends PSModelDTOBase {
    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_LASTESTFLAG = "LASTESTFLAG";
    protected static final String DTOFIELD_LASTESTFLAG = "lastestflag";
    public static final String FIELD_MAINPSSFSTYLEID = "MAINPSSFSTYLEID";
    protected static final String DTOFIELD_MAINPSSFSTYLEID = "mainpssfstyleid";
    public static final String FIELD_MAINPSSFSTYLENAME = "MAINPSSFSTYLENAME";
    protected static final String DTOFIELD_MAINPSSFSTYLENAME = "mainpssfstylename";
    public static final String FIELD_MAINSTYLEFLAG = "MAINSTYLEFLAG";
    protected static final String DTOFIELD_MAINSTYLEFLAG = "mainstyleflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PPSSFSTYLEID = "PPSSFSTYLEID";
    protected static final String DTOFIELD_PPSSFSTYLEID = "ppssfstyleid";
    public static final String FIELD_PPSSFSTYLENAME = "PPSSFSTYLENAME";
    protected static final String DTOFIELD_PPSSFSTYLENAME = "ppssfstylename";
    public static final String FIELD_PRJLIST = "PRJLIST";
    protected static final String DTOFIELD_PRJLIST = "prjlist";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSFSTYLEID = "PSSFSTYLEID";
    protected static final String DTOFIELD_PSSFSTYLEID = "pssfstyleid";
    public static final String FIELD_PSSFSTYLENAME = "PSSFSTYLENAME";
    protected static final String DTOFIELD_PSSFSTYLENAME = "pssfstylename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_REFRESHVER = "REFRESHVER";
    protected static final String DTOFIELD_REFRESHVER = "refreshver";
    public static final String FIELD_STYLEENGINE = "STYLEENGINE";
    protected static final String DTOFIELD_STYLEENGINE = "styleengine";
    public static final String FIELD_STYLERESURL = "STYLERESURL";
    protected static final String DTOFIELD_STYLERESURL = "styleresurl";
    public static final String FIELD_TEMPLINFO = "TEMPLINFO";
    protected static final String DTOFIELD_TEMPLINFO = "templinfo";
    public static final String FIELD_TEMPLROOTURL = "TEMPLROOTURL";
    protected static final String DTOFIELD_TEMPLROOTURL = "templrooturl";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_V2FOLDER = "V2FOLDER";
    protected static final String DTOFIELD_V2FOLDER = "v2folder";
    public static final String FIELD_V2FOLDER2 = "V2FOLDER2";
    protected static final String DTOFIELD_V2FOLDER2 = "v2folder2";
    public static final String FIELD_V2GITPATH = "V2GITPATH";
    protected static final String DTOFIELD_V2GITPATH = "v2gitpath";
    public static final String FIELD_VERSION = "VERSION";
    protected static final String DTOFIELD_VERSION = "version";
    public static final String FIELD_VERSTR = "VERSTR";
    protected static final String DTOFIELD_VERSTR = "verstr";
    public static final String FIELD_WORKSHOPNAME = "WORKSHOPNAME";
    protected static final String DTOFIELD_WORKSHOPNAME = "workshopname";

    @JsonProperty(value="clspkgparams")
    public void setClsPkgParams(String clsPkgParams) {
        this._set(DTOFIELD_CLSPKGPARAMS, clsPkgParams);
    }

    @JsonIgnore
    public String getClsPkgParams() {
        Object objValue = this._get(DTOFIELD_CLSPKGPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isClsPkgParamsDirty() {
        return this._contains(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public void resetClsPkgParams() {
        this._reset(DTOFIELD_CLSPKGPARAMS);
    }

    @JsonIgnore
    public PSSFStyleDTO clspkgparams(String clsPkgParams) {
        this.setClsPkgParams(clsPkgParams);
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
    public PSSFStyleDTO createdate(Timestamp createDate) {
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
    public PSSFStyleDTO createman(String createMan) {
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
    public PSSFStyleDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="lastestflag")
    public void setLastestFlag(Integer lastestFlag) {
        this._set(DTOFIELD_LASTESTFLAG, lastestFlag);
    }

    @JsonIgnore
    public Integer getLastestFlag() {
        Object objValue = this._get(DTOFIELD_LASTESTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLastestFlagDirty() {
        return this._contains(DTOFIELD_LASTESTFLAG);
    }

    @JsonIgnore
    public void resetLastestFlag() {
        this._reset(DTOFIELD_LASTESTFLAG);
    }

    @JsonIgnore
    public PSSFStyleDTO lastestflag(Integer lastestFlag) {
        this.setLastestFlag(lastestFlag);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO lastestflag(Boolean lastestFlag) {
        if (lastestFlag == null) {
            this.setLastestFlag(null);
        } else {
            this.setLastestFlag(lastestFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="mainpssfstyleid")
    public void setMainPSSFStyleId(String mainPSSFStyleId) {
        this._set(DTOFIELD_MAINPSSFSTYLEID, mainPSSFStyleId);
    }

    @JsonIgnore
    public String getMainPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_MAINPSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_MAINPSSFSTYLEID);
    }

    @JsonIgnore
    public void resetMainPSSFStyleId() {
        this._reset(DTOFIELD_MAINPSSFSTYLEID);
    }

    @JsonIgnore
    public PSSFStyleDTO mainpssfstyleid(String mainPSSFStyleId) {
        this.setMainPSSFStyleId(mainPSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO mainpssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setMainPSSFStyleId(null);
            this.setMainPSSFStyleName(null);
        } else {
            this.setMainPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setMainPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="mainpssfstylename")
    public void setMainPSSFStyleName(String mainPSSFStyleName) {
        this._set(DTOFIELD_MAINPSSFSTYLENAME, mainPSSFStyleName);
    }

    @JsonIgnore
    public String getMainPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_MAINPSSFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_MAINPSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetMainPSSFStyleName() {
        this._reset(DTOFIELD_MAINPSSFSTYLENAME);
    }

    @JsonIgnore
    public PSSFStyleDTO mainpssfstylename(String mainPSSFStyleName) {
        this.setMainPSSFStyleName(mainPSSFStyleName);
        return this;
    }

    @JsonProperty(value="mainstyleflag")
    public void setMainStyleFlag(Integer mainStyleFlag) {
        this._set(DTOFIELD_MAINSTYLEFLAG, mainStyleFlag);
    }

    @JsonIgnore
    public Integer getMainStyleFlag() {
        Object objValue = this._get(DTOFIELD_MAINSTYLEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMainStyleFlagDirty() {
        return this._contains(DTOFIELD_MAINSTYLEFLAG);
    }

    @JsonIgnore
    public void resetMainStyleFlag() {
        this._reset(DTOFIELD_MAINSTYLEFLAG);
    }

    @JsonIgnore
    public PSSFStyleDTO mainstyleflag(Integer mainStyleFlag) {
        this.setMainStyleFlag(mainStyleFlag);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO mainstyleflag(Boolean mainStyleFlag) {
        if (mainStyleFlag == null) {
            this.setMainStyleFlag(null);
        } else {
            this.setMainStyleFlag(mainStyleFlag != false ? 1 : 0);
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
    public PSSFStyleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ppssfstyleid")
    public void setPPSSFStyleId(String pPSSFStyleId) {
        this._set(DTOFIELD_PPSSFSTYLEID, pPSSFStyleId);
    }

    @JsonIgnore
    public String getPPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PPSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_PPSSFSTYLEID);
    }

    @JsonIgnore
    public void resetPPSSFStyleId() {
        this._reset(DTOFIELD_PPSSFSTYLEID);
    }

    @JsonIgnore
    public PSSFStyleDTO ppssfstyleid(String pPSSFStyleId) {
        this.setPPSSFStyleId(pPSSFStyleId);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO ppssfstyleid(PSSFStyleDTO pSSFStyle) {
        if (pSSFStyle == null) {
            this.setPPSSFStyleId(null);
            this.setPPSSFStyleName(null);
        } else {
            this.setPPSSFStyleId(pSSFStyle.getPSSFStyleId());
            this.setPPSSFStyleName(pSSFStyle.getPSSFStyleName());
        }
        return this;
    }

    @JsonProperty(value="ppssfstylename")
    public void setPPSSFStyleName(String pPSSFStyleName) {
        this._set(DTOFIELD_PPSSFSTYLENAME, pPSSFStyleName);
    }

    @JsonIgnore
    public String getPPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_PPSSFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_PPSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetPPSSFStyleName() {
        this._reset(DTOFIELD_PPSSFSTYLENAME);
    }

    @JsonIgnore
    public PSSFStyleDTO ppssfstylename(String pPSSFStyleName) {
        this.setPPSSFStyleName(pPSSFStyleName);
        return this;
    }

    @JsonProperty(value="prjlist")
    public void setPrjList(String prjList) {
        this._set(DTOFIELD_PRJLIST, prjList);
    }

    @JsonIgnore
    public String getPrjList() {
        Object objValue = this._get(DTOFIELD_PRJLIST);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPrjListDirty() {
        return this._contains(DTOFIELD_PRJLIST);
    }

    @JsonIgnore
    public void resetPrjList() {
        this._reset(DTOFIELD_PRJLIST);
    }

    @JsonIgnore
    public PSSFStyleDTO prjlist(String prjList) {
        this.setPrjList(prjList);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSSFStyleDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSSFStyleDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSSFStyleDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSSFStyleDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSSFStyleDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="pssfstyleid")
    public void setPSSFStyleId(String pSSFStyleId) {
        this._set(DTOFIELD_PSSFSTYLEID, pSSFStyleId);
    }

    @JsonIgnore
    public String getPSSFStyleId() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleIdDirty() {
        return this._contains(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public void resetPSSFStyleId() {
        this._reset(DTOFIELD_PSSFSTYLEID);
    }

    @JsonIgnore
    public PSSFStyleDTO pssfstyleid(String pSSFStyleId) {
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    @JsonProperty(value="pssfstylename")
    public void setPSSFStyleName(String pSSFStyleName) {
        this._set(DTOFIELD_PSSFSTYLENAME, pSSFStyleName);
    }

    @JsonIgnore
    public String getPSSFStyleName() {
        Object objValue = this._get(DTOFIELD_PSSFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFStyleNameDirty() {
        return this._contains(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSSFStyleName() {
        this._reset(DTOFIELD_PSSFSTYLENAME);
    }

    @JsonIgnore
    public PSSFStyleDTO pssfstylename(String pSSFStyleName) {
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSFStyleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSFStyleName(strName);
    }

    @JsonIgnore
    public PSSFStyleDTO name(String strName) {
        this.setPSSFStyleName(strName);
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
    public PSSFStyleDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO pubmode(PSModelEnums.PublicMode pubMode) {
        if (pubMode == null) {
            this.setPubMode(null);
        } else {
            this.setPubMode(pubMode.value);
        }
        return this;
    }

    @JsonProperty(value="refreshver")
    public void setRefreshVer(Integer refreshVer) {
        this._set(DTOFIELD_REFRESHVER, refreshVer);
    }

    @JsonIgnore
    public Integer getRefreshVer() {
        Object objValue = this._get(DTOFIELD_REFRESHVER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRefreshVerDirty() {
        return this._contains(DTOFIELD_REFRESHVER);
    }

    @JsonIgnore
    public void resetRefreshVer() {
        this._reset(DTOFIELD_REFRESHVER);
    }

    @JsonIgnore
    public PSSFStyleDTO refreshver(Integer refreshVer) {
        this.setRefreshVer(refreshVer);
        return this;
    }

    @JsonProperty(value="styleengine")
    public void setStyleEngine(String styleEngine) {
        this._set(DTOFIELD_STYLEENGINE, styleEngine);
    }

    @JsonIgnore
    public String getStyleEngine() {
        Object objValue = this._get(DTOFIELD_STYLEENGINE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleEngineDirty() {
        return this._contains(DTOFIELD_STYLEENGINE);
    }

    @JsonIgnore
    public void resetStyleEngine() {
        this._reset(DTOFIELD_STYLEENGINE);
    }

    @JsonIgnore
    public PSSFStyleDTO styleengine(String styleEngine) {
        this.setStyleEngine(styleEngine);
        return this;
    }

    @JsonIgnore
    public PSSFStyleDTO styleengine(PSModelEnums.PSTemplEngine styleEngine) {
        if (styleEngine == null) {
            this.setStyleEngine(null);
        } else {
            this.setStyleEngine(styleEngine.value);
        }
        return this;
    }

    @JsonProperty(value="styleresurl")
    public void setStyleResUrl(String styleResUrl) {
        this._set(DTOFIELD_STYLERESURL, styleResUrl);
    }

    @JsonIgnore
    public String getStyleResUrl() {
        Object objValue = this._get(DTOFIELD_STYLERESURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleResUrlDirty() {
        return this._contains(DTOFIELD_STYLERESURL);
    }

    @JsonIgnore
    public void resetStyleResUrl() {
        this._reset(DTOFIELD_STYLERESURL);
    }

    @JsonIgnore
    public PSSFStyleDTO styleresurl(String styleResUrl) {
        this.setStyleResUrl(styleResUrl);
        return this;
    }

    @JsonProperty(value="templinfo")
    public void setTemplInfo(String templInfo) {
        this._set(DTOFIELD_TEMPLINFO, templInfo);
    }

    @JsonIgnore
    public String getTemplInfo() {
        Object objValue = this._get(DTOFIELD_TEMPLINFO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplInfoDirty() {
        return this._contains(DTOFIELD_TEMPLINFO);
    }

    @JsonIgnore
    public void resetTemplInfo() {
        this._reset(DTOFIELD_TEMPLINFO);
    }

    @JsonIgnore
    public PSSFStyleDTO templinfo(String templInfo) {
        this.setTemplInfo(templInfo);
        return this;
    }

    @JsonProperty(value="templrooturl")
    public void setTemplRootUrl(String templRootUrl) {
        this._set(DTOFIELD_TEMPLROOTURL, templRootUrl);
    }

    @JsonIgnore
    public String getTemplRootUrl() {
        Object objValue = this._get(DTOFIELD_TEMPLROOTURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplRootUrlDirty() {
        return this._contains(DTOFIELD_TEMPLROOTURL);
    }

    @JsonIgnore
    public void resetTemplRootUrl() {
        this._reset(DTOFIELD_TEMPLROOTURL);
    }

    @JsonIgnore
    public PSSFStyleDTO templrooturl(String templRootUrl) {
        this.setTemplRootUrl(templRootUrl);
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
    public PSSFStyleDTO updatedate(Timestamp updateDate) {
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
    public PSSFStyleDTO updateman(String updateMan) {
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
    public PSSFStyleDTO usertag(String userTag) {
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
    public PSSFStyleDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
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
    public PSSFStyleDTO v2folder(String v2Folder) {
        this.setV2Folder(v2Folder);
        return this;
    }

    @JsonProperty(value="v2folder2")
    public void setV2Folder2(String v2Folder2) {
        this._set(DTOFIELD_V2FOLDER2, v2Folder2);
    }

    @JsonIgnore
    public String getV2Folder2() {
        Object objValue = this._get(DTOFIELD_V2FOLDER2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isV2Folder2Dirty() {
        return this._contains(DTOFIELD_V2FOLDER2);
    }

    @JsonIgnore
    public void resetV2Folder2() {
        this._reset(DTOFIELD_V2FOLDER2);
    }

    @JsonIgnore
    public PSSFStyleDTO v2folder2(String v2Folder2) {
        this.setV2Folder2(v2Folder2);
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
    public PSSFStyleDTO v2gitpath(String v2GitPath) {
        this.setV2GitPath(v2GitPath);
        return this;
    }

    @JsonProperty(value="version")
    public void setVersion(Integer version) {
        this._set(DTOFIELD_VERSION, version);
    }

    @JsonIgnore
    public Integer getVersion() {
        Object objValue = this._get(DTOFIELD_VERSION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isVersionDirty() {
        return this._contains(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public void resetVersion() {
        this._reset(DTOFIELD_VERSION);
    }

    @JsonIgnore
    public PSSFStyleDTO version(Integer version) {
        this.setVersion(version);
        return this;
    }

    @JsonProperty(value="verstr")
    public void setVerStr(String verStr) {
        this._set(DTOFIELD_VERSTR, verStr);
    }

    @JsonIgnore
    public String getVerStr() {
        Object objValue = this._get(DTOFIELD_VERSTR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVerStrDirty() {
        return this._contains(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public void resetVerStr() {
        this._reset(DTOFIELD_VERSTR);
    }

    @JsonIgnore
    public PSSFStyleDTO verstr(String verStr) {
        this.setVerStr(verStr);
        return this;
    }

    @JsonProperty(value="workshopname")
    public void setWorkshopName(String workshopName) {
        this._set(DTOFIELD_WORKSHOPNAME, workshopName);
    }

    @JsonIgnore
    public String getWorkshopName() {
        Object objValue = this._get(DTOFIELD_WORKSHOPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWorkshopNameDirty() {
        return this._contains(DTOFIELD_WORKSHOPNAME);
    }

    @JsonIgnore
    public void resetWorkshopName() {
        this._reset(DTOFIELD_WORKSHOPNAME);
    }

    @JsonIgnore
    public PSSFStyleDTO workshopname(String workshopName) {
        this.setWorkshopName(workshopName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSFStyleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSFStyleId(strValue);
    }

    @JsonIgnore
    public PSSFStyleDTO id(String strValue) {
        this.setPSSFStyleId(strValue);
        return this;
    }
}
