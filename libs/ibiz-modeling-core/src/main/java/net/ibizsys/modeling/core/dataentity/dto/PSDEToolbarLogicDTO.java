package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEToolbarLogicDTO
extends PSModelDTOBase {
    public static final String FIELD_ATTRNAME = "ATTRNAME";
    protected static final String DTOFIELD_ATTRNAME = "attrname";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_DSTLOGICTYPE = "DSTLOGICTYPE";
    protected static final String DTOFIELD_DSTLOGICTYPE = "dstlogictype";
    public static final String FIELD_EVENTARG = "EVENTARG";
    protected static final String DTOFIELD_EVENTARG = "eventarg";
    public static final String FIELD_EVENTARG2 = "EVENTARG2";
    protected static final String DTOFIELD_EVENTARG2 = "eventarg2";
    public static final String FIELD_EVENTNAMES = "EVENTNAMES";
    protected static final String DTOFIELD_EVENTNAMES = "eventnames";
    public static final String FIELD_LOGICPARAM = "LOGICPARAM";
    protected static final String DTOFIELD_LOGICPARAM = "logicparam";
    public static final String FIELD_LOGICPARAM2 = "LOGICPARAM2";
    protected static final String DTOFIELD_LOGICPARAM2 = "logicparam2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDETBITEMID = "PSDETBITEMID";
    protected static final String DTOFIELD_PSDETBITEMID = "psdetbitemid";
    public static final String FIELD_PSDETBITEMNAME = "PSDETBITEMNAME";
    protected static final String DTOFIELD_PSDETBITEMNAME = "psdetbitemname";
    public static final String FIELD_PSDETOOLBARID = "PSDETOOLBARID";
    protected static final String DTOFIELD_PSDETOOLBARID = "psdetoolbarid";
    public static final String FIELD_PSDETOOLBARLOGICID = "PSDETOOLBARLOGICID";
    protected static final String DTOFIELD_PSDETOOLBARLOGICID = "psdetoolbarlogicid";
    public static final String FIELD_PSDETOOLBARLOGICNAME = "PSDETOOLBARLOGICNAME";
    protected static final String DTOFIELD_PSDETOOLBARLOGICNAME = "psdetoolbarlogicname";
    public static final String FIELD_PSDETOOLBARNAME = "PSDETOOLBARNAME";
    protected static final String DTOFIELD_PSDETOOLBARNAME = "psdetoolbarname";
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
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_TIMER = "TIMER";
    protected static final String DTOFIELD_TIMER = "timer";
    public static final String FIELD_TRIGGERTYPE = "TRIGGERTYPE";
    protected static final String DTOFIELD_TRIGGERTYPE = "triggertype";
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
    public PSDEToolbarLogicDTO attrname(String attrName) {
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
    public PSDEToolbarLogicDTO createdate(Timestamp createDate) {
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
    public PSDEToolbarLogicDTO createman(String createMan) {
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
    public PSDEToolbarLogicDTO customcode(String customCode) {
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
    public PSDEToolbarLogicDTO dstlogictype(String dstLogicType) {
        this.setDstLogicType(dstLogicType);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO dstlogictype(PSModelEnums.TargetUILogic dstLogicType) {
        if (dstLogicType == null) {
            this.setDstLogicType(null);
        } else {
            this.setDstLogicType(dstLogicType.value);
        }
        return this;
    }

    @JsonProperty(value="eventarg")
    public void setEventArg(String eventArg) {
        this._set(DTOFIELD_EVENTARG, eventArg);
    }

    @JsonIgnore
    public String getEventArg() {
        Object objValue = this._get(DTOFIELD_EVENTARG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventArgDirty() {
        return this._contains(DTOFIELD_EVENTARG);
    }

    @JsonIgnore
    public void resetEventArg() {
        this._reset(DTOFIELD_EVENTARG);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO eventarg(String eventArg) {
        this.setEventArg(eventArg);
        return this;
    }

    @JsonProperty(value="eventarg2")
    public void setEventArg2(String eventArg2) {
        this._set(DTOFIELD_EVENTARG2, eventArg2);
    }

    @JsonIgnore
    public String getEventArg2() {
        Object objValue = this._get(DTOFIELD_EVENTARG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventArg2Dirty() {
        return this._contains(DTOFIELD_EVENTARG2);
    }

    @JsonIgnore
    public void resetEventArg2() {
        this._reset(DTOFIELD_EVENTARG2);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO eventarg2(String eventArg2) {
        this.setEventArg2(eventArg2);
        return this;
    }

    @JsonProperty(value="eventnames")
    public void setEventNames(String eventNames) {
        this._set(DTOFIELD_EVENTNAMES, eventNames);
    }

    @JsonIgnore
    public String getEventNames() {
        Object objValue = this._get(DTOFIELD_EVENTNAMES);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEventNamesDirty() {
        return this._contains(DTOFIELD_EVENTNAMES);
    }

    @JsonIgnore
    public void resetEventNames() {
        this._reset(DTOFIELD_EVENTNAMES);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO eventnames(String eventNames) {
        this.setEventNames(eventNames);
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
    public PSDEToolbarLogicDTO logicparam(String logicParam) {
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
    public PSDEToolbarLogicDTO logicparam2(String logicParam2) {
        this.setLogicParam2(logicParam2);
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
    public PSDEToolbarLogicDTO memo(String memo) {
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
    public PSDEToolbarLogicDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDEToolbarLogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEToolbarLogicDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDEToolbarLogicDTO psdelogicname(String pSDELogicName) {
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
    public PSDEToolbarLogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdetbitemid")
    public void setPSDETBItemId(String pSDETBItemId) {
        this._set(DTOFIELD_PSDETBITEMID, pSDETBItemId);
    }

    @JsonIgnore
    public String getPSDETBItemId() {
        Object objValue = this._get(DTOFIELD_PSDETBITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETBItemIdDirty() {
        return this._contains(DTOFIELD_PSDETBITEMID);
    }

    @JsonIgnore
    public void resetPSDETBItemId() {
        this._reset(DTOFIELD_PSDETBITEMID);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetbitemid(String pSDETBItemId) {
        this.setPSDETBItemId(pSDETBItemId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetbitemid(PSDETBItemDTO pSDETBItem) {
        if (pSDETBItem == null) {
            this.setPSDETBItemId(null);
            this.setPSDETBItemName(null);
        } else {
            this.setPSDETBItemId(pSDETBItem.getPSDETBItemId());
            this.setPSDETBItemName(pSDETBItem.getPSDETBItemName());
        }
        return this;
    }

    @JsonProperty(value="psdetbitemname")
    public void setPSDETBItemName(String pSDETBItemName) {
        this._set(DTOFIELD_PSDETBITEMNAME, pSDETBItemName);
    }

    @JsonIgnore
    public String getPSDETBItemName() {
        Object objValue = this._get(DTOFIELD_PSDETBITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETBItemNameDirty() {
        return this._contains(DTOFIELD_PSDETBITEMNAME);
    }

    @JsonIgnore
    public void resetPSDETBItemName() {
        this._reset(DTOFIELD_PSDETBITEMNAME);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetbitemname(String pSDETBItemName) {
        this.setPSDETBItemName(pSDETBItemName);
        return this;
    }

    @JsonProperty(value="psdetoolbarid")
    public void setPSDEToolbarId(String pSDEToolbarId) {
        this._set(DTOFIELD_PSDETOOLBARID, pSDEToolbarId);
    }

    @JsonIgnore
    public String getPSDEToolbarId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public void resetPSDEToolbarId() {
        this._reset(DTOFIELD_PSDETOOLBARID);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetoolbarid(String pSDEToolbarId) {
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar) {
        if (pSDEToolbar == null) {
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        } else {
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    @JsonProperty(value="psdetoolbarlogicid")
    public void setPSDEToolbarLogicId(String pSDEToolbarLogicId) {
        this._set(DTOFIELD_PSDETOOLBARLOGICID, pSDEToolbarLogicId);
    }

    @JsonIgnore
    public String getPSDEToolbarLogicId() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarLogicIdDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARLOGICID);
    }

    @JsonIgnore
    public void resetPSDEToolbarLogicId() {
        this._reset(DTOFIELD_PSDETOOLBARLOGICID);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetoolbarlogicid(String pSDEToolbarLogicId) {
        this.setPSDEToolbarLogicId(pSDEToolbarLogicId);
        return this;
    }

    @JsonProperty(value="psdetoolbarlogicname")
    public void setPSDEToolbarLogicName(String pSDEToolbarLogicName) {
        this._set(DTOFIELD_PSDETOOLBARLOGICNAME, pSDEToolbarLogicName);
    }

    @JsonIgnore
    public String getPSDEToolbarLogicName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarLogicNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARLOGICNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarLogicName() {
        this._reset(DTOFIELD_PSDETOOLBARLOGICNAME);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetoolbarlogicname(String pSDEToolbarLogicName) {
        this.setPSDEToolbarLogicName(pSDEToolbarLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEToolbarLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEToolbarLogicName(strName);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO name(String strName) {
        this.setPSDEToolbarLogicName(strName);
        return this;
    }

    @JsonProperty(value="psdetoolbarname")
    public void setPSDEToolbarName(String pSDEToolbarName) {
        this._set(DTOFIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }

    @JsonIgnore
    public String getPSDEToolbarName() {
        Object objValue = this._get(DTOFIELD_PSDETOOLBARNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEToolbarNameDirty() {
        return this._contains(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public void resetPSDEToolbarName() {
        this._reset(DTOFIELD_PSDETOOLBARNAME);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdetoolbarname(String pSDEToolbarName) {
        this.setPSDEToolbarName(pSDEToolbarName);
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
    public PSDEToolbarLogicDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSDEToolbarLogicDTO psdeuiactionname(String pSDEUIActionName) {
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
    public PSDEToolbarLogicDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDEToolbarLogicDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDEToolbarLogicDTO pssysviewlogicid(String pSSysViewLogicId) {
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic) {
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
    public PSDEToolbarLogicDTO pssysviewlogicname(String pSSysViewLogicName) {
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
    public PSDEToolbarLogicDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
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
    public PSDEToolbarLogicDTO pssysviewpanelname(String pSSysViewPanelName) {
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
    public PSDEToolbarLogicDTO timer(Integer timer) {
        this.setTimer(timer);
        return this;
    }

    @JsonProperty(value="triggertype")
    public void setTriggerType(String triggerType) {
        this._set(DTOFIELD_TRIGGERTYPE, triggerType);
    }

    @JsonIgnore
    public String getTriggerType() {
        Object objValue = this._get(DTOFIELD_TRIGGERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTriggerTypeDirty() {
        return this._contains(DTOFIELD_TRIGGERTYPE);
    }

    @JsonIgnore
    public void resetTriggerType() {
        this._reset(DTOFIELD_TRIGGERTYPE);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO triggertype(String triggerType) {
        this.setTriggerType(triggerType);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO triggertype(PSModelEnums.ViewLogicTrigger triggerType) {
        if (triggerType == null) {
            this.setTriggerType(null);
        } else {
            this.setTriggerType(triggerType.value);
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
    public PSDEToolbarLogicDTO updatedate(Timestamp updateDate) {
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
    public PSDEToolbarLogicDTO updateman(String updateMan) {
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
    public PSDEToolbarLogicDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEToolbarLogicDTO usertag(String userTag) {
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
    public PSDEToolbarLogicDTO usertag2(String userTag2) {
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
    public PSDEToolbarLogicDTO usertag3(String userTag3) {
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
    public PSDEToolbarLogicDTO usertag4(String userTag4) {
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
    public PSDEToolbarLogicDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEToolbarLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEToolbarLogicId(strValue);
    }

    @JsonIgnore
    public PSDEToolbarLogicDTO id(String strValue) {
        this.setPSDEToolbarLogicId(strValue);
        return this;
    }
}
