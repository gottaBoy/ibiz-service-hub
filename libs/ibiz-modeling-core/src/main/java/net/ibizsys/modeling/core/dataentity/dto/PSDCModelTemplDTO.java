package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDCModelTemplDTO extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DEFNAMEMAXLENGTH = "DEFNAMEMAXLENGTH";
    protected static final String DTOFIELD_DEFNAMEMAXLENGTH = "defnamemaxlength";
    public static final String FIELD_DENAMEMAXLENGTH = "DENAMEMAXLENGTH";
    protected static final String DTOFIELD_DENAMEMAXLENGTH = "denamemaxlength";
    public static final String FIELD_IGNOREDEFAULTFIELDS = "IGNOREDEFAULTFIELDS";
    protected static final String DTOFIELD_IGNOREDEFAULTFIELDS = "ignoredefaultfields";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSDCMODELTEMPLID = "PSDCMODELTEMPLID";
    protected static final String DTOFIELD_PSDCMODELTEMPLID = "psdcmodeltemplid";
    public static final String FIELD_PSDCMODELTEMPLNAME = "PSDCMODELTEMPLNAME";
    protected static final String DTOFIELD_PSDCMODELTEMPLNAME = "psdcmodeltemplname";
    public static final String FIELD_PSDEVCENTERID = "PSDEVCENTERID";
    protected static final String DTOFIELD_PSDEVCENTERID = "psdevcenterid";
    public static final String FIELD_PSDEVCENTERNAME = "PSDEVCENTERNAME";
    protected static final String DTOFIELD_PSDEVCENTERNAME = "psdevcentername";
    public static final String FIELD_PSDEVSLNID = "PSDEVSLNID";
    protected static final String DTOFIELD_PSDEVSLNID = "psdevslnid";
    public static final String FIELD_PSDEVSLNNAME = "PSDEVSLNNAME";
    protected static final String DTOFIELD_PSDEVSLNNAME = "psdevslnname";
    public static final String FIELD_TABLEPREFIX = "TABLEPREFIX";
    protected static final String DTOFIELD_TABLEPREFIX = "tableprefix";
    public static final String FIELD_TABLEPREFIXFLAG = "TABLEPREFIXFLAG";
    protected static final String DTOFIELD_TABLEPREFIXFLAG = "tableprefixflag";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_VIEW2PREFIX = "VIEW2PREFIX";
    protected static final String DTOFIELD_VIEW2PREFIX = "view2prefix";
    public static final String FIELD_VIEW3PREFIX = "VIEW3PREFIX";
    protected static final String DTOFIELD_VIEW3PREFIX = "view3prefix";
    public static final String FIELD_VIEW4PREFIX = "VIEW4PREFIX";
    protected static final String DTOFIELD_VIEW4PREFIX = "view4prefix";
    public static final String FIELD_VIEWPREFIX = "VIEWPREFIX";
    protected static final String DTOFIELD_VIEWPREFIX = "viewprefix";
    public static final String FIELD_VIEWPREFIXFLAG = "VIEWPREFIXFLAG";
    protected static final String DTOFIELD_VIEWPREFIXFLAG = "viewprefixflag";

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
    public PSDCModelTemplDTO createdate(Timestamp createDate) {
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
    public PSDCModelTemplDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="defnamemaxlength")
    public void setDEFNameMaxLength(Integer dEFNameMaxLength) {
        this._set(DTOFIELD_DEFNAMEMAXLENGTH, dEFNameMaxLength);
    }

    @JsonIgnore
    public Integer getDEFNameMaxLength() {
        Object objValue = this._get(DTOFIELD_DEFNAMEMAXLENGTH);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEFNameMaxLengthDirty() {
        return this._contains(DTOFIELD_DEFNAMEMAXLENGTH);
    }

    @JsonIgnore
    public void resetDEFNameMaxLength() {
        this._reset(DTOFIELD_DEFNAMEMAXLENGTH);
    }

    @JsonIgnore
    public PSDCModelTemplDTO defnamemaxlength(Integer dEFNameMaxLength) {
        this.setDEFNameMaxLength(dEFNameMaxLength);
        return this;
    }

    @JsonProperty(value="denamemaxlength")
    public void setDENameMaxLength(Integer dENameMaxLength) {
        this._set(DTOFIELD_DENAMEMAXLENGTH, dENameMaxLength);
    }

    @JsonIgnore
    public Integer getDENameMaxLength() {
        Object objValue = this._get(DTOFIELD_DENAMEMAXLENGTH);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDENameMaxLengthDirty() {
        return this._contains(DTOFIELD_DENAMEMAXLENGTH);
    }

    @JsonIgnore
    public void resetDENameMaxLength() {
        this._reset(DTOFIELD_DENAMEMAXLENGTH);
    }

    @JsonIgnore
    public PSDCModelTemplDTO denamemaxlength(Integer dENameMaxLength) {
        this.setDENameMaxLength(dENameMaxLength);
        return this;
    }

    @JsonProperty(value="ignoredefaultfields")
    public void setIgnoreDefaultFields(Integer ignoreDefaultFields) {
        this._set(DTOFIELD_IGNOREDEFAULTFIELDS, ignoreDefaultFields);
    }

    @JsonIgnore
    public Integer getIgnoreDefaultFields() {
        Object objValue = this._get(DTOFIELD_IGNOREDEFAULTFIELDS);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isIgnoreDefaultFieldsDirty() {
        return this._contains(DTOFIELD_IGNOREDEFAULTFIELDS);
    }

    @JsonIgnore
    public void resetIgnoreDefaultFields() {
        this._reset(DTOFIELD_IGNOREDEFAULTFIELDS);
    }

    @JsonIgnore
    public PSDCModelTemplDTO ignoredefaultfields(Integer ignoreDefaultFields) {
        this.setIgnoreDefaultFields(ignoreDefaultFields);
        return this;
    }

    @JsonIgnore
    public PSDCModelTemplDTO ignoredefaultfields(Boolean ignoreDefaultFields) {
        this.setIgnoreDefaultFields(ignoreDefaultFields == null ? null : (ignoreDefaultFields ? 1 : 0));
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
    public PSDCModelTemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psdcmodeltemplid")
    public void setPSDCModelTemplId(String pSDCModelTemplId) {
        this._set(DTOFIELD_PSDCMODELTEMPLID, pSDCModelTemplId);
    }

    @JsonIgnore
    public String getPSDCModelTemplId() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLID);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplIdDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public void resetPSDCModelTemplId() {
        this._reset(DTOFIELD_PSDCMODELTEMPLID);
    }

    @JsonIgnore
    public PSDCModelTemplDTO psdcmodeltemplid(String pSDCModelTemplId) {
        this.setPSDCModelTemplId(pSDCModelTemplId);
        return this;
    }

    @JsonProperty(value="psdcmodeltemplname")
    public void setPSDCModelTemplName(String pSDCModelTemplName) {
        this._set(DTOFIELD_PSDCMODELTEMPLNAME, pSDCModelTemplName);
    }

    @JsonIgnore
    public String getPSDCModelTemplName() {
        Object objValue = this._get(DTOFIELD_PSDCMODELTEMPLNAME);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDCModelTemplNameDirty() {
        return this._contains(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSDCModelTemplName() {
        this._reset(DTOFIELD_PSDCMODELTEMPLNAME);
    }

    @JsonIgnore
    public PSDCModelTemplDTO psdcmodeltemplname(String pSDCModelTemplName) {
        this.setPSDCModelTemplName(pSDCModelTemplName);
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
    public PSDCModelTemplDTO psdevcenterid(String pSDevCenterId) {
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    public PSDCModelTemplDTO psdevcenterid(PSDevCenterDTO pSDevCenter) {
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
    public PSDCModelTemplDTO psdevcentername(String pSDevCenterName) {
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
    public PSDCModelTemplDTO psdevslnid(String pSDevSlnId) {
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    @JsonIgnore
    public PSDCModelTemplDTO psdevslnid(PSDevSlnDTO pSDevSln) {
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
    public PSDCModelTemplDTO psdevslnname(String pSDevSlnName) {
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    @JsonProperty(value="tableprefix")
    public void setTablePrefix(String tablePrefix) {
        this._set(DTOFIELD_TABLEPREFIX, tablePrefix);
    }

    @JsonIgnore
    public String getTablePrefix() {
        Object objValue = this._get(DTOFIELD_TABLEPREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTablePrefixDirty() {
        return this._contains(DTOFIELD_TABLEPREFIX);
    }

    @JsonIgnore
    public void resetTablePrefix() {
        this._reset(DTOFIELD_TABLEPREFIX);
    }

    @JsonIgnore
    public PSDCModelTemplDTO tableprefix(String tablePrefix) {
        this.setTablePrefix(tablePrefix);
        return this;
    }

    @JsonProperty(value="tableprefixflag")
    public void setTablePrefixFlag(Integer tablePrefixFlag) {
        this._set(DTOFIELD_TABLEPREFIXFLAG, tablePrefixFlag);
    }

    @JsonIgnore
    public Integer getTablePrefixFlag() {
        Object objValue = this._get(DTOFIELD_TABLEPREFIXFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isTablePrefixFlagDirty() {
        return this._contains(DTOFIELD_TABLEPREFIXFLAG);
    }

    @JsonIgnore
    public void resetTablePrefixFlag() {
        this._reset(DTOFIELD_TABLEPREFIXFLAG);
    }

    @JsonIgnore
    public PSDCModelTemplDTO tableprefixflag(Integer tablePrefixFlag) {
        this.setTablePrefixFlag(tablePrefixFlag);
        return this;
    }

    @JsonIgnore
    public PSDCModelTemplDTO tableprefixflag(Boolean tablePrefixFlag) {
        this.setTablePrefixFlag(tablePrefixFlag == null ? null : (tablePrefixFlag ? 1 : 0));
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
    public PSDCModelTemplDTO updatedate(Timestamp updateDate) {
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
    public PSDCModelTemplDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="view2prefix")
    public void setView2Prefix(String view2Prefix) {
        this._set(DTOFIELD_VIEW2PREFIX, view2Prefix);
    }

    @JsonIgnore
    public String getView2Prefix() {
        Object objValue = this._get(DTOFIELD_VIEW2PREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isView2PrefixDirty() {
        return this._contains(DTOFIELD_VIEW2PREFIX);
    }

    @JsonIgnore
    public void resetView2Prefix() {
        this._reset(DTOFIELD_VIEW2PREFIX);
    }

    @JsonIgnore
    public PSDCModelTemplDTO view2prefix(String view2Prefix) {
        this.setView2Prefix(view2Prefix);
        return this;
    }

    @JsonProperty(value="view3prefix")
    public void setView3Prefix(String view3Prefix) {
        this._set(DTOFIELD_VIEW3PREFIX, view3Prefix);
    }

    @JsonIgnore
    public String getView3Prefix() {
        Object objValue = this._get(DTOFIELD_VIEW3PREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isView3PrefixDirty() {
        return this._contains(DTOFIELD_VIEW3PREFIX);
    }

    @JsonIgnore
    public void resetView3Prefix() {
        this._reset(DTOFIELD_VIEW3PREFIX);
    }

    @JsonIgnore
    public PSDCModelTemplDTO view3prefix(String view3Prefix) {
        this.setView3Prefix(view3Prefix);
        return this;
    }

    @JsonProperty(value="view4prefix")
    public void setView4Prefix(String view4Prefix) {
        this._set(DTOFIELD_VIEW4PREFIX, view4Prefix);
    }

    @JsonIgnore
    public String getView4Prefix() {
        Object objValue = this._get(DTOFIELD_VIEW4PREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isView4PrefixDirty() {
        return this._contains(DTOFIELD_VIEW4PREFIX);
    }

    @JsonIgnore
    public void resetView4Prefix() {
        this._reset(DTOFIELD_VIEW4PREFIX);
    }

    @JsonIgnore
    public PSDCModelTemplDTO view4prefix(String view4Prefix) {
        this.setView4Prefix(view4Prefix);
        return this;
    }

    @JsonProperty(value="viewprefix")
    public void setViewPrefix(String viewPrefix) {
        this._set(DTOFIELD_VIEWPREFIX, viewPrefix);
    }

    @JsonIgnore
    public String getViewPrefix() {
        Object objValue = this._get(DTOFIELD_VIEWPREFIX);
        if (objValue == null) return null;
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewPrefixDirty() {
        return this._contains(DTOFIELD_VIEWPREFIX);
    }

    @JsonIgnore
    public void resetViewPrefix() {
        this._reset(DTOFIELD_VIEWPREFIX);
    }

    @JsonIgnore
    public PSDCModelTemplDTO viewprefix(String viewPrefix) {
        this.setViewPrefix(viewPrefix);
        return this;
    }

    @JsonProperty(value="viewprefixflag")
    public void setViewPrefixFlag(Integer viewPrefixFlag) {
        this._set(DTOFIELD_VIEWPREFIXFLAG, viewPrefixFlag);
    }

    @JsonIgnore
    public Integer getViewPrefixFlag() {
        Object objValue = this._get(DTOFIELD_VIEWPREFIXFLAG);
        if (objValue == null) return null;
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewPrefixFlagDirty() {
        return this._contains(DTOFIELD_VIEWPREFIXFLAG);
    }

    @JsonIgnore
    public void resetViewPrefixFlag() {
        this._reset(DTOFIELD_VIEWPREFIXFLAG);
    }

    @JsonIgnore
    public PSDCModelTemplDTO viewprefixflag(Integer viewPrefixFlag) {
        this.setViewPrefixFlag(viewPrefixFlag);
        return this;
    }

    @JsonIgnore
    public PSDCModelTemplDTO viewprefixflag(Boolean viewPrefixFlag) {
        this.setViewPrefixFlag(viewPrefixFlag == null ? null : (viewPrefixFlag ? 1 : 0));
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDCModelTemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDCModelTemplName(strName);
    }

    @JsonIgnore
    public PSDCModelTemplDTO name(String strName) {
        this.setPSDCModelTemplName(strName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDCModelTemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDCModelTemplId(strValue);
    }

    @JsonIgnore
    public PSDCModelTemplDTO id(String strValue) {
        this.setPSDCModelTemplId(strValue);
        return this;
    }

}
