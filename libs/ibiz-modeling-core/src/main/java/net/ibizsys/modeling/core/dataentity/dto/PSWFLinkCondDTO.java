package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSWFLinkCondDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMDSTPARAM = "CUSTOMDSTPARAM";
    protected static final String DTOFIELD_CUSTOMDSTPARAM = "customdstparam";
    public static final String FIELD_DSTPSDEFID = "DSTPSDEFID";
    protected static final String DTOFIELD_DSTPSDEFID = "dstpsdefid";
    public static final String FIELD_DSTPSDEFNAME = "DSTPSDEFNAME";
    protected static final String DTOFIELD_DSTPSDEFNAME = "dstpsdefname";
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
    public static final String FIELD_PPSWFLINKCONDID = "PPSWFLINKCONDID";
    protected static final String DTOFIELD_PPSWFLINKCONDID = "ppswflinkcondid";
    public static final String FIELD_PPSWFLINKCONDNAME = "PPSWFLINKCONDNAME";
    protected static final String DTOFIELD_PPSWFLINKCONDNAME = "ppswflinkcondname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSWFLINKCONDID = "PSWFLINKCONDID";
    protected static final String DTOFIELD_PSWFLINKCONDID = "pswflinkcondid";
    public static final String FIELD_PSWFLINKCONDNAME = "PSWFLINKCONDNAME";
    protected static final String DTOFIELD_PSWFLINKCONDNAME = "pswflinkcondname";
    public static final String FIELD_PSWFLINKID = "PSWFLINKID";
    protected static final String DTOFIELD_PSWFLINKID = "pswflinkid";
    public static final String FIELD_PSWFLINKNAME = "PSWFLINKNAME";
    protected static final String DTOFIELD_PSWFLINKNAME = "pswflinkname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSWFLINKCONDS = "pswflinkconds";

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
    public PSWFLinkCondDTO condvalue(String condValue) {
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
    public PSWFLinkCondDTO createdate(Timestamp createDate) {
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
    public PSWFLinkCondDTO createman(String createMan) {
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
    public PSWFLinkCondDTO customdstparam(String customDSTParam) {
        this.setCustomDSTParam(customDSTParam);
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
    public PSWFLinkCondDTO dstpsdefid(String dstPSDEFId) {
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO dstpsdefid(PSDEFieldDTO pSDEField) {
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
    public PSWFLinkCondDTO dstpsdefname(String dstPSDEFName) {
        this.setDstPSDEFName(dstPSDEFName);
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
    public PSWFLinkCondDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO groupnotflag(Boolean groupNotFlag) {
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
    public PSWFLinkCondDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO groupop(PSModelEnums.GroupCondOP groupOP) {
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
    public PSWFLinkCondDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO logictype(PSModelEnums.WFLinkCondType logicType) {
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
    public PSWFLinkCondDTO memo(String memo) {
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
    public PSWFLinkCondDTO ordervalue(Integer orderValue) {
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
    public PSWFLinkCondDTO paramtype(String paramType) {
        this.setParamType(paramType);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO paramtype(PSModelEnums.DEFVRParamType paramType) {
        if (paramType == null) {
            this.setParamType(null);
        } else {
            this.setParamType(paramType.value);
        }
        return this;
    }

    @JsonProperty(value="ppswflinkcondid")
    public void setPPSWFLinkCondId(String pPSWFLinkCondId) {
        this._set(DTOFIELD_PPSWFLINKCONDID, pPSWFLinkCondId);
    }

    @JsonIgnore
    public String getPPSWFLinkCondId() {
        Object objValue = this._get(DTOFIELD_PPSWFLINKCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSWFLinkCondIdDirty() {
        return this._contains(DTOFIELD_PPSWFLINKCONDID);
    }

    @JsonIgnore
    public void resetPPSWFLinkCondId() {
        this._reset(DTOFIELD_PPSWFLINKCONDID);
    }

    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondid(String pPSWFLinkCondId) {
        this.setPPSWFLinkCondId(pPSWFLinkCondId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondid(PSWFLinkCondDTO pSWFLinkCond) {
        if (pSWFLinkCond == null) {
            this.setPPSWFLinkCondId(null);
            this.setPPSWFLinkCondName(null);
        } else {
            this.setPPSWFLinkCondId(pSWFLinkCond.getPSWFLinkCondId());
            this.setPPSWFLinkCondName(pSWFLinkCond.getPSWFLinkCondName());
        }
        return this;
    }

    @JsonProperty(value="ppswflinkcondname")
    public void setPPSWFLinkCondName(String pPSWFLinkCondName) {
        this._set(DTOFIELD_PPSWFLINKCONDNAME, pPSWFLinkCondName);
    }

    @JsonIgnore
    public String getPPSWFLinkCondName() {
        Object objValue = this._get(DTOFIELD_PPSWFLINKCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSWFLinkCondNameDirty() {
        return this._contains(DTOFIELD_PPSWFLINKCONDNAME);
    }

    @JsonIgnore
    public void resetPPSWFLinkCondName() {
        this._reset(DTOFIELD_PPSWFLINKCONDNAME);
    }

    @JsonIgnore
    public PSWFLinkCondDTO ppswflinkcondname(String pPSWFLinkCondName) {
        this.setPPSWFLinkCondName(pPSWFLinkCondName);
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
    public PSWFLinkCondDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
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
    public PSWFLinkCondDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    @JsonProperty(value="pswflinkcondid")
    public void setPSWFLinkCondId(String pSWFLinkCondId) {
        this._set(DTOFIELD_PSWFLINKCONDID, pSWFLinkCondId);
    }

    @JsonIgnore
    public String getPSWFLinkCondId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKCONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkCondIdDirty() {
        return this._contains(DTOFIELD_PSWFLINKCONDID);
    }

    @JsonIgnore
    public void resetPSWFLinkCondId() {
        this._reset(DTOFIELD_PSWFLINKCONDID);
    }

    @JsonIgnore
    public PSWFLinkCondDTO pswflinkcondid(String pSWFLinkCondId) {
        this.setPSWFLinkCondId(pSWFLinkCondId);
        return this;
    }

    @JsonProperty(value="pswflinkcondname")
    public void setPSWFLinkCondName(String pSWFLinkCondName) {
        this._set(DTOFIELD_PSWFLINKCONDNAME, pSWFLinkCondName);
    }

    @JsonIgnore
    public String getPSWFLinkCondName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKCONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkCondNameDirty() {
        return this._contains(DTOFIELD_PSWFLINKCONDNAME);
    }

    @JsonIgnore
    public void resetPSWFLinkCondName() {
        this._reset(DTOFIELD_PSWFLINKCONDNAME);
    }

    @JsonIgnore
    public PSWFLinkCondDTO pswflinkcondname(String pSWFLinkCondName) {
        this.setPSWFLinkCondName(pSWFLinkCondName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSWFLinkCondName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSWFLinkCondName(strName);
    }

    @JsonIgnore
    public PSWFLinkCondDTO name(String strName) {
        this.setPSWFLinkCondName(strName);
        return this;
    }

    @JsonProperty(value="pswflinkid")
    public void setPSWFLinkId(String pSWFLinkId) {
        this._set(DTOFIELD_PSWFLINKID, pSWFLinkId);
    }

    @JsonIgnore
    public String getPSWFLinkId() {
        Object objValue = this._get(DTOFIELD_PSWFLINKID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkIdDirty() {
        return this._contains(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public void resetPSWFLinkId() {
        this._reset(DTOFIELD_PSWFLINKID);
    }

    @JsonIgnore
    public PSWFLinkCondDTO pswflinkid(String pSWFLinkId) {
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    @JsonIgnore
    public PSWFLinkCondDTO pswflinkid(PSWFLinkDTO pSWFLink) {
        if (pSWFLink == null) {
            this.setPSWFLinkId(null);
            this.setPSWFLinkName(null);
        } else {
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
            this.setPSWFLinkName(pSWFLink.getPSWFLinkName());
        }
        return this;
    }

    @JsonProperty(value="pswflinkname")
    public void setPSWFLinkName(String pSWFLinkName) {
        this._set(DTOFIELD_PSWFLINKNAME, pSWFLinkName);
    }

    @JsonIgnore
    public String getPSWFLinkName() {
        Object objValue = this._get(DTOFIELD_PSWFLINKNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFLinkNameDirty() {
        return this._contains(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public void resetPSWFLinkName() {
        this._reset(DTOFIELD_PSWFLINKNAME);
    }

    @JsonIgnore
    public PSWFLinkCondDTO pswflinkname(String pSWFLinkName) {
        this.setPSWFLinkName(pSWFLinkName);
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
    public PSWFLinkCondDTO updatedate(Timestamp updateDate) {
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
    public PSWFLinkCondDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSWFLinkCondId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSWFLinkCondId(strValue);
    }

    @JsonIgnore
    public PSWFLinkCondDTO id(String strValue) {
        this.setPSWFLinkCondId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSWFLinkCondDTO> getPSWFLinkConds() {
        Object list = this._get(DTOFIELD_PSWFLINKCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pswflinkconds")
    public void setPSWFLinkConds(List<PSWFLinkCondDTO> pswflinkconds) {
        this._set(DTOFIELD_PSWFLINKCONDS, pswflinkconds);
    }

    @JsonIgnore
    public List<PSWFLinkCondDTO> getPSWFLinkCondsIf() {
        Object list = this._get(DTOFIELD_PSWFLINKCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSWFLINKCONDS, list);
        }
        return (List) list;
    }
}