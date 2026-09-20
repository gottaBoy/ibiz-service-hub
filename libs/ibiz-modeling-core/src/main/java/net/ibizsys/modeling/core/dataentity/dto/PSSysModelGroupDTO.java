package net.ibizsys.modeling.core.dataentity.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * System model group DTO.
 */
public class PSSysModelGroupDTO extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_CLSPKGPARAMS = "CLSPKGPARAMS";
    protected static final String DTOFIELD_CLSPKGPARAMS = "clspkgparams";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAMEMODE = "CODENAMEMODE";
    protected static final String DTOFIELD_CODENAMEMODE = "codenamemode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DTOFORMAT = "DTOFORMAT";
    protected static final String DTOFIELD_DTOFORMAT = "dtoformat";
    public static final String FIELD_DYNAINSTTAG = "DYNAINSTTAG";
    protected static final String DTOFIELD_DYNAINSTTAG = "dynainsttag";
    public static final String FIELD_DYNAINSTTAG2 = "DYNAINSTTAG2";
    protected static final String DTOFIELD_DYNAINSTTAG2 = "dynainsttag2";
    public static final String FIELD_ENABLEPQL = "ENABLEPQL";
    protected static final String DTOFIELD_ENABLEPQL = "enablepql";
    public static final String FIELD_GROUPPARAMS = "GROUPPARAMS";
    protected static final String DTOFIELD_GROUPPARAMS = "groupparams";
    public static final String FIELD_GROUPTAG = "GROUPTAG";
    protected static final String DTOFIELD_GROUPTAG = "grouptag";
    public static final String FIELD_GROUPTAG2 = "GROUPTAG2";
    protected static final String DTOFIELD_GROUPTAG2 = "grouptag2";
    public static final String FIELD_GROUPTAG3 = "GROUPTAG3";
    protected static final String DTOFIELD_GROUPTAG3 = "grouptag3";
    public static final String FIELD_GROUPTAG4 = "GROUPTAG4";
    protected static final String DTOFIELD_GROUPTAG4 = "grouptag4";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PFRTOBJECTREPO = "PFRTOBJECTREPO";
    protected static final String DTOFIELD_PFRTOBJECTREPO = "pfrtobjectrepo";
    public static final String FIELD_PKGCODENAME = "PKGCODENAME";
    protected static final String DTOFIELD_PKGCODENAME = "pkgcodename";
    public static final String FIELD_PSSYSMODELGROUPID = "PSSYSMODELGROUPID";
    protected static final String DTOFIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";
    public static final String FIELD_PSSYSMODELGROUPNAME = "PSSYSMODELGROUPNAME";
    protected static final String DTOFIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";
    public static final String FIELD_RUNTIMETYPE = "RUNTIMETYPE";
    protected static final String DTOFIELD_RUNTIMETYPE = "runtimetype";
    public static final String FIELD_SFRTOBJECTREPO = "SFRTOBJECTREPO";
    protected static final String DTOFIELD_SFRTOBJECTREPO = "sfrtobjectrepo";
    public static final String FIELD_SYNCMODE = "SYNCMODE";
    protected static final String DTOFIELD_SYNCMODE = "syncmode";
    public static final String FIELD_SYSMODELFROM = "SYSMODELFROM";
    protected static final String DTOFIELD_SYSMODELFROM = "sysmodelfrom";
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

    @JsonProperty("clspkgparams")
    public void setClsPkgParams(String value) { _set(DTOFIELD_CLSPKGPARAMS, value); }
    @JsonIgnore public String getClsPkgParams() { return (String) _get(DTOFIELD_CLSPKGPARAMS); }
    @JsonIgnore public boolean isClsPkgParamsDirty() { return _contains(DTOFIELD_CLSPKGPARAMS); }
    @JsonIgnore public void resetClsPkgParams() { _reset(DTOFIELD_CLSPKGPARAMS); }
    @JsonIgnore public PSSysModelGroupDTO clspkgparams(String value) { setClsPkgParams(value); return this; }

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }
    @JsonIgnore public PSSysModelGroupDTO codename(String value) { setCodeName(value); return this; }

    @JsonProperty("codenamemode")
    public void setCodeNameMode(String value) { _set(DTOFIELD_CODENAMEMODE, value); }
    @JsonIgnore public String getCodeNameMode() { return (String) _get(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public boolean isCodeNameModeDirty() { return _contains(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public void resetCodeNameMode() { _reset(DTOFIELD_CODENAMEMODE); }
    @JsonIgnore public PSSysModelGroupDTO codenamemode(String value) { setCodeNameMode(value); return this; }
    @JsonIgnore public PSSysModelGroupDTO codenamemode(PSModelEnums.CodeNameMode value) {
        setCodeNameMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("createdate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp value) { _set(DTOFIELD_CREATEDATE, value); }
    @JsonIgnore public Timestamp getCreateDate() { return (Timestamp) _get(DTOFIELD_CREATEDATE); }
    @JsonIgnore public boolean isCreateDateDirty() { return _contains(DTOFIELD_CREATEDATE); }
    @JsonIgnore public void resetCreateDate() { _reset(DTOFIELD_CREATEDATE); }
    @JsonIgnore public PSSysModelGroupDTO createdate(Timestamp value) { setCreateDate(value); return this; }

    @JsonProperty("createman")
    public void setCreateMan(String value) { _set(DTOFIELD_CREATEMAN, value); }
    @JsonIgnore public String getCreateMan() { return (String) _get(DTOFIELD_CREATEMAN); }
    @JsonIgnore public boolean isCreateManDirty() { return _contains(DTOFIELD_CREATEMAN); }
    @JsonIgnore public void resetCreateMan() { _reset(DTOFIELD_CREATEMAN); }
    @JsonIgnore public PSSysModelGroupDTO createman(String value) { setCreateMan(value); return this; }

    @JsonProperty("dtoformat")
    public void setDTOFormat(String value) { _set(DTOFIELD_DTOFORMAT, value); }
    @JsonIgnore public String getDTOFormat() { return (String) _get(DTOFIELD_DTOFORMAT); }
    @JsonIgnore public boolean isDTOFormatDirty() { return _contains(DTOFIELD_DTOFORMAT); }
    @JsonIgnore public void resetDTOFormat() { _reset(DTOFIELD_DTOFORMAT); }
    @JsonIgnore public PSSysModelGroupDTO dtoformat(String value) { setDTOFormat(value); return this; }

    @JsonProperty("dynainsttag")
    public void setDynaInstTag(String value) { _set(DTOFIELD_DYNAINSTTAG, value); }
    @JsonIgnore public String getDynaInstTag() { return (String) _get(DTOFIELD_DYNAINSTTAG); }
    @JsonIgnore public boolean isDynaInstTagDirty() { return _contains(DTOFIELD_DYNAINSTTAG); }
    @JsonIgnore public void resetDynaInstTag() { _reset(DTOFIELD_DYNAINSTTAG); }
    @JsonIgnore public PSSysModelGroupDTO dynainsttag(String value) { setDynaInstTag(value); return this; }

    @JsonProperty("dynainsttag2")
    public void setDynaInstTag2(String value) { _set(DTOFIELD_DYNAINSTTAG2, value); }
    @JsonIgnore public String getDynaInstTag2() { return (String) _get(DTOFIELD_DYNAINSTTAG2); }
    @JsonIgnore public boolean isDynaInstTag2Dirty() { return _contains(DTOFIELD_DYNAINSTTAG2); }
    @JsonIgnore public void resetDynaInstTag2() { _reset(DTOFIELD_DYNAINSTTAG2); }
    @JsonIgnore public PSSysModelGroupDTO dynainsttag2(String value) { setDynaInstTag2(value); return this; }

    @JsonProperty("enablepql")
    public void setEnablePQL(Integer value) { _set(DTOFIELD_ENABLEPQL, value); }
    @JsonIgnore public Integer getEnablePQL() { return (Integer) _get(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public boolean isEnablePQLDirty() { return _contains(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public void resetEnablePQL() { _reset(DTOFIELD_ENABLEPQL); }
    @JsonIgnore public PSSysModelGroupDTO enablepql(Integer value) { setEnablePQL(value); return this; }
    @JsonIgnore public PSSysModelGroupDTO enablepql(Boolean value) {
        setEnablePQL(flagValue(value)); return this;
    }

    @JsonProperty("groupparams")
    public void setGroupParams(String value) { _set(DTOFIELD_GROUPPARAMS, value); }
    @JsonIgnore public String getGroupParams() { return (String) _get(DTOFIELD_GROUPPARAMS); }
    @JsonIgnore public boolean isGroupParamsDirty() { return _contains(DTOFIELD_GROUPPARAMS); }
    @JsonIgnore public void resetGroupParams() { _reset(DTOFIELD_GROUPPARAMS); }
    @JsonIgnore public PSSysModelGroupDTO groupparams(String value) { setGroupParams(value); return this; }

    @JsonProperty("grouptag")
    public void setGroupTag(String value) { _set(DTOFIELD_GROUPTAG, value); }
    @JsonIgnore public String getGroupTag() { return (String) _get(DTOFIELD_GROUPTAG); }
    @JsonIgnore public boolean isGroupTagDirty() { return _contains(DTOFIELD_GROUPTAG); }
    @JsonIgnore public void resetGroupTag() { _reset(DTOFIELD_GROUPTAG); }
    @JsonIgnore public PSSysModelGroupDTO grouptag(String value) { setGroupTag(value); return this; }

    @JsonProperty("grouptag2")
    public void setGroupTag2(String value) { _set(DTOFIELD_GROUPTAG2, value); }
    @JsonIgnore public String getGroupTag2() { return (String) _get(DTOFIELD_GROUPTAG2); }
    @JsonIgnore public boolean isGroupTag2Dirty() { return _contains(DTOFIELD_GROUPTAG2); }
    @JsonIgnore public void resetGroupTag2() { _reset(DTOFIELD_GROUPTAG2); }
    @JsonIgnore public PSSysModelGroupDTO grouptag2(String value) { setGroupTag2(value); return this; }

    @JsonProperty("grouptag3")
    public void setGroupTag3(String value) { _set(DTOFIELD_GROUPTAG3, value); }
    @JsonIgnore public String getGroupTag3() { return (String) _get(DTOFIELD_GROUPTAG3); }
    @JsonIgnore public boolean isGroupTag3Dirty() { return _contains(DTOFIELD_GROUPTAG3); }
    @JsonIgnore public void resetGroupTag3() { _reset(DTOFIELD_GROUPTAG3); }
    @JsonIgnore public PSSysModelGroupDTO grouptag3(String value) { setGroupTag3(value); return this; }

    @JsonProperty("grouptag4")
    public void setGroupTag4(String value) { _set(DTOFIELD_GROUPTAG4, value); }
    @JsonIgnore public String getGroupTag4() { return (String) _get(DTOFIELD_GROUPTAG4); }
    @JsonIgnore public boolean isGroupTag4Dirty() { return _contains(DTOFIELD_GROUPTAG4); }
    @JsonIgnore public void resetGroupTag4() { _reset(DTOFIELD_GROUPTAG4); }
    @JsonIgnore public PSSysModelGroupDTO grouptag4(String value) { setGroupTag4(value); return this; }

    @JsonProperty("memo")
    public void setMemo(String value) { _set(DTOFIELD_MEMO, value); }
    @JsonIgnore public String getMemo() { return (String) _get(DTOFIELD_MEMO); }
    @JsonIgnore public boolean isMemoDirty() { return _contains(DTOFIELD_MEMO); }
    @JsonIgnore public void resetMemo() { _reset(DTOFIELD_MEMO); }
    @JsonIgnore public PSSysModelGroupDTO memo(String value) { setMemo(value); return this; }

    @JsonProperty("pfrtobjectrepo")
    public void setPFRTObjectRepo(String value) { _set(DTOFIELD_PFRTOBJECTREPO, value); }
    @JsonIgnore public String getPFRTObjectRepo() { return (String) _get(DTOFIELD_PFRTOBJECTREPO); }
    @JsonIgnore public boolean isPFRTObjectRepoDirty() { return _contains(DTOFIELD_PFRTOBJECTREPO); }
    @JsonIgnore public void resetPFRTObjectRepo() { _reset(DTOFIELD_PFRTOBJECTREPO); }
    @JsonIgnore public PSSysModelGroupDTO pfrtobjectrepo(String value) { setPFRTObjectRepo(value); return this; }

    @JsonProperty("pkgcodename")
    public void setPKGCodeName(String value) { _set(DTOFIELD_PKGCODENAME, value); }
    @JsonIgnore public String getPKGCodeName() { return (String) _get(DTOFIELD_PKGCODENAME); }
    @JsonIgnore public boolean isPKGCodeNameDirty() { return _contains(DTOFIELD_PKGCODENAME); }
    @JsonIgnore public void resetPKGCodeName() { _reset(DTOFIELD_PKGCODENAME); }
    @JsonIgnore public PSSysModelGroupDTO pkgcodename(String value) { setPKGCodeName(value); return this; }

    @JsonProperty("pssysmodelgroupid")
    public void setPSSysModelGroupId(String value) { _set(DTOFIELD_PSSYSMODELGROUPID, value); }
    @JsonIgnore public String getPSSysModelGroupId() { return (String) _get(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public boolean isPSSysModelGroupIdDirty() { return _contains(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public void resetPSSysModelGroupId() { _reset(DTOFIELD_PSSYSMODELGROUPID); }
    @JsonIgnore public PSSysModelGroupDTO pssysmodelgroupid(String value) {
        setPSSysModelGroupId(value); return this;
    }

    @JsonProperty("pssysmodelgroupname")
    public void setPSSysModelGroupName(String value) { _set(DTOFIELD_PSSYSMODELGROUPNAME, value); }
    @JsonIgnore public String getPSSysModelGroupName() { return (String) _get(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public boolean isPSSysModelGroupNameDirty() { return _contains(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public void resetPSSysModelGroupName() { _reset(DTOFIELD_PSSYSMODELGROUPNAME); }
    @JsonIgnore public PSSysModelGroupDTO pssysmodelgroupname(String value) {
        setPSSysModelGroupName(value); return this;
    }
    @JsonIgnore public String getName() { return getPSSysModelGroupName(); }
    @JsonIgnore public void setName(String value) { setPSSysModelGroupName(value); }
    @JsonIgnore public PSSysModelGroupDTO name(String value) { setPSSysModelGroupName(value); return this; }

    @JsonProperty("runtimetype")
    public void setRuntimeType(String value) { _set(DTOFIELD_RUNTIMETYPE, value); }
    @JsonIgnore public String getRuntimeType() { return (String) _get(DTOFIELD_RUNTIMETYPE); }
    @JsonIgnore public boolean isRuntimeTypeDirty() { return _contains(DTOFIELD_RUNTIMETYPE); }
    @JsonIgnore public void resetRuntimeType() { _reset(DTOFIELD_RUNTIMETYPE); }
    @JsonIgnore public PSSysModelGroupDTO runtimetype(String value) { setRuntimeType(value); return this; }

    @JsonProperty("sfrtobjectrepo")
    public void setSFRTObjectRepo(String value) { _set(DTOFIELD_SFRTOBJECTREPO, value); }
    @JsonIgnore public String getSFRTObjectRepo() { return (String) _get(DTOFIELD_SFRTOBJECTREPO); }
    @JsonIgnore public boolean isSFRTObjectRepoDirty() { return _contains(DTOFIELD_SFRTOBJECTREPO); }
    @JsonIgnore public void resetSFRTObjectRepo() { _reset(DTOFIELD_SFRTOBJECTREPO); }
    @JsonIgnore public PSSysModelGroupDTO sfrtobjectrepo(String value) { setSFRTObjectRepo(value); return this; }

    @JsonProperty("syncmode")
    public void setSyncMode(String value) { _set(DTOFIELD_SYNCMODE, value); }
    @JsonIgnore public String getSyncMode() { return (String) _get(DTOFIELD_SYNCMODE); }
    @JsonIgnore public boolean isSyncModeDirty() { return _contains(DTOFIELD_SYNCMODE); }
    @JsonIgnore public void resetSyncMode() { _reset(DTOFIELD_SYNCMODE); }
    @JsonIgnore public PSSysModelGroupDTO syncmode(String value) { setSyncMode(value); return this; }
    @JsonIgnore public PSSysModelGroupDTO syncmode(PSModelEnums.ModelSyncMode value) {
        setSyncMode(value == null ? null : value.value); return this;
    }

    @JsonProperty("sysmodelfrom")
    public void setSysModelFrom(String value) { _set(DTOFIELD_SYSMODELFROM, value); }
    @JsonIgnore public String getSysModelFrom() { return (String) _get(DTOFIELD_SYSMODELFROM); }
    @JsonIgnore public boolean isSysModelFromDirty() { return _contains(DTOFIELD_SYSMODELFROM); }
    @JsonIgnore public void resetSysModelFrom() { _reset(DTOFIELD_SYSMODELFROM); }
    @JsonIgnore public PSSysModelGroupDTO sysmodelfrom(String value) { setSysModelFrom(value); return this; }
    @JsonIgnore public PSSysModelGroupDTO sysmodelfrom(PSModelEnums.ModelRepoFrom value) {
        setSysModelFrom(value == null ? null : value.value); return this;
    }

    @JsonProperty("updatedate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp value) { _set(DTOFIELD_UPDATEDATE, value); }
    @JsonIgnore public Timestamp getUpdateDate() { return (Timestamp) _get(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public boolean isUpdateDateDirty() { return _contains(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public void resetUpdateDate() { _reset(DTOFIELD_UPDATEDATE); }
    @JsonIgnore public PSSysModelGroupDTO updatedate(Timestamp value) { setUpdateDate(value); return this; }

    @JsonProperty("updateman")
    public void setUpdateMan(String value) { _set(DTOFIELD_UPDATEMAN, value); }
    @JsonIgnore public String getUpdateMan() { return (String) _get(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public boolean isUpdateManDirty() { return _contains(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public void resetUpdateMan() { _reset(DTOFIELD_UPDATEMAN); }
    @JsonIgnore public PSSysModelGroupDTO updateman(String value) { setUpdateMan(value); return this; }

    @JsonProperty("usercat")
    public void setUserCat(String value) { _set(DTOFIELD_USERCAT, value); }
    @JsonIgnore public String getUserCat() { return (String) _get(DTOFIELD_USERCAT); }
    @JsonIgnore public boolean isUserCatDirty() { return _contains(DTOFIELD_USERCAT); }
    @JsonIgnore public void resetUserCat() { _reset(DTOFIELD_USERCAT); }
    @JsonIgnore public PSSysModelGroupDTO usercat(String value) { setUserCat(value); return this; }
    @JsonIgnore public PSSysModelGroupDTO usercat(PSModelEnums.ModelUserCat value) {
        setUserCat(value == null ? null : value.value); return this;
    }

    @JsonProperty("usertag")
    public void setUserTag(String value) { _set(DTOFIELD_USERTAG, value); }
    @JsonIgnore public String getUserTag() { return (String) _get(DTOFIELD_USERTAG); }
    @JsonIgnore public boolean isUserTagDirty() { return _contains(DTOFIELD_USERTAG); }
    @JsonIgnore public void resetUserTag() { _reset(DTOFIELD_USERTAG); }
    @JsonIgnore public PSSysModelGroupDTO usertag(String value) { setUserTag(value); return this; }

    @JsonProperty("usertag2")
    public void setUserTag2(String value) { _set(DTOFIELD_USERTAG2, value); }
    @JsonIgnore public String getUserTag2() { return (String) _get(DTOFIELD_USERTAG2); }
    @JsonIgnore public boolean isUserTag2Dirty() { return _contains(DTOFIELD_USERTAG2); }
    @JsonIgnore public void resetUserTag2() { _reset(DTOFIELD_USERTAG2); }
    @JsonIgnore public PSSysModelGroupDTO usertag2(String value) { setUserTag2(value); return this; }

    @JsonProperty("usertag3")
    public void setUserTag3(String value) { _set(DTOFIELD_USERTAG3, value); }
    @JsonIgnore public String getUserTag3() { return (String) _get(DTOFIELD_USERTAG3); }
    @JsonIgnore public boolean isUserTag3Dirty() { return _contains(DTOFIELD_USERTAG3); }
    @JsonIgnore public void resetUserTag3() { _reset(DTOFIELD_USERTAG3); }
    @JsonIgnore public PSSysModelGroupDTO usertag3(String value) { setUserTag3(value); return this; }

    @JsonProperty("usertag4")
    public void setUserTag4(String value) { _set(DTOFIELD_USERTAG4, value); }
    @JsonIgnore public String getUserTag4() { return (String) _get(DTOFIELD_USERTAG4); }
    @JsonIgnore public boolean isUserTag4Dirty() { return _contains(DTOFIELD_USERTAG4); }
    @JsonIgnore public void resetUserTag4() { _reset(DTOFIELD_USERTAG4); }
    @JsonIgnore public PSSysModelGroupDTO usertag4(String value) { setUserTag4(value); return this; }

    @JsonIgnore public String getId() { return getPSSysModelGroupId(); }
    @JsonIgnore public void setId(String value) { setPSSysModelGroupId(value); }
    @JsonIgnore public PSSysModelGroupDTO id(String value) { setPSSysModelGroupId(value); return this; }

    private static Integer flagValue(Boolean value) {
        return value == null ? null : (value ? 1 : 0);
    }
}