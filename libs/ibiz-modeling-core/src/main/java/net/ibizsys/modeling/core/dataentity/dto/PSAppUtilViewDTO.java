package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

public class PSAppUtilViewDTO
extends PSAppViewDTO {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ERRCODE = "ERRCODE";
    protected static final String DTOFIELD_ERRCODE = "errcode";
    public static final String FIELD_PSAPPMENUID = "PSAPPMENUID";
    protected static final String DTOFIELD_PSAPPMENUID = "psappmenuid";
    public static final String FIELD_PSAPPMENUNAME = "PSAPPMENUNAME";
    protected static final String DTOFIELD_PSAPPMENUNAME = "psappmenuname";
    public static final String FIELD_PSAPPUTILVIEWID = "PSAPPUTILVIEWID";
    protected static final String DTOFIELD_PSAPPUTILVIEWID = "psapputilviewid";
    public static final String FIELD_PSAPPUTILVIEWNAME = "PSAPPUTILVIEWNAME";
    protected static final String DTOFIELD_PSAPPUTILVIEWNAME = "psapputilviewname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    public PSAppUtilViewDTO() {
        this.setPSAppViewType("APPUTILVIEW");
    }

    @Override
    @JsonProperty(value="createdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCreateDate(Timestamp createDate) {
        this._set(DTOFIELD_CREATEDATE, createDate);
    }

    @Override
    @JsonIgnore
    public Timestamp getCreateDate() {
        Object objValue = this._get(DTOFIELD_CREATEDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isCreateDateDirty() {
        return this._contains(DTOFIELD_CREATEDATE);
    }

    @Override
    @JsonIgnore
    public void resetCreateDate() {
        this._reset(DTOFIELD_CREATEDATE);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @Override
    @JsonProperty(value="createman")
    public void setCreateMan(String createMan) {
        this._set(DTOFIELD_CREATEMAN, createMan);
    }

    @Override
    @JsonIgnore
    public String getCreateMan() {
        Object objValue = this._get(DTOFIELD_CREATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isCreateManDirty() {
        return this._contains(DTOFIELD_CREATEMAN);
    }

    @Override
    @JsonIgnore
    public void resetCreateMan() {
        this._reset(DTOFIELD_CREATEMAN);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="errcode")
    public void setErrCode(String errCode) {
        this._set(DTOFIELD_ERRCODE, errCode);
    }

    @JsonIgnore
    public String getErrCode() {
        Object objValue = this._get(DTOFIELD_ERRCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isErrCodeDirty() {
        return this._contains(DTOFIELD_ERRCODE);
    }

    @JsonIgnore
    public void resetErrCode() {
        this._reset(DTOFIELD_ERRCODE);
    }

    @JsonIgnore
    public PSAppUtilViewDTO errcode(String errCode) {
        this.setErrCode(errCode);
        return this;
    }

    @JsonProperty(value="psappmenuid")
    public void setPSAppMenuId(String pSAppMenuId) {
        this._set(DTOFIELD_PSAPPMENUID, pSAppMenuId);
    }

    @JsonIgnore
    public String getPSAppMenuId() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuIdDirty() {
        return this._contains(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public void resetPSAppMenuId() {
        this._reset(DTOFIELD_PSAPPMENUID);
    }

    @JsonIgnore
    public PSAppUtilViewDTO psappmenuid(String pSAppMenuId) {
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    @JsonIgnore
    public PSAppUtilViewDTO psappmenuid(PSAppMenuDTO pSAppMenu) {
        if (pSAppMenu == null) {
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        } else {
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    @JsonProperty(value="psappmenuname")
    public void setPSAppMenuName(String pSAppMenuName) {
        this._set(DTOFIELD_PSAPPMENUNAME, pSAppMenuName);
    }

    @JsonIgnore
    public String getPSAppMenuName() {
        Object objValue = this._get(DTOFIELD_PSAPPMENUNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppMenuNameDirty() {
        return this._contains(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public void resetPSAppMenuName() {
        this._reset(DTOFIELD_PSAPPMENUNAME);
    }

    @JsonIgnore
    public PSAppUtilViewDTO psappmenuname(String pSAppMenuName) {
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    @JsonProperty(value="psapputilviewid")
    public void setPSAppUtilViewId(String pSAppUtilViewId) {
        this._set(DTOFIELD_PSAPPUTILVIEWID, pSAppUtilViewId);
        this._set("psappviewid", pSAppUtilViewId);
    }

    @JsonIgnore
    public String getPSAppUtilViewId() {
        Object objValue = this._get(DTOFIELD_PSAPPUTILVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUtilViewIdDirty() {
        return this._contains(DTOFIELD_PSAPPUTILVIEWID);
    }

    @JsonIgnore
    public void resetPSAppUtilViewId() {
        this._reset(DTOFIELD_PSAPPUTILVIEWID);
        this._reset("psappviewid");
    }

    @JsonIgnore
    public PSAppUtilViewDTO psapputilviewid(String pSAppUtilViewId) {
        this.setPSAppUtilViewId(pSAppUtilViewId);
        return this;
    }

    @JsonProperty(value="psapputilviewname")
    public void setPSAppUtilViewName(String pSAppUtilViewName) {
        this._set(DTOFIELD_PSAPPUTILVIEWNAME, pSAppUtilViewName);
        this._set("psappviewname", pSAppUtilViewName);
    }

    @JsonIgnore
    public String getPSAppUtilViewName() {
        Object objValue = this._get(DTOFIELD_PSAPPUTILVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppUtilViewNameDirty() {
        return this._contains(DTOFIELD_PSAPPUTILVIEWNAME);
    }

    @JsonIgnore
    public void resetPSAppUtilViewName() {
        this._reset(DTOFIELD_PSAPPUTILVIEWNAME);
        this._reset("psappviewname");
    }

    @JsonIgnore
    public PSAppUtilViewDTO psapputilviewname(String pSAppUtilViewName) {
        this.setPSAppUtilViewName(pSAppUtilViewName);
        return this;
    }

    @Override
    @JsonIgnore
    public String getName() {
        return this.getPSAppUtilViewName();
    }

    @Override
    @JsonIgnore
    public void setName(String strName) {
        this.setPSAppUtilViewName(strName);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO name(String strName) {
        this.setPSAppUtilViewName(strName);
        return this;
    }

    @Override
    @JsonProperty(value="updatedate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setUpdateDate(Timestamp updateDate) {
        this._set(DTOFIELD_UPDATEDATE, updateDate);
    }

    @Override
    @JsonIgnore
    public Timestamp getUpdateDate() {
        Object objValue = this._get(DTOFIELD_UPDATEDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isUpdateDateDirty() {
        return this._contains(DTOFIELD_UPDATEDATE);
    }

    @Override
    @JsonIgnore
    public void resetUpdateDate() {
        this._reset(DTOFIELD_UPDATEDATE);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @Override
    @JsonProperty(value="updateman")
    public void setUpdateMan(String updateMan) {
        this._set(DTOFIELD_UPDATEMAN, updateMan);
    }

    @Override
    @JsonIgnore
    public String getUpdateMan() {
        Object objValue = this._get(DTOFIELD_UPDATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @Override
    @JsonIgnore
    public boolean isUpdateManDirty() {
        return this._contains(DTOFIELD_UPDATEMAN);
    }

    @Override
    @JsonIgnore
    public void resetUpdateMan() {
        this._reset(DTOFIELD_UPDATEMAN);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @Override
    @JsonIgnore
    public String getId() {
        return this.getPSAppUtilViewId();
    }

    @Override
    @JsonIgnore
    public void setId(String strValue) {
        this.setPSAppUtilViewId(strValue);
    }

    @Override
    @JsonIgnore
    public PSAppUtilViewDTO id(String strValue) {
        this.setPSAppUtilViewId(strValue);
        return this;
    }
}
