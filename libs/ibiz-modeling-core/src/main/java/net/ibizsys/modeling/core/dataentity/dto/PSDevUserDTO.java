package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Development-center user DTO.
 */
public class PSDevUserDTO extends PSDevUserObjDTO {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_ADMINMODE = "ADMINMODE";
    protected static final String DTOFIELD_ADMINMODE = "adminmode";
    public static final String FIELD_AIAGENTMODE = "AIAGENTMODE";
    protected static final String DTOFIELD_AIAGENTMODE = "aiagentmode";
    public static final String FIELD_ALIASPSDEVUSERID = "ALIASPSDEVUSERID";
    protected static final String DTOFIELD_ALIASPSDEVUSERID = "aliaspsdevuserid";
    public static final String FIELD_ALIASPSDEVUSERNAME = "ALIASPSDEVUSERNAME";
    protected static final String DTOFIELD_ALIASPSDEVUSERNAME = "aliaspsdevusername";
    public static final String FIELD_ALIASUSERMODE = "ALIASUSERMODE";
    protected static final String DTOFIELD_ALIASUSERMODE = "aliasusermode";
    public static final String FIELD_FROMLOGINNAME = "FROMLOGINNAME";
    protected static final String DTOFIELD_FROMLOGINNAME = "fromloginname";
    public static final String FIELD_FROMPSDCID = "FROMPSDCID";
    protected static final String DTOFIELD_FROMPSDCID = "frompsdcid";
    public static final String FIELD_FROMPSDCNAME = "FROMPSDCNAME";
    protected static final String DTOFIELD_FROMPSDCNAME = "frompsdcname";
    public static final String FIELD_FROMPSDEVUSERID = "FROMPSDEVUSERID";
    protected static final String DTOFIELD_FROMPSDEVUSERID = "frompsdevuserid";
    public static final String FIELD_FROMPSDEVUSERNAME = "FROMPSDEVUSERNAME";
    protected static final String DTOFIELD_FROMPSDEVUSERNAME = "frompsdevusername";
    public static final String FIELD_FROMUSERMODE = "FROMUSERMODE";
    protected static final String DTOFIELD_FROMUSERMODE = "fromusermode";
    public static final String FIELD_FULLLOGINNAME = "FULLLOGINNAME";
    protected static final String DTOFIELD_FULLLOGINNAME = "fullloginname";
    public static final String FIELD_FULLLOGINNAME2 = "FULLLOGINNAME2";
    protected static final String DTOFIELD_FULLLOGINNAME2 = "fullloginname2";
    public static final String FIELD_LOGINNAME = "LOGINNAME";
    protected static final String DTOFIELD_LOGINNAME = "loginname";
    public static final String FIELD_LOGINPWD = "LOGINPWD";
    protected static final String DTOFIELD_LOGINPWD = "loginpwd";
    public static final String FIELD_PSDEVUSERID = "PSDEVUSERID";
    protected static final String DTOFIELD_PSDEVUSERID = "psdevuserid";
    public static final String FIELD_PSDEVUSERNAME = "PSDEVUSERNAME";
    protected static final String DTOFIELD_PSDEVUSERNAME = "psdevusername";
    public static final String FIELD_USERMODE = "USERMODE";
    protected static final String DTOFIELD_USERMODE = "usermode";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    public PSDevUserDTO() {
        setPSDevUserObjType("USER");
    }

    @JsonProperty("adminmode")
    public void setAdminMode(Integer value) {
        _set(DTOFIELD_ADMINMODE, value);
    }

    @JsonIgnore
    public Integer getAdminMode() {
        return (Integer) _get(DTOFIELD_ADMINMODE);
    }

    @JsonIgnore
    public boolean isAdminModeDirty() {
        return _contains(DTOFIELD_ADMINMODE);
    }

    @JsonIgnore
    public void resetAdminMode() {
        _reset(DTOFIELD_ADMINMODE);
    }

