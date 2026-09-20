package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETEIUDetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_PSDETEIUDETAILID = "PSDETEIUDETAILID";
    protected static final String DTOFIELD_PSDETEIUDETAILID = "psdeteiudetailid";
    public static final String FIELD_PSDETEIUDETAILNAME = "PSDETEIUDETAILNAME";
    protected static final String DTOFIELD_PSDETEIUDETAILNAME = "psdeteiudetailname";
    public static final String FIELD_PSDETEIUPDATEID = "PSDETEIUPDATEID";
    protected static final String DTOFIELD_PSDETEIUPDATEID = "psdeteiupdateid";
    public static final String FIELD_PSDETEIUPDATENAME = "PSDETEIUPDATENAME";
    protected static final String DTOFIELD_PSDETEIUPDATENAME = "psdeteiupdatename";
    public static final String FIELD_PSDETREENODECOLID = "PSDETREENODECOLID";
    protected static final String DTOFIELD_PSDETREENODECOLID = "psdetreenodecolid";
    public static final String FIELD_PSDETREENODECOLNAME = "PSDETREENODECOLNAME";
    protected static final String DTOFIELD_PSDETREENODECOLNAME = "psdetreenodecolname";
    public static final String FIELD_PSDETREENODEID = "PSDETREENODEID";
    protected static final String DTOFIELD_PSDETREENODEID = "psdetreenodeid";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
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
    public PSDETEIUDetailDTO createdate(Timestamp createDate) {
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
    public PSDETEIUDetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="psdeteiudetailid")
    public void setPSDETEIUDetailId(String pSDETEIUDetailId) {
        this._set(DTOFIELD_PSDETEIUDETAILID, pSDETEIUDetailId);
    }

    @JsonIgnore
    public String getPSDETEIUDetailId() {
        Object objValue = this._get(DTOFIELD_PSDETEIUDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUDetailIdDirty() {
        return this._contains(DTOFIELD_PSDETEIUDETAILID);
    }

    @JsonIgnore
    public void resetPSDETEIUDetailId() {
        this._reset(DTOFIELD_PSDETEIUDETAILID);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdeteiudetailid(String pSDETEIUDetailId) {
        this.setPSDETEIUDetailId(pSDETEIUDetailId);
        return this;
    }

    @JsonProperty(value="psdeteiudetailname")
    public void setPSDETEIUDetailName(String pSDETEIUDetailName) {
        this._set(DTOFIELD_PSDETEIUDETAILNAME, pSDETEIUDetailName);
    }

    @JsonIgnore
    public String getPSDETEIUDetailName() {
        Object objValue = this._get(DTOFIELD_PSDETEIUDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUDetailNameDirty() {
        return this._contains(DTOFIELD_PSDETEIUDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDETEIUDetailName() {
        this._reset(DTOFIELD_PSDETEIUDETAILNAME);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdeteiudetailname(String pSDETEIUDetailName) {
        this.setPSDETEIUDetailName(pSDETEIUDetailName);
        return this;
    }

    @JsonProperty(value="psdeteiupdateid")
    public void setPSDETEIUpdateId(String pSDETEIUpdateId) {
        this._set(DTOFIELD_PSDETEIUPDATEID, pSDETEIUpdateId);
    }

    @JsonIgnore
    public String getPSDETEIUpdateId() {
        Object objValue = this._get(DTOFIELD_PSDETEIUPDATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUpdateIdDirty() {
        return this._contains(DTOFIELD_PSDETEIUPDATEID);
    }

    @JsonIgnore
    public void resetPSDETEIUpdateId() {
        this._reset(DTOFIELD_PSDETEIUPDATEID);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdeteiupdateid(String pSDETEIUpdateId) {
        this.setPSDETEIUpdateId(pSDETEIUpdateId);
        return this;
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdeteiupdateid(PSDETEIUpdateDTO pSDETEIUpdate) {
        if (pSDETEIUpdate == null) {
            this.setPSDETEIUpdateId(null);
            this.setPSDETEIUpdateName(null);
            this.setPSDETreeNodeId(null);
        } else {
            this.setPSDETEIUpdateId(pSDETEIUpdate.getPSDETEIUpdateId());
            this.setPSDETEIUpdateName(pSDETEIUpdate.getPSDETEIUpdateName());
            this.setPSDETreeNodeId(pSDETEIUpdate.getPSDETreeNodeId());
        }
        return this;
    }

    @JsonProperty(value="psdeteiupdatename")
    public void setPSDETEIUpdateName(String pSDETEIUpdateName) {
        this._set(DTOFIELD_PSDETEIUPDATENAME, pSDETEIUpdateName);
    }

    @JsonIgnore
    public String getPSDETEIUpdateName() {
        Object objValue = this._get(DTOFIELD_PSDETEIUPDATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETEIUpdateNameDirty() {
        return this._contains(DTOFIELD_PSDETEIUPDATENAME);
    }

    @JsonIgnore
    public void resetPSDETEIUpdateName() {
        this._reset(DTOFIELD_PSDETEIUPDATENAME);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdeteiupdatename(String pSDETEIUpdateName) {
        this.setPSDETEIUpdateName(pSDETEIUpdateName);
        return this;
    }

    @JsonProperty(value="psdetreenodecolid")
    public void setPSDETreeNodeColId(String pSDETreeNodeColId) {
        this._set(DTOFIELD_PSDETREENODECOLID, pSDETreeNodeColId);
    }

    @JsonIgnore
    public String getPSDETreeNodeColId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODECOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeColIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODECOLID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeColId() {
        this._reset(DTOFIELD_PSDETREENODECOLID);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreenodecolid(String pSDETreeNodeColId) {
        this.setPSDETreeNodeColId(pSDETreeNodeColId);
        return this;
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreenodecolid(PSDETreeNodeColDTO pSDETreeNodeCol) {
        if (pSDETreeNodeCol == null) {
            this.setPSDETreeNodeColId(null);
            this.setPSDETreeNodeColName(null);
        } else {
            this.setPSDETreeNodeColId(pSDETreeNodeCol.getPSDETreeNodeColId());
            this.setPSDETreeNodeColName(pSDETreeNodeCol.getPSDETreeNodeColName());
        }
        return this;
    }

    @JsonProperty(value="psdetreenodecolname")
    public void setPSDETreeNodeColName(String pSDETreeNodeColName) {
        this._set(DTOFIELD_PSDETREENODECOLNAME, pSDETreeNodeColName);
    }

    @JsonIgnore
    public String getPSDETreeNodeColName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODECOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeColNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODECOLNAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeColName() {
        this._reset(DTOFIELD_PSDETREENODECOLNAME);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreenodecolname(String pSDETreeNodeColName) {
        this.setPSDETreeNodeColName(pSDETreeNodeColName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeNodeColName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeNodeColName(strName);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO name(String strName) {
        this.setPSDETreeNodeColName(strName);
        return this;
    }

    @JsonProperty(value="psdetreenodeid")
    public void setPSDETreeNodeId(String pSDETreeNodeId) {
        this._set(DTOFIELD_PSDETREENODEID, pSDETreeNodeId);
    }

    @JsonIgnore
    public String getPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeId() {
        this._reset(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreenodeid(String pSDETreeNodeId) {
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    @JsonProperty(value="psdetreeviewid")
    public void setPSDETreeViewId(String pSDETreeViewId) {
        this._set(DTOFIELD_PSDETREEVIEWID, pSDETreeViewId);
    }

    @JsonIgnore
    public String getPSDETreeViewId() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewIdDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public void resetPSDETreeViewId() {
        this._reset(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
        if (pSDETreeView == null) {
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        } else {
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    @JsonProperty(value="psdetreeviewname")
    public void setPSDETreeViewName(String pSDETreeViewName) {
        this._set(DTOFIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }

    @JsonIgnore
    public String getPSDETreeViewName() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewNameDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDETreeViewName() {
        this._reset(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
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
    public PSDETEIUDetailDTO updatedate(Timestamp updateDate) {
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
    public PSDETEIUDetailDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETEIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETEIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDETEIUDetailDTO id(String strValue) {
        this.setPSDETEIUDetailId(strValue);
        return this;
    }
}
