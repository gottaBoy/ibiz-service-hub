package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysUniStateDTO
extends PSModelDTOBase {
    public static final String FIELD_ALLDATAFLAG = "ALLDATAFLAG";
    protected static final String DTOFIELD_ALLDATAFLAG = "alldataflag";
    public static final String FIELD_CACHECAT = "CACHECAT";
    protected static final String DTOFIELD_CACHECAT = "cachecat";
    public static final String FIELD_CACHESCOPE = "CACHESCOPE";
    protected static final String DTOFIELD_CACHESCOPE = "cachescope";
    public static final String FIELD_CACHETIMEOUT = "CACHETIMEOUT";
    protected static final String DTOFIELD_CACHETIMEOUT = "cachetimeout";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEDEFAULTFLAG = "DEDEFAULTFLAG";
    protected static final String DTOFIELD_DEDEFAULTFLAG = "dedefaultflag";
    public static final String FIELD_DELETEASUPDATE = "DELETEASUPDATE";
    protected static final String DTOFIELD_DELETEASUPDATE = "deleteasupdate";
    public static final String FIELD_INITPSDELOGICID = "INITPSDELOGICID";
    protected static final String DTOFIELD_INITPSDELOGICID = "initpsdelogicid";
    public static final String FIELD_INITPSDELOGICNAME = "INITPSDELOGICNAME";
    protected static final String DTOFIELD_INITPSDELOGICNAME = "initpsdelogicname";
    public static final String FIELD_KEY2PSDEFID = "KEY2PSDEFID";
    protected static final String DTOFIELD_KEY2PSDEFID = "key2psdefid";
    public static final String FIELD_KEY2PSDEFNAME = "KEY2PSDEFNAME";
    protected static final String DTOFIELD_KEY2PSDEFNAME = "key2psdefname";
    public static final String FIELD_KEY3PSDEFID = "KEY3PSDEFID";
    protected static final String DTOFIELD_KEY3PSDEFID = "key3psdefid";
    public static final String FIELD_KEY3PSDEFNAME = "KEY3PSDEFNAME";
    protected static final String DTOFIELD_KEY3PSDEFNAME = "key3psdefname";
    public static final String FIELD_KEY4PSDEFID = "KEY4PSDEFID";
    protected static final String DTOFIELD_KEY4PSDEFID = "key4psdefid";
    public static final String FIELD_KEY4PSDEFNAME = "KEY4PSDEFNAME";
    protected static final String DTOFIELD_KEY4PSDEFNAME = "key4psdefname";
    public static final String FIELD_KEY5PSDEFID = "KEY5PSDEFID";
    protected static final String DTOFIELD_KEY5PSDEFID = "key5psdefid";
    public static final String FIELD_KEY5PSDEFNAME = "KEY5PSDEFNAME";
    protected static final String DTOFIELD_KEY5PSDEFNAME = "key5psdefname";
    public static final String FIELD_KEY6PSDEFID = "KEY6PSDEFID";
    protected static final String DTOFIELD_KEY6PSDEFID = "key6psdefid";
    public static final String FIELD_KEY6PSDEFNAME = "KEY6PSDEFNAME";
    protected static final String DTOFIELD_KEY6PSDEFNAME = "key6psdefname";
    public static final String FIELD_KEY7PSDEFID = "KEY7PSDEFID";
    protected static final String DTOFIELD_KEY7PSDEFID = "key7psdefid";
    public static final String FIELD_KEY7PSDEFNAME = "KEY7PSDEFNAME";
    protected static final String DTOFIELD_KEY7PSDEFNAME = "key7psdefname";
    public static final String FIELD_KEY8PSDEFID = "KEY8PSDEFID";
    protected static final String DTOFIELD_KEY8PSDEFID = "key8psdefid";
    public static final String FIELD_KEY8PSDEFNAME = "KEY8PSDEFNAME";
    protected static final String DTOFIELD_KEY8PSDEFNAME = "key8psdefname";
    public static final String FIELD_KEY9PSDEFID = "KEY9PSDEFID";
    protected static final String DTOFIELD_KEY9PSDEFID = "key9psdefid";
    public static final String FIELD_KEY9PSDEFNAME = "KEY9PSDEFNAME";
    protected static final String DTOFIELD_KEY9PSDEFNAME = "key9psdefname";
    public static final String FIELD_KEYFORMAT = "KEYFORMAT";
    protected static final String DTOFIELD_KEYFORMAT = "keyformat";
    public static final String FIELD_KEYPSDEFID = "KEYPSDEFID";
    protected static final String DTOFIELD_KEYPSDEFID = "keypsdefid";
    public static final String FIELD_KEYPSDEFNAME = "KEYPSDEFNAME";
    protected static final String DTOFIELD_KEYPSDEFNAME = "keypsdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MONITORFORMAT = "MONITORFORMAT";
    protected static final String DTOFIELD_MONITORFORMAT = "monitorformat";
    public static final String FIELD_ONCHANGEPSDELOGICID = "ONCHANGEPSDELOGICID";
    protected static final String DTOFIELD_ONCHANGEPSDELOGICID = "onchangepsdelogicid";
    public static final String FIELD_ONCHANGEPSDELOGICNAME = "ONCHANGEPSDELOGICNAME";
    protected static final String DTOFIELD_ONCHANGEPSDELOGICNAME = "onchangepsdelogicname";
    public static final String FIELD_ONDELETEPSDELOGICID = "ONDELETEPSDELOGICID";
    protected static final String DTOFIELD_ONDELETEPSDELOGICID = "ondeletepsdelogicid";
    public static final String FIELD_ONDELETEPSDELOGICNAME = "ONDELETEPSDELOGICNAME";
    protected static final String DTOFIELD_ONDELETEPSDELOGICNAME = "ondeletepsdelogicname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNISTATEID = "PSSYSUNISTATEID";
    protected static final String DTOFIELD_PSSYSUNISTATEID = "pssysunistateid";
    public static final String FIELD_PSSYSUNISTATENAME = "PSSYSUNISTATENAME";
    protected static final String DTOFIELD_PSSYSUNISTATENAME = "pssysunistatename";
    public static final String FIELD_PSSYSUTILDEID = "PSSYSUTILDEID";
    protected static final String DTOFIELD_PSSYSUTILDEID = "pssysutildeid";
    public static final String FIELD_PSSYSUTILDENAME = "PSSYSUTILDENAME";
    protected static final String DTOFIELD_PSSYSUTILDENAME = "pssysutildename";
    public static final String FIELD_RELOADTIMER = "RELOADTIMER";
    protected static final String DTOFIELD_RELOADTIMER = "reloadtimer";
    public static final String FIELD_STATE2PSDEFID = "STATE2PSDEFID";
    protected static final String DTOFIELD_STATE2PSDEFID = "state2psdefid";
    public static final String FIELD_STATE2PSDEFNAME = "STATE2PSDEFNAME";
    protected static final String DTOFIELD_STATE2PSDEFNAME = "state2psdefname";
    public static final String FIELD_STATE3PSDEFID = "STATE3PSDEFID";
    protected static final String DTOFIELD_STATE3PSDEFID = "state3psdefid";
    public static final String FIELD_STATE3PSDEFNAME = "STATE3PSDEFNAME";
    protected static final String DTOFIELD_STATE3PSDEFNAME = "state3psdefname";
    public static final String FIELD_STATE4PSDEFID = "STATE4PSDEFID";
    protected static final String DTOFIELD_STATE4PSDEFID = "state4psdefid";
    public static final String FIELD_STATE4PSDEFNAME = "STATE4PSDEFNAME";
    protected static final String DTOFIELD_STATE4PSDEFNAME = "state4psdefname";
    public static final String FIELD_STATE5PSDEFID = "STATE5PSDEFID";
    protected static final String DTOFIELD_STATE5PSDEFID = "state5psdefid";
    public static final String FIELD_STATE5PSDEFNAME = "STATE5PSDEFNAME";
    protected static final String DTOFIELD_STATE5PSDEFNAME = "state5psdefname";
    public static final String FIELD_STATE6PSDEFID = "STATE6PSDEFID";
    protected static final String DTOFIELD_STATE6PSDEFID = "state6psdefid";
    public static final String FIELD_STATE6PSDEFNAME = "STATE6PSDEFNAME";
    protected static final String DTOFIELD_STATE6PSDEFNAME = "state6psdefname";
    public static final String FIELD_STATE7PSDEFID = "STATE7PSDEFID";
    protected static final String DTOFIELD_STATE7PSDEFID = "state7psdefid";
    public static final String FIELD_STATE7PSDEFNAME = "STATE7PSDEFNAME";
    protected static final String DTOFIELD_STATE7PSDEFNAME = "state7psdefname";
    public static final String FIELD_STATE8PSDEFID = "STATE8PSDEFID";
    protected static final String DTOFIELD_STATE8PSDEFID = "state8psdefid";
    public static final String FIELD_STATE8PSDEFNAME = "STATE8PSDEFNAME";
    protected static final String DTOFIELD_STATE8PSDEFNAME = "state8psdefname";
    public static final String FIELD_STATEPSDEFID = "STATEPSDEFID";
    protected static final String DTOFIELD_STATEPSDEFID = "statepsdefid";
    public static final String FIELD_STATEPSDEFNAME = "STATEPSDEFNAME";
    protected static final String DTOFIELD_STATEPSDEFNAME = "statepsdefname";
    public static final String FIELD_UNIQUETAG = "UNIQUETAG";
    protected static final String DTOFIELD_UNIQUETAG = "uniquetag";
    public static final String FIELD_UNISTATEMODE = "UNISTATEMODE";
    protected static final String DTOFIELD_UNISTATEMODE = "unistatemode";
    public static final String FIELD_UNISTATEPARAMS = "UNISTATEPARAMS";
    protected static final String DTOFIELD_UNISTATEPARAMS = "unistateparams";
    public static final String FIELD_UNISTATETAG = "UNISTATETAG";
    protected static final String DTOFIELD_UNISTATETAG = "unistatetag";
    public static final String FIELD_UNISTATETAG2 = "UNISTATETAG2";
    protected static final String DTOFIELD_UNISTATETAG2 = "unistatetag2";
    public static final String FIELD_UNISTATETYPE = "UNISTATETYPE";
    protected static final String DTOFIELD_UNISTATETYPE = "unistatetype";
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

    @JsonProperty(value="alldataflag")
    public void setAllDataFlag(Integer allDataFlag) {
        this._set(DTOFIELD_ALLDATAFLAG, allDataFlag);
    }

    @JsonIgnore
    public Integer getAllDataFlag() {
        Object objValue = this._get(DTOFIELD_ALLDATAFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isAllDataFlagDirty() {
        return this._contains(DTOFIELD_ALLDATAFLAG);
    }

    @JsonIgnore
    public void resetAllDataFlag() {
        this._reset(DTOFIELD_ALLDATAFLAG);
    }

    @JsonIgnore
    public PSSysUniStateDTO alldataflag(Integer allDataFlag) {
        this.setAllDataFlag(allDataFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO alldataflag(Boolean allDataFlag) {
        if (allDataFlag == null) {
            this.setAllDataFlag(null);
        } else {
            this.setAllDataFlag(allDataFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="cachecat")
    public void setCacheCat(String cacheCat) {
        this._set(DTOFIELD_CACHECAT, cacheCat);
    }

    @JsonIgnore
    public String getCacheCat() {
        Object objValue = this._get(DTOFIELD_CACHECAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheCatDirty() {
        return this._contains(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public void resetCacheCat() {
        this._reset(DTOFIELD_CACHECAT);
    }

    @JsonIgnore
    public PSSysUniStateDTO cachecat(String cacheCat) {
        this.setCacheCat(cacheCat);
        return this;
    }

    @JsonProperty(value="cachescope")
    public void setCacheScope(String cacheScope) {
        this._set(DTOFIELD_CACHESCOPE, cacheScope);
    }

    @JsonIgnore
    public String getCacheScope() {
        Object objValue = this._get(DTOFIELD_CACHESCOPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCacheScopeDirty() {
        return this._contains(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public void resetCacheScope() {
        this._reset(DTOFIELD_CACHESCOPE);
    }

    @JsonIgnore
    public PSSysUniStateDTO cachescope(String cacheScope) {
        this.setCacheScope(cacheScope);
        return this;
    }

    @JsonProperty(value="cachetimeout")
    public void setCacheTimeout(Integer cacheTimeout) {
        this._set(DTOFIELD_CACHETIMEOUT, cacheTimeout);
    }

    @JsonIgnore
    public Integer getCacheTimeout() {
        Object objValue = this._get(DTOFIELD_CACHETIMEOUT);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isCacheTimeoutDirty() {
        return this._contains(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public void resetCacheTimeout() {
        this._reset(DTOFIELD_CACHETIMEOUT);
    }

    @JsonIgnore
    public PSSysUniStateDTO cachetimeout(Integer cacheTimeout) {
        this.setCacheTimeout(cacheTimeout);
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
    public PSSysUniStateDTO createdate(Timestamp createDate) {
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
    public PSSysUniStateDTO createman(String createMan) {
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
    public PSSysUniStateDTO customcode(String customCode) {
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
    public PSSysUniStateDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="dedefaultflag")
    public void setDEDefaultFlag(Integer dEDefaultFlag) {
        this._set(DTOFIELD_DEDEFAULTFLAG, dEDefaultFlag);
    }

    @JsonIgnore
    public Integer getDEDefaultFlag() {
        Object objValue = this._get(DTOFIELD_DEDEFAULTFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDEDefaultFlagDirty() {
        return this._contains(DTOFIELD_DEDEFAULTFLAG);
    }

    @JsonIgnore
    public void resetDEDefaultFlag() {
        this._reset(DTOFIELD_DEDEFAULTFLAG);
    }

    @JsonIgnore
    public PSSysUniStateDTO dedefaultflag(Integer dEDefaultFlag) {
        this.setDEDefaultFlag(dEDefaultFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO dedefaultflag(Boolean dEDefaultFlag) {
        if (dEDefaultFlag == null) {
            this.setDEDefaultFlag(null);
        } else {
            this.setDEDefaultFlag(dEDefaultFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="deleteasupdate")
    public void setDeleteAsUpdate(Integer deleteAsUpdate) {
        this._set(DTOFIELD_DELETEASUPDATE, deleteAsUpdate);
    }

    @JsonIgnore
    public Integer getDeleteAsUpdate() {
        Object objValue = this._get(DTOFIELD_DELETEASUPDATE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDeleteAsUpdateDirty() {
        return this._contains(DTOFIELD_DELETEASUPDATE);
    }

    @JsonIgnore
    public void resetDeleteAsUpdate() {
        this._reset(DTOFIELD_DELETEASUPDATE);
    }

    @JsonIgnore
    public PSSysUniStateDTO deleteasupdate(Integer deleteAsUpdate) {
        this.setDeleteAsUpdate(deleteAsUpdate);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO deleteasupdate(Boolean deleteAsUpdate) {
        if (deleteAsUpdate == null) {
            this.setDeleteAsUpdate(null);
        } else {
            this.setDeleteAsUpdate(deleteAsUpdate != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="initpsdelogicid")
    public void setInitPSDELogicId(String initPSDELogicId) {
        this._set(DTOFIELD_INITPSDELOGICID, initPSDELogicId);
    }

    @JsonIgnore
    public String getInitPSDELogicId() {
        Object objValue = this._get(DTOFIELD_INITPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInitPSDELogicIdDirty() {
        return this._contains(DTOFIELD_INITPSDELOGICID);
    }

    @JsonIgnore
    public void resetInitPSDELogicId() {
        this._reset(DTOFIELD_INITPSDELOGICID);
    }

    @JsonIgnore
    public PSSysUniStateDTO initpsdelogicid(String initPSDELogicId) {
        this.setInitPSDELogicId(initPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO initpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setInitPSDELogicId(null);
            this.setInitPSDELogicName(null);
        } else {
            this.setInitPSDELogicId(pSDELogic.getPSDELogicId());
            this.setInitPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="initpsdelogicname")
    public void setInitPSDELogicName(String initPSDELogicName) {
        this._set(DTOFIELD_INITPSDELOGICNAME, initPSDELogicName);
    }

    @JsonIgnore
    public String getInitPSDELogicName() {
        Object objValue = this._get(DTOFIELD_INITPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isInitPSDELogicNameDirty() {
        return this._contains(DTOFIELD_INITPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetInitPSDELogicName() {
        this._reset(DTOFIELD_INITPSDELOGICNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO initpsdelogicname(String initPSDELogicName) {
        this.setInitPSDELogicName(initPSDELogicName);
        return this;
    }

    @JsonProperty(value="key2psdefid")
    public void setKey2PSDEFId(String key2PSDEFId) {
        this._set(DTOFIELD_KEY2PSDEFID, key2PSDEFId);
    }

    @JsonIgnore
    public String getKey2PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey2PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY2PSDEFID);
    }

    @JsonIgnore
    public void resetKey2PSDEFId() {
        this._reset(DTOFIELD_KEY2PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key2psdefid(String key2PSDEFId) {
        this.setKey2PSDEFId(key2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey2PSDEFId(null);
            this.setKey2PSDEFName(null);
        } else {
            this.setKey2PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key2psdefname")
    public void setKey2PSDEFName(String key2PSDEFName) {
        this._set(DTOFIELD_KEY2PSDEFNAME, key2PSDEFName);
    }

    @JsonIgnore
    public String getKey2PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey2PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY2PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey2PSDEFName() {
        this._reset(DTOFIELD_KEY2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key2psdefname(String key2PSDEFName) {
        this.setKey2PSDEFName(key2PSDEFName);
        return this;
    }

    @JsonProperty(value="key3psdefid")
    public void setKey3PSDEFId(String key3PSDEFId) {
        this._set(DTOFIELD_KEY3PSDEFID, key3PSDEFId);
    }

    @JsonIgnore
    public String getKey3PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY3PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey3PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY3PSDEFID);
    }

    @JsonIgnore
    public void resetKey3PSDEFId() {
        this._reset(DTOFIELD_KEY3PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key3psdefid(String key3PSDEFId) {
        this.setKey3PSDEFId(key3PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key3psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey3PSDEFId(null);
            this.setKey3PSDEFName(null);
        } else {
            this.setKey3PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key3psdefname")
    public void setKey3PSDEFName(String key3PSDEFName) {
        this._set(DTOFIELD_KEY3PSDEFNAME, key3PSDEFName);
    }

    @JsonIgnore
    public String getKey3PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY3PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey3PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY3PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey3PSDEFName() {
        this._reset(DTOFIELD_KEY3PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key3psdefname(String key3PSDEFName) {
        this.setKey3PSDEFName(key3PSDEFName);
        return this;
    }

    @JsonProperty(value="key4psdefid")
    public void setKey4PSDEFId(String key4PSDEFId) {
        this._set(DTOFIELD_KEY4PSDEFID, key4PSDEFId);
    }

    @JsonIgnore
    public String getKey4PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY4PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey4PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY4PSDEFID);
    }

    @JsonIgnore
    public void resetKey4PSDEFId() {
        this._reset(DTOFIELD_KEY4PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key4psdefid(String key4PSDEFId) {
        this.setKey4PSDEFId(key4PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key4psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey4PSDEFId(null);
            this.setKey4PSDEFName(null);
        } else {
            this.setKey4PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key4psdefname")
    public void setKey4PSDEFName(String key4PSDEFName) {
        this._set(DTOFIELD_KEY4PSDEFNAME, key4PSDEFName);
    }

    @JsonIgnore
    public String getKey4PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY4PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey4PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY4PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey4PSDEFName() {
        this._reset(DTOFIELD_KEY4PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key4psdefname(String key4PSDEFName) {
        this.setKey4PSDEFName(key4PSDEFName);
        return this;
    }

    @JsonProperty(value="key5psdefid")
    public void setKey5PSDEFId(String key5PSDEFId) {
        this._set(DTOFIELD_KEY5PSDEFID, key5PSDEFId);
    }

    @JsonIgnore
    public String getKey5PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY5PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey5PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY5PSDEFID);
    }

    @JsonIgnore
    public void resetKey5PSDEFId() {
        this._reset(DTOFIELD_KEY5PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key5psdefid(String key5PSDEFId) {
        this.setKey5PSDEFId(key5PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key5psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey5PSDEFId(null);
            this.setKey5PSDEFName(null);
        } else {
            this.setKey5PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey5PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key5psdefname")
    public void setKey5PSDEFName(String key5PSDEFName) {
        this._set(DTOFIELD_KEY5PSDEFNAME, key5PSDEFName);
    }

    @JsonIgnore
    public String getKey5PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY5PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey5PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY5PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey5PSDEFName() {
        this._reset(DTOFIELD_KEY5PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key5psdefname(String key5PSDEFName) {
        this.setKey5PSDEFName(key5PSDEFName);
        return this;
    }

    @JsonProperty(value="key6psdefid")
    public void setKey6PSDEFId(String key6PSDEFId) {
        this._set(DTOFIELD_KEY6PSDEFID, key6PSDEFId);
    }

    @JsonIgnore
    public String getKey6PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY6PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey6PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY6PSDEFID);
    }

    @JsonIgnore
    public void resetKey6PSDEFId() {
        this._reset(DTOFIELD_KEY6PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key6psdefid(String key6PSDEFId) {
        this.setKey6PSDEFId(key6PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key6psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey6PSDEFId(null);
            this.setKey6PSDEFName(null);
        } else {
            this.setKey6PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey6PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key6psdefname")
    public void setKey6PSDEFName(String key6PSDEFName) {
        this._set(DTOFIELD_KEY6PSDEFNAME, key6PSDEFName);
    }

    @JsonIgnore
    public String getKey6PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY6PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey6PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY6PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey6PSDEFName() {
        this._reset(DTOFIELD_KEY6PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key6psdefname(String key6PSDEFName) {
        this.setKey6PSDEFName(key6PSDEFName);
        return this;
    }

    @JsonProperty(value="key7psdefid")
    public void setKey7PSDEFId(String key7PSDEFId) {
        this._set(DTOFIELD_KEY7PSDEFID, key7PSDEFId);
    }

    @JsonIgnore
    public String getKey7PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY7PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey7PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY7PSDEFID);
    }

    @JsonIgnore
    public void resetKey7PSDEFId() {
        this._reset(DTOFIELD_KEY7PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key7psdefid(String key7PSDEFId) {
        this.setKey7PSDEFId(key7PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key7psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey7PSDEFId(null);
            this.setKey7PSDEFName(null);
        } else {
            this.setKey7PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey7PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key7psdefname")
    public void setKey7PSDEFName(String key7PSDEFName) {
        this._set(DTOFIELD_KEY7PSDEFNAME, key7PSDEFName);
    }

    @JsonIgnore
    public String getKey7PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY7PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey7PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY7PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey7PSDEFName() {
        this._reset(DTOFIELD_KEY7PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key7psdefname(String key7PSDEFName) {
        this.setKey7PSDEFName(key7PSDEFName);
        return this;
    }

    @JsonProperty(value="key8psdefid")
    public void setKey8PSDEFId(String key8PSDEFId) {
        this._set(DTOFIELD_KEY8PSDEFID, key8PSDEFId);
    }

    @JsonIgnore
    public String getKey8PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY8PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey8PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY8PSDEFID);
    }

    @JsonIgnore
    public void resetKey8PSDEFId() {
        this._reset(DTOFIELD_KEY8PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key8psdefid(String key8PSDEFId) {
        this.setKey8PSDEFId(key8PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key8psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey8PSDEFId(null);
            this.setKey8PSDEFName(null);
        } else {
            this.setKey8PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey8PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key8psdefname")
    public void setKey8PSDEFName(String key8PSDEFName) {
        this._set(DTOFIELD_KEY8PSDEFNAME, key8PSDEFName);
    }

    @JsonIgnore
    public String getKey8PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY8PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey8PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY8PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey8PSDEFName() {
        this._reset(DTOFIELD_KEY8PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key8psdefname(String key8PSDEFName) {
        this.setKey8PSDEFName(key8PSDEFName);
        return this;
    }

    @JsonProperty(value="key9psdefid")
    public void setKey9PSDEFId(String key9PSDEFId) {
        this._set(DTOFIELD_KEY9PSDEFID, key9PSDEFId);
    }

    @JsonIgnore
    public String getKey9PSDEFId() {
        Object objValue = this._get(DTOFIELD_KEY9PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey9PSDEFIdDirty() {
        return this._contains(DTOFIELD_KEY9PSDEFID);
    }

    @JsonIgnore
    public void resetKey9PSDEFId() {
        this._reset(DTOFIELD_KEY9PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO key9psdefid(String key9PSDEFId) {
        this.setKey9PSDEFId(key9PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO key9psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKey9PSDEFId(null);
            this.setKey9PSDEFName(null);
        } else {
            this.setKey9PSDEFId(pSDEField.getPSDEFieldId());
            this.setKey9PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="key9psdefname")
    public void setKey9PSDEFName(String key9PSDEFName) {
        this._set(DTOFIELD_KEY9PSDEFNAME, key9PSDEFName);
    }

    @JsonIgnore
    public String getKey9PSDEFName() {
        Object objValue = this._get(DTOFIELD_KEY9PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKey9PSDEFNameDirty() {
        return this._contains(DTOFIELD_KEY9PSDEFNAME);
    }

    @JsonIgnore
    public void resetKey9PSDEFName() {
        this._reset(DTOFIELD_KEY9PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO key9psdefname(String key9PSDEFName) {
        this.setKey9PSDEFName(key9PSDEFName);
        return this;
    }

    @JsonProperty(value="keyformat")
    public void setKeyFormat(String keyFormat) {
        this._set(DTOFIELD_KEYFORMAT, keyFormat);
    }

    @JsonIgnore
    public String getKeyFormat() {
        Object objValue = this._get(DTOFIELD_KEYFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyFormatDirty() {
        return this._contains(DTOFIELD_KEYFORMAT);
    }

    @JsonIgnore
    public void resetKeyFormat() {
        this._reset(DTOFIELD_KEYFORMAT);
    }

    @JsonIgnore
    public PSSysUniStateDTO keyformat(String keyFormat) {
        this.setKeyFormat(keyFormat);
        return this;
    }

    @JsonProperty(value="keypsdefid")
    public void setKeyPSDEFId(String keyPSDEFId) {
        this._set(DTOFIELD_KEYPSDEFID, keyPSDEFId);
    }

    @JsonIgnore
    public String getKeyPSDEFId() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFIdDirty() {
        return this._contains(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public void resetKeyPSDEFId() {
        this._reset(DTOFIELD_KEYPSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO keypsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        } else {
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="keypsdefname")
    public void setKeyPSDEFName(String keyPSDEFName) {
        this._set(DTOFIELD_KEYPSDEFNAME, keyPSDEFName);
    }

    @JsonIgnore
    public String getKeyPSDEFName() {
        Object objValue = this._get(DTOFIELD_KEYPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isKeyPSDEFNameDirty() {
        return this._contains(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public void resetKeyPSDEFName() {
        this._reset(DTOFIELD_KEYPSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO keypsdefname(String keyPSDEFName) {
        this.setKeyPSDEFName(keyPSDEFName);
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
    public PSSysUniStateDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="monitorformat")
    public void setMonitorFormat(String monitorFormat) {
        this._set(DTOFIELD_MONITORFORMAT, monitorFormat);
    }

    @JsonIgnore
    public String getMonitorFormat() {
        Object objValue = this._get(DTOFIELD_MONITORFORMAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMonitorFormatDirty() {
        return this._contains(DTOFIELD_MONITORFORMAT);
    }

    @JsonIgnore
    public void resetMonitorFormat() {
        this._reset(DTOFIELD_MONITORFORMAT);
    }

    @JsonIgnore
    public PSSysUniStateDTO monitorformat(String monitorFormat) {
        this.setMonitorFormat(monitorFormat);
        return this;
    }

    @JsonProperty(value="onchangepsdelogicid")
    public void setOnChangePSDELogicId(String onChangePSDELogicId) {
        this._set(DTOFIELD_ONCHANGEPSDELOGICID, onChangePSDELogicId);
    }

    @JsonIgnore
    public String getOnChangePSDELogicId() {
        Object objValue = this._get(DTOFIELD_ONCHANGEPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOnChangePSDELogicIdDirty() {
        return this._contains(DTOFIELD_ONCHANGEPSDELOGICID);
    }

    @JsonIgnore
    public void resetOnChangePSDELogicId() {
        this._reset(DTOFIELD_ONCHANGEPSDELOGICID);
    }

    @JsonIgnore
    public PSSysUniStateDTO onchangepsdelogicid(String onChangePSDELogicId) {
        this.setOnChangePSDELogicId(onChangePSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO onchangepsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setOnChangePSDELogicId(null);
            this.setOnChangePSDELogicName(null);
        } else {
            this.setOnChangePSDELogicId(pSDELogic.getPSDELogicId());
            this.setOnChangePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="onchangepsdelogicname")
    public void setOnChangePSDELogicName(String onChangePSDELogicName) {
        this._set(DTOFIELD_ONCHANGEPSDELOGICNAME, onChangePSDELogicName);
    }

    @JsonIgnore
    public String getOnChangePSDELogicName() {
        Object objValue = this._get(DTOFIELD_ONCHANGEPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOnChangePSDELogicNameDirty() {
        return this._contains(DTOFIELD_ONCHANGEPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetOnChangePSDELogicName() {
        this._reset(DTOFIELD_ONCHANGEPSDELOGICNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO onchangepsdelogicname(String onChangePSDELogicName) {
        this.setOnChangePSDELogicName(onChangePSDELogicName);
        return this;
    }

    @JsonProperty(value="ondeletepsdelogicid")
    public void setOnDeletePSDELogicId(String onDeletePSDELogicId) {
        this._set(DTOFIELD_ONDELETEPSDELOGICID, onDeletePSDELogicId);
    }

    @JsonIgnore
    public String getOnDeletePSDELogicId() {
        Object objValue = this._get(DTOFIELD_ONDELETEPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOnDeletePSDELogicIdDirty() {
        return this._contains(DTOFIELD_ONDELETEPSDELOGICID);
    }

    @JsonIgnore
    public void resetOnDeletePSDELogicId() {
        this._reset(DTOFIELD_ONDELETEPSDELOGICID);
    }

    @JsonIgnore
    public PSSysUniStateDTO ondeletepsdelogicid(String onDeletePSDELogicId) {
        this.setOnDeletePSDELogicId(onDeletePSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO ondeletepsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setOnDeletePSDELogicId(null);
            this.setOnDeletePSDELogicName(null);
        } else {
            this.setOnDeletePSDELogicId(pSDELogic.getPSDELogicId());
            this.setOnDeletePSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="ondeletepsdelogicname")
    public void setOnDeletePSDELogicName(String onDeletePSDELogicName) {
        this._set(DTOFIELD_ONDELETEPSDELOGICNAME, onDeletePSDELogicName);
    }

    @JsonIgnore
    public String getOnDeletePSDELogicName() {
        Object objValue = this._get(DTOFIELD_ONDELETEPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOnDeletePSDELogicNameDirty() {
        return this._contains(DTOFIELD_ONDELETEPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetOnDeletePSDELogicName() {
        this._reset(DTOFIELD_ONDELETEPSDELOGICNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO ondeletepsdelogicname(String onDeletePSDELogicName) {
        this.setOnDeletePSDELogicName(onDeletePSDELogicName);
        return this;
    }

    @JsonProperty(value="psdedatasetid")
    public void setPSDEDataSetId(String pSDEDataSetId) {
        this._set(DTOFIELD_PSDEDATASETID, pSDEDataSetId);
    }

    @JsonIgnore
    public String getPSDEDataSetId() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetIdDirty() {
        return this._contains(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public void resetPSDEDataSetId() {
        this._reset(DTOFIELD_PSDEDATASETID);
    }

    @JsonIgnore
    public PSSysUniStateDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
        if (pSDEDataSet == null) {
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        } else {
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    @JsonProperty(value="psdedatasetname")
    public void setPSDEDataSetName(String pSDEDataSetName) {
        this._set(DTOFIELD_PSDEDATASETNAME, pSDEDataSetName);
    }

    @JsonIgnore
    public String getPSDEDataSetName() {
        Object objValue = this._get(DTOFIELD_PSDEDATASETNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataSetNameDirty() {
        return this._contains(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public void resetPSDEDataSetName() {
        this._reset(DTOFIELD_PSDEDATASETNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO psdedatasetname(String pSDEDataSetName) {
        this.setPSDEDataSetName(pSDEDataSetName);
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
    public PSSysUniStateDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO psdeid(PSDataEntityDTO pSDataEntity) {
        if (pSDataEntity == null) {
            this.setPSDEId(null);
            this.setPSDEName(null);
        } else {
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
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
    public PSSysUniStateDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSysUniStateDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
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
    public PSSysUniStateDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysUniStateDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysunistateid")
    public void setPSSysUniStateId(String pSSysUniStateId) {
        this._set(DTOFIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }

    @JsonIgnore
    public String getPSSysUniStateId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public void resetPSSysUniStateId() {
        this._reset(DTOFIELD_PSSYSUNISTATEID);
    }

    @JsonIgnore
    public PSSysUniStateDTO pssysunistateid(String pSSysUniStateId) {
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    @JsonProperty(value="pssysunistatename")
    public void setPSSysUniStateName(String pSSysUniStateName) {
        this._set(DTOFIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }

    @JsonIgnore
    public String getPSSysUniStateName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNISTATENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniStateNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public void resetPSSysUniStateName() {
        this._reset(DTOFIELD_PSSYSUNISTATENAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO pssysunistatename(String pSSysUniStateName) {
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysUniStateName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysUniStateName(strName);
    }

    @JsonIgnore
    public PSSysUniStateDTO name(String strName) {
        this.setPSSysUniStateName(strName);
        return this;
    }

    @JsonProperty(value="pssysutildeid")
    public void setPSSysUtilDEId(String pSSysUtilDEId) {
        this._set(DTOFIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }

    @JsonIgnore
    public String getPSSysUtilDEId() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public void resetPSSysUtilDEId() {
        this._reset(DTOFIELD_PSSYSUTILDEID);
    }

    @JsonIgnore
    public PSSysUniStateDTO pssysutildeid(String pSSysUtilDEId) {
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO pssysutildeid(PSSysUtilDTO pSSysUtil) {
        if (pSSysUtil == null) {
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        } else {
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonProperty(value="pssysutildename")
    public void setPSSysUtilDEName(String pSSysUtilDEName) {
        this._set(DTOFIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }

    @JsonIgnore
    public String getPSSysUtilDEName() {
        Object objValue = this._get(DTOFIELD_PSSYSUTILDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUtilDENameDirty() {
        return this._contains(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public void resetPSSysUtilDEName() {
        this._reset(DTOFIELD_PSSYSUTILDENAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO pssysutildename(String pSSysUtilDEName) {
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="reloadtimer")
    public void setReloadTimer(Integer reloadTimer) {
        this._set(DTOFIELD_RELOADTIMER, reloadTimer);
    }

    @JsonIgnore
    public Integer getReloadTimer() {
        Object objValue = this._get(DTOFIELD_RELOADTIMER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isReloadTimerDirty() {
        return this._contains(DTOFIELD_RELOADTIMER);
    }

    @JsonIgnore
    public void resetReloadTimer() {
        this._reset(DTOFIELD_RELOADTIMER);
    }

    @JsonIgnore
    public PSSysUniStateDTO reloadtimer(Integer reloadTimer) {
        this.setReloadTimer(reloadTimer);
        return this;
    }

    @JsonProperty(value="state2psdefid")
    public void setState2PSDEFId(String state2PSDEFId) {
        this._set(DTOFIELD_STATE2PSDEFID, state2PSDEFId);
    }

    @JsonIgnore
    public String getState2PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE2PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState2PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE2PSDEFID);
    }

    @JsonIgnore
    public void resetState2PSDEFId() {
        this._reset(DTOFIELD_STATE2PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state2psdefid(String state2PSDEFId) {
        this.setState2PSDEFId(state2PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state2psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState2PSDEFId(null);
            this.setState2PSDEFName(null);
        } else {
            this.setState2PSDEFId(pSDEField.getPSDEFieldId());
            this.setState2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state2psdefname")
    public void setState2PSDEFName(String state2PSDEFName) {
        this._set(DTOFIELD_STATE2PSDEFNAME, state2PSDEFName);
    }

    @JsonIgnore
    public String getState2PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE2PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState2PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE2PSDEFNAME);
    }

    @JsonIgnore
    public void resetState2PSDEFName() {
        this._reset(DTOFIELD_STATE2PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state2psdefname(String state2PSDEFName) {
        this.setState2PSDEFName(state2PSDEFName);
        return this;
    }

    @JsonProperty(value="state3psdefid")
    public void setState3PSDEFId(String state3PSDEFId) {
        this._set(DTOFIELD_STATE3PSDEFID, state3PSDEFId);
    }

    @JsonIgnore
    public String getState3PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE3PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState3PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE3PSDEFID);
    }

    @JsonIgnore
    public void resetState3PSDEFId() {
        this._reset(DTOFIELD_STATE3PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state3psdefid(String state3PSDEFId) {
        this.setState3PSDEFId(state3PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state3psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState3PSDEFId(null);
            this.setState3PSDEFName(null);
        } else {
            this.setState3PSDEFId(pSDEField.getPSDEFieldId());
            this.setState3PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state3psdefname")
    public void setState3PSDEFName(String state3PSDEFName) {
        this._set(DTOFIELD_STATE3PSDEFNAME, state3PSDEFName);
    }

    @JsonIgnore
    public String getState3PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE3PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState3PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE3PSDEFNAME);
    }

    @JsonIgnore
    public void resetState3PSDEFName() {
        this._reset(DTOFIELD_STATE3PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state3psdefname(String state3PSDEFName) {
        this.setState3PSDEFName(state3PSDEFName);
        return this;
    }

    @JsonProperty(value="state4psdefid")
    public void setState4PSDEFId(String state4PSDEFId) {
        this._set(DTOFIELD_STATE4PSDEFID, state4PSDEFId);
    }

    @JsonIgnore
    public String getState4PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE4PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState4PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE4PSDEFID);
    }

    @JsonIgnore
    public void resetState4PSDEFId() {
        this._reset(DTOFIELD_STATE4PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state4psdefid(String state4PSDEFId) {
        this.setState4PSDEFId(state4PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state4psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState4PSDEFId(null);
            this.setState4PSDEFName(null);
        } else {
            this.setState4PSDEFId(pSDEField.getPSDEFieldId());
            this.setState4PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state4psdefname")
    public void setState4PSDEFName(String state4PSDEFName) {
        this._set(DTOFIELD_STATE4PSDEFNAME, state4PSDEFName);
    }

    @JsonIgnore
    public String getState4PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE4PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState4PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE4PSDEFNAME);
    }

    @JsonIgnore
    public void resetState4PSDEFName() {
        this._reset(DTOFIELD_STATE4PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state4psdefname(String state4PSDEFName) {
        this.setState4PSDEFName(state4PSDEFName);
        return this;
    }

    @JsonProperty(value="state5psdefid")
    public void setState5PSDEFId(String state5PSDEFId) {
        this._set(DTOFIELD_STATE5PSDEFID, state5PSDEFId);
    }

    @JsonIgnore
    public String getState5PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE5PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState5PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE5PSDEFID);
    }

    @JsonIgnore
    public void resetState5PSDEFId() {
        this._reset(DTOFIELD_STATE5PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state5psdefid(String state5PSDEFId) {
        this.setState5PSDEFId(state5PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state5psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState5PSDEFId(null);
            this.setState5PSDEFName(null);
        } else {
            this.setState5PSDEFId(pSDEField.getPSDEFieldId());
            this.setState5PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state5psdefname")
    public void setState5PSDEFName(String state5PSDEFName) {
        this._set(DTOFIELD_STATE5PSDEFNAME, state5PSDEFName);
    }

    @JsonIgnore
    public String getState5PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE5PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState5PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE5PSDEFNAME);
    }

    @JsonIgnore
    public void resetState5PSDEFName() {
        this._reset(DTOFIELD_STATE5PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state5psdefname(String state5PSDEFName) {
        this.setState5PSDEFName(state5PSDEFName);
        return this;
    }

    @JsonProperty(value="state6psdefid")
    public void setState6PSDEFId(String state6PSDEFId) {
        this._set(DTOFIELD_STATE6PSDEFID, state6PSDEFId);
    }

    @JsonIgnore
    public String getState6PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE6PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState6PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE6PSDEFID);
    }

    @JsonIgnore
    public void resetState6PSDEFId() {
        this._reset(DTOFIELD_STATE6PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state6psdefid(String state6PSDEFId) {
        this.setState6PSDEFId(state6PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state6psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState6PSDEFId(null);
            this.setState6PSDEFName(null);
        } else {
            this.setState6PSDEFId(pSDEField.getPSDEFieldId());
            this.setState6PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state6psdefname")
    public void setState6PSDEFName(String state6PSDEFName) {
        this._set(DTOFIELD_STATE6PSDEFNAME, state6PSDEFName);
    }

    @JsonIgnore
    public String getState6PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE6PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState6PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE6PSDEFNAME);
    }

    @JsonIgnore
    public void resetState6PSDEFName() {
        this._reset(DTOFIELD_STATE6PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state6psdefname(String state6PSDEFName) {
        this.setState6PSDEFName(state6PSDEFName);
        return this;
    }

    @JsonProperty(value="state7psdefid")
    public void setState7PSDEFId(String state7PSDEFId) {
        this._set(DTOFIELD_STATE7PSDEFID, state7PSDEFId);
    }

    @JsonIgnore
    public String getState7PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE7PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState7PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE7PSDEFID);
    }

    @JsonIgnore
    public void resetState7PSDEFId() {
        this._reset(DTOFIELD_STATE7PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state7psdefid(String state7PSDEFId) {
        this.setState7PSDEFId(state7PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state7psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState7PSDEFId(null);
            this.setState7PSDEFName(null);
        } else {
            this.setState7PSDEFId(pSDEField.getPSDEFieldId());
            this.setState7PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state7psdefname")
    public void setState7PSDEFName(String state7PSDEFName) {
        this._set(DTOFIELD_STATE7PSDEFNAME, state7PSDEFName);
    }

    @JsonIgnore
    public String getState7PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE7PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState7PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE7PSDEFNAME);
    }

    @JsonIgnore
    public void resetState7PSDEFName() {
        this._reset(DTOFIELD_STATE7PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state7psdefname(String state7PSDEFName) {
        this.setState7PSDEFName(state7PSDEFName);
        return this;
    }

    @JsonProperty(value="state8psdefid")
    public void setState8PSDEFId(String state8PSDEFId) {
        this._set(DTOFIELD_STATE8PSDEFID, state8PSDEFId);
    }

    @JsonIgnore
    public String getState8PSDEFId() {
        Object objValue = this._get(DTOFIELD_STATE8PSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState8PSDEFIdDirty() {
        return this._contains(DTOFIELD_STATE8PSDEFID);
    }

    @JsonIgnore
    public void resetState8PSDEFId() {
        this._reset(DTOFIELD_STATE8PSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO state8psdefid(String state8PSDEFId) {
        this.setState8PSDEFId(state8PSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO state8psdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setState8PSDEFId(null);
            this.setState8PSDEFName(null);
        } else {
            this.setState8PSDEFId(pSDEField.getPSDEFieldId());
            this.setState8PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="state8psdefname")
    public void setState8PSDEFName(String state8PSDEFName) {
        this._set(DTOFIELD_STATE8PSDEFNAME, state8PSDEFName);
    }

    @JsonIgnore
    public String getState8PSDEFName() {
        Object objValue = this._get(DTOFIELD_STATE8PSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isState8PSDEFNameDirty() {
        return this._contains(DTOFIELD_STATE8PSDEFNAME);
    }

    @JsonIgnore
    public void resetState8PSDEFName() {
        this._reset(DTOFIELD_STATE8PSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO state8psdefname(String state8PSDEFName) {
        this.setState8PSDEFName(state8PSDEFName);
        return this;
    }

    @JsonProperty(value="statepsdefid")
    public void setStatePSDEFId(String statePSDEFId) {
        this._set(DTOFIELD_STATEPSDEFID, statePSDEFId);
    }

    @JsonIgnore
    public String getStatePSDEFId() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFIdDirty() {
        return this._contains(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public void resetStatePSDEFId() {
        this._reset(DTOFIELD_STATEPSDEFID);
    }

    @JsonIgnore
    public PSSysUniStateDTO statepsdefid(String statePSDEFId) {
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO statepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        } else {
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="statepsdefname")
    public void setStatePSDEFName(String statePSDEFName) {
        this._set(DTOFIELD_STATEPSDEFNAME, statePSDEFName);
    }

    @JsonIgnore
    public String getStatePSDEFName() {
        Object objValue = this._get(DTOFIELD_STATEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isStatePSDEFNameDirty() {
        return this._contains(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public void resetStatePSDEFName() {
        this._reset(DTOFIELD_STATEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysUniStateDTO statepsdefname(String statePSDEFName) {
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    @JsonProperty(value="uniquetag")
    public void setUniqueTag(String uniqueTag) {
        this._set(DTOFIELD_UNIQUETAG, uniqueTag);
    }

    @JsonIgnore
    public String getUniqueTag() {
        Object objValue = this._get(DTOFIELD_UNIQUETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniqueTagDirty() {
        return this._contains(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public void resetUniqueTag() {
        this._reset(DTOFIELD_UNIQUETAG);
    }

    @JsonIgnore
    public PSSysUniStateDTO uniquetag(String uniqueTag) {
        this.setUniqueTag(uniqueTag);
        return this;
    }

    @JsonProperty(value="unistatemode")
    public void setUniStateMode(String uniStateMode) {
        this._set(DTOFIELD_UNISTATEMODE, uniStateMode);
    }

    @JsonIgnore
    public String getUniStateMode() {
        Object objValue = this._get(DTOFIELD_UNISTATEMODE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateModeDirty() {
        return this._contains(DTOFIELD_UNISTATEMODE);
    }

    @JsonIgnore
    public void resetUniStateMode() {
        this._reset(DTOFIELD_UNISTATEMODE);
    }

    @JsonIgnore
    public PSSysUniStateDTO unistatemode(String uniStateMode) {
        this.setUniStateMode(uniStateMode);
        return this;
    }

    @JsonProperty(value="unistateparams")
    public void setUniStateParams(String uniStateParams) {
        this._set(DTOFIELD_UNISTATEPARAMS, uniStateParams);
    }

    @JsonIgnore
    public String getUniStateParams() {
        Object objValue = this._get(DTOFIELD_UNISTATEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateParamsDirty() {
        return this._contains(DTOFIELD_UNISTATEPARAMS);
    }

    @JsonIgnore
    public void resetUniStateParams() {
        this._reset(DTOFIELD_UNISTATEPARAMS);
    }

    @JsonIgnore
    public PSSysUniStateDTO unistateparams(String uniStateParams) {
        this.setUniStateParams(uniStateParams);
        return this;
    }

    @JsonProperty(value="unistatetag")
    public void setUniStateTag(String uniStateTag) {
        this._set(DTOFIELD_UNISTATETAG, uniStateTag);
    }

    @JsonIgnore
    public String getUniStateTag() {
        Object objValue = this._get(DTOFIELD_UNISTATETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateTagDirty() {
        return this._contains(DTOFIELD_UNISTATETAG);
    }

    @JsonIgnore
    public void resetUniStateTag() {
        this._reset(DTOFIELD_UNISTATETAG);
    }

    @JsonIgnore
    public PSSysUniStateDTO unistatetag(String uniStateTag) {
        this.setUniStateTag(uniStateTag);
        return this;
    }

    @JsonProperty(value="unistatetag2")
    public void setUniStateTag2(String uniStateTag2) {
        this._set(DTOFIELD_UNISTATETAG2, uniStateTag2);
    }

    @JsonIgnore
    public String getUniStateTag2() {
        Object objValue = this._get(DTOFIELD_UNISTATETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateTag2Dirty() {
        return this._contains(DTOFIELD_UNISTATETAG2);
    }

    @JsonIgnore
    public void resetUniStateTag2() {
        this._reset(DTOFIELD_UNISTATETAG2);
    }

    @JsonIgnore
    public PSSysUniStateDTO unistatetag2(String uniStateTag2) {
        this.setUniStateTag2(uniStateTag2);
        return this;
    }

    @JsonProperty(value="unistatetype")
    public void setUniStateType(String uniStateType) {
        this._set(DTOFIELD_UNISTATETYPE, uniStateType);
    }

    @JsonIgnore
    public String getUniStateType() {
        Object objValue = this._get(DTOFIELD_UNISTATETYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUniStateTypeDirty() {
        return this._contains(DTOFIELD_UNISTATETYPE);
    }

    @JsonIgnore
    public void resetUniStateType() {
        this._reset(DTOFIELD_UNISTATETYPE);
    }

    @JsonIgnore
    public PSSysUniStateDTO unistatetype(String uniStateType) {
        this.setUniStateType(uniStateType);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO unistatetype(PSModelEnums.UniStateType uniStateType) {
        if (uniStateType == null) {
            this.setUniStateType(null);
        } else {
            this.setUniStateType(uniStateType.value);
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
    public PSSysUniStateDTO updatedate(Timestamp updateDate) {
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
    public PSSysUniStateDTO updateman(String updateMan) {
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
    public PSSysUniStateDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysUniStateDTO usertag(String userTag) {
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
    public PSSysUniStateDTO usertag2(String userTag2) {
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
    public PSSysUniStateDTO usertag3(String userTag3) {
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
    public PSSysUniStateDTO usertag4(String userTag4) {
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
    public PSSysUniStateDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysUniStateDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysUniStateId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysUniStateId(strValue);
    }

    @JsonIgnore
    public PSSysUniStateDTO id(String strValue) {
        this.setPSSysUniStateId(strValue);
        return this;
    }
}
