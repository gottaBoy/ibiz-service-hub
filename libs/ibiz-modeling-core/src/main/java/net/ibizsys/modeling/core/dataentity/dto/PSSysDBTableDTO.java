package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBTableDTO
extends PSModelDTOBase {
    public static final String FIELD_AUTOEXTENDMODEL = "AUTOEXTENDMODEL";
    protected static final String DTOFIELD_AUTOEXTENDMODEL = "autoextendmodel";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATESQL = "CREATESQL";
    protected static final String DTOFIELD_CREATESQL = "createsql";
    public static final String FIELD_DROPSQL = "DROPSQL";
    protected static final String DTOFIELD_DROPSQL = "dropsql";
    public static final String FIELD_DSLINK = "DSLINK";
    protected static final String DTOFIELD_DSLINK = "dslink";
    public static final String FIELD_EXISTINGMODEL = "EXISTINGMODEL";
    protected static final String DTOFIELD_EXISTINGMODEL = "existingmodel";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSYSDBSCHEMEID = "PSSYSDBSCHEMEID";
    protected static final String DTOFIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";
    public static final String FIELD_PSSYSDBSCHEMENAME = "PSSYSDBSCHEMENAME";
    protected static final String DTOFIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";
    public static final String FIELD_PSSYSDBTABLEID = "PSSYSDBTABLEID";
    protected static final String DTOFIELD_PSSYSDBTABLEID = "pssysdbtableid";
    public static final String FIELD_PSSYSDBTABLENAME = "PSSYSDBTABLENAME";
    protected static final String DTOFIELD_PSSYSDBTABLENAME = "pssysdbtablename";
    public static final String FIELD_TABDESC = "TABDESC";
    protected static final String DTOFIELD_TABDESC = "tabdesc";
    public static final String FIELD_TABLETAG = "TABLETAG";
    protected static final String DTOFIELD_TABLETAG = "tabletag";
    public static final String FIELD_TABLETAG2 = "TABLETAG2";
    protected static final String DTOFIELD_TABLETAG2 = "tabletag2";
    public static final String FIELD_TABLETYPE = "TABLETYPE";
    protected static final String DTOFIELD_TABLETYPE = "tabletype";
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

    @JsonProperty(value="autoextendmodel")
    public void setAutoExtendModel(Integer autoExtendModel) {
        this._set(DTOFIELD_AUTOEXTENDMODEL, autoExtendModel);
    }

    @JsonIgnore
    public Integer getAutoExtendModel() {
        Object objValue = this._get(DTOFIELD_AUTOEXTENDMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAutoExtendModelDirty() {
        return this._contains(DTOFIELD_AUTOEXTENDMODEL);
    }

    @JsonIgnore
    public void resetAutoExtendModel() {
        this._reset(DTOFIELD_AUTOEXTENDMODEL);
    }

    @JsonIgnore
    public PSSysDBTableDTO autoextendmodel(Integer autoExtendModel) {
        this.setAutoExtendModel(autoExtendModel);
        return this;
    }

    @JsonIgnore
    public PSSysDBTableDTO autoextendmodel(Boolean autoExtendModel) {
        if (autoExtendModel == null) {
            this.setAutoExtendModel(null);
        } else {
            this.setAutoExtendModel(autoExtendModel != false ? 1 : 0);
        }
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
    public PSSysDBTableDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSSysDBTableDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
    public PSSysDBTableDTO createdate(Timestamp createDate) {
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
    public PSSysDBTableDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createsql")
    public void setCreateSql(String createSql) {
        this._set(DTOFIELD_CREATESQL, createSql);
    }

    @JsonIgnore
    public String getCreateSql() {
        Object objValue = this._get(DTOFIELD_CREATESQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateSqlDirty() {
        return this._contains(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public void resetCreateSql() {
        this._reset(DTOFIELD_CREATESQL);
    }

    @JsonIgnore
    public PSSysDBTableDTO createsql(String createSql) {
        this.setCreateSql(createSql);
        return this;
    }

    @JsonProperty(value="dropsql")
    public void setDropSql(String dropSql) {
        this._set(DTOFIELD_DROPSQL, dropSql);
    }

    @JsonIgnore
    public String getDropSql() {
        Object objValue = this._get(DTOFIELD_DROPSQL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDropSqlDirty() {
        return this._contains(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public void resetDropSql() {
        this._reset(DTOFIELD_DROPSQL);
    }

    @JsonIgnore
    public PSSysDBTableDTO dropsql(String dropSql) {
        this.setDropSql(dropSql);
        return this;
    }

    @JsonProperty(value="dslink")
    public void setDSLink(String dSLink) {
        this._set(DTOFIELD_DSLINK, dSLink);
    }

    @JsonIgnore
    public String getDSLink() {
        Object objValue = this._get(DTOFIELD_DSLINK);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDSLinkDirty() {
        return this._contains(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public void resetDSLink() {
        this._reset(DTOFIELD_DSLINK);
    }

    @JsonIgnore
    public PSSysDBTableDTO dslink(String dSLink) {
        this.setDSLink(dSLink);
        return this;
    }

    @JsonProperty(value="existingmodel")
    public void setExistingModel(Integer existingModel) {
        this._set(DTOFIELD_EXISTINGMODEL, existingModel);
    }

    @JsonIgnore
    public Integer getExistingModel() {
        Object objValue = this._get(DTOFIELD_EXISTINGMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExistingModelDirty() {
        return this._contains(DTOFIELD_EXISTINGMODEL);
    }

    @JsonIgnore
    public void resetExistingModel() {
        this._reset(DTOFIELD_EXISTINGMODEL);
    }

    @JsonIgnore
    public PSSysDBTableDTO existingmodel(Integer existingModel) {
        this.setExistingModel(existingModel);
        return this;
    }

    @JsonIgnore
    public PSSysDBTableDTO existingmodel(Boolean existingModel) {
        if (existingModel == null) {
            this.setExistingModel(null);
        } else {
            this.setExistingModel(existingModel != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
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
    public PSSysDBTableDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSSysDBTableDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssysdbschemeid")
    public void setPSSysDBSchemeId(String pSSysDBSchemeId) {
        this._set(DTOFIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }

    @JsonIgnore
    public String getPSSysDBSchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeId() {
        this._reset(DTOFIELD_PSSYSDBSCHEMEID);
    }

    @JsonIgnore
    public PSSysDBTableDTO pssysdbschemeid(String pSSysDBSchemeId) {
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysDBTableDTO pssysdbschemeid(PSSysDBSchemeDTO pSSysDBScheme) {
        if (pSSysDBScheme == null) {
            this.setDSLink(null);
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        } else {
            this.setDSLink(pSSysDBScheme.getDSLink());
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbschemename")
    public void setPSSysDBSchemeName(String pSSysDBSchemeName) {
        this._set(DTOFIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }

    @JsonIgnore
    public String getPSSysDBSchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBSCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysDBSchemeName() {
        this._reset(DTOFIELD_PSSYSDBSCHEMENAME);
    }

    @JsonIgnore
    public PSSysDBTableDTO pssysdbschemename(String pSSysDBSchemeName) {
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
        return this;
    }

    @JsonProperty(value="pssysdbtableid")
    public void setPSSysDBTableId(String pSSysDBTableId) {
        this._set(DTOFIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }

    @JsonIgnore
    public String getPSSysDBTableId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public void resetPSSysDBTableId() {
        this._reset(DTOFIELD_PSSYSDBTABLEID);
    }

    @JsonIgnore
    public PSSysDBTableDTO pssysdbtableid(String pSSysDBTableId) {
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    @JsonProperty(value="pssysdbtablename")
    public void setPSSysDBTableName(String pSSysDBTableName) {
        this._set(DTOFIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }

    @JsonIgnore
    public String getPSSysDBTableName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBTableNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public void resetPSSysDBTableName() {
        this._reset(DTOFIELD_PSSYSDBTABLENAME);
    }

    @JsonIgnore
    public PSSysDBTableDTO pssysdbtablename(String pSSysDBTableName) {
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBTableName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBTableName(strName);
    }

    @JsonIgnore
    public PSSysDBTableDTO name(String strName) {
        this.setPSSysDBTableName(strName);
        return this;
    }

    @JsonProperty(value="tabdesc")
    public void setTabDesc(String tabDesc) {
        this._set(DTOFIELD_TABDESC, tabDesc);
    }

    @JsonIgnore
    public String getTabDesc() {
        Object objValue = this._get(DTOFIELD_TABDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTabDescDirty() {
        return this._contains(DTOFIELD_TABDESC);
    }

    @JsonIgnore
    public void resetTabDesc() {
        this._reset(DTOFIELD_TABDESC);
    }

    @JsonIgnore
    public PSSysDBTableDTO tabdesc(String tabDesc) {
        this.setTabDesc(tabDesc);
        return this;
    }

    @JsonProperty(value="tabletag")
    public void setTableTag(String tableTag) {
        this._set(DTOFIELD_TABLETAG, tableTag);
    }

    @JsonIgnore
    public String getTableTag() {
        Object objValue = this._get(DTOFIELD_TABLETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableTagDirty() {
        return this._contains(DTOFIELD_TABLETAG);
    }

    @JsonIgnore
    public void resetTableTag() {
        this._reset(DTOFIELD_TABLETAG);
    }

    @JsonIgnore
    public PSSysDBTableDTO tabletag(String tableTag) {
        this.setTableTag(tableTag);
        return this;
    }

    @JsonProperty(value="tabletag2")
    public void setTableTag2(String tableTag2) {
        this._set(DTOFIELD_TABLETAG2, tableTag2);
    }

    @JsonIgnore
    public String getTableTag2() {
        Object objValue = this._get(DTOFIELD_TABLETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableTag2Dirty() {
        return this._contains(DTOFIELD_TABLETAG2);
    }

    @JsonIgnore
    public void resetTableTag2() {
        this._reset(DTOFIELD_TABLETAG2);
    }

    @JsonIgnore
    public PSSysDBTableDTO tabletag2(String tableTag2) {
        this.setTableTag2(tableTag2);
        return this;
    }

    @JsonProperty(value="tabletype")
    public void setTableType(String tableType) {
        this._set(DTOFIELD_TABLETYPE, tableType);
    }

    @JsonIgnore
    public String getTableType() {
        Object objValue = this._get(DTOFIELD_TABLETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableTypeDirty() {
        return this._contains(DTOFIELD_TABLETYPE);
    }

    @JsonIgnore
    public void resetTableType() {
        this._reset(DTOFIELD_TABLETYPE);
    }

    @JsonIgnore
    public PSSysDBTableDTO tabletype(String tableType) {
        this.setTableType(tableType);
        return this;
    }

    @JsonIgnore
    public PSSysDBTableDTO tabletype(PSModelEnums.DBTableType tableType) {
        if (tableType == null) {
            this.setTableType(null);
        } else {
            this.setTableType(tableType.value);
        }
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
    public PSSysDBTableDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBTableDTO updateman(String updateMan) {
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
    public PSSysDBTableDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDBTableDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
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
    public PSSysDBTableDTO usertag(String userTag) {
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
    public PSSysDBTableDTO usertag2(String userTag2) {
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
    public PSSysDBTableDTO usertag3(String userTag3) {
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
    public PSSysDBTableDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBTableId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBTableId(strValue);
    }

    @JsonIgnore
    public PSSysDBTableDTO id(String strValue) {
        this.setPSSysDBTableId(strValue);
        return this;
    }
}
