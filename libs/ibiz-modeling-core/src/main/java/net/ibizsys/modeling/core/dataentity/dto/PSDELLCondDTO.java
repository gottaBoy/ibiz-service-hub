package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELLCondDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDSTPARAM = "CUSTOMDSTPARAM";
    protected static final String DTOFIELD_CUSTOMDSTPARAM = "customdstparam";
    public static final String FIELD_DSTPARAMPSDEID = "DSTPARAMPSDEID";
    protected static final String DTOFIELD_DSTPARAMPSDEID = "dstparampsdeid";
    public static final String FIELD_DSTPSDEFID = "DSTPSDEFID";
    protected static final String DTOFIELD_DSTPSDEFID = "dstpsdefid";
    public static final String FIELD_DSTPSDEFNAME = "DSTPSDEFNAME";
    protected static final String DTOFIELD_DSTPSDEFNAME = "dstpsdefname";
    public static final String FIELD_DSTPSDLPARAMID = "DSTPSDLPARAMID";
    protected static final String DTOFIELD_DSTPSDLPARAMID = "dstpsdlparamid";
    public static final String FIELD_DSTPSDLPARAMNAME = "DSTPSDLPARAMNAME";
    protected static final String DTOFIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";
    public static final String FIELD_GROUPNOTFLAG = "GROUPNOTFLAG";
    protected static final String DTOFIELD_GROUPNOTFLAG = "groupnotflag";
    public static final String FIELD_GROUPOP = "GROUPOP";
    protected static final String DTOFIELD_GROUPOP = "groupop";
    public static final String FIELD_LOGICTYPE = "LOGICTYPE";
    protected static final String DTOFIELD_LOGICTYPE = "logictype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_PPSDELLCONDID = "PPSDELLCONDID";
    protected static final String DTOFIELD_PPSDELLCONDID = "ppsdellcondid";
    public static final String FIELD_PPSDELLCONDNAME = "PPSDELLCONDNAME";
    protected static final String DTOFIELD_PPSDELLCONDNAME = "ppsdellcondname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSDELLCONDID = "PSDELLCONDID";
    protected static final String DTOFIELD_PSDELLCONDID = "psdellcondid";
    public static final String FIELD_PSDELLCONDNAME = "PSDELLCONDNAME";
    protected static final String DTOFIELD_PSDELLCONDNAME = "psdellcondname";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICLINKID = "PSDELOGICLINKID";
    protected static final String DTOFIELD_PSDELOGICLINKID = "psdelogiclinkid";
    public static final String FIELD_PSDELOGICLINKNAME = "PSDELOGICLINKNAME";
    protected static final String DTOFIELD_PSDELOGICLINKNAME = "psdelogiclinkname";
    public static final String FIELD_SRCPSDLPARAMID = "SRCPSDLPARAMID";
    protected static final String DTOFIELD_SRCPSDLPARAMID = "srcpsdlparamid";
    public static final String FIELD_SRCPSDLPARAMNAME = "SRCPSDLPARAMNAME";
    protected static final String DTOFIELD_SRCPSDLPARAMNAME = "srcpsdlparamname";
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
    public static final String DTOFIELD_PSDELLCONDS = "psdellconds";

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
    public PSDELLCondDTO condvalue(String condValue) {
        this.setCondValue(condValue);
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
    public PSDELLCondDTO createdate(Timestamp createDate) {
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
    public PSDELLCondDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdstparam")
    public void setCustomDSTParam(String customDSTParam) {
        this._set(DTOFIELD_CUSTOMDSTPARAM, customDSTParam);
    }

    @JsonIgnore
    public String getCustomDSTParam() {
        Object objValue = this._get(DTOFIELD_CUSTOMDSTPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDSTParamDirty() {
        return this._contains(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public void resetCustomDSTParam() {
        this._reset(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public PSDELLCondDTO customdstparam(String customDSTParam) {
        this.setCustomDSTParam(customDSTParam);
        return this;
    }

    @JsonProperty(value="dstparampsdeid")
    public void setDstParamPSDEId(String dstParamPSDEId) {
        this._set(DTOFIELD_DSTPARAMPSDEID, dstParamPSDEId);
    }

    @JsonIgnore
    public String getDstParamPSDEId() {
        Object objValue = this._get(DTOFIELD_DSTPARAMPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstParamPSDEIdDirty() {
        return this._contains(DTOFIELD_DSTPARAMPSDEID);
    }

    @JsonIgnore
    public void resetDstParamPSDEId() {
        this._reset(DTOFIELD_DSTPARAMPSDEID);
    }

    @JsonIgnore
    public PSDELLCondDTO dstparampsdeid(String dstParamPSDEId) {
        this.setDstParamPSDEId(dstParamPSDEId);
        return this;
    }

    @JsonProperty(value="dstpsdefid")
    public void setDstPSDEFId(String dstPSDEFId) {
        this._set(DTOFIELD_DSTPSDEFID, dstPSDEFId);
    }

    @JsonIgnore
    public String getDstPSDEFId() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFIdDirty() {
        return this._contains(DTOFIELD_DSTPSDEFID);
    }

    @JsonIgnore
    public void resetDstPSDEFId() {
        this._reset(DTOFIELD_DSTPSDEFID);
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdefid(String dstPSDEFId) {
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setDstPSDEFId(null);
            this.setDstPSDEFName(null);
        } else {
            this.setDstPSDEFId(pSDEField.getPSDEFieldId());
            this.setDstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdefname")
    public void setDstPSDEFName(String dstPSDEFName) {
        this._set(DTOFIELD_DSTPSDEFNAME, dstPSDEFName);
    }

    @JsonIgnore
    public String getDstPSDEFName() {
        Object objValue = this._get(DTOFIELD_DSTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDEFNameDirty() {
        return this._contains(DTOFIELD_DSTPSDEFNAME);
    }

    @JsonIgnore
    public void resetDstPSDEFName() {
        this._reset(DTOFIELD_DSTPSDEFNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdefname(String dstPSDEFName) {
        this.setDstPSDEFName(dstPSDEFName);
        return this;
    }

    @JsonProperty(value="dstpsdlparamid")
    public void setDstPSDLParamId(String dstPSDLParamId) {
        this._set(DTOFIELD_DSTPSDLPARAMID, dstPSDLParamId);
    }

    @JsonIgnore
    public String getDstPSDLParamId() {
        Object objValue = this._get(DTOFIELD_DSTPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDLParamIdDirty() {
        return this._contains(DTOFIELD_DSTPSDLPARAMID);
    }

    @JsonIgnore
    public void resetDstPSDLParamId() {
        this._reset(DTOFIELD_DSTPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdlparamid(String dstPSDLParamId) {
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setDstParamPSDEId(null);
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        } else {
            this.setDstParamPSDEId(pSDELogicParam.getParamPSDEId());
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdlparamname")
    public void setDstPSDLParamName(String dstPSDLParamName) {
        this._set(DTOFIELD_DSTPSDLPARAMNAME, dstPSDLParamName);
    }

    @JsonIgnore
    public String getDstPSDLParamName() {
        Object objValue = this._get(DTOFIELD_DSTPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDLParamNameDirty() {
        return this._contains(DTOFIELD_DSTPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetDstPSDLParamName() {
        this._reset(DTOFIELD_DSTPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO dstpsdlparamname(String dstPSDLParamName) {
        this.setDstPSDLParamName(dstPSDLParamName);
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
    public PSDELLCondDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO groupnotflag(Boolean groupNotFlag) {
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
    public PSDELLCondDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO groupop(PSModelEnums.GroupCondOP groupOP) {
        if (groupOP == null) {
            this.setGroupOP(null);
        } else {
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    @JsonProperty(value="logictype")
    public void setLogicType(String logicType) {
        this._set(DTOFIELD_LOGICTYPE, logicType);
    }

    @JsonIgnore
    public String getLogicType() {
        Object objValue = this._get(DTOFIELD_LOGICTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicTypeDirty() {
        return this._contains(DTOFIELD_LOGICTYPE);
    }

    @JsonIgnore
    public void resetLogicType() {
        this._reset(DTOFIELD_LOGICTYPE);
    }

    @JsonIgnore
    public PSDELLCondDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO logictype(PSModelEnums.LogicLinkCondType logicType) {
        if (logicType == null) {
            this.setLogicType(null);
        } else {
            this.setLogicType(logicType.value);
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
    public PSDELLCondDTO memo(String memo) {
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
    public PSDELLCondDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDELLCondDTO paramtype(String paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO paramtype(PSModelEnums.DELLCondParamType paramType) {
        if (paramType == null) {
            this.setParamType(null);
        } else {
            this.setParamType(paramType.value);
        }
        return this;
    }

    @JsonProperty(value="ppsdellcondid")
    public void setPPSDELLCondId(String pPSDELLCondId) {
        this._set(DTOFIELD_PPSDELLCONDID, pPSDELLCondId);
    }

    @JsonIgnore
    public String getPPSDELLCondId() {
        Object objValue = this._get(DTOFIELD_PPSDELLCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDELLCondIdDirty() {
        return this._contains(DTOFIELD_PPSDELLCONDID);
    }

    @JsonIgnore
    public void resetPPSDELLCondId() {
        this._reset(DTOFIELD_PPSDELLCONDID);
    }

    @JsonIgnore
    public PSDELLCondDTO ppsdellcondid(String pPSDELLCondId) {
        this.setPPSDELLCondId(pPSDELLCondId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO ppsdellcondid(PSDELLCondDTO pSDELLCond) {
        if (pSDELLCond == null) {
            this.setPPSDELLCondId(null);
            this.setPPSDELLCondName(null);
        } else {
            this.setPPSDELLCondId(pSDELLCond.getPSDELLCondId());
            this.setPPSDELLCondName(pSDELLCond.getPSDELLCondName());
        }
        return this;
    }

    @JsonProperty(value="ppsdellcondname")
    public void setPPSDELLCondName(String pPSDELLCondName) {
        this._set(DTOFIELD_PPSDELLCONDNAME, pPSDELLCondName);
    }

    @JsonIgnore
    public String getPPSDELLCondName() {
        Object objValue = this._get(DTOFIELD_PPSDELLCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDELLCondNameDirty() {
        return this._contains(DTOFIELD_PPSDELLCONDNAME);
    }

    @JsonIgnore
    public void resetPPSDELLCondName() {
        this._reset(DTOFIELD_PPSDELLCONDNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO ppsdellcondname(String pPSDELLCondName) {
        this.setPPSDELLCondName(pPSDELLCondName);
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
    public PSDELLCondDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
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
    public PSDELLCondDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    @JsonProperty(value="psdellcondid")
    public void setPSDELLCondId(String pSDELLCondId) {
        this._set(DTOFIELD_PSDELLCONDID, pSDELLCondId);
    }

    @JsonIgnore
    public String getPSDELLCondId() {
        Object objValue = this._get(DTOFIELD_PSDELLCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELLCondIdDirty() {
        return this._contains(DTOFIELD_PSDELLCONDID);
    }

    @JsonIgnore
    public void resetPSDELLCondId() {
        this._reset(DTOFIELD_PSDELLCONDID);
    }

    @JsonIgnore
    public PSDELLCondDTO psdellcondid(String pSDELLCondId) {
        this.setPSDELLCondId(pSDELLCondId);
        return this;
    }

    @JsonProperty(value="psdellcondname")
    public void setPSDELLCondName(String pSDELLCondName) {
        this._set(DTOFIELD_PSDELLCONDNAME, pSDELLCondName);
    }

    @JsonIgnore
    public String getPSDELLCondName() {
        Object objValue = this._get(DTOFIELD_PSDELLCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELLCondNameDirty() {
        return this._contains(DTOFIELD_PSDELLCONDNAME);
    }

    @JsonIgnore
    public void resetPSDELLCondName() {
        this._reset(DTOFIELD_PSDELLCONDNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO psdellcondname(String pSDELLCondName) {
        this.setPSDELLCondName(pSDELLCondName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELLCondName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELLCondName(strName);
    }

    @JsonIgnore
    public PSDELLCondDTO name(String strName) {
        this.setPSDELLCondName(strName);
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDElogicId(String pSDElogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDElogicId);
    }

    @JsonIgnore
    public String getPSDElogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDElogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDElogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSDELLCondDTO psdelogicid(String pSDElogicId) {
        this.setPSDElogicId(pSDElogicId);
        return this;
    }

    @JsonProperty(value="psdelogiclinkid")
    public void setPSDELogicLinkId(String pSDELogicLinkId) {
        this._set(DTOFIELD_PSDELOGICLINKID, pSDELogicLinkId);
    }

    @JsonIgnore
    public String getPSDELogicLinkId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICLINKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicLinkIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICLINKID);
    }

    @JsonIgnore
    public void resetPSDELogicLinkId() {
        this._reset(DTOFIELD_PSDELOGICLINKID);
    }

    @JsonIgnore
    public PSDELLCondDTO psdelogiclinkid(String pSDELogicLinkId) {
        this.setPSDELogicLinkId(pSDELogicLinkId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO psdelogiclinkid(PSDELogicLinkDTO pSDELogicLink) {
        if (pSDELogicLink == null) {
            this.setPSDElogicId(null);
            this.setPSDELogicLinkId(null);
            this.setPSDELogicLinkName(null);
        } else {
            this.setPSDElogicId(pSDELogicLink.getPSDELogicId());
            this.setPSDELogicLinkId(pSDELogicLink.getPSDELogicLinkId());
            this.setPSDELogicLinkName(pSDELogicLink.getPSDELogicLinkName());
        }
        return this;
    }

    @JsonProperty(value="psdelogiclinkname")
    public void setPSDELogicLinkName(String pSDELogicLinkName) {
        this._set(DTOFIELD_PSDELOGICLINKNAME, pSDELogicLinkName);
    }

    @JsonIgnore
    public String getPSDELogicLinkName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICLINKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicLinkNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICLINKNAME);
    }

    @JsonIgnore
    public void resetPSDELogicLinkName() {
        this._reset(DTOFIELD_PSDELOGICLINKNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO psdelogiclinkname(String pSDELogicLinkName) {
        this.setPSDELogicLinkName(pSDELogicLinkName);
        return this;
    }

    @JsonProperty(value="srcpsdlparamid")
    public void setSrcPSDLParamId(String srcPSDLParamId) {
        this._set(DTOFIELD_SRCPSDLPARAMID, srcPSDLParamId);
    }

    @JsonIgnore
    public String getSrcPSDLParamId() {
        Object objValue = this._get(DTOFIELD_SRCPSDLPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDLParamIdDirty() {
        return this._contains(DTOFIELD_SRCPSDLPARAMID);
    }

    @JsonIgnore
    public void resetSrcPSDLParamId() {
        this._reset(DTOFIELD_SRCPSDLPARAMID);
    }

    @JsonIgnore
    public PSDELLCondDTO srcpsdlparamid(String srcPSDLParamId) {
        this.setSrcPSDLParamId(srcPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO srcpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        } else {
            this.setSrcPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setSrcPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    @JsonProperty(value="srcpsdlparamname")
    public void setSrcPSDLParamName(String srcPSDLParamName) {
        this._set(DTOFIELD_SRCPSDLPARAMNAME, srcPSDLParamName);
    }

    @JsonIgnore
    public String getSrcPSDLParamName() {
        Object objValue = this._get(DTOFIELD_SRCPSDLPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDLParamNameDirty() {
        return this._contains(DTOFIELD_SRCPSDLPARAMNAME);
    }

    @JsonIgnore
    public void resetSrcPSDLParamName() {
        this._reset(DTOFIELD_SRCPSDLPARAMNAME);
    }

    @JsonIgnore
    public PSDELLCondDTO srcpsdlparamname(String srcPSDLParamName) {
        this.setSrcPSDLParamName(srcPSDLParamName);
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
    public PSDELLCondDTO updatedate(Timestamp updateDate) {
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
    public PSDELLCondDTO updateman(String updateMan) {
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
    public PSDELLCondDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELLCondDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDELLCondDTO usertag(String userTag) {
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
    public PSDELLCondDTO usertag2(String userTag2) {
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
    public PSDELLCondDTO usertag3(String userTag3) {
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
    public PSDELLCondDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELLCondId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELLCondId(strValue);
    }

    @JsonIgnore
    public PSDELLCondDTO id(String strValue) {
        this.setPSDELLCondId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDELLCondDTO> getPSDELLConds() {
        Object list = this._get(DTOFIELD_PSDELLCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdellconds")
    public void setPSDELLConds(List<PSDELLCondDTO> psdellconds) {
        this._set(DTOFIELD_PSDELLCONDS, psdellconds);
    }

    @JsonIgnore
    public List<PSDELLCondDTO> getPSDELLCondsIf() {
        Object list = this._get(DTOFIELD_PSDELLCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELLCONDS, list);
        }
        return (List) list;
    }
}
