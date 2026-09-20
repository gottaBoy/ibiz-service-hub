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

public class PSDEDQCodeExpDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_EXPCODE = "EXPCODE";
    protected static final String DTOFIELD_EXPCODE = "expcode";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PSDEDQCODEEXPID = "PSDEDQCODEEXPID";
    protected static final String DTOFIELD_PSDEDQCODEEXPID = "psdedqcodeexpid";
    public static final String FIELD_PSDEDQCODEEXPNAME = "PSDEDQCODEEXPNAME";
    protected static final String DTOFIELD_PSDEDQCODEEXPNAME = "psdedqcodeexpname";
    public static final String FIELD_PSDEDQCODEID = "PSDEDQCODEID";
    protected static final String DTOFIELD_PSDEDQCODEID = "psdedqcodeid";
    public static final String FIELD_PSDEDQCODENAME = "PSDEDQCODENAME";
    protected static final String DTOFIELD_PSDEDQCODENAME = "psdedqcodename";
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
    public PSDEDQCodeExpDTO createdate(Timestamp createDate) {
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
    public PSDEDQCodeExpDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="expcode")
    public void setExpCode(String expCode) {
        this._set(DTOFIELD_EXPCODE, expCode);
    }

    @JsonIgnore
    public String getExpCode() {
        Object objValue = this._get(DTOFIELD_EXPCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isExpCodeDirty() {
        return this._contains(DTOFIELD_EXPCODE);
    }

    @JsonIgnore
    public void resetExpCode() {
        this._reset(DTOFIELD_EXPCODE);
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO expcode(String expCode) {
        this.setExpCode(expCode);
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
    public PSDEDQCodeExpDTO memo(String memo) {
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
    public PSDEDQCodeExpDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="psdedqcodeexpid")
    public void setPSDEDQCodeExpId(String pSDEDQCodeExpId) {
        this._set(DTOFIELD_PSDEDQCODEEXPID, pSDEDQCodeExpId);
    }

    @JsonIgnore
    public String getPSDEDQCodeExpId() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODEEXPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeExpIdDirty() {
        return this._contains(DTOFIELD_PSDEDQCODEEXPID);
    }

    @JsonIgnore
    public void resetPSDEDQCodeExpId() {
        this._reset(DTOFIELD_PSDEDQCODEEXPID);
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO psdedqcodeexpid(String pSDEDQCodeExpId) {
        this.setPSDEDQCodeExpId(pSDEDQCodeExpId);
        return this;
    }

    @JsonProperty(value="psdedqcodeexpname")
    public void setPSDEDQCodeExpName(String pSDEDQCodeExpName) {
        this._set(DTOFIELD_PSDEDQCODEEXPNAME, pSDEDQCodeExpName);
    }

    @JsonIgnore
    public String getPSDEDQCodeExpName() {
        Object objValue = this._get(DTOFIELD_PSDEDQCODEEXPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQCodeExpNameDirty() {
        return this._contains(DTOFIELD_PSDEDQCODEEXPNAME);
    }

    @JsonIgnore
    public void resetPSDEDQCodeExpName() {
        this._reset(DTOFIELD_PSDEDQCODEEXPNAME);
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO psdedqcodeexpname(String pSDEDQCodeExpName) {
        this.setPSDEDQCodeExpName(pSDEDQCodeExpName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDQCodeExpName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDQCodeExpName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO name(String strName) {
        this.setPSDEDQCodeExpName(strName);
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
    public PSDEDQCodeExpDTO psdedqcodeid(String pSDEDQCodeId) {
        this.setPSDEDQCodeId(pSDEDQCodeId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO psdedqcodeid(PSDEDQCodeDTO pSDEDQCode) {
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
    public PSDEDQCodeExpDTO psdedqcodename(String pSDEDQCodeName) {
        this.setPSDEDQCodeName(pSDEDQCodeName);
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
    public PSDEDQCodeExpDTO updatedate(Timestamp updateDate) {
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
    public PSDEDQCodeExpDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDQCodeExpId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDQCodeExpId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeExpDTO id(String strValue) {
        this.setPSDEDQCodeExpId(strValue);
        return this;
    }
}
