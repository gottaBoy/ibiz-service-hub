package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSModelRTDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ICONPATH = "ICONPATH";
    protected static final String DTOFIELD_ICONPATH = "iconpath";
    public static final String FIELD_LEAFFLAG = "LEAFFLAG";
    protected static final String DTOFIELD_LEAFFLAG = "leafflag";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_METHODNAME = "METHODNAME";
    protected static final String DTOFIELD_METHODNAME = "methodname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PPSMODELRTID = "PPSMODELRTID";
    protected static final String DTOFIELD_PPSMODELRTID = "ppsmodelrtid";
    public static final String FIELD_PPSMODELRTNAME = "PPSMODELRTNAME";
    protected static final String DTOFIELD_PPSMODELRTNAME = "ppsmodelrtname";
    public static final String FIELD_PSMODELRTID = "PSMODELRTID";
    protected static final String DTOFIELD_PSMODELRTID = "psmodelrtid";
    public static final String FIELD_PSMODELRTNAME = "PSMODELRTNAME";
    protected static final String DTOFIELD_PSMODELRTNAME = "psmodelrtname";
    public static final String FIELD_RTDATA = "RTDATA";
    protected static final String DTOFIELD_RTDATA = "rtdata";
    public static final String FIELD_RTDATA2 = "RTDATA2";
    protected static final String DTOFIELD_RTDATA2 = "rtdata2";
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
    public PSModelRTDTO createdate(Timestamp createDate) {
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
    public PSModelRTDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="iconpath")
    public void setIconPath(String iconPath) {
        this._set(DTOFIELD_ICONPATH, iconPath);
    }

    @JsonIgnore
    public String getIconPath() {
        Object objValue = this._get(DTOFIELD_ICONPATH);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isIconPathDirty() {
        return this._contains(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public void resetIconPath() {
        this._reset(DTOFIELD_ICONPATH);
    }

    @JsonIgnore
    public PSModelRTDTO iconpath(String iconPath) {
        this.setIconPath(iconPath);
        return this;
    }

    @JsonProperty(value="leafflag")
    public void setLeafFlag(Integer leafFlag) {
        this._set(DTOFIELD_LEAFFLAG, leafFlag);
    }

    @JsonIgnore
    public Integer getLeafFlag() {
        Object objValue = this._get(DTOFIELD_LEAFFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isLeafFlagDirty() {
        return this._contains(DTOFIELD_LEAFFLAG);
    }

    @JsonIgnore
    public void resetLeafFlag() {
        this._reset(DTOFIELD_LEAFFLAG);
    }

    @JsonIgnore
    public PSModelRTDTO leafflag(Integer leafFlag) {
        this.setLeafFlag(leafFlag);
        return this;
    }

    @JsonIgnore
    public PSModelRTDTO leafflag(Boolean leafFlag) {
        if (leafFlag == null) {
            this.setLeafFlag(null);
        } else {
            this.setLeafFlag(leafFlag != false ? 1 : 0);
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
    public PSModelRTDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="methodname")
    public void setMethodName(String methodName) {
        this._set(DTOFIELD_METHODNAME, methodName);
    }

    @JsonIgnore
    public String getMethodName() {
        Object objValue = this._get(DTOFIELD_METHODNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMethodNameDirty() {
        return this._contains(DTOFIELD_METHODNAME);
    }

    @JsonIgnore
    public void resetMethodName() {
        this._reset(DTOFIELD_METHODNAME);
    }

    @JsonIgnore
    public PSModelRTDTO methodname(String methodName) {
        this.setMethodName(methodName);
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
    public PSModelRTDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="ppsmodelrtid")
    public void setPPSModelRTId(String pPSModelRTId) {
        this._set(DTOFIELD_PPSMODELRTID, pPSModelRTId);
    }

    @JsonIgnore
    public String getPPSModelRTId() {
        Object objValue = this._get(DTOFIELD_PPSMODELRTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSModelRTIdDirty() {
        return this._contains(DTOFIELD_PPSMODELRTID);
    }

    @JsonIgnore
    public void resetPPSModelRTId() {
        this._reset(DTOFIELD_PPSMODELRTID);
    }

    @JsonIgnore
    public PSModelRTDTO ppsmodelrtid(String pPSModelRTId) {
        this.setPPSModelRTId(pPSModelRTId);
        return this;
    }

    @JsonIgnore
    public PSModelRTDTO ppsmodelrtid(PSModelRTDTO pSModelRT) {
        if (pSModelRT == null) {
            this.setPPSModelRTId(null);
            this.setPPSModelRTName(null);
        } else {
            this.setPPSModelRTId(pSModelRT.getPSModelRTId());
            this.setPPSModelRTName(pSModelRT.getPSModelRTName());
        }
        return this;
    }

    @JsonProperty(value="ppsmodelrtname")
    public void setPPSModelRTName(String pPSModelRTName) {
        this._set(DTOFIELD_PPSMODELRTNAME, pPSModelRTName);
    }

    @JsonIgnore
    public String getPPSModelRTName() {
        Object objValue = this._get(DTOFIELD_PPSMODELRTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPPSModelRTNameDirty() {
        return this._contains(DTOFIELD_PPSMODELRTNAME);
    }

    @JsonIgnore
    public void resetPPSModelRTName() {
        this._reset(DTOFIELD_PPSMODELRTNAME);
    }

    @JsonIgnore
    public PSModelRTDTO ppsmodelrtname(String pPSModelRTName) {
        this.setPPSModelRTName(pPSModelRTName);
        return this;
    }

    @JsonProperty(value="psmodelrtid")
    public void setPSModelRTId(String pSModelRTId) {
        this._set(DTOFIELD_PSMODELRTID, pSModelRTId);
    }

    @JsonIgnore
    public String getPSModelRTId() {
        Object objValue = this._get(DTOFIELD_PSMODELRTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelRTIdDirty() {
        return this._contains(DTOFIELD_PSMODELRTID);
    }

    @JsonIgnore
    public void resetPSModelRTId() {
        this._reset(DTOFIELD_PSMODELRTID);
    }

    @JsonIgnore
    public PSModelRTDTO psmodelrtid(String pSModelRTId) {
        this.setPSModelRTId(pSModelRTId);
        return this;
    }

    @JsonProperty(value="psmodelrtname")
    public void setPSModelRTName(String pSModelRTName) {
        this._set(DTOFIELD_PSMODELRTNAME, pSModelRTName);
    }

    @JsonIgnore
    public String getPSModelRTName() {
        Object objValue = this._get(DTOFIELD_PSMODELRTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModelRTNameDirty() {
        return this._contains(DTOFIELD_PSMODELRTNAME);
    }

    @JsonIgnore
    public void resetPSModelRTName() {
        this._reset(DTOFIELD_PSMODELRTNAME);
    }

    @JsonIgnore
    public PSModelRTDTO psmodelrtname(String pSModelRTName) {
        this.setPSModelRTName(pSModelRTName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSModelRTName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSModelRTName(strName);
    }

    @JsonIgnore
    public PSModelRTDTO name(String strName) {
        this.setPSModelRTName(strName);
        return this;
    }

    @JsonProperty(value="rtdata")
    public void setRTData(String rTData) {
        this._set(DTOFIELD_RTDATA, rTData);
    }

    @JsonIgnore
    public String getRTData() {
        Object objValue = this._get(DTOFIELD_RTDATA);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTDataDirty() {
        return this._contains(DTOFIELD_RTDATA);
    }

    @JsonIgnore
    public void resetRTData() {
        this._reset(DTOFIELD_RTDATA);
    }

    @JsonIgnore
    public PSModelRTDTO rtdata(String rTData) {
        this.setRTData(rTData);
        return this;
    }

    @JsonProperty(value="rtdata2")
    public void setRTData2(String rTData2) {
        this._set(DTOFIELD_RTDATA2, rTData2);
    }

    @JsonIgnore
    public String getRTData2() {
        Object objValue = this._get(DTOFIELD_RTDATA2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isRTData2Dirty() {
        return this._contains(DTOFIELD_RTDATA2);
    }

    @JsonIgnore
    public void resetRTData2() {
        this._reset(DTOFIELD_RTDATA2);
    }

    @JsonIgnore
    public PSModelRTDTO rtdata2(String rTData2) {
        this.setRTData2(rTData2);
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
    public PSModelRTDTO rttype(String rTType) {
        this.setRTType(rTType);
        return this;
    }

    @JsonIgnore
    public PSModelRTDTO rttype(PSModelEnums.ModelRTType rTType) {
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
    public PSModelRTDTO updatedate(Timestamp updateDate) {
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
    public PSModelRTDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSModelRTId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSModelRTId(strValue);
    }

    @JsonIgnore
    public PSModelRTDTO id(String strValue) {
        this.setPSModelRTId(strValue);
        return this;
    }
}
