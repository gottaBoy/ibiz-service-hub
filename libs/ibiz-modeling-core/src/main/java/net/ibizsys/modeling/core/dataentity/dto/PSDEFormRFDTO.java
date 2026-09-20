package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFormRFDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MAJORPSDEFORMID = "MAJORPSDEFORMID";
    protected static final String DTOFIELD_MAJORPSDEFORMID = "majorpsdeformid";
    public static final String FIELD_MAJORPSDEFORMNAME = "MAJORPSDEFORMNAME";
    protected static final String DTOFIELD_MAJORPSDEFORMNAME = "majorpsdeformname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORPSDEFORMID = "MINORPSDEFORMID";
    protected static final String DTOFIELD_MINORPSDEFORMID = "minorpsdeformid";
    public static final String FIELD_MINORPSDEFORMNAME = "MINORPSDEFORMNAME";
    protected static final String DTOFIELD_MINORPSDEFORMNAME = "minorpsdeformname";
    public static final String FIELD_PSDEFORMRFID = "PSDEFORMRFID";
    protected static final String DTOFIELD_PSDEFORMRFID = "psdeformrfid";
    public static final String FIELD_PSDEFORMRFNAME = "PSDEFORMRFNAME";
    protected static final String DTOFIELD_PSDEFORMRFNAME = "psdeformrfname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
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
    public PSDEFormRFDTO createdate(Timestamp createDate) {
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
    public PSDEFormRFDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="majorpsdeformid")
    public void setMajorPSDEFormId(String majorPSDEFormId) {
        this._set(DTOFIELD_MAJORPSDEFORMID, majorPSDEFormId);
    }

    @JsonIgnore
    public String getMajorPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFORMID);
    }

    @JsonIgnore
    public void resetMajorPSDEFormId() {
        this._reset(DTOFIELD_MAJORPSDEFORMID);
    }

    @JsonIgnore
    public PSDEFormRFDTO majorpsdeformid(String majorPSDEFormId) {
        this.setMajorPSDEFormId(majorPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFormRFDTO majorpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMajorPSDEFormId(null);
            this.setMajorPSDEFormName(null);
            this.setPSDEId(null);
        } else {
            this.setMajorPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMajorPSDEFormName(pSDEForm.getPSDEFormName());
            this.setPSDEId(pSDEForm.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="majorpsdeformname")
    public void setMajorPSDEFormName(String majorPSDEFormName) {
        this._set(DTOFIELD_MAJORPSDEFORMNAME, majorPSDEFormName);
    }

    @JsonIgnore
    public String getMajorPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MAJORPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMajorPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MAJORPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMajorPSDEFormName() {
        this._reset(DTOFIELD_MAJORPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFormRFDTO majorpsdeformname(String majorPSDEFormName) {
        this.setMajorPSDEFormName(majorPSDEFormName);
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
    public PSDEFormRFDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorpsdeformid")
    public void setMinorPSDEFormId(String minorPSDEFormId) {
        this._set(DTOFIELD_MINORPSDEFORMID, minorPSDEFormId);
    }

    @JsonIgnore
    public String getMinorPSDEFormId() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFormIdDirty() {
        return this._contains(DTOFIELD_MINORPSDEFORMID);
    }

    @JsonIgnore
    public void resetMinorPSDEFormId() {
        this._reset(DTOFIELD_MINORPSDEFORMID);
    }

    @JsonIgnore
    public PSDEFormRFDTO minorpsdeformid(String minorPSDEFormId) {
        this.setMinorPSDEFormId(minorPSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFormRFDTO minorpsdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setMinorPSDEFormId(null);
            this.setMinorPSDEFormName(null);
        } else {
            this.setMinorPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMinorPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="minorpsdeformname")
    public void setMinorPSDEFormName(String minorPSDEFormName) {
        this._set(DTOFIELD_MINORPSDEFORMNAME, minorPSDEFormName);
    }

    @JsonIgnore
    public String getMinorPSDEFormName() {
        Object objValue = this._get(DTOFIELD_MINORPSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorPSDEFormNameDirty() {
        return this._contains(DTOFIELD_MINORPSDEFORMNAME);
    }

    @JsonIgnore
    public void resetMinorPSDEFormName() {
        this._reset(DTOFIELD_MINORPSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFormRFDTO minorpsdeformname(String minorPSDEFormName) {
        this.setMinorPSDEFormName(minorPSDEFormName);
        return this;
    }

    @JsonProperty(value="psdeformrfid")
    public void setPSDEFormRFId(String pSDEFormRFId) {
        this._set(DTOFIELD_PSDEFORMRFID, pSDEFormRFId);
    }

    @JsonIgnore
    public String getPSDEFormRFId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMRFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormRFIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMRFID);
    }

    @JsonIgnore
    public void resetPSDEFormRFId() {
        this._reset(DTOFIELD_PSDEFORMRFID);
    }

    @JsonIgnore
    public PSDEFormRFDTO psdeformrfid(String pSDEFormRFId) {
        this.setPSDEFormRFId(pSDEFormRFId);
        return this;
    }

    @JsonProperty(value="psdeformrfname")
    public void setPSDEFormRFName(String pSDEFormRFName) {
        this._set(DTOFIELD_PSDEFORMRFNAME, pSDEFormRFName);
    }

    @JsonIgnore
    public String getPSDEFormRFName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMRFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormRFNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMRFNAME);
    }

    @JsonIgnore
    public void resetPSDEFormRFName() {
        this._reset(DTOFIELD_PSDEFORMRFNAME);
    }

    @JsonIgnore
    public PSDEFormRFDTO psdeformrfname(String pSDEFormRFName) {
        this.setPSDEFormRFName(pSDEFormRFName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFormRFName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFormRFName(strName);
    }

    @JsonIgnore
    public PSDEFormRFDTO name(String strName) {
        this.setPSDEFormRFName(strName);
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
    public PSDEFormRFDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
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
    public PSDEFormRFDTO updatedate(Timestamp updateDate) {
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
    public PSDEFormRFDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFormRFId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFormRFId(strValue);
    }

    @JsonIgnore
    public PSDEFormRFDTO id(String strValue) {
        this.setPSDEFormRFId(strValue);
        return this;
    }
}
