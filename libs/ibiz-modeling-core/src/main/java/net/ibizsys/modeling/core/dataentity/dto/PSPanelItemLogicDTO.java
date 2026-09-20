package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSPanelItemLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDOP = "CONDOP";
    protected static final String DTOFIELD_CONDOP = "condop";
    public static final String FIELD_CONDVALUE = "CONDVALUE";
    protected static final String DTOFIELD_CONDVALUE = "condvalue";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DSTFIELDNAME = "DSTFIELDNAME";
    protected static final String DTOFIELD_DSTFIELDNAME = "dstfieldname";
    public static final String FIELD_DSTPSPANELMODELID = "DSTPSPANELMODELID";
    protected static final String DTOFIELD_DSTPSPANELMODELID = "dstpspanelmodelid";
    public static final String FIELD_DSTPSPANELMODELNAME = "DSTPSPANELMODELNAME";
    protected static final String DTOFIELD_DSTPSPANELMODELNAME = "dstpspanelmodelname";
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
    public static final String FIELD_PPSPANELITEMLOGICID = "PPSPANELITEMLOGICID";
    protected static final String DTOFIELD_PPSPANELITEMLOGICID = "ppspanelitemlogicid";
    public static final String FIELD_PPSPANELITEMLOGICNAME = "PPSPANELITEMLOGICNAME";
    protected static final String DTOFIELD_PPSPANELITEMLOGICNAME = "ppspanelitemlogicname";
    public static final String FIELD_PSPANELITEMLOGICID = "PSPANELITEMLOGICID";
    protected static final String DTOFIELD_PSPANELITEMLOGICID = "pspanelitemlogicid";
    public static final String FIELD_PSPANELITEMLOGICNAME = "PSPANELITEMLOGICNAME";
    protected static final String DTOFIELD_PSPANELITEMLOGICNAME = "pspanelitemlogicname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELITEMID = "PSSYSVIEWPANELITEMID";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";
    public static final String FIELD_PSSYSVIEWPANELITEMNAME = "PSSYSVIEWPANELITEMNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String DTOFIELD_PSPANELITEMLOGICS = "pspanelitemlogics";

    @JsonProperty(value="condop")
    public void setCondOp(String condOp) {
        this._set(DTOFIELD_CONDOP, condOp);
    }

    @JsonIgnore
    public String getCondOp() {
        Object objValue = this._get(DTOFIELD_CONDOP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondOpDirty() {
        return this._contains(DTOFIELD_CONDOP);
    }

    @JsonIgnore
    public void resetCondOp() {
        this._reset(DTOFIELD_CONDOP);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO condop(String condOp) {
        this.setCondOp(condOp);
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
    public PSPanelItemLogicDTO condvalue(String condValue) {
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
    public PSPanelItemLogicDTO createdate(Timestamp createDate) {
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
    public PSPanelItemLogicDTO createman(String createMan) {
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
    public PSPanelItemLogicDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="dstfieldname")
    public void setDstFieldName(String dstFieldName) {
        this._set(DTOFIELD_DSTFIELDNAME, dstFieldName);
    }

    @JsonIgnore
    public String getDstFieldName() {
        Object objValue = this._get(DTOFIELD_DSTFIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstFieldNameDirty() {
        return this._contains(DTOFIELD_DSTFIELDNAME);
    }

    @JsonIgnore
    public void resetDstFieldName() {
        this._reset(DTOFIELD_DSTFIELDNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO dstfieldname(String dstFieldName) {
        this.setDstFieldName(dstFieldName);
        return this;
    }

    @JsonProperty(value="dstpspanelmodelid")
    public void setDstPSPanelModelId(String dstPSPanelModelId) {
        this._set(DTOFIELD_DSTPSPANELMODELID, dstPSPanelModelId);
    }

    @JsonIgnore
    public String getDstPSPanelModelId() {
        Object objValue = this._get(DTOFIELD_DSTPSPANELMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSPanelModelIdDirty() {
        return this._contains(DTOFIELD_DSTPSPANELMODELID);
    }

    @JsonIgnore
    public void resetDstPSPanelModelId() {
        this._reset(DTOFIELD_DSTPSPANELMODELID);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelid(String dstPSPanelModelId) {
        this.setDstPSPanelModelId(dstPSPanelModelId);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelid(PSSysViewPanelModelDTO pSSysViewPanelModel) {
        if (pSSysViewPanelModel == null) {
            this.setDstPSPanelModelId(null);
            this.setDstPSPanelModelName(null);
        } else {
            this.setDstPSPanelModelId(pSSysViewPanelModel.getPSSysViewPanelModelId());
            this.setDstPSPanelModelName(pSSysViewPanelModel.getPSSysViewPanelModelName());
        }
        return this;
    }

    @JsonProperty(value="dstpspanelmodelname")
    public void setDstPSPanelModelName(String dstPSPanelModelName) {
        this._set(DTOFIELD_DSTPSPANELMODELNAME, dstPSPanelModelName);
    }

    @JsonIgnore
    public String getDstPSPanelModelName() {
        Object objValue = this._get(DTOFIELD_DSTPSPANELMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSPanelModelNameDirty() {
        return this._contains(DTOFIELD_DSTPSPANELMODELNAME);
    }

    @JsonIgnore
    public void resetDstPSPanelModelName() {
        this._reset(DTOFIELD_DSTPSPANELMODELNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO dstpspanelmodelname(String dstPSPanelModelName) {
        this.setDstPSPanelModelName(dstPSPanelModelName);
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
    public PSPanelItemLogicDTO groupnotflag(Integer groupNotFlag) {
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO groupnotflag(Boolean groupNotFlag) {
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
    public PSPanelItemLogicDTO groupop(String groupOP) {
        this.setGroupOP(groupOP);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO groupop(PSModelEnums.GroupCondOP groupOP) {
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
    public PSPanelItemLogicDTO logiccat(String logicCat) {
        this.setLogicCat(logicCat);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO logiccat(PSModelEnums.CtrlDetailLogicCat logicCat) {
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
    public PSPanelItemLogicDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO logictype(PSModelEnums.FormDetailLogicType logicType) {
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
    public PSPanelItemLogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppspanelitemlogicid")
    public void setPPSPanelItemLogicId(String pPSPanelItemLogicId) {
        this._set(DTOFIELD_PPSPANELITEMLOGICID, pPSPanelItemLogicId);
    }

    @JsonIgnore
    public String getPPSPanelItemLogicId() {
        Object objValue = this._get(DTOFIELD_PPSPANELITEMLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSPanelItemLogicIdDirty() {
        return this._contains(DTOFIELD_PPSPANELITEMLOGICID);
    }

    @JsonIgnore
    public void resetPPSPanelItemLogicId() {
        this._reset(DTOFIELD_PPSPANELITEMLOGICID);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicid(String pPSPanelItemLogicId) {
        this.setPPSPanelItemLogicId(pPSPanelItemLogicId);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicid(PSPanelItemLogicDTO pSPanelItemLogic) {
        if (pSPanelItemLogic == null) {
            this.setPPSPanelItemLogicId(null);
            this.setPPSPanelItemLogicName(null);
        } else {
            this.setPPSPanelItemLogicId(pSPanelItemLogic.getPSPanelItemLogicId());
            this.setPPSPanelItemLogicName(pSPanelItemLogic.getPSPanelItemLogicName());
        }
        return this;
    }

    @JsonProperty(value="ppspanelitemlogicname")
    public void setPPSPanelItemLogicName(String pPSPanelItemLogicName) {
        this._set(DTOFIELD_PPSPANELITEMLOGICNAME, pPSPanelItemLogicName);
    }

    @JsonIgnore
    public String getPPSPanelItemLogicName() {
        Object objValue = this._get(DTOFIELD_PPSPANELITEMLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSPanelItemLogicNameDirty() {
        return this._contains(DTOFIELD_PPSPANELITEMLOGICNAME);
    }

    @JsonIgnore
    public void resetPPSPanelItemLogicName() {
        this._reset(DTOFIELD_PPSPANELITEMLOGICNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO ppspanelitemlogicname(String pPSPanelItemLogicName) {
        this.setPPSPanelItemLogicName(pPSPanelItemLogicName);
        return this;
    }

    @JsonProperty(value="pspanelitemlogicid")
    public void setPSPanelItemLogicId(String pSPanelItemLogicId) {
        this._set(DTOFIELD_PSPANELITEMLOGICID, pSPanelItemLogicId);
    }

    @JsonIgnore
    public String getPSPanelItemLogicId() {
        Object objValue = this._get(DTOFIELD_PSPANELITEMLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelItemLogicIdDirty() {
        return this._contains(DTOFIELD_PSPANELITEMLOGICID);
    }

    @JsonIgnore
    public void resetPSPanelItemLogicId() {
        this._reset(DTOFIELD_PSPANELITEMLOGICID);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pspanelitemlogicid(String pSPanelItemLogicId) {
        this.setPSPanelItemLogicId(pSPanelItemLogicId);
        return this;
    }

    @JsonProperty(value="pspanelitemlogicname")
    public void setPSPanelItemLogicName(String pSPanelItemLogicName) {
        this._set(DTOFIELD_PSPANELITEMLOGICNAME, pSPanelItemLogicName);
    }

    @JsonIgnore
    public String getPSPanelItemLogicName() {
        Object objValue = this._get(DTOFIELD_PSPANELITEMLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelItemLogicNameDirty() {
        return this._contains(DTOFIELD_PSPANELITEMLOGICNAME);
    }

    @JsonIgnore
    public void resetPSPanelItemLogicName() {
        this._reset(DTOFIELD_PSPANELITEMLOGICNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pspanelitemlogicname(String pSPanelItemLogicName) {
        this.setPSPanelItemLogicName(pSPanelItemLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSPanelItemLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSPanelItemLogicName(strName);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO name(String strName) {
        this.setPSPanelItemLogicName(strName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemid")
    public void setPSSysViewPanelItemId(String pSSysViewPanelItemId) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMID, pSSysViewPanelItemId);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMID);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemid(String pSSysViewPanelItemId) {
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setPSSysViewPanelItemId(null);
            this.setPSSysViewPanelItemName(null);
        } else {
            this.setPSSysViewPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPSSysViewPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelitemname")
    public void setPSSysViewPanelItemName(String pSSysViewPanelItemName) {
        this._set(DTOFIELD_PSSYSVIEWPANELITEMNAME, pSSysViewPanelItemName);
    }

    @JsonIgnore
    public String getPSSysViewPanelItemName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelItemNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelItemName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELITEMNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelitemname(String pSSysViewPanelItemName) {
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSPanelItemLogicDTO updatedate(Timestamp updateDate) {
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
    public PSPanelItemLogicDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSPanelItemLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSPanelItemLogicId(strValue);
    }

    @JsonIgnore
    public PSPanelItemLogicDTO id(String strValue) {
        this.setPSPanelItemLogicId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSPanelItemLogicDTO> getPSPanelItemLogics() {
        Object list = this._get(DTOFIELD_PSPANELITEMLOGICS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="pspanelitemlogics")
    public void setPSPanelItemLogics(List<PSPanelItemLogicDTO> pspanelitemlogics) {
        this._set(DTOFIELD_PSPANELITEMLOGICS, pspanelitemlogics);
    }

    @JsonIgnore
    public List<PSPanelItemLogicDTO> getPSPanelItemLogicsIf() {
        Object list = this._get(DTOFIELD_PSPANELITEMLOGICS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSPANELITEMLOGICS, list);
        }
        return (List) list;
    }
}
