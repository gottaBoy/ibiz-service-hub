/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DBObjNameCaseMode
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDBCfgDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXTABLENAME = "EXTABLENAME";
    protected static final String DTOFIELD_EXTABLENAME = "extablename";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_OBJNAMECASE = "OBJNAMECASE";
    protected static final String DTOFIELD_OBJNAMECASE = "objnamecase";
    public static final String FIELD_PSDEDBCFGID = "PSDEDBCFGID";
    protected static final String DTOFIELD_PSDEDBCFGID = "psdedbcfgid";
    public static final String FIELD_PSDEDBCFGNAME = "PSDEDBCFGNAME";
    protected static final String DTOFIELD_PSDEDBCFGNAME = "psdedbcfgname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PUBMODEL = "PUBMODEL";
    protected static final String DTOFIELD_PUBMODEL = "pubmodel";
    public static final String FIELD_TABLENAME = "TABLENAME";
    protected static final String DTOFIELD_TABLENAME = "tablename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERPARAMS = "USERPARAMS";
    protected static final String DTOFIELD_USERPARAMS = "userparams";
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
    public static final String FIELD_VIEWNAME = "VIEWNAME";
    protected static final String DTOFIELD_VIEWNAME = "viewname";
    public static final String FIELD_VIEWNAME2 = "VIEWNAME2";
    protected static final String DTOFIELD_VIEWNAME2 = "viewname2";
    public static final String FIELD_VIEWNAME3 = "VIEWNAME3";
    protected static final String DTOFIELD_VIEWNAME3 = "viewname3";
    public static final String FIELD_VIEWNAME4 = "VIEWNAME4";
    protected static final String DTOFIELD_VIEWNAME4 = "viewname4";

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
    public PSDEDBCfgDTO createdate(Timestamp createDate) {
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
    public PSDEDBCfgDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="extablename")
    public void setExTableName(String exTableName) {
        this._set(DTOFIELD_EXTABLENAME, exTableName);
    }

    @JsonIgnore
    public String getExTableName() {
        Object objValue = this._get(DTOFIELD_EXTABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExTableNameDirty() {
        return this._contains(DTOFIELD_EXTABLENAME);
    }

    @JsonIgnore
    public void resetExTableName() {
        this._reset(DTOFIELD_EXTABLENAME);
    }

    @JsonIgnore
    public PSDEDBCfgDTO extablename(String exTableName) {
        this.setExTableName(exTableName);
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
    public PSDEDBCfgDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="objnamecase")
    public void setObjNameCase(String objNameCase) {
        this._set(DTOFIELD_OBJNAMECASE, objNameCase);
    }

    @JsonIgnore
    public String getObjNameCase() {
        Object objValue = this._get(DTOFIELD_OBJNAMECASE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isObjNameCaseDirty() {
        return this._contains(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public void resetObjNameCase() {
        this._reset(DTOFIELD_OBJNAMECASE);
    }

    @JsonIgnore
    public PSDEDBCfgDTO objnamecase(String objNameCase) {
        this.setObjNameCase(objNameCase);
        return this;
    }

    @JsonIgnore
    public PSDEDBCfgDTO objnamecase(PSModelEnums.DBObjNameCaseMode objNameCase) {
        if (objNameCase == null) {
            this.setObjNameCase(null);
        } else {
            this.setObjNameCase(objNameCase.value);
        }
        return this;
    }

    @JsonProperty(value="psdedbcfgid")
    public void setPSDEDBCfgId(String pSDEDBCfgId) {
        this._set(DTOFIELD_PSDEDBCFGID, pSDEDBCfgId);
    }

    @JsonIgnore
    public String getPSDEDBCfgId() {
        Object objValue = this._get(DTOFIELD_PSDEDBCFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBCfgIdDirty() {
        return this._contains(DTOFIELD_PSDEDBCFGID);
    }

    @JsonIgnore
    public void resetPSDEDBCfgId() {
        this._reset(DTOFIELD_PSDEDBCFGID);
    }

    @JsonIgnore
    public PSDEDBCfgDTO psdedbcfgid(String pSDEDBCfgId) {
        this.setPSDEDBCfgId(pSDEDBCfgId);
        return this;
    }

    @JsonProperty(value="psdedbcfgname")
    public void setPSDEDBCfgName(String pSDEDBCfgName) {
        this._set(DTOFIELD_PSDEDBCFGNAME, pSDEDBCfgName);
    }

    @JsonIgnore
    public String getPSDEDBCfgName() {
        Object objValue = this._get(DTOFIELD_PSDEDBCFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBCfgNameDirty() {
        return this._contains(DTOFIELD_PSDEDBCFGNAME);
    }

    @JsonIgnore
    public void resetPSDEDBCfgName() {
        this._reset(DTOFIELD_PSDEDBCFGNAME);
    }

    @JsonIgnore
    public PSDEDBCfgDTO psdedbcfgname(String pSDEDBCfgName) {
        this.setPSDEDBCfgName(pSDEDBCfgName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDBCfgName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDBCfgName(strName);
    }

    @JsonIgnore
    public PSDEDBCfgDTO name(String strName) {
        this.setPSDEDBCfgName(strName);
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
    public PSDEDBCfgDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDBCfgDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDBCfgDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pubmodel")
    public void setPubModel(Integer pubModel) {
        this._set(DTOFIELD_PUBMODEL, pubModel);
    }

    @JsonIgnore
    public Integer getPubModel() {
        Object objValue = this._get(DTOFIELD_PUBMODEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubModelDirty() {
        return this._contains(DTOFIELD_PUBMODEL);
    }

    @JsonIgnore
    public void resetPubModel() {
        this._reset(DTOFIELD_PUBMODEL);
    }

    @JsonIgnore
    public PSDEDBCfgDTO pubmodel(Integer pubModel) {
        this.setPubModel(pubModel);
        return this;
    }

    @JsonIgnore
    public PSDEDBCfgDTO pubmodel(Boolean pubModel) {
        if (pubModel == null) {
            this.setPubModel(null);
        } else {
            this.setPubModel(pubModel != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="tablename")
    public void setTableName(String tableName) {
        this._set(DTOFIELD_TABLENAME, tableName);
    }

    @JsonIgnore
    public String getTableName() {
        Object objValue = this._get(DTOFIELD_TABLENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTableNameDirty() {
        return this._contains(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public void resetTableName() {
        this._reset(DTOFIELD_TABLENAME);
    }

    @JsonIgnore
    public PSDEDBCfgDTO tablename(String tableName) {
        this.setTableName(tableName);
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
    public PSDEDBCfgDTO updatedate(Timestamp updateDate) {
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
    public PSDEDBCfgDTO updateman(String updateMan) {
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
    public PSDEDBCfgDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDBCfgDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDBCfgDTO userparams(String userParams) {
        this.setUserParams(userParams);
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
    public PSDEDBCfgDTO usertag(String userTag) {
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
    public PSDEDBCfgDTO usertag2(String userTag2) {
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
    public PSDEDBCfgDTO usertag3(String userTag3) {
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
    public PSDEDBCfgDTO usertag4(String userTag4) {
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
        if (objValue == null) {
            return null;
        }
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
    public PSDEDBCfgDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDBCfgDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewname")
    public void setViewName(String viewName) {
        this._set(DTOFIELD_VIEWNAME, viewName);
    }

    @JsonIgnore
    public String getViewName() {
        Object objValue = this._get(DTOFIELD_VIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewNameDirty() {
        return this._contains(DTOFIELD_VIEWNAME);
    }

    @JsonIgnore
    public void resetViewName() {
        this._reset(DTOFIELD_VIEWNAME);
    }

    @JsonIgnore
    public PSDEDBCfgDTO viewname(String viewName) {
        this.setViewName(viewName);
        return this;
    }

    @JsonProperty(value="viewname2")
    public void setViewName2(String viewName2) {
        this._set(DTOFIELD_VIEWNAME2, viewName2);
    }

    @JsonIgnore
    public String getViewName2() {
        Object objValue = this._get(DTOFIELD_VIEWNAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewName2Dirty() {
        return this._contains(DTOFIELD_VIEWNAME2);
    }

    @JsonIgnore
    public void resetViewName2() {
        this._reset(DTOFIELD_VIEWNAME2);
    }

    @JsonIgnore
    public PSDEDBCfgDTO viewname2(String viewName2) {
        this.setViewName2(viewName2);
        return this;
    }

    @JsonProperty(value="viewname3")
    public void setViewName3(String viewName3) {
        this._set(DTOFIELD_VIEWNAME3, viewName3);
    }

    @JsonIgnore
    public String getViewName3() {
        Object objValue = this._get(DTOFIELD_VIEWNAME3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewName3Dirty() {
        return this._contains(DTOFIELD_VIEWNAME3);
    }

    @JsonIgnore
    public void resetViewName3() {
        this._reset(DTOFIELD_VIEWNAME3);
    }

    @JsonIgnore
    public PSDEDBCfgDTO viewname3(String viewName3) {
        this.setViewName3(viewName3);
        return this;
    }

    @JsonProperty(value="viewname4")
    public void setViewName4(String viewName4) {
        this._set(DTOFIELD_VIEWNAME4, viewName4);
    }

    @JsonIgnore
    public String getViewName4() {
        Object objValue = this._get(DTOFIELD_VIEWNAME4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewName4Dirty() {
        return this._contains(DTOFIELD_VIEWNAME4);
    }

    @JsonIgnore
    public void resetViewName4() {
        this._reset(DTOFIELD_VIEWNAME4);
    }

    @JsonIgnore
    public PSDEDBCfgDTO viewname4(String viewName4) {
        this.setViewName4(viewName4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDBCfgId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDBCfgId(strValue);
    }

    @JsonIgnore
    public PSDEDBCfgDTO id(String strValue) {
        this.setPSDEDBCfgId(strValue);
        return this;
    }
}
