package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarItemDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCalendarItemRVDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEVIEWBASEID = "PSDEVIEWBASEID";
    protected static final String DTOFIELD_PSDEVIEWBASEID = "psdeviewbaseid";
    public static final String FIELD_PSDEVIEWBASENAME = "PSDEVIEWBASENAME";
    protected static final String DTOFIELD_PSDEVIEWBASENAME = "psdeviewbasename";
    public static final String FIELD_PSSYSCALENDARID = "PSSYSCALENDARID";
    protected static final String DTOFIELD_PSSYSCALENDARID = "pssyscalendarid";
    public static final String FIELD_PSSYSCALENDARITEMID = "PSSYSCALENDARITEMID";
    protected static final String DTOFIELD_PSSYSCALENDARITEMID = "pssyscalendaritemid";
    public static final String FIELD_PSSYSCALENDARITEMNAME = "PSSYSCALENDARITEMNAME";
    protected static final String DTOFIELD_PSSYSCALENDARITEMNAME = "pssyscalendaritemname";
    public static final String FIELD_PSSYSCALENDARITEMRVID = "PSSYSCALENDARITEMRVID";
    protected static final String DTOFIELD_PSSYSCALENDARITEMRVID = "pssyscalendaritemrvid";
    public static final String FIELD_PSSYSCALENDARITEMRVNAME = "PSSYSCALENDARITEMRVNAME";
    protected static final String DTOFIELD_PSSYSCALENDARITEMRVNAME = "pssyscalendaritemrvname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VIEWPARAMS = "VIEWPARAMS";
    protected static final String DTOFIELD_VIEWPARAMS = "viewparams";

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
    public PSSysCalendarItemRVDTO createdate(Timestamp createDate) {
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
    public PSSysCalendarItemRVDTO createman(String createMan) {
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
    public PSSysCalendarItemRVDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdeviewbaseid")
    public void setPSDEViewBaseId(String pSDEViewBaseId) {
        this._set(DTOFIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }

    @JsonIgnore
    public String getPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetPSDEViewBaseId() {
        this._reset(DTOFIELD_PSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO psdeviewbaseid(String pSDEViewBaseId) {
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        } else {
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="psdeviewbasename")
    public void setPSDEViewBaseName(String pSDEViewBaseName) {
        this._set(DTOFIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }

    @JsonIgnore
    public String getPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_PSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetPSDEViewBaseName() {
        this._reset(DTOFIELD_PSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO psdeviewbasename(String pSDEViewBaseName) {
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="pssyscalendarid")
    public void setPSSysCalendarId(String pSSysCalendarId) {
        this._set(DTOFIELD_PSSYSCALENDARID, pSSysCalendarId);
    }

    @JsonIgnore
    public String getPSSysCalendarId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public void resetPSSysCalendarId() {
        this._reset(DTOFIELD_PSSYSCALENDARID);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendarid(String pSSysCalendarId) {
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    @JsonProperty(value="pssyscalendaritemid")
    public void setPSSysCalendarItemId(String pSSysCalendarItemId) {
        this._set(DTOFIELD_PSSYSCALENDARITEMID, pSSysCalendarItemId);
    }

    @JsonIgnore
    public String getPSSysCalendarItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMID);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemId() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMID);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendaritemid(String pSSysCalendarItemId) {
        this.setPSSysCalendarItemId(pSSysCalendarItemId);
        return this;
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendaritemid(PSSysCalendarItemDTO pSSysCalendarItem) {
        if (pSSysCalendarItem == null) {
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarItemId(null);
            this.setPSSysCalendarItemName(null);
        } else {
            this.setPSSysCalendarId(pSSysCalendarItem.getPSSysCalendarId());
            this.setPSSysCalendarItemId(pSSysCalendarItem.getPSSysCalendarItemId());
            this.setPSSysCalendarItemName(pSSysCalendarItem.getPSSysCalendarItemName());
        }
        return this;
    }

    @JsonProperty(value="pssyscalendaritemname")
    public void setPSSysCalendarItemName(String pSSysCalendarItemName) {
        this._set(DTOFIELD_PSSYSCALENDARITEMNAME, pSSysCalendarItemName);
    }

    @JsonIgnore
    public String getPSSysCalendarItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemName() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendaritemname(String pSSysCalendarItemName) {
        this.setPSSysCalendarItemName(pSSysCalendarItemName);
        return this;
    }

    @JsonProperty(value="pssyscalendaritemrvid")
    public void setPSSysCalendarItemRVId(String pSSysCalendarItemRVId) {
        this._set(DTOFIELD_PSSYSCALENDARITEMRVID, pSSysCalendarItemRVId);
    }

    @JsonIgnore
    public String getPSSysCalendarItemRVId() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMRVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemRVIdDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMRVID);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemRVId() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMRVID);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendaritemrvid(String pSSysCalendarItemRVId) {
        this.setPSSysCalendarItemRVId(pSSysCalendarItemRVId);
        return this;
    }

    @JsonProperty(value="pssyscalendaritemrvname")
    public void setPSSysCalendarItemRVName(String pSSysCalendarItemRVName) {
        this._set(DTOFIELD_PSSYSCALENDARITEMRVNAME, pSSysCalendarItemRVName);
    }

    @JsonIgnore
    public String getPSSysCalendarItemRVName() {
        Object objValue = this._get(DTOFIELD_PSSYSCALENDARITEMRVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCalendarItemRVNameDirty() {
        return this._contains(DTOFIELD_PSSYSCALENDARITEMRVNAME);
    }

    @JsonIgnore
    public void resetPSSysCalendarItemRVName() {
        this._reset(DTOFIELD_PSSYSCALENDARITEMRVNAME);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO pssyscalendaritemrvname(String pSSysCalendarItemRVName) {
        this.setPSSysCalendarItemRVName(pSSysCalendarItemRVName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCalendarItemRVName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCalendarItemRVName(strName);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO name(String strName) {
        this.setPSSysCalendarItemRVName(strName);
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
    public PSSysCalendarItemRVDTO updatedate(Timestamp updateDate) {
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
    public PSSysCalendarItemRVDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="viewparams")
    public void setViewParams(String viewParams) {
        this._set(DTOFIELD_VIEWPARAMS, viewParams);
    }

    @JsonIgnore
    public String getViewParams() {
        Object objValue = this._get(DTOFIELD_VIEWPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParamsDirty() {
        return this._contains(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public void resetViewParams() {
        this._reset(DTOFIELD_VIEWPARAMS);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO viewparams(String viewParams) {
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCalendarItemRVId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCalendarItemRVId(strValue);
    }

    @JsonIgnore
    public PSSysCalendarItemRVDTO id(String strValue) {
        this.setPSSysCalendarItemRVId(strValue);
        return this;
    }
}
