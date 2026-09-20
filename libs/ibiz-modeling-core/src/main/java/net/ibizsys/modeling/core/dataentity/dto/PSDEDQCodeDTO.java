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
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeExpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDQCodeDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DBTYPE = "DBTYPE";
    protected static final String DTOFIELD_DBTYPE = "dbtype";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDEDQCODEID = "PSDEDQCODEID";
    protected static final String DTOFIELD_PSDEDQCODEID = "psdedqcodeid";
    public static final String FIELD_PSDEDQCODENAME = "PSDEDQCODENAME";
    protected static final String DTOFIELD_PSDEDQCODENAME = "psdedqcodename";
    public static final String FIELD_PSDEDQID = "PSDEDQID";
    protected static final String DTOFIELD_PSDEDQID = "psdedqid";
    public static final String FIELD_PSDEDQNAME = "PSDEDQNAME";
    protected static final String DTOFIELD_PSDEDQNAME = "psdedqname";
    public static final String FIELD_QUERYCODE = "QUERYCODE";
    protected static final String DTOFIELD_QUERYCODE = "querycode";
    public static final String FIELD_QUERYCODETEMP = "QUERYCODETEMP";
    protected static final String DTOFIELD_QUERYCODETEMP = "querycodetemp";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERQUERYCODE = "USERQUERYCODE";
    protected static final String DTOFIELD_USERQUERYCODE = "userquerycode";
    public static final String FIELD_USERQUERYCODE2 = "USERQUERYCODE2";
    protected static final String DTOFIELD_USERQUERYCODE2 = "userquerycode2";
    public static final String DTOFIELD_PSDEDQCODEEXPS = "psdedqcodeexps";
    public static final String DTOFIELD_PSDEDQCODECONDS = "psdedqcodeconds";

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
    public PSDEDQCodeDTO createdate(Timestamp createDate) {
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
    public PSDEDQCodeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="dbtype")
    public void setDBType(String dBType) {
        this._set(DTOFIELD_DBTYPE, dBType);
    }

    @JsonIgnore
    public String getDBType() {
        Object objValue = this._get(DTOFIELD_DBTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDBTypeDirty() {
        return this._contains(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public void resetDBType() {
        this._reset(DTOFIELD_DBTYPE);
    }

    @JsonIgnore
    public PSDEDQCodeDTO dbtype(String dBType) {
        this.setDBType(dBType);
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
    public PSDEDQCodeDTO memo(String memo) {
        this.setMemo(memo);
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
    public PSDEDQCodeDTO psdedqcodeid(String pSDEDQCodeId) {
        this.setPSDEDQCodeId(pSDEDQCodeId);
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
    public PSDEDQCodeDTO psdedqcodename(String pSDEDQCodeName) {
        this.setPSDEDQCodeName(pSDEDQCodeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDQCodeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDQCodeName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeDTO name(String strName) {
        this.setPSDEDQCodeName(strName);
        return this;
    }

    @JsonProperty(value="psdedqid")
    public void setPSDEDQId(String pSDEDQId) {
        this._set(DTOFIELD_PSDEDQID, pSDEDQId);
    }

    @JsonIgnore
    public String getPSDEDQId() {
        Object objValue = this._get(DTOFIELD_PSDEDQID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQIdDirty() {
        return this._contains(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public void resetPSDEDQId() {
        this._reset(DTOFIELD_PSDEDQID);
    }

    @JsonIgnore
    public PSDEDQCodeDTO psdedqid(String pSDEDQId) {
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    @JsonIgnore
    public PSDEDQCodeDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery) {
        if (pSDEDataQuery == null) {
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        } else {
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    @JsonProperty(value="psdedqname")
    public void setPSDEDQName(String pSDEDQName) {
        this._set(DTOFIELD_PSDEDQNAME, pSDEDQName);
    }

    @JsonIgnore
    public String getPSDEDQName() {
        Object objValue = this._get(DTOFIELD_PSDEDQNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDQNameDirty() {
        return this._contains(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public void resetPSDEDQName() {
        this._reset(DTOFIELD_PSDEDQNAME);
    }

    @JsonIgnore
    public PSDEDQCodeDTO psdedqname(String pSDEDQName) {
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    @JsonProperty(value="querycode")
    public void setQueryCode(String queryCode) {
        this._set(DTOFIELD_QUERYCODE, queryCode);
    }

    @JsonIgnore
    public String getQueryCode() {
        Object objValue = this._get(DTOFIELD_QUERYCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueryCodeDirty() {
        return this._contains(DTOFIELD_QUERYCODE);
    }

    @JsonIgnore
    public void resetQueryCode() {
        this._reset(DTOFIELD_QUERYCODE);
    }

    @JsonIgnore
    public PSDEDQCodeDTO querycode(String queryCode) {
        this.setQueryCode(queryCode);
        return this;
    }

    @JsonProperty(value="querycodetemp")
    public void setQueryCodeTemp(String queryCodeTemp) {
        this._set(DTOFIELD_QUERYCODETEMP, queryCodeTemp);
    }

    @JsonIgnore
    public String getQueryCodeTemp() {
        Object objValue = this._get(DTOFIELD_QUERYCODETEMP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isQueryCodeTempDirty() {
        return this._contains(DTOFIELD_QUERYCODETEMP);
    }

    @JsonIgnore
    public void resetQueryCodeTemp() {
        this._reset(DTOFIELD_QUERYCODETEMP);
    }

    @JsonIgnore
    public PSDEDQCodeDTO querycodetemp(String queryCodeTemp) {
        this.setQueryCodeTemp(queryCodeTemp);
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
    public PSDEDQCodeDTO updatedate(Timestamp updateDate) {
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
    public PSDEDQCodeDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="userquerycode")
    public void setUserQueryCode(String userQueryCode) {
        this._set(DTOFIELD_USERQUERYCODE, userQueryCode);
    }

    @JsonIgnore
    public String getUserQueryCode() {
        Object objValue = this._get(DTOFIELD_USERQUERYCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserQueryCodeDirty() {
        return this._contains(DTOFIELD_USERQUERYCODE);
    }

    @JsonIgnore
    public void resetUserQueryCode() {
        this._reset(DTOFIELD_USERQUERYCODE);
    }

    @JsonIgnore
    public PSDEDQCodeDTO userquerycode(String userQueryCode) {
        this.setUserQueryCode(userQueryCode);
        return this;
    }

    @JsonProperty(value="userquerycode2")
    public void setUserQueryCode2(String userQueryCode2) {
        this._set(DTOFIELD_USERQUERYCODE2, userQueryCode2);
    }

    @JsonIgnore
    public String getUserQueryCode2() {
        Object objValue = this._get(DTOFIELD_USERQUERYCODE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserQueryCode2Dirty() {
        return this._contains(DTOFIELD_USERQUERYCODE2);
    }

    @JsonIgnore
    public void resetUserQueryCode2() {
        this._reset(DTOFIELD_USERQUERYCODE2);
    }

    @JsonIgnore
    public PSDEDQCodeDTO userquerycode2(String userQueryCode2) {
        this.setUserQueryCode2(userQueryCode2);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDQCodeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDQCodeId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeDTO id(String strValue) {
        this.setPSDEDQCodeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDQCodeExpDTO> getPSDEDQCodeExps() {
        Object list = this._get(DTOFIELD_PSDEDQCODEEXPS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedqcodeexps")
    public void setPSDEDQCodeExps(List<PSDEDQCodeExpDTO> psdedqcodeexps) {
        this._set(DTOFIELD_PSDEDQCODEEXPS, psdedqcodeexps);
    }

    @JsonIgnore
    public List<PSDEDQCodeExpDTO> getPSDEDQCodeExpsIf() {
        Object list = this._get(DTOFIELD_PSDEDQCODEEXPS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDQCODEEXPS, list);
        }
        return (List) list;
    }

    @JsonIgnore
    public List<PSDEDQCodeCondDTO> getPSDEDQCodeConds() {
        Object list = this._get(DTOFIELD_PSDEDQCODECONDS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedqcodeconds")
    public void setPSDEDQCodeConds(List<PSDEDQCodeCondDTO> psdedqcodeconds) {
        this._set(DTOFIELD_PSDEDQCODECONDS, psdedqcodeconds);
    }

    @JsonIgnore
    public List<PSDEDQCodeCondDTO> getPSDEDQCodeCondsIf() {
        Object list = this._get(DTOFIELD_PSDEDQCODECONDS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDQCODECONDS, list);
        }
        return (List) list;
    }
}
