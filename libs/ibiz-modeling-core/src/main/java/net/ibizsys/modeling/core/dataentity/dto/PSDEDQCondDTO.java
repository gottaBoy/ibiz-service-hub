/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$CondType
 *  net.ibizsys.model.PSModelEnums$CustomCondType
 *  net.ibizsys.model.PSModelEnums$DEDQCondIgnoreMode
 *  net.ibizsys.model.PSModelEnums$GroupCondOP
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
import net.ibizsys.modeling.core.dataentity.dto.PSDBValueOPDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDQCondDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDTAG = "CONDTAG";
    protected static final String DTOFIELD_CONDTAG = "condtag";
    public static final String FIELD_CONDTAG2 = "CONDTAG2";
    protected static final String DTOFIELD_CONDTAG2 = "condtag2";
    public static final String FIELD_CONDTYPE = "CONDTYPE";
    protected static final String DTOFIELD_CONDTYPE = "condtype";
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CONDVALUETEXT = "CONDVALUETEXT";
    protected static final String DTOFIELD_CONDVALUETEXT = "condvaluetext";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCOND = "CUSTOMCOND";
    protected static final String DTOFIELD_CUSTOMCOND = "customcond";
    public static final String FIELD_CUSTOMTYPE = "CUSTOMTYPE";
    protected static final String DTOFIELD_CUSTOMTYPE = "customtype";
    public static final String FIELD_GROUPNOTFLAG = "GROUPNOTFLAG";
    protected static final String DTOFIELD_GROUPNOTFLAG = "groupnotflag";
    public static final String FIELD_GROUPOP = "GROUPOP";
    protected static final String DTOFIELD_GROUPOP = "groupop";
    public static final String FIELD_IGNOREEMPTY = "IGNOREEMPTY";
    protected static final String DTOFIELD_IGNOREEMPTY = "ignoreempty";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSDEDQCONDID = "PPSDEDQCONDID";
    protected static final String DTOFIELD_PPSDEDQCONDID = "ppsdedqcondid";
    public static final String FIELD_PPSDEDQCONDNAME = "PPSDEDQCONDNAME";
    protected static final String DTOFIELD_PPSDEDQCONDNAME = "ppsdedqcondname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSDEDQCONDID = "PSDEDQCONDID";
    protected static final String DTOFIELD_PSDEDQCONDID = "psdedqcondid";
    public static final String FIELD_PSDEDQCONDNAME = "PSDEDQCONDNAME";
    protected static final String DTOFIELD_PSDEDQCONDNAME = "psdedqcondname";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQJOINID = "PSDEDQJOINID";
    protected static final String DTOFIELD_PSDEDQJOINID = "psdedqjoinid";
    public static final String FIELD_PSDEDQJOINNAME = "PSDEDQJOINNAME";
    protected static final String DTOFIELD_PSDEDQJOINNAME = "psdedqjoinname";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEDQPDCONDID = "PSDEDQPDCONDID";
    protected static final String DTOFIELD_PSDEDQPDCONDID = "psdedqpdcondid";
    public static final String FIELD_PSDEDQPDCONDNAME = "PSDEDQPDCONDNAME";
    protected static final String DTOFIELD_PSDEDQPDCONDNAME = "psdedqpdcondname";
    public static final String FIELD_PSDEFID = "PSDEFID";
    protected static final String DTOFIELD_PSDEFID = "psdefid";
    public static final String FIELD_PSDEFNAME = "PSDEFNAME";
    protected static final String DTOFIELD_PSDEFNAME = "psdefname";
    public static final String FIELD_PSSYSDBVFID = "PSSYSDBVFID";
    protected static final String DTOFIELD_PSSYSDBVFID = "pssysdbvfid";
    public static final String FIELD_PSSYSDBVFNAME = "PSSYSDBVFNAME";
    protected static final String DTOFIELD_PSSYSDBVFNAME = "pssysdbvfname";
    public static final String FIELD_PSVARTYPEID = "PSVARTYPEID";
    protected static final String DTOFIELD_PSVARTYPEID = "psvartypeid";
    public static final String FIELD_PSVARTYPENAME = "PSVARTYPENAME";
    protected static final String DTOFIELD_PSVARTYPENAME = "psvartypename";
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
    public static final String DTOFIELD_PSDEDQCONDS = "psdedqconds";

    @JsonProperty(value="condtag")
    public void setCondTag(String condTag) {
        this._set(DTOFIELD_CONDTAG, condTag);
    }

    @JsonIgnore
    public String getCondTag() {
        Object objValue = this._get(DTOFIELD_CONDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTagDirty() {
        return this._contains(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public void resetCondTag() {
        this._reset(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public PSDEDQCondDTO condtag(String condTag) {
        this.setCondTag(condTag);
        return this;
    }

    @JsonProperty(value="condtag2")
    public void setCondTag2(String condTag2) {
        this._set(DTOFIELD_CONDTAG2, condTag2);
    }

    @JsonIgnore
    public String getCondTag2() {
        Object objValue = this._get(DTOFIELD_CONDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTag2Dirty() {
        return this._contains(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public void resetCondTag2() {
        this._reset(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public PSDEDQCondDTO condtag2(String condTag2) {
        this.setCondTag2(condTag2);
        return this;
    }

    @JsonProperty(value="condtype")
    public void setCondType(String condType) {
        this._set(DTOFIELD_CONDTYPE, condType);
    }

    @JsonIgnore
    public String getCondType() {
        Object objValue = this._get(DTOFIELD_CONDTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTypeDirty() {
        return this._contains(DTOFIELD_CONDTYPE);
    }

    @JsonIgnore
    public void resetCondType() {
        this._reset(DTOFIELD_CONDTYPE);
    }

    @JsonIgnore
    public PSDEDQCondDTO condtype(String condType) {
        this.setCondType(condType);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO condtype(PSModelEnums.CondType condType) {
        if (condType == null) {
            this.setCondType(null);
        } else {
            this.setCondType(condType.value);
        }
        return this;
    }

    @JsonProperty(value="condvalue")
    public void setCondValue(String condValue) {
        this._set(DTOFIELD_CONDVALUE, condValue);
    }

    @JsonIgnore
    public String getCondValue() {
        Object objValue = this._get(DTOFIELD_CONDVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondValueDirty() {
        return this._contains(DTOFIELD_CONDVALUE);
    }

    @JsonIgnore
    public void resetCondValue() {
        this._reset(DTOFIELD_CONDVALUE);
    }

    @JsonIgnore
    public PSDEDQCondDTO condvalue(String condValue) {
        this.setCondValue(condValue);
        return this;
    }

    @JsonProperty(value="condvaluetext")
    public void setCondValueText(String condValueText) {
        this._set(DTOFIELD_CONDVALUETEXT, condValueText);
    }

    @JsonIgnore
    public String getCondValueText() {
        Object objValue = this._get(DTOFIELD_CONDVALUETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondValueTextDirty() {
        return this._contains(DTOFIELD_CONDVALUETEXT);
    }

    @JsonIgnore
    public void resetCondValueText() {
        this._reset(DTOFIELD_CONDVALUETEXT);
    }

    @JsonIgnore
    public PSDEDQCondDTO condvaluetext(String condValueText) {
        this.setCondValueText(condValueText);
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
    public PSDEDQCondDTO createdate(Timestamp createDate) {
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
    public PSDEDQCondDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSDEDQCondDTO customcond(String customCond) {
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
    public PSDEDQCondDTO customtype(String customType) {
        this.setCustomType(customType);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO customtype(PSModelEnums.CustomCondType customType) {
        if (customType == null) {
            this.setCustomType(null);
        } else {
            this.setCustomType(customType.value);
        }
        return this;
    }

    @JsonProperty(value="groupnotflag")
    public void setGroupNotFlag(Integer groupNotFlag) {
        this._set(DTOFIELD_GROUPNOTFLAG, groupNotFlag);
    }

    @JsonIgnore
    public Integer getGroupNotFlag() {
        Object objValue = this._get(DTOFIELD_GROUPNOTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isGroupNotFlagDirty() {
        return this._contains(DTOFIELD_GROUPNOTFLAG);
    }

    @JsonIgnore
    public void resetGroupNotFlag() {
        this._reset(DTOFIELD_GROUPNOTFLAG);
    }

    @JsonIgnore
    public PSDEDQCondDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO groupnotflag(Boolean groupNotFlag) {
        if (groupNotFlag == null) {
            this.setGroupNotFlag(null);
        } else {
            this.setGroupNotFlag(groupNotFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="groupop")
    public void setGroupOP(String groupOP) {
        this._set(DTOFIELD_GROUPOP, groupOP);
    }

    @JsonIgnore
    public String getGroupOP() {
        Object objValue = this._get(DTOFIELD_GROUPOP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isGroupOPDirty() {
        return this._contains(DTOFIELD_GROUPOP);
    }

    @JsonIgnore
    public void resetGroupOP() {
        this._reset(DTOFIELD_GROUPOP);
    }

    @JsonIgnore
    public PSDEDQCondDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO groupop(PSModelEnums.GroupCondOP groupOP) {
        if (groupOP == null) {
            this.setGroupOP(null);
        } else {
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    @JsonProperty(value="ignoreempty")
    public void setIgnoreEmpty(Integer ignoreEmpty) {
        this._set(DTOFIELD_IGNOREEMPTY, ignoreEmpty);
    }

    @JsonIgnore
    public Integer getIgnoreEmpty() {
        Object objValue = this._get(DTOFIELD_IGNOREEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreEmptyDirty() {
        return this._contains(DTOFIELD_IGNOREEMPTY);
    }

    @JsonIgnore
    public void resetIgnoreEmpty() {
        this._reset(DTOFIELD_IGNOREEMPTY);
    }

    @JsonIgnore
    public PSDEDQCondDTO ignoreempty(Integer ignoreEmpty) {
        this.setIgnoreEmpty(ignoreEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO ignoreempty(PSModelEnums.DEDQCondIgnoreMode ignoreEmpty) {
        if (ignoreEmpty == null) {
            this.setIgnoreEmpty(null);
        } else {
            this.setIgnoreEmpty(ignoreEmpty.value);
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
    public PSDEDQCondDTO memo(String memo) {
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
    public PSDEDQCondDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsdedqcondid")
    public void setPPSDEDQCondId(String pPSDEDQCondId) {
        this._set(DTOFIELD_PPSDEDQCONDID, pPSDEDQCondId);
    }

    @JsonIgnore
    public String getPPSDEDQCondId() {
        Object objValue = this._get(DTOFIELD_PPSDEDQCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEDQCondIdDirty() {
        return this._contains(DTOFIELD_PPSDEDQCONDID);
    }

    @JsonIgnore
    public void resetPPSDEDQCondId() {
        this._reset(DTOFIELD_PPSDEDQCONDID);
    }

    @JsonIgnore
    public PSDEDQCondDTO ppsdedqcondid(String pPSDEDQCondId) {
        this.setPPSDEDQCondId(pPSDEDQCondId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO ppsdedqcondid(PSDEDQCondDTO pSDEDQCond) {
        if (pSDEDQCond == null) {
            this.setPPSDEDQCondId(null);
            this.setPPSDEDQCondName(null);
        } else {
            this.setPPSDEDQCondId(pSDEDQCond.getPSDEDQCondId());
            this.setPPSDEDQCondName(pSDEDQCond.getPSDEDQCondName());
        }
        return this;
    }

    @JsonProperty(value="ppsdedqcondname")
    public void setPPSDEDQCondName(String pPSDEDQCondName) {
        this._set(DTOFIELD_PPSDEDQCONDNAME, pPSDEDQCondName);
    }

    @JsonIgnore
    public String getPPSDEDQCondName() {
        Object objValue = this._get(DTOFIELD_PPSDEDQCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEDQCondNameDirty() {
        return this._contains(DTOFIELD_PPSDEDQCONDNAME);
    }

    @JsonIgnore
    public void resetPPSDEDQCondName() {
        this._reset(DTOFIELD_PPSDEDQCONDNAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO ppsdedqcondname(String pPSDEDQCondName) {
        this.setPPSDEDQCondName(pPSDEDQCondName);
        return this;
    }

    @JsonProperty(value="psdbvalueopid")
    public void setPSDBValueOPId(String pSDBValueOPId) {
        this._set(DTOFIELD_PSDBVALUEOPID, pSDBValueOPId);
    }

    @JsonIgnore
    public String getPSDBValueOPId() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPIdDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public void resetPSDBValueOPId() {
        this._reset(DTOFIELD_PSDBVALUEOPID);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
        if (pSDBValueOP == null) {
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        } else {
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    @JsonProperty(value="psdbvalueopname")
    public void setPSDBValueOPName(String pSDBValueOPName) {
        this._set(DTOFIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }

    @JsonIgnore
    public String getPSDBValueOPName() {
        Object objValue = this._get(DTOFIELD_PSDBVALUEOPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDBValueOPNameDirty() {
        return this._contains(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public void resetPSDBValueOPName() {
        this._reset(DTOFIELD_PSDBVALUEOPNAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    @JsonProperty(value="psdedqcondid")
    public void setPSDEDQCondId(String pSDEDQCondId) {
        this._set(DTOFIELD_PSDEDQCONDID, pSDEDQCondId);
    }

    @JsonIgnore
    public String getPSDEDQCondId() {
        Object objValue = this._get(DTOFIELD_PSDEDQCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCondIdDirty() {
        return this._contains(DTOFIELD_PSDEDQCONDID);
    }

    @JsonIgnore
    public void resetPSDEDQCondId() {
        this._reset(DTOFIELD_PSDEDQCONDID);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqcondid(String pSDEDQCondId) {
        this.setPSDEDQCondId(pSDEDQCondId);
        return this;
    }

    @JsonProperty(value="psdedqcondname")
    public void setPSDEDQCondName(String pSDEDQCondName) {
        this._set(DTOFIELD_PSDEDQCONDNAME, pSDEDQCondName);
    }

    @JsonIgnore
    public String getPSDEDQCondName() {
        Object objValue = this._get(DTOFIELD_PSDEDQCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCondNameDirty() {
        return this._contains(DTOFIELD_PSDEDQCONDNAME);
    }

    @JsonIgnore
    public void resetPSDEDQCondName() {
        this._reset(DTOFIELD_PSDEDQCONDNAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqcondname(String pSDEDQCondName) {
        this.setPSDEDQCondName(pSDEDQCondName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDQCondName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDQCondName(strName);
    }

    @JsonIgnore
    public PSDEDQCondDTO name(String strName) {
        this.setPSDEDQCondName(strName);
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
    public PSDEDQCondDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
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
    public PSDEDQCondDTO psdedqjoinid(String pSDEDQJoinId) {
        this.setPSDEDQJoinId(pSDEDQJoinId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqjoinid(PSDEDQJoinDTO pSDEDQJoin) {
        if (pSDEDQJoin == null) {
            this.setPSDEDQJoinId(null);
            this.setPSDEDQJoinName(null);
        } else {
            this.setPSDEDQJoinId(pSDEDQJoin.getPSDEDQJoinId());
            this.setPSDEDQJoinName(pSDEDQJoin.getPSDEDQJoinName());
        }
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
    public PSDEDQCondDTO psdedqjoinname(String pSDEDQJoinName) {
        this.setPSDEDQJoinName(pSDEDQJoinName);
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
    public PSDEDQCondDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    @JsonProperty(value="psdedqpdcondid")
    public void setPSDEDQPDCondId(String pSDEDQPDCondId) {
        this._set(DTOFIELD_PSDEDQPDCONDID, pSDEDQPDCondId);
    }

    @JsonIgnore
    public String getPSDEDQPDCondId() {
        Object objValue = this._get(DTOFIELD_PSDEDQPDCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQPDCondIdDirty() {
        return this._contains(DTOFIELD_PSDEDQPDCONDID);
    }

    @JsonIgnore
    public void resetPSDEDQPDCondId() {
        this._reset(DTOFIELD_PSDEDQPDCONDID);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqpdcondid(String pSDEDQPDCondId) {
        this.setPSDEDQPDCondId(pSDEDQPDCondId);
        return this;
    }

    @JsonProperty(value="psdedqpdcondname")
    public void setPSDEDQPDCondName(String pSDEDQPDCondName) {
        this._set(DTOFIELD_PSDEDQPDCONDNAME, pSDEDQPDCondName);
    }

    @JsonIgnore
    public String getPSDEDQPDCondName() {
        Object objValue = this._get(DTOFIELD_PSDEDQPDCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQPDCondNameDirty() {
        return this._contains(DTOFIELD_PSDEDQPDCONDNAME);
    }

    @JsonIgnore
    public void resetPSDEDQPDCondName() {
        this._reset(DTOFIELD_PSDEDQPDCONDNAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO psdedqpdcondname(String pSDEDQPDCondName) {
        this.setPSDEDQPDCondName(pSDEDQPDCondName);
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
    public PSDEDQCondDTO psdefid(String pSDEFId) {
        this.setPSDEFId(pSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO psdefid(PSDEFieldDTO pSDEField) {
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
    public PSDEDQCondDTO psdefname(String pSDEFName) {
        this.setPSDEFName(pSDEFName);
        return this;
    }

    @JsonProperty(value="pssysdbvfid")
    public void setPSSysDBVFId(String pSSysDBVFId) {
        this._set(DTOFIELD_PSSYSDBVFID, pSSysDBVFId);
    }

    @JsonIgnore
    public String getPSSysDBVFId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public void resetPSSysDBVFId() {
        this._reset(DTOFIELD_PSSYSDBVFID);
    }

    @JsonIgnore
    public PSDEDQCondDTO pssysdbvfid(String pSSysDBVFId) {
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO pssysdbvfid(PSSysDBVFDTO pSSysDBVF) {
        if (pSSysDBVF == null) {
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        } else {
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbvfname")
    public void setPSSysDBVFName(String pSSysDBVFName) {
        this._set(DTOFIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }

    @JsonIgnore
    public String getPSSysDBVFName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBVFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBVFNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public void resetPSSysDBVFName() {
        this._reset(DTOFIELD_PSSYSDBVFNAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO pssysdbvfname(String pSSysDBVFName) {
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    @JsonProperty(value="psvartypeid")
    public void setPSVARTypeId(String pSVARTypeId) {
        this._set(DTOFIELD_PSVARTYPEID, pSVARTypeId);
    }

    @JsonIgnore
    public String getPSVARTypeId() {
        Object objValue = this._get(DTOFIELD_PSVARTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVARTypeIdDirty() {
        return this._contains(DTOFIELD_PSVARTYPEID);
    }

    @JsonIgnore
    public void resetPSVARTypeId() {
        this._reset(DTOFIELD_PSVARTYPEID);
    }

    @JsonIgnore
    public PSDEDQCondDTO psvartypeid(String pSVARTypeId) {
        this.setPSVARTypeId(pSVARTypeId);
        return this;
    }

    @JsonProperty(value="psvartypename")
    public void setPSVARTypeName(String pSVARTypeName) {
        this._set(DTOFIELD_PSVARTYPENAME, pSVARTypeName);
    }

    @JsonIgnore
    public String getPSVARTypeName() {
        Object objValue = this._get(DTOFIELD_PSVARTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVARTypeNameDirty() {
        return this._contains(DTOFIELD_PSVARTYPENAME);
    }

    @JsonIgnore
    public void resetPSVARTypeName() {
        this._reset(DTOFIELD_PSVARTYPENAME);
    }

    @JsonIgnore
    public PSDEDQCondDTO psvartypename(String pSVARTypeName) {
        this.setPSVARTypeName(pSVARTypeName);
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
    public PSDEDQCondDTO updatedate(Timestamp updateDate) {
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
    public PSDEDQCondDTO updateman(String updateMan) {
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
    public PSDEDQCondDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDQCondDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDQCondDTO usertag(String userTag) {
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
    public PSDEDQCondDTO usertag2(String userTag2) {
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
    public PSDEDQCondDTO usertag3(String userTag3) {
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
    public PSDEDQCondDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDQCondId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDQCondId(strValue);
    }

    @JsonIgnore
    public PSDEDQCondDTO id(String strValue) {
        this.setPSDEDQCondId(strValue);
        return this;
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
