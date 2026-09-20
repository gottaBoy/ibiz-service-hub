package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELNParamDTO
extends PSModelDTOBase {
    public static final String FIELD_AGGMODE = "AGGMODE";
    protected static final String DTOFIELD_AGGMODE = "aggmode";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDSTPARAM = "CUSTOMDSTPARAM";
    protected static final String DTOFIELD_CUSTOMDSTPARAM = "customdstparam";
    public static final String FIELD_CUSTOMSRCPARAM = "CUSTOMSRCPARAM";
    protected static final String DTOFIELD_CUSTOMSRCPARAM = "customsrcparam";
    public static final String FIELD_DEFAULTVALUE = "DEFAULTVALUE";
    protected static final String DTOFIELD_DEFAULTVALUE = "defaultvalue";
    public static final String FIELD_DIRECTCODE = "DIRECTCODE";
    protected static final String DTOFIELD_DIRECTCODE = "directcode";
    public static final String FIELD_DSTINDEX = "DSTINDEX";
    protected static final String DTOFIELD_DSTINDEX = "dstindex";
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
    public static final String FIELD_DSTSORTDIR = "DSTSORTDIR";
    protected static final String DTOFIELD_DSTSORTDIR = "dstsortdir";
    public static final String FIELD_INOUTFLAG = "INOUTFLAG";
    protected static final String DTOFIELD_INOUTFLAG = "inoutflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMS = "PARAMS";
    protected static final String DTOFIELD_PARAMS = "params";
    public static final String FIELD_PARAMTAG = "PARAMTAG";
    protected static final String DTOFIELD_PARAMTAG = "paramtag";
    public static final String FIELD_PARAMTAG2 = "PARAMTAG2";
    protected static final String DTOFIELD_PARAMTAG2 = "paramtag2";
    public static final String FIELD_PARAMTYPE = "PARAMTYPE";
    protected static final String DTOFIELD_PARAMTYPE = "paramtype";
    public static final String FIELD_PARAMTYPETEXT = "PARAMTYPETEXT";
    protected static final String DTOFIELD_PARAMTYPETEXT = "paramtypetext";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELNPARAMID = "PSDELNPARAMID";
    protected static final String DTOFIELD_PSDELNPARAMID = "psdelnparamid";
    public static final String FIELD_PSDELNPARAMNAME = "PSDELNPARAMNAME";
    protected static final String DTOFIELD_PSDELNPARAMNAME = "psdelnparamname";
    public static final String FIELD_PSDELOGICNODEID = "PSDELOGICNODEID";
    protected static final String DTOFIELD_PSDELOGICNODEID = "psdelogicnodeid";
    public static final String FIELD_PSDELOGICNODENAME = "PSDELOGICNODENAME";
    protected static final String DTOFIELD_PSDELOGICNODENAME = "psdelogicnodename";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSOBJDATA = "PSOBJDATA";
    protected static final String DTOFIELD_PSOBJDATA = "psobjdata";
    public static final String FIELD_PSOBJDATA2 = "PSOBJDATA2";
    protected static final String DTOFIELD_PSOBJDATA2 = "psobjdata2";
    public static final String FIELD_PSOBJID = "PSOBJID";
    protected static final String DTOFIELD_PSOBJID = "psobjid";
    public static final String FIELD_PSOBJNAME = "PSOBJNAME";
    protected static final String DTOFIELD_PSOBJNAME = "psobjname";
    public static final String FIELD_PSOBJTYPE = "PSOBJTYPE";
    protected static final String DTOFIELD_PSOBJTYPE = "psobjtype";
    public static final String FIELD_PSOBJTYPENAME = "PSOBJTYPENAME";
    protected static final String DTOFIELD_PSOBJTYPENAME = "psobjtypename";
    public static final String FIELD_PSSYSMSGTEMPLID = "PSSYSMSGTEMPLID";
    protected static final String DTOFIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";
    public static final String FIELD_PSSYSMSGTEMPLNAME = "PSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";
    public static final String FIELD_PSSYSSEQUENCEID = "PSSYSSEQUENCEID";
    protected static final String DTOFIELD_PSSYSSEQUENCEID = "pssyssequenceid";
    public static final String FIELD_PSSYSSEQUENCENAME = "PSSYSSEQUENCENAME";
    protected static final String DTOFIELD_PSSYSSEQUENCENAME = "pssyssequencename";
    public static final String FIELD_PSSYSTRANSLATORID = "PSSYSTRANSLATORID";
    protected static final String DTOFIELD_PSSYSTRANSLATORID = "pssystranslatorid";
    public static final String FIELD_PSSYSTRANSLATORNAME = "PSSYSTRANSLATORNAME";
    protected static final String DTOFIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";
    public static final String FIELD_SRCINDEX = "SRCINDEX";
    protected static final String DTOFIELD_SRCINDEX = "srcindex";
    public static final String FIELD_SRCPARAMPSDEID = "SRCPARAMPSDEID";
    protected static final String DTOFIELD_SRCPARAMPSDEID = "srcparampsdeid";
    public static final String FIELD_SRCPSDEFID = "SRCPSDEFID";
    protected static final String DTOFIELD_SRCPSDEFID = "srcpsdefid";
    public static final String FIELD_SRCPSDEFNAME = "SRCPSDEFNAME";
    protected static final String DTOFIELD_SRCPSDEFNAME = "srcpsdefname";
    public static final String FIELD_SRCPSDLPARAMID = "SRCPSDLPARAMID";
    protected static final String DTOFIELD_SRCPSDLPARAMID = "srcpsdlparamid";
    public static final String FIELD_SRCPSDLPARAMNAME = "SRCPSDLPARAMNAME";
    protected static final String DTOFIELD_SRCPSDLPARAMNAME = "srcpsdlparamname";
    public static final String FIELD_SRCSIZE = "SRCSIZE";
    protected static final String DTOFIELD_SRCSIZE = "srcsize";
    public static final String FIELD_SRCVALUE = "SRCVALUE";
    protected static final String DTOFIELD_SRCVALUE = "srcvalue";
    public static final String FIELD_SRCVALUESTDDATATYPE = "SRCVALUESTDDATATYPE";
    protected static final String DTOFIELD_SRCVALUESTDDATATYPE = "srcvaluestddatatype";
    public static final String FIELD_SRCVALUETYPE = "SRCVALUETYPE";
    protected static final String DTOFIELD_SRCVALUETYPE = "srcvaluetype";
    public static final String FIELD_SRCVALUETYPETEXT = "SRCVALUETYPETEXT";
    protected static final String DTOFIELD_SRCVALUETYPETEXT = "srcvaluetypetext";
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
    public PSDELNParamDTO aggmode(String aggMode) {
        this.setAggMode(aggMode);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO aggmode(PSModelEnums.AggMode aggMode) {
        if (aggMode == null) {
            this.setAggMode(null);
        } else {
            this.setAggMode(aggMode.value);
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
    public PSDELNParamDTO createdate(Timestamp createDate) {
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
    public PSDELNParamDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customdstparam")
    public void setCustomDstParam(String customDstParam) {
        this._set(DTOFIELD_CUSTOMDSTPARAM, customDstParam);
    }

    @JsonIgnore
    public String getCustomDstParam() {
        Object objValue = this._get(DTOFIELD_CUSTOMDSTPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomDstParamDirty() {
        return this._contains(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public void resetCustomDstParam() {
        this._reset(DTOFIELD_CUSTOMDSTPARAM);
    }

    @JsonIgnore
    public PSDELNParamDTO customdstparam(String customDstParam) {
        this.setCustomDstParam(customDstParam);
        return this;
    }

    @JsonProperty(value="customsrcparam")
    public void setCustomSrcParam(String customSrcParam) {
        this._set(DTOFIELD_CUSTOMSRCPARAM, customSrcParam);
    }

    @JsonIgnore
    public String getCustomSrcParam() {
        Object objValue = this._get(DTOFIELD_CUSTOMSRCPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomSrcParamDirty() {
        return this._contains(DTOFIELD_CUSTOMSRCPARAM);
    }

    @JsonIgnore
    public void resetCustomSrcParam() {
        this._reset(DTOFIELD_CUSTOMSRCPARAM);
    }

    @JsonIgnore
    public PSDELNParamDTO customsrcparam(String customSrcParam) {
        this.setCustomSrcParam(customSrcParam);
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
    public PSDELNParamDTO defaultvalue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    @JsonProperty(value="directcode")
    public void setDirectCode(String directCode) {
        this._set(DTOFIELD_DIRECTCODE, directCode);
    }

    @JsonIgnore
    public String getDirectCode() {
        Object objValue = this._get(DTOFIELD_DIRECTCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDirectCodeDirty() {
        return this._contains(DTOFIELD_DIRECTCODE);
    }

    @JsonIgnore
    public void resetDirectCode() {
        this._reset(DTOFIELD_DIRECTCODE);
    }

    @JsonIgnore
    public PSDELNParamDTO directcode(String directCode) {
        this.setDirectCode(directCode);
        return this;
    }

    @JsonProperty(value="dstindex")
    public void setDstIndex(Integer dstIndex) {
        this._set(DTOFIELD_DSTINDEX, dstIndex);
    }

    @JsonIgnore
    public Integer getDstIndex() {
        Object objValue = this._get(DTOFIELD_DSTINDEX);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDstIndexDirty() {
        return this._contains(DTOFIELD_DSTINDEX);
    }

    @JsonIgnore
    public void resetDstIndex() {
        this._reset(DTOFIELD_DSTINDEX);
    }

    @JsonIgnore
    public PSDELNParamDTO dstindex(Integer dstIndex) {
        this.setDstIndex(dstIndex);
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
    public PSDELNParamDTO dstparampsdeid(String dstParamPSDEId) {
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
    public PSDELNParamDTO dstpsdefid(String dstPSDEFId) {
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO dstpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSDELNParamDTO dstpsdefname(String dstPSDEFName) {
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
    public PSDELNParamDTO dstpsdlparamid(String dstPSDLParamId) {
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO dstpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
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
    public PSDELNParamDTO dstpsdlparamname(String dstPSDLParamName) {
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    @JsonProperty(value="dstsortdir")
    public void setDstSortDir(String dstSortDir) {
        this._set(DTOFIELD_DSTSORTDIR, dstSortDir);
    }

    @JsonIgnore
    public String getDstSortDir() {
        Object objValue = this._get(DTOFIELD_DSTSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstSortDirDirty() {
        return this._contains(DTOFIELD_DSTSORTDIR);
    }

    @JsonIgnore
    public void resetDstSortDir() {
        this._reset(DTOFIELD_DSTSORTDIR);
    }

    @JsonIgnore
    public PSDELNParamDTO dstsortdir(String dstSortDir) {
        this.setDstSortDir(dstSortDir);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO dstsortdir(PSModelEnums.SortDir dstSortDir) {
        if (dstSortDir == null) {
            this.setDstSortDir(null);
        } else {
            this.setDstSortDir(dstSortDir.value);
        }
        return this;
    }

    @JsonProperty(value="inoutflag")
    public void setInOutFlag(Integer inOutFlag) {
        this._set(DTOFIELD_INOUTFLAG, inOutFlag);
    }

    @JsonIgnore
    public Integer getInOutFlag() {
        Object objValue = this._get(DTOFIELD_INOUTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInOutFlagDirty() {
        return this._contains(DTOFIELD_INOUTFLAG);
    }

    @JsonIgnore
    public void resetInOutFlag() {
        this._reset(DTOFIELD_INOUTFLAG);
    }

    @JsonIgnore
    public PSDELNParamDTO inoutflag(Integer inOutFlag) {
        this.setInOutFlag(inOutFlag);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO inoutflag(Boolean inOutFlag) {
        if (inOutFlag == null) {
            this.setInOutFlag(null);
        } else {
            this.setInOutFlag(inOutFlag != false ? 1 : 0);
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
    public PSDELNParamDTO memo(String memo) {
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
    public PSDELNParamDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="params")
    public void setParams(String params) {
        this._set(DTOFIELD_PARAMS, params);
    }

    @JsonIgnore
    public String getParams() {
        Object objValue = this._get(DTOFIELD_PARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamsDirty() {
        return this._contains(DTOFIELD_PARAMS);
    }

    @JsonIgnore
    public void resetParams() {
        this._reset(DTOFIELD_PARAMS);
    }

    @JsonIgnore
    public PSDELNParamDTO params(String params) {
        this.setParams(params);
        return this;
    }

    @JsonProperty(value="paramtag")
    public void setParamTag(String paramTag) {
        this._set(DTOFIELD_PARAMTAG, paramTag);
    }

    @JsonIgnore
    public String getParamTag() {
        Object objValue = this._get(DTOFIELD_PARAMTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTagDirty() {
        return this._contains(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public void resetParamTag() {
        this._reset(DTOFIELD_PARAMTAG);
    }

    @JsonIgnore
    public PSDELNParamDTO paramtag(String paramTag) {
        this.setParamTag(paramTag);
        return this;
    }

    @JsonProperty(value="paramtag2")
    public void setParamTag2(String paramTag2) {
        this._set(DTOFIELD_PARAMTAG2, paramTag2);
    }

    @JsonIgnore
    public String getParamTag2() {
        Object objValue = this._get(DTOFIELD_PARAMTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTag2Dirty() {
        return this._contains(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public void resetParamTag2() {
        this._reset(DTOFIELD_PARAMTAG2);
    }

    @JsonIgnore
    public PSDELNParamDTO paramtag2(String paramTag2) {
        this.setParamTag2(paramTag2);
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
    public PSDELNParamDTO paramtype(String paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO paramtype(PSModelEnums.DELogicNodeParamType paramType) {
        if (paramType == null) {
            this.setParamType(null);
        } else {
            this.setParamType(paramType.value);
        }
        return this;
    }

    @JsonProperty(value="paramtypetext")
    public void setParamTypeText(String paramTypeText) {
        this._set(DTOFIELD_PARAMTYPETEXT, paramTypeText);
    }

    @JsonIgnore
    public String getParamTypeText() {
        Object objValue = this._get(DTOFIELD_PARAMTYPETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamTypeTextDirty() {
        return this._contains(DTOFIELD_PARAMTYPETEXT);
    }

    @JsonIgnore
    public void resetParamTypeText() {
        this._reset(DTOFIELD_PARAMTYPETEXT);
    }

    @JsonIgnore
    public PSDELNParamDTO paramtypetext(String paramTypeText) {
        this.setParamTypeText(paramTypeText);
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
    public PSDELNParamDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelnparamid")
    public void setPSDELNParamId(String pSDELNParamId) {
        this._set(DTOFIELD_PSDELNPARAMID, pSDELNParamId);
    }

    @JsonIgnore
    public String getPSDELNParamId() {
        Object objValue = this._get(DTOFIELD_PSDELNPARAMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELNParamIdDirty() {
        return this._contains(DTOFIELD_PSDELNPARAMID);
    }

    @JsonIgnore
    public void resetPSDELNParamId() {
        this._reset(DTOFIELD_PSDELNPARAMID);
    }

    @JsonIgnore
    public PSDELNParamDTO psdelnparamid(String pSDELNParamId) {
        this.setPSDELNParamId(pSDELNParamId);
        return this;
    }

    @JsonProperty(value="psdelnparamname")
    public void setPSDELNParamName(String pSDELNParamName) {
        this._set(DTOFIELD_PSDELNPARAMNAME, pSDELNParamName);
    }

    @JsonIgnore
    public String getPSDELNParamName() {
        Object objValue = this._get(DTOFIELD_PSDELNPARAMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELNParamNameDirty() {
        return this._contains(DTOFIELD_PSDELNPARAMNAME);
    }

    @JsonIgnore
    public void resetPSDELNParamName() {
        this._reset(DTOFIELD_PSDELNPARAMNAME);
    }

    @JsonIgnore
    public PSDELNParamDTO psdelnparamname(String pSDELNParamName) {
        this.setPSDELNParamName(pSDELNParamName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELNParamName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELNParamName(strName);
    }

    @JsonIgnore
    public PSDELNParamDTO name(String strName) {
        this.setPSDELNParamName(strName);
        return this;
    }

    @JsonProperty(value="psdelogicnodeid")
    public void setPSDELogicNodeId(String pSDELogicNodeId) {
        this._set(DTOFIELD_PSDELOGICNODEID, pSDELogicNodeId);
    }

    @JsonIgnore
    public String getPSDELogicNodeId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNodeIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICNODEID);
    }

    @JsonIgnore
    public void resetPSDELogicNodeId() {
        this._reset(DTOFIELD_PSDELOGICNODEID);
    }

    @JsonIgnore
    public PSDELNParamDTO psdelogicnodeid(String pSDELogicNodeId) {
        this.setPSDELogicNodeId(pSDELogicNodeId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO psdelogicnodeid(PSDELogicNodeDTO pSDELogicNode) {
        if (pSDELogicNode == null) {
            this.setPSDELogicNodeId(null);
            this.setPSDELogicNodeName(null);
        } else {
            this.setPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicnodename")
    public void setPSDELogicNodeName(String pSDELogicNodeName) {
        this._set(DTOFIELD_PSDELOGICNODENAME, pSDELogicNodeName);
    }

    @JsonIgnore
    public String getPSDELogicNodeName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNodeNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNODENAME);
    }

    @JsonIgnore
    public void resetPSDELogicNodeName() {
        this._reset(DTOFIELD_PSDELOGICNODENAME);
    }

    @JsonIgnore
    public PSDELNParamDTO psdelogicnodename(String pSDELogicNodeName) {
        this.setPSDELogicNodeName(pSDELogicNodeName);
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
    public PSDELNParamDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psobjdata")
    public void setPSObjData(String pSObjData) {
        this._set(DTOFIELD_PSOBJDATA, pSObjData);
    }

    @JsonIgnore
    public String getPSObjData() {
        Object objValue = this._get(DTOFIELD_PSOBJDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjDataDirty() {
        return this._contains(DTOFIELD_PSOBJDATA);
    }

    @JsonIgnore
    public void resetPSObjData() {
        this._reset(DTOFIELD_PSOBJDATA);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjdata(String pSObjData) {
        this.setPSObjData(pSObjData);
        return this;
    }

    @JsonProperty(value="psobjdata2")
    public void setPSObjData2(String pSObjData2) {
        this._set(DTOFIELD_PSOBJDATA2, pSObjData2);
    }

    @JsonIgnore
    public String getPSObjData2() {
        Object objValue = this._get(DTOFIELD_PSOBJDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjData2Dirty() {
        return this._contains(DTOFIELD_PSOBJDATA2);
    }

    @JsonIgnore
    public void resetPSObjData2() {
        this._reset(DTOFIELD_PSOBJDATA2);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjdata2(String pSObjData2) {
        this.setPSObjData2(pSObjData2);
        return this;
    }

    @JsonProperty(value="psobjid")
    public void setPSObjId(String pSObjId) {
        this._set(DTOFIELD_PSOBJID, pSObjId);
    }

    @JsonIgnore
    public String getPSObjId() {
        Object objValue = this._get(DTOFIELD_PSOBJID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjIdDirty() {
        return this._contains(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public void resetPSObjId() {
        this._reset(DTOFIELD_PSOBJID);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjid(String pSObjId) {
        this.setPSObjId(pSObjId);
        return this;
    }

    @JsonProperty(value="psobjname")
    public void setPSObjName(String pSObjName) {
        this._set(DTOFIELD_PSOBJNAME, pSObjName);
    }

    @JsonIgnore
    public String getPSObjName() {
        Object objValue = this._get(DTOFIELD_PSOBJNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjNameDirty() {
        return this._contains(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public void resetPSObjName() {
        this._reset(DTOFIELD_PSOBJNAME);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjname(String pSObjName) {
        this.setPSObjName(pSObjName);
        return this;
    }

    @JsonProperty(value="psobjtype")
    public void setPSObjType(String pSObjType) {
        this._set(DTOFIELD_PSOBJTYPE, pSObjType);
    }

    @JsonIgnore
    public String getPSObjType() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjTypeDirty() {
        return this._contains(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public void resetPSObjType() {
        this._reset(DTOFIELD_PSOBJTYPE);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjtype(String pSObjType) {
        this.setPSObjType(pSObjType);
        return this;
    }

    @JsonProperty(value="psobjtypename")
    public void setPSObjTypeName(String pSObjTypeName) {
        this._set(DTOFIELD_PSOBJTYPENAME, pSObjTypeName);
    }

    @JsonIgnore
    public String getPSObjTypeName() {
        Object objValue = this._get(DTOFIELD_PSOBJTYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSObjTypeNameDirty() {
        return this._contains(DTOFIELD_PSOBJTYPENAME);
    }

    @JsonIgnore
    public void resetPSObjTypeName() {
        this._reset(DTOFIELD_PSOBJTYPENAME);
    }

    @JsonIgnore
    public PSDELNParamDTO psobjtypename(String pSObjTypeName) {
        this.setPSObjTypeName(pSObjTypeName);
        return this;
    }

    @JsonProperty(value="pssysmsgtemplid")
    public void setPSSysMsgTemplId(String pSSysMsgTemplId) {
        this._set(DTOFIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }

    @JsonIgnore
    public String getPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplId() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSDELNParamDTO pssysmsgtemplid(String pSSysMsgTemplId) {
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        } else {
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="pssysmsgtemplname")
    public void setPSSysMsgTemplName(String pSSysMsgTemplName) {
        this._set(DTOFIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }

    @JsonIgnore
    public String getPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysMsgTemplName() {
        this._reset(DTOFIELD_PSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSDELNParamDTO pssysmsgtemplname(String pSSysMsgTemplName) {
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="pssyssequenceid")
    public void setPSSysSequenceId(String pSSysSequenceId) {
        this._set(DTOFIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }

    @JsonIgnore
    public String getPSSysSequenceId() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceIdDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public void resetPSSysSequenceId() {
        this._reset(DTOFIELD_PSSYSSEQUENCEID);
    }

    @JsonIgnore
    public PSDELNParamDTO pssyssequenceid(String pSSysSequenceId) {
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO pssyssequenceid(PSSysSequenceDTO pSSysSequence) {
        if (pSSysSequence == null) {
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        } else {
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    @JsonProperty(value="pssyssequencename")
    public void setPSSysSequenceName(String pSSysSequenceName) {
        this._set(DTOFIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }

    @JsonIgnore
    public String getPSSysSequenceName() {
        Object objValue = this._get(DTOFIELD_PSSYSSEQUENCENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSequenceNameDirty() {
        return this._contains(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public void resetPSSysSequenceName() {
        this._reset(DTOFIELD_PSSYSSEQUENCENAME);
    }

    @JsonIgnore
    public PSDELNParamDTO pssyssequencename(String pSSysSequenceName) {
        this.setPSSysSequenceName(pSSysSequenceName);
        return this;
    }

    @JsonProperty(value="pssystranslatorid")
    public void setPSSysTranslatorId(String pSSysTranslatorId) {
        this._set(DTOFIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }

    @JsonIgnore
    public String getPSSysTranslatorId() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public void resetPSSysTranslatorId() {
        this._reset(DTOFIELD_PSSYSTRANSLATORID);
    }

    @JsonIgnore
    public PSDELNParamDTO pssystranslatorid(String pSSysTranslatorId) {
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO pssystranslatorid(PSSysTranslatorDTO pSSysTranslator) {
        if (pSSysTranslator == null) {
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        } else {
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    @JsonProperty(value="pssystranslatorname")
    public void setPSSysTranslatorName(String pSSysTranslatorName) {
        this._set(DTOFIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }

    @JsonIgnore
    public String getPSSysTranslatorName() {
        Object objValue = this._get(DTOFIELD_PSSYSTRANSLATORNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty() {
        return this._contains(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public void resetPSSysTranslatorName() {
        this._reset(DTOFIELD_PSSYSTRANSLATORNAME);
    }

    @JsonIgnore
    public PSDELNParamDTO pssystranslatorname(String pSSysTranslatorName) {
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    @JsonProperty(value="srcindex")
    public void setSrcIndex(Integer srcIndex) {
        this._set(DTOFIELD_SRCINDEX, srcIndex);
    }

    @JsonIgnore
    public Integer getSrcIndex() {
        Object objValue = this._get(DTOFIELD_SRCINDEX);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcIndexDirty() {
        return this._contains(DTOFIELD_SRCINDEX);
    }

    @JsonIgnore
    public void resetSrcIndex() {
        this._reset(DTOFIELD_SRCINDEX);
    }

    @JsonIgnore
    public PSDELNParamDTO srcindex(Integer srcIndex) {
        this.setSrcIndex(srcIndex);
        return this;
    }

    @JsonProperty(value="srcparampsdeid")
    public void setSrcParamPSDEId(String srcParamPSDEId) {
        this._set(DTOFIELD_SRCPARAMPSDEID, srcParamPSDEId);
    }

    @JsonIgnore
    public String getSrcParamPSDEId() {
        Object objValue = this._get(DTOFIELD_SRCPARAMPSDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcParamPSDEIdDirty() {
        return this._contains(DTOFIELD_SRCPARAMPSDEID);
    }

    @JsonIgnore
    public void resetSrcParamPSDEId() {
        this._reset(DTOFIELD_SRCPARAMPSDEID);
    }

    @JsonIgnore
    public PSDELNParamDTO srcparampsdeid(String srcParamPSDEId) {
        this.setSrcParamPSDEId(srcParamPSDEId);
        return this;
    }

    @JsonProperty(value="srcpsdefid")
    public void setSrcPSDEFId(String srcPSDEFId) {
        this._set(DTOFIELD_SRCPSDEFID, srcPSDEFId);
    }

    @JsonIgnore
    public String getSrcPSDEFId() {
        Object objValue = this._get(DTOFIELD_SRCPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDEFIdDirty() {
        return this._contains(DTOFIELD_SRCPSDEFID);
    }

    @JsonIgnore
    public void resetSrcPSDEFId() {
        this._reset(DTOFIELD_SRCPSDEFID);
    }

    @JsonIgnore
    public PSDELNParamDTO srcpsdefid(String srcPSDEFId) {
        this.setSrcPSDEFId(srcPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO srcpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setSrcPSDEFId(null);
            this.setSrcPSDEFName(null);
        } else {
            this.setSrcPSDEFId(pSDEField.getPSDEFieldId());
            this.setSrcPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="srcpsdefname")
    public void setSrcPSDEFName(String srcPSDEFName) {
        this._set(DTOFIELD_SRCPSDEFNAME, srcPSDEFName);
    }

    @JsonIgnore
    public String getSrcPSDEFName() {
        Object objValue = this._get(DTOFIELD_SRCPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDEFNameDirty() {
        return this._contains(DTOFIELD_SRCPSDEFNAME);
    }

    @JsonIgnore
    public void resetSrcPSDEFName() {
        this._reset(DTOFIELD_SRCPSDEFNAME);
    }

    @JsonIgnore
    public PSDELNParamDTO srcpsdefname(String srcPSDEFName) {
        this.setSrcPSDEFName(srcPSDEFName);
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
    public PSDELNParamDTO srcpsdlparamid(String srcPSDLParamId) {
        this.setSrcPSDLParamId(srcPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO srcpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setSrcParamPSDEId(null);
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        } else {
            this.setSrcParamPSDEId(pSDELogicParam.getParamPSDEId());
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
    public PSDELNParamDTO srcpsdlparamname(String srcPSDLParamName) {
        this.setSrcPSDLParamName(srcPSDLParamName);
        return this;
    }

    @JsonProperty(value="srcsize")
    public void setSrcSize(Integer srcSize) {
        this._set(DTOFIELD_SRCSIZE, srcSize);
    }

    @JsonIgnore
    public Integer getSrcSize() {
        Object objValue = this._get(DTOFIELD_SRCSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcSizeDirty() {
        return this._contains(DTOFIELD_SRCSIZE);
    }

    @JsonIgnore
    public void resetSrcSize() {
        this._reset(DTOFIELD_SRCSIZE);
    }

    @JsonIgnore
    public PSDELNParamDTO srcsize(Integer srcSize) {
        this.setSrcSize(srcSize);
        return this;
    }

    @JsonProperty(value="srcvalue")
    public void setSrcValue(String srcValue) {
        this._set(DTOFIELD_SRCVALUE, srcValue);
    }

    @JsonIgnore
    public String getSrcValue() {
        Object objValue = this._get(DTOFIELD_SRCVALUE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueDirty() {
        return this._contains(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public void resetSrcValue() {
        this._reset(DTOFIELD_SRCVALUE);
    }

    @JsonIgnore
    public PSDELNParamDTO srcvalue(String srcValue) {
        this.setSrcValue(srcValue);
        return this;
    }

    @JsonProperty(value="srcvaluestddatatype")
    public void setSrcValueStdDataType(Integer srcValueStdDataType) {
        this._set(DTOFIELD_SRCVALUESTDDATATYPE, srcValueStdDataType);
    }

    @JsonIgnore
    public Integer getSrcValueStdDataType() {
        Object objValue = this._get(DTOFIELD_SRCVALUESTDDATATYPE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueStdDataTypeDirty() {
        return this._contains(DTOFIELD_SRCVALUESTDDATATYPE);
    }

    @JsonIgnore
    public void resetSrcValueStdDataType() {
        this._reset(DTOFIELD_SRCVALUESTDDATATYPE);
    }

    @JsonIgnore
    public PSDELNParamDTO srcvaluestddatatype(Integer srcValueStdDataType) {
        this.setSrcValueStdDataType(srcValueStdDataType);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO srcvaluestddatatype(PSModelEnums.StdDataType srcValueStdDataType) {
        if (srcValueStdDataType == null) {
            this.setSrcValueStdDataType(null);
        } else {
            this.setSrcValueStdDataType(srcValueStdDataType.value);
        }
        return this;
    }

    @JsonProperty(value="srcvaluetype")
    public void setSrcValueType(String srcValueType) {
        this._set(DTOFIELD_SRCVALUETYPE, srcValueType);
    }

    @JsonIgnore
    public String getSrcValueType() {
        Object objValue = this._get(DTOFIELD_SRCVALUETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueTypeDirty() {
        return this._contains(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public void resetSrcValueType() {
        this._reset(DTOFIELD_SRCVALUETYPE);
    }

    @JsonIgnore
    public PSDELNParamDTO srcvaluetype(String srcValueType) {
        this.setSrcValueType(srcValueType);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO srcvaluetype(PSModelEnums.DELogicParamValueType srcValueType) {
        if (srcValueType == null) {
            this.setSrcValueType(null);
        } else {
            this.setSrcValueType(srcValueType.value);
        }
        return this;
    }

    @JsonProperty(value="srcvaluetypetext")
    public void setSrcValueTypeText(String srcValueTypeText) {
        this._set(DTOFIELD_SRCVALUETYPETEXT, srcValueTypeText);
    }

    @JsonIgnore
    public String getSrcValueTypeText() {
        Object objValue = this._get(DTOFIELD_SRCVALUETYPETEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcValueTypeTextDirty() {
        return this._contains(DTOFIELD_SRCVALUETYPETEXT);
    }

    @JsonIgnore
    public void resetSrcValueTypeText() {
        this._reset(DTOFIELD_SRCVALUETYPETEXT);
    }

    @JsonIgnore
    public PSDELNParamDTO srcvaluetypetext(String srcValueTypeText) {
        this.setSrcValueTypeText(srcValueTypeText);
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
    public PSDELNParamDTO updatedate(Timestamp updateDate) {
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
    public PSDELNParamDTO updateman(String updateMan) {
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
    public PSDELNParamDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELNParamDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDELNParamDTO usertag(String userTag) {
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
    public PSDELNParamDTO usertag2(String userTag2) {
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
    public PSDELNParamDTO usertag3(String userTag3) {
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
    public PSDELNParamDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELNParamId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELNParamId(strValue);
    }

    @JsonIgnore
    public PSDELNParamDTO id(String strValue) {
        this.setPSDELNParamId(strValue);
        return this;
    }
}
