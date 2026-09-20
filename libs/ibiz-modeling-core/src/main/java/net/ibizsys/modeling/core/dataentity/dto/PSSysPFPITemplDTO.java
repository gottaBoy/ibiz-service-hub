package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.modeling.core.dataentity.dto.PSPFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysPFPITemplDTO
extends PSModelDTOBase {
    public static final String FIELD_CODEMAP = "CODEMAP";
    protected static final String DTOFIELD_CODEMAP = "codemap";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSPFID = "PSPFID";
    protected static final String DTOFIELD_PSPFID = "pspfid";
    public static final String FIELD_PSPFNAME = "PSPFNAME";
    protected static final String DTOFIELD_PSPFNAME = "pspfname";
    public static final String FIELD_PSPFPUBCODENAME = "PSPFPUBCODENAME";
    protected static final String DTOFIELD_PSPFPUBCODENAME = "pspfpubcodename";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSPFPITEMPLID = "PSSYSPFPITEMPLID";
    protected static final String DTOFIELD_PSSYSPFPITEMPLID = "pssyspfpitemplid";
    public static final String FIELD_PSSYSPFPITEMPLNAME = "PSSYSPFPITEMPLNAME";
    protected static final String DTOFIELD_PSSYSPFPITEMPLNAME = "pssyspfpitemplname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
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
    public PSSysPFPITemplDTO codemap(String codeMap) {
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
    public PSSysPFPITemplDTO createdate(Timestamp createDate) {
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
    public PSSysPFPITemplDTO createman(String createMan) {
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
    public PSSysPFPITemplDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="pspfid")
    public void setPSPFId(String pSPFId) {
        this._set(DTOFIELD_PSPFID, pSPFId);
    }

    @JsonIgnore
    public String getPSPFId() {
        Object objValue = this._get(DTOFIELD_PSPFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFIdDirty() {
        return this._contains(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public void resetPSPFId() {
        this._reset(DTOFIELD_PSPFID);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pspfid(String pSPFId) {
        this.setPSPFId(pSPFId);
        return this;
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pspfid(PSPFDTO pSPF) {
        if (pSPF == null) {
            this.setPSPFId(null);
            this.setPSPFName(null);
        } else {
            this.setPSPFId(pSPF.getPSPFId());
            this.setPSPFName(pSPF.getPSPFName());
        }
        return this;
    }

    @JsonProperty(value="pspfname")
    public void setPSPFName(String pSPFName) {
        this._set(DTOFIELD_PSPFNAME, pSPFName);
    }

    @JsonIgnore
    public String getPSPFName() {
        Object objValue = this._get(DTOFIELD_PSPFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFNameDirty() {
        return this._contains(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public void resetPSPFName() {
        this._reset(DTOFIELD_PSPFNAME);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pspfname(String pSPFName) {
        this.setPSPFName(pSPFName);
        return this;
    }

    @JsonProperty(value="pspfpubcodename")
    public void setPSPFPubCodeName(String pSPFPubCodeName) {
        this._set(DTOFIELD_PSPFPUBCODENAME, pSPFPubCodeName);
    }

    @JsonIgnore
    public String getPSPFPubCodeName() {
        Object objValue = this._get(DTOFIELD_PSPFPUBCODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPFPubCodeNameDirty() {
        return this._contains(DTOFIELD_PSPFPUBCODENAME);
    }

    @JsonIgnore
    public void resetPSPFPubCodeName() {
        this._reset(DTOFIELD_PSPFPUBCODENAME);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pspfpubcodename(String pSPFPubCodeName) {
        this.setPSPFPubCodeName(pSPFPubCodeName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssid(PSSysCssDTO pSSysCss) {
        if (pSSysCss == null) {
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        } else {
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
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
    public PSSysPFPITemplDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysPFPITemplDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    @JsonProperty(value="pssyspfpitemplid")
    public void setPSSysPFPITemplId(String pSSysPFPITemplId) {
        this._set(DTOFIELD_PSSYSPFPITEMPLID, pSSysPFPITemplId);
    }

    @JsonIgnore
    public String getPSSysPFPITemplId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPITEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPITemplIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPITEMPLID);
    }

    @JsonIgnore
    public void resetPSSysPFPITemplId() {
        this._reset(DTOFIELD_PSSYSPFPITEMPLID);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpitemplid(String pSSysPFPITemplId) {
        this.setPSSysPFPITemplId(pSSysPFPITemplId);
        return this;
    }

    @JsonProperty(value="pssyspfpitemplname")
    public void setPSSysPFPITemplName(String pSSysPFPITemplName) {
        this._set(DTOFIELD_PSSYSPFPITEMPLNAME, pSSysPFPITemplName);
    }

    @JsonIgnore
    public String getPSSysPFPITemplName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPITEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPITemplNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPITEMPLNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPITemplName() {
        this._reset(DTOFIELD_PSSYSPFPITEMPLNAME);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpitemplname(String pSSysPFPITemplName) {
        this.setPSSysPFPITemplName(pSSysPFPITemplName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysPFPITemplName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysPFPITemplName(strName);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO name(String strName) {
        this.setPSSysPFPITemplName(strName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSysPFPITemplDTO templcode(String templCode) {
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
    public PSSysPFPITemplDTO templcode2(String templCode2) {
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
    public PSSysPFPITemplDTO templcode3(String templCode3) {
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
    public PSSysPFPITemplDTO templcode4(String templCode4) {
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
    public PSSysPFPITemplDTO templcode5(String templCode5) {
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
    public PSSysPFPITemplDTO templcode6(String templCode6) {
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
    public PSSysPFPITemplDTO updatedate(Timestamp updateDate) {
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
    public PSSysPFPITemplDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysPFPITemplId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysPFPITemplId(strValue);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO id(String strValue) {
        this.setPSSysPFPITemplId(strValue);
        return this;
    }
}
