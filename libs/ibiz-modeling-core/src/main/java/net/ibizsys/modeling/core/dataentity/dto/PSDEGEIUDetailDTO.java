package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEGEIUDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSDEGEIUDETAILID = "PSDEGEIUDETAILID";
    protected static final String DTOFIELD_PSDEGEIUDETAILID = "psdegeiudetailid";
    public static final String FIELD_PSDEGEIUDETAILNAME = "PSDEGEIUDETAILNAME";
    protected static final String DTOFIELD_PSDEGEIUDETAILNAME = "psdegeiudetailname";
    public static final String FIELD_PSDEGEIUPDATEID = "PSDEGEIUPDATEID";
    protected static final String DTOFIELD_PSDEGEIUPDATEID = "psdegeiupdateid";
    public static final String FIELD_PSDEGEIUPDATENAME = "PSDEGEIUPDATENAME";
    protected static final String DTOFIELD_PSDEGEIUPDATENAME = "psdegeiupdatename";
    public static final String FIELD_PSDEGRIDCOLID = "PSDEGRIDCOLID";
    protected static final String DTOFIELD_PSDEGRIDCOLID = "psdegridcolid";
    public static final String FIELD_PSDEGRIDCOLNAME = "PSDEGRIDCOLNAME";
    protected static final String DTOFIELD_PSDEGRIDCOLNAME = "psdegridcolname";
    public static final String FIELD_PSDEGRIDID = "PSDEGRIDID";
    protected static final String DTOFIELD_PSDEGRIDID = "psdegridid";
    public static final String FIELD_PSDEGRIDNAME = "PSDEGRIDNAME";
    protected static final String DTOFIELD_PSDEGRIDNAME = "psdegridname";
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
    public PSDEGEIUDetailDTO createdate(Timestamp createDate) {
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
    public PSDEGEIUDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="psdegeiudetailid")
    public void setPSDEGEIUDetailId(String pSDEGEIUDetailId) {
        this._set(DTOFIELD_PSDEGEIUDETAILID, pSDEGEIUDetailId);
    }

    @JsonIgnore
    public String getPSDEGEIUDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEGEIUDETAILID);
    }

    @JsonIgnore
    public void resetPSDEGEIUDetailId() {
        this._reset(DTOFIELD_PSDEGEIUDETAILID);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegeiudetailid(String pSDEGEIUDetailId) {
        this.setPSDEGEIUDetailId(pSDEGEIUDetailId);
        return this;
    }

    @JsonProperty(value="psdegeiudetailname")
    public void setPSDEGEIUDetailName(String pSDEGEIUDetailName) {
        this._set(DTOFIELD_PSDEGEIUDETAILNAME, pSDEGEIUDetailName);
    }

    @JsonIgnore
    public String getPSDEGEIUDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEGEIUDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEGEIUDetailName() {
        this._reset(DTOFIELD_PSDEGEIUDETAILNAME);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegeiudetailname(String pSDEGEIUDetailName) {
        this.setPSDEGEIUDetailName(pSDEGEIUDetailName);
        return this;
    }

    @JsonProperty(value="psdegeiupdateid")
    public void setPSDEGEIUpdateId(String pSDEGEIUpdateId) {
        this._set(DTOFIELD_PSDEGEIUPDATEID, pSDEGEIUpdateId);
    }

    @JsonIgnore
    public String getPSDEGEIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDEGEIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDEGEIUpdateId() {
        this._reset(DTOFIELD_PSDEGEIUPDATEID);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegeiupdateid(String pSDEGEIUpdateId) {
        this.setPSDEGEIUpdateId(pSDEGEIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegeiupdateid(PSDEGEIUpdateDTO pSDEGEIUpdate) {
        if (pSDEGEIUpdate == null) {
            this.setPSDEGEIUpdateId(null);
            this.setPSDEGEIUpdateName(null);
        } else {
            this.setPSDEGEIUpdateId(pSDEGEIUpdate.getPSDEGEIUpdateId());
            this.setPSDEGEIUpdateName(pSDEGEIUpdate.getPSDEGEIUpdateName());
        }
        return this;
    }

    @JsonProperty(value="psdegeiupdatename")
    public void setPSDEGEIUpdateName(String pSDEGEIUpdateName) {
        this._set(DTOFIELD_PSDEGEIUPDATENAME, pSDEGEIUpdateName);
    }

    @JsonIgnore
    public String getPSDEGEIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDEGEIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGEIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDEGEIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDEGEIUpdateName() {
        this._reset(DTOFIELD_PSDEGEIUPDATENAME);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegeiupdatename(String pSDEGEIUpdateName) {
        this.setPSDEGEIUpdateName(pSDEGEIUpdateName);
        return this;
    }

    @JsonProperty(value="psdegridcolid")
    public void setPSDEGridColId(String pSDEGridColId) {
        this._set(DTOFIELD_PSDEGRIDCOLID, pSDEGridColId);
    }

    @JsonIgnore
    public String getPSDEGridColId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public void resetPSDEGridColId() {
        this._reset(DTOFIELD_PSDEGRIDCOLID);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridcolid(String pSDEGridColId) {
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridcolid(PSDEGridColDTO pSDEGridCol) {
        if (pSDEGridCol == null) {
            this.setPSDEGridColId(null);
            this.setPSDEGridColName(null);
        } else {
            this.setPSDEGridColId(pSDEGridCol.getPSDEGridColId());
            this.setPSDEGridColName(pSDEGridCol.getPSDEGridColName());
        }
        return this;
    }

    @JsonProperty(value="psdegridcolname")
    public void setPSDEGridColName(String pSDEGridColName) {
        this._set(DTOFIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }

    @JsonIgnore
    public String getPSDEGridColName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDCOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridColNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public void resetPSDEGridColName() {
        this._reset(DTOFIELD_PSDEGRIDCOLNAME);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridcolname(String pSDEGridColName) {
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEGridColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEGridColName(strName);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO name(String strName) {
        this.setPSDEGridColName(strName);
        return this;
    }

    @JsonProperty(value="psdegridid")
    public void setPSDEGridId(String pSDEGridId) {
        this._set(DTOFIELD_PSDEGRIDID, pSDEGridId);
    }

    @JsonIgnore
    public String getPSDEGridId() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridIdDirty() {
        return this._contains(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public void resetPSDEGridId() {
        this._reset(DTOFIELD_PSDEGRIDID);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridid(String pSDEGridId) {
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridid(PSDEGridDTO pSDEGrid) {
        if (pSDEGrid == null) {
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        } else {
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    @JsonProperty(value="psdegridname")
    public void setPSDEGridName(String pSDEGridName) {
        this._set(DTOFIELD_PSDEGRIDNAME, pSDEGridName);
    }

    @JsonIgnore
    public String getPSDEGridName() {
        Object objValue = this._get(DTOFIELD_PSDEGRIDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEGridNameDirty() {
        return this._contains(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public void resetPSDEGridName() {
        this._reset(DTOFIELD_PSDEGRIDNAME);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO psdegridname(String pSDEGridName) {
        this.setPSDEGridName(pSDEGridName);
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
    public PSDEGEIUDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDEGEIUDetailDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEGEIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEGEIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDEGEIUDetailDTO id(String strValue) {
        this.setPSDEGEIUDetailId(strValue);
        return this;
    }
}
