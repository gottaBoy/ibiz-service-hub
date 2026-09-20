/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDQCodeCondDTO
extends PSModelDTOBase {
    public static final String FIELD_CONDCODE = "CONDCODE";
    protected static final String DTOFIELD_CONDCODE = "condcode";
    public static final String FIELD_CONDTAG = "CONDTAG";
    protected static final String DTOFIELD_CONDTAG = "condtag";
    public static final String FIELD_CONDTAG2 = "CONDTAG2";
    protected static final String DTOFIELD_CONDTAG2 = "condtag2";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_FIELDNAME = "FIELDNAME";
    protected static final String DTOFIELD_FIELDNAME = "fieldname";
    public static final String FIELD_IGNOREEMPTY = "IGNOREEMPTY";
    protected static final String DTOFIELD_IGNOREEMPTY = "ignoreempty";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEDQCODECONDID = "PSDEDQCODECONDID";
    protected static final String DTOFIELD_PSDEDQCODECONDID = "psdedqcodecondid";
    public static final String FIELD_PSDEDQCODECONDNAME = "PSDEDQCODECONDNAME";
    protected static final String DTOFIELD_PSDEDQCODECONDNAME = "psdedqcodecondname";
    public static final String FIELD_PSDEDQCODEID = "PSDEDQCODEID";
    protected static final String DTOFIELD_PSDEDQCODEID = "psdedqcodeid";
    public static final String FIELD_PSDEDQCODENAME = "PSDEDQCODENAME";
    protected static final String DTOFIELD_PSDEDQCODENAME = "psdedqcodename";
    public static final String FIELD_PSVARTYPEID = "PSVARTYPEID";
    protected static final String DTOFIELD_PSVARTYPEID = "psvartypeid";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="condcode")
    public void setCondCode(String condCode) {
        this._set(DTOFIELD_CONDCODE, condCode);
    }

    @JsonIgnore
    public String getCondCode() {
        Object objValue = this._get(DTOFIELD_CONDCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondCodeDirty() {
        return this._contains(DTOFIELD_CONDCODE);
    }

    @JsonIgnore
    public void resetCondCode() {
        this._reset(DTOFIELD_CONDCODE);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO condcode(String condCode) {
        this.setCondCode(condCode);
        return this;
    }

    @JsonProperty(value="condtag")
    public void setCondTag(String condTag) {
        this._set(DTOFIELD_CONDTAG, condTag);
    }

    @JsonIgnore
    public String getCondTag() {
        Object objValue = this._get(DTOFIELD_CONDTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTagDirty() {
        return this._contains(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public void resetCondTag() {
        this._reset(DTOFIELD_CONDTAG);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO condtag(String condTag) {
        this.setCondTag(condTag);
        return this;
    }

    @JsonProperty(value="condtag2")
    public void setCondTag2(String condTag2) {
        this._set(DTOFIELD_CONDTAG2, condTag2);
    }

    @JsonIgnore
    public String getCondTag2() {
        Object objValue = this._get(DTOFIELD_CONDTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCondTag2Dirty() {
        return this._contains(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public void resetCondTag2() {
        this._reset(DTOFIELD_CONDTAG2);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO condtag2(String condTag2) {
        this.setCondTag2(condTag2);
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
    public PSDEDQCodeCondDTO createdate(Timestamp createDate) {
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
    public PSDEDQCodeCondDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="fieldname")
    public void setFieldName(String fieldName) {
        this._set(DTOFIELD_FIELDNAME, fieldName);
    }

    @JsonIgnore
    public String getFieldName() {
        Object objValue = this._get(DTOFIELD_FIELDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFieldNameDirty() {
        return this._contains(DTOFIELD_FIELDNAME);
    }

    @JsonIgnore
    public void resetFieldName() {
        this._reset(DTOFIELD_FIELDNAME);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO fieldname(String fieldName) {
        this.setFieldName(fieldName);
        return this;
    }

    @JsonProperty(value="ignoreempty")
    public void setIgnoreEmpty(Integer ignoreEmpty) {
        this._set(DTOFIELD_IGNOREEMPTY, ignoreEmpty);
    }

    @JsonIgnore
    public Integer getIgnoreEmpty() {
        Object objValue = this._get(DTOFIELD_IGNOREEMPTY);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreEmptyDirty() {
        return this._contains(DTOFIELD_IGNOREEMPTY);
    }

    @JsonIgnore
    public void resetIgnoreEmpty() {
        this._reset(DTOFIELD_IGNOREEMPTY);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO ignoreempty(Integer ignoreEmpty) {
        this.setIgnoreEmpty(ignoreEmpty);
        return this;
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO ignoreempty(Boolean ignoreEmpty) {
        if (ignoreEmpty == null) {
            this.setIgnoreEmpty(null);
        } else {
            this.setIgnoreEmpty(ignoreEmpty != false ? 1 : 0);
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
    public PSDEDQCodeCondDTO memo(String memo) {
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
    public PSDEDQCodeCondDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdedqcodecondid")
    public void setPSDEDQCodeCondId(String pSDEDQCodeCondId) {
        this._set(DTOFIELD_PSDEDQCODECONDID, pSDEDQCodeCondId);
    }

    @JsonIgnore
    public String getPSDEDQCodeCondId() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODECONDID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeCondIdDirty() {
        return this._contains(DTOFIELD_PSDEDQCODECONDID);
    }

    @JsonIgnore
    public void resetPSDEDQCodeCondId() {
        this._reset(DTOFIELD_PSDEDQCODECONDID);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psdedqcodecondid(String pSDEDQCodeCondId) {
        this.setPSDEDQCodeCondId(pSDEDQCodeCondId);
        return this;
    }

    @JsonProperty(value="psdedqcodecondname")
    public void setPSDEDQCodeCondName(String pSDEDQCodeCondName) {
        this._set(DTOFIELD_PSDEDQCODECONDNAME, pSDEDQCodeCondName);
    }

    @JsonIgnore
    public String getPSDEDQCodeCondName() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODECONDNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeCondNameDirty() {
        return this._contains(DTOFIELD_PSDEDQCODECONDNAME);
    }

    @JsonIgnore
    public void resetPSDEDQCodeCondName() {
        this._reset(DTOFIELD_PSDEDQCODECONDNAME);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psdedqcodecondname(String pSDEDQCodeCondName) {
        this.setPSDEDQCodeCondName(pSDEDQCodeCondName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDQCodeCondName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDQCodeCondName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO name(String strName) {
        this.setPSDEDQCodeCondName(strName);
        return this;
    }

    @JsonProperty(value="psdedqcodeid")
    public void setPSDEDQCodeId(String pSDEDQCodeId) {
        this._set(DTOFIELD_PSDEDQCODEID, pSDEDQCodeId);
    }

    @JsonIgnore
    public String getPSDEDQCodeId() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeIdDirty() {
        return this._contains(DTOFIELD_PSDEDQCODEID);
    }

    @JsonIgnore
    public void resetPSDEDQCodeId() {
        this._reset(DTOFIELD_PSDEDQCODEID);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psdedqcodeid(String pSDEDQCodeId) {
        this.setPSDEDQCodeId(pSDEDQCodeId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psdedqcodeid(PSDEDQCodeDTO pSDEDQCode) {
        if (pSDEDQCode == null) {
            this.setPSDEDQCodeId(null);
            this.setPSDEDQCodeName(null);
        } else {
            this.setPSDEDQCodeId(pSDEDQCode.getPSDEDQCodeId());
            this.setPSDEDQCodeName(pSDEDQCode.getPSDEDQCodeName());
        }
        return this;
    }

    @JsonProperty(value="psdedqcodename")
    public void setPSDEDQCodeName(String pSDEDQCodeName) {
        this._set(DTOFIELD_PSDEDQCODENAME, pSDEDQCodeName);
    }

    @JsonIgnore
    public String getPSDEDQCodeName() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeNameDirty() {
        return this._contains(DTOFIELD_PSDEDQCODENAME);
    }

    @JsonIgnore
    public void resetPSDEDQCodeName() {
        this._reset(DTOFIELD_PSDEDQCODENAME);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psdedqcodename(String pSDEDQCodeName) {
        this.setPSDEDQCodeName(pSDEDQCodeName);
        return this;
    }

    @JsonProperty(value="psvartypeid")
    public void setPSVarTypeId(String pSVarTypeId) {
        this._set(DTOFIELD_PSVARTYPEID, pSVarTypeId);
    }

    @JsonIgnore
    public String getPSVarTypeId() {
        Object objValue = this._get(DTOFIELD_PSVARTYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSVarTypeIdDirty() {
        return this._contains(DTOFIELD_PSVARTYPEID);
    }

    @JsonIgnore
    public void resetPSVarTypeId() {
        this._reset(DTOFIELD_PSVARTYPEID);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO psvartypeid(String pSVarTypeId) {
        this.setPSVarTypeId(pSVarTypeId);
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
    public PSDEDQCodeCondDTO updatedate(Timestamp updateDate) {
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
    public PSDEDQCodeCondDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDQCodeCondId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDQCodeCondId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeCondDTO id(String strValue) {
        this.setPSDEDQCodeCondId(strValue);
        return this;
    }
}
