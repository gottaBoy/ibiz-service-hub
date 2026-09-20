package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSAppFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelModelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysViewPanelLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_ATTRNAME = "ATTRNAME";
    protected static final String DTOFIELD_ATTRNAME = "attrname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CTRLEVENT = "CTRLEVENT";
    protected static final String DTOFIELD_CTRLEVENT = "ctrlevent";
    public static final String FIELD_CTRLEVENTARG = "CTRLEVENTARG";
    protected static final String DTOFIELD_CTRLEVENTARG = "ctrleventarg";
    public static final String FIELD_CTRLEVENTARG2 = "CTRLEVENTARG2";
    protected static final String DTOFIELD_CTRLEVENTARG2 = "ctrleventarg2";
    public static final String FIELD_CTRLEVENTNAME = "CTRLEVENTNAME";
    protected static final String DTOFIELD_CTRLEVENTNAME = "ctrleventname";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DSTLOGICTYPE = "DSTLOGICTYPE";
    protected static final String DTOFIELD_DSTLOGICTYPE = "dstlogictype";
    public static final String FIELD_LAYOUTPSSYSVIEWPANELID = "LAYOUTPSSYSVIEWPANELID";
    protected static final String DTOFIELD_LAYOUTPSSYSVIEWPANELID = "layoutpssysviewpanelid";
    public static final String FIELD_LAYOUTPSSYSVIEWPANELNAME = "LAYOUTPSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_LAYOUTPSSYSVIEWPANELNAME = "layoutpssysviewpanelname";
    public static final String FIELD_LOGICPARAM = "LOGICPARAM";
    protected static final String DTOFIELD_LOGICPARAM = "logicparam";
    public static final String FIELD_LOGICPARAM2 = "LOGICPARAM2";
    protected static final String DTOFIELD_LOGICPARAM2 = "logicparam2";
    public static final String FIELD_LOGICTYPE = "LOGICTYPE";
    protected static final String DTOFIELD_LOGICTYPE = "logictype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PARAMPSPANELITEMID = "PARAMPSPANELITEMID";
    protected static final String DTOFIELD_PARAMPSPANELITEMID = "parampspanelitemid";
    public static final String FIELD_PARAMPSPANELITEMNAME = "PARAMPSPANELITEMNAME";
    protected static final String DTOFIELD_PARAMPSPANELITEMNAME = "parampspanelitemname";
    public static final String FIELD_PSAPPFUNCID = "PSAPPFUNCID";
    protected static final String DTOFIELD_PSAPPFUNCID = "psappfuncid";
    public static final String FIELD_PSAPPFUNCNAME = "PSAPPFUNCNAME";
    protected static final String DTOFIELD_PSAPPFUNCNAME = "psappfuncname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUIACTIONID = "PSDEUIACTIONID";
    protected static final String DTOFIELD_PSDEUIACTIONID = "psdeuiactionid";
    public static final String FIELD_PSDEUIACTIONNAME = "PSDEUIACTIONNAME";
    protected static final String DTOFIELD_PSDEUIACTIONNAME = "psdeuiactionname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSVIEWLOGICID = "PSSYSVIEWLOGICID";
    protected static final String DTOFIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";
    public static final String FIELD_PSSYSVIEWLOGICNAME = "PSSYSVIEWLOGICNAME";
    protected static final String DTOFIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELITEMID = "PSSYSVIEWPANELITEMID";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";
    public static final String FIELD_PSSYSVIEWPANELITEMNAME = "PSSYSVIEWPANELITEMNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";
    public static final String FIELD_PSSYSVIEWPANELLOGICID = "PSSYSVIEWPANELLOGICID";
    protected static final String DTOFIELD_PSSYSVIEWPANELLOGICID = "pssysviewpanellogicid";
    public static final String FIELD_PSSYSVIEWPANELLOGICNAME = "PSSYSVIEWPANELLOGICNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELLOGICNAME = "pssysviewpanellogicname";
    public static final String FIELD_PSSYSVIEWPANELMODELID = "PSSYSVIEWPANELMODELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELMODELID = "pssysviewpanelmodelid";
    public static final String FIELD_PSSYSVIEWPANELMODELNAME = "PSSYSVIEWPANELMODELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELMODELNAME = "pssysviewpanelmodelname";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_TIMER = "TIMER";
    protected static final String DTOFIELD_TIMER = "timer";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="attrname")
    public void setAttrName(String attrName) {
        this._set(DTOFIELD_ATTRNAME, attrName);
    }

    @JsonIgnore
    public String getAttrName() {
        Object objValue = this._get(DTOFIELD_ATTRNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAttrNameDirty() {
        return this._contains(DTOFIELD_ATTRNAME);
    }

    @JsonIgnore
    public void resetAttrName() {
        this._reset(DTOFIELD_ATTRNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO attrname(String attrName) {
        this.setAttrName(attrName);
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
    public PSSysViewPanelLogicDTO createdate(Timestamp createDate) {
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
    public PSSysViewPanelLogicDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="ctrlevent")
    public void setCtrlEvent(String ctrlEvent) {
        this._set(DTOFIELD_CTRLEVENT, ctrlEvent);
    }

    @JsonIgnore
    public String getCtrlEvent() {
        Object objValue = this._get(DTOFIELD_CTRLEVENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlEventDirty() {
        return this._contains(DTOFIELD_CTRLEVENT);
    }

    @JsonIgnore
    public void resetCtrlEvent() {
        this._reset(DTOFIELD_CTRLEVENT);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO ctrlevent(String ctrlEvent) {
        this.setCtrlEvent(ctrlEvent);
        return this;
    }

    @JsonProperty(value="ctrleventarg")
    public void setCtrlEventArg(String ctrlEventArg) {
        this._set(DTOFIELD_CTRLEVENTARG, ctrlEventArg);
    }

    @JsonIgnore
    public String getCtrlEventArg() {
        Object objValue = this._get(DTOFIELD_CTRLEVENTARG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlEventArgDirty() {
        return this._contains(DTOFIELD_CTRLEVENTARG);
    }

    @JsonIgnore
    public void resetCtrlEventArg() {
        this._reset(DTOFIELD_CTRLEVENTARG);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO ctrleventarg(String ctrlEventArg) {
        this.setCtrlEventArg(ctrlEventArg);
        return this;
    }

    @JsonProperty(value="ctrleventarg2")
    public void setCtrlEventArg2(String ctrlEventArg2) {
        this._set(DTOFIELD_CTRLEVENTARG2, ctrlEventArg2);
    }

    @JsonIgnore
    public String getCtrlEventArg2() {
        Object objValue = this._get(DTOFIELD_CTRLEVENTARG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlEventArg2Dirty() {
        return this._contains(DTOFIELD_CTRLEVENTARG2);
    }

    @JsonIgnore
    public void resetCtrlEventArg2() {
        this._reset(DTOFIELD_CTRLEVENTARG2);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO ctrleventarg2(String ctrlEventArg2) {
        this.setCtrlEventArg2(ctrlEventArg2);
        return this;
    }

    @JsonProperty(value="ctrleventname")
    public void setCtrlEventName(String ctrlEventName) {
        this._set(DTOFIELD_CTRLEVENTNAME, ctrlEventName);
    }

    @JsonIgnore
    public String getCtrlEventName() {
        Object objValue = this._get(DTOFIELD_CTRLEVENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCtrlEventNameDirty() {
        return this._contains(DTOFIELD_CTRLEVENTNAME);
    }

    @JsonIgnore
    public void resetCtrlEventName() {
        this._reset(DTOFIELD_CTRLEVENTNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO ctrleventname(String ctrlEventName) {
        this.setCtrlEventName(ctrlEventName);
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
    public PSSysViewPanelLogicDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="dstlogictype")
    public void setDstLogicType(String dstLogicType) {
        this._set(DTOFIELD_DSTLOGICTYPE, dstLogicType);
    }

    @JsonIgnore
    public String getDstLogicType() {
        Object objValue = this._get(DTOFIELD_DSTLOGICTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstLogicTypeDirty() {
        return this._contains(DTOFIELD_DSTLOGICTYPE);
    }

    @JsonIgnore
    public void resetDstLogicType() {
        this._reset(DTOFIELD_DSTLOGICTYPE);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO dstlogictype(String dstLogicType) {
        this.setDstLogicType(dstLogicType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO dstlogictype(PSModelEnums.TargetUILogic dstLogicType) {
        if (dstLogicType == null) {
            this.setDstLogicType(null);
        } else {
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    @JsonProperty(value="layoutpssysviewpanelid")
    public void setLayoutPSSysViewPanelId(String layoutPSSysViewPanelId) {
        this._set(DTOFIELD_LAYOUTPSSYSVIEWPANELID, layoutPSSysViewPanelId);
    }

    @JsonIgnore
    public String getLayoutPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_LAYOUTPSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_LAYOUTPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetLayoutPSSysViewPanelId() {
        this._reset(DTOFIELD_LAYOUTPSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO layoutpssysviewpanelid(String layoutPSSysViewPanelId) {
        this.setLayoutPSSysViewPanelId(layoutPSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO layoutpssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setLayoutPSSysViewPanelId(null);
            this.setLayoutPSSysViewPanelName(null);
        } else {
            this.setLayoutPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setLayoutPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="layoutpssysviewpanelname")
    public void setLayoutPSSysViewPanelName(String layoutPSSysViewPanelName) {
        this._set(DTOFIELD_LAYOUTPSSYSVIEWPANELNAME, layoutPSSysViewPanelName);
    }

    @JsonIgnore
    public String getLayoutPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_LAYOUTPSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLayoutPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_LAYOUTPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetLayoutPSSysViewPanelName() {
        this._reset(DTOFIELD_LAYOUTPSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO layoutpssysviewpanelname(String layoutPSSysViewPanelName) {
        this.setLayoutPSSysViewPanelName(layoutPSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="logicparam")
    public void setLogicParam(String logicParam) {
        this._set(DTOFIELD_LOGICPARAM, logicParam);
    }

    @JsonIgnore
    public String getLogicParam() {
        Object objValue = this._get(DTOFIELD_LOGICPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicParamDirty() {
        return this._contains(DTOFIELD_LOGICPARAM);
    }

    @JsonIgnore
    public void resetLogicParam() {
        this._reset(DTOFIELD_LOGICPARAM);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO logicparam(String logicParam) {
        this.setLogicParam(logicParam);
        return this;
    }

    @JsonProperty(value="logicparam2")
    public void setLogicParam2(String logicParam2) {
        this._set(DTOFIELD_LOGICPARAM2, logicParam2);
    }

    @JsonIgnore
    public String getLogicParam2() {
        Object objValue = this._get(DTOFIELD_LOGICPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicParam2Dirty() {
        return this._contains(DTOFIELD_LOGICPARAM2);
    }

    @JsonIgnore
    public void resetLogicParam2() {
        this._reset(DTOFIELD_LOGICPARAM2);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO logicparam2(String logicParam2) {
        this.setLogicParam2(logicParam2);
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
    public PSSysViewPanelLogicDTO logictype(String logicType) {
        this.setLogicType(logicType);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO logictype(PSModelEnums.PanelLogicType logicType) {
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
    public PSSysViewPanelLogicDTO memo(String memo) {
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
    public PSSysViewPanelLogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="parampspanelitemid")
    public void setParamPSPanelItemId(String paramPSPanelItemId) {
        this._set(DTOFIELD_PARAMPSPANELITEMID, paramPSPanelItemId);
    }

    @JsonIgnore
    public String getParamPSPanelItemId() {
        Object objValue = this._get(DTOFIELD_PARAMPSPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSPanelItemIdDirty() {
        return this._contains(DTOFIELD_PARAMPSPANELITEMID);
    }

    @JsonIgnore
    public void resetParamPSPanelItemId() {
        this._reset(DTOFIELD_PARAMPSPANELITEMID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO parampspanelitemid(String paramPSPanelItemId) {
        this.setParamPSPanelItemId(paramPSPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO parampspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setParamPSPanelItemId(null);
            this.setParamPSPanelItemName(null);
        } else {
            this.setParamPSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setParamPSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="parampspanelitemname")
    public void setParamPSPanelItemName(String paramPSPanelItemName) {
        this._set(DTOFIELD_PARAMPSPANELITEMNAME, paramPSPanelItemName);
    }

    @JsonIgnore
    public String getParamPSPanelItemName() {
        Object objValue = this._get(DTOFIELD_PARAMPSPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isParamPSPanelItemNameDirty() {
        return this._contains(DTOFIELD_PARAMPSPANELITEMNAME);
    }

    @JsonIgnore
    public void resetParamPSPanelItemName() {
        this._reset(DTOFIELD_PARAMPSPANELITEMNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO parampspanelitemname(String paramPSPanelItemName) {
        this.setParamPSPanelItemName(paramPSPanelItemName);
        return this;
    }

    @JsonProperty(value="psappfuncid")
    public void setPSAppFuncId(String pSAppFuncId) {
        this._set(DTOFIELD_PSAPPFUNCID, pSAppFuncId);
    }

    @JsonIgnore
    public String getPSAppFuncId() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncIdDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public void resetPSAppFuncId() {
        this._reset(DTOFIELD_PSAPPFUNCID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psappfuncid(String pSAppFuncId) {
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psappfuncid(PSAppFuncDTO pSAppFunc) {
        if (pSAppFunc == null) {
            this.setPSAppFuncId(null);
            this.setPSAppFuncName(null);
        } else {
            this.setPSAppFuncId(pSAppFunc.getPSAppFuncId());
            this.setPSAppFuncName(pSAppFunc.getPSAppFuncName());
        }
        return this;
    }

    @JsonProperty(value="psappfuncname")
    public void setPSAppFuncName(String pSAppFuncName) {
        this._set(DTOFIELD_PSAPPFUNCNAME, pSAppFuncName);
    }

    @JsonIgnore
    public String getPSAppFuncName() {
        Object objValue = this._get(DTOFIELD_PSAPPFUNCNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSAppFuncNameDirty() {
        return this._contains(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public void resetPSAppFuncName() {
        this._reset(DTOFIELD_PSAPPFUNCNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psappfuncname(String pSAppFuncName) {
        this.setPSAppFuncName(pSAppFuncName);
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
    public PSSysViewPanelLogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicid")
    public void setPSDELogicId(String pSDELogicId) {
        this._set(DTOFIELD_PSDELOGICID, pSDELogicId);
    }

    @JsonIgnore
    public String getPSDELogicId() {
        Object objValue = this._get(DTOFIELD_PSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicIdDirty() {
        return this._contains(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public void resetPSDELogicId() {
        this._reset(DTOFIELD_PSDELOGICID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="psdelogicname")
    public void setPSDELogicName(String pSDELogicName) {
        this._set(DTOFIELD_PSDELOGICNAME, pSDELogicName);
    }

    @JsonIgnore
    public String getPSDELogicName() {
        Object objValue = this._get(DTOFIELD_PSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDELogicNameDirty() {
        return this._contains(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDELogicName() {
        this._reset(DTOFIELD_PSDELOGICNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
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
    public PSSysViewPanelLogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeuiactionid")
    public void setPSDEUIActionId(String pSDEUIActionId) {
        this._set(DTOFIELD_PSDEUIACTIONID, pSDEUIActionId);
    }

    @JsonIgnore
    public String getPSDEUIActionId() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionIdDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public void resetPSDEUIActionId() {
        this._reset(DTOFIELD_PSDEUIACTIONID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
        if (pSDEUIAction == null) {
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        } else {
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    @JsonProperty(value="psdeuiactionname")
    public void setPSDEUIActionName(String pSDEUIActionName) {
        this._set(DTOFIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }

    @JsonIgnore
    public String getPSDEUIActionName() {
        Object objValue = this._get(DTOFIELD_PSDEUIACTIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUIActionNameDirty() {
        return this._contains(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public void resetPSDEUIActionName() {
        this._reset(DTOFIELD_PSDEUIACTIONNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO psdeuiactionname(String pSDEUIActionName) {
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSysViewPanelLogicDTO pssysviewlogicid(String pSSysViewLogicId) {
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic) {
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
    public PSSysViewPanelLogicDTO pssysviewlogicname(String pSSysViewLogicName) {
        this.setPSSysViewLogicName(pSSysViewLogicName);
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
    public PSSysViewPanelLogicDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSSysViewPanelLogicDTO pssysviewpanelitemid(String pSSysViewPanelItemId) {
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
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
    public PSSysViewPanelLogicDTO pssysviewpanelitemname(String pSSysViewPanelItemName) {
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    @JsonProperty(value="pssysviewpanellogicid")
    public void setPSSysViewPanelLogicId(String pSSysViewPanelLogicId) {
        this._set(DTOFIELD_PSSYSVIEWPANELLOGICID, pSSysViewPanelLogicId);
    }

    @JsonIgnore
    public String getPSSysViewPanelLogicId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelLogicIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELLOGICID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelLogicId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELLOGICID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanellogicid(String pSSysViewPanelLogicId) {
        this.setPSSysViewPanelLogicId(pSSysViewPanelLogicId);
        return this;
    }

    @JsonProperty(value="pssysviewpanellogicname")
    public void setPSSysViewPanelLogicName(String pSSysViewPanelLogicName) {
        this._set(DTOFIELD_PSSYSVIEWPANELLOGICNAME, pSSysViewPanelLogicName);
    }

    @JsonIgnore
    public String getPSSysViewPanelLogicName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelLogicNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELLOGICNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelLogicName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELLOGICNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanellogicname(String pSSysViewPanelLogicName) {
        this.setPSSysViewPanelLogicName(pSSysViewPanelLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysViewPanelLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysViewPanelLogicName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO name(String strName) {
        this.setPSSysViewPanelLogicName(strName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelmodelid")
    public void setPSSysViewPanelModelId(String pSSysViewPanelModelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELMODELID, pSSysViewPanelModelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELMODELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelModelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELMODELID);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanelmodelid(String pSSysViewPanelModelId) {
        this.setPSSysViewPanelModelId(pSSysViewPanelModelId);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanelmodelid(PSSysViewPanelModelDTO pSSysViewPanelModel) {
        if (pSSysViewPanelModel == null) {
            this.setPSSysViewPanelModelId(null);
            this.setPSSysViewPanelModelName(null);
        } else {
            this.setPSSysViewPanelModelId(pSSysViewPanelModel.getPSSysViewPanelModelId());
            this.setPSSysViewPanelModelName(pSSysViewPanelModel.getPSSysViewPanelModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelmodelname")
    public void setPSSysViewPanelModelName(String pSSysViewPanelModelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELMODELNAME, pSSysViewPanelModelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelModelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELMODELNAME);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO pssysviewpanelmodelname(String pSSysViewPanelModelName) {
        this.setPSSysViewPanelModelName(pSSysViewPanelModelName);
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
    public PSSysViewPanelLogicDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="timer")
    public void setTimer(Integer timer) {
        this._set(DTOFIELD_TIMER, timer);
    }

    @JsonIgnore
    public Integer getTimer() {
        Object objValue = this._get(DTOFIELD_TIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTimerDirty() {
        return this._contains(DTOFIELD_TIMER);
    }

    @JsonIgnore
    public void resetTimer() {
        this._reset(DTOFIELD_TIMER);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO timer(Integer timer) {
        this.setTimer(timer);
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
    public PSSysViewPanelLogicDTO updatedate(Timestamp updateDate) {
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
    public PSSysViewPanelLogicDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
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
    public PSSysViewPanelLogicDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysViewPanelLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysViewPanelLogicId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelLogicDTO id(String strValue) {
        this.setPSSysViewPanelLogicId(strValue);
        return this;
    }
}
