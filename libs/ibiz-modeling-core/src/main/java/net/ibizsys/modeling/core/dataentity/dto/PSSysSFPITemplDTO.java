package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSSFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysSFPITemplDTO
extends PSModelDTOBase {
    public static final String FIELD_CODEMAP = "CODEMAP";
    protected static final String DTOFIELD_CODEMAP = "codemap";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSSFID = "PSSFID";
    protected static final String DTOFIELD_PSSFID = "pssfid";
    public static final String FIELD_PSSFNAME = "PSSFNAME";
    protected static final String DTOFIELD_PSSFNAME = "pssfname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPITEMPLID = "PSSYSSFPITEMPLID";
    protected static final String DTOFIELD_PSSYSSFPITEMPLID = "pssyssfpitemplid";
    public static final String FIELD_PSSYSSFPITEMPLNAME = "PSSYSSFPITEMPLNAME";
    protected static final String DTOFIELD_PSSYSSFPITEMPLNAME = "pssyssfpitemplname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_TEMPLCODE = "TEMPLCODE";
    protected static final String DTOFIELD_TEMPLCODE = "templcode";
    public static final String FIELD_TEMPLCODE2 = "TEMPLCODE2";
    protected static final String DTOFIELD_TEMPLCODE2 = "templcode2";
    public static final String FIELD_TEMPLCODE3 = "TEMPLCODE3";
    protected static final String DTOFIELD_TEMPLCODE3 = "templcode3";
    public static final String FIELD_TEMPLCODE4 = "TEMPLCODE4";
    protected static final String DTOFIELD_TEMPLCODE4 = "templcode4";
    public static final String FIELD_TEMPLCODE5 = "TEMPLCODE5";
    protected static final String DTOFIELD_TEMPLCODE5 = "templcode5";
    public static final String FIELD_TEMPLCODE6 = "TEMPLCODE6";
    protected static final String DTOFIELD_TEMPLCODE6 = "templcode6";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";

    @JsonProperty(value="codemap")
    public void setCodeMap(String codeMap) {
        this._set(DTOFIELD_CODEMAP, codeMap);
    }

    @JsonIgnore
    public String getCodeMap() {
        Object objValue = this._get(DTOFIELD_CODEMAP);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeMapDirty() {
        return this._contains(DTOFIELD_CODEMAP);
    }

    @JsonIgnore
    public void resetCodeMap() {
        this._reset(DTOFIELD_CODEMAP);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO codemap(String codeMap) {
        this.setCodeMap(codeMap);
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
    public PSSysSFPITemplDTO createdate(Timestamp createDate) {
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
    public PSSysSFPITemplDTO createman(String createMan) {
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
    public PSSysSFPITemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pssfid")
    public void setPSSFId(String pSSFId) {
        this._set(DTOFIELD_PSSFID, pSSFId);
    }

    @JsonIgnore
    public String getPSSFId() {
        Object objValue = this._get(DTOFIELD_PSSFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFIdDirty() {
        return this._contains(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public void resetPSSFId() {
        this._reset(DTOFIELD_PSSFID);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssfid(String pSSFId) {
        this.setPSSFId(pSSFId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssfid(PSSFDTO pSSF) {
        if (pSSF == null) {
            this.setPSSFId(null);
            this.setPSSFName(null);
        } else {
            this.setPSSFId(pSSF.getPSSFId());
            this.setPSSFName(pSSF.getPSSFName());
        }
        return this;
    }

    @JsonProperty(value="pssfname")
    public void setPSSFName(String pSSFName) {
        this._set(DTOFIELD_PSSFNAME, pSSFName);
    }

    @JsonIgnore
    public String getPSSFName() {
        Object objValue = this._get(DTOFIELD_PSSFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSFNameDirty() {
        return this._contains(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public void resetPSSFName() {
        this._reset(DTOFIELD_PSSFNAME);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssfname(String pSSFName) {
        this.setPSSFName(pSSFName);
        return this;
    }

    @JsonProperty(value="pssysdynamodelid")
    public void setPSSysDynaModelId(String pSSysDynaModelId) {
        this._set(DTOFIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }

    @JsonIgnore
    public String getPSSysDynaModelId() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public void resetPSSysDynaModelId() {
        this._reset(DTOFIELD_PSSYSDYNAMODELID);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
        if (pSSysDynaModel == null) {
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        } else {
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    @JsonProperty(value="pssysdynamodelname")
    public void setPSSysDynaModelName(String pSSysDynaModelName) {
        this._set(DTOFIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }

    @JsonIgnore
    public String getPSSysDynaModelName() {
        Object objValue = this._get(DTOFIELD_PSSYSDYNAMODELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty() {
        return this._contains(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public void resetPSSysDynaModelName() {
        this._reset(DTOFIELD_PSSYSDYNAMODELNAME);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyssfpitemplid")
    public void setPSSysSFPITemplId(String pSSysSFPITemplId) {
        this._set(DTOFIELD_PSSYSSFPITEMPLID, pSSysSFPITemplId);
    }

    @JsonIgnore
    public String getPSSysSFPITemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPITEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPITemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPITEMPLID);
    }

    @JsonIgnore
    public void resetPSSysSFPITemplId() {
        this._reset(DTOFIELD_PSSYSSFPITEMPLID);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssyssfpitemplid(String pSSysSFPITemplId) {
        this.setPSSysSFPITemplId(pSSysSFPITemplId);
        return this;
    }

    @JsonProperty(value="pssyssfpitemplname")
    public void setPSSysSFPITemplName(String pSSysSFPITemplName) {
        this._set(DTOFIELD_PSSYSSFPITEMPLNAME, pSSysSFPITemplName);
    }

    @JsonIgnore
    public String getPSSysSFPITemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPITEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPITemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPITEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPITemplName() {
        this._reset(DTOFIELD_PSSYSSFPITEMPLNAME);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssyssfpitemplname(String pSSysSFPITemplName) {
        this.setPSSysSFPITemplName(pSSysSFPITemplName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysSFPITemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysSFPITemplName(strName);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO name(String strName) {
        this.setPSSysSFPITemplName(strName);
        return this;
    }

    @JsonProperty(value="pssyssfpluginid")
    public void setPSSysSFPluginId(String pSSysSFPluginId) {
        this._set(DTOFIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }

    @JsonIgnore
    public String getPSSysSFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysSFPluginId() {
        this._reset(DTOFIELD_PSSYSSFPLUGINID);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
        if (pSSysSFPlugin == null) {
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        } else {
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyssfpluginname")
    public void setPSSysSFPluginName(String pSSysSFPluginName) {
        this._set(DTOFIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }

    @JsonIgnore
    public String getPSSysSFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSSFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysSFPluginName() {
        this._reset(DTOFIELD_PSSYSSFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="templcode")
    public void setTemplCode(String templCode) {
        this._set(DTOFIELD_TEMPLCODE, templCode);
    }

    @JsonIgnore
    public String getTemplCode() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCodeDirty() {
        return this._contains(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public void resetTemplCode() {
        this._reset(DTOFIELD_TEMPLCODE);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode(String templCode) {
        this.setTemplCode(templCode);
        return this;
    }

    @JsonProperty(value="templcode2")
    public void setTemplCode2(String templCode2) {
        this._set(DTOFIELD_TEMPLCODE2, templCode2);
    }

    @JsonIgnore
    public String getTemplCode2() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode2Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE2);
    }

    @JsonIgnore
    public void resetTemplCode2() {
        this._reset(DTOFIELD_TEMPLCODE2);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode2(String templCode2) {
        this.setTemplCode2(templCode2);
        return this;
    }

    @JsonProperty(value="templcode3")
    public void setTemplCode3(String templCode3) {
        this._set(DTOFIELD_TEMPLCODE3, templCode3);
    }

    @JsonIgnore
    public String getTemplCode3() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode3Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE3);
    }

    @JsonIgnore
    public void resetTemplCode3() {
        this._reset(DTOFIELD_TEMPLCODE3);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode3(String templCode3) {
        this.setTemplCode3(templCode3);
        return this;
    }

    @JsonProperty(value="templcode4")
    public void setTemplCode4(String templCode4) {
        this._set(DTOFIELD_TEMPLCODE4, templCode4);
    }

    @JsonIgnore
    public String getTemplCode4() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode4Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE4);
    }

    @JsonIgnore
    public void resetTemplCode4() {
        this._reset(DTOFIELD_TEMPLCODE4);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode4(String templCode4) {
        this.setTemplCode4(templCode4);
        return this;
    }

    @JsonProperty(value="templcode5")
    public void setTemplCode5(String templCode5) {
        this._set(DTOFIELD_TEMPLCODE5, templCode5);
    }

    @JsonIgnore
    public String getTemplCode5() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE5);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode5Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE5);
    }

    @JsonIgnore
    public void resetTemplCode5() {
        this._reset(DTOFIELD_TEMPLCODE5);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode5(String templCode5) {
        this.setTemplCode5(templCode5);
        return this;
    }

    @JsonProperty(value="templcode6")
    public void setTemplCode6(String templCode6) {
        this._set(DTOFIELD_TEMPLCODE6, templCode6);
    }

    @JsonIgnore
    public String getTemplCode6() {
        Object objValue = this._get(DTOFIELD_TEMPLCODE6);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTemplCode6Dirty() {
        return this._contains(DTOFIELD_TEMPLCODE6);
    }

    @JsonIgnore
    public void resetTemplCode6() {
        this._reset(DTOFIELD_TEMPLCODE6);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO templcode6(String templCode6) {
        this.setTemplCode6(templCode6);
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
    public PSSysSFPITemplDTO updatedate(Timestamp updateDate) {
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
    public PSSysSFPITemplDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysSFPITemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysSFPITemplId(strValue);
    }

    @JsonIgnore
    public PSSysSFPITemplDTO id(String strValue) {
        this.setPSSysSFPITemplId(strValue);
        return this;
    }
}
