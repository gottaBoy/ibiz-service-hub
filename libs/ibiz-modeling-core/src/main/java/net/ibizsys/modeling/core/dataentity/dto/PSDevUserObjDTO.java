package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Development-center user object DTO.
 *
 * <p>The modeling API uses lower-case JSON property names while the public
 * field constants retain the model metadata names. Values are kept in the
 * {@link net.ibizsys.central.util.EntityDTO} map so dirty tracking remains
 * compatible with the runtime.</p>
 */
public class PSDevUserObjDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_DUTAG = "DUTAG";
    protected static final String DTOFIELD_DUTAG = "dutag";
    public static final String FIELD_DUTAG2 = "DUTAG2";
    protected static final String DTOFIELD_DUTAG2 = "dutag2";
    public static final String FIELD_DUTAG3 = "DUTAG3";
    protected static final String DTOFIELD_DUTAG3 = "dutag3";
    public static final String FIELD_DUTAG4 = "DUTAG4";
    protected static final String DTOFIELD_DUTAG4 = "dutag4";
    public static final String FIELD_ENABLE = "ENABLE";
    protected static final String DTOFIELD_ENABLE = "enable";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVUSEROBJECTID = "PSDEVUSEROBJID";
    protected static final String DTOFIELD_PSDEVUSEROBJECTID = "psdevuserobjectid";
    public static final String FIELD_PSDEVUSEROBJNAME = "PSDEVUSEROBJNAME";
    protected static final String DTOFIELD_PSDEVUSEROBJNAME = "psdevuserobjname";
    public static final String FIELD_PSDEVUSEROBJTYPE = "PSDEVUSEROBJTYPE";
    protected static final String DTOFIELD_PSDEVUSEROBJTYPE = "psdevuserobjtype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    protected static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) {
        _set(DTOFIELD_CREATEDATE, value);
    }

    @JsonIgnore
    public Timestamp getCreateDate() {
        return (Timestamp) _get(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public boolean isCreateDateDirty() {
        return _contains(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public void resetCreateDate() {
        _reset(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public PSDevUserObjDTO createdate(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    @JsonProperty("createman")
    public void setCreateMan(String value) {
        _set(DTOFIELD_CREATEMAN, value);
    }

    @JsonIgnore
    public String getCreateMan() {
        return (String) _get(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public boolean isCreateManDirty() {
        return _contains(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public void resetCreateMan() {
        _reset(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public PSDevUserObjDTO createman(String value) {
        setCreateMan(value);
        return this;
    }

    @JsonProperty("defaultflag")
    public void setDefaultFlag(Integer value) {
        _set(DTOFIELD_DEFAULTFLAG, value);
    }

    @JsonIgnore
    public Integer getDefaultFlag() {
        return (Integer) _get(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public boolean isDefaultFlagDirty() {
        return _contains(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDefaultFlag() {
        _reset(DTOFIELD_DEFAULTFLAG);
    }

    @JsonIgnore
    public PSDevUserObjDTO defaultflag(Integer value) {
        setDefaultFlag(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserObjDTO defaultflag(Boolean value) {
        setDefaultFlag(flagValue(value));
        return this;
    }

    @JsonProperty("dutag")
    public void setDUTag(String value) {
        _set(DTOFIELD_DUTAG, value);
    }

    @JsonIgnore
    public String getDUTag() {
        return (String) _get(DTOFIELD_DUTAG);
    }

    @JsonIgnore
    public boolean isDUTagDirty() {
        return _contains(DTOFIELD_DUTAG);
    }

    @JsonIgnore
    public void resetDUTag() {
        _reset(DTOFIELD_DUTAG);
    }

    @JsonIgnore
    public PSDevUserObjDTO dutag(String value) {
        setDUTag(value);
        return this;
    }

    @JsonProperty("dutag2")
    public void setDUTag2(String value) {
        _set(DTOFIELD_DUTAG2, value);
    }

    @JsonIgnore
    public String getDUTag2() {
        return (String) _get(DTOFIELD_DUTAG2);
    }

    @JsonIgnore
    public boolean isDUTag2Dirty() {
        return _contains(DTOFIELD_DUTAG2);
    }

    @JsonIgnore
    public void resetDUTag2() {
        _reset(DTOFIELD_DUTAG2);
    }

    @JsonIgnore
    public PSDevUserObjDTO dutag2(String value) {
        setDUTag2(value);
        return this;
    }

    @JsonProperty("dutag3")
    public void setDUTag3(String value) {
        _set(DTOFIELD_DUTAG3, value);
    }

    @JsonIgnore
    public String getDUTag3() {
        return (String) _get(DTOFIELD_DUTAG3);
    }

    @JsonIgnore
    public boolean isDUTag3Dirty() {
        return _contains(DTOFIELD_DUTAG3);
    }

    @JsonIgnore
    public void resetDUTag3() {
        _reset(DTOFIELD_DUTAG3);
    }

    @JsonIgnore
    public PSDevUserObjDTO dutag3(String value) {
        setDUTag3(value);
        return this;
    }

    @JsonProperty("dutag4")
    public void setDUTag4(String value) {
        _set(DTOFIELD_DUTAG4, value);
    }

    @JsonIgnore
    public String getDUTag4() {
        return (String) _get(DTOFIELD_DUTAG4);
    }

    @JsonIgnore
    public boolean isDUTag4Dirty() {
        return _contains(DTOFIELD_DUTAG4);
    }

    @JsonIgnore
    public void resetDUTag4() {
        _reset(DTOFIELD_DUTAG4);
    }

    @JsonIgnore
    public PSDevUserObjDTO dutag4(String value) {
        setDUTag4(value);
        return this;
    }

    @JsonProperty("enable")
    public void setEnable(Integer value) {
        _set(DTOFIELD_ENABLE, value);
    }

    @JsonIgnore
    public Integer getEnable() {
        return (Integer) _get(DTOFIELD_ENABLE);
    }

    @JsonIgnore
    public boolean isEnableDirty() {
        return _contains(DTOFIELD_ENABLE);
    }

    @JsonIgnore
    public void resetEnable() {
        _reset(DTOFIELD_ENABLE);
    }

    @JsonIgnore
    public PSDevUserObjDTO enable(Integer value) {
        setEnable(value);
        return this;
    }

    @JsonProperty("memo")
    public void setMemo(String value) {
        _set(DTOFIELD_MEMO, value);
    }

    @JsonIgnore
    public String getMemo() {
        return (String) _get(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public boolean isMemoDirty() {
        return _contains(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public void resetMemo() {
        _reset(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public PSDevUserObjDTO memo(String value) {
        setMemo(value);
        return this;
    }

    @JsonProperty("psdevcenterid")
    public void setPSDevCenterId(String value) {
        _set(DTOFIELD_PSDEVCENTERID, value);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        return (String) _get(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return _contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        _reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevcenterid(String value) {
        setPSDevCenterId(value);
        return this;
    }

    @JsonProperty("psdevcentername")
    public void setPSDevCenterName(String value) {
        _set(DTOFIELD_PSDEVCENTERNAME, value);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        return (String) _get(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return _contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        _reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevcentername(String value) {
        setPSDevCenterName(value);
        return this;
    }

    @JsonProperty("psdevuserobjectid")
    public void setPSDevUserObjectId(String value) {
        _set(DTOFIELD_PSDEVUSEROBJECTID, value);
        _set(FIELD_PSDEVUSEROBJECTID, value);
    }

    @JsonIgnore
    public String getPSDevUserObjectId() {
        Object value = _get(DTOFIELD_PSDEVUSEROBJECTID);
        return value == null ? (String) _get(FIELD_PSDEVUSEROBJECTID) : (String) value;
    }

    @JsonIgnore
    public boolean isPSDevUserObjectIdDirty() {
        return _contains(DTOFIELD_PSDEVUSEROBJECTID) || _contains(FIELD_PSDEVUSEROBJECTID);
    }

    @JsonIgnore
    public void resetPSDevUserObjectId() {
        _reset(DTOFIELD_PSDEVUSEROBJECTID);
        _reset(FIELD_PSDEVUSEROBJECTID);
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevuserobjectid(String value) {
        setPSDevUserObjectId(value);
        return this;
    }

    @JsonProperty("psdevuserobjname")
    public void setPSDevUserObjName(String value) {
        _set(DTOFIELD_PSDEVUSEROBJNAME, value);
    }

    @JsonIgnore
    public String getPSDevUserObjName() {
        return (String) _get(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public boolean isPSDevUserObjNameDirty() {
        return _contains(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public void resetPSDevUserObjName() {
        _reset(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevuserobjname(String value) {
        setPSDevUserObjName(value);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return getPSDevUserObjName();
    }

    @JsonIgnore
    public void setName(String value) {
        setPSDevUserObjName(value);
    }

    @JsonIgnore
    public PSDevUserObjDTO name(String value) {
        setPSDevUserObjName(value);
        return this;
    }

    @JsonProperty("psdevuserobjtype")
    public void setPSDevUserObjType(String value) {
        _set(DTOFIELD_PSDEVUSEROBJTYPE, value);
    }

    @JsonIgnore
    public String getPSDevUserObjType() {
        return (String) _get(DTOFIELD_PSDEVUSEROBJTYPE);
    }

    @JsonIgnore
    public boolean isPSDevUserObjTypeDirty() {
        return _contains(DTOFIELD_PSDEVUSEROBJTYPE);
    }

    @JsonIgnore
    public void resetPSDevUserObjType() {
        _reset(DTOFIELD_PSDEVUSEROBJTYPE);
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevuserobjtype(String value) {
        setPSDevUserObjType(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserObjDTO psdevuserobjtype(PSModelEnums.DevUserObjectType value) {
        setPSDevUserObjType(value == null ? null : value.value);
        return this;
    }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) {
        _set(DTOFIELD_UPDATEDATE, value);
    }

    @JsonIgnore
    public Timestamp getUpdateDate() {
        return (Timestamp) _get(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public boolean isUpdateDateDirty() {
        return _contains(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public void resetUpdateDate() {
        _reset(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public PSDevUserObjDTO updatedate(Timestamp value) {
        setUpdateDate(value);
        return this;
    }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) {
        _set(DTOFIELD_UPDATEMAN, value);
    }

    @JsonIgnore
    public String getUpdateMan() {
        return (String) _get(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public boolean isUpdateManDirty() {
        return _contains(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public void resetUpdateMan() {
        _reset(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public PSDevUserObjDTO updateman(String value) {
        setUpdateMan(value);
        return this;
    }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) {
        _set(DTOFIELD_VALIDFLAG, value);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        return (Integer) _get(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public boolean isValidFlagDirty() {
        return _contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetValidFlag() {
        _reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSDevUserObjDTO validflag(Integer value) {
        setValidFlag(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserObjDTO validflag(Boolean value) {
        setValidFlag(flagValue(value));
        return this;
    }

    @JsonIgnore
    public String getId() {
        return getPSDevUserObjectId();
    }

    @JsonIgnore
    public void setId(String value) {
        setPSDevUserObjectId(value);
    }

    @JsonIgnore
    public PSDevUserObjDTO id(String value) {
        setPSDevUserObjectId(value);
        return this;
    }
}