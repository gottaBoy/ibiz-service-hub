package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDELogicLinkDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEBUGMODE = "DEBUGMODE";
    protected static final String DTOFIELD_DEBUGMODE = "debugmode";
    public static final String FIELD_DEFAULTLINK = "DEFAULTLINK";
    protected static final String DTOFIELD_DEFAULTLINK = "defaultlink";
    public static final String FIELD_DSTENDPOINT = "DSTENDPOINT";
    protected static final String DTOFIELD_DSTENDPOINT = "dstendpoint";
    public static final String FIELD_DSTPSDELOGICNODEID = "DSTPSDELOGICNODEID";
    protected static final String DTOFIELD_DSTPSDELOGICNODEID = "dstpsdelogicnodeid";
    public static final String FIELD_DSTPSDELOGICNODENAME = "DSTPSDELOGICNODENAME";
    protected static final String DTOFIELD_DSTPSDELOGICNODENAME = "dstpsdelogicnodename";
    public static final String FIELD_DSTPSDLPARAMID = "DSTPSDLPARAMID";
    protected static final String DTOFIELD_DSTPSDLPARAMID = "dstpsdlparamid";
    public static final String FIELD_DSTPSDLPARAMNAME = "DSTPSDLPARAMNAME";
    protected static final String DTOFIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";
    public static final String FIELD_LINKCOND = "LINKCOND";
    protected static final String DTOFIELD_LINKCOND = "linkcond";
    public static final String FIELD_LINKCOND2 = "LINKCOND2";
    protected static final String DTOFIELD_LINKCOND2 = "linkcond2";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDELOGICID = "PSDELOGICID";
    protected static final String DTOFIELD_PSDELOGICID = "psdelogicid";
    public static final String FIELD_PSDELOGICLINKID = "PSDELOGICLINKID";
    protected static final String DTOFIELD_PSDELOGICLINKID = "psdelogiclinkid";
    public static final String FIELD_PSDELOGICLINKNAME = "PSDELOGICLINKNAME";
    protected static final String DTOFIELD_PSDELOGICLINKNAME = "psdelogiclinkname";
    public static final String FIELD_PSDELOGICNAME = "PSDELOGICNAME";
    protected static final String DTOFIELD_PSDELOGICNAME = "psdelogicname";
    public static final String FIELD_SHAPEPARAMS = "SHAPEPARAMS";
    protected static final String DTOFIELD_SHAPEPARAMS = "shapeparams";
    public static final String FIELD_SRCENDPOINT = "SRCENDPOINT";
    protected static final String DTOFIELD_SRCENDPOINT = "srcendpoint";
    public static final String FIELD_SRCPSDELOGICNODEID = "SRCPSDELOGICNODEID";
    protected static final String DTOFIELD_SRCPSDELOGICNODEID = "srcpsdelogicnodeid";
    public static final String FIELD_SRCPSDELOGICNODENAME = "SRCPSDELOGICNODENAME";
    protected static final String DTOFIELD_SRCPSDELOGICNODENAME = "srcpsdelogicnodename";
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
    public PSDELogicLinkDTO createdate(Timestamp createDate) {
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
    public PSDELogicLinkDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="debugmode")
    public void setDebugMode(Integer debugMode) {
        this._set(DTOFIELD_DEBUGMODE, debugMode);
    }

    @JsonIgnore
    public Integer getDebugMode() {
        Object objValue = this._get(DTOFIELD_DEBUGMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDebugModeDirty() {
        return this._contains(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public void resetDebugMode() {
        this._reset(DTOFIELD_DEBUGMODE);
    }

    @JsonIgnore
    public PSDELogicLinkDTO debugmode(Integer debugMode) {
        this.setDebugMode(debugMode);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO debugmode(PSModelEnums.DELogicDebugMode debugMode) {
        if (debugMode == null) {
            this.setDebugMode(null);
        } else {
            this.setDebugMode(debugMode.value);
        }
        return this;
    }

    @JsonProperty(value="defaultlink")
    public void setDefaultLink(Integer defaultLink) {
        this._set(DTOFIELD_DEFAULTLINK, defaultLink);
    }

    @JsonIgnore
    public Integer getDefaultLink() {
        Object objValue = this._get(DTOFIELD_DEFAULTLINK);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultLinkDirty() {
        return this._contains(DTOFIELD_DEFAULTLINK);
    }

    @JsonIgnore
    public void resetDefaultLink() {
        this._reset(DTOFIELD_DEFAULTLINK);
    }

    @JsonIgnore
    public PSDELogicLinkDTO defaultlink(Integer defaultLink) {
        this.setDefaultLink(defaultLink);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO defaultlink(Boolean defaultLink) {
        if (defaultLink == null) {
            this.setDefaultLink(null);
        } else {
            this.setDefaultLink(defaultLink != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dstendpoint")
    public void setDstEndPoint(String dstEndPoint) {
        this._set(DTOFIELD_DSTENDPOINT, dstEndPoint);
    }

    @JsonIgnore
    public String getDstEndPoint() {
        Object objValue = this._get(DTOFIELD_DSTENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstEndPointDirty() {
        return this._contains(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public void resetDstEndPoint() {
        this._reset(DTOFIELD_DSTENDPOINT);
    }

    @JsonIgnore
    public PSDELogicLinkDTO dstendpoint(String dstEndPoint) {
        this.setDstEndPoint(dstEndPoint);
        return this;
    }

    @JsonProperty(value="dstpsdelogicnodeid")
    public void setDstPSDELogicNodeId(String dstPSDELogicNodeId) {
        this._set(DTOFIELD_DSTPSDELOGICNODEID, dstPSDELogicNodeId);
    }

    @JsonIgnore
    public String getDstPSDELogicNodeId() {
        Object objValue = this._get(DTOFIELD_DSTPSDELOGICNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDELogicNodeIdDirty() {
        return this._contains(DTOFIELD_DSTPSDELOGICNODEID);
    }

    @JsonIgnore
    public void resetDstPSDELogicNodeId() {
        this._reset(DTOFIELD_DSTPSDELOGICNODEID);
    }

    @JsonIgnore
    public PSDELogicLinkDTO dstpsdelogicnodeid(String dstPSDELogicNodeId) {
        this.setDstPSDELogicNodeId(dstPSDELogicNodeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO dstpsdelogicnodeid(PSDELogicNodeDTO pSDELogicNode) {
        if (pSDELogicNode == null) {
            this.setDstPSDELogicNodeId(null);
            this.setDstPSDELogicNodeName(null);
        } else {
            this.setDstPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setDstPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    @JsonProperty(value="dstpsdelogicnodename")
    public void setDstPSDELogicNodeName(String dstPSDELogicNodeName) {
        this._set(DTOFIELD_DSTPSDELOGICNODENAME, dstPSDELogicNodeName);
    }

    @JsonIgnore
    public String getDstPSDELogicNodeName() {
        Object objValue = this._get(DTOFIELD_DSTPSDELOGICNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDstPSDELogicNodeNameDirty() {
        return this._contains(DTOFIELD_DSTPSDELOGICNODENAME);
    }

    @JsonIgnore
    public void resetDstPSDELogicNodeName() {
        this._reset(DTOFIELD_DSTPSDELOGICNODENAME);
    }

    @JsonIgnore
    public PSDELogicLinkDTO dstpsdelogicnodename(String dstPSDELogicNodeName) {
        this.setDstPSDELogicNodeName(dstPSDELogicNodeName);
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
    public PSDELogicLinkDTO dstpsdlparamid(String dstPSDLParamId) {
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO dstpsdlparamid(PSDELogicParamDTO pSDELogicParam) {
        if (pSDELogicParam == null) {
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        } else {
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
    public PSDELogicLinkDTO dstpsdlparamname(String dstPSDLParamName) {
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    @JsonProperty(value="linkcond")
    public void setLinkCond(String linkCond) {
        this._set(DTOFIELD_LINKCOND, linkCond);
    }

    @JsonIgnore
    public String getLinkCond() {
        Object objValue = this._get(DTOFIELD_LINKCOND);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkCondDirty() {
        return this._contains(DTOFIELD_LINKCOND);
    }

    @JsonIgnore
    public void resetLinkCond() {
        this._reset(DTOFIELD_LINKCOND);
    }

    @JsonIgnore
    public PSDELogicLinkDTO linkcond(String linkCond) {
        this.setLinkCond(linkCond);
        return this;
    }

    @JsonProperty(value="linkcond2")
    public void setLinkCond2(String linkCond2) {
        this._set(DTOFIELD_LINKCOND2, linkCond2);
    }

    @JsonIgnore
    public String getLinkCond2() {
        Object objValue = this._get(DTOFIELD_LINKCOND2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkCond2Dirty() {
        return this._contains(DTOFIELD_LINKCOND2);
    }

    @JsonIgnore
    public void resetLinkCond2() {
        this._reset(DTOFIELD_LINKCOND2);
    }

    @JsonIgnore
    public PSDELogicLinkDTO linkcond2(String linkCond2) {
        this.setLinkCond2(linkCond2);
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
    public PSDELogicLinkDTO memo(String memo) {
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
    public PSDELogicLinkDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
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
    public PSDELogicLinkDTO psdelogicid(String pSDELogicId) {
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO psdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        } else {
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
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
    public PSDELogicLinkDTO psdelogiclinkid(String pSDELogicLinkId) {
        this.setPSDELogicLinkId(pSDELogicLinkId);
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
    public PSDELogicLinkDTO psdelogiclinkname(String pSDELogicLinkName) {
        this.setPSDELogicLinkName(pSDELogicLinkName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDELogicLinkName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDELogicLinkName(strName);
    }

    @JsonIgnore
    public PSDELogicLinkDTO name(String strName) {
        this.setPSDELogicLinkName(strName);
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
    public PSDELogicLinkDTO psdelogicname(String pSDELogicName) {
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonProperty(value="shapeparams")
    public void setShapeParams(String shapeParams) {
        this._set(DTOFIELD_SHAPEPARAMS, shapeParams);
    }

    @JsonIgnore
    public String getShapeParams() {
        Object objValue = this._get(DTOFIELD_SHAPEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isShapeParamsDirty() {
        return this._contains(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public void resetShapeParams() {
        this._reset(DTOFIELD_SHAPEPARAMS);
    }

    @JsonIgnore
    public PSDELogicLinkDTO shapeparams(String shapeParams) {
        this.setShapeParams(shapeParams);
        return this;
    }

    @JsonProperty(value="srcendpoint")
    public void setSrcEndPoint(String srcEndPoint) {
        this._set(DTOFIELD_SRCENDPOINT, srcEndPoint);
    }

    @JsonIgnore
    public String getSrcEndPoint() {
        Object objValue = this._get(DTOFIELD_SRCENDPOINT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcEndPointDirty() {
        return this._contains(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public void resetSrcEndPoint() {
        this._reset(DTOFIELD_SRCENDPOINT);
    }

    @JsonIgnore
    public PSDELogicLinkDTO srcendpoint(String srcEndPoint) {
        this.setSrcEndPoint(srcEndPoint);
        return this;
    }

    @JsonProperty(value="srcpsdelogicnodeid")
    public void setSrcPSDELogicNodeId(String srcPSDELogicNodeId) {
        this._set(DTOFIELD_SRCPSDELOGICNODEID, srcPSDELogicNodeId);
    }

    @JsonIgnore
    public String getSrcPSDELogicNodeId() {
        Object objValue = this._get(DTOFIELD_SRCPSDELOGICNODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDELogicNodeIdDirty() {
        return this._contains(DTOFIELD_SRCPSDELOGICNODEID);
    }

    @JsonIgnore
    public void resetSrcPSDELogicNodeId() {
        this._reset(DTOFIELD_SRCPSDELOGICNODEID);
    }

    @JsonIgnore
    public PSDELogicLinkDTO srcpsdelogicnodeid(String srcPSDELogicNodeId) {
        this.setSrcPSDELogicNodeId(srcPSDELogicNodeId);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO srcpsdelogicnodeid(PSDELogicNodeDTO pSDELogicNode) {
        if (pSDELogicNode == null) {
            this.setSrcPSDELogicNodeId(null);
            this.setSrcPSDELogicNodeName(null);
        } else {
            this.setSrcPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setSrcPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    @JsonProperty(value="srcpsdelogicnodename")
    public void setSrcPSDELogicNodeName(String srcPSDELogicNodeName) {
        this._set(DTOFIELD_SRCPSDELOGICNODENAME, srcPSDELogicNodeName);
    }

    @JsonIgnore
    public String getSrcPSDELogicNodeName() {
        Object objValue = this._get(DTOFIELD_SRCPSDELOGICNODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSrcPSDELogicNodeNameDirty() {
        return this._contains(DTOFIELD_SRCPSDELOGICNODENAME);
    }

    @JsonIgnore
    public void resetSrcPSDELogicNodeName() {
        this._reset(DTOFIELD_SRCPSDELOGICNODENAME);
    }

    @JsonIgnore
    public PSDELogicLinkDTO srcpsdelogicnodename(String srcPSDELogicNodeName) {
        this.setSrcPSDELogicNodeName(srcPSDELogicNodeName);
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
    public PSDELogicLinkDTO updatedate(Timestamp updateDate) {
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
    public PSDELogicLinkDTO updateman(String updateMan) {
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
    public PSDELogicLinkDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDELogicLinkDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDELogicLinkDTO usertag(String userTag) {
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
    public PSDELogicLinkDTO usertag2(String userTag2) {
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
    public PSDELogicLinkDTO usertag3(String userTag3) {
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
    public PSDELogicLinkDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDELogicLinkId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDELogicLinkId(strValue);
    }

    @JsonIgnore
    public PSDELogicLinkDTO id(String strValue) {
        this.setPSDELogicLinkId(strValue);
        return this;
    }

    @JsonIgnore
    public List<Object> getPSDELLConds() {
        Object list = this._get(DTOFIELD_PSDELLCONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdellconds")
    public void setPSDELLConds(List<Object> psdellconds) {
        this._set(DTOFIELD_PSDELLCONDS, psdellconds);
    }

    @JsonIgnore
    public List<Object> getPSDELLCondsIf() {
        Object list = this._get(DTOFIELD_PSDELLCONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDELLCONDS, list);
        }
        return (List) list;
    }
}
