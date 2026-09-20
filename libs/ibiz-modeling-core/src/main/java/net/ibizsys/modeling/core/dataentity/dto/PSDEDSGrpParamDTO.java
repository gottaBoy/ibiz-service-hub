package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDSGrpParamDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGMODE = "AGGMODE";
    protected static final String DTOFIELD_AGGMODE = "aggmode";
    public static final String FIELD_ALIASNAME = "ALIASNAME";
    protected static final String DTOFIELD_ALIASNAME = "aliasname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDEFNAME = "CUSTOMDEFNAME";
    protected static final String DTOFIELD_CUSTOMDEFNAME = "customdefname";
    public static final String FIELD_GROUPCODE = "GROUPCODE";
    protected static final String DTOFIELD_GROUPCODE = "groupcode";
    public static final String FIELD_GROUPFLAG = "GROUPFLAG";
    protected static final String DTOFIELD_GROUPFLAG = "groupflag";
    public static final String FIELD_GROUPJOINCODE = "GROUPJOINCODE";
    protected static final String DTOFIELD_GROUPJOINCODE = "groupjoincode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERDIR = "ORDERDIR";
    protected static final String DTOFIELD_ORDERDIR = "orderdir";
    public static final String FIELD_PSDEDSGRPPARAMID = "PSDEDSGRPPARAMID";
    protected static final String DTOFIELD_PSDEDSGRPPARAMID = "psdedsgrpparamid";
    public static final String FIELD_PSDEDSGRPPARAMNAME = "PSDEDSGRPPARAMNAME";
    protected static final String DTOFIELD_PSDEDSGRPPARAMNAME = "psdedsgrpparamname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_SORTORDERVALUE = "SORTORDERVALUE";
    protected static final String DTOFIELD_SORTORDERVALUE = "sortordervalue";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERDATA = "USERDATA";
    protected static final String DTOFIELD_USERDATA = "userdata";
    public static final String FIELD_USERDATA2 = "USERDATA2";
    protected static final String DTOFIELD_USERDATA2 = "userdata2";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";

    @JsonProperty(value="aggmode")
    public void setAggMode(String aggMode) {
        this._set(DTOFIELD_AGGMODE, aggMode);
    }

    @JsonIgnore
    public String getAggMode() {
        Object objValue = this._get(DTOFIELD_AGGMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAggModeDirty() {
        return this._contains(DTOFIELD_AGGMODE);
    }

    @JsonIgnore
    public void resetAggMode() {
        this._reset(DTOFIELD_AGGMODE);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO aggmode(String aggMode) {
        this.setAggMode(aggMode);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO aggmode(PSModelEnums.AggMode aggMode) {
        if (aggMode == null) {
            this.setAggMode(null);
        } else {
            this.setAggMode(aggMode.value);
        }
        return this;
    }

    @JsonProperty(value="aliasname")
    public void setAliasName(String aliasName) {
        this._set(DTOFIELD_ALIASNAME, aliasName);
    }

    @JsonIgnore
    public String getAliasName() {
        Object objValue = this._get(DTOFIELD_ALIASNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAliasNameDirty() {
        return this._contains(DTOFIELD_ALIASNAME);
    }

    @JsonIgnore
    public void resetAliasName() {
        this._reset(DTOFIELD_ALIASNAME);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO aliasname(String aliasName) {
        this.setAliasName(aliasName);
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
    public PSDEDSGrpParamDTO createdate(Timestamp createDate) {
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
    public PSDEDSGrpParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdefname")
    public void setCustomDEFName(String customDEFName) {
        this._set(DTOFIELD_CUSTOMDEFNAME, customDEFName);
    }

    @JsonIgnore
    public String getCustomDEFName() {
        Object objValue = this._get(DTOFIELD_CUSTOMDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDEFNameDirty() {
        return this._contains(DTOFIELD_CUSTOMDEFNAME);
    }

    @JsonIgnore
    public void resetCustomDEFName() {
        this._reset(DTOFIELD_CUSTOMDEFNAME);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO customdefname(String customDEFName) {
        this.setCustomDEFName(customDEFName);
        return this;
    }

    @JsonProperty(value="groupcode")
    public void setGroupCode(String groupCode) {
        this._set(DTOFIELD_GROUPCODE, groupCode);
    }

    @JsonIgnore
    public String getGroupCode() {
        Object objValue = this._get(DTOFIELD_GROUPCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupCodeDirty() {
        return this._contains(DTOFIELD_GROUPCODE);
    }

    @JsonIgnore
    public void resetGroupCode() {
        this._reset(DTOFIELD_GROUPCODE);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO groupcode(String groupCode) {
        this.setGroupCode(groupCode);
        return this;
    }

    @JsonProperty(value="groupflag")
    public void setGroupFlag(Integer groupFlag) {
        this._set(DTOFIELD_GROUPFLAG, groupFlag);
    }

    @JsonIgnore
    public Integer getGroupFlag() {
        Object objValue = this._get(DTOFIELD_GROUPFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupFlagDirty() {
        return this._contains(DTOFIELD_GROUPFLAG);
    }

    @JsonIgnore
    public void resetGroupFlag() {
        this._reset(DTOFIELD_GROUPFLAG);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO groupflag(Integer groupFlag) {
        this.setGroupFlag(groupFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO groupflag(Boolean groupFlag) {
        if (groupFlag == null) {
            this.setGroupFlag(null);
        } else {
            this.setGroupFlag(groupFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="groupjoincode")
    public void setGroupJoinCode(String groupJoinCode) {
        this._set(DTOFIELD_GROUPJOINCODE, groupJoinCode);
    }

    @JsonIgnore
    public String getGroupJoinCode() {
        Object objValue = this._get(DTOFIELD_GROUPJOINCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupJoinCodeDirty() {
        return this._contains(DTOFIELD_GROUPJOINCODE);
    }

    @JsonIgnore
    public void resetGroupJoinCode() {
        this._reset(DTOFIELD_GROUPJOINCODE);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO groupjoincode(String groupJoinCode) {
        this.setGroupJoinCode(groupJoinCode);
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
    public PSDEDSGrpParamDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="orderdir")
    public void setOrderDir(String orderDir) {
        this._set(DTOFIELD_ORDERDIR, orderDir);
    }

    @JsonIgnore
    public String getOrderDir() {
        Object objValue = this._get(DTOFIELD_ORDERDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOrderDirDirty() {
        return this._contains(DTOFIELD_ORDERDIR);
    }

    @JsonIgnore
    public void resetOrderDir() {
        this._reset(DTOFIELD_ORDERDIR);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO orderdir(String orderDir) {
        this.setOrderDir(orderDir);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO orderdir(PSModelEnums.SortDir orderDir) {
        if (orderDir == null) {
            this.setOrderDir(null);
        } else {
            this.setOrderDir(orderDir.value);
        }
        return this;
    }

    @JsonProperty(value="psdedsgrpparamid")
    public void setPSDEDSGrpParamId(String pSDEDSGrpParamId) {
        this._set(DTOFIELD_PSDEDSGRPPARAMID, pSDEDSGrpParamId);
    }

    @JsonIgnore
    public String getPSDEDSGrpParamId() {
        Object objValue = this._get(DTOFIELD_PSDEDSGRPPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSGrpParamIdDirty() {
        return this._contains(DTOFIELD_PSDEDSGRPPARAMID);
    }

    @JsonIgnore
    public void resetPSDEDSGrpParamId() {
        this._reset(DTOFIELD_PSDEDSGRPPARAMID);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdedsgrpparamid(String pSDEDSGrpParamId) {
        this.setPSDEDSGrpParamId(pSDEDSGrpParamId);
        return this;
    }

    @JsonProperty(value="psdedsgrpparamname")
    public void setPSDEDSGrpParamName(String pSDEDSGrpParamName) {
        this._set(DTOFIELD_PSDEDSGRPPARAMNAME, pSDEDSGrpParamName);
    }

    @JsonIgnore
    public String getPSDEDSGrpParamName() {
        Object objValue = this._get(DTOFIELD_PSDEDSGRPPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSGrpParamNameDirty() {
        return this._contains(DTOFIELD_PSDEDSGRPPARAMNAME);
    }

    @JsonIgnore
    public void resetPSDEDSGrpParamName() {
        this._reset(DTOFIELD_PSDEDSGRPPARAMNAME);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdedsgrpparamname(String pSDEDSGrpParamName) {
        this.setPSDEDSGrpParamName(pSDEDSGrpParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDSGrpParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDSGrpParamName(strName);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO name(String strName) {
        this.setPSDEDSGrpParamName(strName);
        return this;
    }

    @JsonProperty(value="psdedsid")
    public void setPSDEDSId(String pSDEDSId) {
        this._set(DTOFIELD_PSDEDSID, pSDEDSId);
    }

    @JsonIgnore
    public String getPSDEDSId() {
        Object objValue = this._get(DTOFIELD_PSDEDSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSIdDirty() {
        return this._contains(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public void resetPSDEDSId() {
        this._reset(DTOFIELD_PSDEDSID);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
            this.setPSDEId(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
            this.setPSDEId(pSDEDataSet.getPSDEId());
        }
        return this;
    }

    @JsonProperty(value="psdedsname")
    public void setPSDEDSName(String pSDEDSName) {
        this._set(DTOFIELD_PSDEDSNAME, pSDEDSName);
    }

    @JsonIgnore
    public String getPSDEDSName() {
        Object objValue = this._get(DTOFIELD_PSDEDSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDSNameDirty() {
        return this._contains(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public void resetPSDEDSName() {
        this._reset(DTOFIELD_PSDEDSNAME);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    @JsonProperty(value="psdefid")
    public void setPSDEFId(String pSDEFId) {
        this._set(DTOFIELD_PSDEFID, pSDEFId);
    }

    @JsonIgnore
    public String getPSDEFId() {
        Object objValue = this._get(DTOFIELD_PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFIdDirty() {
        return this._contains(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public void resetPSDEFId() {
        this._reset(DTOFIELD_PSDEFID);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        } else {
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="psdefname")
    public void setPSDEFName(String pSDEFName) {
        this._set(DTOFIELD_PSDEFNAME, pSDEFName);
    }

    @JsonIgnore
    public String getPSDEFName() {
        Object objValue = this._get(DTOFIELD_PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFNameDirty() {
        return this._contains(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public void resetPSDEFName() {
        this._reset(DTOFIELD_PSDEFNAME);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
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
    public PSDEDSGrpParamDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="sortordervalue")
    public void setSortOrderValue(Integer sortOrderValue) {
        this._set(DTOFIELD_SORTORDERVALUE, sortOrderValue);
    }

    @JsonIgnore
    public Integer getSortOrderValue() {
        Object objValue = this._get(DTOFIELD_SORTORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSortOrderValueDirty() {
        return this._contains(DTOFIELD_SORTORDERVALUE);
    }

    @JsonIgnore
    public void resetSortOrderValue() {
        this._reset(DTOFIELD_SORTORDERVALUE);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO sortordervalue(Integer sortOrderValue) {
        this.setSortOrderValue(sortOrderValue);
        return this;
    }

    @JsonProperty(value="stddatatype")
    public void setStdDataType(Integer stdDataType) {
        this._set(DTOFIELD_STDDATATYPE, stdDataType);
    }

    @JsonIgnore
    public Integer getStdDataType() {
        Object objValue = this._get(DTOFIELD_STDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isStdDataTypeDirty() {
        return this._contains(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public void resetStdDataType() {
        this._reset(DTOFIELD_STDDATATYPE);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
        if (stdDataType == null) {
            this.setStdDataType(null);
        } else {
            this.setStdDataType(stdDataType.value);
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
    public PSDEDSGrpParamDTO updatedate(Timestamp updateDate) {
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
    public PSDEDSGrpParamDTO updateman(String updateMan) {
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
    public PSDEDSGrpParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="userdata")
    public void setUserData(String userData) {
        this._set(DTOFIELD_USERDATA, userData);
    }

    @JsonIgnore
    public String getUserData() {
        Object objValue = this._get(DTOFIELD_USERDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserDataDirty() {
        return this._contains(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public void resetUserData() {
        this._reset(DTOFIELD_USERDATA);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO userdata(String userData) {
        this.setUserData(userData);
        return this;
    }

    @JsonProperty(value="userdata2")
    public void setUserData2(String userData2) {
        this._set(DTOFIELD_USERDATA2, userData2);
    }

    @JsonIgnore
    public String getUserData2() {
        Object objValue = this._get(DTOFIELD_USERDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserData2Dirty() {
        return this._contains(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public void resetUserData2() {
        this._reset(DTOFIELD_USERDATA2);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO userdata2(String userData2) {
        this.setUserData2(userData2);
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
    public PSDEDSGrpParamDTO usertag(String userTag) {
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
    public PSDEDSGrpParamDTO usertag2(String userTag2) {
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
    public PSDEDSGrpParamDTO usertag3(String userTag3) {
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
    public PSDEDSGrpParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDSGrpParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDSGrpParamId(strValue);
    }

    @JsonIgnore
    public PSDEDSGrpParamDTO id(String strValue) {
        this.setPSDEDSGrpParamId(strValue);
        return this;
    }
}
