package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBProcDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysDBProcParamDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_LENGTH = "LENGTH";
    protected static final String DTOFIELD_LENGTH = "length";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMDIR = "PARAMDIR";
    protected static final String DTOFIELD_PARAMDIR = "paramdir";
    public static final String FIELD_PRECISION = "PRECISION2";
    protected static final String DTOFIELD_PRECISION = "precision";
    public static final String FIELD_PSSYSDBPROCID = "PSSYSDBPROCID";
    protected static final String DTOFIELD_PSSYSDBPROCID = "pssysdbprocid";
    public static final String FIELD_PSSYSDBPROCNAME = "PSSYSDBPROCNAME";
    protected static final String DTOFIELD_PSSYSDBPROCNAME = "pssysdbprocname";
    public static final String FIELD_PSSYSDBPROCPARAMID = "PSSYSDBPROCPARAMID";
    protected static final String DTOFIELD_PSSYSDBPROCPARAMID = "pssysdbprocparamid";
    public static final String FIELD_PSSYSDBPROCPARAMNAME = "PSSYSDBPROCPARAMNAME";
    protected static final String DTOFIELD_PSSYSDBPROCPARAMNAME = "pssysdbprocparamname";
    public static final String FIELD_STDDATATYPE = "STDDATATYPE";
    protected static final String DTOFIELD_STDDATATYPE = "stddatatype";
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
    public PSSysDBProcParamDTO createdate(Timestamp createDate) {
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
    public PSSysDBProcParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defaultvalue")
    public void setDefaultValue(String defaultValue) {
        this._set(DTOFIELD_DEFAULTVALUE, defaultValue);
    }

    @JsonIgnore
    public String getDefaultValue() {
        Object objValue = this._get(DTOFIELD_DEFAULTVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDefaultValueDirty() {
        return this._contains(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public void resetDefaultValue() {
        this._reset(DTOFIELD_DEFAULTVALUE);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="length")
    public void setLength(Integer length) {
        this._set(DTOFIELD_LENGTH, length);
    }

    @JsonIgnore
    public Integer getLength() {
        Object objValue = this._get(DTOFIELD_LENGTH);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLengthDirty() {
        return this._contains(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public void resetLength() {
        this._reset(DTOFIELD_LENGTH);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO length(Integer length) {
        this.setLength(length);
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
    public PSSysDBProcParamDTO logicname(String logicName) {
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
    public PSSysDBProcParamDTO memo(String memo) {
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
    public PSSysDBProcParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="paramdir")
    public void setParamDIR(Integer paramDIR) {
        this._set(DTOFIELD_PARAMDIR, paramDIR);
    }

    @JsonIgnore
    public Integer getParamDIR() {
        Object objValue = this._get(DTOFIELD_PARAMDIR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isParamDIRDirty() {
        return this._contains(DTOFIELD_PARAMDIR);
    }

    @JsonIgnore
    public void resetParamDIR() {
        this._reset(DTOFIELD_PARAMDIR);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO paramdir(Integer paramDIR) {
        this.setParamDIR(paramDIR);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcParamDTO paramdir(PSModelEnums.DBProcParamDir paramDIR) {
        if (paramDIR == null) {
            this.setParamDIR(null);
        } else {
            this.setParamDIR(paramDIR.value);
        }
        return this;
    }

    @JsonProperty(value="precision")
    public void setPrecision(Integer precision) {
        this._set(DTOFIELD_PRECISION, precision);
        this._set(FIELD_PRECISION, precision);
    }

    @JsonIgnore
    public Integer getPrecision() {
        Object objValue = this._get(DTOFIELD_PRECISION);
        if (objValue == null && (objValue = this._get(FIELD_PRECISION)) == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrecisionDirty() {
        if (this._contains(DTOFIELD_PRECISION)) {
            return true;
        }
        return this._contains(FIELD_PRECISION);
    }

    @JsonIgnore
    public void resetPrecision() {
        this._reset(DTOFIELD_PRECISION);
        this._reset(FIELD_PRECISION);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO precision(Integer precision) {
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2() {
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated
    public void setPrecision2(Integer precision2) {
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty() {
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2() {
        this.resetPrecision();
    }

    @JsonProperty(value="pssysdbprocid")
    public void setPSSysDBProcId(String pSSysDBProcId) {
        this._set(DTOFIELD_PSSYSDBPROCID, pSSysDBProcId);
    }

    @JsonIgnore
    public String getPSSysDBProcId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCID);
    }

    @JsonIgnore
    public void resetPSSysDBProcId() {
        this._reset(DTOFIELD_PSSYSDBPROCID);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO pssysdbprocid(String pSSysDBProcId) {
        this.setPSSysDBProcId(pSSysDBProcId);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcParamDTO pssysdbprocid(PSSysDBProcDTO pSSysDBProc) {
        if (pSSysDBProc == null) {
            this.setPSSysDBProcId(null);
            this.setPSSysDBProcName(null);
        } else {
            this.setPSSysDBProcId(pSSysDBProc.getPSSysDBProcId());
            this.setPSSysDBProcName(pSSysDBProc.getPSSysDBProcName());
        }
        return this;
    }

    @JsonProperty(value="pssysdbprocname")
    public void setPSSysDBProcName(String pSSysDBProcName) {
        this._set(DTOFIELD_PSSYSDBPROCNAME, pSSysDBProcName);
    }

    @JsonIgnore
    public String getPSSysDBProcName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCNAME);
    }

    @JsonIgnore
    public void resetPSSysDBProcName() {
        this._reset(DTOFIELD_PSSYSDBPROCNAME);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO pssysdbprocname(String pSSysDBProcName) {
        this.setPSSysDBProcName(pSSysDBProcName);
        return this;
    }

    @JsonProperty(value="pssysdbprocparamid")
    public void setPSSysDBProcParamId(String pSSysDBProcParamId) {
        this._set(DTOFIELD_PSSYSDBPROCPARAMID, pSSysDBProcParamId);
    }

    @JsonIgnore
    public String getPSSysDBProcParamId() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcParamIdDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCPARAMID);
    }

    @JsonIgnore
    public void resetPSSysDBProcParamId() {
        this._reset(DTOFIELD_PSSYSDBPROCPARAMID);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO pssysdbprocparamid(String pSSysDBProcParamId) {
        this.setPSSysDBProcParamId(pSSysDBProcParamId);
        return this;
    }

    @JsonProperty(value="pssysdbprocparamname")
    public void setPSSysDBProcParamName(String pSSysDBProcParamName) {
        this._set(DTOFIELD_PSSYSDBPROCPARAMNAME, pSSysDBProcParamName);
    }

    @JsonIgnore
    public String getPSSysDBProcParamName() {
        Object objValue = this._get(DTOFIELD_PSSYSDBPROCPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDBProcParamNameDirty() {
        return this._contains(DTOFIELD_PSSYSDBPROCPARAMNAME);
    }

    @JsonIgnore
    public void resetPSSysDBProcParamName() {
        this._reset(DTOFIELD_PSSYSDBPROCPARAMNAME);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO pssysdbprocparamname(String pSSysDBProcParamName) {
        this.setPSSysDBProcParamName(pSSysDBProcParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysDBProcParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysDBProcParamName(strName);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO name(String strName) {
        this.setPSSysDBProcParamName(strName);
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
    public PSSysDBProcParamDTO stddatatype(Integer stdDataType) {
        this.setStdDataType(stdDataType);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcParamDTO stddatatype(PSModelEnums.StdDataType stdDataType) {
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
    public PSSysDBProcParamDTO updatedate(Timestamp updateDate) {
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
    public PSSysDBProcParamDTO updateman(String updateMan) {
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
    public PSSysDBProcParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysDBProcParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysDBProcParamDTO usertag(String userTag) {
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
    public PSSysDBProcParamDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysDBProcParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysDBProcParamId(strValue);
    }

    @JsonIgnore
    public PSSysDBProcParamDTO id(String strValue) {
        this.setPSSysDBProcParamId(strValue);
        return this;
    }
}
