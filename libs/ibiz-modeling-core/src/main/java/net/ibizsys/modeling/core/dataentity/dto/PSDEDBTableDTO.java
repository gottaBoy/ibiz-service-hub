/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEDBTableType
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$TableColInheritMode
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDBTableDTO
extends PSModelDTOBase {
    public static final String FIELD_COLINHERITMODE = "COLINHERITMODE";
    protected static final String DTOFIELD_COLINHERITMODE = "colinheritmode";
    public static final String FIELD_COLUMNS = "COLUMNS";
    protected static final String DTOFIELD_COLUMNS = "columns";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEDBTABLEID = "PSDETABLEID";
    protected static final String DTOFIELD_PSDEDBTABLEID = "psdedbtableid";
    public static final String FIELD_PSDEDBTABLENAME = "PSDETABLENAME";
    protected static final String DTOFIELD_PSDEDBTABLENAME = "psdedbtablename";
    public static final String FIELD_PSSYSDBTABLEID = "PSSYSDBTABLEID";
    protected static final String DTOFIELD_PSSYSDBTABLEID = "pssysdbtableid";
    public static final String FIELD_PSSYSDBTABLENAME = "PSSYSDBTABLENAME";
    protected static final String DTOFIELD_PSSYSDBTABLENAME = "pssysdbtablename";
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

    @JsonProperty(value="colinheritmode")
    public void setColInheritMode(Integer colInheritMode) {
        this._set(DTOFIELD_COLINHERITMODE, colInheritMode);
    }

    @JsonIgnore
    public Integer getColInheritMode() {
        Object objValue = this._get(DTOFIELD_COLINHERITMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isColInheritModeDirty() {
        return this._contains(DTOFIELD_COLINHERITMODE);
    }

    @JsonIgnore
    public void resetColInheritMode() {
        this._reset(DTOFIELD_COLINHERITMODE);
    }

    @JsonIgnore
    public PSDEDBTableDTO colinheritmode(Integer colInheritMode) {
        this.setColInheritMode(colInheritMode);
        return this;
    }

    @JsonIgnore
    public PSDEDBTableDTO colinheritmode(PSModelEnums.TableColInheritMode colInheritMode) {
        if (colInheritMode == null) {
            this.setColInheritMode(null);
        } else {
            this.setColInheritMode(colInheritMode.value);
        }
        return this;
    }

    @JsonProperty(value="columns")
    public void setColumns(String columns) {
        this._set(DTOFIELD_COLUMNS, columns);
    }

    @JsonIgnore
    public String getColumns() {
        Object objValue = this._get(DTOFIELD_COLUMNS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColumnsDirty() {
        return this._contains(DTOFIELD_COLUMNS);
    }

    @JsonIgnore
    public void resetColumns() {
        this._reset(DTOFIELD_COLUMNS);
    }

    @JsonIgnore
    public PSDEDBTableDTO columns(String columns) {
        this.setColumns(columns);
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
    public PSDEDBTableDTO createdate(Timestamp createDate) {
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
    public PSDEDBTableDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEDBTableDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSDEDBTableDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEDBTableDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDBTableDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDBTableDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdedbtableid")
    public void setPSDEDBTableId(String pSDEDBTableId) {
        this._set(DTOFIELD_PSDEDBTABLEID, pSDEDBTableId);
        this._set(FIELD_PSDEDBTABLEID, pSDEDBTableId);
    }

    @JsonIgnore
    public String getPSDEDBTableId() {
        Object objValue = this._get(DTOFIELD_PSDEDBTABLEID);
        if (objValue == null && (objValue = this._get(FIELD_PSDEDBTABLEID)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBTableIdDirty() {
        if (this._contains(DTOFIELD_PSDEDBTABLEID)) {
            return true;
        }
        return this._contains(FIELD_PSDEDBTABLEID);
    }

    @JsonIgnore
    public void resetPSDEDBTableId() {
        this._reset(DTOFIELD_PSDEDBTABLEID);
        this._reset(FIELD_PSDEDBTABLEID);
    }

    @JsonIgnore
    public PSDEDBTableDTO psdedbtableid(String pSDEDBTableId) {
        this.setPSDEDBTableId(pSDEDBTableId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDETableId() {
        return this.getPSDEDBTableId();
    }

    @JsonIgnore
    @Deprecated
    public void setPSDETableId(String pSDETableId) {
        this.setPSDEDBTableId(pSDETableId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDETableIdDirty() {
        return this.isPSDEDBTableIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDETableId() {
        this.resetPSDEDBTableId();
    }

    @JsonProperty(value="psdedbtablename")
    public void setPSDEDBTableName(String pSDEDBTableName) {
        this._set(DTOFIELD_PSDEDBTABLENAME, pSDEDBTableName);
        this._set(FIELD_PSDEDBTABLENAME, pSDEDBTableName);
    }

    @JsonIgnore
    public String getPSDEDBTableName() {
        Object objValue = this._get(DTOFIELD_PSDEDBTABLENAME);
        if (objValue == null && (objValue = this._get(FIELD_PSDEDBTABLENAME)) == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDBTableNameDirty() {
        if (this._contains(DTOFIELD_PSDEDBTABLENAME)) {
            return true;
        }
        return this._contains(FIELD_PSDEDBTABLENAME);
    }

    @JsonIgnore
    public void resetPSDEDBTableName() {
        this._reset(DTOFIELD_PSDEDBTABLENAME);
        this._reset(FIELD_PSDEDBTABLENAME);
    }

    @JsonIgnore
    public PSDEDBTableDTO psdedbtablename(String pSDEDBTableName) {
        this.setPSDEDBTableName(pSDEDBTableName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDETableName() {
        return this.getPSDEDBTableName();
    }

    @JsonIgnore
    @Deprecated
    public void setPSDETableName(String pSDETableName) {
        this.setPSDEDBTableName(pSDETableName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDETableNameDirty() {
        return this.isPSDEDBTableNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDETableName() {
        this.resetPSDEDBTableName();
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDBTableName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDBTableName(strName);
    }

    @JsonIgnore
    public PSDEDBTableDTO name(String strName) {
        this.setPSDEDBTableName(strName);
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
    public PSDEDBTableDTO pssysdbtableid(String pSSysDBTableId) {
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    @JsonIgnore
    public PSDEDBTableDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable) {
        if (pSSysDBTable == null) {
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        } else {
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
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
    public PSDEDBTableDTO pssysdbtablename(String pSSysDBTableName) {
        this.setPSSysDBTableName(pSSysDBTableName);
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
    public PSDEDBTableDTO tabletype(String tableType) {
        this.setTableType(tableType);
        return this;
    }

    @JsonIgnore
    public PSDEDBTableDTO tabletype(PSModelEnums.DEDBTableType tableType) {
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
    public PSDEDBTableDTO updatedate(Timestamp updateDate) {
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
    public PSDEDBTableDTO updateman(String updateMan) {
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
    public PSDEDBTableDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDBTableDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDBTableDTO usertag(String userTag) {
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
    public PSDEDBTableDTO usertag2(String userTag2) {
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
    public PSDEDBTableDTO usertag3(String userTag3) {
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
    public PSDEDBTableDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDBTableId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDBTableId(strValue);
    }

    @JsonIgnore
    public PSDEDBTableDTO id(String strValue) {
        this.setPSDEDBTableId(strValue);
        return this;
    }
}
