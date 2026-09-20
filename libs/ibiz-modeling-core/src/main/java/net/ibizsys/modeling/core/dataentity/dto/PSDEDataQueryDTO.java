/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEDataQueryViewLevel
 *  net.ibizsys.model.PSModelEnums$DEExtendMode
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$RequestMethod
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMainStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataQueryDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_DQOPTION = "DQOPTION";
    protected static final String DTOFIELD_DQOPTION = "dqoption";
    public static final String FIELD_DQSN = "DQSN";
    protected static final String DTOFIELD_DQSN = "dqsn";
    public static final String FIELD_DQTAG = "DQTAG";
    protected static final String DTOFIELD_DQTAG = "dqtag";
    public static final String FIELD_DQTAG2 = "DQTAG2";
    protected static final String DTOFIELD_DQTAG2 = "dqtag2";
    public static final String FIELD_DQTAG3 = "DQTAG3";
    protected static final String DTOFIELD_DQTAG3 = "dqtag3";
    public static final String FIELD_DQTAG4 = "DQTAG4";
    protected static final String DTOFIELD_DQTAG4 = "dqtag4";
    public static final String FIELD_ENABLEPQL = "ENABLEPQL";
    protected static final String DTOFIELD_ENABLEPQL = "enablepql";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FILTERMODEL = "FILTERMODEL";
    protected static final String DTOFIELD_FILTERMODEL = "filtermodel";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PRIVMODE = "PRIVMODE";
    protected static final String DTOFIELD_PRIVMODE = "privmode";
    public static final String FIELD_PSDEDATAQUERYID = "PSDEDATAQUERYID";
    protected static final String DTOFIELD_PSDEDATAQUERYID = "psdedataqueryid";
    public static final String FIELD_PSDEDATAQUERYNAME = "PSDEDATAQUERYNAME";
    protected static final String DTOFIELD_PSDEDATAQUERYNAME = "psdedataqueryname";
    public static final String FIELD_PSDEFGROUPID = "PSDEFGROUPID";
    protected static final String DTOFIELD_PSDEFGROUPID = "psdefgroupid";
    public static final String FIELD_PSDEFGROUPNAME = "PSDEFGROUPNAME";
    protected static final String DTOFIELD_PSDEFGROUPNAME = "psdefgroupname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDEMAINSTATEID = "PSDEMAINSTATEID";
    protected static final String DTOFIELD_PSDEMAINSTATEID = "psdemainstateid";
    public static final String FIELD_PSDEMAINSTATENAME = "PSDEMAINSTATENAME";
    protected static final String DTOFIELD_PSDEMAINSTATENAME = "psdemainstatename";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PUBMODE = "PUBMODE";
    protected static final String DTOFIELD_PUBMODE = "pubmode";
    public static final String FIELD_QUERYVIEWFLAG = "QUERYVIEWFLAG";
    protected static final String DTOFIELD_QUERYVIEWFLAG = "queryviewflag";
    public static final String FIELD_REQUESTMETHOD = "REQUESTMETHOD";
    protected static final String DTOFIELD_REQUESTMETHOD = "requestmethod";
    public static final String FIELD_REQUESTPATH = "REQUESTPATH";
    protected static final String DTOFIELD_REQUESTPATH = "requestpath";
    public static final String FIELD_SERVICECODENAME = "SERVICECODENAME";
    protected static final String DTOFIELD_SERVICECODENAME = "servicecodename";
    public static final String FIELD_SUBSYSSADETAILMODE = "SUBSYSSADETAILMODE";
    protected static final String DTOFIELD_SUBSYSSADETAILMODE = "subsyssadetailmode";
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
    public static final String FIELD_VIEWCOLLEVEL = "VIEWCOLLEVEL";
    protected static final String DTOFIELD_VIEWCOLLEVEL = "viewcollevel";
    public static final String DTOFIELD_PSDEDQJOINS = "psdedqjoins";

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
    public PSDEDataQueryDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEDataQueryDTO createdate(Timestamp createDate) {
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
    public PSDEDataQueryDTO createman(String createMan) {
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
    public PSDEDataQueryDTO customcode(String customCode) {
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
    public PSDEDataQueryDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO custommode(Boolean customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEDataQueryDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="dqoption")
    public void setDQOption(Integer dQOption) {
        this._set(DTOFIELD_DQOPTION, dQOption);
    }

    @JsonIgnore
    public Integer getDQOption() {
        Object objValue = this._get(DTOFIELD_DQOPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDQOptionDirty() {
        return this._contains(DTOFIELD_DQOPTION);
    }

    @JsonIgnore
    public void resetDQOption() {
        this._reset(DTOFIELD_DQOPTION);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqoption(Integer dQOption) {
        this.setDQOption(dQOption);
        return this;
    }

    @JsonProperty(value="dqsn")
    public void setDQSN(String dQSN) {
        this._set(DTOFIELD_DQSN, dQSN);
    }

    @JsonIgnore
    public String getDQSN() {
        Object objValue = this._get(DTOFIELD_DQSN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDQSNDirty() {
        return this._contains(DTOFIELD_DQSN);
    }

    @JsonIgnore
    public void resetDQSN() {
        this._reset(DTOFIELD_DQSN);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqsn(String dQSN) {
        this.setDQSN(dQSN);
        return this;
    }

    @JsonProperty(value="dqtag")
    public void setDQTag(String dQTag) {
        this._set(DTOFIELD_DQTAG, dQTag);
    }

    @JsonIgnore
    public String getDQTag() {
        Object objValue = this._get(DTOFIELD_DQTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDQTagDirty() {
        return this._contains(DTOFIELD_DQTAG);
    }

    @JsonIgnore
    public void resetDQTag() {
        this._reset(DTOFIELD_DQTAG);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqtag(String dQTag) {
        this.setDQTag(dQTag);
        return this;
    }

    @JsonProperty(value="dqtag2")
    public void setDQTag2(String dQTag2) {
        this._set(DTOFIELD_DQTAG2, dQTag2);
    }

    @JsonIgnore
    public String getDQTag2() {
        Object objValue = this._get(DTOFIELD_DQTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDQTag2Dirty() {
        return this._contains(DTOFIELD_DQTAG2);
    }

    @JsonIgnore
    public void resetDQTag2() {
        this._reset(DTOFIELD_DQTAG2);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqtag2(String dQTag2) {
        this.setDQTag2(dQTag2);
        return this;
    }

    @JsonProperty(value="dqtag3")
    public void setDQTag3(String dQTag3) {
        this._set(DTOFIELD_DQTAG3, dQTag3);
    }

    @JsonIgnore
    public String getDQTag3() {
        Object objValue = this._get(DTOFIELD_DQTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDQTag3Dirty() {
        return this._contains(DTOFIELD_DQTAG3);
    }

    @JsonIgnore
    public void resetDQTag3() {
        this._reset(DTOFIELD_DQTAG3);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqtag3(String dQTag3) {
        this.setDQTag3(dQTag3);
        return this;
    }

    @JsonProperty(value="dqtag4")
    public void setDQTag4(String dQTag4) {
        this._set(DTOFIELD_DQTAG4, dQTag4);
    }

    @JsonIgnore
    public String getDQTag4() {
        Object objValue = this._get(DTOFIELD_DQTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDQTag4Dirty() {
        return this._contains(DTOFIELD_DQTAG4);
    }

    @JsonIgnore
    public void resetDQTag4() {
        this._reset(DTOFIELD_DQTAG4);
    }

    @JsonIgnore
    public PSDEDataQueryDTO dqtag4(String dQTag4) {
        this.setDQTag4(dQTag4);
        return this;
    }

    @JsonProperty(value="enablepql")
    public void setEnablePQL(Integer enablePQL) {
        this._set(DTOFIELD_ENABLEPQL, enablePQL);
    }

    @JsonIgnore
    public Integer getEnablePQL() {
        Object objValue = this._get(DTOFIELD_ENABLEPQL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePQLDirty() {
        return this._contains(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public void resetEnablePQL() {
        this._reset(DTOFIELD_ENABLEPQL);
    }

    @JsonIgnore
    public PSDEDataQueryDTO enablepql(Integer enablePQL) {
        this.setEnablePQL(enablePQL);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO enablepql(Boolean enablePQL) {
        if (enablePQL == null) {
            this.setEnablePQL(null);
        } else {
            this.setEnablePQL(enablePQL != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEDataQueryDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="filtermodel")
    public void setFilterModel(String filterModel) {
        this._set(DTOFIELD_FILTERMODEL, filterModel);
    }

    @JsonIgnore
    public String getFilterModel() {
        Object objValue = this._get(DTOFIELD_FILTERMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFilterModelDirty() {
        return this._contains(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public void resetFilterModel() {
        this._reset(DTOFIELD_FILTERMODEL);
    }

    @JsonIgnore
    public PSDEDataQueryDTO filtermodel(String filterModel) {
        this.setFilterModel(filterModel);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLogicNameDirty() {
        return this._contains(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public void resetLogicName() {
        this._reset(DTOFIELD_LOGICNAME);
    }

    @JsonIgnore
    public PSDEDataQueryDTO logicname(String logicName) {
        this.setLogicName(logicName);
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
    public PSDEDataQueryDTO memo(String memo) {
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
    public PSDEDataQueryDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="privmode")
    public void setPrivMode(Integer privMode) {
        this._set(DTOFIELD_PRIVMODE, privMode);
    }

    @JsonIgnore
    public Integer getPrivMode() {
        Object objValue = this._get(DTOFIELD_PRIVMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPrivModeDirty() {
        return this._contains(DTOFIELD_PRIVMODE);
    }

    @JsonIgnore
    public void resetPrivMode() {
        this._reset(DTOFIELD_PRIVMODE);
    }

    @JsonIgnore
    public PSDEDataQueryDTO privmode(Integer privMode) {
        this.setPrivMode(privMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO privmode(Boolean privMode) {
        if (privMode == null) {
            this.setPrivMode(null);
        } else {
            this.setPrivMode(privMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="psdedataqueryid")
    public void setPSDEDataQueryId(String pSDEDataQueryId) {
        this._set(DTOFIELD_PSDEDATAQUERYID, pSDEDataQueryId);
    }

    @JsonIgnore
    public String getPSDEDataQueryId() {
        Object objValue = this._get(DTOFIELD_PSDEDATAQUERYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataQueryIdDirty() {
        return this._contains(DTOFIELD_PSDEDATAQUERYID);
    }

    @JsonIgnore
    public void resetPSDEDataQueryId() {
        this._reset(DTOFIELD_PSDEDATAQUERYID);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdedataqueryid(String pSDEDataQueryId) {
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    @JsonProperty(value="psdedataqueryname")
    public void setPSDEDataQueryName(String pSDEDataQueryName) {
        this._set(DTOFIELD_PSDEDATAQUERYNAME, pSDEDataQueryName);
    }

    @JsonIgnore
    public String getPSDEDataQueryName() {
        Object objValue = this._get(DTOFIELD_PSDEDATAQUERYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataQueryNameDirty() {
        return this._contains(DTOFIELD_PSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public void resetPSDEDataQueryName() {
        this._reset(DTOFIELD_PSDEDATAQUERYNAME);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdedataqueryname(String pSDEDataQueryName) {
        this.setPSDEDataQueryName(pSDEDataQueryName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataQueryName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataQueryName(strName);
    }

    @JsonIgnore
    public PSDEDataQueryDTO name(String strName) {
        this.setPSDEDataQueryName(strName);
        return this;
    }

    @JsonProperty(value="psdefgroupid")
    public void setPSDEFGroupId(String pSDEFGroupId) {
        this._set(DTOFIELD_PSDEFGROUPID, pSDEFGroupId);
    }

    @JsonIgnore
    public String getPSDEFGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public void resetPSDEFGroupId() {
        this._reset(DTOFIELD_PSDEFGROUPID);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupid(String pSDEFGroupId) {
        this.setPSDEFGroupId(pSDEFGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupid(PSDEFGroupDTO pSDEFGroup) {
        if (pSDEFGroup == null) {
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
        } else {
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdefgroupname")
    public void setPSDEFGroupName(String pSDEFGroupName) {
        this._set(DTOFIELD_PSDEFGROUPNAME, pSDEFGroupName);
    }

    @JsonIgnore
    public String getPSDEFGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEFGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEFGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEFGroupName() {
        this._reset(DTOFIELD_PSDEFGROUPNAME);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupname(String pSDEFGroupName) {
        this.setPSDEFGroupName(pSDEFGroupName);
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
    public PSDEDataQueryDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstateid")
    public void setPSDEMainStateId(String pSDEMainStateId) {
        this._set(DTOFIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }

    @JsonIgnore
    public String getPSDEMainStateId() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateIdDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public void resetPSDEMainStateId() {
        this._reset(DTOFIELD_PSDEMAINSTATEID);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdemainstateid(String pSDEMainStateId) {
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdemainstateid(PSDEMainStateDTO pSDEMainState) {
        if (pSDEMainState == null) {
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        } else {
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    @JsonProperty(value="psdemainstatename")
    public void setPSDEMainStateName(String pSDEMainStateName) {
        this._set(DTOFIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }

    @JsonIgnore
    public String getPSDEMainStateName() {
        Object objValue = this._get(DTOFIELD_PSDEMAINSTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEMainStateNameDirty() {
        return this._contains(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public void resetPSDEMainStateName() {
        this._reset(DTOFIELD_PSDEMAINSTATENAME);
    }

    @JsonIgnore
    public PSDEDataQueryDTO psdemainstatename(String pSDEMainStateName) {
        this.setPSDEMainStateName(pSDEMainStateName);
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
    public PSDEDataQueryDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pubmode")
    public void setPubMode(Integer pubMode) {
        this._set(DTOFIELD_PUBMODE, pubMode);
    }

    @JsonIgnore
    public Integer getPubMode() {
        Object objValue = this._get(DTOFIELD_PUBMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPubModeDirty() {
        return this._contains(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public void resetPubMode() {
        this._reset(DTOFIELD_PUBMODE);
    }

    @JsonIgnore
    public PSDEDataQueryDTO pubmode(Integer pubMode) {
        this.setPubMode(pubMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO pubmode(Boolean pubMode) {
        if (pubMode == null) {
            this.setPubMode(null);
        } else {
            this.setPubMode(pubMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="queryviewflag")
    public void setQueryViewFlag(Integer queryViewFlag) {
        this._set(DTOFIELD_QUERYVIEWFLAG, queryViewFlag);
    }

    @JsonIgnore
    public Integer getQueryViewFlag() {
        Object objValue = this._get(DTOFIELD_QUERYVIEWFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isQueryViewFlagDirty() {
        return this._contains(DTOFIELD_QUERYVIEWFLAG);
    }

    @JsonIgnore
    public void resetQueryViewFlag() {
        this._reset(DTOFIELD_QUERYVIEWFLAG);
    }

    @JsonIgnore
    public PSDEDataQueryDTO queryviewflag(Integer queryViewFlag) {
        this.setQueryViewFlag(queryViewFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO queryviewflag(Boolean queryViewFlag) {
        if (queryViewFlag == null) {
            this.setQueryViewFlag(null);
        } else {
            this.setQueryViewFlag(queryViewFlag != false ? 1 : 0);
        }
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
    public PSDEDataQueryDTO requestmethod(String requestMethod) {
        this.setRequestMethod(requestMethod);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO requestmethod(PSModelEnums.RequestMethod requestMethod) {
        if (requestMethod == null) {
            this.setRequestMethod(null);
        } else {
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    @JsonProperty(value="requestpath")
    public void setRequestPath(String requestPath) {
        this._set(DTOFIELD_REQUESTPATH, requestPath);
    }

    @JsonIgnore
    public String getRequestPath() {
        Object objValue = this._get(DTOFIELD_REQUESTPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRequestPathDirty() {
        return this._contains(DTOFIELD_REQUESTPATH);
    }

    @JsonIgnore
    public void resetRequestPath() {
        this._reset(DTOFIELD_REQUESTPATH);
    }

    @JsonIgnore
    public PSDEDataQueryDTO requestpath(String requestPath) {
        this.setRequestPath(requestPath);
        return this;
    }

    @JsonProperty(value="servicecodename")
    public void setServiceCodeName(String serviceCodeName) {
        this._set(DTOFIELD_SERVICECODENAME, serviceCodeName);
    }

    @JsonIgnore
    public String getServiceCodeName() {
        Object objValue = this._get(DTOFIELD_SERVICECODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isServiceCodeNameDirty() {
        return this._contains(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public void resetServiceCodeName() {
        this._reset(DTOFIELD_SERVICECODENAME);
    }

    @JsonIgnore
    public PSDEDataQueryDTO servicecodename(String serviceCodeName) {
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    @JsonProperty(value="subsyssadetailmode")
    public void setSubSysSADetailMode(Integer subSysSADetailMode) {
        this._set(DTOFIELD_SUBSYSSADETAILMODE, subSysSADetailMode);
    }

    @JsonIgnore
    public Integer getSubSysSADetailMode() {
        Object objValue = this._get(DTOFIELD_SUBSYSSADETAILMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isSubSysSADetailModeDirty() {
        return this._contains(DTOFIELD_SUBSYSSADETAILMODE);
    }

    @JsonIgnore
    public void resetSubSysSADetailMode() {
        this._reset(DTOFIELD_SUBSYSSADETAILMODE);
    }

    @JsonIgnore
    public PSDEDataQueryDTO subsyssadetailmode(Integer subSysSADetailMode) {
        this.setSubSysSADetailMode(subSysSADetailMode);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO subsyssadetailmode(Boolean subSysSADetailMode) {
        if (subSysSADetailMode == null) {
            this.setSubSysSADetailMode(null);
        } else {
            this.setSubSysSADetailMode(subSysSADetailMode != false ? 1 : 0);
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
    public PSDEDataQueryDTO updatedate(Timestamp updateDate) {
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
    public PSDEDataQueryDTO updateman(String updateMan) {
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
    public PSDEDataQueryDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDataQueryDTO usertag(String userTag) {
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
    public PSDEDataQueryDTO usertag2(String userTag2) {
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
    public PSDEDataQueryDTO usertag3(String userTag3) {
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
    public PSDEDataQueryDTO usertag4(String userTag4) {
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
    public PSDEDataQueryDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewcollevel")
    public void setViewColLevel(Integer viewColLevel) {
        this._set(DTOFIELD_VIEWCOLLEVEL, viewColLevel);
    }

    @JsonIgnore
    public Integer getViewColLevel() {
        Object objValue = this._get(DTOFIELD_VIEWCOLLEVEL);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewColLevelDirty() {
        return this._contains(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public void resetViewColLevel() {
        this._reset(DTOFIELD_VIEWCOLLEVEL);
    }

    @JsonIgnore
    public PSDEDataQueryDTO viewcollevel(Integer viewColLevel) {
        this.setViewColLevel(viewColLevel);
        return this;
    }

    @JsonIgnore
    public PSDEDataQueryDTO viewcollevel(PSModelEnums.DEDataQueryViewLevel viewColLevel) {
        if (viewColLevel == null) {
            this.setViewColLevel(null);
        } else {
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataQueryId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataQueryId(strValue);
    }

    @JsonIgnore
    public PSDEDataQueryDTO id(String strValue) {
        this.setPSDEDataQueryId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDQJoinDTO> getPSDEDQJoins() {
        Object list = this._get(DTOFIELD_PSDEDQJOINS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedqjoins")
    public void setPSDEDQJoins(List<PSDEDQJoinDTO> psdedqjoins) {
        this._set(DTOFIELD_PSDEDQJOINS, psdedqjoins);
    }

    @JsonIgnore
    public List<PSDEDQJoinDTO> getPSDEDQJoinsIf() {
        Object list = this._get(DTOFIELD_PSDEDQJOINS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDQJOINS, list);
        }
        return (List) list;
    }
}
