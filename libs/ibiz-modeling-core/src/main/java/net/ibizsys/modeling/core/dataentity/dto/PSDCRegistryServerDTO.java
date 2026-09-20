package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCRegistryServerDTO extends PSModelDTOBase {
    public static final String FIELD_CONNSTR = "CONNSTR";
    protected static final String DTOFIELD_CONNSTR = "connstr";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PARAM = "PARAM";
    protected static final String DTOFIELD_PARAM = "param";
    public static final String FIELD_PARAM2 = "PARAM2";
    protected static final String DTOFIELD_PARAM2 = "param2";
    public static final String FIELD_PARAM3 = "PARAM3";
    protected static final String DTOFIELD_PARAM3 = "param3";
    public static final String FIELD_PARAM4 = "PARAM4";
    protected static final String DTOFIELD_PARAM4 = "param4";
    public static final String FIELD_PSCREDENTIALID = "PSCREDENTIALID";
    protected static final String DTOFIELD_PSCREDENTIALID = "pscredentialid";
    public static final String FIELD_PSCREDENTIALNAME = "PSCREDENTIALNAME";
    protected static final String DTOFIELD_PSCREDENTIALNAME = "pscredentialname";
    public static final String FIELD_PSDCREGISTRYSERVERID = "PSDCREGISTRYSERVERID";
    protected static final String DTOFIELD_PSDCREGISTRYSERVERID = "psdcregistryserverid";
    public static final String FIELD_PSDCREGISTRYSERVERNAME = "PSDCREGISTRYSERVERNAME";
    protected static final String DTOFIELD_PSDCREGISTRYSERVERNAME = "psdcregistryservername";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_REGISTRYTYPE = "REGISTRYTYPE";
    protected static final String DTOFIELD_REGISTRYTYPE = "registrytype";
    public static final String FIELD_RESSTATE = "RESSTATE";
    protected static final String DTOFIELD_RESSTATE = "resstate";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="connstr")
    public void setConnStr(String connStr) {
        this._set(DTOFIELD_CONNSTR, connStr);
    }

    @JsonIgnore
    public String getConnStr() {
        Object objValue = this._get(DTOFIELD_CONNSTR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isConnStrDirty() {
        return this._contains(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public void resetConnStr() {
        this._reset(DTOFIELD_CONNSTR);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO connstr(String connStr) {
        this.setConnStr(connStr);
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
    public PSDCRegistryServerDTO createdate(Timestamp createDate) {
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
    public PSDCRegistryServerDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultflag")
    public void setDefaultFlag(Integer defaultFlag) {
        this._set(DTOFIELD_DEFAULTFLAG, defaultFlag);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEFAULTFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        this._reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO defaultflag(Integer defaultFlag) {
        this.setDefaultFlag(defaultFlag);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryServerDTO defaultflag(Boolean defaultFlag) {
        this.setDefaultFlag(defaultFlag == null ? null : (defaultFlag ? 1 : 0));
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
    public PSDCRegistryServerDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="param")
    public void setParam(String param) {
        this._set(DTOFIELD_PARAM, param);
    }

    @JsonIgnore
    public String getParam() {
        Object objValue = this._get(DTOFIELD_PARAM);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDirty() {
        return this._contains(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public void resetParam() {
        this._reset(DTOFIELD_PARAM);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO param(String param) {
        this.setParam(param);
        return this;
    }

    @JsonProperty(value="param2")
    public void setParam2(String param2) {
        this._set(DTOFIELD_PARAM2, param2);
    }

    @JsonIgnore
    public String getParam2() {
        Object objValue = this._get(DTOFIELD_PARAM2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam2Dirty() {
        return this._contains(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public void resetParam2() {
        this._reset(DTOFIELD_PARAM2);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO param2(String param2) {
        this.setParam2(param2);
        return this;
    }

    @JsonProperty(value="param3")
    public void setParam3(String param3) {
        this._set(DTOFIELD_PARAM3, param3);
    }

    @JsonIgnore
    public String getParam3() {
        Object objValue = this._get(DTOFIELD_PARAM3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam3Dirty() {
        return this._contains(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public void resetParam3() {
        this._reset(DTOFIELD_PARAM3);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO param3(String param3) {
        this.setParam3(param3);
        return this;
    }

    @JsonProperty(value="param4")
    public void setParam4(String param4) {
        this._set(DTOFIELD_PARAM4, param4);
    }

    @JsonIgnore
    public String getParam4() {
        Object objValue = this._get(DTOFIELD_PARAM4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParam4Dirty() {
        return this._contains(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public void resetParam4() {
        this._reset(DTOFIELD_PARAM4);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO param4(String param4) {
        this.setParam4(param4);
        return this;
    }

    @JsonProperty(value="pscredentialid")
    public void setPSCredentialId(String pSCredentialId) {
        this._set(DTOFIELD_PSCREDENTIALID, pSCredentialId);
    }

    @JsonIgnore
    public String getPSCredentialId() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialIdDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public void resetPSCredentialId() {
        this._reset(DTOFIELD_PSCREDENTIALID);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO pscredentialid(String pSCredentialId) {
        this.setPSCredentialId(pSCredentialId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryServerDTO pscredentialid(PSCredentialDTO pSCredential) {
        if (pSCredential == null) {
            this.setPSCredentialId(null);
            this.setPSCredentialName(null);
        } else {
            this.setPSCredentialId(pSCredential.getPSCredentialId());
            this.setPSCredentialName(pSCredential.getPSCredentialName());
        }
        return this;
    }

    @JsonProperty(value="pscredentialname")
    public void setPSCredentialName(String pSCredentialName) {
        this._set(DTOFIELD_PSCREDENTIALNAME, pSCredentialName);
    }

    @JsonIgnore
    public String getPSCredentialName() {
        Object objValue = this._get(DTOFIELD_PSCREDENTIALNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCredentialNameDirty() {
        return this._contains(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public void resetPSCredentialName() {
        this._reset(DTOFIELD_PSCREDENTIALNAME);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO pscredentialname(String pSCredentialName) {
        this.setPSCredentialName(pSCredentialName);
        return this;
    }

    @JsonProperty(value="psdcregistryserverid")
    public void setPSDCRegistryServerId(String pSDCRegistryServerId) {
        this._set(DTOFIELD_PSDCREGISTRYSERVERID, pSDCRegistryServerId);
    }

    @JsonIgnore
    public String getPSDCRegistryServerId() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryServerIdDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYSERVERID);
    }

    @JsonIgnore
    public void resetPSDCRegistryServerId() {
        this._reset(DTOFIELD_PSDCREGISTRYSERVERID);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO psdcregistryserverid(String pSDCRegistryServerId) {
        this.setPSDCRegistryServerId(pSDCRegistryServerId);
        return this;
    }

    @JsonProperty(value="psdcregistryservername")
    public void setPSDCRegistryServerName(String pSDCRegistryServerName) {
        this._set(DTOFIELD_PSDCREGISTRYSERVERNAME, pSDCRegistryServerName);
    }

    @JsonIgnore
    public String getPSDCRegistryServerName() {
        Object objValue = this._get(DTOFIELD_PSDCREGISTRYSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRegistryServerNameDirty() {
        return this._contains(DTOFIELD_PSDCREGISTRYSERVERNAME);
    }

    @JsonIgnore
    public void resetPSDCRegistryServerName() {
        this._reset(DTOFIELD_PSDCREGISTRYSERVERNAME);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO psdcregistryservername(String pSDCRegistryServerName) {
        this.setPSDCRegistryServerName(pSDCRegistryServerName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryServerDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="registrytype")
    public void setRegistryType(String registryType) {
        this._set(DTOFIELD_REGISTRYTYPE, registryType);
    }

    @JsonIgnore
    public String getRegistryType() {
        Object objValue = this._get(DTOFIELD_REGISTRYTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRegistryTypeDirty() {
        return this._contains(DTOFIELD_REGISTRYTYPE);
    }

    @JsonIgnore
    public void resetRegistryType() {
        this._reset(DTOFIELD_REGISTRYTYPE);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO registrytype(String registryType) {
        this.setRegistryType(registryType);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryServerDTO registrytype(PSModelEnums.RegistryServerType registryType) {
        this.setRegistryType(registryType == null ? null : registryType.value);
        return this;
    }

    @JsonProperty(value="resstate")
    public void setResState(Integer resState) {
        this._set(DTOFIELD_RESSTATE, resState);
    }

    @JsonIgnore
    public Integer getResState() {
        Object objValue = this._get(DTOFIELD_RESSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isResStateDirty() {
        return this._contains(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public void resetResState() {
        this._reset(DTOFIELD_RESSTATE);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO resstate(Integer resState) {
        this.setResState(resState);
        return this;
    }

    @JsonIgnore
    public PSDCRegistryServerDTO resstate(PSModelEnums.DCResState resState) {
        this.setResState(resState == null ? null : resState.value);
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
    public PSDCRegistryServerDTO updatedate(Timestamp updateDate) {
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
    public PSDCRegistryServerDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return this._contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        this._reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO usertag(String userTag) {
        this.setUserTag(userTag);
        return this;
    }

    @JsonProperty(value="usertag2")
    public void setUserTag2(String userTag2) {
        this._set(DTOFIELD_USERTAG2, userTag2);
    }

    @JsonIgnore
    public String getUserTag2() {
        Object objValue = this._get(DTOFIELD_USERTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return this._contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        this._reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="usertag3")
    public void setUserTag3(String userTag3) {
        this._set(DTOFIELD_USERTAG3, userTag3);
    }

    @JsonIgnore
    public String getUserTag3() {
        Object objValue = this._get(DTOFIELD_USERTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return this._contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        this._reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO usertag3(String userTag3) {
        this.setUserTag3(userTag3);
        return this;
    }

    @JsonProperty(value="usertag4")
    public void setUserTag4(String userTag4) {
        this._set(DTOFIELD_USERTAG4, userTag4);
    }

    @JsonIgnore
    public String getUserTag4() {
        Object objValue = this._get(DTOFIELD_USERTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return this._contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        this._reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCRegistryServerName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCRegistryServerName(strName);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO name(String strName) {
        this.setPSDCRegistryServerName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCRegistryServerId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCRegistryServerId(strValue);
    }

    @JsonIgnore
    public PSDCRegistryServerDTO id(String strValue) {
        this.setPSDCRegistryServerId(strValue);
        return this;
    }

}
