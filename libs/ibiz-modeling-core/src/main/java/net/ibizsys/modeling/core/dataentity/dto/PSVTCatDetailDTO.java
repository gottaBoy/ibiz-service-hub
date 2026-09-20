package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSVTCatDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSVIEWTYPECATID = "PSVIEWTYPECATID";
    protected static final String DTOFIELD_PSVIEWTYPECATID = "psviewtypecatid";
    public static final String FIELD_PSVIEWTYPECATNAME = "PSVIEWTYPECATNAME";
    protected static final String DTOFIELD_PSVIEWTYPECATNAME = "psviewtypecatname";
    public static final String FIELD_PSVIEWTYPEID = "PSVIEWTYPEID";
    protected static final String DTOFIELD_PSVIEWTYPEID = "psviewtypeid";
    public static final String FIELD_PSVIEWTYPENAME = "PSVIEWTYPENAME";
    protected static final String DTOFIELD_PSVIEWTYPENAME = "psviewtypename";
    public static final String FIELD_PSVTCATDETAILID = "PSVTCATDETAILID";
    protected static final String DTOFIELD_PSVTCATDETAILID = "psvtcatdetailid";
    public static final String FIELD_PSVTCATDETAILNAME = "PSVTCATDETAILNAME";
    protected static final String DTOFIELD_PSVTCATDETAILNAME = "psvtcatdetailname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

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
    public PSVTCatDetailDTO createdate(Timestamp createDate) {
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
    public PSVTCatDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="psviewtypecatid")
    public void setPSViewTypeCatId(String pSViewTypeCatId) {
        this._set(DTOFIELD_PSVIEWTYPECATID, pSViewTypeCatId);
    }

    @JsonIgnore
    public String getPSViewTypeCatId() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPECATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeCatIdDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPECATID);
    }

    @JsonIgnore
    public void resetPSViewTypeCatId() {
        this._reset(DTOFIELD_PSVIEWTYPECATID);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypecatid(String pSViewTypeCatId) {
        this.setPSViewTypeCatId(pSViewTypeCatId);
        return this;
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypecatid(PSViewTypeCatDTO pSViewTypeCat) {
        if (pSViewTypeCat == null) {
            this.setPSViewTypeCatId(null);
            this.setPSViewTypeCatName(null);
        } else {
            this.setPSViewTypeCatId(pSViewTypeCat.getPSViewTypeCatId());
            this.setPSViewTypeCatName(pSViewTypeCat.getPSViewTypeCatName());
        }
        return this;
    }

    @JsonProperty(value="psviewtypecatname")
    public void setPSViewTypeCatName(String pSViewTypeCatName) {
        this._set(DTOFIELD_PSVIEWTYPECATNAME, pSViewTypeCatName);
    }

    @JsonIgnore
    public String getPSViewTypeCatName() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPECATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeCatNameDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPECATNAME);
    }

    @JsonIgnore
    public void resetPSViewTypeCatName() {
        this._reset(DTOFIELD_PSVIEWTYPECATNAME);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypecatname(String pSViewTypeCatName) {
        this.setPSViewTypeCatName(pSViewTypeCatName);
        return this;
    }

    @JsonProperty(value="psviewtypeid")
    public void setPSViewTypeId(String pSViewTypeId) {
        this._set(DTOFIELD_PSVIEWTYPEID, pSViewTypeId);
    }

    @JsonIgnore
    public String getPSViewTypeId() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeIdDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public void resetPSViewTypeId() {
        this._reset(DTOFIELD_PSVIEWTYPEID);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypeid(String pSViewTypeId) {
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypeid(PSViewTypeDTO pSViewType) {
        if (pSViewType == null) {
            this.setPSViewTypeId(null);
            this.setPSViewTypeName(null);
        } else {
            this.setPSViewTypeId(pSViewType.getPSViewTypeId());
            this.setPSViewTypeName(pSViewType.getPSViewTypeName());
        }
        return this;
    }

    @JsonProperty(value="psviewtypename")
    public void setPSViewTypeName(String pSViewTypeName) {
        this._set(DTOFIELD_PSVIEWTYPENAME, pSViewTypeName);
    }

    @JsonIgnore
    public String getPSViewTypeName() {
        Object objValue = this._get(DTOFIELD_PSVIEWTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSViewTypeNameDirty() {
        return this._contains(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public void resetPSViewTypeName() {
        this._reset(DTOFIELD_PSVIEWTYPENAME);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psviewtypename(String pSViewTypeName) {
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    @JsonProperty(value="psvtcatdetailid")
    public void setPSVTCatDetailId(String pSVTCatDetailId) {
        this._set(DTOFIELD_PSVTCATDETAILID, pSVTCatDetailId);
    }

    @JsonIgnore
    public String getPSVTCatDetailId() {
        Object objValue = this._get(DTOFIELD_PSVTCATDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTCatDetailIdDirty() {
        return this._contains(DTOFIELD_PSVTCATDETAILID);
    }

    @JsonIgnore
    public void resetPSVTCatDetailId() {
        this._reset(DTOFIELD_PSVTCATDETAILID);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psvtcatdetailid(String pSVTCatDetailId) {
        this.setPSVTCatDetailId(pSVTCatDetailId);
        return this;
    }

    @JsonProperty(value="psvtcatdetailname")
    public void setPSVTCatDetailName(String pSVTCatDetailName) {
        this._set(DTOFIELD_PSVTCATDETAILNAME, pSVTCatDetailName);
    }

    @JsonIgnore
    public String getPSVTCatDetailName() {
        Object objValue = this._get(DTOFIELD_PSVTCATDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVTCatDetailNameDirty() {
        return this._contains(DTOFIELD_PSVTCATDETAILNAME);
    }

    @JsonIgnore
    public void resetPSVTCatDetailName() {
        this._reset(DTOFIELD_PSVTCATDETAILNAME);
    }

    @JsonIgnore
    public PSVTCatDetailDTO psvtcatdetailname(String pSVTCatDetailName) {
        this.setPSVTCatDetailName(pSVTCatDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSVTCatDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSVTCatDetailName(strName);
    }

    @JsonIgnore
    public PSVTCatDetailDTO name(String strName) {
        this.setPSVTCatDetailName(strName);
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
    public PSVTCatDetailDTO updatedate(Timestamp updateDate) {
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
    public PSVTCatDetailDTO updateman(String updateMan) {
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
    public PSVTCatDetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSVTCatDetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSVTCatDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSVTCatDetailId(strValue);
    }

    @JsonIgnore
    public PSVTCatDetailDTO id(String strValue) {
        this.setPSVTCatDetailId(strValue);
        return this;
    }
}
