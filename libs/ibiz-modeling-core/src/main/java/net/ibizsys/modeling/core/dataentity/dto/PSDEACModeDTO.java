/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$DEACType
 *  net.ibizsys.model.PSModelEnums$DEExtendMode
 *  net.ibizsys.model.PSModelEnums$DELogicHolder
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 *  net.ibizsys.model.PSModelEnums$PagingMode
 *  net.ibizsys.model.PSModelEnums$PagingSize
 *  net.ibizsys.model.PSModelEnums$ScriptMode2
 *  net.ibizsys.model.PSModelEnums$SortDir
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEACModeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIChatAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIFactoryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEACModeDTO
extends PSModelDTOBase {
    public static final String FIELD_ACIPSSYSPFPLUGINID = "ACIPSSYSPFPLUGINID";
    protected static final String DTOFIELD_ACIPSSYSPFPLUGINID = "acipssyspfpluginid";
    public static final String FIELD_ACIPSSYSPFPLUGINNAME = "ACIPSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_ACIPSSYSPFPLUGINNAME = "acipssyspfpluginname";
    public static final String FIELD_ACPARAMS = "ACPARAMS";
    protected static final String DTOFIELD_ACPARAMS = "acparams";
    public static final String FIELD_ACTAG = "ACTAG";
    protected static final String DTOFIELD_ACTAG = "actag";
    public static final String FIELD_ACTAG2 = "ACTAG2";
    protected static final String DTOFIELD_ACTAG2 = "actag2";
    public static final String FIELD_ACTAG3 = "ACTAG3";
    protected static final String DTOFIELD_ACTAG3 = "actag3";
    public static final String FIELD_ACTAG4 = "ACTAG4";
    protected static final String DTOFIELD_ACTAG4 = "actag4";
    public static final String FIELD_ACTIONHOLDER = "ACTIONHOLDER";
    protected static final String DTOFIELD_ACTIONHOLDER = "actionholder";
    public static final String FIELD_ACTYPE = "ACTYPE";
    protected static final String DTOFIELD_ACTYPE = "actype";
    public static final String FIELD_ADPSDELOGICID = "ADPSDELOGICID";
    protected static final String DTOFIELD_ADPSDELOGICID = "adpsdelogicid";
    public static final String FIELD_ADPSDELOGICNAME = "ADPSDELOGICNAME";
    protected static final String DTOFIELD_ADPSDELOGICNAME = "adpsdelogicname";
    public static final String FIELD_AIFACTORYPSSYSUTILDEID = "AIFACTORYPSSYSUTILDEID";
    protected static final String DTOFIELD_AIFACTORYPSSYSUTILDEID = "aifactorypssysutildeid";
    public static final String FIELD_AIFACTORYPSSYSUTILDENAME = "AIFACTORYPSSYSUTILDENAME";
    protected static final String DTOFIELD_AIFACTORYPSSYSUTILDENAME = "aifactorypssysutildename";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CREATEPSDEOPPRIVID = "CREATEPSDEOPPRIVID";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";
    public static final String FIELD_CREATEPSDEOPPRIVNAME = "CREATEPSDEOPPRIVNAME";
    protected static final String DTOFIELD_CREATEPSDEOPPRIVNAME = "createpsdeopprivname";
    public static final String FIELD_CUSTOMCODE = "CUSTOMCODE";
    protected static final String DTOFIELD_CUSTOMCODE = "customcode";
    public static final String FIELD_CUSTOMMODE = "CUSTOMMODE";
    protected static final String DTOFIELD_CUSTOMMODE = "custommode";
    public static final String FIELD_DEFAULTMODE = "DEFAULTMODE";
    protected static final String DTOFIELD_DEFAULTMODE = "defaultmode";
    public static final String FIELD_EMPTYTEXT = "EMPTYTEXT";
    protected static final String DTOFIELD_EMPTYTEXT = "emptytext";
    public static final String FIELD_EMPTYTEXTPSLANRESID = "EMPTYTEXTPSLANRESID";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";
    public static final String FIELD_EMPTYTEXTPSLANRESNAME = "EMPTYTEXTPSLANRESNAME";
    protected static final String DTOFIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";
    public static final String FIELD_ENABLEPAGINGBAR = "ENABLEPAGINGBAR";
    protected static final String DTOFIELD_ENABLEPAGINGBAR = "enablepagingbar";
    public static final String FIELD_EXTENDMODE = "EXTENDMODE";
    protected static final String DTOFIELD_EXTENDMODE = "extendmode";
    public static final String FIELD_FILLEROBJ = "FILLEROBJ";
    protected static final String DTOFIELD_FILLEROBJ = "fillerobj";
    public static final String FIELD_HISTORYPSSYSMSGTEMPLID = "HISTORYPSSYSMSGTEMPLID";
    protected static final String DTOFIELD_HISTORYPSSYSMSGTEMPLID = "historypssysmsgtemplid";
    public static final String FIELD_HISTORYPSSYSMSGTEMPLNAME = "HISTORYPSSYSMSGTEMPLNAME";
    protected static final String DTOFIELD_HISTORYPSSYSMSGTEMPLNAME = "historypssysmsgtemplname";
    public static final String FIELD_LINKPSDEVIEWID = "LINKPSDEVIEWID";
    protected static final String DTOFIELD_LINKPSDEVIEWID = "linkpsdeviewid";
    public static final String FIELD_LINKPSDEVIEWNAME = "LINKPSDEVIEWNAME";
    protected static final String DTOFIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";
    public static final String FIELD_LOGICNAME = "LOGICNAME";
    protected static final String DTOFIELD_LOGICNAME = "logicname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_MINORSORTDIR = "MINORSORTDIR";
    protected static final String DTOFIELD_MINORSORTDIR = "minorsortdir";
    public static final String FIELD_MINORSORTPSDEFID = "MINORSORTPSDEFID";
    protected static final String DTOFIELD_MINORSORTPSDEFID = "minorsortpsdefid";
    public static final String FIELD_MINORSORTPSDEFNAME = "MINORSORTPSDEFNAME";
    protected static final String DTOFIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";
    public static final String FIELD_PAGINGSIZE = "PAGINGSIZE";
    protected static final String DTOFIELD_PAGINGSIZE = "pagingsize";
    public static final String FIELD_PICKUPPSDEVIEWID = "PICKUPPSDEVIEWID";
    protected static final String DTOFIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";
    public static final String FIELD_PICKUPPSDEVIEWNAME = "PICKUPPSDEVIEWNAME";
    protected static final String DTOFIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";
    public static final String FIELD_PSDEACMODEID = "PSDEACMODEID";
    protected static final String DTOFIELD_PSDEACMODEID = "psdeacmodeid";
    public static final String FIELD_PSDEACMODENAME = "PSDEACMODENAME";
    protected static final String DTOFIELD_PSDEACMODENAME = "psdeacmodename";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSDEUAGROUPID = "PSDEUAGROUPID";
    protected static final String DTOFIELD_PSDEUAGROUPID = "psdeuagroupid";
    public static final String FIELD_PSDEUAGROUPNAME = "PSDEUAGROUPNAME";
    protected static final String DTOFIELD_PSDEUAGROUPNAME = "psdeuagroupname";
    public static final String FIELD_PSSYSAICHATAGENTID = "PSSYSAICHATAGENTID";
    protected static final String DTOFIELD_PSSYSAICHATAGENTID = "pssysaichatagentid";
    public static final String FIELD_PSSYSAICHATAGENTNAME = "PSSYSAICHATAGENTNAME";
    protected static final String DTOFIELD_PSSYSAICHATAGENTNAME = "pssysaichatagentname";
    public static final String FIELD_PSSYSAIFACTORYID = "PSSYSAIFACTORYID";
    protected static final String DTOFIELD_PSSYSAIFACTORYID = "pssysaifactoryid";
    public static final String FIELD_PSSYSAIFACTORYNAME = "PSSYSAIFACTORYNAME";
    protected static final String DTOFIELD_PSSYSAIFACTORYNAME = "pssysaifactoryname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_READPSDEOPPRIVID = "READPSDEOPPRIVID";
    protected static final String DTOFIELD_READPSDEOPPRIVID = "readpsdeopprivid";
    public static final String FIELD_READPSDEOPPRIVNAME = "READPSDEOPPRIVNAME";
    protected static final String DTOFIELD_READPSDEOPPRIVNAME = "readpsdeopprivname";
    public static final String FIELD_TEXTPSDEFID = "TEXTPSDEFID";
    protected static final String DTOFIELD_TEXTPSDEFID = "textpsdefid";
    public static final String FIELD_TEXTPSDEFNAME = "TEXTPSDEFNAME";
    protected static final String DTOFIELD_TEXTPSDEFNAME = "textpsdefname";
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
    public static final String FIELD_VALUEPSDEFID = "VALUEPSDEFID";
    protected static final String DTOFIELD_VALUEPSDEFID = "valuepsdefid";
    public static final String FIELD_VALUEPSDEFNAME = "VALUEPSDEFNAME";
    protected static final String DTOFIELD_VALUEPSDEFNAME = "valuepsdefname";
    public static final String DTOFIELD_PSDEACMODEITEMS = "psdeacmodeitems";

    @JsonProperty(value="acipssyspfpluginid")
    public void setACIPSSysPFPluginId(String aCIPSSysPFPluginId) {
        this._set(DTOFIELD_ACIPSSYSPFPLUGINID, aCIPSSysPFPluginId);
    }

    @JsonIgnore
    public String getACIPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_ACIPSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACIPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_ACIPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetACIPSSysPFPluginId() {
        this._reset(DTOFIELD_ACIPSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSDEACModeDTO acipssyspfpluginid(String aCIPSSysPFPluginId) {
        this.setACIPSSysPFPluginId(aCIPSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO acipssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setACIPSSysPFPluginId(null);
            this.setACIPSSysPFPluginName(null);
        } else {
            this.setACIPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setACIPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="acipssyspfpluginname")
    public void setACIPSSysPFPluginName(String aCIPSSysPFPluginName) {
        this._set(DTOFIELD_ACIPSSYSPFPLUGINNAME, aCIPSSysPFPluginName);
    }

    @JsonIgnore
    public String getACIPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_ACIPSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACIPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_ACIPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetACIPSSysPFPluginName() {
        this._reset(DTOFIELD_ACIPSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO acipssyspfpluginname(String aCIPSSysPFPluginName) {
        this.setACIPSSysPFPluginName(aCIPSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="acparams")
    public void setACParams(String aCParams) {
        this._set(DTOFIELD_ACPARAMS, aCParams);
    }

    @JsonIgnore
    public String getACParams() {
        Object objValue = this._get(DTOFIELD_ACPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACParamsDirty() {
        return this._contains(DTOFIELD_ACPARAMS);
    }

    @JsonIgnore
    public void resetACParams() {
        this._reset(DTOFIELD_ACPARAMS);
    }

    @JsonIgnore
    public PSDEACModeDTO acparams(String aCParams) {
        this.setACParams(aCParams);
        return this;
    }

    @JsonProperty(value="actag")
    public void setACTag(String aCTag) {
        this._set(DTOFIELD_ACTAG, aCTag);
    }

    @JsonIgnore
    public String getACTag() {
        Object objValue = this._get(DTOFIELD_ACTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTagDirty() {
        return this._contains(DTOFIELD_ACTAG);
    }

    @JsonIgnore
    public void resetACTag() {
        this._reset(DTOFIELD_ACTAG);
    }

    @JsonIgnore
    public PSDEACModeDTO actag(String aCTag) {
        this.setACTag(aCTag);
        return this;
    }

    @JsonProperty(value="actag2")
    public void setACTag2(String aCTag2) {
        this._set(DTOFIELD_ACTAG2, aCTag2);
    }

    @JsonIgnore
    public String getACTag2() {
        Object objValue = this._get(DTOFIELD_ACTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTag2Dirty() {
        return this._contains(DTOFIELD_ACTAG2);
    }

    @JsonIgnore
    public void resetACTag2() {
        this._reset(DTOFIELD_ACTAG2);
    }

    @JsonIgnore
    public PSDEACModeDTO actag2(String aCTag2) {
        this.setACTag2(aCTag2);
        return this;
    }

    @JsonProperty(value="actag3")
    public void setACTag3(String aCTag3) {
        this._set(DTOFIELD_ACTAG3, aCTag3);
    }

    @JsonIgnore
    public String getACTag3() {
        Object objValue = this._get(DTOFIELD_ACTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTag3Dirty() {
        return this._contains(DTOFIELD_ACTAG3);
    }

    @JsonIgnore
    public void resetACTag3() {
        this._reset(DTOFIELD_ACTAG3);
    }

    @JsonIgnore
    public PSDEACModeDTO actag3(String aCTag3) {
        this.setACTag3(aCTag3);
        return this;
    }

    @JsonProperty(value="actag4")
    public void setACTag4(String aCTag4) {
        this._set(DTOFIELD_ACTAG4, aCTag4);
    }

    @JsonIgnore
    public String getACTag4() {
        Object objValue = this._get(DTOFIELD_ACTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTag4Dirty() {
        return this._contains(DTOFIELD_ACTAG4);
    }

    @JsonIgnore
    public void resetACTag4() {
        this._reset(DTOFIELD_ACTAG4);
    }

    @JsonIgnore
    public PSDEACModeDTO actag4(String aCTag4) {
        this.setACTag4(aCTag4);
        return this;
    }

    @JsonProperty(value="actionholder")
    public void setActionHolder(Integer actionHolder) {
        this._set(DTOFIELD_ACTIONHOLDER, actionHolder);
    }

    @JsonIgnore
    public Integer getActionHolder() {
        Object objValue = this._get(DTOFIELD_ACTIONHOLDER);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isActionHolderDirty() {
        return this._contains(DTOFIELD_ACTIONHOLDER);
    }

    @JsonIgnore
    public void resetActionHolder() {
        this._reset(DTOFIELD_ACTIONHOLDER);
    }

    @JsonIgnore
    public PSDEACModeDTO actionholder(Integer actionHolder) {
        this.setActionHolder(actionHolder);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO actionholder(PSModelEnums.DELogicHolder actionHolder) {
        if (actionHolder == null) {
            this.setActionHolder(null);
        } else {
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    @JsonProperty(value="actype")
    public void setACType(String aCType) {
        this._set(DTOFIELD_ACTYPE, aCType);
    }

    @JsonIgnore
    public String getACType() {
        Object objValue = this._get(DTOFIELD_ACTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isACTypeDirty() {
        return this._contains(DTOFIELD_ACTYPE);
    }

    @JsonIgnore
    public void resetACType() {
        this._reset(DTOFIELD_ACTYPE);
    }

    @JsonIgnore
    public PSDEACModeDTO actype(String aCType) {
        this.setACType(aCType);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO actype(PSModelEnums.DEACType aCType) {
        if (aCType == null) {
            this.setACType(null);
        } else {
            this.setACType(aCType.value);
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicid")
    public void setADPSDELogicId(String aDPSDELogicId) {
        this._set(DTOFIELD_ADPSDELOGICID, aDPSDELogicId);
    }

    @JsonIgnore
    public String getADPSDELogicId() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicIdDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public void resetADPSDELogicId() {
        this._reset(DTOFIELD_ADPSDELOGICID);
    }

    @JsonIgnore
    public PSDEACModeDTO adpsdelogicid(String aDPSDELogicId) {
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO adpsdelogicid(PSDELogicDTO pSDELogic) {
        if (pSDELogic == null) {
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        } else {
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    @JsonProperty(value="adpsdelogicname")
    public void setADPSDELogicName(String aDPSDELogicName) {
        this._set(DTOFIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }

    @JsonIgnore
    public String getADPSDELogicName() {
        Object objValue = this._get(DTOFIELD_ADPSDELOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isADPSDELogicNameDirty() {
        return this._contains(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public void resetADPSDELogicName() {
        this._reset(DTOFIELD_ADPSDELOGICNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO adpsdelogicname(String aDPSDELogicName) {
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    @JsonProperty(value="aifactorypssysutildeid")
    public void setAIFactoryPSSysUtilDEId(String aIFactoryPSSysUtilDEId) {
        this._set(DTOFIELD_AIFACTORYPSSYSUTILDEID, aIFactoryPSSysUtilDEId);
    }

    @JsonIgnore
    public String getAIFactoryPSSysUtilDEId() {
        Object objValue = this._get(DTOFIELD_AIFACTORYPSSYSUTILDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIFactoryPSSysUtilDEIdDirty() {
        return this._contains(DTOFIELD_AIFACTORYPSSYSUTILDEID);
    }

    @JsonIgnore
    public void resetAIFactoryPSSysUtilDEId() {
        this._reset(DTOFIELD_AIFACTORYPSSYSUTILDEID);
    }

    @JsonIgnore
    public PSDEACModeDTO aifactorypssysutildeid(String aIFactoryPSSysUtilDEId) {
        this.setAIFactoryPSSysUtilDEId(aIFactoryPSSysUtilDEId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO aifactorypssysutildeid(PSSysUtilDTO pSSysUtil) {
        if (pSSysUtil == null) {
            this.setAIFactoryPSSysUtilDEId(null);
            this.setAIFactoryPSSysUtilDEName(null);
        } else {
            this.setAIFactoryPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setAIFactoryPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    @JsonProperty(value="aifactorypssysutildename")
    public void setAIFactoryPSSysUtilDEName(String aIFactoryPSSysUtilDEName) {
        this._set(DTOFIELD_AIFACTORYPSSYSUTILDENAME, aIFactoryPSSysUtilDEName);
    }

    @JsonIgnore
    public String getAIFactoryPSSysUtilDEName() {
        Object objValue = this._get(DTOFIELD_AIFACTORYPSSYSUTILDENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isAIFactoryPSSysUtilDENameDirty() {
        return this._contains(DTOFIELD_AIFACTORYPSSYSUTILDENAME);
    }

    @JsonIgnore
    public void resetAIFactoryPSSysUtilDEName() {
        this._reset(DTOFIELD_AIFACTORYPSSYSUTILDENAME);
    }

    @JsonIgnore
    public PSDEACModeDTO aifactorypssysutildename(String aIFactoryPSSysUtilDEName) {
        this.setAIFactoryPSSysUtilDEName(aIFactoryPSSysUtilDEName);
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSDEACModeDTO codename(String codeName) {
        this.setCodeName(codeName);
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
    public PSDEACModeDTO createdate(Timestamp createDate) {
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
    public PSDEACModeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="createpsdeopprivid")
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivId() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEACModeDTO createpsdeopprivid(String createPSDEOPPrivId) {
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO createpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivName(null);
        } else {
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="createpsdeopprivname")
    public void setCreatePSDEOPPrivName(String createPSDEOPPrivName) {
        this._set(DTOFIELD_CREATEPSDEOPPRIVNAME, createPSDEOPPrivName);
    }

    @JsonIgnore
    public String getCreatePSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_CREATEPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreatePSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_CREATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetCreatePSDEOPPrivName() {
        this._reset(DTOFIELD_CREATEPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO createpsdeopprivname(String createPSDEOPPrivName) {
        this.setCreatePSDEOPPrivName(createPSDEOPPrivName);
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
    public PSDEACModeDTO customcode(String customCode) {
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
    public PSDEACModeDTO custommode(Integer customMode) {
        this.setCustomMode(customMode);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO custommode(PSModelEnums.ScriptMode2 customMode) {
        if (customMode == null) {
            this.setCustomMode(null);
        } else {
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    @JsonProperty(value="defaultmode")
    public void setDefaultMode(Integer defaultMode) {
        this._set(DTOFIELD_DEFAULTMODE, defaultMode);
    }

    @JsonIgnore
    public Integer getDefaultMode() {
        Object objValue = this._get(DTOFIELD_DEFAULTMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isDefaultModeDirty() {
        return this._contains(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public void resetDefaultMode() {
        this._reset(DTOFIELD_DEFAULTMODE);
    }

    @JsonIgnore
    public PSDEACModeDTO defaultmode(Integer defaultMode) {
        this.setDefaultMode(defaultMode);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO defaultmode(Boolean defaultMode) {
        if (defaultMode == null) {
            this.setDefaultMode(null);
        } else {
            this.setDefaultMode(defaultMode != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="emptytext")
    public void setEmptyText(String emptyText) {
        this._set(DTOFIELD_EMPTYTEXT, emptyText);
    }

    @JsonIgnore
    public String getEmptyText() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextDirty() {
        return this._contains(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public void resetEmptyText() {
        this._reset(DTOFIELD_EMPTYTEXT);
    }

    @JsonIgnore
    public PSDEACModeDTO emptytext(String emptyText) {
        this.setEmptyText(emptyText);
        return this;
    }

    @JsonProperty(value="emptytextpslanresid")
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResId() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResId() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESID);
    }

    @JsonIgnore
    public PSDEACModeDTO emptytextpslanresid(String emptyTextPSLanResId) {
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        } else {
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="emptytextpslanresname")
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName) {
        this._set(DTOFIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }

    @JsonIgnore
    public String getEmptyTextPSLanResName() {
        Object objValue = this._get(DTOFIELD_EMPTYTEXTPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty() {
        return this._contains(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public void resetEmptyTextPSLanResName() {
        this._reset(DTOFIELD_EMPTYTEXTPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO emptytextpslanresname(String emptyTextPSLanResName) {
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    @JsonProperty(value="enablepagingbar")
    public void setEnablePagingBar(Integer enablePagingBar) {
        this._set(DTOFIELD_ENABLEPAGINGBAR, enablePagingBar);
    }

    @JsonIgnore
    public Integer getEnablePagingBar() {
        Object objValue = this._get(DTOFIELD_ENABLEPAGINGBAR);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnablePagingBarDirty() {
        return this._contains(DTOFIELD_ENABLEPAGINGBAR);
    }

    @JsonIgnore
    public void resetEnablePagingBar() {
        this._reset(DTOFIELD_ENABLEPAGINGBAR);
    }

    @JsonIgnore
    public PSDEACModeDTO enablepagingbar(Integer enablePagingBar) {
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO enablepagingbar(PSModelEnums.PagingMode enablePagingBar) {
        if (enablePagingBar == null) {
            this.setEnablePagingBar(null);
        } else {
            this.setEnablePagingBar(enablePagingBar.value);
        }
        return this;
    }

    @JsonProperty(value="extendmode")
    public void setExtendMode(Integer extendMode) {
        this._set(DTOFIELD_EXTENDMODE, extendMode);
    }

    @JsonIgnore
    public Integer getExtendMode() {
        Object objValue = this._get(DTOFIELD_EXTENDMODE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isExtendModeDirty() {
        return this._contains(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public void resetExtendMode() {
        this._reset(DTOFIELD_EXTENDMODE);
    }

    @JsonIgnore
    public PSDEACModeDTO extendmode(Integer extendMode) {
        this.setExtendMode(extendMode);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO extendmode(PSModelEnums.DEExtendMode extendMode) {
        if (extendMode == null) {
            this.setExtendMode(null);
        } else {
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    @JsonProperty(value="fillerobj")
    public void setFillerObj(String fillerObj) {
        this._set(DTOFIELD_FILLEROBJ, fillerObj);
    }

    @JsonIgnore
    public String getFillerObj() {
        Object objValue = this._get(DTOFIELD_FILLEROBJ);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFillerObjDirty() {
        return this._contains(DTOFIELD_FILLEROBJ);
    }

    @JsonIgnore
    public void resetFillerObj() {
        this._reset(DTOFIELD_FILLEROBJ);
    }

    @JsonIgnore
    public PSDEACModeDTO fillerobj(String fillerObj) {
        this.setFillerObj(fillerObj);
        return this;
    }

    @JsonProperty(value="historypssysmsgtemplid")
    public void setHistoryPSSysMsgTemplId(String historyPSSysMsgTemplId) {
        this._set(DTOFIELD_HISTORYPSSYSMSGTEMPLID, historyPSSysMsgTemplId);
    }

    @JsonIgnore
    public String getHistoryPSSysMsgTemplId() {
        Object objValue = this._get(DTOFIELD_HISTORYPSSYSMSGTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHistoryPSSysMsgTemplIdDirty() {
        return this._contains(DTOFIELD_HISTORYPSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public void resetHistoryPSSysMsgTemplId() {
        this._reset(DTOFIELD_HISTORYPSSYSMSGTEMPLID);
    }

    @JsonIgnore
    public PSDEACModeDTO historypssysmsgtemplid(String historyPSSysMsgTemplId) {
        this.setHistoryPSSysMsgTemplId(historyPSSysMsgTemplId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO historypssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl) {
        if (pSSysMsgTempl == null) {
            this.setHistoryPSSysMsgTemplId(null);
            this.setHistoryPSSysMsgTemplName(null);
        } else {
            this.setHistoryPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setHistoryPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    @JsonProperty(value="historypssysmsgtemplname")
    public void setHistoryPSSysMsgTemplName(String historyPSSysMsgTemplName) {
        this._set(DTOFIELD_HISTORYPSSYSMSGTEMPLNAME, historyPSSysMsgTemplName);
    }

    @JsonIgnore
    public String getHistoryPSSysMsgTemplName() {
        Object objValue = this._get(DTOFIELD_HISTORYPSSYSMSGTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHistoryPSSysMsgTemplNameDirty() {
        return this._contains(DTOFIELD_HISTORYPSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public void resetHistoryPSSysMsgTemplName() {
        this._reset(DTOFIELD_HISTORYPSSYSMSGTEMPLNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO historypssysmsgtemplname(String historyPSSysMsgTemplName) {
        this.setHistoryPSSysMsgTemplName(historyPSSysMsgTemplName);
        return this;
    }

    @JsonProperty(value="linkpsdeviewid")
    public void setLinkPSDEViewId(String linkPSDEViewId) {
        this._set(DTOFIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }

    @JsonIgnore
    public String getLinkPSDEViewId() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public void resetLinkPSDEViewId() {
        this._reset(DTOFIELD_LINKPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEACModeDTO linkpsdeviewid(String linkPSDEViewId) {
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        } else {
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="linkpsdeviewname")
    public void setLinkPSDEViewName(String linkPSDEViewName) {
        this._set(DTOFIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }

    @JsonIgnore
    public String getLinkPSDEViewName() {
        Object objValue = this._get(DTOFIELD_LINKPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty() {
        return this._contains(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetLinkPSDEViewName() {
        this._reset(DTOFIELD_LINKPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO linkpsdeviewname(String linkPSDEViewName) {
        this.setLinkPSDEViewName(linkPSDEViewName);
        return this;
    }

    @JsonProperty(value="logicname")
    public void setLogicName(String logicName) {
        this._set(DTOFIELD_LOGICNAME, logicName);
    }

    @JsonIgnore
    public String getLogicName() {
        Object objValue = this._get(DTOFIELD_LOGICNAME);
        if (objValue == null) {
            return null;
        }
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
    public PSDEACModeDTO logicname(String logicName) {
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
    public PSDEACModeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="minorsortdir")
    public void setMinorSortDir(String minorSortDir) {
        this._set(DTOFIELD_MINORSORTDIR, minorSortDir);
    }

    @JsonIgnore
    public String getMinorSortDir() {
        Object objValue = this._get(DTOFIELD_MINORSORTDIR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortDirDirty() {
        return this._contains(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public void resetMinorSortDir() {
        this._reset(DTOFIELD_MINORSORTDIR);
    }

    @JsonIgnore
    public PSDEACModeDTO minorsortdir(String minorSortDir) {
        this.setMinorSortDir(minorSortDir);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO minorsortdir(PSModelEnums.SortDir minorSortDir) {
        if (minorSortDir == null) {
            this.setMinorSortDir(null);
        } else {
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefid")
    public void setMinorSortPSDEFId(String minorSortPSDEFId) {
        this._set(DTOFIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }

    @JsonIgnore
    public String getMinorSortPSDEFId() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFId() {
        this._reset(DTOFIELD_MINORSORTPSDEFID);
    }

    @JsonIgnore
    public PSDEACModeDTO minorsortpsdefid(String minorSortPSDEFId) {
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO minorsortpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        } else {
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="minorsortpsdefname")
    public void setMinorSortPSDEFName(String minorSortPSDEFName) {
        this._set(DTOFIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }

    @JsonIgnore
    public String getMinorSortPSDEFName() {
        Object objValue = this._get(DTOFIELD_MINORSORTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty() {
        return this._contains(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public void resetMinorSortPSDEFName() {
        this._reset(DTOFIELD_MINORSORTPSDEFNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO minorsortpsdefname(String minorSortPSDEFName) {
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    @JsonProperty(value="pagingsize")
    public void setPagingSize(Integer pagingSize) {
        this._set(DTOFIELD_PAGINGSIZE, pagingSize);
    }

    @JsonIgnore
    public Integer getPagingSize() {
        Object objValue = this._get(DTOFIELD_PAGINGSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPagingSizeDirty() {
        return this._contains(DTOFIELD_PAGINGSIZE);
    }

    @JsonIgnore
    public void resetPagingSize() {
        this._reset(DTOFIELD_PAGINGSIZE);
    }

    @JsonIgnore
    public PSDEACModeDTO pagingsize(Integer pagingSize) {
        this.setPagingSize(pagingSize);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pagingsize(PSModelEnums.PagingSize pagingSize) {
        if (pagingSize == null) {
            this.setPagingSize(null);
        } else {
            this.setPagingSize(pagingSize.value);
        }
        return this;
    }

    @JsonProperty(value="pickuppsdeviewid")
    public void setPickupPSDEViewId(String pickupPSDEViewId) {
        this._set(DTOFIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }

    @JsonIgnore
    public String getPickupPSDEViewId() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public void resetPickupPSDEViewId() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWID);
    }

    @JsonIgnore
    public PSDEACModeDTO pickuppsdeviewid(String pickupPSDEViewId) {
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        } else {
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="pickuppsdeviewname")
    public void setPickupPSDEViewName(String pickupPSDEViewName) {
        this._set(DTOFIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }

    @JsonIgnore
    public String getPickupPSDEViewName() {
        Object objValue = this._get(DTOFIELD_PICKUPPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty() {
        return this._contains(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetPickupPSDEViewName() {
        this._reset(DTOFIELD_PICKUPPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO pickuppsdeviewname(String pickupPSDEViewName) {
        this.setPickupPSDEViewName(pickupPSDEViewName);
        return this;
    }

    @JsonProperty(value="psdeacmodeid")
    public void setPSDEACModeId(String pSDEACModeId) {
        this._set(DTOFIELD_PSDEACMODEID, pSDEACModeId);
    }

    @JsonIgnore
    public String getPSDEACModeId() {
        Object objValue = this._get(DTOFIELD_PSDEACMODEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeIdDirty() {
        return this._contains(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public void resetPSDEACModeId() {
        this._reset(DTOFIELD_PSDEACMODEID);
    }

    @JsonIgnore
    public PSDEACModeDTO psdeacmodeid(String pSDEACModeId) {
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    @JsonProperty(value="psdeacmodename")
    public void setPSDEACModeName(String pSDEACModeName) {
        this._set(DTOFIELD_PSDEACMODENAME, pSDEACModeName);
    }

    @JsonIgnore
    public String getPSDEACModeName() {
        Object objValue = this._get(DTOFIELD_PSDEACMODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEACModeNameDirty() {
        return this._contains(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public void resetPSDEACModeName() {
        this._reset(DTOFIELD_PSDEACMODENAME);
    }

    @JsonIgnore
    public PSDEACModeDTO psdeacmodename(String pSDEACModeName) {
        this.setPSDEACModeName(pSDEACModeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEACModeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEACModeName(strName);
    }

    @JsonIgnore
    public PSDEACModeDTO name(String strName) {
        this.setPSDEACModeName(strName);
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
    public PSDEACModeDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSDEACModeDTO psdedatasetname(String pSDEDataSetName) {
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
    public PSDEACModeDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEACModeDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="psdeuagroupid")
    public void setPSDEUAGroupId(String pSDEUAGroupId) {
        this._set(DTOFIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }

    @JsonIgnore
    public String getPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPSDEUAGroupId() {
        this._reset(DTOFIELD_PSDEUAGROUPID);
    }

    @JsonIgnore
    public PSDEACModeDTO psdeuagroupid(String pSDEUAGroupId) {
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        } else {
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="psdeuagroupname")
    public void setPSDEUAGroupName(String pSDEUAGroupName) {
        this._set(DTOFIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }

    @JsonIgnore
    public String getPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPSDEUAGroupName() {
        this._reset(DTOFIELD_PSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO psdeuagroupname(String pSDEUAGroupName) {
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    @JsonProperty(value="pssysaichatagentid")
    public void setPSSysAIChatAgentId(String pSSysAIChatAgentId) {
        this._set(DTOFIELD_PSSYSAICHATAGENTID, pSSysAIChatAgentId);
    }

    @JsonIgnore
    public String getPSSysAIChatAgentId() {
        Object objValue = this._get(DTOFIELD_PSSYSAICHATAGENTID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIChatAgentIdDirty() {
        return this._contains(DTOFIELD_PSSYSAICHATAGENTID);
    }

    @JsonIgnore
    public void resetPSSysAIChatAgentId() {
        this._reset(DTOFIELD_PSSYSAICHATAGENTID);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaichatagentid(String pSSysAIChatAgentId) {
        this.setPSSysAIChatAgentId(pSSysAIChatAgentId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaichatagentid(PSSysAIChatAgentDTO pSSysAIChatAgent) {
        if (pSSysAIChatAgent == null) {
            this.setPSSysAIChatAgentId(null);
            this.setPSSysAIChatAgentName(null);
        } else {
            this.setPSSysAIChatAgentId(pSSysAIChatAgent.getPSSysAIChatAgentId());
            this.setPSSysAIChatAgentName(pSSysAIChatAgent.getPSSysAIChatAgentName());
        }
        return this;
    }

    @JsonProperty(value="pssysaichatagentname")
    public void setPSSysAIChatAgentName(String pSSysAIChatAgentName) {
        this._set(DTOFIELD_PSSYSAICHATAGENTNAME, pSSysAIChatAgentName);
    }

    @JsonIgnore
    public String getPSSysAIChatAgentName() {
        Object objValue = this._get(DTOFIELD_PSSYSAICHATAGENTNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIChatAgentNameDirty() {
        return this._contains(DTOFIELD_PSSYSAICHATAGENTNAME);
    }

    @JsonIgnore
    public void resetPSSysAIChatAgentName() {
        this._reset(DTOFIELD_PSSYSAICHATAGENTNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaichatagentname(String pSSysAIChatAgentName) {
        this.setPSSysAIChatAgentName(pSSysAIChatAgentName);
        return this;
    }

    @JsonProperty(value="pssysaifactoryid")
    public void setPSSysAIFactoryId(String pSSysAIFactoryId) {
        this._set(DTOFIELD_PSSYSAIFACTORYID, pSSysAIFactoryId);
    }

    @JsonIgnore
    public String getPSSysAIFactoryId() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryIdDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryId() {
        this._reset(DTOFIELD_PSSYSAIFACTORYID);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaifactoryid(String pSSysAIFactoryId) {
        this.setPSSysAIFactoryId(pSSysAIFactoryId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaifactoryid(PSSysAIFactoryDTO pSSysAIFactory) {
        if (pSSysAIFactory == null) {
            this.setPSSysAIFactoryId(null);
            this.setPSSysAIFactoryName(null);
        } else {
            this.setPSSysAIFactoryId(pSSysAIFactory.getPSSysAIFactoryId());
            this.setPSSysAIFactoryName(pSSysAIFactory.getPSSysAIFactoryName());
        }
        return this;
    }

    @JsonProperty(value="pssysaifactoryname")
    public void setPSSysAIFactoryName(String pSSysAIFactoryName) {
        this._set(DTOFIELD_PSSYSAIFACTORYNAME, pSSysAIFactoryName);
    }

    @JsonIgnore
    public String getPSSysAIFactoryName() {
        Object objValue = this._get(DTOFIELD_PSSYSAIFACTORYNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysAIFactoryNameDirty() {
        return this._contains(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public void resetPSSysAIFactoryName() {
        this._reset(DTOFIELD_PSSYSAIFACTORYNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysaifactoryname(String pSSysAIFactoryName) {
        this.setPSSysAIFactoryName(pSSysAIFactoryName);
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
    public PSDEACModeDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSDEACModeDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="readpsdeopprivid")
    public void setReadPSDEOPPrivId(String readPSDEOPPrivId) {
        this._set(DTOFIELD_READPSDEOPPRIVID, readPSDEOPPrivId);
    }

    @JsonIgnore
    public String getReadPSDEOPPrivId() {
        Object objValue = this._get(DTOFIELD_READPSDEOPPRIVID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReadPSDEOPPrivIdDirty() {
        return this._contains(DTOFIELD_READPSDEOPPRIVID);
    }

    @JsonIgnore
    public void resetReadPSDEOPPrivId() {
        this._reset(DTOFIELD_READPSDEOPPRIVID);
    }

    @JsonIgnore
    public PSDEACModeDTO readpsdeopprivid(String readPSDEOPPrivId) {
        this.setReadPSDEOPPrivId(readPSDEOPPrivId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO readpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv) {
        if (pSDEOPPriv == null) {
            this.setReadPSDEOPPrivId(null);
            this.setReadPSDEOPPrivName(null);
        } else {
            this.setReadPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setReadPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    @JsonProperty(value="readpsdeopprivname")
    public void setReadPSDEOPPrivName(String readPSDEOPPrivName) {
        this._set(DTOFIELD_READPSDEOPPRIVNAME, readPSDEOPPrivName);
    }

    @JsonIgnore
    public String getReadPSDEOPPrivName() {
        Object objValue = this._get(DTOFIELD_READPSDEOPPRIVNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isReadPSDEOPPrivNameDirty() {
        return this._contains(DTOFIELD_READPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public void resetReadPSDEOPPrivName() {
        this._reset(DTOFIELD_READPSDEOPPRIVNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO readpsdeopprivname(String readPSDEOPPrivName) {
        this.setReadPSDEOPPrivName(readPSDEOPPrivName);
        return this;
    }

    @JsonProperty(value="textpsdefid")
    public void setTextPSDEFId(String textPSDEFId) {
        this._set(DTOFIELD_TEXTPSDEFID, textPSDEFId);
    }

    @JsonIgnore
    public String getTextPSDEFId() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFIdDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public void resetTextPSDEFId() {
        this._reset(DTOFIELD_TEXTPSDEFID);
    }

    @JsonIgnore
    public PSDEACModeDTO textpsdefid(String textPSDEFId) {
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO textpsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        } else {
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="textpsdefname")
    public void setTextPSDEFName(String textPSDEFName) {
        this._set(DTOFIELD_TEXTPSDEFNAME, textPSDEFName);
    }

    @JsonIgnore
    public String getTextPSDEFName() {
        Object objValue = this._get(DTOFIELD_TEXTPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTextPSDEFNameDirty() {
        return this._contains(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public void resetTextPSDEFName() {
        this._reset(DTOFIELD_TEXTPSDEFNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO textpsdefname(String textPSDEFName) {
        this.setTextPSDEFName(textPSDEFName);
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
    public PSDEACModeDTO updatedate(Timestamp updateDate) {
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
    public PSDEACModeDTO updateman(String updateMan) {
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
    public PSDEACModeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEACModeDTO usertag(String userTag) {
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
    public PSDEACModeDTO usertag2(String userTag2) {
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
    public PSDEACModeDTO usertag3(String userTag3) {
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
    public PSDEACModeDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="valuepsdefid")
    public void setValuePSDEFId(String valuePSDEFId) {
        this._set(DTOFIELD_VALUEPSDEFID, valuePSDEFId);
    }

    @JsonIgnore
    public String getValuePSDEFId() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFIdDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public void resetValuePSDEFId() {
        this._reset(DTOFIELD_VALUEPSDEFID);
    }

    @JsonIgnore
    public PSDEACModeDTO valuepsdefid(String valuePSDEFId) {
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSDEACModeDTO valuepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        } else {
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="valuepsdefname")
    public void setValuePSDEFName(String valuePSDEFName) {
        this._set(DTOFIELD_VALUEPSDEFNAME, valuePSDEFName);
    }

    @JsonIgnore
    public String getValuePSDEFName() {
        Object objValue = this._get(DTOFIELD_VALUEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isValuePSDEFNameDirty() {
        return this._contains(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public void resetValuePSDEFName() {
        this._reset(DTOFIELD_VALUEPSDEFNAME);
    }

    @JsonIgnore
    public PSDEACModeDTO valuepsdefname(String valuePSDEFName) {
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEACModeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEACModeId(strValue);
    }

    @JsonIgnore
    public PSDEACModeDTO id(String strValue) {
        this.setPSDEACModeId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEACModeItemDTO> getPSDEACModeItems() {
        Object list = this._get(DTOFIELD_PSDEACMODEITEMS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdeacmodeitems")
    public void setPSDEACModeItems(List<PSDEACModeItemDTO> psdeacmodeitems) {
        this._set(DTOFIELD_PSDEACMODEITEMS, psdeacmodeitems);
    }

    @JsonIgnore
    public List<PSDEACModeItemDTO> getPSDEACModeItemsIf() {
        Object list = this._get(DTOFIELD_PSDEACMODEITEMS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEACMODEITEMS, list);
        }
        return (List) list;
    }
}
