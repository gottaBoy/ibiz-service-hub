package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDESADetailDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CODENAME2 = "CODENAME2";
    protected static final String DTOFIELD_CODENAME2 = "codename2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DETAILPARAM = "DETAILPARAM";
    protected static final String DTOFIELD_DETAILPARAM = "detailparam";
    public static final String FIELD_DETAILPARAM2 = "DETAILPARAM2";
    protected static final String DTOFIELD_DETAILPARAM2 = "detailparam2";
    public static final String FIELD_DETAILTYPE = "DETAILTYPE";
    protected static final String DTOFIELD_DETAILTYPE = "detailtype";
    public static final String FIELD_INPSDESERVICEAPIID = "INPSDESERVICEAPIID";
    protected static final String DTOFIELD_INPSDESERVICEAPIID = "inpsdeserviceapiid";
    public static final String FIELD_INPSDESERVICEAPINAME = "INPSDESERVICEAPINAME";
    protected static final String DTOFIELD_INPSDESERVICEAPINAME = "inpsdeserviceapiname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_METHODTAG = "METHODTAG";
    protected static final String DTOFIELD_METHODTAG = "methodtag";
    public static final String FIELD_NEEDRESOURCEKEY = "NEEDRESOURCEKEY";
    protected static final String DTOFIELD_NEEDRESOURCEKEY = "needresourcekey";
    public static final String FIELD_NOSERVICECODENAME = "NOSERVICECODENAME";
    protected static final String DTOFIELD_NOSERVICECODENAME = "noservicecodename";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_OUTPSDESERVICEAPIID = "OUTPSDESERVICEAPIID";
    protected static final String DTOFIELD_OUTPSDESERVICEAPIID = "outpsdeserviceapiid";
    public static final String FIELD_OUTPSDESERVICEAPINAME = "OUTPSDESERVICEAPINAME";
    protected static final String DTOFIELD_OUTPSDESERVICEAPINAME = "outpsdeserviceapiname";
    public static final String FIELD_PARENTKEYMODE = "PARENTKEYMODE";
    protected static final String DTOFIELD_PARENTKEYMODE = "parentkeymode";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_PSDEDSID = "PSDEDSID";
    protected static final String DTOFIELD_PSDEDSID = "psdedsid";
    public static final String FIELD_PSDEDSNAME = "PSDEDSNAME";
    protected static final String DTOFIELD_PSDEDSNAME = "psdedsname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEOPPRIVID = "PSDEOPPRIVID";
    protected static final String DTOFIELD_PSDEOPPRIVID = "psdeopprivid";
    public static final String FIELD_PSDEOPPRIVNAME = "PSDEOPPRIVNAME";
    protected static final String DTOFIELD_PSDEOPPRIVNAME = "psdeopprivname";
    public static final String FIELD_PSDESADETAILID = "PSDESADETAILID";
    protected static final String DTOFIELD_PSDESADETAILID = "psdesadetailid";
    public static final String FIELD_PSDESADETAILNAME = "PSDESADETAILNAME";
    protected static final String DTOFIELD_PSDESADETAILNAME = "psdesadetailname";
    public static final String FIELD_PSDESARSID = "PSDESARSID";
    protected static final String DTOFIELD_PSDESARSID = "psdesarsid";
    public static final String FIELD_PSDESARSNAME = "PSDESARSNAME";
    protected static final String DTOFIELD_PSDESARSNAME = "psdesarsname";
    public static final String FIELD_PSDESERVICEAPIID = "PSDESERVICEAPIID";
    protected static final String DTOFIELD_PSDESERVICEAPIID = "psdeserviceapiid";
    public static final String FIELD_PSDESERVICEAPINAME = "PSDESERVICEAPINAME";
    protected static final String DTOFIELD_PSDESERVICEAPINAME = "psdeserviceapiname";
    public static final String FIELD_PSSYSSERVICEAPIID = "PSSYSSERVICEAPIID";
    protected static final String DTOFIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_REQUESTFIELD = "REQUESTFIELD";
    protected static final String DTOFIELD_REQUESTFIELD = "requestfield";
    public static final String FIELD_REQUESTMETHOD = "REQUESTMETHOD";
    protected static final String DTOFIELD_REQUESTMETHOD = "requestmethod";
    public static final String FIELD_REQUESTPARAMTYPE = "REQUESTPARAMTYPE";
    protected static final String DTOFIELD_REQUESTPARAMTYPE = "requestparamtype";
    public static final String FIELD_RETVALTYPE = "RETVALTYPE";
    protected static final String DTOFIELD_RETVALTYPE = "retvaltype";
    public static final String FIELD_SERVICEURL = "SERVICEURL";
    protected static final String DTOFIELD_SERVICEURL = "serviceurl";
    public static final String FIELD_UNIQUETAG = "UNIQUETAG";
    protected static final String DTOFIELD_UNIQUETAG = "uniquetag";
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
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String DTOFIELD_PSDESADETAILPARAMS = "psdesadetailparams";

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDESADetailDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

    @JsonProperty(value="codename2")
    public void setCodeName2(String codeName2) {
        this._set(DTOFIELD_CODENAME2, codeName2);
    }

    @JsonIgnore
    public String getCodeName2() {
        Object objValue = this._get(DTOFIELD_CODENAME2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeName2Dirty() {
        return this._contains(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public void resetCodeName2() {
        this._reset(DTOFIELD_CODENAME2);
    }

    @JsonIgnore
    public PSDESADetailDTO codename2(String codeName2) {
        this.setCodeName2(codeName2);
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
    public PSDESADetailDTO createdate(Timestamp createDate) {
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
    public PSDESADetailDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="detailparam")
    public void setDetailParam(String detailParam) {
        this._set(DTOFIELD_DETAILPARAM, detailParam);
    }

    @JsonIgnore
    public String getDetailParam() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParamDirty() {
        return this._contains(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public void resetDetailParam() {
        this._reset(DTOFIELD_DETAILPARAM);
    }

    @JsonIgnore
    public PSDESADetailDTO detailparam(String detailParam) {
        this.setDetailParam(detailParam);
        return this;
    }

    @JsonProperty(value="detailparam2")
    public void setDetailParam2(String detailParam2) {
        this._set(DTOFIELD_DETAILPARAM2, detailParam2);
    }

    @JsonIgnore
    public String getDetailParam2() {
        Object objValue = this._get(DTOFIELD_DETAILPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailParam2Dirty() {
        return this._contains(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public void resetDetailParam2() {
        this._reset(DTOFIELD_DETAILPARAM2);
    }

    @JsonIgnore
    public PSDESADetailDTO detailparam2(String detailParam2) {
        this.setDetailParam2(detailParam2);
        return this;
    }

    @JsonProperty(value="detailtype")
    public void setDetailType(String detailType) {
        this._set(DTOFIELD_DETAILTYPE, detailType);
    }

    @JsonIgnore
    public String getDetailType() {
        Object objValue = this._get(DTOFIELD_DETAILTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDetailTypeDirty() {
        return this._contains(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public void resetDetailType() {
        this._reset(DTOFIELD_DETAILTYPE);
    }

    @JsonIgnore
    public PSDESADetailDTO detailtype(String detailType) {
        this.setDetailType(detailType);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO detailtype(PSModelEnums.SADEMethodType detailType) {
        if (detailType == null) {
            this.setDetailType(null);
        } else {
            this.setDetailType(detailType.value);
        }
        return this;
    }

    @JsonProperty(value="inpsdeserviceapiid")
    public void setInPSDEServiceAPIId(String inPSDEServiceAPIId) {
        this._set(DTOFIELD_INPSDESERVICEAPIID, inPSDEServiceAPIId);
    }

    @JsonIgnore
    public String getInPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_INPSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_INPSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetInPSDEServiceAPIId() {
        this._reset(DTOFIELD_INPSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSDESADetailDTO inpsdeserviceapiid(String inPSDEServiceAPIId) {
        this.setInPSDEServiceAPIId(inPSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO inpsdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setInPSDEServiceAPIId(null);
            this.setInPSDEServiceAPIName(null);
        } else {
            this.setInPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setInPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="inpsdeserviceapiname")
    public void setInPSDEServiceAPIName(String inPSDEServiceAPIName) {
        this._set(DTOFIELD_INPSDESERVICEAPINAME, inPSDEServiceAPIName);
    }

    @JsonIgnore
    public String getInPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_INPSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_INPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetInPSDEServiceAPIName() {
        this._reset(DTOFIELD_INPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESADetailDTO inpsdeserviceapiname(String inPSDEServiceAPIName) {
        this.setInPSDEServiceAPIName(inPSDEServiceAPIName);
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
    public PSDESADetailDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="methodtag")
    public void setMethodTag(String methodTag) {
        this._set(DTOFIELD_METHODTAG, methodTag);
    }

    @JsonIgnore
    public String getMethodTag() {
        Object objValue = this._get(DTOFIELD_METHODTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMethodTagDirty() {
        return this._contains(DTOFIELD_METHODTAG);
    }

    @JsonIgnore
    public void resetMethodTag() {
        this._reset(DTOFIELD_METHODTAG);
    }

    @JsonIgnore
    public PSDESADetailDTO methodtag(String methodTag) {
        this.setMethodTag(methodTag);
        return this;
    }

    @JsonProperty(value="needresourcekey")
    public void setNeedResourceKey(Integer needResourceKey) {
        this._set(DTOFIELD_NEEDRESOURCEKEY, needResourceKey);
    }

    @JsonIgnore
    public Integer getNeedResourceKey() {
        Object objValue = this._get(DTOFIELD_NEEDRESOURCEKEY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNeedResourceKeyDirty() {
        return this._contains(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public void resetNeedResourceKey() {
        this._reset(DTOFIELD_NEEDRESOURCEKEY);
    }

    @JsonIgnore
    public PSDESADetailDTO needresourcekey(Integer needResourceKey) {
        this.setNeedResourceKey(needResourceKey);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO needresourcekey(Boolean needResourceKey) {
        if (needResourceKey == null) {
            this.setNeedResourceKey(null);
        } else {
            this.setNeedResourceKey(needResourceKey != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="noservicecodename")
    public void setNoServiceCodeName(Integer noServiceCodeName) {
        this._set(DTOFIELD_NOSERVICECODENAME, noServiceCodeName);
    }

    @JsonIgnore
    public Integer getNoServiceCodeName() {
        Object objValue = this._get(DTOFIELD_NOSERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNoServiceCodeNameDirty() {
        return this._contains(DTOFIELD_NOSERVICECODENAME);
    }

    @JsonIgnore
    public void resetNoServiceCodeName() {
        this._reset(DTOFIELD_NOSERVICECODENAME);
    }

    @JsonIgnore
    public PSDESADetailDTO noservicecodename(Integer noServiceCodeName) {
        this.setNoServiceCodeName(noServiceCodeName);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO noservicecodename(Boolean noServiceCodeName) {
        if (noServiceCodeName == null) {
            this.setNoServiceCodeName(null);
        } else {
            this.setNoServiceCodeName(noServiceCodeName != false ? 1 : 0);
        }
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
    public PSDESADetailDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="outpsdeserviceapiid")
    public void setOutPSDEServiceAPIId(String outPSDEServiceAPIId) {
        this._set(DTOFIELD_OUTPSDESERVICEAPIID, outPSDEServiceAPIId);
    }

    @JsonIgnore
    public String getOutPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_OUTPSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_OUTPSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetOutPSDEServiceAPIId() {
        this._reset(DTOFIELD_OUTPSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSDESADetailDTO outpsdeserviceapiid(String outPSDEServiceAPIId) {
        this.setOutPSDEServiceAPIId(outPSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO outpsdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setOutPSDEServiceAPIId(null);
            this.setOutPSDEServiceAPIName(null);
        } else {
            this.setOutPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setOutPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    @JsonProperty(value="outpsdeserviceapiname")
    public void setOutPSDEServiceAPIName(String outPSDEServiceAPIName) {
        this._set(DTOFIELD_OUTPSDESERVICEAPINAME, outPSDEServiceAPIName);
    }

    @JsonIgnore
    public String getOutPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_OUTPSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOutPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_OUTPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetOutPSDEServiceAPIName() {
        this._reset(DTOFIELD_OUTPSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESADetailDTO outpsdeserviceapiname(String outPSDEServiceAPIName) {
        this.setOutPSDEServiceAPIName(outPSDEServiceAPIName);
        return this;
    }

    @JsonProperty(value="parentkeymode")
    public void setParentKeyMode(String parentKeyMode) {
        this._set(DTOFIELD_PARENTKEYMODE, parentKeyMode);
    }

    @JsonIgnore
    public String getParentKeyMode() {
        Object objValue = this._get(DTOFIELD_PARENTKEYMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParentKeyModeDirty() {
        return this._contains(DTOFIELD_PARENTKEYMODE);
    }

    @JsonIgnore
    public void resetParentKeyMode() {
        this._reset(DTOFIELD_PARENTKEYMODE);
    }

    @JsonIgnore
    public PSDESADetailDTO parentkeymode(String parentKeyMode) {
        this.setParentKeyMode(parentKeyMode);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO parentkeymode(PSModelEnums.SADEMethodParentKeyMode parentKeyMode) {
        if (parentKeyMode == null) {
            this.setParentKeyMode(null);
        } else {
            this.setParentKeyMode(parentKeyMode.value);
        }
        return this;
    }

    @JsonProperty(value="psdeactionid")
    public void setPSDEActionId(String pSDEActionId) {
        this._set(DTOFIELD_PSDEACTIONID, pSDEActionId);
    }

    @JsonIgnore
    public String getPSDEActionId() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionIdDirty() {
        return this._contains(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public void resetPSDEActionId() {
        this._reset(DTOFIELD_PSDEACTIONID);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdeactionid(PSDEActionDTO pSDEAction) {
        if (pSDEAction == null) {
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        } else {
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeactionname")
    public void setPSDEActionName(String pSDEActionName) {
        this._set(DTOFIELD_PSDEACTIONNAME, pSDEActionName);
    }

    @JsonIgnore
    public String getPSDEActionName() {
        Object objValue = this._get(DTOFIELD_PSDEACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEActionNameDirty() {
        return this._contains(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEActionName() {
        this._reset(DTOFIELD_PSDEACTIONNAME);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
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
    public PSDESADetailDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
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
    public PSDESADetailDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
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
    public PSDESADetailDTO psdedsid(String pSDEDSId) {
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdedsid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        } else {
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
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
    public PSDESADetailDTO psdedsname(String pSDEDSName) {
        this.setPSDEDSName(pSDEDSName);
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
    public PSDESADetailDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonProperty(value="psdeopprivid")
    public void setPSDEOPPrivId(String pSDEOPPrivId) {
        this._set(DTOFIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }

    @JsonIgnore
    public String getPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetPSDEOPPrivId() {
        this._reset(DTOFIELD_PSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeopprivid(String pSDEOPPrivId) {
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        } else {
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="psdeopprivname")
    public void setPSDEOPPrivName(String pSDEOPPrivName) {
        this._set(DTOFIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }

    @JsonIgnore
    public String getPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_PSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetPSDEOPPrivName() {
        this._reset(DTOFIELD_PSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeopprivname(String pSDEOPPrivName) {
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="psdesadetailid")
    public void setPSDESADetailId(String pSDESADetailId) {
        this._set(DTOFIELD_PSDESADETAILID, pSDESADetailId);
    }

    @JsonIgnore
    public String getPSDESADetailId() {
        Object objValue = this._get(DTOFIELD_PSDESADETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESADetailIdDirty() {
        return this._contains(DTOFIELD_PSDESADETAILID);
    }

    @JsonIgnore
    public void resetPSDESADetailId() {
        this._reset(DTOFIELD_PSDESADETAILID);
    }

    @JsonIgnore
    public PSDESADetailDTO psdesadetailid(String pSDESADetailId) {
        this.setPSDESADetailId(pSDESADetailId);
        return this;
    }

    @JsonProperty(value="psdesadetailname")
    public void setPSDESADetailName(String pSDESADetailName) {
        this._set(DTOFIELD_PSDESADETAILNAME, pSDESADetailName);
    }

    @JsonIgnore
    public String getPSDESADetailName() {
        Object objValue = this._get(DTOFIELD_PSDESADETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESADetailNameDirty() {
        return this._contains(DTOFIELD_PSDESADETAILNAME);
    }

    @JsonIgnore
    public void resetPSDESADetailName() {
        this._reset(DTOFIELD_PSDESADETAILNAME);
    }

    @JsonIgnore
    public PSDESADetailDTO psdesadetailname(String pSDESADetailName) {
        this.setPSDESADetailName(pSDESADetailName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDESADetailName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDESADetailName(strName);
    }

    @JsonIgnore
    public PSDESADetailDTO name(String strName) {
        this.setPSDESADetailName(strName);
        return this;
    }

    @JsonProperty(value="psdesarsid")
    public void setPSDESARSId(String pSDESARSId) {
        this._set(DTOFIELD_PSDESARSID, pSDESARSId);
    }

    @JsonIgnore
    public String getPSDESARSId() {
        Object objValue = this._get(DTOFIELD_PSDESARSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESARSIdDirty() {
        return this._contains(DTOFIELD_PSDESARSID);
    }

    @JsonIgnore
    public void resetPSDESARSId() {
        this._reset(DTOFIELD_PSDESARSID);
    }

    @JsonIgnore
    public PSDESADetailDTO psdesarsid(String pSDESARSId) {
        this.setPSDESARSId(pSDESARSId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdesarsid(PSDESARSDTO pSDESARS) {
        if (pSDESARS == null) {
            this.setPSDESARSId(null);
            this.setPSDESARSName(null);
        } else {
            this.setPSDESARSId(pSDESARS.getPSDESARSId());
            this.setPSDESARSName(pSDESARS.getPSDESARSName());
        }
        return this;
    }

    @JsonProperty(value="psdesarsname")
    public void setPSDESARSName(String pSDESARSName) {
        this._set(DTOFIELD_PSDESARSNAME, pSDESARSName);
    }

    @JsonIgnore
    public String getPSDESARSName() {
        Object objValue = this._get(DTOFIELD_PSDESARSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDESARSNameDirty() {
        return this._contains(DTOFIELD_PSDESARSNAME);
    }

    @JsonIgnore
    public void resetPSDESARSName() {
        this._reset(DTOFIELD_PSDESARSNAME);
    }

    @JsonIgnore
    public PSDESADetailDTO psdesarsname(String pSDESARSName) {
        this.setPSDESARSName(pSDESARSName);
        return this;
    }

    @JsonProperty(value="psdeserviceapiid")
    public void setPSDEServiceAPIId(String pSDEServiceAPIId) {
        this._set(DTOFIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }

    @JsonIgnore
    public String getPSDEServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIId() {
        this._reset(DTOFIELD_PSDESERVICEAPIID);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeserviceapiid(String pSDEServiceAPIId) {
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO psdeserviceapiid(PSDEServiceAPIDTO pSDEServiceAPI) {
        if (pSDEServiceAPI == null) {
            this.setPSDEId(null);
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
            this.setPSSysServiceAPIId(null);
        } else {
            this.setPSDEId(pSDEServiceAPI.getPSDEId());
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
            this.setPSSysServiceAPIId(pSDEServiceAPI.getPSSysServiceAPIId());
        }
        return this;
    }

    @JsonProperty(value="psdeserviceapiname")
    public void setPSDEServiceAPIName(String pSDEServiceAPIName) {
        this._set(DTOFIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }

    @JsonIgnore
    public String getPSDEServiceAPIName() {
        Object objValue = this._get(DTOFIELD_PSDESERVICEAPINAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEServiceAPINameDirty() {
        return this._contains(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public void resetPSDEServiceAPIName() {
        this._reset(DTOFIELD_PSDESERVICEAPINAME);
    }

    @JsonIgnore
    public PSDESADetailDTO psdeserviceapiname(String pSDEServiceAPIName) {
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    @JsonProperty(value="pssysserviceapiid")
    public void setPSSysServiceAPIId(String pSSysServiceAPIId) {
        this._set(DTOFIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }

    @JsonIgnore
    public String getPSSysServiceAPIId() {
        Object objValue = this._get(DTOFIELD_PSSYSSERVICEAPIID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty() {
        return this._contains(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public void resetPSSysServiceAPIId() {
        this._reset(DTOFIELD_PSSYSSERVICEAPIID);
    }

    @JsonIgnore
    public PSDESADetailDTO pssysserviceapiid(String pSSysServiceAPIId) {
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSDESADetailDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSDESADetailDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="requestfield")
    public void setRequestField(String requestField) {
        this._set(DTOFIELD_REQUESTFIELD, requestField);
    }

    @JsonIgnore
    public String getRequestField() {
        Object objValue = this._get(DTOFIELD_REQUESTFIELD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestFieldDirty() {
        return this._contains(DTOFIELD_REQUESTFIELD);
    }

    @JsonIgnore
    public void resetRequestField() {
        this._reset(DTOFIELD_REQUESTFIELD);
    }

    @JsonIgnore
    public PSDESADetailDTO requestfield(String requestField) {
        this.setRequestField(requestField);
        return this;
    }

    @JsonProperty(value="requestmethod")
    public void setRequestMethod(String requestMethod) {
        this._set(DTOFIELD_REQUESTMETHOD, requestMethod);
    }

    @JsonIgnore
    public String getRequestMethod() {
        Object objValue = this._get(DTOFIELD_REQUESTMETHOD);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestMethodDirty() {
        return this._contains(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public void resetRequestMethod() {
        this._reset(DTOFIELD_REQUESTMETHOD);
    }

    @JsonIgnore
    public PSDESADetailDTO requestmethod(String requestMethod) {
        this.setRequestMethod(requestMethod);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO requestmethod(PSModelEnums.RequestMethod requestMethod) {
        if (requestMethod == null) {
            this.setRequestMethod(null);
        } else {
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    @JsonProperty(value="requestparamtype")
    public void setRequestParamType(String requestParamType) {
        this._set(DTOFIELD_REQUESTPARAMTYPE, requestParamType);
    }

    @JsonIgnore
    public String getRequestParamType() {
        Object objValue = this._get(DTOFIELD_REQUESTPARAMTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestParamTypeDirty() {
        return this._contains(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public void resetRequestParamType() {
        this._reset(DTOFIELD_REQUESTPARAMTYPE);
    }

    @JsonIgnore
    public PSDESADetailDTO requestparamtype(String requestParamType) {
        this.setRequestParamType(requestParamType);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO requestparamtype(PSModelEnums.ServiceReqParamType requestParamType) {
        if (requestParamType == null) {
            this.setRequestParamType(null);
        } else {
            this.setRequestParamType(requestParamType.value);
        }
        return this;
    }

    @JsonProperty(value="retvaltype")
    public void setRetValType(String retValType) {
        this._set(DTOFIELD_RETVALTYPE, retValType);
    }

    @JsonIgnore
    public String getRetValType() {
        Object objValue = this._get(DTOFIELD_RETVALTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRetValTypeDirty() {
        return this._contains(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public void resetRetValType() {
        this._reset(DTOFIELD_RETVALTYPE);
    }

    @JsonIgnore
    public PSDESADetailDTO retvaltype(String retValType) {
        this.setRetValType(retValType);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO retvaltype(PSModelEnums.DEActionRetType retValType) {
        if (retValType == null) {
            this.setRetValType(null);
        } else {
            this.setRetValType(retValType.value);
        }
        return this;
    }

    @JsonProperty(value="serviceurl")
    public void setServiceUrl(String serviceUrl) {
        this._set(DTOFIELD_SERVICEURL, serviceUrl);
    }

    @JsonIgnore
    public String getServiceUrl() {
        Object objValue = this._get(DTOFIELD_SERVICEURL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceUrlDirty() {
        return this._contains(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public void resetServiceUrl() {
        this._reset(DTOFIELD_SERVICEURL);
    }

    @JsonIgnore
    public PSDESADetailDTO serviceurl(String serviceUrl) {
        this.setServiceUrl(serviceUrl);
        return this;
    }

    @JsonProperty(value="uniquetag")
    public void setUniqueTag(String uniqueTag) {
        this._set(DTOFIELD_UNIQUETAG, uniqueTag);
    }

    @JsonIgnore
    public String getUniqueTag() {
        Object objValue = this._get(DTOFIELD_UNIQUETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagDirty() {
        return this._contains(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public void resetUniqueTag() {
        this._reset(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public PSDESADetailDTO uniquetag(String uniqueTag) {
        this.setUniqueTag(uniqueTag);
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
    public PSDESADetailDTO updatedate(Timestamp updateDate) {
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
    public PSDESADetailDTO updateman(String updateMan) {
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
    public PSDESADetailDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDESADetailDTO usertag(String userTag) {
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
    public PSDESADetailDTO usertag2(String userTag2) {
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
    public PSDESADetailDTO usertag3(String userTag3) {
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
    public PSDESADetailDTO usertag4(String userTag4) {
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
    public PSDESADetailDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDESADetailDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDESADetailId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDESADetailId(strValue);
    }

    @JsonIgnore
    public PSDESADetailDTO id(String strValue) {
        this.setPSDESADetailId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDESADetailParamDTO> getPSDESADetailParams() {
        Object list = this._get(DTOFIELD_PSDESADETAILPARAMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdesadetailparams")
    public void setPSDESADetailParams(List<PSDESADetailParamDTO> psdesadetailparams) {
        this._set(DTOFIELD_PSDESADETAILPARAMS, psdesadetailparams);
    }

    @JsonIgnore
    public List<PSDESADetailParamDTO> getPSDESADetailParamsIf() {
        Object list = this._get(DTOFIELD_PSDESADETAILPARAMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDESADETAILPARAMS, list);
        }
        return (List) list;
    }
}
