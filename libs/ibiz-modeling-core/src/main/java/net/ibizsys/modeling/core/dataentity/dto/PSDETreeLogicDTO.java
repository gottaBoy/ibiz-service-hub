package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeLogicDTO
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
    public static final String FIELD_PSDETREECOLID = "PSDETREECOLID";
    protected static final String DTOFIELD_PSDETREECOLID = "psdetreecolid";
    public static final String FIELD_PSDETREECOLNAME = "PSDETREECOLNAME";
    protected static final String DTOFIELD_PSDETREECOLNAME = "psdetreecolname";
    public static final String FIELD_PSDETREELOGICID = "PSDETREELOGICID";
    protected static final String DTOFIELD_PSDETREELOGICID = "psdetreelogicid";
    public static final String FIELD_PSDETREELOGICNAME = "PSDETREELOGICNAME";
    protected static final String DTOFIELD_PSDETREELOGICNAME = "psdetreelogicname";
    public static final String FIELD_PSDETREENODEID = "PSDETREENODEID";
    protected static final String DTOFIELD_PSDETREENODEID = "psdetreenodeid";
    public static final String FIELD_PSDETREENODENAME = "PSDETREENODENAME";
    protected static final String DTOFIELD_PSDETREENODENAME = "psdetreenodename";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
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
    public PSDETreeLogicDTO attrname(String attrName) {
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
    public PSDETreeLogicDTO createdate(Timestamp createDate) {
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
    public PSDETreeLogicDTO createman(String createMan) {
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
    public PSDETreeLogicDTO customcode(String customCode) {
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
    public PSDETreeLogicDTO dstlogictype(String dstLogicType) {
        this.setDstLogicType(dstLogicType);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO dstlogictype(PSModelEnums.TargetUILogic dstLogicType) {
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
    public PSDETreeLogicDTO eventarg(String eventArg) {
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
    public PSDETreeLogicDTO eventarg2(String eventArg2) {
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
    public PSDETreeLogicDTO eventnames(String eventNames) {
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
    public PSDETreeLogicDTO logicparam(String logicParam) {
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
    public PSDETreeLogicDTO logicparam2(String logicParam2) {
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
    public PSDETreeLogicDTO memo(String memo) {
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
    public PSDETreeLogicDTO ordervalue(Integer orderValue) {
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
    public PSDETreeLogicDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDETreeLogicDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdelogicid(PSDELogicDTO pSDELogic) {
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
    public PSDETreeLogicDTO psdelogicname(String pSDELogicName) {
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
    public PSDETreeLogicDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdetreecolid")
    public void setPSDETreeColId(String pSDETreeColId) {
        this._set(DTOFIELD_PSDETREECOLID, pSDETreeColId);
    }

    @JsonIgnore
    public String getPSDETreeColId() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColIdDirty() {
        return this._contains(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public void resetPSDETreeColId() {
        this._reset(DTOFIELD_PSDETREECOLID);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreecolid(String pSDETreeColId) {
        this.setPSDETreeColId(pSDETreeColId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreecolid(PSDETreeColDTO pSDETreeCol) {
        if (pSDETreeCol == null) {
            this.setPSDETreeColId(null);
            this.setPSDETreeColName(null);
        } else {
            this.setPSDETreeColId(pSDETreeCol.getPSDETreeColId());
            this.setPSDETreeColName(pSDETreeCol.getPSDETreeColName());
        }
        return this;
    }

    @JsonProperty(value="psdetreecolname")
    public void setPSDETreeColName(String pSDETreeColName) {
        this._set(DTOFIELD_PSDETREECOLNAME, pSDETreeColName);
    }

    @JsonIgnore
    public String getPSDETreeColName() {
        Object objValue = this._get(DTOFIELD_PSDETREECOLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeColNameDirty() {
        return this._contains(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public void resetPSDETreeColName() {
        this._reset(DTOFIELD_PSDETREECOLNAME);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreecolname(String pSDETreeColName) {
        this.setPSDETreeColName(pSDETreeColName);
        return this;
    }

    @JsonProperty(value="psdetreelogicid")
    public void setPSDETreeLogicId(String pSDETreeLogicId) {
        this._set(DTOFIELD_PSDETREELOGICID, pSDETreeLogicId);
    }

    @JsonIgnore
    public String getPSDETreeLogicId() {
        Object objValue = this._get(DTOFIELD_PSDETREELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeLogicIdDirty() {
        return this._contains(DTOFIELD_PSDETREELOGICID);
    }

    @JsonIgnore
    public void resetPSDETreeLogicId() {
        this._reset(DTOFIELD_PSDETREELOGICID);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreelogicid(String pSDETreeLogicId) {
        this.setPSDETreeLogicId(pSDETreeLogicId);
        return this;
    }

    @JsonProperty(value="psdetreelogicname")
    public void setPSDETreeLogicName(String pSDETreeLogicName) {
        this._set(DTOFIELD_PSDETREELOGICNAME, pSDETreeLogicName);
    }

    @JsonIgnore
    public String getPSDETreeLogicName() {
        Object objValue = this._get(DTOFIELD_PSDETREELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeLogicNameDirty() {
        return this._contains(DTOFIELD_PSDETREELOGICNAME);
    }

    @JsonIgnore
    public void resetPSDETreeLogicName() {
        this._reset(DTOFIELD_PSDETREELOGICNAME);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreelogicname(String pSDETreeLogicName) {
        this.setPSDETreeLogicName(pSDETreeLogicName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeLogicName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeLogicName(strName);
    }

    @JsonIgnore
    public PSDETreeLogicDTO name(String strName) {
        this.setPSDETreeLogicName(strName);
        return this;
    }

    @JsonProperty(value="psdetreenodeid")
    public void setPSDETreeNodeId(String pSDETreeNodeId) {
        this._set(DTOFIELD_PSDETREENODEID, pSDETreeNodeId);
    }

    @JsonIgnore
    public String getPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeId() {
        this._reset(DTOFIELD_PSDETREENODEID);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreenodeid(String pSDETreeNodeId) {
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreenodeid(PSDETreeNodeDTO pSDETreeNode) {
        if (pSDETreeNode == null) {
            this.setPSDETreeNodeId(null);
            this.setPSDETreeNodeName(null);
        } else {
            this.setPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    @JsonProperty(value="psdetreenodename")
    public void setPSDETreeNodeName(String pSDETreeNodeName) {
        this._set(DTOFIELD_PSDETREENODENAME, pSDETreeNodeName);
    }

    @JsonIgnore
    public String getPSDETreeNodeName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeName() {
        this._reset(DTOFIELD_PSDETREENODENAME);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreenodename(String pSDETreeNodeName) {
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    @JsonProperty(value="psdetreeviewid")
    public void setPSDETreeViewId(String pSDETreeViewId) {
        this._set(DTOFIELD_PSDETREEVIEWID, pSDETreeViewId);
    }

    @JsonIgnore
    public String getPSDETreeViewId() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewIdDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public void resetPSDETreeViewId() {
        this._reset(DTOFIELD_PSDETREEVIEWID);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
        if (pSDETreeView == null) {
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        } else {
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    @JsonProperty(value="psdetreeviewname")
    public void setPSDETreeViewName(String pSDETreeViewName) {
        this._set(DTOFIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }

    @JsonIgnore
    public String getPSDETreeViewName() {
        Object objValue = this._get(DTOFIELD_PSDETREEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeViewNameDirty() {
        return this._contains(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public void resetPSDETreeViewName() {
        this._reset(DTOFIELD_PSDETREEVIEWNAME);
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
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
    public PSDETreeLogicDTO psdeuiactionid(String pSDEUIActionId) {
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction) {
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
    public PSDETreeLogicDTO psdeuiactionname(String pSDEUIActionName) {
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
    public PSDETreeLogicDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
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
    public PSDETreeLogicDTO pssyspfpluginname(String pSSysPFPluginName) {
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
    public PSDETreeLogicDTO pssysviewlogicid(String pSSysViewLogicId) {
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic) {
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
    public PSDETreeLogicDTO pssysviewlogicname(String pSSysViewLogicName) {
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
    public PSDETreeLogicDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
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
    public PSDETreeLogicDTO pssysviewpanelname(String pSSysViewPanelName) {
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
    public PSDETreeLogicDTO timer(Integer timer) {
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
    public PSDETreeLogicDTO triggertype(String triggerType) {
        this.setTriggerType(triggerType);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO triggertype(PSModelEnums.ViewLogicTrigger triggerType) {
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
    public PSDETreeLogicDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeLogicDTO updateman(String updateMan) {
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
    public PSDETreeLogicDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeLogicDTO usertag(String userTag) {
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
    public PSDETreeLogicDTO usertag2(String userTag2) {
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
    public PSDETreeLogicDTO usertag3(String userTag3) {
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
    public PSDETreeLogicDTO usertag4(String userTag4) {
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
    public PSDETreeLogicDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDETreeLogicDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeLogicId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeLogicId(strValue);
    }

    @JsonIgnore
    public PSDETreeLogicDTO id(String strValue) {
        this.setPSDETreeLogicId(strValue);
        return this;
    }
}
