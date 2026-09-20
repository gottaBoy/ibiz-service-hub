package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Git user DTO.
 */
public class PSGitUserDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_ALLDCFLAG = "ALLDCFLAG";
    protected static final String DTOFIELD_ALLDCFLAG = "alldcflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREDENTIALSYNCMODE = "CREDENTIALSYNCMODE";
    protected static final String DTOFIELD_CREDENTIALSYNCMODE = "credentialsyncmode";
    public static final String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    protected static final String DTOFIELD_DEFAULTFLAG = "defaultflag";
    public static final String FIELD_EMAIL = "EMAIL";
    protected static final String DTOFIELD_EMAIL = "email";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSGITUSERID = "PSGITUSERID";
    protected static final String DTOFIELD_PSGITUSERID = "psgituserid";
    public static final String FIELD_PSGITUSERNAME = "PSGITUSERNAME";
    protected static final String DTOFIELD_PSGITUSERNAME = "psgitusername";
    public static final String FIELD_PSSVNSERVERID = "PSSVNSERVERID";
    protected static final String DTOFIELD_PSSVNSERVERID = "pssvnserverid";
    public static final String FIELD_PSSVNSERVERNAME = "PSSVNSERVERNAME";
    protected static final String DTOFIELD_PSSVNSERVERNAME = "pssvnservername";
    public static final String FIELD_PSSVRDOMAINID = "PSSVRDOMAINID";
    protected static final String DTOFIELD_PSSVRDOMAINID = "pssvrdomainid";
    public static final String FIELD_PSSVRDOMAINNAME = "PSSVRDOMAINNAME";
    protected static final String DTOFIELD_PSSVRDOMAINNAME = "pssvrdomainname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty("alldcflag")
    public void setAllDCFlag(Integer value) { _set(DTOFIELD_ALLDCFLAG, value); }
    @JsonIgnore public Integer getAllDCFlag() { return (Integer) _get(DTOFIELD_ALLDCFLAG); }
    @JsonIgnore public boolean isAllDCFlagDirty() { return _contains(DTOFIELD_ALLDCFLAG); }
    @JsonIgnore public void resetAllDCFlag() { _reset(DTOFIELD_ALLDCFLAG); }
    @JsonIgnore public PSGitUserDTO alldcflag(Integer value) { setAllDCFlag(value); return this; }
    @JsonIgnore public PSGitUserDTO alldcflag(Boolean value) { setAllDCFlag(flagValue(value)); return this; }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSGitUserDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSGitUserDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("credentialsyncmode")
    public void setCredentialSyncMode(Integer value) { _set(DTOFIELD_CREDENTIALSYNCMODE, value); }
    @JsonIgnore public Integer getCredentialSyncMode() { return (Integer) _get(DTOFIELD_CREDENTIALSYNCMODE); }
    @JsonIgnore public boolean isCredentialSyncModeDirty() { return _contains(DTOFIELD_CREDENTIALSYNCMODE); }
    @JsonIgnore public void resetCredentialSyncMode() { _reset(DTOFIELD_CREDENTIALSYNCMODE); }
    @JsonIgnore public PSGitUserDTO credentialsyncmode(Integer value) { setCredentialSyncMode(value); return this; }

    @JsonProperty("defaultflag")
    public void setDefaultFlag(Integer value) { _set(DTOFIELD_DEFAULTFLAG, value); }
    @JsonIgnore public Integer getDefaultFlag() { return (Integer) _get(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public boolean isDefaultFlagDirty() { return _contains(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public void resetDefaultFlag() { _reset(DTOFIELD_DEFAULTFLAG); }
    @JsonIgnore public PSGitUserDTO defaultflag(Integer value) { setDefaultFlag(value); return this; }
    @JsonIgnore public PSGitUserDTO defaultflag(Boolean value) { setDefaultFlag(flagValue(value)); return this; }

    @JsonProperty("email")
    public void setEmail(String value) { _set(DTOFIELD_EMAIL, value); }
    @JsonIgnore public String getEmail() { return (String) _get(DTOFIELD_EMAIL); }
    @JsonIgnore public boolean isEmailDirty() { return _contains(DTOFIELD_EMAIL); }
    @JsonIgnore public void resetEmail() { _reset(DTOFIELD_EMAIL); }
    @JsonIgnore public PSGitUserDTO email(String value) { setEmail(value); return this; }

    @JsonProperty("gitpath")
    public void setGitPath(String value) { _set(DTOFIELD_GITPATH, value); }
    @JsonIgnore public String getGitPath() { return (String) _get(DTOFIELD_GITPATH); }
    @JsonIgnore public boolean isGitPathDirty() { return _contains(DTOFIELD_GITPATH); }
    @JsonIgnore public void resetGitPath() { _reset(DTOFIELD_GITPATH); }
    @JsonIgnore public PSGitUserDTO gitpath(String value) { setGitPath(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSGitUserDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("passwd")
    public void setPasswd(String value) { _set(DTOFIELD_PASSWD, value); }
    @JsonIgnore public String getPasswd() { return (String) _get(DTOFIELD_PASSWD); }
    @JsonIgnore public boolean isPasswdDirty() { return _contains(DTOFIELD_PASSWD); }
    @JsonIgnore public void resetPasswd() { _reset(DTOFIELD_PASSWD); }
    @JsonIgnore public PSGitUserDTO passwd(String value) { setPasswd(value); return this; }

    @JsonProperty("psdevcenterid")
    public void setPSDevCenterId(String value) { _set(DTOFIELD_PSDEVCENTERID, value); }
    @JsonIgnore public String getPSDevCenterId() { return (String) _get(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public boolean isPSDevCenterIdDirty() { return _contains(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public void resetPSDevCenterId() { _reset(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public PSGitUserDTO psdevcenterid(String value) { setPSDevCenterId(value); return this; }

    @JsonProperty("psdevcentername")
    public void setPSDevCenterName(String value) { _set(DTOFIELD_PSDEVCENTERNAME, value); }
    @JsonIgnore public String getPSDevCenterName() { return (String) _get(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public boolean isPSDevCenterNameDirty() { return _contains(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public void resetPSDevCenterName() { _reset(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public PSGitUserDTO psdevcentername(String value) { setPSDevCenterName(value); return this; }

    @JsonProperty("psgituserid")
    public void setPSGitUserId(String value) { _set(DTOFIELD_PSGITUSERID, value); }
    @JsonIgnore public String getPSGitUserId() { return (String) _get(DTOFIELD_PSGITUSERID); }
    @JsonIgnore public boolean isPSGitUserIdDirty() { return _contains(DTOFIELD_PSGITUSERID); }
    @JsonIgnore public void resetPSGitUserId() { _reset(DTOFIELD_PSGITUSERID); }
    @JsonIgnore public PSGitUserDTO psgituserid(String value) { setPSGitUserId(value); return this; }

    @JsonProperty("psgitusername")
    public void setPSGitUserName(String value) { _set(DTOFIELD_PSGITUSERNAME, value); }
    @JsonIgnore public String getPSGitUserName() { return (String) _get(DTOFIELD_PSGITUSERNAME); }
    @JsonIgnore public boolean isPSGitUserNameDirty() { return _contains(DTOFIELD_PSGITUSERNAME); }
    @JsonIgnore public void resetPSGitUserName() { _reset(DTOFIELD_PSGITUSERNAME); }
    @JsonIgnore public PSGitUserDTO psgitusername(String value) { setPSGitUserName(value); return this; }
    @JsonIgnore public String getName() { return getPSGitUserName(); }
    @JsonIgnore public void setName(String value) { setPSGitUserName(value); }
    @JsonIgnore public PSGitUserDTO name(String value) { setPSGitUserName(value); return this; }

    @JsonProperty("pssvnserverid")
    public void setPSSVNServerId(String value) { _set(DTOFIELD_PSSVNSERVERID, value); }
    @JsonIgnore public String getPSSVNServerId() { return (String) _get(DTOFIELD_PSSVNSERVERID); }
    @JsonIgnore public boolean isPSSVNServerIdDirty() { return _contains(DTOFIELD_PSSVNSERVERID); }
    @JsonIgnore public void resetPSSVNServerId() { _reset(DTOFIELD_PSSVNSERVERID); }
    @JsonIgnore public PSGitUserDTO pssvnserverid(String value) { setPSSVNServerId(value); return this; }

    @JsonProperty("pssvnservername")
    public void setPSSVNServerName(String value) { _set(DTOFIELD_PSSVNSERVERNAME, value); }
    @JsonIgnore public String getPSSVNServerName() { return (String) _get(DTOFIELD_PSSVNSERVERNAME); }
    @JsonIgnore public boolean isPSSVNServerNameDirty() { return _contains(DTOFIELD_PSSVNSERVERNAME); }
    @JsonIgnore public void resetPSSVNServerName() { _reset(DTOFIELD_PSSVNSERVERNAME); }
    @JsonIgnore public PSGitUserDTO pssvnservername(String value) { setPSSVNServerName(value); return this; }

    @JsonProperty("pssvrdomainid")
    public void setPSSvrDomainId(String value) { _set(DTOFIELD_PSSVRDOMAINID, value); }
    @JsonIgnore public String getPSSvrDomainId() { return (String) _get(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public boolean isPSSvrDomainIdDirty() { return _contains(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public void resetPSSvrDomainId() { _reset(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public PSGitUserDTO pssvrdomainid(String value) { setPSSvrDomainId(value); return this; }

    @JsonProperty("pssvrdomainname")
    public void setPSSvrDomainName(String value) { _set(DTOFIELD_PSSVRDOMAINNAME, value); }
    @JsonIgnore public String getPSSvrDomainName() { return (String) _get(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public boolean isPSSvrDomainNameDirty() { return _contains(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public void resetPSSvrDomainName() { _reset(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public PSGitUserDTO pssvrdomainname(String value) { setPSSvrDomainName(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSGitUserDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSGitUserDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("username")
    public void setUserName(String value) { _set(DTOFIELD_USERNAME, value); }
    @JsonIgnore public String getUserName() { return (String) _get(DTOFIELD_USERNAME); }
    @JsonIgnore public boolean isUserNameDirty() { return _contains(DTOFIELD_USERNAME); }
    @JsonIgnore public void resetUserName() { _reset(DTOFIELD_USERNAME); }
    @JsonIgnore public PSGitUserDTO username(String value) { setUserName(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSGitUserDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSGitUserDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonIgnore public String getId() { return getPSGitUserId(); }
    @JsonIgnore public void setId(String value) { setPSGitUserId(value); }
    @JsonIgnore public PSGitUserDTO id(String value) { setPSGitUserId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}