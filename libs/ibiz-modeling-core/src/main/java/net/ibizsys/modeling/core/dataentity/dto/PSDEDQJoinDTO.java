/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEJoinTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDQJoinDTO
extends PSModelDTOBase {
    public static final String FIELD_ALIASNAME = "ALIASNAME";
    protected static final String DTOFIELD_ALIASNAME = "aliasname";
    public static final String FIELD_CONDFLAG = "CONDFLAG";
    protected static final String DTOFIELD_CONDFLAG = "condflag";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXTCOLUMNS = "EXTCOLUMNS";
    protected static final String DTOFIELD_EXTCOLUMNS = "extcolumns";
    public static final String FIELD_JOINPSDEID = "JOINPSDEID";
    protected static final String DTOFIELD_JOINPSDEID = "joinpsdeid";
    public static final String FIELD_JOINPSDENAME = "JOINPSDENAME";
    protected static final String DTOFIELD_JOINPSDENAME = "joinpsdename";
    public static final String FIELD_JOINTAG = "JOINTAG";
    protected static final String DTOFIELD_JOINTAG = "jointag";
    public static final String FIELD_JOINTAG2 = "JOINTAG2";
    protected static final String DTOFIELD_JOINTAG2 = "jointag2";
    public static final String FIELD_MAINFLAG = "MAINFLAG";
    protected static final String DTOFIELD_MAINFLAG = "mainflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PJOINPSDEID = "PJOINPSDEID";
    protected static final String DTOFIELD_PJOINPSDEID = "pjoinpsdeid";
    public static final String FIELD_PPSDEDQJOINID = "PPSDEDQJOINID";
    protected static final String DTOFIELD_PPSDEDQJOINID = "ppsdedqjoinid";
    public static final String FIELD_PPSDEDQJOINNAME = "PPSDEDQJOINNAME";
    protected static final String DTOFIELD_PPSDEDQJOINNAME = "ppsdedqjoinname";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQJOINID = "PSDEDQJOINID";
    protected static final String DTOFIELD_PSDEDQJOINID = "psdedqjoinid";
    public static final String FIELD_PSDEDQJOINNAME = "PSDEDQJOINNAME";
    protected static final String DTOFIELD_PSDEDQJOINNAME = "psdedqjoinname";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEJOINTYPEID = "PSDEJOINTYPEID";
    protected static final String DTOFIELD_PSDEJOINTYPEID = "psdejointypeid";
    public static final String FIELD_PSDEJOINTYPENAME = "PSDEJOINTYPENAME";
    protected static final String DTOFIELD_PSDEJOINTYPENAME = "psdejointypename";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_QUERYVIEWFLAG = "QUERYVIEWFLAG";
    protected static final String DTOFIELD_QUERYVIEWFLAG = "queryviewflag";
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
    public static final String DTOFIELD_PSDEDQJOINS = "psdedqjoins";
    public static final String DTOFIELD_PSDEDQCONDS = "psdedqconds";

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
    public PSDEDQJoinDTO aliasname(String aliasName) {
        this.setAliasName(aliasName);
        return this;
    }

    @JsonProperty(value="condflag")
    public void setCondFlag(Integer condFlag) {
        this._set(DTOFIELD_CONDFLAG, condFlag);
    }

    @JsonIgnore
    public Integer getCondFlag() {
        Object objValue = this._get(DTOFIELD_CONDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCondFlagDirty() {
        return this._contains(DTOFIELD_CONDFLAG);
    }

    @JsonIgnore
    public void resetCondFlag() {
        this._reset(DTOFIELD_CONDFLAG);
    }

    @JsonIgnore
    public PSDEDQJoinDTO condflag(Integer condFlag) {
        this.setCondFlag(condFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO condflag(Boolean condFlag) {
        if (condFlag == null) {
            this.setCondFlag(null);
        } else {
            this.setCondFlag(condFlag != false ? 1 : 0);
        }
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
    public PSDEDQJoinDTO createdate(Timestamp createDate) {
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
    public PSDEDQJoinDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="extcolumns")
    public void setExtColumns(String extColumns) {
        this._set(DTOFIELD_EXTCOLUMNS, extColumns);
    }

    @JsonIgnore
    public String getExtColumns() {
        Object objValue = this._get(DTOFIELD_EXTCOLUMNS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExtColumnsDirty() {
        return this._contains(DTOFIELD_EXTCOLUMNS);
    }

    @JsonIgnore
    public void resetExtColumns() {
        this._reset(DTOFIELD_EXTCOLUMNS);
    }

    @JsonIgnore
    public PSDEDQJoinDTO extcolumns(String extColumns) {
        this.setExtColumns(extColumns);
        return this;
    }

    @JsonProperty(value="joinpsdeid")
    public void setJoinPSDEId(String joinPSDEId) {
        this._set(DTOFIELD_JOINPSDEID, joinPSDEId);
    }

    @JsonIgnore
    public String getJoinPSDEId() {
        Object objValue = this._get(DTOFIELD_JOINPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJoinPSDEIdDirty() {
        return this._contains(DTOFIELD_JOINPSDEID);
    }

    @JsonIgnore
    public void resetJoinPSDEId() {
        this._reset(DTOFIELD_JOINPSDEID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO joinpsdeid(String joinPSDEId) {
        this.setJoinPSDEId(joinPSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO joinpsdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setJoinPSDEId(null);
            this.setJoinPSDEName(null);
        } else {
            this.setJoinPSDEId(pSDataEntity.getPSDataEntityId());
            this.setJoinPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="joinpsdename")
    public void setJoinPSDEName(String joinPSDEName) {
        this._set(DTOFIELD_JOINPSDENAME, joinPSDEName);
    }

    @JsonIgnore
    public String getJoinPSDEName() {
        Object objValue = this._get(DTOFIELD_JOINPSDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJoinPSDENameDirty() {
        return this._contains(DTOFIELD_JOINPSDENAME);
    }

    @JsonIgnore
    public void resetJoinPSDEName() {
        this._reset(DTOFIELD_JOINPSDENAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO joinpsdename(String joinPSDEName) {
        this.setJoinPSDEName(joinPSDEName);
        return this;
    }

    @JsonProperty(value="jointag")
    public void setJoinTag(String joinTag) {
        this._set(DTOFIELD_JOINTAG, joinTag);
    }

    @JsonIgnore
    public String getJoinTag() {
        Object objValue = this._get(DTOFIELD_JOINTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJoinTagDirty() {
        return this._contains(DTOFIELD_JOINTAG);
    }

    @JsonIgnore
    public void resetJoinTag() {
        this._reset(DTOFIELD_JOINTAG);
    }

    @JsonIgnore
    public PSDEDQJoinDTO jointag(String joinTag) {
        this.setJoinTag(joinTag);
        return this;
    }

    @JsonProperty(value="jointag2")
    public void setJoinTag2(String joinTag2) {
        this._set(DTOFIELD_JOINTAG2, joinTag2);
    }

    @JsonIgnore
    public String getJoinTag2() {
        Object objValue = this._get(DTOFIELD_JOINTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isJoinTag2Dirty() {
        return this._contains(DTOFIELD_JOINTAG2);
    }

    @JsonIgnore
    public void resetJoinTag2() {
        this._reset(DTOFIELD_JOINTAG2);
    }

    @JsonIgnore
    public PSDEDQJoinDTO jointag2(String joinTag2) {
        this.setJoinTag2(joinTag2);
        return this;
    }

    @JsonProperty(value="mainflag")
    public void setMainFlag(Integer mainFlag) {
        this._set(DTOFIELD_MAINFLAG, mainFlag);
    }

    @JsonIgnore
    public Integer getMainFlag() {
        Object objValue = this._get(DTOFIELD_MAINFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isMainFlagDirty() {
        return this._contains(DTOFIELD_MAINFLAG);
    }

    @JsonIgnore
    public void resetMainFlag() {
        this._reset(DTOFIELD_MAINFLAG);
    }

    @JsonIgnore
    public PSDEDQJoinDTO mainflag(Integer mainFlag) {
        this.setMainFlag(mainFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO mainflag(Boolean mainFlag) {
        if (mainFlag == null) {
            this.setMainFlag(null);
        } else {
            this.setMainFlag(mainFlag != false ? 1 : 0);
        }
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
    public PSDEDQJoinDTO memo(String memo) {
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
    public PSDEDQJoinDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pjoinpsdeid")
    public void setPJoinPSDEId(String pJoinPSDEId) {
        this._set(DTOFIELD_PJOINPSDEID, pJoinPSDEId);
    }

    @JsonIgnore
    public String getPJoinPSDEId() {
        Object objValue = this._get(DTOFIELD_PJOINPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPJoinPSDEIdDirty() {
        return this._contains(DTOFIELD_PJOINPSDEID);
    }

    @JsonIgnore
    public void resetPJoinPSDEId() {
        this._reset(DTOFIELD_PJOINPSDEID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO pjoinpsdeid(String pJoinPSDEId) {
        this.setPJoinPSDEId(pJoinPSDEId);
        return this;
    }

    @JsonProperty(value="ppsdedqjoinid")
    public void setPPSDEDQJoinId(String pPSDEDQJoinId) {
        this._set(DTOFIELD_PPSDEDQJOINID, pPSDEDQJoinId);
    }

    @JsonIgnore
    public String getPPSDEDQJoinId() {
        Object objValue = this._get(DTOFIELD_PPSDEDQJOINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEDQJoinIdDirty() {
        return this._contains(DTOFIELD_PPSDEDQJOINID);
    }

    @JsonIgnore
    public void resetPPSDEDQJoinId() {
        this._reset(DTOFIELD_PPSDEDQJOINID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO ppsdedqjoinid(String pPSDEDQJoinId) {
        this.setPPSDEDQJoinId(pPSDEDQJoinId);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO ppsdedqjoinid(PSDEDQJoinDTO pSDEDQJoin) {
        if (pSDEDQJoin == null) {
            this.setPJoinPSDEId(null);
            this.setPPSDEDQJoinId(null);
            this.setPPSDEDQJoinName(null);
        } else {
            this.setPJoinPSDEId(pSDEDQJoin.getJoinPSDEId());
            this.setPPSDEDQJoinId(pSDEDQJoin.getPSDEDQJoinId());
            this.setPPSDEDQJoinName(pSDEDQJoin.getPSDEDQJoinName());
        }
        return this;
    }

    @JsonProperty(value="ppsdedqjoinname")
    public void setPPSDEDQJoinName(String pPSDEDQJoinName) {
        this._set(DTOFIELD_PPSDEDQJOINNAME, pPSDEDQJoinName);
    }

    @JsonIgnore
    public String getPPSDEDQJoinName() {
        Object objValue = this._get(DTOFIELD_PPSDEDQJOINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEDQJoinNameDirty() {
        return this._contains(DTOFIELD_PPSDEDQJOINNAME);
    }

    @JsonIgnore
    public void resetPPSDEDQJoinName() {
        this._reset(DTOFIELD_PPSDEDQJOINNAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO ppsdedqjoinname(String pPSDEDQJoinName) {
        this.setPPSDEDQJoinName(pPSDEDQJoinName);
        return this;
    }

    @JsonProperty(value="psdedqid")
    public void setPSDEDQId(String pSDEDQId) {
        this._set(DTOFIELD_PSDEDQID, pSDEDQId);
    }

    @JsonIgnore
    public String getPSDEDQId() {
        Object objValue = this._get(DTOFIELD_PSDEDQID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQIdDirty() {
        return this._contains(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public void resetPSDEDQId() {
        this._reset(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedqjoinid")
    public void setPSDEDQJoinId(String pSDEDQJoinId) {
        this._set(DTOFIELD_PSDEDQJOINID, pSDEDQJoinId);
    }

    @JsonIgnore
    public String getPSDEDQJoinId() {
        Object objValue = this._get(DTOFIELD_PSDEDQJOINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQJoinIdDirty() {
        return this._contains(DTOFIELD_PSDEDQJOINID);
    }

    @JsonIgnore
    public void resetPSDEDQJoinId() {
        this._reset(DTOFIELD_PSDEDQJOINID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdedqjoinid(String pSDEDQJoinId) {
        this.setPSDEDQJoinId(pSDEDQJoinId);
        return this;
    }

    @JsonProperty(value="psdedqjoinname")
    public void setPSDEDQJoinName(String pSDEDQJoinName) {
        this._set(DTOFIELD_PSDEDQJOINNAME, pSDEDQJoinName);
    }

    @JsonIgnore
    public String getPSDEDQJoinName() {
        Object objValue = this._get(DTOFIELD_PSDEDQJOINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQJoinNameDirty() {
        return this._contains(DTOFIELD_PSDEDQJOINNAME);
    }

    @JsonIgnore
    public void resetPSDEDQJoinName() {
        this._reset(DTOFIELD_PSDEDQJOINNAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdedqjoinname(String pSDEDQJoinName) {
        this.setPSDEDQJoinName(pSDEDQJoinName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDQJoinName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDQJoinName(strName);
    }

    @JsonIgnore
    public PSDEDQJoinDTO name(String strName) {
        this.setPSDEDQJoinName(strName);
        return this;
    }

    @JsonProperty(value="psdedqname")
    public void setPSDEDQName(String pSDEDQName) {
        this._set(DTOFIELD_PSDEDQNAME, pSDEDQName);
    }

    @JsonIgnore
    public String getPSDEDQName() {
        Object objValue = this._get(DTOFIELD_PSDEDQNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQNameDirty() {
        return this._contains(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public void resetPSDEDQName() {
        this._reset(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    @JsonProperty(value="psdejointypeid")
    public void setPSDEJoinTypeId(String pSDEJoinTypeId) {
        this._set(DTOFIELD_PSDEJOINTYPEID, pSDEJoinTypeId);
    }

    @JsonIgnore
    public String getPSDEJoinTypeId() {
        Object objValue = this._get(DTOFIELD_PSDEJOINTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEJoinTypeIdDirty() {
        return this._contains(DTOFIELD_PSDEJOINTYPEID);
    }

    @JsonIgnore
    public void resetPSDEJoinTypeId() {
        this._reset(DTOFIELD_PSDEJOINTYPEID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdejointypeid(String pSDEJoinTypeId) {
        this.setPSDEJoinTypeId(pSDEJoinTypeId);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdejointypeid(PSDEJoinTypeDTO pSDEJoinType) {
        if (pSDEJoinType == null) {
            this.setPSDEJoinTypeId(null);
            this.setPSDEJoinTypeName(null);
        } else {
            this.setPSDEJoinTypeId(pSDEJoinType.getPSDEJoinTypeId());
            this.setPSDEJoinTypeName(pSDEJoinType.getPSDEJoinTypeName());
        }
        return this;
    }

    @JsonProperty(value="psdejointypename")
    public void setPSDEJoinTypeName(String pSDEJoinTypeName) {
        this._set(DTOFIELD_PSDEJOINTYPENAME, pSDEJoinTypeName);
    }

    @JsonIgnore
    public String getPSDEJoinTypeName() {
        Object objValue = this._get(DTOFIELD_PSDEJOINTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEJoinTypeNameDirty() {
        return this._contains(DTOFIELD_PSDEJOINTYPENAME);
    }

    @JsonIgnore
    public void resetPSDEJoinTypeName() {
        this._reset(DTOFIELD_PSDEJOINTYPENAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdejointypename(String pSDEJoinTypeName) {
        this.setPSDEJoinTypeName(pSDEJoinTypeName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDEDQJoinDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="queryviewflag")
    public void setQueryViewFlag(Integer queryViewFlag) {
        this._set(DTOFIELD_QUERYVIEWFLAG, queryViewFlag);
    }

    @JsonIgnore
    public Integer getQueryViewFlag() {
        Object objValue = this._get(DTOFIELD_QUERYVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isQueryViewFlagDirty() {
        return this._contains(DTOFIELD_QUERYVIEWFLAG);
    }

    @JsonIgnore
    public void resetQueryViewFlag() {
        this._reset(DTOFIELD_QUERYVIEWFLAG);
    }

    @JsonIgnore
    public PSDEDQJoinDTO queryviewflag(Integer queryViewFlag) {
        this.setQueryViewFlag(queryViewFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO queryviewflag(Boolean queryViewFlag) {
        if (queryViewFlag == null) {
            this.setQueryViewFlag(null);
        } else {
            this.setQueryViewFlag(queryViewFlag != false ? 1 : 0);
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
    public PSDEDQJoinDTO updatedate(Timestamp updateDate) {
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
    public PSDEDQJoinDTO updateman(String updateMan) {
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
    public PSDEDQJoinDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDQJoinDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDQJoinDTO usertag(String userTag) {
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
    public PSDEDQJoinDTO usertag2(String userTag2) {
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
    public PSDEDQJoinDTO usertag3(String userTag3) {
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
    public PSDEDQJoinDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDQJoinId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDQJoinId(strValue);
    }

    @JsonIgnore
    public PSDEDQJoinDTO id(String strValue) {
        this.setPSDEDQJoinId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDQJoinDTO> getPSDEDQJoins() {
        Object list = this._get(DTOFIELD_PSDEDQJOINS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedqjoins")
    public void setPSDEDQJoins(List<PSDEDQJoinDTO> psdedqjoins) {
        this._set(DTOFIELD_PSDEDQJOINS, psdedqjoins);
    }

    @JsonIgnore
    public List<PSDEDQJoinDTO> getPSDEDQJoinsIf() {
        Object list = this._get(DTOFIELD_PSDEDQJOINS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDQJOINS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEDQCondDTO> getPSDEDQConds() {
        Object list = this._get(DTOFIELD_PSDEDQCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedqconds")
    public void setPSDEDQConds(List<PSDEDQCondDTO> psdedqconds) {
        this._set(DTOFIELD_PSDEDQCONDS, psdedqconds);
    }

    @JsonIgnore
    public List<PSDEDQCondDTO> getPSDEDQCondsIf() {
        Object list = this._get(DTOFIELD_PSDEDQCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDQCONDS, list);
        }
        return (List) list;
    }
}
