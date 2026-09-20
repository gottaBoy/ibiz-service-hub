package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSModelRTCfgDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDYNAINSTID = "PSDYNAINSTID";
    protected static final String DTOFIELD_PSDYNAINSTID = "psdynainstid";
    public static final String FIELD_PSMODELID = "PSMODELID";
    protected static final String DTOFIELD_PSMODELID = "psmodelid";
    public static final String FIELD_PSMODELRTCFGID = "PSMODELRTCFGID";
    protected static final String DTOFIELD_PSMODELRTCFGID = "psmodelrtcfgid";
    public static final String FIELD_PSMODELRTCFGNAME = "PSMODELRTCFGNAME";
    protected static final String DTOFIELD_PSMODELRTCFGNAME = "psmodelrtcfgname";
    public static final String FIELD_PSMODELTYPE = "PSMODELTYPE";
    protected static final String DTOFIELD_PSMODELTYPE = "psmodeltype";
    public static final String FIELD_RTMODEL = "RTMODEL";
    protected static final String DTOFIELD_RTMODEL = "rtmodel";
    public static final String FIELD_RTMODELID = "RTMODELID";
    protected static final String DTOFIELD_RTMODELID = "rtmodelid";
    public static final String FIELD_RTMODELPATH = "RTMODELPATH";
    protected static final String DTOFIELD_RTMODELPATH = "rtmodelpath";
    public static final String FIELD_RTTAG = "RTTAG";
    protected static final String DTOFIELD_RTTAG = "rttag";
    public static final String FIELD_RTTAG2 = "RTTAG2";
    protected static final String DTOFIELD_RTTAG2 = "rttag2";
    public static final String FIELD_RTTYPE = "RTTYPE";
    protected static final String DTOFIELD_RTTYPE = "rttype";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

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
    public PSModelRTCfgDTO createdate(Timestamp createDate) {
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
    public PSModelRTCfgDTO createman(String createMan) {
        this.setCreateMan(createMan);
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
    public PSModelRTCfgDTO memo(String memo) {
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
    public PSModelRTCfgDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdynainstid")
    public void setPSDynaInstId(String pSDynaInstId) {
        this._set(DTOFIELD_PSDYNAINSTID, pSDynaInstId);
    }

    @JsonIgnore
    public String getPSDynaInstId() {
        Object objValue = this._get(DTOFIELD_PSDYNAINSTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDynaInstIdDirty() {
        return this._contains(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public void resetPSDynaInstId() {
        this._reset(DTOFIELD_PSDYNAINSTID);
    }

    @JsonIgnore
    public PSModelRTCfgDTO psdynainstid(String pSDynaInstId) {
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    @JsonProperty(value="psmodelid")
    public void setPSModelId(String pSModelId) {
        this._set(DTOFIELD_PSMODELID, pSModelId);
    }

    @JsonIgnore
    public String getPSModelId() {
        Object objValue = this._get(DTOFIELD_PSMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelIdDirty() {
        return this._contains(DTOFIELD_PSMODELID);
    }

    @JsonIgnore
    public void resetPSModelId() {
        this._reset(DTOFIELD_PSMODELID);
    }

    @JsonIgnore
    public PSModelRTCfgDTO psmodelid(String pSModelId) {
        this.setPSModelId(pSModelId);
        return this;
    }

    @JsonProperty(value="psmodelrtcfgid")
    public void setPSModelRTCfgId(String pSModelRTCfgId) {
        this._set(DTOFIELD_PSMODELRTCFGID, pSModelRTCfgId);
    }

    @JsonIgnore
    public String getPSModelRTCfgId() {
        Object objValue = this._get(DTOFIELD_PSMODELRTCFGID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelRTCfgIdDirty() {
        return this._contains(DTOFIELD_PSMODELRTCFGID);
    }

    @JsonIgnore
    public void resetPSModelRTCfgId() {
        this._reset(DTOFIELD_PSMODELRTCFGID);
    }

    @JsonIgnore
    public PSModelRTCfgDTO psmodelrtcfgid(String pSModelRTCfgId) {
        this.setPSModelRTCfgId(pSModelRTCfgId);
        return this;
    }

    @JsonProperty(value="psmodelrtcfgname")
    public void setPSModelRTCfgName(String pSModelRTCfgName) {
        this._set(DTOFIELD_PSMODELRTCFGNAME, pSModelRTCfgName);
    }

    @JsonIgnore
    public String getPSModelRTCfgName() {
        Object objValue = this._get(DTOFIELD_PSMODELRTCFGNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelRTCfgNameDirty() {
        return this._contains(DTOFIELD_PSMODELRTCFGNAME);
    }

    @JsonIgnore
    public void resetPSModelRTCfgName() {
        this._reset(DTOFIELD_PSMODELRTCFGNAME);
    }

    @JsonIgnore
    public PSModelRTCfgDTO psmodelrtcfgname(String pSModelRTCfgName) {
        this.setPSModelRTCfgName(pSModelRTCfgName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSModelRTCfgName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSModelRTCfgName(strName);
    }

    @JsonIgnore
    public PSModelRTCfgDTO name(String strName) {
        this.setPSModelRTCfgName(strName);
        return this;
    }

    @JsonProperty(value="psmodeltype")
    public void setPSModelType(String pSModelType) {
        this._set(DTOFIELD_PSMODELTYPE, pSModelType);
    }

    @JsonIgnore
    public String getPSModelType() {
        Object objValue = this._get(DTOFIELD_PSMODELTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelTypeDirty() {
        return this._contains(DTOFIELD_PSMODELTYPE);
    }

    @JsonIgnore
    public void resetPSModelType() {
        this._reset(DTOFIELD_PSMODELTYPE);
    }

    @JsonIgnore
    public PSModelRTCfgDTO psmodeltype(String pSModelType) {
        this.setPSModelType(pSModelType);
        return this;
    }

    @JsonProperty(value="rtmodel")
    public void setRTModel(String rTModel) {
        this._set(DTOFIELD_RTMODEL, rTModel);
    }

    @JsonIgnore
    public String getRTModel() {
        Object objValue = this._get(DTOFIELD_RTMODEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTModelDirty() {
        return this._contains(DTOFIELD_RTMODEL);
    }

    @JsonIgnore
    public void resetRTModel() {
        this._reset(DTOFIELD_RTMODEL);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rtmodel(String rTModel) {
        this.setRTModel(rTModel);
        return this;
    }

    @JsonProperty(value="rtmodelid")
    public void setRTModelId(String rTModelId) {
        this._set(DTOFIELD_RTMODELID, rTModelId);
    }

    @JsonIgnore
    public String getRTModelId() {
        Object objValue = this._get(DTOFIELD_RTMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTModelIdDirty() {
        return this._contains(DTOFIELD_RTMODELID);
    }

    @JsonIgnore
    public void resetRTModelId() {
        this._reset(DTOFIELD_RTMODELID);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rtmodelid(String rTModelId) {
        this.setRTModelId(rTModelId);
        return this;
    }

    @JsonProperty(value="rtmodelpath")
    public void setRTModelPath(String rTModelPath) {
        this._set(DTOFIELD_RTMODELPATH, rTModelPath);
    }

    @JsonIgnore
    public String getRTModelPath() {
        Object objValue = this._get(DTOFIELD_RTMODELPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTModelPathDirty() {
        return this._contains(DTOFIELD_RTMODELPATH);
    }

    @JsonIgnore
    public void resetRTModelPath() {
        this._reset(DTOFIELD_RTMODELPATH);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rtmodelpath(String rTModelPath) {
        this.setRTModelPath(rTModelPath);
        return this;
    }

    @JsonProperty(value="rttag")
    public void setRTTag(String rTTag) {
        this._set(DTOFIELD_RTTAG, rTTag);
    }

    @JsonIgnore
    public String getRTTag() {
        Object objValue = this._get(DTOFIELD_RTTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTTagDirty() {
        return this._contains(DTOFIELD_RTTAG);
    }

    @JsonIgnore
    public void resetRTTag() {
        this._reset(DTOFIELD_RTTAG);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rttag(String rTTag) {
        this.setRTTag(rTTag);
        return this;
    }

    @JsonProperty(value="rttag2")
    public void setRTTag2(String rTTag2) {
        this._set(DTOFIELD_RTTAG2, rTTag2);
    }

    @JsonIgnore
    public String getRTTag2() {
        Object objValue = this._get(DTOFIELD_RTTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTTag2Dirty() {
        return this._contains(DTOFIELD_RTTAG2);
    }

    @JsonIgnore
    public void resetRTTag2() {
        this._reset(DTOFIELD_RTTAG2);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rttag2(String rTTag2) {
        this.setRTTag2(rTTag2);
        return this;
    }

    @JsonProperty(value="rttype")
    public void setRTType(String rTType) {
        this._set(DTOFIELD_RTTYPE, rTType);
    }

    @JsonIgnore
    public String getRTType() {
        Object objValue = this._get(DTOFIELD_RTTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTTypeDirty() {
        return this._contains(DTOFIELD_RTTYPE);
    }

    @JsonIgnore
    public void resetRTType() {
        this._reset(DTOFIELD_RTTYPE);
    }

    @JsonIgnore
    public PSModelRTCfgDTO rttype(String rTType) {
        this.setRTType(rTType);
        return this;
    }

    @JsonIgnore
    public PSModelRTCfgDTO rttype(PSModelEnums.ModelRTType rTType) {
        if (rTType == null) {
            this.setRTType(null);
        } else {
            this.setRTType(rTType.value);
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
    public PSModelRTCfgDTO updatedate(Timestamp updateDate) {
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
    public PSModelRTCfgDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSModelRTCfgId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSModelRTCfgId(strValue);
    }

    @JsonIgnore
    public PSModelRTCfgDTO id(String strValue) {
        this.setPSModelRTCfgId(strValue);
        return this;
    }
}
