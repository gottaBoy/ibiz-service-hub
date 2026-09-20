/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonFormat
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  net.ibizsys.model.PSModelEnums$ModelUserCat
 */
package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCounterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFDEDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSDEDataRelationDTO
extends PSModelDTOBase {
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_DRTAG = "DRTAG";
    protected static final String DTOFIELD_DRTAG = "drtag";
    public static final String FIELD_DRTAG2 = "DRTAG2";
    protected static final String DTOFIELD_DRTAG2 = "drtag2";
    public static final String FIELD_DRTAG3 = "DRTAG3";
    protected static final String DTOFIELD_DRTAG3 = "drtag3";
    public static final String FIELD_DRTAG4 = "DRTAG4";
    protected static final String DTOFIELD_DRTAG4 = "drtag4";
    public static final String FIELD_ENABLECUSTOMIZED = "ENABLECUSTOMIZED";
    protected static final String DTOFIELD_ENABLECUSTOMIZED = "enablecustomized";
    public static final String FIELD_FORMCAPPSLANRESID = "FORMCAPPSLANRESID";
    protected static final String DTOFIELD_FORMCAPPSLANRESID = "formcappslanresid";
    public static final String FIELD_FORMCAPPSLANRESNAME = "FORMCAPPSLANRESNAME";
    protected static final String DTOFIELD_FORMCAPPSLANRESNAME = "formcappslanresname";
    public static final String FIELD_FORMCAPTION = "FORMCAPTION";
    protected static final String DTOFIELD_FORMCAPTION = "formcaption";
    public static final String FIELD_FORMPSDEVIEWBASEID = "FORMPSDEVIEWBASEID";
    protected static final String DTOFIELD_FORMPSDEVIEWBASEID = "formpsdeviewbaseid";
    public static final String FIELD_FORMPSDEVIEWBASENAME = "FORMPSDEVIEWBASENAME";
    protected static final String DTOFIELD_FORMPSDEVIEWBASENAME = "formpsdeviewbasename";
    public static final String FIELD_FORMPSSYSIMAGEID = "FORMPSSYSIMAGEID";
    protected static final String DTOFIELD_FORMPSSYSIMAGEID = "formpssysimageid";
    public static final String FIELD_FORMPSSYSIMAGENAME = "FORMPSSYSIMAGENAME";
    protected static final String DTOFIELD_FORMPSSYSIMAGENAME = "formpssysimagename";
    public static final String FIELD_HIDEEDITITEM = "HIDEEDITITEM";
    protected static final String DTOFIELD_HIDEEDITITEM = "hideedititem";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_PSCTRLLOGICGROUPID = "PSCTRLLOGICGROUPID";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";
    public static final String FIELD_PSCTRLLOGICGROUPNAME = "PSCTRLLOGICGROUPNAME";
    protected static final String DTOFIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";
    public static final String FIELD_PSDEDATARELATIONID = "PSDEDATARELATIONID";
    protected static final String DTOFIELD_PSDEDATARELATIONID = "psdedatarelationid";
    public static final String FIELD_PSDEDATARELATIONNAME = "PSDEDATARELATIONNAME";
    protected static final String DTOFIELD_PSDEDATARELATIONNAME = "psdedatarelationname";
    public static final String FIELD_PSDEID = "PSDEID";
    protected static final String DTOFIELD_PSDEID = "psdeid";
    public static final String FIELD_PSDENAME = "PSDENAME";
    protected static final String DTOFIELD_PSDENAME = "psdename";
    public static final String FIELD_PSSYSCOUNTERID = "PSSYSCOUNTERID";
    protected static final String DTOFIELD_PSSYSCOUNTERID = "pssyscounterid";
    public static final String FIELD_PSSYSCOUNTERNAME = "PSSYSCOUNTERNAME";
    protected static final String DTOFIELD_PSSYSCOUNTERNAME = "pssyscountername";
    public static final String FIELD_PSWFDEID = "PSWFDEID";
    protected static final String DTOFIELD_PSWFDEID = "pswfdeid";
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
    public static final String DTOFIELD_PSDEDRDETAILS = "psdedrdetails";

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
    public PSDEDataRelationDTO codename(String codeName) {
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
    public PSDEDataRelationDTO createdate(Timestamp createDate) {
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
    public PSDEDataRelationDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="drtag")
    public void setDRTag(String dRTag) {
        this._set(DTOFIELD_DRTAG, dRTag);
    }

    @JsonIgnore
    public String getDRTag() {
        Object objValue = this._get(DTOFIELD_DRTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDRTagDirty() {
        return this._contains(DTOFIELD_DRTAG);
    }

    @JsonIgnore
    public void resetDRTag() {
        this._reset(DTOFIELD_DRTAG);
    }

    @JsonIgnore
    public PSDEDataRelationDTO drtag(String dRTag) {
        this.setDRTag(dRTag);
        return this;
    }

    @JsonProperty(value="drtag2")
    public void setDRTag2(String dRTag2) {
        this._set(DTOFIELD_DRTAG2, dRTag2);
    }

    @JsonIgnore
    public String getDRTag2() {
        Object objValue = this._get(DTOFIELD_DRTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDRTag2Dirty() {
        return this._contains(DTOFIELD_DRTAG2);
    }

    @JsonIgnore
    public void resetDRTag2() {
        this._reset(DTOFIELD_DRTAG2);
    }

    @JsonIgnore
    public PSDEDataRelationDTO drtag2(String dRTag2) {
        this.setDRTag2(dRTag2);
        return this;
    }

    @JsonProperty(value="drtag3")
    public void setDRTag3(String dRTag3) {
        this._set(DTOFIELD_DRTAG3, dRTag3);
    }

    @JsonIgnore
    public String getDRTag3() {
        Object objValue = this._get(DTOFIELD_DRTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDRTag3Dirty() {
        return this._contains(DTOFIELD_DRTAG3);
    }

    @JsonIgnore
    public void resetDRTag3() {
        this._reset(DTOFIELD_DRTAG3);
    }

    @JsonIgnore
    public PSDEDataRelationDTO drtag3(String dRTag3) {
        this.setDRTag3(dRTag3);
        return this;
    }

    @JsonProperty(value="drtag4")
    public void setDRTag4(String dRTag4) {
        this._set(DTOFIELD_DRTAG4, dRTag4);
    }

    @JsonIgnore
    public String getDRTag4() {
        Object objValue = this._get(DTOFIELD_DRTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isDRTag4Dirty() {
        return this._contains(DTOFIELD_DRTAG4);
    }

    @JsonIgnore
    public void resetDRTag4() {
        this._reset(DTOFIELD_DRTAG4);
    }

    @JsonIgnore
    public PSDEDataRelationDTO drtag4(String dRTag4) {
        this.setDRTag4(dRTag4);
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
    public PSDEDataRelationDTO enablecustomized(Integer enableCustomized) {
        this.setEnableCustomized(enableCustomized);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO enablecustomized(Boolean enableCustomized) {
        if (enableCustomized == null) {
            this.setEnableCustomized(null);
        } else {
            this.setEnableCustomized(enableCustomized != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="formcappslanresid")
    public void setFormCapPSLanResId(String formCapPSLanResId) {
        this._set(DTOFIELD_FORMCAPPSLANRESID, formCapPSLanResId);
    }

    @JsonIgnore
    public String getFormCapPSLanResId() {
        Object objValue = this._get(DTOFIELD_FORMCAPPSLANRESID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCapPSLanResIdDirty() {
        return this._contains(DTOFIELD_FORMCAPPSLANRESID);
    }

    @JsonIgnore
    public void resetFormCapPSLanResId() {
        this._reset(DTOFIELD_FORMCAPPSLANRESID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formcappslanresid(String formCapPSLanResId) {
        this.setFormCapPSLanResId(formCapPSLanResId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO formcappslanresid(PSLanguageResDTO pSLanguageRes) {
        if (pSLanguageRes == null) {
            this.setFormCapPSLanResId(null);
            this.setFormCapPSLanResName(null);
        } else {
            this.setFormCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setFormCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    @JsonProperty(value="formcappslanresname")
    public void setFormCapPSLanResName(String formCapPSLanResName) {
        this._set(DTOFIELD_FORMCAPPSLANRESNAME, formCapPSLanResName);
    }

    @JsonIgnore
    public String getFormCapPSLanResName() {
        Object objValue = this._get(DTOFIELD_FORMCAPPSLANRESNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCapPSLanResNameDirty() {
        return this._contains(DTOFIELD_FORMCAPPSLANRESNAME);
    }

    @JsonIgnore
    public void resetFormCapPSLanResName() {
        this._reset(DTOFIELD_FORMCAPPSLANRESNAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formcappslanresname(String formCapPSLanResName) {
        this.setFormCapPSLanResName(formCapPSLanResName);
        return this;
    }

    @JsonProperty(value="formcaption")
    public void setFormCaption(String formCaption) {
        this._set(DTOFIELD_FORMCAPTION, formCaption);
    }

    @JsonIgnore
    public String getFormCaption() {
        Object objValue = this._get(DTOFIELD_FORMCAPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormCaptionDirty() {
        return this._contains(DTOFIELD_FORMCAPTION);
    }

    @JsonIgnore
    public void resetFormCaption() {
        this._reset(DTOFIELD_FORMCAPTION);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formcaption(String formCaption) {
        this.setFormCaption(formCaption);
        return this;
    }

    @JsonProperty(value="formpsdeviewbaseid")
    public void setFormPSDEViewBaseId(String formPSDEViewBaseId) {
        this._set(DTOFIELD_FORMPSDEVIEWBASEID, formPSDEViewBaseId);
    }

    @JsonIgnore
    public String getFormPSDEViewBaseId() {
        Object objValue = this._get(DTOFIELD_FORMPSDEVIEWBASEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormPSDEViewBaseIdDirty() {
        return this._contains(DTOFIELD_FORMPSDEVIEWBASEID);
    }

    @JsonIgnore
    public void resetFormPSDEViewBaseId() {
        this._reset(DTOFIELD_FORMPSDEVIEWBASEID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpsdeviewbaseid(String formPSDEViewBaseId) {
        this.setFormPSDEViewBaseId(formPSDEViewBaseId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpsdeviewbaseid(PSDEViewBaseDTO pSDEViewBase) {
        if (pSDEViewBase == null) {
            this.setFormPSDEViewBaseId(null);
            this.setFormPSDEViewBaseName(null);
        } else {
            this.setFormPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setFormPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    @JsonProperty(value="formpsdeviewbasename")
    public void setFormPSDEViewBaseName(String formPSDEViewBaseName) {
        this._set(DTOFIELD_FORMPSDEVIEWBASENAME, formPSDEViewBaseName);
    }

    @JsonIgnore
    public String getFormPSDEViewBaseName() {
        Object objValue = this._get(DTOFIELD_FORMPSDEVIEWBASENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormPSDEViewBaseNameDirty() {
        return this._contains(DTOFIELD_FORMPSDEVIEWBASENAME);
    }

    @JsonIgnore
    public void resetFormPSDEViewBaseName() {
        this._reset(DTOFIELD_FORMPSDEVIEWBASENAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpsdeviewbasename(String formPSDEViewBaseName) {
        this.setFormPSDEViewBaseName(formPSDEViewBaseName);
        return this;
    }

    @JsonProperty(value="formpssysimageid")
    public void setFormPSSysImageId(String formPSSysImageId) {
        this._set(DTOFIELD_FORMPSSYSIMAGEID, formPSSysImageId);
    }

    @JsonIgnore
    public String getFormPSSysImageId() {
        Object objValue = this._get(DTOFIELD_FORMPSSYSIMAGEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormPSSysImageIdDirty() {
        return this._contains(DTOFIELD_FORMPSSYSIMAGEID);
    }

    @JsonIgnore
    public void resetFormPSSysImageId() {
        this._reset(DTOFIELD_FORMPSSYSIMAGEID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpssysimageid(String formPSSysImageId) {
        this.setFormPSSysImageId(formPSSysImageId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpssysimageid(PSSysImageDTO pSSysImage) {
        if (pSSysImage == null) {
            this.setFormPSSysImageId(null);
            this.setFormPSSysImageName(null);
        } else {
            this.setFormPSSysImageId(pSSysImage.getPSSysImageId());
            this.setFormPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    @JsonProperty(value="formpssysimagename")
    public void setFormPSSysImageName(String formPSSysImageName) {
        this._set(DTOFIELD_FORMPSSYSIMAGENAME, formPSSysImageName);
    }

    @JsonIgnore
    public String getFormPSSysImageName() {
        Object objValue = this._get(DTOFIELD_FORMPSSYSIMAGENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFormPSSysImageNameDirty() {
        return this._contains(DTOFIELD_FORMPSSYSIMAGENAME);
    }

    @JsonIgnore
    public void resetFormPSSysImageName() {
        this._reset(DTOFIELD_FORMPSSYSIMAGENAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO formpssysimagename(String formPSSysImageName) {
        this.setFormPSSysImageName(formPSSysImageName);
        return this;
    }

    @JsonProperty(value="hideedititem")
    public void setHideEditItem(Integer hideEditItem) {
        this._set(DTOFIELD_HIDEEDITITEM, hideEditItem);
    }

    @JsonIgnore
    public Integer getHideEditItem() {
        Object objValue = this._get(DTOFIELD_HIDEEDITITEM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isHideEditItemDirty() {
        return this._contains(DTOFIELD_HIDEEDITITEM);
    }

    @JsonIgnore
    public void resetHideEditItem() {
        this._reset(DTOFIELD_HIDEEDITITEM);
    }

    @JsonIgnore
    public PSDEDataRelationDTO hideedititem(Integer hideEditItem) {
        this.setHideEditItem(hideEditItem);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO hideedititem(Boolean hideEditItem) {
        if (hideEditItem == null) {
            this.setHideEditItem(null);
        } else {
            this.setHideEditItem(hideEditItem != false ? 1 : 0);
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
    public PSDEDataRelationDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="psctrllogicgroupid")
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupId() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupId() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO psctrllogicgroupid(String pSCtrlLogicGroupId) {
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup) {
        if (pSCtrlLogicGroup == null) {
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        } else {
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    @JsonProperty(value="psctrllogicgroupname")
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName) {
        this._set(DTOFIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }

    @JsonIgnore
    public String getPSCtrlLogicGroupName() {
        Object objValue = this._get(DTOFIELD_PSCTRLLOGICGROUPNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty() {
        return this._contains(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public void resetPSCtrlLogicGroupName() {
        this._reset(DTOFIELD_PSCTRLLOGICGROUPNAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO psctrllogicgroupname(String pSCtrlLogicGroupName) {
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    @JsonProperty(value="psdedatarelationid")
    public void setPSDEDataRelationId(String pSDEDataRelationId) {
        this._set(DTOFIELD_PSDEDATARELATIONID, pSDEDataRelationId);
    }

    @JsonIgnore
    public String getPSDEDataRelationId() {
        Object objValue = this._get(DTOFIELD_PSDEDATARELATIONID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataRelationIdDirty() {
        return this._contains(DTOFIELD_PSDEDATARELATIONID);
    }

    @JsonIgnore
    public void resetPSDEDataRelationId() {
        this._reset(DTOFIELD_PSDEDATARELATIONID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO psdedatarelationid(String pSDEDataRelationId) {
        this.setPSDEDataRelationId(pSDEDataRelationId);
        return this;
    }

    @JsonProperty(value="psdedatarelationname")
    public void setPSDEDataRelationName(String pSDEDataRelationName) {
        this._set(DTOFIELD_PSDEDATARELATIONNAME, pSDEDataRelationName);
    }

    @JsonIgnore
    public String getPSDEDataRelationName() {
        Object objValue = this._get(DTOFIELD_PSDEDATARELATIONNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSDEDataRelationNameDirty() {
        return this._contains(DTOFIELD_PSDEDATARELATIONNAME);
    }

    @JsonIgnore
    public void resetPSDEDataRelationName() {
        this._reset(DTOFIELD_PSDEDATARELATIONNAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO psdedatarelationname(String pSDEDataRelationName) {
        this.setPSDEDataRelationName(pSDEDataRelationName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSDEDataRelationName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSDEDataRelationName(strName);
    }

    @JsonIgnore
    public PSDEDataRelationDTO name(String strName) {
        this.setPSDEDataRelationName(strName);
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
    public PSDEDataRelationDTO psdeid(String pSDEId) {
        this.setPSDEId(pSDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO psdeid(PSDataEntityDTO pSDataEntity) {
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
    public PSDEDataRelationDTO psdename(String pSDEName) {
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonProperty(value="pssyscounterid")
    public void setPSSysCounterId(String pSSysCounterId) {
        this._set(DTOFIELD_PSSYSCOUNTERID, pSSysCounterId);
    }

    @JsonIgnore
    public String getPSSysCounterId() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterIdDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public void resetPSSysCounterId() {
        this._reset(DTOFIELD_PSSYSCOUNTERID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO pssyscounterid(String pSSysCounterId) {
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO pssyscounterid(PSSysCounterDTO pSSysCounter) {
        if (pSSysCounter == null) {
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        } else {
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    @JsonProperty(value="pssyscountername")
    public void setPSSysCounterName(String pSSysCounterName) {
        this._set(DTOFIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }

    @JsonIgnore
    public String getPSSysCounterName() {
        Object objValue = this._get(DTOFIELD_PSSYSCOUNTERNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCounterNameDirty() {
        return this._contains(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public void resetPSSysCounterName() {
        this._reset(DTOFIELD_PSSYSCOUNTERNAME);
    }

    @JsonIgnore
    public PSDEDataRelationDTO pssyscountername(String pSSysCounterName) {
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    @JsonProperty(value="pswfdeid")
    public void setPSWFDEId(String pSWFDEId) {
        this._set(DTOFIELD_PSWFDEID, pSWFDEId);
    }

    @JsonIgnore
    public String getPSWFDEId() {
        Object objValue = this._get(DTOFIELD_PSWFDEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSWFDEIdDirty() {
        return this._contains(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public void resetPSWFDEId() {
        this._reset(DTOFIELD_PSWFDEID);
    }

    @JsonIgnore
    public PSDEDataRelationDTO pswfdeid(String pSWFDEId) {
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO pswfdeid(PSWFDEDTO pSWFDE) {
        if (pSWFDE == null) {
            this.setPSWFDEId(null);
        } else {
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
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
    public PSDEDataRelationDTO updatedate(Timestamp updateDate) {
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
    public PSDEDataRelationDTO updateman(String updateMan) {
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
    public PSDEDataRelationDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSDEDataRelationDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSDEDataRelationDTO usertag(String userTag) {
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
    public PSDEDataRelationDTO usertag2(String userTag2) {
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
    public PSDEDataRelationDTO usertag3(String userTag3) {
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
    public PSDEDataRelationDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSDEDataRelationId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSDEDataRelationId(strValue);
    }

    @JsonIgnore
    public PSDEDataRelationDTO id(String strValue) {
        this.setPSDEDataRelationId(strValue);
        return this;
    }

    @JsonIgnore
    public List<PSDEDRDetailDTO> getPSDEDRDetails() {
        Object list = this._get(DTOFIELD_PSDEDRDETAILS);
        if (list instanceof List) {
            return (List)list;
        }
        return null;
    }

    @JsonProperty(value="psdedrdetails")
    public void setPSDEDRDetails(List<PSDEDRDetailDTO> psdedrdetails) {
        this._set(DTOFIELD_PSDEDRDETAILS, psdedrdetails);
    }

    @JsonIgnore
    public List<PSDEDRDetailDTO> getPSDEDRDetailsIf() {
        Object list = this._get(DTOFIELD_PSDEDRDETAILS);
        if (!(list instanceof List)) {
            list = new ArrayList();
            this._set(DTOFIELD_PSDEDRDETAILS, list);
        }
        return (List) list;
    }
}
