package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFLinkRoleDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSWFLINKID = "PSWFLINKID";
    protected static final String DTOFIELD_PSWFLINKID = "pswflinkid";
    public static final String FIELD_PSWFLINKNAME = "PSWFLINKNAME";
    protected static final String DTOFIELD_PSWFLINKNAME = "pswflinkname";
    public static final String FIELD_PSWFLINKROLEID = "PSWFLINKROLEID";
    protected static final String DTOFIELD_PSWFLINKROLEID = "pswflinkroleid";
    public static final String FIELD_PSWFLINKROLENAME = "PSWFLINKROLENAME";
    protected static final String DTOFIELD_PSWFLINKROLENAME = "pswflinkrolename";
    public static final String FIELD_PSWFPROCESSID = "PSWFPROCESSID";
    protected static final String DTOFIELD_PSWFPROCESSID = "pswfprocessid";
    public static final String FIELD_PSWFPROCROLEID = "PSWFPROCROLEID";
    protected static final String DTOFIELD_PSWFPROCROLEID = "pswfprocroleid";
    public static final String FIELD_PSWFPROCROLENAME = "PSWFPROCROLENAME";
    protected static final String DTOFIELD_PSWFPROCROLENAME = "pswfprocrolename";
    public static final String FIELD_PSWFVERSIONID = "PSWFVERSIONID";
    protected static final String DTOFIELD_PSWFVERSIONID = "pswfversionid";
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
    public PSWFLinkRoleDTO createdate(Timestamp createDate) {
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
    public PSWFLinkRoleDTO createman(String createMan) {
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
    public PSWFLinkRoleDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="pswflinkid")
    public void setPSWFLinkId(String pSWFLinkId) {
        this._set(DTOFIELD_PSWFLINKID, pSWFLinkId);
    }

    @JsonIgnore
    public String getPSWFLinkId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkIdDirty() {
        return this._contains(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public void resetPSWFLinkId() {
        this._reset(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswflinkid(String pSWFLinkId) {
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswflinkid(PSWFLinkDTO pSWFLink) {
        if (pSWFLink == null) {
            this.setPSWFLinkId(null);
            this.setPSWFLinkName(null);
            this.setPSWFProcessId(null);
            this.setPSWFVersionId(null);
        } else {
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
            this.setPSWFLinkName(pSWFLink.getPSWFLinkName());
            this.setPSWFProcessId(pSWFLink.getFromPSWFProcId());
            this.setPSWFVersionId(pSWFLink.getPSWFVersionId());
        }
        return this;
    }

    @JsonProperty(value="pswflinkname")
    public void setPSWFLinkName(String pSWFLinkName) {
        this._set(DTOFIELD_PSWFLINKNAME, pSWFLinkName);
    }

    @JsonIgnore
    public String getPSWFLinkName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkNameDirty() {
        return this._contains(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public void resetPSWFLinkName() {
        this._reset(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswflinkname(String pSWFLinkName) {
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    @JsonProperty(value="pswflinkroleid")
    public void setPSWFLinkRoleId(String pSWFLinkRoleId) {
        this._set(DTOFIELD_PSWFLINKROLEID, pSWFLinkRoleId);
    }

    @JsonIgnore
    public String getPSWFLinkRoleId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkRoleIdDirty() {
        return this._contains(DTOFIELD_PSWFLINKROLEID);
    }

    @JsonIgnore
    public void resetPSWFLinkRoleId() {
        this._reset(DTOFIELD_PSWFLINKROLEID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswflinkroleid(String pSWFLinkRoleId) {
        this.setPSWFLinkRoleId(pSWFLinkRoleId);
        return this;
    }

    @JsonProperty(value="pswflinkrolename")
    public void setPSWFLinkRoleName(String pSWFLinkRoleName) {
        this._set(DTOFIELD_PSWFLINKROLENAME, pSWFLinkRoleName);
    }

    @JsonIgnore
    public String getPSWFLinkRoleName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkRoleNameDirty() {
        return this._contains(DTOFIELD_PSWFLINKROLENAME);
    }

    @JsonIgnore
    public void resetPSWFLinkRoleName() {
        this._reset(DTOFIELD_PSWFLINKROLENAME);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswflinkrolename(String pSWFLinkRoleName) {
        this.setPSWFLinkRoleName(pSWFLinkRoleName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFLinkRoleName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFLinkRoleName(strName);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO name(String strName) {
        this.setPSWFLinkRoleName(strName);
        return this;
    }

    @JsonProperty(value="pswfprocessid")
    public void setPSWFProcessId(String pSWFProcessId) {
        this._set(DTOFIELD_PSWFPROCESSID, pSWFProcessId);
    }

    @JsonIgnore
    public String getPSWFProcessId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCESSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcessIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public void resetPSWFProcessId() {
        this._reset(DTOFIELD_PSWFPROCESSID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswfprocessid(String pSWFProcessId) {
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    @JsonProperty(value="pswfprocroleid")
    public void setPSWFProcRoleId(String pSWFProcRoleId) {
        this._set(DTOFIELD_PSWFPROCROLEID, pSWFProcRoleId);
    }

    @JsonIgnore
    public String getPSWFProcRoleId() {
        Object objValue = this._get(DTOFIELD_PSWFPROCROLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcRoleIdDirty() {
        return this._contains(DTOFIELD_PSWFPROCROLEID);
    }

    @JsonIgnore
    public void resetPSWFProcRoleId() {
        this._reset(DTOFIELD_PSWFPROCROLEID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswfprocroleid(String pSWFProcRoleId) {
        this.setPSWFProcRoleId(pSWFProcRoleId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswfprocroleid(PSWFProcRoleDTO pSWFProcRole) {
        if (pSWFProcRole == null) {
            this.setPSWFProcRoleId(null);
            this.setPSWFProcRoleName(null);
        } else {
            this.setPSWFProcRoleId(pSWFProcRole.getPSWFProcRoleId());
            this.setPSWFProcRoleName(pSWFProcRole.getPSWFProcRoleName());
        }
        return this;
    }

    @JsonProperty(value="pswfprocrolename")
    public void setPSWFProcRoleName(String pSWFProcRoleName) {
        this._set(DTOFIELD_PSWFPROCROLENAME, pSWFProcRoleName);
    }

    @JsonIgnore
    public String getPSWFProcRoleName() {
        Object objValue = this._get(DTOFIELD_PSWFPROCROLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFProcRoleNameDirty() {
        return this._contains(DTOFIELD_PSWFPROCROLENAME);
    }

    @JsonIgnore
    public void resetPSWFProcRoleName() {
        this._reset(DTOFIELD_PSWFPROCROLENAME);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswfprocrolename(String pSWFProcRoleName) {
        this.setPSWFProcRoleName(pSWFProcRoleName);
        return this;
    }

    @JsonProperty(value="pswfversionid")
    public void setPSWFVersionId(String pSWFVersionId) {
        this._set(DTOFIELD_PSWFVERSIONID, pSWFVersionId);
    }

    @JsonIgnore
    public String getPSWFVersionId() {
        Object objValue = this._get(DTOFIELD_PSWFVERSIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFVersionIdDirty() {
        return this._contains(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public void resetPSWFVersionId() {
        this._reset(DTOFIELD_PSWFVERSIONID);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO pswfversionid(String pSWFVersionId) {
        this.setPSWFVersionId(pSWFVersionId);
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
    public PSWFLinkRoleDTO updatedate(Timestamp updateDate) {
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
    public PSWFLinkRoleDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFLinkRoleId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFLinkRoleId(strValue);
    }

    @JsonIgnore
    public PSWFLinkRoleDTO id(String strValue) {
        this.setPSWFLinkRoleId(strValue);
        return this;
    }
}
