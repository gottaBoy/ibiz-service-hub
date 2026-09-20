package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSVNServerDTO extends PSModelDTOBase {
    public static final String FIELD_AUTHZCFG = "AUTHZCFG";
    protected static final String DTOFIELD_AUTHZCFG = "authzcfg";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_GITADMINPASS = "GITADMINPASS";
    protected static final String DTOFIELD_GITADMINPASS = "gitadminpass";
    public static final String FIELD_GITADMINUSER = "GITADMINUSER";
    protected static final String DTOFIELD_GITADMINUSER = "gitadminuser";
    public static final String FIELD_GITPASSWORD = "GITPASSWORD";
    protected static final String DTOFIELD_GITPASSWORD = "gitpassword";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_GITPRJ = "GITPRJ";
    protected static final String DTOFIELD_GITPRJ = "gitprj";
    public static final String FIELD_GITTOKEN = "GITTOKEN";
    protected static final String DTOFIELD_GITTOKEN = "gittoken";
    public static final String FIELD_GITUSERNAME = "GITUSERNAME";
    protected static final String DTOFIELD_GITUSERNAME = "gitusername";
    public static final String FIELD_IPADDR = "IPADDR";
    protected static final String DTOFIELD_IPADDR = "ipaddr";
    public static final String FIELD_IPADDR2 = "IPADDR2";
    protected static final String DTOFIELD_IPADDR2 = "ipaddr2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PASSWD = "PASSWD";
    protected static final String DTOFIELD_PASSWD = "passwd";
    public static final String FIELD_PORT = "PORT";
    protected static final String DTOFIELD_PORT = "port";
    public static final String FIELD_PSSVNSERVERID = "PSSVNSERVERID";
    protected static final String DTOFIELD_PSSVNSERVERID = "pssvnserverid";
    public static final String FIELD_PSSVNSERVERNAME = "PSSVNSERVERNAME";
    protected static final String DTOFIELD_PSSVNSERVERNAME = "pssvnservername";
    public static final String FIELD_PSSVRDOMAINID = "PSSVRDOMAINID";
    protected static final String DTOFIELD_PSSVRDOMAINID = "pssvrdomainid";
    public static final String FIELD_PSSVRDOMAINNAME = "PSSVRDOMAINNAME";
    protected static final String DTOFIELD_PSSVRDOMAINNAME = "pssvrdomainname";
    public static final String FIELD_SLAVEIPADDR = "SLAVEIPADDR";
    protected static final String DTOFIELD_SLAVEIPADDR = "slaveipaddr";
    public static final String FIELD_SLAVEIPADDR2 = "SLAVEIPADDR2";
    protected static final String DTOFIELD_SLAVEIPADDR2 = "slaveipaddr2";
    public static final String FIELD_SLAVEPASSWD = "SLAVEPASSWD";
    protected static final String DTOFIELD_SLAVEPASSWD = "slavepasswd";
    public static final String FIELD_SLAVEPORT = "SLAVEPORT";
    protected static final String DTOFIELD_SLAVEPORT = "slaveport";
    public static final String FIELD_SLAVESVNPASSWD = "SLAVESVNPASSWD";
    protected static final String DTOFIELD_SLAVESVNPASSWD = "slavesvnpasswd";
    public static final String FIELD_SLAVESVNROOT = "SLAVESVNROOT";
    protected static final String DTOFIELD_SLAVESVNROOT = "slavesvnroot";
    public static final String FIELD_SLAVESVNURL = "SLAVESVNURL";
    protected static final String DTOFIELD_SLAVESVNURL = "slavesvnurl";
    public static final String FIELD_SLAVESVNUSERNAME = "SLAVESVNUSERNAME";
    protected static final String DTOFIELD_SLAVESVNUSERNAME = "slavesvnusername";
    public static final String FIELD_SLAVEUSERNAME = "SLAVEUSERNAME";
    protected static final String DTOFIELD_SLAVEUSERNAME = "slaveusername";
    public static final String FIELD_SVNPASSWD = "SVNPASSWD";
    protected static final String DTOFIELD_SVNPASSWD = "svnpasswd";
    public static final String FIELD_SVNROOT = "SVNROOT";
    protected static final String DTOFIELD_SVNROOT = "svnroot";
    public static final String FIELD_SVNTYPE = "SVNTYPE";
    protected static final String DTOFIELD_SVNTYPE = "svntype";
    public static final String FIELD_SVNURL = "SVNURL";
    protected static final String DTOFIELD_SVNURL = "svnurl";
    public static final String FIELD_SVNUSERNAME = "SVNUSERNAME";
    protected static final String DTOFIELD_SVNUSERNAME = "svnusername";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERNAME = "USERNAME";
    protected static final String DTOFIELD_USERNAME = "username";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="authzcfg")
    public void setAuthzCfg(String authzCfg) {
        this._set(DTOFIELD_AUTHZCFG, authzCfg);
    }

    @JsonIgnore
    public String getAuthzCfg() {
        Object objValue = this._get(DTOFIELD_AUTHZCFG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAuthzCfgDirty() {
        return this._contains(DTOFIELD_AUTHZCFG);
    }

    @JsonIgnore
    public void resetAuthzCfg() {
        this._reset(DTOFIELD_AUTHZCFG);
    }

    @JsonIgnore
    public PSSVNServerDTO authzcfg(String authzCfg) {
        this.setAuthzCfg(authzCfg);
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
    public PSSVNServerDTO createdate(Timestamp createDate) {
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
    public PSSVNServerDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="gitadminpass")
    public void setGitAdminPass(String gitAdminPass) {
        this._set(DTOFIELD_GITADMINPASS, gitAdminPass);
    }

    @JsonIgnore
    public String getGitAdminPass() {
        Object objValue = this._get(DTOFIELD_GITADMINPASS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitAdminPassDirty() {
        return this._contains(DTOFIELD_GITADMINPASS);
    }

    @JsonIgnore
    public void resetGitAdminPass() {
        this._reset(DTOFIELD_GITADMINPASS);
    }

    @JsonIgnore
    public PSSVNServerDTO gitadminpass(String gitAdminPass) {
        this.setGitAdminPass(gitAdminPass);
        return this;
    }

    @JsonProperty(value="gitadminuser")
    public void setGitAdminUser(String gitAdminUser) {
        this._set(DTOFIELD_GITADMINUSER, gitAdminUser);
    }

    @JsonIgnore
    public String getGitAdminUser() {
        Object objValue = this._get(DTOFIELD_GITADMINUSER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitAdminUserDirty() {
        return this._contains(DTOFIELD_GITADMINUSER);
    }

    @JsonIgnore
    public void resetGitAdminUser() {
        this._reset(DTOFIELD_GITADMINUSER);
    }

    @JsonIgnore
    public PSSVNServerDTO gitadminuser(String gitAdminUser) {
        this.setGitAdminUser(gitAdminUser);
        return this;
    }

    @JsonProperty(value="gitpassword")
    public void setGITPassword(String gITPassword) {
        this._set(DTOFIELD_GITPASSWORD, gITPassword);
    }

    @JsonIgnore
    public String getGITPassword() {
        Object objValue = this._get(DTOFIELD_GITPASSWORD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGITPasswordDirty() {
        return this._contains(DTOFIELD_GITPASSWORD);
    }

    @JsonIgnore
    public void resetGITPassword() {
        this._reset(DTOFIELD_GITPASSWORD);
    }

    @JsonIgnore
    public PSSVNServerDTO gitpassword(String gITPassword) {
        this.setGITPassword(gITPassword);
        return this;
    }

    @JsonProperty(value="gitpath")
    public void setGitPath(String gitPath) {
        this._set(DTOFIELD_GITPATH, gitPath);
    }

    @JsonIgnore
    public String getGitPath() {
        Object objValue = this._get(DTOFIELD_GITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitPathDirty() {
        return this._contains(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public void resetGitPath() {
        this._reset(DTOFIELD_GITPATH);
    }

    @JsonIgnore
    public PSSVNServerDTO gitpath(String gitPath) {
        this.setGitPath(gitPath);
        return this;
    }

    @JsonProperty(value="gitprj")
    public void setGitPrj(String gitPrj) {
        this._set(DTOFIELD_GITPRJ, gitPrj);
    }

    @JsonIgnore
    public String getGitPrj() {
        Object objValue = this._get(DTOFIELD_GITPRJ);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitPrjDirty() {
        return this._contains(DTOFIELD_GITPRJ);
    }

    @JsonIgnore
    public void resetGitPrj() {
        this._reset(DTOFIELD_GITPRJ);
    }

    @JsonIgnore
    public PSSVNServerDTO gitprj(String gitPrj) {
        this.setGitPrj(gitPrj);
        return this;
    }

    @JsonProperty(value="gittoken")
    public void setGitToken(String gitToken) {
        this._set(DTOFIELD_GITTOKEN, gitToken);
    }

    @JsonIgnore
    public String getGitToken() {
        Object objValue = this._get(DTOFIELD_GITTOKEN);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitTokenDirty() {
        return this._contains(DTOFIELD_GITTOKEN);
    }

    @JsonIgnore
    public void resetGitToken() {
        this._reset(DTOFIELD_GITTOKEN);
    }

    @JsonIgnore
    public PSSVNServerDTO gittoken(String gitToken) {
        this.setGitToken(gitToken);
        return this;
    }

    @JsonProperty(value="gitusername")
    public void setGITUserName(String gITUserName) {
        this._set(DTOFIELD_GITUSERNAME, gITUserName);
    }

    @JsonIgnore
    public String getGITUserName() {
        Object objValue = this._get(DTOFIELD_GITUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGITUserNameDirty() {
        return this._contains(DTOFIELD_GITUSERNAME);
    }

    @JsonIgnore
    public void resetGITUserName() {
        this._reset(DTOFIELD_GITUSERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO gitusername(String gITUserName) {
        this.setGITUserName(gITUserName);
        return this;
    }

    @JsonProperty(value="ipaddr")
    public void setIpAddr(String ipAddr) {
        this._set(DTOFIELD_IPADDR, ipAddr);
    }

    @JsonIgnore
    public String getIpAddr() {
        Object objValue = this._get(DTOFIELD_IPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddrDirty() {
        return this._contains(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public void resetIpAddr() {
        this._reset(DTOFIELD_IPADDR);
    }

    @JsonIgnore
    public PSSVNServerDTO ipaddr(String ipAddr) {
        this.setIpAddr(ipAddr);
        return this;
    }

    @JsonProperty(value="ipaddr2")
    public void setIpAddr2(String ipAddr2) {
        this._set(DTOFIELD_IPADDR2, ipAddr2);
    }

    @JsonIgnore
    public String getIpAddr2() {
        Object objValue = this._get(DTOFIELD_IPADDR2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIpAddr2Dirty() {
        return this._contains(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public void resetIpAddr2() {
        this._reset(DTOFIELD_IPADDR2);
    }

    @JsonIgnore
    public PSSVNServerDTO ipaddr2(String ipAddr2) {
        this.setIpAddr2(ipAddr2);
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
    public PSSVNServerDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="passwd")
    public void setPasswd(String passwd) {
        this._set(DTOFIELD_PASSWD, passwd);
    }

    @JsonIgnore
    public String getPasswd() {
        Object objValue = this._get(DTOFIELD_PASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPasswdDirty() {
        return this._contains(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public void resetPasswd() {
        this._reset(DTOFIELD_PASSWD);
    }

    @JsonIgnore
    public PSSVNServerDTO passwd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    @JsonProperty(value="port")
    public void setPort(Integer port) {
        this._set(DTOFIELD_PORT, port);
    }

    @JsonIgnore
    public Integer getPort() {
        Object objValue = this._get(DTOFIELD_PORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPortDirty() {
        return this._contains(DTOFIELD_PORT);
    }

    @JsonIgnore
    public void resetPort() {
        this._reset(DTOFIELD_PORT);
    }

    @JsonIgnore
    public PSSVNServerDTO port(Integer port) {
        this.setPort(port);
        return this;
    }

    @JsonProperty(value="pssvnserverid")
    public void setPSSVNServerId(String pSSVNServerId) {
        this._set(DTOFIELD_PSSVNSERVERID, pSSVNServerId);
    }

    @JsonIgnore
    public String getPSSVNServerId() {
        Object objValue = this._get(DTOFIELD_PSSVNSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSVNServerIdDirty() {
        return this._contains(DTOFIELD_PSSVNSERVERID);
    }

    @JsonIgnore
    public void resetPSSVNServerId() {
        this._reset(DTOFIELD_PSSVNSERVERID);
    }

    @JsonIgnore
    public PSSVNServerDTO pssvnserverid(String pSSVNServerId) {
        this.setPSSVNServerId(pSSVNServerId);
        return this;
    }

    @JsonProperty(value="pssvnservername")
    public void setPSSVNServerName(String pSSVNServerName) {
        this._set(DTOFIELD_PSSVNSERVERNAME, pSSVNServerName);
    }

    @JsonIgnore
    public String getPSSVNServerName() {
        Object objValue = this._get(DTOFIELD_PSSVNSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSVNServerNameDirty() {
        return this._contains(DTOFIELD_PSSVNSERVERNAME);
    }

    @JsonIgnore
    public void resetPSSVNServerName() {
        this._reset(DTOFIELD_PSSVNSERVERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO pssvnservername(String pSSVNServerName) {
        this.setPSSVNServerName(pSSVNServerName);
        return this;
    }

    @JsonProperty(value="pssvrdomainid")
    public void setPSSvrDomainId(String pSSvrDomainId) {
        this._set(DTOFIELD_PSSVRDOMAINID, pSSvrDomainId);
    }

    @JsonIgnore
    public String getPSSvrDomainId() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainIdDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public void resetPSSvrDomainId() {
        this._reset(DTOFIELD_PSSVRDOMAINID);
    }

    @JsonIgnore
    public PSSVNServerDTO pssvrdomainid(String pSSvrDomainId) {
        this.setPSSvrDomainId(pSSvrDomainId);
        return this;
    }

    @JsonProperty(value="pssvrdomainname")
    public void setPSSvrDomainName(String pSSvrDomainName) {
        this._set(DTOFIELD_PSSVRDOMAINNAME, pSSvrDomainName);
    }

    @JsonIgnore
    public String getPSSvrDomainName() {
        Object objValue = this._get(DTOFIELD_PSSVRDOMAINNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSvrDomainNameDirty() {
        return this._contains(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public void resetPSSvrDomainName() {
        this._reset(DTOFIELD_PSSVRDOMAINNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO pssvrdomainname(String pSSvrDomainName) {
        this.setPSSvrDomainName(pSSvrDomainName);
        return this;
    }

    @JsonProperty(value="slaveipaddr")
    public void setSlaveIPADDR(String slaveIPADDR) {
        this._set(DTOFIELD_SLAVEIPADDR, slaveIPADDR);
    }

    @JsonIgnore
    public String getSlaveIPADDR() {
        Object objValue = this._get(DTOFIELD_SLAVEIPADDR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveIPADDRDirty() {
        return this._contains(DTOFIELD_SLAVEIPADDR);
    }

    @JsonIgnore
    public void resetSlaveIPADDR() {
        this._reset(DTOFIELD_SLAVEIPADDR);
    }

    @JsonIgnore
    public PSSVNServerDTO slaveipaddr(String slaveIPADDR) {
        this.setSlaveIPADDR(slaveIPADDR);
        return this;
    }

    @JsonProperty(value="slaveipaddr2")
    public void setSlaveIpAddr2(String slaveIpAddr2) {
        this._set(DTOFIELD_SLAVEIPADDR2, slaveIpAddr2);
    }

    @JsonIgnore
    public String getSlaveIpAddr2() {
        Object objValue = this._get(DTOFIELD_SLAVEIPADDR2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveIpAddr2Dirty() {
        return this._contains(DTOFIELD_SLAVEIPADDR2);
    }

    @JsonIgnore
    public void resetSlaveIpAddr2() {
        this._reset(DTOFIELD_SLAVEIPADDR2);
    }

    @JsonIgnore
    public PSSVNServerDTO slaveipaddr2(String slaveIpAddr2) {
        this.setSlaveIpAddr2(slaveIpAddr2);
        return this;
    }

    @JsonProperty(value="slavepasswd")
    public void setSlavePasswd(String slavePasswd) {
        this._set(DTOFIELD_SLAVEPASSWD, slavePasswd);
    }

    @JsonIgnore
    public String getSlavePasswd() {
        Object objValue = this._get(DTOFIELD_SLAVEPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlavePasswdDirty() {
        return this._contains(DTOFIELD_SLAVEPASSWD);
    }

    @JsonIgnore
    public void resetSlavePasswd() {
        this._reset(DTOFIELD_SLAVEPASSWD);
    }

    @JsonIgnore
    public PSSVNServerDTO slavepasswd(String slavePasswd) {
        this.setSlavePasswd(slavePasswd);
        return this;
    }

    @JsonProperty(value="slaveport")
    public void setSlavePort(Integer slavePort) {
        this._set(DTOFIELD_SLAVEPORT, slavePort);
    }

    @JsonIgnore
    public Integer getSlavePort() {
        Object objValue = this._get(DTOFIELD_SLAVEPORT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSlavePortDirty() {
        return this._contains(DTOFIELD_SLAVEPORT);
    }

    @JsonIgnore
    public void resetSlavePort() {
        this._reset(DTOFIELD_SLAVEPORT);
    }

    @JsonIgnore
    public PSSVNServerDTO slaveport(Integer slavePort) {
        this.setSlavePort(slavePort);
        return this;
    }

    @JsonProperty(value="slavesvnpasswd")
    public void setSlaveSvnPassWd(String slaveSvnPassWd) {
        this._set(DTOFIELD_SLAVESVNPASSWD, slaveSvnPassWd);
    }

    @JsonIgnore
    public String getSlaveSvnPassWd() {
        Object objValue = this._get(DTOFIELD_SLAVESVNPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveSvnPassWdDirty() {
        return this._contains(DTOFIELD_SLAVESVNPASSWD);
    }

    @JsonIgnore
    public void resetSlaveSvnPassWd() {
        this._reset(DTOFIELD_SLAVESVNPASSWD);
    }

    @JsonIgnore
    public PSSVNServerDTO slavesvnpasswd(String slaveSvnPassWd) {
        this.setSlaveSvnPassWd(slaveSvnPassWd);
        return this;
    }

    @JsonProperty(value="slavesvnroot")
    public void setSlaveSVNRoot(String slaveSVNRoot) {
        this._set(DTOFIELD_SLAVESVNROOT, slaveSVNRoot);
    }

    @JsonIgnore
    public String getSlaveSVNRoot() {
        Object objValue = this._get(DTOFIELD_SLAVESVNROOT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveSVNRootDirty() {
        return this._contains(DTOFIELD_SLAVESVNROOT);
    }

    @JsonIgnore
    public void resetSlaveSVNRoot() {
        this._reset(DTOFIELD_SLAVESVNROOT);
    }

    @JsonIgnore
    public PSSVNServerDTO slavesvnroot(String slaveSVNRoot) {
        this.setSlaveSVNRoot(slaveSVNRoot);
        return this;
    }

    @JsonProperty(value="slavesvnurl")
    public void setSlaveSVNUrl(String slaveSVNUrl) {
        this._set(DTOFIELD_SLAVESVNURL, slaveSVNUrl);
    }

    @JsonIgnore
    public String getSlaveSVNUrl() {
        Object objValue = this._get(DTOFIELD_SLAVESVNURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveSVNUrlDirty() {
        return this._contains(DTOFIELD_SLAVESVNURL);
    }

    @JsonIgnore
    public void resetSlaveSVNUrl() {
        this._reset(DTOFIELD_SLAVESVNURL);
    }

    @JsonIgnore
    public PSSVNServerDTO slavesvnurl(String slaveSVNUrl) {
        this.setSlaveSVNUrl(slaveSVNUrl);
        return this;
    }

    @JsonProperty(value="slavesvnusername")
    public void setSlaveSvnUserName(String slaveSvnUserName) {
        this._set(DTOFIELD_SLAVESVNUSERNAME, slaveSvnUserName);
    }

    @JsonIgnore
    public String getSlaveSvnUserName() {
        Object objValue = this._get(DTOFIELD_SLAVESVNUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveSvnUserNameDirty() {
        return this._contains(DTOFIELD_SLAVESVNUSERNAME);
    }

    @JsonIgnore
    public void resetSlaveSvnUserName() {
        this._reset(DTOFIELD_SLAVESVNUSERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO slavesvnusername(String slaveSvnUserName) {
        this.setSlaveSvnUserName(slaveSvnUserName);
        return this;
    }

    @JsonProperty(value="slaveusername")
    public void setSlaveUserName(String slaveUserName) {
        this._set(DTOFIELD_SLAVEUSERNAME, slaveUserName);
    }

    @JsonIgnore
    public String getSlaveUserName() {
        Object objValue = this._get(DTOFIELD_SLAVEUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSlaveUserNameDirty() {
        return this._contains(DTOFIELD_SLAVEUSERNAME);
    }

    @JsonIgnore
    public void resetSlaveUserName() {
        this._reset(DTOFIELD_SLAVEUSERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO slaveusername(String slaveUserName) {
        this.setSlaveUserName(slaveUserName);
        return this;
    }

    @JsonProperty(value="svnpasswd")
    public void setSvnPassWd(String svnPassWd) {
        this._set(DTOFIELD_SVNPASSWD, svnPassWd);
    }

    @JsonIgnore
    public String getSvnPassWd() {
        Object objValue = this._get(DTOFIELD_SVNPASSWD);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSvnPassWdDirty() {
        return this._contains(DTOFIELD_SVNPASSWD);
    }

    @JsonIgnore
    public void resetSvnPassWd() {
        this._reset(DTOFIELD_SVNPASSWD);
    }

    @JsonIgnore
    public PSSVNServerDTO svnpasswd(String svnPassWd) {
        this.setSvnPassWd(svnPassWd);
        return this;
    }

    @JsonProperty(value="svnroot")
    public void setSVNRoot(String sVNRoot) {
        this._set(DTOFIELD_SVNROOT, sVNRoot);
    }

    @JsonIgnore
    public String getSVNRoot() {
        Object objValue = this._get(DTOFIELD_SVNROOT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSVNRootDirty() {
        return this._contains(DTOFIELD_SVNROOT);
    }

    @JsonIgnore
    public void resetSVNRoot() {
        this._reset(DTOFIELD_SVNROOT);
    }

    @JsonIgnore
    public PSSVNServerDTO svnroot(String sVNRoot) {
        this.setSVNRoot(sVNRoot);
        return this;
    }

    @JsonProperty(value="svntype")
    public void setSVNType(String sVNType) {
        this._set(DTOFIELD_SVNTYPE, sVNType);
    }

    @JsonIgnore
    public String getSVNType() {
        Object objValue = this._get(DTOFIELD_SVNTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSVNTypeDirty() {
        return this._contains(DTOFIELD_SVNTYPE);
    }

    @JsonIgnore
    public void resetSVNType() {
        this._reset(DTOFIELD_SVNTYPE);
    }

    @JsonIgnore
    public PSSVNServerDTO svntype(String sVNType) {
        this.setSVNType(sVNType);
        return this;
    }

    @JsonIgnore
    public PSSVNServerDTO svntype(PSModelEnums.DCSVNType sVNType) {
        this.setSVNType(sVNType == null ? null : sVNType.value);
        return this;
    }

    @JsonProperty(value="svnurl")
    public void setSVNUrl(String sVNUrl) {
        this._set(DTOFIELD_SVNURL, sVNUrl);
    }

    @JsonIgnore
    public String getSVNUrl() {
        Object objValue = this._get(DTOFIELD_SVNURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSVNUrlDirty() {
        return this._contains(DTOFIELD_SVNURL);
    }

    @JsonIgnore
    public void resetSVNUrl() {
        this._reset(DTOFIELD_SVNURL);
    }

    @JsonIgnore
    public PSSVNServerDTO svnurl(String sVNUrl) {
        this.setSVNUrl(sVNUrl);
        return this;
    }

    @JsonProperty(value="svnusername")
    public void setSvnUserName(String svnUserName) {
        this._set(DTOFIELD_SVNUSERNAME, svnUserName);
    }

    @JsonIgnore
    public String getSvnUserName() {
        Object objValue = this._get(DTOFIELD_SVNUSERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSvnUserNameDirty() {
        return this._contains(DTOFIELD_SVNUSERNAME);
    }

    @JsonIgnore
    public void resetSvnUserName() {
        this._reset(DTOFIELD_SVNUSERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO svnusername(String svnUserName) {
        this.setSvnUserName(svnUserName);
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
    public PSSVNServerDTO updatedate(Timestamp updateDate) {
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
    public PSSVNServerDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="username")
    public void setUserName(String userName) {
        this._set(DTOFIELD_USERNAME, userName);
    }

    @JsonIgnore
    public String getUserName() {
        Object objValue = this._get(DTOFIELD_USERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserNameDirty() {
        return this._contains(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public void resetUserName() {
        this._reset(DTOFIELD_USERNAME);
    }

    @JsonIgnore
    public PSSVNServerDTO username(String userName) {
        this.setUserName(userName);
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
    public PSSVNServerDTO usertag(String userTag) {
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
    public PSSVNServerDTO usertag2(String userTag2) {
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
    public PSSVNServerDTO usertag3(String userTag3) {
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
    public PSSVNServerDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isValidFlagDirty() {
        return this._contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetValidFlag() {
        this._reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSSVNServerDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSVNServerDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSVNServerName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSVNServerName(strName);
    }

    @JsonIgnore
    public PSSVNServerDTO name(String strName) {
        this.setPSSVNServerName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSVNServerId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSVNServerId(strValue);
    }

    @JsonIgnore
    public PSSVNServerDTO id(String strValue) {
        this.setPSSVNServerId(strValue);
        return this;
    }

}
