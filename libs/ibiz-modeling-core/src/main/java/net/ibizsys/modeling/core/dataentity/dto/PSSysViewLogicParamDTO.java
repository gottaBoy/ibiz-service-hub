package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewLogicDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysViewLogicParamDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMCAT = "PARAMCAT";
    protected static final String DTOFIELD_PARAMCAT = "paramcat";
    public static final String FIELD_PARAMDESC = "PARAMDESC";
    protected static final String DTOFIELD_PARAMDESC = "paramdesc";
    public static final String FIELD_PARAMKEY = "PARAMKEY";
    protected static final String DTOFIELD_PARAMKEY = "paramkey";
    public static final String FIELD_PARAMSTATE = "PARAMSTATE";
    protected static final String DTOFIELD_PARAMSTATE = "paramstate";
    public static final String FIELD_PARAMSUBKEY = "PARAMSUBKEY";
    protected static final String DTOFIELD_PARAMSUBKEY = "paramsubkey";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_PARAMVALUE = "PARAMVALUE";
    protected static final String DTOFIELD_PARAMVALUE = "paramvalue";
    public static final String FIELD_PARAMVALUE10 = "PARAMVALUE10";
    protected static final String DTOFIELD_PARAMVALUE10 = "paramvalue10";
    public static final String FIELD_PARAMVALUE2 = "PARAMVALUE2";
    protected static final String DTOFIELD_PARAMVALUE2 = "paramvalue2";
    public static final String FIELD_PARAMVALUE3 = "PARAMVALUE3";
    protected static final String DTOFIELD_PARAMVALUE3 = "paramvalue3";
    public static final String FIELD_PARAMVALUE4 = "PARAMVALUE4";
    protected static final String DTOFIELD_PARAMVALUE4 = "paramvalue4";
    public static final String FIELD_PARAMVALUE5 = "PARAMVALUE5";
    protected static final String DTOFIELD_PARAMVALUE5 = "paramvalue5";
    public static final String FIELD_PARAMVALUE6 = "PARAMVALUE6";
    protected static final String DTOFIELD_PARAMVALUE6 = "paramvalue6";
    public static final String FIELD_PARAMVALUE7 = "PARAMVALUE7";
    protected static final String DTOFIELD_PARAMVALUE7 = "paramvalue7";
    public static final String FIELD_PARAMVALUE8 = "PARAMVALUE8";
    protected static final String DTOFIELD_PARAMVALUE8 = "paramvalue8";
    public static final String FIELD_PARAMVALUE9 = "PARAMVALUE9";
    protected static final String DTOFIELD_PARAMVALUE9 = "paramvalue9";
    public static final String FIELD_PSSYSVIEWLOGICID = "PSSYSVIEWLOGICID";
    protected static final String DTOFIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";
    public static final String FIELD_PSSYSVIEWLOGICNAME = "PSSYSVIEWLOGICNAME";
    protected static final String DTOFIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";
    public static final String FIELD_PSSYSVIEWLOGICPARAMID = "PSSYSVIEWLOGICPARAMID";
    protected static final String DTOFIELD_PSSYSVIEWLOGICPARAMID = "pssysviewlogicparamid";
    public static final String FIELD_PSSYSVIEWLOGICPARAMNAME = "PSSYSVIEWLOGICPARAMNAME";
    protected static final String DTOFIELD_PSSYSVIEWLOGICPARAMNAME = "pssysviewlogicparamname";
    public static final String FIELD_REFOBJID = "REFOBJID";
    protected static final String DTOFIELD_REFOBJID = "refobjid";
    public static final String FIELD_REFOBJNAME = "REFOBJNAME";
    protected static final String DTOFIELD_REFOBJNAME = "refobjname";
    public static final String FIELD_REFOBJTYPE = "REFOBJTYPE";
    protected static final String DTOFIELD_REFOBJTYPE = "refobjtype";
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
    public PSSysViewLogicParamDTO createdate(Timestamp createDate) {
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
    public PSSysViewLogicParamDTO createman(String createMan) {
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
    public PSSysViewLogicParamDTO memo(String memo) {
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
    public PSSysViewLogicParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="paramcat")
    public void setParamCat(String paramCat) {
        this._set(DTOFIELD_PARAMCAT, paramCat);
    }

    @JsonIgnore
    public String getParamCat() {
        Object objValue = this._get(DTOFIELD_PARAMCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamCatDirty() {
        return this._contains(DTOFIELD_PARAMCAT);
    }

    @JsonIgnore
    public void resetParamCat() {
        this._reset(DTOFIELD_PARAMCAT);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramcat(String paramCat) {
        this.setParamCat(paramCat);
        return this;
    }

    @JsonProperty(value="paramdesc")
    public void setParamDesc(String paramDesc) {
        this._set(DTOFIELD_PARAMDESC, paramDesc);
    }

    @JsonIgnore
    public String getParamDesc() {
        Object objValue = this._get(DTOFIELD_PARAMDESC);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamDescDirty() {
        return this._contains(DTOFIELD_PARAMDESC);
    }

    @JsonIgnore
    public void resetParamDesc() {
        this._reset(DTOFIELD_PARAMDESC);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramdesc(String paramDesc) {
        this.setParamDesc(paramDesc);
        return this;
    }

    @JsonProperty(value="paramkey")
    public void setParamKey(String paramKey) {
        this._set(DTOFIELD_PARAMKEY, paramKey);
    }

    @JsonIgnore
    public String getParamKey() {
        Object objValue = this._get(DTOFIELD_PARAMKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamKeyDirty() {
        return this._contains(DTOFIELD_PARAMKEY);
    }

    @JsonIgnore
    public void resetParamKey() {
        this._reset(DTOFIELD_PARAMKEY);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramkey(String paramKey) {
        this.setParamKey(paramKey);
        return this;
    }

    @JsonProperty(value="paramstate")
    public void setParamState(Integer paramState) {
        this._set(DTOFIELD_PARAMSTATE, paramState);
    }

    @JsonIgnore
    public Integer getParamState() {
        Object objValue = this._get(DTOFIELD_PARAMSTATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamStateDirty() {
        return this._contains(DTOFIELD_PARAMSTATE);
    }

    @JsonIgnore
    public void resetParamState() {
        this._reset(DTOFIELD_PARAMSTATE);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramstate(Integer paramState) {
        this.setParamState(paramState);
        return this;
    }

    @JsonProperty(value="paramsubkey")
    public void setParamSubKey(String paramSubKey) {
        this._set(DTOFIELD_PARAMSUBKEY, paramSubKey);
    }

    @JsonIgnore
    public String getParamSubKey() {
        Object objValue = this._get(DTOFIELD_PARAMSUBKEY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamSubKeyDirty() {
        return this._contains(DTOFIELD_PARAMSUBKEY);
    }

    @JsonIgnore
    public void resetParamSubKey() {
        this._reset(DTOFIELD_PARAMSUBKEY);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramsubkey(String paramSubKey) {
        this.setParamSubKey(paramSubKey);
        return this;
    }

    @JsonProperty(value="paramtype")
    public void setParamType(String paramType) {
        this._set(DTOFIELD_PARAMTYPE, paramType);
    }

    @JsonIgnore
    public String getParamType() {
        Object objValue = this._get(DTOFIELD_PARAMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTypeDirty() {
        return this._contains(DTOFIELD_PARAMTYPE);
    }

    @JsonIgnore
    public void resetParamType() {
        this._reset(DTOFIELD_PARAMTYPE);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramtype(String paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonProperty(value="paramvalue")
    public void setParamValue(String paramValue) {
        this._set(DTOFIELD_PARAMVALUE, paramValue);
    }

    @JsonIgnore
    public String getParamValue() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamValueDirty() {
        return this._contains(DTOFIELD_PARAMVALUE);
    }

    @JsonIgnore
    public void resetParamValue() {
        this._reset(DTOFIELD_PARAMVALUE);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue(String paramValue) {
        this.setParamValue(paramValue);
        return this;
    }

    @JsonProperty(value="paramvalue10")
    public void setParamValue10(Integer paramValue10) {
        this._set(DTOFIELD_PARAMVALUE10, paramValue10);
    }

    @JsonIgnore
    public Integer getParamValue10() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamValue10Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE10);
    }

    @JsonIgnore
    public void resetParamValue10() {
        this._reset(DTOFIELD_PARAMVALUE10);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue10(Integer paramValue10) {
        this.setParamValue10(paramValue10);
        return this;
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue10(Boolean paramValue10) {
        if (paramValue10 == null) {
            this.setParamValue10(null);
        } else {
            this.setParamValue10(paramValue10 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="paramvalue2")
    public void setParamValue2(String paramValue2) {
        this._set(DTOFIELD_PARAMVALUE2, paramValue2);
    }

    @JsonIgnore
    public String getParamValue2() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamValue2Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE2);
    }

    @JsonIgnore
    public void resetParamValue2() {
        this._reset(DTOFIELD_PARAMVALUE2);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue2(String paramValue2) {
        this.setParamValue2(paramValue2);
        return this;
    }

    @JsonProperty(value="paramvalue3")
    public void setParamValue3(String paramValue3) {
        this._set(DTOFIELD_PARAMVALUE3, paramValue3);
    }

    @JsonIgnore
    public String getParamValue3() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamValue3Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE3);
    }

    @JsonIgnore
    public void resetParamValue3() {
        this._reset(DTOFIELD_PARAMVALUE3);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue3(String paramValue3) {
        this.setParamValue3(paramValue3);
        return this;
    }

    @JsonProperty(value="paramvalue4")
    public void setParamValue4(String paramValue4) {
        this._set(DTOFIELD_PARAMVALUE4, paramValue4);
    }

    @JsonIgnore
    public String getParamValue4() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamValue4Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE4);
    }

    @JsonIgnore
    public void resetParamValue4() {
        this._reset(DTOFIELD_PARAMVALUE4);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue4(String paramValue4) {
        this.setParamValue4(paramValue4);
        return this;
    }

    @JsonProperty(value="paramvalue5")
    public void setParamValue5(Integer paramValue5) {
        this._set(DTOFIELD_PARAMVALUE5, paramValue5);
    }

    @JsonIgnore
    public Integer getParamValue5() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamValue5Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE5);
    }

    @JsonIgnore
    public void resetParamValue5() {
        this._reset(DTOFIELD_PARAMVALUE5);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue5(Integer paramValue5) {
        this.setParamValue5(paramValue5);
        return this;
    }

    @JsonProperty(value="paramvalue6")
    public void setParamValue6(Integer paramValue6) {
        this._set(DTOFIELD_PARAMVALUE6, paramValue6);
    }

    @JsonIgnore
    public Integer getParamValue6() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamValue6Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE6);
    }

    @JsonIgnore
    public void resetParamValue6() {
        this._reset(DTOFIELD_PARAMVALUE6);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue6(Integer paramValue6) {
        this.setParamValue6(paramValue6);
        return this;
    }

    @JsonProperty(value="paramvalue7")
    public void setParamValue7(BigDecimal paramValue7) {
        this._set(DTOFIELD_PARAMVALUE7, paramValue7);
    }

    @JsonIgnore
    public BigDecimal getParamValue7() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE7);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isParamValue7Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE7);
    }

    @JsonIgnore
    public void resetParamValue7() {
        this._reset(DTOFIELD_PARAMVALUE7);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue7(BigDecimal paramValue7) {
        this.setParamValue7(paramValue7);
        return this;
    }

    @JsonProperty(value="paramvalue8")
    public void setParamValue8(BigDecimal paramValue8) {
        this._set(DTOFIELD_PARAMVALUE8, paramValue8);
    }

    @JsonIgnore
    public BigDecimal getParamValue8() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE8);
        if (objValue == null) {
            return null;
        }
        return (BigDecimal)objValue;
    }

    @JsonIgnore
    public boolean isParamValue8Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE8);
    }

    @JsonIgnore
    public void resetParamValue8() {
        this._reset(DTOFIELD_PARAMVALUE8);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue8(BigDecimal paramValue8) {
        this.setParamValue8(paramValue8);
        return this;
    }

    @JsonProperty(value="paramvalue9")
    public void setParamValue9(Integer paramValue9) {
        this._set(DTOFIELD_PARAMVALUE9, paramValue9);
    }

    @JsonIgnore
    public Integer getParamValue9() {
        Object objValue = this._get(DTOFIELD_PARAMVALUE9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamValue9Dirty() {
        return this._contains(DTOFIELD_PARAMVALUE9);
    }

    @JsonIgnore
    public void resetParamValue9() {
        this._reset(DTOFIELD_PARAMVALUE9);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue9(Integer paramValue9) {
        this.setParamValue9(paramValue9);
        return this;
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue9(Boolean paramValue9) {
        if (paramValue9 == null) {
            this.setParamValue9(null);
        } else {
            this.setParamValue9(paramValue9 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="pssysviewlogicid")
    public void setPSSysViewLogicId(String pSSysViewLogicId) {
        this._set(DTOFIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }

    @JsonIgnore
    public String getPSSysViewLogicId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICID);
    }

    @JsonIgnore
    public void resetPSSysViewLogicId() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICID);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicid(String pSSysViewLogicId) {
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic) {
        if (pSSysViewLogic == null) {
            this.setPSSysViewLogicId(null);
            this.setPSSysViewLogicName(null);
        } else {
            this.setPSSysViewLogicId(pSSysViewLogic.getPSSysViewLogicId());
            this.setPSSysViewLogicName(pSSysViewLogic.getPSSysViewLogicName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewlogicname")
    public void setPSSysViewLogicName(String pSSysViewLogicName) {
        this._set(DTOFIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }

    @JsonIgnore
    public String getPSSysViewLogicName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICNAME);
    }

    @JsonIgnore
    public void resetPSSysViewLogicName() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICNAME);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicname(String pSSysViewLogicName) {
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    @JsonProperty(value="pssysviewlogicparamid")
    public void setPSSysViewLogicParamId(String pSSysViewLogicParamId) {
        this._set(DTOFIELD_PSSYSVIEWLOGICPARAMID, pSSysViewLogicParamId);
    }

    @JsonIgnore
    public String getPSSysViewLogicParamId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicParamIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICPARAMID);
    }

    @JsonIgnore
    public void resetPSSysViewLogicParamId() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICPARAMID);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicparamid(String pSSysViewLogicParamId) {
        this.setPSSysViewLogicParamId(pSSysViewLogicParamId);
        return this;
    }

    @JsonProperty(value="pssysviewlogicparamname")
    public void setPSSysViewLogicParamName(String pSSysViewLogicParamName) {
        this._set(DTOFIELD_PSSYSVIEWLOGICPARAMNAME, pSSysViewLogicParamName);
    }

    @JsonIgnore
    public String getPSSysViewLogicParamName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWLOGICPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewLogicParamNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWLOGICPARAMNAME);
    }

    @JsonIgnore
    public void resetPSSysViewLogicParamName() {
        this._reset(DTOFIELD_PSSYSVIEWLOGICPARAMNAME);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicparamname(String pSSysViewLogicParamName) {
        this.setPSSysViewLogicParamName(pSSysViewLogicParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysViewLogicParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysViewLogicParamName(strName);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO name(String strName) {
        this.setPSSysViewLogicParamName(strName);
        return this;
    }

    @JsonProperty(value="refobjid")
    public void setRefObjId(String refObjId) {
        this._set(DTOFIELD_REFOBJID, refObjId);
    }

    @JsonIgnore
    public String getRefObjId() {
        Object objValue = this._get(DTOFIELD_REFOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjIdDirty() {
        return this._contains(DTOFIELD_REFOBJID);
    }

    @JsonIgnore
    public void resetRefObjId() {
        this._reset(DTOFIELD_REFOBJID);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO refobjid(String refObjId) {
        this.setRefObjId(refObjId);
        return this;
    }

    @JsonProperty(value="refobjname")
    public void setRefObjName(String refObjName) {
        this._set(DTOFIELD_REFOBJNAME, refObjName);
    }

    @JsonIgnore
    public String getRefObjName() {
        Object objValue = this._get(DTOFIELD_REFOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjNameDirty() {
        return this._contains(DTOFIELD_REFOBJNAME);
    }

    @JsonIgnore
    public void resetRefObjName() {
        this._reset(DTOFIELD_REFOBJNAME);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO refobjname(String refObjName) {
        this.setRefObjName(refObjName);
        return this;
    }

    @JsonProperty(value="refobjtype")
    public void setRefObjType(String refObjType) {
        this._set(DTOFIELD_REFOBJTYPE, refObjType);
    }

    @JsonIgnore
    public String getRefObjType() {
        Object objValue = this._get(DTOFIELD_REFOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRefObjTypeDirty() {
        return this._contains(DTOFIELD_REFOBJTYPE);
    }

    @JsonIgnore
    public void resetRefObjType() {
        this._reset(DTOFIELD_REFOBJTYPE);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO refobjtype(String refObjType) {
        this.setRefObjType(refObjType);
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
    public PSSysViewLogicParamDTO updatedate(Timestamp updateDate) {
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
    public PSSysViewLogicParamDTO updateman(String updateMan) {
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
    public PSSysViewLogicParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysViewLogicParamDTO usertag(String userTag) {
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
    public PSSysViewLogicParamDTO usertag2(String userTag2) {
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
    public PSSysViewLogicParamDTO usertag3(String userTag3) {
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
    public PSSysViewLogicParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysViewLogicParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysViewLogicParamId(strValue);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO id(String strValue) {
        this.setPSSysViewLogicParamId(strValue);
        return this;
    }
}
