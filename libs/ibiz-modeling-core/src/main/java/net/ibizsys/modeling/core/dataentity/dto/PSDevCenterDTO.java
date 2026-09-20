package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Development center DTO.
 */
public class PSDevCenterDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DCAPIFLAG = "DCAPIFLAG";
    protected static final String DTOFIELD_DCAPIFLAG = "dcapiflag";
    public static final String FIELD_DCAPITOKEN = "DCAPITOKEN";
    protected static final String DTOFIELD_DCAPITOKEN = "dcapitoken";
    public static final String FIELD_DCLEVEL = "DCLEVEL";
    protected static final String DTOFIELD_DCLEVEL = "dclevel";
    public static final String FIELD_DCROWKEY = "DCROWKEY";
    protected static final String DTOFIELD_DCROWKEY = "dcrowkey";
    public static final String FIELD_DCTAG = "DCTAG";
    protected static final String DTOFIELD_DCTAG = "dctag";
    public static final String FIELD_DCTAG2 = "DCTAG2";
    protected static final String DTOFIELD_DCTAG2 = "dctag2";
    public static final String FIELD_DCTAG3 = "DCTAG3";
    protected static final String DTOFIELD_DCTAG3 = "dctag3";
    public static final String FIELD_DCTAG4 = "DCTAG4";
    protected static final String DTOFIELD_DCTAG4 = "dctag4";
    public static final String FIELD_DCTYPE = "DCTYPE";
    protected static final String DTOFIELD_DCTYPE = "dctype";
    public static final String FIELD_DOMAINNAME = "DOMAINNAME";
    protected static final String DTOFIELD_DOMAINNAME = "domainname";
    public static final String FIELD_ENABLEDEPLOYCENTER = "ENABLEDEPLOYCENTER";
    protected static final String DTOFIELD_ENABLEDEPLOYCENTER = "enabledeploycenter";
    public static final String FIELD_ENABLEWORKSPACE = "ENABLEWORKSPACE";
    protected static final String DTOFIELD_ENABLEWORKSPACE = "enableworkspace";
    public static final String FIELD_ENABLEWSSERVER = "ENABLEWSSERVER";
    protected static final String DTOFIELD_ENABLEWSSERVER = "enablewsserver";
    public static final String FIELD_ENTITYCNT = "ENTITYCNT";
    protected static final String DTOFIELD_ENTITYCNT = "entitycnt";
    public static final String FIELD_EXPERIENCE = "EXPERIENCE";
    protected static final String DTOFIELD_EXPERIENCE = "experience";
    public static final String FIELD_EXPIREDTIME = "EXPIREDTIME";
    protected static final String DTOFIELD_EXPIREDTIME = "expiredtime";
    public static final String FIELD_FULLDOMAINNAME = "FULLDOMAINNAME";
    protected static final String DTOFIELD_FULLDOMAINNAME = "fulldomainname";
    public static final String FIELD_IPADDRS = "IPADDRS";
    protected static final String DTOFIELD_IPADDRS = "ipaddrs";
    public static final String FIELD_LICINFO = "LICINFO";
    protected static final String DTOFIELD_LICINFO = "licinfo";
    public static final String FIELD_LICKEY = "LICKEY";
    protected static final String DTOFIELD_LICKEY = "lickey";
    public static final String FIELD_LINKIBIZ5FLAG = "LINKIBIZ5FLAG";
    protected static final String DTOFIELD_LINKIBIZ5FLAG = "linkibiz5flag";
    public static final String FIELD_MAXACTIVEUSERCNT = "MAXACTIVEUSERCNT";
    protected static final String DTOFIELD_MAXACTIVEUSERCNT = "maxactiveusercnt";
    public static final String FIELD_MAXENTITYCNT = "MAXENTITYCNT";
    protected static final String DTOFIELD_MAXENTITYCNT = "maxentitycnt";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOBCERTCHGTIME = "MOBCERTCHGTIME";
    protected static final String DTOFIELD_MOBCERTCHGTIME = "mobcertchgtime";
    public static final String FIELD_MOBTDCHGTIME = "MOBTDCHGTIME";
    protected static final String DTOFIELD_MOBTDCHGTIME = "mobtdchgtime";
    public static final String FIELD_PSDCINSTID = "PSDCINSTID";
    protected static final String DTOFIELD_PSDCINSTID = "psdcinstid";
    public static final String FIELD_PSDCINSTNAME = "PSDCINSTNAME";
    protected static final String DTOFIELD_PSDCINSTNAME = "psdcinstname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSPMSSERVERID = "PSPMSSERVERID";
    protected static final String DTOFIELD_PSPMSSERVERID = "pspmsserverid";
    public static final String FIELD_PSPMSSERVERNAME = "PSPMSSERVERNAME";
    protected static final String DTOFIELD_PSPMSSERVERNAME = "pspmsservername";
    public static final String FIELD_PSRTWXACCOUNTID = "PSRTWXACCOUNTID";
    protected static final String DTOFIELD_PSRTWXACCOUNTID = "psrtwxaccountid";
    public static final String FIELD_PSRTWXACCOUNTNAME = "PSRTWXACCOUNTNAME";
    protected static final String DTOFIELD_PSRTWXACCOUNTNAME = "psrtwxaccountname";
    public static final String FIELD_PSSTUDIOSERVERGRPID = "PSSTUDIOSERVERGRPID";
    protected static final String DTOFIELD_PSSTUDIOSERVERGRPID = "psstudioservergrpid";
    public static final String FIELD_PSSTUDIOSERVERGRPNAME = "PSSTUDIOSERVERGRPNAME";
    protected static final String DTOFIELD_PSSTUDIOSERVERGRPNAME = "psstudioservergrpname";
    public static final String FIELD_PSSVNINSTREPOID = "PSSVNINSTREPOID";
    protected static final String DTOFIELD_PSSVNINSTREPOID = "pssvninstrepoid";
    public static final String FIELD_PSSVNINSTREPONAME = "PSSVNINSTREPONAME";
    protected static final String DTOFIELD_PSSVNINSTREPONAME = "pssvninstreponame";
    public static final String FIELD_PSSVRDOMAINID = "PSSVRDOMAINID";
    protected static final String DTOFIELD_PSSVRDOMAINID = "pssvrdomainid";
    public static final String FIELD_PSSVRDOMAINNAME = "PSSVRDOMAINNAME";
    protected static final String DTOFIELD_PSSVRDOMAINNAME = "pssvrdomainname";
    public static final String FIELD_PSSVRPROVIDERID = "PSSVRPROVIDERID";
    protected static final String DTOFIELD_PSSVRPROVIDERID = "pssvrproviderid";
    public static final String FIELD_PSSVRPROVIDERNAME = "PSSVRPROVIDERNAME";
    protected static final String DTOFIELD_PSSVRPROVIDERNAME = "pssvrprovidername";
    public static final String FIELD_ROBOTCHGTIME = "ROBOTCHGTIME";
    protected static final String DTOFIELD_ROBOTCHGTIME = "robotchgtime";
    public static final String FIELD_ROPSSVNINSTREPOID = "ROPSSVNINSTREPOID";
    protected static final String DTOFIELD_ROPSSVNINSTREPOID = "ropssvninstrepoid";
    public static final String FIELD_ROPSSVNINSTREPONAME = "ROPSSVNINSTREPONAME";
    protected static final String DTOFIELD_ROPSSVNINSTREPONAME = "ropssvninstreponame";
    public static final String FIELD_SPFLAG = "SPFLAG";
    protected static final String DTOFIELD_SPFLAG = "spflag";
    public static final String FIELD_STUDIOTAG = "STUDIOTAG";
    protected static final String DTOFIELD_STUDIOTAG = "studiotag";
    public static final String FIELD_STUDIOTAG2 = "STUDIOTAG2";
    protected static final String DTOFIELD_STUDIOTAG2 = "studiotag2";
    public static final String FIELD_SYSAPIFLAG = "SYSAPIFLAG";
    protected static final String DTOFIELD_SYSAPIFLAG = "sysapiflag";
    public static final String FIELD_SYSSN = "SYSSN";
    protected static final String DTOFIELD_SYSSN = "syssn";
    public static final String FIELD_TOTALENERGY = "TOTALENERGY";
    protected static final String DTOFIELD_TOTALENERGY = "totalenergy";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_V6PSSVNINSTREPOID = "V6PSSVNINSTREPOID";
    protected static final String DTOFIELD_V6PSSVNINSTREPOID = "v6pssvninstrepoid";
    public static final String FIELD_V6PSSVNINSTREPONAME = "V6PSSVNINSTREPONAME";
    protected static final String DTOFIELD_V6PSSVNINSTREPONAME = "v6pssvninstreponame";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_WEBFOLDER = "WEBFOLDER";
    protected static final String DTOFIELD_WEBFOLDER = "webfolder";
    public static final String FIELD_WEBSITEURL = "WEBSITEURL";
    protected static final String DTOFIELD_WEBSITEURL = "websiteurl";
    public static final String FIELD_WXDEPTID = "WXDEPTID";
    protected static final String DTOFIELD_WXDEPTID = "wxdeptid";

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSDevCenterDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSDevCenterDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("dcapiflag")
    public void setDCAPIFlag(Integer value) { _set(DTOFIELD_DCAPIFLAG, value); }
    @JsonIgnore public Integer getDCAPIFlag() { return (Integer) _get(DTOFIELD_DCAPIFLAG); }
    @JsonIgnore public boolean isDCAPIFlagDirty() { return _contains(DTOFIELD_DCAPIFLAG); }
    @JsonIgnore public void resetDCAPIFlag() { _reset(DTOFIELD_DCAPIFLAG); }
    @JsonIgnore public PSDevCenterDTO dcapiflag(Integer value) { setDCAPIFlag(value); return this; }
    @JsonIgnore public PSDevCenterDTO dcapiflag(Boolean value) { setDCAPIFlag(flagValue(value)); return this; }

    @JsonProperty("dcapitoken")
    public void setDCAPIToken(String value) { _set(DTOFIELD_DCAPITOKEN, value); }
    @JsonIgnore public String getDCAPIToken() { return (String) _get(DTOFIELD_DCAPITOKEN); }
    @JsonIgnore public boolean isDCAPITokenDirty() { return _contains(DTOFIELD_DCAPITOKEN); }
    @JsonIgnore public void resetDCAPIToken() { _reset(DTOFIELD_DCAPITOKEN); }
    @JsonIgnore public PSDevCenterDTO dcapitoken(String value) { setDCAPIToken(value); return this; }

    @JsonProperty("dclevel")
    public void setDCLevel(Integer value) { _set(DTOFIELD_DCLEVEL, value); }
    @JsonIgnore public Integer getDCLevel() { return (Integer) _get(DTOFIELD_DCLEVEL); }
    @JsonIgnore public boolean isDCLevelDirty() { return _contains(DTOFIELD_DCLEVEL); }
    @JsonIgnore public void resetDCLevel() { _reset(DTOFIELD_DCLEVEL); }
    @JsonIgnore public PSDevCenterDTO dclevel(Integer value) { setDCLevel(value); return this; }
    @JsonIgnore public PSDevCenterDTO dclevel(PSModelEnums.DevCenterLevel value) {
        setDCLevel(value == null ? null : value.value); return this;
    }

    @JsonProperty("dcrowkey")
    public void setDCRowKey(String value) { _set(DTOFIELD_DCROWKEY, value); }
    @JsonIgnore public String getDCRowKey() { return (String) _get(DTOFIELD_DCROWKEY); }
    @JsonIgnore public boolean isDCRowKeyDirty() { return _contains(DTOFIELD_DCROWKEY); }
    @JsonIgnore public void resetDCRowKey() { _reset(DTOFIELD_DCROWKEY); }
    @JsonIgnore public PSDevCenterDTO dcrowkey(String value) { setDCRowKey(value); return this; }

    @JsonProperty("dctag")
    public void setDCTag(String value) { _set(DTOFIELD_DCTAG, value); }
    @JsonIgnore public String getDCTag() { return (String) _get(DTOFIELD_DCTAG); }
    @JsonIgnore public boolean isDCTagDirty() { return _contains(DTOFIELD_DCTAG); }
    @JsonIgnore public void resetDCTag() { _reset(DTOFIELD_DCTAG); }
    @JsonIgnore public PSDevCenterDTO dctag(String value) { setDCTag(value); return this; }

    @JsonProperty("dctag2")
    public void setDCTag2(String value) { _set(DTOFIELD_DCTAG2, value); }
    @JsonIgnore public String getDCTag2() { return (String) _get(DTOFIELD_DCTAG2); }
    @JsonIgnore public boolean isDCTag2Dirty() { return _contains(DTOFIELD_DCTAG2); }
    @JsonIgnore public void resetDCTag2() { _reset(DTOFIELD_DCTAG2); }
    @JsonIgnore public PSDevCenterDTO dctag2(String value) { setDCTag2(value); return this; }

    @JsonProperty("dctag3")
    public void setDCTag3(String value) { _set(DTOFIELD_DCTAG3, value); }
    @JsonIgnore public String getDCTag3() { return (String) _get(DTOFIELD_DCTAG3); }
    @JsonIgnore public boolean isDCTag3Dirty() { return _contains(DTOFIELD_DCTAG3); }
    @JsonIgnore public void resetDCTag3() { _reset(DTOFIELD_DCTAG3); }
    @JsonIgnore public PSDevCenterDTO dctag3(String value) { setDCTag3(value); return this; }

    @JsonProperty("dctag4")
    public void setDCTag4(String value) { _set(DTOFIELD_DCTAG4, value); }
    @JsonIgnore public String getDCTag4() { return (String) _get(DTOFIELD_DCTAG4); }
    @JsonIgnore public boolean isDCTag4Dirty() { return _contains(DTOFIELD_DCTAG4); }
    @JsonIgnore public void resetDCTag4() { _reset(DTOFIELD_DCTAG4); }
    @JsonIgnore public PSDevCenterDTO dctag4(String value) { setDCTag4(value); return this; }

    @JsonProperty("dctype")
    public void setDCType(String value) { _set(DTOFIELD_DCTYPE, value); }
    @JsonIgnore public String getDCType() { return (String) _get(DTOFIELD_DCTYPE); }
    @JsonIgnore public boolean isDCTypeDirty() { return _contains(DTOFIELD_DCTYPE); }
    @JsonIgnore public void resetDCType() { _reset(DTOFIELD_DCTYPE); }
    @JsonIgnore public PSDevCenterDTO dctype(String value) { setDCType(value); return this; }
    @JsonIgnore public PSDevCenterDTO dctype(PSModelEnums.DevCenterType value) {
        setDCType(value == null ? null : value.value); return this;
    }

    @JsonProperty("domainname")
    public void setDomainName(String value) { _set(DTOFIELD_DOMAINNAME, value); }
    @JsonIgnore public String getDomainName() { return (String) _get(DTOFIELD_DOMAINNAME); }
    @JsonIgnore public boolean isDomainNameDirty() { return _contains(DTOFIELD_DOMAINNAME); }
    @JsonIgnore public void resetDomainName() { _reset(DTOFIELD_DOMAINNAME); }
    @JsonIgnore public PSDevCenterDTO domainname(String value) { setDomainName(value); return this; }

    @JsonProperty("enabledeploycenter")
    public void setEnableDeployCenter(Integer value) { _set(DTOFIELD_ENABLEDEPLOYCENTER, value); }
    @JsonIgnore public Integer getEnableDeployCenter() { return (Integer) _get(DTOFIELD_ENABLEDEPLOYCENTER); }
    @JsonIgnore public boolean isEnableDeployCenterDirty() { return _contains(DTOFIELD_ENABLEDEPLOYCENTER); }
    @JsonIgnore public void resetEnableDeployCenter() { _reset(DTOFIELD_ENABLEDEPLOYCENTER); }
    @JsonIgnore public PSDevCenterDTO enabledeploycenter(Integer value) { setEnableDeployCenter(value); return this; }
    @JsonIgnore public PSDevCenterDTO enabledeploycenter(Boolean value) {
        setEnableDeployCenter(flagValue(value)); return this;
    }

    @JsonProperty("enableworkspace")
    public void setEnableWorkspace(Integer value) { _set(DTOFIELD_ENABLEWORKSPACE, value); }
    @JsonIgnore public Integer getEnableWorkspace() { return (Integer) _get(DTOFIELD_ENABLEWORKSPACE); }
    @JsonIgnore public boolean isEnableWorkspaceDirty() { return _contains(DTOFIELD_ENABLEWORKSPACE); }
    @JsonIgnore public void resetEnableWorkspace() { _reset(DTOFIELD_ENABLEWORKSPACE); }
    @JsonIgnore public PSDevCenterDTO enableworkspace(Integer value) { setEnableWorkspace(value); return this; }
    @JsonIgnore public PSDevCenterDTO enableworkspace(Boolean value) {
        setEnableWorkspace(flagValue(value)); return this;
    }

    @JsonProperty("enablewsserver")
    public void setEnableWSServer(Integer value) { _set(DTOFIELD_ENABLEWSSERVER, value); }
    @JsonIgnore public Integer getEnableWSServer() { return (Integer) _get(DTOFIELD_ENABLEWSSERVER); }
    @JsonIgnore public boolean isEnableWSServerDirty() { return _contains(DTOFIELD_ENABLEWSSERVER); }
    @JsonIgnore public void resetEnableWSServer() { _reset(DTOFIELD_ENABLEWSSERVER); }
    @JsonIgnore public PSDevCenterDTO enablewsserver(Integer value) { setEnableWSServer(value); return this; }
    @JsonIgnore public PSDevCenterDTO enablewsserver(Boolean value) {
        setEnableWSServer(flagValue(value)); return this;
    }

    @JsonProperty("entitycnt")
    public void setEntityCnt(Integer value) { _set(DTOFIELD_ENTITYCNT, value); }
    @JsonIgnore public Integer getEntityCnt() { return (Integer) _get(DTOFIELD_ENTITYCNT); }
    @JsonIgnore public boolean isEntityCntDirty() { return _contains(DTOFIELD_ENTITYCNT); }
    @JsonIgnore public void resetEntityCnt() { _reset(DTOFIELD_ENTITYCNT); }
    @JsonIgnore public PSDevCenterDTO entitycnt(Integer value) { setEntityCnt(value); return this; }

    @JsonProperty("experience")
    public void setExperience(Integer value) { _set(DTOFIELD_EXPERIENCE, value); }
    @JsonIgnore public Integer getExperience() { return (Integer) _get(DTOFIELD_EXPERIENCE); }
    @JsonIgnore public boolean isExperienceDirty() { return _contains(DTOFIELD_EXPERIENCE); }
    @JsonIgnore public void resetExperience() { _reset(DTOFIELD_EXPERIENCE); }
    @JsonIgnore public PSDevCenterDTO experience(Integer value) { setExperience(value); return this; }

    @JsonProperty("expiredtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setExpiredTime(Timestamp value) { _set(DTOFIELD_EXPIREDTIME, value); }
    @JsonIgnore public Timestamp getExpiredTime() { return (Timestamp) _get(DTOFIELD_EXPIREDTIME); }
    @JsonIgnore public boolean isExpiredTimeDirty() { return _contains(DTOFIELD_EXPIREDTIME); }
    @JsonIgnore public void resetExpiredTime() { _reset(DTOFIELD_EXPIREDTIME); }
    @JsonIgnore public PSDevCenterDTO expiredtime(Timestamp value) { setExpiredTime(value); return this; }

    @JsonProperty("fulldomainname")
    public void setFullDomainName(String value) { _set(DTOFIELD_FULLDOMAINNAME, value); }
    @JsonIgnore public String getFullDomainName() { return (String) _get(DTOFIELD_FULLDOMAINNAME); }
    @JsonIgnore public boolean isFullDomainNameDirty() { return _contains(DTOFIELD_FULLDOMAINNAME); }
    @JsonIgnore public void resetFullDomainName() { _reset(DTOFIELD_FULLDOMAINNAME); }
    @JsonIgnore public PSDevCenterDTO fulldomainname(String value) { setFullDomainName(value); return this; }

    @JsonProperty("ipaddrs")
    public void setIPAddrs(String value) { _set(DTOFIELD_IPADDRS, value); }
    @JsonIgnore public String getIPAddrs() { return (String) _get(DTOFIELD_IPADDRS); }
    @JsonIgnore public boolean isIPAddrsDirty() { return _contains(DTOFIELD_IPADDRS); }
    @JsonIgnore public void resetIPAddrs() { _reset(DTOFIELD_IPADDRS); }
    @JsonIgnore public PSDevCenterDTO ipaddrs(String value) { setIPAddrs(value); return this; }

    @JsonProperty("licinfo")
    public void setLicInfo(String value) { _set(DTOFIELD_LICINFO, value); }
    @JsonIgnore public String getLicInfo() { return (String) _get(DTOFIELD_LICINFO); }
    @JsonIgnore public boolean isLicInfoDirty() { return _contains(DTOFIELD_LICINFO); }
    @JsonIgnore public void resetLicInfo() { _reset(DTOFIELD_LICINFO); }
    @JsonIgnore public PSDevCenterDTO licinfo(String value) { setLicInfo(value); return this; }

    @JsonProperty("lickey")
    public void setLicKey(String value) { _set(DTOFIELD_LICKEY, value); }
    @JsonIgnore public String getLicKey() { return (String) _get(DTOFIELD_LICKEY); }
    @JsonIgnore public boolean isLicKeyDirty() { return _contains(DTOFIELD_LICKEY); }
    @JsonIgnore public void resetLicKey() { _reset(DTOFIELD_LICKEY); }
    @JsonIgnore public PSDevCenterDTO lickey(String value) { setLicKey(value); return this; }

    @JsonProperty("linkibiz5flag")
    public void setLinkIBiz5Flag(Integer value) { _set(DTOFIELD_LINKIBIZ5FLAG, value); }
    @JsonIgnore public Integer getLinkIBiz5Flag() { return (Integer) _get(DTOFIELD_LINKIBIZ5FLAG); }
    @JsonIgnore public boolean isLinkIBiz5FlagDirty() { return _contains(DTOFIELD_LINKIBIZ5FLAG); }
    @JsonIgnore public void resetLinkIBiz5Flag() { _reset(DTOFIELD_LINKIBIZ5FLAG); }
    @JsonIgnore public PSDevCenterDTO linkibiz5flag(Integer value) { setLinkIBiz5Flag(value); return this; }
    @JsonIgnore public PSDevCenterDTO linkibiz5flag(Boolean value) {
        setLinkIBiz5Flag(flagValue(value)); return this;
    }

    @JsonProperty("maxactiveusercnt")
    public void setMaxActiveUserCnt(Integer value) { _set(DTOFIELD_MAXACTIVEUSERCNT, value); }
    @JsonIgnore public Integer getMaxActiveUserCnt() { return (Integer) _get(DTOFIELD_MAXACTIVEUSERCNT); }
    @JsonIgnore public boolean isMaxActiveUserCntDirty() { return _contains(DTOFIELD_MAXACTIVEUSERCNT); }
    @JsonIgnore public void resetMaxActiveUserCnt() { _reset(DTOFIELD_MAXACTIVEUSERCNT); }
    @JsonIgnore public PSDevCenterDTO maxactiveusercnt(Integer value) { setMaxActiveUserCnt(value); return this; }

    @JsonProperty("maxentitycnt")
    public void setMaxEntityCnt(Integer value) { _set(DTOFIELD_MAXENTITYCNT, value); }
    @JsonIgnore public Integer getMaxEntityCnt() { return (Integer) _get(DTOFIELD_MAXENTITYCNT); }
    @JsonIgnore public boolean isMaxEntityCntDirty() { return _contains(DTOFIELD_MAXENTITYCNT); }
    @JsonIgnore public void resetMaxEntityCnt() { _reset(DTOFIELD_MAXENTITYCNT); }
    @JsonIgnore public PSDevCenterDTO maxentitycnt(Integer value) { setMaxEntityCnt(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSDevCenterDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("mobcertchgtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setMobCertChgTime(Timestamp value) { _set(DTOFIELD_MOBCERTCHGTIME, value); }
    @JsonIgnore public Timestamp getMobCertChgTime() { return (Timestamp) _get(DTOFIELD_MOBCERTCHGTIME); }
    @JsonIgnore public boolean isMobCertChgTimeDirty() { return _contains(DTOFIELD_MOBCERTCHGTIME); }
    @JsonIgnore public void resetMobCertChgTime() { _reset(DTOFIELD_MOBCERTCHGTIME); }
    @JsonIgnore public PSDevCenterDTO mobcertchgtime(Timestamp value) { setMobCertChgTime(value); return this; }

    @JsonProperty("mobtdchgtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setMobTDChgTime(Timestamp value) { _set(DTOFIELD_MOBTDCHGTIME, value); }
    @JsonIgnore public Timestamp getMobTDChgTime() { return (Timestamp) _get(DTOFIELD_MOBTDCHGTIME); }
    @JsonIgnore public boolean isMobTDChgTimeDirty() { return _contains(DTOFIELD_MOBTDCHGTIME); }
    @JsonIgnore public void resetMobTDChgTime() { _reset(DTOFIELD_MOBTDCHGTIME); }
    @JsonIgnore public PSDevCenterDTO mobtdchgtime(Timestamp value) { setMobTDChgTime(value); return this; }

    @JsonProperty("psdcinstid")
    public void setPSDCInstId(String value) { _set(DTOFIELD_PSDCINSTID, value); }
    @JsonIgnore public String getPSDCInstId() { return (String) _get(DTOFIELD_PSDCINSTID); }
    @JsonIgnore public boolean isPSDCInstIdDirty() { return _contains(DTOFIELD_PSDCINSTID); }
    @JsonIgnore public void resetPSDCInstId() { _reset(DTOFIELD_PSDCINSTID); }
    @JsonIgnore public PSDevCenterDTO psdcinstid(String value) { setPSDCInstId(value); return this; }

    @JsonProperty("psdcinstname")
    public void setPSDCInstName(String value) { _set(DTOFIELD_PSDCINSTNAME, value); }
    @JsonIgnore public String getPSDCInstName() { return (String) _get(DTOFIELD_PSDCINSTNAME); }
    @JsonIgnore public boolean isPSDCInstNameDirty() { return _contains(DTOFIELD_PSDCINSTNAME); }
    @JsonIgnore public void resetPSDCInstName() { _reset(DTOFIELD_PSDCINSTNAME); }
    @JsonIgnore public PSDevCenterDTO psdcinstname(String value) { setPSDCInstName(value); return this; }

    @JsonProperty("psdevcenterid")
    public void setPSDevCenterId(String value) { _set(DTOFIELD_PSDEVCENTERID, value); }
    @JsonIgnore public String getPSDevCenterId() { return (String) _get(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public boolean isPSDevCenterIdDirty() { return _contains(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public void resetPSDevCenterId() { _reset(DTOFIELD_PSDEVCENTERID); }
    @JsonIgnore public PSDevCenterDTO psdevcenterid(String value) { setPSDevCenterId(value); return this; }

    @JsonProperty("psdevcentername")
    public void setPSDevCenterName(String value) { _set(DTOFIELD_PSDEVCENTERNAME, value); }
    @JsonIgnore public String getPSDevCenterName() { return (String) _get(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public boolean isPSDevCenterNameDirty() { return _contains(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public void resetPSDevCenterName() { _reset(DTOFIELD_PSDEVCENTERNAME); }
    @JsonIgnore public PSDevCenterDTO psdevcentername(String value) { setPSDevCenterName(value); return this; }
    @JsonIgnore public String getName() { return getPSDevCenterName(); }
    @JsonIgnore public void setName(String value) { setPSDevCenterName(value); }
    @JsonIgnore public PSDevCenterDTO name(String value) { setPSDevCenterName(value); return this; }

    @JsonProperty("pspmsserverid")
    public void setPSPMSServerId(String value) { _set(DTOFIELD_PSPMSSERVERID, value); }
    @JsonIgnore public String getPSPMSServerId() { return (String) _get(DTOFIELD_PSPMSSERVERID); }
    @JsonIgnore public boolean isPSPMSServerIdDirty() { return _contains(DTOFIELD_PSPMSSERVERID); }
    @JsonIgnore public void resetPSPMSServerId() { _reset(DTOFIELD_PSPMSSERVERID); }
    @JsonIgnore public PSDevCenterDTO pspmsserverid(String value) { setPSPMSServerId(value); return this; }

    @JsonProperty("pspmsservername")
    public void setPSPMSServerName(String value) { _set(DTOFIELD_PSPMSSERVERNAME, value); }
    @JsonIgnore public String getPSPMSServerName() { return (String) _get(DTOFIELD_PSPMSSERVERNAME); }
    @JsonIgnore public boolean isPSPMSServerNameDirty() { return _contains(DTOFIELD_PSPMSSERVERNAME); }
    @JsonIgnore public void resetPSPMSServerName() { _reset(DTOFIELD_PSPMSSERVERNAME); }
    @JsonIgnore public PSDevCenterDTO pspmsservername(String value) { setPSPMSServerName(value); return this; }

    @JsonProperty("psrtwxaccountid")
    public void setPSRTWXAccountId(String value) { _set(DTOFIELD_PSRTWXACCOUNTID, value); }
    @JsonIgnore public String getPSRTWXAccountId() { return (String) _get(DTOFIELD_PSRTWXACCOUNTID); }
    @JsonIgnore public boolean isPSRTWXAccountIdDirty() { return _contains(DTOFIELD_PSRTWXACCOUNTID); }
    @JsonIgnore public void resetPSRTWXAccountId() { _reset(DTOFIELD_PSRTWXACCOUNTID); }
    @JsonIgnore public PSDevCenterDTO psrtwxaccountid(String value) { setPSRTWXAccountId(value); return this; }

    @JsonProperty("psrtwxaccountname")
    public void setPSRTWXAccountName(String value) { _set(DTOFIELD_PSRTWXACCOUNTNAME, value); }
    @JsonIgnore public String getPSRTWXAccountName() { return (String) _get(DTOFIELD_PSRTWXACCOUNTNAME); }
    @JsonIgnore public boolean isPSRTWXAccountNameDirty() { return _contains(DTOFIELD_PSRTWXACCOUNTNAME); }
    @JsonIgnore public void resetPSRTWXAccountName() { _reset(DTOFIELD_PSRTWXACCOUNTNAME); }
    @JsonIgnore public PSDevCenterDTO psrtwxaccountname(String value) { setPSRTWXAccountName(value); return this; }

    @JsonProperty("psstudioservergrpid")
    public void setPSStudioServerGrpId(String value) { _set(DTOFIELD_PSSTUDIOSERVERGRPID, value); }
    @JsonIgnore public String getPSStudioServerGrpId() { return (String) _get(DTOFIELD_PSSTUDIOSERVERGRPID); }
    @JsonIgnore public boolean isPSStudioServerGrpIdDirty() { return _contains(DTOFIELD_PSSTUDIOSERVERGRPID); }
    @JsonIgnore public void resetPSStudioServerGrpId() { _reset(DTOFIELD_PSSTUDIOSERVERGRPID); }
    @JsonIgnore public PSDevCenterDTO psstudioservergrpid(String value) { setPSStudioServerGrpId(value); return this; }

    @JsonProperty("psstudioservergrpname")
    public void setPSStudioServerGrpName(String value) { _set(DTOFIELD_PSSTUDIOSERVERGRPNAME, value); }
    @JsonIgnore public String getPSStudioServerGrpName() { return (String) _get(DTOFIELD_PSSTUDIOSERVERGRPNAME); }
    @JsonIgnore public boolean isPSStudioServerGrpNameDirty() { return _contains(DTOFIELD_PSSTUDIOSERVERGRPNAME); }
    @JsonIgnore public void resetPSStudioServerGrpName() { _reset(DTOFIELD_PSSTUDIOSERVERGRPNAME); }
    @JsonIgnore public PSDevCenterDTO psstudioservergrpname(String value) { setPSStudioServerGrpName(value); return this; }

    @JsonProperty("pssvninstrepoid")
    public void setPSSvnInstRepoId(String value) { _set(DTOFIELD_PSSVNINSTREPOID, value); }
    @JsonIgnore public String getPSSvnInstRepoId() { return (String) _get(DTOFIELD_PSSVNINSTREPOID); }
    @JsonIgnore public boolean isPSSvnInstRepoIdDirty() { return _contains(DTOFIELD_PSSVNINSTREPOID); }
    @JsonIgnore public void resetPSSvnInstRepoId() { _reset(DTOFIELD_PSSVNINSTREPOID); }
    @JsonIgnore public PSDevCenterDTO pssvninstrepoid(String value) { setPSSvnInstRepoId(value); return this; }

    @JsonProperty("pssvninstreponame")
    public void setPSSvnInstRepoName(String value) { _set(DTOFIELD_PSSVNINSTREPONAME, value); }
    @JsonIgnore public String getPSSvnInstRepoName() { return (String) _get(DTOFIELD_PSSVNINSTREPONAME); }
    @JsonIgnore public boolean isPSSvnInstRepoNameDirty() { return _contains(DTOFIELD_PSSVNINSTREPONAME); }
    @JsonIgnore public void resetPSSvnInstRepoName() { _reset(DTOFIELD_PSSVNINSTREPONAME); }
    @JsonIgnore public PSDevCenterDTO pssvninstreponame(String value) { setPSSvnInstRepoName(value); return this; }

    @JsonProperty("pssvrdomainid")
    public void setPSSvrDomainId(String value) { _set(DTOFIELD_PSSVRDOMAINID, value); }
    @JsonIgnore public String getPSSvrDomainId() { return (String) _get(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public boolean isPSSvrDomainIdDirty() { return _contains(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public void resetPSSvrDomainId() { _reset(DTOFIELD_PSSVRDOMAINID); }
    @JsonIgnore public PSDevCenterDTO pssvrdomainid(String value) { setPSSvrDomainId(value); return this; }

    @JsonProperty("pssvrdomainname")
    public void setPSSvrDomainName(String value) { _set(DTOFIELD_PSSVRDOMAINNAME, value); }
    @JsonIgnore public String getPSSvrDomainName() { return (String) _get(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public boolean isPSSvrDomainNameDirty() { return _contains(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public void resetPSSvrDomainName() { _reset(DTOFIELD_PSSVRDOMAINNAME); }
    @JsonIgnore public PSDevCenterDTO pssvrdomainname(String value) { setPSSvrDomainName(value); return this; }

    @JsonProperty("pssvrproviderid")
    public void setPSSvrProviderId(String value) { _set(DTOFIELD_PSSVRPROVIDERID, value); }
    @JsonIgnore public String getPSSvrProviderId() { return (String) _get(DTOFIELD_PSSVRPROVIDERID); }
    @JsonIgnore public boolean isPSSvrProviderIdDirty() { return _contains(DTOFIELD_PSSVRPROVIDERID); }
    @JsonIgnore public void resetPSSvrProviderId() { _reset(DTOFIELD_PSSVRPROVIDERID); }
    @JsonIgnore public PSDevCenterDTO pssvrproviderid(String value) { setPSSvrProviderId(value); return this; }

    @JsonProperty("pssvrprovidername")
    public void setPSSvrProviderName(String value) { _set(DTOFIELD_PSSVRPROVIDERNAME, value); }
    @JsonIgnore public String getPSSvrProviderName() { return (String) _get(DTOFIELD_PSSVRPROVIDERNAME); }
    @JsonIgnore public boolean isPSSvrProviderNameDirty() { return _contains(DTOFIELD_PSSVRPROVIDERNAME); }
    @JsonIgnore public void resetPSSvrProviderName() { _reset(DTOFIELD_PSSVRPROVIDERNAME); }
    @JsonIgnore public PSDevCenterDTO pssvrprovidername(String value) { setPSSvrProviderName(value); return this; }

    @JsonProperty("robotchgtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setRobotChgTime(Timestamp value) { _set(DTOFIELD_ROBOTCHGTIME, value); }
    @JsonIgnore public Timestamp getRobotChgTime() { return (Timestamp) _get(DTOFIELD_ROBOTCHGTIME); }
    @JsonIgnore public boolean isRobotChgTimeDirty() { return _contains(DTOFIELD_ROBOTCHGTIME); }
    @JsonIgnore public void resetRobotChgTime() { _reset(DTOFIELD_ROBOTCHGTIME); }
    @JsonIgnore public PSDevCenterDTO robotchgtime(Timestamp value) { setRobotChgTime(value); return this; }

    @JsonProperty("ropssvninstrepoid")
    public void setROPSSvnInstRepoId(String value) { _set(DTOFIELD_ROPSSVNINSTREPOID, value); }
    @JsonIgnore public String getROPSSvnInstRepoId() { return (String) _get(DTOFIELD_ROPSSVNINSTREPOID); }
    @JsonIgnore public boolean isROPSSvnInstRepoIdDirty() { return _contains(DTOFIELD_ROPSSVNINSTREPOID); }
    @JsonIgnore public void resetROPSSvnInstRepoId() { _reset(DTOFIELD_ROPSSVNINSTREPOID); }
    @JsonIgnore public PSDevCenterDTO ropssvninstrepoid(String value) { setROPSSvnInstRepoId(value); return this; }

    @JsonProperty("ropssvninstreponame")
    public void setROPSSvnInstRepoName(String value) { _set(DTOFIELD_ROPSSVNINSTREPONAME, value); }
    @JsonIgnore public String getROPSSvnInstRepoName() { return (String) _get(DTOFIELD_ROPSSVNINSTREPONAME); }
    @JsonIgnore public boolean isROPSSvnInstRepoNameDirty() { return _contains(DTOFIELD_ROPSSVNINSTREPONAME); }
    @JsonIgnore public void resetROPSSvnInstRepoName() { _reset(DTOFIELD_ROPSSVNINSTREPONAME); }
    @JsonIgnore public PSDevCenterDTO ropssvninstreponame(String value) { setROPSSvnInstRepoName(value); return this; }

    @JsonProperty("spflag")
    public void setSPFlag(Integer value) { _set(DTOFIELD_SPFLAG, value); }
    @JsonIgnore public Integer getSPFlag() { return (Integer) _get(DTOFIELD_SPFLAG); }
    @JsonIgnore public boolean isSPFlagDirty() { return _contains(DTOFIELD_SPFLAG); }
    @JsonIgnore public void resetSPFlag() { _reset(DTOFIELD_SPFLAG); }
    @JsonIgnore public PSDevCenterDTO spflag(Integer value) { setSPFlag(value); return this; }
    @JsonIgnore public PSDevCenterDTO spflag(Boolean value) { setSPFlag(flagValue(value)); return this; }

    @JsonProperty("studiotag")
    public void setStudioTag(String value) { _set(DTOFIELD_STUDIOTAG, value); }
    @JsonIgnore public String getStudioTag() { return (String) _get(DTOFIELD_STUDIOTAG); }
    @JsonIgnore public boolean isStudioTagDirty() { return _contains(DTOFIELD_STUDIOTAG); }
    @JsonIgnore public void resetStudioTag() { _reset(DTOFIELD_STUDIOTAG); }
    @JsonIgnore public PSDevCenterDTO studiotag(String value) { setStudioTag(value); return this; }

    @JsonProperty("studiotag2")
    public void setStudioTag2(String value) { _set(DTOFIELD_STUDIOTAG2, value); }
    @JsonIgnore public String getStudioTag2() { return (String) _get(DTOFIELD_STUDIOTAG2); }
    @JsonIgnore public boolean isStudioTag2Dirty() { return _contains(DTOFIELD_STUDIOTAG2); }
    @JsonIgnore public void resetStudioTag2() { _reset(DTOFIELD_STUDIOTAG2); }
    @JsonIgnore public PSDevCenterDTO studiotag2(String value) { setStudioTag2(value); return this; }

    @JsonProperty("sysapiflag")
    public void setSysAPIFlag(Integer value) { _set(DTOFIELD_SYSAPIFLAG, value); }
    @JsonIgnore public Integer getSysAPIFlag() { return (Integer) _get(DTOFIELD_SYSAPIFLAG); }
    @JsonIgnore public boolean isSysAPIFlagDirty() { return _contains(DTOFIELD_SYSAPIFLAG); }
    @JsonIgnore public void resetSysAPIFlag() { _reset(DTOFIELD_SYSAPIFLAG); }
    @JsonIgnore public PSDevCenterDTO sysapiflag(Integer value) { setSysAPIFlag(value); return this; }
    @JsonIgnore public PSDevCenterDTO sysapiflag(Boolean value) { setSysAPIFlag(flagValue(value)); return this; }

    @JsonProperty("syssn")
    public void setSysSN(Integer value) { _set(DTOFIELD_SYSSN, value); }
    @JsonIgnore public Integer getSysSN() { return (Integer) _get(DTOFIELD_SYSSN); }
    @JsonIgnore public boolean isSysSNDirty() { return _contains(DTOFIELD_SYSSN); }
    @JsonIgnore public void resetSysSN() { _reset(DTOFIELD_SYSSN); }
    @JsonIgnore public PSDevCenterDTO syssn(Integer value) { setSysSN(value); return this; }

    @JsonProperty("totalenergy")
    public void setTotalEnergy(Integer value) { _set(DTOFIELD_TOTALENERGY, value); }
    @JsonIgnore public Integer getTotalEnergy() { return (Integer) _get(DTOFIELD_TOTALENERGY); }
    @JsonIgnore public boolean isTotalEnergyDirty() { return _contains(DTOFIELD_TOTALENERGY); }
    @JsonIgnore public void resetTotalEnergy() { _reset(DTOFIELD_TOTALENERGY); }
    @JsonIgnore public PSDevCenterDTO totalenergy(Integer value) { setTotalEnergy(value); return this; }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSDevCenterDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSDevCenterDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("v6pssvninstrepoid")
    public void setV6PSSvnInstRepoId(String value) { _set(DTOFIELD_V6PSSVNINSTREPOID, value); }
    @JsonIgnore public String getV6PSSvnInstRepoId() { return (String) _get(DTOFIELD_V6PSSVNINSTREPOID); }
    @JsonIgnore public boolean isV6PSSvnInstRepoIdDirty() { return _contains(DTOFIELD_V6PSSVNINSTREPOID); }
    @JsonIgnore public void resetV6PSSvnInstRepoId() { _reset(DTOFIELD_V6PSSVNINSTREPOID); }
    @JsonIgnore public PSDevCenterDTO v6pssvninstrepoid(String value) { setV6PSSvnInstRepoId(value); return this; }

    @JsonProperty("v6pssvninstreponame")
    public void setV6PSSvnInstRepoName(String value) { _set(DTOFIELD_V6PSSVNINSTREPONAME, value); }
    @JsonIgnore public String getV6PSSvnInstRepoName() { return (String) _get(DTOFIELD_V6PSSVNINSTREPONAME); }
    @JsonIgnore public boolean isV6PSSvnInstRepoNameDirty() { return _contains(DTOFIELD_V6PSSVNINSTREPONAME); }
    @JsonIgnore public void resetV6PSSvnInstRepoName() { _reset(DTOFIELD_V6PSSVNINSTREPONAME); }
    @JsonIgnore public PSDevCenterDTO v6pssvninstreponame(String value) { setV6PSSvnInstRepoName(value); return this; }

    @JsonProperty("validflag")
    public void setValidFlag(Integer value) { _set(DTOFIELD_VALIDFLAG, value); }
    @JsonIgnore public Integer getValidFlag() { return (Integer) _get(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public boolean isValidFlagDirty() { return _contains(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public void resetValidFlag() { _reset(DTOFIELD_VALIDFLAG); }
    @JsonIgnore public PSDevCenterDTO validflag(Integer value) { setValidFlag(value); return this; }
    @JsonIgnore public PSDevCenterDTO validflag(Boolean value) { setValidFlag(flagValue(value)); return this; }

    @JsonProperty("webfolder")
    public void setWebFolder(String value) { _set(DTOFIELD_WEBFOLDER, value); }
    @JsonIgnore public String getWebFolder() { return (String) _get(DTOFIELD_WEBFOLDER); }
    @JsonIgnore public boolean isWebFolderDirty() { return _contains(DTOFIELD_WEBFOLDER); }
    @JsonIgnore public void resetWebFolder() { _reset(DTOFIELD_WEBFOLDER); }
    @JsonIgnore public PSDevCenterDTO webfolder(String value) { setWebFolder(value); return this; }

    @JsonProperty("websiteurl")
    public void setWebSiteURL(String value) { _set(DTOFIELD_WEBSITEURL, value); }
    @JsonIgnore public String getWebSiteURL() { return (String) _get(DTOFIELD_WEBSITEURL); }
    @JsonIgnore public boolean isWebSiteURLDirty() { return _contains(DTOFIELD_WEBSITEURL); }
    @JsonIgnore public void resetWebSiteURL() { _reset(DTOFIELD_WEBSITEURL); }
    @JsonIgnore public PSDevCenterDTO websiteurl(String value) { setWebSiteURL(value); return this; }

    @JsonProperty("wxdeptid")
    public void setWXDeptId(Integer value) { _set(DTOFIELD_WXDEPTID, value); }
    @JsonIgnore public Integer getWXDeptId() { return (Integer) _get(DTOFIELD_WXDEPTID); }
    @JsonIgnore public boolean isWXDeptIdDirty() { return _contains(DTOFIELD_WXDEPTID); }
    @JsonIgnore public void resetWXDeptId() { _reset(DTOFIELD_WXDEPTID); }
    @JsonIgnore public PSDevCenterDTO wxdeptid(Integer value) { setWXDeptId(value); return this; }

    @JsonIgnore public String getId() { return getPSDevCenterId(); }
    @JsonIgnore public void setId(String value) { setPSDevCenterId(value); }
    @JsonIgnore public PSDevCenterDTO id(String value) { setPSDevCenterId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}