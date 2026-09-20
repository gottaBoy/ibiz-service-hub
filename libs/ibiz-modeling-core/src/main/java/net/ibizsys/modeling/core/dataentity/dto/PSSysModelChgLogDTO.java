package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysModelChgLogDTO
extends PSModelDTOBase {
    public static final String FIELD_CHGTYPE = "CHGTYPE";
    protected static final String DTOFIELD_CHGTYPE = "chgtype";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_OBJTYPE = "OBJTYPE";
    protected static final String DTOFIELD_OBJTYPE = "objtype";
    public static final String FIELD_OWNERID = "OWNERID";
    protected static final String DTOFIELD_OWNERID = "ownerid";
    public static final String FIELD_OWNERNAME = "OWNERNAME";
    protected static final String DTOFIELD_OWNERNAME = "ownername";
    public static final String FIELD_OWNERTYPE = "OWNERTYPE";
    protected static final String DTOFIELD_OWNERTYPE = "ownertype";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSSYSAPPID = "PSSYSAPPID";
    protected static final String DTOFIELD_PSSYSAPPID = "pssysappid";
    public static final String FIELD_PSSYSAPPNAME = "PSSYSAPPNAME";
    protected static final String DTOFIELD_PSSYSAPPNAME = "pssysappname";
    public static final String FIELD_PSSYSMODELCHGLOGID = "PSSYSDBCHGLOGID";
    protected static final String DTOFIELD_PSSYSMODELCHGLOGID = "pssysmodelchglogid";
    public static final String FIELD_PSSYSMODELCHGLOGNAME = "PSSYSDBCHGLOGNAME";
    protected static final String DTOFIELD_PSSYSMODELCHGLOGNAME = "pssysmodelchglogname";
    public static final String FIELD_REMOTEADDR = "REMOTEADDR";
    protected static final String DTOFIELD_REMOTEADDR = "remoteaddr";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VERSION = "VERSION";
    protected static final String DTOFIELD_VERSION = "version";

    @JsonProperty(value="chgtype")
    public void setChgType(String chgType) {
        this._set(DTOFIELD_CHGTYPE, chgType);
    }

    @JsonIgnore
    public String getChgType() {
        Object objValue = this._get(DTOFIELD_CHGTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChgTypeDirty() {
        return this._contains(DTOFIELD_CHGTYPE);
    }

    @JsonIgnore
    public void resetChgType() {
        this._reset(DTOFIELD_CHGTYPE);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO chgtype(String chgType) {
        this.setChgType(chgType);
        return this;
    }

    @JsonIgnore
    public PSSysModelChgLogDTO chgtype(PSModelEnums.PSModelChangeType chgType) {
        if (chgType == null) {
            this.setChgType(null);
        } else {
            this.setChgType(chgType.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getCHGType() {
        return this.getChgType();
    }

    @JsonIgnore
    @Deprecated
    public void setCHGType(String cHGType) {
        this.setChgType(cHGType);
    }

    @JsonIgnore
    @Deprecated
    public boolean isCHGTypeDirty() {
        return this.isChgTypeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetCHGType() {
        this.resetChgType();
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
    public PSSysModelChgLogDTO createdate(Timestamp createDate) {
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
    public PSSysModelChgLogDTO createman(String createMan) {
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
    public PSSysModelChgLogDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="objtype")
    public void setObjType(String objType) {
        this._set(DTOFIELD_OBJTYPE, objType);
    }

    @JsonIgnore
    public String getObjType() {
        Object objValue = this._get(DTOFIELD_OBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjTypeDirty() {
        return this._contains(DTOFIELD_OBJTYPE);
    }

    @JsonIgnore
    public void resetObjType() {
        this._reset(DTOFIELD_OBJTYPE);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO objtype(String objType) {
        this.setObjType(objType);
        return this;
    }

    @JsonProperty(value="ownerid")
    public void setOwnerId(String ownerId) {
        this._set(DTOFIELD_OWNERID, ownerId);
    }

    @JsonIgnore
    public String getOwnerId() {
        Object objValue = this._get(DTOFIELD_OWNERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerIdDirty() {
        return this._contains(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public void resetOwnerId() {
        this._reset(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO ownerid(String ownerId) {
        this.setOwnerId(ownerId);
        return this;
    }

    @JsonProperty(value="ownername")
    public void setOwnerName(String ownerName) {
        this._set(DTOFIELD_OWNERNAME, ownerName);
    }

    @JsonIgnore
    public String getOwnerName() {
        Object objValue = this._get(DTOFIELD_OWNERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerNameDirty() {
        return this._contains(DTOFIELD_OWNERNAME);
    }

    @JsonIgnore
    public void resetOwnerName() {
        this._reset(DTOFIELD_OWNERNAME);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO ownername(String ownerName) {
        this.setOwnerName(ownerName);
        return this;
    }

    @JsonProperty(value="ownertype")
    public void setOwnerType(String ownerType) {
        this._set(DTOFIELD_OWNERTYPE, ownerType);
    }

    @JsonIgnore
    public String getOwnerType() {
        Object objValue = this._get(DTOFIELD_OWNERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerTypeDirty() {
        return this._contains(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public void resetOwnerType() {
        this._reset(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO ownertype(String ownerType) {
        this.setOwnerType(ownerType);
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
    public PSSysModelChgLogDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysModelChgLogDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdename")
    public void setPSDEName(String pSDEName) {
        this._set(DTOFIELD_PSDENAME, pSDEName);
    }

    @JsonIgnore
    public String getPSDEName() {
        Object objValue = this._get(DTOFIELD_PSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDENameDirty() {
        return this._contains(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public void resetPSDEName() {
        this._reset(DTOFIELD_PSDENAME);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSObjId(String pSObjId) {
        this._set(DTOFIELD_PSOBJID, pSObjId);
    }

    @JsonIgnore
    public String getPSObjId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSObjId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSObjName(String pSObjName) {
        this._set(DTOFIELD_PSOBJNAME, pSObjName);
    }

    @JsonIgnore
    public String getPSObjName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSObjName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO psobjname(String pSObjName) {
        this.setPSObjName(pSObjName);
        return this;
    }

    @JsonProperty(value="pssysappid")
    public void setPSSysAppId(String pSSysAppId) {
        this._set(DTOFIELD_PSSYSAPPID, pSSysAppId);
    }

    @JsonIgnore
    public String getPSSysAppId() {
        Object objValue = this._get(DTOFIELD_PSSYSAPPID);
        if (objValue == null) {
            return null;
        }
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
    public PSSysModelChgLogDTO pssysappid(String pSSysAppId) {
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    @JsonIgnore
    public PSSysModelChgLogDTO pssysappid(PSSysAppDTO pSSysApp) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSSysModelChgLogDTO pssysappname(String pSSysAppName) {
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    @JsonProperty(value="pssysmodelchglogid")
    public void setPSSysModelChgLogId(String pSSysModelChgLogId) {
        this._set(DTOFIELD_PSSYSMODELCHGLOGID, pSSysModelChgLogId);
        this._set(FIELD_PSSYSMODELCHGLOGID, pSSysModelChgLogId);
    }

    @JsonIgnore
    public String getPSSysModelChgLogId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELCHGLOGID);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSMODELCHGLOGID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelChgLogIdDirty() {
        if (this._contains(DTOFIELD_PSSYSMODELCHGLOGID)) {
            return true;
        }
        return this._contains(FIELD_PSSYSMODELCHGLOGID);
    }

    @JsonIgnore
    public void resetPSSysModelChgLogId() {
        this._reset(DTOFIELD_PSSYSMODELCHGLOGID);
        this._reset(FIELD_PSSYSMODELCHGLOGID);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO pssysmodelchglogid(String pSSysModelChgLogId) {
        this.setPSSysModelChgLogId(pSSysModelChgLogId);
        return this;
    }

    @JsonProperty(value="pssysmodelchglogname")
    public void setPSSysModelChgLogName(String pSSysModelChgLogName) {
        this._set(DTOFIELD_PSSYSMODELCHGLOGNAME, pSSysModelChgLogName);
        this._set(FIELD_PSSYSMODELCHGLOGNAME, pSSysModelChgLogName);
    }

    @JsonIgnore
    public String getPSSysModelChgLogName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELCHGLOGNAME);
        if (objValue == null && (objValue = this._get(FIELD_PSSYSMODELCHGLOGNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelChgLogNameDirty() {
        if (this._contains(DTOFIELD_PSSYSMODELCHGLOGNAME)) {
            return true;
        }
        return this._contains(FIELD_PSSYSMODELCHGLOGNAME);
    }

    @JsonIgnore
    public void resetPSSysModelChgLogName() {
        this._reset(DTOFIELD_PSSYSMODELCHGLOGNAME);
        this._reset(FIELD_PSSYSMODELCHGLOGNAME);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO pssysmodelchglogname(String pSSysModelChgLogName) {
        this.setPSSysModelChgLogName(pSSysModelChgLogName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysModelChgLogName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysModelChgLogName(strName);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO name(String strName) {
        this.setPSSysModelChgLogName(strName);
        return this;
    }

    @JsonProperty(value="remoteaddr")
    public void setRemoteAddr(String remoteAddr) {
        this._set(DTOFIELD_REMOTEADDR, remoteAddr);
    }

    @JsonIgnore
    public String getRemoteAddr() {
        Object objValue = this._get(DTOFIELD_REMOTEADDR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemoteAddrDirty() {
        return this._contains(DTOFIELD_REMOTEADDR);
    }

    @JsonIgnore
    public void resetRemoteAddr() {
        this._reset(DTOFIELD_REMOTEADDR);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO remoteaddr(String remoteAddr) {
        this.setRemoteAddr(remoteAddr);
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
    public PSSysModelChgLogDTO updatedate(Timestamp updateDate) {
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
    public PSSysModelChgLogDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysModelChgLogDTO version(Integer version) {
        this.setVersion(version);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysModelChgLogId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysModelChgLogId(strValue);
    }

    @JsonIgnore
    public PSSysModelChgLogDTO id(String strValue) {
        this.setPSSysModelChgLogId(strValue);
        return this;
    }
}
