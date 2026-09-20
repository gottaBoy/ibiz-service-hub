package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFIUDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSDEFIUDETAILID = "PSDEFIUDETAILID";
    protected static final String DTOFIELD_PSDEFIUDETAILID = "psdefiudetailid";
    public static final String FIELD_PSDEFIUDETAILNAME = "PSDEFIUDETAILNAME";
    protected static final String DTOFIELD_PSDEFIUDETAILNAME = "psdefiudetailname";
    public static final String FIELD_PSDEFIUPDATEID = "PSDEFIUPDATEID";
    protected static final String DTOFIELD_PSDEFIUPDATEID = "psdefiupdateid";
    public static final String FIELD_PSDEFIUPDATENAME = "PSDEFIUPDATENAME";
    protected static final String DTOFIELD_PSDEFIUPDATENAME = "psdefiupdatename";
    public static final String FIELD_PSDEFORMDETAILID = "PSDEFORMDETAILID";
    protected static final String DTOFIELD_PSDEFORMDETAILID = "psdeformdetailid";
    public static final String FIELD_PSDEFORMDETAILNAME = "PSDEFORMDETAILNAME";
    protected static final String DTOFIELD_PSDEFORMDETAILNAME = "psdeformdetailname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSDEFIUDetailDTO createdate(Timestamp createDate) {
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
    public PSDEFIUDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="psdefiudetailid")
    public void setPSDEFIUDetailId(String pSDEFIUDetailId) {
        this._set(DTOFIELD_PSDEFIUDETAILID, pSDEFIUDetailId);
    }

    @JsonIgnore
    public String getPSDEFIUDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEFIUDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEFIUDETAILID);
    }

    @JsonIgnore
    public void resetPSDEFIUDetailId() {
        this._reset(DTOFIELD_PSDEFIUDETAILID);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdefiudetailid(String pSDEFIUDetailId) {
        this.setPSDEFIUDetailId(pSDEFIUDetailId);
        return this;
    }

    @JsonProperty(value="psdefiudetailname")
    public void setPSDEFIUDetailName(String pSDEFIUDetailName) {
        this._set(DTOFIELD_PSDEFIUDETAILNAME, pSDEFIUDetailName);
    }

    @JsonIgnore
    public String getPSDEFIUDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEFIUDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEFIUDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEFIUDetailName() {
        this._reset(DTOFIELD_PSDEFIUDETAILNAME);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdefiudetailname(String pSDEFIUDetailName) {
        this.setPSDEFIUDetailName(pSDEFIUDetailName);
        return this;
    }

    @JsonProperty(value="psdefiupdateid")
    public void setPSDEFIUpdateId(String pSDEFIUpdateId) {
        this._set(DTOFIELD_PSDEFIUPDATEID, pSDEFIUpdateId);
    }

    @JsonIgnore
    public String getPSDEFIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDEFIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDEFIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDEFIUpdateId() {
        this._reset(DTOFIELD_PSDEFIUPDATEID);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdateid(String pSDEFIUpdateId) {
        this.setPSDEFIUpdateId(pSDEFIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdateid(PSDEFIUpdateDTO pSDEFIUpdate) {
        if (pSDEFIUpdate == null) {
            this.setPSDEFIUpdateId(null);
            this.setPSDEFIUpdateName(null);
        } else {
            this.setPSDEFIUpdateId(pSDEFIUpdate.getPSDEFIUpdateId());
            this.setPSDEFIUpdateName(pSDEFIUpdate.getPSDEFIUpdateName());
        }
        return this;
    }

    @JsonProperty(value="psdefiupdatename")
    public void setPSDEFIUpdateName(String pSDEFIUpdateName) {
        this._set(DTOFIELD_PSDEFIUPDATENAME, pSDEFIUpdateName);
    }

    @JsonIgnore
    public String getPSDEFIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDEFIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDEFIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDEFIUpdateName() {
        this._reset(DTOFIELD_PSDEFIUPDATENAME);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdatename(String pSDEFIUpdateName) {
        this.setPSDEFIUpdateName(pSDEFIUpdateName);
        return this;
    }

    @JsonProperty(value="psdeformdetailid")
    public void setPSDEFormDetailId(String pSDEFormDetailId) {
        this._set(DTOFIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }

    @JsonIgnore
    public String getPSDEFormDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public void resetPSDEFormDetailId() {
        this._reset(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailid(String pSDEFormDetailId) {
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailid(PSDEFormDetailDTO pSDEFormDetail) {
        if (pSDEFormDetail == null) {
            this.setPSDEFormDetailId(null);
            this.setPSDEFormDetailName(null);
        } else {
            this.setPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    @JsonProperty(value="psdeformdetailname")
    public void setPSDEFormDetailName(String pSDEFormDetailName) {
        this._set(DTOFIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }

    @JsonIgnore
    public String getPSDEFormDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEFormDetailName() {
        this._reset(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailname(String pSDEFormDetailName) {
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFormDetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFormDetailName(strName);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO name(String strName) {
        this.setPSDEFormDetailName(strName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFIUDetailDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
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
    public PSDEFIUDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEFIUDetailDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO id(String strValue) {
        this.setPSDEFIUDetailId(strValue);
        return this;
    }
}
