package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEFDLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_FDNAME = "FDNAME";
    protected static final String DTOFIELD_FDNAME = "fdname";
    public static final String FIELD_GROUPNOTFLAG = "GROUPNOTFLAG";
    protected static final String DTOFIELD_GROUPNOTFLAG = "groupnotflag";
    public static final String FIELD_GROUPOP = "GROUPOP";
    protected static final String DTOFIELD_GROUPOP = "groupop";
    public static final String FIELD_LOGICCAT = "LOGICCAT";
    protected static final String DTOFIELD_LOGICCAT = "logiccat";
    public static final String FIELD_LOGICTYPE = "LOGICTYPE";
    protected static final String DTOFIELD_LOGICTYPE = "logictype";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSDEFDLOGICID = "PPSDEFDLOGICID";
    protected static final String DTOFIELD_PPSDEFDLOGICID = "ppsdefdlogicid";
    public static final String FIELD_PPSDEFDLOGICNAME = "PPSDEFDLOGICNAME";
    protected static final String DTOFIELD_PPSDEFDLOGICNAME = "ppsdefdlogicname";
    public static final String FIELD_PSDBVALUEOPID = "PSDBVALUEOPID";
    protected static final String DTOFIELD_PSDBVALUEOPID = "psdbvalueopid";
    public static final String FIELD_PSDBVALUEOPNAME = "PSDBVALUEOPNAME";
    protected static final String DTOFIELD_PSDBVALUEOPNAME = "psdbvalueopname";
    public static final String FIELD_PSDEFDLOGICID = "PSDEFDLOGICID";
    protected static final String DTOFIELD_PSDEFDLOGICID = "psdefdlogicid";
    public static final String FIELD_PSDEFDLOGICNAME = "PSDEFDLOGICNAME";
    protected static final String DTOFIELD_PSDEFDLOGICNAME = "psdefdlogicname";
    public static final String FIELD_PSDEFORMDETAILID = "PSDEFORMDETAILID";
    protected static final String DTOFIELD_PSDEFORMDETAILID = "psdeformdetailid";
    public static final String FIELD_PSDEFORMDETAILNAME = "PSDEFORMDETAILNAME";
    protected static final String DTOFIELD_PSDEFORMDETAILNAME = "psdeformdetailname";
    public static final String FIELD_PSDEFORMID = "PSDEFORMID";
    protected static final String DTOFIELD_PSDEFORMID = "psdeformid";
    public static final String FIELD_PSDEFORMNAME = "PSDEFORMNAME";
    protected static final String DTOFIELD_PSDEFORMNAME = "psdeformname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSDEFDLOGICS = "psdefdlogics";

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
    public PSDEFDLogicDTO condvalue(String condValue) {
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
    public PSDEFDLogicDTO createdate(Timestamp createDate) {
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
    public PSDEFDLogicDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="customcode")
    public void setCustomCode(String customCode) {
        this._set(DTOFIELD_CUSTOMCODE, customCode);
    }

    @JsonIgnore
    public String getCustomCode() {
        Object objValue = this._get(DTOFIELD_CUSTOMCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCustomCodeDirty() {
        return this._contains(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public void resetCustomCode() {
        this._reset(DTOFIELD_CUSTOMCODE);
    }

    @JsonIgnore
    public PSDEFDLogicDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="fdname")
    public void setFDName(String fDName) {
        this._set(DTOFIELD_FDNAME, fDName);
    }

    @JsonIgnore
    public String getFDName() {
        Object objValue = this._get(DTOFIELD_FDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFDNameDirty() {
        return this._contains(DTOFIELD_FDNAME);
    }

    @JsonIgnore
    public void resetFDName() {
        this._reset(DTOFIELD_FDNAME);
    }

    @JsonIgnore
    public PSDEFDLogicDTO fdname(String fDName) {
        this.setFDName(fDName);
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
    public PSDEFDLogicDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO groupnotflag(Boolean groupNotFlag) {
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
    public PSDEFDLogicDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO groupop(PSModelEnums.GroupCondOP groupOP) {
        if (groupOP == null) {
            this.setGroupOP(null);
        } else {
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    @JsonProperty(value="logiccat")
    public void setLogicCat(String logicCat) {
        this._set(DTOFIELD_LOGICCAT, logicCat);
    }

    @JsonIgnore
    public String getLogicCat() {
        Object objValue = this._get(DTOFIELD_LOGICCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicCatDirty() {
        return this._contains(DTOFIELD_LOGICCAT);
    }

    @JsonIgnore
    public void resetLogicCat() {
        this._reset(DTOFIELD_LOGICCAT);
    }

    @JsonIgnore
    public PSDEFDLogicDTO logiccat(String logicCat) {
        this.setLogicCat(logicCat);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO logiccat(PSModelEnums.CtrlDetailLogicCat logicCat) {
        if (logicCat == null) {
            this.setLogicCat(null);
        } else {
            this.setLogicCat(logicCat.value);
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
    public PSDEFDLogicDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO logictype(PSModelEnums.FormDetailLogicType logicType) {
        if (logicType == null) {
            this.setLogicType(null);
        } else {
            this.setLogicType(logicType.value);
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
    public PSDEFDLogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsdefdlogicid")
    public void setPPSDEFDLogicId(String pPSDEFDLogicId) {
        this._set(DTOFIELD_PPSDEFDLOGICID, pPSDEFDLogicId);
    }

    @JsonIgnore
    public String getPPSDEFDLogicId() {
        Object objValue = this._get(DTOFIELD_PPSDEFDLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFDLogicIdDirty() {
        return this._contains(DTOFIELD_PPSDEFDLOGICID);
    }

    @JsonIgnore
    public void resetPPSDEFDLogicId() {
        this._reset(DTOFIELD_PPSDEFDLOGICID);
    }

    @JsonIgnore
    public PSDEFDLogicDTO ppsdefdlogicid(String pPSDEFDLogicId) {
        this.setPPSDEFDLogicId(pPSDEFDLogicId);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO ppsdefdlogicid(PSDEFDLogicDTO pSDEFDLogic) {
        if (pSDEFDLogic == null) {
            this.setPPSDEFDLogicId(null);
            this.setPPSDEFDLogicName(null);
        } else {
            this.setPPSDEFDLogicId(pSDEFDLogic.getPSDEFDLogicId());
            this.setPPSDEFDLogicName(pSDEFDLogic.getPSDEFDLogicName());
        }
        return this;
    }

    @JsonProperty(value="ppsdefdlogicname")
    public void setPPSDEFDLogicName(String pPSDEFDLogicName) {
        this._set(DTOFIELD_PPSDEFDLOGICNAME, pPSDEFDLogicName);
    }

    @JsonIgnore
    public String getPPSDEFDLogicName() {
        Object objValue = this._get(DTOFIELD_PPSDEFDLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDEFDLogicNameDirty() {
        return this._contains(DTOFIELD_PPSDEFDLOGICNAME);
    }

    @JsonIgnore
    public void resetPPSDEFDLogicName() {
        this._reset(DTOFIELD_PPSDEFDLOGICNAME);
    }

    @JsonIgnore
    public PSDEFDLogicDTO ppsdefdlogicname(String pPSDEFDLogicName) {
        this.setPPSDEFDLogicName(pPSDEFDLogicName);
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
    public PSDEFDLogicDTO psdbvalueopid(String pSDBValueOPId) {
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdbvalueopid(PSDBValueOPDTO pSDBValueOP) {
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
    public PSDEFDLogicDTO psdbvalueopname(String pSDBValueOPName) {
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    @JsonProperty(value="psdefdlogicid")
    public void setPSDEFDLogicId(String pSDEFDLogicId) {
        this._set(DTOFIELD_PSDEFDLOGICID, pSDEFDLogicId);
    }

    @JsonIgnore
    public String getPSDEFDLogicId() {
        Object objValue = this._get(DTOFIELD_PSDEFDLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDLogicIdDirty() {
        return this._contains(DTOFIELD_PSDEFDLOGICID);
    }

    @JsonIgnore
    public void resetPSDEFDLogicId() {
        this._reset(DTOFIELD_PSDEFDLOGICID);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdefdlogicid(String pSDEFDLogicId) {
        this.setPSDEFDLogicId(pSDEFDLogicId);
        return this;
    }

    @JsonProperty(value="psdefdlogicname")
    public void setPSDEFDLogicName(String pSDEFDLogicName) {
        this._set(DTOFIELD_PSDEFDLOGICNAME, pSDEFDLogicName);
    }

    @JsonIgnore
    public String getPSDEFDLogicName() {
        Object objValue = this._get(DTOFIELD_PSDEFDLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFDLogicNameDirty() {
        return this._contains(DTOFIELD_PSDEFDLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEFDLogicName() {
        this._reset(DTOFIELD_PSDEFDLOGICNAME);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdefdlogicname(String pSDEFDLogicName) {
        this.setPSDEFDLogicName(pSDEFDLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEFDLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEFDLogicName(strName);
    }

    @JsonIgnore
    public PSDEFDLogicDTO name(String strName) {
        this.setPSDEFDLogicName(strName);
        return this;
    }

    @JsonProperty(value="psdeformdetailid")
    public void setPSDEFormDetailId(String pSDEFormDetailId) {
        this._set(DTOFIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }

    @JsonIgnore
    public String getPSDEFormDetailId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public void resetPSDEFormDetailId() {
        this._reset(DTOFIELD_PSDEFORMDETAILID);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformdetailid(String pSDEFormDetailId) {
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformdetailid(PSDEFormDetailDTO pSDEFormDetail) {
        if (pSDEFormDetail == null) {
            this.setPSDEFormDetailId(null);
            this.setPSDEFormDetailName(null);
        } else {
            this.setPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    @JsonProperty(value="psdeformdetailname")
    public void setPSDEFormDetailName(String pSDEFormDetailName) {
        this._set(DTOFIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }

    @JsonIgnore
    public String getPSDEFormDetailName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMDETAILNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormDetailNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public void resetPSDEFormDetailName() {
        this._reset(DTOFIELD_PSDEFORMDETAILNAME);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformdetailname(String pSDEFormDetailName) {
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    @JsonProperty(value="psdeformid")
    public void setPSDEFormId(String pSDEFormId) {
        this._set(DTOFIELD_PSDEFORMID, pSDEFormId);
    }

    @JsonIgnore
    public String getPSDEFormId() {
        Object objValue = this._get(DTOFIELD_PSDEFORMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormIdDirty() {
        return this._contains(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public void resetPSDEFormId() {
        this._reset(DTOFIELD_PSDEFORMID);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformid(String pSDEFormId) {
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformid(PSDEFormDTO pSDEForm) {
        if (pSDEForm == null) {
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        } else {
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    @JsonProperty(value="psdeformname")
    public void setPSDEFormName(String pSDEFormName) {
        this._set(DTOFIELD_PSDEFORMNAME, pSDEFormName);
    }

    @JsonIgnore
    public String getPSDEFormName() {
        Object objValue = this._get(DTOFIELD_PSDEFORMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFormNameDirty() {
        return this._contains(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public void resetPSDEFormName() {
        this._reset(DTOFIELD_PSDEFORMNAME);
    }

    @JsonIgnore
    public PSDEFDLogicDTO psdeformname(String pSDEFormName) {
        this.setPSDEFormName(pSDEFormName);
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
    public PSDEFDLogicDTO updatedate(Timestamp updateDate) {
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
    public PSDEFDLogicDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEFDLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEFDLogicId(strValue);
    }

    @JsonIgnore
    public PSDEFDLogicDTO id(String strValue) {
        this.setPSDEFDLogicId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEFDLogicDTO> getPSDEFDLogics() {
        Object list = this._get(DTOFIELD_PSDEFDLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdefdlogics")
    public void setPSDEFDLogics(List<PSDEFDLogicDTO> psdefdlogics) {
        this._set(DTOFIELD_PSDEFDLOGICS, psdefdlogics);
    }

    @JsonIgnore
    public List<PSDEFDLogicDTO> getPSDEFDLogicsIf() {
        Object list = this._get(DTOFIELD_PSDEFDLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEFDLOGICS, list);
        }
        return (List) list;
    }
}