    @JsonIgnore
    public PSDevUserDTO adminmode(Integer value) {
        setAdminMode(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserDTO adminmode(Boolean value) {
        setAdminMode(flagValue(value));
        return this;
    }

    @JsonProperty("aiagentmode")
    public void setAIAgentMode(String value) {
        _set(DTOFIELD_AIAGENTMODE, value);
    }

    @JsonIgnore
    public String getAIAgentMode() {
        return (String) _get(DTOFIELD_AIAGENTMODE);
    }

    @JsonIgnore
    public boolean isAIAgentModeDirty() {
        return _contains(DTOFIELD_AIAGENTMODE);
    }

    @JsonIgnore
    public void resetAIAgentMode() {
        _reset(DTOFIELD_AIAGENTMODE);
    }

    @JsonIgnore
    public PSDevUserDTO aiagentmode(String value) {
        setAIAgentMode(value);
        return this;
    }

    @JsonProperty("aliaspsdevuserid")
    public void setAliasPSDevUserId(String value) {
        _set(DTOFIELD_ALIASPSDEVUSERID, value);
    }

    @JsonIgnore
    public String getAliasPSDevUserId() {
        return (String) _get(DTOFIELD_ALIASPSDEVUSERID);
    }

    @JsonIgnore
    public boolean isAliasPSDevUserIdDirty() {
        return _contains(DTOFIELD_ALIASPSDEVUSERID);
    }

    @JsonIgnore
    public void resetAliasPSDevUserId() {
        _reset(DTOFIELD_ALIASPSDEVUSERID);
    }

    @JsonIgnore
    public PSDevUserDTO aliaspsdevuserid(String value) {
        setAliasPSDevUserId(value);
        return this;
    }

    @JsonProperty("aliaspsdevusername")
    public void setAliasPSDevUserName(String value) {
        _set(DTOFIELD_ALIASPSDEVUSERNAME, value);
    }

    @JsonIgnore
    public String getAliasPSDevUserName() {
        return (String) _get(DTOFIELD_ALIASPSDEVUSERNAME);
    }

    @JsonIgnore
    public boolean isAliasPSDevUserNameDirty() {
        return _contains(DTOFIELD_ALIASPSDEVUSERNAME);
    }

    @JsonIgnore
    public void resetAliasPSDevUserName() {
        _reset(DTOFIELD_ALIASPSDEVUSERNAME);
    }

    @JsonIgnore
    public PSDevUserDTO aliaspsdevusername(String value) {
        setAliasPSDevUserName(value);
        return this;
    }

    @JsonProperty("aliasusermode")
    public void setAliasUserMode(Integer value) {
        _set(DTOFIELD_ALIASUSERMODE, value);
    }

    @JsonIgnore
    public Integer getAliasUserMode() {
        return (Integer) _get(DTOFIELD_ALIASUSERMODE);
    }

    @JsonIgnore
    public boolean isAliasUserModeDirty() {
        return _contains(DTOFIELD_ALIASUSERMODE);
    }

    @JsonIgnore
    public void resetAliasUserMode() {
        _reset(DTOFIELD_ALIASUSERMODE);
    }

    @JsonIgnore
    public PSDevUserDTO aliasusermode(Integer value) {
        setAliasUserMode(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserDTO aliasusermode(Boolean value) {
        setAliasUserMode(flagValue(value));
        return this;
    }

    @Override
    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) {
        super.setCreateDate(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO createdate(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    @Override
    @JsonProperty("createman")
    public void setCreateMan(String value) {
        super.setCreateMan(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO createman(String value) {
        setCreateMan(value);
        return this;
    }

    @Override
    @JsonProperty("enable")
    public void setEnable(Integer value) {
        super.setEnable(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO enable(Integer value) {
        setEnable(value);
        return this;
    }

    @JsonProperty("fromloginname")
    public void setFromLoginName(String value) {
        _set(DTOFIELD_FROMLOGINNAME, value);
    }

    @JsonIgnore
    public String getFromLoginName() {
        return (String) _get(DTOFIELD_FROMLOGINNAME);
    }

    @JsonIgnore
    public boolean isFromLoginNameDirty() {
        return _contains(DTOFIELD_FROMLOGINNAME);
    }

    @JsonIgnore
    public void resetFromLoginName() {
        _reset(DTOFIELD_FROMLOGINNAME);
    }

    @JsonIgnore
    public PSDevUserDTO fromloginname(String value) {
        setFromLoginName(value);
        return this;
    }

    @JsonProperty("frompsdcid")
    public void setFromPSDCId(String value) {
        _set(DTOFIELD_FROMPSDCID, value);
    }

    @JsonIgnore
    public String getFromPSDCId() {
        return (String) _get(DTOFIELD_FROMPSDCID);
    }

    @JsonIgnore
    public boolean isFromPSDCIdDirty() {
        return _contains(DTOFIELD_FROMPSDCID);
    }

    @JsonIgnore
    public void resetFromPSDCId() {
        _reset(DTOFIELD_FROMPSDCID);
    }

    @JsonIgnore
    public PSDevUserDTO frompsdcid(String value) {
        setFromPSDCId(value);
        return this;
    }

    @JsonProperty("frompsdcname")
    public void setFromPSDCName(String value) {
        _set(DTOFIELD_FROMPSDCNAME, value);
    }

    @JsonIgnore
    public String getFromPSDCName() {
        return (String) _get(DTOFIELD_FROMPSDCNAME);
    }

    @JsonIgnore
    public boolean isFromPSDCNameDirty() {
        return _contains(DTOFIELD_FROMPSDCNAME);
    }

    @JsonIgnore
    public void resetFromPSDCName() {
        _reset(DTOFIELD_FROMPSDCNAME);
    }

    @JsonIgnore
    public PSDevUserDTO frompsdcname(String value) {
        setFromPSDCName(value);
        return this;
    }

    @JsonProperty("frompsdevuserid")
    public void setFromPSDevUserId(String value) {
        _set(DTOFIELD_FROMPSDEVUSERID, value);
    }

    @JsonIgnore
    public String getFromPSDevUserId() {
        return (String) _get(DTOFIELD_FROMPSDEVUSERID);
    }

    @JsonIgnore
    public boolean isFromPSDevUserIdDirty() {
        return _contains(DTOFIELD_FROMPSDEVUSERID);
    }

    @JsonIgnore
    public void resetFromPSDevUserId() {
        _reset(DTOFIELD_FROMPSDEVUSERID);
    }

    @JsonIgnore
    public PSDevUserDTO frompsdevuserid(String value) {
        setFromPSDevUserId(value);
        return this;
    }

    @JsonProperty("frompsdevusername")
    public void setFromPSDevUserName(String value) {
        _set(DTOFIELD_FROMPSDEVUSERNAME, value);
    }

    @JsonIgnore
    public String getFromPSDevUserName() {
        return (String) _get(DTOFIELD_FROMPSDEVUSERNAME);
    }

    @JsonIgnore
    public boolean isFromPSDevUserNameDirty() {
        return _contains(DTOFIELD_FROMPSDEVUSERNAME);
    }

    @JsonIgnore
    public void resetFromPSDevUserName() {
        _reset(DTOFIELD_FROMPSDEVUSERNAME);
    }

    @JsonIgnore
    public PSDevUserDTO frompsdevusername(String value) {
        setFromPSDevUserName(value);
        return this;
    }

    @JsonProperty("fromusermode")
    public void setFromUserMode(Integer value) {
        _set(DTOFIELD_FROMUSERMODE, value);
    }

    @JsonIgnore
    public Integer getFromUserMode() {
        return (Integer) _get(DTOFIELD_FROMUSERMODE);
    }

    @JsonIgnore
    public boolean isFromUserModeDirty() {
        return _contains(DTOFIELD_FROMUSERMODE);
    }

    @JsonIgnore
    public void resetFromUserMode() {
        _reset(DTOFIELD_FROMUSERMODE);
    }

    @JsonIgnore
    public PSDevUserDTO fromusermode(Integer value) {
        setFromUserMode(value);
        return this;
    }

    @JsonIgnore
    public PSDevUserDTO fromusermode(Boolean value) {
        setFromUserMode(flagValue(value));
        return this;
    }

    @JsonProperty("fullloginname")
    public void setFullLoginName(String value) {
        _set(DTOFIELD_FULLLOGINNAME, value);
    }

    @JsonIgnore
    public String getFullLoginName() {
        return (String) _get(DTOFIELD_FULLLOGINNAME);
    }

    @JsonIgnore
    public boolean isFullLoginNameDirty() {
        return _contains(DTOFIELD_FULLLOGINNAME);
    }

    @JsonIgnore
    public void resetFullLoginName() {
        _reset(DTOFIELD_FULLLOGINNAME);
    }

    @JsonIgnore
    public PSDevUserDTO fullloginname(String value) {
        setFullLoginName(value);
        return this;
    }

    @JsonProperty("fullloginname2")
    public void setFullLoginName2(String value) {
        _set(DTOFIELD_FULLLOGINNAME2, value);
    }

    @JsonIgnore
    public String getFullLoginName2() {
        return (String) _get(DTOFIELD_FULLLOGINNAME2);
    }

    @JsonIgnore
    public boolean isFullLoginName2Dirty() {
        return _contains(DTOFIELD_FULLLOGINNAME2);
    }

    @JsonIgnore
    public void resetFullLoginName2() {
        _reset(DTOFIELD_FULLLOGINNAME2);
    }

    @JsonIgnore
    public PSDevUserDTO fullloginname2(String value) {
        setFullLoginName2(value);
        return this;
    }

    @JsonProperty("loginname")
    public void setLoginName(String value) {
        _set(DTOFIELD_LOGINNAME, value);
    }

    @JsonIgnore
    public String getLoginName() {
        return (String) _get(DTOFIELD_LOGINNAME);
    }

    @JsonIgnore
    public boolean isLoginNameDirty() {
        return _contains(DTOFIELD_LOGINNAME);
    }

    @JsonIgnore
    public void resetLoginName() {
        _reset(DTOFIELD_LOGINNAME);
    }

    @JsonIgnore
    public PSDevUserDTO loginname(String value) {
        setLoginName(value);
        return this;
    }

    @JsonProperty("loginpwd")
    public void setLoginPwd(String value) {
        _set(DTOFIELD_LOGINPWD, value);
    }

    @JsonIgnore
    public String getLoginPwd() {
        return (String) _get(DTOFIELD_LOGINPWD);
    }

    @JsonIgnore
    public boolean isLoginPwdDirty() {
        return _contains(DTOFIELD_LOGINPWD);
    }

    @JsonIgnore
    public void resetLoginPwd() {
        _reset(DTOFIELD_LOGINPWD);
    }

    @JsonIgnore
    public PSDevUserDTO loginpwd(String value) {
        setLoginPwd(value);
        return this;
    }

    @JsonProperty("psdevuserid")
    public void setPSDevUserId(String value) {
        _set(DTOFIELD_PSDEVUSERID, value);
        _set(DTOFIELD_PSDEVUSEROBJECTID, value);
    }

    @JsonIgnore
    public String getPSDevUserId() {
        Object value = _get(DTOFIELD_PSDEVUSERID);
        return value == null ? (String) _get(DTOFIELD_PSDEVUSEROBJECTID) : (String) value;
    }

    @JsonIgnore
    public boolean isPSDevUserIdDirty() {
        return _contains(DTOFIELD_PSDEVUSERID) || _contains(DTOFIELD_PSDEVUSEROBJECTID);
    }

    @JsonIgnore
    public void resetPSDevUserId() {
        _reset(DTOFIELD_PSDEVUSERID);
        _reset(DTOFIELD_PSDEVUSEROBJECTID);
    }

    @JsonIgnore
    public PSDevUserDTO psdevuserid(String value) {
        setPSDevUserId(value);
        return this;
    }

    @JsonProperty("psdevusername")
    public void setPSDevUserName(String value) {
        _set(DTOFIELD_PSDEVUSERNAME, value);
        _set(DTOFIELD_PSDEVUSEROBJNAME, value);
    }

    @JsonIgnore
    public String getPSDevUserName() {
        return (String) _get(DTOFIELD_PSDEVUSERNAME);
    }

    @JsonIgnore
    public boolean isPSDevUserNameDirty() {
        return _contains(DTOFIELD_PSDEVUSERNAME);
    }

    @JsonIgnore
    public void resetPSDevUserName() {
        _reset(DTOFIELD_PSDEVUSERNAME);
        _reset(DTOFIELD_PSDEVUSEROBJNAME);
    }

    @JsonIgnore
    public PSDevUserDTO psdevusername(String value) {
        setPSDevUserName(value);
        return this;
    }

    @Override
    @JsonIgnore
    public String getName() {
        return getPSDevUserName();
    }

    @Override
    @JsonIgnore
    public void setName(String value) {
        setPSDevUserName(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO name(String value) {
        setPSDevUserName(value);
        return this;
    }

    @Override
    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) {
        super.setUpdateDate(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO updatedate(Timestamp value) {
        setUpdateDate(value);
        return this;
    }

    @Override
    @JsonProperty("updateman")
    public void setUpdateMan(String value) {
        super.setUpdateMan(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO updateman(String value) {
        setUpdateMan(value);
        return this;
    }

    @JsonProperty("usermode")
    public void setUserMode(String value) {
        _set(DTOFIELD_USERMODE, value);
    }

    @JsonIgnore
    public String getUserMode() {
        return (String) _get(DTOFIELD_USERMODE);
    }

    @JsonIgnore
    public boolean isUserModeDirty() {
        return _contains(DTOFIELD_USERMODE);
    }

    @JsonIgnore
    public void resetUserMode() {
        _reset(DTOFIELD_USERMODE);
    }

    @JsonIgnore
    public PSDevUserDTO usermode(String value) {
        setUserMode(value);
        return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) {
        _set(DTOFIELD_USERTAG, value);
    }

    @JsonIgnore
    public String getUserTag() {
        return (String) _get(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return _contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        _reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSDevUserDTO usertag(String value) {
        setUserTag(value);
        return this;
    }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) {
        _set(DTOFIELD_USERTAG2, value);
    }

    @JsonIgnore
    public String getUserTag2() {
        return (String) _get(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return _contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        _reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSDevUserDTO usertag2(String value) {
        setUserTag2(value);
        return this;
    }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) {
        _set(DTOFIELD_USERTAG3, value);
    }

    @JsonIgnore
    public String getUserTag3() {
        return (String) _get(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return _contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        _reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSDevUserDTO usertag3(String value) {
        setUserTag3(value);
        return this;
    }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) {
        _set(DTOFIELD_USERTAG4, value);
    }

    @JsonIgnore
    public String getUserTag4() {
        return (String) _get(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return _contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        _reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSDevUserDTO usertag4(String value) {
        setUserTag4(value);
        return this;
    }

    @Override
    @JsonIgnore
    public String getId() {
        return getPSDevUserId();
    }

    @Override
    @JsonIgnore
    public void setId(String value) {
        setPSDevUserId(value);
    }

    @Override
    @JsonIgnore
    public PSDevUserDTO id(String value) {
        setPSDevUserId(value);
        return this;
    }
}