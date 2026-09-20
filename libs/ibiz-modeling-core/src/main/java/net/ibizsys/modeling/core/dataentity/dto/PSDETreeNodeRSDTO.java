package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDETreeNodeRSDTO
extends PSModelDTOBase {
    public static final String FIELD_CHILDFILTER = "CHILDFILTER";
    protected static final String DTOFIELD_CHILDFILTER = "childfilter";
    public static final String FIELD_CPSDETREENODEID = "CPSDETREENODEID";
    protected static final String DTOFIELD_CPSDETREENODEID = "cpsdetreenodeid";
    public static final String FIELD_CPSDETREENODENAME = "CPSDETREENODENAME";
    protected static final String DTOFIELD_CPSDETREENODENAME = "cpsdetreenodename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSDETREENODEID = "PPSDETREENODEID";
    protected static final String DTOFIELD_PPSDETREENODEID = "ppsdetreenodeid";
    public static final String FIELD_PPSDETREENODENAME = "PPSDETREENODENAME";
    protected static final String DTOFIELD_PPSDETREENODENAME = "ppsdetreenodename";
    public static final String FIELD_PROCESSPARAM = "PROCESSPARAM";
    protected static final String DTOFIELD_PROCESSPARAM = "processparam";
    public static final String FIELD_PSDEACTIONID = "PSDEACTIONID";
    protected static final String DTOFIELD_PSDEACTIONID = "psdeactionid";
    public static final String FIELD_PSDEACTIONNAME = "PSDEACTIONNAME";
    protected static final String DTOFIELD_PSDEACTIONNAME = "psdeactionname";
    public static final String FIELD_PSDERID = "PSDERID";
    protected static final String DTOFIELD_PSDERID = "psderid";
    public static final String FIELD_PSDERNAME = "PSDERNAME";
    protected static final String DTOFIELD_PSDERNAME = "psdername";
    public static final String FIELD_PSDETREENODERSID = "PSDETREENODERSID";
    protected static final String DTOFIELD_PSDETREENODERSID = "psdetreenodersid";
    public static final String FIELD_PSDETREENODERSNAME = "PSDETREENODERSNAME";
    protected static final String DTOFIELD_PSDETREENODERSNAME = "psdetreenodersname";
    public static final String FIELD_PSDETREEVIEWID = "PSDETREEVIEWID";
    protected static final String DTOFIELD_PSDETREEVIEWID = "psdetreeviewid";
    public static final String FIELD_PSDETREEVIEWNAME = "PSDETREEVIEWNAME";
    protected static final String DTOFIELD_PSDETREEVIEWNAME = "psdetreeviewname";
    public static final String FIELD_PVALUELEVEL = "PVALUELEVEL";
    protected static final String DTOFIELD_PVALUELEVEL = "pvaluelevel";
    public static final String FIELD_SEARCHMODE = "SEARCHMODE";
    protected static final String DTOFIELD_SEARCHMODE = "searchmode";
    public static final String FIELD_TYPEFILTER = "TYPEFILTER";
    protected static final String DTOFIELD_TYPEFILTER = "typefilter";
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

    @JsonProperty(value="childfilter")
    public void setChildFilter(String childFilter) {
        this._set(DTOFIELD_CHILDFILTER, childFilter);
    }

    @JsonIgnore
    public String getChildFilter() {
        Object objValue = this._get(DTOFIELD_CHILDFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isChildFilterDirty() {
        return this._contains(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public void resetChildFilter() {
        this._reset(DTOFIELD_CHILDFILTER);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO childfilter(String childFilter) {
        this.setChildFilter(childFilter);
        return this;
    }

    @JsonProperty(value="cpsdetreenodeid")
    public void setCPSDETreeNodeId(String cPSDETreeNodeId) {
        this._set(DTOFIELD_CPSDETREENODEID, cPSDETreeNodeId);
    }

    @JsonIgnore
    public String getCPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_CPSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_CPSDETREENODEID);
    }

    @JsonIgnore
    public void resetCPSDETreeNodeId() {
        this._reset(DTOFIELD_CPSDETREENODEID);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO cpsdetreenodeid(String cPSDETreeNodeId) {
        this.setCPSDETreeNodeId(cPSDETreeNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO cpsdetreenodeid(PSDETreeNodeDTO pSDETreeNode) {
        if (pSDETreeNode == null) {
            this.setCPSDETreeNodeId(null);
            this.setCPSDETreeNodeName(null);
        } else {
            this.setCPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setCPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    @JsonProperty(value="cpsdetreenodename")
    public void setCPSDETreeNodeName(String cPSDETreeNodeName) {
        this._set(DTOFIELD_CPSDETREENODENAME, cPSDETreeNodeName);
    }

    @JsonIgnore
    public String getCPSDETreeNodeName() {
        Object objValue = this._get(DTOFIELD_CPSDETREENODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCPSDETreeNodeNameDirty() {
        return this._contains(DTOFIELD_CPSDETREENODENAME);
    }

    @JsonIgnore
    public void resetCPSDETreeNodeName() {
        this._reset(DTOFIELD_CPSDETREENODENAME);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO cpsdetreenodename(String cPSDETreeNodeName) {
        this.setCPSDETreeNodeName(cPSDETreeNodeName);
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
    public PSDETreeNodeRSDTO createdate(Timestamp createDate) {
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
    public PSDETreeNodeRSDTO createman(String createMan) {
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
    public PSDETreeNodeRSDTO customcode(String customCode) {
        this.setCustomCode(customCode);
        return this;
    }

    @JsonProperty(value="custommode")
    public void setCustomMode(Integer customMode) {
        this._set(DTOFIELD_CUSTOMMODE, customMode);
    }

    @JsonIgnore
    public Integer getCustomMode() {
        Object objValue = this._get(DTOFIELD_CUSTOMMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCustomModeDirty() {
        return this._contains(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public void resetCustomMode() {
        this._reset(DTOFIELD_CUSTOMMODE);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
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
    public PSDETreeNodeRSDTO memo(String memo) {
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
    public PSDETreeNodeRSDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsdetreenodeid")
    public void setPPSDETreeNodeId(String pPSDETreeNodeId) {
        this._set(DTOFIELD_PPSDETREENODEID, pPSDETreeNodeId);
    }

    @JsonIgnore
    public String getPPSDETreeNodeId() {
        Object objValue = this._get(DTOFIELD_PPSDETREENODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDETreeNodeIdDirty() {
        return this._contains(DTOFIELD_PPSDETREENODEID);
    }

    @JsonIgnore
    public void resetPPSDETreeNodeId() {
        this._reset(DTOFIELD_PPSDETREENODEID);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO ppsdetreenodeid(String pPSDETreeNodeId) {
        this.setPPSDETreeNodeId(pPSDETreeNodeId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO ppsdetreenodeid(PSDETreeNodeDTO pSDETreeNode) {
        if (pSDETreeNode == null) {
            this.setPPSDETreeNodeId(null);
            this.setPPSDETreeNodeName(null);
        } else {
            this.setPPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    @JsonProperty(value="ppsdetreenodename")
    public void setPPSDETreeNodeName(String pPSDETreeNodeName) {
        this._set(DTOFIELD_PPSDETREENODENAME, pPSDETreeNodeName);
    }

    @JsonIgnore
    public String getPPSDETreeNodeName() {
        Object objValue = this._get(DTOFIELD_PPSDETREENODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDETreeNodeNameDirty() {
        return this._contains(DTOFIELD_PPSDETREENODENAME);
    }

    @JsonIgnore
    public void resetPPSDETreeNodeName() {
        this._reset(DTOFIELD_PPSDETREENODENAME);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO ppsdetreenodename(String pPSDETreeNodeName) {
        this.setPPSDETreeNodeName(pPSDETreeNodeName);
        return this;
    }

    @JsonProperty(value="processparam")
    public void setProcessParam(String processParam) {
        this._set(DTOFIELD_PROCESSPARAM, processParam);
    }

    @JsonIgnore
    public String getProcessParam() {
        Object objValue = this._get(DTOFIELD_PROCESSPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isProcessParamDirty() {
        return this._contains(DTOFIELD_PROCESSPARAM);
    }

    @JsonIgnore
    public void resetProcessParam() {
        this._reset(DTOFIELD_PROCESSPARAM);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO processparam(String processParam) {
        this.setProcessParam(processParam);
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
    public PSDETreeNodeRSDTO psdeactionid(String pSDEActionId) {
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psdeactionid(PSDEActionDTO pSDEAction) {
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
    public PSDETreeNodeRSDTO psdeactionname(String pSDEActionName) {
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonProperty(value="psderid")
    public void setPSDERId(String pSDERId) {
        this._set(DTOFIELD_PSDERID, pSDERId);
    }

    @JsonIgnore
    public String getPSDERId() {
        Object objValue = this._get(DTOFIELD_PSDERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERIdDirty() {
        return this._contains(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public void resetPSDERId() {
        this._reset(DTOFIELD_PSDERID);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psderid(String pSDERId) {
        this.setPSDERId(pSDERId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psderid(PSDERDTO pSDER) {
        if (pSDER == null) {
            this.setPSDERId(null);
            this.setPSDERName(null);
        } else {
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    @JsonProperty(value="psdername")
    public void setPSDERName(String pSDERName) {
        this._set(DTOFIELD_PSDERNAME, pSDERName);
    }

    @JsonIgnore
    public String getPSDERName() {
        Object objValue = this._get(DTOFIELD_PSDERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDERNameDirty() {
        return this._contains(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public void resetPSDERName() {
        this._reset(DTOFIELD_PSDERNAME);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psdername(String pSDERName) {
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonProperty(value="psdetreenodersid")
    public void setPSDETreeNodeRSId(String pSDETreeNodeRSId) {
        this._set(DTOFIELD_PSDETREENODERSID, pSDETreeNodeRSId);
    }

    @JsonIgnore
    public String getPSDETreeNodeRSId() {
        Object objValue = this._get(DTOFIELD_PSDETREENODERSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeRSIdDirty() {
        return this._contains(DTOFIELD_PSDETREENODERSID);
    }

    @JsonIgnore
    public void resetPSDETreeNodeRSId() {
        this._reset(DTOFIELD_PSDETREENODERSID);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psdetreenodersid(String pSDETreeNodeRSId) {
        this.setPSDETreeNodeRSId(pSDETreeNodeRSId);
        return this;
    }

    @JsonProperty(value="psdetreenodersname")
    public void setPSDETreeNodeRSName(String pSDETreeNodeRSName) {
        this._set(DTOFIELD_PSDETREENODERSNAME, pSDETreeNodeRSName);
    }

    @JsonIgnore
    public String getPSDETreeNodeRSName() {
        Object objValue = this._get(DTOFIELD_PSDETREENODERSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDETreeNodeRSNameDirty() {
        return this._contains(DTOFIELD_PSDETREENODERSNAME);
    }

    @JsonIgnore
    public void resetPSDETreeNodeRSName() {
        this._reset(DTOFIELD_PSDETREENODERSNAME);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psdetreenodersname(String pSDETreeNodeRSName) {
        this.setPSDETreeNodeRSName(pSDETreeNodeRSName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDETreeNodeRSName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDETreeNodeRSName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO name(String strName) {
        this.setPSDETreeNodeRSName(strName);
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
    public PSDETreeNodeRSDTO psdetreeviewid(String pSDETreeViewId) {
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView) {
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
    public PSDETreeNodeRSDTO psdetreeviewname(String pSDETreeViewName) {
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    @JsonProperty(value="pvaluelevel")
    public void setPValueLevel(Integer pValueLevel) {
        this._set(DTOFIELD_PVALUELEVEL, pValueLevel);
    }

    @JsonIgnore
    public Integer getPValueLevel() {
        Object objValue = this._get(DTOFIELD_PVALUELEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPValueLevelDirty() {
        return this._contains(DTOFIELD_PVALUELEVEL);
    }

    @JsonIgnore
    public void resetPValueLevel() {
        this._reset(DTOFIELD_PVALUELEVEL);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO pvaluelevel(Integer pValueLevel) {
        this.setPValueLevel(pValueLevel);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO pvaluelevel(PSModelEnums.TreeNodeRSPValueLevel pValueLevel) {
        if (pValueLevel == null) {
            this.setPValueLevel(null);
        } else {
            this.setPValueLevel(pValueLevel.value);
        }
        return this;
    }

    @JsonProperty(value="searchmode")
    public void setSearchMode(Integer searchMode) {
        this._set(DTOFIELD_SEARCHMODE, searchMode);
    }

    @JsonIgnore
    public Integer getSearchMode() {
        Object objValue = this._get(DTOFIELD_SEARCHMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSearchModeDirty() {
        return this._contains(DTOFIELD_SEARCHMODE);
    }

    @JsonIgnore
    public void resetSearchMode() {
        this._reset(DTOFIELD_SEARCHMODE);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO searchmode(Integer searchMode) {
        this.setSearchMode(searchMode);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO searchmode(PSModelEnums.TreeNodeRSSearchMode searchMode) {
        if (searchMode == null) {
            this.setSearchMode(null);
        } else {
            this.setSearchMode(searchMode.value);
        }
        return this;
    }

    @JsonProperty(value="typefilter")
    public void setTypeFilter(String typeFilter) {
        this._set(DTOFIELD_TYPEFILTER, typeFilter);
    }

    @JsonIgnore
    public String getTypeFilter() {
        Object objValue = this._get(DTOFIELD_TYPEFILTER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypeFilterDirty() {
        return this._contains(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public void resetTypeFilter() {
        this._reset(DTOFIELD_TYPEFILTER);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO typefilter(String typeFilter) {
        this.setTypeFilter(typeFilter);
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
    public PSDETreeNodeRSDTO updatedate(Timestamp updateDate) {
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
    public PSDETreeNodeRSDTO updateman(String updateMan) {
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
    public PSDETreeNodeRSDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDETreeNodeRSDTO usertag(String userTag) {
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
    public PSDETreeNodeRSDTO usertag2(String userTag2) {
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
    public PSDETreeNodeRSDTO usertag3(String userTag3) {
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
    public PSDETreeNodeRSDTO usertag4(String userTag4) {
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
    public PSDETreeNodeRSDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDETreeNodeRSId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDETreeNodeRSId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeRSDTO id(String strValue) {
        this.setPSDETreeNodeRSId(strValue);
        return this;
    }
}
