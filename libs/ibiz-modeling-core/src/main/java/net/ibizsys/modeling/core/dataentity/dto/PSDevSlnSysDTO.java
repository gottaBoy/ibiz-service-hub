package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysDTO extends PSModelDTOBase {
    public static final String FIELD_ACTIONOWNER = "ACTIONOWNER";
    protected static final String DTOFIELD_ACTIONOWNER = "actionowner";
    public static final String FIELD_APIFLAG = "APIFLAG";
    protected static final String DTOFIELD_APIFLAG = "apiflag";
    public static final String FIELD_CALLBACKTAG = "CALLBACKTAG";
    protected static final String DTOFIELD_CALLBACKTAG = "callbacktag";
    public static final String FIELD_CALLBACKURL = "CALLBACKURL";
    protected static final String DTOFIELD_CALLBACKURL = "callbackurl";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CURACTION = "CURACTION";
    protected static final String DTOFIELD_CURACTION = "curaction";
    public static final String FIELD_DB2PSDCDBINSTID = "DB2PSDCDBINSTID";
    protected static final String DTOFIELD_DB2PSDCDBINSTID = "db2psdcdbinstid";
    public static final String FIELD_DB2PSDCDBINSTNAME = "DB2PSDCDBINSTNAME";
    protected static final String DTOFIELD_DB2PSDCDBINSTNAME = "db2psdcdbinstname";
    public static final String FIELD_DBTYPES = "DBTYPES";
    protected static final String DTOFIELD_DBTYPES = "dbtypes";
    public static final String FIELD_DBVERSION = "DBVERSION";
    protected static final String DTOFIELD_DBVERSION = "dbversion";
    public static final String FIELD_DEPLOYSYSID = "DEPLOYSYSID";
    protected static final String DTOFIELD_DEPLOYSYSID = "deploysysid";
    public static final String FIELD_DEPLOYSYSORGID = "DEPLOYSYSORGID";
    protected static final String DTOFIELD_DEPLOYSYSORGID = "deploysysorgid";
    public static final String FIELD_DEPLOYSYSORGSECTORID = "DEPLOYSYSORGSECTORID";
    protected static final String DTOFIELD_DEPLOYSYSORGSECTORID = "deploysysorgsectorid";
    public static final String FIELD_DEPLOYSYSTAG = "DEPLOYSYSTAG";
    protected static final String DTOFIELD_DEPLOYSYSTAG = "deploysystag";
    public static final String FIELD_DEPLOYSYSTAG2 = "DEPLOYSYSTAG2";
    protected static final String DTOFIELD_DEPLOYSYSTAG2 = "deploysystag2";
    public static final String FIELD_DEPLOYSYSTYPE = "DEPLOYSYSTYPE";
    protected static final String DTOFIELD_DEPLOYSYSTYPE = "deploysystype";
    public static final String FIELD_DEVRESINFO = "DEVRESINFO";
    protected static final String DTOFIELD_DEVRESINFO = "devresinfo";
    public static final String FIELD_DEVRESSTATE = "DEVRESSTATE";
    protected static final String DTOFIELD_DEVRESSTATE = "devresstate";
    public static final String FIELD_DEVSYSSTATE = "DEVSYSSTATE";
    protected static final String DTOFIELD_DEVSYSSTATE = "devsysstate";
    public static final String FIELD_DOCGITBRANCH = "DOCGITBRANCH";
    protected static final String DTOFIELD_DOCGITBRANCH = "docgitbranch";
    public static final String FIELD_DOCGITPATH = "DOCGITPATH";
    protected static final String DTOFIELD_DOCGITPATH = "docgitpath";
    public static final String FIELD_DOCPSDEVCENTERSVNID = "DOCPSDEVCENTERSVNID";
    protected static final String DTOFIELD_DOCPSDEVCENTERSVNID = "docpsdevcentersvnid";
    public static final String FIELD_DOCPSDEVCENTERSVNNAME = "DOCPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_DOCPSDEVCENTERSVNNAME = "docpsdevcentersvnname";
    public static final String FIELD_ENABLECALLBACK = "ENABLECALLBACK";
    protected static final String DTOFIELD_ENABLECALLBACK = "enablecallback";
    public static final String FIELD_ENABLEDB2 = "ENABLEDB2";
    protected static final String DTOFIELD_ENABLEDB2 = "enabledb2";
    public static final String FIELD_ENABLEDEPLOYCENTER = "ENABLEDEPLOYCENTER";
    protected static final String DTOFIELD_ENABLEDEPLOYCENTER = "enabledeploycenter";
    public static final String FIELD_ENABLEDM = "ENABLEDM";
    protected static final String DTOFIELD_ENABLEDM = "enabledm";
    public static final String FIELD_ENABLEDYNASYS = "ENABLEDYNASYS";
    protected static final String DTOFIELD_ENABLEDYNASYS = "enabledynasys";
    public static final String FIELD_ENABLEHANA = "ENABLEHANA";
    protected static final String DTOFIELD_ENABLEHANA = "enablehana";
    public static final String FIELD_ENABLEHBASE = "ENABLEHBASE";
    protected static final String DTOFIELD_ENABLEHBASE = "enablehbase";
    public static final String FIELD_ENABLEMYSQL5 = "ENABLEMYSQL5";
    protected static final String DTOFIELD_ENABLEMYSQL5 = "enablemysql5";
    public static final String FIELD_ENABLEORACLE = "ENABLEORACLE";
    protected static final String DTOFIELD_ENABLEORACLE = "enableoracle";
    public static final String FIELD_ENABLEPGSQL = "ENABLEPGSQL";
    protected static final String DTOFIELD_ENABLEPGSQL = "enablepgsql";
    public static final String FIELD_ENABLEPPAS = "ENABLEPPAS";
    protected static final String DTOFIELD_ENABLEPPAS = "enableppas";
    public static final String FIELD_ENABLESQLITE = "ENABLESQLITE";
    protected static final String DTOFIELD_ENABLESQLITE = "enablesqlite";
    public static final String FIELD_ENABLESQLSERVER = "ENABLESQLSERVER";
    protected static final String DTOFIELD_ENABLESQLSERVER = "enablesqlserver";
    public static final String FIELD_ENABLEWSSERVER = "ENABLEWSSERVER";
    protected static final String DTOFIELD_ENABLEWSSERVER = "enablewsserver";
    public static final String FIELD_ENTITYCNT = "ENTITYCNT";
    protected static final String DTOFIELD_ENTITYCNT = "entitycnt";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_GITBRANCH = "GITBRANCH";
    protected static final String DTOFIELD_GITBRANCH = "gitbranch";
    public static final String FIELD_GITPATH = "GITPATH";
    protected static final String DTOFIELD_GITPATH = "gitpath";
    public static final String FIELD_HBASEPSDCBDINSTID = "HBASEPSDCBDINSTID";
    protected static final String DTOFIELD_HBASEPSDCBDINSTID = "hbasepsdcbdinstid";
    public static final String FIELD_HBASEPSDCBDINSTNAME = "HBASEPSDCBDINSTNAME";
    protected static final String DTOFIELD_HBASEPSDCBDINSTNAME = "hbasepsdcbdinstname";
    public static final String FIELD_INITPARAMS = "INITPARAMS";
    protected static final String DTOFIELD_INITPARAMS = "initparams";
    public static final String FIELD_JITPSDBDEVINSTID = "JITPSDBDEVINSTID";
    protected static final String DTOFIELD_JITPSDBDEVINSTID = "jitpsdbdevinstid";
    public static final String FIELD_JITPSDBDEVINSTNAME = "JITPSDBDEVINSTNAME";
    protected static final String DTOFIELD_JITPSDBDEVINSTNAME = "jitpsdbdevinstname";
    public static final String FIELD_JITPSDEVCENTERTSID = "JITPSDEVCENTERTSID";
    protected static final String DTOFIELD_JITPSDEVCENTERTSID = "jitpsdevcentertsid";
    public static final String FIELD_JITPSDEVCENTERTSNAME = "JITPSDEVCENTERTSNAME";
    protected static final String DTOFIELD_JITPSDEVCENTERTSNAME = "jitpsdevcentertsname";
    public static final String FIELD_LASTACTIVETIME = "LASTACTIVETIME";
    protected static final String DTOFIELD_LASTACTIVETIME = "lastactivetime";
    public static final String FIELD_LOADTIME = "LOADTIME";
    protected static final String DTOFIELD_LOADTIME = "loadtime";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_LOWCODEMODE = "LOWCODEMODE";
    protected static final String DTOFIELD_LOWCODEMODE = "lowcodemode";
    public static final String FIELD_MAINPSDEVSLNSYSID = "MAINPSDEVSLNSYSID";
    protected static final String DTOFIELD_MAINPSDEVSLNSYSID = "mainpsdevslnsysid";
    public static final String FIELD_MAINPSDEVSLNSYSNAME = "MAINPSDEVSLNSYSNAME";
    protected static final String DTOFIELD_MAINPSDEVSLNSYSNAME = "mainpsdevslnsysname";
    public static final String FIELD_MAXENTITYCNT = "MAXENTITYCNT";
    protected static final String DTOFIELD_MAXENTITYCNT = "maxentitycnt";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELGITBRANCH = "MODELGITBRANCH";
    protected static final String DTOFIELD_MODELGITBRANCH = "modelgitbranch";
    public static final String FIELD_MODELGITPATH = "MODELGITPATH";
    protected static final String DTOFIELD_MODELGITPATH = "modelgitpath";
    public static final String FIELD_MODELINSTVER = "MODELINSTVER";
    protected static final String DTOFIELD_MODELINSTVER = "modelinstver";
    public static final String FIELD_MODELPREFIX = "MODELPREFIX";
    protected static final String DTOFIELD_MODELPREFIX = "modelprefix";
    public static final String FIELD_MODELPSDEVCENTERSVNID = "MODELPSDEVCENTERSVNID";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNID = "modelpsdevcentersvnid";
    public static final String FIELD_MODELPSDEVCENTERSVNNAME = "MODELPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNNAME = "modelpsdevcentersvnname";
    public static final String FIELD_MSSQLPSDCDBINSTID = "MSSQLPSDCDBINSTID";
    protected static final String DTOFIELD_MSSQLPSDCDBINSTID = "mssqlpsdcdbinstid";
    public static final String FIELD_MSSQLPSDCDBINSTNAME = "MSSQLPSDCDBINSTNAME";
    protected static final String DTOFIELD_MSSQLPSDCDBINSTNAME = "mssqlpsdcdbinstname";
    public static final String FIELD_MYSQLPSDCDBINSTID = "MYSQLPSDCDBINSTID";
    protected static final String DTOFIELD_MYSQLPSDCDBINSTID = "mysqlpsdcdbinstid";
    public static final String FIELD_MYSQLPSDCDBINSTNAME = "MYSQLPSDCDBINSTNAME";
    protected static final String DTOFIELD_MYSQLPSDCDBINSTNAME = "mysqlpsdcdbinstname";
    public static final String FIELD_OFFLINETIME = "OFFLINETIME";
    protected static final String DTOFIELD_OFFLINETIME = "offlinetime";
    public static final String FIELD_ORAPSDCDBINSTID = "ORAPSDCDBINSTID";
    protected static final String DTOFIELD_ORAPSDCDBINSTID = "orapsdcdbinstid";
    public static final String FIELD_ORAPSDCDBINSTNAME = "ORAPSDCDBINSTNAME";
    protected static final String DTOFIELD_ORAPSDCDBINSTNAME = "orapsdcdbinstname";
    public static final String FIELD_PGSQLPSDCDBINSTID = "PGSQLPSDCDBINSTID";
    protected static final String DTOFIELD_PGSQLPSDCDBINSTID = "pgsqlpsdcdbinstid";
    public static final String FIELD_PGSQLPSDCDBINSTNAME = "PGSQLPSDCDBINSTNAME";
    protected static final String DTOFIELD_PGSQLPSDCDBINSTNAME = "pgsqlpsdcdbinstname";
    public static final String FIELD_PPASPSDCDBINSTID = "PPASPSDCDBINSTID";
    protected static final String DTOFIELD_PPASPSDCDBINSTID = "ppaspsdcdbinstid";
    public static final String FIELD_PPASPSDCDBINSTNAME = "PPASPSDCDBINSTNAME";
    protected static final String DTOFIELD_PPASPSDCDBINSTNAME = "ppaspsdcdbinstname";
    public static final String FIELD_PPSDEVSLNSYSID = "PPSDEVSLNSYSID";
    protected static final String DTOFIELD_PPSDEVSLNSYSID = "ppsdevslnsysid";
    public static final String FIELD_PPSDEVSLNSYSNAME = "PPSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PPSDEVSLNSYSNAME = "ppsdevslnsysname";
    public static final String FIELD_PSDCDEPLOYCENTERID = "PSDCDEPLOYCENTERID";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERID = "psdcdeploycenterid";
    public static final String FIELD_PSDCDEPLOYCENTERNAME = "PSDCDEPLOYCENTERNAME";
    protected static final String DTOFIELD_PSDCDEPLOYCENTERNAME = "psdcdeploycentername";
    public static final String FIELD_PSDCMODELTEMPLID = "PSDCMODELTEMPLID";
    protected static final String DTOFIELD_PSDCMODELTEMPLID = "psdcmodeltemplid";
    public static final String FIELD_PSDCMODELTEMPLNAME = "PSDCMODELTEMPLNAME";
    protected static final String DTOFIELD_PSDCMODELTEMPLNAME = "psdcmodeltemplname";
    public static final String FIELD_PSDCROBOTID = "PSDCROBOTID";
    protected static final String DTOFIELD_PSDCROBOTID = "psdcrobotid";
    public static final String FIELD_PSDCROBOTNAME = "PSDCROBOTNAME";
    protected static final String DTOFIELD_PSDCROBOTNAME = "psdcrobotname";
    public static final String FIELD_PSDCSYSLICID = "PSDCSYSLICID";
    protected static final String DTOFIELD_PSDCSYSLICID = "psdcsyslicid";
    public static final String FIELD_PSDCSYSLICNAME = "PSDCSYSLICNAME";
    protected static final String DTOFIELD_PSDCSYSLICNAME = "psdcsyslicname";
    public static final String FIELD_PSDCWORKSPACEID = "PSDCWORKSPACEID";
    protected static final String DTOFIELD_PSDCWORKSPACEID = "psdcworkspaceid";
    public static final String FIELD_PSDEVCENTERASID = "PSDEVCENTERASID";
    protected static final String DTOFIELD_PSDEVCENTERASID = "psdevcenterasid";
    public static final String FIELD_PSDEVCENTERASID2 = "PSDEVCENTERASID2";
    protected static final String DTOFIELD_PSDEVCENTERASID2 = "psdevcenterasid2";
    public static final String FIELD_PSDEVCENTERAS3ID = "PSDEVCENTERASID3";
    protected static final String DTOFIELD_PSDEVCENTERAS3ID = "psdevcenteras3id";
    public static final String FIELD_PSDEVCENTERAS4ID = "PSDEVCENTERASID4";
    protected static final String DTOFIELD_PSDEVCENTERAS4ID = "psdevcenteras4id";
    public static final String FIELD_PSDEVCENTERASNAME = "PSDEVCENTERASNAME";
    protected static final String DTOFIELD_PSDEVCENTERASNAME = "psdevcenterasname";
    public static final String FIELD_PSDEVCENTERASNAME2 = "PSDEVCENTERASNAME2";
    protected static final String DTOFIELD_PSDEVCENTERASNAME2 = "psdevcenterasname2";
    public static final String FIELD_PSDEVCENTERAS3NAME = "PSDEVCENTERASNAME3";
    protected static final String DTOFIELD_PSDEVCENTERAS3NAME = "psdevcenteras3name";
    public static final String FIELD_PSDEVCENTERAS4NAME = "PSDEVCENTERASNAME4";
    protected static final String DTOFIELD_PSDEVCENTERAS4NAME = "psdevcenteras4name";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVCENTERSVNID = "PSDEVCENTERSVNID";
    protected static final String DTOFIELD_PSDEVCENTERSVNID = "psdevcentersvnid";
    public static final String FIELD_PSDEVCENTERSVNNAME = "PSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";
    public static final String FIELD_PSDEVCENTERTSID = "PSDEVCENTERTSID";
    protected static final String DTOFIELD_PSDEVCENTERTSID = "psdevcentertsid";
    public static final String FIELD_PSDEVCENTERTSNAME = "PSDEVCENTERTSNAME";
    protected static final String DTOFIELD_PSDEVCENTERTSNAME = "psdevcentertsname";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_PSDEVSLNSYSRESID = "PSDEVSLNSYSRESID";
    protected static final String DTOFIELD_PSDEVSLNSYSRESID = "psdevslnsysresid";
    public static final String FIELD_PSDEVSLNSYSRESNAME = "PSDEVSLNSYSRESNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSRESNAME = "psdevslnsysresname";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSTUDIOTHEMEID = "PSSTUDIOTHEMEID";
    protected static final String DTOFIELD_PSSTUDIOTHEMEID = "psstudiothemeid";
    public static final String FIELD_PSSTUDIOTHEMENAME = "PSSTUDIOTHEMENAME";
    protected static final String DTOFIELD_PSSTUDIOTHEMENAME = "psstudiothemename";
    public static final String FIELD_PSSYSMODELINSTID = "PSSYSMODELINSTID";
    protected static final String DTOFIELD_PSSYSMODELINSTID = "pssysmodelinstid";
    public static final String FIELD_PSSYSMODELINSTNAME = "PSSYSMODELINSTNAME";
    protected static final String DTOFIELD_PSSYSMODELINSTNAME = "pssysmodelinstname";
    public static final String FIELD_PSSYSPOLICYID = "PSSYSPOLICYID";
    protected static final String DTOFIELD_PSSYSPOLICYID = "pssyspolicyid";
    public static final String FIELD_PSSYSPOLICYNAME = "PSSYSPOLICYNAME";
    protected static final String DTOFIELD_PSSYSPOLICYNAME = "pssyspolicyname";
    public static final String FIELD_PSSYSTEMID = "PSSYSTEMID";
    protected static final String DTOFIELD_PSSYSTEMID = "pssystemid";
    public static final String FIELD_PSTASKSERVERID = "PSTASKSERVERID";
    protected static final String DTOFIELD_PSTASKSERVERID = "pstaskserverid";
    public static final String FIELD_PSTASKSERVERNAME = "PSTASKSERVERNAME";
    protected static final String DTOFIELD_PSTASKSERVERNAME = "pstaskservername";
    public static final String FIELD_PUBCODE = "PUBCODE";
    protected static final String DTOFIELD_PUBCODE = "pubcode";
    public static final String FIELD_RESREADYTIME = "RESREADYTIME";
    protected static final String DTOFIELD_RESREADYTIME = "resreadytime";
    public static final String FIELD_ROGITBRANCH = "ROGITBRANCH";
    protected static final String DTOFIELD_ROGITBRANCH = "rogitbranch";
    public static final String FIELD_ROGITPATH = "ROGITPATH";
    protected static final String DTOFIELD_ROGITPATH = "rogitpath";
    public static final String FIELD_ROPSDEVCENTERSVNID = "ROPSDEVCENTERSVNID";
    protected static final String DTOFIELD_ROPSDEVCENTERSVNID = "ropsdevcentersvnid";
    public static final String FIELD_ROPSDEVCENTERSVNNAME = "ROPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_ROPSDEVCENTERSVNNAME = "ropsdevcentersvnname";
    public static final String FIELD_RTMODELPSDEVCENTERSVNID = "RTMODELPSDEVCENTERSVNID";
    protected static final String DTOFIELD_RTMODELPSDEVCENTERSVNID = "rtmodelpsdevcentersvnid";
    public static final String FIELD_RTMODELPSDEVCENTERSVNNAME = "RTMODELPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_RTMODELPSDEVCENTERSVNNAME = "rtmodelpsdevcentersvnname";
    public static final String FIELD_SAASMODE = "SAASMODE";
    protected static final String DTOFIELD_SAASMODE = "saasmode";
    public static final String FIELD_SFPSSUBSYSID = "SFPSSUBSYSID";
    protected static final String DTOFIELD_SFPSSUBSYSID = "sfpssubsysid";
    public static final String FIELD_SFPSSUBSYSNAME = "SFPSSUBSYSNAME";
    protected static final String DTOFIELD_SFPSSUBSYSNAME = "sfpssubsysname";
    public static final String FIELD_SHAREFLAG = "SHAREFLAG";
    protected static final String DTOFIELD_SHAREFLAG = "shareflag";
    public static final String FIELD_STUDIOTAG = "STUDIOTAG";
    protected static final String DTOFIELD_STUDIOTAG = "studiotag";
    public static final String FIELD_STUDIOTAG2 = "STUDIOTAG2";
    protected static final String DTOFIELD_STUDIOTAG2 = "studiotag2";
    public static final String FIELD_SYSFOLDER = "SYSFOLDER";
    protected static final String DTOFIELD_SYSFOLDER = "sysfolder";
    public static final String FIELD_SYSMDURL = "SYSMDURL";
    protected static final String DTOFIELD_SYSMDURL = "sysmdurl";
    public static final String FIELD_SYSROWKEY = "SYSROWKEY";
    protected static final String DTOFIELD_SYSROWKEY = "sysrowkey";
    public static final String FIELD_SYSTAG = "SYSTAG";
    protected static final String DTOFIELD_SYSTAG = "systag";
    public static final String FIELD_SYSTAG2 = "SYSTAG2";
    protected static final String DTOFIELD_SYSTAG2 = "systag2";
    public static final String FIELD_SYSTAG3 = "SYSTAG3";
    protected static final String DTOFIELD_SYSTAG3 = "systag3";
    public static final String FIELD_SYSTAG4 = "SYSTAG4";
    protected static final String DTOFIELD_SYSTAG4 = "systag4";
    public static final String FIELD_SYSTYPE = "SYSTYPE";
    protected static final String DTOFIELD_SYSTYPE = "systype";
    public static final String FIELD_SYSVER = "SYSVER";
    protected static final String DTOFIELD_SYSVER = "sysver";
    public static final String FIELD_TEMPLENGINE = "TEMPLENGINE";
    protected static final String DTOFIELD_TEMPLENGINE = "templengine";
    public static final String FIELD_THEMECSSSTYLE = "THEMECSSSTYLE";
    protected static final String DTOFIELD_THEMECSSSTYLE = "themecssstyle";
    public static final String FIELD_UNLOADTIME = "UNLOADTIME";
    protected static final String DTOFIELD_UNLOADTIME = "unloadtime";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
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
    public static final String FIELD_VCTYPE = "VCTYPE";
    protected static final String DTOFIELD_VCTYPE = "vctype";

    @JsonProperty(value="actionowner")
    public void setActionOwner(String actionOwner) {
        this._set(DTOFIELD_ACTIONOWNER, actionOwner);
    }

    @JsonIgnore
    public String getActionOwner() {
        Object objValue = this._get(DTOFIELD_ACTIONOWNER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isActionOwnerDirty() {
        return this._contains(DTOFIELD_ACTIONOWNER);
    }

    @JsonIgnore
    public void resetActionOwner() {
        this._reset(DTOFIELD_ACTIONOWNER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO actionowner(String actionOwner) {
        this.setActionOwner(actionOwner);
        return this;
    }

    @JsonProperty(value="apiflag")
    public void setAPIFlag(Integer aPIFlag) {
        this._set(DTOFIELD_APIFLAG, aPIFlag);
    }

    @JsonIgnore
    public Integer getAPIFlag() {
        Object objValue = this._get(DTOFIELD_APIFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAPIFlagDirty() {
        return this._contains(DTOFIELD_APIFLAG);
    }

    @JsonIgnore
    public void resetAPIFlag() {
        this._reset(DTOFIELD_APIFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO apiflag(Integer aPIFlag) {
        this.setAPIFlag(aPIFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO apiflag(Boolean aPIFlag) {
        this.setAPIFlag(aPIFlag == null ? null : (aPIFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="callbacktag")
    public void setCallbackTag(String callbackTag) {
        this._set(DTOFIELD_CALLBACKTAG, callbackTag);
    }

    @JsonIgnore
    public String getCallbackTag() {
        Object objValue = this._get(DTOFIELD_CALLBACKTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallbackTagDirty() {
        return this._contains(DTOFIELD_CALLBACKTAG);
    }

    @JsonIgnore
    public void resetCallbackTag() {
        this._reset(DTOFIELD_CALLBACKTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO callbacktag(String callbackTag) {
        this.setCallbackTag(callbackTag);
        return this;
    }

    @JsonProperty(value="callbackurl")
    public void setCallbackUrl(String callbackUrl) {
        this._set(DTOFIELD_CALLBACKURL, callbackUrl);
    }

    @JsonIgnore
    public String getCallbackUrl() {
        Object objValue = this._get(DTOFIELD_CALLBACKURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCallbackUrlDirty() {
        return this._contains(DTOFIELD_CALLBACKURL);
    }

    @JsonIgnore
    public void resetCallbackUrl() {
        this._reset(DTOFIELD_CALLBACKURL);
    }

    @JsonIgnore
    public PSDevSlnSysDTO callbackurl(String callbackUrl) {
        this.setCallbackUrl(callbackUrl);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDevSlnSysDTO createdate(Timestamp createDate) {
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
    public PSDevSlnSysDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="curaction")
    public void setCurAction(String curAction) {
        this._set(DTOFIELD_CURACTION, curAction);
    }

    @JsonIgnore
    public String getCurAction() {
        Object objValue = this._get(DTOFIELD_CURACTION);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCurActionDirty() {
        return this._contains(DTOFIELD_CURACTION);
    }

    @JsonIgnore
    public void resetCurAction() {
        this._reset(DTOFIELD_CURACTION);
    }

    @JsonIgnore
    public PSDevSlnSysDTO curaction(String curAction) {
        this.setCurAction(curAction);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO curaction(PSModelEnums.DevSysAction curAction) {
        this.setCurAction(curAction == null ? null : curAction.value);
        return this;
    }

    @JsonProperty(value="db2psdcdbinstid")
    public void setDB2PSDCDBInstId(String dB2PSDCDBInstId) {
        this._set(DTOFIELD_DB2PSDCDBINSTID, dB2PSDCDBInstId);
    }

    @JsonIgnore
    public String getDB2PSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_DB2PSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDB2PSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_DB2PSDCDBINSTID);
    }

    @JsonIgnore
    public void resetDB2PSDCDBInstId() {
        this._reset(DTOFIELD_DB2PSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO db2psdcdbinstid(String dB2PSDCDBInstId) {
        this.setDB2PSDCDBInstId(dB2PSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO db2psdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setDB2PSDCDBInstId(null);
            this.setDB2PSDCDBInstName(null);
        } else {
            this.setDB2PSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setDB2PSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="db2psdcdbinstname")
    public void setDB2PSDCDBInstName(String dB2PSDCDBInstName) {
        this._set(DTOFIELD_DB2PSDCDBINSTNAME, dB2PSDCDBInstName);
    }

    @JsonIgnore
    public String getDB2PSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_DB2PSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDB2PSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_DB2PSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetDB2PSDCDBInstName() {
        this._reset(DTOFIELD_DB2PSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO db2psdcdbinstname(String dB2PSDCDBInstName) {
        this.setDB2PSDCDBInstName(dB2PSDCDBInstName);
        return this;
    }

    @JsonProperty(value="dbtypes")
    public void setDBTypes(String dBTypes) {
        this._set(DTOFIELD_DBTYPES, dBTypes);
    }

    @JsonIgnore
    public String getDBTypes() {
        Object objValue = this._get(DTOFIELD_DBTYPES);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypesDirty() {
        return this._contains(DTOFIELD_DBTYPES);
    }

    @JsonIgnore
    public void resetDBTypes() {
        this._reset(DTOFIELD_DBTYPES);
    }

    @JsonIgnore
    public PSDevSlnSysDTO dbtypes(String dBTypes) {
        this.setDBTypes(dBTypes);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO dbtypes(PSModelEnums.DBType[] dBTypes) {
        if (dBTypes == null || dBTypes.length == 0) {
            this.setDBTypes(null);
        } else {
            String value = "";
            for (PSModelEnums.DBType item : dBTypes) {
                if (value.length() > 0) value = value + ";";
                value = value + item.value;
            }
            this.setDBTypes(value);
        }
        return this;
    }

    @JsonProperty(value="dbversion")
    public void setDBVersion(Integer dBVersion) {
        this._set(DTOFIELD_DBVERSION, dBVersion);
    }

    @JsonIgnore
    public Integer getDBVersion() {
        Object objValue = this._get(DTOFIELD_DBVERSION);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDBVersionDirty() {
        return this._contains(DTOFIELD_DBVERSION);
    }

    @JsonIgnore
    public void resetDBVersion() {
        this._reset(DTOFIELD_DBVERSION);
    }

    @JsonIgnore
    public PSDevSlnSysDTO dbversion(Integer dBVersion) {
        this.setDBVersion(dBVersion);
        return this;
    }

    @JsonProperty(value="deploysysid")
    public void setDeploySysId(String deploySysId) {
        this._set(DTOFIELD_DEPLOYSYSID, deploySysId);
    }

    @JsonIgnore
    public String getDeploySysId() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysIdDirty() {
        return this._contains(DTOFIELD_DEPLOYSYSID);
    }

    @JsonIgnore
    public void resetDeploySysId() {
        this._reset(DTOFIELD_DEPLOYSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysysid(String deploySysId) {
        this.setDeploySysId(deploySysId);
        return this;
    }

    @JsonProperty(value="deploysysorgid")
    public void setDeploySysOrgId(String deploySysOrgId) {
        this._set(DTOFIELD_DEPLOYSYSORGID, deploySysOrgId);
    }

    @JsonIgnore
    public String getDeploySysOrgId() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSORGID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysOrgIdDirty() {
        return this._contains(DTOFIELD_DEPLOYSYSORGID);
    }

    @JsonIgnore
    public void resetDeploySysOrgId() {
        this._reset(DTOFIELD_DEPLOYSYSORGID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysysorgid(String deploySysOrgId) {
        this.setDeploySysOrgId(deploySysOrgId);
        return this;
    }

    @JsonProperty(value="deploysysorgsectorid")
    public void setDeploySysOrgSectorId(String deploySysOrgSectorId) {
        this._set(DTOFIELD_DEPLOYSYSORGSECTORID, deploySysOrgSectorId);
    }

    @JsonIgnore
    public String getDeploySysOrgSectorId() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSORGSECTORID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysOrgSectorIdDirty() {
        return this._contains(DTOFIELD_DEPLOYSYSORGSECTORID);
    }

    @JsonIgnore
    public void resetDeploySysOrgSectorId() {
        this._reset(DTOFIELD_DEPLOYSYSORGSECTORID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysysorgsectorid(String deploySysOrgSectorId) {
        this.setDeploySysOrgSectorId(deploySysOrgSectorId);
        return this;
    }

    @JsonProperty(value="deploysystag")
    public void setDeploySysTag(String deploySysTag) {
        this._set(DTOFIELD_DEPLOYSYSTAG, deploySysTag);
    }

    @JsonIgnore
    public String getDeploySysTag() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysTagDirty() {
        return this._contains(DTOFIELD_DEPLOYSYSTAG);
    }

    @JsonIgnore
    public void resetDeploySysTag() {
        this._reset(DTOFIELD_DEPLOYSYSTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysystag(String deploySysTag) {
        this.setDeploySysTag(deploySysTag);
        return this;
    }

    @JsonProperty(value="deploysystag2")
    public void setDeploySysTag2(String deploySysTag2) {
        this._set(DTOFIELD_DEPLOYSYSTAG2, deploySysTag2);
    }

    @JsonIgnore
    public String getDeploySysTag2() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysTag2Dirty() {
        return this._contains(DTOFIELD_DEPLOYSYSTAG2);
    }

    @JsonIgnore
    public void resetDeploySysTag2() {
        this._reset(DTOFIELD_DEPLOYSYSTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysystag2(String deploySysTag2) {
        this.setDeploySysTag2(deploySysTag2);
        return this;
    }

    @JsonProperty(value="deploysystype")
    public void setDeploySysType(String deploySysType) {
        this._set(DTOFIELD_DEPLOYSYSTYPE, deploySysType);
    }

    @JsonIgnore
    public String getDeploySysType() {
        Object objValue = this._get(DTOFIELD_DEPLOYSYSTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDeploySysTypeDirty() {
        return this._contains(DTOFIELD_DEPLOYSYSTYPE);
    }

    @JsonIgnore
    public void resetDeploySysType() {
        this._reset(DTOFIELD_DEPLOYSYSTYPE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysystype(String deploySysType) {
        this.setDeploySysType(deploySysType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO deploysystype(PSModelEnums.DeploySysType deploySysType) {
        this.setDeploySysType(deploySysType == null ? null : deploySysType.value);
        return this;
    }

    @JsonProperty(value="devresinfo")
    public void setDevResInfo(String devResInfo) {
        this._set(DTOFIELD_DEVRESINFO, devResInfo);
    }

    @JsonIgnore
    public String getDevResInfo() {
        Object objValue = this._get(DTOFIELD_DEVRESINFO);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDevResInfoDirty() {
        return this._contains(DTOFIELD_DEVRESINFO);
    }

    @JsonIgnore
    public void resetDevResInfo() {
        this._reset(DTOFIELD_DEVRESINFO);
    }

    @JsonIgnore
    public PSDevSlnSysDTO devresinfo(String devResInfo) {
        this.setDevResInfo(devResInfo);
        return this;
    }

    @JsonProperty(value="devresstate")
    public void setDevResState(Integer devResState) {
        this._set(DTOFIELD_DEVRESSTATE, devResState);
    }

    @JsonIgnore
    public Integer getDevResState() {
        Object objValue = this._get(DTOFIELD_DEVRESSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDevResStateDirty() {
        return this._contains(DTOFIELD_DEVRESSTATE);
    }

    @JsonIgnore
    public void resetDevResState() {
        this._reset(DTOFIELD_DEVRESSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO devresstate(Integer devResState) {
        this.setDevResState(devResState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO devresstate(PSModelEnums.DCResState devResState) {
        this.setDevResState(devResState == null ? null : devResState.value);
        return this;
    }

    @JsonProperty(value="devsysstate")
    public void setDevSysState(Integer devSysState) {
        this._set(DTOFIELD_DEVSYSSTATE, devSysState);
    }

    @JsonIgnore
    public Integer getDevSysState() {
        Object objValue = this._get(DTOFIELD_DEVSYSSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDevSysStateDirty() {
        return this._contains(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public void resetDevSysState() {
        this._reset(DTOFIELD_DEVSYSSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO devsysstate(Integer devSysState) {
        this.setDevSysState(devSysState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO devsysstate(PSModelEnums.DevSysState devSysState) {
        this.setDevSysState(devSysState == null ? null : devSysState.value);
        return this;
    }

    @JsonProperty(value="docgitbranch")
    public void setDocGitBranch(String docGitBranch) {
        this._set(DTOFIELD_DOCGITBRANCH, docGitBranch);
    }

    @JsonIgnore
    public String getDocGitBranch() {
        Object objValue = this._get(DTOFIELD_DOCGITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocGitBranchDirty() {
        return this._contains(DTOFIELD_DOCGITBRANCH);
    }

    @JsonIgnore
    public void resetDocGitBranch() {
        this._reset(DTOFIELD_DOCGITBRANCH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO docgitbranch(String docGitBranch) {
        this.setDocGitBranch(docGitBranch);
        return this;
    }

    @JsonProperty(value="docgitpath")
    public void setDocGitPath(String docGitPath) {
        this._set(DTOFIELD_DOCGITPATH, docGitPath);
    }

    @JsonIgnore
    public String getDocGitPath() {
        Object objValue = this._get(DTOFIELD_DOCGITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocGitPathDirty() {
        return this._contains(DTOFIELD_DOCGITPATH);
    }

    @JsonIgnore
    public void resetDocGitPath() {
        this._reset(DTOFIELD_DOCGITPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO docgitpath(String docGitPath) {
        this.setDocGitPath(docGitPath);
        return this;
    }

    @JsonProperty(value="docpsdevcentersvnid")
    public void setDocPSDevCenterSVNId(String docPSDevCenterSVNId) {
        this._set(DTOFIELD_DOCPSDEVCENTERSVNID, docPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getDocPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_DOCPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_DOCPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetDocPSDevCenterSVNId() {
        this._reset(DTOFIELD_DOCPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO docpsdevcentersvnid(String docPSDevCenterSVNId) {
        this.setDocPSDevCenterSVNId(docPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO docpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setDocGitBranch(null);
            this.setDocGitPath(null);
            this.setDocPSDevCenterSVNId(null);
            this.setDocPSDevCenterSVNName(null);
        } else {
            this.setDocGitBranch(pSDevCenterSVN.getGitBranch());
            this.setDocGitPath(pSDevCenterSVN.getGitPath());
            this.setDocPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setDocPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="docpsdevcentersvnname")
    public void setDocPSDevCenterSVNName(String docPSDevCenterSVNName) {
        this._set(DTOFIELD_DOCPSDEVCENTERSVNNAME, docPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getDocPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_DOCPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDocPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_DOCPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetDocPSDevCenterSVNName() {
        this._reset(DTOFIELD_DOCPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO docpsdevcentersvnname(String docPSDevCenterSVNName) {
        this.setDocPSDevCenterSVNName(docPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="enablecallback")
    public void setEnableCallback(Integer enableCallback) {
        this._set(DTOFIELD_ENABLECALLBACK, enableCallback);
    }

    @JsonIgnore
    public Integer getEnableCallback() {
        Object objValue = this._get(DTOFIELD_ENABLECALLBACK);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCallbackDirty() {
        return this._contains(DTOFIELD_ENABLECALLBACK);
    }

    @JsonIgnore
    public void resetEnableCallback() {
        this._reset(DTOFIELD_ENABLECALLBACK);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablecallback(Integer enableCallback) {
        this.setEnableCallback(enableCallback);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablecallback(Boolean enableCallback) {
        this.setEnableCallback(enableCallback == null ? null : (enableCallback ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enabledb2")
    public void setEnableDB2(Integer enableDB2) {
        this._set(DTOFIELD_ENABLEDB2, enableDB2);
    }

    @JsonIgnore
    public Integer getEnableDB2() {
        Object objValue = this._get(DTOFIELD_ENABLEDB2);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDB2Dirty() {
        return this._contains(DTOFIELD_ENABLEDB2);
    }

    @JsonIgnore
    public void resetEnableDB2() {
        this._reset(DTOFIELD_ENABLEDB2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledb2(Integer enableDB2) {
        this.setEnableDB2(enableDB2);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledb2(Boolean enableDB2) {
        this.setEnableDB2(enableDB2 == null ? null : (enableDB2 ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enabledeploycenter")
    public void setEnableDeployCenter(Integer enableDeployCenter) {
        this._set(DTOFIELD_ENABLEDEPLOYCENTER, enableDeployCenter);
    }

    @JsonIgnore
    public Integer getEnableDeployCenter() {
        Object objValue = this._get(DTOFIELD_ENABLEDEPLOYCENTER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDeployCenterDirty() {
        return this._contains(DTOFIELD_ENABLEDEPLOYCENTER);
    }

    @JsonIgnore
    public void resetEnableDeployCenter() {
        this._reset(DTOFIELD_ENABLEDEPLOYCENTER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledeploycenter(Integer enableDeployCenter) {
        this.setEnableDeployCenter(enableDeployCenter);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledeploycenter(Boolean enableDeployCenter) {
        this.setEnableDeployCenter(enableDeployCenter == null ? null : (enableDeployCenter ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enabledm")
    public void setEnableDM(Integer enableDM) {
        this._set(DTOFIELD_ENABLEDM, enableDM);
    }

    @JsonIgnore
    public Integer getEnableDM() {
        Object objValue = this._get(DTOFIELD_ENABLEDM);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDMDirty() {
        return this._contains(DTOFIELD_ENABLEDM);
    }

    @JsonIgnore
    public void resetEnableDM() {
        this._reset(DTOFIELD_ENABLEDM);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledm(Integer enableDM) {
        this.setEnableDM(enableDM);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledm(Boolean enableDM) {
        this.setEnableDM(enableDM == null ? null : (enableDM ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enabledynasys")
    public void setEnableDynaSys(Integer enableDynaSys) {
        this._set(DTOFIELD_ENABLEDYNASYS, enableDynaSys);
    }

    @JsonIgnore
    public Integer getEnableDynaSys() {
        Object objValue = this._get(DTOFIELD_ENABLEDYNASYS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableDynaSysDirty() {
        return this._contains(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public void resetEnableDynaSys() {
        this._reset(DTOFIELD_ENABLEDYNASYS);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledynasys(Integer enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enabledynasys(PSModelEnums.DynaSysType enableDynaSys) {
        this.setEnableDynaSys(enableDynaSys == null ? null : enableDynaSys.value);
        return this;
    }

    @JsonProperty(value="enablehana")
    public void setEnableHANA(Integer enableHANA) {
        this._set(DTOFIELD_ENABLEHANA, enableHANA);
    }

    @JsonIgnore
    public Integer getEnableHANA() {
        Object objValue = this._get(DTOFIELD_ENABLEHANA);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableHANADirty() {
        return this._contains(DTOFIELD_ENABLEHANA);
    }

    @JsonIgnore
    public void resetEnableHANA() {
        this._reset(DTOFIELD_ENABLEHANA);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablehana(Integer enableHANA) {
        this.setEnableHANA(enableHANA);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablehana(Boolean enableHANA) {
        this.setEnableHANA(enableHANA == null ? null : (enableHANA ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablehbase")
    public void setEnableHBase(Integer enableHBase) {
        this._set(DTOFIELD_ENABLEHBASE, enableHBase);
    }

    @JsonIgnore
    public Integer getEnableHBase() {
        Object objValue = this._get(DTOFIELD_ENABLEHBASE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableHBaseDirty() {
        return this._contains(DTOFIELD_ENABLEHBASE);
    }

    @JsonIgnore
    public void resetEnableHBase() {
        this._reset(DTOFIELD_ENABLEHBASE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablehbase(Integer enableHBase) {
        this.setEnableHBase(enableHBase);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablehbase(Boolean enableHBase) {
        this.setEnableHBase(enableHBase == null ? null : (enableHBase ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablemysql5")
    public void setEnableMySQL5(Integer enableMySQL5) {
        this._set(DTOFIELD_ENABLEMYSQL5, enableMySQL5);
    }

    @JsonIgnore
    public Integer getEnableMySQL5() {
        Object objValue = this._get(DTOFIELD_ENABLEMYSQL5);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableMySQL5Dirty() {
        return this._contains(DTOFIELD_ENABLEMYSQL5);
    }

    @JsonIgnore
    public void resetEnableMySQL5() {
        this._reset(DTOFIELD_ENABLEMYSQL5);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablemysql5(Integer enableMySQL5) {
        this.setEnableMySQL5(enableMySQL5);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablemysql5(Boolean enableMySQL5) {
        this.setEnableMySQL5(enableMySQL5 == null ? null : (enableMySQL5 ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enableoracle")
    public void setEnableOracle(Integer enableOracle) {
        this._set(DTOFIELD_ENABLEORACLE, enableOracle);
    }

    @JsonIgnore
    public Integer getEnableOracle() {
        Object objValue = this._get(DTOFIELD_ENABLEORACLE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableOracleDirty() {
        return this._contains(DTOFIELD_ENABLEORACLE);
    }

    @JsonIgnore
    public void resetEnableOracle() {
        this._reset(DTOFIELD_ENABLEORACLE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enableoracle(Integer enableOracle) {
        this.setEnableOracle(enableOracle);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enableoracle(Boolean enableOracle) {
        this.setEnableOracle(enableOracle == null ? null : (enableOracle ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablepgsql")
    public void setEnablePGSQL(Integer enablePGSQL) {
        this._set(DTOFIELD_ENABLEPGSQL, enablePGSQL);
    }

    @JsonIgnore
    public Integer getEnablePGSQL() {
        Object objValue = this._get(DTOFIELD_ENABLEPGSQL);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePGSQLDirty() {
        return this._contains(DTOFIELD_ENABLEPGSQL);
    }

    @JsonIgnore
    public void resetEnablePGSQL() {
        this._reset(DTOFIELD_ENABLEPGSQL);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablepgsql(Integer enablePGSQL) {
        this.setEnablePGSQL(enablePGSQL);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablepgsql(Boolean enablePGSQL) {
        this.setEnablePGSQL(enablePGSQL == null ? null : (enablePGSQL ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enableppas")
    public void setEnablePPAS(Integer enablePPAS) {
        this._set(DTOFIELD_ENABLEPPAS, enablePPAS);
    }

    @JsonIgnore
    public Integer getEnablePPAS() {
        Object objValue = this._get(DTOFIELD_ENABLEPPAS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePPASDirty() {
        return this._contains(DTOFIELD_ENABLEPPAS);
    }

    @JsonIgnore
    public void resetEnablePPAS() {
        this._reset(DTOFIELD_ENABLEPPAS);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enableppas(Integer enablePPAS) {
        this.setEnablePPAS(enablePPAS);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enableppas(Boolean enablePPAS) {
        this.setEnablePPAS(enablePPAS == null ? null : (enablePPAS ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablesqlite")
    public void setEnableSQLite(Integer enableSQLite) {
        this._set(DTOFIELD_ENABLESQLITE, enableSQLite);
    }

    @JsonIgnore
    public Integer getEnableSQLite() {
        Object objValue = this._get(DTOFIELD_ENABLESQLITE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSQLiteDirty() {
        return this._contains(DTOFIELD_ENABLESQLITE);
    }

    @JsonIgnore
    public void resetEnableSQLite() {
        this._reset(DTOFIELD_ENABLESQLITE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablesqlite(Integer enableSQLite) {
        this.setEnableSQLite(enableSQLite);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablesqlite(Boolean enableSQLite) {
        this.setEnableSQLite(enableSQLite == null ? null : (enableSQLite ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablesqlserver")
    public void setEnableSqlServer(Integer enableSqlServer) {
        this._set(DTOFIELD_ENABLESQLSERVER, enableSqlServer);
    }

    @JsonIgnore
    public Integer getEnableSqlServer() {
        Object objValue = this._get(DTOFIELD_ENABLESQLSERVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSqlServerDirty() {
        return this._contains(DTOFIELD_ENABLESQLSERVER);
    }

    @JsonIgnore
    public void resetEnableSqlServer() {
        this._reset(DTOFIELD_ENABLESQLSERVER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablesqlserver(Integer enableSqlServer) {
        this.setEnableSqlServer(enableSqlServer);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablesqlserver(Boolean enableSqlServer) {
        this.setEnableSqlServer(enableSqlServer == null ? null : (enableSqlServer ? 1 : 0));
        return this;
    }

    @JsonProperty(value="enablewsserver")
    public void setEnableWSServer(Integer enableWSServer) {
        this._set(DTOFIELD_ENABLEWSSERVER, enableWSServer);
    }

    @JsonIgnore
    public Integer getEnableWSServer() {
        Object objValue = this._get(DTOFIELD_ENABLEWSSERVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableWSServerDirty() {
        return this._contains(DTOFIELD_ENABLEWSSERVER);
    }

    @JsonIgnore
    public void resetEnableWSServer() {
        this._reset(DTOFIELD_ENABLEWSSERVER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablewsserver(Integer enableWSServer) {
        this.setEnableWSServer(enableWSServer);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO enablewsserver(Boolean enableWSServer) {
        this.setEnableWSServer(enableWSServer == null ? null : (enableWSServer ? 1 : 0));
        return this;
    }

    @JsonProperty(value="entitycnt")
    public void setEntityCnt(Integer entityCnt) {
        this._set(DTOFIELD_ENTITYCNT, entityCnt);
    }

    @JsonIgnore
    public Integer getEntityCnt() {
        Object objValue = this._get(DTOFIELD_ENTITYCNT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEntityCntDirty() {
        return this._contains(DTOFIELD_ENTITYCNT);
    }

    @JsonIgnore
    public void resetEntityCnt() {
        this._reset(DTOFIELD_ENTITYCNT);
    }

    @JsonIgnore
    public PSDevSlnSysDTO entitycnt(Integer entityCnt) {
        this.setEntityCnt(entityCnt);
        return this;
    }

    @JsonProperty(value="expriedtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpriedTime(Timestamp expriedTime) {
        this._set(DTOFIELD_EXPRIEDTIME, expriedTime);
    }

    @JsonIgnore
    public Timestamp getExpriedTime() {
        Object objValue = this._get(DTOFIELD_EXPRIEDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpriedTimeDirty() {
        return this._contains(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public void resetExpriedTime() {
        this._reset(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="gitbranch")
    public void setGitBranch(String gitBranch) {
        this._set(DTOFIELD_GITBRANCH, gitBranch);
    }

    @JsonIgnore
    public String getGitBranch() {
        Object objValue = this._get(DTOFIELD_GITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGitBranchDirty() {
        return this._contains(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public void resetGitBranch() {
        this._reset(DTOFIELD_GITBRANCH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO gitbranch(String gitBranch) {
        this.setGitBranch(gitBranch);
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
    public PSDevSlnSysDTO gitpath(String gitPath) {
        this.setGitPath(gitPath);
        return this;
    }

    @JsonProperty(value="hbasepsdcbdinstid")
    public void setHBasePSDCBDInstId(String hBasePSDCBDInstId) {
        this._set(DTOFIELD_HBASEPSDCBDINSTID, hBasePSDCBDInstId);
    }

    @JsonIgnore
    public String getHBasePSDCBDInstId() {
        Object objValue = this._get(DTOFIELD_HBASEPSDCBDINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHBasePSDCBDInstIdDirty() {
        return this._contains(DTOFIELD_HBASEPSDCBDINSTID);
    }

    @JsonIgnore
    public void resetHBasePSDCBDInstId() {
        this._reset(DTOFIELD_HBASEPSDCBDINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO hbasepsdcbdinstid(String hBasePSDCBDInstId) {
        this.setHBasePSDCBDInstId(hBasePSDCBDInstId);
        return this;
    }

    @JsonProperty(value="hbasepsdcbdinstname")
    public void setHBasePSDCBDInstName(String hBasePSDCBDInstName) {
        this._set(DTOFIELD_HBASEPSDCBDINSTNAME, hBasePSDCBDInstName);
    }

    @JsonIgnore
    public String getHBasePSDCBDInstName() {
        Object objValue = this._get(DTOFIELD_HBASEPSDCBDINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHBasePSDCBDInstNameDirty() {
        return this._contains(DTOFIELD_HBASEPSDCBDINSTNAME);
    }

    @JsonIgnore
    public void resetHBasePSDCBDInstName() {
        this._reset(DTOFIELD_HBASEPSDCBDINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO hbasepsdcbdinstname(String hBasePSDCBDInstName) {
        this.setHBasePSDCBDInstName(hBasePSDCBDInstName);
        return this;
    }

    @JsonProperty(value="initparams")
    public void setInitParams(String initParams) {
        this._set(DTOFIELD_INITPARAMS, initParams);
    }

    @JsonIgnore
    public String getInitParams() {
        Object objValue = this._get(DTOFIELD_INITPARAMS);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInitParamsDirty() {
        return this._contains(DTOFIELD_INITPARAMS);
    }

    @JsonIgnore
    public void resetInitParams() {
        this._reset(DTOFIELD_INITPARAMS);
    }

    @JsonIgnore
    public PSDevSlnSysDTO initparams(String initParams) {
        this.setInitParams(initParams);
        return this;
    }

    @JsonProperty(value="jitpsdbdevinstid")
    public void setJITPSDBDevInstId(String jITPSDBDevInstId) {
        this._set(DTOFIELD_JITPSDBDEVINSTID, jITPSDBDevInstId);
    }

    @JsonIgnore
    public String getJITPSDBDevInstId() {
        Object objValue = this._get(DTOFIELD_JITPSDBDEVINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJITPSDBDevInstIdDirty() {
        return this._contains(DTOFIELD_JITPSDBDEVINSTID);
    }

    @JsonIgnore
    public void resetJITPSDBDevInstId() {
        this._reset(DTOFIELD_JITPSDBDEVINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO jitpsdbdevinstid(String jITPSDBDevInstId) {
        this.setJITPSDBDevInstId(jITPSDBDevInstId);
        return this;
    }

    @JsonProperty(value="jitpsdbdevinstname")
    public void setJITPSDBDevInstName(String jITPSDBDevInstName) {
        this._set(DTOFIELD_JITPSDBDEVINSTNAME, jITPSDBDevInstName);
    }

    @JsonIgnore
    public String getJITPSDBDevInstName() {
        Object objValue = this._get(DTOFIELD_JITPSDBDEVINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJITPSDBDevInstNameDirty() {
        return this._contains(DTOFIELD_JITPSDBDEVINSTNAME);
    }

    @JsonIgnore
    public void resetJITPSDBDevInstName() {
        this._reset(DTOFIELD_JITPSDBDEVINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO jitpsdbdevinstname(String jITPSDBDevInstName) {
        this.setJITPSDBDevInstName(jITPSDBDevInstName);
        return this;
    }

    @JsonProperty(value="jitpsdevcentertsid")
    public void setJITPSDevCenterTSId(String jITPSDevCenterTSId) {
        this._set(DTOFIELD_JITPSDEVCENTERTSID, jITPSDevCenterTSId);
    }

    @JsonIgnore
    public String getJITPSDevCenterTSId() {
        Object objValue = this._get(DTOFIELD_JITPSDEVCENTERTSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJITPSDevCenterTSIdDirty() {
        return this._contains(DTOFIELD_JITPSDEVCENTERTSID);
    }

    @JsonIgnore
    public void resetJITPSDevCenterTSId() {
        this._reset(DTOFIELD_JITPSDEVCENTERTSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO jitpsdevcentertsid(String jITPSDevCenterTSId) {
        this.setJITPSDevCenterTSId(jITPSDevCenterTSId);
        return this;
    }

    @JsonProperty(value="jitpsdevcentertsname")
    public void setJITPSDevCenterTSName(String jITPSDevCenterTSName) {
        this._set(DTOFIELD_JITPSDEVCENTERTSNAME, jITPSDevCenterTSName);
    }

    @JsonIgnore
    public String getJITPSDevCenterTSName() {
        Object objValue = this._get(DTOFIELD_JITPSDEVCENTERTSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJITPSDevCenterTSNameDirty() {
        return this._contains(DTOFIELD_JITPSDEVCENTERTSNAME);
    }

    @JsonIgnore
    public void resetJITPSDevCenterTSName() {
        this._reset(DTOFIELD_JITPSDEVCENTERTSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO jitpsdevcentertsname(String jITPSDevCenterTSName) {
        this.setJITPSDevCenterTSName(jITPSDevCenterTSName);
        return this;
    }

    @JsonProperty(value="lastactivetime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastActiveTime(Timestamp lastActiveTime) {
        this._set(DTOFIELD_LASTACTIVETIME, lastActiveTime);
    }

    @JsonIgnore
    public Timestamp getLastActiveTime() {
        Object objValue = this._get(DTOFIELD_LASTACTIVETIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastActiveTimeDirty() {
        return this._contains(DTOFIELD_LASTACTIVETIME);
    }

    @JsonIgnore
    public void resetLastActiveTime() {
        this._reset(DTOFIELD_LASTACTIVETIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO lastactivetime(Timestamp lastActiveTime) {
        this.setLastActiveTime(lastActiveTime);
        return this;
    }

    @JsonProperty(value="loadtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLoadTime(Timestamp loadTime) {
        this._set(DTOFIELD_LOADTIME, loadTime);
    }

    @JsonIgnore
    public Timestamp getLoadTime() {
        Object objValue = this._get(DTOFIELD_LOADTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLoadTimeDirty() {
        return this._contains(DTOFIELD_LOADTIME);
    }

    @JsonIgnore
    public void resetLoadTime() {
        this._reset(DTOFIELD_LOADTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO loadtime(Timestamp loadTime) {
        this.setLoadTime(loadTime);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO logicname(String logicName) {
        this.setLogicName(logicName);
        return this;
    }

    @JsonProperty(value="lowcodemode")
    public void setLowCodeMode(Integer lowCodeMode) {
        this._set(DTOFIELD_LOWCODEMODE, lowCodeMode);
    }

    @JsonIgnore
    public Integer getLowCodeMode() {
        Object objValue = this._get(DTOFIELD_LOWCODEMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLowCodeModeDirty() {
        return this._contains(DTOFIELD_LOWCODEMODE);
    }

    @JsonIgnore
    public void resetLowCodeMode() {
        this._reset(DTOFIELD_LOWCODEMODE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO lowcodemode(Integer lowCodeMode) {
        this.setLowCodeMode(lowCodeMode);
        return this;
    }

    @JsonProperty(value="mainpsdevslnsysid")
    public void setMainPSDevSlnSysId(String mainPSDevSlnSysId) {
        this._set(DTOFIELD_MAINPSDEVSLNSYSID, mainPSDevSlnSysId);
    }

    @JsonIgnore
    public String getMainPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_MAINPSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_MAINPSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetMainPSDevSlnSysId() {
        this._reset(DTOFIELD_MAINPSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mainpsdevslnsysid(String mainPSDevSlnSysId) {
        this.setMainPSDevSlnSysId(mainPSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO mainpsdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setMainPSDevSlnSysId(null);
            this.setMainPSDevSlnSysName(null);
        } else {
            this.setMainPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setMainPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="mainpsdevslnsysname")
    public void setMainPSDevSlnSysName(String mainPSDevSlnSysName) {
        this._set(DTOFIELD_MAINPSDEVSLNSYSNAME, mainPSDevSlnSysName);
    }

    @JsonIgnore
    public String getMainPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_MAINPSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMainPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_MAINPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetMainPSDevSlnSysName() {
        this._reset(DTOFIELD_MAINPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mainpsdevslnsysname(String mainPSDevSlnSysName) {
        this.setMainPSDevSlnSysName(mainPSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="maxentitycnt")
    public void setMaxEntityCnt(Integer maxEntityCnt) {
        this._set(DTOFIELD_MAXENTITYCNT, maxEntityCnt);
    }

    @JsonIgnore
    public Integer getMaxEntityCnt() {
        Object objValue = this._get(DTOFIELD_MAXENTITYCNT);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMaxEntityCntDirty() {
        return this._contains(DTOFIELD_MAXENTITYCNT);
    }

    @JsonIgnore
    public void resetMaxEntityCnt() {
        this._reset(DTOFIELD_MAXENTITYCNT);
    }

    @JsonIgnore
    public PSDevSlnSysDTO maxentitycnt(Integer maxEntityCnt) {
        this.setMaxEntityCnt(maxEntityCnt);
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
    public PSDevSlnSysDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelgitbranch")
    public void setModelGitBranch(String modelGitBranch) {
        this._set(DTOFIELD_MODELGITBRANCH, modelGitBranch);
    }

    @JsonIgnore
    public String getModelGitBranch() {
        Object objValue = this._get(DTOFIELD_MODELGITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelGitBranchDirty() {
        return this._contains(DTOFIELD_MODELGITBRANCH);
    }

    @JsonIgnore
    public void resetModelGitBranch() {
        this._reset(DTOFIELD_MODELGITBRANCH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelgitbranch(String modelGitBranch) {
        this.setModelGitBranch(modelGitBranch);
        return this;
    }

    @JsonProperty(value="modelgitpath")
    public void setModelGitPath(String modelGitPath) {
        this._set(DTOFIELD_MODELGITPATH, modelGitPath);
    }

    @JsonIgnore
    public String getModelGitPath() {
        Object objValue = this._get(DTOFIELD_MODELGITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelGitPathDirty() {
        return this._contains(DTOFIELD_MODELGITPATH);
    }

    @JsonIgnore
    public void resetModelGitPath() {
        this._reset(DTOFIELD_MODELGITPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelgitpath(String modelGitPath) {
        this.setModelGitPath(modelGitPath);
        return this;
    }

    @JsonProperty(value="modelinstver")
    public void setModelInstVer(Integer modelInstVer) {
        this._set(DTOFIELD_MODELINSTVER, modelInstVer);
    }

    @JsonIgnore
    public Integer getModelInstVer() {
        Object objValue = this._get(DTOFIELD_MODELINSTVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isModelInstVerDirty() {
        return this._contains(DTOFIELD_MODELINSTVER);
    }

    @JsonIgnore
    public void resetModelInstVer() {
        this._reset(DTOFIELD_MODELINSTVER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelinstver(Integer modelInstVer) {
        this.setModelInstVer(modelInstVer);
        return this;
    }

    @JsonProperty(value="modelprefix")
    public void setModelPrefix(String modelPrefix) {
        this._set(DTOFIELD_MODELPREFIX, modelPrefix);
    }

    @JsonIgnore
    public String getModelPrefix() {
        Object objValue = this._get(DTOFIELD_MODELPREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPrefixDirty() {
        return this._contains(DTOFIELD_MODELPREFIX);
    }

    @JsonIgnore
    public void resetModelPrefix() {
        this._reset(DTOFIELD_MODELPREFIX);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelprefix(String modelPrefix) {
        this.setModelPrefix(modelPrefix);
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnid")
    public void setModelPSDevCenterSVNId(String modelPSDevCenterSVNId) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNID, modelPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNId() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnid(String modelPSDevCenterSVNId) {
        this.setModelPSDevCenterSVNId(modelPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setModelGitBranch(null);
            this.setModelGitPath(null);
            this.setModelPSDevCenterSVNId(null);
            this.setModelPSDevCenterSVNName(null);
        } else {
            this.setModelGitBranch(pSDevCenterSVN.getGitBranch());
            this.setModelGitPath(pSDevCenterSVN.getGitPath());
            this.setModelPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setModelPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnname")
    public void setModelPSDevCenterSVNName(String modelPSDevCenterSVNName) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNNAME, modelPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNName() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO modelpsdevcentersvnname(String modelPSDevCenterSVNName) {
        this.setModelPSDevCenterSVNName(modelPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="mssqlpsdcdbinstid")
    public void setMSSQLPSDCDBInstId(String mSSQLPSDCDBInstId) {
        this._set(DTOFIELD_MSSQLPSDCDBINSTID, mSSQLPSDCDBInstId);
    }

    @JsonIgnore
    public String getMSSQLPSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_MSSQLPSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSSQLPSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_MSSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public void resetMSSQLPSDCDBInstId() {
        this._reset(DTOFIELD_MSSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mssqlpsdcdbinstid(String mSSQLPSDCDBInstId) {
        this.setMSSQLPSDCDBInstId(mSSQLPSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO mssqlpsdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setMSSQLPSDCDBInstId(null);
            this.setMSSQLPSDCDBInstName(null);
        } else {
            this.setMSSQLPSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setMSSQLPSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="mssqlpsdcdbinstname")
    public void setMSSQLPSDCDBInstName(String mSSQLPSDCDBInstName) {
        this._set(DTOFIELD_MSSQLPSDCDBINSTNAME, mSSQLPSDCDBInstName);
    }

    @JsonIgnore
    public String getMSSQLPSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_MSSQLPSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMSSQLPSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_MSSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetMSSQLPSDCDBInstName() {
        this._reset(DTOFIELD_MSSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mssqlpsdcdbinstname(String mSSQLPSDCDBInstName) {
        this.setMSSQLPSDCDBInstName(mSSQLPSDCDBInstName);
        return this;
    }

    @JsonProperty(value="mysqlpsdcdbinstid")
    public void setMySQLPSDCDBInstId(String mySQLPSDCDBInstId) {
        this._set(DTOFIELD_MYSQLPSDCDBINSTID, mySQLPSDCDBInstId);
    }

    @JsonIgnore
    public String getMySQLPSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_MYSQLPSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMySQLPSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_MYSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public void resetMySQLPSDCDBInstId() {
        this._reset(DTOFIELD_MYSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mysqlpsdcdbinstid(String mySQLPSDCDBInstId) {
        this.setMySQLPSDCDBInstId(mySQLPSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO mysqlpsdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setMySQLPSDCDBInstId(null);
            this.setMySQLPSDCDBInstName(null);
        } else {
            this.setMySQLPSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setMySQLPSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="mysqlpsdcdbinstname")
    public void setMySQLPSDCDBInstName(String mySQLPSDCDBInstName) {
        this._set(DTOFIELD_MYSQLPSDCDBINSTNAME, mySQLPSDCDBInstName);
    }

    @JsonIgnore
    public String getMySQLPSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_MYSQLPSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMySQLPSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_MYSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetMySQLPSDCDBInstName() {
        this._reset(DTOFIELD_MYSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO mysqlpsdcdbinstname(String mySQLPSDCDBInstName) {
        this.setMySQLPSDCDBInstName(mySQLPSDCDBInstName);
        return this;
    }

    @JsonProperty(value="offlinetime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setOfflineTime(Timestamp offlineTime) {
        this._set(DTOFIELD_OFFLINETIME, offlineTime);
    }

    @JsonIgnore
    public Timestamp getOfflineTime() {
        Object objValue = this._get(DTOFIELD_OFFLINETIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isOfflineTimeDirty() {
        return this._contains(DTOFIELD_OFFLINETIME);
    }

    @JsonIgnore
    public void resetOfflineTime() {
        this._reset(DTOFIELD_OFFLINETIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO offlinetime(Timestamp offlineTime) {
        this.setOfflineTime(offlineTime);
        return this;
    }

    @JsonProperty(value="orapsdcdbinstid")
    public void setOraPSDCDBInstId(String oraPSDCDBInstId) {
        this._set(DTOFIELD_ORAPSDCDBINSTID, oraPSDCDBInstId);
    }

    @JsonIgnore
    public String getOraPSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_ORAPSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOraPSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_ORAPSDCDBINSTID);
    }

    @JsonIgnore
    public void resetOraPSDCDBInstId() {
        this._reset(DTOFIELD_ORAPSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO orapsdcdbinstid(String oraPSDCDBInstId) {
        this.setOraPSDCDBInstId(oraPSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO orapsdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setOraPSDCDBInstId(null);
            this.setOraPSDCDBInstName(null);
        } else {
            this.setOraPSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setOraPSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="orapsdcdbinstname")
    public void setOraPSDCDBInstName(String oraPSDCDBInstName) {
        this._set(DTOFIELD_ORAPSDCDBINSTNAME, oraPSDCDBInstName);
    }

    @JsonIgnore
    public String getOraPSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_ORAPSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOraPSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_ORAPSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetOraPSDCDBInstName() {
        this._reset(DTOFIELD_ORAPSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO orapsdcdbinstname(String oraPSDCDBInstName) {
        this.setOraPSDCDBInstName(oraPSDCDBInstName);
        return this;
    }

    @JsonProperty(value="pgsqlpsdcdbinstid")
    public void setPGSQLPSDCDBInstId(String pGSQLPSDCDBInstId) {
        this._set(DTOFIELD_PGSQLPSDCDBINSTID, pGSQLPSDCDBInstId);
    }

    @JsonIgnore
    public String getPGSQLPSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_PGSQLPSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPGSQLPSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_PGSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public void resetPGSQLPSDCDBInstId() {
        this._reset(DTOFIELD_PGSQLPSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pgsqlpsdcdbinstid(String pGSQLPSDCDBInstId) {
        this.setPGSQLPSDCDBInstId(pGSQLPSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO pgsqlpsdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPGSQLPSDCDBInstId(null);
            this.setPGSQLPSDCDBInstName(null);
        } else {
            this.setPGSQLPSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPGSQLPSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="pgsqlpsdcdbinstname")
    public void setPGSQLPSDCDBInstName(String pGSQLPSDCDBInstName) {
        this._set(DTOFIELD_PGSQLPSDCDBINSTNAME, pGSQLPSDCDBInstName);
    }

    @JsonIgnore
    public String getPGSQLPSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_PGSQLPSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPGSQLPSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_PGSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetPGSQLPSDCDBInstName() {
        this._reset(DTOFIELD_PGSQLPSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pgsqlpsdcdbinstname(String pGSQLPSDCDBInstName) {
        this.setPGSQLPSDCDBInstName(pGSQLPSDCDBInstName);
        return this;
    }

    @JsonProperty(value="ppaspsdcdbinstid")
    public void setPPASPSDCDBInstId(String pPASPSDCDBInstId) {
        this._set(DTOFIELD_PPASPSDCDBINSTID, pPASPSDCDBInstId);
    }

    @JsonIgnore
    public String getPPASPSDCDBInstId() {
        Object objValue = this._get(DTOFIELD_PPASPSDCDBINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPASPSDCDBInstIdDirty() {
        return this._contains(DTOFIELD_PPASPSDCDBINSTID);
    }

    @JsonIgnore
    public void resetPPASPSDCDBInstId() {
        this._reset(DTOFIELD_PPASPSDCDBINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppaspsdcdbinstid(String pPASPSDCDBInstId) {
        this.setPPASPSDCDBInstId(pPASPSDCDBInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppaspsdcdbinstid(PSDevCenterDBInstDTO pSDevCenterDBInst) {
        if (pSDevCenterDBInst == null) {
            this.setPPASPSDCDBInstId(null);
            this.setPPASPSDCDBInstName(null);
        } else {
            this.setPPASPSDCDBInstId(pSDevCenterDBInst.getPSDevCenterDBInstId());
            this.setPPASPSDCDBInstName(pSDevCenterDBInst.getPSDevCenterDBInstName());
        }
        return this;
    }

    @JsonProperty(value="ppaspsdcdbinstname")
    public void setPPASPSDCDBInstName(String pPASPSDCDBInstName) {
        this._set(DTOFIELD_PPASPSDCDBINSTNAME, pPASPSDCDBInstName);
    }

    @JsonIgnore
    public String getPPASPSDCDBInstName() {
        Object objValue = this._get(DTOFIELD_PPASPSDCDBINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPASPSDCDBInstNameDirty() {
        return this._contains(DTOFIELD_PPASPSDCDBINSTNAME);
    }

    @JsonIgnore
    public void resetPPASPSDCDBInstName() {
        this._reset(DTOFIELD_PPASPSDCDBINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppaspsdcdbinstname(String pPASPSDCDBInstName) {
        this.setPPASPSDCDBInstName(pPASPSDCDBInstName);
        return this;
    }

    @JsonProperty(value="ppsdevslnsysid")
    public void setPPSDevSlnSysId(String pPSDevSlnSysId) {
        this._set(DTOFIELD_PPSDEVSLNSYSID, pPSDevSlnSysId);
    }

    @JsonIgnore
    public String getPPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPPSDevSlnSysId() {
        this._reset(DTOFIELD_PPSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppsdevslnsysid(String pPSDevSlnSysId) {
        this.setPPSDevSlnSysId(pPSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppsdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPPSDevSlnSysId(null);
            this.setPPSDevSlnSysName(null);
        } else {
            this.setPPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="ppsdevslnsysname")
    public void setPPSDevSlnSysName(String pPSDevSlnSysName) {
        this._set(DTOFIELD_PPSDEVSLNSYSNAME, pPSDevSlnSysName);
    }

    @JsonIgnore
    public String getPPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPPSDevSlnSysName() {
        this._reset(DTOFIELD_PPSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ppsdevslnsysname(String pPSDevSlnSysName) {
        this.setPPSDevSlnSysName(pPSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdcdeploycenterid")
    public void setPSDCDeployCenterId(String pSDCDeployCenterId) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERID, pSDCDeployCenterId);
    }

    @JsonIgnore
    public String getPSDCDeployCenterId() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterIdDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterId() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcdeploycenterid(String pSDCDeployCenterId) {
        this.setPSDCDeployCenterId(pSDCDeployCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcdeploycenterid(PSDCDeployCenterDTO pSDCDeployCenter) {
        if (pSDCDeployCenter == null) {
            this.setPSDCDeployCenterId(null);
            this.setPSDCDeployCenterName(null);
        } else {
            this.setPSDCDeployCenterId(pSDCDeployCenter.getPSDCDeployCenterId());
            this.setPSDCDeployCenterName(pSDCDeployCenter.getPSDCDeployCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdcdeploycentername")
    public void setPSDCDeployCenterName(String pSDCDeployCenterName) {
        this._set(DTOFIELD_PSDCDEPLOYCENTERNAME, pSDCDeployCenterName);
    }

    @JsonIgnore
    public String getPSDCDeployCenterName() {
        Object objValue = this._get(DTOFIELD_PSDCDEPLOYCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCDeployCenterNameDirty() {
        return this._contains(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDCDeployCenterName() {
        this._reset(DTOFIELD_PSDCDEPLOYCENTERNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcdeploycentername(String pSDCDeployCenterName) {
        this.setPSDCDeployCenterName(pSDCDeployCenterName);
        return this;
    }

    @JsonProperty(value="psdcmodeltemplid")
    public void setPSDCModelTemplId(String pSDCModelTemplId) {
        this._set(DTOFIELD_PSDCMODELTEMPLID, pSDCModelTemplId);
    }

    @JsonIgnore
    public String getPSDCModelTemplId() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplIdDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public void resetPSDCModelTemplId() {
        this._reset(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcmodeltemplid(String pSDCModelTemplId) {
        this.setPSDCModelTemplId(pSDCModelTemplId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcmodeltemplid(PSDCModelTemplDTO pSDCModelTempl) {
        if (pSDCModelTempl == null) {
            this.setPSDCModelTemplId(null);
            this.setPSDCModelTemplName(null);
        } else {
            this.setPSDCModelTemplId(pSDCModelTempl.getPSDCModelTemplId());
            this.setPSDCModelTemplName(pSDCModelTempl.getPSDCModelTemplName());
        }
        return this;
    }

    @JsonProperty(value="psdcmodeltemplname")
    public void setPSDCModelTemplName(String pSDCModelTemplName) {
        this._set(DTOFIELD_PSDCMODELTEMPLNAME, pSDCModelTemplName);
    }

    @JsonIgnore
    public String getPSDCModelTemplName() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplNameDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDCModelTemplName() {
        this._reset(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcmodeltemplname(String pSDCModelTemplName) {
        this.setPSDCModelTemplName(pSDCModelTemplName);
        return this;
    }

    @JsonProperty(value="psdcrobotid")
    public void setPSDCRobotId(String pSDCRobotId) {
        this._set(DTOFIELD_PSDCROBOTID, pSDCRobotId);
    }

    @JsonIgnore
    public String getPSDCRobotId() {
        Object objValue = this._get(DTOFIELD_PSDCROBOTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRobotIdDirty() {
        return this._contains(DTOFIELD_PSDCROBOTID);
    }

    @JsonIgnore
    public void resetPSDCRobotId() {
        this._reset(DTOFIELD_PSDCROBOTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcrobotid(String pSDCRobotId) {
        this.setPSDCRobotId(pSDCRobotId);
        return this;
    }

    @JsonProperty(value="psdcrobotname")
    public void setPSDCRobotName(String pSDCRobotName) {
        this._set(DTOFIELD_PSDCROBOTNAME, pSDCRobotName);
    }

    @JsonIgnore
    public String getPSDCRobotName() {
        Object objValue = this._get(DTOFIELD_PSDCROBOTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCRobotNameDirty() {
        return this._contains(DTOFIELD_PSDCROBOTNAME);
    }

    @JsonIgnore
    public void resetPSDCRobotName() {
        this._reset(DTOFIELD_PSDCROBOTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcrobotname(String pSDCRobotName) {
        this.setPSDCRobotName(pSDCRobotName);
        return this;
    }

    @JsonProperty(value="psdcsyslicid")
    public void setPSDCSysLicId(String pSDCSysLicId) {
        this._set(DTOFIELD_PSDCSYSLICID, pSDCSysLicId);
    }

    @JsonIgnore
    public String getPSDCSysLicId() {
        Object objValue = this._get(DTOFIELD_PSDCSYSLICID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCSysLicIdDirty() {
        return this._contains(DTOFIELD_PSDCSYSLICID);
    }

    @JsonIgnore
    public void resetPSDCSysLicId() {
        this._reset(DTOFIELD_PSDCSYSLICID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcsyslicid(String pSDCSysLicId) {
        this.setPSDCSysLicId(pSDCSysLicId);
        return this;
    }

    @JsonProperty(value="psdcsyslicname")
    public void setPSDCSysLicName(String pSDCSysLicName) {
        this._set(DTOFIELD_PSDCSYSLICNAME, pSDCSysLicName);
    }

    @JsonIgnore
    public String getPSDCSysLicName() {
        Object objValue = this._get(DTOFIELD_PSDCSYSLICNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCSysLicNameDirty() {
        return this._contains(DTOFIELD_PSDCSYSLICNAME);
    }

    @JsonIgnore
    public void resetPSDCSysLicName() {
        this._reset(DTOFIELD_PSDCSYSLICNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcsyslicname(String pSDCSysLicName) {
        this.setPSDCSysLicName(pSDCSysLicName);
        return this;
    }

    @JsonProperty(value="psdcworkspaceid")
    public void setPSDCWorkspaceId(String pSDCWorkspaceId) {
        this._set(DTOFIELD_PSDCWORKSPACEID, pSDCWorkspaceId);
    }

    @JsonIgnore
    public String getPSDCWorkspaceId() {
        Object objValue = this._get(DTOFIELD_PSDCWORKSPACEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCWorkspaceIdDirty() {
        return this._contains(DTOFIELD_PSDCWORKSPACEID);
    }

    @JsonIgnore
    public void resetPSDCWorkspaceId() {
        this._reset(DTOFIELD_PSDCWORKSPACEID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdcworkspaceid(String pSDCWorkspaceId) {
        this.setPSDCWorkspaceId(pSDCWorkspaceId);
        return this;
    }

    @JsonProperty(value="psdevcenterasid")
    public void setPSDevCenterASId(String pSDevCenterASId) {
        this._set(DTOFIELD_PSDEVCENTERASID, pSDevCenterASId);
    }

    @JsonIgnore
    public String getPSDevCenterASId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASID);
    }

    @JsonIgnore
    public void resetPSDevCenterASId() {
        this._reset(DTOFIELD_PSDEVCENTERASID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterasid(String pSDevCenterASId) {
        this.setPSDevCenterASId(pSDevCenterASId);
        return this;
    }

    @JsonProperty(value="psdevcenterasid2")
    public void setPSDevCenterASId2(String pSDevCenterASId2) {
        this._set(DTOFIELD_PSDEVCENTERASID2, pSDevCenterASId2);
    }

    @JsonIgnore
    public String getPSDevCenterASId2() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASID2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASId2Dirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASID2);
    }

    @JsonIgnore
    public void resetPSDevCenterASId2() {
        this._reset(DTOFIELD_PSDEVCENTERASID2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterasid2(String pSDevCenterASId2) {
        this.setPSDevCenterASId2(pSDevCenterASId2);
        return this;
    }

    @JsonProperty(value="psdevcenteras3id")
    public void setPSDevCenterAS3Id(String pSDevCenterAS3Id) {
        this._set(DTOFIELD_PSDEVCENTERAS3ID, pSDevCenterAS3Id);
        this._set(FIELD_PSDEVCENTERAS3ID, pSDevCenterAS3Id);
    }

    @JsonIgnore
    public String getPSDevCenterAS3Id() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERAS3ID);
        if (objValue == null) objValue = this._get(FIELD_PSDEVCENTERAS3ID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterAS3IdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERAS3ID) || this._contains(FIELD_PSDEVCENTERAS3ID);
    }

    @JsonIgnore
    public void resetPSDevCenterAS3Id() {
        this._reset(DTOFIELD_PSDEVCENTERAS3ID);
        this._reset(FIELD_PSDEVCENTERAS3ID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenteras3id(String pSDevCenterAS3Id) {
        this.setPSDevCenterAS3Id(pSDevCenterAS3Id);
        return this;
    }

    @JsonProperty(value="psdevcenteras4id")
    public void setPSDevCenterAS4Id(String pSDevCenterAS4Id) {
        this._set(DTOFIELD_PSDEVCENTERAS4ID, pSDevCenterAS4Id);
        this._set(FIELD_PSDEVCENTERAS4ID, pSDevCenterAS4Id);
    }

    @JsonIgnore
    public String getPSDevCenterAS4Id() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERAS4ID);
        if (objValue == null) objValue = this._get(FIELD_PSDEVCENTERAS4ID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterAS4IdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERAS4ID) || this._contains(FIELD_PSDEVCENTERAS4ID);
    }

    @JsonIgnore
    public void resetPSDevCenterAS4Id() {
        this._reset(DTOFIELD_PSDEVCENTERAS4ID);
        this._reset(FIELD_PSDEVCENTERAS4ID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenteras4id(String pSDevCenterAS4Id) {
        this.setPSDevCenterAS4Id(pSDevCenterAS4Id);
        return this;
    }

    @JsonProperty(value="psdevcenterasname")
    public void setPSDevCenterASName(String pSDevCenterASName) {
        this._set(DTOFIELD_PSDEVCENTERASNAME, pSDevCenterASName);
    }

    @JsonIgnore
    public String getPSDevCenterASName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterASName() {
        this._reset(DTOFIELD_PSDEVCENTERASNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterasname(String pSDevCenterASName) {
        this.setPSDevCenterASName(pSDevCenterASName);
        return this;
    }

    @JsonProperty(value="psdevcenterasname2")
    public void setPSDevCenterASName2(String pSDevCenterASName2) {
        this._set(DTOFIELD_PSDEVCENTERASNAME2, pSDevCenterASName2);
    }

    @JsonIgnore
    public String getPSDevCenterASName2() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERASNAME2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterASName2Dirty() {
        return this._contains(DTOFIELD_PSDEVCENTERASNAME2);
    }

    @JsonIgnore
    public void resetPSDevCenterASName2() {
        this._reset(DTOFIELD_PSDEVCENTERASNAME2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenterasname2(String pSDevCenterASName2) {
        this.setPSDevCenterASName2(pSDevCenterASName2);
        return this;
    }

    @JsonProperty(value="psdevcenteras3name")
    public void setPSDevCenterAS3Name(String pSDevCenterAS3Name) {
        this._set(DTOFIELD_PSDEVCENTERAS3NAME, pSDevCenterAS3Name);
        this._set(FIELD_PSDEVCENTERAS3NAME, pSDevCenterAS3Name);
    }

    @JsonIgnore
    public String getPSDevCenterAS3Name() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERAS3NAME);
        if (objValue == null) objValue = this._get(FIELD_PSDEVCENTERAS3NAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterAS3NameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERAS3NAME) || this._contains(FIELD_PSDEVCENTERAS3NAME);
    }

    @JsonIgnore
    public void resetPSDevCenterAS3Name() {
        this._reset(DTOFIELD_PSDEVCENTERAS3NAME);
        this._reset(FIELD_PSDEVCENTERAS3NAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenteras3name(String pSDevCenterAS3Name) {
        this.setPSDevCenterAS3Name(pSDevCenterAS3Name);
        return this;
    }

    @JsonProperty(value="psdevcenteras4name")
    public void setPSDevCenterAS4Name(String pSDevCenterAS4Name) {
        this._set(DTOFIELD_PSDEVCENTERAS4NAME, pSDevCenterAS4Name);
        this._set(FIELD_PSDEVCENTERAS4NAME, pSDevCenterAS4Name);
    }

    @JsonIgnore
    public String getPSDevCenterAS4Name() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERAS4NAME);
        if (objValue == null) objValue = this._get(FIELD_PSDEVCENTERAS4NAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterAS4NameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERAS4NAME) || this._contains(FIELD_PSDEVCENTERAS4NAME);
    }

    @JsonIgnore
    public void resetPSDevCenterAS4Name() {
        this._reset(DTOFIELD_PSDEVCENTERAS4NAME);
        this._reset(FIELD_PSDEVCENTERAS4NAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcenteras4name(String pSDevCenterAS4Name) {
        this.setPSDevCenterAS4Name(pSDevCenterAS4Name);
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
    public PSDevSlnSysDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
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
    public PSDevSlnSysDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevcentersvnid")
    public void setPSDevCenterSVNId(String pSDevCenterSVNId) {
        this._set(DTOFIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }

    @JsonIgnore
    public String getPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNId() {
        this._reset(DTOFIELD_PSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnid(String pSDevCenterSVNId) {
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setGitBranch(null);
            this.setGitPath(null);
            this.setPSDevCenterSVNId(null);
            this.setPSDevCenterSVNName(null);
        } else {
            this.setGitBranch(pSDevCenterSVN.getGitBranch());
            this.setGitPath(pSDevCenterSVN.getGitPath());
            this.setPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentersvnname")
    public void setPSDevCenterSVNName(String pSDevCenterSVNName) {
        this._set(DTOFIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }

    @JsonIgnore
    public String getPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterSVNName() {
        this._reset(DTOFIELD_PSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcentersvnname(String pSDevCenterSVNName) {
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="psdevcentertsid")
    public void setPSDevCenterTSId(String pSDevCenterTSId) {
        this._set(DTOFIELD_PSDEVCENTERTSID, pSDevCenterTSId);
    }

    @JsonIgnore
    public String getPSDevCenterTSId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERTSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterTSIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERTSID);
    }

    @JsonIgnore
    public void resetPSDevCenterTSId() {
        this._reset(DTOFIELD_PSDEVCENTERTSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcentertsid(String pSDevCenterTSId) {
        this.setPSDevCenterTSId(pSDevCenterTSId);
        return this;
    }

    @JsonProperty(value="psdevcentertsname")
    public void setPSDevCenterTSName(String pSDevCenterTSName) {
        this._set(DTOFIELD_PSDEVCENTERTSNAME, pSDevCenterTSName);
    }

    @JsonIgnore
    public String getPSDevCenterTSName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERTSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterTSNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERTSNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterTSName() {
        this._reset(DTOFIELD_PSDEVCENTERTSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevcentertsname(String pSDevCenterTSName) {
        this.setPSDevCenterTSName(pSDevCenterTSName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevCenterId(pSDevSln.getPSDevCenterId());
            this.setPSDevCenterName(pSDevSln.getPSDevCenterName());
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="psdevslnsysresid")
    public void setPSDevSlnSysResId(String pSDevSlnSysResId) {
        this._set(DTOFIELD_PSDEVSLNSYSRESID, pSDevSlnSysResId);
    }

    @JsonIgnore
    public String getPSDevSlnSysResId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSRESID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysResIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSRESID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysResId() {
        this._reset(DTOFIELD_PSDEVSLNSYSRESID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysresid(String pSDevSlnSysResId) {
        this.setPSDevSlnSysResId(pSDevSlnSysResId);
        return this;
    }

    @JsonProperty(value="psdevslnsysresname")
    public void setPSDevSlnSysResName(String pSDevSlnSysResName) {
        this._set(DTOFIELD_PSDEVSLNSYSRESNAME, pSDevSlnSysResName);
    }

    @JsonIgnore
    public String getPSDevSlnSysResName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSRESNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysResNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSRESNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysResName() {
        this._reset(DTOFIELD_PSDEVSLNSYSRESNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psdevslnsysresname(String pSDevSlnSysResName) {
        this.setPSDevSlnSysResName(pSDevSlnSysResName);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="psstudiothemeid")
    public void setPSStudioThemeId(String pSStudioThemeId) {
        this._set(DTOFIELD_PSSTUDIOTHEMEID, pSStudioThemeId);
    }

    @JsonIgnore
    public String getPSStudioThemeId() {
        Object objValue = this._get(DTOFIELD_PSSTUDIOTHEMEID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSStudioThemeIdDirty() {
        return this._contains(DTOFIELD_PSSTUDIOTHEMEID);
    }

    @JsonIgnore
    public void resetPSStudioThemeId() {
        this._reset(DTOFIELD_PSSTUDIOTHEMEID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psstudiothemeid(String pSStudioThemeId) {
        this.setPSStudioThemeId(pSStudioThemeId);
        return this;
    }

    @JsonProperty(value="psstudiothemename")
    public void setPSStudioThemeName(String pSStudioThemeName) {
        this._set(DTOFIELD_PSSTUDIOTHEMENAME, pSStudioThemeName);
    }

    @JsonIgnore
    public String getPSStudioThemeName() {
        Object objValue = this._get(DTOFIELD_PSSTUDIOTHEMENAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSStudioThemeNameDirty() {
        return this._contains(DTOFIELD_PSSTUDIOTHEMENAME);
    }

    @JsonIgnore
    public void resetPSStudioThemeName() {
        this._reset(DTOFIELD_PSSTUDIOTHEMENAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO psstudiothemename(String pSStudioThemeName) {
        this.setPSStudioThemeName(pSStudioThemeName);
        return this;
    }

    @JsonProperty(value="pssysmodelinstid")
    public void setPSSysModelInstId(String pSSysModelInstId) {
        this._set(DTOFIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }

    @JsonIgnore
    public String getPSSysModelInstId() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstIdDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public void resetPSSysModelInstId() {
        this._reset(DTOFIELD_PSSYSMODELINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssysmodelinstid(String pSSysModelInstId) {
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssysmodelinstid(PSSysModelInstDTO pSSysModelInst) {
        if (pSSysModelInst == null) {
            this.setModelInstVer(null);
            this.setPSSysModelInstId(null);
            this.setPSSysModelInstName(null);
            this.setSysRowKey(null);
        } else {
            this.setModelInstVer(pSSysModelInst.getModelVer());
            this.setPSSysModelInstId(pSSysModelInst.getPSSysModelInstId());
            this.setPSSysModelInstName(pSSysModelInst.getPSSysModelInstName());
            this.setSysRowKey(pSSysModelInst.getSysRowKey());
        }
        return this;
    }

    @JsonProperty(value="pssysmodelinstname")
    public void setPSSysModelInstName(String pSSysModelInstName) {
        this._set(DTOFIELD_PSSYSMODELINSTNAME, pSSysModelInstName);
    }

    @JsonIgnore
    public String getPSSysModelInstName() {
        Object objValue = this._get(DTOFIELD_PSSYSMODELINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysModelInstNameDirty() {
        return this._contains(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public void resetPSSysModelInstName() {
        this._reset(DTOFIELD_PSSYSMODELINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssysmodelinstname(String pSSysModelInstName) {
        this.setPSSysModelInstName(pSSysModelInstName);
        return this;
    }

    @JsonProperty(value="pssyspolicyid")
    public void setPSSysPolicyId(String pSSysPolicyId) {
        this._set(DTOFIELD_PSSYSPOLICYID, pSSysPolicyId);
    }

    @JsonIgnore
    public String getPSSysPolicyId() {
        Object objValue = this._get(DTOFIELD_PSSYSPOLICYID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPolicyIdDirty() {
        return this._contains(DTOFIELD_PSSYSPOLICYID);
    }

    @JsonIgnore
    public void resetPSSysPolicyId() {
        this._reset(DTOFIELD_PSSYSPOLICYID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssyspolicyid(String pSSysPolicyId) {
        this.setPSSysPolicyId(pSSysPolicyId);
        return this;
    }

    @JsonProperty(value="pssyspolicyname")
    public void setPSSysPolicyName(String pSSysPolicyName) {
        this._set(DTOFIELD_PSSYSPOLICYNAME, pSSysPolicyName);
    }

    @JsonIgnore
    public String getPSSysPolicyName() {
        Object objValue = this._get(DTOFIELD_PSSYSPOLICYNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPolicyNameDirty() {
        return this._contains(DTOFIELD_PSSYSPOLICYNAME);
    }

    @JsonIgnore
    public void resetPSSysPolicyName() {
        this._reset(DTOFIELD_PSSYSPOLICYNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssyspolicyname(String pSSysPolicyName) {
        this.setPSSysPolicyName(pSSysPolicyName);
        return this;
    }

    @JsonProperty(value="pssystemid")
    public void setPSSystemId(String pSSystemId) {
        this._set(DTOFIELD_PSSYSTEMID, pSSystemId);
    }

    @JsonIgnore
    public String getPSSystemId() {
        Object objValue = this._get(DTOFIELD_PSSYSTEMID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSystemIdDirty() {
        return this._contains(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public void resetPSSystemId() {
        this._reset(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pssystemid(String pSSystemId) {
        this.setPSSystemId(pSSystemId);
        return this;
    }

    @JsonProperty(value="pstaskserverid")
    public void setPSTaskServerId(String pSTaskServerId) {
        this._set(DTOFIELD_PSTASKSERVERID, pSTaskServerId);
    }

    @JsonIgnore
    public String getPSTaskServerId() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTaskServerIdDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public void resetPSTaskServerId() {
        this._reset(DTOFIELD_PSTASKSERVERID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pstaskserverid(String pSTaskServerId) {
        this.setPSTaskServerId(pSTaskServerId);
        return this;
    }

    @JsonProperty(value="pstaskservername")
    public void setPSTaskServerName(String pSTaskServerName) {
        this._set(DTOFIELD_PSTASKSERVERNAME, pSTaskServerName);
    }

    @JsonIgnore
    public String getPSTaskServerName() {
        Object objValue = this._get(DTOFIELD_PSTASKSERVERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSTaskServerNameDirty() {
        return this._contains(DTOFIELD_PSTASKSERVERNAME);
    }

    @JsonIgnore
    public void resetPSTaskServerName() {
        this._reset(DTOFIELD_PSTASKSERVERNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pstaskservername(String pSTaskServerName) {
        this.setPSTaskServerName(pSTaskServerName);
        return this;
    }

    @JsonProperty(value="pubcode")
    public void setPubCode(Integer pubCode) {
        this._set(DTOFIELD_PUBCODE, pubCode);
    }

    @JsonIgnore
    public Integer getPubCode() {
        Object objValue = this._get(DTOFIELD_PUBCODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubCodeDirty() {
        return this._contains(DTOFIELD_PUBCODE);
    }

    @JsonIgnore
    public void resetPubCode() {
        this._reset(DTOFIELD_PUBCODE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO pubcode(Integer pubCode) {
        this.setPubCode(pubCode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO pubcode(Boolean pubCode) {
        this.setPubCode(pubCode == null ? null : (pubCode ? 1 : 0));
        return this;
    }

    @JsonProperty(value="resreadytime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setResReadyTime(Timestamp resReadyTime) {
        this._set(DTOFIELD_RESREADYTIME, resReadyTime);
    }

    @JsonIgnore
    public Timestamp getResReadyTime() {
        Object objValue = this._get(DTOFIELD_RESREADYTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isResReadyTimeDirty() {
        return this._contains(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public void resetResReadyTime() {
        this._reset(DTOFIELD_RESREADYTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO resreadytime(Timestamp resReadyTime) {
        this.setResReadyTime(resReadyTime);
        return this;
    }

    @JsonProperty(value="rogitbranch")
    public void setROGitBranch(String rOGitBranch) {
        this._set(DTOFIELD_ROGITBRANCH, rOGitBranch);
    }

    @JsonIgnore
    public String getROGitBranch() {
        Object objValue = this._get(DTOFIELD_ROGITBRANCH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROGitBranchDirty() {
        return this._contains(DTOFIELD_ROGITBRANCH);
    }

    @JsonIgnore
    public void resetROGitBranch() {
        this._reset(DTOFIELD_ROGITBRANCH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO rogitbranch(String rOGitBranch) {
        this.setROGitBranch(rOGitBranch);
        return this;
    }

    @JsonProperty(value="rogitpath")
    public void setROGitPath(String rOGitPath) {
        this._set(DTOFIELD_ROGITPATH, rOGitPath);
    }

    @JsonIgnore
    public String getROGitPath() {
        Object objValue = this._get(DTOFIELD_ROGITPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROGitPathDirty() {
        return this._contains(DTOFIELD_ROGITPATH);
    }

    @JsonIgnore
    public void resetROGitPath() {
        this._reset(DTOFIELD_ROGITPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDTO rogitpath(String rOGitPath) {
        this.setROGitPath(rOGitPath);
        return this;
    }

    @JsonProperty(value="ropsdevcentersvnid")
    public void setROPSDevCenterSvnId(String rOPSDevCenterSvnId) {
        this._set(DTOFIELD_ROPSDEVCENTERSVNID, rOPSDevCenterSvnId);
    }

    @JsonIgnore
    public String getROPSDevCenterSvnId() {
        Object objValue = this._get(DTOFIELD_ROPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROPSDevCenterSvnIdDirty() {
        return this._contains(DTOFIELD_ROPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetROPSDevCenterSvnId() {
        this._reset(DTOFIELD_ROPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnid(String rOPSDevCenterSvnId) {
        this.setROPSDevCenterSvnId(rOPSDevCenterSvnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setROGitBranch(null);
            this.setROGitPath(null);
            this.setROPSDevCenterSvnId(null);
            this.setROPSDevCenterSvnName(null);
        } else {
            this.setROGitBranch(pSDevCenterSVN.getGitBranch());
            this.setROGitPath(pSDevCenterSVN.getGitPath());
            this.setROPSDevCenterSvnId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setROPSDevCenterSvnName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="ropsdevcentersvnname")
    public void setROPSDevCenterSvnName(String rOPSDevCenterSvnName) {
        this._set(DTOFIELD_ROPSDEVCENTERSVNNAME, rOPSDevCenterSvnName);
    }

    @JsonIgnore
    public String getROPSDevCenterSvnName() {
        Object objValue = this._get(DTOFIELD_ROPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isROPSDevCenterSvnNameDirty() {
        return this._contains(DTOFIELD_ROPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetROPSDevCenterSvnName() {
        this._reset(DTOFIELD_ROPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO ropsdevcentersvnname(String rOPSDevCenterSvnName) {
        this.setROPSDevCenterSvnName(rOPSDevCenterSvnName);
        return this;
    }

    @JsonProperty(value="rtmodelpsdevcentersvnid")
    public void setRTModelPSDevCenterSVNId(String rTModelPSDevCenterSVNId) {
        this._set(DTOFIELD_RTMODELPSDEVCENTERSVNID, rTModelPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getRTModelPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_RTMODELPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTModelPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_RTMODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetRTModelPSDevCenterSVNId() {
        this._reset(DTOFIELD_RTMODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO rtmodelpsdevcentersvnid(String rTModelPSDevCenterSVNId) {
        this.setRTModelPSDevCenterSVNId(rTModelPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO rtmodelpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setRTModelPSDevCenterSVNId(null);
            this.setRTModelPSDevCenterSVNName(null);
        } else {
            this.setRTModelPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setRTModelPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="rtmodelpsdevcentersvnname")
    public void setRTModelPSDevCenterSVNName(String rTModelPSDevCenterSVNName) {
        this._set(DTOFIELD_RTMODELPSDEVCENTERSVNNAME, rTModelPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getRTModelPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_RTMODELPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTModelPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_RTMODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetRTModelPSDevCenterSVNName() {
        this._reset(DTOFIELD_RTMODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO rtmodelpsdevcentersvnname(String rTModelPSDevCenterSVNName) {
        this.setRTModelPSDevCenterSVNName(rTModelPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="saasmode")
    public void setSaaSMode(Integer saaSMode) {
        this._set(DTOFIELD_SAASMODE, saaSMode);
    }

    @JsonIgnore
    public Integer getSaaSMode() {
        Object objValue = this._get(DTOFIELD_SAASMODE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSaaSModeDirty() {
        return this._contains(DTOFIELD_SAASMODE);
    }

    @JsonIgnore
    public void resetSaaSMode() {
        this._reset(DTOFIELD_SAASMODE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO saasmode(Integer saaSMode) {
        this.setSaaSMode(saaSMode);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO saasmode(PSModelEnums.DESaaSMode saaSMode) {
        this.setSaaSMode(saaSMode == null ? null : saaSMode.value);
        return this;
    }

    @JsonProperty(value="sfpssubsysid")
    public void setSFPSSubSysId(String sFPSSubSysId) {
        this._set(DTOFIELD_SFPSSUBSYSID, sFPSSubSysId);
    }

    @JsonIgnore
    public String getSFPSSubSysId() {
        Object objValue = this._get(DTOFIELD_SFPSSUBSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSFPSSubSysIdDirty() {
        return this._contains(DTOFIELD_SFPSSUBSYSID);
    }

    @JsonIgnore
    public void resetSFPSSubSysId() {
        this._reset(DTOFIELD_SFPSSUBSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sfpssubsysid(String sFPSSubSysId) {
        this.setSFPSSubSysId(sFPSSubSysId);
        return this;
    }

    @JsonProperty(value="sfpssubsysname")
    public void setSFPSSubSysName(String sFPSSubSysName) {
        this._set(DTOFIELD_SFPSSUBSYSNAME, sFPSSubSysName);
    }

    @JsonIgnore
    public String getSFPSSubSysName() {
        Object objValue = this._get(DTOFIELD_SFPSSUBSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSFPSSubSysNameDirty() {
        return this._contains(DTOFIELD_SFPSSUBSYSNAME);
    }

    @JsonIgnore
    public void resetSFPSSubSysName() {
        this._reset(DTOFIELD_SFPSSUBSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sfpssubsysname(String sFPSSubSysName) {
        this.setSFPSSubSysName(sFPSSubSysName);
        return this;
    }

    @JsonProperty(value="shareflag")
    public void setShareFlag(Integer shareFlag) {
        this._set(DTOFIELD_SHAREFLAG, shareFlag);
    }

    @JsonIgnore
    public Integer getShareFlag() {
        Object objValue = this._get(DTOFIELD_SHAREFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isShareFlagDirty() {
        return this._contains(DTOFIELD_SHAREFLAG);
    }

    @JsonIgnore
    public void resetShareFlag() {
        this._reset(DTOFIELD_SHAREFLAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO shareflag(Integer shareFlag) {
        this.setShareFlag(shareFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO shareflag(Boolean shareFlag) {
        this.setShareFlag(shareFlag == null ? null : (shareFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="studiotag")
    public void setStudioTag(String studioTag) {
        this._set(DTOFIELD_STUDIOTAG, studioTag);
    }

    @JsonIgnore
    public String getStudioTag() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTagDirty() {
        return this._contains(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public void resetStudioTag() {
        this._reset(DTOFIELD_STUDIOTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO studiotag(String studioTag) {
        this.setStudioTag(studioTag);
        return this;
    }

    @JsonProperty(value="studiotag2")
    public void setStudioTag2(String studioTag2) {
        this._set(DTOFIELD_STUDIOTAG2, studioTag2);
    }

    @JsonIgnore
    public String getStudioTag2() {
        Object objValue = this._get(DTOFIELD_STUDIOTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStudioTag2Dirty() {
        return this._contains(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public void resetStudioTag2() {
        this._reset(DTOFIELD_STUDIOTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO studiotag2(String studioTag2) {
        this.setStudioTag2(studioTag2);
        return this;
    }

    @JsonProperty(value="sysfolder")
    public void setSysFolder(String sysFolder) {
        this._set(DTOFIELD_SYSFOLDER, sysFolder);
    }

    @JsonIgnore
    public String getSysFolder() {
        Object objValue = this._get(DTOFIELD_SYSFOLDER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysFolderDirty() {
        return this._contains(DTOFIELD_SYSFOLDER);
    }

    @JsonIgnore
    public void resetSysFolder() {
        this._reset(DTOFIELD_SYSFOLDER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sysfolder(String sysFolder) {
        this.setSysFolder(sysFolder);
        return this;
    }

    @JsonProperty(value="sysmdurl")
    public void setSysMDUrl(String sysMDUrl) {
        this._set(DTOFIELD_SYSMDURL, sysMDUrl);
    }

    @JsonIgnore
    public String getSysMDUrl() {
        Object objValue = this._get(DTOFIELD_SYSMDURL);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysMDUrlDirty() {
        return this._contains(DTOFIELD_SYSMDURL);
    }

    @JsonIgnore
    public void resetSysMDUrl() {
        this._reset(DTOFIELD_SYSMDURL);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sysmdurl(String sysMDUrl) {
        this.setSysMDUrl(sysMDUrl);
        return this;
    }

    @JsonProperty(value="sysrowkey")
    public void setSysRowKey(String sysRowKey) {
        this._set(DTOFIELD_SYSROWKEY, sysRowKey);
    }

    @JsonIgnore
    public String getSysRowKey() {
        Object objValue = this._get(DTOFIELD_SYSROWKEY);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysRowKeyDirty() {
        return this._contains(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public void resetSysRowKey() {
        this._reset(DTOFIELD_SYSROWKEY);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sysrowkey(String sysRowKey) {
        this.setSysRowKey(sysRowKey);
        return this;
    }

    @JsonProperty(value="systag")
    public void setSysTag(String sysTag) {
        this._set(DTOFIELD_SYSTAG, sysTag);
    }

    @JsonIgnore
    public String getSysTag() {
        Object objValue = this._get(DTOFIELD_SYSTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysTagDirty() {
        return this._contains(DTOFIELD_SYSTAG);
    }

    @JsonIgnore
    public void resetSysTag() {
        this._reset(DTOFIELD_SYSTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDTO systag(String sysTag) {
        this.setSysTag(sysTag);
        return this;
    }

    @JsonProperty(value="systag2")
    public void setSysTag2(String sysTag2) {
        this._set(DTOFIELD_SYSTAG2, sysTag2);
    }

    @JsonIgnore
    public String getSysTag2() {
        Object objValue = this._get(DTOFIELD_SYSTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysTag2Dirty() {
        return this._contains(DTOFIELD_SYSTAG2);
    }

    @JsonIgnore
    public void resetSysTag2() {
        this._reset(DTOFIELD_SYSTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysDTO systag2(String sysTag2) {
        this.setSysTag2(sysTag2);
        return this;
    }

    @JsonProperty(value="systag3")
    public void setSysTag3(String sysTag3) {
        this._set(DTOFIELD_SYSTAG3, sysTag3);
    }

    @JsonIgnore
    public String getSysTag3() {
        Object objValue = this._get(DTOFIELD_SYSTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysTag3Dirty() {
        return this._contains(DTOFIELD_SYSTAG3);
    }

    @JsonIgnore
    public void resetSysTag3() {
        this._reset(DTOFIELD_SYSTAG3);
    }

    @JsonIgnore
    public PSDevSlnSysDTO systag3(String sysTag3) {
        this.setSysTag3(sysTag3);
        return this;
    }

    @JsonProperty(value="systag4")
    public void setSysTag4(String sysTag4) {
        this._set(DTOFIELD_SYSTAG4, sysTag4);
    }

    @JsonIgnore
    public String getSysTag4() {
        Object objValue = this._get(DTOFIELD_SYSTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysTag4Dirty() {
        return this._contains(DTOFIELD_SYSTAG4);
    }

    @JsonIgnore
    public void resetSysTag4() {
        this._reset(DTOFIELD_SYSTAG4);
    }

    @JsonIgnore
    public PSDevSlnSysDTO systag4(String sysTag4) {
        this.setSysTag4(sysTag4);
        return this;
    }

    @JsonProperty(value="systype")
    public void setSysType(String sysType) {
        this._set(DTOFIELD_SYSTYPE, sysType);
    }

    @JsonIgnore
    public String getSysType() {
        Object objValue = this._get(DTOFIELD_SYSTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysTypeDirty() {
        return this._contains(DTOFIELD_SYSTYPE);
    }

    @JsonIgnore
    public void resetSysType() {
        this._reset(DTOFIELD_SYSTYPE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO systype(String sysType) {
        this.setSysType(sysType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO systype(PSModelEnums.DevSysType sysType) {
        this.setSysType(sysType == null ? null : sysType.value);
        return this;
    }

    @JsonProperty(value="sysver")
    public void setSysVer(String sysVer) {
        this._set(DTOFIELD_SYSVER, sysVer);
    }

    @JsonIgnore
    public String getSysVer() {
        Object objValue = this._get(DTOFIELD_SYSVER);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysVerDirty() {
        return this._contains(DTOFIELD_SYSVER);
    }

    @JsonIgnore
    public void resetSysVer() {
        this._reset(DTOFIELD_SYSVER);
    }

    @JsonIgnore
    public PSDevSlnSysDTO sysver(String sysVer) {
        this.setSysVer(sysVer);
        return this;
    }

    @JsonProperty(value="templengine")
    public void setTemplEngine(String templEngine) {
        this._set(DTOFIELD_TEMPLENGINE, templEngine);
    }

    @JsonIgnore
    public String getTemplEngine() {
        Object objValue = this._get(DTOFIELD_TEMPLENGINE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplEngineDirty() {
        return this._contains(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public void resetTemplEngine() {
        this._reset(DTOFIELD_TEMPLENGINE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO templengine(String templEngine) {
        this.setTemplEngine(templEngine);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO templengine(PSModelEnums.PSTemplEngine templEngine) {
        this.setTemplEngine(templEngine == null ? null : templEngine.value);
        return this;
    }

    @JsonProperty(value="themecssstyle")
    public void setThemeCssStyle(String themeCssStyle) {
        this._set(DTOFIELD_THEMECSSSTYLE, themeCssStyle);
    }

    @JsonIgnore
    public String getThemeCssStyle() {
        Object objValue = this._get(DTOFIELD_THEMECSSSTYLE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isThemeCssStyleDirty() {
        return this._contains(DTOFIELD_THEMECSSSTYLE);
    }

    @JsonIgnore
    public void resetThemeCssStyle() {
        this._reset(DTOFIELD_THEMECSSSTYLE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO themecssstyle(String themeCssStyle) {
        this.setThemeCssStyle(themeCssStyle);
        return this;
    }

    @JsonProperty(value="unloadtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setUnloadTime(Timestamp unloadTime) {
        this._set(DTOFIELD_UNLOADTIME, unloadTime);
    }

    @JsonIgnore
    public Timestamp getUnloadTime() {
        Object objValue = this._get(DTOFIELD_UNLOADTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isUnloadTimeDirty() {
        return this._contains(DTOFIELD_UNLOADTIME);
    }

    @JsonIgnore
    public void resetUnloadTime() {
        this._reset(DTOFIELD_UNLOADTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDTO unloadtime(Timestamp unloadTime) {
        this.setUnloadTime(unloadTime);
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
    public PSDevSlnSysDTO updatedate(Timestamp updateDate) {
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
    public PSDevSlnSysDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSDevSlnSysDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO usercat(PSModelEnums.ModelUserCat userCat) {
        this.setUserCat(userCat == null ? null : userCat.value);
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
    public PSDevSlnSysDTO usertag(String userTag) {
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
    public PSDevSlnSysDTO usertag2(String userTag2) {
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
    public PSDevSlnSysDTO usertag3(String userTag3) {
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
    public PSDevSlnSysDTO usertag4(String userTag4) {
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
    public PSDevSlnSysDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonProperty(value="vctype")
    public void setVCType(String vCType) {
        this._set(DTOFIELD_VCTYPE, vCType);
    }

    @JsonIgnore
    public String getVCType() {
        Object objValue = this._get(DTOFIELD_VCTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVCTypeDirty() {
        return this._contains(DTOFIELD_VCTYPE);
    }

    @JsonIgnore
    public void resetVCType() {
        this._reset(DTOFIELD_VCTYPE);
    }

    @JsonIgnore
    public PSDevSlnSysDTO vctype(String vCType) {
        this.setVCType(vCType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDTO vctype(PSModelEnums.DevSlnSysVCType vCType) {
        this.setVCType(vCType == null ? null : vCType.value);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysDTO name(String strName) {
        this.setPSDevSlnSysName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysDTO id(String strValue) {
        this.setPSDevSlnSysId(strValue);
        return this;
    }

}
