package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSACHandlerDTO
extends PSModelDTOBase {
    public static final String FIELD_CACHESCOPE = "CACHESCOPE";
    protected static final String DTOFIELD_CACHESCOPE = "cachescope";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_COPYPSDEACTIONID = "COPYPSDEACTIONID";
    protected static final String DTOFIELD_COPYPSDEACTIONID = "copypsdeactionid";
    public static final String FIELD_COPYPSDEACTIONNAME = "COPYPSDEACTIONNAME";
    protected static final String DTOFIELD_COPYPSDEACTIONNAME = "copypsdeactionname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATEPSDEACTIONID = "CREATEPSDEACTIONID";
    protected static final String DTOFIELD_CREATEPSDEACTIONID = "createpsdeactionid";
    public static final String FIELD_CREATEPSDEACTIONNAME = "CREATEPSDEACTIONNAME";
    protected static final String DTOFIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";
    public static final String FIELD_CREATEPSDEOPPRIVID = "CREATEPSDEOPPRIVID";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";
    public static final String FIELD_CREATEPSDEOPPRIVINAME = "CREATEPSDEOPPRIVINAME";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVINAME = "createpsdeoppriviname";
    public static final String FIELD_CREATETIMEOUT = "CREATETIMEOUT";
    protected static final String DTOFIELD_CREATETIMEOUT = "createtimeout";
    public static final String FIELD_CTRLTYPE = "CTRLTYPE";
    protected static final String DTOFIELD_CTRLTYPE = "ctrltype";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_ENABLECACHE = "ENABLECACHE";
    protected static final String DTOFIELD_ENABLECACHE = "enablecache";
    public static final String FIELD_ENABLEORGDR = "ENABLEORGDR";
    protected static final String DTOFIELD_ENABLEORGDR = "enableorgdr";
    public static final String FIELD_ENABLESECBC = "ENABLESECBC";
    protected static final String DTOFIELD_ENABLESECBC = "enablesecbc";
    public static final String FIELD_ENABLESECDR = "ENABLESECDR";
    protected static final String DTOFIELD_ENABLESECDR = "enablesecdr";
    public static final String FIELD_ENABLEUSERDR = "ENABLEUSERDR";
    protected static final String DTOFIELD_ENABLEUSERDR = "enableuserdr";
    public static final String FIELD_EXPORTPSDEOPPRIVID = "EXPORTPSDEOPPRIVID";
    protected static final String DTOFIELD_EXPORTPSDEOPPRIVID = "exportpsdeopprivid";
    public static final String FIELD_EXPORTPSDEOPPRIVNAME = "EXPORTPSDEOPPRIVINAME";
    protected static final String DTOFIELD_EXPORTPSDEOPPRIVNAME = "exportpsdeopprivname";
    public static final String FIELD_FETCHTIMEOUT = "FETCHTIMEOUT";
    protected static final String DTOFIELD_FETCHTIMEOUT = "fetchtimeout";
    public static final String FIELD_FINISHFLAG = "FINISHFLAG";
    protected static final String DTOFIELD_FINISHFLAG = "finishflag";
    public static final String FIELD_GETDRAFTPSDEACTIONID = "GETDRAFTPSDEACTIONID";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";
    public static final String FIELD_GETDRAFTPSDEACTIONNAME = "GETDRAFTPSDEACTIONNAME";
    protected static final String DTOFIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";
    public static final String FIELD_GETPSDEACTIONID = "GETPSDEACTIONID";
    protected static final String DTOFIELD_GETPSDEACTIONID = "getpsdeactionid";
    public static final String FIELD_GETPSDEACTIONNAME = "GETPSDEACTIONNAME";
    protected static final String DTOFIELD_GETPSDEACTIONNAME = "getpsdeactionname";
    public static final String FIELD_GETTIMEOUT = "GETTIMEOUT";
    protected static final String DTOFIELD_GETTIMEOUT = "gettimeout";
    public static final String FIELD_GROUPMOVEPSDEACTIONID = "GROUPMOVEPSDEACTIONID";
    protected static final String DTOFIELD_GROUPMOVEPSDEACTIONID = "groupmovepsdeactionid";
    public static final String FIELD_GROUPMOVEPSDEACTIONNAME = "GROUPMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_GROUPMOVEPSDEACTIONNAME = "groupmovepsdeactionname";
    public static final String FIELD_GROUPPSDEID = "GROUPPSDEID";
    protected static final String DTOFIELD_GROUPPSDEID = "grouppsdeid";
    public static final String FIELD_GROUPPSDENAME = "GROUPPSDENAME";
    protected static final String DTOFIELD_GROUPPSDENAME = "grouppsdename";
    public static final String FIELD_HANDLEROBJ = "HANDLEROBJ";
    protected static final String DTOFIELD_HANDLEROBJ = "handlerobj";
    public static final String FIELD_HANDLEROBJ2 = "HANDLEROBJ2";
    protected static final String DTOFIELD_HANDLEROBJ2 = "handlerobj2";
    public static final String FIELD_HANDLERPARAMS = "HANDLERPARAMS";
    protected static final String DTOFIELD_HANDLERPARAMS = "handlerparams";
    public static final String FIELD_HANDLERTAG = "HANDLERTAG";
    protected static final String DTOFIELD_HANDLERTAG = "handlertag";
    public static final String FIELD_HANDLERTAG2 = "HANDLERTAG2";
    protected static final String DTOFIELD_HANDLERTAG2 = "handlertag2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MOVEPSDEACTIONID = "MOVEPSDEACTIONID";
    protected static final String DTOFIELD_MOVEPSDEACTIONID = "movepsdeactionid";
    public static final String FIELD_MOVEPSDEACTIONNAME = "MOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";
    public static final String FIELD_ORGDR = "ORGDR";
    protected static final String DTOFIELD_ORGDR = "orgdr";
    public static final String FIELD_PSACHANDLERID = "PSACHANDLERID";
    protected static final String DTOFIELD_PSACHANDLERID = "psachandlerid";
    public static final String FIELD_PSACHANDLERNAME = "PSACHANDLERNAME";
    protected static final String DTOFIELD_PSACHANDLERNAME = "psachandlername";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSFACHANDLERID = "PSSFACHANDLERID";
    protected static final String DTOFIELD_PSSFACHANDLERID = "pssfachandlerid";
    public static final String FIELD_PSSFACHANDLERNAME = "PSSFACHANDLERNAME";
    protected static final String DTOFIELD_PSSFACHANDLERNAME = "pssfachandlername";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSREQITEMID = "PSSYSREQITEMID";
    protected static final String DTOFIELD_PSSYSREQITEMID = "pssysreqitemid";
    public static final String FIELD_PSSYSREQITEMNAME = "PSSYSREQITEMNAME";
    protected static final String DTOFIELD_PSSYSREQITEMNAME = "pssysreqitemname";
    public static final String FIELD_PSSYSUNISTATEID = "PSSYSUNISTATEID";
    protected static final String DTOFIELD_PSSYSUNISTATEID = "pssysunistateid";
    public static final String FIELD_PSSYSUNISTATENAME = "PSSYSUNISTATENAME";
    protected static final String DTOFIELD_PSSYSUNISTATENAME = "pssysunistatename";
    public static final String FIELD_PSSYSUSERDRID = "PSSYSUSERDRID";
    protected static final String DTOFIELD_PSSYSUSERDRID = "pssysuserdrid";
    public static final String FIELD_PSSYSUSERDRID2 = "PSSYSUSERDRID2";
    protected static final String DTOFIELD_PSSYSUSERDRID2 = "pssysuserdrid2";
    public static final String FIELD_PSSYSUSERDRNAME = "PSSYSUSERDRNAME";
    protected static final String DTOFIELD_PSSYSUSERDRNAME = "pssysuserdrname";
    public static final String FIELD_PSSYSUSERDRNAME2 = "PSSYSUSERDRNAME2";
    protected static final String DTOFIELD_PSSYSUSERDRNAME2 = "pssysuserdrname2";
    public static final String FIELD_READPSDEOPPRIVID = "READPSDEOPPRIVID";
    protected static final String DTOFIELD_READPSDEOPPRIVID = "readpsdeopprivid";
    public static final String FIELD_READPSDEOPPRIVNAME = "READPSDEOPPRIVNAME";
    protected static final String DTOFIELD_READPSDEOPPRIVNAME = "readpsdeopprivname";
    public static final String FIELD_REMOVEPSDEACTIONID = "REMOVEPSDEACTIONID";
    protected static final String DTOFIELD_REMOVEPSDEACTIONID = "removepsdeactionid";
    public static final String FIELD_REMOVEPSDEACTIONNAME = "REMOVEPSDEACTIONNAME";
    protected static final String DTOFIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";
    public static final String FIELD_REMOVEPSDEOPPRIVID = "REMOVEPSDEOPPRIVID";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";
    public static final String FIELD_REMOVEPSDEOPPRIVNAME = "REMOVEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";
    public static final String FIELD_REMOVETIMEOUT = "REMOVETIMEOUT";
    protected static final String DTOFIELD_REMOVETIMEOUT = "removetimeout";
    public static final String FIELD_SECBC = "SECBC";
    protected static final String DTOFIELD_SECBC = "secbc";
    public static final String FIELD_SECDR = "SECDR";
    protected static final String DTOFIELD_SECDR = "secdr";
    public static final String FIELD_SYSUSERDR2PARAM = "SYSUSERDR2PARAM";
    protected static final String DTOFIELD_SYSUSERDR2PARAM = "sysuserdr2param";
    public static final String FIELD_SYSUSERDRPARAM = "SYSUSERDRPARAM";
    protected static final String DTOFIELD_SYSUSERDRPARAM = "sysuserdrparam";
    public static final String FIELD_TEMPMODE = "TEMPMODE";
    protected static final String DTOFIELD_TEMPMODE = "tempmode";
    public static final String FIELD_UNISTATEFIELD = "UNISTATEFIELD";
    protected static final String DTOFIELD_UNISTATEFIELD = "unistatefield";
    public static final String FIELD_UNISTATEKEYVALUE = "UNISTATEKEYVALUE";
    protected static final String DTOFIELD_UNISTATEKEYVALUE = "unistatekeyvalue";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_UPDATEPSDEACTIONID = "UPDATEPSDEACTIONID";
    protected static final String DTOFIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";
    public static final String FIELD_UPDATEPSDEACTIONNAME = "UPDATEPSDEACTIONNAME";
    protected static final String DTOFIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";
    public static final String FIELD_UPDATEPSDEOPPRIVID = "UPDATEPSDEOPPRIVID";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";
    public static final String FIELD_UPDATEPSDEOPPRIVNAME = "UPDATEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";
    public static final String FIELD_UPDATETIMEOUT = "UPDATETIMEOUT";
    protected static final String DTOFIELD_UPDATETIMEOUT = "updatetimeout";
    public static final String FIELD_USER2PSDEACTIONID = "USER2PSDEACTIONID";
    protected static final String DTOFIELD_USER2PSDEACTIONID = "user2psdeactionid";
    public static final String FIELD_USER2PSDEACTIONNAME = "USER2PSDEACTIONNAME";
    protected static final String DTOFIELD_USER2PSDEACTIONNAME = "user2psdeactionname";
    public static final String FIELD_USER2PSDEOPPRIVID = "USER2PSDEOPPRIVID";
    protected static final String DTOFIELD_USER2PSDEOPPRIVID = "user2psdeopprivid";
    public static final String FIELD_USER2PSDEOPPRIVNAME = "USER2PSDEOPPRIVINAME";
    protected static final String DTOFIELD_USER2PSDEOPPRIVNAME = "user2psdeopprivname";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
    public static final String FIELD_USERPSDEACTIONID = "USERPSDEACTIONID";
    protected static final String DTOFIELD_USERPSDEACTIONID = "userpsdeactionid";
    public static final String FIELD_USERPSDEACTIONNAME = "USERPSDEACTIONNAME";
    protected static final String DTOFIELD_USERPSDEACTIONNAME = "userpsdeactionname";
    public static final String FIELD_USERPSDEOPPRIVID = "USERPSDEOPPRIVID";
    protected static final String DTOFIELD_USERPSDEOPPRIVID = "userpsdeopprivid";
    public static final String FIELD_USERPSDEOPPRIVNAME = "USERPSDEOPPRIVINAME";
    protected static final String DTOFIELD_USERPSDEOPPRIVNAME = "userpsdeopprivname";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="cachescope")
    public void setCacheScope(Integer cacheScope) {
        this._set(DTOFIELD_CACHESCOPE, cacheScope);
    }

    @JsonIgnore
    public Integer getCacheScope() {
        Object objValue = this._get(DTOFIELD_CACHESCOPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheScopeDirty() {
        return this._contains(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public void resetCacheScope() {
        this._reset(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public PSACHandlerDTO cachescope(Integer cacheScope) {
        this.setCacheScope(cacheScope);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO cachescope(PSModelEnums.CtrlHandlerCacheScope cacheScope) {
        if (cacheScope == null) {
            this.setCacheScope(null);
        } else {
            this.setCacheScope(cacheScope.value);
        }
        return this;
    }

    @JsonProperty(value="cachetimeout")
    public void setCacheTimeout(Integer cacheTimeout) {
        this._set(DTOFIELD_CACHETIMEOUT, cacheTimeout);
    }

    @JsonIgnore
    public Integer getCacheTimeout() {
        Object objValue = this._get(DTOFIELD_CACHETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheTimeoutDirty() {
        return this._contains(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public void resetCacheTimeout() {
        this._reset(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="copypsdeactionid")
    public void setCopyPSDEActionId(String copyPSDEActionId) {
        this._set(DTOFIELD_COPYPSDEACTIONID, copyPSDEActionId);
    }

    @JsonIgnore
    public String getCopyPSDEActionId() {
        Object objValue = this._get(DTOFIELD_COPYPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCopyPSDEActionIdDirty() {
        return this._contains(DTOFIELD_COPYPSDEACTIONID);
    }

    @JsonIgnore
    public void resetCopyPSDEActionId() {
        this._reset(DTOFIELD_COPYPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO copypsdeactionid(String copyPSDEActionId) {
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO copypsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setCopyPSDEActionId(null);
            this.setCopyPSDEActionName(null);
        } else {
            this.setCopyPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCopyPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="copypsdeactionname")
    public void setCopyPSDEActionName(String copyPSDEActionName) {
        this._set(DTOFIELD_COPYPSDEACTIONNAME, copyPSDEActionName);
    }

    @JsonIgnore
    public String getCopyPSDEActionName() {
        Object objValue = this._get(DTOFIELD_COPYPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCopyPSDEActionNameDirty() {
        return this._contains(DTOFIELD_COPYPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetCopyPSDEActionName() {
        this._reset(DTOFIELD_COPYPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO copypsdeactionname(String copyPSDEActionName) {
        this.setCopyPSDEActionName(copyPSDEActionName);
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
    public PSACHandlerDTO createdate(Timestamp createDate) {
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
    public PSACHandlerDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createpsdeactionid")
    public void setCreatePSDEActionId(String createPSDEActionId) {
        this._set(DTOFIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }

    @JsonIgnore
    public String getCreatePSDEActionId() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty() {
        return this._contains(DTOFIELD_CREATEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetCreatePSDEActionId() {
        this._reset(DTOFIELD_CREATEPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeactionid(String createPSDEActionId) {
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        } else {
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="createpsdeactionname")
    public void setCreatePSDEActionName(String createPSDEActionName) {
        this._set(DTOFIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }

    @JsonIgnore
    public String getCreatePSDEActionName() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty() {
        return this._contains(DTOFIELD_CREATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetCreatePSDEActionName() {
        this._reset(DTOFIELD_CREATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeactionname(String createPSDEActionName) {
        this.setCreatePSDEActionName(createPSDEActionName);
        return this;
    }

    @JsonProperty(value="createpsdeopprivid")
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivId() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeopprivid(String createPSDEOPPrivId) {
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivIName(null);
        } else {
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivIName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="createpsdeoppriviname")
    public void setCreatePSDEOPPrivIName(String createPSDEOPPrivIName) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVINAME, createPSDEOPPrivIName);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivIName() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivINameDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVINAME);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivIName() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVINAME);
    }

    @JsonIgnore
    public PSACHandlerDTO createpsdeoppriviname(String createPSDEOPPrivIName) {
        this.setCreatePSDEOPPrivIName(createPSDEOPPrivIName);
        return this;
    }

    @JsonProperty(value="createtimeout")
    public void setCreateTimeout(Integer createTimeout) {
        this._set(DTOFIELD_CREATETIMEOUT, createTimeout);
    }

    @JsonIgnore
    public Integer getCreateTimeout() {
        Object objValue = this._get(DTOFIELD_CREATETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCreateTimeoutDirty() {
        return this._contains(DTOFIELD_CREATETIMEOUT);
    }

    @JsonIgnore
    public void resetCreateTimeout() {
        this._reset(DTOFIELD_CREATETIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO createtimeout(Integer createTimeout) {
        this.setCreateTimeout(createTimeout);
        return this;
    }

    @JsonProperty(value="ctrltype")
    public void setCtrlType(String ctrlType) {
        this._set(DTOFIELD_CTRLTYPE, ctrlType);
    }

    @JsonIgnore
    public String getCtrlType() {
        Object objValue = this._get(DTOFIELD_CTRLTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlTypeDirty() {
        return this._contains(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public void resetCtrlType() {
        this._reset(DTOFIELD_CTRLTYPE);
    }

    @JsonIgnore
    public PSACHandlerDTO ctrltype(String ctrlType) {
        this.setCtrlType(ctrlType);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO ctrltype(PSModelEnums.CtrlType ctrlType) {
        if (ctrlType == null) {
            this.setCtrlType(null);
        } else {
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    @JsonProperty(value="customcond")
    public void setCustomCond(String customCond) {
        this._set(DTOFIELD_CUSTOMCOND, customCond);
    }

    @JsonIgnore
    public String getCustomCond() {
        Object objValue = this._get(DTOFIELD_CUSTOMCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCondDirty() {
        return this._contains(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public void resetCustomCond() {
        this._reset(DTOFIELD_CUSTOMCOND);
    }

    @JsonIgnore
    public PSACHandlerDTO customcond(String customCond) {
        this.setCustomCond(customCond);
        return this;
    }

    @JsonProperty(value="customtype")
    public void setCustomType(String customType) {
        this._set(DTOFIELD_CUSTOMTYPE, customType);
    }

    @JsonIgnore
    public String getCustomType() {
        Object objValue = this._get(DTOFIELD_CUSTOMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomTypeDirty() {
        return this._contains(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public void resetCustomType() {
        this._reset(DTOFIELD_CUSTOMTYPE);
    }

    @JsonIgnore
    public PSACHandlerDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonProperty(value="enablecache")
    public void setEnableCache(Integer enableCache) {
        this._set(DTOFIELD_ENABLECACHE, enableCache);
    }

    @JsonIgnore
    public Integer getEnableCache() {
        Object objValue = this._get(DTOFIELD_ENABLECACHE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCacheDirty() {
        return this._contains(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public void resetEnableCache() {
        this._reset(DTOFIELD_ENABLECACHE);
    }

    @JsonIgnore
    public PSACHandlerDTO enablecache(Integer enableCache) {
        this.setEnableCache(enableCache);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO enablecache(Boolean enableCache) {
        if (enableCache == null) {
            this.setEnableCache(null);
        } else {
            this.setEnableCache(enableCache != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableorgdr")
    public void setEnableOrgDR(Integer enableOrgDR) {
        this._set(DTOFIELD_ENABLEORGDR, enableOrgDR);
    }

    @JsonIgnore
    public Integer getEnableOrgDR() {
        Object objValue = this._get(DTOFIELD_ENABLEORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableOrgDRDirty() {
        return this._contains(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public void resetEnableOrgDR() {
        this._reset(DTOFIELD_ENABLEORGDR);
    }

    @JsonIgnore
    public PSACHandlerDTO enableorgdr(Integer enableOrgDR) {
        this.setEnableOrgDR(enableOrgDR);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO enableorgdr(Boolean enableOrgDR) {
        if (enableOrgDR == null) {
            this.setEnableOrgDR(null);
        } else {
            this.setEnableOrgDR(enableOrgDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecbc")
    public void setEnableSecBC(Integer enableSecBC) {
        this._set(DTOFIELD_ENABLESECBC, enableSecBC);
    }

    @JsonIgnore
    public Integer getEnableSecBC() {
        Object objValue = this._get(DTOFIELD_ENABLESECBC);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecBCDirty() {
        return this._contains(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public void resetEnableSecBC() {
        this._reset(DTOFIELD_ENABLESECBC);
    }

    @JsonIgnore
    public PSACHandlerDTO enablesecbc(Integer enableSecBC) {
        this.setEnableSecBC(enableSecBC);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO enablesecbc(Boolean enableSecBC) {
        if (enableSecBC == null) {
            this.setEnableSecBC(null);
        } else {
            this.setEnableSecBC(enableSecBC != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enablesecdr")
    public void setEnableSecDR(Integer enableSecDR) {
        this._set(DTOFIELD_ENABLESECDR, enableSecDR);
    }

    @JsonIgnore
    public Integer getEnableSecDR() {
        Object objValue = this._get(DTOFIELD_ENABLESECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableSecDRDirty() {
        return this._contains(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public void resetEnableSecDR() {
        this._reset(DTOFIELD_ENABLESECDR);
    }

    @JsonIgnore
    public PSACHandlerDTO enablesecdr(Integer enableSecDR) {
        this.setEnableSecDR(enableSecDR);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO enablesecdr(Boolean enableSecDR) {
        if (enableSecDR == null) {
            this.setEnableSecDR(null);
        } else {
            this.setEnableSecDR(enableSecDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="enableuserdr")
    public void setEnableUserDR(Integer enableUserDR) {
        this._set(DTOFIELD_ENABLEUSERDR, enableUserDR);
    }

    @JsonIgnore
    public Integer getEnableUserDR() {
        Object objValue = this._get(DTOFIELD_ENABLEUSERDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableUserDRDirty() {
        return this._contains(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public void resetEnableUserDR() {
        this._reset(DTOFIELD_ENABLEUSERDR);
    }

    @JsonIgnore
    public PSACHandlerDTO enableuserdr(Integer enableUserDR) {
        this.setEnableUserDR(enableUserDR);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO enableuserdr(Boolean enableUserDR) {
        if (enableUserDR == null) {
            this.setEnableUserDR(null);
        } else {
            this.setEnableUserDR(enableUserDR != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="exportpsdeopprivid")
    public void setExportPSDEOPPrivId(String exportPSDEOPPrivId) {
        this._set(DTOFIELD_EXPORTPSDEOPPRIVID, exportPSDEOPPrivId);
    }

    @JsonIgnore
    public String getExportPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_EXPORTPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExportPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_EXPORTPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetExportPSDEOPPrivId() {
        this._reset(DTOFIELD_EXPORTPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO exportpsdeopprivid(String exportPSDEOPPrivId) {
        this.setExportPSDEOPPrivId(exportPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO exportpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setExportPSDEOPPrivId(null);
            this.setExportPSDEOPPrivName(null);
        } else {
            this.setExportPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setExportPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="exportpsdeopprivname")
    public void setExportPSDEOPPrivName(String exportPSDEOPPrivName) {
        this._set(DTOFIELD_EXPORTPSDEOPPRIVNAME, exportPSDEOPPrivName);
        this._set(FIELD_EXPORTPSDEOPPRIVNAME, exportPSDEOPPrivName);
    }

    @JsonIgnore
    public String getExportPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_EXPORTPSDEOPPRIVNAME);
        if (objValue == null && (objValue = this._get(FIELD_EXPORTPSDEOPPRIVNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExportPSDEOPPrivNameDirty() {
        if (this._contains(DTOFIELD_EXPORTPSDEOPPRIVNAME)) {
            return true;
        }
        return this._contains(FIELD_EXPORTPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetExportPSDEOPPrivName() {
        this._reset(DTOFIELD_EXPORTPSDEOPPRIVNAME);
        this._reset(FIELD_EXPORTPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO exportpsdeopprivname(String exportPSDEOPPrivName) {
        this.setExportPSDEOPPrivName(exportPSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="fetchtimeout")
    public void setFetchTimeout(Integer fetchTimeout) {
        this._set(DTOFIELD_FETCHTIMEOUT, fetchTimeout);
    }

    @JsonIgnore
    public Integer getFetchTimeout() {
        Object objValue = this._get(DTOFIELD_FETCHTIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFetchTimeoutDirty() {
        return this._contains(DTOFIELD_FETCHTIMEOUT);
    }

    @JsonIgnore
    public void resetFetchTimeout() {
        this._reset(DTOFIELD_FETCHTIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO fetchtimeout(Integer fetchTimeout) {
        this.setFetchTimeout(fetchTimeout);
        return this;
    }

    @JsonProperty(value="finishflag")
    public void setFinishFlag(Integer finishFlag) {
        this._set(DTOFIELD_FINISHFLAG, finishFlag);
    }

    @JsonIgnore
    public Integer getFinishFlag() {
        Object objValue = this._get(DTOFIELD_FINISHFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFinishFlagDirty() {
        return this._contains(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public void resetFinishFlag() {
        this._reset(DTOFIELD_FINISHFLAG);
    }

    @JsonIgnore
    public PSACHandlerDTO finishflag(Integer finishFlag) {
        this.setFinishFlag(finishFlag);
        return this;
    }

    @JsonProperty(value="getdraftpsdeactionid")
    public void setGetDraftPSDEActionId(String getDraftPSDEActionId) {
        this._set(DTOFIELD_GETDRAFTPSDEACTIONID, getDraftPSDEActionId);
    }

    @JsonIgnore
    public String getGetDraftPSDEActionId() {
        Object objValue = this._get(DTOFIELD_GETDRAFTPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetDraftPSDEActionIdDirty() {
        return this._contains(DTOFIELD_GETDRAFTPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGetDraftPSDEActionId() {
        this._reset(DTOFIELD_GETDRAFTPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO getdraftpsdeactionid(String getDraftPSDEActionId) {
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO getdraftpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGetDraftPSDEActionId(null);
            this.setGetDraftPSDEActionName(null);
        } else {
            this.setGetDraftPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDraftPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="getdraftpsdeactionname")
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName) {
        this._set(DTOFIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }

    @JsonIgnore
    public String getGetDraftPSDEActionName() {
        Object objValue = this._get(DTOFIELD_GETDRAFTPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetDraftPSDEActionNameDirty() {
        return this._contains(DTOFIELD_GETDRAFTPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGetDraftPSDEActionName() {
        this._reset(DTOFIELD_GETDRAFTPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO getdraftpsdeactionname(String getDraftPSDEActionName) {
        this.setGetDraftPSDEActionName(getDraftPSDEActionName);
        return this;
    }

    @JsonProperty(value="getpsdeactionid")
    public void setGetPSDEActionId(String getPSDEActionId) {
        this._set(DTOFIELD_GETPSDEACTIONID, getPSDEActionId);
    }

    @JsonIgnore
    public String getGetPSDEActionId() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionIdDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGetPSDEActionId() {
        this._reset(DTOFIELD_GETPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO getpsdeactionid(String getPSDEActionId) {
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO getpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        } else {
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="getpsdeactionname")
    public void setGetPSDEActionName(String getPSDEActionName) {
        this._set(DTOFIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }

    @JsonIgnore
    public String getGetPSDEActionName() {
        Object objValue = this._get(DTOFIELD_GETPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGetPSDEActionNameDirty() {
        return this._contains(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGetPSDEActionName() {
        this._reset(DTOFIELD_GETPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO getpsdeactionname(String getPSDEActionName) {
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    @JsonProperty(value="gettimeout")
    public void setGetTimeout(Integer getTimeout) {
        this._set(DTOFIELD_GETTIMEOUT, getTimeout);
    }

    @JsonIgnore
    public Integer getGetTimeout() {
        Object objValue = this._get(DTOFIELD_GETTIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGetTimeoutDirty() {
        return this._contains(DTOFIELD_GETTIMEOUT);
    }

    @JsonIgnore
    public void resetGetTimeout() {
        this._reset(DTOFIELD_GETTIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO gettimeout(Integer getTimeout) {
        this.setGetTimeout(getTimeout);
        return this;
    }

    @JsonProperty(value="groupmovepsdeactionid")
    public void setGroupMovePSDEActionId(String groupMovePSDEActionId) {
        this._set(DTOFIELD_GROUPMOVEPSDEACTIONID, groupMovePSDEActionId);
    }

    @JsonIgnore
    public String getGroupMovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_GROUPMOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupMovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_GROUPMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetGroupMovePSDEActionId() {
        this._reset(DTOFIELD_GROUPMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO groupmovepsdeactionid(String groupMovePSDEActionId) {
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO groupmovepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setGroupMovePSDEActionId(null);
            this.setGroupMovePSDEActionName(null);
        } else {
            this.setGroupMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setGroupMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="groupmovepsdeactionname")
    public void setGroupMovePSDEActionName(String groupMovePSDEActionName) {
        this._set(DTOFIELD_GROUPMOVEPSDEACTIONNAME, groupMovePSDEActionName);
    }

    @JsonIgnore
    public String getGroupMovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupMovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetGroupMovePSDEActionName() {
        this._reset(DTOFIELD_GROUPMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO groupmovepsdeactionname(String groupMovePSDEActionName) {
        this.setGroupMovePSDEActionName(groupMovePSDEActionName);
        return this;
    }

    @JsonProperty(value="grouppsdeid")
    public void setGroupPSDEId(String groupPSDEId) {
        this._set(DTOFIELD_GROUPPSDEID, groupPSDEId);
    }

    @JsonIgnore
    public String getGroupPSDEId() {
        Object objValue = this._get(DTOFIELD_GROUPPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDEIdDirty() {
        return this._contains(DTOFIELD_GROUPPSDEID);
    }

    @JsonIgnore
    public void resetGroupPSDEId() {
        this._reset(DTOFIELD_GROUPPSDEID);
    }

    @JsonIgnore
    public PSACHandlerDTO grouppsdeid(String groupPSDEId) {
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO grouppsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setGroupPSDEId(null);
            this.setGroupPSDEName(null);
        } else {
            this.setGroupPSDEId(pSDataEntity.getPSDataEntityId());
            this.setGroupPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="grouppsdename")
    public void setGroupPSDEName(String groupPSDEName) {
        this._set(DTOFIELD_GROUPPSDENAME, groupPSDEName);
    }

    @JsonIgnore
    public String getGroupPSDEName() {
        Object objValue = this._get(DTOFIELD_GROUPPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupPSDENameDirty() {
        return this._contains(DTOFIELD_GROUPPSDENAME);
    }

    @JsonIgnore
    public void resetGroupPSDEName() {
        this._reset(DTOFIELD_GROUPPSDENAME);
    }

    @JsonIgnore
    public PSACHandlerDTO grouppsdename(String groupPSDEName) {
        this.setGroupPSDEName(groupPSDEName);
        return this;
    }

    @JsonProperty(value="handlerobj")
    public void setHandlerObj(String handlerObj) {
        this._set(DTOFIELD_HANDLEROBJ, handlerObj);
    }

    @JsonIgnore
    public String getHandlerObj() {
        Object objValue = this._get(DTOFIELD_HANDLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerObjDirty() {
        return this._contains(DTOFIELD_HANDLEROBJ);
    }

    @JsonIgnore
    public void resetHandlerObj() {
        this._reset(DTOFIELD_HANDLEROBJ);
    }

    @JsonIgnore
    public PSACHandlerDTO handlerobj(String handlerObj) {
        this.setHandlerObj(handlerObj);
        return this;
    }

    @JsonProperty(value="handlerobj2")
    public void setHandlerObj2(String handlerObj2) {
        this._set(DTOFIELD_HANDLEROBJ2, handlerObj2);
    }

    @JsonIgnore
    public String getHandlerObj2() {
        Object objValue = this._get(DTOFIELD_HANDLEROBJ2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerObj2Dirty() {
        return this._contains(DTOFIELD_HANDLEROBJ2);
    }

    @JsonIgnore
    public void resetHandlerObj2() {
        this._reset(DTOFIELD_HANDLEROBJ2);
    }

    @JsonIgnore
    public PSACHandlerDTO handlerobj2(String handlerObj2) {
        this.setHandlerObj2(handlerObj2);
        return this;
    }

    @JsonProperty(value="handlerparams")
    public void setHandlerParams(String handlerParams) {
        this._set(DTOFIELD_HANDLERPARAMS, handlerParams);
    }

    @JsonIgnore
    public String getHandlerParams() {
        Object objValue = this._get(DTOFIELD_HANDLERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerParamsDirty() {
        return this._contains(DTOFIELD_HANDLERPARAMS);
    }

    @JsonIgnore
    public void resetHandlerParams() {
        this._reset(DTOFIELD_HANDLERPARAMS);
    }

    @JsonIgnore
    public PSACHandlerDTO handlerparams(String handlerParams) {
        this.setHandlerParams(handlerParams);
        return this;
    }

    @JsonProperty(value="handlertag")
    public void setHandlerTag(String handlerTag) {
        this._set(DTOFIELD_HANDLERTAG, handlerTag);
    }

    @JsonIgnore
    public String getHandlerTag() {
        Object objValue = this._get(DTOFIELD_HANDLERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerTagDirty() {
        return this._contains(DTOFIELD_HANDLERTAG);
    }

    @JsonIgnore
    public void resetHandlerTag() {
        this._reset(DTOFIELD_HANDLERTAG);
    }

    @JsonIgnore
    public PSACHandlerDTO handlertag(String handlerTag) {
        this.setHandlerTag(handlerTag);
        return this;
    }

    @JsonProperty(value="handlertag2")
    public void setHandlerTag2(String handlerTag2) {
        this._set(DTOFIELD_HANDLERTAG2, handlerTag2);
    }

    @JsonIgnore
    public String getHandlerTag2() {
        Object objValue = this._get(DTOFIELD_HANDLERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHandlerTag2Dirty() {
        return this._contains(DTOFIELD_HANDLERTAG2);
    }

    @JsonIgnore
    public void resetHandlerTag2() {
        this._reset(DTOFIELD_HANDLERTAG2);
    }

    @JsonIgnore
    public PSACHandlerDTO handlertag2(String handlerTag2) {
        this.setHandlerTag2(handlerTag2);
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
    public PSACHandlerDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="movepsdeactionid")
    public void setMovePSDEActionId(String movePSDEActionId) {
        this._set(DTOFIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }

    @JsonIgnore
    public String getMovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetMovePSDEActionId() {
        this._reset(DTOFIELD_MOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO movepsdeactionid(String movePSDEActionId) {
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO movepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        } else {
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="movepsdeactionname")
    public void setMovePSDEActionName(String movePSDEActionName) {
        this._set(DTOFIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }

    @JsonIgnore
    public String getMovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_MOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetMovePSDEActionName() {
        this._reset(DTOFIELD_MOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO movepsdeactionname(String movePSDEActionName) {
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    @JsonProperty(value="orgdr")
    public void setOrgDR(Integer orgDR) {
        this._set(DTOFIELD_ORGDR, orgDR);
    }

    @JsonIgnore
    public Integer getOrgDR() {
        Object objValue = this._get(DTOFIELD_ORGDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrgDRDirty() {
        return this._contains(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public void resetOrgDR() {
        this._reset(DTOFIELD_ORGDR);
    }

    @JsonIgnore
    public PSACHandlerDTO orgdr(Integer orgDR) {
        this.setOrgDR(orgDR);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO orgdr(PSModelEnums.OrgScope[] orgDR) {
        if (orgDR == null || orgDR.length == 0) {
            this.setOrgDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.OrgScope _item : orgDR) {
                _value |= _item.value;
            }
            this.setOrgDR(_value);
        }
        return this;
    }

    @JsonProperty(value="psachandlerid")
    public void setPSACHandlerId(String pSACHandlerId) {
        this._set(DTOFIELD_PSACHANDLERID, pSACHandlerId);
    }

    @JsonIgnore
    public String getPSACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public void resetPSACHandlerId() {
        this._reset(DTOFIELD_PSACHANDLERID);
    }

    @JsonIgnore
    public PSACHandlerDTO psachandlerid(String pSACHandlerId) {
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    @JsonProperty(value="psachandlername")
    public void setPSACHandlerName(String pSACHandlerName) {
        this._set(DTOFIELD_PSACHANDLERNAME, pSACHandlerName);
    }

    @JsonIgnore
    public String getPSACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSACHandlerName() {
        this._reset(DTOFIELD_PSACHANDLERNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO psachandlername(String pSACHandlerName) {
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSACHandlerName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSACHandlerName(strName);
    }

    @JsonIgnore
    public PSACHandlerDTO name(String strName) {
        this.setPSACHandlerName(strName);
        return this;
    }

    @JsonProperty(value="psdedatasetid")
    public void setPSDEDataSetId(String pSDEDataSetId) {
        this._set(DTOFIELD_PSDEDATASETID, pSDEDataSetId);
    }

    @JsonIgnore
    public String getPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public void resetPSDEDataSetId() {
        this._reset(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public PSACHandlerDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        } else {
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasetname")
    public void setPSDEDataSetName(String pSDEDataSetName) {
        this._set(DTOFIELD_PSDEDATASETNAME, pSDEDataSetName);
    }

    @JsonIgnore
    public String getPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSetName() {
        this._reset(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
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
    public PSACHandlerDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSACHandlerDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSACHandlerDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSACHandlerDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssfachandlerid")
    public void setPSSFACHandlerId(String pSSFACHandlerId) {
        this._set(DTOFIELD_PSSFACHANDLERID, pSSFACHandlerId);
    }

    @JsonIgnore
    public String getPSSFACHandlerId() {
        Object objValue = this._get(DTOFIELD_PSSFACHANDLERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFACHandlerIdDirty() {
        return this._contains(DTOFIELD_PSSFACHANDLERID);
    }

    @JsonIgnore
    public void resetPSSFACHandlerId() {
        this._reset(DTOFIELD_PSSFACHANDLERID);
    }

    @JsonIgnore
    public PSACHandlerDTO pssfachandlerid(String pSSFACHandlerId) {
        this.setPSSFACHandlerId(pSSFACHandlerId);
        return this;
    }

    @JsonProperty(value="pssfachandlername")
    public void setPSSFACHandlerName(String pSSFACHandlerName) {
        this._set(DTOFIELD_PSSFACHANDLERNAME, pSSFACHandlerName);
    }

    @JsonIgnore
    public String getPSSFACHandlerName() {
        Object objValue = this._get(DTOFIELD_PSSFACHANDLERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFACHandlerNameDirty() {
        return this._contains(DTOFIELD_PSSFACHANDLERNAME);
    }

    @JsonIgnore
    public void resetPSSFACHandlerName() {
        this._reset(DTOFIELD_PSSFACHANDLERNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO pssfachandlername(String pSSFACHandlerName) {
        this.setPSSFACHandlerName(pSSFACHandlerName);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssysreqitemid")
    public void setPSSysReqItemId(String pSSysReqItemId) {
        this._set(DTOFIELD_PSSYSREQITEMID, pSSysReqItemId);
    }

    @JsonIgnore
    public String getPSSysReqItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public void resetPSSysReqItemId() {
        this._reset(DTOFIELD_PSSYSREQITEMID);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysreqitemid(String pSSysReqItemId) {
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem) {
        if (pSSysReqItem == null) {
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        } else {
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysreqitemname")
    public void setPSSysReqItemName(String pSSysReqItemName) {
        this._set(DTOFIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }

    @JsonIgnore
    public String getPSSysReqItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSREQITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysReqItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysReqItemName() {
        this._reset(DTOFIELD_PSSYSREQITEMNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysreqitemname(String pSSysReqItemName) {
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonProperty(value="pssysunistateid")
    public void setPSSysUniStateId(String pSSysUniStateId) {
        this._set(DTOFIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }

    @JsonIgnore
    public String getPSSysUniStateId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public void resetPSSysUniStateId() {
        this._reset(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysunistateid(String pSSysUniStateId) {
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO pssysunistateid(PSSysUniStateDTO pSSysUniState) {
        if (pSSysUniState == null) {
            this.setPSSysUniStateId(null);
            this.setPSSysUniStateName(null);
        } else {
            this.setPSSysUniStateId(pSSysUniState.getPSSysUniStateId());
            this.setPSSysUniStateName(pSSysUniState.getPSSysUniStateName());
        }
        return this;
    }

    @JsonProperty(value="pssysunistatename")
    public void setPSSysUniStateName(String pSSysUniStateName) {
        this._set(DTOFIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }

    @JsonIgnore
    public String getPSSysUniStateName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public void resetPSSysUniStateName() {
        this._reset(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysunistatename(String pSSysUniStateName) {
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonProperty(value="pssysuserdrid")
    public void setPSSysUserDRId(String pSSysUserDRId) {
        this._set(DTOFIELD_PSSYSUSERDRID, pSSysUserDRId);
    }

    @JsonIgnore
    public String getPSSysUserDRId() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRIdDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public void resetPSSysUserDRId() {
        this._reset(DTOFIELD_PSSYSUSERDRID);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrid(String pSSysUserDRId) {
        this.setPSSysUserDRId(pSSysUserDRId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrid(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId(null);
            this.setPSSysUserDRName(null);
        } else {
            this.setPSSysUserDRId(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrid2")
    public void setPSSysUserDRId2(String pSSysUserDRId2) {
        this._set(DTOFIELD_PSSYSUSERDRID2, pSSysUserDRId2);
    }

    @JsonIgnore
    public String getPSSysUserDRId2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRID2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRId2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public void resetPSSysUserDRId2() {
        this._reset(DTOFIELD_PSSYSUSERDRID2);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrid2(String pSSysUserDRId2) {
        this.setPSSysUserDRId2(pSSysUserDRId2);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrid2(PSSysUserDRDTO pSSysUserDR) {
        if (pSSysUserDR == null) {
            this.setPSSysUserDRId2(null);
            this.setPSSysUserDRName2(null);
        } else {
            this.setPSSysUserDRId2(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName2(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    @JsonProperty(value="pssysuserdrname")
    public void setPSSysUserDRName(String pSSysUserDRName) {
        this._set(DTOFIELD_PSSYSUSERDRNAME, pSSysUserDRName);
    }

    @JsonIgnore
    public String getPSSysUserDRName() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRNameDirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public void resetPSSysUserDRName() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrname(String pSSysUserDRName) {
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    @JsonProperty(value="pssysuserdrname2")
    public void setPSSysUserDRName2(String pSSysUserDRName2) {
        this._set(DTOFIELD_PSSYSUSERDRNAME2, pSSysUserDRName2);
    }

    @JsonIgnore
    public String getPSSysUserDRName2() {
        Object objValue = this._get(DTOFIELD_PSSYSUSERDRNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUserDRName2Dirty() {
        return this._contains(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public void resetPSSysUserDRName2() {
        this._reset(DTOFIELD_PSSYSUSERDRNAME2);
    }

    @JsonIgnore
    public PSACHandlerDTO pssysuserdrname2(String pSSysUserDRName2) {
        this.setPSSysUserDRName2(pSSysUserDRName2);
        return this;
    }

    @JsonProperty(value="readpsdeopprivid")
    public void setReadPSDEOPPrivId(String readPSDEOPPrivId) {
        this._set(DTOFIELD_READPSDEOPPRIVID, readPSDEOPPrivId);
    }

    @JsonIgnore
    public String getReadPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_READPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReadPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_READPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetReadPSDEOPPrivId() {
        this._reset(DTOFIELD_READPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO readpsdeopprivid(String readPSDEOPPrivId) {
        this.setReadPSDEOPPrivId(readPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO readpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setReadPSDEOPPrivId(null);
            this.setReadPSDEOPPrivName(null);
        } else {
            this.setReadPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setReadPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="readpsdeopprivname")
    public void setReadPSDEOPPrivName(String readPSDEOPPrivName) {
        this._set(DTOFIELD_READPSDEOPPRIVNAME, readPSDEOPPrivName);
    }

    @JsonIgnore
    public String getReadPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_READPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReadPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_READPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetReadPSDEOPPrivName() {
        this._reset(DTOFIELD_READPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO readpsdeopprivname(String readPSDEOPPrivName) {
        this.setReadPSDEOPPrivName(readPSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="removepsdeactionid")
    public void setRemovePSDEActionId(String removePSDEActionId) {
        this._set(DTOFIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }

    @JsonIgnore
    public String getRemovePSDEActionId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetRemovePSDEActionId() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeactionid(String removePSDEActionId) {
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        } else {
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeactionname")
    public void setRemovePSDEActionName(String removePSDEActionName) {
        this._set(DTOFIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }

    @JsonIgnore
    public String getRemovePSDEActionName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEActionName() {
        this._reset(DTOFIELD_REMOVEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeactionname(String removePSDEActionName) {
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    @JsonProperty(value="removepsdeopprivid")
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivId() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeopprivid(String removePSDEOPPrivId) {
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        } else {
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="removepsdeopprivname")
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName) {
        this._set(DTOFIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }

    @JsonIgnore
    public String getRemovePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_REMOVEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetRemovePSDEOPPrivName() {
        this._reset(DTOFIELD_REMOVEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO removepsdeopprivname(String removePSDEOPPrivName) {
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="removetimeout")
    public void setRemoveTimeout(Integer removeTimeout) {
        this._set(DTOFIELD_REMOVETIMEOUT, removeTimeout);
    }

    @JsonIgnore
    public Integer getRemoveTimeout() {
        Object objValue = this._get(DTOFIELD_REMOVETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isRemoveTimeoutDirty() {
        return this._contains(DTOFIELD_REMOVETIMEOUT);
    }

    @JsonIgnore
    public void resetRemoveTimeout() {
        this._reset(DTOFIELD_REMOVETIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO removetimeout(Integer removeTimeout) {
        this.setRemoveTimeout(removeTimeout);
        return this;
    }

    @JsonProperty(value="secbc")
    public void setSecBC(String secBC) {
        this._set(DTOFIELD_SECBC, secBC);
    }

    @JsonIgnore
    public String getSecBC() {
        Object objValue = this._get(DTOFIELD_SECBC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSecBCDirty() {
        return this._contains(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public void resetSecBC() {
        this._reset(DTOFIELD_SECBC);
    }

    @JsonIgnore
    public PSACHandlerDTO secbc(String secBC) {
        this.setSecBC(secBC);
        return this;
    }

    @JsonProperty(value="secdr")
    public void setSecDR(Integer secDR) {
        this._set(DTOFIELD_SECDR, secDR);
    }

    @JsonIgnore
    public Integer getSecDR() {
        Object objValue = this._get(DTOFIELD_SECDR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSecDRDirty() {
        return this._contains(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public void resetSecDR() {
        this._reset(DTOFIELD_SECDR);
    }

    @JsonIgnore
    public PSACHandlerDTO secdr(Integer secDR) {
        this.setSecDR(secDR);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO secdr(PSModelEnums.DeptScope[] secDR) {
        if (secDR == null || secDR.length == 0) {
            this.setSecDR(null);
        } else {
            int _value = 0;
            for (PSModelEnums.DeptScope _item : secDR) {
                _value |= _item.value;
            }
            this.setSecDR(_value);
        }
        return this;
    }

    @JsonProperty(value="sysuserdr2param")
    public void setSysUserDR2Param(String sysUserDR2Param) {
        this._set(DTOFIELD_SYSUSERDR2PARAM, sysUserDR2Param);
    }

    @JsonIgnore
    public String getSysUserDR2Param() {
        Object objValue = this._get(DTOFIELD_SYSUSERDR2PARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDR2ParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public void resetSysUserDR2Param() {
        this._reset(DTOFIELD_SYSUSERDR2PARAM);
    }

    @JsonIgnore
    public PSACHandlerDTO sysuserdr2param(String sysUserDR2Param) {
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    @JsonProperty(value="sysuserdrparam")
    public void setSysUserDRParam(String sysUserDRParam) {
        this._set(DTOFIELD_SYSUSERDRPARAM, sysUserDRParam);
    }

    @JsonIgnore
    public String getSysUserDRParam() {
        Object objValue = this._get(DTOFIELD_SYSUSERDRPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysUserDRParamDirty() {
        return this._contains(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public void resetSysUserDRParam() {
        this._reset(DTOFIELD_SYSUSERDRPARAM);
    }

    @JsonIgnore
    public PSACHandlerDTO sysuserdrparam(String sysUserDRParam) {
        this.setSysUserDRParam(sysUserDRParam);
        return this;
    }

    @JsonProperty(value="tempmode")
    public void setTempMode(Integer tempMode) {
        this._set(DTOFIELD_TEMPMODE, tempMode);
    }

    @JsonIgnore
    public Integer getTempMode() {
        Object objValue = this._get(DTOFIELD_TEMPMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTempModeDirty() {
        return this._contains(DTOFIELD_TEMPMODE);
    }

    @JsonIgnore
    public void resetTempMode() {
        this._reset(DTOFIELD_TEMPMODE);
    }

    @JsonIgnore
    public PSACHandlerDTO tempmode(Integer tempMode) {
        this.setTempMode(tempMode);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO tempmode(PSModelEnums.TempDataMode tempMode) {
        if (tempMode == null) {
            this.setTempMode(null);
        } else {
            this.setTempMode(tempMode.value);
        }
        return this;
    }

    @JsonProperty(value="unistatefield")
    public void setUniStateField(String uniStateField) {
        this._set(DTOFIELD_UNISTATEFIELD, uniStateField);
    }

    @JsonIgnore
    public String getUniStateField() {
        Object objValue = this._get(DTOFIELD_UNISTATEFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateFieldDirty() {
        return this._contains(DTOFIELD_UNISTATEFIELD);
    }

    @JsonIgnore
    public void resetUniStateField() {
        this._reset(DTOFIELD_UNISTATEFIELD);
    }

    @JsonIgnore
    public PSACHandlerDTO unistatefield(String uniStateField) {
        this.setUniStateField(uniStateField);
        return this;
    }

    @JsonProperty(value="unistatekeyvalue")
    public void setUniStateKeyValue(String uniStateKeyValue) {
        this._set(DTOFIELD_UNISTATEKEYVALUE, uniStateKeyValue);
    }

    @JsonIgnore
    public String getUniStateKeyValue() {
        Object objValue = this._get(DTOFIELD_UNISTATEKEYVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateKeyValueDirty() {
        return this._contains(DTOFIELD_UNISTATEKEYVALUE);
    }

    @JsonIgnore
    public void resetUniStateKeyValue() {
        this._reset(DTOFIELD_UNISTATEKEYVALUE);
    }

    @JsonIgnore
    public PSACHandlerDTO unistatekeyvalue(String uniStateKeyValue) {
        this.setUniStateKeyValue(uniStateKeyValue);
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
    public PSACHandlerDTO updatedate(Timestamp updateDate) {
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
    public PSACHandlerDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="updatepsdeactionid")
    public void setUpdatePSDEActionId(String updatePSDEActionId) {
        this._set(DTOFIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }

    @JsonIgnore
    public String getUpdatePSDEActionId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionId() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeactionid(String updatePSDEActionId) {
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        } else {
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeactionname")
    public void setUpdatePSDEActionName(String updatePSDEActionName) {
        this._set(DTOFIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }

    @JsonIgnore
    public String getUpdatePSDEActionName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEActionName() {
        this._reset(DTOFIELD_UPDATEPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeactionname(String updatePSDEActionName) {
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    @JsonProperty(value="updatepsdeopprivid")
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivId() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeopprivid(String updatePSDEOPPrivId) {
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        } else {
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="updatepsdeopprivname")
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName) {
        this._set(DTOFIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }

    @JsonIgnore
    public String getUpdatePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_UPDATEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetUpdatePSDEOPPrivName() {
        this._reset(DTOFIELD_UPDATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO updatepsdeopprivname(String updatePSDEOPPrivName) {
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="updatetimeout")
    public void setUpdateTimeout(Integer updateTimeout) {
        this._set(DTOFIELD_UPDATETIMEOUT, updateTimeout);
    }

    @JsonIgnore
    public Integer getUpdateTimeout() {
        Object objValue = this._get(DTOFIELD_UPDATETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isUpdateTimeoutDirty() {
        return this._contains(DTOFIELD_UPDATETIMEOUT);
    }

    @JsonIgnore
    public void resetUpdateTimeout() {
        this._reset(DTOFIELD_UPDATETIMEOUT);
    }

    @JsonIgnore
    public PSACHandlerDTO updatetimeout(Integer updateTimeout) {
        this.setUpdateTimeout(updateTimeout);
        return this;
    }

    @JsonProperty(value="user2psdeactionid")
    public void setUser2PSDEActionId(String user2PSDEActionId) {
        this._set(DTOFIELD_USER2PSDEACTIONID, user2PSDEActionId);
    }

    @JsonIgnore
    public String getUser2PSDEActionId() {
        Object objValue = this._get(DTOFIELD_USER2PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEActionIdDirty() {
        return this._contains(DTOFIELD_USER2PSDEACTIONID);
    }

    @JsonIgnore
    public void resetUser2PSDEActionId() {
        this._reset(DTOFIELD_USER2PSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeactionid(String user2PSDEActionId) {
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUser2PSDEActionId(null);
            this.setUser2PSDEActionName(null);
        } else {
            this.setUser2PSDEActionId(pSDEAction.getPSDEActionId());
            this.setUser2PSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="user2psdeactionname")
    public void setUser2PSDEActionName(String user2PSDEActionName) {
        this._set(DTOFIELD_USER2PSDEACTIONNAME, user2PSDEActionName);
    }

    @JsonIgnore
    public String getUser2PSDEActionName() {
        Object objValue = this._get(DTOFIELD_USER2PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEActionNameDirty() {
        return this._contains(DTOFIELD_USER2PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUser2PSDEActionName() {
        this._reset(DTOFIELD_USER2PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeactionname(String user2PSDEActionName) {
        this.setUser2PSDEActionName(user2PSDEActionName);
        return this;
    }

    @JsonProperty(value="user2psdeopprivid")
    public void setUser2PSDEOPPrivId(String user2PSDEOPPrivId) {
        this._set(DTOFIELD_USER2PSDEOPPRIVID, user2PSDEOPPrivId);
    }

    @JsonIgnore
    public String getUser2PSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_USER2PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_USER2PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetUser2PSDEOPPrivId() {
        this._reset(DTOFIELD_USER2PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeopprivid(String user2PSDEOPPrivId) {
        this.setUser2PSDEOPPrivId(user2PSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setUser2PSDEOPPrivId(null);
            this.setUser2PSDEOPPrivName(null);
        } else {
            this.setUser2PSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUser2PSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="user2psdeopprivname")
    public void setUser2PSDEOPPrivName(String user2PSDEOPPrivName) {
        this._set(DTOFIELD_USER2PSDEOPPRIVNAME, user2PSDEOPPrivName);
        this._set(FIELD_USER2PSDEOPPRIVNAME, user2PSDEOPPrivName);
    }

    @JsonIgnore
    public String getUser2PSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_USER2PSDEOPPRIVNAME);
        if (objValue == null && (objValue = this._get(FIELD_USER2PSDEOPPRIVNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUser2PSDEOPPrivNameDirty() {
        if (this._contains(DTOFIELD_USER2PSDEOPPRIVNAME)) {
            return true;
        }
        return this._contains(FIELD_USER2PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetUser2PSDEOPPrivName() {
        this._reset(DTOFIELD_USER2PSDEOPPRIVNAME);
        this._reset(FIELD_USER2PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO user2psdeopprivname(String user2PSDEOPPrivName) {
        this.setUser2PSDEOPPrivName(user2PSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userparams")
    public void setUserParams(String userParams) {
        this._set(DTOFIELD_USERPARAMS, userParams);
    }

    @JsonIgnore
    public String getUserParams() {
        Object objValue = this._get(DTOFIELD_USERPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserParamsDirty() {
        return this._contains(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public void resetUserParams() {
        this._reset(DTOFIELD_USERPARAMS);
    }

    @JsonIgnore
    public PSACHandlerDTO userparams(String userParams) {
        this.setUserParams(userParams);
        return this;
    }

    @JsonProperty(value="userpsdeactionid")
    public void setUserPSDEActionId(String userPSDEActionId) {
        this._set(DTOFIELD_USERPSDEACTIONID, userPSDEActionId);
    }

    @JsonIgnore
    public String getUserPSDEActionId() {
        Object objValue = this._get(DTOFIELD_USERPSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEActionIdDirty() {
        return this._contains(DTOFIELD_USERPSDEACTIONID);
    }

    @JsonIgnore
    public void resetUserPSDEActionId() {
        this._reset(DTOFIELD_USERPSDEACTIONID);
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeactionid(String userPSDEActionId) {
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setUserPSDEActionId(null);
            this.setUserPSDEActionName(null);
        } else {
            this.setUserPSDEActionId(pSDEAction.getPSDEActionId());
            this.setUserPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="userpsdeactionname")
    public void setUserPSDEActionName(String userPSDEActionName) {
        this._set(DTOFIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }

    @JsonIgnore
    public String getUserPSDEActionName() {
        Object objValue = this._get(DTOFIELD_USERPSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEActionNameDirty() {
        return this._contains(DTOFIELD_USERPSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetUserPSDEActionName() {
        this._reset(DTOFIELD_USERPSDEACTIONNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeactionname(String userPSDEActionName) {
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    @JsonProperty(value="userpsdeopprivid")
    public void setUserPSDEOPPrivId(String userPSDEOPPrivId) {
        this._set(DTOFIELD_USERPSDEOPPRIVID, userPSDEOPPrivId);
    }

    @JsonIgnore
    public String getUserPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_USERPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_USERPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetUserPSDEOPPrivId() {
        this._reset(DTOFIELD_USERPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeopprivid(String userPSDEOPPrivId) {
        this.setUserPSDEOPPrivId(userPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setUserPSDEOPPrivId(null);
            this.setUserPSDEOPPrivName(null);
        } else {
            this.setUserPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUserPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="userpsdeopprivname")
    public void setUserPSDEOPPrivName(String userPSDEOPPrivName) {
        this._set(DTOFIELD_USERPSDEOPPRIVNAME, userPSDEOPPrivName);
        this._set(FIELD_USERPSDEOPPRIVNAME, userPSDEOPPrivName);
    }

    @JsonIgnore
    public String getUserPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_USERPSDEOPPRIVNAME);
        if (objValue == null && (objValue = this._get(FIELD_USERPSDEOPPRIVNAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserPSDEOPPrivNameDirty() {
        if (this._contains(DTOFIELD_USERPSDEOPPRIVNAME)) {
            return true;
        }
        return this._contains(FIELD_USERPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetUserPSDEOPPrivName() {
        this._reset(DTOFIELD_USERPSDEOPPRIVNAME);
        this._reset(FIELD_USERPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSACHandlerDTO userpsdeopprivname(String userPSDEOPPrivName) {
        this.setUserPSDEOPPrivName(userPSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO usertag(String userTag) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO usertag2(String userTag2) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO usertag3(String userTag3) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSACHandlerDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSACHandlerId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSACHandlerId(strValue);
    }

    @JsonIgnore
    public PSACHandlerDTO id(String strValue) {
        this.setPSACHandlerId(strValue);
        return this;
    }
}
