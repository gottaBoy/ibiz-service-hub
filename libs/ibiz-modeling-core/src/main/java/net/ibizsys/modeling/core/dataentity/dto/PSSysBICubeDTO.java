package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBISchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysBICubeDTO
extends PSModelDTOBase {
    public static final String FIELD_BICUBEOPTION = "BICUBEOPTION";
    protected static final String DTOFIELD_BICUBEOPTION = "bicubeoption";
    public static final String FIELD_BICUBEPARAMS = "BICUBEPARAMS";
    protected static final String DTOFIELD_BICUBEPARAMS = "bicubeparams";
    public static final String FIELD_BICUBETAG = "BICUBETAG";
    protected static final String DTOFIELD_BICUBETAG = "bicubetag";
    public static final String FIELD_BICUBETAG2 = "BICUBETAG2";
    protected static final String DTOFIELD_BICUBETAG2 = "bicubetag2";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DRILLDETAILPSDEVIEWID = "DRILLDETAILPSDEVIEWID";
    protected static final String DTOFIELD_DRILLDETAILPSDEVIEWID = "drilldetailpsdeviewid";
    public static final String FIELD_DRILLDETAILPSDEVIEWNAME = "DRILLDETAILPSDEVIEWNAME";
    protected static final String DTOFIELD_DRILLDETAILPSDEVIEWNAME = "drilldetailpsdeviewname";
    public static final String FIELD_DRILLDOWNPSDEVIEWID = "DRILLDOWNPSDEVIEWID";
    protected static final String DTOFIELD_DRILLDOWNPSDEVIEWID = "drilldownpsdeviewid";
    public static final String FIELD_DRILLDOWNPSDEVIEWNAME = "DRILLDOWNPSDEVIEWNAME";
    protected static final String DTOFIELD_DRILLDOWNPSDEVIEWNAME = "drilldownpsdeviewname";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZED";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_KEYPSDEFID = "KEYPSDEFID";
    protected static final String DTOFIELD_KEYPSDEFID = "keypsdefid";
    public static final String FIELD_KEYPSDEFNAME = "KEYPSDEFNAME";
    protected static final String DTOFIELD_KEYPSDEFNAME = "keypsdefname";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PORTLETPSDEUAGROUPID = "PORTLETPSDEUAGROUPID";
    protected static final String DTOFIELD_PORTLETPSDEUAGROUPID = "portletpsdeuagroupid";
    public static final String FIELD_PORTLETPSDEUAGROUPNAME = "PORTLETPSDEUAGROUPNAME";
    protected static final String DTOFIELD_PORTLETPSDEUAGROUPNAME = "portletpsdeuagroupname";
    public static final String FIELD_PSDEDATASETID = "PSDEDATASETID";
    protected static final String DTOFIELD_PSDEDATASETID = "psdedatasetid";
    public static final String FIELD_PSDEDATASETNAME = "PSDEDATASETNAME";
    protected static final String DTOFIELD_PSDEDATASETNAME = "psdedatasetname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSBICUBEID = "PSSYSBICUBEID";
    protected static final String DTOFIELD_PSSYSBICUBEID = "pssysbicubeid";
    public static final String FIELD_PSSYSBICUBENAME = "PSSYSBICUBENAME";
    protected static final String DTOFIELD_PSSYSBICUBENAME = "pssysbicubename";
    public static final String FIELD_PSSYSBISCHEMEID = "PSSYSBISCHEMEID";
    protected static final String DTOFIELD_PSSYSBISCHEMEID = "pssysbischemeid";
    public static final String FIELD_PSSYSBISCHEMENAME = "PSSYSBISCHEMENAME";
    protected static final String DTOFIELD_PSSYSBISCHEMENAME = "pssysbischemename";
    public static final String FIELD_PSSYSDYNAMODELID = "PSSYSDYNAMODELID";
    protected static final String DTOFIELD_PSSYSDYNAMODELID = "pssysdynamodelid";
    public static final String FIELD_PSSYSDYNAMODELNAME = "PSSYSDYNAMODELNAME";
    protected static final String DTOFIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";
    public static final String FIELD_PSSYSSFPLUGINID = "PSSYSSFPLUGINID";
    protected static final String DTOFIELD_PSSYSSFPLUGINID = "pssyssfpluginid";
    public static final String FIELD_PSSYSSFPLUGINNAME = "PSSYSSFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";
    public static final String FIELD_PSSYSUNIRESID = "PSSYSUNIRESID";
    protected static final String DTOFIELD_PSSYSUNIRESID = "pssysuniresid";
    public static final String FIELD_PSSYSUNIRESNAME = "PSSYSUNIRESNAME";
    protected static final String DTOFIELD_PSSYSUNIRESNAME = "pssysuniresname";
    public static final String FIELD_TYPEPSDEFID = "TYPEPSDEFID";
    protected static final String DTOFIELD_TYPEPSDEFID = "typepsdefid";
    public static final String FIELD_TYPEPSDEFNAME = "TYPEPSDEFNAME";
    protected static final String DTOFIELD_TYPEPSDEFNAME = "typepsdefname";
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

    @JsonProperty(value="bicubeoption")
    public void setBICubeOption(Integer bICubeOption) {
        this._set(DTOFIELD_BICUBEOPTION, bICubeOption);
    }

    @JsonIgnore
    public Integer getBICubeOption() {
        Object objValue = this._get(DTOFIELD_BICUBEOPTION);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isBICubeOptionDirty() {
        return this._contains(DTOFIELD_BICUBEOPTION);
    }

    @JsonIgnore
    public void resetBICubeOption() {
        this._reset(DTOFIELD_BICUBEOPTION);
    }

    @JsonIgnore
    public PSSysBICubeDTO bicubeoption(Integer bICubeOption) {
        this.setBICubeOption(bICubeOption);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO bicubeoption(PSModelEnums.BICubeOption[] bICubeOption) {
        if (bICubeOption == null || bICubeOption.length == 0) {
            this.setBICubeOption(null);
        } else {
            int _value = 0;
            for (PSModelEnums.BICubeOption _item : bICubeOption) {
                _value |= _item.value;
            }
            this.setBICubeOption(_value);
        }
        return this;
    }

    @JsonProperty(value="bicubeparams")
    public void setBICubeParams(String bICubeParams) {
        this._set(DTOFIELD_BICUBEPARAMS, bICubeParams);
    }

    @JsonIgnore
    public String getBICubeParams() {
        Object objValue = this._get(DTOFIELD_BICUBEPARAMS);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeParamsDirty() {
        return this._contains(DTOFIELD_BICUBEPARAMS);
    }

    @JsonIgnore
    public void resetBICubeParams() {
        this._reset(DTOFIELD_BICUBEPARAMS);
    }

    @JsonIgnore
    public PSSysBICubeDTO bicubeparams(String bICubeParams) {
        this.setBICubeParams(bICubeParams);
        return this;
    }

    @JsonProperty(value="bicubetag")
    public void setBICubeTag(String bICubeTag) {
        this._set(DTOFIELD_BICUBETAG, bICubeTag);
    }

    @JsonIgnore
    public String getBICubeTag() {
        Object objValue = this._get(DTOFIELD_BICUBETAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeTagDirty() {
        return this._contains(DTOFIELD_BICUBETAG);
    }

    @JsonIgnore
    public void resetBICubeTag() {
        this._reset(DTOFIELD_BICUBETAG);
    }

    @JsonIgnore
    public PSSysBICubeDTO bicubetag(String bICubeTag) {
        this.setBICubeTag(bICubeTag);
        return this;
    }

    @JsonProperty(value="bicubetag2")
    public void setBICubeTag2(String bICubeTag2) {
        this._set(DTOFIELD_BICUBETAG2, bICubeTag2);
    }

    @JsonIgnore
    public String getBICubeTag2() {
        Object objValue = this._get(DTOFIELD_BICUBETAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBICubeTag2Dirty() {
        return this._contains(DTOFIELD_BICUBETAG2);
    }

    @JsonIgnore
    public void resetBICubeTag2() {
        this._reset(DTOFIELD_BICUBETAG2);
    }

    @JsonIgnore
    public PSSysBICubeDTO bicubetag2(String bICubeTag2) {
        this.setBICubeTag2(bICubeTag2);
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
    public PSSysBICubeDTO codename(String codeName) {
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
    public PSSysBICubeDTO createdate(Timestamp createDate) {
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
    public PSSysBICubeDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="drilldetailpsdeviewid")
    public void setDrillDetailPSDEViewId(String drillDetailPSDEViewId) {
        this._set(DTOFIELD_DRILLDETAILPSDEVIEWID, drillDetailPSDEViewId);
    }

    @JsonIgnore
    public String getDrillDetailPSDEViewId() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailPSDEViewIdDirty() {
        return this._contains(DTOFIELD_DRILLDETAILPSDEVIEWID);
    }

    @JsonIgnore
    public void resetDrillDetailPSDEViewId() {
        this._reset(DTOFIELD_DRILLDETAILPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldetailpsdeviewid(String drillDetailPSDEViewId) {
        this.setDrillDetailPSDEViewId(drillDetailPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldetailpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setDrillDetailPSDEViewId(null);
            this.setDrillDetailPSDEViewName(null);
        } else {
            this.setDrillDetailPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDetailPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="drilldetailpsdeviewname")
    public void setDrillDetailPSDEViewName(String drillDetailPSDEViewName) {
        this._set(DTOFIELD_DRILLDETAILPSDEVIEWNAME, drillDetailPSDEViewName);
    }

    @JsonIgnore
    public String getDrillDetailPSDEViewName() {
        Object objValue = this._get(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDetailPSDEViewNameDirty() {
        return this._contains(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetDrillDetailPSDEViewName() {
        this._reset(DTOFIELD_DRILLDETAILPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldetailpsdeviewname(String drillDetailPSDEViewName) {
        this.setDrillDetailPSDEViewName(drillDetailPSDEViewName);
        return this;
    }

    @JsonProperty(value="drilldownpsdeviewid")
    public void setDrillDownPSDEViewId(String drillDownPSDEViewId) {
        this._set(DTOFIELD_DRILLDOWNPSDEVIEWID, drillDownPSDEViewId);
    }

    @JsonIgnore
    public String getDrillDownPSDEViewId() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNPSDEVIEWID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownPSDEViewIdDirty() {
        return this._contains(DTOFIELD_DRILLDOWNPSDEVIEWID);
    }

    @JsonIgnore
    public void resetDrillDownPSDEViewId() {
        this._reset(DTOFIELD_DRILLDOWNPSDEVIEWID);
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldownpsdeviewid(String drillDownPSDEViewId) {
        this.setDrillDownPSDEViewId(drillDownPSDEViewId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldownpsdeviewid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setDrillDownPSDEViewId(null);
            this.setDrillDownPSDEViewName(null);
        } else {
            this.setDrillDownPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDrillDownPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="drilldownpsdeviewname")
    public void setDrillDownPSDEViewName(String drillDownPSDEViewName) {
        this._set(DTOFIELD_DRILLDOWNPSDEVIEWNAME, drillDownPSDEViewName);
    }

    @JsonIgnore
    public String getDrillDownPSDEViewName() {
        Object objValue = this._get(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDrillDownPSDEViewNameDirty() {
        return this._contains(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
    }

    @JsonIgnore
    public void resetDrillDownPSDEViewName() {
        this._reset(DTOFIELD_DRILLDOWNPSDEVIEWNAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO drilldownpsdeviewname(String drillDownPSDEViewName) {
        this.setDrillDownPSDEViewName(drillDownPSDEViewName);
        return this;
    }

    @JsonProperty(value="enablecustomized")
    public void setEnableCustomized(Integer enableCustomized) {
        this._set(DTOFIELD_ENABLECUSTOMIZED, enableCustomized);
    }

    @JsonIgnore
    public Integer getEnableCustomized() {
        Object objValue = this._get(DTOFIELD_ENABLECUSTOMIZED);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEnableCustomizedDirty() {
        return this._contains(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public void resetEnableCustomized() {
        this._reset(DTOFIELD_ENABLECUSTOMIZED);
    }

    @JsonIgnore
    public PSSysBICubeDTO enablecustomized(Integer enableCustomized) {
        this.setEnableCustomized(enableCustomized);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO enablecustomized(Boolean enableCustomized) {
        if (enableCustomized == null) {
            this.setEnableCustomized(null);
        } else {
            this.setEnableCustomized(enableCustomized != false ? 1 : 0);
        }
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
    public PSSysBICubeDTO keypsdefid(String keyPSDEFId) {
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO keypsdefid(PSDEFieldDTO pSDEField) {
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
    public PSSysBICubeDTO keypsdefname(String keyPSDEFName) {
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
    public PSSysBICubeDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="portletpsdeuagroupid")
    public void setPortletPSDEUAGroupId(String portletPSDEUAGroupId) {
        this._set(DTOFIELD_PORTLETPSDEUAGROUPID, portletPSDEUAGroupId);
    }

    @JsonIgnore
    public String getPortletPSDEUAGroupId() {
        Object objValue = this._get(DTOFIELD_PORTLETPSDEUAGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletPSDEUAGroupIdDirty() {
        return this._contains(DTOFIELD_PORTLETPSDEUAGROUPID);
    }

    @JsonIgnore
    public void resetPortletPSDEUAGroupId() {
        this._reset(DTOFIELD_PORTLETPSDEUAGROUPID);
    }

    @JsonIgnore
    public PSSysBICubeDTO portletpsdeuagroupid(String portletPSDEUAGroupId) {
        this.setPortletPSDEUAGroupId(portletPSDEUAGroupId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO portletpsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup) {
        if (pSDEUAGroup == null) {
            this.setPortletPSDEUAGroupId(null);
            this.setPortletPSDEUAGroupName(null);
        } else {
            this.setPortletPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPortletPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    @JsonProperty(value="portletpsdeuagroupname")
    public void setPortletPSDEUAGroupName(String portletPSDEUAGroupName) {
        this._set(DTOFIELD_PORTLETPSDEUAGROUPNAME, portletPSDEUAGroupName);
    }

    @JsonIgnore
    public String getPortletPSDEUAGroupName() {
        Object objValue = this._get(DTOFIELD_PORTLETPSDEUAGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPortletPSDEUAGroupNameDirty() {
        return this._contains(DTOFIELD_PORTLETPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public void resetPortletPSDEUAGroupName() {
        this._reset(DTOFIELD_PORTLETPSDEUAGROUPNAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO portletpsdeuagroupname(String portletPSDEUAGroupName) {
        this.setPortletPSDEUAGroupName(portletPSDEUAGroupName);
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
    public PSSysBICubeDTO psdedatasetid(String pSDEDataSetId) {
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet) {
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
    public PSSysBICubeDTO psdedatasetname(String pSDEDataSetName) {
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
    public PSSysBICubeDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSSysBICubeDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssysbicubeid")
    public void setPSSysBICubeId(String pSSysBICubeId) {
        this._set(DTOFIELD_PSSYSBICUBEID, pSSysBICubeId);
    }

    @JsonIgnore
    public String getPSSysBICubeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public void resetPSSysBICubeId() {
        this._reset(DTOFIELD_PSSYSBICUBEID);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysbicubeid(String pSSysBICubeId) {
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    @JsonProperty(value="pssysbicubename")
    public void setPSSysBICubeName(String pSSysBICubeName) {
        this._set(DTOFIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }

    @JsonIgnore
    public String getPSSysBICubeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBICUBENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBICubeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public void resetPSSysBICubeName() {
        this._reset(DTOFIELD_PSSYSBICUBENAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysbicubename(String pSSysBICubeName) {
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysBICubeName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysBICubeName(strName);
    }

    @JsonIgnore
    public PSSysBICubeDTO name(String strName) {
        this.setPSSysBICubeName(strName);
        return this;
    }

    @JsonProperty(value="pssysbischemeid")
    public void setPSSysBISchemeId(String pSSysBISchemeId) {
        this._set(DTOFIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }

    @JsonIgnore
    public String getPSSysBISchemeId() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public void resetPSSysBISchemeId() {
        this._reset(DTOFIELD_PSSYSBISCHEMEID);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysbischemeid(String pSSysBISchemeId) {
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme) {
        if (pSSysBIScheme == null) {
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        } else {
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    @JsonProperty(value="pssysbischemename")
    public void setPSSysBISchemeName(String pSSysBISchemeName) {
        this._set(DTOFIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }

    @JsonIgnore
    public String getPSSysBISchemeName() {
        Object objValue = this._get(DTOFIELD_PSSYSBISCHEMENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty() {
        return this._contains(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public void resetPSSysBISchemeName() {
        this._reset(DTOFIELD_PSSYSBISCHEMENAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysbischemename(String pSSysBISchemeName) {
        this.setPSSysBISchemeName(pSSysBISchemeName);
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
    public PSSysBICubeDTO pssysdynamodelid(String pSSysDynaModelId) {
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel) {
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
    public PSSysBICubeDTO pssysdynamodelname(String pSSysDynaModelName) {
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysBICubeDTO pssyssfpluginid(String pSSysSFPluginId) {
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin) {
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
    public PSSysBICubeDTO pssyssfpluginname(String pSSysSFPluginName) {
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonProperty(value="pssysuniresid")
    public void setPSSysUniResId(String pSSysUniResId) {
        this._set(DTOFIELD_PSSYSUNIRESID, pSSysUniResId);
    }

    @JsonIgnore
    public String getPSSysUniResId() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResIdDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public void resetPSSysUniResId() {
        this._reset(DTOFIELD_PSSYSUNIRESID);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysuniresid(String pSSysUniResId) {
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysuniresid(PSSysUniResDTO pSSysUniRes) {
        if (pSSysUniRes == null) {
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        } else {
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    @JsonProperty(value="pssysuniresname")
    public void setPSSysUniResName(String pSSysUniResName) {
        this._set(DTOFIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }

    @JsonIgnore
    public String getPSSysUniResName() {
        Object objValue = this._get(DTOFIELD_PSSYSUNIRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysUniResNameDirty() {
        return this._contains(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public void resetPSSysUniResName() {
        this._reset(DTOFIELD_PSSYSUNIRESNAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO pssysuniresname(String pSSysUniResName) {
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    @JsonProperty(value="typepsdefid")
    public void setTypePSDEFId(String typePSDEFId) {
        this._set(DTOFIELD_TYPEPSDEFID, typePSDEFId);
    }

    @JsonIgnore
    public String getTypePSDEFId() {
        Object objValue = this._get(DTOFIELD_TYPEPSDEFID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypePSDEFIdDirty() {
        return this._contains(DTOFIELD_TYPEPSDEFID);
    }

    @JsonIgnore
    public void resetTypePSDEFId() {
        this._reset(DTOFIELD_TYPEPSDEFID);
    }

    @JsonIgnore
    public PSSysBICubeDTO typepsdefid(String typePSDEFId) {
        this.setTypePSDEFId(typePSDEFId);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO typepsdefid(PSDEFieldDTO pSDEField) {
        if (pSDEField == null) {
            this.setTypePSDEFId(null);
            this.setTypePSDEFName(null);
        } else {
            this.setTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    @JsonProperty(value="typepsdefname")
    public void setTypePSDEFName(String typePSDEFName) {
        this._set(DTOFIELD_TYPEPSDEFNAME, typePSDEFName);
    }

    @JsonIgnore
    public String getTypePSDEFName() {
        Object objValue = this._get(DTOFIELD_TYPEPSDEFNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isTypePSDEFNameDirty() {
        return this._contains(DTOFIELD_TYPEPSDEFNAME);
    }

    @JsonIgnore
    public void resetTypePSDEFName() {
        this._reset(DTOFIELD_TYPEPSDEFNAME);
    }

    @JsonIgnore
    public PSSysBICubeDTO typepsdefname(String typePSDEFName) {
        this.setTypePSDEFName(typePSDEFName);
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
    public PSSysBICubeDTO updatedate(Timestamp updateDate) {
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
    public PSSysBICubeDTO updateman(String updateMan) {
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
    public PSSysBICubeDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysBICubeDTO usertag(String userTag) {
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
    public PSSysBICubeDTO usertag2(String userTag2) {
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
    public PSSysBICubeDTO usertag3(String userTag3) {
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
    public PSSysBICubeDTO usertag4(String userTag4) {
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
    public PSSysBICubeDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSSysBICubeDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysBICubeId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysBICubeId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeDTO id(String strValue) {
        this.setPSSysBICubeId(strValue);
        return this;
    }
}
