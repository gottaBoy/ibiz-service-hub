package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDevSlnSysDynaInstDTO extends PSModelDTOBase {
    public static final String FIELD_CFGPSDEVCENTERSVNID = "CFGPSDEVCENTERSVNID";
    protected static final String DTOFIELD_CFGPSDEVCENTERSVNID = "cfgpsdevcentersvnid";
    public static final String FIELD_CFGPSDEVCENTERSVNNAME = "CFGPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_CFGPSDEVCENTERSVNNAME = "cfgpsdevcentersvnname";
    public static final String FIELD_COLOR = "COLOR";
    protected static final String DTOFIELD_COLOR = "color";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXPRIEDTIME = "EXPRIEDTIME";
    protected static final String DTOFIELD_EXPRIEDTIME = "expriedtime";
    public static final String FIELD_INSTMODELPATH = "INSTMODELPATH";
    protected static final String DTOFIELD_INSTMODELPATH = "instmodelpath";
    public static final String FIELD_INSTSTATE = "INSTSTATE";
    protected static final String DTOFIELD_INSTSTATE = "inststate";
    public static final String FIELD_INSTTAG = "INSTTAG";
    protected static final String DTOFIELD_INSTTAG = "insttag";
    public static final String FIELD_INSTTAG2 = "INSTTAG2";
    protected static final String DTOFIELD_INSTTAG2 = "insttag2";
    public static final String FIELD_INSTTAG3 = "INSTTAG3";
    protected static final String DTOFIELD_INSTTAG3 = "insttag3";
    public static final String FIELD_INSTTAG4 = "INSTTAG4";
    protected static final String DTOFIELD_INSTTAG4 = "insttag4";
    public static final String FIELD_INSTTAG5 = "INSTTAG5";
    protected static final String DTOFIELD_INSTTAG5 = "insttag5";
    public static final String FIELD_INSTTAG6 = "INSTTAG6";
    protected static final String DTOFIELD_INSTTAG6 = "insttag6";
    public static final String FIELD_INSTTAG7 = "INSTTAG7";
    protected static final String DTOFIELD_INSTTAG7 = "insttag7";
    public static final String FIELD_INSTTAG8 = "INSTTAG8";
    protected static final String DTOFIELD_INSTTAG8 = "insttag8";
    public static final String FIELD_INSTTYPE = "INSTTYPE";
    protected static final String DTOFIELD_INSTTYPE = "insttype";
    public static final String FIELD_INSTVER = "INSTVER";
    protected static final String DTOFIELD_INSTVER = "instver";
    public static final String FIELD_LASTCHECKINTIME = "LASTCHECKINTIME";
    protected static final String DTOFIELD_LASTCHECKINTIME = "lastcheckintime";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MODELPSDEVCENTERSVNID = "MODELPSDEVCENTERSVNID";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNID = "modelpsdevcentersvnid";
    public static final String FIELD_MODELPSDEVCENTERSVNNAME = "MODELPSDEVCENTERSVNNAME";
    protected static final String DTOFIELD_MODELPSDEVCENTERSVNNAME = "modelpsdevcentersvnname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PINSTMODELPATH = "PINSTMODELPATH";
    protected static final String DTOFIELD_PINSTMODELPATH = "pinstmodelpath";
    public static final String FIELD_PPSDEVSLNSYSDYNAINSTID = "PPSDEVSLNSYSDYNAINSTID";
    protected static final String DTOFIELD_PPSDEVSLNSYSDYNAINSTID = "ppsdevslnsysdynainstid";
    public static final String FIELD_PPSDEVSLNSYSDYNAINSTNAME = "PPSDEVSLNSYSDYNAINSTNAME";
    protected static final String DTOFIELD_PPSDEVSLNSYSDYNAINSTNAME = "ppsdevslnsysdynainstname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_PSDEVSLNSYSDEPINSTID = "PSDEVSLNSYSDEPINSTID";
    protected static final String DTOFIELD_PSDEVSLNSYSDEPINSTID = "psdevslnsysdepinstid";
    public static final String FIELD_PSDEVSLNSYSDEPINSTNAME = "PSDEVSLNSYSDEPINSTNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSDEPINSTNAME = "psdevslnsysdepinstname";
    public static final String FIELD_PSDEVSLNSYSDYNAINSTID = "PSDEVSLNSYSDYNAINSTID";
    protected static final String DTOFIELD_PSDEVSLNSYSDYNAINSTID = "psdevslnsysdynainstid";
    public static final String FIELD_PSDEVSLNSYSDYNAINSTNAME = "PSDEVSLNSYSDYNAINSTNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSDYNAINSTNAME = "psdevslnsysdynainstname";
    public static final String FIELD_PSDEVSLNSYSID = "PSDEVSLNSYSID";
    protected static final String DTOFIELD_PSDEVSLNSYSID = "psdevslnsysid";
    public static final String FIELD_PSDEVSLNSYSNAME = "PSDEVSLNSYSNAME";
    protected static final String DTOFIELD_PSDEVSLNSYSNAME = "psdevslnsysname";
    public static final String FIELD_REFUPDATEDATE = "REFUPDATEDATE";
    protected static final String DTOFIELD_REFUPDATEDATE = "refupdatedate";
    public static final String FIELD_ROOTINSTMODELPATH = "ROOTINSTMODELPATH";
    protected static final String DTOFIELD_ROOTINSTMODELPATH = "rootinstmodelpath";
    public static final String FIELD_SYSMODELPATH = "SYSMODELPATH";
    protected static final String DTOFIELD_SYSMODELPATH = "sysmodelpath";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";

    @JsonProperty(value="cfgpsdevcentersvnid")
    public void setCfgPSDevCenterSVNId(String cfgPSDevCenterSVNId) {
        this._set(DTOFIELD_CFGPSDEVCENTERSVNID, cfgPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getCfgPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_CFGPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_CFGPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetCfgPSDevCenterSVNId() {
        this._reset(DTOFIELD_CFGPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO cfgpsdevcentersvnid(String cfgPSDevCenterSVNId) {
        this.setCfgPSDevCenterSVNId(cfgPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO cfgpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setCfgPSDevCenterSVNId(null);
            this.setCfgPSDevCenterSVNName(null);
        } else {
            this.setCfgPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setCfgPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="cfgpsdevcentersvnname")
    public void setCfgPSDevCenterSVNName(String cfgPSDevCenterSVNName) {
        this._set(DTOFIELD_CFGPSDEVCENTERSVNNAME, cfgPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getCfgPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_CFGPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCfgPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_CFGPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetCfgPSDevCenterSVNName() {
        this._reset(DTOFIELD_CFGPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO cfgpsdevcentersvnname(String cfgPSDevCenterSVNName) {
        this.setCfgPSDevCenterSVNName(cfgPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="color")
    public void setColor(String color) {
        this._set(DTOFIELD_COLOR, color);
    }

    @JsonIgnore
    public String getColor() {
        Object objValue = this._get(DTOFIELD_COLOR);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isColorDirty() {
        return this._contains(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public void resetColor() {
        this._reset(DTOFIELD_COLOR);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO color(String color) {
        this.setColor(color);
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO createdate(Timestamp createDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="expriedtime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setExpriedTime(Timestamp expriedTime) {
        this._set(DTOFIELD_EXPRIEDTIME, expriedTime);
    }

    @JsonIgnore
    public Timestamp getExpriedTime() {
        Object objValue = this._get(DTOFIELD_EXPRIEDTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isExpriedTimeDirty() {
        return this._contains(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public void resetExpriedTime() {
        this._reset(DTOFIELD_EXPRIEDTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO expriedtime(Timestamp expriedTime) {
        this.setExpriedTime(expriedTime);
        return this;
    }

    @JsonProperty(value="instmodelpath")
    public void setInstModelPath(String instModelPath) {
        this._set(DTOFIELD_INSTMODELPATH, instModelPath);
    }

    @JsonIgnore
    public String getInstModelPath() {
        Object objValue = this._get(DTOFIELD_INSTMODELPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstModelPathDirty() {
        return this._contains(DTOFIELD_INSTMODELPATH);
    }

    @JsonIgnore
    public void resetInstModelPath() {
        this._reset(DTOFIELD_INSTMODELPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO instmodelpath(String instModelPath) {
        this.setInstModelPath(instModelPath);
        return this;
    }

    @JsonProperty(value="inststate")
    public void setInstState(Integer instState) {
        this._set(DTOFIELD_INSTSTATE, instState);
    }

    @JsonIgnore
    public Integer getInstState() {
        Object objValue = this._get(DTOFIELD_INSTSTATE);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInstStateDirty() {
        return this._contains(DTOFIELD_INSTSTATE);
    }

    @JsonIgnore
    public void resetInstState() {
        this._reset(DTOFIELD_INSTSTATE);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO inststate(Integer instState) {
        this.setInstState(instState);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO inststate(PSModelEnums.DevSysState instState) {
        this.setInstState(instState == null ? null : instState.value);
        return this;
    }

    @JsonProperty(value="insttag")
    public void setInstTag(String instTag) {
        this._set(DTOFIELD_INSTTAG, instTag);
    }

    @JsonIgnore
    public String getInstTag() {
        Object objValue = this._get(DTOFIELD_INSTTAG);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTagDirty() {
        return this._contains(DTOFIELD_INSTTAG);
    }

    @JsonIgnore
    public void resetInstTag() {
        this._reset(DTOFIELD_INSTTAG);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag(String instTag) {
        this.setInstTag(instTag);
        return this;
    }

    @JsonProperty(value="insttag2")
    public void setInstTag2(String instTag2) {
        this._set(DTOFIELD_INSTTAG2, instTag2);
    }

    @JsonIgnore
    public String getInstTag2() {
        Object objValue = this._get(DTOFIELD_INSTTAG2);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag2Dirty() {
        return this._contains(DTOFIELD_INSTTAG2);
    }

    @JsonIgnore
    public void resetInstTag2() {
        this._reset(DTOFIELD_INSTTAG2);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag2(String instTag2) {
        this.setInstTag2(instTag2);
        return this;
    }

    @JsonProperty(value="insttag3")
    public void setInstTag3(String instTag3) {
        this._set(DTOFIELD_INSTTAG3, instTag3);
    }

    @JsonIgnore
    public String getInstTag3() {
        Object objValue = this._get(DTOFIELD_INSTTAG3);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag3Dirty() {
        return this._contains(DTOFIELD_INSTTAG3);
    }

    @JsonIgnore
    public void resetInstTag3() {
        this._reset(DTOFIELD_INSTTAG3);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag3(String instTag3) {
        this.setInstTag3(instTag3);
        return this;
    }

    @JsonProperty(value="insttag4")
    public void setInstTag4(String instTag4) {
        this._set(DTOFIELD_INSTTAG4, instTag4);
    }

    @JsonIgnore
    public String getInstTag4() {
        Object objValue = this._get(DTOFIELD_INSTTAG4);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag4Dirty() {
        return this._contains(DTOFIELD_INSTTAG4);
    }

    @JsonIgnore
    public void resetInstTag4() {
        this._reset(DTOFIELD_INSTTAG4);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag4(String instTag4) {
        this.setInstTag4(instTag4);
        return this;
    }

    @JsonProperty(value="insttag5")
    public void setInstTag5(String instTag5) {
        this._set(DTOFIELD_INSTTAG5, instTag5);
    }

    @JsonIgnore
    public String getInstTag5() {
        Object objValue = this._get(DTOFIELD_INSTTAG5);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag5Dirty() {
        return this._contains(DTOFIELD_INSTTAG5);
    }

    @JsonIgnore
    public void resetInstTag5() {
        this._reset(DTOFIELD_INSTTAG5);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag5(String instTag5) {
        this.setInstTag5(instTag5);
        return this;
    }

    @JsonProperty(value="insttag6")
    public void setInstTag6(String instTag6) {
        this._set(DTOFIELD_INSTTAG6, instTag6);
    }

    @JsonIgnore
    public String getInstTag6() {
        Object objValue = this._get(DTOFIELD_INSTTAG6);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag6Dirty() {
        return this._contains(DTOFIELD_INSTTAG6);
    }

    @JsonIgnore
    public void resetInstTag6() {
        this._reset(DTOFIELD_INSTTAG6);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag6(String instTag6) {
        this.setInstTag6(instTag6);
        return this;
    }

    @JsonProperty(value="insttag7")
    public void setInstTag7(String instTag7) {
        this._set(DTOFIELD_INSTTAG7, instTag7);
    }

    @JsonIgnore
    public String getInstTag7() {
        Object objValue = this._get(DTOFIELD_INSTTAG7);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag7Dirty() {
        return this._contains(DTOFIELD_INSTTAG7);
    }

    @JsonIgnore
    public void resetInstTag7() {
        this._reset(DTOFIELD_INSTTAG7);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag7(String instTag7) {
        this.setInstTag7(instTag7);
        return this;
    }

    @JsonProperty(value="insttag8")
    public void setInstTag8(String instTag8) {
        this._set(DTOFIELD_INSTTAG8, instTag8);
    }

    @JsonIgnore
    public String getInstTag8() {
        Object objValue = this._get(DTOFIELD_INSTTAG8);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTag8Dirty() {
        return this._contains(DTOFIELD_INSTTAG8);
    }

    @JsonIgnore
    public void resetInstTag8() {
        this._reset(DTOFIELD_INSTTAG8);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttag8(String instTag8) {
        this.setInstTag8(instTag8);
        return this;
    }

    @JsonProperty(value="insttype")
    public void setInstType(String instType) {
        this._set(DTOFIELD_INSTTYPE, instType);
    }

    @JsonIgnore
    public String getInstType() {
        Object objValue = this._get(DTOFIELD_INSTTYPE);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInstTypeDirty() {
        return this._contains(DTOFIELD_INSTTYPE);
    }

    @JsonIgnore
    public void resetInstType() {
        this._reset(DTOFIELD_INSTTYPE);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttype(String instType) {
        this.setInstType(instType);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO insttype(PSModelEnums.DynaInstType instType) {
        this.setInstType(instType == null ? null : instType.value);
        return this;
    }

    @JsonProperty(value="instver")
    public void setInstVer(Integer instVer) {
        this._set(DTOFIELD_INSTVER, instVer);
    }

    @JsonIgnore
    public Integer getInstVer() {
        Object objValue = this._get(DTOFIELD_INSTVER);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isInstVerDirty() {
        return this._contains(DTOFIELD_INSTVER);
    }

    @JsonIgnore
    public void resetInstVer() {
        this._reset(DTOFIELD_INSTVER);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO instver(Integer instVer) {
        this.setInstVer(instVer);
        return this;
    }

    @JsonProperty(value="lastcheckintime")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setLastCheckinTime(Timestamp lastCheckinTime) {
        this._set(DTOFIELD_LASTCHECKINTIME, lastCheckinTime);
    }

    @JsonIgnore
    public Timestamp getLastCheckinTime() {
        Object objValue = this._get(DTOFIELD_LASTCHECKINTIME);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isLastCheckinTimeDirty() {
        return this._contains(DTOFIELD_LASTCHECKINTIME);
    }

    @JsonIgnore
    public void resetLastCheckinTime() {
        this._reset(DTOFIELD_LASTCHECKINTIME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO lastcheckintime(Timestamp lastCheckinTime) {
        this.setLastCheckinTime(lastCheckinTime);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO logicname(String logicName) {
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnid")
    public void setModelPSDevCenterSVNId(String modelPSDevCenterSVNId) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNID, modelPSDevCenterSVNId);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNId() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNIdDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNId() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO modelpsdevcentersvnid(String modelPSDevCenterSVNId) {
        this.setModelPSDevCenterSVNId(modelPSDevCenterSVNId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO modelpsdevcentersvnid(PSDevCenterSVNDTO pSDevCenterSVN) {
        if (pSDevCenterSVN == null) {
            this.setModelPSDevCenterSVNId(null);
            this.setModelPSDevCenterSVNName(null);
        } else {
            this.setModelPSDevCenterSVNId(pSDevCenterSVN.getPSDevCenterSVNId());
            this.setModelPSDevCenterSVNName(pSDevCenterSVN.getPSDevCenterSVNName());
        }
        return this;
    }

    @JsonProperty(value="modelpsdevcentersvnname")
    public void setModelPSDevCenterSVNName(String modelPSDevCenterSVNName) {
        this._set(DTOFIELD_MODELPSDEVCENTERSVNNAME, modelPSDevCenterSVNName);
    }

    @JsonIgnore
    public String getModelPSDevCenterSVNName() {
        Object objValue = this._get(DTOFIELD_MODELPSDEVCENTERSVNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isModelPSDevCenterSVNNameDirty() {
        return this._contains(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public void resetModelPSDevCenterSVNName() {
        this._reset(DTOFIELD_MODELPSDEVCENTERSVNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO modelpsdevcentersvnname(String modelPSDevCenterSVNName) {
        this.setModelPSDevCenterSVNName(modelPSDevCenterSVNName);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="pinstmodelpath")
    public void setPInstModelPath(String pInstModelPath) {
        this._set(DTOFIELD_PINSTMODELPATH, pInstModelPath);
    }

    @JsonIgnore
    public String getPInstModelPath() {
        Object objValue = this._get(DTOFIELD_PINSTMODELPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPInstModelPathDirty() {
        return this._contains(DTOFIELD_PINSTMODELPATH);
    }

    @JsonIgnore
    public void resetPInstModelPath() {
        this._reset(DTOFIELD_PINSTMODELPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO pinstmodelpath(String pInstModelPath) {
        this.setPInstModelPath(pInstModelPath);
        return this;
    }

    @JsonProperty(value="ppsdevslnsysdynainstid")
    public void setPPSDevSlnSysDynaInstId(String pPSDevSlnSysDynaInstId) {
        this._set(DTOFIELD_PPSDEVSLNSYSDYNAINSTID, pPSDevSlnSysDynaInstId);
    }

    @JsonIgnore
    public String getPPSDevSlnSysDynaInstId() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNSYSDYNAINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnSysDynaInstIdDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPPSDevSlnSysDynaInstId() {
        this._reset(DTOFIELD_PPSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO ppsdevslnsysdynainstid(String pPSDevSlnSysDynaInstId) {
        this.setPPSDevSlnSysDynaInstId(pPSDevSlnSysDynaInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO ppsdevslnsysdynainstid(PSDevSlnSysDynaInstDTO pSDevSlnSysDynaInst) {
        if (pSDevSlnSysDynaInst == null) {
            this.setPPSDevSlnSysDynaInstId(null);
            this.setPPSDevSlnSysDynaInstName(null);
        } else {
            this.setPPSDevSlnSysDynaInstId(pSDevSlnSysDynaInst.getPSDevSlnSysDynaInstId());
            this.setPPSDevSlnSysDynaInstName(pSDevSlnSysDynaInst.getPSDevSlnSysDynaInstName());
        }
        return this;
    }

    @JsonProperty(value="ppsdevslnsysdynainstname")
    public void setPPSDevSlnSysDynaInstName(String pPSDevSlnSysDynaInstName) {
        this._set(DTOFIELD_PPSDEVSLNSYSDYNAINSTNAME, pPSDevSlnSysDynaInstName);
    }

    @JsonIgnore
    public String getPPSDevSlnSysDynaInstName() {
        Object objValue = this._get(DTOFIELD_PPSDEVSLNSYSDYNAINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSDevSlnSysDynaInstNameDirty() {
        return this._contains(DTOFIELD_PPSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPPSDevSlnSysDynaInstName() {
        this._reset(DTOFIELD_PPSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO ppsdevslnsysdynainstname(String pPSDevSlnSysDynaInstName) {
        this.setPPSDevSlnSysDynaInstName(pPSDevSlnSysDynaInstName);
        return this;
    }

    @JsonProperty(value="psdevcenterid")
    public void setPSDevCenterId(String pSDevCenterId) {
        this._set(DTOFIELD_PSDEVCENTERID, pSDevCenterId);
    }

    @JsonIgnore
    public String getPSDevCenterId() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterIdDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public void resetPSDevCenterId() {
        this._reset(DTOFIELD_PSDEVCENTERID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
        if (pSDevCenter == null) {
            this.setPSDevCenterId(null);
            this.setPSDevCenterName(null);
        } else {
            this.setPSDevCenterId(pSDevCenter.getPSDevCenterId());
            this.setPSDevCenterName(pSDevCenter.getPSDevCenterName());
        }
        return this;
    }

    @JsonProperty(value="psdevcentername")
    public void setPSDevCenterName(String pSDevCenterName) {
        this._set(DTOFIELD_PSDEVCENTERNAME, pSDevCenterName);
    }

    @JsonIgnore
    public String getPSDevCenterName() {
        Object objValue = this._get(DTOFIELD_PSDEVCENTERNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevCenterNameDirty() {
        return this._contains(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public void resetPSDevCenterName() {
        this._reset(DTOFIELD_PSDEVCENTERNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevcentername(String pSDevCenterName) {
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    @JsonProperty(value="psdevslnid")
    public void setPSDevSlnId(String pSDevSlnId) {
        this._set(DTOFIELD_PSDEVSLNID, pSDevSlnId);
    }

    @JsonIgnore
    public String getPSDevSlnId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public void resetPSDevSlnId() {
        this._reset(DTOFIELD_PSDEVSLNID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnid(PSDevSlnDTO pSDevSln) {
        if (pSDevSln == null) {
            this.setPSDevSlnId(null);
            this.setPSDevSlnName(null);
        } else {
            this.setPSDevSlnId(pSDevSln.getPSDevSlnId());
            this.setPSDevSlnName(pSDevSln.getPSDevSlnName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnname")
    public void setPSDevSlnName(String pSDevSlnName) {
        this._set(DTOFIELD_PSDEVSLNNAME, pSDevSlnName);
    }

    @JsonIgnore
    public String getPSDevSlnName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnName() {
        this._reset(DTOFIELD_PSDEVSLNNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="psdevslnsysdepinstid")
    public void setPSDevSlnSysDepInstId(String pSDevSlnSysDepInstId) {
        this._set(DTOFIELD_PSDEVSLNSYSDEPINSTID, pSDevSlnSysDepInstId);
    }

    @JsonIgnore
    public String getPSDevSlnSysDepInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDEPINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDepInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDEPINSTID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDepInstId() {
        this._reset(DTOFIELD_PSDEVSLNSYSDEPINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysdepinstid(String pSDevSlnSysDepInstId) {
        this.setPSDevSlnSysDepInstId(pSDevSlnSysDepInstId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysdepinstid(PSDevSlnSysDepInstDTO pSDevSlnSysDepInst) {
        if (pSDevSlnSysDepInst == null) {
            this.setPSDevSlnSysDepInstId(null);
            this.setPSDevSlnSysDepInstName(null);
        } else {
            this.setPSDevSlnSysDepInstId(pSDevSlnSysDepInst.getPSDevSlnSysDepInstId());
            this.setPSDevSlnSysDepInstName(pSDevSlnSysDepInst.getPSDevSlnSysDepInstName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysdepinstname")
    public void setPSDevSlnSysDepInstName(String pSDevSlnSysDepInstName) {
        this._set(DTOFIELD_PSDEVSLNSYSDEPINSTNAME, pSDevSlnSysDepInstName);
    }

    @JsonIgnore
    public String getPSDevSlnSysDepInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDepInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDepInstName() {
        this._reset(DTOFIELD_PSDEVSLNSYSDEPINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysdepinstname(String pSDevSlnSysDepInstName) {
        this.setPSDevSlnSysDepInstName(pSDevSlnSysDepInstName);
        return this;
    }

    @JsonProperty(value="psdevslnsysdynainstid")
    public void setPSDevSlnSysDynaInstId(String pSDevSlnSysDynaInstId) {
        this._set(DTOFIELD_PSDEVSLNSYSDYNAINSTID, pSDevSlnSysDynaInstId);
    }

    @JsonIgnore
    public String getPSDevSlnSysDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDynaInstId() {
        this._reset(DTOFIELD_PSDEVSLNSYSDYNAINSTID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysdynainstid(String pSDevSlnSysDynaInstId) {
        this.setPSDevSlnSysDynaInstId(pSDevSlnSysDynaInstId);
        return this;
    }

    @JsonProperty(value="psdevslnsysdynainstname")
    public void setPSDevSlnSysDynaInstName(String pSDevSlnSysDynaInstName) {
        this._set(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME, pSDevSlnSysDynaInstName);
    }

    @JsonIgnore
    public String getPSDevSlnSysDynaInstName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysDynaInstNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysDynaInstName() {
        this._reset(DTOFIELD_PSDEVSLNSYSDYNAINSTNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysdynainstname(String pSDevSlnSysDynaInstName) {
        this.setPSDevSlnSysDynaInstName(pSDevSlnSysDynaInstName);
        return this;
    }

    @JsonProperty(value="psdevslnsysid")
    public void setPSDevSlnSysId(String pSDevSlnSysId) {
        this._set(DTOFIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }

    @JsonIgnore
    public String getPSDevSlnSysId() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public void resetPSDevSlnSysId() {
        this._reset(DTOFIELD_PSDEVSLNSYSID);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysid(String pSDevSlnSysId) {
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysid(PSDevSlnSysDTO pSDevSlnSys) {
        if (pSDevSlnSys == null) {
            this.setPSDevSlnSysId(null);
            this.setPSDevSlnSysName(null);
        } else {
            this.setPSDevSlnSysId(pSDevSlnSys.getPSDevSlnSysId());
            this.setPSDevSlnSysName(pSDevSlnSys.getPSDevSlnSysName());
        }
        return this;
    }

    @JsonProperty(value="psdevslnsysname")
    public void setPSDevSlnSysName(String pSDevSlnSysName) {
        this._set(DTOFIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }

    @JsonIgnore
    public String getPSDevSlnSysName() {
        Object objValue = this._get(DTOFIELD_PSDEVSLNSYSNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty() {
        return this._contains(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public void resetPSDevSlnSysName() {
        this._reset(DTOFIELD_PSDEVSLNSYSNAME);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO psdevslnsysname(String pSDevSlnSysName) {
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    @JsonProperty(value="refupdatedate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setRefUpdateDate(Timestamp refUpdateDate) {
        this._set(DTOFIELD_REFUPDATEDATE, refUpdateDate);
    }

    @JsonIgnore
    public Timestamp getRefUpdateDate() {
        Object objValue = this._get(DTOFIELD_REFUPDATEDATE);
        if (objValue == null) return null;
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isRefUpdateDateDirty() {
        return this._contains(DTOFIELD_REFUPDATEDATE);
    }

    @JsonIgnore
    public void resetRefUpdateDate() {
        this._reset(DTOFIELD_REFUPDATEDATE);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO refupdatedate(Timestamp refUpdateDate) {
        this.setRefUpdateDate(refUpdateDate);
        return this;
    }

    @JsonProperty(value="rootinstmodelpath")
    public void setRootInstModelPath(String rootInstModelPath) {
        this._set(DTOFIELD_ROOTINSTMODELPATH, rootInstModelPath);
    }

    @JsonIgnore
    public String getRootInstModelPath() {
        Object objValue = this._get(DTOFIELD_ROOTINSTMODELPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRootInstModelPathDirty() {
        return this._contains(DTOFIELD_ROOTINSTMODELPATH);
    }

    @JsonIgnore
    public void resetRootInstModelPath() {
        this._reset(DTOFIELD_ROOTINSTMODELPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO rootinstmodelpath(String rootInstModelPath) {
        this.setRootInstModelPath(rootInstModelPath);
        return this;
    }

    @JsonProperty(value="sysmodelpath")
    public void setSysModelPath(String sysModelPath) {
        this._set(DTOFIELD_SYSMODELPATH, sysModelPath);
    }

    @JsonIgnore
    public String getSysModelPath() {
        Object objValue = this._get(DTOFIELD_SYSMODELPATH);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSysModelPathDirty() {
        return this._contains(DTOFIELD_SYSMODELPATH);
    }

    @JsonIgnore
    public void resetSysModelPath() {
        this._reset(DTOFIELD_SYSMODELPATH);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO sysmodelpath(String sysModelPath) {
        this.setSysModelPath(sysModelPath);
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO updatedate(Timestamp updateDate) {
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO usertag(String userTag) {
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
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) return null;
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
    public PSDevSlnSysDynaInstDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO validflag(Boolean validFlag) {
        this.setValidFlag(validFlag == null ? null : (validFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDevSlnSysDynaInstName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDevSlnSysDynaInstName(strName);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO name(String strName) {
        this.setPSDevSlnSysDynaInstName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDevSlnSysDynaInstId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDevSlnSysDynaInstId(strValue);
    }

    @JsonIgnore
    public PSDevSlnSysDynaInstDTO id(String strValue) {
        this.setPSDevSlnSysDynaInstId(strValue);
        return this;
    }

}
