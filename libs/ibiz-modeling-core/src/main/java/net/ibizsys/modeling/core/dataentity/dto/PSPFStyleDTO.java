package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSPFStyleDTO
extends PSModelDTOBase {
    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DCSTYLECODE = "DCSTYLECODE";
    protected static final String DTOFIELD_DCSTYLECODE = "dcstylecode";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DYNADEPSTYLEFLAG = "DYNADEPSTYLEFLAG";
    protected static final String DTOFIELD_DYNADEPSTYLEFLAG = "dynadepstyleflag";
    public static final String FIELD_LASTESTFLAG = "LASTESTFLAG";
    protected static final String DTOFIELD_LASTESTFLAG = "lastestflag";
    public static final String FIELD_LASTIMPTIME = "LASTIMPTIME";
    protected static final String DTOFIELD_LASTIMPTIME = "lastimptime";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PFSTYLEPARAM = "PFSTYLEPARAM";
    protected static final String DTOFIELD_PFSTYLEPARAM = "pfstyleparam";
    public static final String FIELD_PSAPPTYPEID = "PSAPPTYPEID";
    protected static final String DTOFIELD_PSAPPTYPEID = "psapptypeid";
    public static final String FIELD_PSAPPTYPENAME = "PSAPPTYPENAME";
    protected static final String DTOFIELD_PSAPPTYPENAME = "psapptypename";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFSTYLEID = "PSPFSTYLEID";
    protected static final String DTOFIELD_PSPFSTYLEID = "pspfstyleid";
    public static final String FIELD_PSPFSTYLENAME = "PSPFSTYLENAME";
    protected static final String DTOFIELD_PSPFSTYLENAME = "pspfstylename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_REFRESHVER = "REFRESHVER";
    protected static final String DTOFIELD_REFRESHVER = "refreshver";
    public static final String FIELD_STYLECODE = "STYLECODE";
    protected static final String DTOFIELD_STYLECODE = "stylecode";
    public static final String FIELD_STYLEENGINE = "STYLEENGINE";
    protected static final String DTOFIELD_STYLEENGINE = "styleengine";
    public static final String FIELD_STYLERESURL = "STYLERESURL";
    protected static final String DTOFIELD_STYLERESURL = "styleresurl";
    public static final String FIELD_TEMPLFLAG = "TEMPLFLAG";
    protected static final String DTOFIELD_TEMPLFLAG = "templflag";
    public static final String FIELD_TEMPLINFO = "TEMPLINFO";
    protected static final String DTOFIELD_TEMPLINFO = "templinfo";
    public static final String FIELD_TEMPLPSPFSTYLEID = "TEMPLPSPFSTYLEID";
    protected static final String DTOFIELD_TEMPLPSPFSTYLEID = "templpspfstyleid";
    public static final String FIELD_TEMPLPSPFSTYLENAME = "TEMPLPSPFSTYLENAME";
    protected static final String DTOFIELD_TEMPLPSPFSTYLENAME = "templpspfstylename";
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
    public PSPFStyleDTO clspkgparams(String clsPkgParams) {
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
    public PSPFStyleDTO createdate(Timestamp createDate) {
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
    public PSPFStyleDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dcstylecode")
    public void setDCStyleCode(String dCStyleCode) {
        this._set(DTOFIELD_DCSTYLECODE, dCStyleCode);
    }

    @JsonIgnore
    public String getDCStyleCode() {
        Object objValue = this._get(DTOFIELD_DCSTYLECODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDCStyleCodeDirty() {
        return this._contains(DTOFIELD_DCSTYLECODE);
    }

    @JsonIgnore
    public void resetDCStyleCode() {
        this._reset(DTOFIELD_DCSTYLECODE);
    }

    @JsonIgnore
    public PSPFStyleDTO dcstylecode(String dCStyleCode) {
        this.setDCStyleCode(dCStyleCode);
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
    public PSPFStyleDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO defaultflag(Boolean defaultFlag) {
        if (defaultFlag == null) {
            this.setDefaultFlag(null);
        } else {
            this.setDefaultFlag(defaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dynadepstyleflag")
    public void setDynaDepStyleFlag(Integer dynaDepStyleFlag) {
        this._set(DTOFIELD_DYNADEPSTYLEFLAG, dynaDepStyleFlag);
    }

    @JsonIgnore
    public Integer getDynaDepStyleFlag() {
        Object objValue = this._get(DTOFIELD_DYNADEPSTYLEFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDynaDepStyleFlagDirty() {
        return this._contains(DTOFIELD_DYNADEPSTYLEFLAG);
    }

    @JsonIgnore
    public void resetDynaDepStyleFlag() {
        this._reset(DTOFIELD_DYNADEPSTYLEFLAG);
    }

    @JsonIgnore
    public PSPFStyleDTO dynadepstyleflag(Integer dynaDepStyleFlag) {
        this.setDynaDepStyleFlag(dynaDepStyleFlag);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO dynadepstyleflag(Boolean dynaDepStyleFlag) {
        if (dynaDepStyleFlag == null) {
            this.setDynaDepStyleFlag(null);
        } else {
            this.setDynaDepStyleFlag(dynaDepStyleFlag != false ? 1 : 0);
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
    public PSPFStyleDTO lastestflag(Integer lastestFlag) {
        this.setLastestFlag(lastestFlag);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO lastestflag(Boolean lastestFlag) {
        if (lastestFlag == null) {
            this.setLastestFlag(null);
        } else {
            this.setLastestFlag(lastestFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="lastimptime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastImpTime(Timestamp lastImpTime) {
        this._set(DTOFIELD_LASTIMPTIME, lastImpTime);
    }

    @JsonIgnore
    public Timestamp getLastImpTime() {
        Object objValue = this._get(DTOFIELD_LASTIMPTIME);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastImpTimeDirty() {
        return this._contains(DTOFIELD_LASTIMPTIME);
    }

    @JsonIgnore
    public void resetLastImpTime() {
        this._reset(DTOFIELD_LASTIMPTIME);
    }

    @JsonIgnore
    public PSPFStyleDTO lastimptime(Timestamp lastImpTime) {
        this.setLastImpTime(lastImpTime);
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
    public PSPFStyleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pfstyleparam")
    public void setPFStyleParam(String pFStyleParam) {
        this._set(DTOFIELD_PFSTYLEPARAM, pFStyleParam);
    }

    @JsonIgnore
    public String getPFStyleParam() {
        Object objValue = this._get(DTOFIELD_PFSTYLEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPFStyleParamDirty() {
        return this._contains(DTOFIELD_PFSTYLEPARAM);
    }

    @JsonIgnore
    public void resetPFStyleParam() {
        this._reset(DTOFIELD_PFSTYLEPARAM);
    }

    @JsonIgnore
    public PSPFStyleDTO pfstyleparam(String pFStyleParam) {
        this.setPFStyleParam(pFStyleParam);
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
    public PSPFStyleDTO psapptypeid(String pSAppTypeId) {
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO psapptypeid(PSAppTypeDTO pSAppType) {
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
    public PSPFStyleDTO psapptypename(String pSAppTypeName) {
        this.setPSAppTypeName(pSAppTypeName);
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
    public PSPFStyleDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSPFStyleDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevcentersvnid")
    public void setPSDevCenterSVNId(String pSDevCenterSVNId) {
        this._set(DTOFIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }

    @JsonIgnore
    public String getPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNId() {
        this._reset(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSPFStyleDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentersvnname")
    public void setPSDevCenterSVNName(String pSDevCenterSVNName) {
        this._set(DTOFIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }

    @JsonIgnore
    public String getPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNName() {
        this._reset(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSPFStyleDTO psdevcentersvnname(String pSDevCenterSVNName) {
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
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
    public PSPFStyleDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSPFStyleDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
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
    public PSPFStyleDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pspfstyleid")
    public void setPSPFStyleId(String pSPFStyleId) {
        this._set(DTOFIELD_PSPFSTYLEID, pSPFStyleId);
    }

    @JsonIgnore
    public String getPSPFStyleId() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleIdDirty() {
        return this._contains(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public void resetPSPFStyleId() {
        this._reset(DTOFIELD_PSPFSTYLEID);
    }

    @JsonIgnore
    public PSPFStyleDTO pspfstyleid(String pSPFStyleId) {
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    @JsonProperty(value="pspfstylename")
    public void setPSPFStyleName(String pSPFStyleName) {
        this._set(DTOFIELD_PSPFSTYLENAME, pSPFStyleName);
    }

    @JsonIgnore
    public String getPSPFStyleName() {
        Object objValue = this._get(DTOFIELD_PSPFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFStyleNameDirty() {
        return this._contains(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public void resetPSPFStyleName() {
        this._reset(DTOFIELD_PSPFSTYLENAME);
    }

    @JsonIgnore
    public PSPFStyleDTO pspfstylename(String pSPFStyleName) {
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSPFStyleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSPFStyleName(strName);
    }

    @JsonIgnore
    public PSPFStyleDTO name(String strName) {
        this.setPSPFStyleName(strName);
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
    public PSPFStyleDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO pubmode(PSModelEnums.PublicMode pubMode) {
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
    public PSPFStyleDTO refreshver(Integer refreshVer) {
        this.setRefreshVer(refreshVer);
        return this;
    }

    @JsonProperty(value="stylecode")
    public void setStyleCode(String styleCode) {
        this._set(DTOFIELD_STYLECODE, styleCode);
    }

    @JsonIgnore
    public String getStyleCode() {
        Object objValue = this._get(DTOFIELD_STYLECODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStyleCodeDirty() {
        return this._contains(DTOFIELD_STYLECODE);
    }

    @JsonIgnore
    public void resetStyleCode() {
        this._reset(DTOFIELD_STYLECODE);
    }

    @JsonIgnore
    public PSPFStyleDTO stylecode(String styleCode) {
        this.setStyleCode(styleCode);
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
    public PSPFStyleDTO styleengine(String styleEngine) {
        this.setStyleEngine(styleEngine);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO styleengine(PSModelEnums.PSTemplEngine styleEngine) {
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
    public PSPFStyleDTO styleresurl(String styleResUrl) {
        this.setStyleResUrl(styleResUrl);
        return this;
    }

    @JsonProperty(value="templflag")
    public void setTemplFlag(Integer templFlag) {
        this._set(DTOFIELD_TEMPLFLAG, templFlag);
    }

    @JsonIgnore
    public Integer getTemplFlag() {
        Object objValue = this._get(DTOFIELD_TEMPLFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTemplFlagDirty() {
        return this._contains(DTOFIELD_TEMPLFLAG);
    }

    @JsonIgnore
    public void resetTemplFlag() {
        this._reset(DTOFIELD_TEMPLFLAG);
    }

    @JsonIgnore
    public PSPFStyleDTO templflag(Integer templFlag) {
        this.setTemplFlag(templFlag);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO templflag(Boolean templFlag) {
        if (templFlag == null) {
            this.setTemplFlag(null);
        } else {
            this.setTemplFlag(templFlag != false ? 1 : 0);
        }
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
    public PSPFStyleDTO templinfo(String templInfo) {
        this.setTemplInfo(templInfo);
        return this;
    }

    @JsonProperty(value="templpspfstyleid")
    public void setTemplPSPFStyleId(String templPSPFStyleId) {
        this._set(DTOFIELD_TEMPLPSPFSTYLEID, templPSPFStyleId);
    }

    @JsonIgnore
    public String getTemplPSPFStyleId() {
        Object objValue = this._get(DTOFIELD_TEMPLPSPFSTYLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSPFStyleIdDirty() {
        return this._contains(DTOFIELD_TEMPLPSPFSTYLEID);
    }

    @JsonIgnore
    public void resetTemplPSPFStyleId() {
        this._reset(DTOFIELD_TEMPLPSPFSTYLEID);
    }

    @JsonIgnore
    public PSPFStyleDTO templpspfstyleid(String templPSPFStyleId) {
        this.setTemplPSPFStyleId(templPSPFStyleId);
        return this;
    }

    @JsonIgnore
    public PSPFStyleDTO templpspfstyleid(PSPFStyleDTO pSPFStyle) {
        if (pSPFStyle == null) {
            this.setTemplPSPFStyleId(null);
            this.setTemplPSPFStyleName(null);
        } else {
            this.setTemplPSPFStyleId(pSPFStyle.getPSPFStyleId());
            this.setTemplPSPFStyleName(pSPFStyle.getPSPFStyleName());
        }
        return this;
    }

    @JsonProperty(value="templpspfstylename")
    public void setTemplPSPFStyleName(String templPSPFStyleName) {
        this._set(DTOFIELD_TEMPLPSPFSTYLENAME, templPSPFStyleName);
    }

    @JsonIgnore
    public String getTemplPSPFStyleName() {
        Object objValue = this._get(DTOFIELD_TEMPLPSPFSTYLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplPSPFStyleNameDirty() {
        return this._contains(DTOFIELD_TEMPLPSPFSTYLENAME);
    }

    @JsonIgnore
    public void resetTemplPSPFStyleName() {
        this._reset(DTOFIELD_TEMPLPSPFSTYLENAME);
    }

    @JsonIgnore
    public PSPFStyleDTO templpspfstylename(String templPSPFStyleName) {
        this.setTemplPSPFStyleName(templPSPFStyleName);
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
    public PSPFStyleDTO templrooturl(String templRootUrl) {
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
    public PSPFStyleDTO updatedate(Timestamp updateDate) {
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
    public PSPFStyleDTO updateman(String updateMan) {
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
    public PSPFStyleDTO usertag(String userTag) {
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
    public PSPFStyleDTO usertag2(String userTag2) {
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
    public PSPFStyleDTO v2folder(String v2Folder) {
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
    public PSPFStyleDTO v2folder2(String v2Folder2) {
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
    public PSPFStyleDTO v2gitpath(String v2GitPath) {
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
    public PSPFStyleDTO version(Integer version) {
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
    public PSPFStyleDTO verstr(String verStr) {
        this.setVerStr(verStr);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSPFStyleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSPFStyleId(strValue);
    }

    @JsonIgnore
    public PSPFStyleDTO id(String strValue) {
        this.setPSPFStyleId(strValue);
        return this;
    }
}
