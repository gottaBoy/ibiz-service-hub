package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSMobAppStartPageDTO extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSAPPVIEWID = "PSAPPVIEWID";
    protected static final String DTOFIELD_PSAPPVIEWID = "psappviewid";
    public static final String FIELD_PSAPPVIEWNAME = "PSAPPVIEWNAME";
    protected static final String DTOFIELD_PSAPPVIEWNAME = "psappviewname";
    public static final String FIELD_PSMOBAPPSTARTPAGEID = "PSMOBAPPSTARTPAGEID";
    protected static final String DTOFIELD_PSMOBAPPSTARTPAGEID = "psmobappstartpageid";
    public static final String FIELD_PSMOBAPPSTARTPAGENAME = "PSMOBAPPSTARTPAGENAME";
    protected static final String DTOFIELD_PSMOBAPPSTARTPAGENAME = "psmobappstartpagename";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSIMAGEID = "PSSYSIMAGEID";
    protected static final String DTOFIELD_PSSYSIMAGEID = "pssysimageid";
    public static final String FIELD_PSSYSIMAGENAME = "PSSYSIMAGENAME";
    protected static final String DTOFIELD_PSSYSIMAGENAME = "pssysimagename";
    public static final String FIELD_RESSPEC = "RESSPEC";
    protected static final String DTOFIELD_RESSPEC = "resspec";
    public static final String FIELD_RESTYPE = "RESTYPE";
    protected static final String DTOFIELD_RESTYPE = "restype";
    public static final String FIELD_STARTPAGEFILE = "STARTPAGEFILE";
    protected static final String DTOFIELD_STARTPAGEFILE = "startpagefile";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO codename(String codeName) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psappviewid")
    public void setPSAppViewId(String pSAppViewId) {
        this._set(DTOFIELD_PSAPPVIEWID, pSAppViewId);
    }

    @JsonIgnore
    public String getPSAppViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPVIEWID);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO psappviewid(String pSAppViewId) {
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO psappviewid(PSAppViewDTO pSAppView) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO psappviewname(String pSAppViewName) {
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    @JsonProperty(value="psmobappstartpageid")
    public void setPSMobAppStartPageId(String pSMobAppStartPageId) {
        this._set(DTOFIELD_PSMOBAPPSTARTPAGEID, pSMobAppStartPageId);
    }

    @JsonIgnore
    public String getPSMobAppStartPageId() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPSTARTPAGEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppStartPageIdDirty() {
        return this._contains(DTOFIELD_PSMOBAPPSTARTPAGEID);
    }

    @JsonIgnore
    public void resetPSMobAppStartPageId() {
        this._reset(DTOFIELD_PSMOBAPPSTARTPAGEID);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO psmobappstartpageid(String pSMobAppStartPageId) {
        this.setPSMobAppStartPageId(pSMobAppStartPageId);
        return this;
    }

    @JsonProperty(value="psmobappstartpagename")
    public void setPSMobAppStartPageName(String pSMobAppStartPageName) {
        this._set(DTOFIELD_PSMOBAPPSTARTPAGENAME, pSMobAppStartPageName);
    }

    @JsonIgnore
    public String getPSMobAppStartPageName() {
        Object objValue = this._get(DTOFIELD_PSMOBAPPSTARTPAGENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSMobAppStartPageNameDirty() {
        return this._contains(DTOFIELD_PSMOBAPPSTARTPAGENAME);
    }

    @JsonIgnore
    public void resetPSMobAppStartPageName() {
        this._reset(DTOFIELD_PSMOBAPPSTARTPAGENAME);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO psmobappstartpagename(String pSMobAppStartPageName) {
        this.setPSMobAppStartPageName(pSMobAppStartPageName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO pssysappid(PSSysAppDTO pSSysApp) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysimageid")
    public void setPSSysImageId(String pSSysImageId) {
        this._set(DTOFIELD_PSSYSIMAGEID, pSSysImageId);
    }

    @JsonIgnore
    public String getPSSysImageId() {
        Object objValue = this._get(DTOFIELD_PSSYSIMAGEID);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO pssysimageid(String pSSysImageId) {
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO pssysimageid(PSSysImageDTO pSSysImage) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO pssysimagename(String pSSysImageName) {
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonProperty(value="resspec")
    public void setResSpec(String resSpec) {
        this._set(DTOFIELD_RESSPEC, resSpec);
    }

    @JsonIgnore
    public String getResSpec() {
        Object objValue = this._get(DTOFIELD_RESSPEC);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResSpecDirty() {
        return this._contains(DTOFIELD_RESSPEC);
    }

    @JsonIgnore
    public void resetResSpec() {
        this._reset(DTOFIELD_RESSPEC);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO resspec(String resSpec) {
        this.setResSpec(resSpec);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO resspec(PSModelEnums.MobSceenResSpec resSpec) {
        this.setResSpec(resSpec == null ? null : resSpec.value);
        return this;
    }

    @JsonProperty(value="restype")
    public void setResType(String resType) {
        this._set(DTOFIELD_RESTYPE, resType);
    }

    @JsonIgnore
    public String getResType() {
        Object objValue = this._get(DTOFIELD_RESTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isResTypeDirty() {
        return this._contains(DTOFIELD_RESTYPE);
    }

    @JsonIgnore
    public void resetResType() {
        this._reset(DTOFIELD_RESTYPE);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO restype(String resType) {
        this.setResType(resType);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO restype(PSModelEnums.MobAppResType resType) {
        this.setResType(resType == null ? null : resType.value);
        return this;
    }

    @JsonProperty(value="startpagefile")
    public void setStartPageFile(String startPageFile) {
        this._set(DTOFIELD_STARTPAGEFILE, startPageFile);
    }

    @JsonIgnore
    public String getStartPageFile() {
        Object objValue = this._get(DTOFIELD_STARTPAGEFILE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStartPageFileDirty() {
        return this._contains(DTOFIELD_STARTPAGEFILE);
    }

    @JsonIgnore
    public void resetStartPageFile() {
        this._reset(DTOFIELD_STARTPAGEFILE);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO startpagefile(String startPageFile) {
        this.setStartPageFile(startPageFile);
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
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
    public PSMobAppStartPageDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSMobAppStartPageDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSMobAppStartPageName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSMobAppStartPageName(strName);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO name(String strName) {
        this.setPSMobAppStartPageName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSMobAppStartPageId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSMobAppStartPageId(strValue);
    }

    @JsonIgnore
    public PSMobAppStartPageDTO id(String strValue) {
        this.setPSMobAppStartPageId(strValue);
        return this;
    }

}
